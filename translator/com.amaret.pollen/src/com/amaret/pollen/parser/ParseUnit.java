package com.amaret.pollen.parser;

import java.io.File;
import java.io.PrintStream;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonToken;
import org.antlr.runtime.RecognitionException;


public class ParseUnit {
	
	private String path;
	private int parseErrors;
	private ANTLRFileStream in;
	private PrintStream out;
	private PrintStream err;
	private PrintStream info;
	private static ParseUnit currUnit;
	private SymbolTable symbolTable;
	
	public SymbolTable getSymbolTable() {
		return symbolTable;
	}

	private ParseUnit(String inputPath, PrintStream outputStream,
			PrintStream errorStream, PrintStream infoStream, SymbolTable symtab) {

		path = inputPath;
		out = outputStream;
		err = errorStream;
		info = infoStream;
		symbolTable = symtab;
	}

	public static void startUnit(String inputPath, PrintStream outputStream,
			PrintStream errorStream, PrintStream infoStream, SymbolTable symtab) {

		currUnit = new ParseUnit(inputPath, outputStream, errorStream,
				infoStream, symtab);

	}
	
	public static ParseUnit current() {
		return currUnit;
	}
	
	public void parseUnit() throws Exception{

		in = new ANTLRFileStream(path);

	}
	
	public String getFileName() {
		if (path.indexOf(File.separator) != -1) {
			return path.substring(path.lastIndexOf(File.separator)+1);			
		}
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
        parseErrors += 1;
    }

}
