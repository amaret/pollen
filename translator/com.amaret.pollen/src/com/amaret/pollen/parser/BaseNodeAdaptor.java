package com.amaret.pollen.parser;

import org.antlr.runtime.CommonToken;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.Token;
import org.antlr.runtime.TokenStream;
import org.antlr.runtime.tree.CommonTreeAdaptor;
import org.antlr.runtime.tree.TreeAdaptor;

public class BaseNodeAdaptor extends CommonTreeAdaptor implements TreeAdaptor {

    @Override
    public Object create( Token token )
	{
		return new BaseNode(token);
    }
	
    @Override
    public Object dupNode( Object t )
    {
    	if (t==null) {
    		return null;
        }
        return create(((BaseNode)t).token);
    }

    @Override
    public Object errorNode(TokenStream input, Token start, Token stop, RecognitionException e)
    {
    	// TODO ErrorNode
        return new Object(); // ErrorNode(input,start,stop,e);
    }
    
    @Override
    public void setTokenBoundaries(Object t, Token start, Token stop)
    {
        super.setTokenBoundaries(t, start, stop);
        BaseNode node = (BaseNode) t;
        if (node != null && start != null && stop != null) {
            node.setIndexes(((CommonToken) start).getStartIndex(), ((CommonToken) stop).getStopIndex() + 1);
        }
    }
}
