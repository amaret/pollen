package com.amaret.pollen.parser;

import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.antlr.runtime.tree.Tree;

import com.amaret.pollen.parser.DeclNode.ITypeKind;

public class UnitNode extends BaseNode implements ISymbolNode, IScope, IUnitWrapper, DeclNode.ITypeKind {
	
    static private final int IMPORTS = 1;
    static private final int PKGNAME = 0;
    static private final int INJECT1 = 2;
    static private final int UNIT = 3;
    static private final int INJECT2 = 4;
     
    
    // Each name can map to multiple DeclNode.Fcn nodes, for overloads.
    private Map<String,List<DeclNode.Fcn>> fcnMap = new HashMap<String,List<DeclNode.Fcn>>();
    // A client is a unit that imports this unit.
    private Map<String,UnitNode> clientMap = new HashMap<String,UnitNode>();
    private List<ExportNode> exportList = new ArrayList<ExportNode>();
    private DeclNode.Usr unitType;
    private IScope definingScope;
	private IScope enclosingScope;
	private int errorCount;
    private String filePath;
	private EnumSet<Flags> flags = EnumSet.noneOf(Flags.class);
	private Map<String,Integer> exprConstStringTable = new HashMap<String,Integer>();
    private Map<String,SymbolEntry> symbolTable = new HashMap<String,SymbolEntry>();
    private Cat typeCat = null;
    private boolean hostScope = false;

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
		
	public DeclNode.Usr getUnitType() {
		if (unitType == null)
			unitType =  ((DeclNode.Usr) getChild(UNIT));
		return unitType;
	}
	
	public List<DeclNode> getFeatures() {		
		return this.getUnitType().getFeatures();
    }

    
    UnitNode(int ttype, String ttext) {
      	this.token = new Atom(ttype, ttext);
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

    public Set<Map.Entry<String,Integer>> getStrings() {
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

    
    void incErrorCount() {
        this.errorCount += 1;
    }

    void init() {
    	filePath = ParseUnit.current().getCurrPath();
    }
    
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
    	if (flags.contains(Flags.COMPOSITION))
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
    /**
     * 
     * @return true if this unit is a meta instance (instantiated with meta parms).
     */
    public boolean isMeta() {
    	if (flags.contains(Flags.META))
    		return true;
    	return false;
    }
    /**
     * True if this is a deferred instantiation for a meta type
     * (for which no code will be generated).
     * Used only for name resolution, etc.
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
    	boolean isComposition = this.isComposition();
    	String compositionName = isComposition ? this.getName().getText() : "";
    	
    	SymbolEntry result = symbolTable.get(name);
        if (result != null) {
            return result;
        }
        
        if (name.indexOf(".") != -1) {
        	// qualified names ('x.y.z') need chained lookups, one qualifier at a time.
        	IScope sc = this;
        	String qualifier = name.substring(0, name.indexOf("."));
        	name = name.substring(name.indexOf(".")+1, name.length());

        	while (true) {
        		if (result != null && result.node() instanceof IScope)
        			result = ((IScope) result.node()).lookupName(qualifier);
        		else 
        			result = sc.lookupName(qualifier);
        		if (result == null)
        			break;
    	    	if (result != null && isComposition && result.node() instanceof DeclNode.Fcn && !((DeclNode.Fcn) result.node()).isHost()) {
    				ParseUnit.current().reportError(ParseUnit.current().getCurrUnitNode(), "Qualification by composition name ('" + compositionName + "'" + ".<function_call>) is only supported for host functions of the composition. For all other functions qualification must include module name.");  
    	    	}
        		if (name.isEmpty())
        			return result;
        		isComposition = result.node() instanceof ITypeKind ? ((ITypeKind) result.node()).isComposition() : false;
        		if (isComposition) compositionName = result.node().getName().getText();
        		sc = result.scope();
        		if (name.indexOf(".") == -1) {
        			qualifier = name;
        			name = "";
        		}
        		else {
        			qualifier = name.substring(0, name.indexOf("."));
                	name = name.substring(name.indexOf(".")+1, name.length());
        		}      		      		
        	}
        }

        return null;
    }
    @Override
    public SymbolEntry lookupName(String name, boolean chkHostScope) {
    	boolean isComposition = this.isComposition();
    	String compositionName = isComposition ? this.getName().getText() : "";

    	SymbolEntry result = symbolTable.get(name);
        if (result != null) {
            return result;
        }
        
        if (name.indexOf(".") != -1) {
        	// qualified names ('x.y.z') need chained lookups, one qualifier at a time.
        	IScope sc = this;
        	String qualifier = name.substring(0, name.indexOf("."));
        	name = name.substring(name.indexOf(".")+1, name.length());

        	while (true) {
        		if (result != null && result.node() instanceof IScope)
        			result = ((IScope) result.node()).lookupName(qualifier, chkHostScope);
        		else 
        			result = sc.lookupName(qualifier, chkHostScope);
        		if (result == null)
        			break;
    	    	if (result != null && isComposition && result.node() instanceof DeclNode.Fcn && !((DeclNode.Fcn) result.node()).isHost()) {
    	    		// necessary for unambiguous qualification
    				ParseUnit.current().reportError(ParseUnit.current().getCurrUnitNode(), "Qualification by composition name ('" + compositionName + "'" + ".<function_call>) is only supported for host functions of the composition. For all other functions qualification must include module name.");  
    	    	}
        		if (name.isEmpty()) {
        			return result;
        		}
        		isComposition = result.node() instanceof ITypeKind ? ((ITypeKind) result.node()).isComposition() : false;
        		if (isComposition) compositionName = result.node().getName().getText();
        		sc = result.derefScope(false);
        		//sc = result.scope();
        		if (name.indexOf(".") == -1) {
        			qualifier = name;
        			name = "";
        		}
        		else {
        			qualifier = name.substring(0, name.indexOf("."));
                	name = name.substring(name.indexOf(".")+1, name.length());
        		}      		      		
        	}
        }

        return null;

    }
    
    @Override
    protected boolean pass1Begin() {
    	//System.out.println("**UnitNode " + this.getQualName() + " pass1Begin()");
    	flags = unitType.getFlags();
    	ParseUnit currUnit = ParseUnit.current();               
        currUnit.getSymbolTable().enterScope(this);
        // NOTE these inserts into the symbol table cause lookup failures...?
        for (ImportNode imp : this.getImports()) {
        	//currUnit.getCurrUnitNode().defineSymbol(imp.getUnitName(), imp);
        	//defineSymbol(imp.getUnitName(), imp);
        	//currUnit.getSymbolTable().defineSymbol(imp.getUnitName(), imp);
        	if (imp.getUnit() != null && !imp.getUnitName().getText().equals(imp.getAs())) {
        		//currUnit.getCurrUnitNode().defineSymbol(imp.getAs(), imp.getUnit().getUnitType());
        		//defineSymbol(imp.getAs(), imp.getUnit().getUnitType());
        		//defineSymbol(imp.getAs(), imp);
        	}
        }
        //this.importSymbols(); // moved to pass1End() because imports/exports must be handled first.
        return true;
    }
    
    private void importSymbols() {
    	// import all the units that are exported by the units this unit imports

    	boolean dbg = false;
    	ParseUnit.setDebugMode(dbg);
    	String e1 = null, ef1 = null, e2 = null, ef2 = null, e3 = null, ef3 = null;
    	if (dbg) {
    		ParseUnit.current().reportError(this, "**************importSymbols() for unit " + this.getQualName() + "**********************" );
    	}

    	for (ImportNode imp : this.getImports()) {
    		UnitNode iu = imp.getUnit();
    		boolean foundExport = false;
    		SymbolEntry newSymbol;
    		if (iu == null) {
    			if (dbg)
   					ParseUnit.current().reportError(this, "Import " + imp.getQualName() + " has unit = NULL");   			
    		}
    		else 
    		if (iu != null) {

    			SymbolEntry s = iu.lookupName(imp.getUnitName().getText()); // lookup imported type in imported unit
    			if (s == null)
    				continue;
    			SymbolEntry export = this.lookupName(ParseUnit.EXPORT_PREFIX+imp.getName().getText());

    			boolean compositionSymbols = (s.node() instanceof ITypeKind && ((ITypeKind)s.node()).isComposition());
    			

    			if (compositionSymbols || s.node() instanceof ImportNode && ((ImportNode)s.node()).isExport()) {
    				if (dbg) {
    					if (export == null ) // consistency check, only a problem if it was exported
    						System.out.println("In unit " + this.getQualName() + " import '" + imp.getName().getText() + "' has NO EXPORT" );
    				}
    			}
    			// For this import, add its exported symbols to unit symbol table.

    			for (Map.Entry<String, SymbolEntry> exported : iu.symbolTable.entrySet()) {
    				ISymbolNode exportedNode = exported.getValue().node();
    				if (dbg) {
    					e1 = exported.getKey();
    					ParseUnit.current().reportError(this, "check for export of symbol '" + e1 + "' from scope " + ef1 + " into scope " + this.getScopeName());

    				}
    				if (exportedNode instanceof UnitNode)
    					exportedNode = ((UnitNode) exportedNode).getUnitType();
    				
    				if (exportedNode instanceof DeclNode && !((DeclNode) exportedNode).isPublic()) {
    					continue;
    				}
    				
    				if (exportedNode instanceof ImportNode && !((ImportNode) exportedNode).isExport()) {
    					continue;
    				}
    				//						The code below skips some imports, so i have kept the dependency on the 'isExport()' flag above
    				//						(which itself has problems in UnitJScript.genUse(), so I am not using it there.)
    				//    					if (exportedNode instanceof ImportNode) {
    				//    						export = imp.getUnit().lookupName(ParseUnit.EXPORT_PREFIX+((ImportNode)exportedNode).getName().getText());
    				//    						if (export == null)
    				//    							continue;
    				//    					}

    				if (exportedNode instanceof ExportNode) // e.g. not an import or function
    					continue;
    				
    				foundExport = true;

    				// for imports or functions that are exported, make a SymbolEntry that replaces the one created for the import.

    				//SymbolEntry exportedSe = new SymbolEntry(this, exportedSnode); doesn't seem to matter, this or below...
    				newSymbol = new SymbolEntry(exportedNode.getDefiningScope(), exportedNode);


    				if (dbg) {
    					e1 = exported.getKey();
    					ef1 = newSymbol.scope().getScopeName();  	
    					ParseUnit.current().reportError(this, "  import exported symbol '" + e1 + "' from scope " + ef1 + " into scope " + this.getScopeName());

    				}
    				SymbolEntry r2=null, r3=null;
    				r2 = symbolTable.put(exported.getKey(), newSymbol);  
    				if (r2 != null && dbg)  {
    					String i = "";
    					if (r2.node() instanceof ImportNode) {
    						ImportNode r2i = (ImportNode) r2.node();
    						i =  "ImportNode ";
    						i += r2i.isExport() ? "(isExport TRUE) ": "";   							
    					}

    					e2 =  r2.node().getName().getText() + "'";
    					ef2 = "'" + r2.scope().getScopeName() ;   

    					ParseUnit.current().reportError(this, "  and replace SymbolEntry for " + i + ef2 + "." + e2 + " with export '" + exported.getKey() + "'");

    				}
    				if (exported.getKey().equals(imp.getUnitName().getText()) && !exported.getKey().equals(imp.getName().getText())) {

    					r3 = symbolTable.put(imp.getName().getText(), newSymbol);	// 	the 'as' name
    					if (dbg) {
    						ParseUnit.current().reportError(this, "enter " + exported.getKey() + " SymbolEntry with import 'as' name " + imp.getName());
    						if (r3 != null) {
    							ParseUnit.current().reportError(this, "  and replace SymbolEntry for " + imp.getQualName() + " (" + imp.getName().getText() + ") "+ " with SymbolEntry for export " + exported.getKey());
    						}
    					}
    				}
    			}
        		if (foundExport && iu.isComposition()) {
        			// enter the composition name. This is just for error messages: qualification by composition name is not 
        			// supported, but to give a useful message we must know the name.
        			newSymbol = new SymbolEntry(iu.getUnitType().getDefiningScope(), iu.getUnitType());
        			this.symbolTable.put(iu.getName().getText(), newSymbol);
        			
        		}
    		}
    	}
    	ParseUnit.setDebugMode(false);
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
    	
        SymbolEntry r = symbolTable.put(name.getText(), new SymbolEntry(definingScope, node));
        boolean dbg = false;
        if (r != null) {
        	dbg = true;
        }
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


	@Override
	public boolean isReady() {
		return true;
	}

}
