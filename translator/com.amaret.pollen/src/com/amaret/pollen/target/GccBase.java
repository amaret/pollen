package com.amaret.pollen.target;

import java.io.File;
import java.util.EnumMap;

import com.amaret.pollen.parser.ParseUnit;

public abstract class GccBase extends BaseTarget {

    static final protected EnumMap<TypeId,TypeInfo> typeInfo = new EnumMap<TypeId, TypeInfo>(ITarget.TypeId.class);
    ParseUnit curr = ParseUnit.current();

    public GccBase() {    	
    }
    
    public String getGcc() {
        String gcc = curr.getProperty(ITarget.P_TOOLSDIR) + File.separator + curr.getProperty(ITarget.P_TOOLPREFIX) + "gcc";
        if (!new File(gcc).exists())
        	curr.reportFailure("property file does not specifiy a valid c compiler path");
        return gcc;
    }
    protected String addMapFile(String cmd, File srcFile) {
        
        String srcFilePath = srcFile.getAbsolutePath();       
        String baseFile = srcFilePath.substring(0, srcFilePath.lastIndexOf(".c"));
        String mapFile = baseFile + ".map";
        cmd += " -Wl,-Map=" + mapFile;
        return cmd; //-Wl,-Map,[FILENAME].map'
    }
    protected String cmdObjCopy() {
		String objcopy = ParseUnit.current().getProperty(ITarget.P_TOOLSDIR)
				+ "/" + ParseUnit.current().getProperty(ITarget.P_TOOLPREFIX)
				+ "objcopy";
        if (!new File(objcopy).exists())
        	curr.reportFailure("property file does not specifiy a valid objcopy tool path");
		return objcopy;
    }
    protected String addObjCopyFiles(String cmd, File srcFile) {
        String srcFilePath = srcFile.getAbsolutePath();       
        String baseFile = srcFilePath.substring(0, srcFilePath.lastIndexOf(".c"));
        String outFile = baseFile + ".out";
        String hexFile = baseFile + ".hex";
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
    
    @Override
    public int bitsPerChar() {
        return 8;
    }
  
    @Override
    public TypeInfo getTypeInfo(TypeId tid) {
        return typeInfo.get(tid);
    }
    
    @Override
    public boolean isBigEndian() {
        return false;
    }

	/**
	 * @param srcFile
	 * @throws Exception
	 */
	protected void execCompile(File srcFile) throws Exception {
		String cmd;
	    cmd = getGcc();        
	    cmd = addCcOptsPrefix(cmd);
	    cmd = addCcFlags(cmd);
	    cmd = addPollenBundles(cmd);
	    cmd = addPollenTarget(cmd);
	    cmd = addCcMcu(cmd);
	    cmd = addMapFile(cmd, srcFile);
	    cmd = addCcOpts(cmd);
	    cmd = addSrcOutFiles(cmd, srcFile);
	    cmd = addCcOptsSuffix(cmd);
	    
		ParseUnit.Times.startTime(ParseUnit.Time.GCC);		
		int rtn = execCmd(cmd);		
		ParseUnit.Times.endTime(ParseUnit.Time.GCC);

	    if (rtn != 0) {
	        return;
	    }
	    
	    cmd = cmdObjCopy();
	    cmd = addObjCopyOpts(cmd);
	    cmd = addObjCopyFiles(cmd, srcFile);
	    	    
		ParseUnit.Times.startTime(ParseUnit.Time.OBJCOPY);		
		rtn = execCmd(cmd);		
		ParseUnit.Times.endTime(ParseUnit.Time.OBJCOPY);

	    if (rtn != 0) {
	        return;
	    }
	    
	    cmd = cmdLoad();
	    cmd = addLoaderOpts(cmd);
	    cmd = addLoaderFiles(cmd, srcFile);
	    
	    if (execCmd(cmd) != 0) {
	        return;
	    }
	}   
}
