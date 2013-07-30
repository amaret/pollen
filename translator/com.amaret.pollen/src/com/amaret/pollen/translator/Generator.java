/**
 * 
 */
package com.amaret.pollen.translator;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;

import com.amaret.pollen.parser.ImportNode;
import com.amaret.pollen.parser.ParseUnit;
import com.amaret.pollen.parser.UnitNode;
import com.amaret.pollen.script.Script;
import com.amaret.pollen.script.Value;
import com.amaret.pollen.target.ITarget;

/**
 * @author lucidbee
 *
 */
public class Generator {

	private UnitNode curUnit;
	boolean nestedClass = false;
	private UnitNode mainUnit;
	private static String uname;
	private String jsname;
	private String cname;
    private ITarget target;
	final Formatter fmt = new Formatter();
	final Auxiliary aux = new Auxiliary(this);
	public boolean isNestedClass() {
		return nestedClass;
	}

	public void setNestedClass(boolean nestedClass) {
		this.nestedClass = nestedClass;
	}

	
	/**
	 * @param unit The pollen file
	 * @param units All dependent units
	 */
	public void genUnits(UnitNode unit, HashMap<String, UnitNode> units) throws Exception {
		
		for (UnitNode u : units.values()) {
			if (!u.isVoid()) {
				u.getUnitType().setMetaQualName();
			}
		}

		for (UnitNode u : units.values()) {
			
			if (u.isVoid())
				continue;

			if (ParseUnit.isDebugMode()) {	
				System.out.println("GENUNIT " + u.getQualName());
			}
			setupUnit(u);
			genHeader();
			genBody();
			genJScript();
			genInfo();
		}
		
	}

	public UnitNode getMainUnit() {
		return mainUnit;
	}

	public String uname() {
		return uname;
	}

	public String cname() {
		return cname;
	}
	public UnitNode curUnit() {
		return curUnit;
	}


	/**
	 * @param unit
	 */
	void setupUnit(UnitNode unit) {
		ParseUnit.current().setCurrUnitNode(unit);
        curUnit = unit;
        uname = unit.getName().getText();
        cname = unit.getPkgName().getText().replace('.', '_') + '_'  + uname + '_';	
        jsname = unit.getPkgName().getText() + '.'  + uname;	
        
	}

	public String jsname() {
		return jsname;
	}

	/**
	 * 
	 */
	private static void genInfo() {
		// TODO Auto-generated method stub
		
	}
    private void genJScript() throws Exception {
    	if (!curUnit.isProtocol()) {
        //if (!curUnit.isComposition() && !curUnit.isProtocol()) {
        //if (curUnit.isModule() || curUnit.isClass() || curUnit.isEnum()) {
            File file = ParseUnit.cacheFile(curUnit.getQualName(), ".js");
            fmt.reset();
            UnitJScript unitJScript = new UnitJScript(this);
            unitJScript.generate(curUnit);
            writeFile(file, fmt.toBytes());
        }
    }
    void findUses(UnitNode unit, Set<UnitNode> uses) {
        for (ImportNode imp : unit.getImports()) {
        	if (imp.getUnit() != null)
        		findUses(imp.getUnit(), uses);
        }
        uses.add(unit);
    }
    
    @SuppressWarnings("unchecked")
    private ITarget loadTarget() throws Exception {
        ITarget targ = null;
        try {
            String clsName = ParseUnit.current().getProperty(ITarget.P_CLASS);
            Class c = Class.forName(clsName);
            targ = (ITarget) c.newInstance();
        }
        catch (Exception e) {
            ParseUnit.current().reportFailure(e);
        }
        return targ;
    }



    public void genProg(UnitNode unit) throws Exception {

        if (!unit.isModule()) {
            return;
        }
        mainUnit = unit;

        ParseUnit cur  = ParseUnit.current();
        Set<UnitNode> uses = new LinkedHashSet<UnitNode>();
        findUses(unit, uses);

        File jsFile = ParseUnit.cacheFile(unit.getQualName(), "-prog.js");
        File progFile = ParseUnit.cacheFile(unit.getQualName(), "-prog.c");
        File outFile = ParseUnit.cacheFile(unit.getQualName(), "-prog.out");

        boolean missingRun = unit.getFcnMap().get(ParseUnit.INTRINSIC_PREFIX + "run") == null;
        boolean noProg = unit.isHost() || missingRun;
        if (noProg) {
        	if (missingRun)
        		cur.reportError(unit, "Missing \'pollen.run\' definition in main module");
        	if (unit.isHost())	
        		cur.reportError(unit, "Main module is host only");
        }

        setupUnit(unit);
        fmt.reset();
        ProgJScript jsProg = new ProgJScript(this);
        jsProg.generate(uses, unit);
        writeFile(jsFile, fmt.toBytes(), true);
        Value.Arr unitsArr = (Value.Arr) Script.execute(fmt.toString(), "$units", jsFile.getAbsolutePath());

        fmt.reset();
        ProgCCode targProg = new ProgCCode(this);
        targProg.generate(unitsArr);
        writeFile(progFile, fmt.toBytes(), true);

        if (cur.getErrorCount() > 0) {
            return;
        }
        
        target = this.loadTarget();
        target.compile(progFile);
    }


	/**
	 * 
	 */
	private void genBody() throws Exception {
        if ((curUnit.isModule() || curUnit.isClass()) && !curUnit.isHost()) {
            File file = ParseUnit.cacheFile(curUnit.getQualName(), ".c");
            fmt.reset();
            UnitBody unitBody = new UnitBody(this);
            unitBody.generate(curUnit);
            writeFile(file, fmt.toBytes());
        }				
	}
	

	/**
	 * 
	 */
	private void genHeader() throws Exception {
		if ((curUnit.isModule() || curUnit.isClass() || curUnit.isEnum())
				&& !curUnit.isHost()) {
			File file = ParseUnit.cacheFile(curUnit.getQualName(), ".h");
			fmt.reset();
			UnitHeader unitHeader = new UnitHeader(this);
			unitHeader.generate(curUnit);
			writeFile(file, fmt.toBytes());
		}

	}
    private void writeFile(File file, byte[] newBytes) throws Exception {
        writeFile(file, newBytes, false);
    }
    /**
     * If force is true, writes newBytes to file and closes file. 
     * Else reads newBytes to file (as an inputStream) and closes Stream.
     * 
     * @param file
     * @param newBytes
     * @param force
     * @throws Exception
     */
    private void writeFile(File file, byte[] newBytes, boolean force) throws Exception {
        if (!force && file.exists()) {
            byte[] curBytes = null;
            FileInputStream inStr = new FileInputStream(file);
            curBytes = new byte[(int) file.length()];
            inStr.read(curBytes);
            inStr.close();
            if (Arrays.equals(curBytes, newBytes)) {
                return;
            }
        }
        FileOutputStream outStr = new FileOutputStream(file);
        outStr.write(newBytes);
        outStr.close();
    }

}
