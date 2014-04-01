package com.amaret.pollen.parser;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.amaret.pollen.driver.ProcessUnits;
import com.amaret.pollen.parser.DeclNode.ITypeKind;
import com.amaret.pollen.translator.Generator;

public class UnitNode extends BaseNode implements ISymbolNode, IScope,
		IUnitWrapper, DeclNode.ITypeKind, IOutputName {

	static private final int IMPORTS = 1;
	static private final int PKGNAME = 0;
	static private final int INJECT1 = 2;
	static private final int UNIT = 3;
	static private final int INJECT2 = 4;

	// Each name can map to multiple DeclNode.Fcn nodes, for overloads.
	private Map<String, List<DeclNode.Fcn>> fcnMap = new HashMap<String, List<DeclNode.Fcn>>();
	// A client is a unit that imports this unit.
	private Map<String, UnitNode> clientMap = new HashMap<String, UnitNode>();
	private List<ExportNode> exportList = new ArrayList<ExportNode>();
	private DeclNode.Usr unitType;
	private IScope definingScope;
	private IScope enclosingScope;
	private int errorCount;
	private String filePath;
	private boolean featuresCheck = false;
	private boolean codegen = false;
	private EnumSet<Flags> flags = EnumSet.noneOf(Flags.class);
	private Map<String, Integer> exprConstStringTable = new HashMap<String, Integer>();
	private Map<String, ImportNode> importMap = new HashMap<String, ImportNode>();
	static final List<String> lifecycleMethods = Arrays.asList(
			ParseUnit.POLLEN_RESET, ParseUnit.POLLEN_READY,
			ParseUnit.POLLEN_SHUTDOWN, ParseUnit.POLLEN_HIBERNATE,
			ParseUnit.POLLEN_RUN);

	public void addFlags(EnumSet<Flags> e) {
		// System.out.println("UnitNode.addFlags() before add " +
		// flags.toString());
		flags.addAll(e);
		// System.out.println("UnitNode.addFlags() after add " +
		// flags.toString());
	}

	public boolean isUnitUsed() {
		return flags.contains(Flags.UNIT_USED);
	}

	public void setUnitUsed(boolean unitUsed) {

		// if (unitUsed)
		// System.out.println("...setting unitUsed TRUE for " +
		// this.getQualName() + (isGeneratedMetaInstance() ? " generated Meta" :
		// ""));
		if (unitUsed && !flags.contains(Flags.UNIT_USED))
			addFlags(EnumSet.of(Flags.UNIT_USED));
	}

	public Map<String, ImportNode> getImportMap() {
		return importMap;
	}

	public boolean isCodegen() {
		return codegen;
	}

	public void setCodegen(boolean codegen) {
		this.codegen = codegen;
	}

	class UnitHashMap<K, V> extends HashMap<K, V> {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		public V put(K k, V v) {
			V rtn = super.put(k, v);
			if (rtn != null) {
				ParseUnit.internalMsg("Collision detected for key "
						+ k.toString());
			}
			return rtn;
		}
	}

	private Map<String, SymbolEntry> symbolTable = new UnitHashMap<String, SymbolEntry>();
	private Cat typeCat = null;
	private boolean hostScope = false;

	public String getOutputNameHost(Generator gen, IScope sc,
			EnumSet<Flags> flags) {
		return gen.uname();
	}

	public String getOutputNameTarget(Generator gen, IScope sc,
			EnumSet<Flags> flags) {
		return this.getQualName().replace('.', '_');
	}

	/**
	 * 
	 * @return true if this unit was generated by the parser when called on a
	 *         meta type with an import which specified (possibly default) meta
	 *         arguments.
	 */
	public boolean isGeneratedMetaInstance() {
		if (!flags.contains(Flags.META))
			return false;
		String fname = this.getFileName().substring(0,
				getFileName().lastIndexOf('.')); // x.y.z.p => x.y.z
		fname = fname.substring(fname.lastIndexOf('.') + 1);
		if (!(fname.equals(this.getName().getText())))
			return true;
		// DeclNode.Usr t = this.getUnitType();
		// ListNode<BaseNode> l = t.getMetaFormals();
		// if (l != null && !l.elems.isEmpty())
		// return true;
		return false;

	}

	public List<ExportNode> getExportList() {
		return exportList;
	}

	public Map<String, List<DeclNode.Fcn>> getFcnMap() {
		return fcnMap;
	}

	/**
	 * Add Fcn Node to Map. Handle overloaded function names.
	 * 
	 * @param name
	 * @param fcn
	 */
	public void addFcn(String name, DeclNode.Fcn fcn) {
		if (lifecycleMethods.contains(name)) {
			fcn.getUnit().setUnitUsed(true);
		}
		if (!fcnMap.containsKey(name)) {
			List<DeclNode.Fcn> fcnEntry = new ArrayList<DeclNode.Fcn>();
			fcnEntry.add(fcn);
			fcnMap.put(name, fcnEntry);
			return;
		}
		fcnMap.get(name).add(fcn);
	}

	public DeclNode.Usr getUnitType() {
		if (unitType == null) {
			unitType = ((DeclNode.Usr) getChild(UNIT));
		}
		return unitType;
	}

	public List<DeclNode> getFeatures() {
		// Sometimes the parser creates NIL BaseNodes as a side effect of
		// synthesized tree construction: remove the NIL BaseNodes.
		// This is necessary because a lot of code loops over this list
		// expecting DeclNodes.
		if (!featuresCheck) {
			Iterator<DeclNode> it = this.getUnitType().getFeatures().iterator();
			while (it.hasNext()) {
				BaseNode b = (BaseNode) it.next();
				if (!(b instanceof DeclNode))
					it.remove();
			}
			featuresCheck = true;
		}
		return this.getUnitType().getFeatures();
	}

	UnitNode(int ttype, String ttext) {
		this.token = new Atom(ttype, ttext);
	}

	/**
	 * This unit is imported by another unit 'u'
	 * 
	 * @param u
	 */
	void addClient(UnitNode u) {
		clientMap.put(u.getQualName(), u);
	}

	void addString(String s) {
		if (!exprConstStringTable.containsKey(s)) {
			exprConstStringTable.put(s, exprConstStringTable.size());
		}
	}

	@Override
	public boolean defineSymbol(Atom name, ISymbolNode node) {
		if (resolveSymbol(name) != null) {
			return false;
		}
		// if (ParseUnit.isDebugMode()) {
		// if (node instanceof ImportNode) {
		// System.out.println("********** enter import of " + name.getText() +
		// " into symtab (scope) of unit " + this.getName().getText());
		// }
		// }
		getSymbolTable().put(name.getText(), new SymbolEntry(this, node));
		node.setDefiningScope(this);
		return true;
	}

	/**
	 * Put the symbol into the unit symbol table. Used with exports.
	 * 
	 * @param name
	 * @param se
	 * @return the previous value with this key or null if none
	 */
	public SymbolEntry putSymbol(String name, SymbolEntry se) {
		Atom a = new Atom(this.getName());
		a.setText(name);
		if (resolveSymbol(a) != null)
			ParseUnit.internalMsg("UnitNode.putSymbol() collision on name "
					+ name + " in unit " + getName().getText());
		return getSymbolTable().put(name, se);
	}

	void destruct() {
		fcnMap = null;
		clientMap = null;
		exportList = null;
		definingScope = null;
		;
		enclosingScope = null;
		exprConstStringTable = null;
		symbolTable = null;
		typeCat = null;
	}

	private String nameForHashing(UnitNode u) {
		// include the meta qualifier in the equals calculation
		return u.getQualName() + u.getUnitType().getMetaQualName();
	}

	public boolean equals(Object o) {
		if (!(o instanceof UnitNode))
			return false;
		if (o == this)
			return true;
		String n1 = nameForHashing((UnitNode) o);
		String n2 = nameForHashing(this);
		if (n1.equals(n2))
			return true;
		return false;
	}

	public int hashCode() {
		return nameForHashing(this).hashCode();
	}

	public int findString(String s) {
		Integer id = exprConstStringTable.get(s);
		return id != null ? id : -1;
	}

	public UnitNode getOutermostUnit() {
		if (this.getUnitType().getContainingType() != null)
			return this.getUnitType().getContainingType().getUnit();
		return this;
	}

	public UnitNode getContainingUnit() {
		if (this.getUnitType().getContainingType() != null)
			return this.getUnitType().getContainingType().getUnit();
		return null;
	}

	/**
	 * 
	 * @return unit for 'implements' clause
	 */
	public UnitNode getImplementedUnit() {
		if (this.getUnitType().getImplementedType() != null)
			return this.getUnitType().getImplementedType().getUnit();
		return null;
	}

	public Collection<UnitNode> getClients() {
		return clientMap.values();
	}

	@SuppressWarnings("unchecked")
	public List<ExprNode.Inject> getInject1() {
		return ((ListNode<ExprNode.Inject>) getChild(INJECT1)).getElems();
	}

	@SuppressWarnings("unchecked")
	public List<ExprNode.Inject> getInject2() {
		return ((ListNode<ExprNode.Inject>) getChild(INJECT2)).getElems();
	}

	@Override
	public IScope getDefiningScope() {
		return definingScope;
	}

	@Override
	public IScope getEnclosingScope() {
		return enclosingScope;
	}

	@Override
	public Set<Map.Entry<String, SymbolEntry>> getEntrySet() {
		return getSymbolTable().entrySet();
	}

	/**
	 * Currently used for serious errors only... so avoid javascript aborts, for
	 * example
	 * 
	 * @return
	 */
	public int getErrorCount() {
		return errorCount;
	}

	@SuppressWarnings("unchecked")
	public List<ImportNode> getImports() {
		return ((ListNode<ImportNode>) getChild(IMPORTS)).getElems();
	}

	public String getFilePath() {
		return filePath;
	}

	@Override
	public Atom getName() {
		return this.getUnitType().getName();
	}

	public Atom getPkgName() {
		return ((BaseNode) getChild(PKGNAME)).getAtom();
	}

	public String getQualName() {
		return "" + getPkgName() + '.' + getName();
	}

	@Override
	public String getScopeName() {
		return getQualName();
	}

	public Set<Map.Entry<String, Integer>> getStrings() {
		return exprConstStringTable.entrySet();
	}

	public UnitNode getUnit() {
		return this;
	}

	@Override
	public Cat getTypeCat() {
		if (typeCat == null) {
			typeCat = Cat.fromSymbolNode(this, this.getDefiningScope());
		}
		return typeCat;
	}

	public void incErrorCount() {
		this.errorCount += 1;
	}

	void init() {
		filePath = ParseUnit.current().getCurrPath();
	}

	/**
	 * Only valid currently during parsing.
	 * 
	 * @return true if in a host scope.
	 */
	public boolean isHostScope() {
		if (isHost())
			return true;
		return hostScope;
	}

	public void setHostScope(boolean hostScope) {
		this.hostScope = hostScope;
	}

	/**
	 * 
	 * @return true if not a composition
	 */
	public boolean isTarget() {
		return !isHost();
	}

	public boolean isHost() {
		return this.getUnitType().isComposition();
	}

	public boolean isEnum() {
		return this.getUnitType().isEnum();
	}

	public boolean isModule() {
		return this.getUnitType().isModule();
	}

	public boolean isProtocol() {
		return this.getUnitType().isProtocol();
	}

	public boolean isComposition() {
		return this.getUnitType().isComposition();
	}

	public boolean isClass() {
		return this.getUnitType().isClass();
	}

	/**
	 * 
	 * @return true if this unit is a meta type (that is, if the unit definition
	 *         specifies meta parms).
	 */
	public boolean isMeta() {
		boolean dbg = false;
		if (flags.contains(Flags.META)) {
			// if (!this.isGeneratedMetaInstance())
			// System.out.println("Unit.isMeta && !isGeneratedMetaInstance: " +
			// this.getQualName());
			return true;
		}
		return false;
	}

	/**
	 * True if this is a deferred instantiation for a meta type (for which no
	 * code will be generated). Used only for name resolution, etc.
	 * 
	 * @return Flags.VOID_INSTANCE
	 */
	public boolean isVoid() {
		if (flags.contains(Flags.VOID_INSTANCE))
			return true;
		return false;
	}

	public List<DeclNode.Fcn> lookupFcn(String name) {
		return fcnMap.get(name);
	}

	@Override
	public SymbolEntry lookupName(String name) {

		SymbolEntry result = getSymbolTable().get(name);
		if (result != null) {
			return result;
		}

		if (name.indexOf(".") != -1) {
			// qualified names ('x.y.z') need chained lookups, one qualifier at
			// a time.
			IScope sc = this;
			String qualifier = name.substring(0, name.indexOf("."));
			name = name.substring(name.indexOf(".") + 1, name.length());

			while (true) {
				if (result != null && result.node() instanceof IScope)
					result = ((IScope) result.node()).lookupName(qualifier);
				else
					result = sc.lookupName(qualifier);

				if (result == null)
					break;

				if (name.isEmpty())
					return result;
				sc = result.scope();
				if (name.indexOf(".") == -1) {
					qualifier = name;
					name = "";
				} else {
					qualifier = name.substring(0, name.indexOf("."));
					name = name.substring(name.indexOf(".") + 1, name.length());
				}
			}
		}

		return null;
	}

	/**
	 * Used for exported units and functions ONLY.
	 * 
	 * Any functions or units exported by a composition have their names
	 * inserted in the outermost unit symbol table. Key is name, SymbolEntry for
	 * import or fcn.
	 * 
	 * (The unit type symbol table and its nested tables contain the names
	 * declared by the composition. The unit symbol table contains imports and
	 * exports.)
	 * 
	 * @param name
	 * @return the SymbolEntry
	 */
	public SymbolEntry lookupExportInUnit(String name) {

		SymbolEntry result = getSymbolTable().get(name);
		if (result != null) {
			return result;
		}
		return null;
	}

	@Override
	public SymbolEntry lookupName(String name, boolean chkHostScope) {

		SymbolEntry result = getSymbolTable().get(name);
		if (result != null) {
			return result;
		}

		if (name.indexOf(".") != -1) {
			// qualified names ('x.y.z') need chained lookups, one qualifier at
			// a time.
			IScope sc = this;
			String qualifier = name.substring(0, name.indexOf("."));
			name = name.substring(name.indexOf(".") + 1, name.length());

			while (true) {
				if (result != null && result.node() instanceof IScope)
					result = ((IScope) result.node()).lookupName(qualifier,
							chkHostScope);
				else
					result = sc.lookupName(qualifier, chkHostScope);

				if (result == null)
					break;
				if (name.isEmpty()) {
					return result;
				}
				sc = result.derefScope(false);

				// Adjust the next scope if we have an import of an exported
				// module: go to the module scope.
				if (result.node() instanceof ImportNode
						&& ((ImportNode) result.node()).getExportedUnit() != null)
					result = null;

				if (name.indexOf(".") == -1) {
					qualifier = name;
					name = "";
				} else {
					qualifier = name.substring(0, name.indexOf("."));
					name = name.substring(name.indexOf(".") + 1, name.length());
				}
			}
		}

		return null;

	}

	@Override
	protected boolean pass1Begin() {
		// System.out.println("**UnitNode " + this.getQualName() +
		// " pass1Begin()");
		int idxPrintProtocol = -1;
		int idxPrintImpl = -1;
		// Excessive imports for print protocol assignment with 'bind'. We don't
		// know if we will encounter a bind
		// so we import when not needed. Prune here.
		// print protocol inserted in all files, print impl only in toplevel
		// module iff -p option.
		for (int i = 0; i < this.getImports().size(); i++) {
			ImportNode imp = this.getImports().get(i);
			if (imp.getName().getText()
					.equals(ParseUnit.INTRINSIC_PRINT_PROTOCOL))
				idxPrintProtocol = i;
			if (imp.getName().getText().equals(ProcessUnits.getPollenPrint()))
				idxPrintImpl = i;
		}
		if (idxPrintImpl == -1 || idxPrintProtocol == -1) { // must occur in a
															// pair to be valid,
															// or the print impl
															// imports the proto
			if (idxPrintProtocol != -1
					&& !this.getName().getText()
							.equals(ProcessUnits.getPollenPrint()))
				this.getImports().remove(idxPrintProtocol);
		}

		if (importMap.isEmpty()) {
			for (ImportNode imp : this.getImports()) {
				importMap.put(imp.getName().getText(), imp);
				// importMap.put(imp.getUnitName().getText(), imp); // these
				// names can collide
			}
		}
		addFlags(unitType.getFlags());
		ParseUnit currUnit = ParseUnit.current();
		currUnit.getSymbolTable().enterScope(this);
		// this.importSymbols(); // moved to pass1End() because imports/exports
		// must be handled first.
		return true;
	}

	private List<String> importedUnits = new ArrayList<String>();
	private List<String> importedFrom = new ArrayList<String>();

	/**
	 * Import all the units that are exported by the units this unit imports. If
	 * this unit has a base type, insert the base type imports into this units
	 * symbol table.
	 */
	private void importSymbols() {
		//

		// boolean dbg = true;
		boolean dbg = false;

		if (dbg) {
			ParseUnit.current().reportError(
					this,
					"\n**************importSymbols() for unit "
							+ this.getQualName() + "**********************");
		}

		UnitNode curUnit = this;
		SymbolEntry newSymbol;
		for (ImportNode imp : curUnit.getImports()) {
			UnitNode impUnit = imp.getUnit();

			importedUnits.add(imp.getUnitName().getText());
			String frm = imp.getFrom().getText();
			importedFrom.add(frm);
			if (dbg)
				ParseUnit.current().reportError(curUnit,
						"START import " + imp.getQualName());

			DeclNode.Usr base = getUnitType().getBaseType();
			while (base != null) {

				// The exported modules and functions of the base type are also
				// exported in the derived type:
				// enter into derived type symtab
				String symtabNames = "";
				for (Map.Entry<String, SymbolEntry> se : base.getUnit()
						.getSymbolTable().entrySet()) {

					if (dbg) {
						symtabNames += symtabNames.isEmpty() ? "** base unit "
								+ base.getName().getText()
								+ " symtab contains : " : "";
						symtabNames += se.getKey() + " ";
					}

					ISymbolNode node = se.getValue().node();

					if ((node instanceof ITypeKind && (((ITypeKind) node)
							.isModule() || ((ITypeKind) node).isComposition()))
							|| node instanceof DeclNode.Fcn) {
						if (!getSymbolTable().containsKey(
								node.getName().getText())) {
							newSymbol = new SymbolEntry(
									node.getDefiningScope(), node);
							getSymbolTable().put(node.getName().getText(),
									newSymbol);
							if (dbg)
								System.out
										.println("** importSymbols() inserting "
												+ node.getName().getText());
						}
					}
				}
				if (dbg)
					System.out.println(symtabNames);
				base = base.getBaseType();
			}

			if (impUnit == null) {
				if (dbg)
					ParseUnit.current().reportError(curUnit,
							"Import " + imp.getQualName() + " has unit = NULL");
			}
		}

		putBaseUnitImports(curUnit);
	}

	/**
	 * For lookups, imports for base unit are inserted into the symtab for
	 * derived unit.
	 * 
	 * @param curUnit
	 */
	private void putBaseUnitImports(UnitNode curUnit) {
		SymbolEntry newSymbol;
		// Imports for base types are inserted into the derived type symbol
		// table.
		if (this.getUnitType().getBaseType() != null) {
			UnitNode baseU = this.getUnitType().getBaseType().getUnit();

			List<SymbolEntry> baseImpList = new ArrayList<SymbolEntry>();
			for (Map.Entry<String, SymbolEntry> baseImportSym : baseU
					.getSymbolTable().entrySet()) {
				ISymbolNode baseImportNode = baseImportSym.getValue().node();
				if (baseImportNode instanceof ImportNode) {
					baseImpList.add(baseImportSym.getValue());
				}
			}
		}
	}

	/**
	 * If not found, check base types.
	 * 
	 * @param u
	 *            the current unit
	 * @param importName
	 *            the import name
	 * @return the SymbolEntry for the import or null if not found.
	 */
	public ImportNode getImportByName(Atom name, UnitNode u) {
		String[] path = name.getText().split("\\.");
		String importName = path[0];
		ImportNode imp = importMap.get(importName);
		if (imp != null)
			return imp;
		else {
			SymbolEntry impse = u.lookupName(importName);
			DeclNode.Usr base = u.getUnitType().getBaseType();
			if (impse == null) {
				// As UnitNode.importSymbols() has not been called this could be
				// from a basetype
				boolean notFound = true;
				while (base != null) { // if not found check base symbol tables
					impse = base.lookupName(importName);
					if (impse == null)
						impse = base.lookupName(importName, true);
					if (impse == null)
						base = base.getBaseType();
					else {
						notFound = false;
						break; // found
					}
				}
				if (notFound) {
					return null;
				}
			}
			if (impse.node() instanceof ImportNode)
				return (ImportNode) impse.node();

			// else get the import from the unit type
			String n = impse.scope().getScopeName();
			n = n.indexOf('.') == -1 ? n : n.substring(n.lastIndexOf('.') + 1);
			imp = importMap.get(n);
			if (imp == null || imp.getUnit() == null) {
				return null;
			}
			imp = imp.getUnit().getImportMap().get(importName);
		}
		return imp;

	}

	/**
	 * @param newSymbol
	 * @param importedSym
	 */
	private void isDuplicateSymbol(SymbolEntry newSymbol,
			Map.Entry<String, SymbolEntry> importedSym) {
		if (getSymbolTable().get(importedSym.getKey()) != null) {
			String symName = importedSym.getKey();
			String oldSc = getSymbolTable().get(importedSym.getKey()).node()
					.getDefiningScope().getScopeName();
			String newSc = newSymbol.scope().getScopeName();
			ParseUnit.current().reportError(
					this,
					"  replacing symbol '" + symName + "' in scope " + oldSc
							+ " with same name symbol in scope " + newSc);
		}
	}

	@Override
	protected void pass1End() {
		this.importSymbols();
		ParseUnit.current().getSymbolTable().leaveScope();
	}

	@Override
	protected boolean pass2Begin() {
		ParseUnit.current().getSymbolTable().enterScope(this);
		return true;
	}

	@Override
	protected void pass2End() {
		ParseUnit.current().getSymbolTable().leaveScope();
	}

	@Override
	public void replaceSymbol(Atom name, ISymbolNode node) {

		SymbolEntry r = getSymbolTable().put(name.getText(),
				new SymbolEntry(definingScope, node));
		boolean dbg = false;
		if (r != null) {
			dbg = true;
		}
		node.setDefiningScope(definingScope);
	}

	@Override
	public SymbolEntry resolveSymbol(Atom name) {
		SymbolEntry s = lookupName(name.getText());
		return (s == null) ? lookupName(name.getText(), true) : s;
	}

	@Override
	public void setDefiningScope(IScope scope) {
		definingScope = scope;
	}

	@Override
	public void setEnclosingScope(IScope scope) {
		enclosingScope = scope;
	}

	void setErrorCount(int errorCount) {
		this.errorCount = errorCount;
	}

	void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	@Override
	public String toString() {
		return token.getText() + flags;
	}

	@Override
	public boolean isReady() {
		return true;
	}

	/**
	 * @return the symbolTable
	 */
	public Map<String, SymbolEntry> getSymbolTable() {
		return symbolTable;
	}

}
