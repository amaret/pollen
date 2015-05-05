package com.amaret.pollen.util;

/**
 * @author lucidbee (Megan Adams)
 */
@SuppressWarnings("unused")
public class ErrorRecord {

	
	private String message = "";
	private String fileName = "";
	private int location = 0;
	private int charStart = 0;
	private int charEnd = 0;
	public enum Priority {
		PRIORITY_HIGH, PRIORITY_NORMAL, PRIORITY_LOW
	}
	public enum Severity { 
		SEVERITY_ERROR, SEVERITY_WARNING, SEVERITY_INFO
	}
	private Severity severity;
	private Priority priority;
	
	public ErrorRecord(String file, int loc, int start, int end, Priority p, Severity s) {
		file = fileName;
		location = loc;
		if (start > 0) {
			charStart = start;
			charEnd = end;
		}
		priority = p;
		severity = s;
	}
	
	// TODO	associate the error record with the file
	  
}
