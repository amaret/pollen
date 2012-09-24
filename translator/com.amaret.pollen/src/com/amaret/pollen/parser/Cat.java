package com.amaret.pollen.parser;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class Cat implements Cloneable {

    // Cat.Agg
    static public class Agg extends Cat {

		
        
        private IScope aggScope;
        private IScope defScope;
        private boolean isRef;
        
        private Agg(IScope aggScope, IScope defScope, boolean isRef) {
            this.aggScope = aggScope;
            this.defScope = defScope;
            this.isRef = isRef;
        }
        
        public IScope aggScope() {
            return aggScope;
        }
        
        public IScope defScope() {
            return defScope;
        }
        
        @Override protected String mkCode() {
             if (aggScope instanceof UnitNode) {
                return "U" + ((UnitNode) aggScope).getQualName();
            }
            if (aggScope instanceof DeclNode.TypedMember) {
                return "X" + ((DeclNode.TypedMember) aggScope).getTypeUnit().getQualName();
            }
            return super.mkCode();
        }
        
        @Override protected String mkType(String quals) {

            if (aggScope instanceof UnitNode) {
                return ((UnitNode) aggScope).getQualName();
            }
            if (aggScope instanceof DeclNode.TypedMember) {
                return ((DeclNode.TypedMember) aggScope).getTypeUnit().getQualName();
            }
            return super.mkType();
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
            this.baseCat = Cat.fromType(tarr.getBase());
        }
        
        public Cat getBase() {
            return baseCat;
        }

        public TypeNode.Arr getType() {
            return tarr;
        }
        
        @Override
        protected String mkCode() {
            String pre = tarr.hasDim() ? "V" : "A";
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
        private TypeNode.Fcn fcnT = null;
        private String sigString = "";

        public Fcn(DeclNode.Fcn fcnD) {

        	// TODO 
        	// handle multiple returns
        	retCat = Cat.fromType(fcnD.getTypeSpec());

        	for (DeclNode.Formal arg : fcnD.getFormals()) {
        		argCats.add(Cat.fromType(arg.getTypeSpec()));
        	}
        	minArgc = fcnD.getFormals().size();
        	this.fcnD = fcnD;
        }
        public Fcn(DeclNode.Fcn fcnD, IScope sc) {
        	
        	bindAggScope(sc);  
        	retCat = Cat.fromType(fcnD.getTypeSpec());

        	for (DeclNode.Formal arg : fcnD.getFormals()) {
        		argCats.add(Cat.fromType(arg.getTypeSpec(), false, aggScope));
        	}
        	minArgc = fcnD.getFormals().size();
        	this.fcnD = fcnD;
        }
        public Fcn(TypeNode.Fcn fcnT, IScope sc) {
        	bindAggScope(sc);      
            retCat = Cat.fromType(fcnT.getBase(), false, aggScope);
            for (TypeNode argT : fcnT.getArgs()) {
                argCats.add(Cat.fromType(argT));
            }
            minArgc = fcnT.getArgs().size();
            this.fcnT = fcnT;
        }

        public Fcn(TypeNode.Fcn fcnT) {
            retCat = Cat.fromType(fcnT.getBase());
            for (TypeNode argT : fcnT.getArgs()) {
                argCats.add(Cat.fromType(argT));
            }
            minArgc = fcnT.getArgs().size();
            this.fcnT = fcnT;
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
        
        public TypeNode.Fcn fcnT() {
            return fcnT;
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
                    sigString +=  Cat.fromSymbolNode(sym.node(), sym.scope(), false).mkTypeStr();
                    break;
                case pollenParser.T_FCN:
                    // not legal here
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
    }
    
    // Cat.Scalar
    static public class Scalar extends Cat {

    	static final private HashMap<String,String> codeMap = new HashMap<String,String>();
        
        static {
            codeMap.put("bool",     "b");
            //codeMap.put("Char",     "u1");
            codeMap.put("byte",		"u1");
            //codeMap.put("IArg",     "ia");
            codeMap.put("int8",     "i1");
            codeMap.put("int16",    "i2");
            codeMap.put("int32",    "i4");
            //codeMap.put("Ptr",      "p");
            //codeMap.put("Ref",      "r");
            codeMap.put("string",   "s");
            //codeMap.put("UArg",     "ua");
            codeMap.put("uint8",    "u1");
            codeMap.put("uint16",   "u2");
            codeMap.put("uint32",   "u4");
            codeMap.put("void",     "v");
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
        
        private String mkStdType() {
            switch (kind) {
            case 'b':
                return "bool";
            case 's':
                 return "string";
            case 'v':
                return "void";
            case 'i':
                return rank == 1 ? "int8" : rank == 2 ? "int16" : rank == 3 ? "int32" : "int8"; 
            case 'u':
                return rank == 1 ? "uint8" : rank == 2 ? "uint16" : rank == 3 ? "uint32" : "uint8"; 
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
    public static final Cat VEC = new Cat();


    
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
    		sym = curr.resolveSymbol(((TypeNode.Usr) typeNode).getName());   		
    	}
    	else sym = curr.resolveSymbol(typeNode.getAtom());
    	
    	ISymbolNode snode = sym != null ? sym.node() : null;
    	if (snode instanceof ImportNode) {
    		unit = ((ImportNode) snode).getUnit();
    	}   
    	else if (snode instanceof UnitNode) {
    		unit = (UnitNode) snode;
    	}

    	if (unit != null && unit.isClass())
    		return cat;

    	return Cat.fromError("class type required for \'new\'", cat, null);       
    }
    
    static Cat fromScalarCode(String code) {
        return new Cat.Scalar(code, 0);
    }
    
    static Cat fromScalarString(String typ) {
        return new Cat.Scalar(typ);
    }
 
    static Cat fromSymbolNode(ISymbolNode snode, IScope defScope) {
        return fromSymbolNode(snode, defScope, false);
    }

    static Cat fromSymbolNode(ISymbolNode snode, IScope defScope, boolean isRef) {
    	
        if (snode instanceof UnitNode) {
            return new Cat.Agg((UnitNode) snode, defScope, false);
        }
        else if (snode instanceof DeclNode.Usr) {
            return new Cat.Agg((DeclNode.Usr) snode, defScope, isRef);
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
        	return fromSymbolNode(((ImportNode) snode).getUnit(), defScope);
        }
        else if (snode instanceof DeclNode.TypedMember) {
            return new Cat.Agg((DeclNode.TypedMember) snode, defScope, false);
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
            return Cat.fromScalarCode("u1");
        }
        else {
            return UNKNOWN;
        }
    }    
    static Cat fromType(TypeNode typeNode) {
        return fromType(typeNode, false, ParseUnit.current().getSymbolTable().curScope());
    }
    
    static Cat fromType(TypeNode typeNode, boolean isRef, IScope sc) {
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

            return Cat.fromSymbolNode(sym.node(), sym.scope(), isRef);
        case pollenParser.T_FCN:
            Cat cat = new Cat.Fcn((TypeNode.Fcn) typeNode);
            return cat;
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
    
    public boolean isAggVal() {
        return this instanceof Cat.Arr;
    }
        
    public boolean isTypedMember() {
        return this instanceof Cat.Agg && ((Cat.Agg) this).aggScope instanceof DeclNode.TypedMember;
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
        return this instanceof Cat.Agg && ((Cat.Agg) this).aggScope instanceof UnitNode;
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
    
    final String mkType() {
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
