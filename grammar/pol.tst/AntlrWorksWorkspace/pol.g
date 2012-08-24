grammar pol;
options {
    backtrack = true;
    language = Java;
    k = 1;
    memoize = true;
    output = AST;
    //ASTLabelType=BaseNode;
    //TokenLabelType=Atom;
}

tokens {
    D_ARG;        	// D_ declaration
    D_ARR;
    D_ARR_DIM;
    D_CLASS;
    D_COMPOSITION;
    D_CONST;
    D_ENUM;
    D_ENUMVAL;    
    D_FCN_CTOR;
    D_FCN_DCL;
    D_FCN_DEF;
    D_FCN_REF;
    D_FCN_TYP_NM;
    D_FIELD; 
    D_FORMAL; 
    D_INSTANCE; 
    D_META;
    D_META_ARGS;
    D_MODULE;
    D_PROTOCOL;
    D_PROTOCOL_MEM;
    D_VAR;
    DELIM;
    E_ADDR; 		// E_ expression
    E_BINARY;
    E_CALL;
    E_COND;
    E_CONST;
    E_EXPR;
    E_FIELD;
    E_HASH;
    E_IDENT;
    E_INDEX;
    E_INJECT;
    E_NUMLIT;
    E_NEW;
    E_PAREN;
    E_QUEST;
    E_SELF;
    E_UNARY;
    E_VEC;
    EXPORT;
    FCNBODY;
    HOST;
    LIST;
    MODULE;
    NIL;
    QNAME;
    S_ASSERT;
    S_ASSIGN;
    S_BIND;
    S_BLOCK;
    S_BREAK;
    S_CASE;
    S_CONTINUE;
    S_DECL;
    S_DEFAULT;
    S_DO_WHILE;
    S_ELIF;
    S_ELSE;
    S_FOR;
    S_FOREACH;
    S_IF;
    S_IMPORT;
    S_PACKAGE;
    S_PRINT;
    S_PROVIDED;
    S_RETURN;
    S_SWITCH;
    S_WHILE;
    T_ARR;
    T_FCN;
    T_USER_TYPE;
    T_STD;
    UNIT;
}

@parser::header {
    //package com.amaret.pollen.parser;
    import org.antlr.runtime.tree.CommonTree;
    import java.util.EnumSet;
    import java.util.ArrayList;
    import java.lang.*;
    import java.io.*;
}
@parser::members {

	protected enum UnitFlags {
        MODULE, CLASS, COMPOSITION, PROTOCOL, ENUM, META
    }
    protected enum LitFlags {
                HEX, INT, OCT, REAL, BOOL, NULL, STR, CHR, NUM  // FLOAT, UNSIGN, LONG needed?
    }
    EnumSet<LitFlags> litFlags = EnumSet.noneOf(LitFlags.class);
    
    protected enum AttrFlags {
        HOST, PUBLIC, VOLATILE, CONST, NEW
    }
    EnumSet<AttrFlags> atFlags = EnumSet.noneOf(AttrFlags.class);
    
    class TypeInfo {
    	public EnumSet<UnitFlags> getUnitFlags() {
			return uf;
		}
		public void setUnitFlags(EnumSet<UnitFlags> unitFlags) {
			uf.addAll(unitFlags);
		}
		public String getTypeName() {
			return tn;
		}
		public void setTypeName(String typeName) {
			this.tn = typeName;
		}
		EnumSet<UnitFlags> uf = EnumSet.noneOf(UnitFlags.class);
    	String tn = "";  
    }
    ArrayList<TypeInfo> tl = new ArrayList<TypeInfo>();
    TypeInfo ti;
    
    void DBG(String dbg) {
    	System.out.println(dbg);
    }
    void DBG_LT() {
      System.out.print("LT: "); 
    	if (input.LT(0) != null) System.out.print(input.LT(0).getText() + ", "); 
    	if (input.LT(1) != null) System.out.print(input.LT(1).getText() + ", "); 
    	if (input.LT(2) != null) System.out.print(input.LT(2).getText() + ", "); 
    	System.out.println();
    }
    /** A mismatched char or Token or tree node */
	public class PollenException extends RecognitionException {
		
		String msg;

		public PollenException(String m, IntStream input) {
			super(input);
			msg = m;
		}
		public String toString() {
			return "PollenException(" + msg + ")";
		}
	}
}
@lexer::header {
    //package com.amaret.pollen.parser;
    import java.util.EnumSet;
    //import com.amaret.pollen.parser.Atom;
    }
@lexer::members {
    private String fileName;
    private int implicitLineJoiningLevel = 0;
    private int lineNum = 0;
    private int startPos = -1;
     
    polLexer( CharStream input, String fileName ) {
        this(input);
        this.fileName = fileName;
    }

    @Override
    public Token nextToken() {
        startPos = getCharPositionInLine();
        return super.nextToken();
    }

    @Override
    public void reportError( RecognitionException e )
    {
    	  // TODO
        //Session ses = Session.current();
        //ses.reportError(e, getErrorMessage(e, getTokenNames()));
    }
}
unit
    :   (NL)* unitPackage   -> ^(UNIT unitPackage)  
    ;
unitPackage
	:  stmtPackage
	   importList
      (stmtInjection)?
      (unitTypeDefinition)?
      (stmtInjection)?
      EOF
	;
stmtPackage
	: 'package' qualName delim	-> ^(S_PACKAGE qualName)
	|	-> ^(S_PACKAGE)
	;
stmtExport
    :   'export'^ qualName delim
    ;
exportList
    :   stmtExport+  -> ^(LIST stmtExport+)
    ;
classDefinition  
@init {
	if (tl.size() > 1) { // nested class
	  ti = new TypeInfo();
	  tl.add(ti);		
	}	
}
@after{
	if (tl.size() > 1) {
   	tl.remove(tl.size()-1);
   	ti = tl.get(tl.size()-1);
   }
}
	: 	'class' classDef	-> ^(D_CLASS classDef)
	;
classDef 
	:	IDENT^ 
		{ ti.setTypeName($IDENT.text); ti.setUnitFlags(EnumSet.of(UnitFlags.CLASS));}
		(implementsClause)? 
		braceOpen (classFeature)* braceClose
		;

classFeature
    :   fcnDefinition 
    |   enumDefinition
    |   varDeclaration
    |	  classDefinition
    |	  stmtInjection
    ;
moduleDefinition 
	:	   'module' IDENT
	      { ti.setTypeName($IDENT.text); ti.setUnitFlags(EnumSet.of(UnitFlags.MODULE));}
			(implementsClause)?  
			braceOpen (moduleFeature)* braceClose 
			-> ^(D_MODULE ^(IDENT implementsClause? moduleFeature*))
	;
moduleFeature
	:   fcnDefinition
   |   varDeclaration
	|   enumDefinition
	|   classDefinition
	|	 stmtInjection
    ;
enumDefinition
	:	'enum' enumDef ->  enumDef
	;
enumDef 
@init {
	if (tl.size() > 1) { // nested 
	  ti = new TypeInfo();
	  tl.add(ti);		
	}	
}
@after{
	if (tl.size() > 1) {
   	tl.remove(tl.size()-1);
   	ti = tl.get(tl.size()-1);
   }
}
	:  (IDENT
		{ ti.setTypeName($IDENT.text); ti.setUnitFlags(EnumSet.of(UnitFlags.ENUM));}
		braceOpen enumList braceClose)
		-> ^(D_ENUM ^(IDENT enumList))
	;
enumList
	:	enumElement (',' enumElement)* -> ^(LIST enumElement+)
	;
enumElement
	:	IDENT ASSIGN INT_LIT (delim)? -> ^(D_ENUMVAL ^(IDENT INT_LIT))
	|	IDENT (delim)?	-> ^(D_ENUMVAL IDENT)
	;
protocolDefinition
	:	'protocol' IDENT
		{ ti.setTypeName($IDENT.text); ti.setUnitFlags(EnumSet.of(UnitFlags.PROTOCOL));}
		extendsClause? 
		braceOpen (protocolFeature)* braceClose 
		-> ^(D_PROTOCOL ^(IDENT extendsClause? protocolFeature*))
	;
protocolFeature
    :   enumDefinition
    |   fcnDeclaration 
    |	  stmtInjection
    ;
compositionDefinition
	:	'composition' IDENT
		{ ti.setTypeName($IDENT.text); 
		  //DBG("$IDENT " + $IDENT.text);
		  ti.setUnitFlags(EnumSet.of(UnitFlags.COMPOSITION));
		  //DBG(ti.getTypeName() + ", " + ti.getUnitFlags().toString());
		}
		extendsClause?  
		braceOpen (compositionFeature)* braceClose 
			-> ^(D_COMPOSITION IDENT extendsClause? compositionFeature*)
	;
compositionFeature
 	:  exportList 
   |  fcnDefinitionHost
   |  enumDefinition
   |  varDeclaration
   |	stmtInjection
 	;
stmtImport
    :   (importFrom
        'import' qualName (metaArguments)?
         importAs? delim) -> ^(S_IMPORT importFrom? qualName importAs? metaArguments?)
    ;
importFrom
    :   'from' qualName -> qualName
    |		-> NIL
    ;
importAs
	:	'as' qualName -> qualName
	|	-> NIL
	;
importList
    :   stmtImport (stmtImport)*	-> ^(LIST stmtImport+)
    |		-> ^(LIST)
    ;

meta
	:	'meta'
		{ ti.setUnitFlags(EnumSet.of(UnitFlags.META));}
		(braceOpen metaFormalParameters braceClose)
		-> ^(D_META metaFormalParameters)
	;
metaFormalParameters
   :   metaFormalParameter  (',' metaFormalParameter)* -> metaFormalParameter+
   ;
   
metaFormalParameter
:  metaFormalParameterType IDENT (ASSIGN metaArgument)?
	-> ^(metaFormalParameterType ^(IDENT (metaArgument)?))
;

metaFormalParameterType
	 :	'type' // includes module etc
	 |	builtinType
	;
metaArguments
   :  '{' metaArgument  (',' metaArgument)* '}' -> ^(D_META_ARGS metaArgument+)
   |	'{' '}'      -> ^(D_META_ARGS NIL)	// defer metaArgument binding 
   ;
 	
metaArgument
	:	numLit	
	|	boolLit
	|  STRING
	|  CHAR
	|	typeNameScalar
	;
typeName
@init{
	//System.out.print("typeName: "); DBG_LT();
}
	:	typeNameScalar 
	;
typeNameScalar			// scalar as in 'not array'
	:	builtinType
	|	userTypeName
	;
userTypeName
	:	qualName metaArguments	-> ^(T_USER_TYPE qualName metaArguments)
	|	qualName		-> ^(T_USER_TYPE qualName)
	;

unitTypeDefinition
@init{
		ti = new TypeInfo();
		tl.add(ti);		
}
@after{
   // debug
	System.out.println(ti.getTypeName() + ", " + ti.getUnitFlags().toString());
}
   :   (meta)?  (
         ('module') => moduleDefinition   		
	|     ('class') =>  classDefinition
   |     ('protocol') => protocolDefinition 
   |     ('composition') => compositionDefinition 
   |     ('enum') => enumDefinition 
   	)
   ;

extendsClause
    :   'extends'^ IDENT
    ;

implementsClause
    :   'implements'^ IDENT
    ;
braceClose
    :    (NL!)* '}'! (NL!)*
    ;
braceCloseAtEOF
// the final close brace does not require a delimiter if followed by EOF
// unused.
    :   (NL!*) '}'! (NL!)* //(delim)?
    ;

braceOpen
    :    (NL!)* '{'! (NL!)*
    ;
equalityOp
	:	EQ | NOT_EQ
	;
relationalOp
	:	'<' | '>' |  LT_EQ  | GT_EQ
	;
shiftOp
	:	'<<'	|	'>>'
	;
incDecOp
	: INC | DEC
	;
addSubOp
	:	PLUS	|	MINUS
	;
assignOp
	:	ADD_EQ  |  SUB_EQ  |  MUL_EQ  |  DIV_EQ  |  MOD_EQ  |  LSHFT_EQ  |  RSHFT_EQ | BITAND_EQ  |  BITXOR_EQ  |  BITOR_EQ
	;
multDivModOp
	:	'*'	|	'/'	|	'%'
	;
logicalNotOp	
	: LOG_NOT
	;
bitwiseNotOp	
	:	BIT_NOT
	;
exprList 
	:	expr (',' expr)*
		-> ^(LIST expr+ )
	|	-> NIL
	;
expr
	:	exprLogicalOr '?' expr ':' expr -> ^(E_QUEST exprLogicalOr expr expr)
	|	exprLogicalOr 
   ; 		
exprLogicalOr 
	: (exprLogicalAnd -> exprLogicalAnd)
		(
			'||' exprLogicalAnd
				-> ^(E_BINARY '||' $exprLogicalOr exprLogicalAnd)
		)*
	;
exprLogicalAnd
	:	(exprBitwiseOr	-> exprBitwiseOr)
	(
		'&&' exprBitwiseOr
			-> ^(E_BINARY '&&' $exprLogicalAnd exprBitwiseOr)
	)*
	;
exprBitwiseOr
	:	(exprBitwiseXor -> exprBitwiseXor)
	(
		'|' exprBitwiseXor
		-> ^(E_BINARY '|' $exprBitwiseOr exprBitwiseXor)
	)*
	;
exprBitwiseXor
	:	(exprBitwiseAnd -> exprBitwiseAnd)
	(
		'^' exprBitwiseAnd
		-> ^(E_BINARY '^' $exprBitwiseXor exprBitwiseAnd)
	)*
	;
exprBitwiseAnd
	:	(exprEquality -> exprEquality)
	(
		'&'	exprEquality
		-> ^(E_BINARY '&' $exprBitwiseAnd exprEquality)
	)*
	;
exprEquality
	:	(exprRelational -> exprRelational)
	( 
		equalityOp exprRelational
		-> ^(E_BINARY equalityOp $exprEquality exprRelational)
	)*
	;
exprRelational
	:	(exprShift -> exprShift)
	( 
		relationalOp exprShift 
		-> ^(E_BINARY relationalOp $exprRelational exprShift)
	)*
	;
exprShift
	:	(exprAddSub -> exprAddSub)
	( 
		shiftOp  exprAddSub 
		-> ^(E_BINARY shiftOp $exprShift exprAddSub)
	)*
	;
exprAddSub
	:	(exprMultDiv -> exprMultDiv)
	(
		addSubOp	exprMultDiv
		-> ^(E_BINARY addSubOp $exprAddSub exprMultDiv)
    )*
	;
exprMultDiv
	:	(exprUnary -> exprUnary)
	(
		multDivModOp exprUnary
		-> ^(E_BINARY multDivModOp $exprMultDiv exprUnary)
	)*
	;
exprNew
	:	'new' typeName fcnArgumentList -> ^(E_NEW typeName fcnArgumentList)
	;
exprUnary
	:	primitiveLit
	|	injectionCode
	|	arrayLit						-> ^(E_VEC arrayLit)
	|	logicalNotOp expr	 		-> ^(E_UNARY logicalNotOp expr)
	|	bitwiseNotOp expr  		-> ^(E_UNARY bitwiseNotOp expr)
	|	'(' expr ')'				-> ^(E_PAREN expr)
	|	MINUS expr					-> ^(E_UNARY MINUS expr)
	|	varOrFcnOrArray incDecOp -> ^(E_UNARY varOrFcnOrArray incDecOp)
	|	varOrFcnOrArray
	|	incDecOp varOrFcnOrArray -> ^(E_UNARY varOrFcnOrArray incDecOp)
	|	exprNew
	;
fcnDefinition
@init {
	atFlags.clear();			
}
@after{
  atFlags.clear();
}
	: ('public' { atFlags.add(AttrFlags.PUBLIC); } )? 
		('host' { atFlags.add(AttrFlags.HOST); } )? 
		fcnType_fcnName fcnFormalParameterList fcnBody 
		-> ^(D_FCN_DEF fcnType_fcnName fcnFormalParameterList fcnBody)
	;
fcnDefinitionHost
// composition
@init {
	atFlags.clear();			
}
@after{
  atFlags.clear();
}
	:	('public')? ('host' { atFlags.add(AttrFlags.HOST); })?
	   	fcnType_fcnName  fcnFormalParameterList fcnBody
		{ 	atFlags.add(AttrFlags.PUBLIC); /* enforce */ 	
			if (!atFlags.contains(AttrFlags.HOST))
       		throw new PollenException("Composition features must be one of host functions, export statements, or enum definitions.", input);
		}
		-> ^(D_FCN_DEF fcnType_fcnName fcnFormalParameterList fcnBody)		
	;
catch [PollenException re] {
    String hdr = getErrorHeader(re);
    String msg = re.toString();
    emitErrorMessage(hdr+" "+msg);
}
fcnAttr
	:	('public' { atFlags.add(AttrFlags.PUBLIC); } )? 
		('host' { atFlags.add(AttrFlags.HOST); } )?
	;
fcnBody
  :	braceOpen (stmts)  braceClose  -> ^(FCNBODY stmts)
  ;
fcnDeclaration
@init {
	atFlags.clear();			
}
@after{
  atFlags.clear();
}
   :	('public' { atFlags.add(AttrFlags.PUBLIC); } )? 
		('host' { atFlags.add(AttrFlags.HOST); } )? 
		fcnType_fcnName (fcnFormalParameterList) delim
   -> ^(D_FCN_DCL fcnType_fcnName fcnFormalParameterList)
   ;
fcnType_fcnName
// function names in a dcln can be qualified, e.g. pollen.reset()
// function return is always a list, empty for void fcn.
	:	typeName qualName  
		-> ^(D_FCN_TYP_NM  ^(LIST typeName) qualName)      // int myfcn()
	|	{input.LT(1).getText().equals(ti.getTypeName()) }? t=typeName	    
		-> ^(D_FCN_CTOR ^(LIST $t) typeName) 					// constructor
	|	qualName 	
		-> ^(D_FCN_TYP_NM ^(LIST) qualName)               // myfcn() returns void
	|	('(' typeName (',' typeName)* ')' qualName) => fcnTypes_fcnName	// multiple returns
	;
fcnTypes_fcnName
	:	'(' fcnTypes ')' qualName -> ^(D_FCN_TYP_NM  fcnTypes qualName)
	;
fcnTypes
	:	typeName (',' typeName)* -> ^(LIST typeName+)
	;
fcnFormalParameterList
	:	'(' fcnFormalParameters ')' -> fcnFormalParameters
	;
fcnFormalParameters
	:	fcnFormalParameter (',' fcnFormalParameter)* 
		-> ^(LIST fcnFormalParameter+)
	|	-> ^(LIST)
	;
fcnFormalParameter
	:   typeName IDENT ( '=' expr)?
		-> ^(D_FORMAL typeName ^(IDENT (expr)?))
	;
fcnArgumentList
	:	'(' fcnArguments ')'	-> fcnArguments
	;
fcnArguments
	:	exprList
	;
varOrFcnOrArray
	:       'new' typeName fcnArgumentList fieldOrArrayAccess?
                -> ^(E_NEW typeName fcnArgumentList fieldOrArrayAccess?)
	|       '@' IDENT fcnArgumentList fieldOrArrayAccess?
                -> ^(E_SELF
                        ^(E_CALL IDENT fcnArgumentList fieldOrArrayAccess?))
	|       '@'     IDENT fieldOrArrayAccess?         // note grammar.h also has meta_arguments - but how?
                -> ^(E_SELF IDENT fieldOrArrayAccess?)
	|       '@'
                -> ^(E_SELF)
	|       qualName fcnArgumentList fieldOrArrayAccess?
                -> ^(E_CALL qualName fcnArgumentList fieldOrArrayAccess?)
	|       qualName fieldOrArrayAccess?
	;

fieldOrArrayAccess
	:	 (fieldAccess | arrayAccess)+
	;
fieldAccess
// NOTE this handles dereferences after calls or array accesses. 
// Otherwise qualified names do not go here.
   :       '.'     IDENT fcnArgumentList   -> ^(E_CALL IDENT  fcnArgumentList)
   |       '.'     IDENT   -> ^(E_IDENT IDENT)
  ;
arrayAccess
	:	'['	(exprList)?	']'	-> ^(E_INDEX exprList?)
	;	
stmtBlock
	:	braceOpen stmts braceClose	 -> ^(S_BLOCK stmts)
	;
stmts
	:	(stmt)+	 -> ^(LIST stmt+)
	|	(NL*) -> NIL
	;
stmt
	:  varDeclaration 
	|	stmtAssign	delim  // delim here so syntax can be embedded
	|	stmtAssert
	|	stmtBind
	|	stmtPrint
	|	stmtReturn
	|	stmtBreak
	|  stmtContinue
	|  stmtForEach
	|  stmtFor
	|	stmtSwitch
	|  stmtDoWhile
	|	stmtIf
	|	stmtProvided
	|	stmtWhile 
	|	stmtInjection
	|	expr delim
	;
stmtAssign
	:	varOrFcnOrArray ASSIGN expr	
		-> ^(S_ASSIGN ^(E_BINARY ASSIGN varOrFcnOrArray expr))
	|	injectionCode ASSIGN expr		
		-> ^(S_ASSIGN ^(E_BINARY ASSIGN injectionCode expr))
	|	varOrFcnOrArray assignOp expr  
		-> ^(S_ASSIGN ^(E_BINARY assignOp varOrFcnOrArray expr))
	|	injectionCode assignOp expr	
		-> ^(S_ASSIGN ^(E_BINARY assignOp injectionCode expr))
	;
stmtAssert
	:	'assert' exprList	delim -> ^(S_ASSERT exprList)
	;
stmtBind
	:	varOrFcnOrArray BIND  expr	 delim -> ^(S_BIND varOrFcnOrArray  expr)	
	;
stmtPrint
	:	'print' (stmtPrintTarget)? exprList	
		-> ^(S_PRINT stmtPrintTarget? exprList)
	;
stmtPrintTarget
	:	('log' | 'err'	| 'out')
	;
stmtReturn
// Note rules below require that returns of multiple values be surrounded by parens.
// This is required to disambiguate with question mark expression.
	:	'return' ('(') (expr (',' expr)+) (')') delim	-> ^(S_RETURN expr+)
	|	'return'  (expr)  delim	-> ^(S_RETURN expr)
	;
stmtBreak
	:	'break' delim -> ^(S_BREAK)
	;
stmtContinue
	:	'continue' delim -> ^(S_CONTINUE)
	;
stmtFor
    :   'for' '(' stmtForInit SEMI stmtForCond SEMI stmtForNext ')' stmtBlock
            -> ^(S_FOR stmtForInit stmtForCond stmtForNext stmtBlock)
    ;
stmtForCond
    :   //empty
           -> NIL
    |   expr
    ;

stmtForInit
    :   //empty
            -> NIL
    |   typeName IDENT '=' expr
            -> ^(S_DECL ^(typeName IDENT  expr))
    |   stmtAssign
    ;
stmtForNext
    :   //empty
            -> NIL
    |   expr
    ;
stmtForEach
	:	'foreach' '(' IDENT 'in' expr ')' stmtBlock -> ^(S_FOREACH IDENT ^(E_IDENT expr) stmtBlock)
	;
stmtSwitch
	:	'switch' '(' expr ')' braceOpen stmtsCase braceClose	-> ^(S_SWITCH ^(E_COND expr) stmtsCase)
	;
stmtsCase
	:	stmtCase* -> stmtCase+
	;
stmtCase
	:	'case' (INT_LIT)	':' stmts	-> ^(S_CASE INT_LIT stmts)
	|	'default'	':' stmts	-> ^(S_DEFAULT stmts)
	;
stmtDoWhile
	:	'do' stmtBlock 'while' '(' expr ')' delim 	-> ^(S_DO_WHILE stmtBlock ^(E_COND expr))
	;
stmtIf
	:	'if' stmtIfBlock stmtsElif stmtElse?	-> ^(S_IF stmtIfBlock stmtsElif stmtElse?)
	|	'if' stmtIfBlock stmtElse	-> ^(S_IF stmtIfBlock stmtElse)
	|	'if' stmtIfBlock -> ^(S_IF stmtIfBlock)
	;
stmtIfBlock
	:	'(' expr ')' stmtBlock -> ^(E_COND expr) stmtBlock
	;
stmtsElif
	:	stmtElif+
	;
stmtElif
	:	'elif' stmtIfBlock -> ^(S_ELIF stmtIfBlock)
	;
stmtElse
	:	'else' stmtBlock -> ^(S_ELSE stmtBlock)
	;
stmtProvided
	:	'provided' '(' expr ')' stmtBlock (stmtElse)?
		-> ^(S_PROVIDED expr stmtBlock stmtElse?)
	;
stmtWhile
	:	'while' '('	expr')' stmtBlock -> ^(S_WHILE stmtBlock)
	;
varDeclaration    
   :	 varAttr varDecl delim	-> varDecl
   ;
varAttr
	:	(	 'const' { atFlags.add(AttrFlags.CONST); }
		|	 'volatile' { atFlags.add(AttrFlags.VOLATILE); }
		|   'host' { atFlags.add(AttrFlags.HOST); } 
		)*
	;
varDecl
scope {
  // Use 'typ' to rewrite the tree so that for AST x, 
  // 'int x' and 'int y = 3, x, z' has the same structure.
  Object typ; //CommonTree typ; only Object works, for some reason.
}
@init {
	$varDecl::typ = null;
}
	:	(typeName IDENT (ASSIGN expr)? ',') => varDeclList	
	|  (typeName IDENT '[') => varArray 
	|  (typeName '(' ) => varFcnRef 
	|   (typeName varInit) => varDeclList
	|	 'new' typeName IDENT fcnArgumentList  // declaration of an instance ('new')
		-> ^(D_VAR typeName 
		   ^(IDENT ^(E_EXPR ^(E_NEW typeName fcnArgumentList))))
	;
varFcnRef
	: typeName fcnRefTypeList IDENT 
		-> ^(D_FCN_REF typeName fcnRefTypeList IDENT)
	;
fcnRefTypeList
	: '(' fcnRefTypes ')' -> fcnRefTypes
	;
fcnRefTypes
	:	typeName (',' typeName)* 
		-> ^(LIST typeName+)
	|	-> ^(LIST)
	;
varArray
	:	typeName IDENT varArraySpec ('=' initializer)? 
	->  ^(D_ARR typeName IDENT varArraySpec initializer?)
	;
varArraySpec
	:	('[' varDim ']')+	->   ^(LIST varDim+)
	;
varDim
	:  expr  // restrict
	| -> NIL 
	;
initializer
	: expr // restrict
	| '{' initializer_list ','? '}' -> initializer_list
	;
initializer_list
	: initializer (',' initializer)* -> ^(LIST initializer+)
	;

varDeclList  // int x, y=3, z=3, a
@init {
	assert $varDecl::typ != null;
}
	:	typeName! {$varDecl::typ = $typeName.tree; } varDeclList
	|	varInit (','! varInit)*    
	;
varInit	
// child is inital value
	: IDENT (ASSIGN expr)?
		-> ^(D_VAR {$varDecl::typ} ^(IDENT expr?))
	;

builtinType
    :   'bool'
    |   'byte'
    |   'int8'
    |   'int16'
    |   'int32'
    |   'string'
    |   'uint8'
    |   'uint16'
    |   'uint32'
    ;
    
qualName
    :   IDENT (qualNameList)? -> ^(E_IDENT  IDENT qualNameList?)
    ;
qualNameList
	:
	(   '.'     
        IDENT
    )+	 -> ^(E_IDENT IDENT)+
	;
arrayLit		// anonymous arrays
	:	'['	arrayLitList	']'	-> ^(LIST arrayLitList)
	;
arrayLitList
	:	arrayLitElem	(','	arrayLitElem)*	-> arrayLitElem+
	|	-> NIL
	;
arrayLitElem
	:	primitiveLit	|	namedConstant
	;
namedConstant
	:	qualName		// enforce to be const or enum member
	;
boolLit
        : ('true' | 'false') { litFlags.add(LitFlags.BOOL);}
        ;
nullLit
        :   'null' {litFlags.add(LitFlags.NULL);}
        ;
numLit
@after {
        litFlags.add(LitFlags.NUM);
}
        :       INT_LIT {litFlags.add(LitFlags.INT);}   
        |       OCT_LIT {litFlags.add(LitFlags.OCT);}   
        |       REAL_LIT {litFlags.add(LitFlags.REAL);} 
        |       HEX_LIT  {litFlags.add(LitFlags.HEX);}  
        ;
// All literals should go through primitiveLit to clear / set LitFlags
primitiveLit
@init {
        litFlags.clear();       
}
@after {
        litFlags.clear();       
}
        :       boolLit -> ^(E_CONST boolLit)
        |       numLit  -> ^(E_CONST numLit)
        |       nullLit -> ^(E_CONST nullLit)
        |       STRING  {litFlags.add(LitFlags.STR);}  
           -> ^(E_CONST STRING)
        |       CHAR {litFlags.add(LitFlags.CHR);}  
            -> ^(E_CONST CHAR)
        ;
stmtInjection
	:	INJECT NL* -> ^(E_INJECT INJECT)
	;
injectionCode
	:	INJECT -> ^(E_INJECT INJECT) // don't consume delimiter
	;
delim
	:	(SEMI) (NL)*	-> 
	|	(NL)+	-> 
	|	((NL)* '}') =>  NL* -> 
	;
delim_implicit
	:	
	;
// lexer
// convention: lexer rules are upper case.
IDENT
    :   I (I | D)*
    ;
HEX_LIT
	:	('0x' | '0X') (H)+ (LU)?
	;
OCT_LIT
	:	'0' O+
	;
REAL_LIT
	:	(MINUS)? D+ E ('l' | 'L')?
	|	(MINUS)? D+ '.' D* (E)? ('l' | 'L')?
	;
INT_LIT
	:	(MINUS)? D+ (LU)? 
	;
CHAR
    :   '\'' (('\\' ~'\n') | ~('\\' | '\'' | '\n'))+ '\''
    ;
STRING
    :   '"' (('\\' ~'\n') | ~('\\' | '"' | '\n'))* '"'
    ; 
WS
    :   (' ' | '\t')*  { $channel=HIDDEN; }
    ;
SL_COMMENT
    : '#' ~('\n'|'\r')*   { $channel=HIDDEN; }
    | '/''/' ~('\n'|'\r')*  { $channel=HIDDEN; }
    ;
INJECT
	: IJ_BEG ( options {greedy=false;} : .)* IJ_END
//	: '+{' ( options {greedy=false;} : . )* '}+'
	;
ML_COMMENT	
    :   '---' ( options {greedy=false;} : . )* '---' ('\n'|'\r')* { $channel=HIDDEN; }
    ;
SEMI
    :   ';'
    ;
NL
    :   ('\r')? ('\n') // cannot be hidden because a statement delimiter
    ;
ILLEGAL_CHARACTER
    :   '\u0080'..'\uFFFF'
    ;
// fragments: never returned to the parser as a token
fragment I:       ('a'..'z'|'A'..'Z'|'_'|'$') ;
fragment D:        '0'..'9' ;
fragment O:			 '0'..'7';
fragment H:        'a'..'f' | 'A'..'F' | '0'..'9' ;
fragment E:        ('E' | 'e') (PLUS | MINUS)? (D)+ ;
fragment LU:       'LU' | 'Lu' | 'lU' | 'lu' | 'UL' | 'uL' | 'Ul' | 'ul' | 'l' | 'u' | 'L' | 'U' ;
fragment IJ_BEG:	 '+{';
fragment IJ_END:	 '}+';

		
INC		: '++';
PLUS		: '+';
DEC		: '--';
MINUS		: '-';
ASSIGN	:	'=';  // note ASSIGN must be first of eq ops or grammar error (won't be matched)
BIND 		:	':=';
ADD_EQ	:	'+=';
SUB_EQ	:	'-=';
MUL_EQ	:	'*=';
DIV_EQ	:	'\\=';
BITOR_EQ	:	'|=';
BITXOR_EQ:	'^=';
BITAND_EQ:	'&=';
RSHFT_EQ	:	'>>=';
LSHFT_EQ	:	'<<=';
MOD_EQ	:	'%=';
EQ			:	'==';
NOT_EQ	:	'!=';
LT_EQ		:	'<=';
GT_EQ		:	'>=';
LOG_NOT	:	'!';
BIT_NOT	:	'~';
