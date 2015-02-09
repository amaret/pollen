/**
 * 
 */
package com.amaret.pollen.translator;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;

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
	private UnitNode mainUnit;
	private static String uname;
	private String uname_host;
	private String uname_target;
    private ITarget target;
    private File progFile;
	private final Formatter fmt = new Formatter();
	final Auxiliary aux = new Auxiliary(this);
	private List<String> fcnRefTypeDefs;  // typedefs can only be emitted once (must be unique for c)	
	public List<String> getFcnRefTypedefs() {
		return fcnRefTypeDefs;
	}
	private List<String> fcnArgForwards;  // we get around c circular header inclusion problems by emitting forwards for cross unit reference function arguments
	public List<String> getFcnArgForwards() {
		return fcnArgForwards;
	}

	public Auxiliary getAux() {
		return aux;
	}
	public boolean isHost() {
		return aux.isHost();
	}
		
	public Generator() {}
	
	public boolean isClassUnit() {
		return !classStack.isEmpty();
	}

	private Stack<DeclNode.Class> classStack = new Stack<DeclNode.Class>();
	
	/**
	 * Push onto class stack. Handles nesting. 
	 * @param cls
	 */
	public void pushClass(DeclNode.Class cls) {
		classStack.push(cls);
	}
	/**
	 * Pop from class stack. Handles nesting. 
	 * @return tos or null.
	 */
	public DeclNode.Class popClass() {
		DeclNode.Class c = null;
		if (!classStack.isEmpty()) {
			c = classStack.pop();
		}
		return c;
	}
	
	public DeclNode.Class peekClass() {
		if (!classStack.isEmpty())
			return classStack.peek();
		else
			return null;
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
		return "";
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
		return "";
	}
	
	/**
	 * @param main the top level unit
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

			
			setupUnit(u);
			//genHeader(); moved			
			genBody();
			genJScript();
			genInfo();
		}
		
	}
	/**
	 * @param main The top level unit
	 * @param units All dependent units
	 */
	public void genUnitHeaders(UnitNode main, HashMap<String, UnitNode> units) throws Exception {
		

		for (UnitNode u : units.values()) {
			if (u.isVoid())
				continue;

			setupUnit(u);
			genHeader();
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
        fcnRefTypeDefs = new ArrayList<String>();
        fcnArgForwards = new ArrayList<String>();
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
		File file = null;
		if (curUnit.isUnitUsed())
			file = ParseUnit.cacheFile(curUnit.getQualName(), ".js");
		getFmt().reset();
		UnitJScript unitJScript = new UnitJScript(this);
		unitJScript.generate(curUnit);
		if (curUnit.isUnitUsed())
			writeFile(file, getFmt().toBytes());
        //}
    }
	/**
	 * Follow imports recursively starting at top level unit to get units that are used.
	 * Add used unit to Set<UnitNode> if not already there.
	 * 
	 * @param unit
	 * @param Set<UnitNode> uses
	 */
	List<String> impChain = new ArrayList<String>(); // prevents stack overflow for recursive imports
    private void findUses(UnitNode unit, Set<UnitNode> uses) {
        for (ImportNode imp : unit.getImports()) {
        	if (imp.getUnit() != null) {
        		if (imp.isSynthesizedFromMeta() && imp.getUnit().isMeta())
        			continue;
        		if (!impChain.contains(imp.getQualName())) {
        			UnitNode u = imp.getExportUnit() != null ? imp.getExportUnit().getUnit() : imp.getUnit();
        			// String used =  (u.isUnitUsed() ? "USED     " : "NOT USED ");
        			// System.out.println(used + "unit " + u.getQualName() + ", import " + imp.getQualName());
        			
        			impChain.add(imp.getUnit().getQualName());			
        			findUses(imp.getUnit(), uses);
        		}
        	}
        }
        if (!uses.contains(unit)) {
        	impChain.remove(unit.getUnit().getQualName());
        	uses.add(unit); 
        }
    }
    
    @SuppressWarnings("unchecked")
    public ITarget loadTarget() throws Exception {
        ITarget targ = null;
        try {
            String clsName = ParseUnit.current().getProperty(ITarget.P_CLASS);
            Class c = Class.forName(clsName);
            targ = (ITarget) c.newInstance();
        }
        catch (Exception e) {
            //ParseUnit.current().reportFailure(e); not an error, just don't compile
        }
        return targ;
    }

    private ProgCCode targProg = null;
	public ProgCCode getTargProg() {
		return targProg;
	}

	public void genProgFiles(UnitNode unit) throws Exception {

        if (!unit.isModule()) {
            return;
        }
        mainUnit = unit;

        ParseUnit cur  = ParseUnit.current();
        Set<UnitNode> uses = new LinkedHashSet<UnitNode>();
        findUses(unit, uses);
        filterUses(uses);

        File jsFile = ParseUnit.cacheFile(unit.getQualName(), "-prog.js");
        progFile = ParseUnit.cacheFile(unit.getQualName(), "-prog.c");
        boolean missingRun = unit.getFcnMap().get(ParseUnit.POLLEN_PREFIX__ + "run") == null;
        boolean noProg = unit.isHost() || missingRun;
        if (noProg) {
        	if (missingRun)
        		cur.reportSeriousError(unit, "Missing \'pollen.run\' definition in main module.");
        	if (unit.isHost())	
        		cur.reportError(unit, "Main module is host only");
        }

        setupUnit(unit);
        getFmt().reset();
        ProgJScript jsProg = new ProgJScript(this);
        jsProg.generateProgJS(uses, unit);
        writeFile(jsFile, getFmt().toBytes(), true);
        if (ParseUnit.getSeriousErrorCount() == 0) {
        	Value.Arr unitsArr = (Value.Arr) Script.execute(getFmt().toString(), "$units", jsFile.getAbsolutePath());
        	if (unitsArr != null) {
            	getFmt().reset();
            	targProg = new ProgCCode(this);
            	targProg.generateProgC(unitsArr);
            	writeFile(progFile, getFmt().toBytes(), true);
        	}
        }

        if (ParseUnit.getSeriousErrorCount() > 0) {
        	cur.reportError(unit, "Serious errors encountered. C files will be generated but not compiled and no binary will be produced.");
            return;
        }        
    }

	/**
	 * Filter the uses list so that it contains only units with UNIT_USED flag true. 
	 * @param orig
	 */
	private void filterUses(Set<UnitNode> orig) {
		Set<UnitNode> filt = new LinkedHashSet<UnitNode>();
		Set<UnitNode> extraOrig = new LinkedHashSet<UnitNode>();
        for (UnitNode u : orig) {
        	if (u.isUnitUsed())
        		filt.add(u);
        	else
        		extraOrig.add(u);
        }
        boolean dbg = false;
        ParseUnit.setDebugMode(dbg);
        if (ParseUnit.isDebugMode()) {
        	String origUses = "";
        	String filtUses = "";
        	for (UnitNode u : extraOrig) {
        		origUses += " " + u.getUnitType().getUnitQualName();
        	}
        	for (UnitNode u : filt) {
        		filtUses += " " + u.getUnitType().getUnitQualName();
        	}
        	System.out.println("FULL LIST: " + filtUses + origUses);
        	System.out.println("FILT LIST: " + filtUses);
        }
        orig.clear();
        orig.addAll(filt);
        ParseUnit.setDebugMode(false);
	}

	/**
	 * If this translation has no props file specified the compile will not happen.
	 * @param progFile
	 * @throws Exception
	 */
	public void compile() throws Exception {
		if (ParseUnit.getSeriousErrorCount() == 0 && progFile != null
				&& ParseUnit.current().getProperty(ITarget.P_CLASS) != null) {
			target = this.loadTarget();
			if (target != null)
				target.compile(progFile);
		}
	}


	/**
	 * Called by genUnits().
	 */
	private void genBody() throws Exception {
        if ((curUnit.isModule() || curUnit.isClass()) && !curUnit.isHost()) {
        	File file = null;
        	if (curUnit.isUnitUsed())
        		file = ParseUnit.cacheFile(curUnit.getQualName(), ".c");
            getFmt().reset();
            UnitBody unitBody = new UnitBody(this);
            unitBody.generate(curUnit);
            if (curUnit.isUnitUsed())
            	writeFile(file, getFmt().toBytes());
        }				
	}
	

	/**
	 * Called by genUnits().
	 */
	private void genHeader() throws Exception {
		if ((curUnit.isModule() || curUnit.isClass() || curUnit.isEnum())
				&& !curUnit.isHost()) {
        	File file = null;
        	if (curUnit.isUnitUsed())
        		file = ParseUnit.cacheFile(curUnit.getQualName(), ".h");
			getFmt().reset();
			UnitHeader unitHeader = new UnitHeader(this);
			unitHeader.generateUnitHdr(curUnit);
			if (curUnit.isUnitUsed())
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
