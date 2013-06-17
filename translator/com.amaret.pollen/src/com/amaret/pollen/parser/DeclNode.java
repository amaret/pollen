package com.amaret.pollen.parser;

import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import com.amaret.pollen.parser.ExprNode.Vec;
import com.amaret.pollen.parser.StmtNode.Bind;
import com.amaret.pollen.target.ITarget.TypeInfo;

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
            if (this.flags.contains(Flags.TYPE_META_ARG))
            	this.flags.add(Flags.META_ARG);
        }
        public boolean isTypeMetaArg() {
        	if (flags.contains(Flags.TYPE_META_ARG))
        		return true;
        	return false;
        }
        /**
         * 
         * @return true if this a value or type meta argument
         */
        public boolean isMetaArg() {
        	if (flags.contains(Flags.META_ARG))
        		return true;
        	return false;
        }
        public boolean isMethod() {            
        	if (flags.contains(Flags.METHOD))
        		return true;
        	return false;       	
        }

        protected boolean pass1Begin() {
            super.pass1Begin();
           
            if (getTypeSpec() != null)
            	getTypeSpec().pass1Begin();
            
            if (getInit() != null) {
            	getInit().pass1Begin();
            }
            
            return true;
        }
        @Override
        public void pass2End() {
        	       	
        	if (this.getParent() instanceof DeclNode.Fcn) {
        		return; // synthesized       		
        	}
        	Cat c = this.getTypeCat();
        	if (c instanceof Cat.Agg){
        		if (((Cat.Agg)c).isProtocol() || ((Cat.Agg)c).isComposition())  {
        			ParseUnit.current().reportError(getName(), "formal parameter type error for \'" + ((Cat.Agg) c).aggName() + "\' (protocol not allowed)");                			
        		}
        		if (((Cat.Agg)c).isComposition())  {
        			// TODO do I need to resolve this down to the module?
        			ParseUnit.current().reportError(getName(), "formal parameter type error for \'" + ((Cat.Agg) c).aggName() + "\' (composition not allowed)");                			
        		}
        	}
         	super.pass2End();          
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
        
        public TypeNode.Arr getTypeArr() {
        	return (TypeNode.Arr) getChild(BASE);
        }
        /**
         * Return the base type spec for the array.
         */
        @Override
        public TypeNode getTypeSpec() {
        	TypeNode.Arr t = (TypeNode.Arr) getChild(BASE);
        	return t.getBase();
        }
        @Override
        public Cat getTypeCat() {
            if (typeCat == null) {
            	typeCat = Cat.fromType(this.getTypeArr());
                //typeCat = Cat.fromSymbolNode(this, this.getDefiningScope());
           }
           return typeCat;

//        	if (typeCat == null && this.getTypeSpec() instanceof TypeNode.Usr) {
//        		String code = Cat.Scalar.codeFromString(((TypeNode.Usr) this.getTypeSpec()).getName().getText());
//        		if (code != null) {
//        			typeCat = Cat.fromScalarCode(code);
//        			return typeCat;
//        		}
//        	}
//        	return super.getTypeCat();
        }
        /**
         * 
         * @return first dimension
         * TODO delete and replace with getDim() after multi-dim is implemented
         */
        @SuppressWarnings("unchecked")
		public ExprNode getFirstDim() {
        	ListNode<ExprNode> child = (ListNode<ExprNode>) getChild(DIM);
         	return (!child.getElems().isEmpty()) ? child.getElems().get(0) : null;  
        }
		@SuppressWarnings("unchecked")
		public ListNode<ExprNode> getDim() {
			return getChildCount() > DIM ? (ListNode<ExprNode>) getChild(DIM) : null;
			
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
        	ExprNode.Vec v = getInit();
        	if (v != null) {
        		SymbolEntry symbol = ParseUnit.current().getSymbolTable().resolveSymbol(getName());
        		v.setSymbol(symbol);
        	}
        }

        @Override
		public ExprNode.Vec getInit() {
        	return (Vec) (getChildCount() > INIT ? getChild(INIT) : null);
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
    	
    	public ExprNode getInjectExpr() {
    		return ((ExprNode) getChild(INJECT));
    	}
        protected boolean pass1Begin() {
            return true;
        }
    }
       
    // DeclNode.Fcn
    static public class Fcn extends DeclNode implements ITypeSpec, IScope {

        static final private int TYPE_NAME = 0;
    	static final private int FORMALS = 1;
    	static final private int THIS_PTR = 2;
        static final private int BODY = 3;
        
        // subtree
        static final private int TYPE = 0;
        static final private int NAME = 1;
        static final private int TYPE_LST = 0;

        private NestedScope scopeDeleg = new NestedScope(this);
		Fcn(int ttype, String ttext, EnumSet<Flags>  flags) {
            super(ttype, ttext, flags);
        }
		
		private DeclNode.Class cls = null;
		private String cname = "";
        
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
        /**
         * This is a ptr to class data added to class method calls,
         * declarations, and definitions. 
         * Not a part of the signature for typing purposes.
         * @return the synthesized 'this' ptr
         */
        public DeclNode.Formal getThisPtr() {
        	return ((DeclNode.Formal) getChild(THIS_PTR));
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
        	DeclNode.FcnTyp b = (DeclNode.FcnTyp) getChild(TYPE_NAME);
        	TypeNode.Lst t = (TypeNode.Lst) b.getChild(TYPE);        	
        	ListNode<TypeNode> child = (ListNode<TypeNode>) t.getChild(TYPE_LST);
        	return child.getElems();
        }
        
        public boolean isVoid() {            
        	if (flags.contains(Flags.VOID_FCN))
        		return true;
        	return false;       	
        }
      
        public boolean isHost() {
        	if (flags.contains(Flags.HOST))
        		return true;
        	return false;
        }
        
        public boolean isConstructor() {
        	if (flags.contains(Flags.CONSTRUCTOR))
        		return true;
        	return false;
        }
     
        public String cname() {
        	
            IScope scope = getEnclosingScope();
            IScope outer = (scope != null) ? scope.getEnclosingScope() : null;
           
            // class name is a qualifier added to name only for nested class.
            cls = scope instanceof DeclNode.Class  && (outer instanceof DeclNode.Usr) ? (DeclNode.Class) scope : null;
            cname = (cls == null) ? ("" + getName()) : ("" + cls.getName() + "__" + getName());

            return cname;

        }
        
        public DeclNode.Class getFcnClass() {
			return cls;
		}

		@Override
        public Atom getName() {
        	DeclNode.FcnTyp b = ((DeclNode.FcnTyp) getChild(TYPE_NAME));
        	return ((BaseNode) b.getChild(NAME)).getAtom();       	
        }     
        @Override
        public String getScopeName() {
        	return getName().getText();
        }
        public boolean isMethod() {            
        	if (flags.contains(Flags.METHOD))
        		return true;
        	return false;       	
        }
        @Override
        protected boolean pass1Begin() {
            
            ParseUnit currUnit = ParseUnit.current();
            Atom name = getName();
            unit = currUnit.getCurrUnitNode();
            
            if (name.getText().matches(ParseUnit.INTRINSIC_PREFIX + ".*")) {
            	flags.add(Flags.PUBLIC); // always
            	if (isMethod())
            		currUnit.reportError(name, "pollen lifecycle functions must be defined in modules");
            }
            
            
           	IScope scopeToUse = currUnit.getSymbolTable().curScope();
           	if (((Usr) currUnit.getSymbolTable().curScope()).getScopeDeleg().lookupName(name.getText()) != null)
        		currUnit.reportError(name, "identifier already defined in the current scope");    
           	if (((Usr) currUnit.getSymbolTable().curScope()).getScopeHost().lookupName(name.getText()) != null)
        		currUnit.reportError(name, "identifier already defined in the current scope");           	
           	
           	// Host functions go in a host scope 
        	if (isHost() && scopeToUse instanceof DeclNode.Usr)
        		scopeToUse = ((DeclNode.Usr) scopeToUse).getScopeHost();

            scopeToUse.defineSymbol(name, this);
            
            currUnit.getSymbolTable().enterScope(this);
            currUnit.getCurrUnitNode().setHostScope(isHost());

           
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
            			
			currUnit.getCurrUnitNode().addFcn(getName().getText(), this);

            return true;
        }
        @Override
        protected void pass1End() {
            ParseUnit.current().getSymbolTable().leaveScope();
            ParseUnit.current().getCurrUnitNode().setHostScope(false);
            super.pass1End();
        }
        protected boolean pass2Begin() {
            ParseUnit.current().getSymbolTable().enterScope(this);
            ParseUnit.current().getCurrUnitNode().setHostScope(isHost());
            return true;
        }
        @Override
        public void pass2End() {
            ParseUnit.current().getSymbolTable().leaveScope();
            ParseUnit.current().getCurrUnitNode().setHostScope(false);
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
    // DeclNode.FcnTyp the subtree that contains the function type and name
    static public class FcnTyp extends DeclNode implements ITypeSpec {
        // subtree
        static final private int TYPE = 0;
        static final private int NAME = 1;
        static final private int TYPE_LST = 0;
        
        FcnTyp(int ttype, String ttext) { 
            super(ttype, ttext);
        }
        
       @Override
        public Atom getName() {       
        	return ((BaseNode) getChild(NAME)).getAtom();       	
        } 
        @SuppressWarnings("unchecked")
		@Override
        public TypeNode getTypeSpec() {  
        	// TODO 
        	// this returns the first child in a list
        	// implement the list of types as the return type 
        	//BaseNode child = (BaseNode) getChild(TYPE_LST);
        	//ListNode<TypeNode> child = (ListNode<TypeNode>) getChild(TYPE_LST);;
        	TypeNode.Lst t = (TypeNode.Lst) getChild(TYPE);        	
        	ListNode<TypeNode> child = (ListNode<TypeNode>) t.getChild(TYPE_LST);
         	return (!child.getElems().isEmpty()) ? child.getElems().get(0) : null;        	
        } 
        protected boolean pass1Begin() {
        	
        	boolean rtn =  super.pass1Begin();
        	if (!rtn) return false;
        	rtn = ((BaseNode) getChild(TYPE_LST)).pass1Begin();
        	return rtn;        	
        }
    	
    }

    static public class FcnRef extends DeclNode.TypedMember implements ITypeSpecInit {

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
    
    static public interface ITypeKind {
    	public boolean isModule();
    	public boolean isComposition();
    	public boolean isProtocol();
    	public boolean isClass();
    	public boolean isEnum();
    	public boolean isReady();
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
    // For proxy (protocol member), a member with class type, or a member with function type (function ref)
    static public class TypedMember extends DeclNode.Var implements ITypeSpecInit, IScope, IUnitWrapper, ITypeKind {
        
        
        TypedMember(int ttype, String ttext, EnumSet<Flags> f) {
            super(ttype, ttext, f);
        }
        static final private int NAME = 1;
        static final private int TYPE = 0;
        static final private int INIT = 2; 
              
        private UnitNode unitType;  // the unit for the type of this typed member. 
        
        // for protocol members
        private UnitNode bindToUnit = null; 			// the module to which this protocol member is bound
        private TypeNode bindToTypeSpec = null; 		// typeSpec for that module
        private UnitNode bindLocUnit = null;			// module where binding takes place 
		
        private NestedScope scopeDeleg = new NestedScope(this);
        private Cat.Fcn fcnCat = null;   // for function references
        private boolean isMetaPrimitive = false; // a TypedMember with a meta type instantiated to a primitive has null unitType
        
        
        public boolean isMetaPrimitive() {
			return isMetaPrimitive;
		}
        public UnitNode getBindLocUnit() {
			return bindLocUnit;
		}


		public Atom getTypeName() {
        	TypeNode.Usr t = ((TypeNode.Usr) getChild(TYPE));
        	return t.getName();
        }
        
        @Override
        public Atom getName() {
        	return ((BaseNode) getChild(NAME)).getAtom();
        }
        /**
         * Could be null - if this is a meta type instantiated to a primitive, e.g. uint8.
         * @return the unitType type of this member.
         */
        public UnitNode getTypeUnit() {
            return unitType;
        }
        public Cat getTypeCat() {
        	if (typeCat == null) {
        		if (!this.isMetaPrimitive()) {
        			typeCat = Cat.fromSymbolNode(this, this.getDefiningScope());
        		}
        		else {
        			// the type name is an alias for an imported primitive type (instantiated meta type)
        			String n = ((TypeNode.Usr) this.getTypeSpec()).getName().getText(); 
        			SymbolEntry se = ParseUnit.current().getSymbolTable().lookupName(n);
        			if (se != null && se.node() instanceof ImportNode) {
        				typeCat = Cat.fromScalarString(((ImportNode) se.node()).getUnitName().getText());       				
        			}
        			else 
           				typeCat = Cat.fromScalarString("void");       				

        		}
        			
        	}
        	return typeCat;
        }
        public Cat getFcnTypeCat() {
        	// for function references
        	if (fcnCat == null) {
        		if (this.getTypeSpec() instanceof TypeNode.Usr) {
        			SymbolEntry s = ((TypeNode.Usr) this.getTypeSpec()).getSymbol();
        			if (s != null && s.node() instanceof DeclNode.Fcn) {
        				fcnCat = (Cat.Fcn) s.node().getTypeCat();
        				if (!(this instanceof DeclNode.FcnRef)) {
        					ParseUnit.current().reportError(this.getName(), "function reference declarations require a parenthesized parameter type list");
        				}
        			}          			 			
        		}   
        	}
        	return fcnCat;
        }
        public boolean isFcnRef() {
        	return getFcnTypeCat() != null;
        }
        public boolean isClassRef() {
        	return this.isClass();
        }
        public boolean isProtocolMember() {
        	if (flags.contains(Flags.PROTOCOL_MEMBER))
        		return true;
        	return false;
        }
        @Override
        public String getQualName() {
            return getTypeUnit().getQualName() + '.' + getName();
        }
        @Override
        public String getScopeName() {
        	return getQualName();
        }
       
        @Override
        protected boolean pass1Begin() {
            super.pass1Begin();
            UnitNode curr = ParseUnit.current().getCurrUnitNode();
            SymbolEntry sym = curr.getUnitType().resolveSymbol(getTypeName());
            ISymbolNode snode = sym != null ? sym.node() : null;
            boolean isClass = (snode != null && snode instanceof DeclNode.Class);
            
            //UnitNode unitType = null;   // The UnitNode that contains the type of this typed member. 
              // For a nested type T in module M, that is the unit node for M. 
            
            if (snode instanceof ImportNode) {
                unitType = ((ImportNode) snode).getUnit();
            }
            else if (snode instanceof UnitNode) {
                unitType = (UnitNode) snode;
            }
            else if (snode instanceof DeclNode.Fcn || snode instanceof DeclNode.Usr)
            	unitType = ((DeclNode)snode).getUnit();
            
            if (unitType == null ) { 
            	isMetaPrimitive = true;
            	// this can happen when meta type is a instantiation to a primitive e.g. uint8
             }
            else {
            	if (unitType.isProtocol() && !(snode instanceof DeclNode.Fcn))
            		flags.add(Flags.PROTOCOL_MEMBER);
            	else {
            		if (!unitType.isClass() && !this.isFcnRef() && !isClass) {
            			ParseUnit.current().reportError(getTypeName(), "a typed member can have protocol, class, or function type");
            		}
            	}
                scopeDeleg.addSymbols(unitType.getEntrySet());
            }
            return false;
        }

    	/**
    	 * Connect the protocol member to its implementing module unit (unitNode). 
    	 * @param mt After binding, use this type for typeSpec
    	 */
    	public void bindModule(UnitNode mUnit, TypeNode mt, Bind bind) {
    		if (this.isProtocolMember()) {
    			if (bindToUnit != null) {
                    ParseUnit.current().reportError(this, "More than one binding encountered for a protocol member. Warning: binding order is indeterminate.");
    			}
    			bindToUnit = mUnit;
    			bindToTypeSpec = mt;
    			typeCat = Cat.fromSymbolNode(bindToUnit, unit.getDefiningScope());   		
    			bindLocUnit = ParseUnit.current().getCurrUnitNode();		
    		}
    	}

        public UnitNode getBindToUnit() {
			return bindToUnit;
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
        	if (getChildCount() > INIT) {
        		return ((ExprNode) getChild(INIT));  		
        	}  
            return null;
        }
        @Override
        public TypeNode getTypeSpec() {
        	if (bindToTypeSpec != null)
        		return bindToTypeSpec;
            return (TypeNode) getChild(TYPE);
        }
		@Override
		public boolean isClass() {
			if (unitType != null)
				return unitType.isClass();		
			return false;
		}

		@Override
		public boolean isComposition() {
			if (unitType != null)
				return unitType.isComposition();		
			return false;

		}

		@Override
		public boolean isEnum() {
			if (unitType != null)
				return unitType.isEnum();		
			return false;
		}

		@Override
		public boolean isModule() {
			if (unitType != null)
				return unitType.isModule();		
			return false;

		}

		@Override
		public boolean isProtocol() {
			if (unitType != null)
				return unitType.isProtocol();		
			return false;
		}

		@Override
		public boolean isReady() {
			return (unitType != null);
		}

    }
    
    static public class Class extends DeclNode.Usr {
    		
		Class(int ttype, String ttext,  EnumSet<Flags>  flags, String qn) {
            super(ttype, ttext, flags, qn);
        }
    	
    }

    // DeclNode.User  a user defined type
    static public class Usr extends DeclNode implements IScope, ITypeInfo, ITypeKind {

     	static final protected int FEATURES = 1;
     	static final protected int EXTENDS = 2;
     	static final protected int IMPLEMENTS = 3;
     	static final protected int VALS = 1; // enum
     	static final protected int META = 4; 
     	//static final protected int META_IMPORTS = 4; // unused - earlier pollen
     	  // had imports valid only in 'meta' scope
     	      
        protected DeclNode.Usr containingType = null;
        protected DeclNode.Usr baseType = null; // from extends clause
        protected DeclNode.Usr implementedType = null;
        protected NestedScope scopeDeleg = new NestedScope(this);
        protected NestedScope scopeHost = new NestedScope(this);
        protected String qname = "";
        private boolean qnameSet = false;
        
        public DeclNode.Usr copy() {
        	DeclNode.Usr newU = new DeclNode.Usr(token.getType(), token.getText(), flags, "");
        	qname = this.qname;
        	return newU;
        }
        
		public NestedScope getScopeHost() {
			return scopeHost;
		}
        public NestedScope getScopeDeleg() {
        	return scopeDeleg;
        }
		Usr(int ttype, String ttext,  EnumSet<Flags>  flags, String qn) {
            super(ttype, ttext, flags);
            qname = (qn.equals("NIL")) ? "" : qn;
        }
		@Override
		public boolean isReady() {
			return true;
		}
        public DeclNode.Usr getBaseType() {
        	if (baseType == null 
        			&& this.getExtends() != null) {
        		SymbolEntry p = lookupName(getExtends().getText());
        		if (p != null) {
        			BaseNode b = (BaseNode) p.node();
        			if (b instanceof ImportNode
        					&& ((ImportNode)b).getUnit() != null) {
        				baseType = ((ImportNode)b).getUnit().getUnitType();       				
        			}
        			else if (b instanceof DeclNode.Usr)
        				baseType = (Usr) p.node();       				
        		}
        	}
        	return baseType;
		}
		public EnumSet<Flags> getFlags() {
        	return flags;	// Except for nested class, these apply to unitType.
        }
        
        @SuppressWarnings("unchecked")
    	public List<DeclNode> getFeatures() {
        	return ((ListNode<DeclNode>)getChild(FEATURES)).getElems();
        }
        
        public BaseNode getExtends() {
        
        	if (!this.isProtocol() && !this.isComposition())
        		return null;
        	if (this.getChild(EXTENDS).getType() == pollenParser.NIL)
        		return null;
        	return (BaseNode) this.getChild(EXTENDS);
        }
        /**
         * 
         * @return meta formals for this meta type. May be IMPORT or FORMAL
         * (for meta type parameters or meta value parameters). 
         */
        @SuppressWarnings("unchecked")
		public ListNode<BaseNode> getMetaFormals() {
        	if (getChildCount() > META && this.isMeta() && getChild(META).getChildCount() > 0) {
        		ListNode<BaseNode> l = ((ListNode<BaseNode>) getChild(META));
        		if (l.getElems().isEmpty()) {
                    ParseUnit.current().reportError(getName(), "Meta types cannot have empty formal parameter list");
                    return null;
        		}
        		return l;       		
        	}
        	return null;
		}
        
        /** 
         * Qualify the Unit name using 'as' name in the instantiating unitType.
         * This enforces uniqueness in the scope of reference despite 
         * multiple instantiations in the scope of reference. 
         * ONLY call just before translation phase.
         */
        public void setMetaQualName() {
        	if (!qnameSet && !qname.isEmpty()) {       		
        		//getName().setText(getName().getText() + "_" + qname); // too complex
        		getName().setText(qname);
        		qnameSet = true;
        	}
        }
		public String getMetaQualName() {
			return qname;
		}
		public BaseNode getImplements() {
        	if (this.isEnum() || this.isProtocol()) // || this.isComposition())
        		return null;
        	if (this.getChild(IMPLEMENTS).getType() == pollenParser.NIL)
        		return null;
        	return (BaseNode) this.getChild(IMPLEMENTS);
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
        public boolean isTarget() {
        	return !isHost();
        }
        public boolean isHost() {
        	if (flags.contains(Flags.COMPOSITION))
        		return true;
        	return false;
        }
        public boolean isComposition() {
        	if (flags.contains(Flags.COMPOSITION))
        		return true;
        	return false;
        }
        public boolean isVoid() { // deferred instantiation for a meta type
        	if (flags.contains(Flags.VOID_INSTANCE))
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

        public DeclNode.Usr getContainingType() {
            return containingType;
        }
        /**
         * 
         * @return type for 'implements'
         */
        public DeclNode.Usr getImplementedType() {
        	if (implementedType == null && this.getImplements() != null) {
        		SymbolEntry p = lookupName(getImplements().getText());
        		if (p != null) {
        			implementedType = (Usr) p.node();       				
        		}
        	}
        	return implementedType;
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
			return (getEnclosingScope() instanceof UnitNode) ? ((UnitNode) getEnclosingScope())
					.getQualName()
					: (getEnclosingScope() instanceof DeclNode.Usr ? ((DeclNode.Usr) getEnclosingScope())
							.getUnitQualName()
							: "??");
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
            	containingType = currUnit.getCurrUnitNode().getUnitType();
            }
            
            if (this.getBaseType() != null) {
            	scopeDeleg.addSymbols(this.getBaseType().scopeDeleg.getEntrySet());
            }
         
            SymbolTable symtab = currUnit.getSymbolTable();
            if (containingType != null) {
                scopeDeleg.addSymbols(containingType.scopeDeleg.getEntrySet());
                symtab.curScope().replaceSymbol(getName(), this);
            }
            else {
            	symtab.curScope().defineSymbol(getName(), this);
            }
            if (this.getMetaFormals() != null) {
            	
            	for (BaseNode b : this.getMetaFormals().getElems()) {
            		if (b instanceof DeclNode.Formal) {
            			DeclNode.Formal f = (Formal) b;
            			f.pass1Begin();
            			// If the meta argument is a void instance, this unitType is also
            			SymbolEntry symbol = ParseUnit.current().getSymbolTable().lookupName(f.getName().getText());
            			ISymbolNode snode = symbol != null ? symbol.node() : null;
            			if (snode instanceof DeclNode.Usr && ((DeclNode.Usr) snode).isVoid()) {
            				flags.add(Flags.VOID_INSTANCE);
            			}
            		}

            	}            	
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
        	
        	if (this.getImplements() != null) {
        		String n = this.getImplements().getText();
        		SymbolEntry p = lookupName(n);
        		if (p != null && implementedType == null) {
        			if (p.node() instanceof ImportNode) {
        				implementedType = ((ImportNode)p.node()).getUnit().getUnitType();
        			}
        			else 
        				implementedType = (Usr) p.node();       		
        			TypeRules.checkImplements(this,p);       		
        		}
        	}
            if (this.getBaseType() != null) {
            	scopeDeleg.addSymbols(this.getBaseType().scopeDeleg.getEntrySet());
            }
            if (this.getExtends() != null && this.getBaseType() == null) {
            	ParseUnit.current().reportError(this, "Use of the clause 'extends " + this.getExtends().getText() + "' requires that '" + this.getExtends().getText() + "' be imported" );
            }

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
    	
    	boolean intrinsicUsed = false;
        
        Var(int ttype, String ttext, EnumSet<Flags>  flags) {
            super(ttype, ttext, flags);
        }
        
        public boolean isIntrinsic() {
        	return (flags.contains(Flags.INTRINSIC_VAR));
        }

        /**
         * @return for an intrinsic variable return true if used, all other cases false.
         */
        public boolean isIntrinsicUsed() {
			return intrinsicUsed;
		}

		public void setIntrinsicUsed(boolean intrinsicUsed) {
			if (flags.contains(Flags.INTRINSIC_VAR))
				this.intrinsicUsed = intrinsicUsed;
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
         * and is a module member.
         */
        public boolean isStaticInstance() {
        	IScope sc = this.getDefiningScope();
        	boolean isStatic = sc instanceof DeclNode.Usr 
        		&& ((DeclNode.Usr)sc).isModule() 
        		&& flags.contains(Flags.NEW);
        	return isStatic;
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
        public Cat getTypeCat() {
        	if (typeCat == null && this.getTypeSpec() instanceof TypeNode.Usr) {
        		String code = Cat.Scalar.codeFromString(((TypeNode.Usr) this.getTypeSpec()).getName().getText());
        		if (code != null) {
        			typeCat = Cat.fromScalarCode(code);
        			return typeCat;
        		}
        	}
        	return super.getTypeCat();
        }

        @Override
        protected boolean pass1Begin() {
            super.pass1Begin();
            ParseUnit currUnit = ParseUnit.current();
           
            if (isPublic()) {
                currUnit.reportError(getName(), "variables can't be \'public\'");
            }
            if (getTypeSpec() != null)
            	getTypeSpec().pass1Begin();
            
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
            ITypeSpecInit tsi = (ITypeSpecInit) this;
            ExprNode init = tsi.getInit();
            if (init != null)
            	TypeRules.checkInit(tsi.getTypeCat(), init);
        }
    }
    
    // DeclNode
    
    static final private int NAME = 0;
    
    private IScope definingScope;
    protected Cat typeCat;
    protected UnitNode unit;
    
    EnumSet<Flags> flags = EnumSet.noneOf(Flags.class);

    
    DeclNode(int ttype, String ttext, EnumSet<Flags> f) {
      	this.token = new Atom(ttype, ttext);
    	this.flags = f;
    }
    DeclNode(int ttype, String ttext) {
      	this.token = new Atom(ttype, ttext);
    }
    boolean query(EnumSet<Flags> q) {
    	return (flags.contains(q));
    }
    
    public UnitNode getUnit() {
		return unit;
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
        unit = currUnit.getCurrUnitNode();
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
