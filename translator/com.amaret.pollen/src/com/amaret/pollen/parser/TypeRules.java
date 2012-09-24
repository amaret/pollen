package com.amaret.pollen.parser;

import java.util.List;

public class TypeRules {

	public static Cat checkUnary(String op, Cat cat) {
		// TODO Auto-generated method stub
		return null;
	}

	public static Cat preCheck(Cat cat) {
		// TODO Auto-generated method stub
		return null;
	}

	public static void checkInit(Cat exprCat, ExprNode right) {
		// TODO Auto-generated method stub
		
	}
	public static void checkImplements(DeclNode.Usr implementor, SymbolEntry protocol) {
		
		UnitNode unit = protocol.node() instanceof ImportNode ? ((ImportNode) protocol.node()).getUnit() : null;
		DeclNode.Usr p = unit.getUnitType();
		
		if (p == null || !p.isProtocol()) {
			ParseUnit.current().reportError((BaseNode) protocol.node(), "implements clause requires a protocol");
			return;
		}
		UnitNode iu = (UnitNode) implementor.getEnclosingScope();
		UnitNode pu = (UnitNode) p.getEnclosingScope();
		
		for (List<DeclNode.Fcn> pl : pu.getFcnMap().values()) {
			boolean matchSig = false;
			for (DeclNode.Fcn pf : pl) {
				Cat pfc = null;		
				boolean matchName = false;
				for (String ifn : iu.getFcnMap().keySet()) {					
					if (ifn.equals(pf.getName().getText())) {
						matchName = true;
						for (DeclNode.Fcn ifd : iu.getFcnMap().get(ifn)) {
							Cat ifc = new Cat.Fcn(ifd, ifd.getEnclosingScope());
							if (pfc == null)
								pfc = new Cat.Fcn(pf, pf.getEnclosingScope());
							String s1 = ifc.sigString();
							String s2 = pfc.sigString();
							if (ifc.sigString() != null && ifc.sigString().equals(pfc.sigString())) {
								matchSig = true;
								break;
							}							
						}
						if (!matchSig) {
							//ParseUnit.current().reportError((BaseNode) protocol.node(), "all functions in protocol must be implemented with identical signatures");
						}
					}											
				}
				if (!matchName) {
					ParseUnit.current().reportError((BaseNode) protocol.node(), "all functions in protocol must be implemented");
					return;
				}				
			}		
		}
		
	}

	public static Cat preCheck(Cat left, Cat right) {
		// TODO Auto-generated method stub
		return null;
	}

	public static Cat checkBinary(String text, Cat cat, Cat cat2) {
		// TODO Auto-generated method stub
		return null;
	}

	public static Cat checkBinary(String string, Cat acat, Cat ecat,
			String string2) {
		// TODO Auto-generated method stub
		return null;
	}

	public static Cat checkUnary(String string, Cat testCat, String string2) {
		// TODO Auto-generated method stub
		return null;
	}

	public static ISymbolNode checkSelector(IScope scope, SymbolEntry symbol,
			Atom name, boolean b) {
		// TODO Auto-generated method stub
		return null;
	}


}
