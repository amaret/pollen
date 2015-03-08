package com.amaret.pollen.parser;

import org.antlr.runtime.CommonTokenStream;


public class AtomStream extends CommonTokenStream {
	
	AtomStream( pollenLexer lexer ) {
        super(lexer);
    }
}
