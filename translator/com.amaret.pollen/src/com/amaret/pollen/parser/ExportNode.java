package com.amaret.pollen.parser;

import org.antlr.runtime.CommonToken;

public class ExportNode extends BaseNode {

    static private final int NAME = 0;
    
    ExportNode(int ttype, String ttext) {
        this.token = new Atom(ttype, ttext);
    }
    
    public Atom getName() {
        return ((BaseNode) getChild(NAME)).getAtom();
    }
    
    @Override
    protected boolean pass1Begin() {
    	ParseUnit currUnit = ParseUnit.current();
        Atom name = getName();
        SymbolEntry sym = currUnit.getSymbolTable().resolveSymbol(name);
        ISymbolNode snode = sym == null ? null : sym.node();
        if (!(snode instanceof ImportNode)) {
            currUnit.reportError(name, "not an imported unit");
        }
        else {
        	((ImportNode) snode).setExport(true);
        }
        currUnit.getCurrUnitNode().getExportList().add(this);
        return false;
    }
}
