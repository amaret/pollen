package com.amaret.pollen.parser;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;

import org.antlr.runtime.CommonToken;

import com.amaret.pollen.translator.ITarget.TypeId;
import com.amaret.pollen.translator.ITarget.TypeInfo;

public class TypeNode extends BaseNode implements DeclNode.ITypeInfo {
	
    // TypeNode.Arr
	// NOTE currently Array specifiers on the type name are not implemented.
    static public class Arr extends TypeNode {

        static final private int BASE = 0;
        static final private int NAME = 1;
        static final private int DIM = 2;
        
        Arr(int ttype, String ttext, EnumSet<Flags> flags) {
            super(ttype, ttext, flags);
        }
        
        @Override
        public TypeNode getBase() {
            return (TypeNode) getChild(BASE);
        }

        public ExprNode getDim() {
            return getChildCount() > DIM ? (ExprNode) getChild(DIM) : null;
        }
        
        public boolean hasDim() {
            return getChildCount() > DIM;
        }
        
        @Override
        protected void pass2End() {
        }
    }
    
    // TypeNode.UserDef
    static public class UserDef extends TypeNode {

        static final private int NAME = 0;
        
        private HashMap<String,SymbolEntry> symbolMap = new HashMap<String,SymbolEntry>();
        
        UserDef(int ttype, String ttext, EnumSet<Flags> flags) {
            super(ttype, ttext, flags);
        }
        
        public Atom getName() {
            return ((BaseNode) getChild(NAME)).getAtom();
        }
        
        
        public SymbolEntry getSymbol() {
            SymbolEntry sym = symbolMap.get(ParseUnit.current().getCurrUnitNode().getQualName());
            return sym; 
        }
        
        @Override
        protected boolean pass1Begin() {

            ParseUnit currUnit = ParseUnit.current();
            String path[] = getName().getText().split("\\.");
            
            if (path.length > 2) {
                currUnit.reportError(getName(), "too many levels of qualification");
                return false;
            }
            
            SymbolEntry symbol = currUnit.getSymbolTable().lookupName(path[0]);
            ISymbolNode snode = symbol != null ? symbol.node() : null;

            if (path.length == 2 && snode instanceof IScope) {
                symbol = ((IScope) snode).lookupName(path[1]);
                snode = symbol != null ? symbol.node() : null;
            }

            if (symbol == null || !(snode instanceof DeclNode.ITypeInfo)) {
                currUnit.reportError(getName(), "not a type");
            }

            symbolMap.put(currUnit.getCurrUnitNode().getQualName(), symbol);

            return false;
        }
    }
    
    // TypeNode.Fcn
    static public class Fcn extends TypeNode {

        static final private int ARGS = 1;
        static final private int BASE = 0;
        
        Fcn(int ttype, String ttext, EnumSet<Flags> flags) {
            super(ttype, ttext, flags);
        }
        
        @SuppressWarnings("unchecked")
        public List<TypeNode> getArgs() {
            return ((ListNode<TypeNode>) getChild(ARGS)).getElems();
        }

        @Override
        public TypeNode getBase() {
            return (TypeNode) getChild(BASE);
        }
    }
    
    
    // TypeNode.Std
    static public class Std extends TypeNode {

        static final private int IDENT = 0;
        static final private HashMap<String,TypeId> tidMap = new HashMap<String,TypeId>();
        
        // TODO this doesn't map to c platform, fix that.
        static {
            tidMap.put("Bool",      TypeId.BOOL);
            tidMap.put("Bool",      TypeId.BYTE);
            tidMap.put("Int8",      TypeId.INT8);
            tidMap.put("Int16",     TypeId.INT16);
            tidMap.put("Int32",     TypeId.INT32);
            tidMap.put("String",    TypeId.STRING);
            tidMap.put("UInt8",    TypeId.INT8);
            tidMap.put("UInt16",    TypeId.INT16);
            tidMap.put("UInt32",    TypeId.INT32);
        }
        
        Std(int ttype, String ttext, EnumSet<Flags> flags) {
			super(ttype, ttext, flags);
		}
    	
        public Atom getIdent() {
            return ((BaseNode) getChild(IDENT)).getAtom();
        }
        
    }
    
    // TypeNode
    
    EnumSet<Flags> flags = EnumSet.noneOf(Flags.class);

        
    TypeNode(int ttype, String ttext, EnumSet<Flags> f) {
        this.token = new CommonToken(ttype, ttext);
        flags = f;
    }
        
    public TypeNode getBase() {
        return null;
    }
    
    public EnumSet<Flags>  getModifiers() {
        return flags;
    }
    
    @Override
    public TypeInfo getTypeInfo() {
        return null;
    }
    
    @Override
    protected boolean pass1Begin() {
        return true;
    }
    
    @Override
    protected boolean pass2Begin() {
        return true;
    }

    public TypeNode toRaw() {
        return this;
    }
}
