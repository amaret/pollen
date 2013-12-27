package com.amaret.pollen.parser;

import java.io.File;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Stack;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonToken;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.TreeAdaptor;

import com.amaret.pollen.driver.ProcessUnits;
import com.amaret.pollen.driver.ProcessUnits.Termination;

public class ParseUnit {

	private String path;
	private ArrayList<String> paths = new ArrayList<String>();
	private static int errorCount;
	private static int seriousErrorCount;
	private ANTLRFileStream in;
	private PrintStream out;
	private PrintStream err;
	private PrintStream info;
	private static ParseUnit currParse;
	private static File currFile;
	private static String pollenFile; // the .p file supplied to pollen translator
	private static String pollenPkg;
	private UnitNode currUnitNode = null;
	private SymbolTable symbolTable;
	private Properties properties;
	private Stack<String> impChain;
	private HashMap<String, UnitNode> unitMap;
	private HashMap<String, String> packages;
	private HashMap<String, String> errors;
	private List<String> metaModules = new ArrayList<String>();
	static private boolean debugMode = false;
	
	// pollen names
	public static final String EXPORT_PREFIX = "$$export";
	public static final String INTRINSIC_PREFIX = "pollen__";
	public static final String DEFAULT_LOOPVAR = INTRINSIC_PREFIX + "loopvar"; // for loops w/ undeclared loop variables
	public static final String INTRINSIC_UNITVAR = INTRINSIC_PREFIX +"unitname";
	public static final String INTRINSIC_PRINT_PROTOCOL= "PrintP";
	public static final String INTRINSIC_PRINT_PROXY = "$$printProxy";
	public static final String CTOR_CLASS_TARGET = "new_";
	public static final String CTOR_CLASS_HOST = "new_host";
	public static final String CTOR_MODULE_TARGET = "targetInit";
	public static final String CTOR_MODULE_HOST = "$$hostInit";
	public static final String PRIVATE_INIT = "$$privateInit";
	public static final String PRESET_INIT = INTRINSIC_PREFIX + "presets__";
	public static final String KIND_EXTERN = "__E";
	public static final String KIND_INTERN = "__I";
	public static final String KIND_ARRAY = "__A";
	public static final String KIND_VAR = "__V";
	
	public static boolean isIntrinsicCall(String s) {
		if (!(s.matches(ParseUnit.INTRINSIC_PREFIX + ".*")))
			return false;
		if (s.equals(ParseUnit.INTRINSIC_UNITVAR))
			return false;
		if (s.equals(ParseUnit.INTRINSIC_PREFIX + ParseUnit.DEFAULT_LOOPVAR))
			return false;			
		return true;
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
		POLLEN_ROOT
	}

	public PrintStream getErrorStream() {
		return err;
	}

	public String getPollenRoot() {
		return ProcessUnits.getPollenRoot();
	}

	public PrintStream getInfoStream() {
		return info;
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
	 * Used for serious errors only... so avoid javascript aborts, for example
	 * @return
	 */
	public static int getSeriousErrorCount() {
		return seriousErrorCount;
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
		out.printf("%s", ProcessUnits.version() + "\n");
	}

	public String getProperty(Property key) {
		return properties.getProperty(key.name());
	}

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

	public void enterUnit(String qualname, UnitNode unit) {
		if (!unit.isVoid()) { // deferred instantiation ('{}')
			UnitNode tmp = unitMap.put(qualname, unit);
			if (!unit.getUnitType().getMetaQualName().isEmpty()) {
				String pkg = qualname.substring(0,
						qualname.lastIndexOf(".") + 1);
				unitMap.put(pkg + unit.getUnitType().getMetaQualName(), unit);
			}
		}
	}

	public UnitNode findUnit(String qualName) {
		return unitMap.get(qualName);
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
			ISymbolNode currSnode = currSym == null ? null : currSym.node();
			
			SymbolEntry currExportSym = null;
			UnitNode client = unit;
			ImportNode clientImport = currImport;
			
			String cname = client != null ? client.getQualName() : "<no import>";
			String ciname = clientImport != null ? clientImport.getQualName()
					: "<none>";

			
			// import is instantiated primitive type
			if (Cat.Scalar.codeFromString(currImport.getUnitName().getText()) != null) {
				// primitive type: don't import (instantiation side effect)
				Atom name = currImport.getName();
				unit.defineSymbol(name, currImport);
				checkParseUnit(pkgPath + File.separator
						+ currImport.getUnitName() + ".p", clientImport, cname, ciname);
				continue;
			}
			
			// import is instantiated meta type
			if (currSnode == null && currImport.isTypeMetaArg()) {
				// if this is an instantiated meta type, its pollen file won't exist
				currSnode = findUnit(fromPkg + "." + currImport.getQualName());
				if (currSnode != null && currSnode instanceof UnitNode) {
					currUnit = (UnitNode) currSnode;
					currImport.bindUnit(currUnit);
					Atom name = currImport.getName();
					unit.defineSymbol(name, currImport);
					currUnit.addClient(unit);
					this.enterUnit(currUnit.getQualName(), currUnit);
					checkParseUnit(pkgPath + File.separator
							+ currImport.getUnitName() + ".p", clientImport, cname, ciname);
					continue;
				}
			}

			boolean dbg = true;
			if (ParseUnit.isDebugMode()) {
				String s = "**   ParseUnit.parseImports(): " + fromPkg + "."
						+ currImport.getUnitName().getText()
						+ (pkgPath == null ? " (a composition)" : "");
				System.out.println(s);

			}

			if (!(currSnode instanceof ImportNode)) {
				try {

					if (pkgPath == null) {
						// Assume this is a composition in the default package:
						// 'from c import m'
						// In that case fromPkg contains the composition name
						// 'c'.
						currImport.setFromComposImportModule(true);
						pkgPath = path.substring(0, path
								.lastIndexOf(File.separator));
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
								+ ".p", client, clientImport);

					} else {
						currUnit = parseUnit(pkgPath + File.separator
								+ currImport.getUnitName() + ".p", client,
								clientImport);
					}

				} catch (Termination te) {
					reportError(currImport, te.getMessage());
				}
			}

			else {
				currUnit = ((ImportNode) currSnode).getUnit();
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
	}

	/**
	 * 
	 * @param inputPath
	 *            pollen file
	 * @param client
	 *            client unit (for meta type instantiation)
	 * @param clientImport
	 *            client unit import (for meta type instantiation, has meta
	 *            parameters) Client parameters are null for non-meta
	 *            instantiation parse.
	 * @return AST (UnitNode)
	 * @throws Exception
	 */
	private UnitNode parseUnit(String inputPath, UnitNode client,
			ImportNode clientImport) throws Exception {

		String cname = client != null ? client.getQualName() : "<no import>";
		String ciname = clientImport != null ? clientImport.getQualName()
				: "<none>";

		setDebugMode(false);
		//setDebugMode(true);
		checkParseUnit(inputPath, clientImport, cname, ciname);
		File f = new File(inputPath);
		if (!f.exists()) {
			reportError(getPackageName() + "." + getFileName(),
					"Missing file \'" + ParseUnit.mkUnitName(inputPath) + "\'");
			return null;
		}

		paths.add(inputPath);
		in = new ANTLRFileStream(inputPath);

		pollenLexer lexer = new pollenLexer(in, getPackageName() + "."
				+ getFileName());

		AtomStream tokens = new AtomStream(lexer);
		tokens.discardOffChannelTokens(true);
		parser = new pollenParser(tokens, client, clientImport);

		parser.setTreeAdaptor((TreeAdaptor) new BaseNodeAdaptor());
		pollenParser.unit_return result = parser.unit();

		if (!(result.getTree() instanceof UnitNode)) {
			return null;
		}

		UnitNode unit = (UnitNode) result.getTree();

		//setDebugMode(true);
		if (isDebugMode())
			System.out.println("       AST: " + unit.toStringTree());
		setDebugMode(false);

		// if (getErrorCount() > 0) {
		// return null;
		// }
		unit.init();

		if (!(unit.getPkgName().getText().equals(getPackageName()))) {
			reportError(unit.getPkgName(),
					"package name does not match the current directory");
		}

		if (!(unit.getName().getText().equals(getUnitName()))) {
			reportError(unit.getName(),
					"unit name does not match the current file");
		}
		enterUnit(unit.getQualName(), unit);
		parseImports(unit);
		checkUnit(unit);
		paths.remove(paths.size() - 1);

		return unit;

	}
	static private List<String> metaInstancePaths = new ArrayList<String>();
	/**
	 * @param inputPath
	 * @param clientImport
	 * @param client
	 * @param ciname
	 */
	private void checkParseUnit(String inputPath, ImportNode clientImport,
			String client, String ciname) {
		
		if (clientImport != null && clientImport.getMeta() != null) {
			String n = client.indexOf('.') != -1 ? client.substring(0, client.lastIndexOf('.')) : client;
			n = client + "/" + n + "." + clientImport.getName();
			//System.out.println("metaInstancePath: " + n + ", inputPath " + inputPath);

			if (metaInstancePaths.contains(n) && isDebugMode()) // I no longer think this is an error 
				// TODO track if there are circumstances where meta type instantiations can collide and break resulting code
				ParseUnit.current().reportError(n.substring(n.lastIndexOf('/')+1), "file path is used by multiple meta instantiations. Each meta instantiation should have a unique path.");
			else
				metaInstancePaths.add(n);

		}
		
		if (isDebugMode()) {
			String dbgStr = "  START parseUnit() : ";
			String asName = clientImport != null ? " as " + clientImport.getName().getText() : "";
			dbgStr += "parse \'" + ParseUnit.mkPackageName(inputPath) + "."
					+ ParseUnit.mkUnitName(inputPath)
					+ "\', imported in client \'" + client
					+ "\' with \'import " + ciname  + asName + "\' statement";
			if (clientImport != null && clientImport.getMeta() != null) {
				dbgStr += ", meta args ";
				String comma = "";
				for (BaseNode b : clientImport.getMeta()) {
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
		return unitMap;
	}

	/**
	 * doPass1, doPass2
	 * 
	 * @param unit
	 */
	private void checkUnit(UnitNode unit) {

		// unit.defineSymbol(unit.getName(), unit);
		currUnitNode = unit;

		// if (isDebugMode())
		// System.out.println("  START checkUnit() for " + unit.getName());

		// if (getErrorCount() == 0 || isDebugMode()) {
		unit.doPass1();
		// }

		// if (getErrorCount() == 0 || isDebugMode()) {
		unit.doPass2();
		// }

		currUnitNode = null;
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
		ParseUnit.current().getCurrUnitNode().incErrorCount();
		seriousErrorCount+=1;
		reportError(node, msg);
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
		ParseUnit.current().getCurrUnitNode().incErrorCount();
		seriousErrorCount+=1;
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
		e.printStackTrace(err);
		throw new Termination(e.getMessage());
	}

	public void reportFailure(String msg) {
		throw new Termination(msg);
	}

}
