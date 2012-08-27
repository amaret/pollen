package com.amaret.pollen.parser;

import java.util.ArrayList;
import java.util.List;


public class Cat implements Cloneable {

    // Cat.Agg
    static public class Agg extends Cat {

		public IScope aggScope() {
			// TODO Auto-generated method stub
			return null;
		}
        
        /*private IScope aggScope;
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
            if (aggScope instanceof DeclNode.Struct) {
                DeclNode.Struct str = (DeclNode.Struct) aggScope;
                String res = isRef ? "R" : "";
                for (int i = 0; i < ptrCnt; i++) {
                    res += "P";
                }
                return res + 'S' + str.getUnitQualName() + '.' + str.getName();
            }
            if (aggScope instanceof UnitNode) {
                return "U" + ((UnitNode) aggScope).getQualName();
            }
            if (aggScope instanceof DeclNode.Proxy) {
                return "X" + ((DeclNode.Proxy) aggScope).getInterface().getQualName();
            }
            return super.mkCode();
        }
        
        @Override protected String mkType(String quals) {
            if (aggScope instanceof DeclNode.Struct) {
                DeclNode.Struct str = (DeclNode.Struct) aggScope;
                String res = str.getUnitQualName() + '.' + str.getName() + quals;
                if (isRef) {
                    res += "&";
                }
                for (int i = 0; i < ptrCnt; i++) {
                    res += "*";
                }
                return res;
            }
            if (aggScope instanceof UnitNode) {
                return ((UnitNode) aggScope).getQualName();
            }
            if (aggScope instanceof DeclNode.Proxy) {
                return ((DeclNode.Proxy) aggScope).getInterface().getQualName();
            }
            return super.mkType();
        }
        
        @Override
        public int ptrCnt() {
            return isRef ? ptrCnt + 1 : ptrCnt;
        }*/
    }
    
    // Cat.Arr
    static public class Arr extends Cat {

		public Cat getBase() {
			// TODO Auto-generated method stub
			return null;
		}
        
        /*private Cat baseCat;
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
            String dim = tarr.hasDim() ? "*" : tarr.isDesc() ? "length" : "";
            StringBuilder sb = new StringBuilder();
            sb.append(getBase().mkType(quals + "[" + dim + "]"));
            for (int i = 0; i < ptrCnt; i++) {
                sb.append("*");
            }
            return sb.toString();
        }*/
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
    	private List<Cat> argCats = new ArrayList<Cat>();

		public int minArgc() {
			// TODO Auto-generated method stub
			return 0;
		}
/*
        private IScope aggScope;
        private Cat retCat;
        private List<Cat> argCats = new ArrayList<Cat>();
        private int minArgc = 0;
        private DeclNode.Fcn fcnD = null;
        private TypeNode.Fcn fcnT = null;

        public Fcn(DeclNode.Fcn fcnD) {
            if (fcnD.isTemplate()) {
                retCat = new Cat.Scalar("s", 0);
            }
            else {
                retCat = Cat.fromType(fcnD.getTypeSpec());
            }
            for (DeclNode.Arg arg : fcnD.getArgs()) {
                argCats.add(Cat.fromType(arg.getTypeSpec()));
            }
            minArgc = fcnD.getMinArgc();
            this.fcnD = fcnD;
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
             don't ptr-to-fcn versus fcn 
            return sb.toString();
        }
        
        public int minArgc() {
            return minArgc;
        }
        
        public Cat retCat() {
            return retCat;
        }
        */

		public int maxArgc() {
			// TODO Auto-generated method stub
			return 0;
		}

		public Cat retCat() {
			// TODO Auto-generated method stub
			return null;
		}

		public List<Cat> argCats() {
			// TODO Auto-generated method stub
			return null;
		}

		public void bindAggScope(IScope scope) {
			// TODO Auto-generated method stub
			
		}
    }
    
    // Cat.Scalar
    static public class Scalar extends Cat {

		public char kind() {
			// TODO Auto-generated method stub
			return 0;
		}

        /*static final private HashMap<String,String> codeMap = new HashMap<String,String>();
        
        static {
            codeMap.put("Bool",     "b");
            codeMap.put("Char",     "u1");
            codeMap.put("IArg",     "ia");
            codeMap.put("Int8",     "i1");
            codeMap.put("Int16",    "i2");
            codeMap.put("Int32",    "i4");
            codeMap.put("Ptr",      "p");
            codeMap.put("Ref",      "r");
            codeMap.put("String",   "s");
            codeMap.put("UArg",     "ua");
            codeMap.put("UInt8",    "u1");
            codeMap.put("UInt16",   "u2");
            codeMap.put("UInt32",   "u4");
            codeMap.put("Void",     "v");
        }
        
        private char kind;
        private int rank;
        
        private Scalar(String stdType) {
            this(codeMap.get(stdType), 0);
        }
        
        private Scalar(String code, int ptrCnt) {
            this.ptrCnt = ptrCnt;
            kind = code.charAt(0);
            rank = (code.length() == 1 || code.charAt(1) == 'a') ? -1 : code.charAt(1) - '0';
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
                return "Bool";
            case 'n':
                return "Num";
            case 'p':
                return "Ptr";
            case 'r':
                return "Ref";
            case 's':
                 return "String";
            case 'v':
                return "Void";
            case 'i':
                return rank == 1 ? "Int8" : rank == 2 ? "Int16" : rank == 3 ? "Int32" : rank == -1 ? "IArg" : "Int"; 
            case 'u':
                return rank == 1 ? "UInt8" : rank == 2 ? "UInt16" : rank == 3 ? "UInt32" : rank == -1 ? "UArg" : "Num"; 
            }
            return super.mkType();
        }
        
        @Override protected String mkCode() {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < ptrCnt; i++) {
                sb.append("P");
            }
            sb.append(kind);
            if (rank >= 0) {
                sb.append((char) ('0' + rank));
            }
            else if (kind == 'i' || kind == 'u') {
                sb.append('a');
            }
            return sb.toString();
        }
        
        @Override protected String mkType(String quals) {
            StringBuilder sb = new StringBuilder();
            sb.append(mkStdType());
            sb.append(quals);
            for (int i = 0; i < ptrCnt; i++) {
                sb.append("*");
            }
            return sb.toString();
        }*/
    }

	public static Cat fromType(TypeNode typeSpec) {
		// TODO Auto-generated method stub
		return null;
	}
    // Cat

	public static Cat fromScalarCode(String string) {
		// TODO Auto-generated method stub
		return null;
	}
	public static final Cat INJECT = new Cat();
    public static final Cat HASH = new Cat();
    public static final Cat UNKNOWN = new Cat();
    public static final Cat VEC = new Cat();
	public static Cat fromNew(TypeNode typeSpec) {
		// TODO check that this type can be instantiated.
		return null;
	}

	public boolean isString() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isVoid() {
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * @param unit
	 * @param definingScope
	 * @return
	 */
	public static Cat fromSymbolNode(UnitNode unit, IScope definingScope) {
		// TODO Auto-generated method stub
		return null;
	}
    
/*    public static final Cat ESCAPE = new Cat();
    public static final Cat HASH = new Cat();
    public static final Cat UNKNOWN = new Cat();
    public static final Cat VEC = new Cat();
    
    static Cat fromClone(Cat srccat, int ptrDelta) {
        Cat cat = null;
        try {
            cat = (Cat) srccat.clone();
        }
        catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        cat.ptrCnt = srccat.ptrCnt + ptrDelta;
        return cat;
    }
    
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
        if (cat.ptrCnt == 0) {
            if (cat.isStruct()) {
                ((Cat.Agg) cat).isRef = true;
                return cat;
            }
            if (cat instanceof Cat.Arr) {
                return cat;
            }
        }
        return Cat.fromError("struct or array type required", cat, null);
    }
    
    static Cat fromScalarCode(String code) {
        return new Cat.Scalar(code, 0);
    }
    
    static Cat fromSymbolNode(ISymbolNode snode, IScope defScope) {
        return fromSymbolNode(snode, defScope, false);
    }

    static Cat fromSymbolNode(ISymbolNode snode, IScope defScope, boolean isRef) {
        if (snode instanceof UnitNode) {
            return new Cat.Agg((UnitNode) snode, defScope, false);
        }
        else if (snode instanceof DeclNode.Struct) {
            return new Cat.Agg((DeclNode.Struct) snode, defScope, isRef);
        }
        else if (snode instanceof DeclNode.Fcn) {
            return new Cat.Fcn((DeclNode.Fcn) snode);
        }
        else if (snode instanceof DeclNode.Proxy) {
            return new Cat.Agg((DeclNode.Proxy) snode, defScope, false);
        }
        else if (snode instanceof DeclNode.ITypeSpec) {
            return Cat.fromType(((DeclNode.ITypeSpec) snode).getTypeSpec());
        }
        else if (snode instanceof DeclNode.Enum || snode instanceof DeclNode.EnumVal) {
            return Cat.fromScalarCode("u1");
        }
        else {
            return UNKNOWN;
        }
    }
    
    static Cat fromThis(DeclNode.Struct decl) {
        SymbolEntry sym = Session.current().curUnit().resolveSymbol(decl.getName());
        DeclNode.Struct str = (DeclNode.Struct) sym.node();
        Cat cat = new Cat.Agg(str, sym.scope(), true);
        return cat;
    }
    
    static Cat fromType(TypeNode typeNode) {
        return fromType(typeNode, false);
    }
    
    static Cat fromType(TypeNode typeNode, boolean isRef) {
        switch (typeNode.getType()) {
        case EmParser.T_ARR:
            return new Cat.Arr((TypeNode.Arr) typeNode);
        case EmParser.T_DEF:
            SymbolEntry sym = ((TypeNode.Def) typeNode).getSymbol();
            return Cat.fromSymbolNode(sym.node(), sym.scope(), isRef);
        case EmParser.T_FXN:
            Cat cat = new Cat.Fcn((TypeNode.Fcn) typeNode);
            cat.ptrCnt++;
            return cat;
        case EmParser.T_PTR:
            TypeNode.Ptr t = (TypeNode.Ptr) typeNode;
            cat = Cat.fromType(t.getBase(), t.isRef());
            if (!t.isRef()) {
                cat.ptrCnt++;
            }
            return cat;
        case EmParser.T_STD:
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
        return isStruct() || this instanceof Cat.Arr;
    }
    
    public boolean isArrayDesc() {
        return this instanceof Cat.Arr && ((Cat.Arr) this).getType().isDesc();
    }
    
    public boolean isProxy() {
        return this instanceof Cat.Agg && ((Cat.Agg) this).aggScope instanceof DeclNode.Proxy;
    }
    
    public boolean isString() {
        return this instanceof Cat.Scalar && ((Cat.Scalar) this).kind == 's';
    }
    
    public boolean isStructRef() {
        return this instanceof Cat.Agg && ((Cat.Agg) this).isRef;
    }
    
    public boolean isStruct() {
        return this instanceof Cat.Agg && ((Cat.Agg) this).aggScope instanceof DeclNode.Struct;
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
    
    protected String mkCode() {
        return "?";
    }
    
    final String mkType() {
        return mkType("");
    }
    
    protected String mkType(String quals) {
        return "?";
    }
    
    public int ptrCnt() {
        return ptrCnt;
    }*/
}
