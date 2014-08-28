package com.amaret.pollen.parser;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;

import org.antlr.runtime.tree.Tree;

import com.amaret.pollen.parser.DeclNode.ITypeKind;
import com.amaret.pollen.target.ITarget.TypeId;
import com.amaret.pollen.target.ITarget.TypeInfo;
import com.amaret.pollen.translator.Generator;

public class TypeNode extends BaseNode implements DeclNode.ITypeInfo {
	
    // TypeNode.Arr
	// NOTE currently Array specifiers on the type name are not implemented in the 
	// grammar. 
    static public class Arr extends TypeNode implements IOutputName {

        static final private int BASE = 0;
        static final private int DIM = 1;
        boolean referenceElems = false;  // element type is references to object (not instances)
        SymbolEntry baseSymbol = null;   
        
        
        public SymbolEntry getBaseSymbol() {
			return baseSymbol;
		}

		public void setBaseSymbol(SymbolEntry baseSymbol) {

			this.baseSymbol = baseSymbol;
		}
		/**
		 * 
		 * @return true if element type is references to object (not instances)
		 */
		public boolean isReferenceElems() {
			return referenceElems;
		}

		public void setReferenceElems(boolean referenceElems) {
			this.referenceElems = referenceElems;
		}

		Arr(int ttype, String ttext, EnumSet<Flags> flags) {
            super(ttype, ttext, flags);
        }
        
        @Override
        public TypeNode getBase() {
            return (TypeNode) getChild(BASE);
        }

        /**
         * 
         * @return first dimension
         * TODO delete and replace with getDim() after multi-dim is implemented
         */
        @SuppressWarnings("unchecked")
		public ExprNode getFirstDim() {
        	ListNode<ExprNode> child = (ListNode<ExprNode>) getChild(DIM);
        	if (child.getElems().isEmpty())
        		return null;
        	BaseNode b = child.getElems().get(0);
        	if ( b instanceof ExprNode )
        		return (ExprNode) b;
        	else 
        		return null;
        }
        
		@SuppressWarnings("unchecked")
		public ListNode<ExprNode> getDim() {
			return getChildCount() > DIM ? (ListNode<ExprNode>) getChild(DIM) : null;
			
		}
       
        public boolean hasDim() {
        	if (parent instanceof DeclNode.Arr)
        		return ((DeclNode.Arr)parent).hasDim();
            return getChildCount() > DIM;
        }
        public String getOutputNameHost(Generator g, IScope sc, EnumSet<Flags> flags) {
        	return this.getOutputNameTarget(g, sc, flags);
        }
        public String getOutputNameTarget(Generator g, IScope sc, EnumSet<Flags> flags) {
        	// formatted for the declaration. With current implementation (c target) only for local arrays.
			TypeNode t = this;
			String rtn = "";
			while ((t = t.getBase()) != null) {
				rtn = g.getOutputName(t, null, EnumSet.noneOf(Flags.class));
			}
			rtn += " ";
			Tree tr = this.getParent();
			while (tr != null && !(tr instanceof DeclNode.FcnTyp))
				tr = tr.getParent();
			if (tr instanceof DeclNode.FcnTyp ||
					(!this.hasDim() && flags.contains(Flags.IS_LOCAL)))
				rtn += "* ";
			
			if (this.getParent() instanceof DeclNode.Arr){
				rtn = rtn + ((DeclNode.Arr) this.getParent()).getName().getText();
			}
			
			if (this.hasDim()) {
				for (ExprNode e : this.getDim().getElems()) {
					rtn += "[";
					g.getFmt().mark();
					g.getAux().genExpr(e);
					rtn += g.getFmt().release();
					rtn += "]";
				}
			}
			return rtn;
        }

        @Override
        protected void pass2End() {
        }
    }
    
    // TypeNode.Lst
    // Functions with multiple returns specify that with a list of types. 
    static public class Lst extends TypeNode {

        static final private int ITEMS = 0;
         
        Lst(int ttype, String ttext, EnumSet<Flags> flags) {
            super(ttype, ttext, flags);
        }
        
        @SuppressWarnings("unchecked")
        public List<TypeNode> getTypes() {
            return ((ListNode<TypeNode>) getChild(ITEMS)).getElems();
        }
      
        @SuppressWarnings("unchecked")
		public TypeNode getFirst() {
            return (TypeNode) ((ListNode<TypeNode>) getChild(ITEMS)).getElems().get(0);
        }
        
        @SuppressWarnings("unchecked")
        protected boolean pass1Begin() {

        	boolean success = false;
        	if (((ListNode<TypeNode>) getChild(ITEMS)).getElems() != null && ((ListNode<TypeNode>) getChild(ITEMS)).getElems().size() > 0) {
        		for (TypeNode t : ((ListNode<TypeNode>) getChild(ITEMS)).getElems()) {
        			success = t.pass1Begin();
        			if (success == false) return false;
        		}
        	}
        	return success;
        }
  
    }
    
    // TypeNode.Usr a user defined type
    static public class Usr extends TypeNode implements IOutputName {

        static final private int NAME = 0;
        private boolean isFunctionRef = false;
        private boolean isClassRef = false;
        
        private HashMap<String,SymbolEntry> symbolMap = new HashMap<String,SymbolEntry>();
        
        Usr(int ttype, String ttext, EnumSet<Flags> flags) {
            super(ttype, ttext, flags);
        }
        
        public boolean isFunctionRef() {
			return isFunctionRef;
		}
        public boolean isClassRef() {
			return isClassRef;
		}

		public String getOutputNameHost(Generator g, IScope sc, EnumSet<Flags> flags) {
        	// currently host and target not disentangled, may be necessary at some point.
        	return this.getOutputNameTarget(g, sc, flags);
        }
		/**
		 * IScope sc - not used, can pass null.
		 */
        public String getOutputNameTarget(Generator g, IScope sc, EnumSet<Flags> flags) {
        	
        	// these cases should simplify. too many cases! pull out imports first thing?
        	
        	boolean underscore = true; 
        	
        	if (this.getParent() instanceof TypeNode.Arr && this.getParent().getParent() instanceof DeclNode.Formal) {
        		// can only pass (host) arrays of instances as parameters
        		underscore = false;
        	}
        	boolean isTypedef = flags.contains(Flags.IS_FCNREF_TYPEDEF) || flags.contains(Flags.IS_CLASSREF_TYPEDEF);
        	boolean addTypeMods = flags.contains(Flags.IS_DECL);
        	
			SymbolEntry s = ((Usr) this).getSymbol();
			TypeNode t = s != null && s.node() != null && s.node() instanceof DeclNode.Fcn ? ((DeclNode.Fcn)s.node()).getTypeSpec() : null;
			String rtn = "";
			if (isTypedef && t != null) { // this is for the typedef for function references
				// for example, in the header file: typedef void (*test49_Event_uint8_EH_handle)(uint8);

				String name = getOutputNameTarget(g, null, EnumSet.noneOf(Flags.class)); 
				
				rtn = t instanceof TypeNode.Std ? ((TypeNode.Std) t)
						.getIdent().getText()
						: t instanceof TypeNode.Usr ? ((TypeNode.Usr) t).getName()
		
								.getText() : "/* ?? unknown return type ?? */";
				rtn = (rtn + " (*" + name + ")(");
				String sep = "";
				for (DeclNode.Formal arg : ((DeclNode.Fcn) s.node()).getFormals()) {
					rtn += sep; 
					sep = ",";
					if (arg.getTypeCat() instanceof Cat.Scalar) 
						rtn += (((Cat.Scalar) arg.getTypeCat()).mkType());
					else {						
						rtn += ("void*"); // can we do better?
					}
				}
				rtn += ")";
				return rtn;
			}
			if (this.getParent() instanceof DeclNode) {
				if (((DeclNode)this.getParent()).isHostClassRef()) { 
					underscore = false;
				}								
			}
			if (this.getTypeKind() != null && this.getTypeKind().isEnum())
				underscore = false;
			
			if (this.getParent() instanceof TypeNode.Arr && this.getParent().getParent() instanceof DeclNode.Arr) {
				DeclNode.Arr a = (DeclNode.Arr) this.getParent().getParent();
				if (a.isHost()) {
					underscore = false;
				}
			}

			/*
			 * The underscore issue reflects typedefs for classes versus modules.
			 * Class typedefs:
			 * 	1. typedef struct test1_BlinkMilli_led test1_BlinkMilli_led;
			 * 	2. typedef struct test1_BlinkMilli_led* test1_BlinkMilli_led_;
			 * Module typedef:
			 * 	3. typedef struct test1_BlinkMilli_ test1_BlinkMilli_;
			 * For IS_FCNARG_TYPEDEF, for classes we have case 1 (no '_') and for 
			 * modules we have case 3 (with '_'). 
			 */
			if (flags.contains(Flags.IS_FCNARG_TYPEDEF) && isClassRef())
				underscore = false;
			
			String ptr_suffix = underscore ? "_" : "";
			if (s != null && s.node() != null) {
				if (s.node() instanceof ImportNode) {
					ImportNode i = (ImportNode) s.node();

					if (i.getUnit() == null) {
						if (i.isSynthesizedFromMeta())
							rtn = i.getUnitName().getText();
						else
							rtn = Cat.Scalar
									.codeFromString(((ImportNode) s.node())
											.getUnitName().getText());
					}  else {						

						if (i.getUnit().isComposition()) {
							// if the import is a composition, resolve down to the imported module.
							UnitNode u = i.getUnit();
							SymbolEntry se = u.lookupName(i.getUnitName().getText());
							if (se.node() instanceof ImportNode) {
								rtn = ((ImportNode) se.node()).getQualName().replace(".", "_")
								+ ptr_suffix;
							}
						}
						else {
							if (i.getUnit().isEnum())	
								rtn = g.getOutputName(
										i.getUnit().getUnitType(), i.getUnit(),
										EnumSet.noneOf(Flags.class))
										+ ptr_suffix;
							else
								rtn = i.getUnit().getQualName()
										.replace(".", "_")
										+ ptr_suffix;

						}						
					}
					
				} else {
					if (s.node() instanceof DeclNode.Usr) {
						if (s.scope() instanceof DeclNode.Usr) { // nested
							rtn  = g.getOutputName(s.node(), /*((DeclNode.Usr)s.scope()).getEnclosingScope()*/ s.scope(), EnumSet.noneOf(Flags.class));
							rtn += ptr_suffix; // g.uname_target()
							//+ ((DeclNode.Usr) s.node()).getName().getText() + ptr_suffix;
						}
						else
							rtn = g.uname_target();
								
					}
					else
						rtn = (g.uname_target() + ((Usr) this).getName().getText()).replace('.', '_');
				}
			}
			if (addTypeMods) {
				rtn = g.getAux().mkTypeMods(getModifiers()) + rtn;
			}
			return rtn;
        }

		public Atom getName() {
            return ((BaseNode) getChild(NAME)).getAtom();
        }
        
        public SymbolEntry getSymbol() {
        	SymbolEntry symbol;
        	symbol = symbolMap.get(this.getName().getText());
        	
            if (symbol == null) {
            	symbol = ParseUnit.current().getCurrUnitNode().lookupName(ParseUnit.current().getCurrUnitNode().getQualName());           	
            }
            return symbol;
        	
        }
        
        
        public SymbolEntry getSymbol(IScope scopeOfRef) {
        	
        	
        	SymbolEntry symbol;
        	symbol = scopeOfRef.lookupName(this.getName().getText());

        	
            if (symbol == null) {
            	symbol = ParseUnit.current().getCurrUnitNode().lookupName(ParseUnit.current().getCurrUnitNode().getQualName());           	
            }
            return symbol; 
        }
        ITypeKind typeKind = null;
        /**
         * Query for isClass, isProtocol etc.
         * @return null if not supported
         */
        public ITypeKind getTypeKind() {
			return typeKind;
		}

		private ISymbolNode enterName(String toEnter) {
			
//			boolean dbg = true;
//			if (toEnter.equals("ClsFuncRef.foo"))
//				dbg = false;
        	
            SymbolEntry symbol = ParseUnit.current().getSymbolTable().lookupName(toEnter);
            if (symbol == null)
            	symbol = ParseUnit.current().getSymbolTable().lookupName(toEnter, true);
            ISymbolNode snode = symbol != null ? symbol.node() : null;
            if (symbol != null)
            	symbolMap.put(toEnter, symbol);   
            
            boolean okFlag = false;  // ok to be used as a type
            if (snode != null) {
            	if (snode instanceof ITypeKind)
            		typeKind = (ITypeKind) snode;
            		
            	okFlag = (snode instanceof DeclNode.Formal && ((DeclNode.Formal) snode)
            			.isTypeMetaArg()) ? true : snode instanceof ImportNode ? true : false; 
				okFlag = okFlag || snode instanceof DeclNode.ITypeInfo
						|| snode instanceof DeclNode.Fcn
						|| snode instanceof DeclNode.FcnTyp;
            }
            
            isFunctionRef = snode instanceof DeclNode.Fcn;
            isClassRef = snode instanceof ITypeKind ? ((ITypeKind)snode).isClass() : false;
					
            // type members ok?
            if (symbol == null || !okFlag)  {
            	// note can happen if the type is declared after it is ref'd: e.g. a FunctionReference var to a later declared function.
            	ParseUnit.current().reportError(getName(), "not a type"); 
            	// this causes null pointers later so kill it. No, killing it causes problems.
            	//ParseUnit.current().reportFailure("Fatal type error.");
            }
            return snode;
        }
        
        @Override
        protected boolean pass1Begin() {
        	
        	// In the TypeNode.Usr symbolMap we need these entries:
        	//   the current unit type
        	//   an entry for each qualifier
        	// This supports name lookup / xlation in the output phase. 
        	

            ParseUnit currUnit = ParseUnit.current();
            String path[] = getName().getText().split("\\.");
            
            if (path.length > 2) {
                currUnit.reportError(getName(), "too many levels of qualification");
                return false;
            }
            String dbgStr = currUnit.getCurrUnitNode().getUnit().getName().getText();
            enterName(dbgStr);
            
            ISymbolNode snode = null;
            if (!currUnit.getCurrUnitNode().getName().equals(path[0])) {
            	snode = enterName(path[0]);
            	dbgStr += ", " + path[0];
            }

            if (path.length == 2 && snode instanceof IScope) {
            	snode = enterName(getName().getText()); //(path[1]);
            	dbgStr += ", " + path[1];
            }
            
            String u = "In " + ParseUnit.current().getCurrUnitNode().getName().getText();          
            String dbgStr2 = u + ", entering type " + dbgStr + " into TypeNode symtab, in pass1Begin() : ";
            if (snode != null) {
            	String enc = snode.getDefiningScope().getEnclosingScope() != null ? snode.getDefiningScope().getEnclosingScope().getScopeName() + "." : "null.";
            	dbgStr2 +=  " scope " + enc + snode.getDefiningScope().getScopeName();
            }
            //System.out.println(dbgStr2);
            
            if (snode == null)
            	return false;
            return true;
        }
    }
        
    // TypeNode.Std
    static public class Std extends TypeNode implements IOutputName {

        static final private int IDENT = 0;
        static final private HashMap<String,TypeId> tidMap = new HashMap<String,TypeId>();
        
        // TODO this doesn't map to c platform, fix that.
        static {
            tidMap.put("Bool",      TypeId.BOOL);
            tidMap.put("Bool",      TypeId.BYTE);
            tidMap.put("Int8",      TypeId.INT8);
            tidMap.put("Int16",     TypeId.INT16);
            tidMap.put("Int32",     TypeId.INT32);
            tidMap.put("String",    TypeId.STRING);
            tidMap.put("UInt8",    TypeId.INT8);
            tidMap.put("UInt16",    TypeId.INT16);
            tidMap.put("UInt32",    TypeId.INT32);
        }
        
        Std(int ttype, String ttext, EnumSet<Flags> flags) {
			super(ttype, ttext, flags);
		}
        public String getOutputNameHost(Generator g, IScope sc, EnumSet<Flags> flags) {
        	boolean addTypeMods = flags.contains(Flags.IS_DECL);
        	String rtn = getIdent().getText();
			if (addTypeMods) {
				rtn = g.getAux().mkTypeMods(getModifiers()) + rtn;
			}
			return rtn;
        }
        public String getOutputNameTarget(Generator g, IScope sc, EnumSet<Flags> flags) {
        	boolean addTypeMods = flags.contains(Flags.IS_DECL);
        	String rtn = getIdent().getText();
			if (addTypeMods) {
				rtn = g.getAux().mkTypeMods(getModifiers()) + rtn;
			}
			return rtn;
        }
    	
        public Atom getIdent() {
            return ((BaseNode) getChild(IDENT)).getAtom();
        }
        public Atom getName() {
        	return getIdent();
        }
        
    }
    
    // TypeNode
    
    EnumSet<Flags> flags = EnumSet.noneOf(Flags.class);

        
    TypeNode(int ttype, String ttext, EnumSet<Flags> f) {
        this.token = new Atom(ttype, ttext);
        flags = f;
    }
    
    public Atom getName() {
    	return this.getAtom();
    }
        
    public TypeNode getBase() {
        return null;
    }
    
    public EnumSet<Flags>  getModifiers() {
        return flags;
    }
    
    @Override
    public TypeInfo getTypeInfo() {
        return null;
    }
    
    @Override
    protected boolean pass1Begin() {
        return true;
    }
    
    @Override
    protected boolean pass2Begin() {
        return true;
    }

    public TypeNode toRaw() {
        return this;
    }
}
