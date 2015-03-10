// Copyright Amaret, Inc 2011-2015
// See https://github.com/amaret/pollen/blob/master/LICENSE

package com.amaret.pollen.parser;

import org.antlr.runtime.CommonTokenStream;


public class AtomStream extends CommonTokenStream {
	
	AtomStream( pollenLexer lexer ) {
        super(lexer);
    }
}
