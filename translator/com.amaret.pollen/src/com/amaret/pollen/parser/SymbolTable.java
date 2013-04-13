package com.amaret.pollen.parser;


public class SymbolTable {

    IScope curScope;
    
    public IScope curScope() {
        return curScope;
    }
    
    public boolean defineSymbol(Atom name, ISymbolNode symbol) {
        return curScope == null ? false : curScope.defineSymbol(name, symbol);
    }

    public void enterScope(IScope scope) {
        scope.setEnclosingScope(curScope);
        curScope = scope;
    }
    
    public void leaveScope() {
        curScope = curScope.getEnclosingScope();
    }
    /**
     * Some lookups don't use the default unit current scope, 
     * for example '@field' will not start at the function local scope.
     * @param name
     * @param sc
     * @return the SymbolEntry starting at scope sc.
     */
    public SymbolEntry lookupName(String name, IScope sc) {
        return sc == null ? null : sc.lookupName(name);
    }
    
    public SymbolEntry lookupName(String name) {
        return curScope == null ? null : curScope.lookupName(name);
    }
    public SymbolEntry lookupName(String name, boolean chkHostScope) {
        return curScope == null ? null : curScope.lookupName(name, chkHostScope);
    }

    
    public SymbolEntry resolveSymbol(Atom name, IScope sc) {
        return lookupName(name.getText(), sc);
    }
    
    public SymbolEntry resolveSymbol(Atom name) {
        return lookupName(name.getText());
    }
    public SymbolEntry resolveSymbol(Atom name, boolean chkHostScope) {
        return lookupName(name.getText(), chkHostScope);
    }

    /**
     * For calls. In host context, look in host scope.
     * @return true if current scope is a host scope.
     */
    public boolean currScopeIsHost() {
    	ParseUnit currUnit = ParseUnit.current();
    	SymbolTable symtab = currUnit.getSymbolTable();
    	IScope sc = symtab.curScope();
    	// If this is a host function, the called function must be host.
    	// This indicates use of host scope for lookup.
    	boolean isHost = false; 
    	if (sc instanceof BodyNode
    			|| sc instanceof DeclNode.Fcn) {
    		do {
    			isHost |= (sc instanceof DeclNode.Fcn 
    	    			&& ((DeclNode.Fcn) sc).isHost());
    			sc = sc.getEnclosingScope();
    		}
    		while ((sc instanceof BodyNode 
    				|| sc instanceof DeclNode.Fcn));
    	}
    	return isHost;
    }


}
