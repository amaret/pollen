package com.amaret.pollen.parser;

import java.util.Map;
import java.util.Set;

import org.antlr.runtime.CommonToken;

public class ImportNode extends BaseNode implements ISymbolNode, IScope {

    
    
    private Cat cat;
    private IScope definingScope;
    private UnitNode unit;
    
    ImportNode(int ttype, String ttext) {
        this.token = new CommonToken(ttype, ttext);
    }
   
    public Atom getAs() {
        return getChildCount() > AS ? ((BaseNode) getChild(AS)).getAtom() : null;
    }

    public Atom getFrom() {
        return ((BaseNode) getChild(FROM)).getAtom();
    }
    
    public ExprNode.Hash getGenArgs() {
        return getChild(ARGS).getType() != EmLexer.NIL ? (ExprNode.Hash) getChild(ARGS) : null;
    }
    
    @Override
    public Atom getName() {
        return getChildCount() > AS ? getAs() : getUnitName();
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
    void export() {
    	// TODO
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
        return unit.lookupName(name); 
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
}
