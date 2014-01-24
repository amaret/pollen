package com.amaret.pollen.parser;

import org.antlr.runtime.Token;
import org.antlr.runtime.tree.CommonTree;

public class BaseNode extends CommonTree {

    private String fileName;
    private int startIndex;
    private int stopIndex;
    
    BaseNode() {
        fileName = ParseUnit.current().getPackageName() + "." + ParseUnit.current().getFileName();
    }
    
    BaseNode(Token t) {
	    super(t);
        fileName = ParseUnit.current().getPackageName() + "." + ParseUnit.current().getFileName();
	}
    
    final void doPass1() {
    	
    	if (!pass1Begin()) {
            return;
        }
        if (getChildCount() > 0) {
            for (Object o : getChildren()) {
                ((BaseNode)o).doPass1();
            }
        }
        pass1End();
        
    }
   
    final void doPass2() {
    	//System.out.println(this.toStringTree());
       if (!pass2Begin()) {
            return;
        }
        if (getChildCount() > 0) {
            for (Object o : getChildren()) {
                ((BaseNode)o).doPass2();
            }
        }
        pass2End();
    }
    
    public Atom getAtom() {
        return (Atom) getToken();
    }

    public String getFileName() {
        return fileName;
    }

	int getStartIndex() {
        return startIndex;
    }
    
    int getStopIndex() {
        return stopIndex;
    }
    
    protected boolean pass1Begin() {
        return false;
    }
    
    protected void pass1End() {
    }
    
    protected boolean pass2Begin() {
        return false;
    }
    
    protected void pass2End() {
    }
    
    void setIndexes(int start, int stop) {
        startIndex = start;
        stopIndex = stop;
    }
	/**
	 * For correct line numbers in error messages. 
	 * Non-synthesized tokens have correct line num
	 * whereas synthesized tokens all have the line num of EOF.
	 * @param b a node
	 * @return a node in the current subtree containing a non synthesized token or null if none exists.
	 */
	private BaseNode getNonSynthesizedNode(BaseNode b) {
		if (b == null)
			return null;
		if (!b.getAtom().isSynthesizedToken())
			return b;
		if (b.getChildren() != null)
			for (Object o : b.getChildren()) {
				BaseNode n = getNonSynthesizedNode((BaseNode) o);
				if (n != null) //&& !n.getAtom().isSynthesizedToken())
					return n;
			}
		return null;
	}
	public int getLine() {
		BaseNode b = getNonSynthesizedNode(this);
		if (b != null) // && !b.getAtom().isSynthesizedToken())
			return b.getToken().getLine();
		// non-synthesized tokens have correct line num
		// whereas synthesized tokens all have the line num of EOF
		return super.getLine();
	}



}
