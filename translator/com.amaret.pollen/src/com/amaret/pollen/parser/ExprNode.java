package com.amaret.pollen.parser;

import java.util.EnumSet;
import java.util.List;

import org.antlr.runtime.tree.Tree;

import com.amaret.pollen.parser.DeclNode.Fcn;
import com.amaret.pollen.parser.DeclNode.ITypeKind;

public class ExprNode extends BaseNode {

	public interface AggVal {
	}

	public interface SubExprCat {
		public Cat getSubExprCat(); // handle subexpressions
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
			return (ExprNode) getChild(LEFT);
		}

		public Atom getOp() {
			return ((BaseNode) getChild(OP)).getAtom();
		}

		public ExprNode getRight() {
			return (ExprNode) getChild(RIGHT);
		}

		public boolean isAssign() {
			return isAssign;
		}

		/**
		 * 
		 * @return most refined Cat for the expr subtree E.g. cat for count in
		 *         'arr[i].count'
		 */

		private Cat getSubExprCat(boolean isRight) {
			ExprNode e = isRight ? this.getRight() : this.getLeft();
			if (e.getChildren().isEmpty())
				return e.getCat();
			if (e instanceof ExprNode.Self) {
				if (((ExprNode.Self)e).getMember() == null)
					return this.getCat();
				else
					e = ((ExprNode.Self)e).getMember();
			}
			for (int i = e.getChildren().size() - 1; i > 0; i--) {
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
					ExprNode base = ((ExprNode.Index) e).getBase();
					if (base instanceof ExprNode.Ident) {
						SymbolEntry s = ((ExprNode.Ident) base).getSymbol();
						if (s != null && s.node() instanceof DeclNode.ITypeSpec) {
							return Cat.fromType(((DeclNode.ITypeSpec) s.node())
									.getTypeSpec());
						}
					}
				}
			}
			return isRight ? this.getRight().getCat() : this.getLeft().getCat();

		}

		public Cat getSubExprCat() {
			Cat left = getSubExprCat(false);
			Cat right = getSubExprCat(true);
			return TypeRules.checkBinary(getOp().getText(), left, right);
		}

		@Override
		protected void pass2End() {
			isConst = !isAssign && getLeft().isConst() && getRight().isConst();
			if (isAssign && getOp().getText().equals("=")
					&& getRight() instanceof ExprNode.AggVal) {
				exprCat = getLeft().getCat();
				TypeRules.checkInit(exprCat, getRight());
				return;
			}
			Cat left = getSubExprCat(false);
			Cat right = getSubExprCat(true);

			boolean providedTypeTest = this.getParent() instanceof StmtNode.Provided;
			boolean isUnit = getLeft().getCat() != null
					&& getLeft().getCat().isUnit();
			isUnit |= getRight().getCat() != null
					&& getRight().getCat().isUnit();
			providedTypeTest &= isUnit;

			if ((exprCat = TypeRules.preCheck(getLeft().getCat(), getRight()
					.getCat())) != null) {
				return;
			}
			if (!providedTypeTest && getLeft().getCat() != null
					&& getRight().getCat() != null) {
				exprCat = TypeRules.checkBinary(getOp().getText(), left, right);
				if (exprCat instanceof Cat.Error) {
					ParseUnit.current().reportError(getOp(),
							((Cat.Error) exprCat).getMsg());
				}
			}

		}
	}

	// ExprNode.Call
	static public class Call extends ExprNode {

		static final private int NAME = 0;
		static final private int ARGS = 1;
		private SymbolEntry qualifier = null; // in e.get() qualifier is 'e'.
		private SymbolEntry fcn = null; // in e.get() fcn is 'get()'.

		public SymbolEntry getQualifier() {
			return qualifier;
		}

		public SymbolEntry getCalledFcn() {
			return fcn;
		}

		public boolean addThisPtrParameter() {
			//if (!addThisPtrParameter)
			//	return isHostConstructorCall(); currently I don't pass 'this' for these
			return addThisPtrParameter;
		}
		/**
		 * 
		 * @return true if this is a constructor call on a host variable (call to a host constructor).
		 */
		public boolean isHostConstructorCall() {
			if (this.getParent() instanceof ExprNode.New && this.getParent().getParent() instanceof DeclNode) {
				DeclNode d = (DeclNode) this.getParent().getParent();
				return d.isHostClassRef();				
			}
			Tree b = this;
			while (b.getParent() != null) {				
				b = b.getParent();
				if (b instanceof DeclNode.Arr) {
					if (((DeclNode.Arr)b).isHost())
						return true;
				}	
				else 
					if (b instanceof ExprNode.Binary) {
						Tree b1 = ((ExprNode.Binary)b).getLeft();
						if (b1 instanceof ExprNode.Ident) {
							SymbolEntry se = ((ExprNode.Ident)b1).getSymbol();
							ISymbolNode node = se!=null? se.node() : null;
							if (node instanceof DeclNode)
								return ((DeclNode)node).isHost();			
						}
									
					}
			}
			return false;
		}

		private boolean addThisPtrParameter = false; // a class method call: add a this ptr
											// as first parameter

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

			// look up the call identifier here rather than in Expr.Ident
			// because here we know  to check host scope.
			

			if (getName() != null && getName() instanceof ExprNode.Ident) {
				ExprNode.Ident ei = (ExprNode.Ident) getName();
				
				String call = ei.getName().getText();
				boolean chkHostScope = symtab.currScopeIsHostFcn() || isHostConstructorCall();
				boolean dbg = false;

				if (call.matches("classMethod"))
					dbg = true;

				if (fcn == null
						&& this.getParent() instanceof ExprNode.Ident
						&& ((ExprNode.Ident) this.getParent()).getSymbol() != null) {
					// this is an access after a dereference: 'arr[i].fcn()'.
					// lookup scope for 'fcn()' is the type for arr.

					IScope sc = ((ExprNode.Ident) this.getParent()).getSymbol()
							.derefScope(false);
					fcn = sc.lookupName(ei.getName().getText());
					if (fcn != null && fcn.node() instanceof DeclNode) {
						DeclNode d = (DeclNode) fcn.node();
						boolean accessible = d.query(EnumSet.of(Flags.PUBLIC));
						accessible |= (d.getUnit() == currUnit
								.getCurrUnitNode());
						fcn = (accessible) ? fcn : null;
					}
				}

				if (fcn == null) {
					fcn = symtab.curScope().lookupName(ei.getName().getText(),
							chkHostScope);
				}
				if (qualifier == null) {
					if (ei.getName().getText().indexOf('.') != -1) {
						String n = ei.getName().getText();
						n = n.substring(0, n.lastIndexOf('.'));
						qualifier = symtab.curScope().lookupName(n, chkHostScope);
						if (qualifier == null && chkHostScope)
							qualifier = symtab.curScope().lookupName(n, false);

						ei.setQualifier(qualifier);
						if (qualifier != null && qualifier.node() instanceof ImportNode) {
							// For imports, the qualifier will get output by translator code.
							ei.getName().stripQualifiers();
						}
					} else {
						IScope sc = currUnit.getSymbolTable().curScope();
						while (!(sc instanceof DeclNode.Usr)) {
							sc = sc.getEnclosingScope();
							if (sc instanceof DeclNode.Usr
									&& ((DeclNode.Usr) sc).isClass()) {
								// if calling a method in current class, 'this'
								// is the qualifier
								qualifier = symtab.curScope().lookupName("this",
										false);
								ei.setQualifier(qualifier);
							}
						}
					}
				}
				if (fcn == null) {
					// Could be a host function accessed through a non-host
					// qualifier:
					// look up in the host table of the deref scope of the qualifier.
					if (chkHostScope && qualifier != null) {
						String n = ei.getName().getText();
						if (n.indexOf('.') != -1) {
							n = n.substring(n.lastIndexOf('.') + 1);
							fcn = qualifier.derefScope(true).lookupName(n,
									chkHostScope);
							
							if (qualifier != null && fcn != null
									&& qualifier.node() instanceof DeclNode) {
								if (((DeclNode) qualifier.node())
										.isHostClassRef()
										&& fcn.scope() instanceof DeclNode.Usr
										&& addThisPtrParameter) {
									ei.getName().stripQualifiers();
								}

							}
						}
					}
				}

				if (fcn == null)
					currUnit
							.reportError(
									currUnit.getCurrUnitNode(),
									"'"
											+ call
											+ "': identifier is not declared in the current scope "
											+ symtab.curScope().getScopeName());

				else if (qualifier != null) {

					if (qualifier.node() instanceof ImportNode
							&& ((ImportNode) qualifier.node()).isComposition()) {
						// check that name resolution was correct. Sometimes
						// exported function names in
						// outer qualifier symtabs match but they are defined in
						// different modules.
						ISymbolNode f = this.getDclnNodeFcn((ImportNode) qualifier
								.node(), ei.getName());
						if (f != fcn.node()) {
							fcn = null;
							currUnit
									.reportError(
											currUnit.getCurrUnitNode(),
											"'"
													+ call
													+ "': identifier is not declared in the current scope "
													+ symtab.curScope()
															.getScopeName());
						}
					}

					ei.setSymbol(fcn);
					boolean isHostFcn = false;
					if (fcn != null) {
						IScope sc = fcn.scope();
						isHostFcn = (fcn.node() instanceof DeclNode.Fcn && ((DeclNode.Fcn) fcn
								.node()).isHost());
						if (!isHostFcn && sc instanceof DeclNode.Usr
								&& ((DeclNode.Usr) sc).isClass()
								&& !((DeclNode.Usr) sc).isHost()
								&& !(fcn.node() instanceof DeclNode.FcnRef)) {
							
							// for function references, the scope of the
							// function ref is not the scope of the fcn 
							addThisPtrParameter = true;
						}
					}
					if (qualifier != null && qualifier.node() instanceof ITypeKind
							&& ((ITypeKind) qualifier.node()).isComposition()
							&& !isHostFcn) {
						// Strip the composition from the qualification: it
						// won't exist at runtime
						ei.getName().stripQualifiers();
					}
				}

			}
			return super.pass2Begin();
		}

		/**
		 * Get the declaration node for a fcn called via an import. For valid
		 * scope check.
		 * 
		 * @param name
		 *            e.g. 'm.foo' where m is imported
		 * @return the DeclNode for that function
		 */
		public ISymbolNode getDclnNodeFcn(ImportNode imp, Atom name) {

			
			if (imp == null) {
				return null;
			}

			String fcn = name.getText();
			fcn = fcn.indexOf('.') != -1 ? fcn
					.substring(fcn.lastIndexOf('.') + 1) : fcn;
			String unit = imp.getName().getText();

			Atom u = new Atom(name);
			u.setText(unit);

			SymbolEntry fse = null;
			ISymbolNode fsn = null;
			boolean dbg = false;

			while (true) {
				UnitNode impu = imp.getUnit();
				if (impu == null)
					dbg = true;
				if (impu.isComposition()) {
					fse = impu.lookupExportInUnit(fcn);
					if (fse == null) {
						fse = impu.getUnitType().lookupName(fcn);
						if (fse == null)
							fse = impu.getUnitType().lookupName(fcn, true);
					}

					fsn = fse != null ? fse.node() : null;
					ImportNode ifsn = (ImportNode) (fse != null
							&& fse.scope() instanceof ImportNode ? fse.scope()
							: null);
					// These conditions trying to nail that this is the right
					// function
					boolean impFlag = !imp.isFromComposImportModule();
					boolean fsnFlag = (ifsn != null && !ifsn
							.isFromComposImportModule());
					if (fsn != null
							&& (imp == fse.scope() || impFlag || fsnFlag))

						break;

					u.setText(imp.getUnitName().getText());
					imp = impu.getImportByName(u, imp.getUnit());
					if (imp == null) {
						dbg = true;
						return null;
					}

				} else if (impu.isModule()) {
					fse = impu.getUnitType().lookupName(fcn);
					if (fse == null)
						fse = impu.getUnitType().lookupName(name.getText(),
								true);
					fsn = fse != null ? fse.node() : null;
					break; // once we are at the module we are done.
				} else {
					return null;
				}
			}
			if (fse == null) {
				return null;
			}
			
			return fsn;
		}

		@Override
		protected void pass2End() {

			ParseUnit currUnit = ParseUnit.current();
			Cat cat = getName().getCat();

			if ((exprCat = TypeRules.preCheck(cat)) != null) {
				return;
			}
			boolean fcnOrFcnRef = cat instanceof Cat.Fcn
					|| cat instanceof Cat.Agg;
			if (!fcnOrFcnRef) {
				currUnit.reportError(getName(), "value is not a function");
				return;
			}
			// TODO
			// signature matching, default parameter value insertion
			// overload resolution
			if (cat instanceof Cat.Agg
					&& ((Cat.Agg) cat).aggScope() instanceof DeclNode.TypedMember) {
				DeclNode.TypedMember tm = (DeclNode.TypedMember) ((Cat.Agg) cat)
						.aggScope();
				cat = tm.getFcnTypeCat();
			}

			if (!(cat instanceof Cat.Fcn)) {
				String n = (getName() instanceof ExprNode.Ident) ? "\'"
						+ ((ExprNode.Ident) getName()).getName().getText()
						+ "\' " : "";
				ParseUnit.current()
						.reportError(getName(), n + "not a function");
				return;
			}

			Cat.Fcn fcncat = (Cat.Fcn) cat;
			int argc = getArgs().size();
			// if (addThisPtrParameter) argc++; // add one for this ptr (already added in
			// the parser)
			int minArgc = fcncat.minArgc();
			int maxArgc = fcncat.maxArgc();

			if (argc < minArgc || argc > maxArgc) {
				currUnit.reportError(getName(), "wrong number of arguments");
				return;
			}

			exprCat = fcncat.retCat();

			// for now, skip check for calling through function references
			// TODO figure out how to pass 'this' ptr for function ref class
			// method calls
			if (!(fcn != null && fcn.node() instanceof DeclNode.TypedMember)) {

				int k = -1;

				for (ExprNode e : getArgs()) {
					k += 1;
					Cat actualCat = e instanceof ExprNode.SubExprCat ? ((ExprNode.SubExprCat) e)
							.getSubExprCat()
							: e.getCat();
					Cat formalCat = fcncat.argCats().get(k);
					if (formalCat.isAggTyp()) {
						if (((Cat.Agg) formalCat).isComposition()) {
							// TODO do I need to resolve to the module, for an
							// export?
						}
						if (((Cat.Agg) formalCat).isProtocol()) {
							ParseUnit.current().reportError(
									this,
									"actual parameter type error for \'"
											+ ((Cat.Agg) formalCat).aggName()
											+ "\' (protocol not allowed)");
							continue;
						}

					}

					if (e instanceof ExprNode.AggVal) {
						TypeRules.checkInit(formalCat, e);
						continue;
					}
					if (TypeRules.preCheck(actualCat) != null) {
						continue;
					}
					Cat res = TypeRules.checkBinary("=", formalCat, actualCat,
							"formal / actual parameter type conflict");
					if (res instanceof Cat.Error) {
						ParseUnit.current().reportError(this.getName(),
								((Cat.Error) res).getMsg());
					}
				}
			}

			
			if (addThisPtrParameter && fcn != null && fcn.scope() instanceof DeclNode.Class) {
				// For method get() in a nested class Event, change call from e.get() to Event.get()
				// If Event is not a nested class, strip the qualifier.
				String n = ((ExprNode.Ident) getName()).getName().getText();
				if (n.indexOf(".") != -1) {
					n = n.substring(n.lastIndexOf('.') + 1);
					String prefix = ((DeclNode.Class)fcn.scope()).getContainingType() != null ? fcn.scope().getScopeName() + "_" : "";
					n =  prefix + n ;
					((ExprNode.Ident) getName()).getName().setText(n); 												
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

			isConst = getTrue().isConst && getTrue().isConst
					&& getFalse().isConst;

			Cat leftCat = getTrue().getCat();
			Cat rightCat = getFalse().getCat();
			Cat testCat = getTest().getCat();

			if ((exprCat = TypeRules.preCheck(leftCat, rightCat)) != null) {
				return;
			}
			if ((exprCat = TypeRules.preCheck(testCat)) != null) {
				return;
			}

			exprCat = TypeRules
					.checkUnary("!", testCat, "condition type error");
			if (exprCat instanceof Cat.Error) {
				ParseUnit.current().reportError(getTest(),
						((Cat.Error) exprCat).getMsg());
				return;
			}

			exprCat = TypeRules.checkBinary("==", leftCat, rightCat,
					"condition result types must match");
			if (exprCat instanceof Cat.Error) {
				ParseUnit.current().reportError(this,
						((Cat.Error) exprCat).getMsg());
				return;
			} else {
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
			} else if (vs.startsWith("'")) {
				if (vs.length() > 1) {
					this.getLitFlags().add(LitFlags.STR);
					this.getLitFlags().remove(LitFlags.CHR);
					currUnit
							.reportError(
									this,
									"Using single quotes to enclose a multi-byte string is not recommended. Literal will be treated as a string literal enclosed in double quotes.");
					getValue().setText(
							"\"" + vs.substring(1, vs.length() - 1) + "\"");
					currUnit.getCurrUnitNode().addString(getValue().getText());
					exprCat = Cat.fromScalarCode("s");
				} else
					exprCat = Cat.fromScalarCode("u1");
			} else if (Character.isDigit(vs.charAt(0))) {
				exprCat = Cat.fromScalarCode("n");
			} else if (vs.equals("null")) {
				exprCat = Cat.fromScalarCode("v");
			} else if (vs.equals("true") || vs.equals("false")) {
				exprCat = Cat.fromScalarCode("b");
			}
		}
	}

	// ExprNode.Inj
	static public class Inject extends ExprNode {

		static final private int LIST = 0;

		Inject(int ttype, String ttext) {
			super(ttype, ttext);
		}

		SymbolEntry[] symbols = null;

		public SymbolEntry[] getSymbols() {
			return symbols;
		}

		@SuppressWarnings("unchecked")
		public List<BaseNode> getInjects() {
			return ((ListNode<BaseNode>) getChild(LIST)).getElems();
		}

		protected boolean pass2Begin() {

			symbols = new SymbolEntry[getInjects().size()];

			ParseUnit currUnit = ParseUnit.current();
			int i = 0;
			for (BaseNode e : getInjects()) {
				int typ = e.getAtom().getType();
				switch (typ) {
				case pollenParser.E_IDENT:
					symbols[i] = currUnit.getSymbolTable().resolveSymbol(
							((ExprNode.Ident) e).getName());
					if (symbols[i] == null) {
						currUnit.reportError(e,
								"identifier is not declared in the current scope "
										+ currUnit.getSymbolTable().curScope()
												.getScopeName());
					}
					break;
				case pollenParser.INJECT:
					symbols[i] = null; // to be output as is (text)
					break;
				default:
					currUnit.reportError(e, "injected code error");
					break;

				}
				i++;

			}

			return true;
		}

		@Override
		protected void pass2End() {
			exprCat = Cat.INJECT;
			super.pass2End();
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

		protected SymbolEntry symbol = null; // for obj.field symbol is for
												// 'field'
		private SymbolEntry qualifier = null; // for obj.field qualifier is
												// 'obj'

		private boolean thisPtr = false; // add 'this' to accesses

		public boolean isThisPtr() {
			if (!thisPtr) {
				IScope sc = this.getSymbol() != null ? this.getSymbol().scope() : null;
				while (sc != null && sc.getEnclosingScope() != null)
					sc = sc.getEnclosingScope();
				if (sc instanceof ITypeKind && !((ITypeKind)sc).isClass())
					return false;
				if (qualifier != null && qualifier.node().getName().getText().equals("this"))
					thisPtr = true;
				else
				if (this.getParent() instanceof ExprNode.Self)
					thisPtr = true;
			}
			return thisPtr;
		}

		public boolean isIntrisicCall() {
			if (getName().getText().matches(ParseUnit.INTRINSIC_PREFIX + ".*"))
				return true;
			return false;
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
		 * @return most refined Cat for the expr subtree E.g. cat for count in
		 *         'arr[i].count'
		 */

		public Cat getSubExprCat() {
			ExprNode e;
			if (this.getChildren().isEmpty())
				return this.getCat();
			for (int i = this.getChildren().size() - 1; i > 1; i--) {
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
			if (exprCat == Cat.UNKNOWN && symbol != null)
				exprCat = Cat.fromSymbolNode(symbol.node(), symbol.scope());
			return exprCat;
		}

		@Override
		protected boolean pass2Begin() {
			// this used to be pass1Begin() but that creates a requirement that
			// a variable be declared before it is referenced.

			ParseUnit currUnit = ParseUnit.current();
			if (this.getParent() instanceof ExprNode.Ident
					&& ((ExprNode.Ident) this.getParent()).getSymbol() != null) {

				// This is an access after an indexed expr or call, such as
				// 'arr[i].fld'.
				// lookup scope for 'fld' is the type for arr.

				IScope sc = ((ExprNode.Ident) this.getParent()).getSymbol()
						.derefScope(false);
				symbol = sc.lookupName(getName().getText());
				if (symbol != null && symbol.node() instanceof DeclNode) {
					DeclNode d = (DeclNode) symbol.node();
					boolean accessible = d.query(EnumSet.of(Flags.PUBLIC));
					accessible |= (d.getUnit() == currUnit.getCurrUnitNode());
					symbol = (accessible) ? symbol : null;
				}
			}
			boolean dbg = false;
			if (this.getName().getText().matches(".*init"))
				dbg = true;
			if (symbol == null)
				symbol = currUnit.getSymbolTable().resolveSymbol(getName(),
						true);
			if (symbol == null) {
				currUnit.reportError(currUnit.getCurrUnitNode(), "'"
						+ this.getName().getText()
						+ "': identifier is not declared in the current scope "
						+ currUnit.getSymbolTable().curScope().getScopeName());
			} else {

				if (symbol.node() instanceof DeclNode.Var
						&& ((DeclNode.Var) symbol.node()).isIntrinsic())
					((DeclNode.Var) symbol.node()).setIntrinsicUsed(true); // only
																			// emit
																			// if
																			// used
				// check for proper access (public /private )
				UnitNode unitDcln = null;
				if (symbol.scope() instanceof DeclNode.Usr)
					unitDcln = ((DeclNode.Usr) symbol.scope()).getUnit();
				if (symbol.node() instanceof DeclNode
						&& ((DeclNode) symbol.node()).isPublic()) // don't check
					unitDcln = null;
				if (!(symbol.node() instanceof BaseNode))
					unitDcln = null;
				if (unitDcln != null) {
					boolean accessOK = false;
					accessOK = symbol.node() instanceof DeclNode.TypedMember
							&& ((DeclNode.TypedMember) symbol.node())
									.isProtocolMember();
					if (!accessOK) {
						accessOK = symbol.node() instanceof DeclNode.Var
								&& ((DeclNode.Var) symbol.node()).isPreset();
						if (accessOK) {
							BaseNode b = this;
							while (b != null && !(b instanceof StmtNode.Assign)) {
								b = (BaseNode) b.getParent();
							}
							if (b instanceof StmtNode.Assign) {
								accessOK = ((StmtNode.Assign) b).isPreset();
							} else
								accessOK = false;
						}
					}
					if (unitDcln != ParseUnit.current().getCurrUnitNode()
							&& !accessOK)
						ParseUnit.current().reportError(
								this.getName(),
								"private member cannot be accessed outside its declaring scope (which was "
										+ unitDcln.getQualName() + ")");
				}
			}
			return super.pass2Begin();
		}

		@Override
		protected void pass2End() {
			
			if (symbol != null) {
				if (symbol.node() instanceof DeclNode.Var
						&& ((DeclNode.Var) symbol.node()).isConst())
					isConst = true;
				if (symbol.node() instanceof DeclNode.Formal) {
					DeclNode.Formal f = (DeclNode.Formal) symbol.node();
					if (f.isTypeMetaArg() && f.getInit() == null) {
						ParseUnit.current().reportError(
								f,
								f.getName().getText()
										+ " meta parameter is uninitialized");
						return;
					}
				}
				if (symbol.node() instanceof DeclNode.Var
						&& symbol.scope() instanceof DeclNode.Class) {
					IScope sc = ParseUnit.current().getSymbolTable().curScope();
					if (sc instanceof StmtNode.Block || sc instanceof BodyNode) {
						do
							sc = sc.getEnclosingScope();
						while (!(sc instanceof DeclNode.Fcn));
					}
					if (sc.getEnclosingScope() == symbol.scope()) {
//						boolean staticAccess = ((DeclNode.Fcn) sc).isHost() ||
//							 (((DeclNode.Fcn) sc).isConstructor() && !((DeclNode.Fcn) sc)
//								.isClassTargetConstructor());
//						if (!staticAccess)
							thisPtr = true; // a class var accessed within a method belonging to its class
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
			return ((TypeNode) getChild(TYPE));
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

				if (Cat.fromScalarString(name.getText()) != null) // a primitive
																	// type
					return super.pass2Begin();

				symbol = currUnit.getSymbolTable().resolveSymbol(name);
			}
			if (symbol == null) {
				currUnit.reportError(name,
						"type is not declared in the current scope "
								+ currUnit.getSymbolTable().curScope()
										.getScopeName());

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
			// this used to be pass1Begin() but that creates a requirement 
			// that a variable be declared before it is referenced.

			ParseUnit currUnit = ParseUnit.current();

			if (!currUnit.getCurrUnitNode().getUnitType().isClass()) {
				currUnit.reportError(this,
						"\'@\' can only be used in \'class\' methods");
			}

			// do the lookup of the deref'd member here, where the self context
			// is known, in case there is a name collision between a local var
			// name
			// and a member name.
			if (getMember() != null && getMember() instanceof ExprNode.Ident) {
				ExprNode.Ident ei = (ExprNode.Ident) getMember();
				symbol = currUnit.getSymbolTable().resolveSymbol(ei.getName(),
						currUnit.getSymbolTable().curScope());
				if (symbol == null) {
					currUnit.reportError(ei.getName(),
							"identifer is not declared in the current scope");
				} else {
					ei.setSymbol(symbol);
					// This prevents codegen collisions with parameters and locals with the same name.
					//ei.getName().setText("this." + ei.getName().getText());
				}
			} else {
				symbol = currUnit.getSymbolTable().lookupName(
						ParseUnit.current().getUnitName());
			}

			return super.pass2Begin();
		}

		@Override
		protected void pass2End() {
			if (symbol != null && symbol.node() instanceof DeclNode.Var
					&& ((DeclNode.Var) symbol.node()).isConst())
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
			return getChildCount() > FIELD ? ((BaseNode) getChild(FIELD))
					.getAtom() : null;
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

			// if (this.getParent() != null && this.getParent().getChildCount()
			// > 1) {
			// BaseNode b = (BaseNode) this.getParent().getChild(0);
			// if (!(b instanceof ExprNode)) {
			// ParseUnit.current().reportError(b, "invalid array base");
			// return null;
			// }
			// return (ExprNode) b;
			// }
			// return null;
		}

		/**
		 * 
		 * @return first index TODO delete and replace with getIndexes() after
		 *         multi-dim is implemented
		 */
		@SuppressWarnings("unchecked")
		public ExprNode getFirstIndex() {
			ListNode<ExprNode> child = (ListNode<ExprNode>) getChild(INDEX);
			return (!child.getElems().isEmpty()) ? child.getElems().get(0)
					: null;
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
			// cat1 == Cat.INJECT || cat1 == Cat.UNKNOWN || cat1 instanceof
			// Cat.Error
			if (exprCat != null
					&& (exprCat == Cat.INJECT || exprCat instanceof Cat.Error)) {
				return true;
			}
			if (basecat instanceof Cat.Arr) {
				exprCat = ((Cat.Arr) basecat).getBase();
			} else if (basecat instanceof Cat.Scalar
					&& ((Cat.Scalar) basecat).kind() == 's') {
				exprCat = Cat.fromScalarCode("u1");
			}
			if (exprCat == Cat.UNKNOWN) {
				ParseUnit.current().reportError(getBase(),
						"value cannot be indexed");
			}
			return true;
		}

	}

	// ExprNode.New
	static public class New extends ExprNode {

		static final private int ARGS = 1;
		static final private int TYPE = 0;
		static final private int CALL = 0;

		New(int ttype, String ttext) {
			super(ttype, ttext);
		}

		public ExprNode.Call getCall() {
			return (Call) this.getChild(CALL);
		}

		private TypeNode getTypeSpec() {
			if (this.getParent() instanceof DeclNode.Var) {
				return ((DeclNode.Var) this.getParent()).getTypeSpec();
			}
			if (this.getChild(0) instanceof ExprNode.Call) {
				ExprNode.Call e = (Call) this.getChild(0);
				if (e.getSymbol() != null && e.getSymbol().node() instanceof DeclNode.Fcn) {
					DeclNode.Fcn f = (Fcn) e.getSymbol().node();
					return f.getTypeSpec();
				}
				return null;				
			}
			return ((TypeNode) getChild(TYPE));
		}

		@SuppressWarnings("unchecked")
		public List<ExprNode> getArgs() {
			return ((ListNode<ExprNode>) getChild(ARGS)).getElems();
		}

		@Override
		protected void pass2End() {

			if (this.getParent() instanceof DeclNode.Var) {
				exprCat = Cat.fromNew(((DeclNode.Var) this.getParent())
						.getTypeSpec());
			} else if (this.getChild(0) instanceof ExprNode.Call) {
				
				// check: if this is a host class ref, it must be initialized in a host context
				SymbolEntry se = ((ExprNode.Call) this.getChild(0)).getSymbol();
				ISymbolNode sn = se != null ? se.node() : null;
				if (sn instanceof DeclNode) {
					boolean okForHostNew = ParseUnit.current().getSymbolTable()
					.currScopeIsHostFcn()
					|| ParseUnit.current().getSymbolTable().curScope() instanceof DeclNode.Usr;

					if (!okForHostNew
							&& ((DeclNode)sn).isHostClassRef())
						ParseUnit.current().reportError(this, "host objects can only be initalized in host contexts (which are the bodies of types or within host constructors or host functions)");
				}
		
				exprCat = ((ExprNode.Call) this.getChild(0)).getCat();
			} else {
				exprCat = Cat.fromNew((TypeNode) getChild(TYPE));
			}
			exprCat = exprCat == null ? Cat.fromError("Invalid constructor call", null, null) : exprCat;
			if (exprCat instanceof Cat.Error) {
				ParseUnit.current().reportError(this.getCall().getName(),
						((Cat.Error) exprCat).getMsg());
				return;
			}
			boolean dbg;
			if (exprCat == null)
				dbg = true;
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
			return (ExprNode) getChild(OPERAND);
		}

		public boolean isPostfix() {
			return isPostfix;
		}

		/**
		 * 
		 * @return most refined Cat for the expr subtree E.g. cat for count in
		 *         'arr[i].count'
		 */

		public Cat getSubExprCat() {
			ExprNode e = this.getOperand();
			if (e.getChildren().isEmpty())
				return e.getCat();
			for (int i = e.getChildren().size() - 1; i > 1; i--) {
				if (!(e.getChild(i) instanceof ExprNode))
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
			isConst = !op.equals("++") && !op.equals("--")
					&& getOperand().isConst;
			Cat catSubtree = getSubExprCat();
			Cat cat = getOperand().getCat();
			if ((exprCat = TypeRules.preCheck(cat)) != null) {
				return;
			}
			exprCat = TypeRules.checkUnary(op, catSubtree);
			if (exprCat instanceof Cat.Error) {
				ParseUnit.current().reportError(getOperator(),
						((Cat.Error) exprCat).getMsg());
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

	/**
	 * @return if this expression resolves to an ExprNode.Const return that node else return null.
	 */
	public ExprNode.Const getConstExpr() {
		// TODO handle EnumVal
		ExprNode.Const rtn = null;
		if (this instanceof ExprNode.Const) 
			return (Const) this;
		else {
			if (this instanceof ExprNode.Ident) {
				SymbolEntry se = ((ExprNode.Ident)this).getSymbol();
				ISymbolNode node = se != null ? se.node() : null;
				if (node instanceof DeclNode.Var) {
					rtn = ((DeclNode.Var)node).getPresetValue();
   				if (rtn instanceof ExprNode.Const) 
   					return rtn;
				}
				if (node != null
						&& (((DeclNode.Var) node).isConst() || ((DeclNode.Var) node)
								.isPreset())
						&& ((DeclNode.Var) node).getInit() instanceof ExprNode.Const) {
					return (Const) ((DeclNode.Var) node).getInit();
				}
			}
		}
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

	void setCat(Cat cat) {
	}
}
