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

    @Override
    public void compile(File srcFile) throws Exception {
    	
        if ("yes".equals(ParseUnit.current().getProperty(ITarget.P_DISABLE))) {       	
        	return;
        } 
            
        execCompile(srcFile);
        
    }



}
