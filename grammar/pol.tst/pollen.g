// Copyright Amaret, Inc 2011-2015
// See https://github.com/amaret/pollen/blob/master/LICENSE
grammar pollen;
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
    D_CONFIG;
    D_CONST;
    D_ENUM;
    D_ENUMVAL;    
    D_FCN_CTOR;
    D_FCN_DCL;
    D_FCN_DEF;
    D_FCN_REF;
    D_FCN_TYP_LIST;
    D_FCN_TYP_NM;
    D_FIELD;  
    D_INSTANCE; 
    D_META;
    D_META_ARGS;
    D_MODULE;
    D_PROTOCOL;
    D_PROTOCOL_MEM;
    D_REF;
    D_VAR;
    D_VOID;
    DELIM;
    E_ADDR; 		// E_ expression
    E_ARRLIT;
    E_BINARY;
    E_CALL;
    E_CALL_ARGS;
    E_COND;
    E_CONST;
    E_EXPR;
    E_FIELD;
    E_HASH;
    E_IDENT;
    E_INDEX;
    E_NUMLIT;
    E_NEW;
    E_PAREN;
    E_QUEST;
    E_UNARY;
    E_VEC;
    EXPORT;
    FCNBODY;
    FCNPARMS;
    HOST;
    INJECT_CODE;
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
    T_DEF;
    T_FCN;
    T_USER_TYPE;
    T_STD;
    UNIT;
}

@parser::header {
    //package com.amaret.pollen.parser;
    import java.util.EnumSet;
    import java.util.ArrayList;
    import java.lang.*;
    import java.io.*;
}
@parser::members {

	protected enum UnitFlags {
        MODULE, CLASS, COMPOSITION, PROTOCOL, ENUM, META
    }
    protected enum NumLitFlags {
        HEX, INT, OCT, REAL // FLOAT, UNSIGN, LONG needed?
    }
    EnumSet<NumLitFlags> nlFlags = EnumSet.noneOf(NumLitFlags.class);
    
    protected enum AttrFlags {
        HOST, PUBLIC, VOLATILE, CONST
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
     
    pollenLexer( CharStream input, String fileName ) {
        this(input);
        this.fileName = fileName;
    }

    public Token emit() {
        Atom a = new Atom(
            input,
            state.type,
            state.channel,
            state.tokenStartCharIndex,
            getCharIndex() - 1
        );
        a.setLine(state.tokenStartLine);
        a.setText(state.text);
        a.setCharPositionInLine(state.tokenStartCharPositionInLine);
        a.setFileName(fileName);
        emit(a);
        return a;
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
	   (importList)?
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
    :   stmtExport+  
    	// -> ^(LIST<ListNode>["LIST"] stmtExport*)
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
	:	'enum' enumDef -> ^(D_ENUM enumDef)
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
	:  (IDENT^ 
		{ ti.setTypeName($IDENT.text); ti.setUnitFlags(EnumSet.of(UnitFlags.ENUM));}
		braceOpen enumList braceClose)
	;
enumList
	:	enumElement (','! enumElement)*
	;
enumElement
	:	IDENT^ (ASSIGN! INT_LIT) (delim)?
	|	IDENT^ (delim)?
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
    :   (importFrom?
        'import' qualName (metaArguments)?
         importAs? delim) -> ^(S_IMPORT importFrom? qualName metaArguments? importAs?)
    ;
importFrom
    :   'from'^ qualName
    ;
importAs
	:	'as'^ qualName
	;
importList
    :   stmtImport (stmtImport)*	-> stmtImport+
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
	:	typeNameScalar ('[' ']')?
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
addSubOp
	:	'+'	|	'-'
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
	:	expr (',' expr)*	-> expr+
	|	-> NIL
	;
expr
	:	exprLogicalOr '?' expr ':' expr -> ^(E_QUEST exprLogicalOr expr expr)
	|	exprLogicalOr -> ^(E_EXPR exprLogicalOr)
   ; 		
exprLogicalOr 
	: exprLogicalAnd ('||' exprLogicalAnd)*
	;
exprLogicalAnd
	:	exprBitwiseOr	('&&' exprBitwiseOr)*
	;
exprBitwiseOr
	:	exprBitwiseXor ('|' exprBitwiseXor)*
	;
exprBitwiseXor
	:	exprBitwiseAnd ('^' exprBitwiseAnd)*
	;
exprBitwiseAnd
	:	exprEquality ('&'	exprEquality)*
	;
exprEquality
	:	exprRelational ( equalityOp exprRelational)*
	;
exprRelational
	:	exprShift  ( relationalOp exprShift )*
	;
exprShift
	:	exprAddSub	( shiftOp  exprAddSub )*
	;
exprAddSub
	:	exprMultDiv	(addSubOp	exprMultDiv)*
	;
exprMultDiv
	:	exprUnary (multDivModOp exprUnary)*
	;
exprUnary
	:	primitiveLit
	|	injectionCode
	|	nullLit
	|	arrayLit
	|	LOG_NOT expr
	|	BIT_NOT expr
	|	'(' expr ')'
	|	'-' expr
	|	varOrFcnOrArray (('++') | ('--'))? 
	|	(('++') | ('--')) varOrFcnOrArray
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
	:	typeName qualName  
		-> ^(D_FCN_TYP_NM  typeName qualName)              			// int myfcn()
	|	{input.LT(1).getText().equals(ti.getTypeName()) }? typeName	    
		-> ^(D_FCN_CTOR  typeName) 								// constructor
	|	qualName 	
		-> ^(D_FCN_TYP_NM D_VOID qualName)                   	// myfcn() returns void
	|	('(' typeName (',' typeName)* ')' qualName) => fcnTypes_fcnName	// multiple returns
	;
fcnTypes_fcnName
	:	'(' fcnTypes ')' qualName -> ^(D_FCN_TYP_NM  fcnTypes qualName)
	;
fcnTypes
	:	typeName (',' typeName)* -> ^(D_FCN_TYP_LIST typeName+)
	;
fcnFormalParameterList
	:	'(' fcnFormalParameters ')' -> ^(FCNPARMS fcnFormalParameters)
	;
fcnFormalParameters
	:	fcnFormalParameter (',' fcnFormalParameter)* -> fcnFormalParameter+
	|	-> NIL
	;
fcnFormalParameter
	:   typeName IDENT ('='!	arrayLitElem)? 
	;
fcnArgumentList
	:	'(' fcnArguments ')'	-> ^(E_CALL_ARGS fcnArguments)
	;
fcnArguments
	:	exprList
	;
varOrFcnOrArray
// antlr doesn't allow rewriting rules that don't return anything (exception).
// if there is no fieldOrArrayAccess than that rule must return Nil.
// So the AST has NIL nodes to reflect this.
	:	'new' typeName fcnArgumentList fieldOrArrayAccess
		-> ^(E_NEW typeName fcnArgumentList fieldOrArrayAccess)
	|	'@'^	IDENT fcnArgumentList fieldOrArrayAccess 
	|	'@'^	IDENT fieldOrArrayAccess 	  // note grammar.h also has meta_arguments - but how?
	|	'@'^	
	|	qualName fcnArgumentList fieldOrArrayAccess 
		-> ^(E_CALL qualName fcnArgumentList fieldOrArrayAccess)
	|	qualName fieldOrArrayAccess 
	;
fieldOrArrayAccess
	:	 (fieldAccess | arrayAccess)+
	|	-> NIL
	;
fieldAccess
	:	'.'	IDENT (fcnArgumentList)?	-> ^(E_FIELD IDENT  fcnArgumentList?)
	;
arrayAccess
	:	'['	(exprList)?	']'	-> ^(E_INDEX exprList?)
	;
	
stmtBlock
	:	braceOpen stmts braceClose	 -> ^(S_BLOCK stmts)
	;
stmts
	:	(stmt)+
	|	(NL*) -> NIL
	;
stmt
	:  stmtAssign	delim  // delim here so syntax can be embedded
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
	|	varDeclaration 
	|	stmtInjection
	|	expr delim
	;
stmtAssign
	:	varOrFcnOrArray ASSIGN expr	-> ^(S_ASSIGN varOrFcnOrArray ASSIGN expr)
	|	injectionCode ASSIGN expr		-> ^(S_ASSIGN ^(INJECT_CODE injectionCode) ASSIGN expr)
	|	varOrFcnOrArray assignOp expr  -> ^(S_ASSIGN varOrFcnOrArray assignOp expr)
	|	injectionCode assignOp expr	-> ^(S_ASSIGN ^(INJECT_CODE injectionCode) assignOp expr)
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
//   :	(options{greedy=false;}:varAttr) varDecl	-> ^(D_VAR varDecl)    
   :	 varAttr varDecl delim	-> ^(D_VAR varDecl)
   ;
varAttr
 // todo set symbol flags for these
	:	(	 'const' { atFlags.add(AttrFlags.CONST); }
		|	 'volatile' { atFlags.add(AttrFlags.VOLATILE); }
		|   'host' { atFlags.add(AttrFlags.HOST); } )*
	;
varDecl
	:	(typeName IDENT (ASSIGN expr)? ',') => varDeclList
	|  (typeName IDENT '[') => varArray 
	|  (typeName '(' ) => varFcnRef 
	|   typeName varInit 
	|	'new' typeName IDENT fcnArgumentList
		-> ^(D_INSTANCE typeName IDENT fcnArgumentList)
	;
varFcnRef
	: typeName fcnRefTypeList IDENT 
		-> ^(D_FCN_REF typeName fcnRefTypeList IDENT)
	;
fcnRefTypeList
	: '(' fcnRefTypes ')'
		-> ^(FCNPARMS fcnRefTypes)
	;
fcnRefTypes
	:	typeName (',' typeName)* -> typeName+
	|	-> NIL
	;
varArray
	:	typeName IDENT varArraySpec ->  ^(D_ARR typeName IDENT varArraySpec)
	;
varArraySpec
	:	('[' varDim ']')+	->   varDim+
	;
varDim
// restrict IDENT according to semantic rules
	:  INT_LIT   -> ^(D_ARR_DIM INT_LIT)
	|	IDENT	-> ^(D_ARR_DIM IDENT)
	| -> ^(D_ARR_DIM NIL)
	;
varDeclList  // int x, y=3, z=3, a
	:	typeName varDeclList
	|	varInit (',' varInit)*     -> (varInit)+
	;
varInit	
// child is inital value
	: IDENT^ (ASSIGN! expr)?
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
    :   IDENT
    (   '.'     
        IDENT 
     )*		-> ^(QNAME IDENT+)
     ;
arrayLit		// anonymous arrays
	:	'['	arrayLitList	']'	-> ^(E_ARRLIT arrayLitList)
	;
arrayLitList
	:	arrayLitElem	(','	arrayLitElem)*	-> arrayLitElem+
	|	-> NIL
	;
arrayLitElem
	:	primitiveLit	|	nullLit	|	namedConstant
	;
namedConstant
	:	qualName		// enforce to be const or enum member
	;
boolLit
	: 'true' | 'false'
	;
nullLit
	:	'null'
	;
numLit
@init {
	nlFlags.clear();	
}
	:	INT_LIT {nlFlags.add(NumLitFlags.INT);}		-> ^(E_NUMLIT INT_LIT)
	| 	OCT_LIT {nlFlags.add(NumLitFlags.OCT);}		-> ^(E_NUMLIT OCT_LIT)
	| 	REAL_LIT {nlFlags.add(NumLitFlags.REAL);}		-> ^(E_NUMLIT REAL_LIT)
	| 	HEX_LIT  {nlFlags.add(NumLitFlags.HEX);}		-> ^(E_NUMLIT HEX_LIT)
	;
primitiveLit
	:	boolLit
	|	numLit
	|	STRING
	|	CHAR
	;
stmtInjection
	:	INJECT NL* -> ^(INJECT_CODE INJECT)
	;
injectionCode
//	:	(IJ_BEG .* NL+ IJ_BEG )	=> injectionList	
//	:	(INJECT NL+ IJ_BEG )	=> injectionList
	:	INJECT -> ^(INJECT_CODE INJECT) // don't consume delimiter
	;
injectionList
	:	INJECT (NL+ INJECT)+ -> ^(INJECT_CODE INJECT+)
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
	:	('-')? D+ E ('l' | 'L')?
	|	('-')? D+ '.' D* (E)? ('l' | 'L')?
	;
INT_LIT
	:	('-')? D+ (LU)? 
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
fragment E:        ('E' | 'e') ('+' | '-')? (D)+ ;
fragment LU:       'LU' | 'Lu' | 'lU' | 'lu' | 'UL' | 'uL' | 'Ul' | 'ul' | 'l' | 'u' | 'L' | 'U' ;
fragment IJ_BEG:	 '+{';
fragment IJ_END:	 '}+';

		// note ASSIGN must be first or grammar error (won't be matched)
ASSIGN	:	'=';
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
