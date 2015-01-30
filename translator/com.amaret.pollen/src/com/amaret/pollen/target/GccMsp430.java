package com.amaret.pollen.target;

import java.io.File;

import com.amaret.pollen.parser.ParseUnit;

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
    /*
     * pollen.target.class = com.amaret.pollen.target.GccMsp430
pollen.target.compiler.flags = -ffunction-sections -fdata-sections \
  -g -Os -std=gnu99 -Wl,--relax -Wl,--gc-sections -Wl,-verbose
pollen.target.compiler.flags.prefix =
pollen.target.compiler.flags.suffix =
pollen.target.echo = yes
pollen.target.name = pollen.target.gcc.msp430
pollen.target.tools.prefix = msp430-
pollen.target.mcu = msp430
pollen.target.tools.home = /usr/local/msp430-toolchain/bin
pollen.target.loader =
pollen.target.loader.flags =
pollen.target.objcopy = /usr/local/msp430-toolchain/bin/msp430-objcopy
pollen.target.objformat.input = elf32-msp430
pollen.target.objformat.output = hex
(non-Javadoc)
     * @see com.amaret.pollen.target.BaseTarget#cmdObjCopy()
     */
    
    protected int execCmd(String cmd, boolean useInfoStream) throws Exception {
        return execCmd(cmd, useInfoStream, null);
    }

    @Override
    public void compile(File srcFile) throws Exception {
    	
//    	if (!ProcessUnits.isGccAvr())
//    		return;
        
        ParseUnit curr = ParseUnit.current();

        if ("yes".equals(curr.getProperty(ITarget.P_DISABLE))) {       	
        	return;
        } 
        execCompile(srcFile);
        
    }



}
