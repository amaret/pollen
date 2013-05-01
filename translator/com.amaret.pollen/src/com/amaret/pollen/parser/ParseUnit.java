package com.amaret.pollen.parser;

import java.io.File;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Properties;
import java.util.Stack;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonToken;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.Tree;
import org.antlr.runtime.tree.TreeAdaptor;

import com.amaret.pollen.driver.ProcessUnits;
import com.amaret.pollen.driver.ProcessUnits.Termination;
import com.amaret.pollen.target.ITarget;


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
	private String uname = "";
	private String packageName = "";	
    private Stack<String> impChain;
    private HashMap<String,UnitNode> unitMap;
    private HashMap<String, String>	packages;
    private HashMap<String, String> errors;
    static private boolean debugMode = false;
    public static final String EXPORT_PREFIX = "$$export";
    
    
    public static void setDebugMode(boolean debugMode) {
		ParseUnit.debugMode = debugMode;
	}
	public static boolean isDebugMode() {
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

	public int getErrorCount() {
		return 0;
		//return errorCount;
	}
	
	public String getCurrPath() {
		if (paths.size() == 0)
			return path; // default is the input pollen file.
		return paths.get(paths.size()-1);
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
			HashMap<String, String> pkgs, PrintStream outputStream, PrintStream errorStream, PrintStream infoStream, SymbolTable symtab) {
	
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
    			String pkg = qualname.substring(0, qualname.lastIndexOf(".")+1);
    			unitMap.put(pkg + unit.getUnitType().getMetaQualName(), unit);
    		}
    	}
    }

	public UnitNode findUnit(String qualName) {
        return unitMap.get(qualName);
    }


	/**
	 * Initialize and start up for parse phase.
	 * @param inputPath
	 * @param props TODO
	 * @param pkgs
	 * @param outputStream
	 * @param errorStream
	 * @param infoStream
	 * @param symtab
	 */
	public static void initParse(String inputPath, Properties props,
			HashMap<String, String> pkgs, PrintStream outputStream, PrintStream errorStream, PrintStream infoStream, SymbolTable symtab) {

		currParse = new ParseUnit(inputPath, props, pkgs,
				outputStream, errorStream, infoStream, symtab);		

	}
	
	public static ParseUnit current() {
		return currParse;
	}
	/**
	 * Parse the imports. Handle meta parameters. 
	 * @param unit
	 * @throws Exception
	 */
	private void parseImports(UnitNode unit) throws Exception {

		String importer = (impChain.size()>0) ? impChain.get(impChain.size()-1) : "";       
        if (impChain.contains(unit.getQualName()) && impChain.size()>0) {      
        	if (!unit.getUnitType().isMeta()) // Seems to be okay if meta
        		reportError(unit, "In unit \'" + importer + "\' import recursion for \'" + unit.getQualName() + "\' detected");
        }
        
        impChain.push(unit.getQualName());
        

        for (ImportNode imp : unit.getImports()) {

            String fromPkg = imp.getFrom().getText();
            String pkgPath = packages.get(fromPkg);
            
        
            SymbolEntry impSym = unit.resolveSymbol(imp.getFrom());
            ISymbolNode impSnode = impSym == null ? null : impSym.node();
            UnitNode impUnit = null;

            
            UnitNode client = unit;
            ImportNode clientImport = imp;
            if (Cat.Scalar.codeFromString(imp.getUnitName().getText()) != null) {
            	// primitive type: don't import (instantiation side effect)
            	Atom name = imp.getName();
            	unit.defineSymbol(name, imp);
            	continue;        	
            }
            
            if (!(impSnode instanceof ImportNode)) {
            	try {
            		
                    if (pkgPath == null) {
                    	// Assume this is a composition in the default package: 'from c import m'
                    	// In that case fromPkg contains the composition name 'c'.
                        pkgPath = path.substring(0, path.lastIndexOf(File.separator));
                        String pkg = pkgPath + File.separator + fromPkg + ".p";
                        
                		File f = new File(pkg);
                		if (!f.exists()) {
                			if (!(new File(pkgPath + File.separator + fromPkg)).exists()) {
                				reportError(getPackageName() + "." + getFileName(), "missing package \'" + fromPkg + "\'");
                				continue;
                			}
                		}
                        impUnit = parseUnit(pkgPath + File.separator + fromPkg + ".p", client, clientImport);

                    }
                    else {
                    	impUnit = parseUnit(pkgPath + File.separator + imp.getUnitName() + ".p", client, clientImport);
                    }

                }
                catch (Termination te) {
                    reportError(imp, te.getMessage());
                }
            }

            else {
                impUnit = ((ImportNode) impSnode).getUnit();
                if (impUnit == null) {
                    reportError(imp.getUnitName(), "import not bound to unit");
                    continue;
                } 
                // TODO 
                // How to implement export?
                // look for the name in the sourceUnit
                // A visible name must have 'isExport' true
                // This says an import is invalid unless it has isExport() true 
                // which may be Em only. 
//                SymbolEntry expSym = sourceUnit.resolveSymbol(imp.getUnitName());
//                ISymbolNode expSnode = expSym != null ? expSym.node() : null;
//                if (expSnode instanceof ImportNode) { // && ((ImportNode) expSnode).isExport()) {
//                    impUnit = ((ImportNode) expSnode).getUnit();
//                }
//                else {
//                    reportError(imp.getUnitName(), "not an exported unit");
//                    continue;
//                }
            }

            if (impUnit != null) {
                Atom name = imp.getName();
                if (unit.defineSymbol(name, imp) == false) {
                    reportError(name, "identifier already defined in the current scope");
                    continue;
                }
                if (imp.getMeta() == null) {
                	
                    imp.bindUnit(impUnit);
                }
                else {
                	
                    if (!impUnit.isMeta()) {
                        reportError(imp.getUnitName(), "meta arguments provided but not a meta type");
                        continue;
                    }
                    imp.bindUnit(impUnit);
                }
                impUnit.addClient(unit);
                this.enterUnit(impUnit.getQualName(), impUnit);
           }
        }

        impChain.pop();
    }
	
	/**
	 * 
	 * @param inputPath pollen file
	 * @param client 	client unit (for meta type instantiation)
	 * @param clientImport client unit import (for meta type instantiation, has meta parameters)
	 * Client parameters are null for non-meta instantiation parse.
	 * @return AST (UnitNode)
	 * @throws Exception
	 */
	private UnitNode parseUnit(String inputPath, UnitNode client, ImportNode clientImport) throws Exception {
		
		String cname = client != null ? client.getQualName() : "<no import>";
		String ciname = clientImport != null ? clientImport.getQualName() : "<none>";
				
		setDebugMode(false);
		//setDebugMode(true);
		if (isDebugMode()) {			
			String dbgStr = "  START parseUnit() : ";
			dbgStr += "parse \'" + ParseUnit.mkPackageName(inputPath) + "." + ParseUnit.mkUnitName(inputPath) + "\', imported from client \'" + cname + "\' with \'import " + ciname + "\' statement";
			if (clientImport != null && clientImport.getMeta() != null) {
				dbgStr += ", meta args ";
				String comma = "";
				for (BaseNode b : clientImport.getMeta()) {
					dbgStr += comma;
					if (b.getType() != pollenParser.NIL)
						dbgStr += b.getText() + "." + b.getChild(0).getText();
					else dbgStr += "<none, use default>";
					comma = ", ";
				}
			}
			System.out.println(dbgStr);
		}
		File f = new File(inputPath);
		if (!f.exists()) {
			reportError(getPackageName() + "." + getFileName(), "Missing file \'"
					+ ParseUnit.mkUnitName(inputPath) + "\'");
			return null;
		}
	
		paths.add(inputPath);
		in = new ANTLRFileStream(inputPath);
		
        pollenLexer lexer = new pollenLexer(in, getPackageName() + "." + getFileName());

        AtomStream tokens = new AtomStream(lexer);
        tokens.discardOffChannelTokens(true);
        pollenParser parser = new pollenParser(tokens, client, clientImport);

        parser.setTreeAdaptor((TreeAdaptor)new BaseNodeAdaptor());
        pollenParser.unit_return result = parser.unit();

        if (!(result.getTree() instanceof UnitNode)) {
            return null;
        }
        
        UnitNode unit = (UnitNode)result.getTree(); 
        
		setDebugMode(false);
        if (isDebugMode())
        	System.out.println( "       AST: " + unit.toStringTree());
		setDebugMode(false);

 
       
//        if (getErrorCount() > 0) {
//            return null;
//        }       
        unit.init();
        
        if (!(unit.getPkgName().getText().equals(getPackageName()))) {
            reportError(unit.getPkgName(), "package name does not match the current directory");
        }

        if (!(unit.getName().getText().equals(getUnitName()))) {
            reportError(unit.getName(), "unit name does not match the current file");
        }
        
        enterUnit(unit.getQualName(), unit);
        parseImports(unit);
        checkUnit(unit);
        paths.remove(paths.size()-1);

        return unit;

	}

	private UnitNode parseUnit(String inputPath) throws Exception {
		return parseUnit(inputPath, null, null);		
	}

	/**
	 * @param  inputPath for a pollen file
	 * @return the package name
	 */
	public static String mkPackageName(String inputPath) {
		int k = inputPath.lastIndexOf(File.separator);
        int j = inputPath.lastIndexOf(File.separator, k-1);
        j = j == -1 ? 0 : j+1;
        return inputPath.substring(j, k);
	}
	/**
	 * @param  inputPath for a pollen file
	 * @return the unit name
	 */
	public static String mkUnitName(String inputPath) {
		int k = inputPath.lastIndexOf(".");
        int j = inputPath.lastIndexOf(File.separator, k-1);
        j = j == -1 ? 0 : j+1;
        return inputPath.substring(j, k);
       
	}

	
	public static File cacheFile(String qualName, String suffix) {
        
		int k = qualName.lastIndexOf('.');
        String pn = qualName.substring(0, k);
        String un = qualName.substring(k + 1);
        // TODO make a command line option for location of output directory
        File dir = new File ( ProcessUnits.getWorkingDir() + '/' + pn + '/' + un);
        dir.mkdirs();
        currFile = new File(dir, un + suffix);
        return currFile;
	}
	public static File currFile() {
		return currFile;
	}


	/**
	 * Parse the pollen file and all required imports.
	 * @return the map of parsed unitNodes.
	 * @throws Exception
	 */
	public HashMap<String,UnitNode> parseUnits() throws Exception{
		       
        currUnitNode = parseUnit(path);
        return unitMap;
	}
	
	/**
	 * doPass1, doPass2
	 * @param unit
	 */
    private void checkUnit(UnitNode unit) {

        //unit.defineSymbol(unit.getName(), unit);
        currUnitNode = unit;
        
        if (isDebugMode())
        	System.out.println("  START checkUnit() for " + unit.getName());

        //if (getErrorCount() == 0 || isDebugMode()) {
            unit.doPass1();
        //}

        //if (getErrorCount() == 0 || isDebugMode()) {
            unit.doPass2();
        //}
        
        currUnitNode = null;
    }

	
	public UnitNode getCurrUnitNode() {
		return currUnitNode;
	}

	public String getFileName() {
		String p = this.getCurrPath();
		if (p.indexOf(File.separator) != -1) {
			return p.substring(p.lastIndexOf(File.separator)+1);			
		}
		return p;
	}

	/**
	 * 
	 * @param node
	 * @param msg
	 */
	public void reportError(BaseNode node, String msg) {        
        reportErrorConsole(node.getFileName(), node.getLine(), node.getCharPositionInLine() + 1, msg);
    }
    /**
     * 
     * @param e - Exception object
     * @param msg
     */
    public void reportError(RecognitionException e, String msg) {
        reportErrorConsole(getFileName(), e.line, e.charPositionInLine + 1, msg);
        
    }
    /**
     * 
     * @param fname file name
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
        String fname = token instanceof Atom ? ((Atom) token).getFileName() : getFileName();
        if (fname == null) fname = getFileName();
        reportErrorConsole(fname, token.getLine(), token.getCharPositionInLine() + 1, msg);
    }
    
    /**
     * Report to console.
     * @param fileName
     * @param line
     * @param col
     * @param msg
     */
    private void reportErrorConsole(String fileName, int line, int col, String msg) {
    	
    	String key = fileName + line + col + msg; // don't emit duplicate error msgs.
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
