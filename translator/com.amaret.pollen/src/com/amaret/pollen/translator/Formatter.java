package com.amaret.pollen.translator;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import com.amaret.pollen.parser.Atom;

/**
 * @author lucidbee
 *
 */
public class Formatter {

	    
	    static final int TAB = 4;
	    
	    private int col;
	    private StringBuilder sb;
	    private int mark = -1;
	        
	    public void append(String s) {
	        sb.append(s);
	    }
	    
	    private void doPrint(String fmt, Object... args) {
	        char[] ca = fmt.toCharArray();
	        for (int i = 0; i < ca.length; i++) {
	            if (ca[i] != '%') {
	                sb.append(ca[i]);
	                continue;
	            }
	            switch (ca[++i]) {
	            case '%':
	                sb.append(ca[i]);
	                continue;
	            case 't':
	                this.tab();
	                continue;
	            case '+':
	                this.indent();
	                continue;
	            case '-':
	                this.outdent();
	                continue;
	            case '1':
	                sb.append(args[0].toString());
	                continue;
	            case '2':
	                sb.append(args[1].toString());
	                continue;
	            case '3':
	                sb.append(args[2].toString());
	                continue;
	            case '4':
	                sb.append(args[3].toString());
	                continue;
	            }
	        }
	    }

	    public void indent() {
	        indent(1);
	    }

	    public void indent( int n ) { col += TAB * n; }
	    public void outdent() {
	        outdent(1);
	    }
	    
	    public void insert( File file ) {
	        try {
	            FileInputStream ins = new FileInputStream(file);
	            byte buf[] = new byte[(int) ins.getChannel().size()];
	            ins.read(buf);
	            sb.append(new String(buf));
	            ins.close();
	        }
	        catch (IOException e) {
	            System.err.println(e);
	            System.exit(1);
	        }
	    }
	    
	    public void mark() {
	        mark = sb.length();
	    }
	    
	    public void outdent( int n ) {
	    	if (col - (TAB * n) >= 0)
	    		col -= TAB * n;
	    }
	    /**
	     * Do not interpret printf formatting characters: just print them.
	     * Use when the text to be printed comes from an injection block.
	     * @param atom
	     */
	    public void print_literal(Atom atom) {
	    	char[] ca = atom.getText().toCharArray();
	    	for (int i = 0; i < ca.length; i++) {	            
	    		sb.append(ca[i]);
	    	}
	    }

	    public void print(Atom atom) {
	        doPrint(atom.getText(), null, null, null, null);
	    }
	    
	    public void print(String fmt) {
	        doPrint(fmt, null, null, null, null);
	    }
	    public void print(String fmt, Object o1) {
	        doPrint(fmt, o1, null, null, null);
	    }
	    public void print(String fmt, Object o1, Object o2) {
	        doPrint(fmt, o1, o2, null, null);
	    }
	    public void print(String fmt, Object o1, Object o2, Object o3) {
	        doPrint(fmt, o1, o2, o3, null);
	    }
	    
	    public void print(String fmt, Object o1, Object o2, Object o3, Object o4) {
	        doPrint(fmt, o1, o2, o3, o4);
	    }
	    
	    public String release() {
	        String res = "";
	        if (mark != -1) {
	            res = sb.substring(mark);
	            sb.delete(mark, sb.length());
	            mark = -1;
	        }
	        return res;
	    }
	    
	    public void reset() {
	        sb = new StringBuilder();
	        col = 0;
	    }
	    
	    public void tab() {
	        for (int i = 0; i < col; i++) {
	            sb.append(' ');
	        }
	    }
	    
	    public byte[] toBytes() {
	        return sb.toString().getBytes();
	    }
	    
	    public String toString() {
	        return sb.toString();
	    }
	    
}
