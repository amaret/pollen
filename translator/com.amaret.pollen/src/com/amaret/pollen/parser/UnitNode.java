package com.amaret.pollen.parser;

import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.antlr.runtime.CommonToken;

public class UnitNode extends BaseNode implements ISymbolNode, IScope, IUnitWrapper {
	
    static private final int IMPORTS = 1;
    static private final int PKGNAME = 0;
    // features are injections and the unit type definition, child index >= 2
    static private final int FEATURES = 2; 
    
    // Each name can map to multiple DeclNode.Fcn nodes, for overloads.
    private Map<String,List<DeclNode.Fcn>> fcnMap = new HashMap<String,List<DeclNode.Fcn>>();
    // A client is a unit that imports this unit.
    private Map<String,UnitNode> clientMap = new HashMap<String,UnitNode>();
    private List<ExportNode> exportList = new ArrayList<ExportNode>();
    private DeclNode.UserTypeDef unitType;
    private IScope definingScope;
	private IScope enclosingScope;
	private int errorCount;
    private String filePath;
	private EnumSet<Flags> flags;
	private Atom name;
	private Map<String,Integer> exprConstStringTable = new HashMap<String,Integer>();
    private Map<String,SymbolEntry> symbolTable = new HashMap<String,SymbolEntry>();
    private Cat typeCat;

	public List<ExportNode> getExportList() {
		return exportList;
	}

	public Map<String, List<DeclNode.Fcn>> getFcnMap() {
		return fcnMap;
	}
	
	/**
	 * Add Fcn Node to Map. Handle overloaded function names.
	 * @param name
	 * @param fcn
	 */
	public void addFcn(String name, DeclNode.Fcn fcn) {
		if (!fcnMap.containsKey(name)) {
			List<DeclNode.Fcn> fcnEntry = new ArrayList<DeclNode.Fcn>();
			fcnEntry.add(fcn);
			fcnMap.put(name, fcnEntry);
			return;
		}
		fcnMap.get(name).add(fcn);		
	}
		
	public DeclNode.UserTypeDef getUnitType() {
		return unitType;
	}

	public void setUnitType(DeclNode.UserTypeDef unitType) {
		this.unitType = unitType;
	}

	
    
    UnitNode(int ttype, String ttext, EnumSet<Flags> f) {
      	this.token = new CommonToken(ttype, ttext);
      	this.flags = f;
    }
	/**
	 * This unit is imported by another unit 'u'
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
	    symbolTable.put(name.getText(), new SymbolEntry(this, node));
	    node.setDefiningScope(this);
	    return true;
    }
    
    void destruct() {
        fcnMap = null;
        clientMap = null;
        exportList = null;
        definingScope = null;;
        enclosingScope = null;
        exprConstStringTable = null;
        symbolTable = null;
        typeCat = null;
    }
    
    public int findString(String s) {
        Integer id = exprConstStringTable.get(s);
        return id != null ? id : -1;
    }
    
    public Collection<UnitNode> getClients() {
        return clientMap.values();
    }
    
    @SuppressWarnings("unchecked")
	public List<BaseNode> getFeatures() {
    	return ((ListNode<BaseNode>)getChild(FEATURES)).getElems();
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
    public Set<Map.Entry<String,SymbolEntry>> getEntrySet() {
        return symbolTable.entrySet();
    }

    public int getErrorCount() {
        return errorCount;
    }
    
    @SuppressWarnings("unchecked")
    public List<ImportNode> getImports() {
        return ((ListNode<ImportNode>)getChild(IMPORTS)).getElems();
    }
    
    public String getFilePath() {
        return filePath;
    }
    
    @Override
    public Atom getName() {
        return name;
    }
    
    public Atom getPkgName() {
        return ((BaseNode) getChild(PKGNAME)).getAtom();
    }
    
    public String getQualName() {
        return "" + getPkgName() + '.' + getName();
    }

    public Set<Map.Entry<String,Integer>> getStrings() {
        return exprConstStringTable.entrySet();
    }
    
    public UnitNode getUnit() {
        return this;
    }
    
    @Override
    public com.amaret.pollen.parser.Cat getTypeCat() {
    	Cat rtn = null;
    	assert rtn != null;
    	return rtn;
//        if (typeCat == null) {
//            typeCat = Cat.fromSymbolNode(this, this.getDefiningScope());
//        }
//        return typeCat;
    }
    
    void incErrorCount() {
        this.errorCount += 1;
    }

    void init() {
    	filePath = ParseUnit.current().getPath();
    }
    
   public boolean isHost() {
    	if (flags.contains(Flags.HOST))
    		return true;
        return false;

    }
   public boolean isEnum() {
   	if (flags.contains(Flags.ENUM))
   		return true;
   	return false;
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
    public boolean isComposition() {
    	if (flags.contains(Flags.COMPOSITION))
    		return true;
    	return false;
    }
    public boolean isClass() {
    	if (flags.contains(Flags.CLASS))
    		return true;
    	return false;
    }
    public boolean isMeta() {
    	if (flags.contains(Flags.META))
    		return true;
    	return false;
    }

    public List<DeclNode.Fcn> lookupFcn(String name) {
        return fcnMap.get(name);
    }
    
    @Override
    public SymbolEntry lookupName(String name) {
        return symbolTable.get(name);
    }
    
    @Override
    protected boolean pass1Begin() {
    	flags = unitType.getFlags();
    	ParseUnit currUnit = ParseUnit.current();               
        currUnit.getSymbolTable().enterScope(this);
    	// TODO The unitType is now known. 
    	//      Check for valid features (imports, implements, extends, etc).
       return true;
    }
    
    @Override
    protected void pass1End() {

        ParseUnit.current().getSymbolTable().leaveScope();
    }
    
    @Override
    protected boolean pass2Begin() {
        return true;
    }

    @Override
    public void replaceSymbol(Atom name, ISymbolNode node) {
        symbolTable.put(name.getText(), new SymbolEntry(definingScope, node));
        node.setDefiningScope(definingScope);
    }

    @Override
    public SymbolEntry resolveSymbol(Atom name) {
        return lookupName(name.getText());
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
}
