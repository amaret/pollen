// $ANTLR 3.4 /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g 2012-08-26 18:24:42

    package com.amaret.pollen.parser;
    import java.util.EnumSet;
    import java.util.ArrayList;
    import java.lang.*;
    import java.io.*;
    import com.amaret.pollen.parser.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class pollenParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ADD_EQ", "ASSIGN", "BIND", "BITAND_EQ", "BITOR_EQ", "BITXOR_EQ", "BIT_NOT", "CHAR", "D", "DEC", "DELIM", "DIV_EQ", "D_ARG", "D_ARR", "D_ARR_DIM", "D_CLASS", "D_COMPOSITION", "D_CONST", "D_ENUM", "D_ENUMVAL", "D_FCN_CTOR", "D_FCN_DCL", "D_FCN_DEF", "D_FCN_REF", "D_FCN_TYP_NM", "D_FIELD", "D_FORMAL", "D_INSTANCE", "D_META", "D_MODULE", "D_PROTOCOL", "D_PROTOCOL_MEM", "D_VAR", "E", "EQ", "EXPORT", "E_ADDR", "E_BINARY", "E_CALL", "E_COND", "E_CONST", "E_DEREF", "E_EXPR", "E_HASH", "E_IDENT", "E_INDEX", "E_INJECT", "E_NEW", "E_NUMLIT", "E_PAREN", "E_QUEST", "E_SELF", "E_UNARY", "E_VEC", "FCNBODY", "GT_EQ", "H", "HEX_LIT", "HOST", "I", "IDENT", "IJ_BEG", "IJ_END", "ILLEGAL_CHARACTER", "INC", "INJECT", "INT_LIT", "LIST", "LOG_NOT", "LSHFT_EQ", "LT_EQ", "LU", "MINUS", "ML_COMMENT", "MODULE", "MOD_EQ", "MUL_EQ", "NIL", "NL", "NOT_EQ", "O", "OCT_LIT", "PLUS", "QNAME", "REAL_LIT", "RSHFT_EQ", "SEMI", "SL_COMMENT", "STRING", "SUB_EQ", "S_ASSERT", "S_ASSIGN", "S_BIND", "S_BLOCK", "S_BREAK", "S_CASE", "S_CONTINUE", "S_DECL", "S_ELIF", "S_FOR", "S_FOREACH", "S_IF", "S_IMPORT", "S_PACKAGE", "S_PRINT", "S_PROVIDED", "S_RETURN", "S_SWITCH", "S_WHILE", "T_ARR", "T_FCN", "T_STD", "T_USER_TYPE", "UNIT", "WS", "'%'", "'&&'", "'&'", "'('", "')'", "'*'", "','", "'.'", "'/'", "':'", "'<'", "'<<'", "'>'", "'>>'", "'?'", "'@'", "'['", "']'", "'^'", "'as'", "'assert'", "'bool'", "'break'", "'byte'", "'case'", "'class'", "'composition'", "'const'", "'continue'", "'default'", "'do'", "'elif'", "'else'", "'enum'", "'err'", "'export'", "'extends'", "'false'", "'for'", "'from'", "'host'", "'if'", "'implements'", "'import'", "'int16'", "'int32'", "'int8'", "'log'", "'meta'", "'module'", "'new'", "'null'", "'out'", "'package'", "'print'", "'protocol'", "'provided'", "'public'", "'return'", "'string'", "'switch'", "'true'", "'type'", "'uint16'", "'uint32'", "'uint8'", "'volatile'", "'while'", "'{'", "'|'", "'||'", "'}'"
    };

    public static final int EOF=-1;
    public static final int T__119=119;
    public static final int T__120=120;
    public static final int T__121=121;
    public static final int T__122=122;
    public static final int T__123=123;
    public static final int T__124=124;
    public static final int T__125=125;
    public static final int T__126=126;
    public static final int T__127=127;
    public static final int T__128=128;
    public static final int T__129=129;
    public static final int T__130=130;
    public static final int T__131=131;
    public static final int T__132=132;
    public static final int T__133=133;
    public static final int T__134=134;
    public static final int T__135=135;
    public static final int T__136=136;
    public static final int T__137=137;
    public static final int T__138=138;
    public static final int T__139=139;
    public static final int T__140=140;
    public static final int T__141=141;
    public static final int T__142=142;
    public static final int T__143=143;
    public static final int T__144=144;
    public static final int T__145=145;
    public static final int T__146=146;
    public static final int T__147=147;
    public static final int T__148=148;
    public static final int T__149=149;
    public static final int T__150=150;
    public static final int T__151=151;
    public static final int T__152=152;
    public static final int T__153=153;
    public static final int T__154=154;
    public static final int T__155=155;
    public static final int T__156=156;
    public static final int T__157=157;
    public static final int T__158=158;
    public static final int T__159=159;
    public static final int T__160=160;
    public static final int T__161=161;
    public static final int T__162=162;
    public static final int T__163=163;
    public static final int T__164=164;
    public static final int T__165=165;
    public static final int T__166=166;
    public static final int T__167=167;
    public static final int T__168=168;
    public static final int T__169=169;
    public static final int T__170=170;
    public static final int T__171=171;
    public static final int T__172=172;
    public static final int T__173=173;
    public static final int T__174=174;
    public static final int T__175=175;
    public static final int T__176=176;
    public static final int T__177=177;
    public static final int T__178=178;
    public static final int T__179=179;
    public static final int T__180=180;
    public static final int T__181=181;
    public static final int T__182=182;
    public static final int T__183=183;
    public static final int T__184=184;
    public static final int T__185=185;
    public static final int T__186=186;
    public static final int T__187=187;
    public static final int T__188=188;
    public static final int T__189=189;
    public static final int T__190=190;
    public static final int ADD_EQ=4;
    public static final int ASSIGN=5;
    public static final int BIND=6;
    public static final int BITAND_EQ=7;
    public static final int BITOR_EQ=8;
    public static final int BITXOR_EQ=9;
    public static final int BIT_NOT=10;
    public static final int CHAR=11;
    public static final int D=12;
    public static final int DEC=13;
    public static final int DELIM=14;
    public static final int DIV_EQ=15;
    public static final int D_ARG=16;
    public static final int D_ARR=17;
    public static final int D_ARR_DIM=18;
    public static final int D_CLASS=19;
    public static final int D_COMPOSITION=20;
    public static final int D_CONST=21;
    public static final int D_ENUM=22;
    public static final int D_ENUMVAL=23;
    public static final int D_FCN_CTOR=24;
    public static final int D_FCN_DCL=25;
    public static final int D_FCN_DEF=26;
    public static final int D_FCN_REF=27;
    public static final int D_FCN_TYP_NM=28;
    public static final int D_FIELD=29;
    public static final int D_FORMAL=30;
    public static final int D_INSTANCE=31;
    public static final int D_META=32;
    public static final int D_MODULE=33;
    public static final int D_PROTOCOL=34;
    public static final int D_PROTOCOL_MEM=35;
    public static final int D_VAR=36;
    public static final int E=37;
    public static final int EQ=38;
    public static final int EXPORT=39;
    public static final int E_ADDR=40;
    public static final int E_BINARY=41;
    public static final int E_CALL=42;
    public static final int E_COND=43;
    public static final int E_CONST=44;
    public static final int E_DEREF=45;
    public static final int E_EXPR=46;
    public static final int E_HASH=47;
    public static final int E_IDENT=48;
    public static final int E_INDEX=49;
    public static final int E_INJECT=50;
    public static final int E_NEW=51;
    public static final int E_NUMLIT=52;
    public static final int E_PAREN=53;
    public static final int E_QUEST=54;
    public static final int E_SELF=55;
    public static final int E_UNARY=56;
    public static final int E_VEC=57;
    public static final int FCNBODY=58;
    public static final int GT_EQ=59;
    public static final int H=60;
    public static final int HEX_LIT=61;
    public static final int HOST=62;
    public static final int I=63;
    public static final int IDENT=64;
    public static final int IJ_BEG=65;
    public static final int IJ_END=66;
    public static final int ILLEGAL_CHARACTER=67;
    public static final int INC=68;
    public static final int INJECT=69;
    public static final int INT_LIT=70;
    public static final int LIST=71;
    public static final int LOG_NOT=72;
    public static final int LSHFT_EQ=73;
    public static final int LT_EQ=74;
    public static final int LU=75;
    public static final int MINUS=76;
    public static final int ML_COMMENT=77;
    public static final int MODULE=78;
    public static final int MOD_EQ=79;
    public static final int MUL_EQ=80;
    public static final int NIL=81;
    public static final int NL=82;
    public static final int NOT_EQ=83;
    public static final int O=84;
    public static final int OCT_LIT=85;
    public static final int PLUS=86;
    public static final int QNAME=87;
    public static final int REAL_LIT=88;
    public static final int RSHFT_EQ=89;
    public static final int SEMI=90;
    public static final int SL_COMMENT=91;
    public static final int STRING=92;
    public static final int SUB_EQ=93;
    public static final int S_ASSERT=94;
    public static final int S_ASSIGN=95;
    public static final int S_BIND=96;
    public static final int S_BLOCK=97;
    public static final int S_BREAK=98;
    public static final int S_CASE=99;
    public static final int S_CONTINUE=100;
    public static final int S_DECL=101;
    public static final int S_ELIF=102;
    public static final int S_FOR=103;
    public static final int S_FOREACH=104;
    public static final int S_IF=105;
    public static final int S_IMPORT=106;
    public static final int S_PACKAGE=107;
    public static final int S_PRINT=108;
    public static final int S_PROVIDED=109;
    public static final int S_RETURN=110;
    public static final int S_SWITCH=111;
    public static final int S_WHILE=112;
    public static final int T_ARR=113;
    public static final int T_FCN=114;
    public static final int T_STD=115;
    public static final int T_USER_TYPE=116;
    public static final int UNIT=117;
    public static final int WS=118;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public pollenParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public pollenParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
        this.state.ruleMemo = new HashMap[346+1];
         

    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return pollenParser.tokenNames; }
    public String getGrammarFileName() { return "/home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g"; }



        EnumSet<LitFlags> litFlags = EnumSet.noneOf(LitFlags.class);
        
        EnumSet<Flags> atFlags = EnumSet.noneOf(Flags.class);
        
        class TypeInfo {
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
            	return text.substring(text.indexOf("{"+1),text.lastIndexOf("}"));
        }
        
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


    public static class unit_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "unit"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:194:1: unit : ( NL )* unitPackage -> ^( UNIT unitPackage ) ;
    public final pollenParser.unit_return unit() throws RecognitionException {
        pollenParser.unit_return retval = new pollenParser.unit_return();
        retval.start = input.LT(1);

        int unit_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom NL1=null;
        pollenParser.unitPackage_return unitPackage2 =null;


        BaseNode NL1_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_unitPackage=new RewriteRuleSubtreeStream(adaptor,"rule unitPackage");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:195:5: ( ( NL )* unitPackage -> ^( UNIT unitPackage ) )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:195:9: ( NL )* unitPackage
            {
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:195:9: ( NL )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==NL) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:195:10: NL
            	    {
            	    NL1=(Atom)match(input,NL,FOLLOW_NL_in_unit649); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_NL.add(NL1);


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            pushFollow(FOLLOW_unitPackage_in_unit653);
            unitPackage2=unitPackage();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_unitPackage.add(unitPackage2.getTree());

            // AST REWRITE
            // elements: unitPackage
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (BaseNode)adaptor.nil();
            // 195:29: -> ^( UNIT unitPackage )
            {
                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:195:32: ^( UNIT unitPackage )
                {
                BaseNode root_1 = (BaseNode)adaptor.nil();
                root_1 = (BaseNode)adaptor.becomeRoot(
                (BaseNode)adaptor.create(UNIT, "UNIT")
                , root_1);

                adaptor.addChild(root_1, stream_unitPackage.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (BaseNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BaseNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 1, unit_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "unit"


    public static class unitPackage_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "unitPackage"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:197:1: unitPackage : stmtPackage importList ( stmtInjection )? ( unitTypeDefinition )? ( stmtInjection )? EOF ;
    public final pollenParser.unitPackage_return unitPackage() throws RecognitionException {
        pollenParser.unitPackage_return retval = new pollenParser.unitPackage_return();
        retval.start = input.LT(1);

        int unitPackage_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom EOF8=null;
        pollenParser.stmtPackage_return stmtPackage3 =null;

        pollenParser.importList_return importList4 =null;

        pollenParser.stmtInjection_return stmtInjection5 =null;

        pollenParser.unitTypeDefinition_return unitTypeDefinition6 =null;

        pollenParser.stmtInjection_return stmtInjection7 =null;


        BaseNode EOF8_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:198:2: ( stmtPackage importList ( stmtInjection )? ( unitTypeDefinition )? ( stmtInjection )? EOF )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:198:5: stmtPackage importList ( stmtInjection )? ( unitTypeDefinition )? ( stmtInjection )? EOF
            {
            root_0 = (BaseNode)adaptor.nil();


            pushFollow(FOLLOW_stmtPackage_in_unitPackage679);
            stmtPackage3=stmtPackage();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, stmtPackage3.getTree());

            pushFollow(FOLLOW_importList_in_unitPackage685);
            importList4=importList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, importList4.getTree());

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:200:7: ( stmtInjection )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==INJECT) ) {
                int LA2_1 = input.LA(2);

                if ( (synpred2_pollen()) ) {
                    alt2=1;
                }
            }
            switch (alt2) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:200:8: stmtInjection
                    {
                    pushFollow(FOLLOW_stmtInjection_in_unitPackage694);
                    stmtInjection5=stmtInjection();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmtInjection5.getTree());

                    }
                    break;

            }


            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:201:7: ( unitTypeDefinition )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0 >= 144 && LA3_0 <= 145)||LA3_0==152||(LA3_0 >= 167 && LA3_0 <= 168)||LA3_0==174) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:201:8: unitTypeDefinition
                    {
                    pushFollow(FOLLOW_unitTypeDefinition_in_unitPackage705);
                    unitTypeDefinition6=unitTypeDefinition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, unitTypeDefinition6.getTree());

                    }
                    break;

            }


            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:202:7: ( stmtInjection )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==INJECT) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:202:8: stmtInjection
                    {
                    pushFollow(FOLLOW_stmtInjection_in_unitPackage716);
                    stmtInjection7=stmtInjection();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmtInjection7.getTree());

                    }
                    break;

            }


            EOF8=(Atom)match(input,EOF,FOLLOW_EOF_in_unitPackage726); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            EOF8_tree = 
            (BaseNode)adaptor.create(EOF8)
            ;
            adaptor.addChild(root_0, EOF8_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (BaseNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BaseNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 2, unitPackage_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "unitPackage"


    public static class stmtPackage_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stmtPackage"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:205:1: stmtPackage : ( 'package' qualName delim -> ^( S_PACKAGE qualName ) | -> ^( S_PACKAGE ) );
    public final pollenParser.stmtPackage_return stmtPackage() throws RecognitionException {
        pollenParser.stmtPackage_return retval = new pollenParser.stmtPackage_return();
        retval.start = input.LT(1);

        int stmtPackage_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom string_literal9=null;
        pollenParser.qualName_return qualName10 =null;

        pollenParser.delim_return delim11 =null;


        BaseNode string_literal9_tree=null;
        RewriteRuleTokenStream stream_172=new RewriteRuleTokenStream(adaptor,"token 172");
        RewriteRuleSubtreeStream stream_qualName=new RewriteRuleSubtreeStream(adaptor,"rule qualName");
        RewriteRuleSubtreeStream stream_delim=new RewriteRuleSubtreeStream(adaptor,"rule delim");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:206:2: ( 'package' qualName delim -> ^( S_PACKAGE qualName ) | -> ^( S_PACKAGE ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==172) ) {
                alt5=1;
            }
            else if ( (LA5_0==EOF||LA5_0==INJECT||(LA5_0 >= 144 && LA5_0 <= 145)||LA5_0==152||LA5_0==158||LA5_0==162||(LA5_0 >= 167 && LA5_0 <= 168)||LA5_0==174) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }
            switch (alt5) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:206:4: 'package' qualName delim
                    {
                    string_literal9=(Atom)match(input,172,FOLLOW_172_in_stmtPackage736); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_172.add(string_literal9);


                    pushFollow(FOLLOW_qualName_in_stmtPackage738);
                    qualName10=qualName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_qualName.add(qualName10.getTree());

                    pushFollow(FOLLOW_delim_in_stmtPackage740);
                    delim11=delim();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_delim.add(delim11.getTree());

                    // AST REWRITE
                    // elements: qualName
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (BaseNode)adaptor.nil();
                    // 206:29: -> ^( S_PACKAGE qualName )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:206:32: ^( S_PACKAGE qualName )
                        {
                        BaseNode root_1 = (BaseNode)adaptor.nil();
                        root_1 = (BaseNode)adaptor.becomeRoot(
                        (BaseNode)adaptor.create(S_PACKAGE, "S_PACKAGE")
                        , root_1);

                        adaptor.addChild(root_1, stream_qualName.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:207:4: 
                    {
                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (BaseNode)adaptor.nil();
                    // 207:4: -> ^( S_PACKAGE )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:207:7: ^( S_PACKAGE )
                        {
                        BaseNode root_1 = (BaseNode)adaptor.nil();
                        root_1 = (BaseNode)adaptor.becomeRoot(
                        (BaseNode)adaptor.create(S_PACKAGE, "S_PACKAGE")
                        , root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (BaseNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BaseNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 3, stmtPackage_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "stmtPackage"


    public static class stmtExport_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stmtExport"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:209:1: stmtExport : 'export' ^ qualName delim ;
    public final pollenParser.stmtExport_return stmtExport() throws RecognitionException {
        pollenParser.stmtExport_return retval = new pollenParser.stmtExport_return();
        retval.start = input.LT(1);

        int stmtExport_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom string_literal12=null;
        pollenParser.qualName_return qualName13 =null;

        pollenParser.delim_return delim14 =null;


        BaseNode string_literal12_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:210:5: ( 'export' ^ qualName delim )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:210:9: 'export' ^ qualName delim
            {
            root_0 = (BaseNode)adaptor.nil();


            string_literal12=(Atom)match(input,154,FOLLOW_154_in_stmtExport772); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal12_tree = 
            (BaseNode)adaptor.create(string_literal12)
            ;
            root_0 = (BaseNode)adaptor.becomeRoot(string_literal12_tree, root_0);
            }

            pushFollow(FOLLOW_qualName_in_stmtExport775);
            qualName13=qualName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, qualName13.getTree());

            pushFollow(FOLLOW_delim_in_stmtExport777);
            delim14=delim();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, delim14.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (BaseNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BaseNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 4, stmtExport_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "stmtExport"


    public static class exportList_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "exportList"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:212:1: exportList : ( stmtExport )+ -> ^( LIST[\"LIST\"] ( stmtExport )+ ) ;
    public final pollenParser.exportList_return exportList() throws RecognitionException {
        pollenParser.exportList_return retval = new pollenParser.exportList_return();
        retval.start = input.LT(1);

        int exportList_StartIndex = input.index();

        BaseNode root_0 = null;

        pollenParser.stmtExport_return stmtExport15 =null;


        RewriteRuleSubtreeStream stream_stmtExport=new RewriteRuleSubtreeStream(adaptor,"rule stmtExport");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:213:5: ( ( stmtExport )+ -> ^( LIST[\"LIST\"] ( stmtExport )+ ) )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:213:9: ( stmtExport )+
            {
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:213:9: ( stmtExport )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==154) ) {
                    int LA6_1 = input.LA(2);

                    if ( (synpred6_pollen()) ) {
                        alt6=1;
                    }


                }


                switch (alt6) {
            	case 1 :
            	    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:213:9: stmtExport
            	    {
            	    pushFollow(FOLLOW_stmtExport_in_exportList795);
            	    stmtExport15=stmtExport();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_stmtExport.add(stmtExport15.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);


            // AST REWRITE
            // elements: stmtExport
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (BaseNode)adaptor.nil();
            // 214:6: -> ^( LIST[\"LIST\"] ( stmtExport )+ )
            {
                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:214:9: ^( LIST[\"LIST\"] ( stmtExport )+ )
                {
                BaseNode root_1 = (BaseNode)adaptor.nil();
                root_1 = (BaseNode)adaptor.becomeRoot(
                new ListNode(LIST, "LIST")
                , root_1);

                if ( !(stream_stmtExport.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_stmtExport.hasNext() ) {
                    adaptor.addChild(root_1, stream_stmtExport.nextTree());

                }
                stream_stmtExport.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (BaseNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BaseNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 5, exportList_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "exportList"


    public static class classDefinition_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "classDefinition"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:216:1: classDefinition : 'class' classDef -> ^( D_CLASS classDef ) ;
    public final pollenParser.classDefinition_return classDefinition() throws RecognitionException {
        pollenParser.classDefinition_return retval = new pollenParser.classDefinition_return();
        retval.start = input.LT(1);

        int classDefinition_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom string_literal16=null;
        pollenParser.classDef_return classDef17 =null;


        BaseNode string_literal16_tree=null;
        RewriteRuleTokenStream stream_144=new RewriteRuleTokenStream(adaptor,"token 144");
        RewriteRuleSubtreeStream stream_classDef=new RewriteRuleSubtreeStream(adaptor,"rule classDef");

        	if (tl.size() > 1) { // nested class
        	  ti = new TypeInfo();
        	  tl.add(ti);		
        	}	

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:229:2: ( 'class' classDef -> ^( D_CLASS classDef ) )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:229:5: 'class' classDef
            {
            string_literal16=(Atom)match(input,144,FOLLOW_144_in_classDefinition841); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_144.add(string_literal16);


            pushFollow(FOLLOW_classDef_in_classDefinition843);
            classDef17=classDef();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_classDef.add(classDef17.getTree());

            // AST REWRITE
            // elements: classDef
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (BaseNode)adaptor.nil();
            // 229:22: -> ^( D_CLASS classDef )
            {
                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:229:25: ^( D_CLASS classDef )
                {
                BaseNode root_1 = (BaseNode)adaptor.nil();
                root_1 = (BaseNode)adaptor.becomeRoot(
                (BaseNode)adaptor.create(D_CLASS, "D_CLASS")
                , root_1);

                adaptor.addChild(root_1, stream_classDef.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (BaseNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) {
            	if (tl.size() > 1) {
               	tl.remove(tl.size()-1);
               	ti = tl.get(tl.size()-1);
               }
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BaseNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 6, classDefinition_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "classDefinition"


    public static class classDef_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "classDef"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:231:1: classDef : IDENT ^ ( implementsClause )? braceOpen ( classFeature )* braceClose ;
    public final pollenParser.classDef_return classDef() throws RecognitionException {
        pollenParser.classDef_return retval = new pollenParser.classDef_return();
        retval.start = input.LT(1);

        int classDef_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom IDENT18=null;
        pollenParser.implementsClause_return implementsClause19 =null;

        pollenParser.braceOpen_return braceOpen20 =null;

        pollenParser.classFeature_return classFeature21 =null;

        pollenParser.braceClose_return braceClose22 =null;


        BaseNode IDENT18_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:232:2: ( IDENT ^ ( implementsClause )? braceOpen ( classFeature )* braceClose )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:232:4: IDENT ^ ( implementsClause )? braceOpen ( classFeature )* braceClose
            {
            root_0 = (BaseNode)adaptor.nil();


            IDENT18=(Atom)match(input,IDENT,FOLLOW_IDENT_in_classDef862); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENT18_tree = 
            (BaseNode)adaptor.create(IDENT18)
            ;
            root_0 = (BaseNode)adaptor.becomeRoot(IDENT18_tree, root_0);
            }

            if ( state.backtracking==0 ) { ti.setTypeName((IDENT18!=null?IDENT18.getText():null)); ti.setUnitFlags(EnumSet.of(Flags.CLASS));}

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:234:3: ( implementsClause )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==161) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:234:4: implementsClause
                    {
                    pushFollow(FOLLOW_implementsClause_in_classDef873);
                    implementsClause19=implementsClause();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, implementsClause19.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_braceOpen_in_classDef880);
            braceOpen20=braceOpen();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, braceOpen20.getTree());

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:235:13: ( classFeature )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==IDENT||LA8_0==INJECT||LA8_0==122||LA8_0==140||LA8_0==142||LA8_0==144||LA8_0==146||LA8_0==152||LA8_0==159||(LA8_0 >= 163 && LA8_0 <= 165)||LA8_0==169||LA8_0==176||LA8_0==178||(LA8_0 >= 182 && LA8_0 <= 185)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:235:14: classFeature
            	    {
            	    pushFollow(FOLLOW_classFeature_in_classDef883);
            	    classFeature21=classFeature();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, classFeature21.getTree());

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            pushFollow(FOLLOW_braceClose_in_classDef887);
            braceClose22=braceClose();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, braceClose22.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (BaseNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BaseNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 7, classDef_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "classDef"


    public static class classFeature_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "classFeature"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:238:1: classFeature : ( fcnDefinition | enumDefinition | varDeclaration | classDefinition | stmtInjection );
    public final pollenParser.classFeature_return classFeature() throws RecognitionException {
        pollenParser.classFeature_return retval = new pollenParser.classFeature_return();
        retval.start = input.LT(1);

        int classFeature_StartIndex = input.index();

        BaseNode root_0 = null;

        pollenParser.fcnDefinition_return fcnDefinition23 =null;

        pollenParser.enumDefinition_return enumDefinition24 =null;

        pollenParser.varDeclaration_return varDeclaration25 =null;

        pollenParser.classDefinition_return classDefinition26 =null;

        pollenParser.stmtInjection_return stmtInjection27 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:239:5: ( fcnDefinition | enumDefinition | varDeclaration | classDefinition | stmtInjection )
            int alt9=5;
            switch ( input.LA(1) ) {
            case 122:
            case 176:
                {
                alt9=1;
                }
                break;
            case 159:
                {
                int LA9_2 = input.LA(2);

                if ( (synpred9_pollen()) ) {
                    alt9=1;
                }
                else if ( (synpred11_pollen()) ) {
                    alt9=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 2, input);

                    throw nvae;

                }
                }
                break;
            case 140:
            case 142:
            case 163:
            case 164:
            case 165:
            case 178:
            case 182:
            case 183:
            case 184:
                {
                int LA9_3 = input.LA(2);

                if ( (synpred9_pollen()) ) {
                    alt9=1;
                }
                else if ( (synpred11_pollen()) ) {
                    alt9=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 3, input);

                    throw nvae;

                }
                }
                break;
            case IDENT:
                {
                int LA9_4 = input.LA(2);

                if ( (synpred9_pollen()) ) {
                    alt9=1;
                }
                else if ( (synpred11_pollen()) ) {
                    alt9=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 4, input);

                    throw nvae;

                }
                }
                break;
            case 152:
                {
                alt9=2;
                }
                break;
            case 146:
            case 169:
            case 185:
                {
                alt9=3;
                }
                break;
            case 144:
                {
                alt9=4;
                }
                break;
            case INJECT:
                {
                alt9=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;

            }

            switch (alt9) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:239:9: fcnDefinition
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    pushFollow(FOLLOW_fcnDefinition_in_classFeature904);
                    fcnDefinition23=fcnDefinition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, fcnDefinition23.getTree());

                    }
                    break;
                case 2 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:240:9: enumDefinition
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    pushFollow(FOLLOW_enumDefinition_in_classFeature915);
                    enumDefinition24=enumDefinition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, enumDefinition24.getTree());

                    }
                    break;
                case 3 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:241:9: varDeclaration
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    pushFollow(FOLLOW_varDeclaration_in_classFeature925);
                    varDeclaration25=varDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDeclaration25.getTree());

                    }
                    break;
                case 4 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:242:9: classDefinition
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    pushFollow(FOLLOW_classDefinition_in_classFeature935);
                    classDefinition26=classDefinition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, classDefinition26.getTree());

                    }
                    break;
                case 5 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:243:9: stmtInjection
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    pushFollow(FOLLOW_stmtInjection_in_classFeature945);
                    stmtInjection27=stmtInjection();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmtInjection27.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (BaseNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BaseNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 8, classFeature_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "classFeature"


    public static class moduleDefinition_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "moduleDefinition"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:245:1: moduleDefinition : 'module' IDENT ( implementsClause )? braceOpen ( moduleFeature )* braceClose -> ^( D_MODULE ^( IDENT ( implementsClause )? ( moduleFeature )* ) ) ;
    public final pollenParser.moduleDefinition_return moduleDefinition() throws RecognitionException {
        pollenParser.moduleDefinition_return retval = new pollenParser.moduleDefinition_return();
        retval.start = input.LT(1);

        int moduleDefinition_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom string_literal28=null;
        Atom IDENT29=null;
        pollenParser.implementsClause_return implementsClause30 =null;

        pollenParser.braceOpen_return braceOpen31 =null;

        pollenParser.moduleFeature_return moduleFeature32 =null;

        pollenParser.braceClose_return braceClose33 =null;


        BaseNode string_literal28_tree=null;
        BaseNode IDENT29_tree=null;
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleTokenStream stream_168=new RewriteRuleTokenStream(adaptor,"token 168");
        RewriteRuleSubtreeStream stream_implementsClause=new RewriteRuleSubtreeStream(adaptor,"rule implementsClause");
        RewriteRuleSubtreeStream stream_moduleFeature=new RewriteRuleSubtreeStream(adaptor,"rule moduleFeature");
        RewriteRuleSubtreeStream stream_braceOpen=new RewriteRuleSubtreeStream(adaptor,"rule braceOpen");
        RewriteRuleSubtreeStream stream_braceClose=new RewriteRuleSubtreeStream(adaptor,"rule braceClose");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:246:2: ( 'module' IDENT ( implementsClause )? braceOpen ( moduleFeature )* braceClose -> ^( D_MODULE ^( IDENT ( implementsClause )? ( moduleFeature )* ) ) )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:246:7: 'module' IDENT ( implementsClause )? braceOpen ( moduleFeature )* braceClose
            {
            string_literal28=(Atom)match(input,168,FOLLOW_168_in_moduleDefinition962); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_168.add(string_literal28);


            IDENT29=(Atom)match(input,IDENT,FOLLOW_IDENT_in_moduleDefinition964); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENT.add(IDENT29);


            if ( state.backtracking==0 ) { ti.setTypeName((IDENT29!=null?IDENT29.getText():null)); ti.setUnitFlags(EnumSet.of(Flags.MODULE));}

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:248:4: ( implementsClause )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==161) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:248:5: implementsClause
                    {
                    pushFollow(FOLLOW_implementsClause_in_moduleDefinition979);
                    implementsClause30=implementsClause();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_implementsClause.add(implementsClause30.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_braceOpen_in_moduleDefinition988);
            braceOpen31=braceOpen();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_braceOpen.add(braceOpen31.getTree());

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:249:14: ( moduleFeature )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==IDENT||LA11_0==INJECT||LA11_0==122||LA11_0==140||LA11_0==142||LA11_0==144||LA11_0==146||LA11_0==152||LA11_0==159||(LA11_0 >= 163 && LA11_0 <= 165)||LA11_0==169||LA11_0==176||LA11_0==178||(LA11_0 >= 182 && LA11_0 <= 185)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:249:15: moduleFeature
            	    {
            	    pushFollow(FOLLOW_moduleFeature_in_moduleDefinition991);
            	    moduleFeature32=moduleFeature();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_moduleFeature.add(moduleFeature32.getTree());

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            pushFollow(FOLLOW_braceClose_in_moduleDefinition995);
            braceClose33=braceClose();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_braceClose.add(braceClose33.getTree());

            // AST REWRITE
            // elements: moduleFeature, implementsClause, IDENT
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (BaseNode)adaptor.nil();
            // 250:4: -> ^( D_MODULE ^( IDENT ( implementsClause )? ( moduleFeature )* ) )
            {
                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:250:7: ^( D_MODULE ^( IDENT ( implementsClause )? ( moduleFeature )* ) )
                {
                BaseNode root_1 = (BaseNode)adaptor.nil();
                root_1 = (BaseNode)adaptor.becomeRoot(
                (BaseNode)adaptor.create(D_MODULE, "D_MODULE")
                , root_1);

                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:250:18: ^( IDENT ( implementsClause )? ( moduleFeature )* )
                {
                BaseNode root_2 = (BaseNode)adaptor.nil();
                root_2 = (BaseNode)adaptor.becomeRoot(
                stream_IDENT.nextNode()
                , root_2);

                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:250:26: ( implementsClause )?
                if ( stream_implementsClause.hasNext() ) {
                    adaptor.addChild(root_2, stream_implementsClause.nextTree());

                }
                stream_implementsClause.reset();

                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:250:44: ( moduleFeature )*
                while ( stream_moduleFeature.hasNext() ) {
                    adaptor.addChild(root_2, stream_moduleFeature.nextTree());

                }
                stream_moduleFeature.reset();

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (BaseNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BaseNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 9, moduleDefinition_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "moduleDefinition"


    public static class moduleFeature_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "moduleFeature"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:252:1: moduleFeature : ( fcnDefinition | varDeclaration | enumDefinition | classDefinition | stmtInjection );
    public final pollenParser.moduleFeature_return moduleFeature() throws RecognitionException {
        pollenParser.moduleFeature_return retval = new pollenParser.moduleFeature_return();
        retval.start = input.LT(1);

        int moduleFeature_StartIndex = input.index();

        BaseNode root_0 = null;

        pollenParser.fcnDefinition_return fcnDefinition34 =null;

        pollenParser.varDeclaration_return varDeclaration35 =null;

        pollenParser.enumDefinition_return enumDefinition36 =null;

        pollenParser.classDefinition_return classDefinition37 =null;

        pollenParser.stmtInjection_return stmtInjection38 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:253:2: ( fcnDefinition | varDeclaration | enumDefinition | classDefinition | stmtInjection )
            int alt12=5;
            switch ( input.LA(1) ) {
            case 122:
            case 176:
                {
                alt12=1;
                }
                break;
            case 159:
                {
                int LA12_2 = input.LA(2);

                if ( (synpred15_pollen()) ) {
                    alt12=1;
                }
                else if ( (synpred16_pollen()) ) {
                    alt12=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 2, input);

                    throw nvae;

                }
                }
                break;
            case 140:
            case 142:
            case 163:
            case 164:
            case 165:
            case 178:
            case 182:
            case 183:
            case 184:
                {
                int LA12_3 = input.LA(2);

                if ( (synpred15_pollen()) ) {
                    alt12=1;
                }
                else if ( (synpred16_pollen()) ) {
                    alt12=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 3, input);

                    throw nvae;

                }
                }
                break;
            case IDENT:
                {
                int LA12_4 = input.LA(2);

                if ( (synpred15_pollen()) ) {
                    alt12=1;
                }
                else if ( (synpred16_pollen()) ) {
                    alt12=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 4, input);

                    throw nvae;

                }
                }
                break;
            case 146:
            case 169:
            case 185:
                {
                alt12=2;
                }
                break;
            case 152:
                {
                alt12=3;
                }
                break;
            case 144:
                {
                alt12=4;
                }
                break;
            case INJECT:
                {
                alt12=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;

            }

            switch (alt12) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:253:6: fcnDefinition
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    pushFollow(FOLLOW_fcnDefinition_in_moduleFeature1027);
                    fcnDefinition34=fcnDefinition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, fcnDefinition34.getTree());

                    }
                    break;
                case 2 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:254:8: varDeclaration
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    pushFollow(FOLLOW_varDeclaration_in_moduleFeature1036);
                    varDeclaration35=varDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDeclaration35.getTree());

                    }
                    break;
                case 3 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:255:6: enumDefinition
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    pushFollow(FOLLOW_enumDefinition_in_moduleFeature1043);
                    enumDefinition36=enumDefinition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, enumDefinition36.getTree());

                    }
                    break;
                case 4 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:256:6: classDefinition
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    pushFollow(FOLLOW_classDefinition_in_moduleFeature1050);
                    classDefinition37=classDefinition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, classDefinition37.getTree());

                    }
                    break;
                case 5 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:257:5: stmtInjection
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    pushFollow(FOLLOW_stmtInjection_in_moduleFeature1056);
                    stmtInjection38=stmtInjection();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmtInjection38.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (BaseNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BaseNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 10, moduleFeature_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "moduleFeature"


    public static class enumDefinition_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "enumDefinition"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:259:1: enumDefinition : 'enum' enumDef -> enumDef ;
    public final pollenParser.enumDefinition_return enumDefinition() throws RecognitionException {
        pollenParser.enumDefinition_return retval = new pollenParser.enumDefinition_return();
        retval.start = input.LT(1);

        int enumDefinition_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom string_literal39=null;
        pollenParser.enumDef_return enumDef40 =null;


        BaseNode string_literal39_tree=null;
        RewriteRuleTokenStream stream_152=new RewriteRuleTokenStream(adaptor,"token 152");
        RewriteRuleSubtreeStream stream_enumDef=new RewriteRuleSubtreeStream(adaptor,"rule enumDef");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:260:2: ( 'enum' enumDef -> enumDef )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:260:4: 'enum' enumDef
            {
            string_literal39=(Atom)match(input,152,FOLLOW_152_in_enumDefinition1069); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_152.add(string_literal39);


            pushFollow(FOLLOW_enumDef_in_enumDefinition1071);
            enumDef40=enumDef();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_enumDef.add(enumDef40.getTree());

            // AST REWRITE
            // elements: enumDef
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (BaseNode)adaptor.nil();
            // 260:19: -> enumDef
            {
                adaptor.addChild(root_0, stream_enumDef.nextTree());

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (BaseNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BaseNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 11, enumDefinition_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "enumDefinition"


    public static class enumDef_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "enumDef"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:262:1: enumDef : ( IDENT braceOpen enumList braceClose ) -> ^( D_ENUM[\"D_ENUM\", ti.getUnitFlags()] ^( IDENT enumList ) ) ;
    public final pollenParser.enumDef_return enumDef() throws RecognitionException {
        pollenParser.enumDef_return retval = new pollenParser.enumDef_return();
        retval.start = input.LT(1);

        int enumDef_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom IDENT41=null;
        pollenParser.braceOpen_return braceOpen42 =null;

        pollenParser.enumList_return enumList43 =null;

        pollenParser.braceClose_return braceClose44 =null;


        BaseNode IDENT41_tree=null;
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleSubtreeStream stream_enumList=new RewriteRuleSubtreeStream(adaptor,"rule enumList");
        RewriteRuleSubtreeStream stream_braceOpen=new RewriteRuleSubtreeStream(adaptor,"rule braceOpen");
        RewriteRuleSubtreeStream stream_braceClose=new RewriteRuleSubtreeStream(adaptor,"rule braceClose");

        	if (tl.size() > 1) { // nested 
        	  ti = new TypeInfo();
        	  tl.add(ti);		
        	}	

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:275:2: ( ( IDENT braceOpen enumList braceClose ) -> ^( D_ENUM[\"D_ENUM\", ti.getUnitFlags()] ^( IDENT enumList ) ) )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:275:5: ( IDENT braceOpen enumList braceClose )
            {
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:275:5: ( IDENT braceOpen enumList braceClose )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:275:6: IDENT braceOpen enumList braceClose
            {
            IDENT41=(Atom)match(input,IDENT,FOLLOW_IDENT_in_enumDef1097); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENT.add(IDENT41);


            if ( state.backtracking==0 ) { ti.setTypeName((IDENT41!=null?IDENT41.getText():null)); ti.setUnitFlags(EnumSet.of(Flags.ENUM));}

            pushFollow(FOLLOW_braceOpen_in_enumDef1106);
            braceOpen42=braceOpen();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_braceOpen.add(braceOpen42.getTree());

            pushFollow(FOLLOW_enumList_in_enumDef1108);
            enumList43=enumList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_enumList.add(enumList43.getTree());

            pushFollow(FOLLOW_braceClose_in_enumDef1110);
            braceClose44=braceClose();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_braceClose.add(braceClose44.getTree());

            }


            // AST REWRITE
            // elements: enumList, IDENT
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (BaseNode)adaptor.nil();
            // 278:3: -> ^( D_ENUM[\"D_ENUM\", ti.getUnitFlags()] ^( IDENT enumList ) )
            {
                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:278:6: ^( D_ENUM[\"D_ENUM\", ti.getUnitFlags()] ^( IDENT enumList ) )
                {
                BaseNode root_1 = (BaseNode)adaptor.nil();
                root_1 = (BaseNode)adaptor.becomeRoot(
                new DeclNode.Enum(D_ENUM, "D_ENUM", ti.getUnitFlags())
                , root_1);

                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:278:59: ^( IDENT enumList )
                {
                BaseNode root_2 = (BaseNode)adaptor.nil();
                root_2 = (BaseNode)adaptor.becomeRoot(
                stream_IDENT.nextNode()
                , root_2);

                adaptor.addChild(root_2, stream_enumList.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (BaseNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) {
            	if (tl.size() > 1) {
               	tl.remove(tl.size()-1);
               	ti = tl.get(tl.size()-1);
               }
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BaseNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 12, enumDef_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "enumDef"


    public static class enumList_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "enumList"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:280:1: enumList : enumElement ( ',' enumElement )* -> ^( LIST[\"LIST\"] ( enumElement )+ ) ;
    public final pollenParser.enumList_return enumList() throws RecognitionException {
        pollenParser.enumList_return retval = new pollenParser.enumList_return();
        retval.start = input.LT(1);

        int enumList_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom char_literal46=null;
        pollenParser.enumElement_return enumElement45 =null;

        pollenParser.enumElement_return enumElement47 =null;


        BaseNode char_literal46_tree=null;
        RewriteRuleTokenStream stream_125=new RewriteRuleTokenStream(adaptor,"token 125");
        RewriteRuleSubtreeStream stream_enumElement=new RewriteRuleSubtreeStream(adaptor,"rule enumElement");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:281:2: ( enumElement ( ',' enumElement )* -> ^( LIST[\"LIST\"] ( enumElement )+ ) )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:281:4: enumElement ( ',' enumElement )*
            {
            pushFollow(FOLLOW_enumElement_in_enumList1141);
            enumElement45=enumElement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_enumElement.add(enumElement45.getTree());

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:281:16: ( ',' enumElement )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==125) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:281:17: ',' enumElement
            	    {
            	    char_literal46=(Atom)match(input,125,FOLLOW_125_in_enumList1144); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_125.add(char_literal46);


            	    pushFollow(FOLLOW_enumElement_in_enumList1146);
            	    enumElement47=enumElement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_enumElement.add(enumElement47.getTree());

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            // AST REWRITE
            // elements: enumElement
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (BaseNode)adaptor.nil();
            // 281:35: -> ^( LIST[\"LIST\"] ( enumElement )+ )
            {
                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:281:38: ^( LIST[\"LIST\"] ( enumElement )+ )
                {
                BaseNode root_1 = (BaseNode)adaptor.nil();
                root_1 = (BaseNode)adaptor.becomeRoot(
                new ListNode(LIST, "LIST")
                , root_1);

                if ( !(stream_enumElement.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_enumElement.hasNext() ) {
                    adaptor.addChild(root_1, stream_enumElement.nextTree());

                }
                stream_enumElement.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (BaseNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BaseNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 13, enumList_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "enumList"


    public static class enumElement_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "enumElement"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:283:1: enumElement : ( IDENT ASSIGN INT_LIT ( delim )? -> ^( D_ENUMVAL[\"D_ENUMVAL\", ti.getUnitFlags()] ^( IDENT INT_LIT ) ) | IDENT ( delim )? -> ^( D_ENUMVAL IDENT ) );
    public final pollenParser.enumElement_return enumElement() throws RecognitionException {
        pollenParser.enumElement_return retval = new pollenParser.enumElement_return();
        retval.start = input.LT(1);

        int enumElement_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom IDENT48=null;
        Atom ASSIGN49=null;
        Atom INT_LIT50=null;
        Atom IDENT52=null;
        pollenParser.delim_return delim51 =null;

        pollenParser.delim_return delim53 =null;


        BaseNode IDENT48_tree=null;
        BaseNode ASSIGN49_tree=null;
        BaseNode INT_LIT50_tree=null;
        BaseNode IDENT52_tree=null;
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleTokenStream stream_INT_LIT=new RewriteRuleTokenStream(adaptor,"token INT_LIT");
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
        RewriteRuleSubtreeStream stream_delim=new RewriteRuleSubtreeStream(adaptor,"rule delim");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:284:2: ( IDENT ASSIGN INT_LIT ( delim )? -> ^( D_ENUMVAL[\"D_ENUMVAL\", ti.getUnitFlags()] ^( IDENT INT_LIT ) ) | IDENT ( delim )? -> ^( D_ENUMVAL IDENT ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==IDENT) ) {
                int LA16_1 = input.LA(2);

                if ( (synpred21_pollen()) ) {
                    alt16=1;
                }
                else if ( (true) ) {
                    alt16=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 1, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;

            }
            switch (alt16) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:284:4: IDENT ASSIGN INT_LIT ( delim )?
                    {
                    IDENT48=(Atom)match(input,IDENT,FOLLOW_IDENT_in_enumElement1171); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENT.add(IDENT48);


                    ASSIGN49=(Atom)match(input,ASSIGN,FOLLOW_ASSIGN_in_enumElement1173); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ASSIGN.add(ASSIGN49);


                    INT_LIT50=(Atom)match(input,INT_LIT,FOLLOW_INT_LIT_in_enumElement1175); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INT_LIT.add(INT_LIT50);


                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:284:25: ( delim )?
                    int alt14=2;
                    switch ( input.LA(1) ) {
                        case SEMI:
                            {
                            alt14=1;
                            }
                            break;
                        case NL:
                            {
                            int LA14_2 = input.LA(2);

                            if ( (synpred20_pollen()) ) {
                                alt14=1;
                            }
                            }
                            break;
                        case 125:
                            {
                            int LA14_3 = input.LA(2);

                            if ( (synpred20_pollen()) ) {
                                alt14=1;
                            }
                            }
                            break;
                        case 190:
                            {
                            int LA14_4 = input.LA(2);

                            if ( (synpred20_pollen()) ) {
                                alt14=1;
                            }
                            }
                            break;
                        case EOF:
                            {
                            int LA14_5 = input.LA(2);

                            if ( (synpred20_pollen()) ) {
                                alt14=1;
                            }
                            }
                            break;
                    }

                    switch (alt14) {
                        case 1 :
                            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:284:26: delim
                            {
                            pushFollow(FOLLOW_delim_in_enumElement1178);
                            delim51=delim();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_delim.add(delim51.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: IDENT, INT_LIT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (BaseNode)adaptor.nil();
                    // 284:34: -> ^( D_ENUMVAL[\"D_ENUMVAL\", ti.getUnitFlags()] ^( IDENT INT_LIT ) )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:284:37: ^( D_ENUMVAL[\"D_ENUMVAL\", ti.getUnitFlags()] ^( IDENT INT_LIT ) )
                        {
                        BaseNode root_1 = (BaseNode)adaptor.nil();
                        root_1 = (BaseNode)adaptor.becomeRoot(
                        new DeclNode.EnumVal(D_ENUMVAL, "D_ENUMVAL", ti.getUnitFlags())
                        , root_1);

                        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:284:99: ^( IDENT INT_LIT )
                        {
                        BaseNode root_2 = (BaseNode)adaptor.nil();
                        root_2 = (BaseNode)adaptor.becomeRoot(
                        stream_IDENT.nextNode()
                        , root_2);

                        adaptor.addChild(root_2, 
                        stream_INT_LIT.nextNode()
                        );

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:285:4: IDENT ( delim )?
                    {
                    IDENT52=(Atom)match(input,IDENT,FOLLOW_IDENT_in_enumElement1203); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENT.add(IDENT52);


                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:285:10: ( delim )?
                    int alt15=2;
                    switch ( input.LA(1) ) {
                        case SEMI:
                            {
                            alt15=1;
                            }
                            break;
                        case NL:
                            {
                            int LA15_2 = input.LA(2);

                            if ( (synpred22_pollen()) ) {
                                alt15=1;
                            }
                            }
                            break;
                        case 125:
                            {
                            int LA15_3 = input.LA(2);

                            if ( (synpred22_pollen()) ) {
                                alt15=1;
                            }
                            }
                            break;
                        case 190:
                            {
                            int LA15_4 = input.LA(2);

                            if ( (synpred22_pollen()) ) {
                                alt15=1;
                            }
                            }
                            break;
                        case EOF:
                            {
                            int LA15_5 = input.LA(2);

                            if ( (synpred22_pollen()) ) {
                                alt15=1;
                            }
                            }
                            break;
                    }

                    switch (alt15) {
                        case 1 :
                            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:285:11: delim
                            {
                            pushFollow(FOLLOW_delim_in_enumElement1206);
                            delim53=delim();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_delim.add(delim53.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: IDENT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (BaseNode)adaptor.nil();
                    // 285:19: -> ^( D_ENUMVAL IDENT )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:285:22: ^( D_ENUMVAL IDENT )
                        {
                        BaseNode root_1 = (BaseNode)adaptor.nil();
                        root_1 = (BaseNode)adaptor.becomeRoot(
                        (BaseNode)adaptor.create(D_ENUMVAL, "D_ENUMVAL")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_IDENT.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (BaseNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BaseNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 14, enumElement_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "enumElement"


    public static class protocolDefinition_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "protocolDefinition"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:287:1: protocolDefinition : 'protocol' IDENT ( extendsClause )? braceOpen ( protocolFeature )* braceClose -> ^( D_PROTOCOL ^( IDENT ( extendsClause )? ( protocolFeature )* ) ) ;
    public final pollenParser.protocolDefinition_return protocolDefinition() throws RecognitionException {
        pollenParser.protocolDefinition_return retval = new pollenParser.protocolDefinition_return();
        retval.start = input.LT(1);

        int protocolDefinition_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom string_literal54=null;
        Atom IDENT55=null;
        pollenParser.extendsClause_return extendsClause56 =null;

        pollenParser.braceOpen_return braceOpen57 =null;

        pollenParser.protocolFeature_return protocolFeature58 =null;

        pollenParser.braceClose_return braceClose59 =null;


        BaseNode string_literal54_tree=null;
        BaseNode IDENT55_tree=null;
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleTokenStream stream_174=new RewriteRuleTokenStream(adaptor,"token 174");
        RewriteRuleSubtreeStream stream_protocolFeature=new RewriteRuleSubtreeStream(adaptor,"rule protocolFeature");
        RewriteRuleSubtreeStream stream_extendsClause=new RewriteRuleSubtreeStream(adaptor,"rule extendsClause");
        RewriteRuleSubtreeStream stream_braceOpen=new RewriteRuleSubtreeStream(adaptor,"rule braceOpen");
        RewriteRuleSubtreeStream stream_braceClose=new RewriteRuleSubtreeStream(adaptor,"rule braceClose");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:288:2: ( 'protocol' IDENT ( extendsClause )? braceOpen ( protocolFeature )* braceClose -> ^( D_PROTOCOL ^( IDENT ( extendsClause )? ( protocolFeature )* ) ) )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:288:4: 'protocol' IDENT ( extendsClause )? braceOpen ( protocolFeature )* braceClose
            {
            string_literal54=(Atom)match(input,174,FOLLOW_174_in_protocolDefinition1226); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_174.add(string_literal54);


            IDENT55=(Atom)match(input,IDENT,FOLLOW_IDENT_in_protocolDefinition1228); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENT.add(IDENT55);


            if ( state.backtracking==0 ) { ti.setTypeName((IDENT55!=null?IDENT55.getText():null)); ti.setUnitFlags(EnumSet.of(Flags.PROTOCOL));}

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:290:3: ( extendsClause )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==155) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:290:3: extendsClause
                    {
                    pushFollow(FOLLOW_extendsClause_in_protocolDefinition1236);
                    extendsClause56=extendsClause();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_extendsClause.add(extendsClause56.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_braceOpen_in_protocolDefinition1242);
            braceOpen57=braceOpen();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_braceOpen.add(braceOpen57.getTree());

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:291:13: ( protocolFeature )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==IDENT||LA18_0==INJECT||LA18_0==122||LA18_0==140||LA18_0==142||LA18_0==152||LA18_0==159||(LA18_0 >= 163 && LA18_0 <= 165)||LA18_0==176||LA18_0==178||(LA18_0 >= 182 && LA18_0 <= 184)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:291:14: protocolFeature
            	    {
            	    pushFollow(FOLLOW_protocolFeature_in_protocolDefinition1245);
            	    protocolFeature58=protocolFeature();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_protocolFeature.add(protocolFeature58.getTree());

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            pushFollow(FOLLOW_braceClose_in_protocolDefinition1249);
            braceClose59=braceClose();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_braceClose.add(braceClose59.getTree());

            // AST REWRITE
            // elements: extendsClause, IDENT, protocolFeature
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (BaseNode)adaptor.nil();
            // 292:3: -> ^( D_PROTOCOL ^( IDENT ( extendsClause )? ( protocolFeature )* ) )
            {
                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:292:6: ^( D_PROTOCOL ^( IDENT ( extendsClause )? ( protocolFeature )* ) )
                {
                BaseNode root_1 = (BaseNode)adaptor.nil();
                root_1 = (BaseNode)adaptor.becomeRoot(
                (BaseNode)adaptor.create(D_PROTOCOL, "D_PROTOCOL")
                , root_1);

                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:292:19: ^( IDENT ( extendsClause )? ( protocolFeature )* )
                {
                BaseNode root_2 = (BaseNode)adaptor.nil();
                root_2 = (BaseNode)adaptor.becomeRoot(
                stream_IDENT.nextNode()
                , root_2);

                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:292:27: ( extendsClause )?
                if ( stream_extendsClause.hasNext() ) {
                    adaptor.addChild(root_2, stream_extendsClause.nextTree());

                }
                stream_extendsClause.reset();

                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:292:42: ( protocolFeature )*
                while ( stream_protocolFeature.hasNext() ) {
                    adaptor.addChild(root_2, stream_protocolFeature.nextTree());

                }
                stream_protocolFeature.reset();

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (BaseNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BaseNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 15, protocolDefinition_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "protocolDefinition"


    public static class protocolFeature_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "protocolFeature"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:294:1: protocolFeature : ( enumDefinition | fcnDeclaration | stmtInjection );
    public final pollenParser.protocolFeature_return protocolFeature() throws RecognitionException {
        pollenParser.protocolFeature_return retval = new pollenParser.protocolFeature_return();
        retval.start = input.LT(1);

        int protocolFeature_StartIndex = input.index();

        BaseNode root_0 = null;

        pollenParser.enumDefinition_return enumDefinition60 =null;

        pollenParser.fcnDeclaration_return fcnDeclaration61 =null;

        pollenParser.stmtInjection_return stmtInjection62 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:295:5: ( enumDefinition | fcnDeclaration | stmtInjection )
            int alt19=3;
            switch ( input.LA(1) ) {
            case 152:
                {
                alt19=1;
                }
                break;
            case IDENT:
            case 122:
            case 140:
            case 142:
            case 159:
            case 163:
            case 164:
            case 165:
            case 176:
            case 178:
            case 182:
            case 183:
            case 184:
                {
                alt19=2;
                }
                break;
            case INJECT:
                {
                alt19=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;

            }

            switch (alt19) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:295:9: enumDefinition
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    pushFollow(FOLLOW_enumDefinition_in_protocolFeature1283);
                    enumDefinition60=enumDefinition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, enumDefinition60.getTree());

                    }
                    break;
                case 2 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:296:9: fcnDeclaration
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    pushFollow(FOLLOW_fcnDeclaration_in_protocolFeature1293);
                    fcnDeclaration61=fcnDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, fcnDeclaration61.getTree());

                    }
                    break;
                case 3 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:297:9: stmtInjection
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    pushFollow(FOLLOW_stmtInjection_in_protocolFeature1304);
                    stmtInjection62=stmtInjection();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmtInjection62.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (BaseNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BaseNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 16, protocolFeature_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "protocolFeature"


    public static class compositionDefinition_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "compositionDefinition"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:299:1: compositionDefinition : 'composition' IDENT ( extendsClause )? braceOpen ( compositionFeature )* braceClose -> ^( D_COMPOSITION[\"D_COMPOSITION\", ti.getUnitFlags()] IDENT ( extendsClause )? ( compositionFeature )* ) ;
    public final pollenParser.compositionDefinition_return compositionDefinition() throws RecognitionException {
        pollenParser.compositionDefinition_return retval = new pollenParser.compositionDefinition_return();
        retval.start = input.LT(1);

        int compositionDefinition_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom string_literal63=null;
        Atom IDENT64=null;
        pollenParser.extendsClause_return extendsClause65 =null;

        pollenParser.braceOpen_return braceOpen66 =null;

        pollenParser.compositionFeature_return compositionFeature67 =null;

        pollenParser.braceClose_return braceClose68 =null;


        BaseNode string_literal63_tree=null;
        BaseNode IDENT64_tree=null;
        RewriteRuleTokenStream stream_145=new RewriteRuleTokenStream(adaptor,"token 145");
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleSubtreeStream stream_extendsClause=new RewriteRuleSubtreeStream(adaptor,"rule extendsClause");
        RewriteRuleSubtreeStream stream_compositionFeature=new RewriteRuleSubtreeStream(adaptor,"rule compositionFeature");
        RewriteRuleSubtreeStream stream_braceOpen=new RewriteRuleSubtreeStream(adaptor,"rule braceOpen");
        RewriteRuleSubtreeStream stream_braceClose=new RewriteRuleSubtreeStream(adaptor,"rule braceClose");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:300:2: ( 'composition' IDENT ( extendsClause )? braceOpen ( compositionFeature )* braceClose -> ^( D_COMPOSITION[\"D_COMPOSITION\", ti.getUnitFlags()] IDENT ( extendsClause )? ( compositionFeature )* ) )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:300:4: 'composition' IDENT ( extendsClause )? braceOpen ( compositionFeature )* braceClose
            {
            string_literal63=(Atom)match(input,145,FOLLOW_145_in_compositionDefinition1317); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_145.add(string_literal63);


            IDENT64=(Atom)match(input,IDENT,FOLLOW_IDENT_in_compositionDefinition1319); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENT.add(IDENT64);


            if ( state.backtracking==0 ) { ti.setTypeName((IDENT64!=null?IDENT64.getText():null)); 
            		  //DBG("IDENT64 " + (IDENT64!=null?IDENT64.getText():null)); 
            		  ti.setUnitFlags(EnumSet.of(Flags.COMPOSITION));
            		  //DBG(ti.getTypeName() + ", " + ti.getUnitFlags().toString());
            		}

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:306:3: ( extendsClause )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==155) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:306:3: extendsClause
                    {
                    pushFollow(FOLLOW_extendsClause_in_compositionDefinition1327);
                    extendsClause65=extendsClause();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_extendsClause.add(extendsClause65.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_braceOpen_in_compositionDefinition1334);
            braceOpen66=braceOpen();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_braceOpen.add(braceOpen66.getTree());

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:307:13: ( compositionFeature )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==IDENT||LA21_0==INJECT||LA21_0==122||LA21_0==140||LA21_0==142||LA21_0==146||LA21_0==152||LA21_0==154||LA21_0==159||(LA21_0 >= 163 && LA21_0 <= 165)||LA21_0==169||LA21_0==176||LA21_0==178||(LA21_0 >= 182 && LA21_0 <= 185)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:307:14: compositionFeature
            	    {
            	    pushFollow(FOLLOW_compositionFeature_in_compositionDefinition1337);
            	    compositionFeature67=compositionFeature();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_compositionFeature.add(compositionFeature67.getTree());

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);


            pushFollow(FOLLOW_braceClose_in_compositionDefinition1341);
            braceClose68=braceClose();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_braceClose.add(braceClose68.getTree());

            // AST REWRITE
            // elements: IDENT, compositionFeature, extendsClause
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (BaseNode)adaptor.nil();
            // 308:4: -> ^( D_COMPOSITION[\"D_COMPOSITION\", ti.getUnitFlags()] IDENT ( extendsClause )? ( compositionFeature )* )
            {
                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:308:7: ^( D_COMPOSITION[\"D_COMPOSITION\", ti.getUnitFlags()] IDENT ( extendsClause )? ( compositionFeature )* )
                {
                BaseNode root_1 = (BaseNode)adaptor.nil();
                root_1 = (BaseNode)adaptor.becomeRoot(
                new DeclNode.UserTypeDef(D_COMPOSITION, "D_COMPOSITION", ti.getUnitFlags())
                , root_1);

                adaptor.addChild(root_1, 
                stream_IDENT.nextNode()
                );

                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:308:87: ( extendsClause )?
                if ( stream_extendsClause.hasNext() ) {
                    adaptor.addChild(root_1, stream_extendsClause.nextTree());

                }
                stream_extendsClause.reset();

                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:308:102: ( compositionFeature )*
                while ( stream_compositionFeature.hasNext() ) {
                    adaptor.addChild(root_1, stream_compositionFeature.nextTree());

                }
                stream_compositionFeature.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (BaseNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BaseNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 17, compositionDefinition_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "compositionDefinition"


    public static class compositionFeature_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "compositionFeature"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:310:1: compositionFeature : ( exportList | fcnDefinitionHost | enumDefinition | varDeclaration | stmtInjection );
    public final pollenParser.compositionFeature_return compositionFeature() throws RecognitionException {
        pollenParser.compositionFeature_return retval = new pollenParser.compositionFeature_return();
        retval.start = input.LT(1);

        int compositionFeature_StartIndex = input.index();

        BaseNode root_0 = null;

        pollenParser.exportList_return exportList69 =null;

        pollenParser.fcnDefinitionHost_return fcnDefinitionHost70 =null;

        pollenParser.enumDefinition_return enumDefinition71 =null;

        pollenParser.varDeclaration_return varDeclaration72 =null;

        pollenParser.stmtInjection_return stmtInjection73 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:311:3: ( exportList | fcnDefinitionHost | enumDefinition | varDeclaration | stmtInjection )
            int alt22=5;
            switch ( input.LA(1) ) {
            case 154:
                {
                alt22=1;
                }
                break;
            case 122:
            case 176:
                {
                alt22=2;
                }
                break;
            case 159:
                {
                int LA22_3 = input.LA(2);

                if ( (synpred30_pollen()) ) {
                    alt22=2;
                }
                else if ( (synpred32_pollen()) ) {
                    alt22=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 22, 3, input);

                    throw nvae;

                }
                }
                break;
            case 140:
            case 142:
            case 163:
            case 164:
            case 165:
            case 178:
            case 182:
            case 183:
            case 184:
                {
                int LA22_4 = input.LA(2);

                if ( (synpred30_pollen()) ) {
                    alt22=2;
                }
                else if ( (synpred32_pollen()) ) {
                    alt22=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 22, 4, input);

                    throw nvae;

                }
                }
                break;
            case IDENT:
                {
                int LA22_5 = input.LA(2);

                if ( (synpred30_pollen()) ) {
                    alt22=2;
                }
                else if ( (synpred32_pollen()) ) {
                    alt22=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 22, 5, input);

                    throw nvae;

                }
                }
                break;
            case 152:
                {
                alt22=3;
                }
                break;
            case 146:
            case 169:
            case 185:
                {
                alt22=4;
                }
                break;
            case INJECT:
                {
                alt22=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;

            }

            switch (alt22) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:311:6: exportList
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    pushFollow(FOLLOW_exportList_in_compositionFeature1377);
                    exportList69=exportList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, exportList69.getTree());

                    }
                    break;
                case 2 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:312:7: fcnDefinitionHost
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    pushFollow(FOLLOW_fcnDefinitionHost_in_compositionFeature1385);
                    fcnDefinitionHost70=fcnDefinitionHost();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, fcnDefinitionHost70.getTree());

                    }
                    break;
                case 3 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:313:7: enumDefinition
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    pushFollow(FOLLOW_enumDefinition_in_compositionFeature1393);
                    enumDefinition71=enumDefinition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, enumDefinition71.getTree());

                    }
                    break;
                case 4 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:314:7: varDeclaration
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    pushFollow(FOLLOW_varDeclaration_in_compositionFeature1401);
                    varDeclaration72=varDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDeclaration72.getTree());

                    }
                    break;
                case 5 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:315:6: stmtInjection
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    pushFollow(FOLLOW_stmtInjection_in_compositionFeature1408);
                    stmtInjection73=stmtInjection();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmtInjection73.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (BaseNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BaseNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 18, compositionFeature_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "compositionFeature"


    public static class stmtImport_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stmtImport"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:317:1: stmtImport : ( importFrom 'import' qualName ( metaArguments )? ( importAs )? delim ) -> ^( S_IMPORT ( importFrom )? qualName ( importAs )? ( metaArguments )? ) ;
    public final pollenParser.stmtImport_return stmtImport() throws RecognitionException {
        pollenParser.stmtImport_return retval = new pollenParser.stmtImport_return();
        retval.start = input.LT(1);

        int stmtImport_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom string_literal75=null;
        pollenParser.importFrom_return importFrom74 =null;

        pollenParser.qualName_return qualName76 =null;

        pollenParser.metaArguments_return metaArguments77 =null;

        pollenParser.importAs_return importAs78 =null;

        pollenParser.delim_return delim79 =null;


        BaseNode string_literal75_tree=null;
        RewriteRuleTokenStream stream_162=new RewriteRuleTokenStream(adaptor,"token 162");
        RewriteRuleSubtreeStream stream_importFrom=new RewriteRuleSubtreeStream(adaptor,"rule importFrom");
        RewriteRuleSubtreeStream stream_qualName=new RewriteRuleSubtreeStream(adaptor,"rule qualName");
        RewriteRuleSubtreeStream stream_importAs=new RewriteRuleSubtreeStream(adaptor,"rule importAs");
        RewriteRuleSubtreeStream stream_delim=new RewriteRuleSubtreeStream(adaptor,"rule delim");
        RewriteRuleSubtreeStream stream_metaArguments=new RewriteRuleSubtreeStream(adaptor,"rule metaArguments");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:318:5: ( ( importFrom 'import' qualName ( metaArguments )? ( importAs )? delim ) -> ^( S_IMPORT ( importFrom )? qualName ( importAs )? ( metaArguments )? ) )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:318:9: ( importFrom 'import' qualName ( metaArguments )? ( importAs )? delim )
            {
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:318:9: ( importFrom 'import' qualName ( metaArguments )? ( importAs )? delim )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:318:10: importFrom 'import' qualName ( metaArguments )? ( importAs )? delim
            {
            pushFollow(FOLLOW_importFrom_in_stmtImport1425);
            importFrom74=importFrom();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_importFrom.add(importFrom74.getTree());

            string_literal75=(Atom)match(input,162,FOLLOW_162_in_stmtImport1435); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_162.add(string_literal75);


            pushFollow(FOLLOW_qualName_in_stmtImport1437);
            qualName76=qualName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_qualName.add(qualName76.getTree());

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:319:27: ( metaArguments )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==187) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:319:28: metaArguments
                    {
                    pushFollow(FOLLOW_metaArguments_in_stmtImport1440);
                    metaArguments77=metaArguments();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_metaArguments.add(metaArguments77.getTree());

                    }
                    break;

            }


            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:320:10: ( importAs )?
            int alt24=2;
            switch ( input.LA(1) ) {
                case 138:
                    {
                    alt24=1;
                    }
                    break;
                case SEMI:
                    {
                    int LA24_2 = input.LA(2);

                    if ( (synpred34_pollen()) ) {
                        alt24=1;
                    }
                    }
                    break;
                case NL:
                    {
                    int LA24_3 = input.LA(2);

                    if ( (synpred34_pollen()) ) {
                        alt24=1;
                    }
                    }
                    break;
                case INJECT:
                    {
                    int LA24_4 = input.LA(2);

                    if ( (synpred34_pollen()) ) {
                        alt24=1;
                    }
                    }
                    break;
                case 167:
                    {
                    int LA24_5 = input.LA(2);

                    if ( (synpred34_pollen()) ) {
                        alt24=1;
                    }
                    }
                    break;
                case 168:
                    {
                    int LA24_6 = input.LA(2);

                    if ( (synpred34_pollen()) ) {
                        alt24=1;
                    }
                    }
                    break;
                case 144:
                    {
                    int LA24_7 = input.LA(2);

                    if ( (synpred34_pollen()) ) {
                        alt24=1;
                    }
                    }
                    break;
                case 174:
                    {
                    int LA24_8 = input.LA(2);

                    if ( (synpred34_pollen()) ) {
                        alt24=1;
                    }
                    }
                    break;
                case 145:
                    {
                    int LA24_9 = input.LA(2);

                    if ( (synpred34_pollen()) ) {
                        alt24=1;
                    }
                    }
                    break;
                case 152:
                    {
                    int LA24_10 = input.LA(2);

                    if ( (synpred34_pollen()) ) {
                        alt24=1;
                    }
                    }
                    break;
                case EOF:
                    {
                    int LA24_11 = input.LA(2);

                    if ( (synpred34_pollen()) ) {
                        alt24=1;
                    }
                    }
                    break;
                case 158:
                    {
                    int LA24_12 = input.LA(2);

                    if ( (synpred34_pollen()) ) {
                        alt24=1;
                    }
                    }
                    break;
                case 162:
                    {
                    int LA24_13 = input.LA(2);

                    if ( (synpred34_pollen()) ) {
                        alt24=1;
                    }
                    }
                    break;
            }

            switch (alt24) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:320:10: importAs
                    {
                    pushFollow(FOLLOW_importAs_in_stmtImport1453);
                    importAs78=importAs();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_importAs.add(importAs78.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_delim_in_stmtImport1456);
            delim79=delim();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_delim.add(delim79.getTree());

            }


            // AST REWRITE
            // elements: qualName, metaArguments, importAs, importFrom
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (BaseNode)adaptor.nil();
            // 320:27: -> ^( S_IMPORT ( importFrom )? qualName ( importAs )? ( metaArguments )? )
            {
                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:320:30: ^( S_IMPORT ( importFrom )? qualName ( importAs )? ( metaArguments )? )
                {
                BaseNode root_1 = (BaseNode)adaptor.nil();
                root_1 = (BaseNode)adaptor.becomeRoot(
                (BaseNode)adaptor.create(S_IMPORT, "S_IMPORT")
                , root_1);

                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:320:41: ( importFrom )?
                if ( stream_importFrom.hasNext() ) {
                    adaptor.addChild(root_1, stream_importFrom.nextTree());

                }
                stream_importFrom.reset();

                adaptor.addChild(root_1, stream_qualName.nextTree());

                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:320:62: ( importAs )?
                if ( stream_importAs.hasNext() ) {
                    adaptor.addChild(root_1, stream_importAs.nextTree());

                }
                stream_importAs.reset();

                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:320:72: ( metaArguments )?
                if ( stream_metaArguments.hasNext() ) {
                    adaptor.addChild(root_1, stream_metaArguments.nextTree());

                }
                stream_metaArguments.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (BaseNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BaseNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 19, stmtImport_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "stmtImport"


    public static class importFrom_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "importFrom"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:322:1: importFrom : ( 'from' qualName -> qualName | -> ^( E_IDENT[\"E_IDENT\"] IDENT[defaultPkg] ) );
    public final pollenParser.importFrom_return importFrom() throws RecognitionException {
        pollenParser.importFrom_return retval = new pollenParser.importFrom_return();
        retval.start = input.LT(1);

        int importFrom_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom string_literal80=null;
        pollenParser.qualName_return qualName81 =null;


        BaseNode string_literal80_tree=null;
        RewriteRuleTokenStream stream_158=new RewriteRuleTokenStream(adaptor,"token 158");
        RewriteRuleSubtreeStream stream_qualName=new RewriteRuleSubtreeStream(adaptor,"rule qualName");

        	String defaultPkg = "";


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:327:5: ( 'from' qualName -> qualName | -> ^( E_IDENT[\"E_IDENT\"] IDENT[defaultPkg] ) )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==158) ) {
                alt25=1;
            }
            else if ( (LA25_0==162) ) {
                alt25=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;

            }
            switch (alt25) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:327:9: 'from' qualName
                    {
                    string_literal80=(Atom)match(input,158,FOLLOW_158_in_importFrom1496); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_158.add(string_literal80);


                    pushFollow(FOLLOW_qualName_in_importFrom1498);
                    qualName81=qualName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_qualName.add(qualName81.getTree());

                    // AST REWRITE
                    // elements: qualName
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (BaseNode)adaptor.nil();
                    // 327:25: -> qualName
                    {
                        adaptor.addChild(root_0, stream_qualName.nextTree());

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:328:8: 
                    {
                    if ( state.backtracking==0 ) {
                        			String path = this.getTokenStream().getSourceName();
                            		int k = path.lastIndexOf('.');
                            		int j = path.lastIndexOf(".", k-1);
                            		j = j == -1 ? 0 : j+1;
                            		defaultPkg = path.substring(j, k);
                        		}

                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (BaseNode)adaptor.nil();
                    // 335:7: -> ^( E_IDENT[\"E_IDENT\"] IDENT[defaultPkg] )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:335:10: ^( E_IDENT[\"E_IDENT\"] IDENT[defaultPkg] )
                        {
                        BaseNode root_1 = (BaseNode)adaptor.nil();
                        root_1 = (BaseNode)adaptor.becomeRoot(
                        new ExprNode.Ident(E_IDENT, "E_IDENT")
                        , root_1);

                        adaptor.addChild(root_1, 
                        (BaseNode)adaptor.create(IDENT, defaultPkg)
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (BaseNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BaseNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 20, importFrom_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "importFrom"


    public static class importAs_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "importAs"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:337:1: importAs : ( 'as' qualName -> qualName | -> NIL );
    public final pollenParser.importAs_return importAs() throws RecognitionException {
        pollenParser.importAs_return retval = new pollenParser.importAs_return();
        retval.start = input.LT(1);

        int importAs_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom string_literal82=null;
        pollenParser.qualName_return qualName83 =null;


        BaseNode string_literal82_tree=null;
        RewriteRuleTokenStream stream_138=new RewriteRuleTokenStream(adaptor,"token 138");
        RewriteRuleSubtreeStream stream_qualName=new RewriteRuleSubtreeStream(adaptor,"rule qualName");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:338:2: ( 'as' qualName -> qualName | -> NIL )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==138) ) {
                alt26=1;
            }
            else if ( (LA26_0==EOF||(LA26_0 >= BIT_NOT && LA26_0 <= CHAR)||LA26_0==DEC||LA26_0==HEX_LIT||LA26_0==IDENT||(LA26_0 >= INC && LA26_0 <= INT_LIT)||LA26_0==LOG_NOT||LA26_0==MINUS||LA26_0==NL||LA26_0==OCT_LIT||LA26_0==REAL_LIT||LA26_0==SEMI||LA26_0==STRING||LA26_0==122||LA26_0==125||(LA26_0 >= 134 && LA26_0 <= 135)||(LA26_0 >= 139 && LA26_0 <= 149)||LA26_0==152||LA26_0==154||(LA26_0 >= 156 && LA26_0 <= 160)||(LA26_0 >= 162 && LA26_0 <= 165)||(LA26_0 >= 167 && LA26_0 <= 170)||(LA26_0 >= 173 && LA26_0 <= 180)||(LA26_0 >= 182 && LA26_0 <= 187)||LA26_0==190) ) {
                alt26=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;

            }
            switch (alt26) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:338:4: 'as' qualName
                    {
                    string_literal82=(Atom)match(input,138,FOLLOW_138_in_importAs1547); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_138.add(string_literal82);


                    pushFollow(FOLLOW_qualName_in_importAs1549);
                    qualName83=qualName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_qualName.add(qualName83.getTree());

                    // AST REWRITE
                    // elements: qualName
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (BaseNode)adaptor.nil();
                    // 338:18: -> qualName
                    {
                        adaptor.addChild(root_0, stream_qualName.nextTree());

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:339:4: 
                    {
                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (BaseNode)adaptor.nil();
                    // 339:4: -> NIL
                    {
                        adaptor.addChild(root_0, 
                        (BaseNode)adaptor.create(NIL, "NIL")
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (BaseNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BaseNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 21, importAs_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "importAs"


    public static class importList_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "importList"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:341:1: importList : ( stmtImport )* -> ^( LIST[\"LIST\"] ( stmtImport )* ) ;
    public final pollenParser.importList_return importList() throws RecognitionException {
        pollenParser.importList_return retval = new pollenParser.importList_return();
        retval.start = input.LT(1);

        int importList_StartIndex = input.index();

        BaseNode root_0 = null;

        pollenParser.stmtImport_return stmtImport84 =null;


        RewriteRuleSubtreeStream stream_stmtImport=new RewriteRuleSubtreeStream(adaptor,"rule stmtImport");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:342:5: ( ( stmtImport )* -> ^( LIST[\"LIST\"] ( stmtImport )* ) )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:342:9: ( stmtImport )*
            {
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:342:9: ( stmtImport )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==158||LA27_0==162) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:342:9: stmtImport
            	    {
            	    pushFollow(FOLLOW_stmtImport_in_importList1575);
            	    stmtImport84=stmtImport();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_stmtImport.add(stmtImport84.getTree());

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);


            // AST REWRITE
            // elements: stmtImport
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (BaseNode)adaptor.nil();
            // 343:6: -> ^( LIST[\"LIST\"] ( stmtImport )* )
            {
                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:343:9: ^( LIST[\"LIST\"] ( stmtImport )* )
                {
                BaseNode root_1 = (BaseNode)adaptor.nil();
                root_1 = (BaseNode)adaptor.becomeRoot(
                new ListNode(LIST, "LIST")
                , root_1);

                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:343:34: ( stmtImport )*
                while ( stream_stmtImport.hasNext() ) {
                    adaptor.addChild(root_1, stream_stmtImport.nextTree());

                }
                stream_stmtImport.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (BaseNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BaseNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 22, importList_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "importList"


    public static class meta_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "meta"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:345:1: meta : 'meta' ( braceOpen metaFormalParameters braceClose ) -> ^( D_META metaFormalParameters ) ;
    public final pollenParser.meta_return meta() throws RecognitionException {
        pollenParser.meta_return retval = new pollenParser.meta_return();
        retval.start = input.LT(1);

        int meta_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom string_literal85=null;
        pollenParser.braceOpen_return braceOpen86 =null;

        pollenParser.metaFormalParameters_return metaFormalParameters87 =null;

        pollenParser.braceClose_return braceClose88 =null;


        BaseNode string_literal85_tree=null;
        RewriteRuleTokenStream stream_167=new RewriteRuleTokenStream(adaptor,"token 167");
        RewriteRuleSubtreeStream stream_metaFormalParameters=new RewriteRuleSubtreeStream(adaptor,"rule metaFormalParameters");
        RewriteRuleSubtreeStream stream_braceOpen=new RewriteRuleSubtreeStream(adaptor,"rule braceOpen");
        RewriteRuleSubtreeStream stream_braceClose=new RewriteRuleSubtreeStream(adaptor,"rule braceClose");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:346:2: ( 'meta' ( braceOpen metaFormalParameters braceClose ) -> ^( D_META metaFormalParameters ) )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:346:4: 'meta' ( braceOpen metaFormalParameters braceClose )
            {
            string_literal85=(Atom)match(input,167,FOLLOW_167_in_meta1609); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_167.add(string_literal85);


            if ( state.backtracking==0 ) { ti.setUnitFlags(EnumSet.of(Flags.META));}

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:348:3: ( braceOpen metaFormalParameters braceClose )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:348:4: braceOpen metaFormalParameters braceClose
            {
            pushFollow(FOLLOW_braceOpen_in_meta1618);
            braceOpen86=braceOpen();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_braceOpen.add(braceOpen86.getTree());

            pushFollow(FOLLOW_metaFormalParameters_in_meta1620);
            metaFormalParameters87=metaFormalParameters();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_metaFormalParameters.add(metaFormalParameters87.getTree());

            pushFollow(FOLLOW_braceClose_in_meta1622);
            braceClose88=braceClose();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_braceClose.add(braceClose88.getTree());

            }


            // AST REWRITE
            // elements: metaFormalParameters
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (BaseNode)adaptor.nil();
            // 349:3: -> ^( D_META metaFormalParameters )
            {
                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:349:6: ^( D_META metaFormalParameters )
                {
                BaseNode root_1 = (BaseNode)adaptor.nil();
                root_1 = (BaseNode)adaptor.becomeRoot(
                (BaseNode)adaptor.create(D_META, "D_META")
                , root_1);

                adaptor.addChild(root_1, stream_metaFormalParameters.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (BaseNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BaseNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 23, meta_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "meta"


    public static class metaFormalParameters_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "metaFormalParameters"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:351:1: metaFormalParameters : metaFormalParameter ( ',' metaFormalParameter )* -> ( metaFormalParameter )+ ;
    public final pollenParser.metaFormalParameters_return metaFormalParameters() throws RecognitionException {
        pollenParser.metaFormalParameters_return retval = new pollenParser.metaFormalParameters_return();
        retval.start = input.LT(1);

        int metaFormalParameters_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom char_literal90=null;
        pollenParser.metaFormalParameter_return metaFormalParameter89 =null;

        pollenParser.metaFormalParameter_return metaFormalParameter91 =null;


        BaseNode char_literal90_tree=null;
        RewriteRuleTokenStream stream_125=new RewriteRuleTokenStream(adaptor,"token 125");
        RewriteRuleSubtreeStream stream_metaFormalParameter=new RewriteRuleSubtreeStream(adaptor,"rule metaFormalParameter");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:352:4: ( metaFormalParameter ( ',' metaFormalParameter )* -> ( metaFormalParameter )+ )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:352:8: metaFormalParameter ( ',' metaFormalParameter )*
            {
            pushFollow(FOLLOW_metaFormalParameter_in_metaFormalParameters1647);
            metaFormalParameter89=metaFormalParameter();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_metaFormalParameter.add(metaFormalParameter89.getTree());

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:352:29: ( ',' metaFormalParameter )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==125) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:352:30: ',' metaFormalParameter
            	    {
            	    char_literal90=(Atom)match(input,125,FOLLOW_125_in_metaFormalParameters1651); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_125.add(char_literal90);


            	    pushFollow(FOLLOW_metaFormalParameter_in_metaFormalParameters1653);
            	    metaFormalParameter91=metaFormalParameter();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_metaFormalParameter.add(metaFormalParameter91.getTree());

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);


            // AST REWRITE
            // elements: metaFormalParameter
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (BaseNode)adaptor.nil();
            // 352:56: -> ( metaFormalParameter )+
            {
                if ( !(stream_metaFormalParameter.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_metaFormalParameter.hasNext() ) {
                    adaptor.addChild(root_0, stream_metaFormalParameter.nextTree());

                }
                stream_metaFormalParameter.reset();

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (BaseNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BaseNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 24, metaFormalParameters_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "metaFormalParameters"


    public static class metaFormalParameter_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "metaFormalParameter"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:355:1: metaFormalParameter : metaFormalParameterType IDENT ( ASSIGN metaArgument )? -> ^( metaFormalParameterType ^( IDENT ( metaArgument )? ) ) ;
    public final pollenParser.metaFormalParameter_return metaFormalParameter() throws RecognitionException {
        pollenParser.metaFormalParameter_return retval = new pollenParser.metaFormalParameter_return();
        retval.start = input.LT(1);

        int metaFormalParameter_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom IDENT93=null;
        Atom ASSIGN94=null;
        pollenParser.metaFormalParameterType_return metaFormalParameterType92 =null;

        pollenParser.metaArgument_return metaArgument95 =null;


        BaseNode IDENT93_tree=null;
        BaseNode ASSIGN94_tree=null;
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
        RewriteRuleSubtreeStream stream_metaArgument=new RewriteRuleSubtreeStream(adaptor,"rule metaArgument");
        RewriteRuleSubtreeStream stream_metaFormalParameterType=new RewriteRuleSubtreeStream(adaptor,"rule metaFormalParameterType");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:356:4: ( metaFormalParameterType IDENT ( ASSIGN metaArgument )? -> ^( metaFormalParameterType ^( IDENT ( metaArgument )? ) ) )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:356:4: metaFormalParameterType IDENT ( ASSIGN metaArgument )?
            {
            pushFollow(FOLLOW_metaFormalParameterType_in_metaFormalParameter1676);
            metaFormalParameterType92=metaFormalParameterType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_metaFormalParameterType.add(metaFormalParameterType92.getTree());

            IDENT93=(Atom)match(input,IDENT,FOLLOW_IDENT_in_metaFormalParameter1678); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENT.add(IDENT93);


            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:356:34: ( ASSIGN metaArgument )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==ASSIGN) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:356:35: ASSIGN metaArgument
                    {
                    ASSIGN94=(Atom)match(input,ASSIGN,FOLLOW_ASSIGN_in_metaFormalParameter1681); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ASSIGN.add(ASSIGN94);


                    pushFollow(FOLLOW_metaArgument_in_metaFormalParameter1683);
                    metaArgument95=metaArgument();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_metaArgument.add(metaArgument95.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: metaArgument, IDENT, metaFormalParameterType
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (BaseNode)adaptor.nil();
            // 357:2: -> ^( metaFormalParameterType ^( IDENT ( metaArgument )? ) )
            {
                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:357:5: ^( metaFormalParameterType ^( IDENT ( metaArgument )? ) )
                {
                BaseNode root_1 = (BaseNode)adaptor.nil();
                root_1 = (BaseNode)adaptor.becomeRoot(stream_metaFormalParameterType.nextNode(), root_1);

                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:357:31: ^( IDENT ( metaArgument )? )
                {
                BaseNode root_2 = (BaseNode)adaptor.nil();
                root_2 = (BaseNode)adaptor.becomeRoot(
                stream_IDENT.nextNode()
                , root_2);

                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:357:39: ( metaArgument )?
                if ( stream_metaArgument.hasNext() ) {
                    adaptor.addChild(root_2, stream_metaArgument.nextTree());

                }
                stream_metaArgument.reset();

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (BaseNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BaseNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 25, metaFormalParameter_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "metaFormalParameter"


    public static class metaFormalParameterType_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "metaFormalParameterType"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:360:1: metaFormalParameterType : ( 'type' | builtinType );
    public final pollenParser.metaFormalParameterType_return metaFormalParameterType() throws RecognitionException {
        pollenParser.metaFormalParameterType_return retval = new pollenParser.metaFormalParameterType_return();
        retval.start = input.LT(1);

        int metaFormalParameterType_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom string_literal96=null;
        pollenParser.builtinType_return builtinType97 =null;


        BaseNode string_literal96_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:361:3: ( 'type' | builtinType )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==181) ) {
                alt30=1;
            }
            else if ( (LA30_0==140||LA30_0==142||(LA30_0 >= 163 && LA30_0 <= 165)||LA30_0==178||(LA30_0 >= 182 && LA30_0 <= 184)) ) {
                alt30=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;

            }
            switch (alt30) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:361:5: 'type'
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    string_literal96=(Atom)match(input,181,FOLLOW_181_in_metaFormalParameterType1712); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal96_tree = 
                    (BaseNode)adaptor.create(string_literal96)
                    ;
                    adaptor.addChild(root_0, string_literal96_tree);
                    }

                    }
                    break;
                case 2 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:362:5: builtinType
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    pushFollow(FOLLOW_builtinType_in_metaFormalParameterType1719);
                    builtinType97=builtinType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, builtinType97.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (BaseNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BaseNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 26, metaFormalParameterType_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "metaFormalParameterType"


    public static class metaArguments_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "metaArguments"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:364:1: metaArguments : ( '{' metaArgument ( ',' metaArgument )* '}' -> ^( LIST[\"LIST\"] ( metaArgument )+ ) | '{' '}' -> LIST[\"LIST\"] );
    public final pollenParser.metaArguments_return metaArguments() throws RecognitionException {
        pollenParser.metaArguments_return retval = new pollenParser.metaArguments_return();
        retval.start = input.LT(1);

        int metaArguments_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom char_literal98=null;
        Atom char_literal100=null;
        Atom char_literal102=null;
        Atom char_literal103=null;
        Atom char_literal104=null;
        pollenParser.metaArgument_return metaArgument99 =null;

        pollenParser.metaArgument_return metaArgument101 =null;


        BaseNode char_literal98_tree=null;
        BaseNode char_literal100_tree=null;
        BaseNode char_literal102_tree=null;
        BaseNode char_literal103_tree=null;
        BaseNode char_literal104_tree=null;
        RewriteRuleTokenStream stream_125=new RewriteRuleTokenStream(adaptor,"token 125");
        RewriteRuleTokenStream stream_187=new RewriteRuleTokenStream(adaptor,"token 187");
        RewriteRuleTokenStream stream_190=new RewriteRuleTokenStream(adaptor,"token 190");
        RewriteRuleSubtreeStream stream_metaArgument=new RewriteRuleSubtreeStream(adaptor,"rule metaArgument");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:365:4: ( '{' metaArgument ( ',' metaArgument )* '}' -> ^( LIST[\"LIST\"] ( metaArgument )+ ) | '{' '}' -> LIST[\"LIST\"] )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==187) ) {
                int LA32_1 = input.LA(2);

                if ( (synpred42_pollen()) ) {
                    alt32=1;
                }
                else if ( (true) ) {
                    alt32=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 32, 1, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;

            }
            switch (alt32) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:365:7: '{' metaArgument ( ',' metaArgument )* '}'
                    {
                    char_literal98=(Atom)match(input,187,FOLLOW_187_in_metaArguments1732); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_187.add(char_literal98);


                    pushFollow(FOLLOW_metaArgument_in_metaArguments1734);
                    metaArgument99=metaArgument();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_metaArgument.add(metaArgument99.getTree());

                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:365:25: ( ',' metaArgument )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==125) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:365:26: ',' metaArgument
                    	    {
                    	    char_literal100=(Atom)match(input,125,FOLLOW_125_in_metaArguments1738); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_125.add(char_literal100);


                    	    pushFollow(FOLLOW_metaArgument_in_metaArguments1740);
                    	    metaArgument101=metaArgument();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_metaArgument.add(metaArgument101.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop31;
                        }
                    } while (true);


                    char_literal102=(Atom)match(input,190,FOLLOW_190_in_metaArguments1744); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_190.add(char_literal102);


                    // AST REWRITE
                    // elements: metaArgument
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (BaseNode)adaptor.nil();
                    // 365:49: -> ^( LIST[\"LIST\"] ( metaArgument )+ )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:365:52: ^( LIST[\"LIST\"] ( metaArgument )+ )
                        {
                        BaseNode root_1 = (BaseNode)adaptor.nil();
                        root_1 = (BaseNode)adaptor.becomeRoot(
                        new ListNode(LIST, "LIST")
                        , root_1);

                        if ( !(stream_metaArgument.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_metaArgument.hasNext() ) {
                            adaptor.addChild(root_1, stream_metaArgument.nextTree());

                        }
                        stream_metaArgument.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:366:6: '{' '}'
                    {
                    char_literal103=(Atom)match(input,187,FOLLOW_187_in_metaArguments1764); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_187.add(char_literal103);


                    char_literal104=(Atom)match(input,190,FOLLOW_190_in_metaArguments1766); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_190.add(char_literal104);


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (BaseNode)adaptor.nil();
                    // 366:19: -> LIST[\"LIST\"]
                    {
                        adaptor.addChild(root_0, 
                        new ListNode(LIST, "LIST")
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (BaseNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BaseNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 27, metaArguments_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "metaArguments"


    public static class metaArgument_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "metaArgument"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:369:1: metaArgument : ( primitiveLit | typeNameScalar );
    public final pollenParser.metaArgument_return metaArgument() throws RecognitionException {
        pollenParser.metaArgument_return retval = new pollenParser.metaArgument_return();
        retval.start = input.LT(1);

        int metaArgument_StartIndex = input.index();

        BaseNode root_0 = null;

        pollenParser.primitiveLit_return primitiveLit105 =null;

        pollenParser.typeNameScalar_return typeNameScalar106 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:370:2: ( primitiveLit | typeNameScalar )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==CHAR||LA33_0==HEX_LIT||LA33_0==INT_LIT||LA33_0==OCT_LIT||LA33_0==REAL_LIT||LA33_0==STRING||LA33_0==156||LA33_0==170||LA33_0==180) ) {
                alt33=1;
            }
            else if ( (LA33_0==IDENT||LA33_0==140||LA33_0==142||(LA33_0 >= 163 && LA33_0 <= 165)||LA33_0==178||(LA33_0 >= 182 && LA33_0 <= 184)) ) {
                alt33=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;

            }
            switch (alt33) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:370:4: primitiveLit
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    pushFollow(FOLLOW_primitiveLit_in_metaArgument1795);
                    primitiveLit105=primitiveLit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveLit105.getTree());

                    }
                    break;
                case 2 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:371:4: typeNameScalar
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    pushFollow(FOLLOW_typeNameScalar_in_metaArgument1801);
                    typeNameScalar106=typeNameScalar();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeNameScalar106.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (BaseNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BaseNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 28, metaArgument_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "metaArgument"


    public static class typeName_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "typeName"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:373:1: typeName : typeNameScalar ;
    public final pollenParser.typeName_return typeName() throws RecognitionException {
        pollenParser.typeName_return retval = new pollenParser.typeName_return();
        retval.start = input.LT(1);

        int typeName_StartIndex = input.index();

        BaseNode root_0 = null;

        pollenParser.typeNameScalar_return typeNameScalar107 =null;




        	//System.out.print("typeName: "); DBG_LT(); <DeclNode.Fcn>["D_FCN_DCL", atFlags]

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:377:2: ( typeNameScalar )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:377:4: typeNameScalar
            {
            root_0 = (BaseNode)adaptor.nil();


            pushFollow(FOLLOW_typeNameScalar_in_typeName1815);
            typeNameScalar107=typeNameScalar();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, typeNameScalar107.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (BaseNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BaseNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 29, typeName_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "typeName"


    public static class typeNameScalar_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "typeNameScalar"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:379:1: typeNameScalar : ( builtinType | userTypeName );
    public final pollenParser.typeNameScalar_return typeNameScalar() throws RecognitionException {
        pollenParser.typeNameScalar_return retval = new pollenParser.typeNameScalar_return();
        retval.start = input.LT(1);

        int typeNameScalar_StartIndex = input.index();

        BaseNode root_0 = null;

        pollenParser.builtinType_return builtinType108 =null;

        pollenParser.userTypeName_return userTypeName109 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:380:2: ( builtinType | userTypeName )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==140||LA34_0==142||(LA34_0 >= 163 && LA34_0 <= 165)||LA34_0==178||(LA34_0 >= 182 && LA34_0 <= 184)) ) {
                alt34=1;
            }
            else if ( (LA34_0==IDENT) ) {
                alt34=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;

            }
            switch (alt34) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:380:4: builtinType
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    pushFollow(FOLLOW_builtinType_in_typeNameScalar1828);
                    builtinType108=builtinType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, builtinType108.getTree());

                    }
                    break;
                case 2 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:381:4: userTypeName
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    pushFollow(FOLLOW_userTypeName_in_typeNameScalar1833);
                    userTypeName109=userTypeName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, userTypeName109.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (BaseNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BaseNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 30, typeNameScalar_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "typeNameScalar"


    public static class userTypeName_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "userTypeName"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:383:1: userTypeName : ( qualName metaArguments -> ^( T_USER_TYPE[\"T_USER_TYPE\", atFlags] qualName metaArguments ) | qualName -> ^( T_USER_TYPE[\"T_USER_TYPE\", atFlags] qualName ) );
    public final pollenParser.userTypeName_return userTypeName() throws RecognitionException {
        pollenParser.userTypeName_return retval = new pollenParser.userTypeName_return();
        retval.start = input.LT(1);

        int userTypeName_StartIndex = input.index();

        BaseNode root_0 = null;

        pollenParser.qualName_return qualName110 =null;

        pollenParser.metaArguments_return metaArguments111 =null;

        pollenParser.qualName_return qualName112 =null;


        RewriteRuleSubtreeStream stream_qualName=new RewriteRuleSubtreeStream(adaptor,"rule qualName");
        RewriteRuleSubtreeStream stream_metaArguments=new RewriteRuleSubtreeStream(adaptor,"rule metaArguments");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:384:2: ( qualName metaArguments -> ^( T_USER_TYPE[\"T_USER_TYPE\", atFlags] qualName metaArguments ) | qualName -> ^( T_USER_TYPE[\"T_USER_TYPE\", atFlags] qualName ) )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==IDENT) ) {
                int LA35_1 = input.LA(2);

                if ( (synpred45_pollen()) ) {
                    alt35=1;
                }
                else if ( (true) ) {
                    alt35=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 35, 1, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;

            }
            switch (alt35) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:384:4: qualName metaArguments
                    {
                    pushFollow(FOLLOW_qualName_in_userTypeName1843);
                    qualName110=qualName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_qualName.add(qualName110.getTree());

                    pushFollow(FOLLOW_metaArguments_in_userTypeName1845);
                    metaArguments111=metaArguments();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_metaArguments.add(metaArguments111.getTree());

                    // AST REWRITE
                    // elements: qualName, metaArguments
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (BaseNode)adaptor.nil();
                    // 384:27: -> ^( T_USER_TYPE[\"T_USER_TYPE\", atFlags] qualName metaArguments )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:384:30: ^( T_USER_TYPE[\"T_USER_TYPE\", atFlags] qualName metaArguments )
                        {
                        BaseNode root_1 = (BaseNode)adaptor.nil();
                        root_1 = (BaseNode)adaptor.becomeRoot(
                        new TypeNode.UserDef(T_USER_TYPE, "T_USER_TYPE", atFlags)
                        , root_1);

                        adaptor.addChild(root_1, stream_qualName.nextTree());

                        adaptor.addChild(root_1, stream_metaArguments.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:385:4: qualName
                    {
                    pushFollow(FOLLOW_qualName_in_userTypeName1866);
                    qualName112=qualName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_qualName.add(qualName112.getTree());

                    // AST REWRITE
                    // elements: qualName
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (BaseNode)adaptor.nil();
                    // 385:14: -> ^( T_USER_TYPE[\"T_USER_TYPE\", atFlags] qualName )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:385:17: ^( T_USER_TYPE[\"T_USER_TYPE\", atFlags] qualName )
                        {
                        BaseNode root_1 = (BaseNode)adaptor.nil();
                        root_1 = (BaseNode)adaptor.becomeRoot(
                        new TypeNode.UserDef(T_USER_TYPE, "T_USER_TYPE", atFlags)
                        , root_1);

                        adaptor.addChild(root_1, stream_qualName.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (BaseNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BaseNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 31, userTypeName_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "userTypeName"


    public static class unitTypeDefinition_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "unitTypeDefinition"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:388:1: unitTypeDefinition : ( meta )? ( ( 'module' )=> moduleDefinition | ( 'class' )=> classDefinition | ( 'protocol' )=> protocolDefinition | ( 'composition' )=> compositionDefinition | ( 'enum' )=> enumDefinition ) ;
    public final pollenParser.unitTypeDefinition_return unitTypeDefinition() throws RecognitionException {
        pollenParser.unitTypeDefinition_return retval = new pollenParser.unitTypeDefinition_return();
        retval.start = input.LT(1);

        int unitTypeDefinition_StartIndex = input.index();

        BaseNode root_0 = null;

        pollenParser.meta_return meta113 =null;

        pollenParser.moduleDefinition_return moduleDefinition114 =null;

        pollenParser.classDefinition_return classDefinition115 =null;

        pollenParser.protocolDefinition_return protocolDefinition116 =null;

        pollenParser.compositionDefinition_return compositionDefinition117 =null;

        pollenParser.enumDefinition_return enumDefinition118 =null;




        		ti = new TypeInfo();
        		tl.add(ti);		

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:397:4: ( ( meta )? ( ( 'module' )=> moduleDefinition | ( 'class' )=> classDefinition | ( 'protocol' )=> protocolDefinition | ( 'composition' )=> compositionDefinition | ( 'enum' )=> enumDefinition ) )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:397:8: ( meta )? ( ( 'module' )=> moduleDefinition | ( 'class' )=> classDefinition | ( 'protocol' )=> protocolDefinition | ( 'composition' )=> compositionDefinition | ( 'enum' )=> enumDefinition )
            {
            root_0 = (BaseNode)adaptor.nil();


            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:397:8: ( meta )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==167) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:397:9: meta
                    {
                    pushFollow(FOLLOW_meta_in_unitTypeDefinition1905);
                    meta113=meta();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, meta113.getTree());

                    }
                    break;

            }


            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:397:17: ( ( 'module' )=> moduleDefinition | ( 'class' )=> classDefinition | ( 'protocol' )=> protocolDefinition | ( 'composition' )=> compositionDefinition | ( 'enum' )=> enumDefinition )
            int alt37=5;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==168) && (synpred47_pollen())) {
                alt37=1;
            }
            else if ( (LA37_0==144) && (synpred48_pollen())) {
                alt37=2;
            }
            else if ( (LA37_0==174) && (synpred49_pollen())) {
                alt37=3;
            }
            else if ( (LA37_0==145) && (synpred50_pollen())) {
                alt37=4;
            }
            else if ( (LA37_0==152) && (synpred51_pollen())) {
                alt37=5;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;

            }
            switch (alt37) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:398:10: ( 'module' )=> moduleDefinition
                    {
                    pushFollow(FOLLOW_moduleDefinition_in_unitTypeDefinition1927);
                    moduleDefinition114=moduleDefinition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, moduleDefinition114.getTree());

                    }
                    break;
                case 2 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:399:8: ( 'class' )=> classDefinition
                    {
                    pushFollow(FOLLOW_classDefinition_in_unitTypeDefinition1948);
                    classDefinition115=classDefinition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, classDefinition115.getTree());

                    }
                    break;
                case 3 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:400:10: ( 'protocol' )=> protocolDefinition
                    {
                    pushFollow(FOLLOW_protocolDefinition_in_unitTypeDefinition1965);
                    protocolDefinition116=protocolDefinition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, protocolDefinition116.getTree());

                    }
                    break;
                case 4 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:401:10: ( 'composition' )=> compositionDefinition
                    {
                    pushFollow(FOLLOW_compositionDefinition_in_unitTypeDefinition1983);
                    compositionDefinition117=compositionDefinition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, compositionDefinition117.getTree());

                    }
                    break;
                case 5 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:402:10: ( 'enum' )=> enumDefinition
                    {
                    pushFollow(FOLLOW_enumDefinition_in_unitTypeDefinition2001);
                    enumDefinition118=enumDefinition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, enumDefinition118.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (BaseNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) {
               // debug
            	System.out.println(ti.getTypeName() + ", " + ti.getUnitFlags().toString());
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BaseNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 32, unitTypeDefinition_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "unitTypeDefinition"


    public static class extendsClause_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "extendsClause"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:406:1: extendsClause : 'extends' ^ IDENT ;
    public final pollenParser.extendsClause_return extendsClause() throws RecognitionException {
        pollenParser.extendsClause_return retval = new pollenParser.extendsClause_return();
        retval.start = input.LT(1);

        int extendsClause_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom string_literal119=null;
        Atom IDENT120=null;

        BaseNode string_literal119_tree=null;
        BaseNode IDENT120_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:407:5: ( 'extends' ^ IDENT )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:407:9: 'extends' ^ IDENT
            {
            root_0 = (BaseNode)adaptor.nil();


            string_literal119=(Atom)match(input,155,FOLLOW_155_in_extendsClause2026); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal119_tree = 
            (BaseNode)adaptor.create(string_literal119)
            ;
            root_0 = (BaseNode)adaptor.becomeRoot(string_literal119_tree, root_0);
            }

            IDENT120=(Atom)match(input,IDENT,FOLLOW_IDENT_in_extendsClause2029); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENT120_tree = 
            (BaseNode)adaptor.create(IDENT120)
            ;
            adaptor.addChild(root_0, IDENT120_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (BaseNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BaseNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 33, extendsClause_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "extendsClause"


    public static class implementsClause_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "implementsClause"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:410:1: implementsClause : 'implements' ^ IDENT ;
    public final pollenParser.implementsClause_return implementsClause() throws RecognitionException {
        pollenParser.implementsClause_return retval = new pollenParser.implementsClause_return();
        retval.start = input.LT(1);

        int implementsClause_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom string_literal121=null;
        Atom IDENT122=null;

        BaseNode string_literal121_tree=null;
        BaseNode IDENT122_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 34) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:411:5: ( 'implements' ^ IDENT )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:411:9: 'implements' ^ IDENT
            {
            root_0 = (BaseNode)adaptor.nil();


            string_literal121=(Atom)match(input,161,FOLLOW_161_in_implementsClause2048); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal121_tree = 
            (BaseNode)adaptor.create(string_literal121)
            ;
            root_0 = (BaseNode)adaptor.becomeRoot(string_literal121_tree, root_0);
            }

            IDENT122=(Atom)match(input,IDENT,FOLLOW_IDENT_in_implementsClause2051); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENT122_tree = 
            (BaseNode)adaptor.create(IDENT122)
            ;
            adaptor.addChild(root_0, IDENT122_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (BaseNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BaseNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 34, implementsClause_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "implementsClause"


    public static class braceClose_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "braceClose"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:413:1: braceClose : ( NL !)* '}' ! ( NL !)* ;
    public final pollenParser.braceClose_return braceClose() throws RecognitionException {
        pollenParser.braceClose_return retval = new pollenParser.braceClose_return();
        retval.start = input.LT(1);

        int braceClose_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom NL123=null;
        Atom char_literal124=null;
        Atom NL125=null;

        BaseNode NL123_tree=null;
        BaseNode char_literal124_tree=null;
        BaseNode NL125_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 35) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:414:5: ( ( NL !)* '}' ! ( NL !)* )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:414:10: ( NL !)* '}' ! ( NL !)*
            {
            root_0 = (BaseNode)adaptor.nil();


            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:414:10: ( NL !)*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==NL) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:414:11: NL !
            	    {
            	    NL123=(Atom)match(input,NL,FOLLOW_NL_in_braceClose2071); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);


            char_literal124=(Atom)match(input,190,FOLLOW_190_in_braceClose2076); if (state.failed) return retval;

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:414:22: ( NL !)*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==NL) ) {
                    int LA39_1 = input.LA(2);

                    if ( (synpred53_pollen()) ) {
                        alt39=1;
                    }


                }


                switch (alt39) {
            	case 1 :
            	    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:414:23: NL !
            	    {
            	    NL125=(Atom)match(input,NL,FOLLOW_NL_in_braceClose2080); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (BaseNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BaseNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 35, braceClose_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "braceClose"


    public static class braceCloseAtEOF_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "braceCloseAtEOF"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:416:1: braceCloseAtEOF : ( ( NL !)* ) '}' ! ( NL !)* ;
    public final pollenParser.braceCloseAtEOF_return braceCloseAtEOF() throws RecognitionException {
        pollenParser.braceCloseAtEOF_return retval = new pollenParser.braceCloseAtEOF_return();
        retval.start = input.LT(1);

        int braceCloseAtEOF_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom NL126=null;
        Atom char_literal127=null;
        Atom NL128=null;

        BaseNode NL126_tree=null;
        BaseNode char_literal127_tree=null;
        BaseNode NL128_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 36) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:419:5: ( ( ( NL !)* ) '}' ! ( NL !)* )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:419:9: ( ( NL !)* ) '}' ! ( NL !)*
            {
            root_0 = (BaseNode)adaptor.nil();


            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:419:9: ( ( NL !)* )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:419:10: ( NL !)*
            {
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:419:12: ( NL !)*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==NL) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:419:12: NL !
            	    {
            	    NL126=(Atom)match(input,NL,FOLLOW_NL_in_braceCloseAtEOF2104); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);


            }


            char_literal127=(Atom)match(input,190,FOLLOW_190_in_braceCloseAtEOF2109); if (state.failed) return retval;

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:419:21: ( NL !)*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==NL) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:419:22: NL !
            	    {
            	    NL128=(Atom)match(input,NL,FOLLOW_NL_in_braceCloseAtEOF2113); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (BaseNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BaseNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 36, braceCloseAtEOF_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "braceCloseAtEOF"


    public static class braceOpen_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "braceOpen"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:422:1: braceOpen : ( NL !)* '{' ! ( NL !)* ;
    public final pollenParser.braceOpen_return braceOpen() throws RecognitionException {
        pollenParser.braceOpen_return retval = new pollenParser.braceOpen_return();
        retval.start = input.LT(1);

        int braceOpen_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom NL129=null;
        Atom char_literal130=null;
        Atom NL131=null;

        BaseNode NL129_tree=null;
        BaseNode char_literal130_tree=null;
        BaseNode NL131_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 37) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:423:5: ( ( NL !)* '{' ! ( NL !)* )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:423:10: ( NL !)* '{' ! ( NL !)*
            {
            root_0 = (BaseNode)adaptor.nil();


            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:423:10: ( NL !)*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==NL) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:423:11: NL !
            	    {
            	    NL129=(Atom)match(input,NL,FOLLOW_NL_in_braceOpen2138); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);


            char_literal130=(Atom)match(input,187,FOLLOW_187_in_braceOpen2143); if (state.failed) return retval;

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:423:22: ( NL !)*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==NL) ) {
                    int LA43_1 = input.LA(2);

                    if ( (synpred57_pollen()) ) {
                        alt43=1;
                    }


                }


                switch (alt43) {
            	case 1 :
            	    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:423:23: NL !
            	    {
            	    NL131=(Atom)match(input,NL,FOLLOW_NL_in_braceOpen2147); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (BaseNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BaseNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 37, braceOpen_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "braceOpen"


    public static class equalityOp_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "equalityOp"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:425:1: equalityOp : ( EQ | NOT_EQ );
    public final pollenParser.equalityOp_return equalityOp() throws RecognitionException {
        pollenParser.equalityOp_return retval = new pollenParser.equalityOp_return();
        retval.start = input.LT(1);

        int equalityOp_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom set132=null;

        BaseNode set132_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 38) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:426:2: ( EQ | NOT_EQ )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:
            {
            root_0 = (BaseNode)adaptor.nil();


            set132=(Atom)input.LT(1);

            if ( input.LA(1)==EQ||input.LA(1)==NOT_EQ ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (BaseNode)adaptor.create(set132)
                );
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (BaseNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BaseNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 38, equalityOp_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "equalityOp"


    public static class relationalOp_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "relationalOp"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:428:1: relationalOp : ( '<' | '>' | LT_EQ | GT_EQ );
    public final pollenParser.relationalOp_return relationalOp() throws RecognitionException {
        pollenParser.relationalOp_return retval = new pollenParser.relationalOp_return();
        retval.start = input.LT(1);

        int relationalOp_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom set133=null;

        BaseNode set133_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 39) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:429:2: ( '<' | '>' | LT_EQ | GT_EQ )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:
            {
            root_0 = (BaseNode)adaptor.nil();


            set133=(Atom)input.LT(1);

            if ( input.LA(1)==GT_EQ||input.LA(1)==LT_EQ||input.LA(1)==129||input.LA(1)==131 ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (BaseNode)adaptor.create(set133)
                );
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (BaseNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BaseNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 39, relationalOp_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "relationalOp"


    public static class shiftOp_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "shiftOp"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:431:1: shiftOp : ( '<<' | '>>' );
    public final pollenParser.shiftOp_return shiftOp() throws RecognitionException {
        pollenParser.shiftOp_return retval = new pollenParser.shiftOp_return();
        retval.start = input.LT(1);

        int shiftOp_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom set134=null;

        BaseNode set134_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 40) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:432:2: ( '<<' | '>>' )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:
            {
            root_0 = (BaseNode)adaptor.nil();


            set134=(Atom)input.LT(1);

            if ( input.LA(1)==130||input.LA(1)==132 ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (BaseNode)adaptor.create(set134)
                );
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (BaseNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BaseNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 40, shiftOp_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "shiftOp"


    public static class incDecOp_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "incDecOp"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:434:1: incDecOp : ( INC | DEC );
    public final pollenParser.incDecOp_return incDecOp() throws RecognitionException {
        pollenParser.incDecOp_return retval = new pollenParser.incDecOp_return();
        retval.start = input.LT(1);

        int incDecOp_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom set135=null;

        BaseNode set135_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 41) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:435:2: ( INC | DEC )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:
            {
            root_0 = (BaseNode)adaptor.nil();


            set135=(Atom)input.LT(1);

            if ( input.LA(1)==DEC||input.LA(1)==INC ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (BaseNode)adaptor.create(set135)
                );
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (BaseNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BaseNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 41, incDecOp_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "incDecOp"


    public static class addSubOp_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "addSubOp"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:437:1: addSubOp : ( PLUS | MINUS );
    public final pollenParser.addSubOp_return addSubOp() throws RecognitionException {
        pollenParser.addSubOp_return retval = new pollenParser.addSubOp_return();
        retval.start = input.LT(1);

        int addSubOp_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom set136=null;

        BaseNode set136_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 42) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:438:2: ( PLUS | MINUS )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:
            {
            root_0 = (BaseNode)adaptor.nil();


            set136=(Atom)input.LT(1);

            if ( input.LA(1)==MINUS||input.LA(1)==PLUS ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (BaseNode)adaptor.create(set136)
                );
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (BaseNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BaseNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 42, addSubOp_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "addSubOp"


    public static class assignOp_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "assignOp"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:440:1: assignOp : ( ADD_EQ | SUB_EQ | MUL_EQ | DIV_EQ | MOD_EQ | LSHFT_EQ | RSHFT_EQ | BITAND_EQ | BITXOR_EQ | BITOR_EQ );
    public final pollenParser.assignOp_return assignOp() throws RecognitionException {
        pollenParser.assignOp_return retval = new pollenParser.assignOp_return();
        retval.start = input.LT(1);

        int assignOp_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom set137=null;

        BaseNode set137_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 43) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:441:2: ( ADD_EQ | SUB_EQ | MUL_EQ | DIV_EQ | MOD_EQ | LSHFT_EQ | RSHFT_EQ | BITAND_EQ | BITXOR_EQ | BITOR_EQ )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:
            {
            root_0 = (BaseNode)adaptor.nil();


            set137=(Atom)input.LT(1);

            if ( input.LA(1)==ADD_EQ||(input.LA(1) >= BITAND_EQ && input.LA(1) <= BITXOR_EQ)||input.LA(1)==DIV_EQ||input.LA(1)==LSHFT_EQ||(input.LA(1) >= MOD_EQ && input.LA(1) <= MUL_EQ)||input.LA(1)==RSHFT_EQ||input.LA(1)==SUB_EQ ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (BaseNode)adaptor.create(set137)
                );
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (BaseNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BaseNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 43, assignOp_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "assignOp"


    public static class multDivModOp_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "multDivModOp"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:443:1: multDivModOp : ( '*' | '/' | '%' );
    public final pollenParser.multDivModOp_return multDivModOp() throws RecognitionException {
        pollenParser.multDivModOp_return retval = new pollenParser.multDivModOp_return();
        retval.start = input.LT(1);

        int multDivModOp_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom set138=null;

        BaseNode set138_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 44) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:444:2: ( '*' | '/' | '%' )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:
            {
            root_0 = (BaseNode)adaptor.nil();


            set138=(Atom)input.LT(1);

            if ( input.LA(1)==119||input.LA(1)==124||input.LA(1)==127 ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (BaseNode)adaptor.create(set138)
                );
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (BaseNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BaseNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 44, multDivModOp_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "multDivModOp"


    public static class logicalNotOp_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "logicalNotOp"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:446:1: logicalNotOp : LOG_NOT ;
    public final pollenParser.logicalNotOp_return logicalNotOp() throws RecognitionException {
        pollenParser.logicalNotOp_return retval = new pollenParser.logicalNotOp_return();
        retval.start = input.LT(1);

        int logicalNotOp_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom LOG_NOT139=null;

        BaseNode LOG_NOT139_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 45) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:447:2: ( LOG_NOT )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:447:4: LOG_NOT
            {
            root_0 = (BaseNode)adaptor.nil();


            LOG_NOT139=(Atom)match(input,LOG_NOT,FOLLOW_LOG_NOT_in_logicalNotOp2324); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            LOG_NOT139_tree = 
            (BaseNode)adaptor.create(LOG_NOT139)
            ;
            adaptor.addChild(root_0, LOG_NOT139_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (BaseNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BaseNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 45, logicalNotOp_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "logicalNotOp"


    public static class bitwiseNotOp_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "bitwiseNotOp"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:449:1: bitwiseNotOp : BIT_NOT ;
    public final pollenParser.bitwiseNotOp_return bitwiseNotOp() throws RecognitionException {
        pollenParser.bitwiseNotOp_return retval = new pollenParser.bitwiseNotOp_return();
        retval.start = input.LT(1);

        int bitwiseNotOp_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom BIT_NOT140=null;

        BaseNode BIT_NOT140_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 46) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:450:2: ( BIT_NOT )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:450:4: BIT_NOT
            {
            root_0 = (BaseNode)adaptor.nil();


            BIT_NOT140=(Atom)match(input,BIT_NOT,FOLLOW_BIT_NOT_in_bitwiseNotOp2335); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            BIT_NOT140_tree = 
            (BaseNode)adaptor.create(BIT_NOT140)
            ;
            adaptor.addChild(root_0, BIT_NOT140_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (BaseNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BaseNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 46, bitwiseNotOp_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "bitwiseNotOp"


    public static class exprList_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "exprList"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:452:1: exprList : ( expr ( ',' expr )* -> ^( LIST[\"LIST\"] ( expr )+ ) | -> LIST[\"LIST\"] );
    public final pollenParser.exprList_return exprList() throws RecognitionException {
        pollenParser.exprList_return retval = new pollenParser.exprList_return();
        retval.start = input.LT(1);

        int exprList_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom char_literal142=null;
        pollenParser.expr_return expr141 =null;

        pollenParser.expr_return expr143 =null;


        BaseNode char_literal142_tree=null;
        RewriteRuleTokenStream stream_125=new RewriteRuleTokenStream(adaptor,"token 125");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 47) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:453:2: ( expr ( ',' expr )* -> ^( LIST[\"LIST\"] ( expr )+ ) | -> LIST[\"LIST\"] )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( ((LA45_0 >= BIT_NOT && LA45_0 <= CHAR)||LA45_0==DEC||LA45_0==HEX_LIT||LA45_0==IDENT||(LA45_0 >= INC && LA45_0 <= INT_LIT)||LA45_0==LOG_NOT||LA45_0==MINUS||LA45_0==OCT_LIT||LA45_0==REAL_LIT||LA45_0==STRING||LA45_0==122||(LA45_0 >= 134 && LA45_0 <= 135)||LA45_0==156||(LA45_0 >= 169 && LA45_0 <= 170)||LA45_0==180) ) {
                int LA45_1 = input.LA(2);

                if ( (synpred77_pollen()) ) {
                    alt45=1;
                }
                else if ( (true) ) {
                    alt45=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 45, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA45_0==NL||LA45_0==SEMI||LA45_0==123||LA45_0==125||LA45_0==136||(LA45_0 >= 139 && LA45_0 <= 149)||LA45_0==152||LA45_0==154||(LA45_0 >= 157 && LA45_0 <= 160)||(LA45_0 >= 162 && LA45_0 <= 165)||(LA45_0 >= 167 && LA45_0 <= 168)||(LA45_0 >= 173 && LA45_0 <= 179)||(LA45_0 >= 182 && LA45_0 <= 187)||LA45_0==190) ) {
                alt45=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;

            }
            switch (alt45) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:453:4: expr ( ',' expr )*
                    {
                    pushFollow(FOLLOW_expr_in_exprList2346);
                    expr141=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr141.getTree());

                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:453:9: ( ',' expr )*
                    loop44:
                    do {
                        int alt44=2;
                        int LA44_0 = input.LA(1);

                        if ( (LA44_0==125) ) {
                            int LA44_1 = input.LA(2);

                            if ( (synpred76_pollen()) ) {
                                alt44=1;
                            }


                        }


                        switch (alt44) {
                    	case 1 :
                    	    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:453:10: ',' expr
                    	    {
                    	    char_literal142=(Atom)match(input,125,FOLLOW_125_in_exprList2349); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_125.add(char_literal142);


                    	    pushFollow(FOLLOW_expr_in_exprList2351);
                    	    expr143=expr();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_expr.add(expr143.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop44;
                        }
                    } while (true);


                    // AST REWRITE
                    // elements: expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (BaseNode)adaptor.nil();
                    // 454:3: -> ^( LIST[\"LIST\"] ( expr )+ )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:454:6: ^( LIST[\"LIST\"] ( expr )+ )
                        {
                        BaseNode root_1 = (BaseNode)adaptor.nil();
                        root_1 = (BaseNode)adaptor.becomeRoot(
                        new ListNode(LIST, "LIST")
                        , root_1);

                        if ( !(stream_expr.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_expr.hasNext() ) {
                            adaptor.addChild(root_1, stream_expr.nextTree());

                        }
                        stream_expr.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:455:4: 
                    {
                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (BaseNode)adaptor.nil();
                    // 455:4: -> LIST[\"LIST\"]
                    {
                        adaptor.addChild(root_0, 
                        new ListNode(LIST, "LIST")
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (BaseNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BaseNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 47, exprList_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "exprList"


    public static class expr_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expr"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:457:1: expr : ( exprLogicalOr '?' expr ':' expr -> ^( E_QUEST[\"E_QUEST\"] exprLogicalOr expr expr ) | exprLogicalOr );
    public final pollenParser.expr_return expr() throws RecognitionException {
        pollenParser.expr_return retval = new pollenParser.expr_return();
        retval.start = input.LT(1);

        int expr_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom char_literal145=null;
        Atom char_literal147=null;
        pollenParser.exprLogicalOr_return exprLogicalOr144 =null;

        pollenParser.expr_return expr146 =null;

        pollenParser.expr_return expr148 =null;

        pollenParser.exprLogicalOr_return exprLogicalOr149 =null;


        BaseNode char_literal145_tree=null;
        BaseNode char_literal147_tree=null;
        RewriteRuleTokenStream stream_128=new RewriteRuleTokenStream(adaptor,"token 128");
        RewriteRuleTokenStream stream_133=new RewriteRuleTokenStream(adaptor,"token 133");
        RewriteRuleSubtreeStream stream_exprLogicalOr=new RewriteRuleSubtreeStream(adaptor,"rule exprLogicalOr");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 48) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:458:2: ( exprLogicalOr '?' expr ':' expr -> ^( E_QUEST[\"E_QUEST\"] exprLogicalOr expr expr ) | exprLogicalOr )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( ((LA46_0 >= BIT_NOT && LA46_0 <= CHAR)||LA46_0==DEC||LA46_0==HEX_LIT||LA46_0==IDENT||(LA46_0 >= INC && LA46_0 <= INT_LIT)||LA46_0==LOG_NOT||LA46_0==MINUS||LA46_0==OCT_LIT||LA46_0==REAL_LIT||LA46_0==STRING||LA46_0==122||(LA46_0 >= 134 && LA46_0 <= 135)||LA46_0==156||(LA46_0 >= 169 && LA46_0 <= 170)||LA46_0==180) ) {
                int LA46_1 = input.LA(2);

                if ( (synpred78_pollen()) ) {
                    alt46=1;
                }
                else if ( (true) ) {
                    alt46=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 46, 1, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;

            }
            switch (alt46) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:458:4: exprLogicalOr '?' expr ':' expr
                    {
                    pushFollow(FOLLOW_exprLogicalOr_in_expr2390);
                    exprLogicalOr144=exprLogicalOr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_exprLogicalOr.add(exprLogicalOr144.getTree());

                    char_literal145=(Atom)match(input,133,FOLLOW_133_in_expr2392); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_133.add(char_literal145);


                    pushFollow(FOLLOW_expr_in_expr2394);
                    expr146=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr146.getTree());

                    char_literal147=(Atom)match(input,128,FOLLOW_128_in_expr2396); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_128.add(char_literal147);


                    pushFollow(FOLLOW_expr_in_expr2398);
                    expr148=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr148.getTree());

                    // AST REWRITE
                    // elements: expr, exprLogicalOr, expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (BaseNode)adaptor.nil();
                    // 458:36: -> ^( E_QUEST[\"E_QUEST\"] exprLogicalOr expr expr )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:458:39: ^( E_QUEST[\"E_QUEST\"] exprLogicalOr expr expr )
                        {
                        BaseNode root_1 = (BaseNode)adaptor.nil();
                        root_1 = (BaseNode)adaptor.becomeRoot(
                        new ExprNode.Quest(E_QUEST, "E_QUEST")
                        , root_1);

                        adaptor.addChild(root_1, stream_exprLogicalOr.nextTree());

                        adaptor.addChild(root_1, stream_expr.nextTree());

                        adaptor.addChild(root_1, stream_expr.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:459:4: exprLogicalOr
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    pushFollow(FOLLOW_exprLogicalOr_in_expr2421);
                    exprLogicalOr149=exprLogicalOr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, exprLogicalOr149.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (BaseNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BaseNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 48, expr_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "expr"


    public static class exprLogicalOr_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "exprLogicalOr"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:461:1: exprLogicalOr : ( exprLogicalAnd -> exprLogicalAnd ) ( '||' exprLogicalAnd -> ^( E_BINARY[\"E_BINARY\"] '||' $exprLogicalOr exprLogicalAnd ) )* ;
    public final pollenParser.exprLogicalOr_return exprLogicalOr() throws RecognitionException {
        pollenParser.exprLogicalOr_return retval = new pollenParser.exprLogicalOr_return();
        retval.start = input.LT(1);

        int exprLogicalOr_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom string_literal151=null;
        pollenParser.exprLogicalAnd_return exprLogicalAnd150 =null;

        pollenParser.exprLogicalAnd_return exprLogicalAnd152 =null;


        BaseNode string_literal151_tree=null;
        RewriteRuleTokenStream stream_189=new RewriteRuleTokenStream(adaptor,"token 189");
        RewriteRuleSubtreeStream stream_exprLogicalAnd=new RewriteRuleSubtreeStream(adaptor,"rule exprLogicalAnd");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 49) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:462:2: ( ( exprLogicalAnd -> exprLogicalAnd ) ( '||' exprLogicalAnd -> ^( E_BINARY[\"E_BINARY\"] '||' $exprLogicalOr exprLogicalAnd ) )* )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:462:4: ( exprLogicalAnd -> exprLogicalAnd ) ( '||' exprLogicalAnd -> ^( E_BINARY[\"E_BINARY\"] '||' $exprLogicalOr exprLogicalAnd ) )*
            {
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:462:4: ( exprLogicalAnd -> exprLogicalAnd )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:462:5: exprLogicalAnd
            {
            pushFollow(FOLLOW_exprLogicalAnd_in_exprLogicalOr2439);
            exprLogicalAnd150=exprLogicalAnd();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_exprLogicalAnd.add(exprLogicalAnd150.getTree());

            // AST REWRITE
            // elements: exprLogicalAnd
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (BaseNode)adaptor.nil();
            // 462:20: -> exprLogicalAnd
            {
                adaptor.addChild(root_0, stream_exprLogicalAnd.nextTree());

            }


            retval.tree = root_0;
            }

            }


            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:463:3: ( '||' exprLogicalAnd -> ^( E_BINARY[\"E_BINARY\"] '||' $exprLogicalOr exprLogicalAnd ) )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==189) ) {
                    int LA47_1 = input.LA(2);

                    if ( (synpred79_pollen()) ) {
                        alt47=1;
                    }


                }


                switch (alt47) {
            	case 1 :
            	    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:464:4: '||' exprLogicalAnd
            	    {
            	    string_literal151=(Atom)match(input,189,FOLLOW_189_in_exprLogicalOr2453); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_189.add(string_literal151);


            	    pushFollow(FOLLOW_exprLogicalAnd_in_exprLogicalOr2455);
            	    exprLogicalAnd152=exprLogicalAnd();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_exprLogicalAnd.add(exprLogicalAnd152.getTree());

            	    // AST REWRITE
            	    // elements: exprLogicalOr, 189, exprLogicalAnd
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    if ( state.backtracking==0 ) {

            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	    root_0 = (BaseNode)adaptor.nil();
            	    // 465:5: -> ^( E_BINARY[\"E_BINARY\"] '||' $exprLogicalOr exprLogicalAnd )
            	    {
            	        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:465:8: ^( E_BINARY[\"E_BINARY\"] '||' $exprLogicalOr exprLogicalAnd )
            	        {
            	        BaseNode root_1 = (BaseNode)adaptor.nil();
            	        root_1 = (BaseNode)adaptor.becomeRoot(
            	        new ExprNode.Binary(E_BINARY, "E_BINARY")
            	        , root_1);

            	        adaptor.addChild(root_1, 
            	        stream_189.nextNode()
            	        );

            	        adaptor.addChild(root_1, stream_retval.nextTree());

            	        adaptor.addChild(root_1, stream_exprLogicalAnd.nextTree());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }


            	    retval.tree = root_0;
            	    }

            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (BaseNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BaseNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 49, exprLogicalOr_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "exprLogicalOr"


    public static class exprLogicalAnd_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "exprLogicalAnd"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:468:1: exprLogicalAnd : ( exprBitwiseOr -> exprBitwiseOr ) ( '&&' exprBitwiseOr -> ^( E_BINARY[\"E_BINARY\"] '&&' $exprLogicalAnd exprBitwiseOr ) )* ;
    public final pollenParser.exprLogicalAnd_return exprLogicalAnd() throws RecognitionException {
        pollenParser.exprLogicalAnd_return retval = new pollenParser.exprLogicalAnd_return();
        retval.start = input.LT(1);

        int exprLogicalAnd_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom string_literal154=null;
        pollenParser.exprBitwiseOr_return exprBitwiseOr153 =null;

        pollenParser.exprBitwiseOr_return exprBitwiseOr155 =null;


        BaseNode string_literal154_tree=null;
        RewriteRuleTokenStream stream_120=new RewriteRuleTokenStream(adaptor,"token 120");
        RewriteRuleSubtreeStream stream_exprBitwiseOr=new RewriteRuleSubtreeStream(adaptor,"rule exprBitwiseOr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 50) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:469:2: ( ( exprBitwiseOr -> exprBitwiseOr ) ( '&&' exprBitwiseOr -> ^( E_BINARY[\"E_BINARY\"] '&&' $exprLogicalAnd exprBitwiseOr ) )* )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:469:4: ( exprBitwiseOr -> exprBitwiseOr ) ( '&&' exprBitwiseOr -> ^( E_BINARY[\"E_BINARY\"] '&&' $exprLogicalAnd exprBitwiseOr ) )*
            {
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:469:4: ( exprBitwiseOr -> exprBitwiseOr )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:469:5: exprBitwiseOr
            {
            pushFollow(FOLLOW_exprBitwiseOr_in_exprLogicalAnd2494);
            exprBitwiseOr153=exprBitwiseOr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_exprBitwiseOr.add(exprBitwiseOr153.getTree());

            // AST REWRITE
            // elements: exprBitwiseOr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (BaseNode)adaptor.nil();
            // 469:19: -> exprBitwiseOr
            {
                adaptor.addChild(root_0, stream_exprBitwiseOr.nextTree());

            }


            retval.tree = root_0;
            }

            }


            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:470:2: ( '&&' exprBitwiseOr -> ^( E_BINARY[\"E_BINARY\"] '&&' $exprLogicalAnd exprBitwiseOr ) )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==120) ) {
                    int LA48_1 = input.LA(2);

                    if ( (synpred80_pollen()) ) {
                        alt48=1;
                    }


                }


                switch (alt48) {
            	case 1 :
            	    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:471:3: '&&' exprBitwiseOr
            	    {
            	    string_literal154=(Atom)match(input,120,FOLLOW_120_in_exprLogicalAnd2506); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_120.add(string_literal154);


            	    pushFollow(FOLLOW_exprBitwiseOr_in_exprLogicalAnd2508);
            	    exprBitwiseOr155=exprBitwiseOr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_exprBitwiseOr.add(exprBitwiseOr155.getTree());

            	    // AST REWRITE
            	    // elements: exprBitwiseOr, exprLogicalAnd, 120
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    if ( state.backtracking==0 ) {

            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	    root_0 = (BaseNode)adaptor.nil();
            	    // 472:4: -> ^( E_BINARY[\"E_BINARY\"] '&&' $exprLogicalAnd exprBitwiseOr )
            	    {
            	        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:472:7: ^( E_BINARY[\"E_BINARY\"] '&&' $exprLogicalAnd exprBitwiseOr )
            	        {
            	        BaseNode root_1 = (BaseNode)adaptor.nil();
            	        root_1 = (BaseNode)adaptor.becomeRoot(
            	        new ExprNode.Binary(E_BINARY, "E_BINARY")
            	        , root_1);

            	        adaptor.addChild(root_1, 
            	        stream_120.nextNode()
            	        );

            	        adaptor.addChild(root_1, stream_retval.nextTree());

            	        adaptor.addChild(root_1, stream_exprBitwiseOr.nextTree());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }


            	    retval.tree = root_0;
            	    }

            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (BaseNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BaseNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 50, exprLogicalAnd_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "exprLogicalAnd"


    public static class exprBitwiseOr_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "exprBitwiseOr"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:475:1: exprBitwiseOr : ( exprBitwiseXor -> exprBitwiseXor ) ( '|' exprBitwiseXor -> ^( E_BINARY[\"E_BINARY\"] '|' $exprBitwiseOr exprBitwiseXor ) )* ;
    public final pollenParser.exprBitwiseOr_return exprBitwiseOr() throws RecognitionException {
        pollenParser.exprBitwiseOr_return retval = new pollenParser.exprBitwiseOr_return();
        retval.start = input.LT(1);

        int exprBitwiseOr_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom char_literal157=null;
        pollenParser.exprBitwiseXor_return exprBitwiseXor156 =null;

        pollenParser.exprBitwiseXor_return exprBitwiseXor158 =null;


        BaseNode char_literal157_tree=null;
        RewriteRuleTokenStream stream_188=new RewriteRuleTokenStream(adaptor,"token 188");
        RewriteRuleSubtreeStream stream_exprBitwiseXor=new RewriteRuleSubtreeStream(adaptor,"rule exprBitwiseXor");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 51) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:476:2: ( ( exprBitwiseXor -> exprBitwiseXor ) ( '|' exprBitwiseXor -> ^( E_BINARY[\"E_BINARY\"] '|' $exprBitwiseOr exprBitwiseXor ) )* )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:476:4: ( exprBitwiseXor -> exprBitwiseXor ) ( '|' exprBitwiseXor -> ^( E_BINARY[\"E_BINARY\"] '|' $exprBitwiseOr exprBitwiseXor ) )*
            {
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:476:4: ( exprBitwiseXor -> exprBitwiseXor )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:476:5: exprBitwiseXor
            {
            pushFollow(FOLLOW_exprBitwiseXor_in_exprBitwiseOr2545);
            exprBitwiseXor156=exprBitwiseXor();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_exprBitwiseXor.add(exprBitwiseXor156.getTree());

            // AST REWRITE
            // elements: exprBitwiseXor
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (BaseNode)adaptor.nil();
            // 476:20: -> exprBitwiseXor
            {
                adaptor.addChild(root_0, stream_exprBitwiseXor.nextTree());

            }


            retval.tree = root_0;
            }

            }


            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:477:2: ( '|' exprBitwiseXor -> ^( E_BINARY[\"E_BINARY\"] '|' $exprBitwiseOr exprBitwiseXor ) )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==188) ) {
                    int LA49_1 = input.LA(2);

                    if ( (synpred81_pollen()) ) {
                        alt49=1;
                    }


                }


                switch (alt49) {
            	case 1 :
            	    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:478:3: '|' exprBitwiseXor
            	    {
            	    char_literal157=(Atom)match(input,188,FOLLOW_188_in_exprBitwiseOr2557); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_188.add(char_literal157);


            	    pushFollow(FOLLOW_exprBitwiseXor_in_exprBitwiseOr2559);
            	    exprBitwiseXor158=exprBitwiseXor();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_exprBitwiseXor.add(exprBitwiseXor158.getTree());

            	    // AST REWRITE
            	    // elements: 188, exprBitwiseOr, exprBitwiseXor
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    if ( state.backtracking==0 ) {

            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	    root_0 = (BaseNode)adaptor.nil();
            	    // 479:3: -> ^( E_BINARY[\"E_BINARY\"] '|' $exprBitwiseOr exprBitwiseXor )
            	    {
            	        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:479:6: ^( E_BINARY[\"E_BINARY\"] '|' $exprBitwiseOr exprBitwiseXor )
            	        {
            	        BaseNode root_1 = (BaseNode)adaptor.nil();
            	        root_1 = (BaseNode)adaptor.becomeRoot(
            	        new ExprNode.Binary(E_BINARY, "E_BINARY")
            	        , root_1);

            	        adaptor.addChild(root_1, 
            	        stream_188.nextNode()
            	        );

            	        adaptor.addChild(root_1, stream_retval.nextTree());

            	        adaptor.addChild(root_1, stream_exprBitwiseXor.nextTree());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }


            	    retval.tree = root_0;
            	    }

            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (BaseNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BaseNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 51, exprBitwiseOr_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "exprBitwiseOr"


    public static class exprBitwiseXor_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "exprBitwiseXor"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:482:1: exprBitwiseXor : ( exprBitwiseAnd -> exprBitwiseAnd ) ( '^' exprBitwiseAnd -> ^( E_BINARY[\"E_BINARY\"] '^' $exprBitwiseXor exprBitwiseAnd ) )* ;
    public final pollenParser.exprBitwiseXor_return exprBitwiseXor() throws RecognitionException {
        pollenParser.exprBitwiseXor_return retval = new pollenParser.exprBitwiseXor_return();
        retval.start = input.LT(1);

        int exprBitwiseXor_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom char_literal160=null;
        pollenParser.exprBitwiseAnd_return exprBitwiseAnd159 =null;

        pollenParser.exprBitwiseAnd_return exprBitwiseAnd161 =null;


        BaseNode char_literal160_tree=null;
        RewriteRuleTokenStream stream_137=new RewriteRuleTokenStream(adaptor,"token 137");
        RewriteRuleSubtreeStream stream_exprBitwiseAnd=new RewriteRuleSubtreeStream(adaptor,"rule exprBitwiseAnd");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 52) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:483:2: ( ( exprBitwiseAnd -> exprBitwiseAnd ) ( '^' exprBitwiseAnd -> ^( E_BINARY[\"E_BINARY\"] '^' $exprBitwiseXor exprBitwiseAnd ) )* )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:483:4: ( exprBitwiseAnd -> exprBitwiseAnd ) ( '^' exprBitwiseAnd -> ^( E_BINARY[\"E_BINARY\"] '^' $exprBitwiseXor exprBitwiseAnd ) )*
            {
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:483:4: ( exprBitwiseAnd -> exprBitwiseAnd )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:483:5: exprBitwiseAnd
            {
            pushFollow(FOLLOW_exprBitwiseAnd_in_exprBitwiseXor2595);
            exprBitwiseAnd159=exprBitwiseAnd();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_exprBitwiseAnd.add(exprBitwiseAnd159.getTree());

            // AST REWRITE
            // elements: exprBitwiseAnd
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (BaseNode)adaptor.nil();
            // 483:20: -> exprBitwiseAnd
            {
                adaptor.addChild(root_0, stream_exprBitwiseAnd.nextTree());

            }


            retval.tree = root_0;
            }

            }


            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:484:2: ( '^' exprBitwiseAnd -> ^( E_BINARY[\"E_BINARY\"] '^' $exprBitwiseXor exprBitwiseAnd ) )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==137) ) {
                    int LA50_1 = input.LA(2);

                    if ( (synpred82_pollen()) ) {
                        alt50=1;
                    }


                }


                switch (alt50) {
            	case 1 :
            	    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:485:3: '^' exprBitwiseAnd
            	    {
            	    char_literal160=(Atom)match(input,137,FOLLOW_137_in_exprBitwiseXor2607); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_137.add(char_literal160);


            	    pushFollow(FOLLOW_exprBitwiseAnd_in_exprBitwiseXor2609);
            	    exprBitwiseAnd161=exprBitwiseAnd();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_exprBitwiseAnd.add(exprBitwiseAnd161.getTree());

            	    // AST REWRITE
            	    // elements: 137, exprBitwiseAnd, exprBitwiseXor
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    if ( state.backtracking==0 ) {

            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	    root_0 = (BaseNode)adaptor.nil();
            	    // 486:3: -> ^( E_BINARY[\"E_BINARY\"] '^' $exprBitwiseXor exprBitwiseAnd )
            	    {
            	        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:486:6: ^( E_BINARY[\"E_BINARY\"] '^' $exprBitwiseXor exprBitwiseAnd )
            	        {
            	        BaseNode root_1 = (BaseNode)adaptor.nil();
            	        root_1 = (BaseNode)adaptor.becomeRoot(
            	        new ExprNode.Binary(E_BINARY, "E_BINARY")
            	        , root_1);

            	        adaptor.addChild(root_1, 
            	        stream_137.nextNode()
            	        );

            	        adaptor.addChild(root_1, stream_retval.nextTree());

            	        adaptor.addChild(root_1, stream_exprBitwiseAnd.nextTree());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }


            	    retval.tree = root_0;
            	    }

            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (BaseNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BaseNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 52, exprBitwiseXor_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "exprBitwiseXor"


    public static class exprBitwiseAnd_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "exprBitwiseAnd"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:489:1: exprBitwiseAnd : ( exprEquality -> exprEquality ) ( '&' exprEquality -> ^( E_BINARY[\"E_BINARY\"] '&' $exprBitwiseAnd exprEquality ) )* ;
    public final pollenParser.exprBitwiseAnd_return exprBitwiseAnd() throws RecognitionException {
        pollenParser.exprBitwiseAnd_return retval = new pollenParser.exprBitwiseAnd_return();
        retval.start = input.LT(1);

        int exprBitwiseAnd_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom char_literal163=null;
        pollenParser.exprEquality_return exprEquality162 =null;

        pollenParser.exprEquality_return exprEquality164 =null;


        BaseNode char_literal163_tree=null;
        RewriteRuleTokenStream stream_121=new RewriteRuleTokenStream(adaptor,"token 121");
        RewriteRuleSubtreeStream stream_exprEquality=new RewriteRuleSubtreeStream(adaptor,"rule exprEquality");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 53) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:490:2: ( ( exprEquality -> exprEquality ) ( '&' exprEquality -> ^( E_BINARY[\"E_BINARY\"] '&' $exprBitwiseAnd exprEquality ) )* )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:490:4: ( exprEquality -> exprEquality ) ( '&' exprEquality -> ^( E_BINARY[\"E_BINARY\"] '&' $exprBitwiseAnd exprEquality ) )*
            {
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:490:4: ( exprEquality -> exprEquality )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:490:5: exprEquality
            {
            pushFollow(FOLLOW_exprEquality_in_exprBitwiseAnd2645);
            exprEquality162=exprEquality();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_exprEquality.add(exprEquality162.getTree());

            // AST REWRITE
            // elements: exprEquality
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (BaseNode)adaptor.nil();
            // 490:18: -> exprEquality
            {
                adaptor.addChild(root_0, stream_exprEquality.nextTree());

            }


            retval.tree = root_0;
            }

            }


            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:491:2: ( '&' exprEquality -> ^( E_BINARY[\"E_BINARY\"] '&' $exprBitwiseAnd exprEquality ) )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==121) ) {
                    int LA51_1 = input.LA(2);

                    if ( (synpred83_pollen()) ) {
                        alt51=1;
                    }


                }


                switch (alt51) {
            	case 1 :
            	    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:492:3: '&' exprEquality
            	    {
            	    char_literal163=(Atom)match(input,121,FOLLOW_121_in_exprBitwiseAnd2657); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_121.add(char_literal163);


            	    pushFollow(FOLLOW_exprEquality_in_exprBitwiseAnd2659);
            	    exprEquality164=exprEquality();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_exprEquality.add(exprEquality164.getTree());

            	    // AST REWRITE
            	    // elements: 121, exprBitwiseAnd, exprEquality
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    if ( state.backtracking==0 ) {

            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	    root_0 = (BaseNode)adaptor.nil();
            	    // 493:3: -> ^( E_BINARY[\"E_BINARY\"] '&' $exprBitwiseAnd exprEquality )
            	    {
            	        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:493:6: ^( E_BINARY[\"E_BINARY\"] '&' $exprBitwiseAnd exprEquality )
            	        {
            	        BaseNode root_1 = (BaseNode)adaptor.nil();
            	        root_1 = (BaseNode)adaptor.becomeRoot(
            	        new ExprNode.Binary(E_BINARY, "E_BINARY")
            	        , root_1);

            	        adaptor.addChild(root_1, 
            	        stream_121.nextNode()
            	        );

            	        adaptor.addChild(root_1, stream_retval.nextTree());

            	        adaptor.addChild(root_1, stream_exprEquality.nextTree());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }


            	    retval.tree = root_0;
            	    }

            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (BaseNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BaseNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 53, exprBitwiseAnd_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "exprBitwiseAnd"


    public static class exprEquality_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "exprEquality"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:496:1: exprEquality : ( exprRelational -> exprRelational ) ( equalityOp exprRelational -> ^( E_BINARY[\"E_BINARY\"] equalityOp $exprEquality exprRelational ) )* ;
    public final pollenParser.exprEquality_return exprEquality() throws RecognitionException {
        pollenParser.exprEquality_return retval = new pollenParser.exprEquality_return();
        retval.start = input.LT(1);

        int exprEquality_StartIndex = input.index();

        BaseNode root_0 = null;

        pollenParser.exprRelational_return exprRelational165 =null;

        pollenParser.equalityOp_return equalityOp166 =null;

        pollenParser.exprRelational_return exprRelational167 =null;


        RewriteRuleSubtreeStream stream_equalityOp=new RewriteRuleSubtreeStream(adaptor,"rule equalityOp");
        RewriteRuleSubtreeStream stream_exprRelational=new RewriteRuleSubtreeStream(adaptor,"rule exprRelational");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 54) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:497:2: ( ( exprRelational -> exprRelational ) ( equalityOp exprRelational -> ^( E_BINARY[\"E_BINARY\"] equalityOp $exprEquality exprRelational ) )* )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:497:4: ( exprRelational -> exprRelational ) ( equalityOp exprRelational -> ^( E_BINARY[\"E_BINARY\"] equalityOp $exprEquality exprRelational ) )*
            {
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:497:4: ( exprRelational -> exprRelational )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:497:5: exprRelational
            {
            pushFollow(FOLLOW_exprRelational_in_exprEquality2695);
            exprRelational165=exprRelational();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_exprRelational.add(exprRelational165.getTree());

            // AST REWRITE
            // elements: exprRelational
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (BaseNode)adaptor.nil();
            // 497:20: -> exprRelational
            {
                adaptor.addChild(root_0, stream_exprRelational.nextTree());

            }


            retval.tree = root_0;
            }

            }


            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:498:2: ( equalityOp exprRelational -> ^( E_BINARY[\"E_BINARY\"] equalityOp $exprEquality exprRelational ) )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==EQ||LA52_0==NOT_EQ) ) {
                    int LA52_1 = input.LA(2);

                    if ( (synpred84_pollen()) ) {
                        alt52=1;
                    }


                }


                switch (alt52) {
            	case 1 :
            	    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:499:3: equalityOp exprRelational
            	    {
            	    pushFollow(FOLLOW_equalityOp_in_exprEquality2708);
            	    equalityOp166=equalityOp();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_equalityOp.add(equalityOp166.getTree());

            	    pushFollow(FOLLOW_exprRelational_in_exprEquality2710);
            	    exprRelational167=exprRelational();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_exprRelational.add(exprRelational167.getTree());

            	    // AST REWRITE
            	    // elements: exprRelational, exprEquality, equalityOp
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    if ( state.backtracking==0 ) {

            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	    root_0 = (BaseNode)adaptor.nil();
            	    // 500:3: -> ^( E_BINARY[\"E_BINARY\"] equalityOp $exprEquality exprRelational )
            	    {
            	        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:500:6: ^( E_BINARY[\"E_BINARY\"] equalityOp $exprEquality exprRelational )
            	        {
            	        BaseNode root_1 = (BaseNode)adaptor.nil();
            	        root_1 = (BaseNode)adaptor.becomeRoot(
            	        new ExprNode.Binary(E_BINARY, "E_BINARY")
            	        , root_1);

            	        adaptor.addChild(root_1, stream_equalityOp.nextTree());

            	        adaptor.addChild(root_1, stream_retval.nextTree());

            	        adaptor.addChild(root_1, stream_exprRelational.nextTree());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }


            	    retval.tree = root_0;
            	    }

            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (BaseNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BaseNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 54, exprEquality_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "exprEquality"


    public static class exprRelational_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "exprRelational"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:503:1: exprRelational : ( exprShift -> exprShift ) ( relationalOp exprShift -> ^( E_BINARY[\"E_BINARY\"] relationalOp $exprRelational exprShift ) )* ;
    public final pollenParser.exprRelational_return exprRelational() throws RecognitionException {
        pollenParser.exprRelational_return retval = new pollenParser.exprRelational_return();
        retval.start = input.LT(1);

        int exprRelational_StartIndex = input.index();

        BaseNode root_0 = null;

        pollenParser.exprShift_return exprShift168 =null;

        pollenParser.relationalOp_return relationalOp169 =null;

        pollenParser.exprShift_return exprShift170 =null;


        RewriteRuleSubtreeStream stream_relationalOp=new RewriteRuleSubtreeStream(adaptor,"rule relationalOp");
        RewriteRuleSubtreeStream stream_exprShift=new RewriteRuleSubtreeStream(adaptor,"rule exprShift");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 55) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:504:2: ( ( exprShift -> exprShift ) ( relationalOp exprShift -> ^( E_BINARY[\"E_BINARY\"] relationalOp $exprRelational exprShift ) )* )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:504:4: ( exprShift -> exprShift ) ( relationalOp exprShift -> ^( E_BINARY[\"E_BINARY\"] relationalOp $exprRelational exprShift ) )*
            {
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:504:4: ( exprShift -> exprShift )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:504:5: exprShift
            {
            pushFollow(FOLLOW_exprShift_in_exprRelational2746);
            exprShift168=exprShift();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_exprShift.add(exprShift168.getTree());

            // AST REWRITE
            // elements: exprShift
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (BaseNode)adaptor.nil();
            // 504:15: -> exprShift
            {
                adaptor.addChild(root_0, stream_exprShift.nextTree());

            }


            retval.tree = root_0;
            }

            }


            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:505:2: ( relationalOp exprShift -> ^( E_BINARY[\"E_BINARY\"] relationalOp $exprRelational exprShift ) )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==GT_EQ||LA53_0==LT_EQ||LA53_0==129||LA53_0==131) ) {
                    int LA53_1 = input.LA(2);

                    if ( (synpred85_pollen()) ) {
                        alt53=1;
                    }


                }


                switch (alt53) {
            	case 1 :
            	    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:506:3: relationalOp exprShift
            	    {
            	    pushFollow(FOLLOW_relationalOp_in_exprRelational2759);
            	    relationalOp169=relationalOp();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_relationalOp.add(relationalOp169.getTree());

            	    pushFollow(FOLLOW_exprShift_in_exprRelational2761);
            	    exprShift170=exprShift();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_exprShift.add(exprShift170.getTree());

            	    // AST REWRITE
            	    // elements: exprShift, exprRelational, relationalOp
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    if ( state.backtracking==0 ) {

            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	    root_0 = (BaseNode)adaptor.nil();
            	    // 507:3: -> ^( E_BINARY[\"E_BINARY\"] relationalOp $exprRelational exprShift )
            	    {
            	        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:507:6: ^( E_BINARY[\"E_BINARY\"] relationalOp $exprRelational exprShift )
            	        {
            	        BaseNode root_1 = (BaseNode)adaptor.nil();
            	        root_1 = (BaseNode)adaptor.becomeRoot(
            	        new ExprNode.Binary(E_BINARY, "E_BINARY")
            	        , root_1);

            	        adaptor.addChild(root_1, stream_relationalOp.nextTree());

            	        adaptor.addChild(root_1, stream_retval.nextTree());

            	        adaptor.addChild(root_1, stream_exprShift.nextTree());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }


            	    retval.tree = root_0;
            	    }

            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (BaseNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BaseNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 55, exprRelational_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "exprRelational"


    public static class exprShift_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "exprShift"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:510:1: exprShift : ( exprAddSub -> exprAddSub ) ( shiftOp exprAddSub -> ^( E_BINARY[\"E_BINARY\"] shiftOp $exprShift exprAddSub ) )* ;
    public final pollenParser.exprShift_return exprShift() throws RecognitionException {
        pollenParser.exprShift_return retval = new pollenParser.exprShift_return();
        retval.start = input.LT(1);

        int exprShift_StartIndex = input.index();

        BaseNode root_0 = null;

        pollenParser.exprAddSub_return exprAddSub171 =null;

        pollenParser.shiftOp_return shiftOp172 =null;

        pollenParser.exprAddSub_return exprAddSub173 =null;


        RewriteRuleSubtreeStream stream_shiftOp=new RewriteRuleSubtreeStream(adaptor,"rule shiftOp");
        RewriteRuleSubtreeStream stream_exprAddSub=new RewriteRuleSubtreeStream(adaptor,"rule exprAddSub");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 56) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:511:2: ( ( exprAddSub -> exprAddSub ) ( shiftOp exprAddSub -> ^( E_BINARY[\"E_BINARY\"] shiftOp $exprShift exprAddSub ) )* )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:511:4: ( exprAddSub -> exprAddSub ) ( shiftOp exprAddSub -> ^( E_BINARY[\"E_BINARY\"] shiftOp $exprShift exprAddSub ) )*
            {
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:511:4: ( exprAddSub -> exprAddSub )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:511:5: exprAddSub
            {
            pushFollow(FOLLOW_exprAddSub_in_exprShift2798);
            exprAddSub171=exprAddSub();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_exprAddSub.add(exprAddSub171.getTree());

            // AST REWRITE
            // elements: exprAddSub
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (BaseNode)adaptor.nil();
            // 511:16: -> exprAddSub
            {
                adaptor.addChild(root_0, stream_exprAddSub.nextTree());

            }


            retval.tree = root_0;
            }

            }


            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:512:2: ( shiftOp exprAddSub -> ^( E_BINARY[\"E_BINARY\"] shiftOp $exprShift exprAddSub ) )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==130||LA54_0==132) ) {
                    int LA54_1 = input.LA(2);

                    if ( (synpred86_pollen()) ) {
                        alt54=1;
                    }


                }


                switch (alt54) {
            	case 1 :
            	    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:513:3: shiftOp exprAddSub
            	    {
            	    pushFollow(FOLLOW_shiftOp_in_exprShift2811);
            	    shiftOp172=shiftOp();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_shiftOp.add(shiftOp172.getTree());

            	    pushFollow(FOLLOW_exprAddSub_in_exprShift2814);
            	    exprAddSub173=exprAddSub();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_exprAddSub.add(exprAddSub173.getTree());

            	    // AST REWRITE
            	    // elements: shiftOp, exprAddSub, exprShift
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    if ( state.backtracking==0 ) {

            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	    root_0 = (BaseNode)adaptor.nil();
            	    // 514:3: -> ^( E_BINARY[\"E_BINARY\"] shiftOp $exprShift exprAddSub )
            	    {
            	        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:514:6: ^( E_BINARY[\"E_BINARY\"] shiftOp $exprShift exprAddSub )
            	        {
            	        BaseNode root_1 = (BaseNode)adaptor.nil();
            	        root_1 = (BaseNode)adaptor.becomeRoot(
            	        new ExprNode.Binary(E_BINARY, "E_BINARY")
            	        , root_1);

            	        adaptor.addChild(root_1, stream_shiftOp.nextTree());

            	        adaptor.addChild(root_1, stream_retval.nextTree());

            	        adaptor.addChild(root_1, stream_exprAddSub.nextTree());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }


            	    retval.tree = root_0;
            	    }

            	    }
            	    break;

            	default :
            	    break loop54;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (BaseNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BaseNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 56, exprShift_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "exprShift"


    public static class exprAddSub_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "exprAddSub"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:517:1: exprAddSub : ( exprMultDiv -> exprMultDiv ) ( addSubOp exprMultDiv -> ^( E_BINARY[\"E_BINARY\"] addSubOp $exprAddSub exprMultDiv ) )* ;
    public final pollenParser.exprAddSub_return exprAddSub() throws RecognitionException {
        pollenParser.exprAddSub_return retval = new pollenParser.exprAddSub_return();
        retval.start = input.LT(1);

        int exprAddSub_StartIndex = input.index();

        BaseNode root_0 = null;

        pollenParser.exprMultDiv_return exprMultDiv174 =null;

        pollenParser.addSubOp_return addSubOp175 =null;

        pollenParser.exprMultDiv_return exprMultDiv176 =null;


        RewriteRuleSubtreeStream stream_addSubOp=new RewriteRuleSubtreeStream(adaptor,"rule addSubOp");
        RewriteRuleSubtreeStream stream_exprMultDiv=new RewriteRuleSubtreeStream(adaptor,"rule exprMultDiv");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 57) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:518:2: ( ( exprMultDiv -> exprMultDiv ) ( addSubOp exprMultDiv -> ^( E_BINARY[\"E_BINARY\"] addSubOp $exprAddSub exprMultDiv ) )* )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:518:4: ( exprMultDiv -> exprMultDiv ) ( addSubOp exprMultDiv -> ^( E_BINARY[\"E_BINARY\"] addSubOp $exprAddSub exprMultDiv ) )*
            {
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:518:4: ( exprMultDiv -> exprMultDiv )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:518:5: exprMultDiv
            {
            pushFollow(FOLLOW_exprMultDiv_in_exprAddSub2851);
            exprMultDiv174=exprMultDiv();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_exprMultDiv.add(exprMultDiv174.getTree());

            // AST REWRITE
            // elements: exprMultDiv
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (BaseNode)adaptor.nil();
            // 518:17: -> exprMultDiv
            {
                adaptor.addChild(root_0, stream_exprMultDiv.nextTree());

            }


            retval.tree = root_0;
            }

            }


            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:519:2: ( addSubOp exprMultDiv -> ^( E_BINARY[\"E_BINARY\"] addSubOp $exprAddSub exprMultDiv ) )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==MINUS||LA55_0==PLUS) ) {
                    int LA55_1 = input.LA(2);

                    if ( (synpred87_pollen()) ) {
                        alt55=1;
                    }


                }


                switch (alt55) {
            	case 1 :
            	    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:520:3: addSubOp exprMultDiv
            	    {
            	    pushFollow(FOLLOW_addSubOp_in_exprAddSub2863);
            	    addSubOp175=addSubOp();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_addSubOp.add(addSubOp175.getTree());

            	    pushFollow(FOLLOW_exprMultDiv_in_exprAddSub2865);
            	    exprMultDiv176=exprMultDiv();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_exprMultDiv.add(exprMultDiv176.getTree());

            	    // AST REWRITE
            	    // elements: exprAddSub, addSubOp, exprMultDiv
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    if ( state.backtracking==0 ) {

            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	    root_0 = (BaseNode)adaptor.nil();
            	    // 521:3: -> ^( E_BINARY[\"E_BINARY\"] addSubOp $exprAddSub exprMultDiv )
            	    {
            	        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:521:6: ^( E_BINARY[\"E_BINARY\"] addSubOp $exprAddSub exprMultDiv )
            	        {
            	        BaseNode root_1 = (BaseNode)adaptor.nil();
            	        root_1 = (BaseNode)adaptor.becomeRoot(
            	        new ExprNode.Binary(E_BINARY, "E_BINARY")
            	        , root_1);

            	        adaptor.addChild(root_1, stream_addSubOp.nextTree());

            	        adaptor.addChild(root_1, stream_retval.nextTree());

            	        adaptor.addChild(root_1, stream_exprMultDiv.nextTree());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }


            	    retval.tree = root_0;
            	    }

            	    }
            	    break;

            	default :
            	    break loop55;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (BaseNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BaseNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 57, exprAddSub_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "exprAddSub"


    public static class exprMultDiv_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "exprMultDiv"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:524:1: exprMultDiv : ( exprUnary -> exprUnary ) ( multDivModOp exprUnary -> ^( E_BINARY[\"E_BINARY\"] multDivModOp $exprMultDiv exprUnary ) )* ;
    public final pollenParser.exprMultDiv_return exprMultDiv() throws RecognitionException {
        pollenParser.exprMultDiv_return retval = new pollenParser.exprMultDiv_return();
        retval.start = input.LT(1);

        int exprMultDiv_StartIndex = input.index();

        BaseNode root_0 = null;

        pollenParser.exprUnary_return exprUnary177 =null;

        pollenParser.multDivModOp_return multDivModOp178 =null;

        pollenParser.exprUnary_return exprUnary179 =null;


        RewriteRuleSubtreeStream stream_multDivModOp=new RewriteRuleSubtreeStream(adaptor,"rule multDivModOp");
        RewriteRuleSubtreeStream stream_exprUnary=new RewriteRuleSubtreeStream(adaptor,"rule exprUnary");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 58) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:525:2: ( ( exprUnary -> exprUnary ) ( multDivModOp exprUnary -> ^( E_BINARY[\"E_BINARY\"] multDivModOp $exprMultDiv exprUnary ) )* )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:525:4: ( exprUnary -> exprUnary ) ( multDivModOp exprUnary -> ^( E_BINARY[\"E_BINARY\"] multDivModOp $exprMultDiv exprUnary ) )*
            {
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:525:4: ( exprUnary -> exprUnary )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:525:5: exprUnary
            {
            pushFollow(FOLLOW_exprUnary_in_exprMultDiv2908);
            exprUnary177=exprUnary();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_exprUnary.add(exprUnary177.getTree());

            // AST REWRITE
            // elements: exprUnary
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (BaseNode)adaptor.nil();
            // 525:15: -> exprUnary
            {
                adaptor.addChild(root_0, stream_exprUnary.nextTree());

            }


            retval.tree = root_0;
            }

            }


            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:526:2: ( multDivModOp exprUnary -> ^( E_BINARY[\"E_BINARY\"] multDivModOp $exprMultDiv exprUnary ) )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==119||LA56_0==124||LA56_0==127) ) {
                    int LA56_1 = input.LA(2);

                    if ( (synpred88_pollen()) ) {
                        alt56=1;
                    }


                }


                switch (alt56) {
            	case 1 :
            	    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:527:3: multDivModOp exprUnary
            	    {
            	    pushFollow(FOLLOW_multDivModOp_in_exprMultDiv2920);
            	    multDivModOp178=multDivModOp();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_multDivModOp.add(multDivModOp178.getTree());

            	    pushFollow(FOLLOW_exprUnary_in_exprMultDiv2922);
            	    exprUnary179=exprUnary();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_exprUnary.add(exprUnary179.getTree());

            	    // AST REWRITE
            	    // elements: exprUnary, exprMultDiv, multDivModOp
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    if ( state.backtracking==0 ) {

            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	    root_0 = (BaseNode)adaptor.nil();
            	    // 528:3: -> ^( E_BINARY[\"E_BINARY\"] multDivModOp $exprMultDiv exprUnary )
            	    {
            	        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:528:6: ^( E_BINARY[\"E_BINARY\"] multDivModOp $exprMultDiv exprUnary )
            	        {
            	        BaseNode root_1 = (BaseNode)adaptor.nil();
            	        root_1 = (BaseNode)adaptor.becomeRoot(
            	        new ExprNode.Binary(E_BINARY, "E_BINARY")
            	        , root_1);

            	        adaptor.addChild(root_1, stream_multDivModOp.nextTree());

            	        adaptor.addChild(root_1, stream_retval.nextTree());

            	        adaptor.addChild(root_1, stream_exprUnary.nextTree());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }


            	    retval.tree = root_0;
            	    }

            	    }
            	    break;

            	default :
            	    break loop56;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (BaseNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BaseNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 58, exprMultDiv_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "exprMultDiv"


    public static class exprNew_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "exprNew"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:531:1: exprNew : 'new' typeName fcnArgumentList -> ^( E_NEW[\"E_NEW\"] typeName fcnArgumentList ) ;
    public final pollenParser.exprNew_return exprNew() throws RecognitionException {
        pollenParser.exprNew_return retval = new pollenParser.exprNew_return();
        retval.start = input.LT(1);

        int exprNew_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom string_literal180=null;
        pollenParser.typeName_return typeName181 =null;

        pollenParser.fcnArgumentList_return fcnArgumentList182 =null;


        BaseNode string_literal180_tree=null;
        RewriteRuleTokenStream stream_169=new RewriteRuleTokenStream(adaptor,"token 169");
        RewriteRuleSubtreeStream stream_typeName=new RewriteRuleSubtreeStream(adaptor,"rule typeName");
        RewriteRuleSubtreeStream stream_fcnArgumentList=new RewriteRuleSubtreeStream(adaptor,"rule fcnArgumentList");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 59) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:532:2: ( 'new' typeName fcnArgumentList -> ^( E_NEW[\"E_NEW\"] typeName fcnArgumentList ) )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:532:4: 'new' typeName fcnArgumentList
            {
            string_literal180=(Atom)match(input,169,FOLLOW_169_in_exprNew2957); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_169.add(string_literal180);


            pushFollow(FOLLOW_typeName_in_exprNew2959);
            typeName181=typeName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeName.add(typeName181.getTree());

            pushFollow(FOLLOW_fcnArgumentList_in_exprNew2961);
            fcnArgumentList182=fcnArgumentList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_fcnArgumentList.add(fcnArgumentList182.getTree());

            // AST REWRITE
            // elements: fcnArgumentList, typeName
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (BaseNode)adaptor.nil();
            // 532:35: -> ^( E_NEW[\"E_NEW\"] typeName fcnArgumentList )
            {
                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:532:38: ^( E_NEW[\"E_NEW\"] typeName fcnArgumentList )
                {
                BaseNode root_1 = (BaseNode)adaptor.nil();
                root_1 = (BaseNode)adaptor.becomeRoot(
                new ExprNode.New(E_NEW, "E_NEW")
                , root_1);

                adaptor.addChild(root_1, stream_typeName.nextTree());

                adaptor.addChild(root_1, stream_fcnArgumentList.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (BaseNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BaseNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 59, exprNew_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "exprNew"


    public static class exprUnary_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "exprUnary"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:534:1: exprUnary : ( primitiveLit | injectionCode | arrayLit -> ^( E_VEC[\"E_VEC\"] arrayLit ) | logicalNotOp expr -> ^( E_UNARY[\"E_UNARY\"] logicalNotOp expr ) | bitwiseNotOp expr -> ^( E_UNARY[\"E_UNARY\"] bitwiseNotOp expr ) | '(' expr ')' -> ^( E_PAREN expr ) | MINUS expr -> ^( E_UNARY[\"E_UNARY\"] MINUS expr ) | varOrFcnOrArray incDecOp -> ^( E_UNARY[\"E_UNARY\", true] varOrFcnOrArray incDecOp ) | varOrFcnOrArray | incDecOp varOrFcnOrArray -> ^( E_UNARY[\"E_UNARY\"] varOrFcnOrArray incDecOp ) | exprNew );
    public final pollenParser.exprUnary_return exprUnary() throws RecognitionException {
        pollenParser.exprUnary_return retval = new pollenParser.exprUnary_return();
        retval.start = input.LT(1);

        int exprUnary_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom char_literal190=null;
        Atom char_literal192=null;
        Atom MINUS193=null;
        pollenParser.primitiveLit_return primitiveLit183 =null;

        pollenParser.injectionCode_return injectionCode184 =null;

        pollenParser.arrayLit_return arrayLit185 =null;

        pollenParser.logicalNotOp_return logicalNotOp186 =null;

        pollenParser.expr_return expr187 =null;

        pollenParser.bitwiseNotOp_return bitwiseNotOp188 =null;

        pollenParser.expr_return expr189 =null;

        pollenParser.expr_return expr191 =null;

        pollenParser.expr_return expr194 =null;

        pollenParser.varOrFcnOrArray_return varOrFcnOrArray195 =null;

        pollenParser.incDecOp_return incDecOp196 =null;

        pollenParser.varOrFcnOrArray_return varOrFcnOrArray197 =null;

        pollenParser.incDecOp_return incDecOp198 =null;

        pollenParser.varOrFcnOrArray_return varOrFcnOrArray199 =null;

        pollenParser.exprNew_return exprNew200 =null;


        BaseNode char_literal190_tree=null;
        BaseNode char_literal192_tree=null;
        BaseNode MINUS193_tree=null;
        RewriteRuleTokenStream stream_122=new RewriteRuleTokenStream(adaptor,"token 122");
        RewriteRuleTokenStream stream_123=new RewriteRuleTokenStream(adaptor,"token 123");
        RewriteRuleTokenStream stream_MINUS=new RewriteRuleTokenStream(adaptor,"token MINUS");
        RewriteRuleSubtreeStream stream_arrayLit=new RewriteRuleSubtreeStream(adaptor,"rule arrayLit");
        RewriteRuleSubtreeStream stream_incDecOp=new RewriteRuleSubtreeStream(adaptor,"rule incDecOp");
        RewriteRuleSubtreeStream stream_logicalNotOp=new RewriteRuleSubtreeStream(adaptor,"rule logicalNotOp");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_varOrFcnOrArray=new RewriteRuleSubtreeStream(adaptor,"rule varOrFcnOrArray");
        RewriteRuleSubtreeStream stream_bitwiseNotOp=new RewriteRuleSubtreeStream(adaptor,"rule bitwiseNotOp");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 60) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:535:2: ( primitiveLit | injectionCode | arrayLit -> ^( E_VEC[\"E_VEC\"] arrayLit ) | logicalNotOp expr -> ^( E_UNARY[\"E_UNARY\"] logicalNotOp expr ) | bitwiseNotOp expr -> ^( E_UNARY[\"E_UNARY\"] bitwiseNotOp expr ) | '(' expr ')' -> ^( E_PAREN expr ) | MINUS expr -> ^( E_UNARY[\"E_UNARY\"] MINUS expr ) | varOrFcnOrArray incDecOp -> ^( E_UNARY[\"E_UNARY\", true] varOrFcnOrArray incDecOp ) | varOrFcnOrArray | incDecOp varOrFcnOrArray -> ^( E_UNARY[\"E_UNARY\"] varOrFcnOrArray incDecOp ) | exprNew )
            int alt57=11;
            switch ( input.LA(1) ) {
            case CHAR:
            case HEX_LIT:
            case INT_LIT:
            case OCT_LIT:
            case REAL_LIT:
            case STRING:
            case 156:
            case 170:
            case 180:
                {
                alt57=1;
                }
                break;
            case INJECT:
                {
                alt57=2;
                }
                break;
            case 135:
                {
                alt57=3;
                }
                break;
            case LOG_NOT:
                {
                alt57=4;
                }
                break;
            case BIT_NOT:
                {
                alt57=5;
                }
                break;
            case 122:
                {
                alt57=6;
                }
                break;
            case MINUS:
                {
                alt57=7;
                }
                break;
            case 169:
                {
                int LA57_8 = input.LA(2);

                if ( (synpred96_pollen()) ) {
                    alt57=8;
                }
                else if ( (synpred97_pollen()) ) {
                    alt57=9;
                }
                else if ( (true) ) {
                    alt57=11;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 57, 8, input);

                    throw nvae;

                }
                }
                break;
            case DEC:
            case INC:
                {
                alt57=10;
                }
                break;
            case IDENT:
            case 134:
                {
                int LA57_13 = input.LA(2);

                if ( (synpred96_pollen()) ) {
                    alt57=8;
                }
                else if ( (synpred97_pollen()) ) {
                    alt57=9;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 57, 13, input);

                    throw nvae;

                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;

            }

            switch (alt57) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:535:4: primitiveLit
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    pushFollow(FOLLOW_primitiveLit_in_exprUnary2987);
                    primitiveLit183=primitiveLit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveLit183.getTree());

                    }
                    break;
                case 2 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:536:4: injectionCode
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    pushFollow(FOLLOW_injectionCode_in_exprUnary2992);
                    injectionCode184=injectionCode();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, injectionCode184.getTree());

                    }
                    break;
                case 3 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:537:4: arrayLit
                    {
                    pushFollow(FOLLOW_arrayLit_in_exprUnary2997);
                    arrayLit185=arrayLit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_arrayLit.add(arrayLit185.getTree());

                    // AST REWRITE
                    // elements: arrayLit
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (BaseNode)adaptor.nil();
                    // 537:18: -> ^( E_VEC[\"E_VEC\"] arrayLit )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:537:21: ^( E_VEC[\"E_VEC\"] arrayLit )
                        {
                        BaseNode root_1 = (BaseNode)adaptor.nil();
                        root_1 = (BaseNode)adaptor.becomeRoot(
                        new ExprNode.Vec(E_VEC, "E_VEC")
                        , root_1);

                        adaptor.addChild(root_1, stream_arrayLit.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 4 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:538:4: logicalNotOp expr
                    {
                    pushFollow(FOLLOW_logicalNotOp_in_exprUnary3021);
                    logicalNotOp186=logicalNotOp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_logicalNotOp.add(logicalNotOp186.getTree());

                    pushFollow(FOLLOW_expr_in_exprUnary3023);
                    expr187=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr187.getTree());

                    // AST REWRITE
                    // elements: expr, logicalNotOp
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (BaseNode)adaptor.nil();
                    // 538:25: -> ^( E_UNARY[\"E_UNARY\"] logicalNotOp expr )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:538:28: ^( E_UNARY[\"E_UNARY\"] logicalNotOp expr )
                        {
                        BaseNode root_1 = (BaseNode)adaptor.nil();
                        root_1 = (BaseNode)adaptor.becomeRoot(
                        new ExprNode.Unary(E_UNARY, "E_UNARY")
                        , root_1);

                        adaptor.addChild(root_1, stream_logicalNotOp.nextTree());

                        adaptor.addChild(root_1, stream_expr.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 5 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:539:4: bitwiseNotOp expr
                    {
                    pushFollow(FOLLOW_bitwiseNotOp_in_exprUnary3047);
                    bitwiseNotOp188=bitwiseNotOp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_bitwiseNotOp.add(bitwiseNotOp188.getTree());

                    pushFollow(FOLLOW_expr_in_exprUnary3049);
                    expr189=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr189.getTree());

                    // AST REWRITE
                    // elements: bitwiseNotOp, expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (BaseNode)adaptor.nil();
                    // 539:25: -> ^( E_UNARY[\"E_UNARY\"] bitwiseNotOp expr )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:539:28: ^( E_UNARY[\"E_UNARY\"] bitwiseNotOp expr )
                        {
                        BaseNode root_1 = (BaseNode)adaptor.nil();
                        root_1 = (BaseNode)adaptor.becomeRoot(
                        new ExprNode.Unary(E_UNARY, "E_UNARY")
                        , root_1);

                        adaptor.addChild(root_1, stream_bitwiseNotOp.nextTree());

                        adaptor.addChild(root_1, stream_expr.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 6 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:540:4: '(' expr ')'
                    {
                    char_literal190=(Atom)match(input,122,FOLLOW_122_in_exprUnary3073); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_122.add(char_literal190);


                    pushFollow(FOLLOW_expr_in_exprUnary3075);
                    expr191=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr191.getTree());

                    char_literal192=(Atom)match(input,123,FOLLOW_123_in_exprUnary3077); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_123.add(char_literal192);


                    // AST REWRITE
                    // elements: expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (BaseNode)adaptor.nil();
                    // 540:20: -> ^( E_PAREN expr )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:540:23: ^( E_PAREN expr )
                        {
                        BaseNode root_1 = (BaseNode)adaptor.nil();
                        root_1 = (BaseNode)adaptor.becomeRoot(
                        (BaseNode)adaptor.create(E_PAREN, "E_PAREN")
                        , root_1);

                        adaptor.addChild(root_1, stream_expr.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 7 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:541:4: MINUS expr
                    {
                    MINUS193=(Atom)match(input,MINUS,FOLLOW_MINUS_in_exprUnary3093); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MINUS.add(MINUS193);


                    pushFollow(FOLLOW_expr_in_exprUnary3095);
                    expr194=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr194.getTree());

                    // AST REWRITE
                    // elements: MINUS, expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (BaseNode)adaptor.nil();
                    // 541:19: -> ^( E_UNARY[\"E_UNARY\"] MINUS expr )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:541:22: ^( E_UNARY[\"E_UNARY\"] MINUS expr )
                        {
                        BaseNode root_1 = (BaseNode)adaptor.nil();
                        root_1 = (BaseNode)adaptor.becomeRoot(
                        new ExprNode.Unary(E_UNARY, "E_UNARY")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_MINUS.nextNode()
                        );

                        adaptor.addChild(root_1, stream_expr.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 8 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:542:4: varOrFcnOrArray incDecOp
                    {
                    pushFollow(FOLLOW_varOrFcnOrArray_in_exprUnary3120);
                    varOrFcnOrArray195=varOrFcnOrArray();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_varOrFcnOrArray.add(varOrFcnOrArray195.getTree());

                    pushFollow(FOLLOW_incDecOp_in_exprUnary3122);
                    incDecOp196=incDecOp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_incDecOp.add(incDecOp196.getTree());

                    // AST REWRITE
                    // elements: varOrFcnOrArray, incDecOp
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (BaseNode)adaptor.nil();
                    // 542:29: -> ^( E_UNARY[\"E_UNARY\", true] varOrFcnOrArray incDecOp )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:542:32: ^( E_UNARY[\"E_UNARY\", true] varOrFcnOrArray incDecOp )
                        {
                        BaseNode root_1 = (BaseNode)adaptor.nil();
                        root_1 = (BaseNode)adaptor.becomeRoot(
                        new ExprNode.Unary(E_UNARY, "E_UNARY", true)
                        , root_1);

                        adaptor.addChild(root_1, stream_varOrFcnOrArray.nextTree());

                        adaptor.addChild(root_1, stream_incDecOp.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 9 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:543:4: varOrFcnOrArray
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    pushFollow(FOLLOW_varOrFcnOrArray_in_exprUnary3143);
                    varOrFcnOrArray197=varOrFcnOrArray();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varOrFcnOrArray197.getTree());

                    }
                    break;
                case 10 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:544:4: incDecOp varOrFcnOrArray
                    {
                    pushFollow(FOLLOW_incDecOp_in_exprUnary3148);
                    incDecOp198=incDecOp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_incDecOp.add(incDecOp198.getTree());

                    pushFollow(FOLLOW_varOrFcnOrArray_in_exprUnary3150);
                    varOrFcnOrArray199=varOrFcnOrArray();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_varOrFcnOrArray.add(varOrFcnOrArray199.getTree());

                    // AST REWRITE
                    // elements: incDecOp, varOrFcnOrArray
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (BaseNode)adaptor.nil();
                    // 544:29: -> ^( E_UNARY[\"E_UNARY\"] varOrFcnOrArray incDecOp )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:544:32: ^( E_UNARY[\"E_UNARY\"] varOrFcnOrArray incDecOp )
                        {
                        BaseNode root_1 = (BaseNode)adaptor.nil();
                        root_1 = (BaseNode)adaptor.becomeRoot(
                        new ExprNode.Unary(E_UNARY, "E_UNARY")
                        , root_1);

                        adaptor.addChild(root_1, stream_varOrFcnOrArray.nextTree());

                        adaptor.addChild(root_1, stream_incDecOp.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 11 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:545:4: exprNew
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    pushFollow(FOLLOW_exprNew_in_exprUnary3171);
                    exprNew200=exprNew();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, exprNew200.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (BaseNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BaseNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 60, exprUnary_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "exprUnary"


    public static class fcnDefinition_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "fcnDefinition"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:547:1: fcnDefinition : ( 'public' )? ( 'host' )? fcnType_fcnName fcnFormalParameterList fcnBody[$fcnFormalParameterList.tree] -> ^( D_FCN_DEF[\"D_FCN_DEF\", atFlags] fcnType_fcnName fcnFormalParameterList fcnBody ) ;
    public final pollenParser.fcnDefinition_return fcnDefinition() throws RecognitionException {
        pollenParser.fcnDefinition_return retval = new pollenParser.fcnDefinition_return();
        retval.start = input.LT(1);

        int fcnDefinition_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom string_literal201=null;
        Atom string_literal202=null;
        pollenParser.fcnType_fcnName_return fcnType_fcnName203 =null;

        pollenParser.fcnFormalParameterList_return fcnFormalParameterList204 =null;

        pollenParser.fcnBody_return fcnBody205 =null;


        BaseNode string_literal201_tree=null;
        BaseNode string_literal202_tree=null;
        RewriteRuleTokenStream stream_159=new RewriteRuleTokenStream(adaptor,"token 159");
        RewriteRuleTokenStream stream_176=new RewriteRuleTokenStream(adaptor,"token 176");
        RewriteRuleSubtreeStream stream_fcnFormalParameterList=new RewriteRuleSubtreeStream(adaptor,"rule fcnFormalParameterList");
        RewriteRuleSubtreeStream stream_fcnType_fcnName=new RewriteRuleSubtreeStream(adaptor,"rule fcnType_fcnName");
        RewriteRuleSubtreeStream stream_fcnBody=new RewriteRuleSubtreeStream(adaptor,"rule fcnBody");

        	atFlags.clear();			

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 61) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:554:2: ( ( 'public' )? ( 'host' )? fcnType_fcnName fcnFormalParameterList fcnBody[$fcnFormalParameterList.tree] -> ^( D_FCN_DEF[\"D_FCN_DEF\", atFlags] fcnType_fcnName fcnFormalParameterList fcnBody ) )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:554:4: ( 'public' )? ( 'host' )? fcnType_fcnName fcnFormalParameterList fcnBody[$fcnFormalParameterList.tree]
            {
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:554:4: ( 'public' )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==176) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:554:5: 'public'
                    {
                    string_literal201=(Atom)match(input,176,FOLLOW_176_in_fcnDefinition3191); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_176.add(string_literal201);


                    if ( state.backtracking==0 ) { atFlags.add(Flags.PUBLIC); }

                    }
                    break;

            }


            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:555:3: ( 'host' )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==159) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:555:4: 'host'
                    {
                    string_literal202=(Atom)match(input,159,FOLLOW_159_in_fcnDefinition3202); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_159.add(string_literal202);


                    if ( state.backtracking==0 ) { atFlags.add(Flags.HOST); }

                    }
                    break;

            }


            pushFollow(FOLLOW_fcnType_fcnName_in_fcnDefinition3212);
            fcnType_fcnName203=fcnType_fcnName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_fcnType_fcnName.add(fcnType_fcnName203.getTree());

            pushFollow(FOLLOW_fcnFormalParameterList_in_fcnDefinition3214);
            fcnFormalParameterList204=fcnFormalParameterList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_fcnFormalParameterList.add(fcnFormalParameterList204.getTree());

            pushFollow(FOLLOW_fcnBody_in_fcnDefinition3216);
            fcnBody205=fcnBody((fcnFormalParameterList204!=null?((BaseNode)fcnFormalParameterList204.tree):null));

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_fcnBody.add(fcnBody205.getTree());

            // AST REWRITE
            // elements: fcnBody, fcnType_fcnName, fcnFormalParameterList
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (BaseNode)adaptor.nil();
            // 557:3: -> ^( D_FCN_DEF[\"D_FCN_DEF\", atFlags] fcnType_fcnName fcnFormalParameterList fcnBody )
            {
                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:557:6: ^( D_FCN_DEF[\"D_FCN_DEF\", atFlags] fcnType_fcnName fcnFormalParameterList fcnBody )
                {
                BaseNode root_1 = (BaseNode)adaptor.nil();
                root_1 = (BaseNode)adaptor.becomeRoot(
                new DeclNode.Fcn(D_FCN_DEF, "D_FCN_DEF", atFlags)
                , root_1);

                adaptor.addChild(root_1, stream_fcnType_fcnName.nextTree());

                adaptor.addChild(root_1, stream_fcnFormalParameterList.nextTree());

                adaptor.addChild(root_1, stream_fcnBody.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (BaseNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) {
              atFlags.clear();
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BaseNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 61, fcnDefinition_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "fcnDefinition"


    public static class fcnDefinitionHost_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "fcnDefinitionHost"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:559:1: fcnDefinitionHost : ( 'public' )? ( 'host' )? fcnType_fcnName fcnFormalParameterList fcnBody[$fcnFormalParameterList.tree] -> ^( D_FCN_DEF[\"D_FCN_DEF\", atFlags] fcnType_fcnName fcnFormalParameterList fcnBody ) ;
    public final pollenParser.fcnDefinitionHost_return fcnDefinitionHost() throws RecognitionException {
        pollenParser.fcnDefinitionHost_return retval = new pollenParser.fcnDefinitionHost_return();
        retval.start = input.LT(1);

        int fcnDefinitionHost_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom string_literal206=null;
        Atom string_literal207=null;
        pollenParser.fcnType_fcnName_return fcnType_fcnName208 =null;

        pollenParser.fcnFormalParameterList_return fcnFormalParameterList209 =null;

        pollenParser.fcnBody_return fcnBody210 =null;


        BaseNode string_literal206_tree=null;
        BaseNode string_literal207_tree=null;
        RewriteRuleTokenStream stream_159=new RewriteRuleTokenStream(adaptor,"token 159");
        RewriteRuleTokenStream stream_176=new RewriteRuleTokenStream(adaptor,"token 176");
        RewriteRuleSubtreeStream stream_fcnFormalParameterList=new RewriteRuleSubtreeStream(adaptor,"rule fcnFormalParameterList");
        RewriteRuleSubtreeStream stream_fcnType_fcnName=new RewriteRuleSubtreeStream(adaptor,"rule fcnType_fcnName");
        RewriteRuleSubtreeStream stream_fcnBody=new RewriteRuleSubtreeStream(adaptor,"rule fcnBody");

        	atFlags.clear();			

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 62) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:567:2: ( ( 'public' )? ( 'host' )? fcnType_fcnName fcnFormalParameterList fcnBody[$fcnFormalParameterList.tree] -> ^( D_FCN_DEF[\"D_FCN_DEF\", atFlags] fcnType_fcnName fcnFormalParameterList fcnBody ) )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:567:4: ( 'public' )? ( 'host' )? fcnType_fcnName fcnFormalParameterList fcnBody[$fcnFormalParameterList.tree]
            {
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:567:4: ( 'public' )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==176) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:567:5: 'public'
                    {
                    string_literal206=(Atom)match(input,176,FOLLOW_176_in_fcnDefinitionHost3258); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_176.add(string_literal206);


                    }
                    break;

            }


            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:567:16: ( 'host' )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==159) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:567:17: 'host'
                    {
                    string_literal207=(Atom)match(input,159,FOLLOW_159_in_fcnDefinitionHost3263); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_159.add(string_literal207);


                    if ( state.backtracking==0 ) { atFlags.add(Flags.HOST); }

                    }
                    break;

            }


            pushFollow(FOLLOW_fcnType_fcnName_in_fcnDefinitionHost3274);
            fcnType_fcnName208=fcnType_fcnName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_fcnType_fcnName.add(fcnType_fcnName208.getTree());

            pushFollow(FOLLOW_fcnFormalParameterList_in_fcnDefinitionHost3277);
            fcnFormalParameterList209=fcnFormalParameterList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_fcnFormalParameterList.add(fcnFormalParameterList209.getTree());

            pushFollow(FOLLOW_fcnBody_in_fcnDefinitionHost3279);
            fcnBody210=fcnBody((fcnFormalParameterList209!=null?((BaseNode)fcnFormalParameterList209.tree):null));

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_fcnBody.add(fcnBody210.getTree());

            if ( state.backtracking==0 ) { 	atFlags.add(Flags.PUBLIC); /* enforce */ 	
            			if (!atFlags.contains(Flags.HOST))
                   		throw new PollenException("Composition features must be one of host functions, export statements, or enum definitions.", input);
            		}

            // AST REWRITE
            // elements: fcnBody, fcnFormalParameterList, fcnType_fcnName
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (BaseNode)adaptor.nil();
            // 573:3: -> ^( D_FCN_DEF[\"D_FCN_DEF\", atFlags] fcnType_fcnName fcnFormalParameterList fcnBody )
            {
                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:573:6: ^( D_FCN_DEF[\"D_FCN_DEF\", atFlags] fcnType_fcnName fcnFormalParameterList fcnBody )
                {
                BaseNode root_1 = (BaseNode)adaptor.nil();
                root_1 = (BaseNode)adaptor.becomeRoot(
                new DeclNode.Fcn(D_FCN_DEF, "D_FCN_DEF", atFlags)
                , root_1);

                adaptor.addChild(root_1, stream_fcnType_fcnName.nextTree());

                adaptor.addChild(root_1, stream_fcnFormalParameterList.nextTree());

                adaptor.addChild(root_1, stream_fcnBody.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (BaseNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) {
              atFlags.clear();
            }
        }
        catch (PollenException re) {

                String hdr = getErrorHeader(re);
                String msg = re.toString();
                emitErrorMessage(hdr+" "+msg);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 62, fcnDefinitionHost_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "fcnDefinitionHost"


    public static class fcnAttr_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "fcnAttr"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:580:1: fcnAttr : ( 'public' )? ( 'host' )? ;
    public final pollenParser.fcnAttr_return fcnAttr() throws RecognitionException {
        pollenParser.fcnAttr_return retval = new pollenParser.fcnAttr_return();
        retval.start = input.LT(1);

        int fcnAttr_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom string_literal211=null;
        Atom string_literal212=null;

        BaseNode string_literal211_tree=null;
        BaseNode string_literal212_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 63) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:581:2: ( ( 'public' )? ( 'host' )? )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:581:4: ( 'public' )? ( 'host' )?
            {
            root_0 = (BaseNode)adaptor.nil();


            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:581:4: ( 'public' )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==176) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:581:5: 'public'
                    {
                    string_literal211=(Atom)match(input,176,FOLLOW_176_in_fcnAttr3323); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal211_tree = 
                    (BaseNode)adaptor.create(string_literal211)
                    ;
                    adaptor.addChild(root_0, string_literal211_tree);
                    }

                    if ( state.backtracking==0 ) { atFlags.add(Flags.PUBLIC); }

                    }
                    break;

            }


            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:582:3: ( 'host' )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==159) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:582:4: 'host'
                    {
                    string_literal212=(Atom)match(input,159,FOLLOW_159_in_fcnAttr3334); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal212_tree = 
                    (BaseNode)adaptor.create(string_literal212)
                    ;
                    adaptor.addChild(root_0, string_literal212_tree);
                    }

                    if ( state.backtracking==0 ) { atFlags.add(Flags.HOST); }

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (BaseNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BaseNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 63, fcnAttr_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "fcnAttr"


    public static class fcnBody_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "fcnBody"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:584:1: fcnBody[CommonTree formals] : braceOpen ( stmts ) braceClose -> ^( FCNBODY[\"FCNBODY\"] stmts ) ;
    public final pollenParser.fcnBody_return fcnBody(CommonTree formals) throws RecognitionException {
        pollenParser.fcnBody_return retval = new pollenParser.fcnBody_return();
        retval.start = input.LT(1);

        int fcnBody_StartIndex = input.index();

        BaseNode root_0 = null;

        pollenParser.braceOpen_return braceOpen213 =null;

        pollenParser.stmts_return stmts214 =null;

        pollenParser.braceClose_return braceClose215 =null;


        RewriteRuleSubtreeStream stream_stmts=new RewriteRuleSubtreeStream(adaptor,"rule stmts");
        RewriteRuleSubtreeStream stream_braceOpen=new RewriteRuleSubtreeStream(adaptor,"rule braceOpen");
        RewriteRuleSubtreeStream stream_braceClose=new RewriteRuleSubtreeStream(adaptor,"rule braceClose");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 64) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:585:3: ( braceOpen ( stmts ) braceClose -> ^( FCNBODY[\"FCNBODY\"] stmts ) )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:585:5: braceOpen ( stmts ) braceClose
            {
            pushFollow(FOLLOW_braceOpen_in_fcnBody3351);
            braceOpen213=braceOpen();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_braceOpen.add(braceOpen213.getTree());

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:585:15: ( stmts )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:585:16: stmts
            {
            pushFollow(FOLLOW_stmts_in_fcnBody3354);
            stmts214=stmts();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_stmts.add(stmts214.getTree());

            }


            pushFollow(FOLLOW_braceClose_in_fcnBody3358);
            braceClose215=braceClose();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_braceClose.add(braceClose215.getTree());

            // AST REWRITE
            // elements: stmts
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (BaseNode)adaptor.nil();
            // 585:36: -> ^( FCNBODY[\"FCNBODY\"] stmts )
            {
                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:585:39: ^( FCNBODY[\"FCNBODY\"] stmts )
                {
                BaseNode root_1 = (BaseNode)adaptor.nil();
                root_1 = (BaseNode)adaptor.becomeRoot(
                new FcnBodyNode(FCNBODY, "FCNBODY")
                , root_1);

                adaptor.addChild(root_1, formals);

                adaptor.addChild(root_1, stream_stmts.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (BaseNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BaseNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 64, fcnBody_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "fcnBody"


    public static class fcnDeclaration_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "fcnDeclaration"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:587:1: fcnDeclaration : ( 'public' )? ( 'host' )? fcnType_fcnName ( fcnFormalParameterList ) delim -> ^( D_FCN_DCL[\"D_FCN_DCL\", atFlags] fcnType_fcnName fcnFormalParameterList ) ;
    public final pollenParser.fcnDeclaration_return fcnDeclaration() throws RecognitionException {
        pollenParser.fcnDeclaration_return retval = new pollenParser.fcnDeclaration_return();
        retval.start = input.LT(1);

        int fcnDeclaration_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom string_literal216=null;
        Atom string_literal217=null;
        pollenParser.fcnType_fcnName_return fcnType_fcnName218 =null;

        pollenParser.fcnFormalParameterList_return fcnFormalParameterList219 =null;

        pollenParser.delim_return delim220 =null;


        BaseNode string_literal216_tree=null;
        BaseNode string_literal217_tree=null;
        RewriteRuleTokenStream stream_159=new RewriteRuleTokenStream(adaptor,"token 159");
        RewriteRuleTokenStream stream_176=new RewriteRuleTokenStream(adaptor,"token 176");
        RewriteRuleSubtreeStream stream_fcnFormalParameterList=new RewriteRuleSubtreeStream(adaptor,"rule fcnFormalParameterList");
        RewriteRuleSubtreeStream stream_fcnType_fcnName=new RewriteRuleSubtreeStream(adaptor,"rule fcnType_fcnName");
        RewriteRuleSubtreeStream stream_delim=new RewriteRuleSubtreeStream(adaptor,"rule delim");

        	atFlags.clear();			

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 65) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:594:4: ( ( 'public' )? ( 'host' )? fcnType_fcnName ( fcnFormalParameterList ) delim -> ^( D_FCN_DCL[\"D_FCN_DCL\", atFlags] fcnType_fcnName fcnFormalParameterList ) )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:594:6: ( 'public' )? ( 'host' )? fcnType_fcnName ( fcnFormalParameterList ) delim
            {
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:594:6: ( 'public' )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==176) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:594:7: 'public'
                    {
                    string_literal216=(Atom)match(input,176,FOLLOW_176_in_fcnDeclaration3397); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_176.add(string_literal216);


                    if ( state.backtracking==0 ) { atFlags.add(Flags.PUBLIC); }

                    }
                    break;

            }


            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:595:3: ( 'host' )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==159) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:595:4: 'host'
                    {
                    string_literal217=(Atom)match(input,159,FOLLOW_159_in_fcnDeclaration3408); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_159.add(string_literal217);


                    if ( state.backtracking==0 ) { atFlags.add(Flags.HOST); }

                    }
                    break;

            }


            pushFollow(FOLLOW_fcnType_fcnName_in_fcnDeclaration3418);
            fcnType_fcnName218=fcnType_fcnName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_fcnType_fcnName.add(fcnType_fcnName218.getTree());

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:596:19: ( fcnFormalParameterList )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:596:20: fcnFormalParameterList
            {
            pushFollow(FOLLOW_fcnFormalParameterList_in_fcnDeclaration3421);
            fcnFormalParameterList219=fcnFormalParameterList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_fcnFormalParameterList.add(fcnFormalParameterList219.getTree());

            }


            pushFollow(FOLLOW_delim_in_fcnDeclaration3424);
            delim220=delim();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_delim.add(delim220.getTree());

            // AST REWRITE
            // elements: fcnType_fcnName, fcnFormalParameterList
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (BaseNode)adaptor.nil();
            // 597:4: -> ^( D_FCN_DCL[\"D_FCN_DCL\", atFlags] fcnType_fcnName fcnFormalParameterList )
            {
                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:597:7: ^( D_FCN_DCL[\"D_FCN_DCL\", atFlags] fcnType_fcnName fcnFormalParameterList )
                {
                BaseNode root_1 = (BaseNode)adaptor.nil();
                root_1 = (BaseNode)adaptor.becomeRoot(
                new DeclNode.Fcn(D_FCN_DCL, "D_FCN_DCL", atFlags)
                , root_1);

                adaptor.addChild(root_1, stream_fcnType_fcnName.nextTree());

                adaptor.addChild(root_1, stream_fcnFormalParameterList.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (BaseNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) {
              atFlags.clear();
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BaseNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 65, fcnDeclaration_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "fcnDeclaration"


    public static class fcnType_fcnName_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "fcnType_fcnName"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:599:1: fcnType_fcnName : ( typeName qualName -> ^( D_FCN_TYP_NM ^( LIST[\"LIST\"] typeName ) qualName ) |{...}? typeName -> ^( D_FCN_CTOR ^( LIST[\"LIST\"] typeName ) typeName ) | qualName -> ^( D_FCN_TYP_NM ^( LIST[\"LIST\"] ) qualName ) | ( '(' typeName ( ',' typeName )* ')' qualName )=> fcnTypes_fcnName );
    public final pollenParser.fcnType_fcnName_return fcnType_fcnName() throws RecognitionException {
        pollenParser.fcnType_fcnName_return retval = new pollenParser.fcnType_fcnName_return();
        retval.start = input.LT(1);

        int fcnType_fcnName_StartIndex = input.index();

        BaseNode root_0 = null;

        pollenParser.typeName_return typeName221 =null;

        pollenParser.qualName_return qualName222 =null;

        pollenParser.typeName_return typeName223 =null;

        pollenParser.qualName_return qualName224 =null;

        pollenParser.fcnTypes_fcnName_return fcnTypes_fcnName225 =null;


        RewriteRuleSubtreeStream stream_typeName=new RewriteRuleSubtreeStream(adaptor,"rule typeName");
        RewriteRuleSubtreeStream stream_qualName=new RewriteRuleSubtreeStream(adaptor,"rule qualName");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 66) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:602:2: ( typeName qualName -> ^( D_FCN_TYP_NM ^( LIST[\"LIST\"] typeName ) qualName ) |{...}? typeName -> ^( D_FCN_CTOR ^( LIST[\"LIST\"] typeName ) typeName ) | qualName -> ^( D_FCN_TYP_NM ^( LIST[\"LIST\"] ) qualName ) | ( '(' typeName ( ',' typeName )* ')' qualName )=> fcnTypes_fcnName )
            int alt66=4;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==140||LA66_0==142||(LA66_0 >= 163 && LA66_0 <= 165)||LA66_0==178||(LA66_0 >= 182 && LA66_0 <= 184)) ) {
                int LA66_1 = input.LA(2);

                if ( (synpred107_pollen()) ) {
                    alt66=1;
                }
                else if ( (((synpred108_pollen()&&synpred108_pollen())&&(input.LT(1).getText().equals(ti.getTypeName()) ))) ) {
                    alt66=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 66, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA66_0==IDENT) ) {
                int LA66_2 = input.LA(2);

                if ( (synpred107_pollen()) ) {
                    alt66=1;
                }
                else if ( (((synpred108_pollen()&&synpred108_pollen())&&(input.LT(1).getText().equals(ti.getTypeName()) ))) ) {
                    alt66=2;
                }
                else if ( (synpred109_pollen()) ) {
                    alt66=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 66, 2, input);

                    throw nvae;

                }
            }
            else if ( (LA66_0==122) && (synpred111_pollen())) {
                alt66=4;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;

            }
            switch (alt66) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:602:4: typeName qualName
                    {
                    pushFollow(FOLLOW_typeName_in_fcnType_fcnName3457);
                    typeName221=typeName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeName.add(typeName221.getTree());

                    pushFollow(FOLLOW_qualName_in_fcnType_fcnName3459);
                    qualName222=qualName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_qualName.add(qualName222.getTree());

                    // AST REWRITE
                    // elements: typeName, qualName
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (BaseNode)adaptor.nil();
                    // 603:3: -> ^( D_FCN_TYP_NM ^( LIST[\"LIST\"] typeName ) qualName )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:603:6: ^( D_FCN_TYP_NM ^( LIST[\"LIST\"] typeName ) qualName )
                        {
                        BaseNode root_1 = (BaseNode)adaptor.nil();
                        root_1 = (BaseNode)adaptor.becomeRoot(
                        (BaseNode)adaptor.create(D_FCN_TYP_NM, "D_FCN_TYP_NM")
                        , root_1);

                        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:603:22: ^( LIST[\"LIST\"] typeName )
                        {
                        BaseNode root_2 = (BaseNode)adaptor.nil();
                        root_2 = (BaseNode)adaptor.becomeRoot(
                        new ListNode(LIST, "LIST")
                        , root_2);

                        adaptor.addChild(root_2, stream_typeName.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_1, stream_qualName.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:604:4: {...}? typeName
                    {
                    if ( !((input.LT(1).getText().equals(ti.getTypeName()) )) ) {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        throw new FailedPredicateException(input, "fcnType_fcnName", "input.LT(1).getText().equals(ti.getTypeName()) ");
                    }

                    pushFollow(FOLLOW_typeName_in_fcnType_fcnName3495);
                    typeName223=typeName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeName.add(typeName223.getTree());

                    // AST REWRITE
                    // elements: typeName, typeName
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (BaseNode)adaptor.nil();
                    // 605:3: -> ^( D_FCN_CTOR ^( LIST[\"LIST\"] typeName ) typeName )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:605:6: ^( D_FCN_CTOR ^( LIST[\"LIST\"] typeName ) typeName )
                        {
                        BaseNode root_1 = (BaseNode)adaptor.nil();
                        root_1 = (BaseNode)adaptor.becomeRoot(
                        (BaseNode)adaptor.create(D_FCN_CTOR, "D_FCN_CTOR")
                        , root_1);

                        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:605:19: ^( LIST[\"LIST\"] typeName )
                        {
                        BaseNode root_2 = (BaseNode)adaptor.nil();
                        root_2 = (BaseNode)adaptor.becomeRoot(
                        new ListNode(LIST, "LIST")
                        , root_2);

                        adaptor.addChild(root_2, stream_typeName.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_1, stream_typeName.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 3 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:606:4: qualName
                    {
                    pushFollow(FOLLOW_qualName_in_fcnType_fcnName3531);
                    qualName224=qualName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_qualName.add(qualName224.getTree());

                    // AST REWRITE
                    // elements: qualName
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (BaseNode)adaptor.nil();
                    // 607:3: -> ^( D_FCN_TYP_NM ^( LIST[\"LIST\"] ) qualName )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:607:6: ^( D_FCN_TYP_NM ^( LIST[\"LIST\"] ) qualName )
                        {
                        BaseNode root_1 = (BaseNode)adaptor.nil();
                        root_1 = (BaseNode)adaptor.becomeRoot(
                        (BaseNode)adaptor.create(D_FCN_TYP_NM, "D_FCN_TYP_NM")
                        , root_1);

                        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:607:21: ^( LIST[\"LIST\"] )
                        {
                        BaseNode root_2 = (BaseNode)adaptor.nil();
                        root_2 = (BaseNode)adaptor.becomeRoot(
                        new ListNode(LIST, "LIST")
                        , root_2);

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_1, stream_qualName.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 4 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:608:4: ( '(' typeName ( ',' typeName )* ')' qualName )=> fcnTypes_fcnName
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    pushFollow(FOLLOW_fcnTypes_fcnName_in_fcnType_fcnName3590);
                    fcnTypes_fcnName225=fcnTypes_fcnName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, fcnTypes_fcnName225.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (BaseNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BaseNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 66, fcnType_fcnName_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "fcnType_fcnName"


    public static class fcnTypes_fcnName_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "fcnTypes_fcnName"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:610:1: fcnTypes_fcnName : '(' fcnTypes ')' qualName -> ^( D_FCN_TYP_NM fcnTypes qualName ) ;
    public final pollenParser.fcnTypes_fcnName_return fcnTypes_fcnName() throws RecognitionException {
        pollenParser.fcnTypes_fcnName_return retval = new pollenParser.fcnTypes_fcnName_return();
        retval.start = input.LT(1);

        int fcnTypes_fcnName_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom char_literal226=null;
        Atom char_literal228=null;
        pollenParser.fcnTypes_return fcnTypes227 =null;

        pollenParser.qualName_return qualName229 =null;


        BaseNode char_literal226_tree=null;
        BaseNode char_literal228_tree=null;
        RewriteRuleTokenStream stream_122=new RewriteRuleTokenStream(adaptor,"token 122");
        RewriteRuleTokenStream stream_123=new RewriteRuleTokenStream(adaptor,"token 123");
        RewriteRuleSubtreeStream stream_fcnTypes=new RewriteRuleSubtreeStream(adaptor,"rule fcnTypes");
        RewriteRuleSubtreeStream stream_qualName=new RewriteRuleSubtreeStream(adaptor,"rule qualName");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 67) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:611:2: ( '(' fcnTypes ')' qualName -> ^( D_FCN_TYP_NM fcnTypes qualName ) )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:611:4: '(' fcnTypes ')' qualName
            {
            char_literal226=(Atom)match(input,122,FOLLOW_122_in_fcnTypes_fcnName3601); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_122.add(char_literal226);


            pushFollow(FOLLOW_fcnTypes_in_fcnTypes_fcnName3603);
            fcnTypes227=fcnTypes();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_fcnTypes.add(fcnTypes227.getTree());

            char_literal228=(Atom)match(input,123,FOLLOW_123_in_fcnTypes_fcnName3605); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_123.add(char_literal228);


            pushFollow(FOLLOW_qualName_in_fcnTypes_fcnName3607);
            qualName229=qualName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_qualName.add(qualName229.getTree());

            // AST REWRITE
            // elements: qualName, fcnTypes
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (BaseNode)adaptor.nil();
            // 611:30: -> ^( D_FCN_TYP_NM fcnTypes qualName )
            {
                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:611:33: ^( D_FCN_TYP_NM fcnTypes qualName )
                {
                BaseNode root_1 = (BaseNode)adaptor.nil();
                root_1 = (BaseNode)adaptor.becomeRoot(
                (BaseNode)adaptor.create(D_FCN_TYP_NM, "D_FCN_TYP_NM")
                , root_1);

                adaptor.addChild(root_1, stream_fcnTypes.nextTree());

                adaptor.addChild(root_1, stream_qualName.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (BaseNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BaseNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 67, fcnTypes_fcnName_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "fcnTypes_fcnName"


    public static class fcnTypes_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "fcnTypes"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:613:1: fcnTypes : typeName ( ',' typeName )* -> ^( LIST[\"LIST\"] ( typeName )+ ) ;
    public final pollenParser.fcnTypes_return fcnTypes() throws RecognitionException {
        pollenParser.fcnTypes_return retval = new pollenParser.fcnTypes_return();
        retval.start = input.LT(1);

        int fcnTypes_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom char_literal231=null;
        pollenParser.typeName_return typeName230 =null;

        pollenParser.typeName_return typeName232 =null;


        BaseNode char_literal231_tree=null;
        RewriteRuleTokenStream stream_125=new RewriteRuleTokenStream(adaptor,"token 125");
        RewriteRuleSubtreeStream stream_typeName=new RewriteRuleSubtreeStream(adaptor,"rule typeName");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 68) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:614:2: ( typeName ( ',' typeName )* -> ^( LIST[\"LIST\"] ( typeName )+ ) )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:614:4: typeName ( ',' typeName )*
            {
            pushFollow(FOLLOW_typeName_in_fcnTypes3628);
            typeName230=typeName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeName.add(typeName230.getTree());

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:614:13: ( ',' typeName )*
            loop67:
            do {
                int alt67=2;
                int LA67_0 = input.LA(1);

                if ( (LA67_0==125) ) {
                    alt67=1;
                }


                switch (alt67) {
            	case 1 :
            	    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:614:14: ',' typeName
            	    {
            	    char_literal231=(Atom)match(input,125,FOLLOW_125_in_fcnTypes3631); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_125.add(char_literal231);


            	    pushFollow(FOLLOW_typeName_in_fcnTypes3633);
            	    typeName232=typeName();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_typeName.add(typeName232.getTree());

            	    }
            	    break;

            	default :
            	    break loop67;
                }
            } while (true);


            // AST REWRITE
            // elements: typeName
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (BaseNode)adaptor.nil();
            // 614:29: -> ^( LIST[\"LIST\"] ( typeName )+ )
            {
                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:614:32: ^( LIST[\"LIST\"] ( typeName )+ )
                {
                BaseNode root_1 = (BaseNode)adaptor.nil();
                root_1 = (BaseNode)adaptor.becomeRoot(
                new ListNode(LIST, "LIST")
                , root_1);

                if ( !(stream_typeName.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_typeName.hasNext() ) {
                    adaptor.addChild(root_1, stream_typeName.nextTree());

                }
                stream_typeName.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (BaseNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BaseNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 68, fcnTypes_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "fcnTypes"


    public static class fcnFormalParameterList_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "fcnFormalParameterList"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:616:1: fcnFormalParameterList : '(' fcnFormalParameters ')' -> fcnFormalParameters ;
    public final pollenParser.fcnFormalParameterList_return fcnFormalParameterList() throws RecognitionException {
        pollenParser.fcnFormalParameterList_return retval = new pollenParser.fcnFormalParameterList_return();
        retval.start = input.LT(1);

        int fcnFormalParameterList_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom char_literal233=null;
        Atom char_literal235=null;
        pollenParser.fcnFormalParameters_return fcnFormalParameters234 =null;


        BaseNode char_literal233_tree=null;
        BaseNode char_literal235_tree=null;
        RewriteRuleTokenStream stream_122=new RewriteRuleTokenStream(adaptor,"token 122");
        RewriteRuleTokenStream stream_123=new RewriteRuleTokenStream(adaptor,"token 123");
        RewriteRuleSubtreeStream stream_fcnFormalParameters=new RewriteRuleSubtreeStream(adaptor,"rule fcnFormalParameters");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 69) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:617:2: ( '(' fcnFormalParameters ')' -> fcnFormalParameters )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:617:4: '(' fcnFormalParameters ')'
            {
            char_literal233=(Atom)match(input,122,FOLLOW_122_in_fcnFormalParameterList3658); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_122.add(char_literal233);


            pushFollow(FOLLOW_fcnFormalParameters_in_fcnFormalParameterList3660);
            fcnFormalParameters234=fcnFormalParameters();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_fcnFormalParameters.add(fcnFormalParameters234.getTree());

            char_literal235=(Atom)match(input,123,FOLLOW_123_in_fcnFormalParameterList3662); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_123.add(char_literal235);


            // AST REWRITE
            // elements: fcnFormalParameters
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (BaseNode)adaptor.nil();
            // 617:32: -> fcnFormalParameters
            {
                adaptor.addChild(root_0, stream_fcnFormalParameters.nextTree());

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (BaseNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BaseNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 69, fcnFormalParameterList_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "fcnFormalParameterList"


    public static class fcnFormalParameters_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "fcnFormalParameters"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:619:1: fcnFormalParameters : ( fcnFormalParameter ( ',' fcnFormalParameter )* -> ^( LIST[\"LIST\"] ( fcnFormalParameter )+ ) | -> ^( LIST[\"LIST\"] ) );
    public final pollenParser.fcnFormalParameters_return fcnFormalParameters() throws RecognitionException {
        pollenParser.fcnFormalParameters_return retval = new pollenParser.fcnFormalParameters_return();
        retval.start = input.LT(1);

        int fcnFormalParameters_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom char_literal237=null;
        pollenParser.fcnFormalParameter_return fcnFormalParameter236 =null;

        pollenParser.fcnFormalParameter_return fcnFormalParameter238 =null;


        BaseNode char_literal237_tree=null;
        RewriteRuleTokenStream stream_125=new RewriteRuleTokenStream(adaptor,"token 125");
        RewriteRuleSubtreeStream stream_fcnFormalParameter=new RewriteRuleSubtreeStream(adaptor,"rule fcnFormalParameter");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 70) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:620:2: ( fcnFormalParameter ( ',' fcnFormalParameter )* -> ^( LIST[\"LIST\"] ( fcnFormalParameter )+ ) | -> ^( LIST[\"LIST\"] ) )
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==IDENT||LA69_0==140||LA69_0==142||(LA69_0 >= 163 && LA69_0 <= 165)||LA69_0==178||(LA69_0 >= 182 && LA69_0 <= 184)) ) {
                alt69=1;
            }
            else if ( (LA69_0==123) ) {
                alt69=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 69, 0, input);

                throw nvae;

            }
            switch (alt69) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:620:4: fcnFormalParameter ( ',' fcnFormalParameter )*
                    {
                    pushFollow(FOLLOW_fcnFormalParameter_in_fcnFormalParameters3676);
                    fcnFormalParameter236=fcnFormalParameter();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_fcnFormalParameter.add(fcnFormalParameter236.getTree());

                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:620:23: ( ',' fcnFormalParameter )*
                    loop68:
                    do {
                        int alt68=2;
                        int LA68_0 = input.LA(1);

                        if ( (LA68_0==125) ) {
                            alt68=1;
                        }


                        switch (alt68) {
                    	case 1 :
                    	    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:620:24: ',' fcnFormalParameter
                    	    {
                    	    char_literal237=(Atom)match(input,125,FOLLOW_125_in_fcnFormalParameters3679); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_125.add(char_literal237);


                    	    pushFollow(FOLLOW_fcnFormalParameter_in_fcnFormalParameters3681);
                    	    fcnFormalParameter238=fcnFormalParameter();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_fcnFormalParameter.add(fcnFormalParameter238.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop68;
                        }
                    } while (true);


                    // AST REWRITE
                    // elements: fcnFormalParameter
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (BaseNode)adaptor.nil();
                    // 621:3: -> ^( LIST[\"LIST\"] ( fcnFormalParameter )+ )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:621:6: ^( LIST[\"LIST\"] ( fcnFormalParameter )+ )
                        {
                        BaseNode root_1 = (BaseNode)adaptor.nil();
                        root_1 = (BaseNode)adaptor.becomeRoot(
                        new ListNode(LIST, "LIST")
                        , root_1);

                        if ( !(stream_fcnFormalParameter.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_fcnFormalParameter.hasNext() ) {
                            adaptor.addChild(root_1, stream_fcnFormalParameter.nextTree());

                        }
                        stream_fcnFormalParameter.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:622:4: 
                    {
                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (BaseNode)adaptor.nil();
                    // 622:4: -> ^( LIST[\"LIST\"] )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:622:7: ^( LIST[\"LIST\"] )
                        {
                        BaseNode root_1 = (BaseNode)adaptor.nil();
                        root_1 = (BaseNode)adaptor.becomeRoot(
                        new ListNode(LIST, "LIST")
                        , root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (BaseNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BaseNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 70, fcnFormalParameters_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "fcnFormalParameters"


    public static class fcnFormalParameter_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "fcnFormalParameter"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:624:1: fcnFormalParameter : typeName IDENT ( '=' expr )? -> ^( D_FORMAL[\"D_FORMAL\"] typeName ^( IDENT ( expr )? ) ) ;
    public final pollenParser.fcnFormalParameter_return fcnFormalParameter() throws RecognitionException {
        pollenParser.fcnFormalParameter_return retval = new pollenParser.fcnFormalParameter_return();
        retval.start = input.LT(1);

        int fcnFormalParameter_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom IDENT240=null;
        Atom char_literal241=null;
        pollenParser.typeName_return typeName239 =null;

        pollenParser.expr_return expr242 =null;


        BaseNode IDENT240_tree=null;
        BaseNode char_literal241_tree=null;
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
        RewriteRuleSubtreeStream stream_typeName=new RewriteRuleSubtreeStream(adaptor,"rule typeName");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 71) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:625:2: ( typeName IDENT ( '=' expr )? -> ^( D_FORMAL[\"D_FORMAL\"] typeName ^( IDENT ( expr )? ) ) )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:625:6: typeName IDENT ( '=' expr )?
            {
            pushFollow(FOLLOW_typeName_in_fcnFormalParameter3724);
            typeName239=typeName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeName.add(typeName239.getTree());

            IDENT240=(Atom)match(input,IDENT,FOLLOW_IDENT_in_fcnFormalParameter3726); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENT.add(IDENT240);


            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:625:21: ( '=' expr )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==ASSIGN) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:625:23: '=' expr
                    {
                    char_literal241=(Atom)match(input,ASSIGN,FOLLOW_ASSIGN_in_fcnFormalParameter3730); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ASSIGN.add(char_literal241);


                    pushFollow(FOLLOW_expr_in_fcnFormalParameter3732);
                    expr242=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr242.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: expr, typeName, IDENT
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (BaseNode)adaptor.nil();
            // 626:3: -> ^( D_FORMAL[\"D_FORMAL\"] typeName ^( IDENT ( expr )? ) )
            {
                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:626:6: ^( D_FORMAL[\"D_FORMAL\"] typeName ^( IDENT ( expr )? ) )
                {
                BaseNode root_1 = (BaseNode)adaptor.nil();
                root_1 = (BaseNode)adaptor.becomeRoot(
                new DeclNode.Formal(D_FORMAL, "D_FORMAL")
                , root_1);

                adaptor.addChild(root_1, stream_typeName.nextTree());

                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:626:55: ^( IDENT ( expr )? )
                {
                BaseNode root_2 = (BaseNode)adaptor.nil();
                root_2 = (BaseNode)adaptor.becomeRoot(
                stream_IDENT.nextNode()
                , root_2);

                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:626:63: ( expr )?
                if ( stream_expr.hasNext() ) {
                    adaptor.addChild(root_2, stream_expr.nextTree());

                }
                stream_expr.reset();

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (BaseNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BaseNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 71, fcnFormalParameter_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "fcnFormalParameter"


    public static class fcnArgumentList_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "fcnArgumentList"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:628:1: fcnArgumentList : '(' fcnArguments ')' -> fcnArguments ;
    public final pollenParser.fcnArgumentList_return fcnArgumentList() throws RecognitionException {
        pollenParser.fcnArgumentList_return retval = new pollenParser.fcnArgumentList_return();
        retval.start = input.LT(1);

        int fcnArgumentList_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom char_literal243=null;
        Atom char_literal245=null;
        pollenParser.fcnArguments_return fcnArguments244 =null;


        BaseNode char_literal243_tree=null;
        BaseNode char_literal245_tree=null;
        RewriteRuleTokenStream stream_122=new RewriteRuleTokenStream(adaptor,"token 122");
        RewriteRuleTokenStream stream_123=new RewriteRuleTokenStream(adaptor,"token 123");
        RewriteRuleSubtreeStream stream_fcnArguments=new RewriteRuleSubtreeStream(adaptor,"rule fcnArguments");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 72) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:629:2: ( '(' fcnArguments ')' -> fcnArguments )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:629:4: '(' fcnArguments ')'
            {
            char_literal243=(Atom)match(input,122,FOLLOW_122_in_fcnArgumentList3769); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_122.add(char_literal243);


            pushFollow(FOLLOW_fcnArguments_in_fcnArgumentList3771);
            fcnArguments244=fcnArguments();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_fcnArguments.add(fcnArguments244.getTree());

            char_literal245=(Atom)match(input,123,FOLLOW_123_in_fcnArgumentList3773); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_123.add(char_literal245);


            // AST REWRITE
            // elements: fcnArguments
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (BaseNode)adaptor.nil();
            // 629:25: -> fcnArguments
            {
                adaptor.addChild(root_0, stream_fcnArguments.nextTree());

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (BaseNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BaseNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 72, fcnArgumentList_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "fcnArgumentList"


    public static class fcnArguments_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "fcnArguments"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:631:1: fcnArguments : exprList ;
    public final pollenParser.fcnArguments_return fcnArguments() throws RecognitionException {
        pollenParser.fcnArguments_return retval = new pollenParser.fcnArguments_return();
        retval.start = input.LT(1);

        int fcnArguments_StartIndex = input.index();

        BaseNode root_0 = null;

        pollenParser.exprList_return exprList246 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 73) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:632:2: ( exprList )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:632:4: exprList
            {
            root_0 = (BaseNode)adaptor.nil();


            pushFollow(FOLLOW_exprList_in_fcnArguments3788);
            exprList246=exprList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, exprList246.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (BaseNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BaseNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 73, fcnArguments_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "fcnArguments"


    public static class varOrFcnOrArray_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "varOrFcnOrArray"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:634:1: varOrFcnOrArray : ( 'new' typeName fcnArgumentList ( fieldOrArrayAccess )? -> ^( E_NEW[\"E_NEW\"] typeName fcnArgumentList ( fieldOrArrayAccess )? ) | '@' IDENT fcnArgumentList ( fieldOrArrayAccess )? -> ^( E_SELF[\"E_SELF\"] ^( E_CALL[\"E_CALL\"] IDENT fcnArgumentList ( fieldOrArrayAccess )? ) ) | '@' IDENT ( fieldOrArrayAccess )? -> ^( E_SELF[\"E_SELF\"] ^( E_IDENT[\"E_IDENT\"] IDENT ( fieldOrArrayAccess )? ) ) | '@' -> ^( E_SELF[\"E_SELF\"] ) | qualName fcnArgumentList ( fieldOrArrayAccess )? -> ^( E_CALL[\"E_CALL\"] qualName fcnArgumentList ( fieldOrArrayAccess )? ) | qualName ( fieldOrArrayAccess )? );
    public final pollenParser.varOrFcnOrArray_return varOrFcnOrArray() throws RecognitionException {
        pollenParser.varOrFcnOrArray_return retval = new pollenParser.varOrFcnOrArray_return();
        retval.start = input.LT(1);

        int varOrFcnOrArray_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom string_literal247=null;
        Atom char_literal251=null;
        Atom IDENT252=null;
        Atom char_literal255=null;
        Atom IDENT256=null;
        Atom char_literal258=null;
        pollenParser.typeName_return typeName248 =null;

        pollenParser.fcnArgumentList_return fcnArgumentList249 =null;

        pollenParser.fieldOrArrayAccess_return fieldOrArrayAccess250 =null;

        pollenParser.fcnArgumentList_return fcnArgumentList253 =null;

        pollenParser.fieldOrArrayAccess_return fieldOrArrayAccess254 =null;

        pollenParser.fieldOrArrayAccess_return fieldOrArrayAccess257 =null;

        pollenParser.qualName_return qualName259 =null;

        pollenParser.fcnArgumentList_return fcnArgumentList260 =null;

        pollenParser.fieldOrArrayAccess_return fieldOrArrayAccess261 =null;

        pollenParser.qualName_return qualName262 =null;

        pollenParser.fieldOrArrayAccess_return fieldOrArrayAccess263 =null;


        BaseNode string_literal247_tree=null;
        BaseNode char_literal251_tree=null;
        BaseNode IDENT252_tree=null;
        BaseNode char_literal255_tree=null;
        BaseNode IDENT256_tree=null;
        BaseNode char_literal258_tree=null;
        RewriteRuleTokenStream stream_134=new RewriteRuleTokenStream(adaptor,"token 134");
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleTokenStream stream_169=new RewriteRuleTokenStream(adaptor,"token 169");
        RewriteRuleSubtreeStream stream_typeName=new RewriteRuleSubtreeStream(adaptor,"rule typeName");
        RewriteRuleSubtreeStream stream_fcnArgumentList=new RewriteRuleSubtreeStream(adaptor,"rule fcnArgumentList");
        RewriteRuleSubtreeStream stream_qualName=new RewriteRuleSubtreeStream(adaptor,"rule qualName");
        RewriteRuleSubtreeStream stream_fieldOrArrayAccess=new RewriteRuleSubtreeStream(adaptor,"rule fieldOrArrayAccess");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 74) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:635:2: ( 'new' typeName fcnArgumentList ( fieldOrArrayAccess )? -> ^( E_NEW[\"E_NEW\"] typeName fcnArgumentList ( fieldOrArrayAccess )? ) | '@' IDENT fcnArgumentList ( fieldOrArrayAccess )? -> ^( E_SELF[\"E_SELF\"] ^( E_CALL[\"E_CALL\"] IDENT fcnArgumentList ( fieldOrArrayAccess )? ) ) | '@' IDENT ( fieldOrArrayAccess )? -> ^( E_SELF[\"E_SELF\"] ^( E_IDENT[\"E_IDENT\"] IDENT ( fieldOrArrayAccess )? ) ) | '@' -> ^( E_SELF[\"E_SELF\"] ) | qualName fcnArgumentList ( fieldOrArrayAccess )? -> ^( E_CALL[\"E_CALL\"] qualName fcnArgumentList ( fieldOrArrayAccess )? ) | qualName ( fieldOrArrayAccess )? )
            int alt76=6;
            switch ( input.LA(1) ) {
            case 169:
                {
                alt76=1;
                }
                break;
            case 134:
                {
                int LA76_2 = input.LA(2);

                if ( (synpred119_pollen()) ) {
                    alt76=2;
                }
                else if ( (synpred121_pollen()) ) {
                    alt76=3;
                }
                else if ( (synpred122_pollen()) ) {
                    alt76=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 76, 2, input);

                    throw nvae;

                }
                }
                break;
            case IDENT:
                {
                int LA76_6 = input.LA(2);

                if ( (synpred124_pollen()) ) {
                    alt76=5;
                }
                else if ( (true) ) {
                    alt76=6;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 76, 6, input);

                    throw nvae;

                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 76, 0, input);

                throw nvae;

            }

            switch (alt76) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:635:4: 'new' typeName fcnArgumentList ( fieldOrArrayAccess )?
                    {
                    string_literal247=(Atom)match(input,169,FOLLOW_169_in_varOrFcnOrArray3798); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_169.add(string_literal247);


                    pushFollow(FOLLOW_typeName_in_varOrFcnOrArray3800);
                    typeName248=typeName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeName.add(typeName248.getTree());

                    pushFollow(FOLLOW_fcnArgumentList_in_varOrFcnOrArray3802);
                    fcnArgumentList249=fcnArgumentList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_fcnArgumentList.add(fcnArgumentList249.getTree());

                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:635:35: ( fieldOrArrayAccess )?
                    int alt71=2;
                    int LA71_0 = input.LA(1);

                    if ( (LA71_0==135) ) {
                        int LA71_1 = input.LA(2);

                        if ( (synpred116_pollen()) ) {
                            alt71=1;
                        }
                    }
                    else if ( (LA71_0==126) ) {
                        alt71=1;
                    }
                    switch (alt71) {
                        case 1 :
                            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:635:35: fieldOrArrayAccess
                            {
                            pushFollow(FOLLOW_fieldOrArrayAccess_in_varOrFcnOrArray3804);
                            fieldOrArrayAccess250=fieldOrArrayAccess();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_fieldOrArrayAccess.add(fieldOrArrayAccess250.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: fieldOrArrayAccess, typeName, fcnArgumentList
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (BaseNode)adaptor.nil();
                    // 636:3: -> ^( E_NEW[\"E_NEW\"] typeName fcnArgumentList ( fieldOrArrayAccess )? )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:636:6: ^( E_NEW[\"E_NEW\"] typeName fcnArgumentList ( fieldOrArrayAccess )? )
                        {
                        BaseNode root_1 = (BaseNode)adaptor.nil();
                        root_1 = (BaseNode)adaptor.becomeRoot(
                        new ExprNode.New(E_NEW, "E_NEW")
                        , root_1);

                        adaptor.addChild(root_1, stream_typeName.nextTree());

                        adaptor.addChild(root_1, stream_fcnArgumentList.nextTree());

                        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:636:62: ( fieldOrArrayAccess )?
                        if ( stream_fieldOrArrayAccess.hasNext() ) {
                            adaptor.addChild(root_1, stream_fieldOrArrayAccess.nextTree());

                        }
                        stream_fieldOrArrayAccess.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:637:4: '@' IDENT fcnArgumentList ( fieldOrArrayAccess )?
                    {
                    char_literal251=(Atom)match(input,134,FOLLOW_134_in_varOrFcnOrArray3831); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_134.add(char_literal251);


                    IDENT252=(Atom)match(input,IDENT,FOLLOW_IDENT_in_varOrFcnOrArray3833); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENT.add(IDENT252);


                    pushFollow(FOLLOW_fcnArgumentList_in_varOrFcnOrArray3835);
                    fcnArgumentList253=fcnArgumentList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_fcnArgumentList.add(fcnArgumentList253.getTree());

                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:637:30: ( fieldOrArrayAccess )?
                    int alt72=2;
                    int LA72_0 = input.LA(1);

                    if ( (LA72_0==135) ) {
                        int LA72_1 = input.LA(2);

                        if ( (synpred118_pollen()) ) {
                            alt72=1;
                        }
                    }
                    else if ( (LA72_0==126) ) {
                        alt72=1;
                    }
                    switch (alt72) {
                        case 1 :
                            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:637:30: fieldOrArrayAccess
                            {
                            pushFollow(FOLLOW_fieldOrArrayAccess_in_varOrFcnOrArray3837);
                            fieldOrArrayAccess254=fieldOrArrayAccess();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_fieldOrArrayAccess.add(fieldOrArrayAccess254.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: fcnArgumentList, IDENT, fieldOrArrayAccess
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (BaseNode)adaptor.nil();
                    // 638:3: -> ^( E_SELF[\"E_SELF\"] ^( E_CALL[\"E_CALL\"] IDENT fcnArgumentList ( fieldOrArrayAccess )? ) )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:638:6: ^( E_SELF[\"E_SELF\"] ^( E_CALL[\"E_CALL\"] IDENT fcnArgumentList ( fieldOrArrayAccess )? ) )
                        {
                        BaseNode root_1 = (BaseNode)adaptor.nil();
                        root_1 = (BaseNode)adaptor.becomeRoot(
                        new ExprNode.Self(E_SELF, "E_SELF")
                        , root_1);

                        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:639:4: ^( E_CALL[\"E_CALL\"] IDENT fcnArgumentList ( fieldOrArrayAccess )? )
                        {
                        BaseNode root_2 = (BaseNode)adaptor.nil();
                        root_2 = (BaseNode)adaptor.becomeRoot(
                        new ExprNode.Call(E_CALL, "E_CALL")
                        , root_2);

                        adaptor.addChild(root_2, 
                        stream_IDENT.nextNode()
                        );

                        adaptor.addChild(root_2, stream_fcnArgumentList.nextTree());

                        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:639:60: ( fieldOrArrayAccess )?
                        if ( stream_fieldOrArrayAccess.hasNext() ) {
                            adaptor.addChild(root_2, stream_fieldOrArrayAccess.nextTree());

                        }
                        stream_fieldOrArrayAccess.reset();

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 3 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:640:4: '@' IDENT ( fieldOrArrayAccess )?
                    {
                    char_literal255=(Atom)match(input,134,FOLLOW_134_in_varOrFcnOrArray3879); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_134.add(char_literal255);


                    IDENT256=(Atom)match(input,IDENT,FOLLOW_IDENT_in_varOrFcnOrArray3881); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENT.add(IDENT256);


                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:640:14: ( fieldOrArrayAccess )?
                    int alt73=2;
                    int LA73_0 = input.LA(1);

                    if ( (LA73_0==135) ) {
                        int LA73_1 = input.LA(2);

                        if ( (synpred120_pollen()) ) {
                            alt73=1;
                        }
                    }
                    else if ( (LA73_0==126) ) {
                        alt73=1;
                    }
                    switch (alt73) {
                        case 1 :
                            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:640:14: fieldOrArrayAccess
                            {
                            pushFollow(FOLLOW_fieldOrArrayAccess_in_varOrFcnOrArray3883);
                            fieldOrArrayAccess257=fieldOrArrayAccess();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_fieldOrArrayAccess.add(fieldOrArrayAccess257.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: IDENT, fieldOrArrayAccess
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (BaseNode)adaptor.nil();
                    // 641:3: -> ^( E_SELF[\"E_SELF\"] ^( E_IDENT[\"E_IDENT\"] IDENT ( fieldOrArrayAccess )? ) )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:641:6: ^( E_SELF[\"E_SELF\"] ^( E_IDENT[\"E_IDENT\"] IDENT ( fieldOrArrayAccess )? ) )
                        {
                        BaseNode root_1 = (BaseNode)adaptor.nil();
                        root_1 = (BaseNode)adaptor.becomeRoot(
                        new ExprNode.Self(E_SELF, "E_SELF")
                        , root_1);

                        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:641:40: ^( E_IDENT[\"E_IDENT\"] IDENT ( fieldOrArrayAccess )? )
                        {
                        BaseNode root_2 = (BaseNode)adaptor.nil();
                        root_2 = (BaseNode)adaptor.becomeRoot(
                        new ExprNode.Ident(E_IDENT, "E_IDENT")
                        , root_2);

                        adaptor.addChild(root_2, 
                        stream_IDENT.nextNode()
                        );

                        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:641:83: ( fieldOrArrayAccess )?
                        if ( stream_fieldOrArrayAccess.hasNext() ) {
                            adaptor.addChild(root_2, stream_fieldOrArrayAccess.nextTree());

                        }
                        stream_fieldOrArrayAccess.reset();

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 4 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:642:4: '@'
                    {
                    char_literal258=(Atom)match(input,134,FOLLOW_134_in_varOrFcnOrArray3922); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_134.add(char_literal258);


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (BaseNode)adaptor.nil();
                    // 643:3: -> ^( E_SELF[\"E_SELF\"] )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:643:6: ^( E_SELF[\"E_SELF\"] )
                        {
                        BaseNode root_1 = (BaseNode)adaptor.nil();
                        root_1 = (BaseNode)adaptor.becomeRoot(
                        new ExprNode.Self(E_SELF, "E_SELF")
                        , root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 5 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:644:4: qualName fcnArgumentList ( fieldOrArrayAccess )?
                    {
                    pushFollow(FOLLOW_qualName_in_varOrFcnOrArray3942);
                    qualName259=qualName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_qualName.add(qualName259.getTree());

                    pushFollow(FOLLOW_fcnArgumentList_in_varOrFcnOrArray3944);
                    fcnArgumentList260=fcnArgumentList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_fcnArgumentList.add(fcnArgumentList260.getTree());

                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:644:29: ( fieldOrArrayAccess )?
                    int alt74=2;
                    int LA74_0 = input.LA(1);

                    if ( (LA74_0==135) ) {
                        int LA74_1 = input.LA(2);

                        if ( (synpred123_pollen()) ) {
                            alt74=1;
                        }
                    }
                    else if ( (LA74_0==126) ) {
                        alt74=1;
                    }
                    switch (alt74) {
                        case 1 :
                            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:644:29: fieldOrArrayAccess
                            {
                            pushFollow(FOLLOW_fieldOrArrayAccess_in_varOrFcnOrArray3946);
                            fieldOrArrayAccess261=fieldOrArrayAccess();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_fieldOrArrayAccess.add(fieldOrArrayAccess261.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: qualName, fieldOrArrayAccess, fcnArgumentList
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (BaseNode)adaptor.nil();
                    // 645:3: -> ^( E_CALL[\"E_CALL\"] qualName fcnArgumentList ( fieldOrArrayAccess )? )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:645:6: ^( E_CALL[\"E_CALL\"] qualName fcnArgumentList ( fieldOrArrayAccess )? )
                        {
                        BaseNode root_1 = (BaseNode)adaptor.nil();
                        root_1 = (BaseNode)adaptor.becomeRoot(
                        new ExprNode.Call(E_CALL, "E_CALL")
                        , root_1);

                        adaptor.addChild(root_1, stream_qualName.nextTree());

                        adaptor.addChild(root_1, stream_fcnArgumentList.nextTree());

                        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:645:65: ( fieldOrArrayAccess )?
                        if ( stream_fieldOrArrayAccess.hasNext() ) {
                            adaptor.addChild(root_1, stream_fieldOrArrayAccess.nextTree());

                        }
                        stream_fieldOrArrayAccess.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 6 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:646:4: qualName ( fieldOrArrayAccess )?
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    pushFollow(FOLLOW_qualName_in_varOrFcnOrArray3974);
                    qualName262=qualName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, qualName262.getTree());

                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:646:13: ( fieldOrArrayAccess )?
                    int alt75=2;
                    int LA75_0 = input.LA(1);

                    if ( (LA75_0==135) ) {
                        int LA75_1 = input.LA(2);

                        if ( (synpred125_pollen()) ) {
                            alt75=1;
                        }
                    }
                    else if ( (LA75_0==126) ) {
                        alt75=1;
                    }
                    switch (alt75) {
                        case 1 :
                            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:646:13: fieldOrArrayAccess
                            {
                            pushFollow(FOLLOW_fieldOrArrayAccess_in_varOrFcnOrArray3976);
                            fieldOrArrayAccess263=fieldOrArrayAccess();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, fieldOrArrayAccess263.getTree());

                            }
                            break;

                    }


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (BaseNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BaseNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 74, varOrFcnOrArray_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "varOrFcnOrArray"


    public static class fieldOrArrayAccess_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "fieldOrArrayAccess"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:648:1: fieldOrArrayAccess : ( fieldAccess | arrayAccess )+ ;
    public final pollenParser.fieldOrArrayAccess_return fieldOrArrayAccess() throws RecognitionException {
        pollenParser.fieldOrArrayAccess_return retval = new pollenParser.fieldOrArrayAccess_return();
        retval.start = input.LT(1);

        int fieldOrArrayAccess_StartIndex = input.index();

        BaseNode root_0 = null;

        pollenParser.fieldAccess_return fieldAccess264 =null;

        pollenParser.arrayAccess_return arrayAccess265 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 75) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:649:2: ( ( fieldAccess | arrayAccess )+ )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:649:5: ( fieldAccess | arrayAccess )+
            {
            root_0 = (BaseNode)adaptor.nil();


            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:649:5: ( fieldAccess | arrayAccess )+
            int cnt77=0;
            loop77:
            do {
                int alt77=3;
                int LA77_0 = input.LA(1);

                if ( (LA77_0==126) ) {
                    alt77=1;
                }
                else if ( (LA77_0==135) ) {
                    int LA77_2 = input.LA(2);

                    if ( (synpred127_pollen()) ) {
                        alt77=2;
                    }


                }


                switch (alt77) {
            	case 1 :
            	    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:649:6: fieldAccess
            	    {
            	    pushFollow(FOLLOW_fieldAccess_in_fieldOrArrayAccess3990);
            	    fieldAccess264=fieldAccess();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, fieldAccess264.getTree());

            	    }
            	    break;
            	case 2 :
            	    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:649:20: arrayAccess
            	    {
            	    pushFollow(FOLLOW_arrayAccess_in_fieldOrArrayAccess3994);
            	    arrayAccess265=arrayAccess();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, arrayAccess265.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt77 >= 1 ) break loop77;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(77, input);
                        throw eee;
                }
                cnt77++;
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (BaseNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BaseNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 75, fieldOrArrayAccess_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "fieldOrArrayAccess"


    public static class fieldAccess_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "fieldAccess"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:651:1: fieldAccess : ( '.' IDENT fcnArgumentList -> ^( E_CALL[\"E_CALL\", true] IDENT fcnArgumentList ) | '.' IDENT -> ^( E_IDENT[\"E_IDENT\", true] IDENT ) );
    public final pollenParser.fieldAccess_return fieldAccess() throws RecognitionException {
        pollenParser.fieldAccess_return retval = new pollenParser.fieldAccess_return();
        retval.start = input.LT(1);

        int fieldAccess_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom char_literal266=null;
        Atom IDENT267=null;
        Atom char_literal269=null;
        Atom IDENT270=null;
        pollenParser.fcnArgumentList_return fcnArgumentList268 =null;


        BaseNode char_literal266_tree=null;
        BaseNode IDENT267_tree=null;
        BaseNode char_literal269_tree=null;
        BaseNode IDENT270_tree=null;
        RewriteRuleTokenStream stream_126=new RewriteRuleTokenStream(adaptor,"token 126");
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleSubtreeStream stream_fcnArgumentList=new RewriteRuleSubtreeStream(adaptor,"rule fcnArgumentList");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 76) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:654:2: ( '.' IDENT fcnArgumentList -> ^( E_CALL[\"E_CALL\", true] IDENT fcnArgumentList ) | '.' IDENT -> ^( E_IDENT[\"E_IDENT\", true] IDENT ) )
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==126) ) {
                int LA78_1 = input.LA(2);

                if ( (synpred128_pollen()) ) {
                    alt78=1;
                }
                else if ( (true) ) {
                    alt78=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 78, 1, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 78, 0, input);

                throw nvae;

            }
            switch (alt78) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:654:4: '.' IDENT fcnArgumentList
                    {
                    char_literal266=(Atom)match(input,126,FOLLOW_126_in_fieldAccess4008); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_126.add(char_literal266);


                    IDENT267=(Atom)match(input,IDENT,FOLLOW_IDENT_in_fieldAccess4010); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENT.add(IDENT267);


                    pushFollow(FOLLOW_fcnArgumentList_in_fieldAccess4012);
                    fcnArgumentList268=fcnArgumentList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_fcnArgumentList.add(fcnArgumentList268.getTree());

                    // AST REWRITE
                    // elements: IDENT, fcnArgumentList
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (BaseNode)adaptor.nil();
                    // 654:30: -> ^( E_CALL[\"E_CALL\", true] IDENT fcnArgumentList )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:654:33: ^( E_CALL[\"E_CALL\", true] IDENT fcnArgumentList )
                        {
                        BaseNode root_1 = (BaseNode)adaptor.nil();
                        root_1 = (BaseNode)adaptor.becomeRoot(
                        new ExprNode.Call(E_CALL, "E_CALL", true)
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_IDENT.nextNode()
                        );

                        adaptor.addChild(root_1, stream_fcnArgumentList.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:655:4: '.' IDENT
                    {
                    char_literal269=(Atom)match(input,126,FOLLOW_126_in_fieldAccess4034); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_126.add(char_literal269);


                    IDENT270=(Atom)match(input,IDENT,FOLLOW_IDENT_in_fieldAccess4036); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENT.add(IDENT270);


                    // AST REWRITE
                    // elements: IDENT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (BaseNode)adaptor.nil();
                    // 655:15: -> ^( E_IDENT[\"E_IDENT\", true] IDENT )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:655:18: ^( E_IDENT[\"E_IDENT\", true] IDENT )
                        {
                        BaseNode root_1 = (BaseNode)adaptor.nil();
                        root_1 = (BaseNode)adaptor.becomeRoot(
                        new ExprNode.Ident(E_IDENT, "E_IDENT", true)
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_IDENT.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (BaseNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BaseNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 76, fieldAccess_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "fieldAccess"


    public static class arrayAccess_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "arrayAccess"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:657:1: arrayAccess : '[' ( exprList )? ']' -> ^( E_INDEX ( exprList )? ) ;
    public final pollenParser.arrayAccess_return arrayAccess() throws RecognitionException {
        pollenParser.arrayAccess_return retval = new pollenParser.arrayAccess_return();
        retval.start = input.LT(1);

        int arrayAccess_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom char_literal271=null;
        Atom char_literal273=null;
        pollenParser.exprList_return exprList272 =null;


        BaseNode char_literal271_tree=null;
        BaseNode char_literal273_tree=null;
        RewriteRuleTokenStream stream_135=new RewriteRuleTokenStream(adaptor,"token 135");
        RewriteRuleTokenStream stream_136=new RewriteRuleTokenStream(adaptor,"token 136");
        RewriteRuleSubtreeStream stream_exprList=new RewriteRuleSubtreeStream(adaptor,"rule exprList");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 77) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:658:2: ( '[' ( exprList )? ']' -> ^( E_INDEX ( exprList )? ) )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:658:4: '[' ( exprList )? ']'
            {
            char_literal271=(Atom)match(input,135,FOLLOW_135_in_arrayAccess4061); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_135.add(char_literal271);


            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:658:8: ( exprList )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==136) ) {
                int LA79_1 = input.LA(2);

                if ( (synpred129_pollen()) ) {
                    alt79=1;
                }
            }
            else if ( ((LA79_0 >= BIT_NOT && LA79_0 <= CHAR)||LA79_0==DEC||LA79_0==HEX_LIT||LA79_0==IDENT||(LA79_0 >= INC && LA79_0 <= INT_LIT)||LA79_0==LOG_NOT||LA79_0==MINUS||LA79_0==NL||LA79_0==OCT_LIT||LA79_0==REAL_LIT||LA79_0==SEMI||LA79_0==STRING||(LA79_0 >= 122 && LA79_0 <= 123)||LA79_0==125||(LA79_0 >= 134 && LA79_0 <= 135)||(LA79_0 >= 139 && LA79_0 <= 149)||LA79_0==152||LA79_0==154||(LA79_0 >= 156 && LA79_0 <= 160)||(LA79_0 >= 162 && LA79_0 <= 165)||(LA79_0 >= 167 && LA79_0 <= 170)||(LA79_0 >= 173 && LA79_0 <= 180)||(LA79_0 >= 182 && LA79_0 <= 187)||LA79_0==190) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:658:9: exprList
                    {
                    pushFollow(FOLLOW_exprList_in_arrayAccess4064);
                    exprList272=exprList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_exprList.add(exprList272.getTree());

                    }
                    break;

            }


            char_literal273=(Atom)match(input,136,FOLLOW_136_in_arrayAccess4068); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_136.add(char_literal273);


            // AST REWRITE
            // elements: exprList
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (BaseNode)adaptor.nil();
            // 658:24: -> ^( E_INDEX ( exprList )? )
            {
                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:658:27: ^( E_INDEX ( exprList )? )
                {
                BaseNode root_1 = (BaseNode)adaptor.nil();
                root_1 = (BaseNode)adaptor.becomeRoot(
                (BaseNode)adaptor.create(E_INDEX, "E_INDEX")
                , root_1);

                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:658:37: ( exprList )?
                if ( stream_exprList.hasNext() ) {
                    adaptor.addChild(root_1, stream_exprList.nextTree());

                }
                stream_exprList.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (BaseNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BaseNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 77, arrayAccess_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "arrayAccess"


    public static class stmtBlock_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stmtBlock"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:662:1: stmtBlock : braceOpen stmts braceClose -> ^( S_BLOCK[\"S_BLOCK\"] stmts ) ;
    public final pollenParser.stmtBlock_return stmtBlock() throws RecognitionException {
        pollenParser.stmtBlock_return retval = new pollenParser.stmtBlock_return();
        retval.start = input.LT(1);

        int stmtBlock_StartIndex = input.index();

        BaseNode root_0 = null;

        pollenParser.braceOpen_return braceOpen274 =null;

        pollenParser.stmts_return stmts275 =null;

        pollenParser.braceClose_return braceClose276 =null;


        RewriteRuleSubtreeStream stream_stmts=new RewriteRuleSubtreeStream(adaptor,"rule stmts");
        RewriteRuleSubtreeStream stream_braceOpen=new RewriteRuleSubtreeStream(adaptor,"rule braceOpen");
        RewriteRuleSubtreeStream stream_braceClose=new RewriteRuleSubtreeStream(adaptor,"rule braceClose");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 78) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:663:2: ( braceOpen stmts braceClose -> ^( S_BLOCK[\"S_BLOCK\"] stmts ) )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:663:4: braceOpen stmts braceClose
            {
            pushFollow(FOLLOW_braceOpen_in_stmtBlock4091);
            braceOpen274=braceOpen();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_braceOpen.add(braceOpen274.getTree());

            pushFollow(FOLLOW_stmts_in_stmtBlock4093);
            stmts275=stmts();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_stmts.add(stmts275.getTree());

            pushFollow(FOLLOW_braceClose_in_stmtBlock4095);
            braceClose276=braceClose();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_braceClose.add(braceClose276.getTree());

            // AST REWRITE
            // elements: stmts
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (BaseNode)adaptor.nil();
            // 663:32: -> ^( S_BLOCK[\"S_BLOCK\"] stmts )
            {
                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:663:35: ^( S_BLOCK[\"S_BLOCK\"] stmts )
                {
                BaseNode root_1 = (BaseNode)adaptor.nil();
                root_1 = (BaseNode)adaptor.becomeRoot(
                new StmtNode.Block(S_BLOCK, "S_BLOCK")
                , root_1);

                adaptor.addChild(root_1, stream_stmts.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (BaseNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BaseNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 78, stmtBlock_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "stmtBlock"


    public static class stmts_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stmts"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:665:1: stmts : ( ( stmt )+ -> ^( LIST[\"LIST\"] ( stmt )+ ) | ( ( NL )* ) -> LIST[\"LIST\"] );
    public final pollenParser.stmts_return stmts() throws RecognitionException {
        pollenParser.stmts_return retval = new pollenParser.stmts_return();
        retval.start = input.LT(1);

        int stmts_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom NL278=null;
        pollenParser.stmt_return stmt277 =null;


        BaseNode NL278_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_stmt=new RewriteRuleSubtreeStream(adaptor,"rule stmt");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 79) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:666:2: ( ( stmt )+ -> ^( LIST[\"LIST\"] ( stmt )+ ) | ( ( NL )* ) -> LIST[\"LIST\"] )
            int alt82=2;
            switch ( input.LA(1) ) {
            case NL:
                {
                int LA82_1 = input.LA(2);

                if ( (synpred131_pollen()) ) {
                    alt82=1;
                }
                else if ( (true) ) {
                    alt82=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 82, 1, input);

                    throw nvae;

                }
                }
                break;
            case BIT_NOT:
            case CHAR:
            case DEC:
            case HEX_LIT:
            case IDENT:
            case INC:
            case INJECT:
            case INT_LIT:
            case LOG_NOT:
            case MINUS:
            case OCT_LIT:
            case REAL_LIT:
            case STRING:
            case 122:
            case 134:
            case 135:
            case 139:
            case 140:
            case 141:
            case 142:
            case 146:
            case 147:
            case 149:
            case 156:
            case 157:
            case 159:
            case 160:
            case 163:
            case 164:
            case 165:
            case 169:
            case 170:
            case 173:
            case 175:
            case 177:
            case 178:
            case 179:
            case 180:
            case 182:
            case 183:
            case 184:
            case 185:
            case 186:
            case 187:
                {
                alt82=1;
                }
                break;
            case 143:
            case 148:
            case 190:
                {
                alt82=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 82, 0, input);

                throw nvae;

            }

            switch (alt82) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:666:4: ( stmt )+
                    {
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:666:4: ( stmt )+
                    int cnt80=0;
                    loop80:
                    do {
                        int alt80=2;
                        int LA80_0 = input.LA(1);

                        if ( (LA80_0==NL) ) {
                            int LA80_1 = input.LA(2);

                            if ( (synpred130_pollen()) ) {
                                alt80=1;
                            }


                        }
                        else if ( ((LA80_0 >= BIT_NOT && LA80_0 <= CHAR)||LA80_0==DEC||LA80_0==HEX_LIT||LA80_0==IDENT||(LA80_0 >= INC && LA80_0 <= INT_LIT)||LA80_0==LOG_NOT||LA80_0==MINUS||LA80_0==OCT_LIT||LA80_0==REAL_LIT||LA80_0==STRING||LA80_0==122||(LA80_0 >= 134 && LA80_0 <= 135)||(LA80_0 >= 139 && LA80_0 <= 142)||(LA80_0 >= 146 && LA80_0 <= 147)||LA80_0==149||(LA80_0 >= 156 && LA80_0 <= 157)||(LA80_0 >= 159 && LA80_0 <= 160)||(LA80_0 >= 163 && LA80_0 <= 165)||(LA80_0 >= 169 && LA80_0 <= 170)||LA80_0==173||LA80_0==175||(LA80_0 >= 177 && LA80_0 <= 180)||(LA80_0 >= 182 && LA80_0 <= 187)) ) {
                            alt80=1;
                        }


                        switch (alt80) {
                    	case 1 :
                    	    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:666:5: stmt
                    	    {
                    	    pushFollow(FOLLOW_stmt_in_stmts4121);
                    	    stmt277=stmt();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_stmt.add(stmt277.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt80 >= 1 ) break loop80;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(80, input);
                                throw eee;
                        }
                        cnt80++;
                    } while (true);


                    // AST REWRITE
                    // elements: stmt
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (BaseNode)adaptor.nil();
                    // 666:12: -> ^( LIST[\"LIST\"] ( stmt )+ )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:666:15: ^( LIST[\"LIST\"] ( stmt )+ )
                        {
                        BaseNode root_1 = (BaseNode)adaptor.nil();
                        root_1 = (BaseNode)adaptor.becomeRoot(
                        new ListNode(LIST, "LIST")
                        , root_1);

                        if ( !(stream_stmt.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_stmt.hasNext() ) {
                            adaptor.addChild(root_1, stream_stmt.nextTree());

                        }
                        stream_stmt.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:667:4: ( ( NL )* )
                    {
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:667:4: ( ( NL )* )
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:667:5: ( NL )*
                    {
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:667:5: ( NL )*
                    loop81:
                    do {
                        int alt81=2;
                        int LA81_0 = input.LA(1);

                        if ( (LA81_0==NL) ) {
                            int LA81_1 = input.LA(2);

                            if ( (synpred132_pollen()) ) {
                                alt81=1;
                            }


                        }


                        switch (alt81) {
                    	case 1 :
                    	    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:667:5: NL
                    	    {
                    	    NL278=(Atom)match(input,NL,FOLLOW_NL_in_stmts4143); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_NL.add(NL278);


                    	    }
                    	    break;

                    	default :
                    	    break loop81;
                        }
                    } while (true);


                    }


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (BaseNode)adaptor.nil();
                    // 667:10: -> LIST[\"LIST\"]
                    {
                        adaptor.addChild(root_0, 
                        new ListNode(LIST, "LIST")
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (BaseNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BaseNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 79, stmts_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "stmts"


    public static class stmt_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stmt"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:669:1: stmt : ( varDeclaration | stmtAssign | stmtAssert | stmtBind | stmtBlock | stmtPrint | stmtReturn | stmtBreak | stmtContinue | stmtFor | stmtSwitch | stmtDoWhile | stmtIf | stmtProvided | stmtWhile | stmtInjection | expr delim );
    public final pollenParser.stmt_return stmt() throws RecognitionException {
        pollenParser.stmt_return retval = new pollenParser.stmt_return();
        retval.start = input.LT(1);

        int stmt_StartIndex = input.index();

        BaseNode root_0 = null;

        pollenParser.varDeclaration_return varDeclaration279 =null;

        pollenParser.stmtAssign_return stmtAssign280 =null;

        pollenParser.stmtAssert_return stmtAssert281 =null;

        pollenParser.stmtBind_return stmtBind282 =null;

        pollenParser.stmtBlock_return stmtBlock283 =null;

        pollenParser.stmtPrint_return stmtPrint284 =null;

        pollenParser.stmtReturn_return stmtReturn285 =null;

        pollenParser.stmtBreak_return stmtBreak286 =null;

        pollenParser.stmtContinue_return stmtContinue287 =null;

        pollenParser.stmtFor_return stmtFor288 =null;

        pollenParser.stmtSwitch_return stmtSwitch289 =null;

        pollenParser.stmtDoWhile_return stmtDoWhile290 =null;

        pollenParser.stmtIf_return stmtIf291 =null;

        pollenParser.stmtProvided_return stmtProvided292 =null;

        pollenParser.stmtWhile_return stmtWhile293 =null;

        pollenParser.stmtInjection_return stmtInjection294 =null;

        pollenParser.expr_return expr295 =null;

        pollenParser.delim_return delim296 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 80) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:670:2: ( varDeclaration | stmtAssign | stmtAssert | stmtBind | stmtBlock | stmtPrint | stmtReturn | stmtBreak | stmtContinue | stmtFor | stmtSwitch | stmtDoWhile | stmtIf | stmtProvided | stmtWhile | stmtInjection | expr delim )
            int alt83=17;
            switch ( input.LA(1) ) {
            case IDENT:
            case 169:
                {
                int LA83_1 = input.LA(2);

                if ( (synpred133_pollen()) ) {
                    alt83=1;
                }
                else if ( (synpred134_pollen()) ) {
                    alt83=2;
                }
                else if ( (synpred136_pollen()) ) {
                    alt83=4;
                }
                else if ( (true) ) {
                    alt83=17;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 83, 1, input);

                    throw nvae;

                }
                }
                break;
            case 140:
            case 142:
            case 146:
            case 159:
            case 163:
            case 164:
            case 165:
            case 178:
            case 182:
            case 183:
            case 184:
            case 185:
                {
                alt83=1;
                }
                break;
            case 134:
                {
                int LA83_7 = input.LA(2);

                if ( (synpred134_pollen()) ) {
                    alt83=2;
                }
                else if ( (synpred136_pollen()) ) {
                    alt83=4;
                }
                else if ( (true) ) {
                    alt83=17;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 83, 7, input);

                    throw nvae;

                }
                }
                break;
            case 139:
                {
                alt83=3;
                }
                break;
            case INJECT:
                {
                int LA83_9 = input.LA(2);

                if ( (synpred134_pollen()) ) {
                    alt83=2;
                }
                else if ( (synpred148_pollen()) ) {
                    alt83=16;
                }
                else if ( (true) ) {
                    alt83=17;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 83, 9, input);

                    throw nvae;

                }
                }
                break;
            case NL:
            case 187:
                {
                alt83=5;
                }
                break;
            case 173:
                {
                alt83=6;
                }
                break;
            case 177:
                {
                alt83=7;
                }
                break;
            case 141:
                {
                alt83=8;
                }
                break;
            case 147:
                {
                alt83=9;
                }
                break;
            case 157:
                {
                alt83=10;
                }
                break;
            case 179:
                {
                alt83=11;
                }
                break;
            case 149:
                {
                alt83=12;
                }
                break;
            case 160:
                {
                alt83=13;
                }
                break;
            case 175:
                {
                alt83=14;
                }
                break;
            case 186:
                {
                alt83=15;
                }
                break;
            case BIT_NOT:
            case CHAR:
            case DEC:
            case HEX_LIT:
            case INC:
            case INT_LIT:
            case LOG_NOT:
            case MINUS:
            case OCT_LIT:
            case REAL_LIT:
            case STRING:
            case 122:
            case 135:
            case 156:
            case 170:
            case 180:
                {
                alt83=17;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 83, 0, input);

                throw nvae;

            }

            switch (alt83) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:670:5: varDeclaration
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    pushFollow(FOLLOW_varDeclaration_in_stmt4164);
                    varDeclaration279=varDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDeclaration279.getTree());

                    }
                    break;
                case 2 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:671:5: stmtAssign
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    pushFollow(FOLLOW_stmtAssign_in_stmt4171);
                    stmtAssign280=stmtAssign();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmtAssign280.getTree());

                    }
                    break;
                case 3 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:672:4: stmtAssert
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    pushFollow(FOLLOW_stmtAssert_in_stmt4176);
                    stmtAssert281=stmtAssert();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmtAssert281.getTree());

                    }
                    break;
                case 4 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:673:4: stmtBind
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    pushFollow(FOLLOW_stmtBind_in_stmt4181);
                    stmtBind282=stmtBind();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmtBind282.getTree());

                    }
                    break;
                case 5 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:674:4: stmtBlock
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    pushFollow(FOLLOW_stmtBlock_in_stmt4186);
                    stmtBlock283=stmtBlock();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmtBlock283.getTree());

                    }
                    break;
                case 6 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:675:4: stmtPrint
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    pushFollow(FOLLOW_stmtPrint_in_stmt4191);
                    stmtPrint284=stmtPrint();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmtPrint284.getTree());

                    }
                    break;
                case 7 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:676:4: stmtReturn
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    pushFollow(FOLLOW_stmtReturn_in_stmt4196);
                    stmtReturn285=stmtReturn();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmtReturn285.getTree());

                    }
                    break;
                case 8 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:677:4: stmtBreak
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    pushFollow(FOLLOW_stmtBreak_in_stmt4201);
                    stmtBreak286=stmtBreak();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmtBreak286.getTree());

                    }
                    break;
                case 9 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:678:5: stmtContinue
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    pushFollow(FOLLOW_stmtContinue_in_stmt4207);
                    stmtContinue287=stmtContinue();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmtContinue287.getTree());

                    }
                    break;
                case 10 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:679:5: stmtFor
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    pushFollow(FOLLOW_stmtFor_in_stmt4213);
                    stmtFor288=stmtFor();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmtFor288.getTree());

                    }
                    break;
                case 11 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:680:4: stmtSwitch
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    pushFollow(FOLLOW_stmtSwitch_in_stmt4218);
                    stmtSwitch289=stmtSwitch();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmtSwitch289.getTree());

                    }
                    break;
                case 12 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:681:5: stmtDoWhile
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    pushFollow(FOLLOW_stmtDoWhile_in_stmt4224);
                    stmtDoWhile290=stmtDoWhile();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmtDoWhile290.getTree());

                    }
                    break;
                case 13 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:682:4: stmtIf
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    pushFollow(FOLLOW_stmtIf_in_stmt4229);
                    stmtIf291=stmtIf();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmtIf291.getTree());

                    }
                    break;
                case 14 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:683:4: stmtProvided
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    pushFollow(FOLLOW_stmtProvided_in_stmt4234);
                    stmtProvided292=stmtProvided();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmtProvided292.getTree());

                    }
                    break;
                case 15 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:684:4: stmtWhile
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    pushFollow(FOLLOW_stmtWhile_in_stmt4239);
                    stmtWhile293=stmtWhile();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmtWhile293.getTree());

                    }
                    break;
                case 16 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:685:4: stmtInjection
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    pushFollow(FOLLOW_stmtInjection_in_stmt4245);
                    stmtInjection294=stmtInjection();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmtInjection294.getTree());

                    }
                    break;
                case 17 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:686:4: expr delim
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    pushFollow(FOLLOW_expr_in_stmt4250);
                    expr295=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr295.getTree());

                    pushFollow(FOLLOW_delim_in_stmt4252);
                    delim296=delim();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, delim296.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (BaseNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BaseNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 80, stmt_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "stmt"


    public static class stmtAssign_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stmtAssign"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:688:1: stmtAssign : ( varOrFcnOrArray ASSIGN expr delim -> ^( S_ASSIGN[\"S_ASSIGN\"] ^( E_BINARY[\"E_BINARY\", true] ASSIGN varOrFcnOrArray expr ) ) | injectionCode ASSIGN expr delim -> ^( S_ASSIGN[\"S_ASSIGN\"] ^( E_BINARY[\"E_BINARY\", true] ASSIGN injectionCode expr ) ) | varOrFcnOrArray assignOp expr delim -> ^( S_ASSIGN[\"S_ASSIGN\"] ^( E_BINARY[\"E_BINARY\", true] assignOp varOrFcnOrArray expr ) ) | injectionCode assignOp expr delim -> ^( S_ASSIGN[\"S_ASSIGN\"] ^( E_BINARY[\"E_BINARY\", true] assignOp injectionCode expr ) ) );
    public final pollenParser.stmtAssign_return stmtAssign() throws RecognitionException {
        pollenParser.stmtAssign_return retval = new pollenParser.stmtAssign_return();
        retval.start = input.LT(1);

        int stmtAssign_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom ASSIGN298=null;
        Atom ASSIGN302=null;
        pollenParser.varOrFcnOrArray_return varOrFcnOrArray297 =null;

        pollenParser.expr_return expr299 =null;

        pollenParser.delim_return delim300 =null;

        pollenParser.injectionCode_return injectionCode301 =null;

        pollenParser.expr_return expr303 =null;

        pollenParser.delim_return delim304 =null;

        pollenParser.varOrFcnOrArray_return varOrFcnOrArray305 =null;

        pollenParser.assignOp_return assignOp306 =null;

        pollenParser.expr_return expr307 =null;

        pollenParser.delim_return delim308 =null;

        pollenParser.injectionCode_return injectionCode309 =null;

        pollenParser.assignOp_return assignOp310 =null;

        pollenParser.expr_return expr311 =null;

        pollenParser.delim_return delim312 =null;


        BaseNode ASSIGN298_tree=null;
        BaseNode ASSIGN302_tree=null;
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
        RewriteRuleSubtreeStream stream_assignOp=new RewriteRuleSubtreeStream(adaptor,"rule assignOp");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_injectionCode=new RewriteRuleSubtreeStream(adaptor,"rule injectionCode");
        RewriteRuleSubtreeStream stream_varOrFcnOrArray=new RewriteRuleSubtreeStream(adaptor,"rule varOrFcnOrArray");
        RewriteRuleSubtreeStream stream_delim=new RewriteRuleSubtreeStream(adaptor,"rule delim");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 81) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:689:2: ( varOrFcnOrArray ASSIGN expr delim -> ^( S_ASSIGN[\"S_ASSIGN\"] ^( E_BINARY[\"E_BINARY\", true] ASSIGN varOrFcnOrArray expr ) ) | injectionCode ASSIGN expr delim -> ^( S_ASSIGN[\"S_ASSIGN\"] ^( E_BINARY[\"E_BINARY\", true] ASSIGN injectionCode expr ) ) | varOrFcnOrArray assignOp expr delim -> ^( S_ASSIGN[\"S_ASSIGN\"] ^( E_BINARY[\"E_BINARY\", true] assignOp varOrFcnOrArray expr ) ) | injectionCode assignOp expr delim -> ^( S_ASSIGN[\"S_ASSIGN\"] ^( E_BINARY[\"E_BINARY\", true] assignOp injectionCode expr ) ) )
            int alt84=4;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==IDENT||LA84_0==134||LA84_0==169) ) {
                int LA84_1 = input.LA(2);

                if ( (synpred149_pollen()) ) {
                    alt84=1;
                }
                else if ( (synpred151_pollen()) ) {
                    alt84=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 84, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA84_0==INJECT) ) {
                int LA84_4 = input.LA(2);

                if ( (synpred150_pollen()) ) {
                    alt84=2;
                }
                else if ( (true) ) {
                    alt84=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 84, 4, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 84, 0, input);

                throw nvae;

            }
            switch (alt84) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:689:4: varOrFcnOrArray ASSIGN expr delim
                    {
                    pushFollow(FOLLOW_varOrFcnOrArray_in_stmtAssign4262);
                    varOrFcnOrArray297=varOrFcnOrArray();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_varOrFcnOrArray.add(varOrFcnOrArray297.getTree());

                    ASSIGN298=(Atom)match(input,ASSIGN,FOLLOW_ASSIGN_in_stmtAssign4264); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ASSIGN.add(ASSIGN298);


                    pushFollow(FOLLOW_expr_in_stmtAssign4266);
                    expr299=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr299.getTree());

                    pushFollow(FOLLOW_delim_in_stmtAssign4268);
                    delim300=delim();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_delim.add(delim300.getTree());

                    // AST REWRITE
                    // elements: varOrFcnOrArray, expr, ASSIGN
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (BaseNode)adaptor.nil();
                    // 690:3: -> ^( S_ASSIGN[\"S_ASSIGN\"] ^( E_BINARY[\"E_BINARY\", true] ASSIGN varOrFcnOrArray expr ) )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:690:6: ^( S_ASSIGN[\"S_ASSIGN\"] ^( E_BINARY[\"E_BINARY\", true] ASSIGN varOrFcnOrArray expr ) )
                        {
                        BaseNode root_1 = (BaseNode)adaptor.nil();
                        root_1 = (BaseNode)adaptor.becomeRoot(
                        new StmtNode.Assign(S_ASSIGN, "S_ASSIGN")
                        , root_1);

                        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:690:46: ^( E_BINARY[\"E_BINARY\", true] ASSIGN varOrFcnOrArray expr )
                        {
                        BaseNode root_2 = (BaseNode)adaptor.nil();
                        root_2 = (BaseNode)adaptor.becomeRoot(
                        new ExprNode.Binary(E_BINARY, "E_BINARY", true)
                        , root_2);

                        adaptor.addChild(root_2, 
                        stream_ASSIGN.nextNode()
                        );

                        adaptor.addChild(root_2, stream_varOrFcnOrArray.nextTree());

                        adaptor.addChild(root_2, stream_expr.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:691:4: injectionCode ASSIGN expr delim
                    {
                    pushFollow(FOLLOW_injectionCode_in_stmtAssign4303);
                    injectionCode301=injectionCode();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_injectionCode.add(injectionCode301.getTree());

                    ASSIGN302=(Atom)match(input,ASSIGN,FOLLOW_ASSIGN_in_stmtAssign4305); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ASSIGN.add(ASSIGN302);


                    pushFollow(FOLLOW_expr_in_stmtAssign4307);
                    expr303=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr303.getTree());

                    pushFollow(FOLLOW_delim_in_stmtAssign4310);
                    delim304=delim();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_delim.add(delim304.getTree());

                    // AST REWRITE
                    // elements: ASSIGN, expr, injectionCode
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (BaseNode)adaptor.nil();
                    // 692:3: -> ^( S_ASSIGN[\"S_ASSIGN\"] ^( E_BINARY[\"E_BINARY\", true] ASSIGN injectionCode expr ) )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:692:6: ^( S_ASSIGN[\"S_ASSIGN\"] ^( E_BINARY[\"E_BINARY\", true] ASSIGN injectionCode expr ) )
                        {
                        BaseNode root_1 = (BaseNode)adaptor.nil();
                        root_1 = (BaseNode)adaptor.becomeRoot(
                        new StmtNode.Assign(S_ASSIGN, "S_ASSIGN")
                        , root_1);

                        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:692:46: ^( E_BINARY[\"E_BINARY\", true] ASSIGN injectionCode expr )
                        {
                        BaseNode root_2 = (BaseNode)adaptor.nil();
                        root_2 = (BaseNode)adaptor.becomeRoot(
                        new ExprNode.Binary(E_BINARY, "E_BINARY", true)
                        , root_2);

                        adaptor.addChild(root_2, 
                        stream_ASSIGN.nextNode()
                        );

                        adaptor.addChild(root_2, stream_injectionCode.nextTree());

                        adaptor.addChild(root_2, stream_expr.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 3 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:693:4: varOrFcnOrArray assignOp expr delim
                    {
                    pushFollow(FOLLOW_varOrFcnOrArray_in_stmtAssign4345);
                    varOrFcnOrArray305=varOrFcnOrArray();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_varOrFcnOrArray.add(varOrFcnOrArray305.getTree());

                    pushFollow(FOLLOW_assignOp_in_stmtAssign4347);
                    assignOp306=assignOp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_assignOp.add(assignOp306.getTree());

                    pushFollow(FOLLOW_expr_in_stmtAssign4349);
                    expr307=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr307.getTree());

                    pushFollow(FOLLOW_delim_in_stmtAssign4352);
                    delim308=delim();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_delim.add(delim308.getTree());

                    // AST REWRITE
                    // elements: varOrFcnOrArray, expr, assignOp
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (BaseNode)adaptor.nil();
                    // 694:3: -> ^( S_ASSIGN[\"S_ASSIGN\"] ^( E_BINARY[\"E_BINARY\", true] assignOp varOrFcnOrArray expr ) )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:694:6: ^( S_ASSIGN[\"S_ASSIGN\"] ^( E_BINARY[\"E_BINARY\", true] assignOp varOrFcnOrArray expr ) )
                        {
                        BaseNode root_1 = (BaseNode)adaptor.nil();
                        root_1 = (BaseNode)adaptor.becomeRoot(
                        new StmtNode.Assign(S_ASSIGN, "S_ASSIGN")
                        , root_1);

                        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:694:46: ^( E_BINARY[\"E_BINARY\", true] assignOp varOrFcnOrArray expr )
                        {
                        BaseNode root_2 = (BaseNode)adaptor.nil();
                        root_2 = (BaseNode)adaptor.becomeRoot(
                        new ExprNode.Binary(E_BINARY, "E_BINARY", true)
                        , root_2);

                        adaptor.addChild(root_2, stream_assignOp.nextTree());

                        adaptor.addChild(root_2, stream_varOrFcnOrArray.nextTree());

                        adaptor.addChild(root_2, stream_expr.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 4 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:695:4: injectionCode assignOp expr delim
                    {
                    pushFollow(FOLLOW_injectionCode_in_stmtAssign4387);
                    injectionCode309=injectionCode();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_injectionCode.add(injectionCode309.getTree());

                    pushFollow(FOLLOW_assignOp_in_stmtAssign4389);
                    assignOp310=assignOp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_assignOp.add(assignOp310.getTree());

                    pushFollow(FOLLOW_expr_in_stmtAssign4391);
                    expr311=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr311.getTree());

                    pushFollow(FOLLOW_delim_in_stmtAssign4393);
                    delim312=delim();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_delim.add(delim312.getTree());

                    // AST REWRITE
                    // elements: injectionCode, expr, assignOp
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (BaseNode)adaptor.nil();
                    // 696:3: -> ^( S_ASSIGN[\"S_ASSIGN\"] ^( E_BINARY[\"E_BINARY\", true] assignOp injectionCode expr ) )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:696:6: ^( S_ASSIGN[\"S_ASSIGN\"] ^( E_BINARY[\"E_BINARY\", true] assignOp injectionCode expr ) )
                        {
                        BaseNode root_1 = (BaseNode)adaptor.nil();
                        root_1 = (BaseNode)adaptor.becomeRoot(
                        new StmtNode.Assign(S_ASSIGN, "S_ASSIGN")
                        , root_1);

                        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:696:46: ^( E_BINARY[\"E_BINARY\", true] assignOp injectionCode expr )
                        {
                        BaseNode root_2 = (BaseNode)adaptor.nil();
                        root_2 = (BaseNode)adaptor.becomeRoot(
                        new ExprNode.Binary(E_BINARY, "E_BINARY", true)
                        , root_2);

                        adaptor.addChild(root_2, stream_assignOp.nextTree());

                        adaptor.addChild(root_2, stream_injectionCode.nextTree());

                        adaptor.addChild(root_2, stream_expr.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (BaseNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BaseNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 81, stmtAssign_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "stmtAssign"


    public static class stmtAssert_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stmtAssert"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:698:1: stmtAssert : 'assert' exprList delim -> ^( S_ASSERT exprList ) ;
    public final pollenParser.stmtAssert_return stmtAssert() throws RecognitionException {
        pollenParser.stmtAssert_return retval = new pollenParser.stmtAssert_return();
        retval.start = input.LT(1);

        int stmtAssert_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom string_literal313=null;
        pollenParser.exprList_return exprList314 =null;

        pollenParser.delim_return delim315 =null;


        BaseNode string_literal313_tree=null;
        RewriteRuleTokenStream stream_139=new RewriteRuleTokenStream(adaptor,"token 139");
        RewriteRuleSubtreeStream stream_delim=new RewriteRuleSubtreeStream(adaptor,"rule delim");
        RewriteRuleSubtreeStream stream_exprList=new RewriteRuleSubtreeStream(adaptor,"rule exprList");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 82) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:699:2: ( 'assert' exprList delim -> ^( S_ASSERT exprList ) )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:699:4: 'assert' exprList delim
            {
            string_literal313=(Atom)match(input,139,FOLLOW_139_in_stmtAssert4433); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_139.add(string_literal313);


            pushFollow(FOLLOW_exprList_in_stmtAssert4435);
            exprList314=exprList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_exprList.add(exprList314.getTree());

            pushFollow(FOLLOW_delim_in_stmtAssert4437);
            delim315=delim();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_delim.add(delim315.getTree());

            // AST REWRITE
            // elements: exprList
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (BaseNode)adaptor.nil();
            // 699:28: -> ^( S_ASSERT exprList )
            {
                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:699:31: ^( S_ASSERT exprList )
                {
                BaseNode root_1 = (BaseNode)adaptor.nil();
                root_1 = (BaseNode)adaptor.becomeRoot(
                (BaseNode)adaptor.create(S_ASSERT, "S_ASSERT")
                , root_1);

                adaptor.addChild(root_1, stream_exprList.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (BaseNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BaseNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 82, stmtAssert_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "stmtAssert"


    public static class stmtBind_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stmtBind"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:701:1: stmtBind : varOrFcnOrArray BIND expr delim -> ^( S_BIND[\"S_BIND\"] varOrFcnOrArray expr ) ;
    public final pollenParser.stmtBind_return stmtBind() throws RecognitionException {
        pollenParser.stmtBind_return retval = new pollenParser.stmtBind_return();
        retval.start = input.LT(1);

        int stmtBind_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom BIND317=null;
        pollenParser.varOrFcnOrArray_return varOrFcnOrArray316 =null;

        pollenParser.expr_return expr318 =null;

        pollenParser.delim_return delim319 =null;


        BaseNode BIND317_tree=null;
        RewriteRuleTokenStream stream_BIND=new RewriteRuleTokenStream(adaptor,"token BIND");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_varOrFcnOrArray=new RewriteRuleSubtreeStream(adaptor,"rule varOrFcnOrArray");
        RewriteRuleSubtreeStream stream_delim=new RewriteRuleSubtreeStream(adaptor,"rule delim");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 83) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:702:2: ( varOrFcnOrArray BIND expr delim -> ^( S_BIND[\"S_BIND\"] varOrFcnOrArray expr ) )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:702:4: varOrFcnOrArray BIND expr delim
            {
            pushFollow(FOLLOW_varOrFcnOrArray_in_stmtBind4455);
            varOrFcnOrArray316=varOrFcnOrArray();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_varOrFcnOrArray.add(varOrFcnOrArray316.getTree());

            BIND317=(Atom)match(input,BIND,FOLLOW_BIND_in_stmtBind4457); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_BIND.add(BIND317);


            pushFollow(FOLLOW_expr_in_stmtBind4460);
            expr318=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr318.getTree());

            pushFollow(FOLLOW_delim_in_stmtBind4463);
            delim319=delim();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_delim.add(delim319.getTree());

            // AST REWRITE
            // elements: varOrFcnOrArray, expr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (BaseNode)adaptor.nil();
            // 702:38: -> ^( S_BIND[\"S_BIND\"] varOrFcnOrArray expr )
            {
                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:702:41: ^( S_BIND[\"S_BIND\"] varOrFcnOrArray expr )
                {
                BaseNode root_1 = (BaseNode)adaptor.nil();
                root_1 = (BaseNode)adaptor.becomeRoot(
                new StmtNode.Bind(S_BIND, "S_BIND")
                , root_1);

                adaptor.addChild(root_1, stream_varOrFcnOrArray.nextTree());

                adaptor.addChild(root_1, stream_expr.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (BaseNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BaseNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 83, stmtBind_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "stmtBind"


    public static class stmtPrint_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stmtPrint"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:704:1: stmtPrint : 'print' ( stmtPrintTarget[flags] )? exprList -> ^( S_PRINT[\"S_PRINT\", flags] exprList ) ;
    public final pollenParser.stmtPrint_return stmtPrint() throws RecognitionException {
        pollenParser.stmtPrint_return retval = new pollenParser.stmtPrint_return();
        retval.start = input.LT(1);

        int stmtPrint_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom string_literal320=null;
        pollenParser.stmtPrintTarget_return stmtPrintTarget321 =null;

        pollenParser.exprList_return exprList322 =null;


        BaseNode string_literal320_tree=null;
        RewriteRuleTokenStream stream_173=new RewriteRuleTokenStream(adaptor,"token 173");
        RewriteRuleSubtreeStream stream_stmtPrintTarget=new RewriteRuleSubtreeStream(adaptor,"rule stmtPrintTarget");
        RewriteRuleSubtreeStream stream_exprList=new RewriteRuleSubtreeStream(adaptor,"rule exprList");

        	EnumSet<Flags> flags = EnumSet.noneOf(Flags.class);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 84) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:708:2: ( 'print' ( stmtPrintTarget[flags] )? exprList -> ^( S_PRINT[\"S_PRINT\", flags] exprList ) )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:708:4: 'print' ( stmtPrintTarget[flags] )? exprList
            {
            string_literal320=(Atom)match(input,173,FOLLOW_173_in_stmtPrint4496); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_173.add(string_literal320);


            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:708:12: ( stmtPrintTarget[flags] )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==153||LA85_0==166||LA85_0==171) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:708:13: stmtPrintTarget[flags]
                    {
                    pushFollow(FOLLOW_stmtPrintTarget_in_stmtPrint4499);
                    stmtPrintTarget321=stmtPrintTarget(flags);

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_stmtPrintTarget.add(stmtPrintTarget321.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_exprList_in_stmtPrint4504);
            exprList322=exprList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_exprList.add(exprList322.getTree());

            // AST REWRITE
            // elements: exprList
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (BaseNode)adaptor.nil();
            // 709:3: -> ^( S_PRINT[\"S_PRINT\", flags] exprList )
            {
                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:709:6: ^( S_PRINT[\"S_PRINT\", flags] exprList )
                {
                BaseNode root_1 = (BaseNode)adaptor.nil();
                root_1 = (BaseNode)adaptor.becomeRoot(
                new StmtNode.Print(S_PRINT, "S_PRINT", flags)
                , root_1);

                adaptor.addChild(root_1, stream_exprList.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (BaseNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BaseNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 84, stmtPrint_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "stmtPrint"


    public static class stmtPrintTarget_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stmtPrintTarget"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:711:1: stmtPrintTarget[EnumSet<Flags> f] : ( 'log' | 'err' | 'out' ) ;
    public final pollenParser.stmtPrintTarget_return stmtPrintTarget(EnumSet<Flags> f) throws RecognitionException {
        pollenParser.stmtPrintTarget_return retval = new pollenParser.stmtPrintTarget_return();
        retval.start = input.LT(1);

        int stmtPrintTarget_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom string_literal323=null;
        Atom string_literal324=null;
        Atom string_literal325=null;

        BaseNode string_literal323_tree=null;
        BaseNode string_literal324_tree=null;
        BaseNode string_literal325_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 85) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:712:2: ( ( 'log' | 'err' | 'out' ) )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:713:3: ( 'log' | 'err' | 'out' )
            {
            root_0 = (BaseNode)adaptor.nil();


            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:713:3: ( 'log' | 'err' | 'out' )
            int alt86=3;
            switch ( input.LA(1) ) {
            case 166:
                {
                alt86=1;
                }
                break;
            case 153:
                {
                alt86=2;
                }
                break;
            case 171:
                {
                alt86=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 86, 0, input);

                throw nvae;

            }

            switch (alt86) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:713:7: 'log'
                    {
                    string_literal323=(Atom)match(input,166,FOLLOW_166_in_stmtPrintTarget4539); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal323_tree = 
                    (BaseNode)adaptor.create(string_literal323)
                    ;
                    adaptor.addChild(root_0, string_literal323_tree);
                    }

                    if ( state.backtracking==0 ) {f.add(Flags.LOG); }

                    }
                    break;
                case 2 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:714:6: 'err'
                    {
                    string_literal324=(Atom)match(input,153,FOLLOW_153_in_stmtPrintTarget4549); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal324_tree = 
                    (BaseNode)adaptor.create(string_literal324)
                    ;
                    adaptor.addChild(root_0, string_literal324_tree);
                    }

                    if ( state.backtracking==0 ) {f.add(Flags.ERR); }

                    }
                    break;
                case 3 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:715:6: 'out'
                    {
                    string_literal325=(Atom)match(input,171,FOLLOW_171_in_stmtPrintTarget4558); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal325_tree = 
                    (BaseNode)adaptor.create(string_literal325)
                    ;
                    adaptor.addChild(root_0, string_literal325_tree);
                    }

                    if ( state.backtracking==0 ) {f.add(Flags.OUT); }

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (BaseNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BaseNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 85, stmtPrintTarget_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "stmtPrintTarget"


    public static class stmtReturn_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stmtReturn"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:718:1: stmtReturn : ( 'return' ( '(' ) ( expr ( ',' expr )+ ) ( ')' ) delim -> ^( S_RETURN[\"S_RETURN\"] ^( LIST[\"LIST\"] ( expr )+ ) ) | 'return' ( expr ) delim -> ^( S_RETURN[\"S_RETURN\"] ^( LIST[\"LIST\"] expr ) ) );
    public final pollenParser.stmtReturn_return stmtReturn() throws RecognitionException {
        pollenParser.stmtReturn_return retval = new pollenParser.stmtReturn_return();
        retval.start = input.LT(1);

        int stmtReturn_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom string_literal326=null;
        Atom char_literal327=null;
        Atom char_literal329=null;
        Atom char_literal331=null;
        Atom string_literal333=null;
        pollenParser.expr_return expr328 =null;

        pollenParser.expr_return expr330 =null;

        pollenParser.delim_return delim332 =null;

        pollenParser.expr_return expr334 =null;

        pollenParser.delim_return delim335 =null;


        BaseNode string_literal326_tree=null;
        BaseNode char_literal327_tree=null;
        BaseNode char_literal329_tree=null;
        BaseNode char_literal331_tree=null;
        BaseNode string_literal333_tree=null;
        RewriteRuleTokenStream stream_125=new RewriteRuleTokenStream(adaptor,"token 125");
        RewriteRuleTokenStream stream_122=new RewriteRuleTokenStream(adaptor,"token 122");
        RewriteRuleTokenStream stream_123=new RewriteRuleTokenStream(adaptor,"token 123");
        RewriteRuleTokenStream stream_177=new RewriteRuleTokenStream(adaptor,"token 177");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_delim=new RewriteRuleSubtreeStream(adaptor,"rule delim");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 86) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:721:2: ( 'return' ( '(' ) ( expr ( ',' expr )+ ) ( ')' ) delim -> ^( S_RETURN[\"S_RETURN\"] ^( LIST[\"LIST\"] ( expr )+ ) ) | 'return' ( expr ) delim -> ^( S_RETURN[\"S_RETURN\"] ^( LIST[\"LIST\"] expr ) ) )
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==177) ) {
                int LA88_1 = input.LA(2);

                if ( (synpred156_pollen()) ) {
                    alt88=1;
                }
                else if ( (true) ) {
                    alt88=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 88, 1, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 88, 0, input);

                throw nvae;

            }
            switch (alt88) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:721:4: 'return' ( '(' ) ( expr ( ',' expr )+ ) ( ')' ) delim
                    {
                    string_literal326=(Atom)match(input,177,FOLLOW_177_in_stmtReturn4577); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_177.add(string_literal326);


                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:721:13: ( '(' )
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:721:14: '('
                    {
                    char_literal327=(Atom)match(input,122,FOLLOW_122_in_stmtReturn4580); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_122.add(char_literal327);


                    }


                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:721:19: ( expr ( ',' expr )+ )
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:721:20: expr ( ',' expr )+
                    {
                    pushFollow(FOLLOW_expr_in_stmtReturn4584);
                    expr328=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr328.getTree());

                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:721:25: ( ',' expr )+
                    int cnt87=0;
                    loop87:
                    do {
                        int alt87=2;
                        int LA87_0 = input.LA(1);

                        if ( (LA87_0==125) ) {
                            alt87=1;
                        }


                        switch (alt87) {
                    	case 1 :
                    	    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:721:26: ',' expr
                    	    {
                    	    char_literal329=(Atom)match(input,125,FOLLOW_125_in_stmtReturn4587); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_125.add(char_literal329);


                    	    pushFollow(FOLLOW_expr_in_stmtReturn4589);
                    	    expr330=expr();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_expr.add(expr330.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt87 >= 1 ) break loop87;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(87, input);
                                throw eee;
                        }
                        cnt87++;
                    } while (true);


                    }


                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:721:38: ( ')' )
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:721:39: ')'
                    {
                    char_literal331=(Atom)match(input,123,FOLLOW_123_in_stmtReturn4595); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_123.add(char_literal331);


                    }


                    pushFollow(FOLLOW_delim_in_stmtReturn4598);
                    delim332=delim();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_delim.add(delim332.getTree());

                    // AST REWRITE
                    // elements: expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (BaseNode)adaptor.nil();
                    // 721:50: -> ^( S_RETURN[\"S_RETURN\"] ^( LIST[\"LIST\"] ( expr )+ ) )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:721:53: ^( S_RETURN[\"S_RETURN\"] ^( LIST[\"LIST\"] ( expr )+ ) )
                        {
                        BaseNode root_1 = (BaseNode)adaptor.nil();
                        root_1 = (BaseNode)adaptor.becomeRoot(
                        new ExprNode.Vec(S_RETURN, "S_RETURN")
                        , root_1);

                        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:721:90: ^( LIST[\"LIST\"] ( expr )+ )
                        {
                        BaseNode root_2 = (BaseNode)adaptor.nil();
                        root_2 = (BaseNode)adaptor.becomeRoot(
                        new ListNode(LIST, "LIST")
                        , root_2);

                        if ( !(stream_expr.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_expr.hasNext() ) {
                            adaptor.addChild(root_2, stream_expr.nextTree());

                        }
                        stream_expr.reset();

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:722:4: 'return' ( expr ) delim
                    {
                    string_literal333=(Atom)match(input,177,FOLLOW_177_in_stmtReturn4626); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_177.add(string_literal333);


                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:722:14: ( expr )
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:722:15: expr
                    {
                    pushFollow(FOLLOW_expr_in_stmtReturn4630);
                    expr334=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr334.getTree());

                    }


                    pushFollow(FOLLOW_delim_in_stmtReturn4634);
                    delim335=delim();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_delim.add(delim335.getTree());

                    // AST REWRITE
                    // elements: expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (BaseNode)adaptor.nil();
                    // 722:28: -> ^( S_RETURN[\"S_RETURN\"] ^( LIST[\"LIST\"] expr ) )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:722:31: ^( S_RETURN[\"S_RETURN\"] ^( LIST[\"LIST\"] expr ) )
                        {
                        BaseNode root_1 = (BaseNode)adaptor.nil();
                        root_1 = (BaseNode)adaptor.becomeRoot(
                        new ExprNode.Vec(S_RETURN, "S_RETURN")
                        , root_1);

                        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:722:68: ^( LIST[\"LIST\"] expr )
                        {
                        BaseNode root_2 = (BaseNode)adaptor.nil();
                        root_2 = (BaseNode)adaptor.becomeRoot(
                        new ListNode(LIST, "LIST")
                        , root_2);

                        adaptor.addChild(root_2, stream_expr.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (BaseNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BaseNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 86, stmtReturn_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "stmtReturn"


    public static class stmtBreak_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stmtBreak"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:724:1: stmtBreak : 'break' delim -> ^( S_BREAK[\"S_BREAK\"] ) ;
    public final pollenParser.stmtBreak_return stmtBreak() throws RecognitionException {
        pollenParser.stmtBreak_return retval = new pollenParser.stmtBreak_return();
        retval.start = input.LT(1);

        int stmtBreak_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom string_literal336=null;
        pollenParser.delim_return delim337 =null;


        BaseNode string_literal336_tree=null;
        RewriteRuleTokenStream stream_141=new RewriteRuleTokenStream(adaptor,"token 141");
        RewriteRuleSubtreeStream stream_delim=new RewriteRuleSubtreeStream(adaptor,"rule delim");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 87) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:725:2: ( 'break' delim -> ^( S_BREAK[\"S_BREAK\"] ) )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:725:4: 'break' delim
            {
            string_literal336=(Atom)match(input,141,FOLLOW_141_in_stmtBreak4666); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_141.add(string_literal336);


            pushFollow(FOLLOW_delim_in_stmtBreak4668);
            delim337=delim();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_delim.add(delim337.getTree());

            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (BaseNode)adaptor.nil();
            // 725:18: -> ^( S_BREAK[\"S_BREAK\"] )
            {
                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:725:21: ^( S_BREAK[\"S_BREAK\"] )
                {
                BaseNode root_1 = (BaseNode)adaptor.nil();
                root_1 = (BaseNode)adaptor.becomeRoot(
                new StmtNode.Break(S_BREAK, "S_BREAK")
                , root_1);

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (BaseNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BaseNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 87, stmtBreak_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "stmtBreak"


    public static class stmtContinue_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stmtContinue"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:727:1: stmtContinue : 'continue' delim -> ^( S_CONTINUE[\"S_CONTINUE\"] ) ;
    public final pollenParser.stmtContinue_return stmtContinue() throws RecognitionException {
        pollenParser.stmtContinue_return retval = new pollenParser.stmtContinue_return();
        retval.start = input.LT(1);

        int stmtContinue_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom string_literal338=null;
        pollenParser.delim_return delim339 =null;


        BaseNode string_literal338_tree=null;
        RewriteRuleTokenStream stream_147=new RewriteRuleTokenStream(adaptor,"token 147");
        RewriteRuleSubtreeStream stream_delim=new RewriteRuleSubtreeStream(adaptor,"rule delim");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 88) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:728:2: ( 'continue' delim -> ^( S_CONTINUE[\"S_CONTINUE\"] ) )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:728:4: 'continue' delim
            {
            string_literal338=(Atom)match(input,147,FOLLOW_147_in_stmtContinue4690); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_147.add(string_literal338);


            pushFollow(FOLLOW_delim_in_stmtContinue4692);
            delim339=delim();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_delim.add(delim339.getTree());

            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (BaseNode)adaptor.nil();
            // 728:21: -> ^( S_CONTINUE[\"S_CONTINUE\"] )
            {
                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:728:24: ^( S_CONTINUE[\"S_CONTINUE\"] )
                {
                BaseNode root_1 = (BaseNode)adaptor.nil();
                root_1 = (BaseNode)adaptor.becomeRoot(
                new StmtNode.Continue(S_CONTINUE, "S_CONTINUE")
                , root_1);

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (BaseNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BaseNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 88, stmtContinue_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "stmtContinue"


    public static class stmtFor_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stmtFor"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:730:1: stmtFor : 'for' '(' stmtForInit stmtForCond stmtForNext ')' stmtBlock -> ^( S_FOR[\"S_FOR\"] stmtForInit stmtForCond stmtForNext stmtBlock ) ;
    public final pollenParser.stmtFor_return stmtFor() throws RecognitionException {
        pollenParser.stmtFor_return retval = new pollenParser.stmtFor_return();
        retval.start = input.LT(1);

        int stmtFor_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom string_literal340=null;
        Atom char_literal341=null;
        Atom char_literal345=null;
        pollenParser.stmtForInit_return stmtForInit342 =null;

        pollenParser.stmtForCond_return stmtForCond343 =null;

        pollenParser.stmtForNext_return stmtForNext344 =null;

        pollenParser.stmtBlock_return stmtBlock346 =null;


        BaseNode string_literal340_tree=null;
        BaseNode char_literal341_tree=null;
        BaseNode char_literal345_tree=null;
        RewriteRuleTokenStream stream_122=new RewriteRuleTokenStream(adaptor,"token 122");
        RewriteRuleTokenStream stream_123=new RewriteRuleTokenStream(adaptor,"token 123");
        RewriteRuleTokenStream stream_157=new RewriteRuleTokenStream(adaptor,"token 157");
        RewriteRuleSubtreeStream stream_stmtForCond=new RewriteRuleSubtreeStream(adaptor,"rule stmtForCond");
        RewriteRuleSubtreeStream stream_stmtForInit=new RewriteRuleSubtreeStream(adaptor,"rule stmtForInit");
        RewriteRuleSubtreeStream stream_stmtBlock=new RewriteRuleSubtreeStream(adaptor,"rule stmtBlock");
        RewriteRuleSubtreeStream stream_stmtForNext=new RewriteRuleSubtreeStream(adaptor,"rule stmtForNext");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 89) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:731:5: ( 'for' '(' stmtForInit stmtForCond stmtForNext ')' stmtBlock -> ^( S_FOR[\"S_FOR\"] stmtForInit stmtForCond stmtForNext stmtBlock ) )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:731:9: 'for' '(' stmtForInit stmtForCond stmtForNext ')' stmtBlock
            {
            string_literal340=(Atom)match(input,157,FOLLOW_157_in_stmtFor4719); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_157.add(string_literal340);


            char_literal341=(Atom)match(input,122,FOLLOW_122_in_stmtFor4721); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_122.add(char_literal341);


            pushFollow(FOLLOW_stmtForInit_in_stmtFor4723);
            stmtForInit342=stmtForInit();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_stmtForInit.add(stmtForInit342.getTree());

            pushFollow(FOLLOW_stmtForCond_in_stmtFor4725);
            stmtForCond343=stmtForCond();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_stmtForCond.add(stmtForCond343.getTree());

            pushFollow(FOLLOW_stmtForNext_in_stmtFor4727);
            stmtForNext344=stmtForNext();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_stmtForNext.add(stmtForNext344.getTree());

            char_literal345=(Atom)match(input,123,FOLLOW_123_in_stmtFor4729); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_123.add(char_literal345);


            pushFollow(FOLLOW_stmtBlock_in_stmtFor4731);
            stmtBlock346=stmtBlock();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_stmtBlock.add(stmtBlock346.getTree());

            // AST REWRITE
            // elements: stmtBlock, stmtForCond, stmtForNext, stmtForInit
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (BaseNode)adaptor.nil();
            // 732:13: -> ^( S_FOR[\"S_FOR\"] stmtForInit stmtForCond stmtForNext stmtBlock )
            {
                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:732:16: ^( S_FOR[\"S_FOR\"] stmtForInit stmtForCond stmtForNext stmtBlock )
                {
                BaseNode root_1 = (BaseNode)adaptor.nil();
                root_1 = (BaseNode)adaptor.becomeRoot(
                new StmtNode.For(S_FOR, "S_FOR")
                , root_1);

                adaptor.addChild(root_1, stream_stmtForInit.nextTree());

                adaptor.addChild(root_1, stream_stmtForCond.nextTree());

                adaptor.addChild(root_1, stream_stmtForNext.nextTree());

                adaptor.addChild(root_1, stream_stmtBlock.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (BaseNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BaseNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 89, stmtFor_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "stmtFor"


    public static class stmtForCond_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stmtForCond"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:734:1: stmtForCond : ( SEMI -> NIL | expr SEMI -> expr );
    public final pollenParser.stmtForCond_return stmtForCond() throws RecognitionException {
        pollenParser.stmtForCond_return retval = new pollenParser.stmtForCond_return();
        retval.start = input.LT(1);

        int stmtForCond_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom SEMI347=null;
        Atom SEMI349=null;
        pollenParser.expr_return expr348 =null;


        BaseNode SEMI347_tree=null;
        BaseNode SEMI349_tree=null;
        RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 90) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:735:5: ( SEMI -> NIL | expr SEMI -> expr )
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==SEMI) ) {
                alt89=1;
            }
            else if ( ((LA89_0 >= BIT_NOT && LA89_0 <= CHAR)||LA89_0==DEC||LA89_0==HEX_LIT||LA89_0==IDENT||(LA89_0 >= INC && LA89_0 <= INT_LIT)||LA89_0==LOG_NOT||LA89_0==MINUS||LA89_0==OCT_LIT||LA89_0==REAL_LIT||LA89_0==STRING||LA89_0==122||(LA89_0 >= 134 && LA89_0 <= 135)||LA89_0==156||(LA89_0 >= 169 && LA89_0 <= 170)||LA89_0==180) ) {
                alt89=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 89, 0, input);

                throw nvae;

            }
            switch (alt89) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:735:9: SEMI
                    {
                    SEMI347=(Atom)match(input,SEMI,FOLLOW_SEMI_in_stmtForCond4781); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI347);


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (BaseNode)adaptor.nil();
                    // 736:12: -> NIL
                    {
                        adaptor.addChild(root_0, 
                        (BaseNode)adaptor.create(NIL, "NIL")
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:737:9: expr SEMI
                    {
                    pushFollow(FOLLOW_expr_in_stmtForCond4806);
                    expr348=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr348.getTree());

                    SEMI349=(Atom)match(input,SEMI,FOLLOW_SEMI_in_stmtForCond4808); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI349);


                    // AST REWRITE
                    // elements: expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (BaseNode)adaptor.nil();
                    // 737:19: -> expr
                    {
                        adaptor.addChild(root_0, stream_expr.nextTree());

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (BaseNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BaseNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 90, stmtForCond_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "stmtForCond"


    public static class stmtForInit_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stmtForInit"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:740:1: stmtForInit : ( SEMI -> NIL | typeName IDENT '=' expr SEMI -> ^( S_DECL ^( typeName IDENT expr ) ) | stmtAssign );
    public final pollenParser.stmtForInit_return stmtForInit() throws RecognitionException {
        pollenParser.stmtForInit_return retval = new pollenParser.stmtForInit_return();
        retval.start = input.LT(1);

        int stmtForInit_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom SEMI350=null;
        Atom IDENT352=null;
        Atom char_literal353=null;
        Atom SEMI355=null;
        pollenParser.typeName_return typeName351 =null;

        pollenParser.expr_return expr354 =null;

        pollenParser.stmtAssign_return stmtAssign356 =null;


        BaseNode SEMI350_tree=null;
        BaseNode IDENT352_tree=null;
        BaseNode char_literal353_tree=null;
        BaseNode SEMI355_tree=null;
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
        RewriteRuleSubtreeStream stream_typeName=new RewriteRuleSubtreeStream(adaptor,"rule typeName");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 91) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:741:5: ( SEMI -> NIL | typeName IDENT '=' expr SEMI -> ^( S_DECL ^( typeName IDENT expr ) ) | stmtAssign )
            int alt90=3;
            switch ( input.LA(1) ) {
            case SEMI:
                {
                alt90=1;
                }
                break;
            case IDENT:
                {
                int LA90_2 = input.LA(2);

                if ( (synpred159_pollen()) ) {
                    alt90=2;
                }
                else if ( (true) ) {
                    alt90=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 90, 2, input);

                    throw nvae;

                }
                }
                break;
            case 140:
            case 142:
            case 163:
            case 164:
            case 165:
            case 178:
            case 182:
            case 183:
            case 184:
                {
                alt90=2;
                }
                break;
            case INJECT:
            case 134:
            case 169:
                {
                alt90=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 90, 0, input);

                throw nvae;

            }

            switch (alt90) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:741:9: SEMI
                    {
                    SEMI350=(Atom)match(input,SEMI,FOLLOW_SEMI_in_stmtForInit4831); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI350);


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (BaseNode)adaptor.nil();
                    // 742:13: -> NIL
                    {
                        adaptor.addChild(root_0, 
                        (BaseNode)adaptor.create(NIL, "NIL")
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:743:9: typeName IDENT '=' expr SEMI
                    {
                    pushFollow(FOLLOW_typeName_in_stmtForInit4857);
                    typeName351=typeName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeName.add(typeName351.getTree());

                    IDENT352=(Atom)match(input,IDENT,FOLLOW_IDENT_in_stmtForInit4859); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENT.add(IDENT352);


                    char_literal353=(Atom)match(input,ASSIGN,FOLLOW_ASSIGN_in_stmtForInit4861); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ASSIGN.add(char_literal353);


                    pushFollow(FOLLOW_expr_in_stmtForInit4863);
                    expr354=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr354.getTree());

                    SEMI355=(Atom)match(input,SEMI,FOLLOW_SEMI_in_stmtForInit4865); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI355);


                    // AST REWRITE
                    // elements: expr, IDENT, typeName
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (BaseNode)adaptor.nil();
                    // 744:13: -> ^( S_DECL ^( typeName IDENT expr ) )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:744:16: ^( S_DECL ^( typeName IDENT expr ) )
                        {
                        BaseNode root_1 = (BaseNode)adaptor.nil();
                        root_1 = (BaseNode)adaptor.becomeRoot(
                        (BaseNode)adaptor.create(S_DECL, "S_DECL")
                        , root_1);

                        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:744:25: ^( typeName IDENT expr )
                        {
                        BaseNode root_2 = (BaseNode)adaptor.nil();
                        root_2 = (BaseNode)adaptor.becomeRoot(stream_typeName.nextNode(), root_2);

                        adaptor.addChild(root_2, 
                        stream_IDENT.nextNode()
                        );

                        adaptor.addChild(root_2, stream_expr.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 3 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:745:9: stmtAssign
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    pushFollow(FOLLOW_stmtAssign_in_stmtForInit4902);
                    stmtAssign356=stmtAssign();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmtAssign356.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (BaseNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BaseNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 91, stmtForInit_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "stmtForInit"


    public static class stmtForNext_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stmtForNext"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:747:1: stmtForNext : ( -> NIL | expr );
    public final pollenParser.stmtForNext_return stmtForNext() throws RecognitionException {
        pollenParser.stmtForNext_return retval = new pollenParser.stmtForNext_return();
        retval.start = input.LT(1);

        int stmtForNext_StartIndex = input.index();

        BaseNode root_0 = null;

        pollenParser.expr_return expr357 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 92) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:748:5: ( -> NIL | expr )
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==123) ) {
                alt91=1;
            }
            else if ( ((LA91_0 >= BIT_NOT && LA91_0 <= CHAR)||LA91_0==DEC||LA91_0==HEX_LIT||LA91_0==IDENT||(LA91_0 >= INC && LA91_0 <= INT_LIT)||LA91_0==LOG_NOT||LA91_0==MINUS||LA91_0==OCT_LIT||LA91_0==REAL_LIT||LA91_0==STRING||LA91_0==122||(LA91_0 >= 134 && LA91_0 <= 135)||LA91_0==156||(LA91_0 >= 169 && LA91_0 <= 170)||LA91_0==180) ) {
                alt91=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 91, 0, input);

                throw nvae;

            }
            switch (alt91) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:749:13: 
                    {
                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (BaseNode)adaptor.nil();
                    // 749:13: -> NIL
                    {
                        adaptor.addChild(root_0, 
                        (BaseNode)adaptor.create(NIL, "NIL")
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:750:9: expr
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    pushFollow(FOLLOW_expr_in_stmtForNext4945);
                    expr357=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr357.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (BaseNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BaseNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 92, stmtForNext_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "stmtForNext"


    public static class stmtSwitch_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stmtSwitch"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:758:1: stmtSwitch : 'switch' '(' expr ')' braceOpen stmtsCase ( stmtDefault )? braceClose -> ^( S_SWITCH[\"S_SWITCH\"] expr stmtsCase ( stmtDefault )? ) ;
    public final pollenParser.stmtSwitch_return stmtSwitch() throws RecognitionException {
        pollenParser.stmtSwitch_return retval = new pollenParser.stmtSwitch_return();
        retval.start = input.LT(1);

        int stmtSwitch_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom string_literal358=null;
        Atom char_literal359=null;
        Atom char_literal361=null;
        pollenParser.expr_return expr360 =null;

        pollenParser.braceOpen_return braceOpen362 =null;

        pollenParser.stmtsCase_return stmtsCase363 =null;

        pollenParser.stmtDefault_return stmtDefault364 =null;

        pollenParser.braceClose_return braceClose365 =null;


        BaseNode string_literal358_tree=null;
        BaseNode char_literal359_tree=null;
        BaseNode char_literal361_tree=null;
        RewriteRuleTokenStream stream_122=new RewriteRuleTokenStream(adaptor,"token 122");
        RewriteRuleTokenStream stream_123=new RewriteRuleTokenStream(adaptor,"token 123");
        RewriteRuleTokenStream stream_179=new RewriteRuleTokenStream(adaptor,"token 179");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_stmtsCase=new RewriteRuleSubtreeStream(adaptor,"rule stmtsCase");
        RewriteRuleSubtreeStream stream_stmtDefault=new RewriteRuleSubtreeStream(adaptor,"rule stmtDefault");
        RewriteRuleSubtreeStream stream_braceOpen=new RewriteRuleSubtreeStream(adaptor,"rule braceOpen");
        RewriteRuleSubtreeStream stream_braceClose=new RewriteRuleSubtreeStream(adaptor,"rule braceClose");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 93) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:759:2: ( 'switch' '(' expr ')' braceOpen stmtsCase ( stmtDefault )? braceClose -> ^( S_SWITCH[\"S_SWITCH\"] expr stmtsCase ( stmtDefault )? ) )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:759:4: 'switch' '(' expr ')' braceOpen stmtsCase ( stmtDefault )? braceClose
            {
            string_literal358=(Atom)match(input,179,FOLLOW_179_in_stmtSwitch4964); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_179.add(string_literal358);


            char_literal359=(Atom)match(input,122,FOLLOW_122_in_stmtSwitch4966); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_122.add(char_literal359);


            pushFollow(FOLLOW_expr_in_stmtSwitch4968);
            expr360=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr360.getTree());

            char_literal361=(Atom)match(input,123,FOLLOW_123_in_stmtSwitch4970); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_123.add(char_literal361);


            pushFollow(FOLLOW_braceOpen_in_stmtSwitch4972);
            braceOpen362=braceOpen();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_braceOpen.add(braceOpen362.getTree());

            pushFollow(FOLLOW_stmtsCase_in_stmtSwitch4974);
            stmtsCase363=stmtsCase();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_stmtsCase.add(stmtsCase363.getTree());

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:759:46: ( stmtDefault )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==148) ) {
                alt92=1;
            }
            switch (alt92) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:759:46: stmtDefault
                    {
                    pushFollow(FOLLOW_stmtDefault_in_stmtSwitch4976);
                    stmtDefault364=stmtDefault();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_stmtDefault.add(stmtDefault364.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_braceClose_in_stmtSwitch4979);
            braceClose365=braceClose();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_braceClose.add(braceClose365.getTree());

            // AST REWRITE
            // elements: stmtDefault, expr, stmtsCase
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (BaseNode)adaptor.nil();
            // 759:70: -> ^( S_SWITCH[\"S_SWITCH\"] expr stmtsCase ( stmtDefault )? )
            {
                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:759:73: ^( S_SWITCH[\"S_SWITCH\"] expr stmtsCase ( stmtDefault )? )
                {
                BaseNode root_1 = (BaseNode)adaptor.nil();
                root_1 = (BaseNode)adaptor.becomeRoot(
                new StmtNode.Switch(S_SWITCH, "S_SWITCH")
                , root_1);

                adaptor.addChild(root_1, stream_expr.nextTree());

                adaptor.addChild(root_1, stream_stmtsCase.nextTree());

                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:759:129: ( stmtDefault )?
                if ( stream_stmtDefault.hasNext() ) {
                    adaptor.addChild(root_1, stream_stmtDefault.nextTree());

                }
                stream_stmtDefault.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (BaseNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BaseNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 93, stmtSwitch_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "stmtSwitch"


    public static class stmtsCase_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stmtsCase"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:761:1: stmtsCase : ( stmtCase )* -> ^( LIST[\"LIST\"] ( stmtCase )* ) ;
    public final pollenParser.stmtsCase_return stmtsCase() throws RecognitionException {
        pollenParser.stmtsCase_return retval = new pollenParser.stmtsCase_return();
        retval.start = input.LT(1);

        int stmtsCase_StartIndex = input.index();

        BaseNode root_0 = null;

        pollenParser.stmtCase_return stmtCase366 =null;


        RewriteRuleSubtreeStream stream_stmtCase=new RewriteRuleSubtreeStream(adaptor,"rule stmtCase");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 94) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:762:2: ( ( stmtCase )* -> ^( LIST[\"LIST\"] ( stmtCase )* ) )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:762:4: ( stmtCase )*
            {
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:762:4: ( stmtCase )*
            loop93:
            do {
                int alt93=2;
                int LA93_0 = input.LA(1);

                if ( (LA93_0==143) ) {
                    alt93=1;
                }


                switch (alt93) {
            	case 1 :
            	    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:762:4: stmtCase
            	    {
            	    pushFollow(FOLLOW_stmtCase_in_stmtsCase5009);
            	    stmtCase366=stmtCase();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_stmtCase.add(stmtCase366.getTree());

            	    }
            	    break;

            	default :
            	    break loop93;
                }
            } while (true);


            // AST REWRITE
            // elements: stmtCase
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (BaseNode)adaptor.nil();
            // 762:14: -> ^( LIST[\"LIST\"] ( stmtCase )* )
            {
                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:762:17: ^( LIST[\"LIST\"] ( stmtCase )* )
                {
                BaseNode root_1 = (BaseNode)adaptor.nil();
                root_1 = (BaseNode)adaptor.becomeRoot(
                new ListNode(LIST, "LIST")
                , root_1);

                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:762:42: ( stmtCase )*
                while ( stream_stmtCase.hasNext() ) {
                    adaptor.addChild(root_1, stream_stmtCase.nextTree());

                }
                stream_stmtCase.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (BaseNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BaseNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 94, stmtsCase_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "stmtsCase"


    public static class stmtDefault_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stmtDefault"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:764:1: stmtDefault : 'default' ':' ( NL )* stmts -> ^( S_CASE[\"S_CASE\"] stmts ) ;
    public final pollenParser.stmtDefault_return stmtDefault() throws RecognitionException {
        pollenParser.stmtDefault_return retval = new pollenParser.stmtDefault_return();
        retval.start = input.LT(1);

        int stmtDefault_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom string_literal367=null;
        Atom char_literal368=null;
        Atom NL369=null;
        pollenParser.stmts_return stmts370 =null;


        BaseNode string_literal367_tree=null;
        BaseNode char_literal368_tree=null;
        BaseNode NL369_tree=null;
        RewriteRuleTokenStream stream_128=new RewriteRuleTokenStream(adaptor,"token 128");
        RewriteRuleTokenStream stream_148=new RewriteRuleTokenStream(adaptor,"token 148");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_stmts=new RewriteRuleSubtreeStream(adaptor,"rule stmts");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 95) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:765:2: ( 'default' ':' ( NL )* stmts -> ^( S_CASE[\"S_CASE\"] stmts ) )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:765:4: 'default' ':' ( NL )* stmts
            {
            string_literal367=(Atom)match(input,148,FOLLOW_148_in_stmtDefault5033); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_148.add(string_literal367);


            char_literal368=(Atom)match(input,128,FOLLOW_128_in_stmtDefault5035); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_128.add(char_literal368);


            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:765:18: ( NL )*
            loop94:
            do {
                int alt94=2;
                int LA94_0 = input.LA(1);

                if ( (LA94_0==NL) ) {
                    int LA94_1 = input.LA(2);

                    if ( (synpred163_pollen()) ) {
                        alt94=1;
                    }


                }


                switch (alt94) {
            	case 1 :
            	    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:765:18: NL
            	    {
            	    NL369=(Atom)match(input,NL,FOLLOW_NL_in_stmtDefault5037); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_NL.add(NL369);


            	    }
            	    break;

            	default :
            	    break loop94;
                }
            } while (true);


            pushFollow(FOLLOW_stmts_in_stmtDefault5040);
            stmts370=stmts();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_stmts.add(stmts370.getTree());

            // AST REWRITE
            // elements: stmts
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (BaseNode)adaptor.nil();
            // 765:28: -> ^( S_CASE[\"S_CASE\"] stmts )
            {
                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:765:31: ^( S_CASE[\"S_CASE\"] stmts )
                {
                BaseNode root_1 = (BaseNode)adaptor.nil();
                root_1 = (BaseNode)adaptor.becomeRoot(
                new StmtNode.Case(S_CASE, "S_CASE")
                , root_1);

                adaptor.addChild(root_1, stream_stmts.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (BaseNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BaseNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 95, stmtDefault_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "stmtDefault"


    public static class stmtCase_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stmtCase"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:767:1: stmtCase : 'case' ( INT_LIT ) ':' ( NL )* stmts -> ^( S_CASE[\"S_CASE\"] stmts INT_LIT ) ;
    public final pollenParser.stmtCase_return stmtCase() throws RecognitionException {
        pollenParser.stmtCase_return retval = new pollenParser.stmtCase_return();
        retval.start = input.LT(1);

        int stmtCase_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom string_literal371=null;
        Atom INT_LIT372=null;
        Atom char_literal373=null;
        Atom NL374=null;
        pollenParser.stmts_return stmts375 =null;


        BaseNode string_literal371_tree=null;
        BaseNode INT_LIT372_tree=null;
        BaseNode char_literal373_tree=null;
        BaseNode NL374_tree=null;
        RewriteRuleTokenStream stream_143=new RewriteRuleTokenStream(adaptor,"token 143");
        RewriteRuleTokenStream stream_128=new RewriteRuleTokenStream(adaptor,"token 128");
        RewriteRuleTokenStream stream_INT_LIT=new RewriteRuleTokenStream(adaptor,"token INT_LIT");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_stmts=new RewriteRuleSubtreeStream(adaptor,"rule stmts");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 96) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:768:2: ( 'case' ( INT_LIT ) ':' ( NL )* stmts -> ^( S_CASE[\"S_CASE\"] stmts INT_LIT ) )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:768:4: 'case' ( INT_LIT ) ':' ( NL )* stmts
            {
            string_literal371=(Atom)match(input,143,FOLLOW_143_in_stmtCase5064); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_143.add(string_literal371);


            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:768:11: ( INT_LIT )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:768:12: INT_LIT
            {
            INT_LIT372=(Atom)match(input,INT_LIT,FOLLOW_INT_LIT_in_stmtCase5067); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_INT_LIT.add(INT_LIT372);


            }


            char_literal373=(Atom)match(input,128,FOLLOW_128_in_stmtCase5070); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_128.add(char_literal373);


            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:768:25: ( NL )*
            loop95:
            do {
                int alt95=2;
                int LA95_0 = input.LA(1);

                if ( (LA95_0==NL) ) {
                    int LA95_1 = input.LA(2);

                    if ( (synpred164_pollen()) ) {
                        alt95=1;
                    }


                }


                switch (alt95) {
            	case 1 :
            	    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:768:25: NL
            	    {
            	    NL374=(Atom)match(input,NL,FOLLOW_NL_in_stmtCase5072); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_NL.add(NL374);


            	    }
            	    break;

            	default :
            	    break loop95;
                }
            } while (true);


            pushFollow(FOLLOW_stmts_in_stmtCase5075);
            stmts375=stmts();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_stmts.add(stmts375.getTree());

            // AST REWRITE
            // elements: INT_LIT, stmts
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (BaseNode)adaptor.nil();
            // 768:35: -> ^( S_CASE[\"S_CASE\"] stmts INT_LIT )
            {
                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:768:38: ^( S_CASE[\"S_CASE\"] stmts INT_LIT )
                {
                BaseNode root_1 = (BaseNode)adaptor.nil();
                root_1 = (BaseNode)adaptor.becomeRoot(
                new StmtNode.Case(S_CASE, "S_CASE")
                , root_1);

                adaptor.addChild(root_1, stream_stmts.nextTree());

                adaptor.addChild(root_1, 
                stream_INT_LIT.nextNode()
                );

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (BaseNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BaseNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 96, stmtCase_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "stmtCase"


    public static class stmtDoWhile_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stmtDoWhile"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:770:1: stmtDoWhile : 'do' stmtBlock 'while' '(' expr ')' delim -> ^( S_WHILE[\"S_WHILE\", true] expr stmtBlock ) ;
    public final pollenParser.stmtDoWhile_return stmtDoWhile() throws RecognitionException {
        pollenParser.stmtDoWhile_return retval = new pollenParser.stmtDoWhile_return();
        retval.start = input.LT(1);

        int stmtDoWhile_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom string_literal376=null;
        Atom string_literal378=null;
        Atom char_literal379=null;
        Atom char_literal381=null;
        pollenParser.stmtBlock_return stmtBlock377 =null;

        pollenParser.expr_return expr380 =null;

        pollenParser.delim_return delim382 =null;


        BaseNode string_literal376_tree=null;
        BaseNode string_literal378_tree=null;
        BaseNode char_literal379_tree=null;
        BaseNode char_literal381_tree=null;
        RewriteRuleTokenStream stream_122=new RewriteRuleTokenStream(adaptor,"token 122");
        RewriteRuleTokenStream stream_149=new RewriteRuleTokenStream(adaptor,"token 149");
        RewriteRuleTokenStream stream_123=new RewriteRuleTokenStream(adaptor,"token 123");
        RewriteRuleTokenStream stream_186=new RewriteRuleTokenStream(adaptor,"token 186");
        RewriteRuleSubtreeStream stream_stmtBlock=new RewriteRuleSubtreeStream(adaptor,"rule stmtBlock");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_delim=new RewriteRuleSubtreeStream(adaptor,"rule delim");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 97) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:771:2: ( 'do' stmtBlock 'while' '(' expr ')' delim -> ^( S_WHILE[\"S_WHILE\", true] expr stmtBlock ) )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:771:4: 'do' stmtBlock 'while' '(' expr ')' delim
            {
            string_literal376=(Atom)match(input,149,FOLLOW_149_in_stmtDoWhile5101); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_149.add(string_literal376);


            pushFollow(FOLLOW_stmtBlock_in_stmtDoWhile5103);
            stmtBlock377=stmtBlock();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_stmtBlock.add(stmtBlock377.getTree());

            string_literal378=(Atom)match(input,186,FOLLOW_186_in_stmtDoWhile5105); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_186.add(string_literal378);


            char_literal379=(Atom)match(input,122,FOLLOW_122_in_stmtDoWhile5107); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_122.add(char_literal379);


            pushFollow(FOLLOW_expr_in_stmtDoWhile5109);
            expr380=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr380.getTree());

            char_literal381=(Atom)match(input,123,FOLLOW_123_in_stmtDoWhile5111); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_123.add(char_literal381);


            pushFollow(FOLLOW_delim_in_stmtDoWhile5113);
            delim382=delim();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_delim.add(delim382.getTree());

            // AST REWRITE
            // elements: expr, stmtBlock
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (BaseNode)adaptor.nil();
            // 771:47: -> ^( S_WHILE[\"S_WHILE\", true] expr stmtBlock )
            {
                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:771:50: ^( S_WHILE[\"S_WHILE\", true] expr stmtBlock )
                {
                BaseNode root_1 = (BaseNode)adaptor.nil();
                root_1 = (BaseNode)adaptor.becomeRoot(
                new StmtNode.While(S_WHILE, "S_WHILE", true)
                , root_1);

                adaptor.addChild(root_1, stream_expr.nextTree());

                adaptor.addChild(root_1, stream_stmtBlock.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (BaseNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BaseNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 97, stmtDoWhile_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "stmtDoWhile"


    public static class stmtIf_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stmtIf"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:773:1: stmtIf : 'if' stmtIfBlock stmtsElif ( stmtElse )? -> ^( S_IF[\"S_IF\"] stmtIfBlock stmtsElif ( stmtElse )? ) ;
    public final pollenParser.stmtIf_return stmtIf() throws RecognitionException {
        pollenParser.stmtIf_return retval = new pollenParser.stmtIf_return();
        retval.start = input.LT(1);

        int stmtIf_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom string_literal383=null;
        pollenParser.stmtIfBlock_return stmtIfBlock384 =null;

        pollenParser.stmtsElif_return stmtsElif385 =null;

        pollenParser.stmtElse_return stmtElse386 =null;


        BaseNode string_literal383_tree=null;
        RewriteRuleTokenStream stream_160=new RewriteRuleTokenStream(adaptor,"token 160");
        RewriteRuleSubtreeStream stream_stmtsElif=new RewriteRuleSubtreeStream(adaptor,"rule stmtsElif");
        RewriteRuleSubtreeStream stream_stmtElse=new RewriteRuleSubtreeStream(adaptor,"rule stmtElse");
        RewriteRuleSubtreeStream stream_stmtIfBlock=new RewriteRuleSubtreeStream(adaptor,"rule stmtIfBlock");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 98) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:774:2: ( 'if' stmtIfBlock stmtsElif ( stmtElse )? -> ^( S_IF[\"S_IF\"] stmtIfBlock stmtsElif ( stmtElse )? ) )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:774:4: 'if' stmtIfBlock stmtsElif ( stmtElse )?
            {
            string_literal383=(Atom)match(input,160,FOLLOW_160_in_stmtIf5140); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_160.add(string_literal383);


            pushFollow(FOLLOW_stmtIfBlock_in_stmtIf5142);
            stmtIfBlock384=stmtIfBlock();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_stmtIfBlock.add(stmtIfBlock384.getTree());

            pushFollow(FOLLOW_stmtsElif_in_stmtIf5144);
            stmtsElif385=stmtsElif();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_stmtsElif.add(stmtsElif385.getTree());

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:774:31: ( stmtElse )?
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==151) ) {
                alt96=1;
            }
            switch (alt96) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:774:31: stmtElse
                    {
                    pushFollow(FOLLOW_stmtElse_in_stmtIf5146);
                    stmtElse386=stmtElse();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_stmtElse.add(stmtElse386.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: stmtsElif, stmtIfBlock, stmtElse
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (BaseNode)adaptor.nil();
            // 774:41: -> ^( S_IF[\"S_IF\"] stmtIfBlock stmtsElif ( stmtElse )? )
            {
                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:774:44: ^( S_IF[\"S_IF\"] stmtIfBlock stmtsElif ( stmtElse )? )
                {
                BaseNode root_1 = (BaseNode)adaptor.nil();
                root_1 = (BaseNode)adaptor.becomeRoot(
                new StmtNode.If(S_IF, "S_IF")
                , root_1);

                adaptor.addChild(root_1, stream_stmtIfBlock.nextTree());

                adaptor.addChild(root_1, stream_stmtsElif.nextTree());

                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:774:94: ( stmtElse )?
                if ( stream_stmtElse.hasNext() ) {
                    adaptor.addChild(root_1, stream_stmtElse.nextTree());

                }
                stream_stmtElse.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (BaseNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BaseNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 98, stmtIf_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "stmtIf"


    public static class stmtIfBlock_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stmtIfBlock"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:776:1: stmtIfBlock : '(' expr ')' stmtBlock -> expr stmtBlock ;
    public final pollenParser.stmtIfBlock_return stmtIfBlock() throws RecognitionException {
        pollenParser.stmtIfBlock_return retval = new pollenParser.stmtIfBlock_return();
        retval.start = input.LT(1);

        int stmtIfBlock_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom char_literal387=null;
        Atom char_literal389=null;
        pollenParser.expr_return expr388 =null;

        pollenParser.stmtBlock_return stmtBlock390 =null;


        BaseNode char_literal387_tree=null;
        BaseNode char_literal389_tree=null;
        RewriteRuleTokenStream stream_122=new RewriteRuleTokenStream(adaptor,"token 122");
        RewriteRuleTokenStream stream_123=new RewriteRuleTokenStream(adaptor,"token 123");
        RewriteRuleSubtreeStream stream_stmtBlock=new RewriteRuleSubtreeStream(adaptor,"rule stmtBlock");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 99) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:777:2: ( '(' expr ')' stmtBlock -> expr stmtBlock )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:777:4: '(' expr ')' stmtBlock
            {
            char_literal387=(Atom)match(input,122,FOLLOW_122_in_stmtIfBlock5176); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_122.add(char_literal387);


            pushFollow(FOLLOW_expr_in_stmtIfBlock5178);
            expr388=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr388.getTree());

            char_literal389=(Atom)match(input,123,FOLLOW_123_in_stmtIfBlock5180); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_123.add(char_literal389);


            pushFollow(FOLLOW_stmtBlock_in_stmtIfBlock5182);
            stmtBlock390=stmtBlock();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_stmtBlock.add(stmtBlock390.getTree());

            // AST REWRITE
            // elements: stmtBlock, expr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (BaseNode)adaptor.nil();
            // 777:27: -> expr stmtBlock
            {
                adaptor.addChild(root_0, stream_expr.nextTree());

                adaptor.addChild(root_0, stream_stmtBlock.nextTree());

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (BaseNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BaseNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 99, stmtIfBlock_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "stmtIfBlock"


    public static class stmtsElif_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stmtsElif"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:779:1: stmtsElif : ( stmtElif )* -> ^( LIST ( stmtElif )* ) ;
    public final pollenParser.stmtsElif_return stmtsElif() throws RecognitionException {
        pollenParser.stmtsElif_return retval = new pollenParser.stmtsElif_return();
        retval.start = input.LT(1);

        int stmtsElif_StartIndex = input.index();

        BaseNode root_0 = null;

        pollenParser.stmtElif_return stmtElif391 =null;


        RewriteRuleSubtreeStream stream_stmtElif=new RewriteRuleSubtreeStream(adaptor,"rule stmtElif");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 100) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:780:2: ( ( stmtElif )* -> ^( LIST ( stmtElif )* ) )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:780:4: ( stmtElif )*
            {
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:780:4: ( stmtElif )*
            loop97:
            do {
                int alt97=2;
                int LA97_0 = input.LA(1);

                if ( (LA97_0==150) ) {
                    alt97=1;
                }


                switch (alt97) {
            	case 1 :
            	    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:780:4: stmtElif
            	    {
            	    pushFollow(FOLLOW_stmtElif_in_stmtsElif5198);
            	    stmtElif391=stmtElif();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_stmtElif.add(stmtElif391.getTree());

            	    }
            	    break;

            	default :
            	    break loop97;
                }
            } while (true);


            // AST REWRITE
            // elements: stmtElif
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (BaseNode)adaptor.nil();
            // 780:14: -> ^( LIST ( stmtElif )* )
            {
                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:780:17: ^( LIST ( stmtElif )* )
                {
                BaseNode root_1 = (BaseNode)adaptor.nil();
                root_1 = (BaseNode)adaptor.becomeRoot(
                (BaseNode)adaptor.create(LIST, "LIST")
                , root_1);

                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:780:24: ( stmtElif )*
                while ( stream_stmtElif.hasNext() ) {
                    adaptor.addChild(root_1, stream_stmtElif.nextTree());

                }
                stream_stmtElif.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (BaseNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BaseNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 100, stmtsElif_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "stmtsElif"


    public static class stmtElif_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stmtElif"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:782:1: stmtElif : 'elif' stmtIfBlock -> ^( S_ELIF[\"S_ELIF\"] stmtIfBlock ) ;
    public final pollenParser.stmtElif_return stmtElif() throws RecognitionException {
        pollenParser.stmtElif_return retval = new pollenParser.stmtElif_return();
        retval.start = input.LT(1);

        int stmtElif_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom string_literal392=null;
        pollenParser.stmtIfBlock_return stmtIfBlock393 =null;


        BaseNode string_literal392_tree=null;
        RewriteRuleTokenStream stream_150=new RewriteRuleTokenStream(adaptor,"token 150");
        RewriteRuleSubtreeStream stream_stmtIfBlock=new RewriteRuleSubtreeStream(adaptor,"rule stmtIfBlock");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 101) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:783:2: ( 'elif' stmtIfBlock -> ^( S_ELIF[\"S_ELIF\"] stmtIfBlock ) )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:783:4: 'elif' stmtIfBlock
            {
            string_literal392=(Atom)match(input,150,FOLLOW_150_in_stmtElif5218); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_150.add(string_literal392);


            pushFollow(FOLLOW_stmtIfBlock_in_stmtElif5220);
            stmtIfBlock393=stmtIfBlock();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_stmtIfBlock.add(stmtIfBlock393.getTree());

            // AST REWRITE
            // elements: stmtIfBlock
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (BaseNode)adaptor.nil();
            // 783:23: -> ^( S_ELIF[\"S_ELIF\"] stmtIfBlock )
            {
                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:783:26: ^( S_ELIF[\"S_ELIF\"] stmtIfBlock )
                {
                BaseNode root_1 = (BaseNode)adaptor.nil();
                root_1 = (BaseNode)adaptor.becomeRoot(
                new StmtNode.Elif(S_ELIF, "S_ELIF")
                , root_1);

                adaptor.addChild(root_1, stream_stmtIfBlock.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (BaseNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BaseNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 101, stmtElif_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "stmtElif"


    public static class stmtElse_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stmtElse"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:785:1: stmtElse : 'else' stmtBlock -> stmtBlock ;
    public final pollenParser.stmtElse_return stmtElse() throws RecognitionException {
        pollenParser.stmtElse_return retval = new pollenParser.stmtElse_return();
        retval.start = input.LT(1);

        int stmtElse_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom string_literal394=null;
        pollenParser.stmtBlock_return stmtBlock395 =null;


        BaseNode string_literal394_tree=null;
        RewriteRuleTokenStream stream_151=new RewriteRuleTokenStream(adaptor,"token 151");
        RewriteRuleSubtreeStream stream_stmtBlock=new RewriteRuleSubtreeStream(adaptor,"rule stmtBlock");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 102) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:786:2: ( 'else' stmtBlock -> stmtBlock )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:786:4: 'else' stmtBlock
            {
            string_literal394=(Atom)match(input,151,FOLLOW_151_in_stmtElse5244); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_151.add(string_literal394);


            pushFollow(FOLLOW_stmtBlock_in_stmtElse5246);
            stmtBlock395=stmtBlock();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_stmtBlock.add(stmtBlock395.getTree());

            // AST REWRITE
            // elements: stmtBlock
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (BaseNode)adaptor.nil();
            // 786:21: -> stmtBlock
            {
                adaptor.addChild(root_0, stream_stmtBlock.nextTree());

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (BaseNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BaseNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 102, stmtElse_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "stmtElse"


    public static class stmtProvided_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stmtProvided"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:788:1: stmtProvided : 'provided' '(' expr ')' stmtBlock ( stmtElse )? -> ^( S_PROVIDED expr stmtBlock ( stmtElse )? ) ;
    public final pollenParser.stmtProvided_return stmtProvided() throws RecognitionException {
        pollenParser.stmtProvided_return retval = new pollenParser.stmtProvided_return();
        retval.start = input.LT(1);

        int stmtProvided_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom string_literal396=null;
        Atom char_literal397=null;
        Atom char_literal399=null;
        pollenParser.expr_return expr398 =null;

        pollenParser.stmtBlock_return stmtBlock400 =null;

        pollenParser.stmtElse_return stmtElse401 =null;


        BaseNode string_literal396_tree=null;
        BaseNode char_literal397_tree=null;
        BaseNode char_literal399_tree=null;
        RewriteRuleTokenStream stream_122=new RewriteRuleTokenStream(adaptor,"token 122");
        RewriteRuleTokenStream stream_175=new RewriteRuleTokenStream(adaptor,"token 175");
        RewriteRuleTokenStream stream_123=new RewriteRuleTokenStream(adaptor,"token 123");
        RewriteRuleSubtreeStream stream_stmtElse=new RewriteRuleSubtreeStream(adaptor,"rule stmtElse");
        RewriteRuleSubtreeStream stream_stmtBlock=new RewriteRuleSubtreeStream(adaptor,"rule stmtBlock");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 103) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:789:2: ( 'provided' '(' expr ')' stmtBlock ( stmtElse )? -> ^( S_PROVIDED expr stmtBlock ( stmtElse )? ) )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:789:4: 'provided' '(' expr ')' stmtBlock ( stmtElse )?
            {
            string_literal396=(Atom)match(input,175,FOLLOW_175_in_stmtProvided5260); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_175.add(string_literal396);


            char_literal397=(Atom)match(input,122,FOLLOW_122_in_stmtProvided5262); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_122.add(char_literal397);


            pushFollow(FOLLOW_expr_in_stmtProvided5264);
            expr398=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr398.getTree());

            char_literal399=(Atom)match(input,123,FOLLOW_123_in_stmtProvided5266); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_123.add(char_literal399);


            pushFollow(FOLLOW_stmtBlock_in_stmtProvided5268);
            stmtBlock400=stmtBlock();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_stmtBlock.add(stmtBlock400.getTree());

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:789:38: ( stmtElse )?
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==151) ) {
                alt98=1;
            }
            switch (alt98) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:789:39: stmtElse
                    {
                    pushFollow(FOLLOW_stmtElse_in_stmtProvided5271);
                    stmtElse401=stmtElse();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_stmtElse.add(stmtElse401.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: stmtBlock, stmtElse, expr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (BaseNode)adaptor.nil();
            // 790:3: -> ^( S_PROVIDED expr stmtBlock ( stmtElse )? )
            {
                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:790:6: ^( S_PROVIDED expr stmtBlock ( stmtElse )? )
                {
                BaseNode root_1 = (BaseNode)adaptor.nil();
                root_1 = (BaseNode)adaptor.becomeRoot(
                (BaseNode)adaptor.create(S_PROVIDED, "S_PROVIDED")
                , root_1);

                adaptor.addChild(root_1, stream_expr.nextTree());

                adaptor.addChild(root_1, stream_stmtBlock.nextTree());

                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:790:34: ( stmtElse )?
                if ( stream_stmtElse.hasNext() ) {
                    adaptor.addChild(root_1, stream_stmtElse.nextTree());

                }
                stream_stmtElse.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (BaseNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BaseNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 103, stmtProvided_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "stmtProvided"


    public static class stmtWhile_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stmtWhile"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:792:1: stmtWhile : 'while' '(' expr ')' stmtBlock -> ^( S_WHILE[\"S_WHILE\"] expr stmtBlock ) ;
    public final pollenParser.stmtWhile_return stmtWhile() throws RecognitionException {
        pollenParser.stmtWhile_return retval = new pollenParser.stmtWhile_return();
        retval.start = input.LT(1);

        int stmtWhile_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom string_literal402=null;
        Atom char_literal403=null;
        Atom char_literal405=null;
        pollenParser.expr_return expr404 =null;

        pollenParser.stmtBlock_return stmtBlock406 =null;


        BaseNode string_literal402_tree=null;
        BaseNode char_literal403_tree=null;
        BaseNode char_literal405_tree=null;
        RewriteRuleTokenStream stream_122=new RewriteRuleTokenStream(adaptor,"token 122");
        RewriteRuleTokenStream stream_123=new RewriteRuleTokenStream(adaptor,"token 123");
        RewriteRuleTokenStream stream_186=new RewriteRuleTokenStream(adaptor,"token 186");
        RewriteRuleSubtreeStream stream_stmtBlock=new RewriteRuleSubtreeStream(adaptor,"rule stmtBlock");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 104) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:793:2: ( 'while' '(' expr ')' stmtBlock -> ^( S_WHILE[\"S_WHILE\"] expr stmtBlock ) )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:793:4: 'while' '(' expr ')' stmtBlock
            {
            string_literal402=(Atom)match(input,186,FOLLOW_186_in_stmtWhile5298); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_186.add(string_literal402);


            char_literal403=(Atom)match(input,122,FOLLOW_122_in_stmtWhile5300); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_122.add(char_literal403);


            pushFollow(FOLLOW_expr_in_stmtWhile5302);
            expr404=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr404.getTree());

            char_literal405=(Atom)match(input,123,FOLLOW_123_in_stmtWhile5303); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_123.add(char_literal405);


            pushFollow(FOLLOW_stmtBlock_in_stmtWhile5305);
            stmtBlock406=stmtBlock();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_stmtBlock.add(stmtBlock406.getTree());

            // AST REWRITE
            // elements: stmtBlock, expr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (BaseNode)adaptor.nil();
            // 793:34: -> ^( S_WHILE[\"S_WHILE\"] expr stmtBlock )
            {
                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:793:37: ^( S_WHILE[\"S_WHILE\"] expr stmtBlock )
                {
                BaseNode root_1 = (BaseNode)adaptor.nil();
                root_1 = (BaseNode)adaptor.becomeRoot(
                new StmtNode.While(S_WHILE, "S_WHILE")
                , root_1);

                adaptor.addChild(root_1, stream_expr.nextTree());

                adaptor.addChild(root_1, stream_stmtBlock.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (BaseNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BaseNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 104, stmtWhile_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "stmtWhile"


    public static class varDeclaration_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "varDeclaration"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:795:1: varDeclaration : varAttr varDecl delim -> varDecl ;
    public final pollenParser.varDeclaration_return varDeclaration() throws RecognitionException {
        pollenParser.varDeclaration_return retval = new pollenParser.varDeclaration_return();
        retval.start = input.LT(1);

        int varDeclaration_StartIndex = input.index();

        BaseNode root_0 = null;

        pollenParser.varAttr_return varAttr407 =null;

        pollenParser.varDecl_return varDecl408 =null;

        pollenParser.delim_return delim409 =null;


        RewriteRuleSubtreeStream stream_varAttr=new RewriteRuleSubtreeStream(adaptor,"rule varAttr");
        RewriteRuleSubtreeStream stream_varDecl=new RewriteRuleSubtreeStream(adaptor,"rule varDecl");
        RewriteRuleSubtreeStream stream_delim=new RewriteRuleSubtreeStream(adaptor,"rule delim");

        	atFlags.clear();			

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 105) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:802:4: ( varAttr varDecl delim -> varDecl )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:802:7: varAttr varDecl delim
            {
            pushFollow(FOLLOW_varAttr_in_varDeclaration5347);
            varAttr407=varAttr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_varAttr.add(varAttr407.getTree());

            pushFollow(FOLLOW_varDecl_in_varDeclaration5349);
            varDecl408=varDecl();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_varDecl.add(varDecl408.getTree());

            pushFollow(FOLLOW_delim_in_varDeclaration5351);
            delim409=delim();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_delim.add(delim409.getTree());

            // AST REWRITE
            // elements: varDecl
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (BaseNode)adaptor.nil();
            // 802:29: -> varDecl
            {
                adaptor.addChild(root_0, stream_varDecl.nextTree());

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (BaseNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) {
              atFlags.clear();
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BaseNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 105, varDeclaration_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "varDeclaration"


    public static class varAttr_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "varAttr"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:804:1: varAttr : ( 'const' | 'volatile' | 'host' )* ;
    public final pollenParser.varAttr_return varAttr() throws RecognitionException {
        pollenParser.varAttr_return retval = new pollenParser.varAttr_return();
        retval.start = input.LT(1);

        int varAttr_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom string_literal410=null;
        Atom string_literal411=null;
        Atom string_literal412=null;

        BaseNode string_literal410_tree=null;
        BaseNode string_literal411_tree=null;
        BaseNode string_literal412_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 106) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:806:2: ( ( 'const' | 'volatile' | 'host' )* )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:806:4: ( 'const' | 'volatile' | 'host' )*
            {
            root_0 = (BaseNode)adaptor.nil();


            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:806:4: ( 'const' | 'volatile' | 'host' )*
            loop99:
            do {
                int alt99=4;
                switch ( input.LA(1) ) {
                case 146:
                    {
                    alt99=1;
                    }
                    break;
                case 185:
                    {
                    alt99=2;
                    }
                    break;
                case 159:
                    {
                    alt99=3;
                    }
                    break;

                }

                switch (alt99) {
            	case 1 :
            	    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:806:7: 'const'
            	    {
            	    string_literal410=(Atom)match(input,146,FOLLOW_146_in_varAttr5372); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal410_tree = 
            	    (BaseNode)adaptor.create(string_literal410)
            	    ;
            	    adaptor.addChild(root_0, string_literal410_tree);
            	    }

            	    if ( state.backtracking==0 ) { atFlags.add(Flags.CONST); }

            	    }
            	    break;
            	case 2 :
            	    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:807:6: 'volatile'
            	    {
            	    string_literal411=(Atom)match(input,185,FOLLOW_185_in_varAttr5381); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal411_tree = 
            	    (BaseNode)adaptor.create(string_literal411)
            	    ;
            	    adaptor.addChild(root_0, string_literal411_tree);
            	    }

            	    if ( state.backtracking==0 ) { atFlags.add(Flags.VOLATILE); }

            	    }
            	    break;
            	case 3 :
            	    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:808:7: 'host'
            	    {
            	    string_literal412=(Atom)match(input,159,FOLLOW_159_in_varAttr5391); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal412_tree = 
            	    (BaseNode)adaptor.create(string_literal412)
            	    ;
            	    adaptor.addChild(root_0, string_literal412_tree);
            	    }

            	    if ( state.backtracking==0 ) { atFlags.add(Flags.HOST); }

            	    }
            	    break;

            	default :
            	    break loop99;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (BaseNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BaseNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 106, varAttr_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "varAttr"


    protected static class varDecl_scope {
        Object typ;
    }
    protected Stack varDecl_stack = new Stack();


    public static class varDecl_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "varDecl"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:811:1: varDecl : ( ( typeName IDENT ( ASSIGN expr )? ',' )=> varDeclList | ( typeName IDENT '[' )=> varArray | ( typeName '(' )=> varFcnRef | ( typeName varInit )=> varDeclList | 'new' typeName IDENT fcnArgumentList -> ^( D_VAR[\"D_VAR\", atFlags] typeName ^( IDENT ^( E_EXPR ^( E_NEW[\"E_NEW\"] typeName fcnArgumentList ) ) ) ) );
    public final pollenParser.varDecl_return varDecl() throws RecognitionException {
        varDecl_stack.push(new varDecl_scope());
        pollenParser.varDecl_return retval = new pollenParser.varDecl_return();
        retval.start = input.LT(1);

        int varDecl_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom string_literal417=null;
        Atom IDENT419=null;
        pollenParser.varDeclList_return varDeclList413 =null;

        pollenParser.varArray_return varArray414 =null;

        pollenParser.varFcnRef_return varFcnRef415 =null;

        pollenParser.varDeclList_return varDeclList416 =null;

        pollenParser.typeName_return typeName418 =null;

        pollenParser.fcnArgumentList_return fcnArgumentList420 =null;


        BaseNode string_literal417_tree=null;
        BaseNode IDENT419_tree=null;
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleTokenStream stream_169=new RewriteRuleTokenStream(adaptor,"token 169");
        RewriteRuleSubtreeStream stream_typeName=new RewriteRuleSubtreeStream(adaptor,"rule typeName");
        RewriteRuleSubtreeStream stream_fcnArgumentList=new RewriteRuleSubtreeStream(adaptor,"rule fcnArgumentList");

        	((varDecl_scope)varDecl_stack.peek()).typ = null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 107) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:820:2: ( ( typeName IDENT ( ASSIGN expr )? ',' )=> varDeclList | ( typeName IDENT '[' )=> varArray | ( typeName '(' )=> varFcnRef | ( typeName varInit )=> varDeclList | 'new' typeName IDENT fcnArgumentList -> ^( D_VAR[\"D_VAR\", atFlags] typeName ^( IDENT ^( E_EXPR ^( E_NEW[\"E_NEW\"] typeName fcnArgumentList ) ) ) ) )
            int alt100=5;
            switch ( input.LA(1) ) {
            case 140:
            case 142:
            case 163:
            case 164:
            case 165:
            case 178:
            case 182:
            case 183:
            case 184:
                {
                int LA100_1 = input.LA(2);

                if ( (synpred172_pollen()) ) {
                    alt100=1;
                }
                else if ( (synpred173_pollen()) ) {
                    alt100=2;
                }
                else if ( (synpred174_pollen()) ) {
                    alt100=3;
                }
                else if ( (synpred175_pollen()) ) {
                    alt100=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 100, 1, input);

                    throw nvae;

                }
                }
                break;
            case IDENT:
                {
                int LA100_2 = input.LA(2);

                if ( (synpred172_pollen()) ) {
                    alt100=1;
                }
                else if ( (synpred173_pollen()) ) {
                    alt100=2;
                }
                else if ( (synpred174_pollen()) ) {
                    alt100=3;
                }
                else if ( (synpred175_pollen()) ) {
                    alt100=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 100, 2, input);

                    throw nvae;

                }
                }
                break;
            case 169:
                {
                alt100=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 100, 0, input);

                throw nvae;

            }

            switch (alt100) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:820:4: ( typeName IDENT ( ASSIGN expr )? ',' )=> varDeclList
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    pushFollow(FOLLOW_varDeclList_in_varDecl5435);
                    varDeclList413=varDeclList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDeclList413.getTree());

                    }
                    break;
                case 2 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:821:5: ( typeName IDENT '[' )=> varArray
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    pushFollow(FOLLOW_varArray_in_varDecl5452);
                    varArray414=varArray();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varArray414.getTree());

                    }
                    break;
                case 3 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:822:5: ( typeName '(' )=> varFcnRef
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    pushFollow(FOLLOW_varFcnRef_in_varDecl5468);
                    varFcnRef415=varFcnRef();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varFcnRef415.getTree());

                    }
                    break;
                case 4 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:823:6: ( typeName varInit )=> varDeclList
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    pushFollow(FOLLOW_varDeclList_in_varDecl5484);
                    varDeclList416=varDeclList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDeclList416.getTree());

                    }
                    break;
                case 5 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:824:5: 'new' typeName IDENT fcnArgumentList
                    {
                    string_literal417=(Atom)match(input,169,FOLLOW_169_in_varDecl5490); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_169.add(string_literal417);


                    pushFollow(FOLLOW_typeName_in_varDecl5492);
                    typeName418=typeName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeName.add(typeName418.getTree());

                    IDENT419=(Atom)match(input,IDENT,FOLLOW_IDENT_in_varDecl5494); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENT.add(IDENT419);


                    pushFollow(FOLLOW_fcnArgumentList_in_varDecl5496);
                    fcnArgumentList420=fcnArgumentList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_fcnArgumentList.add(fcnArgumentList420.getTree());

                    if ( state.backtracking==0 ) { atFlags.add(Flags.NEW); }

                    // AST REWRITE
                    // elements: fcnArgumentList, typeName, IDENT, typeName
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (BaseNode)adaptor.nil();
                    // 826:3: -> ^( D_VAR[\"D_VAR\", atFlags] typeName ^( IDENT ^( E_EXPR ^( E_NEW[\"E_NEW\"] typeName fcnArgumentList ) ) ) )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:826:6: ^( D_VAR[\"D_VAR\", atFlags] typeName ^( IDENT ^( E_EXPR ^( E_NEW[\"E_NEW\"] typeName fcnArgumentList ) ) ) )
                        {
                        BaseNode root_1 = (BaseNode)adaptor.nil();
                        root_1 = (BaseNode)adaptor.becomeRoot(
                        new DeclNode.Var(D_VAR, "D_VAR", atFlags)
                        , root_1);

                        adaptor.addChild(root_1, stream_typeName.nextTree());

                        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:827:6: ^( IDENT ^( E_EXPR ^( E_NEW[\"E_NEW\"] typeName fcnArgumentList ) ) )
                        {
                        BaseNode root_2 = (BaseNode)adaptor.nil();
                        root_2 = (BaseNode)adaptor.becomeRoot(
                        stream_IDENT.nextNode()
                        , root_2);

                        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:827:14: ^( E_EXPR ^( E_NEW[\"E_NEW\"] typeName fcnArgumentList ) )
                        {
                        BaseNode root_3 = (BaseNode)adaptor.nil();
                        root_3 = (BaseNode)adaptor.becomeRoot(
                        (BaseNode)adaptor.create(E_EXPR, "E_EXPR")
                        , root_3);

                        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:827:23: ^( E_NEW[\"E_NEW\"] typeName fcnArgumentList )
                        {
                        BaseNode root_4 = (BaseNode)adaptor.nil();
                        root_4 = (BaseNode)adaptor.becomeRoot(
                        new ExprNode.New(E_NEW, "E_NEW")
                        , root_4);

                        adaptor.addChild(root_4, stream_typeName.nextTree());

                        adaptor.addChild(root_4, stream_fcnArgumentList.nextTree());

                        adaptor.addChild(root_3, root_4);
                        }

                        adaptor.addChild(root_2, root_3);
                        }

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (BaseNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BaseNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 107, varDecl_StartIndex); }

            varDecl_stack.pop();
        }
        return retval;
    }
    // $ANTLR end "varDecl"


    public static class varFcnRef_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "varFcnRef"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:829:1: varFcnRef : typeName fcnRefTypeList IDENT -> ^( D_FCN_REF[\"D_FCN_REF\", atFlags] typeName fcnRefTypeList IDENT ) ;
    public final pollenParser.varFcnRef_return varFcnRef() throws RecognitionException {
        pollenParser.varFcnRef_return retval = new pollenParser.varFcnRef_return();
        retval.start = input.LT(1);

        int varFcnRef_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom IDENT423=null;
        pollenParser.typeName_return typeName421 =null;

        pollenParser.fcnRefTypeList_return fcnRefTypeList422 =null;


        BaseNode IDENT423_tree=null;
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleSubtreeStream stream_typeName=new RewriteRuleSubtreeStream(adaptor,"rule typeName");
        RewriteRuleSubtreeStream stream_fcnRefTypeList=new RewriteRuleSubtreeStream(adaptor,"rule fcnRefTypeList");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 108) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:830:2: ( typeName fcnRefTypeList IDENT -> ^( D_FCN_REF[\"D_FCN_REF\", atFlags] typeName fcnRefTypeList IDENT ) )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:830:4: typeName fcnRefTypeList IDENT
            {
            pushFollow(FOLLOW_typeName_in_varFcnRef5558);
            typeName421=typeName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeName.add(typeName421.getTree());

            pushFollow(FOLLOW_fcnRefTypeList_in_varFcnRef5560);
            fcnRefTypeList422=fcnRefTypeList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_fcnRefTypeList.add(fcnRefTypeList422.getTree());

            IDENT423=(Atom)match(input,IDENT,FOLLOW_IDENT_in_varFcnRef5562); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENT.add(IDENT423);


            // AST REWRITE
            // elements: typeName, fcnRefTypeList, IDENT
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (BaseNode)adaptor.nil();
            // 831:3: -> ^( D_FCN_REF[\"D_FCN_REF\", atFlags] typeName fcnRefTypeList IDENT )
            {
                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:831:6: ^( D_FCN_REF[\"D_FCN_REF\", atFlags] typeName fcnRefTypeList IDENT )
                {
                BaseNode root_1 = (BaseNode)adaptor.nil();
                root_1 = (BaseNode)adaptor.becomeRoot(
                new DeclNode.FcnRef(D_FCN_REF, "D_FCN_REF", atFlags)
                , root_1);

                adaptor.addChild(root_1, stream_typeName.nextTree());

                adaptor.addChild(root_1, stream_fcnRefTypeList.nextTree());

                adaptor.addChild(root_1, 
                stream_IDENT.nextNode()
                );

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (BaseNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BaseNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 108, varFcnRef_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "varFcnRef"


    public static class fcnRefTypeList_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "fcnRefTypeList"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:833:1: fcnRefTypeList : '(' fcnRefTypes ')' -> fcnRefTypes ;
    public final pollenParser.fcnRefTypeList_return fcnRefTypeList() throws RecognitionException {
        pollenParser.fcnRefTypeList_return retval = new pollenParser.fcnRefTypeList_return();
        retval.start = input.LT(1);

        int fcnRefTypeList_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom char_literal424=null;
        Atom char_literal426=null;
        pollenParser.fcnRefTypes_return fcnRefTypes425 =null;


        BaseNode char_literal424_tree=null;
        BaseNode char_literal426_tree=null;
        RewriteRuleTokenStream stream_122=new RewriteRuleTokenStream(adaptor,"token 122");
        RewriteRuleTokenStream stream_123=new RewriteRuleTokenStream(adaptor,"token 123");
        RewriteRuleSubtreeStream stream_fcnRefTypes=new RewriteRuleSubtreeStream(adaptor,"rule fcnRefTypes");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 109) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:834:2: ( '(' fcnRefTypes ')' -> fcnRefTypes )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:834:4: '(' fcnRefTypes ')'
            {
            char_literal424=(Atom)match(input,122,FOLLOW_122_in_fcnRefTypeList5594); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_122.add(char_literal424);


            pushFollow(FOLLOW_fcnRefTypes_in_fcnRefTypeList5596);
            fcnRefTypes425=fcnRefTypes();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_fcnRefTypes.add(fcnRefTypes425.getTree());

            char_literal426=(Atom)match(input,123,FOLLOW_123_in_fcnRefTypeList5598); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_123.add(char_literal426);


            // AST REWRITE
            // elements: fcnRefTypes
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (BaseNode)adaptor.nil();
            // 834:24: -> fcnRefTypes
            {
                adaptor.addChild(root_0, stream_fcnRefTypes.nextTree());

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (BaseNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BaseNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 109, fcnRefTypeList_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "fcnRefTypeList"


    public static class fcnRefTypes_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "fcnRefTypes"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:836:1: fcnRefTypes : ( typeName ( ',' typeName )* -> ^( LIST[\"LIST\"] ( typeName )+ ) | -> ^( LIST[\"LIST\"] ) );
    public final pollenParser.fcnRefTypes_return fcnRefTypes() throws RecognitionException {
        pollenParser.fcnRefTypes_return retval = new pollenParser.fcnRefTypes_return();
        retval.start = input.LT(1);

        int fcnRefTypes_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom char_literal428=null;
        pollenParser.typeName_return typeName427 =null;

        pollenParser.typeName_return typeName429 =null;


        BaseNode char_literal428_tree=null;
        RewriteRuleTokenStream stream_125=new RewriteRuleTokenStream(adaptor,"token 125");
        RewriteRuleSubtreeStream stream_typeName=new RewriteRuleSubtreeStream(adaptor,"rule typeName");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 110) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:837:2: ( typeName ( ',' typeName )* -> ^( LIST[\"LIST\"] ( typeName )+ ) | -> ^( LIST[\"LIST\"] ) )
            int alt102=2;
            int LA102_0 = input.LA(1);

            if ( (LA102_0==IDENT||LA102_0==140||LA102_0==142||(LA102_0 >= 163 && LA102_0 <= 165)||LA102_0==178||(LA102_0 >= 182 && LA102_0 <= 184)) ) {
                alt102=1;
            }
            else if ( (LA102_0==123) ) {
                alt102=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 102, 0, input);

                throw nvae;

            }
            switch (alt102) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:837:4: typeName ( ',' typeName )*
                    {
                    pushFollow(FOLLOW_typeName_in_fcnRefTypes5612);
                    typeName427=typeName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeName.add(typeName427.getTree());

                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:837:13: ( ',' typeName )*
                    loop101:
                    do {
                        int alt101=2;
                        int LA101_0 = input.LA(1);

                        if ( (LA101_0==125) ) {
                            alt101=1;
                        }


                        switch (alt101) {
                    	case 1 :
                    	    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:837:14: ',' typeName
                    	    {
                    	    char_literal428=(Atom)match(input,125,FOLLOW_125_in_fcnRefTypes5615); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_125.add(char_literal428);


                    	    pushFollow(FOLLOW_typeName_in_fcnRefTypes5617);
                    	    typeName429=typeName();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_typeName.add(typeName429.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop101;
                        }
                    } while (true);


                    // AST REWRITE
                    // elements: typeName
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (BaseNode)adaptor.nil();
                    // 838:3: -> ^( LIST[\"LIST\"] ( typeName )+ )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:838:6: ^( LIST[\"LIST\"] ( typeName )+ )
                        {
                        BaseNode root_1 = (BaseNode)adaptor.nil();
                        root_1 = (BaseNode)adaptor.becomeRoot(
                        new ListNode(LIST, "LIST")
                        , root_1);

                        if ( !(stream_typeName.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_typeName.hasNext() ) {
                            adaptor.addChild(root_1, stream_typeName.nextTree());

                        }
                        stream_typeName.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:839:4: 
                    {
                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (BaseNode)adaptor.nil();
                    // 839:4: -> ^( LIST[\"LIST\"] )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:839:7: ^( LIST[\"LIST\"] )
                        {
                        BaseNode root_1 = (BaseNode)adaptor.nil();
                        root_1 = (BaseNode)adaptor.becomeRoot(
                        new ListNode(LIST, "LIST")
                        , root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (BaseNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BaseNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 110, fcnRefTypes_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "fcnRefTypes"


    public static class varArray_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "varArray"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:841:1: varArray : typeName IDENT varArraySpec ( '=' initializer )? -> ^( D_ARR[\"D_Arr\", atFlags] typeName IDENT varArraySpec ( initializer )? ) ;
    public final pollenParser.varArray_return varArray() throws RecognitionException {
        pollenParser.varArray_return retval = new pollenParser.varArray_return();
        retval.start = input.LT(1);

        int varArray_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom IDENT431=null;
        Atom char_literal433=null;
        pollenParser.typeName_return typeName430 =null;

        pollenParser.varArraySpec_return varArraySpec432 =null;

        pollenParser.initializer_return initializer434 =null;


        BaseNode IDENT431_tree=null;
        BaseNode char_literal433_tree=null;
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
        RewriteRuleSubtreeStream stream_typeName=new RewriteRuleSubtreeStream(adaptor,"rule typeName");
        RewriteRuleSubtreeStream stream_varArraySpec=new RewriteRuleSubtreeStream(adaptor,"rule varArraySpec");
        RewriteRuleSubtreeStream stream_initializer=new RewriteRuleSubtreeStream(adaptor,"rule initializer");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 111) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:842:2: ( typeName IDENT varArraySpec ( '=' initializer )? -> ^( D_ARR[\"D_Arr\", atFlags] typeName IDENT varArraySpec ( initializer )? ) )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:842:4: typeName IDENT varArraySpec ( '=' initializer )?
            {
            pushFollow(FOLLOW_typeName_in_varArray5658);
            typeName430=typeName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeName.add(typeName430.getTree());

            IDENT431=(Atom)match(input,IDENT,FOLLOW_IDENT_in_varArray5660); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENT.add(IDENT431);


            pushFollow(FOLLOW_varArraySpec_in_varArray5662);
            varArraySpec432=varArraySpec();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_varArraySpec.add(varArraySpec432.getTree());

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:842:32: ( '=' initializer )?
            int alt103=2;
            int LA103_0 = input.LA(1);

            if ( (LA103_0==ASSIGN) ) {
                alt103=1;
            }
            switch (alt103) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:842:33: '=' initializer
                    {
                    char_literal433=(Atom)match(input,ASSIGN,FOLLOW_ASSIGN_in_varArray5665); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ASSIGN.add(char_literal433);


                    pushFollow(FOLLOW_initializer_in_varArray5667);
                    initializer434=initializer();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_initializer.add(initializer434.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: IDENT, initializer, varArraySpec, typeName
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (BaseNode)adaptor.nil();
            // 843:2: -> ^( D_ARR[\"D_Arr\", atFlags] typeName IDENT varArraySpec ( initializer )? )
            {
                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:843:6: ^( D_ARR[\"D_Arr\", atFlags] typeName IDENT varArraySpec ( initializer )? )
                {
                BaseNode root_1 = (BaseNode)adaptor.nil();
                root_1 = (BaseNode)adaptor.becomeRoot(
                new DeclNode.Arr(D_ARR, "D_Arr", atFlags)
                , root_1);

                adaptor.addChild(root_1, stream_typeName.nextTree());

                adaptor.addChild(root_1, 
                stream_IDENT.nextNode()
                );

                adaptor.addChild(root_1, stream_varArraySpec.nextTree());

                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:843:74: ( initializer )?
                if ( stream_initializer.hasNext() ) {
                    adaptor.addChild(root_1, stream_initializer.nextTree());

                }
                stream_initializer.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (BaseNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BaseNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 111, varArray_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "varArray"


    public static class varArraySpec_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "varArraySpec"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:845:1: varArraySpec : ( '[' varDim ']' )+ -> ^( LIST[\"LIST\"] ( varDim )+ ) ;
    public final pollenParser.varArraySpec_return varArraySpec() throws RecognitionException {
        pollenParser.varArraySpec_return retval = new pollenParser.varArraySpec_return();
        retval.start = input.LT(1);

        int varArraySpec_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom char_literal435=null;
        Atom char_literal437=null;
        pollenParser.varDim_return varDim436 =null;


        BaseNode char_literal435_tree=null;
        BaseNode char_literal437_tree=null;
        RewriteRuleTokenStream stream_135=new RewriteRuleTokenStream(adaptor,"token 135");
        RewriteRuleTokenStream stream_136=new RewriteRuleTokenStream(adaptor,"token 136");
        RewriteRuleSubtreeStream stream_varDim=new RewriteRuleSubtreeStream(adaptor,"rule varDim");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 112) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:846:2: ( ( '[' varDim ']' )+ -> ^( LIST[\"LIST\"] ( varDim )+ ) )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:846:4: ( '[' varDim ']' )+
            {
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:846:4: ( '[' varDim ']' )+
            int cnt104=0;
            loop104:
            do {
                int alt104=2;
                int LA104_0 = input.LA(1);

                if ( (LA104_0==135) ) {
                    int LA104_1 = input.LA(2);

                    if ( (synpred179_pollen()) ) {
                        alt104=1;
                    }


                }


                switch (alt104) {
            	case 1 :
            	    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:846:5: '[' varDim ']'
            	    {
            	    char_literal435=(Atom)match(input,135,FOLLOW_135_in_varArraySpec5705); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_135.add(char_literal435);


            	    pushFollow(FOLLOW_varDim_in_varArraySpec5707);
            	    varDim436=varDim();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_varDim.add(varDim436.getTree());

            	    char_literal437=(Atom)match(input,136,FOLLOW_136_in_varArraySpec5709); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_136.add(char_literal437);


            	    }
            	    break;

            	default :
            	    if ( cnt104 >= 1 ) break loop104;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(104, input);
                        throw eee;
                }
                cnt104++;
            } while (true);


            // AST REWRITE
            // elements: varDim
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (BaseNode)adaptor.nil();
            // 846:22: -> ^( LIST[\"LIST\"] ( varDim )+ )
            {
                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:846:27: ^( LIST[\"LIST\"] ( varDim )+ )
                {
                BaseNode root_1 = (BaseNode)adaptor.nil();
                root_1 = (BaseNode)adaptor.becomeRoot(
                new ListNode(LIST, "LIST")
                , root_1);

                if ( !(stream_varDim.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_varDim.hasNext() ) {
                    adaptor.addChild(root_1, stream_varDim.nextTree());

                }
                stream_varDim.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (BaseNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BaseNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 112, varArraySpec_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "varArraySpec"


    public static class varDim_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "varDim"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:848:1: varDim : ( expr | -> NIL );
    public final pollenParser.varDim_return varDim() throws RecognitionException {
        pollenParser.varDim_return retval = new pollenParser.varDim_return();
        retval.start = input.LT(1);

        int varDim_StartIndex = input.index();

        BaseNode root_0 = null;

        pollenParser.expr_return expr438 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 113) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:849:2: ( expr | -> NIL )
            int alt105=2;
            int LA105_0 = input.LA(1);

            if ( ((LA105_0 >= BIT_NOT && LA105_0 <= CHAR)||LA105_0==DEC||LA105_0==HEX_LIT||LA105_0==IDENT||(LA105_0 >= INC && LA105_0 <= INT_LIT)||LA105_0==LOG_NOT||LA105_0==MINUS||LA105_0==OCT_LIT||LA105_0==REAL_LIT||LA105_0==STRING||LA105_0==122||(LA105_0 >= 134 && LA105_0 <= 135)||LA105_0==156||(LA105_0 >= 169 && LA105_0 <= 170)||LA105_0==180) ) {
                alt105=1;
            }
            else if ( (LA105_0==136) ) {
                alt105=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 105, 0, input);

                throw nvae;

            }
            switch (alt105) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:849:5: expr
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    pushFollow(FOLLOW_expr_in_varDim5737);
                    expr438=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr438.getTree());

                    }
                    break;
                case 2 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:850:4: 
                    {
                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (BaseNode)adaptor.nil();
                    // 850:4: -> NIL
                    {
                        adaptor.addChild(root_0, 
                        (BaseNode)adaptor.create(NIL, "NIL")
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (BaseNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BaseNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 113, varDim_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "varDim"


    public static class initializer_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "initializer"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:852:1: initializer : ( expr | '{' initializer_list ( ',' )? '}' -> initializer_list );
    public final pollenParser.initializer_return initializer() throws RecognitionException {
        pollenParser.initializer_return retval = new pollenParser.initializer_return();
        retval.start = input.LT(1);

        int initializer_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom char_literal440=null;
        Atom char_literal442=null;
        Atom char_literal443=null;
        pollenParser.expr_return expr439 =null;

        pollenParser.initializer_list_return initializer_list441 =null;


        BaseNode char_literal440_tree=null;
        BaseNode char_literal442_tree=null;
        BaseNode char_literal443_tree=null;
        RewriteRuleTokenStream stream_125=new RewriteRuleTokenStream(adaptor,"token 125");
        RewriteRuleTokenStream stream_187=new RewriteRuleTokenStream(adaptor,"token 187");
        RewriteRuleTokenStream stream_190=new RewriteRuleTokenStream(adaptor,"token 190");
        RewriteRuleSubtreeStream stream_initializer_list=new RewriteRuleSubtreeStream(adaptor,"rule initializer_list");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 114) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:853:2: ( expr | '{' initializer_list ( ',' )? '}' -> initializer_list )
            int alt107=2;
            int LA107_0 = input.LA(1);

            if ( ((LA107_0 >= BIT_NOT && LA107_0 <= CHAR)||LA107_0==DEC||LA107_0==HEX_LIT||LA107_0==IDENT||(LA107_0 >= INC && LA107_0 <= INT_LIT)||LA107_0==LOG_NOT||LA107_0==MINUS||LA107_0==OCT_LIT||LA107_0==REAL_LIT||LA107_0==STRING||LA107_0==122||(LA107_0 >= 134 && LA107_0 <= 135)||LA107_0==156||(LA107_0 >= 169 && LA107_0 <= 170)||LA107_0==180) ) {
                alt107=1;
            }
            else if ( (LA107_0==187) ) {
                alt107=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 107, 0, input);

                throw nvae;

            }
            switch (alt107) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:853:4: expr
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    pushFollow(FOLLOW_expr_in_initializer5757);
                    expr439=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr439.getTree());

                    }
                    break;
                case 2 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:854:4: '{' initializer_list ( ',' )? '}'
                    {
                    char_literal440=(Atom)match(input,187,FOLLOW_187_in_initializer5763); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_187.add(char_literal440);


                    pushFollow(FOLLOW_initializer_list_in_initializer5765);
                    initializer_list441=initializer_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_initializer_list.add(initializer_list441.getTree());

                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:854:25: ( ',' )?
                    int alt106=2;
                    int LA106_0 = input.LA(1);

                    if ( (LA106_0==125) ) {
                        alt106=1;
                    }
                    switch (alt106) {
                        case 1 :
                            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:854:25: ','
                            {
                            char_literal442=(Atom)match(input,125,FOLLOW_125_in_initializer5767); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_125.add(char_literal442);


                            }
                            break;

                    }


                    char_literal443=(Atom)match(input,190,FOLLOW_190_in_initializer5770); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_190.add(char_literal443);


                    // AST REWRITE
                    // elements: initializer_list
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (BaseNode)adaptor.nil();
                    // 854:34: -> initializer_list
                    {
                        adaptor.addChild(root_0, stream_initializer_list.nextTree());

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (BaseNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BaseNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 114, initializer_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "initializer"


    public static class initializer_list_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "initializer_list"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:856:1: initializer_list : initializer ( ',' initializer )* -> ^( LIST[\"LIST\"] ( initializer )+ ) ;
    public final pollenParser.initializer_list_return initializer_list() throws RecognitionException {
        pollenParser.initializer_list_return retval = new pollenParser.initializer_list_return();
        retval.start = input.LT(1);

        int initializer_list_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom char_literal445=null;
        pollenParser.initializer_return initializer444 =null;

        pollenParser.initializer_return initializer446 =null;


        BaseNode char_literal445_tree=null;
        RewriteRuleTokenStream stream_125=new RewriteRuleTokenStream(adaptor,"token 125");
        RewriteRuleSubtreeStream stream_initializer=new RewriteRuleSubtreeStream(adaptor,"rule initializer");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 115) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:857:2: ( initializer ( ',' initializer )* -> ^( LIST[\"LIST\"] ( initializer )+ ) )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:857:4: initializer ( ',' initializer )*
            {
            pushFollow(FOLLOW_initializer_in_initializer_list5784);
            initializer444=initializer();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_initializer.add(initializer444.getTree());

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:857:16: ( ',' initializer )*
            loop108:
            do {
                int alt108=2;
                int LA108_0 = input.LA(1);

                if ( (LA108_0==125) ) {
                    int LA108_1 = input.LA(2);

                    if ( (synpred183_pollen()) ) {
                        alt108=1;
                    }


                }


                switch (alt108) {
            	case 1 :
            	    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:857:17: ',' initializer
            	    {
            	    char_literal445=(Atom)match(input,125,FOLLOW_125_in_initializer_list5787); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_125.add(char_literal445);


            	    pushFollow(FOLLOW_initializer_in_initializer_list5789);
            	    initializer446=initializer();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_initializer.add(initializer446.getTree());

            	    }
            	    break;

            	default :
            	    break loop108;
                }
            } while (true);


            // AST REWRITE
            // elements: initializer
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (BaseNode)adaptor.nil();
            // 857:35: -> ^( LIST[\"LIST\"] ( initializer )+ )
            {
                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:857:38: ^( LIST[\"LIST\"] ( initializer )+ )
                {
                BaseNode root_1 = (BaseNode)adaptor.nil();
                root_1 = (BaseNode)adaptor.becomeRoot(
                new ListNode(LIST, "LIST")
                , root_1);

                if ( !(stream_initializer.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_initializer.hasNext() ) {
                    adaptor.addChild(root_1, stream_initializer.nextTree());

                }
                stream_initializer.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (BaseNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BaseNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 115, initializer_list_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "initializer_list"


    public static class varDeclList_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "varDeclList"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:859:1: varDeclList : ( typeName ! varDeclList | varInit ( ',' ! varInit )* );
    public final pollenParser.varDeclList_return varDeclList() throws RecognitionException {
        pollenParser.varDeclList_return retval = new pollenParser.varDeclList_return();
        retval.start = input.LT(1);

        int varDeclList_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom char_literal450=null;
        pollenParser.typeName_return typeName447 =null;

        pollenParser.varDeclList_return varDeclList448 =null;

        pollenParser.varInit_return varInit449 =null;

        pollenParser.varInit_return varInit451 =null;


        BaseNode char_literal450_tree=null;


        	assert ((varDecl_scope)varDecl_stack.peek()).typ != null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 116) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:863:2: ( typeName ! varDeclList | varInit ( ',' ! varInit )* )
            int alt110=2;
            int LA110_0 = input.LA(1);

            if ( (LA110_0==IDENT) ) {
                int LA110_1 = input.LA(2);

                if ( (synpred184_pollen()) ) {
                    alt110=1;
                }
                else if ( (true) ) {
                    alt110=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 110, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA110_0==140||LA110_0==142||(LA110_0 >= 163 && LA110_0 <= 165)||LA110_0==178||(LA110_0 >= 182 && LA110_0 <= 184)) ) {
                alt110=1;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 110, 0, input);

                throw nvae;

            }
            switch (alt110) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:863:4: typeName ! varDeclList
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    pushFollow(FOLLOW_typeName_in_varDeclList5821);
                    typeName447=typeName();

                    state._fsp--;
                    if (state.failed) return retval;

                    if ( state.backtracking==0 ) {((varDecl_scope)varDecl_stack.peek()).typ = (typeName447!=null?((BaseNode)typeName447.tree):null); }

                    pushFollow(FOLLOW_varDeclList_in_varDeclList5826);
                    varDeclList448=varDeclList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDeclList448.getTree());

                    }
                    break;
                case 2 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:864:4: varInit ( ',' ! varInit )*
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    pushFollow(FOLLOW_varInit_in_varDeclList5831);
                    varInit449=varInit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varInit449.getTree());

                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:864:12: ( ',' ! varInit )*
                    loop109:
                    do {
                        int alt109=2;
                        int LA109_0 = input.LA(1);

                        if ( (LA109_0==125) ) {
                            int LA109_1 = input.LA(2);

                            if ( (synpred185_pollen()) ) {
                                alt109=1;
                            }


                        }


                        switch (alt109) {
                    	case 1 :
                    	    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:864:13: ',' ! varInit
                    	    {
                    	    char_literal450=(Atom)match(input,125,FOLLOW_125_in_varDeclList5834); if (state.failed) return retval;

                    	    pushFollow(FOLLOW_varInit_in_varDeclList5837);
                    	    varInit451=varInit();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, varInit451.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop109;
                        }
                    } while (true);


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (BaseNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BaseNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 116, varDeclList_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "varDeclList"


    public static class varInit_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "varInit"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:866:1: varInit : IDENT ( ASSIGN expr )? -> ^( D_VAR[\"D_VAR\", atFlags] ^( IDENT ( expr )? ) ) ;
    public final pollenParser.varInit_return varInit() throws RecognitionException {
        pollenParser.varInit_return retval = new pollenParser.varInit_return();
        retval.start = input.LT(1);

        int varInit_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom IDENT452=null;
        Atom ASSIGN453=null;
        pollenParser.expr_return expr454 =null;


        BaseNode IDENT452_tree=null;
        BaseNode ASSIGN453_tree=null;
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 117) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:868:2: ( IDENT ( ASSIGN expr )? -> ^( D_VAR[\"D_VAR\", atFlags] ^( IDENT ( expr )? ) ) )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:868:4: IDENT ( ASSIGN expr )?
            {
            IDENT452=(Atom)match(input,IDENT,FOLLOW_IDENT_in_varInit5855); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENT.add(IDENT452);


            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:868:10: ( ASSIGN expr )?
            int alt111=2;
            int LA111_0 = input.LA(1);

            if ( (LA111_0==ASSIGN) ) {
                alt111=1;
            }
            switch (alt111) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:868:11: ASSIGN expr
                    {
                    ASSIGN453=(Atom)match(input,ASSIGN,FOLLOW_ASSIGN_in_varInit5858); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ASSIGN.add(ASSIGN453);


                    pushFollow(FOLLOW_expr_in_varInit5860);
                    expr454=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr454.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: expr, IDENT
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (BaseNode)adaptor.nil();
            // 869:2: -> ^( D_VAR[\"D_VAR\", atFlags] ^( IDENT ( expr )? ) )
            {
                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:869:5: ^( D_VAR[\"D_VAR\", atFlags] ^( IDENT ( expr )? ) )
                {
                BaseNode root_1 = (BaseNode)adaptor.nil();
                root_1 = (BaseNode)adaptor.becomeRoot(
                new DeclNode.Var(D_VAR, "D_VAR", atFlags)
                , root_1);

                adaptor.addChild(root_1, ((varDecl_scope)varDecl_stack.peek()).typ);

                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:869:61: ^( IDENT ( expr )? )
                {
                BaseNode root_2 = (BaseNode)adaptor.nil();
                root_2 = (BaseNode)adaptor.becomeRoot(
                stream_IDENT.nextNode()
                , root_2);

                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:869:69: ( expr )?
                if ( stream_expr.hasNext() ) {
                    adaptor.addChild(root_2, stream_expr.nextTree());

                }
                stream_expr.reset();

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (BaseNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BaseNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 117, varInit_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "varInit"


    public static class builtinType_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "builtinType"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:872:1: builtinType : ( 'bool' | 'byte' | 'int8' | 'int16' | 'int32' | 'string' | 'uint8' | 'uint16' | 'uint32' );
    public final pollenParser.builtinType_return builtinType() throws RecognitionException {
        pollenParser.builtinType_return retval = new pollenParser.builtinType_return();
        retval.start = input.LT(1);

        int builtinType_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom set455=null;

        BaseNode set455_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 118) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:873:5: ( 'bool' | 'byte' | 'int8' | 'int16' | 'int32' | 'string' | 'uint8' | 'uint16' | 'uint32' )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:
            {
            root_0 = (BaseNode)adaptor.nil();


            set455=(Atom)input.LT(1);

            if ( input.LA(1)==140||input.LA(1)==142||(input.LA(1) >= 163 && input.LA(1) <= 165)||input.LA(1)==178||(input.LA(1) >= 182 && input.LA(1) <= 184) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (BaseNode)adaptor.create(set455)
                );
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (BaseNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BaseNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 118, builtinType_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "builtinType"


    public static class qualName_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "qualName"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:883:1: qualName : IDENT ( qualNameList )? -> ^( E_IDENT[\"E_IDENT\"] IDENT ( qualNameList )? ) ;
    public final pollenParser.qualName_return qualName() throws RecognitionException {
        pollenParser.qualName_return retval = new pollenParser.qualName_return();
        retval.start = input.LT(1);

        int qualName_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom IDENT456=null;
        pollenParser.qualNameList_return qualNameList457 =null;


        BaseNode IDENT456_tree=null;
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleSubtreeStream stream_qualNameList=new RewriteRuleSubtreeStream(adaptor,"rule qualNameList");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 119) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:884:5: ( IDENT ( qualNameList )? -> ^( E_IDENT[\"E_IDENT\"] IDENT ( qualNameList )? ) )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:884:9: IDENT ( qualNameList )?
            {
            IDENT456=(Atom)match(input,IDENT,FOLLOW_IDENT_in_qualName5998); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENT.add(IDENT456);


            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:884:15: ( qualNameList )?
            int alt112=2;
            int LA112_0 = input.LA(1);

            if ( (LA112_0==126) ) {
                int LA112_1 = input.LA(2);

                if ( (synpred195_pollen()) ) {
                    alt112=1;
                }
            }
            switch (alt112) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:884:16: qualNameList
                    {
                    pushFollow(FOLLOW_qualNameList_in_qualName6001);
                    qualNameList457=qualNameList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_qualNameList.add(qualNameList457.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: IDENT, qualNameList
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (BaseNode)adaptor.nil();
            // 884:31: -> ^( E_IDENT[\"E_IDENT\"] IDENT ( qualNameList )? )
            {
                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:884:34: ^( E_IDENT[\"E_IDENT\"] IDENT ( qualNameList )? )
                {
                BaseNode root_1 = (BaseNode)adaptor.nil();
                root_1 = (BaseNode)adaptor.becomeRoot(
                new ExprNode.Ident(E_IDENT, "E_IDENT")
                , root_1);

                adaptor.addChild(root_1, 
                stream_IDENT.nextNode()
                );

                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:884:79: ( qualNameList )?
                if ( stream_qualNameList.hasNext() ) {
                    adaptor.addChild(root_1, stream_qualNameList.nextTree());

                }
                stream_qualNameList.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (BaseNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BaseNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 119, qualName_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "qualName"


    public static class qualNameList_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "qualNameList"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:887:1: qualNameList : ( '.' IDENT )+ -> ( ^( E_IDENT[\"E_IDENT\", true] IDENT ) )+ ;
    public final pollenParser.qualNameList_return qualNameList() throws RecognitionException {
        pollenParser.qualNameList_return retval = new pollenParser.qualNameList_return();
        retval.start = input.LT(1);

        int qualNameList_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom char_literal458=null;
        Atom IDENT459=null;

        BaseNode char_literal458_tree=null;
        BaseNode IDENT459_tree=null;
        RewriteRuleTokenStream stream_126=new RewriteRuleTokenStream(adaptor,"token 126");
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 120) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:888:2: ( ( '.' IDENT )+ -> ( ^( E_IDENT[\"E_IDENT\", true] IDENT ) )+ )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:889:2: ( '.' IDENT )+
            {
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:889:2: ( '.' IDENT )+
            int cnt113=0;
            loop113:
            do {
                int alt113=2;
                int LA113_0 = input.LA(1);

                if ( (LA113_0==126) ) {
                    int LA113_1 = input.LA(2);

                    if ( (synpred196_pollen()) ) {
                        alt113=1;
                    }


                }


                switch (alt113) {
            	case 1 :
            	    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:889:6: '.' IDENT
            	    {
            	    char_literal458=(Atom)match(input,126,FOLLOW_126_in_qualNameList6041); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_126.add(char_literal458);


            	    IDENT459=(Atom)match(input,IDENT,FOLLOW_IDENT_in_qualNameList6056); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_IDENT.add(IDENT459);


            	    }
            	    break;

            	default :
            	    if ( cnt113 >= 1 ) break loop113;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(113, input);
                        throw eee;
                }
                cnt113++;
            } while (true);


            // AST REWRITE
            // elements: IDENT
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (BaseNode)adaptor.nil();
            // 891:9: -> ( ^( E_IDENT[\"E_IDENT\", true] IDENT ) )+
            {
                if ( !(stream_IDENT.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_IDENT.hasNext() ) {
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:891:12: ^( E_IDENT[\"E_IDENT\", true] IDENT )
                    {
                    BaseNode root_1 = (BaseNode)adaptor.nil();
                    root_1 = (BaseNode)adaptor.becomeRoot(
                    new ExprNode.Ident(E_IDENT, "E_IDENT", true)
                    , root_1);

                    adaptor.addChild(root_1, 
                    stream_IDENT.nextNode()
                    );

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_IDENT.reset();

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (BaseNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BaseNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 120, qualNameList_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "qualNameList"


    public static class arrayLit_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "arrayLit"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:893:1: arrayLit : '[' arrayLitList ']' -> ^( LIST[\"LIST\"] arrayLitList ) ;
    public final pollenParser.arrayLit_return arrayLit() throws RecognitionException {
        pollenParser.arrayLit_return retval = new pollenParser.arrayLit_return();
        retval.start = input.LT(1);

        int arrayLit_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom char_literal460=null;
        Atom char_literal462=null;
        pollenParser.arrayLitList_return arrayLitList461 =null;


        BaseNode char_literal460_tree=null;
        BaseNode char_literal462_tree=null;
        RewriteRuleTokenStream stream_135=new RewriteRuleTokenStream(adaptor,"token 135");
        RewriteRuleTokenStream stream_136=new RewriteRuleTokenStream(adaptor,"token 136");
        RewriteRuleSubtreeStream stream_arrayLitList=new RewriteRuleSubtreeStream(adaptor,"rule arrayLitList");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 121) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:894:2: ( '[' arrayLitList ']' -> ^( LIST[\"LIST\"] arrayLitList ) )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:894:4: '[' arrayLitList ']'
            {
            char_literal460=(Atom)match(input,135,FOLLOW_135_in_arrayLit6096); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_135.add(char_literal460);


            pushFollow(FOLLOW_arrayLitList_in_arrayLit6098);
            arrayLitList461=arrayLitList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_arrayLitList.add(arrayLitList461.getTree());

            char_literal462=(Atom)match(input,136,FOLLOW_136_in_arrayLit6100); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_136.add(char_literal462);


            // AST REWRITE
            // elements: arrayLitList
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (BaseNode)adaptor.nil();
            // 894:25: -> ^( LIST[\"LIST\"] arrayLitList )
            {
                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:894:28: ^( LIST[\"LIST\"] arrayLitList )
                {
                BaseNode root_1 = (BaseNode)adaptor.nil();
                root_1 = (BaseNode)adaptor.becomeRoot(
                new ListNode(LIST, "LIST")
                , root_1);

                adaptor.addChild(root_1, stream_arrayLitList.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (BaseNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BaseNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 121, arrayLit_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "arrayLit"


    public static class arrayLitList_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "arrayLitList"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:896:1: arrayLitList : ( arrayLitElem ( ',' arrayLitElem )* -> ( arrayLitElem )+ | -> NIL );
    public final pollenParser.arrayLitList_return arrayLitList() throws RecognitionException {
        pollenParser.arrayLitList_return retval = new pollenParser.arrayLitList_return();
        retval.start = input.LT(1);

        int arrayLitList_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom char_literal464=null;
        pollenParser.arrayLitElem_return arrayLitElem463 =null;

        pollenParser.arrayLitElem_return arrayLitElem465 =null;


        BaseNode char_literal464_tree=null;
        RewriteRuleTokenStream stream_125=new RewriteRuleTokenStream(adaptor,"token 125");
        RewriteRuleSubtreeStream stream_arrayLitElem=new RewriteRuleSubtreeStream(adaptor,"rule arrayLitElem");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 122) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:897:2: ( arrayLitElem ( ',' arrayLitElem )* -> ( arrayLitElem )+ | -> NIL )
            int alt115=2;
            int LA115_0 = input.LA(1);

            if ( (LA115_0==CHAR||LA115_0==HEX_LIT||LA115_0==IDENT||LA115_0==INT_LIT||LA115_0==OCT_LIT||LA115_0==REAL_LIT||LA115_0==STRING||LA115_0==156||LA115_0==170||LA115_0==180) ) {
                alt115=1;
            }
            else if ( (LA115_0==136) ) {
                alt115=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 115, 0, input);

                throw nvae;

            }
            switch (alt115) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:897:4: arrayLitElem ( ',' arrayLitElem )*
                    {
                    pushFollow(FOLLOW_arrayLitElem_in_arrayLitList6122);
                    arrayLitElem463=arrayLitElem();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_arrayLitElem.add(arrayLitElem463.getTree());

                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:897:17: ( ',' arrayLitElem )*
                    loop114:
                    do {
                        int alt114=2;
                        int LA114_0 = input.LA(1);

                        if ( (LA114_0==125) ) {
                            alt114=1;
                        }


                        switch (alt114) {
                    	case 1 :
                    	    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:897:18: ',' arrayLitElem
                    	    {
                    	    char_literal464=(Atom)match(input,125,FOLLOW_125_in_arrayLitList6125); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_125.add(char_literal464);


                    	    pushFollow(FOLLOW_arrayLitElem_in_arrayLitList6127);
                    	    arrayLitElem465=arrayLitElem();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_arrayLitElem.add(arrayLitElem465.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop114;
                        }
                    } while (true);


                    // AST REWRITE
                    // elements: arrayLitElem
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (BaseNode)adaptor.nil();
                    // 897:37: -> ( arrayLitElem )+
                    {
                        if ( !(stream_arrayLitElem.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_arrayLitElem.hasNext() ) {
                            adaptor.addChild(root_0, stream_arrayLitElem.nextTree());

                        }
                        stream_arrayLitElem.reset();

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:898:4: 
                    {
                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (BaseNode)adaptor.nil();
                    // 898:4: -> NIL
                    {
                        adaptor.addChild(root_0, 
                        (BaseNode)adaptor.create(NIL, "NIL")
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (BaseNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BaseNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 122, arrayLitList_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "arrayLitList"


    public static class arrayLitElem_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "arrayLitElem"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:900:1: arrayLitElem : ( primitiveLit | namedConstant );
    public final pollenParser.arrayLitElem_return arrayLitElem() throws RecognitionException {
        pollenParser.arrayLitElem_return retval = new pollenParser.arrayLitElem_return();
        retval.start = input.LT(1);

        int arrayLitElem_StartIndex = input.index();

        BaseNode root_0 = null;

        pollenParser.primitiveLit_return primitiveLit466 =null;

        pollenParser.namedConstant_return namedConstant467 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 123) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:901:2: ( primitiveLit | namedConstant )
            int alt116=2;
            int LA116_0 = input.LA(1);

            if ( (LA116_0==CHAR||LA116_0==HEX_LIT||LA116_0==INT_LIT||LA116_0==OCT_LIT||LA116_0==REAL_LIT||LA116_0==STRING||LA116_0==156||LA116_0==170||LA116_0==180) ) {
                alt116=1;
            }
            else if ( (LA116_0==IDENT) ) {
                alt116=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 116, 0, input);

                throw nvae;

            }
            switch (alt116) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:901:4: primitiveLit
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    pushFollow(FOLLOW_primitiveLit_in_arrayLitElem6151);
                    primitiveLit466=primitiveLit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveLit466.getTree());

                    }
                    break;
                case 2 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:901:19: namedConstant
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    pushFollow(FOLLOW_namedConstant_in_arrayLitElem6155);
                    namedConstant467=namedConstant();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, namedConstant467.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (BaseNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BaseNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 123, arrayLitElem_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "arrayLitElem"


    public static class namedConstant_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "namedConstant"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:903:1: namedConstant : qualName ;
    public final pollenParser.namedConstant_return namedConstant() throws RecognitionException {
        pollenParser.namedConstant_return retval = new pollenParser.namedConstant_return();
        retval.start = input.LT(1);

        int namedConstant_StartIndex = input.index();

        BaseNode root_0 = null;

        pollenParser.qualName_return qualName468 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 124) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:904:2: ( qualName )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:904:4: qualName
            {
            root_0 = (BaseNode)adaptor.nil();


            pushFollow(FOLLOW_qualName_in_namedConstant6165);
            qualName468=qualName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, qualName468.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (BaseNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BaseNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 124, namedConstant_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "namedConstant"


    public static class boolLit_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "boolLit"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:906:1: boolLit : ( 'true' | 'false' ) ;
    public final pollenParser.boolLit_return boolLit() throws RecognitionException {
        pollenParser.boolLit_return retval = new pollenParser.boolLit_return();
        retval.start = input.LT(1);

        int boolLit_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom set469=null;

        BaseNode set469_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 125) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:907:2: ( ( 'true' | 'false' ) )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:907:4: ( 'true' | 'false' )
            {
            root_0 = (BaseNode)adaptor.nil();


            set469=(Atom)input.LT(1);

            if ( input.LA(1)==156||input.LA(1)==180 ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (BaseNode)adaptor.create(set469)
                );
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            if ( state.backtracking==0 ) { litFlags.add(LitFlags.BOOL);}

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (BaseNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BaseNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 125, boolLit_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "boolLit"


    public static class nullLit_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "nullLit"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:909:1: nullLit : 'null' ;
    public final pollenParser.nullLit_return nullLit() throws RecognitionException {
        pollenParser.nullLit_return retval = new pollenParser.nullLit_return();
        retval.start = input.LT(1);

        int nullLit_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom string_literal470=null;

        BaseNode string_literal470_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 126) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:910:2: ( 'null' )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:910:4: 'null'
            {
            root_0 = (BaseNode)adaptor.nil();


            string_literal470=(Atom)match(input,170,FOLLOW_170_in_nullLit6195); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal470_tree = 
            (BaseNode)adaptor.create(string_literal470)
            ;
            adaptor.addChild(root_0, string_literal470_tree);
            }

            if ( state.backtracking==0 ) {litFlags.add(LitFlags.NULL);}

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (BaseNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BaseNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 126, nullLit_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "nullLit"


    public static class numLit_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "numLit"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:912:1: numLit : ( INT_LIT | OCT_LIT | REAL_LIT | HEX_LIT );
    public final pollenParser.numLit_return numLit() throws RecognitionException {
        pollenParser.numLit_return retval = new pollenParser.numLit_return();
        retval.start = input.LT(1);

        int numLit_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom INT_LIT471=null;
        Atom OCT_LIT472=null;
        Atom REAL_LIT473=null;
        Atom HEX_LIT474=null;

        BaseNode INT_LIT471_tree=null;
        BaseNode OCT_LIT472_tree=null;
        BaseNode REAL_LIT473_tree=null;
        BaseNode HEX_LIT474_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 127) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:916:2: ( INT_LIT | OCT_LIT | REAL_LIT | HEX_LIT )
            int alt117=4;
            switch ( input.LA(1) ) {
            case INT_LIT:
                {
                alt117=1;
                }
                break;
            case OCT_LIT:
                {
                alt117=2;
                }
                break;
            case REAL_LIT:
                {
                alt117=3;
                }
                break;
            case HEX_LIT:
                {
                alt117=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 117, 0, input);

                throw nvae;

            }

            switch (alt117) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:916:4: INT_LIT
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    INT_LIT471=(Atom)match(input,INT_LIT,FOLLOW_INT_LIT_in_numLit6212); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INT_LIT471_tree = 
                    (BaseNode)adaptor.create(INT_LIT471)
                    ;
                    adaptor.addChild(root_0, INT_LIT471_tree);
                    }

                    if ( state.backtracking==0 ) {litFlags.add(LitFlags.INT);}

                    }
                    break;
                case 2 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:917:5: OCT_LIT
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    OCT_LIT472=(Atom)match(input,OCT_LIT,FOLLOW_OCT_LIT_in_numLit6221); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    OCT_LIT472_tree = 
                    (BaseNode)adaptor.create(OCT_LIT472)
                    ;
                    adaptor.addChild(root_0, OCT_LIT472_tree);
                    }

                    if ( state.backtracking==0 ) {litFlags.add(LitFlags.OCT);}

                    }
                    break;
                case 3 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:918:5: REAL_LIT
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    REAL_LIT473=(Atom)match(input,REAL_LIT,FOLLOW_REAL_LIT_in_numLit6230); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    REAL_LIT473_tree = 
                    (BaseNode)adaptor.create(REAL_LIT473)
                    ;
                    adaptor.addChild(root_0, REAL_LIT473_tree);
                    }

                    if ( state.backtracking==0 ) {litFlags.add(LitFlags.REAL);}

                    }
                    break;
                case 4 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:919:5: HEX_LIT
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    HEX_LIT474=(Atom)match(input,HEX_LIT,FOLLOW_HEX_LIT_in_numLit6239); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    HEX_LIT474_tree = 
                    (BaseNode)adaptor.create(HEX_LIT474)
                    ;
                    adaptor.addChild(root_0, HEX_LIT474_tree);
                    }

                    if ( state.backtracking==0 ) {litFlags.add(LitFlags.HEX);}

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (BaseNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) {
            	litFlags.add(LitFlags.NUM);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BaseNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 127, numLit_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "numLit"


    public static class primitiveLit_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "primitiveLit"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:922:1: primitiveLit : ( boolLit -> ^( E_CONST[\"E_CONST\", litFlags] boolLit ) | numLit -> ^( E_CONST[\"E_CONST\", litFlags] numLit ) | nullLit -> ^( E_CONST[\"E_CONST\", litFlags] nullLit ) | STRING -> ^( E_CONST[\"E_CONST\", litFlags] STRING ) | CHAR -> ^( E_CONST[\"E_CONST\", litFlags] CHAR ) );
    public final pollenParser.primitiveLit_return primitiveLit() throws RecognitionException {
        pollenParser.primitiveLit_return retval = new pollenParser.primitiveLit_return();
        retval.start = input.LT(1);

        int primitiveLit_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom STRING478=null;
        Atom CHAR479=null;
        pollenParser.boolLit_return boolLit475 =null;

        pollenParser.numLit_return numLit476 =null;

        pollenParser.nullLit_return nullLit477 =null;


        BaseNode STRING478_tree=null;
        BaseNode CHAR479_tree=null;
        RewriteRuleTokenStream stream_CHAR=new RewriteRuleTokenStream(adaptor,"token CHAR");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");
        RewriteRuleSubtreeStream stream_numLit=new RewriteRuleSubtreeStream(adaptor,"rule numLit");
        RewriteRuleSubtreeStream stream_nullLit=new RewriteRuleSubtreeStream(adaptor,"rule nullLit");
        RewriteRuleSubtreeStream stream_boolLit=new RewriteRuleSubtreeStream(adaptor,"rule boolLit");

        	litFlags.clear();	

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 128) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:929:2: ( boolLit -> ^( E_CONST[\"E_CONST\", litFlags] boolLit ) | numLit -> ^( E_CONST[\"E_CONST\", litFlags] numLit ) | nullLit -> ^( E_CONST[\"E_CONST\", litFlags] nullLit ) | STRING -> ^( E_CONST[\"E_CONST\", litFlags] STRING ) | CHAR -> ^( E_CONST[\"E_CONST\", litFlags] CHAR ) )
            int alt118=5;
            switch ( input.LA(1) ) {
            case 156:
            case 180:
                {
                alt118=1;
                }
                break;
            case HEX_LIT:
            case INT_LIT:
            case OCT_LIT:
            case REAL_LIT:
                {
                alt118=2;
                }
                break;
            case 170:
                {
                alt118=3;
                }
                break;
            case STRING:
                {
                alt118=4;
                }
                break;
            case CHAR:
                {
                alt118=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 118, 0, input);

                throw nvae;

            }

            switch (alt118) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:929:4: boolLit
                    {
                    pushFollow(FOLLOW_boolLit_in_primitiveLit6264);
                    boolLit475=boolLit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_boolLit.add(boolLit475.getTree());

                    // AST REWRITE
                    // elements: boolLit
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (BaseNode)adaptor.nil();
                    // 929:12: -> ^( E_CONST[\"E_CONST\", litFlags] boolLit )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:929:15: ^( E_CONST[\"E_CONST\", litFlags] boolLit )
                        {
                        BaseNode root_1 = (BaseNode)adaptor.nil();
                        root_1 = (BaseNode)adaptor.becomeRoot(
                        new ExprNode.Const(E_CONST, "E_CONST", litFlags)
                        , root_1);

                        adaptor.addChild(root_1, stream_boolLit.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:930:4: numLit
                    {
                    pushFollow(FOLLOW_numLit_in_primitiveLit6283);
                    numLit476=numLit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_numLit.add(numLit476.getTree());

                    // AST REWRITE
                    // elements: numLit
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (BaseNode)adaptor.nil();
                    // 930:12: -> ^( E_CONST[\"E_CONST\", litFlags] numLit )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:930:15: ^( E_CONST[\"E_CONST\", litFlags] numLit )
                        {
                        BaseNode root_1 = (BaseNode)adaptor.nil();
                        root_1 = (BaseNode)adaptor.becomeRoot(
                        new ExprNode.Const(E_CONST, "E_CONST", litFlags)
                        , root_1);

                        adaptor.addChild(root_1, stream_numLit.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 3 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:931:4: nullLit
                    {
                    pushFollow(FOLLOW_nullLit_in_primitiveLit6303);
                    nullLit477=nullLit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_nullLit.add(nullLit477.getTree());

                    // AST REWRITE
                    // elements: nullLit
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (BaseNode)adaptor.nil();
                    // 931:12: -> ^( E_CONST[\"E_CONST\", litFlags] nullLit )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:931:15: ^( E_CONST[\"E_CONST\", litFlags] nullLit )
                        {
                        BaseNode root_1 = (BaseNode)adaptor.nil();
                        root_1 = (BaseNode)adaptor.becomeRoot(
                        new ExprNode.Const(E_CONST, "E_CONST", litFlags)
                        , root_1);

                        adaptor.addChild(root_1, stream_nullLit.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 4 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:932:4: STRING
                    {
                    STRING478=(Atom)match(input,STRING,FOLLOW_STRING_in_primitiveLit6322); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_STRING.add(STRING478);


                    if ( state.backtracking==0 ) {litFlags.add(LitFlags.STR);}

                    // AST REWRITE
                    // elements: STRING
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (BaseNode)adaptor.nil();
                    // 933:5: -> ^( E_CONST[\"E_CONST\", litFlags] STRING )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:933:8: ^( E_CONST[\"E_CONST\", litFlags] STRING )
                        {
                        BaseNode root_1 = (BaseNode)adaptor.nil();
                        root_1 = (BaseNode)adaptor.becomeRoot(
                        new ExprNode.Const(E_CONST, "E_CONST", litFlags)
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_STRING.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 5 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:934:4: CHAR
                    {
                    CHAR479=(Atom)match(input,CHAR,FOLLOW_CHAR_in_primitiveLit6350); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CHAR.add(CHAR479);


                    if ( state.backtracking==0 ) {litFlags.add(LitFlags.CHR);}

                    // AST REWRITE
                    // elements: CHAR
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (BaseNode)adaptor.nil();
                    // 935:6: -> ^( E_CONST[\"E_CONST\", litFlags] CHAR )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:935:9: ^( E_CONST[\"E_CONST\", litFlags] CHAR )
                        {
                        BaseNode root_1 = (BaseNode)adaptor.nil();
                        root_1 = (BaseNode)adaptor.becomeRoot(
                        new ExprNode.Const(E_CONST, "E_CONST", litFlags)
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_CHAR.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (BaseNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) {
            	litFlags.clear();	
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BaseNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 128, primitiveLit_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "primitiveLit"


    public static class stmtInjection_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stmtInjection"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:937:1: stmtInjection : c= INJECT ( NL )+ -> ^( E_INJECT[\"E_INJECT\"] INJECT ) ;
    public final pollenParser.stmtInjection_return stmtInjection() throws RecognitionException {
        pollenParser.stmtInjection_return retval = new pollenParser.stmtInjection_return();
        retval.start = input.LT(1);

        int stmtInjection_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom c=null;
        Atom NL480=null;

        BaseNode c_tree=null;
        BaseNode NL480_tree=null;
        RewriteRuleTokenStream stream_INJECT=new RewriteRuleTokenStream(adaptor,"token INJECT");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 129) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:938:2: (c= INJECT ( NL )+ -> ^( E_INJECT[\"E_INJECT\"] INJECT ) )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:938:4: c= INJECT ( NL )+
            {
            c=(Atom)match(input,INJECT,FOLLOW_INJECT_in_stmtInjection6385); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_INJECT.add(c);


            if ( state.backtracking==0 ) {           
                        c.setText(getInject(c.getText()));
                    }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:941:2: ( NL )+
            int cnt119=0;
            loop119:
            do {
                int alt119=2;
                int LA119_0 = input.LA(1);

                if ( (LA119_0==NL) ) {
                    int LA119_1 = input.LA(2);

                    if ( (synpred208_pollen()) ) {
                        alt119=1;
                    }


                }


                switch (alt119) {
            	case 1 :
            	    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:941:2: NL
            	    {
            	    NL480=(Atom)match(input,NL,FOLLOW_NL_in_stmtInjection6391); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_NL.add(NL480);


            	    }
            	    break;

            	default :
            	    if ( cnt119 >= 1 ) break loop119;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(119, input);
                        throw eee;
                }
                cnt119++;
            } while (true);


            // AST REWRITE
            // elements: INJECT
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (BaseNode)adaptor.nil();
            // 942:2: -> ^( E_INJECT[\"E_INJECT\"] INJECT )
            {
                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:942:5: ^( E_INJECT[\"E_INJECT\"] INJECT )
                {
                BaseNode root_1 = (BaseNode)adaptor.nil();
                root_1 = (BaseNode)adaptor.becomeRoot(
                new ExprNode.Inject(E_INJECT, "E_INJECT")
                , root_1);

                adaptor.addChild(root_1, 
                stream_INJECT.nextNode()
                );

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (BaseNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BaseNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 129, stmtInjection_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "stmtInjection"


    public static class injectionCode_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "injectionCode"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:944:1: injectionCode : c= INJECT -> ^( E_INJECT[\"E_INJECT\"] INJECT ) ;
    public final pollenParser.injectionCode_return injectionCode() throws RecognitionException {
        pollenParser.injectionCode_return retval = new pollenParser.injectionCode_return();
        retval.start = input.LT(1);

        int injectionCode_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom c=null;

        BaseNode c_tree=null;
        RewriteRuleTokenStream stream_INJECT=new RewriteRuleTokenStream(adaptor,"token INJECT");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 130) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:945:2: (c= INJECT -> ^( E_INJECT[\"E_INJECT\"] INJECT ) )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:945:4: c= INJECT
            {
            c=(Atom)match(input,INJECT,FOLLOW_INJECT_in_injectionCode6420); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_INJECT.add(c);


            if ( state.backtracking==0 ) {           
                        c.setText(getInject(c.getText()));
                    }

            // AST REWRITE
            // elements: INJECT
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (BaseNode)adaptor.nil();
            // 948:2: -> ^( E_INJECT[\"E_INJECT\"] INJECT )
            {
                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:948:5: ^( E_INJECT[\"E_INJECT\"] INJECT )
                {
                BaseNode root_1 = (BaseNode)adaptor.nil();
                root_1 = (BaseNode)adaptor.becomeRoot(
                new ExprNode.Inject(E_INJECT, "E_INJECT")
                , root_1);

                adaptor.addChild(root_1, 
                stream_INJECT.nextNode()
                );

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (BaseNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BaseNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 130, injectionCode_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "injectionCode"


    public static class delim_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "delim"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:950:1: delim : ( ( SEMI ) ( NL )* ->| ( NL )+ ->| ( ( NL )* '}' )=> ( NL )* ->);
    public final pollenParser.delim_return delim() throws RecognitionException {
        pollenParser.delim_return retval = new pollenParser.delim_return();
        retval.start = input.LT(1);

        int delim_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom SEMI481=null;
        Atom NL482=null;
        Atom NL483=null;
        Atom NL484=null;

        BaseNode SEMI481_tree=null;
        BaseNode NL482_tree=null;
        BaseNode NL483_tree=null;
        BaseNode NL484_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 131) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:951:2: ( ( SEMI ) ( NL )* ->| ( NL )+ ->| ( ( NL )* '}' )=> ( NL )* ->)
            int alt123=3;
            int LA123_0 = input.LA(1);

            if ( (LA123_0==SEMI) ) {
                int LA123_1 = input.LA(2);

                if ( (synpred210_pollen()) ) {
                    alt123=1;
                }
                else if ( (synpred214_pollen()) ) {
                    alt123=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 123, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA123_0==NL) ) {
                int LA123_2 = input.LA(2);

                if ( (synpred212_pollen()) ) {
                    alt123=2;
                }
                else if ( (synpred214_pollen()) ) {
                    alt123=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 123, 2, input);

                    throw nvae;

                }
            }
            else if ( (LA123_0==158) && (synpred214_pollen())) {
                alt123=3;
            }
            else if ( (LA123_0==162) && (synpred214_pollen())) {
                alt123=3;
            }
            else if ( (LA123_0==INJECT) && (synpred214_pollen())) {
                alt123=3;
            }
            else if ( (LA123_0==167) && (synpred214_pollen())) {
                alt123=3;
            }
            else if ( (LA123_0==168) && (synpred214_pollen())) {
                alt123=3;
            }
            else if ( (LA123_0==144) && (synpred214_pollen())) {
                alt123=3;
            }
            else if ( (LA123_0==174) && (synpred214_pollen())) {
                alt123=3;
            }
            else if ( (LA123_0==145) && (synpred214_pollen())) {
                alt123=3;
            }
            else if ( (LA123_0==152) && (synpred214_pollen())) {
                alt123=3;
            }
            else if ( (LA123_0==EOF) && (synpred214_pollen())) {
                alt123=3;
            }
            else if ( (LA123_0==190) && (synpred214_pollen())) {
                alt123=3;
            }
            else if ( (LA123_0==154) && (synpred214_pollen())) {
                alt123=3;
            }
            else if ( (LA123_0==176) && (synpred214_pollen())) {
                alt123=3;
            }
            else if ( (LA123_0==159) && (synpred214_pollen())) {
                alt123=3;
            }
            else if ( (LA123_0==140||LA123_0==142||(LA123_0 >= 163 && LA123_0 <= 165)||LA123_0==178||(LA123_0 >= 182 && LA123_0 <= 184)) && (synpred214_pollen())) {
                alt123=3;
            }
            else if ( (LA123_0==IDENT) && (synpred214_pollen())) {
                alt123=3;
            }
            else if ( (LA123_0==122) && (synpred214_pollen())) {
                alt123=3;
            }
            else if ( (LA123_0==146) && (synpred214_pollen())) {
                alt123=3;
            }
            else if ( (LA123_0==185) && (synpred214_pollen())) {
                alt123=3;
            }
            else if ( (LA123_0==169) && (synpred214_pollen())) {
                alt123=3;
            }
            else if ( (LA123_0==125) && (synpred214_pollen())) {
                alt123=3;
            }
            else if ( (LA123_0==148) && (synpred214_pollen())) {
                alt123=3;
            }
            else if ( (LA123_0==143) && (synpred214_pollen())) {
                alt123=3;
            }
            else if ( (LA123_0==134) && (synpred214_pollen())) {
                alt123=3;
            }
            else if ( (LA123_0==139) && (synpred214_pollen())) {
                alt123=3;
            }
            else if ( (LA123_0==187) && (synpred214_pollen())) {
                alt123=3;
            }
            else if ( (LA123_0==173) && (synpred214_pollen())) {
                alt123=3;
            }
            else if ( (LA123_0==177) && (synpred214_pollen())) {
                alt123=3;
            }
            else if ( (LA123_0==141) && (synpred214_pollen())) {
                alt123=3;
            }
            else if ( (LA123_0==147) && (synpred214_pollen())) {
                alt123=3;
            }
            else if ( (LA123_0==157) && (synpred214_pollen())) {
                alt123=3;
            }
            else if ( (LA123_0==179) && (synpred214_pollen())) {
                alt123=3;
            }
            else if ( (LA123_0==149) && (synpred214_pollen())) {
                alt123=3;
            }
            else if ( (LA123_0==160) && (synpred214_pollen())) {
                alt123=3;
            }
            else if ( (LA123_0==175) && (synpred214_pollen())) {
                alt123=3;
            }
            else if ( (LA123_0==186) && (synpred214_pollen())) {
                alt123=3;
            }
            else if ( (LA123_0==156||LA123_0==180) && (synpred214_pollen())) {
                alt123=3;
            }
            else if ( (LA123_0==INT_LIT) && (synpred214_pollen())) {
                alt123=3;
            }
            else if ( (LA123_0==OCT_LIT) && (synpred214_pollen())) {
                alt123=3;
            }
            else if ( (LA123_0==REAL_LIT) && (synpred214_pollen())) {
                alt123=3;
            }
            else if ( (LA123_0==HEX_LIT) && (synpred214_pollen())) {
                alt123=3;
            }
            else if ( (LA123_0==170) && (synpred214_pollen())) {
                alt123=3;
            }
            else if ( (LA123_0==STRING) && (synpred214_pollen())) {
                alt123=3;
            }
            else if ( (LA123_0==CHAR) && (synpred214_pollen())) {
                alt123=3;
            }
            else if ( (LA123_0==135) && (synpred214_pollen())) {
                alt123=3;
            }
            else if ( (LA123_0==LOG_NOT) && (synpred214_pollen())) {
                alt123=3;
            }
            else if ( (LA123_0==BIT_NOT) && (synpred214_pollen())) {
                alt123=3;
            }
            else if ( (LA123_0==MINUS) && (synpred214_pollen())) {
                alt123=3;
            }
            else if ( (LA123_0==DEC||LA123_0==INC) && (synpred214_pollen())) {
                alt123=3;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 123, 0, input);

                throw nvae;

            }
            switch (alt123) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:951:4: ( SEMI ) ( NL )*
                    {
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:951:4: ( SEMI )
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:951:5: SEMI
                    {
                    SEMI481=(Atom)match(input,SEMI,FOLLOW_SEMI_in_delim6451); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI481);


                    }


                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:951:11: ( NL )*
                    loop120:
                    do {
                        int alt120=2;
                        int LA120_0 = input.LA(1);

                        if ( (LA120_0==NL) ) {
                            int LA120_1 = input.LA(2);

                            if ( (synpred209_pollen()) ) {
                                alt120=1;
                            }


                        }


                        switch (alt120) {
                    	case 1 :
                    	    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:951:12: NL
                    	    {
                    	    NL482=(Atom)match(input,NL,FOLLOW_NL_in_delim6455); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_NL.add(NL482);


                    	    }
                    	    break;

                    	default :
                    	    break loop120;
                        }
                    } while (true);


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (BaseNode)adaptor.nil();
                    // 951:17: ->
                    {
                        root_0 = null;
                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:952:4: ( NL )+
                    {
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:952:4: ( NL )+
                    int cnt121=0;
                    loop121:
                    do {
                        int alt121=2;
                        int LA121_0 = input.LA(1);

                        if ( (LA121_0==NL) ) {
                            int LA121_1 = input.LA(2);

                            if ( (synpred211_pollen()) ) {
                                alt121=1;
                            }


                        }


                        switch (alt121) {
                    	case 1 :
                    	    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:952:5: NL
                    	    {
                    	    NL483=(Atom)match(input,NL,FOLLOW_NL_in_delim6466); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_NL.add(NL483);


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt121 >= 1 ) break loop121;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(121, input);
                                throw eee;
                        }
                        cnt121++;
                    } while (true);


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (BaseNode)adaptor.nil();
                    // 952:10: ->
                    {
                        root_0 = null;
                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 3 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:954:4: ( ( NL )* '}' )=> ( NL )*
                    {
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:954:20: ( NL )*
                    loop122:
                    do {
                        int alt122=2;
                        int LA122_0 = input.LA(1);

                        if ( (LA122_0==NL) ) {
                            int LA122_1 = input.LA(2);

                            if ( (synpred215_pollen()) ) {
                                alt122=1;
                            }


                        }


                        switch (alt122) {
                    	case 1 :
                    	    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:954:20: NL
                    	    {
                    	    NL484=(Atom)match(input,NL,FOLLOW_NL_in_delim6490); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_NL.add(NL484);


                    	    }
                    	    break;

                    	default :
                    	    break loop122;
                        }
                    } while (true);


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (BaseNode)adaptor.nil();
                    // 954:24: ->
                    {
                        root_0 = null;
                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (BaseNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BaseNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 131, delim_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "delim"

    // $ANTLR start synpred2_pollen
    public final void synpred2_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:200:8: ( stmtInjection )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:200:8: stmtInjection
        {
        pushFollow(FOLLOW_stmtInjection_in_synpred2_pollen694);
        stmtInjection();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred2_pollen

    // $ANTLR start synpred6_pollen
    public final void synpred6_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:213:9: ( stmtExport )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:213:9: stmtExport
        {
        pushFollow(FOLLOW_stmtExport_in_synpred6_pollen795);
        stmtExport();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred6_pollen

    // $ANTLR start synpred9_pollen
    public final void synpred9_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:239:9: ( fcnDefinition )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:239:9: fcnDefinition
        {
        pushFollow(FOLLOW_fcnDefinition_in_synpred9_pollen904);
        fcnDefinition();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred9_pollen

    // $ANTLR start synpred11_pollen
    public final void synpred11_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:241:9: ( varDeclaration )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:241:9: varDeclaration
        {
        pushFollow(FOLLOW_varDeclaration_in_synpred11_pollen925);
        varDeclaration();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred11_pollen

    // $ANTLR start synpred15_pollen
    public final void synpred15_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:253:6: ( fcnDefinition )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:253:6: fcnDefinition
        {
        pushFollow(FOLLOW_fcnDefinition_in_synpred15_pollen1027);
        fcnDefinition();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred15_pollen

    // $ANTLR start synpred16_pollen
    public final void synpred16_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:254:8: ( varDeclaration )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:254:8: varDeclaration
        {
        pushFollow(FOLLOW_varDeclaration_in_synpred16_pollen1036);
        varDeclaration();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred16_pollen

    // $ANTLR start synpred20_pollen
    public final void synpred20_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:284:26: ( delim )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:284:26: delim
        {
        pushFollow(FOLLOW_delim_in_synpred20_pollen1178);
        delim();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred20_pollen

    // $ANTLR start synpred21_pollen
    public final void synpred21_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:284:4: ( IDENT ASSIGN INT_LIT ( delim )? )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:284:4: IDENT ASSIGN INT_LIT ( delim )?
        {
        match(input,IDENT,FOLLOW_IDENT_in_synpred21_pollen1171); if (state.failed) return ;

        match(input,ASSIGN,FOLLOW_ASSIGN_in_synpred21_pollen1173); if (state.failed) return ;

        match(input,INT_LIT,FOLLOW_INT_LIT_in_synpred21_pollen1175); if (state.failed) return ;

        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:284:25: ( delim )?
        int alt124=2;
        int LA124_0 = input.LA(1);

        if ( (LA124_0==NL||LA124_0==SEMI) ) {
            alt124=1;
        }
        else if ( (LA124_0==EOF) ) {
            int LA124_3 = input.LA(2);

            if ( (synpred20_pollen()) ) {
                alt124=1;
            }
        }
        switch (alt124) {
            case 1 :
                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:284:26: delim
                {
                pushFollow(FOLLOW_delim_in_synpred21_pollen1178);
                delim();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        }

    }
    // $ANTLR end synpred21_pollen

    // $ANTLR start synpred22_pollen
    public final void synpred22_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:285:11: ( delim )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:285:11: delim
        {
        pushFollow(FOLLOW_delim_in_synpred22_pollen1206);
        delim();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred22_pollen

    // $ANTLR start synpred30_pollen
    public final void synpred30_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:312:7: ( fcnDefinitionHost )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:312:7: fcnDefinitionHost
        {
        pushFollow(FOLLOW_fcnDefinitionHost_in_synpred30_pollen1385);
        fcnDefinitionHost();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred30_pollen

    // $ANTLR start synpred32_pollen
    public final void synpred32_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:314:7: ( varDeclaration )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:314:7: varDeclaration
        {
        pushFollow(FOLLOW_varDeclaration_in_synpred32_pollen1401);
        varDeclaration();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred32_pollen

    // $ANTLR start synpred34_pollen
    public final void synpred34_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:320:10: ( importAs )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:320:10: importAs
        {
        pushFollow(FOLLOW_importAs_in_synpred34_pollen1453);
        importAs();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred34_pollen

    // $ANTLR start synpred42_pollen
    public final void synpred42_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:365:7: ( '{' metaArgument ( ',' metaArgument )* '}' )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:365:7: '{' metaArgument ( ',' metaArgument )* '}'
        {
        match(input,187,FOLLOW_187_in_synpred42_pollen1732); if (state.failed) return ;

        pushFollow(FOLLOW_metaArgument_in_synpred42_pollen1734);
        metaArgument();

        state._fsp--;
        if (state.failed) return ;

        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:365:25: ( ',' metaArgument )*
        loop125:
        do {
            int alt125=2;
            int LA125_0 = input.LA(1);

            if ( (LA125_0==125) ) {
                alt125=1;
            }


            switch (alt125) {
        	case 1 :
        	    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:365:26: ',' metaArgument
        	    {
        	    match(input,125,FOLLOW_125_in_synpred42_pollen1738); if (state.failed) return ;

        	    pushFollow(FOLLOW_metaArgument_in_synpred42_pollen1740);
        	    metaArgument();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop125;
            }
        } while (true);


        match(input,190,FOLLOW_190_in_synpred42_pollen1744); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred42_pollen

    // $ANTLR start synpred45_pollen
    public final void synpred45_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:384:4: ( qualName metaArguments )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:384:4: qualName metaArguments
        {
        pushFollow(FOLLOW_qualName_in_synpred45_pollen1843);
        qualName();

        state._fsp--;
        if (state.failed) return ;

        pushFollow(FOLLOW_metaArguments_in_synpred45_pollen1845);
        metaArguments();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred45_pollen

    // $ANTLR start synpred47_pollen
    public final void synpred47_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:398:10: ( 'module' )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:398:11: 'module'
        {
        match(input,168,FOLLOW_168_in_synpred47_pollen1922); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred47_pollen

    // $ANTLR start synpred48_pollen
    public final void synpred48_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:399:8: ( 'class' )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:399:9: 'class'
        {
        match(input,144,FOLLOW_144_in_synpred48_pollen1942); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred48_pollen

    // $ANTLR start synpred49_pollen
    public final void synpred49_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:400:10: ( 'protocol' )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:400:11: 'protocol'
        {
        match(input,174,FOLLOW_174_in_synpred49_pollen1960); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred49_pollen

    // $ANTLR start synpred50_pollen
    public final void synpred50_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:401:10: ( 'composition' )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:401:11: 'composition'
        {
        match(input,145,FOLLOW_145_in_synpred50_pollen1978); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred50_pollen

    // $ANTLR start synpred51_pollen
    public final void synpred51_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:402:10: ( 'enum' )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:402:11: 'enum'
        {
        match(input,152,FOLLOW_152_in_synpred51_pollen1996); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred51_pollen

    // $ANTLR start synpred53_pollen
    public final void synpred53_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:414:23: ( NL )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:414:23: NL
        {
        match(input,NL,FOLLOW_NL_in_synpred53_pollen2080); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred53_pollen

    // $ANTLR start synpred57_pollen
    public final void synpred57_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:423:23: ( NL )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:423:23: NL
        {
        match(input,NL,FOLLOW_NL_in_synpred57_pollen2147); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred57_pollen

    // $ANTLR start synpred76_pollen
    public final void synpred76_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:453:10: ( ',' expr )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:453:10: ',' expr
        {
        match(input,125,FOLLOW_125_in_synpred76_pollen2349); if (state.failed) return ;

        pushFollow(FOLLOW_expr_in_synpred76_pollen2351);
        expr();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred76_pollen

    // $ANTLR start synpred77_pollen
    public final void synpred77_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:453:4: ( expr ( ',' expr )* )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:453:4: expr ( ',' expr )*
        {
        pushFollow(FOLLOW_expr_in_synpred77_pollen2346);
        expr();

        state._fsp--;
        if (state.failed) return ;

        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:453:9: ( ',' expr )*
        loop126:
        do {
            int alt126=2;
            int LA126_0 = input.LA(1);

            if ( (LA126_0==125) ) {
                alt126=1;
            }


            switch (alt126) {
        	case 1 :
        	    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:453:10: ',' expr
        	    {
        	    match(input,125,FOLLOW_125_in_synpred77_pollen2349); if (state.failed) return ;

        	    pushFollow(FOLLOW_expr_in_synpred77_pollen2351);
        	    expr();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop126;
            }
        } while (true);


        }

    }
    // $ANTLR end synpred77_pollen

    // $ANTLR start synpred78_pollen
    public final void synpred78_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:458:4: ( exprLogicalOr '?' expr ':' expr )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:458:4: exprLogicalOr '?' expr ':' expr
        {
        pushFollow(FOLLOW_exprLogicalOr_in_synpred78_pollen2390);
        exprLogicalOr();

        state._fsp--;
        if (state.failed) return ;

        match(input,133,FOLLOW_133_in_synpred78_pollen2392); if (state.failed) return ;

        pushFollow(FOLLOW_expr_in_synpred78_pollen2394);
        expr();

        state._fsp--;
        if (state.failed) return ;

        match(input,128,FOLLOW_128_in_synpred78_pollen2396); if (state.failed) return ;

        pushFollow(FOLLOW_expr_in_synpred78_pollen2398);
        expr();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred78_pollen

    // $ANTLR start synpred79_pollen
    public final void synpred79_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:464:4: ( '||' exprLogicalAnd )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:464:4: '||' exprLogicalAnd
        {
        match(input,189,FOLLOW_189_in_synpred79_pollen2453); if (state.failed) return ;

        pushFollow(FOLLOW_exprLogicalAnd_in_synpred79_pollen2455);
        exprLogicalAnd();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred79_pollen

    // $ANTLR start synpred80_pollen
    public final void synpred80_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:471:3: ( '&&' exprBitwiseOr )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:471:3: '&&' exprBitwiseOr
        {
        match(input,120,FOLLOW_120_in_synpred80_pollen2506); if (state.failed) return ;

        pushFollow(FOLLOW_exprBitwiseOr_in_synpred80_pollen2508);
        exprBitwiseOr();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred80_pollen

    // $ANTLR start synpred81_pollen
    public final void synpred81_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:478:3: ( '|' exprBitwiseXor )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:478:3: '|' exprBitwiseXor
        {
        match(input,188,FOLLOW_188_in_synpred81_pollen2557); if (state.failed) return ;

        pushFollow(FOLLOW_exprBitwiseXor_in_synpred81_pollen2559);
        exprBitwiseXor();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred81_pollen

    // $ANTLR start synpred82_pollen
    public final void synpred82_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:485:3: ( '^' exprBitwiseAnd )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:485:3: '^' exprBitwiseAnd
        {
        match(input,137,FOLLOW_137_in_synpred82_pollen2607); if (state.failed) return ;

        pushFollow(FOLLOW_exprBitwiseAnd_in_synpred82_pollen2609);
        exprBitwiseAnd();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred82_pollen

    // $ANTLR start synpred83_pollen
    public final void synpred83_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:492:3: ( '&' exprEquality )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:492:3: '&' exprEquality
        {
        match(input,121,FOLLOW_121_in_synpred83_pollen2657); if (state.failed) return ;

        pushFollow(FOLLOW_exprEquality_in_synpred83_pollen2659);
        exprEquality();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred83_pollen

    // $ANTLR start synpred84_pollen
    public final void synpred84_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:499:3: ( equalityOp exprRelational )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:499:3: equalityOp exprRelational
        {
        pushFollow(FOLLOW_equalityOp_in_synpred84_pollen2708);
        equalityOp();

        state._fsp--;
        if (state.failed) return ;

        pushFollow(FOLLOW_exprRelational_in_synpred84_pollen2710);
        exprRelational();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred84_pollen

    // $ANTLR start synpred85_pollen
    public final void synpred85_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:506:3: ( relationalOp exprShift )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:506:3: relationalOp exprShift
        {
        pushFollow(FOLLOW_relationalOp_in_synpred85_pollen2759);
        relationalOp();

        state._fsp--;
        if (state.failed) return ;

        pushFollow(FOLLOW_exprShift_in_synpred85_pollen2761);
        exprShift();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred85_pollen

    // $ANTLR start synpred86_pollen
    public final void synpred86_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:513:3: ( shiftOp exprAddSub )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:513:3: shiftOp exprAddSub
        {
        pushFollow(FOLLOW_shiftOp_in_synpred86_pollen2811);
        shiftOp();

        state._fsp--;
        if (state.failed) return ;

        pushFollow(FOLLOW_exprAddSub_in_synpred86_pollen2814);
        exprAddSub();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred86_pollen

    // $ANTLR start synpred87_pollen
    public final void synpred87_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:520:3: ( addSubOp exprMultDiv )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:520:3: addSubOp exprMultDiv
        {
        pushFollow(FOLLOW_addSubOp_in_synpred87_pollen2863);
        addSubOp();

        state._fsp--;
        if (state.failed) return ;

        pushFollow(FOLLOW_exprMultDiv_in_synpred87_pollen2865);
        exprMultDiv();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred87_pollen

    // $ANTLR start synpred88_pollen
    public final void synpred88_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:527:3: ( multDivModOp exprUnary )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:527:3: multDivModOp exprUnary
        {
        pushFollow(FOLLOW_multDivModOp_in_synpred88_pollen2920);
        multDivModOp();

        state._fsp--;
        if (state.failed) return ;

        pushFollow(FOLLOW_exprUnary_in_synpred88_pollen2922);
        exprUnary();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred88_pollen

    // $ANTLR start synpred96_pollen
    public final void synpred96_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:542:4: ( varOrFcnOrArray incDecOp )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:542:4: varOrFcnOrArray incDecOp
        {
        pushFollow(FOLLOW_varOrFcnOrArray_in_synpred96_pollen3120);
        varOrFcnOrArray();

        state._fsp--;
        if (state.failed) return ;

        pushFollow(FOLLOW_incDecOp_in_synpred96_pollen3122);
        incDecOp();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred96_pollen

    // $ANTLR start synpred97_pollen
    public final void synpred97_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:543:4: ( varOrFcnOrArray )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:543:4: varOrFcnOrArray
        {
        pushFollow(FOLLOW_varOrFcnOrArray_in_synpred97_pollen3143);
        varOrFcnOrArray();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred97_pollen

    // $ANTLR start synpred107_pollen
    public final void synpred107_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:602:4: ( typeName qualName )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:602:4: typeName qualName
        {
        pushFollow(FOLLOW_typeName_in_synpred107_pollen3457);
        typeName();

        state._fsp--;
        if (state.failed) return ;

        pushFollow(FOLLOW_qualName_in_synpred107_pollen3459);
        qualName();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred107_pollen

    // $ANTLR start synpred108_pollen
    public final void synpred108_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:604:4: ({...}? typeName )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:604:4: {...}? typeName
        {
        if ( !((input.LT(1).getText().equals(ti.getTypeName()) )) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred108_pollen", "input.LT(1).getText().equals(ti.getTypeName()) ");
        }

        pushFollow(FOLLOW_typeName_in_synpred108_pollen3495);
        typeName();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred108_pollen

    // $ANTLR start synpred109_pollen
    public final void synpred109_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:606:4: ( qualName )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:606:4: qualName
        {
        pushFollow(FOLLOW_qualName_in_synpred109_pollen3531);
        qualName();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred109_pollen

    // $ANTLR start synpred111_pollen
    public final void synpred111_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:608:4: ( '(' typeName ( ',' typeName )* ')' qualName )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:608:5: '(' typeName ( ',' typeName )* ')' qualName
        {
        match(input,122,FOLLOW_122_in_synpred111_pollen3572); if (state.failed) return ;

        pushFollow(FOLLOW_typeName_in_synpred111_pollen3574);
        typeName();

        state._fsp--;
        if (state.failed) return ;

        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:608:18: ( ',' typeName )*
        loop127:
        do {
            int alt127=2;
            int LA127_0 = input.LA(1);

            if ( (LA127_0==125) ) {
                alt127=1;
            }


            switch (alt127) {
        	case 1 :
        	    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:608:19: ',' typeName
        	    {
        	    match(input,125,FOLLOW_125_in_synpred111_pollen3577); if (state.failed) return ;

        	    pushFollow(FOLLOW_typeName_in_synpred111_pollen3579);
        	    typeName();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop127;
            }
        } while (true);


        match(input,123,FOLLOW_123_in_synpred111_pollen3583); if (state.failed) return ;

        pushFollow(FOLLOW_qualName_in_synpred111_pollen3585);
        qualName();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred111_pollen

    // $ANTLR start synpred116_pollen
    public final void synpred116_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:635:35: ( fieldOrArrayAccess )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:635:35: fieldOrArrayAccess
        {
        pushFollow(FOLLOW_fieldOrArrayAccess_in_synpred116_pollen3804);
        fieldOrArrayAccess();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred116_pollen

    // $ANTLR start synpred118_pollen
    public final void synpred118_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:637:30: ( fieldOrArrayAccess )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:637:30: fieldOrArrayAccess
        {
        pushFollow(FOLLOW_fieldOrArrayAccess_in_synpred118_pollen3837);
        fieldOrArrayAccess();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred118_pollen

    // $ANTLR start synpred119_pollen
    public final void synpred119_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:637:4: ( '@' IDENT fcnArgumentList ( fieldOrArrayAccess )? )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:637:4: '@' IDENT fcnArgumentList ( fieldOrArrayAccess )?
        {
        match(input,134,FOLLOW_134_in_synpred119_pollen3831); if (state.failed) return ;

        match(input,IDENT,FOLLOW_IDENT_in_synpred119_pollen3833); if (state.failed) return ;

        pushFollow(FOLLOW_fcnArgumentList_in_synpred119_pollen3835);
        fcnArgumentList();

        state._fsp--;
        if (state.failed) return ;

        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:637:30: ( fieldOrArrayAccess )?
        int alt130=2;
        int LA130_0 = input.LA(1);

        if ( (LA130_0==126||LA130_0==135) ) {
            alt130=1;
        }
        switch (alt130) {
            case 1 :
                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:637:30: fieldOrArrayAccess
                {
                pushFollow(FOLLOW_fieldOrArrayAccess_in_synpred119_pollen3837);
                fieldOrArrayAccess();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        }

    }
    // $ANTLR end synpred119_pollen

    // $ANTLR start synpred120_pollen
    public final void synpred120_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:640:14: ( fieldOrArrayAccess )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:640:14: fieldOrArrayAccess
        {
        pushFollow(FOLLOW_fieldOrArrayAccess_in_synpred120_pollen3883);
        fieldOrArrayAccess();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred120_pollen

    // $ANTLR start synpred121_pollen
    public final void synpred121_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:640:4: ( '@' IDENT ( fieldOrArrayAccess )? )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:640:4: '@' IDENT ( fieldOrArrayAccess )?
        {
        match(input,134,FOLLOW_134_in_synpred121_pollen3879); if (state.failed) return ;

        match(input,IDENT,FOLLOW_IDENT_in_synpred121_pollen3881); if (state.failed) return ;

        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:640:14: ( fieldOrArrayAccess )?
        int alt131=2;
        int LA131_0 = input.LA(1);

        if ( (LA131_0==126||LA131_0==135) ) {
            alt131=1;
        }
        switch (alt131) {
            case 1 :
                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:640:14: fieldOrArrayAccess
                {
                pushFollow(FOLLOW_fieldOrArrayAccess_in_synpred121_pollen3883);
                fieldOrArrayAccess();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        }

    }
    // $ANTLR end synpred121_pollen

    // $ANTLR start synpred122_pollen
    public final void synpred122_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:642:4: ( '@' )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:642:4: '@'
        {
        match(input,134,FOLLOW_134_in_synpred122_pollen3922); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred122_pollen

    // $ANTLR start synpred123_pollen
    public final void synpred123_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:644:29: ( fieldOrArrayAccess )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:644:29: fieldOrArrayAccess
        {
        pushFollow(FOLLOW_fieldOrArrayAccess_in_synpred123_pollen3946);
        fieldOrArrayAccess();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred123_pollen

    // $ANTLR start synpred124_pollen
    public final void synpred124_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:644:4: ( qualName fcnArgumentList ( fieldOrArrayAccess )? )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:644:4: qualName fcnArgumentList ( fieldOrArrayAccess )?
        {
        pushFollow(FOLLOW_qualName_in_synpred124_pollen3942);
        qualName();

        state._fsp--;
        if (state.failed) return ;

        pushFollow(FOLLOW_fcnArgumentList_in_synpred124_pollen3944);
        fcnArgumentList();

        state._fsp--;
        if (state.failed) return ;

        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:644:29: ( fieldOrArrayAccess )?
        int alt132=2;
        int LA132_0 = input.LA(1);

        if ( (LA132_0==126||LA132_0==135) ) {
            alt132=1;
        }
        switch (alt132) {
            case 1 :
                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:644:29: fieldOrArrayAccess
                {
                pushFollow(FOLLOW_fieldOrArrayAccess_in_synpred124_pollen3946);
                fieldOrArrayAccess();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        }

    }
    // $ANTLR end synpred124_pollen

    // $ANTLR start synpred125_pollen
    public final void synpred125_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:646:13: ( fieldOrArrayAccess )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:646:13: fieldOrArrayAccess
        {
        pushFollow(FOLLOW_fieldOrArrayAccess_in_synpred125_pollen3976);
        fieldOrArrayAccess();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred125_pollen

    // $ANTLR start synpred127_pollen
    public final void synpred127_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:649:20: ( arrayAccess )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:649:20: arrayAccess
        {
        pushFollow(FOLLOW_arrayAccess_in_synpred127_pollen3994);
        arrayAccess();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred127_pollen

    // $ANTLR start synpred128_pollen
    public final void synpred128_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:654:4: ( '.' IDENT fcnArgumentList )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:654:4: '.' IDENT fcnArgumentList
        {
        match(input,126,FOLLOW_126_in_synpred128_pollen4008); if (state.failed) return ;

        match(input,IDENT,FOLLOW_IDENT_in_synpred128_pollen4010); if (state.failed) return ;

        pushFollow(FOLLOW_fcnArgumentList_in_synpred128_pollen4012);
        fcnArgumentList();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred128_pollen

    // $ANTLR start synpred129_pollen
    public final void synpred129_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:658:9: ( exprList )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:658:9: exprList
        {
        pushFollow(FOLLOW_exprList_in_synpred129_pollen4064);
        exprList();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred129_pollen

    // $ANTLR start synpred130_pollen
    public final void synpred130_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:666:5: ( stmt )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:666:5: stmt
        {
        pushFollow(FOLLOW_stmt_in_synpred130_pollen4121);
        stmt();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred130_pollen

    // $ANTLR start synpred131_pollen
    public final void synpred131_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:666:4: ( ( stmt )+ )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:666:4: ( stmt )+
        {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:666:4: ( stmt )+
        int cnt133=0;
        loop133:
        do {
            int alt133=2;
            int LA133_0 = input.LA(1);

            if ( ((LA133_0 >= BIT_NOT && LA133_0 <= CHAR)||LA133_0==DEC||LA133_0==HEX_LIT||LA133_0==IDENT||(LA133_0 >= INC && LA133_0 <= INT_LIT)||LA133_0==LOG_NOT||LA133_0==MINUS||LA133_0==NL||LA133_0==OCT_LIT||LA133_0==REAL_LIT||LA133_0==STRING||LA133_0==122||(LA133_0 >= 134 && LA133_0 <= 135)||(LA133_0 >= 139 && LA133_0 <= 142)||(LA133_0 >= 146 && LA133_0 <= 147)||LA133_0==149||(LA133_0 >= 156 && LA133_0 <= 157)||(LA133_0 >= 159 && LA133_0 <= 160)||(LA133_0 >= 163 && LA133_0 <= 165)||(LA133_0 >= 169 && LA133_0 <= 170)||LA133_0==173||LA133_0==175||(LA133_0 >= 177 && LA133_0 <= 180)||(LA133_0 >= 182 && LA133_0 <= 187)) ) {
                alt133=1;
            }


            switch (alt133) {
        	case 1 :
        	    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:666:5: stmt
        	    {
        	    pushFollow(FOLLOW_stmt_in_synpred131_pollen4121);
        	    stmt();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    if ( cnt133 >= 1 ) break loop133;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(133, input);
                    throw eee;
            }
            cnt133++;
        } while (true);


        }

    }
    // $ANTLR end synpred131_pollen

    // $ANTLR start synpred132_pollen
    public final void synpred132_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:667:5: ( NL )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:667:5: NL
        {
        match(input,NL,FOLLOW_NL_in_synpred132_pollen4143); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred132_pollen

    // $ANTLR start synpred133_pollen
    public final void synpred133_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:670:5: ( varDeclaration )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:670:5: varDeclaration
        {
        pushFollow(FOLLOW_varDeclaration_in_synpred133_pollen4164);
        varDeclaration();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred133_pollen

    // $ANTLR start synpred134_pollen
    public final void synpred134_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:671:5: ( stmtAssign )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:671:5: stmtAssign
        {
        pushFollow(FOLLOW_stmtAssign_in_synpred134_pollen4171);
        stmtAssign();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred134_pollen

    // $ANTLR start synpred136_pollen
    public final void synpred136_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:673:4: ( stmtBind )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:673:4: stmtBind
        {
        pushFollow(FOLLOW_stmtBind_in_synpred136_pollen4181);
        stmtBind();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred136_pollen

    // $ANTLR start synpred148_pollen
    public final void synpred148_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:685:4: ( stmtInjection )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:685:4: stmtInjection
        {
        pushFollow(FOLLOW_stmtInjection_in_synpred148_pollen4245);
        stmtInjection();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred148_pollen

    // $ANTLR start synpred149_pollen
    public final void synpred149_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:689:4: ( varOrFcnOrArray ASSIGN expr delim )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:689:4: varOrFcnOrArray ASSIGN expr delim
        {
        pushFollow(FOLLOW_varOrFcnOrArray_in_synpred149_pollen4262);
        varOrFcnOrArray();

        state._fsp--;
        if (state.failed) return ;

        match(input,ASSIGN,FOLLOW_ASSIGN_in_synpred149_pollen4264); if (state.failed) return ;

        pushFollow(FOLLOW_expr_in_synpred149_pollen4266);
        expr();

        state._fsp--;
        if (state.failed) return ;

        pushFollow(FOLLOW_delim_in_synpred149_pollen4268);
        delim();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred149_pollen

    // $ANTLR start synpred150_pollen
    public final void synpred150_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:691:4: ( injectionCode ASSIGN expr delim )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:691:4: injectionCode ASSIGN expr delim
        {
        pushFollow(FOLLOW_injectionCode_in_synpred150_pollen4303);
        injectionCode();

        state._fsp--;
        if (state.failed) return ;

        match(input,ASSIGN,FOLLOW_ASSIGN_in_synpred150_pollen4305); if (state.failed) return ;

        pushFollow(FOLLOW_expr_in_synpred150_pollen4307);
        expr();

        state._fsp--;
        if (state.failed) return ;

        pushFollow(FOLLOW_delim_in_synpred150_pollen4310);
        delim();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred150_pollen

    // $ANTLR start synpred151_pollen
    public final void synpred151_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:693:4: ( varOrFcnOrArray assignOp expr delim )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:693:4: varOrFcnOrArray assignOp expr delim
        {
        pushFollow(FOLLOW_varOrFcnOrArray_in_synpred151_pollen4345);
        varOrFcnOrArray();

        state._fsp--;
        if (state.failed) return ;

        pushFollow(FOLLOW_assignOp_in_synpred151_pollen4347);
        assignOp();

        state._fsp--;
        if (state.failed) return ;

        pushFollow(FOLLOW_expr_in_synpred151_pollen4349);
        expr();

        state._fsp--;
        if (state.failed) return ;

        pushFollow(FOLLOW_delim_in_synpred151_pollen4352);
        delim();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred151_pollen

    // $ANTLR start synpred156_pollen
    public final void synpred156_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:721:4: ( 'return' ( '(' ) ( expr ( ',' expr )+ ) ( ')' ) delim )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:721:4: 'return' ( '(' ) ( expr ( ',' expr )+ ) ( ')' ) delim
        {
        match(input,177,FOLLOW_177_in_synpred156_pollen4577); if (state.failed) return ;

        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:721:13: ( '(' )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:721:14: '('
        {
        match(input,122,FOLLOW_122_in_synpred156_pollen4580); if (state.failed) return ;

        }


        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:721:19: ( expr ( ',' expr )+ )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:721:20: expr ( ',' expr )+
        {
        pushFollow(FOLLOW_expr_in_synpred156_pollen4584);
        expr();

        state._fsp--;
        if (state.failed) return ;

        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:721:25: ( ',' expr )+
        int cnt134=0;
        loop134:
        do {
            int alt134=2;
            int LA134_0 = input.LA(1);

            if ( (LA134_0==125) ) {
                alt134=1;
            }


            switch (alt134) {
        	case 1 :
        	    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:721:26: ',' expr
        	    {
        	    match(input,125,FOLLOW_125_in_synpred156_pollen4587); if (state.failed) return ;

        	    pushFollow(FOLLOW_expr_in_synpred156_pollen4589);
        	    expr();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    if ( cnt134 >= 1 ) break loop134;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(134, input);
                    throw eee;
            }
            cnt134++;
        } while (true);


        }


        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:721:38: ( ')' )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:721:39: ')'
        {
        match(input,123,FOLLOW_123_in_synpred156_pollen4595); if (state.failed) return ;

        }


        pushFollow(FOLLOW_delim_in_synpred156_pollen4598);
        delim();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred156_pollen

    // $ANTLR start synpred159_pollen
    public final void synpred159_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:743:9: ( typeName IDENT '=' expr SEMI )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:743:9: typeName IDENT '=' expr SEMI
        {
        pushFollow(FOLLOW_typeName_in_synpred159_pollen4857);
        typeName();

        state._fsp--;
        if (state.failed) return ;

        match(input,IDENT,FOLLOW_IDENT_in_synpred159_pollen4859); if (state.failed) return ;

        match(input,ASSIGN,FOLLOW_ASSIGN_in_synpred159_pollen4861); if (state.failed) return ;

        pushFollow(FOLLOW_expr_in_synpred159_pollen4863);
        expr();

        state._fsp--;
        if (state.failed) return ;

        match(input,SEMI,FOLLOW_SEMI_in_synpred159_pollen4865); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred159_pollen

    // $ANTLR start synpred163_pollen
    public final void synpred163_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:765:18: ( NL )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:765:18: NL
        {
        match(input,NL,FOLLOW_NL_in_synpred163_pollen5037); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred163_pollen

    // $ANTLR start synpred164_pollen
    public final void synpred164_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:768:25: ( NL )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:768:25: NL
        {
        match(input,NL,FOLLOW_NL_in_synpred164_pollen5072); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred164_pollen

    // $ANTLR start synpred172_pollen
    public final void synpred172_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:820:4: ( typeName IDENT ( ASSIGN expr )? ',' )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:820:5: typeName IDENT ( ASSIGN expr )? ','
        {
        pushFollow(FOLLOW_typeName_in_synpred172_pollen5419);
        typeName();

        state._fsp--;
        if (state.failed) return ;

        match(input,IDENT,FOLLOW_IDENT_in_synpred172_pollen5421); if (state.failed) return ;

        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:820:20: ( ASSIGN expr )?
        int alt135=2;
        int LA135_0 = input.LA(1);

        if ( (LA135_0==ASSIGN) ) {
            alt135=1;
        }
        switch (alt135) {
            case 1 :
                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:820:21: ASSIGN expr
                {
                match(input,ASSIGN,FOLLOW_ASSIGN_in_synpred172_pollen5424); if (state.failed) return ;

                pushFollow(FOLLOW_expr_in_synpred172_pollen5426);
                expr();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        match(input,125,FOLLOW_125_in_synpred172_pollen5430); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred172_pollen

    // $ANTLR start synpred173_pollen
    public final void synpred173_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:821:5: ( typeName IDENT '[' )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:821:6: typeName IDENT '['
        {
        pushFollow(FOLLOW_typeName_in_synpred173_pollen5443);
        typeName();

        state._fsp--;
        if (state.failed) return ;

        match(input,IDENT,FOLLOW_IDENT_in_synpred173_pollen5445); if (state.failed) return ;

        match(input,135,FOLLOW_135_in_synpred173_pollen5447); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred173_pollen

    // $ANTLR start synpred174_pollen
    public final void synpred174_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:822:5: ( typeName '(' )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:822:6: typeName '('
        {
        pushFollow(FOLLOW_typeName_in_synpred174_pollen5460);
        typeName();

        state._fsp--;
        if (state.failed) return ;

        match(input,122,FOLLOW_122_in_synpred174_pollen5462); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred174_pollen

    // $ANTLR start synpred175_pollen
    public final void synpred175_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:823:6: ( typeName varInit )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:823:7: typeName varInit
        {
        pushFollow(FOLLOW_typeName_in_synpred175_pollen5477);
        typeName();

        state._fsp--;
        if (state.failed) return ;

        pushFollow(FOLLOW_varInit_in_synpred175_pollen5479);
        varInit();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred175_pollen

    // $ANTLR start synpred179_pollen
    public final void synpred179_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:846:5: ( '[' varDim ']' )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:846:5: '[' varDim ']'
        {
        match(input,135,FOLLOW_135_in_synpred179_pollen5705); if (state.failed) return ;

        pushFollow(FOLLOW_varDim_in_synpred179_pollen5707);
        varDim();

        state._fsp--;
        if (state.failed) return ;

        match(input,136,FOLLOW_136_in_synpred179_pollen5709); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred179_pollen

    // $ANTLR start synpred183_pollen
    public final void synpred183_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:857:17: ( ',' initializer )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:857:17: ',' initializer
        {
        match(input,125,FOLLOW_125_in_synpred183_pollen5787); if (state.failed) return ;

        pushFollow(FOLLOW_initializer_in_synpred183_pollen5789);
        initializer();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred183_pollen

    // $ANTLR start synpred184_pollen
    public final void synpred184_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:863:4: ( typeName varDeclList )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:863:4: typeName varDeclList
        {
        pushFollow(FOLLOW_typeName_in_synpred184_pollen5821);
        typeName();

        state._fsp--;
        if (state.failed) return ;

        pushFollow(FOLLOW_varDeclList_in_synpred184_pollen5826);
        varDeclList();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred184_pollen

    // $ANTLR start synpred185_pollen
    public final void synpred185_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:864:13: ( ',' varInit )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:864:13: ',' varInit
        {
        match(input,125,FOLLOW_125_in_synpred185_pollen5834); if (state.failed) return ;

        pushFollow(FOLLOW_varInit_in_synpred185_pollen5837);
        varInit();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred185_pollen

    // $ANTLR start synpred195_pollen
    public final void synpred195_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:884:16: ( qualNameList )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:884:16: qualNameList
        {
        pushFollow(FOLLOW_qualNameList_in_synpred195_pollen6001);
        qualNameList();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred195_pollen

    // $ANTLR start synpred196_pollen
    public final void synpred196_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:889:6: ( '.' IDENT )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:889:6: '.' IDENT
        {
        match(input,126,FOLLOW_126_in_synpred196_pollen6041); if (state.failed) return ;

        match(input,IDENT,FOLLOW_IDENT_in_synpred196_pollen6056); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred196_pollen

    // $ANTLR start synpred208_pollen
    public final void synpred208_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:941:2: ( NL )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:941:2: NL
        {
        match(input,NL,FOLLOW_NL_in_synpred208_pollen6391); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred208_pollen

    // $ANTLR start synpred209_pollen
    public final void synpred209_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:951:12: ( NL )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:951:12: NL
        {
        match(input,NL,FOLLOW_NL_in_synpred209_pollen6455); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred209_pollen

    // $ANTLR start synpred210_pollen
    public final void synpred210_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:951:4: ( ( SEMI ) ( NL )* )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:951:4: ( SEMI ) ( NL )*
        {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:951:4: ( SEMI )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:951:5: SEMI
        {
        match(input,SEMI,FOLLOW_SEMI_in_synpred210_pollen6451); if (state.failed) return ;

        }


        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:951:11: ( NL )*
        loop138:
        do {
            int alt138=2;
            int LA138_0 = input.LA(1);

            if ( (LA138_0==NL) ) {
                alt138=1;
            }


            switch (alt138) {
        	case 1 :
        	    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:951:12: NL
        	    {
        	    match(input,NL,FOLLOW_NL_in_synpred210_pollen6455); if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop138;
            }
        } while (true);


        }

    }
    // $ANTLR end synpred210_pollen

    // $ANTLR start synpred211_pollen
    public final void synpred211_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:952:5: ( NL )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:952:5: NL
        {
        match(input,NL,FOLLOW_NL_in_synpred211_pollen6466); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred211_pollen

    // $ANTLR start synpred212_pollen
    public final void synpred212_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:952:4: ( ( NL )+ )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:952:4: ( NL )+
        {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:952:4: ( NL )+
        int cnt139=0;
        loop139:
        do {
            int alt139=2;
            int LA139_0 = input.LA(1);

            if ( (LA139_0==NL) ) {
                alt139=1;
            }


            switch (alt139) {
        	case 1 :
        	    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:952:5: NL
        	    {
        	    match(input,NL,FOLLOW_NL_in_synpred212_pollen6466); if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    if ( cnt139 >= 1 ) break loop139;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(139, input);
                    throw eee;
            }
            cnt139++;
        } while (true);


        }

    }
    // $ANTLR end synpred212_pollen

    // $ANTLR start synpred214_pollen
    public final void synpred214_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:954:4: ( ( NL )* '}' )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:954:5: ( NL )* '}'
        {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:954:5: ( NL )*
        loop140:
        do {
            int alt140=2;
            int LA140_0 = input.LA(1);

            if ( (LA140_0==NL) ) {
                alt140=1;
            }


            switch (alt140) {
        	case 1 :
        	    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:954:6: NL
        	    {
        	    match(input,NL,FOLLOW_NL_in_synpred214_pollen6480); if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop140;
            }
        } while (true);


        match(input,190,FOLLOW_190_in_synpred214_pollen6484); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred214_pollen

    // $ANTLR start synpred215_pollen
    public final void synpred215_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:954:20: ( NL )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:954:20: NL
        {
        match(input,NL,FOLLOW_NL_in_synpred215_pollen6490); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred215_pollen

    // Delegated rules

    public final boolean synpred136_pollen() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred136_pollen_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred16_pollen() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred16_pollen_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred21_pollen() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred21_pollen_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred107_pollen() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred107_pollen_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred149_pollen() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred149_pollen_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred211_pollen() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred211_pollen_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred130_pollen() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred130_pollen_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred185_pollen() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred185_pollen_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred80_pollen() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred80_pollen_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred183_pollen() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred183_pollen_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred122_pollen() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred122_pollen_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred132_pollen() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred132_pollen_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred120_pollen() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred120_pollen_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred119_pollen() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred119_pollen_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred209_pollen() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred209_pollen_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred129_pollen() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred129_pollen_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred9_pollen() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_pollen_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred133_pollen() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred133_pollen_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred57_pollen() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred57_pollen_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred50_pollen() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred50_pollen_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred77_pollen() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred77_pollen_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred184_pollen() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred184_pollen_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred173_pollen() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred173_pollen_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred42_pollen() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred42_pollen_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred172_pollen() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred172_pollen_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred84_pollen() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred84_pollen_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred79_pollen() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred79_pollen_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred97_pollen() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred97_pollen_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred11_pollen() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred11_pollen_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred81_pollen() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred81_pollen_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred76_pollen() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred76_pollen_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred175_pollen() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred175_pollen_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred82_pollen() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred82_pollen_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred49_pollen() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred49_pollen_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred214_pollen() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred214_pollen_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred121_pollen() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred121_pollen_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred87_pollen() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred87_pollen_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred215_pollen() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred215_pollen_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_pollen() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_pollen_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred128_pollen() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred128_pollen_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred118_pollen() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred118_pollen_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred179_pollen() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred179_pollen_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred127_pollen() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred127_pollen_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred30_pollen() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred30_pollen_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred108_pollen() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred108_pollen_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred88_pollen() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred88_pollen_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred208_pollen() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred208_pollen_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred34_pollen() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred34_pollen_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred212_pollen() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred212_pollen_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_pollen() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_pollen_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred156_pollen() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred156_pollen_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred210_pollen() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred210_pollen_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred53_pollen() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred53_pollen_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred174_pollen() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred174_pollen_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred150_pollen() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred150_pollen_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred151_pollen() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred151_pollen_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred15_pollen() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred15_pollen_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred45_pollen() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred45_pollen_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred78_pollen() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred78_pollen_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred20_pollen() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred20_pollen_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred196_pollen() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred196_pollen_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred163_pollen() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred163_pollen_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred125_pollen() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred125_pollen_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred83_pollen() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred83_pollen_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred195_pollen() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred195_pollen_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred86_pollen() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred86_pollen_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred164_pollen() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred164_pollen_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred123_pollen() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred123_pollen_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred111_pollen() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred111_pollen_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred134_pollen() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred134_pollen_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred159_pollen() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred159_pollen_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred51_pollen() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred51_pollen_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred22_pollen() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred22_pollen_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred48_pollen() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred48_pollen_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred124_pollen() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred124_pollen_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred148_pollen() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred148_pollen_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred85_pollen() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred85_pollen_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred96_pollen() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred96_pollen_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred32_pollen() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred32_pollen_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred47_pollen() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred47_pollen_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred109_pollen() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred109_pollen_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred116_pollen() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred116_pollen_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred131_pollen() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred131_pollen_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_NL_in_unit649 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040020L,0x0000518441030000L});
    public static final BitSet FOLLOW_unitPackage_in_unit653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtPackage_in_unitPackage679 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L,0x0000418441030000L});
    public static final BitSet FOLLOW_importList_in_unitPackage685 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L,0x0000418001030000L});
    public static final BitSet FOLLOW_stmtInjection_in_unitPackage694 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L,0x0000418001030000L});
    public static final BitSet FOLLOW_unitTypeDefinition_in_unitPackage705 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_stmtInjection_in_unitPackage716 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_unitPackage726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_172_in_stmtPackage736 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_qualName_in_stmtPackage738 = new BitSet(new long[]{0x0000000000000000L,0x0000000004040000L});
    public static final BitSet FOLLOW_delim_in_stmtPackage740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_154_in_stmtExport772 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_qualName_in_stmtExport775 = new BitSet(new long[]{0x0000000000000000L,0x0000000004040000L});
    public static final BitSet FOLLOW_delim_in_stmtExport777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtExport_in_exportList795 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_144_in_classDefinition841 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_classDef_in_classDefinition843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_classDef862 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L,0x0800000200000000L});
    public static final BitSet FOLLOW_implementsClause_in_classDef873 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L,0x0800000000000000L});
    public static final BitSet FOLLOW_braceOpen_in_classDef880 = new BitSet(new long[]{0x0000000000000000L,0x0400000000040021L,0x43C5023881055000L});
    public static final BitSet FOLLOW_classFeature_in_classDef883 = new BitSet(new long[]{0x0000000000000000L,0x0400000000040021L,0x43C5023881055000L});
    public static final BitSet FOLLOW_braceClose_in_classDef887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fcnDefinition_in_classFeature904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumDefinition_in_classFeature915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDeclaration_in_classFeature925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classDefinition_in_classFeature935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtInjection_in_classFeature945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_168_in_moduleDefinition962 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_IDENT_in_moduleDefinition964 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L,0x0800000200000000L});
    public static final BitSet FOLLOW_implementsClause_in_moduleDefinition979 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L,0x0800000000000000L});
    public static final BitSet FOLLOW_braceOpen_in_moduleDefinition988 = new BitSet(new long[]{0x0000000000000000L,0x0400000000040021L,0x43C5023881055000L});
    public static final BitSet FOLLOW_moduleFeature_in_moduleDefinition991 = new BitSet(new long[]{0x0000000000000000L,0x0400000000040021L,0x43C5023881055000L});
    public static final BitSet FOLLOW_braceClose_in_moduleDefinition995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fcnDefinition_in_moduleFeature1027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDeclaration_in_moduleFeature1036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumDefinition_in_moduleFeature1043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classDefinition_in_moduleFeature1050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtInjection_in_moduleFeature1056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_152_in_enumDefinition1069 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_enumDef_in_enumDefinition1071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_enumDef1097 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L,0x0800000000000000L});
    public static final BitSet FOLLOW_braceOpen_in_enumDef1106 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_enumList_in_enumDef1108 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L,0x4000000000000000L});
    public static final BitSet FOLLOW_braceClose_in_enumDef1110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumElement_in_enumList1141 = new BitSet(new long[]{0x0000000000000002L,0x2000000000000000L});
    public static final BitSet FOLLOW_125_in_enumList1144 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_enumElement_in_enumList1146 = new BitSet(new long[]{0x0000000000000002L,0x2000000000000000L});
    public static final BitSet FOLLOW_IDENT_in_enumElement1171 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ASSIGN_in_enumElement1173 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_INT_LIT_in_enumElement1175 = new BitSet(new long[]{0x0000000000000000L,0x0000000004040000L});
    public static final BitSet FOLLOW_delim_in_enumElement1178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_enumElement1203 = new BitSet(new long[]{0x0000000000000000L,0x0000000004040000L});
    public static final BitSet FOLLOW_delim_in_enumElement1206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_174_in_protocolDefinition1226 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_IDENT_in_protocolDefinition1228 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L,0x0800000008000000L});
    public static final BitSet FOLLOW_extendsClause_in_protocolDefinition1236 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L,0x0800000000000000L});
    public static final BitSet FOLLOW_braceOpen_in_protocolDefinition1242 = new BitSet(new long[]{0x0000000000000000L,0x0400000000040021L,0x41C5003881005000L});
    public static final BitSet FOLLOW_protocolFeature_in_protocolDefinition1245 = new BitSet(new long[]{0x0000000000000000L,0x0400000000040021L,0x41C5003881005000L});
    public static final BitSet FOLLOW_braceClose_in_protocolDefinition1249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumDefinition_in_protocolFeature1283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fcnDeclaration_in_protocolFeature1293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtInjection_in_protocolFeature1304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_145_in_compositionDefinition1317 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_IDENT_in_compositionDefinition1319 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L,0x0800000008000000L});
    public static final BitSet FOLLOW_extendsClause_in_compositionDefinition1327 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L,0x0800000000000000L});
    public static final BitSet FOLLOW_braceOpen_in_compositionDefinition1334 = new BitSet(new long[]{0x0000000000000000L,0x0400000000040021L,0x43C5023885045000L});
    public static final BitSet FOLLOW_compositionFeature_in_compositionDefinition1337 = new BitSet(new long[]{0x0000000000000000L,0x0400000000040021L,0x43C5023885045000L});
    public static final BitSet FOLLOW_braceClose_in_compositionDefinition1341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exportList_in_compositionFeature1377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fcnDefinitionHost_in_compositionFeature1385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumDefinition_in_compositionFeature1393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDeclaration_in_compositionFeature1401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtInjection_in_compositionFeature1408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_importFrom_in_stmtImport1425 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_162_in_stmtImport1435 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_qualName_in_stmtImport1437 = new BitSet(new long[]{0x0000000000000000L,0x0000000004040000L,0x0800000000000400L});
    public static final BitSet FOLLOW_metaArguments_in_stmtImport1440 = new BitSet(new long[]{0x0000000000000000L,0x0000000004040000L,0x0000000000000400L});
    public static final BitSet FOLLOW_importAs_in_stmtImport1453 = new BitSet(new long[]{0x0000000000000000L,0x0000000004040000L});
    public static final BitSet FOLLOW_delim_in_stmtImport1456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_158_in_importFrom1496 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_qualName_in_importFrom1498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_138_in_importAs1547 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_qualName_in_importAs1549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtImport_in_importList1575 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000440000000L});
    public static final BitSet FOLLOW_167_in_meta1609 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L,0x0800000000000000L});
    public static final BitSet FOLLOW_braceOpen_in_meta1618 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x01E4003800005000L});
    public static final BitSet FOLLOW_metaFormalParameters_in_meta1620 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L,0x4000000000000000L});
    public static final BitSet FOLLOW_braceClose_in_meta1622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_metaFormalParameter_in_metaFormalParameters1647 = new BitSet(new long[]{0x0000000000000002L,0x2000000000000000L});
    public static final BitSet FOLLOW_125_in_metaFormalParameters1651 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x01E4003800005000L});
    public static final BitSet FOLLOW_metaFormalParameter_in_metaFormalParameters1653 = new BitSet(new long[]{0x0000000000000002L,0x2000000000000000L});
    public static final BitSet FOLLOW_metaFormalParameterType_in_metaFormalParameter1676 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_IDENT_in_metaFormalParameter1678 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ASSIGN_in_metaFormalParameter1681 = new BitSet(new long[]{0x2000000000000800L,0x0000000011200041L,0x01D4043810005000L});
    public static final BitSet FOLLOW_metaArgument_in_metaFormalParameter1683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_181_in_metaFormalParameterType1712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_builtinType_in_metaFormalParameterType1719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_187_in_metaArguments1732 = new BitSet(new long[]{0x2000000000000800L,0x0000000011200041L,0x01D4043810005000L});
    public static final BitSet FOLLOW_metaArgument_in_metaArguments1734 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_125_in_metaArguments1738 = new BitSet(new long[]{0x2000000000000800L,0x0000000011200041L,0x01D4043810005000L});
    public static final BitSet FOLLOW_metaArgument_in_metaArguments1740 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_190_in_metaArguments1744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_187_in_metaArguments1764 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_190_in_metaArguments1766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitiveLit_in_metaArgument1795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeNameScalar_in_metaArgument1801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeNameScalar_in_typeName1815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_builtinType_in_typeNameScalar1828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_userTypeName_in_typeNameScalar1833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qualName_in_userTypeName1843 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_metaArguments_in_userTypeName1845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qualName_in_userTypeName1866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_meta_in_unitTypeDefinition1905 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000410001030000L});
    public static final BitSet FOLLOW_moduleDefinition_in_unitTypeDefinition1927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classDefinition_in_unitTypeDefinition1948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_protocolDefinition_in_unitTypeDefinition1965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compositionDefinition_in_unitTypeDefinition1983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumDefinition_in_unitTypeDefinition2001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_155_in_extendsClause2026 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_IDENT_in_extendsClause2029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_161_in_implementsClause2048 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_IDENT_in_implementsClause2051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NL_in_braceClose2071 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L,0x4000000000000000L});
    public static final BitSet FOLLOW_190_in_braceClose2076 = new BitSet(new long[]{0x0000000000000002L,0x0000000000040000L});
    public static final BitSet FOLLOW_NL_in_braceClose2080 = new BitSet(new long[]{0x0000000000000002L,0x0000000000040000L});
    public static final BitSet FOLLOW_NL_in_braceCloseAtEOF2104 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L,0x4000000000000000L});
    public static final BitSet FOLLOW_190_in_braceCloseAtEOF2109 = new BitSet(new long[]{0x0000000000000002L,0x0000000000040000L});
    public static final BitSet FOLLOW_NL_in_braceCloseAtEOF2113 = new BitSet(new long[]{0x0000000000000002L,0x0000000000040000L});
    public static final BitSet FOLLOW_NL_in_braceOpen2138 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L,0x0800000000000000L});
    public static final BitSet FOLLOW_187_in_braceOpen2143 = new BitSet(new long[]{0x0000000000000002L,0x0000000000040000L});
    public static final BitSet FOLLOW_NL_in_braceOpen2147 = new BitSet(new long[]{0x0000000000000002L,0x0000000000040000L});
    public static final BitSet FOLLOW_LOG_NOT_in_logicalNotOp2324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BIT_NOT_in_bitwiseNotOp2335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_exprList2346 = new BitSet(new long[]{0x0000000000000002L,0x2000000000000000L});
    public static final BitSet FOLLOW_125_in_exprList2349 = new BitSet(new long[]{0x2000000000002C00L,0x0400000011201171L,0x00100600100000C0L});
    public static final BitSet FOLLOW_expr_in_exprList2351 = new BitSet(new long[]{0x0000000000000002L,0x2000000000000000L});
    public static final BitSet FOLLOW_exprLogicalOr_in_expr2390 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_133_in_expr2392 = new BitSet(new long[]{0x2000000000002C00L,0x0400000011201171L,0x00100600100000C0L});
    public static final BitSet FOLLOW_expr_in_expr2394 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_128_in_expr2396 = new BitSet(new long[]{0x2000000000002C00L,0x0400000011201171L,0x00100600100000C0L});
    public static final BitSet FOLLOW_expr_in_expr2398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exprLogicalOr_in_expr2421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exprLogicalAnd_in_exprLogicalOr2439 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_189_in_exprLogicalOr2453 = new BitSet(new long[]{0x2000000000002C00L,0x0400000011201171L,0x00100600100000C0L});
    public static final BitSet FOLLOW_exprLogicalAnd_in_exprLogicalOr2455 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_exprBitwiseOr_in_exprLogicalAnd2494 = new BitSet(new long[]{0x0000000000000002L,0x0100000000000000L});
    public static final BitSet FOLLOW_120_in_exprLogicalAnd2506 = new BitSet(new long[]{0x2000000000002C00L,0x0400000011201171L,0x00100600100000C0L});
    public static final BitSet FOLLOW_exprBitwiseOr_in_exprLogicalAnd2508 = new BitSet(new long[]{0x0000000000000002L,0x0100000000000000L});
    public static final BitSet FOLLOW_exprBitwiseXor_in_exprBitwiseOr2545 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_188_in_exprBitwiseOr2557 = new BitSet(new long[]{0x2000000000002C00L,0x0400000011201171L,0x00100600100000C0L});
    public static final BitSet FOLLOW_exprBitwiseXor_in_exprBitwiseOr2559 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_exprBitwiseAnd_in_exprBitwiseXor2595 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_137_in_exprBitwiseXor2607 = new BitSet(new long[]{0x2000000000002C00L,0x0400000011201171L,0x00100600100000C0L});
    public static final BitSet FOLLOW_exprBitwiseAnd_in_exprBitwiseXor2609 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_exprEquality_in_exprBitwiseAnd2645 = new BitSet(new long[]{0x0000000000000002L,0x0200000000000000L});
    public static final BitSet FOLLOW_121_in_exprBitwiseAnd2657 = new BitSet(new long[]{0x2000000000002C00L,0x0400000011201171L,0x00100600100000C0L});
    public static final BitSet FOLLOW_exprEquality_in_exprBitwiseAnd2659 = new BitSet(new long[]{0x0000000000000002L,0x0200000000000000L});
    public static final BitSet FOLLOW_exprRelational_in_exprEquality2695 = new BitSet(new long[]{0x0000004000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_equalityOp_in_exprEquality2708 = new BitSet(new long[]{0x2000000000002C00L,0x0400000011201171L,0x00100600100000C0L});
    public static final BitSet FOLLOW_exprRelational_in_exprEquality2710 = new BitSet(new long[]{0x0000004000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_exprShift_in_exprRelational2746 = new BitSet(new long[]{0x0800000000000002L,0x0000000000000400L,0x000000000000000AL});
    public static final BitSet FOLLOW_relationalOp_in_exprRelational2759 = new BitSet(new long[]{0x2000000000002C00L,0x0400000011201171L,0x00100600100000C0L});
    public static final BitSet FOLLOW_exprShift_in_exprRelational2761 = new BitSet(new long[]{0x0800000000000002L,0x0000000000000400L,0x000000000000000AL});
    public static final BitSet FOLLOW_exprAddSub_in_exprShift2798 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000014L});
    public static final BitSet FOLLOW_shiftOp_in_exprShift2811 = new BitSet(new long[]{0x2000000000002C00L,0x0400000011201171L,0x00100600100000C0L});
    public static final BitSet FOLLOW_exprAddSub_in_exprShift2814 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000014L});
    public static final BitSet FOLLOW_exprMultDiv_in_exprAddSub2851 = new BitSet(new long[]{0x0000000000000002L,0x0000000000401000L});
    public static final BitSet FOLLOW_addSubOp_in_exprAddSub2863 = new BitSet(new long[]{0x2000000000002C00L,0x0400000011201171L,0x00100600100000C0L});
    public static final BitSet FOLLOW_exprMultDiv_in_exprAddSub2865 = new BitSet(new long[]{0x0000000000000002L,0x0000000000401000L});
    public static final BitSet FOLLOW_exprUnary_in_exprMultDiv2908 = new BitSet(new long[]{0x0000000000000002L,0x9080000000000000L});
    public static final BitSet FOLLOW_multDivModOp_in_exprMultDiv2920 = new BitSet(new long[]{0x2000000000002C00L,0x0400000011201171L,0x00100600100000C0L});
    public static final BitSet FOLLOW_exprUnary_in_exprMultDiv2922 = new BitSet(new long[]{0x0000000000000002L,0x9080000000000000L});
    public static final BitSet FOLLOW_169_in_exprNew2957 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L,0x01C4003800005000L});
    public static final BitSet FOLLOW_typeName_in_exprNew2959 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_fcnArgumentList_in_exprNew2961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitiveLit_in_exprUnary2987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_injectionCode_in_exprUnary2992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayLit_in_exprUnary2997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicalNotOp_in_exprUnary3021 = new BitSet(new long[]{0x2000000000002C00L,0x0400000011201171L,0x00100600100000C0L});
    public static final BitSet FOLLOW_expr_in_exprUnary3023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bitwiseNotOp_in_exprUnary3047 = new BitSet(new long[]{0x2000000000002C00L,0x0400000011201171L,0x00100600100000C0L});
    public static final BitSet FOLLOW_expr_in_exprUnary3049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_122_in_exprUnary3073 = new BitSet(new long[]{0x2000000000002C00L,0x0400000011201171L,0x00100600100000C0L});
    public static final BitSet FOLLOW_expr_in_exprUnary3075 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_123_in_exprUnary3077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_exprUnary3093 = new BitSet(new long[]{0x2000000000002C00L,0x0400000011201171L,0x00100600100000C0L});
    public static final BitSet FOLLOW_expr_in_exprUnary3095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varOrFcnOrArray_in_exprUnary3120 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000010L});
    public static final BitSet FOLLOW_incDecOp_in_exprUnary3122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varOrFcnOrArray_in_exprUnary3143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_incDecOp_in_exprUnary3148 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L,0x0000020000000040L});
    public static final BitSet FOLLOW_varOrFcnOrArray_in_exprUnary3150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exprNew_in_exprUnary3171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_176_in_fcnDefinition3191 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000001L,0x01C4003880005000L});
    public static final BitSet FOLLOW_159_in_fcnDefinition3202 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000001L,0x01C4003800005000L});
    public static final BitSet FOLLOW_fcnType_fcnName_in_fcnDefinition3212 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_fcnFormalParameterList_in_fcnDefinition3214 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L,0x0800000000000000L});
    public static final BitSet FOLLOW_fcnBody_in_fcnDefinition3216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_176_in_fcnDefinitionHost3258 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000001L,0x01C4003880005000L});
    public static final BitSet FOLLOW_159_in_fcnDefinitionHost3263 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000001L,0x01C4003800005000L});
    public static final BitSet FOLLOW_fcnType_fcnName_in_fcnDefinitionHost3274 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_fcnFormalParameterList_in_fcnDefinitionHost3277 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L,0x0800000000000000L});
    public static final BitSet FOLLOW_fcnBody_in_fcnDefinitionHost3279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_176_in_fcnAttr3323 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_159_in_fcnAttr3334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_braceOpen_in_fcnBody3351 = new BitSet(new long[]{0x2000000000002C00L,0x0400000011241171L,0x4FDEA639B02C78C0L});
    public static final BitSet FOLLOW_stmts_in_fcnBody3354 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L,0x4000000000000000L});
    public static final BitSet FOLLOW_braceClose_in_fcnBody3358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_176_in_fcnDeclaration3397 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000001L,0x01C4003880005000L});
    public static final BitSet FOLLOW_159_in_fcnDeclaration3408 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000001L,0x01C4003800005000L});
    public static final BitSet FOLLOW_fcnType_fcnName_in_fcnDeclaration3418 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_fcnFormalParameterList_in_fcnDeclaration3421 = new BitSet(new long[]{0x0000000000000000L,0x0000000004040000L});
    public static final BitSet FOLLOW_delim_in_fcnDeclaration3424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeName_in_fcnType_fcnName3457 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_qualName_in_fcnType_fcnName3459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeName_in_fcnType_fcnName3495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qualName_in_fcnType_fcnName3531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fcnTypes_fcnName_in_fcnType_fcnName3590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_122_in_fcnTypes_fcnName3601 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L,0x01C4003800005000L});
    public static final BitSet FOLLOW_fcnTypes_in_fcnTypes_fcnName3603 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_123_in_fcnTypes_fcnName3605 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_qualName_in_fcnTypes_fcnName3607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeName_in_fcnTypes3628 = new BitSet(new long[]{0x0000000000000002L,0x2000000000000000L});
    public static final BitSet FOLLOW_125_in_fcnTypes3631 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L,0x01C4003800005000L});
    public static final BitSet FOLLOW_typeName_in_fcnTypes3633 = new BitSet(new long[]{0x0000000000000002L,0x2000000000000000L});
    public static final BitSet FOLLOW_122_in_fcnFormalParameterList3658 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000001L,0x01C4003800005000L});
    public static final BitSet FOLLOW_fcnFormalParameters_in_fcnFormalParameterList3660 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_123_in_fcnFormalParameterList3662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fcnFormalParameter_in_fcnFormalParameters3676 = new BitSet(new long[]{0x0000000000000002L,0x2000000000000000L});
    public static final BitSet FOLLOW_125_in_fcnFormalParameters3679 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L,0x01C4003800005000L});
    public static final BitSet FOLLOW_fcnFormalParameter_in_fcnFormalParameters3681 = new BitSet(new long[]{0x0000000000000002L,0x2000000000000000L});
    public static final BitSet FOLLOW_typeName_in_fcnFormalParameter3724 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_IDENT_in_fcnFormalParameter3726 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ASSIGN_in_fcnFormalParameter3730 = new BitSet(new long[]{0x2000000000002C00L,0x0400000011201171L,0x00100600100000C0L});
    public static final BitSet FOLLOW_expr_in_fcnFormalParameter3732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_122_in_fcnArgumentList3769 = new BitSet(new long[]{0x2000000000002C00L,0x0400000011201171L,0x00100600100000C0L});
    public static final BitSet FOLLOW_fcnArguments_in_fcnArgumentList3771 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_123_in_fcnArgumentList3773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exprList_in_fcnArguments3788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_169_in_varOrFcnOrArray3798 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L,0x01C4003800005000L});
    public static final BitSet FOLLOW_typeName_in_varOrFcnOrArray3800 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_fcnArgumentList_in_varOrFcnOrArray3802 = new BitSet(new long[]{0x0000000000000002L,0x4000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_fieldOrArrayAccess_in_varOrFcnOrArray3804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_134_in_varOrFcnOrArray3831 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_IDENT_in_varOrFcnOrArray3833 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_fcnArgumentList_in_varOrFcnOrArray3835 = new BitSet(new long[]{0x0000000000000002L,0x4000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_fieldOrArrayAccess_in_varOrFcnOrArray3837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_134_in_varOrFcnOrArray3879 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_IDENT_in_varOrFcnOrArray3881 = new BitSet(new long[]{0x0000000000000002L,0x4000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_fieldOrArrayAccess_in_varOrFcnOrArray3883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_134_in_varOrFcnOrArray3922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qualName_in_varOrFcnOrArray3942 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_fcnArgumentList_in_varOrFcnOrArray3944 = new BitSet(new long[]{0x0000000000000002L,0x4000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_fieldOrArrayAccess_in_varOrFcnOrArray3946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qualName_in_varOrFcnOrArray3974 = new BitSet(new long[]{0x0000000000000002L,0x4000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_fieldOrArrayAccess_in_varOrFcnOrArray3976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fieldAccess_in_fieldOrArrayAccess3990 = new BitSet(new long[]{0x0000000000000002L,0x4000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_arrayAccess_in_fieldOrArrayAccess3994 = new BitSet(new long[]{0x0000000000000002L,0x4000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_126_in_fieldAccess4008 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_IDENT_in_fieldAccess4010 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_fcnArgumentList_in_fieldAccess4012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_126_in_fieldAccess4034 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_IDENT_in_fieldAccess4036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_135_in_arrayAccess4061 = new BitSet(new long[]{0x2000000000002C00L,0x0400000011201171L,0x00100600100001C0L});
    public static final BitSet FOLLOW_exprList_in_arrayAccess4064 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_136_in_arrayAccess4068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_braceOpen_in_stmtBlock4091 = new BitSet(new long[]{0x2000000000002C00L,0x0400000011241171L,0x4FDEA639B02C78C0L});
    public static final BitSet FOLLOW_stmts_in_stmtBlock4093 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L,0x4000000000000000L});
    public static final BitSet FOLLOW_braceClose_in_stmtBlock4095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmt_in_stmts4121 = new BitSet(new long[]{0x2000000000002C02L,0x0400000011241171L,0x0FDEA639B02C78C0L});
    public static final BitSet FOLLOW_NL_in_stmts4143 = new BitSet(new long[]{0x0000000000000002L,0x0000000000040000L});
    public static final BitSet FOLLOW_varDeclaration_in_stmt4164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtAssign_in_stmt4171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtAssert_in_stmt4176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtBind_in_stmt4181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtBlock_in_stmt4186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtPrint_in_stmt4191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtReturn_in_stmt4196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtBreak_in_stmt4201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtContinue_in_stmt4207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtFor_in_stmt4213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtSwitch_in_stmt4218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtDoWhile_in_stmt4224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtIf_in_stmt4229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtProvided_in_stmt4234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtWhile_in_stmt4239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtInjection_in_stmt4245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_stmt4250 = new BitSet(new long[]{0x0000000000000000L,0x0000000004040000L});
    public static final BitSet FOLLOW_delim_in_stmt4252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varOrFcnOrArray_in_stmtAssign4262 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ASSIGN_in_stmtAssign4264 = new BitSet(new long[]{0x2000000000002C00L,0x0400000011201171L,0x00100600100000C0L});
    public static final BitSet FOLLOW_expr_in_stmtAssign4266 = new BitSet(new long[]{0x0000000000000000L,0x0000000004040000L});
    public static final BitSet FOLLOW_delim_in_stmtAssign4268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_injectionCode_in_stmtAssign4303 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ASSIGN_in_stmtAssign4305 = new BitSet(new long[]{0x2000000000002C00L,0x0400000011201171L,0x00100600100000C0L});
    public static final BitSet FOLLOW_expr_in_stmtAssign4307 = new BitSet(new long[]{0x0000000000000000L,0x0000000004040000L});
    public static final BitSet FOLLOW_delim_in_stmtAssign4310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varOrFcnOrArray_in_stmtAssign4345 = new BitSet(new long[]{0x0000000000008390L,0x0000000022018200L});
    public static final BitSet FOLLOW_assignOp_in_stmtAssign4347 = new BitSet(new long[]{0x2000000000002C00L,0x0400000011201171L,0x00100600100000C0L});
    public static final BitSet FOLLOW_expr_in_stmtAssign4349 = new BitSet(new long[]{0x0000000000000000L,0x0000000004040000L});
    public static final BitSet FOLLOW_delim_in_stmtAssign4352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_injectionCode_in_stmtAssign4387 = new BitSet(new long[]{0x0000000000008390L,0x0000000022018200L});
    public static final BitSet FOLLOW_assignOp_in_stmtAssign4389 = new BitSet(new long[]{0x2000000000002C00L,0x0400000011201171L,0x00100600100000C0L});
    public static final BitSet FOLLOW_expr_in_stmtAssign4391 = new BitSet(new long[]{0x0000000000000000L,0x0000000004040000L});
    public static final BitSet FOLLOW_delim_in_stmtAssign4393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_139_in_stmtAssert4433 = new BitSet(new long[]{0x2000000000002C00L,0x0400000015241171L,0x00100600100000C0L});
    public static final BitSet FOLLOW_exprList_in_stmtAssert4435 = new BitSet(new long[]{0x0000000000000000L,0x0000000004040000L});
    public static final BitSet FOLLOW_delim_in_stmtAssert4437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varOrFcnOrArray_in_stmtBind4455 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_BIND_in_stmtBind4457 = new BitSet(new long[]{0x2000000000002C00L,0x0400000011201171L,0x00100600100000C0L});
    public static final BitSet FOLLOW_expr_in_stmtBind4460 = new BitSet(new long[]{0x0000000000000000L,0x0000000004040000L});
    public static final BitSet FOLLOW_delim_in_stmtBind4463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_173_in_stmtPrint4496 = new BitSet(new long[]{0x2000000000002C00L,0x0400000011201171L,0x00100E40120000C0L});
    public static final BitSet FOLLOW_stmtPrintTarget_in_stmtPrint4499 = new BitSet(new long[]{0x2000000000002C00L,0x0400000011201171L,0x00100600100000C0L});
    public static final BitSet FOLLOW_exprList_in_stmtPrint4504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_166_in_stmtPrintTarget4539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_153_in_stmtPrintTarget4549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_171_in_stmtPrintTarget4558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_177_in_stmtReturn4577 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_122_in_stmtReturn4580 = new BitSet(new long[]{0x2000000000002C00L,0x0400000011201171L,0x00100600100000C0L});
    public static final BitSet FOLLOW_expr_in_stmtReturn4584 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_125_in_stmtReturn4587 = new BitSet(new long[]{0x2000000000002C00L,0x0400000011201171L,0x00100600100000C0L});
    public static final BitSet FOLLOW_expr_in_stmtReturn4589 = new BitSet(new long[]{0x0000000000000000L,0x2800000000000000L});
    public static final BitSet FOLLOW_123_in_stmtReturn4595 = new BitSet(new long[]{0x0000000000000000L,0x0000000004040000L});
    public static final BitSet FOLLOW_delim_in_stmtReturn4598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_177_in_stmtReturn4626 = new BitSet(new long[]{0x2000000000002C00L,0x0400000011201171L,0x00100600100000C0L});
    public static final BitSet FOLLOW_expr_in_stmtReturn4630 = new BitSet(new long[]{0x0000000000000000L,0x0000000004040000L});
    public static final BitSet FOLLOW_delim_in_stmtReturn4634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_141_in_stmtBreak4666 = new BitSet(new long[]{0x0000000000000000L,0x0000000004040000L});
    public static final BitSet FOLLOW_delim_in_stmtBreak4668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_147_in_stmtContinue4690 = new BitSet(new long[]{0x0000000000000000L,0x0000000004040000L});
    public static final BitSet FOLLOW_delim_in_stmtContinue4692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_157_in_stmtFor4719 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_122_in_stmtFor4721 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000021L,0x01C4023800005040L});
    public static final BitSet FOLLOW_stmtForInit_in_stmtFor4723 = new BitSet(new long[]{0x2000000000002C00L,0x0400000015201171L,0x00100600100000C0L});
    public static final BitSet FOLLOW_stmtForCond_in_stmtFor4725 = new BitSet(new long[]{0x2000000000002C00L,0x0C00000011201171L,0x00100600100000C0L});
    public static final BitSet FOLLOW_stmtForNext_in_stmtFor4727 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_123_in_stmtFor4729 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L,0x0800000000000000L});
    public static final BitSet FOLLOW_stmtBlock_in_stmtFor4731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMI_in_stmtForCond4781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_stmtForCond4806 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_SEMI_in_stmtForCond4808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMI_in_stmtForInit4831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeName_in_stmtForInit4857 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_IDENT_in_stmtForInit4859 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ASSIGN_in_stmtForInit4861 = new BitSet(new long[]{0x2000000000002C00L,0x0400000011201171L,0x00100600100000C0L});
    public static final BitSet FOLLOW_expr_in_stmtForInit4863 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_SEMI_in_stmtForInit4865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtAssign_in_stmtForInit4902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_stmtForNext4945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_179_in_stmtSwitch4964 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_122_in_stmtSwitch4966 = new BitSet(new long[]{0x2000000000002C00L,0x0400000011201171L,0x00100600100000C0L});
    public static final BitSet FOLLOW_expr_in_stmtSwitch4968 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_123_in_stmtSwitch4970 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L,0x0800000000000000L});
    public static final BitSet FOLLOW_braceOpen_in_stmtSwitch4972 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L,0x4000000000108000L});
    public static final BitSet FOLLOW_stmtsCase_in_stmtSwitch4974 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L,0x4000000000100000L});
    public static final BitSet FOLLOW_stmtDefault_in_stmtSwitch4976 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L,0x4000000000000000L});
    public static final BitSet FOLLOW_braceClose_in_stmtSwitch4979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtCase_in_stmtsCase5009 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_148_in_stmtDefault5033 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_128_in_stmtDefault5035 = new BitSet(new long[]{0x2000000000002C00L,0x0400000011241171L,0x0FDEA639B02C78C0L});
    public static final BitSet FOLLOW_NL_in_stmtDefault5037 = new BitSet(new long[]{0x2000000000002C00L,0x0400000011241171L,0x0FDEA639B02C78C0L});
    public static final BitSet FOLLOW_stmts_in_stmtDefault5040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_143_in_stmtCase5064 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_INT_LIT_in_stmtCase5067 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_128_in_stmtCase5070 = new BitSet(new long[]{0x2000000000002C00L,0x0400000011241171L,0x0FDEA639B02C78C0L});
    public static final BitSet FOLLOW_NL_in_stmtCase5072 = new BitSet(new long[]{0x2000000000002C00L,0x0400000011241171L,0x0FDEA639B02C78C0L});
    public static final BitSet FOLLOW_stmts_in_stmtCase5075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_149_in_stmtDoWhile5101 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L,0x0800000000000000L});
    public static final BitSet FOLLOW_stmtBlock_in_stmtDoWhile5103 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_186_in_stmtDoWhile5105 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_122_in_stmtDoWhile5107 = new BitSet(new long[]{0x2000000000002C00L,0x0400000011201171L,0x00100600100000C0L});
    public static final BitSet FOLLOW_expr_in_stmtDoWhile5109 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_123_in_stmtDoWhile5111 = new BitSet(new long[]{0x0000000000000000L,0x0000000004040000L});
    public static final BitSet FOLLOW_delim_in_stmtDoWhile5113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_160_in_stmtIf5140 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_stmtIfBlock_in_stmtIf5142 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000C00000L});
    public static final BitSet FOLLOW_stmtsElif_in_stmtIf5144 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_stmtElse_in_stmtIf5146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_122_in_stmtIfBlock5176 = new BitSet(new long[]{0x2000000000002C00L,0x0400000011201171L,0x00100600100000C0L});
    public static final BitSet FOLLOW_expr_in_stmtIfBlock5178 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_123_in_stmtIfBlock5180 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L,0x0800000000000000L});
    public static final BitSet FOLLOW_stmtBlock_in_stmtIfBlock5182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtElif_in_stmtsElif5198 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_150_in_stmtElif5218 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_stmtIfBlock_in_stmtElif5220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_151_in_stmtElse5244 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L,0x0800000000000000L});
    public static final BitSet FOLLOW_stmtBlock_in_stmtElse5246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_175_in_stmtProvided5260 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_122_in_stmtProvided5262 = new BitSet(new long[]{0x2000000000002C00L,0x0400000011201171L,0x00100600100000C0L});
    public static final BitSet FOLLOW_expr_in_stmtProvided5264 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_123_in_stmtProvided5266 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L,0x0800000000000000L});
    public static final BitSet FOLLOW_stmtBlock_in_stmtProvided5268 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_stmtElse_in_stmtProvided5271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_186_in_stmtWhile5298 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_122_in_stmtWhile5300 = new BitSet(new long[]{0x2000000000002C00L,0x0400000011201171L,0x00100600100000C0L});
    public static final BitSet FOLLOW_expr_in_stmtWhile5302 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_123_in_stmtWhile5303 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L,0x0800000000000000L});
    public static final BitSet FOLLOW_stmtBlock_in_stmtWhile5305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varAttr_in_varDeclaration5347 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L,0x01C4023800005000L});
    public static final BitSet FOLLOW_varDecl_in_varDeclaration5349 = new BitSet(new long[]{0x0000000000000000L,0x0000000004040000L});
    public static final BitSet FOLLOW_delim_in_varDeclaration5351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_146_in_varAttr5372 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0200000080040000L});
    public static final BitSet FOLLOW_185_in_varAttr5381 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0200000080040000L});
    public static final BitSet FOLLOW_159_in_varAttr5391 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0200000080040000L});
    public static final BitSet FOLLOW_varDeclList_in_varDecl5435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varArray_in_varDecl5452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varFcnRef_in_varDecl5468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDeclList_in_varDecl5484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_169_in_varDecl5490 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L,0x01C4003800005000L});
    public static final BitSet FOLLOW_typeName_in_varDecl5492 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_IDENT_in_varDecl5494 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_fcnArgumentList_in_varDecl5496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeName_in_varFcnRef5558 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_fcnRefTypeList_in_varFcnRef5560 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_IDENT_in_varFcnRef5562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_122_in_fcnRefTypeList5594 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000001L,0x01C4003800005000L});
    public static final BitSet FOLLOW_fcnRefTypes_in_fcnRefTypeList5596 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_123_in_fcnRefTypeList5598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeName_in_fcnRefTypes5612 = new BitSet(new long[]{0x0000000000000002L,0x2000000000000000L});
    public static final BitSet FOLLOW_125_in_fcnRefTypes5615 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L,0x01C4003800005000L});
    public static final BitSet FOLLOW_typeName_in_fcnRefTypes5617 = new BitSet(new long[]{0x0000000000000002L,0x2000000000000000L});
    public static final BitSet FOLLOW_typeName_in_varArray5658 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_IDENT_in_varArray5660 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_varArraySpec_in_varArray5662 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ASSIGN_in_varArray5665 = new BitSet(new long[]{0x2000000000002C00L,0x0400000011201171L,0x08100600100000C0L});
    public static final BitSet FOLLOW_initializer_in_varArray5667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_135_in_varArraySpec5705 = new BitSet(new long[]{0x2000000000002C00L,0x0400000011201171L,0x00100600100001C0L});
    public static final BitSet FOLLOW_varDim_in_varArraySpec5707 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_136_in_varArraySpec5709 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_expr_in_varDim5737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_initializer5757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_187_in_initializer5763 = new BitSet(new long[]{0x2000000000002C00L,0x0400000011201171L,0x08100600100000C0L});
    public static final BitSet FOLLOW_initializer_list_in_initializer5765 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_125_in_initializer5767 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_190_in_initializer5770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_initializer_in_initializer_list5784 = new BitSet(new long[]{0x0000000000000002L,0x2000000000000000L});
    public static final BitSet FOLLOW_125_in_initializer_list5787 = new BitSet(new long[]{0x2000000000002C00L,0x0400000011201171L,0x08100600100000C0L});
    public static final BitSet FOLLOW_initializer_in_initializer_list5789 = new BitSet(new long[]{0x0000000000000002L,0x2000000000000000L});
    public static final BitSet FOLLOW_typeName_in_varDeclList5821 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L,0x01C4003800005000L});
    public static final BitSet FOLLOW_varDeclList_in_varDeclList5826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varInit_in_varDeclList5831 = new BitSet(new long[]{0x0000000000000002L,0x2000000000000000L});
    public static final BitSet FOLLOW_125_in_varDeclList5834 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_varInit_in_varDeclList5837 = new BitSet(new long[]{0x0000000000000002L,0x2000000000000000L});
    public static final BitSet FOLLOW_IDENT_in_varInit5855 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ASSIGN_in_varInit5858 = new BitSet(new long[]{0x2000000000002C00L,0x0400000011201171L,0x00100600100000C0L});
    public static final BitSet FOLLOW_expr_in_varInit5860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_qualName5998 = new BitSet(new long[]{0x0000000000000002L,0x4000000000000000L});
    public static final BitSet FOLLOW_qualNameList_in_qualName6001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_126_in_qualNameList6041 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_IDENT_in_qualNameList6056 = new BitSet(new long[]{0x0000000000000002L,0x4000000000000000L});
    public static final BitSet FOLLOW_135_in_arrayLit6096 = new BitSet(new long[]{0x2000000000000800L,0x0000000011200041L,0x0010040010000100L});
    public static final BitSet FOLLOW_arrayLitList_in_arrayLit6098 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_136_in_arrayLit6100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayLitElem_in_arrayLitList6122 = new BitSet(new long[]{0x0000000000000002L,0x2000000000000000L});
    public static final BitSet FOLLOW_125_in_arrayLitList6125 = new BitSet(new long[]{0x2000000000000800L,0x0000000011200041L,0x0010040010000000L});
    public static final BitSet FOLLOW_arrayLitElem_in_arrayLitList6127 = new BitSet(new long[]{0x0000000000000002L,0x2000000000000000L});
    public static final BitSet FOLLOW_primitiveLit_in_arrayLitElem6151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_namedConstant_in_arrayLitElem6155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qualName_in_namedConstant6165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_boolLit6177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_170_in_nullLit6195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_LIT_in_numLit6212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OCT_LIT_in_numLit6221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REAL_LIT_in_numLit6230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HEX_LIT_in_numLit6239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolLit_in_primitiveLit6264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numLit_in_primitiveLit6283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nullLit_in_primitiveLit6303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_primitiveLit6322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_in_primitiveLit6350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INJECT_in_stmtInjection6385 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_NL_in_stmtInjection6391 = new BitSet(new long[]{0x0000000000000002L,0x0000000000040000L});
    public static final BitSet FOLLOW_INJECT_in_injectionCode6420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMI_in_delim6451 = new BitSet(new long[]{0x0000000000000002L,0x0000000000040000L});
    public static final BitSet FOLLOW_NL_in_delim6455 = new BitSet(new long[]{0x0000000000000002L,0x0000000000040000L});
    public static final BitSet FOLLOW_NL_in_delim6466 = new BitSet(new long[]{0x0000000000000002L,0x0000000000040000L});
    public static final BitSet FOLLOW_NL_in_delim6490 = new BitSet(new long[]{0x0000000000000002L,0x0000000000040000L});
    public static final BitSet FOLLOW_stmtInjection_in_synpred2_pollen694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtExport_in_synpred6_pollen795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fcnDefinition_in_synpred9_pollen904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDeclaration_in_synpred11_pollen925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fcnDefinition_in_synpred15_pollen1027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDeclaration_in_synpred16_pollen1036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_delim_in_synpred20_pollen1178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_synpred21_pollen1171 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ASSIGN_in_synpred21_pollen1173 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_INT_LIT_in_synpred21_pollen1175 = new BitSet(new long[]{0x0000000000000000L,0x0000000004040000L});
    public static final BitSet FOLLOW_delim_in_synpred21_pollen1178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_delim_in_synpred22_pollen1206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fcnDefinitionHost_in_synpred30_pollen1385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDeclaration_in_synpred32_pollen1401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_importAs_in_synpred34_pollen1453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_187_in_synpred42_pollen1732 = new BitSet(new long[]{0x2000000000000800L,0x0000000011200041L,0x01D4043810005000L});
    public static final BitSet FOLLOW_metaArgument_in_synpred42_pollen1734 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_125_in_synpred42_pollen1738 = new BitSet(new long[]{0x2000000000000800L,0x0000000011200041L,0x01D4043810005000L});
    public static final BitSet FOLLOW_metaArgument_in_synpred42_pollen1740 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_190_in_synpred42_pollen1744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qualName_in_synpred45_pollen1843 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_metaArguments_in_synpred45_pollen1845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_168_in_synpred47_pollen1922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_144_in_synpred48_pollen1942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_174_in_synpred49_pollen1960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_145_in_synpred50_pollen1978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_152_in_synpred51_pollen1996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NL_in_synpred53_pollen2080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NL_in_synpred57_pollen2147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_125_in_synpred76_pollen2349 = new BitSet(new long[]{0x2000000000002C00L,0x0400000011201171L,0x00100600100000C0L});
    public static final BitSet FOLLOW_expr_in_synpred76_pollen2351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_synpred77_pollen2346 = new BitSet(new long[]{0x0000000000000002L,0x2000000000000000L});
    public static final BitSet FOLLOW_125_in_synpred77_pollen2349 = new BitSet(new long[]{0x2000000000002C00L,0x0400000011201171L,0x00100600100000C0L});
    public static final BitSet FOLLOW_expr_in_synpred77_pollen2351 = new BitSet(new long[]{0x0000000000000002L,0x2000000000000000L});
    public static final BitSet FOLLOW_exprLogicalOr_in_synpred78_pollen2390 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_133_in_synpred78_pollen2392 = new BitSet(new long[]{0x2000000000002C00L,0x0400000011201171L,0x00100600100000C0L});
    public static final BitSet FOLLOW_expr_in_synpred78_pollen2394 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_128_in_synpred78_pollen2396 = new BitSet(new long[]{0x2000000000002C00L,0x0400000011201171L,0x00100600100000C0L});
    public static final BitSet FOLLOW_expr_in_synpred78_pollen2398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_189_in_synpred79_pollen2453 = new BitSet(new long[]{0x2000000000002C00L,0x0400000011201171L,0x00100600100000C0L});
    public static final BitSet FOLLOW_exprLogicalAnd_in_synpred79_pollen2455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_120_in_synpred80_pollen2506 = new BitSet(new long[]{0x2000000000002C00L,0x0400000011201171L,0x00100600100000C0L});
    public static final BitSet FOLLOW_exprBitwiseOr_in_synpred80_pollen2508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_188_in_synpred81_pollen2557 = new BitSet(new long[]{0x2000000000002C00L,0x0400000011201171L,0x00100600100000C0L});
    public static final BitSet FOLLOW_exprBitwiseXor_in_synpred81_pollen2559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_137_in_synpred82_pollen2607 = new BitSet(new long[]{0x2000000000002C00L,0x0400000011201171L,0x00100600100000C0L});
    public static final BitSet FOLLOW_exprBitwiseAnd_in_synpred82_pollen2609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_121_in_synpred83_pollen2657 = new BitSet(new long[]{0x2000000000002C00L,0x0400000011201171L,0x00100600100000C0L});
    public static final BitSet FOLLOW_exprEquality_in_synpred83_pollen2659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_equalityOp_in_synpred84_pollen2708 = new BitSet(new long[]{0x2000000000002C00L,0x0400000011201171L,0x00100600100000C0L});
    public static final BitSet FOLLOW_exprRelational_in_synpred84_pollen2710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relationalOp_in_synpred85_pollen2759 = new BitSet(new long[]{0x2000000000002C00L,0x0400000011201171L,0x00100600100000C0L});
    public static final BitSet FOLLOW_exprShift_in_synpred85_pollen2761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_shiftOp_in_synpred86_pollen2811 = new BitSet(new long[]{0x2000000000002C00L,0x0400000011201171L,0x00100600100000C0L});
    public static final BitSet FOLLOW_exprAddSub_in_synpred86_pollen2814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_addSubOp_in_synpred87_pollen2863 = new BitSet(new long[]{0x2000000000002C00L,0x0400000011201171L,0x00100600100000C0L});
    public static final BitSet FOLLOW_exprMultDiv_in_synpred87_pollen2865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multDivModOp_in_synpred88_pollen2920 = new BitSet(new long[]{0x2000000000002C00L,0x0400000011201171L,0x00100600100000C0L});
    public static final BitSet FOLLOW_exprUnary_in_synpred88_pollen2922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varOrFcnOrArray_in_synpred96_pollen3120 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000010L});
    public static final BitSet FOLLOW_incDecOp_in_synpred96_pollen3122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varOrFcnOrArray_in_synpred97_pollen3143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeName_in_synpred107_pollen3457 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_qualName_in_synpred107_pollen3459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeName_in_synpred108_pollen3495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qualName_in_synpred109_pollen3531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_122_in_synpred111_pollen3572 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L,0x01C4003800005000L});
    public static final BitSet FOLLOW_typeName_in_synpred111_pollen3574 = new BitSet(new long[]{0x0000000000000000L,0x2800000000000000L});
    public static final BitSet FOLLOW_125_in_synpred111_pollen3577 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L,0x01C4003800005000L});
    public static final BitSet FOLLOW_typeName_in_synpred111_pollen3579 = new BitSet(new long[]{0x0000000000000000L,0x2800000000000000L});
    public static final BitSet FOLLOW_123_in_synpred111_pollen3583 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_qualName_in_synpred111_pollen3585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fieldOrArrayAccess_in_synpred116_pollen3804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fieldOrArrayAccess_in_synpred118_pollen3837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_134_in_synpred119_pollen3831 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_IDENT_in_synpred119_pollen3833 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_fcnArgumentList_in_synpred119_pollen3835 = new BitSet(new long[]{0x0000000000000002L,0x4000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_fieldOrArrayAccess_in_synpred119_pollen3837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fieldOrArrayAccess_in_synpred120_pollen3883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_134_in_synpred121_pollen3879 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_IDENT_in_synpred121_pollen3881 = new BitSet(new long[]{0x0000000000000002L,0x4000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_fieldOrArrayAccess_in_synpred121_pollen3883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_134_in_synpred122_pollen3922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fieldOrArrayAccess_in_synpred123_pollen3946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qualName_in_synpred124_pollen3942 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_fcnArgumentList_in_synpred124_pollen3944 = new BitSet(new long[]{0x0000000000000002L,0x4000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_fieldOrArrayAccess_in_synpred124_pollen3946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fieldOrArrayAccess_in_synpred125_pollen3976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayAccess_in_synpred127_pollen3994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_126_in_synpred128_pollen4008 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_IDENT_in_synpred128_pollen4010 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_fcnArgumentList_in_synpred128_pollen4012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exprList_in_synpred129_pollen4064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmt_in_synpred130_pollen4121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmt_in_synpred131_pollen4121 = new BitSet(new long[]{0x2000000000002C02L,0x0400000011241171L,0x0FDEA639B02C78C0L});
    public static final BitSet FOLLOW_NL_in_synpred132_pollen4143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDeclaration_in_synpred133_pollen4164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtAssign_in_synpred134_pollen4171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtBind_in_synpred136_pollen4181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtInjection_in_synpred148_pollen4245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varOrFcnOrArray_in_synpred149_pollen4262 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ASSIGN_in_synpred149_pollen4264 = new BitSet(new long[]{0x2000000000002C00L,0x0400000011201171L,0x00100600100000C0L});
    public static final BitSet FOLLOW_expr_in_synpred149_pollen4266 = new BitSet(new long[]{0x0000000000000000L,0x0000000004040000L});
    public static final BitSet FOLLOW_delim_in_synpred149_pollen4268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_injectionCode_in_synpred150_pollen4303 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ASSIGN_in_synpred150_pollen4305 = new BitSet(new long[]{0x2000000000002C00L,0x0400000011201171L,0x00100600100000C0L});
    public static final BitSet FOLLOW_expr_in_synpred150_pollen4307 = new BitSet(new long[]{0x0000000000000000L,0x0000000004040000L});
    public static final BitSet FOLLOW_delim_in_synpred150_pollen4310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varOrFcnOrArray_in_synpred151_pollen4345 = new BitSet(new long[]{0x0000000000008390L,0x0000000022018200L});
    public static final BitSet FOLLOW_assignOp_in_synpred151_pollen4347 = new BitSet(new long[]{0x2000000000002C00L,0x0400000011201171L,0x00100600100000C0L});
    public static final BitSet FOLLOW_expr_in_synpred151_pollen4349 = new BitSet(new long[]{0x0000000000000000L,0x0000000004040000L});
    public static final BitSet FOLLOW_delim_in_synpred151_pollen4352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_177_in_synpred156_pollen4577 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_122_in_synpred156_pollen4580 = new BitSet(new long[]{0x2000000000002C00L,0x0400000011201171L,0x00100600100000C0L});
    public static final BitSet FOLLOW_expr_in_synpred156_pollen4584 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_125_in_synpred156_pollen4587 = new BitSet(new long[]{0x2000000000002C00L,0x0400000011201171L,0x00100600100000C0L});
    public static final BitSet FOLLOW_expr_in_synpred156_pollen4589 = new BitSet(new long[]{0x0000000000000000L,0x2800000000000000L});
    public static final BitSet FOLLOW_123_in_synpred156_pollen4595 = new BitSet(new long[]{0x0000000000000000L,0x0000000004040000L});
    public static final BitSet FOLLOW_delim_in_synpred156_pollen4598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeName_in_synpred159_pollen4857 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_IDENT_in_synpred159_pollen4859 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ASSIGN_in_synpred159_pollen4861 = new BitSet(new long[]{0x2000000000002C00L,0x0400000011201171L,0x00100600100000C0L});
    public static final BitSet FOLLOW_expr_in_synpred159_pollen4863 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_SEMI_in_synpred159_pollen4865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NL_in_synpred163_pollen5037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NL_in_synpred164_pollen5072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeName_in_synpred172_pollen5419 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_IDENT_in_synpred172_pollen5421 = new BitSet(new long[]{0x0000000000000020L,0x2000000000000000L});
    public static final BitSet FOLLOW_ASSIGN_in_synpred172_pollen5424 = new BitSet(new long[]{0x2000000000002C00L,0x0400000011201171L,0x00100600100000C0L});
    public static final BitSet FOLLOW_expr_in_synpred172_pollen5426 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_125_in_synpred172_pollen5430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeName_in_synpred173_pollen5443 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_IDENT_in_synpred173_pollen5445 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_135_in_synpred173_pollen5447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeName_in_synpred174_pollen5460 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_122_in_synpred174_pollen5462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeName_in_synpred175_pollen5477 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_varInit_in_synpred175_pollen5479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_135_in_synpred179_pollen5705 = new BitSet(new long[]{0x2000000000002C00L,0x0400000011201171L,0x00100600100001C0L});
    public static final BitSet FOLLOW_varDim_in_synpred179_pollen5707 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_136_in_synpred179_pollen5709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_125_in_synpred183_pollen5787 = new BitSet(new long[]{0x2000000000002C00L,0x0400000011201171L,0x08100600100000C0L});
    public static final BitSet FOLLOW_initializer_in_synpred183_pollen5789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeName_in_synpred184_pollen5821 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L,0x01C4003800005000L});
    public static final BitSet FOLLOW_varDeclList_in_synpred184_pollen5826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_125_in_synpred185_pollen5834 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_varInit_in_synpred185_pollen5837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qualNameList_in_synpred195_pollen6001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_126_in_synpred196_pollen6041 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_IDENT_in_synpred196_pollen6056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NL_in_synpred208_pollen6391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NL_in_synpred209_pollen6455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMI_in_synpred210_pollen6451 = new BitSet(new long[]{0x0000000000000002L,0x0000000000040000L});
    public static final BitSet FOLLOW_NL_in_synpred210_pollen6455 = new BitSet(new long[]{0x0000000000000002L,0x0000000000040000L});
    public static final BitSet FOLLOW_NL_in_synpred211_pollen6466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NL_in_synpred212_pollen6466 = new BitSet(new long[]{0x0000000000000002L,0x0000000000040000L});
    public static final BitSet FOLLOW_NL_in_synpred214_pollen6480 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L,0x4000000000000000L});
    public static final BitSet FOLLOW_190_in_synpred214_pollen6484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NL_in_synpred215_pollen6490 = new BitSet(new long[]{0x0000000000000002L});

}