package com.amaret.pollen.translate;

import java.io.File;

public interface ITarget {
    
    
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
    
    /*public int bitsPerChar();
    public void compile(File srcFile) throws Exception;
    public ISymbolReader getSymbolReader();   
    public boolean isBigEndian();
    public void load(File exeFile) throws Exception;
    public String mkConstDecl(String cname);*/

}
