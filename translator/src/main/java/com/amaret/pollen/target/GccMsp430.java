package com.amaret.pollen.target;

import java.io.File;

import com.amaret.pollen.parser.ParseUnit;

/**
 * @author lucidbee (Megan Adams)
 */

public class GccMsp430 extends GccBase {

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
