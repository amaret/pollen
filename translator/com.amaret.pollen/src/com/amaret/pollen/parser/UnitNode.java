package com.amaret.pollen.parser;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.antlr.runtime.CommonToken;

public class UnitNode extends BaseNode implements ISymbolNode, IScope {
	
    static private final int BODIES = 5;
    static private final int DECLS = 4;
    static private final int EXPORTS = 2;
    static private final int IMPORTS = 1;
    static private final int PKGNAME = 0;
    
    private enum Children {
    	BODIES, DECLS, EXPORTS, IMPORTS, PKGNAME   	
    }
    
    private Map<String,BodyNode> bodyMap = new HashMap<String,BodyNode>();
    private Map<String,UnitNode> clientMap = new HashMap<String,UnitNode>();
    private IScope definingScope;
	private IScope enclosingScope;
	private int errorCount;
	private long fileDate;
    private String filePath;
	private int flags;
	private Atom name;
	private Map<String,Integer> stringTable = new HashMap<String,Integer>();
    private UnitNode supInter;
    private Map<String,SymbolEntry> symbolTable = new HashMap<String,SymbolEntry>();
    //private Cat typeCat;
    
    UnitNode(int ttype, String ttext, int flags) {
      	this.token = new CommonToken(ttype, ttext);
      	this.flags = flags;
    }
	
    void addClient(UnitNode u) {
        clientMap.put(u.getQualName(), u);
    }
    
    void addString(String s) {
        if (!stringTable.containsKey(s)) {
            stringTable.put(s, stringTable.size());
        }
    }
    
    private void checkFxns(UnitNode su) {
//        if (su.getSuper() == null) {
//            return;
//        }
//        Atom interName = (su != this) ? getSuperNode().getInter() : null;
//        checkFxns(su.getSuper());
//        for (DeclNode d : su.getDecls()) {
//            if (d instanceof DeclNode.Fxn) {
//                if (!bodyMap.containsKey(d.getName().getText())) {
//                    if (interName != null) {
//                        currUnit.reportError(interName, "no function definition found for '" + d.getName() + "'");
//                    }
//                    else {
//                        currUnit.reportError(d.getName(), "no function definition found");
//                    }
//                }
//            }
//            else if (d instanceof DeclNode.Struct) {
//                DeclNode.Struct str = (DeclNode.Struct) d;
//                if (str.hasMethods()) {
//                    for (DeclNode.Fxn fxn : str.getFxns()) {
//                        String fn = str.getName().getText() + "." + fxn.getName().getText();
//                        if (!bodyMap.containsKey(fn)) {
//                            if (interName != null) {
//                                currUnit.reportError(interName, "no function definition found for '" + fn + "'");
//                            }
//                            else {
//                                currUnit.reportError(d.getName(), "no function definition found");
//                            }
//                        }
//                    }
//                }
//            }
//        }
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
        bodyMap = null;
        clientMap = null;
        definingScope = null;;
        enclosingScope = null;
        stringTable = null;
        supInter = null;
        symbolTable = null;
        //typeCat = null;
    }
    
    public int findString(String s) {
        Integer id = stringTable.get(s);
        return id != null ? id : -1;
    }
    
    @SuppressWarnings("unchecked")
    public List<BodyNode> getBodies() {
    	// TODO
    	return null;
        //return ((ListNode<BodyNode>)getChild(BODIES)).getElems();
    }
    
    public Collection<UnitNode> getClients() {
        return clientMap.values();
    }
    
    @SuppressWarnings("unchecked")
	public List<DeclNode> getDecls() {
    	// TODO
    	return null;
    	//return ((ListNode<DeclNode>)getChild(DECLS)).getElems();
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
    public List<ExportNode> getExports() {
        return ((ListNode<ExportNode>)getChild(EXPORTS)).getElems();
    }
    
    @SuppressWarnings("unchecked")
    public List<ImportNode> getImports() {
        return ((ListNode<ImportNode>)getChild(IMPORTS)).getElems();
    }
    
    public long getFileDate() {
        return fileDate;
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
        return stringTable.entrySet();
    }

    public UnitNode getSuper() {
        return supInter;
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
        // TODO
    }
    
    public boolean isComposite() {
    	// TODO
        return false;
    }
    
    public boolean isInterface() {
    	// TODO
        return false;
 
    }

    public boolean isHost() {
    	// TODO
        return false;
 
    }

    public boolean isModule() {
    	// TODO
        return false;
 
    }
    
    public boolean isTarget() {
    	// TODO
        return false;
 
    }

    public boolean isTemplate() {
    	// TODO
        return false;
 
    }
    
    
    public BodyNode lookupBody(String name) {
        return bodyMap.get(name);
    }
    
    @Override
    public SymbolEntry lookupName(String name) {
        return symbolTable.get(name);
    }
    
    @Override
    protected boolean pass1Begin() {
    	
    	ParseUnit currUnit = ParseUnit.current();
        
        for (BodyNode body : getBodies()) {
            if (bodyMap.containsKey(body.getName().getText())) {
                currUnit.reportError(body.getName(), "function already defined");
                return false;
            }
            else {
                bodyMap.put(body.getName().getText(), body);
            }
        }
        
        
        
        currUnit.getSymbolTable().enterScope(this);
        
        // TODO
        // check for valid imports, implements, extends
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
