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
        String[] path = name.getText().split("\\.");
        if (!(snode instanceof ImportNode)) {
        	sym = currUnit.getSymbolTable().lookupName(path[0]);
        	ISymbolNode snode2 = sym == null ? null : sym.node();
        	if (!(snode2 instanceof ImportNode)) {
        		currUnit.reportError(name, "not an imported unit");
        	}
        	else {
            	if (path.length > 1) {  // enter exported functions so they can be found.
            		Atom exportName = new Atom(name);
            		exportName.setText(path[1]);
            		currUnit.getSymbolTable().defineSymbol(exportName, snode);
            	}
        	}
        }
        else {
        	((ImportNode) snode).setExport(true);
        }

        currUnit.getCurrUnitNode().getExportList().add(this);
        return false;
    }
}
