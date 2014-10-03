package com.amaret.pollen.parser;

import java.util.EnumSet;
import java.util.List;

import org.antlr.runtime.tree.Tree;

import com.amaret.pollen.parser.Cat.Arr;
import com.amaret.pollen.parser.DeclNode.Fcn;
import com.amaret.pollen.parser.DeclNode.ITypeKind;
import com.amaret.pollen.parser.DeclNode.ITypeSpecInit;
import com.amaret.pollen.parser.DeclNode.Usr;

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
		private boolean hasRightIndexExpr = false;
		private ExprNode.Index rightIndexExpr = null;

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

		public boolean hasRightIndexExpr() {
			return hasRightIndexExpr;
		}

		public ExprNode.Index getRightIndexExpr() {
			return rightIndexExpr;
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
				if (((ExprNode.Self) e).getMember() == null)
					return this.getCat();
				else
					e = ((ExprNode.Self) e).getMember();
			} else if (e instanceof ExprNode.Binary) {
				return e.getCat();
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
					} else {
						hasRightIndexExpr = true;
						if (rightIndexExpr == null)
							rightIndexExpr = (Index) e; // first one
					}
					ExprNode base = ((ExprNode.Index) e).getBase();
					if (base.getCat() instanceof Cat.Arr)
						return ((Cat.Arr) base.getCat()).getBase();
					return base.getCat();
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

			ParseUnit currUnit = ParseUnit.current();
			isConst = !isAssign && getLeft().isConst() && getRight().isConst();
			if (isAssign && getOp().getText().equals("=")
					&& getRight() instanceof ExprNode.AggVal) {
				exprCat = getLeft().getCat();
				TypeRules.checkInit(exprCat, getRight());
				return;
			}

			SymbolEntry l_se = getLeft().getSymbol();
			SymbolEntry r_se = getRight().getSymbol();

			boolean doAccessCheck = l_se != null && r_se != null
					&& l_se.node() instanceof DeclNode.FcnRef;
			TypeNode.Arr at = l_se != null
					&& l_se.node() instanceof DeclNode.Arr ? ((DeclNode.Arr) l_se
					.node()).getTypeArr() : null;
			doAccessCheck |= at != null && at.getBaseSymbol() != null
					&& at.getBaseSymbol().node() instanceof DeclNode.Fcn;

			if (isAssign && doAccessCheck /* for calling functions */
					&& r_se.node() instanceof DeclNode.Fcn
					&& l_se.node() instanceof DeclNode) {

				// For function reference assignment, check that the RHS fcn is
				// accessible
				// to the LHS and vice versa
				((DeclNode) l_se.node()).callAccessCheck(
						(BaseNode) r_se.node(), true);
				((DeclNode) r_se.node()).callAccessCheck(
						(BaseNode) l_se.node(), true);

			}
			if (isAssign && getLeft() instanceof ExprNode.Ident) {

				if (l_se != null && l_se.node() instanceof DeclNode) {
					if (((DeclNode) l_se.node()).isConst()) {
						ParseUnit
								.current()
								.reportError(
										this,
										"'"
												+ ((DeclNode) l_se.node())
														.getName().getText()
												+ "' has the attribute 'const' yet is the target of an assignment");
					}
					if (l_se.node() instanceof DeclNode.Arr) {
						if (r_se != null && r_se.node() instanceof DeclNode.Arr) {
							if (!((DeclNode) l_se.node()).isHost()
									&& ((DeclNode) r_se.node()).isHost())
								// if assigning a host array to a target array,
								// you can no longer generate that
								// host array as const (c restriction).
								((DeclNode) r_se.node()).clearHost();
						}
					}
					if (((DeclNode) l_se.node()).isHost()) {
						// if a host variable is a target of an assignment in a
						// target function
						// strip the 'host' attribute
						Tree tr = this.getParent();
						while (tr != null && !(tr instanceof BodyNode)) {
							tr = tr.getParent();
						}
						if (tr instanceof BodyNode) {
							if (!((BodyNode) tr).getFcn().isHost()) {
								((DeclNode) l_se.node()).clearHost();
								currUnit.reportWarning(getLeft(),
										"host variable is the target of an assignment in a target function.");
							}
						}

					}
				}
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
				if (right instanceof Cat.Arr
						|| (right instanceof Cat.Fcn && ((Cat.Fcn) right)
								.retCat() instanceof Cat.Arr)) {
					Cat baseCat = right instanceof Cat.Arr ? ((Cat.Arr) right)
							.getBase() : ((Arr) ((Cat.Fcn) right).retCat())
							.getBase();
					exprCat = TypeRules.checkBinary(getOp().getText(), left,
							baseCat);
					right = getSubExprCat(true);
				} else
					exprCat = TypeRules.checkBinary(getOp().getText(), left,
							right);
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
			// if (!addThisPtrParameter)
			// return isHostConstructorCall(); currently I don't pass 'this' for
			// these
			return addThisPtrParameter;
		}

		/**
		 * 
		 * @return true if this is a constructor call on a host variable (call
		 *         to a host constructor).
		 */
		public boolean isConstructorCallOnHostVar() {
			if (this.getParent() instanceof ExprNode.New
					&& this.getParent().getParent() instanceof DeclNode) {
				DeclNode d = (DeclNode) this.getParent().getParent();
				return d.isHostClassRef();
			}
			Tree b = this;
			while (b.getParent() != null) {
				b = b.getParent();
				if (b instanceof DeclNode.Arr) {
					if (((DeclNode.Arr) b).isHost())
						return true;
				} else if (b instanceof ExprNode.Binary) {
					Tree b1 = ((ExprNode.Binary) b).getLeft();
					if (b1 instanceof ExprNode.Ident) {
						SymbolEntry se = ((ExprNode.Ident) b1).getSymbol();
						ISymbolNode node = se != null ? se.node() : null;
						if (node instanceof DeclNode)
							return ((DeclNode) node).isHost();
					}

				}
			}
			return false;
		}

		private boolean addThisPtrParameter = false; // a class method call: add
														// a this ptr

		// as first parameter

		Call(int ttype, String ttext) {
			super(ttype, ttext);
		}

		Call(int ttype, String ttext, boolean dr) {
			super(ttype, ttext);
			postExpr = dr;
		}

		@SuppressWarnings("unchecked")
		public List<ExprNode> getArgs() {
			return ((ListNode<ExprNode>) getChild(ARGS)).getElems();
		}

		public ExprNode getName() {
			return (ExprNode) getChild(NAME);
		}

		protected boolean pass2Begin() {

			ParseUnit currUnit = ParseUnit.current();

			SymbolTable symtab = currUnit.getSymbolTable();

			// look up the call identifier here rather than in Expr.Ident
			// because here we know to check host scope.
			
			if (getName() != null && getName() instanceof ExprNode.Ident) {
				ExprNode.Ident ei = (ExprNode.Ident) getName();

				String call = ei.getName().getText();
				boolean chkHostScope = symtab.currScopeIsHostFcn()
						|| isConstructorCallOnHostVar();
				boolean dbg = false;
				if (call.equals("getArr"))
					dbg = true;

				boolean skipLookup = (call.matches(ParseUnit.INTRINSIC_PREFIX
						+ ".*")) ? true : false;

				if (!skipLookup) {
					
					boolean chkParentScope = this.getParent() instanceof ExprNode.Ident || this.getParent() instanceof ExprNode.Call;
					
					if (fcn == null
							&& chkParentScope) { 
						
						// If there is a predecessor expr, this is an access after a dereference:
						// 'arr[i].fcn()' or ref.foo().fcn()
						// lookup scope for 'fcn()' is from predecessor expr.
						ExprNode pred = this.getPredecessorExpr();
						
						SymbolEntry s = pred instanceof ExprNode.Ident ? ((ExprNode.Ident) pred)
								.getSymbol()
								: pred instanceof ExprNode.Call ? ((ExprNode.Call) pred)
										.getCalledFcn()
										: pred instanceof ExprNode.New ? ((ExprNode.New) pred)
												.getCall().getCalledFcn(): null;

						IScope sc = s != null ? s.derefScope(false) : null;
						fcn = sc != null ? sc.lookupName(ei.getName().getText()) : null;
						
						if (fcn == null) { // try host
							sc = s != null ? s.derefScope(true) : null;
							fcn = sc != null ? sc.lookupName(getName().getText(), true) : null;
						}

//						SymbolEntry s = pred instanceof ExprNode.Ident ? ((ExprNode.Ident) pred)
//								.getSymbol()
//								: pred instanceof ExprNode.Call ? ((ExprNode.Call) pred)
//										.getCalledFcn()
//										: null;
//						IScope sc = s != null ? s.derefScope(false) : null;
//
// 						fcn = sc != null ? sc.lookupName(ei.getName().getText()) : null;
						if (fcn != null && fcn.node() instanceof DeclNode) {
							DeclNode d = (DeclNode) fcn.node();
							boolean accessible = d.flagsContains(Flags.PUBLIC);
							accessible |= (d.getUnit() == currUnit
									.getCurrUnitNode());
							fcn = (accessible) ? fcn : null;
						}
					}

//					boolean chkParentIdentScope = this.getParent() instanceof ExprNode.Ident
//							&& ((ExprNode.Ident) this.getParent()).getSymbol() != null;
//					boolean chkParentFcnRtnScope = this.getParent() instanceof ExprNode.Call
//							&& ((ExprNode.Call) this.getParent())
//									.getCalledFcn() != null;
//
//					if (fcn == null
//							&& (chkParentIdentScope || chkParentFcnRtnScope)) { // more?
//						// this is an access after a dereference:
//						// 'arr[i].fcn()' or ref.foo().fcn()
//						// lookup scope for 'fcn()' is from preceding expr.
//
//						 IScope sc = chkParentIdentScope ? ((ExprNode.Ident) this
//								.getParent()).getSymbol().derefScope(false)
//								: chkParentFcnRtnScope ? ((ExprNode.Call) this
//										.getParent()).getCalledFcn()
//										.derefScope(false) : null;
//						fcn = sc.lookupName(ei.getName().getText());
//						if (fcn != null && fcn.node() instanceof DeclNode) {
//							DeclNode d = (DeclNode) fcn.node();
//							boolean accessible = d.flagsContains(Flags.PUBLIC);
//							accessible |= (d.getUnit() == currUnit
//									.getCurrUnitNode());
//							fcn = (accessible) ? fcn : null;
//						}
//					}

					if (fcn == null) {
						fcn = symtab.curScope().lookupName(
								ei.getName().getText(), chkHostScope);
					}
					if (qualifier == null) {
						if (ei.getName().getText().indexOf('.') != -1) {
							String n = ei.getName().getText();
							n = n.substring(0, n.lastIndexOf('.'));
							qualifier = symtab.curScope().lookupName(n,
									chkHostScope);
							if (qualifier == null && chkHostScope)
								qualifier = symtab.curScope().lookupName(n,
										false);

							ei.setQualifier(qualifier);
							if (qualifier instanceof SymbolEntry
									&& qualifier.node() instanceof DeclNode.TypedMember
									&& ((DeclNode.TypedMember) qualifier.node())
											.isProtocolMember()) {
								ei.setCallThruProtoMbr(true);
							}
							if (qualifier != null
									&& qualifier.node() instanceof ImportNode) {
								// For imports, the qualifier will get output by
								// translator code.
								ei.getName().stripQualifiers();
								// For a module function called via a composition import this sets composition unit to used.
								((ImportNode)qualifier.node()).getUnit().setUnitUsed(true);
							}
						} else {
							IScope sc = currUnit.getSymbolTable().curScope();
							while (!(sc instanceof DeclNode.Usr)) {
								sc = sc.getEnclosingScope();
								if (sc instanceof DeclNode.Usr
										&& ((DeclNode.Usr) sc).isClass()) {
									// if calling a method in current class,
									// 'this'
									// is the qualifier
									qualifier = symtab.curScope().lookupName(
											"this", false);
									ei.setQualifier(qualifier);
								}
							}
						}
					}

					if (fcn == null) {
						// Could be a host function accessed through a non-host
						// qualifier:
						// look up in the host table of the deref scope of the
						// qualifier.
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
					boolean isHostFcn = fcn != null
							&& fcn.node() instanceof DeclNode.Fcn
							&& ((DeclNode.Fcn) fcn.node()).isHost() ? true
							: false;
					if (fcn == null)
						currUnit.reportSeriousError(
								currUnit.getCurrUnitNode(),
								"'"
										+ ParseUnit.current()
												.getNameForMessage(call)
										+ "': function is not declared in (or not visible to) the current scope "
										+ symtab.curScope().getScopeName());

					else if (qualifier != null) {

						if (qualifier.node() instanceof ImportNode
								&& ((ImportNode) qualifier.node())
										.isComposition()) {
							// check that name resolution was correct. Sometimes
							// exported function names in
							// outer qualifier symtabs match but they are
							// defined in
							// different modules.
							ISymbolNode f = this
									.getDclnNodeFcn(
											(ImportNode) qualifier.node(),
											ei.getName());
							if (f != fcn.node()) {
								fcn = null;
								currUnit.reportSeriousError(
										currUnit.getCurrUnitNode(),
										"'"
												+ call
												+ "': identifier is not declared in the current scope "
												+ symtab.curScope()
														.getScopeName());
							}
						}

						if (qualifier != null
								&& qualifier.node() instanceof ITypeKind
								&& ((ITypeKind) qualifier.node())
										.isComposition() && !isHostFcn) {
							// Strip the composition from the qualification: it
							// won't exist at runtime
							ei.getName().stripQualifiers();
						}

					}
					if (fcn != null) {

						ei.setSymbol(fcn);

						IScope sc = fcn.scope();
						if (!isHostFcn && sc instanceof DeclNode.Usr
								&& ((DeclNode.Usr) sc).isClass()
								&& !((DeclNode.Usr) sc).isHost()
								&& !(fcn.node() instanceof DeclNode.FcnRef)) {
							// for function references, the scope of the
							// function ref is not the scope of the fcn
							addThisPtrParameter = true;
						}
						((DeclNode) fcn.node()).callAccessCheck(this, true);
					}

				} // end 'if (!skipLookup)'

			}
			exprCat = mkExprCat();
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
			if (exprCat == null || !(exprCat instanceof Cat.Fcn))
				return;
			Cat.Fcn fcncat = (com.amaret.pollen.parser.Cat.Fcn) exprCat; // setExprCat();
			int argc = getArgs().size();
			int minArgc = fcncat.minArgc();
			int maxArgc = fcncat.maxArgc();

			if (argc < minArgc || argc > maxArgc) {
				if (!this.isConstructorCallOnHostVar())
					currUnit.reportError(getName(), "wrong number of arguments");
				return;
			}

			// May need tweaking for case that parameter type is a default
			// instantiation meta
			// parameter for a meta type and it is instantiated with a
			// non-default type.
			int k = -1;
			for (ExprNode e : getArgs()) {
				k += 1;
				Cat actualCat = e instanceof ExprNode.SubExprCat ? ((ExprNode.SubExprCat) e)
						.getSubExprCat() : e.getCat();
				Cat formalCat = fcncat.argCats().get(k);
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

			if (addThisPtrParameter && fcn != null
					&& fcn.scope() instanceof DeclNode.Class) {
				// For method get() in a nested class Event, change call from
				// e.get() to Event.get()
				// If Event is not a nested class, strip the qualifier.
				String n = ((ExprNode.Ident) getName()).getName().getText();
				if (n.indexOf(".") != -1) {
					n = n.substring(n.lastIndexOf('.') + 1);
					String prefix = ((DeclNode.Class) fcn.scope())
							.getContainingType() != null ? fcn.scope()
							.getScopeName() + "_" : "";
					n = prefix + n;
					((ExprNode.Ident) getName()).getName().setText(n);
				}

			}
			for (int i = 0; i < this.getChildCount(); i++) {
				BaseNode b = (BaseNode) this.getChild(i);
				if (b instanceof ExprNode.Call)
					postExprCallCount++;
			}
		}

		/**
		 * Call exprCat. Should give a Cat.Fcn.
		 * 
		 * @return the exprCat
		 */
		private Cat.Fcn mkExprCat() {
			ParseUnit currUnit = ParseUnit.current();
			Cat cat = getName().getCat();

			if ((exprCat = TypeRules.preCheck(cat)) != null) {
				return null;
			}
			boolean fcnOrFcnRef = cat instanceof Cat.Fcn
					|| cat instanceof Cat.Agg;
			if (!fcnOrFcnRef) {
				currUnit.reportError(getName(), "value is not a function");
				return null;
			}
			// TODO
			// overload resolution
			if (cat instanceof Cat.Agg) {
				if (((Cat.Agg) cat).aggScope() instanceof DeclNode.TypedMember) {
					// a call via a function reference
					DeclNode.TypedMember tm = (DeclNode.TypedMember) ((Cat.Agg) cat)
							.aggScope();
					cat = tm.getFcnTypeCat();
				} else if (((Cat.Agg) cat).aggScope() instanceof DeclNode.Fcn) {
					// a call via a fcn ref passed as parameter
					DeclNode.Fcn df = (DeclNode.Fcn) ((Cat.Agg) cat).aggScope();
					cat = df.getTypeCat();
				}
			}

			if (!(cat instanceof Cat.Fcn)) {
				String n = (getName() instanceof ExprNode.Ident) ? "\'"
						+ ((ExprNode.Ident) getName()).getName().getText()
						+ "\' " : "";
				ParseUnit.current()
						.reportError(getName(), n + "not a function");
				return null;
			}

			Cat.Fcn fcncat = (Cat.Fcn) cat;
			return fcncat;
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
				exprCat = Cat.fromScalarCode(Cat.STRING);
			} else if (vs.startsWith("'")) {
				if (vs.length() > 3) {
					this.getLitFlags().add(LitFlags.STR);
					this.getLitFlags().remove(LitFlags.CHR);
					currUnit.reportError(
							this,
							"Using single quotes to enclose a multi-byte string is not recommended. Literal will be treated as a string literal enclosed in double quotes.");
					getValue().setText(
							"\"" + vs.substring(1, vs.length() - 1) + "\"");
					currUnit.getCurrUnitNode().addString(getValue().getText());
					exprCat = Cat.fromScalarCode(Cat.STRING);
				} else
					exprCat = Cat.fromScalarCode(Cat.UINT8);
			} else if (Character.isDigit(vs.charAt(0))) {
				exprCat = Cat.fromScalarCode(Cat.NUMLIT);
			} else if (vs.equals("null")) {
				exprCat = Cat.fromScalarCode(Cat.VOID);
			} else if (vs.equals("true") || vs.equals("false")) {
				exprCat = Cat.fromScalarCode(Cat.BOOL);
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
						currUnit.reportSeriousError(e,
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
		static final private int INDEX = 1; // only for Ident for arrays
		static final private int ARGS = 2; // only for Ident for arrays of
											// function pointers

		protected SymbolEntry symbol = null; // for obj.field symbol is for
												// 'field'
		private SymbolEntry qualifier = null; // for obj.field qualifier is
												// 'obj'

		private boolean thisPtr = false; // add 'this' to accesses
		private boolean isCallThruProtoMbr = false; // Qualifier is protocol
													// member: use bindTo unit
													// for the call
		public boolean isThisPtr() {
			if (!thisPtr) {
				IScope sc = this.getSymbol() != null ? this.getSymbol().scope()
						: null;
				while (sc != null && sc.getEnclosingScope() != null)
					sc = sc.getEnclosingScope();
				if (sc instanceof ITypeKind && !((ITypeKind) sc).isClass())
					return false;
				if (qualifier != null
						&& qualifier.node().getName().getText().equals("this"))
					thisPtr = true;
				else if (this.getParent() instanceof ExprNode.Self)
					thisPtr = true;
			}
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
			postExpr = dr;
		}

		public Atom getName() {
			return (Atom) ((BaseNode) getChild(NAME)).getToken();
		}

		public boolean hasIndexExpr() {
			if (this.getChildCount() > INDEX
					&& this.getChild(INDEX) instanceof ExprNode.Index)
				return true;
			return false;
		}

		public boolean isCallThruFcnPtrArray() {

			if (hasIndexExpr() && this.getChildCount() > ARGS
					&& this.getChild(ARGS) instanceof ListNode) // this list is
																// arguments
				return true;
			return false;
		}

		@SuppressWarnings("unchecked")
		public List<ExprNode> getArgs() {
			if (this.getChildCount() <= ARGS)
				return null;
			return ((ListNode<ExprNode>) getChild(ARGS)).getElems();
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

		/**
		 * 
		 * @param f
		 *            true if qualifier is protocol member
		 */
		public void setCallThruProtoMbr(boolean f) {
			isCallThruProtoMbr = f;
		}

		/**
		 * If qualifier is protocol member: use bindTo unit for the call.
		 * 
		 * @return true if call qualifier is protocol member else false.
		 */
		public boolean isCallThruProtoMbr() {
			return isCallThruProtoMbr;
		}

		public Cat getCat() {

			if (exprCat == Cat.UNKNOWN && symbol != null) {
				ISymbolNode node = symbol.node();
				if (node != null && node instanceof ImportNode) {
					node = ((ImportNode) node).getUnit().getUnitType();
				}
				if (node instanceof DeclNode.TypedMember)
					exprCat = Cat.fromSymbolNode(symbol.node(), symbol.scope());
				else if (node instanceof DeclNode
						&& ((DeclNode) node).getTypeCat() != null) {
					exprCat = ((DeclNode) node).getTypeCat(); // has more info
																// and is more
																// accurate than
																// Cat.fromSymbolNode
				} else
					exprCat = Cat.fromSymbolNode(symbol.node(), symbol.scope());
			}
			return exprCat;
		}

		@Override
		protected boolean pass2Begin() {
			// this used to be pass1Begin() but that creates a requirement that
			// a variable be declared before it is referenced.
			
			ParseUnit currUnit = ParseUnit.current();
			if (ParseUnit.isIntrinsicCall(this.getName().getText()))
				return super.pass2Begin();
						
			boolean dbg = false;
			if (this.getName().getText().equals("TimerManager.Timer.new_host")) {
				//System.out.println(this.getParent().toStringTree());
				dbg = true;
			}

			ExprNode pred = this.getPredecessorExpr();		
			
			if (pred != null) {

				// This is an access after an indexed expr or call, such as
				// 'arr[i].fld'.
				// lookup scope for 'fld' is the type for arr.
				
				SymbolEntry s = pred instanceof ExprNode.Ident ? ((ExprNode.Ident) pred)
						.getSymbol()
						: pred instanceof ExprNode.Call ? ((ExprNode.Call) pred)
								.getCalledFcn()
								: pred instanceof ExprNode.New ? ((ExprNode.New) pred)
										.getCall().getCalledFcn(): null;
				
				String n = getName().getText();
				if (pred instanceof ExprNode.New){ // may be qualified by class name
					if (n.indexOf('.') != -1) 
						n = n.substring(n.lastIndexOf('.')+1);
				}

				IScope sc = s != null ? s.derefScope(false) : null;
				symbol = sc != null ? sc.lookupName(n) : null;
				
				if (symbol == null) { // try host
					sc = s != null ? s.derefScope(true) : null;
					symbol = sc != null ? sc.lookupName(n, true) : null;
				}
				
				postExpr = (symbol != null) ? true : false;
				
				if (symbol != null && symbol.node() instanceof DeclNode) {
					DeclNode d = (DeclNode) symbol.node();
					boolean accessible = d.flagsContains(Flags.PUBLIC);
					accessible |= (d.getUnit() == currUnit.getCurrUnitNode());
					symbol = (accessible) ? symbol : null;
				}
			}

			if (symbol == null)
				symbol = currUnit.getSymbolTable().resolveSymbol(getName(),
						true);
			if (symbol == null) {
				currUnit.reportSeriousError(
						currUnit.getCurrUnitNode(),
						"'"
								+ ParseUnit.current().getNameForMessage(
										this.getName().getText())
								+ "': identifier is not declared in (or not visible to) the current scope "
								+ currUnit.getSymbolTable().curScope()
										.getScopeName());
			} else {

				if (symbol.node() instanceof DeclNode.Var
						&& ((DeclNode.Var) symbol.node()).isIntrinsic())
					((DeclNode.Var) symbol.node()).setIntrinsicUsed(true); // only
																			// emit
																			// if
																			// used
				// check for proper access (public /private )
				UnitNode unitDcln = (symbol.scope() instanceof DeclNode.Usr) ? ((DeclNode.Usr) symbol
						.scope()).getUnit() : null;
				unitDcln = (symbol.node() instanceof DeclNode && ((DeclNode) symbol
						.node()).isPublic()) ? null : unitDcln; // don't check
				unitDcln = unitDcln == ParseUnit.current().getCurrUnitNode() ? null
						: unitDcln; // don't check
				unitDcln = (!(symbol.node() instanceof BaseNode)) ? null
						: unitDcln; // don't check
				unitDcln = symbol.node() instanceof DeclNode.TypedMember
						&& ((DeclNode.TypedMember) symbol.node())
								.isProtocolMember() ? null : unitDcln;
				if (unitDcln != null) { //
					boolean accessOK = false;

					if (currUnit.getSymbolTable().insidePresetInitializer()) {
						accessOK = true;
					}

					if (!accessOK)
						ParseUnit.current().reportSeriousError(
								this.getName(),
								"private member cannot be accessed outside its declaring scope (which was "
										+ unitDcln.getQualName() + ")");
				}
			}
			return super.pass2Begin();
		}

		protected boolean passNBegin() {
			DeclNode node = (DeclNode) (this.getSymbol() != null
					&& this.getSymbol().node() instanceof DeclNode ? this
					.getSymbol().node() : null);
			if (node != null)
				node.setUnitUsedForExpr(this);
			return false;
		}

		@Override
		protected void pass2End() {
			if (ParseUnit.isIntrinsicCall(this.getName().getText()))
				return;

			if (qualifier == null) {
				if (getName().getText().indexOf('.') != -1) {
					String n = getName().getText();
					n = n.substring(0, n.lastIndexOf('.'));
					qualifier = ParseUnit.current().getSymbolTable()
							.lookupName(n, false);
					if (qualifier == null)
						qualifier = ParseUnit.current().getSymbolTable()
								.curScope().lookupName(n, true);

					this.setQualifier(qualifier);

				}
			}
			if (symbol == null) {
				symbol = ParseUnit
						.current()
						.getSymbolTable()
						.resolveSymbol(getName(),
								ParseUnit.current().getSymbolTable().curScope());
				if (symbol == null) {
					ParseUnit
							.current()
							.reportSeriousError(
									ParseUnit.current().getCurrUnitNode(),
									"'"
											+ ParseUnit.current()
													.getNameForMessage(
															this.getName()
																	.getText())
											+ "': identifier is not declared in (or not visible to) the current scope "
											+ ParseUnit.current()
													.getSymbolTable()
													.curScope().getScopeName());
				} else {
					setSymbol(symbol);
				}
			}
			if (symbol != null) {
				if (symbol.node() instanceof DeclNode.Var
						&& ((DeclNode.Var) symbol.node()).isConst())
					isConst = true;
				if (symbol.node() instanceof DeclNode.EnumVal)
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
						thisPtr = true; // a class var accessed within a method
										// belonging to its class
					}
				}
				exprCat = this.getCat(); 

			}
			
			for (int i = 0; i < this.getChildCount(); i++) {
				BaseNode b = (BaseNode) this.getChild(i);
				if (b instanceof ExprNode.Call)
					postExprCallCount++;
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

		protected boolean pass1Begin() {
			super.pass1Begin();

			if (getTyp() != null)
				getTyp().pass1Begin();

			return true;
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
			if (symbol != null && symbol.node() != null) {
				exprCat = symbol.node().getTypeCat();
			}
			return super.pass2Begin();
		}

		@Override
		protected void pass2End() {

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
			ParseUnit currUnit = ParseUnit.current();

			// this used to be pass1Begin() but that creates a requirement
			// that a variable be declared before it is referenced.

			if (!currUnit.getCurrUnitNode().getUnitType().isClass()) {
				// If the class is nested, the unit type may be the containing
				// module. So check further.
				Tree t = this.getParent();
				while (!(t == null || t instanceof DeclNode.Usr))
					t = t.getParent();
				if (!(t instanceof DeclNode.Class))
					currUnit.reportError(this,
							"\'@\' can only be used in \'class\' methods");
			}

			enterSymbol(false);

			return super.pass2Begin();
		}

		/**
		 * Lookup the symbol. Depending on order of dcln / reference may need to
		 * be done twice to resolve. Only an error if there is no symbol after
		 * 2nd lookup.
		 * 
		 * @param isPass2End
		 * 
		 */
		private void enterSymbol(boolean isPass2End) {
			// do the lookup of the deref'd member here, where the self context
			// is known, in case there is a name collision between a local var
			// name and a member name.
			ParseUnit currUnit = ParseUnit.current();
			ExprNode e = (Ident) (getMember() instanceof ExprNode.Ident ? getMember()
					: ((getMember() instanceof ExprNode.Call) ? ((ExprNode.Call) getMember())
							.getName() : null));
			ExprNode.Ident ei = (Ident) (e instanceof ExprNode.Ident ? e : null);

			if (ei != null) {
				if (ei.getName().getText().equals("this")) // in the function
															// symbol table so
															// start there
					symbol = currUnit.getSymbolTable().resolveSymbol(
							ei.getName(), currUnit.getSymbolTable().curScope());
				else {
					IScope scopeToUse = currUnit.getSymbolTable().curScope();
					// scope calculation has the effect of going to unit type
					// scope. fcn body scope
					// can have parameters with same name as module vars.
					while (scopeToUse != null
							&& !(scopeToUse instanceof DeclNode.Usr))
						scopeToUse = scopeToUse.getEnclosingScope();
					if (!(scopeToUse instanceof DeclNode.Usr)) {
						symbol = currUnit.getSymbolTable().resolveSymbol(
								ei.getName(), true);
					} else {
						symbol = scopeToUse.resolveSymbol(ei.getName());
					}
				}

				if (symbol == null && isPass2End) {
					currUnit.reportSeriousError(ei.getName(),
							"identifier is not declared in the current scope "
									+ ParseUnit.current().getSymbolTable()
											.curScope().getScopeName());
				} else {
					ei.setSymbol(symbol);
				}
			} else {
				symbol = currUnit.getSymbolTable().lookupName(
						ParseUnit.current().getUnitName());
				if (symbol == null && isPass2End) {
					currUnit.reportSeriousError(this,
							"identifier is not declared in the current scope "
									+ ParseUnit.current().getSymbolTable()
											.curScope().getScopeName());
				}
			}
		}

		@Override
		protected void pass2End() {
			if (symbol == null)
				enterSymbol(true);
			if (symbol == null)
				return;
			if (symbol.node() instanceof DeclNode.Var
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

		/**
		 * TODO this will not work when the deref is from a post expression (not parent)
		 * @return
		 */
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
		// protected boolean pass2Begin() {
		protected void pass2End() {
			Cat basecat = getBase().getCat();
			boolean dbg = false;
			if (basecat == null)
				dbg = true;
			exprCat = TypeRules.preCheck(basecat);
			// cat1 == Cat.INJECT || cat1 == Cat.UNKNOWN || cat1 instanceof
			// Cat.Error
			if (exprCat != null
					&& (exprCat == Cat.INJECT || exprCat instanceof Cat.Error)) {
				return; // true;
			}
			if (basecat instanceof Cat.Arr) {
				exprCat = ((Cat.Arr) basecat).getBase();
			} else if (basecat instanceof Cat.Scalar
					&& ((Cat.Scalar) basecat).kind() == 's') {
				exprCat = Cat.fromScalarCode(Cat.UINT8);
			}
			if (exprCat == Cat.UNKNOWN) {
				ParseUnit.current().reportError(getBase(),
						"value cannot be indexed");
			}
			// return true;
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
				if (e.getSymbol() != null
						&& e.getSymbol().node() instanceof DeclNode.Fcn) {
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

				boolean isHost = ((ExprNode.Call) this.getChild(0))
						.isConstructorCallOnHostVar();
				if (ParseUnit.current().getSymbolTable().currScopeIsHostFcn()
						&& !isHost) {
					ParseUnit
							.current()
							.reportSeriousError(this,
									"non-host objects cannot be initialized via 'new' in host contexts");
				}

				// check: if this is a host class ref, it must be initialized in
				// a host context
				SymbolEntry se = ((ExprNode.Call) this.getChild(0))
						.getQualifier();
				ISymbolNode sn = se != null ? se.node() : null;
				if (sn instanceof DeclNode) {
					boolean okForHostNew = ParseUnit.current().getSymbolTable()
							.currScopeIsHostFcn()
							|| ParseUnit.current().getSymbolTable().curScope() instanceof DeclNode.Usr;

					if (!okForHostNew && ((DeclNode) sn).isHostClassRef())
						ParseUnit
								.current()
								.reportError(
										this,
										"host objects can only be initalized in host contexts (which are the bodies of types or within host constructors or host functions)");
				}

				exprCat = ((ExprNode.Call) this.getChild(0)).getCat();
			} else {
				exprCat = Cat.fromNew((TypeNode) getChild(TYPE));
			}
			exprCat = exprCat == null ? Cat.fromError(
					"Invalid constructor call", null, null) : exprCat;
			if (exprCat instanceof Cat.Error) {
				ParseUnit.current().reportError(this.getCall().getName(),
						((Cat.Error) exprCat).getMsg());
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
			if (getOperand() instanceof ExprNode.Ident
					&& ((ExprNode.Ident) getOperand()).hasIndexExpr()) {
				ExprNode.Ident id = (Ident) getOperand();
				if (id.getCat() instanceof Cat.Arr)
					return ((Cat.Arr) id.getCat()).getBase();
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
			exprCat = Cat.VECTOR;
		}

		@Override
		void setCat(Cat cat) {
			exprCat = cat;
		}
	}

	// ExprNode

	protected Cat exprCat = Cat.UNKNOWN;
	protected boolean isConst = false;

	protected boolean postExpr = false;
	protected int postExprCallCount = 0;
	/**
	 * Because 'this' is passed as a parameter, postExpr calls need to load the 'this' expr
	 * as a parameter. postExprCallCount is the number of calls after the '.'. 
	 * arr[0].foo() has this equal 1, clsRef.foo() has
	 * this equal 1, clsRef.foo().bar() has this equal 2.
	 * 
	 * @return number of calls after the first '.'.
	 */
	public int getPostExprCallCount() {
		return postExprCallCount;
	}
	public void setPostExprCallCount(int c) {
		postExprCallCount = c;
	}
	/**
	 * Get the predecessor expr whose scope will be the starting scope to lookup the current expr result. 
	 * Dependent on the structure of the syntax tree. It can be the parent, the preceding non-index post expr, or null.
	 * Returning null means use the local scope.
	 * 
	 * This is the structure of the call tree:
	 *          
	 *   ID   id1.call(id2,call())[i].call1()[j].call2().call3()
         |   
        CALL____________________________
        / | \     \_      \_     \_      \_  
       /  |  \       \       \      \       \   
    ID   ARGS IDX    CALL    IDX    CALL    CALL  // post expression list
    NAME LIST 
         /   \   
        /     \   
       ID     CALL

	 * 
	 * @return the predecessor expr or null
	 */
    protected ExprNode getPredecessorExpr() {
    	
    	if (!(this instanceof ExprNode.Call || this instanceof ExprNode.Ident))
    		return null;
    	
		if (!(this.getParent() instanceof ExprNode.Call
				|| this.getParent() instanceof ExprNode.Ident 
				|| this.getParent() instanceof ExprNode.New)) { 
			return null;
		}
    	
    	boolean chkLocal = false;
    	
    	
    	if (this instanceof ExprNode.Ident) {
    		
    		if (this.getParent() instanceof ExprNode.Call) {
    			if (this == this.getParent().getChild(0))
    				// this ID is the fcn name node
    				// get the predecessor expr for the parent call node
    				return ((ExprNode) this.getParent()).getPredecessorExpr();
    			else
    				chkLocal = true;
    		}
    	}
    	
		ExprNode root = (ExprNode) getParent();
		ExprNode term = (ExprNode) this;
		int i = 0;
		ExprNode precede = null;
		ExprNode curr = null;
		for (; i < root.getChildCount(); i++) {
			precede = (!(curr instanceof ExprNode.Index)) ? curr : precede; // only update for non Index exprs
			if (root.getChild(i) instanceof ExprNode) {
				curr = (ExprNode) root.getChild(i);
				if (curr == term) {
					if (i == 0) { // only one child, predecessor is root
						precede = root;
					}
					break;
				}
			}
			else if (i == 0 && root instanceof ExprNode.Ident){ // in this case the child is a BaseNode 
				curr = root;
			}
		}
		if (curr != term)
			return null;
		if (chkLocal) {
			SymbolEntry s = precede instanceof ExprNode.Ident ? ((ExprNode.Ident) precede)
					.getSymbol()
					: (precede instanceof ExprNode.Call ? ((Call) precede)
							.getCalledFcn() : null);
			IScope sc = s.derefScope(false);
			if (sc != ParseUnit.current().getSymbolTable().curScope()) {
				ParseUnit.current().reportSeriousError(this, "'" + ((Ident)this).getName().getText() + "' inaccessible in this context");
			}
		}
		
		return precede;
    }

	/**
	 * 
	 * @return True when this expr or ident is to the right of a '.' else false
	 */
	public boolean isPostExpr() {
		return postExpr;
	}
	public void setPostExpr(boolean pe) {
		postExpr = pe;
	}

	// hashcode(), equals()
	public String nameForHashing(ExprNode e) {
		String n = "";
		if (e.getSymbol() != null && e.getSymbol().node() != null) {
			n += e.getSymbol().node().getDefiningScope().getScopeName() + "."
					+ e.getSymbol().node().getName().getText() + "_";
		}
		n += e.getToken().getText() + "_" + e.getToken().getLine() + "_"
				+ e.getToken().getCharPositionInLine();
		return n;
	}

	public boolean equals(Object o) {
		if (!(o instanceof ExprNode))
			return false;
		if (o == this)
			return true;
		String n1 = nameForHashing((ExprNode) o);
		String n2 = nameForHashing(this);
		if (n1.equals(n2))
			return true;
		return false;
	}

	public int hashCode() {
		return nameForHashing(this).hashCode();
	}

	ExprNode(int ttype, String ttext) {
		this.token = new Atom(ttype, ttext);
	}

	public Cat getCat() {
		return exprCat;
	}
	/**
	 * The 'ultimate cat' is the cat of the resolved final expression, e.g. for
	 *    ref.foo().bar()[i]
	 * it is the cat of the base type of the array returned by bar().
	 * @return the ultimate cat
	 */
	public Cat getUltimateCat() {
		ExprNode ex = this;
		// Get the cat of the 'ultimate' expr
		if (ex.getPostExprCallCount() > 0) {
			BaseNode b = ex;
			int i = 0;
			while (ex.getChild(i) != null) {
				b = (BaseNode) ex.getChild(i++);
			}
			ex = (ExprNode) (b instanceof ExprNode ? b : ex);
		}

		return ex.getCat();
	}

	/**
	 * @return the type character of the ultimate Cat code, e.g. 'u' or 'i'
	 */
	public String getUltimateCatChar() {
		String catChar;
		Cat cat = this.getUltimateCat();
		if (cat instanceof Cat.Arr && this instanceof ExprNode.Ident && ((ExprNode.Ident)this).hasIndexExpr()) {
			catChar = new Character(((Cat.Arr)cat).getBase().code().charAt(0)).toString();
		}
		else if (cat instanceof Cat.Fcn) {
			catChar = new Character(cat.code().charAt(1)).toString();
		}
		else
			catChar = new Character(cat.code().charAt(0)).toString();
		return catChar;
	}

	/**
	 * Handle getSymbol() from either Ident or Self.
	 * @return return null if not Ident or Self with Ident member, else return symbol
	 */
	public SymbolEntry getSymbol() {
		if (this instanceof Ident)
			return ((Ident)this).getSymbol();
		if (this instanceof Self) {
			ExprNode m = ((Self)this).getMember();
			if (m instanceof Ident)
				return ((Ident)m).getSymbol();
		}
		return null;
	}

	public final boolean isConst() {
		return isConst;
	}

	/**
	 * @return if this expression is initialized to a constant value node return
	 *         that node else return null.
	 */
	public ExprNode.Const getConstInitialValue() {
		if (this instanceof ExprNode.Const)
			return (Const) this;
		else {
			if (this.getSymbol() != null) {
				SymbolEntry se = (this).getSymbol();
				ISymbolNode node = se != null ? se.node() : null;
				if (node instanceof ITypeSpecInit
						&& ((ITypeSpecInit) node).getInit() instanceof ExprNode.Const) {
					return (Const) ((ITypeSpecInit) node).getInit();
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
