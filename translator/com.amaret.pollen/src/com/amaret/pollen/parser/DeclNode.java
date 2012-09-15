package com.amaret.pollen.parser;

import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import org.antlr.runtime.CommonToken;
import org.antlr.runtime.tree.Tree;

import com.amaret.pollen.translator.ITarget.TypeInfo;

public class DeclNode extends BaseNode implements ISymbolNode {
	
    // DeclNode.Formal (parameter)
    static public class Formal extends DeclNode implements ITypeSpecInit {

        static final private int TYPE = 0;
        static final private int NAME = 1;
        static final private int INIT = 2;
      
        Formal(int ttype, String ttext) {
            super(ttype, ttext, EnumSet.noneOf(Flags.class));
        }
        
        Formal(int ttype, String ttext, EnumSet<Flags> f) {
            super(ttype, ttext, f);
        }
        public boolean isTypeMetaFormalParameter() {
        	if (flags.contains(Flags.TYPE_META_FP))
        		return true;
        	return false;
        }

        @Override
        public ExprNode getInit() {
        	if (getChildCount() > INIT) {
        		return ((ExprNode) getChild(INIT));
        	}    
            return null;
        }      
        @Override
        public Atom getName() {
        	return ((BaseNode) getChild(NAME)).getAtom();
        }

        @Override
        public TypeNode getTypeSpec() {
            return (TypeNode) getChild(TYPE);
        }
    }
    static public class Arr extends DeclNode.Var implements ITypeSpecInit {

        static final private int BASE = 0;
        static final private int NAME = 1;
        static final private int DIM = 2;
        static final private int INIT = 3;
        
        Arr(int ttype, String ttext, EnumSet<Flags> flags) {
            super(ttype, ttext, flags);
        }
        
        @Override
        public TypeNode getTypeSpec() {
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
		@SuppressWarnings("unchecked")
		public ListNode<ExprNode> getInitList() {
			return getChildCount() > INIT ? (ListNode<ExprNode>) getChild(INIT) : null;
			
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
    // DeclNode.Inject
    // for type features  consisting of injected code.
    static public class Inject extends DeclNode {
    	static final int INJECT = 0;
    	
    	Inject(int ttype, String ttext) {
    		super(ttype, ttext, EnumSet.noneOf(Flags.class));
    	}
    	
    	ExprNode getInjectExpr() {
    		return ((ExprNode) getChild(INJECT));
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
        static final private int TYPE_LST = 0;

        private NestedScope scopeDeleg = new NestedScope(this);
		private boolean isVoid = false;
        
        Fcn(int ttype, String ttext, EnumSet<Flags>  flags) {
            super(ttype, ttext, flags);
            if (flags.contains(Flags.HOST)) {
            	System.out.println("HOST");
            }
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
        
        public BodyNode getBody() {
        	return ((BodyNode) getChild(BODY));
        }

        @Override
        public IScope getEnclosingScope() {
            return scopeDeleg.getEnclosingScope();
        }
        
        @Override
        public Set<Map.Entry<String,SymbolEntry>> getEntrySet() {
            return scopeDeleg.getEntrySet();
        }
        
        @SuppressWarnings("unchecked")
		@Override
        public TypeNode getTypeSpec() {  
        	// TODO 
        	// this returns the first child in a list
        	// implement the list of types as the return type 
         	return (!this.getReturnList().isEmpty()) ? this.getReturnList().get(0) : null;
        } 
        /**
         * 
         * @return a List of the return types
         */
        @SuppressWarnings("unchecked")
		public List<TypeNode> getReturnList() {
        	BaseNode b = (BaseNode) getChild(TYPE_NAME);
        	TypeNode.Lst t = (TypeNode.Lst) b.getChild(TYPE);        	
        	ListNode<TypeNode> child = (ListNode<TypeNode>) t.getChild(TYPE_LST);
        	return child.getElems();
        }
        
        public boolean isVoid() {
        	return isVoid;
        }
        public boolean isHost() {
        	if (flags.contains(Flags.HOST))
        		return true;
        	return false;
        }
        
        public String cname() {
        	return getName().toString();
        }
        
        @Override
        public Atom getName() {
        	BaseNode b = ((BaseNode) getChild(TYPE_NAME));
        	return ((BaseNode) b.getChild(NAME)).getAtom();       	
        }     
        @Override
        public String getScopeName() {
        	return getName().getText();
        }
        @Override
        protected boolean pass1Begin() {
            
            ParseUnit currUnit = ParseUnit.current();
            Atom name = getName();
            
           	IScope scopeToUse = currUnit.getSymbolTable().curScope();
           	// Host functions go in a host scope 
        	if (isHost() && scopeToUse instanceof DeclNode.Usr)
        		scopeToUse = ((DeclNode.Usr) scopeToUse).getScopeHost();

            if (scopeToUse.defineSymbol(name, this) == false) {
                currUnit.reportError(name, "identifier already defined in the current scope");
            }   
            
            currUnit.getSymbolTable().enterScope(this);
           
            if (currUnit.getCurrUnitNode().isProtocol() && this.getBody() != null) {
                currUnit.reportError(getName(), "protocols can't have function definitions");
                return false;
            }
            
            String path[] = getName().getText().split("\\.");
            if (path.length > 2) {
                currUnit.reportError(getName(), "too many levels of qualification");
                return false;
            }

            // TODO: create signature set
            
			if (getReturnList().isEmpty())
        		isVoid = true;
			
			currUnit.getCurrUnitNode().addFcn(getName().getText(), this);
 
            return true;
        }
        @Override
        protected void pass1End() {
            ParseUnit.current().getSymbolTable().leaveScope();
            super.pass1End();
        }
        protected boolean pass2Begin() {
            ParseUnit.current().getSymbolTable().enterScope(this);
            return true;
        }
        @Override
        public void pass2End() {
            ParseUnit.current().getSymbolTable().leaveScope();
            super.pass2End();
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
        
        @Override
        public SymbolEntry lookupName(String name, boolean chkHostScope) {
            return scopeDeleg.lookupName(name, chkHostScope);
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
        public TypeNode getTypeSpec() {
            return (TypeNode) getChild(FCN);
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
        public TypeNode getTypeSpec();
    }
    
    // DeclNode.ITypeSpecInit
    static public interface ITypeSpecInit extends ITypeSpec {
        public ExprNode getInit();
    }
    
    // DeclNode.TypedMember
    // For proxy (protocol member) or a member with class type
    static public class TypedMember extends DeclNode.Var implements ITypeSpecInit, IScope, IUnitWrapper {
        
        
        TypedMember(int ttype, String ttext, EnumSet<Flags> f) {
            super(ttype, ttext, f);
        }
        static final private int NAME = 1;
        static final private int TYPE = 0;
        static final private int INIT = 0; // subtree
              
        private UnitNode unit;
        private NestedScope scopeDeleg = new NestedScope(this);
        
        
        public Atom getTypeName() {
        	TypeNode.Usr t = ((TypeNode.Usr) getChild(TYPE));
        	return t.getName();
        }
        
        @Override
        public Atom getName() {
        	return ((BaseNode) getChild(NAME)).getAtom();
        }
        
        public UnitNode getTypeUnit() {
            return unit;
        }
        
        @Override
        public String getQualName() {
            return ((UnitNode) getDefiningScope()).getQualName() + '.' + getName();
        }
        @Override
        public String getScopeName() {
        	return getQualName();
        }
        
        @Override
        public UnitNode getUnit() {
            return unit;
        }
        
        @Override
        protected boolean pass1Begin() {
            super.pass1Begin();
            UnitNode curr = ParseUnit.current().getCurrUnitNode();
            SymbolEntry sym = curr.resolveSymbol(getTypeName());
            ISymbolNode snode = sym != null ? sym.node() : null;
            if (snode instanceof ImportNode) {
                unit = ((ImportNode) snode).getUnit();
            }
            else if (snode instanceof UnitNode) {
                unit = (UnitNode) snode;
            }
            if (unit == null || unit.isModule() || unit.isComposition()) {
                ParseUnit.current().reportError(getTypeName(), "must be an protocol or class");
            }
            else {
                scopeDeleg.addSymbols(unit.getEntrySet());
            }
            return false;
        }

        @Override
        public boolean defineSymbol(Atom name, ISymbolNode node) {
            return scopeDeleg.defineSymbol(name, node);
        }

        @Override
        public IScope getEnclosingScope() {
            return scopeDeleg.getEnclosingScope();
        }

        @Override
        public Set<Entry<String, SymbolEntry>> getEntrySet() {
            return scopeDeleg.getEntrySet();
        }

        @Override
        public SymbolEntry lookupName(String name) {
            return scopeDeleg.lookupName(name);
        }
        
        @Override
        public SymbolEntry lookupName(String name, boolean chkHostScope) {
        	return scopeDeleg.lookupName(name, chkHostScope);
        }

        @Override
        public void replaceSymbol(Atom name, ISymbolNode node) {
            scopeDeleg.replaceSymbol(name, node);
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
        public ExprNode getInit() {
        	if (getChild(NAME).getChildCount() > INIT) {
        		BaseNode b = ((BaseNode) getChild(NAME));
            	return ((ExprNode) b.getChild(INIT));        		
        	}        
            return null;
        }
        @Override
        public TypeNode getTypeSpec() {
            return (TypeNode) getChild(TYPE);
        }

    }

    // DeclNode.User  a user defined type
    static public class Usr extends DeclNode implements IScope, ITypeInfo {

     	static final private int FEATURES = 1;
     	static final private int EXTENDS = 2;
     	static final private int IMPLEMENTS = 2;
     	static final private int VALS = 1;
     	static final private int META = 3; 
     	static final private int META_IMPORTS = 4;
        
       
        private DeclNode.Usr classParent = null;
        private NestedScope scopeDeleg = new NestedScope(this);
        private NestedScope scopeHost = new NestedScope(this);
        
        public NestedScope getScopeHost() {
			return scopeHost;
		}
		Usr(int ttype, String ttext,  EnumSet<Flags>  flags) {
            super(ttype, ttext, flags);
        }
        public EnumSet<Flags> getFlags() {
        	return flags;	// Except for nested class, these apply to unit.
        }
        
        @SuppressWarnings("unchecked")
    	public List<DeclNode> getFeatures() {
        	return ((ListNode<DeclNode>)getChild(FEATURES)).getElems();
        }
        
        public ExprNode getExtends() {
        	if (!this.isProtocol())
        		return null;
        	if (this.getChildCount() > EXTENDS) 
        		return (ExprNode) this.getChild(EXTENDS);
        	return null;
        }
        @SuppressWarnings("unchecked")
		public ListNode<DeclNode.Formal> getMetaFormals() {
        	if (getChildCount() > META && this.isMeta()) {
        		ListNode<DeclNode.Formal> l = ((ListNode<DeclNode.Formal>) getChild(META));
        		if (l.getElems().isEmpty()) {
                    ParseUnit.current().reportError(getName(), "Meta types cannot have empty formal parameter list");
                    return null;
        		}
        		return l;       		
        	}
        	return null;
		}
        @SuppressWarnings("unchecked")
        public List<ImportNode> getMetaImports() {
        	if (getChild(META_IMPORTS).getType() == pollenParser.NIL)
        		return null;
        	return ((ListNode<ImportNode>)getChild(META_IMPORTS)).getElems();
        }


        public ExprNode getImplements() {
        	if (!this.isComposition() || this.isClass())
        		return null;
        	if (this.getChildCount() > IMPLEMENTS) 
        		return (ExprNode) this.getChild(IMPLEMENTS);
        	return null;
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
        public boolean isEnum() {
        	if (flags.contains(Flags.ENUM))
        		return true;
        	return false;
        }
        @SuppressWarnings("unchecked")
		public List<DeclNode.EnumVal> getVals() {
        	if (this.isEnum())
        		return ((ListNode<DeclNode.EnumVal>) getChild(VALS)).getElems();
        	return null;
        }


        @Override
        public boolean defineSymbol(Atom name, ISymbolNode symbol) {
            return scopeDeleg.defineSymbol(name, symbol);
        }

        public DeclNode.Usr getClassParent() {
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
        public String getScopeName() {
        	return getName().getText();
        }
        /**
         * Enter regular and host scope.
         * Host function symbols are entered in a host scope.
         * Host scopes have the same enclosing scope as regular scopes.
         */
        private void enterScopes() {
        	SymbolTable symtab = ParseUnit.current().getSymbolTable();
        	scopeHost.setEnclosingScope(symtab.curScope());
        	symtab.enterScope(this);
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
            enterScopes();
            return true;
        }
        protected boolean pass2Begin() {
        	enterScopes();
            return true;
        }

        @Override
        protected void pass1End() {
            ParseUnit.current().getSymbolTable().leaveScope();
            super.pass1End();
        }
        @Override
        public void pass2End() {
            ParseUnit.current().getSymbolTable().leaveScope();
            super.pass2End();
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
        @Override
        public SymbolEntry lookupName(String name, boolean chkHostScope) {
        	if (chkHostScope)
        		return scopeHost.lookupName(name, chkHostScope);
        	return scopeDeleg.lookupName(name);
        }

    }
    
    // DeclNode.Var
    // A data member or a protocol member.
    static public class Var extends DeclNode implements ITypeSpecInit {
    	
    	static final private int NAME = 1;
    	static final private int TYPE = 0;
    	static final private int INIT = 2;
        
        Var(int ttype, String ttext, EnumSet<Flags>  flags) {
            super(ttype, ttext, flags);
        }

        @Override
        public ExprNode getInit() {
        	if (getChildCount() > INIT) {
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
        public TypeNode getTypeSpec() {
            return (TypeNode) getChild(TYPE);
        }

        @Override
        protected boolean pass1Begin() {
            super.pass1Begin();
            ParseUnit currUnit = ParseUnit.current();
           
            if (isPublic()) {
                currUnit.reportError(getName(), "variables can't be \'public\'");
            }
            if (getInit() != null) {
            	getInit().pass1Begin();
            }
            return true;
        }
        protected boolean pass2Begin() {
            super.pass2Begin();

            if (getInit() != null) {
            	getInit().pass2Begin();
            }
            return true;
        }
        public void pass2End() {
            if (getInit() != null) {
            	getInit().pass2End();
            }
        }
    }
    
    // DeclNode
    
    static final private int NAME = 0;
    
    private IScope definingScope;
    private Cat typeCat;
    
    EnumSet<Flags> flags = EnumSet.noneOf(Flags.class);

    
    DeclNode(int ttype, String ttext, EnumSet<Flags> f) {
      	this.token = new Atom(ttype, ttext);
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
        if (typeCat == null) {
            typeCat = Cat.fromSymbolNode(this, this.getDefiningScope());
        }
        return typeCat;
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
        TypeRules.checkInit(tsi.getTypeCat(), init);
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
