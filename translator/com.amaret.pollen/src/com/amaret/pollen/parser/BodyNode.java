package com.amaret.pollen.parser;

import java.util.Set;
import java.util.Map.Entry;

public class BodyNode extends BaseNode implements IScope {

	@Override
	public boolean defineSymbol(Atom name, ISymbolNode node) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public IScope getEnclosingScope() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Entry<String, SymbolEntry>> getEntrySet() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SymbolEntry lookupName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void replaceSymbol(Atom name, ISymbolNode node) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public SymbolEntry resolveSymbol(Atom name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setEnclosingScope(IScope scope) {
		// TODO Auto-generated method stub
		
	}
    public Atom getName() {  	
    	Atom rtn = null;
    	// TODO
    	assert rtn != null;
    	return rtn;
       //return ((BaseNode) getChild(NAME)).getAtom();
    }
	
    
}
