package com.amaret.pollen.target;

import java.io.File;

import com.amaret.pollen.driver.ProcessUnits;
import com.amaret.pollen.parser.ParseUnit;

public class GccLocalHost extends GccBase {

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
    @Override
    public void compile(File srcFile) throws Exception {
    	
    	if (!ProcessUnits.isGccLocalHost())
    		return;
        
        ParseUnit curr = ParseUnit.current();

        if ("yes".equals(curr.getProperty(ITarget.P_DISABLE))) {       	
        	return;
        } 
        
        String srcFilePath = srcFile.getAbsolutePath();
        
        String baseFile = srcFilePath.substring(0, srcFilePath.lastIndexOf(".c"));
        String outFile = baseFile + ".out";
        String gcc = curr.getProperty(ITarget.P_TOOLSDIR) + "/" + curr.getProperty(ITarget.P_TOOLPREFIX) + "gcc";
        String objcopy = curr.getProperty(ITarget.P_TOOLSDIR) + "/" + curr.getProperty(ITarget.P_TOOLPREFIX) + "objcopy";
        
        String cmd;
        
        cmd = "";
        cmd += gcc;
        cmd = addCcOptsPrefix(cmd);
        cmd += " -I" + curr.getPollenRoot();
        cmd = addCcOpts(cmd);
        cmd += srcFile;
        cmd += " -o " + outFile;
        cmd = addCcOptsSuffix(cmd);
        
        if (execCmd(cmd) != 0) {
            return;
        }
        
        cmd = "";
        cmd += objcopy;
        //cmd += " -I elf32-avr -O ihex " + outFile + " " + hexFile;
        if (execCmd(cmd) != 0) {
            return;
        }
        
    }



}
