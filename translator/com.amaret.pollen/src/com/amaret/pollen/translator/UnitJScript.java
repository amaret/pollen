package com.amaret.pollen.translator;

import java.util.List;

import com.amaret.pollen.parser.Atom;
import com.amaret.pollen.parser.BaseNode;
import com.amaret.pollen.parser.BodyNode;
import com.amaret.pollen.parser.Cat;
import com.amaret.pollen.parser.DeclNode;
import com.amaret.pollen.parser.ExprNode;
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
        if (!(cls != null && cls.getEnclosingScope() instanceof DeclNode.Class))
        	cls = null; // a class scope name is needed only for nested classes
        
        gen.fmt.print("%t%1%2.%3 = function",
                gen.uname(),
                cls != null ? ("." + cls.getName()) + ".prototype" : "", 
                fcn.getName());
        gen.aux.genFcnArgs(fcn.getFormals(), false, fcn);
        gen.fmt.print(" {\n%+");
        if (fcn.isHost()) {
            gen.fmt.print("%tvar $$text = '';\n");
        }
        gen.aux.genLocals(body.getLocalVars());
        for (StmtNode stmt : body.getStmts()) {
            gen.fmt.print("%t");
            gen.aux.genStmt(stmt);
            gen.fmt.print("\n");
        }
        if (fcn.isHost()) {
            gen.fmt.print("%treturn $$text;\n");
        }
        gen.fmt.print("%-%t}\n");
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
            gen.fmt.print("%t%1.%2 = %3;\n", gen.uname(), ev.getName(), k++);
        }
    }

    private void genDecl$Fcn(DeclNode.Fcn decl) {
        if (!decl.isHost()) {
            String suf = decl.isPublic() ? "E" : "I";
            String n = decl.getName().getText().replace('.', '_');
            gen.fmt.print("%t%1.%2 = new $$Ref('%3%2__%4');\n", gen.uname(), n, gen.cname(), suf);
        }
    }
    
    private void genDecl$Class(DeclNode.Class decl) {

        String sn = decl.getUnitQualName().replace('.', '_') + "_" + decl.getName();
        gen.fmt.print("%t%1.%2$$id = 1;\n", gen.uname(), decl.getName());
        gen.fmt.print("%t%1.%2 = function(cn) {\n%+", gen.uname(), decl.getName());
        gen.fmt.print("%tthis.$$id = %1.%2$$id++;\n", gen.uname(), decl.getName());
        gen.fmt.print("%tthis.$$cname = cn ? cn : '%1__'+this.$$id+'__S';\n", sn); 
        gen.fmt.print("%tthis.$$tname = '%1';\n", sn);
        gen.fmt.print("%tthis.$$uname = '%1';\n", gen.curUnit().getQualName());
        for (DeclNode fld : decl.getFeatures()) {
        	if (fld instanceof DeclNode.Var) {
        		gen.fmt.print("%tthis.%1 = ", fld.getName());
        		genInit((DeclNode.Var)fld);
        		gen.fmt.print(";\n");
        	}
        }

        gen.fmt.print("%-%t}\n");
        gen.fmt.print("%t%1.%2.prototype = new $$Struct('%3.%2');\n", gen.uname(), decl.getName(), gen.curUnit().getQualName());
        gen.fmt.print("%t%1.%2.prototype.$$isAggFld = {};\n", gen.uname(), decl.getName());
        for (DeclNode fld : decl.getFeatures()) {
        	if (fld instanceof DeclNode.Var) {
        		String tc = fld.getTypeCat().code();
        		boolean isAgg = tc.startsWith("A") || tc.startsWith("S") || tc.startsWith("V");
        		gen.fmt.print("%t%1.%2.prototype.$$isAggFld.%3 = %4;\n", gen.uname(), decl.getName(), fld.getName(), isAgg);
        	}
        }

        for (DeclNode d : decl.getFeatures()) {
        	if (d instanceof DeclNode.Fcn) {
        		genBody(((DeclNode.Fcn)d).getBody());
        	}
        }
    }

    
    private void genDecl$Var(DeclNode.Var decl) {
    	if (decl.isHost()) {
            gen.fmt.print("%t%1.%2 = ", gen.uname(), decl.getName());
            genInit(decl);
            gen.fmt.print(";\n");
            return;
    	}
    	else if (decl.isConst()) {
            gen.fmt.print("%t%1.%2 = ", gen.uname(), decl.getName());
            genInit(decl);
            gen.fmt.print(";\n");
            return;
    	}
        gen.fmt.print("%t%1.%2 = ", gen.uname(), decl.getName());
        genInit(decl);
        gen.fmt.print(";\n");
    }
    
    private void genDecls(UnitNode unit) {
    	if (unit == null)
    		return;
    	if (unit.isComposition())
    		return;
    	genDecls(unit.getContainingUnit());
    	genDecls(unit.getImplementedUnit());
    	genDecl(unit.getUnitType());
  
        for (DeclNode decl : unit.getFeatures()) {
            if (!isPrivateInit(decl)) {
                genDecl(decl);
            }
        }
    }
        
    private void genEpilogue(UnitNode unit) {
        gen.fmt.print("%treturn %1;\n", unit.getName());
        gen.fmt.print("%-%t}\n");
        gen.fmt.print("var $$u = $$c();\n");
        gen.fmt.print("$units['%1'] = $$u;\n", unit.getQualName());
        gen.fmt.print("$units.push($$u);\n");
        //gen.fmt.print("debug(\"EPILOGUE code\", $$c());\n");
        gen.fmt.print("\n");
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

        for (BaseNode d: unit.getFeatures()) {
        	if (d instanceof DeclNode.Fcn) {
        		genBody(((DeclNode.Fcn)d).getBody());
        	}
        }
        
        if (unit.isTarget()) {
            genUses(unit);
            genPrivateDecls(unit);
        }

        genEpilogue(unit);
    }

    private void genPrivateDecls(UnitNode unit) {
        gen.fmt.print("%t%1.$$privateInit = function() {\n%+", gen.uname());
        String dbg = gen.uname();
        for (DeclNode decl : unit.getFeatures()) {
            if (isPrivateInit(decl)) {
                genDecl(decl);
            }
        }
        gen.fmt.print("%-%t}\n");
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
    private void genUse(ImportNode imp, List<String> inserted) {
    	
    	if (imp.getUnit() == null)
    		return;
    	
    	String nameU = imp.getUnit().getQualName();
    	String nUnit = imp.getUnit().getName().getText();
		String asName = imp.getName().getText();
		ParseUnit.setDebugMode(false);
		if (!(asName.equals(nUnit)) && imp.getUnit().isMeta()) {
			// meta modules are generated with the 'as' name
			nameU = nameU.substring(0, nameU.lastIndexOf(".")+1) + asName;   			
		}
		 	
		if (ParseUnit.isDebugMode()) {
			String n = ((UnitNode) imp.getParent().getParent()).getQualName();
			System.out.println("genUse(): for " + n + " importing " + imp.getUnitName().getText() + " check use of " + nameU);	
			
//				if (!(asName.equals(nUnit)) && imp.getUnit().isMeta()) {
//					nameU = nameU.substring(0, nameU.lastIndexOf(".")+1) + asName;   			
//				}
//				if (nameU.matches(".*mcu.atmel.atmega328p.Mcu.*")) {
//					dbg = true;
//				}
		}
    	
    	boolean genUseType = imp.getUnit().isModule() || imp.getUnit().isClass() || imp.getUnit().isEnum();    	
 
    	if (genUseType) {

    		if (!inserted.contains(nameU)) {
    			inserted.add(nameU);
    			if (ParseUnit.isDebugMode()) System.out.println("  genUse(): USE " + nameU);
    			gen.fmt.print("%t$$bind($units['%1'], 'pollen$used', true);\n", nameU);
    		}
    	}
    	else  if (imp.getUnit().isComposition()) {
    		// for compositions, the imports are used.
			if (ParseUnit.isDebugMode()) System.out.println("  genUse() " + nameU + " is composition, check exports");

    		DeclNode.Usr compos = imp.getUnit().getUnitType();
    		//while (true) {
        		List<ImportNode> impCL = compos.getUnit().getImports();
    			for (ImportNode impC : impCL) {
    				SymbolEntry export = compos.getUnit().lookupName("$$export"+impC.getName().getText());
    				if (ParseUnit.isDebugMode())
    					System.out.println("  genUse(): Import " + impC.getName() + " in unit " + compos.getUnit().getQualName() + " has isExport " + (impC.isExport() ? "TRUE" : "FALSE") + ", export sym exists " + (export != null ? "TRUE" : "FALSE") );
    				if (export != null) {
    					genUse(impC, inserted);
    				}
    				else if (impC.isProtocolBindTarget()) {
    					genUse(impC, inserted);
    				}   		
    			} 
//    			if (compos.getBaseType() != null) { // has extends clause; get base imports
//    				compos = compos.getBaseType();			
//    			}
//    			else break;
//    		}
    	}   
    	ParseUnit.setDebugMode(false);
    }   

    private void genUses(UnitNode unit) {
        ParseUnit.setDebugMode(false);
        if (ParseUnit.isDebugMode())
                debugUses(unit);
        List<ImportNode> impL = unit.getImports();
        List<String> inserted = new java.util.ArrayList<String>();
        if (impL.size() > 0) {
            gen.fmt.print("%t%1.pollen__uses__ = function() {\n%+", gen.uname());
            for (ImportNode imp : impL) {
                if (imp.getUnit() != null) { 
                        genUse(imp, inserted);
                }
            }
            gen.fmt.print("%-%t}\n");
            //ParseUnit.setDebugMode(false);
        }
    }

    private void genImport(ImportNode imp) {
    	if (imp.getUnit() != null) {
    		gen.fmt.print("%t%1.%2 = ", gen.uname(), imp.getName());
    		gen.fmt.print("$units['%1'];\n", imp.getUnit().getQualName());
    	}
    }
    
    private void genPrologue(UnitNode unit) {

        String un = unit.getName().getText();
        String qn = unit.getQualName();

        String ks = unit.isModule() ? "MODULE " : "CLASS ";
        gen.aux.genTitle(ks + qn);
        gen.fmt.print("var $$c = function() {\n%+", qn);
        gen.fmt.print("%tconst %1 = {};\n", un);
        gen.fmt.print("%t%1.%1 = %1\n", un);
        gen.fmt.print("%t%1.$name = '%2';\n", un, qn);
        gen.fmt.print("%t%1.$$code = null;\n", un);
        gen.fmt.print("%t%1.pollen$used = 0;\n", un);
    }
    
    private void genInit(DeclNode.ITypeSpecInit ts) {
        
        Cat cat = ts.getTypeCat();
        String tc = cat.code();
        ExprNode init = ts.getInit();
        if (init == null 
        		|| ( cat instanceof Cat.Agg && ((Cat.Agg) cat).isStaticRef())) {
            gen.aux.genDefault(ts.getTypeCat(), ts);
        }
        else if (tc.startsWith("A") || tc.startsWith("S") || tc.startsWith("V")) {
            gen.aux.genDefault(ts.getTypeCat(), ts);
            gen.fmt.print("; %1.%2.$$assign(", gen.uname(), ts.getName());
            gen.aux.genExpr(init);
            gen.fmt.print(")");
        }
        else if (tc.startsWith("C")) {
            gen.aux.genDefault(ts.getTypeCat(), ts);
//            Cat.Agg c = (Agg) (ts.getTypeCat() instanceof Cat.Agg ? ts.getTypeCat() : null);
//            String cls = c != null ? c.aggScope().getScopeName() : "";
//            gen.fmt.print(" %1.%2 = %3.%4", gen.uname(), ts.getName(), gen.uname(), cls);
        }
        else {
            gen.aux.genExpr(init);
        }
    }
    
    private static boolean isPrivateInit(DeclNode decl) {
        return decl instanceof DeclNode.ITypeSpecInit && !decl.isPublic();
    }
}
