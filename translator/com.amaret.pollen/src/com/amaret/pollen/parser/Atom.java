package com.amaret.pollen.parser;

import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonToken;
import org.antlr.runtime.Token;

public class Atom extends CommonToken {

	private static final long serialVersionUID = 1L;

	private String fileName;

	public Atom(CharStream input, int type, int channel, int start, int stop) {
		super(input, type, channel, start, stop);
		line = pollenLexer.getLineNum();
		fileName = pollenLexer.getFileName();
	}

	public Atom(int type, String text) {
		super(type, text);
		line = pollenLexer.getLineNum();
		fileName = pollenLexer.getFileName();
	}

	public Atom(int type) {
		super(type);
		line = pollenLexer.getLineNum();
		fileName = pollenLexer.getFileName();
	}

	public Atom(Token oldToken) {
		super(oldToken);
		line = oldToken.getLine();
		if (line == 0)
			line = pollenLexer.getLineNum();
		fileName = pollenLexer.getFileName();
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	@Override
	public String toString() {
		return getText();
	}

	public String toTokenString() {
		return super.toString();
	}

}
