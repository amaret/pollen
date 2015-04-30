package com.amaret.pollen.script;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.NativeArray;
import org.mozilla.javascript.NativeObject;
import org.mozilla.javascript.Scriptable;

import com.amaret.pollen.parser.Atom;
import com.amaret.pollen.parser.ParseUnit;

/**
 * @author lucidbee (Megan Adams)
 */

public class Value {

    static final public Object UNDEF = Context.getUndefinedValue();
    
    static public class Arr extends Value {

        private NativeArray arr;
        
        Arr(NativeArray arr) {
            this.arr = arr;
        }
        
        public Object getAny(int index) {
            return arr.get(index, arr);
        }
        
        public Value.Arr getArr(int index) {
            return new Value.Arr((NativeArray) arr.get(index, arr));
        }

        public boolean getBool(int index) {
            return toBool(arr.get(index, arr));
        }
        
        public int getInt(int index) {
            return toInt(arr.get(index, arr));
        }

        public Value.Obj getObj(int index) {
            return new Value.Obj((NativeObject) arr.get(index, arr));
        }

        public String getStr(int index) {
            return (String)arr.get(index, arr);
        }

        public int length() {
            return (int)arr.getLength();
        }
    }
    
    static public class Obj extends Value {
        
        private NativeObject obj;

        Obj(NativeObject obj) {
            this.obj = obj;
        }
        
        public Object getAny(Atom name) {
            return obj.get(name.getText(), obj);
        }
        
        public Object getAny(String name) {
            return obj.get(name, obj);
        }
        
        public Value.Arr getArr(String name) {
            return new Value.Arr((NativeArray) obj.get(name, obj));
        }

        public boolean getBool(String name) {
            return toBool(obj.get(name, obj));
        }
        
        public int getInt(String name) {
            return toInt(obj.get(name, obj));
        }

        public Value.Obj getObj(String name) {
            return new Value.Obj((NativeObject) obj.get(name, obj));
        }

        public Object getProp(String name) {
            return obj.get(name, obj);
        }
        
        public String getStr(String name) {
        	Object o = obj.get(name, obj.getPrototype());
        	if (o == Scriptable.NOT_FOUND) {
        		return ParseUnit.JAVASCRIPT_OBJECT_NOT_FOUND;
        	}
        	else if (o instanceof String) 
        		return ((String) o);
        	else if (o == null) {
        		ParseUnit.current().reportJavascriptError("object is null");
        		return ParseUnit.JAVASCRIPT_OBJECT_NOT_FOUND;
        	}
        	else
        		ParseUnit.current().reportJavascriptError("object has unrecognized type");
        	return ParseUnit.JAVASCRIPT_OBJECT_NOT_FOUND;
        }
    }
    
    static private boolean toBool(Object bobj) {
        if (bobj instanceof Boolean) {
            return ((Boolean) bobj).booleanValue();
        }
        else if (bobj instanceof Number) {
            return ((Number) bobj).intValue() != 0;
        }
        else {
            return !(bobj == null || bobj == UNDEF || bobj == Scriptable.NOT_FOUND);
        }
    }
    
    static private int toInt(Object iobj) {
        if (iobj instanceof Boolean) {
            return ((Boolean) iobj).booleanValue() ? 1 : 0;
        }
        else {
            return ((Number) iobj).intValue();
        }
    }
    
    static public Object toVal( Object vobj ) {
        if (vobj instanceof NativeObject) {
            return new Value.Obj((NativeObject) vobj);
        }
        else if (vobj instanceof NativeArray) {
            return new Value.Arr((NativeArray) vobj);
        }
        else {
            return vobj;
        }
    }
}
