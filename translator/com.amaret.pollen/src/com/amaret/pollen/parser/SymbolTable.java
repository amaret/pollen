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
    
    public SymbolEntry resolveSymbol(Atom name, IScope sc) {
        return lookupName(name.getText(), sc);
    }
    
    public SymbolEntry resolveSymbol(Atom name) {
        return lookupName(name.getText());
    }
}
