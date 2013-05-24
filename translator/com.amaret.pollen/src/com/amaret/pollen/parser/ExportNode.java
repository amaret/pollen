package com.amaret.pollen.parser;

import java.util.Map;

import com.amaret.pollen.parser.DeclNode.Fcn;
import com.amaret.pollen.parser.DeclNode.ITypeKind;

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
     * handle exports.
     * 
     * export C 	(composition)           
     * 	Exports all C exported functions. 
     *   Add to curr unit symtab and emit errors for duplicates. 
     *   Add to the exportFcns list of local import that provides access to C
     * export C.foo (composition function)
     *   Add foo to the exportFcns list of local import that provides access to C
     * export M 	(module)
     *  Exports only the name 'M'. 
     * export M.foo (module function)
     *   Add foo to the exportFcns list of local import that provides access to C
     * 
     * Also call enterExport for all exported names.
     * 
     * We use the local import to collect exported function names because the lookup
     * for M.foo will find that import for M in the unit symbol table, and then look
     * in M's symtab for foo via that import.  
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
        
        boolean dbg =  false; //exportedName.getText().equals("Mcu.wait"); // || getName().getText().equals("N.bar"); // || name.getText().equals("ATmega328");
        //boolean dbg = currUnit.getCurrUnitNode().getQualName().equals("arduino.uno.Board");
    	//dbg = true;
        if (dbg) {
    		System.out.println("\n**************ExportNode.pass1Begin() for " + exportedName.getText() + " in unit " + currUnit.getCurrUnitNode().getQualName() + "**********************\n" );
    	}

        String[] path = exportedName.getText().split("\\.");
    	if (path.length > 2) {
    		currUnit.reportError(ParseUnit.current().getCurrUnitNode(), "'" + exportedName.getText() + "' has too many levels of qualification for an exported function");
    		return false;
    	}

        
        // Get the local import this export is associated with
                
        SymbolEntry exportedSym = currUnit.getCurrUnitNode().lookupName(path[0]);
		if (exportedSym == null)
			exportedSym = currUnit.getCurrUnitNode().lookupName(path[0], true);       				

        ImportNode localImport = currUnit.getCurrUnitNode().getImportByName(path[0]);
        if (localImport == null) {
        	exportedSym = currUnit.getCurrUnitNode().lookupName(path[0]);
        	DeclNode.Usr base = currUnit.getCurrUnitNode().getUnitType().getBaseType();
        	if (exportedSym == null) {
        		// As UnitNode.importSymbols() has not been called this could be from a basetype       		
        		boolean notFound = true;
        		while (base != null) { // if not found check base symbol tables
        			exportedSym = base.lookupName(path[0]);
        			if (exportedSym == null)
        				exportedSym = base.lookupName(path[0], true);       				
        			if (exportedSym == null)
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
        	
        		String n = exportedSym.scope().getScopeName();
        		n = n.indexOf('.') == -1 ? n : n.substring(n.lastIndexOf('.') +1);
        		localImport = currUnit.getCurrUnitNode().getImportByName(n);
        		if (localImport == null) {
        			currUnit.reportError(getName(), "not an imported unit");
        			return false;        			
        		}
        		// Inserting the exportFcns of the base type
        		if (base != null) {
        			localImport.getExportFcns().putAll(base.getUnit().getFcnsExportedByImports());
        		}       		
        	}
        }
        // for 'export compositionc' add all exported functions of compositionc to unit symboltable of this unit.
        // Also add them to the local import for this export.
        localImport.setExport(true);
        UnitNode u = localImport.getUnit();
		if (u != null && u.isComposition() && path.length == 1) {
			String dbgList = "";
			for (Map.Entry<String, SymbolEntry> e : u.getFcnsExportedByImports().entrySet()) {
				SymbolEntry se = ParseUnit.current().getCurrUnitNode().putSymbol(e.getKey(), e.getValue());		
				if (dbg) {
					System.out.println("ExportNode.pass1Begin(): Insert " + e.getKey() + " into symtab from scope " + u.getName());
				}

				if (se != null && se != e) {
					currUnit.reportError(ParseUnit.current().getCurrUnitNode(), "Export of composition '" + getName().getText() 
							+ "' results in multiple entities being referenced with the name '" + e.getKey() + "'.");
				}
				localImport.insertExportFcn(e.getKey(), e.getValue());
				currUnit.getCurrUnitNode().addFcn(e.getKey(), (Fcn) e.getValue().node());
				dbgList += e.getKey() + " ";
			}
			if (dbg) {
				System.out.println("ExportNode.pass1Begin(): Found export for '" + getName().getText() + "', exporting composition fcns " + dbgList);
			}
		}
		
		// for 'export modulem' no functions are added.
			
		if (path.length == 1) { // 'export compositionC' or 'export moduleM'
			enterExport(exportedName);
	        currUnit.getCurrUnitNode().getExportList().add(this);
			if (exportedSym != null && exportedSym.node() instanceof ITypeKind
					&& ((ITypeKind) exportedSym.node()).isModule()) {
				String msg = " (whereas for compositions, export of the composition will export all exported functions).";
				currUnit
						.reportError(
								ParseUnit.current().getCurrUnitNode(),
								"Found module export. Note that export of a module does not export module functions "
										+ msg);
			}
	        return false; // done
		}
		
		// If we get here this is a function export.
		// Either 'export compositionC.foo' or 'export moduleM.bar'
		
		SymbolEntry exportedUnit = exportedSym;		
		exportedSym = currUnit.getCurrUnitNode().resolveSymbol(getName());  
		ISymbolNode exportedNode = exportedSym == null ? null : exportedSym.node();
		
		Atom fcn = new Atom(exportedName);
		fcn.setText(path[1]);
		
		// if lookup failed to find export look for function name without module qualifier:
		// 'foo' instead of 'Mod.foo'
   		
		if (exportedNode == null 
				&& exportedUnit != null
				&& exportedUnit.node() instanceof ImportNode) {
   			ImportNode i = (ImportNode) exportedUnit.node();    			
			i = (ImportNode) i.getUnit().lookupModuleDefn(i); // look in module where function was defined
			if (i.isComposition()) {
				i = i.getUnit().lookupImportForExport(fcn.getText(), i);
			}
			exportedSym = i.getUnit().getUnitType().lookupName(fcn.getText());
			if (exportedSym == null)
				exportedSym = i.getUnit().getUnitType().lookupName(fcn.getText(), true);
			
			exportedNode = exportedSym != null ? exportedSym.node() : null;            		            			
		}
		
		if (exportedNode == null) {
			currUnit.reportError(getName(), "not an imported unit");
			return false;        			
		}

		
		if (exportedNode != null && exportedNode instanceof DeclNode.Fcn) {
			
			currUnit.getCurrUnitNode().addFcn(fcn.getText(), (Fcn) exportedNode);
			localImport.insertExportFcn(fcn.getText(), exportedSym);
//			if (localImport.isComposition()) { // add exported fcn to unit symtab
//								
//				SymbolEntry se = ParseUnit.current().getCurrUnitNode().putSymbol(fcn.getText(), exportedSym);		
//				if (se != null) {
//					currUnit.reportError(ParseUnit.current().getCurrUnitNode(), "Export of composition function '" + fcn.getText() + "' results in symbol table collision");
//				}	
//				if (dbg) {
//					System.out.println("** ExportNode.pass1Begin(): Found export for '" + getName().getText() + "', exporting composition fcn " + fcn.getText());
//				}
//			}
			
	        if (dbg) {
	    		System.out.println("** ExportNode.pass1Begin(): insert " + fcn.getText() + " into exportFcn  list for import " + localImport.getUnitName().getText());
	    	}
			
			Atom n2 = new Atom(exportedName);
			n2.setText(path[0]);
			enterExport(n2);
		}


        currUnit.getCurrUnitNode().getExportList().add(this);
        return false;
    }

	@Override
	public Cat getTypeCat() {
		return null;
	}
}
