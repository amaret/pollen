package com.amaret.pollen.parser;


public class SymbolEntry {
    
    private final ISymbolNode node;
    private final IScope scope;
    
    SymbolEntry(IScope definingScope, ISymbolNode node) {
        this.scope = definingScope;
        this.node = node;
    }
    
    public final ISymbolNode node() {
        return node;
    }
    
    public final IScope scope() {
        return scope;
    }

}
