package com.amaret.pollen.parser;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import org.antlr.runtime.CommonToken;

import com.amaret.pollen.parser.pollenParser.TypeInfo;

public class DeclNode extends BaseNode implements ISymbolNode {
	
    // DeclNode.Formal (parameter)
    static public class Formal extends DeclNode implements ITypeSpecInit {

        static final private int INIT = 2;
        static final private int TYPE = 1;
        
        Formal(int ttype, String ttext) {
            super(ttype, ttext, Flags.EMPTY);
        }
        
        Formal(int ttype, String ttext, int flags) {
            super(ttype, ttext, flags);
        }
        
        @Override
        public ExprNode getInit() {
            return getChildCount() > INIT ? (ExprNode) getChild(INIT) : null;
        }

        @Override
        public TypeNode getTypeSpec() {
            return (TypeNode) getChild(TYPE);
        }
    }
    
    // DeclNode.Enum
    static public class Enum extends DeclNode implements ITypeInfo {

        static final private int VALS = 1;
        
        Enum(int ttype, String ttext, int flags) {
            super(ttype, ttext, flags);
        }
        
        @SuppressWarnings("unchecked")
        public List<DeclNode.EnumVal> getVals() {
            return ((ListNode<DeclNode.EnumVal>) getChild(VALS)).getElems();
        }

        @Override
        public TypeInfo getTypeInfo() {
            return Session.current().getTarget().getTypeInfo(TypeId.INT8);
        }
    }
    
    // DeclNode.EnumVal
    static public class EnumVal extends DeclNode implements IConstVal {

        EnumVal(int ttype, String ttext, int flags) {
            super(ttype, ttext, flags);
        }
    }
    
    
    
    // DeclNode.Fcn
    static public class Fcn extends DeclNode implements ITypeSpec, IScope {

        static final private int ARGS = 1;
        static final private int TYPE = 2;

        private String cname;
        private DeclNode.Struct struct;
        private boolean isTemplate;
        private int minArgc = -1;
        private NestedScope scopeDeleg = new NestedScope(this);
        
        Fcn(int ttype, String ttext, int flags) {
            this(ttype, ttext, flags, false);
        }
        
        Fcn(int ttype, String ttext, int flags, boolean isTemplate) {
            super(ttype, ttext, flags);
            this.isTemplate = isTemplate;
        }
        
        private int checkArgs() {
            int res = 0;
            boolean initFlg = false;
            for (DeclNode.Formal arg : getArgs()) {
                initFlg = initFlg || (arg.getInit() != null);
                if (!initFlg) {
                    res += 1;
                }
                else if (arg.getInit() == null) {
                    ParseUnit.current().reportError(arg.getName(), "default argument value required");
                    return -1;
                }
            }
            return res;
        }

        public String cname() {
            return cname;
        }
        
        @Override
        public boolean defineSymbol(Atom name, ISymbolNode symbol) {
            return scopeDeleg.defineSymbol(name, symbol);
        }
        
        @SuppressWarnings("unchecked")
        public List<DeclNode.Formal> getArgs() {
            return ((ListNode<DeclNode.Formal>) getChild(ARGS)).getElems();
        }

        @Override
        public IScope getEnclosingScope() {
            return scopeDeleg.getEnclosingScope();
        }
        
        @Override
        public Set<Map.Entry<String,SymbolEntry>> getEntrySet() {
            return scopeDeleg.getEntrySet();
        }

        public int getMinArgc() {
            return minArgc;
        }
        
        @Override
        public TypeNode getTypeSpec() {
            return !isTemplate ? (TypeNode) getChild(TYPE) : null;
        }
        
        public DeclNode.Struct getStruct() {
            return struct;
        }
        
        public boolean isTemplate() {
            return isTemplate;
        }
        
        public boolean isVoid() {
            Cat.Fcn fxnCat = (Cat.Fxn) getTypeCat();
            return fxnCat.retCat().isVoid();
        }
        
        @Override
        protected boolean pass1Begin() {
            super.pass1Begin();
            Session.current().getSymbolTable().enterScope(this);
            IScope scope = getEnclosingScope();
            struct = scope instanceof DeclNode.Struct ? (DeclNode.Struct) scope : null;
            cname = (struct == null) ? ("" + getName()) : ("" + struct.getName() + "__" + getName());
            minArgc = checkArgs();
            return true;
        }

        @Override
        protected void pass1End() {
            Session.current().getSymbolTable().leaveScope();
            super.pass1End();
        }

        @Override
        public void replaceSymbol(Atom name, ISymbolNode symbol) {
            scopeDeleg.replaceSymbol(name, symbol);
        }

        @Override
        public SymbolEntry resolveSymbol(Atom name) {
            return scopeDeleg.resolveSymbol(name);
        }

        @Override
        public void setEnclosingScope(IScope scope) {
            scopeDeleg.setEnclosingScope(scope);
        }

        @Override
        public SymbolEntry lookupName(String name) {
            return scopeDeleg.lookupName(name);
        }
    }
    
    // DeclNode.IAuxDef
    static public interface IAuxDef {
    }
    
    // DeclNode.ITypeInfo
    static public interface ITypeInfo {
        public TypeInfo getTypeInfo();
    }
    
    // DeclNode.ITypeSpec
    static public interface ITypeSpec {
        public Atom getName();
        public Cat getTypeCat();
        public TypeNode getTypeSpec();
    }
    
    // DeclNode.ITypeSpecInit
    static public interface ITypeSpecInit extends ITypeSpec {
        public ExprNode getInit();
    }
    
    // DeclNode.Proxy
    static public class Proxy extends DeclNode implements ISealable, IScope, IUnitWrapper {
        
        static final private int INHER = 1;
        
        private UnitNode inter;
        private NestedScope scopeDeleg = new NestedScope(this);
        
        Proxy(int ttype, String ttext, int flags) {
            super(ttype, ttext, flags);
        }
        
        public Atom getInherits() {
            return ((BaseNode) getChild(INHER)).getAtom();
        }
        
        public UnitNode getInterface() {
            return inter;
        }
        
        @Override
        public String getQualName() {
            return ((UnitNode) getDefiningScope()).getQualName() + '.' + getName();
        }
        
        @Override
        public UnitNode getUnit() {
            return inter;
        }
        
        @Override
        protected boolean pass1Begin() {
            super.pass1Begin();
            Session ses = Session.current();
            SymbolEntry sym = ses.curUnit().resolveSymbol(getInherits());
            ISymbolNode snode = sym != null ? sym.node() : null;
            if (snode instanceof ImportNode) {
                inter = ((ImportNode) snode).getUnit();
            }
            else if (snode instanceof UnitNode) {
                inter = (UnitNode) snode;
            }
            if (inter == null || inter.isModule()) {
                ses.reportError(getInherits(), "must be an interface");
            }
            else {
                scopeDeleg.addSymbols(inter.getEntrySet());
            }
            return false;
        }

        @Override
        public boolean defineSymbol(Atom name, ISymbolNode node) {
            return scopeDeleg.defineSymbol(name, node);
        }

        @Override
        public IScope getEnclosingScope() {
            return scopeDeleg.getEnclosingScope();
        }

        @Override
        public Set<Entry<String, SymbolEntry>> getEntrySet() {
            return scopeDeleg.getEntrySet();
        }

        @Override
        public SymbolEntry lookupName(String name) {
            return scopeDeleg.lookupName(name);
        }

        @Override
        public void replaceSymbol(Atom name, ISymbolNode node) {
            scopeDeleg.replaceSymbol(name, node);
        }

        @Override
        public SymbolEntry resolveSymbol(Atom name) {
            return scopeDeleg.resolveSymbol(name);
        }

        @Override
        public void setEnclosingScope(IScope scope) {
            scopeDeleg.setEnclosingScope(scope);
        }
    }

    // DeclNode.Struct
    static public class Struct extends DeclNode implements IScope, ITypeInfo {

        static final private int MEMBERS = 1;
        
        private boolean hasMethods;
        private boolean isOpaque;
        private DeclNode.Struct classParent = null;
        private NestedScope scopeDeleg = new NestedScope(this);
        
        Struct(int ttype, String ttext, int flags, boolean isOpaque, boolean hasMethods) {
            super(ttype, ttext, flags);
            this.hasMethods = hasMethods;
            this.isOpaque = isOpaque;
        }
        
        DeclNode.Struct findChild() {
            DeclNode.Struct strA = this;
            if (strA.isOpaque() && strA.hasMethods()) {
                SymbolEntry sym = ParseUnit.current().curUnit().lookupName(strA.getName().getText());
                if (sym != null && sym.node() instanceof DeclNode.Struct) {
                    DeclNode.Struct strB = (DeclNode.Struct) sym.node();
                    if (strB.isOpaque() && strB.getClassParent() == strA) {
                        return strB;
                    }
                }
            }
            return strA;
        }
        
        @SuppressWarnings("unchecked")
        public List<DeclNode.Field> getFields() {
            return ((ListNode<DeclNode.Field>) getChild(MEMBERS)).getElems();
        }
        
        @SuppressWarnings("unchecked")
        public List<DeclNode.Fcn> getFxns() {
            return ((ListNode<DeclNode.Fcn>) getChild(MEMBERS)).getElems();
        }
        
        public boolean hasMethods() {
            return hasMethods;
        }

        public boolean isOpaque() {
            return isOpaque;
        }

        @Override
        public boolean defineSymbol(Atom name, ISymbolNode symbol) {
            return scopeDeleg.defineSymbol(name, symbol);
        }

        public DeclNode.Struct getClassParent() {
            return classParent;
        }
        
        @Override
        public IScope getEnclosingScope() {
            return scopeDeleg.getEnclosingScope();
        }

        @Override
        public Set<Map.Entry<String,SymbolEntry>> getEntrySet() {
            return scopeDeleg.getEntrySet();
        }

        @Override
        public TypeInfo getTypeInfo() {
            return getTypeInfo(null);
        }
        
        public TypeInfo getTypeInfo(String fn) {
            int a0 = -1, sz = 0, d;
            for (DeclNode.Field fld : getFields()) {
                TypeInfo ti = fld.getTypeSpec().getTypeInfo();
                if (a0 == -1) {
                    a0 = ti.align;
                }
                if (fld.getName().getText().equals(fn)) {
                    break;
                }
                if ((d = sz % ti.align) != 0) {
                    sz += ti.align - d;
                }
                sz += ti.size;
            }
            if ((d = sz % a0) != 0) {
                sz += a0 - d;
            }
            return new TypeInfo(sz, a0);
            
        }
        
        public String getUnitQualName() {
            return ((UnitNode) getEnclosingScope()).getQualName();
        }
        
        @Override
        protected boolean pass1Begin() {
            ParseUnit currUnit = ParseUnit.current();
            super.pass1Begin();
            if (isOpaque() && !hasMethods() && isPublic()) {
                currUnit.reportError(getName(), "opaque structure representations can't be declared publically");
            }
            SymbolTable symtab = currUnit.getSymbolTable();
            if (classParent != null) {
                scopeDeleg.addSymbols(classParent.scopeDeleg.getEntrySet());
                symtab.curScope().replaceSymbol(getName(), this);
            }
            symtab.enterScope(this);
            return true;
        }

        @Override
        protected void pass1End() {
            ParseUnit.current().getSymbolTable().leaveScope();
            super.pass1End();
        }

        @Override
        public void replaceSymbol(Atom name, ISymbolNode symbol) {
            scopeDeleg.replaceSymbol(name, symbol);
        }

        @Override
        public SymbolEntry resolveSymbol(Atom name) {
            return scopeDeleg.resolveSymbol(name);
        }

        @Override
        public void setEnclosingScope(IScope scope) {
            scopeDeleg.setEnclosingScope(scope);
        }

        @Override
        public SymbolEntry lookupName(String name) {
            return scopeDeleg.lookupName(name);
        }
        
        public void setClassParent(DeclNode.Struct classParent) {
            this.classParent = classParent;
        }
    }
    
    // DeclNode.Typedef
    static public class Typedef extends DeclNode implements IAuxDef, ITypeInfo, ITypeSpec {

        static final private int TYPE = 1;
        
        Typedef(int ttype, String ttext, int flags) {
            super(ttype, ttext, flags);
        }
        
        @Override
        public TypeInfo getTypeInfo() {
            return getTypeSpec().getTypeInfo();
        }
        
        @Override
        public TypeNode getTypeSpec() {
            return (TypeNode) getChild(TYPE);
        }

    }
    
    // DeclNode.Var
    static public class Var extends DeclNode implements ITypeSpecInit {

        static final private int INIT = 2;
        static final private int TYPE = 1;
        
        Var(int ttype, String ttext, int flags) {
            super(ttype, ttext, flags);
        }

        @Override
        public ExprNode getInit() {
            return getChildCount() > INIT ? (ExprNode) getChild(INIT) : null;
        }

        @Override
        public TypeNode getTypeSpec() {
            return (TypeNode) getChild(TYPE);
        }

        @Override
        protected boolean pass1Begin() {
            super.pass1Begin();
            ParseUnit ses = ParseUnit.current();
            if (isPublic()) {
                ses.reportError(getName(), "variables can't be declared publically");
            }
            return true;
        }
    }
    
    // DeclNode
    
    static final private int NAME = 0;
    
    private IScope definingScope;
    private int flags;
    private Cat typeCat;
    
    DeclNode(int ttype, String ttext, int flags) {
      	this.token = new CommonToken(ttype, ttext);
    	this.flags = flags;
    }

    @Override
    public IScope getDefiningScope() {
        return definingScope;
    }
    
    @Override
    public Atom getName() {
    	return ((BaseNode) getChild(NAME)).getAtom();
    }
    
    @Override
    public Cat getTypeCat() {
        if (typeCat == null) {
            typeCat = Cat.fromSymbolNode(this, this.getDefiningScope());
        }
        return typeCat;
    }

    public boolean isHost() {
        return (flags & Flags.HOST) != 0;
    }

    public boolean isPrivate() {
        return (flags & Flags.PRIVATE) != 0;
    }

    public boolean isPublic() {
        return !isPrivate();
    }
    
    @Override
    protected boolean pass1Begin() {
        ParseUnit ses = ParseUnit.current();
        Atom name = getName();
        SymbolEntry sym = ses.getSymbolTable().resolveSymbol(name);
        ISymbolNode snode = sym != null ? sym.node() : null;
        if (snode instanceof DeclNode.Struct && this instanceof DeclNode.Struct) {
            ((DeclNode.Struct) this).setClassParent((DeclNode.Struct) snode);
            return true;
        }
        if (ses.getSymbolTable().defineSymbol(name, this) == false) {
            ses.reportError(name, "identifier already defined in the current scope");
        }
        return true;
    }
    
    @Override
    protected boolean pass2Begin() {
        if (BodyNode.current() == null) {
            ParseUnit.current().setHostFlag(isHost());
        }
        return true;
    }
    
    @Override
    public void pass2End() {
        if (!(this instanceof ITypeSpecInit)) {
            return;
        }
        ITypeSpecInit tsi = (ITypeSpecInit) this;
        ExprNode init = tsi.getInit();
        if (init == null) {
            return;
        }
        if (this.getDefiningScope() instanceof UnitNode && !init.isConst()) {
            ParseUnit.current().reportError(init, "initializer must be a constant expression");
            return;
        }
        TypeRules.checkInit(tsi.getTypeCat(), init);
    }

    @Override
    public void setDefiningScope(IScope scope) {
        definingScope = scope;
    }
    
    @Override
    public String toString() {
    	return token.getText() + flags;
    }

}
