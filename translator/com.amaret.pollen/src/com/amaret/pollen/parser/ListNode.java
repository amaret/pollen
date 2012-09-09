package com.amaret.pollen.parser;

import java.util.ArrayList;
import java.util.List;

import org.antlr.runtime.CommonToken;

public class ListNode<T> extends BaseNode {
	
    List<T> elems;
    
    ListNode(int ttype, String ttext) {
      	this.token = new Atom(ttype, ttext);
    }
    
	@SuppressWarnings("unchecked")
    List<T> getElems() {
	    if (elems == null) {
	        elems = (children != null) ? children : new ArrayList<T>();
	    }
	    return elems;
    }
	
    @Override
    protected boolean pass1Begin() {
        return true;
    }
    
    @Override
    protected boolean pass2Begin() {
        return true;
    }
    
}
