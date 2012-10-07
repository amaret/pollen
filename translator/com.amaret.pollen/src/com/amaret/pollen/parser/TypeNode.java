package com.amaret.pollen.parser;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;

import org.antlr.runtime.CommonToken;

import com.amaret.pollen.target.ITarget.TypeId;
import com.amaret.pollen.target.ITarget.TypeInfo;

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
    
    // TypeNode.Lst
    // Functions with multiple returns specify that with a list of types. 
    static public class Lst extends TypeNode {

        static final private int ITEMS = 0;
         
        Lst(int ttype, String ttext, EnumSet<Flags> flags) {
            super(ttype, ttext, flags);
        }
        
        @SuppressWarnings("unchecked")
        public List<TypeNode> getTypes() {
            return ((ListNode<TypeNode>) getChild(ITEMS)).getElems();
        }
      
        @SuppressWarnings("unchecked")
		public TypeNode getFirst() {
            return (TypeNode) ((ListNode<TypeNode>) getChild(ITEMS)).getElems().get(0);
        }
        
        @SuppressWarnings("unchecked")
        protected boolean pass1Begin() {

        	boolean success = false;
        	if (((ListNode<TypeNode>) getChild(ITEMS)).getElems() != null && ((ListNode<TypeNode>) getChild(ITEMS)).getElems().size() > 0) {
        		for (TypeNode t : ((ListNode<TypeNode>) getChild(ITEMS)).getElems()) {
        			success = t.pass1Begin();
        			if (success == false) return false;
        		}
        	}
        	return success;
        }
  
    }
    
    // TypeNode.Usr a user defined type
    static public class Usr extends TypeNode {

        static final private int NAME = 0;
        
        private HashMap<String,SymbolEntry> symbolMap = new HashMap<String,SymbolEntry>();
        
        Usr(int ttype, String ttext, EnumSet<Flags> flags) {
            super(ttype, ttext, flags);
        }
        
        public Atom getName() {
            return ((BaseNode) getChild(NAME)).getAtom();
        }
        
        public SymbolEntry getSymbol() {
        	SymbolEntry symbol;
        	symbol = symbolMap.get(this.getName().getText());
        	
            if (symbol == null) {
            	symbol = ParseUnit.current().getCurrUnitNode().lookupName(ParseUnit.current().getCurrUnitNode().getQualName());           	
            }
            return symbol;
        	
        }
        
        
        public SymbolEntry getSymbol(IScope scopeOfRef) {
        	
        	
        	SymbolEntry symbol;
        	symbol = scopeOfRef.lookupName(this.getName().getText());

        	
            if (symbol == null) {
            	symbol = ParseUnit.current().getCurrUnitNode().lookupName(ParseUnit.current().getCurrUnitNode().getQualName());           	
            }
            return symbol; 
        }
        
        private ISymbolNode enterName(String toEnter) {
        	
            SymbolEntry symbol = ParseUnit.current().getSymbolTable().lookupName(toEnter);
            ISymbolNode snode = symbol != null ? symbol.node() : null;
            if (symbol != null)
            	symbolMap.put(toEnter, symbol);   
            
            boolean okFlag = false;  // ok to be used as a type
            if (snode != null) {
            	okFlag = (snode instanceof DeclNode.Formal && ((DeclNode.Formal) snode)
            			.isTypeMetaArg()) ? true : snode instanceof ImportNode ? true : false; 
				okFlag = okFlag || snode instanceof DeclNode.ITypeInfo
						|| snode instanceof DeclNode.Fcn
						|| snode instanceof DeclNode.FcnTyp;
            }
					
            // type members ok?
            if (symbol == null || !okFlag)  {
            	ParseUnit.current().reportError(getName(), "not a type");
            }
            return snode;
        }
        
        @Override
        protected boolean pass1Begin() {
        	
        	// In the TypeNode.Usr symbolMap we need these entries:
        	//   the current unit type
        	//   an entry for each qualifier
        	// This supports name lookup / xlation in the output phase. 
        	

            ParseUnit currUnit = ParseUnit.current();
            String path[] = getName().getText().split("\\.");
            
            if (path.length > 2) {
                currUnit.reportError(getName(), "too many levels of qualification");
                return false;
            }
            String dbgStr = currUnit.getCurrUnitNode().getUnit().getName().getText();
            enterName(dbgStr);
            
            ISymbolNode snode = null;
            if (!currUnit.getCurrUnitNode().getName().equals(path[0])) {
            	snode = enterName(path[0]);
            	dbgStr += ", " + path[0];
            }

            if (path.length == 2 && snode instanceof IScope) {
            	snode = enterName(getName().getText()); //(path[1]);
            	dbgStr += ", " + path[1];
            }
            
            String u = "In " + ParseUnit.current().getCurrUnitNode().getName().getText();          
            String dbgStr2 = u + ", entering type " + dbgStr + " in DeclNode.Usr.pass1Begin() : ";
            if (snode != null) {
            	String enc = snode.getDefiningScope().getEnclosingScope() != null ? snode.getDefiningScope().getEnclosingScope().getScopeName() + "." : "null.";
            	dbgStr2 +=  " scope " + enc + snode.getDefiningScope().getScopeName();
            }
            //System.out.println(dbgStr2);
            
            if (snode == null)
            	return false;
            return true;
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
        this.token = new Atom(ttype, ttext);
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
