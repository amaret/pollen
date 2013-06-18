package com.amaret.pollen.parser;

import java.io.File;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
	private int errorCount;
	private ANTLRFileStream in;
	private PrintStream out;
	private PrintStream err;
	private PrintStream info;
	private static ParseUnit currParse;
	private static File currFile;
	private UnitNode currUnitNode = null;
	private SymbolTable symbolTable;
	private Properties properties;
	private Stack<String> impChain;
	private HashMap<String, UnitNode> unitMap;
	private HashMap<String, String> packages;
	private HashMap<String, String> errors;
	private List<String> metaModules = new ArrayList<String>();
	static private boolean debugMode = false;
	public static final String EXPORT_PREFIX = "$$export";
	public static final String INTRINSIC_PREFIX = "pollen__";
	public static final String DEFAULT_LOOPVAR = "pollen__loopvar"; // uses for
																	// 'for'
																	// loops
																	// with
																	// undeclared
																	// loop
																	// variables

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
		return false;
		// return debugMode;
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

	public int getErrorCount() {
		return 0;
		// return errorCount;
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
		properties = props;
		out = outputStream;
		err = errorStream;
		info = infoStream;
		symbolTable = symtab;
		packages = pkgs;
		impChain = new Stack<String>();
		errorCount = 0;
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

	public void enterUnit(String qualname, UnitNode unit) {
		if (!unit.isVoid()) { // deferred instantiation ('{}')
			unitMap.put(qualname, unit);
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
	 *            TODO
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

			SymbolEntry currSym = unit.resolveSymbol(currImport.getFrom());
			ISymbolNode currSnode = currSym == null ? null : currSym.node();
			UnitNode currUnit = null;
			SymbolEntry currExportSym = null;
			UnitNode client = unit;
			ImportNode clientImport = currImport;
			if (Cat.Scalar.codeFromString(currImport.getUnitName().getText()) != null) {
				// primitive type: don't import (instantiation side effect)
				Atom name = currImport.getName();
				unit.defineSymbol(name, currImport);
				continue;
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
		// setDebugMode(true);
		debugParseUnit(inputPath, clientImport, cname, ciname);
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
		pollenParser parser = new pollenParser(tokens, client, clientImport);

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

	/**
	 * @param inputPath
	 * @param clientImport
	 * @param cname
	 * @param ciname
	 */
	private void debugParseUnit(String inputPath, ImportNode clientImport,
			String cname, String ciname) {
		if (isDebugMode()) {
			String dbgStr = "  START parseUnit() : ";
			dbgStr += "parse \'" + ParseUnit.mkPackageName(inputPath) + "."
					+ ParseUnit.mkUnitName(inputPath)
					+ "\', imported from client \'" + cname
					+ "\' with \'import " + ciname + "\' statement";
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
		// TODO make a command line option for location of output directory
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
	 * 
	 * @param node
	 * @param msg
	 */
	public void reportError(BaseNode node, String msg) {
		if (node instanceof ExprNode.Ident) {
			if (((ExprNode.Ident) node).isIntrisicCall())
				return;
			msg = "'" + ((ExprNode.Ident) node).getName() + "': " + msg;
		}

		reportErrorConsole(node.getFileName(), node.getLine(), node
				.getCharPositionInLine() + 1, msg);
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

		String key = fileName + line + col + msg; // don't emit duplicate error
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
