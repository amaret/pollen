package com.amaret.pollen.parser;

import java.io.File;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
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
	private String uname = "";
	private String packageName = "";	
    private Stack<String> impChain;
    private HashMap<String,UnitNode> unitMap;
    private HashMap<String, String>	packages;

	
	public SymbolTable getSymbolTable() {
		return symbolTable;
	}
	
	public void setCurrUnitNode(UnitNode currUnitNode) {
		this.currUnitNode = currUnitNode;
	}

	public int getErrorCount() {
		return errorCount;
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


	private ParseUnit(String inputPath, HashMap<String, String> pkgs,
			PrintStream outputStream, PrintStream errorStream, PrintStream infoStream, SymbolTable symtab) {
	
		path = inputPath;
		out = outputStream;
		err = errorStream;
		info = infoStream;
		symbolTable = symtab;
		packages = pkgs;		
        impChain = new Stack<String>();
        errorCount = 0;
        unitMap = new HashMap<String, UnitNode>();

	}
    public UnitNode findUnit(String qualName) {
        return unitMap.get(qualName);
    }


	/**
	 * Initialize and start up for parse phase.
	 * @param inputPath
	 * @param pkgs
	 * @param outputStream
	 * @param errorStream
	 * @param infoStream
	 * @param symtab
	 */
	public static void initParse(String inputPath, HashMap<String, String> pkgs,
			PrintStream outputStream, PrintStream errorStream, PrintStream infoStream, SymbolTable symtab) {

		currParse = new ParseUnit(inputPath, pkgs, outputStream,
				errorStream, infoStream, symtab);
		// Put the output somewhere convenient.
        // TODO make a command line option for location of output directory.
		String wdir = inputPath.substring(0, inputPath.lastIndexOf(File.separator));
        wdir = wdir.substring(0, wdir.lastIndexOf(File.separator));
        wdir += '/' + ParseUnit.mkPackageName(inputPath) + "_out"; 
        File dir = new File (wdir);
        dir.mkdirs();
        ProcessUnits.setWorkingDir(wdir);
		

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

        impChain.push(unit.getQualName());

        for (ImportNode imp : unit.getImports()) {

            String fromPkg = imp.getFrom().getText();
            String pkgPath = packages.get(fromPkg);
            
            SymbolEntry impSym = unit.resolveSymbol(imp.getFrom());
            ISymbolNode impSnode = impSym == null ? null : impSym.node();
            UnitNode impUnit = null;
            
            // Non-null if parser instantiates meta type
            UnitNode client = null;
            ImportNode clientImport = null;
            if (imp.getMeta() != null) {
            	client = unit;
            	clientImport = imp;
            }
               
            if (!(impSnode instanceof ImportNode)) {
                try {
                    impUnit = parseUnit(pkgPath + File.separator + imp.getUnitName() + ".p", client, clientImport);
                }
                catch (Termination te) {
                    reportError(imp, te.getMessage());
                }
            }

            else {
                UnitNode sourceUnit = ((ImportNode) impSnode).getUnit();
                // look for the name in the sourceUnit
                // A visible name must have 'isExport' true
                SymbolEntry expSym = sourceUnit.resolveSymbol(imp.getUnitName());
                ISymbolNode expSnode = expSym != null ? expSym.node() : null;
                if (expSnode instanceof ImportNode && ((ImportNode) expSnode).isExport()) {
                    impUnit = ((ImportNode) expSnode).getUnit();
                }
                else {
                    reportError(imp.getUnitName(), "not an exported unit");
                    continue;
                }
            }

            if (impUnit != null) {
                Atom name = imp.getName();
                if (unit.defineSymbol(name, imp) == false) {
                    reportError(name, "identifier already defined in the current scope");
                    continue;
                }
                if (imp.getMeta() == null) {
                    if (impUnit.isMeta()) {
                        reportError(imp.getUnitName(), "no meta arguments provided");
                        continue;
                    }
                    imp.bindUnit(impUnit);
                }
                else {
                    if (!impUnit.isMeta()) {
                        reportError(imp.getUnitName(), "meta arguments provided but not a meta type");
                        continue;
                    }
                    if (errorCount > 0) {
                        continue;
                    }
                    TypeRules.checkMetaArgs(impUnit, imp.getMeta());
                    if (errorCount > 0) {
                        continue;
                    }
                    imp.bindUnit(impUnit);
                }
                impUnit.addClient(unit);
                unitMap.put(impUnit.getQualName(), impUnit);
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
		
		paths.add(inputPath);
		in = new ANTLRFileStream(inputPath);
		
        pollenLexer lexer = new pollenLexer(in, getFileName());

        AtomStream tokens = new AtomStream(lexer);
        tokens.discardOffChannelTokens(true);
        pollenParser parser = new pollenParser(tokens, client, clientImport);

        parser.setTreeAdaptor((TreeAdaptor)new BaseNodeAdaptor());
        pollenParser.unit_return result = parser.unit();

        if (!(result.getTree() instanceof UnitNode)) {
            return null;
        }
        
        UnitNode unit = (UnitNode)result.getTree();
       
        System.out.println( unit.toStringTree());
       
        if (getErrorCount() > 0) {
            return null;
        }       
        unit.init();
        
        if (!(unit.getPkgName().getText().equals(getPackageName()))) {
            reportError(unit.getPkgName(), "package name does not match the current directory");
        }

        if (!(unit.getName().getText().equals(getUnitName()))) {
            reportError(unit.getName(), "unit name does not match the current file");
        }
        
        unitMap.put(unit.getQualName(), unit);
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

	
	public static File createFile(String qualName, String suffix) {
        
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

        if (getErrorCount() == 0) {
            unit.doPass1();
        }

        if (getErrorCount() == 0) {
            unit.doPass2();
        }
        
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
        err.printf("%s, line %d:%d, %s\n", fileName, line, col, msg);
        errorCount += 1;
    }

}
