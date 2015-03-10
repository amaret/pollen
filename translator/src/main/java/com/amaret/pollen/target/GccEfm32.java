// Copyright Amaret, Inc 2011-2015
// See https://github.com/amaret/pollen/blob/master/LICENSE

package com.amaret.pollen.target;

import java.io.File;

import com.amaret.pollen.driver.ProcessUnits;
import com.amaret.pollen.parser.ParseUnit;

public class GccEfm32 extends GccBase {

    {
        typeInfo.put(TypeId.BOOL,   new TypeInfo(2, 1));
        typeInfo.put(TypeId.BYTE,   new TypeInfo(1, 1));
        typeInfo.put(TypeId.INT8,   new TypeInfo(1, 1));
        typeInfo.put(TypeId.INT16,  new TypeInfo(2, 1));
        typeInfo.put(TypeId.INT32,  new TypeInfo(2, 1));
        typeInfo.put(TypeId.UINT8,   new TypeInfo(1, 1));
        typeInfo.put(TypeId.UINT16,  new TypeInfo(2, 1));
        typeInfo.put(TypeId.UINT32,  new TypeInfo(2, 1));
                      
    }
    protected String addMapFile(String cmd, File srcFile) {
        
        String srcFilePath = srcFile.getAbsolutePath();       
        String baseFile = srcFilePath.substring(0, srcFilePath.lastIndexOf(".c"));
        String mapFile = baseFile + ".map";
        cmd += " -Wl,-Map=" + mapFile;
        return cmd;
    }
    protected String cmdObjCopy() {
		String objcopy = ParseUnit.current().getProperty(ITarget.P_OBJCOPY);
        if (!new File(objcopy).exists())
        	curr.reportFailure("property file does not specifiy a valid objcopy tool path");
		return objcopy;
    }
    protected String addCcMcu(String cmd) {
    	String mcu = ProcessUnits.getMcu();
		if (mcu == null || mcu.isEmpty())
			mcu = ParseUnit.current().getProperty(ITarget.P_MCU);
		if (mcu == null || mcu.isEmpty())
    		mcu = "EFM32ZG108F32";
    	cmd += " -D" + mcu; 
    	return cmd;
    }   
    protected String addObjCopyFiles(String cmd, File srcFile) {
        String srcFilePath = srcFile.getAbsolutePath();       
        String baseFile = srcFilePath.substring(0, srcFilePath.lastIndexOf(".c"));
        String outFile = baseFile + ".elf";
        String hexFile = baseFile + ".bin";
        cmd += " " + outFile + " " + hexFile;
        return cmd;
    }

    protected String addObjCopyOpts(String cmd) {
    	String input = ParseUnit.current().getProperty(ITarget.P_OBJFORMAT_IN);
    	String output = ParseUnit.current().getProperty(ITarget.P_OBJFORMAT_OUT);
    	if (input == null || input.isEmpty())
    		curr.reportFailure("property file does not specifiy a valid objcopy input format");
    	if (output == null || output.isEmpty())
    		curr.reportFailure("property file does not specifiy a valid objcopy output format");
    	cmd += " -I " + input + " -O " + output;
        return cmd;
    }
    /**
     * If serious error count > 0 produce c files but don't compile or link.
     */
    protected String addSrcOutFiles(String cmd, File srcFile) {
        
        String srcFilePath = srcFile.getAbsolutePath();       
        String baseFile = srcFilePath.substring(0, srcFilePath.lastIndexOf(".c"));
        cmd += " " + srcFile;
        String outFile = baseFile + ".elf";
        cmd += " -o " + outFile;
        return cmd;
    }

    protected int execCmd(String cmd, boolean useInfoStream) throws Exception {
        return execCmd(cmd, useInfoStream, null);
    }

    @Override
    public void compile(File srcFile) throws Exception {
    	
        ParseUnit curr = ParseUnit.current();

        if ("yes".equals(curr.getProperty(ITarget.P_DISABLE))) {       	
        	return;
        } 
        execCompile(srcFile);
        
    }



}
