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
    
    public SymbolEntry lookupName(String name) {
        return curScope == null ? null : curScope.lookupName(name);
    }
    
    public SymbolEntry resolveSymbol(Atom name) {
        return lookupName(name.getText());
    }
}
