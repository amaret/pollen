package com.amaret.pollen.translator;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;

import com.amaret.pollen.parser.BaseNode;
import com.amaret.pollen.parser.BodyNode;
import com.amaret.pollen.parser.Cat;
import com.amaret.pollen.parser.Cat.Fcn;
import com.amaret.pollen.parser.DeclNode;
import com.amaret.pollen.parser.DeclNode.Arr;
import com.amaret.pollen.parser.DeclNode.Formal;
import com.amaret.pollen.parser.DeclNode.ITypeInfo;
import com.amaret.pollen.parser.DeclNode.ITypeKind;
import com.amaret.pollen.parser.DeclNode.ITypeSpecInit;
import com.amaret.pollen.parser.DeclNode.Usr;
import com.amaret.pollen.parser.ExprNode;
import com.amaret.pollen.parser.Flags;
import com.amaret.pollen.parser.IScope;
import com.amaret.pollen.parser.ISymbolNode;
import com.amaret.pollen.parser.ImportNode;
import com.amaret.pollen.parser.ParseUnit;
import com.amaret.pollen.parser.StmtNode;
import com.amaret.pollen.parser.SymbolEntry;
import com.amaret.pollen.parser.TypeNode;
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
        // note classes are generated with javascript 'prototype'
        
        boolean class_ctor = fcn.cname().matches(".*" +ParseUnit.CTOR_CLASS_HOST);
        String rtn = class_ctor ? "this" : "$$text";
    
        boolean dbg = false;
        if (dbg) {
            String n = fcn.cname();
            if (n.matches(".*" +ParseUnit.CTOR_CLASS_HOST) || n.matches(".*" + ParseUnit.CTOR_MODULE_HOST)) {
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
            gen.getFmt().print("%tvar $$text = '';\n");

        }
        gen.aux.genLocals(body.getLocalVars());
        if (fcn.isClassHostConstructor()) {
        	gen.getFmt().print("%t%2.%1();\n", ParseUnit.PRIVATE_INIT, "this" );
        	//gen.getFmt().print("%t%2.%1();\n", ParseUnit.PRESET_INIT, "this" ); // now done in epilogue
        }

        boolean skipBody = false;
        if (fcn.getName().getText().equals(ParseUnit.PRESET_INIT) && !fcn.isPresetInitializer())
        	skipBody = true; // no-op the preset initializer if an error was detected

        List<DeclNode.Arr> arrList = new ArrayList<DeclNode.Arr>();
        if (fcn.isClassHostConstructor() || fcn.isModuleHostConstructor()) {
        	DeclNode.Usr u = gen.isNestedClass() ? gen.getNestedClass() : gen.curUnit().getUnitType();        	
        	for (DeclNode decl : u.getFeatures()) {
        		if (isPrivateInit(decl) && isHostInit(decl) && decl instanceof DeclNode.Arr) {
        			DeclNode.Arr arr = (Arr) decl;
        			if (arr.getFirstDim() instanceof ExprNode.Ident) {
        				SymbolEntry se = ((ExprNode.Ident)arr.getFirstDim()).getSymbol();
        				ISymbolNode node = se != null ? se.node() : null;
        				if (node instanceof DeclNode.Var && ((DeclNode.Var)node).isHost()) {
        					String msg = "Array '" + arr.getName() + "' has computed size (from host variable '" + node.getName().getText() 
        							+ "'). You cannot reference arrays of computed size directly or indirectly until after the host initializer has returned.";
        					ParseUnit.current().reportWarning((BaseNode) node, msg);
        					arrList.add(arr);
        					continue;
        				}
        			}       			
        			genDecl(decl);
        		}
        	}
        }
        if (!skipBody)
        	for (StmtNode stmt : body.getStmts()) {
        		gen.getFmt().print("%t");
        		gen.aux.genStmt(stmt);
        		gen.getFmt().print("\n");
        	}
        for (DeclNode.Arr arr : arrList) {
        	genDecl(arr);
        }
        
        if (fcn.isHost()) {
            gen.getFmt().print("%treturn %1;\n", rtn);
        }
        gen.getFmt().print("%-%t}\n");
    }
    
    private void genDecl(DeclNode decl) {
       switch (decl.getType()) {
       case pollenParser.D_ENUM:
            genDecl$Enum((DeclNode.Usr) decl);
            break;
       case pollenParser.D_FCN_DEF:
            genDecl$Fcn((DeclNode.Fcn) decl);
            break;
       case pollenParser.D_FCN_REF:
    	    genDecl$FcnRef((DeclNode.FcnRef) decl);
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
        if (!decl.isEnum()) 
        	return;
        for (DeclNode.EnumVal ev : decl.getVals()) {
			String s = gen.getOutputName(ev, ev.getDefiningScope(), EnumSet.noneOf(Flags.class));
			gen.getFmt().print("%t%1 = %2;\n", s, ev.getVal().getText());
        }
    }

    private void genDecl$FcnRef(DeclNode.FcnRef decl) {
    	String n = decl.getName().getText().replace('.', '_');
    	Cat.Fcn catf = (Fcn) decl.getFcnTypeCat();
    	DeclNode.Fcn fcn = catf != null ? catf.fcnD() : null;
    	if (fcn != null) {
    		if (fcn.getDefiningScope() instanceof ITypeKind && ((ITypeKind)fcn.getDefiningScope()).isProtocol())
    			return; // can't initialize to a protocol function
    		if (fcn.isHost()) {
    			ParseUnit.current().reportError(decl, "host functions are not allowed as values for function references");
    			return;
    		}
    		gen.getAux().setHost(false); // this is a host context but the name is generated for target context.
    		String s = gen.getOutputQName(decl, fcn, fcn.getDefiningScope(), EnumSet.noneOf(Flags.class ));
    		gen.getAux().setHost(true);
    		gen.getFmt().print("%t%1.%2 = new $$Ref('%3');\n", gen.uname(), n, s);
    	}
    }
    private void genDecl$Fcn(DeclNode.Fcn decl) {
        if (!decl.isHost()) {
            String n = decl.getName().getText().replace('.', '_');
            gen.getAux().setHost(false); // this is a host context but the name is generated for target context.
            String s = gen.getOutputQName(decl, (ISymbolNode) decl.getEnclosingScope(),decl.getDefiningScope(), EnumSet.noneOf(Flags.class ));
            gen.getAux().setHost(true);
            gen.getFmt().print("%t%1.%2 = new $$Ref('%3');\n", gen.uname(), n, s);
        }
    }
    
    private void genDecl$Class(DeclNode.Class decl) {
    	
    	gen.setNestedClass(decl);

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
    
    	gen.getFmt().print("%t%1.%2.prototype." + ParseUnit.PRIVATE_INIT + " = function() {\n%+", gen.uname(), decl.getName());
        for (DeclNode d : decl.getFeatures()) {
            if (isPrivateInit(d) && isHostInit(d)) {
            	if (d instanceof DeclNode.Arr)
            		continue;
                genDecl(d);
            }
        }
        // do the arrays last so that the dimensions have final value (if calculated).
        for (DeclNode d : decl.getFeatures()) {
            if (isPrivateInit(d) && isHostInit(d)) {
            	if (!(d instanceof DeclNode.Arr))
            		continue;
                genDecl(d);
            }
        }
        gen.getFmt().print("%-%t}\n");
        gen.setNestedClass(null);      
    }

    
    private void genDecl$Var(DeclNode.Var decl) {
    	
    	if (decl.isIntrinsic() && !decl.isIntrinsicUsed())
    		return;
    	
//    	boolean dbg = true;
//    	if(decl.getName().getText().equals("elements"))
//    		dbg = false;
    	if (decl.getDefiningScope() == null)
    		return;
    	SymbolEntry se = decl.getDefiningScope().lookupName(decl.getName().getText());
    	boolean isClassScope = decl.getDefiningScope() instanceof DeclNode.Class;
    	if (ParseUnit.current().isPreset(se) && isClassScope) {
    		// Because even host class objects are instances I have to change the initial $$privateInit value to 
    		// implement preset. That means preset values must be literals. 
    		ExprNode init = ParseUnit.current().getPresetExpr(se);
    		if (init != null && init != decl.getInit()) {
				if (((ExprNode)init).getConstInitialValue() != null)
					decl.setChild(DeclNode.Var.INIT, init);
				else {
					ParseUnit.current().reportError(decl, "for arrays defined in class scope, when array dimensions are set by variables initialized in \'preset\' initializers, those variables must be preset to constant values");
				}   			
    		}    		
    	}
    	
    	if (decl.isHost() || isHostInit(decl)) {
    		
    		if (decl.isBound() && decl.getInit() != null) { // initialized protocol member
    			ExprNode init = decl.getInit();
    			TypeNode t = ((ExprNode.Typ) init).getTyp();
    			UnitNode u = ((DeclNode.TypedMember) decl).getBindToUnit();
    			gen.getAux().genBind(decl, t, u );
    			return;
    		}
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
    	if (unit.isComposition()) { // compositions: only generate decl for enums
    		for (DeclNode idecl : unit.getFeatures()) {
    			if (idecl instanceof DeclNode.Usr && ((DeclNode.Usr) idecl).isEnum()) {
    				genDecl$Enum((Usr) idecl);
    			}
    			return;
    		}
    	}
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
        
        genDecls(unit);
        
        if (!unit.isClass() && !unit.isProtocol())
        	for (BaseNode d: unit.getFeatures()) {
        		if (d instanceof DeclNode.Fcn) {
        			genBody(((DeclNode.Fcn)d).getBody());
        		}
        	}
        
        if (unit.isTarget()) {
            genUses(unit);            
            genPrivateInit(unit);
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
    	
   	 	// The external name, the generated name, is different for meta and non-meta. 
    	// For non-meta, the 'as' name is the internal name and the external name is the result of imp.getUnitName(). 
    	// For meta, the 'as' name is the external name. 
    	String nameU = imp.getUnit().getQualName();
    	String nUnit = imp.getUnit().getName().getText();
		String asName = imp.getName().getText();
		String impName = imp.getUnitName().getText();
		
		// complicated. Given, in Test.p:
		// 'from pollen.hardware import HandlerProtocol{uint8} as HP'
		// 'from pollen.data import Queue {HP} as HandlerQueue'
		// this is fixed up, in 'meta Queue {type E}' to :
		// 'from pollen.hardware import HandlerProtocol{uint8} as E'
		// The name 'E' is an 'as' name but it should NOT be the external name, unlike other meta types.
		// It's used to satisfy references to 'E' in Queue. 
		// This should work because HandlerProtocol{uint8} has to be output in the package already to be used this way.
		if (imp.isSynthesizedFromMeta() && imp.getUnit().isMeta())
			return;
		
        boolean saveDbg = ParseUnit.isDebugMode();
        ParseUnit.setDebugMode(false);
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
        ParseUnit.setDebugMode(saveDbg);
    	//ParseUnit.setDebugMode(false);
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

        String ks = unit.isModule() ? "MODULE " : unit.isComposition() ? "COMPOSITION " : unit.isClass() ? "CLASS " : "";
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
