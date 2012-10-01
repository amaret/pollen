package com.amaret.pollen.parser;

import java.util.EnumSet;
import java.util.List;

import org.antlr.runtime.CommonToken;

public class ExprNode extends BaseNode {
	
    public interface AggVal {}
    
    // ExprNode.Binary
    static public class Binary extends ExprNode {

        static final private int LEFT = 1;
        static final private int OP = 0;
        static final private int RIGHT = 2;
        
        private boolean isAssign;
        
        Binary(int ttype, String ttext) {
            this(ttype, ttext, false);
        }
        
        Binary(int ttype, String ttext, boolean isAssign) {
            super(ttype, ttext);
            this.isAssign = isAssign;
        }
        
        public ExprNode getLeft() {
            return (ExprNode)getChild(LEFT);
        }
		
        public Atom getOp() {
            return ((BaseNode) getChild(OP)).getAtom();
        }

        public ExprNode getRight() {
            return (ExprNode)getChild(RIGHT);
        }
        
        public boolean isAssign() {
            return isAssign;
        }
        
        @Override
        protected void pass2End() {
            isConst = !isAssign && getLeft().isConst() && getRight().isConst();
            if (isAssign && getOp().getText().equals("=") && getRight() instanceof ExprNode.AggVal) {
                exprCat = getLeft().getCat();
                TypeRules.checkInit(exprCat, getRight());
                return;
            }
            Cat left = getLeft().getCat();
            Cat right = getRight().getCat();
            if ((exprCat = TypeRules.preCheck(left, right)) != null) {
                return;
            }
            exprCat = TypeRules.checkBinary(getOp().getText(), getLeft().getCat(), getRight().getCat());
            if (exprCat instanceof Cat.Error) {
                ParseUnit.current().reportError(getOp(), ((Cat.Error) exprCat).getMsg());
            }
        }
    }
    
    // ExprNode.Call
    static public class Call extends ExprNode {

        static final private int NAME = 0;
        static final private int ARGS = 1;
        static final private int DEREF = 2;
        
        Call(int ttype, String ttext) {
            super(ttype, ttext);
        }
        Call(int ttype, String ttext, boolean deref) {
            super(ttype, ttext);
            useScopeDeref = deref;
        }
       
        @SuppressWarnings("unchecked")
        public List<ExprNode> getArgs() {
            return ((ListNode<ExprNode>) getChild(ARGS)).getElems();
        }

        public ExprNode getName() {
            return (ExprNode) getChild(NAME);
        }
        /**
         * 
         * @return if this call is dereferenced, return deref expr else null.
         */
        public ExprNode getDeref() {
        	return this.getChildCount() == DEREF ? ((ExprNode) getChild(DEREF)) : null;
        }
        @Override
        protected boolean pass1Begin() {
        	// TODO resolve symbol
        	// TODO if useScopeDeref, use scopeDeref for symbol resolution
        	 
        	return super.pass1Begin();
        }
        protected boolean pass2Begin() {
        	SymbolEntry symbol = null;
        	ParseUnit currUnit = ParseUnit.current();
        	
        	SymbolTable symtab = currUnit.getSymbolTable();
        	
        	// look up the call identifier here rather than in Expr.Ident because here we know
        	// to check host scope. 
        	boolean chkHostScope = symtab.currScopeIsHost();

        	if (getName() != null && getName() instanceof ExprNode.Ident) {
        		ExprNode.Ident ei = (ExprNode.Ident) getName();
        		boolean flag = false;
        		if (ei.getName().getText().equals("Interrupt.setHandler"))
        			flag = true;
            	symbol = symtab.curScope().lookupName(ei.getName().getText(), chkHostScope);
            	
            	if (symbol == null) { 
            		currUnit.reportError(ei.getName(), "identifer is not declared in the current scope "
            				+  symtab.curScope().getScopeName());
            	}
            	else {
            		ei.setSymbol(symbol);
            	}
        	}

        	 
        	return super.pass2Begin();
        }
        
        @Override
        protected void pass2End() {
            
            ParseUnit currUnit = ParseUnit.current();
            Cat cat = getName().getCat();

            if ((exprCat = TypeRules.preCheck(cat)) != null) {
                return;
            }
            boolean fcnOrFcnRef = cat instanceof Cat.Fcn || cat instanceof Cat.Agg;
            if (!fcnOrFcnRef) {
                currUnit.reportError(getName(), "value is not a function");
                return;
            }
            // TODO 
            // signature matching, default parameter value insertion
            // overload resolution
            if (cat instanceof Cat.Agg && ((Cat.Agg) cat).aggScope() instanceof DeclNode.TypedMember) {
            	DeclNode.TypedMember tm = (DeclNode.TypedMember) ((Cat.Agg) cat).aggScope();
             	cat = tm.getFcnTypeCat();
            }
            Cat.Fcn fcncat = (Cat.Fcn) cat;
            int argc = getArgs().size();
            int minArgc = fcncat.minArgc();
            int maxArgc = fcncat.maxArgc();
            if (argc < minArgc || argc > maxArgc) {
                currUnit.reportError(getName(), "wrong number of arguments");
                return;
            }
     
            exprCat = fcncat.retCat();
            
            int k = -1;
            for (ExprNode e : getArgs()) {
                k += 1;
                Cat ecat = e.getCat();
                Cat acat = fcncat.argCats().get(k);
                if (e instanceof ExprNode.AggVal) {
                    TypeRules.checkInit(acat, e);
                    continue;
                }
                if (TypeRules.preCheck(ecat) != null) {
                    continue;
                }
                Cat res = TypeRules.checkBinary("=", acat, ecat, "argument type error");
                if (res instanceof Cat.Error) {
                    ParseUnit.current().reportError(e, ((Cat.Error) res).getMsg());
                }
            }
        }
    }   
    // ExprNode.Cond
    static public class Quest extends ExprNode {

        static final private int TEST = 0;
        static final private int TRUE = 1;
        static final private int FALSE = 2;
        
        Quest(int ttype, String ttext) {
            super(ttype, ttext);
        }
        
        public ExprNode getTest() {
            return (ExprNode) getChild(TEST);
        }
        
        public ExprNode getTrue() {
            return (ExprNode) getChild(TRUE);
        }

        public ExprNode getFalse() {
            return (ExprNode) getChild(FALSE);
        }

        @Override
        protected void pass2End() {

            isConst = getTrue().isConst && getTrue().isConst && getFalse().isConst;
            
            Cat leftCat = getTrue().getCat();
            Cat rightCat = getFalse().getCat();
            Cat testCat = getTest().getCat();
            
            if ((exprCat = TypeRules.preCheck(leftCat, rightCat)) != null) {
                return;
            }
            if ((exprCat = TypeRules.preCheck(testCat)) != null) {
                return;
            }
            
            exprCat = TypeRules.checkUnary("!", testCat, "condition type error");
            if (exprCat instanceof Cat.Error) {
                ParseUnit.current().reportError(getTest(), ((Cat.Error) exprCat).getMsg());
                return;
            }

            exprCat = TypeRules.checkBinary("==", leftCat, rightCat, "condition result types must match");
            if (exprCat instanceof Cat.Error) {
                ParseUnit.current().reportError(this, ((Cat.Error) exprCat).getMsg());
                return;
            }
            else {
                exprCat = leftCat;
            }
        }
    }
    
    // ExprNode.Const
    static public class Const extends ExprNode {

        static final private int VAL = 0;
        private EnumSet<LitFlags> litFlags = EnumSet.noneOf(LitFlags.class);       
        
        Const(int ttype, String ttext, EnumSet<LitFlags> f) {
			super(ttype, ttext);
			litFlags = f;
		}
    	
		public Atom getValue() {
		    return ((BaseNode) getChild(VAL)).getAtom();
		}
		
		public EnumSet<LitFlags> getLitFlags() {
			return litFlags;
		}
		
        @Override
        protected void pass2End() {
            isConst = true;
            String vs = getValue().getText();
            ParseUnit currUnit = ParseUnit.current();
            if (vs.startsWith("\"")) {
                currUnit.getCurrUnitNode().addString(vs);
                exprCat = Cat.fromScalarCode("s");
            }
            else if (vs.startsWith("'")) {
                exprCat = Cat.fromScalarCode("u1");
            }
            else if (Character.isDigit(vs.charAt(0))) {
                exprCat = Cat.fromScalarCode("n");
            }
           else if (vs.equals("null")) {
                exprCat = Cat.fromScalarCode("v");
            }
            else if (vs.equals("true") || vs.equals("false")) {
                exprCat = Cat.fromScalarCode("b");
            }
        }
    }
    
    // ExprNode.Esc
    static public class Inject extends ExprNode {
        
        static final private int NAME = 0;
        static final private int CODE = 0;
        
        Inject(int ttype, String ttext) {
            super(ttype, ttext);
        }

        public Atom getName() {
            return (Atom) ((BaseNode) getChild(NAME)).getToken();
        }
        public String getCode() {
        	return ((BaseNode) getChild(CODE)).getToken().getText();
        }
        
        @Override
        protected void pass2End() {
            exprCat = Cat.INJECT;
        }
    }
    
    // ExprNode.Hash
    static public class Hash extends ExprNode implements AggVal {
        
        static final private int IDS = 0;
        static final private int VALS = 1;
        
        Hash(int ttype, String ttext) {
            super(ttype, ttext);
        }

        @SuppressWarnings("unchecked")
        public List<BaseNode> getIds() {
            return ((ListNode<BaseNode>) getChild(IDS)).getElems();
        }

        @SuppressWarnings("unchecked")
        public List<ExprNode> getVals() {
            return ((ListNode<ExprNode>) getChild(VALS)).getElems();
        }

        @Override
        protected void pass2End() {
            isConst = true;
            for (ExprNode val : getVals()) {
                if ((isConst &= val.isConst) == false) {
                    break;
                }
            }
            exprCat = Cat.HASH;
        }
        
        @Override
        void setCat(Cat cat) {
            exprCat = cat;
        }
    }
    
    // ExprNode.Ident
    static public class Ident extends ExprNode {

        static final private int NAME = 0;
        
        private SymbolEntry symbol = null;
        
        Ident(int ttype, String ttext) {
            super(ttype, ttext);
        }
        
        Ident(int ttype, String ttext, boolean deref) {
            super(ttype, ttext);
            useScopeDeref = deref;
        }
   
        public Atom getName() {
            return (Atom) ((BaseNode) getChild(NAME)).getToken();
        }
        
        @Override
        public SymbolEntry getSymbol() {
            return symbol;
        }
        
        public void setSymbol(SymbolEntry symbol) {
			this.symbol = symbol;
		}
      
        @Override
        protected boolean pass2Begin() {
        	// this used to be pass1Begin() but that creates a requirement that a 
        	// variable be declared before it is referenced.


        	ParseUnit currUnit = ParseUnit.current();
        	if (symbol == null)
        		symbol = currUnit.getSymbolTable().resolveSymbol(getName());
        	if (symbol == null) {
        		currUnit.reportError(getName(), "identifer is not declared in the current scope " + currUnit.getSymbolTable().curScope().getScopeName());

        	}
        	return super.pass2Begin();
        }
        
        @Override
        protected void pass2End() {
        	if (symbol != null) {
        		if (symbol.node() instanceof DeclNode.Var
        				&& ((DeclNode.Var)symbol.node()).isConst())
        			isConst = true;
        		if (symbol.node() instanceof DeclNode.Formal) {
        			DeclNode.Formal f = (DeclNode.Formal) symbol.node();
        			if (f.isTypeMetaArg() && f.getInit() == null) {
        				ParseUnit.current().reportError(f, f.getName().getText() + " meta parameter is uninitialized");  
        				return;
        			}       			
        		}
        		exprCat = symbol.node().getTypeCat();
        	}
        }
    }
    // ExprNode.Typ (used for init expressions for meta parameters)
    static public class Typ extends ExprNode {

        static final private int TYPE = 0;
        
        private SymbolEntry symbol = null;
        
        Typ(int ttype, String ttext) {
            super(ttype, ttext);
        }
   
        public TypeNode getTyp() {
            return  ((TypeNode) getChild(TYPE));
        }
        
        @Override
        public SymbolEntry getSymbol() {
            return symbol;
        }
        
        public void setSymbol(SymbolEntry symbol) {
			this.symbol = symbol;
		}
      
        @Override
        protected boolean pass2Begin() {

        	ParseUnit currUnit = ParseUnit.current();
        	Atom name = this.getTyp().getAtom();
        	if (symbol == null) {
        		TypeNode t = this.getTyp();
				name = (t instanceof TypeNode.Usr ? ((TypeNode.Usr) t)
						.getName()
						: t instanceof TypeNode.Std ? ((TypeNode.Std) t)
								.getIdent() : t.getAtom());
				
				if (Cat.fromScalarString(name.getText()) != null) // a primitive type
					return super.pass2Begin();
				
        		symbol = currUnit.getSymbolTable().resolveSymbol(name);
        	}
        	if (symbol == null) {
        		currUnit.reportError(name, "type is not declared in the current scope " + currUnit.getSymbolTable().curScope().getScopeName());

        	}
        	return super.pass2Begin();
        }
        
        @Override
        protected void pass2End() {
        	if (symbol != null && symbol.node() != null) {
        		exprCat = symbol.node().getTypeCat();
        	}
        }
    }
    // ExprNode.Self
    static public class Self extends ExprNode {

        static final private int MEMBER = 0;
        private SymbolEntry symbol = null;
        
        Self(int ttype, String ttext) {
            super(ttype, ttext);
        }
        
        public ExprNode getMember() {
        	return (ExprNode) getChild(MEMBER);
        }
        
        @Override
        protected boolean pass2Begin() {
        	// this used to be pass1Begin() but that creates a requirement that a 
        	// variable be declared before it is referenced.
        	
        	ParseUnit currUnit = ParseUnit.current();
        	// do the lookup of the deref'd member here, where the self context
        	// is known, in case there is a name collision between a local var name
        	// and a member name. 
        	if (getMember() != null && getMember() instanceof ExprNode.Ident) {
        		ExprNode.Ident ei = (ExprNode.Ident) getMember();
            	symbol = currUnit.getSymbolTable().resolveSymbol(ei.getName(), currUnit.getCurrUnitNode().getUnitType());
            	if (symbol == null) {
            		currUnit.reportError(ei.getName(), "identifer is not declared in the current scope");
            	}
            	else {
            		ei.setSymbol(symbol);
            	}
        	}
        	else {    
                symbol = currUnit.getSymbolTable().lookupName(ParseUnit.current().getUnitName());
        	}
       	
        	return super.pass2Begin();
        }
        
        @Override
        protected void pass2End() {
        	if (symbol != null && symbol.node() instanceof DeclNode.Var
        			&& ((DeclNode.Var)symbol.node()).isConst())
        		isConst = true;
        	exprCat = symbol.node().getTypeCat();
        }
    }

    
    // ExprNode.Index
    static public class Index extends ExprNode {

        static final private int BASE = 0;
        static final private int INDEX = 1;
        
        Index(int ttype, String ttext) {
            super(ttype, ttext);
        }
       
        public ExprNode getBase() {
            return (ExprNode)getChild(BASE);
        }
        
        public ExprNode getIndex() {
            return (ExprNode)getChild(INDEX);
        }
        
        @Override
        protected void pass1End() {
        	// TODO
        	// set scopeDeref to element type (if non primitive)
        }
        
        @Override
        protected void pass2End() {
            Cat basecat = getBase().getCat();
            if ((exprCat = TypeRules.preCheck(basecat)) != null) {
                return;
            }
            if (basecat instanceof Cat.Arr) {
                exprCat = ((Cat.Arr) basecat).getBase();
            }
            else if (basecat instanceof Cat.Scalar && ((Cat.Scalar) basecat).kind() == 's') {
                exprCat = Cat.fromScalarCode("u1");
            }
            else {
                exprCat = Cat.UNKNOWN;
                ParseUnit.current().reportError(getBase(), "value cannot be indexed");
            }
        }
    }
    
    // ExprNode.New
    static public class New extends ExprNode {

        static final private int ARGS = 1;
        static final private int TYPE = 0;
        
        New(int ttype, String ttext) {
            super(ttype, ttext);
        }
                
        public TypeNode getTypeSpec() {
        	if (this.getParent() instanceof DeclNode.Var){
        		return ((DeclNode.Var) this.getParent()).getTypeSpec();
        	}
            return ((TypeNode) getChild(TYPE));
        }
        @SuppressWarnings("unchecked")
        public List<ExprNode> getArgs() {
            return ((ListNode<ExprNode>) getChild(ARGS)).getElems();
        }

        @Override
        protected void pass2End() {
            exprCat = Cat.fromNew(getTypeSpec());
            if (exprCat instanceof Cat.Error) {
                ParseUnit.current().reportError(getTypeSpec(), ((Cat.Error) exprCat).getMsg());
                return;
            }
            isConst = false;
        }
    }
    
    // ExprNode.Paren
    static public class Paren extends ExprNode {

        static final private int BASE = 0;
        
        Paren(int ttype, String ttext) {
            super(ttype, ttext);
        }
        
        public ExprNode getBase() {
            return (ExprNode) getChild(BASE);
        }
        
        @Override
        protected void pass2End() {
            isConst = getBase().isConst;
            exprCat = getBase().getCat();
        }
    }
    
    // ExprNode.Size
    static public class Size extends ExprNode {

        static final private int TYPE = 0;
        static final private int FIELD = 1;
        
        private char op;

        Size(int ttype, String ttext, char op) {
            super(ttype, ttext);
            this.op = op;
        }
        
        public Atom getFieldName() {
            return getChildCount() > FIELD ? ((BaseNode) getChild(FIELD)).getAtom() : null;
        }
        
        public char getOp() {
            return op;
        }
        
        public TypeNode getTypeSpec() {
            return ((TypeNode) getChild(TYPE));
        }
        
        @Override
        protected void pass2End() {
            
        }
    }
        

    // ExprNode.Unary
    static public class Unary extends ExprNode {

        static final private int OPERATOR = 1;
        static final private int OPERAND = 0;

        private boolean isPostfix;
        
        Unary(int ttype, String ttext) {
            this(ttype, ttext, false);
        }
        
        Unary(int ttype, String ttext, boolean isPostfix) {
            super(ttype, ttext);
            this.isPostfix = isPostfix;
        }
        
        public Atom getOperator() {
            return ((BaseNode) getChild(OPERATOR)).getAtom();
        }

        public ExprNode getOperand() {
            return (ExprNode)getChild(OPERAND);
        }
        
        public boolean isPostfix() {
            return isPostfix;
        }
        
        @Override
        protected void pass2End() {
            String op = getOperator().getText();
            isConst = !op.equals("++") && !op.equals("--") && getOperand().isConst;
            Cat cat = getOperand().getCat();
            if ((exprCat = TypeRules.preCheck(cat)) != null) {
                return;
            }
            exprCat = TypeRules.checkUnary(op, cat);
            if (exprCat instanceof Cat.Error) {
                ParseUnit.current().reportError(getOperator(), ((Cat.Error) exprCat).getMsg());
            }
        }
    }
    
    // ExprNode.Vec
    static public class Vec extends ExprNode implements AggVal {
        
        static final private int VALS = 0;
        
        Vec(int ttype, String ttext) {
            super(ttype, ttext);
        }

        @SuppressWarnings("unchecked")
        public List<ExprNode> getVals() {
            return ((ListNode<ExprNode>) getChild(VALS)).getElems();
        }

        @Override
        protected void pass2End() {
            isConst = true;
            for (ExprNode val : getVals()) {
                if ((isConst &= val.isConst) == false) {
                    break;
                }
            }
            exprCat = Cat.VEC;
        }
        
        @Override
        void setCat(Cat cat) {
            exprCat = cat;
        }
    }
    
    // ExprNode
    
    static private final String LENGTH_CODE = "u2";
    
    protected Cat exprCat = Cat.UNKNOWN;
    protected boolean isConst = false;
    
    // scopeDeref set by Call, Ident, Index.
    static protected NestedScope scopeDeref = null;
    // Lookups use scopeDeref when true.
    protected boolean useScopeDeref = false;
    
    ExprNode(int ttype, String ttext) {
      	this.token = new Atom(ttype, ttext);
    }

    public final Cat getCat() {
        return exprCat;
    }
    
    public SymbolEntry getSymbol() {
        return null;
    }
    
    public final boolean isConst() {
        return isConst;
    }
    
    @Override
    protected boolean pass1Begin() {
        return true;
    }

    @Override
    protected boolean pass2Begin() {
        return true;
    }
    
    void setCat(Cat cat) {
    }
}
