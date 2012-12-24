package com.amaret.pollen.translator;

import java.util.EnumSet;
import java.util.List;

import com.amaret.pollen.parser.BaseNode;
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
import com.amaret.pollen.parser.Cat.Arr;
import com.amaret.pollen.parser.DeclNode.Formal;
import com.amaret.pollen.parser.DeclNode.TypedMember;
import com.amaret.pollen.parser.ExprNode.Const;
import com.amaret.pollen.parser.ExprNode.Ident;
import com.amaret.pollen.parser.ExprNode.Quest;
import com.amaret.pollen.parser.StmtNode.Bind;
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

	private int curArrSize;
	private boolean curSkip;
	private String curTypeString;
	private Generator gen;
	private boolean isLval;
	private boolean isHost;
	Auxiliary(Generator gen) {
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
        if ((tc.startsWith("C") || tc.startsWith("X")) && ((Cat.Agg) cat).isStaticRef()) {
            Cat.Agg aggCat = (Cat.Agg) cat;
            ISymbolNode is = (DeclNode) aggCat.aggScope();
            IScope defScope = aggCat.defScope();
            if (aggCat.isStaticRef()) {
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
                gen.fmt.print("('%1')", gen.cname() + ts.getName() + gen.aux.mkSuf((ISymbolNode)ts));
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
			if (tarr.hasDim()) {
				gen.aux.genExpr(tarr.getFirstDim());
			} else {
				gen.fmt.print("-1");
			}
			gen.fmt.print(", function($$cn,$$idx){return ");
			genDefault(arrCat.getBase(), null, DEFAULT_INARR);
			gen.fmt.print(";}, ");

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
				gen.fmt.print("'%1__A', %2", gen.cname() + ts.getName(),aggFlg);
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
			gen.fmt.print("??");
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

	void genExprPost(ExprNode expr) {
		if (expr.getChildCount() > 1) {
			for (int i = 1; i < expr.getChildCount(); i++) {
				BaseNode b = (BaseNode) expr.getChild(i);
				if (b instanceof ExprNode) {
					ExprNode e = (ExprNode) b;
					int eType = e.getType();
					switch (eType) {
					case pollenParser.E_INDEX:
						if (!isHost)
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

		if (expr.isAssign() && isHost && expr.hasLeftIndexExpr()) {
			ExprNode.Index idxExpr = expr.getLeftIndexExpr();
			genExpr(idxExpr.getBase());
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

		if (op.equals("=") && right instanceof ExprNode.AggVal) {
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
				genType(rightCat.getType().getBase(), null);
				gen.fmt.print("))");
				return;
			}
		}

		genExpr(left);
		gen.fmt.print(" %1 ", op);
		genExpr(right);
	}

	void genLvalExpr(ExprNode expr) {
		// currently unused in new pollen - if 
		// it turns out never needed, delete isLval
		// (used in Em in genExpr$Addr())
		isLval = true;
		genExpr(expr);
		isLval = false;
	}

	private void genExpr$Call(ExprNode.Call expr) {

		Cat cat = expr.getName().getCat();
		Cat.Fcn fcncat = cat instanceof Cat.Fcn ? (Cat.Fcn) cat : null;
		
		if (expr.getName() instanceof ExprNode.Ident) {
			boolean dbg = false;
			String s = ((ExprNode.Ident)expr.getName()).getName().getText();
			if (s.equals("cycle"))
				dbg = true;
		}
		
		genExpr(expr.getName());
		String sep = "";
		gen.fmt.print("(");
		int argc = 0;

		if (expr.isThisPtr() && expr.getCaller() != null) {
			gen.fmt.print(sep);
			sep = ", ";
			gen.fmt.print(mkQname(expr.getCaller()));
			++argc;
		}

		for (ExprNode e : expr.getArgs()) {
			gen.fmt.print(sep);
			sep = ", ";
			genExpr(e);
			++argc;
		}
		// TODO more robust sig matching

		if (fcncat != null && argc < fcncat.maxArgc()) {
			List<DeclNode.Formal> args = fcncat.fcnD().getFormals();
			while (argc < fcncat.maxArgc()) {
				gen.fmt.print(sep);
				sep = ", ";
				genExpr(args.get(argc).getInit());
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
		if (!isHost && vs.startsWith("\"")) {
			int id = gen.curUnit().findString(vs);
			if (id == -1) {
				gen.fmt.print("%1", vs);
			} else {
				gen.fmt.print("%1_s__%2", gen.cname(), id);
			}
		} else if (isLval && vs.equals("this")) {
			gen.fmt.print("this.$$cname");
		} else {
			gen.fmt.print("%1", vs);
		}
	}

	private void genExpr$Inject(ExprNode.Inject expr) { 
		
		if (gen.curUnit().getUnitType().getMetaFormals() != null) {

			// String meta value parameters: the quotes are stripped and the value
			// is injected into c as a (c) SYMBOL (which is assumed to have been defined).
			
			SymbolEntry sym = gen.curUnit().getUnitType().lookupName(expr.getName().getText());
			ISymbolNode snode = sym != null ? sym.node() : null;
			if (snode instanceof DeclNode.Formal) {
				DeclNode.Formal f = (Formal) snode;
				Cat cat = Cat.fromType(f.getTypeSpec());
				if (f.isMetaArg()
						&& cat.code().equals("s") 
						&& f.getName().getText().equals(expr.getName().getText())) {
					if (f.getInit() instanceof ExprNode.Const) {
						String injectVal = ((ExprNode.Const) f.getInit()).getValue().getText();
						injectVal = injectVal.replaceAll("^\"|\"$", "");
						injectVal = injectVal.replaceAll("^\'|\'$", "");
						gen.fmt.print(injectVal + "\n");
						return; // done
					}
				}
			}
		}
			
		gen.fmt.print(expr.getName());
		gen.fmt.print("\n");
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

		SymbolEntry sym = expr.getSymbol();
		if (sym == null) {
			gen.fmt.print(expr.getName() + " /* ?? missing symbol ?? */ ");
			return;
		}

		ISymbolNode snode = sym.node();
		IScope scope = sym.scope();

		String qs = isLval ? "'" : "";
		boolean externScope = scope instanceof UnitNode
				|| scope instanceof DeclNode.Usr;
		if (scope instanceof DeclNode.Usr) {
			scope = scope.getEnclosingScope();
		}

		if (!(externScope)) {
			if (isLval) {
				if (expr.getCat().isAggArr()) {
					gen.fmt.print("%1.$$cname", expr.getName());
					return;
				}
			}
			gen.fmt.print(expr.getName());
			return;
		}

		if (snode instanceof ImportNode) {
			String qn = ((ImportNode) snode).getUnit().getQualName();
			if (isHost && !isLval) {
				gen.fmt.print("$units['%1']", qn);
			} else {
				gen.fmt.print("%2%1%2", qn.replace('.', '_'), qs);
			}
			return;
		}

		if (snode == gen.curUnit()) {
			if (isHost && !isLval) {
				gen.fmt.print(gen.uname());
			} else {
				gen.fmt.print("%2%1%2", gen.curUnit().getQualName().replace(
						'.', '_'), qs);
			}
			return;
		}

		String qn = (scope instanceof UnitNode ? ((UnitNode) scope)
				.getQualName()
				: (scope instanceof DeclNode.Usr) ? ((DeclNode.Usr) scope)
						.getUnitQualName() : "??");
		if (isHost && !isLval) {
			if (scope == gen.curUnit()) {
				gen.fmt.print("%1.%2", gen.uname(), expr.getName());
			} else {
				gen.fmt.print("$units['%1'].%2", qn, expr.getName());
			}
		} else if (isLval && expr.getCat().isAggArr()) {
			if (scope == gen.curUnit()) {
				gen.fmt.print("%1.%2.$$cname", gen.uname(), expr.getName());
			} else {
				gen.fmt.print("$units['%1'].%2.$$cname", qn, expr.getName());
			}
		} else {
			// local (function scope)

			if (isDerefExpr(expr)) {
				gen.fmt.print(mkCname(expr));
				return;
			}

			if (expr.isThisPtr()) {
				gen.fmt.print("this->" + mkCname(expr));
				return;
			}

			gen.fmt.print("%4%1_%2%3%4", qn.replace('.', '_'), mkCname(expr),
					mkSuf(snode), qs);
		}
	}

	private void genExpr$Index(ExprNode.Index expr) {
		ExprNode base = expr.getBase();
		if (isLval) {
			genExpr(base);
			for (ExprNode e : expr.getIndexes()) {
				gen.fmt.print("+'['+");
				isLval = false;
				genExpr(e);
				isLval = true;
				gen.fmt.print("+']'");
			}
		} else if (isHost) {
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
		// TODO pollen ExprNode has Args.
		// This does not handle Args
		genDefault(expr.getCat(), null, DEFAULT_INNEW);
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
		if (typ == null) {
			gen.fmt.print("undefined");
		} else {
			String s = mkCname(typ);
			gen.fmt.print(s.substring(0, s.length()-1)); //(this.mkJSname(typ));
			//this.genType(typ, "");
			// genExpr(vexpr);
		}
		gen.fmt.print("\';\n%t");

		gen.fmt.print("var $$s = ");

		String uname = "$units[\'" + gen.jsname() + "\']"; 
		if (proMem instanceof ExprNode.Ident) {
			gen.fmt.print("$$bind(%1, '%2', $$v);", uname,
					((ExprNode.Ident) proMem).getName());
		}
		gen.fmt.print("if ($$v && $$v == $$s) $$v.pollen$used = true;");

	}

	private void genExpr$Size(ExprNode.Size expr) {
		switch (expr.getOp()) {
		case 's':
			if (isHost) {
				gen.fmt.print("%1", expr.getTypeSpec().getTypeInfo().size);
			} else {
				gen.fmt.print("sizeof(");
				genType(expr.getTypeSpec(), null);
				gen.fmt.print(")");
			}
			break;
		case 'a':
			if (isHost) {
				gen.fmt.print("%1", expr.getTypeSpec().getTypeInfo().align);
			} else {
				gen.fmt.print("offsetof (cls { char c; ");
				genType(expr.getTypeSpec(), "t");
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
		SymbolEntry s = expr.getSymbol();
		boolean isArrayInit = (s != null && s.node() != null
				&& s.node() instanceof DeclNode.Arr);
		String openBr = braces && isArrayInit && !isHost ? "{" : "[";
		String closBr = braces && isArrayInit && !isHost ? "}" : "]";

		List<ExprNode> vals = expr.getVals();
		if (newFlg && isHost) {

				gen.fmt.print("(");
				genDefault(expr.getCat(), null, DEFAULT_INNEW);
				gen.fmt.print(").$$assign");

		}

		if (newFlg && isHost) 
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
				genExpr(e);
			}
			gen.fmt.print(" ");
			if (braces)
				gen.fmt.print("%-" + closBr);
		}

		if (newFlg && isHost) {
			gen.fmt.print(")");
		}
	}

	void genFcnArgs(List<DeclNode.Formal> args, boolean typeFlg) {

		if (args.size() == 0) {
			gen.fmt.print("(%1)", "");
			return;
		}

		String sep = "";
		gen.fmt.print("( ");

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
					genType(arg.getTypeSpec(), "" + arg.getName());
			} else
				gen.fmt.print(arg.getName());
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
		for (DeclNode.Var var : localVars) {
			if (isHost) {
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
					genType(t, "" + var.getName());
					gen.fmt.print(";\n", var.getName());
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
		DeclNode.Var decl = stmt.getVar();
		boolean arrayInit = decl instanceof DeclNode.Arr && ((DeclNode.Arr) decl).getInit() != null;
		if (decl.getInit() != null) {
			if (isHost || !arrayInit) {
				gen.fmt.print("%1 = ", decl.getName());
				genExpr(decl.getInit());
				gen.fmt.print(";");
			}
			else {
				// in c, 'int arr[2] = {1,2};' cannot be split into 2 statements.
				// Special case to prevent that splitting.
				gen.fmt.print("%t");
				TypeNode t = ((DeclNode.Arr) decl).getTypeArr();
				genType(t, "" + decl.getName());
				gen.fmt.print(" = ");
				genExpr(decl.getInit());
				gen.fmt.print(";");
			}
		} else {
			gen.fmt.print("/* var %1 */", decl.getName());
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
		if (isHost) {
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
					gen.fmt.print("%1pollen_print_bool(", gen.cname());
					gen.aux.genExpr(expr);
					gen.fmt.print(");");

					break;
				case 'i':
					gen.fmt.print("%1pollen_print_int((int32)", gen.cname());
					gen.aux.genExpr(expr);
					gen.fmt.print(");");
					break;
				case 'u':
					gen.fmt.print("%1pollen_print_uint((uint32)", gen.cname());
					gen.aux.genExpr(expr);
					gen.fmt.print(");");
					break;
				case 's':
					gen.fmt.print("%1pollen_print_str((string)", gen.cname());
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
		if (expr != null) {
			gen.fmt.print("( ");
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
	 * Enter here for print of type.
	 * 
	 * @param type
	 * @param name
	 *            e.g. Argtype argName
	 */
	void genType(TypeNode type, String name) {

		gen.fmt.print("%1", genTypeString(type, name));
	}

	void genType(TypeNode type, String dtor, int arrSize) {
		int oldArrSize = curArrSize;
		curArrSize = arrSize;
		genType(type, dtor);
		curArrSize = oldArrSize;
	}

	private String genTypeString(TypeNode type, String name) {

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
				break;
			case pollenParser.T_FCN:
				genType$Fcn((TypeNode.Fcn) t);
				break;
			case pollenParser.T_STD:
				genType$Std((TypeNode.Std) t);
				break;
			case pollenParser.T_USR:
				if (type.getParent() instanceof DeclNode.TypedMember
						&& (((DeclNode.TypedMember) type.getParent())
								.isFcnRef())) {
					genType$FcnRef((Usr) type, name);
					break;
				}
				genType$Usr((TypeNode.Usr) t);
				break;
			}
		} while (!done && (t = t.getBase()) != null);
		String res = curTypeString;
		curTypeString = oldTypeString;
		return res;
	}

	void genType$Arr(TypeNode.Arr type) {

		if (curArrSize > 0) {
			curTypeString += "[";
			curTypeString += curArrSize;
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

		curArrSize = 0;
	}

	void genType$Fcn(Fcn type) {
		curTypeString = "(*" + curTypeString + ")(";
		String sep = "";
		for (TypeNode argT : type.getArgs()) {
			curTypeString += sep;
			sep = ",";
			curTypeString += genTypeString(argT, null);
		}
		curTypeString += ")";
	}

	void genType$FcnRef(TypeNode.Usr type, String name) {
		SymbolEntry s = type.getSymbol();

		if (s != null && s.node() instanceof DeclNode.Fcn) {
			TypeNode t = ((DeclNode.Fcn) s.node()).getTypeSpec();
			String rtn = t instanceof TypeNode.Std ? ((TypeNode.Std) t)
					.getIdent().getText()
					: t instanceof TypeNode.Usr ? ((TypeNode.Usr) t).getName()
							.getText() : "??";
			curTypeString = rtn + " (*" + name + ")(";
			String sep = "";
			for (DeclNode.Formal arg : ((DeclNode.Fcn) s.node()).getFormals()) {
				curTypeString += sep;
				sep = ",";
				if (arg.getTypeSpec() instanceof TypeNode.Std)
					curTypeString += mkCname(arg.getTypeSpec());
				else
					curTypeString += "void*"; // can we do better?
			}
			curTypeString += ")";
		}
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
			cn = u.isProtocol() ? gen.cname() : (u.getQualName().replace('.',
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

		String qs = isLval ? "'" : "";
		boolean externScope = scope instanceof UnitNode
				|| scope instanceof DeclNode.Usr;
		if (scope instanceof DeclNode.Usr) {
			scope = scope.getEnclosingScope();
		}

		if (!(externScope)) {
			if (isLval) {
				if (cat.isAggArr()) {
					gen.fmt.print("%1.$$cname", name);
					return true;
				}
			}
			gen.fmt.print(name);
			return true;
		}

		if (snode instanceof ImportNode) {
			String qn = ((ImportNode) snode).getUnit().getQualName();
			if (isHost && !isLval) {
				gen.fmt.print("$units['%1']", qn);
			} else {
				gen.fmt.print("%2%1%2", qn.replace('.', '_'), qs);
			}
			return true;
		}

		if (snode == gen.curUnit()) {
			if (isHost && !isLval) {
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
						.getUnitQualName() : "??");
		if (isHost && !isLval) {
			if (scope == gen.curUnit()) {
				gen.fmt.print("%1.%2", gen.uname(), name);
			} else {
				gen.fmt.print("$units['%1'].%2", qn, name);
			}
		} else if (isLval && cat.isAggArr()) {
			if (scope == gen.curUnit()) {
				gen.fmt.print("%1.%2.$$cname", gen.uname(), name);
			} else {
				gen.fmt.print("$units['%1'].%2.$$cname", qn, name);
			}
		} else {
			// local (function scope) names not printed here
			
		}
		return false;

	}

	String mkCname(TypeNode t) {

		if (t instanceof TypeNode.Std)
			return ((TypeNode.Std) t).getIdent().getText();

		if (t instanceof TypeNode.Usr) {
			SymbolEntry s = ((Usr) t).getSymbol();

			if (s != null && s.node() != null) {
				if (s.node() instanceof ImportNode) {
					ImportNode i = (ImportNode) s.node();
					String qualifier;
					if (i.getUnit() == null) {
						if (i.isTypeMetaArg())
							qualifier = i.getUnitName().getText();
						else
							qualifier = Cat.Scalar
									.codeFromString(((ImportNode) s.node())
											.getUnitName().getText());
					} else
						qualifier = i.isTypeMetaArg() ? "" : i.getUnit()
								.getQualName().replace(".", "_")
								+ "_";
					return qualifier; // + i.getUnitName().getText();
				} else {
					if (s.node() instanceof DeclNode.Usr) {
						if (s.scope() instanceof DeclNode.Usr) // nested
							return gen.cname()
							+ ((DeclNode.Usr) s.node()).getName().getText() + "_";
						else
							return gen.cname();
								
					}
					else
						return gen.cname() + ((Usr) t).getName().getText();
				}
			}
		}
		return "/* ?? unknown symbol ?? */";
	}

	String mkCname(DeclNode.TypedMember member) {
		return member.getTypeUnit().getQualName().replace('.', '_') + '_'
				+ member.getName();
	}

	/**
	 * Not host, not lval, not import, not unit.
	 * 
	 * @param e
	 * @return
	 */
	String mkCname(ExprNode.Ident e) {
		String rtn = e.getName().getText();
		if (isLval || isHost)
			return rtn;
		if (e.getSymbol().node() instanceof ImportNode
				|| e.getSymbol().node() instanceof UnitNode)
			return rtn;
		
		if (rtn.indexOf(".") == -1) {
			return rtn;
		}
		SymbolEntry s = e.getSymbol();
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
		return id.startsWith("pollen.") ? ("pollen__" + id.substring("pollen."
				.length())) : id;
	}

	String mkQname(SymbolEntry sym) {
		return mkQname(sym.scope(), sym.node());
	}

	String mkQname(IScope scope, ISymbolNode snode) {
		// NOTE the unit node name is javascript only!
		String qn = gen.uname();

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
