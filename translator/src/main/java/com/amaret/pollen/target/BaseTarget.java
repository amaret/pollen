package com.amaret.pollen.target;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.io.PrintStream;

import com.amaret.pollen.driver.ProcessUnits;
import com.amaret.pollen.parser.ParseUnit;

public abstract class BaseTarget implements ITarget {

    protected final String addCcOpts(String cmd) {
        return addOpts(cmd, ITarget.P_CCOPTS);
    }
    /**
     * Not from properties file: from command line.
     * @param cmd
     * @return
     */
    protected String addCcFlags(String cmd) {
    	return cmd + " " + ProcessUnits.getcFlags();
    }

	protected String addCcMcu(String cmd) {
		String mcu = ProcessUnits.getMcu();
		if (mcu == null || mcu.isEmpty())
			mcu = ParseUnit.current().getProperty(ITarget.P_MCU);
		if (mcu == null || mcu.isEmpty())
			return cmd;
		cmd += " -mmcu=" + mcu;
		return cmd;
	}

    protected String addPollenBundles(String cmd) {
    	if (ProcessUnits.getPollenBundles().isEmpty())
    		return cmd;
       return cmd + " -I" + ProcessUnits.getPollenBundles(); 
    }
    protected String addPollenTarget(String cmd) {
    	if (ParseUnit.current().getPollenTarget().isEmpty())
    		return cmd;
       return cmd + " -I" + ParseUnit.current().getPollenTarget();
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
    /**
     * If serious error count > 0 compile with -S which does not assemble or link.
     * @param cmd
     * @param srcFile
     * @return
     */
    protected String addSrcOutFiles(String cmd, File srcFile) {
        
        String srcFilePath = srcFile.getAbsolutePath();       
        String baseFile = srcFilePath.substring(0, srcFilePath.lastIndexOf(".c"));
        cmd += " " + srcFile;
        String outFile = baseFile + ".out";
        cmd += " -o " + outFile;
        return cmd;
    }
    protected String addMapFile(String cmd, File srcFile) {        
        return cmd;
    }

    protected String cmdObjCopy() {
    	return "";
    }
    protected String addObjCopyOpts(String cmd) {
        return cmd;
    }
    protected String addObjCopyFiles(String cmd, File srcFile) {
        return cmd;
    }
    protected String cmdLoad() {
    	return "";
    }
    protected String addLoaderOpts(String cmd) {
    	if (!cmd.isEmpty())
    		cmd = addOpts(cmd, ITarget.P_LOADER_FLAGS);
        return cmd;
    }
    protected String addLoaderFiles(String cmd, File srcFile) {
    	if (!cmd.isEmpty()) {
    		String srcFilePath = srcFile.getAbsolutePath();       
    		String baseFile = srcFilePath.substring(0, srcFilePath.lastIndexOf(".c"));
    		String hexFile = baseFile + ".hex";
    		cmd += hexFile;
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
    	
        if (!cmd.isEmpty() && "yes".equals(ParseUnit.current().getProperty(ITarget.P_ECHO))) {
            ParseUnit.current().getInfoStream().println("exec: " + cmd);
        }
        if (cmd == null || cmd.isEmpty())
        	return 0;        
        // Cloud compiler requires that PATH be passed this way or it is null and ld is not found. 
        String[] path = { "PATH=/usr/bin:/bin:/usr/sbin:/sbin:" };
        Process proc = Runtime.getRuntime().exec(cmd, path, dir);
        
        BufferedReader procout = new BufferedReader(new InputStreamReader(proc.getErrorStream()));
        String line;
		PrintStream errStream = ParseUnit.current().getErrorStream();
        while ((line = procout.readLine()) != null) {
            errStream.println(line);
        }
        procout.close();
        //errStream.close(); 
        return proc.waitFor();
    }

    final protected String getTargDir() {
        return ProcessUnits.getPollenTarget() + "/" + ParseUnit.current().getProperty(ITarget.P_NAME);
    }
    
}
