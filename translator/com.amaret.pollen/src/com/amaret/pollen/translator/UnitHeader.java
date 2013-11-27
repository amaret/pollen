/**
 * 
 */
package com.amaret.pollen.translator;

import java.util.Collection;
import java.util.EnumSet;
import java.util.List;

import com.amaret.pollen.driver.ProcessUnits;
import com.amaret.pollen.parser.BaseNode;
import com.amaret.pollen.parser.DeclNode;
import com.amaret.pollen.parser.DeclNode.Class;
import com.amaret.pollen.parser.DeclNode.Formal;
import com.amaret.pollen.parser.ExprNode;
import com.amaret.pollen.parser.Flags;
import com.amaret.pollen.parser.IScope;
import com.amaret.pollen.parser.ImportNode;
import com.amaret.pollen.parser.ParseUnit;
import com.amaret.pollen.parser.StmtNode;
import com.amaret.pollen.parser.TypeNode;
import com.amaret.pollen.parser.TypeNode.Usr;
import com.amaret.pollen.parser.UnitNode;
import com.amaret.pollen.parser.pollenParser;

public class UnitHeader {

    private Generator gen;
    
    public UnitHeader(Generator gen) {
        this.gen = gen;
    }

    private void genEnums(UnitNode unit) {
    	
    	if (unit == null)
    		return;
    	genEnums(unit.getImplementedUnit());
    	genEnums(unit.getContainingUnit());
    	
    	boolean title = false;
    	
    	if (unit.getUnitType().isEnum()) {
    		// the unit type is an enum
    		gen.aux.genTitle("enum definition (unit " + unit.getName().getText() + ")");
    		genDecl$Enum(unit.getUnitType());
    		return;
    	}
       
        for (DeclNode decl : unit.getFeatures()) {
            if (decl.isHost()) {
                continue;
            }            
            switch (decl.getType()) {
            // the unit type contains an enum 
            case pollenParser.D_ENUM:
    			if (!title) {
    				gen.aux.genTitle("enum definitions (unit " + unit.getName().getText() + ")");
    				title = true;
    			}
                genDecl$Enum((DeclNode.Usr) decl);
                break;
            }
        }
    }
    private void genConsts(UnitNode unit) {
    	boolean title = false;
    	
		if (unit.getUnitType().getMetaFormals() != null)
			for (BaseNode b : unit.getUnitType().getMetaFormals().getElems()) {
				if (b instanceof DeclNode.Formal) {
        			if (!title) {
            	        gen.aux.genTitle("const definitions");
        				title = true;
        			}
					DeclNode.Formal f = (Formal) b;
					gen.getFmt().print("#define %1%2 (", gen.uname_target(), f.getName());
					gen.aux.genExpr(f.getInit());
					gen.getFmt().print(")\n");
				}            	
			}

    	for (DeclNode decl : unit.getFeatures()) {
    		if (decl.isHost()) {
    			continue;
    		}
    		switch (decl.getType()) {
    		case pollenParser.D_VAR:
    			
    			if (((DeclNode.Var)decl).isConst()) {
        			if (!title) {
            	        gen.aux.genTitle("const definitions");
        				title = true;
        			}
    				genDecl$Const((DeclNode.Var) decl);
    			}
    			break;
    		}

    	}
    }

    private void genDecl$Const(DeclNode.Var decl) {
        gen.getFmt().print("#define %1%2 (", gen.uname_target(), decl.getName());
        gen.aux.genExpr(decl.getInit());
        gen.getFmt().print(")\n");
    }
    
    private void genDecl$Enum(DeclNode.Usr decl) {
    	if (!decl.isEnum())
    		return;
        gen.getFmt().print("typedef uint8 %1%2;\n", gen.uname_target(), decl.getName());
        int k = 0;
        for (DeclNode.EnumVal ev : decl.getVals()) {
            gen.getFmt().print("#define %1%2_%3 %4\n", gen.uname_target(), decl.getName(), ev.getName(), k++);
        }
    }
    
    private void genDecl$Fcn(DeclNode.Fcn decl) {
        gen.getFmt().print("extern ");
        TypeNode ft = decl.getTypeSpec();
        gen.aux.genTypeWithVarName(ft, gen.uname_target() + gen.aux.mkPollenCname(decl.cname()) + gen.aux.mkSuf(decl));
        gen.aux.genFcnArgs(decl.getFormals(), true, decl);
        gen.getFmt().print(";\n");
    }

	private void genDecl$HostVar(DeclNode.Var decl) {

		if (!decl.isHost())
			return;

		if (decl.isConst()) {
			return;
		}
		
		String dbg = decl.getName().getText();

		gen.getFmt().print("typedef ");
		gen.aux.genTypeWithVarName(decl.getTypeSpec(), gen.uname_target() + decl.getName()
				+ "__TYPE");
		gen.getFmt().print(";\n");
		String braces = "";
        if (decl instanceof DeclNode.Arr) {
        	for (ExprNode e : ((DeclNode.Arr)decl).getDim().getElems()) {
        		braces += "[]";
        	}
        }
        
        String constStr = (!decl.isHostClassRef() && !decl.isClassScope()) ? "const " : ""; 
		
        gen.getFmt().print("extern " + constStr + "%1__TYPE %1%2%3;\n", gen.uname_target()
				+ decl.getName(), gen.aux.mkSuf(decl),braces);

	}
    private void genDecl$Class(DeclNode.Class decl) {
    	
        
        List<DeclNode> fields = decl.getFeatures();
        
        IScope outer = decl.getEnclosingScope();
       
        // class name is a qualifier only for nested class (as it's not carried in cname)
        DeclNode.Class cls = outer instanceof DeclNode.Usr ? decl : null;
        String qual = (cls == null) ? ("") : cls.getName().getText();
        String clsStruct = (qual.isEmpty()) ? gen.uname_target().substring(0, gen.uname_target().length()-1) : gen.uname_target() + qual;
        String clsStructPtr = (qual.isEmpty()) ?  gen.uname_target() :  gen.uname_target() + qual + "_";
        
        for (DeclNode fld : fields) {
        	if (fld instanceof DeclNode.FcnRef) {
        		gen.getFmt().print("%ttypedef ");
        		String s = gen.getOutputName((Usr) ((DeclNode.ITypeSpec) fld).getTypeSpec(), null, EnumSet.of(Flags.IS_TYPEDEF));
        		gen.getFmt().print("%1;\n", s);
        	}       
        }              
        
        gen.getFmt().print("%tstruct %1 {\n%+", clsStruct);
        for (DeclNode fld : fields) {
        	
			if (fld instanceof DeclNode.Var
					&& ((DeclNode.Var) fld).isIntrinsic()
					&& !((DeclNode.Var) fld).isIntrinsicUsed())
				continue;
			if (fld instanceof DeclNode.FcnRef) {
        		String s = gen.getOutputName((Usr) ((DeclNode.ITypeSpec) fld).getTypeSpec(), null, EnumSet.noneOf(Flags.class));
				gen.getFmt().print("%t%1 %2", s, fld.getName());
			}
			else
				if (fld instanceof DeclNode.ITypeSpec && !(fld instanceof DeclNode.Fcn)) {
					gen.getFmt().print("%t");
					gen.aux.genTypeWithVarName(((DeclNode.ITypeSpec) fld).getTypeSpec(), "" + fld.getName());       		
				}
    		if (fld instanceof DeclNode.Arr) {
    			for (BaseNode e : ((DeclNode.Arr)fld).getDim().getElems()) {
    				gen.getFmt().print("[");
    				if (e instanceof ExprNode && ((ExprNode)e).getConstExpr() != null)
    					 gen.aux.genExpr(((ExprNode) e).getConstExpr());
    				else 
    					ParseUnit.current().reportError(fld.getName(), "array dimensions must resolve to constant or preset values");
    				gen.getFmt().print("]");
    			}
    		}
    		if (!(fld instanceof DeclNode.Fcn))
    			gen.getFmt().print(";\n");
        }
        gen.getFmt().print("%-%t};\n"); 
        gen.getFmt().print("%ttypedef struct %1 %1;\n", clsStruct, clsStruct); 
        gen.getFmt().print("%ttypedef struct %1* %2;\n", clsStruct, clsStructPtr); 

    }
    
    private void genDecl$Module(DeclNode.Usr decl) {
    	
    	if (!decl.isModule())
    		return;
        
        List<DeclNode> fields = decl.getFeatures();
        for (DeclNode fld : fields) {
        	if (fld instanceof DeclNode.FcnRef) {
        		gen.getFmt().print("%ttypedef ");
        		String s = gen.getOutputName((Usr) ((DeclNode.ITypeSpec) fld).getTypeSpec(), null, EnumSet.of(Flags.IS_TYPEDEF));
        		gen.getFmt().print("%1;\n", s);
        	}       
        }              
        gen.getFmt().print("%tstruct %1 {\n%+", gen.uname_target());
        String dbg = gen.uname_target();
        for (DeclNode fld : fields) {

        	if (fld instanceof DeclNode.Var
        			&& ((DeclNode.Var) fld).isIntrinsic()
        			&& !((DeclNode.Var) fld).isIntrinsicUsed())
        		continue;

        	if (!fld.isHost() && fld instanceof DeclNode.ITypeSpec && !(fld instanceof DeclNode.Fcn)) {
        		gen.getFmt().print("%t");     

        		boolean proMem = fld instanceof DeclNode.TypedMember && ((DeclNode.TypedMember)fld).isProtocolMember();
        		if (proMem) {
        			gen.getFmt().print("struct ");
        			gen.aux.genTypeWithVarName(((DeclNode.ITypeSpec) fld).getTypeSpec(), "");
        			gen.getFmt().print("*"  + fld.getName().getText());
        		}
        		else if (fld.isHostClassRef()) {
        			gen.getFmt().mark();
        			gen.aux.genTypeWithVarName(((DeclNode.ITypeSpec) fld).getTypeSpec(), "");
        			String typeString = gen.getFmt().release();
        			gen.getFmt().print("%1 %2",typeString.substring(0, typeString.length()-2), fld.getName().getText());
        		}
        		else if (fld instanceof DeclNode.FcnRef) {
            		String s = gen.getOutputName((Usr) ((DeclNode.ITypeSpec) fld).getTypeSpec(), null, EnumSet.noneOf(Flags.class));
    				gen.getFmt().print("%t%1 %2", s, fld.getName());
    			}
        		else {
        			String name = (fld instanceof DeclNode.Arr && !((DeclNode.Arr)fld).hasDim()) ? "* " : "";
        			name += fld.getName().getText();
        			gen.aux.genTypeWithVarName(((DeclNode.ITypeSpec) fld).getTypeSpec(), name);
        		}
        		if (fld instanceof DeclNode.Arr && ((DeclNode.Arr)fld).hasDim()) {
        			
        			for (BaseNode e : ((DeclNode.Arr)fld).getDim().getElems()) {
        				gen.getFmt().print("[");
        				if (e instanceof ExprNode.Const) 
        					gen.aux.genExpr((ExprNode) e);
        				gen.getFmt().print("]");
        			}
        		}
        		gen.getFmt().print(";\n");
        	}
        }
        gen.getFmt().print("%-%t};\n"); 
        //gen.fmt.print("%ttypedef struct %1* %1;\n", gen.cname(), gen.cname());     
        gen.getFmt().print("%ttypedef struct %1 %1;\n", gen.uname_target(), gen.uname_target());   


    }
    /*
     *         // class name is a qualifier only for nested class (as it's not carried in cname)
        DeclNode.Class cls = outer instanceof DeclNode.Usr ? decl : null;
        String qual = (cls == null) ? ("") : cls.getName().getText();
        String clsStruct = (qual.isEmpty()) ? gen.cname().substring(0, gen.cname().length()-1) : gen.cname() + qual;
        String clsStructPtr = (qual.isEmpty()) ?  gen.cname() :  gen.cname() + qual + "_";
        gen.fmt.print("%ttypedef struct %1 %1;\n", clsStruct, clsStruct); 
        gen.fmt.print("%ttypedef struct %1* %2;\n", clsStruct, clsStructPtr); 
 
     */

    private void genDecl$Var(DeclNode.Var decl) {
    	
    	if (decl.isIntrinsic() && !decl.isIntrinsicUsed())
    		return;
    	
    	if (gen.curUnit().isModule() && (!decl.isHost() || (decl instanceof DeclNode.TypedMember))) {
    		String qualifier = decl.isHostClassRef() ? "_" : ".";
    		gen.getFmt().print("#define " + gen.uname_target() + decl.getName() + gen.aux.mkSuf(decl) + " ");
    		String cname = gen.uname_target().substring(0, gen.uname_target().length()-1);
    		gen.getFmt().print(cname + qualifier + decl.getName());
    		gen.getFmt().print("\n");
    		if (decl.getTypeSpec() instanceof TypeNode.Usr) {
    			TypeNode.Usr t = (Usr) decl.getTypeSpec();
				if (t.getSymbol() != null
						&& t.getSymbol().node() instanceof DeclNode.Class
						&& t.getSymbol().scope() == gen.curUnit().getUnitType()) { // nested class
					DeclNode.Class cls = (Class) t.getSymbol().node();
	    			List<DeclNode> fields = cls.getFeatures();
	    			String deref = decl.isHostClassRef() ? "." : "->";
	    			
	    			for (DeclNode fld : fields) {
	    				
						if (fld instanceof DeclNode.Var
								&& ((DeclNode.Var) fld).isIntrinsic()
								&& !((DeclNode.Var) fld).isIntrinsicUsed())
							continue;
						
	    	    		gen.getFmt().print("#define " + gen.uname_target() + decl.getName() + "_" + fld.getName() + gen.aux.mkSuf(decl) + " ");
	    	    		cname = gen.uname_target().substring(0, gen.uname_target().length()-1);
	    	    		gen.getFmt().print(cname + qualifier + decl.getName() + deref + fld.getName());
	    	    		gen.getFmt().print("\n");

	    			}
				}
    		}   		
    	}
    	else {
    		gen.getFmt().print("extern ");
    		gen.aux.genTypeWithVarName(decl.getTypeSpec(), gen.uname_target() + decl.getName() + gen.aux.mkSuf(decl));
    		if (decl instanceof DeclNode.Arr) {
    			for (ExprNode e : ((DeclNode.Arr)decl).getDim().getElems()) {
    				gen.getFmt().print("[]");
    			}
    		}
    		gen.getFmt().print(";\n");
    	}
        
    }
    
    private void genClasses(UnitNode unit) {
    	boolean title = false;
    	if (unit == null)
    		return;
    	
    	if (unit.getContainingUnit() != null && unit.getContainingUnit().isClass()) {
    		gen.aux.genTitle("class definition (unit " + unit.getName().getText() + ")");
    		genDecl$Class((Class) unit.getUnitType().getContainingType());
    	}
     	
    	if (unit.getUnitType().isClass()) {
    		// the unit type is a class
    		gen.aux.genTitle("class definition (unit " + unit.getName().getText() + ")");
    		genDecl$Class((Class) unit.getUnitType());
    		
    	}
    	
    	if (unit.getUnitType().isModule()) {
    		// the unit type is a module
    		// the nested classes are first to resolve references to them in the module
			gen.aux.genTitle("extern definition");
            gen.getFmt().print("extern struct %1%2%3", gen.uname_target(), " ", gen.uname_target().substring(0, gen.uname_target().length()-1) + ";\n"); 
            //gen.fmt.print("extern struct %1%2%3", gen.cname(), "* ", gen.cname().substring(0, gen.cname().length()-1) + ";\n"); 

            for (/*DeclNode decl*/ BaseNode b : unit.getFeatures()) {
            	if (!(b instanceof DeclNode))
            		continue;
            	DeclNode decl = (DeclNode) b;
                switch (decl.getType()) {
                // the unit type contains a class
                case pollenParser.D_CLASS:
        			if (!title) {
        				gen.aux.genTitle("class definition (unit " + unit.getName().getText() + "." + decl.getName() + ")");
        				title = true;
        			}

        			genDecl$Class((DeclNode.Class) decl);
                    break;
                default:
                	break;
                }
            }

    		gen.aux.genTitle("struct module definition (unit " + unit.getName().getText() + ")");
    		genDecl$Module(unit.getUnitType());
    		return;
    		
    	}

       
        for (DeclNode decl : unit.getFeatures()) {
            switch (decl.getType()) {
            // the unit type contains a class
            case pollenParser.D_CLASS:
    			if (!title) {
    				gen.aux.genTitle("class definition (unit " + unit.getName().getText() + ")");
    				title = true;
    			}
                genDecl$Class((DeclNode.Class) decl);
                break;
            default:
            	break;
            }
        }
    	gen.getFmt().print("\n");
    }
    
    private void genFcns(UnitNode unit) {
    	boolean title = false;
    	if (unit == null)
    		return;
    	genFcns(unit.getContainingUnit());
  	
    	Collection<List<DeclNode.Fcn>> c = unit.getFcnMap().values();
    	for (List<DeclNode.Fcn> l : c) {
    		for (DeclNode.Fcn f : l) {
    			if (f.isHost())
    				continue;
    			if (!title) {
        	        gen.aux.genTitle("function members (unit " + unit.getName().getText() + ")");
    				title = true;
    			}
    			genDecl$Fcn(f);   			
    		}		
    	}
    	gen.getFmt().print("\n");
    }
    
    private void genHostVars(UnitNode unit) {
    	
    	boolean title = false;
    	if (unit == null)
    		return;
    	genHostVars(unit.getImplementedUnit());
    	genHostVars(unit.getContainingUnit());

    	for (DeclNode decl : unit.getFeatures()) {
    		switch (decl.getType()) {
    		case pollenParser.D_VAR:
    		case pollenParser.D_ARR:
    			if (((DeclNode.Var)decl).isHost())
        			if (!title) {
        				gen.aux.genTitle("host variables (unit " + unit.getName().getText() + ")");
        				title = true;
        			}
    				genDecl$HostVar((DeclNode.Var) decl);
    			break;
    		}

    	}
    }

    
    
    public void generate(UnitNode unit) {
        
        gen.aux.setHost(false);

        genImports(unit);
        
        genForwards(unit);
        
        genInject(unit);             
        
        genClasses(unit);
        
        genHostVars(unit);
        
        genFcns(unit);
  
        genEnums(unit);
        
        genConsts(unit);
        
        genVars(unit);
        
    }

    private void genImports(UnitNode unit) {
    	boolean title = false;
        for (ImportNode imp : unit.getImports()) {
            UnitNode u = imp.getUnit();
            if (u != null && (u.isModule() || u.isClass())) {
    			if (!title) {
    				gen.aux.genTitle("imports");
    				title = true;
    			}
                gen.aux.genHeaderInclude(u.getQualName());
            }
        }
    }
    private void genForwards(UnitNode unit) {
    	
    	gen.aux.genTitle("forward declarations for intrinsics");
//        gen.getFmt().print("void %1pollen__print_bool(bool b);\n", gen.uname_target());
//        gen.getFmt().print("void %1pollen__print_int(int32 i);\n", gen.uname_target());
//        gen.getFmt().print("void %1pollen__print_uint(uint32 u);\n", gen.uname_target());
//        gen.getFmt().print("void %1pollen__print_str(string s);\n", gen.uname_target());
//        gen.getFmt().print("void %1pollen__print_x(void* print, void* val);\n", gen.uname_target());
//        
//        // if assertions are turned on, generate pollen.assert
//        if (ProcessUnits.isAsserts()) {
//            gen.getFmt().print("%tvoid %1pollen__assert__E(bool b, string msg);\n", gen.uname_target());
//        }             
        if (gen.curUnit().lookupFcn(ParseUnit.INTRINSIC_PREFIX + "reset") == null) {
            gen.getFmt().print("void %1pollen__reset__E();\n", gen.uname_target());
        }
        if (gen.curUnit().lookupFcn(ParseUnit.INTRINSIC_PREFIX + "ready") == null) {
            gen.getFmt().print("void %1pollen__ready__E();\n", gen.uname_target());
        }
        if (gen.curUnit().lookupFcn(ParseUnit.INTRINSIC_PREFIX + "shutdown") == null) {
            gen.getFmt().print("void %1pollen__shutdown__E();\n", gen.uname_target());
        }
        if (gen.curUnit().lookupFcn(ParseUnit.INTRINSIC_PREFIX + "wake") == null) {
            gen.getFmt().print("void %1pollen__wake__E(byte id);\n", gen.uname_target());
        }
        if (gen.curUnit().lookupFcn(ParseUnit.INTRINSIC_PREFIX + "hibernate") == null) {
            gen.getFmt().print("void %1pollen__hibernate__E(byte id);\n", gen.uname_target());
        }
    }
    
    private void genInject(UnitNode unit) {
    	boolean title = false;
    	for (BaseNode decl : unit.getInject1()) {
			if (!title) {
				gen.aux.genTitle("header injections");
				title = true;
			}
    		if (decl instanceof StmtNode.Inject) {
    			gen.aux.genExpr(((StmtNode.Inject)decl).getExpr());
    			gen.getFmt().print("\n");
    		}
    	}
    	for (BaseNode decl : unit.getInject2()) {
			if (!title) {
				gen.aux.genTitle("header injections");
				title = true;
			}
    		if (decl instanceof StmtNode.Inject) {
    			gen.aux.genExpr(((StmtNode.Inject)decl).getExpr());
    			gen.getFmt().print("\n");
    		}
    	}    	
    }

    private void genVars(UnitNode unit) {
    	boolean title = false;
    	
    	if (unit.isClass()) {
//    		gen.aux.genTitle("DATA MEMBERS");
//            gen.fmt.print("extern %1%2",gen.cname(), unit.getName() /*+"_ptr "*/);
//            gen.fmt.print(" %1%2",gen.cname(), unit.getName() + ";\n");
            return;
    	}

    	for (DeclNode decl : unit.getFeatures()) {
    		if (decl.isHost() && !(decl instanceof DeclNode.TypedMember)) {
    			continue;
    		}
    		if (decl instanceof DeclNode.Var) {
    			if (!title) {
    				gen.aux.genTitle("data members (unit " + unit.getName().getText() + ")");
    				title = true;
    			}
    			genDecl$Var((DeclNode.Var)decl);
    			continue;
    		}
    	}
    }

}
