package com.amaret.pollen.parser;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import com.amaret.pollen.parser.SymbolEntry;

public class ImportNode extends BaseNode implements ISymbolNode, IScope, IUnitWrapper, DeclNode.ITypeKind {

    
	static private final int FROM = 0;
	static private final int UNIT = 1;
	static private final int AS = 2;
	static private final int META = 3; // might not be present
	
    private Cat cat = null;
	private UnitNode unit;	// the unit the import binds to (see bindUnit()).
    private EnumSet<Flags> flags = EnumSet.noneOf(Flags.class);
    private IScope definingScope;
    private boolean isExport;
    private DeclNode.Usr exportUnit = null; // for exports, the ultimate unit the imported unit resolves to.
    private boolean isProtocolBindTarget = false;
    private boolean fromComposImportModule = false;
    
	public boolean isFromComposImportModule() {
		return fromComposImportModule;
	}
	public void setFromComposImportModule(boolean fromComposImportModule) {
		this.fromComposImportModule = fromComposImportModule;
	}
	/**
	 * If this import brings in a unit that has been exported by another unit, 
	 * retrieve the export unit of that unit. 
	 * Used to resolve lookups into exported units.
	 * @return if this is an import of an exported unit return that unit else null
	 */
	public IScope getExportedUnit() {
		IScope sc = null;
	
		if (this.getUnit() != null) {
			if (this.getUnit().getSymbolTable().containsKey(
					this.getUnitName().getText())) {
				SymbolEntry se = this.getUnit().getSymbolTable().get(
						this.getUnitName().getText());
				if (se != null) {
					if (se.node() instanceof ImportNode
							&& ((ImportNode) se.node()).isExport()
							&& ((ImportNode) se.node()).getExportUnit() != null) {
						sc = (IScope) ((ImportNode) se.node()).getExportUnit();
					}
				}
			}
		}
    	return sc;
	}
	/**
	 * If the unit which contains this import also contains an export statement for 
	 * the imported unit, this field contains the DeclNode for that imported/exported unit. 
	 * 
	 * This is different from the field 'unit' because for modules exported from compositions
	 * the unit which this import is bound to is the composition.
	 * 
	 * @return the DeclNode of the exported unit
	 */
	public DeclNode.Usr getExportUnit() {
		return exportUnit;
	}
	/**
	 * Resolve the export to its unit DeclNode. With cascaded imports via compositions, this info is lost from the unit the import is bound to.
	 */
	public void setExportUnit(DeclNode.Usr exportUnit) {
		this.exportUnit = exportUnit;
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
    
    ImportNode(int ttype, String ttext) {
        this.token = new Atom(ttype, ttext);
    }
    ImportNode(int ttype, String ttext, EnumSet<Flags> f) {
        this(ttype, ttext);
        flags = f;
    }
    ImportNode(BaseNode b) {
    	
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
		this.isExport = isExport;
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
       
    
	/**
	 * Return the name which is used locally. 
	 * import m           // returns m
	 * import m as q      // returns q
	 */
    @Override
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
        if (ParseUnit.isDebugMode()) {
        	String list = "";
        	for (List<DeclNode.Fcn> fl : this.getUnit().getFcnMap().values()) {
        		for (DeclNode.Fcn f : fl) {
        			list += f.getName() + " ";
        		}   
        		if (!list.isEmpty())
        			list = " containing fcns: " + list;
        	}
        	
        	ParseUnit.current().reportError(this, "Binding module '" + getName().getText() + "' to unit '" + unit.getQualName() + list);
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
