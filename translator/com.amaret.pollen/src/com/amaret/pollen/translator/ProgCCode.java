package com.amaret.pollen.translator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

import org.mozilla.javascript.NativeArray;
import org.mozilla.javascript.NativeObject;

import com.amaret.pollen.driver.ProcessUnits;
import com.amaret.pollen.parser.Cat;
import com.amaret.pollen.parser.DeclNode;
import com.amaret.pollen.parser.ExprNode;
import com.amaret.pollen.parser.ISymbolNode;
import com.amaret.pollen.parser.ImportNode;
import com.amaret.pollen.parser.ParseUnit;
import com.amaret.pollen.parser.TypeNode;
import com.amaret.pollen.parser.UnitNode;
import com.amaret.pollen.parser.pollenParser;
import com.amaret.pollen.parser.DeclNode.ITypeSpec;
import com.amaret.pollen.parser.DeclNode.TypedMember;
import com.amaret.pollen.parser.TypeNode.Usr;
import com.amaret.pollen.script.Value;
import com.amaret.pollen.script.Value.Obj;
import com.amaret.pollen.target.ITarget;

public class ProgCCode {

    private class FwdAgg {
        String cname;
        Value.Obj vobj;
        DeclNode.Class cls;
        String tname;
        TypeNode.Arr tarr;
        Cat basecat;
    }
    /**
     * HashMap of <unit, Value.Obj> for units for which target c will be generated. 
     */
    HashMap<String, UnitDesc> unitDescs = new HashMap<String, UnitDesc>();
    private class UnitDesc {
        private UnitNode unit;
        private Value.Obj unitObj;

        public UnitDesc(UnitNode u, Value.Obj uo, boolean insertUnitDescs){
        	setUnit(u);
        	setUnitObj(uo);
        	if (insertUnitDescs)
        		unitDescs.put(u.getQualName(), this);
        }

		/**
		 * @param unit the unit to set
		 */
		void setUnit(UnitNode unit) {
			this.unit = unit;
		}

		/**
		 * @return the unit
		 */
		UnitNode getUnit() {
			return unit;
		}

		/**
		 * @param unitObj the unitObj to set
		 */
		void setUnitObj(Value.Obj unitObj) {
			this.unitObj = unitObj;
		}

		/**
		 * @return the unitObj
		 */
		Value.Obj getUnitObj() {
			return unitObj;
		}
    }
    
    private ArrayList<FwdAgg> fwdAggList = new ArrayList<FwdAgg>();
    private ArrayList<FwdAgg> fwdAggDecls = new ArrayList<FwdAgg>();
    private HashSet<String> fwdAggNames = new HashSet<String>();
    private Generator gen;
    /**
     * target 'c' code is generated for these units.
     */
    private List<UnitDesc> units = new ArrayList<UnitDesc>();
    
    
    public ProgCCode(Generator gen) {
        this.gen = gen;
    }


    private void genEpilogue() {
    	
    	gen.aux.genTitle("module functions");
        for (UnitDesc ud : units) {
            UnitNode u = ud.getUnit();
            if (u.isTarget() && !u.isEnum()) {
                gen.fmt.print("#include \"../../%1/%2/%2.c\"\n", u.getPkgName(), u.getName());
            }
        }
        
        gen.aux.genTitle("pollen.print");
        gen.fmt.print("%tvoid %1pollen__print_bool(bool b) {\n%+", gen.cname());
        gen.fmt.print("%-}\n");
        gen.fmt.print("%tvoid %1pollen__print_int(int32 i) {\n%+", gen.cname());
        gen.fmt.print("%-}\n");
        gen.fmt.print("%tvoid %1pollen__print_uint(uint32 u) {\n%+", gen.cname());
        gen.fmt.print("%-}\n");
        gen.fmt.print("%tvoid %1pollen__print_str(string s) {\n%+", gen.cname());
        gen.fmt.print("%-}\n");
        gen.fmt.print("%tvoid %1pollen__print_x(void* print, void* val) {\n%+", gen.cname());
        gen.fmt.print("%-}\n");
        
        // if assertions are turned on, generate pollen.assert
        if (ProcessUnits.isAsserts()) {
        	gen.aux.genTitle("pollen.assert(bool, string)");
            gen.fmt.print("%tvoid %1pollen__assert__E(bool b, string msg) {\n%+", gen.cname());
            gen.fmt.print("%tif (!b) %1pollen__print_str(msg);\n", gen.cname());
            gen.fmt.print("%-}\n");
        }       
        // Generate defaults for pollen.reset, pollen.ready, pollen.shutdown, pollen.wake, pollen.hibernate.
        // if they do not exist.
        if (gen.curUnit().lookupFcn(ParseUnit.INTRINSIC_PREFIX + "reset") == null) {
        	gen.aux.genTitle("pollen.reset()");
            gen.fmt.print("%tvoid %1pollen__reset__E() {\n%+", gen.cname());
            gen.fmt.print("%t/* empty default */\n");
            gen.fmt.print("%-}\n");
        }
        if (gen.curUnit().lookupFcn(ParseUnit.INTRINSIC_PREFIX + "ready") == null) {
        	gen.aux.genTitle("pollen.ready()");
            gen.fmt.print("%tvoid %1pollen__ready__E() {\n%+", gen.cname());
            gen.fmt.print("%t/* empty default */\n");
            gen.fmt.print("%-}\n");
        }
        if (gen.curUnit().lookupFcn(ParseUnit.INTRINSIC_PREFIX + "shutdown") == null) {
        	gen.aux.genTitle("pollen.shutdown()");
            gen.fmt.print("%tvoid %1pollen__shutdown__E() {\n%+", gen.cname());
            gen.fmt.print("%tvolatile int dummy = 0xCAFE;\n");
            gen.fmt.print("%twhile (dummy) ;\n");
            gen.fmt.print("%-}\n");
        }
        if (gen.curUnit().lookupFcn(ParseUnit.INTRINSIC_PREFIX + "wake") == null) {
        	gen.aux.genTitle("pollen.wake(uint8 id)");
            gen.fmt.print("%tvoid %1pollen__wake__E(byte id) {\n%+", gen.cname());
            gen.fmt.print("%t/* empty default */\n");
            gen.fmt.print("%-}\n");
        }
        if (gen.curUnit().lookupFcn(ParseUnit.INTRINSIC_PREFIX + "hibernate") == null) {
        	gen.aux.genTitle("pollen.hibernate(uint8 id)");
            gen.fmt.print("%tvoid %1pollen__hibernate__E(byte id) {\n%+", gen.cname());
            gen.fmt.print("%t/* empty default */\n");
            gen.fmt.print("%-}\n");
        }
              
        gen.aux.genTitle("main()");
        gen.fmt.print("int main() {\n%+");
        gen.fmt.print("%t%1pollen__reset__E();\n", gen.cname());
        for (UnitDesc ud : units) {
            if (ud.getUnit().lookupFcn("targetInit") != null) {
                genSingleFcnCall("targetInit", ud.getUnit());
            }
        }
        for (UnitDesc ud : units) {
            UnitNode u = ud.getUnit();
            if (u == gen.getMainUnit())
            	continue;
            if (u.lookupFcn("pollen_ready") != null) {
                gen.fmt.print("%t%1_pollen__ready__E();\n", u.getQualName().replace('.', '_'));
            }
        }
        gen.fmt.print("%t%1pollen__ready__E();\n", gen.cname());
        
        gen.fmt.print("%t%1pollen__run__E();\n", gen.cname());
        
        for (UnitDesc ud : units) {
            UnitNode u = ud.getUnit();
            if (u == gen.getMainUnit())
            	continue;
            if (u.lookupFcn("pollen_shutdown") != null) {
                gen.fmt.print("%t%1_pollen__shutdown__E();\n", u.getQualName().replace('.', '_'));
            }
        }
        gen.fmt.print("%t%1pollen__shutdown__E();\n", gen.cname());
        gen.fmt.print("%-}\n");
       
    }

    public void generate(Value.Arr unitsArr) {

        gen.aux.setHost(false);
        
        ParseUnit cur = ParseUnit.current();
        for (int i = 0; i < unitsArr.length(); i++) {
            Value.Obj uobj = unitsArr.getObj(i);
            UnitDesc ud;
            UnitNode u = cur.findUnit(uobj.getStr("$name"));
            if (uobj.getBool("pollen$used")) {
                ud = new UnitDesc(u, uobj, true);
                units.add(ud); // will get c code generated from these
            }
            else {
            	if (u.isComposition()) {
            		ud = new UnitDesc(u, uobj, true); // host only
            	}
            }
        }

        genPrologue();
        String part1 = gen.fmt.toString();
        gen.fmt.reset();
        
        genModules();
        genEpilogue();
        String part3 = gen.fmt.toString();
        gen.fmt.reset();

        genFwdAggs();
        String part2 = gen.fmt.toString();
        gen.fmt.reset();
        
        gen.fmt.append(part1);
        genFwdAggDecls();
        gen.fmt.append(part2);
        gen.fmt.append(part3);
    }

    private void genFldVals(DeclNode.Usr cls, Obj vobj, String name) {
    	
        gen.fmt.print("/* %1 obj init */\n", name);
        gen.fmt.print("%t{\n%+", name);
        for (DeclNode fld : cls.getFeatures()) {
        	if (fld instanceof DeclNode.Var) {
        		if (((DeclNode.Var)fld).isIntrinsic() &&  !((DeclNode.Var)fld).isIntrinsicUsed())
        			continue;
        		gen.fmt.print("%t");
        		genVal((ITypeSpec) fld, vobj.getAny(fld.getName()));
        		gen.fmt.print(",  /* %1 */\n", fld.getName());
        	}
        }
        gen.fmt.print("%-%t}");
    }

    private void genFwdAggs() {

        gen.aux.genTitle("forward aggregate values");
        ArrayList<FwdAgg> workList = new ArrayList<FwdAgg>();

        while (fwdAggList.size() > 0) {

            workList.clear();
            workList.addAll(fwdAggList);
            fwdAggDecls.addAll(fwdAggList);
            fwdAggList.clear();

            for (FwdAgg fwdagg : workList) {
                if (fwdagg.cls == null) {
                    gen.aux.genType(fwdagg.tarr, fwdagg.cname, fwdagg.vobj.getInt("$$len"));
                    Value.Arr varr = (Value.Arr) Value.toVal(fwdagg.vobj.getProp("$$elems")); 
                    TypeNode base = fwdagg.tarr.getBase();
                    if (fwdagg.vobj.getBool("$$virgin")) {
                        gen.fmt.print(";\n");
                        continue;
                    }
                    gen.fmt.print(" = {\n%+");
                    for (int i = 0; i < varr.length(); i++) {
                        gen.fmt.print("%t");
                        genVal(fwdagg.basecat, base, varr.getAny(i));
                        gen.fmt.print(",  /* [%1] */\n", i);
                    }
                    gen.fmt.print("%-%t};\n");
                    continue;
                }

//                if (fwdagg.cls.hasMethods()) {
//                    continue;
//                }
//                if (!fwdagg.cname.endsWith("__S")) {
//                    continue;
//                }
                gen.fmt.print("%1 %2 = ", fwdagg.tname, fwdagg.cname);
                genFldVals(fwdagg.cls, fwdagg.vobj, null);
                gen.fmt.print(";\n");
            }
        }
    }

    private void genFwdAggDecls() {
        gen.aux.genTitle("forward aggregate declarations");
        for (FwdAgg fwdagg : fwdAggDecls) {
            if (fwdagg.cls != null) {
                gen.fmt.print("%1 %2;\n", fwdagg.tname, fwdagg.cname);
            }
            else {
                gen.aux.genType(fwdagg.tarr, fwdagg.cname, Auxiliary.ARR_BRACKET);
                gen.fmt.print(";\n");
            }
        }
    }

    private void genModules() {

        for (UnitDesc ud : units) {

            UnitNode unit = ud.getUnit();

            gen.setupUnit(unit);
            
            if (unit.isTarget()) {
                genUnitDefs(unit, ud);
            }
        }
    }

    private void genPrologue() {
        gen.fmt.print("#define pollen__target_name %1\n", ParseUnit.current().getProperty(ITarget.P_NAME));       
        gen.fmt.print("#include <pollen.lang/std.h>\n\n");
        for (UnitDesc ud : units) {
      
            UnitNode unit = ud.getUnit();
            if (unit.isTarget()) {
                gen.setupUnit(unit);
                genProtocolMembers(unit, ud);
            }
        }
        gen.aux.genTitle("unit headers");
        for (UnitDesc ud : units) {
            UnitNode u = ud.getUnit();
            if (u.isTarget()) {
                gen.aux.genHeaderInclude(u.getQualName());
            }
        }
    }

    private void genProtocolMembers(UnitNode unit, UnitDesc ud) {
        
        for (DeclNode decl : unit.getFeatures()) {

            if (!(decl instanceof DeclNode.TypedMember)) {
                continue;
            }
            
            DeclNode.TypedMember protoMem = (DeclNode.TypedMember) decl;
            
            if (!(protoMem.isProtocolMember()))
            	continue;
            
            Object val = ud.getUnitObj().getAny(protoMem.getName());
   
            if (val == Value.UNDEF) {
            	
                if (protoMem.getBindLocUnit() != null) {
            		String qname = protoMem.getDefiningScope().getScopeName() + "." + protoMem.getName().getText();
            		UnitDesc udsc = unitDescs.get(protoMem.getBindLocUnit().getQualName());
            		val = udsc.getUnitObj().getAny(qname);
                }        
                if (val == Value.UNDEF) {
                	ParseUnit.current().reportError(protoMem.getName(), "protocol member has never been bound");
                	return;
                }
            }
            String qn;
            if (!(val instanceof NativeObject || val instanceof NativeArray)) {
            	return;
            	//qn = val.toString(); // A Double, for example
            }
            else 
            	qn = ((Value.Obj) Value.toVal(val)).getStr("$name");
            String pcn = gen.cname() + protoMem.getName() + '_';
            String dcn = qn.replace('.', '_') + '_';
            gen.aux.genTitle("protocol member " + gen.curUnit().getQualName() + '.' + protoMem.getName() + " delegates " + qn);
            gen.aux.genHeaderInclude(qn);
            genProtocolMemDefines(protoMem.getTypeUnit(), pcn, dcn);
        }
    }
    
    private void genProtocolMemDefines(UnitNode protocol, String pcn, String dcn) {
        
    	for (DeclNode idecl : protocol.getFeatures()) {

            if (idecl.isHost()) {
                continue;
            }

            gen.fmt.print("#define %3%1%2 %4%1%2\n", idecl.getName(), gen.aux.mkSuf(idecl), pcn, dcn);
            
            if (idecl instanceof DeclNode.Usr) {
            	if (((DeclNode.Usr) idecl).isEnum()) {
            		for (DeclNode.EnumVal ev : ((DeclNode.Usr) idecl).getVals()) {
            			gen.fmt.print("#define %3%1%2 %4%1%2\n", ev.getName(), "", pcn, dcn);
            		}
            	}
            }
        }
    }
    
    private void genSingleFcnCall(String fcnName, UnitNode un) {
    	UnitNode u = un.getUnit();
    	List<DeclNode.Fcn> fl = u.lookupFcn(fcnName);
    	DeclNode.Fcn f = fl.get(0);
    	String suf = f.isPublic() ? "E" : "I";

    	if (u.lookupFcn(fcnName) != null) {
    		gen.fmt.print("%t%1_%2__" + suf + "();\n", u.getQualName().replace('.', '_'), gen.aux.mkPollenCname(fcnName));
    	}

    }

    private void genHostVal(UnitDesc ud, DeclNode.Var decl) {
    	
    	if (!decl.isHost())
    		return;

        Object val = ud.getUnitObj().getAny(decl.getName());
        if (val == Value.UNDEF) {
            ParseUnit.current().reportError(decl.getName(), "host variable has never been assigned");
            return;
        }
        
        gen.fmt.print("const ");
        
        gen.fmt.print("%1__TYPE %1%2", gen.cname() + decl.getName(), gen.aux.mkSuf(decl));
        if (decl instanceof DeclNode.Arr) {
        	for (ExprNode e : ((DeclNode.Arr)decl).getDim().getElems()) {
        		gen.fmt.print("[]");
        	}
        }
        gen.fmt.print(" = ");
        genVal(decl, val);
        gen.fmt.print(";\n");
    }

    private void genUnitDefs(UnitNode unit, UnitDesc ud) {
    	boolean title = false;
    	
        for (DeclNode decl : unit.getFeatures()) {
            switch (decl.getType()) {
             case pollenParser.D_VAR:
             case pollenParser.D_ARR:
            	DeclNode.Var v = (DeclNode.Var) decl;
            	if (v.isIntrinsic() && !v.isIntrinsicUsed())
            		continue;
            	if (v.isHost()) {
        			if (!title) {
        				gen.aux.genTitle("host data definitions (unit " + unit.getName().getText() + ")");
        				title = true;
        			}
            		genHostVal(ud, v);
            	}
                break;
            }
        }
    	String n = gen.cname();
		
    	if (!unit.isClass()) {
    		gen.aux.genTitle("target data definitions (unit " + unit.getName().getText() + ")");

    		gen.fmt.print("struct %1 %2 = { %3\n", n, n.substring(0, n.length()-1), "/* module data */");
    		gen.fmt.print("%+");

    		for (DeclNode decl : unit.getFeatures()) {
    			switch (decl.getType()) {
    			case pollenParser.D_VAR:
    			case pollenParser.D_ARR:
    				DeclNode.Var v = (DeclNode.Var) decl;
    				if (v.isIntrinsic() && !v.isIntrinsicUsed())
    					continue;
    				if (!v.isHost()) {
    					gen.fmt.print("%t");
    					genUnitVar(ud, v);
    				}

    				break;
    			}
    		}
    		gen.fmt.print("%-};\n");
    	}
    }

    private void genUnitVar(UnitDesc ud, DeclNode.Var decl) {

    	String n =  decl.getName().getText();
        Object obj = ud.getUnitObj().getAny(n);
        if (obj == Value.UNDEF) {
            ParseUnit.current().reportError(decl.getName(), "private variable has never been assigned");
            return;
        }
        
        //if (ud.unit.isClass())
        //	return;

        Object val = Value.toVal(obj);
        
        // Now this is initializing fields of structs (values embedded in {}). Name assignments not needed.
//        String cname = gen.cname() + decl.getName() + gen.aux.mkSuf(decl);        
//        gen.aux.genType(decl.getTypeSpec(), cname);
//        gen.fmt.print(" = ");

        
        if (decl instanceof DeclNode.TypedMember && ((DeclNode.TypedMember) decl).isProtocolMember()) {


        	if (((TypedMember) decl).getBindLocUnit() != ud.getUnit()
        			&& ((TypedMember) decl).getBindLocUnit() != null) {
        		
        		// Get the binding from the bind unit
        		
        		String qname = decl.getDefiningScope().getScopeName() + "." + decl.getName().getText();
        		UnitDesc udsc = unitDescs.get(((TypedMember) decl).getBindLocUnit().getQualName());
        		if (udsc != null) {
        			obj = udsc.getUnitObj().getAny(qname);
        			val = Value.toVal(obj);
        		}
//        		else {
//        			udsc = unitDescs.get(((TypedMember) decl).getBindToUnit().getQualName());
//        			obj = udsc.getUnitObj().getAny(((TypedMember) decl).getBindToUnit().getQualName());
//        			val = Value.toVal(obj);
//
//        			
//        		}
        		
        	}
        	gen.fmt.print("&");        	
        }
        genVal(decl, val);
    	gen.fmt.print(",\n");
    }
    
    private void genVal(Cat cat, TypeNode cast, Object val) {
        Object vobj = Value.toVal(val);
        cast = cast.toRaw();
        if (vobj == null) {
        	gen.fmt.print("null");
        }
        else if (vobj instanceof Value.Obj && "$$Ref".equals(((Value.Obj) vobj).getProp("$$category"))) {
            gen.fmt.print("(");
            gen.aux.genType(cast, null);
            gen.fmt.print(")&%1", ((Value.Obj) vobj).getStr("$$text"));
        }
        else if (val instanceof String) {
        	if (cat instanceof Cat.Agg) {
        		gen.fmt.print("%1", val.toString());
        	}
        	else
        		gen.fmt.print("\"%1\"", val.toString());
        }
        else if (cat instanceof Cat.Scalar) {
            if (val instanceof Number) {
                genValNum(cast, (Number) val);
            }
            else {
                gen.fmt.print("%1", val.toString());
            }
        }
        else if (cat instanceof Cat.Agg) {
        	if (val instanceof Number)
        		vobj = null;
            genValAgg((Cat.Agg) cat, cast, (Value.Obj) vobj);
        }
        else if (cat instanceof Cat.Arr) {
            genValArr((Cat.Arr) cat, (TypeNode.Arr) cast, vobj);
        }
        else {
            System.err.println("genVal: " + cat + ' ' + vobj);
        }
    }
    
    private void genVal(DeclNode.ITypeSpec decl, Object val) {
		genVal(decl.getTypeCat(),
				(decl instanceof DeclNode.Arr ? ((DeclNode.Arr) decl)
						.getTypeArr() : decl.getTypeSpec()), val);
    }

    private void genValAgg(Cat.Agg cat, TypeNode cast, Value.Obj vobj) {
        
        if (vobj == null) {
            gen.fmt.print("null");
            return;
        }
        
         
        ISymbolNode is =  (ISymbolNode) cat.aggScope();
        if (is instanceof UnitNode)
        	is = ((UnitNode)is).getUnitType();
        if (cat.isStaticRef() && cast instanceof TypeNode.Usr) {
        	// 'new' on a module member: get the type
        	TypeNode.Usr t = (Usr) cast;
        	is = (t != null) ? t.getSymbol().node() : null;
        }
		if (is instanceof ImportNode) 
			is = ((ImportNode) is).getUnit().getUnitType();
        
        DeclNode.Usr struct = (DeclNode.Usr) is;
        
        String name = vobj.getStr("$$uname");  
        if (name.isEmpty())
        	ParseUnit.current().reportError(gen.curUnit(), "javascript problem for " + struct.getName());

        genFldVals(struct, vobj, name);

        
    }
    
    private void genValArr(Cat.Arr cat, TypeNode.Arr tarr, Object val) {

        Value.Arr varr = null;
        Value.Obj vobj = null;
        
        if (val instanceof Value.Obj && "$$Array".equals(((Value.Obj) val).getProp("$$category"))) {
            vobj = (Value.Obj) val;
            varr = (Value.Arr) Value.toVal(vobj.getProp("$$elems")); 
        }
        else if (val instanceof Value.Arr) {
            varr = (Value.Arr) val;
        }
        if (varr == null) {
            return;
        }

        if (vobj != null && !tarr.hasDim()) {
            int len = vobj.getInt("$$len");
			if (len == 0) {
				gen.fmt.print("null");
				return;
			}
            String cname = vobj.getStr("$$cname");
            cname = cname.replace("[", "__");
            cname = cname.replace("]", "__");
            cname = cname.replace(".", "__");
            gen.fmt.print("(void*)%1", cname);
            if (!fwdAggNames.contains(cname)) {
                FwdAgg fwarr = new FwdAgg();
                fwarr.cname = cname;
                fwarr.tarr = tarr;
                fwarr.basecat = cat.getBase();
                fwarr.vobj = vobj;
                fwdAggNames.add(cname);
                fwdAggList.add(fwarr);
            }
            return;
        }
        
        TypeNode base = tarr.getBase();
        gen.fmt.print("{\n%+");
        if (varr.length() > 0) {
            for (int i = 0; i < varr.length(); i++) {
                gen.fmt.print("%t");
                genVal(cat.getBase(), base, varr.getAny(i));
                gen.fmt.print(",  /* [%1] */\n", i);
            }
        }
        else {
            gen.fmt.print("%t0  /* empty */\n");
        }
        gen.fmt.print("%-%t}");
    }
    
    private void genValNum(TypeNode cast, Number num) {
        long lg = num.longValue();
        double d = num.doubleValue();
        gen.fmt.print("(");
        gen.aux.genType(cast, null);
        gen.fmt.print(")");
        if (d != lg) {
            gen.fmt.print("%1", num);
        }
        else if (lg < 0) {
            gen.fmt.print("(-0x%1 - 1)", Long.toHexString(-(lg+1)));
        }
        else {
            gen.fmt.print("0x%1", Long.toHexString(lg));
        }
    }
}
