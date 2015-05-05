package com.amaret.pollen.parser;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lucidbee (Megan Adams)
 */

public class ListNode<T> extends BaseNode {
	
    List<T> elems;
    
    ListNode(int ttype, String ttext) {
      	this.token = new Atom(ttype, ttext);
    }
    
	@SuppressWarnings("unchecked")
	public
    List<T> getElems() {
	    if (elems == null) {
	        elems = (children != null) ? children : new ArrayList<T>();
	    }
	    return elems;
    }
	
    @Override
    protected boolean pass1Begin() {
    	// when called by default results in double entry of some symbols. 
    	// for scopes / functions, because of double entry of the same scope
    	// symptom is  stack overflow in lookups.
    	// Can explicitly call doPass2Begin() for pass1 processing.
//    	List<T> l = getElems();
//    	boolean doPass1 = true;
//    	for (T it : l) {
//    		doPass1 = ((BaseNode) it).pass1Begin();    	 
//    		if (!doPass1)
//    			return false;
//    	}
        return true;
    }
    
    public boolean doPass1Begin() {
    	List<T> l = getElems();
    	boolean doPass1 = true;
    	for (T it : l) {
    		doPass1 = ((BaseNode) it).pass1Begin();    	 
    		if (!doPass1)
    			return false;
    	}
        return true;
    }
    public boolean doPass2Begin() {
    	List<T> l = getElems();
    	boolean doPass2 = true;
    	for (T it : l) {
    		doPass2 = ((BaseNode) it).pass2Begin();    	 
    		if (!doPass2)
    			return false;
    	}
    	return true;
    }
    
    
    @Override
    protected boolean pass2Begin() {
    	// when called by default results in double entry of some symbols. 
    	// for scopes / functions, because of double entry of the same scope
    	// symptom is  stack overflow in lookups.
    	// Can explicitly call doPass2Begin() for pass 2 processing.
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
