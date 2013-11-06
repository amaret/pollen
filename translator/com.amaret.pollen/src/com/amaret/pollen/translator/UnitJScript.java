package com.amaret.pollen.translator;

import java.util.EnumSet;
import java.util.List;

import com.amaret.pollen.parser.BaseNode;
import com.amaret.pollen.parser.BodyNode;
import com.amaret.pollen.parser.Cat;
import com.amaret.pollen.parser.DeclNode;
import com.amaret.pollen.parser.DeclNode.Formal;
import com.amaret.pollen.parser.DeclNode.ITypeSpecInit;
import com.amaret.pollen.parser.ExprNode;
import com.amaret.pollen.parser.Flags;
import com.amaret.pollen.parser.ImportNode;
import com.amaret.pollen.parser.ParseUnit;
import com.amaret.pollen.parser.StmtNode;
import com.amaret.pollen.parser.SymbolEntry;
import com.amaret.pollen.parser.UnitNode;
import com.amaret.pollen.parser.pollenParser;


public class UnitJScript {
    
    private Generator gen;

    public UnitJScript(Generator gen) {
        this.gen = gen;
    }

    private void genBody(BodyNode body) {

        DeclNode.Fcn fcn = body.getFcn();
        
        if (!fcn.isHost()) {
            return;
        }

        DeclNode.Class cls = fcn.getFcnClass();
        // note cls is associated with javascript 'prototype'
    
        boolean dbg = false;
        if (dbg) {
            String n = fcn.getName().getText();
            if (n.equals(ParseUnit.CTOR_CLASS_HOST) || n.equals(ParseUnit.CTOR_MODULE_HOST)) {
            	System.out.println(fcn.getUnit().getQualName() + "." + n);     
            	
            }          	
        }
      
        gen.getFmt().print("%t%1%2.%3 = function",
                gen.uname(),
                cls != null ? ("." + cls.getName()) + ".prototype" : "", 
                fcn.getName());
        gen.aux.genFcnArgs(fcn.getFormals(), false, fcn);
        
        gen.getFmt().print(" {\n%+");
        if (fcn.isHost()) {
        	//gen.fmt.print("%tdebug_line(\"" + fcn.getName() + "\", " + gen.uname() + ");\n");
            gen.getFmt().print("%tvar $$text = '';\n");

        }
        gen.aux.genLocals(body.getLocalVars());
        if (fcn.isClassHostConstructor()) {
        	gen.getFmt().print("%t%2.%1();\n", ParseUnit.PRIVATE_INIT, "this" );
        	gen.getFmt().print("%t%2.%1();\n", ParseUnit.PRESET_INIT, "this" );
        }
        for (StmtNode stmt : body.getStmts()) {
            gen.getFmt().print("%t");
            gen.aux.genStmt(stmt);
            gen.getFmt().print("\n");
        }
        if (fcn.isHost()) {
            gen.getFmt().print("%treturn $$text;\n");
        }
        gen.getFmt().print("%-%t}\n");
    }
    
    private void genDecl(DeclNode decl) {
    	// TODO handle function references
       switch (decl.getType()) {
       case pollenParser.D_ENUM:
            genDecl$Enum((DeclNode.Usr) decl);
            break;
        case pollenParser.D_FCN_DEF:
            genDecl$Fcn((DeclNode.Fcn) decl);
            break;
       case pollenParser.D_CLASS:
            genDecl$Class((DeclNode.Class) decl);
            break;
       case pollenParser.D_VAR:
       case pollenParser.D_ARR:
            genDecl$Var((DeclNode.Var) decl);
            break;
        }
    }
    
    private void genDecl$Enum(DeclNode.Usr decl) {
        int k = 0;
        if (!decl.isEnum()) 
        	return;
        for (DeclNode.EnumVal ev : decl.getVals()) {
            gen.getFmt().print("%t%1.%2 = %3;\n", gen.uname(), ev.getName(), k++);
        }
    }

    private void genDecl$Fcn(DeclNode.Fcn decl) {
        if (!decl.isHost()) {
            String suf = decl.isPublic() ? "E" : "I";
            String n = decl.getName().getText().replace('.', '_');
            gen.getFmt().print("%t%1.%2 = new $$Ref('%3%2__%4');\n", gen.uname(), n, gen.uname_target(), suf);
        }
    }
    
    private void genDecl$Class(DeclNode.Class decl) {
    	
    	gen.setNestedClass(decl.getContainingType()!= null);

        String sn = decl.getUnitQualName().replace('.', '_') + "_" + decl.getName();
        gen.getFmt().print("%t%1.%2$$id = 1;\n", gen.uname(), decl.getName());
        gen.getFmt().print("%t%1.%2 = function(cn) {\n%+", gen.uname(), decl.getName());
        gen.getFmt().print("%tthis.$$id = %1.%2$$id++;\n", gen.uname(), decl.getName());
        gen.getFmt().print("%tthis.$$cname = cn ? cn : '%1__'+this.$$id+'__S';\n", sn); 
        gen.getFmt().print("%tthis.$$tname = '%1';\n", sn);
        gen.getFmt().print("%tthis.$$uname = '%1';\n", gen.curUnit().getQualName());
        for (DeclNode fld : decl.getFeatures()) {
        	if (fld instanceof DeclNode.Var) {
        		
				if (((DeclNode.Var) fld).isIntrinsic()
						&& !((DeclNode.Var) fld).isIntrinsicUsed())
					continue;

        		gen.getFmt().print("%tthis.%1 = ", fld.getName());
        		genInit((DeclNode.Var)fld);
        		gen.getFmt().print(";\n");
        	}
        }

        gen.getFmt().print("%-%t}\n");
        gen.getFmt().print("%t%1.%2.prototype = new $$Struct('%3.%2');\n", gen.uname(), decl.getName(), gen.curUnit().getQualName());
        gen.getFmt().print("%t%1.%2.prototype.$$isAggFld = {};\n", gen.uname(), decl.getName());
        for (DeclNode fld : decl.getFeatures()) {
    		
			if (fld instanceof DeclNode.Var && ((DeclNode.Var) fld).isIntrinsic()
					&& !((DeclNode.Var) fld).isIntrinsicUsed())
				continue;


        	if (fld instanceof DeclNode.Var) {
        		String tc = fld.getTypeCat().code();
        		boolean isAgg = tc.startsWith(Cat.ARR) || tc.startsWith(Cat.VEC);
        		gen.getFmt().print("%t%1.%2.prototype.$$isAggFld.%3 = %4;\n", gen.uname(), decl.getName(), fld.getName(), isAgg);
        	}
        }

        for (DeclNode d : decl.getFeatures()) {
        	if (d instanceof DeclNode.Fcn) {
        		genBody(((DeclNode.Fcn)d).getBody());
        	}
        }
        List<StmtNode.Assign> assgn = decl.getUnit().getPresetList();

        gen.getFmt().print("%t%1.%2.prototype." + ParseUnit.PRESET_INIT + " = function() {\n%+", gen.uname(), decl.getName());
        if (assgn.size() > 0) {
        	for (StmtNode.Assign a : assgn) {
        		gen.getFmt().print("%t");
        		gen.aux.genStmt(a);
        		gen.getFmt().print("\n");
        	}                  
        }            
        gen.getFmt().print("%-%t}\n");
    
    	gen.getFmt().print("%t%1.%2.prototype." + ParseUnit.PRIVATE_INIT + " = function() {\n%+", gen.uname(), decl.getName());
        for (DeclNode d : decl.getFeatures()) {
            if (isPrivateInit(d) && isHostInit(d)) {
                genDecl(d);
            }
        }
        gen.getFmt().print("%-%t}\n");
        gen.setNestedClass(false);      
    }

    
    private void genDecl$Var(DeclNode.Var decl) {
    	
    	if (decl.isIntrinsic() && !decl.isIntrinsicUsed())
    		return;
    	
    	if (decl.isHost() || isHostInit(decl)) {
    		String qualifier = (decl.isClassScope()) ? "this" : gen.uname();
            gen.getFmt().print("%t%1.%2 = ", qualifier, decl.getName());
            genInit(decl);
            gen.getFmt().print(";\n");
            return;
    	}
    	else if (decl.isConst()) {
            gen.getFmt().print("%t%1.%2 = ", gen.uname(), decl.getName());
            genInit(decl);
            gen.getFmt().print(";\n");
            return;
    	}
        gen.getFmt().print("%t%1.%2 = ", gen.uname(), decl.getName());
        genInit(decl);
        gen.getFmt().print(";\n");
    }
    
    private void genDecls(UnitNode unit) {
    	if (unit == null)
    		return;
    	if (unit.isComposition())
    		return;
    	genDecls(unit.getContainingUnit());
    	genDecls(unit.getImplementedUnit());
    	String n = unit.getQualName();
    	genDecl(unit.getUnitType());
  
    	if (!unit.isClass())
    		for (DeclNode decl : unit.getFeatures()) {
    			
    			if (!isPrivateInit(decl) && isHostInit(decl)) {
    				genDecl(decl);
    			}
    		}
		if (unit.getUnitType().getMetaFormals() != null)
			// initialize host variables to values from meta formals
			for (BaseNode b : unit.getUnitType().getMetaFormals().getElems()) {
				if (b instanceof DeclNode.Formal) {
					DeclNode.Formal f = (Formal) b;
					String s = gen.getOutputName(f, f.getDefiningScope(), EnumSet.noneOf(Flags.class));
					gen.getFmt().print("%t%1 = ", s);
					gen.aux.genExpr(f.getInit());
					gen.getFmt().print(";\n");
				}            	
			}
    }
        
    private void genEpilogue(UnitNode unit) {
        gen.getFmt().print("%treturn %1;\n", unit.getName());
        gen.getFmt().print("%-%t}\n");
        gen.getFmt().print("var $$u = $$c();\n");
        gen.getFmt().print("$units['%1'] = $$u;\n", unit.getQualName());
        gen.getFmt().print("$units.push($$u);\n");
        //gen.fmt.print("debug(\"EPILOGUE code\", $$c());\n");
        gen.getFmt().print("\n");
    }

    public void generate(UnitNode unit) {

        gen.aux.setHost(true);
        
        genPrologue(unit);
        
        for (ImportNode imp : unit.getImports()) {
            if (imp.getUnit() != null && (imp.getUnit().isModule() || imp.getUnit().isClass())) {
                genImport(imp);
            }
        }
        
        if (unit.isTarget())
        	genDecls(unit);
        
        

        if (!unit.isClass())
        	for (BaseNode d: unit.getFeatures()) {
        		if (d instanceof DeclNode.Fcn) {
        			genBody(((DeclNode.Fcn)d).getBody());
        		}
        	}
        
        if (unit.isTarget()) {
            genUses(unit);            
            genPrivateInit(unit);
            genPresets(unit);
        }
        

        genEpilogue(unit);
    }

    private void genPrivateInit(UnitNode unit) {
    	
    	if (unit.isClass())
    		return;
        gen.getFmt().print("%t%1." + ParseUnit.PRIVATE_INIT + " = function() {\n%+", gen.uname());
        for (DeclNode decl : unit.getFeatures()) {
            if (isPrivateInit(decl) && isHostInit(decl) && !(decl instanceof DeclNode.Arr)) {
                genDecl(decl);
            }
        }
        gen.getFmt().print("%-%t}\n");
        

    }
    
    private void debugUses(UnitNode unit) {
        List<ImportNode> impL = unit.getImports();
        System.out.println("genUses() debug, Unit " + gen.uname() + " imports: ");
        if (impL.size() > 0) {
             for (ImportNode imp : impL) {
            	String im = imp.getQualName() + ", this import " + (imp.getUnit() == null ? " NOT BOUND" : " BOUND" );
            	System.out.println("   " + im);
             }
        }
    }
    /**
     * Calls bind() for imports that are used (bound). 
     * @param imp
     * @param inserted
     */
    private void genUse(ImportNode imp, List<String> inserted) {
    	
    	if (imp.getUnit() == null)
    		return;
    	
    	String nameU = imp.getUnit().getQualName();
    	String nUnit = imp.getUnit().getName().getText();
		String asName = imp.getName().getText();
		String impName = imp.getUnitName().getText();
		
//		if (asName.equals("Digital13")) //  || asName.equals("PB5")) //nUnit.equals("MetaPin"))
//			ParseUnit.setDebugMode(true);
		if (ParseUnit.isDebugMode()) {
			debugUse(imp, nUnit, asName, impName);			
		}
		
		if (imp.getUnit().isMeta() && ! imp.getUnit().isComposition()) {
			// Get the code name of the meta module
			if (imp.getMeta() != null) {
				nameU = nameU.substring(0, nameU.lastIndexOf(".")+1) + asName;
			}
			else {
				if (imp.getUnit().isGeneratedMetaInstance())
					nameU = nameU.substring(0, nameU.lastIndexOf(".")+1) + nUnit;
				else 
					nameU = nameU.substring(0, nameU.lastIndexOf(".")+1) + impName;
			}
		}
		
		 	
		if (ParseUnit.isDebugMode()) {
			String n = ((UnitNode) imp.getParent().getParent()).getQualName();
			System.out.println("genUse(): for " + n + " importing " + imp.getUnitName().getText() + " check use of " + nameU);				
		}
    	
    	boolean genUseType = imp.getUnit().isModule() || imp.getUnit().isClass() || imp.getUnit().isEnum();    	
 
    	if (genUseType) {

    		if (!inserted.contains(nameU)) {
    			inserted.add(nameU);
    			if (ParseUnit.isDebugMode()) System.out.println("  genUse(): USE " + nameU);
    			gen.getFmt().print("%t$$bind($units['%1'], 'pollen$used', true);\n", nameU);
    		}
    	}
    	else  if (imp.getUnit().isComposition()) {
    		// for compositions, the imports are used.
			if (ParseUnit.isDebugMode()) System.out.println("  genUse() " + nameU + " is composition, check exports");

    		DeclNode.Usr compos = imp.getUnit().getUnitType();
    		while (true) {
        		List<ImportNode> impCL = compos.getUnit().getImports();
    			for (ImportNode impC : impCL) {
    				SymbolEntry export = compos.getUnit().lookupName(ParseUnit.EXPORT_PREFIX+impC.getName().getText());
    				if (ParseUnit.isDebugMode())
    					System.out.println("  genUse(): Import " + impC.getName() + " in unit " + compos.getUnit().getQualName() + " has isExport " + (impC.isExport() ? "TRUE" : "FALSE") + ", export sym exists " + (export != null ? "TRUE" : "FALSE") );
    				if (export != null) {
    					genUse(impC, inserted);
    				}
    				else if (impC.isProtocolBindTarget()) {
    					genUse(impC, inserted);
    				}   		
    			} 
    			if (compos.getBaseType() != null) { // has extends clause; get base imports
    				compos = compos.getBaseType();			
    			}
    			else break;
    		}
    	}   
    	ParseUnit.setDebugMode(false);
    }

	/**
	 * @param imp
	 * @param nUnit
	 * @param asName
	 * @param impName
	 */
	private void debugUse(ImportNode imp, String nUnit, String asName,
			String impName) {
		String s = "import ";
		s = "  debugUse(): from " + imp.getFrom() + " " + s + imp.getUnitName() + " as " + imp.getName().getText();
		if (imp.getUnit().isMeta()) s += ", importUnitIsMeta";
		if (imp.getMeta() != null) s += ", importIsMeta";
		if (imp.getUnit().isComposition())	s += ", isComposition";
		if (imp.getUnit().isGeneratedMetaInstance())	s+= ", isGeneratedMetaInstance";
		System.out.println(s + ", nUnit " + nUnit + ", impName " + impName + ", asName " + asName);

	}   
    /**
     * Generates assignments for presets
     * @param unit
     */
	private void genPresets(UnitNode unit) {

        List<StmtNode.Assign> assgn = unit.getPresetList();
               
        gen.getFmt().print("%t%1." + ParseUnit.PRESET_INIT + " = function() {\n%+", gen.uname());
        if (assgn.size() > 0) {
            for (StmtNode.Assign a : assgn) {
            	gen.getFmt().print("%t");
            	gen.aux.genStmt(a);
            	gen.getFmt().print("\n");
            }                  
        }
        // init Arrays AFTER presets
        for (DeclNode decl : unit.getFeatures()) {
            if (isPrivateInit(decl) && isHostInit(decl) && decl instanceof DeclNode.Arr) {
                genDecl(decl);
            }
        }
        gen.getFmt().print("%-%t}\n");    
    }

	

    /**
     * calls bind() for imports that are used.
     * @param unit
     */
	private void genUses(UnitNode unit) {
        //ParseUnit.setDebugMode(true);
        if (ParseUnit.isDebugMode())
                debugUses(unit);
        List<ImportNode> impL = unit.getImports();
        List<String> inserted = new java.util.ArrayList<String>();
        if (impL.size() > 0) {
            gen.getFmt().print("%t%1.pollen__uses__ = function() {\n%+", gen.uname());
            for (ImportNode imp : impL) {
                if (imp.getUnit() != null) { 
                        genUse(imp, inserted);
                }
            }
            gen.getFmt().print("%-%t}\n");
            //ParseUnit.setDebugMode(false);
        }
    }

    private void genImport(ImportNode imp) {
    	if (imp.getUnit() != null) {
    		gen.getFmt().print("%t%1.%2 = ", gen.uname(), imp.getName());
    		gen.getFmt().print("$units['%1'];\n", imp.getUnit().getQualName());
    	}
    }
    
    private void genPrologue(UnitNode unit) {

        String un = unit.getName().getText();
        String qn = unit.getQualName();

        String ks = unit.isModule() ? "MODULE " : "CLASS ";
        gen.aux.genTitle(ks + qn);
        gen.getFmt().print("var $$c = function() {\n%+", qn);
        gen.getFmt().print("%tconst %1 = {};\n", un);
        gen.getFmt().print("%t%1.%1 = %1\n", un);
        gen.getFmt().print("%t%1.$name = '%2';\n", un, qn);
        gen.getFmt().print("%t%1.pollen$used = 0;\n", un);
    }
    
    private void genInit(DeclNode.ITypeSpecInit ts) {
        
        Cat cat = ts.getTypeCat();
        String tc = cat.code();
        ExprNode init = ts.getInit();

        if (init == null ) {
            gen.aux.genDefault(ts.getTypeCat(), ts);
        }
        else if ( cat instanceof Cat.Agg && ((Cat.Agg) cat).isHostClassRef()) {
            gen.aux.genDefault(ts.getTypeCat(), ts);
            
            if (init instanceof ExprNode.New) {
            	DeclNode d = (DeclNode) ts;
            	gen.getFmt().print("; %2.%3.%1", ParseUnit.CTOR_CLASS_HOST, gen.uname(), d.getName() );
            	gen.aux.genCallArgs(((ExprNode.New)init).getCall());            	
            }
        }
        else if (tc.startsWith(Cat.ARR) || tc.startsWith(Cat.VEC)) {
        	DeclNode d = (DeclNode) ts;
        	String qualifier = d.isClassScope() ? "this" : gen.uname();
            gen.aux.genDefault(ts.getTypeCat(), ts);
            gen.getFmt().print("; %1.%2.$$assign(", qualifier, ts.getName());
            gen.aux.genExpr(init);
            gen.getFmt().print(")");
        }
        else if (tc.startsWith(Cat.CLASS)) {
            gen.aux.genDefault(ts.getTypeCat(), ts);
//            Cat.Agg c = (Agg) (ts.getTypeCat() instanceof Cat.Agg ? ts.getTypeCat() : null);
//            String cls = c != null ? c.aggScope().getScopeName() : "";
//            gen.fmt.print(" %1.%2 = %3.%4", gen.uname(), ts.getName(), gen.uname(), cls);
        }
        else {
            gen.aux.genExpr(init);
        }
    }
    /**
     * 
     * @param decl
     * @return true if this decl should be initialized at host time to the init expression
     */
    private static boolean isHostInit(DeclNode decl) {   	
    	if (decl.isHostClassRef())
    		return true;

    	if (decl instanceof DeclNode.ITypeSpecInit && ((ITypeSpecInit) decl).getInit() instanceof ExprNode.New) {
    		ParseUnit.current().reportError(decl.getName(), "non-host invocations of 'new()' are not yet implemented");  
    		return false;
    	}

    	return true;
    	
    }
    	
    /**
     * 
     * @param decl
     * @return true if this decl should be initialized to an initial value
     * as specified in the init expression
     */
    private static boolean isPrivateInit(DeclNode decl) {
    	
        return decl instanceof DeclNode.ITypeSpecInit && !decl.isPublic();
    }
}
