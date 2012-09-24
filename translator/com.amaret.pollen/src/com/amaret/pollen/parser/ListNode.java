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
//    	List<T> l = getElems();
//    	boolean doPass1 = true;
//    	for (T it : l) {
//    		doPass1 = ((BaseNode) it).pass1Begin();    	 
//    		if (!doPass1)
//    			return false;
//    	}
        return true;
    }
    
    @Override
    protected boolean pass2Begin() {
//    	List<T> l = getElems();
//    	boolean doPass2 = true;
//    	for (T it : l) {
//    		doPass2 = ((BaseNode) it).pass2Begin();    	 
//    		if (!doPass2)
//    			return false;
//    	}
        return true;
    }
    
}
