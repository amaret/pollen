package com.amaret.pollen.parser;

import java.io.File;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Stack;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonToken;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.TreeAdaptor;

import com.amaret.pollen.driver.ProcessUnits.Termination;


public class ParseUnit {
	
	private String path;
	private int errorCount;
	public int getErrorCount() {
		return errorCount;
	}

	private ANTLRFileStream in;
	private PrintStream out;
	private PrintStream err;
	private PrintStream info;
	private static ParseUnit currParse;
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
	

	public String getPackageName() {
		return packageName;
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
            
            if (!(impSnode instanceof ImportNode)) {
                try {
                    impUnit = parseUnit(pkgPath + File.separator + fromPkg + File.separator + imp.getUnitName());
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
                    importGeneric(unit, imp, impUnit);
                }
                impUnit.addClient(unit);
                unitMap.put(impUnit.getQualName(), impUnit);
           }
        }

        impChain.pop();
    }
	
	/**
	 * @param unit
	 * @param imp
	 * @param impUnit
	 */
	private void importGeneric(UnitNode unit, ImportNode imp, UnitNode impUnit) {
		// TODO Auto-generated method stub
		
	}


	private UnitNode parseUnit(String inputPath) throws Exception {
		
		
        int k = inputPath.lastIndexOf('.');
        int j = inputPath.lastIndexOf(".", k-1);
        j = j == -1 ? 0 : j+1;
        packageName = inputPath.substring(j, k);
        uname = inputPath.substring(k + 1);     

		in = new ANTLRFileStream(inputPath);
		
        pollenLexer lexer = new pollenLexer(in, getFileName());

        AtomStream tokens = new AtomStream(lexer);
        tokens.discardOffChannelTokens(true);
        pollenParser parser = new pollenParser(tokens);

        parser.setTreeAdaptor((TreeAdaptor)new BaseNodeAdaptor());
        pollenParser.unit_return result = parser.unit();

        if (!(result.getTree() instanceof UnitNode)) {
            return null;
        }
        
        UnitNode unit = (UnitNode)result.getTree();
        if (getErrorCount() > 0) {
            return null;
        }       
        unit.init();
        
        if (!(unit.getPkgName().getText().equals(packageName))) {
            reportError(unit.getPkgName(), "package name does not match the current directory");
        }

        if (!(unit.getName().getText().equals(uname))) {
            reportError(unit.getName(), "unit name does not match the current file");
        }
        
        unitMap.put(unit.getQualName(), unit);
        parseImports(unit);
        checkUnit(unit);

        return unit;

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

        unit.defineSymbol(unit.getName(), unit);
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
		if (path.indexOf(File.separator) != -1) {
			return path.substring(path.lastIndexOf(File.separator)+1);			
		}
		return path;
	}
	public String getPath() {
		return path;
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
