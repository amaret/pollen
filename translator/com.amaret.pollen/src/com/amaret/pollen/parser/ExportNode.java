package com.amaret.pollen.parser;

import org.antlr.runtime.CommonToken;

public class ExportNode extends BaseNode implements ISymbolNode {

    static private final int NAME = 0;
    private IScope definingScope;
	private IScope enclosingScope;
    
    ExportNode(int ttype, String ttext) {
        this.token = new Atom(ttype, ttext);
        enclosingScope = null;
    }
   
    public IScope getDefiningScope() {
        return definingScope;
    }
    public void setDefiningScope(IScope scope) {
        definingScope = scope;
    }
    
    public void setEnclosingScope(IScope scope) {
        enclosingScope = scope;
    }
    
    public Atom getName() {
        return ((BaseNode) getChild(NAME)).getAtom();
    }
    /**
     * Enter the ExportNode symbol in the unit where the export appears.  
     * This entry will not be copied to other symboltables (unlike imports).
     * @param name
     */
    private void enterExport(Atom name) {
    	ParseUnit currUnit = ParseUnit.current();
    	Atom export = new Atom(name);
    	export.setText("$$export"+name.getText());
    	currUnit.getCurrUnitNode().defineSymbol(export, this);
    }
    
    @Override
    protected boolean pass1Begin() {
    	ParseUnit currUnit = ParseUnit.current();
        Atom name = getName();
        SymbolEntry sym = currUnit.getSymbolTable().resolveSymbol(name);
        ISymbolNode snode = sym == null ? null : sym.node();
        String[] path = name.getText().split("\\.");
        if (!(snode instanceof ImportNode)) {
        	SymbolEntry sym2 = currUnit.getSymbolTable().lookupName(path[0]);
        	ISymbolNode snode2 = sym2 == null ? null : sym2.node();
        	if (!(snode2 instanceof ImportNode)) {
        		currUnit.reportError(name, "not an imported unit");
        	}
        	else {
            	if (path.length > 1) {  // enter exported functions so they can be found.
            		((ImportNode) snode2).setExport(true);
            		Atom n = new Atom(name);
            		n.setText(path[1]);
            		currUnit.getSymbolTable().defineSymbol(n, snode);
            		currUnit.getCurrUnitNode().defineSymbol(n, snode);   
            		n.setText(path[0]);
            		enterExport(n);
            	}
        	}
        }
        else {
        	((ImportNode) snode).setExport(true);
        	enterExport(name);
        }

        currUnit.getCurrUnitNode().getExportList().add(this);
        return false;
    }

	@Override
	public Cat getTypeCat() {
		return null;
	}
}
