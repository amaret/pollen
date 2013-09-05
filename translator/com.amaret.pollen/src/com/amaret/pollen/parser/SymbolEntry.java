package com.amaret.pollen.parser;

import com.amaret.pollen.parser.DeclNode.Formal;
import com.amaret.pollen.parser.DeclNode.ITypeKind;
import com.amaret.pollen.parser.TypeNode.Usr;


public class SymbolEntry {
    
    private final ISymbolNode node;
    private final IScope scope;
    
    SymbolEntry(IScope definingScope, ISymbolNode node) {
        this.scope = definingScope;
        this.node = node;
    }
    public boolean equals(SymbolEntry se) {
    	return (this.scope == se.scope && this.node == se.node);
    }
    
    public final ISymbolNode node() {
        return node;
    }
    
    public final IScope scope() {
        return scope;
    }
    /**
     * 
     * @param scopeHost return the host scope for next lookup
     * @return scope of lookup for the next qualifier in the qualified name
     */
    public final IScope derefScope(boolean scopeHost) {
    	IScope sc = null;
    	// For an interim result, the next lookup scope can be 
    	// 1. the scope of the interim result 
    	// 2. or the scope of the type. 
    	// For example the lookup for 'myFcn()' in obj1.myFcn() is the class of obj1. 
    	
    	if (this.node() instanceof ImportNode) {
    		IScope i = ((ImportNode) this.node()).getExportedUnit();
    		if (i != null) {
    			// if this is a reference via an exported module, use that
    			// module for the next scope.   			
    			sc = i;
    		}  
    		else
    			sc = ((ImportNode) this.node()).getUnit().getUnitType();   		
    		if (sc != null)
    			return sc;   	
    	}
    	TypeNode.Usr t = null;
    	if (this.node() instanceof DeclNode.Arr){
    		t = (Usr) ((DeclNode.Arr)this.node()).getTypeSpec();			
		}
    	else if (this.node() instanceof DeclNode.ITypeSpec) {
    		if (((DeclNode.ITypeSpec) this.node()).getTypeSpec() instanceof TypeNode.Usr) {
    			t = (Usr) ((DeclNode.ITypeSpec) this.node()).getTypeSpec();
    		}        			
    	}    	
    	else if (this.node() instanceof DeclNode.Formal) {    		
    		if (((Formal) this.node()).getTypeSpec() instanceof TypeNode.Usr) {
    			t = (Usr) ((Formal) this.node()).getTypeSpec();
     		}        			
    	}

    	if (t != null) {
    		SymbolEntry s = t.getSymbol();
    		if (s != null) {
    			if (s.node() instanceof ImportNode && ((ImportNode) s.node()).getUnit() != null)    
    				sc = ((ImportNode)s.node()).getUnit().getUnitType();    
    			else if (s.node() instanceof DeclNode.Usr)
    				sc = ((DeclNode.Usr)s.node()).getScopeDeleg();
    		}
    	}
    	
    	if (t == null) {

    		ITypeKind is = (ITypeKind) (this.node() instanceof ITypeKind ? this.node() : null);
    		if (is != null && (is.isEnum() || is.isClass())) {
    			if ((this.node().getDefiningScope() instanceof DeclNode.Usr))
    				sc = ((DeclNode.Usr) this.node()).getScopeDeleg();
    		}
    	}
    	
    	IScope rtn = (sc == null) ? scope() : sc;
    	
    	if (scopeHost && rtn instanceof NestedScope) {
    		if (((NestedScope)rtn).definingScope instanceof DeclNode.Usr) {
    			DeclNode.Usr u = (DeclNode.Usr) ((NestedScope)rtn).definingScope;
    			if (rtn == u.scopeDeleg)
    				rtn = u.scopeHost;
    		}
    	}
    	
    	return rtn;
    }


}
