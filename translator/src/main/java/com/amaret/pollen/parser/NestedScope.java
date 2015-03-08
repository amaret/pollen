package com.amaret.pollen.parser;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class NestedScope implements IScope {
	
	class UnitHashMap<K,V> extends HashMap<K,V> {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		public V put(K k,V v) {
			V rtn = super.put(k, v);
			if (rtn != null) {
				ParseUnit.internalMsg("Collision detected for key " + k.toString());
			}
			return rtn;
		}		
	}
	
	private HashMap<String,SymbolEntry> symbolTable = new UnitHashMap<String,SymbolEntry>();
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
    public String getScopeName() {
    	return this.definingScope.getScopeName();
    }

    @Override
	public boolean defineSymbol(Atom name, ISymbolNode node) {
    	
    	
	    if (symbolTable.containsKey(name.getText())) {
	    	if (name.getText().equals(ParseUnit.DEFAULT_LOOPVAR)) // ok
	    		return true;
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
    	return lookupName(name, false);     
    }
    /**
     * For calls. In host context, use host scope.
     */
    public SymbolEntry lookupName(String name, boolean checkHostScope) {
    	String enc = ", enclosing scope = ";
    	enc = enclosingScope == null ? enc+"null" : enc+enclosingScope.getScopeName();
    	//System.out.println("NestedScope.lookupName: " + name + " in scope "+ this.getScopeName() + enc);
    	SymbolEntry result = symbolTable.get(name);
        if (result != null) {
            return result;
        }
        if (enclosingScope != null) {
            result = enclosingScope.lookupName(name, checkHostScope);
            if (result != null)
            	return result;
        }
        if (name.indexOf(".") != -1) {
        	// qualified names ('x.y.z') need chained lookups, one qualifier at a time.
        	IScope sc = this.definingScope;
        	String qualifier = name.substring(0, name.indexOf("."));
        	name = name.substring(name.indexOf(".")+1, name.length());

        	while (true) {
        		if (result != null && result.node() instanceof IScope && sc == null)
        			result = ((IScope) result.node()).lookupName(qualifier, checkHostScope);
        		else 
        			result = sc.lookupName(qualifier, checkHostScope);
        		if (result == null)
        			break;
        		if (name.isEmpty())
        			return result;
        		
        		sc = result.derefScope(false);
        		if (name.indexOf(".") == -1) {
        			qualifier = name;
        			name = "";
        		}
        		else {
        			qualifier = name.substring(0, name.indexOf("."));
                	name = name.substring(name.indexOf(".")+1, name.length());
        		}      		      		
        	}
        }
        return null;
    }

	@Override
    public void replaceSymbol(Atom name, ISymbolNode node) {
        symbolTable.put(name.getText(), new SymbolEntry(definingScope, node));
        node.setDefiningScope(definingScope);
    }
}
