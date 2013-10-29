package com.amaret.pollen.translator;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.Stack;

import org.antlr.runtime.tree.Tree;

import com.amaret.pollen.driver.ProcessUnits;
import com.amaret.pollen.parser.BaseNode;
import com.amaret.pollen.parser.BodyNode;
import com.amaret.pollen.parser.Cat;
import com.amaret.pollen.parser.DeclNode;
import com.amaret.pollen.parser.ExprNode;
import com.amaret.pollen.parser.Flags;
import com.amaret.pollen.parser.IScope;
import com.amaret.pollen.parser.ISymbolNode;
import com.amaret.pollen.parser.ImportNode;
import com.amaret.pollen.parser.LitFlags;
import com.amaret.pollen.parser.ParseUnit;
import com.amaret.pollen.parser.StmtNode;
import com.amaret.pollen.parser.SymbolEntry;
import com.amaret.pollen.parser.TypeNode;
import com.amaret.pollen.parser.UnitNode;
import com.amaret.pollen.parser.pollenParser;
import com.amaret.pollen.parser.Cat.Agg;
import com.amaret.pollen.parser.DeclNode.Arr;
import com.amaret.pollen.parser.DeclNode.Formal;
import com.amaret.pollen.parser.DeclNode.ITypeKind;
import com.amaret.pollen.parser.ExprNode.Const;
import com.amaret.pollen.parser.ExprNode.Ident;
import com.amaret.pollen.parser.ExprNode.Quest;
import com.amaret.pollen.parser.StmtNode.Bind;
import com.amaret.pollen.parser.StmtNode.Decl;
import com.amaret.pollen.parser.StmtNode.Provided;
import com.amaret.pollen.parser.TypeNode.Fcn;
import com.amaret.pollen.parser.TypeNode.Usr;

class Auxiliary {

	
	// TODO size as stmt not implemented - needed?
	// TODO do I need ArrayDesc? (what is it)
	// TODO I need to implement return properly. Returns a value wrapped in a
	// cls.

	static final int ARR_BRACKET = -1;

	static private final int DEFAULT_INMOD = 0;
	static private final int DEFAULT_INARR = 2;
	static private final int DEFAULT_INNEW = 3;

	private Stack<Integer> arrSizes = new Stack<Integer>();
	private boolean curSkip;
	private String curTypeString;
	private Generator gen;
	private boolean isHost;
	private boolean skipPost = false;
	public boolean isSkipPost() {
		return skipPost;
	}

	public void setSkipPost(boolean skipPost) {
		this.skipPost = skipPost;
	}

	Auxiliary(Generator gen) {
		arrSizes.push(0);
		this.gen = gen;
	}

	void genBanner(String title) {
		gen.fmt.print("%t/* %1 */\n", title);
	}

	void genDefault(Cat cat, DeclNode.ITypeSpecInit ts) {
		genDefault(cat, ts, DEFAULT_INMOD);
	}

	private void genDefault(Cat cat, DeclNode.ITypeSpecInit ts, int context) {

		String tc = cat.code();
        if ((tc.startsWith("C") || tc.startsWith("X")) && ((Cat.Agg) cat).isHostClassRef()) {
            Cat.Agg aggCat = (Cat.Agg) cat;
            ISymbolNode is = (DeclNode) aggCat.aggScope();
            IScope defScope = aggCat.defScope();
            if (aggCat.isHostClassRef()) {
            	// 'new' on a module member: get the type
            	TypeNode.Usr t = (Usr) (ts.getTypeSpec() instanceof TypeNode.Usr ? ts.getTypeSpec() : null);
            	String tn = t.getName().getText();
   				gen.fmt.mark();
   				this.mkModName(t.getSymbol(), aggCat, tn);
				String ss = gen.fmt.release();
				if (t.getSymbol().node() instanceof ImportNode)
					ss += "." + tn;
            	gen.fmt.print("new %1", ss);
            }
            else
            gen.fmt.print("new %1", gen.aux.mkQname(defScope,  is));
            switch (context) {
//            case DEFAULT_INSTR:
//                gen.fmt.print("(this.$$cname+'.%1')", ts.getName());
//                break;
            case DEFAULT_INARR:
                gen.fmt.print("($$cn+'['+$$idx+']')");
                break;
            case DEFAULT_INMOD:
                gen.fmt.print("('%1')", gen.uname_target() + ts.getName() + gen.aux.mkSuf((ISymbolNode)ts));
                break;
            case DEFAULT_INNEW:
                break;
            }
        }

        else if (tc.startsWith("A") || tc.startsWith("V")) {

		
			boolean isVec = tc.startsWith("V");
			Cat.Arr arrCat = ((Cat.Arr) cat);
			TypeNode.Arr tarr = arrCat.getType();
			gen.fmt.print("new $$Array(");
			if (tarr.getFirstDim() != null) {
				gen.aux.genExpr(tarr.getFirstDim());
			} else {
				gen.fmt.print("-1");
			}
			Cat base = arrCat.getBase();
			if (base.isAggTyp() && ((Cat.Agg) base).aggScope() instanceof DeclNode.Usr) {
				// this is an array of objects
				String s = "obj = new " + gen.uname() + "." + (((Cat.Agg) base).aggScope()).getScopeName() +  "(); obj." + ParseUnit.CTOR_CLASS_HOST + "(); return obj";
				gen.fmt.print(", function($$cn,$$idx){" + s + ";}, ");				
			}
			else {
				gen.fmt.print(", function($$cn,$$idx){ return ");
				genDefault(arrCat.getBase(), null, DEFAULT_INARR); 
				gen.fmt.print(";}, ");
			}
			

			char ch = tc.charAt(1);
			boolean aggFlg = ch == 'A' || ch == 'V'; // || ch == 'C';

			switch (context) {
			case DEFAULT_INARR:
				if (isVec) {
					gen.fmt.print("$$cn+'['+$$idx+']', %1", aggFlg);
				} else {
					gen.fmt.print("$$cn+'__'+$$idx+'__A', %1", aggFlg);
				}
				break;
			case DEFAULT_INMOD:
				gen.fmt.print("'%1__A', %2", gen.uname_target() + ts.getName(),aggFlg);
				break;
			case DEFAULT_INNEW:
				gen.fmt.print("'__new_'+($$Array.$$idx++)+'__A', %1", aggFlg);
				break;
			}
			gen.fmt.print(")");
		} else if (tc.startsWith("F") || tc.startsWith("P")
				|| tc.startsWith("R") || tc.equals("s")) {
			gen.fmt.print("null");
		} else {
			gen.fmt.print("0");
		}
	}

	void genExpr(ExprNode expr) {
		if (expr == null) {
			gen.fmt.print("/* ?? null expr ?? */");
			return;
		}
		int eType = expr.getType();
		boolean parens = eType == pollenParser.E_IDENT
				|| eType == pollenParser.E_INDEX;
		parens = parens && expr.getParent().getType() != pollenParser.E_CALL;
		if (parens) {
			gen.fmt.print("(");
		}
		genExpr2(expr, eType);
		if (parens) {
			gen.fmt.print(")");
		}
	}

	/**
	 * Generate the expr which is a dereference after (from) a function return, 
	 * or a dereference after an index expr.
	 * @param expr
	 */
	void genExprPost(ExprNode expr) {
		if (expr.getChildCount() > 1) {
			for (int i = 1; i < expr.getChildCount(); i++) {
				BaseNode b = (BaseNode) expr.getChild(i);
				if (b instanceof ExprNode) {
					ExprNode e = (ExprNode) b;
					int eType = e.getType();
					switch (eType) {
					case pollenParser.E_INDEX:
						//if (!isHost())
							genExpr2(e, eType);
						break;
					case pollenParser.E_IDENT:
					case pollenParser.E_CALL:
						gen.fmt.print("->");
						genExpr2(e, eType);
						break;
					default:
						break;

					}
				}
			}
		}
	}

	void genExpr2(ExprNode expr, int eType) {
		
		switch (eType) {

		case pollenParser.E_BINARY:
			genExpr$Binary((ExprNode.Binary) expr);
			break;
		case pollenParser.E_CALL:
			genExpr$Call((ExprNode.Call) expr);
			genExprPost(expr);
			break;
		case pollenParser.E_QUEST:
			genExpr$Quest((ExprNode.Quest) expr);
			break;
		case pollenParser.E_CONST:
			genExpr$Const((ExprNode.Const) expr);
			break;
		case pollenParser.E_INJ:
			genExpr$Inject((ExprNode.Inject) expr);
			break;
		case pollenParser.E_HASH:
			genExpr$Hash((ExprNode.Hash) expr);
			break;
		case pollenParser.E_SELF:
			ExprNode e = ((ExprNode.Self) expr).getMember();
			if (e != null)
				genExpr2(e, e.getType());
			else
				// make cname for 'this'
				this.mkCname(e.getSymbol().scope());
			break;
		case pollenParser.E_IDENT:
			genExpr$Ident((ExprNode.Ident) expr);
			if (!isSkipPost())
				genExprPost(expr);
			break;
		case pollenParser.E_INDEX:
			genExpr$Index((ExprNode.Index) expr);
			genExprPost(expr);
			break;
		case pollenParser.E_NEW:
			genExpr$New((ExprNode.New) expr);
			break;
		case pollenParser.E_PAREN:
			genExpr$Paren((ExprNode.Paren) expr);
			break;
		case pollenParser.E_UNARY:
			genExpr$Unary((ExprNode.Unary) expr);
			break;
		case pollenParser.E_VEC:
			genExpr$Vec((ExprNode.Vec) expr, true);
			break;
		}
	}

	private void genExpr$Binary(ExprNode.Binary expr) {

		ExprNode left = expr.getLeft();
		ExprNode right = expr.getRight();
		String op = expr.getOp().getText();

		if (expr.isAssign() && isHost() && (expr.hasLeftIndexExpr())) { 
			ExprNode.Index idxExpr = expr.getLeftIndexExpr();
			setSkipPost(true);
			genExpr(idxExpr.getBase());
			setSkipPost(false);
			gen.fmt.print(".set(");
			genExpr(idxExpr.getFirstIndex());
			gen.fmt.print(", ");
			if (op.equals("=")) {
				genExpr(right);
			} else {
				genExpr(idxExpr.getBase());
				gen.fmt.print(".get(");
				genExpr(idxExpr.getFirstIndex());
				gen.fmt.print(") %1 ", op.substring(0, op.length() - 1));
				genExpr(right);
			}
			gen.fmt.print(")");
			return;
		}

		if (op.equals("=") && isHost() && right instanceof ExprNode.AggVal) {
			genExpr(left);
			gen.fmt.print(".$$assign(");
			genExpr(right);
			gen.fmt.print(")");
			return;
		}
		// TODO will I need ArrayDesc?

		Cat cl = left.getCat();
		Cat cr = right.getCat();

		if (op.equals("=") && left.getCat().isArrayDesc()
				&& right.getCat() instanceof Cat.Arr) {
			Cat.Arr rightCat = (Cat.Arr) right.getCat();
			if (rightCat.getType().hasDim()) {
				gen.fmt.print("__arrDescSet__((");
				genExpr(left);
				gen.fmt.print("), (");
				genExpr(right);
				gen.fmt.print("), (");
				genTypeWithVarName(rightCat.getType().getBase(), null);
				gen.fmt.print("))");
				return;
			}
		}

		genExpr(left);
		if (right instanceof ExprNode.New) { 
			// class host constructors are a bit special
			ExprNode.Call c = ((ExprNode.New) right).getCall();
			if (c.getCalledFcn() != null) {
				SymbolEntry se = c.getCalledFcn();
				ISymbolNode node = se != null ? se.node() : null;
				if (node != null
						&& node.getName().getText().equals(ParseUnit.CTOR_CLASS_HOST)) {
					gen.fmt.print(".%1()", ParseUnit.CTOR_CLASS_HOST);
					return;
				}
			}
		}

		String addrOf = "";
		String deref = "";
		if (cl instanceof Cat.Agg) {
			Cat.Agg leftCat = (Agg) cl;
			if (leftCat.isClassRef() && !(cr instanceof Cat.Scalar)
					&& !isHost())
				addrOf = "&";
			gen.fmt.print(" %1 %2", op, addrOf);
		} else {
			if (cl instanceof Cat.Arr) {
				if (expr.isAssign() && expr.hasLeftIndexExpr()
						&& cr.isClassRef())
					deref = "*";
				gen.fmt.print(" %1 %2", op, deref);
			} else {
				gen.fmt.print(" %1 ", op);
			}
		}

		genExpr(right);
	}

	private void genExpr$Call(ExprNode.Call expr) {

				
		String n = expr.getName() instanceof ExprNode.Ident ? ((ExprNode.Ident) expr.getName()).getName().getText() : "";
		//System.out.println("genExprCall: " + n);

				
		if (n.equals(ParseUnit.INTRINSIC_PREFIX + "assert") && !ProcessUnits.isAsserts())
			return;  // suppress call
				
		genExpr(expr.getName());
		
		genCallArgs(expr);
	}

	/**
	 * @param expr
	 */
	void genCallArgs(ExprNode.Call expr) {
		Cat cat = expr.getName().getCat();
		Cat.Fcn fcncat = cat instanceof Cat.Fcn ? (Cat.Fcn) cat : null;
		
		String sep = "";
		gen.fmt.print("(");
		int argc = 0;

		if (expr.addThisPtrParameter()) {
			sep = ", ";
			if (expr.getQualifier() != null) {				
				String addrOf = expr.getQualifier().node() instanceof DeclNode && ((DeclNode)expr.getQualifier().node()).isHostClassRef() ? "&" : "";
				gen.fmt.print("%1%2", addrOf, mkQname(expr.getQualifier()));
			}
			else 
				gen.fmt.print("/* unknown invoker ?? */");
			//++argc;
		}

		List<DeclNode.Formal> formals = fcncat != null ? fcncat.fcnD().getFormals() : null;
		
		for (ExprNode arg : expr.getArgs()) {
			gen.fmt.print(sep);
			sep = ", ";
			
			// a cast may be necessary.
			if (formals != null && arg.getCat().isClassRef()) {
				
				String argTypeName = ((Cat.Agg)arg.getCat()).aggName();
				
				Formal f = formals.get(argc);
				if (f.getTypeCat().isClassRef()) {
					String formalTypeName = ((Cat.Agg)f.getTypeCat()).aggName();
					if (!(argTypeName.equals(formalTypeName))) { // CAST
						gen.fmt.print("(");
						genTypeWithVarName(f.getTypeSpec(), null);
						gen.fmt.print(")&");
					}
				}
			}
			genExpr(arg);
			++argc;
		}
		// TODO more robust sig matching

		if (fcncat != null && argc < fcncat.maxArgc()) {
			while (argc < fcncat.maxArgc()) {
				gen.fmt.print(sep);
				sep = ", ";
				genExpr(formals.get(argc).getInit());
				++argc;
			}
		}

		gen.fmt.print(")");
	}

	private void genExpr$Quest(Quest expr) {
		genExpr(expr.getTest());
		gen.fmt.print(" ? ");
		genExpr(expr.getTrue());
		gen.fmt.print(" : ");
		genExpr(expr.getFalse());
	}

	private void genExpr$Const(ExprNode.Const expr) {
		String vs = expr.getValue().getText();
		if (!isHost() && vs.startsWith("\"")) {
			int id = gen.curUnit().findString(vs);
			if (id == -1) {
				gen.fmt.print("%1", vs);
			} else {
				gen.fmt.print("%1_s__%2", gen.uname_target(), id);
			}
		} else {
			gen.fmt.print("%1", vs);
		}
	}

	private void genExpr$Inject(ExprNode.Inject expr) { 
				
		int i = 0;
		for (SymbolEntry sym : expr.getSymbols()) {
			ISymbolNode snode = sym != null ? sym.node() : null;
			BaseNode b = expr.getInjects().get(i++);
			if (sym != null) {

				// String meta value parameters: the quotes are stripped and the
				// value is injected into c as a (c) SYMBOL (which is assumed to have
				// been defined).

				if (snode instanceof DeclNode.Formal
						&& gen.curUnit().getUnitType().getMetaFormals() != null) {
					DeclNode.Formal f = (Formal) snode;
					Cat cat = Cat.fromType(f.getTypeSpec());
					if (f.isMetaArg() && cat.code().equals("s")
							&& f.getName().getText().equals(((ExprNode.Ident) b).getName().getText())) {
						if (f.getInit() instanceof ExprNode.Const) {
							String injectVal = ((ExprNode.Const) f.getInit())
							.getValue().getText();
							injectVal = injectVal.replaceAll("^\"|\"$", "");
							injectVal = injectVal.replaceAll("^\'|\'$", "");
							// gen.fmt.print(injectVal + "\n");
							gen.fmt.print(injectVal);
						}
					}
				}
				else if (b instanceof ExprNode.Ident) {
					genExpr$Ident((Ident) b); // a pollen name
				}
			}
			else  // not a meta formal
				if (b instanceof ExprNode.Ident) {
					genExpr$Ident((Ident) b); // a pollen name
				}
				else {
					// text to be output as is
					gen.fmt.print_literal(b.getAtom()); // injected text
				}

		}
		//gen.fmt.print("\n");
	}

	private void genExpr$Hash(ExprNode.Hash expr) {

		boolean newFlg = expr.getCat() != Cat.HASH;
		if (newFlg) {
			gen.fmt.print("(");
			genDefault(expr.getCat(), null, DEFAULT_INNEW);
			gen.fmt.print(").$$assign(");
		}

		List<ExprNode> vals = expr.getVals();
		if (vals.size() == 0) {
			gen.fmt.print("{}");
		} else {
			gen.fmt.print("{\n%+");
			int i = 0;
			for (BaseNode id : expr.getIds()) {
				gen.fmt.print("%t%1:", id);
				genExpr(vals.get(i++));
				gen.fmt.print(",\n");
			}
			gen.fmt.print("%-%t}");
		}

		if (newFlg) {
			gen.fmt.print(")");
		}
	}

	private void genExpr$Ident(ExprNode.Ident expr) {
		
		boolean dbg = false;
		String s = expr.getName().getText();

		SymbolEntry sym = expr.getSymbol();
		if (sym == null) {
			if (expr.isIntrisicCall())
				gen.fmt.print("%1%2%3", gen.uname_target(), expr.getName(), "__E");
			else
				gen.fmt.print(expr.getName() + " /* ?? missing symbol ?? */ ");
			return;
		}

		ISymbolNode snode = sym.node();
		IScope scopeOfDcln = sym.scope();
		SymbolEntry qualifier = expr.getQualifier();
		ISymbolNode qualifierNode = qualifier != null ? qualifier.node() : null;
		IScope qscope = qualifier != null ? qualifier.scope() : null;		
		
		if (qualifierNode instanceof DeclNode.TypedMember && qscope instanceof StmtNode.Block) {
			//scopeOfDcln = qscope;
			// doesn't work for e.fcn() where e is declared in the block but the resolution does to an extern fcn.
			// when is this needed?
		}
		else if (snode instanceof DeclNode.Fcn && scopeOfDcln instanceof ImportNode
				&& ((ImportNode) scopeOfDcln).isExport()) {
			// an exported function
			scopeOfDcln = ((DeclNode.Fcn) sym.node()).getUnit();
		}
		
		
		boolean localsScope = !(scopeOfDcln instanceof UnitNode
				|| scopeOfDcln instanceof DeclNode.Usr);
				
		if (localsScope) {
			String scopeQualifier = expr.isThisPtr() && !isHost() && !expr.getName().getText().equals("this") ? "this->" : "";
			gen.fmt.print(scopeQualifier + expr.getName());
			return;
		}
		
		if (snode instanceof ImportNode) {
			if (((ImportNode) snode).getUnit() != null) {
				String qn = ((ImportNode) snode).getUnit().getQualName();
				if (isHost()) {
					gen.fmt.print("$units['%1']", qn);
				} else {
					gen.fmt.print("%1", qn.replace('.', '_'));
				}
			}
			return;
		}

		if (snode == gen.curUnit()) {
			if (isHost()) {
				gen.fmt.print(gen.uname());
			} else {
				gen.fmt.print("%1", gen.curUnit().getQualName().replace(
						'.', '_'));
			}
			return;
		}
		
		// Qualify the name with its scope.
		
		boolean classScopeOfDcln = scopeOfDcln instanceof DeclNode.Class;
		
		if (scopeOfDcln instanceof DeclNode.Usr && !((ITypeKind)scopeOfDcln).isClass()) {
			scopeOfDcln = scopeOfDcln.getEnclosingScope();
		}
		
		
		String qn = "";
		if (qualifierNode instanceof DeclNode.TypedMember
				&& ((DeclNode.TypedMember) qualifierNode)
						.isProtocolMember()) {
			// qualify to the binding unit
			if (((DeclNode.TypedMember) qualifierNode).getBindToUnit() == null) {
				ParseUnit.current().reportError(expr, "Unbound protocol member detected");
			}
			else 
				qn = ((DeclNode.TypedMember) qualifierNode).getBindToUnit().getQualName();
		}
		
		if (qn.isEmpty()) {
			if (scopeOfDcln instanceof UnitNode && ((UnitNode) scopeOfDcln).isComposition())	{
				scopeOfDcln = ((DeclNode) snode).getUnit();
				
			}
			qn = (scopeOfDcln instanceof UnitNode ? ((UnitNode) scopeOfDcln)
					.getQualName()
					: (scopeOfDcln instanceof DeclNode.Usr) ? ((DeclNode.Usr) scopeOfDcln)
							.getUnitQualName() 
							: "/* ?? scope unknown ?? */");
			
			boolean isClassRef = qualifierNode instanceof DeclNode
					&& ((DeclNode) qualifierNode).isClassRef();
			if (classScopeOfDcln && !expr.isThisPtr() && isClassRef && this.isHost())
				qn = gen.uname();
			
		}

		if (isHost()) {
			if (scopeOfDcln == gen.curUnit()) {
				gen.fmt.print("%1.%2", gen.uname(), expr.getName());
			} else if (classScopeOfDcln) {
				if (expr.isThisPtr() || gen.curUnit().isClass() || gen.isNestedClass()){
					// the scope qualifier is 'this'
					String n = expr.getName().getText().substring(expr.getName().getText().lastIndexOf('.')+1);
					gen.fmt.print("this.%1", n);
				}
				else {
					if (qualifier != null && qualifierNode instanceof DeclNode.TypedMember) {
						gen.fmt.print("%1.%2", qn, expr.getName().getText());
					}
					else 
						gen.fmt.print("$units['%1'].%2", qn, expr.getName().getText());
				}

			} else {
				// the scope qualifiers from the source are satisfied by the unit, so delete.
				String n = expr.getName().getText().substring(expr.getName().getText().lastIndexOf('.')+1);
				if (n.equals("init"))
					dbg = true;
				gen.fmt.print("$units['%1'].%2", qn, n);
			}
		} else {
			// local (function scope)

			if (isDerefExpr(expr)) {
				gen.fmt.print(mkCname(expr));
				return;
			}

			if (expr.isThisPtr() && !(snode instanceof DeclNode.Fcn)) {
				if (isHost())
					gen.fmt.print("this." + mkCname(expr));
				else
					gen.fmt.print("this->" + mkCname(expr));
				return;
			}

			gen.fmt.print("%1_%2%3", qn.replace('.', '_'), mkCname(expr),
					mkSuf(snode));
		}
	}

	private void genExpr$Index(ExprNode.Index expr) {
		//ExprNode base = expr.getBase();
		if (isHost()) {
			// assign LHS goes thru ExprBinary so this is always RHS
			// genExpr(base);
			gen.fmt.print(".get(");
			genExpr(expr.getFirstIndex());
			gen.fmt.print(")");
		} else {
			for (ExprNode e : expr.getIndexes()) {
				gen.fmt.print("[");
				genExpr(e);
				gen.fmt.print("]");
			}
		}
	}

	private void genExpr$New(ExprNode.New expr) {
		
		if (!expr.getCall().isHostConstructorCall()) {
        	ParseUnit.current().reportError(expr.getCall().getName(), "non-host invocations of 'new()' are not yet implemented");        	
        }
		genExpr$Call(expr.getCall());

	}

	private void genExpr$Paren(ExprNode.Paren expr) {
		gen.fmt.print("(");
		genExpr(expr.getBase());
		gen.fmt.print(")");
	}

	private void genStmt$Bind(StmtNode.Bind stmt) {

		ExprNode proMem = stmt.getPro();
		TypeNode typ = stmt.getValue();
		
		// cname = unit.getPkgName().getText().replace('.', '_') + '_'  + uname + '_';	
		ISymbolNode n = (stmt.getPro() != null && stmt.getPro().getSymbol() != null) ? stmt
				.getPro().getSymbol().node()
				: null;
		boolean pflg = (n != null && n instanceof DeclNode.TypedMember && ((DeclNode.TypedMember) n)
				.isProtocolMember());
		if (!pflg)
			return;

		gen.fmt.print("var $$v = \'");
		if (typ == null ) {
			gen.fmt.print("undefined");
		} else {
			String s = (stmt.getBindToUnit() != null ?  mkCname(stmt.getBindToUnit()) : mkCname(typ));
			gen.fmt.print(s.substring(0, s.length()-1)); //(this.mkJSname(typ));
			//this.genType(typ, "");
			// genExpr(vexpr);
		}
		gen.fmt.print("\';\n%t");

		gen.fmt.print("var $$s = ");

		String uname = "$units[\'" + gen.uname_host() + "\']"; 
		if (proMem instanceof ExprNode.Ident) {
			gen.fmt.print("$$bind(%1, '%2', $$v);", uname,
					((ExprNode.Ident) proMem).getName());
		}
		gen.fmt.print("if ($$v && $$v == $$s) $$v.pollen$used = true;");

	}

	private void genExpr$Size(ExprNode.Size expr) {
		switch (expr.getOp()) {
		case 's':
			if (isHost()) {
				gen.fmt.print("%1", expr.getTypeSpec().getTypeInfo().size);
			} else {
				gen.fmt.print("sizeof(");
				genTypeWithVarName(expr.getTypeSpec(), null);
				gen.fmt.print(")");
			}
			break;
		case 'a':
			if (isHost()) {
				gen.fmt.print("%1", expr.getTypeSpec().getTypeInfo().align);
			} else {
				gen.fmt.print("offsetof (cls { char c; ");
				genTypeWithVarName(expr.getTypeSpec(), "t");
				gen.fmt.print("; }, t)");
			}
			break;

		}
	}

	private void genExpr$Unary(ExprNode.Unary expr) {
		if (!expr.isPostfix()) {
			gen.fmt.print("%1", expr.getOperator());
		}
		genExpr(expr.getOperand());
		if (expr.isPostfix()) {
			gen.fmt.print("%1", expr.getOperator());
		}
	}

	private void genExpr$Vec(ExprNode.Vec expr, boolean braces) {

		boolean newFlg = expr.getCat() != Cat.VEC;
		SymbolEntry se = expr.getSymbol();
		boolean isArrayInit = (se != null && se.node() != null
				&& se.node() instanceof DeclNode.Arr);
		Cat.Arr arrCat =  expr.getCat() instanceof Cat.Arr ? ((Cat.Arr) expr.getCat()) : null;			
		Cat base = arrCat != null ? arrCat.getBase() : null;
		boolean objectBase = (base != null && base.isAggTyp() && (((Cat.Agg) base)
				.aggScope() instanceof DeclNode.Usr || ((Cat.Agg) base)
				.aggScope() instanceof UnitNode)) ? true : false;
		
		String openBr = braces && isArrayInit && !isHost() ? "{" : "[";
		String closBr = braces && isArrayInit && !isHost() ? "}" : "]";

		List<ExprNode> vals = expr.getVals();
		if (newFlg && isHost()) {

				gen.fmt.print("(");
				genDefault(expr.getCat(), null, DEFAULT_INNEW);
				gen.fmt.print(").$$assign");

		}

		if (newFlg && isHost()) 
			gen.fmt.print("(");
		
		if (vals.size() == 0 && braces) {
			gen.fmt.print(openBr + closBr);
		} else {
			if (braces)
				gen.fmt.print(openBr + "%+");
			String sep = " ";
			

			for (ExprNode e : vals) {
				gen.fmt.print(sep);
				sep = ", ";
				if (objectBase && e instanceof ExprNode.New) {		
					// The cases differ on whether the scope is a DeclNode.Usr or UnitNode,
					// the latter is associated with meta types.
					String name = ((Cat.Agg) base).aggScope().getScopeName();
					name = name.substring(name.lastIndexOf('.')+1);
					String n = ((Cat.Agg) base).aggScope() instanceof UnitNode ? "$units['"
							+ (((Cat.Agg) base).aggScope()).getScopeName()
							+ "']."
							+ name
							: gen.uname()
									+ "."
									+ (((Cat.Agg) base).aggScope())
											.getScopeName();
					//System.out.println(n);
					
					String initElem1 = "(function() {obj = new " + n +  "(); obj." + ParseUnit.CTOR_CLASS_HOST ;
					String initElem2 = "; return obj;}) ()";
					gen.fmt.print(initElem1);
					gen.aux.genCallArgs(((ExprNode.New)e).getCall());   
					gen.fmt.print(initElem2);
				}
				else 
					genExpr(e);
			}
			gen.fmt.print(" ");
			if (braces)
				gen.fmt.print("%-" + closBr);
		}

		if (newFlg && isHost()) {
			gen.fmt.print(")");
		}
	}

	/**
	 * 
	 * @param args
	 * @param typeFlg true if a type should be output for the parameter. (False for script output.)
	 * @param fcn
	 */
	void genFcnArgs(List<DeclNode.Formal> args, boolean typeFlg, com.amaret.pollen.parser.DeclNode.Fcn fcn) {
		
		DeclNode.Formal thisPtr = fcn.getThisPtr();

		if (args.size() == 0) {
			if (thisPtr.isMethod()) {	// to access class data
				gen.fmt.print("( ");
				genTypeWithVarName(thisPtr.getTypeSpec(), "" + thisPtr.getName());
				gen.fmt.print(" )");
				return;
			}
			gen.fmt.print("(%1)", "");
			return;
		}

		String sep = "";
		gen.fmt.print("( ");
		
		if (thisPtr.isMethod()) {	// to access class data
			sep = ", ";
			genTypeWithVarName(thisPtr.getTypeSpec(), "" + thisPtr.getName());
		}

		for (DeclNode.Formal arg : args) {
			gen.fmt.print(sep);
			sep = ", ";
			if (typeFlg) {
				SymbolEntry s = arg.getTypeSpec() instanceof TypeNode.Usr ? ((TypeNode.Usr) arg
						.getTypeSpec()).getSymbol()
						: null;
				ISymbolNode is = s != null ? s.node() : null;
				if (is instanceof DeclNode.Fcn) {
					gen.fmt.print("void* " + arg.getName());
				} else
					genTypeWithVarName(arg.getTypeSpec(), "" + arg.getName());
			} else
				gen.fmt.print(arg.getName()); // javascript
		}
		gen.fmt.print(" )");
	}

	void genHeaderInclude(String qn) {
		String gs = qn.replace('.', '_') + "__M";
		int k = qn.lastIndexOf('.');
		String pn = qn.substring(0, k);
		String un = qn.substring(k + 1);
		gen.fmt.print("#ifndef %1\n", gs);
		gen.fmt.print("#define %1\n", gs);
		gen.fmt.print("#include \"../../%1/%2/%2.h\"\n", pn, un);
		gen.fmt.print("#endif\n\n");
	}

	void genLocals(List<DeclNode.Var> localVars) {
		// locals are first declared without initializers.
		// later on they are initialized with assign statements.
		for (DeclNode.Var var : localVars) {
			if (isHost()) {
				gen.fmt.print("%tvar %1", var.getName());
				if (var.getInit() == null) {
					gen.fmt.print(" = ");
					genDefault(var.getTypeCat(), var, DEFAULT_INNEW);
				}
				gen.fmt.print(";\n");
			} else {
				// in c, 'int arr[2] = {1,2};' cannot be split into 2 statements.
				// Special case to prevent that splitting.
				if (!(var instanceof DeclNode.Arr && ((DeclNode.Arr) var).getInit() != null)) {
					gen.fmt.print("%t");
					TypeNode t = var instanceof DeclNode.Arr ? ((DeclNode.Arr) var)
							.getTypeArr() : var.getTypeSpec();
					genTypeWithVarName(t, "" + var.getName());
					gen.fmt.print(";\n");
				}
			}
		}
	}

	void genStmt(StmtNode stmt) {
		switch (stmt.getType()) {
		case pollenParser.S_ASSIGN:
			genStmt$Assign((StmtNode.Assign) stmt);
			break;
		case pollenParser.S_EXPR:
			ExprNode c = ((StmtNode.Expr) stmt).getExpr();
			genExpr2(c, c.getType());
			gen.fmt.print(";");
//			if (((StmtNode.Expr) stmt).getExpr() instanceof ExprNode.Call) {
//				ExprNode c = ((StmtNode.Expr) stmt).getExpr();
//				genExpr$Call((ExprNode.Call) c);
//				gen.fmt.print(";");
//			}
			break;
		case pollenParser.S_BIND:
			genStmt$Bind((Bind) stmt);
			break;
		case pollenParser.S_BLOCK:
			genStmt$Block((StmtNode.Block) stmt);
			break;
		case pollenParser.S_BREAK:
			genStmt$Break((StmtNode.Break) stmt);
			break;
		case pollenParser.S_CASE:
			genStmt$Case((StmtNode.Case) stmt);
			break;
		case pollenParser.S_DECL:
			genStmt$Decl((StmtNode.Decl) stmt);
			break;
		case pollenParser.S_FOR:
			genStmt$For((StmtNode.For) stmt);
			break;
		case pollenParser.S_IF:
			genStmt$If((StmtNode.If) stmt);
			break;
		case pollenParser.S_INJ:
			StmtNode.Inject s = (StmtNode.Inject) stmt;
			genExpr$Inject(s.getExpr());
			gen.fmt.print(";\n");
			break;
		case pollenParser.S_PRINT:
			genStmt$Print((StmtNode.Print) stmt);
			break;
		case pollenParser.S_PROVIDED:
			genStmt$Provided((StmtNode.Provided) stmt);
			break;
		case pollenParser.S_RETURN:
			genStmt$Return((StmtNode.Return) stmt);
			break;
		case pollenParser.S_SWITCH:
			genStmt$Switch((StmtNode.Switch) stmt);
			break;
		case pollenParser.S_WHILE:
			genStmt$While((StmtNode.While) stmt);
			break;
		}
	}

	/**
	 * Eval the provided expression and generate either the if or the else
	 * block.
	 * 
	 * @param stmt
	 */
	private void genStmt$Provided(Provided stmt) {
		if (!(stmt.getCond() instanceof ExprNode.Binary)) {
			ParseUnit.current().reportError(stmt,
					"\'provided\' statement supports a binary expression");
			return;
		}
		ExprNode.Binary e = (ExprNode.Binary) stmt.getCond();

		ExprNode.Ident id = (Ident) (e.getLeft() instanceof ExprNode.Ident ? e
				.getLeft() : e.getRight() instanceof ExprNode.Ident ? e
				.getRight() : null);
		ExprNode.Const c = (Const) (e.getLeft() instanceof ExprNode.Const ? e
				.getLeft() : e.getRight() instanceof ExprNode.Const ? e
				.getRight() : null);
		if (id == null || c == null) {
			ParseUnit
					.current()
					.reportError(
							stmt,
							"\'provided\' expression supports comparing a constant literal to a meta identifier");
			return;
		}
		SymbolEntry s = id.getSymbol();
		if (s.node() instanceof ImportNode) {
			ImportNode i = (ImportNode) s.node();
			// type parameter
			String typeName = i.getUnitName().getText();
			if (!c.getLitFlags().contains(LitFlags.STR)) {
				ParseUnit
						.current()
						.reportError(
								stmt,
								"the type name in the \'provided\' statement must be compared with a string constant");
				return;
			}
			String value = c.getValue().getText().replaceAll("^\"|\"$", "");

			if (e.getOp().getType() == pollenParser.EQ
					&& typeName.equals(value)) {
				genStmt(stmt.getIfBody());
			} else
				genStmt(stmt.getElseBody());
		} else {
			if (!(s.node() instanceof DeclNode.Formal)) {
				ParseUnit
						.current()
						.reportError(stmt,
								"the \'provided\' statement requires meta parameters in the expression");
				return;
			}
			// value parameter
			if ((((DeclNode.Formal) s.node()).getInit() == null)) {
				ParseUnit
						.current()
						.reportError(
								stmt,
								"meta parameter "
										+ s.node().getName().getText()
										+ " has not been initialized: instantation incomplete");
				return;
			}
			ExprNode.Const init = (Const) ((((DeclNode.Formal) s.node())
					.getInit()) instanceof ExprNode.Const ? (((DeclNode.Formal) s
					.node()).getInit())
					: null);
			if (init == null) {
				ParseUnit
						.current()
						.reportError(
								stmt,
								"\'provided\' expression supports comparing a constant literal to a meta identifier");
				return;
			}

			Cat.Scalar cc = (Cat.Scalar) c.getCat();
			Cat.Scalar ic = (Cat.Scalar) init.getCat();
			if (cc.kind() != ic.kind()) {
				ParseUnit
						.current()
						.reportError(stmt,
								"meta actual and formal parameters have inconsistent types");
				return;
			} else {
				if (cc.kind() == 'b') {
					if (c.getValue().getText()
							.equals(init.getValue().getText())) {
						genStmt(stmt.getIfBody());
					} else {
						genStmt(stmt.getElseBody());
					}
				} else if (c.getLitFlags().contains(LitFlags.NUM)) {
					int l, r;
					if (id == e.getLeft()) {
						l = Integer.parseInt(init.getValue().getText());
						r = Integer.parseInt(c.getValue().getText());
					} else {
						r = Integer.parseInt(init.getValue().getText());
						l = Integer.parseInt(c.getValue().getText());
					}
					boolean doIfBlock;
					switch (e.getOp().getType()) {
					case pollenParser.EQ:
						doIfBlock = (l == r);
						break;
					case pollenParser.GT_EQ:
						doIfBlock = (l >= r);
						break;
					case pollenParser.NOT_EQ:
						doIfBlock = (l != r);
						break;
					case pollenParser.LT_EQ:
						doIfBlock = (l <= r);
						break;
					case pollenParser.GT:
						doIfBlock = (l > r);
						break;
					case pollenParser.LT:
						doIfBlock = (l < r);
						break;
					default: {
						ParseUnit.current().reportError(stmt,
								"Invalid expression in provided statement");
						return;
					}
					}
					if (doIfBlock) {
						genStmt(stmt.getIfBody());
					} else {
						genStmt(stmt.getElseBody());
					}
				}
			}

		}
	}

	private void genStmt$Assign(StmtNode.Assign stmt) {
		genExpr(stmt.getExpr());
		gen.fmt.print(";");
	}

	private void genStmt$Block(StmtNode.Block stmt) {
		gen.fmt.print("{\n%+");
		for (StmtNode s : stmt.getStmts()) {
			gen.fmt.print("%t");
			genStmt(s);
			gen.fmt.print("\n");
		}
		gen.fmt.print("%-%t}");
	}

	private void genStmt$Break(StmtNode.Break stmt) {
		gen.fmt.print("%1;", "break");
	}

	private void genStmt$Continue(StmtNode.Continue stmt) {
		gen.fmt.print("%1;", "continue");
	}

	private void genStmt$Case(StmtNode.Case stmt) {
		gen.fmt.print("%t");
		if (stmt.getCase() != null) {
			gen.fmt.print("case ");
			genExpr(stmt.getCase());
		} else {
			gen.fmt.print("default");
		}
		gen.fmt.print(":\n%+");
		for (StmtNode s : stmt.getBody()) {
			gen.fmt.print("%t");
			genStmt(s);
			gen.fmt.print("\n");
		}
		gen.fmt.print("%-");
	}

	private void genStmt$Decl(StmtNode.Decl stmt) {
		
		for (DeclNode.Var decl : stmt.getVars()) {
			
			boolean arrayInit = decl instanceof DeclNode.Arr && ((DeclNode.Arr) decl).getInit() != null;
			boolean arrayNoDim = arrayInit && !((DeclNode.Arr) decl).hasDim(); // e.g. uint8 arr[] = fcnReturningArray();
			if (decl.getInit() != null) {
				if (isHost() || !arrayInit) {
					gen.fmt.print("%1 = ", decl.getName());
					genExpr(decl.getInit());
					gen.fmt.print(";");
				}
				else { // target array initialization
					if (arrayNoDim) {
						// declare as ptr and index like array						
						TypeNode t = ((DeclNode.Arr) decl).getTypeArr().getBase();
						genTypeWithVarName(t, "* " + decl.getName());
					}
					else  {
						// in c, 'int arr[2] = {1,2};' cannot be split into 2 statements.
						// Special case to prevent that splitting.
						TypeNode t = ((DeclNode.Arr) decl).getTypeArr();
						genTypeWithVarName(t, "" + decl.getName());

					}
					gen.fmt.print(" = ");
					genExpr(decl.getInit());
					gen.fmt.print(";");
				}
			} else {
				gen.fmt.print("", decl.getName());
			}
		}
	}

	private void genStmt$For(StmtNode.For stmt) {
		gen.fmt.print("for (");
		if (stmt.getInit() != null) {
			genStmt(stmt.getInit());
		} else {
			gen.fmt.print(";");
		}
		if (stmt.getCond() != null) {
			gen.fmt.print(" ");
			genExpr(stmt.getCond());
		}
		gen.fmt.print(";");
		if (stmt.getNext() != null) {
			gen.fmt.print(" ");
			genExpr(stmt.getNext());
		}
		gen.fmt.print(") ");
		genStmt(stmt.getBody());
	}

	private void genStmt$If(StmtNode.If stmt) {
		gen.fmt.print("if (");
		genExpr(stmt.getCond());
		gen.fmt.print(") ");
		genStmt(stmt.getIfBody());
		for (StmtNode.Elif sElif : stmt.getElifs()) {
			gen.fmt.print("\n%telse if (");
			genExpr(sElif.getCond());
			gen.fmt.print(") ");
			genStmt(sElif.getBody());
		}
		StmtNode sElse = stmt.getElseBody();
		if (sElse == null) {
			return;
		}
		gen.fmt.print("\n%telse ");
		genStmt(sElse);
	}

	private void genStmt$Print(StmtNode.Print stmt) {
		if (isHost()) {
			gen.fmt.print("$$printf(");
			String sep = "";
			for (ExprNode expr : stmt.getArgs()) {
				gen.fmt.print(sep);
				gen.aux.genExpr(expr);
				sep = ", ";
			}
			gen.fmt.print(");");
		} else {
			
			String cat = "";
			for (ExprNode expr : stmt.getArgs()) {
				switch (expr.getType()) {
				case pollenParser.E_IDENT:
					ExprNode.Ident ei = (Ident) expr;
					cat = new Character(ei.getCat().code().charAt(0)).toString();
					break;
				case pollenParser.E_CONST:
					ExprNode.Const ec = (Const) expr;
					cat = new Character(ec.getCat().code().charAt(0)).toString();
					break;
				default:
					continue;
				}	
				switch (cat.charAt(0)) {
				case 'b':
					gen.fmt.print("%1pollen_print_bool(", gen.uname_target());
					gen.aux.genExpr(expr);
					gen.fmt.print(");");

					break;
				case 'i':
					gen.fmt.print("%1pollen_print_int((int32)", gen.uname_target());
					gen.aux.genExpr(expr);
					gen.fmt.print(");");
					break;
				case 'u':
					gen.fmt.print("%1pollen_print_uint((uint32)", gen.uname_target());
					gen.aux.genExpr(expr);
					gen.fmt.print(");");
					break;
				case 's':
					gen.fmt.print("%1pollen_print_str((string)", gen.uname_target());
					gen.aux.genExpr(expr);
					gen.fmt.print(");");
					break;
				case 'x': case 'X': case 'C':
					//	  printfcn = (void**)&vals[i]; /* init print function ptr */
					//	  (*printfcn)();
					break;
				}   
			}

		}
	}

	private void genStmt$Return(StmtNode.Return stmt) {
		gen.fmt.print("return");
		ExprNode.Vec expr = stmt.getVec();
		String addrOf = "";
		Tree body = stmt.getParent();
		while (body != null && !(body instanceof BodyNode)) {
			body = body.getParent();
		}
		if (body instanceof BodyNode) {			
			TypeNode t = ((BodyNode) body).getFcn().getTypeSpec();
			if (t instanceof TypeNode.Usr) {
				ExprNode.Ident ei = (Ident) ((expr.getVals().get(0)) instanceof ExprNode.Ident ? (expr.getVals().get(0)) : null);
				SymbolEntry se;
				if (ei != null) {
					se = ei.getSymbol();
					addrOf = se != null && !(se.node() instanceof DeclNode.TypedMember) && !isHost() ? " &" : "";
				}
				
				se = ((TypeNode.Usr)t).getSymbol();
				ISymbolNode node = se != null ? se.node() : null;
				if (node != null) {
					//addrOf = " &";
					if (node instanceof ImportNode && ((ImportNode)node).isTypeMetaArgPrimitive())
						addrOf = "";
				}	
			}
		}
		if (expr != null) {
			gen.fmt.print(addrOf + "( ");
			this.genExpr$Vec(expr, false);
			gen.fmt.print(" )");
		}
		gen.fmt.print(";");
	}

	private void genStmt$Switch(StmtNode.Switch stmt) {
		gen.fmt.print("switch (");
		genExpr(stmt.getSwitch());
		gen.fmt.print(") {\n");
		for (StmtNode.Case cs : stmt.getCases()) {
			genStmt$Case(cs);
		}
		if (stmt.getDefault() != null) {
			genStmt$Case(stmt.getDefault());
		}
		gen.fmt.print("%t}");
	}

	private void genStmt$While(StmtNode.While stmt) {
		if (stmt.isDo()) {
			gen.fmt.print("do ");
			genStmt(stmt.getBody());
			gen.fmt.print(" while (");
			genExpr(stmt.getCond());
			gen.fmt.print(");\n");
		} else {
			gen.fmt.print("while (");
			genExpr(stmt.getCond());
			gen.fmt.print(") ");
			genStmt(stmt.getBody());
		}
	}

	void genTitle(String msg) {
		if (this.curSkip) {
			gen.fmt.print("\n");
		}
		gen.fmt.print("\n/*\n * ======== %1 ========\n */\n\n", msg);
		curSkip = false;
	}

	/**
	 * Enter here for print of type AND var name (if passed).
	 * 
	 * @param type
	 * @param name
	 *            e.g. Argtype argName
	 */
	void genTypeWithVarName(TypeNode type, String name) {
		
		gen.fmt.print("%1", genVarTypeVarName(type, name));
	}

	void genType(TypeNode type, String dtor, int arrSize) {
		//int oldArrSize = curArrSize;
		//curArrSize = arrSize;
		arrSizes.push(arrSize);
		genTypeWithVarName(type, dtor);
		arrSizes.pop();
		//curArrSize = oldArrSize;
	}

	/**
	 * @param type
	 * @param name printed if passed
	 * @return
	 */
	private String genVarTypeVarName(TypeNode type, String name) {

		String oldTypeString = curTypeString;
		curTypeString = (name == null) ? "" : name;
		TypeNode t = type;
		boolean done = false;
		do {
			switch (t.getType()) {
			case pollenParser.T_ARR:
				TypeNode.Arr tarr = (TypeNode.Arr) t;
				// TODO
				/*
				 * if (tarr.isDesc() && curArrSize == 0) { curTypeString =
				 * "__ArrDesc__ " + curTypeString; done = true; break; }
				 */
				genType$Arr((TypeNode.Arr) t);
				Tree tr = tarr.getParent();
				while (tr != null && !(tr instanceof DeclNode.FcnTyp))
					tr = tr.getParent();
				if (tr instanceof DeclNode.FcnTyp)
					curTypeString = "* " + curTypeString;
					
				break;
			case pollenParser.T_FCN:
				genType$Fcn((TypeNode.Fcn) t);
				break;
			case pollenParser.T_STD:
				genType$Std((TypeNode.Std) t);
				break;
			case pollenParser.T_USR:
//				if (type.getParent() instanceof DeclNode.TypedMember
//						&& (((DeclNode.TypedMember) type.getParent())
//								.isFcnRef())) {
//					genType$FcnRef((Usr) type, name);
//					break;
//				}
				if (((TypeNode.Usr)t).isFunctionRef()) {
					// note curTypeString is NOT just type but fcn name, sigh...
					curTypeString = mkCname((TypeNode.Usr)t) + " " + curTypeString;
					//curTypeString = ((TypeNode.Usr)t).getName().getText().replace('.', '_') + " " + curTypeString;
				}
				else
					genType$Usr((TypeNode.Usr) t);
				break;
			}
		} while (!done && (t = t.getBase()) != null);
		String res = curTypeString;
		curTypeString = oldTypeString;
		return res;
	}

	void genType$Arr(TypeNode.Arr type) {

		if (arrSizes.peek() > 0) {
			curTypeString += "[";
			curTypeString += arrSizes.peek();
			curTypeString += "]";
		} else if (type.hasDim()) {
			for (ExprNode e : type.getDim().getElems()) {
				curTypeString += "[";
				gen.fmt.mark();
				genExpr(e);
				curTypeString += gen.fmt.release();
				curTypeString += "]";
			}
		}
		arrSizes.pop();
		arrSizes.push(0);
	}

	void genType$Fcn(Fcn type) {
		curTypeString = "(*" + curTypeString + ")(";
		String sep = "";
		for (TypeNode argT : type.getArgs()) {
			curTypeString += sep;
			sep = ",";
			curTypeString += genVarTypeVarName(argT, null);
		}
		curTypeString += ")";
	}

	/**
	 * This is called to generate the declaration and to create the typedef.
	 * @param type
	 * @param name
	 * @param forTypedef TODO
	 * @return
	 */
	String genType$FcnRef(TypeNode.Usr type, String name, boolean forTypedef) {
		SymbolEntry s = type.getSymbol();
		String typeString = "";

		if (forTypedef) {
			TypeNode t = ((DeclNode.Fcn) s.node()).getTypeSpec();
			String rtn = t instanceof TypeNode.Std ? ((TypeNode.Std) t)
					.getIdent().getText()
					: t instanceof TypeNode.Usr ? ((TypeNode.Usr) t).getName()
							.getText() : "/* ?? unknown return type ?? */";
			typeString = rtn + " (*" + name + ")(";
			String sep = "";
			for (DeclNode.Formal arg : ((DeclNode.Fcn) s.node()).getFormals()) {
				typeString += sep;
				sep = ",";
				if (arg.getTypeCat() instanceof Cat.Scalar) 
					typeString += ((Cat.Scalar) arg.getTypeCat()).mkType(); 
				else
					typeString += "void*"; // can we do better?
			}
			typeString += ")";
			return typeString;
		}
		return name;

	}

	void genType$Std(TypeNode.Std type) {
		String sp = " ";
		curTypeString = mkTypeMods(type.getModifiers()) + type.getIdent() + sp
		+ curTypeString;
	}

	void genType$Usr(TypeNode.Usr type) {
		String sp = " ";
		String t = mkCname(type);

		curTypeString = mkTypeMods(type.getModifiers()) + t + sp
				+ curTypeString;
	}

	String mkCname(IScope scope) {
		String cn = "";
		if (scope instanceof ImportNode) {
			return ((ImportNode) scope).getUnit().getQualName().replace('.', '_')  + '_';
		}
		if (scope == gen.curUnit()) {
			return( gen.curUnit().getQualName().replace('.', '_') + '_');
		}
		else if (scope instanceof DeclNode.Usr) {
			return ((DeclNode.Usr) scope).getUnitQualName().replace('.', '_') + '_';
		}
		else if (scope instanceof UnitNode) {
			UnitNode u = (UnitNode) scope;
			cn = u.isProtocol() ? gen.uname_target() : (u.getQualName().replace('.',
					'_') + '_');
		} else if (scope instanceof DeclNode.TypedMember) {
			DeclNode.TypedMember prx = (DeclNode.TypedMember) scope;
			cn = mkCname(prx.getDefiningScope())
					+ ((DeclNode.TypedMember) scope).getName() + '_';
		}

		return cn;
	}
	
	String mkJSname(TypeNode t) {
		String rtn = "";
		if (t instanceof TypeNode.Std)
			return ((TypeNode.Std) t).getIdent().getText();

		if (t instanceof TypeNode.Usr) {
			SymbolEntry s = ((Usr) t).getSymbol();

			if (s != null && s.node() != null) {
				if (s.node() instanceof ImportNode) {
					ImportNode i = (ImportNode) s.node();
					if (i.getUnit() != null)
						rtn = i.getUnit().getQualName();
					return rtn;
				}
			}
		}
		return ("/* ?? unknown type ?? */");
		
	}
	/**
	 * An attempt to make name construction more generic. Extracted from Expr$Ident.
	 * Handles module scoped names, not function variables. 
	 * Should handle host, target, cross scope, nested.
	 * @param sym
	 * @param cat
	 * @param name
	 * @return true if a name output. (false for function variables).
	 */
	public boolean mkModName(SymbolEntry sym, Cat cat, String name) {
		ISymbolNode snode = sym.node();
		IScope scope = sym.scope();

		String qs = "";
		boolean externScope = scope instanceof UnitNode
				|| scope instanceof DeclNode.Usr;
		if (scope instanceof DeclNode.Usr) {
			scope = scope.getEnclosingScope();
		}

		if (!(externScope)) {
			gen.fmt.print(name);
			return true;
		}

		if (snode instanceof ImportNode) {
			String qn = ((ImportNode) snode).getUnit().getQualName();
			if (isHost()) {
				gen.fmt.print("$units['%1']", qn);
			} else {
				gen.fmt.print("%2%1%2", qn.replace('.', '_'), qs);
			}
			return true;
		}

		if (snode == gen.curUnit()) {
			if (isHost()) {
				gen.fmt.print(gen.uname());
			} else {
				gen.fmt.print("%2%1%2", gen.curUnit().getQualName().replace(
						'.', '_'), qs);
			}
			return true;
		}

		String qn = (scope instanceof UnitNode ? ((UnitNode) scope)
				.getQualName()
				: (scope instanceof DeclNode.Usr) ? ((DeclNode.Usr) scope)
						.getUnitQualName() : "/* ?? unknown module qualifier ?? */");
		if (isHost()) {
			if (scope == gen.curUnit()) {
				gen.fmt.print("%1.%2", gen.uname(), name);
			} else {
				gen.fmt.print("$units['%1'].%2", qn, name);
			}
		} else {
			// local (function scope) names not printed here
			
		}
		return false;

	}
	
	String mkCname(UnitNode u) {
		String uname = u.getName().getText();
		String  cname = u.getPkgName().getText().replace('.', '_') + '_'  + uname + '_';	
		return cname;
	}

	String mkCname(TypeNode t) {
		String lastChar = "_"; // TODO get rid of this when I change name printing!

		String n = "";
		if (t.getParent() instanceof DeclNode) {
			n = ((DeclNode)t.getParent()).getName().getText();
			if (((DeclNode)t.getParent()).isHostClassRef()) {
				// this changes the defines so that it is not a ptr deref (sigh...)
				lastChar = "";
			}								
		}
		if (t.getParent() instanceof TypeNode.Arr && t.getParent().getParent() instanceof DeclNode.Arr) {
			DeclNode.Arr a = (Arr) t.getParent().getParent();
			n = a.getName().getText();
			if (a.isHost())
				lastChar = "";
		}
		//System.out.println(n);


		if (t instanceof TypeNode.Std)
			return ((TypeNode.Std) t).getIdent().getText();

		if (t instanceof TypeNode.Usr) {
			SymbolEntry s = ((Usr) t).getSymbol();

			if (s != null && s.node() != null) {
				if (s.node() instanceof ImportNode) {
					ImportNode i = (ImportNode) s.node();
					String qualifier = "";
					if (i.getUnit() == null) {
						if (i.isTypeMetaArg())
							qualifier = i.getUnitName().getText();
						else
							qualifier = Cat.Scalar
									.codeFromString(((ImportNode) s.node())
											.getUnitName().getText());
					}  else {						

						if (i.getUnit().isComposition()) {
							// if the import is a composition, resolve down to the imported module.
							UnitNode u = i.getUnit();
							SymbolEntry se = u.lookupName(i.getUnitName().getText());
							if (se.node() instanceof ImportNode)
								qualifier = ((ImportNode) se.node()).getQualName().replace(".", "_")
								+ "_";
						}
						else {
							qualifier = i.getUnit()
							.getQualName().replace(".", "_")
							+ lastChar;

						}						
					}
					return qualifier; 
				} else {
					if (s.node() instanceof DeclNode.Usr) {
						if (s.scope() instanceof DeclNode.Usr) // nested
							return gen.uname_target()
							+ ((DeclNode.Usr) s.node()).getName().getText() + lastChar;
						else
							return gen.uname_target();
								
					}
					else
						return (gen.uname_target() + ((Usr) t).getName().getText()).replace('.', '_');
				}
			}
		}
		return "/* ?? unknown symbol ?? */";
	}

	/**
	 * Not host, not lval, not import, not unit.
	 * 
	 * @param e
	 * @return
	 */
	String mkCname(ExprNode.Ident e) {
		String rtn = e.getName().getText();

		if (isHost())
			return rtn;
		if (e.getSymbol().node() instanceof ImportNode
				|| e.getSymbol().node() instanceof UnitNode)
			return rtn;
		
		SymbolEntry s = e.getSymbol();
		ISymbolNode n = s != null ? s.node() : null;
		if (n != null && n instanceof DeclNode.Fcn)
			rtn = ((DeclNode.Fcn)n).cname();
		
		if (rtn.indexOf(".") == -1) {
			return rtn;
		}

		SymbolEntry qs = e.getQualifier();
		String qual = rtn.substring(0, rtn.indexOf("."));
		// SymbolEntry qs = gen.curUnit().lookupName(qual);
		if (qs != null) {
			if (qs.node() instanceof ImportNode) {
				if (((ImportNode) qs.node()).isTypeMetaArg()) {
					// first qualifier is spurious
					return rtn.substring(rtn.indexOf(".") + 1);
				}
				if (((ImportNode) qs.node()).getName().getText().equals(qual)) {
					// first qualifier is spurious
					return rtn.substring(rtn.indexOf(".") + 1);
				}
			}
			if (qs.node() instanceof DeclNode.TypedMember) {
				if (((DeclNode.TypedMember) qs.node()).isProtocolMember()) {
					// the protocol member name is an alias for the module name
					return rtn.substring(rtn.indexOf(".") + 1);
				}
			}
		}

		return rtn.replace('.', '_');
	}


	String mkPollenCname(String id) {
		return id.startsWith("pollen.") ? ("pollen__" + id.substring(ParseUnit.INTRINSIC_PREFIX
				.length())) : id;
	}

	String mkQname(SymbolEntry sym) {
		return mkQname(sym.scope(), sym.node());
	}

	String mkQname(IScope scope, ISymbolNode snode) {
		// NOTE the unit node name is javascript only!
		String qn = gen.uname();
		boolean dbg = false;

		if (scope instanceof DeclNode.Fcn) {
			scope = ((DeclNode.Fcn)scope).getUnit().getUnitType();
		}
		else if (scope instanceof StmtNode.Block) {
			while (scope != null) {
				scope = scope.getEnclosingScope();
				if (scope instanceof DeclNode.Usr)
					break;
			}
		}

		if (snode instanceof DeclNode.Formal)
			return ((DeclNode.Formal) snode).getName().getText();

		if (scope != gen.curUnit()) {
			if (scope instanceof UnitNode) {
				if (this.isHost())
					qn = "$units['" + ((UnitNode) scope).getQualName() + "']";
				else
					qn = ((UnitNode) scope).getQualName();
			} else if (scope instanceof DeclNode.TypedMember) {
				qn += "." + ((DeclNode.TypedMember) scope).getName();
			}
			else if (snode instanceof DeclNode && ((DeclNode)snode).isClassRef()) {
				
				if (snode.getDefiningScope() instanceof StmtNode.Block && snode instanceof DeclNode.TypedMember)
					return snode.getName().getText();

				if (scope instanceof UnitNode)	
					scope = ((DeclNode) snode).getUnit();					

				qn = (scope instanceof DeclNode.Usr) ? ((DeclNode.Usr) scope)
								.getUnitQualName() 
								: "/* ?? scope unknown ?? */";
				String rtn = snode.getName().getText().replace('.', '_');
				rtn = qn.replace('.', '_') + "_" + rtn + mkSuf(snode);
				return rtn;
				
			}

		}
		qn += "." + snode.getName();
		return qn;
	}

	String mkSuf(ISymbolNode sym) {

		// TODO
		// is this needed? it makes the code harder to read
		if (sym instanceof DeclNode.Fcn) {
			return ((DeclNode.Fcn) sym).isPublic() ? "__E" : "__I";
		} else if (sym.getTypeCat().isVector()) {
			return "__A";
		} else if (sym instanceof DeclNode.Var) {
			return "__V";
		} else {
			return "";
		}
	}

	String mkTypeMods(EnumSet<Flags> tmods) {
		String res = "";

		if (tmods.isEmpty()) {
			return res;
		}
		if (tmods.contains(Flags.CONST)) {
			res += "const ";
		}
		if (tmods.contains(Flags.VOLATILE)) {
			res += "volatile ";
		}
		return res;
	}

	void setHost(boolean ishost) {
		this.isHost = ishost;
	}

	boolean isDerefExpr(ExprNode e) {
		if (e.getParent() instanceof ExprNode.Call) {
			if (e.childIndex > 1) // name, args, deref
				return true;
		}
		if (e.getParent() instanceof ExprNode.Ident) {
			if (e.childIndex > 0)
				return true;
		}
		return false;
	}

	public boolean isHost() {
		return isHost;
	}

	void skip() {
		curSkip = true;
	}

}
