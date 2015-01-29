package com.amaret.pollen.parser;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class BodyNode extends BaseNode implements IScope {

	static final private int FORMALS = 0;  
	static final private int STMTS = 1;   
    static private BodyNode current = null;
    private DeclNode.Fcn fcn = null;
    private List<String> localVarNames = new ArrayList<String>();
    private List<DeclNode> localVars = new ArrayList<DeclNode>();
    private NestedScope scopeDeleg = new NestedScope(this);
            
    BodyNode(int ttype, String ttext) {
      	this.token = new Atom(ttype, ttext);
    }
  
    static BodyNode current() {
        return current;
    }

    public DeclNode.Fcn getFcn() {
    	assert (this.getParent() instanceof DeclNode.Fcn);
    	if (fcn == null) 
    		fcn = (DeclNode.Fcn) this.getParent();
    	return fcn;   	
    }
    @Override
    public String getScopeName() {
    	return (getFcn() != null && getFcn().getDefiningScope() != null ? getFcn().getDefiningScope().getScopeName() + "." + getFcn().getName().getText() : "");
    }
    void addLocalVar(DeclNode.Var var) {
    	String  name = var.getName().getText();
    	if (name.matches(ParseUnit.POLLEN_PREFIX + ".*"))
    		return;
		if (getFcn() != null && getFcn().isHost()) {
			if (ParseUnit.isJavaScriptRsvdWord(var.getName().getText())) {
				ParseUnit.current().reportSeriousError(this, "'" + var.getName().getText() + "' is an invalid name in the host phase (reserved in javascript)");
			}
		}
    	if (localVarNames.contains(name)) {
    		ParseUnit.current().reportError(var, "'" + name + "': duplicate local variable name in function scope not allowed");
    		return;
    	}
    	else {
    		localVarNames.add(name);
    	}
        if (var != null) { 
            localVars.add(var);
        }
    }  
    @SuppressWarnings("unchecked")
    public List<StmtNode> getStmts() {
        return ((ListNode<StmtNode>) getChild(STMTS)).getElems();
    }
    
    @Override
    protected boolean pass1Begin() {
        ParseUnit.current().getSymbolTable().enterScope(this);
        current = this;
        return true;
    }
    
    @Override
    protected void pass1End() {
        ParseUnit.current().getSymbolTable().leaveScope();
        current = null;
    }
    
    @Override
    protected boolean pass2Begin() {
        current = this;
        ParseUnit.current().getSymbolTable().enterScope(this);
        // TODO any host checks?
        // ParseUnit.current().setHostFlag(getFcn().isHost());
        return true;
    }
    
    @Override
    protected void pass2End() {
    	ParseUnit.current().getSymbolTable().leaveScope();
    	current = null;
    }
    
    @Override
    public void replaceSymbol(Atom name, ISymbolNode symbol) {
        scopeDeleg.replaceSymbol(name, symbol);
    }

    @Override
    public SymbolEntry resolveSymbol(Atom name) {
        return scopeDeleg.resolveSymbol(name);
    }

    @Override
    public void setEnclosingScope(IScope scope) {
        scopeDeleg.setEnclosingScope(scope);
    }
    
    @Override
    public SymbolEntry lookupName(String name) {
        return scopeDeleg.lookupName(name);
    }    
    
    @Override
    public SymbolEntry lookupName(String name, boolean chkHostScope) {
    	return scopeDeleg.lookupName(name, chkHostScope);
    }


    @Override
    public boolean defineSymbol(Atom name, ISymbolNode symbol) {
        return scopeDeleg.defineSymbol(name, symbol);
    }

    @Override
    public IScope getEnclosingScope() {
        return scopeDeleg.getEnclosingScope();
    }

    @SuppressWarnings("unchecked")
    public List<DeclNode.Formal> getFormals() {
        return ((ListNode<DeclNode.Formal>) getChild(FORMALS)).getElems();
    }

    @Override
    public Set<Map.Entry<String,SymbolEntry>> getEntrySet() {
        return scopeDeleg.getEntrySet();
    }

	/**
	 * @return the list of function local variables
	 */
	public List<DeclNode> getLocalVars() {
		return localVars;
	}

}
