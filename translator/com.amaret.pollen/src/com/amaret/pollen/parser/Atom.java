package com.amaret.pollen.parser;

import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonToken;
import org.antlr.runtime.Token;

public class Atom extends CommonToken {

	private static final long serialVersionUID = 1L;

	private String fileName;

	public Atom(CharStream input, int type, int channel, int start, int stop) {
		super(input, type, channel, start, stop);
	}

	public Atom(int type, String text) {
		super(type, text);
	}

	public Atom(int type) {
		super(type);
	}

	public Atom(Token oldToken) {
		super(oldToken);
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
