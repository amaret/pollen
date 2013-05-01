package com.amaret.pollen.parser;

import org.antlr.runtime.CommonToken;

import com.amaret.pollen.parser.DeclNode.Fcn;

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
    	boolean dbg = false;
    	export.setText(ParseUnit.EXPORT_PREFIX+name.getText());
    	currUnit.getCurrUnitNode().defineSymbol(export, this);
    	if (dbg) {
			ParseUnit.current().reportError(currUnit.getCurrUnitNode(), "** enterExport() for symbol '" + export.getText() + "' in scope " + currUnit.getCurrUnitNode().getQualName());
    	}
    }
    
    @Override
    protected boolean pass1Begin() {
    	ParseUnit currUnit = ParseUnit.current();
    	//System.out.println("** ExportNode " + this.getName().getText() + " pass1Begin(), unit " + currUnit.getUnitName());
        Atom name = getName();
        boolean dbg = name.getText().equals("Mcu.cycle"); // || name.getText().equals("clear"); // || name.getText().equals("ATmega328");
   		if (dbg)
			dbg = false;
        SymbolEntry sym = currUnit.getSymbolTable().resolveSymbol(name);
        // If the sym is null, this could be an exported host function
        // so check the host scopes.
        if (sym == null) 
        	sym = currUnit.getSymbolTable().resolveSymbol(name, true);
        ISymbolNode snode = sym == null ? null : sym.node();
        String[] path = name.getText().split("\\.");
        if (!(snode instanceof ImportNode)) {
        	SymbolEntry sym2 = currUnit.getSymbolTable().lookupName(path[0]);
        	ISymbolNode snode2 = sym2 == null ? null : sym2.node();
        	if (!(snode2 instanceof ImportNode)) {
        		DeclNode.Usr base = currUnit.getCurrUnitNode().getUnitType().getBaseType();
        		boolean notFound = true;
        		while (base != null) { // if not found check base symbol tables
        			sym2 = base.lookupName(path[0]);
        			snode2 = sym2 == null ? null : sym2.node();
        			if (sym2 == null)
        				base = base.getBaseType();
        			else {
        				notFound = false;
        				break;  // found
        			}
        		}
        		if (notFound)
        			currUnit.reportError(name, "not an imported unit");
        	}
        	else {
            	if (path.length > 1) {  // enter exported functions so they can be found.
            		((ImportNode) snode2).setExport(true);
            		Atom n1 = new Atom(name);
            		n1.setText(path[1]);
            		if (snode == null) {
            			// this is a function that is not explicitly exported. 
            			UnitNode u1 = ((ImportNode) snode2).getUnit();
            			String mod = ((ImportNode) snode2).getUnitName().getText();
            			// Exporting from a derived composition does not requre exporting from a base composition (I think)
            			//currUnit.reportError(name, "in \'" + mod + "\' this name should be explicitly exported");   
            			SymbolEntry s2 = u1.lookupName(mod);
            			if (s2.scope() instanceof UnitNode) {
            				sym = s2.scope().resolveSymbol(name);
            				snode = sym == null ? null : sym.node();   
            			}        				            			
            		}
            		if (snode != null) {
            			currUnit.getSymbolTable().defineSymbol(n1, snode);
            			currUnit.getCurrUnitNode().defineSymbol(n1, snode);   
            			//            		n.setText(u + "." + path[1]);
            			//            		currUnit.getSymbolTable().defineSymbol(n, snode);
            			//            		currUnit.getCurrUnitNode().defineSymbol(n, snode);   

            			currUnit.getCurrUnitNode().addFcn(n1.getText(), (Fcn) snode);
            			Atom n2 = new Atom(name);
            			n2.setText(path[0]);
            			enterExport(n2);
            		}
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
