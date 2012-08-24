package com.amaret.pollen.parser;

import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.antlr.runtime.CommonToken;
import org.antlr.runtime.tree.Tree;

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

        @Override
        protected void pass2End() {
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
    
    // StmtNode.Print
    static public class Print extends StmtNode {

        static final private int ARGS = 0;
        EnumSet<Flags> flags = EnumSet.noneOf(Flags.class);
        
        Print(int ttype, String ttext,  EnumSet<Flags>  f) {
            super(ttype, ttext);
            flags.addAll(f);
        }
        Print(int ttype, String ttext) {
            super(ttype, ttext);
            flags.add(Flags.OUT);
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
        
        @Override
        protected void pass2End() {

            ParseUnit currUnit = ParseUnit.current();
            List<ExprNode> args = getArgs();
            ExprNode arg0 = args.get(0);

            if (!arg0.getCat().isString() || !(arg0 instanceof ExprNode.Const)) {
                currUnit.reportError(arg0, "printf requires a literal format string");
                return;
            }

            if (args.size() > 5) {
                currUnit.reportError(arg0, "printf accepts no more than four arguments");
                return;
            }

            String fmt = ((ExprNode.Const) arg0).getValue().getText();
            boolean pct = false;
            boolean err = false;
            int argc = 1;
            for (int i = 0; i < fmt.length(); i++) {
                char ch = fmt.charAt(i);
                if (pct) {
                    if (argc++ > args.size()) {
                        currUnit.reportError(arg0, "insufficient number of printf arguments");
                        err = true;
                        break;
                    }
                    switch (ch) {
                    case 'c':
                        break;
                    case 'd':
                        break;
                    case 'o':
                        break;
                    case 'p':
                        break;
                    case 's':
                        break;
                    case 'u':
                        break;
                    case 'x':
                        break;
                    case '%':
                        break;
                    default:
                        currUnit.reportError(arg0, "'%" + ch + "': unrecognized printf format specifier");
                        err = true;
                        break;
                    }
                    pct = false;
                }
                else {
                    pct = (ch == '%');
                }
                if (err) {
                    break;
                }
            }

            if (!err && argc != args.size()) {
                currUnit.reportError(arg0, "too many printf arguments");
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

        	ListNode<TypeNode> l = FcnBodyNode.current().getFcn().getTypeSpec();
        	
        	if (getVec() != null && FcnBodyNode.current().getFcn().isVoid()) {
        		ParseUnit.current().reportError(this, "Void functions cannot return values");
        	}
        	if (getVec() == null && !FcnBodyNode.current().getFcn().isVoid()) {
        		ParseUnit.current().reportError(this, "Missing return value");
        	}
           
			ExprNode.Vec v = getVec();
			for (ExprNode expr : v.getVals()) {
				for (TypeNode t : l.getElems()) {
					Cat retcat = Cat.fromType(t);
					Cat valcat = expr.getCat();
					if (TypeRules.preCheck(valcat) == null) {
						Cat rescat = TypeRules.checkBinary("=", retcat, valcat,
								"return type error");
						if (rescat instanceof Cat.Error) {
							ParseUnit.current().reportError(expr,
									((Cat.Error) rescat).getMsg());
						}
					}
				}

			}
        }
    }
    
    // StmtNode.Bind
    static public class Bind extends StmtNode {

        static final private int PRO = 0;
        static final private int VAL = 1;

        Bind(int ttype, String ttext) {
            super(ttype, ttext);
        }
        
        public ExprNode getConfig() {
            return (ExprNode) getChild(PRO);
        }

        public ExprNode getValue() {
            return getChildCount() > VAL ? (ExprNode) getChild(VAL) : null;
        }
        
        @Override
        protected void pass2End() {
        	// TODO
        	// check that a protocol is being bound to a module
        	// in either a host fcn or a module body
            SymbolEntry sym = getConfig().getSymbol();
            ISymbolNode snode = sym != null ? sym.node() : null;
            if (getValue() != null) {
                Cat left = getConfig().getCat();
                Cat right = getValue().getCat();
                if (!(left instanceof Cat.Error) && !(right instanceof Cat.Error)) {
                    Cat res = TypeRules.checkBinary("=", left, right);
                    if (res instanceof Cat.Error) {
                        ParseUnit.current().reportError(getConfig(), ((Cat.Error) res).getMsg());
                    }
                }
            }
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
        if (TypeRules.preCheck(cat) != null) {
            return;
        }
        cat = TypeRules.checkUnary("!", cat, "condition type error");
        if (cat instanceof Cat.Error) {
            ParseUnit.current().reportError(cond, ((Cat.Error) cat).getMsg());
        }
    }
    
    StmtNode(int ttype, String ttext) {
        this.token = new CommonToken(ttype, ttext);
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
