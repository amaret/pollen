package com.amaret.pollen.parser;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class NestedScope implements IScope {
	
	private HashMap<String,SymbolEntry> symbolTable = new HashMap<String,SymbolEntry>();
	IScope definingScope;
	IScope enclosingScope;

	NestedScope(IScope definingScope) {
	    this.definingScope = definingScope;
	}
	
    void addSymbols(Set<Entry<String, SymbolEntry>> entrySet) {
        for (Map.Entry<String, SymbolEntry> ent : entrySet) {
            symbolTable.put(ent.getKey(), new SymbolEntry(definingScope, ent.getValue().node()));
        }
    }

    @Override
	public boolean defineSymbol(Atom name, ISymbolNode node) {
	    if (symbolTable.containsKey(name.getText())) {
	        return false;
	    }
		symbolTable.put(name.getText(), new SymbolEntry(definingScope, node));
		node.setDefiningScope(definingScope);
		return true;
	}

    @Override
    public SymbolEntry resolveSymbol(Atom name) {
        return lookupName(name.getText());
    }

    @Override
    public IScope getEnclosingScope() {
        return enclosingScope;
    }

    @Override
    public Set<Map.Entry<String,SymbolEntry>> getEntrySet() {
        return symbolTable.entrySet();
    }

    @Override
    public void setEnclosingScope(IScope scope) {
        enclosingScope = scope;
    }

    @Override
    public SymbolEntry lookupName(String name) {
        SymbolEntry result = symbolTable.get(name);
        if (result != null) {
            return result;
        }
        if (enclosingScope != null) {
            return enclosingScope.lookupName(name);
        }
        return null;
    }
    
    @Override
    public void replaceSymbol(Atom name, ISymbolNode node) {
        symbolTable.put(name.getText(), new SymbolEntry(definingScope, node));
        node.setDefiningScope(definingScope);
    }
}
