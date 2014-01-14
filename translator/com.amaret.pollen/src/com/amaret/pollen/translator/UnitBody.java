/**
 * 
 */
package com.amaret.pollen.translator;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import com.amaret.pollen.parser.BodyNode;
import com.amaret.pollen.parser.DeclNode;
import com.amaret.pollen.parser.ParseUnit;
import com.amaret.pollen.parser.StmtNode;
import com.amaret.pollen.parser.UnitNode;

/**
 * @author lucidbee
 * 
 */
public class UnitBody {

	private Generator gen;

	public UnitBody(Generator gen) {
		this.gen = gen;
	}

	private void genBody(BodyNode body) {
		DeclNode.Fcn fcn = body.getFcn();
		if (fcn.isHost()) {
			return;
		}
		
		gen.aux.genTypeWithVarName(fcn.getTypeSpec(), gen.uname_target()
				+ gen.aux.mkPollenCname(fcn.cname()) + gen.aux.mkSuf(fcn));
		gen.aux.genFcnArgs(body.getFormals(), true, fcn);
		gen.getFmt().print(" {\n%+");
		
		gen.aux.genLocals(body.getLocalVars());
		for (StmtNode stmt : body.getStmts()) {
			gen.getFmt().print("%t");
			gen.aux.genStmt(stmt);
			gen.getFmt().print("\n");
		}
		if (fcn.isConstructor() && fcn.getName().getText().equals(ParseUnit.CTOR_CLASS_TARGET)) {
			gen.getFmt().print("%treturn this;\n");
		}
		gen.getFmt().print("%-}\n\n");
	}

// unused
//	private void genDelegStub(DeclNode.Fcn fcn, String dcn) {
//		gen.aux.genType(fcn.getTypeSpec(), gen.cname()
//				+ gen.aux.mkCname(fcn.cname()) + gen.aux.mkSuf(fcn));
//		gen.aux.genFcnArgs(fcn.getFormals(), true);
//		gen.fmt.print(" {\n%+%t");
//		if (!fcn.isVoid()) {
//			gen.fmt.print("return ");
//		}
//		gen.fmt
//				.print("%1_%3__E(", dcn, fcn.getName());
//		String sep = "";
//		for (DeclNode.Formal arg : fcn.getFormals()) {
//			gen.fmt.print("%1%2", sep, arg.getName());
//			sep = ", ";
//		}
//		gen.fmt.print(");\n%-}\n\n");
//	}

	public void generate(UnitNode unit) {
		
		boolean title = false;

		gen.aux.setHost(false);

		gen.aux.genTitle("string literals");
		genStrings(unit);
		
		for (DeclNode decl: unit.getUnitType().getFeatures()) {
    		if (decl instanceof DeclNode.Inject) {
    			if (!title) {
    				gen.aux.genTitle("code injections");
    				title = true;
    			}
    			gen.aux.genExpr(((DeclNode.Inject) decl).getInjectExpr());
    			gen.getFmt().print("\n");
    		}			
		}

		title = false;
    	Collection<List<DeclNode.Fcn>> c = unit.getFcnMap().values();
    	for (List<DeclNode.Fcn> l : c) {
    		for (DeclNode.Fcn f : l) {
    			if (f.isHost())
    				continue;
    			if (!title) {
    				gen.aux.genTitle("function definitions");
    				title = true;
    			}
    			genBody(f.getBody());
    		}		
    	}
	}

	private void genStrings(UnitNode unit) {
		// this prints out the name of the instantiated file, if applicable
		gen.getFmt().print("static const char %1_s__fileName[] = \"%2\";\n", gen.uname_target(), 
				unit.getUnitType().getName().getText() + ".p"); // unit.getFileName());
		for (Map.Entry<String, Integer> ent : unit.getStrings()) {
			gen.getFmt().print("static const char %1_s__%2[] = %3;\n", gen.uname_target(),
					ent.getValue(), ent.getKey());
		}
	}

}
