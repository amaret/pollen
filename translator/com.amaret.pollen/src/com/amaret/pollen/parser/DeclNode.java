package com.amaret.pollen.parser;

import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import org.antlr.runtime.CommonToken;

import com.amaret.pollen.parser.pollenParser.TypeInfo;

public class DeclNode extends BaseNode implements ISymbolNode {
	
    // DeclNode.Formal (parameter)
    static public class Formal extends DeclNode implements ITypeSpecInit {

        static final private int TYPE = 0;
        static final private int NAME = 1;
        // subtree
        static final private int INIT = 0;
      
        Formal(int ttype, String ttext) {
            super(ttype, ttext, EnumSet.noneOf(Flags.class));
        }
        
        Formal(int ttype, String ttext, EnumSet<Flags> f) {
            super(ttype, ttext, f);
        }

        @Override
        public ExprNode getInit() {
        	return (getChild(NAME).getChildCount() > 0) ? (ExprNode) getChild(NAME).getChild(INIT) : null;
        }
        @Override
        public Atom getName() {
        	return ((BaseNode) getChild(NAME)).getAtom();
        }

        @Override
        public BaseNode getTypeSpec() {
            return (TypeNode) getChild(TYPE);
        }
    }
    static public class Arr extends DeclNode implements ITypeSpecInit {

        static final private int BASE = 0;
        static final private int NAME = 1;
        static final private int DIM = 2;
        static final private int INIT = 3;
        
        Arr(int ttype, String ttext, EnumSet<Flags> flags) {
            super(ttype, ttext, flags);
        }
        
        @Override
        public BaseNode getTypeSpec() {
            return (TypeNode) getChild(BASE);
        }

        public ExprNode getDim() {
            return getChildCount() > DIM ? (ExprNode) getChild(DIM) : null;
        }
        
        @Override
        public Atom getName() {
        	return ((BaseNode) getChild(NAME)).getAtom();
        }
        
        public boolean hasDim() {
            return getChildCount() > DIM;
        }
        
        @Override
        public void pass2End() {

        }

		
		/**
		 * @return  null as the initializer for an array is a list
		 */
        @Override
		public ExprNode getInit() {
			return null;
		}
		/**
		 * 
		 * @return a List of initializers
		 */
		public ListNode getInitList() {
			return getChildCount() > INIT ? (ListNode) getChild(INIT) : null;
			
		}
    }
    
    // DeclNode.Enum
    static public class Enum extends DeclNode implements ITypeInfo {
        
        Enum(int ttype, String ttext, EnumSet<Flags> f) {
            super(ttype, ttext, f);
        }
        
        @SuppressWarnings("unchecked")
        public List<DeclNode.EnumVal> getVals() {
            return ((ListNode<DeclNode.EnumVal>) getChild(NAME)).getElems();
        }

        @Override
        public TypeInfo getTypeInfo() {
        	// TODO
        	TypeInfo rtn = null;
        	assert rtn != null;
        	return rtn;
           // return ParseUnit.current().getTarget().getTypeInfo(TypeId.INT8);
        }
    }
    
    // DeclNode.EnumVal
    static public class EnumVal extends DeclNode {

        EnumVal(int ttype, String ttext, EnumSet<Flags> f) {
            super(ttype, ttext, f);
        }
        
        Atom getVal() {
        	// grammar requires integer literal
        	return ((BaseNode) this.getChild(0)).getAtom();
        }
    }
       
    // DeclNode.Fcn
    static public class Fcn extends DeclNode implements ITypeSpec, IScope {

        static final private int TYPE_NAME = 0;
    	static final private int FORMALS = 1;
        static final private int BODY = 2;
        
        // subtree
        static final private int TYPE = 0;
        static final private int NAME = 1;

        private NestedScope scopeDeleg = new NestedScope(this);
		private boolean isVoid = false;
        
        Fcn(int ttype, String ttext, EnumSet<Flags>  flags) {
            super(ttype, ttext, flags);
        }
        
        private int checkArgs() {
            int res = 0;
            boolean initFlg = false;
            for (DeclNode.Formal arg : getFormals()) {
                initFlg = initFlg || (arg.getInit() != null);
                if (!initFlg) {
                    res += 1;
                }
                else if (arg.getInit() == null) {
                    ParseUnit.current().reportError(arg.getName(), "default argument value required");
                    return -1;
                }
            }
            return res;
        }
        
        @Override
        public boolean defineSymbol(Atom name, ISymbolNode symbol) {
            return scopeDeleg.defineSymbol(name, symbol);
        }
        
        @SuppressWarnings("unchecked")
        public List<DeclNode.Formal> getFormals() {
            return ((ListNode<DeclNode.Formal>) getChild(FORMALS)).getElems();
        }

        @Override
        public IScope getEnclosingScope() {
            return scopeDeleg.getEnclosingScope();
        }
        
        @Override
        public Set<Map.Entry<String,SymbolEntry>> getEntrySet() {
            return scopeDeleg.getEntrySet();
        }
        
        @Override
        public BaseNode getTypeSpec() {    
        	BaseNode b = (BaseNode) getChild(TYPE_NAME);
        	ListNode<TypeNode> rtnTypes = (ListNode<TypeNode>) b.getChild(TYPE);       
            return  rtnTypes;
        }        
        public boolean isVoid() {
        	return isVoid;
        }
        
        @Override
        public Atom getName() {
        	BaseNode b = ((BaseNode) getChild(TYPE_NAME));
        	return ((BaseNode) b.getChild(NAME)).getAtom();
        }        
        @Override
        protected boolean pass1Begin() {
            super.pass1Begin();
            ParseUnit currUnit = ParseUnit.current();
            currUnit.getSymbolTable().enterScope(this);
            IScope scope = getEnclosingScope();
            if (currUnit.getCurrUnitNode().isProtocol()) {
                currUnit.reportError(getName(), "protocols can't have function definitions");
                return false;
            }
            
            String path[] = getName().getText().split("\\.");
            if (path.length > 2) {
                currUnit.reportError(getName(), "too many levels of qualification");
                return false;
            }
            
            //SymbolEntry symbol = currUnit.getSymbolTable().lookupName(path[0]);
            //ISymbolNode snode = symbol == null ? null : symbol.node();
            // TODO: create signature set
            
        	BaseNode b = (BaseNode) getChild(TYPE_NAME);
        	ListNode<TypeNode> rtnTypes = (ListNode<TypeNode>) b.getChild(TYPE);       
			if (rtnTypes.getElems().isEmpty())
        		isVoid = true;
			
			currUnit.getCurrUnitNode().addFcn(getName().getText(), this);
 
            return true;
        }
        @Override
        protected void pass1End() {
            ParseUnit.current().getSymbolTable().leaveScope();
            super.pass1End();
        }
        @Override
        public void replaceSymbol(Atom name, ISymbolNode symbol) {
            scopeDeleg.replaceSymbol(name, symbol);
        }

        @Override
        public SymbolEntry resolveSymbol(Atom name) {
             return scopeDeleg.resolveSymbol(name);
        }

        @Override
        public void setEnclosingScope(IScope scope) {
            scopeDeleg.setEnclosingScope(scope);
        }

        @Override
        public SymbolEntry lookupName(String name) {
            return scopeDeleg.lookupName(name);
        }
     }
    static public class FcnRef extends DeclNode implements ITypeSpecInit {

        static final private int FCN = 0;
    	static final private int FORMALS = 1;
        static final private int NAME = 2;
        
		private boolean isVoid = false;
        
        FcnRef(int ttype, String ttext, EnumSet<Flags>  flags) {
            super(ttype, ttext, flags);
        }      
         /**
         * @return a list of formal parameter types (no names).
         */
        @SuppressWarnings("unchecked")
        public List<BaseNode> getFormals() {
            return ((ListNode<BaseNode>) getChild(FORMALS)).getElems();
        }
        public BaseNode getTypeSpec() {
            return (BaseNode) getChild(FCN);
        }
    
        public boolean isVoid() {
        	return isVoid;
        }
        
        @Override
        public Atom getName() {
        	return ((BaseNode) getChild(NAME)).getAtom();
        }        
        @Override
        protected boolean pass1Begin() {
            super.pass1Begin();
            ParseUnit currUnit = ParseUnit.current();
            // TODO lookup fcn and get return type (void?)           
            // TODO: create signature set
            			
            return true;
        }

        @Override
        protected void pass1End() {
            ParseUnit.current().getSymbolTable().leaveScope();
            super.pass1End();
        }

		public ExprNode getInit() {
			return null;
		}
     }
    
    // DeclNode.ITypeInfo
    static public interface ITypeInfo {
        public TypeInfo getTypeInfo();
    }
    
    // DeclNode.ITypeSpec
    static public interface ITypeSpec {
        public Atom getName();
        public Cat getTypeCat();
        /**
         * 
         * @return a BaseNode
         * It may be a TypeNode or a List<TypeNode>.
         * The latter is a function with a set of return values.
         */
        public BaseNode getTypeSpec();
    }
    
    // DeclNode.ITypeSpecInit
    static public interface ITypeSpecInit extends ITypeSpec {
        public ExprNode getInit();
    }
    
    // DeclNode.ProtocolMember
    static public class ProtocolMember extends DeclNode implements ITypeSpecInit {
        
        
        ProtocolMember(int ttype, String ttext, EnumSet<Flags> f) {
            super(ttype, ttext, f);
        }
        
        @Override
        protected boolean pass1Begin() {
            super.pass1Begin();
            ParseUnit currUnit = ParseUnit.current();
            // TODO
            // check that the type of this protocol member is a protocol
            
            return false;
        }

		/* (non-Javadoc)
		 * @see com.amaret.pollen.parser.DeclNode.ITypeSpecInit#getInit()
		 */
		@Override
		public ExprNode getInit() {
			// TODO Auto-generated method stub
			return null;
		}

		/* (non-Javadoc)
		 * @see com.amaret.pollen.parser.DeclNode.ITypeSpec#getTypeSpec()
		 */
		@Override
		public BaseNode getTypeSpec() {
			// TODO Auto-generated method stub
			return null;
		}
    }

    // DeclNode.UserTypeDef
    static public class UserTypeDef extends DeclNode implements IScope, ITypeInfo {

     	static final private int FEATURES = 1;
        
       
        private DeclNode.UserTypeDef classParent = null;
        private NestedScope scopeDeleg = new NestedScope(this);
        
        UserTypeDef(int ttype, String ttext,  EnumSet<Flags>  flags) {
            super(ttype, ttext, flags);
        }
        public EnumSet<Flags> getFlags() {
        	return flags;	// Except for nested class, these apply to unit.
        }
        
        public boolean isModule() {
        	if (flags.contains(Flags.MODULE))
        		return true;
        	return false;
        }       
        public boolean isProtocol() {
        	if (flags.contains(Flags.PROTOCOL))
        		return true;
        	return false;
        }
        public boolean isComposition() {
        	if (flags.contains(Flags.COMPOSITION))
        		return true;
        	return false;
        }
        public boolean isClass() {
        	if (flags.contains(Flags.CLASS))
        		return true;
        	return false;
        }
        public boolean isMeta() {
        	if (flags.contains(Flags.META))
        		return true;
        	return false;
        }


        @Override
        public boolean defineSymbol(Atom name, ISymbolNode symbol) {
            return scopeDeleg.defineSymbol(name, symbol);
        }

        public DeclNode.UserTypeDef getClassParent() {
            return classParent;
        }
        
        @Override
        public IScope getEnclosingScope() {
            return scopeDeleg.getEnclosingScope();
        }

        @Override
        public Set<Map.Entry<String,SymbolEntry>> getEntrySet() {
            return scopeDeleg.getEntrySet();
        }

        @Override
        public TypeInfo getTypeInfo() {
        	// TODO
            return (null);
        }
        
        public String getUnitQualName() {
            return ((UnitNode) getEnclosingScope()).getQualName();
        }
        
        @Override
        protected boolean pass1Begin() {
        	// TODO check that any implemented protocols are actually implemented.
            ParseUnit currUnit = ParseUnit.current();
            super.pass1Begin();
            
            if (currUnit.getCurrUnitNode().getUnitType() != this && this.isClass()) {
            	classParent = currUnit.getCurrUnitNode().getUnitType();
            }
         
            SymbolTable symtab = currUnit.getSymbolTable();
            if (classParent != null) {
                scopeDeleg.addSymbols(classParent.scopeDeleg.getEntrySet());
                symtab.curScope().replaceSymbol(getName(), this);
            }
            symtab.enterScope(this);
            return true;
        }

        @Override
        protected void pass1End() {
            ParseUnit.current().getSymbolTable().leaveScope();
            super.pass1End();
        }

        @Override
        public void replaceSymbol(Atom name, ISymbolNode symbol) {
            scopeDeleg.replaceSymbol(name, symbol);
        }

        @Override
        public SymbolEntry resolveSymbol(Atom name) {
            return scopeDeleg.resolveSymbol(name);
        }

        @Override
        public void setEnclosingScope(IScope scope) {
            scopeDeleg.setEnclosingScope(scope);
        }

        @Override
        public SymbolEntry lookupName(String name) {
            return scopeDeleg.lookupName(name);
        }
    }
    
    // DeclNode.Var
    static public class Var extends DeclNode implements ITypeSpecInit {
    	
    	static final private int NAME = 1;
        static final private int TYPE = 0;
        // subtree
        static final private int INIT = 2;
 
        Var(int ttype, String ttext, EnumSet<Flags>  flags) {
            super(ttype, ttext, flags);
        }

        @Override
        public ExprNode getInit() {
        	if (getChild(NAME).getChildCount() > 0) {
        		BaseNode b = ((BaseNode) getChild(NAME));
            	return ((ExprNode) getChild(INIT));        		
        	}        
            return null;
        }
        /**
         * 
         * @return true if this has 'new' on the dcln
         */
        boolean isStaticInstance() {
        	return (flags.contains(Flags.NEW));
        }
        @Override
        public Atom getName() {
        	return ((BaseNode) getChild(NAME)).getAtom();
        }

        @Override
        public BaseNode getTypeSpec() {
            return (TypeNode) getChild(TYPE);
        }

        @Override
        protected boolean pass1Begin() {
            super.pass1Begin();
            ParseUnit currUnit = ParseUnit.current();
            // if type is protocol check that this is module or module fcn
            // and set flag for protocol member
            // if static instance check that type is a class
            if (isPublic()) {
                currUnit.reportError(getName(), "variables can't be \'public\'");
            }
            return true;
        }
    }
    
    // DeclNode
    
    static final private int NAME = 0;
    
    private IScope definingScope;
    private Cat typeCat;
    
    EnumSet<Flags> flags = EnumSet.noneOf(Flags.class);

    
    DeclNode(int ttype, String ttext, EnumSet<Flags> f) {
      	this.token = new CommonToken(ttype, ttext);
    	this.flags = f;
    }
    
    @Override
    public IScope getDefiningScope() {
        return definingScope;
    }
    
    @Override
    public Atom getName() {
    	return ((BaseNode) getChild(NAME)).getAtom();
    }
    
    @Override
    public Cat getTypeCat() {
    	// TODO
    	Cat rtn = null;
    	assert rtn != null;
        return rtn;
    }
    public boolean isPublic() {
    	return flags.contains(Flags.PUBLIC);
    }

    public boolean isHost() {
    	return flags.contains(Flags.HOST);
    }

    public boolean isConst() {
        return flags.contains(Flags.CONST);
    }

    @Override
    protected boolean pass1Begin() {
        ParseUnit currUnit = ParseUnit.current();
        Atom name = getName();

        if (currUnit.getSymbolTable().defineSymbol(name, this) == false) {
            currUnit.reportError(name, "identifier already defined in the current scope");
        }
        return true;
    }
    
    @Override
    protected boolean pass2Begin() {
        return true;
    }
    
    @Override
    public void pass2End() {
        if (!(this instanceof ITypeSpecInit)) {
            return;
        }
        ITypeSpecInit tsi = (ITypeSpecInit) this;
        ExprNode init = tsi.getInit();
        if (init == null) {
            return;
        }
        if (this.getDefiningScope() instanceof UnitNode && !init.isConst()) {
            ParseUnit.current().reportError(init, "initializer must be a constant expression");
            return;
        }
        //TypeRules.checkInit(tsi.getTypeCat(), init);
    }

    @Override
    public void setDefiningScope(IScope scope) {
        definingScope = scope;
    }
    
    @Override
    public String toString() {
    	return token.getText() + flags;
    }

}
