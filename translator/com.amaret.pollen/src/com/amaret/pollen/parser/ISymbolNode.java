package com.amaret.pollen.parser;


public interface ISymbolNode {
	
    public IScope getDefiningScope();
    public Atom getName();
    public Cat getTypeCat();
    public void setDefiningScope(IScope scope);

}
