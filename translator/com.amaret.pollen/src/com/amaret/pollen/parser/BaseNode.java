package com.amaret.pollen.parser;

import org.antlr.runtime.Token;
import org.antlr.runtime.tree.CommonTree;

public class BaseNode extends CommonTree {

    private String fileName;
    private int startIndex;
    private int stopIndex;
    
    BaseNode() {
        fileName = ParseUnit.current().getFileName();
    }
    
    BaseNode(Token t) {
	    super(t);
        fileName = ParseUnit.current().getFileName();
	}
    
    final void doPass1() {
    	
    	String s = this.getFileName();

        if (!pass1Begin()) {
            return;
        }
        if (getChildCount() > 0) {
            for (Object o : getChildren()) {
                ((BaseNode)o).doPass1();
            }
        }
        pass1End();
    }
    
    final void doPass2() {
       if (!pass2Begin()) {
            return;
        }
        if (getChildCount() > 0) {
            for (Object o : getChildren()) {
                ((BaseNode)o).doPass2();
            }
        }
        pass2End();
    }
    
    public Atom getAtom() {
        return (Atom) getToken();
    }
    
    public String getFileName() {
        return fileName;
    }

	int getStartIndex() {
        return startIndex;
    }
    
    int getStopIndex() {
        return stopIndex;
    }
    
    protected boolean pass1Begin() {
        return false;
    }
    
    protected void pass1End() {
    }
    
    protected boolean pass2Begin() {
        return false;
    }
    
    protected void pass2End() {
    }
    
    void setIndexes(int start, int stop) {
        startIndex = start;
        stopIndex = stop;
    }
}
