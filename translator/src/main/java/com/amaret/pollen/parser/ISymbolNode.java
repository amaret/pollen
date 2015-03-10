// Copyright Amaret, Inc 2011-2015
// See https://github.com/amaret/pollen/blob/master/LICENSE

package com.amaret.pollen.parser;


public interface ISymbolNode {
	
    public IScope getDefiningScope();
    public Atom getName();
    public Cat getTypeCat();
    public void setDefiningScope(IScope scope);

}
