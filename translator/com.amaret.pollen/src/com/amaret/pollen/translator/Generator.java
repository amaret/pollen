/**
 * 
 */
package com.amaret.pollen.translator;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;

import com.amaret.pollen.parser.DeclNode;
import com.amaret.pollen.parser.Flags;
import com.amaret.pollen.parser.IOutputName;
import com.amaret.pollen.parser.IOutputQualifiedName;
import com.amaret.pollen.parser.IScope;
import com.amaret.pollen.parser.ISymbolNode;
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
	private DeclNode.Class nestedClass = null;
	private UnitNode mainUnit;
	private static String uname;
	private String uname_host;
	private String uname_target;
    private ITarget target;
	private final Formatter fmt = new Formatter();
	final Auxiliary aux = new Auxiliary(this);
	
	public Auxiliary getAux() {
		return aux;
	}

	public boolean isTargetC() {
		return true;
	}
	
	public Generator() {}
	public boolean isNestedClass() {
		return nestedClass != null;
	}
	
	public boolean isHost() {
		return aux.isHost();
	}
	public void setNestedClass(DeclNode.Class cls) {
		nestedClass = cls;
	}
	public DeclNode.Class getNestedClass() {
		return nestedClass;
	}

	public String getOutputName(Object s, IScope sc, EnumSet<Flags> flags) {
		if (s instanceof IOutputName) {
			if (aux.isHost()) {
				return ((IOutputName)s).getOutputNameHost(this, sc, flags);
			}
			else {
				return ((IOutputName)s).getOutputNameTarget(this, sc, flags);
			}
		}
		ParseUnit.current().reportError(curUnit, "Generator.getOutputName(): unimplemented feature");
		return null;
	}

	public String getOutputQName(Object s, ISymbolNode n, IScope is, EnumSet<Flags> flags) {
		if (s instanceof IOutputQualifiedName) {
			if (aux.isHost()) {
				return ((IOutputQualifiedName)s).getOutputQNameHost(this, n, is, flags);
			}
			else {
				return ((IOutputQualifiedName)s).getOutputQNameTarget(this, n, is, flags);
			}
		}
		ParseUnit.current().reportError(curUnit, "Generator.getOutputQName(): unimplemented feature");
		return null;
	}
	
	/**
	 * @param main The pollen file
	 * @param units All dependent units
	 */
	public void genUnits(UnitNode main, HashMap<String, UnitNode> units) throws Exception {
		
		for (UnitNode u : units.values()) {
			if (!u.isVoid()) {
				u.getUnitType().setMetaQualName();
			}
		}

		for (UnitNode u : units.values()) {
			if (u.isVoid())
				continue;

			//ParseUnit.setDebugMode(true);
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

	/**
	 * 
	 * @return unit name formatted for target
	 */
	public String uname_target() {
		return uname_target;
	}
	public UnitNode curUnit() {
		return curUnit;
	}


	/**
	 * @param unit
	 */
	void setupUnit(UnitNode unit) {
		unit.setCodegen(true);
		ParseUnit.current().setCurrUnitNode(unit);
        curUnit = unit;
        uname = unit.getName().getText();
        uname_target = unit.getPkgName().getText().replace('.', '_') + '_'  + uname + '_';	
        uname_host = unit.getPkgName().getText() + '.'  + uname;	    		       
	}

	/**
	 * 
	 * @return unit name formatted for host.
	 */
	public String uname_host() {
		return uname_host;
	}

	/**
	 * 
	 */
	private static void genInfo() {
		// TODO Auto-generated method stub
		
	}
    /**
     * called by genUnits().
     * @throws Exception
     */
	private void genJScript() throws Exception {
    	//if (!curUnit.isProtocol()) {
        //if (!curUnit.isComposition() && !curUnit.isProtocol()) {
        //if (curUnit.isModule() || curUnit.isClass() || curUnit.isEnum()) {
            File file = ParseUnit.cacheFile(curUnit.getQualName(), ".js");
            getFmt().reset();
            UnitJScript unitJScript = new UnitJScript(this);
            unitJScript.generate(curUnit);
            writeFile(file, getFmt().toBytes());
        //}
    }
	/**
	 * Follow imports recursively starting at unit to get units that are used.
	 * Add used unit to Set<UnitNode> if not already there.
	 * 
	 * @param unit
	 * @param Set<UnitNode> uses
	 */
    private void findUses(UnitNode unit, Set<UnitNode> uses) {
        for (ImportNode imp : unit.getImports()) {
        	if (imp.getUnit() != null) 
        		findUses(imp.getUnit(), uses);
        }
        if (!uses.contains(unit)) {// && !unit.isProtocol() ) {
        	uses.add(unit); 
        }
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
        boolean missingRun = unit.getFcnMap().get(ParseUnit.INTRINSIC_PREFIX + "run") == null;
        boolean noProg = unit.isHost() || missingRun;
        if (noProg) {
        	if (missingRun)
        		cur.reportError(unit, "Missing \'pollen.run\' definition in main module");
        	if (unit.isHost())	
        		cur.reportError(unit, "Main module is host only");
        }

        setupUnit(unit);
        getFmt().reset();
        ProgJScript jsProg = new ProgJScript(this);
        jsProg.generate(uses, unit);
        writeFile(jsFile, getFmt().toBytes(), true);
        if (ParseUnit.getSeriousErrorCount() == 0) {
        	Value.Arr unitsArr = (Value.Arr) Script.execute(getFmt().toString(), "$units", jsFile.getAbsolutePath());

        	getFmt().reset();
        	ProgCCode targProg = new ProgCCode(this);
        	targProg.generate(unitsArr);
        	writeFile(progFile, getFmt().toBytes(), true);
        }

        if (ParseUnit.getSeriousErrorCount() > 0) {
            return;
        }
        
        target = this.loadTarget();
        target.compile(progFile);
    }


	/**
	 * Called by genUnits().
	 */
	private void genBody() throws Exception {
        if ((curUnit.isModule() || curUnit.isClass()) && !curUnit.isHost()) {
            File file = ParseUnit.cacheFile(curUnit.getQualName(), ".c");
            getFmt().reset();
            UnitBody unitBody = new UnitBody(this);
            unitBody.generate(curUnit);
            writeFile(file, getFmt().toBytes());
        }				
	}
	

	/**
	 * Called by genUnits().
	 */
	private void genHeader() throws Exception {
		if ((curUnit.isModule() || curUnit.isClass() || curUnit.isEnum())
				&& !curUnit.isHost()) {
			File file = ParseUnit.cacheFile(curUnit.getQualName(), ".h");
			getFmt().reset();
			UnitHeader unitHeader = new UnitHeader(this);
			unitHeader.generate(curUnit);
			writeFile(file, getFmt().toBytes());
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
	/**
	 * @return the fmt
	 */
	public Formatter getFmt() {
		return fmt;
	}

}
