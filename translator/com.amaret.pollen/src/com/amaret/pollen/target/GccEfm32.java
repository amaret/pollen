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
        
        // TODO what is typeinfo for String?
        //typeInfo.put(TypeId.STRING,   new TypeInfo(2, 1));   ????
              
    }
    protected String cmdObjCopy() {
		String objcopy = ParseUnit.current().getProperty(ITarget.P_OBJCOPY);
        if (!new File(objcopy).exists())
        	curr.reportFailure("property file does not specifiy a valid objcopy tool path");
		return objcopy;
    }
    protected String addCcMcu(String cmd) {
    	String mcu = ParseUnit.current().getProperty(ITarget.P_MCU);
    	if (mcu == null)
    		mcu = "efm32";
    	cmd += " -D" + mcu;  
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
