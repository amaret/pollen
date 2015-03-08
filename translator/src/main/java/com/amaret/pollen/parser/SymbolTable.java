// Copyright Amaret, Inc 2011-2015
// See https://github.com/amaret/pollen/blob/master/LICENSE

package com.amaret.pollen.parser;

import com.amaret.pollen.parser.StmtNode.Block;


public class SymbolTable {

    IScope curScope;
    
    public IScope curScope() {
        return curScope;
    }
    
    public boolean defineSymbol(Atom name, ISymbolNode symbol) {
        return curScope == null ? false : curScope.defineSymbol(name, symbol);
    }

    public void enterScope(IScope scope) {
    	String enc = curScope == null ? "null" : curScope.getScopeName();
    	//System.out.println("SymbolTable.enterScope: enclosing " + enc + ", entering " + scope.getScopeName());
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
    /**
     * Checks 
     * @param name
     * @param chkHostScope
     * @return
     */
    public SymbolEntry resolveSymbol(Atom name, boolean chkHostScope) {
    	SymbolEntry se = lookupName(name.getText());
    	if (se == null && chkHostScope == true)
    		se = lookupName(name.getText(), chkHostScope);
    	return se;
    }

    /**
     * For calls. In host context, look in host scope.
     * @return true if current scope is a host scope.
     */
    public boolean currScopeIsHostFcn() {
    	ParseUnit currUnit = ParseUnit.current();
    	SymbolTable symtab = currUnit.getSymbolTable();
    	IScope sc = symtab.curScope();
    	// If this is a host function, the called function must be host.
    	// This indicates use of host scope for lookup.
    	boolean isHost = false; 
    	if (sc instanceof BodyNode
    			|| sc instanceof DeclNode.Fcn 
    			|| sc instanceof Block) {
    		do {
    			isHost |= (sc instanceof DeclNode.Fcn 
    	    			&& ((DeclNode.Fcn) sc).isHost());
    			sc = sc.getEnclosingScope();
    			if (isHost)
    				break;
    		}
    		while ((sc instanceof BodyNode 
    				|| sc instanceof DeclNode.Fcn 
        			|| sc instanceof Block));
    	}
    	return isHost;
    }
    /**
     * Any item initialized in a preset initializer is flagged as a preset item.
     * @return true if current scope is inside a preset initializer. 
     */
    public boolean insidePresetInitializer() {
    	ParseUnit currUnit = ParseUnit.current();
    	SymbolTable symtab = currUnit.getSymbolTable();
    	IScope sc = symtab.curScope();
    	boolean insidePreset = false; 
    	if (sc instanceof BodyNode
    			|| sc instanceof DeclNode.Fcn 
    			|| sc instanceof Block) {
    		do {
    			insidePreset |= (sc instanceof DeclNode.Fcn 
    	    			&& ((DeclNode.Fcn) sc).isPresetInitializer());
    			sc = sc.getEnclosingScope();
    			if (insidePreset)
    				break;
    		}
    		while ((sc instanceof BodyNode 
    				|| sc instanceof DeclNode.Fcn 
        			|| sc instanceof Block));
    	}
    	return insidePreset;
    }


}
