package com.amaret.pollen.parser;

import com.amaret.pollen.parser.DeclNode.Fcn;
import com.amaret.pollen.parser.DeclNode.ITypeKind;
import com.amaret.pollen.parser.DeclNode.Usr;

public class ExportNode extends BaseNode implements ISymbolNode {

    static private final int NAME = 0;
    private IScope definingScope;
	private IScope enclosingScope;
    
    ExportNode(int ttype, String ttext) {
        this.token = new Atom(ttype, ttext);
        enclosingScope = null;
    }
   
    public IScope getDefiningScope() {
        return definingScope;
    }
    public void setDefiningScope(IScope scope) {
        definingScope = scope;
    }
    
    public void setEnclosingScope(IScope scope) {
        enclosingScope = scope;
    }
    
    public Atom getName() {
        return ((BaseNode) getChild(NAME)).getAtom();
    }
    /**
     * Enter the ExportNode symbol in the unit symtab where the export appears.  
     * This entry will not be copied to other symboltables (unlike imports).
     * @param name
     */
    private void enterExport(Atom name) {
    	ParseUnit currUnit = ParseUnit.current();
    	Atom export = new Atom(name);
    	boolean dbg = false;
    	export.setText(ParseUnit.EXPORT_PREFIX+name.getText());
    	currUnit.getCurrUnitNode().defineSymbol(export, this);
    	if (dbg) {
			ParseUnit.current().reportError(currUnit.getCurrUnitNode(), "** enterExport() for symbol '" + export.getText() + "' in scope " + currUnit.getCurrUnitNode().getQualName());
    	}
    }
    /**
     * 
     * @param name e.g. 'm.foo' from 'export m.foo'
     * @param emitMsg emit error msg if appropriate
     * @return the DeclNode for that function
     */
    public static ISymbolNode getExportFcnDclnNode(Atom name, boolean emitMsg) {

    	String[] path = name.getText().split("\\.");
    	if (path.length < 2) {
    		ParseUnit.internalMsg("ExportNode.getExportFcnDclnNode(): Invalid export function specification " + name.getText());
    		return null;
    	}


    	ParseUnit currUnit = ParseUnit.current();
    	ImportNode imp = currUnit.getCurrUnitNode().getImportByName(name, ParseUnit.current().getCurrUnitNode());
    	
    	String unit = path[0];
    	String fcn = path[1];
    	
    	Atom u = new Atom(name);
    	u.setText(unit);
    	
    	SymbolEntry fse = null;
    	ISymbolNode fsn = null;
    	boolean dbg = false;
    	if (name.getText().equals("Mcu.wait"))
    		dbg = true;
    	   	
    	if (imp == null) {
    		if (emitMsg)
    			currUnit.reportError(name, "not an imported unit");
    		return null;
    	}

    	
    	while (true) {
    		UnitNode impu = imp.getUnit();
    		if (impu == null)
    			dbg = true;
    		if (impu.isComposition()) {
    			fse = impu.lookupExportInUnit(fcn);
    			fsn = fse != null ? fse.node() : null;
    			if (fsn != null)
    				break;
    			u.setText(imp.getUnitName().getText());
    			imp = impu.getImportByName(u, ParseUnit.current().getCurrUnitNode()); 
    			if (imp == null) {
    				dbg = true;
    				return null;
    			}
    			
    		}
    		else if (impu.isModule()) {
    			fse = impu.getUnitType().lookupName(fcn); 
    			if (fse == null)
    				fse = impu.getUnitType().lookupName(name.getText(), true);
    			fsn = fse != null ? fse.node() : null;
    			break; // once we are at the module we are done.    			
    		}
    		else {
    			ParseUnit.internalMsg("ExportNode.getExportFcnDclnNode(): Invalid unit type for export fcn " + name.getText());
    			return null;	
    		}   		
    	}
    	if (fse == null) {
    		return null;
    	}   	    	
    	return fsn;
    }
    
    /**
     * 
     * @param name e.g. 'm' from 'export m'
     * @return the DeclNode for that module
     */
    ISymbolNode getExportModDclnNode(Atom name) {

    	String[] path = name.getText().split("\\.");
    	if (path.length != 1) {
    		ParseUnit.internalMsg("ExportNode.getExportModDclnNode(): Invalid export module specification " + name.getText());
    		return null;
    	}

    	String unit = path[0];
    	ParseUnit currUnit = ParseUnit.current();
    	Atom u = new Atom(name);
    	u.setText(unit);
    	SymbolEntry mse = null;
    	ISymbolNode msn = null;
    	boolean dbg = false;
    	if (name.getText().equals("AsInterrupts"))
    		dbg = true;

    	ImportNode imp = currUnit.getCurrUnitNode().getImportByName(name, ParseUnit.current().getCurrUnitNode());
    	if (imp == null) {
    		currUnit.reportError(name, "not an imported unit");
    		return null;
    	}

    	
    	while (true) {
    		UnitNode impu = imp.getUnit();
    		if (impu == null)
    			return null;
    		if (impu.isComposition()) {
    			mse = impu.lookupExportInUnit(unit);
    			msn = mse != null ? mse.node() : null;
    			if (msn instanceof ImportNode && ((ImportNode)msn).isModule())
    				msn = ((ImportNode)msn).getUnit().getUnitType();
    			if (msn != null && ((ITypeKind) msn).isModule())
    				break;
    			u.setText(imp.getUnitName().getText());
    			ISymbolNode tmp = imp.getUnit() != null ? imp.getUnit().getUnitType() : imp;
    			imp = impu.getImportByName(u, impu); 
    			if (((ITypeKind) tmp).isComposition() && imp == null)
    				return tmp;
    			if (imp == null)
    				return null;
    			
    		}
    		else if (impu.isModule()) {
    			mse = impu.lookupExportInUnit(impu.getUnitType().getName().getText());
    			msn = mse != null ? mse.node() : null;
    			break; // once we are at the module we are done.    			
    		}
    		else {
    			ParseUnit.internalMsg("ExportNode.getExportModDclnNode(): Invalid unit type for export " + name.getText());
    			return null;	
    		}   		
    	}
    	if (mse == null) {
    		return null;
    	}   	    	
    	return msn;
    }

    
    /**
     * Enter exported modules and functions in the UnitNode symboltable of the exporting composition.
     */
    @Override
    protected boolean pass1Begin() {
    	ParseUnit currUnit = ParseUnit.current();
    	

        Atom exportedName = getName();
        if (exportedName.getText().matches(ParseUnit.INTRINSIC_PREFIX + ".*")) {
        	String n = getName().getText().substring(getName().getText().lastIndexOf("_")+1);      	
			ParseUnit.current().reportError(ParseUnit.current().getCurrUnitNode(), "Invalid export ('export " + "pollen." + n + "') will be ignored.");  
			return false;
        }
        
        boolean dbg = false; //exportedName.getText().equals("GlobalInterrupts"); //|| getName().getText().equals(""); // || name.getText().equals("ATmega328");
        if (dbg) {
     		System.out.println("\n**************ExportNode.pass1Begin() for " + exportedName.getText() + " in unit " + currUnit.getCurrUnitNode().getQualName() + "**********************\n" );
     		dbg = false;
        }

        String[] path = exportedName.getText().split("\\.");
    	if (path.length > 2) {
    		currUnit.reportError(ParseUnit.current().getCurrUnitNode(), "'" + exportedName.getText() + "' has too many levels of qualification for an exported function");
    		return false;
    	}

        
        // Get the exported unit
                
        SymbolEntry exportedUnit = currUnit.getCurrUnitNode().lookupName(path[0]);
		if (exportedUnit == null)
			exportedUnit = currUnit.getCurrUnitNode().lookupName(path[0], true);      
        if (exportedUnit == null) {
        	// As UnitNode.importSymbols() has not been called this import could be in a basetype 
        	DeclNode.Usr base = currUnit.getCurrUnitNode().getUnitType().getBaseType();
    		boolean notFound = true;
    		while (base != null) { // if not found check base symbol tables
    			
    			exportedUnit = base.lookupName(path[0]);
    			if (exportedUnit == null)
    				exportedUnit = base.lookupName(path[0], true);       				
    			if (exportedUnit == null)
    				base = base.getBaseType();
    			else {
    				notFound = false;
    				break;  // found
    			}
    		}
    		if (notFound) {
    			currUnit.reportError(getName(), "not an imported unit");
    			return false;
    		}
    		
     		// Note that ParseUnit.parseImports() enters import into symtab

        }

        // Get the import associated with this export
        ImportNode imp = currUnit.getCurrUnitNode().getImportByName(getName(), ParseUnit.current().getCurrUnitNode());
        
        if (imp == null) {
        	currUnit.reportError(getName(), "not an imported unit");
        	return false;
        }
        
        imp.setExport(true);

        if (path.length == 1) { // module export, not a function export
        	        	
        	// TODO 
        	// do I call enterExport() for the module in 'export m.foo' when there is no 'export m'?
        	// currently I set isExport() true but don't call enterExport().
        	
        	enterExport(exportedName);
        	currUnit.getCurrUnitNode().getExportList().add(this);
            ISymbolNode modDcl = this.getExportModDclnNode(exportedName);
            if (modDcl == null) { //|| !(modDcl instanceof DeclNode.Usr)) {
            	// Okay to return null when the export is a composition export 
            	currUnit.reportError(exportedName, "exported module not found");
            	return false;
            }
            if (modDcl instanceof DeclNode.Usr)
            	imp.setExportUnit((Usr) modDcl);
            //((DeclNode.Usr)modDcl).setExport(true);
            SymbolEntry se = new SymbolEntry(currUnit.getCurrUnitNode(), imp);
            
            // Insert module into outermost symboltable so it can be found by clients            
            //If there is an import this replaces it. Used for lookups.
            currUnit.getCurrUnitNode().putSymbol(path[0], se);
        	return false; // done
        }
        
        // handle the function export
        ISymbolNode fcnDcl = ExportNode.getExportFcnDclnNode(exportedName, true);
        if (fcnDcl == null || !(fcnDcl instanceof DeclNode.Fcn)) {
        	currUnit.reportError(exportedName, "exported function not found");
        	return false;
        }
        currUnit.getCurrUnitNode().addFcn(path[1], (Fcn) fcnDcl);
        // Use imp for the scope 
        SymbolEntry se = new SymbolEntry(imp /*currUnit.getCurrUnitNode()*/, fcnDcl);
        
        // Insert fcn into outermost symboltable so it can be found by clients
        
        if (!currUnit.getCurrUnitNode().getSymbolTable().containsKey(path[1]))
        	currUnit.getCurrUnitNode().putSymbol(path[1], se);
        else 
        	currUnit.reportError(ParseUnit.current().getCurrUnitNode(), "non-unique name '" + fcnDcl.getName() + "'. Exported function names in a composition must be unique regardless of module qualifier.");
        return false;
    }

	@Override
	public Cat getTypeCat() {
		return null;
	}
}
