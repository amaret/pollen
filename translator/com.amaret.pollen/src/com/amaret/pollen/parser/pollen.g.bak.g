
grammar pollen;
options {
    backtrack = true;
    language = Java;
    k = 1;
    memoize = true;
    output = AST;
    ASTLabelType=BaseNode; 
    TokenLabelType=Atom;
}

tokens {
    D_ARG;        	// D_ declaration
    D_ARR;
    D_ARR_DIM;
    D_CLASS;
    D_COMPOSITION;
    D_ENUM;
    D_ENUMVAL;    
    D_FCN_CTOR;
    D_FCN_DCL;
    D_FCN_DEF;
    D_FCN_REF;
    D_FCN_TYP_NM;
    D_FORMAL;
    D_FIELD;  
    D_INJ;
    D_INSTANCE; 
    D_META;
    D_MODULE;
    D_PROTOCOL;
    D_VAR;
    
    DELIM;
    E_ADDR; 		// E_ expression
    E_BINARY;
    E_CALL;
    E_CONST;
    E_EXPR;
    E_HASH;
    E_IDENT;
    E_INDEX;
    E_INJ;
    E_NUMLIT;
    E_NEW;
    E_PAREN;
    E_QUEST;
    E_SELF;
    E_TYP;
    E_UNARY;
    E_VEC;
    EXPORT;
    FCNBODY;
    HOST;
    IMPORT;
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
    S_ELIF;
    S_EXPR;
    S_FOR;
    S_FOREACH;
    S_IF;
    S_INJ;
    S_PACKAGE;
    S_PRINT;
    S_PROVIDED;
    S_RETURN;
    S_SWITCH;
    S_WHILE;
    T_ARR;
    T_FCN;
    T_LST;
    T_USR;
    T_STD;
    UNIT;
    VOID;
    // rsvd
    THIS = 'this';
}

@parser::header {
    package com.amaret.pollen.parser;
    import java.util.EnumSet;
    import java.util.ArrayList;
    import java.lang.*;
    import java.io.*;
    import com.amaret.pollen.parser.*;
}
@parser::members {

	private boolean isMetaInstance = false;
	private boolean isEmptyMetaArgs = false; // deferred instantiation
	private UnitNode client = null;
	private ImportNode clientImport = null;
	// Trigger meta instantiation via this constructor
	public pollenParser(TokenStream tokens, UnitNode cl, ImportNode cli) {
	    this(tokens, new RecognizerSharedState());
	    isMetaInstance = (cl != null && cli != null); 
	    client = cl;
	    clientImport = cli;
	    isEmptyMetaArgs = (cli != null && cli.getMeta() != null && cli.getMeta().size() == 0);
	}
	    
    EnumSet<Flags> atFlags = EnumSet.noneOf(Flags.class);
    
   private class TypeInfo {
    	public EnumSet<Flags> getUnitFlags() {
			return uf;
		}
		public void setUnitFlags(EnumSet<Flags> unitFlags) {
			uf.addAll(unitFlags);
		}
		public String getTypeName() {
			return tn;
		}
		public void setTypeName(String typeName) {
			this.tn = typeName;
		}
		EnumSet<Flags> uf = EnumSet.noneOf(Flags.class);
    	String tn = "";  
    }
    ArrayList<TypeInfo> tl = new ArrayList<TypeInfo>();
    TypeInfo ti;
    
    String getInject(String text) {
        	return text.substring(text.indexOf("{")+1,text.lastIndexOf("}"));
    }
    
    void DBG(String dbg) {
    	System.out.println(dbg);
    }
    // Override to extract PollenException message when present
    public void displayRecognitionError(String[] tokenNames,
                                        RecognitionException e) {
        String hdr = getErrorHeader(e);
        String msg = getErrorMessage(e, tokenNames);
        if ( e instanceof PollenException) {
        			msg = e.toString();
        }
        hdr = pollenLexer.getFileName()+ ", " + hdr;
        emitErrorMessage(hdr+" "+msg);       
    }

    String pkgName;
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
    package com.amaret.pollen.parser;
    import java.util.EnumSet;
    import com.amaret.pollen.parser.Atom;
    }
@lexer::members {
    private static String fileName = "";
    private int implicitLineJoiningLevel = 0;
    private static int lineNum = 0;
    private int startPos = -1;
    
    public static String getFileName() {
    	return fileName;
    }
    public static int getLineNum() {
      return lineNum;
    }
    
     
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
        // Synthesized tokens don't have these set:
        pollenLexer.fileName = fileName;
        pollenLexer.lineNum = state.tokenStartLine;
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
    	ParseUnit.current().reportError(e, getErrorMessage(e, getTokenNames()));
    }
}
unit
    :   (NL)* unitPackage   -> ^(UNIT<UnitNode>["UNIT"] unitPackage)  
    ;
unitPackage
scope {
	Object unitImports;
}
	:  stmtPackage
	   importList {$unitPackage::unitImports = $importList.tree;}
      stmtInjectionList
      unitTypeDefinition
      stmtInjectionList
      pollenEOF
	;
pollenEOF
	:	EOF!
	;
catch [java.lang.ClassCastException e] {
    //ignore: antlr bug
}
stmtInjectionList 
	:(stmtInjection)* -> ^(LIST<ListNode>["LIST"] stmtInjection*)
	;
stmtPackage
@init {
   String pkg = ParseUnit.mkPackageName(ParseUnit.current().getCurrPath());
}
	: 'package' qualName delim	-> ^(S_PACKAGE[pkg] qualName)
	|	-> ^(S_PACKAGE[pkg]) 
	;
stmtExport
    :   'export' qualName delim -> ^(EXPORT<ExportNode>["EXPORT"] qualName)
    ;
exportList
    :   stmtExport+  
    	-> ^(LIST<ListNode>["LIST"] stmtExport+)
    ;
classDefinition  
@init {
	if (tl.size() > 1) { // nested class
	  ti = new TypeInfo();
	  tl.add(ti);		
	}	
	String qual = "";
}
@after{
	if (tl.size() > 1) {
   	tl.remove(tl.size()-1);
   	ti = tl.get(tl.size()-1);
   }
}
	:	'class' IDENT
			{ 
	      	ti.setTypeName($IDENT.text); ti.setUnitFlags(EnumSet.of(Flags.CLASS));
	      	if (isMetaInstance && clientImport.getAs() != null && !clientImport.getAs().equals("NIL")) {
	      		// if there is an 'as' name in the instantiating context, qualify the unit name 
	      		qual = clientImport.getAs().getText();
	      	}
	      }
		(implementsClause)
		braceOpen classFeatureList braceClose
		-> ^(D_CLASS<DeclNode.Class>["D_CLASS", ti.getUnitFlags(), qual] 
		IDENT classFeatureList implementsClause {$unitTypeDefinition::meta} {$unitTypeDefinition::metaImports})
		;
classFeatureList
	:	classFeature*	-> ^(LIST<ListNode>["LIST"] classFeature*)
	;
classFeature
    :   fcnDefinition 
    |   enumDefinition
    |   fieldDeclaration
    |	  classDefinition
    |	  injectionDecl
    ; 
moduleDefinition 
@init{
	String qual="";
}
	:	   'module' IDENT
	      { 
	      	ti.setTypeName($IDENT.text); ti.setUnitFlags(EnumSet.of(Flags.MODULE));
	      	if (isMetaInstance && clientImport.getAs() != null && !clientImport.getAs().equals("NIL")) {
	      		// if there is an 'as' name in the instantiating context, qualify the unit name 
	      		qual = clientImport.getAs().getText();
	      	}
	      }
			(implementsClause) 
			braceOpen moduleFeatureList braceClose 
			-> ^(D_MODULE<DeclNode.Usr>["D_MODULE", ti.getUnitFlags(), qual] 
			IDENT moduleFeatureList implementsClause {$unitTypeDefinition::meta} {$unitTypeDefinition::metaImports})
	;
moduleFeatureList
	:	moduleFeature*	-> ^(LIST<ListNode>["LIST"] moduleFeature*)
	;
moduleFeature
	:   fcnDefinition
   |   varDeclaration
	|   enumDefinition
	|   classDefinition
	|	 injectionDecl
    ;
enumDefinition 
@init {
	if (tl.size() > 1) { // nested 
	  ti = new TypeInfo();
	  tl.add(ti);	
	}	
	 String qual = "";	
}
@after{
	if (tl.size() > 1) {
   	tl.remove(tl.size()-1);
   	ti = tl.get(tl.size()-1);
   }
}
	:  'enum'(IDENT 
		{ ti.setTypeName($IDENT.text); ti.setUnitFlags(EnumSet.of(Flags.ENUM));
			if (isMetaInstance && clientImport.getAs() != null && !clientImport.getAs().equals("NIL")) {
	      	// if there is an 'as' name in the instantiating context, qualify the unit name 
	      	qual = clientImport.getAs().getText();
	      }
		}
		braceOpen enumList braceClose)
		-> ^(D_ENUM<DeclNode.Usr>["D_ENUM", ti.getUnitFlags(), qual] 
		IDENT enumList {$unitTypeDefinition::meta} {$unitTypeDefinition::metaImports})
	;
enumList
	:	enumElement (',' enumElement)* -> ^(LIST<ListNode>["LIST"] enumElement+)
	;
enumElement
	:	IDENT ASSIGN INT_LIT (delim)? -> ^(D_ENUMVAL<DeclNode.EnumVal>["D_ENUMVAL", ti.getUnitFlags()] ^(IDENT INT_LIT))
	|	IDENT (delim)?	-> ^(D_ENUMVAL IDENT)
	;
protocolDefinition
@init{
	String qual="";
}
	:	'protocol' IDENT
		{ ti.setTypeName($IDENT.text); ti.setUnitFlags(EnumSet.of(Flags.PROTOCOL));
			if (isMetaInstance && clientImport.getAs() != null && !clientImport.getAs().equals("NIL")) {
	      	// if there is an 'as' name in the instantiating context, qualify the unit name 
	      	qual = clientImport.getAs().getText();
	      }
		}
		extendsClause
		braceOpen protocolFeatureList braceClose 
		-> ^(D_PROTOCOL<DeclNode.Usr>["D_PROTOCOL", ti.getUnitFlags(), qual] 
		IDENT protocolFeatureList extendsClause {$unitTypeDefinition::meta} {$unitTypeDefinition::metaImports})
	;
protocolFeatureList
	:	protocolFeature*	-> ^(LIST<ListNode>["LIST"] protocolFeature*)
	;
protocolFeature
    :   enumDefinition
    |   fcnDeclaration 
    |	  injectionDecl
    ;
compositionDefinition
@init{
	String qual="";
}
	:	'composition' IDENT
		{ 
		  ti.setTypeName($IDENT.text); 
		  ti.setUnitFlags(EnumSet.of(Flags.COMPOSITION));
		  if (isMetaInstance && clientImport.getAs() != null && !clientImport.getAs().equals("NIL")) {
	      	// if there is an 'as' name in the instantiating context, qualify the unit name 
	      	qual = clientImport.getAs().getText();
	      }		  
		}
		extendsClause  
		braceOpen compositionFeatureList braceClose 
			-> ^(D_COMPOSITION<DeclNode.Usr>["D_COMPOSITION", ti.getUnitFlags(), qual] 
			     IDENT compositionFeatureList extendsClause {$unitTypeDefinition::meta} {$unitTypeDefinition::metaImports})
	;
compositionFeatureList
	:	compositionFeature*	-> ^(LIST<ListNode>["LIST"] compositionFeature*)
	;
compositionFeature
 	:  stmtExport
   |  fcnDefinitionHost
   |  enumDefinition
   |  varDeclaration
   |	injectionDecl
 	;
stmtImport
    :   (importFrom
         qualName (metaArguments)?
         importAs delim) -> ^(IMPORT<ImportNode>["IMPORT"] importFrom qualName importAs metaArguments?)
    ;
importFrom
@init{
	String defaultPkg = "";
	String path = this.getTokenStream().getSourceName();
   int k = path.lastIndexOf(File.separator);
   int j = path.lastIndexOf(File.separator, k-1);
    j = j == -1 ? 0 : j+1;
    // the default package is the containing directory
    defaultPkg = path.substring(j, k);
}
    :   'from' qualName 'import' -> qualName
    |		'import' -> IDENT[defaultPkg]
    ;
importAs
	:	'as' qualName -> qualName
	|	-> NIL
	;

importList
	:  stmtImports
	;
stmtImports
	:	((importFrom) => stmtImport+) -> ^(LIST<ListNode>["LIST"]  stmtImport+ )
	|	-> ^(LIST<ListNode>["LIST"])
	;
meta 
@init {
}
// Instantiate the meta parameters if this is an instantiation parse.
//    If '{}' is passed, instantiate to defaults.
//    This will be a void instance: no output.
	:	{isMetaInstance}? 'meta'	
	      { ti.setUnitFlags(EnumSet.of(Flags.META));}
			importList { $unitTypeDefinition::metaImports = $importList.tree; }
			(braceOpen 
				metaParmsGen
			 braceClose) 
	|	'meta' // UNCALLED NOW
			{ 	ti.setUnitFlags(EnumSet.of(Flags.META));  }
			importList { $unitTypeDefinition::metaImports = $importList.tree; }
			(braceOpen formalParameters braceClose)
	 	 		-> formalParameters

	|  { isMetaInstance = false;} -> LIST<ListNode>["LIST"] { $unitTypeDefinition::metaImports = (BaseNode)adaptor.create(NIL, "NIL") }
										
	;
	
metaParmsGen
scope {
	int idx;
	List<Object> l;
}
@init {
	$metaParmsGen::idx = 0;
	$metaParmsGen::l = new ArrayList<Object>();	
}
@after {
 	for (Object o : $metaParmsGen::l) {
 		if (o instanceof ImportNode) {
 			// add the instantiated import to unit imports
 			((CommonTree) $unitPackage::unitImports).addChild((ImportNode) o);			
 		}
 	}
}
	:	m1=metaParmGen { $metaParmsGen::l.add($m1.tree); }
		(','! 
			m2=metaParmGen { $metaParmsGen::l.add($m2.tree); }
		)*
	;
  /**************
    To instantiate with type parameters.
    Given:
      package pkgy
      meta {type T} module y 
    if imported as: 
      package pkyz
      from pkgm import modulem
      from pkgy import y{ modulem } as x
    then instantiate as: 
      package pkyz
      from pkgm import modulem as T
      module y
    The 'meta' declaration generates an import 
    when instantiated.
  **************/
metaParmGen 
@init {
	// for import stmt 
	String name = "";
	String as = "";
	String from = ""; 
	ExprNode.Const arg = null;	
	EnumSet<Flags> flags = EnumSet.noneOf(Flags.class);		
	String ctext = "";
	EnumSet<LitFlags> lf = EnumSet.noneOf(LitFlags.class);
	if (isEmptyMetaArgs) {
		//Atom v = new Atom(new CommonToken(pollenLexer.VOID, "void"));
		//BaseNode bv = new BaseNode(v);
		//clientImport.getMeta().add(bv);
		ti.setUnitFlags(EnumSet.of(Flags.VOID_INSTANCE));
	}
	else 	if (clientImport.getMeta() != null && clientImport.getMeta().size() < $metaParmsGen::idx+1) {
		  throw new PollenException("Not enough parameters to instantiate meta type", input);
	}
}
@after {
	$metaParmsGen::idx++;
}
	:	'type' IDENT ( '=' typeName {name = $typeName.text;})?
			{ 
			   flags.add(Flags.TYPE_META_ARG); 
			   // get 'as' name
				as = $IDENT.text;
		    	// get 'from' pkg
		    	for (ImportNode imp: client.getImports()) {
		    		if (clientImport.getName().getText().equals(imp.getName().getText())) {
		    			from = imp.getFrom().getText();
		    			break;
		    		}
		    	}	
		    	// get import name
		    	if (clientImport.getMeta() == null || isEmptyMetaArgs) {
		    		// instantiate to defaults
		    		if (name.isEmpty()) {
		    			if (isEmptyMetaArgs)
		    				throw new PollenException("Using \'{}\' to instantiate a meta type requires default values for all meta parameters", input);
		    			if (clientImport.getMeta() == null)
		    				throw new PollenException("Instantiating a meta type without parameters requires default values for all meta parameters", input);
		    		}
		    	}
		    	else {
		    		// get instantiation value
		    		BaseNode b = clientImport.getMeta().get($metaParmsGen::idx);
		    		if (b instanceof TypeNode.Usr) {
		    			name = ((TypeNode.Usr) b).getName().getText();		    			
		    		}
		    		else if (b instanceof TypeNode.Std) {
		    			name = ((TypeNode.Std) b).getIdent().getText();		    			
		    		}
		    		else if (b.getType() == pollenLexer.VOID) // deferred instantiation
                   name = b.getText();
		    		else {
		    			throw new PollenException("Meta type parameter requires type to instantiate", input);
		    		}		    		
		    	}

	    	}
	  -> ^(IMPORT<ImportNode>["IMPORT", flags] IDENT[from] IDENT[name] IDENT[as])
	  
	 |   builtinType id=IDENT ('=' primitiveLit { ctext = $primitiveLit.text; } )? 
	 		{
	 			if (clientImport.getMeta() == null || isEmptyMetaArgs) {
		    		// instantiate to defaults
		    		if (ctext.isEmpty()) {
		    			if (isEmptyMetaArgs)
		    				throw new PollenException("Using \'{}\' to instantiate a meta type requires default values for all meta parameters", input);
		    			if (clientImport.getMeta() == null)
		    				throw new PollenException("Instantiating a meta type without parameters requires default values for all meta parameters", input);
		    		}
		    	}
		    	else {

			 		BaseNode b = clientImport.getMeta().get($metaParmsGen::idx);
			 		if (b.getType() != pollenLexer.VOID && !(b instanceof ExprNode.Const)) 
			 			throw new PollenException("Invalid meta value parameter specification (must be a constant)", input);
			 		ctext = b.getText();
			 		lf = EnumSet.noneOf(LitFlags.class);
			 		if (b instanceof ExprNode.Const) {
			 			arg = (ExprNode.Const) b;
			 			ctext = arg.getValue().getText();
			 			EnumSet<LitFlags> formalType = $builtinType.f;
			 			lf = arg.getLitFlags();
			 			if (!(arg.getLitFlags().contains(LitFlags.NUM) && formalType.contains(LitFlags.NUM))) {
			 				if (!(arg.getLitFlags().equals(formalType)))
			 					throw new PollenException("Fomal and actual meta value parameters have inconsistent types", input);	 		
			 			}
			 		}
		 		}
	 		}
		-> ^(D_FORMAL<DeclNode.Formal>["D_FORMAL"]  ^(T_STD<TypeNode.Std>["T_STD", EnumSet.noneOf(Flags.class)] builtinType) IDENT ^(E_CONST<ExprNode.Const>["E_CONST", lf] IDENT[ctext]))
	;
metaArguments
   :  '{' metaArgument  (',' metaArgument)* '}' -> ^(LIST<ListNode>["LIST"] metaArgument+)
   |	'{' '}'      -> LIST<ListNode>["LIST"]	// defer metaArgument binding  
   ;
 	
metaArgument
	:	primitiveLit 
	|	typeNameScalar
	;
typeName
@init{
	//System.out.print("typeName: "); DBG_LT(); <DeclNode.Fcn>["D_FCN_DCL", atFlags]
}
	:	typeNameScalar
	;
typeNameScalar			// scalar as in 'not array'
	:	builtinType	-> ^(T_STD<TypeNode.Std>["T_STD", atFlags] builtinType)
	|	userTypeName
	;
userTypeName
	// Note the commented out syntax is obsolete (a hack to support value{Event} e)
	//:	qualName metaArguments	-> ^(T_USR<TypeNode.Usr>["T_USR", atFlags] qualName metaArguments)
	:	qualName		-> ^(T_USR<TypeNode.Usr>["T_USR", atFlags] qualName)
	;

unitTypeDefinition
scope {
  Object meta; 			// specification of meta type/value parameters
  Object metaImports;	// imports that apply to the meta type instantiation context
}
@init{
		ti = new TypeInfo();
		tl.add(ti);		
}
@after{
   // debug
	System.out.println("       " + ti.getTypeName() + ", " + ti.getUnitFlags().toString());
}
   :   (meta! { $unitTypeDefinition::meta = $meta.tree; })  
     (
         ('module') => moduleDefinition   		
	|     ('class') =>  classDefinition
   |     ('protocol') => protocolDefinition 
   |     ('composition') => compositionDefinition 
   |     ('enum') => enumDefinition 
     )
   ;
extendsClause
    :   'extends' qualName -> qualName
    | 	-> NIL
    ;

implementsClause
    :   'implements' qualName -> qualName
    | -> NIL
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
	:	LT | GT |  LT_EQ  | GT_EQ
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
		-> ^(LIST<ListNode>["LIST"] expr+)
	|	-> LIST<ListNode>["LIST"]
	;
expr
	:	exprLogicalOr '?' expr ':' expr -> ^(E_QUEST<ExprNode.Quest>["E_QUEST"] exprLogicalOr expr expr)
	|	exprLogicalOr 
   ; 		
exprLogicalOr 
	: (exprLogicalAnd -> exprLogicalAnd)
		(
			'||' exprLogicalAnd
				-> ^(E_BINARY<ExprNode.Binary>["E_BINARY"] '||' $exprLogicalOr exprLogicalAnd)
		)*
	;
exprLogicalAnd
	:	(exprBitwiseOr	-> exprBitwiseOr)
	(
		'&&' exprBitwiseOr
			-> ^(E_BINARY<ExprNode.Binary>["E_BINARY"] '&&' $exprLogicalAnd exprBitwiseOr)
	)*
	;
exprBitwiseOr
	:	(exprBitwiseXor -> exprBitwiseXor)
	(
		'|' exprBitwiseXor
		-> ^(E_BINARY<ExprNode.Binary>["E_BINARY"] '|' $exprBitwiseOr exprBitwiseXor)
	)*
	;
exprBitwiseXor
	:	(exprBitwiseAnd -> exprBitwiseAnd)
	(
		'^' exprBitwiseAnd
		-> ^(E_BINARY<ExprNode.Binary>["E_BINARY"] '^' $exprBitwiseXor exprBitwiseAnd)
	)*
	;
exprBitwiseAnd
	:	(exprEquality -> exprEquality)
	(
		'&'	exprEquality
		-> ^(E_BINARY<ExprNode.Binary>["E_BINARY"] '&' $exprBitwiseAnd exprEquality)
	)*
	;
exprEquality
	:	(exprRelational -> exprRelational)
	( 
		equalityOp exprRelational
		-> ^(E_BINARY<ExprNode.Binary>["E_BINARY"] equalityOp $exprEquality exprRelational)
	)*
	;
exprRelational
	:	(exprShift -> exprShift)
	( 
		relationalOp exprShift 
		-> ^(E_BINARY<ExprNode.Binary>["E_BINARY"] relationalOp $exprRelational exprShift)
	)*
	;
exprShift
	:	(exprAddSub -> exprAddSub)
	( 
		shiftOp  exprAddSub 
		-> ^(E_BINARY<ExprNode.Binary>["E_BINARY"] shiftOp $exprShift exprAddSub)
	)*
	;
exprAddSub
	:	(exprMultDiv -> exprMultDiv)
	(
		addSubOp	exprMultDiv
		-> ^(E_BINARY<ExprNode.Binary>["E_BINARY"] addSubOp $exprAddSub exprMultDiv)
        )*
	;
exprMultDiv
	:	(exprUnary -> exprUnary)
	(
		multDivModOp exprUnary
		-> ^(E_BINARY<ExprNode.Binary>["E_BINARY"] multDivModOp $exprMultDiv exprUnary)
	)*
	;
exprNew
	:	'new' typeName fcnArgumentList -> ^(E_NEW<ExprNode.New>["E_NEW"] typeName fcnArgumentList)
	;
exprUnary
	:	primitiveLit
	|	injectionCode
	|	arrayLit						-> ^(E_VEC<ExprNode.Vec>["E_VEC"] arrayLit)
	|	logicalNotOp expr	 		-> ^(E_UNARY<ExprNode.Unary>["E_UNARY"]  expr logicalNotOp)
	|	bitwiseNotOp expr  		-> ^(E_UNARY<ExprNode.Unary>["E_UNARY"]  expr bitwiseNotOp)
	|	'(' expr ')'				-> ^(E_PAREN<ExprNode.Paren>["E_PAREN"] expr)
	|	MINUS expr					-> ^(E_UNARY<ExprNode.Unary>["E_UNARY"]  expr MINUS)
	|	varOrFcnOrArray incDecOp -> ^(E_UNARY<ExprNode.Unary>["E_UNARY", true] varOrFcnOrArray incDecOp)
	|	varOrFcnOrArray
	|	incDecOp varOrFcnOrArray -> ^(E_UNARY<ExprNode.Unary>["E_UNARY"] varOrFcnOrArray incDecOp)
	|	exprNew
	;
fcnDefinition
@init {
	EnumSet<Flags> atFlags = EnumSet.noneOf(Flags.class);		
}
	: ('public' { atFlags.add(Flags.PUBLIC); } )? 
		('host' { atFlags.add(Flags.HOST); } )? 
		fcnType_fcnName formalParameterList fcnBody[$formalParameterList.tree]
		-> ^(D_FCN_DEF<DeclNode.Fcn>["D_FCN_DEF", atFlags] fcnType_fcnName formalParameterList fcnBody)
	;
fcnDefinitionHost
// composition
@init {
	EnumSet<Flags> atFlags = EnumSet.noneOf(Flags.class);		
}
	:	('public')? ('host' { atFlags.add(Flags.HOST); })?
	   	fcnType_fcnName  formalParameterList fcnBody[$formalParameterList.tree]
		{ 	atFlags.add(Flags.PUBLIC); /* enforce */ 	
			if (!atFlags.contains(Flags.HOST))
       		throw new PollenException("Composition features must be one of host functions, export statements, or enum definitions.", input);
		}
		-> ^(D_FCN_DEF<DeclNode.Fcn>["D_FCN_DEF", atFlags] fcnType_fcnName formalParameterList fcnBody)		
	;
catch [PollenException re] {
    String hdr = getErrorHeader(re);
    String msg = re.toString();
    emitErrorMessage(hdr+" "+msg);
}
fcnAttr
	:	('public' { atFlags.add(Flags.PUBLIC); } )? 
		('host' { atFlags.add(Flags.HOST); } )?
	;
fcnBody[CommonTree formals]
  :	braceOpen (stmts)  braceClose  -> ^(FCNBODY<BodyNode>["FCNBODY"] {$formals} stmts) 
  ;
fcnDeclaration
scope {
  EnumSet<Flags> flags;
}
@init {
	$fcnDeclaration::flags = EnumSet.noneOf(Flags.class);	
}
   :	('public' { atFlags.add(Flags.PUBLIC); } )? 
		('host' { atFlags.add(Flags.HOST); } )? 
		fcnType_fcnName (formalParameterList) delim
   -> ^(D_FCN_DCL<DeclNode.Fcn>["D_FCN_DCL", atFlags] fcnType_fcnName formalParameterList)
   ;
fcnType_fcnName
// function names in a dcln can be qualified, e.g. pollen.reset()
// function return is always a list, empty for void fcn.
// module constructors have the name "init", class constructors have the name "new"
	:	typeName qualName  
		-> ^(D_FCN_TYP_NM<DeclNode.FcnTyp>["D_FCN_TYP_NM"]  ^(T_LST<TypeNode.Lst>["T_LST", atFlags] ^(LIST<ListNode>["LIST"] typeName)) qualName)      // int myfcn()
	|	{input.LT(1).getText().equals(ti.getTypeName()) && !(ti.getUnitFlags().contains(Flags.CLASS)) }? 
		typeName	         // NOT a class constructor: returns void
		{ 
		  atFlags.add(Flags.CONSTRUCTOR); 
		}
		-> ^(D_FCN_CTOR<DeclNode.FcnTyp>["D_FCN_CTOR"] 
			^(T_LST<TypeNode.Lst>["T_LST", atFlags] 
			^(LIST<ListNode>["LIST"] ^(T_STD<TypeNode.Std>["T_STD", atFlags] VOID["void"]))) 
			IDENT["init"]) 		  
	|	{input.LT(1).getText().equals(ti.getTypeName()) }? // Class constructor
		typeName	 
		{ 
		  atFlags.add(Flags.CONSTRUCTOR); 
		}
		-> ^(D_FCN_CTOR<DeclNode.FcnTyp>["D_FCN_CTOR"] ^(T_LST<TypeNode.Lst>["T_LST", atFlags] ^(LIST<ListNode>["LIST"] typeName)) IDENT["new"]) 		  // constructor
	|	qualName 	
		{ atFlags.add(Flags.VOID_FCN); }
		-> ^(D_FCN_TYP_NM<DeclNode.FcnTyp>["D_FCN_TYP_NM"] ^(T_LST<TypeNode.Lst>["T_LST", atFlags] 
				^(LIST<ListNode>["LIST"] ^(T_STD<TypeNode.Std>["T_STD", atFlags] VOID["void"]))) qualName)      //  returns void
	|	('(' typeName (',' typeName)* ')' qualName) => fcnTypes_fcnName	// multiple returns
	;
fcnTypes_fcnName
	:	'(' fcnTypes ')' qualName -> ^(D_FCN_TYP_NM<DeclNode.FcnTyp>["D_FCN_TYP_NM"]  fcnTypes qualName)
	;
fcnTypes
	:	typeName (',' typeName)* -> ^(T_LST<TypeNode.Lst>["T_LST", atFlags] ^(LIST<ListNode>["LIST"] typeName+))
	;
formalParameterList
	:	'(' formalParameters ')' -> formalParameters
	;
methodParameters
@init {
	EnumSet<Flags> mFlags = EnumSet.noneOf(Flags.class);		
}
// class methods (except constructors) are hacked to pass a ptr to their struct as a first parameter: implementation of 'this' ptr.
	:	formalParameter (',' formalParameter)* 
		-> ^(LIST<ListNode>["LIST"] 
			^(D_FORMAL<DeclNode.Formal>["D_FORMAL", mFlags] ^(T_USR<TypeNode.Usr>["T_USR", mFlags] IDENT[ti.getTypeName()]) IDENT["this"])
			formalParameter+)
	|	-> ^(LIST<ListNode>["LIST"] 
			^(D_FORMAL<DeclNode.Formal>["D_FORMAL", atFlags] ^(T_USR<TypeNode.Usr>["T_USR", atFlags] IDENT[ti.getTypeName()]) IDENT["this"]))
	;
formalParameters
	:	{(ti.getUnitFlags().contains(Flags.CLASS) && !(atFlags.contains(Flags.CONSTRUCTOR))) }? methodParameters
	|	formalParameter (',' formalParameter)* 
		-> ^(LIST<ListNode>["LIST"] formalParameter+)
	|	-> ^(LIST<ListNode>["LIST"])
	;
formalParameter
@init {
	EnumSet<Flags> pFlags = EnumSet.noneOf(Flags.class);		
}
	: 	 'type' IDENT ( '=' t=typeName)?
			{ pFlags.add(Flags.TYPE_META_ARG); } // meta formal arguments only
		-> ^(D_FORMAL<DeclNode.Formal>["D_FORMAL", pFlags] 
			^(T_USR<TypeNode.Usr>["T_USR", pFlags] IDENT) 
			IDENT ^(E_TYP<ExprNode.Typ>["E_TYP"] typeName)?)
	|   typeName IDENT ( '=' expr)?
		-> ^(D_FORMAL<DeclNode.Formal>["D_FORMAL"] typeName IDENT (expr)?)

	;
fcnArgumentList
	:	'(' fcnArguments ')'	->  fcnArguments
	;
fcnArguments
	:	exprList
	;
varOrFcnOrArray
	:	'new' typeName fcnArgumentList fieldOrArrayAccess?
		-> ^(E_NEW<ExprNode.New>["E_NEW"] typeName fcnArgumentList fieldOrArrayAccess?)
	|	'@' IDENT fcnArgumentList fieldOrArrayAccess? 
		-> ^(E_SELF<ExprNode.Self>["E_SELF"] 
			^(E_CALL<ExprNode.Call>["E_CALL"] ^(E_IDENT<ExprNode.Ident>["E_IDENT"] IDENT) fcnArgumentList fieldOrArrayAccess?))
	|	'@'	IDENT fieldOrArrayAccess? 	  
		-> ^(E_SELF<ExprNode.Self>["E_SELF"] ^(E_IDENT<ExprNode.Ident>["E_IDENT"] IDENT fieldOrArrayAccess?))
	|	'@'	
		-> ^(E_SELF<ExprNode.Self>["E_SELF"])
	|	qualName fcnArgumentList fieldOrArrayAccess? 
		-> ^(E_CALL<ExprNode.Call>["E_CALL"] ^(E_IDENT<ExprNode.Ident>["E_IDENT"] qualName) fcnArgumentList fieldOrArrayAccess?)
	|	qualName fieldOrArrayAccess? -> ^(E_IDENT<ExprNode.Ident>["E_IDENT"] qualName fieldOrArrayAccess?)
	;
fieldOrArrayAccess
	:	 (fieldAccess | arrayAccess)+
	;
fieldAccess
	:	'.'	IDENT fcnArgumentList	-> ^(E_CALL<ExprNode.Call>["E_CALL", true] IDENT  fcnArgumentList)
	|	'.'	IDENT 	-> ^(E_IDENT<ExprNode.Ident>["E_IDENT"] IDENT)
	;
arrayAccess
	:	'['	(exprList)?	']'	-> ^(E_INDEX exprList?)
	;
	
	
stmtBlock
	:	braceOpen stmts braceClose	 -> ^(S_BLOCK<StmtNode.Block>["S_BLOCK"] stmts)
	;
stmts
	:	(stmt)+ -> ^(LIST<ListNode>["LIST"] stmt+) 
	|	(NL*) -> LIST<ListNode>["LIST"]
	;
stmt
	:  stmtDecl
	|  stmtAssign
	|	stmtAssert
	|	stmtBind
	|	stmtBlock
	|	stmtPrint
	|	stmtReturn
	|	stmtBreak
	|  stmtContinue
	|  stmtFor
	|	stmtSwitch
	|  stmtDoWhile
	|	stmtIf
	|	stmtProvided
	|	stmtWhile 
	|	stmtInjection
	|	expr delim -> ^(S_EXPR<StmtNode.Expr>["S_EXPR"] expr)
	;
stmtAssign
	:	varOrFcnOrArray ASSIGN expr	delim
		-> ^(S_ASSIGN<StmtNode.Assign>["S_ASSIGN"] ^(E_BINARY<ExprNode.Binary>["E_BINARY", true] ASSIGN varOrFcnOrArray expr))
	|	injectionCode ASSIGN expr		delim
		-> ^(S_ASSIGN<StmtNode.Assign>["S_ASSIGN"] ^(E_BINARY<ExprNode.Binary>["E_BINARY", true] ASSIGN injectionCode expr))
	|	varOrFcnOrArray assignOp expr  delim
		-> ^(S_ASSIGN<StmtNode.Assign>["S_ASSIGN"] ^(E_BINARY<ExprNode.Binary>["E_BINARY", true] assignOp varOrFcnOrArray expr))
	|	injectionCode assignOp expr	delim
		-> ^(S_ASSIGN<StmtNode.Assign>["S_ASSIGN"] ^(E_BINARY<ExprNode.Binary>["E_BINARY", true] assignOp injectionCode expr))
	;
stmtAssert
	:	'assert' exprList	delim -> ^(S_ASSERT exprList)
	;
stmtBind
	:	varOrFcnOrArray BIND  expr	 delim -> ^(S_BIND<StmtNode.Bind>["S_BIND"] varOrFcnOrArray  expr)	
	;
stmtPrint
@init {
	EnumSet<Flags> flags = EnumSet.noneOf(Flags.class);
}
	:	'print' (stmtPrintTarget[flags])? exprList	
		-> ^(S_PRINT<StmtNode.Print>["S_PRINT", flags] exprList)
	;
stmtPrintTarget[EnumSet<Flags> f]
	:	
		(	  'log'  {f.add(Flags.LOG); }
			| 'err'	{f.add(Flags.ERR); }
			| 'out'  {f.add(Flags.OUT); }
		)
	;
stmtReturn
// Note rules below require that returns of multiple values be surrounded by parens.
// This is required to disambiguate with question mark expression.
// ^(E_VEC<ExprNode.Vec>["E_VEC"]
	:	'return' ('(') (expr (',' expr)+) (')') delim	
		-> ^(S_RETURN<StmtNode.Return>["S_RETURN"] ^(E_VEC<ExprNode.Vec>["E_VEC"] ^(LIST<ListNode>["LIST"] expr+)))
	|	'return'  (expr)  delim	
		-> ^(S_RETURN<StmtNode.Return>["S_RETURN"] ^(E_VEC<ExprNode.Vec>["E_VEC"] ^(LIST<ListNode>["LIST"] expr)))
	;
stmtBreak
	:	'break' delim -> ^(S_BREAK<StmtNode.Break>["S_BREAK"])
	;
stmtContinue
	:	'continue' delim -> ^(S_CONTINUE<StmtNode.Continue>["S_CONTINUE"])
	;
stmtFor
    :   'for' '(' stmtForInit stmtForCond stmtForNext ')' stmtBlock
            -> ^(S_FOR<StmtNode.For>["S_FOR"] stmtForInit stmtForCond stmtForNext stmtBlock)
    ;
stmtForCond
    :   SEMI
           -> NIL
    |   expr SEMI -> expr
    ;

stmtForInit
    :   SEMI
            -> NIL
    |   typeName IDENT '=' expr SEMI
            -> ^(S_DECL<StmtNode.Decl>["S_DECL"] 
      		   ^(D_VAR<DeclNode.Var>["D_VAR", EnumSet.noneOf(Flags.class)] typeName IDENT expr))
    |   stmtAssign
    ;
stmtForNext
    :   //empty
            -> NIL
    |   expr
    ;
    /*
    Implement after collections are available.
stmtForEach
	:	'foreach' '(' IDENT 'in' expr ')' stmtBlock -> ^(S_FOREACH IDENT ^(E_IDENT expr) stmtBlock)
	;
	*/
stmtSwitch
	:	'switch' '(' expr ')' braceOpen stmtsCase stmtDefault? braceClose	-> ^(S_SWITCH<StmtNode.Switch>["S_SWITCH"]  expr stmtsCase stmtDefault?)
	;
stmtsCase
	:	stmtCase* -> ^(LIST<ListNode>["LIST"] stmtCase*)
	;
stmtDefault
	:	'default'	':' NL* stmts	-> ^(S_CASE<StmtNode.Case>["S_CASE"] stmts)
	;
stmtCase
	:	'case' (INT_LIT)	':' NL* stmts	-> ^(S_CASE<StmtNode.Case>["S_CASE"] stmts INT_LIT)
	;
stmtDoWhile
	:	'do' stmtBlock 'while' '(' expr ')' delim 	-> ^(S_WHILE<StmtNode.While>["S_WHILE", true] expr stmtBlock)
	;
stmtIf
	:	'if' stmtIfBlock stmtsElif stmtElse?	-> ^(S_IF<StmtNode.If>["S_IF"] stmtIfBlock stmtsElif stmtElse?)
	;
stmtIfBlock
	:	'(' expr ')' stmtBlock -> expr stmtBlock
	;
stmtsElif
	:	stmtElif* -> ^(LIST<ListNode>["LIST"] stmtElif*)
	;
stmtElif
	:	'elif' stmtIfBlock -> ^(S_ELIF<StmtNode.Elif>["S_ELIF"] stmtIfBlock)
	;
stmtElse
	:	'else' stmtBlock -> stmtBlock
	;
stmtProvided
	:	'provided' '(' expr ')' stmtBlock (stmtElse)?
		-> ^(S_PROVIDED<StmtNode.Provided>["S_PROVIDED"] expr stmtBlock stmtElse?)
	;
stmtWhile
	:	'while' '('	expr')' stmtBlock -> ^(S_WHILE<StmtNode.While>["S_WHILE"] expr stmtBlock)
	;
stmtDecl
@init {
	atFlags = EnumSet.noneOf(Flags.class);			
}
   :	 varAttr varDecl delim	-> ^(S_DECL<StmtNode.Decl>["S_DECL"] varDecl)
   ;
fieldDeclaration    
@init {
	atFlags = EnumSet.noneOf(Flags.class);		
	atFlags.add(Flags.FIELD);
}
   :	 varAttr varDecl delim	-> varDecl
   ;
varDeclaration    
@init {
	atFlags = EnumSet.noneOf(Flags.class);		
}
   :	 varAttr varDecl delim	-> varDecl
   ;
varAttr
	:	(	 'const' { atFlags.add(Flags.CONST); }
		|	 'volatile' { atFlags.add(Flags.VOLATILE); }
		|   'host' { atFlags.add(Flags.HOST); } 
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
	|	 'new' t=typeName IDENT fcnArgumentList  // declaration of an instance ('new')
		 { atFlags.add(Flags.NEW); } 
		-> ^(D_VAR<DeclNode.Var>["D_VAR", atFlags] $t
		     IDENT ^(E_NEW<ExprNode.New>["E_NEW"] $t fcnArgumentList))
	;
varFcnRef
	: typeName fcnRefTypeList IDENT 
		-> ^(D_FCN_REF<DeclNode.FcnRef>["D_FCN_REF", atFlags] typeName fcnRefTypeList IDENT) 
	;
fcnRefTypeList
	: '(' fcnRefTypes ')' -> fcnRefTypes
	;
fcnRefTypes
	:	typeName (',' typeName)* 
		-> ^(LIST<ListNode>["LIST"] typeName+)
	|	-> ^(LIST<ListNode>["LIST"])
	;
varArray
	:	typeName IDENT varArraySpec ('=' initializer)? 
	->  ^(D_ARR<DeclNode.Arr>["D_Arr", atFlags] typeName IDENT varArraySpec initializer?)
	;	
varArraySpec
	:	('[' varDim ']')+	->   ^(LIST<ListNode>["LIST"] varDim+)
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
	: initializer (',' initializer)* -> ^(LIST<ListNode>["LIST"] initializer+)
	;
varDeclList  // int x, y=3, z=3, a
@init {
	assert $varDecl::typ != null;
}  
	:	varBuiltInType! {$varDecl::typ = $varBuiltInType.tree; } varInit2 (','! varInit2)*
	|	userTypeName! {$varDecl::typ = $userTypeName.tree; } varInit (','! varInit)*
	;	
varBuiltInType
	:	builtinType -> ^(T_STD<TypeNode.Std>["T_STD", atFlags] builtinType)
	;
varInit2		// built in type
	:	IDENT ASSIGN expr
		-> ^(D_VAR<DeclNode.Var>["D_VAR", atFlags] {$varDecl::typ} 
			IDENT expr)
	| IDENT
		-> ^(D_VAR<DeclNode.Var>["D_VAR", atFlags] {$varDecl::typ} IDENT)
	;
varInit	// user defined type
	: 	IDENT BIND expr { atFlags.add(Flags.PROTOCOL_MEMBER); }	
		-> ^(D_VAR<DeclNode.TypedMember>["D_VAR", atFlags] {$varDecl::typ} IDENT expr?)
	|	IDENT ASSIGN expr
	-> ^(D_VAR<DeclNode.TypedMember>["D_VAR", atFlags] {$varDecl::typ} 
		IDENT expr)
	|	IDENT 
	-> ^(D_VAR<DeclNode.TypedMember>["D_VAR", atFlags] {$varDecl::typ} IDENT)
	;

builtinType  returns [EnumSet<LitFlags> f]
    :   'bool'		{$f = EnumSet.noneOf(LitFlags.class); $f.add(LitFlags.BOOL);}
    |   'byte'		{$f = EnumSet.noneOf(LitFlags.class); $f.add(LitFlags.CHR);}
    |   'int8'		{$f = EnumSet.noneOf(LitFlags.class); $f.add(LitFlags.NUM);}
    |   'int16'	{$f = EnumSet.noneOf(LitFlags.class); $f.add(LitFlags.NUM);}
    |   'int32'   {$f = EnumSet.noneOf(LitFlags.class); $f.add(LitFlags.NUM);}
    |   'string'  {$f = EnumSet.noneOf(LitFlags.class); $f.add(LitFlags.STR);}
    |   'uint8'	{$f = EnumSet.noneOf(LitFlags.class); $f.add(LitFlags.NUM);}
    |   'uint16'	{$f = EnumSet.noneOf(LitFlags.class); $f.add(LitFlags.NUM);}
    |   'uint32'	{$f = EnumSet.noneOf(LitFlags.class); $f.add(LitFlags.NUM);}
    ;
    
qualName
scope {
  String s; 
}
@init {
	$qualName::s = "";
}
@after {
	//System.out.println("Qual : "  + $qualName::s);
}      
    :	   IDENT (qualNameList?)  -> IDENT[$IDENT.text + $qualName::s]
    ;

qualNameList 
	:
	(   '.'!     
        IDENT! {$qualName::s += "." + $IDENT.text;}
    )+	 
	; 
    		
arrayLit		// anonymous arrays
	:	'['	arrayLitList	']'	-> ^(LIST<ListNode>["LIST"] arrayLitList)
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
	: ('true' | 'false') { $primitiveLit::litFlags.add(LitFlags.BOOL);}
	;
nullLit
	:	'null' {$primitiveLit::litFlags.add(LitFlags.NULL);}
	;
numLit
@after {
	$primitiveLit::litFlags.add(LitFlags.NUM);
}
	:	INT_LIT {$primitiveLit::litFlags.add(LitFlags.INT);}	
	| 	OCT_LIT {$primitiveLit::litFlags.add(LitFlags.OCT);}	
	| 	REAL_LIT {$primitiveLit::litFlags.add(LitFlags.REAL);}	
	| 	HEX_LIT  {$primitiveLit::litFlags.add(LitFlags.HEX);}	
	;
// All literals should go through primitiveLit to clear / set LitFlags
primitiveLit 
scope {
	EnumSet<LitFlags> litFlags;
}
@init {
	$primitiveLit::litFlags = EnumSet.noneOf(LitFlags.class);
}
	:	boolLit -> ^(E_CONST<ExprNode.Const>["E_CONST", $primitiveLit::litFlags] boolLit)
	|	numLit  -> ^(E_CONST<ExprNode.Const>["E_CONST", $primitiveLit::litFlags] numLit)
	|	nullLit -> ^(E_CONST<ExprNode.Const>["E_CONST", $primitiveLit::litFlags] nullLit)
	|	STRING  {$primitiveLit::litFlags.add(LitFlags.STR);}  
	   -> ^(E_CONST<ExprNode.Const>["E_CONST", $primitiveLit::litFlags] STRING)
	|	CHAR {$primitiveLit::litFlags.add(LitFlags.CHR);}  
	    -> ^(E_CONST<ExprNode.Const>["E_CONST", $primitiveLit::litFlags] CHAR)
	;
stmtInjection
	:	c=INJECT  {           
            $c.setText(getInject($c.getText()));
        }
	NL+	
	-> ^(S_INJ<StmtNode.Inject> ["S_INJ"] ^(E_INJ<ExprNode.Inject>["E_INJ"] INJECT))
	;
injectionCode
	:	c=INJECT  {           
            $c.setText(getInject($c.getText()));
        } 
	-> ^(E_INJ<ExprNode.Inject>["E_INJ"] INJECT) // don't consume delimiter
	;
injectionDecl
	:	c=INJECT  {           
            $c.setText(getInject($c.getText()));
        }
        NL+
         -> ^(D_INJ<DeclNode.Inject>["D_INJ"] INJECT)
	;	
delim
	:	(SEMI) (NL)*	-> 
	|	(NL)+	-> 
	// needed when the last stmt in a block ends with '}' (no NL or SEMI)
	|	((NL)* '}') =>  NL* -> 
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
MINUS		: ('-');
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
GT			:  '>';
LT			:	'<';
