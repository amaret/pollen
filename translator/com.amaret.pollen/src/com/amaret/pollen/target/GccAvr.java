package com.amaret.pollen.target;

import java.io.File;

import com.amaret.pollen.parser.ParseUnit;

public class GccAvr extends GccBase {

    static final private String CRT_S = "/crt0.s";
    static final private String CRT_O = "/crt0.o";
    static final private String LNK_CMD = "/lnk.cmd";

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
    @Override
    public void compile(File srcFile) throws Exception {
        
        ParseUnit curr = ParseUnit.current();
        
        String srcFilePath = srcFile.getAbsolutePath();
        
        String baseFile = srcFilePath.substring(0, srcFilePath.lastIndexOf(".c"));
        String asmFile = baseFile + ".s";
        String objFile = baseFile + ".o";
        String mapFile = baseFile + ".map";
        String outFile = baseFile + ".out";

        String gcc = curr.getProperty(ITarget.P_TOOLSDIR) + "/" + curr.getProperty(ITarget.P_TOOLPREFIX) + "gcc";
        String targDir = getTargDir();
        
        String cmd;
        
        cmd = "";
        cmd += gcc;
        cmd = addCcOptsPrefix(cmd);
        cmd += " -mmcu=atmega328p"; //+ curr.getProperty(ITarget.P_MCU);
        cmd += " -I" + curr.getPollenRoot();
        cmd = addCcOpts(cmd);
        cmd += srcFile;
        cmd += " -Wl,-Map=" + mapFile + ",--gc-sections";
        //cmd += " -Wa,-ahl=" + asmFile;
        cmd += " -o " + outFile;
        cmd = addCcOptsSuffix(cmd);
        if (execCmd(cmd) != 0) {
            return;
        }
        
//        if (mustBuild(targDir + CRT_O, targDir + CRT_S)) {
//            cmd = "";
//            cmd += gcc;
//            //cmd += " -mmcu=" + curr.getProperty(ITarget.P_MCU);
//            cmd += " -c -x assembler-with-cpp " + targDir + CRT_S;
//            cmd += " -o " + targDir + CRT_O;
//            if (execCmd(cmd) != 0) {
//                return;
//            }
//        }
//        
        cmd = "";
        cmd += gcc;
        //cmd += " -mmcu=" + curr.getProperty(ITarget.P_MCU);
        //cmd += " --entry __init -u __init -nostdlib";
       cmd += " -o " + outFile;
        //cmd += " " + targDir + CRT_O;
        cmd += " " + objFile;
        //cmd += " -T " + targDir + LNK_CMD;
//        if (execCmd(cmd) != 0) {
//            return;
//        }
        
    }



}
