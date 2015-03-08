// Copyright Amaret, Inc 2011-2015
// See https://github.com/amaret/pollen/blob/master/LICENSE

package com.amaret.pollen.target;

import java.io.File;

import com.amaret.pollen.driver.ProcessUnits;
import com.amaret.pollen.parser.ParseUnit;

public class GccArm extends GccBase {

    {
        typeInfo.put(TypeId.BOOL,   new TypeInfo(2, 1));
        typeInfo.put(TypeId.BYTE,   new TypeInfo(1, 1));
        typeInfo.put(TypeId.INT8,   new TypeInfo(1, 1));
        typeInfo.put(TypeId.INT16,  new TypeInfo(2, 1));
        typeInfo.put(TypeId.INT32,  new TypeInfo(2, 1));
        typeInfo.put(TypeId.UINT8,   new TypeInfo(1, 1));
        typeInfo.put(TypeId.UINT16,  new TypeInfo(2, 1));
        typeInfo.put(TypeId.UINT32,  new TypeInfo(2, 1));
        
        // TODO what is typeinfo for String?
        //typeInfo.put(TypeId.STRING,   new TypeInfo(2, 1));   ????
              
    }
    protected String addMapFile(String cmd, File srcFile) {
        
        String srcFilePath = srcFile.getAbsolutePath();       
        String baseFile = srcFilePath.substring(0, srcFilePath.lastIndexOf(".c"));
        String mapFile = baseFile + ".map";
        cmd += " -Wl,-Map=" + mapFile + ",--gc-sections";
        return cmd;
    }
    
	protected String addCcMcu(String cmd) {
		String mcu = ProcessUnits.getMcu();
		if (mcu == null || mcu.isEmpty())
			mcu = ParseUnit.current().getProperty(ITarget.P_MCU);
		if (mcu == null || mcu.isEmpty())
			return cmd;
		cmd += " -mtune=" + mcu;
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
    protected String cmdLoad() {
		String loader = ParseUnit.current().getProperty(ITarget.P_LOADER);
        if (!loader.isEmpty() && !new File(loader).exists())
        	curr.reportFailure("property file does not specifiy a valid loader tool path");
		return loader;
    }
    protected String addLoaderOpts(String cmd) {
    	if (cmd.isEmpty())
    		return cmd;
    	cmd = super.addLoaderOpts(cmd);
    	cmd += " -e -U flash:w:"; // must precede filename
        return cmd;
    }
}
