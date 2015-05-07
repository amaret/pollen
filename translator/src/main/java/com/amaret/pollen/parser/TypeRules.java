package com.amaret.pollen.parser;

import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.amaret.pollen.parser.Cat.Agg;
import com.amaret.pollen.parser.Cat.Arr;
import com.amaret.pollen.parser.DeclNode.ITypeKind;
import com.amaret.pollen.parser.DeclNode.TypedMember;

/**
 * @author lucidbee (Megan Adams)
 */

public class TypeRules {
	private static final int OP_ADD     = 0x1;
	private static final int OP_ASSIGN  = 0x2;
	private static final int OP_BOOL    = 0x4;
	private static final int OP_COND    = 0x8;
	private static final int OP_EQ      = 0x10;
	private static final int OP_INC     = 0x20;
	private static final int OP_MULT    = 0x40;
	private static final int OP_PADD    = 0x80;
	private static final int OP_PSUB    = 0x100;
	private static final int OP_SADD    = 0x200;
	private static final int OP_SEL     = 0x400;
	private static final int OP_SHIFT   = 0x800;
	private static final int OP_REL     = 0x1000;

	private static final int HOST_DOMAIN = 0x1;
	private static final int TARG_DOMAIN = 0x2;

	private static final HashMap<String,Integer> bryOpTab = new HashMap<String,Integer>();
	private static final HashMap<String,Integer> uryOpTab = new HashMap<String,Integer>();

	private static class Rule {
		int opKinds;
		Pattern pat;
		String result;
		int domain;
	}

	private static Rule binaryRules[];
	private static Rule unaryRules[];

	private static Rule mkBinary(int opKinds, String left, String right, String result) {
		return mkBinary(opKinds, left, right, result, HOST_DOMAIN|TARG_DOMAIN);
	}

	private static Rule mkBinary(int opKinds, String left, String right, String result, int domain) {
		Rule rule = new Rule();
		rule.opKinds = opKinds;
		rule.pat = Pattern.compile("^(" + left + ")#(" + right + ")$");
		rule.result = result;
		rule.domain = domain;
		return rule;
	}
	private static Rule mkUnary(int opKinds, String rand, String result) {
		return mkUnary(opKinds, rand, result, HOST_DOMAIN|TARG_DOMAIN);
	}

	private static Rule mkUnary(int opKinds, String rand, String result, int domain) {
		Rule rule = new Rule();
		rule.opKinds = opKinds;
		rule.pat = Pattern.compile("^(" + rand + ")$");
		rule.result = result;
		rule.domain = domain;
		return rule;
	}

	static Cat checkBinary(String op, Cat left, Cat right) {
		
		if (left == null || right == null) {
			return Cat.fromError("expr problem", left, right);
		}		
		
		Cat rtn =  checkBinary(op, left, right, "operand type error");
		@SuppressWarnings("unused")
		boolean dbg = false;
		if (rtn instanceof Cat.Error) {
			if (op.equals("=") || op.equals("==")) {
				if (left.isScalarNotVoid() && right.isScalarNotVoid())
					((Cat.Error) rtn).setWarning(true);
			}
			dbg = true;
		}
		
		return rtn;
	}

	static Cat checkBinary(String op, Cat left, Cat right, String err) {
		
		if (left.isFcnRef() && right.isClassFcn()) {
			return mkResult(null, left, right, "class function references are not implemented");
		}
		
		if (right instanceof Cat.Fcn && !(left instanceof Cat.Fcn)) {
			right = ((Cat.Fcn)right).retCat();
		}
		if (left instanceof Cat.Fcn && !(right instanceof Cat.Fcn)) {
			left = ((Cat.Fcn)left).retCat();
		}

		String r = right.mkCode();
		String l = left.mkCode();
		
		if (r.charAt(0) == 'V' && l.charAt(0) == 'A') {
			// assigning a dimensioned array to one w/out dimensions
			left = ((Cat.Arr) left).getBase();
		}
		if (right instanceof Cat.Arr && r.charAt(0) == 'V') {
			right = ((Cat.Arr) right).getBase();	
			r = right.mkCode();
		}

		boolean leftAgg = left.mkCode().charAt(0) == 'C' || left.mkCode().charAt(0) == 'X';
		if (leftAgg) {
			boolean rightAgg = right.mkCode().charAt(0) == 'C' || right.mkCode().charAt(0) == 'X';
			if (leftAgg && rightAgg) {
				
				if (left.mkCode().substring(1).equals(right.mkCode().substring(1)))			
					// No difference in this context between C and X
					r = r.replaceFirst("^.", left.mkCode().substring(0, 1));
				else
					return mkResult(null, left, right, err); // unit/class types must match exactly
				
			}
		}
		l = left.mkCode();
		if (l.charAt(0) == 'V' && r.charAt(0) != 'V' && l.length() > 1) {
			l = l.substring(1); // check assign of array element to value			
		}
				

		String codes = l + '#' + r;
		String res = null;
		int opKinds = bryOpTab.get(op);
		if ((opKinds & OP_ASSIGN) != 0 && (opKinds & ~OP_ASSIGN) != 0) {
			res = matchRules(opKinds & ~OP_ASSIGN, codes, binaryRules);
			if (res == null) {
				return mkResult(res, left, right, err);
			}
			opKinds = OP_ASSIGN;
			codes = left.mkCode() + '#' + left.mkCode();
		}
		
		Cat rtn =  mkResult(matchRules(opKinds, codes, binaryRules), left, right, err);
		
		if (rtn instanceof Cat.Error && (op.equals("=") || op.equals("=="))) {
			if (left.isScalarNotVoid() && right.isScalarNotVoid())
				((Cat.Error) rtn).setWarning(true);
		}
		
		return rtn;
	}
	static private String matchRules(int opKinds, String codes, Rule[] rules) {
		int domain = ParseUnit.current().getCurrUnitNode().isHostScope() ? HOST_DOMAIN : TARG_DOMAIN;
		
		for (Rule rule : rules) {
			if ((rule.opKinds & opKinds) != 0 && (rule.domain & domain) != 0) {
				
				Matcher m = rule.pat.matcher(codes);				
				if (m.matches()) {
					return rule.result;
				}
			}
		}
		return null;
	}

	static private Cat mkResult(String result, Cat cat1, Cat cat2, String err) {
		if (result == null) {
			return Cat.fromError(err, cat1, cat2);
		}
		if (result.equals("$1")) {
			return cat1;
		}
		if (result.equals("$2")) {
			return cat2;
		}
		return Cat.fromScalarCode(result);
	}


	   static Cat checkUnary(String op, Cat rand) {
	        return checkUnary(op, rand, "operand type error");
	   }



	static Cat preCheck(Cat cat1) {
		return preCheck(cat1, null);
	}

	static Cat preCheck(Cat cat1, Cat cat2) {
		if (cat1 != null && (cat1 == Cat.INJECT || cat1 == Cat.UNKNOWN || cat1 instanceof Cat.Error)) {
			return cat1;
		}
		if (cat2 != null && (cat2 == Cat.INJECT || cat2 == Cat.UNKNOWN || cat2 instanceof Cat.Error)) {
			return cat2;
		}
		if (cat1 == null && cat2 == null) {
			return Cat.UNKNOWN;
		}
		return null;
	}

    static void checkInit(Cat declCat, ExprNode init) {
        checkInit(declCat, init, init.getCat(), false);
    }
    static private void checkInit(Cat declCat, ExprNode init, boolean genArgs) {
    	checkInit(declCat, init, init.getCat(), genArgs);
    }
    static void checkInit(Cat declCat, ExprNode init, Cat initCat, boolean genArgs)	{
           
        if (preCheck(declCat, initCat) != null) {
            return;
        }
        if (init instanceof ExprNode.Hash) {
            checkInitHash(declCat, (ExprNode.Hash) init, genArgs);
            return;
        }
        if (init instanceof ExprNode.Vec) {
            checkInitVec(declCat, (ExprNode.Vec) init, genArgs);
            return;
        }
        Cat resCat = checkBinary("=", declCat, initCat, "initialization type mismatch");
        if (resCat instanceof Cat.Error) {
        	if (declCat.isAggTyp() && ((Cat.Agg)declCat).aggScope() instanceof DeclNode) { // error message with name & linenum
        		IScope d = ((Cat.Agg)declCat).aggScope();
        		if (d instanceof ITypeKind && ((ITypeKind)d).isEnum()) {
        			// serious because it can cause javascript abort
        			ParseUnit.current().reportSeriousError( ((DeclNode)d).getName(), "illegal initialization type for enum");
        		}
        		else 
        			ParseUnit.current().reportError( ((DeclNode)d).getName(), ((Cat.Error) resCat).getMsg());
        	}
        	else 
        		ParseUnit.current().reportError(init, ((Cat.Error) resCat).getMsg());
        }
    }
    static private void checkInitHash(Cat declCat, ExprNode.Hash init, boolean genArgs) {
        ParseUnit ses = ParseUnit.current();
        if (!(declCat instanceof Cat.Agg)) {
            ses.reportError(init, "expecting a value of type <" + declCat.mkType() + ">");
            return;
        }

    }

    static private void checkInitVec(Cat declCat, ExprNode.Vec init, boolean genArgs) {
        if (!(declCat instanceof Cat.Arr)) {
            ParseUnit.current().reportError(init, "expecting a value of type <" + declCat.mkType() + ">");
            return;
        }
        Cat baseCat = ((Cat.Arr) declCat).getBase();
        for (ExprNode val : init.getVals()) {
            checkInit(baseCat, val, genArgs);
        }
        if (!genArgs) {
            init.setCat(declCat);
        }
    }
    /**
     * Check operands of binding operator.           
     * @param target_cat
     * @param src
     * @return true for okay, else false
     */
    public static Cat checkBind(Cat target_cat, TypeNode src) {

    	boolean ok = true;
    	
    	if (target_cat == null || src == null) {
    		return null;
    	}
    	String targn = (target_cat instanceof Cat.Agg) ? "\'" + ((Cat.Agg)target_cat).aggName() + "\' : " : "";
    	if (!(target_cat instanceof Cat.Agg) || !((Cat.Agg)target_cat).isProtocolMember()) {
    		ParseUnit.current().reportError(src, targn + "LHS of binding operator assignment must be a protocol member");
    		ok = false;
    	}

    	Cat src_cat = null;

    	src_cat = Cat.fromType(src); 
    	if (!src_cat.isModule()) {
    		// if this is 'from composition import mod' then the Cat 
    		// will be for the composition. get Cat for mod.
    		if (src_cat instanceof Cat.Agg && ((Agg) src_cat).aggScope() instanceof UnitNode
    				&& src instanceof TypeNode.Usr) {
    			SymbolEntry s = ((com.amaret.pollen.parser.TypeNode.Usr) src).getSymbol();
    			if (s.node() instanceof ImportNode) {
    				UnitNode u = ((ImportNode) s.node()).getUnit();
    				SymbolEntry s2 = u.lookupName(((ImportNode) s.node()).getUnitName().getText());
    				src_cat = (s2 != null) ? Cat.fromSymbolNode(s2.node(), s2.scope()) : src_cat;
    			}
    		}
    		else
    			ok = false;
    	}

    	// for compositions, need to pollen.use these imported units
    	// if they are used as a bind target.
    	UnitNode cur = ParseUnit.current().getCurrUnitNode();
    	if (cur.isComposition()) {
    		SymbolEntry s = ((TypeNode.Usr) src).getSymbol();
    		ISymbolNode n = (s != null) ? s.node() : null;
    		if (n != null && n instanceof ImportNode) {       				
    			for (ImportNode imp : cur.getImports()) {
    				if (imp == n) {
    					imp.setProtocolBindTarget(true);
    					break;
    				}
    			}
    		}
    	}

    	String srcn = "\'" + src.getName().getText() + "\': ";
    	if (!src_cat.isModule()) {
    		ParseUnit.current().reportError(src, srcn + "RHS of binding operator assignment must be a module");    
    		ok = false;
    	}
    	// check that a protocol is being bound to a module
    	// in either a host fcn or a module body
       	SymbolTable symtab = ParseUnit.current().getSymbolTable();
		boolean scopeOk = (symtab.curScope() instanceof DeclNode.Usr && ((DeclNode.Usr) symtab
				.curScope()).isModule()) || symtab.currScopeIsHostFcn();
       	if (!scopeOk) {
			ParseUnit.current().reportError(src, targn + "Protocol member binding can only occur in the body of a module or in a host function");     
       	}    
       	return (ok && scopeOk) ? src_cat : null;
    }
 
    /**
     * 
     * @param target DeclNode of the target of the peg operation
     * @param src_cat Cat of the  source of the peg operation
     * @param errorNode The node that should get the error message (line number)
     */
    public static void checkPeg(BaseNode target, Cat src_cat, BaseNode errorNode) {
    	if (target == null) {
    		return; 
    	}  		
    	if (target instanceof DeclNode) {
    		if (((DeclNode)target).isPeggedOnDcln() && ((DeclNode)target).isHost())	{
    			ParseUnit.current().reportSeriousError(target, "A host variable cannot be pegged on its declaration");
    		}
    	}
    	if (!(target instanceof DeclNode.TypedMember || target instanceof DeclNode.Arr)) {
			ParseUnit.current().reportError(errorNode, "LHS of pegging operator assignment must be a typed member");   
    	}
    	else if (target instanceof DeclNode.TypedMember) {
    		DeclNode.TypedMember t = (TypedMember) target;
    		if (!t.isClassRef())
    			ParseUnit.current().reportError(errorNode, "LHS of pegging operator assignment must be a reference to a class");   
    		if (t.isHost())
    			ParseUnit.current().reportError(errorNode, "LHS of pegging operator assignment cannot be a host data member");   
    	}
    	if (src_cat.code().equals("s"))
    		return;
    	if (!(src_cat instanceof Cat.Arr)) {
    		ParseUnit.current().reportError(errorNode, "RHS of pegging operator assignment must be an array expression or a string"); 
    	} else {
    		Cat cb = ((Arr) src_cat).getBase();
    		boolean errorFlag = false;
    		if (!(cb instanceof Cat.Scalar)) {
    			errorFlag = true;
    		} else {
    			if (((Cat.Scalar)cb).rank() != 1)
    				errorFlag = true;
    		}
    		if (errorFlag)
        		ParseUnit.current().reportError(errorNode, "RHS of pegging operator assignment must be an array with element type of uint8, int8, or byte");        		       		
    	}
    	
    }

	public static void checkImplements(DeclNode.Usr implementor, SymbolEntry protocol) {

		UnitNode unit = protocol.node() instanceof ImportNode ? ((ImportNode) protocol.node()).getUnit() : null;
		DeclNode.Usr p = unit.getUnitType();
		
		if (p == null || !p.isProtocol()) {
			ParseUnit.current().reportError((BaseNode) protocol.node(), "implements clause requires a protocol");
			return;
		}
		UnitNode protoUnit = (UnitNode) p.getUnit();
		UnitNode implemUnit = (UnitNode) implementor.getUnit();
		String pfcnName;		
		for (List<DeclNode.Fcn> protoUnitFcnLst : protoUnit.getFcnMap().values()) {
			boolean matchSig = false;
			@SuppressWarnings("unused")
			boolean dbg = false;
			
			implemUnit = (UnitNode) implementor.getUnit();
			next:
			for (DeclNode.Fcn protoUnitFcn : protoUnitFcnLst) {
				pfcnName = protoUnitFcn.getName().getText();
				Cat pfc = null;		
				boolean matchName = false;
				while (implemUnit != null) {
					implemUnit.getFcnMap().get(protoUnitFcn.getName().getText());
					for (String implemUnitFcnName : implemUnit.getFcnMap().keySet()) {	
						if (implemUnitFcnName.equals(ParseUnit.CTOR_MODULE_HOST))
							continue;
//						if (dbg)
//							ParseUnit.current().reportError(implemUnit, "checkImplements names (imple " + implemUnit.getName() + ", proto " + protoUnit.getName() + "): " + implemUnitFcnName + ", " + protoUnitFcn.getName().getText());

						if (implemUnitFcnName.equals(protoUnitFcn.getName().getText())) {
							matchName = true;
							for (DeclNode.Fcn ifd : implemUnit.getFcnMap().get(implemUnitFcnName)) {
								Cat ifc = new Cat.Fcn(ifd, ifd.getEnclosingScope());
								if (pfc == null)
									pfc = new Cat.Fcn(protoUnitFcn, protoUnitFcn.getEnclosingScope());
								if (ifc.sigString() != null && ifc.sigString().equals(pfc.sigString())) {
									matchSig = true;
									break;
								}							
							}
							if (!matchSig) {
								String more = (pfcnName.isEmpty()) ? "" : " ('" + pfcnName + "' has signature mismatch)" ;
								ParseUnit.current().reportError((BaseNode) protocol.node(), "all functions in protocol \'" + protocol.node().getName().getText() + "\' must be implemented with identical signatures" + more);
							}
							if (matchName && matchSig)
								continue next;
						}	

					}
					if (!matchName) // check base unit
						implemUnit = implemUnit.getUnitType().getBaseType() == null ? null
							: implemUnit.getUnitType().getBaseType().getUnit();
					else implemUnit = null;
				}
				if (!matchName) {
					String more = (pfcnName.isEmpty()) ? "" : " ('" + pfcnName + "' not found)" ;
					ParseUnit.current().reportError((BaseNode) protocol.node(), "all functions in protocol \'" + protocol.node().getName().getText() + "\' must be implemented" + more);
					return;
				}				
			}		
		}

	}

    static Cat checkUnary(String op, Cat operand, String err) {
        String code = operand.mkCode();

        if (op.equals("*")) {
            if (code.startsWith("s")) {
                return Cat.fromScalarCode(Cat.UINT8);
            }
            return mkResult(null, operand, null, err);
        }
        int opKinds = uryOpTab.get(op);
        Cat rtn = mkResult(matchRules(opKinds, code, unaryRules), operand, null, err);
        
        return rtn;
    }

	static {

		// OP_PADD, OP_PSUB are pointer ops. 
		// OP_SADD is a string addition.
		
		bryOpTab.put("=",   OP_ASSIGN);
		bryOpTab.put("+=",  OP_ASSIGN|OP_ADD|OP_PADD);
		bryOpTab.put("-=",  OP_ASSIGN|OP_ADD|OP_PSUB);
		bryOpTab.put("*=",  OP_ASSIGN|OP_MULT);
		bryOpTab.put("/=",  OP_ASSIGN|OP_MULT);
		bryOpTab.put("%=",  OP_ASSIGN|OP_MULT);
		bryOpTab.put("<<=", OP_ASSIGN|OP_SHIFT);
		bryOpTab.put(">>=", OP_ASSIGN|OP_SHIFT);
		bryOpTab.put("&=",  OP_ASSIGN|OP_BOOL);
		bryOpTab.put("^=",  OP_ASSIGN|OP_BOOL);
		bryOpTab.put("|=",  OP_ASSIGN|OP_BOOL);
		bryOpTab.put("+",   OP_ADD|OP_PADD|OP_SADD);
		bryOpTab.put("-",   OP_ADD|OP_PSUB);
		bryOpTab.put("*",   OP_MULT);
		bryOpTab.put("/",   OP_MULT);
		bryOpTab.put("%",   OP_MULT);
		bryOpTab.put("<<",  OP_SHIFT);
		bryOpTab.put(">>",  OP_SHIFT);
		bryOpTab.put("&",   OP_BOOL);
		bryOpTab.put("^",   OP_BOOL);
		bryOpTab.put("|",   OP_BOOL);
		bryOpTab.put("==",  OP_EQ);
		bryOpTab.put("!=",  OP_EQ);
		bryOpTab.put("<",   OP_REL);
		bryOpTab.put(">",   OP_REL);
		bryOpTab.put("<=",  OP_REL);
		bryOpTab.put(">=",  OP_REL);
		bryOpTab.put("||",  OP_COND);
		bryOpTab.put("&&",  OP_COND);

		uryOpTab.put("+",   OP_ADD);
		uryOpTab.put("-",   OP_ADD);
		uryOpTab.put("~",   OP_BOOL);
		uryOpTab.put("!",   OP_COND);
		uryOpTab.put("++",  OP_INC);
		uryOpTab.put("--",  OP_INC);
		uryOpTab.put("S",   OP_SEL);

		binaryRules = new Rule[] {
				
				
				// $1 or $2 identifies whether the src or targ cat is the cat of the result

				mkBinary(OP_ASSIGN, "b|n", "b|n", "$1"),
				mkBinary(OP_ASSIGN, "x.+", "F.+|v|x.+", "$1"),				
				mkBinary(OP_ASSIGN, "u.+", "FA\\1", "$1"),
				mkBinary(OP_ASSIGN, "i.+", "FA\\1", "$1"),
				mkBinary(OP_ASSIGN, "f", "FA\\1", "$1"),
				mkBinary(OP_ASSIGN, "C.+|X.+", "C.+|X.+|v", "$1"),
				mkBinary(OP_ASSIGN, "s|F.+|A.+", "\\1|v", "$1"),
				mkBinary(OP_ASSIGN, "A.+", "\\1", "$1"),
				mkBinary(OP_ASSIGN, "A(.+)", "V\\2", "$1"),
				mkBinary(OP_ASSIGN, "s", "u1", "$1"),

				
				// p, r, P, R, ua, ui unused currently.
				//mkBinary(OP_ASSIGN, "u4", "ua", "$1"),
				//mkBinary(OP_ASSIGN|OP_ADD|OP_MULT, "ia", "ia|i0|n", "$1"),
				//mkBinary(OP_ADD|OP_MULT, "n|ia|i0", "ia", "$2"),
				//mkBinary(OP_ASSIGN|OP_ADD|OP_MULT|OP_BOOL, "ua", "n|ua", "$1"),
				//mkBinary(OP_ADD|OP_MULT|OP_BOOL, "n|ua", "ua", "$2"),
				//mkBinary(OP_ASSIGN, "p|r|s|P.+|F.+|R.+|A.+", "\\1|v", "$1"),
				//mkBinary(OP_ASSIGN, "p", "p|s|v|P.+|R.+", "$1"),
				//mkBinary(OP_ASSIGN, "r", "R.+|S.+", "$1"),
				//mkBinary(OP_ASSIGN, "s", "Pu1", "$1"),
				//mkBinary(OP_ASSIGN, "R(.+)", "\\2", "$1"),
				//mkBinary(OP_ASSIGN, "R(.+)", "r", "$1"),
				//mkBinary(OP_PADD, "p|s|P.+", "n|i0|i1|i2|i4|u1|u2|u4", "$1", TARG_DOMAIN),
				//mkBinary(OP_PSUB, "p|s|P.+", "\\1", "n", TARG_DOMAIN),
				//mkBinary(OP_EQ|OP_REL, "i0|i1|i2|i4|ia|u1|u2|u4|ua|b", "\\1|n", "b"),
				//mkBinary(OP_EQ|OP_REL, "n", "i0|i1|i2|i4|ia|u1|u2|u4|ua|b", "b"),
				//mkBinary(OP_EQ|OP_REL, "i0|i1|i2|i4|ia|u1|u2|u4|ua|b", "\\1|n", "b"),
				//mkBinary(OP_EQ|OP_REL, "i0|i1|i2|i4|ia", "i0|i1|i2|i4|ia", "b"),
				//mkBinary(OP_EQ|OP_REL, "p|s|P.+|F.+", "\\1", "b", TARG_DOMAIN),
				//mkBinary(OP_EQ, "x.+|C.+", "F.+|v", "b"),
				//mkBinary(OP_EQ, "p|s|X.+|A.+|P.+|F.+|R.+", "v", "b"),
				//mkBinary(OP_EQ, "v", "p|s|X.+|A.+|P.+|F.+|R.+", "b"),
				//mkBinary(OP_EQ, "A.+|R.+", "\\1", "b"),
				
				mkBinary(OP_ASSIGN|OP_ADD|OP_MULT, "i0", "i0|n", "$1"),
				mkBinary(OP_ASSIGN|OP_ADD|OP_MULT, "i1", "i0|i1|n", "$1"),
				mkBinary(OP_ASSIGN|OP_ADD|OP_MULT, "i2", "i0|i1|i2|n", "$1"),
				mkBinary(OP_ASSIGN|OP_ADD|OP_MULT, "i4", "i0|i1|i2|i4|n|u1|u2|u4", "$1"),
				
				mkBinary(OP_ADD|OP_MULT, "i0|i1|n", "i1", "$2"),
				mkBinary(OP_ADD|OP_MULT, "i0|i1|i2|n", "i2", "$2"),
				mkBinary(OP_ADD|OP_MULT, "i0|i1|i2|i4|n", "i4", "$2"),
				mkBinary(OP_ADD|OP_MULT, "i0|i1|i2|i4|n|u1|u2|u4", "i4", "$2"),


				mkBinary(OP_ASSIGN|OP_ADD|OP_MULT|OP_BOOL, Cat.UINT8, "n|u1|u2|u4", "$1"),
				mkBinary(OP_ASSIGN|OP_ADD|OP_MULT|OP_BOOL, "u2", "n|u1|u2|u4", "$1"),
				mkBinary(OP_ASSIGN|OP_ADD|OP_MULT|OP_BOOL, "u4", "n|u1|u2|u4|i1|i2|i4", "$1"),

				mkBinary(OP_ADD|OP_MULT|OP_BOOL, "n|u1", Cat.UINT8, "$2"),
				mkBinary(OP_ADD|OP_MULT|OP_BOOL, "n|u1|u2", "u2", "$2"),
				mkBinary(OP_ADD|OP_MULT|OP_BOOL, "n|u1|u2|u4", "u4", "$2"),
				mkBinary(OP_ADD|OP_MULT|OP_BOOL, "n", "n", "$1"),
				
				// float
				mkBinary(OP_ASSIGN|OP_ADD|OP_MULT, "f", "i0|i1|i2|i4|n|f", "$1"),
				mkBinary(OP_ADD|OP_MULT, "i0|i1|i2|i4|n|f", "f", "$2"),
				mkBinary(OP_ASSIGN|OP_ADD|OP_MULT|OP_BOOL, "f", "n|u1|u2|u4|f", "$1"),
				mkBinary(OP_ADD|OP_MULT|OP_BOOL, "n|u1|u2|u4|f", "f", "$2"),

				mkBinary(OP_SADD, "s", "s", "$1", HOST_DOMAIN),

				mkBinary(OP_COND, "b", "b", "b"),

				mkBinary(OP_EQ|OP_REL, "i0|i1|i2|i4|u1|u2|u4|b|f", "\\1|n", "b"),
				mkBinary(OP_EQ|OP_REL, "n", "i0|i1|i2|i4|u1|u2|u4|b|f", "b"),
				mkBinary(OP_EQ|OP_REL, "i0|i1|i2|i4|u1|u2|u4|b|f", "\\1|n", "b"),
				mkBinary(OP_EQ|OP_REL, "i0|i1|i2|i4", "i0|i1|i2|i4", "b"),
				mkBinary(OP_EQ|OP_REL, "u1|u2|u4", "u1|u2|u4", "b"),
				mkBinary(OP_EQ|OP_REL, "f", "f", "b"),
				mkBinary(OP_EQ|OP_REL, "n", "n", "b"),
				mkBinary(OP_EQ|OP_REL, "s", "s", "b", HOST_DOMAIN),
				mkBinary(OP_EQ|OP_REL, "s|F.+", "\\1", "b", TARG_DOMAIN),

				mkBinary(OP_EQ, "x.+|C.+", "F.+|v", "b"),
				mkBinary(OP_EQ, "s|X.+|A.+|F.+", "v", "b"),
				mkBinary(OP_EQ, "v", "s|X.+|A.+|F.+", "b"),
				mkBinary(OP_EQ, "A.+", "\\1", "b"),
				mkBinary(OP_EQ, "A(.+)", "V\\2", "b"),
				mkBinary(OP_EQ, "V\\2", "A(.+)", "b"),

				mkBinary(OP_SHIFT, "n|i0|i1|i2|i4|u1|u2|u4", "n|u1|u2|u4", "$1"),
		};

		unaryRules = new Rule[] {
				mkUnary(OP_ADD, "i.", "$1"),
				mkUnary(OP_ADD, "n", "i0"),
				mkUnary(OP_BOOL, "u.|n", "$1"),
				mkUnary(OP_COND, "b|i.|n|s|u.|A.+|F.+|x.+|C.+|X.+", "b"),
				mkUnary(OP_INC, "i.|u.|n|s", "$1"),
				mkUnary(OP_SEL, Cat.UINT8, "$1"),
				mkUnary(OP_SEL, "i1|i2|i4|u1|u2|u4|s", "$1", HOST_DOMAIN),
		};
	}


}
