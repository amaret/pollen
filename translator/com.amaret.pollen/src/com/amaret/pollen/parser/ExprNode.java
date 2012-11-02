package com.amaret.pollen.parser;

import java.util.EnumSet;
import java.util.List;

import org.antlr.runtime.CommonToken;

import com.amaret.pollen.parser.DeclNode.Usr;

public class ExprNode extends BaseNode {
	
    public interface AggVal {}
    public interface SubExprCat {
    	 public Cat getSubExprCat();   	 // handle subexpressions
    }
    
    // ExprNode.Binary
    static public class Binary extends ExprNode implements SubExprCat {

        static final private int LEFT = 1;
        static final private int OP = 0;
        static final private int RIGHT = 2;
        
        private boolean hasLeftIndexExpr = false;      
        private ExprNode.Index leftIndexExpr = null;
        private boolean isAssign;
        
        Binary(int ttype, String ttext) {
            this(ttype, ttext, false);
        }
        
        Binary(int ttype, String ttext, boolean isAssign) {
            super(ttype, ttext);
            this.isAssign = isAssign;
        }
        
        public boolean hasLeftIndexExpr() {
			return hasLeftIndexExpr;
		}
        public ExprNode.Index getLeftIndexExpr() {
        	return leftIndexExpr;
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
        /**
         * 
         * @return most refined Cat for the expr subtree
         * E.g. cat for count in 'arr[i].count'
         */

        private Cat getSubExprCat(boolean isRight) {
        	ExprNode e = isRight ? this.getRight() : this.getLeft();
        	if (e.getChildren().isEmpty())
        		return e.getCat();
        	for (int i = e.getChildren().size()-1; i > 0; i--) {
        		if (!(e.getChild(i) instanceof ExprNode))
        			continue;
        		e = (ExprNode) e.getChild(i);
        		if (e instanceof ExprNode.Ident)
        			return e.getCat(); 
        		if (e instanceof ExprNode.Index) {
        			if (!isRight) {
        				hasLeftIndexExpr = true;
        				if (leftIndexExpr == null)
        					leftIndexExpr = (Index) e; // first one
        			}
        			ExprNode base = ((ExprNode.Index)e).getBase();
        			if (base instanceof ExprNode.Ident) {
        				SymbolEntry s = ((ExprNode.Ident) base).getSymbol();
        				if (s != null && s.node() instanceof DeclNode.ITypeSpec) {
        					return Cat.fromType(((DeclNode.ITypeSpec)s.node()).getTypeSpec());
        				}
        			}
        		}
        	}
			return isRight ? this.getRight().getCat() 
					: this.getLeft().getCat();
      	
        }
        public Cat getSubExprCat() {
            Cat left = getSubExprCat(false); 
            Cat right = getSubExprCat(true);             
            return TypeRules.checkBinary(getOp().getText(), left, right);      	
        }
        
        @Override
        protected void pass2End() {
            isConst = !isAssign && getLeft().isConst() && getRight().isConst();
            if (isAssign && getOp().getText().equals("=") && getRight() instanceof ExprNode.AggVal) {
                exprCat = getLeft().getCat();
                TypeRules.checkInit(exprCat, getRight());
                return;
            }
            Cat left = getSubExprCat(false); 
            boolean dbg = false;
    		if (getLeft().getCat() instanceof Cat.Scalar && getRight().getCat() instanceof Cat.Arr)
				dbg = true;
            Cat right = getSubExprCat(true); 
            
            boolean providedTypeTest = this.getParent() instanceof StmtNode.Provided;
            boolean isUnit = getLeft().getCat() != null && getLeft().getCat().isUnit();
            isUnit |= getRight().getCat() != null && getRight().getCat().isUnit();
            providedTypeTest &= isUnit;

            if ((exprCat = TypeRules.preCheck(getLeft().getCat(), getRight().getCat())) != null) {
                return;
            }
            if (!providedTypeTest && getLeft().getCat() != null && getRight().getCat() != null) {
            	exprCat = TypeRules.checkBinary(getOp().getText(), left, right);
            	if (exprCat instanceof Cat.Error) {
            		ParseUnit.current().reportError(getOp(), ((Cat.Error) exprCat).getMsg());
            	}
            }
        }
    }
    
    // ExprNode.Call
    static public class Call extends ExprNode {

        static final private int NAME = 0;
        static final private int ARGS = 1;
        private SymbolEntry caller = null;   // in e.get() caller is for 'e'.
        private SymbolEntry called = null;   // in e.get() called is for 'get()'. 
        
        public SymbolEntry getCaller() {
			return caller;
		}
		public SymbolEntry getCalled() {
			return called;
		}
		public boolean isThisPtr() {
			return thisPtr;
		}

		private boolean thisPtr = false; // a class method call: add a this ptr as first parameter
        
        Call(int ttype, String ttext) {
            super(ttype, ttext);
        }
        Call(int ttype, String ttext, boolean dr) {
            super(ttype, ttext);
            deref = dr;
        }
       
        @SuppressWarnings("unchecked")
        public List<ExprNode> getArgs() {
            return ((ListNode<ExprNode>) getChild(ARGS)).getElems();
        }

        public ExprNode getName() {
            return (ExprNode) getChild(NAME);
        }
        @Override
        protected boolean pass1Begin() {
        	 
        	return super.pass1Begin();
        }
        protected boolean pass2Begin() {
        	
        	ParseUnit currUnit = ParseUnit.current();
        	
        	SymbolTable symtab = currUnit.getSymbolTable();
        	
        	// look up the call identifier here rather than in Expr.Ident because here we know
        	// to check host scope. 
        	boolean chkHostScope = symtab.currScopeIsHost();

        	if (getName() != null && getName() instanceof ExprNode.Ident) {
        		ExprNode.Ident ei = (ExprNode.Ident) getName();
        		
        		String dbgs = ei.getName().getText();
        		boolean dbg = false;
        		if (dbgs.equals("Arduino.cycle"))
        			dbg = true;
        		if (dbgs.equals("disable"))
        			dbg = true;

            	if (called == null 
            			&& this.getParent() instanceof ExprNode.Ident 
            			&& ((ExprNode.Ident) this.getParent()).getSymbol() != null) {
            		// this is an access after a dereference: 'arr[i].fcn()'.
            		// lookup scope for 'fcn()' is the type for arr. 
            		
            		
            		IScope sc = ((ExprNode.Ident) this.getParent()).getSymbol().derefScope(false);
            		called = sc.lookupName(ei.getName().getText());       
            		if (called != null && called.node() instanceof DeclNode) {
            			DeclNode d = (DeclNode) called.node();
            			boolean accessible = d.query(EnumSet.of(Flags.PUBLIC));
            			accessible |= (d.getUnit() == currUnit.getCurrUnitNode());
            			called = (accessible) ? called : null;
            		}
            	}
            	
            	if (called == null) {
            		called = symtab.curScope().lookupName(ei.getName().getText(), chkHostScope);
            	}
            	if (caller == null) {
            		if (ei.getName().getText().indexOf('.') != -1) {
            			String n = ei.getName().getText();
            			n = n.substring(0, n.lastIndexOf('.'));
            			caller = symtab.curScope().lookupName(n,chkHostScope);
            			if (caller == null && chkHostScope) 
            				caller = symtab.curScope().lookupName(n,false);

            			ei.setQualifier(caller);          
            			if (caller != null && caller.node() instanceof ImportNode) {
            				// The caller will get output by translator code.
            				n = ei.getName().getText().substring(ei.getName().getText().lastIndexOf('.')+1);
            				ei.getName().setText(n); 
            			}
            		}
            		else {
            			IScope sc = currUnit.getSymbolTable().curScope();
            			while (!(sc instanceof DeclNode.Usr)) {
            				sc = sc.getEnclosingScope();
            				if ( sc instanceof DeclNode.Usr && ((DeclNode.Usr) sc).isClass()) {
            					// if calling a method in current class, 'this' is the caller
            					caller = symtab.curScope().lookupName("this",false);
            					ei.setQualifier(caller);  
            				}
            			}           		
            		}
            	}
            	if (called == null) { 
            		// Could be a host function accessed through a non-host caller:
            		// look up in the host table of the deref scope of the caller.
            		if (chkHostScope && caller != null) {
                		String n = ei.getName().getText();
                		if (n.indexOf('.') != -1) {
                			n = n.substring(n.lastIndexOf('.')+1);
                			called = caller.derefScope(true).lookupName(n, chkHostScope);
                			// if the caller is non-host, replace the caller name with the unit name
                    		if (caller != null && called != null && caller.node() instanceof DeclNode.Var) {
                    			if (((DeclNode.Var) caller.node()).isStaticInstance()
                    					&& called.scope() instanceof DeclNode.Usr) {
                    				n = ei.getName().getText().substring(ei.getName().getText().lastIndexOf('.')+1);
                    				ei.getName().setText(n); 
                    			}
                    			
                    		}
                		}            			
            		}
            	}
        		if (called == null)
        			currUnit.reportError(ei.getName(), "identifier is not declared in the current scope "
        				+  symtab.curScope().getScopeName());

            	else {
            		ei.setSymbol(called);
            		IScope sc = called.scope();
            		boolean isHostFcn = (called.node() instanceof DeclNode.Fcn && ((DeclNode.Fcn)called.node()).isHost());
            		if (!isHostFcn 
            				&& sc instanceof DeclNode.Usr && ((DeclNode.Usr) sc).isClass()
            				&& !((DeclNode.Usr) sc).isHost()
            				&& !(called.node() instanceof DeclNode.FcnRef)) {
            				// for function references, the scope of the function ref is not the scope of the called fcn
            			thisPtr = true;     
            		}
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
           
            if (!(cat instanceof Cat.Fcn)) {               
            	String n = (getName() instanceof ExprNode.Ident) ? "\'" + ((ExprNode.Ident) getName()).getName().getText() + "\' ": "";
            	ParseUnit.current().reportError(getName(), n + "not a function");
            	return;                
            }
            	
            Cat.Fcn fcncat = (Cat.Fcn) cat;
            int argc = getArgs().size();
            if (thisPtr) argc++; // add one for this ptr (already added in the parser)
            int minArgc = fcncat.minArgc();
            int maxArgc = fcncat.maxArgc();
           
            if (thisPtr && fcncat.fcnD() != null && ((DeclNode.Usr) fcncat.fcnD().getEnclosingScope()).isProtocol()) {
            	minArgc++;
            	maxArgc++;  // a class is implementing a protocol: account for 'this' parameter.
            }
            if (argc < minArgc || argc > maxArgc) {
                currUnit.reportError(getName(), "wrong number of arguments");
                return;
            }
     
            exprCat = fcncat.retCat();
            
            // for now, skip check for calling through function references
            // TODO figure out how to pass 'this' ptr for function ref class method calls
            if (!(called != null && called.node() instanceof DeclNode.TypedMember)) {
                
            	int k = (isThisPtr()) ? 0 : -1; // skip 'this'
            	
            	for (ExprNode e : getArgs()) {
            		k += 1;
            		Cat ecat = e instanceof ExprNode.SubExprCat ? ((ExprNode.SubExprCat)e).getSubExprCat() : e.getCat();
            		Cat acat = fcncat.argCats().get(k);
            		if (isThisPtr())
            			continue; // the first parameter is 'this' (skip)
            		if (acat.isAggTyp()) {
            			if (((Cat.Agg)acat).isComposition()) {
            				// TODO do I need to resolve to the module, for an export?
            			}
            			if (((Cat.Agg) acat).isProtocol()) {
            				ParseUnit.current().reportError(this, "actual parameter type error for \'" + ((Cat.Agg) acat).aggName() + "\' (protocol not allowed)");
            				continue;
            			}

            		}

            		if (e instanceof ExprNode.AggVal) {
            			TypeRules.checkInit(acat, e);
            			continue;
            		}
            		if (TypeRules.preCheck(ecat) != null) {
            			continue;
            		}
            		Cat res = TypeRules.checkBinary("=", acat, ecat, "formal / actual parameter type conflict");
            		if (res instanceof Cat.Error) {
            			ParseUnit.current().reportError(this.getName(), ((Cat.Error) res).getMsg());
            		}
            	}
            }
    		
    		
    		ExprNode.Ident ei = (ExprNode.Ident) getName();
    		if (thisPtr) {
    			String n = ei.getName().getText();
    			if (n.indexOf(".") != -1) {
    				n = n.substring(n.lastIndexOf('.')+1);
    				n = called != null ? called.scope().getScopeName() + "_" + n : n;
    				ei.getName().setText(n); // For method in class Event, change call from e.get() to Event.get(e)
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
    static public class Ident extends ExprNode implements SubExprCat {

        static final private int NAME = 0;
        
        private SymbolEntry symbol = null;		// for obj.field symbol is for 'field'
        private SymbolEntry qualifier = null;  	// for obj.field qualifier is 'obj'

		private boolean thisPtr = false;		// add 'this' to accesses
        
        public boolean isThisPtr() {
			return thisPtr;
		}

		public SymbolEntry getQualifier() {
			return qualifier;
		}

		public void setQualifier(SymbolEntry qualifier) {
			this.qualifier = qualifier;
		}

		Ident(int ttype, String ttext) {
            super(ttype, ttext);
        }
        
        Ident(int ttype, String ttext, boolean dr) {
            super(ttype, ttext);
            deref = dr;
        }
   
        public Atom getName() {
            return (Atom) ((BaseNode) getChild(NAME)).getToken();
        }
        /**
         * 
         * @return most refined Cat for the expr subtree
         * E.g. cat for count in 'arr[i].count'
         */

        public Cat getSubExprCat() {
        	ExprNode e;
        	if (this.getChildren().isEmpty())
        		return this.getCat();
        	for (int i = this.getChildren().size()-1; i > 1; i--) {
        		if (!(this.getChild(i) instanceof ExprNode))
        			continue;
        		e = (ExprNode) this.getChild(i);
        		if (e instanceof ExprNode.Ident)
        			return e.getCat();       		
        	}
			return this.getCat();     	
        }
        
        
        @Override
        public SymbolEntry getSymbol() {
            return symbol;
        }
        
        public void setSymbol(SymbolEntry symbol) {
			this.symbol = symbol;

		}
        public Cat getCat() {
			if (exprCat == Cat.UNKNOWN && symbol != null ) 
				exprCat = Cat.fromSymbolNode(symbol.node(), symbol.scope());
			return exprCat;       	
        }
      
        @Override
        protected boolean pass2Begin() {
        	// this used to be pass1Begin() but that creates a requirement that a 
        	// variable be declared before it is referenced.


        	ParseUnit currUnit = ParseUnit.current();
        	if (this.getParent() instanceof ExprNode.Ident 
        			&& ((ExprNode.Ident) this.getParent()).getSymbol() != null) {
        		
        		// This is an access after an indexed expr or call, such as 'arr[i].fld'.
        		// lookup scope for 'fld' is the type for arr. 
        		        		
        		IScope sc = ((ExprNode.Ident) this.getParent()).getSymbol().derefScope(false);
        		symbol = sc.lookupName(getName().getText());       
        		if (symbol != null && symbol.node() instanceof DeclNode) {
        			DeclNode d = (DeclNode) symbol.node();
        			boolean accessible = d.query(EnumSet.of(Flags.PUBLIC));
        			accessible |= (d.getUnit() == currUnit.getCurrUnitNode());
        			symbol = (accessible) ? symbol : null;
        		}
        	}
        	if (symbol == null)
        		symbol = currUnit.getSymbolTable().resolveSymbol(getName());
        	if (symbol == null) {
        		currUnit.reportError(getName(), "identifier is not declared in the current scope " + currUnit.getSymbolTable().curScope().getScopeName());

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
        		if (symbol.node() instanceof DeclNode.Var && symbol.scope() instanceof DeclNode.Class) {
        			IScope sc = ParseUnit.current().getSymbolTable().curScope();
        			if (sc instanceof StmtNode.Block || sc instanceof BodyNode) {
        				do
        					sc = sc.getEnclosingScope();
        				while  (!(sc instanceof DeclNode.Fcn));
        			}
        			if (sc.getEnclosingScope() == symbol.scope() 
        					&& !((DeclNode.Fcn)sc).isConstructor() 
        					&& !((DeclNode.Fcn)sc).isHost())
//        					&& (!(this.getParent() instanceof ExprNode.Ident // e.g. idx in arr
//        							|| this.getParent() instanceof ExprNode.Call)))
        				thisPtr  = true; // a class var accessed within a  method belonging to its class
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
        	
//        	if (currUnit.getCurrUnitNode().isHostScope()) {     		
//        		currUnit.reportError(this, "use of \'@\' is prohibited in a host scope");
//        		//return true;
//        	}
        	if (!currUnit.getCurrUnitNode().getUnitType().isClass()) {
        		currUnit.reportError(this, "\'@\' can only be used in \'class\' methods");   		
        	}

        	// do the lookup of the deref'd member here, where the self context
        	// is known, in case there is a name collision between a local var name
        	// and a member name. 
        	if (getMember() != null && getMember() instanceof ExprNode.Ident) {
        		ExprNode.Ident ei = (ExprNode.Ident) getMember();
            	symbol = currUnit.getSymbolTable().resolveSymbol(ei.getName(), currUnit.getSymbolTable().curScope());
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


    
    // ExprNode.Index
    static public class Index extends ExprNode {

        static final private int INDEX = 0;
        
        Index(int ttype, String ttext) {
            super(ttype, ttext);
        }
       
        public ExprNode getBase() {
        	return (ExprNode) this.getParent();
        	
//        	if (this.getParent() != null && this.getParent().getChildCount() > 1) {
//        		BaseNode b = (BaseNode) this.getParent().getChild(0);
//        		if (!(b instanceof ExprNode)) {
//        			ParseUnit.current().reportError(b, "invalid array base");
//        			return null;
//        		}
//        		return (ExprNode) b;       		
//        	}
//            return null;
        }
        /**
         * 
         * @return first index
         * TODO delete and replace with getIndexes() after multi-dim is implemented
         */
        @SuppressWarnings("unchecked")
		public ExprNode getFirstIndex() {
        	ListNode<ExprNode> child = (ListNode<ExprNode>) getChild(INDEX);
         	return (!child.getElems().isEmpty()) ? child.getElems().get(0) : null;  
        }      

        @SuppressWarnings("unchecked")
        public List<ExprNode> getIndexes() {
            return ((ListNode<ExprNode>) getChild(INDEX)).getElems();
        }
        
        @Override
        protected void pass1End() {
        }
        
        @Override
        protected boolean pass2Begin() {
            Cat basecat = getBase().getCat();
            boolean dbg = false;
            if (basecat == null)
            	dbg = true;
            exprCat = TypeRules.preCheck(basecat);
            //cat1 == Cat.INJECT || cat1 == Cat.UNKNOWN || cat1 instanceof Cat.Error
            if (exprCat != null && (exprCat == Cat.INJECT || exprCat instanceof Cat.Error)) {
                return true;
            }
            if (basecat instanceof Cat.Arr) {
                exprCat = ((Cat.Arr) basecat).getBase();
            }
            else if (basecat instanceof Cat.Scalar && ((Cat.Scalar) basecat).kind() == 's') {
                exprCat = Cat.fromScalarCode("u1");
            }
            if (exprCat == Cat.UNKNOWN) {
                ParseUnit.current().reportError(getBase(), "value cannot be indexed");
            }
            return true;
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
    
    // ExprNode.Unary
    static public class Unary extends ExprNode implements SubExprCat {


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
        /**
         * 
         * @return most refined Cat for the expr subtree
         * E.g. cat for count in 'arr[i].count'
         */

        public Cat getSubExprCat() {
        	ExprNode e = this.getOperand();
        	if (e.getChildren().isEmpty())
        		return e.getCat();
        	for (int i = e.getChildren().size()-1; i > 1; i--) {
        		if (!( e.getChild(i) instanceof ExprNode))
        			continue;
        		e = (ExprNode) e.getChild(i);
        		if (e instanceof ExprNode.Ident)
        			return e.getCat();       		
        	}
			return getOperand().getCat();     	
        }
        
        @Override
        protected void pass2End() {
            String op = getOperator().getText();
            isConst = !op.equals("++") && !op.equals("--") && getOperand().isConst;
            Cat catSubtree = getSubExprCat();
            Cat cat = getOperand().getCat();
            if ((exprCat = TypeRules.preCheck(cat)) != null) {
                return;
            }
            exprCat = TypeRules.checkUnary(op, catSubtree);
            if (exprCat instanceof Cat.Error) {
                ParseUnit.current().reportError(getOperator(), ((Cat.Error) exprCat).getMsg());
            }
        }
    }
    
    // ExprNode.Vec
    static public class Vec extends ExprNode implements AggVal {
        
        static final private int VALS = 0;
        SymbolEntry symbol = null;
        
        Vec(int ttype, String ttext) {
            super(ttype, ttext);
        }

        public SymbolEntry getSymbol() {
			return symbol;
		}

		public void setSymbol(SymbolEntry symbol) {
			this.symbol = symbol;
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
    
    // True when this expr or ident is to the right of a '.'
    protected boolean deref = false;
    
    ExprNode(int ttype, String ttext) {
      	this.token = new Atom(ttype, ttext);
    }

    public Cat getCat() {
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
