package com.amaret.pollen.target;

import java.util.EnumMap;

public abstract class GccBase extends BaseTarget {

    static final protected EnumMap<TypeId,TypeInfo> typeInfo = new EnumMap<TypeId, TypeInfo>(ITarget.TypeId.class);
    

    public GccBase() {    	
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
}
