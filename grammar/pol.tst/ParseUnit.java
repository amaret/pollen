// Copyright Amaret, Inc 2011-2015
// See https://github.com/amaret/pollen/blob/master/LICENSE

//package com.amaret.pollen.parser;

import java.io.File;
import java.io.PrintStream;

import org.antlr.runtime.ANTLRFileStream;

public class ParseUnit {
	
	private String path;
	private int parseErrors;
	private ANTLRFileStream in;
	private PrintStream out;
	private PrintStream err;
	private PrintStream info;
	private static ParseUnit currUnit;
	
	private ParseUnit(String inputPath, PrintStream outputStream,
			PrintStream errorStream, PrintStream infoStream) {

		path = inputPath;
		out = outputStream;
		err = errorStream;
		info = infoStream;
	}

	public static void startUnit(String inputPath, PrintStream outputStream,
			PrintStream errorStream, PrintStream infoStream) {

		currUnit = new ParseUnit(inputPath, outputStream, errorStream,
				infoStream);

	}
	
	public static ParseUnit current() {
		return currUnit;
	}
	
	public void parseUnit() throws Exception{

		in = new ANTLRFileStream(path);

	}
	
	public String getFileName() {
		if (path.indexOf(File.separator) != -1) {
			return path.substring(path.lastIndexOf(File.separator)+1);			
		}
		return path;
	}

}
