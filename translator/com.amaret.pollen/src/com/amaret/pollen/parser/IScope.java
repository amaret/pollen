package com.amaret.pollen.parser;

import java.util.Map;
import java.util.Set;

public interface IScope {

    public boolean defineSymbol(Atom name, ISymbolNode node);
    public IScope getEnclosingScope();
    public Set<Map.Entry<String,SymbolEntry>> getEntrySet();
    public SymbolEntry lookupName(String name);
    public SymbolEntry lookupName(String name, boolean chkHostScope);
    public void replaceSymbol(Atom name, ISymbolNode node);
    public SymbolEntry resolveSymbol(Atom name);
    public void setEnclosingScope(IScope scope);
    public String getScopeName();

}
