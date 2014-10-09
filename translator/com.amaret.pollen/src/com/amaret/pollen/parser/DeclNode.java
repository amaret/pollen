package com.amaret.pollen.parser;

import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.amaret.pollen.parser.Cat.Agg;
import com.amaret.pollen.parser.ExprNode.Vec;
import com.amaret.pollen.parser.TypeNode.Usr;
import com.amaret.pollen.target.ITarget.TypeInfo;
import com.amaret.pollen.translator.Generator;

public class DeclNode extends BaseNode implements ISymbolNode {

	// DeclNode.Formal (parameter)
	static public class Formal extends DeclNode implements ITypeSpecInit,
			IOutputName, IOutputQualifiedName {

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

		public String getOutputQNameHost(Generator g, ISymbolNode node,
				IScope sc, EnumSet<Flags> flags) {

			return this.getOutputQNameTarget(g, node, sc, flags); // untested

		}

		public String getOutputQNameTarget(Generator g, ISymbolNode node,
				IScope sc, EnumSet<Flags> flags) {
			IScope scopeOfDcln = sc;
			boolean localsScope = !(scopeOfDcln instanceof UnitNode || scopeOfDcln instanceof DeclNode.Usr);
			String rtn = "";
			if (localsScope) {
				rtn = this.getName().getText();
				rtn += this.getTypeCat().isRef() ? "->" : ".";
			} // else error?
			if (node instanceof DeclNode.Var) {
				rtn += ((DeclNode.Var) node).getOutputNameTarget(g,
						node.getDefiningScope(), EnumSet.of(Flags.IS_POSTEXPR));
			}
			return rtn;
		}

		public String getOutputNameTarget(Generator g, IScope sc,
				EnumSet<Flags> flags) {

			String qn = "";
			boolean thisPtr = flags.contains(Flags.IS_THISPTR);
			thisPtr = thisPtr && !this.getName().getText().equals("this");
			if (thisPtr) {
				return "this->" + this.getName().getText();
			}
			IScope scopeOfDcln = sc;
			boolean localsScope = !(scopeOfDcln instanceof UnitNode || scopeOfDcln instanceof DeclNode.Usr);
			if (localsScope) {
				return this.getName().getText();
			}
			if (scopeOfDcln instanceof UnitNode
					&& ((UnitNode) scopeOfDcln).isComposition()) {
				scopeOfDcln = this.getUnit();
			}
			qn = (scopeOfDcln instanceof UnitNode ? ((UnitNode) scopeOfDcln)
					.getQualName()
					: (scopeOfDcln instanceof DeclNode.Usr) ? ((DeclNode.Usr) scopeOfDcln)
							.getUnitQualName() : "/* ?? scope unknown ?? */");

			String n = this.getName().getText();
			qn = qn + "." + n + g.getAux().mkSuf(this);
			return qn.replace('.', '_');
		}

		public String getOutputNameHost(Generator g, IScope sc,
				EnumSet<Flags> flags) {
			boolean thisPtr = flags.contains(Flags.IS_THISPTR);
			thisPtr = thisPtr && !this.getName().getText().equals("this");
			if (thisPtr) {
				return "this." + this.getName().getText();
			}

			String qn = "";
			ISymbolNode node = this;
			IScope scopeOfDcln = sc;
			boolean localsScope = !(scopeOfDcln instanceof UnitNode || scopeOfDcln instanceof DeclNode.Usr);
			if (localsScope) {
				return this.getName().getText();
			}
			if (this.isMetaArg() && (sc instanceof DeclNode.Usr))
				scopeOfDcln = ((DeclNode.Usr) sc).getUnit();
			if (scopeOfDcln instanceof UnitNode
					&& ((UnitNode) scopeOfDcln).isComposition()) {
				scopeOfDcln = this.getUnit();
			}
			if (scopeOfDcln == g.curUnit())
				return (g.uname() + "." + this.getName().getText());

			qn = (scopeOfDcln instanceof UnitNode ? ((UnitNode) scopeOfDcln)
					.getQualName()
					: (scopeOfDcln instanceof DeclNode.Usr) ? ((DeclNode.Usr) scopeOfDcln)
							.getUnitQualName() : "/* ?? scope unknown ?? */");

			if (scopeOfDcln instanceof DeclNode.Class && !thisPtr
					&& isClassRef())
				qn = g.uname();
			boolean classScopeOfDcln = scopeOfDcln instanceof DeclNode.Class;
			if (classScopeOfDcln) {
				if (thisPtr || g.curUnit().isClass() || g.isClassUnit()) {
					// the scope qualifier is 'this'
					String n = this
							.getName()
							.getText()
							.substring(
									this.getName().getText().lastIndexOf('.') + 1);
					return "this." + n;
				}
			}
			return "$units['" + qn + "']." + node.getName().getText();

		}

		public void callAccessCheck(BaseNode loc, boolean directCall) {
			TypeNode t = this.getTypeSpec();
			if (t != null && t instanceof TypeNode.Usr) {
				SymbolEntry se = ((TypeNode.Usr) t).getSymbol();
				ISymbolNode fcn = se != null ? se.node() : null;
				if (fcn instanceof DeclNode.Fcn) {
					((Fcn) fcn).callAccessCheck(loc, directCall);
				}
			}
		}

		@Override
		public Cat getTypeCat() {
			if (typeCat == null) {
				boolean isRef = false;
				if (this.getTypeSpec() instanceof TypeNode.Usr) {
					TypeNode.Usr t = (com.amaret.pollen.parser.TypeNode.Usr) this
							.getTypeSpec();
					SymbolEntry se = t.getSymbol();
					isRef = true;
					boolean metaPrimitiveType = (se != null
							&& se.node() instanceof ImportNode && ((ImportNode) se
							.node()).isSynthesizedFromMetaPrimitive());
					if (metaPrimitiveType) // type 'T' is actually a uint8 (for
											// example)
						isRef = false;
				}
				typeCat = Cat.fromSymbolNode(this, this.getDefiningScope(),
						isRef, false);
			}
			return typeCat;
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

		/**
		 * if (class) method, the local variables will be dereferenced from a
		 * 'this' ptr. This is also true for class target constructors.
		 * 
		 * @return
		 */
		public boolean isMethod() {
			if (flags.contains(Flags.METHOD))
				return true;
			if (this.getParent() instanceof DeclNode.Fcn) {
				if (((DeclNode.Fcn) this.getParent())
						.isClassTargetConstructor())
					return true;
			}
			return false;
		}
		public void setMethod() {
			flags.add(Flags.METHOD);
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
			if (this.getTypeSpec() instanceof TypeNode.Arr) {
				TypeNode.Arr typeArr = (com.amaret.pollen.parser.TypeNode.Arr) this.getTypeSpec();
				TypeNode base = typeArr.getBase();
				SymbolEntry se = base != null && base instanceof TypeNode.Usr ? ((TypeNode.Usr) base)
						.getSymbol() : null;
				ISymbolNode node = se != null && se.node() != null ? se.node()
						: null;
				if (node != null && node instanceof DeclNode.Usr
						&& !((DeclNode.Usr) node).isClass())
					ParseUnit.current().reportError(this.getName(),
							"Objects as array elements must have class type");
				typeArr.setBaseSymbol(se);
			}


			Cat c = this.getTypeCat();
			if (c instanceof Cat.Agg) {
				if (((Cat.Agg) c).isProtocol() || ((Cat.Agg) c).isComposition()) {
					ParseUnit.current().reportError(
							getName(),
							"formal parameter type error for \'"
									+ ((Cat.Agg) c).aggName()
									+ "\' (protocol not allowed)");
				}
				if (((Cat.Agg) c).isComposition()) {
					// TODO do I need to resolve this down to the module?
					ParseUnit.current().reportError(
							getName(),
							"formal parameter type error for \'"
									+ ((Cat.Agg) c).aggName()
									+ "\' (composition not allowed)");
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
		private boolean initToNull = false;
		private boolean hasHostDim = false;

		// if the dimension size variable is host, it is calculated at host time
		// and then retrieved for the header.
		List<Integer> dimensionSizes = new java.util.ArrayList<Integer>();

		Arr(int ttype, String ttext, EnumSet<Flags> flags) {
			super(ttype, ttext, flags);
		}

		public boolean hasHostDim() {
			return hasHostDim;
		}

		public void callAccessCheck(BaseNode loc, boolean directCall) {
			TypeNode.Arr t = this.getTypeArr();
			SymbolEntry se = t.getBaseSymbol() != null
					&& t.getBaseSymbol().node() instanceof DeclNode.Fcn ? t
					.getBaseSymbol() : null;
			DeclNode.Fcn f = (Fcn) (se != null ? se.node() : null);
			if (f == null)
				return;
			f.callAccessCheck(loc, false); // a call through an array element is
											// never direct
		}

		/**
		 * Return the TypeNode.Arr (not the element type)
		 * @return
		 */
		public TypeNode.Arr getTypeArr() {
			return (TypeNode.Arr) getChild(BASE);
		}

		/**
		 * Return the element type TypeNode for the array.
		 */
		@Override
		public TypeNode getTypeSpec() {
			TypeNode.Arr t = (TypeNode.Arr) getChild(BASE);
			return t.getBase();
		}

		/**
		 * Return the Cat.Arr for the array.
		 */
		@Override
		public Cat getTypeCat() {
			if (typeCat == null) {
				typeCat = Cat.fromType(this.getTypeArr());
				if (!hasDim()) {
					((Cat.Arr)typeCat ).setNoDim(true);
				}
				// typeCat = Cat.fromSymbolNode(this, this.getDefiningScope());
			}
			return typeCat;

			// if (typeCat == null && this.getTypeSpec() instanceof
			// TypeNode.Usr) {
			// String code = Cat.Scalar.codeFromString(((TypeNode.Usr)
			// this.getTypeSpec()).getName().getText());
			// if (code != null) {
			// typeCat = Cat.fromScalarCode(code);
			// return typeCat;
			// }
			// }
			// return super.getTypeCat();
		}

		@SuppressWarnings("unchecked")
		public ListNode<ExprNode> getDim() {
			return getChildCount() > DIM ? (ListNode<ExprNode>) getChild(DIM)
					: null;
		}

		/**
		 * 
		 * @return first dimension TODO delete and replace with getDim() after
		 *         multi-dim is implemented
		 */
		@SuppressWarnings("unchecked")
		public ExprNode getFirstDim() {
			if (getChildCount() <= DIM)
				return null;
			ListNode<ExprNode> child = (ListNode<ExprNode>) getChild(DIM);
			if (child.getElems().isEmpty())
				return null;
			BaseNode b = child.getElems().get(0);
			if (b instanceof ExprNode) {
				return (ExprNode) b;
			} else
				return null;
		}

		/**
		 * 
		 * @return if the dimension size has been calculated at host time it
		 *         will be stored here for header generation.
		 */
		public int getFirstDimSize() {
			if (dimensionSizes.size() > 0)
				return dimensionSizes.get(0);
			return -1;
		}

		// TODO update these for multidimensional arrays
		/**
		 * Save the size for header generation. Called when the array is alloc'd
		 * in javascript.
		 * 
		 * @param i
		 */
		public void setFirstDimSize(int i) {
			if (hasHostDim()) {
				String msg = "Array '"
						+ getName().getText()
						+ "' has computed size. The final value for the computed size for all instances of the array will be the last one calculated.";
				ParseUnit.current().reportWarning(this, msg);
			}
			if (dimensionSizes.size() == 0)
				dimensionSizes.add(i);
			else
				dimensionSizes.set(0, i);
		}

		@Override
		public Atom getName() {
			return ((BaseNode) getChild(NAME)).getAtom();
		}

		/**
		 * E.g. uint8 arr[] //is dimensionless
		 * 
		 * @return
		 */
		public boolean hasDim() {
			if (getInit() instanceof ExprNode.Vec)
				return true;
			ExprNode e = this.getFirstDim();
			if (e instanceof ExprNode.Const) {
				if (((ExprNode.Const) e).getValue().getText()
						.equals(ParseUnit.ARRAY_WITHOUT_DIMENSION)) {
					return false;
				}
			}
			return true;
		}

		@Override
		public void pass2End() {
			UnitNode u = ParseUnit.current().getCurrUnitNode();

			TypeNode base = this.getTypeArr().getBase();
			SymbolEntry se = base != null && base instanceof TypeNode.Usr ? ((TypeNode.Usr) base)
					.getSymbol() : null;
			ISymbolNode node = se != null && se.node() != null ? se.node()
					: null;
			if (node != null && node instanceof DeclNode.Usr
					&& !((DeclNode.Usr) node).isClass())
				ParseUnit.current().reportError(this.getName(),
						"Objects as array elements must have class type");
			getTypeArr().setBaseSymbol(se);

			if (!this.isHost() && u.isComposition()
					&& (this.getDefiningScope() instanceof DeclNode.Usr)) {
				ParseUnit.current().reportError(this.getName(),
						"compositions can only declare host variables");
			}
			if (this.isHost()) {
				ExprNode.Const ex = this.getFirstDim().getConstInitialValue();
				if (ex != null && ex.getValue().getText().equals("-1")
						&& this.getInit() == null)
					ParseUnit
							.current()
							.reportError(
									this,
									this.getName().getText()
											+ ": host arrays must be declared with dimension, initializer, or both");
			}
			// checkDims(); // moved to codegen
			checkDimExprs();

			ExprNode.Vec v = checkInits();

			TypeNode.Arr arrt = this.getTypeArr();
			SymbolEntry se2 = arrt.getBaseSymbol();
			ISymbolNode node2 = se2 != null ? se2.node() : null;
			if (node2 instanceof ITypeKind
					&& (((ITypeKind) node2).isClass() || ((ITypeKind) node2)
							.isProtocol())) {
				if (!this.isHost())
					// If this is an array of references, set flag in the
					// TypeNode of the base type.
					arrt.setReferenceElems(true);
				this.clearHost(); // C const arrays get a warning if you assign
									// an element of a const array to a non
									// const variable
			}

			if (v != null) {
				SymbolEntry symbol = ParseUnit.current().getSymbolTable()
						.resolveSymbol(getName());
				v.setSymbol(symbol);
			}
			super.pass2End();
		}

		/**
		 * 
		 * @return true if elements are references to class or protocol type
		 *         (not instances)
		 */
		public boolean isReferenceElems() {
			TypeNode.Arr arrt = this.getTypeArr();
			return arrt.isReferenceElems();
		}

		private void checkDimExprs() {
			List<ExprNode> dim = getDim().getElems();
			boolean invalidFlag = !(dim.get(0) instanceof ExprNode.Const || dim
					.get(0) instanceof ExprNode.Ident)
					|| dim.get(0).getChildCount() > 1;
			if (invalidFlag) {
				ParseUnit.current().reportError(
						this,
						this.getName().getText()
								+ ": invalid expression for array dimension");
				return;
			}
			ExprNode e = this.getFirstDim();
			if (e instanceof ExprNode.Const) {
				if (((ExprNode.Const) e).getValue().getText()
						.equals(ParseUnit.ARRAY_WITHOUT_DIMENSION)) {
					// if (!(this.getDefiningScope() instanceof DeclNode.Usr))
					// not an error anymore
					// ParseUnit.current().reportError(this,
					// "array without dimension can only be declared in class or module scope");
				}
			}
			TypeNode.Usr t = (com.amaret.pollen.parser.TypeNode.Usr) (this
					.getTypeSpec() instanceof TypeNode.Usr ? this.getTypeSpec()
					: null);
			if (t != null && t.isFunctionRef()) {
				// for functions called via arrays of function refs, mark their
				// unit of dcln used.
				ISymbolNode calledFcn = t.getSymbol() != null ? t.getSymbol()
						.node() : null;
				// because arrays can be passed around, the directCall flag is
				// false.
				((DeclNode) calledFcn).callAccessCheck(this, false);
				ExprNode.Vec eVec = (Vec) (this.getInit() instanceof ExprNode.Vec ? this
						.getInit() : null);
				if (eVec != null)
					for (ExprNode i : eVec.getVals()) {
						ISymbolNode calledFcnArrayElem = i.getSymbol() != null ? i.getSymbol().node()
								: null;
						if (calledFcnArrayElem != null)
							((DeclNode) calledFcnArrayElem)
							.callAccessCheck(this, false);
					}
			}

			// this condition means we had '[x]' instead of '[constExpr]' for
			// size
			if (dim.get(0) instanceof ExprNode.Ident) {
				SymbolEntry se = ((ExprNode.Ident) dim.get(0)).getSymbol();
				ISymbolNode node = se != null ? se.node() : null;
				if (node instanceof DeclNode.Var) {
					DeclNode.Var v = (Var) node;
					if (!v.isHost())
						return;
					hasHostDim = true;
					// a host variable sets the dimension
					v.setArrayForDimensionVar(this);
				}
			}
		}

		/**
		 * Check for legal dimension specifier
		 */
		public void checkDims() {
			List<ExprNode> dim = getDim().getElems();
			if (dim.size() > 1) {
				// TODO handle > 1 dimension
				// checks will need to be updated.
				ParseUnit.current().reportError(this.getName(),
						"multi-dimensional arrays not yet implemented");
			}
			// this condition means we had '[x]' instead of '[constExpr]' for
			// size
			if (dim.get(0) instanceof ExprNode.Ident) {
				SymbolEntry se = ((ExprNode.Ident) dim.get(0)).getSymbol();
				ParseUnit.current().initPreset(se);
				ISymbolNode node = se != null ? se.node() : null;
				if (node instanceof DeclNode.Var) {
					DeclNode.Var v = (Var) node;
					SymbolEntry se2 = v.getDefiningScope().lookupName(
							v.getName().getText());
					boolean errFlag = !(v.isConst() || ParseUnit.current()
							.isPreset(se2));
					if (!this.isHost() && errFlag)
						errFlag = !v.isHost();
					String errMsg = "";
					// A host array must have constant or preset dimensions.
					// A target array must have constant or preset or host
					// dimensions.
					// Note that constant can mean a variable set to a numeric
					// literal:
					// at init time, the literal value will be used.
					if (errFlag) {
						errMsg = "if specified, array dimensions must be constant or preset";
						if (!this.isHost()) {
							errMsg += " or host";
						}
					}
					if (errFlag)
						ParseUnit.current().reportError(this.getName(), errMsg);
				}
			}
		}

		/**
		 * Initialize the element nodes with ExprNodes.
		 * 
		 * @return the initializing vector
		 */
		private ExprNode.Vec checkInits() {
			if (!(getInit() instanceof ExprNode.Vec))
				return null;
			ExprNode.Vec v = (Vec) getInit();
			List<ExprNode> elemVals = v.getVals();
			for (ExprNode elv : elemVals) {
				if (elv instanceof ExprNode.New && !this.isHost()) {
					// When malloc style init is implemented this may become legal but currently it won't work: the
					// non-host array expects pointer elements which don't exist with the result of bad alignment (segv).  
					ParseUnit.current().reportSeriousError(this, this.getName().getText() + ": an array declaration with constructor calls as array element initializers must be declared host");
					break;
				}
			}
			
			int exprs = (v != null && v.getVals() != null) ? v.getVals().size()
					: 0;
			List<ExprNode> dim = getDim().getElems();

			int dims = dim.get(0) instanceof ExprNode
					&& ((ExprNode) dim.get(0)).getConstInitialValue() != null ? Integer
					.valueOf(((ExprNode) dim.get(0)).getConstInitialValue()
							.getValue().getText()) : -1;

			if (exprs > 0 && exprs > dims
					&& dim.get(0) instanceof ExprNode.Const)
				// set dims to # of initializer exprs
				((ExprNode.Const) dim.get(0)).getValue().setText(
						String.valueOf(exprs));

			// 'uint8 arr[3] = {1}' will become 'uint8 arr[3] = {1, 1, 1}'
			if (exprs == 1 && dims > 1) {
				ExprNode e = v.getVals().get(0);
				for (int i = exprs; i < dims; i++) {
					v.getVals().add(e);
				}
				ExprNode.Const vc = e.getConstInitialValue();
				if (vc != null && vc.getValue().getText().equals("null")) {
					initToNull = true; // an array of references
				}
			}
			return v;
		}

		@Override
		public ExprNode getInit() {

			return (ExprNode) (getChildCount() > INIT ? getChild(INIT) : null);
		}

		/**
		 * 
		 * @return a List of initializers
		 */
		@SuppressWarnings("unchecked")
		public ListNode<ExprNode> getInitList() {
			return getChildCount() > INIT ? (ListNode<ExprNode>) getChild(INIT)
					: null;

		}
	}

	// DeclNode.EnumVal
	static public class EnumVal extends DeclNode implements IOutputName {

		static private final int VAL = 1;

		EnumVal(int ttype, String ttext, EnumSet<Flags> f) {
			super(ttype, ttext, f);
		}

		/**
		 * If the enum value is referenced in a used unit mark the enum
		 * declaration unit as used.
		 * 
		 * @param loc
		 *            the location of use.
		 */
		public void setUnitUsedForExpr(BaseNode loc) {
			BaseNode up = loc.getParentOfType(UnitNode.class);
			if (up != null && ((UnitNode) up).isUnitUsed()) {
				this.getUnit().setUnitUsed(true);
			}
		}

		public Atom getVal() {
			// grammar requires integer literal
			// Note parser synthesizes if value is missing
			return ((BaseNode) this.getChild(VAL)).getAtom();
		}

		public String getOutputNameTarget(Generator g, IScope sc,
				EnumSet<Flags> flags) {
			String qn = "";
			if (sc == null)
				return qn;
			IScope scopeOfDcln = sc;
			if (scopeOfDcln instanceof DeclNode.Usr
					&& !((ITypeKind) scopeOfDcln).isClass()) {
				scopeOfDcln = scopeOfDcln.getEnclosingScope();
			}
			qn = (scopeOfDcln instanceof UnitNode ? ((UnitNode) scopeOfDcln)
					.getQualName()
					: (scopeOfDcln instanceof DeclNode.Usr) ? ((DeclNode.Usr) scopeOfDcln)
							.getUnitQualName() : "/* ?? scope unknown ?? */");

			if (this.getDefiningScope() instanceof ISymbolNode)
				qn += "."
						+ ((ISymbolNode) this.getDefiningScope()).getName()
								.getText();
			String n = this.getName().getText();
			qn = qn + "." + n + g.getAux().mkSuf(this);
			return qn.replace('.', '_');

		}

		public String getOutputNameHost(Generator g, IScope sc,
				EnumSet<Flags> flags) {
			boolean thisPtr = flags.contains(Flags.IS_THISPTR);

			String qn = "";
			if (sc == null)
				return qn;

			IScope scopeOfDcln = sc;
			String enumName = "";
			if (scopeOfDcln instanceof DeclNode.Usr) {
				if (((ITypeKind) scopeOfDcln).isEnum()) {
					enumName = ((DeclNode.Usr) scopeOfDcln).getName().getText()
							+ "_";
					scopeOfDcln = scopeOfDcln.getEnclosingScope();
				}
				if (!(scopeOfDcln instanceof UnitNode)
						&& !((ITypeKind) scopeOfDcln).isClass()) {
					scopeOfDcln = scopeOfDcln.getEnclosingScope();
				}
				if (scopeOfDcln == g.curUnit())
					return (g.uname() + "." + enumName + this.getName()
							.getText());
			}

			qn = (scopeOfDcln instanceof UnitNode ? ((UnitNode) scopeOfDcln)
					.getQualName()
					: (scopeOfDcln instanceof DeclNode.Usr) ? ((DeclNode.Usr) scopeOfDcln)
							.getUnitQualName() : "/* ?? scope unknown ?? */");

			if (scopeOfDcln instanceof DeclNode.Class && !thisPtr
					&& isClassRef())
				qn = g.uname();
			return "$units['" + qn + "']." + enumName
					+ this.getName().getText();
		}
	}

	// DeclNode.Inject
	// for type features consisting of injected code.
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
	static public class Fcn extends DeclNode implements ITypeSpec, IScope,
			IOutputQualifiedName {

		static final private int TYPE_NAME = 0;
		static final private int FORMALS = 1;
		static final private int THIS_PTR = 2;
		static final private int BODY = 3;

		// subtree
		static final private int TYPE = 0;
		static final private int NAME = 1;
		static final private int TYPE_LST = 0;

		private NestedScope scopeDeleg = new NestedScope(this);

		Fcn(int ttype, String ttext, EnumSet<Flags> flags) {
			super(ttype, ttext, flags);
			if (ParseUnit.current().getParseUnitFlags().contains(Flags.CLASS)
					&& !(flags.contains(Flags.CONSTRUCTOR))
					&& !(flags.contains(Flags.HOST))) {
				this.flags.add(Flags.METHOD);
			}
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
				} else if (arg.getInit() == null) {
					ParseUnit.current().reportError(arg.getName(),
							"default argument value required");
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

		public String getOutputQNameTarget(Generator g, ISymbolNode qualifier,
				IScope sc, EnumSet<Flags> flags) {

			if (sc == null)
				return this.getName().getText();
			boolean thisPtr = flags.contains(Flags.IS_THISPTR);
			boolean postExpr = flags.contains(Flags.IS_POSTEXPR);
			if (postExpr) {
				return this.getName().getText();
			}
			IScope scopeOfDcln = sc;
			if (scopeOfDcln instanceof ImportNode
					&& ((ImportNode) scopeOfDcln).isExport()) {
				// an exported function
				scopeOfDcln = this.getUnit();
			}

			boolean localsScope = !(scopeOfDcln instanceof UnitNode || scopeOfDcln instanceof DeclNode.Usr); // ||
																												// scopeOfDcln
																												// instanceof
																												// ImportNode);

			if (localsScope) {
				String scopeQualifier = thisPtr
						&& !this.getName().getText().equals("this") ? "this->"
						: "";
				return scopeQualifier + this.getName().getText();
			}
			if (scopeOfDcln instanceof UnitNode
					&& ((UnitNode) scopeOfDcln).isComposition()) {
				scopeOfDcln = this.getUnit();
			}
			String rtn = this.cname();
			String qn = (scopeOfDcln instanceof UnitNode ? ((UnitNode) scopeOfDcln)
					.getQualName()
					: (scopeOfDcln instanceof DeclNode.Usr) ? ((DeclNode.Usr) scopeOfDcln)
							.getUnitQualName() : "/* ?? scope unknown ?? */");

			if (rtn.indexOf(".") == -1) {
				qn = qn + "." + rtn + g.getAux().mkSuf(this);
				return qn.replace('.', '_');
			}
			String qual = rtn.substring(0, rtn.indexOf("."));
			if (qualifier != null) {
				if (qualifier instanceof ImportNode) {
					if (((ImportNode) qualifier).isSynthesizedFromMeta()) {
						// first qualifier is spurious
						rtn = rtn.substring(rtn.indexOf(".") + 1);
					}
					if (((ImportNode) qualifier).getName().getText()
							.equals(qual)) {
						// first qualifier is spurious
						rtn = rtn.substring(rtn.indexOf(".") + 1);
					}
				}
			}
			qn = qn + "." + rtn + g.getAux().mkSuf(this);
			return qn.replace('.', '_');
		}

		public String getOutputQNameHost(Generator g, ISymbolNode qualifier,
				IScope sc, EnumSet<Flags> flags) {
			boolean thisPtr = flags.contains(Flags.IS_THISPTR);
			boolean isPostExpr = flags.contains(Flags.IS_POSTEXPR);
			String qn = "";
			if (sc == null)
				return this.getName().getText();

			IScope scopeOfDcln = sc;
			if (scopeOfDcln instanceof ImportNode
					&& ((ImportNode) scopeOfDcln).isExport()) {
				// an exported function
				scopeOfDcln = ((ImportNode) scopeOfDcln).getUnit(); 
			}
			if (scopeOfDcln instanceof UnitNode
					&& ((UnitNode) scopeOfDcln).isComposition()) {
				scopeOfDcln = this.getUnit();
			}
			if (scopeOfDcln != g.curUnit() && qualifier == null)  {
				// check for cascaded ref, e.g. qualifier precedes this name in an expr, such as foo().bar()
				IScope isc = scopeOfDcln;
				while (isc != null && !(isc instanceof UnitNode))
					isc = isc.getEnclosingScope();
				if (isc != null && isc != g.curUnit() && isPostExpr)
					return this.getName().getText(); // no qualifiers
				return (g.uname() + "." + this.getName().getText());
			}

			if (scopeOfDcln == g.curUnit() || qualifier == null)  {
				return (g.uname() + "." + this.getName().getText());
			}

			qn = (scopeOfDcln instanceof UnitNode ? ((UnitNode) scopeOfDcln)
					.getQualName()
					: (scopeOfDcln instanceof DeclNode.Usr) ? ((DeclNode.Usr) scopeOfDcln)
							.getUnitQualName() : "/* ?? scope unknown ?? */");

			if (scopeOfDcln instanceof DeclNode.Class && !thisPtr
					&& isClassRef())
				qn = g.uname();
			boolean classScopeOfDcln = scopeOfDcln instanceof DeclNode.Class;
			if (classScopeOfDcln) {
				if (thisPtr || g.curUnit().isClass() || g.isClassUnit()) {
					// the scope qualifier is 'this'
					String n = this
							.getName()
							.getText()
							.substring(
									this.getName().getText().lastIndexOf('.') + 1);
					return "this." + n;
				}
			}
			return "$units['" + qn + "']." + this.getName().getText();

		}

		/**
		 * This is a ptr to class data added to class method calls,
		 * declarations, and definitions. Not a part of the signature for typing
		 * purposes.
		 * 
		 * @return the synthesized 'this' ptr
		 */
		public DeclNode.Formal getThisPtr() {
			DeclNode.Formal thisPtr = ((DeclNode.Formal) getChild(THIS_PTR));
			if (this.isMethod())
				thisPtr.setMethod();
			return thisPtr;
		}

		@Override
		public IScope getEnclosingScope() {
			return scopeDeleg.getEnclosingScope();
		}

		@Override
		public Set<Map.Entry<String, SymbolEntry>> getEntrySet() {
			return scopeDeleg.getEntrySet();
		}

		@SuppressWarnings("unchecked")
		@Override
		public TypeNode getTypeSpec() {
			// TODO
			// this returns the first child in a list
			// implement the list of types as the return type
			return (!this.getReturnList().isEmpty()) ? this.getReturnList()
					.get(0) : null;
		}

		/**
		 * 
		 * @return a List of the return types
		 */
		@SuppressWarnings("unchecked")
		public List<TypeNode> getReturnList() {
			DeclNode.FcnTyp b = (DeclNode.FcnTyp) getChild(TYPE_NAME);
			TypeNode.Lst t = (TypeNode.Lst) b.getChild(TYPE);
			ListNode<TypeNode> child = (ListNode<TypeNode>) t
					.getChild(TYPE_LST);
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

		public boolean isModuleHostConstructor() {
			if (!flags.contains(Flags.CONSTRUCTOR))
				return false;
			if (getName().getText().equals(ParseUnit.CTOR_MODULE_HOST))
				return true;
			return false;
		}

		public boolean isModuleTargetConstructor() {
			if (!flags.contains(Flags.CONSTRUCTOR))
				return false;
			if (getName().getText().equals(ParseUnit.CTOR_MODULE_TARGET))
				return true;
			return false;
		}

		public boolean isClassHostConstructor() {
			if (!flags.contains(Flags.CONSTRUCTOR))
				return false;
			if (getName().getText().equals(ParseUnit.CTOR_CLASS_HOST))
				return true;
			return false;
		}

		public boolean isClassTargetConstructor() {
			if (!flags.contains(Flags.CONSTRUCTOR))
				return false;
			if (getName().getText()
					.substring(getName().getText().lastIndexOf(".") + 1)
					.equals(ParseUnit.CTOR_CLASS_TARGET))
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

			// comment this out because all classes treated as nested due to
			// IScope outer = (scope != null) ? scope.getEnclosingScope() :
			// null;
			// class name is a qualifier added to name only for nested class.
			// cls = scope instanceof DeclNode.Class && (outer instanceof
			// DeclNode.Usr) ? (DeclNode.Class) scope : null;

			cls = scope instanceof DeclNode.Class ? (DeclNode.Class) scope
					: null;
			cname = (cls == null) ? ("" + getName()) : ("" + cls.getName()
					+ "_" + getName());

			return cname;

		}

		public DeclNode.Class getFcnClass() {
			if (cls == null)
				cname();
			return cls;
		}

		public boolean isPresetInitializer() {
			return flags.contains(Flags.PRESET);
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

		/**
		 * 
		 * @return true if a class (non-host, non-constructor) function else
		 *         false
		 */
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
				if (isMethod()) {
					String n = getName().getText();
					n = "'" +n.substring(0,n.indexOf("_")) + "." + n.substring(n.lastIndexOf("_")+1) + "'";
					currUnit.reportError(this,
				        	n + ": pollen lifecycle functions must be defined in modules");
				}
				else {
					ParseUnit.current().putPollenFunction(name.getText());
				}
			}

			IScope scopeToUse = currUnit.getSymbolTable().curScope();
			IScope is = currUnit.getSymbolTable().curScope();
			if (is instanceof DeclNode.Usr
					&& ((Usr) is).getScopeDeleg().lookupName(name.getText()) != null)
				currUnit.reportError(name,
						"identifier already defined in the current scope");
			if (is instanceof DeclNode.Usr
					&& ((Usr) is).getScopeHost().lookupName(name.getText()) != null)
				currUnit.reportError(name,
						"identifier already defined in the current scope");

			// Host functions go in a host scope
			if (isHost() && scopeToUse instanceof DeclNode.Usr)
				scopeToUse = ((DeclNode.Usr) scopeToUse).getScopeHost();

			scopeToUse.defineSymbol(name, this);

			currUnit.getSymbolTable().enterScope(this);
			currUnit.getCurrUnitNode().setHostScope(isHost());

			boolean isClass = (this.getEnclosingScope() instanceof DeclNode.Usr && ((DeclNode.Usr) this
					.getEnclosingScope()).isClass()) ? true : false;

			if (this.isConstructor()) {
				if (!isClass && this.getFormals().size() > 0) {
					ParseUnit
							.current()
							.reportError(this,
									"module constructors are not allowed to have parameters");
				}
			}

			if (currUnit.getCurrUnitNode().isProtocol()
					&& this.getBody() != null) {
				currUnit.reportError(getName(),
						"protocols can't have function definitions");
				return false;
			}

			String path[] = getName().getText().split("\\.");
			if (path.length > 2) {
				currUnit.reportError(getName(),
						"too many levels of qualification");
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
			if (this.isPresetInitializer())
				this.getUnit().setUnitUsed(true);
			return true;
		}

		@Override
		public void pass2End() {
			Cat.Fcn c = (com.amaret.pollen.parser.Cat.Fcn) (this.getTypeCat() instanceof Cat.Fcn ? this
					.getTypeCat() : null);
			if (c != null) {
				for (Cat formalCat : c.argCats()) {
					if (formalCat.isAggTyp()) {
						String t = "";
						if (((Cat.Agg) formalCat).isComposition())
							t = "composition";
						else if (((Cat.Agg) formalCat).isModule())
							t = "module";
						else if (((Cat.Agg) formalCat).isProtocol())
							t = "protocol";
						if (!t.isEmpty()) {
							ParseUnit
									.current()
									.reportError(
											this,
											"formal parameter type error for \'"
													+ ((Cat.Agg) formalCat)
															.aggName()
													+ "\' ("
													+ t
													+ " not allowed as parameter type)");
							continue;
						}
					}
				}
			}
			ParseUnit.current().getSymbolTable().leaveScope();
			ParseUnit.current().getCurrUnitNode().setHostScope(false);
			super.pass2End();
		}

		/**
		 * Check that this function called is accessible from the call site
		 * 'loc'. This is the ultimate destination of all calls to accessCheck.
		 * This is the only routine (for calls) which marks units called as
		 * used.
		 * 
		 * @param loc
		 *            Where are we?
		 * @param directCall
		 *            false for calls through arrays of function ptrs. Otherwise
		 *            true. Other cases?
		 */
		public void callAccessCheck(BaseNode loc, boolean directCall) {
			IScope fcnScope = ((DeclNode.Fcn) this).getUnit()
					.getOutermostUnit();
			IScope currScope = ParseUnit.current().getCurrUnitNode()
					.getOutermostUnit();
			if (fcnScope != currScope && !((DeclNode.Fcn) this).isPublic()) {
				ParseUnit
						.current()
						.reportSeriousError(
								loc,
								"\'"
										+ this.getName().getText()
										+ "\': function reference must reference an accessible function");
			}

			if (!directCall)
				// always true because these can be passed around: don't enforce
				// visibility (in this way)
				this.getUnit().setUnitUsed(true);
			else if (((DeclNode.Fcn) this).isPublic())
				this.getUnit().setUnitUsed(true);
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
			// BaseNode child = (BaseNode) getChild(TYPE_LST);
			// ListNode<TypeNode> child = (ListNode<TypeNode>)
			// getChild(TYPE_LST);;
			TypeNode.Lst t = (TypeNode.Lst) getChild(TYPE);
			ListNode<TypeNode> child = (ListNode<TypeNode>) t
					.getChild(TYPE_LST);
			return (!child.getElems().isEmpty()) ? child.getElems().get(0)
					: null;
		}

		protected boolean pass1Begin() {

			boolean rtn = super.pass1Begin();
			if (!rtn)
				return false;
			rtn = ((BaseNode) getChild(TYPE_LST)).pass1Begin();
			return rtn;
		}
		
		public void pass2End() {
			if (this.getTypeSpec() instanceof TypeNode.Arr) {
				TypeNode.Arr typeArr = (com.amaret.pollen.parser.TypeNode.Arr) this.getTypeSpec();
				TypeNode base = typeArr.getBase();
				SymbolEntry se = base != null && base instanceof TypeNode.Usr ? ((TypeNode.Usr) base)
						.getSymbol() : null;
				ISymbolNode node = se != null && se.node() != null ? se.node()
						: null;
				if (node != null && node instanceof DeclNode.Usr
						&& !((DeclNode.Usr) node).isClass())
					ParseUnit.current().reportError(this.getName(),
							"Objects as array elements must have class type");
				typeArr.setBaseSymbol(se);
			}

		}

	}

	static public class FcnRef extends DeclNode.TypedMember implements
			ITypeSpecInit {

		static final private int FCN = 0;
		static final private int FORMALS = 1;
		static final private int NAME = 2;
		static final private int RTN = 3;
		static final private int INIT = 3;
		static final private int INIT_WITH_RTN = 4;

		private boolean isVoid = false;

		FcnRef(int ttype, String ttext, EnumSet<Flags> flags) {
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

		public TypeNode getReturnType() {
			if (getChildCount() > RTN) {
				return ((TypeNode) getChild(RTN));
			}
			return null;
		}

		public boolean isVoid() {
			return isVoid;
		}

		@Override
		public Atom getName() {
			return ((BaseNode) getChild(NAME)).getAtom();
		}
		/**
		 * 
		 * @return the DeclNode.Fcn for this FcnRef
		 */
		private DeclNode.Fcn getFcn() {
			Cat cat = this.getTypeCat();
			TypeNode t = this.getTypeSpec();
			IScope is = (cat.isFcnRef() ? ((Cat.Agg) cat).aggScope() : null);
			if (is instanceof DeclNode.FcnRef) {
				t = is instanceof ITypeSpec ? ((ITypeSpec) is).getTypeSpec()
						: null;
			}
			if (t != null && t instanceof TypeNode.Usr) {
				SymbolEntry se = ((TypeNode.Usr) t).getSymbol();
				ISymbolNode fcn = se != null ? se.node() : null;
				if (fcn instanceof DeclNode.Fcn) {
					return (Fcn) fcn;
				}
			}
			return null;
		}


		public void callAccessCheck(BaseNode loc, boolean directCall) {
			DeclNode.Fcn fcn = getFcn();
			if (fcn != null)
				((Fcn) fcn).callAccessCheck(loc, directCall);
		}


		@Override
		protected boolean pass2Begin() {

			super.pass2Begin();
			callAccessCheck(this, true);
			return true;
		}
		/**
		 * Public functions that can be called via function references always get their unit marked used.
		 * (Except for protocols).
		 */
		public void setUnitUsedForExpr(BaseNode exprLoc) {
			DeclNode.Fcn f = getFcn();
			if (f != null && f.isPublic() && !f.getUnit().isProtocol()) {
				f.getUnit().isUnitUsed();
			}			
		}

		public void pass2End() {
			if (getInit() != null) {
				ExprNode e = getInit();
				ISymbolNode initVal = e.getSymbol() != null ? e.getSymbol()
						.node() : null;
				if (initVal != null)
					((DeclNode) initVal).callAccessCheck(this, true);

			}
		}

		@Override
		protected boolean pass1Begin() {
			super.pass1Begin();
			return true;
		}

		@Override
		protected void pass1End() {

			UnitNode u = ParseUnit.current().getCurrUnitNode();
			if (!this.isHost() && u.isComposition()
					&& (this.getDefiningScope() instanceof DeclNode.Usr)) {
				ParseUnit.current().reportError(this.getName(),
						"compositions can only declare host variables");
			}
			ExprNode i = this.getInit();
			if (i instanceof ExprNode.Const
					&& ((ExprNode.Const) i).getValue().getText().equals("null")) {
				TypeNode.Usr t = (TypeNode.Usr) (getTypeSpec() instanceof TypeNode.Usr ? getTypeSpec()
						: null);
				SymbolEntry se = t != null ? t.getSymbol() : null;
				IScope sc = se != null ? se.scope() : null;
				boolean isModule = sc instanceof ITypeKind ? ((ITypeKind) sc)
						.isModule() : false;
				if (isModule) {
					ParseUnit
							.current()
							.reportError(
									this,
									this.getName().getText()
											+ ": module function references cannot be initialized to null");
				}
			}
			super.pass1End();
		}

		public ExprNode getInit() {
			if (flags.contains(Flags.FCN_REF_RTN)) {
				if (getChildCount() > INIT_WITH_RTN) {
					return ((ExprNode) getChild(INIT_WITH_RTN));
				}
			} else {
				if (getChildCount() > INIT) {
					return ((ExprNode) getChild(INIT));
				}
			}
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
		 * @return a BaseNode It may be a TypeNode or a List<TypeNode>. The
		 *         latter is a function with a set of return values.
		 */
		public TypeNode getTypeSpec();
	}

	// DeclNode.ITypeSpecInit
	static public interface ITypeSpecInit extends ITypeSpec {
		public ExprNode getInit();
	}

	// DeclNode.TypedMember
	// For proxy (protocol member) or a member with class type
	static public class TypedMember extends DeclNode.Var implements
			ITypeSpecInit, IScope, IUnitWrapper, ITypeKind,
			IOutputQualifiedName {

		TypedMember(int ttype, String ttext, EnumSet<Flags> f) {
			super(ttype, ttext, f);
		}

		static final private int NAME = 1;
		static final private int TYPE = 0;
		static final private int INIT = 2;

		private UnitNode typeUnit; // the unit for the type of this typed
									// member. NOTE the typeUnit of a nested
									// class is its containing unit.
		boolean isClassRef = false;
		boolean isNestedClassRef = false;

		// for protocol members
		private UnitNode bindToUnit = null; // the module to which this protocol
											// member is bound
		private TypeNode bindToTypeSpec = null; // typeSpec for that module
		private UnitNode bindLocation = null; // module where binding takes
												// place

		private NestedScope scopeDeleg = new NestedScope(this);
		private Cat.Fcn fcnCat = null; // for function references
		private boolean isMetaPrimitive = false; // a TypedMember with a meta
													// type instantiated to a
													// primitive has null
													// typeUnit

		public boolean isMetaPrimitive() {
			return isMetaPrimitive;
		}

		public UnitNode getBindLocUnit() {
			return bindLocation;
		}

		public String getOutputQNameTarget(Generator g, ISymbolNode node,
				IScope sc, EnumSet<Flags> flags) {
			boolean thisPtr = flags.contains(Flags.IS_THISPTR);
			String qn = "";
			if (node == null || sc == null)
				return qn;
			IScope scopeOfDcln = sc;

			boolean localsScope = !(scopeOfDcln instanceof UnitNode || scopeOfDcln instanceof DeclNode.Usr);

			if (localsScope && !this.isProtocolMember()) {
				String scopeQualifier = thisPtr ? "this->" : "";
				return scopeQualifier + this.getName().getText();
			}

			if (this.isProtocolMember()) {
				// qualify to the binding unit
				if (this.getBindToUnit() == null) {
					ParseUnit.current().reportError(
							this,
							"\'" + this.getName().getText()
									+ "\' : unbound protocol member detected");
				} else
					qn = this.getBindToUnit().getQualName();
			}
			boolean isFcnNode = node instanceof DeclNode.Fcn;
			if (qn.isEmpty()) { // a class or fcn ref
				qn = (scopeOfDcln instanceof UnitNode ? ((UnitNode) scopeOfDcln)
						.getQualName()
						: (scopeOfDcln instanceof DeclNode.Usr) ? ((DeclNode.Usr) scopeOfDcln)
								.getUnitQualName()
								: "/* ?? scope unknown ?? */");

				if (this.isNestedClassRef() && !this.getQualName().equals(qn)
						&& !isFcnNode)
					qn += "." + this.getName();

			}
			String n = isFcnNode ? ((DeclNode.Fcn) node).cname() : node
					.getName().getText();
			qn = qn + "." + n + g.getAux().mkSuf(node);
			return qn.replace('.', '_');
		}

		/**
		 * node is the item. sc is the item scope.
		 */
		public String getOutputQNameHost(Generator g, ISymbolNode node,
				IScope sc, EnumSet<Flags> flags) {
			boolean thisPtr = flags.contains(Flags.IS_THISPTR);
			String qn = "";
			if (node == null || sc == null)
				return qn;
			IScope scopeOfDcln = sc;

			if (scopeOfDcln == g.curUnit())
				return (g.uname() + "." + node.getName());

			if (this.isProtocolMember()) {
				// An access to protocol member from outside its dcln scope
				if (sc instanceof DeclNode.Usr
						&& sc != g.curUnit().getUnitType()
						&& !flags.contains(Flags.IS_PROTOMBR_CALL)) {
					qn = ((DeclNode.Usr) sc).getOutputNameHost(g, sc, flags);
					return qn + node.getName().getText();
				}
				// qualify to the binding unit
				if (this.getBindToUnit() == null) {
					ParseUnit.current().reportError(this,
							"Unbound protocol member detected");
				} else
					qn = this.getBindToUnit().getQualName();

				if (flags.contains(Flags.IS_PROTOMBR_CALL)) {
					return "$units['" + qn + "']." + node.getName().getText();
				}
			}
			if (qn.isEmpty()) {
				qn = (scopeOfDcln instanceof UnitNode ? ((UnitNode) scopeOfDcln)
						.getQualName()
						: (scopeOfDcln instanceof DeclNode.Usr) ? ((DeclNode.Usr) scopeOfDcln)
								.getUnitQualName()
								: "/* ?? scope unknown ?? */");

				if (scopeOfDcln instanceof DeclNode.Class && !thisPtr
						&& isClassRef())
					qn = g.uname();
			}
			String s = node.getName().getText();
			if (this != node) {
				s = this.getName().getText() + "." + s;
			}
			if (scopeOfDcln instanceof DeclNode.Class) {
				return qn + "." + s;
			}
			return "/* unimplemented TypedMember case */"; // ??

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
		 * Could be null - if this is a meta type instantiated to a primitive,
		 * e.g. uint8. NOTE For a nested type T in module M, this returns the
		 * unit node for M. If M is a module and T is a class, this will show
		 * the TypedMember to have module not class type. use isClassRef() to
		 * check if this is a reference to a class object.
		 * 
		 * @return the typeUnit type of this member.
		 */
		public UnitNode getTypeUnit() {
			return typeUnit;
		}

		public Cat getTypeCat() {
			if (typeCat == null) {
				if (!this.isMetaPrimitive()) {
					typeCat = Cat.fromSymbolNode(this, this.getDefiningScope());
				} else {
					// the type name is an alias for an imported primitive type
					// (instantiated meta type)
					String n = ((TypeNode.Usr) this.getTypeSpec()).getName()
							.getText();
					SymbolEntry se = ParseUnit.current().getSymbolTable()
							.lookupName(n);
					if (se != null && se.node() instanceof ImportNode) {
						typeCat = Cat.fromScalarString(((ImportNode) se.node())
								.getUnitName().getText());
					} else
						typeCat = Cat.fromScalarString("void");

				}

			}
			return typeCat;
		}

		public Cat getFcnTypeCat() {
			// for function references
			if (fcnCat == null) {
				if (this.getTypeSpec() instanceof TypeNode.Usr) {
					SymbolEntry s = ((TypeNode.Usr) this.getTypeSpec())
							.getSymbol();
					if (s != null && s.node() instanceof DeclNode.Fcn) {
						fcnCat = (Cat.Fcn) s.node().getTypeCat();
						if (!(this instanceof DeclNode.FcnRef)) {
							ParseUnit
									.current()
									.reportError(this.getName(),
											"function reference declarations require a parenthesized parameter type list");
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
			return this.isClassRef;
		}

		public boolean isNestedClassRef() {
			return this.isNestedClassRef;
		}

		public boolean isHostClassRef() {
			return this.isClassRef && this.isHost();
		}

		public boolean isTargetClassRef() {
			return this.isClassRef && !this.isHost();
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
			if (this.getName().getText()
					.equals(ParseUnit.INTRINSIC_PRINT_PROXY))
				intrinsicUsed = true; // always

			UnitNode curr = ParseUnit.current().getCurrUnitNode();
			if (!this.isHost() && curr.isComposition()
					&& (this.getDefiningScope() instanceof DeclNode.Usr)) {
				ParseUnit.current().reportError(this.getName(),
						"compositions can only declare host variables");
			}

			SymbolEntry sym = curr.getUnitType().resolveSymbol(getTypeName());
			ISymbolNode snode = sym != null ? sym.node() : null;
			IScope sc = sym != null ? sym.scope() : null;
			if (snode instanceof DeclNode.Fcn && sc instanceof DeclNode.Class) {
				ParseUnit
						.current()
						.reportError(this.getName(),
								"Function references for class functions are not yet implemented");
			}
			isClassRef = (snode != null && snode instanceof ITypeKind && ((ITypeKind) snode)
					.isClass());
			isNestedClassRef = false;
			if (isClassRef) {
				DeclNode.Usr tmp = (Usr) (snode instanceof DeclNode.Usr ? snode
						: snode instanceof ImportNode ? ((ImportNode) snode)
								.getUnit().getUnitType()
								: snode instanceof ImportNode ? ((ImportNode) snode)
										.getUnit().getUnitType() : null);

				isNestedClassRef = tmp.getContainingType() != null ? true
						: false;

			}
			boolean metaPrimitiveType = (snode instanceof ImportNode && ((ImportNode) snode)
					.isSynthesizedFromMetaPrimitive());

			// note 'host' is supported
			if (flags.contains(Flags.CONST) && !metaPrimitiveType) {
				ParseUnit.current().reportError(
						this.getName(),
						"'const' not supported for typed members ("
								+ this.getName().getText() + ")");
				flags.remove(Flags.CONST);
			}
			if (flags.contains(Flags.VOLATILE) && !metaPrimitiveType) {
				ParseUnit.current().reportError(
						this.getName(),
						"'volatile' not supported for typed members ("
								+ this.getName().getText() + ")");
				flags.remove(Flags.VOLATILE);
			}
			if (flags.contains(Flags.PRESET) && !metaPrimitiveType) {
				ParseUnit.current().reportError(
						this.getName(),
						"'preset' not supported for typed members ("
								+ this.getName().getText() + ")");
				flags.remove(Flags.PRESET);
			}

			// UnitNode typeUnit: The UnitNode that contains the type
			// of this typed member.
			// For a nested type T in module M, that is the unit node for M.
			boolean isSynthFromMeta = false;
			if (snode instanceof ImportNode) {
				typeUnit = ((ImportNode) snode).getUnit();
				isSynthFromMeta = ((ImportNode) snode).isSynthesizedFromMeta();
			} else if (snode instanceof UnitNode) {
				typeUnit = (UnitNode) snode;
			} else if (snode instanceof DeclNode.Fcn
					|| snode instanceof DeclNode.Usr)
				typeUnit = ((DeclNode) snode).getUnit();

			if (typeUnit == null) {
				isMetaPrimitive = true;
				ExprNode i = this.getInit();
				if (i instanceof ExprNode.Const
						&& ((ExprNode.Const) i).getValue().getText()
								.equals("null")) {
					((ExprNode.Const) i).getValue().setText("0");

				}
				// this can happen when meta type is a instantiation to a
				// primitive e.g. uint8
			} else {
				if (typeUnit.isProtocol() && !(snode instanceof DeclNode.Fcn)) {
					flags.add(Flags.PROTOCOL_MEMBER);
					// Just ignore host
					if (this.isHost()) {
						flags.remove(Flags.HOST);
						// ParseUnit
						// .current()
						// .reportError(getName(),
						// "the 'host' specifier on a protocol member declaration is ignored");
					}

				} else {
					String n = typeUnit.getName().getText();
					if (!typeUnit.isClass() && !this.isFcnRef() && !isClassRef
							&& !isSynthFromMeta) {
						ParseUnit
								.current()
								.reportError(getTypeName(),
										"a typed member can have protocol, class, or function type");
					}
				}
				scopeDeleg.addSymbols(typeUnit.getEntrySet());
			}
			return false;
		}

		public void pass2End() {

			if (!(this instanceof ITypeSpecInit)) {
				return;
			}
			ITypeSpecInit tsi = (ITypeSpecInit) this;
			ExprNode init = tsi.getInit();
			if (isPeggedOnDcln()) {
				TypeRules.checkPeg(this, init.getCat(), this);
			} else if (isBoundOnDcln()) {
				if (!(init instanceof ExprNode.Typ)) {
					ParseUnit.current().reportError(this,
							"a protocol member must be bound to a module");
				} else {
					TypeNode t = ((ExprNode.Typ) init).getTyp();
					Cat.Agg src_cat = (Agg) TypeRules
							.checkBind(getTypeCat(), t);
					if (src_cat != null) {
						BaseNode d = (BaseNode) src_cat.aggScope();
						UnitNode u = (UnitNode) ((d instanceof UnitNode) ? d
								: d instanceof DeclNode.Usr ? ((DeclNode.Usr) d)
										.getUnit() : null);
						this.bindModule(u, t); // bind it
					}
				}
			}
			setUses();
		}
		

		public boolean passNBegin() {
			// only used for intrinsics.
			if (isIntrinsic() && isIntrinsicUsed()) {
				ParseUnit.current().getCurrUnitNode().setUnitUsed(true);
				if (bindToUnit != null)
					bindToUnit.setUnitUsed(true);
			}
			setUses();
			return false;
		}

		/**
		 * Only set uses if the bind/peg site is used. 
		 * A pass2 and passN operation.
		 */
		private void setUses() {
			if (!this.getUnit().isUnitUsed())
				return;
			
			if (this.isPeggedOnDcln()) {
				if (this instanceof DeclNode.TypedMember)
					((DeclNode.TypedMember) this).setUnitsUsedForPeg();
			}
			if (this.isBoundOnDcln()) {
				((DeclNode.TypedMember) this)
						.setUnitsUsedForBind((UnitNode) this
								.getParentOfType(UnitNode.class));
			}
		}

		/**
		 * Connect the protocol member to its implementing module unit
		 * (unitNode).
		 * 
		 * @param bindtoTypespec
		 *            After binding, use this type for typeSpec
		 */
		public void bindModule(UnitNode bindtoUnit, TypeNode bindtoTypespec) {
			if (this.isProtocolMember()) {
				if (bindToUnit != null) {
					ParseUnit
							.current()
							.reportError(
									this.getName(),
									"More than one binding encountered for a protocol member. Warning: binding order is indeterminate.");
				}
				bindToUnit = bindtoUnit;
				bindToTypeSpec = bindtoTypespec;
				typeCat = Cat.fromSymbolNode(bindToUnit,
						unit.getDefiningScope());
				bindLocation = ParseUnit.current().getCurrUnitNode();
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

		/**
		 * If a protocol bind, mark unit used for: - site of protocol member
		 * decl - bind to unit - site of bind
		 */
		public void setUnitsUsedForBind(UnitNode bindSite) {

			if (bindToUnit != null) {
				this.getUnit().setUnitUsed(true); 
				bindToUnit.setUnitUsed(true); 
				bindSite.setUnitUsed(true);
			}
		}

		/**
		 * If a TypedMember peg, set unitUsed for: - unit declaring the typed
		 * member - unit type of the typed member
		 * 
		 */
		public void setUnitsUsedForPeg() {
			this.getUnit().setUnitUsed(true); // declaration unit of the typed member

			TypeNode mbrTypeNode = ((DeclNode.TypedMember) this).getTypeSpec();
			if (mbrTypeNode instanceof TypeNode.Usr) {
				SymbolEntry st = ((TypeNode.Usr) mbrTypeNode).getSymbol();
				ISymbolNode stnode = st != null ? st.node() : null;
				Cat c = stnode.getTypeCat();
				if (c instanceof Cat.Agg) {
					Cat.Agg ca = (Agg) c;
					UnitNode mbrUnitType = (UnitNode) (ca.aggScope() instanceof DeclNode.Usr ? ((DeclNode.Usr) ca
							.aggScope()).getUnit()
							: ca.aggScope() instanceof UnitNode ? ca.aggScope()
									: null);
					if (mbrUnitType != null)
						mbrUnitType.setUnitUsed(true);
				}
			}
		}
		/**
		 * For class references: if this expr location used, mark the DeclNode unit as used.
		 * For function references: if the function is public, mark its unit as used.
		 * @param exprLoc
		 */
		public void setUnitUsedForExpr(BaseNode exprLoc) {
			if (this.isClassRef()) {
				BaseNode up = exprLoc.getParentOfType(UnitNode.class);
				if (up != null && ((UnitNode) up).isUnitUsed()) {
					UnitNode u = this.getTypeUnit();
					if (u != null) 					 
						u.setUnitUsed(true);
				}
			}
		}

		@Override
		public TypeNode getTypeSpec() {
			if (bindToTypeSpec != null)
				return bindToTypeSpec;
			return (TypeNode) getChild(TYPE);
		}

		@Override
		public boolean isClass() {
			if (typeUnit != null)
				return typeUnit.isClass();
			return false;
		}

		@Override
		public boolean isComposition() {
			if (typeUnit != null)
				return typeUnit.isComposition();
			return false;

		}

		@Override
		public boolean isEnum() {
			if (typeUnit != null)
				return typeUnit.isEnum();
			return false;
		}

		@Override
		public boolean isModule() {
			if (typeUnit != null)
				return typeUnit.isModule();
			return false;

		}

		@Override
		public boolean isProtocol() {
			if (typeUnit != null)
				return typeUnit.isProtocol();
			return false;
		}

		@Override
		public boolean isReady() {
			return (typeUnit != null);
		}

	}

	static public class Class extends DeclNode.Usr {

		Class(int ttype, String ttext, EnumSet<Flags> flags, String qn) {
			super(ttype, ttext, flags, qn);
		}

	}

	// DeclNode.User a user defined type
	static public class Usr extends DeclNode implements IScope, ITypeInfo,
			ITypeKind, IOutputName {

		static final protected int FEATURES = 1;
		static final protected int EXTENDS = 2;
		static final protected int IMPLEMENTS = 3;
		static final protected int VALS = 1; // enum
		static final protected int META = 4;

		protected DeclNode.Usr containingType = null;
		protected DeclNode.Usr baseType = null; // from extends clause
		protected DeclNode.Usr implementedType = null;
		protected NestedScope scopeDeleg = new NestedScope(this);
		protected NestedScope scopeHost = new NestedScope(this);
		protected String qname = "";
		private boolean qnameSet = false;
		private boolean featuresCheck = false;

		public NestedScope getScopeHost() {
			return scopeHost;
		}

		public NestedScope getScopeDeleg() {
			return scopeDeleg;
		}

		Usr(int ttype, String ttext, EnumSet<Flags> flags, String qn) {
			super(ttype, ttext, flags);
			qname = (qn.equals("NIL")) ? "" : qn;
		}

		public String getOutputNameTarget(Generator g, IScope sc,
				EnumSet<Flags> flags) {
			String qn = "";

			IScope scopeOfDcln = sc;

			if (scopeOfDcln instanceof DeclNode.Usr
					&& !((ITypeKind) scopeOfDcln).isClass()) {
				scopeOfDcln = scopeOfDcln.getEnclosingScope();
			}

			qn = (scopeOfDcln instanceof UnitNode ? ((UnitNode) scopeOfDcln)
					.getQualName()
					: (scopeOfDcln instanceof DeclNode.Usr) ? ((DeclNode.Usr) scopeOfDcln)
							.getUnitQualName() : "/* ?? scope unknown ?? */");

			String n = this.getName().getText();
			qn = qn + "." + n + g.getAux().mkSuf(this);
			return qn.replace('.', '_');

		}

		public String getOutputNameHost(Generator g, IScope sc,
				EnumSet<Flags> flags) {

			String qn = "";
			String name = this.getName().getText();

			IScope scopeOfDcln = sc;

			if (scopeOfDcln instanceof DeclNode.Usr
					&& !((ITypeKind) scopeOfDcln).isClass()) {
				scopeOfDcln = scopeOfDcln.getEnclosingScope();
			}

			qn = (scopeOfDcln instanceof UnitNode ? ((UnitNode) scopeOfDcln)
					.getQualName()
					: (scopeOfDcln instanceof DeclNode.Usr) ? ((DeclNode.Usr) scopeOfDcln)
							.getUnitQualName() : "/* ?? scope unknown ?? */");
			String rtn = "";
			if (scopeOfDcln == g.curUnit()) {
				rtn = g.uname() + "." + name;
			} else {
				rtn = "$units['" + qn + "']."
						+ (this.isNestedClass() ? name : "");
			}
			return rtn;
		}

		@Override
		public boolean isReady() {
			return true;
		}

		public DeclNode.Usr getBaseType() {
			if (baseType == null && this.getExtends() != null) {
				SymbolEntry p = lookupName(getExtends().getText());
				if (p != null) {
					BaseNode b = (BaseNode) p.node();
					if (b instanceof ImportNode
							&& ((ImportNode) b).getUnit() != null) {
						baseType = ((ImportNode) b).getUnit().getUnitType();
					} else if (b instanceof DeclNode.Usr)
						baseType = (Usr) p.node();
				}
			}
			return baseType;
		}

		public EnumSet<Flags> getFlags() {
			return flags; // Except for nested class, these apply to typeUnit.
		}

		@SuppressWarnings("unchecked")
		public List<DeclNode> getFeatures() {
			// Sometimes the parser creates NIL BaseNodes as a side effect of
			// synthesized tree construction: remove the NIL BaseNodes.
			// This is necessary because a lot of code loops over this list
			// expecting DeclNodes.
			if (!featuresCheck) {
				Iterator<DeclNode> it = ((ListNode<DeclNode>) getChild(FEATURES))
						.getElems().iterator();
				while (it.hasNext()) {
					BaseNode b = (BaseNode) it.next();
					if (!(b instanceof DeclNode))
						it.remove();
				}
				featuresCheck = true;
			}
			return ((ListNode<DeclNode>) getChild(FEATURES)).getElems();
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
		 * @return meta formals for this meta type. May be IMPORT or FORMAL (for
		 *         meta type parameters or meta value parameters).
		 */
		@SuppressWarnings("unchecked")
		public ListNode<BaseNode> getMetaFormals() {
			if (getChildCount() > META && this.isMeta()
					&& getChild(META).getChildCount() > 0) {
				ListNode<BaseNode> l = ((ListNode<BaseNode>) getChild(META));
				if (l.getElems().isEmpty()) {
					ParseUnit
							.current()
							.reportError(getName(),
									"Meta types cannot have empty formal parameter list");
					return null;
				}
				return l;
			}
			return null;
		}

		/**
		 * Qualify the Unit name using 'as' name in the instantiating typeUnit.
		 * This enforces uniqueness in the scope of reference despite multiple
		 * instantiations in the scope of reference. ONLY call just before
		 * translation phase.
		 */
		public void setMetaQualName() {
			if (!qnameSet && !qname.isEmpty()) {
				getName().setText(qname);
				qnameSet = true;
			}
		}

		/**
		 * For enums & classes: if this expr location used, mark the DeclNode unit as used.
		 * @param exprLoc
		 */
		public void setUnitUsedForExpr(BaseNode exprLoc) {
			if (this.isEnum() || this.isClass()) {
				BaseNode up = exprLoc.getParentOfType(UnitNode.class);
				if (up != null && ((UnitNode) up).isUnitUsed()) {
					this.getUnit().setUnitUsed(true);
				}
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

		public boolean isNestedClass() {
			if (flags.contains(Flags.CLASS) && containingType != null)
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
				ISymbolNode node = p != null ? p.node() : null;
				if (node instanceof ImportNode)
					node = ((ImportNode) node).getUnit().getUnitType();
				if (node != null) {
					implementedType = (Usr) node;
				}
			}
			return implementedType;
		}

		@Override
		public IScope getEnclosingScope() {
			return scopeDeleg.getEnclosingScope();
		}

		@Override
		public Set<Map.Entry<String, SymbolEntry>> getEntrySet() {
			return scopeDeleg.getEntrySet();
		}

		@Override
		public TypeInfo getTypeInfo() {
			return (null);
		}

		public String getUnitQualName() {
			return (getEnclosingScope() instanceof UnitNode) ? ((UnitNode) getEnclosingScope())
					.getQualName()
					: (getEnclosingScope() instanceof DeclNode.Usr ? ((DeclNode.Usr) getEnclosingScope())
							.getUnitQualName() : "??");
		}

		@Override
		public String getScopeName() {
			return getName().getText();
		}

		/**
		 * Enter regular and host scope. Host function symbols are entered in a
		 * host scope. Host scopes have the same enclosing scope as regular
		 * scopes.
		 */
		private void enterScopes() {
			SymbolTable symtab = ParseUnit.current().getSymbolTable();
			scopeHost.setEnclosingScope(symtab.curScope());
			symtab.enterScope(this);

		}

		@Override
		protected boolean pass1Begin() {

			ParseUnit currUnit = ParseUnit.current();
			super.pass1Begin();

			if (currUnit.getCurrUnitNode().getUnitType() != this
					&& this.isClass()) {
				containingType = currUnit.getCurrUnitNode().getUnitType();
			}

			if (this.getBaseType() != null) {
				scopeDeleg.addSymbols(this.getBaseType().scopeDeleg
						.getEntrySet());
			}

			SymbolTable symtab = currUnit.getSymbolTable();
			if (containingType != null) {
				scopeDeleg.addSymbols(containingType.scopeDeleg.getEntrySet());
				symtab.curScope().replaceSymbol(getName(), this);
			} else {
				symtab.curScope().defineSymbol(getName(), this);
			}
			if (this.getMetaFormals() != null) {

				for (BaseNode b : this.getMetaFormals().getElems()) {
					if (b instanceof DeclNode.Formal) {
						DeclNode.Formal f = (Formal) b;
						f.pass1Begin();
						// If the meta argument is a void instance, this
						// typeUnit is also
						SymbolEntry symbol = ParseUnit.current()
								.getSymbolTable()
								.lookupName(f.getName().getText());
						ISymbolNode snode = symbol != null ? symbol.node()
								: null;
						if (snode instanceof DeclNode.Usr
								&& ((DeclNode.Usr) snode).isVoid()) {
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
						implementedType = ((ImportNode) p.node()).getUnit()
								.getUnitType();
					} else
						implementedType = (Usr) p.node();
					TypeRules.checkImplements(this, p);
				}
			}
			if (this.getBaseType() != null) {
				scopeDeleg.addSymbols(this.getBaseType().scopeDeleg
						.getEntrySet());
			}
			if (this.getExtends() != null && this.getBaseType() == null) {
				ParseUnit.current()
						.reportError(
								this.getName(),
								"Use of the clause 'extends "
										+ this.getExtends().getText()
										+ "' requires that '"
										+ this.getExtends().getText()
										+ "' be imported");
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
	static public class Var extends DeclNode implements ITypeSpecInit,
			IOutputQualifiedName, IOutputName {

		static final private int NAME = 1;
		static final private int TYPE = 0;
		static final public int INIT = 2;

		boolean intrinsicUsed = false;

		Var(int ttype, String ttext, EnumSet<Flags> flags) {
			super(ttype, ttext, flags);
		}

		DeclNode.Arr arrayForDimensionVar = null;

		public String getOutputQNameTarget(Generator g, ISymbolNode node,
				IScope sc, EnumSet<Flags> flags) {

			String qn = "";
			if (node == null || sc == null)
				return qn;
			IScope scopeOfDcln = sc;
			
			if (scopeOfDcln instanceof DeclNode.Usr
					&& !((ITypeKind) scopeOfDcln).isClass()) {
				scopeOfDcln = scopeOfDcln.getEnclosingScope();
			}

			qn = (scopeOfDcln instanceof UnitNode ? ((UnitNode) scopeOfDcln)
					.getQualName()
					: (scopeOfDcln instanceof DeclNode.Usr) ? ((DeclNode.Usr) scopeOfDcln)
							.getUnitQualName() : "/* ?? scope unknown ?? */");

			String n = node instanceof DeclNode.Fcn ? ((DeclNode.Fcn) node)
					.cname() : node.getName().getText();
			qn = qn + "." + n + g.getAux().mkSuf(node);
			return qn.replace('.', '_');
		}

		public String getOutputQNameHost(Generator g, ISymbolNode node,
				IScope sc, EnumSet<Flags> flags) {
			
			boolean thisPtr = flags.contains(Flags.IS_THISPTR);
			String qn = "";
			if (node == null || sc == null)
				return qn;

			IScope scopeOfDcln = sc;

			if (scopeOfDcln instanceof DeclNode.Usr
					&& !((ITypeKind) scopeOfDcln).isClass()) {
				scopeOfDcln = scopeOfDcln.getEnclosingScope();
			}
			if (scopeOfDcln == g.curUnit())
				return (g.uname() + "." + node.getName());

			qn = (scopeOfDcln instanceof UnitNode ? ((UnitNode) scopeOfDcln)
					.getQualName()
					: (scopeOfDcln instanceof DeclNode.Usr) ? ((DeclNode.Usr) scopeOfDcln)
							.getUnitQualName() : "/* ?? scope unknown ?? */");

			if (scopeOfDcln instanceof DeclNode.Class && !thisPtr
					&& isClassRef())
				qn = g.uname();
			boolean classScopeOfDcln = scopeOfDcln instanceof DeclNode.Class;
			if (classScopeOfDcln) {
				if (thisPtr || g.curUnit().isClass() || g.isClassUnit()) {
					// the scope qualifier is 'this'
					String n = node
							.getName()
							.getText()
							.substring(
									node.getName().getText().lastIndexOf('.') + 1);
					return "this." + n;
				}
			}
			return "$units['" + qn + "']." + node.getName().getText();

		}

		public String getOutputNameHost(Generator g, IScope sc,
				EnumSet<Flags> flags) {
			boolean thisPtr = flags.contains(Flags.IS_THISPTR);
			thisPtr = thisPtr && !this.getName().getText().equals("this");
			boolean postExpr = flags.contains(Flags.IS_POSTEXPR);
			if (thisPtr) {
				return "this." + this.getName().getText();
			}
			if (postExpr) {
				return this.getName().getText();
			}
			String qn = "";
			ISymbolNode node = this;
			IScope scopeOfDcln = sc;
			boolean localsScope = !(scopeOfDcln instanceof UnitNode || scopeOfDcln instanceof DeclNode.Usr);
			if (localsScope) {
				return this.getName().getText();
			}
			if (scopeOfDcln instanceof DeclNode.Usr
					&& !((ITypeKind) scopeOfDcln).isClass()) {
				scopeOfDcln = scopeOfDcln.getEnclosingScope();
			}
			if (scopeOfDcln == g.curUnit())
				return (g.uname() + "." + this.getName().getText());

			qn = (scopeOfDcln instanceof UnitNode ? ((UnitNode) scopeOfDcln)
					.getQualName()
					: (scopeOfDcln instanceof DeclNode.Usr) ? ((DeclNode.Usr) scopeOfDcln)
							.getUnitQualName() : "/* ?? scope unknown ?? */");

			if (scopeOfDcln instanceof DeclNode.Class && !thisPtr
					&& isClassRef())
				qn = g.uname();
			boolean classScopeOfDcln = scopeOfDcln instanceof DeclNode.Class;
			if (classScopeOfDcln) {
				if (thisPtr || g.curUnit().isClass() || g.isClassUnit()) {
					// the scope qualifier is 'this'
					String n = this
							.getName()
							.getText()
							.substring(
									this.getName().getText().lastIndexOf('.') + 1);
					return "this." + n;
				}
			}
			return "$units['" + qn + "']." + node.getName().getText();

		}

		public String getOutputNameTarget(Generator g, IScope sc,
				EnumSet<Flags> flags) {
			
			boolean thisPtr = flags.contains(Flags.IS_THISPTR);
			thisPtr = thisPtr && !this.getName().getText().equals("this");
			boolean postExpr = flags.contains(Flags.IS_POSTEXPR);
			String qn = "";

			if (postExpr) {
				return this.getName().getText();
			}
			if (thisPtr) {
				return "this->" + this.getName().getText();
			}

			IScope scopeOfDcln = sc;
			boolean localsScope = !(scopeOfDcln instanceof UnitNode || scopeOfDcln instanceof DeclNode.Usr);
			if (localsScope) {
				return this.getName().getText();
			}
			if (scopeOfDcln instanceof DeclNode.Usr
					&& !((ITypeKind) scopeOfDcln).isClass()) {
				scopeOfDcln = scopeOfDcln.getEnclosingScope();
			}

			qn = (scopeOfDcln instanceof UnitNode ? ((UnitNode) scopeOfDcln)
					.getQualName()
					: (scopeOfDcln instanceof DeclNode.Usr) ? ((DeclNode.Usr) scopeOfDcln)
							.getUnitQualName() : "/* ?? scope unknown ?? */");

			String n = this.getName().getText();
			qn = qn + "." + n + g.getAux().mkSuf(this);
			// qn = flags.contains(Flags.IS_FCNPTR_ARR_CALL) ? "(*" + qn + ")" :
			// qn;
			return qn.replace('.', '_');
		}

		public boolean isIntrinsic() {
			return (flags.contains(Flags.INTRINSIC_VAR));
		}

		/**
		 * @return for an intrinsic variable return true if used, all other
		 *         cases false.
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
		 * If true, object will be initialized at host time, via the host
		 * constructor.
		 * 
		 * @return true if this DeclNode has new on the declaration AND is
		 *         declared host
		 * 
		 */
		public boolean isHostNew() {
			IScope sc = this.getDefiningScope();
			boolean isStatic = sc instanceof DeclNode.Usr
			// && ((DeclNode.Usr)sc).isModule()
					&& flags.contains(Flags.NEW);
			return (isStatic && this.isHost());
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
				String code = Cat.Scalar.codeFromString(((TypeNode.Usr) this
						.getTypeSpec()).getName().getText());
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

			if (currUnit.getCurrUnitNode().isComposition()) {

			}

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

			UnitNode u = ParseUnit.current().getCurrUnitNode();
			if (!this.isHost() && u.isComposition()
					&& (this.getDefiningScope() instanceof DeclNode.Usr)) {
				ParseUnit.current().reportError(this.getName(),
						"compositions can only declare host variables");
			}

			if (getInit() != null) {
				getInit().pass2End();
			}
			ITypeSpecInit tsi = (ITypeSpecInit) this;
			ExprNode init = tsi.getInit();
			if (init != null && init.getCat() instanceof Cat.Arr
					&& !(init instanceof ExprNode.Call)) {
				Cat baseCat = ((Cat.Arr) init.getCat()).getBase();
				TypeRules.checkInit(tsi.getTypeCat(), init, baseCat, false);
			} else if (this instanceof DeclNode.Arr && this.isPeggedOnDcln()) {
				TypeRules.checkPeg(this, init.getCat(), this);
			} 
			else if (init != null) {
				TypeRules.checkInit(tsi.getTypeCat(), init);
			}
			setCheckInitDone(true);
			super.pass2End();

		}

		/**
		 * 
		 * @return if this variable specifies dimension for an array, return the
		 *         array, else null.
		 */
		public DeclNode.Arr getArrayForDimensionVar() {
			return arrayForDimensionVar;
		}

		/**
		 * This variable is the dimension variable for an array. Set the array
		 * for this variable.
		 * 
		 * @param arrayForDimensionVar
		 */
		public void setArrayForDimensionVar(DeclNode.Arr arrayForDimensionVar) {
			this.arrayForDimensionVar = arrayForDimensionVar;
		}
	}

	// DeclNode

	static final private int NAME = 0;

	private IScope definingScope;
	protected Cat typeCat;
	protected UnitNode unit;
	protected boolean checkInitDone = false;

	EnumSet<Flags> flags = EnumSet.noneOf(Flags.class);

	/**
	 * A type specific check can override the outermost, generic one.
	 * 
	 * @return checkInit already done.
	 */
	public boolean isCheckInitDone() {
		return checkInitDone;
	}

	public void setCheckInitDone(boolean checkInitDone) {
		this.checkInitDone = checkInitDone;
	}

	DeclNode(int ttype, String ttext, EnumSet<Flags> f) {
		this.token = new Atom(ttype, ttext);
		this.flags = f.clone();
	}

	DeclNode(int ttype, String ttext) {
		this.token = new Atom(ttype, ttext);
	}

	boolean flagsContains(Flags f) {
		return (flags.contains(f));
	}

	/**
	 * Always the outermost. If DeclNode is in a nested class, returns the unit which contains the class
	 */
	public UnitNode getUnit() {
		return unit;
	}

	/**
	 * For all manner of direct and indirect calls. Check that 'this' is
	 * accessible from loc. Mark the called unit used if appropriate.
	 * 
	 * @param loc
	 * @param directCall
	 *            false if from an array of function refs
	 */
	public void callAccessCheck(BaseNode loc, boolean directCall) {
	}

	@Override
	public IScope getDefiningScope() {
		return definingScope;
	}
	/**
	 * A nested class will return its defining type. 
	 * @return the module, class, or nested class that defines this DeclNode.
	 */
	public DeclNode.Usr getDefiningType() {
		BaseNode b = (BaseNode) this;
		if (this instanceof DeclNode.Usr && !((DeclNode.Usr)this).isNestedClass())
			return (Usr) this;
		while (b.getParent() != null) {
			b = (BaseNode) b.getParent();
			if (b instanceof DeclNode.Usr)
				break;						
		}
		return (Usr) b;
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

	// E.g. initialization for arrays of typed members can use assignment. Just
	// output as non const.
	public boolean isHostNonConst() {
		return flags.contains(Flags.HOST_NONCONST);
	}

	/**
	 * If a public function is called from outside its declaring unit, mark the
	 * unit containing it as 'used'. Unused units will not have code generated.
	 * checkInterUnitCall is false for arrays of function references.
	 * 
	 * @param calledFcn
	 *            ISymbolNode of fcn or fcn ref or formal parameter of type
	 *            function
	 * @param callSite
	 *            the unit which is the call site
	 * @param checkInterUnitCall
	 *            if true, only set unit used if this is an interunit call
	 */
	/*
	 * public void setUnitUsed(ISymbolNode calledFcn, UnitNode callSite, boolean
	 * checkInterUnitCall) { if (calledFcn == null) return; IScope sc =
	 * calledFcn.getDefiningScope();
	 * 
	 * if (checkInterUnitCall && calledFcn instanceof DeclNode.Fcn &&
	 * ((DeclNode.Fcn) calledFcn).getUnit() == callSite) return; // only
	 * interunit calls create used units.
	 * 
	 * // calledFcn is either a function reference or a function or a formal (of
	 * type function) boolean isPublicFcnOrFcnRef = ((DeclNode)
	 * calledFcn).isPublic() && calledFcn instanceof DeclNode.Fcn;
	 * isPublicFcnOrFcnRef |= calledFcn instanceof DeclNode.FcnRef; if
	 * (calledFcn instanceof DeclNode.Formal) { TypeNode t =
	 * ((DeclNode.Formal)calledFcn).getTypeSpec(); if (t != null && t instanceof
	 * TypeNode.Usr) { SymbolEntry se = ((TypeNode.Usr) t).getSymbol();
	 * ISymbolNode n = se != null ? se.node() : null; isPublicFcnOrFcnRef |= n
	 * instanceof DeclNode.Fcn; } } System.out.println("...setUnitUsed() for: "
	 * + this.toStringTree()); if (isPublicFcnOrFcnRef) { if (calledFcn
	 * instanceof DeclNode.FcnRef) { TypeNode t =
	 * ((DeclNode.FcnRef)calledFcn).getTypeSpec(); SymbolEntry sym = t
	 * instanceof TypeNode.Usr && ((TypeNode.Usr) t).getSymbol() != null ?
	 * ((TypeNode.Usr) t) .getSymbol() : null; this.setUnitUsed(sym.node(),
	 * callSite, checkInterUnitCall); } else if (sc instanceof DeclNode.Usr ||
	 * sc instanceof ImportNode) { if (sc instanceof DeclNode.Usr) {
	 * ((DeclNode.Usr) sc).getUnit().setUnitUsed(true); } else if (sc instanceof
	 * ImportNode) { ImportNode i = (ImportNode) sc; if (i.getExportedUnit() !=
	 * null) { IScope isc = i.getExportedUnit(); if (isc instanceof
	 * DeclNode.Usr) ((DeclNode.Usr)isc).getUnit().setUnitUsed(true); }
	 * 
	 * else if (i.getUnit() != null) i.getUnit().setUnitUsed(true); } } } }
	 */
	/**
	 * The starting assumption is that variables declared host will end up as
	 * const (in flash). But there are numerous cases where this assumption does
	 * not work. When we detect such a case we change HOST to HOST_NONCONST.
	 * Also if a simple variable is assigned to in target code and is not one of
	 * these special cases, we strip HOST entirely.
	 */
	public void clearHost() {
		if (isHost()) {
			// declaring as const is limiting... E.g.
			// C const arrays get a warning if you assign an element of a const
			// array to a non const variable.
			// So these items are handled as host variables but not generated as
			// const
			// ALSO : a host dimension must stay host, it triggers reallocs of
			// the array whenever modified.
			boolean isHostDim = this instanceof DeclNode.Var
					&& ((DeclNode.Var) this).getArrayForDimensionVar() != null ? true
					: false;
			if (this instanceof DeclNode.TypedMember
					|| this instanceof DeclNode.FcnRef
					|| this instanceof DeclNode.Arr || isHostDim)
				flags.add(Flags.HOST_NONCONST);
			else
				flags.remove(Flags.HOST);
		}
	}

	public boolean isClassRef() {
		if (this instanceof DeclNode.TypedMember) {
			return ((DeclNode.TypedMember) this).isClassRef();
		}
		return false;
	}

	public boolean isClassScope() {
		if (definingScope instanceof DeclNode.Class)
			return true;
		return false;
	}

	public boolean isHostClassRef() {
		if (this instanceof DeclNode.TypedMember) {
			return ((DeclNode.TypedMember) this).isHostClassRef();
		}
		return false;
	}

	public boolean isTargetClassRef() {
		if (this instanceof DeclNode.TypedMember) {
			return ((DeclNode.TypedMember) this).isTargetClassRef();
		}
		return false;
	}

	public boolean isProtocolMember() {
		if (this instanceof DeclNode.TypedMember) {
			return ((DeclNode.TypedMember) this).isProtocolMember();
		}
		return false;
	}

	public boolean isConst() {
		return flags.contains(Flags.CONST);
	}

	/**
	 * @return
	 */
	public boolean isPreset() {
		return flags.contains(Flags.PRESET);
	}

	public void setPreset(boolean val) {
		if (val)
			flags.add(Flags.PRESET);
		else
			flags.remove(Flags.PRESET);
	}

	/**
	 * Mark units used as appropriate.
	 * Called by expressions and statements. 
	 * If the expression location is in a used unit,
	 * mark the unit type of the decl node as used.
	 * Otherwise do not mark it used.
	 * 
	 * @param exprLoc
	 *            location of use
	 */
	public void setUnitUsedForExpr(BaseNode exprLoc) {
	}

	/**
	 * 
	 * @return true if the init expr pegs to an array expr ('@=')
	 */
	public boolean isPeggedOnDcln() {
		return flags.contains(Flags.PEG);
	}

	/**
	 * 
	 * @return true if this init expression is a module binding (':=')
	 */
	public boolean isBoundOnDcln() {
		return flags.contains(Flags.BIND);
	}

	public boolean isNew() {
		return flags.contains(Flags.NEW);
	}

	@Override
	protected boolean pass1Begin() {
		ParseUnit currUnit = ParseUnit.current();
		unit = currUnit.getCurrUnitNode();
		Atom name = getName();

		if (currUnit.getSymbolTable().defineSymbol(name, this) == false) {
			currUnit.reportError(name,
					"identifier already defined in the current scope");
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
		if (isPeggedOnDcln()) {
			TypeRules.checkPeg(this, init.getCat(), this);
		}

		if (init == null) {
			return;
		}
		if (this.getDefiningScope() instanceof UnitNode && !init.isConst()) {
			ParseUnit.current().reportError(init,
					"initializer must be a constant expression");
			return;
		}

		if (!isCheckInitDone())
			TypeRules.checkInit(tsi.getTypeCat(), init);

	}

	@Override
	protected boolean passNBegin() {
		if (!(this instanceof ITypeSpecInit)) {
			return true;
		}
		ITypeSpecInit tsi = (ITypeSpecInit) this;
		ExprNode init = tsi.getInit();
		if (init != null && init.getSymbol() != null
				&& init.getSymbol().node() instanceof DeclNode)
			((DeclNode) init.getSymbol().node()).setUnitUsedForExpr(this);
		return true;
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
