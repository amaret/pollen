package com.amaret.pollen.parser;

import com.amaret.pollen.parser.DeclNode.Formal;
import com.amaret.pollen.parser.DeclNode.ITypeKind;
import com.amaret.pollen.parser.DeclNode.Var;
import com.amaret.pollen.parser.TypeNode.Usr;


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
    /**
     * 
     * @return scope of lookup for the next qualifier in the qualified name
     */
    public final IScope derefScope() {
    	IScope sc = null;
    	// For an interim result, the next lookup scope can be 
    	// 1. the scope of the interim result (for a qualified unit name)
    	// 2. or the scope of the type. 
    	// For the latter case the scope of the lookup for 'myFcn()' in obj1.myFcn() is the class of obj1. 
    	
//    	if (this.node() instanceof ImportNode && ((ImportNode) this.node()).getUnit() != null) {   		
//			sc = ((ImportNode) this.node()).getUnit().getUnitType();   		
//			if (sc != null)
//				return sc;   	
//    	}
    	TypeNode.Usr t = null;
    	if (this.node() instanceof DeclNode.ITypeSpec) {
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
			if (s.node() instanceof ImportNode && ((ImportNode) s.node()).getUnit() != null)    
				sc = ((ImportNode)s.node()).getUnit().getUnitType();    		
    	}
    	
    	if (t == null) {
    		if (this.node() instanceof ITypeKind
    				&& ((ITypeKind) this.node()).isEnum() || ((ITypeKind) this.node()).isClass()) {
    			if ((this.node().getDefiningScope() instanceof DeclNode.Usr))
    				sc = ((DeclNode.Usr) this.node()).getScopeDeleg();
    		}
    	}
    	
    	return (sc == null) ? scope() : sc;	
    }


}
