/**
 * 
 */
package com.amaret.pollen.translator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.List;

import com.amaret.pollen.parser.BaseNode;
import com.amaret.pollen.parser.DeclNode;
import com.amaret.pollen.parser.DeclNode.Class;
import com.amaret.pollen.parser.DeclNode.Formal;
import com.amaret.pollen.parser.DeclNode.ITypeSpec;
import com.amaret.pollen.parser.ExprNode;
import com.amaret.pollen.parser.Flags;
import com.amaret.pollen.parser.IScope;
import com.amaret.pollen.parser.ISymbolNode;
import com.amaret.pollen.parser.ImportNode;
import com.amaret.pollen.parser.ParseUnit;
import com.amaret.pollen.parser.StmtNode;
import com.amaret.pollen.parser.SymbolEntry;
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
        for (DeclNode.EnumVal ev : decl.getVals()) {
			String s = gen.getOutputName(ev, ev.getDefiningScope(), EnumSet.noneOf(Flags.class));
			gen.getFmt().print("#define %1 %2\n", s, ev.getVal().getText());
        }
    }
    
    private void genDecl$Fcn(DeclNode.Fcn decl) {
    	gen.aux.genFcnArgForwards(decl.getFormals(), decl);
        gen.getFmt().print("extern ");
        TypeNode ft = decl.getTypeSpec();
        gen.aux.genForwardForType(decl);
		gen.aux.genForwardedType(ft, gen.uname_target() + gen.aux.mkPollenCname(decl.cname()) + gen.aux.mkSuf(decl), EnumSet.of(Flags.IS_FCNDECL), (ITypeSpec) decl);       		
        gen.aux.genFcnArgs(decl.getFormals(), true, decl);
        gen.getFmt().print(";\n");
    }

	private void genDecl$HostVar(DeclNode.Var decl) {

		if (!decl.isHost())
			return;

		if (decl.isConst()) {
			return;
		}
				
		gen.getFmt().print("typedef ");
		EnumSet<Flags> f = EnumSet.noneOf(Flags.class);
		if (decl.isClassRef()) {
			f.add(Flags.IS_CLASSREF_TYPEDEF);
			gen.getFmt().print("struct "); // sometimes if this is missing it is an error, otherwise not at all (?)
		}
		gen.aux.genTypeWithVarName(decl.getTypeSpec(), gen.uname_target() + decl.getName()
				+ "__TYPE", f);
		gen.getFmt().print(";\n");
		String braces = "";
        if (decl instanceof DeclNode.Arr) {
        	for (@SuppressWarnings("unused") ExprNode e : ((DeclNode.Arr)decl).getDim().getElems()) {
        		braces += "[]";
        	}
        }
        
        String constStr = (!decl.isHostClassRef() && !decl.isClassScope() && !decl.isHostNonConst()) ? "const " : ""; 
		
        gen.getFmt().print("extern " + constStr + "%1__TYPE %1%2%3;\n", gen.uname_target()
				+ decl.getName(), gen.aux.mkSuf(decl),braces);

	}
	
    private void genDecl$Class(DeclNode.Class decl) {
    	
    	for (DeclNode fld : decl.getFeatures()) {
    		// nested first to resolve references to them from containing class
    		if (fld instanceof DeclNode.Class)
    			genDecl$Class((Class) fld);
    	}
    	    
        List<DeclNode> fields = decl.getFeatures();
        
        IScope outer = decl.getEnclosingScope();
       
        // class name is a qualifier only for nested class (as it's not carried in cname)
        DeclNode.Class cls = outer instanceof DeclNode.Usr ? decl : null;
        String qual = (cls == null) ? ("") : cls.getName().getText();
        String clsStruct = (qual.isEmpty()) ? gen.uname_target().substring(0, gen.uname_target().length()-1) : gen.uname_target() + qual;
        String clsStructPtr = (qual.isEmpty()) ?  gen.uname_target() :  gen.uname_target() + qual + "_";
        
        gen.getAux().genFcnRefTypeDefs(fields);
        for (DeclNode fld : fields) {
			if (fld instanceof DeclNode.Class)
				continue;
        	if (fld instanceof DeclNode.ITypeSpec)
        		gen.aux.genForwardForType((ITypeSpec) fld);
        }
        
        gen.getFmt().print("%tstruct %1 {\n%+", clsStruct);
        for (DeclNode fld : fields) {
        	
			if (fld instanceof DeclNode.Var
					&& ((DeclNode.Var) fld).isIntrinsic()
					&& !((DeclNode.Var) fld).isIntrinsicUsed())
				continue;
			if (fld instanceof DeclNode.Class)
				continue;
			if (fld instanceof DeclNode.FcnRef) {
        		String s = gen.getOutputName((Usr) ((DeclNode.ITypeSpec) fld).getTypeSpec(), null, EnumSet.noneOf(Flags.class));
				gen.getFmt().print("%t%1 %2", s, fld.getName());
			}
			else
				if (fld instanceof DeclNode.ITypeSpec && !(fld instanceof DeclNode.Fcn)) {
        			String name = (fld instanceof DeclNode.Arr && !((DeclNode.Arr)fld).hasDim()) ? "* " : "";
        			name += fld.getName().getText();
					gen.getFmt().print("%t");
					gen.aux.genForwardedType(((DeclNode.ITypeSpec) fld).getTypeSpec(), "" + name, EnumSet.noneOf(Flags.class), (ITypeSpec) fld);       		
				}
			
    		if (fld instanceof DeclNode.Arr && ((DeclNode.Arr)fld).hasDim()) {
    			((DeclNode.Arr)fld).checkDims();
    			genArrDims(fld);
    		}
    		if (!(fld instanceof DeclNode.Fcn))
    			gen.getFmt().print(";\n");
        }
        gen.getFmt().print("%-%t};\n"); 
        gen.getFmt().print("%ttypedef struct %1 %1;\n", clsStruct, clsStruct); 
        gen.getFmt().print("%ttypedef struct %1* %2;\n", clsStruct, clsStructPtr); 

    }
	/**
	 * Used for host and target class arrays. Used for module target arrays only (not host). 
	 * @param fld
	 */
	private void genArrDims(DeclNode fld) {
		boolean isClass = fld.getDefiningScope() instanceof DeclNode.Class ? true : false;
		for (BaseNode e : ((DeclNode.Arr)fld).getDim().getElems()) {
			gen.getFmt().print("[");
			boolean isPreset = false;
			SymbolEntry dimVar = null;
			if (e instanceof ExprNode.Ident) {
				dimVar = ((ExprNode.Ident)e).getSymbol() != null ? ((ExprNode.Ident)e).getSymbol() : null;
				if (ParseUnit.current().isPreset(((ExprNode.Ident)e).getSymbol())) {
					isPreset = true;
					e = ParseUnit.current().getPresetExpr(((ExprNode.Ident)e).getSymbol());
				}				
				else {					
					int i = ((DeclNode.Arr)fld).getFirstDimSize(); // check if array size set at  host time.
					if (i != -1) {
						String val = Integer.toString(i);
						gen.getFmt().print("%1] /* %2 */", val, ((ExprNode.Ident) e).getName().getText());
						continue;
					}
					SymbolEntry se = ((ExprNode.Ident)e).getSymbol();
					ISymbolNode node = se != null ? se.node() : null;					
					if (node instanceof DeclNode.Var) {
						// if the arr dim is a variable initialized to a constant, use that constant as the dim value.
						e = ((DeclNode.Var)node).getInit();
					}
				}
			}
			if (e instanceof ExprNode && ((ExprNode)e).getConstInitialValue() != null) {
				gen.aux.genExpr(((ExprNode) e).getConstInitialValue());
			}
			else {
				// If the array dimension size variable is host, these errors will not occur. 
				String msg = isClass ? "for arrays defined in class scope, " : "for non-host arrays defined in module scope, ";
				// note these errors not raised for host arrays in modules because the issue doesn't exist on the host/module side.
				String msg2 = "";
				ISymbolNode n = dimVar != null ? dimVar.node() : null;
				if (n != null && n instanceof DeclNode.Var && ((DeclNode.Var)n).isConst()) {
					msg2 = "(Note that the attribute \'const\' does not itself create a compile time constant because in C constness can be cast away. However host variables whose value is set during the host phase will be compile time constants.)";				
				}
				ParseUnit.current().reportError(fld.getName(), msg + "array dimensions must resolve to compile time constant values." + msg2);
				if (isPreset) 
					ParseUnit.current().reportError(fld.getName(), msg + "when array dimensions are set by variables initialized in \'preset\' initializers, those variables must be preset to constant values");
			}
			gen.getFmt().print("]");
		}
	}
    
    private void genDecl$Module(DeclNode.Usr decl) {
    	
    	if (!decl.isModule())
    		return;
        
        List<DeclNode> fields = decl.getFeatures();
        gen.getAux().genFcnRefTypeDefs(fields);   
        for (DeclNode fld : fields) {
        	if (fld instanceof DeclNode.ITypeSpec)
        		gen.aux.genForwardForType((ITypeSpec) fld);
        }
        gen.getFmt().print("%tstruct %1 {\n%+", gen.uname_target());
        for (DeclNode fld : fields) {

        	if (fld instanceof DeclNode.Var
        			&& ((DeclNode.Var) fld).isIntrinsic()
        			&& !((DeclNode.Var) fld).isIntrinsicUsed())
        		continue;

        	// host items are often const in which case they are not fields of the module struct and 'excludeHost' is true.
        	// Some host items are not const, eg function references (this list may expand).
        	boolean excludeHost = fld.isHost() && !(fld instanceof DeclNode.FcnRef);
        	
        	if (!excludeHost && fld instanceof DeclNode.ITypeSpec && !(fld instanceof DeclNode.Fcn)) {
        		gen.getFmt().print("%t");     

        		boolean proMem = fld instanceof DeclNode.TypedMember && ((DeclNode.TypedMember)fld).isProtocolMember();
        		if (proMem) {
        			gen.getFmt().print("struct ");
        			gen.aux.genTypeWithVarName(((DeclNode.ITypeSpec) fld).getTypeSpec(), "", EnumSet.noneOf(Flags.class));
        			gen.getFmt().print("*"  + fld.getName().getText());
        		}
        		else if (fld.isHostClassRef()) {
        			gen.getFmt().mark();
        			gen.aux.genTypeWithVarName(((DeclNode.ITypeSpec) fld).getTypeSpec(), "", EnumSet.noneOf(Flags.class));
        			String typeString = gen.getFmt().release();
        			gen.getFmt().print("%1 %2",typeString.substring(0, typeString.length()-2), fld.getName().getText());
        		}
        		else if (fld instanceof DeclNode.FcnRef) {
            		String s = gen.getOutputName((Usr) ((DeclNode.ITypeSpec) fld).getTypeSpec(), null, EnumSet.noneOf(Flags.class));
    				gen.getFmt().print("%1 %2", s, fld.getName());
    			}
        		else {
        			String name = (fld instanceof DeclNode.Arr && !((DeclNode.Arr)fld).hasDim()) ? "* " : "";
        			name += fld.getName().getText();
					gen.aux.genForwardedType(((DeclNode.ITypeSpec) fld).getTypeSpec(), name, EnumSet.noneOf(Flags.class), (ITypeSpec) fld);       		
        		}
        		if (fld instanceof DeclNode.Arr && ((DeclNode.Arr)fld).hasDim()) {
        			genArrDims(((DeclNode.Arr)fld));
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
    		gen.aux.genTypeWithVarName(decl.getTypeSpec(), gen.uname_target() + decl.getName() + gen.aux.mkSuf(decl), EnumSet.noneOf(Flags.class));
    		if (decl instanceof DeclNode.Arr) {
    			for (@SuppressWarnings("unused") ExprNode e : ((DeclNode.Arr)decl).getDim().getElems()) {
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

            for (BaseNode b : unit.getFeatures()) {
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

       
//        for (DeclNode decl : unit.getFeatures()) {
//            switch (decl.getType()) {
//            // the unit type contains a class
//            case pollenParser.D_CLASS:
//    			if (!title) {
//    				gen.aux.genTitle("class definition (unit " + unit.getName().getText() + ")");
//    				title = true;
//    			}
//                genDecl$Class((DeclNode.Class) decl);
//                break;
//            default:
//            	break;
//            }
//        }
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

    
    
    public void generateUnitHdr(UnitNode unit) {
        
        gen.aux.setHost(false);

        genImports(unit);
        
        genForwards(unit);
        
        genInject(unit);    
        
        genEnums(unit);
                
        genClasses(unit);
        
        genHostVars(unit);
          
        genFcns(unit);
          
        genConsts(unit);
        
        genVars(unit);
        
    }
    
    /**
     * This is the entry routine.
     * @param unit
     */
    private void genImports(UnitNode unit) {
    	if (unit == null) 
    		return;
    	List<String> imported = new ArrayList<String>();
    	this.genImports(imported, unit, false);
    }


    /**
     * Generate header includes for used units. 
     * For compositions, call recursively.
     * @param imported a list of units already imported. 
     * @param unit
     * @param tl title 
     */
    private void genImports(List<String> imported, UnitNode unit, boolean tl) {

    	if (unit == null)
    		return;
    	boolean title = tl;   
    	for (ImportNode imp : unit.getImports()) {
    		UnitNode u = imp.getUnit();
    		if (u != null) {
    			if (!title) {
    				gen.aux.genTitle("imports");
    				title = true;
    			}
    			if (u.isUnitUsed()) {
    				if ((u.isModule() || u.isClass()) && !imported.contains(u.getQualName())) {
    					gen.aux.genHeaderInclude(u.getQualName());
    					imported.add(u.getQualName());
    				}
    				if (u.isComposition()) {
    					this.genImports(imported, u, title);
    					// TODO how are base type imports brought in? 
    				}
    			}
    		}
    	}
    }
    private void genForwards(UnitNode unit) {
    	
    	gen.aux.genTitle("forward declarations for intrinsics");
    	// if there is no local intrinsic definition, generate a forward
        if (gen.curUnit().lookupFcn(ParseUnit.POLLEN_PREFIX__ + "reset") == null) {
        	gen.getFmt().print("void %1();\n",ParseUnit.current().getPollenIntrinsicFcnOutputName(ParseUnit.POLLEN_RESET));
        }
        if (gen.curUnit().lookupFcn(ParseUnit.POLLEN_PREFIX__ + "ready") == null) {
        	gen.getFmt().print("void %1();\n",ParseUnit.current().getPollenIntrinsicFcnOutputName(ParseUnit.POLLEN_READY));
        }
        if (gen.curUnit().lookupFcn(ParseUnit.POLLEN_PREFIX__ + "shutdown") == null) {
        	gen.getFmt().print("void %1(uint8 i);\n",ParseUnit.current().getPollenIntrinsicFcnOutputName(ParseUnit.POLLEN_SHUTDOWN));
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
    		// fields referenced with 'this'
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
