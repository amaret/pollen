package com.amaret.pollen.parser;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ImportNode extends BaseNode implements ISymbolNode, IScope, IUnitWrapper, DeclNode.ITypeKind {

    
	static private final int FROM = 0;
	static private final int UNIT = 1;
	static private final int AS = 2;
	static private final int META = 3; // might not be present
	
    private Cat cat = null;
    private IScope definingScope;
    private boolean isExport;
    private boolean isCopy = false;
    private boolean isProtocolBindTarget = false;
    private Map<String, SymbolEntry> exportFcns = new HashMap<String, SymbolEntry>();
    private Map<String, List<SymbolEntry>> scopesExportFcns = new HashMap<String,  List<SymbolEntry>>();
    
    public Map<String, List<SymbolEntry>> getScopesExportFcns() {
		return scopesExportFcns;
	}
	public void setExportFcns(Map<String, SymbolEntry> exportFcns) {
		this.exportFcns = exportFcns;
	}
	public boolean isCopy() {
		return isCopy;
	}
	public Map<String, SymbolEntry> getExportFcns() {
		return exportFcns;
	}
	/**
     * @param name function name
     * @return true if this is a call to an exported function else false.
     */
    public boolean isValidExportFcnCall(String name) {
    	return (exportFcns.get(name) != null) ?  true : false;
    }
    /**
     * lookup name in the list of fcns exported from this import.
     * @param name
     * @return the SymbolEntry if it exists or null
     */
    public SymbolEntry lookupExportFcn(String name) {
    	return exportFcns == null ? null : exportFcns.get(name);
    }
    
    public boolean hasExportFcns() {
    	return exportFcns != null && exportFcns.size() > 0;
    }
    /**
     * Insert function into the exportFcn list.
     * Also add this function to the map scopesExportFcns
     * where the key is the scopeName for the exported fcn.
     * @param name
     * @param s
     */
    public void insertExportFcn(String name, SymbolEntry s) {
    	if (exportFcns == null)
    		return;
    	exportFcns.put(name, s);
    	
    	if (!(s.node() instanceof DeclNode.Usr))
    		ParseUnit.internalMsg("export fcn " + s.node().getName().getText() + " lacks user type");
    	
    	String sc = s.scope().getScopeName();
    	List<SymbolEntry> fcns;
    	if (this.scopesExportFcns.get(sc) == null) {
    		fcns = new ArrayList<SymbolEntry>();    		
    	}
    	else
    		fcns = this.scopesExportFcns.get(sc);
    	fcns.add(s);
    	this.scopesExportFcns.put(sc, fcns);
    }
    /**
     * true if this import is used in a composition to bind a protocol member
     */
    public boolean isProtocolBindTarget() {
		return isProtocolBindTarget;
	}
    /**
     * true if this import is used in a composition to bind a protocol member
     */
	public void setProtocolBindTarget(boolean isProtocolBindTarget) {
		this.isProtocolBindTarget = isProtocolBindTarget;
	}

	private UnitNode unit;
    private EnumSet<Flags> flags = EnumSet.noneOf(Flags.class);
    
    ImportNode(int ttype, String ttext) {
        this.token = new Atom(ttype, ttext);
    }
    ImportNode(int ttype, String ttext, EnumSet<Flags> f) {
        this(ttype, ttext);
        flags = f;
    }
    ImportNode(BaseNode b) {
    	
    }
    /**
     * copy
     * This preserves the export filter on the import being copied.
     * Called by UnitNode.importSymbols().
     */
    public ImportNode copy() {
    	ImportNode newi = new ImportNode(new BaseNode(this.token));
    	newi.unit = unit;
    	newi.cat = cat;
    	newi.definingScope = definingScope;
    	newi.children = children;
    	newi.parent = parent;
    	newi.childIndex = childIndex;
    	newi.setIndexes(this.getStartIndex(), this.getStopIndex());
    	newi.isProtocolBindTarget = isProtocolBindTarget;
    	newi.isExport = isExport;
    	newi.exportFcns = exportFcns;   
    	newi.isCopy = true;
    	return newi;    	
    }
    
    public boolean isTypeMetaArg() {
    	if (flags.contains(Flags.TYPE_META_ARG))
    		return true;
    	return false;
    }
   
    public boolean isExport() {
		return isExport;
	}

	public void setExport(boolean isExport) {
		//ParseUnit.setDebugMode(false);
		this.isExport = isExport;
		//ParseUnit.setDebugMode(false);
	}

	/**
     * 
     * @return 'As' node. Might be NIL node.
     */
    public Atom getAs() {
    	 return ((BaseNode) getChild(AS)).getAtom();
    }

    /**
     * 
     * @return 'From' node. 
	 * If 'from' clause not present, the default is returned
	 * (which is the package of the file which contains this import stmt). 
     */
    public Atom getFrom() {
        return ((BaseNode) getChild(FROM)).getAtom();
    }
    /**
     * 
     * @return Meta args LIST node or null, if none.
     * Note '{}' returns an empty LIST. 
     */
    @SuppressWarnings("unchecked")
    public List<BaseNode> getMeta() {
    	return this.getChildCount() > META ?  ((ListNode<BaseNode>)getChild(META)).getElems() : null;   	
    }
       
    @Override
    /**
     * Return the name which is used locally. 
     * import m           // returns m
     * import m as q      // returns q
     */
    public Atom getName() {
    	if (!getAs().getText().equals("NIL"))
    		return getAs();
    	return getUnitName();
    }
    @Override
    public String getScopeName() {
    	return getName().getText();
    }
    
    /**
     * (If bound) 
     * Return the qualified name of the unit to which
     * this import is bound.
     * from p import m        // returns p.m
     * from p import m as q   // returns p.m
     * (If not bound) 
     * in the above cases return m
     */
    public String getQualName() {
    	if (unit != null)
    		return getUnit().getQualName();
    	return getUnitName().getText();
    }
    /**
     * Always the original name (never the 'as' name).
     * @return name of the imported unit
     */
    public Atom getUnitName() {
        return ((BaseNode) getChild(UNIT)).getAtom();
    }
    /**
     * return the Unit imported by this import.
     * Can be null if not yet bound. Also can be null if this is an import
     * of a primitive type (uint8) as a result of meta type instantiation.
     */
    public UnitNode getUnit() {
        return unit;
    }
    
    @Override
    public IScope getDefiningScope() {
        return definingScope;
    }
    
    public Cat getTypeCat() {
    	if (unit != null)
    		cat = Cat.fromSymbolNode(unit, unit.getDefiningScope());
    	return cat;
    }
    
    @Override
    public void setDefiningScope(IScope scope) {
        definingScope = scope;
    }

    @Override
    public boolean defineSymbol(Atom name, ISymbolNode node) {
        return false;
    }

    @Override
    public IScope getEnclosingScope() {
        return null;
    }

    @Override
    public Set<Map.Entry<String,SymbolEntry>> getEntrySet() {
        return null;
    }

    @Override
    public SymbolEntry lookupName(String name) {
    	if (unit == null)
    		return null; // bindunit() not yet called
    	SymbolEntry result = unit.lookupName(name); 
    	if (result != null)
    		return result;
    	return unit.getUnitType().lookupName(name);
    }

    
    @Override
    public SymbolEntry lookupName(String name, boolean chkHostScope) {
    	if (unit == null)
    		return null; // bindunit() not yet called
    	SymbolEntry result = unit.lookupName(name, chkHostScope); 
    	if (result != null)
    		return result;
    	return unit.getUnitType().lookupName(name, chkHostScope);
    }
   
    @Override
    public void replaceSymbol(Atom name, ISymbolNode symbol) {
    }

    @Override
    public SymbolEntry resolveSymbol(Atom name) {
        return unit.resolveSymbol(name);
    }

    @Override
    public void setEnclosingScope(IScope scope) {
    }

	/**
	 * Connect the importNode to its defining Unit (unitNode). 
	 * @param impUnit
	 */
	public void bindUnit(UnitNode impUnit) {
		unit = impUnit;
        cat = Cat.fromSymbolNode(unit, unit.getDefiningScope());
        boolean dbg = false;
        if (dbg) {
        	String list = "";
        	for (List<DeclNode.Fcn> fl : this.getUnit().getFcnMap().values()) {
        		for (DeclNode.Fcn f : fl) {
        			list += f.getName() + " ";
        		}        		
        	}
        	if (!list.isEmpty())
        		ParseUnit.current().reportError("", "Binding module '" + getName().getText() + "' to unit '" + unit.getQualName() + "' containing fcns: " + list);
        }
	}      
	
	@Override
	public boolean isClass() {
		if (unit != null)
			return unit.isClass();		
		return false;
	}

	@Override
	public boolean isComposition() {
		if (unit != null)
			return unit.isComposition();	
		System.out.println("Null unit for import " + getName());
		return false;

	}

	@Override
	public boolean isEnum() {
		if (unit != null)
			return unit.isEnum();		
		return false;
	}

	@Override
	public boolean isModule() {
		if (unit != null)
			return unit.isModule();		
		return false;

	}

	@Override
	public boolean isProtocol() {
		if (unit != null)
			return unit.isProtocol();		
		return false;
	}

	@Override
	public boolean isReady() {
		return (unit != null);
	}

}
