package com.amaret.pollen.parser;
/**
 * @author lucidbee (Megan Adams)
 */

public interface ISymbolNode {
	
    public IScope getDefiningScope();
    public Atom getName();
    public Cat getTypeCat();
    public void setDefiningScope(IScope scope);

}
