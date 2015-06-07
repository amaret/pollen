package com.amaret.pollen.target;

import java.io.File;

import com.amaret.pollen.driver.ProcessUnits;
import com.amaret.pollen.parser.ParseUnit;

/**
 * @author amichi (Amichi AMar)
 */

public class GccMicrochip extends GccBase {

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
    public String getGcc() {
        String gcc = curr.getProperty(ITarget.P_TOOLSDIR) + File.separator + curr.getProperty(ITarget.P_TOOLPREFIX);

        if (curr.getProperty(ITarget.P_TOOLPREFIX).equals("xc16-")) {
            gcc +=  "gcc";
        }

        if (!new File(gcc).exists())
            curr.reportFailure("property file does not specifiy a valid c compiler path");
        return gcc;
    }

    @Override
    protected String addMapFile(String cmd, File srcFile) {
        
        if (!"xc8".equals(curr.getProperty(ITarget.P_TOOLPREFIX))) {
            String srcFilePath = srcFile.getAbsolutePath();       
            String baseFile = srcFilePath.substring(0, srcFilePath.lastIndexOf(".c"));
            String mapFile = baseFile + ".map";
            cmd += " -Wl,-Map=" + mapFile;            
        }
        return cmd;
    }

    protected String addCcMcu(String cmd) {
      String mcu = ProcessUnits.getMcu();
      if (mcu == null || mcu.isEmpty())
        mcu = ParseUnit.current().getProperty(ITarget.P_MCU);
      if (mcu != null && !mcu.isEmpty())
        cmd += " -mcpu=" + mcu; 
      return cmd;
    }

    @Override
    protected String cmdObjCopy() {
        if (!"xc8".equals(curr.getProperty(ITarget.P_TOOLPREFIX))) {
            String objcopy = ParseUnit.current().getProperty(ITarget.P_OBJCOPY);
                if (!new File(objcopy).exists())
                    curr.reportFailure("property file does not specifiy a valid objcopy tool path: " + objcopy);
            return objcopy;            
        } else {
            return "";
        }

    }

    @Override   
    protected String addObjCopyFiles(String cmd, File srcFile) {
        String srcFilePath = srcFile.getAbsolutePath();       
        String baseFile = srcFilePath.substring(0, srcFilePath.lastIndexOf(".c"));
        String outFile = baseFile;
        if ("xc8".equals(curr.getProperty(ITarget.P_TOOLPREFIX))) {
            return "";
        } {

        cmd += " " + outFile + ".elf";
        return cmd;
    }

    @Override
    protected String addObjCopyOpts(String cmd) {
        return cmd;
    }
    /**
     * If serious error count > 0 produce c files but don't compile or link.
     */
    protected String addSrcOutFiles(String cmd, File srcFile) {
        
        String srcFilePath = srcFile.getAbsolutePath();       
        String baseFile = srcFilePath.substring(0, srcFilePath.lastIndexOf(".c"));
        cmd += " " + srcFile;
        String outFile = baseFile;

        if ("xc8".equals(curr.getProperty(ITarget.P_TOOLPREFIX))) {
            cmd += " -O" + outFile + ".obj";
        } else {
            cmd += " -o " + outFile + ".elf";        
        }
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
