package com.amaret.pollen.parser;

import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.antlr.runtime.tree.Tree;

import com.amaret.pollen.driver.ProcessUnits;
import com.amaret.pollen.parser.Cat.Fcn;
import com.amaret.pollen.parser.DeclNode.ITypeSpecInit;
import com.amaret.pollen.parser.DeclNode.TypedMember;
import com.amaret.pollen.parser.DeclNode.Var;
import com.amaret.pollen.parser.ExprNode.Ident;

public class StmtNode extends BaseNode {

     
    // StmtNode.Assign
    static public class Assign extends StmtNode {

        static final private int EXPR = 0;
        
        Assign(int ttype, String ttext) {
            super(ttype, ttext);
        }
        
        public ExprNode getExpr() {
            return (ExprNode) getChild(EXPR);
        }

        public void pass2End() {
        	UnitNode u = ParseUnit.current().getCurrUnitNode();
        	ExprNode.Binary b = this.getExpr() instanceof ExprNode.Binary ? ((ExprNode.Binary) this
        			.getExpr())
        			: null;
        	ExprNode.Ident preset = (Ident) (b != null
        			&& b.getLeft() instanceof ExprNode.Ident ? b.getLeft()
        					: null);
        	if (preset != null) {       			        			
        		boolean f = ParseUnit.current().initPreset(preset.getSymbol());
        		if (f) {
        			ParseUnit.current().putPresetExpr(preset.getSymbol(), b.getRight());
        			if (preset.getSymbol().node() instanceof DeclNode.Var) {
        				DeclNode.Var v = (Var) preset.getSymbol().node();
        				ExprNode e = b.getRight();
        				if (!(e instanceof ExprNode.Const) && preset.getSymbol().scope() instanceof DeclNode.Class) {
        					ParseUnit.current().reportError(v.getName(), "in a \'preset\' initializer a class variable can be initialized only to a constant");
        				}
        			}

        		}

        	}
        }

    }
    // StmtNode.Inject
    static public class Inject extends StmtNode {

        static final private int EXPR = 0;
        
        Inject(int ttype, String ttext) {
            super(ttype, ttext);
        }
        
        public ExprNode.Inject getExpr() {
            return (ExprNode.Inject) getChild(EXPR);
        }
    }
    // StmtNode.Expr
    // a Stmt wrapper for expr
    static public class Expr extends StmtNode {

        static final private int EXPR = 0;
        
        Expr(int ttype, String ttext) {
            super(ttype, ttext);
        }
        
        public ExprNode getExpr() {
            return (ExprNode) getChild(EXPR);
        }
    }

    
    // StmtNode.Block
    static public class Block extends StmtNode implements IScope {

        static final private int STMTS = 0;
        
        NestedScope scopeDeleg = new NestedScope(this);
        
        Block(int ttype, String ttext) {
            super(ttype, ttext);
        }
        
        @Override
        public boolean defineSymbol(Atom name, ISymbolNode symbol) {
            return scopeDeleg.defineSymbol(name, symbol);
        }

        @Override
        public IScope getEnclosingScope() {
            return scopeDeleg.getEnclosingScope();
        }
        
        @Override 
        public String getScopeName() {
        	
        	IScope enc = this.getEnclosingScope();
        	if (enc instanceof StmtNode.Block)
        		do {
        			enc = enc.getEnclosingScope();
        		} while (enc instanceof StmtNode.Block);
        	return enc.getScopeName();       	
        }

        @Override
        public Set<Map.Entry<String,SymbolEntry>> getEntrySet() {
            return scopeDeleg.getEntrySet();
        }

        @SuppressWarnings("unchecked")
        public List<StmtNode> getStmts() {
            return ((ListNode<StmtNode>) getChild(STMTS)).getElems();
        }

        @Override
        protected boolean pass1Begin() {
            ParseUnit.current().getSymbolTable().enterScope(this);
            return super.pass1Begin();
        }
        
        @Override
        protected void pass1End() {
            ParseUnit.current().getSymbolTable().leaveScope();
        }
        @Override
        protected boolean pass2Begin() {
            ParseUnit.current().getSymbolTable().enterScope(this);
            return super.pass1Begin();
        }
        
        @Override
        protected void pass2End() {
            ParseUnit.current().getSymbolTable().leaveScope();
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
    
    // StmtNode.Case
    static public class Case extends StmtNode {

        static final private int VAL = 1;
        static final private int BODY = 0;
        
        Case(int ttype, String ttext) {
            super(ttype, ttext);
        }

        @SuppressWarnings("unchecked")
        public List<StmtNode> getBody() {
            return ((ListNode<StmtNode>) getChild(BODY)).getElems();
        }
        /**
         * 
         * @return the Case expr. Returns null for the default case.
         */
        public ExprNode getCase() {
            return getChildCount() > VAL ? (ExprNode) getChild(VAL) : null;
        }
    }
       
    // StmtNode.Break
    static public class Break extends StmtNode {

        
        Break(int ttype, String ttext) {
            super(ttype, ttext);
        }
        
    }
    // StmtNode.Continue
    static public class Continue extends StmtNode {

        
    	Continue(int ttype, String ttext) {
            super(ttype, ttext);
        }
        
    }
    // StmtNode.Decl
    static public class Decl extends StmtNode {

        
        Decl(int ttype, String ttext) {
            super(ttype, ttext);
        }
        /**
         * 
         * I should be creating a ListNode in the grammar but that
         * runs into conflicts with how DeclNode.Var is treated 
         * in the unit features list. This code called is for locals.
         * Do not add/delete from the list.
         * @return the children list consisting of DeclNode.Var.
         */
        @SuppressWarnings("unchecked")
        public List<DeclNode.Var> getVars() {
            return ((List<DeclNode.Var>) this.children);
        }
        /**
         * StmtNode.Decl is only created in the grammar for function local variables. 
         * Module body scope declarations get DeclNodes. 
         */

        @Override
        protected void pass2End() {
            BodyNode body = BodyNode.current();

            for (DeclNode.Var decl : getVars()) {
            	            	
                ExprNode init = decl.getInit();
                if (init != null) {
                    init.setCat(decl.getTypeCat());
                }                
                body.addLocalVar(decl );
                setUsesForLocals();
            }
        }
        protected boolean passNBegin() {
       		setUsesForLocals();
            return true;
        }
		/**
		 * Mark unitUsed for the unit type of a local. 
		 * These checks are memory access uses and can occur in pass2 or passN.
		 */
		private void setUsesForLocals() {
			UnitNode u = (UnitNode) this.getParentOfType(UnitNode.class);
        	for (DeclNode.Var decl : getVars()) {
         		if (decl.isPeggedOnDcln() && u.isUnitUsed()) {
        			if (decl instanceof DeclNode.TypedMember)
        				((DeclNode.TypedMember)decl).setUnitsUsedForPeg();
        		}
    			if (decl.isBoundOnDcln() && u.isUnitUsed()) {
    				((DeclNode.TypedMember)decl).setUnitsUsedForBind(u);
    			}

        		if (!(decl instanceof ITypeSpecInit)) {
        			continue;
        		}
        		// Check the initial value expression and mark its unit used if appropriate.
        		ITypeSpecInit tsi = (ITypeSpecInit) decl;
        		ExprNode init = tsi.getInit();
        		if (u.isUnitUsed() && init instanceof ExprNode.Ident && init.getSymbol() != null
        				&& init.getSymbol().node() instanceof DeclNode)
        			((DeclNode) init.getSymbol().node()).setUnitUsedForExpr(this);
        	}
		}
    }

    
    // StmtNode.Elif
    static public class Elif extends StmtNode {

        static final private int BODY = 1;
        static final private int COND = 0;
        
        Elif(int ttype, String ttext) {
            super(ttype, ttext);
        }
        
        public StmtNode getBody() {
            return (StmtNode) getChild(BODY);
        }

        public ExprNode getCond() {
            return (ExprNode) getChild(COND);
        }

        @Override
        protected void pass2End() {
            checkCond(getCond());
        }
    }
    
    // StmtNode.Empty
    static public class Empty extends StmtNode {
        Empty(int ttype, String ttext) {
            super(ttype, ttext);
        }
    }
    
    // StmtNode.For
    static public class For extends StmtNode {

        static final private int BODY = 3;
        static final private int COND = 1;
        static final private int INIT = 0;
        static final private int NEXT = 2;
        static final private int DEFAULT_VAR = 4; // subtree for default loop variable if none is declared
        
        For(int ttype, String ttext) {
            super(ttype, ttext);
        }
        
        public StmtNode getBody() {
            return (StmtNode) getChild(BODY);
        }

        public StmtNode getInit() {
            Tree node = getChild(INIT);
            if (node instanceof StmtNode) {
                return (StmtNode) node;
            }
            else {
                return null;
            }
        }
        
        public ExprNode getCond() {
            return getChild(COND).getType() != pollenLexer.NIL ? (ExprNode) getChild(COND) : null;
        }
        
        public ExprNode getNext() {
            return getChild(NEXT).getType() != pollenLexer.NIL ? (ExprNode) getChild(NEXT) : null;
        }
        
        public StmtNode.Decl getDefaultLoopVar() {
        	if (getChildCount() <= DEFAULT_VAR) return null;
            return  (getChild(DEFAULT_VAR).getType() != pollenLexer.NIL ? (StmtNode.Decl) getChild(DEFAULT_VAR) : null);
        }
        
        @Override
        protected boolean pass2Begin() {
			if (getInit() instanceof StmtNode.Assign) {
				StmtNode.Assign asgn = (Assign) getInit();
				ExprNode.Binary b = asgn.getExpr() instanceof ExprNode.Binary ? ((ExprNode.Binary) asgn
						.getExpr())
						: null;
				ExprNode.Ident loopVar = (Ident) (b != null
						&& b.getLeft() instanceof ExprNode.Ident ? b.getLeft()
						: null);

				if (loopVar != null) {
					Atom a = loopVar.getName();
					SymbolEntry symbol = ParseUnit.current().getSymbolTable()
					.resolveSymbol(a, true);
					if (symbol == null) {
						// no for loop variable was defined 
						// so enter a default into the symbol table.
						DeclNode.Var v = getDefaultLoopVar().getVars().get(0);
						v.getName().setText(a.getText());
						ParseUnit.current().getSymbolTable().defineSymbol(a, v);						
					}
				}
			}

            return true;
        }

        @Override
		protected void pass2End() {
        	
			this.deleteChild(DEFAULT_VAR); // parser built the nodes, we delete them
			
			ExprNode cond = getCond();
			if (cond != null) {
				checkCond(cond);
			}
		}
    }
        
    // StmtNode.If
    static public class If extends StmtNode {

        static final private int COND = 0;
        static final private int ELIF = 2;
        static final private int ELSE = 3;
        static final private int IF = 1;
        
        If(int ttype, String ttext) {
            super(ttype, ttext);
        }
        
        public ExprNode getCond() {
            return (ExprNode) getChild(COND);
        }

        @SuppressWarnings("unchecked")
        public List<StmtNode.Elif> getElifs() {
            return ((ListNode<StmtNode.Elif>) getChild(ELIF)).getElems();
        }
        
        public StmtNode getElseBody() {
            return getChildCount() > ELSE ? (StmtNode) getChild(ELSE) : null;
        }

        public StmtNode getIfBody() {
            return (StmtNode) getChild(IF);
        }

        @Override
        protected void pass2End() {
            checkCond(getCond());
        }
    }
    // StmtNode.Provided
    static public class Provided extends StmtNode {

        static final private int COND = 0;
        static final private int ELSE = 2;
        static final private int IF = 1;
        
        Provided(int ttype, String ttext) {
            super(ttype, ttext);
        }
        
        public ExprNode getCond() {
            return (ExprNode) getChild(COND);
        }
        
        public StmtNode getElseBody() {
            return getChildCount() > ELSE ? (StmtNode) getChild(ELSE) : null;
        }

        public StmtNode getIfBody() {
            return (StmtNode) getChild(IF);
        }

        @Override
        protected void pass2End() {
            checkCond(getCond());
        }
    }
   
    // StmtNode.Print
    static public class Print extends StmtNode {

        static final private int ARGS = 0;
        EnumSet<Flags> flags = EnumSet.noneOf(Flags.class);
        
        Print(int ttype, String ttext,  EnumSet<Flags>  f) {
            super(ttype, ttext);
            flags.addAll(f);
        }
        public boolean toStdout() {
        	if (flags.contains(Flags.OUT))
        		return true;
        	return false;
        }
        public boolean toStderr() {
        	if (flags.contains(Flags.ERR))
        		return true;
        	return false;
        }
        public boolean toLog() {
        	if (flags.contains(Flags.LOG))
        		return true;
        	return false;
        }
        
        @SuppressWarnings("unchecked")
        public List<ExprNode> getArgs() {
            return ((ListNode<ExprNode>) getChild(ARGS)).getElems();
        }
//        @SuppressWarnings("unchecked")
//        protected boolean pass1Begin() {
//            return ((ListNode<ExprNode>) getChild(ARGS)).doPass1Begin();
//        }
//        
//        @SuppressWarnings("unchecked")
//        protected boolean pass2Begin() {
//        	 return ((ListNode<ExprNode>) getChild(ARGS)).doPass2Begin();
//        }
        
        @Override
        protected void pass2End() {
        	if (ProcessUnits.getPollenPrint().isEmpty() && !ParseUnit.current().getCurrUnitNode().isHostScope())
        		ParseUnit.current().reportWarning(this, "a print statement with no '-p' option on the command line will be a no-op (in target contexts)");
        	if (toLog()) {
        		ParseUnit.current().reportWarning(this, "\'print log\' is an unimplemented feature (print will go to stdout)");
        	}
        	if (toStderr())	{
        		ParseUnit.current().reportWarning(this, "\'print err\' is an unimplemented feature (print will go to stdout)");
        	}

        }
    }
    
    // StmtNode.Return
    static public class Return extends StmtNode {

        // returns a vector of values or nothing
    	static final private int VEC = 0;

        Return(int ttype, String ttext) {
            super(ttype, ttext);
        }
        
        public ExprNode.Vec getVec() {
            return getChildCount() > VEC ? (ExprNode.Vec) getChild(VEC) : null;
        }
        
        @Override
        protected void pass2End() {

        	List<TypeNode> l = BodyNode.current().getFcn().getReturnList();
        	
        	if (getVec() != null && BodyNode.current().getFcn().isVoid()) {
        		ParseUnit.current().reportError(this, "Void functions cannot return values");
        	}
        	
        	if (getVec() == null && !BodyNode.current().getFcn().isVoid()) {
        		System.out.println(this.toStringTree());
        		System.out.println(BodyNode.current().getFcn().toStringTree());
        		System.out.println(BodyNode.current().toStringTree());
       		
        		ParseUnit.current().reportError(this, "Missing return value");
        	}
           
			ExprNode.Vec v = getVec();
			if (v == null) 
				return;
			for (ExprNode expr : v.getVals()) {
				for (TypeNode t : l) {
					Cat retcat = Cat.fromType(t);
		        	Cat valcat = (expr.getPostExprCallCount() > 0) ? 
		        			(expr.getUltimateCat())
		        			: (expr instanceof ExprNode.SubExprCat) ? ((ExprNode.SubExprCat) expr)
		        					.getSubExprCat()
		        					: expr.getCat();
					
					if (valcat instanceof Cat.Fcn)
						valcat = ((Cat.Fcn)valcat).retCat();
					
					if (TypeRules.preCheck(valcat) == null) {
						
						Cat rescat = TypeRules.checkBinary("=", retcat, valcat,
								"return type error (unmatched or invalid return types)");
						if (rescat instanceof Cat.Error) {
							ParseUnit.current().reportError(expr,
									((Cat.Error) rescat).getMsg());
						}
					}
				}

			}
        }
    }
    // StmtNode.Peg   To peg class references to byte arrays
    static public class Peg extends StmtNode {

        static final private int REF = 0;
        static final private int PEG = 1;
        static final private int ARR = 2;
        private TypeNode refType = null;
        
        Peg(int ttype, String ttext) {
            super(ttype, ttext);
        }
        public ExprNode getRef() {
            return (ExprNode) getChild(REF);
        }
        public TypeNode getRefType() {
        	if (!(getChild(REF) instanceof ExprNode.Ident))
        		return null;
        	if (refType != null)
        		return refType;
        	
        	Cat c = ((Ident) getChild(REF)).getCat();
        	if (c instanceof Cat.Arr ) {
        		refType = ((Cat.Arr)c).getType();
        	}
        	else if (c instanceof Cat.Agg) {
        		IScope sc = ((Cat.Agg)c).aggScope();
        		if (sc instanceof ITypeSpecInit)
        			refType = ((ITypeSpecInit)sc).getTypeSpec();       
        	}
        	if (refType == null)
        		ParseUnit.current().reportError(this, "target of the pegging operator assignment has invalid type");
			return refType;        	
        }
        public boolean isPegArray() {
        	return (getRefType() instanceof TypeNode.Arr);
        }
        public boolean isPegReference() {
        	return (getRefType() instanceof TypeNode.Usr);
        }

        public ExprNode getArr() {
            return getChildCount() > ARR ? (ExprNode) getChild(ARR) : null;
        }
        protected void pass2End() {
        	SymbolEntry sym = getRef().getSymbol();
        	ISymbolNode snode = sym != null ? sym.node() : null;
        	if (snode instanceof DeclNode.TypedMember)
        		((DeclNode.TypedMember)snode).setUnitsUsedForPeg();
			Cat c = this.getArr() == null ? null
					: (this.getArr().getCat() instanceof Cat.Fcn ? ((Fcn) this.getArr().getCat()).retCat() : this
							.getArr().getCat());
        	TypeRules.checkPeg((BaseNode) snode, c, this);
        }
    }
    // StmtNode.Bind
    static public class Bind extends StmtNode {

        static final private int PRO = 0;
        static final private int VAL = 1;
        
        private UnitNode bindToUnit = null; 			// the module to which the protocol member is bound


        Bind(int ttype, String ttext) {
            super(ttype, ttext);
        }
        
        public ExprNode getPro() {
            return (ExprNode) getChild(PRO);
        }

        public TypeNode getValue() {
            return getChildCount() > VAL ? (TypeNode) getChild(VAL) : null;
        }
        
        @Override
        protected void pass2End() { 
        	Cat src_cat = TypeRules.checkBind(getPro().getCat(), getValue());
        	SymbolEntry sym = getPro().getSymbol();
        	ISymbolNode snode = sym != null ? sym.node() : null;
        	ParseUnit.current().initPreset(sym);
        	boolean isPreset = ParseUnit.current().isPreset(sym);
        	if (isPreset) {
        		ExprNode e = ParseUnit.current().putPresetExpr(sym, getPro());
        		if (e != null)
        			ParseUnit.current().reportWarning(this, "more than one binding for protocol member encountered. Order of binding is indeterminate.");
        	}
        	boolean isBoundInsidePresetInitializer = ParseUnit.current().getSymbolTable().insidePresetInitializer();
        	boolean accessOK = isPreset && !isBoundInsidePresetInitializer
        		? false : true;
        	if (!accessOK) {
        		ParseUnit.current().reportError(this, "invalid binding of protocol member. A protocol member bound in a \'preset\' initializer cannot be bound outside of a \'preset\' initializer.");
        	}

        	if (accessOK && getValue() != null && getPro() != null && src_cat != null) { 

        		BaseNode d = (BaseNode) ((Cat.Agg) src_cat).aggScope();
        		UnitNode bindtoUnit = (UnitNode) ((d instanceof UnitNode) ? d : d instanceof DeclNode.Usr ? ((DeclNode.Usr)d).getUnit() : null);      			
        		((DeclNode.TypedMember)snode).bindModule(bindtoUnit, getValue()); // bind it
        		bindToUnit = ((DeclNode.TypedMember)snode).getBindToUnit();  

        		UnitNode currUnit = ((UnitNode) this.getParentOfType(UnitNode.class));
        		//if (currUnit.isUnitUsed())
        			setUnitsUsed((TypedMember) snode, currUnit);
        	}

        }
        public void pass3Begin() {
        	SymbolEntry sym = getPro().getSymbol();
        	UnitNode u = ((UnitNode) this.getParentOfType(UnitNode.class));
			DeclNode.TypedMember decl = (TypedMember) (sym != null
					&& sym.node() instanceof DeclNode.TypedMember ? sym.node()
					: null);
			if (decl != null && u.isUnitUsed()) {
				setUnitsUsed(decl, u);
			}        	
        }

		/**
		 * Set unitUsed for the unit bound, the bind site (current unit node) and 
		 * the unit of dcln of the protocol member. 
		 * Can be called in pass2 or passN. Bind site unit must be used.
		 * @param snode
		 */
		private void setUnitsUsed(DeclNode.TypedMember snode, UnitNode bindSite) {
			if (bindToUnit != null) {
				bindToUnit.setUnitUsed(true); 		// bound unit
				bindSite.setUnitUsed(true); 		// bind site
				snode.getUnit().setUnitUsed(true);  // dcln site of protocol mbr declaration
			}
		}

		public UnitNode getBindToUnit() {
			return bindToUnit;
		}
    }
    
    // StmtNode.Switch
    static public class Switch extends StmtNode {

        static final private int CASES = 1;
        static final private int EXPR = 0;
        static final private int DEFAULT = 2;
        
        Switch(int ttype, String ttext) {
            super(ttype, ttext);
        }
        
        @SuppressWarnings("unchecked")
        public List<StmtNode.Case> getCases() {
            return ((ListNode<StmtNode.Case>) getChild(CASES)).getElems();
        }
        
        public ExprNode getSwitch() {
            return (ExprNode) getChild(EXPR);
        }
        
        public StmtNode.Case getDefault() {
            return (StmtNode.Case) getChild(DEFAULT);
        }
        
        @Override
        protected void pass2End() {
            Cat switchCat = getSwitch().getCat();
            if (TypeRules.preCheck(switchCat) != null) {
                return;
            }
            switchCat = TypeRules.checkUnary("S", switchCat, "switch value type error");
            if (switchCat instanceof Cat.Error) {
                ParseUnit.current().reportError(getSwitch(), ((Cat.Error) switchCat).getMsg());
                return;
            }
            for (StmtNode.Case stmt : getCases()) {
                ExprNode caseExpr = stmt.getCase();
                if (!caseExpr.isConst()) {
                    ParseUnit.current().reportError(caseExpr, "case value must be constant");
                    continue;
                }
                Cat caseCat = caseExpr.getCat();
                if (TypeRules.preCheck(caseCat) != null) {
                    continue;
                }
                Cat resCat = TypeRules.checkBinary("==", switchCat, caseCat, "switch/case type error");
                if (resCat instanceof Cat.Error) {
                    ParseUnit.current().reportError(caseExpr, ((Cat.Error) resCat).getMsg());
                }
            }
        }
    }
    
    
    // StmtNode.While
    static public class While extends StmtNode {

        static final private int BODY = 1;
        static final private int COND = 0;
        
        private boolean isDo;

        While(int ttype, String ttext) {
            this(ttype, ttext, false);
        }
        
        While(int ttype, String ttext, boolean isDo) {
            super(ttype, ttext);
            this.isDo = isDo;
        }
        
        public StmtNode getBody() {
            return (StmtNode) getChild(BODY);
        }

        public ExprNode getCond() {
            return (ExprNode) getChild(COND);
        }
        
        public boolean isDo() {
            return isDo;
        }

        @Override
        protected void pass2End() {
            checkCond(getCond());
        }
    }
    
    // StmtNode
    
    static private void checkCond(ExprNode cond) {
        Cat cat = cond.getCat();
        
        if (cond instanceof ExprNode.SubExprCat) {
        	cat = ((ExprNode.SubExprCat) cond).getSubExprCat();
        }
        
        if (TypeRules.preCheck(cat) != null) {
            return;
        }
        cat = TypeRules.checkUnary("!", cat, "condition type error");
        if (cat instanceof Cat.Error) {
            ParseUnit.current().reportError(cond, ((Cat.Error) cat).getMsg());
        }
    }
    
    StmtNode(int ttype, String ttext) {
        this.token = new Atom(ttype, ttext);
    }
    
    @Override
    protected boolean pass1Begin() {
        return true;
    }
    
    @Override
    protected boolean pass2Begin() {
        return true;
    }
    
}
