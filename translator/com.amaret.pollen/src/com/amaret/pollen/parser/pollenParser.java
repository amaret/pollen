// $ANTLR 3.4 /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g 2012-08-15 14:39:55

    package com.amaret.pollen.parser;
    import java.util.EnumSet;
    import java.util.ArrayList;
    import java.lang.*;
    import java.io.*;


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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ADD_EQ", "ASSIGN", "BIND", "BITAND_EQ", "BITOR_EQ", "BITXOR_EQ", "BIT_NOT", "CHAR", "D", "DELIM", "DIV_EQ", "D_ARG", "D_ARR", "D_ARR_DIM", "D_CLASS", "D_COMPOSITION", "D_CONFIG", "D_CONST", "D_ENUM", "D_ENUMVAL", "D_FCN_CTOR", "D_FCN_DCL", "D_FCN_DEF", "D_FCN_REF", "D_FCN_TYP_LIST", "D_FCN_TYP_NM", "D_FIELD", "D_INSTANCE", "D_META", "D_META_ARGS", "D_MODULE", "D_PROTOCOL", "D_PROTOCOL_MEM", "D_REF", "D_VAR", "D_VOID", "E", "EQ", "EXPORT", "E_ADDR", "E_ARRLIT", "E_BINARY", "E_CALL", "E_CALL_ARGS", "E_COND", "E_CONST", "E_EXPR", "E_FIELD", "E_HASH", "E_IDENT", "E_INDEX", "E_NEW", "E_NUMLIT", "E_PAREN", "E_QUEST", "E_UNARY", "E_VEC", "FCNBODY", "FCNPARMS", "GT_EQ", "H", "HEX_LIT", "HOST", "I", "IDENT", "IJ_BEG", "IJ_END", "ILLEGAL_CHARACTER", "INJECT", "INJECT_CODE", "INT_LIT", "LIST", "LOG_NOT", "LSHFT_EQ", "LT_EQ", "LU", "ML_COMMENT", "MODULE", "MOD_EQ", "MUL_EQ", "NIL", "NL", "NOT_EQ", "O", "OCT_LIT", "QNAME", "REAL_LIT", "RSHFT_EQ", "SEMI", "SL_COMMENT", "STRING", "SUB_EQ", "S_ASSERT", "S_ASSIGN", "S_BIND", "S_BLOCK", "S_BREAK", "S_CASE", "S_CONTINUE", "S_DECL", "S_DEFAULT", "S_DO_WHILE", "S_ELIF", "S_ELSE", "S_FOR", "S_FOREACH", "S_IF", "S_IMPORT", "S_PACKAGE", "S_PRINT", "S_PROVIDED", "S_RETURN", "S_SWITCH", "S_WHILE", "T_ARR", "T_DEF", "T_FCN", "T_STD", "T_USER_TYPE", "UNIT", "WS", "'%'", "'&&'", "'&'", "'('", "')'", "'*'", "'+'", "'++'", "','", "'-'", "'--'", "'.'", "'/'", "':'", "'<'", "'<<'", "'>'", "'>>'", "'?'", "'@'", "'['", "']'", "'^'", "'as'", "'assert'", "'bool'", "'break'", "'byte'", "'case'", "'class'", "'composition'", "'const'", "'continue'", "'default'", "'do'", "'elif'", "'else'", "'enum'", "'err'", "'export'", "'extends'", "'false'", "'for'", "'foreach'", "'from'", "'host'", "'if'", "'implements'", "'import'", "'in'", "'int16'", "'int32'", "'int8'", "'log'", "'meta'", "'module'", "'new'", "'null'", "'out'", "'package'", "'print'", "'protocol'", "'provided'", "'public'", "'return'", "'string'", "'switch'", "'true'", "'type'", "'uint16'", "'uint32'", "'uint8'", "'volatile'", "'while'", "'{'", "'|'", "'||'", "'}'"
    };

    public static final int EOF=-1;
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
    public static final int T__191=191;
    public static final int T__192=192;
    public static final int T__193=193;
    public static final int T__194=194;
    public static final int T__195=195;
    public static final int T__196=196;
    public static final int T__197=197;
    public static final int T__198=198;
    public static final int T__199=199;
    public static final int T__200=200;
    public static final int T__201=201;
    public static final int T__202=202;
    public static final int ADD_EQ=4;
    public static final int ASSIGN=5;
    public static final int BIND=6;
    public static final int BITAND_EQ=7;
    public static final int BITOR_EQ=8;
    public static final int BITXOR_EQ=9;
    public static final int BIT_NOT=10;
    public static final int CHAR=11;
    public static final int D=12;
    public static final int DELIM=13;
    public static final int DIV_EQ=14;
    public static final int D_ARG=15;
    public static final int D_ARR=16;
    public static final int D_ARR_DIM=17;
    public static final int D_CLASS=18;
    public static final int D_COMPOSITION=19;
    public static final int D_CONFIG=20;
    public static final int D_CONST=21;
    public static final int D_ENUM=22;
    public static final int D_ENUMVAL=23;
    public static final int D_FCN_CTOR=24;
    public static final int D_FCN_DCL=25;
    public static final int D_FCN_DEF=26;
    public static final int D_FCN_REF=27;
    public static final int D_FCN_TYP_LIST=28;
    public static final int D_FCN_TYP_NM=29;
    public static final int D_FIELD=30;
    public static final int D_INSTANCE=31;
    public static final int D_META=32;
    public static final int D_META_ARGS=33;
    public static final int D_MODULE=34;
    public static final int D_PROTOCOL=35;
    public static final int D_PROTOCOL_MEM=36;
    public static final int D_REF=37;
    public static final int D_VAR=38;
    public static final int D_VOID=39;
    public static final int E=40;
    public static final int EQ=41;
    public static final int EXPORT=42;
    public static final int E_ADDR=43;
    public static final int E_ARRLIT=44;
    public static final int E_BINARY=45;
    public static final int E_CALL=46;
    public static final int E_CALL_ARGS=47;
    public static final int E_COND=48;
    public static final int E_CONST=49;
    public static final int E_EXPR=50;
    public static final int E_FIELD=51;
    public static final int E_HASH=52;
    public static final int E_IDENT=53;
    public static final int E_INDEX=54;
    public static final int E_NEW=55;
    public static final int E_NUMLIT=56;
    public static final int E_PAREN=57;
    public static final int E_QUEST=58;
    public static final int E_UNARY=59;
    public static final int E_VEC=60;
    public static final int FCNBODY=61;
    public static final int FCNPARMS=62;
    public static final int GT_EQ=63;
    public static final int H=64;
    public static final int HEX_LIT=65;
    public static final int HOST=66;
    public static final int I=67;
    public static final int IDENT=68;
    public static final int IJ_BEG=69;
    public static final int IJ_END=70;
    public static final int ILLEGAL_CHARACTER=71;
    public static final int INJECT=72;
    public static final int INJECT_CODE=73;
    public static final int INT_LIT=74;
    public static final int LIST=75;
    public static final int LOG_NOT=76;
    public static final int LSHFT_EQ=77;
    public static final int LT_EQ=78;
    public static final int LU=79;
    public static final int ML_COMMENT=80;
    public static final int MODULE=81;
    public static final int MOD_EQ=82;
    public static final int MUL_EQ=83;
    public static final int NIL=84;
    public static final int NL=85;
    public static final int NOT_EQ=86;
    public static final int O=87;
    public static final int OCT_LIT=88;
    public static final int QNAME=89;
    public static final int REAL_LIT=90;
    public static final int RSHFT_EQ=91;
    public static final int SEMI=92;
    public static final int SL_COMMENT=93;
    public static final int STRING=94;
    public static final int SUB_EQ=95;
    public static final int S_ASSERT=96;
    public static final int S_ASSIGN=97;
    public static final int S_BIND=98;
    public static final int S_BLOCK=99;
    public static final int S_BREAK=100;
    public static final int S_CASE=101;
    public static final int S_CONTINUE=102;
    public static final int S_DECL=103;
    public static final int S_DEFAULT=104;
    public static final int S_DO_WHILE=105;
    public static final int S_ELIF=106;
    public static final int S_ELSE=107;
    public static final int S_FOR=108;
    public static final int S_FOREACH=109;
    public static final int S_IF=110;
    public static final int S_IMPORT=111;
    public static final int S_PACKAGE=112;
    public static final int S_PRINT=113;
    public static final int S_PROVIDED=114;
    public static final int S_RETURN=115;
    public static final int S_SWITCH=116;
    public static final int S_WHILE=117;
    public static final int T_ARR=118;
    public static final int T_DEF=119;
    public static final int T_FCN=120;
    public static final int T_STD=121;
    public static final int T_USER_TYPE=122;
    public static final int UNIT=123;
    public static final int WS=124;

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
        this.state.ruleMemo = new HashMap[341+1];
         

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


    public static class unit_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "unit"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:207:1: unit : ( NL )* unitPackage -> ^( UNIT unitPackage ) ;
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

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:208:5: ( ( NL )* unitPackage -> ^( UNIT unitPackage ) )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:208:9: ( NL )* unitPackage
            {
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:208:9: ( NL )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==NL) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:208:10: NL
            	    {
            	    NL1=(Atom)match(input,NL,FOLLOW_NL_in_unit718); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_NL.add(NL1);


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            pushFollow(FOLLOW_unitPackage_in_unit722);
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
            // 208:29: -> ^( UNIT unitPackage )
            {
                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:208:32: ^( UNIT unitPackage )
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
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:210:1: unitPackage : stmtPackage importList ( stmtInjection )? ( unitTypeDefinition )? ( stmtInjection )? EOF ;
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

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:211:2: ( stmtPackage importList ( stmtInjection )? ( unitTypeDefinition )? ( stmtInjection )? EOF )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:211:5: stmtPackage importList ( stmtInjection )? ( unitTypeDefinition )? ( stmtInjection )? EOF
            {
            root_0 = (BaseNode)adaptor.nil();


            pushFollow(FOLLOW_stmtPackage_in_unitPackage748);
            stmtPackage3=stmtPackage();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, stmtPackage3.getTree());

            pushFollow(FOLLOW_importList_in_unitPackage754);
            importList4=importList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, importList4.getTree());

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:213:7: ( stmtInjection )?
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
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:213:8: stmtInjection
                    {
                    pushFollow(FOLLOW_stmtInjection_in_unitPackage763);
                    stmtInjection5=stmtInjection();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmtInjection5.getTree());

                    }
                    break;

            }


            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:214:7: ( unitTypeDefinition )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0 >= 154 && LA3_0 <= 155)||LA3_0==162||(LA3_0 >= 179 && LA3_0 <= 180)||LA3_0==186) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:214:8: unitTypeDefinition
                    {
                    pushFollow(FOLLOW_unitTypeDefinition_in_unitPackage774);
                    unitTypeDefinition6=unitTypeDefinition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, unitTypeDefinition6.getTree());

                    }
                    break;

            }


            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:215:7: ( stmtInjection )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==INJECT) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:215:8: stmtInjection
                    {
                    pushFollow(FOLLOW_stmtInjection_in_unitPackage785);
                    stmtInjection7=stmtInjection();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmtInjection7.getTree());

                    }
                    break;

            }


            EOF8=(Atom)match(input,EOF,FOLLOW_EOF_in_unitPackage795); if (state.failed) return retval;
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
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:218:1: stmtPackage : ( 'package' qualName delim -> ^( S_PACKAGE qualName ) | -> ^( S_PACKAGE ) );
    public final pollenParser.stmtPackage_return stmtPackage() throws RecognitionException {
        pollenParser.stmtPackage_return retval = new pollenParser.stmtPackage_return();
        retval.start = input.LT(1);

        int stmtPackage_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom string_literal9=null;
        pollenParser.qualName_return qualName10 =null;

        pollenParser.delim_return delim11 =null;


        BaseNode string_literal9_tree=null;
        RewriteRuleTokenStream stream_184=new RewriteRuleTokenStream(adaptor,"token 184");
        RewriteRuleSubtreeStream stream_qualName=new RewriteRuleSubtreeStream(adaptor,"rule qualName");
        RewriteRuleSubtreeStream stream_delim=new RewriteRuleSubtreeStream(adaptor,"rule delim");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:219:2: ( 'package' qualName delim -> ^( S_PACKAGE qualName ) | -> ^( S_PACKAGE ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==184) ) {
                alt5=1;
            }
            else if ( (LA5_0==EOF||LA5_0==INJECT||(LA5_0 >= 154 && LA5_0 <= 155)||LA5_0==162||LA5_0==169||LA5_0==173||(LA5_0 >= 179 && LA5_0 <= 180)||LA5_0==186) ) {
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
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:219:4: 'package' qualName delim
                    {
                    string_literal9=(Atom)match(input,184,FOLLOW_184_in_stmtPackage805); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_184.add(string_literal9);


                    pushFollow(FOLLOW_qualName_in_stmtPackage807);
                    qualName10=qualName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_qualName.add(qualName10.getTree());

                    pushFollow(FOLLOW_delim_in_stmtPackage809);
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
                    // 219:29: -> ^( S_PACKAGE qualName )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:219:32: ^( S_PACKAGE qualName )
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
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:220:4: 
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
                    // 220:4: -> ^( S_PACKAGE )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:220:7: ^( S_PACKAGE )
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
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:222:1: stmtExport : 'export' ^ qualName delim ;
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

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:223:5: ( 'export' ^ qualName delim )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:223:9: 'export' ^ qualName delim
            {
            root_0 = (BaseNode)adaptor.nil();


            string_literal12=(Atom)match(input,164,FOLLOW_164_in_stmtExport841); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal12_tree = 
            (BaseNode)adaptor.create(string_literal12)
            ;
            root_0 = (BaseNode)adaptor.becomeRoot(string_literal12_tree, root_0);
            }

            pushFollow(FOLLOW_qualName_in_stmtExport844);
            qualName13=qualName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, qualName13.getTree());

            pushFollow(FOLLOW_delim_in_stmtExport846);
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
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:225:1: exportList : ( stmtExport )+ -> ^( LIST[\"LIST\"] ( stmtExport )+ ) ;
    public final pollenParser.exportList_return exportList() throws RecognitionException {
        pollenParser.exportList_return retval = new pollenParser.exportList_return();
        retval.start = input.LT(1);

        int exportList_StartIndex = input.index();

        BaseNode root_0 = null;

        pollenParser.stmtExport_return stmtExport15 =null;


        RewriteRuleSubtreeStream stream_stmtExport=new RewriteRuleSubtreeStream(adaptor,"rule stmtExport");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:226:5: ( ( stmtExport )+ -> ^( LIST[\"LIST\"] ( stmtExport )+ ) )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:226:9: ( stmtExport )+
            {
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:226:9: ( stmtExport )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==164) ) {
                    int LA6_1 = input.LA(2);

                    if ( (synpred6_pollen()) ) {
                        alt6=1;
                    }


                }


                switch (alt6) {
            	case 1 :
            	    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:226:9: stmtExport
            	    {
            	    pushFollow(FOLLOW_stmtExport_in_exportList864);
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
            // 227:6: -> ^( LIST[\"LIST\"] ( stmtExport )+ )
            {
                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:227:9: ^( LIST[\"LIST\"] ( stmtExport )+ )
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
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:229:1: classDefinition : 'class' classDef -> ^( D_CLASS classDef ) ;
    public final pollenParser.classDefinition_return classDefinition() throws RecognitionException {
        pollenParser.classDefinition_return retval = new pollenParser.classDefinition_return();
        retval.start = input.LT(1);

        int classDefinition_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom string_literal16=null;
        pollenParser.classDef_return classDef17 =null;


        BaseNode string_literal16_tree=null;
        RewriteRuleTokenStream stream_154=new RewriteRuleTokenStream(adaptor,"token 154");
        RewriteRuleSubtreeStream stream_classDef=new RewriteRuleSubtreeStream(adaptor,"rule classDef");

        	if (tl.size() > 1) { // nested class
        	  ti = new TypeInfo();
        	  tl.add(ti);		
        	}	

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:242:2: ( 'class' classDef -> ^( D_CLASS classDef ) )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:242:5: 'class' classDef
            {
            string_literal16=(Atom)match(input,154,FOLLOW_154_in_classDefinition910); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_154.add(string_literal16);


            pushFollow(FOLLOW_classDef_in_classDefinition912);
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
            // 242:22: -> ^( D_CLASS classDef )
            {
                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:242:25: ^( D_CLASS classDef )
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
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:244:1: classDef : IDENT ^ ( implementsClause )? braceOpen ( classFeature )* braceClose ;
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

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:245:2: ( IDENT ^ ( implementsClause )? braceOpen ( classFeature )* braceClose )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:245:4: IDENT ^ ( implementsClause )? braceOpen ( classFeature )* braceClose
            {
            root_0 = (BaseNode)adaptor.nil();


            IDENT18=(Atom)match(input,IDENT,FOLLOW_IDENT_in_classDef931); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENT18_tree = 
            (BaseNode)adaptor.create(IDENT18)
            ;
            root_0 = (BaseNode)adaptor.becomeRoot(IDENT18_tree, root_0);
            }

            if ( state.backtracking==0 ) { ti.setTypeName((IDENT18!=null?IDENT18.getText():null)); ti.setUnitFlags(EnumSet.of(UnitFlags.CLASS));}

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:247:3: ( implementsClause )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==172) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:247:4: implementsClause
                    {
                    pushFollow(FOLLOW_implementsClause_in_classDef942);
                    implementsClause19=implementsClause();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, implementsClause19.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_braceOpen_in_classDef949);
            braceOpen20=braceOpen();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, braceOpen20.getTree());

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:248:13: ( classFeature )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==IDENT||LA8_0==INJECT||LA8_0==128||LA8_0==150||LA8_0==152||LA8_0==154||LA8_0==156||LA8_0==162||LA8_0==170||(LA8_0 >= 175 && LA8_0 <= 177)||LA8_0==181||LA8_0==188||LA8_0==190||(LA8_0 >= 194 && LA8_0 <= 197)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:248:14: classFeature
            	    {
            	    pushFollow(FOLLOW_classFeature_in_classDef952);
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


            pushFollow(FOLLOW_braceClose_in_classDef956);
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
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:251:1: classFeature : ( fcnDefinition | enumDefinition | varDeclaration | classDefinition | stmtInjection );
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

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:252:5: ( fcnDefinition | enumDefinition | varDeclaration | classDefinition | stmtInjection )
            int alt9=5;
            switch ( input.LA(1) ) {
            case 128:
            case 188:
                {
                alt9=1;
                }
                break;
            case 170:
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
            case 150:
            case 152:
            case 175:
            case 176:
            case 177:
            case 190:
            case 194:
            case 195:
            case 196:
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
            case 162:
                {
                alt9=2;
                }
                break;
            case 156:
            case 181:
            case 197:
                {
                alt9=3;
                }
                break;
            case 154:
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
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:252:9: fcnDefinition
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    pushFollow(FOLLOW_fcnDefinition_in_classFeature973);
                    fcnDefinition23=fcnDefinition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, fcnDefinition23.getTree());

                    }
                    break;
                case 2 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:253:9: enumDefinition
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    pushFollow(FOLLOW_enumDefinition_in_classFeature984);
                    enumDefinition24=enumDefinition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, enumDefinition24.getTree());

                    }
                    break;
                case 3 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:254:9: varDeclaration
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    pushFollow(FOLLOW_varDeclaration_in_classFeature994);
                    varDeclaration25=varDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDeclaration25.getTree());

                    }
                    break;
                case 4 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:255:9: classDefinition
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    pushFollow(FOLLOW_classDefinition_in_classFeature1004);
                    classDefinition26=classDefinition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, classDefinition26.getTree());

                    }
                    break;
                case 5 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:256:9: stmtInjection
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    pushFollow(FOLLOW_stmtInjection_in_classFeature1014);
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
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:258:1: moduleDefinition : 'module' IDENT ( implementsClause )? braceOpen ( moduleFeature )* braceClose -> ^( D_MODULE ^( IDENT ( implementsClause )? ( moduleFeature )* ) ) ;
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
        RewriteRuleTokenStream stream_180=new RewriteRuleTokenStream(adaptor,"token 180");
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleSubtreeStream stream_implementsClause=new RewriteRuleSubtreeStream(adaptor,"rule implementsClause");
        RewriteRuleSubtreeStream stream_moduleFeature=new RewriteRuleSubtreeStream(adaptor,"rule moduleFeature");
        RewriteRuleSubtreeStream stream_braceOpen=new RewriteRuleSubtreeStream(adaptor,"rule braceOpen");
        RewriteRuleSubtreeStream stream_braceClose=new RewriteRuleSubtreeStream(adaptor,"rule braceClose");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:259:2: ( 'module' IDENT ( implementsClause )? braceOpen ( moduleFeature )* braceClose -> ^( D_MODULE ^( IDENT ( implementsClause )? ( moduleFeature )* ) ) )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:259:7: 'module' IDENT ( implementsClause )? braceOpen ( moduleFeature )* braceClose
            {
            string_literal28=(Atom)match(input,180,FOLLOW_180_in_moduleDefinition1031); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_180.add(string_literal28);


            IDENT29=(Atom)match(input,IDENT,FOLLOW_IDENT_in_moduleDefinition1033); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENT.add(IDENT29);


            if ( state.backtracking==0 ) { ti.setTypeName((IDENT29!=null?IDENT29.getText():null)); ti.setUnitFlags(EnumSet.of(UnitFlags.MODULE));}

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:261:4: ( implementsClause )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==172) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:261:5: implementsClause
                    {
                    pushFollow(FOLLOW_implementsClause_in_moduleDefinition1048);
                    implementsClause30=implementsClause();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_implementsClause.add(implementsClause30.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_braceOpen_in_moduleDefinition1057);
            braceOpen31=braceOpen();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_braceOpen.add(braceOpen31.getTree());

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:262:14: ( moduleFeature )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==IDENT||LA11_0==INJECT||LA11_0==128||LA11_0==150||LA11_0==152||LA11_0==154||LA11_0==156||LA11_0==162||LA11_0==170||(LA11_0 >= 175 && LA11_0 <= 177)||LA11_0==181||LA11_0==188||LA11_0==190||(LA11_0 >= 194 && LA11_0 <= 197)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:262:15: moduleFeature
            	    {
            	    pushFollow(FOLLOW_moduleFeature_in_moduleDefinition1060);
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


            pushFollow(FOLLOW_braceClose_in_moduleDefinition1064);
            braceClose33=braceClose();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_braceClose.add(braceClose33.getTree());

            // AST REWRITE
            // elements: implementsClause, moduleFeature, IDENT
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (BaseNode)adaptor.nil();
            // 263:4: -> ^( D_MODULE ^( IDENT ( implementsClause )? ( moduleFeature )* ) )
            {
                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:263:7: ^( D_MODULE ^( IDENT ( implementsClause )? ( moduleFeature )* ) )
                {
                BaseNode root_1 = (BaseNode)adaptor.nil();
                root_1 = (BaseNode)adaptor.becomeRoot(
                (BaseNode)adaptor.create(D_MODULE, "D_MODULE")
                , root_1);

                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:263:18: ^( IDENT ( implementsClause )? ( moduleFeature )* )
                {
                BaseNode root_2 = (BaseNode)adaptor.nil();
                root_2 = (BaseNode)adaptor.becomeRoot(
                stream_IDENT.nextNode()
                , root_2);

                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:263:26: ( implementsClause )?
                if ( stream_implementsClause.hasNext() ) {
                    adaptor.addChild(root_2, stream_implementsClause.nextTree());

                }
                stream_implementsClause.reset();

                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:263:44: ( moduleFeature )*
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
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:265:1: moduleFeature : ( fcnDefinition | varDeclaration | enumDefinition | classDefinition | stmtInjection );
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

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:266:2: ( fcnDefinition | varDeclaration | enumDefinition | classDefinition | stmtInjection )
            int alt12=5;
            switch ( input.LA(1) ) {
            case 128:
            case 188:
                {
                alt12=1;
                }
                break;
            case 170:
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
            case 150:
            case 152:
            case 175:
            case 176:
            case 177:
            case 190:
            case 194:
            case 195:
            case 196:
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
            case 156:
            case 181:
            case 197:
                {
                alt12=2;
                }
                break;
            case 162:
                {
                alt12=3;
                }
                break;
            case 154:
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
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:266:6: fcnDefinition
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    pushFollow(FOLLOW_fcnDefinition_in_moduleFeature1096);
                    fcnDefinition34=fcnDefinition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, fcnDefinition34.getTree());

                    }
                    break;
                case 2 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:267:8: varDeclaration
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    pushFollow(FOLLOW_varDeclaration_in_moduleFeature1105);
                    varDeclaration35=varDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDeclaration35.getTree());

                    }
                    break;
                case 3 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:268:6: enumDefinition
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    pushFollow(FOLLOW_enumDefinition_in_moduleFeature1112);
                    enumDefinition36=enumDefinition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, enumDefinition36.getTree());

                    }
                    break;
                case 4 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:269:6: classDefinition
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    pushFollow(FOLLOW_classDefinition_in_moduleFeature1119);
                    classDefinition37=classDefinition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, classDefinition37.getTree());

                    }
                    break;
                case 5 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:270:5: stmtInjection
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    pushFollow(FOLLOW_stmtInjection_in_moduleFeature1125);
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
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:272:1: enumDefinition : 'enum' enumDef -> ^( D_ENUM enumDef ) ;
    public final pollenParser.enumDefinition_return enumDefinition() throws RecognitionException {
        pollenParser.enumDefinition_return retval = new pollenParser.enumDefinition_return();
        retval.start = input.LT(1);

        int enumDefinition_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom string_literal39=null;
        pollenParser.enumDef_return enumDef40 =null;


        BaseNode string_literal39_tree=null;
        RewriteRuleTokenStream stream_162=new RewriteRuleTokenStream(adaptor,"token 162");
        RewriteRuleSubtreeStream stream_enumDef=new RewriteRuleSubtreeStream(adaptor,"rule enumDef");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:273:2: ( 'enum' enumDef -> ^( D_ENUM enumDef ) )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:273:4: 'enum' enumDef
            {
            string_literal39=(Atom)match(input,162,FOLLOW_162_in_enumDefinition1138); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_162.add(string_literal39);


            pushFollow(FOLLOW_enumDef_in_enumDefinition1140);
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
            // 273:19: -> ^( D_ENUM enumDef )
            {
                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:273:22: ^( D_ENUM enumDef )
                {
                BaseNode root_1 = (BaseNode)adaptor.nil();
                root_1 = (BaseNode)adaptor.becomeRoot(
                (BaseNode)adaptor.create(D_ENUM, "D_ENUM")
                , root_1);

                adaptor.addChild(root_1, stream_enumDef.nextTree());

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
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:275:1: enumDef : ( IDENT ^ braceOpen enumList braceClose ) ;
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


        	if (tl.size() > 1) { // nested 
        	  ti = new TypeInfo();
        	  tl.add(ti);		
        	}	

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:288:2: ( ( IDENT ^ braceOpen enumList braceClose ) )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:288:5: ( IDENT ^ braceOpen enumList braceClose )
            {
            root_0 = (BaseNode)adaptor.nil();


            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:288:5: ( IDENT ^ braceOpen enumList braceClose )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:288:6: IDENT ^ braceOpen enumList braceClose
            {
            IDENT41=(Atom)match(input,IDENT,FOLLOW_IDENT_in_enumDef1170); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENT41_tree = 
            (BaseNode)adaptor.create(IDENT41)
            ;
            root_0 = (BaseNode)adaptor.becomeRoot(IDENT41_tree, root_0);
            }

            if ( state.backtracking==0 ) { ti.setTypeName((IDENT41!=null?IDENT41.getText():null)); ti.setUnitFlags(EnumSet.of(UnitFlags.ENUM));}

            pushFollow(FOLLOW_braceOpen_in_enumDef1180);
            braceOpen42=braceOpen();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, braceOpen42.getTree());

            pushFollow(FOLLOW_enumList_in_enumDef1182);
            enumList43=enumList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, enumList43.getTree());

            pushFollow(FOLLOW_braceClose_in_enumDef1184);
            braceClose44=braceClose();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, braceClose44.getTree());

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
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:292:1: enumList : enumElement ( ',' ! enumElement )* ;
    public final pollenParser.enumList_return enumList() throws RecognitionException {
        pollenParser.enumList_return retval = new pollenParser.enumList_return();
        retval.start = input.LT(1);

        int enumList_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom char_literal46=null;
        pollenParser.enumElement_return enumElement45 =null;

        pollenParser.enumElement_return enumElement47 =null;


        BaseNode char_literal46_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:293:2: ( enumElement ( ',' ! enumElement )* )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:293:4: enumElement ( ',' ! enumElement )*
            {
            root_0 = (BaseNode)adaptor.nil();


            pushFollow(FOLLOW_enumElement_in_enumList1195);
            enumElement45=enumElement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, enumElement45.getTree());

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:293:16: ( ',' ! enumElement )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==133) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:293:17: ',' ! enumElement
            	    {
            	    char_literal46=(Atom)match(input,133,FOLLOW_133_in_enumList1198); if (state.failed) return retval;

            	    pushFollow(FOLLOW_enumElement_in_enumList1201);
            	    enumElement47=enumElement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, enumElement47.getTree());

            	    }
            	    break;

            	default :
            	    break loop13;
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
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:295:1: enumElement : ( IDENT ^ ( ASSIGN ! INT_LIT ) ( delim )? | IDENT ^ ( delim )? );
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

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:296:2: ( IDENT ^ ( ASSIGN ! INT_LIT ) ( delim )? | IDENT ^ ( delim )? )
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
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:296:4: IDENT ^ ( ASSIGN ! INT_LIT ) ( delim )?
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    IDENT48=(Atom)match(input,IDENT,FOLLOW_IDENT_in_enumElement1213); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENT48_tree = 
                    (BaseNode)adaptor.create(IDENT48)
                    ;
                    root_0 = (BaseNode)adaptor.becomeRoot(IDENT48_tree, root_0);
                    }

                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:296:11: ( ASSIGN ! INT_LIT )
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:296:12: ASSIGN ! INT_LIT
                    {
                    ASSIGN49=(Atom)match(input,ASSIGN,FOLLOW_ASSIGN_in_enumElement1217); if (state.failed) return retval;

                    INT_LIT50=(Atom)match(input,INT_LIT,FOLLOW_INT_LIT_in_enumElement1220); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INT_LIT50_tree = 
                    (BaseNode)adaptor.create(INT_LIT50)
                    ;
                    adaptor.addChild(root_0, INT_LIT50_tree);
                    }

                    }


                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:296:29: ( delim )?
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
                        case 133:
                            {
                            int LA14_3 = input.LA(2);

                            if ( (synpred20_pollen()) ) {
                                alt14=1;
                            }
                            }
                            break;
                        case 202:
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
                            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:296:30: delim
                            {
                            pushFollow(FOLLOW_delim_in_enumElement1224);
                            delim51=delim();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, delim51.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:297:4: IDENT ^ ( delim )?
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    IDENT52=(Atom)match(input,IDENT,FOLLOW_IDENT_in_enumElement1231); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENT52_tree = 
                    (BaseNode)adaptor.create(IDENT52)
                    ;
                    root_0 = (BaseNode)adaptor.becomeRoot(IDENT52_tree, root_0);
                    }

                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:297:11: ( delim )?
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
                        case 133:
                            {
                            int LA15_3 = input.LA(2);

                            if ( (synpred22_pollen()) ) {
                                alt15=1;
                            }
                            }
                            break;
                        case 202:
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
                            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:297:12: delim
                            {
                            pushFollow(FOLLOW_delim_in_enumElement1235);
                            delim53=delim();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, delim53.getTree());

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
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:299:1: protocolDefinition : 'protocol' IDENT ( extendsClause )? braceOpen ( protocolFeature )* braceClose -> ^( D_PROTOCOL ^( IDENT ( extendsClause )? ( protocolFeature )* ) ) ;
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
        RewriteRuleTokenStream stream_186=new RewriteRuleTokenStream(adaptor,"token 186");
        RewriteRuleSubtreeStream stream_protocolFeature=new RewriteRuleSubtreeStream(adaptor,"rule protocolFeature");
        RewriteRuleSubtreeStream stream_extendsClause=new RewriteRuleSubtreeStream(adaptor,"rule extendsClause");
        RewriteRuleSubtreeStream stream_braceOpen=new RewriteRuleSubtreeStream(adaptor,"rule braceOpen");
        RewriteRuleSubtreeStream stream_braceClose=new RewriteRuleSubtreeStream(adaptor,"rule braceClose");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:300:2: ( 'protocol' IDENT ( extendsClause )? braceOpen ( protocolFeature )* braceClose -> ^( D_PROTOCOL ^( IDENT ( extendsClause )? ( protocolFeature )* ) ) )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:300:4: 'protocol' IDENT ( extendsClause )? braceOpen ( protocolFeature )* braceClose
            {
            string_literal54=(Atom)match(input,186,FOLLOW_186_in_protocolDefinition1247); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_186.add(string_literal54);


            IDENT55=(Atom)match(input,IDENT,FOLLOW_IDENT_in_protocolDefinition1249); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENT.add(IDENT55);


            if ( state.backtracking==0 ) { ti.setTypeName((IDENT55!=null?IDENT55.getText():null)); ti.setUnitFlags(EnumSet.of(UnitFlags.PROTOCOL));}

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:302:3: ( extendsClause )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==165) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:302:3: extendsClause
                    {
                    pushFollow(FOLLOW_extendsClause_in_protocolDefinition1257);
                    extendsClause56=extendsClause();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_extendsClause.add(extendsClause56.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_braceOpen_in_protocolDefinition1263);
            braceOpen57=braceOpen();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_braceOpen.add(braceOpen57.getTree());

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:303:13: ( protocolFeature )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==IDENT||LA18_0==INJECT||LA18_0==128||LA18_0==150||LA18_0==152||LA18_0==162||LA18_0==170||(LA18_0 >= 175 && LA18_0 <= 177)||LA18_0==188||LA18_0==190||(LA18_0 >= 194 && LA18_0 <= 196)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:303:14: protocolFeature
            	    {
            	    pushFollow(FOLLOW_protocolFeature_in_protocolDefinition1266);
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


            pushFollow(FOLLOW_braceClose_in_protocolDefinition1270);
            braceClose59=braceClose();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_braceClose.add(braceClose59.getTree());

            // AST REWRITE
            // elements: protocolFeature, extendsClause, IDENT
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (BaseNode)adaptor.nil();
            // 304:3: -> ^( D_PROTOCOL ^( IDENT ( extendsClause )? ( protocolFeature )* ) )
            {
                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:304:6: ^( D_PROTOCOL ^( IDENT ( extendsClause )? ( protocolFeature )* ) )
                {
                BaseNode root_1 = (BaseNode)adaptor.nil();
                root_1 = (BaseNode)adaptor.becomeRoot(
                (BaseNode)adaptor.create(D_PROTOCOL, "D_PROTOCOL")
                , root_1);

                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:304:19: ^( IDENT ( extendsClause )? ( protocolFeature )* )
                {
                BaseNode root_2 = (BaseNode)adaptor.nil();
                root_2 = (BaseNode)adaptor.becomeRoot(
                stream_IDENT.nextNode()
                , root_2);

                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:304:27: ( extendsClause )?
                if ( stream_extendsClause.hasNext() ) {
                    adaptor.addChild(root_2, stream_extendsClause.nextTree());

                }
                stream_extendsClause.reset();

                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:304:42: ( protocolFeature )*
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
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:306:1: protocolFeature : ( enumDefinition | fcnDeclaration | stmtInjection );
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

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:307:5: ( enumDefinition | fcnDeclaration | stmtInjection )
            int alt19=3;
            switch ( input.LA(1) ) {
            case 162:
                {
                alt19=1;
                }
                break;
            case IDENT:
            case 128:
            case 150:
            case 152:
            case 170:
            case 175:
            case 176:
            case 177:
            case 188:
            case 190:
            case 194:
            case 195:
            case 196:
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
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:307:9: enumDefinition
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    pushFollow(FOLLOW_enumDefinition_in_protocolFeature1304);
                    enumDefinition60=enumDefinition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, enumDefinition60.getTree());

                    }
                    break;
                case 2 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:308:9: fcnDeclaration
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    pushFollow(FOLLOW_fcnDeclaration_in_protocolFeature1314);
                    fcnDeclaration61=fcnDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, fcnDeclaration61.getTree());

                    }
                    break;
                case 3 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:309:9: stmtInjection
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    pushFollow(FOLLOW_stmtInjection_in_protocolFeature1325);
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
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:311:1: compositionDefinition : 'composition' IDENT ( extendsClause )? braceOpen ( compositionFeature )* braceClose -> ^( D_COMPOSITION IDENT ( extendsClause )? ( compositionFeature )* ) ;
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
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleTokenStream stream_155=new RewriteRuleTokenStream(adaptor,"token 155");
        RewriteRuleSubtreeStream stream_extendsClause=new RewriteRuleSubtreeStream(adaptor,"rule extendsClause");
        RewriteRuleSubtreeStream stream_compositionFeature=new RewriteRuleSubtreeStream(adaptor,"rule compositionFeature");
        RewriteRuleSubtreeStream stream_braceOpen=new RewriteRuleSubtreeStream(adaptor,"rule braceOpen");
        RewriteRuleSubtreeStream stream_braceClose=new RewriteRuleSubtreeStream(adaptor,"rule braceClose");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:312:2: ( 'composition' IDENT ( extendsClause )? braceOpen ( compositionFeature )* braceClose -> ^( D_COMPOSITION IDENT ( extendsClause )? ( compositionFeature )* ) )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:312:4: 'composition' IDENT ( extendsClause )? braceOpen ( compositionFeature )* braceClose
            {
            string_literal63=(Atom)match(input,155,FOLLOW_155_in_compositionDefinition1338); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_155.add(string_literal63);


            IDENT64=(Atom)match(input,IDENT,FOLLOW_IDENT_in_compositionDefinition1340); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENT.add(IDENT64);


            if ( state.backtracking==0 ) { ti.setTypeName((IDENT64!=null?IDENT64.getText():null)); 
            		  //DBG("IDENT64 " + (IDENT64!=null?IDENT64.getText():null));
            		  ti.setUnitFlags(EnumSet.of(UnitFlags.COMPOSITION));
            		  //DBG(ti.getTypeName() + ", " + ti.getUnitFlags().toString());
            		}

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:318:3: ( extendsClause )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==165) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:318:3: extendsClause
                    {
                    pushFollow(FOLLOW_extendsClause_in_compositionDefinition1348);
                    extendsClause65=extendsClause();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_extendsClause.add(extendsClause65.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_braceOpen_in_compositionDefinition1355);
            braceOpen66=braceOpen();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_braceOpen.add(braceOpen66.getTree());

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:319:13: ( compositionFeature )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==IDENT||LA21_0==INJECT||LA21_0==128||LA21_0==150||LA21_0==152||LA21_0==156||LA21_0==162||LA21_0==164||LA21_0==170||(LA21_0 >= 175 && LA21_0 <= 177)||LA21_0==181||LA21_0==188||LA21_0==190||(LA21_0 >= 194 && LA21_0 <= 197)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:319:14: compositionFeature
            	    {
            	    pushFollow(FOLLOW_compositionFeature_in_compositionDefinition1358);
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


            pushFollow(FOLLOW_braceClose_in_compositionDefinition1362);
            braceClose68=braceClose();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_braceClose.add(braceClose68.getTree());

            // AST REWRITE
            // elements: IDENT, extendsClause, compositionFeature
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (BaseNode)adaptor.nil();
            // 320:4: -> ^( D_COMPOSITION IDENT ( extendsClause )? ( compositionFeature )* )
            {
                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:320:7: ^( D_COMPOSITION IDENT ( extendsClause )? ( compositionFeature )* )
                {
                BaseNode root_1 = (BaseNode)adaptor.nil();
                root_1 = (BaseNode)adaptor.becomeRoot(
                (BaseNode)adaptor.create(D_COMPOSITION, "D_COMPOSITION")
                , root_1);

                adaptor.addChild(root_1, 
                stream_IDENT.nextNode()
                );

                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:320:29: ( extendsClause )?
                if ( stream_extendsClause.hasNext() ) {
                    adaptor.addChild(root_1, stream_extendsClause.nextTree());

                }
                stream_extendsClause.reset();

                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:320:44: ( compositionFeature )*
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
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:322:1: compositionFeature : ( exportList | fcnDefinitionHost | enumDefinition | varDeclaration | stmtInjection );
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

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:323:3: ( exportList | fcnDefinitionHost | enumDefinition | varDeclaration | stmtInjection )
            int alt22=5;
            switch ( input.LA(1) ) {
            case 164:
                {
                alt22=1;
                }
                break;
            case 128:
            case 188:
                {
                alt22=2;
                }
                break;
            case 170:
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
            case 150:
            case 152:
            case 175:
            case 176:
            case 177:
            case 190:
            case 194:
            case 195:
            case 196:
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
            case 162:
                {
                alt22=3;
                }
                break;
            case 156:
            case 181:
            case 197:
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
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:323:6: exportList
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    pushFollow(FOLLOW_exportList_in_compositionFeature1392);
                    exportList69=exportList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, exportList69.getTree());

                    }
                    break;
                case 2 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:324:7: fcnDefinitionHost
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    pushFollow(FOLLOW_fcnDefinitionHost_in_compositionFeature1400);
                    fcnDefinitionHost70=fcnDefinitionHost();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, fcnDefinitionHost70.getTree());

                    }
                    break;
                case 3 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:325:7: enumDefinition
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    pushFollow(FOLLOW_enumDefinition_in_compositionFeature1408);
                    enumDefinition71=enumDefinition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, enumDefinition71.getTree());

                    }
                    break;
                case 4 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:326:7: varDeclaration
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    pushFollow(FOLLOW_varDeclaration_in_compositionFeature1416);
                    varDeclaration72=varDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDeclaration72.getTree());

                    }
                    break;
                case 5 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:327:6: stmtInjection
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    pushFollow(FOLLOW_stmtInjection_in_compositionFeature1423);
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
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:329:1: stmtImport : ( ( importFrom )? 'import' qualName ( metaArguments )? ( importAs )? delim ) -> ^( S_IMPORT ( importFrom )? qualName ( metaArguments )? ( importAs )? ) ;
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
        RewriteRuleTokenStream stream_173=new RewriteRuleTokenStream(adaptor,"token 173");
        RewriteRuleSubtreeStream stream_importFrom=new RewriteRuleSubtreeStream(adaptor,"rule importFrom");
        RewriteRuleSubtreeStream stream_qualName=new RewriteRuleSubtreeStream(adaptor,"rule qualName");
        RewriteRuleSubtreeStream stream_importAs=new RewriteRuleSubtreeStream(adaptor,"rule importAs");
        RewriteRuleSubtreeStream stream_delim=new RewriteRuleSubtreeStream(adaptor,"rule delim");
        RewriteRuleSubtreeStream stream_metaArguments=new RewriteRuleSubtreeStream(adaptor,"rule metaArguments");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:330:5: ( ( ( importFrom )? 'import' qualName ( metaArguments )? ( importAs )? delim ) -> ^( S_IMPORT ( importFrom )? qualName ( metaArguments )? ( importAs )? ) )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:330:9: ( ( importFrom )? 'import' qualName ( metaArguments )? ( importAs )? delim )
            {
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:330:9: ( ( importFrom )? 'import' qualName ( metaArguments )? ( importAs )? delim )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:330:10: ( importFrom )? 'import' qualName ( metaArguments )? ( importAs )? delim
            {
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:330:10: ( importFrom )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==169) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:330:10: importFrom
                    {
                    pushFollow(FOLLOW_importFrom_in_stmtImport1440);
                    importFrom74=importFrom();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_importFrom.add(importFrom74.getTree());

                    }
                    break;

            }


            string_literal75=(Atom)match(input,173,FOLLOW_173_in_stmtImport1451); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_173.add(string_literal75);


            pushFollow(FOLLOW_qualName_in_stmtImport1453);
            qualName76=qualName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_qualName.add(qualName76.getTree());

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:331:27: ( metaArguments )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==199) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:331:28: metaArguments
                    {
                    pushFollow(FOLLOW_metaArguments_in_stmtImport1456);
                    metaArguments77=metaArguments();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_metaArguments.add(metaArguments77.getTree());

                    }
                    break;

            }


            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:332:10: ( importAs )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==148) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:332:10: importAs
                    {
                    pushFollow(FOLLOW_importAs_in_stmtImport1469);
                    importAs78=importAs();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_importAs.add(importAs78.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_delim_in_stmtImport1472);
            delim79=delim();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_delim.add(delim79.getTree());

            }


            // AST REWRITE
            // elements: qualName, importAs, metaArguments, importFrom
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (BaseNode)adaptor.nil();
            // 332:27: -> ^( S_IMPORT ( importFrom )? qualName ( metaArguments )? ( importAs )? )
            {
                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:332:30: ^( S_IMPORT ( importFrom )? qualName ( metaArguments )? ( importAs )? )
                {
                BaseNode root_1 = (BaseNode)adaptor.nil();
                root_1 = (BaseNode)adaptor.becomeRoot(
                (BaseNode)adaptor.create(S_IMPORT, "S_IMPORT")
                , root_1);

                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:332:41: ( importFrom )?
                if ( stream_importFrom.hasNext() ) {
                    adaptor.addChild(root_1, stream_importFrom.nextTree());

                }
                stream_importFrom.reset();

                adaptor.addChild(root_1, stream_qualName.nextTree());

                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:332:62: ( metaArguments )?
                if ( stream_metaArguments.hasNext() ) {
                    adaptor.addChild(root_1, stream_metaArguments.nextTree());

                }
                stream_metaArguments.reset();

                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:332:77: ( importAs )?
                if ( stream_importAs.hasNext() ) {
                    adaptor.addChild(root_1, stream_importAs.nextTree());

                }
                stream_importAs.reset();

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
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:334:1: importFrom : 'from' ^ qualName ;
    public final pollenParser.importFrom_return importFrom() throws RecognitionException {
        pollenParser.importFrom_return retval = new pollenParser.importFrom_return();
        retval.start = input.LT(1);

        int importFrom_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom string_literal80=null;
        pollenParser.qualName_return qualName81 =null;


        BaseNode string_literal80_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:335:5: ( 'from' ^ qualName )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:335:9: 'from' ^ qualName
            {
            root_0 = (BaseNode)adaptor.nil();


            string_literal80=(Atom)match(input,169,FOLLOW_169_in_importFrom1508); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal80_tree = 
            (BaseNode)adaptor.create(string_literal80)
            ;
            root_0 = (BaseNode)adaptor.becomeRoot(string_literal80_tree, root_0);
            }

            pushFollow(FOLLOW_qualName_in_importFrom1511);
            qualName81=qualName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, qualName81.getTree());

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
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:337:1: importAs : 'as' ^ qualName ;
    public final pollenParser.importAs_return importAs() throws RecognitionException {
        pollenParser.importAs_return retval = new pollenParser.importAs_return();
        retval.start = input.LT(1);

        int importAs_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom string_literal82=null;
        pollenParser.qualName_return qualName83 =null;


        BaseNode string_literal82_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:338:2: ( 'as' ^ qualName )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:338:4: 'as' ^ qualName
            {
            root_0 = (BaseNode)adaptor.nil();


            string_literal82=(Atom)match(input,148,FOLLOW_148_in_importAs1524); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal82_tree = 
            (BaseNode)adaptor.create(string_literal82)
            ;
            root_0 = (BaseNode)adaptor.becomeRoot(string_literal82_tree, root_0);
            }

            pushFollow(FOLLOW_qualName_in_importAs1527);
            qualName83=qualName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, qualName83.getTree());

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
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:340:1: importList : ( stmtImport )* -> ^( LIST[\"LIST\"] ( stmtImport )* ) ;
    public final pollenParser.importList_return importList() throws RecognitionException {
        pollenParser.importList_return retval = new pollenParser.importList_return();
        retval.start = input.LT(1);

        int importList_StartIndex = input.index();

        BaseNode root_0 = null;

        pollenParser.stmtImport_return stmtImport84 =null;


        RewriteRuleSubtreeStream stream_stmtImport=new RewriteRuleSubtreeStream(adaptor,"rule stmtImport");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:341:5: ( ( stmtImport )* -> ^( LIST[\"LIST\"] ( stmtImport )* ) )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:341:9: ( stmtImport )*
            {
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:341:9: ( stmtImport )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==169||LA26_0==173) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:341:9: stmtImport
            	    {
            	    pushFollow(FOLLOW_stmtImport_in_importList1542);
            	    stmtImport84=stmtImport();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_stmtImport.add(stmtImport84.getTree());

            	    }
            	    break;

            	default :
            	    break loop26;
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
            // 342:6: -> ^( LIST[\"LIST\"] ( stmtImport )* )
            {
                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:342:9: ^( LIST[\"LIST\"] ( stmtImport )* )
                {
                BaseNode root_1 = (BaseNode)adaptor.nil();
                root_1 = (BaseNode)adaptor.becomeRoot(
                new ListNode(LIST, "LIST")
                , root_1);

                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:342:34: ( stmtImport )*
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
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:344:1: meta : 'meta' ( braceOpen metaFormalParameters braceClose ) -> ^( D_META metaFormalParameters ) ;
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
        RewriteRuleTokenStream stream_179=new RewriteRuleTokenStream(adaptor,"token 179");
        RewriteRuleSubtreeStream stream_metaFormalParameters=new RewriteRuleSubtreeStream(adaptor,"rule metaFormalParameters");
        RewriteRuleSubtreeStream stream_braceOpen=new RewriteRuleSubtreeStream(adaptor,"rule braceOpen");
        RewriteRuleSubtreeStream stream_braceClose=new RewriteRuleSubtreeStream(adaptor,"rule braceClose");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:345:2: ( 'meta' ( braceOpen metaFormalParameters braceClose ) -> ^( D_META metaFormalParameters ) )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:345:4: 'meta' ( braceOpen metaFormalParameters braceClose )
            {
            string_literal85=(Atom)match(input,179,FOLLOW_179_in_meta1576); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_179.add(string_literal85);


            if ( state.backtracking==0 ) { ti.setUnitFlags(EnumSet.of(UnitFlags.META));}

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:347:3: ( braceOpen metaFormalParameters braceClose )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:347:4: braceOpen metaFormalParameters braceClose
            {
            pushFollow(FOLLOW_braceOpen_in_meta1585);
            braceOpen86=braceOpen();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_braceOpen.add(braceOpen86.getTree());

            pushFollow(FOLLOW_metaFormalParameters_in_meta1587);
            metaFormalParameters87=metaFormalParameters();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_metaFormalParameters.add(metaFormalParameters87.getTree());

            pushFollow(FOLLOW_braceClose_in_meta1589);
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
            // 348:3: -> ^( D_META metaFormalParameters )
            {
                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:348:6: ^( D_META metaFormalParameters )
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
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:350:1: metaFormalParameters : metaFormalParameter ( ',' metaFormalParameter )* -> ( metaFormalParameter )+ ;
    public final pollenParser.metaFormalParameters_return metaFormalParameters() throws RecognitionException {
        pollenParser.metaFormalParameters_return retval = new pollenParser.metaFormalParameters_return();
        retval.start = input.LT(1);

        int metaFormalParameters_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom char_literal90=null;
        pollenParser.metaFormalParameter_return metaFormalParameter89 =null;

        pollenParser.metaFormalParameter_return metaFormalParameter91 =null;


        BaseNode char_literal90_tree=null;
        RewriteRuleTokenStream stream_133=new RewriteRuleTokenStream(adaptor,"token 133");
        RewriteRuleSubtreeStream stream_metaFormalParameter=new RewriteRuleSubtreeStream(adaptor,"rule metaFormalParameter");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:351:4: ( metaFormalParameter ( ',' metaFormalParameter )* -> ( metaFormalParameter )+ )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:351:8: metaFormalParameter ( ',' metaFormalParameter )*
            {
            pushFollow(FOLLOW_metaFormalParameter_in_metaFormalParameters1614);
            metaFormalParameter89=metaFormalParameter();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_metaFormalParameter.add(metaFormalParameter89.getTree());

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:351:29: ( ',' metaFormalParameter )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==133) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:351:30: ',' metaFormalParameter
            	    {
            	    char_literal90=(Atom)match(input,133,FOLLOW_133_in_metaFormalParameters1618); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_133.add(char_literal90);


            	    pushFollow(FOLLOW_metaFormalParameter_in_metaFormalParameters1620);
            	    metaFormalParameter91=metaFormalParameter();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_metaFormalParameter.add(metaFormalParameter91.getTree());

            	    }
            	    break;

            	default :
            	    break loop27;
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
            // 351:56: -> ( metaFormalParameter )+
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
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:354:1: metaFormalParameter : metaFormalParameterType IDENT ( ASSIGN metaArgument )? -> ^( metaFormalParameterType ^( IDENT ( metaArgument )? ) ) ;
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

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:355:4: ( metaFormalParameterType IDENT ( ASSIGN metaArgument )? -> ^( metaFormalParameterType ^( IDENT ( metaArgument )? ) ) )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:355:4: metaFormalParameterType IDENT ( ASSIGN metaArgument )?
            {
            pushFollow(FOLLOW_metaFormalParameterType_in_metaFormalParameter1643);
            metaFormalParameterType92=metaFormalParameterType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_metaFormalParameterType.add(metaFormalParameterType92.getTree());

            IDENT93=(Atom)match(input,IDENT,FOLLOW_IDENT_in_metaFormalParameter1645); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENT.add(IDENT93);


            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:355:34: ( ASSIGN metaArgument )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==ASSIGN) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:355:35: ASSIGN metaArgument
                    {
                    ASSIGN94=(Atom)match(input,ASSIGN,FOLLOW_ASSIGN_in_metaFormalParameter1648); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ASSIGN.add(ASSIGN94);


                    pushFollow(FOLLOW_metaArgument_in_metaFormalParameter1650);
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
            // 356:2: -> ^( metaFormalParameterType ^( IDENT ( metaArgument )? ) )
            {
                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:356:5: ^( metaFormalParameterType ^( IDENT ( metaArgument )? ) )
                {
                BaseNode root_1 = (BaseNode)adaptor.nil();
                root_1 = (BaseNode)adaptor.becomeRoot(stream_metaFormalParameterType.nextNode(), root_1);

                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:356:31: ^( IDENT ( metaArgument )? )
                {
                BaseNode root_2 = (BaseNode)adaptor.nil();
                root_2 = (BaseNode)adaptor.becomeRoot(
                stream_IDENT.nextNode()
                , root_2);

                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:356:39: ( metaArgument )?
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
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:359:1: metaFormalParameterType : ( 'type' | builtinType );
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

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:360:3: ( 'type' | builtinType )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==193) ) {
                alt29=1;
            }
            else if ( (LA29_0==150||LA29_0==152||(LA29_0 >= 175 && LA29_0 <= 177)||LA29_0==190||(LA29_0 >= 194 && LA29_0 <= 196)) ) {
                alt29=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;

            }
            switch (alt29) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:360:5: 'type'
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    string_literal96=(Atom)match(input,193,FOLLOW_193_in_metaFormalParameterType1679); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal96_tree = 
                    (BaseNode)adaptor.create(string_literal96)
                    ;
                    adaptor.addChild(root_0, string_literal96_tree);
                    }

                    }
                    break;
                case 2 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:361:5: builtinType
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    pushFollow(FOLLOW_builtinType_in_metaFormalParameterType1686);
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
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:363:1: metaArguments : ( '{' metaArgument ( ',' metaArgument )* '}' -> ^( D_META_ARGS ( metaArgument )+ ) | '{' '}' -> ^( D_META_ARGS NIL ) );
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
        RewriteRuleTokenStream stream_202=new RewriteRuleTokenStream(adaptor,"token 202");
        RewriteRuleTokenStream stream_133=new RewriteRuleTokenStream(adaptor,"token 133");
        RewriteRuleTokenStream stream_199=new RewriteRuleTokenStream(adaptor,"token 199");
        RewriteRuleSubtreeStream stream_metaArgument=new RewriteRuleSubtreeStream(adaptor,"rule metaArgument");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:364:4: ( '{' metaArgument ( ',' metaArgument )* '}' -> ^( D_META_ARGS ( metaArgument )+ ) | '{' '}' -> ^( D_META_ARGS NIL ) )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==199) ) {
                int LA31_1 = input.LA(2);

                if ( (synpred41_pollen()) ) {
                    alt31=1;
                }
                else if ( (true) ) {
                    alt31=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 31, 1, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;

            }
            switch (alt31) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:364:7: '{' metaArgument ( ',' metaArgument )* '}'
                    {
                    char_literal98=(Atom)match(input,199,FOLLOW_199_in_metaArguments1699); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_199.add(char_literal98);


                    pushFollow(FOLLOW_metaArgument_in_metaArguments1701);
                    metaArgument99=metaArgument();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_metaArgument.add(metaArgument99.getTree());

                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:364:25: ( ',' metaArgument )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==133) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:364:26: ',' metaArgument
                    	    {
                    	    char_literal100=(Atom)match(input,133,FOLLOW_133_in_metaArguments1705); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_133.add(char_literal100);


                    	    pushFollow(FOLLOW_metaArgument_in_metaArguments1707);
                    	    metaArgument101=metaArgument();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_metaArgument.add(metaArgument101.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop30;
                        }
                    } while (true);


                    char_literal102=(Atom)match(input,202,FOLLOW_202_in_metaArguments1711); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_202.add(char_literal102);


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
                    // 364:49: -> ^( D_META_ARGS ( metaArgument )+ )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:364:52: ^( D_META_ARGS ( metaArgument )+ )
                        {
                        BaseNode root_1 = (BaseNode)adaptor.nil();
                        root_1 = (BaseNode)adaptor.becomeRoot(
                        (BaseNode)adaptor.create(D_META_ARGS, "D_META_ARGS")
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
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:365:6: '{' '}'
                    {
                    char_literal103=(Atom)match(input,199,FOLLOW_199_in_metaArguments1727); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_199.add(char_literal103);


                    char_literal104=(Atom)match(input,202,FOLLOW_202_in_metaArguments1729); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_202.add(char_literal104);


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
                    // 365:19: -> ^( D_META_ARGS NIL )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:365:22: ^( D_META_ARGS NIL )
                        {
                        BaseNode root_1 = (BaseNode)adaptor.nil();
                        root_1 = (BaseNode)adaptor.becomeRoot(
                        (BaseNode)adaptor.create(D_META_ARGS, "D_META_ARGS")
                        , root_1);

                        adaptor.addChild(root_1, 
                        (BaseNode)adaptor.create(NIL, "NIL")
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
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:368:1: metaArgument : ( numLit | boolLit | STRING | CHAR | typeNameScalar );
    public final pollenParser.metaArgument_return metaArgument() throws RecognitionException {
        pollenParser.metaArgument_return retval = new pollenParser.metaArgument_return();
        retval.start = input.LT(1);

        int metaArgument_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom STRING107=null;
        Atom CHAR108=null;
        pollenParser.numLit_return numLit105 =null;

        pollenParser.boolLit_return boolLit106 =null;

        pollenParser.typeNameScalar_return typeNameScalar109 =null;


        BaseNode STRING107_tree=null;
        BaseNode CHAR108_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:369:2: ( numLit | boolLit | STRING | CHAR | typeNameScalar )
            int alt32=5;
            switch ( input.LA(1) ) {
            case HEX_LIT:
            case INT_LIT:
            case OCT_LIT:
            case REAL_LIT:
                {
                alt32=1;
                }
                break;
            case 166:
            case 192:
                {
                alt32=2;
                }
                break;
            case STRING:
                {
                alt32=3;
                }
                break;
            case CHAR:
                {
                alt32=4;
                }
                break;
            case IDENT:
            case 150:
            case 152:
            case 175:
            case 176:
            case 177:
            case 190:
            case 194:
            case 195:
            case 196:
                {
                alt32=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;

            }

            switch (alt32) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:369:4: numLit
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    pushFollow(FOLLOW_numLit_in_metaArgument1758);
                    numLit105=numLit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, numLit105.getTree());

                    }
                    break;
                case 2 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:370:4: boolLit
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    pushFollow(FOLLOW_boolLit_in_metaArgument1764);
                    boolLit106=boolLit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, boolLit106.getTree());

                    }
                    break;
                case 3 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:371:5: STRING
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    STRING107=(Atom)match(input,STRING,FOLLOW_STRING_in_metaArgument1770); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRING107_tree = 
                    (BaseNode)adaptor.create(STRING107)
                    ;
                    adaptor.addChild(root_0, STRING107_tree);
                    }

                    }
                    break;
                case 4 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:372:5: CHAR
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    CHAR108=(Atom)match(input,CHAR,FOLLOW_CHAR_in_metaArgument1776); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CHAR108_tree = 
                    (BaseNode)adaptor.create(CHAR108)
                    ;
                    adaptor.addChild(root_0, CHAR108_tree);
                    }

                    }
                    break;
                case 5 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:373:4: typeNameScalar
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    pushFollow(FOLLOW_typeNameScalar_in_metaArgument1781);
                    typeNameScalar109=typeNameScalar();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeNameScalar109.getTree());

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
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:375:1: typeName : typeNameScalar ( '[' ']' )? ;
    public final pollenParser.typeName_return typeName() throws RecognitionException {
        pollenParser.typeName_return retval = new pollenParser.typeName_return();
        retval.start = input.LT(1);

        int typeName_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom char_literal111=null;
        Atom char_literal112=null;
        pollenParser.typeNameScalar_return typeNameScalar110 =null;


        BaseNode char_literal111_tree=null;
        BaseNode char_literal112_tree=null;


        	//System.out.print("typeName: "); DBG_LT();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:379:2: ( typeNameScalar ( '[' ']' )? )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:379:4: typeNameScalar ( '[' ']' )?
            {
            root_0 = (BaseNode)adaptor.nil();


            pushFollow(FOLLOW_typeNameScalar_in_typeName1795);
            typeNameScalar110=typeNameScalar();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, typeNameScalar110.getTree());

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:379:19: ( '[' ']' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==145) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:379:20: '[' ']'
                    {
                    char_literal111=(Atom)match(input,145,FOLLOW_145_in_typeName1798); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal111_tree = 
                    (BaseNode)adaptor.create(char_literal111)
                    ;
                    adaptor.addChild(root_0, char_literal111_tree);
                    }

                    char_literal112=(Atom)match(input,146,FOLLOW_146_in_typeName1800); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal112_tree = 
                    (BaseNode)adaptor.create(char_literal112)
                    ;
                    adaptor.addChild(root_0, char_literal112_tree);
                    }

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
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:381:1: typeNameScalar : ( builtinType | userTypeName );
    public final pollenParser.typeNameScalar_return typeNameScalar() throws RecognitionException {
        pollenParser.typeNameScalar_return retval = new pollenParser.typeNameScalar_return();
        retval.start = input.LT(1);

        int typeNameScalar_StartIndex = input.index();

        BaseNode root_0 = null;

        pollenParser.builtinType_return builtinType113 =null;

        pollenParser.userTypeName_return userTypeName114 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:382:2: ( builtinType | userTypeName )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==150||LA34_0==152||(LA34_0 >= 175 && LA34_0 <= 177)||LA34_0==190||(LA34_0 >= 194 && LA34_0 <= 196)) ) {
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
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:382:4: builtinType
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    pushFollow(FOLLOW_builtinType_in_typeNameScalar1815);
                    builtinType113=builtinType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, builtinType113.getTree());

                    }
                    break;
                case 2 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:383:4: userTypeName
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    pushFollow(FOLLOW_userTypeName_in_typeNameScalar1820);
                    userTypeName114=userTypeName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, userTypeName114.getTree());

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
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:385:1: userTypeName : ( qualName metaArguments -> ^( T_USER_TYPE qualName metaArguments ) | qualName -> ^( T_USER_TYPE qualName ) );
    public final pollenParser.userTypeName_return userTypeName() throws RecognitionException {
        pollenParser.userTypeName_return retval = new pollenParser.userTypeName_return();
        retval.start = input.LT(1);

        int userTypeName_StartIndex = input.index();

        BaseNode root_0 = null;

        pollenParser.qualName_return qualName115 =null;

        pollenParser.metaArguments_return metaArguments116 =null;

        pollenParser.qualName_return qualName117 =null;


        RewriteRuleSubtreeStream stream_qualName=new RewriteRuleSubtreeStream(adaptor,"rule qualName");
        RewriteRuleSubtreeStream stream_metaArguments=new RewriteRuleSubtreeStream(adaptor,"rule metaArguments");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:386:2: ( qualName metaArguments -> ^( T_USER_TYPE qualName metaArguments ) | qualName -> ^( T_USER_TYPE qualName ) )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==IDENT) ) {
                int LA35_1 = input.LA(2);

                if ( (synpred48_pollen()) ) {
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
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:386:4: qualName metaArguments
                    {
                    pushFollow(FOLLOW_qualName_in_userTypeName1830);
                    qualName115=qualName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_qualName.add(qualName115.getTree());

                    pushFollow(FOLLOW_metaArguments_in_userTypeName1832);
                    metaArguments116=metaArguments();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_metaArguments.add(metaArguments116.getTree());

                    // AST REWRITE
                    // elements: metaArguments, qualName
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (BaseNode)adaptor.nil();
                    // 386:27: -> ^( T_USER_TYPE qualName metaArguments )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:386:30: ^( T_USER_TYPE qualName metaArguments )
                        {
                        BaseNode root_1 = (BaseNode)adaptor.nil();
                        root_1 = (BaseNode)adaptor.becomeRoot(
                        (BaseNode)adaptor.create(T_USER_TYPE, "T_USER_TYPE")
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
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:387:4: qualName
                    {
                    pushFollow(FOLLOW_qualName_in_userTypeName1847);
                    qualName117=qualName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_qualName.add(qualName117.getTree());

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
                    // 387:14: -> ^( T_USER_TYPE qualName )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:387:17: ^( T_USER_TYPE qualName )
                        {
                        BaseNode root_1 = (BaseNode)adaptor.nil();
                        root_1 = (BaseNode)adaptor.becomeRoot(
                        (BaseNode)adaptor.create(T_USER_TYPE, "T_USER_TYPE")
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
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:390:1: unitTypeDefinition : ( meta )? ( ( 'module' )=> moduleDefinition | ( 'class' )=> classDefinition | ( 'protocol' )=> protocolDefinition | ( 'composition' )=> compositionDefinition | ( 'enum' )=> enumDefinition ) ;
    public final pollenParser.unitTypeDefinition_return unitTypeDefinition() throws RecognitionException {
        pollenParser.unitTypeDefinition_return retval = new pollenParser.unitTypeDefinition_return();
        retval.start = input.LT(1);

        int unitTypeDefinition_StartIndex = input.index();

        BaseNode root_0 = null;

        pollenParser.meta_return meta118 =null;

        pollenParser.moduleDefinition_return moduleDefinition119 =null;

        pollenParser.classDefinition_return classDefinition120 =null;

        pollenParser.protocolDefinition_return protocolDefinition121 =null;

        pollenParser.compositionDefinition_return compositionDefinition122 =null;

        pollenParser.enumDefinition_return enumDefinition123 =null;




        		ti = new TypeInfo();
        		tl.add(ti);		

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:399:4: ( ( meta )? ( ( 'module' )=> moduleDefinition | ( 'class' )=> classDefinition | ( 'protocol' )=> protocolDefinition | ( 'composition' )=> compositionDefinition | ( 'enum' )=> enumDefinition ) )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:399:8: ( meta )? ( ( 'module' )=> moduleDefinition | ( 'class' )=> classDefinition | ( 'protocol' )=> protocolDefinition | ( 'composition' )=> compositionDefinition | ( 'enum' )=> enumDefinition )
            {
            root_0 = (BaseNode)adaptor.nil();


            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:399:8: ( meta )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==179) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:399:9: meta
                    {
                    pushFollow(FOLLOW_meta_in_unitTypeDefinition1880);
                    meta118=meta();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, meta118.getTree());

                    }
                    break;

            }


            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:399:17: ( ( 'module' )=> moduleDefinition | ( 'class' )=> classDefinition | ( 'protocol' )=> protocolDefinition | ( 'composition' )=> compositionDefinition | ( 'enum' )=> enumDefinition )
            int alt37=5;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==180) && (synpred50_pollen())) {
                alt37=1;
            }
            else if ( (LA37_0==154) && (synpred51_pollen())) {
                alt37=2;
            }
            else if ( (LA37_0==186) && (synpred52_pollen())) {
                alt37=3;
            }
            else if ( (LA37_0==155) && (synpred53_pollen())) {
                alt37=4;
            }
            else if ( (LA37_0==162) && (synpred54_pollen())) {
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
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:400:10: ( 'module' )=> moduleDefinition
                    {
                    pushFollow(FOLLOW_moduleDefinition_in_unitTypeDefinition1902);
                    moduleDefinition119=moduleDefinition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, moduleDefinition119.getTree());

                    }
                    break;
                case 2 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:401:8: ( 'class' )=> classDefinition
                    {
                    pushFollow(FOLLOW_classDefinition_in_unitTypeDefinition1923);
                    classDefinition120=classDefinition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, classDefinition120.getTree());

                    }
                    break;
                case 3 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:402:10: ( 'protocol' )=> protocolDefinition
                    {
                    pushFollow(FOLLOW_protocolDefinition_in_unitTypeDefinition1940);
                    protocolDefinition121=protocolDefinition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, protocolDefinition121.getTree());

                    }
                    break;
                case 4 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:403:10: ( 'composition' )=> compositionDefinition
                    {
                    pushFollow(FOLLOW_compositionDefinition_in_unitTypeDefinition1958);
                    compositionDefinition122=compositionDefinition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, compositionDefinition122.getTree());

                    }
                    break;
                case 5 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:404:10: ( 'enum' )=> enumDefinition
                    {
                    pushFollow(FOLLOW_enumDefinition_in_unitTypeDefinition1976);
                    enumDefinition123=enumDefinition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, enumDefinition123.getTree());

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
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:408:1: extendsClause : 'extends' ^ IDENT ;
    public final pollenParser.extendsClause_return extendsClause() throws RecognitionException {
        pollenParser.extendsClause_return retval = new pollenParser.extendsClause_return();
        retval.start = input.LT(1);

        int extendsClause_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom string_literal124=null;
        Atom IDENT125=null;

        BaseNode string_literal124_tree=null;
        BaseNode IDENT125_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:409:5: ( 'extends' ^ IDENT )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:409:9: 'extends' ^ IDENT
            {
            root_0 = (BaseNode)adaptor.nil();


            string_literal124=(Atom)match(input,165,FOLLOW_165_in_extendsClause2001); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal124_tree = 
            (BaseNode)adaptor.create(string_literal124)
            ;
            root_0 = (BaseNode)adaptor.becomeRoot(string_literal124_tree, root_0);
            }

            IDENT125=(Atom)match(input,IDENT,FOLLOW_IDENT_in_extendsClause2004); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENT125_tree = 
            (BaseNode)adaptor.create(IDENT125)
            ;
            adaptor.addChild(root_0, IDENT125_tree);
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
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:412:1: implementsClause : 'implements' ^ IDENT ;
    public final pollenParser.implementsClause_return implementsClause() throws RecognitionException {
        pollenParser.implementsClause_return retval = new pollenParser.implementsClause_return();
        retval.start = input.LT(1);

        int implementsClause_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom string_literal126=null;
        Atom IDENT127=null;

        BaseNode string_literal126_tree=null;
        BaseNode IDENT127_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 34) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:413:5: ( 'implements' ^ IDENT )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:413:9: 'implements' ^ IDENT
            {
            root_0 = (BaseNode)adaptor.nil();


            string_literal126=(Atom)match(input,172,FOLLOW_172_in_implementsClause2023); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal126_tree = 
            (BaseNode)adaptor.create(string_literal126)
            ;
            root_0 = (BaseNode)adaptor.becomeRoot(string_literal126_tree, root_0);
            }

            IDENT127=(Atom)match(input,IDENT,FOLLOW_IDENT_in_implementsClause2026); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENT127_tree = 
            (BaseNode)adaptor.create(IDENT127)
            ;
            adaptor.addChild(root_0, IDENT127_tree);
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
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:415:1: braceClose : ( NL !)* '}' ! ( NL !)* ;
    public final pollenParser.braceClose_return braceClose() throws RecognitionException {
        pollenParser.braceClose_return retval = new pollenParser.braceClose_return();
        retval.start = input.LT(1);

        int braceClose_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom NL128=null;
        Atom char_literal129=null;
        Atom NL130=null;

        BaseNode NL128_tree=null;
        BaseNode char_literal129_tree=null;
        BaseNode NL130_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 35) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:416:5: ( ( NL !)* '}' ! ( NL !)* )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:416:10: ( NL !)* '}' ! ( NL !)*
            {
            root_0 = (BaseNode)adaptor.nil();


            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:416:10: ( NL !)*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==NL) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:416:11: NL !
            	    {
            	    NL128=(Atom)match(input,NL,FOLLOW_NL_in_braceClose2046); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);


            char_literal129=(Atom)match(input,202,FOLLOW_202_in_braceClose2051); if (state.failed) return retval;

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:416:22: ( NL !)*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==NL) ) {
                    int LA39_1 = input.LA(2);

                    if ( (synpred56_pollen()) ) {
                        alt39=1;
                    }


                }


                switch (alt39) {
            	case 1 :
            	    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:416:23: NL !
            	    {
            	    NL130=(Atom)match(input,NL,FOLLOW_NL_in_braceClose2055); if (state.failed) return retval;

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
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:418:1: braceCloseAtEOF : ( ( NL !)* ) '}' ! ( NL !)* ;
    public final pollenParser.braceCloseAtEOF_return braceCloseAtEOF() throws RecognitionException {
        pollenParser.braceCloseAtEOF_return retval = new pollenParser.braceCloseAtEOF_return();
        retval.start = input.LT(1);

        int braceCloseAtEOF_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom NL131=null;
        Atom char_literal132=null;
        Atom NL133=null;

        BaseNode NL131_tree=null;
        BaseNode char_literal132_tree=null;
        BaseNode NL133_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 36) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:421:5: ( ( ( NL !)* ) '}' ! ( NL !)* )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:421:9: ( ( NL !)* ) '}' ! ( NL !)*
            {
            root_0 = (BaseNode)adaptor.nil();


            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:421:9: ( ( NL !)* )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:421:10: ( NL !)*
            {
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:421:12: ( NL !)*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==NL) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:421:12: NL !
            	    {
            	    NL131=(Atom)match(input,NL,FOLLOW_NL_in_braceCloseAtEOF2079); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);


            }


            char_literal132=(Atom)match(input,202,FOLLOW_202_in_braceCloseAtEOF2084); if (state.failed) return retval;

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:421:21: ( NL !)*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==NL) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:421:22: NL !
            	    {
            	    NL133=(Atom)match(input,NL,FOLLOW_NL_in_braceCloseAtEOF2088); if (state.failed) return retval;

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
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:424:1: braceOpen : ( NL !)* '{' ! ( NL !)* ;
    public final pollenParser.braceOpen_return braceOpen() throws RecognitionException {
        pollenParser.braceOpen_return retval = new pollenParser.braceOpen_return();
        retval.start = input.LT(1);

        int braceOpen_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom NL134=null;
        Atom char_literal135=null;
        Atom NL136=null;

        BaseNode NL134_tree=null;
        BaseNode char_literal135_tree=null;
        BaseNode NL136_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 37) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:425:5: ( ( NL !)* '{' ! ( NL !)* )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:425:10: ( NL !)* '{' ! ( NL !)*
            {
            root_0 = (BaseNode)adaptor.nil();


            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:425:10: ( NL !)*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==NL) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:425:11: NL !
            	    {
            	    NL134=(Atom)match(input,NL,FOLLOW_NL_in_braceOpen2113); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);


            char_literal135=(Atom)match(input,199,FOLLOW_199_in_braceOpen2118); if (state.failed) return retval;

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:425:22: ( NL !)*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==NL) ) {
                    int LA43_1 = input.LA(2);

                    if ( (synpred60_pollen()) ) {
                        alt43=1;
                    }


                }


                switch (alt43) {
            	case 1 :
            	    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:425:23: NL !
            	    {
            	    NL136=(Atom)match(input,NL,FOLLOW_NL_in_braceOpen2122); if (state.failed) return retval;

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
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:427:1: equalityOp : ( EQ | NOT_EQ );
    public final pollenParser.equalityOp_return equalityOp() throws RecognitionException {
        pollenParser.equalityOp_return retval = new pollenParser.equalityOp_return();
        retval.start = input.LT(1);

        int equalityOp_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom set137=null;

        BaseNode set137_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 38) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:428:2: ( EQ | NOT_EQ )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:
            {
            root_0 = (BaseNode)adaptor.nil();


            set137=(Atom)input.LT(1);

            if ( input.LA(1)==EQ||input.LA(1)==NOT_EQ ) {
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
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:430:1: relationalOp : ( '<' | '>' | LT_EQ | GT_EQ );
    public final pollenParser.relationalOp_return relationalOp() throws RecognitionException {
        pollenParser.relationalOp_return retval = new pollenParser.relationalOp_return();
        retval.start = input.LT(1);

        int relationalOp_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom set138=null;

        BaseNode set138_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 39) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:431:2: ( '<' | '>' | LT_EQ | GT_EQ )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:
            {
            root_0 = (BaseNode)adaptor.nil();


            set138=(Atom)input.LT(1);

            if ( input.LA(1)==GT_EQ||input.LA(1)==LT_EQ||input.LA(1)==139||input.LA(1)==141 ) {
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
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:433:1: shiftOp : ( '<<' | '>>' );
    public final pollenParser.shiftOp_return shiftOp() throws RecognitionException {
        pollenParser.shiftOp_return retval = new pollenParser.shiftOp_return();
        retval.start = input.LT(1);

        int shiftOp_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom set139=null;

        BaseNode set139_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 40) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:434:2: ( '<<' | '>>' )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:
            {
            root_0 = (BaseNode)adaptor.nil();


            set139=(Atom)input.LT(1);

            if ( input.LA(1)==140||input.LA(1)==142 ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (BaseNode)adaptor.create(set139)
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


    public static class addSubOp_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "addSubOp"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:436:1: addSubOp : ( '+' | '-' );
    public final pollenParser.addSubOp_return addSubOp() throws RecognitionException {
        pollenParser.addSubOp_return retval = new pollenParser.addSubOp_return();
        retval.start = input.LT(1);

        int addSubOp_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom set140=null;

        BaseNode set140_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 41) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:437:2: ( '+' | '-' )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:
            {
            root_0 = (BaseNode)adaptor.nil();


            set140=(Atom)input.LT(1);

            if ( input.LA(1)==131||input.LA(1)==134 ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (BaseNode)adaptor.create(set140)
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
            if ( state.backtracking>0 ) { memoize(input, 41, addSubOp_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "addSubOp"


    public static class assignOp_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "assignOp"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:439:1: assignOp : ( ADD_EQ | SUB_EQ | MUL_EQ | DIV_EQ | MOD_EQ | LSHFT_EQ | RSHFT_EQ | BITAND_EQ | BITXOR_EQ | BITOR_EQ );
    public final pollenParser.assignOp_return assignOp() throws RecognitionException {
        pollenParser.assignOp_return retval = new pollenParser.assignOp_return();
        retval.start = input.LT(1);

        int assignOp_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom set141=null;

        BaseNode set141_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 42) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:440:2: ( ADD_EQ | SUB_EQ | MUL_EQ | DIV_EQ | MOD_EQ | LSHFT_EQ | RSHFT_EQ | BITAND_EQ | BITXOR_EQ | BITOR_EQ )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:
            {
            root_0 = (BaseNode)adaptor.nil();


            set141=(Atom)input.LT(1);

            if ( input.LA(1)==ADD_EQ||(input.LA(1) >= BITAND_EQ && input.LA(1) <= BITXOR_EQ)||input.LA(1)==DIV_EQ||input.LA(1)==LSHFT_EQ||(input.LA(1) >= MOD_EQ && input.LA(1) <= MUL_EQ)||input.LA(1)==RSHFT_EQ||input.LA(1)==SUB_EQ ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (BaseNode)adaptor.create(set141)
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
            if ( state.backtracking>0 ) { memoize(input, 42, assignOp_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "assignOp"


    public static class multDivModOp_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "multDivModOp"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:442:1: multDivModOp : ( '*' | '/' | '%' );
    public final pollenParser.multDivModOp_return multDivModOp() throws RecognitionException {
        pollenParser.multDivModOp_return retval = new pollenParser.multDivModOp_return();
        retval.start = input.LT(1);

        int multDivModOp_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom set142=null;

        BaseNode set142_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 43) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:443:2: ( '*' | '/' | '%' )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:
            {
            root_0 = (BaseNode)adaptor.nil();


            set142=(Atom)input.LT(1);

            if ( input.LA(1)==125||input.LA(1)==130||input.LA(1)==137 ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (BaseNode)adaptor.create(set142)
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
            if ( state.backtracking>0 ) { memoize(input, 43, multDivModOp_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "multDivModOp"


    public static class logicalNotOp_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "logicalNotOp"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:445:1: logicalNotOp : LOG_NOT ;
    public final pollenParser.logicalNotOp_return logicalNotOp() throws RecognitionException {
        pollenParser.logicalNotOp_return retval = new pollenParser.logicalNotOp_return();
        retval.start = input.LT(1);

        int logicalNotOp_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom LOG_NOT143=null;

        BaseNode LOG_NOT143_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 44) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:446:2: ( LOG_NOT )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:446:4: LOG_NOT
            {
            root_0 = (BaseNode)adaptor.nil();


            LOG_NOT143=(Atom)match(input,LOG_NOT,FOLLOW_LOG_NOT_in_logicalNotOp2285); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            LOG_NOT143_tree = 
            (BaseNode)adaptor.create(LOG_NOT143)
            ;
            adaptor.addChild(root_0, LOG_NOT143_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 44, logicalNotOp_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "logicalNotOp"


    public static class bitwiseNotOp_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "bitwiseNotOp"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:448:1: bitwiseNotOp : BIT_NOT ;
    public final pollenParser.bitwiseNotOp_return bitwiseNotOp() throws RecognitionException {
        pollenParser.bitwiseNotOp_return retval = new pollenParser.bitwiseNotOp_return();
        retval.start = input.LT(1);

        int bitwiseNotOp_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom BIT_NOT144=null;

        BaseNode BIT_NOT144_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 45) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:449:2: ( BIT_NOT )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:449:4: BIT_NOT
            {
            root_0 = (BaseNode)adaptor.nil();


            BIT_NOT144=(Atom)match(input,BIT_NOT,FOLLOW_BIT_NOT_in_bitwiseNotOp2296); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            BIT_NOT144_tree = 
            (BaseNode)adaptor.create(BIT_NOT144)
            ;
            adaptor.addChild(root_0, BIT_NOT144_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 45, bitwiseNotOp_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "bitwiseNotOp"


    public static class exprList_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "exprList"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:451:1: exprList : ( expr ( ',' expr )* -> ^( LIST[\"LIST\"] ( expr )+ ) | -> NIL );
    public final pollenParser.exprList_return exprList() throws RecognitionException {
        pollenParser.exprList_return retval = new pollenParser.exprList_return();
        retval.start = input.LT(1);

        int exprList_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom char_literal146=null;
        pollenParser.expr_return expr145 =null;

        pollenParser.expr_return expr147 =null;


        BaseNode char_literal146_tree=null;
        RewriteRuleTokenStream stream_133=new RewriteRuleTokenStream(adaptor,"token 133");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 46) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:452:2: ( expr ( ',' expr )* -> ^( LIST[\"LIST\"] ( expr )+ ) | -> NIL )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( ((LA45_0 >= BIT_NOT && LA45_0 <= CHAR)||LA45_0==HEX_LIT||LA45_0==IDENT||LA45_0==INJECT||LA45_0==INT_LIT||LA45_0==LOG_NOT||LA45_0==OCT_LIT||LA45_0==REAL_LIT||LA45_0==STRING||LA45_0==128||LA45_0==132||(LA45_0 >= 134 && LA45_0 <= 135)||(LA45_0 >= 144 && LA45_0 <= 145)||LA45_0==166||(LA45_0 >= 181 && LA45_0 <= 182)||LA45_0==192) ) {
                int LA45_1 = input.LA(2);

                if ( (synpred79_pollen()) ) {
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
            else if ( (LA45_0==NL||LA45_0==SEMI||LA45_0==129||LA45_0==133||LA45_0==146||(LA45_0 >= 149 && LA45_0 <= 159)||LA45_0==162||LA45_0==164||(LA45_0 >= 167 && LA45_0 <= 171)||LA45_0==173||(LA45_0 >= 175 && LA45_0 <= 177)||(LA45_0 >= 179 && LA45_0 <= 180)||(LA45_0 >= 185 && LA45_0 <= 191)||(LA45_0 >= 194 && LA45_0 <= 198)||LA45_0==202) ) {
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
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:452:4: expr ( ',' expr )*
                    {
                    pushFollow(FOLLOW_expr_in_exprList2307);
                    expr145=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr145.getTree());

                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:452:9: ( ',' expr )*
                    loop44:
                    do {
                        int alt44=2;
                        int LA44_0 = input.LA(1);

                        if ( (LA44_0==133) ) {
                            int LA44_1 = input.LA(2);

                            if ( (synpred78_pollen()) ) {
                                alt44=1;
                            }


                        }


                        switch (alt44) {
                    	case 1 :
                    	    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:452:10: ',' expr
                    	    {
                    	    char_literal146=(Atom)match(input,133,FOLLOW_133_in_exprList2310); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_133.add(char_literal146);


                    	    pushFollow(FOLLOW_expr_in_exprList2312);
                    	    expr147=expr();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_expr.add(expr147.getTree());

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
                    // 453:3: -> ^( LIST[\"LIST\"] ( expr )+ )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:453:6: ^( LIST[\"LIST\"] ( expr )+ )
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
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:454:4: 
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
                    // 454:4: -> NIL
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
            if ( state.backtracking>0 ) { memoize(input, 46, exprList_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "exprList"


    public static class expr_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expr"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:456:1: expr : ( exprLogicalOr '?' expr ':' expr -> ^( E_QUEST exprLogicalOr expr expr ) | exprLogicalOr -> ^( E_EXPR exprLogicalOr ) );
    public final pollenParser.expr_return expr() throws RecognitionException {
        pollenParser.expr_return retval = new pollenParser.expr_return();
        retval.start = input.LT(1);

        int expr_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom char_literal149=null;
        Atom char_literal151=null;
        pollenParser.exprLogicalOr_return exprLogicalOr148 =null;

        pollenParser.expr_return expr150 =null;

        pollenParser.expr_return expr152 =null;

        pollenParser.exprLogicalOr_return exprLogicalOr153 =null;


        BaseNode char_literal149_tree=null;
        BaseNode char_literal151_tree=null;
        RewriteRuleTokenStream stream_143=new RewriteRuleTokenStream(adaptor,"token 143");
        RewriteRuleTokenStream stream_138=new RewriteRuleTokenStream(adaptor,"token 138");
        RewriteRuleSubtreeStream stream_exprLogicalOr=new RewriteRuleSubtreeStream(adaptor,"rule exprLogicalOr");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 47) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:457:2: ( exprLogicalOr '?' expr ':' expr -> ^( E_QUEST exprLogicalOr expr expr ) | exprLogicalOr -> ^( E_EXPR exprLogicalOr ) )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( ((LA46_0 >= BIT_NOT && LA46_0 <= CHAR)||LA46_0==HEX_LIT||LA46_0==IDENT||LA46_0==INJECT||LA46_0==INT_LIT||LA46_0==LOG_NOT||LA46_0==OCT_LIT||LA46_0==REAL_LIT||LA46_0==STRING||LA46_0==128||LA46_0==132||(LA46_0 >= 134 && LA46_0 <= 135)||(LA46_0 >= 144 && LA46_0 <= 145)||LA46_0==166||(LA46_0 >= 181 && LA46_0 <= 182)||LA46_0==192) ) {
                int LA46_1 = input.LA(2);

                if ( (synpred80_pollen()) ) {
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
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:457:4: exprLogicalOr '?' expr ':' expr
                    {
                    pushFollow(FOLLOW_exprLogicalOr_in_expr2347);
                    exprLogicalOr148=exprLogicalOr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_exprLogicalOr.add(exprLogicalOr148.getTree());

                    char_literal149=(Atom)match(input,143,FOLLOW_143_in_expr2349); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_143.add(char_literal149);


                    pushFollow(FOLLOW_expr_in_expr2351);
                    expr150=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr150.getTree());

                    char_literal151=(Atom)match(input,138,FOLLOW_138_in_expr2353); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_138.add(char_literal151);


                    pushFollow(FOLLOW_expr_in_expr2355);
                    expr152=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr152.getTree());

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
                    // 457:36: -> ^( E_QUEST exprLogicalOr expr expr )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:457:39: ^( E_QUEST exprLogicalOr expr expr )
                        {
                        BaseNode root_1 = (BaseNode)adaptor.nil();
                        root_1 = (BaseNode)adaptor.becomeRoot(
                        (BaseNode)adaptor.create(E_QUEST, "E_QUEST")
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
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:458:4: exprLogicalOr
                    {
                    pushFollow(FOLLOW_exprLogicalOr_in_expr2372);
                    exprLogicalOr153=exprLogicalOr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_exprLogicalOr.add(exprLogicalOr153.getTree());

                    // AST REWRITE
                    // elements: exprLogicalOr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (BaseNode)adaptor.nil();
                    // 458:18: -> ^( E_EXPR exprLogicalOr )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:458:21: ^( E_EXPR exprLogicalOr )
                        {
                        BaseNode root_1 = (BaseNode)adaptor.nil();
                        root_1 = (BaseNode)adaptor.becomeRoot(
                        (BaseNode)adaptor.create(E_EXPR, "E_EXPR")
                        , root_1);

                        adaptor.addChild(root_1, stream_exprLogicalOr.nextTree());

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
            if ( state.backtracking>0 ) { memoize(input, 47, expr_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "expr"


    public static class exprLogicalOr_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "exprLogicalOr"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:460:1: exprLogicalOr : exprLogicalAnd ( '||' exprLogicalAnd )* ;
    public final pollenParser.exprLogicalOr_return exprLogicalOr() throws RecognitionException {
        pollenParser.exprLogicalOr_return retval = new pollenParser.exprLogicalOr_return();
        retval.start = input.LT(1);

        int exprLogicalOr_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom string_literal155=null;
        pollenParser.exprLogicalAnd_return exprLogicalAnd154 =null;

        pollenParser.exprLogicalAnd_return exprLogicalAnd156 =null;


        BaseNode string_literal155_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 48) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:461:2: ( exprLogicalAnd ( '||' exprLogicalAnd )* )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:461:4: exprLogicalAnd ( '||' exprLogicalAnd )*
            {
            root_0 = (BaseNode)adaptor.nil();


            pushFollow(FOLLOW_exprLogicalAnd_in_exprLogicalOr2396);
            exprLogicalAnd154=exprLogicalAnd();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, exprLogicalAnd154.getTree());

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:461:19: ( '||' exprLogicalAnd )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==201) ) {
                    int LA47_1 = input.LA(2);

                    if ( (synpred81_pollen()) ) {
                        alt47=1;
                    }


                }


                switch (alt47) {
            	case 1 :
            	    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:461:20: '||' exprLogicalAnd
            	    {
            	    string_literal155=(Atom)match(input,201,FOLLOW_201_in_exprLogicalOr2399); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal155_tree = 
            	    (BaseNode)adaptor.create(string_literal155)
            	    ;
            	    adaptor.addChild(root_0, string_literal155_tree);
            	    }

            	    pushFollow(FOLLOW_exprLogicalAnd_in_exprLogicalOr2401);
            	    exprLogicalAnd156=exprLogicalAnd();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, exprLogicalAnd156.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 48, exprLogicalOr_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "exprLogicalOr"


    public static class exprLogicalAnd_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "exprLogicalAnd"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:463:1: exprLogicalAnd : exprBitwiseOr ( '&&' exprBitwiseOr )* ;
    public final pollenParser.exprLogicalAnd_return exprLogicalAnd() throws RecognitionException {
        pollenParser.exprLogicalAnd_return retval = new pollenParser.exprLogicalAnd_return();
        retval.start = input.LT(1);

        int exprLogicalAnd_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom string_literal158=null;
        pollenParser.exprBitwiseOr_return exprBitwiseOr157 =null;

        pollenParser.exprBitwiseOr_return exprBitwiseOr159 =null;


        BaseNode string_literal158_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 49) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:464:2: ( exprBitwiseOr ( '&&' exprBitwiseOr )* )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:464:4: exprBitwiseOr ( '&&' exprBitwiseOr )*
            {
            root_0 = (BaseNode)adaptor.nil();


            pushFollow(FOLLOW_exprBitwiseOr_in_exprLogicalAnd2413);
            exprBitwiseOr157=exprBitwiseOr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, exprBitwiseOr157.getTree());

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:464:18: ( '&&' exprBitwiseOr )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==126) ) {
                    int LA48_1 = input.LA(2);

                    if ( (synpred82_pollen()) ) {
                        alt48=1;
                    }


                }


                switch (alt48) {
            	case 1 :
            	    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:464:19: '&&' exprBitwiseOr
            	    {
            	    string_literal158=(Atom)match(input,126,FOLLOW_126_in_exprLogicalAnd2416); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal158_tree = 
            	    (BaseNode)adaptor.create(string_literal158)
            	    ;
            	    adaptor.addChild(root_0, string_literal158_tree);
            	    }

            	    pushFollow(FOLLOW_exprBitwiseOr_in_exprLogicalAnd2418);
            	    exprBitwiseOr159=exprBitwiseOr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, exprBitwiseOr159.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 49, exprLogicalAnd_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "exprLogicalAnd"


    public static class exprBitwiseOr_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "exprBitwiseOr"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:466:1: exprBitwiseOr : exprBitwiseXor ( '|' exprBitwiseXor )* ;
    public final pollenParser.exprBitwiseOr_return exprBitwiseOr() throws RecognitionException {
        pollenParser.exprBitwiseOr_return retval = new pollenParser.exprBitwiseOr_return();
        retval.start = input.LT(1);

        int exprBitwiseOr_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom char_literal161=null;
        pollenParser.exprBitwiseXor_return exprBitwiseXor160 =null;

        pollenParser.exprBitwiseXor_return exprBitwiseXor162 =null;


        BaseNode char_literal161_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 50) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:467:2: ( exprBitwiseXor ( '|' exprBitwiseXor )* )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:467:4: exprBitwiseXor ( '|' exprBitwiseXor )*
            {
            root_0 = (BaseNode)adaptor.nil();


            pushFollow(FOLLOW_exprBitwiseXor_in_exprBitwiseOr2430);
            exprBitwiseXor160=exprBitwiseXor();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, exprBitwiseXor160.getTree());

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:467:19: ( '|' exprBitwiseXor )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==200) ) {
                    int LA49_1 = input.LA(2);

                    if ( (synpred83_pollen()) ) {
                        alt49=1;
                    }


                }


                switch (alt49) {
            	case 1 :
            	    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:467:20: '|' exprBitwiseXor
            	    {
            	    char_literal161=(Atom)match(input,200,FOLLOW_200_in_exprBitwiseOr2433); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal161_tree = 
            	    (BaseNode)adaptor.create(char_literal161)
            	    ;
            	    adaptor.addChild(root_0, char_literal161_tree);
            	    }

            	    pushFollow(FOLLOW_exprBitwiseXor_in_exprBitwiseOr2435);
            	    exprBitwiseXor162=exprBitwiseXor();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, exprBitwiseXor162.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 50, exprBitwiseOr_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "exprBitwiseOr"


    public static class exprBitwiseXor_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "exprBitwiseXor"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:469:1: exprBitwiseXor : exprBitwiseAnd ( '^' exprBitwiseAnd )* ;
    public final pollenParser.exprBitwiseXor_return exprBitwiseXor() throws RecognitionException {
        pollenParser.exprBitwiseXor_return retval = new pollenParser.exprBitwiseXor_return();
        retval.start = input.LT(1);

        int exprBitwiseXor_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom char_literal164=null;
        pollenParser.exprBitwiseAnd_return exprBitwiseAnd163 =null;

        pollenParser.exprBitwiseAnd_return exprBitwiseAnd165 =null;


        BaseNode char_literal164_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 51) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:470:2: ( exprBitwiseAnd ( '^' exprBitwiseAnd )* )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:470:4: exprBitwiseAnd ( '^' exprBitwiseAnd )*
            {
            root_0 = (BaseNode)adaptor.nil();


            pushFollow(FOLLOW_exprBitwiseAnd_in_exprBitwiseXor2447);
            exprBitwiseAnd163=exprBitwiseAnd();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, exprBitwiseAnd163.getTree());

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:470:19: ( '^' exprBitwiseAnd )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==147) ) {
                    int LA50_1 = input.LA(2);

                    if ( (synpred84_pollen()) ) {
                        alt50=1;
                    }


                }


                switch (alt50) {
            	case 1 :
            	    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:470:20: '^' exprBitwiseAnd
            	    {
            	    char_literal164=(Atom)match(input,147,FOLLOW_147_in_exprBitwiseXor2450); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal164_tree = 
            	    (BaseNode)adaptor.create(char_literal164)
            	    ;
            	    adaptor.addChild(root_0, char_literal164_tree);
            	    }

            	    pushFollow(FOLLOW_exprBitwiseAnd_in_exprBitwiseXor2452);
            	    exprBitwiseAnd165=exprBitwiseAnd();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, exprBitwiseAnd165.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 51, exprBitwiseXor_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "exprBitwiseXor"


    public static class exprBitwiseAnd_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "exprBitwiseAnd"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:472:1: exprBitwiseAnd : exprEquality ( '&' exprEquality )* ;
    public final pollenParser.exprBitwiseAnd_return exprBitwiseAnd() throws RecognitionException {
        pollenParser.exprBitwiseAnd_return retval = new pollenParser.exprBitwiseAnd_return();
        retval.start = input.LT(1);

        int exprBitwiseAnd_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom char_literal167=null;
        pollenParser.exprEquality_return exprEquality166 =null;

        pollenParser.exprEquality_return exprEquality168 =null;


        BaseNode char_literal167_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 52) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:473:2: ( exprEquality ( '&' exprEquality )* )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:473:4: exprEquality ( '&' exprEquality )*
            {
            root_0 = (BaseNode)adaptor.nil();


            pushFollow(FOLLOW_exprEquality_in_exprBitwiseAnd2464);
            exprEquality166=exprEquality();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, exprEquality166.getTree());

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:473:17: ( '&' exprEquality )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==127) ) {
                    int LA51_1 = input.LA(2);

                    if ( (synpred85_pollen()) ) {
                        alt51=1;
                    }


                }


                switch (alt51) {
            	case 1 :
            	    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:473:18: '&' exprEquality
            	    {
            	    char_literal167=(Atom)match(input,127,FOLLOW_127_in_exprBitwiseAnd2467); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal167_tree = 
            	    (BaseNode)adaptor.create(char_literal167)
            	    ;
            	    adaptor.addChild(root_0, char_literal167_tree);
            	    }

            	    pushFollow(FOLLOW_exprEquality_in_exprBitwiseAnd2469);
            	    exprEquality168=exprEquality();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, exprEquality168.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 52, exprBitwiseAnd_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "exprBitwiseAnd"


    public static class exprEquality_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "exprEquality"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:475:1: exprEquality : exprRelational ( equalityOp exprRelational )* ;
    public final pollenParser.exprEquality_return exprEquality() throws RecognitionException {
        pollenParser.exprEquality_return retval = new pollenParser.exprEquality_return();
        retval.start = input.LT(1);

        int exprEquality_StartIndex = input.index();

        BaseNode root_0 = null;

        pollenParser.exprRelational_return exprRelational169 =null;

        pollenParser.equalityOp_return equalityOp170 =null;

        pollenParser.exprRelational_return exprRelational171 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 53) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:476:2: ( exprRelational ( equalityOp exprRelational )* )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:476:4: exprRelational ( equalityOp exprRelational )*
            {
            root_0 = (BaseNode)adaptor.nil();


            pushFollow(FOLLOW_exprRelational_in_exprEquality2481);
            exprRelational169=exprRelational();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, exprRelational169.getTree());

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:476:19: ( equalityOp exprRelational )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==EQ||LA52_0==NOT_EQ) ) {
                    int LA52_1 = input.LA(2);

                    if ( (synpred86_pollen()) ) {
                        alt52=1;
                    }


                }


                switch (alt52) {
            	case 1 :
            	    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:476:21: equalityOp exprRelational
            	    {
            	    pushFollow(FOLLOW_equalityOp_in_exprEquality2485);
            	    equalityOp170=equalityOp();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, equalityOp170.getTree());

            	    pushFollow(FOLLOW_exprRelational_in_exprEquality2487);
            	    exprRelational171=exprRelational();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, exprRelational171.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 53, exprEquality_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "exprEquality"


    public static class exprRelational_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "exprRelational"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:478:1: exprRelational : exprShift ( relationalOp exprShift )* ;
    public final pollenParser.exprRelational_return exprRelational() throws RecognitionException {
        pollenParser.exprRelational_return retval = new pollenParser.exprRelational_return();
        retval.start = input.LT(1);

        int exprRelational_StartIndex = input.index();

        BaseNode root_0 = null;

        pollenParser.exprShift_return exprShift172 =null;

        pollenParser.relationalOp_return relationalOp173 =null;

        pollenParser.exprShift_return exprShift174 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 54) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:479:2: ( exprShift ( relationalOp exprShift )* )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:479:4: exprShift ( relationalOp exprShift )*
            {
            root_0 = (BaseNode)adaptor.nil();


            pushFollow(FOLLOW_exprShift_in_exprRelational2499);
            exprShift172=exprShift();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, exprShift172.getTree());

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:479:15: ( relationalOp exprShift )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==GT_EQ||LA53_0==LT_EQ||LA53_0==139||LA53_0==141) ) {
                    int LA53_1 = input.LA(2);

                    if ( (synpred87_pollen()) ) {
                        alt53=1;
                    }


                }


                switch (alt53) {
            	case 1 :
            	    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:479:17: relationalOp exprShift
            	    {
            	    pushFollow(FOLLOW_relationalOp_in_exprRelational2504);
            	    relationalOp173=relationalOp();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, relationalOp173.getTree());

            	    pushFollow(FOLLOW_exprShift_in_exprRelational2506);
            	    exprShift174=exprShift();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, exprShift174.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 54, exprRelational_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "exprRelational"


    public static class exprShift_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "exprShift"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:481:1: exprShift : exprAddSub ( shiftOp exprAddSub )* ;
    public final pollenParser.exprShift_return exprShift() throws RecognitionException {
        pollenParser.exprShift_return retval = new pollenParser.exprShift_return();
        retval.start = input.LT(1);

        int exprShift_StartIndex = input.index();

        BaseNode root_0 = null;

        pollenParser.exprAddSub_return exprAddSub175 =null;

        pollenParser.shiftOp_return shiftOp176 =null;

        pollenParser.exprAddSub_return exprAddSub177 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 55) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:482:2: ( exprAddSub ( shiftOp exprAddSub )* )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:482:4: exprAddSub ( shiftOp exprAddSub )*
            {
            root_0 = (BaseNode)adaptor.nil();


            pushFollow(FOLLOW_exprAddSub_in_exprShift2519);
            exprAddSub175=exprAddSub();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, exprAddSub175.getTree());

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:482:15: ( shiftOp exprAddSub )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==140||LA54_0==142) ) {
                    int LA54_1 = input.LA(2);

                    if ( (synpred88_pollen()) ) {
                        alt54=1;
                    }


                }


                switch (alt54) {
            	case 1 :
            	    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:482:17: shiftOp exprAddSub
            	    {
            	    pushFollow(FOLLOW_shiftOp_in_exprShift2523);
            	    shiftOp176=shiftOp();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, shiftOp176.getTree());

            	    pushFollow(FOLLOW_exprAddSub_in_exprShift2526);
            	    exprAddSub177=exprAddSub();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, exprAddSub177.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 55, exprShift_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "exprShift"


    public static class exprAddSub_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "exprAddSub"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:484:1: exprAddSub : exprMultDiv ( addSubOp exprMultDiv )* ;
    public final pollenParser.exprAddSub_return exprAddSub() throws RecognitionException {
        pollenParser.exprAddSub_return retval = new pollenParser.exprAddSub_return();
        retval.start = input.LT(1);

        int exprAddSub_StartIndex = input.index();

        BaseNode root_0 = null;

        pollenParser.exprMultDiv_return exprMultDiv178 =null;

        pollenParser.addSubOp_return addSubOp179 =null;

        pollenParser.exprMultDiv_return exprMultDiv180 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 56) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:485:2: ( exprMultDiv ( addSubOp exprMultDiv )* )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:485:4: exprMultDiv ( addSubOp exprMultDiv )*
            {
            root_0 = (BaseNode)adaptor.nil();


            pushFollow(FOLLOW_exprMultDiv_in_exprAddSub2539);
            exprMultDiv178=exprMultDiv();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, exprMultDiv178.getTree());

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:485:16: ( addSubOp exprMultDiv )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==131||LA55_0==134) ) {
                    int LA55_1 = input.LA(2);

                    if ( (synpred89_pollen()) ) {
                        alt55=1;
                    }


                }


                switch (alt55) {
            	case 1 :
            	    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:485:17: addSubOp exprMultDiv
            	    {
            	    pushFollow(FOLLOW_addSubOp_in_exprAddSub2542);
            	    addSubOp179=addSubOp();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, addSubOp179.getTree());

            	    pushFollow(FOLLOW_exprMultDiv_in_exprAddSub2544);
            	    exprMultDiv180=exprMultDiv();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, exprMultDiv180.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 56, exprAddSub_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "exprAddSub"


    public static class exprMultDiv_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "exprMultDiv"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:487:1: exprMultDiv : exprUnary ( multDivModOp exprUnary )* ;
    public final pollenParser.exprMultDiv_return exprMultDiv() throws RecognitionException {
        pollenParser.exprMultDiv_return retval = new pollenParser.exprMultDiv_return();
        retval.start = input.LT(1);

        int exprMultDiv_StartIndex = input.index();

        BaseNode root_0 = null;

        pollenParser.exprUnary_return exprUnary181 =null;

        pollenParser.multDivModOp_return multDivModOp182 =null;

        pollenParser.exprUnary_return exprUnary183 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 57) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:488:2: ( exprUnary ( multDivModOp exprUnary )* )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:488:4: exprUnary ( multDivModOp exprUnary )*
            {
            root_0 = (BaseNode)adaptor.nil();


            pushFollow(FOLLOW_exprUnary_in_exprMultDiv2556);
            exprUnary181=exprUnary();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, exprUnary181.getTree());

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:488:14: ( multDivModOp exprUnary )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==125||LA56_0==130||LA56_0==137) ) {
                    int LA56_1 = input.LA(2);

                    if ( (synpred90_pollen()) ) {
                        alt56=1;
                    }


                }


                switch (alt56) {
            	case 1 :
            	    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:488:15: multDivModOp exprUnary
            	    {
            	    pushFollow(FOLLOW_multDivModOp_in_exprMultDiv2559);
            	    multDivModOp182=multDivModOp();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, multDivModOp182.getTree());

            	    pushFollow(FOLLOW_exprUnary_in_exprMultDiv2561);
            	    exprUnary183=exprUnary();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, exprUnary183.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 57, exprMultDiv_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "exprMultDiv"


    public static class exprUnary_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "exprUnary"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:490:1: exprUnary : ( primitiveLit | injectionCode | nullLit | arrayLit | LOG_NOT expr | BIT_NOT expr | '(' expr ')' | '-' expr | varOrFcnOrArray ( ( '++' ) | ( '--' ) )? | ( ( '++' ) | ( '--' ) ) varOrFcnOrArray );
    public final pollenParser.exprUnary_return exprUnary() throws RecognitionException {
        pollenParser.exprUnary_return retval = new pollenParser.exprUnary_return();
        retval.start = input.LT(1);

        int exprUnary_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom LOG_NOT188=null;
        Atom BIT_NOT190=null;
        Atom char_literal192=null;
        Atom char_literal194=null;
        Atom char_literal195=null;
        Atom set198=null;
        Atom set199=null;
        pollenParser.primitiveLit_return primitiveLit184 =null;

        pollenParser.injectionCode_return injectionCode185 =null;

        pollenParser.nullLit_return nullLit186 =null;

        pollenParser.arrayLit_return arrayLit187 =null;

        pollenParser.expr_return expr189 =null;

        pollenParser.expr_return expr191 =null;

        pollenParser.expr_return expr193 =null;

        pollenParser.expr_return expr196 =null;

        pollenParser.varOrFcnOrArray_return varOrFcnOrArray197 =null;

        pollenParser.varOrFcnOrArray_return varOrFcnOrArray200 =null;


        BaseNode LOG_NOT188_tree=null;
        BaseNode BIT_NOT190_tree=null;
        BaseNode char_literal192_tree=null;
        BaseNode char_literal194_tree=null;
        BaseNode char_literal195_tree=null;
        BaseNode set198_tree=null;
        BaseNode set199_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 58) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:491:2: ( primitiveLit | injectionCode | nullLit | arrayLit | LOG_NOT expr | BIT_NOT expr | '(' expr ')' | '-' expr | varOrFcnOrArray ( ( '++' ) | ( '--' ) )? | ( ( '++' ) | ( '--' ) ) varOrFcnOrArray )
            int alt58=10;
            switch ( input.LA(1) ) {
            case CHAR:
            case HEX_LIT:
            case INT_LIT:
            case OCT_LIT:
            case REAL_LIT:
            case STRING:
            case 166:
            case 192:
                {
                alt58=1;
                }
                break;
            case INJECT:
                {
                alt58=2;
                }
                break;
            case 182:
                {
                alt58=3;
                }
                break;
            case 145:
                {
                alt58=4;
                }
                break;
            case LOG_NOT:
                {
                alt58=5;
                }
                break;
            case BIT_NOT:
                {
                alt58=6;
                }
                break;
            case 128:
                {
                alt58=7;
                }
                break;
            case 134:
                {
                alt58=8;
                }
                break;
            case IDENT:
            case 144:
            case 181:
                {
                alt58=9;
                }
                break;
            case 132:
            case 135:
                {
                alt58=10;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;

            }

            switch (alt58) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:491:4: primitiveLit
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    pushFollow(FOLLOW_primitiveLit_in_exprUnary2573);
                    primitiveLit184=primitiveLit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveLit184.getTree());

                    }
                    break;
                case 2 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:492:4: injectionCode
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    pushFollow(FOLLOW_injectionCode_in_exprUnary2578);
                    injectionCode185=injectionCode();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, injectionCode185.getTree());

                    }
                    break;
                case 3 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:493:4: nullLit
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    pushFollow(FOLLOW_nullLit_in_exprUnary2583);
                    nullLit186=nullLit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, nullLit186.getTree());

                    }
                    break;
                case 4 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:494:4: arrayLit
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    pushFollow(FOLLOW_arrayLit_in_exprUnary2588);
                    arrayLit187=arrayLit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, arrayLit187.getTree());

                    }
                    break;
                case 5 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:495:4: LOG_NOT expr
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    LOG_NOT188=(Atom)match(input,LOG_NOT,FOLLOW_LOG_NOT_in_exprUnary2593); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LOG_NOT188_tree = 
                    (BaseNode)adaptor.create(LOG_NOT188)
                    ;
                    adaptor.addChild(root_0, LOG_NOT188_tree);
                    }

                    pushFollow(FOLLOW_expr_in_exprUnary2595);
                    expr189=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr189.getTree());

                    }
                    break;
                case 6 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:496:4: BIT_NOT expr
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    BIT_NOT190=(Atom)match(input,BIT_NOT,FOLLOW_BIT_NOT_in_exprUnary2600); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    BIT_NOT190_tree = 
                    (BaseNode)adaptor.create(BIT_NOT190)
                    ;
                    adaptor.addChild(root_0, BIT_NOT190_tree);
                    }

                    pushFollow(FOLLOW_expr_in_exprUnary2602);
                    expr191=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr191.getTree());

                    }
                    break;
                case 7 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:497:4: '(' expr ')'
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    char_literal192=(Atom)match(input,128,FOLLOW_128_in_exprUnary2607); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal192_tree = 
                    (BaseNode)adaptor.create(char_literal192)
                    ;
                    adaptor.addChild(root_0, char_literal192_tree);
                    }

                    pushFollow(FOLLOW_expr_in_exprUnary2609);
                    expr193=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr193.getTree());

                    char_literal194=(Atom)match(input,129,FOLLOW_129_in_exprUnary2611); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal194_tree = 
                    (BaseNode)adaptor.create(char_literal194)
                    ;
                    adaptor.addChild(root_0, char_literal194_tree);
                    }

                    }
                    break;
                case 8 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:498:4: '-' expr
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    char_literal195=(Atom)match(input,134,FOLLOW_134_in_exprUnary2616); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal195_tree = 
                    (BaseNode)adaptor.create(char_literal195)
                    ;
                    adaptor.addChild(root_0, char_literal195_tree);
                    }

                    pushFollow(FOLLOW_expr_in_exprUnary2618);
                    expr196=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr196.getTree());

                    }
                    break;
                case 9 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:499:4: varOrFcnOrArray ( ( '++' ) | ( '--' ) )?
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    pushFollow(FOLLOW_varOrFcnOrArray_in_exprUnary2623);
                    varOrFcnOrArray197=varOrFcnOrArray();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varOrFcnOrArray197.getTree());

                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:499:20: ( ( '++' ) | ( '--' ) )?
                    int alt57=2;
                    int LA57_0 = input.LA(1);

                    if ( (LA57_0==132||LA57_0==135) ) {
                        int LA57_1 = input.LA(2);

                        if ( (true) ) {
                            alt57=1;
                        }
                    }
                    switch (alt57) {
                        case 1 :
                            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:
                            {
                            set198=(Atom)input.LT(1);

                            if ( input.LA(1)==132||input.LA(1)==135 ) {
                                input.consume();
                                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                                (BaseNode)adaptor.create(set198)
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
                            break;

                    }


                    }
                    break;
                case 10 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:500:4: ( ( '++' ) | ( '--' ) ) varOrFcnOrArray
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    set199=(Atom)input.LT(1);

                    if ( input.LA(1)==132||input.LA(1)==135 ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                        (BaseNode)adaptor.create(set199)
                        );
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    pushFollow(FOLLOW_varOrFcnOrArray_in_exprUnary2654);
                    varOrFcnOrArray200=varOrFcnOrArray();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varOrFcnOrArray200.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 58, exprUnary_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "exprUnary"


    public static class fcnDefinition_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "fcnDefinition"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:502:1: fcnDefinition : ( 'public' )? ( 'host' )? fcnType_fcnName fcnFormalParameterList fcnBody -> ^( D_FCN_DEF fcnType_fcnName fcnFormalParameterList fcnBody ) ;
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
        RewriteRuleTokenStream stream_170=new RewriteRuleTokenStream(adaptor,"token 170");
        RewriteRuleTokenStream stream_188=new RewriteRuleTokenStream(adaptor,"token 188");
        RewriteRuleSubtreeStream stream_fcnFormalParameterList=new RewriteRuleSubtreeStream(adaptor,"rule fcnFormalParameterList");
        RewriteRuleSubtreeStream stream_fcnType_fcnName=new RewriteRuleSubtreeStream(adaptor,"rule fcnType_fcnName");
        RewriteRuleSubtreeStream stream_fcnBody=new RewriteRuleSubtreeStream(adaptor,"rule fcnBody");

        	atFlags.clear();			

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 59) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:509:2: ( ( 'public' )? ( 'host' )? fcnType_fcnName fcnFormalParameterList fcnBody -> ^( D_FCN_DEF fcnType_fcnName fcnFormalParameterList fcnBody ) )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:509:4: ( 'public' )? ( 'host' )? fcnType_fcnName fcnFormalParameterList fcnBody
            {
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:509:4: ( 'public' )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==188) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:509:5: 'public'
                    {
                    string_literal201=(Atom)match(input,188,FOLLOW_188_in_fcnDefinition2674); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_188.add(string_literal201);


                    if ( state.backtracking==0 ) { atFlags.add(AttrFlags.PUBLIC); }

                    }
                    break;

            }


            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:510:3: ( 'host' )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==170) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:510:4: 'host'
                    {
                    string_literal202=(Atom)match(input,170,FOLLOW_170_in_fcnDefinition2685); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_170.add(string_literal202);


                    if ( state.backtracking==0 ) { atFlags.add(AttrFlags.HOST); }

                    }
                    break;

            }


            pushFollow(FOLLOW_fcnType_fcnName_in_fcnDefinition2695);
            fcnType_fcnName203=fcnType_fcnName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_fcnType_fcnName.add(fcnType_fcnName203.getTree());

            pushFollow(FOLLOW_fcnFormalParameterList_in_fcnDefinition2697);
            fcnFormalParameterList204=fcnFormalParameterList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_fcnFormalParameterList.add(fcnFormalParameterList204.getTree());

            pushFollow(FOLLOW_fcnBody_in_fcnDefinition2699);
            fcnBody205=fcnBody();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_fcnBody.add(fcnBody205.getTree());

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
            // 512:3: -> ^( D_FCN_DEF fcnType_fcnName fcnFormalParameterList fcnBody )
            {
                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:512:6: ^( D_FCN_DEF fcnType_fcnName fcnFormalParameterList fcnBody )
                {
                BaseNode root_1 = (BaseNode)adaptor.nil();
                root_1 = (BaseNode)adaptor.becomeRoot(
                (BaseNode)adaptor.create(D_FCN_DEF, "D_FCN_DEF")
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
            if ( state.backtracking>0 ) { memoize(input, 59, fcnDefinition_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "fcnDefinition"


    public static class fcnDefinitionHost_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "fcnDefinitionHost"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:514:1: fcnDefinitionHost : ( 'public' )? ( 'host' )? fcnType_fcnName fcnFormalParameterList fcnBody -> ^( D_FCN_DEF fcnType_fcnName fcnFormalParameterList fcnBody ) ;
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
        RewriteRuleTokenStream stream_170=new RewriteRuleTokenStream(adaptor,"token 170");
        RewriteRuleTokenStream stream_188=new RewriteRuleTokenStream(adaptor,"token 188");
        RewriteRuleSubtreeStream stream_fcnFormalParameterList=new RewriteRuleSubtreeStream(adaptor,"rule fcnFormalParameterList");
        RewriteRuleSubtreeStream stream_fcnType_fcnName=new RewriteRuleSubtreeStream(adaptor,"rule fcnType_fcnName");
        RewriteRuleSubtreeStream stream_fcnBody=new RewriteRuleSubtreeStream(adaptor,"rule fcnBody");

        	atFlags.clear();			

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 60) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:522:2: ( ( 'public' )? ( 'host' )? fcnType_fcnName fcnFormalParameterList fcnBody -> ^( D_FCN_DEF fcnType_fcnName fcnFormalParameterList fcnBody ) )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:522:4: ( 'public' )? ( 'host' )? fcnType_fcnName fcnFormalParameterList fcnBody
            {
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:522:4: ( 'public' )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==188) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:522:5: 'public'
                    {
                    string_literal206=(Atom)match(input,188,FOLLOW_188_in_fcnDefinitionHost2735); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_188.add(string_literal206);


                    }
                    break;

            }


            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:522:16: ( 'host' )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==170) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:522:17: 'host'
                    {
                    string_literal207=(Atom)match(input,170,FOLLOW_170_in_fcnDefinitionHost2740); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_170.add(string_literal207);


                    if ( state.backtracking==0 ) { atFlags.add(AttrFlags.HOST); }

                    }
                    break;

            }


            pushFollow(FOLLOW_fcnType_fcnName_in_fcnDefinitionHost2751);
            fcnType_fcnName208=fcnType_fcnName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_fcnType_fcnName.add(fcnType_fcnName208.getTree());

            pushFollow(FOLLOW_fcnFormalParameterList_in_fcnDefinitionHost2754);
            fcnFormalParameterList209=fcnFormalParameterList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_fcnFormalParameterList.add(fcnFormalParameterList209.getTree());

            pushFollow(FOLLOW_fcnBody_in_fcnDefinitionHost2756);
            fcnBody210=fcnBody();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_fcnBody.add(fcnBody210.getTree());

            if ( state.backtracking==0 ) { 	atFlags.add(AttrFlags.PUBLIC); /* enforce */ 	
            			if (!atFlags.contains(AttrFlags.HOST))
                   		throw new PollenException("Composition features must be one of host functions, export statements, or enum definitions.", input);
            		}

            // AST REWRITE
            // elements: fcnType_fcnName, fcnFormalParameterList, fcnBody
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (BaseNode)adaptor.nil();
            // 528:3: -> ^( D_FCN_DEF fcnType_fcnName fcnFormalParameterList fcnBody )
            {
                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:528:6: ^( D_FCN_DEF fcnType_fcnName fcnFormalParameterList fcnBody )
                {
                BaseNode root_1 = (BaseNode)adaptor.nil();
                root_1 = (BaseNode)adaptor.becomeRoot(
                (BaseNode)adaptor.create(D_FCN_DEF, "D_FCN_DEF")
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
            if ( state.backtracking>0 ) { memoize(input, 60, fcnDefinitionHost_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "fcnDefinitionHost"


    public static class fcnAttr_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "fcnAttr"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:535:1: fcnAttr : ( 'public' )? ( 'host' )? ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 61) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:536:2: ( ( 'public' )? ( 'host' )? )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:536:4: ( 'public' )? ( 'host' )?
            {
            root_0 = (BaseNode)adaptor.nil();


            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:536:4: ( 'public' )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==188) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:536:5: 'public'
                    {
                    string_literal211=(Atom)match(input,188,FOLLOW_188_in_fcnAttr2793); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal211_tree = 
                    (BaseNode)adaptor.create(string_literal211)
                    ;
                    adaptor.addChild(root_0, string_literal211_tree);
                    }

                    if ( state.backtracking==0 ) { atFlags.add(AttrFlags.PUBLIC); }

                    }
                    break;

            }


            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:537:3: ( 'host' )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==170) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:537:4: 'host'
                    {
                    string_literal212=(Atom)match(input,170,FOLLOW_170_in_fcnAttr2804); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal212_tree = 
                    (BaseNode)adaptor.create(string_literal212)
                    ;
                    adaptor.addChild(root_0, string_literal212_tree);
                    }

                    if ( state.backtracking==0 ) { atFlags.add(AttrFlags.HOST); }

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
            if ( state.backtracking>0 ) { memoize(input, 61, fcnAttr_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "fcnAttr"


    public static class fcnBody_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "fcnBody"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:539:1: fcnBody : braceOpen ( stmts ) braceClose -> ^( FCNBODY stmts ) ;
    public final pollenParser.fcnBody_return fcnBody() throws RecognitionException {
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 62) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:540:3: ( braceOpen ( stmts ) braceClose -> ^( FCNBODY stmts ) )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:540:5: braceOpen ( stmts ) braceClose
            {
            pushFollow(FOLLOW_braceOpen_in_fcnBody2820);
            braceOpen213=braceOpen();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_braceOpen.add(braceOpen213.getTree());

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:540:15: ( stmts )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:540:16: stmts
            {
            pushFollow(FOLLOW_stmts_in_fcnBody2823);
            stmts214=stmts();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_stmts.add(stmts214.getTree());

            }


            pushFollow(FOLLOW_braceClose_in_fcnBody2827);
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
            // 540:36: -> ^( FCNBODY stmts )
            {
                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:540:39: ^( FCNBODY stmts )
                {
                BaseNode root_1 = (BaseNode)adaptor.nil();
                root_1 = (BaseNode)adaptor.becomeRoot(
                (BaseNode)adaptor.create(FCNBODY, "FCNBODY")
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
            if ( state.backtracking>0 ) { memoize(input, 62, fcnBody_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "fcnBody"


    public static class fcnDeclaration_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "fcnDeclaration"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:542:1: fcnDeclaration : ( 'public' )? ( 'host' )? fcnType_fcnName ( fcnFormalParameterList ) delim -> ^( D_FCN_DCL fcnType_fcnName fcnFormalParameterList ) ;
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
        RewriteRuleTokenStream stream_170=new RewriteRuleTokenStream(adaptor,"token 170");
        RewriteRuleTokenStream stream_188=new RewriteRuleTokenStream(adaptor,"token 188");
        RewriteRuleSubtreeStream stream_fcnFormalParameterList=new RewriteRuleSubtreeStream(adaptor,"rule fcnFormalParameterList");
        RewriteRuleSubtreeStream stream_fcnType_fcnName=new RewriteRuleSubtreeStream(adaptor,"rule fcnType_fcnName");
        RewriteRuleSubtreeStream stream_delim=new RewriteRuleSubtreeStream(adaptor,"rule delim");

        	atFlags.clear();			

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 63) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:549:4: ( ( 'public' )? ( 'host' )? fcnType_fcnName ( fcnFormalParameterList ) delim -> ^( D_FCN_DCL fcnType_fcnName fcnFormalParameterList ) )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:549:6: ( 'public' )? ( 'host' )? fcnType_fcnName ( fcnFormalParameterList ) delim
            {
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:549:6: ( 'public' )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==188) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:549:7: 'public'
                    {
                    string_literal216=(Atom)match(input,188,FOLLOW_188_in_fcnDeclaration2859); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_188.add(string_literal216);


                    if ( state.backtracking==0 ) { atFlags.add(AttrFlags.PUBLIC); }

                    }
                    break;

            }


            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:550:3: ( 'host' )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==170) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:550:4: 'host'
                    {
                    string_literal217=(Atom)match(input,170,FOLLOW_170_in_fcnDeclaration2870); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_170.add(string_literal217);


                    if ( state.backtracking==0 ) { atFlags.add(AttrFlags.HOST); }

                    }
                    break;

            }


            pushFollow(FOLLOW_fcnType_fcnName_in_fcnDeclaration2880);
            fcnType_fcnName218=fcnType_fcnName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_fcnType_fcnName.add(fcnType_fcnName218.getTree());

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:551:19: ( fcnFormalParameterList )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:551:20: fcnFormalParameterList
            {
            pushFollow(FOLLOW_fcnFormalParameterList_in_fcnDeclaration2883);
            fcnFormalParameterList219=fcnFormalParameterList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_fcnFormalParameterList.add(fcnFormalParameterList219.getTree());

            }


            pushFollow(FOLLOW_delim_in_fcnDeclaration2886);
            delim220=delim();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_delim.add(delim220.getTree());

            // AST REWRITE
            // elements: fcnFormalParameterList, fcnType_fcnName
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (BaseNode)adaptor.nil();
            // 552:4: -> ^( D_FCN_DCL fcnType_fcnName fcnFormalParameterList )
            {
                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:552:7: ^( D_FCN_DCL fcnType_fcnName fcnFormalParameterList )
                {
                BaseNode root_1 = (BaseNode)adaptor.nil();
                root_1 = (BaseNode)adaptor.becomeRoot(
                (BaseNode)adaptor.create(D_FCN_DCL, "D_FCN_DCL")
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
            if ( state.backtracking>0 ) { memoize(input, 63, fcnDeclaration_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "fcnDeclaration"


    public static class fcnType_fcnName_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "fcnType_fcnName"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:554:1: fcnType_fcnName : ( typeName qualName -> ^( D_FCN_TYP_NM typeName qualName ) |{...}? typeName -> ^( D_FCN_CTOR typeName ) | qualName -> ^( D_FCN_TYP_NM D_VOID qualName ) | ( '(' typeName ( ',' typeName )* ')' qualName )=> fcnTypes_fcnName );
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 64) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:556:2: ( typeName qualName -> ^( D_FCN_TYP_NM typeName qualName ) |{...}? typeName -> ^( D_FCN_CTOR typeName ) | qualName -> ^( D_FCN_TYP_NM D_VOID qualName ) | ( '(' typeName ( ',' typeName )* ')' qualName )=> fcnTypes_fcnName )
            int alt67=4;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==150||LA67_0==152||(LA67_0 >= 175 && LA67_0 <= 177)||LA67_0==190||(LA67_0 >= 194 && LA67_0 <= 196)) ) {
                int LA67_1 = input.LA(2);

                if ( (synpred111_pollen()) ) {
                    alt67=1;
                }
                else if ( (((synpred112_pollen()&&synpred112_pollen())&&(input.LT(1).getText().equals(ti.getTypeName()) ))) ) {
                    alt67=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 67, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA67_0==IDENT) ) {
                int LA67_2 = input.LA(2);

                if ( (synpred111_pollen()) ) {
                    alt67=1;
                }
                else if ( (((synpred112_pollen()&&synpred112_pollen())&&(input.LT(1).getText().equals(ti.getTypeName()) ))) ) {
                    alt67=2;
                }
                else if ( (synpred113_pollen()) ) {
                    alt67=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 67, 2, input);

                    throw nvae;

                }
            }
            else if ( (LA67_0==128) && (synpred115_pollen())) {
                alt67=4;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 67, 0, input);

                throw nvae;

            }
            switch (alt67) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:556:4: typeName qualName
                    {
                    pushFollow(FOLLOW_typeName_in_fcnType_fcnName2912);
                    typeName221=typeName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeName.add(typeName221.getTree());

                    pushFollow(FOLLOW_qualName_in_fcnType_fcnName2914);
                    qualName222=qualName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_qualName.add(qualName222.getTree());

                    // AST REWRITE
                    // elements: qualName, typeName
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (BaseNode)adaptor.nil();
                    // 557:3: -> ^( D_FCN_TYP_NM typeName qualName )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:557:6: ^( D_FCN_TYP_NM typeName qualName )
                        {
                        BaseNode root_1 = (BaseNode)adaptor.nil();
                        root_1 = (BaseNode)adaptor.becomeRoot(
                        (BaseNode)adaptor.create(D_FCN_TYP_NM, "D_FCN_TYP_NM")
                        , root_1);

                        adaptor.addChild(root_1, stream_typeName.nextTree());

                        adaptor.addChild(root_1, stream_qualName.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:558:4: {...}? typeName
                    {
                    if ( !((input.LT(1).getText().equals(ti.getTypeName()) )) ) {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        throw new FailedPredicateException(input, "fcnType_fcnName", "input.LT(1).getText().equals(ti.getTypeName()) ");
                    }

                    pushFollow(FOLLOW_typeName_in_fcnType_fcnName2953);
                    typeName223=typeName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeName.add(typeName223.getTree());

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
                    // 559:3: -> ^( D_FCN_CTOR typeName )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:559:6: ^( D_FCN_CTOR typeName )
                        {
                        BaseNode root_1 = (BaseNode)adaptor.nil();
                        root_1 = (BaseNode)adaptor.becomeRoot(
                        (BaseNode)adaptor.create(D_FCN_CTOR, "D_FCN_CTOR")
                        , root_1);

                        adaptor.addChild(root_1, stream_typeName.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 3 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:560:4: qualName
                    {
                    pushFollow(FOLLOW_qualName_in_fcnType_fcnName2983);
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
                    // 561:3: -> ^( D_FCN_TYP_NM D_VOID qualName )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:561:6: ^( D_FCN_TYP_NM D_VOID qualName )
                        {
                        BaseNode root_1 = (BaseNode)adaptor.nil();
                        root_1 = (BaseNode)adaptor.becomeRoot(
                        (BaseNode)adaptor.create(D_FCN_TYP_NM, "D_FCN_TYP_NM")
                        , root_1);

                        adaptor.addChild(root_1, 
                        (BaseNode)adaptor.create(D_VOID, "D_VOID")
                        );

                        adaptor.addChild(root_1, stream_qualName.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 4 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:562:4: ( '(' typeName ( ',' typeName )* ')' qualName )=> fcnTypes_fcnName
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    pushFollow(FOLLOW_fcnTypes_fcnName_in_fcnType_fcnName3041);
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
            if ( state.backtracking>0 ) { memoize(input, 64, fcnType_fcnName_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "fcnType_fcnName"


    public static class fcnTypes_fcnName_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "fcnTypes_fcnName"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:564:1: fcnTypes_fcnName : '(' fcnTypes ')' qualName -> ^( D_FCN_TYP_NM fcnTypes qualName ) ;
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
        RewriteRuleTokenStream stream_128=new RewriteRuleTokenStream(adaptor,"token 128");
        RewriteRuleTokenStream stream_129=new RewriteRuleTokenStream(adaptor,"token 129");
        RewriteRuleSubtreeStream stream_fcnTypes=new RewriteRuleSubtreeStream(adaptor,"rule fcnTypes");
        RewriteRuleSubtreeStream stream_qualName=new RewriteRuleSubtreeStream(adaptor,"rule qualName");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 65) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:565:2: ( '(' fcnTypes ')' qualName -> ^( D_FCN_TYP_NM fcnTypes qualName ) )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:565:4: '(' fcnTypes ')' qualName
            {
            char_literal226=(Atom)match(input,128,FOLLOW_128_in_fcnTypes_fcnName3052); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_128.add(char_literal226);


            pushFollow(FOLLOW_fcnTypes_in_fcnTypes_fcnName3054);
            fcnTypes227=fcnTypes();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_fcnTypes.add(fcnTypes227.getTree());

            char_literal228=(Atom)match(input,129,FOLLOW_129_in_fcnTypes_fcnName3056); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_129.add(char_literal228);


            pushFollow(FOLLOW_qualName_in_fcnTypes_fcnName3058);
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
            // 565:30: -> ^( D_FCN_TYP_NM fcnTypes qualName )
            {
                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:565:33: ^( D_FCN_TYP_NM fcnTypes qualName )
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
            if ( state.backtracking>0 ) { memoize(input, 65, fcnTypes_fcnName_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "fcnTypes_fcnName"


    public static class fcnTypes_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "fcnTypes"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:567:1: fcnTypes : typeName ( ',' typeName )* -> ^( D_FCN_TYP_LIST ( typeName )+ ) ;
    public final pollenParser.fcnTypes_return fcnTypes() throws RecognitionException {
        pollenParser.fcnTypes_return retval = new pollenParser.fcnTypes_return();
        retval.start = input.LT(1);

        int fcnTypes_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom char_literal231=null;
        pollenParser.typeName_return typeName230 =null;

        pollenParser.typeName_return typeName232 =null;


        BaseNode char_literal231_tree=null;
        RewriteRuleTokenStream stream_133=new RewriteRuleTokenStream(adaptor,"token 133");
        RewriteRuleSubtreeStream stream_typeName=new RewriteRuleSubtreeStream(adaptor,"rule typeName");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 66) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:568:2: ( typeName ( ',' typeName )* -> ^( D_FCN_TYP_LIST ( typeName )+ ) )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:568:4: typeName ( ',' typeName )*
            {
            pushFollow(FOLLOW_typeName_in_fcnTypes3079);
            typeName230=typeName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeName.add(typeName230.getTree());

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:568:13: ( ',' typeName )*
            loop68:
            do {
                int alt68=2;
                int LA68_0 = input.LA(1);

                if ( (LA68_0==133) ) {
                    alt68=1;
                }


                switch (alt68) {
            	case 1 :
            	    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:568:14: ',' typeName
            	    {
            	    char_literal231=(Atom)match(input,133,FOLLOW_133_in_fcnTypes3082); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_133.add(char_literal231);


            	    pushFollow(FOLLOW_typeName_in_fcnTypes3084);
            	    typeName232=typeName();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_typeName.add(typeName232.getTree());

            	    }
            	    break;

            	default :
            	    break loop68;
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
            // 568:29: -> ^( D_FCN_TYP_LIST ( typeName )+ )
            {
                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:568:32: ^( D_FCN_TYP_LIST ( typeName )+ )
                {
                BaseNode root_1 = (BaseNode)adaptor.nil();
                root_1 = (BaseNode)adaptor.becomeRoot(
                (BaseNode)adaptor.create(D_FCN_TYP_LIST, "D_FCN_TYP_LIST")
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
            if ( state.backtracking>0 ) { memoize(input, 66, fcnTypes_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "fcnTypes"


    public static class fcnFormalParameterList_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "fcnFormalParameterList"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:570:1: fcnFormalParameterList : '(' fcnFormalParameters ')' -> ^( FCNPARMS fcnFormalParameters ) ;
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
        RewriteRuleTokenStream stream_128=new RewriteRuleTokenStream(adaptor,"token 128");
        RewriteRuleTokenStream stream_129=new RewriteRuleTokenStream(adaptor,"token 129");
        RewriteRuleSubtreeStream stream_fcnFormalParameters=new RewriteRuleSubtreeStream(adaptor,"rule fcnFormalParameters");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 67) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:571:2: ( '(' fcnFormalParameters ')' -> ^( FCNPARMS fcnFormalParameters ) )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:571:4: '(' fcnFormalParameters ')'
            {
            char_literal233=(Atom)match(input,128,FOLLOW_128_in_fcnFormalParameterList3105); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_128.add(char_literal233);


            pushFollow(FOLLOW_fcnFormalParameters_in_fcnFormalParameterList3107);
            fcnFormalParameters234=fcnFormalParameters();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_fcnFormalParameters.add(fcnFormalParameters234.getTree());

            char_literal235=(Atom)match(input,129,FOLLOW_129_in_fcnFormalParameterList3109); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_129.add(char_literal235);


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
            // 571:32: -> ^( FCNPARMS fcnFormalParameters )
            {
                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:571:35: ^( FCNPARMS fcnFormalParameters )
                {
                BaseNode root_1 = (BaseNode)adaptor.nil();
                root_1 = (BaseNode)adaptor.becomeRoot(
                (BaseNode)adaptor.create(FCNPARMS, "FCNPARMS")
                , root_1);

                adaptor.addChild(root_1, stream_fcnFormalParameters.nextTree());

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
            if ( state.backtracking>0 ) { memoize(input, 67, fcnFormalParameterList_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "fcnFormalParameterList"


    public static class fcnFormalParameters_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "fcnFormalParameters"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:573:1: fcnFormalParameters : ( fcnFormalParameter ( ',' fcnFormalParameter )* -> ^( LIST[\"LIST\"] ( fcnFormalParameter )+ ) | -> NIL );
    public final pollenParser.fcnFormalParameters_return fcnFormalParameters() throws RecognitionException {
        pollenParser.fcnFormalParameters_return retval = new pollenParser.fcnFormalParameters_return();
        retval.start = input.LT(1);

        int fcnFormalParameters_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom char_literal237=null;
        pollenParser.fcnFormalParameter_return fcnFormalParameter236 =null;

        pollenParser.fcnFormalParameter_return fcnFormalParameter238 =null;


        BaseNode char_literal237_tree=null;
        RewriteRuleTokenStream stream_133=new RewriteRuleTokenStream(adaptor,"token 133");
        RewriteRuleSubtreeStream stream_fcnFormalParameter=new RewriteRuleSubtreeStream(adaptor,"rule fcnFormalParameter");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 68) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:574:2: ( fcnFormalParameter ( ',' fcnFormalParameter )* -> ^( LIST[\"LIST\"] ( fcnFormalParameter )+ ) | -> NIL )
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==IDENT||LA70_0==150||LA70_0==152||(LA70_0 >= 175 && LA70_0 <= 177)||LA70_0==190||(LA70_0 >= 194 && LA70_0 <= 196)) ) {
                alt70=1;
            }
            else if ( (LA70_0==129) ) {
                alt70=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 70, 0, input);

                throw nvae;

            }
            switch (alt70) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:574:4: fcnFormalParameter ( ',' fcnFormalParameter )*
                    {
                    pushFollow(FOLLOW_fcnFormalParameter_in_fcnFormalParameters3127);
                    fcnFormalParameter236=fcnFormalParameter();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_fcnFormalParameter.add(fcnFormalParameter236.getTree());

                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:574:23: ( ',' fcnFormalParameter )*
                    loop69:
                    do {
                        int alt69=2;
                        int LA69_0 = input.LA(1);

                        if ( (LA69_0==133) ) {
                            alt69=1;
                        }


                        switch (alt69) {
                    	case 1 :
                    	    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:574:24: ',' fcnFormalParameter
                    	    {
                    	    char_literal237=(Atom)match(input,133,FOLLOW_133_in_fcnFormalParameters3130); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_133.add(char_literal237);


                    	    pushFollow(FOLLOW_fcnFormalParameter_in_fcnFormalParameters3132);
                    	    fcnFormalParameter238=fcnFormalParameter();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_fcnFormalParameter.add(fcnFormalParameter238.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop69;
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
                    // 575:3: -> ^( LIST[\"LIST\"] ( fcnFormalParameter )+ )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:575:6: ^( LIST[\"LIST\"] ( fcnFormalParameter )+ )
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
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:576:4: 
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
                    // 576:4: -> NIL
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
            if ( state.backtracking>0 ) { memoize(input, 68, fcnFormalParameters_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "fcnFormalParameters"


    public static class fcnFormalParameter_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "fcnFormalParameter"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:578:1: fcnFormalParameter : typeName IDENT ( '=' ! arrayLitElem )? ;
    public final pollenParser.fcnFormalParameter_return fcnFormalParameter() throws RecognitionException {
        pollenParser.fcnFormalParameter_return retval = new pollenParser.fcnFormalParameter_return();
        retval.start = input.LT(1);

        int fcnFormalParameter_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom IDENT240=null;
        Atom char_literal241=null;
        pollenParser.typeName_return typeName239 =null;

        pollenParser.arrayLitElem_return arrayLitElem242 =null;


        BaseNode IDENT240_tree=null;
        BaseNode char_literal241_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 69) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:579:2: ( typeName IDENT ( '=' ! arrayLitElem )? )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:579:6: typeName IDENT ( '=' ! arrayLitElem )?
            {
            root_0 = (BaseNode)adaptor.nil();


            pushFollow(FOLLOW_typeName_in_fcnFormalParameter3169);
            typeName239=typeName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, typeName239.getTree());

            IDENT240=(Atom)match(input,IDENT,FOLLOW_IDENT_in_fcnFormalParameter3171); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENT240_tree = 
            (BaseNode)adaptor.create(IDENT240)
            ;
            adaptor.addChild(root_0, IDENT240_tree);
            }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:579:21: ( '=' ! arrayLitElem )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==ASSIGN) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:579:22: '=' ! arrayLitElem
                    {
                    char_literal241=(Atom)match(input,ASSIGN,FOLLOW_ASSIGN_in_fcnFormalParameter3174); if (state.failed) return retval;

                    pushFollow(FOLLOW_arrayLitElem_in_fcnFormalParameter3177);
                    arrayLitElem242=arrayLitElem();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, arrayLitElem242.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 69, fcnFormalParameter_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "fcnFormalParameter"


    public static class fcnArgumentList_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "fcnArgumentList"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:581:1: fcnArgumentList : '(' fcnArguments ')' -> ^( E_CALL_ARGS fcnArguments ) ;
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
        RewriteRuleTokenStream stream_128=new RewriteRuleTokenStream(adaptor,"token 128");
        RewriteRuleTokenStream stream_129=new RewriteRuleTokenStream(adaptor,"token 129");
        RewriteRuleSubtreeStream stream_fcnArguments=new RewriteRuleSubtreeStream(adaptor,"rule fcnArguments");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 70) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:582:2: ( '(' fcnArguments ')' -> ^( E_CALL_ARGS fcnArguments ) )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:582:4: '(' fcnArguments ')'
            {
            char_literal243=(Atom)match(input,128,FOLLOW_128_in_fcnArgumentList3190); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_128.add(char_literal243);


            pushFollow(FOLLOW_fcnArguments_in_fcnArgumentList3192);
            fcnArguments244=fcnArguments();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_fcnArguments.add(fcnArguments244.getTree());

            char_literal245=(Atom)match(input,129,FOLLOW_129_in_fcnArgumentList3194); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_129.add(char_literal245);


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
            // 582:25: -> ^( E_CALL_ARGS fcnArguments )
            {
                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:582:28: ^( E_CALL_ARGS fcnArguments )
                {
                BaseNode root_1 = (BaseNode)adaptor.nil();
                root_1 = (BaseNode)adaptor.becomeRoot(
                (BaseNode)adaptor.create(E_CALL_ARGS, "E_CALL_ARGS")
                , root_1);

                adaptor.addChild(root_1, stream_fcnArguments.nextTree());

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
            if ( state.backtracking>0 ) { memoize(input, 70, fcnArgumentList_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "fcnArgumentList"


    public static class fcnArguments_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "fcnArguments"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:584:1: fcnArguments : exprList ;
    public final pollenParser.fcnArguments_return fcnArguments() throws RecognitionException {
        pollenParser.fcnArguments_return retval = new pollenParser.fcnArguments_return();
        retval.start = input.LT(1);

        int fcnArguments_StartIndex = input.index();

        BaseNode root_0 = null;

        pollenParser.exprList_return exprList246 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 71) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:585:2: ( exprList )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:585:4: exprList
            {
            root_0 = (BaseNode)adaptor.nil();


            pushFollow(FOLLOW_exprList_in_fcnArguments3212);
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
            if ( state.backtracking>0 ) { memoize(input, 71, fcnArguments_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "fcnArguments"


    public static class varOrFcnOrArray_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "varOrFcnOrArray"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:587:1: varOrFcnOrArray : ( 'new' typeName fcnArgumentList fieldOrArrayAccess -> ^( E_NEW typeName fcnArgumentList fieldOrArrayAccess ) | '@' ^ IDENT fcnArgumentList fieldOrArrayAccess | '@' ^ IDENT fieldOrArrayAccess | '@' ^| qualName fcnArgumentList fieldOrArrayAccess -> ^( E_CALL qualName fcnArgumentList fieldOrArrayAccess ) | qualName fieldOrArrayAccess );
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
        RewriteRuleTokenStream stream_181=new RewriteRuleTokenStream(adaptor,"token 181");
        RewriteRuleSubtreeStream stream_typeName=new RewriteRuleSubtreeStream(adaptor,"rule typeName");
        RewriteRuleSubtreeStream stream_fcnArgumentList=new RewriteRuleSubtreeStream(adaptor,"rule fcnArgumentList");
        RewriteRuleSubtreeStream stream_qualName=new RewriteRuleSubtreeStream(adaptor,"rule qualName");
        RewriteRuleSubtreeStream stream_fieldOrArrayAccess=new RewriteRuleSubtreeStream(adaptor,"rule fieldOrArrayAccess");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 72) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:591:2: ( 'new' typeName fcnArgumentList fieldOrArrayAccess -> ^( E_NEW typeName fcnArgumentList fieldOrArrayAccess ) | '@' ^ IDENT fcnArgumentList fieldOrArrayAccess | '@' ^ IDENT fieldOrArrayAccess | '@' ^| qualName fcnArgumentList fieldOrArrayAccess -> ^( E_CALL qualName fcnArgumentList fieldOrArrayAccess ) | qualName fieldOrArrayAccess )
            int alt72=6;
            switch ( input.LA(1) ) {
            case 181:
                {
                alt72=1;
                }
                break;
            case 144:
                {
                int LA72_2 = input.LA(2);

                if ( (synpred121_pollen()) ) {
                    alt72=2;
                }
                else if ( (synpred122_pollen()) ) {
                    alt72=3;
                }
                else if ( (synpred123_pollen()) ) {
                    alt72=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 72, 2, input);

                    throw nvae;

                }
                }
                break;
            case IDENT:
                {
                int LA72_6 = input.LA(2);

                if ( (synpred124_pollen()) ) {
                    alt72=5;
                }
                else if ( (true) ) {
                    alt72=6;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 72, 6, input);

                    throw nvae;

                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 72, 0, input);

                throw nvae;

            }

            switch (alt72) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:591:4: 'new' typeName fcnArgumentList fieldOrArrayAccess
                    {
                    string_literal247=(Atom)match(input,181,FOLLOW_181_in_varOrFcnOrArray3225); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_181.add(string_literal247);


                    pushFollow(FOLLOW_typeName_in_varOrFcnOrArray3227);
                    typeName248=typeName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeName.add(typeName248.getTree());

                    pushFollow(FOLLOW_fcnArgumentList_in_varOrFcnOrArray3229);
                    fcnArgumentList249=fcnArgumentList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_fcnArgumentList.add(fcnArgumentList249.getTree());

                    pushFollow(FOLLOW_fieldOrArrayAccess_in_varOrFcnOrArray3231);
                    fieldOrArrayAccess250=fieldOrArrayAccess();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_fieldOrArrayAccess.add(fieldOrArrayAccess250.getTree());

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
                    // 592:3: -> ^( E_NEW typeName fcnArgumentList fieldOrArrayAccess )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:592:6: ^( E_NEW typeName fcnArgumentList fieldOrArrayAccess )
                        {
                        BaseNode root_1 = (BaseNode)adaptor.nil();
                        root_1 = (BaseNode)adaptor.becomeRoot(
                        (BaseNode)adaptor.create(E_NEW, "E_NEW")
                        , root_1);

                        adaptor.addChild(root_1, stream_typeName.nextTree());

                        adaptor.addChild(root_1, stream_fcnArgumentList.nextTree());

                        adaptor.addChild(root_1, stream_fieldOrArrayAccess.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:593:4: '@' ^ IDENT fcnArgumentList fieldOrArrayAccess
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    char_literal251=(Atom)match(input,144,FOLLOW_144_in_varOrFcnOrArray3250); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal251_tree = 
                    (BaseNode)adaptor.create(char_literal251)
                    ;
                    root_0 = (BaseNode)adaptor.becomeRoot(char_literal251_tree, root_0);
                    }

                    IDENT252=(Atom)match(input,IDENT,FOLLOW_IDENT_in_varOrFcnOrArray3253); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENT252_tree = 
                    (BaseNode)adaptor.create(IDENT252)
                    ;
                    adaptor.addChild(root_0, IDENT252_tree);
                    }

                    pushFollow(FOLLOW_fcnArgumentList_in_varOrFcnOrArray3255);
                    fcnArgumentList253=fcnArgumentList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, fcnArgumentList253.getTree());

                    pushFollow(FOLLOW_fieldOrArrayAccess_in_varOrFcnOrArray3257);
                    fieldOrArrayAccess254=fieldOrArrayAccess();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, fieldOrArrayAccess254.getTree());

                    }
                    break;
                case 3 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:594:4: '@' ^ IDENT fieldOrArrayAccess
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    char_literal255=(Atom)match(input,144,FOLLOW_144_in_varOrFcnOrArray3263); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal255_tree = 
                    (BaseNode)adaptor.create(char_literal255)
                    ;
                    root_0 = (BaseNode)adaptor.becomeRoot(char_literal255_tree, root_0);
                    }

                    IDENT256=(Atom)match(input,IDENT,FOLLOW_IDENT_in_varOrFcnOrArray3266); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENT256_tree = 
                    (BaseNode)adaptor.create(IDENT256)
                    ;
                    adaptor.addChild(root_0, IDENT256_tree);
                    }

                    pushFollow(FOLLOW_fieldOrArrayAccess_in_varOrFcnOrArray3268);
                    fieldOrArrayAccess257=fieldOrArrayAccess();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, fieldOrArrayAccess257.getTree());

                    }
                    break;
                case 4 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:595:4: '@' ^
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    char_literal258=(Atom)match(input,144,FOLLOW_144_in_varOrFcnOrArray3277); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal258_tree = 
                    (BaseNode)adaptor.create(char_literal258)
                    ;
                    root_0 = (BaseNode)adaptor.becomeRoot(char_literal258_tree, root_0);
                    }

                    }
                    break;
                case 5 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:596:4: qualName fcnArgumentList fieldOrArrayAccess
                    {
                    pushFollow(FOLLOW_qualName_in_varOrFcnOrArray3284);
                    qualName259=qualName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_qualName.add(qualName259.getTree());

                    pushFollow(FOLLOW_fcnArgumentList_in_varOrFcnOrArray3286);
                    fcnArgumentList260=fcnArgumentList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_fcnArgumentList.add(fcnArgumentList260.getTree());

                    pushFollow(FOLLOW_fieldOrArrayAccess_in_varOrFcnOrArray3288);
                    fieldOrArrayAccess261=fieldOrArrayAccess();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_fieldOrArrayAccess.add(fieldOrArrayAccess261.getTree());

                    // AST REWRITE
                    // elements: fieldOrArrayAccess, qualName, fcnArgumentList
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (BaseNode)adaptor.nil();
                    // 597:3: -> ^( E_CALL qualName fcnArgumentList fieldOrArrayAccess )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:597:6: ^( E_CALL qualName fcnArgumentList fieldOrArrayAccess )
                        {
                        BaseNode root_1 = (BaseNode)adaptor.nil();
                        root_1 = (BaseNode)adaptor.becomeRoot(
                        (BaseNode)adaptor.create(E_CALL, "E_CALL")
                        , root_1);

                        adaptor.addChild(root_1, stream_qualName.nextTree());

                        adaptor.addChild(root_1, stream_fcnArgumentList.nextTree());

                        adaptor.addChild(root_1, stream_fieldOrArrayAccess.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 6 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:598:4: qualName fieldOrArrayAccess
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    pushFollow(FOLLOW_qualName_in_varOrFcnOrArray3308);
                    qualName262=qualName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, qualName262.getTree());

                    pushFollow(FOLLOW_fieldOrArrayAccess_in_varOrFcnOrArray3310);
                    fieldOrArrayAccess263=fieldOrArrayAccess();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, fieldOrArrayAccess263.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 72, varOrFcnOrArray_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "varOrFcnOrArray"


    public static class fieldOrArrayAccess_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "fieldOrArrayAccess"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:600:1: fieldOrArrayAccess : ( ( fieldAccess | arrayAccess )+ | -> NIL );
    public final pollenParser.fieldOrArrayAccess_return fieldOrArrayAccess() throws RecognitionException {
        pollenParser.fieldOrArrayAccess_return retval = new pollenParser.fieldOrArrayAccess_return();
        retval.start = input.LT(1);

        int fieldOrArrayAccess_StartIndex = input.index();

        BaseNode root_0 = null;

        pollenParser.fieldAccess_return fieldAccess264 =null;

        pollenParser.arrayAccess_return arrayAccess265 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 73) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:601:2: ( ( fieldAccess | arrayAccess )+ | -> NIL )
            int alt74=2;
            switch ( input.LA(1) ) {
            case 145:
                {
                int LA74_1 = input.LA(2);

                if ( (synpred127_pollen()) ) {
                    alt74=1;
                }
                else if ( (true) ) {
                    alt74=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 74, 1, input);

                    throw nvae;

                }
                }
                break;
            case 136:
                {
                alt74=1;
                }
                break;
            case ADD_EQ:
            case ASSIGN:
            case BIND:
            case BITAND_EQ:
            case BITOR_EQ:
            case BITXOR_EQ:
            case BIT_NOT:
            case CHAR:
            case DIV_EQ:
            case EQ:
            case GT_EQ:
            case HEX_LIT:
            case IDENT:
            case INJECT:
            case INT_LIT:
            case LOG_NOT:
            case LSHFT_EQ:
            case LT_EQ:
            case MOD_EQ:
            case MUL_EQ:
            case NL:
            case NOT_EQ:
            case OCT_LIT:
            case REAL_LIT:
            case RSHFT_EQ:
            case SEMI:
            case STRING:
            case SUB_EQ:
            case 125:
            case 126:
            case 127:
            case 128:
            case 129:
            case 130:
            case 131:
            case 132:
            case 133:
            case 134:
            case 135:
            case 137:
            case 138:
            case 139:
            case 140:
            case 141:
            case 142:
            case 143:
            case 144:
            case 146:
            case 147:
            case 149:
            case 150:
            case 151:
            case 152:
            case 153:
            case 154:
            case 155:
            case 156:
            case 157:
            case 158:
            case 159:
            case 162:
            case 164:
            case 166:
            case 167:
            case 168:
            case 169:
            case 170:
            case 171:
            case 173:
            case 175:
            case 176:
            case 177:
            case 179:
            case 180:
            case 181:
            case 182:
            case 185:
            case 186:
            case 187:
            case 188:
            case 189:
            case 190:
            case 191:
            case 192:
            case 194:
            case 195:
            case 196:
            case 197:
            case 198:
            case 200:
            case 201:
            case 202:
                {
                alt74=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 74, 0, input);

                throw nvae;

            }

            switch (alt74) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:601:5: ( fieldAccess | arrayAccess )+
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:601:5: ( fieldAccess | arrayAccess )+
                    int cnt73=0;
                    loop73:
                    do {
                        int alt73=3;
                        int LA73_0 = input.LA(1);

                        if ( (LA73_0==136) ) {
                            alt73=1;
                        }
                        else if ( (LA73_0==145) ) {
                            int LA73_2 = input.LA(2);

                            if ( (synpred126_pollen()) ) {
                                alt73=2;
                            }


                        }


                        switch (alt73) {
                    	case 1 :
                    	    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:601:6: fieldAccess
                    	    {
                    	    pushFollow(FOLLOW_fieldAccess_in_fieldOrArrayAccess3323);
                    	    fieldAccess264=fieldAccess();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, fieldAccess264.getTree());

                    	    }
                    	    break;
                    	case 2 :
                    	    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:601:20: arrayAccess
                    	    {
                    	    pushFollow(FOLLOW_arrayAccess_in_fieldOrArrayAccess3327);
                    	    arrayAccess265=arrayAccess();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, arrayAccess265.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt73 >= 1 ) break loop73;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(73, input);
                                throw eee;
                        }
                        cnt73++;
                    } while (true);


                    }
                    break;
                case 2 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:602:4: 
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
                    // 602:4: -> NIL
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
            if ( state.backtracking>0 ) { memoize(input, 73, fieldOrArrayAccess_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "fieldOrArrayAccess"


    public static class fieldAccess_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "fieldAccess"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:604:1: fieldAccess : '.' IDENT ( fcnArgumentList )? -> ^( E_FIELD IDENT ( fcnArgumentList )? ) ;
    public final pollenParser.fieldAccess_return fieldAccess() throws RecognitionException {
        pollenParser.fieldAccess_return retval = new pollenParser.fieldAccess_return();
        retval.start = input.LT(1);

        int fieldAccess_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom char_literal266=null;
        Atom IDENT267=null;
        pollenParser.fcnArgumentList_return fcnArgumentList268 =null;


        BaseNode char_literal266_tree=null;
        BaseNode IDENT267_tree=null;
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleTokenStream stream_136=new RewriteRuleTokenStream(adaptor,"token 136");
        RewriteRuleSubtreeStream stream_fcnArgumentList=new RewriteRuleSubtreeStream(adaptor,"rule fcnArgumentList");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 74) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:605:2: ( '.' IDENT ( fcnArgumentList )? -> ^( E_FIELD IDENT ( fcnArgumentList )? ) )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:605:4: '.' IDENT ( fcnArgumentList )?
            {
            char_literal266=(Atom)match(input,136,FOLLOW_136_in_fieldAccess3346); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_136.add(char_literal266);


            IDENT267=(Atom)match(input,IDENT,FOLLOW_IDENT_in_fieldAccess3348); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENT.add(IDENT267);


            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:605:14: ( fcnArgumentList )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==128) ) {
                int LA75_1 = input.LA(2);

                if ( (synpred128_pollen()) ) {
                    alt75=1;
                }
            }
            switch (alt75) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:605:15: fcnArgumentList
                    {
                    pushFollow(FOLLOW_fcnArgumentList_in_fieldAccess3351);
                    fcnArgumentList268=fcnArgumentList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_fcnArgumentList.add(fcnArgumentList268.getTree());

                    }
                    break;

            }


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
            // 605:33: -> ^( E_FIELD IDENT ( fcnArgumentList )? )
            {
                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:605:36: ^( E_FIELD IDENT ( fcnArgumentList )? )
                {
                BaseNode root_1 = (BaseNode)adaptor.nil();
                root_1 = (BaseNode)adaptor.becomeRoot(
                (BaseNode)adaptor.create(E_FIELD, "E_FIELD")
                , root_1);

                adaptor.addChild(root_1, 
                stream_IDENT.nextNode()
                );

                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:605:53: ( fcnArgumentList )?
                if ( stream_fcnArgumentList.hasNext() ) {
                    adaptor.addChild(root_1, stream_fcnArgumentList.nextTree());

                }
                stream_fcnArgumentList.reset();

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
            if ( state.backtracking>0 ) { memoize(input, 74, fieldAccess_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "fieldAccess"


    public static class arrayAccess_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "arrayAccess"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:607:1: arrayAccess : '[' ( exprList )? ']' -> ^( E_INDEX ( exprList )? ) ;
    public final pollenParser.arrayAccess_return arrayAccess() throws RecognitionException {
        pollenParser.arrayAccess_return retval = new pollenParser.arrayAccess_return();
        retval.start = input.LT(1);

        int arrayAccess_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom char_literal269=null;
        Atom char_literal271=null;
        pollenParser.exprList_return exprList270 =null;


        BaseNode char_literal269_tree=null;
        BaseNode char_literal271_tree=null;
        RewriteRuleTokenStream stream_145=new RewriteRuleTokenStream(adaptor,"token 145");
        RewriteRuleTokenStream stream_146=new RewriteRuleTokenStream(adaptor,"token 146");
        RewriteRuleSubtreeStream stream_exprList=new RewriteRuleSubtreeStream(adaptor,"rule exprList");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 75) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:608:2: ( '[' ( exprList )? ']' -> ^( E_INDEX ( exprList )? ) )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:608:4: '[' ( exprList )? ']'
            {
            char_literal269=(Atom)match(input,145,FOLLOW_145_in_arrayAccess3375); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_145.add(char_literal269);


            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:608:8: ( exprList )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==146) ) {
                int LA76_1 = input.LA(2);

                if ( (synpred129_pollen()) ) {
                    alt76=1;
                }
            }
            else if ( ((LA76_0 >= BIT_NOT && LA76_0 <= CHAR)||LA76_0==HEX_LIT||LA76_0==IDENT||LA76_0==INJECT||LA76_0==INT_LIT||LA76_0==LOG_NOT||LA76_0==NL||LA76_0==OCT_LIT||LA76_0==REAL_LIT||LA76_0==SEMI||LA76_0==STRING||(LA76_0 >= 128 && LA76_0 <= 129)||(LA76_0 >= 132 && LA76_0 <= 135)||(LA76_0 >= 144 && LA76_0 <= 145)||(LA76_0 >= 149 && LA76_0 <= 159)||LA76_0==162||LA76_0==164||(LA76_0 >= 166 && LA76_0 <= 171)||LA76_0==173||(LA76_0 >= 175 && LA76_0 <= 177)||(LA76_0 >= 179 && LA76_0 <= 182)||(LA76_0 >= 185 && LA76_0 <= 192)||(LA76_0 >= 194 && LA76_0 <= 198)||LA76_0==202) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:608:9: exprList
                    {
                    pushFollow(FOLLOW_exprList_in_arrayAccess3378);
                    exprList270=exprList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_exprList.add(exprList270.getTree());

                    }
                    break;

            }


            char_literal271=(Atom)match(input,146,FOLLOW_146_in_arrayAccess3382); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_146.add(char_literal271);


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
            // 608:24: -> ^( E_INDEX ( exprList )? )
            {
                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:608:27: ^( E_INDEX ( exprList )? )
                {
                BaseNode root_1 = (BaseNode)adaptor.nil();
                root_1 = (BaseNode)adaptor.becomeRoot(
                (BaseNode)adaptor.create(E_INDEX, "E_INDEX")
                , root_1);

                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:608:37: ( exprList )?
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
            if ( state.backtracking>0 ) { memoize(input, 75, arrayAccess_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "arrayAccess"


    public static class stmtBlock_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stmtBlock"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:611:1: stmtBlock : braceOpen stmts braceClose -> ^( S_BLOCK stmts ) ;
    public final pollenParser.stmtBlock_return stmtBlock() throws RecognitionException {
        pollenParser.stmtBlock_return retval = new pollenParser.stmtBlock_return();
        retval.start = input.LT(1);

        int stmtBlock_StartIndex = input.index();

        BaseNode root_0 = null;

        pollenParser.braceOpen_return braceOpen272 =null;

        pollenParser.stmts_return stmts273 =null;

        pollenParser.braceClose_return braceClose274 =null;


        RewriteRuleSubtreeStream stream_stmts=new RewriteRuleSubtreeStream(adaptor,"rule stmts");
        RewriteRuleSubtreeStream stream_braceOpen=new RewriteRuleSubtreeStream(adaptor,"rule braceOpen");
        RewriteRuleSubtreeStream stream_braceClose=new RewriteRuleSubtreeStream(adaptor,"rule braceClose");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 76) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:612:2: ( braceOpen stmts braceClose -> ^( S_BLOCK stmts ) )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:612:4: braceOpen stmts braceClose
            {
            pushFollow(FOLLOW_braceOpen_in_stmtBlock3403);
            braceOpen272=braceOpen();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_braceOpen.add(braceOpen272.getTree());

            pushFollow(FOLLOW_stmts_in_stmtBlock3405);
            stmts273=stmts();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_stmts.add(stmts273.getTree());

            pushFollow(FOLLOW_braceClose_in_stmtBlock3407);
            braceClose274=braceClose();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_braceClose.add(braceClose274.getTree());

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
            // 612:32: -> ^( S_BLOCK stmts )
            {
                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:612:35: ^( S_BLOCK stmts )
                {
                BaseNode root_1 = (BaseNode)adaptor.nil();
                root_1 = (BaseNode)adaptor.becomeRoot(
                (BaseNode)adaptor.create(S_BLOCK, "S_BLOCK")
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
            if ( state.backtracking>0 ) { memoize(input, 76, stmtBlock_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "stmtBlock"


    public static class stmts_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stmts"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:614:1: stmts : ( ( stmt )+ | ( ( NL )* ) -> NIL );
    public final pollenParser.stmts_return stmts() throws RecognitionException {
        pollenParser.stmts_return retval = new pollenParser.stmts_return();
        retval.start = input.LT(1);

        int stmts_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom NL276=null;
        pollenParser.stmt_return stmt275 =null;


        BaseNode NL276_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 77) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:615:2: ( ( stmt )+ | ( ( NL )* ) -> NIL )
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( ((LA79_0 >= BIT_NOT && LA79_0 <= CHAR)||LA79_0==HEX_LIT||LA79_0==IDENT||LA79_0==INJECT||LA79_0==INT_LIT||LA79_0==LOG_NOT||LA79_0==OCT_LIT||LA79_0==REAL_LIT||LA79_0==STRING||LA79_0==128||LA79_0==132||(LA79_0 >= 134 && LA79_0 <= 135)||(LA79_0 >= 144 && LA79_0 <= 145)||(LA79_0 >= 149 && LA79_0 <= 152)||(LA79_0 >= 156 && LA79_0 <= 157)||LA79_0==159||(LA79_0 >= 166 && LA79_0 <= 168)||(LA79_0 >= 170 && LA79_0 <= 171)||(LA79_0 >= 175 && LA79_0 <= 177)||(LA79_0 >= 181 && LA79_0 <= 182)||LA79_0==185||LA79_0==187||(LA79_0 >= 189 && LA79_0 <= 192)||(LA79_0 >= 194 && LA79_0 <= 198)) ) {
                alt79=1;
            }
            else if ( (LA79_0==EOF||LA79_0==NL||LA79_0==153||LA79_0==158||LA79_0==202) ) {
                alt79=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 79, 0, input);

                throw nvae;

            }
            switch (alt79) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:615:4: ( stmt )+
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:615:4: ( stmt )+
                    int cnt77=0;
                    loop77:
                    do {
                        int alt77=2;
                        int LA77_0 = input.LA(1);

                        if ( ((LA77_0 >= BIT_NOT && LA77_0 <= CHAR)||LA77_0==HEX_LIT||LA77_0==IDENT||LA77_0==INJECT||LA77_0==INT_LIT||LA77_0==LOG_NOT||LA77_0==OCT_LIT||LA77_0==REAL_LIT||LA77_0==STRING||LA77_0==128||LA77_0==132||(LA77_0 >= 134 && LA77_0 <= 135)||(LA77_0 >= 144 && LA77_0 <= 145)||(LA77_0 >= 149 && LA77_0 <= 152)||(LA77_0 >= 156 && LA77_0 <= 157)||LA77_0==159||(LA77_0 >= 166 && LA77_0 <= 168)||(LA77_0 >= 170 && LA77_0 <= 171)||(LA77_0 >= 175 && LA77_0 <= 177)||(LA77_0 >= 181 && LA77_0 <= 182)||LA77_0==185||LA77_0==187||(LA77_0 >= 189 && LA77_0 <= 192)||(LA77_0 >= 194 && LA77_0 <= 198)) ) {
                            alt77=1;
                        }


                        switch (alt77) {
                    	case 1 :
                    	    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:615:5: stmt
                    	    {
                    	    pushFollow(FOLLOW_stmt_in_stmts3427);
                    	    stmt275=stmt();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmt275.getTree());

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
                    break;
                case 2 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:616:4: ( ( NL )* )
                    {
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:616:4: ( ( NL )* )
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:616:5: ( NL )*
                    {
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:616:5: ( NL )*
                    loop78:
                    do {
                        int alt78=2;
                        int LA78_0 = input.LA(1);

                        if ( (LA78_0==NL) ) {
                            int LA78_1 = input.LA(2);

                            if ( (synpred132_pollen()) ) {
                                alt78=1;
                            }


                        }


                        switch (alt78) {
                    	case 1 :
                    	    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:616:5: NL
                    	    {
                    	    NL276=(Atom)match(input,NL,FOLLOW_NL_in_stmts3435); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_NL.add(NL276);


                    	    }
                    	    break;

                    	default :
                    	    break loop78;
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
                    // 616:10: -> NIL
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
            if ( state.backtracking>0 ) { memoize(input, 77, stmts_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "stmts"


    public static class stmt_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stmt"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:618:1: stmt : ( stmtAssign delim | stmtAssert | stmtBind | stmtPrint | stmtReturn | stmtBreak | stmtContinue | stmtForEach | stmtFor | stmtSwitch | stmtDoWhile | stmtIf | stmtProvided | stmtWhile | varDeclaration | stmtInjection | expr delim );
    public final pollenParser.stmt_return stmt() throws RecognitionException {
        pollenParser.stmt_return retval = new pollenParser.stmt_return();
        retval.start = input.LT(1);

        int stmt_StartIndex = input.index();

        BaseNode root_0 = null;

        pollenParser.stmtAssign_return stmtAssign277 =null;

        pollenParser.delim_return delim278 =null;

        pollenParser.stmtAssert_return stmtAssert279 =null;

        pollenParser.stmtBind_return stmtBind280 =null;

        pollenParser.stmtPrint_return stmtPrint281 =null;

        pollenParser.stmtReturn_return stmtReturn282 =null;

        pollenParser.stmtBreak_return stmtBreak283 =null;

        pollenParser.stmtContinue_return stmtContinue284 =null;

        pollenParser.stmtForEach_return stmtForEach285 =null;

        pollenParser.stmtFor_return stmtFor286 =null;

        pollenParser.stmtSwitch_return stmtSwitch287 =null;

        pollenParser.stmtDoWhile_return stmtDoWhile288 =null;

        pollenParser.stmtIf_return stmtIf289 =null;

        pollenParser.stmtProvided_return stmtProvided290 =null;

        pollenParser.stmtWhile_return stmtWhile291 =null;

        pollenParser.varDeclaration_return varDeclaration292 =null;

        pollenParser.stmtInjection_return stmtInjection293 =null;

        pollenParser.expr_return expr294 =null;

        pollenParser.delim_return delim295 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 78) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:619:2: ( stmtAssign delim | stmtAssert | stmtBind | stmtPrint | stmtReturn | stmtBreak | stmtContinue | stmtForEach | stmtFor | stmtSwitch | stmtDoWhile | stmtIf | stmtProvided | stmtWhile | varDeclaration | stmtInjection | expr delim )
            int alt80=17;
            switch ( input.LA(1) ) {
            case IDENT:
            case 181:
                {
                int LA80_1 = input.LA(2);

                if ( (synpred133_pollen()) ) {
                    alt80=1;
                }
                else if ( (synpred135_pollen()) ) {
                    alt80=3;
                }
                else if ( (synpred147_pollen()) ) {
                    alt80=15;
                }
                else if ( (true) ) {
                    alt80=17;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 80, 1, input);

                    throw nvae;

                }
                }
                break;
            case 149:
                {
                alt80=2;
                }
                break;
            case INJECT:
                {
                int LA80_7 = input.LA(2);

                if ( (synpred133_pollen()) ) {
                    alt80=1;
                }
                else if ( (synpred148_pollen()) ) {
                    alt80=16;
                }
                else if ( (true) ) {
                    alt80=17;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 80, 7, input);

                    throw nvae;

                }
                }
                break;
            case 185:
                {
                alt80=4;
                }
                break;
            case 189:
                {
                alt80=5;
                }
                break;
            case 151:
                {
                alt80=6;
                }
                break;
            case 157:
                {
                alt80=7;
                }
                break;
            case 168:
                {
                alt80=8;
                }
                break;
            case 167:
                {
                alt80=9;
                }
                break;
            case 191:
                {
                alt80=10;
                }
                break;
            case 159:
                {
                alt80=11;
                }
                break;
            case 171:
                {
                alt80=12;
                }
                break;
            case 187:
                {
                alt80=13;
                }
                break;
            case 198:
                {
                alt80=14;
                }
                break;
            case 144:
                {
                int LA80_20 = input.LA(2);

                if ( (synpred133_pollen()) ) {
                    alt80=1;
                }
                else if ( (synpred135_pollen()) ) {
                    alt80=3;
                }
                else if ( (true) ) {
                    alt80=17;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 80, 20, input);

                    throw nvae;

                }
                }
                break;
            case 150:
            case 152:
            case 156:
            case 170:
            case 175:
            case 176:
            case 177:
            case 190:
            case 194:
            case 195:
            case 196:
            case 197:
                {
                alt80=15;
                }
                break;
            case BIT_NOT:
            case CHAR:
            case HEX_LIT:
            case INT_LIT:
            case LOG_NOT:
            case OCT_LIT:
            case REAL_LIT:
            case STRING:
            case 128:
            case 132:
            case 134:
            case 135:
            case 145:
            case 166:
            case 182:
            case 192:
                {
                alt80=17;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 80, 0, input);

                throw nvae;

            }

            switch (alt80) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:619:5: stmtAssign delim
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    pushFollow(FOLLOW_stmtAssign_in_stmt3452);
                    stmtAssign277=stmtAssign();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmtAssign277.getTree());

                    pushFollow(FOLLOW_delim_in_stmt3454);
                    delim278=delim();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, delim278.getTree());

                    }
                    break;
                case 2 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:620:4: stmtAssert
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    pushFollow(FOLLOW_stmtAssert_in_stmt3461);
                    stmtAssert279=stmtAssert();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmtAssert279.getTree());

                    }
                    break;
                case 3 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:621:4: stmtBind
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    pushFollow(FOLLOW_stmtBind_in_stmt3466);
                    stmtBind280=stmtBind();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmtBind280.getTree());

                    }
                    break;
                case 4 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:622:4: stmtPrint
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    pushFollow(FOLLOW_stmtPrint_in_stmt3471);
                    stmtPrint281=stmtPrint();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmtPrint281.getTree());

                    }
                    break;
                case 5 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:623:4: stmtReturn
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    pushFollow(FOLLOW_stmtReturn_in_stmt3476);
                    stmtReturn282=stmtReturn();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmtReturn282.getTree());

                    }
                    break;
                case 6 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:624:4: stmtBreak
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    pushFollow(FOLLOW_stmtBreak_in_stmt3481);
                    stmtBreak283=stmtBreak();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmtBreak283.getTree());

                    }
                    break;
                case 7 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:625:5: stmtContinue
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    pushFollow(FOLLOW_stmtContinue_in_stmt3487);
                    stmtContinue284=stmtContinue();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmtContinue284.getTree());

                    }
                    break;
                case 8 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:626:5: stmtForEach
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    pushFollow(FOLLOW_stmtForEach_in_stmt3493);
                    stmtForEach285=stmtForEach();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmtForEach285.getTree());

                    }
                    break;
                case 9 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:627:5: stmtFor
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    pushFollow(FOLLOW_stmtFor_in_stmt3499);
                    stmtFor286=stmtFor();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmtFor286.getTree());

                    }
                    break;
                case 10 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:628:4: stmtSwitch
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    pushFollow(FOLLOW_stmtSwitch_in_stmt3504);
                    stmtSwitch287=stmtSwitch();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmtSwitch287.getTree());

                    }
                    break;
                case 11 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:629:5: stmtDoWhile
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    pushFollow(FOLLOW_stmtDoWhile_in_stmt3510);
                    stmtDoWhile288=stmtDoWhile();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmtDoWhile288.getTree());

                    }
                    break;
                case 12 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:630:4: stmtIf
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    pushFollow(FOLLOW_stmtIf_in_stmt3515);
                    stmtIf289=stmtIf();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmtIf289.getTree());

                    }
                    break;
                case 13 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:631:4: stmtProvided
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    pushFollow(FOLLOW_stmtProvided_in_stmt3520);
                    stmtProvided290=stmtProvided();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmtProvided290.getTree());

                    }
                    break;
                case 14 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:632:4: stmtWhile
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    pushFollow(FOLLOW_stmtWhile_in_stmt3525);
                    stmtWhile291=stmtWhile();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmtWhile291.getTree());

                    }
                    break;
                case 15 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:633:4: varDeclaration
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    pushFollow(FOLLOW_varDeclaration_in_stmt3531);
                    varDeclaration292=varDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDeclaration292.getTree());

                    }
                    break;
                case 16 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:634:4: stmtInjection
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    pushFollow(FOLLOW_stmtInjection_in_stmt3537);
                    stmtInjection293=stmtInjection();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmtInjection293.getTree());

                    }
                    break;
                case 17 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:635:4: expr delim
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    pushFollow(FOLLOW_expr_in_stmt3542);
                    expr294=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr294.getTree());

                    pushFollow(FOLLOW_delim_in_stmt3544);
                    delim295=delim();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, delim295.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 78, stmt_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "stmt"


    public static class stmtAssign_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stmtAssign"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:637:1: stmtAssign : ( varOrFcnOrArray ASSIGN expr -> ^( S_ASSIGN varOrFcnOrArray ASSIGN expr ) | injectionCode ASSIGN expr -> ^( S_ASSIGN ^( INJECT_CODE injectionCode ) ASSIGN expr ) | varOrFcnOrArray assignOp expr -> ^( S_ASSIGN varOrFcnOrArray assignOp expr ) | injectionCode assignOp expr -> ^( S_ASSIGN ^( INJECT_CODE injectionCode ) assignOp expr ) );
    public final pollenParser.stmtAssign_return stmtAssign() throws RecognitionException {
        pollenParser.stmtAssign_return retval = new pollenParser.stmtAssign_return();
        retval.start = input.LT(1);

        int stmtAssign_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom ASSIGN297=null;
        Atom ASSIGN300=null;
        pollenParser.varOrFcnOrArray_return varOrFcnOrArray296 =null;

        pollenParser.expr_return expr298 =null;

        pollenParser.injectionCode_return injectionCode299 =null;

        pollenParser.expr_return expr301 =null;

        pollenParser.varOrFcnOrArray_return varOrFcnOrArray302 =null;

        pollenParser.assignOp_return assignOp303 =null;

        pollenParser.expr_return expr304 =null;

        pollenParser.injectionCode_return injectionCode305 =null;

        pollenParser.assignOp_return assignOp306 =null;

        pollenParser.expr_return expr307 =null;


        BaseNode ASSIGN297_tree=null;
        BaseNode ASSIGN300_tree=null;
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
        RewriteRuleSubtreeStream stream_assignOp=new RewriteRuleSubtreeStream(adaptor,"rule assignOp");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_injectionCode=new RewriteRuleSubtreeStream(adaptor,"rule injectionCode");
        RewriteRuleSubtreeStream stream_varOrFcnOrArray=new RewriteRuleSubtreeStream(adaptor,"rule varOrFcnOrArray");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 79) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:638:2: ( varOrFcnOrArray ASSIGN expr -> ^( S_ASSIGN varOrFcnOrArray ASSIGN expr ) | injectionCode ASSIGN expr -> ^( S_ASSIGN ^( INJECT_CODE injectionCode ) ASSIGN expr ) | varOrFcnOrArray assignOp expr -> ^( S_ASSIGN varOrFcnOrArray assignOp expr ) | injectionCode assignOp expr -> ^( S_ASSIGN ^( INJECT_CODE injectionCode ) assignOp expr ) )
            int alt81=4;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==IDENT||LA81_0==144||LA81_0==181) ) {
                int LA81_1 = input.LA(2);

                if ( (synpred149_pollen()) ) {
                    alt81=1;
                }
                else if ( (synpred151_pollen()) ) {
                    alt81=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 81, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA81_0==INJECT) ) {
                int LA81_4 = input.LA(2);

                if ( (synpred150_pollen()) ) {
                    alt81=2;
                }
                else if ( (true) ) {
                    alt81=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 81, 4, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 81, 0, input);

                throw nvae;

            }
            switch (alt81) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:638:4: varOrFcnOrArray ASSIGN expr
                    {
                    pushFollow(FOLLOW_varOrFcnOrArray_in_stmtAssign3554);
                    varOrFcnOrArray296=varOrFcnOrArray();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_varOrFcnOrArray.add(varOrFcnOrArray296.getTree());

                    ASSIGN297=(Atom)match(input,ASSIGN,FOLLOW_ASSIGN_in_stmtAssign3556); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ASSIGN.add(ASSIGN297);


                    pushFollow(FOLLOW_expr_in_stmtAssign3558);
                    expr298=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr298.getTree());

                    // AST REWRITE
                    // elements: ASSIGN, expr, varOrFcnOrArray
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (BaseNode)adaptor.nil();
                    // 638:32: -> ^( S_ASSIGN varOrFcnOrArray ASSIGN expr )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:638:35: ^( S_ASSIGN varOrFcnOrArray ASSIGN expr )
                        {
                        BaseNode root_1 = (BaseNode)adaptor.nil();
                        root_1 = (BaseNode)adaptor.becomeRoot(
                        (BaseNode)adaptor.create(S_ASSIGN, "S_ASSIGN")
                        , root_1);

                        adaptor.addChild(root_1, stream_varOrFcnOrArray.nextTree());

                        adaptor.addChild(root_1, 
                        stream_ASSIGN.nextNode()
                        );

                        adaptor.addChild(root_1, stream_expr.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:639:4: injectionCode ASSIGN expr
                    {
                    pushFollow(FOLLOW_injectionCode_in_stmtAssign3575);
                    injectionCode299=injectionCode();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_injectionCode.add(injectionCode299.getTree());

                    ASSIGN300=(Atom)match(input,ASSIGN,FOLLOW_ASSIGN_in_stmtAssign3577); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ASSIGN.add(ASSIGN300);


                    pushFollow(FOLLOW_expr_in_stmtAssign3579);
                    expr301=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr301.getTree());

                    // AST REWRITE
                    // elements: expr, injectionCode, ASSIGN
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (BaseNode)adaptor.nil();
                    // 639:31: -> ^( S_ASSIGN ^( INJECT_CODE injectionCode ) ASSIGN expr )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:639:34: ^( S_ASSIGN ^( INJECT_CODE injectionCode ) ASSIGN expr )
                        {
                        BaseNode root_1 = (BaseNode)adaptor.nil();
                        root_1 = (BaseNode)adaptor.becomeRoot(
                        (BaseNode)adaptor.create(S_ASSIGN, "S_ASSIGN")
                        , root_1);

                        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:639:45: ^( INJECT_CODE injectionCode )
                        {
                        BaseNode root_2 = (BaseNode)adaptor.nil();
                        root_2 = (BaseNode)adaptor.becomeRoot(
                        (BaseNode)adaptor.create(INJECT_CODE, "INJECT_CODE")
                        , root_2);

                        adaptor.addChild(root_2, stream_injectionCode.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_1, 
                        stream_ASSIGN.nextNode()
                        );

                        adaptor.addChild(root_1, stream_expr.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 3 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:640:4: varOrFcnOrArray assignOp expr
                    {
                    pushFollow(FOLLOW_varOrFcnOrArray_in_stmtAssign3601);
                    varOrFcnOrArray302=varOrFcnOrArray();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_varOrFcnOrArray.add(varOrFcnOrArray302.getTree());

                    pushFollow(FOLLOW_assignOp_in_stmtAssign3603);
                    assignOp303=assignOp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_assignOp.add(assignOp303.getTree());

                    pushFollow(FOLLOW_expr_in_stmtAssign3605);
                    expr304=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr304.getTree());

                    // AST REWRITE
                    // elements: assignOp, varOrFcnOrArray, expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (BaseNode)adaptor.nil();
                    // 640:35: -> ^( S_ASSIGN varOrFcnOrArray assignOp expr )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:640:38: ^( S_ASSIGN varOrFcnOrArray assignOp expr )
                        {
                        BaseNode root_1 = (BaseNode)adaptor.nil();
                        root_1 = (BaseNode)adaptor.becomeRoot(
                        (BaseNode)adaptor.create(S_ASSIGN, "S_ASSIGN")
                        , root_1);

                        adaptor.addChild(root_1, stream_varOrFcnOrArray.nextTree());

                        adaptor.addChild(root_1, stream_assignOp.nextTree());

                        adaptor.addChild(root_1, stream_expr.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 4 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:641:4: injectionCode assignOp expr
                    {
                    pushFollow(FOLLOW_injectionCode_in_stmtAssign3623);
                    injectionCode305=injectionCode();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_injectionCode.add(injectionCode305.getTree());

                    pushFollow(FOLLOW_assignOp_in_stmtAssign3625);
                    assignOp306=assignOp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_assignOp.add(assignOp306.getTree());

                    pushFollow(FOLLOW_expr_in_stmtAssign3627);
                    expr307=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr307.getTree());

                    // AST REWRITE
                    // elements: assignOp, expr, injectionCode
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (BaseNode)adaptor.nil();
                    // 641:32: -> ^( S_ASSIGN ^( INJECT_CODE injectionCode ) assignOp expr )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:641:35: ^( S_ASSIGN ^( INJECT_CODE injectionCode ) assignOp expr )
                        {
                        BaseNode root_1 = (BaseNode)adaptor.nil();
                        root_1 = (BaseNode)adaptor.becomeRoot(
                        (BaseNode)adaptor.create(S_ASSIGN, "S_ASSIGN")
                        , root_1);

                        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:641:46: ^( INJECT_CODE injectionCode )
                        {
                        BaseNode root_2 = (BaseNode)adaptor.nil();
                        root_2 = (BaseNode)adaptor.becomeRoot(
                        (BaseNode)adaptor.create(INJECT_CODE, "INJECT_CODE")
                        , root_2);

                        adaptor.addChild(root_2, stream_injectionCode.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_1, stream_assignOp.nextTree());

                        adaptor.addChild(root_1, stream_expr.nextTree());

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
            if ( state.backtracking>0 ) { memoize(input, 79, stmtAssign_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "stmtAssign"


    public static class stmtAssert_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stmtAssert"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:643:1: stmtAssert : 'assert' exprList delim -> ^( S_ASSERT exprList ) ;
    public final pollenParser.stmtAssert_return stmtAssert() throws RecognitionException {
        pollenParser.stmtAssert_return retval = new pollenParser.stmtAssert_return();
        retval.start = input.LT(1);

        int stmtAssert_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom string_literal308=null;
        pollenParser.exprList_return exprList309 =null;

        pollenParser.delim_return delim310 =null;


        BaseNode string_literal308_tree=null;
        RewriteRuleTokenStream stream_149=new RewriteRuleTokenStream(adaptor,"token 149");
        RewriteRuleSubtreeStream stream_delim=new RewriteRuleSubtreeStream(adaptor,"rule delim");
        RewriteRuleSubtreeStream stream_exprList=new RewriteRuleSubtreeStream(adaptor,"rule exprList");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 80) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:644:2: ( 'assert' exprList delim -> ^( S_ASSERT exprList ) )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:644:4: 'assert' exprList delim
            {
            string_literal308=(Atom)match(input,149,FOLLOW_149_in_stmtAssert3653); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_149.add(string_literal308);


            pushFollow(FOLLOW_exprList_in_stmtAssert3655);
            exprList309=exprList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_exprList.add(exprList309.getTree());

            pushFollow(FOLLOW_delim_in_stmtAssert3657);
            delim310=delim();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_delim.add(delim310.getTree());

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
            // 644:28: -> ^( S_ASSERT exprList )
            {
                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:644:31: ^( S_ASSERT exprList )
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
            if ( state.backtracking>0 ) { memoize(input, 80, stmtAssert_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "stmtAssert"


    public static class stmtBind_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stmtBind"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:646:1: stmtBind : varOrFcnOrArray BIND expr delim -> ^( S_BIND varOrFcnOrArray expr ) ;
    public final pollenParser.stmtBind_return stmtBind() throws RecognitionException {
        pollenParser.stmtBind_return retval = new pollenParser.stmtBind_return();
        retval.start = input.LT(1);

        int stmtBind_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom BIND312=null;
        pollenParser.varOrFcnOrArray_return varOrFcnOrArray311 =null;

        pollenParser.expr_return expr313 =null;

        pollenParser.delim_return delim314 =null;


        BaseNode BIND312_tree=null;
        RewriteRuleTokenStream stream_BIND=new RewriteRuleTokenStream(adaptor,"token BIND");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_varOrFcnOrArray=new RewriteRuleSubtreeStream(adaptor,"rule varOrFcnOrArray");
        RewriteRuleSubtreeStream stream_delim=new RewriteRuleSubtreeStream(adaptor,"rule delim");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 81) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:647:2: ( varOrFcnOrArray BIND expr delim -> ^( S_BIND varOrFcnOrArray expr ) )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:647:4: varOrFcnOrArray BIND expr delim
            {
            pushFollow(FOLLOW_varOrFcnOrArray_in_stmtBind3675);
            varOrFcnOrArray311=varOrFcnOrArray();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_varOrFcnOrArray.add(varOrFcnOrArray311.getTree());

            BIND312=(Atom)match(input,BIND,FOLLOW_BIND_in_stmtBind3677); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_BIND.add(BIND312);


            pushFollow(FOLLOW_expr_in_stmtBind3680);
            expr313=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr313.getTree());

            pushFollow(FOLLOW_delim_in_stmtBind3683);
            delim314=delim();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_delim.add(delim314.getTree());

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
            // 647:38: -> ^( S_BIND varOrFcnOrArray expr )
            {
                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:647:41: ^( S_BIND varOrFcnOrArray expr )
                {
                BaseNode root_1 = (BaseNode)adaptor.nil();
                root_1 = (BaseNode)adaptor.becomeRoot(
                (BaseNode)adaptor.create(S_BIND, "S_BIND")
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
            if ( state.backtracking>0 ) { memoize(input, 81, stmtBind_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "stmtBind"


    public static class stmtPrint_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stmtPrint"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:649:1: stmtPrint : 'print' ( stmtPrintTarget )? exprList -> ^( S_PRINT ( stmtPrintTarget )? exprList ) ;
    public final pollenParser.stmtPrint_return stmtPrint() throws RecognitionException {
        pollenParser.stmtPrint_return retval = new pollenParser.stmtPrint_return();
        retval.start = input.LT(1);

        int stmtPrint_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom string_literal315=null;
        pollenParser.stmtPrintTarget_return stmtPrintTarget316 =null;

        pollenParser.exprList_return exprList317 =null;


        BaseNode string_literal315_tree=null;
        RewriteRuleTokenStream stream_185=new RewriteRuleTokenStream(adaptor,"token 185");
        RewriteRuleSubtreeStream stream_stmtPrintTarget=new RewriteRuleSubtreeStream(adaptor,"rule stmtPrintTarget");
        RewriteRuleSubtreeStream stream_exprList=new RewriteRuleSubtreeStream(adaptor,"rule exprList");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 82) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:650:2: ( 'print' ( stmtPrintTarget )? exprList -> ^( S_PRINT ( stmtPrintTarget )? exprList ) )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:650:4: 'print' ( stmtPrintTarget )? exprList
            {
            string_literal315=(Atom)match(input,185,FOLLOW_185_in_stmtPrint3705); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_185.add(string_literal315);


            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:650:12: ( stmtPrintTarget )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==163||LA82_0==178||LA82_0==183) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:650:13: stmtPrintTarget
                    {
                    pushFollow(FOLLOW_stmtPrintTarget_in_stmtPrint3708);
                    stmtPrintTarget316=stmtPrintTarget();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_stmtPrintTarget.add(stmtPrintTarget316.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_exprList_in_stmtPrint3712);
            exprList317=exprList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_exprList.add(exprList317.getTree());

            // AST REWRITE
            // elements: exprList, stmtPrintTarget
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (BaseNode)adaptor.nil();
            // 651:3: -> ^( S_PRINT ( stmtPrintTarget )? exprList )
            {
                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:651:6: ^( S_PRINT ( stmtPrintTarget )? exprList )
                {
                BaseNode root_1 = (BaseNode)adaptor.nil();
                root_1 = (BaseNode)adaptor.becomeRoot(
                (BaseNode)adaptor.create(S_PRINT, "S_PRINT")
                , root_1);

                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:651:16: ( stmtPrintTarget )?
                if ( stream_stmtPrintTarget.hasNext() ) {
                    adaptor.addChild(root_1, stream_stmtPrintTarget.nextTree());

                }
                stream_stmtPrintTarget.reset();

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
            if ( state.backtracking>0 ) { memoize(input, 82, stmtPrint_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "stmtPrint"


    public static class stmtPrintTarget_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stmtPrintTarget"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:653:1: stmtPrintTarget : ( 'log' | 'err' | 'out' ) ;
    public final pollenParser.stmtPrintTarget_return stmtPrintTarget() throws RecognitionException {
        pollenParser.stmtPrintTarget_return retval = new pollenParser.stmtPrintTarget_return();
        retval.start = input.LT(1);

        int stmtPrintTarget_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom set318=null;

        BaseNode set318_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 83) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:654:2: ( ( 'log' | 'err' | 'out' ) )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:
            {
            root_0 = (BaseNode)adaptor.nil();


            set318=(Atom)input.LT(1);

            if ( input.LA(1)==163||input.LA(1)==178||input.LA(1)==183 ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (BaseNode)adaptor.create(set318)
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
            if ( state.backtracking>0 ) { memoize(input, 83, stmtPrintTarget_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "stmtPrintTarget"


    public static class stmtReturn_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stmtReturn"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:656:1: stmtReturn : ( 'return' ( '(' ) ( expr ( ',' expr )+ ) ( ')' ) delim -> ^( S_RETURN ( expr )+ ) | 'return' ( expr ) delim -> ^( S_RETURN expr ) );
    public final pollenParser.stmtReturn_return stmtReturn() throws RecognitionException {
        pollenParser.stmtReturn_return retval = new pollenParser.stmtReturn_return();
        retval.start = input.LT(1);

        int stmtReturn_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom string_literal319=null;
        Atom char_literal320=null;
        Atom char_literal322=null;
        Atom char_literal324=null;
        Atom string_literal326=null;
        pollenParser.expr_return expr321 =null;

        pollenParser.expr_return expr323 =null;

        pollenParser.delim_return delim325 =null;

        pollenParser.expr_return expr327 =null;

        pollenParser.delim_return delim328 =null;


        BaseNode string_literal319_tree=null;
        BaseNode char_literal320_tree=null;
        BaseNode char_literal322_tree=null;
        BaseNode char_literal324_tree=null;
        BaseNode string_literal326_tree=null;
        RewriteRuleTokenStream stream_133=new RewriteRuleTokenStream(adaptor,"token 133");
        RewriteRuleTokenStream stream_128=new RewriteRuleTokenStream(adaptor,"token 128");
        RewriteRuleTokenStream stream_189=new RewriteRuleTokenStream(adaptor,"token 189");
        RewriteRuleTokenStream stream_129=new RewriteRuleTokenStream(adaptor,"token 129");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_delim=new RewriteRuleSubtreeStream(adaptor,"rule delim");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 84) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:659:2: ( 'return' ( '(' ) ( expr ( ',' expr )+ ) ( ')' ) delim -> ^( S_RETURN ( expr )+ ) | 'return' ( expr ) delim -> ^( S_RETURN expr ) )
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==189) ) {
                int LA84_1 = input.LA(2);

                if ( (synpred156_pollen()) ) {
                    alt84=1;
                }
                else if ( (true) ) {
                    alt84=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 84, 1, input);

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
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:659:4: 'return' ( '(' ) ( expr ( ',' expr )+ ) ( ')' ) delim
                    {
                    string_literal319=(Atom)match(input,189,FOLLOW_189_in_stmtReturn3758); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_189.add(string_literal319);


                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:659:13: ( '(' )
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:659:14: '('
                    {
                    char_literal320=(Atom)match(input,128,FOLLOW_128_in_stmtReturn3761); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_128.add(char_literal320);


                    }


                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:659:19: ( expr ( ',' expr )+ )
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:659:20: expr ( ',' expr )+
                    {
                    pushFollow(FOLLOW_expr_in_stmtReturn3765);
                    expr321=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr321.getTree());

                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:659:25: ( ',' expr )+
                    int cnt83=0;
                    loop83:
                    do {
                        int alt83=2;
                        int LA83_0 = input.LA(1);

                        if ( (LA83_0==133) ) {
                            alt83=1;
                        }


                        switch (alt83) {
                    	case 1 :
                    	    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:659:26: ',' expr
                    	    {
                    	    char_literal322=(Atom)match(input,133,FOLLOW_133_in_stmtReturn3768); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_133.add(char_literal322);


                    	    pushFollow(FOLLOW_expr_in_stmtReturn3770);
                    	    expr323=expr();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_expr.add(expr323.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt83 >= 1 ) break loop83;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(83, input);
                                throw eee;
                        }
                        cnt83++;
                    } while (true);


                    }


                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:659:38: ( ')' )
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:659:39: ')'
                    {
                    char_literal324=(Atom)match(input,129,FOLLOW_129_in_stmtReturn3776); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_129.add(char_literal324);


                    }


                    pushFollow(FOLLOW_delim_in_stmtReturn3779);
                    delim325=delim();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_delim.add(delim325.getTree());

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
                    // 659:50: -> ^( S_RETURN ( expr )+ )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:659:53: ^( S_RETURN ( expr )+ )
                        {
                        BaseNode root_1 = (BaseNode)adaptor.nil();
                        root_1 = (BaseNode)adaptor.becomeRoot(
                        (BaseNode)adaptor.create(S_RETURN, "S_RETURN")
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
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:660:4: 'return' ( expr ) delim
                    {
                    string_literal326=(Atom)match(input,189,FOLLOW_189_in_stmtReturn3793); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_189.add(string_literal326);


                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:660:14: ( expr )
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:660:15: expr
                    {
                    pushFollow(FOLLOW_expr_in_stmtReturn3797);
                    expr327=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr327.getTree());

                    }


                    pushFollow(FOLLOW_delim_in_stmtReturn3801);
                    delim328=delim();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_delim.add(delim328.getTree());

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
                    // 660:28: -> ^( S_RETURN expr )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:660:31: ^( S_RETURN expr )
                        {
                        BaseNode root_1 = (BaseNode)adaptor.nil();
                        root_1 = (BaseNode)adaptor.becomeRoot(
                        (BaseNode)adaptor.create(S_RETURN, "S_RETURN")
                        , root_1);

                        adaptor.addChild(root_1, stream_expr.nextTree());

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
            if ( state.backtracking>0 ) { memoize(input, 84, stmtReturn_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "stmtReturn"


    public static class stmtBreak_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stmtBreak"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:662:1: stmtBreak : 'break' delim -> ^( S_BREAK ) ;
    public final pollenParser.stmtBreak_return stmtBreak() throws RecognitionException {
        pollenParser.stmtBreak_return retval = new pollenParser.stmtBreak_return();
        retval.start = input.LT(1);

        int stmtBreak_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom string_literal329=null;
        pollenParser.delim_return delim330 =null;


        BaseNode string_literal329_tree=null;
        RewriteRuleTokenStream stream_151=new RewriteRuleTokenStream(adaptor,"token 151");
        RewriteRuleSubtreeStream stream_delim=new RewriteRuleSubtreeStream(adaptor,"rule delim");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 85) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:663:2: ( 'break' delim -> ^( S_BREAK ) )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:663:4: 'break' delim
            {
            string_literal329=(Atom)match(input,151,FOLLOW_151_in_stmtBreak3819); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_151.add(string_literal329);


            pushFollow(FOLLOW_delim_in_stmtBreak3821);
            delim330=delim();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_delim.add(delim330.getTree());

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
            // 663:18: -> ^( S_BREAK )
            {
                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:663:21: ^( S_BREAK )
                {
                BaseNode root_1 = (BaseNode)adaptor.nil();
                root_1 = (BaseNode)adaptor.becomeRoot(
                (BaseNode)adaptor.create(S_BREAK, "S_BREAK")
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
            if ( state.backtracking>0 ) { memoize(input, 85, stmtBreak_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "stmtBreak"


    public static class stmtContinue_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stmtContinue"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:665:1: stmtContinue : 'continue' delim -> ^( S_CONTINUE ) ;
    public final pollenParser.stmtContinue_return stmtContinue() throws RecognitionException {
        pollenParser.stmtContinue_return retval = new pollenParser.stmtContinue_return();
        retval.start = input.LT(1);

        int stmtContinue_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom string_literal331=null;
        pollenParser.delim_return delim332 =null;


        BaseNode string_literal331_tree=null;
        RewriteRuleTokenStream stream_157=new RewriteRuleTokenStream(adaptor,"token 157");
        RewriteRuleSubtreeStream stream_delim=new RewriteRuleSubtreeStream(adaptor,"rule delim");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 86) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:666:2: ( 'continue' delim -> ^( S_CONTINUE ) )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:666:4: 'continue' delim
            {
            string_literal331=(Atom)match(input,157,FOLLOW_157_in_stmtContinue3837); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_157.add(string_literal331);


            pushFollow(FOLLOW_delim_in_stmtContinue3839);
            delim332=delim();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_delim.add(delim332.getTree());

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
            // 666:21: -> ^( S_CONTINUE )
            {
                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:666:24: ^( S_CONTINUE )
                {
                BaseNode root_1 = (BaseNode)adaptor.nil();
                root_1 = (BaseNode)adaptor.becomeRoot(
                (BaseNode)adaptor.create(S_CONTINUE, "S_CONTINUE")
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
            if ( state.backtracking>0 ) { memoize(input, 86, stmtContinue_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "stmtContinue"


    public static class stmtFor_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stmtFor"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:668:1: stmtFor : 'for' '(' stmtForInit SEMI stmtForCond SEMI stmtForNext ')' stmtBlock -> ^( S_FOR stmtForInit stmtForCond stmtForNext stmtBlock ) ;
    public final pollenParser.stmtFor_return stmtFor() throws RecognitionException {
        pollenParser.stmtFor_return retval = new pollenParser.stmtFor_return();
        retval.start = input.LT(1);

        int stmtFor_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom string_literal333=null;
        Atom char_literal334=null;
        Atom SEMI336=null;
        Atom SEMI338=null;
        Atom char_literal340=null;
        pollenParser.stmtForInit_return stmtForInit335 =null;

        pollenParser.stmtForCond_return stmtForCond337 =null;

        pollenParser.stmtForNext_return stmtForNext339 =null;

        pollenParser.stmtBlock_return stmtBlock341 =null;


        BaseNode string_literal333_tree=null;
        BaseNode char_literal334_tree=null;
        BaseNode SEMI336_tree=null;
        BaseNode SEMI338_tree=null;
        BaseNode char_literal340_tree=null;
        RewriteRuleTokenStream stream_128=new RewriteRuleTokenStream(adaptor,"token 128");
        RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
        RewriteRuleTokenStream stream_129=new RewriteRuleTokenStream(adaptor,"token 129");
        RewriteRuleTokenStream stream_167=new RewriteRuleTokenStream(adaptor,"token 167");
        RewriteRuleSubtreeStream stream_stmtForCond=new RewriteRuleSubtreeStream(adaptor,"rule stmtForCond");
        RewriteRuleSubtreeStream stream_stmtForInit=new RewriteRuleSubtreeStream(adaptor,"rule stmtForInit");
        RewriteRuleSubtreeStream stream_stmtBlock=new RewriteRuleSubtreeStream(adaptor,"rule stmtBlock");
        RewriteRuleSubtreeStream stream_stmtForNext=new RewriteRuleSubtreeStream(adaptor,"rule stmtForNext");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 87) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:669:5: ( 'for' '(' stmtForInit SEMI stmtForCond SEMI stmtForNext ')' stmtBlock -> ^( S_FOR stmtForInit stmtForCond stmtForNext stmtBlock ) )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:669:9: 'for' '(' stmtForInit SEMI stmtForCond SEMI stmtForNext ')' stmtBlock
            {
            string_literal333=(Atom)match(input,167,FOLLOW_167_in_stmtFor3860); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_167.add(string_literal333);


            char_literal334=(Atom)match(input,128,FOLLOW_128_in_stmtFor3862); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_128.add(char_literal334);


            pushFollow(FOLLOW_stmtForInit_in_stmtFor3864);
            stmtForInit335=stmtForInit();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_stmtForInit.add(stmtForInit335.getTree());

            SEMI336=(Atom)match(input,SEMI,FOLLOW_SEMI_in_stmtFor3866); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SEMI.add(SEMI336);


            pushFollow(FOLLOW_stmtForCond_in_stmtFor3868);
            stmtForCond337=stmtForCond();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_stmtForCond.add(stmtForCond337.getTree());

            SEMI338=(Atom)match(input,SEMI,FOLLOW_SEMI_in_stmtFor3870); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SEMI.add(SEMI338);


            pushFollow(FOLLOW_stmtForNext_in_stmtFor3872);
            stmtForNext339=stmtForNext();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_stmtForNext.add(stmtForNext339.getTree());

            char_literal340=(Atom)match(input,129,FOLLOW_129_in_stmtFor3874); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_129.add(char_literal340);


            pushFollow(FOLLOW_stmtBlock_in_stmtFor3876);
            stmtBlock341=stmtBlock();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_stmtBlock.add(stmtBlock341.getTree());

            // AST REWRITE
            // elements: stmtForNext, stmtForCond, stmtForInit, stmtBlock
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (BaseNode)adaptor.nil();
            // 670:13: -> ^( S_FOR stmtForInit stmtForCond stmtForNext stmtBlock )
            {
                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:670:16: ^( S_FOR stmtForInit stmtForCond stmtForNext stmtBlock )
                {
                BaseNode root_1 = (BaseNode)adaptor.nil();
                root_1 = (BaseNode)adaptor.becomeRoot(
                (BaseNode)adaptor.create(S_FOR, "S_FOR")
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
            if ( state.backtracking>0 ) { memoize(input, 87, stmtFor_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "stmtFor"


    public static class stmtForCond_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stmtForCond"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:672:1: stmtForCond : ( -> NIL | expr );
    public final pollenParser.stmtForCond_return stmtForCond() throws RecognitionException {
        pollenParser.stmtForCond_return retval = new pollenParser.stmtForCond_return();
        retval.start = input.LT(1);

        int stmtForCond_StartIndex = input.index();

        BaseNode root_0 = null;

        pollenParser.expr_return expr342 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 88) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:673:5: ( -> NIL | expr )
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==SEMI) ) {
                alt85=1;
            }
            else if ( ((LA85_0 >= BIT_NOT && LA85_0 <= CHAR)||LA85_0==HEX_LIT||LA85_0==IDENT||LA85_0==INJECT||LA85_0==INT_LIT||LA85_0==LOG_NOT||LA85_0==OCT_LIT||LA85_0==REAL_LIT||LA85_0==STRING||LA85_0==128||LA85_0==132||(LA85_0 >= 134 && LA85_0 <= 135)||(LA85_0 >= 144 && LA85_0 <= 145)||LA85_0==166||(LA85_0 >= 181 && LA85_0 <= 182)||LA85_0==192) ) {
                alt85=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 85, 0, input);

                throw nvae;

            }
            switch (alt85) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:674:12: 
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
                    // 674:12: -> NIL
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
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:675:9: expr
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    pushFollow(FOLLOW_expr_in_stmtForCond3944);
                    expr342=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr342.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 88, stmtForCond_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "stmtForCond"


    public static class stmtForInit_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stmtForInit"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:678:1: stmtForInit : ( -> NIL | typeName IDENT '=' expr -> ^( S_DECL ^( typeName IDENT expr ) ) | stmtAssign );
    public final pollenParser.stmtForInit_return stmtForInit() throws RecognitionException {
        pollenParser.stmtForInit_return retval = new pollenParser.stmtForInit_return();
        retval.start = input.LT(1);

        int stmtForInit_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom IDENT344=null;
        Atom char_literal345=null;
        pollenParser.typeName_return typeName343 =null;

        pollenParser.expr_return expr346 =null;

        pollenParser.stmtAssign_return stmtAssign347 =null;


        BaseNode IDENT344_tree=null;
        BaseNode char_literal345_tree=null;
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
        RewriteRuleSubtreeStream stream_typeName=new RewriteRuleSubtreeStream(adaptor,"rule typeName");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 89) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:679:5: ( -> NIL | typeName IDENT '=' expr -> ^( S_DECL ^( typeName IDENT expr ) ) | stmtAssign )
            int alt86=3;
            switch ( input.LA(1) ) {
            case SEMI:
                {
                alt86=1;
                }
                break;
            case IDENT:
                {
                int LA86_2 = input.LA(2);

                if ( (synpred159_pollen()) ) {
                    alt86=2;
                }
                else if ( (true) ) {
                    alt86=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 86, 2, input);

                    throw nvae;

                }
                }
                break;
            case 150:
            case 152:
            case 175:
            case 176:
            case 177:
            case 190:
            case 194:
            case 195:
            case 196:
                {
                alt86=2;
                }
                break;
            case INJECT:
            case 144:
            case 181:
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
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:680:13: 
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
                    // 680:13: -> NIL
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
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:681:9: typeName IDENT '=' expr
                    {
                    pushFollow(FOLLOW_typeName_in_stmtForInit3988);
                    typeName343=typeName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeName.add(typeName343.getTree());

                    IDENT344=(Atom)match(input,IDENT,FOLLOW_IDENT_in_stmtForInit3990); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENT.add(IDENT344);


                    char_literal345=(Atom)match(input,ASSIGN,FOLLOW_ASSIGN_in_stmtForInit3992); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ASSIGN.add(char_literal345);


                    pushFollow(FOLLOW_expr_in_stmtForInit3994);
                    expr346=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr346.getTree());

                    // AST REWRITE
                    // elements: IDENT, typeName, expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (BaseNode)adaptor.nil();
                    // 682:13: -> ^( S_DECL ^( typeName IDENT expr ) )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:682:16: ^( S_DECL ^( typeName IDENT expr ) )
                        {
                        BaseNode root_1 = (BaseNode)adaptor.nil();
                        root_1 = (BaseNode)adaptor.becomeRoot(
                        (BaseNode)adaptor.create(S_DECL, "S_DECL")
                        , root_1);

                        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:682:25: ^( typeName IDENT expr )
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
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:683:9: stmtAssign
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    pushFollow(FOLLOW_stmtAssign_in_stmtForInit4031);
                    stmtAssign347=stmtAssign();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmtAssign347.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 89, stmtForInit_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "stmtForInit"


    public static class stmtForNext_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stmtForNext"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:685:1: stmtForNext : ( -> NIL | expr );
    public final pollenParser.stmtForNext_return stmtForNext() throws RecognitionException {
        pollenParser.stmtForNext_return retval = new pollenParser.stmtForNext_return();
        retval.start = input.LT(1);

        int stmtForNext_StartIndex = input.index();

        BaseNode root_0 = null;

        pollenParser.expr_return expr348 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 90) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:686:5: ( -> NIL | expr )
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==129) ) {
                alt87=1;
            }
            else if ( ((LA87_0 >= BIT_NOT && LA87_0 <= CHAR)||LA87_0==HEX_LIT||LA87_0==IDENT||LA87_0==INJECT||LA87_0==INT_LIT||LA87_0==LOG_NOT||LA87_0==OCT_LIT||LA87_0==REAL_LIT||LA87_0==STRING||LA87_0==128||LA87_0==132||(LA87_0 >= 134 && LA87_0 <= 135)||(LA87_0 >= 144 && LA87_0 <= 145)||LA87_0==166||(LA87_0 >= 181 && LA87_0 <= 182)||LA87_0==192) ) {
                alt87=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 87, 0, input);

                throw nvae;

            }
            switch (alt87) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:687:13: 
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
                    // 687:13: -> NIL
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
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:688:9: expr
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    pushFollow(FOLLOW_expr_in_stmtForNext4074);
                    expr348=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr348.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 90, stmtForNext_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "stmtForNext"


    public static class stmtForEach_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stmtForEach"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:690:1: stmtForEach : 'foreach' '(' IDENT 'in' expr ')' stmtBlock -> ^( S_FOREACH IDENT ^( E_IDENT expr ) stmtBlock ) ;
    public final pollenParser.stmtForEach_return stmtForEach() throws RecognitionException {
        pollenParser.stmtForEach_return retval = new pollenParser.stmtForEach_return();
        retval.start = input.LT(1);

        int stmtForEach_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom string_literal349=null;
        Atom char_literal350=null;
        Atom IDENT351=null;
        Atom string_literal352=null;
        Atom char_literal354=null;
        pollenParser.expr_return expr353 =null;

        pollenParser.stmtBlock_return stmtBlock355 =null;


        BaseNode string_literal349_tree=null;
        BaseNode char_literal350_tree=null;
        BaseNode IDENT351_tree=null;
        BaseNode string_literal352_tree=null;
        BaseNode char_literal354_tree=null;
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleTokenStream stream_128=new RewriteRuleTokenStream(adaptor,"token 128");
        RewriteRuleTokenStream stream_174=new RewriteRuleTokenStream(adaptor,"token 174");
        RewriteRuleTokenStream stream_129=new RewriteRuleTokenStream(adaptor,"token 129");
        RewriteRuleTokenStream stream_168=new RewriteRuleTokenStream(adaptor,"token 168");
        RewriteRuleSubtreeStream stream_stmtBlock=new RewriteRuleSubtreeStream(adaptor,"rule stmtBlock");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 91) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:691:2: ( 'foreach' '(' IDENT 'in' expr ')' stmtBlock -> ^( S_FOREACH IDENT ^( E_IDENT expr ) stmtBlock ) )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:691:4: 'foreach' '(' IDENT 'in' expr ')' stmtBlock
            {
            string_literal349=(Atom)match(input,168,FOLLOW_168_in_stmtForEach4087); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_168.add(string_literal349);


            char_literal350=(Atom)match(input,128,FOLLOW_128_in_stmtForEach4089); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_128.add(char_literal350);


            IDENT351=(Atom)match(input,IDENT,FOLLOW_IDENT_in_stmtForEach4091); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENT.add(IDENT351);


            string_literal352=(Atom)match(input,174,FOLLOW_174_in_stmtForEach4093); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_174.add(string_literal352);


            pushFollow(FOLLOW_expr_in_stmtForEach4095);
            expr353=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr353.getTree());

            char_literal354=(Atom)match(input,129,FOLLOW_129_in_stmtForEach4097); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_129.add(char_literal354);


            pushFollow(FOLLOW_stmtBlock_in_stmtForEach4099);
            stmtBlock355=stmtBlock();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_stmtBlock.add(stmtBlock355.getTree());

            // AST REWRITE
            // elements: expr, IDENT, stmtBlock
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (BaseNode)adaptor.nil();
            // 691:48: -> ^( S_FOREACH IDENT ^( E_IDENT expr ) stmtBlock )
            {
                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:691:51: ^( S_FOREACH IDENT ^( E_IDENT expr ) stmtBlock )
                {
                BaseNode root_1 = (BaseNode)adaptor.nil();
                root_1 = (BaseNode)adaptor.becomeRoot(
                (BaseNode)adaptor.create(S_FOREACH, "S_FOREACH")
                , root_1);

                adaptor.addChild(root_1, 
                stream_IDENT.nextNode()
                );

                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:691:69: ^( E_IDENT expr )
                {
                BaseNode root_2 = (BaseNode)adaptor.nil();
                root_2 = (BaseNode)adaptor.becomeRoot(
                (BaseNode)adaptor.create(E_IDENT, "E_IDENT")
                , root_2);

                adaptor.addChild(root_2, stream_expr.nextTree());

                adaptor.addChild(root_1, root_2);
                }

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
            if ( state.backtracking>0 ) { memoize(input, 91, stmtForEach_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "stmtForEach"


    public static class stmtSwitch_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stmtSwitch"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:693:1: stmtSwitch : 'switch' '(' expr ')' braceOpen stmtsCase braceClose -> ^( S_SWITCH ^( E_COND expr ) stmtsCase ) ;
    public final pollenParser.stmtSwitch_return stmtSwitch() throws RecognitionException {
        pollenParser.stmtSwitch_return retval = new pollenParser.stmtSwitch_return();
        retval.start = input.LT(1);

        int stmtSwitch_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom string_literal356=null;
        Atom char_literal357=null;
        Atom char_literal359=null;
        pollenParser.expr_return expr358 =null;

        pollenParser.braceOpen_return braceOpen360 =null;

        pollenParser.stmtsCase_return stmtsCase361 =null;

        pollenParser.braceClose_return braceClose362 =null;


        BaseNode string_literal356_tree=null;
        BaseNode char_literal357_tree=null;
        BaseNode char_literal359_tree=null;
        RewriteRuleTokenStream stream_128=new RewriteRuleTokenStream(adaptor,"token 128");
        RewriteRuleTokenStream stream_129=new RewriteRuleTokenStream(adaptor,"token 129");
        RewriteRuleTokenStream stream_191=new RewriteRuleTokenStream(adaptor,"token 191");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_stmtsCase=new RewriteRuleSubtreeStream(adaptor,"rule stmtsCase");
        RewriteRuleSubtreeStream stream_braceOpen=new RewriteRuleSubtreeStream(adaptor,"rule braceOpen");
        RewriteRuleSubtreeStream stream_braceClose=new RewriteRuleSubtreeStream(adaptor,"rule braceClose");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 92) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:694:2: ( 'switch' '(' expr ')' braceOpen stmtsCase braceClose -> ^( S_SWITCH ^( E_COND expr ) stmtsCase ) )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:694:4: 'switch' '(' expr ')' braceOpen stmtsCase braceClose
            {
            string_literal356=(Atom)match(input,191,FOLLOW_191_in_stmtSwitch4125); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_191.add(string_literal356);


            char_literal357=(Atom)match(input,128,FOLLOW_128_in_stmtSwitch4127); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_128.add(char_literal357);


            pushFollow(FOLLOW_expr_in_stmtSwitch4129);
            expr358=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr358.getTree());

            char_literal359=(Atom)match(input,129,FOLLOW_129_in_stmtSwitch4131); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_129.add(char_literal359);


            pushFollow(FOLLOW_braceOpen_in_stmtSwitch4133);
            braceOpen360=braceOpen();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_braceOpen.add(braceOpen360.getTree());

            pushFollow(FOLLOW_stmtsCase_in_stmtSwitch4135);
            stmtsCase361=stmtsCase();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_stmtsCase.add(stmtsCase361.getTree());

            pushFollow(FOLLOW_braceClose_in_stmtSwitch4137);
            braceClose362=braceClose();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_braceClose.add(braceClose362.getTree());

            // AST REWRITE
            // elements: expr, stmtsCase
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (BaseNode)adaptor.nil();
            // 694:57: -> ^( S_SWITCH ^( E_COND expr ) stmtsCase )
            {
                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:694:60: ^( S_SWITCH ^( E_COND expr ) stmtsCase )
                {
                BaseNode root_1 = (BaseNode)adaptor.nil();
                root_1 = (BaseNode)adaptor.becomeRoot(
                (BaseNode)adaptor.create(S_SWITCH, "S_SWITCH")
                , root_1);

                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:694:71: ^( E_COND expr )
                {
                BaseNode root_2 = (BaseNode)adaptor.nil();
                root_2 = (BaseNode)adaptor.becomeRoot(
                (BaseNode)adaptor.create(E_COND, "E_COND")
                , root_2);

                adaptor.addChild(root_2, stream_expr.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_1, stream_stmtsCase.nextTree());

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
            if ( state.backtracking>0 ) { memoize(input, 92, stmtSwitch_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "stmtSwitch"


    public static class stmtsCase_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stmtsCase"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:696:1: stmtsCase : ( stmtCase )* -> ( stmtCase )+ ;
    public final pollenParser.stmtsCase_return stmtsCase() throws RecognitionException {
        pollenParser.stmtsCase_return retval = new pollenParser.stmtsCase_return();
        retval.start = input.LT(1);

        int stmtsCase_StartIndex = input.index();

        BaseNode root_0 = null;

        pollenParser.stmtCase_return stmtCase363 =null;


        RewriteRuleSubtreeStream stream_stmtCase=new RewriteRuleSubtreeStream(adaptor,"rule stmtCase");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 93) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:697:2: ( ( stmtCase )* -> ( stmtCase )+ )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:697:4: ( stmtCase )*
            {
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:697:4: ( stmtCase )*
            loop88:
            do {
                int alt88=2;
                int LA88_0 = input.LA(1);

                if ( (LA88_0==153||LA88_0==158) ) {
                    alt88=1;
                }


                switch (alt88) {
            	case 1 :
            	    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:697:4: stmtCase
            	    {
            	    pushFollow(FOLLOW_stmtCase_in_stmtsCase4161);
            	    stmtCase363=stmtCase();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_stmtCase.add(stmtCase363.getTree());

            	    }
            	    break;

            	default :
            	    break loop88;
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
            // 697:14: -> ( stmtCase )+
            {
                if ( !(stream_stmtCase.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_stmtCase.hasNext() ) {
                    adaptor.addChild(root_0, stream_stmtCase.nextTree());

                }
                stream_stmtCase.reset();

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
            if ( state.backtracking>0 ) { memoize(input, 93, stmtsCase_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "stmtsCase"


    public static class stmtCase_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stmtCase"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:699:1: stmtCase : ( 'case' ( INT_LIT ) ':' stmts -> ^( S_CASE INT_LIT stmts ) | 'default' ':' stmts -> ^( S_DEFAULT stmts ) );
    public final pollenParser.stmtCase_return stmtCase() throws RecognitionException {
        pollenParser.stmtCase_return retval = new pollenParser.stmtCase_return();
        retval.start = input.LT(1);

        int stmtCase_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom string_literal364=null;
        Atom INT_LIT365=null;
        Atom char_literal366=null;
        Atom string_literal368=null;
        Atom char_literal369=null;
        pollenParser.stmts_return stmts367 =null;

        pollenParser.stmts_return stmts370 =null;


        BaseNode string_literal364_tree=null;
        BaseNode INT_LIT365_tree=null;
        BaseNode char_literal366_tree=null;
        BaseNode string_literal368_tree=null;
        BaseNode char_literal369_tree=null;
        RewriteRuleTokenStream stream_153=new RewriteRuleTokenStream(adaptor,"token 153");
        RewriteRuleTokenStream stream_138=new RewriteRuleTokenStream(adaptor,"token 138");
        RewriteRuleTokenStream stream_INT_LIT=new RewriteRuleTokenStream(adaptor,"token INT_LIT");
        RewriteRuleTokenStream stream_158=new RewriteRuleTokenStream(adaptor,"token 158");
        RewriteRuleSubtreeStream stream_stmts=new RewriteRuleSubtreeStream(adaptor,"rule stmts");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 94) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:700:2: ( 'case' ( INT_LIT ) ':' stmts -> ^( S_CASE INT_LIT stmts ) | 'default' ':' stmts -> ^( S_DEFAULT stmts ) )
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==153) ) {
                alt89=1;
            }
            else if ( (LA89_0==158) ) {
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
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:700:4: 'case' ( INT_LIT ) ':' stmts
                    {
                    string_literal364=(Atom)match(input,153,FOLLOW_153_in_stmtCase4177); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_153.add(string_literal364);


                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:700:11: ( INT_LIT )
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:700:12: INT_LIT
                    {
                    INT_LIT365=(Atom)match(input,INT_LIT,FOLLOW_INT_LIT_in_stmtCase4180); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INT_LIT.add(INT_LIT365);


                    }


                    char_literal366=(Atom)match(input,138,FOLLOW_138_in_stmtCase4183); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_138.add(char_literal366);


                    pushFollow(FOLLOW_stmts_in_stmtCase4185);
                    stmts367=stmts();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_stmts.add(stmts367.getTree());

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
                    // 700:31: -> ^( S_CASE INT_LIT stmts )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:700:34: ^( S_CASE INT_LIT stmts )
                        {
                        BaseNode root_1 = (BaseNode)adaptor.nil();
                        root_1 = (BaseNode)adaptor.becomeRoot(
                        (BaseNode)adaptor.create(S_CASE, "S_CASE")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_INT_LIT.nextNode()
                        );

                        adaptor.addChild(root_1, stream_stmts.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:701:4: 'default' ':' stmts
                    {
                    string_literal368=(Atom)match(input,158,FOLLOW_158_in_stmtCase4200); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_158.add(string_literal368);


                    char_literal369=(Atom)match(input,138,FOLLOW_138_in_stmtCase4202); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_138.add(char_literal369);


                    pushFollow(FOLLOW_stmts_in_stmtCase4204);
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
                    // 701:24: -> ^( S_DEFAULT stmts )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:701:27: ^( S_DEFAULT stmts )
                        {
                        BaseNode root_1 = (BaseNode)adaptor.nil();
                        root_1 = (BaseNode)adaptor.becomeRoot(
                        (BaseNode)adaptor.create(S_DEFAULT, "S_DEFAULT")
                        , root_1);

                        adaptor.addChild(root_1, stream_stmts.nextTree());

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
            if ( state.backtracking>0 ) { memoize(input, 94, stmtCase_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "stmtCase"


    public static class stmtDoWhile_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stmtDoWhile"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:703:1: stmtDoWhile : 'do' stmtBlock 'while' '(' expr ')' delim -> ^( S_DO_WHILE stmtBlock ^( E_COND expr ) ) ;
    public final pollenParser.stmtDoWhile_return stmtDoWhile() throws RecognitionException {
        pollenParser.stmtDoWhile_return retval = new pollenParser.stmtDoWhile_return();
        retval.start = input.LT(1);

        int stmtDoWhile_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom string_literal371=null;
        Atom string_literal373=null;
        Atom char_literal374=null;
        Atom char_literal376=null;
        pollenParser.stmtBlock_return stmtBlock372 =null;

        pollenParser.expr_return expr375 =null;

        pollenParser.delim_return delim377 =null;


        BaseNode string_literal371_tree=null;
        BaseNode string_literal373_tree=null;
        BaseNode char_literal374_tree=null;
        BaseNode char_literal376_tree=null;
        RewriteRuleTokenStream stream_128=new RewriteRuleTokenStream(adaptor,"token 128");
        RewriteRuleTokenStream stream_198=new RewriteRuleTokenStream(adaptor,"token 198");
        RewriteRuleTokenStream stream_159=new RewriteRuleTokenStream(adaptor,"token 159");
        RewriteRuleTokenStream stream_129=new RewriteRuleTokenStream(adaptor,"token 129");
        RewriteRuleSubtreeStream stream_stmtBlock=new RewriteRuleSubtreeStream(adaptor,"rule stmtBlock");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_delim=new RewriteRuleSubtreeStream(adaptor,"rule delim");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 95) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:704:2: ( 'do' stmtBlock 'while' '(' expr ')' delim -> ^( S_DO_WHILE stmtBlock ^( E_COND expr ) ) )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:704:4: 'do' stmtBlock 'while' '(' expr ')' delim
            {
            string_literal371=(Atom)match(input,159,FOLLOW_159_in_stmtDoWhile4222); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_159.add(string_literal371);


            pushFollow(FOLLOW_stmtBlock_in_stmtDoWhile4224);
            stmtBlock372=stmtBlock();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_stmtBlock.add(stmtBlock372.getTree());

            string_literal373=(Atom)match(input,198,FOLLOW_198_in_stmtDoWhile4226); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_198.add(string_literal373);


            char_literal374=(Atom)match(input,128,FOLLOW_128_in_stmtDoWhile4228); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_128.add(char_literal374);


            pushFollow(FOLLOW_expr_in_stmtDoWhile4230);
            expr375=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr375.getTree());

            char_literal376=(Atom)match(input,129,FOLLOW_129_in_stmtDoWhile4232); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_129.add(char_literal376);


            pushFollow(FOLLOW_delim_in_stmtDoWhile4234);
            delim377=delim();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_delim.add(delim377.getTree());

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
            // 704:47: -> ^( S_DO_WHILE stmtBlock ^( E_COND expr ) )
            {
                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:704:50: ^( S_DO_WHILE stmtBlock ^( E_COND expr ) )
                {
                BaseNode root_1 = (BaseNode)adaptor.nil();
                root_1 = (BaseNode)adaptor.becomeRoot(
                (BaseNode)adaptor.create(S_DO_WHILE, "S_DO_WHILE")
                , root_1);

                adaptor.addChild(root_1, stream_stmtBlock.nextTree());

                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:704:73: ^( E_COND expr )
                {
                BaseNode root_2 = (BaseNode)adaptor.nil();
                root_2 = (BaseNode)adaptor.becomeRoot(
                (BaseNode)adaptor.create(E_COND, "E_COND")
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
            if ( state.backtracking>0 ) { memoize(input, 95, stmtDoWhile_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "stmtDoWhile"


    public static class stmtIf_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stmtIf"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:706:1: stmtIf : ( 'if' stmtIfBlock stmtsElif ( stmtElse )? -> ^( S_IF stmtIfBlock stmtsElif ( stmtElse )? ) | 'if' stmtIfBlock stmtElse -> ^( S_IF stmtIfBlock stmtElse ) | 'if' stmtIfBlock -> ^( S_IF stmtIfBlock ) );
    public final pollenParser.stmtIf_return stmtIf() throws RecognitionException {
        pollenParser.stmtIf_return retval = new pollenParser.stmtIf_return();
        retval.start = input.LT(1);

        int stmtIf_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom string_literal378=null;
        Atom string_literal382=null;
        Atom string_literal385=null;
        pollenParser.stmtIfBlock_return stmtIfBlock379 =null;

        pollenParser.stmtsElif_return stmtsElif380 =null;

        pollenParser.stmtElse_return stmtElse381 =null;

        pollenParser.stmtIfBlock_return stmtIfBlock383 =null;

        pollenParser.stmtElse_return stmtElse384 =null;

        pollenParser.stmtIfBlock_return stmtIfBlock386 =null;


        BaseNode string_literal378_tree=null;
        BaseNode string_literal382_tree=null;
        BaseNode string_literal385_tree=null;
        RewriteRuleTokenStream stream_171=new RewriteRuleTokenStream(adaptor,"token 171");
        RewriteRuleSubtreeStream stream_stmtsElif=new RewriteRuleSubtreeStream(adaptor,"rule stmtsElif");
        RewriteRuleSubtreeStream stream_stmtElse=new RewriteRuleSubtreeStream(adaptor,"rule stmtElse");
        RewriteRuleSubtreeStream stream_stmtIfBlock=new RewriteRuleSubtreeStream(adaptor,"rule stmtIfBlock");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 96) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:707:2: ( 'if' stmtIfBlock stmtsElif ( stmtElse )? -> ^( S_IF stmtIfBlock stmtsElif ( stmtElse )? ) | 'if' stmtIfBlock stmtElse -> ^( S_IF stmtIfBlock stmtElse ) | 'if' stmtIfBlock -> ^( S_IF stmtIfBlock ) )
            int alt91=3;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==171) ) {
                int LA91_1 = input.LA(2);

                if ( (synpred164_pollen()) ) {
                    alt91=1;
                }
                else if ( (synpred165_pollen()) ) {
                    alt91=2;
                }
                else if ( (true) ) {
                    alt91=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 91, 1, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 91, 0, input);

                throw nvae;

            }
            switch (alt91) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:707:4: 'if' stmtIfBlock stmtsElif ( stmtElse )?
                    {
                    string_literal378=(Atom)match(input,171,FOLLOW_171_in_stmtIf4259); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_171.add(string_literal378);


                    pushFollow(FOLLOW_stmtIfBlock_in_stmtIf4261);
                    stmtIfBlock379=stmtIfBlock();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_stmtIfBlock.add(stmtIfBlock379.getTree());

                    pushFollow(FOLLOW_stmtsElif_in_stmtIf4263);
                    stmtsElif380=stmtsElif();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_stmtsElif.add(stmtsElif380.getTree());

                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:707:31: ( stmtElse )?
                    int alt90=2;
                    int LA90_0 = input.LA(1);

                    if ( (LA90_0==161) ) {
                        alt90=1;
                    }
                    switch (alt90) {
                        case 1 :
                            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:707:31: stmtElse
                            {
                            pushFollow(FOLLOW_stmtElse_in_stmtIf4265);
                            stmtElse381=stmtElse();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_stmtElse.add(stmtElse381.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: stmtsElif, stmtElse, stmtIfBlock
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (BaseNode)adaptor.nil();
                    // 707:41: -> ^( S_IF stmtIfBlock stmtsElif ( stmtElse )? )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:707:44: ^( S_IF stmtIfBlock stmtsElif ( stmtElse )? )
                        {
                        BaseNode root_1 = (BaseNode)adaptor.nil();
                        root_1 = (BaseNode)adaptor.becomeRoot(
                        (BaseNode)adaptor.create(S_IF, "S_IF")
                        , root_1);

                        adaptor.addChild(root_1, stream_stmtIfBlock.nextTree());

                        adaptor.addChild(root_1, stream_stmtsElif.nextTree());

                        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:707:73: ( stmtElse )?
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
                    break;
                case 2 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:708:4: 'if' stmtIfBlock stmtElse
                    {
                    string_literal382=(Atom)match(input,171,FOLLOW_171_in_stmtIf4284); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_171.add(string_literal382);


                    pushFollow(FOLLOW_stmtIfBlock_in_stmtIf4286);
                    stmtIfBlock383=stmtIfBlock();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_stmtIfBlock.add(stmtIfBlock383.getTree());

                    pushFollow(FOLLOW_stmtElse_in_stmtIf4288);
                    stmtElse384=stmtElse();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_stmtElse.add(stmtElse384.getTree());

                    // AST REWRITE
                    // elements: stmtIfBlock, stmtElse
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (BaseNode)adaptor.nil();
                    // 708:30: -> ^( S_IF stmtIfBlock stmtElse )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:708:33: ^( S_IF stmtIfBlock stmtElse )
                        {
                        BaseNode root_1 = (BaseNode)adaptor.nil();
                        root_1 = (BaseNode)adaptor.becomeRoot(
                        (BaseNode)adaptor.create(S_IF, "S_IF")
                        , root_1);

                        adaptor.addChild(root_1, stream_stmtIfBlock.nextTree());

                        adaptor.addChild(root_1, stream_stmtElse.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 3 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:709:4: 'if' stmtIfBlock
                    {
                    string_literal385=(Atom)match(input,171,FOLLOW_171_in_stmtIf4303); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_171.add(string_literal385);


                    pushFollow(FOLLOW_stmtIfBlock_in_stmtIf4305);
                    stmtIfBlock386=stmtIfBlock();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_stmtIfBlock.add(stmtIfBlock386.getTree());

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
                    // 709:21: -> ^( S_IF stmtIfBlock )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:709:24: ^( S_IF stmtIfBlock )
                        {
                        BaseNode root_1 = (BaseNode)adaptor.nil();
                        root_1 = (BaseNode)adaptor.becomeRoot(
                        (BaseNode)adaptor.create(S_IF, "S_IF")
                        , root_1);

                        adaptor.addChild(root_1, stream_stmtIfBlock.nextTree());

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
            if ( state.backtracking>0 ) { memoize(input, 96, stmtIf_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "stmtIf"


    public static class stmtIfBlock_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stmtIfBlock"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:711:1: stmtIfBlock : '(' expr ')' stmtBlock -> ^( E_COND expr ) stmtBlock ;
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
        RewriteRuleTokenStream stream_128=new RewriteRuleTokenStream(adaptor,"token 128");
        RewriteRuleTokenStream stream_129=new RewriteRuleTokenStream(adaptor,"token 129");
        RewriteRuleSubtreeStream stream_stmtBlock=new RewriteRuleSubtreeStream(adaptor,"rule stmtBlock");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 97) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:712:2: ( '(' expr ')' stmtBlock -> ^( E_COND expr ) stmtBlock )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:712:4: '(' expr ')' stmtBlock
            {
            char_literal387=(Atom)match(input,128,FOLLOW_128_in_stmtIfBlock4323); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_128.add(char_literal387);


            pushFollow(FOLLOW_expr_in_stmtIfBlock4325);
            expr388=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr388.getTree());

            char_literal389=(Atom)match(input,129,FOLLOW_129_in_stmtIfBlock4327); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_129.add(char_literal389);


            pushFollow(FOLLOW_stmtBlock_in_stmtIfBlock4329);
            stmtBlock390=stmtBlock();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_stmtBlock.add(stmtBlock390.getTree());

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
            // 712:27: -> ^( E_COND expr ) stmtBlock
            {
                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:712:30: ^( E_COND expr )
                {
                BaseNode root_1 = (BaseNode)adaptor.nil();
                root_1 = (BaseNode)adaptor.becomeRoot(
                (BaseNode)adaptor.create(E_COND, "E_COND")
                , root_1);

                adaptor.addChild(root_1, stream_expr.nextTree());

                adaptor.addChild(root_0, root_1);
                }

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
            if ( state.backtracking>0 ) { memoize(input, 97, stmtIfBlock_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "stmtIfBlock"


    public static class stmtsElif_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stmtsElif"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:714:1: stmtsElif : ( stmtElif )+ ;
    public final pollenParser.stmtsElif_return stmtsElif() throws RecognitionException {
        pollenParser.stmtsElif_return retval = new pollenParser.stmtsElif_return();
        retval.start = input.LT(1);

        int stmtsElif_StartIndex = input.index();

        BaseNode root_0 = null;

        pollenParser.stmtElif_return stmtElif391 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 98) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:715:2: ( ( stmtElif )+ )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:715:4: ( stmtElif )+
            {
            root_0 = (BaseNode)adaptor.nil();


            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:715:4: ( stmtElif )+
            int cnt92=0;
            loop92:
            do {
                int alt92=2;
                int LA92_0 = input.LA(1);

                if ( (LA92_0==160) ) {
                    alt92=1;
                }


                switch (alt92) {
            	case 1 :
            	    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:715:4: stmtElif
            	    {
            	    pushFollow(FOLLOW_stmtElif_in_stmtsElif4349);
            	    stmtElif391=stmtElif();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmtElif391.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt92 >= 1 ) break loop92;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(92, input);
                        throw eee;
                }
                cnt92++;
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
            if ( state.backtracking>0 ) { memoize(input, 98, stmtsElif_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "stmtsElif"


    public static class stmtElif_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stmtElif"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:717:1: stmtElif : 'elif' stmtIfBlock -> ^( S_ELIF stmtIfBlock ) ;
    public final pollenParser.stmtElif_return stmtElif() throws RecognitionException {
        pollenParser.stmtElif_return retval = new pollenParser.stmtElif_return();
        retval.start = input.LT(1);

        int stmtElif_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom string_literal392=null;
        pollenParser.stmtIfBlock_return stmtIfBlock393 =null;


        BaseNode string_literal392_tree=null;
        RewriteRuleTokenStream stream_160=new RewriteRuleTokenStream(adaptor,"token 160");
        RewriteRuleSubtreeStream stream_stmtIfBlock=new RewriteRuleSubtreeStream(adaptor,"rule stmtIfBlock");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 99) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:718:2: ( 'elif' stmtIfBlock -> ^( S_ELIF stmtIfBlock ) )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:718:4: 'elif' stmtIfBlock
            {
            string_literal392=(Atom)match(input,160,FOLLOW_160_in_stmtElif4360); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_160.add(string_literal392);


            pushFollow(FOLLOW_stmtIfBlock_in_stmtElif4362);
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
            // 718:23: -> ^( S_ELIF stmtIfBlock )
            {
                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:718:26: ^( S_ELIF stmtIfBlock )
                {
                BaseNode root_1 = (BaseNode)adaptor.nil();
                root_1 = (BaseNode)adaptor.becomeRoot(
                (BaseNode)adaptor.create(S_ELIF, "S_ELIF")
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
            if ( state.backtracking>0 ) { memoize(input, 99, stmtElif_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "stmtElif"


    public static class stmtElse_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stmtElse"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:720:1: stmtElse : 'else' stmtBlock -> ^( S_ELSE stmtBlock ) ;
    public final pollenParser.stmtElse_return stmtElse() throws RecognitionException {
        pollenParser.stmtElse_return retval = new pollenParser.stmtElse_return();
        retval.start = input.LT(1);

        int stmtElse_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom string_literal394=null;
        pollenParser.stmtBlock_return stmtBlock395 =null;


        BaseNode string_literal394_tree=null;
        RewriteRuleTokenStream stream_161=new RewriteRuleTokenStream(adaptor,"token 161");
        RewriteRuleSubtreeStream stream_stmtBlock=new RewriteRuleSubtreeStream(adaptor,"rule stmtBlock");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 100) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:721:2: ( 'else' stmtBlock -> ^( S_ELSE stmtBlock ) )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:721:4: 'else' stmtBlock
            {
            string_literal394=(Atom)match(input,161,FOLLOW_161_in_stmtElse4380); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_161.add(string_literal394);


            pushFollow(FOLLOW_stmtBlock_in_stmtElse4382);
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
            // 721:21: -> ^( S_ELSE stmtBlock )
            {
                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:721:24: ^( S_ELSE stmtBlock )
                {
                BaseNode root_1 = (BaseNode)adaptor.nil();
                root_1 = (BaseNode)adaptor.becomeRoot(
                (BaseNode)adaptor.create(S_ELSE, "S_ELSE")
                , root_1);

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
            if ( state.backtracking>0 ) { memoize(input, 100, stmtElse_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "stmtElse"


    public static class stmtProvided_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stmtProvided"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:723:1: stmtProvided : 'provided' '(' expr ')' stmtBlock ( stmtElse )? -> ^( S_PROVIDED expr stmtBlock ( stmtElse )? ) ;
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
        RewriteRuleTokenStream stream_128=new RewriteRuleTokenStream(adaptor,"token 128");
        RewriteRuleTokenStream stream_187=new RewriteRuleTokenStream(adaptor,"token 187");
        RewriteRuleTokenStream stream_129=new RewriteRuleTokenStream(adaptor,"token 129");
        RewriteRuleSubtreeStream stream_stmtElse=new RewriteRuleSubtreeStream(adaptor,"rule stmtElse");
        RewriteRuleSubtreeStream stream_stmtBlock=new RewriteRuleSubtreeStream(adaptor,"rule stmtBlock");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 101) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:724:2: ( 'provided' '(' expr ')' stmtBlock ( stmtElse )? -> ^( S_PROVIDED expr stmtBlock ( stmtElse )? ) )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:724:4: 'provided' '(' expr ')' stmtBlock ( stmtElse )?
            {
            string_literal396=(Atom)match(input,187,FOLLOW_187_in_stmtProvided4400); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_187.add(string_literal396);


            char_literal397=(Atom)match(input,128,FOLLOW_128_in_stmtProvided4402); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_128.add(char_literal397);


            pushFollow(FOLLOW_expr_in_stmtProvided4404);
            expr398=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr398.getTree());

            char_literal399=(Atom)match(input,129,FOLLOW_129_in_stmtProvided4406); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_129.add(char_literal399);


            pushFollow(FOLLOW_stmtBlock_in_stmtProvided4408);
            stmtBlock400=stmtBlock();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_stmtBlock.add(stmtBlock400.getTree());

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:724:38: ( stmtElse )?
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==161) ) {
                alt93=1;
            }
            switch (alt93) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:724:39: stmtElse
                    {
                    pushFollow(FOLLOW_stmtElse_in_stmtProvided4411);
                    stmtElse401=stmtElse();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_stmtElse.add(stmtElse401.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: stmtElse, expr, stmtBlock
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (BaseNode)adaptor.nil();
            // 725:3: -> ^( S_PROVIDED expr stmtBlock ( stmtElse )? )
            {
                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:725:6: ^( S_PROVIDED expr stmtBlock ( stmtElse )? )
                {
                BaseNode root_1 = (BaseNode)adaptor.nil();
                root_1 = (BaseNode)adaptor.becomeRoot(
                (BaseNode)adaptor.create(S_PROVIDED, "S_PROVIDED")
                , root_1);

                adaptor.addChild(root_1, stream_expr.nextTree());

                adaptor.addChild(root_1, stream_stmtBlock.nextTree());

                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:725:34: ( stmtElse )?
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
            if ( state.backtracking>0 ) { memoize(input, 101, stmtProvided_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "stmtProvided"


    public static class stmtWhile_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stmtWhile"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:727:1: stmtWhile : 'while' '(' expr ')' stmtBlock -> ^( S_WHILE stmtBlock ) ;
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
        RewriteRuleTokenStream stream_128=new RewriteRuleTokenStream(adaptor,"token 128");
        RewriteRuleTokenStream stream_198=new RewriteRuleTokenStream(adaptor,"token 198");
        RewriteRuleTokenStream stream_129=new RewriteRuleTokenStream(adaptor,"token 129");
        RewriteRuleSubtreeStream stream_stmtBlock=new RewriteRuleSubtreeStream(adaptor,"rule stmtBlock");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 102) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:728:2: ( 'while' '(' expr ')' stmtBlock -> ^( S_WHILE stmtBlock ) )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:728:4: 'while' '(' expr ')' stmtBlock
            {
            string_literal402=(Atom)match(input,198,FOLLOW_198_in_stmtWhile4438); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_198.add(string_literal402);


            char_literal403=(Atom)match(input,128,FOLLOW_128_in_stmtWhile4440); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_128.add(char_literal403);


            pushFollow(FOLLOW_expr_in_stmtWhile4442);
            expr404=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr404.getTree());

            char_literal405=(Atom)match(input,129,FOLLOW_129_in_stmtWhile4443); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_129.add(char_literal405);


            pushFollow(FOLLOW_stmtBlock_in_stmtWhile4445);
            stmtBlock406=stmtBlock();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_stmtBlock.add(stmtBlock406.getTree());

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
            // 728:34: -> ^( S_WHILE stmtBlock )
            {
                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:728:37: ^( S_WHILE stmtBlock )
                {
                BaseNode root_1 = (BaseNode)adaptor.nil();
                root_1 = (BaseNode)adaptor.becomeRoot(
                (BaseNode)adaptor.create(S_WHILE, "S_WHILE")
                , root_1);

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
            if ( state.backtracking>0 ) { memoize(input, 102, stmtWhile_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "stmtWhile"


    public static class varDeclaration_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "varDeclaration"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:730:1: varDeclaration : varAttr varDecl delim -> ^( D_VAR varDecl ) ;
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
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 103) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:732:4: ( varAttr varDecl delim -> ^( D_VAR varDecl ) )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:732:7: varAttr varDecl delim
            {
            pushFollow(FOLLOW_varAttr_in_varDeclaration4467);
            varAttr407=varAttr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_varAttr.add(varAttr407.getTree());

            pushFollow(FOLLOW_varDecl_in_varDeclaration4469);
            varDecl408=varDecl();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_varDecl.add(varDecl408.getTree());

            pushFollow(FOLLOW_delim_in_varDeclaration4471);
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
            // 732:29: -> ^( D_VAR varDecl )
            {
                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:732:32: ^( D_VAR varDecl )
                {
                BaseNode root_1 = (BaseNode)adaptor.nil();
                root_1 = (BaseNode)adaptor.becomeRoot(
                (BaseNode)adaptor.create(D_VAR, "D_VAR")
                , root_1);

                adaptor.addChild(root_1, stream_varDecl.nextTree());

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
            if ( state.backtracking>0 ) { memoize(input, 103, varDeclaration_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "varDeclaration"


    public static class varAttr_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "varAttr"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:734:1: varAttr : ( 'const' | 'volatile' | 'host' )* ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 104) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:736:2: ( ( 'const' | 'volatile' | 'host' )* )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:736:4: ( 'const' | 'volatile' | 'host' )*
            {
            root_0 = (BaseNode)adaptor.nil();


            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:736:4: ( 'const' | 'volatile' | 'host' )*
            loop94:
            do {
                int alt94=4;
                switch ( input.LA(1) ) {
                case 156:
                    {
                    alt94=1;
                    }
                    break;
                case 197:
                    {
                    alt94=2;
                    }
                    break;
                case 170:
                    {
                    alt94=3;
                    }
                    break;

                }

                switch (alt94) {
            	case 1 :
            	    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:736:7: 'const'
            	    {
            	    string_literal410=(Atom)match(input,156,FOLLOW_156_in_varAttr4496); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal410_tree = 
            	    (BaseNode)adaptor.create(string_literal410)
            	    ;
            	    adaptor.addChild(root_0, string_literal410_tree);
            	    }

            	    if ( state.backtracking==0 ) { atFlags.add(AttrFlags.CONST); }

            	    }
            	    break;
            	case 2 :
            	    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:737:6: 'volatile'
            	    {
            	    string_literal411=(Atom)match(input,197,FOLLOW_197_in_varAttr4505); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal411_tree = 
            	    (BaseNode)adaptor.create(string_literal411)
            	    ;
            	    adaptor.addChild(root_0, string_literal411_tree);
            	    }

            	    if ( state.backtracking==0 ) { atFlags.add(AttrFlags.VOLATILE); }

            	    }
            	    break;
            	case 3 :
            	    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:738:7: 'host'
            	    {
            	    string_literal412=(Atom)match(input,170,FOLLOW_170_in_varAttr4515); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal412_tree = 
            	    (BaseNode)adaptor.create(string_literal412)
            	    ;
            	    adaptor.addChild(root_0, string_literal412_tree);
            	    }

            	    if ( state.backtracking==0 ) { atFlags.add(AttrFlags.HOST); }

            	    }
            	    break;

            	default :
            	    break loop94;
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
            if ( state.backtracking>0 ) { memoize(input, 104, varAttr_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "varAttr"


    public static class varDecl_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "varDecl"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:740:1: varDecl : ( ( typeName IDENT ( ASSIGN expr )? ',' )=> varDeclList | ( typeName IDENT '[' )=> varArray | ( typeName '(' )=> varFcnRef | typeName varInit | 'new' typeName IDENT fcnArgumentList -> ^( D_INSTANCE typeName IDENT fcnArgumentList ) );
    public final pollenParser.varDecl_return varDecl() throws RecognitionException {
        pollenParser.varDecl_return retval = new pollenParser.varDecl_return();
        retval.start = input.LT(1);

        int varDecl_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom string_literal418=null;
        Atom IDENT420=null;
        pollenParser.varDeclList_return varDeclList413 =null;

        pollenParser.varArray_return varArray414 =null;

        pollenParser.varFcnRef_return varFcnRef415 =null;

        pollenParser.typeName_return typeName416 =null;

        pollenParser.varInit_return varInit417 =null;

        pollenParser.typeName_return typeName419 =null;

        pollenParser.fcnArgumentList_return fcnArgumentList421 =null;


        BaseNode string_literal418_tree=null;
        BaseNode IDENT420_tree=null;
        RewriteRuleTokenStream stream_181=new RewriteRuleTokenStream(adaptor,"token 181");
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleSubtreeStream stream_typeName=new RewriteRuleSubtreeStream(adaptor,"rule typeName");
        RewriteRuleSubtreeStream stream_fcnArgumentList=new RewriteRuleSubtreeStream(adaptor,"rule fcnArgumentList");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 105) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:741:2: ( ( typeName IDENT ( ASSIGN expr )? ',' )=> varDeclList | ( typeName IDENT '[' )=> varArray | ( typeName '(' )=> varFcnRef | typeName varInit | 'new' typeName IDENT fcnArgumentList -> ^( D_INSTANCE typeName IDENT fcnArgumentList ) )
            int alt95=5;
            switch ( input.LA(1) ) {
            case 150:
            case 152:
            case 175:
            case 176:
            case 177:
            case 190:
            case 194:
            case 195:
            case 196:
                {
                int LA95_1 = input.LA(2);

                if ( (synpred172_pollen()) ) {
                    alt95=1;
                }
                else if ( (synpred173_pollen()) ) {
                    alt95=2;
                }
                else if ( (synpred174_pollen()) ) {
                    alt95=3;
                }
                else if ( (synpred175_pollen()) ) {
                    alt95=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 95, 1, input);

                    throw nvae;

                }
                }
                break;
            case IDENT:
                {
                int LA95_2 = input.LA(2);

                if ( (synpred172_pollen()) ) {
                    alt95=1;
                }
                else if ( (synpred173_pollen()) ) {
                    alt95=2;
                }
                else if ( (synpred174_pollen()) ) {
                    alt95=3;
                }
                else if ( (synpred175_pollen()) ) {
                    alt95=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 95, 2, input);

                    throw nvae;

                }
                }
                break;
            case 181:
                {
                alt95=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 95, 0, input);

                throw nvae;

            }

            switch (alt95) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:741:4: ( typeName IDENT ( ASSIGN expr )? ',' )=> varDeclList
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    pushFollow(FOLLOW_varDeclList_in_varDecl4547);
                    varDeclList413=varDeclList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDeclList413.getTree());

                    }
                    break;
                case 2 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:742:5: ( typeName IDENT '[' )=> varArray
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    pushFollow(FOLLOW_varArray_in_varDecl4563);
                    varArray414=varArray();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varArray414.getTree());

                    }
                    break;
                case 3 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:743:5: ( typeName '(' )=> varFcnRef
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    pushFollow(FOLLOW_varFcnRef_in_varDecl4579);
                    varFcnRef415=varFcnRef();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varFcnRef415.getTree());

                    }
                    break;
                case 4 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:744:6: typeName varInit
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    pushFollow(FOLLOW_typeName_in_varDecl4587);
                    typeName416=typeName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeName416.getTree());

                    pushFollow(FOLLOW_varInit_in_varDecl4589);
                    varInit417=varInit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varInit417.getTree());

                    }
                    break;
                case 5 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:745:4: 'new' typeName IDENT fcnArgumentList
                    {
                    string_literal418=(Atom)match(input,181,FOLLOW_181_in_varDecl4595); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_181.add(string_literal418);


                    pushFollow(FOLLOW_typeName_in_varDecl4597);
                    typeName419=typeName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeName.add(typeName419.getTree());

                    IDENT420=(Atom)match(input,IDENT,FOLLOW_IDENT_in_varDecl4599); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENT.add(IDENT420);


                    pushFollow(FOLLOW_fcnArgumentList_in_varDecl4601);
                    fcnArgumentList421=fcnArgumentList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_fcnArgumentList.add(fcnArgumentList421.getTree());

                    // AST REWRITE
                    // elements: typeName, fcnArgumentList, IDENT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (BaseNode)adaptor.nil();
                    // 746:3: -> ^( D_INSTANCE typeName IDENT fcnArgumentList )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:746:6: ^( D_INSTANCE typeName IDENT fcnArgumentList )
                        {
                        BaseNode root_1 = (BaseNode)adaptor.nil();
                        root_1 = (BaseNode)adaptor.becomeRoot(
                        (BaseNode)adaptor.create(D_INSTANCE, "D_INSTANCE")
                        , root_1);

                        adaptor.addChild(root_1, stream_typeName.nextTree());

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
            if ( state.backtracking>0 ) { memoize(input, 105, varDecl_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "varDecl"


    public static class varFcnRef_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "varFcnRef"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:748:1: varFcnRef : typeName fcnRefTypeList IDENT -> ^( D_FCN_REF typeName fcnRefTypeList IDENT ) ;
    public final pollenParser.varFcnRef_return varFcnRef() throws RecognitionException {
        pollenParser.varFcnRef_return retval = new pollenParser.varFcnRef_return();
        retval.start = input.LT(1);

        int varFcnRef_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom IDENT424=null;
        pollenParser.typeName_return typeName422 =null;

        pollenParser.fcnRefTypeList_return fcnRefTypeList423 =null;


        BaseNode IDENT424_tree=null;
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleSubtreeStream stream_typeName=new RewriteRuleSubtreeStream(adaptor,"rule typeName");
        RewriteRuleSubtreeStream stream_fcnRefTypeList=new RewriteRuleSubtreeStream(adaptor,"rule fcnRefTypeList");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 106) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:749:2: ( typeName fcnRefTypeList IDENT -> ^( D_FCN_REF typeName fcnRefTypeList IDENT ) )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:749:4: typeName fcnRefTypeList IDENT
            {
            pushFollow(FOLLOW_typeName_in_varFcnRef4625);
            typeName422=typeName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeName.add(typeName422.getTree());

            pushFollow(FOLLOW_fcnRefTypeList_in_varFcnRef4627);
            fcnRefTypeList423=fcnRefTypeList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_fcnRefTypeList.add(fcnRefTypeList423.getTree());

            IDENT424=(Atom)match(input,IDENT,FOLLOW_IDENT_in_varFcnRef4629); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENT.add(IDENT424);


            // AST REWRITE
            // elements: IDENT, fcnRefTypeList, typeName
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (BaseNode)adaptor.nil();
            // 750:3: -> ^( D_FCN_REF typeName fcnRefTypeList IDENT )
            {
                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:750:6: ^( D_FCN_REF typeName fcnRefTypeList IDENT )
                {
                BaseNode root_1 = (BaseNode)adaptor.nil();
                root_1 = (BaseNode)adaptor.becomeRoot(
                (BaseNode)adaptor.create(D_FCN_REF, "D_FCN_REF")
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
            if ( state.backtracking>0 ) { memoize(input, 106, varFcnRef_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "varFcnRef"


    public static class fcnRefTypeList_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "fcnRefTypeList"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:752:1: fcnRefTypeList : '(' fcnRefTypes ')' -> ^( FCNPARMS fcnRefTypes ) ;
    public final pollenParser.fcnRefTypeList_return fcnRefTypeList() throws RecognitionException {
        pollenParser.fcnRefTypeList_return retval = new pollenParser.fcnRefTypeList_return();
        retval.start = input.LT(1);

        int fcnRefTypeList_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom char_literal425=null;
        Atom char_literal427=null;
        pollenParser.fcnRefTypes_return fcnRefTypes426 =null;


        BaseNode char_literal425_tree=null;
        BaseNode char_literal427_tree=null;
        RewriteRuleTokenStream stream_128=new RewriteRuleTokenStream(adaptor,"token 128");
        RewriteRuleTokenStream stream_129=new RewriteRuleTokenStream(adaptor,"token 129");
        RewriteRuleSubtreeStream stream_fcnRefTypes=new RewriteRuleSubtreeStream(adaptor,"rule fcnRefTypes");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 107) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:753:2: ( '(' fcnRefTypes ')' -> ^( FCNPARMS fcnRefTypes ) )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:753:4: '(' fcnRefTypes ')'
            {
            char_literal425=(Atom)match(input,128,FOLLOW_128_in_fcnRefTypeList4654); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_128.add(char_literal425);


            pushFollow(FOLLOW_fcnRefTypes_in_fcnRefTypeList4656);
            fcnRefTypes426=fcnRefTypes();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_fcnRefTypes.add(fcnRefTypes426.getTree());

            char_literal427=(Atom)match(input,129,FOLLOW_129_in_fcnRefTypeList4658); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_129.add(char_literal427);


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
            // 754:3: -> ^( FCNPARMS fcnRefTypes )
            {
                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:754:6: ^( FCNPARMS fcnRefTypes )
                {
                BaseNode root_1 = (BaseNode)adaptor.nil();
                root_1 = (BaseNode)adaptor.becomeRoot(
                (BaseNode)adaptor.create(FCNPARMS, "FCNPARMS")
                , root_1);

                adaptor.addChild(root_1, stream_fcnRefTypes.nextTree());

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
            if ( state.backtracking>0 ) { memoize(input, 107, fcnRefTypeList_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "fcnRefTypeList"


    public static class fcnRefTypes_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "fcnRefTypes"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:756:1: fcnRefTypes : ( typeName ( ',' typeName )* -> ( typeName )+ | -> NIL );
    public final pollenParser.fcnRefTypes_return fcnRefTypes() throws RecognitionException {
        pollenParser.fcnRefTypes_return retval = new pollenParser.fcnRefTypes_return();
        retval.start = input.LT(1);

        int fcnRefTypes_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom char_literal429=null;
        pollenParser.typeName_return typeName428 =null;

        pollenParser.typeName_return typeName430 =null;


        BaseNode char_literal429_tree=null;
        RewriteRuleTokenStream stream_133=new RewriteRuleTokenStream(adaptor,"token 133");
        RewriteRuleSubtreeStream stream_typeName=new RewriteRuleSubtreeStream(adaptor,"rule typeName");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 108) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:757:2: ( typeName ( ',' typeName )* -> ( typeName )+ | -> NIL )
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( (LA97_0==IDENT||LA97_0==150||LA97_0==152||(LA97_0 >= 175 && LA97_0 <= 177)||LA97_0==190||(LA97_0 >= 194 && LA97_0 <= 196)) ) {
                alt97=1;
            }
            else if ( (LA97_0==129) ) {
                alt97=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 97, 0, input);

                throw nvae;

            }
            switch (alt97) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:757:4: typeName ( ',' typeName )*
                    {
                    pushFollow(FOLLOW_typeName_in_fcnRefTypes4678);
                    typeName428=typeName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeName.add(typeName428.getTree());

                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:757:13: ( ',' typeName )*
                    loop96:
                    do {
                        int alt96=2;
                        int LA96_0 = input.LA(1);

                        if ( (LA96_0==133) ) {
                            alt96=1;
                        }


                        switch (alt96) {
                    	case 1 :
                    	    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:757:14: ',' typeName
                    	    {
                    	    char_literal429=(Atom)match(input,133,FOLLOW_133_in_fcnRefTypes4681); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_133.add(char_literal429);


                    	    pushFollow(FOLLOW_typeName_in_fcnRefTypes4683);
                    	    typeName430=typeName();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_typeName.add(typeName430.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop96;
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
                    // 757:29: -> ( typeName )+
                    {
                        if ( !(stream_typeName.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_typeName.hasNext() ) {
                            adaptor.addChild(root_0, stream_typeName.nextTree());

                        }
                        stream_typeName.reset();

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:758:4: 
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
                    // 758:4: -> NIL
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
            if ( state.backtracking>0 ) { memoize(input, 108, fcnRefTypes_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "fcnRefTypes"


    public static class varArray_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "varArray"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:760:1: varArray : typeName IDENT varArraySpec -> ^( D_ARR typeName IDENT varArraySpec ) ;
    public final pollenParser.varArray_return varArray() throws RecognitionException {
        pollenParser.varArray_return retval = new pollenParser.varArray_return();
        retval.start = input.LT(1);

        int varArray_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom IDENT432=null;
        pollenParser.typeName_return typeName431 =null;

        pollenParser.varArraySpec_return varArraySpec433 =null;


        BaseNode IDENT432_tree=null;
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleSubtreeStream stream_typeName=new RewriteRuleSubtreeStream(adaptor,"rule typeName");
        RewriteRuleSubtreeStream stream_varArraySpec=new RewriteRuleSubtreeStream(adaptor,"rule varArraySpec");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 109) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:761:2: ( typeName IDENT varArraySpec -> ^( D_ARR typeName IDENT varArraySpec ) )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:761:4: typeName IDENT varArraySpec
            {
            pushFollow(FOLLOW_typeName_in_varArray4707);
            typeName431=typeName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeName.add(typeName431.getTree());

            IDENT432=(Atom)match(input,IDENT,FOLLOW_IDENT_in_varArray4709); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENT.add(IDENT432);


            pushFollow(FOLLOW_varArraySpec_in_varArray4711);
            varArraySpec433=varArraySpec();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_varArraySpec.add(varArraySpec433.getTree());

            // AST REWRITE
            // elements: varArraySpec, IDENT, typeName
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (BaseNode)adaptor.nil();
            // 761:32: -> ^( D_ARR typeName IDENT varArraySpec )
            {
                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:761:36: ^( D_ARR typeName IDENT varArraySpec )
                {
                BaseNode root_1 = (BaseNode)adaptor.nil();
                root_1 = (BaseNode)adaptor.becomeRoot(
                (BaseNode)adaptor.create(D_ARR, "D_ARR")
                , root_1);

                adaptor.addChild(root_1, stream_typeName.nextTree());

                adaptor.addChild(root_1, 
                stream_IDENT.nextNode()
                );

                adaptor.addChild(root_1, stream_varArraySpec.nextTree());

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
            if ( state.backtracking>0 ) { memoize(input, 109, varArray_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "varArray"


    public static class varArraySpec_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "varArraySpec"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:763:1: varArraySpec : ( '[' varDim ']' )+ -> ( varDim )+ ;
    public final pollenParser.varArraySpec_return varArraySpec() throws RecognitionException {
        pollenParser.varArraySpec_return retval = new pollenParser.varArraySpec_return();
        retval.start = input.LT(1);

        int varArraySpec_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom char_literal434=null;
        Atom char_literal436=null;
        pollenParser.varDim_return varDim435 =null;


        BaseNode char_literal434_tree=null;
        BaseNode char_literal436_tree=null;
        RewriteRuleTokenStream stream_145=new RewriteRuleTokenStream(adaptor,"token 145");
        RewriteRuleTokenStream stream_146=new RewriteRuleTokenStream(adaptor,"token 146");
        RewriteRuleSubtreeStream stream_varDim=new RewriteRuleSubtreeStream(adaptor,"rule varDim");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 110) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:764:2: ( ( '[' varDim ']' )+ -> ( varDim )+ )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:764:4: ( '[' varDim ']' )+
            {
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:764:4: ( '[' varDim ']' )+
            int cnt98=0;
            loop98:
            do {
                int alt98=2;
                int LA98_0 = input.LA(1);

                if ( (LA98_0==145) ) {
                    int LA98_1 = input.LA(2);

                    if ( (synpred178_pollen()) ) {
                        alt98=1;
                    }


                }


                switch (alt98) {
            	case 1 :
            	    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:764:5: '[' varDim ']'
            	    {
            	    char_literal434=(Atom)match(input,145,FOLLOW_145_in_varArraySpec4735); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_145.add(char_literal434);


            	    pushFollow(FOLLOW_varDim_in_varArraySpec4737);
            	    varDim435=varDim();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_varDim.add(varDim435.getTree());

            	    char_literal436=(Atom)match(input,146,FOLLOW_146_in_varArraySpec4739); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_146.add(char_literal436);


            	    }
            	    break;

            	default :
            	    if ( cnt98 >= 1 ) break loop98;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(98, input);
                        throw eee;
                }
                cnt98++;
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
            // 764:22: -> ( varDim )+
            {
                if ( !(stream_varDim.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_varDim.hasNext() ) {
                    adaptor.addChild(root_0, stream_varDim.nextTree());

                }
                stream_varDim.reset();

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
            if ( state.backtracking>0 ) { memoize(input, 110, varArraySpec_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "varArraySpec"


    public static class varDim_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "varDim"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:766:1: varDim : ( INT_LIT -> ^( D_ARR_DIM INT_LIT ) | IDENT -> ^( D_ARR_DIM IDENT ) | -> ^( D_ARR_DIM NIL ) );
    public final pollenParser.varDim_return varDim() throws RecognitionException {
        pollenParser.varDim_return retval = new pollenParser.varDim_return();
        retval.start = input.LT(1);

        int varDim_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom INT_LIT437=null;
        Atom IDENT438=null;

        BaseNode INT_LIT437_tree=null;
        BaseNode IDENT438_tree=null;
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleTokenStream stream_INT_LIT=new RewriteRuleTokenStream(adaptor,"token INT_LIT");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 111) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:768:2: ( INT_LIT -> ^( D_ARR_DIM INT_LIT ) | IDENT -> ^( D_ARR_DIM IDENT ) | -> ^( D_ARR_DIM NIL ) )
            int alt99=3;
            switch ( input.LA(1) ) {
            case INT_LIT:
                {
                alt99=1;
                }
                break;
            case IDENT:
                {
                alt99=2;
                }
                break;
            case 146:
                {
                alt99=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 99, 0, input);

                throw nvae;

            }

            switch (alt99) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:768:5: INT_LIT
                    {
                    INT_LIT437=(Atom)match(input,INT_LIT,FOLLOW_INT_LIT_in_varDim4760); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INT_LIT.add(INT_LIT437);


                    // AST REWRITE
                    // elements: INT_LIT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (BaseNode)adaptor.nil();
                    // 768:15: -> ^( D_ARR_DIM INT_LIT )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:768:18: ^( D_ARR_DIM INT_LIT )
                        {
                        BaseNode root_1 = (BaseNode)adaptor.nil();
                        root_1 = (BaseNode)adaptor.becomeRoot(
                        (BaseNode)adaptor.create(D_ARR_DIM, "D_ARR_DIM")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_INT_LIT.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:769:4: IDENT
                    {
                    IDENT438=(Atom)match(input,IDENT,FOLLOW_IDENT_in_varDim4775); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENT.add(IDENT438);


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
                    // 769:10: -> ^( D_ARR_DIM IDENT )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:769:13: ^( D_ARR_DIM IDENT )
                        {
                        BaseNode root_1 = (BaseNode)adaptor.nil();
                        root_1 = (BaseNode)adaptor.becomeRoot(
                        (BaseNode)adaptor.create(D_ARR_DIM, "D_ARR_DIM")
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
                case 3 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:770:4: 
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
                    // 770:4: -> ^( D_ARR_DIM NIL )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:770:7: ^( D_ARR_DIM NIL )
                        {
                        BaseNode root_1 = (BaseNode)adaptor.nil();
                        root_1 = (BaseNode)adaptor.becomeRoot(
                        (BaseNode)adaptor.create(D_ARR_DIM, "D_ARR_DIM")
                        , root_1);

                        adaptor.addChild(root_1, 
                        (BaseNode)adaptor.create(NIL, "NIL")
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
            if ( state.backtracking>0 ) { memoize(input, 111, varDim_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "varDim"


    public static class varDeclList_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "varDeclList"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:772:1: varDeclList : ( typeName varDeclList | varInit ( ',' varInit )* -> ( varInit )+ );
    public final pollenParser.varDeclList_return varDeclList() throws RecognitionException {
        pollenParser.varDeclList_return retval = new pollenParser.varDeclList_return();
        retval.start = input.LT(1);

        int varDeclList_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom char_literal442=null;
        pollenParser.typeName_return typeName439 =null;

        pollenParser.varDeclList_return varDeclList440 =null;

        pollenParser.varInit_return varInit441 =null;

        pollenParser.varInit_return varInit443 =null;


        BaseNode char_literal442_tree=null;
        RewriteRuleTokenStream stream_133=new RewriteRuleTokenStream(adaptor,"token 133");
        RewriteRuleSubtreeStream stream_varInit=new RewriteRuleSubtreeStream(adaptor,"rule varInit");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 112) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:773:2: ( typeName varDeclList | varInit ( ',' varInit )* -> ( varInit )+ )
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==IDENT) ) {
                int LA101_1 = input.LA(2);

                if ( (synpred181_pollen()) ) {
                    alt101=1;
                }
                else if ( (true) ) {
                    alt101=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 101, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA101_0==150||LA101_0==152||(LA101_0 >= 175 && LA101_0 <= 177)||LA101_0==190||(LA101_0 >= 194 && LA101_0 <= 196)) ) {
                alt101=1;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 101, 0, input);

                throw nvae;

            }
            switch (alt101) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:773:4: typeName varDeclList
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    pushFollow(FOLLOW_typeName_in_varDeclList4806);
                    typeName439=typeName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeName439.getTree());

                    pushFollow(FOLLOW_varDeclList_in_varDeclList4808);
                    varDeclList440=varDeclList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDeclList440.getTree());

                    }
                    break;
                case 2 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:774:4: varInit ( ',' varInit )*
                    {
                    pushFollow(FOLLOW_varInit_in_varDeclList4813);
                    varInit441=varInit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_varInit.add(varInit441.getTree());

                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:774:12: ( ',' varInit )*
                    loop100:
                    do {
                        int alt100=2;
                        int LA100_0 = input.LA(1);

                        if ( (LA100_0==133) ) {
                            int LA100_1 = input.LA(2);

                            if ( (synpred182_pollen()) ) {
                                alt100=1;
                            }


                        }


                        switch (alt100) {
                    	case 1 :
                    	    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:774:13: ',' varInit
                    	    {
                    	    char_literal442=(Atom)match(input,133,FOLLOW_133_in_varDeclList4816); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_133.add(char_literal442);


                    	    pushFollow(FOLLOW_varInit_in_varDeclList4818);
                    	    varInit443=varInit();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_varInit.add(varInit443.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop100;
                        }
                    } while (true);


                    // AST REWRITE
                    // elements: varInit
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (BaseNode)adaptor.nil();
                    // 774:31: -> ( varInit )+
                    {
                        if ( !(stream_varInit.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_varInit.hasNext() ) {
                            adaptor.addChild(root_0, stream_varInit.nextTree());

                        }
                        stream_varInit.reset();

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
            if ( state.backtracking>0 ) { memoize(input, 112, varDeclList_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "varDeclList"


    public static class varInit_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "varInit"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:776:1: varInit : IDENT ^ ( ASSIGN ! expr )? ;
    public final pollenParser.varInit_return varInit() throws RecognitionException {
        pollenParser.varInit_return retval = new pollenParser.varInit_return();
        retval.start = input.LT(1);

        int varInit_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom IDENT444=null;
        Atom ASSIGN445=null;
        pollenParser.expr_return expr446 =null;


        BaseNode IDENT444_tree=null;
        BaseNode ASSIGN445_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 113) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:778:2: ( IDENT ^ ( ASSIGN ! expr )? )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:778:4: IDENT ^ ( ASSIGN ! expr )?
            {
            root_0 = (BaseNode)adaptor.nil();


            IDENT444=(Atom)match(input,IDENT,FOLLOW_IDENT_in_varInit4843); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENT444_tree = 
            (BaseNode)adaptor.create(IDENT444)
            ;
            root_0 = (BaseNode)adaptor.becomeRoot(IDENT444_tree, root_0);
            }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:778:11: ( ASSIGN ! expr )?
            int alt102=2;
            int LA102_0 = input.LA(1);

            if ( (LA102_0==ASSIGN) ) {
                alt102=1;
            }
            switch (alt102) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:778:12: ASSIGN ! expr
                    {
                    ASSIGN445=(Atom)match(input,ASSIGN,FOLLOW_ASSIGN_in_varInit4847); if (state.failed) return retval;

                    pushFollow(FOLLOW_expr_in_varInit4850);
                    expr446=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr446.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 113, varInit_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "varInit"


    public static class builtinType_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "builtinType"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:781:1: builtinType : ( 'bool' | 'byte' | 'int8' | 'int16' | 'int32' | 'string' | 'uint8' | 'uint16' | 'uint32' );
    public final pollenParser.builtinType_return builtinType() throws RecognitionException {
        pollenParser.builtinType_return retval = new pollenParser.builtinType_return();
        retval.start = input.LT(1);

        int builtinType_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom set447=null;

        BaseNode set447_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 114) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:782:5: ( 'bool' | 'byte' | 'int8' | 'int16' | 'int32' | 'string' | 'uint8' | 'uint16' | 'uint32' )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:
            {
            root_0 = (BaseNode)adaptor.nil();


            set447=(Atom)input.LT(1);

            if ( input.LA(1)==150||input.LA(1)==152||(input.LA(1) >= 175 && input.LA(1) <= 177)||input.LA(1)==190||(input.LA(1) >= 194 && input.LA(1) <= 196) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (BaseNode)adaptor.create(set447)
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
            if ( state.backtracking>0 ) { memoize(input, 114, builtinType_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "builtinType"


    public static class qualName_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "qualName"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:792:1: qualName : IDENT ( '.' IDENT )* -> ^( QNAME ( IDENT )+ ) ;
    public final pollenParser.qualName_return qualName() throws RecognitionException {
        pollenParser.qualName_return retval = new pollenParser.qualName_return();
        retval.start = input.LT(1);

        int qualName_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom IDENT448=null;
        Atom char_literal449=null;
        Atom IDENT450=null;

        BaseNode IDENT448_tree=null;
        BaseNode char_literal449_tree=null;
        BaseNode IDENT450_tree=null;
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleTokenStream stream_136=new RewriteRuleTokenStream(adaptor,"token 136");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 115) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:793:5: ( IDENT ( '.' IDENT )* -> ^( QNAME ( IDENT )+ ) )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:793:9: IDENT ( '.' IDENT )*
            {
            IDENT448=(Atom)match(input,IDENT,FOLLOW_IDENT_in_qualName4966); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENT.add(IDENT448);


            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:794:5: ( '.' IDENT )*
            loop103:
            do {
                int alt103=2;
                int LA103_0 = input.LA(1);

                if ( (LA103_0==136) ) {
                    int LA103_1 = input.LA(2);

                    if ( (synpred192_pollen()) ) {
                        alt103=1;
                    }


                }


                switch (alt103) {
            	case 1 :
            	    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:794:9: '.' IDENT
            	    {
            	    char_literal449=(Atom)match(input,136,FOLLOW_136_in_qualName4976); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_136.add(char_literal449);


            	    IDENT450=(Atom)match(input,IDENT,FOLLOW_IDENT_in_qualName4991); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_IDENT.add(IDENT450);


            	    }
            	    break;

            	default :
            	    break loop103;
                }
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
            // 796:10: -> ^( QNAME ( IDENT )+ )
            {
                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:796:13: ^( QNAME ( IDENT )+ )
                {
                BaseNode root_1 = (BaseNode)adaptor.nil();
                root_1 = (BaseNode)adaptor.becomeRoot(
                (BaseNode)adaptor.create(QNAME, "QNAME")
                , root_1);

                if ( !(stream_IDENT.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_IDENT.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_IDENT.nextNode()
                    );

                }
                stream_IDENT.reset();

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
            if ( state.backtracking>0 ) { memoize(input, 115, qualName_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "qualName"


    public static class arrayLit_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "arrayLit"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:798:1: arrayLit : '[' arrayLitList ']' -> ^( E_ARRLIT arrayLitList ) ;
    public final pollenParser.arrayLit_return arrayLit() throws RecognitionException {
        pollenParser.arrayLit_return retval = new pollenParser.arrayLit_return();
        retval.start = input.LT(1);

        int arrayLit_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom char_literal451=null;
        Atom char_literal453=null;
        pollenParser.arrayLitList_return arrayLitList452 =null;


        BaseNode char_literal451_tree=null;
        BaseNode char_literal453_tree=null;
        RewriteRuleTokenStream stream_145=new RewriteRuleTokenStream(adaptor,"token 145");
        RewriteRuleTokenStream stream_146=new RewriteRuleTokenStream(adaptor,"token 146");
        RewriteRuleSubtreeStream stream_arrayLitList=new RewriteRuleSubtreeStream(adaptor,"rule arrayLitList");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 116) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:799:2: ( '[' arrayLitList ']' -> ^( E_ARRLIT arrayLitList ) )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:799:4: '[' arrayLitList ']'
            {
            char_literal451=(Atom)match(input,145,FOLLOW_145_in_arrayLit5026); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_145.add(char_literal451);


            pushFollow(FOLLOW_arrayLitList_in_arrayLit5028);
            arrayLitList452=arrayLitList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_arrayLitList.add(arrayLitList452.getTree());

            char_literal453=(Atom)match(input,146,FOLLOW_146_in_arrayLit5030); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_146.add(char_literal453);


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
            // 799:25: -> ^( E_ARRLIT arrayLitList )
            {
                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:799:28: ^( E_ARRLIT arrayLitList )
                {
                BaseNode root_1 = (BaseNode)adaptor.nil();
                root_1 = (BaseNode)adaptor.becomeRoot(
                (BaseNode)adaptor.create(E_ARRLIT, "E_ARRLIT")
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
            if ( state.backtracking>0 ) { memoize(input, 116, arrayLit_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "arrayLit"


    public static class arrayLitList_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "arrayLitList"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:801:1: arrayLitList : ( arrayLitElem ( ',' arrayLitElem )* -> ( arrayLitElem )+ | -> NIL );
    public final pollenParser.arrayLitList_return arrayLitList() throws RecognitionException {
        pollenParser.arrayLitList_return retval = new pollenParser.arrayLitList_return();
        retval.start = input.LT(1);

        int arrayLitList_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom char_literal455=null;
        pollenParser.arrayLitElem_return arrayLitElem454 =null;

        pollenParser.arrayLitElem_return arrayLitElem456 =null;


        BaseNode char_literal455_tree=null;
        RewriteRuleTokenStream stream_133=new RewriteRuleTokenStream(adaptor,"token 133");
        RewriteRuleSubtreeStream stream_arrayLitElem=new RewriteRuleSubtreeStream(adaptor,"rule arrayLitElem");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 117) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:802:2: ( arrayLitElem ( ',' arrayLitElem )* -> ( arrayLitElem )+ | -> NIL )
            int alt105=2;
            int LA105_0 = input.LA(1);

            if ( (LA105_0==CHAR||LA105_0==HEX_LIT||LA105_0==IDENT||LA105_0==INT_LIT||LA105_0==OCT_LIT||LA105_0==REAL_LIT||LA105_0==STRING||LA105_0==166||LA105_0==182||LA105_0==192) ) {
                alt105=1;
            }
            else if ( (LA105_0==146) ) {
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
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:802:4: arrayLitElem ( ',' arrayLitElem )*
                    {
                    pushFollow(FOLLOW_arrayLitElem_in_arrayLitList5048);
                    arrayLitElem454=arrayLitElem();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_arrayLitElem.add(arrayLitElem454.getTree());

                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:802:17: ( ',' arrayLitElem )*
                    loop104:
                    do {
                        int alt104=2;
                        int LA104_0 = input.LA(1);

                        if ( (LA104_0==133) ) {
                            alt104=1;
                        }


                        switch (alt104) {
                    	case 1 :
                    	    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:802:18: ',' arrayLitElem
                    	    {
                    	    char_literal455=(Atom)match(input,133,FOLLOW_133_in_arrayLitList5051); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_133.add(char_literal455);


                    	    pushFollow(FOLLOW_arrayLitElem_in_arrayLitList5053);
                    	    arrayLitElem456=arrayLitElem();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_arrayLitElem.add(arrayLitElem456.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop104;
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
                    // 802:37: -> ( arrayLitElem )+
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
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:803:4: 
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
                    // 803:4: -> NIL
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
            if ( state.backtracking>0 ) { memoize(input, 117, arrayLitList_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "arrayLitList"


    public static class arrayLitElem_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "arrayLitElem"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:805:1: arrayLitElem : ( primitiveLit | nullLit | namedConstant );
    public final pollenParser.arrayLitElem_return arrayLitElem() throws RecognitionException {
        pollenParser.arrayLitElem_return retval = new pollenParser.arrayLitElem_return();
        retval.start = input.LT(1);

        int arrayLitElem_StartIndex = input.index();

        BaseNode root_0 = null;

        pollenParser.primitiveLit_return primitiveLit457 =null;

        pollenParser.nullLit_return nullLit458 =null;

        pollenParser.namedConstant_return namedConstant459 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 118) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:806:2: ( primitiveLit | nullLit | namedConstant )
            int alt106=3;
            switch ( input.LA(1) ) {
            case CHAR:
            case HEX_LIT:
            case INT_LIT:
            case OCT_LIT:
            case REAL_LIT:
            case STRING:
            case 166:
            case 192:
                {
                alt106=1;
                }
                break;
            case 182:
                {
                alt106=2;
                }
                break;
            case IDENT:
                {
                alt106=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 106, 0, input);

                throw nvae;

            }

            switch (alt106) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:806:4: primitiveLit
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    pushFollow(FOLLOW_primitiveLit_in_arrayLitElem5077);
                    primitiveLit457=primitiveLit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveLit457.getTree());

                    }
                    break;
                case 2 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:806:19: nullLit
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    pushFollow(FOLLOW_nullLit_in_arrayLitElem5081);
                    nullLit458=nullLit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, nullLit458.getTree());

                    }
                    break;
                case 3 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:806:29: namedConstant
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    pushFollow(FOLLOW_namedConstant_in_arrayLitElem5085);
                    namedConstant459=namedConstant();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, namedConstant459.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 118, arrayLitElem_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "arrayLitElem"


    public static class namedConstant_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "namedConstant"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:808:1: namedConstant : qualName ;
    public final pollenParser.namedConstant_return namedConstant() throws RecognitionException {
        pollenParser.namedConstant_return retval = new pollenParser.namedConstant_return();
        retval.start = input.LT(1);

        int namedConstant_StartIndex = input.index();

        BaseNode root_0 = null;

        pollenParser.qualName_return qualName460 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 119) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:809:2: ( qualName )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:809:4: qualName
            {
            root_0 = (BaseNode)adaptor.nil();


            pushFollow(FOLLOW_qualName_in_namedConstant5095);
            qualName460=qualName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, qualName460.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 119, namedConstant_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "namedConstant"


    public static class boolLit_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "boolLit"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:811:1: boolLit : ( 'true' | 'false' );
    public final pollenParser.boolLit_return boolLit() throws RecognitionException {
        pollenParser.boolLit_return retval = new pollenParser.boolLit_return();
        retval.start = input.LT(1);

        int boolLit_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom set461=null;

        BaseNode set461_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 120) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:812:2: ( 'true' | 'false' )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:
            {
            root_0 = (BaseNode)adaptor.nil();


            set461=(Atom)input.LT(1);

            if ( input.LA(1)==166||input.LA(1)==192 ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (BaseNode)adaptor.create(set461)
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
            if ( state.backtracking>0 ) { memoize(input, 120, boolLit_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "boolLit"


    public static class nullLit_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "nullLit"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:814:1: nullLit : 'null' ;
    public final pollenParser.nullLit_return nullLit() throws RecognitionException {
        pollenParser.nullLit_return retval = new pollenParser.nullLit_return();
        retval.start = input.LT(1);

        int nullLit_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom string_literal462=null;

        BaseNode string_literal462_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 121) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:815:2: ( 'null' )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:815:4: 'null'
            {
            root_0 = (BaseNode)adaptor.nil();


            string_literal462=(Atom)match(input,182,FOLLOW_182_in_nullLit5121); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal462_tree = 
            (BaseNode)adaptor.create(string_literal462)
            ;
            adaptor.addChild(root_0, string_literal462_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 121, nullLit_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "nullLit"


    public static class numLit_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "numLit"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:817:1: numLit : ( INT_LIT -> ^( E_NUMLIT INT_LIT ) | OCT_LIT -> ^( E_NUMLIT OCT_LIT ) | REAL_LIT -> ^( E_NUMLIT REAL_LIT ) | HEX_LIT -> ^( E_NUMLIT HEX_LIT ) );
    public final pollenParser.numLit_return numLit() throws RecognitionException {
        pollenParser.numLit_return retval = new pollenParser.numLit_return();
        retval.start = input.LT(1);

        int numLit_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom INT_LIT463=null;
        Atom OCT_LIT464=null;
        Atom REAL_LIT465=null;
        Atom HEX_LIT466=null;

        BaseNode INT_LIT463_tree=null;
        BaseNode OCT_LIT464_tree=null;
        BaseNode REAL_LIT465_tree=null;
        BaseNode HEX_LIT466_tree=null;
        RewriteRuleTokenStream stream_REAL_LIT=new RewriteRuleTokenStream(adaptor,"token REAL_LIT");
        RewriteRuleTokenStream stream_HEX_LIT=new RewriteRuleTokenStream(adaptor,"token HEX_LIT");
        RewriteRuleTokenStream stream_INT_LIT=new RewriteRuleTokenStream(adaptor,"token INT_LIT");
        RewriteRuleTokenStream stream_OCT_LIT=new RewriteRuleTokenStream(adaptor,"token OCT_LIT");


        	nlFlags.clear();	

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 122) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:821:2: ( INT_LIT -> ^( E_NUMLIT INT_LIT ) | OCT_LIT -> ^( E_NUMLIT OCT_LIT ) | REAL_LIT -> ^( E_NUMLIT REAL_LIT ) | HEX_LIT -> ^( E_NUMLIT HEX_LIT ) )
            int alt107=4;
            switch ( input.LA(1) ) {
            case INT_LIT:
                {
                alt107=1;
                }
                break;
            case OCT_LIT:
                {
                alt107=2;
                }
                break;
            case REAL_LIT:
                {
                alt107=3;
                }
                break;
            case HEX_LIT:
                {
                alt107=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 107, 0, input);

                throw nvae;

            }

            switch (alt107) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:821:4: INT_LIT
                    {
                    INT_LIT463=(Atom)match(input,INT_LIT,FOLLOW_INT_LIT_in_numLit5136); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INT_LIT.add(INT_LIT463);


                    if ( state.backtracking==0 ) {nlFlags.add(NumLitFlags.INT);}

                    // AST REWRITE
                    // elements: INT_LIT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (BaseNode)adaptor.nil();
                    // 821:45: -> ^( E_NUMLIT INT_LIT )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:821:48: ^( E_NUMLIT INT_LIT )
                        {
                        BaseNode root_1 = (BaseNode)adaptor.nil();
                        root_1 = (BaseNode)adaptor.becomeRoot(
                        (BaseNode)adaptor.create(E_NUMLIT, "E_NUMLIT")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_INT_LIT.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:822:5: OCT_LIT
                    {
                    OCT_LIT464=(Atom)match(input,OCT_LIT,FOLLOW_OCT_LIT_in_numLit5153); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OCT_LIT.add(OCT_LIT464);


                    if ( state.backtracking==0 ) {nlFlags.add(NumLitFlags.OCT);}

                    // AST REWRITE
                    // elements: OCT_LIT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (BaseNode)adaptor.nil();
                    // 822:46: -> ^( E_NUMLIT OCT_LIT )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:822:49: ^( E_NUMLIT OCT_LIT )
                        {
                        BaseNode root_1 = (BaseNode)adaptor.nil();
                        root_1 = (BaseNode)adaptor.becomeRoot(
                        (BaseNode)adaptor.create(E_NUMLIT, "E_NUMLIT")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_OCT_LIT.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 3 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:823:5: REAL_LIT
                    {
                    REAL_LIT465=(Atom)match(input,REAL_LIT,FOLLOW_REAL_LIT_in_numLit5170); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_REAL_LIT.add(REAL_LIT465);


                    if ( state.backtracking==0 ) {nlFlags.add(NumLitFlags.REAL);}

                    // AST REWRITE
                    // elements: REAL_LIT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (BaseNode)adaptor.nil();
                    // 823:48: -> ^( E_NUMLIT REAL_LIT )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:823:51: ^( E_NUMLIT REAL_LIT )
                        {
                        BaseNode root_1 = (BaseNode)adaptor.nil();
                        root_1 = (BaseNode)adaptor.becomeRoot(
                        (BaseNode)adaptor.create(E_NUMLIT, "E_NUMLIT")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_REAL_LIT.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 4 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:824:5: HEX_LIT
                    {
                    HEX_LIT466=(Atom)match(input,HEX_LIT,FOLLOW_HEX_LIT_in_numLit5187); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HEX_LIT.add(HEX_LIT466);


                    if ( state.backtracking==0 ) {nlFlags.add(NumLitFlags.HEX);}

                    // AST REWRITE
                    // elements: HEX_LIT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (BaseNode)adaptor.nil();
                    // 824:47: -> ^( E_NUMLIT HEX_LIT )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:824:50: ^( E_NUMLIT HEX_LIT )
                        {
                        BaseNode root_1 = (BaseNode)adaptor.nil();
                        root_1 = (BaseNode)adaptor.becomeRoot(
                        (BaseNode)adaptor.create(E_NUMLIT, "E_NUMLIT")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_HEX_LIT.nextNode()
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
            if ( state.backtracking>0 ) { memoize(input, 122, numLit_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "numLit"


    public static class primitiveLit_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "primitiveLit"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:826:1: primitiveLit : ( boolLit | numLit | STRING | CHAR );
    public final pollenParser.primitiveLit_return primitiveLit() throws RecognitionException {
        pollenParser.primitiveLit_return retval = new pollenParser.primitiveLit_return();
        retval.start = input.LT(1);

        int primitiveLit_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom STRING469=null;
        Atom CHAR470=null;
        pollenParser.boolLit_return boolLit467 =null;

        pollenParser.numLit_return numLit468 =null;


        BaseNode STRING469_tree=null;
        BaseNode CHAR470_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 123) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:827:2: ( boolLit | numLit | STRING | CHAR )
            int alt108=4;
            switch ( input.LA(1) ) {
            case 166:
            case 192:
                {
                alt108=1;
                }
                break;
            case HEX_LIT:
            case INT_LIT:
            case OCT_LIT:
            case REAL_LIT:
                {
                alt108=2;
                }
                break;
            case STRING:
                {
                alt108=3;
                }
                break;
            case CHAR:
                {
                alt108=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 108, 0, input);

                throw nvae;

            }

            switch (alt108) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:827:4: boolLit
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    pushFollow(FOLLOW_boolLit_in_primitiveLit5209);
                    boolLit467=boolLit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, boolLit467.getTree());

                    }
                    break;
                case 2 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:828:4: numLit
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    pushFollow(FOLLOW_numLit_in_primitiveLit5214);
                    numLit468=numLit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, numLit468.getTree());

                    }
                    break;
                case 3 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:829:4: STRING
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    STRING469=(Atom)match(input,STRING,FOLLOW_STRING_in_primitiveLit5219); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRING469_tree = 
                    (BaseNode)adaptor.create(STRING469)
                    ;
                    adaptor.addChild(root_0, STRING469_tree);
                    }

                    }
                    break;
                case 4 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:830:4: CHAR
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    CHAR470=(Atom)match(input,CHAR,FOLLOW_CHAR_in_primitiveLit5224); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CHAR470_tree = 
                    (BaseNode)adaptor.create(CHAR470)
                    ;
                    adaptor.addChild(root_0, CHAR470_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 123, primitiveLit_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "primitiveLit"


    public static class stmtInjection_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stmtInjection"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:832:1: stmtInjection : INJECT ( NL )* -> ^( INJECT_CODE INJECT ) ;
    public final pollenParser.stmtInjection_return stmtInjection() throws RecognitionException {
        pollenParser.stmtInjection_return retval = new pollenParser.stmtInjection_return();
        retval.start = input.LT(1);

        int stmtInjection_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom INJECT471=null;
        Atom NL472=null;

        BaseNode INJECT471_tree=null;
        BaseNode NL472_tree=null;
        RewriteRuleTokenStream stream_INJECT=new RewriteRuleTokenStream(adaptor,"token INJECT");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 124) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:833:2: ( INJECT ( NL )* -> ^( INJECT_CODE INJECT ) )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:833:4: INJECT ( NL )*
            {
            INJECT471=(Atom)match(input,INJECT,FOLLOW_INJECT_in_stmtInjection5234); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_INJECT.add(INJECT471);


            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:833:11: ( NL )*
            loop109:
            do {
                int alt109=2;
                int LA109_0 = input.LA(1);

                if ( (LA109_0==NL) ) {
                    int LA109_1 = input.LA(2);

                    if ( (synpred204_pollen()) ) {
                        alt109=1;
                    }


                }


                switch (alt109) {
            	case 1 :
            	    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:833:11: NL
            	    {
            	    NL472=(Atom)match(input,NL,FOLLOW_NL_in_stmtInjection5236); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_NL.add(NL472);


            	    }
            	    break;

            	default :
            	    break loop109;
                }
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
            // 833:15: -> ^( INJECT_CODE INJECT )
            {
                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:833:18: ^( INJECT_CODE INJECT )
                {
                BaseNode root_1 = (BaseNode)adaptor.nil();
                root_1 = (BaseNode)adaptor.becomeRoot(
                (BaseNode)adaptor.create(INJECT_CODE, "INJECT_CODE")
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
            if ( state.backtracking>0 ) { memoize(input, 124, stmtInjection_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "stmtInjection"


    public static class injectionCode_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "injectionCode"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:835:1: injectionCode : INJECT -> ^( INJECT_CODE INJECT ) ;
    public final pollenParser.injectionCode_return injectionCode() throws RecognitionException {
        pollenParser.injectionCode_return retval = new pollenParser.injectionCode_return();
        retval.start = input.LT(1);

        int injectionCode_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom INJECT473=null;

        BaseNode INJECT473_tree=null;
        RewriteRuleTokenStream stream_INJECT=new RewriteRuleTokenStream(adaptor,"token INJECT");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 125) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:838:2: ( INJECT -> ^( INJECT_CODE INJECT ) )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:838:4: INJECT
            {
            INJECT473=(Atom)match(input,INJECT,FOLLOW_INJECT_in_injectionCode5257); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_INJECT.add(INJECT473);


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
            // 838:11: -> ^( INJECT_CODE INJECT )
            {
                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:838:14: ^( INJECT_CODE INJECT )
                {
                BaseNode root_1 = (BaseNode)adaptor.nil();
                root_1 = (BaseNode)adaptor.becomeRoot(
                (BaseNode)adaptor.create(INJECT_CODE, "INJECT_CODE")
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
            if ( state.backtracking>0 ) { memoize(input, 125, injectionCode_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "injectionCode"


    public static class injectionList_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "injectionList"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:840:1: injectionList : INJECT ( ( NL )+ INJECT )+ -> ^( INJECT_CODE ( INJECT )+ ) ;
    public final pollenParser.injectionList_return injectionList() throws RecognitionException {
        pollenParser.injectionList_return retval = new pollenParser.injectionList_return();
        retval.start = input.LT(1);

        int injectionList_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom INJECT474=null;
        Atom NL475=null;
        Atom INJECT476=null;

        BaseNode INJECT474_tree=null;
        BaseNode NL475_tree=null;
        BaseNode INJECT476_tree=null;
        RewriteRuleTokenStream stream_INJECT=new RewriteRuleTokenStream(adaptor,"token INJECT");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 126) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:841:2: ( INJECT ( ( NL )+ INJECT )+ -> ^( INJECT_CODE ( INJECT )+ ) )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:841:4: INJECT ( ( NL )+ INJECT )+
            {
            INJECT474=(Atom)match(input,INJECT,FOLLOW_INJECT_in_injectionList5276); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_INJECT.add(INJECT474);


            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:841:11: ( ( NL )+ INJECT )+
            int cnt111=0;
            loop111:
            do {
                int alt111=2;
                int LA111_0 = input.LA(1);

                if ( (LA111_0==NL) ) {
                    alt111=1;
                }


                switch (alt111) {
            	case 1 :
            	    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:841:12: ( NL )+ INJECT
            	    {
            	    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:841:12: ( NL )+
            	    int cnt110=0;
            	    loop110:
            	    do {
            	        int alt110=2;
            	        int LA110_0 = input.LA(1);

            	        if ( (LA110_0==NL) ) {
            	            alt110=1;
            	        }


            	        switch (alt110) {
            	    	case 1 :
            	    	    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:841:12: NL
            	    	    {
            	    	    NL475=(Atom)match(input,NL,FOLLOW_NL_in_injectionList5279); if (state.failed) return retval; 
            	    	    if ( state.backtracking==0 ) stream_NL.add(NL475);


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt110 >= 1 ) break loop110;
            	    	    if (state.backtracking>0) {state.failed=true; return retval;}
            	                EarlyExitException eee =
            	                    new EarlyExitException(110, input);
            	                throw eee;
            	        }
            	        cnt110++;
            	    } while (true);


            	    INJECT476=(Atom)match(input,INJECT,FOLLOW_INJECT_in_injectionList5282); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_INJECT.add(INJECT476);


            	    }
            	    break;

            	default :
            	    if ( cnt111 >= 1 ) break loop111;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(111, input);
                        throw eee;
                }
                cnt111++;
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
            // 841:25: -> ^( INJECT_CODE ( INJECT )+ )
            {
                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:841:28: ^( INJECT_CODE ( INJECT )+ )
                {
                BaseNode root_1 = (BaseNode)adaptor.nil();
                root_1 = (BaseNode)adaptor.becomeRoot(
                (BaseNode)adaptor.create(INJECT_CODE, "INJECT_CODE")
                , root_1);

                if ( !(stream_INJECT.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_INJECT.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_INJECT.nextNode()
                    );

                }
                stream_INJECT.reset();

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
            if ( state.backtracking>0 ) { memoize(input, 126, injectionList_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "injectionList"


    public static class delim_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "delim"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:843:1: delim : ( ( SEMI ) ( NL )* ->| ( NL )+ ->| ( ( NL )* '}' )=> ( NL )* ->);
    public final pollenParser.delim_return delim() throws RecognitionException {
        pollenParser.delim_return retval = new pollenParser.delim_return();
        retval.start = input.LT(1);

        int delim_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom SEMI477=null;
        Atom NL478=null;
        Atom NL479=null;
        Atom NL480=null;

        BaseNode SEMI477_tree=null;
        BaseNode NL478_tree=null;
        BaseNode NL479_tree=null;
        BaseNode NL480_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 127) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:844:2: ( ( SEMI ) ( NL )* ->| ( NL )+ ->| ( ( NL )* '}' )=> ( NL )* ->)
            int alt115=3;
            int LA115_0 = input.LA(1);

            if ( (LA115_0==SEMI) ) {
                alt115=1;
            }
            else if ( (LA115_0==NL) ) {
                int LA115_2 = input.LA(2);

                if ( (synpred210_pollen()) ) {
                    alt115=2;
                }
                else if ( (synpred212_pollen()) ) {
                    alt115=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 115, 2, input);

                    throw nvae;

                }
            }
            else if ( (LA115_0==169) && (synpred212_pollen())) {
                alt115=3;
            }
            else if ( (LA115_0==173) && (synpred212_pollen())) {
                alt115=3;
            }
            else if ( (LA115_0==INJECT) && (synpred212_pollen())) {
                alt115=3;
            }
            else if ( (LA115_0==179) && (synpred212_pollen())) {
                alt115=3;
            }
            else if ( (LA115_0==180) && (synpred212_pollen())) {
                alt115=3;
            }
            else if ( (LA115_0==154) && (synpred212_pollen())) {
                alt115=3;
            }
            else if ( (LA115_0==186) && (synpred212_pollen())) {
                alt115=3;
            }
            else if ( (LA115_0==155) && (synpred212_pollen())) {
                alt115=3;
            }
            else if ( (LA115_0==162) && (synpred212_pollen())) {
                alt115=3;
            }
            else if ( (LA115_0==EOF) && (synpred212_pollen())) {
                alt115=3;
            }
            else if ( (LA115_0==202) && (synpred212_pollen())) {
                alt115=3;
            }
            else if ( (LA115_0==164) && (synpred212_pollen())) {
                alt115=3;
            }
            else if ( (LA115_0==188) && (synpred212_pollen())) {
                alt115=3;
            }
            else if ( (LA115_0==170) && (synpred212_pollen())) {
                alt115=3;
            }
            else if ( (LA115_0==150||LA115_0==152||(LA115_0 >= 175 && LA115_0 <= 177)||LA115_0==190||(LA115_0 >= 194 && LA115_0 <= 196)) && (synpred212_pollen())) {
                alt115=3;
            }
            else if ( (LA115_0==IDENT) && (synpred212_pollen())) {
                alt115=3;
            }
            else if ( (LA115_0==128) && (synpred212_pollen())) {
                alt115=3;
            }
            else if ( (LA115_0==156) && (synpred212_pollen())) {
                alt115=3;
            }
            else if ( (LA115_0==197) && (synpred212_pollen())) {
                alt115=3;
            }
            else if ( (LA115_0==181) && (synpred212_pollen())) {
                alt115=3;
            }
            else if ( (LA115_0==133) && (synpred212_pollen())) {
                alt115=3;
            }
            else if ( (LA115_0==153) && (synpred212_pollen())) {
                alt115=3;
            }
            else if ( (LA115_0==158) && (synpred212_pollen())) {
                alt115=3;
            }
            else if ( (LA115_0==144) && (synpred212_pollen())) {
                alt115=3;
            }
            else if ( (LA115_0==149) && (synpred212_pollen())) {
                alt115=3;
            }
            else if ( (LA115_0==185) && (synpred212_pollen())) {
                alt115=3;
            }
            else if ( (LA115_0==189) && (synpred212_pollen())) {
                alt115=3;
            }
            else if ( (LA115_0==151) && (synpred212_pollen())) {
                alt115=3;
            }
            else if ( (LA115_0==157) && (synpred212_pollen())) {
                alt115=3;
            }
            else if ( (LA115_0==168) && (synpred212_pollen())) {
                alt115=3;
            }
            else if ( (LA115_0==167) && (synpred212_pollen())) {
                alt115=3;
            }
            else if ( (LA115_0==191) && (synpred212_pollen())) {
                alt115=3;
            }
            else if ( (LA115_0==159) && (synpred212_pollen())) {
                alt115=3;
            }
            else if ( (LA115_0==171) && (synpred212_pollen())) {
                alt115=3;
            }
            else if ( (LA115_0==187) && (synpred212_pollen())) {
                alt115=3;
            }
            else if ( (LA115_0==198) && (synpred212_pollen())) {
                alt115=3;
            }
            else if ( (LA115_0==166||LA115_0==192) && (synpred212_pollen())) {
                alt115=3;
            }
            else if ( (LA115_0==INT_LIT) && (synpred212_pollen())) {
                alt115=3;
            }
            else if ( (LA115_0==OCT_LIT) && (synpred212_pollen())) {
                alt115=3;
            }
            else if ( (LA115_0==REAL_LIT) && (synpred212_pollen())) {
                alt115=3;
            }
            else if ( (LA115_0==HEX_LIT) && (synpred212_pollen())) {
                alt115=3;
            }
            else if ( (LA115_0==STRING) && (synpred212_pollen())) {
                alt115=3;
            }
            else if ( (LA115_0==CHAR) && (synpred212_pollen())) {
                alt115=3;
            }
            else if ( (LA115_0==182) && (synpred212_pollen())) {
                alt115=3;
            }
            else if ( (LA115_0==145) && (synpred212_pollen())) {
                alt115=3;
            }
            else if ( (LA115_0==LOG_NOT) && (synpred212_pollen())) {
                alt115=3;
            }
            else if ( (LA115_0==BIT_NOT) && (synpred212_pollen())) {
                alt115=3;
            }
            else if ( (LA115_0==134) && (synpred212_pollen())) {
                alt115=3;
            }
            else if ( (LA115_0==132||LA115_0==135) && (synpred212_pollen())) {
                alt115=3;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 115, 0, input);

                throw nvae;

            }
            switch (alt115) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:844:4: ( SEMI ) ( NL )*
                    {
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:844:4: ( SEMI )
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:844:5: SEMI
                    {
                    SEMI477=(Atom)match(input,SEMI,FOLLOW_SEMI_in_delim5304); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI477);


                    }


                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:844:11: ( NL )*
                    loop112:
                    do {
                        int alt112=2;
                        int LA112_0 = input.LA(1);

                        if ( (LA112_0==NL) ) {
                            int LA112_1 = input.LA(2);

                            if ( (synpred207_pollen()) ) {
                                alt112=1;
                            }


                        }


                        switch (alt112) {
                    	case 1 :
                    	    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:844:12: NL
                    	    {
                    	    NL478=(Atom)match(input,NL,FOLLOW_NL_in_delim5308); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_NL.add(NL478);


                    	    }
                    	    break;

                    	default :
                    	    break loop112;
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
                    // 844:17: ->
                    {
                        root_0 = null;
                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:845:4: ( NL )+
                    {
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:845:4: ( NL )+
                    int cnt113=0;
                    loop113:
                    do {
                        int alt113=2;
                        int LA113_0 = input.LA(1);

                        if ( (LA113_0==NL) ) {
                            int LA113_1 = input.LA(2);

                            if ( (synpred209_pollen()) ) {
                                alt113=1;
                            }


                        }


                        switch (alt113) {
                    	case 1 :
                    	    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:845:5: NL
                    	    {
                    	    NL479=(Atom)match(input,NL,FOLLOW_NL_in_delim5319); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_NL.add(NL479);


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
                    // 845:10: ->
                    {
                        root_0 = null;
                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 3 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:846:4: ( ( NL )* '}' )=> ( NL )*
                    {
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:846:20: ( NL )*
                    loop114:
                    do {
                        int alt114=2;
                        int LA114_0 = input.LA(1);

                        if ( (LA114_0==NL) ) {
                            int LA114_1 = input.LA(2);

                            if ( (synpred213_pollen()) ) {
                                alt114=1;
                            }


                        }


                        switch (alt114) {
                    	case 1 :
                    	    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:846:20: NL
                    	    {
                    	    NL480=(Atom)match(input,NL,FOLLOW_NL_in_delim5341); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_NL.add(NL480);


                    	    }
                    	    break;

                    	default :
                    	    break loop114;
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
                    // 846:24: ->
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
            if ( state.backtracking>0 ) { memoize(input, 127, delim_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "delim"


    public static class delim_implicit_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "delim_implicit"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:848:1: delim_implicit :;
    public final pollenParser.delim_implicit_return delim_implicit() throws RecognitionException {
        pollenParser.delim_implicit_return retval = new pollenParser.delim_implicit_return();
        retval.start = input.LT(1);

        int delim_implicit_StartIndex = input.index();

        BaseNode root_0 = null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 128) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:849:2: ()
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:850:2: 
            {
            root_0 = (BaseNode)adaptor.nil();


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (BaseNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 128, delim_implicit_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "delim_implicit"

    // $ANTLR start synpred2_pollen
    public final void synpred2_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:213:8: ( stmtInjection )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:213:8: stmtInjection
        {
        pushFollow(FOLLOW_stmtInjection_in_synpred2_pollen763);
        stmtInjection();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred2_pollen

    // $ANTLR start synpred6_pollen
    public final void synpred6_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:226:9: ( stmtExport )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:226:9: stmtExport
        {
        pushFollow(FOLLOW_stmtExport_in_synpred6_pollen864);
        stmtExport();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred6_pollen

    // $ANTLR start synpred9_pollen
    public final void synpred9_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:252:9: ( fcnDefinition )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:252:9: fcnDefinition
        {
        pushFollow(FOLLOW_fcnDefinition_in_synpred9_pollen973);
        fcnDefinition();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred9_pollen

    // $ANTLR start synpred11_pollen
    public final void synpred11_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:254:9: ( varDeclaration )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:254:9: varDeclaration
        {
        pushFollow(FOLLOW_varDeclaration_in_synpred11_pollen994);
        varDeclaration();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred11_pollen

    // $ANTLR start synpred15_pollen
    public final void synpred15_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:266:6: ( fcnDefinition )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:266:6: fcnDefinition
        {
        pushFollow(FOLLOW_fcnDefinition_in_synpred15_pollen1096);
        fcnDefinition();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred15_pollen

    // $ANTLR start synpred16_pollen
    public final void synpred16_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:267:8: ( varDeclaration )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:267:8: varDeclaration
        {
        pushFollow(FOLLOW_varDeclaration_in_synpred16_pollen1105);
        varDeclaration();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred16_pollen

    // $ANTLR start synpred20_pollen
    public final void synpred20_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:296:30: ( delim )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:296:30: delim
        {
        pushFollow(FOLLOW_delim_in_synpred20_pollen1224);
        delim();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred20_pollen

    // $ANTLR start synpred21_pollen
    public final void synpred21_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:296:4: ( IDENT ( ASSIGN INT_LIT ) ( delim )? )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:296:4: IDENT ( ASSIGN INT_LIT ) ( delim )?
        {
        match(input,IDENT,FOLLOW_IDENT_in_synpred21_pollen1213); if (state.failed) return ;

        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:296:11: ( ASSIGN INT_LIT )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:296:12: ASSIGN INT_LIT
        {
        match(input,ASSIGN,FOLLOW_ASSIGN_in_synpred21_pollen1217); if (state.failed) return ;

        match(input,INT_LIT,FOLLOW_INT_LIT_in_synpred21_pollen1220); if (state.failed) return ;

        }


        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:296:29: ( delim )?
        int alt116=2;
        int LA116_0 = input.LA(1);

        if ( (LA116_0==NL||LA116_0==SEMI) ) {
            alt116=1;
        }
        else if ( (LA116_0==EOF) ) {
            int LA116_3 = input.LA(2);

            if ( (synpred20_pollen()) ) {
                alt116=1;
            }
        }
        switch (alt116) {
            case 1 :
                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:296:30: delim
                {
                pushFollow(FOLLOW_delim_in_synpred21_pollen1224);
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
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:297:12: ( delim )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:297:12: delim
        {
        pushFollow(FOLLOW_delim_in_synpred22_pollen1235);
        delim();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred22_pollen

    // $ANTLR start synpred30_pollen
    public final void synpred30_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:324:7: ( fcnDefinitionHost )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:324:7: fcnDefinitionHost
        {
        pushFollow(FOLLOW_fcnDefinitionHost_in_synpred30_pollen1400);
        fcnDefinitionHost();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred30_pollen

    // $ANTLR start synpred32_pollen
    public final void synpred32_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:326:7: ( varDeclaration )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:326:7: varDeclaration
        {
        pushFollow(FOLLOW_varDeclaration_in_synpred32_pollen1416);
        varDeclaration();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred32_pollen

    // $ANTLR start synpred41_pollen
    public final void synpred41_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:364:7: ( '{' metaArgument ( ',' metaArgument )* '}' )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:364:7: '{' metaArgument ( ',' metaArgument )* '}'
        {
        match(input,199,FOLLOW_199_in_synpred41_pollen1699); if (state.failed) return ;

        pushFollow(FOLLOW_metaArgument_in_synpred41_pollen1701);
        metaArgument();

        state._fsp--;
        if (state.failed) return ;

        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:364:25: ( ',' metaArgument )*
        loop117:
        do {
            int alt117=2;
            int LA117_0 = input.LA(1);

            if ( (LA117_0==133) ) {
                alt117=1;
            }


            switch (alt117) {
        	case 1 :
        	    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:364:26: ',' metaArgument
        	    {
        	    match(input,133,FOLLOW_133_in_synpred41_pollen1705); if (state.failed) return ;

        	    pushFollow(FOLLOW_metaArgument_in_synpred41_pollen1707);
        	    metaArgument();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop117;
            }
        } while (true);


        match(input,202,FOLLOW_202_in_synpred41_pollen1711); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred41_pollen

    // $ANTLR start synpred48_pollen
    public final void synpred48_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:386:4: ( qualName metaArguments )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:386:4: qualName metaArguments
        {
        pushFollow(FOLLOW_qualName_in_synpred48_pollen1830);
        qualName();

        state._fsp--;
        if (state.failed) return ;

        pushFollow(FOLLOW_metaArguments_in_synpred48_pollen1832);
        metaArguments();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred48_pollen

    // $ANTLR start synpred50_pollen
    public final void synpred50_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:400:10: ( 'module' )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:400:11: 'module'
        {
        match(input,180,FOLLOW_180_in_synpred50_pollen1897); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred50_pollen

    // $ANTLR start synpred51_pollen
    public final void synpred51_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:401:8: ( 'class' )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:401:9: 'class'
        {
        match(input,154,FOLLOW_154_in_synpred51_pollen1917); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred51_pollen

    // $ANTLR start synpred52_pollen
    public final void synpred52_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:402:10: ( 'protocol' )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:402:11: 'protocol'
        {
        match(input,186,FOLLOW_186_in_synpred52_pollen1935); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred52_pollen

    // $ANTLR start synpred53_pollen
    public final void synpred53_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:403:10: ( 'composition' )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:403:11: 'composition'
        {
        match(input,155,FOLLOW_155_in_synpred53_pollen1953); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred53_pollen

    // $ANTLR start synpred54_pollen
    public final void synpred54_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:404:10: ( 'enum' )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:404:11: 'enum'
        {
        match(input,162,FOLLOW_162_in_synpred54_pollen1971); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred54_pollen

    // $ANTLR start synpred56_pollen
    public final void synpred56_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:416:23: ( NL )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:416:23: NL
        {
        match(input,NL,FOLLOW_NL_in_synpred56_pollen2055); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred56_pollen

    // $ANTLR start synpred60_pollen
    public final void synpred60_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:425:23: ( NL )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:425:23: NL
        {
        match(input,NL,FOLLOW_NL_in_synpred60_pollen2122); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred60_pollen

    // $ANTLR start synpred78_pollen
    public final void synpred78_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:452:10: ( ',' expr )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:452:10: ',' expr
        {
        match(input,133,FOLLOW_133_in_synpred78_pollen2310); if (state.failed) return ;

        pushFollow(FOLLOW_expr_in_synpred78_pollen2312);
        expr();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred78_pollen

    // $ANTLR start synpred79_pollen
    public final void synpred79_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:452:4: ( expr ( ',' expr )* )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:452:4: expr ( ',' expr )*
        {
        pushFollow(FOLLOW_expr_in_synpred79_pollen2307);
        expr();

        state._fsp--;
        if (state.failed) return ;

        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:452:9: ( ',' expr )*
        loop118:
        do {
            int alt118=2;
            int LA118_0 = input.LA(1);

            if ( (LA118_0==133) ) {
                alt118=1;
            }


            switch (alt118) {
        	case 1 :
        	    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:452:10: ',' expr
        	    {
        	    match(input,133,FOLLOW_133_in_synpred79_pollen2310); if (state.failed) return ;

        	    pushFollow(FOLLOW_expr_in_synpred79_pollen2312);
        	    expr();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop118;
            }
        } while (true);


        }

    }
    // $ANTLR end synpred79_pollen

    // $ANTLR start synpred80_pollen
    public final void synpred80_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:457:4: ( exprLogicalOr '?' expr ':' expr )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:457:4: exprLogicalOr '?' expr ':' expr
        {
        pushFollow(FOLLOW_exprLogicalOr_in_synpred80_pollen2347);
        exprLogicalOr();

        state._fsp--;
        if (state.failed) return ;

        match(input,143,FOLLOW_143_in_synpred80_pollen2349); if (state.failed) return ;

        pushFollow(FOLLOW_expr_in_synpred80_pollen2351);
        expr();

        state._fsp--;
        if (state.failed) return ;

        match(input,138,FOLLOW_138_in_synpred80_pollen2353); if (state.failed) return ;

        pushFollow(FOLLOW_expr_in_synpred80_pollen2355);
        expr();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred80_pollen

    // $ANTLR start synpred81_pollen
    public final void synpred81_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:461:20: ( '||' exprLogicalAnd )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:461:20: '||' exprLogicalAnd
        {
        match(input,201,FOLLOW_201_in_synpred81_pollen2399); if (state.failed) return ;

        pushFollow(FOLLOW_exprLogicalAnd_in_synpred81_pollen2401);
        exprLogicalAnd();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred81_pollen

    // $ANTLR start synpred82_pollen
    public final void synpred82_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:464:19: ( '&&' exprBitwiseOr )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:464:19: '&&' exprBitwiseOr
        {
        match(input,126,FOLLOW_126_in_synpred82_pollen2416); if (state.failed) return ;

        pushFollow(FOLLOW_exprBitwiseOr_in_synpred82_pollen2418);
        exprBitwiseOr();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred82_pollen

    // $ANTLR start synpred83_pollen
    public final void synpred83_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:467:20: ( '|' exprBitwiseXor )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:467:20: '|' exprBitwiseXor
        {
        match(input,200,FOLLOW_200_in_synpred83_pollen2433); if (state.failed) return ;

        pushFollow(FOLLOW_exprBitwiseXor_in_synpred83_pollen2435);
        exprBitwiseXor();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred83_pollen

    // $ANTLR start synpred84_pollen
    public final void synpred84_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:470:20: ( '^' exprBitwiseAnd )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:470:20: '^' exprBitwiseAnd
        {
        match(input,147,FOLLOW_147_in_synpred84_pollen2450); if (state.failed) return ;

        pushFollow(FOLLOW_exprBitwiseAnd_in_synpred84_pollen2452);
        exprBitwiseAnd();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred84_pollen

    // $ANTLR start synpred85_pollen
    public final void synpred85_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:473:18: ( '&' exprEquality )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:473:18: '&' exprEquality
        {
        match(input,127,FOLLOW_127_in_synpred85_pollen2467); if (state.failed) return ;

        pushFollow(FOLLOW_exprEquality_in_synpred85_pollen2469);
        exprEquality();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred85_pollen

    // $ANTLR start synpred86_pollen
    public final void synpred86_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:476:21: ( equalityOp exprRelational )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:476:21: equalityOp exprRelational
        {
        pushFollow(FOLLOW_equalityOp_in_synpred86_pollen2485);
        equalityOp();

        state._fsp--;
        if (state.failed) return ;

        pushFollow(FOLLOW_exprRelational_in_synpred86_pollen2487);
        exprRelational();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred86_pollen

    // $ANTLR start synpred87_pollen
    public final void synpred87_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:479:17: ( relationalOp exprShift )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:479:17: relationalOp exprShift
        {
        pushFollow(FOLLOW_relationalOp_in_synpred87_pollen2504);
        relationalOp();

        state._fsp--;
        if (state.failed) return ;

        pushFollow(FOLLOW_exprShift_in_synpred87_pollen2506);
        exprShift();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred87_pollen

    // $ANTLR start synpred88_pollen
    public final void synpred88_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:482:17: ( shiftOp exprAddSub )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:482:17: shiftOp exprAddSub
        {
        pushFollow(FOLLOW_shiftOp_in_synpred88_pollen2523);
        shiftOp();

        state._fsp--;
        if (state.failed) return ;

        pushFollow(FOLLOW_exprAddSub_in_synpred88_pollen2526);
        exprAddSub();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred88_pollen

    // $ANTLR start synpred89_pollen
    public final void synpred89_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:485:17: ( addSubOp exprMultDiv )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:485:17: addSubOp exprMultDiv
        {
        pushFollow(FOLLOW_addSubOp_in_synpred89_pollen2542);
        addSubOp();

        state._fsp--;
        if (state.failed) return ;

        pushFollow(FOLLOW_exprMultDiv_in_synpred89_pollen2544);
        exprMultDiv();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred89_pollen

    // $ANTLR start synpred90_pollen
    public final void synpred90_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:488:15: ( multDivModOp exprUnary )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:488:15: multDivModOp exprUnary
        {
        pushFollow(FOLLOW_multDivModOp_in_synpred90_pollen2559);
        multDivModOp();

        state._fsp--;
        if (state.failed) return ;

        pushFollow(FOLLOW_exprUnary_in_synpred90_pollen2561);
        exprUnary();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred90_pollen

    // $ANTLR start synpred111_pollen
    public final void synpred111_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:556:4: ( typeName qualName )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:556:4: typeName qualName
        {
        pushFollow(FOLLOW_typeName_in_synpred111_pollen2912);
        typeName();

        state._fsp--;
        if (state.failed) return ;

        pushFollow(FOLLOW_qualName_in_synpred111_pollen2914);
        qualName();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred111_pollen

    // $ANTLR start synpred112_pollen
    public final void synpred112_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:558:4: ({...}? typeName )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:558:4: {...}? typeName
        {
        if ( !((input.LT(1).getText().equals(ti.getTypeName()) )) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred112_pollen", "input.LT(1).getText().equals(ti.getTypeName()) ");
        }

        pushFollow(FOLLOW_typeName_in_synpred112_pollen2953);
        typeName();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred112_pollen

    // $ANTLR start synpred113_pollen
    public final void synpred113_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:560:4: ( qualName )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:560:4: qualName
        {
        pushFollow(FOLLOW_qualName_in_synpred113_pollen2983);
        qualName();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred113_pollen

    // $ANTLR start synpred115_pollen
    public final void synpred115_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:562:4: ( '(' typeName ( ',' typeName )* ')' qualName )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:562:5: '(' typeName ( ',' typeName )* ')' qualName
        {
        match(input,128,FOLLOW_128_in_synpred115_pollen3023); if (state.failed) return ;

        pushFollow(FOLLOW_typeName_in_synpred115_pollen3025);
        typeName();

        state._fsp--;
        if (state.failed) return ;

        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:562:18: ( ',' typeName )*
        loop120:
        do {
            int alt120=2;
            int LA120_0 = input.LA(1);

            if ( (LA120_0==133) ) {
                alt120=1;
            }


            switch (alt120) {
        	case 1 :
        	    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:562:19: ',' typeName
        	    {
        	    match(input,133,FOLLOW_133_in_synpred115_pollen3028); if (state.failed) return ;

        	    pushFollow(FOLLOW_typeName_in_synpred115_pollen3030);
        	    typeName();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop120;
            }
        } while (true);


        match(input,129,FOLLOW_129_in_synpred115_pollen3034); if (state.failed) return ;

        pushFollow(FOLLOW_qualName_in_synpred115_pollen3036);
        qualName();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred115_pollen

    // $ANTLR start synpred121_pollen
    public final void synpred121_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:593:4: ( '@' IDENT fcnArgumentList fieldOrArrayAccess )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:593:4: '@' IDENT fcnArgumentList fieldOrArrayAccess
        {
        match(input,144,FOLLOW_144_in_synpred121_pollen3250); if (state.failed) return ;

        match(input,IDENT,FOLLOW_IDENT_in_synpred121_pollen3253); if (state.failed) return ;

        pushFollow(FOLLOW_fcnArgumentList_in_synpred121_pollen3255);
        fcnArgumentList();

        state._fsp--;
        if (state.failed) return ;

        pushFollow(FOLLOW_fieldOrArrayAccess_in_synpred121_pollen3257);
        fieldOrArrayAccess();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred121_pollen

    // $ANTLR start synpred122_pollen
    public final void synpred122_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:594:4: ( '@' IDENT fieldOrArrayAccess )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:594:4: '@' IDENT fieldOrArrayAccess
        {
        match(input,144,FOLLOW_144_in_synpred122_pollen3263); if (state.failed) return ;

        match(input,IDENT,FOLLOW_IDENT_in_synpred122_pollen3266); if (state.failed) return ;

        pushFollow(FOLLOW_fieldOrArrayAccess_in_synpred122_pollen3268);
        fieldOrArrayAccess();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred122_pollen

    // $ANTLR start synpred123_pollen
    public final void synpred123_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:595:4: ( '@' )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:595:4: '@'
        {
        match(input,144,FOLLOW_144_in_synpred123_pollen3277); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred123_pollen

    // $ANTLR start synpred124_pollen
    public final void synpred124_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:596:4: ( qualName fcnArgumentList fieldOrArrayAccess )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:596:4: qualName fcnArgumentList fieldOrArrayAccess
        {
        pushFollow(FOLLOW_qualName_in_synpred124_pollen3284);
        qualName();

        state._fsp--;
        if (state.failed) return ;

        pushFollow(FOLLOW_fcnArgumentList_in_synpred124_pollen3286);
        fcnArgumentList();

        state._fsp--;
        if (state.failed) return ;

        pushFollow(FOLLOW_fieldOrArrayAccess_in_synpred124_pollen3288);
        fieldOrArrayAccess();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred124_pollen

    // $ANTLR start synpred126_pollen
    public final void synpred126_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:601:20: ( arrayAccess )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:601:20: arrayAccess
        {
        pushFollow(FOLLOW_arrayAccess_in_synpred126_pollen3327);
        arrayAccess();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred126_pollen

    // $ANTLR start synpred127_pollen
    public final void synpred127_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:601:5: ( ( fieldAccess | arrayAccess )+ )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:601:5: ( fieldAccess | arrayAccess )+
        {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:601:5: ( fieldAccess | arrayAccess )+
        int cnt122=0;
        loop122:
        do {
            int alt122=3;
            int LA122_0 = input.LA(1);

            if ( (LA122_0==136) ) {
                alt122=1;
            }
            else if ( (LA122_0==145) ) {
                alt122=2;
            }


            switch (alt122) {
        	case 1 :
        	    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:601:6: fieldAccess
        	    {
        	    pushFollow(FOLLOW_fieldAccess_in_synpred127_pollen3323);
        	    fieldAccess();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;
        	case 2 :
        	    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:601:20: arrayAccess
        	    {
        	    pushFollow(FOLLOW_arrayAccess_in_synpred127_pollen3327);
        	    arrayAccess();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    if ( cnt122 >= 1 ) break loop122;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(122, input);
                    throw eee;
            }
            cnt122++;
        } while (true);


        }

    }
    // $ANTLR end synpred127_pollen

    // $ANTLR start synpred128_pollen
    public final void synpred128_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:605:15: ( fcnArgumentList )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:605:15: fcnArgumentList
        {
        pushFollow(FOLLOW_fcnArgumentList_in_synpred128_pollen3351);
        fcnArgumentList();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred128_pollen

    // $ANTLR start synpred129_pollen
    public final void synpred129_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:608:9: ( exprList )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:608:9: exprList
        {
        pushFollow(FOLLOW_exprList_in_synpred129_pollen3378);
        exprList();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred129_pollen

    // $ANTLR start synpred132_pollen
    public final void synpred132_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:616:5: ( NL )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:616:5: NL
        {
        match(input,NL,FOLLOW_NL_in_synpred132_pollen3435); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred132_pollen

    // $ANTLR start synpred133_pollen
    public final void synpred133_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:619:5: ( stmtAssign delim )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:619:5: stmtAssign delim
        {
        pushFollow(FOLLOW_stmtAssign_in_synpred133_pollen3452);
        stmtAssign();

        state._fsp--;
        if (state.failed) return ;

        pushFollow(FOLLOW_delim_in_synpred133_pollen3454);
        delim();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred133_pollen

    // $ANTLR start synpred135_pollen
    public final void synpred135_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:621:4: ( stmtBind )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:621:4: stmtBind
        {
        pushFollow(FOLLOW_stmtBind_in_synpred135_pollen3466);
        stmtBind();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred135_pollen

    // $ANTLR start synpred147_pollen
    public final void synpred147_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:633:4: ( varDeclaration )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:633:4: varDeclaration
        {
        pushFollow(FOLLOW_varDeclaration_in_synpred147_pollen3531);
        varDeclaration();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred147_pollen

    // $ANTLR start synpred148_pollen
    public final void synpred148_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:634:4: ( stmtInjection )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:634:4: stmtInjection
        {
        pushFollow(FOLLOW_stmtInjection_in_synpred148_pollen3537);
        stmtInjection();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred148_pollen

    // $ANTLR start synpred149_pollen
    public final void synpred149_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:638:4: ( varOrFcnOrArray ASSIGN expr )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:638:4: varOrFcnOrArray ASSIGN expr
        {
        pushFollow(FOLLOW_varOrFcnOrArray_in_synpred149_pollen3554);
        varOrFcnOrArray();

        state._fsp--;
        if (state.failed) return ;

        match(input,ASSIGN,FOLLOW_ASSIGN_in_synpred149_pollen3556); if (state.failed) return ;

        pushFollow(FOLLOW_expr_in_synpred149_pollen3558);
        expr();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred149_pollen

    // $ANTLR start synpred150_pollen
    public final void synpred150_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:639:4: ( injectionCode ASSIGN expr )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:639:4: injectionCode ASSIGN expr
        {
        pushFollow(FOLLOW_injectionCode_in_synpred150_pollen3575);
        injectionCode();

        state._fsp--;
        if (state.failed) return ;

        match(input,ASSIGN,FOLLOW_ASSIGN_in_synpred150_pollen3577); if (state.failed) return ;

        pushFollow(FOLLOW_expr_in_synpred150_pollen3579);
        expr();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred150_pollen

    // $ANTLR start synpred151_pollen
    public final void synpred151_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:640:4: ( varOrFcnOrArray assignOp expr )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:640:4: varOrFcnOrArray assignOp expr
        {
        pushFollow(FOLLOW_varOrFcnOrArray_in_synpred151_pollen3601);
        varOrFcnOrArray();

        state._fsp--;
        if (state.failed) return ;

        pushFollow(FOLLOW_assignOp_in_synpred151_pollen3603);
        assignOp();

        state._fsp--;
        if (state.failed) return ;

        pushFollow(FOLLOW_expr_in_synpred151_pollen3605);
        expr();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred151_pollen

    // $ANTLR start synpred156_pollen
    public final void synpred156_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:659:4: ( 'return' ( '(' ) ( expr ( ',' expr )+ ) ( ')' ) delim )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:659:4: 'return' ( '(' ) ( expr ( ',' expr )+ ) ( ')' ) delim
        {
        match(input,189,FOLLOW_189_in_synpred156_pollen3758); if (state.failed) return ;

        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:659:13: ( '(' )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:659:14: '('
        {
        match(input,128,FOLLOW_128_in_synpred156_pollen3761); if (state.failed) return ;

        }


        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:659:19: ( expr ( ',' expr )+ )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:659:20: expr ( ',' expr )+
        {
        pushFollow(FOLLOW_expr_in_synpred156_pollen3765);
        expr();

        state._fsp--;
        if (state.failed) return ;

        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:659:25: ( ',' expr )+
        int cnt124=0;
        loop124:
        do {
            int alt124=2;
            int LA124_0 = input.LA(1);

            if ( (LA124_0==133) ) {
                alt124=1;
            }


            switch (alt124) {
        	case 1 :
        	    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:659:26: ',' expr
        	    {
        	    match(input,133,FOLLOW_133_in_synpred156_pollen3768); if (state.failed) return ;

        	    pushFollow(FOLLOW_expr_in_synpred156_pollen3770);
        	    expr();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    if ( cnt124 >= 1 ) break loop124;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(124, input);
                    throw eee;
            }
            cnt124++;
        } while (true);


        }


        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:659:38: ( ')' )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:659:39: ')'
        {
        match(input,129,FOLLOW_129_in_synpred156_pollen3776); if (state.failed) return ;

        }


        pushFollow(FOLLOW_delim_in_synpred156_pollen3779);
        delim();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred156_pollen

    // $ANTLR start synpred159_pollen
    public final void synpred159_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:681:9: ( typeName IDENT '=' expr )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:681:9: typeName IDENT '=' expr
        {
        pushFollow(FOLLOW_typeName_in_synpred159_pollen3988);
        typeName();

        state._fsp--;
        if (state.failed) return ;

        match(input,IDENT,FOLLOW_IDENT_in_synpred159_pollen3990); if (state.failed) return ;

        match(input,ASSIGN,FOLLOW_ASSIGN_in_synpred159_pollen3992); if (state.failed) return ;

        pushFollow(FOLLOW_expr_in_synpred159_pollen3994);
        expr();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred159_pollen

    // $ANTLR start synpred164_pollen
    public final void synpred164_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:707:4: ( 'if' stmtIfBlock stmtsElif ( stmtElse )? )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:707:4: 'if' stmtIfBlock stmtsElif ( stmtElse )?
        {
        match(input,171,FOLLOW_171_in_synpred164_pollen4259); if (state.failed) return ;

        pushFollow(FOLLOW_stmtIfBlock_in_synpred164_pollen4261);
        stmtIfBlock();

        state._fsp--;
        if (state.failed) return ;

        pushFollow(FOLLOW_stmtsElif_in_synpred164_pollen4263);
        stmtsElif();

        state._fsp--;
        if (state.failed) return ;

        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:707:31: ( stmtElse )?
        int alt125=2;
        int LA125_0 = input.LA(1);

        if ( (LA125_0==161) ) {
            alt125=1;
        }
        switch (alt125) {
            case 1 :
                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:707:31: stmtElse
                {
                pushFollow(FOLLOW_stmtElse_in_synpred164_pollen4265);
                stmtElse();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        }

    }
    // $ANTLR end synpred164_pollen

    // $ANTLR start synpred165_pollen
    public final void synpred165_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:708:4: ( 'if' stmtIfBlock stmtElse )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:708:4: 'if' stmtIfBlock stmtElse
        {
        match(input,171,FOLLOW_171_in_synpred165_pollen4284); if (state.failed) return ;

        pushFollow(FOLLOW_stmtIfBlock_in_synpred165_pollen4286);
        stmtIfBlock();

        state._fsp--;
        if (state.failed) return ;

        pushFollow(FOLLOW_stmtElse_in_synpred165_pollen4288);
        stmtElse();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred165_pollen

    // $ANTLR start synpred172_pollen
    public final void synpred172_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:741:4: ( typeName IDENT ( ASSIGN expr )? ',' )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:741:5: typeName IDENT ( ASSIGN expr )? ','
        {
        pushFollow(FOLLOW_typeName_in_synpred172_pollen4531);
        typeName();

        state._fsp--;
        if (state.failed) return ;

        match(input,IDENT,FOLLOW_IDENT_in_synpred172_pollen4533); if (state.failed) return ;

        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:741:20: ( ASSIGN expr )?
        int alt126=2;
        int LA126_0 = input.LA(1);

        if ( (LA126_0==ASSIGN) ) {
            alt126=1;
        }
        switch (alt126) {
            case 1 :
                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:741:21: ASSIGN expr
                {
                match(input,ASSIGN,FOLLOW_ASSIGN_in_synpred172_pollen4536); if (state.failed) return ;

                pushFollow(FOLLOW_expr_in_synpred172_pollen4538);
                expr();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        match(input,133,FOLLOW_133_in_synpred172_pollen4542); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred172_pollen

    // $ANTLR start synpred173_pollen
    public final void synpred173_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:742:5: ( typeName IDENT '[' )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:742:6: typeName IDENT '['
        {
        pushFollow(FOLLOW_typeName_in_synpred173_pollen4554);
        typeName();

        state._fsp--;
        if (state.failed) return ;

        match(input,IDENT,FOLLOW_IDENT_in_synpred173_pollen4556); if (state.failed) return ;

        match(input,145,FOLLOW_145_in_synpred173_pollen4558); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred173_pollen

    // $ANTLR start synpred174_pollen
    public final void synpred174_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:743:5: ( typeName '(' )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:743:6: typeName '('
        {
        pushFollow(FOLLOW_typeName_in_synpred174_pollen4571);
        typeName();

        state._fsp--;
        if (state.failed) return ;

        match(input,128,FOLLOW_128_in_synpred174_pollen4573); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred174_pollen

    // $ANTLR start synpred175_pollen
    public final void synpred175_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:744:6: ( typeName varInit )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:744:6: typeName varInit
        {
        pushFollow(FOLLOW_typeName_in_synpred175_pollen4587);
        typeName();

        state._fsp--;
        if (state.failed) return ;

        pushFollow(FOLLOW_varInit_in_synpred175_pollen4589);
        varInit();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred175_pollen

    // $ANTLR start synpred178_pollen
    public final void synpred178_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:764:5: ( '[' varDim ']' )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:764:5: '[' varDim ']'
        {
        match(input,145,FOLLOW_145_in_synpred178_pollen4735); if (state.failed) return ;

        pushFollow(FOLLOW_varDim_in_synpred178_pollen4737);
        varDim();

        state._fsp--;
        if (state.failed) return ;

        match(input,146,FOLLOW_146_in_synpred178_pollen4739); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred178_pollen

    // $ANTLR start synpred181_pollen
    public final void synpred181_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:773:4: ( typeName varDeclList )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:773:4: typeName varDeclList
        {
        pushFollow(FOLLOW_typeName_in_synpred181_pollen4806);
        typeName();

        state._fsp--;
        if (state.failed) return ;

        pushFollow(FOLLOW_varDeclList_in_synpred181_pollen4808);
        varDeclList();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred181_pollen

    // $ANTLR start synpred182_pollen
    public final void synpred182_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:774:13: ( ',' varInit )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:774:13: ',' varInit
        {
        match(input,133,FOLLOW_133_in_synpred182_pollen4816); if (state.failed) return ;

        pushFollow(FOLLOW_varInit_in_synpred182_pollen4818);
        varInit();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred182_pollen

    // $ANTLR start synpred192_pollen
    public final void synpred192_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:794:9: ( '.' IDENT )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:794:9: '.' IDENT
        {
        match(input,136,FOLLOW_136_in_synpred192_pollen4976); if (state.failed) return ;

        match(input,IDENT,FOLLOW_IDENT_in_synpred192_pollen4991); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred192_pollen

    // $ANTLR start synpred204_pollen
    public final void synpred204_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:833:11: ( NL )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:833:11: NL
        {
        match(input,NL,FOLLOW_NL_in_synpred204_pollen5236); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred204_pollen

    // $ANTLR start synpred207_pollen
    public final void synpred207_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:844:12: ( NL )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:844:12: NL
        {
        match(input,NL,FOLLOW_NL_in_synpred207_pollen5308); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred207_pollen

    // $ANTLR start synpred209_pollen
    public final void synpred209_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:845:5: ( NL )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:845:5: NL
        {
        match(input,NL,FOLLOW_NL_in_synpred209_pollen5319); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred209_pollen

    // $ANTLR start synpred210_pollen
    public final void synpred210_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:845:4: ( ( NL )+ )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:845:4: ( NL )+
        {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:845:4: ( NL )+
        int cnt131=0;
        loop131:
        do {
            int alt131=2;
            int LA131_0 = input.LA(1);

            if ( (LA131_0==NL) ) {
                alt131=1;
            }


            switch (alt131) {
        	case 1 :
        	    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:845:5: NL
        	    {
        	    match(input,NL,FOLLOW_NL_in_synpred210_pollen5319); if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    if ( cnt131 >= 1 ) break loop131;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(131, input);
                    throw eee;
            }
            cnt131++;
        } while (true);


        }

    }
    // $ANTLR end synpred210_pollen

    // $ANTLR start synpred212_pollen
    public final void synpred212_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:846:4: ( ( NL )* '}' )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:846:5: ( NL )* '}'
        {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:846:5: ( NL )*
        loop132:
        do {
            int alt132=2;
            int LA132_0 = input.LA(1);

            if ( (LA132_0==NL) ) {
                alt132=1;
            }


            switch (alt132) {
        	case 1 :
        	    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:846:6: NL
        	    {
        	    match(input,NL,FOLLOW_NL_in_synpred212_pollen5331); if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop132;
            }
        } while (true);


        match(input,202,FOLLOW_202_in_synpred212_pollen5335); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred212_pollen

    // $ANTLR start synpred213_pollen
    public final void synpred213_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:846:20: ( NL )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:846:20: NL
        {
        match(input,NL,FOLLOW_NL_in_synpred213_pollen5341); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred213_pollen

    // Delegated rules

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
    public final boolean synpred213_pollen() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred213_pollen_fragment(); // can never throw exception
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
    public final boolean synpred56_pollen() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred56_pollen_fragment(); // can never throw exception
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
    public final boolean synpred89_pollen() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred89_pollen_fragment(); // can never throw exception
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
    public final boolean synpred115_pollen() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred115_pollen_fragment(); // can never throw exception
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
    public final boolean synpred178_pollen() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred178_pollen_fragment(); // can never throw exception
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
    public final boolean synpred112_pollen() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred112_pollen_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred204_pollen() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred204_pollen_fragment(); // can never throw exception
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
    public final boolean synpred181_pollen() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred181_pollen_fragment(); // can never throw exception
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
    public final boolean synpred182_pollen() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred182_pollen_fragment(); // can never throw exception
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
    public final boolean synpred90_pollen() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred90_pollen_fragment(); // can never throw exception
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
    public final boolean synpred207_pollen() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred207_pollen_fragment(); // can never throw exception
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
    public final boolean synpred147_pollen() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred147_pollen_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred60_pollen() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred60_pollen_fragment(); // can never throw exception
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
    public final boolean synpred41_pollen() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred41_pollen_fragment(); // can never throw exception
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
    public final boolean synpred113_pollen() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred113_pollen_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred192_pollen() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred192_pollen_fragment(); // can never throw exception
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
    public final boolean synpred126_pollen() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred126_pollen_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred165_pollen() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred165_pollen_fragment(); // can never throw exception
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
    public final boolean synpred135_pollen() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred135_pollen_fragment(); // can never throw exception
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
    public final boolean synpred52_pollen() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred52_pollen_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred54_pollen() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred54_pollen_fragment(); // can never throw exception
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


 

    public static final BitSet FOLLOW_NL_in_unit718 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200100L,0x051822040C000000L});
    public static final BitSet FOLLOW_unitPackage_in_unit722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtPackage_in_unitPackage748 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L,0x041822040C000000L});
    public static final BitSet FOLLOW_importList_in_unitPackage754 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L,0x041800040C000000L});
    public static final BitSet FOLLOW_stmtInjection_in_unitPackage763 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L,0x041800040C000000L});
    public static final BitSet FOLLOW_unitTypeDefinition_in_unitPackage774 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_stmtInjection_in_unitPackage785 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_unitPackage795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_184_in_stmtPackage805 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_qualName_in_stmtPackage807 = new BitSet(new long[]{0x0000000000000000L,0x0000000010200000L});
    public static final BitSet FOLLOW_delim_in_stmtPackage809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_164_in_stmtExport841 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_qualName_in_stmtExport844 = new BitSet(new long[]{0x0000000000000000L,0x0000000010200000L});
    public static final BitSet FOLLOW_delim_in_stmtExport846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtExport_in_exportList864 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_154_in_classDefinition910 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_classDef_in_classDefinition912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_classDef931 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L,0x0000100000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_implementsClause_in_classDef942 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_braceOpen_in_classDef949 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200110L,0x5023840415400001L,0x000000000000043CL});
    public static final BitSet FOLLOW_classFeature_in_classDef952 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200110L,0x5023840415400001L,0x000000000000043CL});
    public static final BitSet FOLLOW_braceClose_in_classDef956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fcnDefinition_in_classFeature973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumDefinition_in_classFeature984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDeclaration_in_classFeature994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classDefinition_in_classFeature1004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtInjection_in_classFeature1014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_180_in_moduleDefinition1031 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_moduleDefinition1033 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L,0x0000100000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_implementsClause_in_moduleDefinition1048 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_braceOpen_in_moduleDefinition1057 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200110L,0x5023840415400001L,0x000000000000043CL});
    public static final BitSet FOLLOW_moduleFeature_in_moduleDefinition1060 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200110L,0x5023840415400001L,0x000000000000043CL});
    public static final BitSet FOLLOW_braceClose_in_moduleDefinition1064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fcnDefinition_in_moduleFeature1096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDeclaration_in_moduleFeature1105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumDefinition_in_moduleFeature1112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classDefinition_in_moduleFeature1119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtInjection_in_moduleFeature1125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_162_in_enumDefinition1138 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_enumDef_in_enumDefinition1140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_enumDef1170 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_braceOpen_in_enumDef1180 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_enumList_in_enumDef1182 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_braceClose_in_enumDef1184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumElement_in_enumList1195 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_133_in_enumList1198 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_enumElement_in_enumList1201 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_IDENT_in_enumElement1213 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ASSIGN_in_enumElement1217 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_INT_LIT_in_enumElement1220 = new BitSet(new long[]{0x0000000000000000L,0x0000000010200000L});
    public static final BitSet FOLLOW_delim_in_enumElement1224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_enumElement1231 = new BitSet(new long[]{0x0000000000000000L,0x0000000010200000L});
    public static final BitSet FOLLOW_delim_in_enumElement1235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_186_in_protocolDefinition1247 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_protocolDefinition1249 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L,0x0000002000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_extendsClause_in_protocolDefinition1257 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_braceOpen_in_protocolDefinition1263 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200110L,0x5003840401400001L,0x000000000000041CL});
    public static final BitSet FOLLOW_protocolFeature_in_protocolDefinition1266 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200110L,0x5003840401400001L,0x000000000000041CL});
    public static final BitSet FOLLOW_braceClose_in_protocolDefinition1270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumDefinition_in_protocolFeature1304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fcnDeclaration_in_protocolFeature1314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtInjection_in_protocolFeature1325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_155_in_compositionDefinition1338 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_compositionDefinition1340 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L,0x0000002000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_extendsClause_in_compositionDefinition1348 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_braceOpen_in_compositionDefinition1355 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200110L,0x5023841411400001L,0x000000000000043CL});
    public static final BitSet FOLLOW_compositionFeature_in_compositionDefinition1358 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200110L,0x5023841411400001L,0x000000000000043CL});
    public static final BitSet FOLLOW_braceClose_in_compositionDefinition1362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exportList_in_compositionFeature1392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fcnDefinitionHost_in_compositionFeature1400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumDefinition_in_compositionFeature1408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDeclaration_in_compositionFeature1416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtInjection_in_compositionFeature1423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_importFrom_in_stmtImport1440 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_173_in_stmtImport1451 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_qualName_in_stmtImport1453 = new BitSet(new long[]{0x0000000000000000L,0x0000000010200000L,0x0000000000100000L,0x0000000000000080L});
    public static final BitSet FOLLOW_metaArguments_in_stmtImport1456 = new BitSet(new long[]{0x0000000000000000L,0x0000000010200000L,0x0000000000100000L});
    public static final BitSet FOLLOW_importAs_in_stmtImport1469 = new BitSet(new long[]{0x0000000000000000L,0x0000000010200000L});
    public static final BitSet FOLLOW_delim_in_stmtImport1472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_169_in_importFrom1508 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_qualName_in_importFrom1511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_148_in_importAs1524 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_qualName_in_importAs1527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtImport_in_importList1542 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000220000000000L});
    public static final BitSet FOLLOW_179_in_meta1576 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_braceOpen_in_meta1585 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x4003800001400000L,0x000000000000001EL});
    public static final BitSet FOLLOW_metaFormalParameters_in_meta1587 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_braceClose_in_meta1589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_metaFormalParameter_in_metaFormalParameters1614 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_133_in_metaFormalParameters1618 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x4003800001400000L,0x000000000000001EL});
    public static final BitSet FOLLOW_metaFormalParameter_in_metaFormalParameters1620 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_metaFormalParameterType_in_metaFormalParameter1643 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_metaFormalParameter1645 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ASSIGN_in_metaFormalParameter1648 = new BitSet(new long[]{0x0000000000000800L,0x0000000045000412L,0x4003804001400000L,0x000000000000001DL});
    public static final BitSet FOLLOW_metaArgument_in_metaFormalParameter1650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_193_in_metaFormalParameterType1679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_builtinType_in_metaFormalParameterType1686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_199_in_metaArguments1699 = new BitSet(new long[]{0x0000000000000800L,0x0000000045000412L,0x4003804001400000L,0x000000000000001DL});
    public static final BitSet FOLLOW_metaArgument_in_metaArguments1701 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L,0x0000000000000400L});
    public static final BitSet FOLLOW_133_in_metaArguments1705 = new BitSet(new long[]{0x0000000000000800L,0x0000000045000412L,0x4003804001400000L,0x000000000000001DL});
    public static final BitSet FOLLOW_metaArgument_in_metaArguments1707 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L,0x0000000000000400L});
    public static final BitSet FOLLOW_202_in_metaArguments1711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_199_in_metaArguments1727 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_202_in_metaArguments1729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numLit_in_metaArgument1758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolLit_in_metaArgument1764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_metaArgument1770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_in_metaArgument1776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeNameScalar_in_metaArgument1781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeNameScalar_in_typeName1795 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_145_in_typeName1798 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_146_in_typeName1800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_builtinType_in_typeNameScalar1815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_userTypeName_in_typeNameScalar1820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qualName_in_userTypeName1830 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_metaArguments_in_userTypeName1832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qualName_in_userTypeName1847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_meta_in_unitTypeDefinition1880 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x041000040C000000L});
    public static final BitSet FOLLOW_moduleDefinition_in_unitTypeDefinition1902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classDefinition_in_unitTypeDefinition1923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_protocolDefinition_in_unitTypeDefinition1940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compositionDefinition_in_unitTypeDefinition1958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumDefinition_in_unitTypeDefinition1976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_165_in_extendsClause2001 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_extendsClause2004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_172_in_implementsClause2023 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_implementsClause2026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NL_in_braceClose2046 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_202_in_braceClose2051 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
    public static final BitSet FOLLOW_NL_in_braceClose2055 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
    public static final BitSet FOLLOW_NL_in_braceCloseAtEOF2079 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_202_in_braceCloseAtEOF2084 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
    public static final BitSet FOLLOW_NL_in_braceCloseAtEOF2088 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
    public static final BitSet FOLLOW_NL_in_braceOpen2113 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_199_in_braceOpen2118 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
    public static final BitSet FOLLOW_NL_in_braceOpen2122 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
    public static final BitSet FOLLOW_LOG_NOT_in_logicalNotOp2285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BIT_NOT_in_bitwiseNotOp2296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_exprList2307 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_133_in_exprList2310 = new BitSet(new long[]{0x0000000000000C00L,0x0000000045001512L,0x00600040000300D1L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_exprList2312 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_exprLogicalOr_in_expr2347 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_143_in_expr2349 = new BitSet(new long[]{0x0000000000000C00L,0x0000000045001512L,0x00600040000300D1L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_expr2351 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_138_in_expr2353 = new BitSet(new long[]{0x0000000000000C00L,0x0000000045001512L,0x00600040000300D1L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_expr2355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exprLogicalOr_in_expr2372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exprLogicalAnd_in_exprLogicalOr2396 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_201_in_exprLogicalOr2399 = new BitSet(new long[]{0x0000000000000C00L,0x0000000045001512L,0x00600040000300D1L,0x0000000000000001L});
    public static final BitSet FOLLOW_exprLogicalAnd_in_exprLogicalOr2401 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_exprBitwiseOr_in_exprLogicalAnd2413 = new BitSet(new long[]{0x0000000000000002L,0x4000000000000000L});
    public static final BitSet FOLLOW_126_in_exprLogicalAnd2416 = new BitSet(new long[]{0x0000000000000C00L,0x0000000045001512L,0x00600040000300D1L,0x0000000000000001L});
    public static final BitSet FOLLOW_exprBitwiseOr_in_exprLogicalAnd2418 = new BitSet(new long[]{0x0000000000000002L,0x4000000000000000L});
    public static final BitSet FOLLOW_exprBitwiseXor_in_exprBitwiseOr2430 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_200_in_exprBitwiseOr2433 = new BitSet(new long[]{0x0000000000000C00L,0x0000000045001512L,0x00600040000300D1L,0x0000000000000001L});
    public static final BitSet FOLLOW_exprBitwiseXor_in_exprBitwiseOr2435 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_exprBitwiseAnd_in_exprBitwiseXor2447 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_147_in_exprBitwiseXor2450 = new BitSet(new long[]{0x0000000000000C00L,0x0000000045001512L,0x00600040000300D1L,0x0000000000000001L});
    public static final BitSet FOLLOW_exprBitwiseAnd_in_exprBitwiseXor2452 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_exprEquality_in_exprBitwiseAnd2464 = new BitSet(new long[]{0x0000000000000002L,0x8000000000000000L});
    public static final BitSet FOLLOW_127_in_exprBitwiseAnd2467 = new BitSet(new long[]{0x0000000000000C00L,0x0000000045001512L,0x00600040000300D1L,0x0000000000000001L});
    public static final BitSet FOLLOW_exprEquality_in_exprBitwiseAnd2469 = new BitSet(new long[]{0x0000000000000002L,0x8000000000000000L});
    public static final BitSet FOLLOW_exprRelational_in_exprEquality2481 = new BitSet(new long[]{0x0000020000000002L,0x0000000000400000L});
    public static final BitSet FOLLOW_equalityOp_in_exprEquality2485 = new BitSet(new long[]{0x0000000000000C00L,0x0000000045001512L,0x00600040000300D1L,0x0000000000000001L});
    public static final BitSet FOLLOW_exprRelational_in_exprEquality2487 = new BitSet(new long[]{0x0000020000000002L,0x0000000000400000L});
    public static final BitSet FOLLOW_exprShift_in_exprRelational2499 = new BitSet(new long[]{0x8000000000000002L,0x0000000000004000L,0x0000000000002800L});
    public static final BitSet FOLLOW_relationalOp_in_exprRelational2504 = new BitSet(new long[]{0x0000000000000C00L,0x0000000045001512L,0x00600040000300D1L,0x0000000000000001L});
    public static final BitSet FOLLOW_exprShift_in_exprRelational2506 = new BitSet(new long[]{0x8000000000000002L,0x0000000000004000L,0x0000000000002800L});
    public static final BitSet FOLLOW_exprAddSub_in_exprShift2519 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000005000L});
    public static final BitSet FOLLOW_shiftOp_in_exprShift2523 = new BitSet(new long[]{0x0000000000000C00L,0x0000000045001512L,0x00600040000300D1L,0x0000000000000001L});
    public static final BitSet FOLLOW_exprAddSub_in_exprShift2526 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000005000L});
    public static final BitSet FOLLOW_exprMultDiv_in_exprAddSub2539 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000048L});
    public static final BitSet FOLLOW_addSubOp_in_exprAddSub2542 = new BitSet(new long[]{0x0000000000000C00L,0x0000000045001512L,0x00600040000300D1L,0x0000000000000001L});
    public static final BitSet FOLLOW_exprMultDiv_in_exprAddSub2544 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000048L});
    public static final BitSet FOLLOW_exprUnary_in_exprMultDiv2556 = new BitSet(new long[]{0x0000000000000002L,0x2000000000000000L,0x0000000000000204L});
    public static final BitSet FOLLOW_multDivModOp_in_exprMultDiv2559 = new BitSet(new long[]{0x0000000000000C00L,0x0000000045001512L,0x00600040000300D1L,0x0000000000000001L});
    public static final BitSet FOLLOW_exprUnary_in_exprMultDiv2561 = new BitSet(new long[]{0x0000000000000002L,0x2000000000000000L,0x0000000000000204L});
    public static final BitSet FOLLOW_primitiveLit_in_exprUnary2573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_injectionCode_in_exprUnary2578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nullLit_in_exprUnary2583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayLit_in_exprUnary2588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LOG_NOT_in_exprUnary2593 = new BitSet(new long[]{0x0000000000000C00L,0x0000000045001512L,0x00600040000300D1L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_exprUnary2595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BIT_NOT_in_exprUnary2600 = new BitSet(new long[]{0x0000000000000C00L,0x0000000045001512L,0x00600040000300D1L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_exprUnary2602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_128_in_exprUnary2607 = new BitSet(new long[]{0x0000000000000C00L,0x0000000045001512L,0x00600040000300D1L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_exprUnary2609 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_129_in_exprUnary2611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_134_in_exprUnary2616 = new BitSet(new long[]{0x0000000000000C00L,0x0000000045001512L,0x00600040000300D1L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_exprUnary2618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varOrFcnOrArray_in_exprUnary2623 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000090L});
    public static final BitSet FOLLOW_set_in_exprUnary2642 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L,0x0020000000010000L});
    public static final BitSet FOLLOW_varOrFcnOrArray_in_exprUnary2654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_188_in_fcnDefinition2674 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L,0x4003840001400001L,0x000000000000001CL});
    public static final BitSet FOLLOW_170_in_fcnDefinition2685 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L,0x4003800001400001L,0x000000000000001CL});
    public static final BitSet FOLLOW_fcnType_fcnName_in_fcnDefinition2695 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_fcnFormalParameterList_in_fcnDefinition2697 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_fcnBody_in_fcnDefinition2699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_188_in_fcnDefinitionHost2735 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L,0x4003840001400001L,0x000000000000001CL});
    public static final BitSet FOLLOW_170_in_fcnDefinitionHost2740 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L,0x4003800001400001L,0x000000000000001CL});
    public static final BitSet FOLLOW_fcnType_fcnName_in_fcnDefinitionHost2751 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_fcnFormalParameterList_in_fcnDefinitionHost2754 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_fcnBody_in_fcnDefinitionHost2756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_188_in_fcnAttr2793 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_170_in_fcnAttr2804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_braceOpen_in_fcnBody2820 = new BitSet(new long[]{0x0000000000000C00L,0x0000000045201512L,0xEA638DC0B1E300D1L,0x000000000000047DL});
    public static final BitSet FOLLOW_stmts_in_fcnBody2823 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_braceClose_in_fcnBody2827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_188_in_fcnDeclaration2859 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L,0x4003840001400001L,0x000000000000001CL});
    public static final BitSet FOLLOW_170_in_fcnDeclaration2870 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L,0x4003800001400001L,0x000000000000001CL});
    public static final BitSet FOLLOW_fcnType_fcnName_in_fcnDeclaration2880 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_fcnFormalParameterList_in_fcnDeclaration2883 = new BitSet(new long[]{0x0000000000000000L,0x0000000010200000L});
    public static final BitSet FOLLOW_delim_in_fcnDeclaration2886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeName_in_fcnType_fcnName2912 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_qualName_in_fcnType_fcnName2914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeName_in_fcnType_fcnName2953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qualName_in_fcnType_fcnName2983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fcnTypes_fcnName_in_fcnType_fcnName3041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_128_in_fcnTypes_fcnName3052 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L,0x4003800001400000L,0x000000000000001CL});
    public static final BitSet FOLLOW_fcnTypes_in_fcnTypes_fcnName3054 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_129_in_fcnTypes_fcnName3056 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_qualName_in_fcnTypes_fcnName3058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeName_in_fcnTypes3079 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_133_in_fcnTypes3082 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L,0x4003800001400000L,0x000000000000001CL});
    public static final BitSet FOLLOW_typeName_in_fcnTypes3084 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_128_in_fcnFormalParameterList3105 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L,0x4003800001400002L,0x000000000000001CL});
    public static final BitSet FOLLOW_fcnFormalParameters_in_fcnFormalParameterList3107 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_129_in_fcnFormalParameterList3109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fcnFormalParameter_in_fcnFormalParameters3127 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_133_in_fcnFormalParameters3130 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L,0x4003800001400000L,0x000000000000001CL});
    public static final BitSet FOLLOW_fcnFormalParameter_in_fcnFormalParameters3132 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_typeName_in_fcnFormalParameter3169 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_fcnFormalParameter3171 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ASSIGN_in_fcnFormalParameter3174 = new BitSet(new long[]{0x0000000000000800L,0x0000000045000412L,0x0040004000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_arrayLitElem_in_fcnFormalParameter3177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_128_in_fcnArgumentList3190 = new BitSet(new long[]{0x0000000000000C00L,0x0000000045001512L,0x00600040000300D1L,0x0000000000000001L});
    public static final BitSet FOLLOW_fcnArguments_in_fcnArgumentList3192 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_129_in_fcnArgumentList3194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exprList_in_fcnArguments3212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_181_in_varOrFcnOrArray3225 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L,0x4003800001400000L,0x000000000000001CL});
    public static final BitSet FOLLOW_typeName_in_varOrFcnOrArray3227 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_fcnArgumentList_in_varOrFcnOrArray3229 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020100L});
    public static final BitSet FOLLOW_fieldOrArrayAccess_in_varOrFcnOrArray3231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_144_in_varOrFcnOrArray3250 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_varOrFcnOrArray3253 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_fcnArgumentList_in_varOrFcnOrArray3255 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020100L});
    public static final BitSet FOLLOW_fieldOrArrayAccess_in_varOrFcnOrArray3257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_144_in_varOrFcnOrArray3263 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_varOrFcnOrArray3266 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020100L});
    public static final BitSet FOLLOW_fieldOrArrayAccess_in_varOrFcnOrArray3268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_144_in_varOrFcnOrArray3277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qualName_in_varOrFcnOrArray3284 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_fcnArgumentList_in_varOrFcnOrArray3286 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020100L});
    public static final BitSet FOLLOW_fieldOrArrayAccess_in_varOrFcnOrArray3288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qualName_in_varOrFcnOrArray3308 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020100L});
    public static final BitSet FOLLOW_fieldOrArrayAccess_in_varOrFcnOrArray3310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fieldAccess_in_fieldOrArrayAccess3323 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000020100L});
    public static final BitSet FOLLOW_arrayAccess_in_fieldOrArrayAccess3327 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000020100L});
    public static final BitSet FOLLOW_136_in_fieldAccess3346 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_fieldAccess3348 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_fcnArgumentList_in_fieldAccess3351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_145_in_arrayAccess3375 = new BitSet(new long[]{0x0000000000000C00L,0x0000000045001512L,0x00600040000700D1L,0x0000000000000001L});
    public static final BitSet FOLLOW_exprList_in_arrayAccess3378 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_146_in_arrayAccess3382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_braceOpen_in_stmtBlock3403 = new BitSet(new long[]{0x0000000000000C00L,0x0000000045201512L,0xEA638DC0B1E300D1L,0x000000000000047DL});
    public static final BitSet FOLLOW_stmts_in_stmtBlock3405 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_braceClose_in_stmtBlock3407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmt_in_stmts3427 = new BitSet(new long[]{0x0000000000000C02L,0x0000000045001512L,0xEA638DC0B1E300D1L,0x000000000000007DL});
    public static final BitSet FOLLOW_NL_in_stmts3435 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
    public static final BitSet FOLLOW_stmtAssign_in_stmt3452 = new BitSet(new long[]{0x0000000000000000L,0x0000000010200000L});
    public static final BitSet FOLLOW_delim_in_stmt3454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtAssert_in_stmt3461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtBind_in_stmt3466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtPrint_in_stmt3471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtReturn_in_stmt3476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtBreak_in_stmt3481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtContinue_in_stmt3487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtForEach_in_stmt3493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtFor_in_stmt3499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtSwitch_in_stmt3504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtDoWhile_in_stmt3510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtIf_in_stmt3515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtProvided_in_stmt3520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtWhile_in_stmt3525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDeclaration_in_stmt3531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtInjection_in_stmt3537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_stmt3542 = new BitSet(new long[]{0x0000000000000000L,0x0000000010200000L});
    public static final BitSet FOLLOW_delim_in_stmt3544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varOrFcnOrArray_in_stmtAssign3554 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ASSIGN_in_stmtAssign3556 = new BitSet(new long[]{0x0000000000000C00L,0x0000000045001512L,0x00600040000300D1L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_stmtAssign3558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_injectionCode_in_stmtAssign3575 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ASSIGN_in_stmtAssign3577 = new BitSet(new long[]{0x0000000000000C00L,0x0000000045001512L,0x00600040000300D1L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_stmtAssign3579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varOrFcnOrArray_in_stmtAssign3601 = new BitSet(new long[]{0x0000000000004390L,0x00000000880C2000L});
    public static final BitSet FOLLOW_assignOp_in_stmtAssign3603 = new BitSet(new long[]{0x0000000000000C00L,0x0000000045001512L,0x00600040000300D1L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_stmtAssign3605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_injectionCode_in_stmtAssign3623 = new BitSet(new long[]{0x0000000000004390L,0x00000000880C2000L});
    public static final BitSet FOLLOW_assignOp_in_stmtAssign3625 = new BitSet(new long[]{0x0000000000000C00L,0x0000000045001512L,0x00600040000300D1L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_stmtAssign3627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_149_in_stmtAssert3653 = new BitSet(new long[]{0x0000000000000C00L,0x0000000055201512L,0x00600040000300D1L,0x0000000000000001L});
    public static final BitSet FOLLOW_exprList_in_stmtAssert3655 = new BitSet(new long[]{0x0000000000000000L,0x0000000010200000L});
    public static final BitSet FOLLOW_delim_in_stmtAssert3657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varOrFcnOrArray_in_stmtBind3675 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_BIND_in_stmtBind3677 = new BitSet(new long[]{0x0000000000000C00L,0x0000000045001512L,0x00600040000300D1L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_stmtBind3680 = new BitSet(new long[]{0x0000000000000000L,0x0000000010200000L});
    public static final BitSet FOLLOW_delim_in_stmtBind3683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_185_in_stmtPrint3705 = new BitSet(new long[]{0x0000000000000C00L,0x0000000045001512L,0x00E40048000300D1L,0x0000000000000001L});
    public static final BitSet FOLLOW_stmtPrintTarget_in_stmtPrint3708 = new BitSet(new long[]{0x0000000000000C00L,0x0000000045001512L,0x00600040000300D1L,0x0000000000000001L});
    public static final BitSet FOLLOW_exprList_in_stmtPrint3712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_189_in_stmtReturn3758 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_128_in_stmtReturn3761 = new BitSet(new long[]{0x0000000000000C00L,0x0000000045001512L,0x00600040000300D1L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_stmtReturn3765 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_133_in_stmtReturn3768 = new BitSet(new long[]{0x0000000000000C00L,0x0000000045001512L,0x00600040000300D1L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_stmtReturn3770 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000022L});
    public static final BitSet FOLLOW_129_in_stmtReturn3776 = new BitSet(new long[]{0x0000000000000000L,0x0000000010200000L});
    public static final BitSet FOLLOW_delim_in_stmtReturn3779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_189_in_stmtReturn3793 = new BitSet(new long[]{0x0000000000000C00L,0x0000000045001512L,0x00600040000300D1L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_stmtReturn3797 = new BitSet(new long[]{0x0000000000000000L,0x0000000010200000L});
    public static final BitSet FOLLOW_delim_in_stmtReturn3801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_151_in_stmtBreak3819 = new BitSet(new long[]{0x0000000000000000L,0x0000000010200000L});
    public static final BitSet FOLLOW_delim_in_stmtBreak3821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_157_in_stmtContinue3837 = new BitSet(new long[]{0x0000000000000000L,0x0000000010200000L});
    public static final BitSet FOLLOW_delim_in_stmtContinue3839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_167_in_stmtFor3860 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_128_in_stmtFor3862 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000110L,0x4023800001410000L,0x000000000000001CL});
    public static final BitSet FOLLOW_stmtForInit_in_stmtFor3864 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_SEMI_in_stmtFor3866 = new BitSet(new long[]{0x0000000000000C00L,0x0000000055001512L,0x00600040000300D1L,0x0000000000000001L});
    public static final BitSet FOLLOW_stmtForCond_in_stmtFor3868 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_SEMI_in_stmtFor3870 = new BitSet(new long[]{0x0000000000000C00L,0x0000000045001512L,0x00600040000300D3L,0x0000000000000001L});
    public static final BitSet FOLLOW_stmtForNext_in_stmtFor3872 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_129_in_stmtFor3874 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_stmtBlock_in_stmtFor3876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_stmtForCond3944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeName_in_stmtForInit3988 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_stmtForInit3990 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ASSIGN_in_stmtForInit3992 = new BitSet(new long[]{0x0000000000000C00L,0x0000000045001512L,0x00600040000300D1L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_stmtForInit3994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtAssign_in_stmtForInit4031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_stmtForNext4074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_168_in_stmtForEach4087 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_128_in_stmtForEach4089 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_stmtForEach4091 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_174_in_stmtForEach4093 = new BitSet(new long[]{0x0000000000000C00L,0x0000000045001512L,0x00600040000300D1L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_stmtForEach4095 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_129_in_stmtForEach4097 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_stmtBlock_in_stmtForEach4099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_191_in_stmtSwitch4125 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_128_in_stmtSwitch4127 = new BitSet(new long[]{0x0000000000000C00L,0x0000000045001512L,0x00600040000300D1L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_stmtSwitch4129 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_129_in_stmtSwitch4131 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_braceOpen_in_stmtSwitch4133 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L,0x0000000042000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_stmtsCase_in_stmtSwitch4135 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_braceClose_in_stmtSwitch4137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtCase_in_stmtsCase4161 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000042000000L});
    public static final BitSet FOLLOW_153_in_stmtCase4177 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_INT_LIT_in_stmtCase4180 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_138_in_stmtCase4183 = new BitSet(new long[]{0x0000000000000C00L,0x0000000045201512L,0xEA638DC0B1E300D1L,0x000000000000007DL});
    public static final BitSet FOLLOW_stmts_in_stmtCase4185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_158_in_stmtCase4200 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_138_in_stmtCase4202 = new BitSet(new long[]{0x0000000000000C00L,0x0000000045201512L,0xEA638DC0B1E300D1L,0x000000000000007DL});
    public static final BitSet FOLLOW_stmts_in_stmtCase4204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_159_in_stmtDoWhile4222 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_stmtBlock_in_stmtDoWhile4224 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_198_in_stmtDoWhile4226 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_128_in_stmtDoWhile4228 = new BitSet(new long[]{0x0000000000000C00L,0x0000000045001512L,0x00600040000300D1L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_stmtDoWhile4230 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_129_in_stmtDoWhile4232 = new BitSet(new long[]{0x0000000000000000L,0x0000000010200000L});
    public static final BitSet FOLLOW_delim_in_stmtDoWhile4234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_171_in_stmtIf4259 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_stmtIfBlock_in_stmtIf4261 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_stmtsElif_in_stmtIf4263 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_stmtElse_in_stmtIf4265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_171_in_stmtIf4284 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_stmtIfBlock_in_stmtIf4286 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_stmtElse_in_stmtIf4288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_171_in_stmtIf4303 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_stmtIfBlock_in_stmtIf4305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_128_in_stmtIfBlock4323 = new BitSet(new long[]{0x0000000000000C00L,0x0000000045001512L,0x00600040000300D1L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_stmtIfBlock4325 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_129_in_stmtIfBlock4327 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_stmtBlock_in_stmtIfBlock4329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtElif_in_stmtsElif4349 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_160_in_stmtElif4360 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_stmtIfBlock_in_stmtElif4362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_161_in_stmtElse4380 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_stmtBlock_in_stmtElse4382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_187_in_stmtProvided4400 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_128_in_stmtProvided4402 = new BitSet(new long[]{0x0000000000000C00L,0x0000000045001512L,0x00600040000300D1L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_stmtProvided4404 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_129_in_stmtProvided4406 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_stmtBlock_in_stmtProvided4408 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_stmtElse_in_stmtProvided4411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_198_in_stmtWhile4438 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_128_in_stmtWhile4440 = new BitSet(new long[]{0x0000000000000C00L,0x0000000045001512L,0x00600040000300D1L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_stmtWhile4442 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_129_in_stmtWhile4443 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_stmtBlock_in_stmtWhile4445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varAttr_in_varDeclaration4467 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L,0x4023800001400000L,0x000000000000001CL});
    public static final BitSet FOLLOW_varDecl_in_varDeclaration4469 = new BitSet(new long[]{0x0000000000000000L,0x0000000010200000L});
    public static final BitSet FOLLOW_delim_in_varDeclaration4471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_156_in_varAttr4496 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000040010000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_197_in_varAttr4505 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000040010000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_170_in_varAttr4515 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000040010000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_varDeclList_in_varDecl4547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varArray_in_varDecl4563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varFcnRef_in_varDecl4579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeName_in_varDecl4587 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_varInit_in_varDecl4589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_181_in_varDecl4595 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L,0x4003800001400000L,0x000000000000001CL});
    public static final BitSet FOLLOW_typeName_in_varDecl4597 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_varDecl4599 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_fcnArgumentList_in_varDecl4601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeName_in_varFcnRef4625 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_fcnRefTypeList_in_varFcnRef4627 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_varFcnRef4629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_128_in_fcnRefTypeList4654 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L,0x4003800001400002L,0x000000000000001CL});
    public static final BitSet FOLLOW_fcnRefTypes_in_fcnRefTypeList4656 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_129_in_fcnRefTypeList4658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeName_in_fcnRefTypes4678 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_133_in_fcnRefTypes4681 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L,0x4003800001400000L,0x000000000000001CL});
    public static final BitSet FOLLOW_typeName_in_fcnRefTypes4683 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_typeName_in_varArray4707 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_varArray4709 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_varArraySpec_in_varArray4711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_145_in_varArraySpec4735 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000410L,0x0000000000040000L});
    public static final BitSet FOLLOW_varDim_in_varArraySpec4737 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_146_in_varArraySpec4739 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_INT_LIT_in_varDim4760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_varDim4775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeName_in_varDeclList4806 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L,0x4003800001400000L,0x000000000000001CL});
    public static final BitSet FOLLOW_varDeclList_in_varDeclList4808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varInit_in_varDeclList4813 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_133_in_varDeclList4816 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_varInit_in_varDeclList4818 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_IDENT_in_varInit4843 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ASSIGN_in_varInit4847 = new BitSet(new long[]{0x0000000000000C00L,0x0000000045001512L,0x00600040000300D1L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_varInit4850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_qualName4966 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_136_in_qualName4976 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_qualName4991 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_145_in_arrayLit5026 = new BitSet(new long[]{0x0000000000000800L,0x0000000045000412L,0x0040004000040000L,0x0000000000000001L});
    public static final BitSet FOLLOW_arrayLitList_in_arrayLit5028 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_146_in_arrayLit5030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayLitElem_in_arrayLitList5048 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_133_in_arrayLitList5051 = new BitSet(new long[]{0x0000000000000800L,0x0000000045000412L,0x0040004000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_arrayLitElem_in_arrayLitList5053 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_primitiveLit_in_arrayLitElem5077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nullLit_in_arrayLitElem5081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_namedConstant_in_arrayLitElem5085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qualName_in_namedConstant5095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_182_in_nullLit5121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_LIT_in_numLit5136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OCT_LIT_in_numLit5153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REAL_LIT_in_numLit5170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HEX_LIT_in_numLit5187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolLit_in_primitiveLit5209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numLit_in_primitiveLit5214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_primitiveLit5219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_in_primitiveLit5224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INJECT_in_stmtInjection5234 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
    public static final BitSet FOLLOW_NL_in_stmtInjection5236 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
    public static final BitSet FOLLOW_INJECT_in_injectionCode5257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INJECT_in_injectionList5276 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_NL_in_injectionList5279 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200100L});
    public static final BitSet FOLLOW_INJECT_in_injectionList5282 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
    public static final BitSet FOLLOW_SEMI_in_delim5304 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
    public static final BitSet FOLLOW_NL_in_delim5308 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
    public static final BitSet FOLLOW_NL_in_delim5319 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
    public static final BitSet FOLLOW_NL_in_delim5341 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
    public static final BitSet FOLLOW_stmtInjection_in_synpred2_pollen763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtExport_in_synpred6_pollen864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fcnDefinition_in_synpred9_pollen973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDeclaration_in_synpred11_pollen994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fcnDefinition_in_synpred15_pollen1096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDeclaration_in_synpred16_pollen1105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_delim_in_synpred20_pollen1224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_synpred21_pollen1213 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ASSIGN_in_synpred21_pollen1217 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_INT_LIT_in_synpred21_pollen1220 = new BitSet(new long[]{0x0000000000000000L,0x0000000010200000L});
    public static final BitSet FOLLOW_delim_in_synpred21_pollen1224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_delim_in_synpred22_pollen1235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fcnDefinitionHost_in_synpred30_pollen1400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDeclaration_in_synpred32_pollen1416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_199_in_synpred41_pollen1699 = new BitSet(new long[]{0x0000000000000800L,0x0000000045000412L,0x4003804001400000L,0x000000000000001DL});
    public static final BitSet FOLLOW_metaArgument_in_synpred41_pollen1701 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L,0x0000000000000400L});
    public static final BitSet FOLLOW_133_in_synpred41_pollen1705 = new BitSet(new long[]{0x0000000000000800L,0x0000000045000412L,0x4003804001400000L,0x000000000000001DL});
    public static final BitSet FOLLOW_metaArgument_in_synpred41_pollen1707 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L,0x0000000000000400L});
    public static final BitSet FOLLOW_202_in_synpred41_pollen1711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qualName_in_synpred48_pollen1830 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_metaArguments_in_synpred48_pollen1832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_180_in_synpred50_pollen1897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_154_in_synpred51_pollen1917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_186_in_synpred52_pollen1935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_155_in_synpred53_pollen1953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_162_in_synpred54_pollen1971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NL_in_synpred56_pollen2055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NL_in_synpred60_pollen2122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_133_in_synpred78_pollen2310 = new BitSet(new long[]{0x0000000000000C00L,0x0000000045001512L,0x00600040000300D1L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_synpred78_pollen2312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_synpred79_pollen2307 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_133_in_synpred79_pollen2310 = new BitSet(new long[]{0x0000000000000C00L,0x0000000045001512L,0x00600040000300D1L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_synpred79_pollen2312 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_exprLogicalOr_in_synpred80_pollen2347 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_143_in_synpred80_pollen2349 = new BitSet(new long[]{0x0000000000000C00L,0x0000000045001512L,0x00600040000300D1L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_synpred80_pollen2351 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_138_in_synpred80_pollen2353 = new BitSet(new long[]{0x0000000000000C00L,0x0000000045001512L,0x00600040000300D1L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_synpred80_pollen2355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_201_in_synpred81_pollen2399 = new BitSet(new long[]{0x0000000000000C00L,0x0000000045001512L,0x00600040000300D1L,0x0000000000000001L});
    public static final BitSet FOLLOW_exprLogicalAnd_in_synpred81_pollen2401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_126_in_synpred82_pollen2416 = new BitSet(new long[]{0x0000000000000C00L,0x0000000045001512L,0x00600040000300D1L,0x0000000000000001L});
    public static final BitSet FOLLOW_exprBitwiseOr_in_synpred82_pollen2418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_200_in_synpred83_pollen2433 = new BitSet(new long[]{0x0000000000000C00L,0x0000000045001512L,0x00600040000300D1L,0x0000000000000001L});
    public static final BitSet FOLLOW_exprBitwiseXor_in_synpred83_pollen2435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_147_in_synpred84_pollen2450 = new BitSet(new long[]{0x0000000000000C00L,0x0000000045001512L,0x00600040000300D1L,0x0000000000000001L});
    public static final BitSet FOLLOW_exprBitwiseAnd_in_synpred84_pollen2452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_127_in_synpred85_pollen2467 = new BitSet(new long[]{0x0000000000000C00L,0x0000000045001512L,0x00600040000300D1L,0x0000000000000001L});
    public static final BitSet FOLLOW_exprEquality_in_synpred85_pollen2469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_equalityOp_in_synpred86_pollen2485 = new BitSet(new long[]{0x0000000000000C00L,0x0000000045001512L,0x00600040000300D1L,0x0000000000000001L});
    public static final BitSet FOLLOW_exprRelational_in_synpred86_pollen2487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relationalOp_in_synpred87_pollen2504 = new BitSet(new long[]{0x0000000000000C00L,0x0000000045001512L,0x00600040000300D1L,0x0000000000000001L});
    public static final BitSet FOLLOW_exprShift_in_synpred87_pollen2506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_shiftOp_in_synpred88_pollen2523 = new BitSet(new long[]{0x0000000000000C00L,0x0000000045001512L,0x00600040000300D1L,0x0000000000000001L});
    public static final BitSet FOLLOW_exprAddSub_in_synpred88_pollen2526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_addSubOp_in_synpred89_pollen2542 = new BitSet(new long[]{0x0000000000000C00L,0x0000000045001512L,0x00600040000300D1L,0x0000000000000001L});
    public static final BitSet FOLLOW_exprMultDiv_in_synpred89_pollen2544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multDivModOp_in_synpred90_pollen2559 = new BitSet(new long[]{0x0000000000000C00L,0x0000000045001512L,0x00600040000300D1L,0x0000000000000001L});
    public static final BitSet FOLLOW_exprUnary_in_synpred90_pollen2561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeName_in_synpred111_pollen2912 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_qualName_in_synpred111_pollen2914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeName_in_synpred112_pollen2953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qualName_in_synpred113_pollen2983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_128_in_synpred115_pollen3023 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L,0x4003800001400000L,0x000000000000001CL});
    public static final BitSet FOLLOW_typeName_in_synpred115_pollen3025 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000022L});
    public static final BitSet FOLLOW_133_in_synpred115_pollen3028 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L,0x4003800001400000L,0x000000000000001CL});
    public static final BitSet FOLLOW_typeName_in_synpred115_pollen3030 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000022L});
    public static final BitSet FOLLOW_129_in_synpred115_pollen3034 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_qualName_in_synpred115_pollen3036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_144_in_synpred121_pollen3250 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_synpred121_pollen3253 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_fcnArgumentList_in_synpred121_pollen3255 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020100L});
    public static final BitSet FOLLOW_fieldOrArrayAccess_in_synpred121_pollen3257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_144_in_synpred122_pollen3263 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_synpred122_pollen3266 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020100L});
    public static final BitSet FOLLOW_fieldOrArrayAccess_in_synpred122_pollen3268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_144_in_synpred123_pollen3277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qualName_in_synpred124_pollen3284 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_fcnArgumentList_in_synpred124_pollen3286 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020100L});
    public static final BitSet FOLLOW_fieldOrArrayAccess_in_synpred124_pollen3288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayAccess_in_synpred126_pollen3327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fieldAccess_in_synpred127_pollen3323 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000020100L});
    public static final BitSet FOLLOW_arrayAccess_in_synpred127_pollen3327 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000020100L});
    public static final BitSet FOLLOW_fcnArgumentList_in_synpred128_pollen3351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exprList_in_synpred129_pollen3378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NL_in_synpred132_pollen3435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtAssign_in_synpred133_pollen3452 = new BitSet(new long[]{0x0000000000000000L,0x0000000010200000L});
    public static final BitSet FOLLOW_delim_in_synpred133_pollen3454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtBind_in_synpred135_pollen3466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDeclaration_in_synpred147_pollen3531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtInjection_in_synpred148_pollen3537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varOrFcnOrArray_in_synpred149_pollen3554 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ASSIGN_in_synpred149_pollen3556 = new BitSet(new long[]{0x0000000000000C00L,0x0000000045001512L,0x00600040000300D1L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_synpred149_pollen3558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_injectionCode_in_synpred150_pollen3575 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ASSIGN_in_synpred150_pollen3577 = new BitSet(new long[]{0x0000000000000C00L,0x0000000045001512L,0x00600040000300D1L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_synpred150_pollen3579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varOrFcnOrArray_in_synpred151_pollen3601 = new BitSet(new long[]{0x0000000000004390L,0x00000000880C2000L});
    public static final BitSet FOLLOW_assignOp_in_synpred151_pollen3603 = new BitSet(new long[]{0x0000000000000C00L,0x0000000045001512L,0x00600040000300D1L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_synpred151_pollen3605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_189_in_synpred156_pollen3758 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_128_in_synpred156_pollen3761 = new BitSet(new long[]{0x0000000000000C00L,0x0000000045001512L,0x00600040000300D1L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_synpred156_pollen3765 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_133_in_synpred156_pollen3768 = new BitSet(new long[]{0x0000000000000C00L,0x0000000045001512L,0x00600040000300D1L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_synpred156_pollen3770 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000022L});
    public static final BitSet FOLLOW_129_in_synpred156_pollen3776 = new BitSet(new long[]{0x0000000000000000L,0x0000000010200000L});
    public static final BitSet FOLLOW_delim_in_synpred156_pollen3779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeName_in_synpred159_pollen3988 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_synpred159_pollen3990 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ASSIGN_in_synpred159_pollen3992 = new BitSet(new long[]{0x0000000000000C00L,0x0000000045001512L,0x00600040000300D1L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_synpred159_pollen3994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_171_in_synpred164_pollen4259 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_stmtIfBlock_in_synpred164_pollen4261 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_stmtsElif_in_synpred164_pollen4263 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_stmtElse_in_synpred164_pollen4265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_171_in_synpred165_pollen4284 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_stmtIfBlock_in_synpred165_pollen4286 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_stmtElse_in_synpred165_pollen4288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeName_in_synpred172_pollen4531 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_synpred172_pollen4533 = new BitSet(new long[]{0x0000000000000020L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_ASSIGN_in_synpred172_pollen4536 = new BitSet(new long[]{0x0000000000000C00L,0x0000000045001512L,0x00600040000300D1L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_synpred172_pollen4538 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_133_in_synpred172_pollen4542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeName_in_synpred173_pollen4554 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_synpred173_pollen4556 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_145_in_synpred173_pollen4558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeName_in_synpred174_pollen4571 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_128_in_synpred174_pollen4573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeName_in_synpred175_pollen4587 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_varInit_in_synpred175_pollen4589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_145_in_synpred178_pollen4735 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000410L,0x0000000000040000L});
    public static final BitSet FOLLOW_varDim_in_synpred178_pollen4737 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_146_in_synpred178_pollen4739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeName_in_synpred181_pollen4806 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L,0x4003800001400000L,0x000000000000001CL});
    public static final BitSet FOLLOW_varDeclList_in_synpred181_pollen4808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_133_in_synpred182_pollen4816 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_varInit_in_synpred182_pollen4818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_136_in_synpred192_pollen4976 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_synpred192_pollen4991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NL_in_synpred204_pollen5236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NL_in_synpred207_pollen5308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NL_in_synpred209_pollen5319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NL_in_synpred210_pollen5319 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
    public static final BitSet FOLLOW_NL_in_synpred212_pollen5331 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_202_in_synpred212_pollen5335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NL_in_synpred213_pollen5341 = new BitSet(new long[]{0x0000000000000002L});

}