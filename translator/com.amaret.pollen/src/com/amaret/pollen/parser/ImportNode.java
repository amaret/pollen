package com.amaret.pollen.parser;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.antlr.runtime.CommonToken;

public class ImportNode extends BaseNode implements ISymbolNode, IScope, IUnitWrapper {

    
	static private final int FROM = 0;
	static private final int UNIT = 1;
	static private final int AS = 2;
	static private final int META = 3; // might not be present
	
    private Cat cat;
    private IScope definingScope;
    private boolean isExport;
    private UnitNode unit;
    
    ImportNode(int ttype, String ttext) {
        this.token = new Atom(ttype, ttext);
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
    
 
    public String getQualName() {
        return getUnit().getQualName();
    }
    
    public Atom getUnitName() {
        return ((BaseNode) getChild(UNIT)).getAtom();
    }
    
    public UnitNode getUnit() {
        return unit;
    }
    
    @Override
    public IScope getDefiningScope() {
        return definingScope;
    }
    
    public Cat getTypeCat() {
    	cat = null;
    	// TODO
    	assert cat != null;
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

		
	}
}
