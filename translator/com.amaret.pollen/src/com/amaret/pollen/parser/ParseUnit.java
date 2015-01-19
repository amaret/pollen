package com.amaret.pollen.parser;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Stack;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonToken;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.Tree;
import org.antlr.runtime.tree.TreeAdaptor;

import com.amaret.pollen.driver.ProcessUnits;
import com.amaret.pollen.driver.ProcessUnits.Termination;

public class ParseUnit {

	private String path;
	private ArrayList<String> paths = new ArrayList<String>();
	private static int errorCount;
	private static int seriousErrorCount; // > 0 will void call to gcc
	private ANTLRFileStream in;
	private PrintStream out;
	private PrintStream err;
	private PrintStream info;
	private PrintStream times;
	private static ParseUnit currParse;
	private static File currFile;
	private static String pollenFile; // the .p file supplied to pollen translator
	private static String pollenPkg;
	private UnitNode currUnitNode = null;
	private SymbolTable symbolTable;
	private Properties properties;
	private Stack<String> impChain;
	private HashMap<String, UnitNode> unitMap;		// will be used by javascript so keys must be the javascript unit name.
	private HashMap<String, UnitNode> unitNameMap; 	// supports reuse of UnitNodes, avoid parsing a file > 1 times. 
	private HashMap<String, String> packages;
	private HashMap<String, String> errors;
	private boolean parseTopLevel = false;
	private UnitNode topLevelUnit = null;
	static public enum Time {
		POLLEN, GCC, OBJCOPY
	}

	public static class Times {
		private static long pollenTime = 0; //
		private static long gccTime = 0;
		private static long objcopyTime = 0;
		/**
		 * Start the timing period for the Time type.
		 * @param t
		 */
		static public void startTime(Time t) {
			long tmp = System.currentTimeMillis();
			switch (t) {
			case POLLEN: pollenTime = tmp; 
			    break;
			case GCC: gccTime = tmp;
			    break;
			case OBJCOPY: objcopyTime = tmp;
			   break;
			default:			
			}
		}
		/**
		 * End the timing period for the Time type.
		 * @param t
		 */
		static public void endTime(Time t) {
			long tmp = System.currentTimeMillis();
			switch (t) {
			case POLLEN: 
				if (pollenTime <= 0) {
					System.out.println("Timing data: invalid start time");				
				}
				pollenTime = tmp - pollenTime;
				break;
			case GCC: 				
				if (gccTime <= 0) {
					System.out.println("Timing data: invalid start time");				
				}
				gccTime = tmp - gccTime;
				break;
			case OBJCOPY:
				if (objcopyTime <= 0) {
					System.out.println("Timing data: invalid start time");				
				}
				objcopyTime = tmp - objcopyTime;
				break;
			default:			
			}
		}
		/**
		 * 
		 * @return the times in milliseconds take by pollen, gcc, objcopy in a 
		 * String formatted as a json object with field names:
		 * worker_run_pollen, worker_run_gcc, worker_run_objcopy
		 */
		public static String returnTimes() {
			StringBuilder sb = new StringBuilder();
			sb.append("{");
			sb.append("\"worker_run_pollen\":\"" + new Long(pollenTime).toString() + "\",");
			sb.append("\"worker_run_gcc\":\"" + new Long(gccTime).toString() + "\",");
			sb.append("\"worker_run_objcopy\":\"" + new Long(objcopyTime).toString() + "\"}");
			return sb.toString();
			
		}

	}
	
	public UnitNode getTopLevelUnit() {
		return topLevelUnit;
	}
	public void setTopLevelUnit(UnitNode topLevelUnit) {
		this.topLevelUnit = topLevelUnit;
	}

	private List<String> metaModules = new ArrayList<String>();
	static private boolean debugMode = false;
	
	// javascript reserved words
	// Note these don't all cause aborts in all contexts if used as pollen names
	// (tho some eg. 'var' are very toxic). But to be safe we don't distinguish.
	// Note also these get errors only if used in host contexts.
	// TODO the same for C / target
    private static ArrayList<String> js_rsvdwords = new ArrayList<String>(Arrays.asList(
            "abstract", "arguments", "char", "debugger", "delete",
            "double", "eval", "final", "finally", "float", "function",
            "goto", "instanceof", "int", "interface", "let", "long",
            "native", "private", "protected", "short", "static",
            "super", "synchronized", "throw", "throws", "transient",
            "try", "typeof", "var", "void", "with", "yield", "Date",
            "eval", "function", "hasOwnProperty", "Infinity", "isFinite",
            "isNaN", "isPrototypeOf", "length", "NaN", 
            "Number", "Object", "prototype", "toString",
            "undefined", "valueOf"
            // took out: String, Math, 
     ));
    public static boolean isJavaScriptRsvdWord(String id) {
    	return js_rsvdwords.contains(id);
    }
	
	// pollen names, source
	public static final String POLLEN_PRINT = "pollen.print";
	public static final String POLLEN_PRINT_PROXY = "pollen.printProtocol";	
	public static final String POLLEN_ENVIRONMENT = "pollen.environment";
	public static final String POLLEN_PRINTPKG = "pollen.output";
	public static final String POLLEN_PRINT_PROTOCOL = "PrintProtocol";
	public static final String POLLEN_RESET = "pollen.reset";
	public static final String POLLEN_READY = "pollen.ready";
	public static final String POLLEN_SHUTDOWN = "pollen.shutdown";
	public static final String POLLEN_RUN = "pollen.run";
	public static final String POLLEN_HIBERNATE = "pollen.hibernate";
	public static final String POLLEN_WAKE = "pollen.wake";

	// pollen names, generated
	public static final String EXPORT_PREFIX = "$$export";
	// A name prefixed with intrinsic prefix will not be entered into the symtab (lookups will fail). 
	public static final String INTRINSIC_PREFIX = "pollen__";
	public static final String DEFAULT_LOOPVAR = INTRINSIC_PREFIX + "loopvar"; // for loops w/ undeclared loop variables
	public static final String INTRINSIC_UNITVAR = INTRINSIC_PREFIX +"unitname";
	public static final String INTRINSIC_PRINT_PROTOCOL= "PrintProtocol";
	public static final String INTRINSIC_PRINT_PROXY = "intrinsicPrintProtocol";
	public static final String CTOR_CLASS_TARGET = "new_";
	public static final String CTOR_CLASS_HOST = "new_host";
	public static final String CTOR_MODULE_TARGET = "targetInit";
	public static final String CTOR_MODULE_HOST = "$$hostInit";
	public static final String PRIVATE_INIT = "$$privateInit";
	public static final String HOST_INIT_LASTPASS = "$$hostInitLastPass";
	public static final String PRESET_INIT = INTRINSIC_PREFIX + "presets__";
	public static final String KIND_EXTERN = "__E";
	public static final String KIND_INTERN = "__I";
	public static final String KIND_ARRAY = "__A";
	public static final String KIND_VAR = "__V";
	public static final String JAVASCRIPT_OBJECT_NOT_FOUND = "/* object not found */";
	public static final String ARRAY_WITHOUT_DIMENSION = "-1";
	
	public static boolean isIntrinsicCall(String s) {
		if (!(s.matches(ParseUnit.INTRINSIC_PREFIX + ".*")))
			return false;
		if (s.equals(ParseUnit.INTRINSIC_UNITVAR))
			return false;
		if (s.equals(ParseUnit.INTRINSIC_PREFIX + ParseUnit.DEFAULT_LOOPVAR))
			return false;			
		return true;
	}
	
	/**
	 * Here track the output names of pollen intrinsic functions (which will vary depending on where they are defined).
	 */
	private List<String> pollenFunctionList = Arrays.asList("hibernate","ready", "reset", "run", "shutdown", "wake");
	private Map<String, String> pollenFunctionsFound = new HashMap<String, String>();
	/**
	 * Create and store in a map the output name of a pollen intrinsic function
	 * @param fname
	 * @return false if something went wrong
	 */
	public boolean putPollenFunction(String fname) {
		// handle both pollen.shutdown and pollen__shutdown formats
		fname = fname.substring(fname.lastIndexOf("_")+1);
		fname = fname.substring(fname.lastIndexOf(".")+1);
		if (pollenFunctionsFound.containsKey(fname)) {
			reportError(ParseUnit.current().getCurrUnitNode(), "encountered more than one implementation for intrinsic pollen." + fname);
			return false;
		}
		String key = fname;
		if (!pollenFunctionList.contains(key))
			return true;
        String uname = ParseUnit.current().getCurrUnitNode().getName().getText();
        fname = ParseUnit.current().getCurrUnitNode().getPkgName().getText().replace('.', '_') + '_'  + uname + '_'
        		+ "pollen__" + fname + ParseUnit.KIND_EXTERN;
		pollenFunctionsFound.put(key, fname);
		return true;		
	}
	/**
	 * Return the formatted output name for a pollen intrinsic function
	 * @param fname
	 * @return formatted name of the user defined version if there is one or the default name.
	 */
	public String getPollenFunctionOutputName(String n)  {
		String fname = n.substring(n.lastIndexOf("_")+1);
		fname = fname.substring(n.lastIndexOf(".")+1);
		if (!pollenFunctionList.contains(fname)) {
			String uname = ParseUnit.current().getCurrUnitNode().getName().getText();
			fname = ParseUnit.current().getCurrUnitNode().getPkgName().getText().replace('.', '_') + '_'  + uname + '_'
					+ n + ParseUnit.KIND_EXTERN; // this can handle non function intrinsics
			return fname;
		}
		String outputName = pollenFunctionsFound.get(fname);

		if (outputName == null) { // no user defined implementation found
			if (ParseUnit.current().getTopLevelUnit() != null) {
				UnitNode u = ParseUnit.current().getTopLevelUnit(); // default in top level unit
				String uname = u.getName().getText();
				fname = u.getPkgName().getText().replace('.', '_') + '_'  + uname + '_'
						+ ParseUnit.INTRINSIC_PREFIX + fname + ParseUnit.KIND_EXTERN;
				return fname;
			}
			else return ""; // no top level unit (?)
		}
		return outputName;
	}
	/**
	 * @param an intrinsic name	
	 * @return true if a user defined intrinsic function by this name exists else false
	 */
	public boolean foundUserDefinedIntrinsicFunction(String n) {
		String fname = n.substring(n.lastIndexOf("_")+1);
		fname = fname.substring(n.lastIndexOf(".")+1);
		if (!pollenFunctionList.contains(fname)) {
			return false;
		}
		if (pollenFunctionsFound.get(fname) == null)
			return false;
		return true;		
	}
	/**
	 * 
	 * @return true if unit currently being parsed is the top level module
	 */
	public boolean isParseToplevel() {
		return parseTopLevel;
	}

	public void setParseToplevel(boolean toplevelModule) {
		this.parseTopLevel = toplevelModule;
	}
	/*
	 * For meta instantiations.
	 * Given, in the Test context:
	 *   from pollen.hardware import HandlerProtocol as HP
	 *   from pollen.data import Queue {HP} as HandlerQueue
	 * This results in an import in the Queue context (Queue is 'meta {type E} class Queue')
	 * created by the parser:
	 *   from pollen.data import HP as E
	 * It needs to be corrected to 
	 *   from pollen.hardware import HandlerProtocol as E
	 *   
	 * These maps support these fixups.
	 * Used by the parser.
	 */
	protected class ImportsMaps {	
		// each unit has one ImportsMaps map for its imports
		// each 'as' name for an import will retrieve the actual name, package, and meta args.
		private HashMap<String, String> typeToPackageMap;        
		private HashMap<String, String> asNameToTypeMap;        
		private HashMap<String, String> asNameToPackageMap;  
		private HashMap<String, Tree> asNameToMetaArgsMap;
		protected ImportsMaps() {
			typeToPackageMap = new HashMap<String, String>();
			asNameToPackageMap = new HashMap<String, String>();	
			asNameToTypeMap = new HashMap<String, String>();
			asNameToMetaArgsMap = new HashMap<String, Tree>();
		}
		protected void addTypeNamesToPackageMaps(String t,String asName, String pkg, Tree metaArgs) {
			typeToPackageMap.put(t,pkg);
			if (asName != null) {
				asNameToPackageMap.put(asName, pkg);
				asNameToTypeMap.put(asName, t);
				asNameToMetaArgsMap.put(asName, metaArgs);
			}
		}
		protected String getPackage(String key) {
			String ret = (asNameToTypeMap.get(key)) != null ? asNameToPackageMap.get(key) : typeToPackageMap.get(key);
			return ret;
		}
		protected Tree getMetaArgs(String key) {
			Tree ret = (asNameToMetaArgsMap.get(key)) != null ? asNameToMetaArgsMap.get(key) : null;
			return ret;
		}
		protected String getTypeName(String key) {
			// If there is no entry in the map, this key must be the type name.
			String ret = asNameToTypeMap.get(key) != null ? asNameToTypeMap.get(key) : key;
			return ret;
		}
	}
	// the key is the unit
	private HashMap<String, ImportsMaps> importedTypes = new HashMap<String, ImportsMaps>();  // one per unit
	/**
	 * Supports fixups to meta parameters, see nested class ImportsMaps.
	 * @param type
	 * @param asName
	 * @param pkg
	 */
	public void addToImportsMaps(String type, String asName, String pkg, Object metaArgs) {
		String unitKey = ParseUnit.mkPackageName(getCurrPath()) + "." + ParseUnit.mkUnitName(getCurrPath());
		setDebugMode(false);
		if (isDebugMode()) {
			String dbgStr = "";
			if (metaArgs instanceof ListNode) {
				dbgStr = ", meta args ";
				String comma = "";
				ListNode<BaseNode> l = (ListNode<BaseNode>) metaArgs;
				for (BaseNode b : l.getElems()) {
					dbgStr += comma;
					if (b.getType() != pollenParser.NIL)
						dbgStr += b.getText() + "." + b.getChild(0).getText();
					else
						dbgStr += "<none, use default>";
					comma = ", ";				
				}			
			}
			System.out.println("addToImportsMaps(): in unit " + unitKey + " add 'import " + pkg + "." + type + " as " + asName + "'" + dbgStr);
		}
		if (!importedTypes.containsKey(unitKey))
			importedTypes.put(unitKey, new ImportsMaps());
		Tree t = (Tree) metaArgs;
		importedTypes.get(unitKey).addTypeNamesToPackageMaps(type, asName, pkg, t);		
	}
	
	public String getNameForMessage(String n) {
		
		String rtn = n;
		
		String prefix = n.lastIndexOf('.') != -1 ? n.substring(0,n.lastIndexOf('.')) + " " : "";
		n = n.lastIndexOf('.') != -1 ? n.substring(n.lastIndexOf('.')+1) : n;
		
		if (n.equals(ParseUnit.CTOR_CLASS_HOST))
			return prefix + "host class constructor";
		else if (n.equals(ParseUnit.CTOR_CLASS_TARGET))
			return prefix + "class constructor";
		else if (n.equals(CTOR_MODULE_HOST))
			return prefix + "host module constructor";
		else if (n.equals(CTOR_MODULE_TARGET)) 
			return prefix + "module constructor";
		// others?
			
		
		return rtn;
	}
	
	public String getTypeName(String unitKey, String asName) {
		if (!importedTypes.containsKey(unitKey))
			importedTypes.put(unitKey, new ImportsMaps());
		return importedTypes.get(unitKey).getTypeName(asName);		
	}
	public Tree getMetaArgs(String unitKey, String asName) {
		if (!importedTypes.containsKey(unitKey))
			importedTypes.put(unitKey, new ImportsMaps());
		return importedTypes.get(unitKey).getMetaArgs(asName);		
	}
	public String getPackage(String unitKey, String asName) {
		if (!importedTypes.containsKey(unitKey))
			importedTypes.put(unitKey, new ImportsMaps());
		return importedTypes.get(unitKey).getPackage(asName);
	}

	public static String getPollenFile() {
		return pollenFile;
	}
	private static void setPollenFile(String pollenFile) {	
		if (pollenFile.endsWith(".p")) {
			pollenFile = pollenFile.substring(0,pollenFile.lastIndexOf('.'));
		}
		if (pollenFile.indexOf(File.separatorChar) != -1)
			pollenFile = pollenFile.substring(pollenFile.lastIndexOf(File.separatorChar)+1);
		ParseUnit.pollenFile = pollenFile;		
	}
	public static String getPollenPkg() {
		return pollenPkg;
	}
	private static void setPollenPkg(String pollenPkg) {
		ParseUnit.pollenPkg = ParseUnit.mkPackageName(pollenPkg);
	}
		
	// info on parse time current type (under construction)
	private pollenParser parser = null;
	
	public EnumSet<Flags> getParseUnitFlags() {
		if (parser == null)
			return  EnumSet.noneOf(Flags.class);
		if (this.currUnitNode != null)
			return this.currUnitNode.getUnitType().getFlags();
		return parser.getParseUnitFlags();
	}
	/**
	 * 
	 * @return true if unit currently being parsed is nested
	 */
	public boolean isUnitUnderConstructionNested() {
		return parser.getParserTypeInfoListSize() > 1;
	}
	public String getParseUnitName() {
		if (parser == null)
			return  null;
		if (this.currUnitNode != null)
			return this.currUnitNode.getUnitType().getName().getText();
		return parser.getParseUnitTypeName();
	}
	public List<String> getMetaModules() {
		return metaModules;
	}

	public void setMetaModules(List<String> metaModules) {
		this.metaModules = metaModules;
	}

	public static void setDebugMode(boolean debugMode) {
		ParseUnit.debugMode = debugMode;
	}

	public static boolean isDebugMode() {
		//return false;
		//return true;
		return debugMode;
	}

	static public enum Property {
		POLLEN_TARGET, POLLEN_BUNDLES, POLLEN_ROOT
	}

	public PrintStream getErrorStream() {
		return err;
	}
	public String getPollenTarget() {
		return ProcessUnits.getPollenTarget();
	}
	public PrintStream getInfoStream() {
		return info;
	}
	public PrintStream getTimesStream() throws FileNotFoundException {
		PrintStream ti = null;
		ti = new PrintStream(new FileOutputStream (ProcessUnits.getWorkingDir() + File.separator + ".pollen_times", false));
		return ti;
	}

	public PrintStream getOutputStream() {
		return out;
	}

	public SymbolTable getSymbolTable() {
		return symbolTable;
	}

	public void setCurrUnitNode(UnitNode currUnitNode) {
		this.currUnitNode = currUnitNode;
	}

	/**
	 * @return total of all errors
	 */
	public static int getErrorCount() {
		//return 0;
		return errorCount;
	}
	/**
	 * Used for serious errors only... so as to avoid javascript aborts, for example
	 * @return
	 */
	public static int getSeriousErrorCount() {
		return seriousErrorCount;
	}
	public static void incSeriousErrorCount() {
		seriousErrorCount+=1;
	}

	public String getCurrPath() {
		if (paths.size() == 0)
			return path; // default is the input pollen file.
		return paths.get(paths.size() - 1);
	}

	public String getPackageName() {
		String p = getCurrPath();
		return ParseUnit.mkPackageName(p);
	}

	public String getUnitName() {
		String p = getCurrPath();
		return ParseUnit.mkUnitName(p);
	}

	private ParseUnit(String inputPath, Properties props,
			HashMap<String, String> pkgs, PrintStream outputStream,
			PrintStream errorStream, PrintStream infoStream, SymbolTable symtab) {

		path = inputPath;
		ParseUnit.setPollenFile(inputPath);
		ParseUnit.setPollenPkg(inputPath);
		properties = props;
		out = outputStream;
		err = errorStream;
		info = infoStream;
		symbolTable = symtab;
		packages = pkgs;
		impChain = new Stack<String>();
		errorCount = 0;
		seriousErrorCount = 0;
		errors = new HashMap<String, String>();
		unitMap = new HashMap<String, UnitNode>();
		unitNameMap = new HashMap<String, UnitNode>();
		out.printf("%s", ProcessUnits.version() + "\n");
	}

	public String getProperty(Property key) {
		return properties.getProperty(key.name());
	}

	/**
	 * 
	 * @param key
	 * @return the property for key or null if no key. 
	 * If key exists but no value specified returns empty string.
	 */
	public String getProperty(String key) {
		return properties.getProperty(key);
	}
	
	// A global preset map which tracks which variables were 'preset' (outside of dcln scope).
    private List<ISymbolNode> presetList;
    private Map<String, List<ISymbolNode>> presetMap = new HashMap<String, List<ISymbolNode>>();
    private String makePresetMapKey(SymbolEntry se) {
    	String enc = se.scope().getEnclosingScope() != null ? se.scope().getEnclosingScope().getScopeName() + "." : "";    	
    	return enc + se.scope().getScopeName() + "." + se.node().getName().getText();
    }
    
    // Map the presets to initial expressions 
    private Map<String, ExprNode> presetExprs = new HashMap<String, ExprNode>();
    
    public ExprNode getPresetExpr(SymbolEntry se) {
    	if (se == null || !(se.node() instanceof DeclNode))
    		return null;
    	String key = this.makePresetMapKey(se); 
    	return presetExprs.get(key);
    }
    /**
     * Put the preset expr and symbol in the presetExprMap. 
     * Note preset expr could be for protocol member binding.
     * @param se
     * @param e
     * @return null if first inserted or the previous mapping expr node
     */
    public ExprNode putPresetExpr(SymbolEntry se, ExprNode e) {
    	if (se == null || !(se.node() instanceof DeclNode))
    		return null;
    	String key = makePresetMapKey(se); //e.nameForHashing(e);
    	ExprNode rtn = null;
    	if (presetExprs.containsKey(key))
    		rtn = presetExprs.put(key, e);
    	else 
    		presetExprs.put(key, e);
    	return rtn;
    	
    }
    /**
     * @param se
     * @return true if this symbol was preset to a value in a preset initializer
     */
    public boolean isPreset(SymbolEntry se) {
    	if (se == null || !(se.node() instanceof DeclNode))
    		return false;
    	String key = this.makePresetMapKey(se);
    	if (presetMap.get(key) != null) {
    		((DeclNode) se.node()).setPreset(true); // can happen for >1 AST for same file
    		return true;
    	}
    	return false;
    }
    /**
     * Variables can be declared in one unit and accessed in another - but only in 'preset' initializers. 
     * When that is detected, enter the variable in the current unit map, where current unit is the unit of 
     * variable declaration.
     * This needs to be done multiple times potentially because the same file may have more than one AST, 
     * due to imports. This code makes sure that DeclNodes in all ASTs for a single variable have the preset flag set. 
     * NOTE with change that re-uses UnitNode for multiple parses, this may not be needed. 
     * @param se
     */
    private void addToPresetMap(SymbolEntry se) {
    	if (se == null || se.node() == null || se.scope() == null)
    		return;
    	// the complexity is due to the fact that there may be >1 versions of a node
    	// because there may be >1 unit trees for the same unit, depending on imports.
    	String key = this.makePresetMapKey(se);
    	if (presetMap.get(key) != null) {
    		presetMap.get(key).add(se.node());
    	}
    	else {
    		presetList = new ArrayList<ISymbolNode>();
    		presetList.add(se.node());
    		presetMap.put(key, presetList);
    	}
		for (ISymbolNode is : presetMap.get(key)) {
			if (is instanceof DeclNode)
				((DeclNode)is).setPreset(true);
		}
    }
    /**
     * Check if this symbol should be / is in the preset map.
     * If current code is a preset initializer the symbol 
     * will be entered in the presetMap. 
     * @param symbol
     * @return return true if preset false otherwise
     */
	public boolean initPreset(SymbolEntry symbol) {
		ISymbolNode node = symbol != null ? symbol.node() : null;

		if (node instanceof DeclNode) {
			boolean inPreset = currUnitNode.isComposition() && ParseUnit.current().getSymbolTable().insidePresetInitializer();
			if (inPreset) {
				ParseUnit.current().addToPresetMap(symbol);
				return true;
			}
			return isPreset(symbol);
		}
		return false;
	}
	
	void debugUnitMap(String fcn, String qualName, UnitNode u, boolean found, String caller) {
		String hdr = "UnitMap debug, " + (!caller.isEmpty() ? "called from " + caller + ", " : "");
		if (u != null && u.isVoid()) {
			System.out.println(hdr + fcn + "(): void unit");
			return;
		}
		System.out.print(hdr + fcn + "(): name ");
		System.out.print(qualName);
		if (u != null && !u.getUnitType().getMetaQualName().isEmpty()) {
			String pkg = qualName.substring(0,
					qualName.lastIndexOf(".") + 1);
			System.out.print(", meta name " + (pkg + u.getUnitType().getMetaQualName()));
		}
		String f = "";
		if (fcn.equals("findUnit"))
			f = found ? ", found TRUE" : ", found FALSE";
		System.out.println(f);				
	}
	
	private UnitNode getUnit(ImportNode theImport) {
		
		String pkg = theImport.getFrom() + ".";
		
		String name = pkg + theImport.getMeta() == null ? this.mkMetaUnitMapName(theImport, false) : this.mkUnitMapName(theImport);
		UnitNode u = unitNameMap.get(name);
		return u;		
	}	
	/**
	 * Map unit names to unit nodes so that we don't need to reparse files that are imported > 1 times. 
	 * Instead we retrieve the unit node from this map. 
	 * @param unit
	 * @param theImport create the map name for the unit from the import
	 */
	private void enterUnitNameMap(UnitNode unit, ImportNode theImport) {
		
		if (theImport == null) // this is the top level unit, no entry is needed
			return;
				
		if (unit.getUnitType().getMetaQualName().isEmpty()) {
			String qualName = this.mkUnitMapName(theImport);
			if (unitNameMap.get(qualName) == null)
				unitNameMap.put(qualName, unit);
		}
		else {
			String shortMetaName = mkMetaUnitMapName(theImport, true); // used for error check
			String metaName = mkMetaUnitMapName(theImport, false);		
			UnitNode chk = unitNameMap.get(shortMetaName);
			UnitNode u = unitNameMap.get(metaName);
			if (chk != null && u != chk ) {
				// if u & chk are not the same, the difference can only be in the arguments, which is an error
				ParseUnit.current().reportError(unit, unit.getQualName() + ": meta type name collides with another meta type name which was instantiated in the same package but with different arguments. Distinct meta type instances cannot have the same name and package.");
				return;
			}
			if (unitNameMap.get(metaName) == null) {
				unitNameMap.put(metaName, unit);
				unitNameMap.put(shortMetaName, unit);
			}			
		}		
	}
	/**
	 * 
	 * @param theImport
	 * @return the external name, the generated name, not the internal 'as' name (except for meta, which is generated with the 'as' name). 
	 */
	private String mkUnitMapName(ImportNode theImport) {
		String pkg = theImport.getFrom() + ".";
		String uname = pkg + (theImport.getMeta() != null ? theImport.getAs().getText() : theImport.getUnitName().getText());
		return uname; 
		
	}
	/**
	 * For instantiated meta types, make the map name. 
	 * 
	 * @param theImport
	 * @param shortName return a name without qualification with arguments
	 * @return a name for the map
	 */
	private String mkMetaUnitMapName(ImportNode theImport, boolean shortName) {
		// For meta instantiations, full qualification with package, meta name and also meta arguments is needed. 
		// This is because you can't instantiate e.g. Event into the same package with the same name but different arguments.
		// If the arguments are different it is a different type and needs a non-colliding name. 
		String pkg = theImport.getFrom() + ".";
		String n = "";
		String uname = theImport.getMeta() != null ? theImport.getAs().getText() : theImport.getUnitName().getText();
		if (!shortName && theImport != null && theImport.getMeta() != null) {
			String underSc = "_";
			for (BaseNode b : theImport.getMeta()) {
				n += underSc;
				if (b.getType() != pollenParser.NIL)
					n += b.getChild(0).getText();
			}
		}
		n = pkg + uname + n;
		return n;
	}

	public void enterUnit(String qualname, UnitNode unit) {
		
		if (isDebugMode())
			debugUnitMap("enterUnit", qualname, unit, false, "");
		
		if (!unit.isVoid()) { // deferred instantiation ('{}')
			unitMap.put(qualname, unit);
			// for meta types, two names are entered. 
			// the first is used during passes 1 and 2 and the second during codegen.
			if (!unit.getUnitType().getMetaQualName().isEmpty()) {
				String pkg = qualname.substring(0,
						qualname.lastIndexOf(".") + 1);
				unitMap.put(pkg + unit.getUnitType().getMetaQualName(), unit);
			}
			
		}
	}

	public UnitNode findUnit(String qualName, String caller) {
		UnitNode u = unitMap.get(qualName);
		
		if (isDebugMode())
			debugUnitMap("findUnit", qualName, null, u != null, caller);
		
		return u;
	}

	/**
	 * Initialize and start up for parse phase.
	 * 
	 * @param inputPath
	 * @param props
	 * @param pkgs
	 * @param outputStream
	 * @param errorStream
	 * @param infoStream
	 * @param symtab
	 */
	public static void initParse(String inputPath, Properties props,
			HashMap<String, String> pkgs, PrintStream outputStream,
			PrintStream errorStream, PrintStream infoStream, SymbolTable symtab) {

		currParse = new ParseUnit(inputPath, props, pkgs, outputStream,
				errorStream, infoStream, symtab);

	}

	public static ParseUnit current() {
		return currParse;
	}

	/**
	 * Parse the imports. Handle meta parameters.
	 * 
	 * @param unit
	 * @throws Exception
	 */
	private void parseImports(UnitNode unit) throws Exception {
		

		String importer = (impChain.size() > 0) ? impChain
				.get(impChain.size() - 1) : "";
		if (impChain.contains(unit.getQualName()) && impChain.size() > 0) {
			if (!unit.getUnitType().isMeta()) // Seems to be okay if meta
				reportError(unit, "In unit \'" + importer
						+ "\' import recursion for \'" + unit.getQualName()
						+ "\' detected");
		}

		impChain.push(unit.getQualName());  

		for (ImportNode currImport : unit.getImports()) {

			String fromPkg = currImport.getFrom().getText();
			String pkgPath = packages.get(fromPkg);
			UnitNode currUnit = null;

			SymbolEntry currSym = unit.resolveSymbol(currImport.getFrom());
			// as currNode is the 'from' clause, it is null or the import node of a composition import:
			// 'from Compos import Mod'
			ISymbolNode currNode = currSym == null ? null : currSym.node();
			
			SymbolEntry currExportSym = null;
			UnitNode client = unit;
			ImportNode importFromClient = currImport;
			
			String clientName = client != null ? client.getQualName() : "<no import>";
			String importFromClientName = importFromClient != null ? importFromClient.getQualName()
					: "<none>";

			
			// import is instantiated primitive type
			if (Cat.Scalar.codeFromString(currImport.getUnitName().getText()) != null) {
				// primitive type: don't import (instantiation side effect)
				Atom name = currImport.getName();
				unit.defineSymbol(name, currImport);
				checkParseUnit(pkgPath + File.separator
						+ currImport.getUnitName() + ".p", importFromClient, clientName, importFromClientName);
				continue;
			}
			setDebugMode(false);
			if (ParseUnit.isDebugMode()) {
				String s = "ParseUnit.parseImports(), parsing: " + fromPkg + "."
						+ currImport.getUnitName().getText()
						+ (pkgPath == null ? " (a composition)" : "");
				System.out.println(s);
			}
			setDebugMode(false);
			
			// import is instantiated meta type
			if (currNode == null && currImport.isSynthesizedFromMeta()) {

				// if this is an instantiated meta type, its pollen file won't exist
				currNode = findUnit(fromPkg + "." + currImport.getQualName(), "parseImports");
				if (currNode != null && currNode instanceof UnitNode) {
					currUnit = (UnitNode) currNode;
					currImport.bindUnit(currUnit);
					Atom name = currImport.getName();
					unit.defineSymbol(name, currImport);
					currUnit.addClient(unit); 
					this.enterUnit(currUnit.getQualName(), currUnit);
					checkParseUnit(pkgPath + File.separator
							+ currImport.getUnitName() + ".p", importFromClient, clientName, importFromClientName);
					continue;
				}
			}

			UnitNode u = this.getUnit(currImport);
			boolean dbg = false;
			if (u != null)
				dbg = true;
			if (u != null && u instanceof UnitNode) {
				currUnit = (UnitNode) u;
				currImport.bindUnit(currUnit);
				Atom name = currImport.getName();
				unit.defineSymbol(name, currImport);
				currUnit.addClient(unit); 
				this.enterUnit(currUnit.getQualName(), currUnit);
				checkParseUnit(pkgPath + File.separator
						+ currImport.getUnitName() + ".p", importFromClient, clientName, importFromClientName);
				continue;
			}

			if (!(currNode instanceof ImportNode)) {
				try {

					if (pkgPath == null) {
						// Assume this is a composition in the default package:
						// 'from c import m'
						// In that case fromPkg contains the composition name
						// 'c'.
//						System.out.println("parseImports, currNode:   " + ((Tree)currNode).toStringTree());
//						System.out.println("parseImports, currImport: " + currImport.toStringTree());
						currImport.setFromComposImportModule(true);
						pkgPath = path.substring(0, path
								.lastIndexOf(File.separator));

						if (fromPkg.equals(ParseUnit.POLLEN_PRINTPKG)
								&& currImport.getUnitName().getText().equals(ParseUnit.POLLEN_PRINT_PROTOCOL)) {

							// Default handling of print when no -p 
							// (this import was generated by the parser).
							// Use the default location of POLLEN_PRINT_PROTOCOL to satisfy.
														
							File f = new File(pkgPath + File.separator + fromPkg);
							String p = (!f.exists()) ? ProcessUnits.getPollenOutputDefault() : pkgPath + File.separator + fromPkg;
							if (p.isEmpty()) {
								ParseUnit.current().reportError(currUnitNode, 
										"unit requires import statement for 'pollen.output/PrintProtocol.p' or set environment variable $POLLEN_BUNDLES.");
							}
							currUnit = parseUnit(p + File.separator
									+ ParseUnit.POLLEN_PRINT_PROTOCOL
									+ ".p", client, importFromClient);

						}
						else {
							String pkg = pkgPath + File.separator + fromPkg + ".p";

							File f = new File(pkg);
							if (!f.exists()) {
								if (!(new File(pkgPath + File.separator + fromPkg))
										.exists()) {
									reportError(getPackageName() + "."
											+ getFileName(), "missing package \'"
													+ fromPkg + "\'");
									continue;
								}
							}
							currUnit = parseUnit(pkgPath + File.separator + fromPkg
									+ ".p", client, importFromClient);
						}

					} else {
						currUnit = parseUnit(pkgPath + File.separator
								+ currImport.getUnitName() + ".p", client,
								importFromClient);
					}

				} catch (Termination te) {
					reportError(currImport, te.getMessage());
					System.exit(1);
				}
			}

			else {
				currUnit = ((ImportNode) currNode).getUnit();
				if (currUnit == null) {
					reportError(currImport.getUnitName(), "import not bound to unit");
					continue;
				}

				// This flag identifies: 
				// 'from compositionC import moduleA as moduleB'
				// moduleA must be exported from compositionC
				currImport.setFromComposImportModule(true);
				currExportSym = currUnit.resolveSymbol(currImport.getUnitName());
			}

			if (currUnit != null) {

				Atom name = currImport.getName();
				if (unit.defineSymbol(name, currImport) == false) {
					reportError(name,
							"identifier already defined in the current scope");
					continue;
				}
				
				// This flag identifies: 
				// 'from compositionC import moduleA as moduleB'
				// moduleA must be exported from compositionC
				if (currExportSym == null && currUnit.isComposition() 
						&& (!currImport.getUnitName().getText().equals(currUnit.getUnitType().getName().getText()))) {
					currImport.setFromComposImportModule(true);

				}
				
				if (currImport.getMeta() == null) {

					currImport.bindUnit(currUnit);
				} else {

					if (!currUnit.isMeta()) {
						reportError(currImport.getUnitName(),
								"meta arguments provided but not a meta type");
						continue;
					}
					currImport.bindUnit(currUnit);
				}
				currUnit.addClient(unit);
				this.enterUnit(currUnit.getQualName(), currUnit);
			}
		}

		impChain.pop();
		//setDebugMode(false);
	}

	/**
	 * 
	 * @param inputPath
	 *            pollen file
	 * @param client
	 *            client unit (for meta type instantiation)
	 * @param theImport
	 *            client unit ImportNode (from import statement, for meta type instantiation, has meta
	 *            parameters) Client parameters are null for non-meta instantiation parse.
	 * @return AST (UnitNode)
	 * @throws Exception
	 */
	private UnitNode parseUnit(String inputPath, UnitNode client,
			ImportNode theImport) throws Exception {

		String clientName = client != null ? client.getQualName() : "<no import>";
		String theImportName = theImport != null ? theImport.getQualName()
				: "<none>";
		
		setParseToplevel(client == null && theImport == null);

		setDebugMode(false);
		checkParseUnit(inputPath, theImport, clientName, theImportName);
		File f = new File(inputPath);
		if (!f.exists()) {
			reportFailure(
					"Missing file \'" + getPackageName() + "/" + ParseUnit.mkUnitName(inputPath) + ".p\'\n");
		}

		paths.add(inputPath);
		in = new ANTLRFileStream(inputPath);

		pollenLexer lexer = new pollenLexer(in, getPackageName() + "."
				+ getFileName());

		AtomStream tokens = new AtomStream(lexer);
		tokens.discardOffChannelTokens(true);
		parser = new pollenParser(tokens, client, theImport);

		parser.setTreeAdaptor((TreeAdaptor) new BaseNodeAdaptor());
		pollenParser.unit_return result = parser.unit();

		if (!(result.getTree() instanceof UnitNode)) {
			return null;
		}

		UnitNode unit = (UnitNode) result.getTree();

		setDebugMode(false);
		if (isDebugMode())
			System.out.println("       AST: " + unit.toStringTree());
		setDebugMode(false);

		// if (getErrorCount() > 0) {
		// return null;
		// }
		unit.init();
		unit.setUnitUsed(isParseToplevel()); // top level unit always marked used
		if (isParseToplevel()) {
			setTopLevelUnit(unit);
		}

		if (!(unit.getPkgName().getText().equals(getPackageName()))) {
			reportError(unit.getPkgName(),
					"package name does not match the current directory");
		}

		if (!(unit.getName().getText().equals(getUnitName()))) {
			reportError(unit.getName(),
					"unit name does not match the current file");
		}
		
		enterUnit(unit.getQualName(), unit);
		enterUnitNameMap(unit, theImport); 
		parseImports(unit);
		checkUnitPass1(unit);

		paths.remove(paths.size() - 1);

		return unit;

	}
	static private List<String> metaInstancePaths = new ArrayList<String>();
	/**
	 * @param inputPath
	 * @param theImport		import stmt in client for imported type
	 * @param client		importing client
	 * @param theImportName	name of imported type
	 */
	private void checkParseUnit(String inputPath, ImportNode theImport,
			String client, String theImportName) {
		
		if (theImport != null && theImport.getMeta() != null) {
			String n = client.indexOf('.') != -1 ? client.substring(0, client.lastIndexOf('.')) : client;
			n = client + "/" + n + "." + theImport.getName();
			//System.out.println("metaInstancePath: " + n + ", inputPath " + inputPath);

			if (metaInstancePaths.contains(n) && isDebugMode()) // I no longer think this is an error 
				// TODO track if there are circumstances where meta type instantiations can collide and break resulting code
				ParseUnit.current().reportError(n.substring(n.lastIndexOf('/')+1), "file path is used by multiple meta instantiations. Each meta instantiation should have a unique path.");
			else
				metaInstancePaths.add(n);

		}
		
		if (isDebugMode()) {
			String dbgStr = "  setup parse : ";
			String asName = theImport != null ? " as " + theImport.getName().getText() : "";
			dbgStr += "parse \'" + ParseUnit.mkPackageName(inputPath) + "."
					+ ParseUnit.mkUnitName(inputPath)
					+ "\', imported in client \'" + client
					+ "\' with \'import " + theImportName  + asName + "\' statement";
			if (theImport != null && theImport.getMeta() != null) {
				dbgStr += ", meta args ";
				String comma = "";
				for (BaseNode b : theImport.getMeta()) {
					dbgStr += comma;
					if (b.getType() != pollenParser.NIL)
						dbgStr += b.getText() + "." + b.getChild(0).getText();
					else
						dbgStr += "<none, use default>";
					comma = ", ";
				}

			}
			System.out.println(dbgStr);
		}
	}

	private UnitNode parseUnit(String inputPath) throws Exception {
		return parseUnit(inputPath, null, null);
	}

	/**
	 * @param inputPath
	 *            for a pollen file
	 * @return the package name
	 */
	public static String mkPackageName(String inputPath) {
		int k = inputPath.lastIndexOf(File.separator);
		int j = inputPath.lastIndexOf(File.separator, k - 1);
		j = j == -1 ? 0 : j + 1;
		return inputPath.substring(j, k);
	}

	/**
	 * @param inputPath
	 *            for a pollen file
	 * @return the unit name
	 */
	public static String mkUnitName(String inputPath) {
		int k = inputPath.lastIndexOf(".");
		int j = inputPath.lastIndexOf(File.separator, k - 1);
		j = j == -1 ? 0 : j + 1;
		return inputPath.substring(j, k);

	}

	public static File cacheFile(String qualName, String suffix) {

		int k = qualName.lastIndexOf('.');
		String pn = qualName.substring(0, k);
		String un = qualName.substring(k + 1);		
		File dir = new File(ProcessUnits.getWorkingDir() + '/' + pn + '/' + un);
		dir.mkdirs();
		currFile = new File(dir, un + suffix);
		return currFile;
	}

	public static File currFile() {
		return currFile;
	}

	/**
	 * Parse the pollen file and all required imports.
	 * 
	 * @return the map of parsed unitNodes.
	 * @throws Exception
	 */
	public HashMap<String, UnitNode> parseUnits() throws Exception {

		currUnitNode = parseUnit(path);
		UnitNode topLevelUnit = currUnitNode;
		
		for (UnitNode u : checkUnitsPass2) { 

			checkUnitPass2(u);  // pass 2: inter unit references
		} 
		int iter = 0;
		boolean foundUsedUnit = false;
		while (true) {
			iter++;
			for (UnitNode u : checkUnitsPass2) { 

				boolean flag = checkUnitPassN(u);  // pass N: finish up marking units used.
				foundUsedUnit = flag ? true : foundUsedUnit;
			}
			if (!foundUsedUnit)
				break;
			if (iter > 10)
				break;
		}
		if (iter > 10) {
			this.reportWarning(topLevelUnit, "checkUnitPassN, n exceeded limit");
			for (UnitNode u : checkUnitsPass2) {
				u.setUnitUsed(true); // worst case but will work
			}
		}
		
		currUnitNode = topLevelUnit;
		return unitMap;
	}

	private List<UnitNode> checkUnitsPass2 = new ArrayList<UnitNode>();
	/**
	 * doPass1
	 * Called from parseUnit(), after a parse/parseImports completes.
	 * 
	 * @param unit
	 */
	private void checkUnitPass1(UnitNode unit) {		
		currUnitNode = unit;
		
		unit.doPass1();		// internal unit references
		checkUnitsPass2.add(unit);
		
		currUnitNode = null;
	}
	/**
	 * doPass2
	 * Called from parseUnits() after all parsing.
	 * 
	 * @param unit
	 */
	private void checkUnitPass2(UnitNode unit) {

		currUnitNode = unit;
		
		unit.doPass2();

		currUnitNode = null;
	}
	/*
	 * doPass3
	 * 
	 * @param unit
	 * @return true if this pass resulting in newly marking a unit used
	 */
	private boolean checkUnitPassN(UnitNode unit) {

		currUnitNode = unit;
		boolean usedUnitFound = unit.isUnitUsed();
		
		unit.doPassN();
		
		usedUnitFound = unit.isUnitUsed() && !usedUnitFound;

		currUnitNode = null;
		
		return usedUnitFound;
	}

	public UnitNode getCurrUnitNode() {
		return currUnitNode;
	}

	public String getFileName() {
		String p = this.getCurrPath();
		if (p.indexOf(File.separator) != -1) {
			return p.substring(p.lastIndexOf(File.separator) + 1);
		}
		return p;
	}
	/**
	 * Calling this will mean the javascript for this unit will not be called. 
	 * It means the error will cause rhino to abort with a stack trace.
	 * @param node
	 * @param msg
	 */
	public void reportSeriousError(BaseNode node, String msg) {
		ParseUnit.current().getCurrUnitNode().incSeriousErrorCount();
		ParseUnit.incSeriousErrorCount();
		reportError(node, msg);
	}
	/**
	 * Calling this will mean the javascript for this unit will not be called. 
	 * It means the error will cause rhino to abort with a stack trace.
	 * @param f file name
	 * @param msg
	 */
	public void reportSeriousError(String f, String msg) {
		ParseUnit.current().getCurrUnitNode().incSeriousErrorCount();
		ParseUnit.incSeriousErrorCount();
		reportError(f, msg);
	}

	/**
	 * 
	 * @param node
	 * @param msg
	 */
	public void reportError(BaseNode node, String msg) {
		if (node instanceof ExprNode.Ident) {
			if (ParseUnit.isIntrinsicCall(((ExprNode.Ident) node).getName().getText()))
				return;
			msg = "'" + ((ExprNode.Ident) node).getName() + "': " + msg;
		}

		reportErrorConsole(node.getFileName(), node.getLine(), node
				.getCharPositionInLine() + 1, msg);
	}
	/**
	 * 
	 * @param node
	 * @param msg
	 */
	public void reportWarning(BaseNode node, String msg) {
		if (!ProcessUnits.isWarnings())
			return;
		if (node instanceof ExprNode.Ident) {
			msg = "'" + ((ExprNode.Ident) node).getName() + "': " + msg;
		}

		reportErrorConsole(node.getFileName(), node.getLine(), node
				.getCharPositionInLine() + 1, "(warning) " + msg);
	}


	/**
	 * Consistency check - only emitted if debug is ON.
	 */
	public static void internalMsg(String msg) {
		if (ParseUnit.isDebugMode())
			System.err.println("\nInternal: " + msg + "\n");
	}

	/**
	 * 
	 * @param e
	 *            - Exception object
	 * @param msg
	 */
	public void reportError(RecognitionException e, String msg) {
		reportErrorConsole(getFileName(), e.line, e.charPositionInLine + 1, msg);

	}

	/**
	 * 
	 * @param fname
	 *            file name
	 * @param msg
	 */
	public void reportError(String fname, String msg) {
		String quote = "'";
		fname = fname != null ? fname : getPackageName() + "." + getFileName();
		msg = quote + fname + quote + ": " + msg;
		reportErrorConsole(fname, 0, 0, msg);
	}
	/**
	 * Calling this will mean the javascript for this unit will not be called. 
	 * It means the error will cause rhino to abort with a stack trace.
	 * @param token
	 * @param msg
	 */
	public void reportSeriousError(CommonToken token, String msg) {
		ParseUnit.current().getCurrUnitNode().incSeriousErrorCount();
		ParseUnit.incSeriousErrorCount();
		reportError(token, msg);
	}

	/**
	 * 
	 * @param token
	 * @param msg
	 */
	public void reportError(CommonToken token, String msg) {
		String quote = "'";
		msg = quote + token.getText() + quote + ": " + msg;
		String fname = token instanceof Atom ? ((Atom) token).getFileName()
				: getFileName();
		if (fname == null)
			fname = getFileName();
		reportErrorConsole(fname, token.getLine(), token
				.getCharPositionInLine() + 1, msg);
	}
	
	public void reportJavascriptError(String msg) {
		err.printf("%s: %s\n", "javascript", msg);
		errorCount += 1;
	}

	/**
	 * Report to console.
	 * 
	 * @param fileName
	 * @param line
	 * @param col
	 * @param msg
	 */
	private void reportErrorConsole(String fileName, int line, int col,
			String msg) {

		String key = fileName + line + msg; // don't emit duplicate error
													// msgs.
		if (!ParseUnit.isDebugMode() && errors.containsKey(key))
			return;
		errors.put(key, key);
		err.printf("%s, line %d:%d, %s\n", fileName, line, col, msg);
		errorCount += 1;
	}

	public void reportFailure(Exception e) {
		if (ProcessUnits.isVerbose())
			e.printStackTrace(err);
		throw new Termination(e.getMessage());
	}
	
	public void reportFailure(Exception e, String msg) {
		if (ProcessUnits.isVerbose())
			e.printStackTrace(err);
		throw new Termination(msg);
	}

	public void reportFailure(String msg) {
		throw new Termination(msg);
	}

}
