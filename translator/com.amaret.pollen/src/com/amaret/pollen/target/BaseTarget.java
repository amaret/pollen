package com.amaret.pollen.target;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.io.PrintStream;

import com.amaret.pollen.parser.ParseUnit;

public abstract class BaseTarget implements ITarget {

    protected final String addCcOpts(String cmd) {
        return addOpts(cmd, ITarget.P_CCOPTS);
    }
    
    protected final String addCcOptsPrefix(String cmd) {
        return addOpts(cmd, ITarget.P_CCOPTSPRE);
    }
    
    protected final String addCcOptsSuffix(String cmd) {
        return addOpts(cmd, ITarget.P_CCOPTSSUF);
    }

    private String addOpts(String cmd, String key) {
        String opts = ParseUnit.current().getProperty(key);
        if (opts != null) {
            cmd += " " + opts;
        }
        return cmd;
    }
    
    protected int execCmd(String cmd, boolean useInfoStream) throws Exception {
        return execCmd(cmd, useInfoStream, null);
    }
    
    protected int execCmd(String cmd) throws Exception {
        return execCmd(cmd, false, null);
    }
    
    protected int execCmd(String cmd, File dir) throws Exception {
        return execCmd(cmd, false, dir);
    }
    
    protected int execCmd(String cmd, boolean useInfoStream, File dir) throws Exception {
        //if ("yes".equals(ParseUnit.current().getProperty(ITarget.P_ECHO))) {
            ParseUnit.current().getInfoStream().printf("exec: %s\n", cmd);
        //}
        Process proc = Runtime.getRuntime().exec(cmd, null, dir);
        BufferedReader procout = new BufferedReader(new InputStreamReader(proc.getErrorStream()));
        String line;
        PrintStream errStream = useInfoStream ? ParseUnit.current().getInfoStream() : ParseUnit.current().getErrorStream();
        while ((line = procout.readLine()) != null) {
            errStream.println(line);
        }
        procout.close();
        errStream.close();
        return proc.waitFor();
    }

    final protected String getTargDir() {
        ParseUnit curr = ParseUnit.current();
        return curr.getPollenRoot() + "/" + curr.getProperty(ITarget.P_NAME);
    }
    
    final protected boolean mustBuild(String genFileName, String srcFileName) {
    	return true; // during development
    	
/*        File genFile = new File(genFileName);
        File srcFile = new File(srcFileName);
        return !genFile.exists() || srcFile.lastModified() > genFile.lastModified();*/
    }
    
}
