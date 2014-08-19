package com.amaret.pollen.parser;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.amaret.pollen.parser.DeclNode.ITypeKind;
import com.amaret.pollen.parser.DeclNode.TypedMember;


public class Cat implements Cloneable {
    // type codes
    // scalar
    public static final String BOOL = "b";
    public static final String BYTE = "u1";
    public static final String INT = "i"; 
    public static final String INT8 = "i1"; 
    public static final String INT16 = "i2"; 
    public static final String INT32 = "i4"; 
    public static final String NUMLIT = "n"; 
    public static final String STRING = "s"; 
    public static final String UINT = "u"; 
    public static final String UINT8 = "u1"; 
    public static final String UINT16 = "u2"; 
    public static final String UINT32 = "u4"; 
    public static final String VOID = "v"; 
    // aggregate
    public static final String CLASS = "C";
    public static final String USR = "X";
    public static final String TYP_MEMBER = "X"; 
    public static final String FCN_REF = "x";
    public static final String VEC = "V";  // 'V' is array with dimensions
    public static final String ARR = "A";  // 'A' is dimensionless


    // Cat.Agg
    static public class Agg extends Cat {
      
        private IScope aggScope;
        private IScope defScope;
        private boolean isRef;
        private boolean isHostClassRef;
        private boolean isTargetClassRef;
        private boolean isClassRef;
        private boolean isProtocolMember;
        private boolean isFcnRef;
        private boolean isClassFcn;


        /**
         * When a UnitNode is aggScope it indicates a metatype.
         * @param aggScope
         * @param defScope
         * @param isRef
         * @param fcnRef
         */
        private Agg(IScope aggScope, IScope defScope, boolean isRef, boolean fcnRef) {
        	if (aggScope instanceof UnitNode) {
				UnitNode u = (UnitNode) aggScope;	
				boolean dbg = false;
				//if (dbg)
				//System.out.println(u.getQualName() + (u.isMeta() ? " is meta type " : "") + (u.isGeneratedMetaInstance() ? ", is generated meta instance" : ""));							
			}

			if (aggScope instanceof ImportNode) {
				System.out.println("Cat.Agg(): import where unit was expected");				
			}
			IScope agg = aggScope;
			if (aggScope instanceof UnitNode) {
				agg = ((UnitNode)aggScope).getUnitType();
			}
            this.aggScope = aggScope;
            this.defScope = defScope;
            this.isRef = isRef;
            this.isFcnRef = agg instanceof DeclNode.TypedMember 
            	? ((DeclNode.TypedMember) agg).isFcnRef() : false;
            this.isFcnRef = agg instanceof DeclNode.Fcn && defScope instanceof BodyNode // fcnref as parameter 
                    	? true : this.isFcnRef;
            this.isFcnRef |= fcnRef;
            this.isHostClassRef = agg instanceof DeclNode 
        		? ((DeclNode) agg).isHostClassRef(): false;
        	this.isTargetClassRef = agg instanceof DeclNode 
        		? ((DeclNode) agg).isTargetClassRef(): false;
        	this.isClassRef = agg instanceof DeclNode 
        		? ((DeclNode) agg).isClassRef(): false;
        	this.isClassRef |= agg instanceof DeclNode.Class && isRef;
        	this.isProtocolMember = agg instanceof DeclNode 
        		? ((DeclNode) agg).isProtocolMember(): false;
        	this.isClassFcn = agg instanceof DeclNode.Fcn && isFcnRef ? ((DeclNode.Fcn)agg).isClassScope() : false;

        }
        public boolean isClassFcn() {
        	return isClassFcn;
        }
        public boolean isProtocolMember() {
			return isProtocolMember;
		}
        public boolean isClassRef() {
			return isClassRef;
		}
        public boolean isRef() {
        	return isRef || isClassRef;
        }
		public boolean isTargetClassRef() {
			return isTargetClassRef;
		}

		public boolean isHostClassRef() {
			return isHostClassRef;
		}
        
        public boolean isFcnRef() {
			return isFcnRef;
		}
              
        public boolean isProtocol() {
        	return aggScope instanceof ITypeKind ? ((ITypeKind) aggScope).isProtocol() : false;
        }
        public boolean isClass() {
        	return (aggScope instanceof ITypeKind) ? ((ITypeKind) aggScope).isClass() : false; 
        }
        public boolean isModule() {
        	return (aggScope instanceof ITypeKind) ? ((ITypeKind) aggScope).isModule() : false; 
        }
        public boolean isComposition() {
        	return (aggScope instanceof ITypeKind) ? ((ITypeKind) aggScope).isComposition() : false; 
        }
        public boolean isEnum() {
        	return (aggScope instanceof ITypeKind) ? ((ITypeKind) aggScope).isEnum() : false; 
        }

		public IScope aggScope() {
            return aggScope;
        }
		public String aggName() {
			return mkName();			
		}
        
        public IScope defScope() {
            return defScope;
        }
        
        private String mkName() {
            if (aggScope instanceof UnitNode) {
                return ((UnitNode) aggScope).getQualName();
            }
            if (aggScope instanceof DeclNode.TypedMember && ((DeclNode.TypedMember) aggScope).getTypeUnit() != null) {
                return ((DeclNode.TypedMember) aggScope).getTypeUnit().getQualName();
            }
            if (aggScope instanceof DeclNode.Usr) {
                return ((DeclNode.Usr) aggScope).getUnitQualName();
            }
            if (aggScope instanceof DeclNode.Fcn) {
                return ((DeclNode.Fcn) aggScope).getEnclosingScope().getScopeName() + "." + ((DeclNode.Fcn) aggScope).getName().getText();
            }
 
            return "??";       	
        }
        private String mkCodeFromScope(IScope sc) {
        	
        	if (sc instanceof UnitNode)
        		return mkCodeFromScope(((UnitNode) sc).getUnitType()); 
        	
        	if (sc instanceof ITypeKind && ((ITypeKind) sc).isEnum()) {
        		return Cat.Scalar.codeFromString("uint8");        		
        	}
        	
        	if (sc instanceof DeclNode.Class) {
        		return Cat.CLASS + ((DeclNode.Class) sc).getUnitQualName();
        	}
        	if (sc instanceof DeclNode.Usr) {
        		return Cat.USR + ((DeclNode.Usr) sc).getUnitQualName();
        	}
        	if (isFcnRef && sc instanceof DeclNode.TypedMember) {
        		return Cat.FCN_REF + ((DeclNode.TypedMember) sc).getTypeUnit().getQualName();
        	}
        	if ((isFcnRef || isRef) && sc instanceof DeclNode.Fcn) {
        		return Cat.FCN_REF + ((DeclNode.Fcn) sc).getEnclosingScope().getScopeName() + "." + ((DeclNode.Fcn) sc).getName().getText();
        	}
        	if (isClassRef && sc instanceof DeclNode.TypedMember)
        		return Cat.CLASS + ((DeclNode.TypedMember) sc).getTypeUnit().getQualName(); 
        	
        	if (sc instanceof DeclNode.TypedMember) {
        		DeclNode.TypedMember tm = (TypedMember) sc;
        		if (!tm.isMetaPrimitive())
        			return Cat.TYP_MEMBER + ((DeclNode.TypedMember) sc).getTypeUnit().getQualName();
        		else
        			return tm.getTypeCat().mkCode();
            }
            return super.mkCode();
        	
        }
        
        @Override 
        protected String mkCode() {
        	return mkCodeFromScope(aggScope);
        }
        
        @Override protected String mkType(String quals) {
        	
        	return mkName(); // use quals for classes?

         }
        @Override protected String mkTypeStr() {
        	if (aggScope instanceof DeclNode.Usr)
        		return ((DeclNode.Usr) aggScope).getUnitQualName();
        	return mkType("");
        	
        }
    }
    
    // Cat.Arr
    static public class Arr extends Cat {


        
        private Cat baseCat;
        private TypeNode.Arr tarr;
        
        private Arr(TypeNode.Arr tarr) {
            this.tarr = tarr;
            if (tarr.isReferenceElems() && tarr.getBaseSymbol() != null){
            	// array of object references
            	SymbolEntry sym = tarr.getBaseSymbol();
            	ISymbolNode node = sym.node();
    			if (node != null && node instanceof ImportNode) {
    				node = ((ImportNode)node).getUnit().getUnitType();
    			}
            	this.baseCat = Cat.fromSymbolNode(node, sym.scope(), true, false );
            }
            else
            	this.baseCat = Cat.fromType(tarr.getBase());
        }
        
        public Cat getBase() {
            return baseCat;
        }

        public TypeNode.Arr getType() {
            return tarr;
        }
        
        @Override
        /**
         * 'V' is array with dimensions, 'A' is dimensionless. 
         * Latter is implemented as pointer.
         */
        protected String mkCode() {
            String pre = tarr.hasDim() ? Cat.VEC : Cat.ARR;
            return pre + getBase().mkCode();
        }
        
        @Override
        protected String mkType(String quals) {
            String dim = tarr.hasDim() ? "*" : "";
            StringBuilder sb = new StringBuilder();
            sb.append(getBase().mkType(quals + "[" + dim + "]"));
            return sb.toString();
        }
        @Override protected String mkTypeStr() {
        	return getBase().code() + "$arr";
        }
        public boolean isClassRef() {      
        	return getType().isReferenceElems();  
        }
        	
    }
    
    // Cat.Error
    static public class Error extends Cat {
        
        private String msg;
        
        private Error(String msg) {
            this.msg = msg;
        }
        
        public String getMsg() {
            return msg;
        }
    }
    
    // Cat.Fcn
    static public class Fcn extends Cat {
        private IScope aggScope;
        private Cat retCat;
        private List<Cat> argCats = new ArrayList<Cat>();
        private int minArgc = 0;
        private DeclNode.Fcn fcnD = null;
        private String sigString = "";

        public Fcn(DeclNode.Fcn fcnD) {

        	// TODO 
        	// handle multiple returns

        	retCat = mkRetCat(fcnD);

        	for (DeclNode.Formal arg : fcnD.getFormals()) {
        		argCats.add(Cat.fromType(arg.getTypeSpec()));
        	}
        	minArgc = fcnD.getFormals().size();
        	aggScope = fcnD.getEnclosingScope();
        	this.fcnD = fcnD;
        }
        
        private Cat mkRetCat(DeclNode.Fcn f) {
        	TypeNode t = f.getTypeSpec();
        	Cat ret;
        	if (t instanceof TypeNode.Usr && ((TypeNode.Usr)t).isClassRef())
        		ret = fromType(t, true, ParseUnit.current().getSymbolTable().curScope());
        	else
        		ret = Cat.fromType(t);
        	return ret;
        }
        public Fcn(DeclNode.Fcn fcnD, IScope sc) {
        	
        	bindAggScope(sc);  
        	retCat = mkRetCat(fcnD);

        	for (DeclNode.Formal arg : fcnD.getFormals()) {
        		argCats.add(Cat.fromType(arg.getTypeSpec(), false, aggScope));
        	}
        	minArgc = fcnD.getFormals().size();
        	this.fcnD = fcnD;
        }

        public IScope aggScope() {
            return aggScope;
        }
        
        public List<Cat> argCats() {
            return argCats;
        }
        
        void bindAggScope(IScope aggScope) {
            this.aggScope = aggScope;
        }
        
        public DeclNode.Fcn fcnD() {
            return fcnD;
        }
        
        public int maxArgc() {
            return argCats.size();
        }
        
        @Override
        protected String mkCode() {
            return "F" + retCat().mkCode();
        }
        
        @Override protected String mkType(String quals) {
            StringBuilder sb = new StringBuilder();
            sb.append(retCat().mkType(quals));
            sb.append("(");
            String sep = "";
            for (Cat cat : argCats()) {
                sb.append(sep);
                sep = ",";
                sb.append(cat.mkType());
            }
            sb.append(")");
            return sb.toString();
        }
        /**
         * Create the sigString, a representation of the function argument types as a string.
         */
         @Override protected String mkTypeStr() {
        	
        	if (!sigString.isEmpty() || fcnD == null) // needed for fcnT?
        		return sigString;
        	
        	for (DeclNode.Formal arg : fcnD.getFormals()) {
        		
        		TypeNode t = arg.getTypeSpec();
        		switch (t.getType()) {
        		
                case pollenParser.T_ARR:
                    sigString += new Cat.Arr((TypeNode.Arr) t).mkTypeStr();
                    break;
                case pollenParser.T_USR:
                    SymbolEntry sym = ((TypeNode.Usr) t).getSymbol(this.aggScope());
                    if (sym != null)
                    	sigString +=  Cat.fromSymbolNode(sym.node(), sym.scope(), false, false).mkTypeStr();
                    else
                    	sigString += Cat.fromScalarString("void");
                    break;
                case pollenParser.T_STD:
                	sigString +=  new Cat.Scalar(((TypeNode.Std) t).getIdent().getText()).mkTypeStr();
                	break;
                default:
                    break;
                }       		
        	}
        	return sigString;
        }
        
        public int minArgc() {
            return minArgc;
        }
        
        public Cat retCat() {
            return retCat;
        }
        public boolean isClassFcn() {
        	return fcnD().isClassScope();
        }
    }
    
    // Cat.Scalar
    static public class Scalar extends Cat {

    	static final private HashMap<String,String> codeMap = new HashMap<String,String>();
        
        static {
        	// Cat.NUMLIT or "n" is not here but is used for numeric literals
        	// which should match any numeric type, 
        	// e.g. 'uint8 Var == 0' should pass checks.
            codeMap.put("bool",     Cat.BOOL);
            codeMap.put("byte",		Cat.BYTE);
            codeMap.put("int8",     Cat.INT8);
            codeMap.put("int16",    Cat.INT16);
            codeMap.put("int32",    Cat.INT32);
            codeMap.put("string",   Cat.STRING);
            codeMap.put("uint8",    Cat.UINT8);
            codeMap.put("uint16",   Cat.UINT16);
            codeMap.put("uint32",   Cat.UINT32);
            codeMap.put("void",     Cat.VOID);
        }
        
        private char kind;
        private int rank; // 8, 16, 32 bit
        
        private Scalar(String stdType) {
            this(codeMap.get(stdType), 0);
        }
        
        private Scalar(String code, int dummy) {

            kind = code.charAt(0);
            rank = (code.length() == 1) ? -1 : code.charAt(1) - '0';
        }
        
        public char kind() {
            return kind;
        }
        
        public int rank() {
            return rank;
        }
        public boolean isByte() {
        	if (rank == 1)
        		return true;
        	return false;
        }
        
        private String mkStdType() {
            switch (kind) {
            case 'b':
                return "bool";
            case 'n':
                return "Num";
            case 's':
                 return "string";
            case 'v':
                return "void";
            case 'i':
                return rank == 1 ? "int8" : rank == 2 ? "int16" : rank == 4 ? "int32" : "int8"; 
            case 'u':
                return rank == 1 ? "uint8" : rank == 2 ? "uint16" : rank == 4 ? "uint32" : "uint8"; 
            }
            return super.mkType();
        }
        
        @Override protected String mkCode() {
            StringBuilder sb = new StringBuilder();
            sb.append(kind);
            if (rank >= 0) {
                sb.append((char) ('0' + rank));
            }
            return sb.toString();
        }
        public static String codeFromString(String type) {
        	return codeMap.get(type);        	
        }
        
        @Override protected String mkType(String quals) {
            StringBuilder sb = new StringBuilder();
            sb.append(mkStdType());
            sb.append(quals);
            return sb.toString();
        }
        @Override protected String mkTypeStr() {
        	return mkCode();
        }
    }
    // Cat

	public static final Cat INJECT = new Cat();
    public static final Cat HASH = new Cat();
    public static final Cat UNKNOWN = new Cat();
    public static final Cat VECTOR = new Cat();


    
    static Cat fromError(String msg, Cat cat1, Cat cat2) {
        String res = msg;
        if (cat1 != null) {
            res += ": <" + cat1.mkType();
            if (cat2 != null) {
                res += ", " + cat2.mkType();
            }
            res += ">";
        }
        return new Cat.Error(res);
    }
    
    static Cat fromNew(TypeNode typeNode) {
    	Cat cat = Cat.fromType(typeNode);
    	UnitNode unit = null;
    	UnitNode curr = ParseUnit.current().getCurrUnitNode();
    	SymbolEntry sym;
    	if (typeNode instanceof TypeNode.Usr) {
    		sym = ((TypeNode.Usr)typeNode).getSymbol(); 	
    	}
    	else sym = curr.resolveSymbol(typeNode.getAtom());
    	
    	ISymbolNode snode = sym != null ? sym.node() : null;
    	boolean isClass = false;
    	if (snode instanceof ImportNode) {
    		unit = ((ImportNode) snode).getUnit();
    		isClass = unit.isClass();
    	}   
    	else if (snode instanceof UnitNode) {
    		unit = (UnitNode) snode;
    		isClass = unit.isClass();
    	}
    	else if (snode instanceof DeclNode.Class && sym.scope() instanceof DeclNode.Usr) {
    		// nested
    		unit = ((DeclNode.Usr)sym.scope()).getUnit();   	
    		isClass = true;
    	}

    	if (unit != null && isClass)
    		return cat;

    	return Cat.fromError("class type required for \'new\'", cat, null);       
    }
    
    static Cat fromScalarCode(String code) {
        return new Cat.Scalar(code, 0);
    }
    
    static Cat fromScalarString(String typ) {
    	if (Cat.Scalar.codeFromString(typ) != null)
    		return new Cat.Scalar(typ);
    	return null;
    }
 
    static Cat fromSymbolNode(ISymbolNode snode, IScope defScope) {
        return fromSymbolNode(snode, defScope, false, false);
    }

    static Cat fromSymbolNode(ISymbolNode snode, IScope defScope, boolean isRef, boolean isFcnRef) {
    	
    	//System.out.println("Cat.fromSymbolNode(): " + snode.getName().getText());
    	
        if (snode instanceof UnitNode) {
            return new Cat.Agg((UnitNode) snode, defScope, isRef, false);
        }
        else if (snode instanceof DeclNode.Usr) {
            return new Cat.Agg((DeclNode.Usr) snode, defScope, isRef, false);
        }
        else if (snode instanceof DeclNode.Fcn && isFcnRef) {
            return new Cat.Agg((DeclNode.Fcn) snode, defScope, isRef, true);
        }
        else if (snode instanceof DeclNode.Fcn) {
            return new Cat.Fcn((DeclNode.Fcn) snode);
        }
        else if (snode instanceof ImportNode) {
        	if (((ImportNode) snode).getUnit() == null) {
        		String code = Cat.Scalar.codeFromString(((ImportNode) snode).getUnitName().getText());
        		 if (code != null) {
        			 return Cat.fromScalarCode(code);       			 
        		 }
        	}
        	return fromSymbolNode(((ImportNode) snode).getUnit(), defScope, isRef, false);
        }
        else if (snode instanceof DeclNode.TypedMember) {
            return new Cat.Agg((DeclNode.TypedMember) snode, defScope, false, false);
        }
        else if (snode instanceof DeclNode.Formal && ((DeclNode.Formal)snode).getTypeSpec() instanceof TypeNode.Usr) { 
        	TypeNode.Usr t = (com.amaret.pollen.parser.TypeNode.Usr) ((DeclNode.Formal)snode).getTypeSpec();
        	ISymbolNode is = (t.getSymbol() != null ? t.getSymbol().node() : null);
        	if (is != null && is instanceof ImportNode && ((ImportNode)is).getUnit() != null)
        		is = ((ImportNode)is).getUnit().getUnitType();       	
        	if (is instanceof DeclNode)
        		return new Cat.Agg((IScope) is, defScope, isRef, false);
        	else
        		return Cat.fromType((TypeNode) t);
        }
        else if (snode instanceof DeclNode.ITypeSpec) {
        	BaseNode b = ((DeclNode.ITypeSpec) snode).getTypeSpec();
        	if (b instanceof TypeNode) {
                return Cat.fromType((TypeNode) b);
        	}
        	else // TODO a list of TypeNodes
        		return UNKNOWN;
        }
        else if (snode instanceof DeclNode.EnumVal) {
            return Cat.fromScalarCode(Cat.UINT8);
        }
        else {
            return UNKNOWN;
        }
    }    
    public static Cat fromType(TypeNode typeNode) {
        return fromType(typeNode, false, ParseUnit.current().getSymbolTable().curScope());
    }
    
    static Cat fromType(TypeNode typeNode, boolean isRef, IScope sc) {
    	//System.out.println("Cat.fromTypeNode(): " + typeNode.getName().getText() + (typeNode.getType() == pollenParser.T_ARR ? " array" : ""));
        switch (typeNode.getType()) {
        case pollenParser.T_ARR:
            return new Cat.Arr((TypeNode.Arr) typeNode);
        case pollenParser.T_USR:
        	if (typeNode.getParent() != null && typeNode.getParent() instanceof DeclNode.Formal) {
        		DeclNode.Formal f = (DeclNode.Formal)typeNode.getParent();
        		if (f.isTypeMetaArg()) {
        			if (f.getInit() instanceof ExprNode.Typ){
        				return Cat.fromType((((ExprNode.Typ)f.getInit()).getTyp()));
        			}
        			else return Cat.fromType(f.getTypeSpec());
        		}
        	}
            SymbolEntry sym = ((TypeNode.Usr) typeNode).getSymbol();
            if (sym != null) {
            	boolean isFcnRef = sym.node() instanceof DeclNode.Fcn;
            	return Cat.fromSymbolNode(sym.node(), sym.scope(), isRef, isFcnRef );
            }
            else return Cat.fromScalarString("void");
        case pollenParser.T_STD:
            return new Cat.Scalar(((TypeNode.Std) typeNode).getIdent().getText());
        default:
            return UNKNOWN;
        }
    }

    protected int ptrCnt = 0;
    private String code;
    
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String code() {
        if (code == null) {
            code = mkCode();
        }
        return code;
    }
    
    public boolean isAggArr() {
        return this instanceof Cat.Arr;
    }
    public boolean isAggTyp() {  
    	
    	if (!(this instanceof Cat.Agg))
    		return false;
    	Cat.Agg c = (Agg) this;
    	if (c.isFcnRef)
    		return false;
    	return true;
      	
    }
        
    public boolean isTypedMember() {
    	return false;      
    }
    public boolean isProtocolMember() {        
    	return false;             
    }
    public boolean  isHostClassRef() {        
    	return false;             
    }
    public boolean isTargetClassRef() {        
    	return false;      
    }
    public boolean isClassRef() {        
    	return false;    
    }
    public boolean isClassFcn() {
    	return false;
    }
    public boolean isFcnRef() {        
    	return false;    
    }
    public boolean isRef() {
    	if (this instanceof Cat.Arr){
    		return this.isClassRef();
    	}
    	return false;
    }
    public boolean isFcn() {
    	return this instanceof Cat.Fcn; 
    }
    public boolean isModule() {
    	boolean rtn = false;
    	rtn = this instanceof Cat.Agg && ((Cat.Agg) this).aggScope instanceof DeclNode.Usr;
    	if (rtn) {
    		DeclNode.Usr m = (DeclNode.Usr) ((Cat.Agg) this).aggScope;
    		rtn |= m.isModule();
    	}
    	return rtn;
    }

    
    public boolean isString() {
        return this instanceof Cat.Scalar && ((Cat.Scalar) this).kind == 's';
    }
        
    public boolean isUnit() {
    	if (this instanceof Cat.Agg){
    		Cat.Agg c = (Agg) this;
    		if (c.isModule() || c.isClass() || c.isComposition() || c.isProtocol() || c.isEnum())
    			return true;    		
    	}
        return  false;
    }
    
    public boolean isVector() {
        return this instanceof Cat.Arr && ((Cat.Arr) this).tarr.hasDim();
    }
    
    public boolean isVoid() {
        return this instanceof Cat.Scalar && ((Cat.Scalar) this).kind == 'v';
    }
    
    public String sigString() {
    	if (this instanceof Cat.Fcn)
    		return mkTypeStr();
    	return "";
    }
    
    
    protected String mkCode() {
        return "?";
    }
    
    public final String mkType() {
        return mkType("");
    }
    
    protected String mkType(String quals) {
        return "?";
    }
    
    protected String mkTypeStr() {
    	return "?";
    }

	/**
	 * @return
	 */
	public boolean isArrayDesc() throws RuntimeException {
		// TODO Do I need this?
		return false;
	}
    
}
