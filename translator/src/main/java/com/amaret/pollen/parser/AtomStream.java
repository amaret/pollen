package com.amaret.pollen.parser;

import org.antlr.runtime.CommonTokenStream;


/**
 * @author lucidbee (Megan Adams)
 */

public class AtomStream extends CommonTokenStream {
	
	AtomStream( pollenLexer lexer ) {
        super(lexer);
    }
}
