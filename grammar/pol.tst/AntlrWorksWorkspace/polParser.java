// $ANTLR 3.4 /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g 2012-08-22 18:48:16

    //package com.amaret.pollen.parser;
    import org.antlr.runtime.tree.CommonTree;
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
public class polParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ADD_EQ", "ASSIGN", "BIND", "BITAND_EQ", "BITOR_EQ", "BITXOR_EQ", "BIT_NOT", "CHAR", "D", "DEC", "DELIM", "DIV_EQ", "D_ARG", "D_ARR", "D_ARR_DIM", "D_CLASS", "D_COMPOSITION", "D_CONST", "D_ENUM", "D_ENUMVAL", "D_FCN_CTOR", "D_FCN_DCL", "D_FCN_DEF", "D_FCN_REF", "D_FCN_TYP_NM", "D_FIELD", "D_FORMAL", "D_INSTANCE", "D_META", "D_META_ARGS", "D_MODULE", "D_PROTOCOL", "D_PROTOCOL_MEM", "D_VAR", "E", "EQ", "EXPORT", "E_ADDR", "E_BINARY", "E_CALL", "E_COND", "E_CONST", "E_EXPR", "E_FIELD", "E_HASH", "E_IDENT", "E_INDEX", "E_INJECT", "E_NEW", "E_NUMLIT", "E_PAREN", "E_QUEST", "E_SELF", "E_UNARY", "E_VEC", "FCNBODY", "GT_EQ", "H", "HEX_LIT", "HOST", "I", "IDENT", "IJ_BEG", "IJ_END", "ILLEGAL_CHARACTER", "INC", "INJECT", "INT_LIT", "LIST", "LOG_NOT", "LSHFT_EQ", "LT_EQ", "LU", "MINUS", "ML_COMMENT", "MODULE", "MOD_EQ", "MUL_EQ", "NIL", "NL", "NOT_EQ", "O", "OCT_LIT", "PLUS", "QNAME", "REAL_LIT", "RSHFT_EQ", "SEMI", "SL_COMMENT", "STRING", "SUB_EQ", "S_ASSERT", "S_ASSIGN", "S_BIND", "S_BLOCK", "S_BREAK", "S_CASE", "S_CONTINUE", "S_DECL", "S_DEFAULT", "S_DO_WHILE", "S_ELIF", "S_ELSE", "S_FOR", "S_FOREACH", "S_IF", "S_IMPORT", "S_PACKAGE", "S_PRINT", "S_PROVIDED", "S_RETURN", "S_SWITCH", "S_WHILE", "T_ARR", "T_FCN", "T_STD", "T_USER_TYPE", "UNIT", "WS", "'%'", "'&&'", "'&'", "'('", "')'", "'*'", "','", "'.'", "'/'", "':'", "'<'", "'<<'", "'>'", "'>>'", "'?'", "'@'", "'['", "']'", "'^'", "'as'", "'assert'", "'bool'", "'break'", "'byte'", "'case'", "'class'", "'composition'", "'const'", "'continue'", "'default'", "'do'", "'elif'", "'else'", "'enum'", "'err'", "'export'", "'extends'", "'false'", "'for'", "'foreach'", "'from'", "'host'", "'if'", "'implements'", "'import'", "'in'", "'int16'", "'int32'", "'int8'", "'log'", "'meta'", "'module'", "'new'", "'null'", "'out'", "'package'", "'print'", "'protocol'", "'provided'", "'public'", "'return'", "'string'", "'switch'", "'true'", "'type'", "'uint16'", "'uint32'", "'uint8'", "'volatile'", "'while'", "'{'", "'|'", "'||'", "'}'"
    };

    public static final int EOF=-1;
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
    public static final int T__191=191;
    public static final int T__192=192;
    public static final int T__193=193;
    public static final int T__194=194;
    public static final int T__195=195;
    public static final int T__196=196;
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
    public static final int D_META_ARGS=33;
    public static final int D_MODULE=34;
    public static final int D_PROTOCOL=35;
    public static final int D_PROTOCOL_MEM=36;
    public static final int D_VAR=37;
    public static final int E=38;
    public static final int EQ=39;
    public static final int EXPORT=40;
    public static final int E_ADDR=41;
    public static final int E_BINARY=42;
    public static final int E_CALL=43;
    public static final int E_COND=44;
    public static final int E_CONST=45;
    public static final int E_EXPR=46;
    public static final int E_FIELD=47;
    public static final int E_HASH=48;
    public static final int E_IDENT=49;
    public static final int E_INDEX=50;
    public static final int E_INJECT=51;
    public static final int E_NEW=52;
    public static final int E_NUMLIT=53;
    public static final int E_PAREN=54;
    public static final int E_QUEST=55;
    public static final int E_SELF=56;
    public static final int E_UNARY=57;
    public static final int E_VEC=58;
    public static final int FCNBODY=59;
    public static final int GT_EQ=60;
    public static final int H=61;
    public static final int HEX_LIT=62;
    public static final int HOST=63;
    public static final int I=64;
    public static final int IDENT=65;
    public static final int IJ_BEG=66;
    public static final int IJ_END=67;
    public static final int ILLEGAL_CHARACTER=68;
    public static final int INC=69;
    public static final int INJECT=70;
    public static final int INT_LIT=71;
    public static final int LIST=72;
    public static final int LOG_NOT=73;
    public static final int LSHFT_EQ=74;
    public static final int LT_EQ=75;
    public static final int LU=76;
    public static final int MINUS=77;
    public static final int ML_COMMENT=78;
    public static final int MODULE=79;
    public static final int MOD_EQ=80;
    public static final int MUL_EQ=81;
    public static final int NIL=82;
    public static final int NL=83;
    public static final int NOT_EQ=84;
    public static final int O=85;
    public static final int OCT_LIT=86;
    public static final int PLUS=87;
    public static final int QNAME=88;
    public static final int REAL_LIT=89;
    public static final int RSHFT_EQ=90;
    public static final int SEMI=91;
    public static final int SL_COMMENT=92;
    public static final int STRING=93;
    public static final int SUB_EQ=94;
    public static final int S_ASSERT=95;
    public static final int S_ASSIGN=96;
    public static final int S_BIND=97;
    public static final int S_BLOCK=98;
    public static final int S_BREAK=99;
    public static final int S_CASE=100;
    public static final int S_CONTINUE=101;
    public static final int S_DECL=102;
    public static final int S_DEFAULT=103;
    public static final int S_DO_WHILE=104;
    public static final int S_ELIF=105;
    public static final int S_ELSE=106;
    public static final int S_FOR=107;
    public static final int S_FOREACH=108;
    public static final int S_IF=109;
    public static final int S_IMPORT=110;
    public static final int S_PACKAGE=111;
    public static final int S_PRINT=112;
    public static final int S_PROVIDED=113;
    public static final int S_RETURN=114;
    public static final int S_SWITCH=115;
    public static final int S_WHILE=116;
    public static final int T_ARR=117;
    public static final int T_FCN=118;
    public static final int T_STD=119;
    public static final int T_USER_TYPE=120;
    public static final int UNIT=121;
    public static final int WS=122;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public polParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public polParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
        this.state.ruleMemo = new HashMap[351+1];
         

    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return polParser.tokenNames; }
    public String getGrammarFileName() { return "/home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g"; }



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


    public static class unit_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "unit"
    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:186:1: unit : ( NL )* unitPackage -> ^( UNIT unitPackage ) ;
    public final polParser.unit_return unit() throws RecognitionException {
        polParser.unit_return retval = new polParser.unit_return();
        retval.start = input.LT(1);

        int unit_StartIndex = input.index();

        Object root_0 = null;

        Token NL1=null;
        polParser.unitPackage_return unitPackage2 =null;


        Object NL1_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_unitPackage=new RewriteRuleSubtreeStream(adaptor,"rule unitPackage");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:187:5: ( ( NL )* unitPackage -> ^( UNIT unitPackage ) )
            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:187:9: ( NL )* unitPackage
            {
            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:187:9: ( NL )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==NL) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:187:10: NL
            	    {
            	    NL1=(Token)match(input,NL,FOLLOW_NL_in_unit667); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_NL.add(NL1);


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            pushFollow(FOLLOW_unitPackage_in_unit671);
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

            root_0 = (Object)adaptor.nil();
            // 187:29: -> ^( UNIT unitPackage )
            {
                // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:187:32: ^( UNIT unitPackage )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(UNIT, "UNIT")
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

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 1, unit_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "unit"


    public static class unitPackage_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "unitPackage"
    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:189:1: unitPackage : stmtPackage importList ( stmtInjection )? ( unitTypeDefinition )? ( stmtInjection )? EOF ;
    public final polParser.unitPackage_return unitPackage() throws RecognitionException {
        polParser.unitPackage_return retval = new polParser.unitPackage_return();
        retval.start = input.LT(1);

        int unitPackage_StartIndex = input.index();

        Object root_0 = null;

        Token EOF8=null;
        polParser.stmtPackage_return stmtPackage3 =null;

        polParser.importList_return importList4 =null;

        polParser.stmtInjection_return stmtInjection5 =null;

        polParser.unitTypeDefinition_return unitTypeDefinition6 =null;

        polParser.stmtInjection_return stmtInjection7 =null;


        Object EOF8_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:190:2: ( stmtPackage importList ( stmtInjection )? ( unitTypeDefinition )? ( stmtInjection )? EOF )
            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:190:5: stmtPackage importList ( stmtInjection )? ( unitTypeDefinition )? ( stmtInjection )? EOF
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_stmtPackage_in_unitPackage697);
            stmtPackage3=stmtPackage();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, stmtPackage3.getTree());

            pushFollow(FOLLOW_importList_in_unitPackage703);
            importList4=importList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, importList4.getTree());

            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:192:7: ( stmtInjection )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==INJECT) ) {
                int LA2_1 = input.LA(2);

                if ( (synpred2_pol()) ) {
                    alt2=1;
                }
            }
            switch (alt2) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:192:8: stmtInjection
                    {
                    pushFollow(FOLLOW_stmtInjection_in_unitPackage712);
                    stmtInjection5=stmtInjection();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmtInjection5.getTree());

                    }
                    break;

            }


            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:193:7: ( unitTypeDefinition )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0 >= 148 && LA3_0 <= 149)||LA3_0==156||(LA3_0 >= 173 && LA3_0 <= 174)||LA3_0==180) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:193:8: unitTypeDefinition
                    {
                    pushFollow(FOLLOW_unitTypeDefinition_in_unitPackage723);
                    unitTypeDefinition6=unitTypeDefinition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, unitTypeDefinition6.getTree());

                    }
                    break;

            }


            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:194:7: ( stmtInjection )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==INJECT) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:194:8: stmtInjection
                    {
                    pushFollow(FOLLOW_stmtInjection_in_unitPackage734);
                    stmtInjection7=stmtInjection();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmtInjection7.getTree());

                    }
                    break;

            }


            EOF8=(Token)match(input,EOF,FOLLOW_EOF_in_unitPackage744); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            EOF8_tree = 
            (Object)adaptor.create(EOF8)
            ;
            adaptor.addChild(root_0, EOF8_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 2, unitPackage_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "unitPackage"


    public static class stmtPackage_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stmtPackage"
    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:197:1: stmtPackage : ( 'package' qualName delim -> ^( S_PACKAGE qualName ) | -> ^( S_PACKAGE ) );
    public final polParser.stmtPackage_return stmtPackage() throws RecognitionException {
        polParser.stmtPackage_return retval = new polParser.stmtPackage_return();
        retval.start = input.LT(1);

        int stmtPackage_StartIndex = input.index();

        Object root_0 = null;

        Token string_literal9=null;
        polParser.qualName_return qualName10 =null;

        polParser.delim_return delim11 =null;


        Object string_literal9_tree=null;
        RewriteRuleTokenStream stream_178=new RewriteRuleTokenStream(adaptor,"token 178");
        RewriteRuleSubtreeStream stream_qualName=new RewriteRuleSubtreeStream(adaptor,"rule qualName");
        RewriteRuleSubtreeStream stream_delim=new RewriteRuleSubtreeStream(adaptor,"rule delim");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:198:2: ( 'package' qualName delim -> ^( S_PACKAGE qualName ) | -> ^( S_PACKAGE ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==178) ) {
                alt5=1;
            }
            else if ( (LA5_0==EOF||LA5_0==INJECT||(LA5_0 >= 148 && LA5_0 <= 149)||LA5_0==156||LA5_0==163||LA5_0==167||(LA5_0 >= 173 && LA5_0 <= 174)||LA5_0==180) ) {
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
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:198:4: 'package' qualName delim
                    {
                    string_literal9=(Token)match(input,178,FOLLOW_178_in_stmtPackage754); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_178.add(string_literal9);


                    pushFollow(FOLLOW_qualName_in_stmtPackage756);
                    qualName10=qualName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_qualName.add(qualName10.getTree());

                    pushFollow(FOLLOW_delim_in_stmtPackage758);
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

                    root_0 = (Object)adaptor.nil();
                    // 198:29: -> ^( S_PACKAGE qualName )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:198:32: ^( S_PACKAGE qualName )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(S_PACKAGE, "S_PACKAGE")
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
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:199:4: 
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

                    root_0 = (Object)adaptor.nil();
                    // 199:4: -> ^( S_PACKAGE )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:199:7: ^( S_PACKAGE )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(S_PACKAGE, "S_PACKAGE")
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

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 3, stmtPackage_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "stmtPackage"


    public static class stmtExport_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stmtExport"
    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:201:1: stmtExport : 'export' ^ qualName delim ;
    public final polParser.stmtExport_return stmtExport() throws RecognitionException {
        polParser.stmtExport_return retval = new polParser.stmtExport_return();
        retval.start = input.LT(1);

        int stmtExport_StartIndex = input.index();

        Object root_0 = null;

        Token string_literal12=null;
        polParser.qualName_return qualName13 =null;

        polParser.delim_return delim14 =null;


        Object string_literal12_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:202:5: ( 'export' ^ qualName delim )
            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:202:9: 'export' ^ qualName delim
            {
            root_0 = (Object)adaptor.nil();


            string_literal12=(Token)match(input,158,FOLLOW_158_in_stmtExport790); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal12_tree = 
            (Object)adaptor.create(string_literal12)
            ;
            root_0 = (Object)adaptor.becomeRoot(string_literal12_tree, root_0);
            }

            pushFollow(FOLLOW_qualName_in_stmtExport793);
            qualName13=qualName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, qualName13.getTree());

            pushFollow(FOLLOW_delim_in_stmtExport795);
            delim14=delim();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, delim14.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 4, stmtExport_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "stmtExport"


    public static class exportList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "exportList"
    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:204:1: exportList : ( stmtExport )+ -> ^( LIST ( stmtExport )+ ) ;
    public final polParser.exportList_return exportList() throws RecognitionException {
        polParser.exportList_return retval = new polParser.exportList_return();
        retval.start = input.LT(1);

        int exportList_StartIndex = input.index();

        Object root_0 = null;

        polParser.stmtExport_return stmtExport15 =null;


        RewriteRuleSubtreeStream stream_stmtExport=new RewriteRuleSubtreeStream(adaptor,"rule stmtExport");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:205:5: ( ( stmtExport )+ -> ^( LIST ( stmtExport )+ ) )
            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:205:9: ( stmtExport )+
            {
            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:205:9: ( stmtExport )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==158) ) {
                    int LA6_1 = input.LA(2);

                    if ( (synpred6_pol()) ) {
                        alt6=1;
                    }


                }


                switch (alt6) {
            	case 1 :
            	    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:205:9: stmtExport
            	    {
            	    pushFollow(FOLLOW_stmtExport_in_exportList813);
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

            root_0 = (Object)adaptor.nil();
            // 205:22: -> ^( LIST ( stmtExport )+ )
            {
                // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:205:25: ^( LIST ( stmtExport )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(LIST, "LIST")
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

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 5, exportList_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "exportList"


    public static class classDefinition_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "classDefinition"
    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:207:1: classDefinition : 'class' classDef -> ^( D_CLASS classDef ) ;
    public final polParser.classDefinition_return classDefinition() throws RecognitionException {
        polParser.classDefinition_return retval = new polParser.classDefinition_return();
        retval.start = input.LT(1);

        int classDefinition_StartIndex = input.index();

        Object root_0 = null;

        Token string_literal16=null;
        polParser.classDef_return classDef17 =null;


        Object string_literal16_tree=null;
        RewriteRuleTokenStream stream_148=new RewriteRuleTokenStream(adaptor,"token 148");
        RewriteRuleSubtreeStream stream_classDef=new RewriteRuleSubtreeStream(adaptor,"rule classDef");

        	if (tl.size() > 1) { // nested class
        	  ti = new TypeInfo();
        	  tl.add(ti);		
        	}	

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:220:2: ( 'class' classDef -> ^( D_CLASS classDef ) )
            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:220:5: 'class' classDef
            {
            string_literal16=(Token)match(input,148,FOLLOW_148_in_classDefinition849); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_148.add(string_literal16);


            pushFollow(FOLLOW_classDef_in_classDefinition851);
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

            root_0 = (Object)adaptor.nil();
            // 220:22: -> ^( D_CLASS classDef )
            {
                // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:220:25: ^( D_CLASS classDef )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(D_CLASS, "D_CLASS")
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

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 6, classDefinition_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "classDefinition"


    public static class classDef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "classDef"
    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:222:1: classDef : IDENT ^ ( implementsClause )? braceOpen ( classFeature )* braceClose ;
    public final polParser.classDef_return classDef() throws RecognitionException {
        polParser.classDef_return retval = new polParser.classDef_return();
        retval.start = input.LT(1);

        int classDef_StartIndex = input.index();

        Object root_0 = null;

        Token IDENT18=null;
        polParser.implementsClause_return implementsClause19 =null;

        polParser.braceOpen_return braceOpen20 =null;

        polParser.classFeature_return classFeature21 =null;

        polParser.braceClose_return braceClose22 =null;


        Object IDENT18_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:223:2: ( IDENT ^ ( implementsClause )? braceOpen ( classFeature )* braceClose )
            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:223:4: IDENT ^ ( implementsClause )? braceOpen ( classFeature )* braceClose
            {
            root_0 = (Object)adaptor.nil();


            IDENT18=(Token)match(input,IDENT,FOLLOW_IDENT_in_classDef870); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENT18_tree = 
            (Object)adaptor.create(IDENT18)
            ;
            root_0 = (Object)adaptor.becomeRoot(IDENT18_tree, root_0);
            }

            if ( state.backtracking==0 ) { ti.setTypeName((IDENT18!=null?IDENT18.getText():null)); ti.setUnitFlags(EnumSet.of(UnitFlags.CLASS));}

            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:225:3: ( implementsClause )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==166) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:225:4: implementsClause
                    {
                    pushFollow(FOLLOW_implementsClause_in_classDef881);
                    implementsClause19=implementsClause();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, implementsClause19.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_braceOpen_in_classDef888);
            braceOpen20=braceOpen();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, braceOpen20.getTree());

            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:226:13: ( classFeature )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==IDENT||LA8_0==INJECT||LA8_0==126||LA8_0==144||LA8_0==146||LA8_0==148||LA8_0==150||LA8_0==156||LA8_0==164||(LA8_0 >= 169 && LA8_0 <= 171)||LA8_0==175||LA8_0==182||LA8_0==184||(LA8_0 >= 188 && LA8_0 <= 191)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:226:14: classFeature
            	    {
            	    pushFollow(FOLLOW_classFeature_in_classDef891);
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


            pushFollow(FOLLOW_braceClose_in_classDef895);
            braceClose22=braceClose();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, braceClose22.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 7, classDef_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "classDef"


    public static class classFeature_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "classFeature"
    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:229:1: classFeature : ( fcnDefinition | enumDefinition | varDeclaration | classDefinition | stmtInjection );
    public final polParser.classFeature_return classFeature() throws RecognitionException {
        polParser.classFeature_return retval = new polParser.classFeature_return();
        retval.start = input.LT(1);

        int classFeature_StartIndex = input.index();

        Object root_0 = null;

        polParser.fcnDefinition_return fcnDefinition23 =null;

        polParser.enumDefinition_return enumDefinition24 =null;

        polParser.varDeclaration_return varDeclaration25 =null;

        polParser.classDefinition_return classDefinition26 =null;

        polParser.stmtInjection_return stmtInjection27 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:230:5: ( fcnDefinition | enumDefinition | varDeclaration | classDefinition | stmtInjection )
            int alt9=5;
            switch ( input.LA(1) ) {
            case 126:
            case 182:
                {
                alt9=1;
                }
                break;
            case 164:
                {
                int LA9_2 = input.LA(2);

                if ( (synpred9_pol()) ) {
                    alt9=1;
                }
                else if ( (synpred11_pol()) ) {
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
            case 144:
            case 146:
            case 169:
            case 170:
            case 171:
            case 184:
            case 188:
            case 189:
            case 190:
                {
                int LA9_3 = input.LA(2);

                if ( (synpred9_pol()) ) {
                    alt9=1;
                }
                else if ( (synpred11_pol()) ) {
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

                if ( (synpred9_pol()) ) {
                    alt9=1;
                }
                else if ( (synpred11_pol()) ) {
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
            case 156:
                {
                alt9=2;
                }
                break;
            case 150:
            case 175:
            case 191:
                {
                alt9=3;
                }
                break;
            case 148:
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
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:230:9: fcnDefinition
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_fcnDefinition_in_classFeature912);
                    fcnDefinition23=fcnDefinition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, fcnDefinition23.getTree());

                    }
                    break;
                case 2 :
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:231:9: enumDefinition
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_enumDefinition_in_classFeature923);
                    enumDefinition24=enumDefinition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, enumDefinition24.getTree());

                    }
                    break;
                case 3 :
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:232:9: varDeclaration
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_varDeclaration_in_classFeature933);
                    varDeclaration25=varDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDeclaration25.getTree());

                    }
                    break;
                case 4 :
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:233:9: classDefinition
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_classDefinition_in_classFeature943);
                    classDefinition26=classDefinition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, classDefinition26.getTree());

                    }
                    break;
                case 5 :
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:234:9: stmtInjection
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_stmtInjection_in_classFeature953);
                    stmtInjection27=stmtInjection();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmtInjection27.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 8, classFeature_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "classFeature"


    public static class moduleDefinition_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "moduleDefinition"
    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:236:1: moduleDefinition : 'module' IDENT ( implementsClause )? braceOpen ( moduleFeature )* braceClose -> ^( D_MODULE ^( IDENT ( implementsClause )? ( moduleFeature )* ) ) ;
    public final polParser.moduleDefinition_return moduleDefinition() throws RecognitionException {
        polParser.moduleDefinition_return retval = new polParser.moduleDefinition_return();
        retval.start = input.LT(1);

        int moduleDefinition_StartIndex = input.index();

        Object root_0 = null;

        Token string_literal28=null;
        Token IDENT29=null;
        polParser.implementsClause_return implementsClause30 =null;

        polParser.braceOpen_return braceOpen31 =null;

        polParser.moduleFeature_return moduleFeature32 =null;

        polParser.braceClose_return braceClose33 =null;


        Object string_literal28_tree=null;
        Object IDENT29_tree=null;
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleTokenStream stream_174=new RewriteRuleTokenStream(adaptor,"token 174");
        RewriteRuleSubtreeStream stream_implementsClause=new RewriteRuleSubtreeStream(adaptor,"rule implementsClause");
        RewriteRuleSubtreeStream stream_moduleFeature=new RewriteRuleSubtreeStream(adaptor,"rule moduleFeature");
        RewriteRuleSubtreeStream stream_braceOpen=new RewriteRuleSubtreeStream(adaptor,"rule braceOpen");
        RewriteRuleSubtreeStream stream_braceClose=new RewriteRuleSubtreeStream(adaptor,"rule braceClose");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:237:2: ( 'module' IDENT ( implementsClause )? braceOpen ( moduleFeature )* braceClose -> ^( D_MODULE ^( IDENT ( implementsClause )? ( moduleFeature )* ) ) )
            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:237:7: 'module' IDENT ( implementsClause )? braceOpen ( moduleFeature )* braceClose
            {
            string_literal28=(Token)match(input,174,FOLLOW_174_in_moduleDefinition970); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_174.add(string_literal28);


            IDENT29=(Token)match(input,IDENT,FOLLOW_IDENT_in_moduleDefinition972); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENT.add(IDENT29);


            if ( state.backtracking==0 ) { ti.setTypeName((IDENT29!=null?IDENT29.getText():null)); ti.setUnitFlags(EnumSet.of(UnitFlags.MODULE));}

            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:239:4: ( implementsClause )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==166) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:239:5: implementsClause
                    {
                    pushFollow(FOLLOW_implementsClause_in_moduleDefinition987);
                    implementsClause30=implementsClause();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_implementsClause.add(implementsClause30.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_braceOpen_in_moduleDefinition996);
            braceOpen31=braceOpen();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_braceOpen.add(braceOpen31.getTree());

            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:240:14: ( moduleFeature )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==IDENT||LA11_0==INJECT||LA11_0==126||LA11_0==144||LA11_0==146||LA11_0==148||LA11_0==150||LA11_0==156||LA11_0==164||(LA11_0 >= 169 && LA11_0 <= 171)||LA11_0==175||LA11_0==182||LA11_0==184||(LA11_0 >= 188 && LA11_0 <= 191)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:240:15: moduleFeature
            	    {
            	    pushFollow(FOLLOW_moduleFeature_in_moduleDefinition999);
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


            pushFollow(FOLLOW_braceClose_in_moduleDefinition1003);
            braceClose33=braceClose();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_braceClose.add(braceClose33.getTree());

            // AST REWRITE
            // elements: moduleFeature, IDENT, implementsClause
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 241:4: -> ^( D_MODULE ^( IDENT ( implementsClause )? ( moduleFeature )* ) )
            {
                // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:241:7: ^( D_MODULE ^( IDENT ( implementsClause )? ( moduleFeature )* ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(D_MODULE, "D_MODULE")
                , root_1);

                // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:241:18: ^( IDENT ( implementsClause )? ( moduleFeature )* )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                stream_IDENT.nextNode()
                , root_2);

                // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:241:26: ( implementsClause )?
                if ( stream_implementsClause.hasNext() ) {
                    adaptor.addChild(root_2, stream_implementsClause.nextTree());

                }
                stream_implementsClause.reset();

                // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:241:44: ( moduleFeature )*
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

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 9, moduleDefinition_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "moduleDefinition"


    public static class moduleFeature_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "moduleFeature"
    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:243:1: moduleFeature : ( fcnDefinition | varDeclaration | enumDefinition | classDefinition | stmtInjection );
    public final polParser.moduleFeature_return moduleFeature() throws RecognitionException {
        polParser.moduleFeature_return retval = new polParser.moduleFeature_return();
        retval.start = input.LT(1);

        int moduleFeature_StartIndex = input.index();

        Object root_0 = null;

        polParser.fcnDefinition_return fcnDefinition34 =null;

        polParser.varDeclaration_return varDeclaration35 =null;

        polParser.enumDefinition_return enumDefinition36 =null;

        polParser.classDefinition_return classDefinition37 =null;

        polParser.stmtInjection_return stmtInjection38 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:244:2: ( fcnDefinition | varDeclaration | enumDefinition | classDefinition | stmtInjection )
            int alt12=5;
            switch ( input.LA(1) ) {
            case 126:
            case 182:
                {
                alt12=1;
                }
                break;
            case 164:
                {
                int LA12_2 = input.LA(2);

                if ( (synpred15_pol()) ) {
                    alt12=1;
                }
                else if ( (synpred16_pol()) ) {
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
            case 144:
            case 146:
            case 169:
            case 170:
            case 171:
            case 184:
            case 188:
            case 189:
            case 190:
                {
                int LA12_3 = input.LA(2);

                if ( (synpred15_pol()) ) {
                    alt12=1;
                }
                else if ( (synpred16_pol()) ) {
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

                if ( (synpred15_pol()) ) {
                    alt12=1;
                }
                else if ( (synpred16_pol()) ) {
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
            case 150:
            case 175:
            case 191:
                {
                alt12=2;
                }
                break;
            case 156:
                {
                alt12=3;
                }
                break;
            case 148:
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
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:244:6: fcnDefinition
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_fcnDefinition_in_moduleFeature1035);
                    fcnDefinition34=fcnDefinition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, fcnDefinition34.getTree());

                    }
                    break;
                case 2 :
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:245:8: varDeclaration
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_varDeclaration_in_moduleFeature1044);
                    varDeclaration35=varDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDeclaration35.getTree());

                    }
                    break;
                case 3 :
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:246:6: enumDefinition
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_enumDefinition_in_moduleFeature1051);
                    enumDefinition36=enumDefinition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, enumDefinition36.getTree());

                    }
                    break;
                case 4 :
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:247:6: classDefinition
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_classDefinition_in_moduleFeature1058);
                    classDefinition37=classDefinition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, classDefinition37.getTree());

                    }
                    break;
                case 5 :
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:248:5: stmtInjection
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_stmtInjection_in_moduleFeature1064);
                    stmtInjection38=stmtInjection();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmtInjection38.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 10, moduleFeature_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "moduleFeature"


    public static class enumDefinition_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "enumDefinition"
    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:250:1: enumDefinition : 'enum' enumDef -> enumDef ;
    public final polParser.enumDefinition_return enumDefinition() throws RecognitionException {
        polParser.enumDefinition_return retval = new polParser.enumDefinition_return();
        retval.start = input.LT(1);

        int enumDefinition_StartIndex = input.index();

        Object root_0 = null;

        Token string_literal39=null;
        polParser.enumDef_return enumDef40 =null;


        Object string_literal39_tree=null;
        RewriteRuleTokenStream stream_156=new RewriteRuleTokenStream(adaptor,"token 156");
        RewriteRuleSubtreeStream stream_enumDef=new RewriteRuleSubtreeStream(adaptor,"rule enumDef");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:251:2: ( 'enum' enumDef -> enumDef )
            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:251:4: 'enum' enumDef
            {
            string_literal39=(Token)match(input,156,FOLLOW_156_in_enumDefinition1077); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_156.add(string_literal39);


            pushFollow(FOLLOW_enumDef_in_enumDefinition1079);
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

            root_0 = (Object)adaptor.nil();
            // 251:19: -> enumDef
            {
                adaptor.addChild(root_0, stream_enumDef.nextTree());

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 11, enumDefinition_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "enumDefinition"


    public static class enumDef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "enumDef"
    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:253:1: enumDef : ( IDENT braceOpen enumList braceClose ) -> ^( D_ENUM ^( IDENT enumList ) ) ;
    public final polParser.enumDef_return enumDef() throws RecognitionException {
        polParser.enumDef_return retval = new polParser.enumDef_return();
        retval.start = input.LT(1);

        int enumDef_StartIndex = input.index();

        Object root_0 = null;

        Token IDENT41=null;
        polParser.braceOpen_return braceOpen42 =null;

        polParser.enumList_return enumList43 =null;

        polParser.braceClose_return braceClose44 =null;


        Object IDENT41_tree=null;
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

            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:266:2: ( ( IDENT braceOpen enumList braceClose ) -> ^( D_ENUM ^( IDENT enumList ) ) )
            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:266:5: ( IDENT braceOpen enumList braceClose )
            {
            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:266:5: ( IDENT braceOpen enumList braceClose )
            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:266:6: IDENT braceOpen enumList braceClose
            {
            IDENT41=(Token)match(input,IDENT,FOLLOW_IDENT_in_enumDef1106); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENT.add(IDENT41);


            if ( state.backtracking==0 ) { ti.setTypeName((IDENT41!=null?IDENT41.getText():null)); ti.setUnitFlags(EnumSet.of(UnitFlags.ENUM));}

            pushFollow(FOLLOW_braceOpen_in_enumDef1114);
            braceOpen42=braceOpen();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_braceOpen.add(braceOpen42.getTree());

            pushFollow(FOLLOW_enumList_in_enumDef1116);
            enumList43=enumList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_enumList.add(enumList43.getTree());

            pushFollow(FOLLOW_braceClose_in_enumDef1118);
            braceClose44=braceClose();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_braceClose.add(braceClose44.getTree());

            }


            // AST REWRITE
            // elements: IDENT, enumList
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 269:3: -> ^( D_ENUM ^( IDENT enumList ) )
            {
                // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:269:6: ^( D_ENUM ^( IDENT enumList ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(D_ENUM, "D_ENUM")
                , root_1);

                // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:269:15: ^( IDENT enumList )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
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

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 12, enumDef_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "enumDef"


    public static class enumList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "enumList"
    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:271:1: enumList : enumElement ( ',' enumElement )* -> ^( LIST ( enumElement )+ ) ;
    public final polParser.enumList_return enumList() throws RecognitionException {
        polParser.enumList_return retval = new polParser.enumList_return();
        retval.start = input.LT(1);

        int enumList_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal46=null;
        polParser.enumElement_return enumElement45 =null;

        polParser.enumElement_return enumElement47 =null;


        Object char_literal46_tree=null;
        RewriteRuleTokenStream stream_129=new RewriteRuleTokenStream(adaptor,"token 129");
        RewriteRuleSubtreeStream stream_enumElement=new RewriteRuleSubtreeStream(adaptor,"rule enumElement");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:272:2: ( enumElement ( ',' enumElement )* -> ^( LIST ( enumElement )+ ) )
            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:272:4: enumElement ( ',' enumElement )*
            {
            pushFollow(FOLLOW_enumElement_in_enumList1143);
            enumElement45=enumElement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_enumElement.add(enumElement45.getTree());

            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:272:16: ( ',' enumElement )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==129) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:272:17: ',' enumElement
            	    {
            	    char_literal46=(Token)match(input,129,FOLLOW_129_in_enumList1146); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_129.add(char_literal46);


            	    pushFollow(FOLLOW_enumElement_in_enumList1148);
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

            root_0 = (Object)adaptor.nil();
            // 272:35: -> ^( LIST ( enumElement )+ )
            {
                // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:272:38: ^( LIST ( enumElement )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(LIST, "LIST")
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

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 13, enumList_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "enumList"


    public static class enumElement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "enumElement"
    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:274:1: enumElement : ( IDENT ASSIGN INT_LIT ( delim )? -> ^( D_ENUMVAL ^( IDENT INT_LIT ) ) | IDENT ( delim )? -> ^( D_ENUMVAL IDENT ) );
    public final polParser.enumElement_return enumElement() throws RecognitionException {
        polParser.enumElement_return retval = new polParser.enumElement_return();
        retval.start = input.LT(1);

        int enumElement_StartIndex = input.index();

        Object root_0 = null;

        Token IDENT48=null;
        Token ASSIGN49=null;
        Token INT_LIT50=null;
        Token IDENT52=null;
        polParser.delim_return delim51 =null;

        polParser.delim_return delim53 =null;


        Object IDENT48_tree=null;
        Object ASSIGN49_tree=null;
        Object INT_LIT50_tree=null;
        Object IDENT52_tree=null;
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleTokenStream stream_INT_LIT=new RewriteRuleTokenStream(adaptor,"token INT_LIT");
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
        RewriteRuleSubtreeStream stream_delim=new RewriteRuleSubtreeStream(adaptor,"rule delim");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:275:2: ( IDENT ASSIGN INT_LIT ( delim )? -> ^( D_ENUMVAL ^( IDENT INT_LIT ) ) | IDENT ( delim )? -> ^( D_ENUMVAL IDENT ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==IDENT) ) {
                int LA16_1 = input.LA(2);

                if ( (synpred21_pol()) ) {
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
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:275:4: IDENT ASSIGN INT_LIT ( delim )?
                    {
                    IDENT48=(Token)match(input,IDENT,FOLLOW_IDENT_in_enumElement1169); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENT.add(IDENT48);


                    ASSIGN49=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_enumElement1171); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ASSIGN.add(ASSIGN49);


                    INT_LIT50=(Token)match(input,INT_LIT,FOLLOW_INT_LIT_in_enumElement1173); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INT_LIT.add(INT_LIT50);


                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:275:25: ( delim )?
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

                            if ( (synpred20_pol()) ) {
                                alt14=1;
                            }
                            }
                            break;
                        case 129:
                            {
                            int LA14_3 = input.LA(2);

                            if ( (synpred20_pol()) ) {
                                alt14=1;
                            }
                            }
                            break;
                        case 196:
                            {
                            int LA14_4 = input.LA(2);

                            if ( (synpred20_pol()) ) {
                                alt14=1;
                            }
                            }
                            break;
                        case EOF:
                            {
                            int LA14_5 = input.LA(2);

                            if ( (synpred20_pol()) ) {
                                alt14=1;
                            }
                            }
                            break;
                    }

                    switch (alt14) {
                        case 1 :
                            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:275:26: delim
                            {
                            pushFollow(FOLLOW_delim_in_enumElement1176);
                            delim51=delim();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_delim.add(delim51.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: INT_LIT, IDENT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 275:34: -> ^( D_ENUMVAL ^( IDENT INT_LIT ) )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:275:37: ^( D_ENUMVAL ^( IDENT INT_LIT ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(D_ENUMVAL, "D_ENUMVAL")
                        , root_1);

                        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:275:49: ^( IDENT INT_LIT )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(
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
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:276:4: IDENT ( delim )?
                    {
                    IDENT52=(Token)match(input,IDENT,FOLLOW_IDENT_in_enumElement1195); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENT.add(IDENT52);


                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:276:10: ( delim )?
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

                            if ( (synpred22_pol()) ) {
                                alt15=1;
                            }
                            }
                            break;
                        case 129:
                            {
                            int LA15_3 = input.LA(2);

                            if ( (synpred22_pol()) ) {
                                alt15=1;
                            }
                            }
                            break;
                        case 196:
                            {
                            int LA15_4 = input.LA(2);

                            if ( (synpred22_pol()) ) {
                                alt15=1;
                            }
                            }
                            break;
                        case EOF:
                            {
                            int LA15_5 = input.LA(2);

                            if ( (synpred22_pol()) ) {
                                alt15=1;
                            }
                            }
                            break;
                    }

                    switch (alt15) {
                        case 1 :
                            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:276:11: delim
                            {
                            pushFollow(FOLLOW_delim_in_enumElement1198);
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

                    root_0 = (Object)adaptor.nil();
                    // 276:19: -> ^( D_ENUMVAL IDENT )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:276:22: ^( D_ENUMVAL IDENT )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(D_ENUMVAL, "D_ENUMVAL")
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

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 14, enumElement_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "enumElement"


    public static class protocolDefinition_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "protocolDefinition"
    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:278:1: protocolDefinition : 'protocol' IDENT ( extendsClause )? braceOpen ( protocolFeature )* braceClose -> ^( D_PROTOCOL ^( IDENT ( extendsClause )? ( protocolFeature )* ) ) ;
    public final polParser.protocolDefinition_return protocolDefinition() throws RecognitionException {
        polParser.protocolDefinition_return retval = new polParser.protocolDefinition_return();
        retval.start = input.LT(1);

        int protocolDefinition_StartIndex = input.index();

        Object root_0 = null;

        Token string_literal54=null;
        Token IDENT55=null;
        polParser.extendsClause_return extendsClause56 =null;

        polParser.braceOpen_return braceOpen57 =null;

        polParser.protocolFeature_return protocolFeature58 =null;

        polParser.braceClose_return braceClose59 =null;


        Object string_literal54_tree=null;
        Object IDENT55_tree=null;
        RewriteRuleTokenStream stream_180=new RewriteRuleTokenStream(adaptor,"token 180");
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleSubtreeStream stream_protocolFeature=new RewriteRuleSubtreeStream(adaptor,"rule protocolFeature");
        RewriteRuleSubtreeStream stream_extendsClause=new RewriteRuleSubtreeStream(adaptor,"rule extendsClause");
        RewriteRuleSubtreeStream stream_braceOpen=new RewriteRuleSubtreeStream(adaptor,"rule braceOpen");
        RewriteRuleSubtreeStream stream_braceClose=new RewriteRuleSubtreeStream(adaptor,"rule braceClose");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:279:2: ( 'protocol' IDENT ( extendsClause )? braceOpen ( protocolFeature )* braceClose -> ^( D_PROTOCOL ^( IDENT ( extendsClause )? ( protocolFeature )* ) ) )
            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:279:4: 'protocol' IDENT ( extendsClause )? braceOpen ( protocolFeature )* braceClose
            {
            string_literal54=(Token)match(input,180,FOLLOW_180_in_protocolDefinition1218); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_180.add(string_literal54);


            IDENT55=(Token)match(input,IDENT,FOLLOW_IDENT_in_protocolDefinition1220); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENT.add(IDENT55);


            if ( state.backtracking==0 ) { ti.setTypeName((IDENT55!=null?IDENT55.getText():null)); ti.setUnitFlags(EnumSet.of(UnitFlags.PROTOCOL));}

            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:281:3: ( extendsClause )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==159) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:281:3: extendsClause
                    {
                    pushFollow(FOLLOW_extendsClause_in_protocolDefinition1228);
                    extendsClause56=extendsClause();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_extendsClause.add(extendsClause56.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_braceOpen_in_protocolDefinition1234);
            braceOpen57=braceOpen();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_braceOpen.add(braceOpen57.getTree());

            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:282:13: ( protocolFeature )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==IDENT||LA18_0==INJECT||LA18_0==126||LA18_0==144||LA18_0==146||LA18_0==156||LA18_0==164||(LA18_0 >= 169 && LA18_0 <= 171)||LA18_0==182||LA18_0==184||(LA18_0 >= 188 && LA18_0 <= 190)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:282:14: protocolFeature
            	    {
            	    pushFollow(FOLLOW_protocolFeature_in_protocolDefinition1237);
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


            pushFollow(FOLLOW_braceClose_in_protocolDefinition1241);
            braceClose59=braceClose();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_braceClose.add(braceClose59.getTree());

            // AST REWRITE
            // elements: protocolFeature, IDENT, extendsClause
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 283:3: -> ^( D_PROTOCOL ^( IDENT ( extendsClause )? ( protocolFeature )* ) )
            {
                // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:283:6: ^( D_PROTOCOL ^( IDENT ( extendsClause )? ( protocolFeature )* ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(D_PROTOCOL, "D_PROTOCOL")
                , root_1);

                // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:283:19: ^( IDENT ( extendsClause )? ( protocolFeature )* )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                stream_IDENT.nextNode()
                , root_2);

                // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:283:27: ( extendsClause )?
                if ( stream_extendsClause.hasNext() ) {
                    adaptor.addChild(root_2, stream_extendsClause.nextTree());

                }
                stream_extendsClause.reset();

                // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:283:42: ( protocolFeature )*
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

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 15, protocolDefinition_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "protocolDefinition"


    public static class protocolFeature_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "protocolFeature"
    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:285:1: protocolFeature : ( enumDefinition | fcnDeclaration | stmtInjection );
    public final polParser.protocolFeature_return protocolFeature() throws RecognitionException {
        polParser.protocolFeature_return retval = new polParser.protocolFeature_return();
        retval.start = input.LT(1);

        int protocolFeature_StartIndex = input.index();

        Object root_0 = null;

        polParser.enumDefinition_return enumDefinition60 =null;

        polParser.fcnDeclaration_return fcnDeclaration61 =null;

        polParser.stmtInjection_return stmtInjection62 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:286:5: ( enumDefinition | fcnDeclaration | stmtInjection )
            int alt19=3;
            switch ( input.LA(1) ) {
            case 156:
                {
                alt19=1;
                }
                break;
            case IDENT:
            case 126:
            case 144:
            case 146:
            case 164:
            case 169:
            case 170:
            case 171:
            case 182:
            case 184:
            case 188:
            case 189:
            case 190:
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
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:286:9: enumDefinition
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_enumDefinition_in_protocolFeature1275);
                    enumDefinition60=enumDefinition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, enumDefinition60.getTree());

                    }
                    break;
                case 2 :
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:287:9: fcnDeclaration
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_fcnDeclaration_in_protocolFeature1285);
                    fcnDeclaration61=fcnDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, fcnDeclaration61.getTree());

                    }
                    break;
                case 3 :
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:288:9: stmtInjection
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_stmtInjection_in_protocolFeature1296);
                    stmtInjection62=stmtInjection();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmtInjection62.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 16, protocolFeature_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "protocolFeature"


    public static class compositionDefinition_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "compositionDefinition"
    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:290:1: compositionDefinition : 'composition' IDENT ( extendsClause )? braceOpen ( compositionFeature )* braceClose -> ^( D_COMPOSITION IDENT ( extendsClause )? ( compositionFeature )* ) ;
    public final polParser.compositionDefinition_return compositionDefinition() throws RecognitionException {
        polParser.compositionDefinition_return retval = new polParser.compositionDefinition_return();
        retval.start = input.LT(1);

        int compositionDefinition_StartIndex = input.index();

        Object root_0 = null;

        Token string_literal63=null;
        Token IDENT64=null;
        polParser.extendsClause_return extendsClause65 =null;

        polParser.braceOpen_return braceOpen66 =null;

        polParser.compositionFeature_return compositionFeature67 =null;

        polParser.braceClose_return braceClose68 =null;


        Object string_literal63_tree=null;
        Object IDENT64_tree=null;
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleTokenStream stream_149=new RewriteRuleTokenStream(adaptor,"token 149");
        RewriteRuleSubtreeStream stream_extendsClause=new RewriteRuleSubtreeStream(adaptor,"rule extendsClause");
        RewriteRuleSubtreeStream stream_compositionFeature=new RewriteRuleSubtreeStream(adaptor,"rule compositionFeature");
        RewriteRuleSubtreeStream stream_braceOpen=new RewriteRuleSubtreeStream(adaptor,"rule braceOpen");
        RewriteRuleSubtreeStream stream_braceClose=new RewriteRuleSubtreeStream(adaptor,"rule braceClose");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:291:2: ( 'composition' IDENT ( extendsClause )? braceOpen ( compositionFeature )* braceClose -> ^( D_COMPOSITION IDENT ( extendsClause )? ( compositionFeature )* ) )
            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:291:4: 'composition' IDENT ( extendsClause )? braceOpen ( compositionFeature )* braceClose
            {
            string_literal63=(Token)match(input,149,FOLLOW_149_in_compositionDefinition1309); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_149.add(string_literal63);


            IDENT64=(Token)match(input,IDENT,FOLLOW_IDENT_in_compositionDefinition1311); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENT.add(IDENT64);


            if ( state.backtracking==0 ) { ti.setTypeName((IDENT64!=null?IDENT64.getText():null)); 
            		  //DBG("IDENT64 " + (IDENT64!=null?IDENT64.getText():null));
            		  ti.setUnitFlags(EnumSet.of(UnitFlags.COMPOSITION));
            		  //DBG(ti.getTypeName() + ", " + ti.getUnitFlags().toString());
            		}

            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:297:3: ( extendsClause )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==159) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:297:3: extendsClause
                    {
                    pushFollow(FOLLOW_extendsClause_in_compositionDefinition1319);
                    extendsClause65=extendsClause();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_extendsClause.add(extendsClause65.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_braceOpen_in_compositionDefinition1326);
            braceOpen66=braceOpen();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_braceOpen.add(braceOpen66.getTree());

            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:298:13: ( compositionFeature )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==IDENT||LA21_0==INJECT||LA21_0==126||LA21_0==144||LA21_0==146||LA21_0==150||LA21_0==156||LA21_0==158||LA21_0==164||(LA21_0 >= 169 && LA21_0 <= 171)||LA21_0==175||LA21_0==182||LA21_0==184||(LA21_0 >= 188 && LA21_0 <= 191)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:298:14: compositionFeature
            	    {
            	    pushFollow(FOLLOW_compositionFeature_in_compositionDefinition1329);
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


            pushFollow(FOLLOW_braceClose_in_compositionDefinition1333);
            braceClose68=braceClose();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_braceClose.add(braceClose68.getTree());

            // AST REWRITE
            // elements: compositionFeature, extendsClause, IDENT
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 299:4: -> ^( D_COMPOSITION IDENT ( extendsClause )? ( compositionFeature )* )
            {
                // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:299:7: ^( D_COMPOSITION IDENT ( extendsClause )? ( compositionFeature )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(D_COMPOSITION, "D_COMPOSITION")
                , root_1);

                adaptor.addChild(root_1, 
                stream_IDENT.nextNode()
                );

                // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:299:29: ( extendsClause )?
                if ( stream_extendsClause.hasNext() ) {
                    adaptor.addChild(root_1, stream_extendsClause.nextTree());

                }
                stream_extendsClause.reset();

                // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:299:44: ( compositionFeature )*
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

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 17, compositionDefinition_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "compositionDefinition"


    public static class compositionFeature_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "compositionFeature"
    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:301:1: compositionFeature : ( exportList | fcnDefinitionHost | enumDefinition | varDeclaration | stmtInjection );
    public final polParser.compositionFeature_return compositionFeature() throws RecognitionException {
        polParser.compositionFeature_return retval = new polParser.compositionFeature_return();
        retval.start = input.LT(1);

        int compositionFeature_StartIndex = input.index();

        Object root_0 = null;

        polParser.exportList_return exportList69 =null;

        polParser.fcnDefinitionHost_return fcnDefinitionHost70 =null;

        polParser.enumDefinition_return enumDefinition71 =null;

        polParser.varDeclaration_return varDeclaration72 =null;

        polParser.stmtInjection_return stmtInjection73 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:302:3: ( exportList | fcnDefinitionHost | enumDefinition | varDeclaration | stmtInjection )
            int alt22=5;
            switch ( input.LA(1) ) {
            case 158:
                {
                alt22=1;
                }
                break;
            case 126:
            case 182:
                {
                alt22=2;
                }
                break;
            case 164:
                {
                int LA22_3 = input.LA(2);

                if ( (synpred30_pol()) ) {
                    alt22=2;
                }
                else if ( (synpred32_pol()) ) {
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
            case 144:
            case 146:
            case 169:
            case 170:
            case 171:
            case 184:
            case 188:
            case 189:
            case 190:
                {
                int LA22_4 = input.LA(2);

                if ( (synpred30_pol()) ) {
                    alt22=2;
                }
                else if ( (synpred32_pol()) ) {
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

                if ( (synpred30_pol()) ) {
                    alt22=2;
                }
                else if ( (synpred32_pol()) ) {
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
            case 156:
                {
                alt22=3;
                }
                break;
            case 150:
            case 175:
            case 191:
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
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:302:6: exportList
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_exportList_in_compositionFeature1363);
                    exportList69=exportList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, exportList69.getTree());

                    }
                    break;
                case 2 :
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:303:7: fcnDefinitionHost
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_fcnDefinitionHost_in_compositionFeature1372);
                    fcnDefinitionHost70=fcnDefinitionHost();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, fcnDefinitionHost70.getTree());

                    }
                    break;
                case 3 :
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:304:7: enumDefinition
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_enumDefinition_in_compositionFeature1380);
                    enumDefinition71=enumDefinition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, enumDefinition71.getTree());

                    }
                    break;
                case 4 :
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:305:7: varDeclaration
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_varDeclaration_in_compositionFeature1388);
                    varDeclaration72=varDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDeclaration72.getTree());

                    }
                    break;
                case 5 :
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:306:6: stmtInjection
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_stmtInjection_in_compositionFeature1395);
                    stmtInjection73=stmtInjection();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmtInjection73.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 18, compositionFeature_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "compositionFeature"


    public static class stmtImport_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stmtImport"
    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:308:1: stmtImport : ( importFrom 'import' qualName ( metaArguments )? ( importAs )? delim ) -> ^( S_IMPORT ( importFrom )? qualName ( importAs )? ( metaArguments )? ) ;
    public final polParser.stmtImport_return stmtImport() throws RecognitionException {
        polParser.stmtImport_return retval = new polParser.stmtImport_return();
        retval.start = input.LT(1);

        int stmtImport_StartIndex = input.index();

        Object root_0 = null;

        Token string_literal75=null;
        polParser.importFrom_return importFrom74 =null;

        polParser.qualName_return qualName76 =null;

        polParser.metaArguments_return metaArguments77 =null;

        polParser.importAs_return importAs78 =null;

        polParser.delim_return delim79 =null;


        Object string_literal75_tree=null;
        RewriteRuleTokenStream stream_167=new RewriteRuleTokenStream(adaptor,"token 167");
        RewriteRuleSubtreeStream stream_importFrom=new RewriteRuleSubtreeStream(adaptor,"rule importFrom");
        RewriteRuleSubtreeStream stream_qualName=new RewriteRuleSubtreeStream(adaptor,"rule qualName");
        RewriteRuleSubtreeStream stream_importAs=new RewriteRuleSubtreeStream(adaptor,"rule importAs");
        RewriteRuleSubtreeStream stream_delim=new RewriteRuleSubtreeStream(adaptor,"rule delim");
        RewriteRuleSubtreeStream stream_metaArguments=new RewriteRuleSubtreeStream(adaptor,"rule metaArguments");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:309:5: ( ( importFrom 'import' qualName ( metaArguments )? ( importAs )? delim ) -> ^( S_IMPORT ( importFrom )? qualName ( importAs )? ( metaArguments )? ) )
            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:309:9: ( importFrom 'import' qualName ( metaArguments )? ( importAs )? delim )
            {
            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:309:9: ( importFrom 'import' qualName ( metaArguments )? ( importAs )? delim )
            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:309:10: importFrom 'import' qualName ( metaArguments )? ( importAs )? delim
            {
            pushFollow(FOLLOW_importFrom_in_stmtImport1412);
            importFrom74=importFrom();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_importFrom.add(importFrom74.getTree());

            string_literal75=(Token)match(input,167,FOLLOW_167_in_stmtImport1422); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_167.add(string_literal75);


            pushFollow(FOLLOW_qualName_in_stmtImport1424);
            qualName76=qualName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_qualName.add(qualName76.getTree());

            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:310:27: ( metaArguments )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==193) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:310:28: metaArguments
                    {
                    pushFollow(FOLLOW_metaArguments_in_stmtImport1427);
                    metaArguments77=metaArguments();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_metaArguments.add(metaArguments77.getTree());

                    }
                    break;

            }


            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:311:10: ( importAs )?
            int alt24=2;
            switch ( input.LA(1) ) {
                case 142:
                    {
                    alt24=1;
                    }
                    break;
                case SEMI:
                    {
                    int LA24_2 = input.LA(2);

                    if ( (synpred34_pol()) ) {
                        alt24=1;
                    }
                    }
                    break;
                case NL:
                    {
                    int LA24_3 = input.LA(2);

                    if ( (synpred34_pol()) ) {
                        alt24=1;
                    }
                    }
                    break;
                case 163:
                    {
                    int LA24_4 = input.LA(2);

                    if ( (synpred34_pol()) ) {
                        alt24=1;
                    }
                    }
                    break;
                case 167:
                    {
                    int LA24_5 = input.LA(2);

                    if ( (synpred34_pol()) ) {
                        alt24=1;
                    }
                    }
                    break;
                case INJECT:
                    {
                    int LA24_6 = input.LA(2);

                    if ( (synpred34_pol()) ) {
                        alt24=1;
                    }
                    }
                    break;
                case 173:
                    {
                    int LA24_7 = input.LA(2);

                    if ( (synpred34_pol()) ) {
                        alt24=1;
                    }
                    }
                    break;
                case 174:
                    {
                    int LA24_8 = input.LA(2);

                    if ( (synpred34_pol()) ) {
                        alt24=1;
                    }
                    }
                    break;
                case 148:
                    {
                    int LA24_9 = input.LA(2);

                    if ( (synpred34_pol()) ) {
                        alt24=1;
                    }
                    }
                    break;
                case 180:
                    {
                    int LA24_10 = input.LA(2);

                    if ( (synpred34_pol()) ) {
                        alt24=1;
                    }
                    }
                    break;
                case 149:
                    {
                    int LA24_11 = input.LA(2);

                    if ( (synpred34_pol()) ) {
                        alt24=1;
                    }
                    }
                    break;
                case 156:
                    {
                    int LA24_12 = input.LA(2);

                    if ( (synpred34_pol()) ) {
                        alt24=1;
                    }
                    }
                    break;
                case EOF:
                    {
                    int LA24_13 = input.LA(2);

                    if ( (synpred34_pol()) ) {
                        alt24=1;
                    }
                    }
                    break;
            }

            switch (alt24) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:311:10: importAs
                    {
                    pushFollow(FOLLOW_importAs_in_stmtImport1440);
                    importAs78=importAs();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_importAs.add(importAs78.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_delim_in_stmtImport1443);
            delim79=delim();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_delim.add(delim79.getTree());

            }


            // AST REWRITE
            // elements: importFrom, qualName, importAs, metaArguments
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 311:27: -> ^( S_IMPORT ( importFrom )? qualName ( importAs )? ( metaArguments )? )
            {
                // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:311:30: ^( S_IMPORT ( importFrom )? qualName ( importAs )? ( metaArguments )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(S_IMPORT, "S_IMPORT")
                , root_1);

                // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:311:41: ( importFrom )?
                if ( stream_importFrom.hasNext() ) {
                    adaptor.addChild(root_1, stream_importFrom.nextTree());

                }
                stream_importFrom.reset();

                adaptor.addChild(root_1, stream_qualName.nextTree());

                // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:311:62: ( importAs )?
                if ( stream_importAs.hasNext() ) {
                    adaptor.addChild(root_1, stream_importAs.nextTree());

                }
                stream_importAs.reset();

                // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:311:72: ( metaArguments )?
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

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 19, stmtImport_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "stmtImport"


    public static class importFrom_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "importFrom"
    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:313:1: importFrom : ( 'from' qualName -> qualName | -> NIL );
    public final polParser.importFrom_return importFrom() throws RecognitionException {
        polParser.importFrom_return retval = new polParser.importFrom_return();
        retval.start = input.LT(1);

        int importFrom_StartIndex = input.index();

        Object root_0 = null;

        Token string_literal80=null;
        polParser.qualName_return qualName81 =null;


        Object string_literal80_tree=null;
        RewriteRuleTokenStream stream_163=new RewriteRuleTokenStream(adaptor,"token 163");
        RewriteRuleSubtreeStream stream_qualName=new RewriteRuleSubtreeStream(adaptor,"rule qualName");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:314:5: ( 'from' qualName -> qualName | -> NIL )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==163) ) {
                alt25=1;
            }
            else if ( (LA25_0==167) ) {
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
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:314:9: 'from' qualName
                    {
                    string_literal80=(Token)match(input,163,FOLLOW_163_in_importFrom1479); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_163.add(string_literal80);


                    pushFollow(FOLLOW_qualName_in_importFrom1481);
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

                    root_0 = (Object)adaptor.nil();
                    // 314:25: -> qualName
                    {
                        adaptor.addChild(root_0, stream_qualName.nextTree());

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:315:8: 
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

                    root_0 = (Object)adaptor.nil();
                    // 315:8: -> NIL
                    {
                        adaptor.addChild(root_0, 
                        (Object)adaptor.create(NIL, "NIL")
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 20, importFrom_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "importFrom"


    public static class importAs_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "importAs"
    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:317:1: importAs : ( 'as' qualName -> qualName | -> NIL );
    public final polParser.importAs_return importAs() throws RecognitionException {
        polParser.importAs_return retval = new polParser.importAs_return();
        retval.start = input.LT(1);

        int importAs_StartIndex = input.index();

        Object root_0 = null;

        Token string_literal82=null;
        polParser.qualName_return qualName83 =null;


        Object string_literal82_tree=null;
        RewriteRuleTokenStream stream_142=new RewriteRuleTokenStream(adaptor,"token 142");
        RewriteRuleSubtreeStream stream_qualName=new RewriteRuleSubtreeStream(adaptor,"rule qualName");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:318:2: ( 'as' qualName -> qualName | -> NIL )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==142) ) {
                alt26=1;
            }
            else if ( (LA26_0==EOF||(LA26_0 >= BIT_NOT && LA26_0 <= CHAR)||LA26_0==DEC||LA26_0==HEX_LIT||LA26_0==IDENT||(LA26_0 >= INC && LA26_0 <= INT_LIT)||LA26_0==LOG_NOT||LA26_0==MINUS||LA26_0==NL||LA26_0==OCT_LIT||LA26_0==REAL_LIT||LA26_0==SEMI||LA26_0==STRING||LA26_0==126||LA26_0==129||(LA26_0 >= 138 && LA26_0 <= 139)||(LA26_0 >= 143 && LA26_0 <= 153)||LA26_0==156||LA26_0==158||(LA26_0 >= 160 && LA26_0 <= 165)||LA26_0==167||(LA26_0 >= 169 && LA26_0 <= 171)||(LA26_0 >= 173 && LA26_0 <= 176)||(LA26_0 >= 179 && LA26_0 <= 186)||(LA26_0 >= 188 && LA26_0 <= 192)||LA26_0==196) ) {
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
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:318:4: 'as' qualName
                    {
                    string_literal82=(Token)match(input,142,FOLLOW_142_in_importAs1509); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_142.add(string_literal82);


                    pushFollow(FOLLOW_qualName_in_importAs1511);
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

                    root_0 = (Object)adaptor.nil();
                    // 318:18: -> qualName
                    {
                        adaptor.addChild(root_0, stream_qualName.nextTree());

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:319:4: 
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

                    root_0 = (Object)adaptor.nil();
                    // 319:4: -> NIL
                    {
                        adaptor.addChild(root_0, 
                        (Object)adaptor.create(NIL, "NIL")
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 21, importAs_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "importAs"


    public static class importList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "importList"
    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:321:1: importList : ( stmtImport ( stmtImport )* -> ^( LIST ( stmtImport )+ ) | -> ^( LIST ) );
    public final polParser.importList_return importList() throws RecognitionException {
        polParser.importList_return retval = new polParser.importList_return();
        retval.start = input.LT(1);

        int importList_StartIndex = input.index();

        Object root_0 = null;

        polParser.stmtImport_return stmtImport84 =null;

        polParser.stmtImport_return stmtImport85 =null;


        RewriteRuleSubtreeStream stream_stmtImport=new RewriteRuleSubtreeStream(adaptor,"rule stmtImport");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:322:5: ( stmtImport ( stmtImport )* -> ^( LIST ( stmtImport )+ ) | -> ^( LIST ) )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==163||LA28_0==167) ) {
                alt28=1;
            }
            else if ( (LA28_0==EOF||LA28_0==INJECT||(LA28_0 >= 148 && LA28_0 <= 149)||LA28_0==156||(LA28_0 >= 173 && LA28_0 <= 174)||LA28_0==180) ) {
                alt28=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;

            }
            switch (alt28) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:322:9: stmtImport ( stmtImport )*
                    {
                    pushFollow(FOLLOW_stmtImport_in_importList1537);
                    stmtImport84=stmtImport();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_stmtImport.add(stmtImport84.getTree());

                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:322:20: ( stmtImport )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==163||LA27_0==167) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:322:21: stmtImport
                    	    {
                    	    pushFollow(FOLLOW_stmtImport_in_importList1540);
                    	    stmtImport85=stmtImport();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_stmtImport.add(stmtImport85.getTree());

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

                    root_0 = (Object)adaptor.nil();
                    // 322:34: -> ^( LIST ( stmtImport )+ )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:322:37: ^( LIST ( stmtImport )+ )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(LIST, "LIST")
                        , root_1);

                        if ( !(stream_stmtImport.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
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
                    break;
                case 2 :
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:323:8: 
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

                    root_0 = (Object)adaptor.nil();
                    // 323:8: -> ^( LIST )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:323:11: ^( LIST )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(LIST, "LIST")
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

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 22, importList_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "importList"


    public static class meta_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "meta"
    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:326:1: meta : 'meta' ( braceOpen metaFormalParameters braceClose ) -> ^( D_META metaFormalParameters ) ;
    public final polParser.meta_return meta() throws RecognitionException {
        polParser.meta_return retval = new polParser.meta_return();
        retval.start = input.LT(1);

        int meta_StartIndex = input.index();

        Object root_0 = null;

        Token string_literal86=null;
        polParser.braceOpen_return braceOpen87 =null;

        polParser.metaFormalParameters_return metaFormalParameters88 =null;

        polParser.braceClose_return braceClose89 =null;


        Object string_literal86_tree=null;
        RewriteRuleTokenStream stream_173=new RewriteRuleTokenStream(adaptor,"token 173");
        RewriteRuleSubtreeStream stream_metaFormalParameters=new RewriteRuleSubtreeStream(adaptor,"rule metaFormalParameters");
        RewriteRuleSubtreeStream stream_braceOpen=new RewriteRuleSubtreeStream(adaptor,"rule braceOpen");
        RewriteRuleSubtreeStream stream_braceClose=new RewriteRuleSubtreeStream(adaptor,"rule braceClose");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:327:2: ( 'meta' ( braceOpen metaFormalParameters braceClose ) -> ^( D_META metaFormalParameters ) )
            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:327:4: 'meta' ( braceOpen metaFormalParameters braceClose )
            {
            string_literal86=(Token)match(input,173,FOLLOW_173_in_meta1578); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_173.add(string_literal86);


            if ( state.backtracking==0 ) { ti.setUnitFlags(EnumSet.of(UnitFlags.META));}

            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:329:3: ( braceOpen metaFormalParameters braceClose )
            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:329:4: braceOpen metaFormalParameters braceClose
            {
            pushFollow(FOLLOW_braceOpen_in_meta1587);
            braceOpen87=braceOpen();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_braceOpen.add(braceOpen87.getTree());

            pushFollow(FOLLOW_metaFormalParameters_in_meta1589);
            metaFormalParameters88=metaFormalParameters();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_metaFormalParameters.add(metaFormalParameters88.getTree());

            pushFollow(FOLLOW_braceClose_in_meta1591);
            braceClose89=braceClose();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_braceClose.add(braceClose89.getTree());

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

            root_0 = (Object)adaptor.nil();
            // 330:3: -> ^( D_META metaFormalParameters )
            {
                // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:330:6: ^( D_META metaFormalParameters )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(D_META, "D_META")
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

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 23, meta_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "meta"


    public static class metaFormalParameters_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "metaFormalParameters"
    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:332:1: metaFormalParameters : metaFormalParameter ( ',' metaFormalParameter )* -> ( metaFormalParameter )+ ;
    public final polParser.metaFormalParameters_return metaFormalParameters() throws RecognitionException {
        polParser.metaFormalParameters_return retval = new polParser.metaFormalParameters_return();
        retval.start = input.LT(1);

        int metaFormalParameters_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal91=null;
        polParser.metaFormalParameter_return metaFormalParameter90 =null;

        polParser.metaFormalParameter_return metaFormalParameter92 =null;


        Object char_literal91_tree=null;
        RewriteRuleTokenStream stream_129=new RewriteRuleTokenStream(adaptor,"token 129");
        RewriteRuleSubtreeStream stream_metaFormalParameter=new RewriteRuleSubtreeStream(adaptor,"rule metaFormalParameter");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:333:4: ( metaFormalParameter ( ',' metaFormalParameter )* -> ( metaFormalParameter )+ )
            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:333:8: metaFormalParameter ( ',' metaFormalParameter )*
            {
            pushFollow(FOLLOW_metaFormalParameter_in_metaFormalParameters1616);
            metaFormalParameter90=metaFormalParameter();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_metaFormalParameter.add(metaFormalParameter90.getTree());

            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:333:29: ( ',' metaFormalParameter )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==129) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:333:30: ',' metaFormalParameter
            	    {
            	    char_literal91=(Token)match(input,129,FOLLOW_129_in_metaFormalParameters1620); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_129.add(char_literal91);


            	    pushFollow(FOLLOW_metaFormalParameter_in_metaFormalParameters1622);
            	    metaFormalParameter92=metaFormalParameter();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_metaFormalParameter.add(metaFormalParameter92.getTree());

            	    }
            	    break;

            	default :
            	    break loop29;
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

            root_0 = (Object)adaptor.nil();
            // 333:56: -> ( metaFormalParameter )+
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

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 24, metaFormalParameters_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "metaFormalParameters"


    public static class metaFormalParameter_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "metaFormalParameter"
    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:336:1: metaFormalParameter : metaFormalParameterType IDENT ( ASSIGN metaArgument )? -> ^( metaFormalParameterType ^( IDENT ( metaArgument )? ) ) ;
    public final polParser.metaFormalParameter_return metaFormalParameter() throws RecognitionException {
        polParser.metaFormalParameter_return retval = new polParser.metaFormalParameter_return();
        retval.start = input.LT(1);

        int metaFormalParameter_StartIndex = input.index();

        Object root_0 = null;

        Token IDENT94=null;
        Token ASSIGN95=null;
        polParser.metaFormalParameterType_return metaFormalParameterType93 =null;

        polParser.metaArgument_return metaArgument96 =null;


        Object IDENT94_tree=null;
        Object ASSIGN95_tree=null;
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
        RewriteRuleSubtreeStream stream_metaArgument=new RewriteRuleSubtreeStream(adaptor,"rule metaArgument");
        RewriteRuleSubtreeStream stream_metaFormalParameterType=new RewriteRuleSubtreeStream(adaptor,"rule metaFormalParameterType");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:337:4: ( metaFormalParameterType IDENT ( ASSIGN metaArgument )? -> ^( metaFormalParameterType ^( IDENT ( metaArgument )? ) ) )
            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:337:4: metaFormalParameterType IDENT ( ASSIGN metaArgument )?
            {
            pushFollow(FOLLOW_metaFormalParameterType_in_metaFormalParameter1645);
            metaFormalParameterType93=metaFormalParameterType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_metaFormalParameterType.add(metaFormalParameterType93.getTree());

            IDENT94=(Token)match(input,IDENT,FOLLOW_IDENT_in_metaFormalParameter1647); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENT.add(IDENT94);


            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:337:34: ( ASSIGN metaArgument )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==ASSIGN) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:337:35: ASSIGN metaArgument
                    {
                    ASSIGN95=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_metaFormalParameter1650); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ASSIGN.add(ASSIGN95);


                    pushFollow(FOLLOW_metaArgument_in_metaFormalParameter1652);
                    metaArgument96=metaArgument();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_metaArgument.add(metaArgument96.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: IDENT, metaArgument, metaFormalParameterType
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 338:2: -> ^( metaFormalParameterType ^( IDENT ( metaArgument )? ) )
            {
                // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:338:5: ^( metaFormalParameterType ^( IDENT ( metaArgument )? ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_metaFormalParameterType.nextNode(), root_1);

                // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:338:31: ^( IDENT ( metaArgument )? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                stream_IDENT.nextNode()
                , root_2);

                // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:338:39: ( metaArgument )?
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

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 25, metaFormalParameter_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "metaFormalParameter"


    public static class metaFormalParameterType_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "metaFormalParameterType"
    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:341:1: metaFormalParameterType : ( 'type' | builtinType );
    public final polParser.metaFormalParameterType_return metaFormalParameterType() throws RecognitionException {
        polParser.metaFormalParameterType_return retval = new polParser.metaFormalParameterType_return();
        retval.start = input.LT(1);

        int metaFormalParameterType_StartIndex = input.index();

        Object root_0 = null;

        Token string_literal97=null;
        polParser.builtinType_return builtinType98 =null;


        Object string_literal97_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:342:3: ( 'type' | builtinType )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==187) ) {
                alt31=1;
            }
            else if ( (LA31_0==144||LA31_0==146||(LA31_0 >= 169 && LA31_0 <= 171)||LA31_0==184||(LA31_0 >= 188 && LA31_0 <= 190)) ) {
                alt31=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;

            }
            switch (alt31) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:342:5: 'type'
                    {
                    root_0 = (Object)adaptor.nil();


                    string_literal97=(Token)match(input,187,FOLLOW_187_in_metaFormalParameterType1681); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal97_tree = 
                    (Object)adaptor.create(string_literal97)
                    ;
                    adaptor.addChild(root_0, string_literal97_tree);
                    }

                    }
                    break;
                case 2 :
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:343:5: builtinType
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_builtinType_in_metaFormalParameterType1688);
                    builtinType98=builtinType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, builtinType98.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 26, metaFormalParameterType_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "metaFormalParameterType"


    public static class metaArguments_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "metaArguments"
    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:345:1: metaArguments : ( '{' metaArgument ( ',' metaArgument )* '}' -> ^( D_META_ARGS ( metaArgument )+ ) | '{' '}' -> ^( D_META_ARGS NIL ) );
    public final polParser.metaArguments_return metaArguments() throws RecognitionException {
        polParser.metaArguments_return retval = new polParser.metaArguments_return();
        retval.start = input.LT(1);

        int metaArguments_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal99=null;
        Token char_literal101=null;
        Token char_literal103=null;
        Token char_literal104=null;
        Token char_literal105=null;
        polParser.metaArgument_return metaArgument100 =null;

        polParser.metaArgument_return metaArgument102 =null;


        Object char_literal99_tree=null;
        Object char_literal101_tree=null;
        Object char_literal103_tree=null;
        Object char_literal104_tree=null;
        Object char_literal105_tree=null;
        RewriteRuleTokenStream stream_196=new RewriteRuleTokenStream(adaptor,"token 196");
        RewriteRuleTokenStream stream_129=new RewriteRuleTokenStream(adaptor,"token 129");
        RewriteRuleTokenStream stream_193=new RewriteRuleTokenStream(adaptor,"token 193");
        RewriteRuleSubtreeStream stream_metaArgument=new RewriteRuleSubtreeStream(adaptor,"rule metaArgument");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:346:4: ( '{' metaArgument ( ',' metaArgument )* '}' -> ^( D_META_ARGS ( metaArgument )+ ) | '{' '}' -> ^( D_META_ARGS NIL ) )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==193) ) {
                int LA33_1 = input.LA(2);

                if ( (synpred43_pol()) ) {
                    alt33=1;
                }
                else if ( (true) ) {
                    alt33=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 33, 1, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;

            }
            switch (alt33) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:346:7: '{' metaArgument ( ',' metaArgument )* '}'
                    {
                    char_literal99=(Token)match(input,193,FOLLOW_193_in_metaArguments1701); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_193.add(char_literal99);


                    pushFollow(FOLLOW_metaArgument_in_metaArguments1703);
                    metaArgument100=metaArgument();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_metaArgument.add(metaArgument100.getTree());

                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:346:25: ( ',' metaArgument )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==129) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:346:26: ',' metaArgument
                    	    {
                    	    char_literal101=(Token)match(input,129,FOLLOW_129_in_metaArguments1707); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_129.add(char_literal101);


                    	    pushFollow(FOLLOW_metaArgument_in_metaArguments1709);
                    	    metaArgument102=metaArgument();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_metaArgument.add(metaArgument102.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop32;
                        }
                    } while (true);


                    char_literal103=(Token)match(input,196,FOLLOW_196_in_metaArguments1713); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_196.add(char_literal103);


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

                    root_0 = (Object)adaptor.nil();
                    // 346:49: -> ^( D_META_ARGS ( metaArgument )+ )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:346:52: ^( D_META_ARGS ( metaArgument )+ )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(D_META_ARGS, "D_META_ARGS")
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
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:347:6: '{' '}'
                    {
                    char_literal104=(Token)match(input,193,FOLLOW_193_in_metaArguments1729); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_193.add(char_literal104);


                    char_literal105=(Token)match(input,196,FOLLOW_196_in_metaArguments1731); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_196.add(char_literal105);


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

                    root_0 = (Object)adaptor.nil();
                    // 347:19: -> ^( D_META_ARGS NIL )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:347:22: ^( D_META_ARGS NIL )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(D_META_ARGS, "D_META_ARGS")
                        , root_1);

                        adaptor.addChild(root_1, 
                        (Object)adaptor.create(NIL, "NIL")
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

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 27, metaArguments_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "metaArguments"


    public static class metaArgument_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "metaArgument"
    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:350:1: metaArgument : ( numLit | boolLit | STRING | CHAR | typeNameScalar );
    public final polParser.metaArgument_return metaArgument() throws RecognitionException {
        polParser.metaArgument_return retval = new polParser.metaArgument_return();
        retval.start = input.LT(1);

        int metaArgument_StartIndex = input.index();

        Object root_0 = null;

        Token STRING108=null;
        Token CHAR109=null;
        polParser.numLit_return numLit106 =null;

        polParser.boolLit_return boolLit107 =null;

        polParser.typeNameScalar_return typeNameScalar110 =null;


        Object STRING108_tree=null;
        Object CHAR109_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:351:2: ( numLit | boolLit | STRING | CHAR | typeNameScalar )
            int alt34=5;
            switch ( input.LA(1) ) {
            case HEX_LIT:
            case INT_LIT:
            case OCT_LIT:
            case REAL_LIT:
                {
                alt34=1;
                }
                break;
            case 160:
            case 186:
                {
                alt34=2;
                }
                break;
            case STRING:
                {
                alt34=3;
                }
                break;
            case CHAR:
                {
                alt34=4;
                }
                break;
            case IDENT:
            case 144:
            case 146:
            case 169:
            case 170:
            case 171:
            case 184:
            case 188:
            case 189:
            case 190:
                {
                alt34=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;

            }

            switch (alt34) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:351:4: numLit
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_numLit_in_metaArgument1760);
                    numLit106=numLit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, numLit106.getTree());

                    }
                    break;
                case 2 :
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:352:4: boolLit
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_boolLit_in_metaArgument1766);
                    boolLit107=boolLit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, boolLit107.getTree());

                    }
                    break;
                case 3 :
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:353:5: STRING
                    {
                    root_0 = (Object)adaptor.nil();


                    STRING108=(Token)match(input,STRING,FOLLOW_STRING_in_metaArgument1772); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRING108_tree = 
                    (Object)adaptor.create(STRING108)
                    ;
                    adaptor.addChild(root_0, STRING108_tree);
                    }

                    }
                    break;
                case 4 :
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:354:5: CHAR
                    {
                    root_0 = (Object)adaptor.nil();


                    CHAR109=(Token)match(input,CHAR,FOLLOW_CHAR_in_metaArgument1778); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CHAR109_tree = 
                    (Object)adaptor.create(CHAR109)
                    ;
                    adaptor.addChild(root_0, CHAR109_tree);
                    }

                    }
                    break;
                case 5 :
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:355:4: typeNameScalar
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_typeNameScalar_in_metaArgument1783);
                    typeNameScalar110=typeNameScalar();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeNameScalar110.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 28, metaArgument_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "metaArgument"


    public static class typeName_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "typeName"
    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:357:1: typeName : typeNameScalar ;
    public final polParser.typeName_return typeName() throws RecognitionException {
        polParser.typeName_return retval = new polParser.typeName_return();
        retval.start = input.LT(1);

        int typeName_StartIndex = input.index();

        Object root_0 = null;

        polParser.typeNameScalar_return typeNameScalar111 =null;




        	//System.out.print("typeName: "); DBG_LT();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:361:2: ( typeNameScalar )
            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:361:4: typeNameScalar
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_typeNameScalar_in_typeName1797);
            typeNameScalar111=typeNameScalar();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, typeNameScalar111.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 29, typeName_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "typeName"


    public static class typeNameScalar_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "typeNameScalar"
    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:363:1: typeNameScalar : ( builtinType | userTypeName );
    public final polParser.typeNameScalar_return typeNameScalar() throws RecognitionException {
        polParser.typeNameScalar_return retval = new polParser.typeNameScalar_return();
        retval.start = input.LT(1);

        int typeNameScalar_StartIndex = input.index();

        Object root_0 = null;

        polParser.builtinType_return builtinType112 =null;

        polParser.userTypeName_return userTypeName113 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:364:2: ( builtinType | userTypeName )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==144||LA35_0==146||(LA35_0 >= 169 && LA35_0 <= 171)||LA35_0==184||(LA35_0 >= 188 && LA35_0 <= 190)) ) {
                alt35=1;
            }
            else if ( (LA35_0==IDENT) ) {
                alt35=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;

            }
            switch (alt35) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:364:4: builtinType
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_builtinType_in_typeNameScalar1811);
                    builtinType112=builtinType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, builtinType112.getTree());

                    }
                    break;
                case 2 :
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:365:4: userTypeName
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_userTypeName_in_typeNameScalar1816);
                    userTypeName113=userTypeName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, userTypeName113.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 30, typeNameScalar_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "typeNameScalar"


    public static class userTypeName_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "userTypeName"
    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:367:1: userTypeName : ( qualName metaArguments -> ^( T_USER_TYPE qualName metaArguments ) | qualName -> ^( T_USER_TYPE qualName ) );
    public final polParser.userTypeName_return userTypeName() throws RecognitionException {
        polParser.userTypeName_return retval = new polParser.userTypeName_return();
        retval.start = input.LT(1);

        int userTypeName_StartIndex = input.index();

        Object root_0 = null;

        polParser.qualName_return qualName114 =null;

        polParser.metaArguments_return metaArguments115 =null;

        polParser.qualName_return qualName116 =null;


        RewriteRuleSubtreeStream stream_qualName=new RewriteRuleSubtreeStream(adaptor,"rule qualName");
        RewriteRuleSubtreeStream stream_metaArguments=new RewriteRuleSubtreeStream(adaptor,"rule metaArguments");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:368:2: ( qualName metaArguments -> ^( T_USER_TYPE qualName metaArguments ) | qualName -> ^( T_USER_TYPE qualName ) )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==IDENT) ) {
                int LA36_1 = input.LA(2);

                if ( (synpred49_pol()) ) {
                    alt36=1;
                }
                else if ( (true) ) {
                    alt36=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 36, 1, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;

            }
            switch (alt36) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:368:4: qualName metaArguments
                    {
                    pushFollow(FOLLOW_qualName_in_userTypeName1826);
                    qualName114=qualName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_qualName.add(qualName114.getTree());

                    pushFollow(FOLLOW_metaArguments_in_userTypeName1828);
                    metaArguments115=metaArguments();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_metaArguments.add(metaArguments115.getTree());

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

                    root_0 = (Object)adaptor.nil();
                    // 368:27: -> ^( T_USER_TYPE qualName metaArguments )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:368:30: ^( T_USER_TYPE qualName metaArguments )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(T_USER_TYPE, "T_USER_TYPE")
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
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:369:4: qualName
                    {
                    pushFollow(FOLLOW_qualName_in_userTypeName1843);
                    qualName116=qualName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_qualName.add(qualName116.getTree());

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

                    root_0 = (Object)adaptor.nil();
                    // 369:14: -> ^( T_USER_TYPE qualName )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:369:17: ^( T_USER_TYPE qualName )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(T_USER_TYPE, "T_USER_TYPE")
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

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 31, userTypeName_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "userTypeName"


    public static class unitTypeDefinition_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "unitTypeDefinition"
    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:372:1: unitTypeDefinition : ( meta )? ( ( 'module' )=> moduleDefinition | ( 'class' )=> classDefinition | ( 'protocol' )=> protocolDefinition | ( 'composition' )=> compositionDefinition | ( 'enum' )=> enumDefinition ) ;
    public final polParser.unitTypeDefinition_return unitTypeDefinition() throws RecognitionException {
        polParser.unitTypeDefinition_return retval = new polParser.unitTypeDefinition_return();
        retval.start = input.LT(1);

        int unitTypeDefinition_StartIndex = input.index();

        Object root_0 = null;

        polParser.meta_return meta117 =null;

        polParser.moduleDefinition_return moduleDefinition118 =null;

        polParser.classDefinition_return classDefinition119 =null;

        polParser.protocolDefinition_return protocolDefinition120 =null;

        polParser.compositionDefinition_return compositionDefinition121 =null;

        polParser.enumDefinition_return enumDefinition122 =null;




        		ti = new TypeInfo();
        		tl.add(ti);		

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:381:4: ( ( meta )? ( ( 'module' )=> moduleDefinition | ( 'class' )=> classDefinition | ( 'protocol' )=> protocolDefinition | ( 'composition' )=> compositionDefinition | ( 'enum' )=> enumDefinition ) )
            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:381:8: ( meta )? ( ( 'module' )=> moduleDefinition | ( 'class' )=> classDefinition | ( 'protocol' )=> protocolDefinition | ( 'composition' )=> compositionDefinition | ( 'enum' )=> enumDefinition )
            {
            root_0 = (Object)adaptor.nil();


            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:381:8: ( meta )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==173) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:381:9: meta
                    {
                    pushFollow(FOLLOW_meta_in_unitTypeDefinition1876);
                    meta117=meta();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, meta117.getTree());

                    }
                    break;

            }


            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:381:17: ( ( 'module' )=> moduleDefinition | ( 'class' )=> classDefinition | ( 'protocol' )=> protocolDefinition | ( 'composition' )=> compositionDefinition | ( 'enum' )=> enumDefinition )
            int alt38=5;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==174) && (synpred51_pol())) {
                alt38=1;
            }
            else if ( (LA38_0==148) && (synpred52_pol())) {
                alt38=2;
            }
            else if ( (LA38_0==180) && (synpred53_pol())) {
                alt38=3;
            }
            else if ( (LA38_0==149) && (synpred54_pol())) {
                alt38=4;
            }
            else if ( (LA38_0==156) && (synpred55_pol())) {
                alt38=5;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;

            }
            switch (alt38) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:382:10: ( 'module' )=> moduleDefinition
                    {
                    pushFollow(FOLLOW_moduleDefinition_in_unitTypeDefinition1898);
                    moduleDefinition118=moduleDefinition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, moduleDefinition118.getTree());

                    }
                    break;
                case 2 :
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:383:8: ( 'class' )=> classDefinition
                    {
                    pushFollow(FOLLOW_classDefinition_in_unitTypeDefinition1919);
                    classDefinition119=classDefinition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, classDefinition119.getTree());

                    }
                    break;
                case 3 :
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:384:10: ( 'protocol' )=> protocolDefinition
                    {
                    pushFollow(FOLLOW_protocolDefinition_in_unitTypeDefinition1936);
                    protocolDefinition120=protocolDefinition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, protocolDefinition120.getTree());

                    }
                    break;
                case 4 :
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:385:10: ( 'composition' )=> compositionDefinition
                    {
                    pushFollow(FOLLOW_compositionDefinition_in_unitTypeDefinition1954);
                    compositionDefinition121=compositionDefinition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, compositionDefinition121.getTree());

                    }
                    break;
                case 5 :
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:386:10: ( 'enum' )=> enumDefinition
                    {
                    pushFollow(FOLLOW_enumDefinition_in_unitTypeDefinition1972);
                    enumDefinition122=enumDefinition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, enumDefinition122.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 32, unitTypeDefinition_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "unitTypeDefinition"


    public static class extendsClause_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "extendsClause"
    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:390:1: extendsClause : 'extends' ^ IDENT ;
    public final polParser.extendsClause_return extendsClause() throws RecognitionException {
        polParser.extendsClause_return retval = new polParser.extendsClause_return();
        retval.start = input.LT(1);

        int extendsClause_StartIndex = input.index();

        Object root_0 = null;

        Token string_literal123=null;
        Token IDENT124=null;

        Object string_literal123_tree=null;
        Object IDENT124_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:391:5: ( 'extends' ^ IDENT )
            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:391:9: 'extends' ^ IDENT
            {
            root_0 = (Object)adaptor.nil();


            string_literal123=(Token)match(input,159,FOLLOW_159_in_extendsClause1997); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal123_tree = 
            (Object)adaptor.create(string_literal123)
            ;
            root_0 = (Object)adaptor.becomeRoot(string_literal123_tree, root_0);
            }

            IDENT124=(Token)match(input,IDENT,FOLLOW_IDENT_in_extendsClause2000); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENT124_tree = 
            (Object)adaptor.create(IDENT124)
            ;
            adaptor.addChild(root_0, IDENT124_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 33, extendsClause_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "extendsClause"


    public static class implementsClause_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "implementsClause"
    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:394:1: implementsClause : 'implements' ^ IDENT ;
    public final polParser.implementsClause_return implementsClause() throws RecognitionException {
        polParser.implementsClause_return retval = new polParser.implementsClause_return();
        retval.start = input.LT(1);

        int implementsClause_StartIndex = input.index();

        Object root_0 = null;

        Token string_literal125=null;
        Token IDENT126=null;

        Object string_literal125_tree=null;
        Object IDENT126_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 34) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:395:5: ( 'implements' ^ IDENT )
            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:395:9: 'implements' ^ IDENT
            {
            root_0 = (Object)adaptor.nil();


            string_literal125=(Token)match(input,166,FOLLOW_166_in_implementsClause2019); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal125_tree = 
            (Object)adaptor.create(string_literal125)
            ;
            root_0 = (Object)adaptor.becomeRoot(string_literal125_tree, root_0);
            }

            IDENT126=(Token)match(input,IDENT,FOLLOW_IDENT_in_implementsClause2022); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENT126_tree = 
            (Object)adaptor.create(IDENT126)
            ;
            adaptor.addChild(root_0, IDENT126_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 34, implementsClause_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "implementsClause"


    public static class braceClose_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "braceClose"
    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:397:1: braceClose : ( NL !)* '}' ! ( NL !)* ;
    public final polParser.braceClose_return braceClose() throws RecognitionException {
        polParser.braceClose_return retval = new polParser.braceClose_return();
        retval.start = input.LT(1);

        int braceClose_StartIndex = input.index();

        Object root_0 = null;

        Token NL127=null;
        Token char_literal128=null;
        Token NL129=null;

        Object NL127_tree=null;
        Object char_literal128_tree=null;
        Object NL129_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 35) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:398:5: ( ( NL !)* '}' ! ( NL !)* )
            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:398:10: ( NL !)* '}' ! ( NL !)*
            {
            root_0 = (Object)adaptor.nil();


            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:398:10: ( NL !)*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==NL) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:398:11: NL !
            	    {
            	    NL127=(Token)match(input,NL,FOLLOW_NL_in_braceClose2042); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);


            char_literal128=(Token)match(input,196,FOLLOW_196_in_braceClose2047); if (state.failed) return retval;

            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:398:22: ( NL !)*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==NL) ) {
                    int LA40_1 = input.LA(2);

                    if ( (synpred57_pol()) ) {
                        alt40=1;
                    }


                }


                switch (alt40) {
            	case 1 :
            	    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:398:23: NL !
            	    {
            	    NL129=(Token)match(input,NL,FOLLOW_NL_in_braceClose2051); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 35, braceClose_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "braceClose"


    public static class braceCloseAtEOF_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "braceCloseAtEOF"
    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:400:1: braceCloseAtEOF : ( ( NL !)* ) '}' ! ( NL !)* ;
    public final polParser.braceCloseAtEOF_return braceCloseAtEOF() throws RecognitionException {
        polParser.braceCloseAtEOF_return retval = new polParser.braceCloseAtEOF_return();
        retval.start = input.LT(1);

        int braceCloseAtEOF_StartIndex = input.index();

        Object root_0 = null;

        Token NL130=null;
        Token char_literal131=null;
        Token NL132=null;

        Object NL130_tree=null;
        Object char_literal131_tree=null;
        Object NL132_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 36) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:403:5: ( ( ( NL !)* ) '}' ! ( NL !)* )
            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:403:9: ( ( NL !)* ) '}' ! ( NL !)*
            {
            root_0 = (Object)adaptor.nil();


            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:403:9: ( ( NL !)* )
            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:403:10: ( NL !)*
            {
            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:403:12: ( NL !)*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==NL) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:403:12: NL !
            	    {
            	    NL130=(Token)match(input,NL,FOLLOW_NL_in_braceCloseAtEOF2075); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);


            }


            char_literal131=(Token)match(input,196,FOLLOW_196_in_braceCloseAtEOF2080); if (state.failed) return retval;

            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:403:21: ( NL !)*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==NL) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:403:22: NL !
            	    {
            	    NL132=(Token)match(input,NL,FOLLOW_NL_in_braceCloseAtEOF2084); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 36, braceCloseAtEOF_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "braceCloseAtEOF"


    public static class braceOpen_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "braceOpen"
    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:406:1: braceOpen : ( NL !)* '{' ! ( NL !)* ;
    public final polParser.braceOpen_return braceOpen() throws RecognitionException {
        polParser.braceOpen_return retval = new polParser.braceOpen_return();
        retval.start = input.LT(1);

        int braceOpen_StartIndex = input.index();

        Object root_0 = null;

        Token NL133=null;
        Token char_literal134=null;
        Token NL135=null;

        Object NL133_tree=null;
        Object char_literal134_tree=null;
        Object NL135_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 37) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:407:5: ( ( NL !)* '{' ! ( NL !)* )
            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:407:10: ( NL !)* '{' ! ( NL !)*
            {
            root_0 = (Object)adaptor.nil();


            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:407:10: ( NL !)*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==NL) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:407:11: NL !
            	    {
            	    NL133=(Token)match(input,NL,FOLLOW_NL_in_braceOpen2109); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);


            char_literal134=(Token)match(input,193,FOLLOW_193_in_braceOpen2114); if (state.failed) return retval;

            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:407:22: ( NL !)*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==NL) ) {
                    int LA44_1 = input.LA(2);

                    if ( (synpred61_pol()) ) {
                        alt44=1;
                    }


                }


                switch (alt44) {
            	case 1 :
            	    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:407:23: NL !
            	    {
            	    NL135=(Token)match(input,NL,FOLLOW_NL_in_braceOpen2118); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 37, braceOpen_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "braceOpen"


    public static class equalityOp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "equalityOp"
    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:409:1: equalityOp : ( EQ | NOT_EQ );
    public final polParser.equalityOp_return equalityOp() throws RecognitionException {
        polParser.equalityOp_return retval = new polParser.equalityOp_return();
        retval.start = input.LT(1);

        int equalityOp_StartIndex = input.index();

        Object root_0 = null;

        Token set136=null;

        Object set136_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 38) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:410:2: ( EQ | NOT_EQ )
            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:
            {
            root_0 = (Object)adaptor.nil();


            set136=(Token)input.LT(1);

            if ( input.LA(1)==EQ||input.LA(1)==NOT_EQ ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (Object)adaptor.create(set136)
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

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 38, equalityOp_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "equalityOp"


    public static class relationalOp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "relationalOp"
    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:412:1: relationalOp : ( '<' | '>' | LT_EQ | GT_EQ );
    public final polParser.relationalOp_return relationalOp() throws RecognitionException {
        polParser.relationalOp_return retval = new polParser.relationalOp_return();
        retval.start = input.LT(1);

        int relationalOp_StartIndex = input.index();

        Object root_0 = null;

        Token set137=null;

        Object set137_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 39) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:413:2: ( '<' | '>' | LT_EQ | GT_EQ )
            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:
            {
            root_0 = (Object)adaptor.nil();


            set137=(Token)input.LT(1);

            if ( input.LA(1)==GT_EQ||input.LA(1)==LT_EQ||input.LA(1)==133||input.LA(1)==135 ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (Object)adaptor.create(set137)
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

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 39, relationalOp_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "relationalOp"


    public static class shiftOp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "shiftOp"
    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:415:1: shiftOp : ( '<<' | '>>' );
    public final polParser.shiftOp_return shiftOp() throws RecognitionException {
        polParser.shiftOp_return retval = new polParser.shiftOp_return();
        retval.start = input.LT(1);

        int shiftOp_StartIndex = input.index();

        Object root_0 = null;

        Token set138=null;

        Object set138_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 40) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:416:2: ( '<<' | '>>' )
            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:
            {
            root_0 = (Object)adaptor.nil();


            set138=(Token)input.LT(1);

            if ( input.LA(1)==134||input.LA(1)==136 ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (Object)adaptor.create(set138)
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

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 40, shiftOp_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "shiftOp"


    public static class incDecOp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "incDecOp"
    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:418:1: incDecOp : ( INC | DEC );
    public final polParser.incDecOp_return incDecOp() throws RecognitionException {
        polParser.incDecOp_return retval = new polParser.incDecOp_return();
        retval.start = input.LT(1);

        int incDecOp_StartIndex = input.index();

        Object root_0 = null;

        Token set139=null;

        Object set139_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 41) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:419:2: ( INC | DEC )
            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:
            {
            root_0 = (Object)adaptor.nil();


            set139=(Token)input.LT(1);

            if ( input.LA(1)==DEC||input.LA(1)==INC ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (Object)adaptor.create(set139)
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

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 41, incDecOp_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "incDecOp"


    public static class addSubOp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "addSubOp"
    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:421:1: addSubOp : ( PLUS | MINUS );
    public final polParser.addSubOp_return addSubOp() throws RecognitionException {
        polParser.addSubOp_return retval = new polParser.addSubOp_return();
        retval.start = input.LT(1);

        int addSubOp_StartIndex = input.index();

        Object root_0 = null;

        Token set140=null;

        Object set140_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 42) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:422:2: ( PLUS | MINUS )
            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:
            {
            root_0 = (Object)adaptor.nil();


            set140=(Token)input.LT(1);

            if ( input.LA(1)==MINUS||input.LA(1)==PLUS ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (Object)adaptor.create(set140)
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

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 42, addSubOp_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "addSubOp"


    public static class assignOp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "assignOp"
    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:424:1: assignOp : ( ADD_EQ | SUB_EQ | MUL_EQ | DIV_EQ | MOD_EQ | LSHFT_EQ | RSHFT_EQ | BITAND_EQ | BITXOR_EQ | BITOR_EQ );
    public final polParser.assignOp_return assignOp() throws RecognitionException {
        polParser.assignOp_return retval = new polParser.assignOp_return();
        retval.start = input.LT(1);

        int assignOp_StartIndex = input.index();

        Object root_0 = null;

        Token set141=null;

        Object set141_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 43) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:425:2: ( ADD_EQ | SUB_EQ | MUL_EQ | DIV_EQ | MOD_EQ | LSHFT_EQ | RSHFT_EQ | BITAND_EQ | BITXOR_EQ | BITOR_EQ )
            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:
            {
            root_0 = (Object)adaptor.nil();


            set141=(Token)input.LT(1);

            if ( input.LA(1)==ADD_EQ||(input.LA(1) >= BITAND_EQ && input.LA(1) <= BITXOR_EQ)||input.LA(1)==DIV_EQ||input.LA(1)==LSHFT_EQ||(input.LA(1) >= MOD_EQ && input.LA(1) <= MUL_EQ)||input.LA(1)==RSHFT_EQ||input.LA(1)==SUB_EQ ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (Object)adaptor.create(set141)
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

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 43, assignOp_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "assignOp"


    public static class multDivModOp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "multDivModOp"
    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:427:1: multDivModOp : ( '*' | '/' | '%' );
    public final polParser.multDivModOp_return multDivModOp() throws RecognitionException {
        polParser.multDivModOp_return retval = new polParser.multDivModOp_return();
        retval.start = input.LT(1);

        int multDivModOp_StartIndex = input.index();

        Object root_0 = null;

        Token set142=null;

        Object set142_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 44) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:428:2: ( '*' | '/' | '%' )
            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:
            {
            root_0 = (Object)adaptor.nil();


            set142=(Token)input.LT(1);

            if ( input.LA(1)==123||input.LA(1)==128||input.LA(1)==131 ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (Object)adaptor.create(set142)
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

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 44, multDivModOp_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "multDivModOp"


    public static class logicalNotOp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "logicalNotOp"
    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:430:1: logicalNotOp : LOG_NOT ;
    public final polParser.logicalNotOp_return logicalNotOp() throws RecognitionException {
        polParser.logicalNotOp_return retval = new polParser.logicalNotOp_return();
        retval.start = input.LT(1);

        int logicalNotOp_StartIndex = input.index();

        Object root_0 = null;

        Token LOG_NOT143=null;

        Object LOG_NOT143_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 45) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:431:2: ( LOG_NOT )
            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:431:4: LOG_NOT
            {
            root_0 = (Object)adaptor.nil();


            LOG_NOT143=(Token)match(input,LOG_NOT,FOLLOW_LOG_NOT_in_logicalNotOp2295); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            LOG_NOT143_tree = 
            (Object)adaptor.create(LOG_NOT143)
            ;
            adaptor.addChild(root_0, LOG_NOT143_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 45, logicalNotOp_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "logicalNotOp"


    public static class bitwiseNotOp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "bitwiseNotOp"
    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:433:1: bitwiseNotOp : BIT_NOT ;
    public final polParser.bitwiseNotOp_return bitwiseNotOp() throws RecognitionException {
        polParser.bitwiseNotOp_return retval = new polParser.bitwiseNotOp_return();
        retval.start = input.LT(1);

        int bitwiseNotOp_StartIndex = input.index();

        Object root_0 = null;

        Token BIT_NOT144=null;

        Object BIT_NOT144_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 46) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:434:2: ( BIT_NOT )
            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:434:4: BIT_NOT
            {
            root_0 = (Object)adaptor.nil();


            BIT_NOT144=(Token)match(input,BIT_NOT,FOLLOW_BIT_NOT_in_bitwiseNotOp2306); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            BIT_NOT144_tree = 
            (Object)adaptor.create(BIT_NOT144)
            ;
            adaptor.addChild(root_0, BIT_NOT144_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 46, bitwiseNotOp_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "bitwiseNotOp"


    public static class exprList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "exprList"
    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:436:1: exprList : ( expr ( ',' expr )* -> ^( LIST ( expr )+ ) | -> NIL );
    public final polParser.exprList_return exprList() throws RecognitionException {
        polParser.exprList_return retval = new polParser.exprList_return();
        retval.start = input.LT(1);

        int exprList_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal146=null;
        polParser.expr_return expr145 =null;

        polParser.expr_return expr147 =null;


        Object char_literal146_tree=null;
        RewriteRuleTokenStream stream_129=new RewriteRuleTokenStream(adaptor,"token 129");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 47) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:437:2: ( expr ( ',' expr )* -> ^( LIST ( expr )+ ) | -> NIL )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( ((LA46_0 >= BIT_NOT && LA46_0 <= CHAR)||LA46_0==DEC||LA46_0==HEX_LIT||LA46_0==IDENT||(LA46_0 >= INC && LA46_0 <= INT_LIT)||LA46_0==LOG_NOT||LA46_0==MINUS||LA46_0==OCT_LIT||LA46_0==REAL_LIT||LA46_0==STRING||LA46_0==126||(LA46_0 >= 138 && LA46_0 <= 139)||LA46_0==160||(LA46_0 >= 175 && LA46_0 <= 176)||LA46_0==186) ) {
                int LA46_1 = input.LA(2);

                if ( (synpred81_pol()) ) {
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
            else if ( (LA46_0==NL||LA46_0==SEMI||LA46_0==127||LA46_0==129||LA46_0==140||(LA46_0 >= 143 && LA46_0 <= 153)||LA46_0==156||LA46_0==158||(LA46_0 >= 161 && LA46_0 <= 165)||LA46_0==167||(LA46_0 >= 169 && LA46_0 <= 171)||(LA46_0 >= 173 && LA46_0 <= 174)||(LA46_0 >= 179 && LA46_0 <= 185)||(LA46_0 >= 188 && LA46_0 <= 192)||LA46_0==196) ) {
                alt46=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;

            }
            switch (alt46) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:437:4: expr ( ',' expr )*
                    {
                    pushFollow(FOLLOW_expr_in_exprList2317);
                    expr145=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr145.getTree());

                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:437:9: ( ',' expr )*
                    loop45:
                    do {
                        int alt45=2;
                        int LA45_0 = input.LA(1);

                        if ( (LA45_0==129) ) {
                            int LA45_1 = input.LA(2);

                            if ( (synpred80_pol()) ) {
                                alt45=1;
                            }


                        }


                        switch (alt45) {
                    	case 1 :
                    	    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:437:10: ',' expr
                    	    {
                    	    char_literal146=(Token)match(input,129,FOLLOW_129_in_exprList2320); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_129.add(char_literal146);


                    	    pushFollow(FOLLOW_expr_in_exprList2322);
                    	    expr147=expr();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_expr.add(expr147.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop45;
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

                    root_0 = (Object)adaptor.nil();
                    // 438:3: -> ^( LIST ( expr )+ )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:438:6: ^( LIST ( expr )+ )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(LIST, "LIST")
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
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:439:4: 
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

                    root_0 = (Object)adaptor.nil();
                    // 439:4: -> NIL
                    {
                        adaptor.addChild(root_0, 
                        (Object)adaptor.create(NIL, "NIL")
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 47, exprList_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "exprList"


    public static class expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expr"
    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:441:1: expr : ( exprLogicalOr '?' expr ':' expr -> ^( E_QUEST exprLogicalOr expr expr ) | exprLogicalOr );
    public final polParser.expr_return expr() throws RecognitionException {
        polParser.expr_return retval = new polParser.expr_return();
        retval.start = input.LT(1);

        int expr_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal149=null;
        Token char_literal151=null;
        polParser.exprLogicalOr_return exprLogicalOr148 =null;

        polParser.expr_return expr150 =null;

        polParser.expr_return expr152 =null;

        polParser.exprLogicalOr_return exprLogicalOr153 =null;


        Object char_literal149_tree=null;
        Object char_literal151_tree=null;
        RewriteRuleTokenStream stream_132=new RewriteRuleTokenStream(adaptor,"token 132");
        RewriteRuleTokenStream stream_137=new RewriteRuleTokenStream(adaptor,"token 137");
        RewriteRuleSubtreeStream stream_exprLogicalOr=new RewriteRuleSubtreeStream(adaptor,"rule exprLogicalOr");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 48) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:442:2: ( exprLogicalOr '?' expr ':' expr -> ^( E_QUEST exprLogicalOr expr expr ) | exprLogicalOr )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( ((LA47_0 >= BIT_NOT && LA47_0 <= CHAR)||LA47_0==DEC||LA47_0==HEX_LIT||LA47_0==IDENT||(LA47_0 >= INC && LA47_0 <= INT_LIT)||LA47_0==LOG_NOT||LA47_0==MINUS||LA47_0==OCT_LIT||LA47_0==REAL_LIT||LA47_0==STRING||LA47_0==126||(LA47_0 >= 138 && LA47_0 <= 139)||LA47_0==160||(LA47_0 >= 175 && LA47_0 <= 176)||LA47_0==186) ) {
                int LA47_1 = input.LA(2);

                if ( (synpred82_pol()) ) {
                    alt47=1;
                }
                else if ( (true) ) {
                    alt47=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 47, 1, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;

            }
            switch (alt47) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:442:4: exprLogicalOr '?' expr ':' expr
                    {
                    pushFollow(FOLLOW_exprLogicalOr_in_expr2353);
                    exprLogicalOr148=exprLogicalOr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_exprLogicalOr.add(exprLogicalOr148.getTree());

                    char_literal149=(Token)match(input,137,FOLLOW_137_in_expr2355); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_137.add(char_literal149);


                    pushFollow(FOLLOW_expr_in_expr2357);
                    expr150=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr150.getTree());

                    char_literal151=(Token)match(input,132,FOLLOW_132_in_expr2359); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_132.add(char_literal151);


                    pushFollow(FOLLOW_expr_in_expr2361);
                    expr152=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr152.getTree());

                    // AST REWRITE
                    // elements: exprLogicalOr, expr, expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 442:36: -> ^( E_QUEST exprLogicalOr expr expr )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:442:39: ^( E_QUEST exprLogicalOr expr expr )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(E_QUEST, "E_QUEST")
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
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:443:4: exprLogicalOr
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_exprLogicalOr_in_expr2378);
                    exprLogicalOr153=exprLogicalOr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, exprLogicalOr153.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 48, expr_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "expr"


    public static class exprLogicalOr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "exprLogicalOr"
    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:445:1: exprLogicalOr : ( exprLogicalAnd -> exprLogicalAnd ) ( '||' exprLogicalAnd -> ^( E_BINARY '||' $exprLogicalOr exprLogicalAnd ) )* ;
    public final polParser.exprLogicalOr_return exprLogicalOr() throws RecognitionException {
        polParser.exprLogicalOr_return retval = new polParser.exprLogicalOr_return();
        retval.start = input.LT(1);

        int exprLogicalOr_StartIndex = input.index();

        Object root_0 = null;

        Token string_literal155=null;
        polParser.exprLogicalAnd_return exprLogicalAnd154 =null;

        polParser.exprLogicalAnd_return exprLogicalAnd156 =null;


        Object string_literal155_tree=null;
        RewriteRuleTokenStream stream_195=new RewriteRuleTokenStream(adaptor,"token 195");
        RewriteRuleSubtreeStream stream_exprLogicalAnd=new RewriteRuleSubtreeStream(adaptor,"rule exprLogicalAnd");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 49) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:446:2: ( ( exprLogicalAnd -> exprLogicalAnd ) ( '||' exprLogicalAnd -> ^( E_BINARY '||' $exprLogicalOr exprLogicalAnd ) )* )
            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:446:4: ( exprLogicalAnd -> exprLogicalAnd ) ( '||' exprLogicalAnd -> ^( E_BINARY '||' $exprLogicalOr exprLogicalAnd ) )*
            {
            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:446:4: ( exprLogicalAnd -> exprLogicalAnd )
            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:446:5: exprLogicalAnd
            {
            pushFollow(FOLLOW_exprLogicalAnd_in_exprLogicalOr2396);
            exprLogicalAnd154=exprLogicalAnd();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_exprLogicalAnd.add(exprLogicalAnd154.getTree());

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

            root_0 = (Object)adaptor.nil();
            // 446:20: -> exprLogicalAnd
            {
                adaptor.addChild(root_0, stream_exprLogicalAnd.nextTree());

            }


            retval.tree = root_0;
            }

            }


            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:447:3: ( '||' exprLogicalAnd -> ^( E_BINARY '||' $exprLogicalOr exprLogicalAnd ) )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==195) ) {
                    int LA48_1 = input.LA(2);

                    if ( (synpred83_pol()) ) {
                        alt48=1;
                    }


                }


                switch (alt48) {
            	case 1 :
            	    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:448:4: '||' exprLogicalAnd
            	    {
            	    string_literal155=(Token)match(input,195,FOLLOW_195_in_exprLogicalOr2410); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_195.add(string_literal155);


            	    pushFollow(FOLLOW_exprLogicalAnd_in_exprLogicalOr2412);
            	    exprLogicalAnd156=exprLogicalAnd();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_exprLogicalAnd.add(exprLogicalAnd156.getTree());

            	    // AST REWRITE
            	    // elements: exprLogicalAnd, exprLogicalOr, 195
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    if ( state.backtracking==0 ) {

            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 449:5: -> ^( E_BINARY '||' $exprLogicalOr exprLogicalAnd )
            	    {
            	        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:449:8: ^( E_BINARY '||' $exprLogicalOr exprLogicalAnd )
            	        {
            	        Object root_1 = (Object)adaptor.nil();
            	        root_1 = (Object)adaptor.becomeRoot(
            	        (Object)adaptor.create(E_BINARY, "E_BINARY")
            	        , root_1);

            	        adaptor.addChild(root_1, 
            	        stream_195.nextNode()
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
            	    break loop48;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 49, exprLogicalOr_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "exprLogicalOr"


    public static class exprLogicalAnd_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "exprLogicalAnd"
    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:452:1: exprLogicalAnd : ( exprBitwiseOr -> exprBitwiseOr ) ( '&&' exprBitwiseOr -> ^( E_BINARY '&&' $exprLogicalAnd exprBitwiseOr ) )* ;
    public final polParser.exprLogicalAnd_return exprLogicalAnd() throws RecognitionException {
        polParser.exprLogicalAnd_return retval = new polParser.exprLogicalAnd_return();
        retval.start = input.LT(1);

        int exprLogicalAnd_StartIndex = input.index();

        Object root_0 = null;

        Token string_literal158=null;
        polParser.exprBitwiseOr_return exprBitwiseOr157 =null;

        polParser.exprBitwiseOr_return exprBitwiseOr159 =null;


        Object string_literal158_tree=null;
        RewriteRuleTokenStream stream_124=new RewriteRuleTokenStream(adaptor,"token 124");
        RewriteRuleSubtreeStream stream_exprBitwiseOr=new RewriteRuleSubtreeStream(adaptor,"rule exprBitwiseOr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 50) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:453:2: ( ( exprBitwiseOr -> exprBitwiseOr ) ( '&&' exprBitwiseOr -> ^( E_BINARY '&&' $exprLogicalAnd exprBitwiseOr ) )* )
            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:453:4: ( exprBitwiseOr -> exprBitwiseOr ) ( '&&' exprBitwiseOr -> ^( E_BINARY '&&' $exprLogicalAnd exprBitwiseOr ) )*
            {
            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:453:4: ( exprBitwiseOr -> exprBitwiseOr )
            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:453:5: exprBitwiseOr
            {
            pushFollow(FOLLOW_exprBitwiseOr_in_exprLogicalAnd2445);
            exprBitwiseOr157=exprBitwiseOr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_exprBitwiseOr.add(exprBitwiseOr157.getTree());

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

            root_0 = (Object)adaptor.nil();
            // 453:19: -> exprBitwiseOr
            {
                adaptor.addChild(root_0, stream_exprBitwiseOr.nextTree());

            }


            retval.tree = root_0;
            }

            }


            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:454:2: ( '&&' exprBitwiseOr -> ^( E_BINARY '&&' $exprLogicalAnd exprBitwiseOr ) )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==124) ) {
                    int LA49_1 = input.LA(2);

                    if ( (synpred84_pol()) ) {
                        alt49=1;
                    }


                }


                switch (alt49) {
            	case 1 :
            	    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:455:3: '&&' exprBitwiseOr
            	    {
            	    string_literal158=(Token)match(input,124,FOLLOW_124_in_exprLogicalAnd2457); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_124.add(string_literal158);


            	    pushFollow(FOLLOW_exprBitwiseOr_in_exprLogicalAnd2459);
            	    exprBitwiseOr159=exprBitwiseOr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_exprBitwiseOr.add(exprBitwiseOr159.getTree());

            	    // AST REWRITE
            	    // elements: 124, exprLogicalAnd, exprBitwiseOr
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    if ( state.backtracking==0 ) {

            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 456:4: -> ^( E_BINARY '&&' $exprLogicalAnd exprBitwiseOr )
            	    {
            	        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:456:7: ^( E_BINARY '&&' $exprLogicalAnd exprBitwiseOr )
            	        {
            	        Object root_1 = (Object)adaptor.nil();
            	        root_1 = (Object)adaptor.becomeRoot(
            	        (Object)adaptor.create(E_BINARY, "E_BINARY")
            	        , root_1);

            	        adaptor.addChild(root_1, 
            	        stream_124.nextNode()
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
            	    break loop49;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 50, exprLogicalAnd_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "exprLogicalAnd"


    public static class exprBitwiseOr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "exprBitwiseOr"
    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:459:1: exprBitwiseOr : ( exprBitwiseXor -> exprBitwiseXor ) ( '|' exprBitwiseXor -> ^( E_BINARY '|' $exprBitwiseOr exprBitwiseXor ) )* ;
    public final polParser.exprBitwiseOr_return exprBitwiseOr() throws RecognitionException {
        polParser.exprBitwiseOr_return retval = new polParser.exprBitwiseOr_return();
        retval.start = input.LT(1);

        int exprBitwiseOr_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal161=null;
        polParser.exprBitwiseXor_return exprBitwiseXor160 =null;

        polParser.exprBitwiseXor_return exprBitwiseXor162 =null;


        Object char_literal161_tree=null;
        RewriteRuleTokenStream stream_194=new RewriteRuleTokenStream(adaptor,"token 194");
        RewriteRuleSubtreeStream stream_exprBitwiseXor=new RewriteRuleSubtreeStream(adaptor,"rule exprBitwiseXor");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 51) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:460:2: ( ( exprBitwiseXor -> exprBitwiseXor ) ( '|' exprBitwiseXor -> ^( E_BINARY '|' $exprBitwiseOr exprBitwiseXor ) )* )
            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:460:4: ( exprBitwiseXor -> exprBitwiseXor ) ( '|' exprBitwiseXor -> ^( E_BINARY '|' $exprBitwiseOr exprBitwiseXor ) )*
            {
            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:460:4: ( exprBitwiseXor -> exprBitwiseXor )
            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:460:5: exprBitwiseXor
            {
            pushFollow(FOLLOW_exprBitwiseXor_in_exprBitwiseOr2490);
            exprBitwiseXor160=exprBitwiseXor();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_exprBitwiseXor.add(exprBitwiseXor160.getTree());

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

            root_0 = (Object)adaptor.nil();
            // 460:20: -> exprBitwiseXor
            {
                adaptor.addChild(root_0, stream_exprBitwiseXor.nextTree());

            }


            retval.tree = root_0;
            }

            }


            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:461:2: ( '|' exprBitwiseXor -> ^( E_BINARY '|' $exprBitwiseOr exprBitwiseXor ) )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==194) ) {
                    int LA50_1 = input.LA(2);

                    if ( (synpred85_pol()) ) {
                        alt50=1;
                    }


                }


                switch (alt50) {
            	case 1 :
            	    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:462:3: '|' exprBitwiseXor
            	    {
            	    char_literal161=(Token)match(input,194,FOLLOW_194_in_exprBitwiseOr2502); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_194.add(char_literal161);


            	    pushFollow(FOLLOW_exprBitwiseXor_in_exprBitwiseOr2504);
            	    exprBitwiseXor162=exprBitwiseXor();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_exprBitwiseXor.add(exprBitwiseXor162.getTree());

            	    // AST REWRITE
            	    // elements: exprBitwiseXor, exprBitwiseOr, 194
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    if ( state.backtracking==0 ) {

            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 463:3: -> ^( E_BINARY '|' $exprBitwiseOr exprBitwiseXor )
            	    {
            	        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:463:6: ^( E_BINARY '|' $exprBitwiseOr exprBitwiseXor )
            	        {
            	        Object root_1 = (Object)adaptor.nil();
            	        root_1 = (Object)adaptor.becomeRoot(
            	        (Object)adaptor.create(E_BINARY, "E_BINARY")
            	        , root_1);

            	        adaptor.addChild(root_1, 
            	        stream_194.nextNode()
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
            	    break loop50;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 51, exprBitwiseOr_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "exprBitwiseOr"


    public static class exprBitwiseXor_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "exprBitwiseXor"
    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:466:1: exprBitwiseXor : ( exprBitwiseAnd -> exprBitwiseAnd ) ( '^' exprBitwiseAnd -> ^( E_BINARY '^' $exprBitwiseXor exprBitwiseAnd ) )* ;
    public final polParser.exprBitwiseXor_return exprBitwiseXor() throws RecognitionException {
        polParser.exprBitwiseXor_return retval = new polParser.exprBitwiseXor_return();
        retval.start = input.LT(1);

        int exprBitwiseXor_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal164=null;
        polParser.exprBitwiseAnd_return exprBitwiseAnd163 =null;

        polParser.exprBitwiseAnd_return exprBitwiseAnd165 =null;


        Object char_literal164_tree=null;
        RewriteRuleTokenStream stream_141=new RewriteRuleTokenStream(adaptor,"token 141");
        RewriteRuleSubtreeStream stream_exprBitwiseAnd=new RewriteRuleSubtreeStream(adaptor,"rule exprBitwiseAnd");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 52) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:467:2: ( ( exprBitwiseAnd -> exprBitwiseAnd ) ( '^' exprBitwiseAnd -> ^( E_BINARY '^' $exprBitwiseXor exprBitwiseAnd ) )* )
            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:467:4: ( exprBitwiseAnd -> exprBitwiseAnd ) ( '^' exprBitwiseAnd -> ^( E_BINARY '^' $exprBitwiseXor exprBitwiseAnd ) )*
            {
            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:467:4: ( exprBitwiseAnd -> exprBitwiseAnd )
            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:467:5: exprBitwiseAnd
            {
            pushFollow(FOLLOW_exprBitwiseAnd_in_exprBitwiseXor2534);
            exprBitwiseAnd163=exprBitwiseAnd();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_exprBitwiseAnd.add(exprBitwiseAnd163.getTree());

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

            root_0 = (Object)adaptor.nil();
            // 467:20: -> exprBitwiseAnd
            {
                adaptor.addChild(root_0, stream_exprBitwiseAnd.nextTree());

            }


            retval.tree = root_0;
            }

            }


            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:468:2: ( '^' exprBitwiseAnd -> ^( E_BINARY '^' $exprBitwiseXor exprBitwiseAnd ) )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==141) ) {
                    int LA51_1 = input.LA(2);

                    if ( (synpred86_pol()) ) {
                        alt51=1;
                    }


                }


                switch (alt51) {
            	case 1 :
            	    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:469:3: '^' exprBitwiseAnd
            	    {
            	    char_literal164=(Token)match(input,141,FOLLOW_141_in_exprBitwiseXor2546); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_141.add(char_literal164);


            	    pushFollow(FOLLOW_exprBitwiseAnd_in_exprBitwiseXor2548);
            	    exprBitwiseAnd165=exprBitwiseAnd();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_exprBitwiseAnd.add(exprBitwiseAnd165.getTree());

            	    // AST REWRITE
            	    // elements: exprBitwiseAnd, exprBitwiseXor, 141
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    if ( state.backtracking==0 ) {

            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 470:3: -> ^( E_BINARY '^' $exprBitwiseXor exprBitwiseAnd )
            	    {
            	        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:470:6: ^( E_BINARY '^' $exprBitwiseXor exprBitwiseAnd )
            	        {
            	        Object root_1 = (Object)adaptor.nil();
            	        root_1 = (Object)adaptor.becomeRoot(
            	        (Object)adaptor.create(E_BINARY, "E_BINARY")
            	        , root_1);

            	        adaptor.addChild(root_1, 
            	        stream_141.nextNode()
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
            	    break loop51;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 52, exprBitwiseXor_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "exprBitwiseXor"


    public static class exprBitwiseAnd_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "exprBitwiseAnd"
    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:473:1: exprBitwiseAnd : ( exprEquality -> exprEquality ) ( '&' exprEquality -> ^( E_BINARY '&' $exprBitwiseAnd exprEquality ) )* ;
    public final polParser.exprBitwiseAnd_return exprBitwiseAnd() throws RecognitionException {
        polParser.exprBitwiseAnd_return retval = new polParser.exprBitwiseAnd_return();
        retval.start = input.LT(1);

        int exprBitwiseAnd_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal167=null;
        polParser.exprEquality_return exprEquality166 =null;

        polParser.exprEquality_return exprEquality168 =null;


        Object char_literal167_tree=null;
        RewriteRuleTokenStream stream_125=new RewriteRuleTokenStream(adaptor,"token 125");
        RewriteRuleSubtreeStream stream_exprEquality=new RewriteRuleSubtreeStream(adaptor,"rule exprEquality");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 53) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:474:2: ( ( exprEquality -> exprEquality ) ( '&' exprEquality -> ^( E_BINARY '&' $exprBitwiseAnd exprEquality ) )* )
            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:474:4: ( exprEquality -> exprEquality ) ( '&' exprEquality -> ^( E_BINARY '&' $exprBitwiseAnd exprEquality ) )*
            {
            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:474:4: ( exprEquality -> exprEquality )
            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:474:5: exprEquality
            {
            pushFollow(FOLLOW_exprEquality_in_exprBitwiseAnd2578);
            exprEquality166=exprEquality();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_exprEquality.add(exprEquality166.getTree());

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

            root_0 = (Object)adaptor.nil();
            // 474:18: -> exprEquality
            {
                adaptor.addChild(root_0, stream_exprEquality.nextTree());

            }


            retval.tree = root_0;
            }

            }


            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:475:2: ( '&' exprEquality -> ^( E_BINARY '&' $exprBitwiseAnd exprEquality ) )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==125) ) {
                    int LA52_1 = input.LA(2);

                    if ( (synpred87_pol()) ) {
                        alt52=1;
                    }


                }


                switch (alt52) {
            	case 1 :
            	    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:476:3: '&' exprEquality
            	    {
            	    char_literal167=(Token)match(input,125,FOLLOW_125_in_exprBitwiseAnd2590); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_125.add(char_literal167);


            	    pushFollow(FOLLOW_exprEquality_in_exprBitwiseAnd2592);
            	    exprEquality168=exprEquality();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_exprEquality.add(exprEquality168.getTree());

            	    // AST REWRITE
            	    // elements: exprEquality, exprBitwiseAnd, 125
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    if ( state.backtracking==0 ) {

            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 477:3: -> ^( E_BINARY '&' $exprBitwiseAnd exprEquality )
            	    {
            	        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:477:6: ^( E_BINARY '&' $exprBitwiseAnd exprEquality )
            	        {
            	        Object root_1 = (Object)adaptor.nil();
            	        root_1 = (Object)adaptor.becomeRoot(
            	        (Object)adaptor.create(E_BINARY, "E_BINARY")
            	        , root_1);

            	        adaptor.addChild(root_1, 
            	        stream_125.nextNode()
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
            	    break loop52;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 53, exprBitwiseAnd_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "exprBitwiseAnd"


    public static class exprEquality_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "exprEquality"
    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:480:1: exprEquality : ( exprRelational -> exprRelational ) ( equalityOp exprRelational -> ^( E_BINARY equalityOp $exprEquality exprRelational ) )* ;
    public final polParser.exprEquality_return exprEquality() throws RecognitionException {
        polParser.exprEquality_return retval = new polParser.exprEquality_return();
        retval.start = input.LT(1);

        int exprEquality_StartIndex = input.index();

        Object root_0 = null;

        polParser.exprRelational_return exprRelational169 =null;

        polParser.equalityOp_return equalityOp170 =null;

        polParser.exprRelational_return exprRelational171 =null;


        RewriteRuleSubtreeStream stream_equalityOp=new RewriteRuleSubtreeStream(adaptor,"rule equalityOp");
        RewriteRuleSubtreeStream stream_exprRelational=new RewriteRuleSubtreeStream(adaptor,"rule exprRelational");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 54) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:481:2: ( ( exprRelational -> exprRelational ) ( equalityOp exprRelational -> ^( E_BINARY equalityOp $exprEquality exprRelational ) )* )
            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:481:4: ( exprRelational -> exprRelational ) ( equalityOp exprRelational -> ^( E_BINARY equalityOp $exprEquality exprRelational ) )*
            {
            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:481:4: ( exprRelational -> exprRelational )
            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:481:5: exprRelational
            {
            pushFollow(FOLLOW_exprRelational_in_exprEquality2622);
            exprRelational169=exprRelational();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_exprRelational.add(exprRelational169.getTree());

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

            root_0 = (Object)adaptor.nil();
            // 481:20: -> exprRelational
            {
                adaptor.addChild(root_0, stream_exprRelational.nextTree());

            }


            retval.tree = root_0;
            }

            }


            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:482:2: ( equalityOp exprRelational -> ^( E_BINARY equalityOp $exprEquality exprRelational ) )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==EQ||LA53_0==NOT_EQ) ) {
                    int LA53_1 = input.LA(2);

                    if ( (synpred88_pol()) ) {
                        alt53=1;
                    }


                }


                switch (alt53) {
            	case 1 :
            	    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:483:3: equalityOp exprRelational
            	    {
            	    pushFollow(FOLLOW_equalityOp_in_exprEquality2635);
            	    equalityOp170=equalityOp();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_equalityOp.add(equalityOp170.getTree());

            	    pushFollow(FOLLOW_exprRelational_in_exprEquality2637);
            	    exprRelational171=exprRelational();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_exprRelational.add(exprRelational171.getTree());

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

            	    root_0 = (Object)adaptor.nil();
            	    // 484:3: -> ^( E_BINARY equalityOp $exprEquality exprRelational )
            	    {
            	        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:484:6: ^( E_BINARY equalityOp $exprEquality exprRelational )
            	        {
            	        Object root_1 = (Object)adaptor.nil();
            	        root_1 = (Object)adaptor.becomeRoot(
            	        (Object)adaptor.create(E_BINARY, "E_BINARY")
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
            	    break loop53;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 54, exprEquality_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "exprEquality"


    public static class exprRelational_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "exprRelational"
    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:487:1: exprRelational : ( exprShift -> exprShift ) ( relationalOp exprShift -> ^( E_BINARY relationalOp $exprRelational exprShift ) )* ;
    public final polParser.exprRelational_return exprRelational() throws RecognitionException {
        polParser.exprRelational_return retval = new polParser.exprRelational_return();
        retval.start = input.LT(1);

        int exprRelational_StartIndex = input.index();

        Object root_0 = null;

        polParser.exprShift_return exprShift172 =null;

        polParser.relationalOp_return relationalOp173 =null;

        polParser.exprShift_return exprShift174 =null;


        RewriteRuleSubtreeStream stream_relationalOp=new RewriteRuleSubtreeStream(adaptor,"rule relationalOp");
        RewriteRuleSubtreeStream stream_exprShift=new RewriteRuleSubtreeStream(adaptor,"rule exprShift");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 55) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:488:2: ( ( exprShift -> exprShift ) ( relationalOp exprShift -> ^( E_BINARY relationalOp $exprRelational exprShift ) )* )
            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:488:4: ( exprShift -> exprShift ) ( relationalOp exprShift -> ^( E_BINARY relationalOp $exprRelational exprShift ) )*
            {
            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:488:4: ( exprShift -> exprShift )
            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:488:5: exprShift
            {
            pushFollow(FOLLOW_exprShift_in_exprRelational2667);
            exprShift172=exprShift();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_exprShift.add(exprShift172.getTree());

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

            root_0 = (Object)adaptor.nil();
            // 488:15: -> exprShift
            {
                adaptor.addChild(root_0, stream_exprShift.nextTree());

            }


            retval.tree = root_0;
            }

            }


            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:489:2: ( relationalOp exprShift -> ^( E_BINARY relationalOp $exprRelational exprShift ) )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==GT_EQ||LA54_0==LT_EQ||LA54_0==133||LA54_0==135) ) {
                    int LA54_1 = input.LA(2);

                    if ( (synpred89_pol()) ) {
                        alt54=1;
                    }


                }


                switch (alt54) {
            	case 1 :
            	    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:490:3: relationalOp exprShift
            	    {
            	    pushFollow(FOLLOW_relationalOp_in_exprRelational2680);
            	    relationalOp173=relationalOp();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_relationalOp.add(relationalOp173.getTree());

            	    pushFollow(FOLLOW_exprShift_in_exprRelational2682);
            	    exprShift174=exprShift();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_exprShift.add(exprShift174.getTree());

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

            	    root_0 = (Object)adaptor.nil();
            	    // 491:3: -> ^( E_BINARY relationalOp $exprRelational exprShift )
            	    {
            	        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:491:6: ^( E_BINARY relationalOp $exprRelational exprShift )
            	        {
            	        Object root_1 = (Object)adaptor.nil();
            	        root_1 = (Object)adaptor.becomeRoot(
            	        (Object)adaptor.create(E_BINARY, "E_BINARY")
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
            	    break loop54;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 55, exprRelational_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "exprRelational"


    public static class exprShift_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "exprShift"
    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:494:1: exprShift : ( exprAddSub -> exprAddSub ) ( shiftOp exprAddSub -> ^( E_BINARY shiftOp $exprShift exprAddSub ) )* ;
    public final polParser.exprShift_return exprShift() throws RecognitionException {
        polParser.exprShift_return retval = new polParser.exprShift_return();
        retval.start = input.LT(1);

        int exprShift_StartIndex = input.index();

        Object root_0 = null;

        polParser.exprAddSub_return exprAddSub175 =null;

        polParser.shiftOp_return shiftOp176 =null;

        polParser.exprAddSub_return exprAddSub177 =null;


        RewriteRuleSubtreeStream stream_shiftOp=new RewriteRuleSubtreeStream(adaptor,"rule shiftOp");
        RewriteRuleSubtreeStream stream_exprAddSub=new RewriteRuleSubtreeStream(adaptor,"rule exprAddSub");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 56) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:495:2: ( ( exprAddSub -> exprAddSub ) ( shiftOp exprAddSub -> ^( E_BINARY shiftOp $exprShift exprAddSub ) )* )
            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:495:4: ( exprAddSub -> exprAddSub ) ( shiftOp exprAddSub -> ^( E_BINARY shiftOp $exprShift exprAddSub ) )*
            {
            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:495:4: ( exprAddSub -> exprAddSub )
            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:495:5: exprAddSub
            {
            pushFollow(FOLLOW_exprAddSub_in_exprShift2713);
            exprAddSub175=exprAddSub();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_exprAddSub.add(exprAddSub175.getTree());

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

            root_0 = (Object)adaptor.nil();
            // 495:16: -> exprAddSub
            {
                adaptor.addChild(root_0, stream_exprAddSub.nextTree());

            }


            retval.tree = root_0;
            }

            }


            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:496:2: ( shiftOp exprAddSub -> ^( E_BINARY shiftOp $exprShift exprAddSub ) )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==134||LA55_0==136) ) {
                    int LA55_1 = input.LA(2);

                    if ( (synpred90_pol()) ) {
                        alt55=1;
                    }


                }


                switch (alt55) {
            	case 1 :
            	    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:497:3: shiftOp exprAddSub
            	    {
            	    pushFollow(FOLLOW_shiftOp_in_exprShift2726);
            	    shiftOp176=shiftOp();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_shiftOp.add(shiftOp176.getTree());

            	    pushFollow(FOLLOW_exprAddSub_in_exprShift2729);
            	    exprAddSub177=exprAddSub();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_exprAddSub.add(exprAddSub177.getTree());

            	    // AST REWRITE
            	    // elements: shiftOp, exprShift, exprAddSub
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    if ( state.backtracking==0 ) {

            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 498:3: -> ^( E_BINARY shiftOp $exprShift exprAddSub )
            	    {
            	        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:498:6: ^( E_BINARY shiftOp $exprShift exprAddSub )
            	        {
            	        Object root_1 = (Object)adaptor.nil();
            	        root_1 = (Object)adaptor.becomeRoot(
            	        (Object)adaptor.create(E_BINARY, "E_BINARY")
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
            	    break loop55;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 56, exprShift_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "exprShift"


    public static class exprAddSub_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "exprAddSub"
    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:501:1: exprAddSub : ( exprMultDiv -> exprMultDiv ) ( addSubOp exprMultDiv -> ^( E_BINARY addSubOp $exprAddSub exprMultDiv ) )* ;
    public final polParser.exprAddSub_return exprAddSub() throws RecognitionException {
        polParser.exprAddSub_return retval = new polParser.exprAddSub_return();
        retval.start = input.LT(1);

        int exprAddSub_StartIndex = input.index();

        Object root_0 = null;

        polParser.exprMultDiv_return exprMultDiv178 =null;

        polParser.addSubOp_return addSubOp179 =null;

        polParser.exprMultDiv_return exprMultDiv180 =null;


        RewriteRuleSubtreeStream stream_addSubOp=new RewriteRuleSubtreeStream(adaptor,"rule addSubOp");
        RewriteRuleSubtreeStream stream_exprMultDiv=new RewriteRuleSubtreeStream(adaptor,"rule exprMultDiv");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 57) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:502:2: ( ( exprMultDiv -> exprMultDiv ) ( addSubOp exprMultDiv -> ^( E_BINARY addSubOp $exprAddSub exprMultDiv ) )* )
            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:502:4: ( exprMultDiv -> exprMultDiv ) ( addSubOp exprMultDiv -> ^( E_BINARY addSubOp $exprAddSub exprMultDiv ) )*
            {
            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:502:4: ( exprMultDiv -> exprMultDiv )
            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:502:5: exprMultDiv
            {
            pushFollow(FOLLOW_exprMultDiv_in_exprAddSub2760);
            exprMultDiv178=exprMultDiv();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_exprMultDiv.add(exprMultDiv178.getTree());

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

            root_0 = (Object)adaptor.nil();
            // 502:17: -> exprMultDiv
            {
                adaptor.addChild(root_0, stream_exprMultDiv.nextTree());

            }


            retval.tree = root_0;
            }

            }


            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:503:2: ( addSubOp exprMultDiv -> ^( E_BINARY addSubOp $exprAddSub exprMultDiv ) )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==MINUS||LA56_0==PLUS) ) {
                    int LA56_1 = input.LA(2);

                    if ( (synpred91_pol()) ) {
                        alt56=1;
                    }


                }


                switch (alt56) {
            	case 1 :
            	    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:504:3: addSubOp exprMultDiv
            	    {
            	    pushFollow(FOLLOW_addSubOp_in_exprAddSub2772);
            	    addSubOp179=addSubOp();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_addSubOp.add(addSubOp179.getTree());

            	    pushFollow(FOLLOW_exprMultDiv_in_exprAddSub2774);
            	    exprMultDiv180=exprMultDiv();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_exprMultDiv.add(exprMultDiv180.getTree());

            	    // AST REWRITE
            	    // elements: exprMultDiv, exprAddSub, addSubOp
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    if ( state.backtracking==0 ) {

            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 505:3: -> ^( E_BINARY addSubOp $exprAddSub exprMultDiv )
            	    {
            	        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:505:6: ^( E_BINARY addSubOp $exprAddSub exprMultDiv )
            	        {
            	        Object root_1 = (Object)adaptor.nil();
            	        root_1 = (Object)adaptor.becomeRoot(
            	        (Object)adaptor.create(E_BINARY, "E_BINARY")
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
            	    break loop56;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 57, exprAddSub_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "exprAddSub"


    public static class exprMultDiv_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "exprMultDiv"
    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:508:1: exprMultDiv : ( exprUnary -> exprUnary ) ( multDivModOp exprUnary -> ^( E_BINARY multDivModOp $exprMultDiv exprUnary ) )* ;
    public final polParser.exprMultDiv_return exprMultDiv() throws RecognitionException {
        polParser.exprMultDiv_return retval = new polParser.exprMultDiv_return();
        retval.start = input.LT(1);

        int exprMultDiv_StartIndex = input.index();

        Object root_0 = null;

        polParser.exprUnary_return exprUnary181 =null;

        polParser.multDivModOp_return multDivModOp182 =null;

        polParser.exprUnary_return exprUnary183 =null;


        RewriteRuleSubtreeStream stream_multDivModOp=new RewriteRuleSubtreeStream(adaptor,"rule multDivModOp");
        RewriteRuleSubtreeStream stream_exprUnary=new RewriteRuleSubtreeStream(adaptor,"rule exprUnary");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 58) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:509:2: ( ( exprUnary -> exprUnary ) ( multDivModOp exprUnary -> ^( E_BINARY multDivModOp $exprMultDiv exprUnary ) )* )
            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:509:4: ( exprUnary -> exprUnary ) ( multDivModOp exprUnary -> ^( E_BINARY multDivModOp $exprMultDiv exprUnary ) )*
            {
            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:509:4: ( exprUnary -> exprUnary )
            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:509:5: exprUnary
            {
            pushFollow(FOLLOW_exprUnary_in_exprMultDiv2807);
            exprUnary181=exprUnary();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_exprUnary.add(exprUnary181.getTree());

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

            root_0 = (Object)adaptor.nil();
            // 509:15: -> exprUnary
            {
                adaptor.addChild(root_0, stream_exprUnary.nextTree());

            }


            retval.tree = root_0;
            }

            }


            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:510:2: ( multDivModOp exprUnary -> ^( E_BINARY multDivModOp $exprMultDiv exprUnary ) )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==123||LA57_0==128||LA57_0==131) ) {
                    int LA57_1 = input.LA(2);

                    if ( (synpred92_pol()) ) {
                        alt57=1;
                    }


                }


                switch (alt57) {
            	case 1 :
            	    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:511:3: multDivModOp exprUnary
            	    {
            	    pushFollow(FOLLOW_multDivModOp_in_exprMultDiv2819);
            	    multDivModOp182=multDivModOp();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_multDivModOp.add(multDivModOp182.getTree());

            	    pushFollow(FOLLOW_exprUnary_in_exprMultDiv2821);
            	    exprUnary183=exprUnary();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_exprUnary.add(exprUnary183.getTree());

            	    // AST REWRITE
            	    // elements: multDivModOp, exprUnary, exprMultDiv
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    if ( state.backtracking==0 ) {

            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 512:3: -> ^( E_BINARY multDivModOp $exprMultDiv exprUnary )
            	    {
            	        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:512:6: ^( E_BINARY multDivModOp $exprMultDiv exprUnary )
            	        {
            	        Object root_1 = (Object)adaptor.nil();
            	        root_1 = (Object)adaptor.becomeRoot(
            	        (Object)adaptor.create(E_BINARY, "E_BINARY")
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
            	    break loop57;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 58, exprMultDiv_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "exprMultDiv"


    public static class exprNew_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "exprNew"
    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:515:1: exprNew : 'new' typeName fcnArgumentList -> ^( E_NEW typeName fcnArgumentList ) ;
    public final polParser.exprNew_return exprNew() throws RecognitionException {
        polParser.exprNew_return retval = new polParser.exprNew_return();
        retval.start = input.LT(1);

        int exprNew_StartIndex = input.index();

        Object root_0 = null;

        Token string_literal184=null;
        polParser.typeName_return typeName185 =null;

        polParser.fcnArgumentList_return fcnArgumentList186 =null;


        Object string_literal184_tree=null;
        RewriteRuleTokenStream stream_175=new RewriteRuleTokenStream(adaptor,"token 175");
        RewriteRuleSubtreeStream stream_typeName=new RewriteRuleSubtreeStream(adaptor,"rule typeName");
        RewriteRuleSubtreeStream stream_fcnArgumentList=new RewriteRuleSubtreeStream(adaptor,"rule fcnArgumentList");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 59) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:516:2: ( 'new' typeName fcnArgumentList -> ^( E_NEW typeName fcnArgumentList ) )
            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:516:4: 'new' typeName fcnArgumentList
            {
            string_literal184=(Token)match(input,175,FOLLOW_175_in_exprNew2850); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_175.add(string_literal184);


            pushFollow(FOLLOW_typeName_in_exprNew2852);
            typeName185=typeName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeName.add(typeName185.getTree());

            pushFollow(FOLLOW_fcnArgumentList_in_exprNew2854);
            fcnArgumentList186=fcnArgumentList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_fcnArgumentList.add(fcnArgumentList186.getTree());

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

            root_0 = (Object)adaptor.nil();
            // 516:35: -> ^( E_NEW typeName fcnArgumentList )
            {
                // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:516:38: ^( E_NEW typeName fcnArgumentList )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(E_NEW, "E_NEW")
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

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 59, exprNew_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "exprNew"


    public static class exprUnary_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "exprUnary"
    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:518:1: exprUnary : ( primitiveLit | injectionCode | arrayLit -> ^( E_VEC arrayLit ) | logicalNotOp expr -> ^( E_UNARY logicalNotOp expr ) | bitwiseNotOp expr -> ^( E_UNARY bitwiseNotOp expr ) | '(' expr ')' -> ^( E_PAREN expr ) | MINUS expr -> ^( E_UNARY MINUS expr ) | varOrFcnOrArray incDecOp -> ^( E_UNARY varOrFcnOrArray incDecOp ) | varOrFcnOrArray | incDecOp varOrFcnOrArray -> ^( E_UNARY varOrFcnOrArray incDecOp ) | exprNew );
    public final polParser.exprUnary_return exprUnary() throws RecognitionException {
        polParser.exprUnary_return retval = new polParser.exprUnary_return();
        retval.start = input.LT(1);

        int exprUnary_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal194=null;
        Token char_literal196=null;
        Token MINUS197=null;
        polParser.primitiveLit_return primitiveLit187 =null;

        polParser.injectionCode_return injectionCode188 =null;

        polParser.arrayLit_return arrayLit189 =null;

        polParser.logicalNotOp_return logicalNotOp190 =null;

        polParser.expr_return expr191 =null;

        polParser.bitwiseNotOp_return bitwiseNotOp192 =null;

        polParser.expr_return expr193 =null;

        polParser.expr_return expr195 =null;

        polParser.expr_return expr198 =null;

        polParser.varOrFcnOrArray_return varOrFcnOrArray199 =null;

        polParser.incDecOp_return incDecOp200 =null;

        polParser.varOrFcnOrArray_return varOrFcnOrArray201 =null;

        polParser.incDecOp_return incDecOp202 =null;

        polParser.varOrFcnOrArray_return varOrFcnOrArray203 =null;

        polParser.exprNew_return exprNew204 =null;


        Object char_literal194_tree=null;
        Object char_literal196_tree=null;
        Object MINUS197_tree=null;
        RewriteRuleTokenStream stream_126=new RewriteRuleTokenStream(adaptor,"token 126");
        RewriteRuleTokenStream stream_127=new RewriteRuleTokenStream(adaptor,"token 127");
        RewriteRuleTokenStream stream_MINUS=new RewriteRuleTokenStream(adaptor,"token MINUS");
        RewriteRuleSubtreeStream stream_arrayLit=new RewriteRuleSubtreeStream(adaptor,"rule arrayLit");
        RewriteRuleSubtreeStream stream_incDecOp=new RewriteRuleSubtreeStream(adaptor,"rule incDecOp");
        RewriteRuleSubtreeStream stream_logicalNotOp=new RewriteRuleSubtreeStream(adaptor,"rule logicalNotOp");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_varOrFcnOrArray=new RewriteRuleSubtreeStream(adaptor,"rule varOrFcnOrArray");
        RewriteRuleSubtreeStream stream_bitwiseNotOp=new RewriteRuleSubtreeStream(adaptor,"rule bitwiseNotOp");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 60) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:519:2: ( primitiveLit | injectionCode | arrayLit -> ^( E_VEC arrayLit ) | logicalNotOp expr -> ^( E_UNARY logicalNotOp expr ) | bitwiseNotOp expr -> ^( E_UNARY bitwiseNotOp expr ) | '(' expr ')' -> ^( E_PAREN expr ) | MINUS expr -> ^( E_UNARY MINUS expr ) | varOrFcnOrArray incDecOp -> ^( E_UNARY varOrFcnOrArray incDecOp ) | varOrFcnOrArray | incDecOp varOrFcnOrArray -> ^( E_UNARY varOrFcnOrArray incDecOp ) | exprNew )
            int alt58=11;
            switch ( input.LA(1) ) {
            case CHAR:
            case HEX_LIT:
            case INT_LIT:
            case OCT_LIT:
            case REAL_LIT:
            case STRING:
            case 160:
            case 176:
            case 186:
                {
                alt58=1;
                }
                break;
            case INJECT:
                {
                alt58=2;
                }
                break;
            case 139:
                {
                alt58=3;
                }
                break;
            case LOG_NOT:
                {
                alt58=4;
                }
                break;
            case BIT_NOT:
                {
                alt58=5;
                }
                break;
            case 126:
                {
                alt58=6;
                }
                break;
            case MINUS:
                {
                alt58=7;
                }
                break;
            case 175:
                {
                int LA58_8 = input.LA(2);

                if ( (synpred100_pol()) ) {
                    alt58=8;
                }
                else if ( (synpred101_pol()) ) {
                    alt58=9;
                }
                else if ( (true) ) {
                    alt58=11;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 58, 8, input);

                    throw nvae;

                }
                }
                break;
            case DEC:
            case INC:
                {
                alt58=10;
                }
                break;
            case IDENT:
            case 138:
                {
                int LA58_13 = input.LA(2);

                if ( (synpred100_pol()) ) {
                    alt58=8;
                }
                else if ( (synpred101_pol()) ) {
                    alt58=9;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 58, 13, input);

                    throw nvae;

                }
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
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:519:4: primitiveLit
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_primitiveLit_in_exprUnary2874);
                    primitiveLit187=primitiveLit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveLit187.getTree());

                    }
                    break;
                case 2 :
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:520:4: injectionCode
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_injectionCode_in_exprUnary2879);
                    injectionCode188=injectionCode();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, injectionCode188.getTree());

                    }
                    break;
                case 3 :
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:521:4: arrayLit
                    {
                    pushFollow(FOLLOW_arrayLit_in_exprUnary2884);
                    arrayLit189=arrayLit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_arrayLit.add(arrayLit189.getTree());

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

                    root_0 = (Object)adaptor.nil();
                    // 521:18: -> ^( E_VEC arrayLit )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:521:21: ^( E_VEC arrayLit )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(E_VEC, "E_VEC")
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
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:522:4: logicalNotOp expr
                    {
                    pushFollow(FOLLOW_logicalNotOp_in_exprUnary2902);
                    logicalNotOp190=logicalNotOp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_logicalNotOp.add(logicalNotOp190.getTree());

                    pushFollow(FOLLOW_expr_in_exprUnary2904);
                    expr191=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr191.getTree());

                    // AST REWRITE
                    // elements: logicalNotOp, expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 522:25: -> ^( E_UNARY logicalNotOp expr )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:522:28: ^( E_UNARY logicalNotOp expr )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(E_UNARY, "E_UNARY")
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
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:523:4: bitwiseNotOp expr
                    {
                    pushFollow(FOLLOW_bitwiseNotOp_in_exprUnary2922);
                    bitwiseNotOp192=bitwiseNotOp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_bitwiseNotOp.add(bitwiseNotOp192.getTree());

                    pushFollow(FOLLOW_expr_in_exprUnary2924);
                    expr193=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr193.getTree());

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

                    root_0 = (Object)adaptor.nil();
                    // 523:25: -> ^( E_UNARY bitwiseNotOp expr )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:523:28: ^( E_UNARY bitwiseNotOp expr )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(E_UNARY, "E_UNARY")
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
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:524:4: '(' expr ')'
                    {
                    char_literal194=(Token)match(input,126,FOLLOW_126_in_exprUnary2942); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_126.add(char_literal194);


                    pushFollow(FOLLOW_expr_in_exprUnary2944);
                    expr195=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr195.getTree());

                    char_literal196=(Token)match(input,127,FOLLOW_127_in_exprUnary2946); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_127.add(char_literal196);


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

                    root_0 = (Object)adaptor.nil();
                    // 524:20: -> ^( E_PAREN expr )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:524:23: ^( E_PAREN expr )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(E_PAREN, "E_PAREN")
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
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:525:4: MINUS expr
                    {
                    MINUS197=(Token)match(input,MINUS,FOLLOW_MINUS_in_exprUnary2962); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MINUS.add(MINUS197);


                    pushFollow(FOLLOW_expr_in_exprUnary2964);
                    expr198=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr198.getTree());

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

                    root_0 = (Object)adaptor.nil();
                    // 525:19: -> ^( E_UNARY MINUS expr )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:525:22: ^( E_UNARY MINUS expr )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(E_UNARY, "E_UNARY")
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
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:526:4: varOrFcnOrArray incDecOp
                    {
                    pushFollow(FOLLOW_varOrFcnOrArray_in_exprUnary2983);
                    varOrFcnOrArray199=varOrFcnOrArray();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_varOrFcnOrArray.add(varOrFcnOrArray199.getTree());

                    pushFollow(FOLLOW_incDecOp_in_exprUnary2985);
                    incDecOp200=incDecOp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_incDecOp.add(incDecOp200.getTree());

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

                    root_0 = (Object)adaptor.nil();
                    // 526:29: -> ^( E_UNARY varOrFcnOrArray incDecOp )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:526:32: ^( E_UNARY varOrFcnOrArray incDecOp )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(E_UNARY, "E_UNARY")
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
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:527:4: varOrFcnOrArray
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_varOrFcnOrArray_in_exprUnary3000);
                    varOrFcnOrArray201=varOrFcnOrArray();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varOrFcnOrArray201.getTree());

                    }
                    break;
                case 10 :
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:528:4: incDecOp varOrFcnOrArray
                    {
                    pushFollow(FOLLOW_incDecOp_in_exprUnary3005);
                    incDecOp202=incDecOp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_incDecOp.add(incDecOp202.getTree());

                    pushFollow(FOLLOW_varOrFcnOrArray_in_exprUnary3007);
                    varOrFcnOrArray203=varOrFcnOrArray();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_varOrFcnOrArray.add(varOrFcnOrArray203.getTree());

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

                    root_0 = (Object)adaptor.nil();
                    // 528:29: -> ^( E_UNARY varOrFcnOrArray incDecOp )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:528:32: ^( E_UNARY varOrFcnOrArray incDecOp )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(E_UNARY, "E_UNARY")
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
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:529:4: exprNew
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_exprNew_in_exprUnary3022);
                    exprNew204=exprNew();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, exprNew204.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 60, exprUnary_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "exprUnary"


    public static class fcnDefinition_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "fcnDefinition"
    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:531:1: fcnDefinition : ( 'public' )? ( 'host' )? fcnType_fcnName fcnFormalParameterList fcnBody -> ^( D_FCN_DEF fcnType_fcnName fcnFormalParameterList fcnBody ) ;
    public final polParser.fcnDefinition_return fcnDefinition() throws RecognitionException {
        polParser.fcnDefinition_return retval = new polParser.fcnDefinition_return();
        retval.start = input.LT(1);

        int fcnDefinition_StartIndex = input.index();

        Object root_0 = null;

        Token string_literal205=null;
        Token string_literal206=null;
        polParser.fcnType_fcnName_return fcnType_fcnName207 =null;

        polParser.fcnFormalParameterList_return fcnFormalParameterList208 =null;

        polParser.fcnBody_return fcnBody209 =null;


        Object string_literal205_tree=null;
        Object string_literal206_tree=null;
        RewriteRuleTokenStream stream_182=new RewriteRuleTokenStream(adaptor,"token 182");
        RewriteRuleTokenStream stream_164=new RewriteRuleTokenStream(adaptor,"token 164");
        RewriteRuleSubtreeStream stream_fcnFormalParameterList=new RewriteRuleSubtreeStream(adaptor,"rule fcnFormalParameterList");
        RewriteRuleSubtreeStream stream_fcnType_fcnName=new RewriteRuleSubtreeStream(adaptor,"rule fcnType_fcnName");
        RewriteRuleSubtreeStream stream_fcnBody=new RewriteRuleSubtreeStream(adaptor,"rule fcnBody");

        	atFlags.clear();			

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 61) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:538:2: ( ( 'public' )? ( 'host' )? fcnType_fcnName fcnFormalParameterList fcnBody -> ^( D_FCN_DEF fcnType_fcnName fcnFormalParameterList fcnBody ) )
            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:538:4: ( 'public' )? ( 'host' )? fcnType_fcnName fcnFormalParameterList fcnBody
            {
            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:538:4: ( 'public' )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==182) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:538:5: 'public'
                    {
                    string_literal205=(Token)match(input,182,FOLLOW_182_in_fcnDefinition3042); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_182.add(string_literal205);


                    if ( state.backtracking==0 ) { atFlags.add(AttrFlags.PUBLIC); }

                    }
                    break;

            }


            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:539:3: ( 'host' )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==164) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:539:4: 'host'
                    {
                    string_literal206=(Token)match(input,164,FOLLOW_164_in_fcnDefinition3053); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_164.add(string_literal206);


                    if ( state.backtracking==0 ) { atFlags.add(AttrFlags.HOST); }

                    }
                    break;

            }


            pushFollow(FOLLOW_fcnType_fcnName_in_fcnDefinition3063);
            fcnType_fcnName207=fcnType_fcnName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_fcnType_fcnName.add(fcnType_fcnName207.getTree());

            pushFollow(FOLLOW_fcnFormalParameterList_in_fcnDefinition3065);
            fcnFormalParameterList208=fcnFormalParameterList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_fcnFormalParameterList.add(fcnFormalParameterList208.getTree());

            pushFollow(FOLLOW_fcnBody_in_fcnDefinition3067);
            fcnBody209=fcnBody();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_fcnBody.add(fcnBody209.getTree());

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

            root_0 = (Object)adaptor.nil();
            // 541:3: -> ^( D_FCN_DEF fcnType_fcnName fcnFormalParameterList fcnBody )
            {
                // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:541:6: ^( D_FCN_DEF fcnType_fcnName fcnFormalParameterList fcnBody )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(D_FCN_DEF, "D_FCN_DEF")
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

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) {
              atFlags.clear();
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 61, fcnDefinition_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "fcnDefinition"


    public static class fcnDefinitionHost_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "fcnDefinitionHost"
    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:543:1: fcnDefinitionHost : ( 'public' )? ( 'host' )? fcnType_fcnName fcnFormalParameterList fcnBody -> ^( D_FCN_DEF fcnType_fcnName fcnFormalParameterList fcnBody ) ;
    public final polParser.fcnDefinitionHost_return fcnDefinitionHost() throws RecognitionException {
        polParser.fcnDefinitionHost_return retval = new polParser.fcnDefinitionHost_return();
        retval.start = input.LT(1);

        int fcnDefinitionHost_StartIndex = input.index();

        Object root_0 = null;

        Token string_literal210=null;
        Token string_literal211=null;
        polParser.fcnType_fcnName_return fcnType_fcnName212 =null;

        polParser.fcnFormalParameterList_return fcnFormalParameterList213 =null;

        polParser.fcnBody_return fcnBody214 =null;


        Object string_literal210_tree=null;
        Object string_literal211_tree=null;
        RewriteRuleTokenStream stream_182=new RewriteRuleTokenStream(adaptor,"token 182");
        RewriteRuleTokenStream stream_164=new RewriteRuleTokenStream(adaptor,"token 164");
        RewriteRuleSubtreeStream stream_fcnFormalParameterList=new RewriteRuleSubtreeStream(adaptor,"rule fcnFormalParameterList");
        RewriteRuleSubtreeStream stream_fcnType_fcnName=new RewriteRuleSubtreeStream(adaptor,"rule fcnType_fcnName");
        RewriteRuleSubtreeStream stream_fcnBody=new RewriteRuleSubtreeStream(adaptor,"rule fcnBody");

        	atFlags.clear();			

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 62) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:551:2: ( ( 'public' )? ( 'host' )? fcnType_fcnName fcnFormalParameterList fcnBody -> ^( D_FCN_DEF fcnType_fcnName fcnFormalParameterList fcnBody ) )
            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:551:4: ( 'public' )? ( 'host' )? fcnType_fcnName fcnFormalParameterList fcnBody
            {
            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:551:4: ( 'public' )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==182) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:551:5: 'public'
                    {
                    string_literal210=(Token)match(input,182,FOLLOW_182_in_fcnDefinitionHost3103); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_182.add(string_literal210);


                    }
                    break;

            }


            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:551:16: ( 'host' )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==164) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:551:17: 'host'
                    {
                    string_literal211=(Token)match(input,164,FOLLOW_164_in_fcnDefinitionHost3108); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_164.add(string_literal211);


                    if ( state.backtracking==0 ) { atFlags.add(AttrFlags.HOST); }

                    }
                    break;

            }


            pushFollow(FOLLOW_fcnType_fcnName_in_fcnDefinitionHost3119);
            fcnType_fcnName212=fcnType_fcnName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_fcnType_fcnName.add(fcnType_fcnName212.getTree());

            pushFollow(FOLLOW_fcnFormalParameterList_in_fcnDefinitionHost3122);
            fcnFormalParameterList213=fcnFormalParameterList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_fcnFormalParameterList.add(fcnFormalParameterList213.getTree());

            pushFollow(FOLLOW_fcnBody_in_fcnDefinitionHost3124);
            fcnBody214=fcnBody();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_fcnBody.add(fcnBody214.getTree());

            if ( state.backtracking==0 ) { 	atFlags.add(AttrFlags.PUBLIC); /* enforce */ 	
            			if (!atFlags.contains(AttrFlags.HOST))
                   		throw new PollenException("Composition features must be one of host functions, export statements, or enum definitions.", input);
            		}

            // AST REWRITE
            // elements: fcnFormalParameterList, fcnType_fcnName, fcnBody
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 557:3: -> ^( D_FCN_DEF fcnType_fcnName fcnFormalParameterList fcnBody )
            {
                // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:557:6: ^( D_FCN_DEF fcnType_fcnName fcnFormalParameterList fcnBody )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(D_FCN_DEF, "D_FCN_DEF")
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

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "fcnAttr"
    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:564:1: fcnAttr : ( 'public' )? ( 'host' )? ;
    public final polParser.fcnAttr_return fcnAttr() throws RecognitionException {
        polParser.fcnAttr_return retval = new polParser.fcnAttr_return();
        retval.start = input.LT(1);

        int fcnAttr_StartIndex = input.index();

        Object root_0 = null;

        Token string_literal215=null;
        Token string_literal216=null;

        Object string_literal215_tree=null;
        Object string_literal216_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 63) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:565:2: ( ( 'public' )? ( 'host' )? )
            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:565:4: ( 'public' )? ( 'host' )?
            {
            root_0 = (Object)adaptor.nil();


            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:565:4: ( 'public' )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==182) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:565:5: 'public'
                    {
                    string_literal215=(Token)match(input,182,FOLLOW_182_in_fcnAttr3161); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal215_tree = 
                    (Object)adaptor.create(string_literal215)
                    ;
                    adaptor.addChild(root_0, string_literal215_tree);
                    }

                    if ( state.backtracking==0 ) { atFlags.add(AttrFlags.PUBLIC); }

                    }
                    break;

            }


            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:566:3: ( 'host' )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==164) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:566:4: 'host'
                    {
                    string_literal216=(Token)match(input,164,FOLLOW_164_in_fcnAttr3172); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal216_tree = 
                    (Object)adaptor.create(string_literal216)
                    ;
                    adaptor.addChild(root_0, string_literal216_tree);
                    }

                    if ( state.backtracking==0 ) { atFlags.add(AttrFlags.HOST); }

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 63, fcnAttr_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "fcnAttr"


    public static class fcnBody_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "fcnBody"
    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:568:1: fcnBody : braceOpen ( stmts ) braceClose -> ^( FCNBODY stmts ) ;
    public final polParser.fcnBody_return fcnBody() throws RecognitionException {
        polParser.fcnBody_return retval = new polParser.fcnBody_return();
        retval.start = input.LT(1);

        int fcnBody_StartIndex = input.index();

        Object root_0 = null;

        polParser.braceOpen_return braceOpen217 =null;

        polParser.stmts_return stmts218 =null;

        polParser.braceClose_return braceClose219 =null;


        RewriteRuleSubtreeStream stream_stmts=new RewriteRuleSubtreeStream(adaptor,"rule stmts");
        RewriteRuleSubtreeStream stream_braceOpen=new RewriteRuleSubtreeStream(adaptor,"rule braceOpen");
        RewriteRuleSubtreeStream stream_braceClose=new RewriteRuleSubtreeStream(adaptor,"rule braceClose");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 64) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:569:3: ( braceOpen ( stmts ) braceClose -> ^( FCNBODY stmts ) )
            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:569:5: braceOpen ( stmts ) braceClose
            {
            pushFollow(FOLLOW_braceOpen_in_fcnBody3188);
            braceOpen217=braceOpen();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_braceOpen.add(braceOpen217.getTree());

            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:569:15: ( stmts )
            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:569:16: stmts
            {
            pushFollow(FOLLOW_stmts_in_fcnBody3191);
            stmts218=stmts();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_stmts.add(stmts218.getTree());

            }


            pushFollow(FOLLOW_braceClose_in_fcnBody3195);
            braceClose219=braceClose();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_braceClose.add(braceClose219.getTree());

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

            root_0 = (Object)adaptor.nil();
            // 569:36: -> ^( FCNBODY stmts )
            {
                // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:569:39: ^( FCNBODY stmts )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(FCNBODY, "FCNBODY")
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

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 64, fcnBody_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "fcnBody"


    public static class fcnDeclaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "fcnDeclaration"
    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:571:1: fcnDeclaration : ( 'public' )? ( 'host' )? fcnType_fcnName ( fcnFormalParameterList ) delim -> ^( D_FCN_DCL fcnType_fcnName fcnFormalParameterList ) ;
    public final polParser.fcnDeclaration_return fcnDeclaration() throws RecognitionException {
        polParser.fcnDeclaration_return retval = new polParser.fcnDeclaration_return();
        retval.start = input.LT(1);

        int fcnDeclaration_StartIndex = input.index();

        Object root_0 = null;

        Token string_literal220=null;
        Token string_literal221=null;
        polParser.fcnType_fcnName_return fcnType_fcnName222 =null;

        polParser.fcnFormalParameterList_return fcnFormalParameterList223 =null;

        polParser.delim_return delim224 =null;


        Object string_literal220_tree=null;
        Object string_literal221_tree=null;
        RewriteRuleTokenStream stream_182=new RewriteRuleTokenStream(adaptor,"token 182");
        RewriteRuleTokenStream stream_164=new RewriteRuleTokenStream(adaptor,"token 164");
        RewriteRuleSubtreeStream stream_fcnFormalParameterList=new RewriteRuleSubtreeStream(adaptor,"rule fcnFormalParameterList");
        RewriteRuleSubtreeStream stream_fcnType_fcnName=new RewriteRuleSubtreeStream(adaptor,"rule fcnType_fcnName");
        RewriteRuleSubtreeStream stream_delim=new RewriteRuleSubtreeStream(adaptor,"rule delim");

        	atFlags.clear();			

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 65) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:578:4: ( ( 'public' )? ( 'host' )? fcnType_fcnName ( fcnFormalParameterList ) delim -> ^( D_FCN_DCL fcnType_fcnName fcnFormalParameterList ) )
            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:578:6: ( 'public' )? ( 'host' )? fcnType_fcnName ( fcnFormalParameterList ) delim
            {
            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:578:6: ( 'public' )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==182) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:578:7: 'public'
                    {
                    string_literal220=(Token)match(input,182,FOLLOW_182_in_fcnDeclaration3227); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_182.add(string_literal220);


                    if ( state.backtracking==0 ) { atFlags.add(AttrFlags.PUBLIC); }

                    }
                    break;

            }


            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:579:3: ( 'host' )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==164) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:579:4: 'host'
                    {
                    string_literal221=(Token)match(input,164,FOLLOW_164_in_fcnDeclaration3238); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_164.add(string_literal221);


                    if ( state.backtracking==0 ) { atFlags.add(AttrFlags.HOST); }

                    }
                    break;

            }


            pushFollow(FOLLOW_fcnType_fcnName_in_fcnDeclaration3248);
            fcnType_fcnName222=fcnType_fcnName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_fcnType_fcnName.add(fcnType_fcnName222.getTree());

            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:580:19: ( fcnFormalParameterList )
            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:580:20: fcnFormalParameterList
            {
            pushFollow(FOLLOW_fcnFormalParameterList_in_fcnDeclaration3251);
            fcnFormalParameterList223=fcnFormalParameterList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_fcnFormalParameterList.add(fcnFormalParameterList223.getTree());

            }


            pushFollow(FOLLOW_delim_in_fcnDeclaration3254);
            delim224=delim();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_delim.add(delim224.getTree());

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

            root_0 = (Object)adaptor.nil();
            // 581:4: -> ^( D_FCN_DCL fcnType_fcnName fcnFormalParameterList )
            {
                // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:581:7: ^( D_FCN_DCL fcnType_fcnName fcnFormalParameterList )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(D_FCN_DCL, "D_FCN_DCL")
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

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) {
              atFlags.clear();
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 65, fcnDeclaration_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "fcnDeclaration"


    public static class fcnType_fcnName_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "fcnType_fcnName"
    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:583:1: fcnType_fcnName : ( typeName qualName -> ^( D_FCN_TYP_NM ^( LIST typeName ) qualName ) |{...}?t= typeName -> ^( D_FCN_CTOR ^( LIST $t) typeName ) | qualName -> ^( D_FCN_TYP_NM ^( LIST ) qualName ) | ( '(' typeName ( ',' typeName )* ')' qualName )=> fcnTypes_fcnName );
    public final polParser.fcnType_fcnName_return fcnType_fcnName() throws RecognitionException {
        polParser.fcnType_fcnName_return retval = new polParser.fcnType_fcnName_return();
        retval.start = input.LT(1);

        int fcnType_fcnName_StartIndex = input.index();

        Object root_0 = null;

        polParser.typeName_return t =null;

        polParser.typeName_return typeName225 =null;

        polParser.qualName_return qualName226 =null;

        polParser.qualName_return qualName227 =null;

        polParser.fcnTypes_fcnName_return fcnTypes_fcnName228 =null;


        RewriteRuleSubtreeStream stream_typeName=new RewriteRuleSubtreeStream(adaptor,"rule typeName");
        RewriteRuleSubtreeStream stream_qualName=new RewriteRuleSubtreeStream(adaptor,"rule qualName");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 66) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:586:2: ( typeName qualName -> ^( D_FCN_TYP_NM ^( LIST typeName ) qualName ) |{...}?t= typeName -> ^( D_FCN_CTOR ^( LIST $t) typeName ) | qualName -> ^( D_FCN_TYP_NM ^( LIST ) qualName ) | ( '(' typeName ( ',' typeName )* ')' qualName )=> fcnTypes_fcnName )
            int alt67=4;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==144||LA67_0==146||(LA67_0 >= 169 && LA67_0 <= 171)||LA67_0==184||(LA67_0 >= 188 && LA67_0 <= 190)) ) {
                int LA67_1 = input.LA(2);

                if ( (synpred111_pol()) ) {
                    alt67=1;
                }
                else if ( (((synpred112_pol()&&synpred112_pol())&&(input.LT(1).getText().equals(ti.getTypeName()) ))) ) {
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

                if ( (synpred111_pol()) ) {
                    alt67=1;
                }
                else if ( (((synpred112_pol()&&synpred112_pol())&&(input.LT(1).getText().equals(ti.getTypeName()) ))) ) {
                    alt67=2;
                }
                else if ( (synpred113_pol()) ) {
                    alt67=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 67, 2, input);

                    throw nvae;

                }
            }
            else if ( (LA67_0==126) && (synpred115_pol())) {
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
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:586:4: typeName qualName
                    {
                    pushFollow(FOLLOW_typeName_in_fcnType_fcnName3281);
                    typeName225=typeName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeName.add(typeName225.getTree());

                    pushFollow(FOLLOW_qualName_in_fcnType_fcnName3283);
                    qualName226=qualName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_qualName.add(qualName226.getTree());

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

                    root_0 = (Object)adaptor.nil();
                    // 587:3: -> ^( D_FCN_TYP_NM ^( LIST typeName ) qualName )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:587:6: ^( D_FCN_TYP_NM ^( LIST typeName ) qualName )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(D_FCN_TYP_NM, "D_FCN_TYP_NM")
                        , root_1);

                        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:587:22: ^( LIST typeName )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(LIST, "LIST")
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
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:588:4: {...}?t= typeName
                    {
                    if ( !((input.LT(1).getText().equals(ti.getTypeName()) )) ) {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        throw new FailedPredicateException(input, "fcnType_fcnName", "input.LT(1).getText().equals(ti.getTypeName()) ");
                    }

                    pushFollow(FOLLOW_typeName_in_fcnType_fcnName3317);
                    t=typeName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeName.add(t.getTree());

                    // AST REWRITE
                    // elements: typeName, t
                    // token labels: 
                    // rule labels: retval, t
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_t=new RewriteRuleSubtreeStream(adaptor,"rule t",t!=null?t.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 589:3: -> ^( D_FCN_CTOR ^( LIST $t) typeName )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:589:6: ^( D_FCN_CTOR ^( LIST $t) typeName )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(D_FCN_CTOR, "D_FCN_CTOR")
                        , root_1);

                        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:589:19: ^( LIST $t)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(LIST, "LIST")
                        , root_2);

                        adaptor.addChild(root_2, stream_t.nextTree());

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
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:590:4: qualName
                    {
                    pushFollow(FOLLOW_qualName_in_fcnType_fcnName3350);
                    qualName227=qualName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_qualName.add(qualName227.getTree());

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

                    root_0 = (Object)adaptor.nil();
                    // 591:3: -> ^( D_FCN_TYP_NM ^( LIST ) qualName )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:591:6: ^( D_FCN_TYP_NM ^( LIST ) qualName )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(D_FCN_TYP_NM, "D_FCN_TYP_NM")
                        , root_1);

                        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:591:21: ^( LIST )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(LIST, "LIST")
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
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:592:4: ( '(' typeName ( ',' typeName )* ')' qualName )=> fcnTypes_fcnName
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_fcnTypes_fcnName_in_fcnType_fcnName3405);
                    fcnTypes_fcnName228=fcnTypes_fcnName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, fcnTypes_fcnName228.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 66, fcnType_fcnName_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "fcnType_fcnName"


    public static class fcnTypes_fcnName_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "fcnTypes_fcnName"
    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:594:1: fcnTypes_fcnName : '(' fcnTypes ')' qualName -> ^( D_FCN_TYP_NM fcnTypes qualName ) ;
    public final polParser.fcnTypes_fcnName_return fcnTypes_fcnName() throws RecognitionException {
        polParser.fcnTypes_fcnName_return retval = new polParser.fcnTypes_fcnName_return();
        retval.start = input.LT(1);

        int fcnTypes_fcnName_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal229=null;
        Token char_literal231=null;
        polParser.fcnTypes_return fcnTypes230 =null;

        polParser.qualName_return qualName232 =null;


        Object char_literal229_tree=null;
        Object char_literal231_tree=null;
        RewriteRuleTokenStream stream_126=new RewriteRuleTokenStream(adaptor,"token 126");
        RewriteRuleTokenStream stream_127=new RewriteRuleTokenStream(adaptor,"token 127");
        RewriteRuleSubtreeStream stream_fcnTypes=new RewriteRuleSubtreeStream(adaptor,"rule fcnTypes");
        RewriteRuleSubtreeStream stream_qualName=new RewriteRuleSubtreeStream(adaptor,"rule qualName");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 67) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:595:2: ( '(' fcnTypes ')' qualName -> ^( D_FCN_TYP_NM fcnTypes qualName ) )
            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:595:4: '(' fcnTypes ')' qualName
            {
            char_literal229=(Token)match(input,126,FOLLOW_126_in_fcnTypes_fcnName3416); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_126.add(char_literal229);


            pushFollow(FOLLOW_fcnTypes_in_fcnTypes_fcnName3418);
            fcnTypes230=fcnTypes();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_fcnTypes.add(fcnTypes230.getTree());

            char_literal231=(Token)match(input,127,FOLLOW_127_in_fcnTypes_fcnName3420); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_127.add(char_literal231);


            pushFollow(FOLLOW_qualName_in_fcnTypes_fcnName3422);
            qualName232=qualName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_qualName.add(qualName232.getTree());

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

            root_0 = (Object)adaptor.nil();
            // 595:30: -> ^( D_FCN_TYP_NM fcnTypes qualName )
            {
                // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:595:33: ^( D_FCN_TYP_NM fcnTypes qualName )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(D_FCN_TYP_NM, "D_FCN_TYP_NM")
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

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 67, fcnTypes_fcnName_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "fcnTypes_fcnName"


    public static class fcnTypes_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "fcnTypes"
    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:597:1: fcnTypes : typeName ( ',' typeName )* -> ^( LIST ( typeName )+ ) ;
    public final polParser.fcnTypes_return fcnTypes() throws RecognitionException {
        polParser.fcnTypes_return retval = new polParser.fcnTypes_return();
        retval.start = input.LT(1);

        int fcnTypes_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal234=null;
        polParser.typeName_return typeName233 =null;

        polParser.typeName_return typeName235 =null;


        Object char_literal234_tree=null;
        RewriteRuleTokenStream stream_129=new RewriteRuleTokenStream(adaptor,"token 129");
        RewriteRuleSubtreeStream stream_typeName=new RewriteRuleSubtreeStream(adaptor,"rule typeName");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 68) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:598:2: ( typeName ( ',' typeName )* -> ^( LIST ( typeName )+ ) )
            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:598:4: typeName ( ',' typeName )*
            {
            pushFollow(FOLLOW_typeName_in_fcnTypes3443);
            typeName233=typeName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeName.add(typeName233.getTree());

            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:598:13: ( ',' typeName )*
            loop68:
            do {
                int alt68=2;
                int LA68_0 = input.LA(1);

                if ( (LA68_0==129) ) {
                    alt68=1;
                }


                switch (alt68) {
            	case 1 :
            	    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:598:14: ',' typeName
            	    {
            	    char_literal234=(Token)match(input,129,FOLLOW_129_in_fcnTypes3446); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_129.add(char_literal234);


            	    pushFollow(FOLLOW_typeName_in_fcnTypes3448);
            	    typeName235=typeName();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_typeName.add(typeName235.getTree());

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

            root_0 = (Object)adaptor.nil();
            // 598:29: -> ^( LIST ( typeName )+ )
            {
                // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:598:32: ^( LIST ( typeName )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(LIST, "LIST")
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

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 68, fcnTypes_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "fcnTypes"


    public static class fcnFormalParameterList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "fcnFormalParameterList"
    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:600:1: fcnFormalParameterList : '(' fcnFormalParameters ')' -> fcnFormalParameters ;
    public final polParser.fcnFormalParameterList_return fcnFormalParameterList() throws RecognitionException {
        polParser.fcnFormalParameterList_return retval = new polParser.fcnFormalParameterList_return();
        retval.start = input.LT(1);

        int fcnFormalParameterList_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal236=null;
        Token char_literal238=null;
        polParser.fcnFormalParameters_return fcnFormalParameters237 =null;


        Object char_literal236_tree=null;
        Object char_literal238_tree=null;
        RewriteRuleTokenStream stream_126=new RewriteRuleTokenStream(adaptor,"token 126");
        RewriteRuleTokenStream stream_127=new RewriteRuleTokenStream(adaptor,"token 127");
        RewriteRuleSubtreeStream stream_fcnFormalParameters=new RewriteRuleSubtreeStream(adaptor,"rule fcnFormalParameters");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 69) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:601:2: ( '(' fcnFormalParameters ')' -> fcnFormalParameters )
            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:601:4: '(' fcnFormalParameters ')'
            {
            char_literal236=(Token)match(input,126,FOLLOW_126_in_fcnFormalParameterList3469); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_126.add(char_literal236);


            pushFollow(FOLLOW_fcnFormalParameters_in_fcnFormalParameterList3471);
            fcnFormalParameters237=fcnFormalParameters();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_fcnFormalParameters.add(fcnFormalParameters237.getTree());

            char_literal238=(Token)match(input,127,FOLLOW_127_in_fcnFormalParameterList3473); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_127.add(char_literal238);


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

            root_0 = (Object)adaptor.nil();
            // 601:32: -> fcnFormalParameters
            {
                adaptor.addChild(root_0, stream_fcnFormalParameters.nextTree());

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 69, fcnFormalParameterList_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "fcnFormalParameterList"


    public static class fcnFormalParameters_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "fcnFormalParameters"
    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:603:1: fcnFormalParameters : ( fcnFormalParameter ( ',' fcnFormalParameter )* -> ^( LIST ( fcnFormalParameter )+ ) | -> ^( LIST ) );
    public final polParser.fcnFormalParameters_return fcnFormalParameters() throws RecognitionException {
        polParser.fcnFormalParameters_return retval = new polParser.fcnFormalParameters_return();
        retval.start = input.LT(1);

        int fcnFormalParameters_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal240=null;
        polParser.fcnFormalParameter_return fcnFormalParameter239 =null;

        polParser.fcnFormalParameter_return fcnFormalParameter241 =null;


        Object char_literal240_tree=null;
        RewriteRuleTokenStream stream_129=new RewriteRuleTokenStream(adaptor,"token 129");
        RewriteRuleSubtreeStream stream_fcnFormalParameter=new RewriteRuleSubtreeStream(adaptor,"rule fcnFormalParameter");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 70) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:604:2: ( fcnFormalParameter ( ',' fcnFormalParameter )* -> ^( LIST ( fcnFormalParameter )+ ) | -> ^( LIST ) )
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==IDENT||LA70_0==144||LA70_0==146||(LA70_0 >= 169 && LA70_0 <= 171)||LA70_0==184||(LA70_0 >= 188 && LA70_0 <= 190)) ) {
                alt70=1;
            }
            else if ( (LA70_0==127) ) {
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
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:604:4: fcnFormalParameter ( ',' fcnFormalParameter )*
                    {
                    pushFollow(FOLLOW_fcnFormalParameter_in_fcnFormalParameters3487);
                    fcnFormalParameter239=fcnFormalParameter();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_fcnFormalParameter.add(fcnFormalParameter239.getTree());

                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:604:23: ( ',' fcnFormalParameter )*
                    loop69:
                    do {
                        int alt69=2;
                        int LA69_0 = input.LA(1);

                        if ( (LA69_0==129) ) {
                            alt69=1;
                        }


                        switch (alt69) {
                    	case 1 :
                    	    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:604:24: ',' fcnFormalParameter
                    	    {
                    	    char_literal240=(Token)match(input,129,FOLLOW_129_in_fcnFormalParameters3490); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_129.add(char_literal240);


                    	    pushFollow(FOLLOW_fcnFormalParameter_in_fcnFormalParameters3492);
                    	    fcnFormalParameter241=fcnFormalParameter();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_fcnFormalParameter.add(fcnFormalParameter241.getTree());

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

                    root_0 = (Object)adaptor.nil();
                    // 605:3: -> ^( LIST ( fcnFormalParameter )+ )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:605:6: ^( LIST ( fcnFormalParameter )+ )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(LIST, "LIST")
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
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:606:4: 
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

                    root_0 = (Object)adaptor.nil();
                    // 606:4: -> ^( LIST )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:606:7: ^( LIST )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(LIST, "LIST")
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

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 70, fcnFormalParameters_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "fcnFormalParameters"


    public static class fcnFormalParameter_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "fcnFormalParameter"
    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:608:1: fcnFormalParameter : typeName IDENT ( '=' expr )? -> ^( D_FORMAL typeName ^( IDENT ( expr )? ) ) ;
    public final polParser.fcnFormalParameter_return fcnFormalParameter() throws RecognitionException {
        polParser.fcnFormalParameter_return retval = new polParser.fcnFormalParameter_return();
        retval.start = input.LT(1);

        int fcnFormalParameter_StartIndex = input.index();

        Object root_0 = null;

        Token IDENT243=null;
        Token char_literal244=null;
        polParser.typeName_return typeName242 =null;

        polParser.expr_return expr245 =null;


        Object IDENT243_tree=null;
        Object char_literal244_tree=null;
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
        RewriteRuleSubtreeStream stream_typeName=new RewriteRuleSubtreeStream(adaptor,"rule typeName");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 71) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:609:2: ( typeName IDENT ( '=' expr )? -> ^( D_FORMAL typeName ^( IDENT ( expr )? ) ) )
            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:609:6: typeName IDENT ( '=' expr )?
            {
            pushFollow(FOLLOW_typeName_in_fcnFormalParameter3527);
            typeName242=typeName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeName.add(typeName242.getTree());

            IDENT243=(Token)match(input,IDENT,FOLLOW_IDENT_in_fcnFormalParameter3529); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENT.add(IDENT243);


            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:609:21: ( '=' expr )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==ASSIGN) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:609:23: '=' expr
                    {
                    char_literal244=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_fcnFormalParameter3533); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ASSIGN.add(char_literal244);


                    pushFollow(FOLLOW_expr_in_fcnFormalParameter3535);
                    expr245=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr245.getTree());

                    }
                    break;

            }


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

            root_0 = (Object)adaptor.nil();
            // 610:3: -> ^( D_FORMAL typeName ^( IDENT ( expr )? ) )
            {
                // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:610:6: ^( D_FORMAL typeName ^( IDENT ( expr )? ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(D_FORMAL, "D_FORMAL")
                , root_1);

                adaptor.addChild(root_1, stream_typeName.nextTree());

                // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:610:26: ^( IDENT ( expr )? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                stream_IDENT.nextNode()
                , root_2);

                // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:610:34: ( expr )?
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

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 71, fcnFormalParameter_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "fcnFormalParameter"


    public static class fcnArgumentList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "fcnArgumentList"
    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:612:1: fcnArgumentList : '(' fcnArguments ')' -> fcnArguments ;
    public final polParser.fcnArgumentList_return fcnArgumentList() throws RecognitionException {
        polParser.fcnArgumentList_return retval = new polParser.fcnArgumentList_return();
        retval.start = input.LT(1);

        int fcnArgumentList_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal246=null;
        Token char_literal248=null;
        polParser.fcnArguments_return fcnArguments247 =null;


        Object char_literal246_tree=null;
        Object char_literal248_tree=null;
        RewriteRuleTokenStream stream_126=new RewriteRuleTokenStream(adaptor,"token 126");
        RewriteRuleTokenStream stream_127=new RewriteRuleTokenStream(adaptor,"token 127");
        RewriteRuleSubtreeStream stream_fcnArguments=new RewriteRuleSubtreeStream(adaptor,"rule fcnArguments");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 72) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:613:2: ( '(' fcnArguments ')' -> fcnArguments )
            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:613:4: '(' fcnArguments ')'
            {
            char_literal246=(Token)match(input,126,FOLLOW_126_in_fcnArgumentList3566); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_126.add(char_literal246);


            pushFollow(FOLLOW_fcnArguments_in_fcnArgumentList3568);
            fcnArguments247=fcnArguments();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_fcnArguments.add(fcnArguments247.getTree());

            char_literal248=(Token)match(input,127,FOLLOW_127_in_fcnArgumentList3570); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_127.add(char_literal248);


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

            root_0 = (Object)adaptor.nil();
            // 613:25: -> fcnArguments
            {
                adaptor.addChild(root_0, stream_fcnArguments.nextTree());

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 72, fcnArgumentList_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "fcnArgumentList"


    public static class fcnArguments_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "fcnArguments"
    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:615:1: fcnArguments : exprList ;
    public final polParser.fcnArguments_return fcnArguments() throws RecognitionException {
        polParser.fcnArguments_return retval = new polParser.fcnArguments_return();
        retval.start = input.LT(1);

        int fcnArguments_StartIndex = input.index();

        Object root_0 = null;

        polParser.exprList_return exprList249 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 73) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:616:2: ( exprList )
            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:616:4: exprList
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_exprList_in_fcnArguments3584);
            exprList249=exprList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, exprList249.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 73, fcnArguments_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "fcnArguments"


    public static class varOrFcnOrArray_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "varOrFcnOrArray"
    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:618:1: varOrFcnOrArray : ( 'new' typeName fcnArgumentList ( fieldOrArrayAccess )? -> ^( E_NEW typeName fcnArgumentList ( fieldOrArrayAccess )? ) | '@' IDENT fcnArgumentList ( fieldOrArrayAccess )? -> ^( E_SELF ^( E_CALL IDENT fcnArgumentList ( fieldOrArrayAccess )? ) ) | '@' IDENT ( fieldOrArrayAccess )? -> ^( E_SELF IDENT ( fieldOrArrayAccess )? ) | '@' -> ^( E_SELF ) | qualName fcnArgumentList ( fieldOrArrayAccess )? -> ^( E_CALL qualName fcnArgumentList ( fieldOrArrayAccess )? ) | qualName ( fieldOrArrayAccess )? );
    public final polParser.varOrFcnOrArray_return varOrFcnOrArray() throws RecognitionException {
        polParser.varOrFcnOrArray_return retval = new polParser.varOrFcnOrArray_return();
        retval.start = input.LT(1);

        int varOrFcnOrArray_StartIndex = input.index();

        Object root_0 = null;

        Token string_literal250=null;
        Token char_literal254=null;
        Token IDENT255=null;
        Token char_literal258=null;
        Token IDENT259=null;
        Token char_literal261=null;
        polParser.typeName_return typeName251 =null;

        polParser.fcnArgumentList_return fcnArgumentList252 =null;

        polParser.fieldOrArrayAccess_return fieldOrArrayAccess253 =null;

        polParser.fcnArgumentList_return fcnArgumentList256 =null;

        polParser.fieldOrArrayAccess_return fieldOrArrayAccess257 =null;

        polParser.fieldOrArrayAccess_return fieldOrArrayAccess260 =null;

        polParser.qualName_return qualName262 =null;

        polParser.fcnArgumentList_return fcnArgumentList263 =null;

        polParser.fieldOrArrayAccess_return fieldOrArrayAccess264 =null;

        polParser.qualName_return qualName265 =null;

        polParser.fieldOrArrayAccess_return fieldOrArrayAccess266 =null;


        Object string_literal250_tree=null;
        Object char_literal254_tree=null;
        Object IDENT255_tree=null;
        Object char_literal258_tree=null;
        Object IDENT259_tree=null;
        Object char_literal261_tree=null;
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleTokenStream stream_138=new RewriteRuleTokenStream(adaptor,"token 138");
        RewriteRuleTokenStream stream_175=new RewriteRuleTokenStream(adaptor,"token 175");
        RewriteRuleSubtreeStream stream_typeName=new RewriteRuleSubtreeStream(adaptor,"rule typeName");
        RewriteRuleSubtreeStream stream_fcnArgumentList=new RewriteRuleSubtreeStream(adaptor,"rule fcnArgumentList");
        RewriteRuleSubtreeStream stream_qualName=new RewriteRuleSubtreeStream(adaptor,"rule qualName");
        RewriteRuleSubtreeStream stream_fieldOrArrayAccess=new RewriteRuleSubtreeStream(adaptor,"rule fieldOrArrayAccess");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 74) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:619:2: ( 'new' typeName fcnArgumentList ( fieldOrArrayAccess )? -> ^( E_NEW typeName fcnArgumentList ( fieldOrArrayAccess )? ) | '@' IDENT fcnArgumentList ( fieldOrArrayAccess )? -> ^( E_SELF ^( E_CALL IDENT fcnArgumentList ( fieldOrArrayAccess )? ) ) | '@' IDENT ( fieldOrArrayAccess )? -> ^( E_SELF IDENT ( fieldOrArrayAccess )? ) | '@' -> ^( E_SELF ) | qualName fcnArgumentList ( fieldOrArrayAccess )? -> ^( E_CALL qualName fcnArgumentList ( fieldOrArrayAccess )? ) | qualName ( fieldOrArrayAccess )? )
            int alt77=6;
            switch ( input.LA(1) ) {
            case 175:
                {
                alt77=1;
                }
                break;
            case 138:
                {
                int LA77_2 = input.LA(2);

                if ( (synpred123_pol()) ) {
                    alt77=2;
                }
                else if ( (synpred125_pol()) ) {
                    alt77=3;
                }
                else if ( (synpred126_pol()) ) {
                    alt77=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 77, 2, input);

                    throw nvae;

                }
                }
                break;
            case IDENT:
                {
                int LA77_6 = input.LA(2);

                if ( (synpred128_pol()) ) {
                    alt77=5;
                }
                else if ( (true) ) {
                    alt77=6;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 77, 6, input);

                    throw nvae;

                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 77, 0, input);

                throw nvae;

            }

            switch (alt77) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:619:10: 'new' typeName fcnArgumentList ( fieldOrArrayAccess )?
                    {
                    string_literal250=(Token)match(input,175,FOLLOW_175_in_varOrFcnOrArray3600); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_175.add(string_literal250);


                    pushFollow(FOLLOW_typeName_in_varOrFcnOrArray3602);
                    typeName251=typeName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeName.add(typeName251.getTree());

                    pushFollow(FOLLOW_fcnArgumentList_in_varOrFcnOrArray3604);
                    fcnArgumentList252=fcnArgumentList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_fcnArgumentList.add(fcnArgumentList252.getTree());

                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:619:41: ( fieldOrArrayAccess )?
                    int alt72=2;
                    int LA72_0 = input.LA(1);

                    if ( (LA72_0==139) ) {
                        int LA72_1 = input.LA(2);

                        if ( (synpred120_pol()) ) {
                            alt72=1;
                        }
                    }
                    else if ( (LA72_0==130) ) {
                        alt72=1;
                    }
                    switch (alt72) {
                        case 1 :
                            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:619:41: fieldOrArrayAccess
                            {
                            pushFollow(FOLLOW_fieldOrArrayAccess_in_varOrFcnOrArray3606);
                            fieldOrArrayAccess253=fieldOrArrayAccess();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_fieldOrArrayAccess.add(fieldOrArrayAccess253.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: fieldOrArrayAccess, fcnArgumentList, typeName
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 620:17: -> ^( E_NEW typeName fcnArgumentList ( fieldOrArrayAccess )? )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:620:20: ^( E_NEW typeName fcnArgumentList ( fieldOrArrayAccess )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(E_NEW, "E_NEW")
                        , root_1);

                        adaptor.addChild(root_1, stream_typeName.nextTree());

                        adaptor.addChild(root_1, stream_fcnArgumentList.nextTree());

                        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:620:53: ( fieldOrArrayAccess )?
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
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:621:10: '@' IDENT fcnArgumentList ( fieldOrArrayAccess )?
                    {
                    char_literal254=(Token)match(input,138,FOLLOW_138_in_varOrFcnOrArray3647); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_138.add(char_literal254);


                    IDENT255=(Token)match(input,IDENT,FOLLOW_IDENT_in_varOrFcnOrArray3649); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENT.add(IDENT255);


                    pushFollow(FOLLOW_fcnArgumentList_in_varOrFcnOrArray3651);
                    fcnArgumentList256=fcnArgumentList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_fcnArgumentList.add(fcnArgumentList256.getTree());

                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:621:36: ( fieldOrArrayAccess )?
                    int alt73=2;
                    int LA73_0 = input.LA(1);

                    if ( (LA73_0==139) ) {
                        int LA73_1 = input.LA(2);

                        if ( (synpred122_pol()) ) {
                            alt73=1;
                        }
                    }
                    else if ( (LA73_0==130) ) {
                        alt73=1;
                    }
                    switch (alt73) {
                        case 1 :
                            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:621:36: fieldOrArrayAccess
                            {
                            pushFollow(FOLLOW_fieldOrArrayAccess_in_varOrFcnOrArray3653);
                            fieldOrArrayAccess257=fieldOrArrayAccess();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_fieldOrArrayAccess.add(fieldOrArrayAccess257.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: fcnArgumentList, fieldOrArrayAccess, IDENT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 622:17: -> ^( E_SELF ^( E_CALL IDENT fcnArgumentList ( fieldOrArrayAccess )? ) )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:622:20: ^( E_SELF ^( E_CALL IDENT fcnArgumentList ( fieldOrArrayAccess )? ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(E_SELF, "E_SELF")
                        , root_1);

                        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:623:25: ^( E_CALL IDENT fcnArgumentList ( fieldOrArrayAccess )? )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(E_CALL, "E_CALL")
                        , root_2);

                        adaptor.addChild(root_2, 
                        stream_IDENT.nextNode()
                        );

                        adaptor.addChild(root_2, stream_fcnArgumentList.nextTree());

                        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:623:56: ( fieldOrArrayAccess )?
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
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:624:10: '@' IDENT ( fieldOrArrayAccess )?
                    {
                    char_literal258=(Token)match(input,138,FOLLOW_138_in_varOrFcnOrArray3722); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_138.add(char_literal258);


                    IDENT259=(Token)match(input,IDENT,FOLLOW_IDENT_in_varOrFcnOrArray3728); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENT.add(IDENT259);


                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:624:24: ( fieldOrArrayAccess )?
                    int alt74=2;
                    int LA74_0 = input.LA(1);

                    if ( (LA74_0==139) ) {
                        int LA74_1 = input.LA(2);

                        if ( (synpred124_pol()) ) {
                            alt74=1;
                        }
                    }
                    else if ( (LA74_0==130) ) {
                        alt74=1;
                    }
                    switch (alt74) {
                        case 1 :
                            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:624:24: fieldOrArrayAccess
                            {
                            pushFollow(FOLLOW_fieldOrArrayAccess_in_varOrFcnOrArray3730);
                            fieldOrArrayAccess260=fieldOrArrayAccess();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_fieldOrArrayAccess.add(fieldOrArrayAccess260.getTree());

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

                    root_0 = (Object)adaptor.nil();
                    // 625:17: -> ^( E_SELF IDENT ( fieldOrArrayAccess )? )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:625:20: ^( E_SELF IDENT ( fieldOrArrayAccess )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(E_SELF, "E_SELF")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_IDENT.nextNode()
                        );

                        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:625:35: ( fieldOrArrayAccess )?
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
                case 4 :
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:626:10: '@'
                    {
                    char_literal261=(Token)match(input,138,FOLLOW_138_in_varOrFcnOrArray3778); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_138.add(char_literal261);


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

                    root_0 = (Object)adaptor.nil();
                    // 627:17: -> ^( E_SELF )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:627:20: ^( E_SELF )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(E_SELF, "E_SELF")
                        , root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 5 :
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:628:10: qualName fcnArgumentList ( fieldOrArrayAccess )?
                    {
                    pushFollow(FOLLOW_qualName_in_varOrFcnOrArray3811);
                    qualName262=qualName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_qualName.add(qualName262.getTree());

                    pushFollow(FOLLOW_fcnArgumentList_in_varOrFcnOrArray3813);
                    fcnArgumentList263=fcnArgumentList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_fcnArgumentList.add(fcnArgumentList263.getTree());

                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:628:35: ( fieldOrArrayAccess )?
                    int alt75=2;
                    int LA75_0 = input.LA(1);

                    if ( (LA75_0==139) ) {
                        int LA75_1 = input.LA(2);

                        if ( (synpred127_pol()) ) {
                            alt75=1;
                        }
                    }
                    else if ( (LA75_0==130) ) {
                        alt75=1;
                    }
                    switch (alt75) {
                        case 1 :
                            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:628:35: fieldOrArrayAccess
                            {
                            pushFollow(FOLLOW_fieldOrArrayAccess_in_varOrFcnOrArray3815);
                            fieldOrArrayAccess264=fieldOrArrayAccess();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_fieldOrArrayAccess.add(fieldOrArrayAccess264.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: qualName, fcnArgumentList, fieldOrArrayAccess
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 629:17: -> ^( E_CALL qualName fcnArgumentList ( fieldOrArrayAccess )? )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:629:20: ^( E_CALL qualName fcnArgumentList ( fieldOrArrayAccess )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(E_CALL, "E_CALL")
                        , root_1);

                        adaptor.addChild(root_1, stream_qualName.nextTree());

                        adaptor.addChild(root_1, stream_fcnArgumentList.nextTree());

                        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:629:54: ( fieldOrArrayAccess )?
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
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:630:10: qualName ( fieldOrArrayAccess )?
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_qualName_in_varOrFcnOrArray3856);
                    qualName265=qualName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, qualName265.getTree());

                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:630:19: ( fieldOrArrayAccess )?
                    int alt76=2;
                    int LA76_0 = input.LA(1);

                    if ( (LA76_0==139) ) {
                        int LA76_1 = input.LA(2);

                        if ( (synpred129_pol()) ) {
                            alt76=1;
                        }
                    }
                    else if ( (LA76_0==130) ) {
                        alt76=1;
                    }
                    switch (alt76) {
                        case 1 :
                            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:630:19: fieldOrArrayAccess
                            {
                            pushFollow(FOLLOW_fieldOrArrayAccess_in_varOrFcnOrArray3858);
                            fieldOrArrayAccess266=fieldOrArrayAccess();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, fieldOrArrayAccess266.getTree());

                            }
                            break;

                    }


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 74, varOrFcnOrArray_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "varOrFcnOrArray"


    public static class fieldOrArrayAccess_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "fieldOrArrayAccess"
    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:633:1: fieldOrArrayAccess : ( fieldAccess | arrayAccess )+ ;
    public final polParser.fieldOrArrayAccess_return fieldOrArrayAccess() throws RecognitionException {
        polParser.fieldOrArrayAccess_return retval = new polParser.fieldOrArrayAccess_return();
        retval.start = input.LT(1);

        int fieldOrArrayAccess_StartIndex = input.index();

        Object root_0 = null;

        polParser.fieldAccess_return fieldAccess267 =null;

        polParser.arrayAccess_return arrayAccess268 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 75) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:634:2: ( ( fieldAccess | arrayAccess )+ )
            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:634:5: ( fieldAccess | arrayAccess )+
            {
            root_0 = (Object)adaptor.nil();


            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:634:5: ( fieldAccess | arrayAccess )+
            int cnt78=0;
            loop78:
            do {
                int alt78=3;
                int LA78_0 = input.LA(1);

                if ( (LA78_0==130) ) {
                    alt78=1;
                }
                else if ( (LA78_0==139) ) {
                    int LA78_2 = input.LA(2);

                    if ( (synpred131_pol()) ) {
                        alt78=2;
                    }


                }


                switch (alt78) {
            	case 1 :
            	    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:634:6: fieldAccess
            	    {
            	    pushFollow(FOLLOW_fieldAccess_in_fieldOrArrayAccess3872);
            	    fieldAccess267=fieldAccess();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, fieldAccess267.getTree());

            	    }
            	    break;
            	case 2 :
            	    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:634:20: arrayAccess
            	    {
            	    pushFollow(FOLLOW_arrayAccess_in_fieldOrArrayAccess3876);
            	    arrayAccess268=arrayAccess();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, arrayAccess268.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt78 >= 1 ) break loop78;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(78, input);
                        throw eee;
                }
                cnt78++;
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 75, fieldOrArrayAccess_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "fieldOrArrayAccess"


    public static class fieldAccess_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "fieldAccess"
    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:636:1: fieldAccess : ( '.' IDENT fcnArgumentList -> ^( E_CALL IDENT fcnArgumentList ) | '.' IDENT -> ^( E_IDENT IDENT ) );
    public final polParser.fieldAccess_return fieldAccess() throws RecognitionException {
        polParser.fieldAccess_return retval = new polParser.fieldAccess_return();
        retval.start = input.LT(1);

        int fieldAccess_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal269=null;
        Token IDENT270=null;
        Token char_literal272=null;
        Token IDENT273=null;
        polParser.fcnArgumentList_return fcnArgumentList271 =null;


        Object char_literal269_tree=null;
        Object IDENT270_tree=null;
        Object char_literal272_tree=null;
        Object IDENT273_tree=null;
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleTokenStream stream_130=new RewriteRuleTokenStream(adaptor,"token 130");
        RewriteRuleSubtreeStream stream_fcnArgumentList=new RewriteRuleSubtreeStream(adaptor,"rule fcnArgumentList");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 76) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:639:4: ( '.' IDENT fcnArgumentList -> ^( E_CALL IDENT fcnArgumentList ) | '.' IDENT -> ^( E_IDENT IDENT ) )
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==130) ) {
                int LA79_1 = input.LA(2);

                if ( (synpred132_pol()) ) {
                    alt79=1;
                }
                else if ( (true) ) {
                    alt79=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 79, 1, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 79, 0, input);

                throw nvae;

            }
            switch (alt79) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:639:12: '.' IDENT fcnArgumentList
                    {
                    char_literal269=(Token)match(input,130,FOLLOW_130_in_fieldAccess3898); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_130.add(char_literal269);


                    IDENT270=(Token)match(input,IDENT,FOLLOW_IDENT_in_fieldAccess3904); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENT.add(IDENT270);


                    pushFollow(FOLLOW_fcnArgumentList_in_fieldAccess3906);
                    fcnArgumentList271=fcnArgumentList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_fcnArgumentList.add(fcnArgumentList271.getTree());

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

                    root_0 = (Object)adaptor.nil();
                    // 639:44: -> ^( E_CALL IDENT fcnArgumentList )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:639:47: ^( E_CALL IDENT fcnArgumentList )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(E_CALL, "E_CALL")
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
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:640:12: '.' IDENT
                    {
                    char_literal272=(Token)match(input,130,FOLLOW_130_in_fieldAccess3932); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_130.add(char_literal272);


                    IDENT273=(Token)match(input,IDENT,FOLLOW_IDENT_in_fieldAccess3938); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENT.add(IDENT273);


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

                    root_0 = (Object)adaptor.nil();
                    // 640:28: -> ^( E_IDENT IDENT )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:640:31: ^( E_IDENT IDENT )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(E_IDENT, "E_IDENT")
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

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 76, fieldAccess_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "fieldAccess"


    public static class arrayAccess_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "arrayAccess"
    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:642:1: arrayAccess : '[' ( exprList )? ']' -> ^( E_INDEX ( exprList )? ) ;
    public final polParser.arrayAccess_return arrayAccess() throws RecognitionException {
        polParser.arrayAccess_return retval = new polParser.arrayAccess_return();
        retval.start = input.LT(1);

        int arrayAccess_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal274=null;
        Token char_literal276=null;
        polParser.exprList_return exprList275 =null;


        Object char_literal274_tree=null;
        Object char_literal276_tree=null;
        RewriteRuleTokenStream stream_139=new RewriteRuleTokenStream(adaptor,"token 139");
        RewriteRuleTokenStream stream_140=new RewriteRuleTokenStream(adaptor,"token 140");
        RewriteRuleSubtreeStream stream_exprList=new RewriteRuleSubtreeStream(adaptor,"rule exprList");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 77) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:643:2: ( '[' ( exprList )? ']' -> ^( E_INDEX ( exprList )? ) )
            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:643:4: '[' ( exprList )? ']'
            {
            char_literal274=(Token)match(input,139,FOLLOW_139_in_arrayAccess3959); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_139.add(char_literal274);


            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:643:8: ( exprList )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==140) ) {
                int LA80_1 = input.LA(2);

                if ( (synpred133_pol()) ) {
                    alt80=1;
                }
            }
            else if ( ((LA80_0 >= BIT_NOT && LA80_0 <= CHAR)||LA80_0==DEC||LA80_0==HEX_LIT||LA80_0==IDENT||(LA80_0 >= INC && LA80_0 <= INT_LIT)||LA80_0==LOG_NOT||LA80_0==MINUS||LA80_0==NL||LA80_0==OCT_LIT||LA80_0==REAL_LIT||LA80_0==SEMI||LA80_0==STRING||(LA80_0 >= 126 && LA80_0 <= 127)||LA80_0==129||(LA80_0 >= 138 && LA80_0 <= 139)||(LA80_0 >= 143 && LA80_0 <= 153)||LA80_0==156||LA80_0==158||(LA80_0 >= 160 && LA80_0 <= 165)||LA80_0==167||(LA80_0 >= 169 && LA80_0 <= 171)||(LA80_0 >= 173 && LA80_0 <= 176)||(LA80_0 >= 179 && LA80_0 <= 186)||(LA80_0 >= 188 && LA80_0 <= 192)||LA80_0==196) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:643:9: exprList
                    {
                    pushFollow(FOLLOW_exprList_in_arrayAccess3962);
                    exprList275=exprList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_exprList.add(exprList275.getTree());

                    }
                    break;

            }


            char_literal276=(Token)match(input,140,FOLLOW_140_in_arrayAccess3966); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_140.add(char_literal276);


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

            root_0 = (Object)adaptor.nil();
            // 643:24: -> ^( E_INDEX ( exprList )? )
            {
                // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:643:27: ^( E_INDEX ( exprList )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(E_INDEX, "E_INDEX")
                , root_1);

                // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:643:37: ( exprList )?
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

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 77, arrayAccess_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "arrayAccess"


    public static class stmtBlock_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stmtBlock"
    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:645:1: stmtBlock : braceOpen stmts braceClose -> ^( S_BLOCK stmts ) ;
    public final polParser.stmtBlock_return stmtBlock() throws RecognitionException {
        polParser.stmtBlock_return retval = new polParser.stmtBlock_return();
        retval.start = input.LT(1);

        int stmtBlock_StartIndex = input.index();

        Object root_0 = null;

        polParser.braceOpen_return braceOpen277 =null;

        polParser.stmts_return stmts278 =null;

        polParser.braceClose_return braceClose279 =null;


        RewriteRuleSubtreeStream stream_stmts=new RewriteRuleSubtreeStream(adaptor,"rule stmts");
        RewriteRuleSubtreeStream stream_braceOpen=new RewriteRuleSubtreeStream(adaptor,"rule braceOpen");
        RewriteRuleSubtreeStream stream_braceClose=new RewriteRuleSubtreeStream(adaptor,"rule braceClose");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 78) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:646:2: ( braceOpen stmts braceClose -> ^( S_BLOCK stmts ) )
            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:646:4: braceOpen stmts braceClose
            {
            pushFollow(FOLLOW_braceOpen_in_stmtBlock3986);
            braceOpen277=braceOpen();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_braceOpen.add(braceOpen277.getTree());

            pushFollow(FOLLOW_stmts_in_stmtBlock3988);
            stmts278=stmts();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_stmts.add(stmts278.getTree());

            pushFollow(FOLLOW_braceClose_in_stmtBlock3990);
            braceClose279=braceClose();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_braceClose.add(braceClose279.getTree());

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

            root_0 = (Object)adaptor.nil();
            // 646:32: -> ^( S_BLOCK stmts )
            {
                // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:646:35: ^( S_BLOCK stmts )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(S_BLOCK, "S_BLOCK")
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

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 78, stmtBlock_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "stmtBlock"


    public static class stmts_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stmts"
    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:648:1: stmts : ( ( stmt )+ -> ^( LIST ( stmt )+ ) | ( ( NL )* ) -> NIL );
    public final polParser.stmts_return stmts() throws RecognitionException {
        polParser.stmts_return retval = new polParser.stmts_return();
        retval.start = input.LT(1);

        int stmts_StartIndex = input.index();

        Object root_0 = null;

        Token NL281=null;
        polParser.stmt_return stmt280 =null;


        Object NL281_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_stmt=new RewriteRuleSubtreeStream(adaptor,"rule stmt");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 79) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:649:2: ( ( stmt )+ -> ^( LIST ( stmt )+ ) | ( ( NL )* ) -> NIL )
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( ((LA83_0 >= BIT_NOT && LA83_0 <= CHAR)||LA83_0==DEC||LA83_0==HEX_LIT||LA83_0==IDENT||(LA83_0 >= INC && LA83_0 <= INT_LIT)||LA83_0==LOG_NOT||LA83_0==MINUS||LA83_0==OCT_LIT||LA83_0==REAL_LIT||LA83_0==STRING||LA83_0==126||(LA83_0 >= 138 && LA83_0 <= 139)||(LA83_0 >= 143 && LA83_0 <= 146)||(LA83_0 >= 150 && LA83_0 <= 151)||LA83_0==153||(LA83_0 >= 160 && LA83_0 <= 162)||(LA83_0 >= 164 && LA83_0 <= 165)||(LA83_0 >= 169 && LA83_0 <= 171)||(LA83_0 >= 175 && LA83_0 <= 176)||LA83_0==179||LA83_0==181||(LA83_0 >= 183 && LA83_0 <= 186)||(LA83_0 >= 188 && LA83_0 <= 192)) ) {
                alt83=1;
            }
            else if ( (LA83_0==EOF||LA83_0==NL||LA83_0==147||LA83_0==152||LA83_0==196) ) {
                alt83=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 83, 0, input);

                throw nvae;

            }
            switch (alt83) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:649:4: ( stmt )+
                    {
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:649:4: ( stmt )+
                    int cnt81=0;
                    loop81:
                    do {
                        int alt81=2;
                        int LA81_0 = input.LA(1);

                        if ( ((LA81_0 >= BIT_NOT && LA81_0 <= CHAR)||LA81_0==DEC||LA81_0==HEX_LIT||LA81_0==IDENT||(LA81_0 >= INC && LA81_0 <= INT_LIT)||LA81_0==LOG_NOT||LA81_0==MINUS||LA81_0==OCT_LIT||LA81_0==REAL_LIT||LA81_0==STRING||LA81_0==126||(LA81_0 >= 138 && LA81_0 <= 139)||(LA81_0 >= 143 && LA81_0 <= 146)||(LA81_0 >= 150 && LA81_0 <= 151)||LA81_0==153||(LA81_0 >= 160 && LA81_0 <= 162)||(LA81_0 >= 164 && LA81_0 <= 165)||(LA81_0 >= 169 && LA81_0 <= 171)||(LA81_0 >= 175 && LA81_0 <= 176)||LA81_0==179||LA81_0==181||(LA81_0 >= 183 && LA81_0 <= 186)||(LA81_0 >= 188 && LA81_0 <= 192)) ) {
                            alt81=1;
                        }


                        switch (alt81) {
                    	case 1 :
                    	    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:649:5: stmt
                    	    {
                    	    pushFollow(FOLLOW_stmt_in_stmts4010);
                    	    stmt280=stmt();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_stmt.add(stmt280.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt81 >= 1 ) break loop81;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(81, input);
                                throw eee;
                        }
                        cnt81++;
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

                    root_0 = (Object)adaptor.nil();
                    // 649:13: -> ^( LIST ( stmt )+ )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:649:16: ^( LIST ( stmt )+ )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(LIST, "LIST")
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
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:650:4: ( ( NL )* )
                    {
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:650:4: ( ( NL )* )
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:650:5: ( NL )*
                    {
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:650:5: ( NL )*
                    loop82:
                    do {
                        int alt82=2;
                        int LA82_0 = input.LA(1);

                        if ( (LA82_0==NL) ) {
                            int LA82_1 = input.LA(2);

                            if ( (synpred136_pol()) ) {
                                alt82=1;
                            }


                        }


                        switch (alt82) {
                    	case 1 :
                    	    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:650:5: NL
                    	    {
                    	    NL281=(Token)match(input,NL,FOLLOW_NL_in_stmts4028); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_NL.add(NL281);


                    	    }
                    	    break;

                    	default :
                    	    break loop82;
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

                    root_0 = (Object)adaptor.nil();
                    // 650:10: -> NIL
                    {
                        adaptor.addChild(root_0, 
                        (Object)adaptor.create(NIL, "NIL")
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 79, stmts_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "stmts"


    public static class stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stmt"
    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:652:1: stmt : ( varDeclaration | stmtAssign delim | stmtAssert | stmtBind | stmtPrint | stmtReturn | stmtBreak | stmtContinue | stmtForEach | stmtFor | stmtSwitch | stmtDoWhile | stmtIf | stmtProvided | stmtWhile | stmtInjection | expr delim );
    public final polParser.stmt_return stmt() throws RecognitionException {
        polParser.stmt_return retval = new polParser.stmt_return();
        retval.start = input.LT(1);

        int stmt_StartIndex = input.index();

        Object root_0 = null;

        polParser.varDeclaration_return varDeclaration282 =null;

        polParser.stmtAssign_return stmtAssign283 =null;

        polParser.delim_return delim284 =null;

        polParser.stmtAssert_return stmtAssert285 =null;

        polParser.stmtBind_return stmtBind286 =null;

        polParser.stmtPrint_return stmtPrint287 =null;

        polParser.stmtReturn_return stmtReturn288 =null;

        polParser.stmtBreak_return stmtBreak289 =null;

        polParser.stmtContinue_return stmtContinue290 =null;

        polParser.stmtForEach_return stmtForEach291 =null;

        polParser.stmtFor_return stmtFor292 =null;

        polParser.stmtSwitch_return stmtSwitch293 =null;

        polParser.stmtDoWhile_return stmtDoWhile294 =null;

        polParser.stmtIf_return stmtIf295 =null;

        polParser.stmtProvided_return stmtProvided296 =null;

        polParser.stmtWhile_return stmtWhile297 =null;

        polParser.stmtInjection_return stmtInjection298 =null;

        polParser.expr_return expr299 =null;

        polParser.delim_return delim300 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 80) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:653:2: ( varDeclaration | stmtAssign delim | stmtAssert | stmtBind | stmtPrint | stmtReturn | stmtBreak | stmtContinue | stmtForEach | stmtFor | stmtSwitch | stmtDoWhile | stmtIf | stmtProvided | stmtWhile | stmtInjection | expr delim )
            int alt84=17;
            switch ( input.LA(1) ) {
            case IDENT:
            case 175:
                {
                int LA84_1 = input.LA(2);

                if ( (synpred137_pol()) ) {
                    alt84=1;
                }
                else if ( (synpred138_pol()) ) {
                    alt84=2;
                }
                else if ( (synpred140_pol()) ) {
                    alt84=4;
                }
                else if ( (true) ) {
                    alt84=17;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 84, 1, input);

                    throw nvae;

                }
                }
                break;
            case 144:
            case 146:
            case 150:
            case 164:
            case 169:
            case 170:
            case 171:
            case 184:
            case 188:
            case 189:
            case 190:
            case 191:
                {
                alt84=1;
                }
                break;
            case 138:
                {
                int LA84_7 = input.LA(2);

                if ( (synpred138_pol()) ) {
                    alt84=2;
                }
                else if ( (synpred140_pol()) ) {
                    alt84=4;
                }
                else if ( (true) ) {
                    alt84=17;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 84, 7, input);

                    throw nvae;

                }
                }
                break;
            case 143:
                {
                alt84=3;
                }
                break;
            case INJECT:
                {
                int LA84_9 = input.LA(2);

                if ( (synpred138_pol()) ) {
                    alt84=2;
                }
                else if ( (synpred152_pol()) ) {
                    alt84=16;
                }
                else if ( (true) ) {
                    alt84=17;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 84, 9, input);

                    throw nvae;

                }
                }
                break;
            case 179:
                {
                alt84=5;
                }
                break;
            case 183:
                {
                alt84=6;
                }
                break;
            case 145:
                {
                alt84=7;
                }
                break;
            case 151:
                {
                alt84=8;
                }
                break;
            case 162:
                {
                alt84=9;
                }
                break;
            case 161:
                {
                alt84=10;
                }
                break;
            case 185:
                {
                alt84=11;
                }
                break;
            case 153:
                {
                alt84=12;
                }
                break;
            case 165:
                {
                alt84=13;
                }
                break;
            case 181:
                {
                alt84=14;
                }
                break;
            case 192:
                {
                alt84=15;
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
            case 126:
            case 139:
            case 160:
            case 176:
            case 186:
                {
                alt84=17;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 84, 0, input);

                throw nvae;

            }

            switch (alt84) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:653:5: varDeclaration
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_varDeclaration_in_stmt4045);
                    varDeclaration282=varDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDeclaration282.getTree());

                    }
                    break;
                case 2 :
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:654:4: stmtAssign delim
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_stmtAssign_in_stmt4051);
                    stmtAssign283=stmtAssign();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmtAssign283.getTree());

                    pushFollow(FOLLOW_delim_in_stmt4053);
                    delim284=delim();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, delim284.getTree());

                    }
                    break;
                case 3 :
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:655:4: stmtAssert
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_stmtAssert_in_stmt4060);
                    stmtAssert285=stmtAssert();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmtAssert285.getTree());

                    }
                    break;
                case 4 :
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:656:4: stmtBind
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_stmtBind_in_stmt4065);
                    stmtBind286=stmtBind();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmtBind286.getTree());

                    }
                    break;
                case 5 :
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:657:4: stmtPrint
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_stmtPrint_in_stmt4070);
                    stmtPrint287=stmtPrint();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmtPrint287.getTree());

                    }
                    break;
                case 6 :
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:658:4: stmtReturn
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_stmtReturn_in_stmt4075);
                    stmtReturn288=stmtReturn();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmtReturn288.getTree());

                    }
                    break;
                case 7 :
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:659:4: stmtBreak
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_stmtBreak_in_stmt4080);
                    stmtBreak289=stmtBreak();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmtBreak289.getTree());

                    }
                    break;
                case 8 :
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:660:5: stmtContinue
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_stmtContinue_in_stmt4086);
                    stmtContinue290=stmtContinue();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmtContinue290.getTree());

                    }
                    break;
                case 9 :
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:661:5: stmtForEach
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_stmtForEach_in_stmt4092);
                    stmtForEach291=stmtForEach();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmtForEach291.getTree());

                    }
                    break;
                case 10 :
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:662:5: stmtFor
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_stmtFor_in_stmt4098);
                    stmtFor292=stmtFor();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmtFor292.getTree());

                    }
                    break;
                case 11 :
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:663:4: stmtSwitch
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_stmtSwitch_in_stmt4103);
                    stmtSwitch293=stmtSwitch();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmtSwitch293.getTree());

                    }
                    break;
                case 12 :
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:664:5: stmtDoWhile
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_stmtDoWhile_in_stmt4109);
                    stmtDoWhile294=stmtDoWhile();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmtDoWhile294.getTree());

                    }
                    break;
                case 13 :
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:665:4: stmtIf
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_stmtIf_in_stmt4114);
                    stmtIf295=stmtIf();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmtIf295.getTree());

                    }
                    break;
                case 14 :
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:666:4: stmtProvided
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_stmtProvided_in_stmt4119);
                    stmtProvided296=stmtProvided();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmtProvided296.getTree());

                    }
                    break;
                case 15 :
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:667:4: stmtWhile
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_stmtWhile_in_stmt4124);
                    stmtWhile297=stmtWhile();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmtWhile297.getTree());

                    }
                    break;
                case 16 :
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:668:4: stmtInjection
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_stmtInjection_in_stmt4130);
                    stmtInjection298=stmtInjection();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmtInjection298.getTree());

                    }
                    break;
                case 17 :
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:669:4: expr delim
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_expr_in_stmt4135);
                    expr299=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr299.getTree());

                    pushFollow(FOLLOW_delim_in_stmt4137);
                    delim300=delim();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, delim300.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 80, stmt_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "stmt"


    public static class stmtAssign_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stmtAssign"
    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:671:1: stmtAssign : ( varOrFcnOrArray ASSIGN expr -> ^( S_ASSIGN ^( E_BINARY ASSIGN varOrFcnOrArray expr ) ) | injectionCode ASSIGN expr -> ^( S_ASSIGN ^( E_BINARY ASSIGN injectionCode expr ) ) | varOrFcnOrArray assignOp expr -> ^( S_ASSIGN ^( E_BINARY assignOp varOrFcnOrArray expr ) ) | injectionCode assignOp expr -> ^( S_ASSIGN ^( E_BINARY assignOp injectionCode expr ) ) );
    public final polParser.stmtAssign_return stmtAssign() throws RecognitionException {
        polParser.stmtAssign_return retval = new polParser.stmtAssign_return();
        retval.start = input.LT(1);

        int stmtAssign_StartIndex = input.index();

        Object root_0 = null;

        Token ASSIGN302=null;
        Token ASSIGN305=null;
        polParser.varOrFcnOrArray_return varOrFcnOrArray301 =null;

        polParser.expr_return expr303 =null;

        polParser.injectionCode_return injectionCode304 =null;

        polParser.expr_return expr306 =null;

        polParser.varOrFcnOrArray_return varOrFcnOrArray307 =null;

        polParser.assignOp_return assignOp308 =null;

        polParser.expr_return expr309 =null;

        polParser.injectionCode_return injectionCode310 =null;

        polParser.assignOp_return assignOp311 =null;

        polParser.expr_return expr312 =null;


        Object ASSIGN302_tree=null;
        Object ASSIGN305_tree=null;
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
        RewriteRuleSubtreeStream stream_assignOp=new RewriteRuleSubtreeStream(adaptor,"rule assignOp");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_injectionCode=new RewriteRuleSubtreeStream(adaptor,"rule injectionCode");
        RewriteRuleSubtreeStream stream_varOrFcnOrArray=new RewriteRuleSubtreeStream(adaptor,"rule varOrFcnOrArray");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 81) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:672:2: ( varOrFcnOrArray ASSIGN expr -> ^( S_ASSIGN ^( E_BINARY ASSIGN varOrFcnOrArray expr ) ) | injectionCode ASSIGN expr -> ^( S_ASSIGN ^( E_BINARY ASSIGN injectionCode expr ) ) | varOrFcnOrArray assignOp expr -> ^( S_ASSIGN ^( E_BINARY assignOp varOrFcnOrArray expr ) ) | injectionCode assignOp expr -> ^( S_ASSIGN ^( E_BINARY assignOp injectionCode expr ) ) )
            int alt85=4;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==IDENT||LA85_0==138||LA85_0==175) ) {
                int LA85_1 = input.LA(2);

                if ( (synpred153_pol()) ) {
                    alt85=1;
                }
                else if ( (synpred155_pol()) ) {
                    alt85=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 85, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA85_0==INJECT) ) {
                int LA85_4 = input.LA(2);

                if ( (synpred154_pol()) ) {
                    alt85=2;
                }
                else if ( (true) ) {
                    alt85=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 85, 4, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 85, 0, input);

                throw nvae;

            }
            switch (alt85) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:672:4: varOrFcnOrArray ASSIGN expr
                    {
                    pushFollow(FOLLOW_varOrFcnOrArray_in_stmtAssign4147);
                    varOrFcnOrArray301=varOrFcnOrArray();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_varOrFcnOrArray.add(varOrFcnOrArray301.getTree());

                    ASSIGN302=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_stmtAssign4149); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ASSIGN.add(ASSIGN302);


                    pushFollow(FOLLOW_expr_in_stmtAssign4151);
                    expr303=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr303.getTree());

                    // AST REWRITE
                    // elements: expr, varOrFcnOrArray, ASSIGN
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 673:3: -> ^( S_ASSIGN ^( E_BINARY ASSIGN varOrFcnOrArray expr ) )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:673:6: ^( S_ASSIGN ^( E_BINARY ASSIGN varOrFcnOrArray expr ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(S_ASSIGN, "S_ASSIGN")
                        , root_1);

                        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:673:17: ^( E_BINARY ASSIGN varOrFcnOrArray expr )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(E_BINARY, "E_BINARY")
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
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:674:4: injectionCode ASSIGN expr
                    {
                    pushFollow(FOLLOW_injectionCode_in_stmtAssign4175);
                    injectionCode304=injectionCode();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_injectionCode.add(injectionCode304.getTree());

                    ASSIGN305=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_stmtAssign4177); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ASSIGN.add(ASSIGN305);


                    pushFollow(FOLLOW_expr_in_stmtAssign4179);
                    expr306=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr306.getTree());

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

                    root_0 = (Object)adaptor.nil();
                    // 675:3: -> ^( S_ASSIGN ^( E_BINARY ASSIGN injectionCode expr ) )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:675:6: ^( S_ASSIGN ^( E_BINARY ASSIGN injectionCode expr ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(S_ASSIGN, "S_ASSIGN")
                        , root_1);

                        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:675:17: ^( E_BINARY ASSIGN injectionCode expr )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(E_BINARY, "E_BINARY")
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
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:676:4: varOrFcnOrArray assignOp expr
                    {
                    pushFollow(FOLLOW_varOrFcnOrArray_in_stmtAssign4204);
                    varOrFcnOrArray307=varOrFcnOrArray();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_varOrFcnOrArray.add(varOrFcnOrArray307.getTree());

                    pushFollow(FOLLOW_assignOp_in_stmtAssign4206);
                    assignOp308=assignOp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_assignOp.add(assignOp308.getTree());

                    pushFollow(FOLLOW_expr_in_stmtAssign4208);
                    expr309=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr309.getTree());

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

                    root_0 = (Object)adaptor.nil();
                    // 677:3: -> ^( S_ASSIGN ^( E_BINARY assignOp varOrFcnOrArray expr ) )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:677:6: ^( S_ASSIGN ^( E_BINARY assignOp varOrFcnOrArray expr ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(S_ASSIGN, "S_ASSIGN")
                        , root_1);

                        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:677:17: ^( E_BINARY assignOp varOrFcnOrArray expr )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(E_BINARY, "E_BINARY")
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
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:678:4: injectionCode assignOp expr
                    {
                    pushFollow(FOLLOW_injectionCode_in_stmtAssign4233);
                    injectionCode310=injectionCode();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_injectionCode.add(injectionCode310.getTree());

                    pushFollow(FOLLOW_assignOp_in_stmtAssign4235);
                    assignOp311=assignOp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_assignOp.add(assignOp311.getTree());

                    pushFollow(FOLLOW_expr_in_stmtAssign4237);
                    expr312=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr312.getTree());

                    // AST REWRITE
                    // elements: injectionCode, assignOp, expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 679:3: -> ^( S_ASSIGN ^( E_BINARY assignOp injectionCode expr ) )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:679:6: ^( S_ASSIGN ^( E_BINARY assignOp injectionCode expr ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(S_ASSIGN, "S_ASSIGN")
                        , root_1);

                        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:679:17: ^( E_BINARY assignOp injectionCode expr )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(E_BINARY, "E_BINARY")
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

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 81, stmtAssign_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "stmtAssign"


    public static class stmtAssert_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stmtAssert"
    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:681:1: stmtAssert : 'assert' exprList delim -> ^( S_ASSERT exprList ) ;
    public final polParser.stmtAssert_return stmtAssert() throws RecognitionException {
        polParser.stmtAssert_return retval = new polParser.stmtAssert_return();
        retval.start = input.LT(1);

        int stmtAssert_StartIndex = input.index();

        Object root_0 = null;

        Token string_literal313=null;
        polParser.exprList_return exprList314 =null;

        polParser.delim_return delim315 =null;


        Object string_literal313_tree=null;
        RewriteRuleTokenStream stream_143=new RewriteRuleTokenStream(adaptor,"token 143");
        RewriteRuleSubtreeStream stream_delim=new RewriteRuleSubtreeStream(adaptor,"rule delim");
        RewriteRuleSubtreeStream stream_exprList=new RewriteRuleSubtreeStream(adaptor,"rule exprList");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 82) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:682:2: ( 'assert' exprList delim -> ^( S_ASSERT exprList ) )
            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:682:4: 'assert' exprList delim
            {
            string_literal313=(Token)match(input,143,FOLLOW_143_in_stmtAssert4266); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_143.add(string_literal313);


            pushFollow(FOLLOW_exprList_in_stmtAssert4268);
            exprList314=exprList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_exprList.add(exprList314.getTree());

            pushFollow(FOLLOW_delim_in_stmtAssert4270);
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

            root_0 = (Object)adaptor.nil();
            // 682:28: -> ^( S_ASSERT exprList )
            {
                // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:682:31: ^( S_ASSERT exprList )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(S_ASSERT, "S_ASSERT")
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

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 82, stmtAssert_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "stmtAssert"


    public static class stmtBind_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stmtBind"
    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:684:1: stmtBind : varOrFcnOrArray BIND expr delim -> ^( S_BIND varOrFcnOrArray expr ) ;
    public final polParser.stmtBind_return stmtBind() throws RecognitionException {
        polParser.stmtBind_return retval = new polParser.stmtBind_return();
        retval.start = input.LT(1);

        int stmtBind_StartIndex = input.index();

        Object root_0 = null;

        Token BIND317=null;
        polParser.varOrFcnOrArray_return varOrFcnOrArray316 =null;

        polParser.expr_return expr318 =null;

        polParser.delim_return delim319 =null;


        Object BIND317_tree=null;
        RewriteRuleTokenStream stream_BIND=new RewriteRuleTokenStream(adaptor,"token BIND");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_varOrFcnOrArray=new RewriteRuleSubtreeStream(adaptor,"rule varOrFcnOrArray");
        RewriteRuleSubtreeStream stream_delim=new RewriteRuleSubtreeStream(adaptor,"rule delim");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 83) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:685:2: ( varOrFcnOrArray BIND expr delim -> ^( S_BIND varOrFcnOrArray expr ) )
            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:685:4: varOrFcnOrArray BIND expr delim
            {
            pushFollow(FOLLOW_varOrFcnOrArray_in_stmtBind4288);
            varOrFcnOrArray316=varOrFcnOrArray();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_varOrFcnOrArray.add(varOrFcnOrArray316.getTree());

            BIND317=(Token)match(input,BIND,FOLLOW_BIND_in_stmtBind4290); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_BIND.add(BIND317);


            pushFollow(FOLLOW_expr_in_stmtBind4293);
            expr318=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr318.getTree());

            pushFollow(FOLLOW_delim_in_stmtBind4296);
            delim319=delim();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_delim.add(delim319.getTree());

            // AST REWRITE
            // elements: expr, varOrFcnOrArray
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 685:38: -> ^( S_BIND varOrFcnOrArray expr )
            {
                // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:685:41: ^( S_BIND varOrFcnOrArray expr )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(S_BIND, "S_BIND")
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

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 83, stmtBind_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "stmtBind"


    public static class stmtPrint_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stmtPrint"
    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:687:1: stmtPrint : 'print' ( stmtPrintTarget )? exprList -> ^( S_PRINT ( stmtPrintTarget )? exprList ) ;
    public final polParser.stmtPrint_return stmtPrint() throws RecognitionException {
        polParser.stmtPrint_return retval = new polParser.stmtPrint_return();
        retval.start = input.LT(1);

        int stmtPrint_StartIndex = input.index();

        Object root_0 = null;

        Token string_literal320=null;
        polParser.stmtPrintTarget_return stmtPrintTarget321 =null;

        polParser.exprList_return exprList322 =null;


        Object string_literal320_tree=null;
        RewriteRuleTokenStream stream_179=new RewriteRuleTokenStream(adaptor,"token 179");
        RewriteRuleSubtreeStream stream_stmtPrintTarget=new RewriteRuleSubtreeStream(adaptor,"rule stmtPrintTarget");
        RewriteRuleSubtreeStream stream_exprList=new RewriteRuleSubtreeStream(adaptor,"rule exprList");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 84) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:688:2: ( 'print' ( stmtPrintTarget )? exprList -> ^( S_PRINT ( stmtPrintTarget )? exprList ) )
            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:688:4: 'print' ( stmtPrintTarget )? exprList
            {
            string_literal320=(Token)match(input,179,FOLLOW_179_in_stmtPrint4318); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_179.add(string_literal320);


            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:688:12: ( stmtPrintTarget )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==157||LA86_0==172||LA86_0==177) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:688:13: stmtPrintTarget
                    {
                    pushFollow(FOLLOW_stmtPrintTarget_in_stmtPrint4321);
                    stmtPrintTarget321=stmtPrintTarget();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_stmtPrintTarget.add(stmtPrintTarget321.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_exprList_in_stmtPrint4325);
            exprList322=exprList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_exprList.add(exprList322.getTree());

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

            root_0 = (Object)adaptor.nil();
            // 689:3: -> ^( S_PRINT ( stmtPrintTarget )? exprList )
            {
                // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:689:6: ^( S_PRINT ( stmtPrintTarget )? exprList )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(S_PRINT, "S_PRINT")
                , root_1);

                // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:689:16: ( stmtPrintTarget )?
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

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 84, stmtPrint_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "stmtPrint"


    public static class stmtPrintTarget_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stmtPrintTarget"
    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:691:1: stmtPrintTarget : ( 'log' | 'err' | 'out' ) ;
    public final polParser.stmtPrintTarget_return stmtPrintTarget() throws RecognitionException {
        polParser.stmtPrintTarget_return retval = new polParser.stmtPrintTarget_return();
        retval.start = input.LT(1);

        int stmtPrintTarget_StartIndex = input.index();

        Object root_0 = null;

        Token set323=null;

        Object set323_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 85) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:692:2: ( ( 'log' | 'err' | 'out' ) )
            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:
            {
            root_0 = (Object)adaptor.nil();


            set323=(Token)input.LT(1);

            if ( input.LA(1)==157||input.LA(1)==172||input.LA(1)==177 ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (Object)adaptor.create(set323)
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

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 85, stmtPrintTarget_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "stmtPrintTarget"


    public static class stmtReturn_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stmtReturn"
    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:694:1: stmtReturn : ( 'return' ( '(' ) ( expr ( ',' expr )+ ) ( ')' ) delim -> ^( S_RETURN ( expr )+ ) | 'return' ( expr ) delim -> ^( S_RETURN expr ) );
    public final polParser.stmtReturn_return stmtReturn() throws RecognitionException {
        polParser.stmtReturn_return retval = new polParser.stmtReturn_return();
        retval.start = input.LT(1);

        int stmtReturn_StartIndex = input.index();

        Object root_0 = null;

        Token string_literal324=null;
        Token char_literal325=null;
        Token char_literal327=null;
        Token char_literal329=null;
        Token string_literal331=null;
        polParser.expr_return expr326 =null;

        polParser.expr_return expr328 =null;

        polParser.delim_return delim330 =null;

        polParser.expr_return expr332 =null;

        polParser.delim_return delim333 =null;


        Object string_literal324_tree=null;
        Object char_literal325_tree=null;
        Object char_literal327_tree=null;
        Object char_literal329_tree=null;
        Object string_literal331_tree=null;
        RewriteRuleTokenStream stream_126=new RewriteRuleTokenStream(adaptor,"token 126");
        RewriteRuleTokenStream stream_127=new RewriteRuleTokenStream(adaptor,"token 127");
        RewriteRuleTokenStream stream_183=new RewriteRuleTokenStream(adaptor,"token 183");
        RewriteRuleTokenStream stream_129=new RewriteRuleTokenStream(adaptor,"token 129");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_delim=new RewriteRuleSubtreeStream(adaptor,"rule delim");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 86) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:697:2: ( 'return' ( '(' ) ( expr ( ',' expr )+ ) ( ')' ) delim -> ^( S_RETURN ( expr )+ ) | 'return' ( expr ) delim -> ^( S_RETURN expr ) )
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==183) ) {
                int LA88_1 = input.LA(2);

                if ( (synpred160_pol()) ) {
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
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:697:4: 'return' ( '(' ) ( expr ( ',' expr )+ ) ( ')' ) delim
                    {
                    string_literal324=(Token)match(input,183,FOLLOW_183_in_stmtReturn4371); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_183.add(string_literal324);


                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:697:13: ( '(' )
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:697:14: '('
                    {
                    char_literal325=(Token)match(input,126,FOLLOW_126_in_stmtReturn4374); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_126.add(char_literal325);


                    }


                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:697:19: ( expr ( ',' expr )+ )
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:697:20: expr ( ',' expr )+
                    {
                    pushFollow(FOLLOW_expr_in_stmtReturn4378);
                    expr326=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr326.getTree());

                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:697:25: ( ',' expr )+
                    int cnt87=0;
                    loop87:
                    do {
                        int alt87=2;
                        int LA87_0 = input.LA(1);

                        if ( (LA87_0==129) ) {
                            alt87=1;
                        }


                        switch (alt87) {
                    	case 1 :
                    	    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:697:26: ',' expr
                    	    {
                    	    char_literal327=(Token)match(input,129,FOLLOW_129_in_stmtReturn4381); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_129.add(char_literal327);


                    	    pushFollow(FOLLOW_expr_in_stmtReturn4383);
                    	    expr328=expr();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_expr.add(expr328.getTree());

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


                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:697:38: ( ')' )
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:697:39: ')'
                    {
                    char_literal329=(Token)match(input,127,FOLLOW_127_in_stmtReturn4389); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_127.add(char_literal329);


                    }


                    pushFollow(FOLLOW_delim_in_stmtReturn4392);
                    delim330=delim();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_delim.add(delim330.getTree());

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

                    root_0 = (Object)adaptor.nil();
                    // 697:50: -> ^( S_RETURN ( expr )+ )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:697:53: ^( S_RETURN ( expr )+ )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(S_RETURN, "S_RETURN")
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
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:698:4: 'return' ( expr ) delim
                    {
                    string_literal331=(Token)match(input,183,FOLLOW_183_in_stmtReturn4406); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_183.add(string_literal331);


                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:698:14: ( expr )
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:698:15: expr
                    {
                    pushFollow(FOLLOW_expr_in_stmtReturn4410);
                    expr332=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr332.getTree());

                    }


                    pushFollow(FOLLOW_delim_in_stmtReturn4414);
                    delim333=delim();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_delim.add(delim333.getTree());

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

                    root_0 = (Object)adaptor.nil();
                    // 698:28: -> ^( S_RETURN expr )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:698:31: ^( S_RETURN expr )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(S_RETURN, "S_RETURN")
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

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 86, stmtReturn_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "stmtReturn"


    public static class stmtBreak_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stmtBreak"
    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:700:1: stmtBreak : 'break' delim -> ^( S_BREAK ) ;
    public final polParser.stmtBreak_return stmtBreak() throws RecognitionException {
        polParser.stmtBreak_return retval = new polParser.stmtBreak_return();
        retval.start = input.LT(1);

        int stmtBreak_StartIndex = input.index();

        Object root_0 = null;

        Token string_literal334=null;
        polParser.delim_return delim335 =null;


        Object string_literal334_tree=null;
        RewriteRuleTokenStream stream_145=new RewriteRuleTokenStream(adaptor,"token 145");
        RewriteRuleSubtreeStream stream_delim=new RewriteRuleSubtreeStream(adaptor,"rule delim");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 87) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:701:2: ( 'break' delim -> ^( S_BREAK ) )
            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:701:4: 'break' delim
            {
            string_literal334=(Token)match(input,145,FOLLOW_145_in_stmtBreak4432); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_145.add(string_literal334);


            pushFollow(FOLLOW_delim_in_stmtBreak4434);
            delim335=delim();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_delim.add(delim335.getTree());

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

            root_0 = (Object)adaptor.nil();
            // 701:18: -> ^( S_BREAK )
            {
                // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:701:21: ^( S_BREAK )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(S_BREAK, "S_BREAK")
                , root_1);

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 87, stmtBreak_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "stmtBreak"


    public static class stmtContinue_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stmtContinue"
    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:703:1: stmtContinue : 'continue' delim -> ^( S_CONTINUE ) ;
    public final polParser.stmtContinue_return stmtContinue() throws RecognitionException {
        polParser.stmtContinue_return retval = new polParser.stmtContinue_return();
        retval.start = input.LT(1);

        int stmtContinue_StartIndex = input.index();

        Object root_0 = null;

        Token string_literal336=null;
        polParser.delim_return delim337 =null;


        Object string_literal336_tree=null;
        RewriteRuleTokenStream stream_151=new RewriteRuleTokenStream(adaptor,"token 151");
        RewriteRuleSubtreeStream stream_delim=new RewriteRuleSubtreeStream(adaptor,"rule delim");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 88) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:704:2: ( 'continue' delim -> ^( S_CONTINUE ) )
            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:704:4: 'continue' delim
            {
            string_literal336=(Token)match(input,151,FOLLOW_151_in_stmtContinue4450); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_151.add(string_literal336);


            pushFollow(FOLLOW_delim_in_stmtContinue4452);
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

            root_0 = (Object)adaptor.nil();
            // 704:21: -> ^( S_CONTINUE )
            {
                // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:704:24: ^( S_CONTINUE )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(S_CONTINUE, "S_CONTINUE")
                , root_1);

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 88, stmtContinue_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "stmtContinue"


    public static class stmtFor_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stmtFor"
    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:706:1: stmtFor : 'for' '(' stmtForInit SEMI stmtForCond SEMI stmtForNext ')' stmtBlock -> ^( S_FOR stmtForInit stmtForCond stmtForNext stmtBlock ) ;
    public final polParser.stmtFor_return stmtFor() throws RecognitionException {
        polParser.stmtFor_return retval = new polParser.stmtFor_return();
        retval.start = input.LT(1);

        int stmtFor_StartIndex = input.index();

        Object root_0 = null;

        Token string_literal338=null;
        Token char_literal339=null;
        Token SEMI341=null;
        Token SEMI343=null;
        Token char_literal345=null;
        polParser.stmtForInit_return stmtForInit340 =null;

        polParser.stmtForCond_return stmtForCond342 =null;

        polParser.stmtForNext_return stmtForNext344 =null;

        polParser.stmtBlock_return stmtBlock346 =null;


        Object string_literal338_tree=null;
        Object char_literal339_tree=null;
        Object SEMI341_tree=null;
        Object SEMI343_tree=null;
        Object char_literal345_tree=null;
        RewriteRuleTokenStream stream_161=new RewriteRuleTokenStream(adaptor,"token 161");
        RewriteRuleTokenStream stream_126=new RewriteRuleTokenStream(adaptor,"token 126");
        RewriteRuleTokenStream stream_127=new RewriteRuleTokenStream(adaptor,"token 127");
        RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
        RewriteRuleSubtreeStream stream_stmtForCond=new RewriteRuleSubtreeStream(adaptor,"rule stmtForCond");
        RewriteRuleSubtreeStream stream_stmtForInit=new RewriteRuleSubtreeStream(adaptor,"rule stmtForInit");
        RewriteRuleSubtreeStream stream_stmtBlock=new RewriteRuleSubtreeStream(adaptor,"rule stmtBlock");
        RewriteRuleSubtreeStream stream_stmtForNext=new RewriteRuleSubtreeStream(adaptor,"rule stmtForNext");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 89) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:707:5: ( 'for' '(' stmtForInit SEMI stmtForCond SEMI stmtForNext ')' stmtBlock -> ^( S_FOR stmtForInit stmtForCond stmtForNext stmtBlock ) )
            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:707:9: 'for' '(' stmtForInit SEMI stmtForCond SEMI stmtForNext ')' stmtBlock
            {
            string_literal338=(Token)match(input,161,FOLLOW_161_in_stmtFor4473); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_161.add(string_literal338);


            char_literal339=(Token)match(input,126,FOLLOW_126_in_stmtFor4475); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_126.add(char_literal339);


            pushFollow(FOLLOW_stmtForInit_in_stmtFor4477);
            stmtForInit340=stmtForInit();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_stmtForInit.add(stmtForInit340.getTree());

            SEMI341=(Token)match(input,SEMI,FOLLOW_SEMI_in_stmtFor4479); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SEMI.add(SEMI341);


            pushFollow(FOLLOW_stmtForCond_in_stmtFor4481);
            stmtForCond342=stmtForCond();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_stmtForCond.add(stmtForCond342.getTree());

            SEMI343=(Token)match(input,SEMI,FOLLOW_SEMI_in_stmtFor4483); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SEMI.add(SEMI343);


            pushFollow(FOLLOW_stmtForNext_in_stmtFor4485);
            stmtForNext344=stmtForNext();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_stmtForNext.add(stmtForNext344.getTree());

            char_literal345=(Token)match(input,127,FOLLOW_127_in_stmtFor4487); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_127.add(char_literal345);


            pushFollow(FOLLOW_stmtBlock_in_stmtFor4489);
            stmtBlock346=stmtBlock();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_stmtBlock.add(stmtBlock346.getTree());

            // AST REWRITE
            // elements: stmtForNext, stmtBlock, stmtForCond, stmtForInit
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 708:13: -> ^( S_FOR stmtForInit stmtForCond stmtForNext stmtBlock )
            {
                // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:708:16: ^( S_FOR stmtForInit stmtForCond stmtForNext stmtBlock )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(S_FOR, "S_FOR")
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

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 89, stmtFor_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "stmtFor"


    public static class stmtForCond_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stmtForCond"
    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:710:1: stmtForCond : ( -> NIL | expr );
    public final polParser.stmtForCond_return stmtForCond() throws RecognitionException {
        polParser.stmtForCond_return retval = new polParser.stmtForCond_return();
        retval.start = input.LT(1);

        int stmtForCond_StartIndex = input.index();

        Object root_0 = null;

        polParser.expr_return expr347 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 90) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:711:5: ( -> NIL | expr )
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==SEMI) ) {
                alt89=1;
            }
            else if ( ((LA89_0 >= BIT_NOT && LA89_0 <= CHAR)||LA89_0==DEC||LA89_0==HEX_LIT||LA89_0==IDENT||(LA89_0 >= INC && LA89_0 <= INT_LIT)||LA89_0==LOG_NOT||LA89_0==MINUS||LA89_0==OCT_LIT||LA89_0==REAL_LIT||LA89_0==STRING||LA89_0==126||(LA89_0 >= 138 && LA89_0 <= 139)||LA89_0==160||(LA89_0 >= 175 && LA89_0 <= 176)||LA89_0==186) ) {
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
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:712:12: 
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

                    root_0 = (Object)adaptor.nil();
                    // 712:12: -> NIL
                    {
                        adaptor.addChild(root_0, 
                        (Object)adaptor.create(NIL, "NIL")
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:713:9: expr
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_expr_in_stmtForCond4557);
                    expr347=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr347.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 90, stmtForCond_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "stmtForCond"


    public static class stmtForInit_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stmtForInit"
    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:716:1: stmtForInit : ( -> NIL | typeName IDENT '=' expr -> ^( S_DECL ^( typeName IDENT expr ) ) | stmtAssign );
    public final polParser.stmtForInit_return stmtForInit() throws RecognitionException {
        polParser.stmtForInit_return retval = new polParser.stmtForInit_return();
        retval.start = input.LT(1);

        int stmtForInit_StartIndex = input.index();

        Object root_0 = null;

        Token IDENT349=null;
        Token char_literal350=null;
        polParser.typeName_return typeName348 =null;

        polParser.expr_return expr351 =null;

        polParser.stmtAssign_return stmtAssign352 =null;


        Object IDENT349_tree=null;
        Object char_literal350_tree=null;
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
        RewriteRuleSubtreeStream stream_typeName=new RewriteRuleSubtreeStream(adaptor,"rule typeName");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 91) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:717:5: ( -> NIL | typeName IDENT '=' expr -> ^( S_DECL ^( typeName IDENT expr ) ) | stmtAssign )
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

                if ( (synpred163_pol()) ) {
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
            case 144:
            case 146:
            case 169:
            case 170:
            case 171:
            case 184:
            case 188:
            case 189:
            case 190:
                {
                alt90=2;
                }
                break;
            case INJECT:
            case 138:
            case 175:
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
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:718:13: 
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

                    root_0 = (Object)adaptor.nil();
                    // 718:13: -> NIL
                    {
                        adaptor.addChild(root_0, 
                        (Object)adaptor.create(NIL, "NIL")
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:719:9: typeName IDENT '=' expr
                    {
                    pushFollow(FOLLOW_typeName_in_stmtForInit4601);
                    typeName348=typeName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeName.add(typeName348.getTree());

                    IDENT349=(Token)match(input,IDENT,FOLLOW_IDENT_in_stmtForInit4603); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENT.add(IDENT349);


                    char_literal350=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_stmtForInit4605); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ASSIGN.add(char_literal350);


                    pushFollow(FOLLOW_expr_in_stmtForInit4607);
                    expr351=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr351.getTree());

                    // AST REWRITE
                    // elements: typeName, IDENT, expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 720:13: -> ^( S_DECL ^( typeName IDENT expr ) )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:720:16: ^( S_DECL ^( typeName IDENT expr ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(S_DECL, "S_DECL")
                        , root_1);

                        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:720:25: ^( typeName IDENT expr )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_typeName.nextNode(), root_2);

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
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:721:9: stmtAssign
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_stmtAssign_in_stmtForInit4644);
                    stmtAssign352=stmtAssign();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmtAssign352.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 91, stmtForInit_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "stmtForInit"


    public static class stmtForNext_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stmtForNext"
    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:723:1: stmtForNext : ( -> NIL | expr );
    public final polParser.stmtForNext_return stmtForNext() throws RecognitionException {
        polParser.stmtForNext_return retval = new polParser.stmtForNext_return();
        retval.start = input.LT(1);

        int stmtForNext_StartIndex = input.index();

        Object root_0 = null;

        polParser.expr_return expr353 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 92) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:724:5: ( -> NIL | expr )
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==127) ) {
                alt91=1;
            }
            else if ( ((LA91_0 >= BIT_NOT && LA91_0 <= CHAR)||LA91_0==DEC||LA91_0==HEX_LIT||LA91_0==IDENT||(LA91_0 >= INC && LA91_0 <= INT_LIT)||LA91_0==LOG_NOT||LA91_0==MINUS||LA91_0==OCT_LIT||LA91_0==REAL_LIT||LA91_0==STRING||LA91_0==126||(LA91_0 >= 138 && LA91_0 <= 139)||LA91_0==160||(LA91_0 >= 175 && LA91_0 <= 176)||LA91_0==186) ) {
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
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:725:13: 
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

                    root_0 = (Object)adaptor.nil();
                    // 725:13: -> NIL
                    {
                        adaptor.addChild(root_0, 
                        (Object)adaptor.create(NIL, "NIL")
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:726:9: expr
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_expr_in_stmtForNext4687);
                    expr353=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr353.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 92, stmtForNext_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "stmtForNext"


    public static class stmtForEach_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stmtForEach"
    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:728:1: stmtForEach : 'foreach' '(' IDENT 'in' expr ')' stmtBlock -> ^( S_FOREACH IDENT ^( E_IDENT expr ) stmtBlock ) ;
    public final polParser.stmtForEach_return stmtForEach() throws RecognitionException {
        polParser.stmtForEach_return retval = new polParser.stmtForEach_return();
        retval.start = input.LT(1);

        int stmtForEach_StartIndex = input.index();

        Object root_0 = null;

        Token string_literal354=null;
        Token char_literal355=null;
        Token IDENT356=null;
        Token string_literal357=null;
        Token char_literal359=null;
        polParser.expr_return expr358 =null;

        polParser.stmtBlock_return stmtBlock360 =null;


        Object string_literal354_tree=null;
        Object char_literal355_tree=null;
        Object IDENT356_tree=null;
        Object string_literal357_tree=null;
        Object char_literal359_tree=null;
        RewriteRuleTokenStream stream_126=new RewriteRuleTokenStream(adaptor,"token 126");
        RewriteRuleTokenStream stream_162=new RewriteRuleTokenStream(adaptor,"token 162");
        RewriteRuleTokenStream stream_127=new RewriteRuleTokenStream(adaptor,"token 127");
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleTokenStream stream_168=new RewriteRuleTokenStream(adaptor,"token 168");
        RewriteRuleSubtreeStream stream_stmtBlock=new RewriteRuleSubtreeStream(adaptor,"rule stmtBlock");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 93) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:729:2: ( 'foreach' '(' IDENT 'in' expr ')' stmtBlock -> ^( S_FOREACH IDENT ^( E_IDENT expr ) stmtBlock ) )
            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:729:4: 'foreach' '(' IDENT 'in' expr ')' stmtBlock
            {
            string_literal354=(Token)match(input,162,FOLLOW_162_in_stmtForEach4700); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_162.add(string_literal354);


            char_literal355=(Token)match(input,126,FOLLOW_126_in_stmtForEach4702); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_126.add(char_literal355);


            IDENT356=(Token)match(input,IDENT,FOLLOW_IDENT_in_stmtForEach4704); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENT.add(IDENT356);


            string_literal357=(Token)match(input,168,FOLLOW_168_in_stmtForEach4706); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_168.add(string_literal357);


            pushFollow(FOLLOW_expr_in_stmtForEach4708);
            expr358=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr358.getTree());

            char_literal359=(Token)match(input,127,FOLLOW_127_in_stmtForEach4710); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_127.add(char_literal359);


            pushFollow(FOLLOW_stmtBlock_in_stmtForEach4712);
            stmtBlock360=stmtBlock();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_stmtBlock.add(stmtBlock360.getTree());

            // AST REWRITE
            // elements: stmtBlock, IDENT, expr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 729:48: -> ^( S_FOREACH IDENT ^( E_IDENT expr ) stmtBlock )
            {
                // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:729:51: ^( S_FOREACH IDENT ^( E_IDENT expr ) stmtBlock )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(S_FOREACH, "S_FOREACH")
                , root_1);

                adaptor.addChild(root_1, 
                stream_IDENT.nextNode()
                );

                // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:729:69: ^( E_IDENT expr )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(E_IDENT, "E_IDENT")
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

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 93, stmtForEach_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "stmtForEach"


    public static class stmtSwitch_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stmtSwitch"
    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:731:1: stmtSwitch : 'switch' '(' expr ')' braceOpen stmtsCase braceClose -> ^( S_SWITCH ^( E_COND expr ) stmtsCase ) ;
    public final polParser.stmtSwitch_return stmtSwitch() throws RecognitionException {
        polParser.stmtSwitch_return retval = new polParser.stmtSwitch_return();
        retval.start = input.LT(1);

        int stmtSwitch_StartIndex = input.index();

        Object root_0 = null;

        Token string_literal361=null;
        Token char_literal362=null;
        Token char_literal364=null;
        polParser.expr_return expr363 =null;

        polParser.braceOpen_return braceOpen365 =null;

        polParser.stmtsCase_return stmtsCase366 =null;

        polParser.braceClose_return braceClose367 =null;


        Object string_literal361_tree=null;
        Object char_literal362_tree=null;
        Object char_literal364_tree=null;
        RewriteRuleTokenStream stream_126=new RewriteRuleTokenStream(adaptor,"token 126");
        RewriteRuleTokenStream stream_127=new RewriteRuleTokenStream(adaptor,"token 127");
        RewriteRuleTokenStream stream_185=new RewriteRuleTokenStream(adaptor,"token 185");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_stmtsCase=new RewriteRuleSubtreeStream(adaptor,"rule stmtsCase");
        RewriteRuleSubtreeStream stream_braceOpen=new RewriteRuleSubtreeStream(adaptor,"rule braceOpen");
        RewriteRuleSubtreeStream stream_braceClose=new RewriteRuleSubtreeStream(adaptor,"rule braceClose");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 94) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:732:2: ( 'switch' '(' expr ')' braceOpen stmtsCase braceClose -> ^( S_SWITCH ^( E_COND expr ) stmtsCase ) )
            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:732:4: 'switch' '(' expr ')' braceOpen stmtsCase braceClose
            {
            string_literal361=(Token)match(input,185,FOLLOW_185_in_stmtSwitch4738); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_185.add(string_literal361);


            char_literal362=(Token)match(input,126,FOLLOW_126_in_stmtSwitch4740); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_126.add(char_literal362);


            pushFollow(FOLLOW_expr_in_stmtSwitch4742);
            expr363=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr363.getTree());

            char_literal364=(Token)match(input,127,FOLLOW_127_in_stmtSwitch4744); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_127.add(char_literal364);


            pushFollow(FOLLOW_braceOpen_in_stmtSwitch4746);
            braceOpen365=braceOpen();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_braceOpen.add(braceOpen365.getTree());

            pushFollow(FOLLOW_stmtsCase_in_stmtSwitch4748);
            stmtsCase366=stmtsCase();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_stmtsCase.add(stmtsCase366.getTree());

            pushFollow(FOLLOW_braceClose_in_stmtSwitch4750);
            braceClose367=braceClose();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_braceClose.add(braceClose367.getTree());

            // AST REWRITE
            // elements: stmtsCase, expr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 732:57: -> ^( S_SWITCH ^( E_COND expr ) stmtsCase )
            {
                // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:732:60: ^( S_SWITCH ^( E_COND expr ) stmtsCase )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(S_SWITCH, "S_SWITCH")
                , root_1);

                // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:732:71: ^( E_COND expr )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(E_COND, "E_COND")
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

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 94, stmtSwitch_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "stmtSwitch"


    public static class stmtsCase_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stmtsCase"
    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:734:1: stmtsCase : ( stmtCase )* -> ( stmtCase )+ ;
    public final polParser.stmtsCase_return stmtsCase() throws RecognitionException {
        polParser.stmtsCase_return retval = new polParser.stmtsCase_return();
        retval.start = input.LT(1);

        int stmtsCase_StartIndex = input.index();

        Object root_0 = null;

        polParser.stmtCase_return stmtCase368 =null;


        RewriteRuleSubtreeStream stream_stmtCase=new RewriteRuleSubtreeStream(adaptor,"rule stmtCase");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 95) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:735:2: ( ( stmtCase )* -> ( stmtCase )+ )
            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:735:4: ( stmtCase )*
            {
            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:735:4: ( stmtCase )*
            loop92:
            do {
                int alt92=2;
                int LA92_0 = input.LA(1);

                if ( (LA92_0==147||LA92_0==152) ) {
                    alt92=1;
                }


                switch (alt92) {
            	case 1 :
            	    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:735:4: stmtCase
            	    {
            	    pushFollow(FOLLOW_stmtCase_in_stmtsCase4774);
            	    stmtCase368=stmtCase();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_stmtCase.add(stmtCase368.getTree());

            	    }
            	    break;

            	default :
            	    break loop92;
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

            root_0 = (Object)adaptor.nil();
            // 735:14: -> ( stmtCase )+
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

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 95, stmtsCase_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "stmtsCase"


    public static class stmtCase_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stmtCase"
    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:737:1: stmtCase : ( 'case' ( INT_LIT ) ':' stmts -> ^( S_CASE INT_LIT stmts ) | 'default' ':' stmts -> ^( S_DEFAULT stmts ) );
    public final polParser.stmtCase_return stmtCase() throws RecognitionException {
        polParser.stmtCase_return retval = new polParser.stmtCase_return();
        retval.start = input.LT(1);

        int stmtCase_StartIndex = input.index();

        Object root_0 = null;

        Token string_literal369=null;
        Token INT_LIT370=null;
        Token char_literal371=null;
        Token string_literal373=null;
        Token char_literal374=null;
        polParser.stmts_return stmts372 =null;

        polParser.stmts_return stmts375 =null;


        Object string_literal369_tree=null;
        Object INT_LIT370_tree=null;
        Object char_literal371_tree=null;
        Object string_literal373_tree=null;
        Object char_literal374_tree=null;
        RewriteRuleTokenStream stream_152=new RewriteRuleTokenStream(adaptor,"token 152");
        RewriteRuleTokenStream stream_132=new RewriteRuleTokenStream(adaptor,"token 132");
        RewriteRuleTokenStream stream_147=new RewriteRuleTokenStream(adaptor,"token 147");
        RewriteRuleTokenStream stream_INT_LIT=new RewriteRuleTokenStream(adaptor,"token INT_LIT");
        RewriteRuleSubtreeStream stream_stmts=new RewriteRuleSubtreeStream(adaptor,"rule stmts");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 96) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:738:2: ( 'case' ( INT_LIT ) ':' stmts -> ^( S_CASE INT_LIT stmts ) | 'default' ':' stmts -> ^( S_DEFAULT stmts ) )
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==147) ) {
                alt93=1;
            }
            else if ( (LA93_0==152) ) {
                alt93=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 93, 0, input);

                throw nvae;

            }
            switch (alt93) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:738:4: 'case' ( INT_LIT ) ':' stmts
                    {
                    string_literal369=(Token)match(input,147,FOLLOW_147_in_stmtCase4790); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_147.add(string_literal369);


                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:738:11: ( INT_LIT )
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:738:12: INT_LIT
                    {
                    INT_LIT370=(Token)match(input,INT_LIT,FOLLOW_INT_LIT_in_stmtCase4793); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INT_LIT.add(INT_LIT370);


                    }


                    char_literal371=(Token)match(input,132,FOLLOW_132_in_stmtCase4796); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_132.add(char_literal371);


                    pushFollow(FOLLOW_stmts_in_stmtCase4798);
                    stmts372=stmts();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_stmts.add(stmts372.getTree());

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

                    root_0 = (Object)adaptor.nil();
                    // 738:31: -> ^( S_CASE INT_LIT stmts )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:738:34: ^( S_CASE INT_LIT stmts )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(S_CASE, "S_CASE")
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
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:739:4: 'default' ':' stmts
                    {
                    string_literal373=(Token)match(input,152,FOLLOW_152_in_stmtCase4813); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_152.add(string_literal373);


                    char_literal374=(Token)match(input,132,FOLLOW_132_in_stmtCase4815); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_132.add(char_literal374);


                    pushFollow(FOLLOW_stmts_in_stmtCase4817);
                    stmts375=stmts();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_stmts.add(stmts375.getTree());

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

                    root_0 = (Object)adaptor.nil();
                    // 739:24: -> ^( S_DEFAULT stmts )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:739:27: ^( S_DEFAULT stmts )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(S_DEFAULT, "S_DEFAULT")
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

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 96, stmtCase_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "stmtCase"


    public static class stmtDoWhile_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stmtDoWhile"
    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:741:1: stmtDoWhile : 'do' stmtBlock 'while' '(' expr ')' delim -> ^( S_DO_WHILE stmtBlock ^( E_COND expr ) ) ;
    public final polParser.stmtDoWhile_return stmtDoWhile() throws RecognitionException {
        polParser.stmtDoWhile_return retval = new polParser.stmtDoWhile_return();
        retval.start = input.LT(1);

        int stmtDoWhile_StartIndex = input.index();

        Object root_0 = null;

        Token string_literal376=null;
        Token string_literal378=null;
        Token char_literal379=null;
        Token char_literal381=null;
        polParser.stmtBlock_return stmtBlock377 =null;

        polParser.expr_return expr380 =null;

        polParser.delim_return delim382 =null;


        Object string_literal376_tree=null;
        Object string_literal378_tree=null;
        Object char_literal379_tree=null;
        Object char_literal381_tree=null;
        RewriteRuleTokenStream stream_153=new RewriteRuleTokenStream(adaptor,"token 153");
        RewriteRuleTokenStream stream_126=new RewriteRuleTokenStream(adaptor,"token 126");
        RewriteRuleTokenStream stream_127=new RewriteRuleTokenStream(adaptor,"token 127");
        RewriteRuleTokenStream stream_192=new RewriteRuleTokenStream(adaptor,"token 192");
        RewriteRuleSubtreeStream stream_stmtBlock=new RewriteRuleSubtreeStream(adaptor,"rule stmtBlock");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_delim=new RewriteRuleSubtreeStream(adaptor,"rule delim");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 97) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:742:2: ( 'do' stmtBlock 'while' '(' expr ')' delim -> ^( S_DO_WHILE stmtBlock ^( E_COND expr ) ) )
            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:742:4: 'do' stmtBlock 'while' '(' expr ')' delim
            {
            string_literal376=(Token)match(input,153,FOLLOW_153_in_stmtDoWhile4835); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_153.add(string_literal376);


            pushFollow(FOLLOW_stmtBlock_in_stmtDoWhile4837);
            stmtBlock377=stmtBlock();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_stmtBlock.add(stmtBlock377.getTree());

            string_literal378=(Token)match(input,192,FOLLOW_192_in_stmtDoWhile4839); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_192.add(string_literal378);


            char_literal379=(Token)match(input,126,FOLLOW_126_in_stmtDoWhile4841); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_126.add(char_literal379);


            pushFollow(FOLLOW_expr_in_stmtDoWhile4843);
            expr380=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr380.getTree());

            char_literal381=(Token)match(input,127,FOLLOW_127_in_stmtDoWhile4845); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_127.add(char_literal381);


            pushFollow(FOLLOW_delim_in_stmtDoWhile4847);
            delim382=delim();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_delim.add(delim382.getTree());

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

            root_0 = (Object)adaptor.nil();
            // 742:47: -> ^( S_DO_WHILE stmtBlock ^( E_COND expr ) )
            {
                // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:742:50: ^( S_DO_WHILE stmtBlock ^( E_COND expr ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(S_DO_WHILE, "S_DO_WHILE")
                , root_1);

                adaptor.addChild(root_1, stream_stmtBlock.nextTree());

                // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:742:73: ^( E_COND expr )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(E_COND, "E_COND")
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

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 97, stmtDoWhile_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "stmtDoWhile"


    public static class stmtIf_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stmtIf"
    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:744:1: stmtIf : ( 'if' stmtIfBlock stmtsElif ( stmtElse )? -> ^( S_IF stmtIfBlock stmtsElif ( stmtElse )? ) | 'if' stmtIfBlock stmtElse -> ^( S_IF stmtIfBlock stmtElse ) | 'if' stmtIfBlock -> ^( S_IF stmtIfBlock ) );
    public final polParser.stmtIf_return stmtIf() throws RecognitionException {
        polParser.stmtIf_return retval = new polParser.stmtIf_return();
        retval.start = input.LT(1);

        int stmtIf_StartIndex = input.index();

        Object root_0 = null;

        Token string_literal383=null;
        Token string_literal387=null;
        Token string_literal390=null;
        polParser.stmtIfBlock_return stmtIfBlock384 =null;

        polParser.stmtsElif_return stmtsElif385 =null;

        polParser.stmtElse_return stmtElse386 =null;

        polParser.stmtIfBlock_return stmtIfBlock388 =null;

        polParser.stmtElse_return stmtElse389 =null;

        polParser.stmtIfBlock_return stmtIfBlock391 =null;


        Object string_literal383_tree=null;
        Object string_literal387_tree=null;
        Object string_literal390_tree=null;
        RewriteRuleTokenStream stream_165=new RewriteRuleTokenStream(adaptor,"token 165");
        RewriteRuleSubtreeStream stream_stmtsElif=new RewriteRuleSubtreeStream(adaptor,"rule stmtsElif");
        RewriteRuleSubtreeStream stream_stmtElse=new RewriteRuleSubtreeStream(adaptor,"rule stmtElse");
        RewriteRuleSubtreeStream stream_stmtIfBlock=new RewriteRuleSubtreeStream(adaptor,"rule stmtIfBlock");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 98) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:745:2: ( 'if' stmtIfBlock stmtsElif ( stmtElse )? -> ^( S_IF stmtIfBlock stmtsElif ( stmtElse )? ) | 'if' stmtIfBlock stmtElse -> ^( S_IF stmtIfBlock stmtElse ) | 'if' stmtIfBlock -> ^( S_IF stmtIfBlock ) )
            int alt95=3;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==165) ) {
                int LA95_1 = input.LA(2);

                if ( (synpred168_pol()) ) {
                    alt95=1;
                }
                else if ( (synpred169_pol()) ) {
                    alt95=2;
                }
                else if ( (true) ) {
                    alt95=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 95, 1, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 95, 0, input);

                throw nvae;

            }
            switch (alt95) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:745:4: 'if' stmtIfBlock stmtsElif ( stmtElse )?
                    {
                    string_literal383=(Token)match(input,165,FOLLOW_165_in_stmtIf4872); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_165.add(string_literal383);


                    pushFollow(FOLLOW_stmtIfBlock_in_stmtIf4874);
                    stmtIfBlock384=stmtIfBlock();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_stmtIfBlock.add(stmtIfBlock384.getTree());

                    pushFollow(FOLLOW_stmtsElif_in_stmtIf4876);
                    stmtsElif385=stmtsElif();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_stmtsElif.add(stmtsElif385.getTree());

                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:745:31: ( stmtElse )?
                    int alt94=2;
                    int LA94_0 = input.LA(1);

                    if ( (LA94_0==155) ) {
                        alt94=1;
                    }
                    switch (alt94) {
                        case 1 :
                            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:745:31: stmtElse
                            {
                            pushFollow(FOLLOW_stmtElse_in_stmtIf4878);
                            stmtElse386=stmtElse();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_stmtElse.add(stmtElse386.getTree());

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

                    root_0 = (Object)adaptor.nil();
                    // 745:41: -> ^( S_IF stmtIfBlock stmtsElif ( stmtElse )? )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:745:44: ^( S_IF stmtIfBlock stmtsElif ( stmtElse )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(S_IF, "S_IF")
                        , root_1);

                        adaptor.addChild(root_1, stream_stmtIfBlock.nextTree());

                        adaptor.addChild(root_1, stream_stmtsElif.nextTree());

                        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:745:73: ( stmtElse )?
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
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:746:4: 'if' stmtIfBlock stmtElse
                    {
                    string_literal387=(Token)match(input,165,FOLLOW_165_in_stmtIf4897); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_165.add(string_literal387);


                    pushFollow(FOLLOW_stmtIfBlock_in_stmtIf4899);
                    stmtIfBlock388=stmtIfBlock();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_stmtIfBlock.add(stmtIfBlock388.getTree());

                    pushFollow(FOLLOW_stmtElse_in_stmtIf4901);
                    stmtElse389=stmtElse();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_stmtElse.add(stmtElse389.getTree());

                    // AST REWRITE
                    // elements: stmtElse, stmtIfBlock
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 746:30: -> ^( S_IF stmtIfBlock stmtElse )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:746:33: ^( S_IF stmtIfBlock stmtElse )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(S_IF, "S_IF")
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
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:747:4: 'if' stmtIfBlock
                    {
                    string_literal390=(Token)match(input,165,FOLLOW_165_in_stmtIf4916); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_165.add(string_literal390);


                    pushFollow(FOLLOW_stmtIfBlock_in_stmtIf4918);
                    stmtIfBlock391=stmtIfBlock();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_stmtIfBlock.add(stmtIfBlock391.getTree());

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

                    root_0 = (Object)adaptor.nil();
                    // 747:21: -> ^( S_IF stmtIfBlock )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:747:24: ^( S_IF stmtIfBlock )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(S_IF, "S_IF")
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

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 98, stmtIf_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "stmtIf"


    public static class stmtIfBlock_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stmtIfBlock"
    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:749:1: stmtIfBlock : '(' expr ')' stmtBlock -> ^( E_COND expr ) stmtBlock ;
    public final polParser.stmtIfBlock_return stmtIfBlock() throws RecognitionException {
        polParser.stmtIfBlock_return retval = new polParser.stmtIfBlock_return();
        retval.start = input.LT(1);

        int stmtIfBlock_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal392=null;
        Token char_literal394=null;
        polParser.expr_return expr393 =null;

        polParser.stmtBlock_return stmtBlock395 =null;


        Object char_literal392_tree=null;
        Object char_literal394_tree=null;
        RewriteRuleTokenStream stream_126=new RewriteRuleTokenStream(adaptor,"token 126");
        RewriteRuleTokenStream stream_127=new RewriteRuleTokenStream(adaptor,"token 127");
        RewriteRuleSubtreeStream stream_stmtBlock=new RewriteRuleSubtreeStream(adaptor,"rule stmtBlock");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 99) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:750:2: ( '(' expr ')' stmtBlock -> ^( E_COND expr ) stmtBlock )
            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:750:4: '(' expr ')' stmtBlock
            {
            char_literal392=(Token)match(input,126,FOLLOW_126_in_stmtIfBlock4936); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_126.add(char_literal392);


            pushFollow(FOLLOW_expr_in_stmtIfBlock4938);
            expr393=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr393.getTree());

            char_literal394=(Token)match(input,127,FOLLOW_127_in_stmtIfBlock4940); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_127.add(char_literal394);


            pushFollow(FOLLOW_stmtBlock_in_stmtIfBlock4942);
            stmtBlock395=stmtBlock();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_stmtBlock.add(stmtBlock395.getTree());

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

            root_0 = (Object)adaptor.nil();
            // 750:27: -> ^( E_COND expr ) stmtBlock
            {
                // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:750:30: ^( E_COND expr )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(E_COND, "E_COND")
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

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 99, stmtIfBlock_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "stmtIfBlock"


    public static class stmtsElif_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stmtsElif"
    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:752:1: stmtsElif : ( stmtElif )+ ;
    public final polParser.stmtsElif_return stmtsElif() throws RecognitionException {
        polParser.stmtsElif_return retval = new polParser.stmtsElif_return();
        retval.start = input.LT(1);

        int stmtsElif_StartIndex = input.index();

        Object root_0 = null;

        polParser.stmtElif_return stmtElif396 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 100) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:753:2: ( ( stmtElif )+ )
            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:753:4: ( stmtElif )+
            {
            root_0 = (Object)adaptor.nil();


            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:753:4: ( stmtElif )+
            int cnt96=0;
            loop96:
            do {
                int alt96=2;
                int LA96_0 = input.LA(1);

                if ( (LA96_0==154) ) {
                    alt96=1;
                }


                switch (alt96) {
            	case 1 :
            	    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:753:4: stmtElif
            	    {
            	    pushFollow(FOLLOW_stmtElif_in_stmtsElif4962);
            	    stmtElif396=stmtElif();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmtElif396.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt96 >= 1 ) break loop96;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(96, input);
                        throw eee;
                }
                cnt96++;
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 100, stmtsElif_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "stmtsElif"


    public static class stmtElif_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stmtElif"
    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:755:1: stmtElif : 'elif' stmtIfBlock -> ^( S_ELIF stmtIfBlock ) ;
    public final polParser.stmtElif_return stmtElif() throws RecognitionException {
        polParser.stmtElif_return retval = new polParser.stmtElif_return();
        retval.start = input.LT(1);

        int stmtElif_StartIndex = input.index();

        Object root_0 = null;

        Token string_literal397=null;
        polParser.stmtIfBlock_return stmtIfBlock398 =null;


        Object string_literal397_tree=null;
        RewriteRuleTokenStream stream_154=new RewriteRuleTokenStream(adaptor,"token 154");
        RewriteRuleSubtreeStream stream_stmtIfBlock=new RewriteRuleSubtreeStream(adaptor,"rule stmtIfBlock");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 101) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:756:2: ( 'elif' stmtIfBlock -> ^( S_ELIF stmtIfBlock ) )
            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:756:4: 'elif' stmtIfBlock
            {
            string_literal397=(Token)match(input,154,FOLLOW_154_in_stmtElif4973); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_154.add(string_literal397);


            pushFollow(FOLLOW_stmtIfBlock_in_stmtElif4975);
            stmtIfBlock398=stmtIfBlock();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_stmtIfBlock.add(stmtIfBlock398.getTree());

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

            root_0 = (Object)adaptor.nil();
            // 756:23: -> ^( S_ELIF stmtIfBlock )
            {
                // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:756:26: ^( S_ELIF stmtIfBlock )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(S_ELIF, "S_ELIF")
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

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 101, stmtElif_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "stmtElif"


    public static class stmtElse_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stmtElse"
    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:758:1: stmtElse : 'else' stmtBlock -> ^( S_ELSE stmtBlock ) ;
    public final polParser.stmtElse_return stmtElse() throws RecognitionException {
        polParser.stmtElse_return retval = new polParser.stmtElse_return();
        retval.start = input.LT(1);

        int stmtElse_StartIndex = input.index();

        Object root_0 = null;

        Token string_literal399=null;
        polParser.stmtBlock_return stmtBlock400 =null;


        Object string_literal399_tree=null;
        RewriteRuleTokenStream stream_155=new RewriteRuleTokenStream(adaptor,"token 155");
        RewriteRuleSubtreeStream stream_stmtBlock=new RewriteRuleSubtreeStream(adaptor,"rule stmtBlock");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 102) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:759:2: ( 'else' stmtBlock -> ^( S_ELSE stmtBlock ) )
            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:759:4: 'else' stmtBlock
            {
            string_literal399=(Token)match(input,155,FOLLOW_155_in_stmtElse4993); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_155.add(string_literal399);


            pushFollow(FOLLOW_stmtBlock_in_stmtElse4995);
            stmtBlock400=stmtBlock();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_stmtBlock.add(stmtBlock400.getTree());

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

            root_0 = (Object)adaptor.nil();
            // 759:21: -> ^( S_ELSE stmtBlock )
            {
                // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:759:24: ^( S_ELSE stmtBlock )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(S_ELSE, "S_ELSE")
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

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 102, stmtElse_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "stmtElse"


    public static class stmtProvided_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stmtProvided"
    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:761:1: stmtProvided : 'provided' '(' expr ')' stmtBlock ( stmtElse )? -> ^( S_PROVIDED expr stmtBlock ( stmtElse )? ) ;
    public final polParser.stmtProvided_return stmtProvided() throws RecognitionException {
        polParser.stmtProvided_return retval = new polParser.stmtProvided_return();
        retval.start = input.LT(1);

        int stmtProvided_StartIndex = input.index();

        Object root_0 = null;

        Token string_literal401=null;
        Token char_literal402=null;
        Token char_literal404=null;
        polParser.expr_return expr403 =null;

        polParser.stmtBlock_return stmtBlock405 =null;

        polParser.stmtElse_return stmtElse406 =null;


        Object string_literal401_tree=null;
        Object char_literal402_tree=null;
        Object char_literal404_tree=null;
        RewriteRuleTokenStream stream_126=new RewriteRuleTokenStream(adaptor,"token 126");
        RewriteRuleTokenStream stream_127=new RewriteRuleTokenStream(adaptor,"token 127");
        RewriteRuleTokenStream stream_181=new RewriteRuleTokenStream(adaptor,"token 181");
        RewriteRuleSubtreeStream stream_stmtElse=new RewriteRuleSubtreeStream(adaptor,"rule stmtElse");
        RewriteRuleSubtreeStream stream_stmtBlock=new RewriteRuleSubtreeStream(adaptor,"rule stmtBlock");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 103) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:762:2: ( 'provided' '(' expr ')' stmtBlock ( stmtElse )? -> ^( S_PROVIDED expr stmtBlock ( stmtElse )? ) )
            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:762:4: 'provided' '(' expr ')' stmtBlock ( stmtElse )?
            {
            string_literal401=(Token)match(input,181,FOLLOW_181_in_stmtProvided5013); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_181.add(string_literal401);


            char_literal402=(Token)match(input,126,FOLLOW_126_in_stmtProvided5015); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_126.add(char_literal402);


            pushFollow(FOLLOW_expr_in_stmtProvided5017);
            expr403=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr403.getTree());

            char_literal404=(Token)match(input,127,FOLLOW_127_in_stmtProvided5019); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_127.add(char_literal404);


            pushFollow(FOLLOW_stmtBlock_in_stmtProvided5021);
            stmtBlock405=stmtBlock();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_stmtBlock.add(stmtBlock405.getTree());

            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:762:38: ( stmtElse )?
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( (LA97_0==155) ) {
                alt97=1;
            }
            switch (alt97) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:762:39: stmtElse
                    {
                    pushFollow(FOLLOW_stmtElse_in_stmtProvided5024);
                    stmtElse406=stmtElse();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_stmtElse.add(stmtElse406.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: stmtElse, stmtBlock, expr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 763:3: -> ^( S_PROVIDED expr stmtBlock ( stmtElse )? )
            {
                // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:763:6: ^( S_PROVIDED expr stmtBlock ( stmtElse )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(S_PROVIDED, "S_PROVIDED")
                , root_1);

                adaptor.addChild(root_1, stream_expr.nextTree());

                adaptor.addChild(root_1, stream_stmtBlock.nextTree());

                // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:763:34: ( stmtElse )?
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

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 103, stmtProvided_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "stmtProvided"


    public static class stmtWhile_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stmtWhile"
    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:765:1: stmtWhile : 'while' '(' expr ')' stmtBlock -> ^( S_WHILE stmtBlock ) ;
    public final polParser.stmtWhile_return stmtWhile() throws RecognitionException {
        polParser.stmtWhile_return retval = new polParser.stmtWhile_return();
        retval.start = input.LT(1);

        int stmtWhile_StartIndex = input.index();

        Object root_0 = null;

        Token string_literal407=null;
        Token char_literal408=null;
        Token char_literal410=null;
        polParser.expr_return expr409 =null;

        polParser.stmtBlock_return stmtBlock411 =null;


        Object string_literal407_tree=null;
        Object char_literal408_tree=null;
        Object char_literal410_tree=null;
        RewriteRuleTokenStream stream_126=new RewriteRuleTokenStream(adaptor,"token 126");
        RewriteRuleTokenStream stream_127=new RewriteRuleTokenStream(adaptor,"token 127");
        RewriteRuleTokenStream stream_192=new RewriteRuleTokenStream(adaptor,"token 192");
        RewriteRuleSubtreeStream stream_stmtBlock=new RewriteRuleSubtreeStream(adaptor,"rule stmtBlock");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 104) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:766:2: ( 'while' '(' expr ')' stmtBlock -> ^( S_WHILE stmtBlock ) )
            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:766:4: 'while' '(' expr ')' stmtBlock
            {
            string_literal407=(Token)match(input,192,FOLLOW_192_in_stmtWhile5051); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_192.add(string_literal407);


            char_literal408=(Token)match(input,126,FOLLOW_126_in_stmtWhile5053); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_126.add(char_literal408);


            pushFollow(FOLLOW_expr_in_stmtWhile5055);
            expr409=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr409.getTree());

            char_literal410=(Token)match(input,127,FOLLOW_127_in_stmtWhile5056); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_127.add(char_literal410);


            pushFollow(FOLLOW_stmtBlock_in_stmtWhile5058);
            stmtBlock411=stmtBlock();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_stmtBlock.add(stmtBlock411.getTree());

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

            root_0 = (Object)adaptor.nil();
            // 766:34: -> ^( S_WHILE stmtBlock )
            {
                // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:766:37: ^( S_WHILE stmtBlock )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(S_WHILE, "S_WHILE")
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

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 104, stmtWhile_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "stmtWhile"


    public static class varDeclaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "varDeclaration"
    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:768:1: varDeclaration : varAttr varDecl delim -> varDecl ;
    public final polParser.varDeclaration_return varDeclaration() throws RecognitionException {
        polParser.varDeclaration_return retval = new polParser.varDeclaration_return();
        retval.start = input.LT(1);

        int varDeclaration_StartIndex = input.index();

        Object root_0 = null;

        polParser.varAttr_return varAttr412 =null;

        polParser.varDecl_return varDecl413 =null;

        polParser.delim_return delim414 =null;


        RewriteRuleSubtreeStream stream_varAttr=new RewriteRuleSubtreeStream(adaptor,"rule varAttr");
        RewriteRuleSubtreeStream stream_varDecl=new RewriteRuleSubtreeStream(adaptor,"rule varDecl");
        RewriteRuleSubtreeStream stream_delim=new RewriteRuleSubtreeStream(adaptor,"rule delim");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 105) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:769:4: ( varAttr varDecl delim -> varDecl )
            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:769:7: varAttr varDecl delim
            {
            pushFollow(FOLLOW_varAttr_in_varDeclaration5083);
            varAttr412=varAttr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_varAttr.add(varAttr412.getTree());

            pushFollow(FOLLOW_varDecl_in_varDeclaration5085);
            varDecl413=varDecl();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_varDecl.add(varDecl413.getTree());

            pushFollow(FOLLOW_delim_in_varDeclaration5087);
            delim414=delim();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_delim.add(delim414.getTree());

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

            root_0 = (Object)adaptor.nil();
            // 769:29: -> varDecl
            {
                adaptor.addChild(root_0, stream_varDecl.nextTree());

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 105, varDeclaration_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "varDeclaration"


    public static class varAttr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "varAttr"
    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:771:1: varAttr : ( 'const' | 'volatile' | 'host' )* ;
    public final polParser.varAttr_return varAttr() throws RecognitionException {
        polParser.varAttr_return retval = new polParser.varAttr_return();
        retval.start = input.LT(1);

        int varAttr_StartIndex = input.index();

        Object root_0 = null;

        Token string_literal415=null;
        Token string_literal416=null;
        Token string_literal417=null;

        Object string_literal415_tree=null;
        Object string_literal416_tree=null;
        Object string_literal417_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 106) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:772:2: ( ( 'const' | 'volatile' | 'host' )* )
            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:772:4: ( 'const' | 'volatile' | 'host' )*
            {
            root_0 = (Object)adaptor.nil();


            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:772:4: ( 'const' | 'volatile' | 'host' )*
            loop98:
            do {
                int alt98=4;
                switch ( input.LA(1) ) {
                case 150:
                    {
                    alt98=1;
                    }
                    break;
                case 191:
                    {
                    alt98=2;
                    }
                    break;
                case 164:
                    {
                    alt98=3;
                    }
                    break;

                }

                switch (alt98) {
            	case 1 :
            	    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:772:7: 'const'
            	    {
            	    string_literal415=(Token)match(input,150,FOLLOW_150_in_varAttr5106); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal415_tree = 
            	    (Object)adaptor.create(string_literal415)
            	    ;
            	    adaptor.addChild(root_0, string_literal415_tree);
            	    }

            	    if ( state.backtracking==0 ) { atFlags.add(AttrFlags.CONST); }

            	    }
            	    break;
            	case 2 :
            	    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:773:6: 'volatile'
            	    {
            	    string_literal416=(Token)match(input,191,FOLLOW_191_in_varAttr5115); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal416_tree = 
            	    (Object)adaptor.create(string_literal416)
            	    ;
            	    adaptor.addChild(root_0, string_literal416_tree);
            	    }

            	    if ( state.backtracking==0 ) { atFlags.add(AttrFlags.VOLATILE); }

            	    }
            	    break;
            	case 3 :
            	    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:774:7: 'host'
            	    {
            	    string_literal417=(Token)match(input,164,FOLLOW_164_in_varAttr5125); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal417_tree = 
            	    (Object)adaptor.create(string_literal417)
            	    ;
            	    adaptor.addChild(root_0, string_literal417_tree);
            	    }

            	    if ( state.backtracking==0 ) { atFlags.add(AttrFlags.HOST); }

            	    }
            	    break;

            	default :
            	    break loop98;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

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
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "varDecl"
    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:777:1: varDecl : ( ( typeName IDENT ( ASSIGN expr )? ',' )=> varDeclList | ( typeName IDENT '[' )=> varArray | ( typeName '(' )=> varFcnRef | ( typeName varInit )=> varDeclList | 'new' typeName IDENT fcnArgumentList -> ^( D_VAR typeName ^( IDENT ^( E_EXPR ^( E_NEW typeName fcnArgumentList ) ) ) ) );
    public final polParser.varDecl_return varDecl() throws RecognitionException {
        varDecl_stack.push(new varDecl_scope());
        polParser.varDecl_return retval = new polParser.varDecl_return();
        retval.start = input.LT(1);

        int varDecl_StartIndex = input.index();

        Object root_0 = null;

        Token string_literal422=null;
        Token IDENT424=null;
        polParser.varDeclList_return varDeclList418 =null;

        polParser.varArray_return varArray419 =null;

        polParser.varFcnRef_return varFcnRef420 =null;

        polParser.varDeclList_return varDeclList421 =null;

        polParser.typeName_return typeName423 =null;

        polParser.fcnArgumentList_return fcnArgumentList425 =null;


        Object string_literal422_tree=null;
        Object IDENT424_tree=null;
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleTokenStream stream_175=new RewriteRuleTokenStream(adaptor,"token 175");
        RewriteRuleSubtreeStream stream_typeName=new RewriteRuleSubtreeStream(adaptor,"rule typeName");
        RewriteRuleSubtreeStream stream_fcnArgumentList=new RewriteRuleSubtreeStream(adaptor,"rule fcnArgumentList");

        	((varDecl_scope)varDecl_stack.peek()).typ = null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 107) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:786:2: ( ( typeName IDENT ( ASSIGN expr )? ',' )=> varDeclList | ( typeName IDENT '[' )=> varArray | ( typeName '(' )=> varFcnRef | ( typeName varInit )=> varDeclList | 'new' typeName IDENT fcnArgumentList -> ^( D_VAR typeName ^( IDENT ^( E_EXPR ^( E_NEW typeName fcnArgumentList ) ) ) ) )
            int alt99=5;
            switch ( input.LA(1) ) {
            case 144:
            case 146:
            case 169:
            case 170:
            case 171:
            case 184:
            case 188:
            case 189:
            case 190:
                {
                int LA99_1 = input.LA(2);

                if ( (synpred176_pol()) ) {
                    alt99=1;
                }
                else if ( (synpred177_pol()) ) {
                    alt99=2;
                }
                else if ( (synpred178_pol()) ) {
                    alt99=3;
                }
                else if ( (synpred179_pol()) ) {
                    alt99=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 99, 1, input);

                    throw nvae;

                }
                }
                break;
            case IDENT:
                {
                int LA99_2 = input.LA(2);

                if ( (synpred176_pol()) ) {
                    alt99=1;
                }
                else if ( (synpred177_pol()) ) {
                    alt99=2;
                }
                else if ( (synpred178_pol()) ) {
                    alt99=3;
                }
                else if ( (synpred179_pol()) ) {
                    alt99=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 99, 2, input);

                    throw nvae;

                }
                }
                break;
            case 175:
                {
                alt99=5;
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
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:786:4: ( typeName IDENT ( ASSIGN expr )? ',' )=> varDeclList
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_varDeclList_in_varDecl5169);
                    varDeclList418=varDeclList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDeclList418.getTree());

                    }
                    break;
                case 2 :
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:787:5: ( typeName IDENT '[' )=> varArray
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_varArray_in_varDecl5186);
                    varArray419=varArray();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varArray419.getTree());

                    }
                    break;
                case 3 :
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:788:5: ( typeName '(' )=> varFcnRef
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_varFcnRef_in_varDecl5202);
                    varFcnRef420=varFcnRef();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varFcnRef420.getTree());

                    }
                    break;
                case 4 :
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:789:6: ( typeName varInit )=> varDeclList
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_varDeclList_in_varDecl5218);
                    varDeclList421=varDeclList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDeclList421.getTree());

                    }
                    break;
                case 5 :
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:790:5: 'new' typeName IDENT fcnArgumentList
                    {
                    string_literal422=(Token)match(input,175,FOLLOW_175_in_varDecl5224); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_175.add(string_literal422);


                    pushFollow(FOLLOW_typeName_in_varDecl5226);
                    typeName423=typeName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeName.add(typeName423.getTree());

                    IDENT424=(Token)match(input,IDENT,FOLLOW_IDENT_in_varDecl5228); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENT.add(IDENT424);


                    pushFollow(FOLLOW_fcnArgumentList_in_varDecl5230);
                    fcnArgumentList425=fcnArgumentList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_fcnArgumentList.add(fcnArgumentList425.getTree());

                    // AST REWRITE
                    // elements: typeName, fcnArgumentList, IDENT, typeName
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 791:3: -> ^( D_VAR typeName ^( IDENT ^( E_EXPR ^( E_NEW typeName fcnArgumentList ) ) ) )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:791:6: ^( D_VAR typeName ^( IDENT ^( E_EXPR ^( E_NEW typeName fcnArgumentList ) ) ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(D_VAR, "D_VAR")
                        , root_1);

                        adaptor.addChild(root_1, stream_typeName.nextTree());

                        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:792:6: ^( IDENT ^( E_EXPR ^( E_NEW typeName fcnArgumentList ) ) )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(
                        stream_IDENT.nextNode()
                        , root_2);

                        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:792:14: ^( E_EXPR ^( E_NEW typeName fcnArgumentList ) )
                        {
                        Object root_3 = (Object)adaptor.nil();
                        root_3 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(E_EXPR, "E_EXPR")
                        , root_3);

                        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:792:23: ^( E_NEW typeName fcnArgumentList )
                        {
                        Object root_4 = (Object)adaptor.nil();
                        root_4 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(E_NEW, "E_NEW")
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

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

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
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "varFcnRef"
    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:794:1: varFcnRef : typeName fcnRefTypeList IDENT -> ^( D_FCN_REF typeName fcnRefTypeList IDENT ) ;
    public final polParser.varFcnRef_return varFcnRef() throws RecognitionException {
        polParser.varFcnRef_return retval = new polParser.varFcnRef_return();
        retval.start = input.LT(1);

        int varFcnRef_StartIndex = input.index();

        Object root_0 = null;

        Token IDENT428=null;
        polParser.typeName_return typeName426 =null;

        polParser.fcnRefTypeList_return fcnRefTypeList427 =null;


        Object IDENT428_tree=null;
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleSubtreeStream stream_typeName=new RewriteRuleSubtreeStream(adaptor,"rule typeName");
        RewriteRuleSubtreeStream stream_fcnRefTypeList=new RewriteRuleSubtreeStream(adaptor,"rule fcnRefTypeList");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 108) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:795:2: ( typeName fcnRefTypeList IDENT -> ^( D_FCN_REF typeName fcnRefTypeList IDENT ) )
            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:795:4: typeName fcnRefTypeList IDENT
            {
            pushFollow(FOLLOW_typeName_in_varFcnRef5274);
            typeName426=typeName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeName.add(typeName426.getTree());

            pushFollow(FOLLOW_fcnRefTypeList_in_varFcnRef5276);
            fcnRefTypeList427=fcnRefTypeList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_fcnRefTypeList.add(fcnRefTypeList427.getTree());

            IDENT428=(Token)match(input,IDENT,FOLLOW_IDENT_in_varFcnRef5278); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENT.add(IDENT428);


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

            root_0 = (Object)adaptor.nil();
            // 796:3: -> ^( D_FCN_REF typeName fcnRefTypeList IDENT )
            {
                // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:796:6: ^( D_FCN_REF typeName fcnRefTypeList IDENT )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(D_FCN_REF, "D_FCN_REF")
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

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 108, varFcnRef_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "varFcnRef"


    public static class fcnRefTypeList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "fcnRefTypeList"
    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:798:1: fcnRefTypeList : '(' fcnRefTypes ')' -> fcnRefTypes ;
    public final polParser.fcnRefTypeList_return fcnRefTypeList() throws RecognitionException {
        polParser.fcnRefTypeList_return retval = new polParser.fcnRefTypeList_return();
        retval.start = input.LT(1);

        int fcnRefTypeList_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal429=null;
        Token char_literal431=null;
        polParser.fcnRefTypes_return fcnRefTypes430 =null;


        Object char_literal429_tree=null;
        Object char_literal431_tree=null;
        RewriteRuleTokenStream stream_126=new RewriteRuleTokenStream(adaptor,"token 126");
        RewriteRuleTokenStream stream_127=new RewriteRuleTokenStream(adaptor,"token 127");
        RewriteRuleSubtreeStream stream_fcnRefTypes=new RewriteRuleSubtreeStream(adaptor,"rule fcnRefTypes");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 109) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:799:2: ( '(' fcnRefTypes ')' -> fcnRefTypes )
            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:799:4: '(' fcnRefTypes ')'
            {
            char_literal429=(Token)match(input,126,FOLLOW_126_in_fcnRefTypeList5303); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_126.add(char_literal429);


            pushFollow(FOLLOW_fcnRefTypes_in_fcnRefTypeList5305);
            fcnRefTypes430=fcnRefTypes();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_fcnRefTypes.add(fcnRefTypes430.getTree());

            char_literal431=(Token)match(input,127,FOLLOW_127_in_fcnRefTypeList5307); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_127.add(char_literal431);


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

            root_0 = (Object)adaptor.nil();
            // 799:24: -> fcnRefTypes
            {
                adaptor.addChild(root_0, stream_fcnRefTypes.nextTree());

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 109, fcnRefTypeList_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "fcnRefTypeList"


    public static class fcnRefTypes_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "fcnRefTypes"
    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:801:1: fcnRefTypes : ( typeName ( ',' typeName )* -> ^( LIST ( typeName )+ ) | -> ^( LIST ) );
    public final polParser.fcnRefTypes_return fcnRefTypes() throws RecognitionException {
        polParser.fcnRefTypes_return retval = new polParser.fcnRefTypes_return();
        retval.start = input.LT(1);

        int fcnRefTypes_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal433=null;
        polParser.typeName_return typeName432 =null;

        polParser.typeName_return typeName434 =null;


        Object char_literal433_tree=null;
        RewriteRuleTokenStream stream_129=new RewriteRuleTokenStream(adaptor,"token 129");
        RewriteRuleSubtreeStream stream_typeName=new RewriteRuleSubtreeStream(adaptor,"rule typeName");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 110) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:802:2: ( typeName ( ',' typeName )* -> ^( LIST ( typeName )+ ) | -> ^( LIST ) )
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==IDENT||LA101_0==144||LA101_0==146||(LA101_0 >= 169 && LA101_0 <= 171)||LA101_0==184||(LA101_0 >= 188 && LA101_0 <= 190)) ) {
                alt101=1;
            }
            else if ( (LA101_0==127) ) {
                alt101=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 101, 0, input);

                throw nvae;

            }
            switch (alt101) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:802:4: typeName ( ',' typeName )*
                    {
                    pushFollow(FOLLOW_typeName_in_fcnRefTypes5321);
                    typeName432=typeName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeName.add(typeName432.getTree());

                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:802:13: ( ',' typeName )*
                    loop100:
                    do {
                        int alt100=2;
                        int LA100_0 = input.LA(1);

                        if ( (LA100_0==129) ) {
                            alt100=1;
                        }


                        switch (alt100) {
                    	case 1 :
                    	    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:802:14: ',' typeName
                    	    {
                    	    char_literal433=(Token)match(input,129,FOLLOW_129_in_fcnRefTypes5324); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_129.add(char_literal433);


                    	    pushFollow(FOLLOW_typeName_in_fcnRefTypes5326);
                    	    typeName434=typeName();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_typeName.add(typeName434.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop100;
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

                    root_0 = (Object)adaptor.nil();
                    // 803:3: -> ^( LIST ( typeName )+ )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:803:6: ^( LIST ( typeName )+ )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(LIST, "LIST")
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
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:804:4: 
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

                    root_0 = (Object)adaptor.nil();
                    // 804:4: -> ^( LIST )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:804:7: ^( LIST )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(LIST, "LIST")
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

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 110, fcnRefTypes_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "fcnRefTypes"


    public static class varArray_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "varArray"
    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:806:1: varArray : typeName IDENT varArraySpec ( '=' initializer )? -> ^( D_ARR typeName IDENT varArraySpec ( initializer )? ) ;
    public final polParser.varArray_return varArray() throws RecognitionException {
        polParser.varArray_return retval = new polParser.varArray_return();
        retval.start = input.LT(1);

        int varArray_StartIndex = input.index();

        Object root_0 = null;

        Token IDENT436=null;
        Token char_literal438=null;
        polParser.typeName_return typeName435 =null;

        polParser.varArraySpec_return varArraySpec437 =null;

        polParser.initializer_return initializer439 =null;


        Object IDENT436_tree=null;
        Object char_literal438_tree=null;
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
        RewriteRuleSubtreeStream stream_typeName=new RewriteRuleSubtreeStream(adaptor,"rule typeName");
        RewriteRuleSubtreeStream stream_varArraySpec=new RewriteRuleSubtreeStream(adaptor,"rule varArraySpec");
        RewriteRuleSubtreeStream stream_initializer=new RewriteRuleSubtreeStream(adaptor,"rule initializer");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 111) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:807:2: ( typeName IDENT varArraySpec ( '=' initializer )? -> ^( D_ARR typeName IDENT varArraySpec ( initializer )? ) )
            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:807:4: typeName IDENT varArraySpec ( '=' initializer )?
            {
            pushFollow(FOLLOW_typeName_in_varArray5359);
            typeName435=typeName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeName.add(typeName435.getTree());

            IDENT436=(Token)match(input,IDENT,FOLLOW_IDENT_in_varArray5361); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENT.add(IDENT436);


            pushFollow(FOLLOW_varArraySpec_in_varArray5363);
            varArraySpec437=varArraySpec();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_varArraySpec.add(varArraySpec437.getTree());

            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:807:32: ( '=' initializer )?
            int alt102=2;
            int LA102_0 = input.LA(1);

            if ( (LA102_0==ASSIGN) ) {
                alt102=1;
            }
            switch (alt102) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:807:33: '=' initializer
                    {
                    char_literal438=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_varArray5366); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ASSIGN.add(char_literal438);


                    pushFollow(FOLLOW_initializer_in_varArray5368);
                    initializer439=initializer();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_initializer.add(initializer439.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: varArraySpec, typeName, initializer, IDENT
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 808:2: -> ^( D_ARR typeName IDENT varArraySpec ( initializer )? )
            {
                // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:808:6: ^( D_ARR typeName IDENT varArraySpec ( initializer )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(D_ARR, "D_ARR")
                , root_1);

                adaptor.addChild(root_1, stream_typeName.nextTree());

                adaptor.addChild(root_1, 
                stream_IDENT.nextNode()
                );

                adaptor.addChild(root_1, stream_varArraySpec.nextTree());

                // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:808:42: ( initializer )?
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

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 111, varArray_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "varArray"


    public static class varArraySpec_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "varArraySpec"
    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:810:1: varArraySpec : ( '[' varDim ']' )+ -> ^( LIST ( varDim )+ ) ;
    public final polParser.varArraySpec_return varArraySpec() throws RecognitionException {
        polParser.varArraySpec_return retval = new polParser.varArraySpec_return();
        retval.start = input.LT(1);

        int varArraySpec_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal440=null;
        Token char_literal442=null;
        polParser.varDim_return varDim441 =null;


        Object char_literal440_tree=null;
        Object char_literal442_tree=null;
        RewriteRuleTokenStream stream_139=new RewriteRuleTokenStream(adaptor,"token 139");
        RewriteRuleTokenStream stream_140=new RewriteRuleTokenStream(adaptor,"token 140");
        RewriteRuleSubtreeStream stream_varDim=new RewriteRuleSubtreeStream(adaptor,"rule varDim");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 112) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:811:2: ( ( '[' varDim ']' )+ -> ^( LIST ( varDim )+ ) )
            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:811:4: ( '[' varDim ']' )+
            {
            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:811:4: ( '[' varDim ']' )+
            int cnt103=0;
            loop103:
            do {
                int alt103=2;
                int LA103_0 = input.LA(1);

                if ( (LA103_0==139) ) {
                    int LA103_1 = input.LA(2);

                    if ( (synpred183_pol()) ) {
                        alt103=1;
                    }


                }


                switch (alt103) {
            	case 1 :
            	    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:811:5: '[' varDim ']'
            	    {
            	    char_literal440=(Token)match(input,139,FOLLOW_139_in_varArraySpec5399); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_139.add(char_literal440);


            	    pushFollow(FOLLOW_varDim_in_varArraySpec5401);
            	    varDim441=varDim();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_varDim.add(varDim441.getTree());

            	    char_literal442=(Token)match(input,140,FOLLOW_140_in_varArraySpec5403); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_140.add(char_literal442);


            	    }
            	    break;

            	default :
            	    if ( cnt103 >= 1 ) break loop103;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(103, input);
                        throw eee;
                }
                cnt103++;
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

            root_0 = (Object)adaptor.nil();
            // 811:22: -> ^( LIST ( varDim )+ )
            {
                // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:811:27: ^( LIST ( varDim )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(LIST, "LIST")
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

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 112, varArraySpec_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "varArraySpec"


    public static class varDim_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "varDim"
    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:813:1: varDim : ( expr | -> NIL );
    public final polParser.varDim_return varDim() throws RecognitionException {
        polParser.varDim_return retval = new polParser.varDim_return();
        retval.start = input.LT(1);

        int varDim_StartIndex = input.index();

        Object root_0 = null;

        polParser.expr_return expr443 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 113) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:814:2: ( expr | -> NIL )
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( ((LA104_0 >= BIT_NOT && LA104_0 <= CHAR)||LA104_0==DEC||LA104_0==HEX_LIT||LA104_0==IDENT||(LA104_0 >= INC && LA104_0 <= INT_LIT)||LA104_0==LOG_NOT||LA104_0==MINUS||LA104_0==OCT_LIT||LA104_0==REAL_LIT||LA104_0==STRING||LA104_0==126||(LA104_0 >= 138 && LA104_0 <= 139)||LA104_0==160||(LA104_0 >= 175 && LA104_0 <= 176)||LA104_0==186) ) {
                alt104=1;
            }
            else if ( (LA104_0==140) ) {
                alt104=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 104, 0, input);

                throw nvae;

            }
            switch (alt104) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:814:5: expr
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_expr_in_varDim5427);
                    expr443=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr443.getTree());

                    }
                    break;
                case 2 :
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:815:4: 
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

                    root_0 = (Object)adaptor.nil();
                    // 815:4: -> NIL
                    {
                        adaptor.addChild(root_0, 
                        (Object)adaptor.create(NIL, "NIL")
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 113, varDim_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "varDim"


    public static class initializer_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "initializer"
    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:817:1: initializer : ( expr | '{' initializer_list ( ',' )? '}' -> initializer_list );
    public final polParser.initializer_return initializer() throws RecognitionException {
        polParser.initializer_return retval = new polParser.initializer_return();
        retval.start = input.LT(1);

        int initializer_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal445=null;
        Token char_literal447=null;
        Token char_literal448=null;
        polParser.expr_return expr444 =null;

        polParser.initializer_list_return initializer_list446 =null;


        Object char_literal445_tree=null;
        Object char_literal447_tree=null;
        Object char_literal448_tree=null;
        RewriteRuleTokenStream stream_196=new RewriteRuleTokenStream(adaptor,"token 196");
        RewriteRuleTokenStream stream_129=new RewriteRuleTokenStream(adaptor,"token 129");
        RewriteRuleTokenStream stream_193=new RewriteRuleTokenStream(adaptor,"token 193");
        RewriteRuleSubtreeStream stream_initializer_list=new RewriteRuleSubtreeStream(adaptor,"rule initializer_list");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 114) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:818:2: ( expr | '{' initializer_list ( ',' )? '}' -> initializer_list )
            int alt106=2;
            int LA106_0 = input.LA(1);

            if ( ((LA106_0 >= BIT_NOT && LA106_0 <= CHAR)||LA106_0==DEC||LA106_0==HEX_LIT||LA106_0==IDENT||(LA106_0 >= INC && LA106_0 <= INT_LIT)||LA106_0==LOG_NOT||LA106_0==MINUS||LA106_0==OCT_LIT||LA106_0==REAL_LIT||LA106_0==STRING||LA106_0==126||(LA106_0 >= 138 && LA106_0 <= 139)||LA106_0==160||(LA106_0 >= 175 && LA106_0 <= 176)||LA106_0==186) ) {
                alt106=1;
            }
            else if ( (LA106_0==193) ) {
                alt106=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 106, 0, input);

                throw nvae;

            }
            switch (alt106) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:818:4: expr
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_expr_in_initializer5447);
                    expr444=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr444.getTree());

                    }
                    break;
                case 2 :
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:819:4: '{' initializer_list ( ',' )? '}'
                    {
                    char_literal445=(Token)match(input,193,FOLLOW_193_in_initializer5453); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_193.add(char_literal445);


                    pushFollow(FOLLOW_initializer_list_in_initializer5455);
                    initializer_list446=initializer_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_initializer_list.add(initializer_list446.getTree());

                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:819:25: ( ',' )?
                    int alt105=2;
                    int LA105_0 = input.LA(1);

                    if ( (LA105_0==129) ) {
                        alt105=1;
                    }
                    switch (alt105) {
                        case 1 :
                            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:819:25: ','
                            {
                            char_literal447=(Token)match(input,129,FOLLOW_129_in_initializer5457); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_129.add(char_literal447);


                            }
                            break;

                    }


                    char_literal448=(Token)match(input,196,FOLLOW_196_in_initializer5460); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_196.add(char_literal448);


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

                    root_0 = (Object)adaptor.nil();
                    // 819:34: -> initializer_list
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

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 114, initializer_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "initializer"


    public static class initializer_list_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "initializer_list"
    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:821:1: initializer_list : initializer ( ',' initializer )* -> ^( LIST ( initializer )+ ) ;
    public final polParser.initializer_list_return initializer_list() throws RecognitionException {
        polParser.initializer_list_return retval = new polParser.initializer_list_return();
        retval.start = input.LT(1);

        int initializer_list_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal450=null;
        polParser.initializer_return initializer449 =null;

        polParser.initializer_return initializer451 =null;


        Object char_literal450_tree=null;
        RewriteRuleTokenStream stream_129=new RewriteRuleTokenStream(adaptor,"token 129");
        RewriteRuleSubtreeStream stream_initializer=new RewriteRuleSubtreeStream(adaptor,"rule initializer");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 115) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:822:2: ( initializer ( ',' initializer )* -> ^( LIST ( initializer )+ ) )
            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:822:4: initializer ( ',' initializer )*
            {
            pushFollow(FOLLOW_initializer_in_initializer_list5474);
            initializer449=initializer();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_initializer.add(initializer449.getTree());

            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:822:16: ( ',' initializer )*
            loop107:
            do {
                int alt107=2;
                int LA107_0 = input.LA(1);

                if ( (LA107_0==129) ) {
                    int LA107_1 = input.LA(2);

                    if ( (synpred187_pol()) ) {
                        alt107=1;
                    }


                }


                switch (alt107) {
            	case 1 :
            	    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:822:17: ',' initializer
            	    {
            	    char_literal450=(Token)match(input,129,FOLLOW_129_in_initializer_list5477); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_129.add(char_literal450);


            	    pushFollow(FOLLOW_initializer_in_initializer_list5479);
            	    initializer451=initializer();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_initializer.add(initializer451.getTree());

            	    }
            	    break;

            	default :
            	    break loop107;
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

            root_0 = (Object)adaptor.nil();
            // 822:35: -> ^( LIST ( initializer )+ )
            {
                // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:822:38: ^( LIST ( initializer )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(LIST, "LIST")
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

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 115, initializer_list_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "initializer_list"


    public static class varDeclList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "varDeclList"
    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:825:1: varDeclList : ( typeName ! varDeclList | varInit ( ',' ! varInit )* );
    public final polParser.varDeclList_return varDeclList() throws RecognitionException {
        polParser.varDeclList_return retval = new polParser.varDeclList_return();
        retval.start = input.LT(1);

        int varDeclList_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal455=null;
        polParser.typeName_return typeName452 =null;

        polParser.varDeclList_return varDeclList453 =null;

        polParser.varInit_return varInit454 =null;

        polParser.varInit_return varInit456 =null;


        Object char_literal455_tree=null;


        	assert ((varDecl_scope)varDecl_stack.peek()).typ != null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 116) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:829:2: ( typeName ! varDeclList | varInit ( ',' ! varInit )* )
            int alt109=2;
            int LA109_0 = input.LA(1);

            if ( (LA109_0==IDENT) ) {
                int LA109_1 = input.LA(2);

                if ( (synpred188_pol()) ) {
                    alt109=1;
                }
                else if ( (true) ) {
                    alt109=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 109, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA109_0==144||LA109_0==146||(LA109_0 >= 169 && LA109_0 <= 171)||LA109_0==184||(LA109_0 >= 188 && LA109_0 <= 190)) ) {
                alt109=1;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 109, 0, input);

                throw nvae;

            }
            switch (alt109) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:829:4: typeName ! varDeclList
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_typeName_in_varDeclList5508);
                    typeName452=typeName();

                    state._fsp--;
                    if (state.failed) return retval;

                    if ( state.backtracking==0 ) {((varDecl_scope)varDecl_stack.peek()).typ = (typeName452!=null?((Object)typeName452.tree):null); }

                    pushFollow(FOLLOW_varDeclList_in_varDeclList5513);
                    varDeclList453=varDeclList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDeclList453.getTree());

                    }
                    break;
                case 2 :
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:830:4: varInit ( ',' ! varInit )*
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_varInit_in_varDeclList5518);
                    varInit454=varInit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varInit454.getTree());

                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:830:12: ( ',' ! varInit )*
                    loop108:
                    do {
                        int alt108=2;
                        int LA108_0 = input.LA(1);

                        if ( (LA108_0==129) ) {
                            int LA108_1 = input.LA(2);

                            if ( (synpred189_pol()) ) {
                                alt108=1;
                            }


                        }


                        switch (alt108) {
                    	case 1 :
                    	    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:830:13: ',' ! varInit
                    	    {
                    	    char_literal455=(Token)match(input,129,FOLLOW_129_in_varDeclList5521); if (state.failed) return retval;

                    	    pushFollow(FOLLOW_varInit_in_varDeclList5524);
                    	    varInit456=varInit();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, varInit456.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop108;
                        }
                    } while (true);


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 116, varDeclList_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "varDeclList"


    public static class varInit_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "varInit"
    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:832:1: varInit : IDENT ( ASSIGN expr )? -> ^( D_VAR ^( IDENT ( expr )? ) ) ;
    public final polParser.varInit_return varInit() throws RecognitionException {
        polParser.varInit_return retval = new polParser.varInit_return();
        retval.start = input.LT(1);

        int varInit_StartIndex = input.index();

        Object root_0 = null;

        Token IDENT457=null;
        Token ASSIGN458=null;
        polParser.expr_return expr459 =null;


        Object IDENT457_tree=null;
        Object ASSIGN458_tree=null;
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 117) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:834:2: ( IDENT ( ASSIGN expr )? -> ^( D_VAR ^( IDENT ( expr )? ) ) )
            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:834:4: IDENT ( ASSIGN expr )?
            {
            IDENT457=(Token)match(input,IDENT,FOLLOW_IDENT_in_varInit5542); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENT.add(IDENT457);


            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:834:10: ( ASSIGN expr )?
            int alt110=2;
            int LA110_0 = input.LA(1);

            if ( (LA110_0==ASSIGN) ) {
                alt110=1;
            }
            switch (alt110) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:834:11: ASSIGN expr
                    {
                    ASSIGN458=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_varInit5545); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ASSIGN.add(ASSIGN458);


                    pushFollow(FOLLOW_expr_in_varInit5547);
                    expr459=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr459.getTree());

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

            root_0 = (Object)adaptor.nil();
            // 835:3: -> ^( D_VAR ^( IDENT ( expr )? ) )
            {
                // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:835:6: ^( D_VAR ^( IDENT ( expr )? ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(D_VAR, "D_VAR")
                , root_1);

                adaptor.addChild(root_1, ((varDecl_scope)varDecl_stack.peek()).typ);

                // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:835:30: ^( IDENT ( expr )? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                stream_IDENT.nextNode()
                , root_2);

                // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:835:38: ( expr )?
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

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 117, varInit_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "varInit"


    public static class builtinType_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "builtinType"
    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:838:1: builtinType : ( 'bool' | 'byte' | 'int8' | 'int16' | 'int32' | 'string' | 'uint8' | 'uint16' | 'uint32' );
    public final polParser.builtinType_return builtinType() throws RecognitionException {
        polParser.builtinType_return retval = new polParser.builtinType_return();
        retval.start = input.LT(1);

        int builtinType_StartIndex = input.index();

        Object root_0 = null;

        Token set460=null;

        Object set460_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 118) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:839:5: ( 'bool' | 'byte' | 'int8' | 'int16' | 'int32' | 'string' | 'uint8' | 'uint16' | 'uint32' )
            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:
            {
            root_0 = (Object)adaptor.nil();


            set460=(Token)input.LT(1);

            if ( input.LA(1)==144||input.LA(1)==146||(input.LA(1) >= 169 && input.LA(1) <= 171)||input.LA(1)==184||(input.LA(1) >= 188 && input.LA(1) <= 190) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (Object)adaptor.create(set460)
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

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 118, builtinType_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "builtinType"


    public static class qualName_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "qualName"
    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:850:1: qualName : IDENT ( qualNameList )? -> ^( E_IDENT IDENT ( qualNameList )? ) ;
    public final polParser.qualName_return qualName() throws RecognitionException {
        polParser.qualName_return retval = new polParser.qualName_return();
        retval.start = input.LT(1);

        int qualName_StartIndex = input.index();

        Object root_0 = null;

        Token IDENT461=null;
        polParser.qualNameList_return qualNameList462 =null;


        Object IDENT461_tree=null;
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleSubtreeStream stream_qualNameList=new RewriteRuleSubtreeStream(adaptor,"rule qualNameList");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 119) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:851:5: ( IDENT ( qualNameList )? -> ^( E_IDENT IDENT ( qualNameList )? ) )
            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:851:9: IDENT ( qualNameList )?
            {
            IDENT461=(Token)match(input,IDENT,FOLLOW_IDENT_in_qualName5685); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENT.add(IDENT461);


            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:851:15: ( qualNameList )?
            int alt111=2;
            int LA111_0 = input.LA(1);

            if ( (LA111_0==130) ) {
                int LA111_1 = input.LA(2);

                if ( (synpred199_pol()) ) {
                    alt111=1;
                }
            }
            switch (alt111) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:851:16: qualNameList
                    {
                    pushFollow(FOLLOW_qualNameList_in_qualName5688);
                    qualNameList462=qualNameList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_qualNameList.add(qualNameList462.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: qualNameList, IDENT
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 851:31: -> ^( E_IDENT IDENT ( qualNameList )? )
            {
                // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:851:34: ^( E_IDENT IDENT ( qualNameList )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(E_IDENT, "E_IDENT")
                , root_1);

                adaptor.addChild(root_1, 
                stream_IDENT.nextNode()
                );

                // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:851:51: ( qualNameList )?
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

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 119, qualName_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "qualName"


    public static class qualNameList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "qualNameList"
    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:853:1: qualNameList : ( '.' IDENT )+ -> ( ^( E_IDENT IDENT ) )+ ;
    public final polParser.qualNameList_return qualNameList() throws RecognitionException {
        polParser.qualNameList_return retval = new polParser.qualNameList_return();
        retval.start = input.LT(1);

        int qualNameList_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal463=null;
        Token IDENT464=null;

        Object char_literal463_tree=null;
        Object IDENT464_tree=null;
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleTokenStream stream_130=new RewriteRuleTokenStream(adaptor,"token 130");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 120) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:854:2: ( ( '.' IDENT )+ -> ( ^( E_IDENT IDENT ) )+ )
            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:855:2: ( '.' IDENT )+
            {
            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:855:2: ( '.' IDENT )+
            int cnt112=0;
            loop112:
            do {
                int alt112=2;
                int LA112_0 = input.LA(1);

                if ( (LA112_0==130) ) {
                    int LA112_1 = input.LA(2);

                    if ( (synpred200_pol()) ) {
                        alt112=1;
                    }


                }


                switch (alt112) {
            	case 1 :
            	    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:855:6: '.' IDENT
            	    {
            	    char_literal463=(Token)match(input,130,FOLLOW_130_in_qualNameList5720); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_130.add(char_literal463);


            	    IDENT464=(Token)match(input,IDENT,FOLLOW_IDENT_in_qualNameList5735); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_IDENT.add(IDENT464);


            	    }
            	    break;

            	default :
            	    if ( cnt112 >= 1 ) break loop112;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(112, input);
                        throw eee;
                }
                cnt112++;
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

            root_0 = (Object)adaptor.nil();
            // 857:9: -> ( ^( E_IDENT IDENT ) )+
            {
                if ( !(stream_IDENT.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_IDENT.hasNext() ) {
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:857:12: ^( E_IDENT IDENT )
                    {
                    Object root_1 = (Object)adaptor.nil();
                    root_1 = (Object)adaptor.becomeRoot(
                    (Object)adaptor.create(E_IDENT, "E_IDENT")
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

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 120, qualNameList_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "qualNameList"


    public static class arrayLit_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "arrayLit"
    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:859:1: arrayLit : '[' arrayLitList ']' -> ^( LIST arrayLitList ) ;
    public final polParser.arrayLit_return arrayLit() throws RecognitionException {
        polParser.arrayLit_return retval = new polParser.arrayLit_return();
        retval.start = input.LT(1);

        int arrayLit_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal465=null;
        Token char_literal467=null;
        polParser.arrayLitList_return arrayLitList466 =null;


        Object char_literal465_tree=null;
        Object char_literal467_tree=null;
        RewriteRuleTokenStream stream_139=new RewriteRuleTokenStream(adaptor,"token 139");
        RewriteRuleTokenStream stream_140=new RewriteRuleTokenStream(adaptor,"token 140");
        RewriteRuleSubtreeStream stream_arrayLitList=new RewriteRuleSubtreeStream(adaptor,"rule arrayLitList");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 121) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:860:2: ( '[' arrayLitList ']' -> ^( LIST arrayLitList ) )
            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:860:4: '[' arrayLitList ']'
            {
            char_literal465=(Token)match(input,139,FOLLOW_139_in_arrayLit5764); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_139.add(char_literal465);


            pushFollow(FOLLOW_arrayLitList_in_arrayLit5766);
            arrayLitList466=arrayLitList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_arrayLitList.add(arrayLitList466.getTree());

            char_literal467=(Token)match(input,140,FOLLOW_140_in_arrayLit5768); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_140.add(char_literal467);


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

            root_0 = (Object)adaptor.nil();
            // 860:25: -> ^( LIST arrayLitList )
            {
                // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:860:28: ^( LIST arrayLitList )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(LIST, "LIST")
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

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 121, arrayLit_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "arrayLit"


    public static class arrayLitList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "arrayLitList"
    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:862:1: arrayLitList : ( arrayLitElem ( ',' arrayLitElem )* -> ( arrayLitElem )+ | -> NIL );
    public final polParser.arrayLitList_return arrayLitList() throws RecognitionException {
        polParser.arrayLitList_return retval = new polParser.arrayLitList_return();
        retval.start = input.LT(1);

        int arrayLitList_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal469=null;
        polParser.arrayLitElem_return arrayLitElem468 =null;

        polParser.arrayLitElem_return arrayLitElem470 =null;


        Object char_literal469_tree=null;
        RewriteRuleTokenStream stream_129=new RewriteRuleTokenStream(adaptor,"token 129");
        RewriteRuleSubtreeStream stream_arrayLitElem=new RewriteRuleSubtreeStream(adaptor,"rule arrayLitElem");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 122) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:863:2: ( arrayLitElem ( ',' arrayLitElem )* -> ( arrayLitElem )+ | -> NIL )
            int alt114=2;
            int LA114_0 = input.LA(1);

            if ( (LA114_0==CHAR||LA114_0==HEX_LIT||LA114_0==IDENT||LA114_0==INT_LIT||LA114_0==OCT_LIT||LA114_0==REAL_LIT||LA114_0==STRING||LA114_0==160||LA114_0==176||LA114_0==186) ) {
                alt114=1;
            }
            else if ( (LA114_0==140) ) {
                alt114=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 114, 0, input);

                throw nvae;

            }
            switch (alt114) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:863:4: arrayLitElem ( ',' arrayLitElem )*
                    {
                    pushFollow(FOLLOW_arrayLitElem_in_arrayLitList5786);
                    arrayLitElem468=arrayLitElem();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_arrayLitElem.add(arrayLitElem468.getTree());

                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:863:17: ( ',' arrayLitElem )*
                    loop113:
                    do {
                        int alt113=2;
                        int LA113_0 = input.LA(1);

                        if ( (LA113_0==129) ) {
                            alt113=1;
                        }


                        switch (alt113) {
                    	case 1 :
                    	    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:863:18: ',' arrayLitElem
                    	    {
                    	    char_literal469=(Token)match(input,129,FOLLOW_129_in_arrayLitList5789); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_129.add(char_literal469);


                    	    pushFollow(FOLLOW_arrayLitElem_in_arrayLitList5791);
                    	    arrayLitElem470=arrayLitElem();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_arrayLitElem.add(arrayLitElem470.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop113;
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

                    root_0 = (Object)adaptor.nil();
                    // 863:37: -> ( arrayLitElem )+
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
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:864:4: 
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

                    root_0 = (Object)adaptor.nil();
                    // 864:4: -> NIL
                    {
                        adaptor.addChild(root_0, 
                        (Object)adaptor.create(NIL, "NIL")
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 122, arrayLitList_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "arrayLitList"


    public static class arrayLitElem_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "arrayLitElem"
    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:866:1: arrayLitElem : ( primitiveLit | namedConstant );
    public final polParser.arrayLitElem_return arrayLitElem() throws RecognitionException {
        polParser.arrayLitElem_return retval = new polParser.arrayLitElem_return();
        retval.start = input.LT(1);

        int arrayLitElem_StartIndex = input.index();

        Object root_0 = null;

        polParser.primitiveLit_return primitiveLit471 =null;

        polParser.namedConstant_return namedConstant472 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 123) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:867:2: ( primitiveLit | namedConstant )
            int alt115=2;
            int LA115_0 = input.LA(1);

            if ( (LA115_0==CHAR||LA115_0==HEX_LIT||LA115_0==INT_LIT||LA115_0==OCT_LIT||LA115_0==REAL_LIT||LA115_0==STRING||LA115_0==160||LA115_0==176||LA115_0==186) ) {
                alt115=1;
            }
            else if ( (LA115_0==IDENT) ) {
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
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:867:4: primitiveLit
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_primitiveLit_in_arrayLitElem5815);
                    primitiveLit471=primitiveLit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveLit471.getTree());

                    }
                    break;
                case 2 :
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:867:19: namedConstant
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_namedConstant_in_arrayLitElem5819);
                    namedConstant472=namedConstant();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, namedConstant472.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 123, arrayLitElem_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "arrayLitElem"


    public static class namedConstant_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "namedConstant"
    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:869:1: namedConstant : qualName ;
    public final polParser.namedConstant_return namedConstant() throws RecognitionException {
        polParser.namedConstant_return retval = new polParser.namedConstant_return();
        retval.start = input.LT(1);

        int namedConstant_StartIndex = input.index();

        Object root_0 = null;

        polParser.qualName_return qualName473 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 124) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:870:2: ( qualName )
            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:870:4: qualName
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_qualName_in_namedConstant5829);
            qualName473=qualName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, qualName473.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 124, namedConstant_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "namedConstant"


    public static class boolLit_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "boolLit"
    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:872:1: boolLit : ( 'true' | 'false' ) ;
    public final polParser.boolLit_return boolLit() throws RecognitionException {
        polParser.boolLit_return retval = new polParser.boolLit_return();
        retval.start = input.LT(1);

        int boolLit_StartIndex = input.index();

        Object root_0 = null;

        Token set474=null;

        Object set474_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 125) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:873:9: ( ( 'true' | 'false' ) )
            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:873:11: ( 'true' | 'false' )
            {
            root_0 = (Object)adaptor.nil();


            set474=(Token)input.LT(1);

            if ( input.LA(1)==160||input.LA(1)==186 ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (Object)adaptor.create(set474)
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

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 125, boolLit_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "boolLit"


    public static class nullLit_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "nullLit"
    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:875:1: nullLit : 'null' ;
    public final polParser.nullLit_return nullLit() throws RecognitionException {
        polParser.nullLit_return retval = new polParser.nullLit_return();
        retval.start = input.LT(1);

        int nullLit_StartIndex = input.index();

        Object root_0 = null;

        Token string_literal475=null;

        Object string_literal475_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 126) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:876:9: ( 'null' )
            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:876:13: 'null'
            {
            root_0 = (Object)adaptor.nil();


            string_literal475=(Token)match(input,176,FOLLOW_176_in_nullLit5882); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal475_tree = 
            (Object)adaptor.create(string_literal475)
            ;
            adaptor.addChild(root_0, string_literal475_tree);
            }

            if ( state.backtracking==0 ) {litFlags.add(LitFlags.NULL);}

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 126, nullLit_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "nullLit"


    public static class numLit_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "numLit"
    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:878:1: numLit : ( INT_LIT | OCT_LIT | REAL_LIT | HEX_LIT );
    public final polParser.numLit_return numLit() throws RecognitionException {
        polParser.numLit_return retval = new polParser.numLit_return();
        retval.start = input.LT(1);

        int numLit_StartIndex = input.index();

        Object root_0 = null;

        Token INT_LIT476=null;
        Token OCT_LIT477=null;
        Token REAL_LIT478=null;
        Token HEX_LIT479=null;

        Object INT_LIT476_tree=null;
        Object OCT_LIT477_tree=null;
        Object REAL_LIT478_tree=null;
        Object HEX_LIT479_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 127) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:882:9: ( INT_LIT | OCT_LIT | REAL_LIT | HEX_LIT )
            int alt116=4;
            switch ( input.LA(1) ) {
            case INT_LIT:
                {
                alt116=1;
                }
                break;
            case OCT_LIT:
                {
                alt116=2;
                }
                break;
            case REAL_LIT:
                {
                alt116=3;
                }
                break;
            case HEX_LIT:
                {
                alt116=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 116, 0, input);

                throw nvae;

            }

            switch (alt116) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:882:17: INT_LIT
                    {
                    root_0 = (Object)adaptor.nil();


                    INT_LIT476=(Token)match(input,INT_LIT,FOLLOW_INT_LIT_in_numLit5919); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INT_LIT476_tree = 
                    (Object)adaptor.create(INT_LIT476)
                    ;
                    adaptor.addChild(root_0, INT_LIT476_tree);
                    }

                    if ( state.backtracking==0 ) {litFlags.add(LitFlags.INT);}

                    }
                    break;
                case 2 :
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:883:17: OCT_LIT
                    {
                    root_0 = (Object)adaptor.nil();


                    OCT_LIT477=(Token)match(input,OCT_LIT,FOLLOW_OCT_LIT_in_numLit5942); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    OCT_LIT477_tree = 
                    (Object)adaptor.create(OCT_LIT477)
                    ;
                    adaptor.addChild(root_0, OCT_LIT477_tree);
                    }

                    if ( state.backtracking==0 ) {litFlags.add(LitFlags.OCT);}

                    }
                    break;
                case 3 :
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:884:17: REAL_LIT
                    {
                    root_0 = (Object)adaptor.nil();


                    REAL_LIT478=(Token)match(input,REAL_LIT,FOLLOW_REAL_LIT_in_numLit5965); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    REAL_LIT478_tree = 
                    (Object)adaptor.create(REAL_LIT478)
                    ;
                    adaptor.addChild(root_0, REAL_LIT478_tree);
                    }

                    if ( state.backtracking==0 ) {litFlags.add(LitFlags.REAL);}

                    }
                    break;
                case 4 :
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:885:17: HEX_LIT
                    {
                    root_0 = (Object)adaptor.nil();


                    HEX_LIT479=(Token)match(input,HEX_LIT,FOLLOW_HEX_LIT_in_numLit5986); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    HEX_LIT479_tree = 
                    (Object)adaptor.create(HEX_LIT479)
                    ;
                    adaptor.addChild(root_0, HEX_LIT479_tree);
                    }

                    if ( state.backtracking==0 ) {litFlags.add(LitFlags.HEX);}

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) {
                    litFlags.add(LitFlags.NUM);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 127, numLit_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "numLit"


    public static class primitiveLit_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "primitiveLit"
    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:888:1: primitiveLit : ( boolLit -> ^( E_CONST boolLit ) | numLit -> ^( E_CONST numLit ) | nullLit -> ^( E_CONST nullLit ) | STRING -> ^( E_CONST STRING ) | CHAR -> ^( E_CONST CHAR ) );
    public final polParser.primitiveLit_return primitiveLit() throws RecognitionException {
        polParser.primitiveLit_return retval = new polParser.primitiveLit_return();
        retval.start = input.LT(1);

        int primitiveLit_StartIndex = input.index();

        Object root_0 = null;

        Token STRING483=null;
        Token CHAR484=null;
        polParser.boolLit_return boolLit480 =null;

        polParser.numLit_return numLit481 =null;

        polParser.nullLit_return nullLit482 =null;


        Object STRING483_tree=null;
        Object CHAR484_tree=null;
        RewriteRuleTokenStream stream_CHAR=new RewriteRuleTokenStream(adaptor,"token CHAR");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");
        RewriteRuleSubtreeStream stream_numLit=new RewriteRuleSubtreeStream(adaptor,"rule numLit");
        RewriteRuleSubtreeStream stream_nullLit=new RewriteRuleSubtreeStream(adaptor,"rule nullLit");
        RewriteRuleSubtreeStream stream_boolLit=new RewriteRuleSubtreeStream(adaptor,"rule boolLit");

                litFlags.clear();       

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 128) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:895:9: ( boolLit -> ^( E_CONST boolLit ) | numLit -> ^( E_CONST numLit ) | nullLit -> ^( E_CONST nullLit ) | STRING -> ^( E_CONST STRING ) | CHAR -> ^( E_CONST CHAR ) )
            int alt117=5;
            switch ( input.LA(1) ) {
            case 160:
            case 186:
                {
                alt117=1;
                }
                break;
            case HEX_LIT:
            case INT_LIT:
            case OCT_LIT:
            case REAL_LIT:
                {
                alt117=2;
                }
                break;
            case 176:
                {
                alt117=3;
                }
                break;
            case STRING:
                {
                alt117=4;
                }
                break;
            case CHAR:
                {
                alt117=5;
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
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:895:17: boolLit
                    {
                    pushFollow(FOLLOW_boolLit_in_primitiveLit6032);
                    boolLit480=boolLit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_boolLit.add(boolLit480.getTree());

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

                    root_0 = (Object)adaptor.nil();
                    // 895:25: -> ^( E_CONST boolLit )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:895:28: ^( E_CONST boolLit )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(E_CONST, "E_CONST")
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
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:896:17: numLit
                    {
                    pushFollow(FOLLOW_numLit_in_primitiveLit6058);
                    numLit481=numLit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_numLit.add(numLit481.getTree());

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

                    root_0 = (Object)adaptor.nil();
                    // 896:25: -> ^( E_CONST numLit )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:896:28: ^( E_CONST numLit )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(E_CONST, "E_CONST")
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
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:897:17: nullLit
                    {
                    pushFollow(FOLLOW_nullLit_in_primitiveLit6085);
                    nullLit482=nullLit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_nullLit.add(nullLit482.getTree());

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

                    root_0 = (Object)adaptor.nil();
                    // 897:25: -> ^( E_CONST nullLit )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:897:28: ^( E_CONST nullLit )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(E_CONST, "E_CONST")
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
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:898:17: STRING
                    {
                    STRING483=(Token)match(input,STRING,FOLLOW_STRING_in_primitiveLit6111); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_STRING.add(STRING483);


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

                    root_0 = (Object)adaptor.nil();
                    // 899:12: -> ^( E_CONST STRING )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:899:15: ^( E_CONST STRING )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(E_CONST, "E_CONST")
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
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:900:17: CHAR
                    {
                    CHAR484=(Token)match(input,CHAR,FOLLOW_CHAR_in_primitiveLit6153); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CHAR.add(CHAR484);


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

                    root_0 = (Object)adaptor.nil();
                    // 901:13: -> ^( E_CONST CHAR )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:901:16: ^( E_CONST CHAR )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(E_CONST, "E_CONST")
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

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) {
                    litFlags.clear();       
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 128, primitiveLit_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "primitiveLit"


    public static class stmtInjection_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stmtInjection"
    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:903:1: stmtInjection : INJECT ( NL )* -> ^( E_INJECT INJECT ) ;
    public final polParser.stmtInjection_return stmtInjection() throws RecognitionException {
        polParser.stmtInjection_return retval = new polParser.stmtInjection_return();
        retval.start = input.LT(1);

        int stmtInjection_StartIndex = input.index();

        Object root_0 = null;

        Token INJECT485=null;
        Token NL486=null;

        Object INJECT485_tree=null;
        Object NL486_tree=null;
        RewriteRuleTokenStream stream_INJECT=new RewriteRuleTokenStream(adaptor,"token INJECT");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 129) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:904:2: ( INJECT ( NL )* -> ^( E_INJECT INJECT ) )
            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:904:4: INJECT ( NL )*
            {
            INJECT485=(Token)match(input,INJECT,FOLLOW_INJECT_in_stmtInjection6194); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_INJECT.add(INJECT485);


            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:904:11: ( NL )*
            loop118:
            do {
                int alt118=2;
                int LA118_0 = input.LA(1);

                if ( (LA118_0==NL) ) {
                    int LA118_1 = input.LA(2);

                    if ( (synpred212_pol()) ) {
                        alt118=1;
                    }


                }


                switch (alt118) {
            	case 1 :
            	    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:904:11: NL
            	    {
            	    NL486=(Token)match(input,NL,FOLLOW_NL_in_stmtInjection6196); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_NL.add(NL486);


            	    }
            	    break;

            	default :
            	    break loop118;
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

            root_0 = (Object)adaptor.nil();
            // 904:15: -> ^( E_INJECT INJECT )
            {
                // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:904:18: ^( E_INJECT INJECT )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(E_INJECT, "E_INJECT")
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

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 129, stmtInjection_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "stmtInjection"


    public static class injectionCode_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "injectionCode"
    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:906:1: injectionCode : INJECT -> ^( E_INJECT INJECT ) ;
    public final polParser.injectionCode_return injectionCode() throws RecognitionException {
        polParser.injectionCode_return retval = new polParser.injectionCode_return();
        retval.start = input.LT(1);

        int injectionCode_StartIndex = input.index();

        Object root_0 = null;

        Token INJECT487=null;

        Object INJECT487_tree=null;
        RewriteRuleTokenStream stream_INJECT=new RewriteRuleTokenStream(adaptor,"token INJECT");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 130) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:907:2: ( INJECT -> ^( E_INJECT INJECT ) )
            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:907:4: INJECT
            {
            INJECT487=(Token)match(input,INJECT,FOLLOW_INJECT_in_injectionCode6215); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_INJECT.add(INJECT487);


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

            root_0 = (Object)adaptor.nil();
            // 907:11: -> ^( E_INJECT INJECT )
            {
                // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:907:14: ^( E_INJECT INJECT )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(E_INJECT, "E_INJECT")
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

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 130, injectionCode_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "injectionCode"


    public static class delim_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "delim"
    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:909:1: delim : ( ( SEMI ) ( NL )* ->| ( NL )+ ->| ( ( NL )* '}' )=> ( NL )* ->);
    public final polParser.delim_return delim() throws RecognitionException {
        polParser.delim_return retval = new polParser.delim_return();
        retval.start = input.LT(1);

        int delim_StartIndex = input.index();

        Object root_0 = null;

        Token SEMI488=null;
        Token NL489=null;
        Token NL490=null;
        Token NL491=null;

        Object SEMI488_tree=null;
        Object NL489_tree=null;
        Object NL490_tree=null;
        Object NL491_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 131) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:910:2: ( ( SEMI ) ( NL )* ->| ( NL )+ ->| ( ( NL )* '}' )=> ( NL )* ->)
            int alt122=3;
            int LA122_0 = input.LA(1);

            if ( (LA122_0==SEMI) ) {
                alt122=1;
            }
            else if ( (LA122_0==NL) ) {
                int LA122_2 = input.LA(2);

                if ( (synpred216_pol()) ) {
                    alt122=2;
                }
                else if ( (synpred218_pol()) ) {
                    alt122=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 122, 2, input);

                    throw nvae;

                }
            }
            else if ( (LA122_0==163) && (synpred218_pol())) {
                alt122=3;
            }
            else if ( (LA122_0==167) && (synpred218_pol())) {
                alt122=3;
            }
            else if ( (LA122_0==INJECT) && (synpred218_pol())) {
                alt122=3;
            }
            else if ( (LA122_0==173) && (synpred218_pol())) {
                alt122=3;
            }
            else if ( (LA122_0==174) && (synpred218_pol())) {
                alt122=3;
            }
            else if ( (LA122_0==148) && (synpred218_pol())) {
                alt122=3;
            }
            else if ( (LA122_0==180) && (synpred218_pol())) {
                alt122=3;
            }
            else if ( (LA122_0==149) && (synpred218_pol())) {
                alt122=3;
            }
            else if ( (LA122_0==156) && (synpred218_pol())) {
                alt122=3;
            }
            else if ( (LA122_0==EOF) && (synpred218_pol())) {
                alt122=3;
            }
            else if ( (LA122_0==196) && (synpred218_pol())) {
                alt122=3;
            }
            else if ( (LA122_0==158) && (synpred218_pol())) {
                alt122=3;
            }
            else if ( (LA122_0==182) && (synpred218_pol())) {
                alt122=3;
            }
            else if ( (LA122_0==164) && (synpred218_pol())) {
                alt122=3;
            }
            else if ( (LA122_0==144||LA122_0==146||(LA122_0 >= 169 && LA122_0 <= 171)||LA122_0==184||(LA122_0 >= 188 && LA122_0 <= 190)) && (synpred218_pol())) {
                alt122=3;
            }
            else if ( (LA122_0==IDENT) && (synpred218_pol())) {
                alt122=3;
            }
            else if ( (LA122_0==126) && (synpred218_pol())) {
                alt122=3;
            }
            else if ( (LA122_0==150) && (synpred218_pol())) {
                alt122=3;
            }
            else if ( (LA122_0==191) && (synpred218_pol())) {
                alt122=3;
            }
            else if ( (LA122_0==175) && (synpred218_pol())) {
                alt122=3;
            }
            else if ( (LA122_0==129) && (synpred218_pol())) {
                alt122=3;
            }
            else if ( (LA122_0==147) && (synpred218_pol())) {
                alt122=3;
            }
            else if ( (LA122_0==152) && (synpred218_pol())) {
                alt122=3;
            }
            else if ( (LA122_0==138) && (synpred218_pol())) {
                alt122=3;
            }
            else if ( (LA122_0==143) && (synpred218_pol())) {
                alt122=3;
            }
            else if ( (LA122_0==179) && (synpred218_pol())) {
                alt122=3;
            }
            else if ( (LA122_0==183) && (synpred218_pol())) {
                alt122=3;
            }
            else if ( (LA122_0==145) && (synpred218_pol())) {
                alt122=3;
            }
            else if ( (LA122_0==151) && (synpred218_pol())) {
                alt122=3;
            }
            else if ( (LA122_0==162) && (synpred218_pol())) {
                alt122=3;
            }
            else if ( (LA122_0==161) && (synpred218_pol())) {
                alt122=3;
            }
            else if ( (LA122_0==185) && (synpred218_pol())) {
                alt122=3;
            }
            else if ( (LA122_0==153) && (synpred218_pol())) {
                alt122=3;
            }
            else if ( (LA122_0==165) && (synpred218_pol())) {
                alt122=3;
            }
            else if ( (LA122_0==181) && (synpred218_pol())) {
                alt122=3;
            }
            else if ( (LA122_0==192) && (synpred218_pol())) {
                alt122=3;
            }
            else if ( (LA122_0==160||LA122_0==186) && (synpred218_pol())) {
                alt122=3;
            }
            else if ( (LA122_0==INT_LIT) && (synpred218_pol())) {
                alt122=3;
            }
            else if ( (LA122_0==OCT_LIT) && (synpred218_pol())) {
                alt122=3;
            }
            else if ( (LA122_0==REAL_LIT) && (synpred218_pol())) {
                alt122=3;
            }
            else if ( (LA122_0==HEX_LIT) && (synpred218_pol())) {
                alt122=3;
            }
            else if ( (LA122_0==176) && (synpred218_pol())) {
                alt122=3;
            }
            else if ( (LA122_0==STRING) && (synpred218_pol())) {
                alt122=3;
            }
            else if ( (LA122_0==CHAR) && (synpred218_pol())) {
                alt122=3;
            }
            else if ( (LA122_0==139) && (synpred218_pol())) {
                alt122=3;
            }
            else if ( (LA122_0==LOG_NOT) && (synpred218_pol())) {
                alt122=3;
            }
            else if ( (LA122_0==BIT_NOT) && (synpred218_pol())) {
                alt122=3;
            }
            else if ( (LA122_0==MINUS) && (synpred218_pol())) {
                alt122=3;
            }
            else if ( (LA122_0==DEC||LA122_0==INC) && (synpred218_pol())) {
                alt122=3;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 122, 0, input);

                throw nvae;

            }
            switch (alt122) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:910:4: ( SEMI ) ( NL )*
                    {
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:910:4: ( SEMI )
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:910:5: SEMI
                    {
                    SEMI488=(Token)match(input,SEMI,FOLLOW_SEMI_in_delim6235); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI488);


                    }


                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:910:11: ( NL )*
                    loop119:
                    do {
                        int alt119=2;
                        int LA119_0 = input.LA(1);

                        if ( (LA119_0==NL) ) {
                            int LA119_1 = input.LA(2);

                            if ( (synpred213_pol()) ) {
                                alt119=1;
                            }


                        }


                        switch (alt119) {
                    	case 1 :
                    	    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:910:12: NL
                    	    {
                    	    NL489=(Token)match(input,NL,FOLLOW_NL_in_delim6239); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_NL.add(NL489);


                    	    }
                    	    break;

                    	default :
                    	    break loop119;
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

                    root_0 = (Object)adaptor.nil();
                    // 910:17: ->
                    {
                        root_0 = null;
                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:911:4: ( NL )+
                    {
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:911:4: ( NL )+
                    int cnt120=0;
                    loop120:
                    do {
                        int alt120=2;
                        int LA120_0 = input.LA(1);

                        if ( (LA120_0==NL) ) {
                            int LA120_1 = input.LA(2);

                            if ( (synpred215_pol()) ) {
                                alt120=1;
                            }


                        }


                        switch (alt120) {
                    	case 1 :
                    	    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:911:5: NL
                    	    {
                    	    NL490=(Token)match(input,NL,FOLLOW_NL_in_delim6250); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_NL.add(NL490);


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt120 >= 1 ) break loop120;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(120, input);
                                throw eee;
                        }
                        cnt120++;
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

                    root_0 = (Object)adaptor.nil();
                    // 911:10: ->
                    {
                        root_0 = null;
                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 3 :
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:912:4: ( ( NL )* '}' )=> ( NL )*
                    {
                    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:912:20: ( NL )*
                    loop121:
                    do {
                        int alt121=2;
                        int LA121_0 = input.LA(1);

                        if ( (LA121_0==NL) ) {
                            int LA121_1 = input.LA(2);

                            if ( (synpred219_pol()) ) {
                                alt121=1;
                            }


                        }


                        switch (alt121) {
                    	case 1 :
                    	    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:912:20: NL
                    	    {
                    	    NL491=(Token)match(input,NL,FOLLOW_NL_in_delim6272); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_NL.add(NL491);


                    	    }
                    	    break;

                    	default :
                    	    break loop121;
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

                    root_0 = (Object)adaptor.nil();
                    // 912:24: ->
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

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 131, delim_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "delim"


    public static class delim_implicit_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "delim_implicit"
    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:914:1: delim_implicit :;
    public final polParser.delim_implicit_return delim_implicit() throws RecognitionException {
        polParser.delim_implicit_return retval = new polParser.delim_implicit_return();
        retval.start = input.LT(1);

        int delim_implicit_StartIndex = input.index();

        Object root_0 = null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 132) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:915:2: ()
            // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:916:2: 
            {
            root_0 = (Object)adaptor.nil();


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 132, delim_implicit_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "delim_implicit"

    // $ANTLR start synpred2_pol
    public final void synpred2_pol_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:192:8: ( stmtInjection )
        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:192:8: stmtInjection
        {
        pushFollow(FOLLOW_stmtInjection_in_synpred2_pol712);
        stmtInjection();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred2_pol

    // $ANTLR start synpred6_pol
    public final void synpred6_pol_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:205:9: ( stmtExport )
        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:205:9: stmtExport
        {
        pushFollow(FOLLOW_stmtExport_in_synpred6_pol813);
        stmtExport();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred6_pol

    // $ANTLR start synpred9_pol
    public final void synpred9_pol_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:230:9: ( fcnDefinition )
        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:230:9: fcnDefinition
        {
        pushFollow(FOLLOW_fcnDefinition_in_synpred9_pol912);
        fcnDefinition();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred9_pol

    // $ANTLR start synpred11_pol
    public final void synpred11_pol_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:232:9: ( varDeclaration )
        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:232:9: varDeclaration
        {
        pushFollow(FOLLOW_varDeclaration_in_synpred11_pol933);
        varDeclaration();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred11_pol

    // $ANTLR start synpred15_pol
    public final void synpred15_pol_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:244:6: ( fcnDefinition )
        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:244:6: fcnDefinition
        {
        pushFollow(FOLLOW_fcnDefinition_in_synpred15_pol1035);
        fcnDefinition();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred15_pol

    // $ANTLR start synpred16_pol
    public final void synpred16_pol_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:245:8: ( varDeclaration )
        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:245:8: varDeclaration
        {
        pushFollow(FOLLOW_varDeclaration_in_synpred16_pol1044);
        varDeclaration();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred16_pol

    // $ANTLR start synpred20_pol
    public final void synpred20_pol_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:275:26: ( delim )
        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:275:26: delim
        {
        pushFollow(FOLLOW_delim_in_synpred20_pol1176);
        delim();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred20_pol

    // $ANTLR start synpred21_pol
    public final void synpred21_pol_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:275:4: ( IDENT ASSIGN INT_LIT ( delim )? )
        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:275:4: IDENT ASSIGN INT_LIT ( delim )?
        {
        match(input,IDENT,FOLLOW_IDENT_in_synpred21_pol1169); if (state.failed) return ;

        match(input,ASSIGN,FOLLOW_ASSIGN_in_synpred21_pol1171); if (state.failed) return ;

        match(input,INT_LIT,FOLLOW_INT_LIT_in_synpred21_pol1173); if (state.failed) return ;

        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:275:25: ( delim )?
        int alt123=2;
        int LA123_0 = input.LA(1);

        if ( (LA123_0==NL||LA123_0==SEMI) ) {
            alt123=1;
        }
        else if ( (LA123_0==EOF) ) {
            int LA123_3 = input.LA(2);

            if ( (synpred20_pol()) ) {
                alt123=1;
            }
        }
        switch (alt123) {
            case 1 :
                // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:275:26: delim
                {
                pushFollow(FOLLOW_delim_in_synpred21_pol1176);
                delim();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        }

    }
    // $ANTLR end synpred21_pol

    // $ANTLR start synpred22_pol
    public final void synpred22_pol_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:276:11: ( delim )
        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:276:11: delim
        {
        pushFollow(FOLLOW_delim_in_synpred22_pol1198);
        delim();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred22_pol

    // $ANTLR start synpred30_pol
    public final void synpred30_pol_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:303:7: ( fcnDefinitionHost )
        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:303:7: fcnDefinitionHost
        {
        pushFollow(FOLLOW_fcnDefinitionHost_in_synpred30_pol1372);
        fcnDefinitionHost();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred30_pol

    // $ANTLR start synpred32_pol
    public final void synpred32_pol_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:305:7: ( varDeclaration )
        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:305:7: varDeclaration
        {
        pushFollow(FOLLOW_varDeclaration_in_synpred32_pol1388);
        varDeclaration();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred32_pol

    // $ANTLR start synpred34_pol
    public final void synpred34_pol_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:311:10: ( importAs )
        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:311:10: importAs
        {
        pushFollow(FOLLOW_importAs_in_synpred34_pol1440);
        importAs();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred34_pol

    // $ANTLR start synpred43_pol
    public final void synpred43_pol_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:346:7: ( '{' metaArgument ( ',' metaArgument )* '}' )
        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:346:7: '{' metaArgument ( ',' metaArgument )* '}'
        {
        match(input,193,FOLLOW_193_in_synpred43_pol1701); if (state.failed) return ;

        pushFollow(FOLLOW_metaArgument_in_synpred43_pol1703);
        metaArgument();

        state._fsp--;
        if (state.failed) return ;

        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:346:25: ( ',' metaArgument )*
        loop125:
        do {
            int alt125=2;
            int LA125_0 = input.LA(1);

            if ( (LA125_0==129) ) {
                alt125=1;
            }


            switch (alt125) {
        	case 1 :
        	    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:346:26: ',' metaArgument
        	    {
        	    match(input,129,FOLLOW_129_in_synpred43_pol1707); if (state.failed) return ;

        	    pushFollow(FOLLOW_metaArgument_in_synpred43_pol1709);
        	    metaArgument();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop125;
            }
        } while (true);


        match(input,196,FOLLOW_196_in_synpred43_pol1713); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred43_pol

    // $ANTLR start synpred49_pol
    public final void synpred49_pol_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:368:4: ( qualName metaArguments )
        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:368:4: qualName metaArguments
        {
        pushFollow(FOLLOW_qualName_in_synpred49_pol1826);
        qualName();

        state._fsp--;
        if (state.failed) return ;

        pushFollow(FOLLOW_metaArguments_in_synpred49_pol1828);
        metaArguments();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred49_pol

    // $ANTLR start synpred51_pol
    public final void synpred51_pol_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:382:10: ( 'module' )
        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:382:11: 'module'
        {
        match(input,174,FOLLOW_174_in_synpred51_pol1893); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred51_pol

    // $ANTLR start synpred52_pol
    public final void synpred52_pol_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:383:8: ( 'class' )
        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:383:9: 'class'
        {
        match(input,148,FOLLOW_148_in_synpred52_pol1913); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred52_pol

    // $ANTLR start synpred53_pol
    public final void synpred53_pol_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:384:10: ( 'protocol' )
        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:384:11: 'protocol'
        {
        match(input,180,FOLLOW_180_in_synpred53_pol1931); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred53_pol

    // $ANTLR start synpred54_pol
    public final void synpred54_pol_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:385:10: ( 'composition' )
        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:385:11: 'composition'
        {
        match(input,149,FOLLOW_149_in_synpred54_pol1949); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred54_pol

    // $ANTLR start synpred55_pol
    public final void synpred55_pol_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:386:10: ( 'enum' )
        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:386:11: 'enum'
        {
        match(input,156,FOLLOW_156_in_synpred55_pol1967); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred55_pol

    // $ANTLR start synpred57_pol
    public final void synpred57_pol_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:398:23: ( NL )
        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:398:23: NL
        {
        match(input,NL,FOLLOW_NL_in_synpred57_pol2051); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred57_pol

    // $ANTLR start synpred61_pol
    public final void synpred61_pol_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:407:23: ( NL )
        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:407:23: NL
        {
        match(input,NL,FOLLOW_NL_in_synpred61_pol2118); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred61_pol

    // $ANTLR start synpred80_pol
    public final void synpred80_pol_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:437:10: ( ',' expr )
        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:437:10: ',' expr
        {
        match(input,129,FOLLOW_129_in_synpred80_pol2320); if (state.failed) return ;

        pushFollow(FOLLOW_expr_in_synpred80_pol2322);
        expr();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred80_pol

    // $ANTLR start synpred81_pol
    public final void synpred81_pol_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:437:4: ( expr ( ',' expr )* )
        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:437:4: expr ( ',' expr )*
        {
        pushFollow(FOLLOW_expr_in_synpred81_pol2317);
        expr();

        state._fsp--;
        if (state.failed) return ;

        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:437:9: ( ',' expr )*
        loop126:
        do {
            int alt126=2;
            int LA126_0 = input.LA(1);

            if ( (LA126_0==129) ) {
                alt126=1;
            }


            switch (alt126) {
        	case 1 :
        	    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:437:10: ',' expr
        	    {
        	    match(input,129,FOLLOW_129_in_synpred81_pol2320); if (state.failed) return ;

        	    pushFollow(FOLLOW_expr_in_synpred81_pol2322);
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
    // $ANTLR end synpred81_pol

    // $ANTLR start synpred82_pol
    public final void synpred82_pol_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:442:4: ( exprLogicalOr '?' expr ':' expr )
        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:442:4: exprLogicalOr '?' expr ':' expr
        {
        pushFollow(FOLLOW_exprLogicalOr_in_synpred82_pol2353);
        exprLogicalOr();

        state._fsp--;
        if (state.failed) return ;

        match(input,137,FOLLOW_137_in_synpred82_pol2355); if (state.failed) return ;

        pushFollow(FOLLOW_expr_in_synpred82_pol2357);
        expr();

        state._fsp--;
        if (state.failed) return ;

        match(input,132,FOLLOW_132_in_synpred82_pol2359); if (state.failed) return ;

        pushFollow(FOLLOW_expr_in_synpred82_pol2361);
        expr();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred82_pol

    // $ANTLR start synpred83_pol
    public final void synpred83_pol_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:448:4: ( '||' exprLogicalAnd )
        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:448:4: '||' exprLogicalAnd
        {
        match(input,195,FOLLOW_195_in_synpred83_pol2410); if (state.failed) return ;

        pushFollow(FOLLOW_exprLogicalAnd_in_synpred83_pol2412);
        exprLogicalAnd();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred83_pol

    // $ANTLR start synpred84_pol
    public final void synpred84_pol_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:455:3: ( '&&' exprBitwiseOr )
        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:455:3: '&&' exprBitwiseOr
        {
        match(input,124,FOLLOW_124_in_synpred84_pol2457); if (state.failed) return ;

        pushFollow(FOLLOW_exprBitwiseOr_in_synpred84_pol2459);
        exprBitwiseOr();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred84_pol

    // $ANTLR start synpred85_pol
    public final void synpred85_pol_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:462:3: ( '|' exprBitwiseXor )
        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:462:3: '|' exprBitwiseXor
        {
        match(input,194,FOLLOW_194_in_synpred85_pol2502); if (state.failed) return ;

        pushFollow(FOLLOW_exprBitwiseXor_in_synpred85_pol2504);
        exprBitwiseXor();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred85_pol

    // $ANTLR start synpred86_pol
    public final void synpred86_pol_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:469:3: ( '^' exprBitwiseAnd )
        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:469:3: '^' exprBitwiseAnd
        {
        match(input,141,FOLLOW_141_in_synpred86_pol2546); if (state.failed) return ;

        pushFollow(FOLLOW_exprBitwiseAnd_in_synpred86_pol2548);
        exprBitwiseAnd();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred86_pol

    // $ANTLR start synpred87_pol
    public final void synpred87_pol_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:476:3: ( '&' exprEquality )
        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:476:3: '&' exprEquality
        {
        match(input,125,FOLLOW_125_in_synpred87_pol2590); if (state.failed) return ;

        pushFollow(FOLLOW_exprEquality_in_synpred87_pol2592);
        exprEquality();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred87_pol

    // $ANTLR start synpred88_pol
    public final void synpred88_pol_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:483:3: ( equalityOp exprRelational )
        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:483:3: equalityOp exprRelational
        {
        pushFollow(FOLLOW_equalityOp_in_synpred88_pol2635);
        equalityOp();

        state._fsp--;
        if (state.failed) return ;

        pushFollow(FOLLOW_exprRelational_in_synpred88_pol2637);
        exprRelational();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred88_pol

    // $ANTLR start synpred89_pol
    public final void synpred89_pol_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:490:3: ( relationalOp exprShift )
        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:490:3: relationalOp exprShift
        {
        pushFollow(FOLLOW_relationalOp_in_synpred89_pol2680);
        relationalOp();

        state._fsp--;
        if (state.failed) return ;

        pushFollow(FOLLOW_exprShift_in_synpred89_pol2682);
        exprShift();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred89_pol

    // $ANTLR start synpred90_pol
    public final void synpred90_pol_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:497:3: ( shiftOp exprAddSub )
        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:497:3: shiftOp exprAddSub
        {
        pushFollow(FOLLOW_shiftOp_in_synpred90_pol2726);
        shiftOp();

        state._fsp--;
        if (state.failed) return ;

        pushFollow(FOLLOW_exprAddSub_in_synpred90_pol2729);
        exprAddSub();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred90_pol

    // $ANTLR start synpred91_pol
    public final void synpred91_pol_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:504:3: ( addSubOp exprMultDiv )
        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:504:3: addSubOp exprMultDiv
        {
        pushFollow(FOLLOW_addSubOp_in_synpred91_pol2772);
        addSubOp();

        state._fsp--;
        if (state.failed) return ;

        pushFollow(FOLLOW_exprMultDiv_in_synpred91_pol2774);
        exprMultDiv();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred91_pol

    // $ANTLR start synpred92_pol
    public final void synpred92_pol_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:511:3: ( multDivModOp exprUnary )
        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:511:3: multDivModOp exprUnary
        {
        pushFollow(FOLLOW_multDivModOp_in_synpred92_pol2819);
        multDivModOp();

        state._fsp--;
        if (state.failed) return ;

        pushFollow(FOLLOW_exprUnary_in_synpred92_pol2821);
        exprUnary();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred92_pol

    // $ANTLR start synpred100_pol
    public final void synpred100_pol_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:526:4: ( varOrFcnOrArray incDecOp )
        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:526:4: varOrFcnOrArray incDecOp
        {
        pushFollow(FOLLOW_varOrFcnOrArray_in_synpred100_pol2983);
        varOrFcnOrArray();

        state._fsp--;
        if (state.failed) return ;

        pushFollow(FOLLOW_incDecOp_in_synpred100_pol2985);
        incDecOp();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred100_pol

    // $ANTLR start synpred101_pol
    public final void synpred101_pol_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:527:4: ( varOrFcnOrArray )
        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:527:4: varOrFcnOrArray
        {
        pushFollow(FOLLOW_varOrFcnOrArray_in_synpred101_pol3000);
        varOrFcnOrArray();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred101_pol

    // $ANTLR start synpred111_pol
    public final void synpred111_pol_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:586:4: ( typeName qualName )
        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:586:4: typeName qualName
        {
        pushFollow(FOLLOW_typeName_in_synpred111_pol3281);
        typeName();

        state._fsp--;
        if (state.failed) return ;

        pushFollow(FOLLOW_qualName_in_synpred111_pol3283);
        qualName();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred111_pol

    // $ANTLR start synpred112_pol
    public final void synpred112_pol_fragment() throws RecognitionException {
        void  =null;


        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:588:4: ({...}?t= typeName )
        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:588:4: {...}?t= typeName
        {
        if ( !((input.LT(1).getText().equals(ti.getTypeName()) )) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred112_pol", "input.LT(1).getText().equals(ti.getTypeName()) ");
        }

        pushFollow(FOLLOW_typeName_in_synpred112_pol3317);
        t=typeName();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred112_pol

    // $ANTLR start synpred113_pol
    public final void synpred113_pol_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:590:4: ( qualName )
        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:590:4: qualName
        {
        pushFollow(FOLLOW_qualName_in_synpred113_pol3350);
        qualName();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred113_pol

    // $ANTLR start synpred115_pol
    public final void synpred115_pol_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:592:4: ( '(' typeName ( ',' typeName )* ')' qualName )
        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:592:5: '(' typeName ( ',' typeName )* ')' qualName
        {
        match(input,126,FOLLOW_126_in_synpred115_pol3387); if (state.failed) return ;

        pushFollow(FOLLOW_typeName_in_synpred115_pol3389);
        typeName();

        state._fsp--;
        if (state.failed) return ;

        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:592:18: ( ',' typeName )*
        loop127:
        do {
            int alt127=2;
            int LA127_0 = input.LA(1);

            if ( (LA127_0==129) ) {
                alt127=1;
            }


            switch (alt127) {
        	case 1 :
        	    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:592:19: ',' typeName
        	    {
        	    match(input,129,FOLLOW_129_in_synpred115_pol3392); if (state.failed) return ;

        	    pushFollow(FOLLOW_typeName_in_synpred115_pol3394);
        	    typeName();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop127;
            }
        } while (true);


        match(input,127,FOLLOW_127_in_synpred115_pol3398); if (state.failed) return ;

        pushFollow(FOLLOW_qualName_in_synpred115_pol3400);
        qualName();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred115_pol

    // $ANTLR start synpred120_pol
    public final void synpred120_pol_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:619:41: ( fieldOrArrayAccess )
        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:619:41: fieldOrArrayAccess
        {
        pushFollow(FOLLOW_fieldOrArrayAccess_in_synpred120_pol3606);
        fieldOrArrayAccess();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred120_pol

    // $ANTLR start synpred122_pol
    public final void synpred122_pol_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:621:36: ( fieldOrArrayAccess )
        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:621:36: fieldOrArrayAccess
        {
        pushFollow(FOLLOW_fieldOrArrayAccess_in_synpred122_pol3653);
        fieldOrArrayAccess();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred122_pol

    // $ANTLR start synpred123_pol
    public final void synpred123_pol_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:621:10: ( '@' IDENT fcnArgumentList ( fieldOrArrayAccess )? )
        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:621:10: '@' IDENT fcnArgumentList ( fieldOrArrayAccess )?
        {
        match(input,138,FOLLOW_138_in_synpred123_pol3647); if (state.failed) return ;

        match(input,IDENT,FOLLOW_IDENT_in_synpred123_pol3649); if (state.failed) return ;

        pushFollow(FOLLOW_fcnArgumentList_in_synpred123_pol3651);
        fcnArgumentList();

        state._fsp--;
        if (state.failed) return ;

        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:621:36: ( fieldOrArrayAccess )?
        int alt130=2;
        int LA130_0 = input.LA(1);

        if ( (LA130_0==130||LA130_0==139) ) {
            alt130=1;
        }
        switch (alt130) {
            case 1 :
                // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:621:36: fieldOrArrayAccess
                {
                pushFollow(FOLLOW_fieldOrArrayAccess_in_synpred123_pol3653);
                fieldOrArrayAccess();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        }

    }
    // $ANTLR end synpred123_pol

    // $ANTLR start synpred124_pol
    public final void synpred124_pol_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:624:24: ( fieldOrArrayAccess )
        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:624:24: fieldOrArrayAccess
        {
        pushFollow(FOLLOW_fieldOrArrayAccess_in_synpred124_pol3730);
        fieldOrArrayAccess();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred124_pol

    // $ANTLR start synpred125_pol
    public final void synpred125_pol_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:624:10: ( '@' IDENT ( fieldOrArrayAccess )? )
        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:624:10: '@' IDENT ( fieldOrArrayAccess )?
        {
        match(input,138,FOLLOW_138_in_synpred125_pol3722); if (state.failed) return ;

        match(input,IDENT,FOLLOW_IDENT_in_synpred125_pol3728); if (state.failed) return ;

        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:624:24: ( fieldOrArrayAccess )?
        int alt131=2;
        int LA131_0 = input.LA(1);

        if ( (LA131_0==130||LA131_0==139) ) {
            alt131=1;
        }
        switch (alt131) {
            case 1 :
                // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:624:24: fieldOrArrayAccess
                {
                pushFollow(FOLLOW_fieldOrArrayAccess_in_synpred125_pol3730);
                fieldOrArrayAccess();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        }

    }
    // $ANTLR end synpred125_pol

    // $ANTLR start synpred126_pol
    public final void synpred126_pol_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:626:10: ( '@' )
        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:626:10: '@'
        {
        match(input,138,FOLLOW_138_in_synpred126_pol3778); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred126_pol

    // $ANTLR start synpred127_pol
    public final void synpred127_pol_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:628:35: ( fieldOrArrayAccess )
        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:628:35: fieldOrArrayAccess
        {
        pushFollow(FOLLOW_fieldOrArrayAccess_in_synpred127_pol3815);
        fieldOrArrayAccess();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred127_pol

    // $ANTLR start synpred128_pol
    public final void synpred128_pol_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:628:10: ( qualName fcnArgumentList ( fieldOrArrayAccess )? )
        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:628:10: qualName fcnArgumentList ( fieldOrArrayAccess )?
        {
        pushFollow(FOLLOW_qualName_in_synpred128_pol3811);
        qualName();

        state._fsp--;
        if (state.failed) return ;

        pushFollow(FOLLOW_fcnArgumentList_in_synpred128_pol3813);
        fcnArgumentList();

        state._fsp--;
        if (state.failed) return ;

        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:628:35: ( fieldOrArrayAccess )?
        int alt132=2;
        int LA132_0 = input.LA(1);

        if ( (LA132_0==130||LA132_0==139) ) {
            alt132=1;
        }
        switch (alt132) {
            case 1 :
                // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:628:35: fieldOrArrayAccess
                {
                pushFollow(FOLLOW_fieldOrArrayAccess_in_synpred128_pol3815);
                fieldOrArrayAccess();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        }

    }
    // $ANTLR end synpred128_pol

    // $ANTLR start synpred129_pol
    public final void synpred129_pol_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:630:19: ( fieldOrArrayAccess )
        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:630:19: fieldOrArrayAccess
        {
        pushFollow(FOLLOW_fieldOrArrayAccess_in_synpred129_pol3858);
        fieldOrArrayAccess();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred129_pol

    // $ANTLR start synpred131_pol
    public final void synpred131_pol_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:634:20: ( arrayAccess )
        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:634:20: arrayAccess
        {
        pushFollow(FOLLOW_arrayAccess_in_synpred131_pol3876);
        arrayAccess();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred131_pol

    // $ANTLR start synpred132_pol
    public final void synpred132_pol_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:639:12: ( '.' IDENT fcnArgumentList )
        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:639:12: '.' IDENT fcnArgumentList
        {
        match(input,130,FOLLOW_130_in_synpred132_pol3898); if (state.failed) return ;

        match(input,IDENT,FOLLOW_IDENT_in_synpred132_pol3904); if (state.failed) return ;

        pushFollow(FOLLOW_fcnArgumentList_in_synpred132_pol3906);
        fcnArgumentList();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred132_pol

    // $ANTLR start synpred133_pol
    public final void synpred133_pol_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:643:9: ( exprList )
        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:643:9: exprList
        {
        pushFollow(FOLLOW_exprList_in_synpred133_pol3962);
        exprList();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred133_pol

    // $ANTLR start synpred136_pol
    public final void synpred136_pol_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:650:5: ( NL )
        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:650:5: NL
        {
        match(input,NL,FOLLOW_NL_in_synpred136_pol4028); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred136_pol

    // $ANTLR start synpred137_pol
    public final void synpred137_pol_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:653:5: ( varDeclaration )
        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:653:5: varDeclaration
        {
        pushFollow(FOLLOW_varDeclaration_in_synpred137_pol4045);
        varDeclaration();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred137_pol

    // $ANTLR start synpred138_pol
    public final void synpred138_pol_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:654:4: ( stmtAssign delim )
        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:654:4: stmtAssign delim
        {
        pushFollow(FOLLOW_stmtAssign_in_synpred138_pol4051);
        stmtAssign();

        state._fsp--;
        if (state.failed) return ;

        pushFollow(FOLLOW_delim_in_synpred138_pol4053);
        delim();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred138_pol

    // $ANTLR start synpred140_pol
    public final void synpred140_pol_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:656:4: ( stmtBind )
        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:656:4: stmtBind
        {
        pushFollow(FOLLOW_stmtBind_in_synpred140_pol4065);
        stmtBind();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred140_pol

    // $ANTLR start synpred152_pol
    public final void synpred152_pol_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:668:4: ( stmtInjection )
        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:668:4: stmtInjection
        {
        pushFollow(FOLLOW_stmtInjection_in_synpred152_pol4130);
        stmtInjection();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred152_pol

    // $ANTLR start synpred153_pol
    public final void synpred153_pol_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:672:4: ( varOrFcnOrArray ASSIGN expr )
        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:672:4: varOrFcnOrArray ASSIGN expr
        {
        pushFollow(FOLLOW_varOrFcnOrArray_in_synpred153_pol4147);
        varOrFcnOrArray();

        state._fsp--;
        if (state.failed) return ;

        match(input,ASSIGN,FOLLOW_ASSIGN_in_synpred153_pol4149); if (state.failed) return ;

        pushFollow(FOLLOW_expr_in_synpred153_pol4151);
        expr();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred153_pol

    // $ANTLR start synpred154_pol
    public final void synpred154_pol_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:674:4: ( injectionCode ASSIGN expr )
        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:674:4: injectionCode ASSIGN expr
        {
        pushFollow(FOLLOW_injectionCode_in_synpred154_pol4175);
        injectionCode();

        state._fsp--;
        if (state.failed) return ;

        match(input,ASSIGN,FOLLOW_ASSIGN_in_synpred154_pol4177); if (state.failed) return ;

        pushFollow(FOLLOW_expr_in_synpred154_pol4179);
        expr();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred154_pol

    // $ANTLR start synpred155_pol
    public final void synpred155_pol_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:676:4: ( varOrFcnOrArray assignOp expr )
        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:676:4: varOrFcnOrArray assignOp expr
        {
        pushFollow(FOLLOW_varOrFcnOrArray_in_synpred155_pol4204);
        varOrFcnOrArray();

        state._fsp--;
        if (state.failed) return ;

        pushFollow(FOLLOW_assignOp_in_synpred155_pol4206);
        assignOp();

        state._fsp--;
        if (state.failed) return ;

        pushFollow(FOLLOW_expr_in_synpred155_pol4208);
        expr();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred155_pol

    // $ANTLR start synpred160_pol
    public final void synpred160_pol_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:697:4: ( 'return' ( '(' ) ( expr ( ',' expr )+ ) ( ')' ) delim )
        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:697:4: 'return' ( '(' ) ( expr ( ',' expr )+ ) ( ')' ) delim
        {
        match(input,183,FOLLOW_183_in_synpred160_pol4371); if (state.failed) return ;

        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:697:13: ( '(' )
        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:697:14: '('
        {
        match(input,126,FOLLOW_126_in_synpred160_pol4374); if (state.failed) return ;

        }


        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:697:19: ( expr ( ',' expr )+ )
        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:697:20: expr ( ',' expr )+
        {
        pushFollow(FOLLOW_expr_in_synpred160_pol4378);
        expr();

        state._fsp--;
        if (state.failed) return ;

        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:697:25: ( ',' expr )+
        int cnt134=0;
        loop134:
        do {
            int alt134=2;
            int LA134_0 = input.LA(1);

            if ( (LA134_0==129) ) {
                alt134=1;
            }


            switch (alt134) {
        	case 1 :
        	    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:697:26: ',' expr
        	    {
        	    match(input,129,FOLLOW_129_in_synpred160_pol4381); if (state.failed) return ;

        	    pushFollow(FOLLOW_expr_in_synpred160_pol4383);
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


        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:697:38: ( ')' )
        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:697:39: ')'
        {
        match(input,127,FOLLOW_127_in_synpred160_pol4389); if (state.failed) return ;

        }


        pushFollow(FOLLOW_delim_in_synpred160_pol4392);
        delim();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred160_pol

    // $ANTLR start synpred163_pol
    public final void synpred163_pol_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:719:9: ( typeName IDENT '=' expr )
        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:719:9: typeName IDENT '=' expr
        {
        pushFollow(FOLLOW_typeName_in_synpred163_pol4601);
        typeName();

        state._fsp--;
        if (state.failed) return ;

        match(input,IDENT,FOLLOW_IDENT_in_synpred163_pol4603); if (state.failed) return ;

        match(input,ASSIGN,FOLLOW_ASSIGN_in_synpred163_pol4605); if (state.failed) return ;

        pushFollow(FOLLOW_expr_in_synpred163_pol4607);
        expr();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred163_pol

    // $ANTLR start synpred168_pol
    public final void synpred168_pol_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:745:4: ( 'if' stmtIfBlock stmtsElif ( stmtElse )? )
        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:745:4: 'if' stmtIfBlock stmtsElif ( stmtElse )?
        {
        match(input,165,FOLLOW_165_in_synpred168_pol4872); if (state.failed) return ;

        pushFollow(FOLLOW_stmtIfBlock_in_synpred168_pol4874);
        stmtIfBlock();

        state._fsp--;
        if (state.failed) return ;

        pushFollow(FOLLOW_stmtsElif_in_synpred168_pol4876);
        stmtsElif();

        state._fsp--;
        if (state.failed) return ;

        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:745:31: ( stmtElse )?
        int alt135=2;
        int LA135_0 = input.LA(1);

        if ( (LA135_0==155) ) {
            alt135=1;
        }
        switch (alt135) {
            case 1 :
                // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:745:31: stmtElse
                {
                pushFollow(FOLLOW_stmtElse_in_synpred168_pol4878);
                stmtElse();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        }

    }
    // $ANTLR end synpred168_pol

    // $ANTLR start synpred169_pol
    public final void synpred169_pol_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:746:4: ( 'if' stmtIfBlock stmtElse )
        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:746:4: 'if' stmtIfBlock stmtElse
        {
        match(input,165,FOLLOW_165_in_synpred169_pol4897); if (state.failed) return ;

        pushFollow(FOLLOW_stmtIfBlock_in_synpred169_pol4899);
        stmtIfBlock();

        state._fsp--;
        if (state.failed) return ;

        pushFollow(FOLLOW_stmtElse_in_synpred169_pol4901);
        stmtElse();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred169_pol

    // $ANTLR start synpred176_pol
    public final void synpred176_pol_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:786:4: ( typeName IDENT ( ASSIGN expr )? ',' )
        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:786:5: typeName IDENT ( ASSIGN expr )? ','
        {
        pushFollow(FOLLOW_typeName_in_synpred176_pol5153);
        typeName();

        state._fsp--;
        if (state.failed) return ;

        match(input,IDENT,FOLLOW_IDENT_in_synpred176_pol5155); if (state.failed) return ;

        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:786:20: ( ASSIGN expr )?
        int alt136=2;
        int LA136_0 = input.LA(1);

        if ( (LA136_0==ASSIGN) ) {
            alt136=1;
        }
        switch (alt136) {
            case 1 :
                // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:786:21: ASSIGN expr
                {
                match(input,ASSIGN,FOLLOW_ASSIGN_in_synpred176_pol5158); if (state.failed) return ;

                pushFollow(FOLLOW_expr_in_synpred176_pol5160);
                expr();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        match(input,129,FOLLOW_129_in_synpred176_pol5164); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred176_pol

    // $ANTLR start synpred177_pol
    public final void synpred177_pol_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:787:5: ( typeName IDENT '[' )
        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:787:6: typeName IDENT '['
        {
        pushFollow(FOLLOW_typeName_in_synpred177_pol5177);
        typeName();

        state._fsp--;
        if (state.failed) return ;

        match(input,IDENT,FOLLOW_IDENT_in_synpred177_pol5179); if (state.failed) return ;

        match(input,139,FOLLOW_139_in_synpred177_pol5181); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred177_pol

    // $ANTLR start synpred178_pol
    public final void synpred178_pol_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:788:5: ( typeName '(' )
        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:788:6: typeName '('
        {
        pushFollow(FOLLOW_typeName_in_synpred178_pol5194);
        typeName();

        state._fsp--;
        if (state.failed) return ;

        match(input,126,FOLLOW_126_in_synpred178_pol5196); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred178_pol

    // $ANTLR start synpred179_pol
    public final void synpred179_pol_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:789:6: ( typeName varInit )
        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:789:7: typeName varInit
        {
        pushFollow(FOLLOW_typeName_in_synpred179_pol5211);
        typeName();

        state._fsp--;
        if (state.failed) return ;

        pushFollow(FOLLOW_varInit_in_synpred179_pol5213);
        varInit();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred179_pol

    // $ANTLR start synpred183_pol
    public final void synpred183_pol_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:811:5: ( '[' varDim ']' )
        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:811:5: '[' varDim ']'
        {
        match(input,139,FOLLOW_139_in_synpred183_pol5399); if (state.failed) return ;

        pushFollow(FOLLOW_varDim_in_synpred183_pol5401);
        varDim();

        state._fsp--;
        if (state.failed) return ;

        match(input,140,FOLLOW_140_in_synpred183_pol5403); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred183_pol

    // $ANTLR start synpred187_pol
    public final void synpred187_pol_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:822:17: ( ',' initializer )
        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:822:17: ',' initializer
        {
        match(input,129,FOLLOW_129_in_synpred187_pol5477); if (state.failed) return ;

        pushFollow(FOLLOW_initializer_in_synpred187_pol5479);
        initializer();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred187_pol

    // $ANTLR start synpred188_pol
    public final void synpred188_pol_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:829:4: ( typeName varDeclList )
        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:829:4: typeName varDeclList
        {
        pushFollow(FOLLOW_typeName_in_synpred188_pol5508);
        typeName();

        state._fsp--;
        if (state.failed) return ;

        pushFollow(FOLLOW_varDeclList_in_synpred188_pol5513);
        varDeclList();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred188_pol

    // $ANTLR start synpred189_pol
    public final void synpred189_pol_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:830:13: ( ',' varInit )
        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:830:13: ',' varInit
        {
        match(input,129,FOLLOW_129_in_synpred189_pol5521); if (state.failed) return ;

        pushFollow(FOLLOW_varInit_in_synpred189_pol5524);
        varInit();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred189_pol

    // $ANTLR start synpred199_pol
    public final void synpred199_pol_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:851:16: ( qualNameList )
        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:851:16: qualNameList
        {
        pushFollow(FOLLOW_qualNameList_in_synpred199_pol5688);
        qualNameList();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred199_pol

    // $ANTLR start synpred200_pol
    public final void synpred200_pol_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:855:6: ( '.' IDENT )
        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:855:6: '.' IDENT
        {
        match(input,130,FOLLOW_130_in_synpred200_pol5720); if (state.failed) return ;

        match(input,IDENT,FOLLOW_IDENT_in_synpred200_pol5735); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred200_pol

    // $ANTLR start synpred212_pol
    public final void synpred212_pol_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:904:11: ( NL )
        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:904:11: NL
        {
        match(input,NL,FOLLOW_NL_in_synpred212_pol6196); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred212_pol

    // $ANTLR start synpred213_pol
    public final void synpred213_pol_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:910:12: ( NL )
        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:910:12: NL
        {
        match(input,NL,FOLLOW_NL_in_synpred213_pol6239); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred213_pol

    // $ANTLR start synpred215_pol
    public final void synpred215_pol_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:911:5: ( NL )
        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:911:5: NL
        {
        match(input,NL,FOLLOW_NL_in_synpred215_pol6250); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred215_pol

    // $ANTLR start synpred216_pol
    public final void synpred216_pol_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:911:4: ( ( NL )+ )
        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:911:4: ( NL )+
        {
        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:911:4: ( NL )+
        int cnt140=0;
        loop140:
        do {
            int alt140=2;
            int LA140_0 = input.LA(1);

            if ( (LA140_0==NL) ) {
                alt140=1;
            }


            switch (alt140) {
        	case 1 :
        	    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:911:5: NL
        	    {
        	    match(input,NL,FOLLOW_NL_in_synpred216_pol6250); if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    if ( cnt140 >= 1 ) break loop140;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(140, input);
                    throw eee;
            }
            cnt140++;
        } while (true);


        }

    }
    // $ANTLR end synpred216_pol

    // $ANTLR start synpred218_pol
    public final void synpred218_pol_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:912:4: ( ( NL )* '}' )
        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:912:5: ( NL )* '}'
        {
        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:912:5: ( NL )*
        loop141:
        do {
            int alt141=2;
            int LA141_0 = input.LA(1);

            if ( (LA141_0==NL) ) {
                alt141=1;
            }


            switch (alt141) {
        	case 1 :
        	    // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:912:6: NL
        	    {
        	    match(input,NL,FOLLOW_NL_in_synpred218_pol6262); if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop141;
            }
        } while (true);


        match(input,196,FOLLOW_196_in_synpred218_pol6266); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred218_pol

    // $ANTLR start synpred219_pol
    public final void synpred219_pol_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:912:20: ( NL )
        // /home/lucidbee/Documents/Grammar_Sample/pol.tst/AntlrWorksWorkspace/pol.g:912:20: NL
        {
        match(input,NL,FOLLOW_NL_in_synpred219_pol6272); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred219_pol

    // Delegated rules

    public final boolean synpred179_pol() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred179_pol_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred43_pol() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred43_pol_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred133_pol() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred133_pol_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred11_pol() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred11_pol_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred16_pol() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred16_pol_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred112_pol() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred112_pol_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred138_pol() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred138_pol_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred89_pol() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred89_pol_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred183_pol() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred183_pol_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred53_pol() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred53_pol_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred20_pol() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred20_pol_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred84_pol() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred84_pol_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred54_pol() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred54_pol_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred215_pol() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred215_pol_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred80_pol() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred80_pol_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred9_pol() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_pol_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred85_pol() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred85_pol_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred55_pol() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred55_pol_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_pol() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_pol_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred126_pol() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred126_pol_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred57_pol() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred57_pol_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred137_pol() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred137_pol_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred61_pol() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred61_pol_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred200_pol() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred200_pol_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred176_pol() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred176_pol_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred122_pol() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred122_pol_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred219_pol() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred219_pol_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred189_pol() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred189_pol_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred32_pol() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred32_pol_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred113_pol() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred113_pol_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred91_pol() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred91_pol_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred120_pol() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred120_pol_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred212_pol() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred212_pol_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred81_pol() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred81_pol_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred86_pol() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred86_pol_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred154_pol() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred154_pol_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred199_pol() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred199_pol_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred15_pol() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred15_pol_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred178_pol() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred178_pol_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred155_pol() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred155_pol_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred169_pol() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred169_pol_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred160_pol() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred160_pol_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred218_pol() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred218_pol_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred124_pol() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred124_pol_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred22_pol() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred22_pol_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred101_pol() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred101_pol_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred127_pol() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred127_pol_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred168_pol() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred168_pol_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred188_pol() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred188_pol_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred123_pol() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred123_pol_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred163_pol() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred163_pol_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred216_pol() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred216_pol_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred49_pol() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred49_pol_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred34_pol() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred34_pol_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred88_pol() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred88_pol_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred132_pol() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred132_pol_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred100_pol() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred100_pol_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred152_pol() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred152_pol_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred136_pol() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred136_pol_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred90_pol() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred90_pol_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred131_pol() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred131_pol_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred111_pol() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred111_pol_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred92_pol() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred92_pol_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred52_pol() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred52_pol_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred140_pol() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred140_pol_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred51_pol() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred51_pol_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred213_pol() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred213_pol_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred87_pol() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred87_pol_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred153_pol() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred153_pol_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_pol() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_pol_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred21_pol() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred21_pol_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred129_pol() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred129_pol_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred30_pol() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred30_pol_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred115_pol() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred115_pol_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred83_pol() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred83_pol_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred177_pol() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred177_pol_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred187_pol() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred187_pol_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred82_pol() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred82_pol_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred128_pol() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred128_pol_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred125_pol() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred125_pol_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_NL_in_unit667 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080040L,0x0014608810300000L});
    public static final BitSet FOLLOW_unitPackage_in_unit671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtPackage_in_unitPackage697 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L,0x0010608810300000L});
    public static final BitSet FOLLOW_importList_in_unitPackage703 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L,0x0010600010300000L});
    public static final BitSet FOLLOW_stmtInjection_in_unitPackage712 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L,0x0010600010300000L});
    public static final BitSet FOLLOW_unitTypeDefinition_in_unitPackage723 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_stmtInjection_in_unitPackage734 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_unitPackage744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_178_in_stmtPackage754 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_qualName_in_stmtPackage756 = new BitSet(new long[]{0x0000000000000000L,0x0000000008080000L});
    public static final BitSet FOLLOW_delim_in_stmtPackage758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_158_in_stmtExport790 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_qualName_in_stmtExport793 = new BitSet(new long[]{0x0000000000000000L,0x0000000008080000L});
    public static final BitSet FOLLOW_delim_in_stmtExport795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtExport_in_exportList813 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_148_in_classDefinition849 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_classDef_in_classDefinition851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_classDef870 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L,0x0000004000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_implementsClause_in_classDef881 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_braceOpen_in_classDef888 = new BitSet(new long[]{0x0000000000000000L,0x4000000000080042L,0xF1408E1010550000L,0x0000000000000010L});
    public static final BitSet FOLLOW_classFeature_in_classDef891 = new BitSet(new long[]{0x0000000000000000L,0x4000000000080042L,0xF1408E1010550000L,0x0000000000000010L});
    public static final BitSet FOLLOW_braceClose_in_classDef895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fcnDefinition_in_classFeature912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumDefinition_in_classFeature923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDeclaration_in_classFeature933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classDefinition_in_classFeature943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtInjection_in_classFeature953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_174_in_moduleDefinition970 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_moduleDefinition972 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L,0x0000004000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_implementsClause_in_moduleDefinition987 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_braceOpen_in_moduleDefinition996 = new BitSet(new long[]{0x0000000000000000L,0x4000000000080042L,0xF1408E1010550000L,0x0000000000000010L});
    public static final BitSet FOLLOW_moduleFeature_in_moduleDefinition999 = new BitSet(new long[]{0x0000000000000000L,0x4000000000080042L,0xF1408E1010550000L,0x0000000000000010L});
    public static final BitSet FOLLOW_braceClose_in_moduleDefinition1003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fcnDefinition_in_moduleFeature1035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDeclaration_in_moduleFeature1044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumDefinition_in_moduleFeature1051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classDefinition_in_moduleFeature1058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtInjection_in_moduleFeature1064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_156_in_enumDefinition1077 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_enumDef_in_enumDefinition1079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_enumDef1106 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_braceOpen_in_enumDef1114 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_enumList_in_enumDef1116 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_braceClose_in_enumDef1118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumElement_in_enumList1143 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_129_in_enumList1146 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_enumElement_in_enumList1148 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_enumElement1169 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ASSIGN_in_enumElement1171 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_INT_LIT_in_enumElement1173 = new BitSet(new long[]{0x0000000000000000L,0x0000000008080000L});
    public static final BitSet FOLLOW_delim_in_enumElement1176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_enumElement1195 = new BitSet(new long[]{0x0000000000000000L,0x0000000008080000L});
    public static final BitSet FOLLOW_delim_in_enumElement1198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_180_in_protocolDefinition1218 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_protocolDefinition1220 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L,0x0000000080000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_extendsClause_in_protocolDefinition1228 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_braceOpen_in_protocolDefinition1234 = new BitSet(new long[]{0x0000000000000000L,0x4000000000080042L,0x71400E1010050000L,0x0000000000000010L});
    public static final BitSet FOLLOW_protocolFeature_in_protocolDefinition1237 = new BitSet(new long[]{0x0000000000000000L,0x4000000000080042L,0x71400E1010050000L,0x0000000000000010L});
    public static final BitSet FOLLOW_braceClose_in_protocolDefinition1241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumDefinition_in_protocolFeature1275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fcnDeclaration_in_protocolFeature1285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtInjection_in_protocolFeature1296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_149_in_compositionDefinition1309 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_compositionDefinition1311 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L,0x0000000080000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_extendsClause_in_compositionDefinition1319 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_braceOpen_in_compositionDefinition1326 = new BitSet(new long[]{0x0000000000000000L,0x4000000000080042L,0xF1408E1050450000L,0x0000000000000010L});
    public static final BitSet FOLLOW_compositionFeature_in_compositionDefinition1329 = new BitSet(new long[]{0x0000000000000000L,0x4000000000080042L,0xF1408E1050450000L,0x0000000000000010L});
    public static final BitSet FOLLOW_braceClose_in_compositionDefinition1333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exportList_in_compositionFeature1363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fcnDefinitionHost_in_compositionFeature1372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumDefinition_in_compositionFeature1380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDeclaration_in_compositionFeature1388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtInjection_in_compositionFeature1395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_importFrom_in_stmtImport1412 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_167_in_stmtImport1422 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_qualName_in_stmtImport1424 = new BitSet(new long[]{0x0000000000000000L,0x0000000008080000L,0x0000000000004000L,0x0000000000000002L});
    public static final BitSet FOLLOW_metaArguments_in_stmtImport1427 = new BitSet(new long[]{0x0000000000000000L,0x0000000008080000L,0x0000000000004000L});
    public static final BitSet FOLLOW_importAs_in_stmtImport1440 = new BitSet(new long[]{0x0000000000000000L,0x0000000008080000L});
    public static final BitSet FOLLOW_delim_in_stmtImport1443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_163_in_importFrom1479 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_qualName_in_importFrom1481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_142_in_importAs1509 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_qualName_in_importAs1511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtImport_in_importList1537 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000008800000000L});
    public static final BitSet FOLLOW_stmtImport_in_importList1540 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000008800000000L});
    public static final BitSet FOLLOW_173_in_meta1578 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_braceOpen_in_meta1587 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x79000E0000050000L});
    public static final BitSet FOLLOW_metaFormalParameters_in_meta1589 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_braceClose_in_meta1591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_metaFormalParameter_in_metaFormalParameters1616 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_129_in_metaFormalParameters1620 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x79000E0000050000L});
    public static final BitSet FOLLOW_metaFormalParameter_in_metaFormalParameters1622 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_metaFormalParameterType_in_metaFormalParameter1645 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_metaFormalParameter1647 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ASSIGN_in_metaFormalParameter1650 = new BitSet(new long[]{0x4000000000000800L,0x0000000022400082L,0x75000E0100050000L});
    public static final BitSet FOLLOW_metaArgument_in_metaFormalParameter1652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_187_in_metaFormalParameterType1681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_builtinType_in_metaFormalParameterType1688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_193_in_metaArguments1701 = new BitSet(new long[]{0x4000000000000800L,0x0000000022400082L,0x75000E0100050000L});
    public static final BitSet FOLLOW_metaArgument_in_metaArguments1703 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_129_in_metaArguments1707 = new BitSet(new long[]{0x4000000000000800L,0x0000000022400082L,0x75000E0100050000L});
    public static final BitSet FOLLOW_metaArgument_in_metaArguments1709 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_196_in_metaArguments1713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_193_in_metaArguments1729 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_196_in_metaArguments1731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numLit_in_metaArgument1760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolLit_in_metaArgument1766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_metaArgument1772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_in_metaArgument1778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeNameScalar_in_metaArgument1783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeNameScalar_in_typeName1797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_builtinType_in_typeNameScalar1811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_userTypeName_in_typeNameScalar1816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qualName_in_userTypeName1826 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_metaArguments_in_userTypeName1828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qualName_in_userTypeName1843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_meta_in_unitTypeDefinition1876 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0010400010300000L});
    public static final BitSet FOLLOW_moduleDefinition_in_unitTypeDefinition1898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classDefinition_in_unitTypeDefinition1919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_protocolDefinition_in_unitTypeDefinition1936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compositionDefinition_in_unitTypeDefinition1954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumDefinition_in_unitTypeDefinition1972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_159_in_extendsClause1997 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_extendsClause2000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_166_in_implementsClause2019 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_implementsClause2022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NL_in_braceClose2042 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_196_in_braceClose2047 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_NL_in_braceClose2051 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_NL_in_braceCloseAtEOF2075 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_196_in_braceCloseAtEOF2080 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_NL_in_braceCloseAtEOF2084 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_NL_in_braceOpen2109 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_193_in_braceOpen2114 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_NL_in_braceOpen2118 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_LOG_NOT_in_logicalNotOp2295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BIT_NOT_in_bitwiseNotOp2306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_exprList2317 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_129_in_exprList2320 = new BitSet(new long[]{0x4000000000002C00L,0x40000000224022E2L,0x0401800100000C00L});
    public static final BitSet FOLLOW_expr_in_exprList2322 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_exprLogicalOr_in_expr2353 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_137_in_expr2355 = new BitSet(new long[]{0x4000000000002C00L,0x40000000224022E2L,0x0401800100000C00L});
    public static final BitSet FOLLOW_expr_in_expr2357 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_132_in_expr2359 = new BitSet(new long[]{0x4000000000002C00L,0x40000000224022E2L,0x0401800100000C00L});
    public static final BitSet FOLLOW_expr_in_expr2361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exprLogicalOr_in_expr2378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exprLogicalAnd_in_exprLogicalOr2396 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_195_in_exprLogicalOr2410 = new BitSet(new long[]{0x4000000000002C00L,0x40000000224022E2L,0x0401800100000C00L});
    public static final BitSet FOLLOW_exprLogicalAnd_in_exprLogicalOr2412 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_exprBitwiseOr_in_exprLogicalAnd2445 = new BitSet(new long[]{0x0000000000000002L,0x1000000000000000L});
    public static final BitSet FOLLOW_124_in_exprLogicalAnd2457 = new BitSet(new long[]{0x4000000000002C00L,0x40000000224022E2L,0x0401800100000C00L});
    public static final BitSet FOLLOW_exprBitwiseOr_in_exprLogicalAnd2459 = new BitSet(new long[]{0x0000000000000002L,0x1000000000000000L});
    public static final BitSet FOLLOW_exprBitwiseXor_in_exprBitwiseOr2490 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_194_in_exprBitwiseOr2502 = new BitSet(new long[]{0x4000000000002C00L,0x40000000224022E2L,0x0401800100000C00L});
    public static final BitSet FOLLOW_exprBitwiseXor_in_exprBitwiseOr2504 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_exprBitwiseAnd_in_exprBitwiseXor2534 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_141_in_exprBitwiseXor2546 = new BitSet(new long[]{0x4000000000002C00L,0x40000000224022E2L,0x0401800100000C00L});
    public static final BitSet FOLLOW_exprBitwiseAnd_in_exprBitwiseXor2548 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_exprEquality_in_exprBitwiseAnd2578 = new BitSet(new long[]{0x0000000000000002L,0x2000000000000000L});
    public static final BitSet FOLLOW_125_in_exprBitwiseAnd2590 = new BitSet(new long[]{0x4000000000002C00L,0x40000000224022E2L,0x0401800100000C00L});
    public static final BitSet FOLLOW_exprEquality_in_exprBitwiseAnd2592 = new BitSet(new long[]{0x0000000000000002L,0x2000000000000000L});
    public static final BitSet FOLLOW_exprRelational_in_exprEquality2622 = new BitSet(new long[]{0x0000008000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_equalityOp_in_exprEquality2635 = new BitSet(new long[]{0x4000000000002C00L,0x40000000224022E2L,0x0401800100000C00L});
    public static final BitSet FOLLOW_exprRelational_in_exprEquality2637 = new BitSet(new long[]{0x0000008000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_exprShift_in_exprRelational2667 = new BitSet(new long[]{0x1000000000000002L,0x0000000000000800L,0x00000000000000A0L});
    public static final BitSet FOLLOW_relationalOp_in_exprRelational2680 = new BitSet(new long[]{0x4000000000002C00L,0x40000000224022E2L,0x0401800100000C00L});
    public static final BitSet FOLLOW_exprShift_in_exprRelational2682 = new BitSet(new long[]{0x1000000000000002L,0x0000000000000800L,0x00000000000000A0L});
    public static final BitSet FOLLOW_exprAddSub_in_exprShift2713 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000140L});
    public static final BitSet FOLLOW_shiftOp_in_exprShift2726 = new BitSet(new long[]{0x4000000000002C00L,0x40000000224022E2L,0x0401800100000C00L});
    public static final BitSet FOLLOW_exprAddSub_in_exprShift2729 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000140L});
    public static final BitSet FOLLOW_exprMultDiv_in_exprAddSub2760 = new BitSet(new long[]{0x0000000000000002L,0x0000000000802000L});
    public static final BitSet FOLLOW_addSubOp_in_exprAddSub2772 = new BitSet(new long[]{0x4000000000002C00L,0x40000000224022E2L,0x0401800100000C00L});
    public static final BitSet FOLLOW_exprMultDiv_in_exprAddSub2774 = new BitSet(new long[]{0x0000000000000002L,0x0000000000802000L});
    public static final BitSet FOLLOW_exprUnary_in_exprMultDiv2807 = new BitSet(new long[]{0x0000000000000002L,0x0800000000000000L,0x0000000000000009L});
    public static final BitSet FOLLOW_multDivModOp_in_exprMultDiv2819 = new BitSet(new long[]{0x4000000000002C00L,0x40000000224022E2L,0x0401800100000C00L});
    public static final BitSet FOLLOW_exprUnary_in_exprMultDiv2821 = new BitSet(new long[]{0x0000000000000002L,0x0800000000000000L,0x0000000000000009L});
    public static final BitSet FOLLOW_175_in_exprNew2850 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L,0x71000E0000050000L});
    public static final BitSet FOLLOW_typeName_in_exprNew2852 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_fcnArgumentList_in_exprNew2854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitiveLit_in_exprUnary2874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_injectionCode_in_exprUnary2879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayLit_in_exprUnary2884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicalNotOp_in_exprUnary2902 = new BitSet(new long[]{0x4000000000002C00L,0x40000000224022E2L,0x0401800100000C00L});
    public static final BitSet FOLLOW_expr_in_exprUnary2904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bitwiseNotOp_in_exprUnary2922 = new BitSet(new long[]{0x4000000000002C00L,0x40000000224022E2L,0x0401800100000C00L});
    public static final BitSet FOLLOW_expr_in_exprUnary2924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_126_in_exprUnary2942 = new BitSet(new long[]{0x4000000000002C00L,0x40000000224022E2L,0x0401800100000C00L});
    public static final BitSet FOLLOW_expr_in_exprUnary2944 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_127_in_exprUnary2946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_exprUnary2962 = new BitSet(new long[]{0x4000000000002C00L,0x40000000224022E2L,0x0401800100000C00L});
    public static final BitSet FOLLOW_expr_in_exprUnary2964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varOrFcnOrArray_in_exprUnary2983 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000020L});
    public static final BitSet FOLLOW_incDecOp_in_exprUnary2985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varOrFcnOrArray_in_exprUnary3000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_incDecOp_in_exprUnary3005 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L,0x0000800000000400L});
    public static final BitSet FOLLOW_varOrFcnOrArray_in_exprUnary3007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exprNew_in_exprUnary3022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_182_in_fcnDefinition3042 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000002L,0x71000E1000050000L});
    public static final BitSet FOLLOW_164_in_fcnDefinition3053 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000002L,0x71000E0000050000L});
    public static final BitSet FOLLOW_fcnType_fcnName_in_fcnDefinition3063 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_fcnFormalParameterList_in_fcnDefinition3065 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_fcnBody_in_fcnDefinition3067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_182_in_fcnDefinitionHost3103 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000002L,0x71000E1000050000L});
    public static final BitSet FOLLOW_164_in_fcnDefinitionHost3108 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000002L,0x71000E0000050000L});
    public static final BitSet FOLLOW_fcnType_fcnName_in_fcnDefinitionHost3119 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_fcnFormalParameterList_in_fcnDefinitionHost3122 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_fcnBody_in_fcnDefinitionHost3124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_182_in_fcnAttr3161 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_164_in_fcnAttr3172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_braceOpen_in_fcnBody3188 = new BitSet(new long[]{0x4000000000002C00L,0x40000000224822E2L,0xF7A98E3702C78C00L,0x0000000000000011L});
    public static final BitSet FOLLOW_stmts_in_fcnBody3191 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_braceClose_in_fcnBody3195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_182_in_fcnDeclaration3227 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000002L,0x71000E1000050000L});
    public static final BitSet FOLLOW_164_in_fcnDeclaration3238 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000002L,0x71000E0000050000L});
    public static final BitSet FOLLOW_fcnType_fcnName_in_fcnDeclaration3248 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_fcnFormalParameterList_in_fcnDeclaration3251 = new BitSet(new long[]{0x0000000000000000L,0x0000000008080000L});
    public static final BitSet FOLLOW_delim_in_fcnDeclaration3254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeName_in_fcnType_fcnName3281 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_qualName_in_fcnType_fcnName3283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeName_in_fcnType_fcnName3317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qualName_in_fcnType_fcnName3350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fcnTypes_fcnName_in_fcnType_fcnName3405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_126_in_fcnTypes_fcnName3416 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L,0x71000E0000050000L});
    public static final BitSet FOLLOW_fcnTypes_in_fcnTypes_fcnName3418 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_127_in_fcnTypes_fcnName3420 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_qualName_in_fcnTypes_fcnName3422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeName_in_fcnTypes3443 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_129_in_fcnTypes3446 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L,0x71000E0000050000L});
    public static final BitSet FOLLOW_typeName_in_fcnTypes3448 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_126_in_fcnFormalParameterList3469 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000002L,0x71000E0000050000L});
    public static final BitSet FOLLOW_fcnFormalParameters_in_fcnFormalParameterList3471 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_127_in_fcnFormalParameterList3473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fcnFormalParameter_in_fcnFormalParameters3487 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_129_in_fcnFormalParameters3490 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L,0x71000E0000050000L});
    public static final BitSet FOLLOW_fcnFormalParameter_in_fcnFormalParameters3492 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_typeName_in_fcnFormalParameter3527 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_fcnFormalParameter3529 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ASSIGN_in_fcnFormalParameter3533 = new BitSet(new long[]{0x4000000000002C00L,0x40000000224022E2L,0x0401800100000C00L});
    public static final BitSet FOLLOW_expr_in_fcnFormalParameter3535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_126_in_fcnArgumentList3566 = new BitSet(new long[]{0x4000000000002C00L,0x40000000224022E2L,0x0401800100000C00L});
    public static final BitSet FOLLOW_fcnArguments_in_fcnArgumentList3568 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_127_in_fcnArgumentList3570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exprList_in_fcnArguments3584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_175_in_varOrFcnOrArray3600 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L,0x71000E0000050000L});
    public static final BitSet FOLLOW_typeName_in_varOrFcnOrArray3602 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_fcnArgumentList_in_varOrFcnOrArray3604 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000804L});
    public static final BitSet FOLLOW_fieldOrArrayAccess_in_varOrFcnOrArray3606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_138_in_varOrFcnOrArray3647 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_varOrFcnOrArray3649 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_fcnArgumentList_in_varOrFcnOrArray3651 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000804L});
    public static final BitSet FOLLOW_fieldOrArrayAccess_in_varOrFcnOrArray3653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_138_in_varOrFcnOrArray3722 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_varOrFcnOrArray3728 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000804L});
    public static final BitSet FOLLOW_fieldOrArrayAccess_in_varOrFcnOrArray3730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_138_in_varOrFcnOrArray3778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qualName_in_varOrFcnOrArray3811 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_fcnArgumentList_in_varOrFcnOrArray3813 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000804L});
    public static final BitSet FOLLOW_fieldOrArrayAccess_in_varOrFcnOrArray3815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qualName_in_varOrFcnOrArray3856 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000804L});
    public static final BitSet FOLLOW_fieldOrArrayAccess_in_varOrFcnOrArray3858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fieldAccess_in_fieldOrArrayAccess3872 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000804L});
    public static final BitSet FOLLOW_arrayAccess_in_fieldOrArrayAccess3876 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000804L});
    public static final BitSet FOLLOW_130_in_fieldAccess3898 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_fieldAccess3904 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_fcnArgumentList_in_fieldAccess3906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_130_in_fieldAccess3932 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_fieldAccess3938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_139_in_arrayAccess3959 = new BitSet(new long[]{0x4000000000002C00L,0x40000000224022E2L,0x0401800100001C00L});
    public static final BitSet FOLLOW_exprList_in_arrayAccess3962 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_140_in_arrayAccess3966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_braceOpen_in_stmtBlock3986 = new BitSet(new long[]{0x4000000000002C00L,0x40000000224822E2L,0xF7A98E3702C78C00L,0x0000000000000011L});
    public static final BitSet FOLLOW_stmts_in_stmtBlock3988 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_braceClose_in_stmtBlock3990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmt_in_stmts4010 = new BitSet(new long[]{0x4000000000002C02L,0x40000000224022E2L,0xF7A98E3702C78C00L,0x0000000000000001L});
    public static final BitSet FOLLOW_NL_in_stmts4028 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_varDeclaration_in_stmt4045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtAssign_in_stmt4051 = new BitSet(new long[]{0x0000000000000000L,0x0000000008080000L});
    public static final BitSet FOLLOW_delim_in_stmt4053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtAssert_in_stmt4060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtBind_in_stmt4065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtPrint_in_stmt4070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtReturn_in_stmt4075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtBreak_in_stmt4080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtContinue_in_stmt4086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtForEach_in_stmt4092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtFor_in_stmt4098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtSwitch_in_stmt4103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtDoWhile_in_stmt4109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtIf_in_stmt4114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtProvided_in_stmt4119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtWhile_in_stmt4124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtInjection_in_stmt4130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_stmt4135 = new BitSet(new long[]{0x0000000000000000L,0x0000000008080000L});
    public static final BitSet FOLLOW_delim_in_stmt4137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varOrFcnOrArray_in_stmtAssign4147 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ASSIGN_in_stmtAssign4149 = new BitSet(new long[]{0x4000000000002C00L,0x40000000224022E2L,0x0401800100000C00L});
    public static final BitSet FOLLOW_expr_in_stmtAssign4151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_injectionCode_in_stmtAssign4175 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ASSIGN_in_stmtAssign4177 = new BitSet(new long[]{0x4000000000002C00L,0x40000000224022E2L,0x0401800100000C00L});
    public static final BitSet FOLLOW_expr_in_stmtAssign4179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varOrFcnOrArray_in_stmtAssign4204 = new BitSet(new long[]{0x0000000000008390L,0x0000000044030400L});
    public static final BitSet FOLLOW_assignOp_in_stmtAssign4206 = new BitSet(new long[]{0x4000000000002C00L,0x40000000224022E2L,0x0401800100000C00L});
    public static final BitSet FOLLOW_expr_in_stmtAssign4208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_injectionCode_in_stmtAssign4233 = new BitSet(new long[]{0x0000000000008390L,0x0000000044030400L});
    public static final BitSet FOLLOW_assignOp_in_stmtAssign4235 = new BitSet(new long[]{0x4000000000002C00L,0x40000000224022E2L,0x0401800100000C00L});
    public static final BitSet FOLLOW_expr_in_stmtAssign4237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_143_in_stmtAssert4266 = new BitSet(new long[]{0x4000000000002C00L,0x400000002A4822E2L,0x0401800100000C00L});
    public static final BitSet FOLLOW_exprList_in_stmtAssert4268 = new BitSet(new long[]{0x0000000000000000L,0x0000000008080000L});
    public static final BitSet FOLLOW_delim_in_stmtAssert4270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varOrFcnOrArray_in_stmtBind4288 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_BIND_in_stmtBind4290 = new BitSet(new long[]{0x4000000000002C00L,0x40000000224022E2L,0x0401800100000C00L});
    public static final BitSet FOLLOW_expr_in_stmtBind4293 = new BitSet(new long[]{0x0000000000000000L,0x0000000008080000L});
    public static final BitSet FOLLOW_delim_in_stmtBind4296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_179_in_stmtPrint4318 = new BitSet(new long[]{0x4000000000002C00L,0x40000000224022E2L,0x0403900120000C00L});
    public static final BitSet FOLLOW_stmtPrintTarget_in_stmtPrint4321 = new BitSet(new long[]{0x4000000000002C00L,0x40000000224022E2L,0x0401800100000C00L});
    public static final BitSet FOLLOW_exprList_in_stmtPrint4325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_183_in_stmtReturn4371 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_126_in_stmtReturn4374 = new BitSet(new long[]{0x4000000000002C00L,0x40000000224022E2L,0x0401800100000C00L});
    public static final BitSet FOLLOW_expr_in_stmtReturn4378 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_129_in_stmtReturn4381 = new BitSet(new long[]{0x4000000000002C00L,0x40000000224022E2L,0x0401800100000C00L});
    public static final BitSet FOLLOW_expr_in_stmtReturn4383 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_127_in_stmtReturn4389 = new BitSet(new long[]{0x0000000000000000L,0x0000000008080000L});
    public static final BitSet FOLLOW_delim_in_stmtReturn4392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_183_in_stmtReturn4406 = new BitSet(new long[]{0x4000000000002C00L,0x40000000224022E2L,0x0401800100000C00L});
    public static final BitSet FOLLOW_expr_in_stmtReturn4410 = new BitSet(new long[]{0x0000000000000000L,0x0000000008080000L});
    public static final BitSet FOLLOW_delim_in_stmtReturn4414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_145_in_stmtBreak4432 = new BitSet(new long[]{0x0000000000000000L,0x0000000008080000L});
    public static final BitSet FOLLOW_delim_in_stmtBreak4434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_151_in_stmtContinue4450 = new BitSet(new long[]{0x0000000000000000L,0x0000000008080000L});
    public static final BitSet FOLLOW_delim_in_stmtContinue4452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_161_in_stmtFor4473 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_126_in_stmtFor4475 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000042L,0x71008E0000050400L});
    public static final BitSet FOLLOW_stmtForInit_in_stmtFor4477 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_SEMI_in_stmtFor4479 = new BitSet(new long[]{0x4000000000002C00L,0x400000002A4022E2L,0x0401800100000C00L});
    public static final BitSet FOLLOW_stmtForCond_in_stmtFor4481 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_SEMI_in_stmtFor4483 = new BitSet(new long[]{0x4000000000002C00L,0xC0000000224022E2L,0x0401800100000C00L});
    public static final BitSet FOLLOW_stmtForNext_in_stmtFor4485 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_127_in_stmtFor4487 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_stmtBlock_in_stmtFor4489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_stmtForCond4557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeName_in_stmtForInit4601 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_stmtForInit4603 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ASSIGN_in_stmtForInit4605 = new BitSet(new long[]{0x4000000000002C00L,0x40000000224022E2L,0x0401800100000C00L});
    public static final BitSet FOLLOW_expr_in_stmtForInit4607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtAssign_in_stmtForInit4644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_stmtForNext4687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_162_in_stmtForEach4700 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_126_in_stmtForEach4702 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_stmtForEach4704 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_168_in_stmtForEach4706 = new BitSet(new long[]{0x4000000000002C00L,0x40000000224022E2L,0x0401800100000C00L});
    public static final BitSet FOLLOW_expr_in_stmtForEach4708 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_127_in_stmtForEach4710 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_stmtBlock_in_stmtForEach4712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_185_in_stmtSwitch4738 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_126_in_stmtSwitch4740 = new BitSet(new long[]{0x4000000000002C00L,0x40000000224022E2L,0x0401800100000C00L});
    public static final BitSet FOLLOW_expr_in_stmtSwitch4742 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_127_in_stmtSwitch4744 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_braceOpen_in_stmtSwitch4746 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L,0x0000000001080000L,0x0000000000000010L});
    public static final BitSet FOLLOW_stmtsCase_in_stmtSwitch4748 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_braceClose_in_stmtSwitch4750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtCase_in_stmtsCase4774 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000001080000L});
    public static final BitSet FOLLOW_147_in_stmtCase4790 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_INT_LIT_in_stmtCase4793 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_132_in_stmtCase4796 = new BitSet(new long[]{0x4000000000002C00L,0x40000000224822E2L,0xF7A98E3702C78C00L,0x0000000000000001L});
    public static final BitSet FOLLOW_stmts_in_stmtCase4798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_152_in_stmtCase4813 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_132_in_stmtCase4815 = new BitSet(new long[]{0x4000000000002C00L,0x40000000224822E2L,0xF7A98E3702C78C00L,0x0000000000000001L});
    public static final BitSet FOLLOW_stmts_in_stmtCase4817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_153_in_stmtDoWhile4835 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_stmtBlock_in_stmtDoWhile4837 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_192_in_stmtDoWhile4839 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_126_in_stmtDoWhile4841 = new BitSet(new long[]{0x4000000000002C00L,0x40000000224022E2L,0x0401800100000C00L});
    public static final BitSet FOLLOW_expr_in_stmtDoWhile4843 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_127_in_stmtDoWhile4845 = new BitSet(new long[]{0x0000000000000000L,0x0000000008080000L});
    public static final BitSet FOLLOW_delim_in_stmtDoWhile4847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_165_in_stmtIf4872 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_stmtIfBlock_in_stmtIf4874 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_stmtsElif_in_stmtIf4876 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_stmtElse_in_stmtIf4878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_165_in_stmtIf4897 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_stmtIfBlock_in_stmtIf4899 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_stmtElse_in_stmtIf4901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_165_in_stmtIf4916 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_stmtIfBlock_in_stmtIf4918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_126_in_stmtIfBlock4936 = new BitSet(new long[]{0x4000000000002C00L,0x40000000224022E2L,0x0401800100000C00L});
    public static final BitSet FOLLOW_expr_in_stmtIfBlock4938 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_127_in_stmtIfBlock4940 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_stmtBlock_in_stmtIfBlock4942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtElif_in_stmtsElif4962 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_154_in_stmtElif4973 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_stmtIfBlock_in_stmtElif4975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_155_in_stmtElse4993 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_stmtBlock_in_stmtElse4995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_181_in_stmtProvided5013 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_126_in_stmtProvided5015 = new BitSet(new long[]{0x4000000000002C00L,0x40000000224022E2L,0x0401800100000C00L});
    public static final BitSet FOLLOW_expr_in_stmtProvided5017 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_127_in_stmtProvided5019 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_stmtBlock_in_stmtProvided5021 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_stmtElse_in_stmtProvided5024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_192_in_stmtWhile5051 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_126_in_stmtWhile5053 = new BitSet(new long[]{0x4000000000002C00L,0x40000000224022E2L,0x0401800100000C00L});
    public static final BitSet FOLLOW_expr_in_stmtWhile5055 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_127_in_stmtWhile5056 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_stmtBlock_in_stmtWhile5058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varAttr_in_varDeclaration5083 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L,0x71008E0000050000L});
    public static final BitSet FOLLOW_varDecl_in_varDeclaration5085 = new BitSet(new long[]{0x0000000000000000L,0x0000000008080000L});
    public static final BitSet FOLLOW_delim_in_varDeclaration5087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_150_in_varAttr5106 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x8000001000400000L});
    public static final BitSet FOLLOW_191_in_varAttr5115 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x8000001000400000L});
    public static final BitSet FOLLOW_164_in_varAttr5125 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x8000001000400000L});
    public static final BitSet FOLLOW_varDeclList_in_varDecl5169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varArray_in_varDecl5186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varFcnRef_in_varDecl5202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDeclList_in_varDecl5218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_175_in_varDecl5224 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L,0x71000E0000050000L});
    public static final BitSet FOLLOW_typeName_in_varDecl5226 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_varDecl5228 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_fcnArgumentList_in_varDecl5230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeName_in_varFcnRef5274 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_fcnRefTypeList_in_varFcnRef5276 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_varFcnRef5278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_126_in_fcnRefTypeList5303 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000002L,0x71000E0000050000L});
    public static final BitSet FOLLOW_fcnRefTypes_in_fcnRefTypeList5305 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_127_in_fcnRefTypeList5307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeName_in_fcnRefTypes5321 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_129_in_fcnRefTypes5324 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L,0x71000E0000050000L});
    public static final BitSet FOLLOW_typeName_in_fcnRefTypes5326 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_typeName_in_varArray5359 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_varArray5361 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_varArraySpec_in_varArray5363 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ASSIGN_in_varArray5366 = new BitSet(new long[]{0x4000000000002C00L,0x40000000224022E2L,0x0401800100000C00L,0x0000000000000002L});
    public static final BitSet FOLLOW_initializer_in_varArray5368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_139_in_varArraySpec5399 = new BitSet(new long[]{0x4000000000002C00L,0x40000000224022E2L,0x0401800100001C00L});
    public static final BitSet FOLLOW_varDim_in_varArraySpec5401 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_140_in_varArraySpec5403 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_expr_in_varDim5427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_initializer5447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_193_in_initializer5453 = new BitSet(new long[]{0x4000000000002C00L,0x40000000224022E2L,0x0401800100000C00L,0x0000000000000002L});
    public static final BitSet FOLLOW_initializer_list_in_initializer5455 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_129_in_initializer5457 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_196_in_initializer5460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_initializer_in_initializer_list5474 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_129_in_initializer_list5477 = new BitSet(new long[]{0x4000000000002C00L,0x40000000224022E2L,0x0401800100000C00L,0x0000000000000002L});
    public static final BitSet FOLLOW_initializer_in_initializer_list5479 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_typeName_in_varDeclList5508 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L,0x71000E0000050000L});
    public static final BitSet FOLLOW_varDeclList_in_varDeclList5513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varInit_in_varDeclList5518 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_129_in_varDeclList5521 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_varInit_in_varDeclList5524 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_varInit5542 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ASSIGN_in_varInit5545 = new BitSet(new long[]{0x4000000000002C00L,0x40000000224022E2L,0x0401800100000C00L});
    public static final BitSet FOLLOW_expr_in_varInit5547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_qualName5685 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_qualNameList_in_qualName5688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_130_in_qualNameList5720 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_qualNameList5735 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_139_in_arrayLit5764 = new BitSet(new long[]{0x4000000000000800L,0x0000000022400082L,0x0401000100001000L});
    public static final BitSet FOLLOW_arrayLitList_in_arrayLit5766 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_140_in_arrayLit5768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayLitElem_in_arrayLitList5786 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_129_in_arrayLitList5789 = new BitSet(new long[]{0x4000000000000800L,0x0000000022400082L,0x0401000100000000L});
    public static final BitSet FOLLOW_arrayLitElem_in_arrayLitList5791 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_primitiveLit_in_arrayLitElem5815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_namedConstant_in_arrayLitElem5819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qualName_in_namedConstant5829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_boolLit5848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_176_in_nullLit5882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_LIT_in_numLit5919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OCT_LIT_in_numLit5942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REAL_LIT_in_numLit5965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HEX_LIT_in_numLit5986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolLit_in_primitiveLit6032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numLit_in_primitiveLit6058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nullLit_in_primitiveLit6085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_primitiveLit6111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_in_primitiveLit6153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INJECT_in_stmtInjection6194 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_NL_in_stmtInjection6196 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_INJECT_in_injectionCode6215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMI_in_delim6235 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_NL_in_delim6239 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_NL_in_delim6250 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_NL_in_delim6272 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_stmtInjection_in_synpred2_pol712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtExport_in_synpred6_pol813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fcnDefinition_in_synpred9_pol912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDeclaration_in_synpred11_pol933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fcnDefinition_in_synpred15_pol1035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDeclaration_in_synpred16_pol1044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_delim_in_synpred20_pol1176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_synpred21_pol1169 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ASSIGN_in_synpred21_pol1171 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_INT_LIT_in_synpred21_pol1173 = new BitSet(new long[]{0x0000000000000000L,0x0000000008080000L});
    public static final BitSet FOLLOW_delim_in_synpred21_pol1176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_delim_in_synpred22_pol1198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fcnDefinitionHost_in_synpred30_pol1372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDeclaration_in_synpred32_pol1388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_importAs_in_synpred34_pol1440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_193_in_synpred43_pol1701 = new BitSet(new long[]{0x4000000000000800L,0x0000000022400082L,0x75000E0100050000L});
    public static final BitSet FOLLOW_metaArgument_in_synpred43_pol1703 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_129_in_synpred43_pol1707 = new BitSet(new long[]{0x4000000000000800L,0x0000000022400082L,0x75000E0100050000L});
    public static final BitSet FOLLOW_metaArgument_in_synpred43_pol1709 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_196_in_synpred43_pol1713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qualName_in_synpred49_pol1826 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_metaArguments_in_synpred49_pol1828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_174_in_synpred51_pol1893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_148_in_synpred52_pol1913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_180_in_synpred53_pol1931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_149_in_synpred54_pol1949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_156_in_synpred55_pol1967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NL_in_synpred57_pol2051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NL_in_synpred61_pol2118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_129_in_synpred80_pol2320 = new BitSet(new long[]{0x4000000000002C00L,0x40000000224022E2L,0x0401800100000C00L});
    public static final BitSet FOLLOW_expr_in_synpred80_pol2322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_synpred81_pol2317 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_129_in_synpred81_pol2320 = new BitSet(new long[]{0x4000000000002C00L,0x40000000224022E2L,0x0401800100000C00L});
    public static final BitSet FOLLOW_expr_in_synpred81_pol2322 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_exprLogicalOr_in_synpred82_pol2353 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_137_in_synpred82_pol2355 = new BitSet(new long[]{0x4000000000002C00L,0x40000000224022E2L,0x0401800100000C00L});
    public static final BitSet FOLLOW_expr_in_synpred82_pol2357 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_132_in_synpred82_pol2359 = new BitSet(new long[]{0x4000000000002C00L,0x40000000224022E2L,0x0401800100000C00L});
    public static final BitSet FOLLOW_expr_in_synpred82_pol2361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_195_in_synpred83_pol2410 = new BitSet(new long[]{0x4000000000002C00L,0x40000000224022E2L,0x0401800100000C00L});
    public static final BitSet FOLLOW_exprLogicalAnd_in_synpred83_pol2412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_124_in_synpred84_pol2457 = new BitSet(new long[]{0x4000000000002C00L,0x40000000224022E2L,0x0401800100000C00L});
    public static final BitSet FOLLOW_exprBitwiseOr_in_synpred84_pol2459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_194_in_synpred85_pol2502 = new BitSet(new long[]{0x4000000000002C00L,0x40000000224022E2L,0x0401800100000C00L});
    public static final BitSet FOLLOW_exprBitwiseXor_in_synpred85_pol2504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_141_in_synpred86_pol2546 = new BitSet(new long[]{0x4000000000002C00L,0x40000000224022E2L,0x0401800100000C00L});
    public static final BitSet FOLLOW_exprBitwiseAnd_in_synpred86_pol2548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_125_in_synpred87_pol2590 = new BitSet(new long[]{0x4000000000002C00L,0x40000000224022E2L,0x0401800100000C00L});
    public static final BitSet FOLLOW_exprEquality_in_synpred87_pol2592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_equalityOp_in_synpred88_pol2635 = new BitSet(new long[]{0x4000000000002C00L,0x40000000224022E2L,0x0401800100000C00L});
    public static final BitSet FOLLOW_exprRelational_in_synpred88_pol2637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relationalOp_in_synpred89_pol2680 = new BitSet(new long[]{0x4000000000002C00L,0x40000000224022E2L,0x0401800100000C00L});
    public static final BitSet FOLLOW_exprShift_in_synpred89_pol2682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_shiftOp_in_synpred90_pol2726 = new BitSet(new long[]{0x4000000000002C00L,0x40000000224022E2L,0x0401800100000C00L});
    public static final BitSet FOLLOW_exprAddSub_in_synpred90_pol2729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_addSubOp_in_synpred91_pol2772 = new BitSet(new long[]{0x4000000000002C00L,0x40000000224022E2L,0x0401800100000C00L});
    public static final BitSet FOLLOW_exprMultDiv_in_synpred91_pol2774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multDivModOp_in_synpred92_pol2819 = new BitSet(new long[]{0x4000000000002C00L,0x40000000224022E2L,0x0401800100000C00L});
    public static final BitSet FOLLOW_exprUnary_in_synpred92_pol2821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varOrFcnOrArray_in_synpred100_pol2983 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000020L});
    public static final BitSet FOLLOW_incDecOp_in_synpred100_pol2985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varOrFcnOrArray_in_synpred101_pol3000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeName_in_synpred111_pol3281 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_qualName_in_synpred111_pol3283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeName_in_synpred112_pol3317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qualName_in_synpred113_pol3350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_126_in_synpred115_pol3387 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L,0x71000E0000050000L});
    public static final BitSet FOLLOW_typeName_in_synpred115_pol3389 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_129_in_synpred115_pol3392 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L,0x71000E0000050000L});
    public static final BitSet FOLLOW_typeName_in_synpred115_pol3394 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_127_in_synpred115_pol3398 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_qualName_in_synpred115_pol3400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fieldOrArrayAccess_in_synpred120_pol3606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fieldOrArrayAccess_in_synpred122_pol3653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_138_in_synpred123_pol3647 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_synpred123_pol3649 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_fcnArgumentList_in_synpred123_pol3651 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000804L});
    public static final BitSet FOLLOW_fieldOrArrayAccess_in_synpred123_pol3653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fieldOrArrayAccess_in_synpred124_pol3730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_138_in_synpred125_pol3722 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_synpred125_pol3728 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000804L});
    public static final BitSet FOLLOW_fieldOrArrayAccess_in_synpred125_pol3730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_138_in_synpred126_pol3778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fieldOrArrayAccess_in_synpred127_pol3815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qualName_in_synpred128_pol3811 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_fcnArgumentList_in_synpred128_pol3813 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000804L});
    public static final BitSet FOLLOW_fieldOrArrayAccess_in_synpred128_pol3815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fieldOrArrayAccess_in_synpred129_pol3858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayAccess_in_synpred131_pol3876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_130_in_synpred132_pol3898 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_synpred132_pol3904 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_fcnArgumentList_in_synpred132_pol3906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exprList_in_synpred133_pol3962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NL_in_synpred136_pol4028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDeclaration_in_synpred137_pol4045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtAssign_in_synpred138_pol4051 = new BitSet(new long[]{0x0000000000000000L,0x0000000008080000L});
    public static final BitSet FOLLOW_delim_in_synpred138_pol4053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtBind_in_synpred140_pol4065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtInjection_in_synpred152_pol4130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varOrFcnOrArray_in_synpred153_pol4147 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ASSIGN_in_synpred153_pol4149 = new BitSet(new long[]{0x4000000000002C00L,0x40000000224022E2L,0x0401800100000C00L});
    public static final BitSet FOLLOW_expr_in_synpred153_pol4151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_injectionCode_in_synpred154_pol4175 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ASSIGN_in_synpred154_pol4177 = new BitSet(new long[]{0x4000000000002C00L,0x40000000224022E2L,0x0401800100000C00L});
    public static final BitSet FOLLOW_expr_in_synpred154_pol4179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varOrFcnOrArray_in_synpred155_pol4204 = new BitSet(new long[]{0x0000000000008390L,0x0000000044030400L});
    public static final BitSet FOLLOW_assignOp_in_synpred155_pol4206 = new BitSet(new long[]{0x4000000000002C00L,0x40000000224022E2L,0x0401800100000C00L});
    public static final BitSet FOLLOW_expr_in_synpred155_pol4208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_183_in_synpred160_pol4371 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_126_in_synpred160_pol4374 = new BitSet(new long[]{0x4000000000002C00L,0x40000000224022E2L,0x0401800100000C00L});
    public static final BitSet FOLLOW_expr_in_synpred160_pol4378 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_129_in_synpred160_pol4381 = new BitSet(new long[]{0x4000000000002C00L,0x40000000224022E2L,0x0401800100000C00L});
    public static final BitSet FOLLOW_expr_in_synpred160_pol4383 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_127_in_synpred160_pol4389 = new BitSet(new long[]{0x0000000000000000L,0x0000000008080000L});
    public static final BitSet FOLLOW_delim_in_synpred160_pol4392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeName_in_synpred163_pol4601 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_synpred163_pol4603 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ASSIGN_in_synpred163_pol4605 = new BitSet(new long[]{0x4000000000002C00L,0x40000000224022E2L,0x0401800100000C00L});
    public static final BitSet FOLLOW_expr_in_synpred163_pol4607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_165_in_synpred168_pol4872 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_stmtIfBlock_in_synpred168_pol4874 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_stmtsElif_in_synpred168_pol4876 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_stmtElse_in_synpred168_pol4878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_165_in_synpred169_pol4897 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_stmtIfBlock_in_synpred169_pol4899 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_stmtElse_in_synpred169_pol4901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeName_in_synpred176_pol5153 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_synpred176_pol5155 = new BitSet(new long[]{0x0000000000000020L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_ASSIGN_in_synpred176_pol5158 = new BitSet(new long[]{0x4000000000002C00L,0x40000000224022E2L,0x0401800100000C00L});
    public static final BitSet FOLLOW_expr_in_synpred176_pol5160 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_129_in_synpred176_pol5164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeName_in_synpred177_pol5177 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_synpred177_pol5179 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_139_in_synpred177_pol5181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeName_in_synpred178_pol5194 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_126_in_synpred178_pol5196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeName_in_synpred179_pol5211 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_varInit_in_synpred179_pol5213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_139_in_synpred183_pol5399 = new BitSet(new long[]{0x4000000000002C00L,0x40000000224022E2L,0x0401800100001C00L});
    public static final BitSet FOLLOW_varDim_in_synpred183_pol5401 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_140_in_synpred183_pol5403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_129_in_synpred187_pol5477 = new BitSet(new long[]{0x4000000000002C00L,0x40000000224022E2L,0x0401800100000C00L,0x0000000000000002L});
    public static final BitSet FOLLOW_initializer_in_synpred187_pol5479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeName_in_synpred188_pol5508 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L,0x71000E0000050000L});
    public static final BitSet FOLLOW_varDeclList_in_synpred188_pol5513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_129_in_synpred189_pol5521 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_varInit_in_synpred189_pol5524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qualNameList_in_synpred199_pol5688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_130_in_synpred200_pol5720 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_synpred200_pol5735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NL_in_synpred212_pol6196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NL_in_synpred213_pol6239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NL_in_synpred215_pol6250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NL_in_synpred216_pol6250 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_NL_in_synpred218_pol6262 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_196_in_synpred218_pol6266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NL_in_synpred219_pol6272 = new BitSet(new long[]{0x0000000000000002L});

}