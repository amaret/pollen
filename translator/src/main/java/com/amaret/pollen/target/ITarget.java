package com.amaret.pollen.target;

import java.io.File;
/**
 * @author lucidbee (Megan Adams)
 */
public interface ITarget {
	
	public static final String P_CCOPTS = "pollen.target.compiler.flags";
    public static final String P_CCOPTSPRE = "pollen.target.compiler.flags.prefix";
    public static final String P_CCOPTSSUF = "pollen.target.compiler.flags.suffix";
    public static final String P_CLASS = "pollen.target.class";
    public static final String P_DISABLE = "pollen.target.disable";
    public static final String P_ECHO = "pollen.target.echo";
    public static final String P_MCU = "pollen.target.mcu";
    public static final String P_NAME = "pollen.target.name";
    public static final String P_TOOLPREFIX = "pollen.target.tools.prefix";
    public static final String P_TOOLSDIR = "pollen.target.tools.home";
    public static final String P_LOADER = "pollen.target.loader";
    public static final String P_LOADER_FLAGS = "pollen.target.loader.flags";
    public static final String P_OBJCOPY = "pollen.target.objcopy";
    public static final String P_OBJFORMAT_IN = "pollen.target.objformat.input";
    public static final String P_OBJFORMAT_OUT = "pollen.target.objformat.output";    
    
    public enum TypeId { BOOL, BYTE, INT8, INT16, INT32, UINT8, UINT16, UINT32, STRING } 

    
    public class TypeInfo {
        public final int size;
        public final int align;
        public TypeInfo( int size, int align ) {
            this.size = size;
            this.align = align;
        }
    }
    public TypeInfo getTypeInfo(TypeId tid);
    public int bitsPerChar();
    public boolean isBigEndian();
    
    public void compile(File srcFile) throws Exception;

}
