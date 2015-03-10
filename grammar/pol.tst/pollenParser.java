// Copyright Amaret, Inc 2011-2015
// See https://github.com/amaret/pollen/blob/master/LICENSE

// $ANTLR 3.1.3 Mar 17, 2009 19:23:44 pollen.g 2012-08-15 13:36:34

    //package com.amaret.pollen.parser;
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

public class pollenParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "D_ARG", "D_ARR", "D_ARR_DIM", "D_CLASS", "D_COMPOSITION", "D_CONFIG", "D_CONST", "D_ENUM", "D_ENUMVAL", "D_FCN_CTOR", "D_FCN_DCL", "D_FCN_DEF", "D_FCN_REF", "D_FCN_TYP_LIST", "D_FCN_TYP_NM", "D_FIELD", "D_INSTANCE", "D_META", "D_META_ARGS", "D_MODULE", "D_PROTOCOL", "D_PROTOCOL_MEM", "D_REF", "D_VAR", "D_VOID", "DELIM", "E_ADDR", "E_ARRLIT", "E_BINARY", "E_CALL", "E_CALL_ARGS", "E_COND", "E_CONST", "E_EXPR", "E_FIELD", "E_HASH", "E_IDENT", "E_INDEX", "E_NUMLIT", "E_NEW", "E_PAREN", "E_QUEST", "E_UNARY", "E_VEC", "EXPORT", "FCNBODY", "FCNPARMS", "HOST", "INJECT_CODE", "LIST", "MODULE", "NIL", "QNAME", "S_ASSERT", "S_ASSIGN", "S_BIND", "S_BLOCK", "S_BREAK", "S_CASE", "S_CONTINUE", "S_DECL", "S_DEFAULT", "S_DO_WHILE", "S_ELIF", "S_ELSE", "S_FOR", "S_FOREACH", "S_IF", "S_IMPORT", "S_PACKAGE", "S_PRINT", "S_PROVIDED", "S_RETURN", "S_SWITCH", "S_WHILE", "T_ARR", "T_DEF", "T_FCN", "T_USER_TYPE", "T_STD", "UNIT", "NL", "IDENT", "ASSIGN", "INT_LIT", "STRING", "CHAR", "EQ", "NOT_EQ", "LT_EQ", "GT_EQ", "ADD_EQ", "SUB_EQ", "MUL_EQ", "DIV_EQ", "MOD_EQ", "LSHFT_EQ", "RSHFT_EQ", "BITAND_EQ", "BITXOR_EQ", "BITOR_EQ", "LOG_NOT", "BIT_NOT", "BIND", "SEMI", "OCT_LIT", "REAL_LIT", "HEX_LIT", "INJECT", "I", "D", "H", "LU", "O", "E", "WS", "SL_COMMENT", "IJ_BEG", "IJ_END", "ML_COMMENT", "ILLEGAL_CHARACTER", "'package'", "'export'", "'class'", "'module'", "'enum'", "','", "'protocol'", "'composition'", "'import'", "'from'", "'as'", "'meta'", "'type'", "'{'", "'}'", "'['", "']'", "'extends'", "'implements'", "'<'", "'>'", "'<<'", "'>>'", "'+'", "'-'", "'*'", "'/'", "'%'", "'?'", "':'", "'||'", "'&&'", "'|'", "'^'", "'&'", "'('", "')'", "'++'", "'--'", "'public'", "'host'", "'new'", "'@'", "'.'", "'assert'", "'print'", "'log'", "'err'", "'out'", "'return'", "'break'", "'continue'", "'for'", "'foreach'", "'in'", "'switch'", "'case'", "'default'", "'do'", "'while'", "'if'", "'elif'", "'else'", "'provided'", "'const'", "'volatile'", "'bool'", "'byte'", "'int8'", "'int16'", "'int32'", "'string'", "'uint8'", "'uint16'", "'uint32'", "'true'", "'false'", "'null'"
    };
    public static final int S_IF=71;
    public static final int S_BREAK=61;
    public static final int T__159=159;
    public static final int T__158=158;
    public static final int D_FCN_TYP_NM=18;
    public static final int ADD_EQ=95;
    public static final int T__160=160;
    public static final int E_NUMLIT=42;
    public static final int D_VOID=28;
    public static final int S_ELSE=68;
    public static final int T__167=167;
    public static final int S_IMPORT=72;
    public static final int T__168=168;
    public static final int EOF=-1;
    public static final int T__165=165;
    public static final int T__166=166;
    public static final int T__163=163;
    public static final int T__164=164;
    public static final int LSHFT_EQ=100;
    public static final int T__161=161;
    public static final int T__162=162;
    public static final int T__148=148;
    public static final int T__147=147;
    public static final int T__149=149;
    public static final int BITAND_EQ=102;
    public static final int BIND=107;
    public static final int E_CONST=36;
    public static final int S_PRINT=74;
    public static final int E_UNARY=46;
    public static final int EXPORT=48;
    public static final int EQ=91;
    public static final int T__154=154;
    public static final int T__155=155;
    public static final int T__156=156;
    public static final int T__157=157;
    public static final int T__150=150;
    public static final int E_HASH=39;
    public static final int T__151=151;
    public static final int T__152=152;
    public static final int T__153=153;
    public static final int D=114;
    public static final int T__139=139;
    public static final int E=118;
    public static final int T__138=138;
    public static final int T__137=137;
    public static final int T__136=136;
    public static final int D_FCN_CTOR=13;
    public static final int D_CONFIG=9;
    public static final int O=117;
    public static final int LOG_NOT=105;
    public static final int H=115;
    public static final int I=113;
    public static final int MUL_EQ=97;
    public static final int T_USER_TYPE=82;
    public static final int T__141=141;
    public static final int T__142=142;
    public static final int T__140=140;
    public static final int T__145=145;
    public static final int T__146=146;
    public static final int T__143=143;
    public static final int T__144=144;
    public static final int T__126=126;
    public static final int T__125=125;
    public static final int T__128=128;
    public static final int T__127=127;
    public static final int WS=119;
    public static final int QNAME=56;
    public static final int T__129=129;
    public static final int SL_COMMENT=120;
    public static final int S_BLOCK=60;
    public static final int E_CALL_ARGS=34;
    public static final int T__130=130;
    public static final int T__131=131;
    public static final int T__132=132;
    public static final int T__133=133;
    public static final int T__134=134;
    public static final int T__135=135;
    public static final int ILLEGAL_CHARACTER=124;
    public static final int T_ARR=79;
    public static final int RSHFT_EQ=101;
    public static final int S_ASSERT=57;
    public static final int HOST=51;
    public static final int D_COMPOSITION=8;
    public static final int S_ASSIGN=58;
    public static final int INJECT_CODE=52;
    public static final int IJ_END=122;
    public static final int S_DECL=64;
    public static final int IJ_BEG=121;
    public static final int T__202=202;
    public static final int D_ARR=5;
    public static final int E_QUEST=45;
    public static final int D_META_ARGS=22;
    public static final int D_FIELD=19;
    public static final int D_FCN_REF=16;
    public static final int IDENT=86;
    public static final int GT_EQ=94;
    public static final int D_CLASS=7;
    public static final int E_ADDR=30;
    public static final int T_FCN=81;
    public static final int S_PROVIDED=75;
    public static final int E_EXPR=37;
    public static final int E_IDENT=40;
    public static final int T_DEF=80;
    public static final int BITOR_EQ=104;
    public static final int MODULE=54;
    public static final int SEMI=108;
    public static final int D_ARG=4;
    public static final int NOT_EQ=92;
    public static final int S_RETURN=76;
    public static final int E_VEC=47;
    public static final int S_PACKAGE=73;
    public static final int INJECT=112;
    public static final int E_NEW=43;
    public static final int E_BINARY=32;
    public static final int S_DEFAULT=65;
    public static final int STRING=89;
    public static final int S_WHILE=78;
    public static final int LU=116;
    public static final int INT_LIT=88;
    public static final int E_FIELD=38;
    public static final int S_CONTINUE=63;
    public static final int CHAR=90;
    public static final int OCT_LIT=109;
    public static final int S_SWITCH=77;
    public static final int DIV_EQ=98;
    public static final int D_REF=26;
    public static final int FCNPARMS=50;
    public static final int NL=85;
    public static final int E_ARRLIT=31;
    public static final int E_COND=35;
    public static final int S_BIND=59;
    public static final int S_FOR=69;
    public static final int D_ENUM=11;
    public static final int LIST=53;
    public static final int S_DO_WHILE=66;
    public static final int UNIT=84;
    public static final int BITXOR_EQ=103;
    public static final int D_ARR_DIM=6;
    public static final int T__200=200;
    public static final int NIL=55;
    public static final int T__201=201;
    public static final int D_FCN_TYP_LIST=17;
    public static final int T_STD=83;
    public static final int D_VAR=27;
    public static final int LT_EQ=93;
    public static final int REAL_LIT=110;
    public static final int MOD_EQ=99;
    public static final int HEX_LIT=111;
    public static final int E_PAREN=44;
    public static final int DELIM=29;
    public static final int ML_COMMENT=123;
    public static final int T__199=199;
    public static final int T__198=198;
    public static final int T__197=197;
    public static final int D_FCN_DEF=15;
    public static final int T__196=196;
    public static final int T__195=195;
    public static final int T__194=194;
    public static final int T__193=193;
    public static final int T__192=192;
    public static final int D_INSTANCE=20;
    public static final int T__191=191;
    public static final int T__190=190;
    public static final int D_META=21;
    public static final int D_CONST=10;
    public static final int T__184=184;
    public static final int T__183=183;
    public static final int T__186=186;
    public static final int T__185=185;
    public static final int T__188=188;
    public static final int SUB_EQ=96;
    public static final int T__187=187;
    public static final int T__189=189;
    public static final int T__180=180;
    public static final int FCNBODY=49;
    public static final int D_ENUMVAL=12;
    public static final int T__182=182;
    public static final int T__181=181;
    public static final int E_CALL=33;
    public static final int D_FCN_DCL=14;
    public static final int S_ELIF=67;
    public static final int T__175=175;
    public static final int S_CASE=62;
    public static final int T__174=174;
    public static final int T__173=173;
    public static final int T__172=172;
    public static final int T__179=179;
    public static final int D_PROTOCOL_MEM=25;
    public static final int T__178=178;
    public static final int T__177=177;
    public static final int T__176=176;
    public static final int T__171=171;
    public static final int T__170=170;
    public static final int ASSIGN=87;
    public static final int BIT_NOT=106;
    public static final int E_INDEX=41;
    public static final int D_MODULE=23;
    public static final int S_FOREACH=70;
    public static final int D_PROTOCOL=24;
    public static final int T__169=169;

    // delegates
    // delegators


        public pollenParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public pollenParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
            this.state.ruleMemo = new HashMap[342+1];
             
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return pollenParser.tokenNames; }
    public String getGrammarFileName() { return "pollen.g"; }



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
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "unit"
    // pollen.g:207:1: unit : ( NL )* unitPackage -> ^( UNIT unitPackage ) ;
    public final pollenParser.unit_return unit() throws RecognitionException {
        pollenParser.unit_return retval = new pollenParser.unit_return();
        retval.start = input.LT(1);
        int unit_StartIndex = input.index();
        Object root_0 = null;

        Token NL1=null;
        pollenParser.unitPackage_return unitPackage2 = null;


        Object NL1_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_unitPackage=new RewriteRuleSubtreeStream(adaptor,"rule unitPackage");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return retval; }
            // pollen.g:208:5: ( ( NL )* unitPackage -> ^( UNIT unitPackage ) )
            // pollen.g:208:9: ( NL )* unitPackage
            {
            // pollen.g:208:9: ( NL )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==NL) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // pollen.g:208:10: NL
            	    {
            	    NL1=(Token)match(input,NL,FOLLOW_NL_in_unit709); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_NL.add(NL1);


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            pushFollow(FOLLOW_unitPackage_in_unit713);
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
            // 208:29: -> ^( UNIT unitPackage )
            {
                // pollen.g:208:32: ^( UNIT unitPackage )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(UNIT, "UNIT"), root_1);

                adaptor.addChild(root_1, stream_unitPackage.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
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
    // pollen.g:210:1: unitPackage : stmtPackage ( importList )? ( stmtInjection )? ( unitTypeDefinition )? ( stmtInjection )? EOF ;
    public final pollenParser.unitPackage_return unitPackage() throws RecognitionException {
        pollenParser.unitPackage_return retval = new pollenParser.unitPackage_return();
        retval.start = input.LT(1);
        int unitPackage_StartIndex = input.index();
        Object root_0 = null;

        Token EOF8=null;
        pollenParser.stmtPackage_return stmtPackage3 = null;

        pollenParser.importList_return importList4 = null;

        pollenParser.stmtInjection_return stmtInjection5 = null;

        pollenParser.unitTypeDefinition_return unitTypeDefinition6 = null;

        pollenParser.stmtInjection_return stmtInjection7 = null;


        Object EOF8_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return retval; }
            // pollen.g:211:2: ( stmtPackage ( importList )? ( stmtInjection )? ( unitTypeDefinition )? ( stmtInjection )? EOF )
            // pollen.g:211:5: stmtPackage ( importList )? ( stmtInjection )? ( unitTypeDefinition )? ( stmtInjection )? EOF
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_stmtPackage_in_unitPackage739);
            stmtPackage3=stmtPackage();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, stmtPackage3.getTree());
            // pollen.g:212:5: ( importList )?
            int alt2=2;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // pollen.g:212:6: importList
                    {
                    pushFollow(FOLLOW_importList_in_unitPackage746);
                    importList4=importList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, importList4.getTree());

                    }
                    break;

            }

            // pollen.g:213:7: ( stmtInjection )?
            int alt3=2;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // pollen.g:213:8: stmtInjection
                    {
                    pushFollow(FOLLOW_stmtInjection_in_unitPackage757);
                    stmtInjection5=stmtInjection();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmtInjection5.getTree());

                    }
                    break;

            }

            // pollen.g:214:7: ( unitTypeDefinition )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=127 && LA4_0<=129)||(LA4_0>=131 && LA4_0<=132)||LA4_0==136) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // pollen.g:214:8: unitTypeDefinition
                    {
                    pushFollow(FOLLOW_unitTypeDefinition_in_unitPackage768);
                    unitTypeDefinition6=unitTypeDefinition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, unitTypeDefinition6.getTree());

                    }
                    break;

            }

            // pollen.g:215:7: ( stmtInjection )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==INJECT) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // pollen.g:215:8: stmtInjection
                    {
                    pushFollow(FOLLOW_stmtInjection_in_unitPackage779);
                    stmtInjection7=stmtInjection();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmtInjection7.getTree());

                    }
                    break;

            }

            EOF8=(Token)match(input,EOF,FOLLOW_EOF_in_unitPackage789); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            EOF8_tree = (Object)adaptor.create(EOF8);
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
    // pollen.g:218:1: stmtPackage : ( 'package' qualName delim -> ^( S_PACKAGE qualName ) | -> ^( S_PACKAGE ) );
    public final pollenParser.stmtPackage_return stmtPackage() throws RecognitionException {
        pollenParser.stmtPackage_return retval = new pollenParser.stmtPackage_return();
        retval.start = input.LT(1);
        int stmtPackage_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal9=null;
        pollenParser.qualName_return qualName10 = null;

        pollenParser.delim_return delim11 = null;


        Object string_literal9_tree=null;
        RewriteRuleTokenStream stream_125=new RewriteRuleTokenStream(adaptor,"token 125");
        RewriteRuleSubtreeStream stream_qualName=new RewriteRuleSubtreeStream(adaptor,"rule qualName");
        RewriteRuleSubtreeStream stream_delim=new RewriteRuleSubtreeStream(adaptor,"rule delim");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return retval; }
            // pollen.g:219:2: ( 'package' qualName delim -> ^( S_PACKAGE qualName ) | -> ^( S_PACKAGE ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==125) ) {
                alt6=1;
            }
            else if ( (LA6_0==EOF||LA6_0==INJECT||(LA6_0>=127 && LA6_0<=129)||(LA6_0>=131 && LA6_0<=134)||LA6_0==136) ) {
                alt6=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // pollen.g:219:4: 'package' qualName delim
                    {
                    string_literal9=(Token)match(input,125,FOLLOW_125_in_stmtPackage799); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_125.add(string_literal9);

                    pushFollow(FOLLOW_qualName_in_stmtPackage801);
                    qualName10=qualName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_qualName.add(qualName10.getTree());
                    pushFollow(FOLLOW_delim_in_stmtPackage803);
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
                    // 219:29: -> ^( S_PACKAGE qualName )
                    {
                        // pollen.g:219:32: ^( S_PACKAGE qualName )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(S_PACKAGE, "S_PACKAGE"), root_1);

                        adaptor.addChild(root_1, stream_qualName.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // pollen.g:220:4: 
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
                    // 220:4: -> ^( S_PACKAGE )
                    {
                        // pollen.g:220:7: ^( S_PACKAGE )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(S_PACKAGE, "S_PACKAGE"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
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
    // pollen.g:222:1: stmtExport : 'export' qualName delim ;
    public final pollenParser.stmtExport_return stmtExport() throws RecognitionException {
        pollenParser.stmtExport_return retval = new pollenParser.stmtExport_return();
        retval.start = input.LT(1);
        int stmtExport_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal12=null;
        pollenParser.qualName_return qualName13 = null;

        pollenParser.delim_return delim14 = null;


        Object string_literal12_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return retval; }
            // pollen.g:223:5: ( 'export' qualName delim )
            // pollen.g:223:9: 'export' qualName delim
            {
            root_0 = (Object)adaptor.nil();

            string_literal12=(Token)match(input,126,FOLLOW_126_in_stmtExport835); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal12_tree = (Object)adaptor.create(string_literal12);
            root_0 = (Object)adaptor.becomeRoot(string_literal12_tree, root_0);
            }
            pushFollow(FOLLOW_qualName_in_stmtExport838);
            qualName13=qualName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, qualName13.getTree());
            pushFollow(FOLLOW_delim_in_stmtExport840);
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
    // pollen.g:225:1: exportList : ( stmtExport )+ ;
    public final pollenParser.exportList_return exportList() throws RecognitionException {
        pollenParser.exportList_return retval = new pollenParser.exportList_return();
        retval.start = input.LT(1);
        int exportList_StartIndex = input.index();
        Object root_0 = null;

        pollenParser.stmtExport_return stmtExport15 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return retval; }
            // pollen.g:226:5: ( ( stmtExport )+ )
            // pollen.g:226:9: ( stmtExport )+
            {
            root_0 = (Object)adaptor.nil();

            // pollen.g:226:9: ( stmtExport )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==126) ) {
                    int LA7_2 = input.LA(2);

                    if ( (synpred7_pollen()) ) {
                        alt7=1;
                    }


                }


                switch (alt7) {
            	case 1 :
            	    // pollen.g:0:0: stmtExport
            	    {
            	    pushFollow(FOLLOW_stmtExport_in_exportList858);
            	    stmtExport15=stmtExport();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmtExport15.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
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
    // pollen.g:229:1: classDefinition : 'class' classDef -> ^( D_CLASS classDef ) ;
    public final pollenParser.classDefinition_return classDefinition() throws RecognitionException {
        pollenParser.classDefinition_return retval = new pollenParser.classDefinition_return();
        retval.start = input.LT(1);
        int classDefinition_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal16=null;
        pollenParser.classDef_return classDef17 = null;


        Object string_literal16_tree=null;
        RewriteRuleTokenStream stream_127=new RewriteRuleTokenStream(adaptor,"token 127");
        RewriteRuleSubtreeStream stream_classDef=new RewriteRuleSubtreeStream(adaptor,"rule classDef");

        	if (tl.size() > 1) { // nested class
        	  ti = new TypeInfo();
        	  tl.add(ti);		
        	}	

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return retval; }
            // pollen.g:242:2: ( 'class' classDef -> ^( D_CLASS classDef ) )
            // pollen.g:242:5: 'class' classDef
            {
            string_literal16=(Token)match(input,127,FOLLOW_127_in_classDefinition892); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_127.add(string_literal16);

            pushFollow(FOLLOW_classDef_in_classDefinition894);
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
            // 242:22: -> ^( D_CLASS classDef )
            {
                // pollen.g:242:25: ^( D_CLASS classDef )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(D_CLASS, "D_CLASS"), root_1);

                adaptor.addChild(root_1, stream_classDef.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
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
    // pollen.g:244:1: classDef : IDENT ( implementsClause )? braceOpen ( classFeature )* braceClose ;
    public final pollenParser.classDef_return classDef() throws RecognitionException {
        pollenParser.classDef_return retval = new pollenParser.classDef_return();
        retval.start = input.LT(1);
        int classDef_StartIndex = input.index();
        Object root_0 = null;

        Token IDENT18=null;
        pollenParser.implementsClause_return implementsClause19 = null;

        pollenParser.braceOpen_return braceOpen20 = null;

        pollenParser.classFeature_return classFeature21 = null;

        pollenParser.braceClose_return braceClose22 = null;


        Object IDENT18_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return retval; }
            // pollen.g:245:2: ( IDENT ( implementsClause )? braceOpen ( classFeature )* braceClose )
            // pollen.g:245:4: IDENT ( implementsClause )? braceOpen ( classFeature )* braceClose
            {
            root_0 = (Object)adaptor.nil();

            IDENT18=(Token)match(input,IDENT,FOLLOW_IDENT_in_classDef913); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENT18_tree = (Object)adaptor.create(IDENT18);
            root_0 = (Object)adaptor.becomeRoot(IDENT18_tree, root_0);
            }
            if ( state.backtracking==0 ) {
               ti.setTypeName((IDENT18!=null?IDENT18.getText():null)); ti.setUnitFlags(EnumSet.of(UnitFlags.CLASS));
            }
            // pollen.g:247:3: ( implementsClause )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==143) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // pollen.g:247:4: implementsClause
                    {
                    pushFollow(FOLLOW_implementsClause_in_classDef924);
                    implementsClause19=implementsClause();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, implementsClause19.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_braceOpen_in_classDef931);
            braceOpen20=braceOpen();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, braceOpen20.getTree());
            // pollen.g:248:13: ( classFeature )*
            loop9:
            do {
                int alt9=2;
                alt9 = dfa9.predict(input);
                switch (alt9) {
            	case 1 :
            	    // pollen.g:248:14: classFeature
            	    {
            	    pushFollow(FOLLOW_classFeature_in_classDef934);
            	    classFeature21=classFeature();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, classFeature21.getTree());

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            pushFollow(FOLLOW_braceClose_in_classDef938);
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
    // pollen.g:251:1: classFeature : ( fcnDefinition | enumDefinition | varDeclaration | classDefinition | stmtInjection );
    public final pollenParser.classFeature_return classFeature() throws RecognitionException {
        pollenParser.classFeature_return retval = new pollenParser.classFeature_return();
        retval.start = input.LT(1);
        int classFeature_StartIndex = input.index();
        Object root_0 = null;

        pollenParser.fcnDefinition_return fcnDefinition23 = null;

        pollenParser.enumDefinition_return enumDefinition24 = null;

        pollenParser.varDeclaration_return varDeclaration25 = null;

        pollenParser.classDefinition_return classDefinition26 = null;

        pollenParser.stmtInjection_return stmtInjection27 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return retval; }
            // pollen.g:252:5: ( fcnDefinition | enumDefinition | varDeclaration | classDefinition | stmtInjection )
            int alt10=5;
            alt10 = dfa10.predict(input);
            switch (alt10) {
                case 1 :
                    // pollen.g:252:9: fcnDefinition
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_fcnDefinition_in_classFeature955);
                    fcnDefinition23=fcnDefinition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, fcnDefinition23.getTree());

                    }
                    break;
                case 2 :
                    // pollen.g:253:9: enumDefinition
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_enumDefinition_in_classFeature966);
                    enumDefinition24=enumDefinition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, enumDefinition24.getTree());

                    }
                    break;
                case 3 :
                    // pollen.g:254:9: varDeclaration
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_varDeclaration_in_classFeature976);
                    varDeclaration25=varDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDeclaration25.getTree());

                    }
                    break;
                case 4 :
                    // pollen.g:255:9: classDefinition
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_classDefinition_in_classFeature986);
                    classDefinition26=classDefinition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, classDefinition26.getTree());

                    }
                    break;
                case 5 :
                    // pollen.g:256:9: stmtInjection
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_stmtInjection_in_classFeature996);
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
    // pollen.g:258:1: moduleDefinition : 'module' IDENT ( implementsClause )? braceOpen ( moduleFeature )* braceClose -> ^( D_MODULE ^( IDENT ( implementsClause )? ( moduleFeature )* ) ) ;
    public final pollenParser.moduleDefinition_return moduleDefinition() throws RecognitionException {
        pollenParser.moduleDefinition_return retval = new pollenParser.moduleDefinition_return();
        retval.start = input.LT(1);
        int moduleDefinition_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal28=null;
        Token IDENT29=null;
        pollenParser.implementsClause_return implementsClause30 = null;

        pollenParser.braceOpen_return braceOpen31 = null;

        pollenParser.moduleFeature_return moduleFeature32 = null;

        pollenParser.braceClose_return braceClose33 = null;


        Object string_literal28_tree=null;
        Object IDENT29_tree=null;
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleTokenStream stream_128=new RewriteRuleTokenStream(adaptor,"token 128");
        RewriteRuleSubtreeStream stream_implementsClause=new RewriteRuleSubtreeStream(adaptor,"rule implementsClause");
        RewriteRuleSubtreeStream stream_moduleFeature=new RewriteRuleSubtreeStream(adaptor,"rule moduleFeature");
        RewriteRuleSubtreeStream stream_braceOpen=new RewriteRuleSubtreeStream(adaptor,"rule braceOpen");
        RewriteRuleSubtreeStream stream_braceClose=new RewriteRuleSubtreeStream(adaptor,"rule braceClose");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return retval; }
            // pollen.g:259:2: ( 'module' IDENT ( implementsClause )? braceOpen ( moduleFeature )* braceClose -> ^( D_MODULE ^( IDENT ( implementsClause )? ( moduleFeature )* ) ) )
            // pollen.g:259:7: 'module' IDENT ( implementsClause )? braceOpen ( moduleFeature )* braceClose
            {
            string_literal28=(Token)match(input,128,FOLLOW_128_in_moduleDefinition1013); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_128.add(string_literal28);

            IDENT29=(Token)match(input,IDENT,FOLLOW_IDENT_in_moduleDefinition1015); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENT.add(IDENT29);

            if ( state.backtracking==0 ) {
               ti.setTypeName((IDENT29!=null?IDENT29.getText():null)); ti.setUnitFlags(EnumSet.of(UnitFlags.MODULE));
            }
            // pollen.g:261:4: ( implementsClause )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==143) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // pollen.g:261:5: implementsClause
                    {
                    pushFollow(FOLLOW_implementsClause_in_moduleDefinition1030);
                    implementsClause30=implementsClause();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_implementsClause.add(implementsClause30.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_braceOpen_in_moduleDefinition1039);
            braceOpen31=braceOpen();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_braceOpen.add(braceOpen31.getTree());
            // pollen.g:262:14: ( moduleFeature )*
            loop12:
            do {
                int alt12=2;
                alt12 = dfa12.predict(input);
                switch (alt12) {
            	case 1 :
            	    // pollen.g:262:15: moduleFeature
            	    {
            	    pushFollow(FOLLOW_moduleFeature_in_moduleDefinition1042);
            	    moduleFeature32=moduleFeature();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_moduleFeature.add(moduleFeature32.getTree());

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            pushFollow(FOLLOW_braceClose_in_moduleDefinition1046);
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
            // 263:4: -> ^( D_MODULE ^( IDENT ( implementsClause )? ( moduleFeature )* ) )
            {
                // pollen.g:263:7: ^( D_MODULE ^( IDENT ( implementsClause )? ( moduleFeature )* ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(D_MODULE, "D_MODULE"), root_1);

                // pollen.g:263:18: ^( IDENT ( implementsClause )? ( moduleFeature )* )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(stream_IDENT.nextNode(), root_2);

                // pollen.g:263:26: ( implementsClause )?
                if ( stream_implementsClause.hasNext() ) {
                    adaptor.addChild(root_2, stream_implementsClause.nextTree());

                }
                stream_implementsClause.reset();
                // pollen.g:263:44: ( moduleFeature )*
                while ( stream_moduleFeature.hasNext() ) {
                    adaptor.addChild(root_2, stream_moduleFeature.nextTree());

                }
                stream_moduleFeature.reset();

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
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
    // pollen.g:265:1: moduleFeature : ( fcnDefinition | varDeclaration | enumDefinition | classDefinition | stmtInjection );
    public final pollenParser.moduleFeature_return moduleFeature() throws RecognitionException {
        pollenParser.moduleFeature_return retval = new pollenParser.moduleFeature_return();
        retval.start = input.LT(1);
        int moduleFeature_StartIndex = input.index();
        Object root_0 = null;

        pollenParser.fcnDefinition_return fcnDefinition34 = null;

        pollenParser.varDeclaration_return varDeclaration35 = null;

        pollenParser.enumDefinition_return enumDefinition36 = null;

        pollenParser.classDefinition_return classDefinition37 = null;

        pollenParser.stmtInjection_return stmtInjection38 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return retval; }
            // pollen.g:266:2: ( fcnDefinition | varDeclaration | enumDefinition | classDefinition | stmtInjection )
            int alt13=5;
            alt13 = dfa13.predict(input);
            switch (alt13) {
                case 1 :
                    // pollen.g:266:6: fcnDefinition
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_fcnDefinition_in_moduleFeature1078);
                    fcnDefinition34=fcnDefinition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, fcnDefinition34.getTree());

                    }
                    break;
                case 2 :
                    // pollen.g:267:8: varDeclaration
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_varDeclaration_in_moduleFeature1087);
                    varDeclaration35=varDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDeclaration35.getTree());

                    }
                    break;
                case 3 :
                    // pollen.g:268:6: enumDefinition
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_enumDefinition_in_moduleFeature1094);
                    enumDefinition36=enumDefinition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, enumDefinition36.getTree());

                    }
                    break;
                case 4 :
                    // pollen.g:269:6: classDefinition
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_classDefinition_in_moduleFeature1101);
                    classDefinition37=classDefinition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, classDefinition37.getTree());

                    }
                    break;
                case 5 :
                    // pollen.g:270:5: stmtInjection
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_stmtInjection_in_moduleFeature1107);
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
    // pollen.g:272:1: enumDefinition : 'enum' enumDef -> ^( D_ENUM enumDef ) ;
    public final pollenParser.enumDefinition_return enumDefinition() throws RecognitionException {
        pollenParser.enumDefinition_return retval = new pollenParser.enumDefinition_return();
        retval.start = input.LT(1);
        int enumDefinition_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal39=null;
        pollenParser.enumDef_return enumDef40 = null;


        Object string_literal39_tree=null;
        RewriteRuleTokenStream stream_129=new RewriteRuleTokenStream(adaptor,"token 129");
        RewriteRuleSubtreeStream stream_enumDef=new RewriteRuleSubtreeStream(adaptor,"rule enumDef");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return retval; }
            // pollen.g:273:2: ( 'enum' enumDef -> ^( D_ENUM enumDef ) )
            // pollen.g:273:4: 'enum' enumDef
            {
            string_literal39=(Token)match(input,129,FOLLOW_129_in_enumDefinition1120); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_129.add(string_literal39);

            pushFollow(FOLLOW_enumDef_in_enumDefinition1122);
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
            // 273:19: -> ^( D_ENUM enumDef )
            {
                // pollen.g:273:22: ^( D_ENUM enumDef )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(D_ENUM, "D_ENUM"), root_1);

                adaptor.addChild(root_1, stream_enumDef.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
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
    // pollen.g:275:1: enumDef : ( IDENT braceOpen enumList braceClose ) ;
    public final pollenParser.enumDef_return enumDef() throws RecognitionException {
        pollenParser.enumDef_return retval = new pollenParser.enumDef_return();
        retval.start = input.LT(1);
        int enumDef_StartIndex = input.index();
        Object root_0 = null;

        Token IDENT41=null;
        pollenParser.braceOpen_return braceOpen42 = null;

        pollenParser.enumList_return enumList43 = null;

        pollenParser.braceClose_return braceClose44 = null;


        Object IDENT41_tree=null;


        	if (tl.size() > 1) { // nested 
        	  ti = new TypeInfo();
        	  tl.add(ti);		
        	}	

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return retval; }
            // pollen.g:288:2: ( ( IDENT braceOpen enumList braceClose ) )
            // pollen.g:288:5: ( IDENT braceOpen enumList braceClose )
            {
            root_0 = (Object)adaptor.nil();

            // pollen.g:288:5: ( IDENT braceOpen enumList braceClose )
            // pollen.g:288:6: IDENT braceOpen enumList braceClose
            {
            IDENT41=(Token)match(input,IDENT,FOLLOW_IDENT_in_enumDef1152); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENT41_tree = (Object)adaptor.create(IDENT41);
            root_0 = (Object)adaptor.becomeRoot(IDENT41_tree, root_0);
            }
            if ( state.backtracking==0 ) {
               ti.setTypeName((IDENT41!=null?IDENT41.getText():null)); ti.setUnitFlags(EnumSet.of(UnitFlags.ENUM));
            }
            pushFollow(FOLLOW_braceOpen_in_enumDef1162);
            braceOpen42=braceOpen();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, braceOpen42.getTree());
            pushFollow(FOLLOW_enumList_in_enumDef1164);
            enumList43=enumList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, enumList43.getTree());
            pushFollow(FOLLOW_braceClose_in_enumDef1166);
            braceClose44=braceClose();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, braceClose44.getTree());

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
    // pollen.g:292:1: enumList : enumElement ( ',' enumElement )* ;
    public final pollenParser.enumList_return enumList() throws RecognitionException {
        pollenParser.enumList_return retval = new pollenParser.enumList_return();
        retval.start = input.LT(1);
        int enumList_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal46=null;
        pollenParser.enumElement_return enumElement45 = null;

        pollenParser.enumElement_return enumElement47 = null;


        Object char_literal46_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return retval; }
            // pollen.g:293:2: ( enumElement ( ',' enumElement )* )
            // pollen.g:293:4: enumElement ( ',' enumElement )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_enumElement_in_enumList1177);
            enumElement45=enumElement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, enumElement45.getTree());
            // pollen.g:293:16: ( ',' enumElement )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==130) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // pollen.g:293:17: ',' enumElement
            	    {
            	    char_literal46=(Token)match(input,130,FOLLOW_130_in_enumList1180); if (state.failed) return retval;
            	    pushFollow(FOLLOW_enumElement_in_enumList1183);
            	    enumElement47=enumElement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, enumElement47.getTree());

            	    }
            	    break;

            	default :
            	    break loop14;
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
    // pollen.g:295:1: enumElement : ( IDENT ( ASSIGN INT_LIT ) ( delim )? | IDENT ( delim )? );
    public final pollenParser.enumElement_return enumElement() throws RecognitionException {
        pollenParser.enumElement_return retval = new pollenParser.enumElement_return();
        retval.start = input.LT(1);
        int enumElement_StartIndex = input.index();
        Object root_0 = null;

        Token IDENT48=null;
        Token ASSIGN49=null;
        Token INT_LIT50=null;
        Token IDENT52=null;
        pollenParser.delim_return delim51 = null;

        pollenParser.delim_return delim53 = null;


        Object IDENT48_tree=null;
        Object ASSIGN49_tree=null;
        Object INT_LIT50_tree=null;
        Object IDENT52_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return retval; }
            // pollen.g:296:2: ( IDENT ( ASSIGN INT_LIT ) ( delim )? | IDENT ( delim )? )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==IDENT) ) {
                int LA17_1 = input.LA(2);

                if ( (synpred22_pollen()) ) {
                    alt17=1;
                }
                else if ( (true) ) {
                    alt17=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // pollen.g:296:4: IDENT ( ASSIGN INT_LIT ) ( delim )?
                    {
                    root_0 = (Object)adaptor.nil();

                    IDENT48=(Token)match(input,IDENT,FOLLOW_IDENT_in_enumElement1195); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENT48_tree = (Object)adaptor.create(IDENT48);
                    root_0 = (Object)adaptor.becomeRoot(IDENT48_tree, root_0);
                    }
                    // pollen.g:296:11: ( ASSIGN INT_LIT )
                    // pollen.g:296:12: ASSIGN INT_LIT
                    {
                    ASSIGN49=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_enumElement1199); if (state.failed) return retval;
                    INT_LIT50=(Token)match(input,INT_LIT,FOLLOW_INT_LIT_in_enumElement1202); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INT_LIT50_tree = (Object)adaptor.create(INT_LIT50);
                    adaptor.addChild(root_0, INT_LIT50_tree);
                    }

                    }

                    // pollen.g:296:29: ( delim )?
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

                            if ( (synpred21_pollen()) ) {
                                alt15=1;
                            }
                            }
                            break;
                        case 130:
                            {
                            int LA15_3 = input.LA(2);

                            if ( (synpred21_pollen()) ) {
                                alt15=1;
                            }
                            }
                            break;
                        case 139:
                            {
                            int LA15_4 = input.LA(2);

                            if ( (synpred21_pollen()) ) {
                                alt15=1;
                            }
                            }
                            break;
                        case EOF:
                            {
                            int LA15_5 = input.LA(2);

                            if ( (synpred21_pollen()) ) {
                                alt15=1;
                            }
                            }
                            break;
                    }

                    switch (alt15) {
                        case 1 :
                            // pollen.g:296:30: delim
                            {
                            pushFollow(FOLLOW_delim_in_enumElement1206);
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
                    // pollen.g:297:4: IDENT ( delim )?
                    {
                    root_0 = (Object)adaptor.nil();

                    IDENT52=(Token)match(input,IDENT,FOLLOW_IDENT_in_enumElement1213); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENT52_tree = (Object)adaptor.create(IDENT52);
                    root_0 = (Object)adaptor.becomeRoot(IDENT52_tree, root_0);
                    }
                    // pollen.g:297:11: ( delim )?
                    int alt16=2;
                    switch ( input.LA(1) ) {
                        case SEMI:
                            {
                            alt16=1;
                            }
                            break;
                        case NL:
                            {
                            int LA16_2 = input.LA(2);

                            if ( (synpred23_pollen()) ) {
                                alt16=1;
                            }
                            }
                            break;
                        case 130:
                            {
                            int LA16_3 = input.LA(2);

                            if ( (synpred23_pollen()) ) {
                                alt16=1;
                            }
                            }
                            break;
                        case 139:
                            {
                            int LA16_4 = input.LA(2);

                            if ( (synpred23_pollen()) ) {
                                alt16=1;
                            }
                            }
                            break;
                        case EOF:
                            {
                            int LA16_5 = input.LA(2);

                            if ( (synpred23_pollen()) ) {
                                alt16=1;
                            }
                            }
                            break;
                    }

                    switch (alt16) {
                        case 1 :
                            // pollen.g:297:12: delim
                            {
                            pushFollow(FOLLOW_delim_in_enumElement1217);
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
    // pollen.g:299:1: protocolDefinition : 'protocol' IDENT ( extendsClause )? braceOpen ( protocolFeature )* braceClose -> ^( D_PROTOCOL ^( IDENT ( extendsClause )? ( protocolFeature )* ) ) ;
    public final pollenParser.protocolDefinition_return protocolDefinition() throws RecognitionException {
        pollenParser.protocolDefinition_return retval = new pollenParser.protocolDefinition_return();
        retval.start = input.LT(1);
        int protocolDefinition_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal54=null;
        Token IDENT55=null;
        pollenParser.extendsClause_return extendsClause56 = null;

        pollenParser.braceOpen_return braceOpen57 = null;

        pollenParser.protocolFeature_return protocolFeature58 = null;

        pollenParser.braceClose_return braceClose59 = null;


        Object string_literal54_tree=null;
        Object IDENT55_tree=null;
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleTokenStream stream_131=new RewriteRuleTokenStream(adaptor,"token 131");
        RewriteRuleSubtreeStream stream_protocolFeature=new RewriteRuleSubtreeStream(adaptor,"rule protocolFeature");
        RewriteRuleSubtreeStream stream_extendsClause=new RewriteRuleSubtreeStream(adaptor,"rule extendsClause");
        RewriteRuleSubtreeStream stream_braceOpen=new RewriteRuleSubtreeStream(adaptor,"rule braceOpen");
        RewriteRuleSubtreeStream stream_braceClose=new RewriteRuleSubtreeStream(adaptor,"rule braceClose");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return retval; }
            // pollen.g:300:2: ( 'protocol' IDENT ( extendsClause )? braceOpen ( protocolFeature )* braceClose -> ^( D_PROTOCOL ^( IDENT ( extendsClause )? ( protocolFeature )* ) ) )
            // pollen.g:300:4: 'protocol' IDENT ( extendsClause )? braceOpen ( protocolFeature )* braceClose
            {
            string_literal54=(Token)match(input,131,FOLLOW_131_in_protocolDefinition1229); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_131.add(string_literal54);

            IDENT55=(Token)match(input,IDENT,FOLLOW_IDENT_in_protocolDefinition1231); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENT.add(IDENT55);

            if ( state.backtracking==0 ) {
               ti.setTypeName((IDENT55!=null?IDENT55.getText():null)); ti.setUnitFlags(EnumSet.of(UnitFlags.PROTOCOL));
            }
            // pollen.g:302:3: ( extendsClause )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==142) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // pollen.g:0:0: extendsClause
                    {
                    pushFollow(FOLLOW_extendsClause_in_protocolDefinition1239);
                    extendsClause56=extendsClause();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_extendsClause.add(extendsClause56.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_braceOpen_in_protocolDefinition1245);
            braceOpen57=braceOpen();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_braceOpen.add(braceOpen57.getTree());
            // pollen.g:303:13: ( protocolFeature )*
            loop19:
            do {
                int alt19=2;
                alt19 = dfa19.predict(input);
                switch (alt19) {
            	case 1 :
            	    // pollen.g:303:14: protocolFeature
            	    {
            	    pushFollow(FOLLOW_protocolFeature_in_protocolDefinition1248);
            	    protocolFeature58=protocolFeature();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_protocolFeature.add(protocolFeature58.getTree());

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            pushFollow(FOLLOW_braceClose_in_protocolDefinition1252);
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

            root_0 = (Object)adaptor.nil();
            // 304:3: -> ^( D_PROTOCOL ^( IDENT ( extendsClause )? ( protocolFeature )* ) )
            {
                // pollen.g:304:6: ^( D_PROTOCOL ^( IDENT ( extendsClause )? ( protocolFeature )* ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(D_PROTOCOL, "D_PROTOCOL"), root_1);

                // pollen.g:304:19: ^( IDENT ( extendsClause )? ( protocolFeature )* )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(stream_IDENT.nextNode(), root_2);

                // pollen.g:304:27: ( extendsClause )?
                if ( stream_extendsClause.hasNext() ) {
                    adaptor.addChild(root_2, stream_extendsClause.nextTree());

                }
                stream_extendsClause.reset();
                // pollen.g:304:42: ( protocolFeature )*
                while ( stream_protocolFeature.hasNext() ) {
                    adaptor.addChild(root_2, stream_protocolFeature.nextTree());

                }
                stream_protocolFeature.reset();

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
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
    // pollen.g:306:1: protocolFeature : ( enumDefinition | fcnDeclaration | stmtInjection );
    public final pollenParser.protocolFeature_return protocolFeature() throws RecognitionException {
        pollenParser.protocolFeature_return retval = new pollenParser.protocolFeature_return();
        retval.start = input.LT(1);
        int protocolFeature_StartIndex = input.index();
        Object root_0 = null;

        pollenParser.enumDefinition_return enumDefinition60 = null;

        pollenParser.fcnDeclaration_return fcnDeclaration61 = null;

        pollenParser.stmtInjection_return stmtInjection62 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return retval; }
            // pollen.g:307:5: ( enumDefinition | fcnDeclaration | stmtInjection )
            int alt20=3;
            switch ( input.LA(1) ) {
            case 129:
                {
                alt20=1;
                }
                break;
            case IDENT:
            case 160:
            case 164:
            case 165:
            case 191:
            case 192:
            case 193:
            case 194:
            case 195:
            case 196:
            case 197:
            case 198:
            case 199:
                {
                alt20=2;
                }
                break;
            case INJECT:
                {
                alt20=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // pollen.g:307:9: enumDefinition
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_enumDefinition_in_protocolFeature1286);
                    enumDefinition60=enumDefinition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, enumDefinition60.getTree());

                    }
                    break;
                case 2 :
                    // pollen.g:308:9: fcnDeclaration
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_fcnDeclaration_in_protocolFeature1296);
                    fcnDeclaration61=fcnDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, fcnDeclaration61.getTree());

                    }
                    break;
                case 3 :
                    // pollen.g:309:9: stmtInjection
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_stmtInjection_in_protocolFeature1307);
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
    // pollen.g:311:1: compositionDefinition : 'composition' IDENT ( extendsClause )? braceOpen ( compositionFeature )* braceClose -> ^( D_COMPOSITION IDENT ( extendsClause )? ( compositionFeature )* ) ;
    public final pollenParser.compositionDefinition_return compositionDefinition() throws RecognitionException {
        pollenParser.compositionDefinition_return retval = new pollenParser.compositionDefinition_return();
        retval.start = input.LT(1);
        int compositionDefinition_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal63=null;
        Token IDENT64=null;
        pollenParser.extendsClause_return extendsClause65 = null;

        pollenParser.braceOpen_return braceOpen66 = null;

        pollenParser.compositionFeature_return compositionFeature67 = null;

        pollenParser.braceClose_return braceClose68 = null;


        Object string_literal63_tree=null;
        Object IDENT64_tree=null;
        RewriteRuleTokenStream stream_132=new RewriteRuleTokenStream(adaptor,"token 132");
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleSubtreeStream stream_extendsClause=new RewriteRuleSubtreeStream(adaptor,"rule extendsClause");
        RewriteRuleSubtreeStream stream_compositionFeature=new RewriteRuleSubtreeStream(adaptor,"rule compositionFeature");
        RewriteRuleSubtreeStream stream_braceOpen=new RewriteRuleSubtreeStream(adaptor,"rule braceOpen");
        RewriteRuleSubtreeStream stream_braceClose=new RewriteRuleSubtreeStream(adaptor,"rule braceClose");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return retval; }
            // pollen.g:312:2: ( 'composition' IDENT ( extendsClause )? braceOpen ( compositionFeature )* braceClose -> ^( D_COMPOSITION IDENT ( extendsClause )? ( compositionFeature )* ) )
            // pollen.g:312:4: 'composition' IDENT ( extendsClause )? braceOpen ( compositionFeature )* braceClose
            {
            string_literal63=(Token)match(input,132,FOLLOW_132_in_compositionDefinition1320); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_132.add(string_literal63);

            IDENT64=(Token)match(input,IDENT,FOLLOW_IDENT_in_compositionDefinition1322); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENT.add(IDENT64);

            if ( state.backtracking==0 ) {
               ti.setTypeName((IDENT64!=null?IDENT64.getText():null)); 
              		  //DBG("IDENT64 " + (IDENT64!=null?IDENT64.getText():null));
              		  ti.setUnitFlags(EnumSet.of(UnitFlags.COMPOSITION));
              		  //DBG(ti.getTypeName() + ", " + ti.getUnitFlags().toString());
              		
            }
            // pollen.g:318:3: ( extendsClause )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==142) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // pollen.g:0:0: extendsClause
                    {
                    pushFollow(FOLLOW_extendsClause_in_compositionDefinition1330);
                    extendsClause65=extendsClause();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_extendsClause.add(extendsClause65.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_braceOpen_in_compositionDefinition1337);
            braceOpen66=braceOpen();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_braceOpen.add(braceOpen66.getTree());
            // pollen.g:319:13: ( compositionFeature )*
            loop22:
            do {
                int alt22=2;
                alt22 = dfa22.predict(input);
                switch (alt22) {
            	case 1 :
            	    // pollen.g:319:14: compositionFeature
            	    {
            	    pushFollow(FOLLOW_compositionFeature_in_compositionDefinition1340);
            	    compositionFeature67=compositionFeature();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_compositionFeature.add(compositionFeature67.getTree());

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            pushFollow(FOLLOW_braceClose_in_compositionDefinition1344);
            braceClose68=braceClose();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_braceClose.add(braceClose68.getTree());


            // AST REWRITE
            // elements: extendsClause, IDENT, compositionFeature
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 320:4: -> ^( D_COMPOSITION IDENT ( extendsClause )? ( compositionFeature )* )
            {
                // pollen.g:320:7: ^( D_COMPOSITION IDENT ( extendsClause )? ( compositionFeature )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(D_COMPOSITION, "D_COMPOSITION"), root_1);

                adaptor.addChild(root_1, stream_IDENT.nextNode());
                // pollen.g:320:29: ( extendsClause )?
                if ( stream_extendsClause.hasNext() ) {
                    adaptor.addChild(root_1, stream_extendsClause.nextTree());

                }
                stream_extendsClause.reset();
                // pollen.g:320:44: ( compositionFeature )*
                while ( stream_compositionFeature.hasNext() ) {
                    adaptor.addChild(root_1, stream_compositionFeature.nextTree());

                }
                stream_compositionFeature.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
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
    // pollen.g:322:1: compositionFeature : ( exportList | fcnDefinitionHost | enumDefinition | varDeclaration | stmtInjection );
    public final pollenParser.compositionFeature_return compositionFeature() throws RecognitionException {
        pollenParser.compositionFeature_return retval = new pollenParser.compositionFeature_return();
        retval.start = input.LT(1);
        int compositionFeature_StartIndex = input.index();
        Object root_0 = null;

        pollenParser.exportList_return exportList69 = null;

        pollenParser.fcnDefinitionHost_return fcnDefinitionHost70 = null;

        pollenParser.enumDefinition_return enumDefinition71 = null;

        pollenParser.varDeclaration_return varDeclaration72 = null;

        pollenParser.stmtInjection_return stmtInjection73 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return retval; }
            // pollen.g:323:3: ( exportList | fcnDefinitionHost | enumDefinition | varDeclaration | stmtInjection )
            int alt23=5;
            alt23 = dfa23.predict(input);
            switch (alt23) {
                case 1 :
                    // pollen.g:323:6: exportList
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_exportList_in_compositionFeature1374);
                    exportList69=exportList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, exportList69.getTree());

                    }
                    break;
                case 2 :
                    // pollen.g:324:7: fcnDefinitionHost
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_fcnDefinitionHost_in_compositionFeature1383);
                    fcnDefinitionHost70=fcnDefinitionHost();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, fcnDefinitionHost70.getTree());

                    }
                    break;
                case 3 :
                    // pollen.g:325:7: enumDefinition
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_enumDefinition_in_compositionFeature1391);
                    enumDefinition71=enumDefinition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, enumDefinition71.getTree());

                    }
                    break;
                case 4 :
                    // pollen.g:326:7: varDeclaration
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_varDeclaration_in_compositionFeature1399);
                    varDeclaration72=varDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDeclaration72.getTree());

                    }
                    break;
                case 5 :
                    // pollen.g:327:6: stmtInjection
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_stmtInjection_in_compositionFeature1406);
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
    // pollen.g:329:1: stmtImport : ( ( importFrom )? 'import' qualName ( metaArguments )? ( importAs )? delim ) -> ^( S_IMPORT ( importFrom )? qualName ( metaArguments )? ( importAs )? ) ;
    public final pollenParser.stmtImport_return stmtImport() throws RecognitionException {
        pollenParser.stmtImport_return retval = new pollenParser.stmtImport_return();
        retval.start = input.LT(1);
        int stmtImport_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal75=null;
        pollenParser.importFrom_return importFrom74 = null;

        pollenParser.qualName_return qualName76 = null;

        pollenParser.metaArguments_return metaArguments77 = null;

        pollenParser.importAs_return importAs78 = null;

        pollenParser.delim_return delim79 = null;


        Object string_literal75_tree=null;
        RewriteRuleTokenStream stream_133=new RewriteRuleTokenStream(adaptor,"token 133");
        RewriteRuleSubtreeStream stream_importFrom=new RewriteRuleSubtreeStream(adaptor,"rule importFrom");
        RewriteRuleSubtreeStream stream_qualName=new RewriteRuleSubtreeStream(adaptor,"rule qualName");
        RewriteRuleSubtreeStream stream_importAs=new RewriteRuleSubtreeStream(adaptor,"rule importAs");
        RewriteRuleSubtreeStream stream_delim=new RewriteRuleSubtreeStream(adaptor,"rule delim");
        RewriteRuleSubtreeStream stream_metaArguments=new RewriteRuleSubtreeStream(adaptor,"rule metaArguments");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return retval; }
            // pollen.g:330:5: ( ( ( importFrom )? 'import' qualName ( metaArguments )? ( importAs )? delim ) -> ^( S_IMPORT ( importFrom )? qualName ( metaArguments )? ( importAs )? ) )
            // pollen.g:330:9: ( ( importFrom )? 'import' qualName ( metaArguments )? ( importAs )? delim )
            {
            // pollen.g:330:9: ( ( importFrom )? 'import' qualName ( metaArguments )? ( importAs )? delim )
            // pollen.g:330:10: ( importFrom )? 'import' qualName ( metaArguments )? ( importAs )? delim
            {
            // pollen.g:330:10: ( importFrom )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==134) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // pollen.g:0:0: importFrom
                    {
                    pushFollow(FOLLOW_importFrom_in_stmtImport1423);
                    importFrom74=importFrom();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_importFrom.add(importFrom74.getTree());

                    }
                    break;

            }

            string_literal75=(Token)match(input,133,FOLLOW_133_in_stmtImport1434); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_133.add(string_literal75);

            pushFollow(FOLLOW_qualName_in_stmtImport1436);
            qualName76=qualName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_qualName.add(qualName76.getTree());
            // pollen.g:331:27: ( metaArguments )?
            int alt25=2;
            alt25 = dfa25.predict(input);
            switch (alt25) {
                case 1 :
                    // pollen.g:331:28: metaArguments
                    {
                    pushFollow(FOLLOW_metaArguments_in_stmtImport1439);
                    metaArguments77=metaArguments();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_metaArguments.add(metaArguments77.getTree());

                    }
                    break;

            }

            // pollen.g:332:10: ( importAs )?
            int alt26=2;
            alt26 = dfa26.predict(input);
            switch (alt26) {
                case 1 :
                    // pollen.g:0:0: importAs
                    {
                    pushFollow(FOLLOW_importAs_in_stmtImport1452);
                    importAs78=importAs();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_importAs.add(importAs78.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_delim_in_stmtImport1455);
            delim79=delim();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_delim.add(delim79.getTree());

            }



            // AST REWRITE
            // elements: importAs, metaArguments, qualName, importFrom
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 332:27: -> ^( S_IMPORT ( importFrom )? qualName ( metaArguments )? ( importAs )? )
            {
                // pollen.g:332:30: ^( S_IMPORT ( importFrom )? qualName ( metaArguments )? ( importAs )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(S_IMPORT, "S_IMPORT"), root_1);

                // pollen.g:332:41: ( importFrom )?
                if ( stream_importFrom.hasNext() ) {
                    adaptor.addChild(root_1, stream_importFrom.nextTree());

                }
                stream_importFrom.reset();
                adaptor.addChild(root_1, stream_qualName.nextTree());
                // pollen.g:332:62: ( metaArguments )?
                if ( stream_metaArguments.hasNext() ) {
                    adaptor.addChild(root_1, stream_metaArguments.nextTree());

                }
                stream_metaArguments.reset();
                // pollen.g:332:77: ( importAs )?
                if ( stream_importAs.hasNext() ) {
                    adaptor.addChild(root_1, stream_importAs.nextTree());

                }
                stream_importAs.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
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
    // pollen.g:334:1: importFrom : 'from' qualName ;
    public final pollenParser.importFrom_return importFrom() throws RecognitionException {
        pollenParser.importFrom_return retval = new pollenParser.importFrom_return();
        retval.start = input.LT(1);
        int importFrom_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal80=null;
        pollenParser.qualName_return qualName81 = null;


        Object string_literal80_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return retval; }
            // pollen.g:335:5: ( 'from' qualName )
            // pollen.g:335:9: 'from' qualName
            {
            root_0 = (Object)adaptor.nil();

            string_literal80=(Token)match(input,134,FOLLOW_134_in_importFrom1491); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal80_tree = (Object)adaptor.create(string_literal80);
            root_0 = (Object)adaptor.becomeRoot(string_literal80_tree, root_0);
            }
            pushFollow(FOLLOW_qualName_in_importFrom1494);
            qualName81=qualName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, qualName81.getTree());

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
    // pollen.g:337:1: importAs : 'as' qualName ;
    public final pollenParser.importAs_return importAs() throws RecognitionException {
        pollenParser.importAs_return retval = new pollenParser.importAs_return();
        retval.start = input.LT(1);
        int importAs_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal82=null;
        pollenParser.qualName_return qualName83 = null;


        Object string_literal82_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return retval; }
            // pollen.g:338:2: ( 'as' qualName )
            // pollen.g:338:4: 'as' qualName
            {
            root_0 = (Object)adaptor.nil();

            string_literal82=(Token)match(input,135,FOLLOW_135_in_importAs1507); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal82_tree = (Object)adaptor.create(string_literal82);
            root_0 = (Object)adaptor.becomeRoot(string_literal82_tree, root_0);
            }
            pushFollow(FOLLOW_qualName_in_importAs1510);
            qualName83=qualName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, qualName83.getTree());

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
    // pollen.g:340:1: importList : stmtImport ( stmtImport )* -> ( stmtImport )+ ;
    public final pollenParser.importList_return importList() throws RecognitionException {
        pollenParser.importList_return retval = new pollenParser.importList_return();
        retval.start = input.LT(1);
        int importList_StartIndex = input.index();
        Object root_0 = null;

        pollenParser.stmtImport_return stmtImport84 = null;

        pollenParser.stmtImport_return stmtImport85 = null;


        RewriteRuleSubtreeStream stream_stmtImport=new RewriteRuleSubtreeStream(adaptor,"rule stmtImport");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return retval; }
            // pollen.g:341:5: ( stmtImport ( stmtImport )* -> ( stmtImport )+ )
            // pollen.g:341:9: stmtImport ( stmtImport )*
            {
            pushFollow(FOLLOW_stmtImport_in_importList1525);
            stmtImport84=stmtImport();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_stmtImport.add(stmtImport84.getTree());
            // pollen.g:341:20: ( stmtImport )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=133 && LA27_0<=134)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // pollen.g:341:21: stmtImport
            	    {
            	    pushFollow(FOLLOW_stmtImport_in_importList1528);
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
            // 341:34: -> ( stmtImport )+
            {
                if ( !(stream_stmtImport.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_stmtImport.hasNext() ) {
                    adaptor.addChild(root_0, stream_stmtImport.nextTree());

                }
                stream_stmtImport.reset();

            }

            retval.tree = root_0;}
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
    // pollen.g:344:1: meta : 'meta' ( braceOpen metaFormalParameters braceClose ) -> ^( D_META metaFormalParameters ) ;
    public final pollenParser.meta_return meta() throws RecognitionException {
        pollenParser.meta_return retval = new pollenParser.meta_return();
        retval.start = input.LT(1);
        int meta_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal86=null;
        pollenParser.braceOpen_return braceOpen87 = null;

        pollenParser.metaFormalParameters_return metaFormalParameters88 = null;

        pollenParser.braceClose_return braceClose89 = null;


        Object string_literal86_tree=null;
        RewriteRuleTokenStream stream_136=new RewriteRuleTokenStream(adaptor,"token 136");
        RewriteRuleSubtreeStream stream_metaFormalParameters=new RewriteRuleSubtreeStream(adaptor,"rule metaFormalParameters");
        RewriteRuleSubtreeStream stream_braceOpen=new RewriteRuleSubtreeStream(adaptor,"rule braceOpen");
        RewriteRuleSubtreeStream stream_braceClose=new RewriteRuleSubtreeStream(adaptor,"rule braceClose");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return retval; }
            // pollen.g:345:2: ( 'meta' ( braceOpen metaFormalParameters braceClose ) -> ^( D_META metaFormalParameters ) )
            // pollen.g:345:4: 'meta' ( braceOpen metaFormalParameters braceClose )
            {
            string_literal86=(Token)match(input,136,FOLLOW_136_in_meta1549); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_136.add(string_literal86);

            if ( state.backtracking==0 ) {
               ti.setUnitFlags(EnumSet.of(UnitFlags.META));
            }
            // pollen.g:347:3: ( braceOpen metaFormalParameters braceClose )
            // pollen.g:347:4: braceOpen metaFormalParameters braceClose
            {
            pushFollow(FOLLOW_braceOpen_in_meta1558);
            braceOpen87=braceOpen();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_braceOpen.add(braceOpen87.getTree());
            pushFollow(FOLLOW_metaFormalParameters_in_meta1560);
            metaFormalParameters88=metaFormalParameters();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_metaFormalParameters.add(metaFormalParameters88.getTree());
            pushFollow(FOLLOW_braceClose_in_meta1562);
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
            // 348:3: -> ^( D_META metaFormalParameters )
            {
                // pollen.g:348:6: ^( D_META metaFormalParameters )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(D_META, "D_META"), root_1);

                adaptor.addChild(root_1, stream_metaFormalParameters.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
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
    // pollen.g:350:1: metaFormalParameters : metaFormalParameter ( ',' metaFormalParameter )* -> ( metaFormalParameter )+ ;
    public final pollenParser.metaFormalParameters_return metaFormalParameters() throws RecognitionException {
        pollenParser.metaFormalParameters_return retval = new pollenParser.metaFormalParameters_return();
        retval.start = input.LT(1);
        int metaFormalParameters_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal91=null;
        pollenParser.metaFormalParameter_return metaFormalParameter90 = null;

        pollenParser.metaFormalParameter_return metaFormalParameter92 = null;


        Object char_literal91_tree=null;
        RewriteRuleTokenStream stream_130=new RewriteRuleTokenStream(adaptor,"token 130");
        RewriteRuleSubtreeStream stream_metaFormalParameter=new RewriteRuleSubtreeStream(adaptor,"rule metaFormalParameter");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return retval; }
            // pollen.g:351:4: ( metaFormalParameter ( ',' metaFormalParameter )* -> ( metaFormalParameter )+ )
            // pollen.g:351:8: metaFormalParameter ( ',' metaFormalParameter )*
            {
            pushFollow(FOLLOW_metaFormalParameter_in_metaFormalParameters1587);
            metaFormalParameter90=metaFormalParameter();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_metaFormalParameter.add(metaFormalParameter90.getTree());
            // pollen.g:351:29: ( ',' metaFormalParameter )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==130) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // pollen.g:351:30: ',' metaFormalParameter
            	    {
            	    char_literal91=(Token)match(input,130,FOLLOW_130_in_metaFormalParameters1591); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_130.add(char_literal91);

            	    pushFollow(FOLLOW_metaFormalParameter_in_metaFormalParameters1593);
            	    metaFormalParameter92=metaFormalParameter();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_metaFormalParameter.add(metaFormalParameter92.getTree());

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

            root_0 = (Object)adaptor.nil();
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

            retval.tree = root_0;}
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
    // pollen.g:354:1: metaFormalParameter : metaFormalParameterType IDENT ( ASSIGN metaArgument )? -> ^( metaFormalParameterType ^( IDENT ( metaArgument )? ) ) ;
    public final pollenParser.metaFormalParameter_return metaFormalParameter() throws RecognitionException {
        pollenParser.metaFormalParameter_return retval = new pollenParser.metaFormalParameter_return();
        retval.start = input.LT(1);
        int metaFormalParameter_StartIndex = input.index();
        Object root_0 = null;

        Token IDENT94=null;
        Token ASSIGN95=null;
        pollenParser.metaFormalParameterType_return metaFormalParameterType93 = null;

        pollenParser.metaArgument_return metaArgument96 = null;


        Object IDENT94_tree=null;
        Object ASSIGN95_tree=null;
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
        RewriteRuleSubtreeStream stream_metaArgument=new RewriteRuleSubtreeStream(adaptor,"rule metaArgument");
        RewriteRuleSubtreeStream stream_metaFormalParameterType=new RewriteRuleSubtreeStream(adaptor,"rule metaFormalParameterType");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return retval; }
            // pollen.g:355:1: ( metaFormalParameterType IDENT ( ASSIGN metaArgument )? -> ^( metaFormalParameterType ^( IDENT ( metaArgument )? ) ) )
            // pollen.g:355:4: metaFormalParameterType IDENT ( ASSIGN metaArgument )?
            {
            pushFollow(FOLLOW_metaFormalParameterType_in_metaFormalParameter1616);
            metaFormalParameterType93=metaFormalParameterType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_metaFormalParameterType.add(metaFormalParameterType93.getTree());
            IDENT94=(Token)match(input,IDENT,FOLLOW_IDENT_in_metaFormalParameter1618); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENT.add(IDENT94);

            // pollen.g:355:34: ( ASSIGN metaArgument )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==ASSIGN) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // pollen.g:355:35: ASSIGN metaArgument
                    {
                    ASSIGN95=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_metaFormalParameter1621); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ASSIGN.add(ASSIGN95);

                    pushFollow(FOLLOW_metaArgument_in_metaFormalParameter1623);
                    metaArgument96=metaArgument();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_metaArgument.add(metaArgument96.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: metaArgument, metaFormalParameterType, IDENT
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 356:2: -> ^( metaFormalParameterType ^( IDENT ( metaArgument )? ) )
            {
                // pollen.g:356:5: ^( metaFormalParameterType ^( IDENT ( metaArgument )? ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_metaFormalParameterType.nextNode(), root_1);

                // pollen.g:356:31: ^( IDENT ( metaArgument )? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(stream_IDENT.nextNode(), root_2);

                // pollen.g:356:39: ( metaArgument )?
                if ( stream_metaArgument.hasNext() ) {
                    adaptor.addChild(root_2, stream_metaArgument.nextTree());

                }
                stream_metaArgument.reset();

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
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
    // pollen.g:359:1: metaFormalParameterType : ( 'type' | builtinType );
    public final pollenParser.metaFormalParameterType_return metaFormalParameterType() throws RecognitionException {
        pollenParser.metaFormalParameterType_return retval = new pollenParser.metaFormalParameterType_return();
        retval.start = input.LT(1);
        int metaFormalParameterType_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal97=null;
        pollenParser.builtinType_return builtinType98 = null;


        Object string_literal97_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return retval; }
            // pollen.g:360:3: ( 'type' | builtinType )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==137) ) {
                alt30=1;
            }
            else if ( ((LA30_0>=191 && LA30_0<=199)) ) {
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
                    // pollen.g:360:5: 'type'
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal97=(Token)match(input,137,FOLLOW_137_in_metaFormalParameterType1652); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal97_tree = (Object)adaptor.create(string_literal97);
                    adaptor.addChild(root_0, string_literal97_tree);
                    }

                    }
                    break;
                case 2 :
                    // pollen.g:361:5: builtinType
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_builtinType_in_metaFormalParameterType1659);
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
    // pollen.g:363:1: metaArguments : ( '{' metaArgument ( ',' metaArgument )* '}' -> ^( D_META_ARGS ( metaArgument )+ ) | '{' '}' -> ^( D_META_ARGS NIL ) );
    public final pollenParser.metaArguments_return metaArguments() throws RecognitionException {
        pollenParser.metaArguments_return retval = new pollenParser.metaArguments_return();
        retval.start = input.LT(1);
        int metaArguments_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal99=null;
        Token char_literal101=null;
        Token char_literal103=null;
        Token char_literal104=null;
        Token char_literal105=null;
        pollenParser.metaArgument_return metaArgument100 = null;

        pollenParser.metaArgument_return metaArgument102 = null;


        Object char_literal99_tree=null;
        Object char_literal101_tree=null;
        Object char_literal103_tree=null;
        Object char_literal104_tree=null;
        Object char_literal105_tree=null;
        RewriteRuleTokenStream stream_138=new RewriteRuleTokenStream(adaptor,"token 138");
        RewriteRuleTokenStream stream_139=new RewriteRuleTokenStream(adaptor,"token 139");
        RewriteRuleTokenStream stream_130=new RewriteRuleTokenStream(adaptor,"token 130");
        RewriteRuleSubtreeStream stream_metaArgument=new RewriteRuleSubtreeStream(adaptor,"rule metaArgument");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return retval; }
            // pollen.g:364:4: ( '{' metaArgument ( ',' metaArgument )* '}' -> ^( D_META_ARGS ( metaArgument )+ ) | '{' '}' -> ^( D_META_ARGS NIL ) )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==138) ) {
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
                    // pollen.g:364:7: '{' metaArgument ( ',' metaArgument )* '}'
                    {
                    char_literal99=(Token)match(input,138,FOLLOW_138_in_metaArguments1672); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_138.add(char_literal99);

                    pushFollow(FOLLOW_metaArgument_in_metaArguments1674);
                    metaArgument100=metaArgument();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_metaArgument.add(metaArgument100.getTree());
                    // pollen.g:364:25: ( ',' metaArgument )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==130) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // pollen.g:364:26: ',' metaArgument
                    	    {
                    	    char_literal101=(Token)match(input,130,FOLLOW_130_in_metaArguments1678); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_130.add(char_literal101);

                    	    pushFollow(FOLLOW_metaArgument_in_metaArguments1680);
                    	    metaArgument102=metaArgument();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_metaArgument.add(metaArgument102.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop31;
                        }
                    } while (true);

                    char_literal103=(Token)match(input,139,FOLLOW_139_in_metaArguments1684); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_139.add(char_literal103);



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
                    // 364:49: -> ^( D_META_ARGS ( metaArgument )+ )
                    {
                        // pollen.g:364:52: ^( D_META_ARGS ( metaArgument )+ )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(D_META_ARGS, "D_META_ARGS"), root_1);

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

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // pollen.g:365:6: '{' '}'
                    {
                    char_literal104=(Token)match(input,138,FOLLOW_138_in_metaArguments1700); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_138.add(char_literal104);

                    char_literal105=(Token)match(input,139,FOLLOW_139_in_metaArguments1702); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_139.add(char_literal105);



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
                    // 365:19: -> ^( D_META_ARGS NIL )
                    {
                        // pollen.g:365:22: ^( D_META_ARGS NIL )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(D_META_ARGS, "D_META_ARGS"), root_1);

                        adaptor.addChild(root_1, (Object)adaptor.create(NIL, "NIL"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
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
    // pollen.g:368:1: metaArgument : ( numLit | boolLit | STRING | CHAR | typeNameScalar );
    public final pollenParser.metaArgument_return metaArgument() throws RecognitionException {
        pollenParser.metaArgument_return retval = new pollenParser.metaArgument_return();
        retval.start = input.LT(1);
        int metaArgument_StartIndex = input.index();
        Object root_0 = null;

        Token STRING108=null;
        Token CHAR109=null;
        pollenParser.numLit_return numLit106 = null;

        pollenParser.boolLit_return boolLit107 = null;

        pollenParser.typeNameScalar_return typeNameScalar110 = null;


        Object STRING108_tree=null;
        Object CHAR109_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return retval; }
            // pollen.g:369:2: ( numLit | boolLit | STRING | CHAR | typeNameScalar )
            int alt33=5;
            switch ( input.LA(1) ) {
            case INT_LIT:
            case OCT_LIT:
            case REAL_LIT:
            case HEX_LIT:
                {
                alt33=1;
                }
                break;
            case 200:
            case 201:
                {
                alt33=2;
                }
                break;
            case STRING:
                {
                alt33=3;
                }
                break;
            case CHAR:
                {
                alt33=4;
                }
                break;
            case IDENT:
            case 191:
            case 192:
            case 193:
            case 194:
            case 195:
            case 196:
            case 197:
            case 198:
            case 199:
                {
                alt33=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // pollen.g:369:4: numLit
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_numLit_in_metaArgument1731);
                    numLit106=numLit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, numLit106.getTree());

                    }
                    break;
                case 2 :
                    // pollen.g:370:4: boolLit
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_boolLit_in_metaArgument1737);
                    boolLit107=boolLit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, boolLit107.getTree());

                    }
                    break;
                case 3 :
                    // pollen.g:371:5: STRING
                    {
                    root_0 = (Object)adaptor.nil();

                    STRING108=(Token)match(input,STRING,FOLLOW_STRING_in_metaArgument1743); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRING108_tree = (Object)adaptor.create(STRING108);
                    adaptor.addChild(root_0, STRING108_tree);
                    }

                    }
                    break;
                case 4 :
                    // pollen.g:372:5: CHAR
                    {
                    root_0 = (Object)adaptor.nil();

                    CHAR109=(Token)match(input,CHAR,FOLLOW_CHAR_in_metaArgument1749); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CHAR109_tree = (Object)adaptor.create(CHAR109);
                    adaptor.addChild(root_0, CHAR109_tree);
                    }

                    }
                    break;
                case 5 :
                    // pollen.g:373:4: typeNameScalar
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_typeNameScalar_in_metaArgument1754);
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
    // pollen.g:375:1: typeName : typeNameScalar ( '[' ']' )? ;
    public final pollenParser.typeName_return typeName() throws RecognitionException {
        pollenParser.typeName_return retval = new pollenParser.typeName_return();
        retval.start = input.LT(1);
        int typeName_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal112=null;
        Token char_literal113=null;
        pollenParser.typeNameScalar_return typeNameScalar111 = null;


        Object char_literal112_tree=null;
        Object char_literal113_tree=null;


        	//System.out.print("typeName: "); DBG_LT();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return retval; }
            // pollen.g:379:2: ( typeNameScalar ( '[' ']' )? )
            // pollen.g:379:4: typeNameScalar ( '[' ']' )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_typeNameScalar_in_typeName1768);
            typeNameScalar111=typeNameScalar();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, typeNameScalar111.getTree());
            // pollen.g:379:19: ( '[' ']' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==140) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // pollen.g:379:20: '[' ']'
                    {
                    char_literal112=(Token)match(input,140,FOLLOW_140_in_typeName1771); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal112_tree = (Object)adaptor.create(char_literal112);
                    adaptor.addChild(root_0, char_literal112_tree);
                    }
                    char_literal113=(Token)match(input,141,FOLLOW_141_in_typeName1773); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal113_tree = (Object)adaptor.create(char_literal113);
                    adaptor.addChild(root_0, char_literal113_tree);
                    }

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
    // pollen.g:381:1: typeNameScalar : ( builtinType | userTypeName );
    public final pollenParser.typeNameScalar_return typeNameScalar() throws RecognitionException {
        pollenParser.typeNameScalar_return retval = new pollenParser.typeNameScalar_return();
        retval.start = input.LT(1);
        int typeNameScalar_StartIndex = input.index();
        Object root_0 = null;

        pollenParser.builtinType_return builtinType114 = null;

        pollenParser.userTypeName_return userTypeName115 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return retval; }
            // pollen.g:382:2: ( builtinType | userTypeName )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( ((LA35_0>=191 && LA35_0<=199)) ) {
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
                    // pollen.g:382:4: builtinType
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_builtinType_in_typeNameScalar1788);
                    builtinType114=builtinType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, builtinType114.getTree());

                    }
                    break;
                case 2 :
                    // pollen.g:383:4: userTypeName
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_userTypeName_in_typeNameScalar1793);
                    userTypeName115=userTypeName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, userTypeName115.getTree());

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
    // pollen.g:385:1: userTypeName : ( qualName metaArguments -> ^( T_USER_TYPE qualName metaArguments ) | qualName -> ^( T_USER_TYPE qualName ) );
    public final pollenParser.userTypeName_return userTypeName() throws RecognitionException {
        pollenParser.userTypeName_return retval = new pollenParser.userTypeName_return();
        retval.start = input.LT(1);
        int userTypeName_StartIndex = input.index();
        Object root_0 = null;

        pollenParser.qualName_return qualName116 = null;

        pollenParser.metaArguments_return metaArguments117 = null;

        pollenParser.qualName_return qualName118 = null;


        RewriteRuleSubtreeStream stream_qualName=new RewriteRuleSubtreeStream(adaptor,"rule qualName");
        RewriteRuleSubtreeStream stream_metaArguments=new RewriteRuleSubtreeStream(adaptor,"rule metaArguments");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return retval; }
            // pollen.g:386:2: ( qualName metaArguments -> ^( T_USER_TYPE qualName metaArguments ) | qualName -> ^( T_USER_TYPE qualName ) )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==IDENT) ) {
                int LA36_1 = input.LA(2);

                if ( (synpred49_pollen()) ) {
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
                    // pollen.g:386:4: qualName metaArguments
                    {
                    pushFollow(FOLLOW_qualName_in_userTypeName1803);
                    qualName116=qualName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_qualName.add(qualName116.getTree());
                    pushFollow(FOLLOW_metaArguments_in_userTypeName1805);
                    metaArguments117=metaArguments();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_metaArguments.add(metaArguments117.getTree());


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
                    // 386:27: -> ^( T_USER_TYPE qualName metaArguments )
                    {
                        // pollen.g:386:30: ^( T_USER_TYPE qualName metaArguments )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(T_USER_TYPE, "T_USER_TYPE"), root_1);

                        adaptor.addChild(root_1, stream_qualName.nextTree());
                        adaptor.addChild(root_1, stream_metaArguments.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // pollen.g:387:4: qualName
                    {
                    pushFollow(FOLLOW_qualName_in_userTypeName1820);
                    qualName118=qualName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_qualName.add(qualName118.getTree());


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
                    // 387:14: -> ^( T_USER_TYPE qualName )
                    {
                        // pollen.g:387:17: ^( T_USER_TYPE qualName )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(T_USER_TYPE, "T_USER_TYPE"), root_1);

                        adaptor.addChild(root_1, stream_qualName.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
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
    // pollen.g:390:1: unitTypeDefinition : ( meta )? ( ( 'module' )=> moduleDefinition | ( 'class' )=> classDefinition | ( 'protocol' )=> protocolDefinition | ( 'composition' )=> compositionDefinition | ( 'enum' )=> enumDefinition ) ;
    public final pollenParser.unitTypeDefinition_return unitTypeDefinition() throws RecognitionException {
        pollenParser.unitTypeDefinition_return retval = new pollenParser.unitTypeDefinition_return();
        retval.start = input.LT(1);
        int unitTypeDefinition_StartIndex = input.index();
        Object root_0 = null;

        pollenParser.meta_return meta119 = null;

        pollenParser.moduleDefinition_return moduleDefinition120 = null;

        pollenParser.classDefinition_return classDefinition121 = null;

        pollenParser.protocolDefinition_return protocolDefinition122 = null;

        pollenParser.compositionDefinition_return compositionDefinition123 = null;

        pollenParser.enumDefinition_return enumDefinition124 = null;




        		ti = new TypeInfo();
        		tl.add(ti);		

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return retval; }
            // pollen.g:399:4: ( ( meta )? ( ( 'module' )=> moduleDefinition | ( 'class' )=> classDefinition | ( 'protocol' )=> protocolDefinition | ( 'composition' )=> compositionDefinition | ( 'enum' )=> enumDefinition ) )
            // pollen.g:399:8: ( meta )? ( ( 'module' )=> moduleDefinition | ( 'class' )=> classDefinition | ( 'protocol' )=> protocolDefinition | ( 'composition' )=> compositionDefinition | ( 'enum' )=> enumDefinition )
            {
            root_0 = (Object)adaptor.nil();

            // pollen.g:399:8: ( meta )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==136) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // pollen.g:399:9: meta
                    {
                    pushFollow(FOLLOW_meta_in_unitTypeDefinition1853);
                    meta119=meta();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, meta119.getTree());

                    }
                    break;

            }

            // pollen.g:399:17: ( ( 'module' )=> moduleDefinition | ( 'class' )=> classDefinition | ( 'protocol' )=> protocolDefinition | ( 'composition' )=> compositionDefinition | ( 'enum' )=> enumDefinition )
            int alt38=5;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==128) && (synpred51_pollen())) {
                alt38=1;
            }
            else if ( (LA38_0==127) && (synpred52_pollen())) {
                alt38=2;
            }
            else if ( (LA38_0==131) && (synpred53_pollen())) {
                alt38=3;
            }
            else if ( (LA38_0==132) && (synpred54_pollen())) {
                alt38=4;
            }
            else if ( (LA38_0==129) && (synpred55_pollen())) {
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
                    // pollen.g:400:10: ( 'module' )=> moduleDefinition
                    {
                    pushFollow(FOLLOW_moduleDefinition_in_unitTypeDefinition1875);
                    moduleDefinition120=moduleDefinition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, moduleDefinition120.getTree());

                    }
                    break;
                case 2 :
                    // pollen.g:401:8: ( 'class' )=> classDefinition
                    {
                    pushFollow(FOLLOW_classDefinition_in_unitTypeDefinition1896);
                    classDefinition121=classDefinition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, classDefinition121.getTree());

                    }
                    break;
                case 3 :
                    // pollen.g:402:10: ( 'protocol' )=> protocolDefinition
                    {
                    pushFollow(FOLLOW_protocolDefinition_in_unitTypeDefinition1913);
                    protocolDefinition122=protocolDefinition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, protocolDefinition122.getTree());

                    }
                    break;
                case 4 :
                    // pollen.g:403:10: ( 'composition' )=> compositionDefinition
                    {
                    pushFollow(FOLLOW_compositionDefinition_in_unitTypeDefinition1931);
                    compositionDefinition123=compositionDefinition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, compositionDefinition123.getTree());

                    }
                    break;
                case 5 :
                    // pollen.g:404:10: ( 'enum' )=> enumDefinition
                    {
                    pushFollow(FOLLOW_enumDefinition_in_unitTypeDefinition1949);
                    enumDefinition124=enumDefinition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, enumDefinition124.getTree());

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
    // pollen.g:408:1: extendsClause : 'extends' IDENT ;
    public final pollenParser.extendsClause_return extendsClause() throws RecognitionException {
        pollenParser.extendsClause_return retval = new pollenParser.extendsClause_return();
        retval.start = input.LT(1);
        int extendsClause_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal125=null;
        Token IDENT126=null;

        Object string_literal125_tree=null;
        Object IDENT126_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return retval; }
            // pollen.g:409:5: ( 'extends' IDENT )
            // pollen.g:409:9: 'extends' IDENT
            {
            root_0 = (Object)adaptor.nil();

            string_literal125=(Token)match(input,142,FOLLOW_142_in_extendsClause1974); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal125_tree = (Object)adaptor.create(string_literal125);
            root_0 = (Object)adaptor.becomeRoot(string_literal125_tree, root_0);
            }
            IDENT126=(Token)match(input,IDENT,FOLLOW_IDENT_in_extendsClause1977); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENT126_tree = (Object)adaptor.create(IDENT126);
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
    // pollen.g:412:1: implementsClause : 'implements' IDENT ;
    public final pollenParser.implementsClause_return implementsClause() throws RecognitionException {
        pollenParser.implementsClause_return retval = new pollenParser.implementsClause_return();
        retval.start = input.LT(1);
        int implementsClause_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal127=null;
        Token IDENT128=null;

        Object string_literal127_tree=null;
        Object IDENT128_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 34) ) { return retval; }
            // pollen.g:413:5: ( 'implements' IDENT )
            // pollen.g:413:9: 'implements' IDENT
            {
            root_0 = (Object)adaptor.nil();

            string_literal127=(Token)match(input,143,FOLLOW_143_in_implementsClause1996); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal127_tree = (Object)adaptor.create(string_literal127);
            root_0 = (Object)adaptor.becomeRoot(string_literal127_tree, root_0);
            }
            IDENT128=(Token)match(input,IDENT,FOLLOW_IDENT_in_implementsClause1999); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENT128_tree = (Object)adaptor.create(IDENT128);
            adaptor.addChild(root_0, IDENT128_tree);
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
    // pollen.g:415:1: braceClose : ( NL )* '}' ( NL )* ;
    public final pollenParser.braceClose_return braceClose() throws RecognitionException {
        pollenParser.braceClose_return retval = new pollenParser.braceClose_return();
        retval.start = input.LT(1);
        int braceClose_StartIndex = input.index();
        Object root_0 = null;

        Token NL129=null;
        Token char_literal130=null;
        Token NL131=null;

        Object NL129_tree=null;
        Object char_literal130_tree=null;
        Object NL131_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 35) ) { return retval; }
            // pollen.g:416:5: ( ( NL )* '}' ( NL )* )
            // pollen.g:416:10: ( NL )* '}' ( NL )*
            {
            root_0 = (Object)adaptor.nil();

            // pollen.g:416:10: ( NL )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==NL) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // pollen.g:416:11: NL
            	    {
            	    NL129=(Token)match(input,NL,FOLLOW_NL_in_braceClose2019); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

            char_literal130=(Token)match(input,139,FOLLOW_139_in_braceClose2024); if (state.failed) return retval;
            // pollen.g:416:22: ( NL )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==NL) ) {
                    int LA40_2 = input.LA(2);

                    if ( (synpred57_pollen()) ) {
                        alt40=1;
                    }


                }


                switch (alt40) {
            	case 1 :
            	    // pollen.g:416:23: NL
            	    {
            	    NL131=(Token)match(input,NL,FOLLOW_NL_in_braceClose2028); if (state.failed) return retval;

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
    // pollen.g:418:1: braceCloseAtEOF : ( ( NL )* ) '}' ( NL )* ;
    public final pollenParser.braceCloseAtEOF_return braceCloseAtEOF() throws RecognitionException {
        pollenParser.braceCloseAtEOF_return retval = new pollenParser.braceCloseAtEOF_return();
        retval.start = input.LT(1);
        int braceCloseAtEOF_StartIndex = input.index();
        Object root_0 = null;

        Token NL132=null;
        Token char_literal133=null;
        Token NL134=null;

        Object NL132_tree=null;
        Object char_literal133_tree=null;
        Object NL134_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 36) ) { return retval; }
            // pollen.g:421:5: ( ( ( NL )* ) '}' ( NL )* )
            // pollen.g:421:9: ( ( NL )* ) '}' ( NL )*
            {
            root_0 = (Object)adaptor.nil();

            // pollen.g:421:9: ( ( NL )* )
            // pollen.g:421:10: ( NL )*
            {
            // pollen.g:421:12: ( NL )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==NL) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // pollen.g:0:0: NL
            	    {
            	    NL132=(Token)match(input,NL,FOLLOW_NL_in_braceCloseAtEOF2052); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);


            }

            char_literal133=(Token)match(input,139,FOLLOW_139_in_braceCloseAtEOF2057); if (state.failed) return retval;
            // pollen.g:421:21: ( NL )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==NL) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // pollen.g:421:22: NL
            	    {
            	    NL134=(Token)match(input,NL,FOLLOW_NL_in_braceCloseAtEOF2061); if (state.failed) return retval;

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
    // pollen.g:424:1: braceOpen : ( NL )* '{' ( NL )* ;
    public final pollenParser.braceOpen_return braceOpen() throws RecognitionException {
        pollenParser.braceOpen_return retval = new pollenParser.braceOpen_return();
        retval.start = input.LT(1);
        int braceOpen_StartIndex = input.index();
        Object root_0 = null;

        Token NL135=null;
        Token char_literal136=null;
        Token NL137=null;

        Object NL135_tree=null;
        Object char_literal136_tree=null;
        Object NL137_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 37) ) { return retval; }
            // pollen.g:425:5: ( ( NL )* '{' ( NL )* )
            // pollen.g:425:10: ( NL )* '{' ( NL )*
            {
            root_0 = (Object)adaptor.nil();

            // pollen.g:425:10: ( NL )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==NL) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // pollen.g:425:11: NL
            	    {
            	    NL135=(Token)match(input,NL,FOLLOW_NL_in_braceOpen2086); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);

            char_literal136=(Token)match(input,138,FOLLOW_138_in_braceOpen2091); if (state.failed) return retval;
            // pollen.g:425:22: ( NL )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==NL) ) {
                    int LA44_1 = input.LA(2);

                    if ( (synpred61_pollen()) ) {
                        alt44=1;
                    }


                }


                switch (alt44) {
            	case 1 :
            	    // pollen.g:425:23: NL
            	    {
            	    NL137=(Token)match(input,NL,FOLLOW_NL_in_braceOpen2095); if (state.failed) return retval;

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
    // pollen.g:427:1: equalityOp : ( EQ | NOT_EQ );
    public final pollenParser.equalityOp_return equalityOp() throws RecognitionException {
        pollenParser.equalityOp_return retval = new pollenParser.equalityOp_return();
        retval.start = input.LT(1);
        int equalityOp_StartIndex = input.index();
        Object root_0 = null;

        Token set138=null;

        Object set138_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 38) ) { return retval; }
            // pollen.g:428:2: ( EQ | NOT_EQ )
            // pollen.g:
            {
            root_0 = (Object)adaptor.nil();

            set138=(Token)input.LT(1);
            if ( (input.LA(1)>=EQ && input.LA(1)<=NOT_EQ) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set138));
                state.errorRecovery=false;state.failed=false;
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
    // pollen.g:430:1: relationalOp : ( '<' | '>' | LT_EQ | GT_EQ );
    public final pollenParser.relationalOp_return relationalOp() throws RecognitionException {
        pollenParser.relationalOp_return retval = new pollenParser.relationalOp_return();
        retval.start = input.LT(1);
        int relationalOp_StartIndex = input.index();
        Object root_0 = null;

        Token set139=null;

        Object set139_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 39) ) { return retval; }
            // pollen.g:431:2: ( '<' | '>' | LT_EQ | GT_EQ )
            // pollen.g:
            {
            root_0 = (Object)adaptor.nil();

            set139=(Token)input.LT(1);
            if ( (input.LA(1)>=LT_EQ && input.LA(1)<=GT_EQ)||(input.LA(1)>=144 && input.LA(1)<=145) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set139));
                state.errorRecovery=false;state.failed=false;
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
    // pollen.g:433:1: shiftOp : ( '<<' | '>>' );
    public final pollenParser.shiftOp_return shiftOp() throws RecognitionException {
        pollenParser.shiftOp_return retval = new pollenParser.shiftOp_return();
        retval.start = input.LT(1);
        int shiftOp_StartIndex = input.index();
        Object root_0 = null;

        Token set140=null;

        Object set140_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 40) ) { return retval; }
            // pollen.g:434:2: ( '<<' | '>>' )
            // pollen.g:
            {
            root_0 = (Object)adaptor.nil();

            set140=(Token)input.LT(1);
            if ( (input.LA(1)>=146 && input.LA(1)<=147) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set140));
                state.errorRecovery=false;state.failed=false;
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
            if ( state.backtracking>0 ) { memoize(input, 40, shiftOp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "shiftOp"

    public static class addSubOp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "addSubOp"
    // pollen.g:436:1: addSubOp : ( '+' | '-' );
    public final pollenParser.addSubOp_return addSubOp() throws RecognitionException {
        pollenParser.addSubOp_return retval = new pollenParser.addSubOp_return();
        retval.start = input.LT(1);
        int addSubOp_StartIndex = input.index();
        Object root_0 = null;

        Token set141=null;

        Object set141_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 41) ) { return retval; }
            // pollen.g:437:2: ( '+' | '-' )
            // pollen.g:
            {
            root_0 = (Object)adaptor.nil();

            set141=(Token)input.LT(1);
            if ( (input.LA(1)>=148 && input.LA(1)<=149) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set141));
                state.errorRecovery=false;state.failed=false;
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
            if ( state.backtracking>0 ) { memoize(input, 41, addSubOp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "addSubOp"

    public static class assignOp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "assignOp"
    // pollen.g:439:1: assignOp : ( ADD_EQ | SUB_EQ | MUL_EQ | DIV_EQ | MOD_EQ | LSHFT_EQ | RSHFT_EQ | BITAND_EQ | BITXOR_EQ | BITOR_EQ );
    public final pollenParser.assignOp_return assignOp() throws RecognitionException {
        pollenParser.assignOp_return retval = new pollenParser.assignOp_return();
        retval.start = input.LT(1);
        int assignOp_StartIndex = input.index();
        Object root_0 = null;

        Token set142=null;

        Object set142_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 42) ) { return retval; }
            // pollen.g:440:2: ( ADD_EQ | SUB_EQ | MUL_EQ | DIV_EQ | MOD_EQ | LSHFT_EQ | RSHFT_EQ | BITAND_EQ | BITXOR_EQ | BITOR_EQ )
            // pollen.g:
            {
            root_0 = (Object)adaptor.nil();

            set142=(Token)input.LT(1);
            if ( (input.LA(1)>=ADD_EQ && input.LA(1)<=BITOR_EQ) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set142));
                state.errorRecovery=false;state.failed=false;
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
            if ( state.backtracking>0 ) { memoize(input, 42, assignOp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "assignOp"

    public static class multDivModOp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "multDivModOp"
    // pollen.g:442:1: multDivModOp : ( '*' | '/' | '%' );
    public final pollenParser.multDivModOp_return multDivModOp() throws RecognitionException {
        pollenParser.multDivModOp_return retval = new pollenParser.multDivModOp_return();
        retval.start = input.LT(1);
        int multDivModOp_StartIndex = input.index();
        Object root_0 = null;

        Token set143=null;

        Object set143_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 43) ) { return retval; }
            // pollen.g:443:2: ( '*' | '/' | '%' )
            // pollen.g:
            {
            root_0 = (Object)adaptor.nil();

            set143=(Token)input.LT(1);
            if ( (input.LA(1)>=150 && input.LA(1)<=152) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set143));
                state.errorRecovery=false;state.failed=false;
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
            if ( state.backtracking>0 ) { memoize(input, 43, multDivModOp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "multDivModOp"

    public static class logicalNotOp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "logicalNotOp"
    // pollen.g:445:1: logicalNotOp : LOG_NOT ;
    public final pollenParser.logicalNotOp_return logicalNotOp() throws RecognitionException {
        pollenParser.logicalNotOp_return retval = new pollenParser.logicalNotOp_return();
        retval.start = input.LT(1);
        int logicalNotOp_StartIndex = input.index();
        Object root_0 = null;

        Token LOG_NOT144=null;

        Object LOG_NOT144_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 44) ) { return retval; }
            // pollen.g:446:2: ( LOG_NOT )
            // pollen.g:446:4: LOG_NOT
            {
            root_0 = (Object)adaptor.nil();

            LOG_NOT144=(Token)match(input,LOG_NOT,FOLLOW_LOG_NOT_in_logicalNotOp2258); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            LOG_NOT144_tree = (Object)adaptor.create(LOG_NOT144);
            adaptor.addChild(root_0, LOG_NOT144_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 44, logicalNotOp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "logicalNotOp"

    public static class bitwiseNotOp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "bitwiseNotOp"
    // pollen.g:448:1: bitwiseNotOp : BIT_NOT ;
    public final pollenParser.bitwiseNotOp_return bitwiseNotOp() throws RecognitionException {
        pollenParser.bitwiseNotOp_return retval = new pollenParser.bitwiseNotOp_return();
        retval.start = input.LT(1);
        int bitwiseNotOp_StartIndex = input.index();
        Object root_0 = null;

        Token BIT_NOT145=null;

        Object BIT_NOT145_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 45) ) { return retval; }
            // pollen.g:449:2: ( BIT_NOT )
            // pollen.g:449:4: BIT_NOT
            {
            root_0 = (Object)adaptor.nil();

            BIT_NOT145=(Token)match(input,BIT_NOT,FOLLOW_BIT_NOT_in_bitwiseNotOp2269); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            BIT_NOT145_tree = (Object)adaptor.create(BIT_NOT145);
            adaptor.addChild(root_0, BIT_NOT145_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 45, bitwiseNotOp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "bitwiseNotOp"

    public static class exprList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "exprList"
    // pollen.g:451:1: exprList : ( expr ( ',' expr )* -> ( expr )+ | -> NIL );
    public final pollenParser.exprList_return exprList() throws RecognitionException {
        pollenParser.exprList_return retval = new pollenParser.exprList_return();
        retval.start = input.LT(1);
        int exprList_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal147=null;
        pollenParser.expr_return expr146 = null;

        pollenParser.expr_return expr148 = null;


        Object char_literal147_tree=null;
        RewriteRuleTokenStream stream_130=new RewriteRuleTokenStream(adaptor,"token 130");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 46) ) { return retval; }
            // pollen.g:452:2: ( expr ( ',' expr )* -> ( expr )+ | -> NIL )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==NL||LA46_0==SEMI||(LA46_0>=126 && LA46_0<=134)||LA46_0==136||LA46_0==139||LA46_0==141||LA46_0==161||(LA46_0>=164 && LA46_0<=165)||(LA46_0>=169 && LA46_0<=170)||(LA46_0>=174 && LA46_0<=178)||(LA46_0>=180 && LA46_0<=185)||(LA46_0>=188 && LA46_0<=199)) ) {
                alt46=2;
            }
            else if ( (LA46_0==IDENT||(LA46_0>=INT_LIT && LA46_0<=CHAR)||(LA46_0>=LOG_NOT && LA46_0<=BIT_NOT)||(LA46_0>=OCT_LIT && LA46_0<=INJECT)||LA46_0==140||LA46_0==149||LA46_0==160||(LA46_0>=162 && LA46_0<=163)||(LA46_0>=166 && LA46_0<=167)||(LA46_0>=200 && LA46_0<=202)) ) {
                int LA46_2 = input.LA(2);

                if ( (synpred80_pollen()) ) {
                    alt46=1;
                }
                else if ( (true) ) {
                    alt46=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 46, 2, input);

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
                    // pollen.g:452:4: expr ( ',' expr )*
                    {
                    pushFollow(FOLLOW_expr_in_exprList2280);
                    expr146=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr146.getTree());
                    // pollen.g:452:9: ( ',' expr )*
                    loop45:
                    do {
                        int alt45=2;
                        int LA45_0 = input.LA(1);

                        if ( (LA45_0==130) ) {
                            int LA45_2 = input.LA(2);

                            if ( (synpred79_pollen()) ) {
                                alt45=1;
                            }


                        }


                        switch (alt45) {
                    	case 1 :
                    	    // pollen.g:452:10: ',' expr
                    	    {
                    	    char_literal147=(Token)match(input,130,FOLLOW_130_in_exprList2283); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_130.add(char_literal147);

                    	    pushFollow(FOLLOW_expr_in_exprList2285);
                    	    expr148=expr();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_expr.add(expr148.getTree());

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
                    // 452:21: -> ( expr )+
                    {
                        if ( !(stream_expr.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_expr.hasNext() ) {
                            adaptor.addChild(root_0, stream_expr.nextTree());

                        }
                        stream_expr.reset();

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // pollen.g:453:4: 
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
                    // 453:4: -> NIL
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(NIL, "NIL"));

                    }

                    retval.tree = root_0;}
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
            if ( state.backtracking>0 ) { memoize(input, 46, exprList_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "exprList"

    public static class expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expr"
    // pollen.g:455:1: expr : ( exprLogicalOr '?' expr ':' expr -> ^( E_QUEST exprLogicalOr expr expr ) | exprLogicalOr -> ^( E_EXPR exprLogicalOr ) );
    public final pollenParser.expr_return expr() throws RecognitionException {
        pollenParser.expr_return retval = new pollenParser.expr_return();
        retval.start = input.LT(1);
        int expr_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal150=null;
        Token char_literal152=null;
        pollenParser.exprLogicalOr_return exprLogicalOr149 = null;

        pollenParser.expr_return expr151 = null;

        pollenParser.expr_return expr153 = null;

        pollenParser.exprLogicalOr_return exprLogicalOr154 = null;


        Object char_literal150_tree=null;
        Object char_literal152_tree=null;
        RewriteRuleTokenStream stream_153=new RewriteRuleTokenStream(adaptor,"token 153");
        RewriteRuleTokenStream stream_154=new RewriteRuleTokenStream(adaptor,"token 154");
        RewriteRuleSubtreeStream stream_exprLogicalOr=new RewriteRuleSubtreeStream(adaptor,"rule exprLogicalOr");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 47) ) { return retval; }
            // pollen.g:456:2: ( exprLogicalOr '?' expr ':' expr -> ^( E_QUEST exprLogicalOr expr expr ) | exprLogicalOr -> ^( E_EXPR exprLogicalOr ) )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==IDENT||(LA47_0>=INT_LIT && LA47_0<=CHAR)||(LA47_0>=LOG_NOT && LA47_0<=BIT_NOT)||(LA47_0>=OCT_LIT && LA47_0<=INJECT)||LA47_0==140||LA47_0==149||LA47_0==160||(LA47_0>=162 && LA47_0<=163)||(LA47_0>=166 && LA47_0<=167)||(LA47_0>=200 && LA47_0<=202)) ) {
                int LA47_1 = input.LA(2);

                if ( (synpred81_pollen()) ) {
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
                    // pollen.g:456:4: exprLogicalOr '?' expr ':' expr
                    {
                    pushFollow(FOLLOW_exprLogicalOr_in_expr2309);
                    exprLogicalOr149=exprLogicalOr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_exprLogicalOr.add(exprLogicalOr149.getTree());
                    char_literal150=(Token)match(input,153,FOLLOW_153_in_expr2311); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_153.add(char_literal150);

                    pushFollow(FOLLOW_expr_in_expr2313);
                    expr151=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr151.getTree());
                    char_literal152=(Token)match(input,154,FOLLOW_154_in_expr2315); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_154.add(char_literal152);

                    pushFollow(FOLLOW_expr_in_expr2317);
                    expr153=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr153.getTree());


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
                    // 456:36: -> ^( E_QUEST exprLogicalOr expr expr )
                    {
                        // pollen.g:456:39: ^( E_QUEST exprLogicalOr expr expr )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(E_QUEST, "E_QUEST"), root_1);

                        adaptor.addChild(root_1, stream_exprLogicalOr.nextTree());
                        adaptor.addChild(root_1, stream_expr.nextTree());
                        adaptor.addChild(root_1, stream_expr.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // pollen.g:457:4: exprLogicalOr
                    {
                    pushFollow(FOLLOW_exprLogicalOr_in_expr2334);
                    exprLogicalOr154=exprLogicalOr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_exprLogicalOr.add(exprLogicalOr154.getTree());


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

                    root_0 = (Object)adaptor.nil();
                    // 457:18: -> ^( E_EXPR exprLogicalOr )
                    {
                        // pollen.g:457:21: ^( E_EXPR exprLogicalOr )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(E_EXPR, "E_EXPR"), root_1);

                        adaptor.addChild(root_1, stream_exprLogicalOr.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
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
            if ( state.backtracking>0 ) { memoize(input, 47, expr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "expr"

    public static class exprLogicalOr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "exprLogicalOr"
    // pollen.g:459:1: exprLogicalOr : exprLogicalAnd ( '||' exprLogicalAnd )* ;
    public final pollenParser.exprLogicalOr_return exprLogicalOr() throws RecognitionException {
        pollenParser.exprLogicalOr_return retval = new pollenParser.exprLogicalOr_return();
        retval.start = input.LT(1);
        int exprLogicalOr_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal156=null;
        pollenParser.exprLogicalAnd_return exprLogicalAnd155 = null;

        pollenParser.exprLogicalAnd_return exprLogicalAnd157 = null;


        Object string_literal156_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 48) ) { return retval; }
            // pollen.g:460:2: ( exprLogicalAnd ( '||' exprLogicalAnd )* )
            // pollen.g:460:4: exprLogicalAnd ( '||' exprLogicalAnd )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_exprLogicalAnd_in_exprLogicalOr2358);
            exprLogicalAnd155=exprLogicalAnd();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, exprLogicalAnd155.getTree());
            // pollen.g:460:19: ( '||' exprLogicalAnd )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==155) ) {
                    int LA48_1 = input.LA(2);

                    if ( (synpred82_pollen()) ) {
                        alt48=1;
                    }


                }


                switch (alt48) {
            	case 1 :
            	    // pollen.g:460:20: '||' exprLogicalAnd
            	    {
            	    string_literal156=(Token)match(input,155,FOLLOW_155_in_exprLogicalOr2361); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal156_tree = (Object)adaptor.create(string_literal156);
            	    adaptor.addChild(root_0, string_literal156_tree);
            	    }
            	    pushFollow(FOLLOW_exprLogicalAnd_in_exprLogicalOr2363);
            	    exprLogicalAnd157=exprLogicalAnd();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, exprLogicalAnd157.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 48, exprLogicalOr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "exprLogicalOr"

    public static class exprLogicalAnd_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "exprLogicalAnd"
    // pollen.g:462:1: exprLogicalAnd : exprBitwiseOr ( '&&' exprBitwiseOr )* ;
    public final pollenParser.exprLogicalAnd_return exprLogicalAnd() throws RecognitionException {
        pollenParser.exprLogicalAnd_return retval = new pollenParser.exprLogicalAnd_return();
        retval.start = input.LT(1);
        int exprLogicalAnd_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal159=null;
        pollenParser.exprBitwiseOr_return exprBitwiseOr158 = null;

        pollenParser.exprBitwiseOr_return exprBitwiseOr160 = null;


        Object string_literal159_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 49) ) { return retval; }
            // pollen.g:463:2: ( exprBitwiseOr ( '&&' exprBitwiseOr )* )
            // pollen.g:463:4: exprBitwiseOr ( '&&' exprBitwiseOr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_exprBitwiseOr_in_exprLogicalAnd2375);
            exprBitwiseOr158=exprBitwiseOr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, exprBitwiseOr158.getTree());
            // pollen.g:463:18: ( '&&' exprBitwiseOr )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==156) ) {
                    int LA49_2 = input.LA(2);

                    if ( (synpred83_pollen()) ) {
                        alt49=1;
                    }


                }


                switch (alt49) {
            	case 1 :
            	    // pollen.g:463:19: '&&' exprBitwiseOr
            	    {
            	    string_literal159=(Token)match(input,156,FOLLOW_156_in_exprLogicalAnd2378); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal159_tree = (Object)adaptor.create(string_literal159);
            	    adaptor.addChild(root_0, string_literal159_tree);
            	    }
            	    pushFollow(FOLLOW_exprBitwiseOr_in_exprLogicalAnd2380);
            	    exprBitwiseOr160=exprBitwiseOr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, exprBitwiseOr160.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 49, exprLogicalAnd_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "exprLogicalAnd"

    public static class exprBitwiseOr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "exprBitwiseOr"
    // pollen.g:465:1: exprBitwiseOr : exprBitwiseXor ( '|' exprBitwiseXor )* ;
    public final pollenParser.exprBitwiseOr_return exprBitwiseOr() throws RecognitionException {
        pollenParser.exprBitwiseOr_return retval = new pollenParser.exprBitwiseOr_return();
        retval.start = input.LT(1);
        int exprBitwiseOr_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal162=null;
        pollenParser.exprBitwiseXor_return exprBitwiseXor161 = null;

        pollenParser.exprBitwiseXor_return exprBitwiseXor163 = null;


        Object char_literal162_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 50) ) { return retval; }
            // pollen.g:466:2: ( exprBitwiseXor ( '|' exprBitwiseXor )* )
            // pollen.g:466:4: exprBitwiseXor ( '|' exprBitwiseXor )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_exprBitwiseXor_in_exprBitwiseOr2392);
            exprBitwiseXor161=exprBitwiseXor();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, exprBitwiseXor161.getTree());
            // pollen.g:466:19: ( '|' exprBitwiseXor )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==157) ) {
                    int LA50_1 = input.LA(2);

                    if ( (synpred84_pollen()) ) {
                        alt50=1;
                    }


                }


                switch (alt50) {
            	case 1 :
            	    // pollen.g:466:20: '|' exprBitwiseXor
            	    {
            	    char_literal162=(Token)match(input,157,FOLLOW_157_in_exprBitwiseOr2395); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal162_tree = (Object)adaptor.create(char_literal162);
            	    adaptor.addChild(root_0, char_literal162_tree);
            	    }
            	    pushFollow(FOLLOW_exprBitwiseXor_in_exprBitwiseOr2397);
            	    exprBitwiseXor163=exprBitwiseXor();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, exprBitwiseXor163.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 50, exprBitwiseOr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "exprBitwiseOr"

    public static class exprBitwiseXor_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "exprBitwiseXor"
    // pollen.g:468:1: exprBitwiseXor : exprBitwiseAnd ( '^' exprBitwiseAnd )* ;
    public final pollenParser.exprBitwiseXor_return exprBitwiseXor() throws RecognitionException {
        pollenParser.exprBitwiseXor_return retval = new pollenParser.exprBitwiseXor_return();
        retval.start = input.LT(1);
        int exprBitwiseXor_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal165=null;
        pollenParser.exprBitwiseAnd_return exprBitwiseAnd164 = null;

        pollenParser.exprBitwiseAnd_return exprBitwiseAnd166 = null;


        Object char_literal165_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 51) ) { return retval; }
            // pollen.g:469:2: ( exprBitwiseAnd ( '^' exprBitwiseAnd )* )
            // pollen.g:469:4: exprBitwiseAnd ( '^' exprBitwiseAnd )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_exprBitwiseAnd_in_exprBitwiseXor2409);
            exprBitwiseAnd164=exprBitwiseAnd();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, exprBitwiseAnd164.getTree());
            // pollen.g:469:19: ( '^' exprBitwiseAnd )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==158) ) {
                    int LA51_1 = input.LA(2);

                    if ( (synpred85_pollen()) ) {
                        alt51=1;
                    }


                }


                switch (alt51) {
            	case 1 :
            	    // pollen.g:469:20: '^' exprBitwiseAnd
            	    {
            	    char_literal165=(Token)match(input,158,FOLLOW_158_in_exprBitwiseXor2412); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal165_tree = (Object)adaptor.create(char_literal165);
            	    adaptor.addChild(root_0, char_literal165_tree);
            	    }
            	    pushFollow(FOLLOW_exprBitwiseAnd_in_exprBitwiseXor2414);
            	    exprBitwiseAnd166=exprBitwiseAnd();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, exprBitwiseAnd166.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 51, exprBitwiseXor_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "exprBitwiseXor"

    public static class exprBitwiseAnd_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "exprBitwiseAnd"
    // pollen.g:471:1: exprBitwiseAnd : exprEquality ( '&' exprEquality )* ;
    public final pollenParser.exprBitwiseAnd_return exprBitwiseAnd() throws RecognitionException {
        pollenParser.exprBitwiseAnd_return retval = new pollenParser.exprBitwiseAnd_return();
        retval.start = input.LT(1);
        int exprBitwiseAnd_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal168=null;
        pollenParser.exprEquality_return exprEquality167 = null;

        pollenParser.exprEquality_return exprEquality169 = null;


        Object char_literal168_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 52) ) { return retval; }
            // pollen.g:472:2: ( exprEquality ( '&' exprEquality )* )
            // pollen.g:472:4: exprEquality ( '&' exprEquality )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_exprEquality_in_exprBitwiseAnd2426);
            exprEquality167=exprEquality();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, exprEquality167.getTree());
            // pollen.g:472:17: ( '&' exprEquality )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==159) ) {
                    int LA52_2 = input.LA(2);

                    if ( (synpred86_pollen()) ) {
                        alt52=1;
                    }


                }


                switch (alt52) {
            	case 1 :
            	    // pollen.g:472:18: '&' exprEquality
            	    {
            	    char_literal168=(Token)match(input,159,FOLLOW_159_in_exprBitwiseAnd2429); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal168_tree = (Object)adaptor.create(char_literal168);
            	    adaptor.addChild(root_0, char_literal168_tree);
            	    }
            	    pushFollow(FOLLOW_exprEquality_in_exprBitwiseAnd2431);
            	    exprEquality169=exprEquality();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, exprEquality169.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 52, exprBitwiseAnd_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "exprBitwiseAnd"

    public static class exprEquality_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "exprEquality"
    // pollen.g:474:1: exprEquality : exprRelational ( equalityOp exprRelational )* ;
    public final pollenParser.exprEquality_return exprEquality() throws RecognitionException {
        pollenParser.exprEquality_return retval = new pollenParser.exprEquality_return();
        retval.start = input.LT(1);
        int exprEquality_StartIndex = input.index();
        Object root_0 = null;

        pollenParser.exprRelational_return exprRelational170 = null;

        pollenParser.equalityOp_return equalityOp171 = null;

        pollenParser.exprRelational_return exprRelational172 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 53) ) { return retval; }
            // pollen.g:475:2: ( exprRelational ( equalityOp exprRelational )* )
            // pollen.g:475:4: exprRelational ( equalityOp exprRelational )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_exprRelational_in_exprEquality2443);
            exprRelational170=exprRelational();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, exprRelational170.getTree());
            // pollen.g:475:19: ( equalityOp exprRelational )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( ((LA53_0>=EQ && LA53_0<=NOT_EQ)) ) {
                    int LA53_1 = input.LA(2);

                    if ( (synpred87_pollen()) ) {
                        alt53=1;
                    }


                }


                switch (alt53) {
            	case 1 :
            	    // pollen.g:475:21: equalityOp exprRelational
            	    {
            	    pushFollow(FOLLOW_equalityOp_in_exprEquality2447);
            	    equalityOp171=equalityOp();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, equalityOp171.getTree());
            	    pushFollow(FOLLOW_exprRelational_in_exprEquality2449);
            	    exprRelational172=exprRelational();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, exprRelational172.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 53, exprEquality_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "exprEquality"

    public static class exprRelational_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "exprRelational"
    // pollen.g:477:1: exprRelational : exprShift ( relationalOp exprShift )* ;
    public final pollenParser.exprRelational_return exprRelational() throws RecognitionException {
        pollenParser.exprRelational_return retval = new pollenParser.exprRelational_return();
        retval.start = input.LT(1);
        int exprRelational_StartIndex = input.index();
        Object root_0 = null;

        pollenParser.exprShift_return exprShift173 = null;

        pollenParser.relationalOp_return relationalOp174 = null;

        pollenParser.exprShift_return exprShift175 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 54) ) { return retval; }
            // pollen.g:478:2: ( exprShift ( relationalOp exprShift )* )
            // pollen.g:478:4: exprShift ( relationalOp exprShift )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_exprShift_in_exprRelational2461);
            exprShift173=exprShift();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, exprShift173.getTree());
            // pollen.g:478:15: ( relationalOp exprShift )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( ((LA54_0>=LT_EQ && LA54_0<=GT_EQ)||(LA54_0>=144 && LA54_0<=145)) ) {
                    int LA54_2 = input.LA(2);

                    if ( (synpred88_pollen()) ) {
                        alt54=1;
                    }


                }


                switch (alt54) {
            	case 1 :
            	    // pollen.g:478:17: relationalOp exprShift
            	    {
            	    pushFollow(FOLLOW_relationalOp_in_exprRelational2466);
            	    relationalOp174=relationalOp();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, relationalOp174.getTree());
            	    pushFollow(FOLLOW_exprShift_in_exprRelational2468);
            	    exprShift175=exprShift();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, exprShift175.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 54, exprRelational_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "exprRelational"

    public static class exprShift_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "exprShift"
    // pollen.g:480:1: exprShift : exprAddSub ( shiftOp exprAddSub )* ;
    public final pollenParser.exprShift_return exprShift() throws RecognitionException {
        pollenParser.exprShift_return retval = new pollenParser.exprShift_return();
        retval.start = input.LT(1);
        int exprShift_StartIndex = input.index();
        Object root_0 = null;

        pollenParser.exprAddSub_return exprAddSub176 = null;

        pollenParser.shiftOp_return shiftOp177 = null;

        pollenParser.exprAddSub_return exprAddSub178 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 55) ) { return retval; }
            // pollen.g:481:2: ( exprAddSub ( shiftOp exprAddSub )* )
            // pollen.g:481:4: exprAddSub ( shiftOp exprAddSub )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_exprAddSub_in_exprShift2481);
            exprAddSub176=exprAddSub();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, exprAddSub176.getTree());
            // pollen.g:481:15: ( shiftOp exprAddSub )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( ((LA55_0>=146 && LA55_0<=147)) ) {
                    int LA55_2 = input.LA(2);

                    if ( (synpred89_pollen()) ) {
                        alt55=1;
                    }


                }


                switch (alt55) {
            	case 1 :
            	    // pollen.g:481:17: shiftOp exprAddSub
            	    {
            	    pushFollow(FOLLOW_shiftOp_in_exprShift2485);
            	    shiftOp177=shiftOp();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, shiftOp177.getTree());
            	    pushFollow(FOLLOW_exprAddSub_in_exprShift2488);
            	    exprAddSub178=exprAddSub();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, exprAddSub178.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 55, exprShift_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "exprShift"

    public static class exprAddSub_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "exprAddSub"
    // pollen.g:483:1: exprAddSub : exprMultDiv ( addSubOp exprMultDiv )* ;
    public final pollenParser.exprAddSub_return exprAddSub() throws RecognitionException {
        pollenParser.exprAddSub_return retval = new pollenParser.exprAddSub_return();
        retval.start = input.LT(1);
        int exprAddSub_StartIndex = input.index();
        Object root_0 = null;

        pollenParser.exprMultDiv_return exprMultDiv179 = null;

        pollenParser.addSubOp_return addSubOp180 = null;

        pollenParser.exprMultDiv_return exprMultDiv181 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 56) ) { return retval; }
            // pollen.g:484:2: ( exprMultDiv ( addSubOp exprMultDiv )* )
            // pollen.g:484:4: exprMultDiv ( addSubOp exprMultDiv )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_exprMultDiv_in_exprAddSub2501);
            exprMultDiv179=exprMultDiv();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, exprMultDiv179.getTree());
            // pollen.g:484:16: ( addSubOp exprMultDiv )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( ((LA56_0>=148 && LA56_0<=149)) ) {
                    int LA56_1 = input.LA(2);

                    if ( (synpred90_pollen()) ) {
                        alt56=1;
                    }


                }


                switch (alt56) {
            	case 1 :
            	    // pollen.g:484:17: addSubOp exprMultDiv
            	    {
            	    pushFollow(FOLLOW_addSubOp_in_exprAddSub2504);
            	    addSubOp180=addSubOp();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, addSubOp180.getTree());
            	    pushFollow(FOLLOW_exprMultDiv_in_exprAddSub2506);
            	    exprMultDiv181=exprMultDiv();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, exprMultDiv181.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 56, exprAddSub_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "exprAddSub"

    public static class exprMultDiv_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "exprMultDiv"
    // pollen.g:486:1: exprMultDiv : exprUnary ( multDivModOp exprUnary )* ;
    public final pollenParser.exprMultDiv_return exprMultDiv() throws RecognitionException {
        pollenParser.exprMultDiv_return retval = new pollenParser.exprMultDiv_return();
        retval.start = input.LT(1);
        int exprMultDiv_StartIndex = input.index();
        Object root_0 = null;

        pollenParser.exprUnary_return exprUnary182 = null;

        pollenParser.multDivModOp_return multDivModOp183 = null;

        pollenParser.exprUnary_return exprUnary184 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 57) ) { return retval; }
            // pollen.g:487:2: ( exprUnary ( multDivModOp exprUnary )* )
            // pollen.g:487:4: exprUnary ( multDivModOp exprUnary )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_exprUnary_in_exprMultDiv2518);
            exprUnary182=exprUnary();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, exprUnary182.getTree());
            // pollen.g:487:14: ( multDivModOp exprUnary )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( ((LA57_0>=150 && LA57_0<=152)) ) {
                    int LA57_1 = input.LA(2);

                    if ( (synpred91_pollen()) ) {
                        alt57=1;
                    }


                }


                switch (alt57) {
            	case 1 :
            	    // pollen.g:487:15: multDivModOp exprUnary
            	    {
            	    pushFollow(FOLLOW_multDivModOp_in_exprMultDiv2521);
            	    multDivModOp183=multDivModOp();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, multDivModOp183.getTree());
            	    pushFollow(FOLLOW_exprUnary_in_exprMultDiv2523);
            	    exprUnary184=exprUnary();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, exprUnary184.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 57, exprMultDiv_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "exprMultDiv"

    public static class exprUnary_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "exprUnary"
    // pollen.g:489:1: exprUnary : ( primitiveLit | injectionCode | nullLit | arrayLit | LOG_NOT expr | BIT_NOT expr | '(' expr ')' | '-' expr | varOrFcnOrArray ( ( '++' ) | ( '--' ) )? | ( ( '++' ) | ( '--' ) ) varOrFcnOrArray );
    public final pollenParser.exprUnary_return exprUnary() throws RecognitionException {
        pollenParser.exprUnary_return retval = new pollenParser.exprUnary_return();
        retval.start = input.LT(1);
        int exprUnary_StartIndex = input.index();
        Object root_0 = null;

        Token LOG_NOT189=null;
        Token BIT_NOT191=null;
        Token char_literal193=null;
        Token char_literal195=null;
        Token char_literal196=null;
        Token string_literal199=null;
        Token string_literal200=null;
        Token string_literal201=null;
        Token string_literal202=null;
        pollenParser.primitiveLit_return primitiveLit185 = null;

        pollenParser.injectionCode_return injectionCode186 = null;

        pollenParser.nullLit_return nullLit187 = null;

        pollenParser.arrayLit_return arrayLit188 = null;

        pollenParser.expr_return expr190 = null;

        pollenParser.expr_return expr192 = null;

        pollenParser.expr_return expr194 = null;

        pollenParser.expr_return expr197 = null;

        pollenParser.varOrFcnOrArray_return varOrFcnOrArray198 = null;

        pollenParser.varOrFcnOrArray_return varOrFcnOrArray203 = null;


        Object LOG_NOT189_tree=null;
        Object BIT_NOT191_tree=null;
        Object char_literal193_tree=null;
        Object char_literal195_tree=null;
        Object char_literal196_tree=null;
        Object string_literal199_tree=null;
        Object string_literal200_tree=null;
        Object string_literal201_tree=null;
        Object string_literal202_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 58) ) { return retval; }
            // pollen.g:490:2: ( primitiveLit | injectionCode | nullLit | arrayLit | LOG_NOT expr | BIT_NOT expr | '(' expr ')' | '-' expr | varOrFcnOrArray ( ( '++' ) | ( '--' ) )? | ( ( '++' ) | ( '--' ) ) varOrFcnOrArray )
            int alt60=10;
            alt60 = dfa60.predict(input);
            switch (alt60) {
                case 1 :
                    // pollen.g:490:4: primitiveLit
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_primitiveLit_in_exprUnary2535);
                    primitiveLit185=primitiveLit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveLit185.getTree());

                    }
                    break;
                case 2 :
                    // pollen.g:491:4: injectionCode
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_injectionCode_in_exprUnary2540);
                    injectionCode186=injectionCode();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, injectionCode186.getTree());

                    }
                    break;
                case 3 :
                    // pollen.g:492:4: nullLit
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_nullLit_in_exprUnary2545);
                    nullLit187=nullLit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, nullLit187.getTree());

                    }
                    break;
                case 4 :
                    // pollen.g:493:4: arrayLit
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_arrayLit_in_exprUnary2550);
                    arrayLit188=arrayLit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, arrayLit188.getTree());

                    }
                    break;
                case 5 :
                    // pollen.g:494:4: LOG_NOT expr
                    {
                    root_0 = (Object)adaptor.nil();

                    LOG_NOT189=(Token)match(input,LOG_NOT,FOLLOW_LOG_NOT_in_exprUnary2555); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LOG_NOT189_tree = (Object)adaptor.create(LOG_NOT189);
                    adaptor.addChild(root_0, LOG_NOT189_tree);
                    }
                    pushFollow(FOLLOW_expr_in_exprUnary2557);
                    expr190=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr190.getTree());

                    }
                    break;
                case 6 :
                    // pollen.g:495:4: BIT_NOT expr
                    {
                    root_0 = (Object)adaptor.nil();

                    BIT_NOT191=(Token)match(input,BIT_NOT,FOLLOW_BIT_NOT_in_exprUnary2562); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    BIT_NOT191_tree = (Object)adaptor.create(BIT_NOT191);
                    adaptor.addChild(root_0, BIT_NOT191_tree);
                    }
                    pushFollow(FOLLOW_expr_in_exprUnary2564);
                    expr192=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr192.getTree());

                    }
                    break;
                case 7 :
                    // pollen.g:496:4: '(' expr ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal193=(Token)match(input,160,FOLLOW_160_in_exprUnary2569); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal193_tree = (Object)adaptor.create(char_literal193);
                    adaptor.addChild(root_0, char_literal193_tree);
                    }
                    pushFollow(FOLLOW_expr_in_exprUnary2571);
                    expr194=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr194.getTree());
                    char_literal195=(Token)match(input,161,FOLLOW_161_in_exprUnary2573); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal195_tree = (Object)adaptor.create(char_literal195);
                    adaptor.addChild(root_0, char_literal195_tree);
                    }

                    }
                    break;
                case 8 :
                    // pollen.g:497:4: '-' expr
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal196=(Token)match(input,149,FOLLOW_149_in_exprUnary2578); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal196_tree = (Object)adaptor.create(char_literal196);
                    adaptor.addChild(root_0, char_literal196_tree);
                    }
                    pushFollow(FOLLOW_expr_in_exprUnary2580);
                    expr197=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr197.getTree());

                    }
                    break;
                case 9 :
                    // pollen.g:498:4: varOrFcnOrArray ( ( '++' ) | ( '--' ) )?
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_varOrFcnOrArray_in_exprUnary2585);
                    varOrFcnOrArray198=varOrFcnOrArray();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varOrFcnOrArray198.getTree());
                    // pollen.g:498:20: ( ( '++' ) | ( '--' ) )?
                    int alt58=3;
                    int LA58_0 = input.LA(1);

                    if ( (LA58_0==162) ) {
                        int LA58_2 = input.LA(2);

                        if ( (synpred100_pollen()) ) {
                            alt58=1;
                        }
                    }
                    else if ( (LA58_0==163) ) {
                        int LA58_4 = input.LA(2);

                        if ( (synpred101_pollen()) ) {
                            alt58=2;
                        }
                    }
                    switch (alt58) {
                        case 1 :
                            // pollen.g:498:21: ( '++' )
                            {
                            // pollen.g:498:21: ( '++' )
                            // pollen.g:498:22: '++'
                            {
                            string_literal199=(Token)match(input,162,FOLLOW_162_in_exprUnary2589); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            string_literal199_tree = (Object)adaptor.create(string_literal199);
                            adaptor.addChild(root_0, string_literal199_tree);
                            }

                            }


                            }
                            break;
                        case 2 :
                            // pollen.g:498:30: ( '--' )
                            {
                            // pollen.g:498:30: ( '--' )
                            // pollen.g:498:31: '--'
                            {
                            string_literal200=(Token)match(input,163,FOLLOW_163_in_exprUnary2595); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            string_literal200_tree = (Object)adaptor.create(string_literal200);
                            adaptor.addChild(root_0, string_literal200_tree);
                            }

                            }


                            }
                            break;

                    }


                    }
                    break;
                case 10 :
                    // pollen.g:499:4: ( ( '++' ) | ( '--' ) ) varOrFcnOrArray
                    {
                    root_0 = (Object)adaptor.nil();

                    // pollen.g:499:4: ( ( '++' ) | ( '--' ) )
                    int alt59=2;
                    int LA59_0 = input.LA(1);

                    if ( (LA59_0==162) ) {
                        alt59=1;
                    }
                    else if ( (LA59_0==163) ) {
                        alt59=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 59, 0, input);

                        throw nvae;
                    }
                    switch (alt59) {
                        case 1 :
                            // pollen.g:499:5: ( '++' )
                            {
                            // pollen.g:499:5: ( '++' )
                            // pollen.g:499:6: '++'
                            {
                            string_literal201=(Token)match(input,162,FOLLOW_162_in_exprUnary2606); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            string_literal201_tree = (Object)adaptor.create(string_literal201);
                            adaptor.addChild(root_0, string_literal201_tree);
                            }

                            }


                            }
                            break;
                        case 2 :
                            // pollen.g:499:14: ( '--' )
                            {
                            // pollen.g:499:14: ( '--' )
                            // pollen.g:499:15: '--'
                            {
                            string_literal202=(Token)match(input,163,FOLLOW_163_in_exprUnary2612); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            string_literal202_tree = (Object)adaptor.create(string_literal202);
                            adaptor.addChild(root_0, string_literal202_tree);
                            }

                            }


                            }
                            break;

                    }

                    pushFollow(FOLLOW_varOrFcnOrArray_in_exprUnary2616);
                    varOrFcnOrArray203=varOrFcnOrArray();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varOrFcnOrArray203.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 58, exprUnary_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "exprUnary"

    public static class fcnDefinition_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "fcnDefinition"
    // pollen.g:501:1: fcnDefinition : ( 'public' )? ( 'host' )? fcnType_fcnName fcnFormalParameterList fcnBody -> ^( D_FCN_DEF fcnType_fcnName fcnFormalParameterList fcnBody ) ;
    public final pollenParser.fcnDefinition_return fcnDefinition() throws RecognitionException {
        pollenParser.fcnDefinition_return retval = new pollenParser.fcnDefinition_return();
        retval.start = input.LT(1);
        int fcnDefinition_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal204=null;
        Token string_literal205=null;
        pollenParser.fcnType_fcnName_return fcnType_fcnName206 = null;

        pollenParser.fcnFormalParameterList_return fcnFormalParameterList207 = null;

        pollenParser.fcnBody_return fcnBody208 = null;


        Object string_literal204_tree=null;
        Object string_literal205_tree=null;
        RewriteRuleTokenStream stream_164=new RewriteRuleTokenStream(adaptor,"token 164");
        RewriteRuleTokenStream stream_165=new RewriteRuleTokenStream(adaptor,"token 165");
        RewriteRuleSubtreeStream stream_fcnFormalParameterList=new RewriteRuleSubtreeStream(adaptor,"rule fcnFormalParameterList");
        RewriteRuleSubtreeStream stream_fcnType_fcnName=new RewriteRuleSubtreeStream(adaptor,"rule fcnType_fcnName");
        RewriteRuleSubtreeStream stream_fcnBody=new RewriteRuleSubtreeStream(adaptor,"rule fcnBody");

        	atFlags.clear();			

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 59) ) { return retval; }
            // pollen.g:508:2: ( ( 'public' )? ( 'host' )? fcnType_fcnName fcnFormalParameterList fcnBody -> ^( D_FCN_DEF fcnType_fcnName fcnFormalParameterList fcnBody ) )
            // pollen.g:508:4: ( 'public' )? ( 'host' )? fcnType_fcnName fcnFormalParameterList fcnBody
            {
            // pollen.g:508:4: ( 'public' )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==164) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // pollen.g:508:5: 'public'
                    {
                    string_literal204=(Token)match(input,164,FOLLOW_164_in_fcnDefinition2636); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_164.add(string_literal204);

                    if ( state.backtracking==0 ) {
                       atFlags.add(AttrFlags.PUBLIC); 
                    }

                    }
                    break;

            }

            // pollen.g:509:3: ( 'host' )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==165) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // pollen.g:509:4: 'host'
                    {
                    string_literal205=(Token)match(input,165,FOLLOW_165_in_fcnDefinition2647); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_165.add(string_literal205);

                    if ( state.backtracking==0 ) {
                       atFlags.add(AttrFlags.HOST); 
                    }

                    }
                    break;

            }

            pushFollow(FOLLOW_fcnType_fcnName_in_fcnDefinition2657);
            fcnType_fcnName206=fcnType_fcnName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_fcnType_fcnName.add(fcnType_fcnName206.getTree());
            pushFollow(FOLLOW_fcnFormalParameterList_in_fcnDefinition2659);
            fcnFormalParameterList207=fcnFormalParameterList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_fcnFormalParameterList.add(fcnFormalParameterList207.getTree());
            pushFollow(FOLLOW_fcnBody_in_fcnDefinition2661);
            fcnBody208=fcnBody();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_fcnBody.add(fcnBody208.getTree());


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
            // 511:3: -> ^( D_FCN_DEF fcnType_fcnName fcnFormalParameterList fcnBody )
            {
                // pollen.g:511:6: ^( D_FCN_DEF fcnType_fcnName fcnFormalParameterList fcnBody )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(D_FCN_DEF, "D_FCN_DEF"), root_1);

                adaptor.addChild(root_1, stream_fcnType_fcnName.nextTree());
                adaptor.addChild(root_1, stream_fcnFormalParameterList.nextTree());
                adaptor.addChild(root_1, stream_fcnBody.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
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
            if ( state.backtracking>0 ) { memoize(input, 59, fcnDefinition_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "fcnDefinition"

    public static class fcnDefinitionHost_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "fcnDefinitionHost"
    // pollen.g:513:1: fcnDefinitionHost : ( 'public' )? ( 'host' )? fcnType_fcnName fcnFormalParameterList fcnBody -> ^( D_FCN_DEF fcnType_fcnName fcnFormalParameterList fcnBody ) ;
    public final pollenParser.fcnDefinitionHost_return fcnDefinitionHost() throws RecognitionException {
        pollenParser.fcnDefinitionHost_return retval = new pollenParser.fcnDefinitionHost_return();
        retval.start = input.LT(1);
        int fcnDefinitionHost_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal209=null;
        Token string_literal210=null;
        pollenParser.fcnType_fcnName_return fcnType_fcnName211 = null;

        pollenParser.fcnFormalParameterList_return fcnFormalParameterList212 = null;

        pollenParser.fcnBody_return fcnBody213 = null;


        Object string_literal209_tree=null;
        Object string_literal210_tree=null;
        RewriteRuleTokenStream stream_164=new RewriteRuleTokenStream(adaptor,"token 164");
        RewriteRuleTokenStream stream_165=new RewriteRuleTokenStream(adaptor,"token 165");
        RewriteRuleSubtreeStream stream_fcnFormalParameterList=new RewriteRuleSubtreeStream(adaptor,"rule fcnFormalParameterList");
        RewriteRuleSubtreeStream stream_fcnType_fcnName=new RewriteRuleSubtreeStream(adaptor,"rule fcnType_fcnName");
        RewriteRuleSubtreeStream stream_fcnBody=new RewriteRuleSubtreeStream(adaptor,"rule fcnBody");

        	atFlags.clear();			

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 60) ) { return retval; }
            // pollen.g:521:2: ( ( 'public' )? ( 'host' )? fcnType_fcnName fcnFormalParameterList fcnBody -> ^( D_FCN_DEF fcnType_fcnName fcnFormalParameterList fcnBody ) )
            // pollen.g:521:4: ( 'public' )? ( 'host' )? fcnType_fcnName fcnFormalParameterList fcnBody
            {
            // pollen.g:521:4: ( 'public' )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==164) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // pollen.g:521:5: 'public'
                    {
                    string_literal209=(Token)match(input,164,FOLLOW_164_in_fcnDefinitionHost2697); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_164.add(string_literal209);


                    }
                    break;

            }

            // pollen.g:521:16: ( 'host' )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==165) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // pollen.g:521:17: 'host'
                    {
                    string_literal210=(Token)match(input,165,FOLLOW_165_in_fcnDefinitionHost2702); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_165.add(string_literal210);

                    if ( state.backtracking==0 ) {
                       atFlags.add(AttrFlags.HOST); 
                    }

                    }
                    break;

            }

            pushFollow(FOLLOW_fcnType_fcnName_in_fcnDefinitionHost2713);
            fcnType_fcnName211=fcnType_fcnName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_fcnType_fcnName.add(fcnType_fcnName211.getTree());
            pushFollow(FOLLOW_fcnFormalParameterList_in_fcnDefinitionHost2716);
            fcnFormalParameterList212=fcnFormalParameterList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_fcnFormalParameterList.add(fcnFormalParameterList212.getTree());
            pushFollow(FOLLOW_fcnBody_in_fcnDefinitionHost2718);
            fcnBody213=fcnBody();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_fcnBody.add(fcnBody213.getTree());
            if ( state.backtracking==0 ) {
               	atFlags.add(AttrFlags.PUBLIC); /* enforce */ 	
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
            // 527:3: -> ^( D_FCN_DEF fcnType_fcnName fcnFormalParameterList fcnBody )
            {
                // pollen.g:527:6: ^( D_FCN_DEF fcnType_fcnName fcnFormalParameterList fcnBody )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(D_FCN_DEF, "D_FCN_DEF"), root_1);

                adaptor.addChild(root_1, stream_fcnType_fcnName.nextTree());
                adaptor.addChild(root_1, stream_fcnFormalParameterList.nextTree());
                adaptor.addChild(root_1, stream_fcnBody.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
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
            if ( state.backtracking>0 ) { memoize(input, 60, fcnDefinitionHost_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "fcnDefinitionHost"

    public static class fcnAttr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "fcnAttr"
    // pollen.g:534:1: fcnAttr : ( 'public' )? ( 'host' )? ;
    public final pollenParser.fcnAttr_return fcnAttr() throws RecognitionException {
        pollenParser.fcnAttr_return retval = new pollenParser.fcnAttr_return();
        retval.start = input.LT(1);
        int fcnAttr_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal214=null;
        Token string_literal215=null;

        Object string_literal214_tree=null;
        Object string_literal215_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 61) ) { return retval; }
            // pollen.g:535:2: ( ( 'public' )? ( 'host' )? )
            // pollen.g:535:4: ( 'public' )? ( 'host' )?
            {
            root_0 = (Object)adaptor.nil();

            // pollen.g:535:4: ( 'public' )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==164) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // pollen.g:535:5: 'public'
                    {
                    string_literal214=(Token)match(input,164,FOLLOW_164_in_fcnAttr2755); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal214_tree = (Object)adaptor.create(string_literal214);
                    adaptor.addChild(root_0, string_literal214_tree);
                    }
                    if ( state.backtracking==0 ) {
                       atFlags.add(AttrFlags.PUBLIC); 
                    }

                    }
                    break;

            }

            // pollen.g:536:3: ( 'host' )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==165) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // pollen.g:536:4: 'host'
                    {
                    string_literal215=(Token)match(input,165,FOLLOW_165_in_fcnAttr2766); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal215_tree = (Object)adaptor.create(string_literal215);
                    adaptor.addChild(root_0, string_literal215_tree);
                    }
                    if ( state.backtracking==0 ) {
                       atFlags.add(AttrFlags.HOST); 
                    }

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
            if ( state.backtracking>0 ) { memoize(input, 61, fcnAttr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "fcnAttr"

    public static class fcnBody_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "fcnBody"
    // pollen.g:538:1: fcnBody : braceOpen ( stmts ) braceClose -> ^( FCNBODY stmts ) ;
    public final pollenParser.fcnBody_return fcnBody() throws RecognitionException {
        pollenParser.fcnBody_return retval = new pollenParser.fcnBody_return();
        retval.start = input.LT(1);
        int fcnBody_StartIndex = input.index();
        Object root_0 = null;

        pollenParser.braceOpen_return braceOpen216 = null;

        pollenParser.stmts_return stmts217 = null;

        pollenParser.braceClose_return braceClose218 = null;


        RewriteRuleSubtreeStream stream_stmts=new RewriteRuleSubtreeStream(adaptor,"rule stmts");
        RewriteRuleSubtreeStream stream_braceOpen=new RewriteRuleSubtreeStream(adaptor,"rule braceOpen");
        RewriteRuleSubtreeStream stream_braceClose=new RewriteRuleSubtreeStream(adaptor,"rule braceClose");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 62) ) { return retval; }
            // pollen.g:539:3: ( braceOpen ( stmts ) braceClose -> ^( FCNBODY stmts ) )
            // pollen.g:539:5: braceOpen ( stmts ) braceClose
            {
            pushFollow(FOLLOW_braceOpen_in_fcnBody2782);
            braceOpen216=braceOpen();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_braceOpen.add(braceOpen216.getTree());
            // pollen.g:539:15: ( stmts )
            // pollen.g:539:16: stmts
            {
            pushFollow(FOLLOW_stmts_in_fcnBody2785);
            stmts217=stmts();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_stmts.add(stmts217.getTree());

            }

            pushFollow(FOLLOW_braceClose_in_fcnBody2789);
            braceClose218=braceClose();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_braceClose.add(braceClose218.getTree());


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
            // 539:36: -> ^( FCNBODY stmts )
            {
                // pollen.g:539:39: ^( FCNBODY stmts )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FCNBODY, "FCNBODY"), root_1);

                adaptor.addChild(root_1, stream_stmts.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
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
            if ( state.backtracking>0 ) { memoize(input, 62, fcnBody_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "fcnBody"

    public static class fcnDeclaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "fcnDeclaration"
    // pollen.g:541:1: fcnDeclaration : ( 'public' )? ( 'host' )? fcnType_fcnName ( fcnFormalParameterList ) delim -> ^( D_FCN_DCL fcnType_fcnName fcnFormalParameterList ) ;
    public final pollenParser.fcnDeclaration_return fcnDeclaration() throws RecognitionException {
        pollenParser.fcnDeclaration_return retval = new pollenParser.fcnDeclaration_return();
        retval.start = input.LT(1);
        int fcnDeclaration_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal219=null;
        Token string_literal220=null;
        pollenParser.fcnType_fcnName_return fcnType_fcnName221 = null;

        pollenParser.fcnFormalParameterList_return fcnFormalParameterList222 = null;

        pollenParser.delim_return delim223 = null;


        Object string_literal219_tree=null;
        Object string_literal220_tree=null;
        RewriteRuleTokenStream stream_164=new RewriteRuleTokenStream(adaptor,"token 164");
        RewriteRuleTokenStream stream_165=new RewriteRuleTokenStream(adaptor,"token 165");
        RewriteRuleSubtreeStream stream_fcnFormalParameterList=new RewriteRuleSubtreeStream(adaptor,"rule fcnFormalParameterList");
        RewriteRuleSubtreeStream stream_fcnType_fcnName=new RewriteRuleSubtreeStream(adaptor,"rule fcnType_fcnName");
        RewriteRuleSubtreeStream stream_delim=new RewriteRuleSubtreeStream(adaptor,"rule delim");

        	atFlags.clear();			

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 63) ) { return retval; }
            // pollen.g:548:4: ( ( 'public' )? ( 'host' )? fcnType_fcnName ( fcnFormalParameterList ) delim -> ^( D_FCN_DCL fcnType_fcnName fcnFormalParameterList ) )
            // pollen.g:548:6: ( 'public' )? ( 'host' )? fcnType_fcnName ( fcnFormalParameterList ) delim
            {
            // pollen.g:548:6: ( 'public' )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==164) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // pollen.g:548:7: 'public'
                    {
                    string_literal219=(Token)match(input,164,FOLLOW_164_in_fcnDeclaration2821); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_164.add(string_literal219);

                    if ( state.backtracking==0 ) {
                       atFlags.add(AttrFlags.PUBLIC); 
                    }

                    }
                    break;

            }

            // pollen.g:549:3: ( 'host' )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==165) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // pollen.g:549:4: 'host'
                    {
                    string_literal220=(Token)match(input,165,FOLLOW_165_in_fcnDeclaration2832); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_165.add(string_literal220);

                    if ( state.backtracking==0 ) {
                       atFlags.add(AttrFlags.HOST); 
                    }

                    }
                    break;

            }

            pushFollow(FOLLOW_fcnType_fcnName_in_fcnDeclaration2842);
            fcnType_fcnName221=fcnType_fcnName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_fcnType_fcnName.add(fcnType_fcnName221.getTree());
            // pollen.g:550:19: ( fcnFormalParameterList )
            // pollen.g:550:20: fcnFormalParameterList
            {
            pushFollow(FOLLOW_fcnFormalParameterList_in_fcnDeclaration2845);
            fcnFormalParameterList222=fcnFormalParameterList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_fcnFormalParameterList.add(fcnFormalParameterList222.getTree());

            }

            pushFollow(FOLLOW_delim_in_fcnDeclaration2848);
            delim223=delim();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_delim.add(delim223.getTree());


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

            root_0 = (Object)adaptor.nil();
            // 551:4: -> ^( D_FCN_DCL fcnType_fcnName fcnFormalParameterList )
            {
                // pollen.g:551:7: ^( D_FCN_DCL fcnType_fcnName fcnFormalParameterList )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(D_FCN_DCL, "D_FCN_DCL"), root_1);

                adaptor.addChild(root_1, stream_fcnType_fcnName.nextTree());
                adaptor.addChild(root_1, stream_fcnFormalParameterList.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
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
            if ( state.backtracking>0 ) { memoize(input, 63, fcnDeclaration_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "fcnDeclaration"

    public static class fcnType_fcnName_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "fcnType_fcnName"
    // pollen.g:553:1: fcnType_fcnName : ( typeName qualName -> ^( D_FCN_TYP_NM typeName qualName ) | {...}? typeName -> ^( D_FCN_CTOR typeName ) | qualName -> ^( D_FCN_TYP_NM D_VOID qualName ) | ( '(' typeName ( ',' typeName )* ')' qualName )=> fcnTypes_fcnName );
    public final pollenParser.fcnType_fcnName_return fcnType_fcnName() throws RecognitionException {
        pollenParser.fcnType_fcnName_return retval = new pollenParser.fcnType_fcnName_return();
        retval.start = input.LT(1);
        int fcnType_fcnName_StartIndex = input.index();
        Object root_0 = null;

        pollenParser.typeName_return typeName224 = null;

        pollenParser.qualName_return qualName225 = null;

        pollenParser.typeName_return typeName226 = null;

        pollenParser.qualName_return qualName227 = null;

        pollenParser.fcnTypes_fcnName_return fcnTypes_fcnName228 = null;


        RewriteRuleSubtreeStream stream_typeName=new RewriteRuleSubtreeStream(adaptor,"rule typeName");
        RewriteRuleSubtreeStream stream_qualName=new RewriteRuleSubtreeStream(adaptor,"rule qualName");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 64) ) { return retval; }
            // pollen.g:555:2: ( typeName qualName -> ^( D_FCN_TYP_NM typeName qualName ) | {...}? typeName -> ^( D_FCN_CTOR typeName ) | qualName -> ^( D_FCN_TYP_NM D_VOID qualName ) | ( '(' typeName ( ',' typeName )* ')' qualName )=> fcnTypes_fcnName )
            int alt69=4;
            int LA69_0 = input.LA(1);

            if ( ((LA69_0>=191 && LA69_0<=199)) ) {
                int LA69_1 = input.LA(2);

                if ( (synpred112_pollen()) ) {
                    alt69=1;
                }
                else if ( ((synpred113_pollen()&&(input.LT(1).getText().equals(ti.getTypeName()) ))) ) {
                    alt69=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 69, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA69_0==IDENT) ) {
                int LA69_2 = input.LA(2);

                if ( (synpred112_pollen()) ) {
                    alt69=1;
                }
                else if ( ((synpred113_pollen()&&(input.LT(1).getText().equals(ti.getTypeName()) ))) ) {
                    alt69=2;
                }
                else if ( (synpred114_pollen()) ) {
                    alt69=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 69, 2, input);

                    throw nvae;
                }
            }
            else if ( (LA69_0==160) && (synpred116_pollen())) {
                alt69=4;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 69, 0, input);

                throw nvae;
            }
            switch (alt69) {
                case 1 :
                    // pollen.g:555:4: typeName qualName
                    {
                    pushFollow(FOLLOW_typeName_in_fcnType_fcnName2874);
                    typeName224=typeName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeName.add(typeName224.getTree());
                    pushFollow(FOLLOW_qualName_in_fcnType_fcnName2876);
                    qualName225=qualName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_qualName.add(qualName225.getTree());


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
                    // 556:3: -> ^( D_FCN_TYP_NM typeName qualName )
                    {
                        // pollen.g:556:6: ^( D_FCN_TYP_NM typeName qualName )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(D_FCN_TYP_NM, "D_FCN_TYP_NM"), root_1);

                        adaptor.addChild(root_1, stream_typeName.nextTree());
                        adaptor.addChild(root_1, stream_qualName.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // pollen.g:557:4: {...}? typeName
                    {
                    if ( !((input.LT(1).getText().equals(ti.getTypeName()) )) ) {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        throw new FailedPredicateException(input, "fcnType_fcnName", "input.LT(1).getText().equals(ti.getTypeName()) ");
                    }
                    pushFollow(FOLLOW_typeName_in_fcnType_fcnName2915);
                    typeName226=typeName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeName.add(typeName226.getTree());


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
                    // 558:3: -> ^( D_FCN_CTOR typeName )
                    {
                        // pollen.g:558:6: ^( D_FCN_CTOR typeName )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(D_FCN_CTOR, "D_FCN_CTOR"), root_1);

                        adaptor.addChild(root_1, stream_typeName.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // pollen.g:559:4: qualName
                    {
                    pushFollow(FOLLOW_qualName_in_fcnType_fcnName2945);
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
                    // 560:3: -> ^( D_FCN_TYP_NM D_VOID qualName )
                    {
                        // pollen.g:560:6: ^( D_FCN_TYP_NM D_VOID qualName )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(D_FCN_TYP_NM, "D_FCN_TYP_NM"), root_1);

                        adaptor.addChild(root_1, (Object)adaptor.create(D_VOID, "D_VOID"));
                        adaptor.addChild(root_1, stream_qualName.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // pollen.g:561:4: ( '(' typeName ( ',' typeName )* ')' qualName )=> fcnTypes_fcnName
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_fcnTypes_fcnName_in_fcnType_fcnName3003);
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
            if ( state.backtracking>0 ) { memoize(input, 64, fcnType_fcnName_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "fcnType_fcnName"

    public static class fcnTypes_fcnName_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "fcnTypes_fcnName"
    // pollen.g:563:1: fcnTypes_fcnName : '(' fcnTypes ')' qualName -> ^( D_FCN_TYP_NM fcnTypes qualName ) ;
    public final pollenParser.fcnTypes_fcnName_return fcnTypes_fcnName() throws RecognitionException {
        pollenParser.fcnTypes_fcnName_return retval = new pollenParser.fcnTypes_fcnName_return();
        retval.start = input.LT(1);
        int fcnTypes_fcnName_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal229=null;
        Token char_literal231=null;
        pollenParser.fcnTypes_return fcnTypes230 = null;

        pollenParser.qualName_return qualName232 = null;


        Object char_literal229_tree=null;
        Object char_literal231_tree=null;
        RewriteRuleTokenStream stream_161=new RewriteRuleTokenStream(adaptor,"token 161");
        RewriteRuleTokenStream stream_160=new RewriteRuleTokenStream(adaptor,"token 160");
        RewriteRuleSubtreeStream stream_fcnTypes=new RewriteRuleSubtreeStream(adaptor,"rule fcnTypes");
        RewriteRuleSubtreeStream stream_qualName=new RewriteRuleSubtreeStream(adaptor,"rule qualName");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 65) ) { return retval; }
            // pollen.g:564:2: ( '(' fcnTypes ')' qualName -> ^( D_FCN_TYP_NM fcnTypes qualName ) )
            // pollen.g:564:4: '(' fcnTypes ')' qualName
            {
            char_literal229=(Token)match(input,160,FOLLOW_160_in_fcnTypes_fcnName3014); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_160.add(char_literal229);

            pushFollow(FOLLOW_fcnTypes_in_fcnTypes_fcnName3016);
            fcnTypes230=fcnTypes();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_fcnTypes.add(fcnTypes230.getTree());
            char_literal231=(Token)match(input,161,FOLLOW_161_in_fcnTypes_fcnName3018); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_161.add(char_literal231);

            pushFollow(FOLLOW_qualName_in_fcnTypes_fcnName3020);
            qualName232=qualName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_qualName.add(qualName232.getTree());


            // AST REWRITE
            // elements: fcnTypes, qualName
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 564:30: -> ^( D_FCN_TYP_NM fcnTypes qualName )
            {
                // pollen.g:564:33: ^( D_FCN_TYP_NM fcnTypes qualName )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(D_FCN_TYP_NM, "D_FCN_TYP_NM"), root_1);

                adaptor.addChild(root_1, stream_fcnTypes.nextTree());
                adaptor.addChild(root_1, stream_qualName.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
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
            if ( state.backtracking>0 ) { memoize(input, 65, fcnTypes_fcnName_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "fcnTypes_fcnName"

    public static class fcnTypes_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "fcnTypes"
    // pollen.g:566:1: fcnTypes : typeName ( ',' typeName )* -> ^( D_FCN_TYP_LIST ( typeName )+ ) ;
    public final pollenParser.fcnTypes_return fcnTypes() throws RecognitionException {
        pollenParser.fcnTypes_return retval = new pollenParser.fcnTypes_return();
        retval.start = input.LT(1);
        int fcnTypes_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal234=null;
        pollenParser.typeName_return typeName233 = null;

        pollenParser.typeName_return typeName235 = null;


        Object char_literal234_tree=null;
        RewriteRuleTokenStream stream_130=new RewriteRuleTokenStream(adaptor,"token 130");
        RewriteRuleSubtreeStream stream_typeName=new RewriteRuleSubtreeStream(adaptor,"rule typeName");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 66) ) { return retval; }
            // pollen.g:567:2: ( typeName ( ',' typeName )* -> ^( D_FCN_TYP_LIST ( typeName )+ ) )
            // pollen.g:567:4: typeName ( ',' typeName )*
            {
            pushFollow(FOLLOW_typeName_in_fcnTypes3041);
            typeName233=typeName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeName.add(typeName233.getTree());
            // pollen.g:567:13: ( ',' typeName )*
            loop70:
            do {
                int alt70=2;
                int LA70_0 = input.LA(1);

                if ( (LA70_0==130) ) {
                    alt70=1;
                }


                switch (alt70) {
            	case 1 :
            	    // pollen.g:567:14: ',' typeName
            	    {
            	    char_literal234=(Token)match(input,130,FOLLOW_130_in_fcnTypes3044); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_130.add(char_literal234);

            	    pushFollow(FOLLOW_typeName_in_fcnTypes3046);
            	    typeName235=typeName();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_typeName.add(typeName235.getTree());

            	    }
            	    break;

            	default :
            	    break loop70;
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
            // 567:29: -> ^( D_FCN_TYP_LIST ( typeName )+ )
            {
                // pollen.g:567:32: ^( D_FCN_TYP_LIST ( typeName )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(D_FCN_TYP_LIST, "D_FCN_TYP_LIST"), root_1);

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

            retval.tree = root_0;}
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
            if ( state.backtracking>0 ) { memoize(input, 66, fcnTypes_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "fcnTypes"

    public static class fcnFormalParameterList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "fcnFormalParameterList"
    // pollen.g:569:1: fcnFormalParameterList : '(' fcnFormalParameters ')' -> ^( FCNPARMS fcnFormalParameters ) ;
    public final pollenParser.fcnFormalParameterList_return fcnFormalParameterList() throws RecognitionException {
        pollenParser.fcnFormalParameterList_return retval = new pollenParser.fcnFormalParameterList_return();
        retval.start = input.LT(1);
        int fcnFormalParameterList_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal236=null;
        Token char_literal238=null;
        pollenParser.fcnFormalParameters_return fcnFormalParameters237 = null;


        Object char_literal236_tree=null;
        Object char_literal238_tree=null;
        RewriteRuleTokenStream stream_161=new RewriteRuleTokenStream(adaptor,"token 161");
        RewriteRuleTokenStream stream_160=new RewriteRuleTokenStream(adaptor,"token 160");
        RewriteRuleSubtreeStream stream_fcnFormalParameters=new RewriteRuleSubtreeStream(adaptor,"rule fcnFormalParameters");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 67) ) { return retval; }
            // pollen.g:570:2: ( '(' fcnFormalParameters ')' -> ^( FCNPARMS fcnFormalParameters ) )
            // pollen.g:570:4: '(' fcnFormalParameters ')'
            {
            char_literal236=(Token)match(input,160,FOLLOW_160_in_fcnFormalParameterList3067); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_160.add(char_literal236);

            pushFollow(FOLLOW_fcnFormalParameters_in_fcnFormalParameterList3069);
            fcnFormalParameters237=fcnFormalParameters();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_fcnFormalParameters.add(fcnFormalParameters237.getTree());
            char_literal238=(Token)match(input,161,FOLLOW_161_in_fcnFormalParameterList3071); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_161.add(char_literal238);



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
            // 570:32: -> ^( FCNPARMS fcnFormalParameters )
            {
                // pollen.g:570:35: ^( FCNPARMS fcnFormalParameters )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FCNPARMS, "FCNPARMS"), root_1);

                adaptor.addChild(root_1, stream_fcnFormalParameters.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
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
            if ( state.backtracking>0 ) { memoize(input, 67, fcnFormalParameterList_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "fcnFormalParameterList"

    public static class fcnFormalParameters_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "fcnFormalParameters"
    // pollen.g:572:1: fcnFormalParameters : ( fcnFormalParameter ( ',' fcnFormalParameter )* -> ( fcnFormalParameter )+ | -> NIL );
    public final pollenParser.fcnFormalParameters_return fcnFormalParameters() throws RecognitionException {
        pollenParser.fcnFormalParameters_return retval = new pollenParser.fcnFormalParameters_return();
        retval.start = input.LT(1);
        int fcnFormalParameters_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal240=null;
        pollenParser.fcnFormalParameter_return fcnFormalParameter239 = null;

        pollenParser.fcnFormalParameter_return fcnFormalParameter241 = null;


        Object char_literal240_tree=null;
        RewriteRuleTokenStream stream_130=new RewriteRuleTokenStream(adaptor,"token 130");
        RewriteRuleSubtreeStream stream_fcnFormalParameter=new RewriteRuleSubtreeStream(adaptor,"rule fcnFormalParameter");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 68) ) { return retval; }
            // pollen.g:573:2: ( fcnFormalParameter ( ',' fcnFormalParameter )* -> ( fcnFormalParameter )+ | -> NIL )
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==IDENT||(LA72_0>=191 && LA72_0<=199)) ) {
                alt72=1;
            }
            else if ( (LA72_0==161) ) {
                alt72=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 72, 0, input);

                throw nvae;
            }
            switch (alt72) {
                case 1 :
                    // pollen.g:573:4: fcnFormalParameter ( ',' fcnFormalParameter )*
                    {
                    pushFollow(FOLLOW_fcnFormalParameter_in_fcnFormalParameters3089);
                    fcnFormalParameter239=fcnFormalParameter();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_fcnFormalParameter.add(fcnFormalParameter239.getTree());
                    // pollen.g:573:23: ( ',' fcnFormalParameter )*
                    loop71:
                    do {
                        int alt71=2;
                        int LA71_0 = input.LA(1);

                        if ( (LA71_0==130) ) {
                            alt71=1;
                        }


                        switch (alt71) {
                    	case 1 :
                    	    // pollen.g:573:24: ',' fcnFormalParameter
                    	    {
                    	    char_literal240=(Token)match(input,130,FOLLOW_130_in_fcnFormalParameters3092); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_130.add(char_literal240);

                    	    pushFollow(FOLLOW_fcnFormalParameter_in_fcnFormalParameters3094);
                    	    fcnFormalParameter241=fcnFormalParameter();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_fcnFormalParameter.add(fcnFormalParameter241.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop71;
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
                    // 573:49: -> ( fcnFormalParameter )+
                    {
                        if ( !(stream_fcnFormalParameter.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_fcnFormalParameter.hasNext() ) {
                            adaptor.addChild(root_0, stream_fcnFormalParameter.nextTree());

                        }
                        stream_fcnFormalParameter.reset();

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // pollen.g:574:4: 
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
                    // 574:4: -> NIL
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(NIL, "NIL"));

                    }

                    retval.tree = root_0;}
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
            if ( state.backtracking>0 ) { memoize(input, 68, fcnFormalParameters_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "fcnFormalParameters"

    public static class fcnFormalParameter_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "fcnFormalParameter"
    // pollen.g:576:1: fcnFormalParameter : typeName IDENT ( '=' arrayLitElem )? ;
    public final pollenParser.fcnFormalParameter_return fcnFormalParameter() throws RecognitionException {
        pollenParser.fcnFormalParameter_return retval = new pollenParser.fcnFormalParameter_return();
        retval.start = input.LT(1);
        int fcnFormalParameter_StartIndex = input.index();
        Object root_0 = null;

        Token IDENT243=null;
        Token char_literal244=null;
        pollenParser.typeName_return typeName242 = null;

        pollenParser.arrayLitElem_return arrayLitElem245 = null;


        Object IDENT243_tree=null;
        Object char_literal244_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 69) ) { return retval; }
            // pollen.g:577:2: ( typeName IDENT ( '=' arrayLitElem )? )
            // pollen.g:577:6: typeName IDENT ( '=' arrayLitElem )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_typeName_in_fcnFormalParameter3120);
            typeName242=typeName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, typeName242.getTree());
            IDENT243=(Token)match(input,IDENT,FOLLOW_IDENT_in_fcnFormalParameter3122); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENT243_tree = (Object)adaptor.create(IDENT243);
            adaptor.addChild(root_0, IDENT243_tree);
            }
            // pollen.g:577:21: ( '=' arrayLitElem )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==ASSIGN) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // pollen.g:577:22: '=' arrayLitElem
                    {
                    char_literal244=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_fcnFormalParameter3125); if (state.failed) return retval;
                    pushFollow(FOLLOW_arrayLitElem_in_fcnFormalParameter3128);
                    arrayLitElem245=arrayLitElem();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, arrayLitElem245.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 69, fcnFormalParameter_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "fcnFormalParameter"

    public static class fcnArgumentList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "fcnArgumentList"
    // pollen.g:579:1: fcnArgumentList : '(' fcnArguments ')' -> ^( E_CALL_ARGS fcnArguments ) ;
    public final pollenParser.fcnArgumentList_return fcnArgumentList() throws RecognitionException {
        pollenParser.fcnArgumentList_return retval = new pollenParser.fcnArgumentList_return();
        retval.start = input.LT(1);
        int fcnArgumentList_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal246=null;
        Token char_literal248=null;
        pollenParser.fcnArguments_return fcnArguments247 = null;


        Object char_literal246_tree=null;
        Object char_literal248_tree=null;
        RewriteRuleTokenStream stream_161=new RewriteRuleTokenStream(adaptor,"token 161");
        RewriteRuleTokenStream stream_160=new RewriteRuleTokenStream(adaptor,"token 160");
        RewriteRuleSubtreeStream stream_fcnArguments=new RewriteRuleSubtreeStream(adaptor,"rule fcnArguments");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 70) ) { return retval; }
            // pollen.g:580:2: ( '(' fcnArguments ')' -> ^( E_CALL_ARGS fcnArguments ) )
            // pollen.g:580:4: '(' fcnArguments ')'
            {
            char_literal246=(Token)match(input,160,FOLLOW_160_in_fcnArgumentList3141); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_160.add(char_literal246);

            pushFollow(FOLLOW_fcnArguments_in_fcnArgumentList3143);
            fcnArguments247=fcnArguments();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_fcnArguments.add(fcnArguments247.getTree());
            char_literal248=(Token)match(input,161,FOLLOW_161_in_fcnArgumentList3145); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_161.add(char_literal248);



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
            // 580:25: -> ^( E_CALL_ARGS fcnArguments )
            {
                // pollen.g:580:28: ^( E_CALL_ARGS fcnArguments )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(E_CALL_ARGS, "E_CALL_ARGS"), root_1);

                adaptor.addChild(root_1, stream_fcnArguments.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
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
            if ( state.backtracking>0 ) { memoize(input, 70, fcnArgumentList_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "fcnArgumentList"

    public static class fcnArguments_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "fcnArguments"
    // pollen.g:582:1: fcnArguments : exprList ;
    public final pollenParser.fcnArguments_return fcnArguments() throws RecognitionException {
        pollenParser.fcnArguments_return retval = new pollenParser.fcnArguments_return();
        retval.start = input.LT(1);
        int fcnArguments_StartIndex = input.index();
        Object root_0 = null;

        pollenParser.exprList_return exprList249 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 71) ) { return retval; }
            // pollen.g:583:2: ( exprList )
            // pollen.g:583:4: exprList
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_exprList_in_fcnArguments3163);
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
            if ( state.backtracking>0 ) { memoize(input, 71, fcnArguments_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "fcnArguments"

    public static class varOrFcnOrArray_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "varOrFcnOrArray"
    // pollen.g:585:1: varOrFcnOrArray : ( 'new' typeName fcnArgumentList fieldOrArrayAccess -> ^( E_NEW typeName fcnArgumentList fieldOrArrayAccess ) | '@' IDENT fcnArgumentList fieldOrArrayAccess | '@' IDENT fieldOrArrayAccess | '@' | qualName fcnArgumentList fieldOrArrayAccess -> ^( E_CALL qualName fcnArgumentList fieldOrArrayAccess ) | qualName fieldOrArrayAccess );
    public final pollenParser.varOrFcnOrArray_return varOrFcnOrArray() throws RecognitionException {
        pollenParser.varOrFcnOrArray_return retval = new pollenParser.varOrFcnOrArray_return();
        retval.start = input.LT(1);
        int varOrFcnOrArray_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal250=null;
        Token char_literal254=null;
        Token IDENT255=null;
        Token char_literal258=null;
        Token IDENT259=null;
        Token char_literal261=null;
        pollenParser.typeName_return typeName251 = null;

        pollenParser.fcnArgumentList_return fcnArgumentList252 = null;

        pollenParser.fieldOrArrayAccess_return fieldOrArrayAccess253 = null;

        pollenParser.fcnArgumentList_return fcnArgumentList256 = null;

        pollenParser.fieldOrArrayAccess_return fieldOrArrayAccess257 = null;

        pollenParser.fieldOrArrayAccess_return fieldOrArrayAccess260 = null;

        pollenParser.qualName_return qualName262 = null;

        pollenParser.fcnArgumentList_return fcnArgumentList263 = null;

        pollenParser.fieldOrArrayAccess_return fieldOrArrayAccess264 = null;

        pollenParser.qualName_return qualName265 = null;

        pollenParser.fieldOrArrayAccess_return fieldOrArrayAccess266 = null;


        Object string_literal250_tree=null;
        Object char_literal254_tree=null;
        Object IDENT255_tree=null;
        Object char_literal258_tree=null;
        Object IDENT259_tree=null;
        Object char_literal261_tree=null;
        RewriteRuleTokenStream stream_166=new RewriteRuleTokenStream(adaptor,"token 166");
        RewriteRuleSubtreeStream stream_typeName=new RewriteRuleSubtreeStream(adaptor,"rule typeName");
        RewriteRuleSubtreeStream stream_fcnArgumentList=new RewriteRuleSubtreeStream(adaptor,"rule fcnArgumentList");
        RewriteRuleSubtreeStream stream_qualName=new RewriteRuleSubtreeStream(adaptor,"rule qualName");
        RewriteRuleSubtreeStream stream_fieldOrArrayAccess=new RewriteRuleSubtreeStream(adaptor,"rule fieldOrArrayAccess");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 72) ) { return retval; }
            // pollen.g:589:2: ( 'new' typeName fcnArgumentList fieldOrArrayAccess -> ^( E_NEW typeName fcnArgumentList fieldOrArrayAccess ) | '@' IDENT fcnArgumentList fieldOrArrayAccess | '@' IDENT fieldOrArrayAccess | '@' | qualName fcnArgumentList fieldOrArrayAccess -> ^( E_CALL qualName fcnArgumentList fieldOrArrayAccess ) | qualName fieldOrArrayAccess )
            int alt74=6;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                int LA74_1 = input.LA(2);

                if ( (synpred125_pollen()) ) {
                    alt74=5;
                }
                else if ( (true) ) {
                    alt74=6;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 74, 1, input);

                    throw nvae;
                }
                }
                break;
            case 166:
                {
                alt74=1;
                }
                break;
            case 167:
                {
                int LA74_5 = input.LA(2);

                if ( (synpred122_pollen()) ) {
                    alt74=2;
                }
                else if ( (synpred123_pollen()) ) {
                    alt74=3;
                }
                else if ( (synpred124_pollen()) ) {
                    alt74=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 74, 5, input);

                    throw nvae;
                }
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
                    // pollen.g:589:4: 'new' typeName fcnArgumentList fieldOrArrayAccess
                    {
                    string_literal250=(Token)match(input,166,FOLLOW_166_in_varOrFcnOrArray3176); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_166.add(string_literal250);

                    pushFollow(FOLLOW_typeName_in_varOrFcnOrArray3178);
                    typeName251=typeName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeName.add(typeName251.getTree());
                    pushFollow(FOLLOW_fcnArgumentList_in_varOrFcnOrArray3180);
                    fcnArgumentList252=fcnArgumentList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_fcnArgumentList.add(fcnArgumentList252.getTree());
                    pushFollow(FOLLOW_fieldOrArrayAccess_in_varOrFcnOrArray3182);
                    fieldOrArrayAccess253=fieldOrArrayAccess();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_fieldOrArrayAccess.add(fieldOrArrayAccess253.getTree());


                    // AST REWRITE
                    // elements: typeName, fcnArgumentList, fieldOrArrayAccess
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 590:3: -> ^( E_NEW typeName fcnArgumentList fieldOrArrayAccess )
                    {
                        // pollen.g:590:6: ^( E_NEW typeName fcnArgumentList fieldOrArrayAccess )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(E_NEW, "E_NEW"), root_1);

                        adaptor.addChild(root_1, stream_typeName.nextTree());
                        adaptor.addChild(root_1, stream_fcnArgumentList.nextTree());
                        adaptor.addChild(root_1, stream_fieldOrArrayAccess.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // pollen.g:591:4: '@' IDENT fcnArgumentList fieldOrArrayAccess
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal254=(Token)match(input,167,FOLLOW_167_in_varOrFcnOrArray3201); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal254_tree = (Object)adaptor.create(char_literal254);
                    root_0 = (Object)adaptor.becomeRoot(char_literal254_tree, root_0);
                    }
                    IDENT255=(Token)match(input,IDENT,FOLLOW_IDENT_in_varOrFcnOrArray3204); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENT255_tree = (Object)adaptor.create(IDENT255);
                    adaptor.addChild(root_0, IDENT255_tree);
                    }
                    pushFollow(FOLLOW_fcnArgumentList_in_varOrFcnOrArray3206);
                    fcnArgumentList256=fcnArgumentList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, fcnArgumentList256.getTree());
                    pushFollow(FOLLOW_fieldOrArrayAccess_in_varOrFcnOrArray3208);
                    fieldOrArrayAccess257=fieldOrArrayAccess();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, fieldOrArrayAccess257.getTree());

                    }
                    break;
                case 3 :
                    // pollen.g:592:4: '@' IDENT fieldOrArrayAccess
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal258=(Token)match(input,167,FOLLOW_167_in_varOrFcnOrArray3214); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal258_tree = (Object)adaptor.create(char_literal258);
                    root_0 = (Object)adaptor.becomeRoot(char_literal258_tree, root_0);
                    }
                    IDENT259=(Token)match(input,IDENT,FOLLOW_IDENT_in_varOrFcnOrArray3217); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENT259_tree = (Object)adaptor.create(IDENT259);
                    adaptor.addChild(root_0, IDENT259_tree);
                    }
                    pushFollow(FOLLOW_fieldOrArrayAccess_in_varOrFcnOrArray3219);
                    fieldOrArrayAccess260=fieldOrArrayAccess();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, fieldOrArrayAccess260.getTree());

                    }
                    break;
                case 4 :
                    // pollen.g:593:4: '@'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal261=(Token)match(input,167,FOLLOW_167_in_varOrFcnOrArray3228); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal261_tree = (Object)adaptor.create(char_literal261);
                    root_0 = (Object)adaptor.becomeRoot(char_literal261_tree, root_0);
                    }

                    }
                    break;
                case 5 :
                    // pollen.g:594:4: qualName fcnArgumentList fieldOrArrayAccess
                    {
                    pushFollow(FOLLOW_qualName_in_varOrFcnOrArray3235);
                    qualName262=qualName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_qualName.add(qualName262.getTree());
                    pushFollow(FOLLOW_fcnArgumentList_in_varOrFcnOrArray3237);
                    fcnArgumentList263=fcnArgumentList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_fcnArgumentList.add(fcnArgumentList263.getTree());
                    pushFollow(FOLLOW_fieldOrArrayAccess_in_varOrFcnOrArray3239);
                    fieldOrArrayAccess264=fieldOrArrayAccess();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_fieldOrArrayAccess.add(fieldOrArrayAccess264.getTree());


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

                    root_0 = (Object)adaptor.nil();
                    // 595:3: -> ^( E_CALL qualName fcnArgumentList fieldOrArrayAccess )
                    {
                        // pollen.g:595:6: ^( E_CALL qualName fcnArgumentList fieldOrArrayAccess )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(E_CALL, "E_CALL"), root_1);

                        adaptor.addChild(root_1, stream_qualName.nextTree());
                        adaptor.addChild(root_1, stream_fcnArgumentList.nextTree());
                        adaptor.addChild(root_1, stream_fieldOrArrayAccess.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 6 :
                    // pollen.g:596:4: qualName fieldOrArrayAccess
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_qualName_in_varOrFcnOrArray3259);
                    qualName265=qualName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, qualName265.getTree());
                    pushFollow(FOLLOW_fieldOrArrayAccess_in_varOrFcnOrArray3261);
                    fieldOrArrayAccess266=fieldOrArrayAccess();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, fieldOrArrayAccess266.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 72, varOrFcnOrArray_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "varOrFcnOrArray"

    public static class fieldOrArrayAccess_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "fieldOrArrayAccess"
    // pollen.g:598:1: fieldOrArrayAccess : ( ( fieldAccess | arrayAccess )+ | -> NIL );
    public final pollenParser.fieldOrArrayAccess_return fieldOrArrayAccess() throws RecognitionException {
        pollenParser.fieldOrArrayAccess_return retval = new pollenParser.fieldOrArrayAccess_return();
        retval.start = input.LT(1);
        int fieldOrArrayAccess_StartIndex = input.index();
        Object root_0 = null;

        pollenParser.fieldAccess_return fieldAccess267 = null;

        pollenParser.arrayAccess_return arrayAccess268 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 73) ) { return retval; }
            // pollen.g:599:2: ( ( fieldAccess | arrayAccess )+ | -> NIL )
            int alt76=2;
            switch ( input.LA(1) ) {
            case 168:
                {
                alt76=1;
                }
                break;
            case NL:
            case IDENT:
            case ASSIGN:
            case INT_LIT:
            case STRING:
            case CHAR:
            case EQ:
            case NOT_EQ:
            case LT_EQ:
            case GT_EQ:
            case ADD_EQ:
            case SUB_EQ:
            case MUL_EQ:
            case DIV_EQ:
            case MOD_EQ:
            case LSHFT_EQ:
            case RSHFT_EQ:
            case BITAND_EQ:
            case BITXOR_EQ:
            case BITOR_EQ:
            case LOG_NOT:
            case BIT_NOT:
            case BIND:
            case SEMI:
            case OCT_LIT:
            case REAL_LIT:
            case HEX_LIT:
            case INJECT:
            case 126:
            case 127:
            case 128:
            case 129:
            case 130:
            case 131:
            case 132:
            case 133:
            case 134:
            case 136:
            case 139:
            case 141:
            case 144:
            case 145:
            case 146:
            case 147:
            case 148:
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
            case 160:
            case 161:
            case 162:
            case 163:
            case 164:
            case 165:
            case 166:
            case 167:
            case 169:
            case 170:
            case 174:
            case 175:
            case 176:
            case 177:
            case 178:
            case 180:
            case 181:
            case 182:
            case 183:
            case 184:
            case 185:
            case 188:
            case 189:
            case 190:
            case 191:
            case 192:
            case 193:
            case 194:
            case 195:
            case 196:
            case 197:
            case 198:
            case 199:
            case 200:
            case 201:
            case 202:
                {
                alt76=2;
                }
                break;
            case 140:
                {
                int LA76_3 = input.LA(2);

                if ( (synpred128_pollen()) ) {
                    alt76=1;
                }
                else if ( (true) ) {
                    alt76=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 76, 3, input);

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
                    // pollen.g:599:5: ( fieldAccess | arrayAccess )+
                    {
                    root_0 = (Object)adaptor.nil();

                    // pollen.g:599:5: ( fieldAccess | arrayAccess )+
                    int cnt75=0;
                    loop75:
                    do {
                        int alt75=3;
                        int LA75_0 = input.LA(1);

                        if ( (LA75_0==168) ) {
                            alt75=1;
                        }
                        else if ( (LA75_0==140) ) {
                            int LA75_3 = input.LA(2);

                            if ( (synpred127_pollen()) ) {
                                alt75=2;
                            }


                        }


                        switch (alt75) {
                    	case 1 :
                    	    // pollen.g:599:6: fieldAccess
                    	    {
                    	    pushFollow(FOLLOW_fieldAccess_in_fieldOrArrayAccess3274);
                    	    fieldAccess267=fieldAccess();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, fieldAccess267.getTree());

                    	    }
                    	    break;
                    	case 2 :
                    	    // pollen.g:599:20: arrayAccess
                    	    {
                    	    pushFollow(FOLLOW_arrayAccess_in_fieldOrArrayAccess3278);
                    	    arrayAccess268=arrayAccess();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, arrayAccess268.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt75 >= 1 ) break loop75;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(75, input);
                                throw eee;
                        }
                        cnt75++;
                    } while (true);


                    }
                    break;
                case 2 :
                    // pollen.g:600:4: 
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
                    // 600:4: -> NIL
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(NIL, "NIL"));

                    }

                    retval.tree = root_0;}
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
            if ( state.backtracking>0 ) { memoize(input, 73, fieldOrArrayAccess_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "fieldOrArrayAccess"

    public static class fieldAccess_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "fieldAccess"
    // pollen.g:602:1: fieldAccess : '.' IDENT ( fcnArgumentList )? -> ^( E_FIELD IDENT ( fcnArgumentList )? ) ;
    public final pollenParser.fieldAccess_return fieldAccess() throws RecognitionException {
        pollenParser.fieldAccess_return retval = new pollenParser.fieldAccess_return();
        retval.start = input.LT(1);
        int fieldAccess_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal269=null;
        Token IDENT270=null;
        pollenParser.fcnArgumentList_return fcnArgumentList271 = null;


        Object char_literal269_tree=null;
        Object IDENT270_tree=null;
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleTokenStream stream_168=new RewriteRuleTokenStream(adaptor,"token 168");
        RewriteRuleSubtreeStream stream_fcnArgumentList=new RewriteRuleSubtreeStream(adaptor,"rule fcnArgumentList");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 74) ) { return retval; }
            // pollen.g:603:2: ( '.' IDENT ( fcnArgumentList )? -> ^( E_FIELD IDENT ( fcnArgumentList )? ) )
            // pollen.g:603:4: '.' IDENT ( fcnArgumentList )?
            {
            char_literal269=(Token)match(input,168,FOLLOW_168_in_fieldAccess3297); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_168.add(char_literal269);

            IDENT270=(Token)match(input,IDENT,FOLLOW_IDENT_in_fieldAccess3299); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENT.add(IDENT270);

            // pollen.g:603:14: ( fcnArgumentList )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==160) ) {
                int LA77_2 = input.LA(2);

                if ( (synpred129_pollen()) ) {
                    alt77=1;
                }
            }
            switch (alt77) {
                case 1 :
                    // pollen.g:603:15: fcnArgumentList
                    {
                    pushFollow(FOLLOW_fcnArgumentList_in_fieldAccess3302);
                    fcnArgumentList271=fcnArgumentList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_fcnArgumentList.add(fcnArgumentList271.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: fcnArgumentList, IDENT
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 603:33: -> ^( E_FIELD IDENT ( fcnArgumentList )? )
            {
                // pollen.g:603:36: ^( E_FIELD IDENT ( fcnArgumentList )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(E_FIELD, "E_FIELD"), root_1);

                adaptor.addChild(root_1, stream_IDENT.nextNode());
                // pollen.g:603:53: ( fcnArgumentList )?
                if ( stream_fcnArgumentList.hasNext() ) {
                    adaptor.addChild(root_1, stream_fcnArgumentList.nextTree());

                }
                stream_fcnArgumentList.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
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
            if ( state.backtracking>0 ) { memoize(input, 74, fieldAccess_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "fieldAccess"

    public static class arrayAccess_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "arrayAccess"
    // pollen.g:605:1: arrayAccess : '[' ( exprList )? ']' -> ^( E_INDEX ( exprList )? ) ;
    public final pollenParser.arrayAccess_return arrayAccess() throws RecognitionException {
        pollenParser.arrayAccess_return retval = new pollenParser.arrayAccess_return();
        retval.start = input.LT(1);
        int arrayAccess_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal272=null;
        Token char_literal274=null;
        pollenParser.exprList_return exprList273 = null;


        Object char_literal272_tree=null;
        Object char_literal274_tree=null;
        RewriteRuleTokenStream stream_140=new RewriteRuleTokenStream(adaptor,"token 140");
        RewriteRuleTokenStream stream_141=new RewriteRuleTokenStream(adaptor,"token 141");
        RewriteRuleSubtreeStream stream_exprList=new RewriteRuleSubtreeStream(adaptor,"rule exprList");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 75) ) { return retval; }
            // pollen.g:606:2: ( '[' ( exprList )? ']' -> ^( E_INDEX ( exprList )? ) )
            // pollen.g:606:4: '[' ( exprList )? ']'
            {
            char_literal272=(Token)match(input,140,FOLLOW_140_in_arrayAccess3326); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_140.add(char_literal272);

            // pollen.g:606:8: ( exprList )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==141) ) {
                int LA78_1 = input.LA(2);

                if ( (synpred130_pollen()) ) {
                    alt78=1;
                }
            }
            else if ( ((LA78_0>=NL && LA78_0<=IDENT)||(LA78_0>=INT_LIT && LA78_0<=CHAR)||(LA78_0>=LOG_NOT && LA78_0<=BIT_NOT)||(LA78_0>=SEMI && LA78_0<=INJECT)||(LA78_0>=126 && LA78_0<=134)||LA78_0==136||(LA78_0>=139 && LA78_0<=140)||LA78_0==149||(LA78_0>=160 && LA78_0<=167)||(LA78_0>=169 && LA78_0<=170)||(LA78_0>=174 && LA78_0<=178)||(LA78_0>=180 && LA78_0<=185)||(LA78_0>=188 && LA78_0<=202)) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // pollen.g:606:9: exprList
                    {
                    pushFollow(FOLLOW_exprList_in_arrayAccess3329);
                    exprList273=exprList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_exprList.add(exprList273.getTree());

                    }
                    break;

            }

            char_literal274=(Token)match(input,141,FOLLOW_141_in_arrayAccess3333); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_141.add(char_literal274);



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
            // 606:24: -> ^( E_INDEX ( exprList )? )
            {
                // pollen.g:606:27: ^( E_INDEX ( exprList )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(E_INDEX, "E_INDEX"), root_1);

                // pollen.g:606:37: ( exprList )?
                if ( stream_exprList.hasNext() ) {
                    adaptor.addChild(root_1, stream_exprList.nextTree());

                }
                stream_exprList.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
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
            if ( state.backtracking>0 ) { memoize(input, 75, arrayAccess_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "arrayAccess"

    public static class stmtBlock_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "stmtBlock"
    // pollen.g:609:1: stmtBlock : braceOpen stmts braceClose -> ^( S_BLOCK stmts ) ;
    public final pollenParser.stmtBlock_return stmtBlock() throws RecognitionException {
        pollenParser.stmtBlock_return retval = new pollenParser.stmtBlock_return();
        retval.start = input.LT(1);
        int stmtBlock_StartIndex = input.index();
        Object root_0 = null;

        pollenParser.braceOpen_return braceOpen275 = null;

        pollenParser.stmts_return stmts276 = null;

        pollenParser.braceClose_return braceClose277 = null;


        RewriteRuleSubtreeStream stream_stmts=new RewriteRuleSubtreeStream(adaptor,"rule stmts");
        RewriteRuleSubtreeStream stream_braceOpen=new RewriteRuleSubtreeStream(adaptor,"rule braceOpen");
        RewriteRuleSubtreeStream stream_braceClose=new RewriteRuleSubtreeStream(adaptor,"rule braceClose");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 76) ) { return retval; }
            // pollen.g:610:2: ( braceOpen stmts braceClose -> ^( S_BLOCK stmts ) )
            // pollen.g:610:4: braceOpen stmts braceClose
            {
            pushFollow(FOLLOW_braceOpen_in_stmtBlock3354);
            braceOpen275=braceOpen();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_braceOpen.add(braceOpen275.getTree());
            pushFollow(FOLLOW_stmts_in_stmtBlock3356);
            stmts276=stmts();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_stmts.add(stmts276.getTree());
            pushFollow(FOLLOW_braceClose_in_stmtBlock3358);
            braceClose277=braceClose();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_braceClose.add(braceClose277.getTree());


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
            // 610:32: -> ^( S_BLOCK stmts )
            {
                // pollen.g:610:35: ^( S_BLOCK stmts )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(S_BLOCK, "S_BLOCK"), root_1);

                adaptor.addChild(root_1, stream_stmts.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
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
            if ( state.backtracking>0 ) { memoize(input, 76, stmtBlock_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "stmtBlock"

    public static class stmts_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "stmts"
    // pollen.g:612:1: stmts : ( ( stmt )+ | ( ( NL )* ) -> NIL );
    public final pollenParser.stmts_return stmts() throws RecognitionException {
        pollenParser.stmts_return retval = new pollenParser.stmts_return();
        retval.start = input.LT(1);
        int stmts_StartIndex = input.index();
        Object root_0 = null;

        Token NL279=null;
        pollenParser.stmt_return stmt278 = null;


        Object NL279_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 77) ) { return retval; }
            // pollen.g:613:2: ( ( stmt )+ | ( ( NL )* ) -> NIL )
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==IDENT||(LA81_0>=INT_LIT && LA81_0<=CHAR)||(LA81_0>=LOG_NOT && LA81_0<=BIT_NOT)||(LA81_0>=OCT_LIT && LA81_0<=INJECT)||LA81_0==140||LA81_0==149||LA81_0==160||(LA81_0>=162 && LA81_0<=163)||(LA81_0>=165 && LA81_0<=167)||(LA81_0>=169 && LA81_0<=170)||(LA81_0>=174 && LA81_0<=178)||LA81_0==180||(LA81_0>=183 && LA81_0<=185)||(LA81_0>=188 && LA81_0<=202)) ) {
                alt81=1;
            }
            else if ( (LA81_0==EOF||LA81_0==NL||LA81_0==139||(LA81_0>=181 && LA81_0<=182)) ) {
                alt81=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 81, 0, input);

                throw nvae;
            }
            switch (alt81) {
                case 1 :
                    // pollen.g:613:4: ( stmt )+
                    {
                    root_0 = (Object)adaptor.nil();

                    // pollen.g:613:4: ( stmt )+
                    int cnt79=0;
                    loop79:
                    do {
                        int alt79=2;
                        int LA79_0 = input.LA(1);

                        if ( (LA79_0==IDENT||(LA79_0>=INT_LIT && LA79_0<=CHAR)||(LA79_0>=LOG_NOT && LA79_0<=BIT_NOT)||(LA79_0>=OCT_LIT && LA79_0<=INJECT)||LA79_0==140||LA79_0==149||LA79_0==160||(LA79_0>=162 && LA79_0<=163)||(LA79_0>=165 && LA79_0<=167)||(LA79_0>=169 && LA79_0<=170)||(LA79_0>=174 && LA79_0<=178)||LA79_0==180||(LA79_0>=183 && LA79_0<=185)||(LA79_0>=188 && LA79_0<=202)) ) {
                            alt79=1;
                        }


                        switch (alt79) {
                    	case 1 :
                    	    // pollen.g:613:5: stmt
                    	    {
                    	    pushFollow(FOLLOW_stmt_in_stmts3378);
                    	    stmt278=stmt();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmt278.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt79 >= 1 ) break loop79;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(79, input);
                                throw eee;
                        }
                        cnt79++;
                    } while (true);


                    }
                    break;
                case 2 :
                    // pollen.g:614:4: ( ( NL )* )
                    {
                    // pollen.g:614:4: ( ( NL )* )
                    // pollen.g:614:5: ( NL )*
                    {
                    // pollen.g:614:5: ( NL )*
                    loop80:
                    do {
                        int alt80=2;
                        int LA80_0 = input.LA(1);

                        if ( (LA80_0==NL) ) {
                            int LA80_1 = input.LA(2);

                            if ( (synpred133_pollen()) ) {
                                alt80=1;
                            }


                        }


                        switch (alt80) {
                    	case 1 :
                    	    // pollen.g:0:0: NL
                    	    {
                    	    NL279=(Token)match(input,NL,FOLLOW_NL_in_stmts3386); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_NL.add(NL279);


                    	    }
                    	    break;

                    	default :
                    	    break loop80;
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
                    // 614:10: -> NIL
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(NIL, "NIL"));

                    }

                    retval.tree = root_0;}
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
            if ( state.backtracking>0 ) { memoize(input, 77, stmts_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "stmts"

    public static class stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "stmt"
    // pollen.g:616:1: stmt : ( stmtAssign delim | stmtAssert | stmtBind | stmtPrint | stmtReturn | stmtBreak | stmtContinue | stmtForEach | stmtFor | stmtSwitch | stmtDoWhile | stmtIf | stmtProvided | stmtWhile | varDeclaration | stmtInjection | expr delim );
    public final pollenParser.stmt_return stmt() throws RecognitionException {
        pollenParser.stmt_return retval = new pollenParser.stmt_return();
        retval.start = input.LT(1);
        int stmt_StartIndex = input.index();
        Object root_0 = null;

        pollenParser.stmtAssign_return stmtAssign280 = null;

        pollenParser.delim_return delim281 = null;

        pollenParser.stmtAssert_return stmtAssert282 = null;

        pollenParser.stmtBind_return stmtBind283 = null;

        pollenParser.stmtPrint_return stmtPrint284 = null;

        pollenParser.stmtReturn_return stmtReturn285 = null;

        pollenParser.stmtBreak_return stmtBreak286 = null;

        pollenParser.stmtContinue_return stmtContinue287 = null;

        pollenParser.stmtForEach_return stmtForEach288 = null;

        pollenParser.stmtFor_return stmtFor289 = null;

        pollenParser.stmtSwitch_return stmtSwitch290 = null;

        pollenParser.stmtDoWhile_return stmtDoWhile291 = null;

        pollenParser.stmtIf_return stmtIf292 = null;

        pollenParser.stmtProvided_return stmtProvided293 = null;

        pollenParser.stmtWhile_return stmtWhile294 = null;

        pollenParser.varDeclaration_return varDeclaration295 = null;

        pollenParser.stmtInjection_return stmtInjection296 = null;

        pollenParser.expr_return expr297 = null;

        pollenParser.delim_return delim298 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 78) ) { return retval; }
            // pollen.g:617:2: ( stmtAssign delim | stmtAssert | stmtBind | stmtPrint | stmtReturn | stmtBreak | stmtContinue | stmtForEach | stmtFor | stmtSwitch | stmtDoWhile | stmtIf | stmtProvided | stmtWhile | varDeclaration | stmtInjection | expr delim )
            int alt82=17;
            alt82 = dfa82.predict(input);
            switch (alt82) {
                case 1 :
                    // pollen.g:617:5: stmtAssign delim
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_stmtAssign_in_stmt3403);
                    stmtAssign280=stmtAssign();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmtAssign280.getTree());
                    pushFollow(FOLLOW_delim_in_stmt3405);
                    delim281=delim();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, delim281.getTree());

                    }
                    break;
                case 2 :
                    // pollen.g:618:4: stmtAssert
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_stmtAssert_in_stmt3412);
                    stmtAssert282=stmtAssert();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmtAssert282.getTree());

                    }
                    break;
                case 3 :
                    // pollen.g:619:4: stmtBind
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_stmtBind_in_stmt3417);
                    stmtBind283=stmtBind();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmtBind283.getTree());

                    }
                    break;
                case 4 :
                    // pollen.g:620:4: stmtPrint
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_stmtPrint_in_stmt3422);
                    stmtPrint284=stmtPrint();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmtPrint284.getTree());

                    }
                    break;
                case 5 :
                    // pollen.g:621:4: stmtReturn
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_stmtReturn_in_stmt3427);
                    stmtReturn285=stmtReturn();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmtReturn285.getTree());

                    }
                    break;
                case 6 :
                    // pollen.g:622:4: stmtBreak
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_stmtBreak_in_stmt3432);
                    stmtBreak286=stmtBreak();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmtBreak286.getTree());

                    }
                    break;
                case 7 :
                    // pollen.g:623:5: stmtContinue
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_stmtContinue_in_stmt3438);
                    stmtContinue287=stmtContinue();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmtContinue287.getTree());

                    }
                    break;
                case 8 :
                    // pollen.g:624:5: stmtForEach
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_stmtForEach_in_stmt3444);
                    stmtForEach288=stmtForEach();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmtForEach288.getTree());

                    }
                    break;
                case 9 :
                    // pollen.g:625:5: stmtFor
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_stmtFor_in_stmt3450);
                    stmtFor289=stmtFor();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmtFor289.getTree());

                    }
                    break;
                case 10 :
                    // pollen.g:626:4: stmtSwitch
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_stmtSwitch_in_stmt3455);
                    stmtSwitch290=stmtSwitch();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmtSwitch290.getTree());

                    }
                    break;
                case 11 :
                    // pollen.g:627:5: stmtDoWhile
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_stmtDoWhile_in_stmt3461);
                    stmtDoWhile291=stmtDoWhile();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmtDoWhile291.getTree());

                    }
                    break;
                case 12 :
                    // pollen.g:628:4: stmtIf
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_stmtIf_in_stmt3466);
                    stmtIf292=stmtIf();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmtIf292.getTree());

                    }
                    break;
                case 13 :
                    // pollen.g:629:4: stmtProvided
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_stmtProvided_in_stmt3471);
                    stmtProvided293=stmtProvided();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmtProvided293.getTree());

                    }
                    break;
                case 14 :
                    // pollen.g:630:4: stmtWhile
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_stmtWhile_in_stmt3476);
                    stmtWhile294=stmtWhile();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmtWhile294.getTree());

                    }
                    break;
                case 15 :
                    // pollen.g:631:4: varDeclaration
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_varDeclaration_in_stmt3482);
                    varDeclaration295=varDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDeclaration295.getTree());

                    }
                    break;
                case 16 :
                    // pollen.g:632:4: stmtInjection
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_stmtInjection_in_stmt3488);
                    stmtInjection296=stmtInjection();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmtInjection296.getTree());

                    }
                    break;
                case 17 :
                    // pollen.g:633:4: expr delim
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_expr_in_stmt3493);
                    expr297=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr297.getTree());
                    pushFollow(FOLLOW_delim_in_stmt3495);
                    delim298=delim();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, delim298.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 78, stmt_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "stmt"

    public static class stmtAssign_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "stmtAssign"
    // pollen.g:635:1: stmtAssign : ( varOrFcnOrArray ASSIGN expr -> ^( S_ASSIGN varOrFcnOrArray ASSIGN expr ) | injectionCode ASSIGN expr -> ^( S_ASSIGN ^( INJECT_CODE injectionCode ) ASSIGN expr ) | varOrFcnOrArray assignOp expr -> ^( S_ASSIGN varOrFcnOrArray assignOp expr ) | injectionCode assignOp expr -> ^( S_ASSIGN ^( INJECT_CODE injectionCode ) assignOp expr ) );
    public final pollenParser.stmtAssign_return stmtAssign() throws RecognitionException {
        pollenParser.stmtAssign_return retval = new pollenParser.stmtAssign_return();
        retval.start = input.LT(1);
        int stmtAssign_StartIndex = input.index();
        Object root_0 = null;

        Token ASSIGN300=null;
        Token ASSIGN303=null;
        pollenParser.varOrFcnOrArray_return varOrFcnOrArray299 = null;

        pollenParser.expr_return expr301 = null;

        pollenParser.injectionCode_return injectionCode302 = null;

        pollenParser.expr_return expr304 = null;

        pollenParser.varOrFcnOrArray_return varOrFcnOrArray305 = null;

        pollenParser.assignOp_return assignOp306 = null;

        pollenParser.expr_return expr307 = null;

        pollenParser.injectionCode_return injectionCode308 = null;

        pollenParser.assignOp_return assignOp309 = null;

        pollenParser.expr_return expr310 = null;


        Object ASSIGN300_tree=null;
        Object ASSIGN303_tree=null;
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
        RewriteRuleSubtreeStream stream_assignOp=new RewriteRuleSubtreeStream(adaptor,"rule assignOp");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_injectionCode=new RewriteRuleSubtreeStream(adaptor,"rule injectionCode");
        RewriteRuleSubtreeStream stream_varOrFcnOrArray=new RewriteRuleSubtreeStream(adaptor,"rule varOrFcnOrArray");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 79) ) { return retval; }
            // pollen.g:636:2: ( varOrFcnOrArray ASSIGN expr -> ^( S_ASSIGN varOrFcnOrArray ASSIGN expr ) | injectionCode ASSIGN expr -> ^( S_ASSIGN ^( INJECT_CODE injectionCode ) ASSIGN expr ) | varOrFcnOrArray assignOp expr -> ^( S_ASSIGN varOrFcnOrArray assignOp expr ) | injectionCode assignOp expr -> ^( S_ASSIGN ^( INJECT_CODE injectionCode ) assignOp expr ) )
            int alt83=4;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==IDENT||(LA83_0>=166 && LA83_0<=167)) ) {
                int LA83_1 = input.LA(2);

                if ( (synpred150_pollen()) ) {
                    alt83=1;
                }
                else if ( (synpred152_pollen()) ) {
                    alt83=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 83, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA83_0==INJECT) ) {
                int LA83_4 = input.LA(2);

                if ( (synpred151_pollen()) ) {
                    alt83=2;
                }
                else if ( (true) ) {
                    alt83=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 83, 4, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 83, 0, input);

                throw nvae;
            }
            switch (alt83) {
                case 1 :
                    // pollen.g:636:4: varOrFcnOrArray ASSIGN expr
                    {
                    pushFollow(FOLLOW_varOrFcnOrArray_in_stmtAssign3505);
                    varOrFcnOrArray299=varOrFcnOrArray();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_varOrFcnOrArray.add(varOrFcnOrArray299.getTree());
                    ASSIGN300=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_stmtAssign3507); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ASSIGN.add(ASSIGN300);

                    pushFollow(FOLLOW_expr_in_stmtAssign3509);
                    expr301=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr301.getTree());


                    // AST REWRITE
                    // elements: expr, ASSIGN, varOrFcnOrArray
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 636:32: -> ^( S_ASSIGN varOrFcnOrArray ASSIGN expr )
                    {
                        // pollen.g:636:35: ^( S_ASSIGN varOrFcnOrArray ASSIGN expr )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(S_ASSIGN, "S_ASSIGN"), root_1);

                        adaptor.addChild(root_1, stream_varOrFcnOrArray.nextTree());
                        adaptor.addChild(root_1, stream_ASSIGN.nextNode());
                        adaptor.addChild(root_1, stream_expr.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // pollen.g:637:4: injectionCode ASSIGN expr
                    {
                    pushFollow(FOLLOW_injectionCode_in_stmtAssign3526);
                    injectionCode302=injectionCode();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_injectionCode.add(injectionCode302.getTree());
                    ASSIGN303=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_stmtAssign3528); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ASSIGN.add(ASSIGN303);

                    pushFollow(FOLLOW_expr_in_stmtAssign3530);
                    expr304=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr304.getTree());


                    // AST REWRITE
                    // elements: injectionCode, expr, ASSIGN
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 637:31: -> ^( S_ASSIGN ^( INJECT_CODE injectionCode ) ASSIGN expr )
                    {
                        // pollen.g:637:34: ^( S_ASSIGN ^( INJECT_CODE injectionCode ) ASSIGN expr )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(S_ASSIGN, "S_ASSIGN"), root_1);

                        // pollen.g:637:45: ^( INJECT_CODE injectionCode )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(INJECT_CODE, "INJECT_CODE"), root_2);

                        adaptor.addChild(root_2, stream_injectionCode.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        adaptor.addChild(root_1, stream_ASSIGN.nextNode());
                        adaptor.addChild(root_1, stream_expr.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // pollen.g:638:4: varOrFcnOrArray assignOp expr
                    {
                    pushFollow(FOLLOW_varOrFcnOrArray_in_stmtAssign3552);
                    varOrFcnOrArray305=varOrFcnOrArray();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_varOrFcnOrArray.add(varOrFcnOrArray305.getTree());
                    pushFollow(FOLLOW_assignOp_in_stmtAssign3554);
                    assignOp306=assignOp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_assignOp.add(assignOp306.getTree());
                    pushFollow(FOLLOW_expr_in_stmtAssign3556);
                    expr307=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr307.getTree());


                    // AST REWRITE
                    // elements: assignOp, expr, varOrFcnOrArray
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 638:35: -> ^( S_ASSIGN varOrFcnOrArray assignOp expr )
                    {
                        // pollen.g:638:38: ^( S_ASSIGN varOrFcnOrArray assignOp expr )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(S_ASSIGN, "S_ASSIGN"), root_1);

                        adaptor.addChild(root_1, stream_varOrFcnOrArray.nextTree());
                        adaptor.addChild(root_1, stream_assignOp.nextTree());
                        adaptor.addChild(root_1, stream_expr.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // pollen.g:639:4: injectionCode assignOp expr
                    {
                    pushFollow(FOLLOW_injectionCode_in_stmtAssign3574);
                    injectionCode308=injectionCode();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_injectionCode.add(injectionCode308.getTree());
                    pushFollow(FOLLOW_assignOp_in_stmtAssign3576);
                    assignOp309=assignOp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_assignOp.add(assignOp309.getTree());
                    pushFollow(FOLLOW_expr_in_stmtAssign3578);
                    expr310=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr310.getTree());


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

                    root_0 = (Object)adaptor.nil();
                    // 639:32: -> ^( S_ASSIGN ^( INJECT_CODE injectionCode ) assignOp expr )
                    {
                        // pollen.g:639:35: ^( S_ASSIGN ^( INJECT_CODE injectionCode ) assignOp expr )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(S_ASSIGN, "S_ASSIGN"), root_1);

                        // pollen.g:639:46: ^( INJECT_CODE injectionCode )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(INJECT_CODE, "INJECT_CODE"), root_2);

                        adaptor.addChild(root_2, stream_injectionCode.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        adaptor.addChild(root_1, stream_assignOp.nextTree());
                        adaptor.addChild(root_1, stream_expr.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
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
            if ( state.backtracking>0 ) { memoize(input, 79, stmtAssign_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "stmtAssign"

    public static class stmtAssert_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "stmtAssert"
    // pollen.g:641:1: stmtAssert : 'assert' exprList delim -> ^( S_ASSERT exprList ) ;
    public final pollenParser.stmtAssert_return stmtAssert() throws RecognitionException {
        pollenParser.stmtAssert_return retval = new pollenParser.stmtAssert_return();
        retval.start = input.LT(1);
        int stmtAssert_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal311=null;
        pollenParser.exprList_return exprList312 = null;

        pollenParser.delim_return delim313 = null;


        Object string_literal311_tree=null;
        RewriteRuleTokenStream stream_169=new RewriteRuleTokenStream(adaptor,"token 169");
        RewriteRuleSubtreeStream stream_delim=new RewriteRuleSubtreeStream(adaptor,"rule delim");
        RewriteRuleSubtreeStream stream_exprList=new RewriteRuleSubtreeStream(adaptor,"rule exprList");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 80) ) { return retval; }
            // pollen.g:642:2: ( 'assert' exprList delim -> ^( S_ASSERT exprList ) )
            // pollen.g:642:4: 'assert' exprList delim
            {
            string_literal311=(Token)match(input,169,FOLLOW_169_in_stmtAssert3604); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_169.add(string_literal311);

            pushFollow(FOLLOW_exprList_in_stmtAssert3606);
            exprList312=exprList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_exprList.add(exprList312.getTree());
            pushFollow(FOLLOW_delim_in_stmtAssert3608);
            delim313=delim();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_delim.add(delim313.getTree());


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
            // 642:28: -> ^( S_ASSERT exprList )
            {
                // pollen.g:642:31: ^( S_ASSERT exprList )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(S_ASSERT, "S_ASSERT"), root_1);

                adaptor.addChild(root_1, stream_exprList.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
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
            if ( state.backtracking>0 ) { memoize(input, 80, stmtAssert_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "stmtAssert"

    public static class stmtBind_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "stmtBind"
    // pollen.g:644:1: stmtBind : varOrFcnOrArray BIND expr delim -> ^( S_BIND varOrFcnOrArray expr ) ;
    public final pollenParser.stmtBind_return stmtBind() throws RecognitionException {
        pollenParser.stmtBind_return retval = new pollenParser.stmtBind_return();
        retval.start = input.LT(1);
        int stmtBind_StartIndex = input.index();
        Object root_0 = null;

        Token BIND315=null;
        pollenParser.varOrFcnOrArray_return varOrFcnOrArray314 = null;

        pollenParser.expr_return expr316 = null;

        pollenParser.delim_return delim317 = null;


        Object BIND315_tree=null;
        RewriteRuleTokenStream stream_BIND=new RewriteRuleTokenStream(adaptor,"token BIND");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_varOrFcnOrArray=new RewriteRuleSubtreeStream(adaptor,"rule varOrFcnOrArray");
        RewriteRuleSubtreeStream stream_delim=new RewriteRuleSubtreeStream(adaptor,"rule delim");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 81) ) { return retval; }
            // pollen.g:645:2: ( varOrFcnOrArray BIND expr delim -> ^( S_BIND varOrFcnOrArray expr ) )
            // pollen.g:645:4: varOrFcnOrArray BIND expr delim
            {
            pushFollow(FOLLOW_varOrFcnOrArray_in_stmtBind3626);
            varOrFcnOrArray314=varOrFcnOrArray();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_varOrFcnOrArray.add(varOrFcnOrArray314.getTree());
            BIND315=(Token)match(input,BIND,FOLLOW_BIND_in_stmtBind3628); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_BIND.add(BIND315);

            pushFollow(FOLLOW_expr_in_stmtBind3631);
            expr316=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr316.getTree());
            pushFollow(FOLLOW_delim_in_stmtBind3634);
            delim317=delim();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_delim.add(delim317.getTree());


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

            root_0 = (Object)adaptor.nil();
            // 645:38: -> ^( S_BIND varOrFcnOrArray expr )
            {
                // pollen.g:645:41: ^( S_BIND varOrFcnOrArray expr )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(S_BIND, "S_BIND"), root_1);

                adaptor.addChild(root_1, stream_varOrFcnOrArray.nextTree());
                adaptor.addChild(root_1, stream_expr.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
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
            if ( state.backtracking>0 ) { memoize(input, 81, stmtBind_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "stmtBind"

    public static class stmtPrint_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "stmtPrint"
    // pollen.g:647:1: stmtPrint : 'print' ( stmtPrintTarget )? exprList -> ^( S_PRINT ( stmtPrintTarget )? exprList ) ;
    public final pollenParser.stmtPrint_return stmtPrint() throws RecognitionException {
        pollenParser.stmtPrint_return retval = new pollenParser.stmtPrint_return();
        retval.start = input.LT(1);
        int stmtPrint_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal318=null;
        pollenParser.stmtPrintTarget_return stmtPrintTarget319 = null;

        pollenParser.exprList_return exprList320 = null;


        Object string_literal318_tree=null;
        RewriteRuleTokenStream stream_170=new RewriteRuleTokenStream(adaptor,"token 170");
        RewriteRuleSubtreeStream stream_stmtPrintTarget=new RewriteRuleSubtreeStream(adaptor,"rule stmtPrintTarget");
        RewriteRuleSubtreeStream stream_exprList=new RewriteRuleSubtreeStream(adaptor,"rule exprList");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 82) ) { return retval; }
            // pollen.g:648:2: ( 'print' ( stmtPrintTarget )? exprList -> ^( S_PRINT ( stmtPrintTarget )? exprList ) )
            // pollen.g:648:4: 'print' ( stmtPrintTarget )? exprList
            {
            string_literal318=(Token)match(input,170,FOLLOW_170_in_stmtPrint3656); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_170.add(string_literal318);

            // pollen.g:648:12: ( stmtPrintTarget )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( ((LA84_0>=171 && LA84_0<=173)) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // pollen.g:648:13: stmtPrintTarget
                    {
                    pushFollow(FOLLOW_stmtPrintTarget_in_stmtPrint3659);
                    stmtPrintTarget319=stmtPrintTarget();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_stmtPrintTarget.add(stmtPrintTarget319.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_exprList_in_stmtPrint3663);
            exprList320=exprList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_exprList.add(exprList320.getTree());


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
            // 649:3: -> ^( S_PRINT ( stmtPrintTarget )? exprList )
            {
                // pollen.g:649:6: ^( S_PRINT ( stmtPrintTarget )? exprList )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(S_PRINT, "S_PRINT"), root_1);

                // pollen.g:649:16: ( stmtPrintTarget )?
                if ( stream_stmtPrintTarget.hasNext() ) {
                    adaptor.addChild(root_1, stream_stmtPrintTarget.nextTree());

                }
                stream_stmtPrintTarget.reset();
                adaptor.addChild(root_1, stream_exprList.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
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
            if ( state.backtracking>0 ) { memoize(input, 82, stmtPrint_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "stmtPrint"

    public static class stmtPrintTarget_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "stmtPrintTarget"
    // pollen.g:651:1: stmtPrintTarget : ( 'log' | 'err' | 'out' ) ;
    public final pollenParser.stmtPrintTarget_return stmtPrintTarget() throws RecognitionException {
        pollenParser.stmtPrintTarget_return retval = new pollenParser.stmtPrintTarget_return();
        retval.start = input.LT(1);
        int stmtPrintTarget_StartIndex = input.index();
        Object root_0 = null;

        Token set321=null;

        Object set321_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 83) ) { return retval; }
            // pollen.g:652:2: ( ( 'log' | 'err' | 'out' ) )
            // pollen.g:652:4: ( 'log' | 'err' | 'out' )
            {
            root_0 = (Object)adaptor.nil();

            set321=(Token)input.LT(1);
            if ( (input.LA(1)>=171 && input.LA(1)<=173) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set321));
                state.errorRecovery=false;state.failed=false;
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
            if ( state.backtracking>0 ) { memoize(input, 83, stmtPrintTarget_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "stmtPrintTarget"

    public static class stmtReturn_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "stmtReturn"
    // pollen.g:654:1: stmtReturn : ( 'return' ( '(' ) ( expr ( ',' expr )+ ) ( ')' ) delim -> ^( S_RETURN ( expr )+ ) | 'return' ( expr ) delim -> ^( S_RETURN expr ) );
    public final pollenParser.stmtReturn_return stmtReturn() throws RecognitionException {
        pollenParser.stmtReturn_return retval = new pollenParser.stmtReturn_return();
        retval.start = input.LT(1);
        int stmtReturn_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal322=null;
        Token char_literal323=null;
        Token char_literal325=null;
        Token char_literal327=null;
        Token string_literal329=null;
        pollenParser.expr_return expr324 = null;

        pollenParser.expr_return expr326 = null;

        pollenParser.delim_return delim328 = null;

        pollenParser.expr_return expr330 = null;

        pollenParser.delim_return delim331 = null;


        Object string_literal322_tree=null;
        Object char_literal323_tree=null;
        Object char_literal325_tree=null;
        Object char_literal327_tree=null;
        Object string_literal329_tree=null;
        RewriteRuleTokenStream stream_161=new RewriteRuleTokenStream(adaptor,"token 161");
        RewriteRuleTokenStream stream_174=new RewriteRuleTokenStream(adaptor,"token 174");
        RewriteRuleTokenStream stream_160=new RewriteRuleTokenStream(adaptor,"token 160");
        RewriteRuleTokenStream stream_130=new RewriteRuleTokenStream(adaptor,"token 130");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_delim=new RewriteRuleSubtreeStream(adaptor,"rule delim");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 84) ) { return retval; }
            // pollen.g:657:2: ( 'return' ( '(' ) ( expr ( ',' expr )+ ) ( ')' ) delim -> ^( S_RETURN ( expr )+ ) | 'return' ( expr ) delim -> ^( S_RETURN expr ) )
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==174) ) {
                int LA86_1 = input.LA(2);

                if ( (synpred157_pollen()) ) {
                    alt86=1;
                }
                else if ( (true) ) {
                    alt86=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 86, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 86, 0, input);

                throw nvae;
            }
            switch (alt86) {
                case 1 :
                    // pollen.g:657:4: 'return' ( '(' ) ( expr ( ',' expr )+ ) ( ')' ) delim
                    {
                    string_literal322=(Token)match(input,174,FOLLOW_174_in_stmtReturn3709); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_174.add(string_literal322);

                    // pollen.g:657:13: ( '(' )
                    // pollen.g:657:14: '('
                    {
                    char_literal323=(Token)match(input,160,FOLLOW_160_in_stmtReturn3712); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_160.add(char_literal323);


                    }

                    // pollen.g:657:19: ( expr ( ',' expr )+ )
                    // pollen.g:657:20: expr ( ',' expr )+
                    {
                    pushFollow(FOLLOW_expr_in_stmtReturn3716);
                    expr324=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr324.getTree());
                    // pollen.g:657:25: ( ',' expr )+
                    int cnt85=0;
                    loop85:
                    do {
                        int alt85=2;
                        int LA85_0 = input.LA(1);

                        if ( (LA85_0==130) ) {
                            alt85=1;
                        }


                        switch (alt85) {
                    	case 1 :
                    	    // pollen.g:657:26: ',' expr
                    	    {
                    	    char_literal325=(Token)match(input,130,FOLLOW_130_in_stmtReturn3719); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_130.add(char_literal325);

                    	    pushFollow(FOLLOW_expr_in_stmtReturn3721);
                    	    expr326=expr();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_expr.add(expr326.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt85 >= 1 ) break loop85;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(85, input);
                                throw eee;
                        }
                        cnt85++;
                    } while (true);


                    }

                    // pollen.g:657:38: ( ')' )
                    // pollen.g:657:39: ')'
                    {
                    char_literal327=(Token)match(input,161,FOLLOW_161_in_stmtReturn3727); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_161.add(char_literal327);


                    }

                    pushFollow(FOLLOW_delim_in_stmtReturn3730);
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

                    root_0 = (Object)adaptor.nil();
                    // 657:50: -> ^( S_RETURN ( expr )+ )
                    {
                        // pollen.g:657:53: ^( S_RETURN ( expr )+ )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(S_RETURN, "S_RETURN"), root_1);

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

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // pollen.g:658:4: 'return' ( expr ) delim
                    {
                    string_literal329=(Token)match(input,174,FOLLOW_174_in_stmtReturn3744); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_174.add(string_literal329);

                    // pollen.g:658:14: ( expr )
                    // pollen.g:658:15: expr
                    {
                    pushFollow(FOLLOW_expr_in_stmtReturn3748);
                    expr330=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr330.getTree());

                    }

                    pushFollow(FOLLOW_delim_in_stmtReturn3752);
                    delim331=delim();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_delim.add(delim331.getTree());


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
                    // 658:28: -> ^( S_RETURN expr )
                    {
                        // pollen.g:658:31: ^( S_RETURN expr )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(S_RETURN, "S_RETURN"), root_1);

                        adaptor.addChild(root_1, stream_expr.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
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
            if ( state.backtracking>0 ) { memoize(input, 84, stmtReturn_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "stmtReturn"

    public static class stmtBreak_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "stmtBreak"
    // pollen.g:660:1: stmtBreak : 'break' delim -> ^( S_BREAK ) ;
    public final pollenParser.stmtBreak_return stmtBreak() throws RecognitionException {
        pollenParser.stmtBreak_return retval = new pollenParser.stmtBreak_return();
        retval.start = input.LT(1);
        int stmtBreak_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal332=null;
        pollenParser.delim_return delim333 = null;


        Object string_literal332_tree=null;
        RewriteRuleTokenStream stream_175=new RewriteRuleTokenStream(adaptor,"token 175");
        RewriteRuleSubtreeStream stream_delim=new RewriteRuleSubtreeStream(adaptor,"rule delim");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 85) ) { return retval; }
            // pollen.g:661:2: ( 'break' delim -> ^( S_BREAK ) )
            // pollen.g:661:4: 'break' delim
            {
            string_literal332=(Token)match(input,175,FOLLOW_175_in_stmtBreak3770); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_175.add(string_literal332);

            pushFollow(FOLLOW_delim_in_stmtBreak3772);
            delim333=delim();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_delim.add(delim333.getTree());


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
            // 661:18: -> ^( S_BREAK )
            {
                // pollen.g:661:21: ^( S_BREAK )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(S_BREAK, "S_BREAK"), root_1);

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
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
            if ( state.backtracking>0 ) { memoize(input, 85, stmtBreak_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "stmtBreak"

    public static class stmtContinue_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "stmtContinue"
    // pollen.g:663:1: stmtContinue : 'continue' delim -> ^( S_CONTINUE ) ;
    public final pollenParser.stmtContinue_return stmtContinue() throws RecognitionException {
        pollenParser.stmtContinue_return retval = new pollenParser.stmtContinue_return();
        retval.start = input.LT(1);
        int stmtContinue_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal334=null;
        pollenParser.delim_return delim335 = null;


        Object string_literal334_tree=null;
        RewriteRuleTokenStream stream_176=new RewriteRuleTokenStream(adaptor,"token 176");
        RewriteRuleSubtreeStream stream_delim=new RewriteRuleSubtreeStream(adaptor,"rule delim");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 86) ) { return retval; }
            // pollen.g:664:2: ( 'continue' delim -> ^( S_CONTINUE ) )
            // pollen.g:664:4: 'continue' delim
            {
            string_literal334=(Token)match(input,176,FOLLOW_176_in_stmtContinue3788); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_176.add(string_literal334);

            pushFollow(FOLLOW_delim_in_stmtContinue3790);
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
            // 664:21: -> ^( S_CONTINUE )
            {
                // pollen.g:664:24: ^( S_CONTINUE )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(S_CONTINUE, "S_CONTINUE"), root_1);

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
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
            if ( state.backtracking>0 ) { memoize(input, 86, stmtContinue_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "stmtContinue"

    public static class stmtFor_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "stmtFor"
    // pollen.g:666:1: stmtFor : 'for' '(' stmtForInit SEMI stmtForCond SEMI stmtForNext ')' stmtBlock -> ^( S_FOR stmtForInit stmtForCond stmtForNext stmtBlock ) ;
    public final pollenParser.stmtFor_return stmtFor() throws RecognitionException {
        pollenParser.stmtFor_return retval = new pollenParser.stmtFor_return();
        retval.start = input.LT(1);
        int stmtFor_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal336=null;
        Token char_literal337=null;
        Token SEMI339=null;
        Token SEMI341=null;
        Token char_literal343=null;
        pollenParser.stmtForInit_return stmtForInit338 = null;

        pollenParser.stmtForCond_return stmtForCond340 = null;

        pollenParser.stmtForNext_return stmtForNext342 = null;

        pollenParser.stmtBlock_return stmtBlock344 = null;


        Object string_literal336_tree=null;
        Object char_literal337_tree=null;
        Object SEMI339_tree=null;
        Object SEMI341_tree=null;
        Object char_literal343_tree=null;
        RewriteRuleTokenStream stream_161=new RewriteRuleTokenStream(adaptor,"token 161");
        RewriteRuleTokenStream stream_160=new RewriteRuleTokenStream(adaptor,"token 160");
        RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
        RewriteRuleTokenStream stream_177=new RewriteRuleTokenStream(adaptor,"token 177");
        RewriteRuleSubtreeStream stream_stmtForCond=new RewriteRuleSubtreeStream(adaptor,"rule stmtForCond");
        RewriteRuleSubtreeStream stream_stmtForInit=new RewriteRuleSubtreeStream(adaptor,"rule stmtForInit");
        RewriteRuleSubtreeStream stream_stmtBlock=new RewriteRuleSubtreeStream(adaptor,"rule stmtBlock");
        RewriteRuleSubtreeStream stream_stmtForNext=new RewriteRuleSubtreeStream(adaptor,"rule stmtForNext");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 87) ) { return retval; }
            // pollen.g:667:5: ( 'for' '(' stmtForInit SEMI stmtForCond SEMI stmtForNext ')' stmtBlock -> ^( S_FOR stmtForInit stmtForCond stmtForNext stmtBlock ) )
            // pollen.g:667:9: 'for' '(' stmtForInit SEMI stmtForCond SEMI stmtForNext ')' stmtBlock
            {
            string_literal336=(Token)match(input,177,FOLLOW_177_in_stmtFor3811); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_177.add(string_literal336);

            char_literal337=(Token)match(input,160,FOLLOW_160_in_stmtFor3813); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_160.add(char_literal337);

            pushFollow(FOLLOW_stmtForInit_in_stmtFor3815);
            stmtForInit338=stmtForInit();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_stmtForInit.add(stmtForInit338.getTree());
            SEMI339=(Token)match(input,SEMI,FOLLOW_SEMI_in_stmtFor3817); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SEMI.add(SEMI339);

            pushFollow(FOLLOW_stmtForCond_in_stmtFor3819);
            stmtForCond340=stmtForCond();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_stmtForCond.add(stmtForCond340.getTree());
            SEMI341=(Token)match(input,SEMI,FOLLOW_SEMI_in_stmtFor3821); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SEMI.add(SEMI341);

            pushFollow(FOLLOW_stmtForNext_in_stmtFor3823);
            stmtForNext342=stmtForNext();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_stmtForNext.add(stmtForNext342.getTree());
            char_literal343=(Token)match(input,161,FOLLOW_161_in_stmtFor3825); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_161.add(char_literal343);

            pushFollow(FOLLOW_stmtBlock_in_stmtFor3827);
            stmtBlock344=stmtBlock();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_stmtBlock.add(stmtBlock344.getTree());


            // AST REWRITE
            // elements: stmtForNext, stmtBlock, stmtForInit, stmtForCond
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 668:13: -> ^( S_FOR stmtForInit stmtForCond stmtForNext stmtBlock )
            {
                // pollen.g:668:16: ^( S_FOR stmtForInit stmtForCond stmtForNext stmtBlock )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(S_FOR, "S_FOR"), root_1);

                adaptor.addChild(root_1, stream_stmtForInit.nextTree());
                adaptor.addChild(root_1, stream_stmtForCond.nextTree());
                adaptor.addChild(root_1, stream_stmtForNext.nextTree());
                adaptor.addChild(root_1, stream_stmtBlock.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
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
            if ( state.backtracking>0 ) { memoize(input, 87, stmtFor_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "stmtFor"

    public static class stmtForCond_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "stmtForCond"
    // pollen.g:670:1: stmtForCond : ( -> NIL | expr );
    public final pollenParser.stmtForCond_return stmtForCond() throws RecognitionException {
        pollenParser.stmtForCond_return retval = new pollenParser.stmtForCond_return();
        retval.start = input.LT(1);
        int stmtForCond_StartIndex = input.index();
        Object root_0 = null;

        pollenParser.expr_return expr345 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 88) ) { return retval; }
            // pollen.g:671:5: ( -> NIL | expr )
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==SEMI) ) {
                alt87=1;
            }
            else if ( (LA87_0==IDENT||(LA87_0>=INT_LIT && LA87_0<=CHAR)||(LA87_0>=LOG_NOT && LA87_0<=BIT_NOT)||(LA87_0>=OCT_LIT && LA87_0<=INJECT)||LA87_0==140||LA87_0==149||LA87_0==160||(LA87_0>=162 && LA87_0<=163)||(LA87_0>=166 && LA87_0<=167)||(LA87_0>=200 && LA87_0<=202)) ) {
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
                    // pollen.g:672:12: 
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
                    // 672:12: -> NIL
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(NIL, "NIL"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // pollen.g:673:9: expr
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_expr_in_stmtForCond3895);
                    expr345=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr345.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 88, stmtForCond_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "stmtForCond"

    public static class stmtForInit_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "stmtForInit"
    // pollen.g:676:1: stmtForInit : ( -> NIL | typeName IDENT '=' expr -> ^( S_DECL ^( typeName IDENT expr ) ) | stmtAssign );
    public final pollenParser.stmtForInit_return stmtForInit() throws RecognitionException {
        pollenParser.stmtForInit_return retval = new pollenParser.stmtForInit_return();
        retval.start = input.LT(1);
        int stmtForInit_StartIndex = input.index();
        Object root_0 = null;

        Token IDENT347=null;
        Token char_literal348=null;
        pollenParser.typeName_return typeName346 = null;

        pollenParser.expr_return expr349 = null;

        pollenParser.stmtAssign_return stmtAssign350 = null;


        Object IDENT347_tree=null;
        Object char_literal348_tree=null;
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
        RewriteRuleSubtreeStream stream_typeName=new RewriteRuleSubtreeStream(adaptor,"rule typeName");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 89) ) { return retval; }
            // pollen.g:677:5: ( -> NIL | typeName IDENT '=' expr -> ^( S_DECL ^( typeName IDENT expr ) ) | stmtAssign )
            int alt88=3;
            switch ( input.LA(1) ) {
            case 191:
            case 192:
            case 193:
            case 194:
            case 195:
            case 196:
            case 197:
            case 198:
            case 199:
                {
                alt88=2;
                }
                break;
            case SEMI:
                {
                alt88=1;
                }
                break;
            case INJECT:
            case 166:
            case 167:
                {
                alt88=3;
                }
                break;
            case IDENT:
                {
                int LA88_4 = input.LA(2);

                if ( (synpred160_pollen()) ) {
                    alt88=2;
                }
                else if ( (true) ) {
                    alt88=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 88, 4, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 88, 0, input);

                throw nvae;
            }

            switch (alt88) {
                case 1 :
                    // pollen.g:678:13: 
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
                    // 678:13: -> NIL
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(NIL, "NIL"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // pollen.g:679:9: typeName IDENT '=' expr
                    {
                    pushFollow(FOLLOW_typeName_in_stmtForInit3939);
                    typeName346=typeName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeName.add(typeName346.getTree());
                    IDENT347=(Token)match(input,IDENT,FOLLOW_IDENT_in_stmtForInit3941); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENT.add(IDENT347);

                    char_literal348=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_stmtForInit3943); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ASSIGN.add(char_literal348);

                    pushFollow(FOLLOW_expr_in_stmtForInit3945);
                    expr349=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr349.getTree());


                    // AST REWRITE
                    // elements: IDENT, expr, typeName
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 680:13: -> ^( S_DECL ^( typeName IDENT expr ) )
                    {
                        // pollen.g:680:16: ^( S_DECL ^( typeName IDENT expr ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(S_DECL, "S_DECL"), root_1);

                        // pollen.g:680:25: ^( typeName IDENT expr )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_typeName.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_IDENT.nextNode());
                        adaptor.addChild(root_2, stream_expr.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // pollen.g:681:9: stmtAssign
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_stmtAssign_in_stmtForInit3982);
                    stmtAssign350=stmtAssign();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmtAssign350.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 89, stmtForInit_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "stmtForInit"

    public static class stmtForNext_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "stmtForNext"
    // pollen.g:683:1: stmtForNext : ( -> NIL | expr );
    public final pollenParser.stmtForNext_return stmtForNext() throws RecognitionException {
        pollenParser.stmtForNext_return retval = new pollenParser.stmtForNext_return();
        retval.start = input.LT(1);
        int stmtForNext_StartIndex = input.index();
        Object root_0 = null;

        pollenParser.expr_return expr351 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 90) ) { return retval; }
            // pollen.g:684:5: ( -> NIL | expr )
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==161) ) {
                alt89=1;
            }
            else if ( (LA89_0==IDENT||(LA89_0>=INT_LIT && LA89_0<=CHAR)||(LA89_0>=LOG_NOT && LA89_0<=BIT_NOT)||(LA89_0>=OCT_LIT && LA89_0<=INJECT)||LA89_0==140||LA89_0==149||LA89_0==160||(LA89_0>=162 && LA89_0<=163)||(LA89_0>=166 && LA89_0<=167)||(LA89_0>=200 && LA89_0<=202)) ) {
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
                    // pollen.g:685:13: 
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
                    // 685:13: -> NIL
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(NIL, "NIL"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // pollen.g:686:9: expr
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_expr_in_stmtForNext4025);
                    expr351=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr351.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 90, stmtForNext_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "stmtForNext"

    public static class stmtForEach_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "stmtForEach"
    // pollen.g:688:1: stmtForEach : 'foreach' '(' IDENT 'in' expr ')' stmtBlock -> ^( S_FOREACH IDENT ^( E_IDENT expr ) stmtBlock ) ;
    public final pollenParser.stmtForEach_return stmtForEach() throws RecognitionException {
        pollenParser.stmtForEach_return retval = new pollenParser.stmtForEach_return();
        retval.start = input.LT(1);
        int stmtForEach_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal352=null;
        Token char_literal353=null;
        Token IDENT354=null;
        Token string_literal355=null;
        Token char_literal357=null;
        pollenParser.expr_return expr356 = null;

        pollenParser.stmtBlock_return stmtBlock358 = null;


        Object string_literal352_tree=null;
        Object char_literal353_tree=null;
        Object IDENT354_tree=null;
        Object string_literal355_tree=null;
        Object char_literal357_tree=null;
        RewriteRuleTokenStream stream_161=new RewriteRuleTokenStream(adaptor,"token 161");
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleTokenStream stream_160=new RewriteRuleTokenStream(adaptor,"token 160");
        RewriteRuleTokenStream stream_179=new RewriteRuleTokenStream(adaptor,"token 179");
        RewriteRuleTokenStream stream_178=new RewriteRuleTokenStream(adaptor,"token 178");
        RewriteRuleSubtreeStream stream_stmtBlock=new RewriteRuleSubtreeStream(adaptor,"rule stmtBlock");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 91) ) { return retval; }
            // pollen.g:689:2: ( 'foreach' '(' IDENT 'in' expr ')' stmtBlock -> ^( S_FOREACH IDENT ^( E_IDENT expr ) stmtBlock ) )
            // pollen.g:689:4: 'foreach' '(' IDENT 'in' expr ')' stmtBlock
            {
            string_literal352=(Token)match(input,178,FOLLOW_178_in_stmtForEach4038); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_178.add(string_literal352);

            char_literal353=(Token)match(input,160,FOLLOW_160_in_stmtForEach4040); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_160.add(char_literal353);

            IDENT354=(Token)match(input,IDENT,FOLLOW_IDENT_in_stmtForEach4042); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENT.add(IDENT354);

            string_literal355=(Token)match(input,179,FOLLOW_179_in_stmtForEach4044); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_179.add(string_literal355);

            pushFollow(FOLLOW_expr_in_stmtForEach4046);
            expr356=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr356.getTree());
            char_literal357=(Token)match(input,161,FOLLOW_161_in_stmtForEach4048); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_161.add(char_literal357);

            pushFollow(FOLLOW_stmtBlock_in_stmtForEach4050);
            stmtBlock358=stmtBlock();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_stmtBlock.add(stmtBlock358.getTree());


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
            // 689:48: -> ^( S_FOREACH IDENT ^( E_IDENT expr ) stmtBlock )
            {
                // pollen.g:689:51: ^( S_FOREACH IDENT ^( E_IDENT expr ) stmtBlock )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(S_FOREACH, "S_FOREACH"), root_1);

                adaptor.addChild(root_1, stream_IDENT.nextNode());
                // pollen.g:689:69: ^( E_IDENT expr )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(E_IDENT, "E_IDENT"), root_2);

                adaptor.addChild(root_2, stream_expr.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                adaptor.addChild(root_1, stream_stmtBlock.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
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
            if ( state.backtracking>0 ) { memoize(input, 91, stmtForEach_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "stmtForEach"

    public static class stmtSwitch_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "stmtSwitch"
    // pollen.g:691:1: stmtSwitch : 'switch' '(' expr ')' braceOpen stmtsCase braceClose -> ^( S_SWITCH ^( E_COND expr ) stmtsCase ) ;
    public final pollenParser.stmtSwitch_return stmtSwitch() throws RecognitionException {
        pollenParser.stmtSwitch_return retval = new pollenParser.stmtSwitch_return();
        retval.start = input.LT(1);
        int stmtSwitch_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal359=null;
        Token char_literal360=null;
        Token char_literal362=null;
        pollenParser.expr_return expr361 = null;

        pollenParser.braceOpen_return braceOpen363 = null;

        pollenParser.stmtsCase_return stmtsCase364 = null;

        pollenParser.braceClose_return braceClose365 = null;


        Object string_literal359_tree=null;
        Object char_literal360_tree=null;
        Object char_literal362_tree=null;
        RewriteRuleTokenStream stream_161=new RewriteRuleTokenStream(adaptor,"token 161");
        RewriteRuleTokenStream stream_180=new RewriteRuleTokenStream(adaptor,"token 180");
        RewriteRuleTokenStream stream_160=new RewriteRuleTokenStream(adaptor,"token 160");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_stmtsCase=new RewriteRuleSubtreeStream(adaptor,"rule stmtsCase");
        RewriteRuleSubtreeStream stream_braceOpen=new RewriteRuleSubtreeStream(adaptor,"rule braceOpen");
        RewriteRuleSubtreeStream stream_braceClose=new RewriteRuleSubtreeStream(adaptor,"rule braceClose");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 92) ) { return retval; }
            // pollen.g:692:2: ( 'switch' '(' expr ')' braceOpen stmtsCase braceClose -> ^( S_SWITCH ^( E_COND expr ) stmtsCase ) )
            // pollen.g:692:4: 'switch' '(' expr ')' braceOpen stmtsCase braceClose
            {
            string_literal359=(Token)match(input,180,FOLLOW_180_in_stmtSwitch4076); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_180.add(string_literal359);

            char_literal360=(Token)match(input,160,FOLLOW_160_in_stmtSwitch4078); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_160.add(char_literal360);

            pushFollow(FOLLOW_expr_in_stmtSwitch4080);
            expr361=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr361.getTree());
            char_literal362=(Token)match(input,161,FOLLOW_161_in_stmtSwitch4082); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_161.add(char_literal362);

            pushFollow(FOLLOW_braceOpen_in_stmtSwitch4084);
            braceOpen363=braceOpen();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_braceOpen.add(braceOpen363.getTree());
            pushFollow(FOLLOW_stmtsCase_in_stmtSwitch4086);
            stmtsCase364=stmtsCase();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_stmtsCase.add(stmtsCase364.getTree());
            pushFollow(FOLLOW_braceClose_in_stmtSwitch4088);
            braceClose365=braceClose();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_braceClose.add(braceClose365.getTree());


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

            root_0 = (Object)adaptor.nil();
            // 692:57: -> ^( S_SWITCH ^( E_COND expr ) stmtsCase )
            {
                // pollen.g:692:60: ^( S_SWITCH ^( E_COND expr ) stmtsCase )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(S_SWITCH, "S_SWITCH"), root_1);

                // pollen.g:692:71: ^( E_COND expr )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(E_COND, "E_COND"), root_2);

                adaptor.addChild(root_2, stream_expr.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                adaptor.addChild(root_1, stream_stmtsCase.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
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
            if ( state.backtracking>0 ) { memoize(input, 92, stmtSwitch_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "stmtSwitch"

    public static class stmtsCase_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "stmtsCase"
    // pollen.g:694:1: stmtsCase : ( stmtCase )* -> ( stmtCase )+ ;
    public final pollenParser.stmtsCase_return stmtsCase() throws RecognitionException {
        pollenParser.stmtsCase_return retval = new pollenParser.stmtsCase_return();
        retval.start = input.LT(1);
        int stmtsCase_StartIndex = input.index();
        Object root_0 = null;

        pollenParser.stmtCase_return stmtCase366 = null;


        RewriteRuleSubtreeStream stream_stmtCase=new RewriteRuleSubtreeStream(adaptor,"rule stmtCase");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 93) ) { return retval; }
            // pollen.g:695:2: ( ( stmtCase )* -> ( stmtCase )+ )
            // pollen.g:695:4: ( stmtCase )*
            {
            // pollen.g:695:4: ( stmtCase )*
            loop90:
            do {
                int alt90=2;
                int LA90_0 = input.LA(1);

                if ( ((LA90_0>=181 && LA90_0<=182)) ) {
                    alt90=1;
                }


                switch (alt90) {
            	case 1 :
            	    // pollen.g:0:0: stmtCase
            	    {
            	    pushFollow(FOLLOW_stmtCase_in_stmtsCase4112);
            	    stmtCase366=stmtCase();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_stmtCase.add(stmtCase366.getTree());

            	    }
            	    break;

            	default :
            	    break loop90;
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
            // 695:14: -> ( stmtCase )+
            {
                if ( !(stream_stmtCase.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_stmtCase.hasNext() ) {
                    adaptor.addChild(root_0, stream_stmtCase.nextTree());

                }
                stream_stmtCase.reset();

            }

            retval.tree = root_0;}
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
            if ( state.backtracking>0 ) { memoize(input, 93, stmtsCase_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "stmtsCase"

    public static class stmtCase_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "stmtCase"
    // pollen.g:697:1: stmtCase : ( 'case' ( INT_LIT ) ':' stmts -> ^( S_CASE INT_LIT stmts ) | 'default' ':' stmts -> ^( S_DEFAULT stmts ) );
    public final pollenParser.stmtCase_return stmtCase() throws RecognitionException {
        pollenParser.stmtCase_return retval = new pollenParser.stmtCase_return();
        retval.start = input.LT(1);
        int stmtCase_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal367=null;
        Token INT_LIT368=null;
        Token char_literal369=null;
        Token string_literal371=null;
        Token char_literal372=null;
        pollenParser.stmts_return stmts370 = null;

        pollenParser.stmts_return stmts373 = null;


        Object string_literal367_tree=null;
        Object INT_LIT368_tree=null;
        Object char_literal369_tree=null;
        Object string_literal371_tree=null;
        Object char_literal372_tree=null;
        RewriteRuleTokenStream stream_181=new RewriteRuleTokenStream(adaptor,"token 181");
        RewriteRuleTokenStream stream_182=new RewriteRuleTokenStream(adaptor,"token 182");
        RewriteRuleTokenStream stream_INT_LIT=new RewriteRuleTokenStream(adaptor,"token INT_LIT");
        RewriteRuleTokenStream stream_154=new RewriteRuleTokenStream(adaptor,"token 154");
        RewriteRuleSubtreeStream stream_stmts=new RewriteRuleSubtreeStream(adaptor,"rule stmts");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 94) ) { return retval; }
            // pollen.g:698:2: ( 'case' ( INT_LIT ) ':' stmts -> ^( S_CASE INT_LIT stmts ) | 'default' ':' stmts -> ^( S_DEFAULT stmts ) )
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==181) ) {
                alt91=1;
            }
            else if ( (LA91_0==182) ) {
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
                    // pollen.g:698:4: 'case' ( INT_LIT ) ':' stmts
                    {
                    string_literal367=(Token)match(input,181,FOLLOW_181_in_stmtCase4128); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_181.add(string_literal367);

                    // pollen.g:698:11: ( INT_LIT )
                    // pollen.g:698:12: INT_LIT
                    {
                    INT_LIT368=(Token)match(input,INT_LIT,FOLLOW_INT_LIT_in_stmtCase4131); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INT_LIT.add(INT_LIT368);


                    }

                    char_literal369=(Token)match(input,154,FOLLOW_154_in_stmtCase4134); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_154.add(char_literal369);

                    pushFollow(FOLLOW_stmts_in_stmtCase4136);
                    stmts370=stmts();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_stmts.add(stmts370.getTree());


                    // AST REWRITE
                    // elements: stmts, INT_LIT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 698:31: -> ^( S_CASE INT_LIT stmts )
                    {
                        // pollen.g:698:34: ^( S_CASE INT_LIT stmts )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(S_CASE, "S_CASE"), root_1);

                        adaptor.addChild(root_1, stream_INT_LIT.nextNode());
                        adaptor.addChild(root_1, stream_stmts.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // pollen.g:699:4: 'default' ':' stmts
                    {
                    string_literal371=(Token)match(input,182,FOLLOW_182_in_stmtCase4151); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_182.add(string_literal371);

                    char_literal372=(Token)match(input,154,FOLLOW_154_in_stmtCase4153); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_154.add(char_literal372);

                    pushFollow(FOLLOW_stmts_in_stmtCase4155);
                    stmts373=stmts();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_stmts.add(stmts373.getTree());


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
                    // 699:24: -> ^( S_DEFAULT stmts )
                    {
                        // pollen.g:699:27: ^( S_DEFAULT stmts )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(S_DEFAULT, "S_DEFAULT"), root_1);

                        adaptor.addChild(root_1, stream_stmts.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
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
            if ( state.backtracking>0 ) { memoize(input, 94, stmtCase_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "stmtCase"

    public static class stmtDoWhile_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "stmtDoWhile"
    // pollen.g:701:1: stmtDoWhile : 'do' stmtBlock 'while' '(' expr ')' delim -> ^( S_DO_WHILE stmtBlock ^( E_COND expr ) ) ;
    public final pollenParser.stmtDoWhile_return stmtDoWhile() throws RecognitionException {
        pollenParser.stmtDoWhile_return retval = new pollenParser.stmtDoWhile_return();
        retval.start = input.LT(1);
        int stmtDoWhile_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal374=null;
        Token string_literal376=null;
        Token char_literal377=null;
        Token char_literal379=null;
        pollenParser.stmtBlock_return stmtBlock375 = null;

        pollenParser.expr_return expr378 = null;

        pollenParser.delim_return delim380 = null;


        Object string_literal374_tree=null;
        Object string_literal376_tree=null;
        Object char_literal377_tree=null;
        Object char_literal379_tree=null;
        RewriteRuleTokenStream stream_161=new RewriteRuleTokenStream(adaptor,"token 161");
        RewriteRuleTokenStream stream_183=new RewriteRuleTokenStream(adaptor,"token 183");
        RewriteRuleTokenStream stream_184=new RewriteRuleTokenStream(adaptor,"token 184");
        RewriteRuleTokenStream stream_160=new RewriteRuleTokenStream(adaptor,"token 160");
        RewriteRuleSubtreeStream stream_stmtBlock=new RewriteRuleSubtreeStream(adaptor,"rule stmtBlock");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_delim=new RewriteRuleSubtreeStream(adaptor,"rule delim");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 95) ) { return retval; }
            // pollen.g:702:2: ( 'do' stmtBlock 'while' '(' expr ')' delim -> ^( S_DO_WHILE stmtBlock ^( E_COND expr ) ) )
            // pollen.g:702:4: 'do' stmtBlock 'while' '(' expr ')' delim
            {
            string_literal374=(Token)match(input,183,FOLLOW_183_in_stmtDoWhile4173); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_183.add(string_literal374);

            pushFollow(FOLLOW_stmtBlock_in_stmtDoWhile4175);
            stmtBlock375=stmtBlock();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_stmtBlock.add(stmtBlock375.getTree());
            string_literal376=(Token)match(input,184,FOLLOW_184_in_stmtDoWhile4177); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_184.add(string_literal376);

            char_literal377=(Token)match(input,160,FOLLOW_160_in_stmtDoWhile4179); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_160.add(char_literal377);

            pushFollow(FOLLOW_expr_in_stmtDoWhile4181);
            expr378=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr378.getTree());
            char_literal379=(Token)match(input,161,FOLLOW_161_in_stmtDoWhile4183); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_161.add(char_literal379);

            pushFollow(FOLLOW_delim_in_stmtDoWhile4185);
            delim380=delim();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_delim.add(delim380.getTree());


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
            // 702:47: -> ^( S_DO_WHILE stmtBlock ^( E_COND expr ) )
            {
                // pollen.g:702:50: ^( S_DO_WHILE stmtBlock ^( E_COND expr ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(S_DO_WHILE, "S_DO_WHILE"), root_1);

                adaptor.addChild(root_1, stream_stmtBlock.nextTree());
                // pollen.g:702:73: ^( E_COND expr )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(E_COND, "E_COND"), root_2);

                adaptor.addChild(root_2, stream_expr.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
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
            if ( state.backtracking>0 ) { memoize(input, 95, stmtDoWhile_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "stmtDoWhile"

    public static class stmtIf_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "stmtIf"
    // pollen.g:704:1: stmtIf : ( 'if' stmtIfBlock stmtsElif ( stmtElse )? -> ^( S_IF stmtIfBlock stmtsElif ( stmtElse )? ) | 'if' stmtIfBlock stmtElse -> ^( S_IF stmtIfBlock stmtElse ) | 'if' stmtIfBlock -> ^( S_IF stmtIfBlock ) );
    public final pollenParser.stmtIf_return stmtIf() throws RecognitionException {
        pollenParser.stmtIf_return retval = new pollenParser.stmtIf_return();
        retval.start = input.LT(1);
        int stmtIf_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal381=null;
        Token string_literal385=null;
        Token string_literal388=null;
        pollenParser.stmtIfBlock_return stmtIfBlock382 = null;

        pollenParser.stmtsElif_return stmtsElif383 = null;

        pollenParser.stmtElse_return stmtElse384 = null;

        pollenParser.stmtIfBlock_return stmtIfBlock386 = null;

        pollenParser.stmtElse_return stmtElse387 = null;

        pollenParser.stmtIfBlock_return stmtIfBlock389 = null;


        Object string_literal381_tree=null;
        Object string_literal385_tree=null;
        Object string_literal388_tree=null;
        RewriteRuleTokenStream stream_185=new RewriteRuleTokenStream(adaptor,"token 185");
        RewriteRuleSubtreeStream stream_stmtsElif=new RewriteRuleSubtreeStream(adaptor,"rule stmtsElif");
        RewriteRuleSubtreeStream stream_stmtElse=new RewriteRuleSubtreeStream(adaptor,"rule stmtElse");
        RewriteRuleSubtreeStream stream_stmtIfBlock=new RewriteRuleSubtreeStream(adaptor,"rule stmtIfBlock");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 96) ) { return retval; }
            // pollen.g:705:2: ( 'if' stmtIfBlock stmtsElif ( stmtElse )? -> ^( S_IF stmtIfBlock stmtsElif ( stmtElse )? ) | 'if' stmtIfBlock stmtElse -> ^( S_IF stmtIfBlock stmtElse ) | 'if' stmtIfBlock -> ^( S_IF stmtIfBlock ) )
            int alt93=3;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==185) ) {
                int LA93_1 = input.LA(2);

                if ( (synpred165_pollen()) ) {
                    alt93=1;
                }
                else if ( (synpred166_pollen()) ) {
                    alt93=2;
                }
                else if ( (true) ) {
                    alt93=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 93, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 93, 0, input);

                throw nvae;
            }
            switch (alt93) {
                case 1 :
                    // pollen.g:705:4: 'if' stmtIfBlock stmtsElif ( stmtElse )?
                    {
                    string_literal381=(Token)match(input,185,FOLLOW_185_in_stmtIf4210); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_185.add(string_literal381);

                    pushFollow(FOLLOW_stmtIfBlock_in_stmtIf4212);
                    stmtIfBlock382=stmtIfBlock();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_stmtIfBlock.add(stmtIfBlock382.getTree());
                    pushFollow(FOLLOW_stmtsElif_in_stmtIf4214);
                    stmtsElif383=stmtsElif();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_stmtsElif.add(stmtsElif383.getTree());
                    // pollen.g:705:31: ( stmtElse )?
                    int alt92=2;
                    int LA92_0 = input.LA(1);

                    if ( (LA92_0==187) ) {
                        alt92=1;
                    }
                    switch (alt92) {
                        case 1 :
                            // pollen.g:0:0: stmtElse
                            {
                            pushFollow(FOLLOW_stmtElse_in_stmtIf4216);
                            stmtElse384=stmtElse();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_stmtElse.add(stmtElse384.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: stmtIfBlock, stmtElse, stmtsElif
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 705:41: -> ^( S_IF stmtIfBlock stmtsElif ( stmtElse )? )
                    {
                        // pollen.g:705:44: ^( S_IF stmtIfBlock stmtsElif ( stmtElse )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(S_IF, "S_IF"), root_1);

                        adaptor.addChild(root_1, stream_stmtIfBlock.nextTree());
                        adaptor.addChild(root_1, stream_stmtsElif.nextTree());
                        // pollen.g:705:73: ( stmtElse )?
                        if ( stream_stmtElse.hasNext() ) {
                            adaptor.addChild(root_1, stream_stmtElse.nextTree());

                        }
                        stream_stmtElse.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // pollen.g:706:4: 'if' stmtIfBlock stmtElse
                    {
                    string_literal385=(Token)match(input,185,FOLLOW_185_in_stmtIf4235); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_185.add(string_literal385);

                    pushFollow(FOLLOW_stmtIfBlock_in_stmtIf4237);
                    stmtIfBlock386=stmtIfBlock();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_stmtIfBlock.add(stmtIfBlock386.getTree());
                    pushFollow(FOLLOW_stmtElse_in_stmtIf4239);
                    stmtElse387=stmtElse();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_stmtElse.add(stmtElse387.getTree());


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

                    root_0 = (Object)adaptor.nil();
                    // 706:30: -> ^( S_IF stmtIfBlock stmtElse )
                    {
                        // pollen.g:706:33: ^( S_IF stmtIfBlock stmtElse )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(S_IF, "S_IF"), root_1);

                        adaptor.addChild(root_1, stream_stmtIfBlock.nextTree());
                        adaptor.addChild(root_1, stream_stmtElse.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // pollen.g:707:4: 'if' stmtIfBlock
                    {
                    string_literal388=(Token)match(input,185,FOLLOW_185_in_stmtIf4254); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_185.add(string_literal388);

                    pushFollow(FOLLOW_stmtIfBlock_in_stmtIf4256);
                    stmtIfBlock389=stmtIfBlock();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_stmtIfBlock.add(stmtIfBlock389.getTree());


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
                    // 707:21: -> ^( S_IF stmtIfBlock )
                    {
                        // pollen.g:707:24: ^( S_IF stmtIfBlock )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(S_IF, "S_IF"), root_1);

                        adaptor.addChild(root_1, stream_stmtIfBlock.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
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
            if ( state.backtracking>0 ) { memoize(input, 96, stmtIf_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "stmtIf"

    public static class stmtIfBlock_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "stmtIfBlock"
    // pollen.g:709:1: stmtIfBlock : '(' expr ')' stmtBlock -> ^( E_COND expr ) stmtBlock ;
    public final pollenParser.stmtIfBlock_return stmtIfBlock() throws RecognitionException {
        pollenParser.stmtIfBlock_return retval = new pollenParser.stmtIfBlock_return();
        retval.start = input.LT(1);
        int stmtIfBlock_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal390=null;
        Token char_literal392=null;
        pollenParser.expr_return expr391 = null;

        pollenParser.stmtBlock_return stmtBlock393 = null;


        Object char_literal390_tree=null;
        Object char_literal392_tree=null;
        RewriteRuleTokenStream stream_161=new RewriteRuleTokenStream(adaptor,"token 161");
        RewriteRuleTokenStream stream_160=new RewriteRuleTokenStream(adaptor,"token 160");
        RewriteRuleSubtreeStream stream_stmtBlock=new RewriteRuleSubtreeStream(adaptor,"rule stmtBlock");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 97) ) { return retval; }
            // pollen.g:710:2: ( '(' expr ')' stmtBlock -> ^( E_COND expr ) stmtBlock )
            // pollen.g:710:4: '(' expr ')' stmtBlock
            {
            char_literal390=(Token)match(input,160,FOLLOW_160_in_stmtIfBlock4274); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_160.add(char_literal390);

            pushFollow(FOLLOW_expr_in_stmtIfBlock4276);
            expr391=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr391.getTree());
            char_literal392=(Token)match(input,161,FOLLOW_161_in_stmtIfBlock4278); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_161.add(char_literal392);

            pushFollow(FOLLOW_stmtBlock_in_stmtIfBlock4280);
            stmtBlock393=stmtBlock();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_stmtBlock.add(stmtBlock393.getTree());


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
            // 710:27: -> ^( E_COND expr ) stmtBlock
            {
                // pollen.g:710:30: ^( E_COND expr )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(E_COND, "E_COND"), root_1);

                adaptor.addChild(root_1, stream_expr.nextTree());

                adaptor.addChild(root_0, root_1);
                }
                adaptor.addChild(root_0, stream_stmtBlock.nextTree());

            }

            retval.tree = root_0;}
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
            if ( state.backtracking>0 ) { memoize(input, 97, stmtIfBlock_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "stmtIfBlock"

    public static class stmtsElif_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "stmtsElif"
    // pollen.g:712:1: stmtsElif : ( stmtElif )+ ;
    public final pollenParser.stmtsElif_return stmtsElif() throws RecognitionException {
        pollenParser.stmtsElif_return retval = new pollenParser.stmtsElif_return();
        retval.start = input.LT(1);
        int stmtsElif_StartIndex = input.index();
        Object root_0 = null;

        pollenParser.stmtElif_return stmtElif394 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 98) ) { return retval; }
            // pollen.g:713:2: ( ( stmtElif )+ )
            // pollen.g:713:4: ( stmtElif )+
            {
            root_0 = (Object)adaptor.nil();

            // pollen.g:713:4: ( stmtElif )+
            int cnt94=0;
            loop94:
            do {
                int alt94=2;
                int LA94_0 = input.LA(1);

                if ( (LA94_0==186) ) {
                    alt94=1;
                }


                switch (alt94) {
            	case 1 :
            	    // pollen.g:0:0: stmtElif
            	    {
            	    pushFollow(FOLLOW_stmtElif_in_stmtsElif4300);
            	    stmtElif394=stmtElif();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmtElif394.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt94 >= 1 ) break loop94;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(94, input);
                        throw eee;
                }
                cnt94++;
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
            if ( state.backtracking>0 ) { memoize(input, 98, stmtsElif_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "stmtsElif"

    public static class stmtElif_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "stmtElif"
    // pollen.g:715:1: stmtElif : 'elif' stmtIfBlock -> ^( S_ELIF stmtIfBlock ) ;
    public final pollenParser.stmtElif_return stmtElif() throws RecognitionException {
        pollenParser.stmtElif_return retval = new pollenParser.stmtElif_return();
        retval.start = input.LT(1);
        int stmtElif_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal395=null;
        pollenParser.stmtIfBlock_return stmtIfBlock396 = null;


        Object string_literal395_tree=null;
        RewriteRuleTokenStream stream_186=new RewriteRuleTokenStream(adaptor,"token 186");
        RewriteRuleSubtreeStream stream_stmtIfBlock=new RewriteRuleSubtreeStream(adaptor,"rule stmtIfBlock");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 99) ) { return retval; }
            // pollen.g:716:2: ( 'elif' stmtIfBlock -> ^( S_ELIF stmtIfBlock ) )
            // pollen.g:716:4: 'elif' stmtIfBlock
            {
            string_literal395=(Token)match(input,186,FOLLOW_186_in_stmtElif4311); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_186.add(string_literal395);

            pushFollow(FOLLOW_stmtIfBlock_in_stmtElif4313);
            stmtIfBlock396=stmtIfBlock();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_stmtIfBlock.add(stmtIfBlock396.getTree());


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
            // 716:23: -> ^( S_ELIF stmtIfBlock )
            {
                // pollen.g:716:26: ^( S_ELIF stmtIfBlock )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(S_ELIF, "S_ELIF"), root_1);

                adaptor.addChild(root_1, stream_stmtIfBlock.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
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
            if ( state.backtracking>0 ) { memoize(input, 99, stmtElif_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "stmtElif"

    public static class stmtElse_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "stmtElse"
    // pollen.g:718:1: stmtElse : 'else' stmtBlock -> ^( S_ELSE stmtBlock ) ;
    public final pollenParser.stmtElse_return stmtElse() throws RecognitionException {
        pollenParser.stmtElse_return retval = new pollenParser.stmtElse_return();
        retval.start = input.LT(1);
        int stmtElse_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal397=null;
        pollenParser.stmtBlock_return stmtBlock398 = null;


        Object string_literal397_tree=null;
        RewriteRuleTokenStream stream_187=new RewriteRuleTokenStream(adaptor,"token 187");
        RewriteRuleSubtreeStream stream_stmtBlock=new RewriteRuleSubtreeStream(adaptor,"rule stmtBlock");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 100) ) { return retval; }
            // pollen.g:719:2: ( 'else' stmtBlock -> ^( S_ELSE stmtBlock ) )
            // pollen.g:719:4: 'else' stmtBlock
            {
            string_literal397=(Token)match(input,187,FOLLOW_187_in_stmtElse4331); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_187.add(string_literal397);

            pushFollow(FOLLOW_stmtBlock_in_stmtElse4333);
            stmtBlock398=stmtBlock();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_stmtBlock.add(stmtBlock398.getTree());


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
            // 719:21: -> ^( S_ELSE stmtBlock )
            {
                // pollen.g:719:24: ^( S_ELSE stmtBlock )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(S_ELSE, "S_ELSE"), root_1);

                adaptor.addChild(root_1, stream_stmtBlock.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
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
            if ( state.backtracking>0 ) { memoize(input, 100, stmtElse_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "stmtElse"

    public static class stmtProvided_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "stmtProvided"
    // pollen.g:721:1: stmtProvided : 'provided' '(' expr ')' stmtBlock ( stmtElse )? -> ^( S_PROVIDED expr stmtBlock ( stmtElse )? ) ;
    public final pollenParser.stmtProvided_return stmtProvided() throws RecognitionException {
        pollenParser.stmtProvided_return retval = new pollenParser.stmtProvided_return();
        retval.start = input.LT(1);
        int stmtProvided_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal399=null;
        Token char_literal400=null;
        Token char_literal402=null;
        pollenParser.expr_return expr401 = null;

        pollenParser.stmtBlock_return stmtBlock403 = null;

        pollenParser.stmtElse_return stmtElse404 = null;


        Object string_literal399_tree=null;
        Object char_literal400_tree=null;
        Object char_literal402_tree=null;
        RewriteRuleTokenStream stream_161=new RewriteRuleTokenStream(adaptor,"token 161");
        RewriteRuleTokenStream stream_160=new RewriteRuleTokenStream(adaptor,"token 160");
        RewriteRuleTokenStream stream_188=new RewriteRuleTokenStream(adaptor,"token 188");
        RewriteRuleSubtreeStream stream_stmtElse=new RewriteRuleSubtreeStream(adaptor,"rule stmtElse");
        RewriteRuleSubtreeStream stream_stmtBlock=new RewriteRuleSubtreeStream(adaptor,"rule stmtBlock");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 101) ) { return retval; }
            // pollen.g:722:2: ( 'provided' '(' expr ')' stmtBlock ( stmtElse )? -> ^( S_PROVIDED expr stmtBlock ( stmtElse )? ) )
            // pollen.g:722:4: 'provided' '(' expr ')' stmtBlock ( stmtElse )?
            {
            string_literal399=(Token)match(input,188,FOLLOW_188_in_stmtProvided4351); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_188.add(string_literal399);

            char_literal400=(Token)match(input,160,FOLLOW_160_in_stmtProvided4353); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_160.add(char_literal400);

            pushFollow(FOLLOW_expr_in_stmtProvided4355);
            expr401=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr401.getTree());
            char_literal402=(Token)match(input,161,FOLLOW_161_in_stmtProvided4357); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_161.add(char_literal402);

            pushFollow(FOLLOW_stmtBlock_in_stmtProvided4359);
            stmtBlock403=stmtBlock();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_stmtBlock.add(stmtBlock403.getTree());
            // pollen.g:722:38: ( stmtElse )?
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==187) ) {
                alt95=1;
            }
            switch (alt95) {
                case 1 :
                    // pollen.g:722:39: stmtElse
                    {
                    pushFollow(FOLLOW_stmtElse_in_stmtProvided4362);
                    stmtElse404=stmtElse();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_stmtElse.add(stmtElse404.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: expr, stmtElse, stmtBlock
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 723:3: -> ^( S_PROVIDED expr stmtBlock ( stmtElse )? )
            {
                // pollen.g:723:6: ^( S_PROVIDED expr stmtBlock ( stmtElse )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(S_PROVIDED, "S_PROVIDED"), root_1);

                adaptor.addChild(root_1, stream_expr.nextTree());
                adaptor.addChild(root_1, stream_stmtBlock.nextTree());
                // pollen.g:723:34: ( stmtElse )?
                if ( stream_stmtElse.hasNext() ) {
                    adaptor.addChild(root_1, stream_stmtElse.nextTree());

                }
                stream_stmtElse.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
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
            if ( state.backtracking>0 ) { memoize(input, 101, stmtProvided_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "stmtProvided"

    public static class stmtWhile_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "stmtWhile"
    // pollen.g:725:1: stmtWhile : 'while' '(' expr ')' stmtBlock -> ^( S_WHILE stmtBlock ) ;
    public final pollenParser.stmtWhile_return stmtWhile() throws RecognitionException {
        pollenParser.stmtWhile_return retval = new pollenParser.stmtWhile_return();
        retval.start = input.LT(1);
        int stmtWhile_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal405=null;
        Token char_literal406=null;
        Token char_literal408=null;
        pollenParser.expr_return expr407 = null;

        pollenParser.stmtBlock_return stmtBlock409 = null;


        Object string_literal405_tree=null;
        Object char_literal406_tree=null;
        Object char_literal408_tree=null;
        RewriteRuleTokenStream stream_161=new RewriteRuleTokenStream(adaptor,"token 161");
        RewriteRuleTokenStream stream_184=new RewriteRuleTokenStream(adaptor,"token 184");
        RewriteRuleTokenStream stream_160=new RewriteRuleTokenStream(adaptor,"token 160");
        RewriteRuleSubtreeStream stream_stmtBlock=new RewriteRuleSubtreeStream(adaptor,"rule stmtBlock");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 102) ) { return retval; }
            // pollen.g:726:2: ( 'while' '(' expr ')' stmtBlock -> ^( S_WHILE stmtBlock ) )
            // pollen.g:726:4: 'while' '(' expr ')' stmtBlock
            {
            string_literal405=(Token)match(input,184,FOLLOW_184_in_stmtWhile4389); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_184.add(string_literal405);

            char_literal406=(Token)match(input,160,FOLLOW_160_in_stmtWhile4391); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_160.add(char_literal406);

            pushFollow(FOLLOW_expr_in_stmtWhile4393);
            expr407=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr407.getTree());
            char_literal408=(Token)match(input,161,FOLLOW_161_in_stmtWhile4394); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_161.add(char_literal408);

            pushFollow(FOLLOW_stmtBlock_in_stmtWhile4396);
            stmtBlock409=stmtBlock();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_stmtBlock.add(stmtBlock409.getTree());


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
            // 726:34: -> ^( S_WHILE stmtBlock )
            {
                // pollen.g:726:37: ^( S_WHILE stmtBlock )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(S_WHILE, "S_WHILE"), root_1);

                adaptor.addChild(root_1, stream_stmtBlock.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
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
            if ( state.backtracking>0 ) { memoize(input, 102, stmtWhile_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "stmtWhile"

    public static class varDeclaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "varDeclaration"
    // pollen.g:728:1: varDeclaration : varAttr varDecl delim -> ^( D_VAR varDecl ) ;
    public final pollenParser.varDeclaration_return varDeclaration() throws RecognitionException {
        pollenParser.varDeclaration_return retval = new pollenParser.varDeclaration_return();
        retval.start = input.LT(1);
        int varDeclaration_StartIndex = input.index();
        Object root_0 = null;

        pollenParser.varAttr_return varAttr410 = null;

        pollenParser.varDecl_return varDecl411 = null;

        pollenParser.delim_return delim412 = null;


        RewriteRuleSubtreeStream stream_varAttr=new RewriteRuleSubtreeStream(adaptor,"rule varAttr");
        RewriteRuleSubtreeStream stream_varDecl=new RewriteRuleSubtreeStream(adaptor,"rule varDecl");
        RewriteRuleSubtreeStream stream_delim=new RewriteRuleSubtreeStream(adaptor,"rule delim");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 103) ) { return retval; }
            // pollen.g:730:4: ( varAttr varDecl delim -> ^( D_VAR varDecl ) )
            // pollen.g:730:7: varAttr varDecl delim
            {
            pushFollow(FOLLOW_varAttr_in_varDeclaration4418);
            varAttr410=varAttr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_varAttr.add(varAttr410.getTree());
            pushFollow(FOLLOW_varDecl_in_varDeclaration4420);
            varDecl411=varDecl();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_varDecl.add(varDecl411.getTree());
            pushFollow(FOLLOW_delim_in_varDeclaration4422);
            delim412=delim();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_delim.add(delim412.getTree());


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
            // 730:29: -> ^( D_VAR varDecl )
            {
                // pollen.g:730:32: ^( D_VAR varDecl )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(D_VAR, "D_VAR"), root_1);

                adaptor.addChild(root_1, stream_varDecl.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
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
            if ( state.backtracking>0 ) { memoize(input, 103, varDeclaration_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "varDeclaration"

    public static class varAttr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "varAttr"
    // pollen.g:732:1: varAttr : ( 'const' | 'volatile' | 'host' )* ;
    public final pollenParser.varAttr_return varAttr() throws RecognitionException {
        pollenParser.varAttr_return retval = new pollenParser.varAttr_return();
        retval.start = input.LT(1);
        int varAttr_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal413=null;
        Token string_literal414=null;
        Token string_literal415=null;

        Object string_literal413_tree=null;
        Object string_literal414_tree=null;
        Object string_literal415_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 104) ) { return retval; }
            // pollen.g:734:2: ( ( 'const' | 'volatile' | 'host' )* )
            // pollen.g:734:4: ( 'const' | 'volatile' | 'host' )*
            {
            root_0 = (Object)adaptor.nil();

            // pollen.g:734:4: ( 'const' | 'volatile' | 'host' )*
            loop96:
            do {
                int alt96=4;
                switch ( input.LA(1) ) {
                case 189:
                    {
                    alt96=1;
                    }
                    break;
                case 190:
                    {
                    alt96=2;
                    }
                    break;
                case 165:
                    {
                    alt96=3;
                    }
                    break;

                }

                switch (alt96) {
            	case 1 :
            	    // pollen.g:734:7: 'const'
            	    {
            	    string_literal413=(Token)match(input,189,FOLLOW_189_in_varAttr4447); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal413_tree = (Object)adaptor.create(string_literal413);
            	    adaptor.addChild(root_0, string_literal413_tree);
            	    }
            	    if ( state.backtracking==0 ) {
            	       atFlags.add(AttrFlags.CONST); 
            	    }

            	    }
            	    break;
            	case 2 :
            	    // pollen.g:735:6: 'volatile'
            	    {
            	    string_literal414=(Token)match(input,190,FOLLOW_190_in_varAttr4456); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal414_tree = (Object)adaptor.create(string_literal414);
            	    adaptor.addChild(root_0, string_literal414_tree);
            	    }
            	    if ( state.backtracking==0 ) {
            	       atFlags.add(AttrFlags.VOLATILE); 
            	    }

            	    }
            	    break;
            	case 3 :
            	    // pollen.g:736:7: 'host'
            	    {
            	    string_literal415=(Token)match(input,165,FOLLOW_165_in_varAttr4466); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal415_tree = (Object)adaptor.create(string_literal415);
            	    adaptor.addChild(root_0, string_literal415_tree);
            	    }
            	    if ( state.backtracking==0 ) {
            	       atFlags.add(AttrFlags.HOST); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop96;
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
            if ( state.backtracking>0 ) { memoize(input, 104, varAttr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "varAttr"

    public static class varDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "varDecl"
    // pollen.g:738:1: varDecl : ( ( typeName IDENT ( ASSIGN expr )? ',' )=> varDeclList | ( typeName IDENT '[' )=> varArray | ( typeName '(' )=> varFcnRef | typeName varInit | 'new' typeName IDENT fcnArgumentList -> ^( D_INSTANCE typeName IDENT fcnArgumentList ) );
    public final pollenParser.varDecl_return varDecl() throws RecognitionException {
        pollenParser.varDecl_return retval = new pollenParser.varDecl_return();
        retval.start = input.LT(1);
        int varDecl_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal421=null;
        Token IDENT423=null;
        pollenParser.varDeclList_return varDeclList416 = null;

        pollenParser.varArray_return varArray417 = null;

        pollenParser.varFcnRef_return varFcnRef418 = null;

        pollenParser.typeName_return typeName419 = null;

        pollenParser.varInit_return varInit420 = null;

        pollenParser.typeName_return typeName422 = null;

        pollenParser.fcnArgumentList_return fcnArgumentList424 = null;


        Object string_literal421_tree=null;
        Object IDENT423_tree=null;
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleTokenStream stream_166=new RewriteRuleTokenStream(adaptor,"token 166");
        RewriteRuleSubtreeStream stream_typeName=new RewriteRuleSubtreeStream(adaptor,"rule typeName");
        RewriteRuleSubtreeStream stream_fcnArgumentList=new RewriteRuleSubtreeStream(adaptor,"rule fcnArgumentList");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 105) ) { return retval; }
            // pollen.g:739:2: ( ( typeName IDENT ( ASSIGN expr )? ',' )=> varDeclList | ( typeName IDENT '[' )=> varArray | ( typeName '(' )=> varFcnRef | typeName varInit | 'new' typeName IDENT fcnArgumentList -> ^( D_INSTANCE typeName IDENT fcnArgumentList ) )
            int alt97=5;
            switch ( input.LA(1) ) {
            case 191:
            case 192:
            case 193:
            case 194:
            case 195:
            case 196:
            case 197:
            case 198:
            case 199:
                {
                int LA97_1 = input.LA(2);

                if ( (synpred173_pollen()) ) {
                    alt97=1;
                }
                else if ( (synpred174_pollen()) ) {
                    alt97=2;
                }
                else if ( (synpred175_pollen()) ) {
                    alt97=3;
                }
                else if ( (synpred176_pollen()) ) {
                    alt97=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 97, 1, input);

                    throw nvae;
                }
                }
                break;
            case IDENT:
                {
                int LA97_2 = input.LA(2);

                if ( (synpred173_pollen()) ) {
                    alt97=1;
                }
                else if ( (synpred174_pollen()) ) {
                    alt97=2;
                }
                else if ( (synpred175_pollen()) ) {
                    alt97=3;
                }
                else if ( (synpred176_pollen()) ) {
                    alt97=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 97, 2, input);

                    throw nvae;
                }
                }
                break;
            case 166:
                {
                alt97=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 97, 0, input);

                throw nvae;
            }

            switch (alt97) {
                case 1 :
                    // pollen.g:739:4: ( typeName IDENT ( ASSIGN expr )? ',' )=> varDeclList
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_varDeclList_in_varDecl4498);
                    varDeclList416=varDeclList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDeclList416.getTree());

                    }
                    break;
                case 2 :
                    // pollen.g:740:5: ( typeName IDENT '[' )=> varArray
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_varArray_in_varDecl4514);
                    varArray417=varArray();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varArray417.getTree());

                    }
                    break;
                case 3 :
                    // pollen.g:741:5: ( typeName '(' )=> varFcnRef
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_varFcnRef_in_varDecl4530);
                    varFcnRef418=varFcnRef();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varFcnRef418.getTree());

                    }
                    break;
                case 4 :
                    // pollen.g:742:6: typeName varInit
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_typeName_in_varDecl4538);
                    typeName419=typeName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeName419.getTree());
                    pushFollow(FOLLOW_varInit_in_varDecl4540);
                    varInit420=varInit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varInit420.getTree());

                    }
                    break;
                case 5 :
                    // pollen.g:743:4: 'new' typeName IDENT fcnArgumentList
                    {
                    string_literal421=(Token)match(input,166,FOLLOW_166_in_varDecl4546); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_166.add(string_literal421);

                    pushFollow(FOLLOW_typeName_in_varDecl4548);
                    typeName422=typeName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeName.add(typeName422.getTree());
                    IDENT423=(Token)match(input,IDENT,FOLLOW_IDENT_in_varDecl4550); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENT.add(IDENT423);

                    pushFollow(FOLLOW_fcnArgumentList_in_varDecl4552);
                    fcnArgumentList424=fcnArgumentList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_fcnArgumentList.add(fcnArgumentList424.getTree());


                    // AST REWRITE
                    // elements: IDENT, fcnArgumentList, typeName
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 744:3: -> ^( D_INSTANCE typeName IDENT fcnArgumentList )
                    {
                        // pollen.g:744:6: ^( D_INSTANCE typeName IDENT fcnArgumentList )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(D_INSTANCE, "D_INSTANCE"), root_1);

                        adaptor.addChild(root_1, stream_typeName.nextTree());
                        adaptor.addChild(root_1, stream_IDENT.nextNode());
                        adaptor.addChild(root_1, stream_fcnArgumentList.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
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
            if ( state.backtracking>0 ) { memoize(input, 105, varDecl_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "varDecl"

    public static class varFcnRef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "varFcnRef"
    // pollen.g:746:1: varFcnRef : typeName fcnRefTypeList IDENT -> ^( D_FCN_REF typeName fcnRefTypeList IDENT ) ;
    public final pollenParser.varFcnRef_return varFcnRef() throws RecognitionException {
        pollenParser.varFcnRef_return retval = new pollenParser.varFcnRef_return();
        retval.start = input.LT(1);
        int varFcnRef_StartIndex = input.index();
        Object root_0 = null;

        Token IDENT427=null;
        pollenParser.typeName_return typeName425 = null;

        pollenParser.fcnRefTypeList_return fcnRefTypeList426 = null;


        Object IDENT427_tree=null;
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleSubtreeStream stream_typeName=new RewriteRuleSubtreeStream(adaptor,"rule typeName");
        RewriteRuleSubtreeStream stream_fcnRefTypeList=new RewriteRuleSubtreeStream(adaptor,"rule fcnRefTypeList");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 106) ) { return retval; }
            // pollen.g:747:2: ( typeName fcnRefTypeList IDENT -> ^( D_FCN_REF typeName fcnRefTypeList IDENT ) )
            // pollen.g:747:4: typeName fcnRefTypeList IDENT
            {
            pushFollow(FOLLOW_typeName_in_varFcnRef4576);
            typeName425=typeName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeName.add(typeName425.getTree());
            pushFollow(FOLLOW_fcnRefTypeList_in_varFcnRef4578);
            fcnRefTypeList426=fcnRefTypeList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_fcnRefTypeList.add(fcnRefTypeList426.getTree());
            IDENT427=(Token)match(input,IDENT,FOLLOW_IDENT_in_varFcnRef4580); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENT.add(IDENT427);



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

            root_0 = (Object)adaptor.nil();
            // 748:3: -> ^( D_FCN_REF typeName fcnRefTypeList IDENT )
            {
                // pollen.g:748:6: ^( D_FCN_REF typeName fcnRefTypeList IDENT )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(D_FCN_REF, "D_FCN_REF"), root_1);

                adaptor.addChild(root_1, stream_typeName.nextTree());
                adaptor.addChild(root_1, stream_fcnRefTypeList.nextTree());
                adaptor.addChild(root_1, stream_IDENT.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
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
            if ( state.backtracking>0 ) { memoize(input, 106, varFcnRef_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "varFcnRef"

    public static class fcnRefTypeList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "fcnRefTypeList"
    // pollen.g:750:1: fcnRefTypeList : '(' fcnRefTypes ')' -> ^( FCNPARMS fcnRefTypes ) ;
    public final pollenParser.fcnRefTypeList_return fcnRefTypeList() throws RecognitionException {
        pollenParser.fcnRefTypeList_return retval = new pollenParser.fcnRefTypeList_return();
        retval.start = input.LT(1);
        int fcnRefTypeList_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal428=null;
        Token char_literal430=null;
        pollenParser.fcnRefTypes_return fcnRefTypes429 = null;


        Object char_literal428_tree=null;
        Object char_literal430_tree=null;
        RewriteRuleTokenStream stream_161=new RewriteRuleTokenStream(adaptor,"token 161");
        RewriteRuleTokenStream stream_160=new RewriteRuleTokenStream(adaptor,"token 160");
        RewriteRuleSubtreeStream stream_fcnRefTypes=new RewriteRuleSubtreeStream(adaptor,"rule fcnRefTypes");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 107) ) { return retval; }
            // pollen.g:751:2: ( '(' fcnRefTypes ')' -> ^( FCNPARMS fcnRefTypes ) )
            // pollen.g:751:4: '(' fcnRefTypes ')'
            {
            char_literal428=(Token)match(input,160,FOLLOW_160_in_fcnRefTypeList4605); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_160.add(char_literal428);

            pushFollow(FOLLOW_fcnRefTypes_in_fcnRefTypeList4607);
            fcnRefTypes429=fcnRefTypes();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_fcnRefTypes.add(fcnRefTypes429.getTree());
            char_literal430=(Token)match(input,161,FOLLOW_161_in_fcnRefTypeList4609); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_161.add(char_literal430);



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
            // 752:3: -> ^( FCNPARMS fcnRefTypes )
            {
                // pollen.g:752:6: ^( FCNPARMS fcnRefTypes )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FCNPARMS, "FCNPARMS"), root_1);

                adaptor.addChild(root_1, stream_fcnRefTypes.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
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
            if ( state.backtracking>0 ) { memoize(input, 107, fcnRefTypeList_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "fcnRefTypeList"

    public static class fcnRefTypes_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "fcnRefTypes"
    // pollen.g:754:1: fcnRefTypes : ( typeName ( ',' typeName )* -> ( typeName )+ | -> NIL );
    public final pollenParser.fcnRefTypes_return fcnRefTypes() throws RecognitionException {
        pollenParser.fcnRefTypes_return retval = new pollenParser.fcnRefTypes_return();
        retval.start = input.LT(1);
        int fcnRefTypes_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal432=null;
        pollenParser.typeName_return typeName431 = null;

        pollenParser.typeName_return typeName433 = null;


        Object char_literal432_tree=null;
        RewriteRuleTokenStream stream_130=new RewriteRuleTokenStream(adaptor,"token 130");
        RewriteRuleSubtreeStream stream_typeName=new RewriteRuleSubtreeStream(adaptor,"rule typeName");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 108) ) { return retval; }
            // pollen.g:755:2: ( typeName ( ',' typeName )* -> ( typeName )+ | -> NIL )
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==IDENT||(LA99_0>=191 && LA99_0<=199)) ) {
                alt99=1;
            }
            else if ( (LA99_0==161) ) {
                alt99=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 99, 0, input);

                throw nvae;
            }
            switch (alt99) {
                case 1 :
                    // pollen.g:755:4: typeName ( ',' typeName )*
                    {
                    pushFollow(FOLLOW_typeName_in_fcnRefTypes4629);
                    typeName431=typeName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeName.add(typeName431.getTree());
                    // pollen.g:755:13: ( ',' typeName )*
                    loop98:
                    do {
                        int alt98=2;
                        int LA98_0 = input.LA(1);

                        if ( (LA98_0==130) ) {
                            alt98=1;
                        }


                        switch (alt98) {
                    	case 1 :
                    	    // pollen.g:755:14: ',' typeName
                    	    {
                    	    char_literal432=(Token)match(input,130,FOLLOW_130_in_fcnRefTypes4632); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_130.add(char_literal432);

                    	    pushFollow(FOLLOW_typeName_in_fcnRefTypes4634);
                    	    typeName433=typeName();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_typeName.add(typeName433.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop98;
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
                    // 755:29: -> ( typeName )+
                    {
                        if ( !(stream_typeName.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_typeName.hasNext() ) {
                            adaptor.addChild(root_0, stream_typeName.nextTree());

                        }
                        stream_typeName.reset();

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // pollen.g:756:4: 
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
                    // 756:4: -> NIL
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(NIL, "NIL"));

                    }

                    retval.tree = root_0;}
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
            if ( state.backtracking>0 ) { memoize(input, 108, fcnRefTypes_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "fcnRefTypes"

    public static class varArray_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "varArray"
    // pollen.g:758:1: varArray : typeName IDENT varArraySpec -> ^( D_ARR typeName IDENT varArraySpec ) ;
    public final pollenParser.varArray_return varArray() throws RecognitionException {
        pollenParser.varArray_return retval = new pollenParser.varArray_return();
        retval.start = input.LT(1);
        int varArray_StartIndex = input.index();
        Object root_0 = null;

        Token IDENT435=null;
        pollenParser.typeName_return typeName434 = null;

        pollenParser.varArraySpec_return varArraySpec436 = null;


        Object IDENT435_tree=null;
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleSubtreeStream stream_typeName=new RewriteRuleSubtreeStream(adaptor,"rule typeName");
        RewriteRuleSubtreeStream stream_varArraySpec=new RewriteRuleSubtreeStream(adaptor,"rule varArraySpec");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 109) ) { return retval; }
            // pollen.g:759:2: ( typeName IDENT varArraySpec -> ^( D_ARR typeName IDENT varArraySpec ) )
            // pollen.g:759:4: typeName IDENT varArraySpec
            {
            pushFollow(FOLLOW_typeName_in_varArray4658);
            typeName434=typeName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeName.add(typeName434.getTree());
            IDENT435=(Token)match(input,IDENT,FOLLOW_IDENT_in_varArray4660); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENT.add(IDENT435);

            pushFollow(FOLLOW_varArraySpec_in_varArray4662);
            varArraySpec436=varArraySpec();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_varArraySpec.add(varArraySpec436.getTree());


            // AST REWRITE
            // elements: typeName, IDENT, varArraySpec
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 759:32: -> ^( D_ARR typeName IDENT varArraySpec )
            {
                // pollen.g:759:36: ^( D_ARR typeName IDENT varArraySpec )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(D_ARR, "D_ARR"), root_1);

                adaptor.addChild(root_1, stream_typeName.nextTree());
                adaptor.addChild(root_1, stream_IDENT.nextNode());
                adaptor.addChild(root_1, stream_varArraySpec.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
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
            if ( state.backtracking>0 ) { memoize(input, 109, varArray_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "varArray"

    public static class varArraySpec_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "varArraySpec"
    // pollen.g:761:1: varArraySpec : ( '[' varDim ']' )+ -> ( varDim )+ ;
    public final pollenParser.varArraySpec_return varArraySpec() throws RecognitionException {
        pollenParser.varArraySpec_return retval = new pollenParser.varArraySpec_return();
        retval.start = input.LT(1);
        int varArraySpec_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal437=null;
        Token char_literal439=null;
        pollenParser.varDim_return varDim438 = null;


        Object char_literal437_tree=null;
        Object char_literal439_tree=null;
        RewriteRuleTokenStream stream_140=new RewriteRuleTokenStream(adaptor,"token 140");
        RewriteRuleTokenStream stream_141=new RewriteRuleTokenStream(adaptor,"token 141");
        RewriteRuleSubtreeStream stream_varDim=new RewriteRuleSubtreeStream(adaptor,"rule varDim");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 110) ) { return retval; }
            // pollen.g:762:2: ( ( '[' varDim ']' )+ -> ( varDim )+ )
            // pollen.g:762:4: ( '[' varDim ']' )+
            {
            // pollen.g:762:4: ( '[' varDim ']' )+
            int cnt100=0;
            loop100:
            do {
                int alt100=2;
                int LA100_0 = input.LA(1);

                if ( (LA100_0==140) ) {
                    int LA100_2 = input.LA(2);

                    if ( (synpred179_pollen()) ) {
                        alt100=1;
                    }


                }


                switch (alt100) {
            	case 1 :
            	    // pollen.g:762:5: '[' varDim ']'
            	    {
            	    char_literal437=(Token)match(input,140,FOLLOW_140_in_varArraySpec4686); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_140.add(char_literal437);

            	    pushFollow(FOLLOW_varDim_in_varArraySpec4688);
            	    varDim438=varDim();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_varDim.add(varDim438.getTree());
            	    char_literal439=(Token)match(input,141,FOLLOW_141_in_varArraySpec4690); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_141.add(char_literal439);


            	    }
            	    break;

            	default :
            	    if ( cnt100 >= 1 ) break loop100;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(100, input);
                        throw eee;
                }
                cnt100++;
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
            // 762:22: -> ( varDim )+
            {
                if ( !(stream_varDim.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_varDim.hasNext() ) {
                    adaptor.addChild(root_0, stream_varDim.nextTree());

                }
                stream_varDim.reset();

            }

            retval.tree = root_0;}
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
            if ( state.backtracking>0 ) { memoize(input, 110, varArraySpec_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "varArraySpec"

    public static class varDim_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "varDim"
    // pollen.g:764:1: varDim : ( INT_LIT -> ^( D_ARR_DIM INT_LIT ) | IDENT -> ^( D_ARR_DIM IDENT ) | -> ^( D_ARR_DIM NIL ) );
    public final pollenParser.varDim_return varDim() throws RecognitionException {
        pollenParser.varDim_return retval = new pollenParser.varDim_return();
        retval.start = input.LT(1);
        int varDim_StartIndex = input.index();
        Object root_0 = null;

        Token INT_LIT440=null;
        Token IDENT441=null;

        Object INT_LIT440_tree=null;
        Object IDENT441_tree=null;
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleTokenStream stream_INT_LIT=new RewriteRuleTokenStream(adaptor,"token INT_LIT");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 111) ) { return retval; }
            // pollen.g:766:2: ( INT_LIT -> ^( D_ARR_DIM INT_LIT ) | IDENT -> ^( D_ARR_DIM IDENT ) | -> ^( D_ARR_DIM NIL ) )
            int alt101=3;
            switch ( input.LA(1) ) {
            case INT_LIT:
                {
                alt101=1;
                }
                break;
            case IDENT:
                {
                alt101=2;
                }
                break;
            case 141:
                {
                alt101=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 101, 0, input);

                throw nvae;
            }

            switch (alt101) {
                case 1 :
                    // pollen.g:766:5: INT_LIT
                    {
                    INT_LIT440=(Token)match(input,INT_LIT,FOLLOW_INT_LIT_in_varDim4711); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INT_LIT.add(INT_LIT440);



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

                    root_0 = (Object)adaptor.nil();
                    // 766:15: -> ^( D_ARR_DIM INT_LIT )
                    {
                        // pollen.g:766:18: ^( D_ARR_DIM INT_LIT )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(D_ARR_DIM, "D_ARR_DIM"), root_1);

                        adaptor.addChild(root_1, stream_INT_LIT.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // pollen.g:767:4: IDENT
                    {
                    IDENT441=(Token)match(input,IDENT,FOLLOW_IDENT_in_varDim4726); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENT.add(IDENT441);



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
                    // 767:10: -> ^( D_ARR_DIM IDENT )
                    {
                        // pollen.g:767:13: ^( D_ARR_DIM IDENT )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(D_ARR_DIM, "D_ARR_DIM"), root_1);

                        adaptor.addChild(root_1, stream_IDENT.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // pollen.g:768:4: 
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
                    // 768:4: -> ^( D_ARR_DIM NIL )
                    {
                        // pollen.g:768:7: ^( D_ARR_DIM NIL )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(D_ARR_DIM, "D_ARR_DIM"), root_1);

                        adaptor.addChild(root_1, (Object)adaptor.create(NIL, "NIL"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
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
            if ( state.backtracking>0 ) { memoize(input, 111, varDim_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "varDim"

    public static class varDeclList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "varDeclList"
    // pollen.g:770:1: varDeclList : ( typeName varDeclList | varInit ( ',' varInit )* -> ( varInit )+ );
    public final pollenParser.varDeclList_return varDeclList() throws RecognitionException {
        pollenParser.varDeclList_return retval = new pollenParser.varDeclList_return();
        retval.start = input.LT(1);
        int varDeclList_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal445=null;
        pollenParser.typeName_return typeName442 = null;

        pollenParser.varDeclList_return varDeclList443 = null;

        pollenParser.varInit_return varInit444 = null;

        pollenParser.varInit_return varInit446 = null;


        Object char_literal445_tree=null;
        RewriteRuleTokenStream stream_130=new RewriteRuleTokenStream(adaptor,"token 130");
        RewriteRuleSubtreeStream stream_varInit=new RewriteRuleSubtreeStream(adaptor,"rule varInit");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 112) ) { return retval; }
            // pollen.g:771:2: ( typeName varDeclList | varInit ( ',' varInit )* -> ( varInit )+ )
            int alt103=2;
            int LA103_0 = input.LA(1);

            if ( ((LA103_0>=191 && LA103_0<=199)) ) {
                alt103=1;
            }
            else if ( (LA103_0==IDENT) ) {
                int LA103_2 = input.LA(2);

                if ( (synpred182_pollen()) ) {
                    alt103=1;
                }
                else if ( (true) ) {
                    alt103=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 103, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 103, 0, input);

                throw nvae;
            }
            switch (alt103) {
                case 1 :
                    // pollen.g:771:4: typeName varDeclList
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_typeName_in_varDeclList4757);
                    typeName442=typeName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeName442.getTree());
                    pushFollow(FOLLOW_varDeclList_in_varDeclList4759);
                    varDeclList443=varDeclList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDeclList443.getTree());

                    }
                    break;
                case 2 :
                    // pollen.g:772:4: varInit ( ',' varInit )*
                    {
                    pushFollow(FOLLOW_varInit_in_varDeclList4764);
                    varInit444=varInit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_varInit.add(varInit444.getTree());
                    // pollen.g:772:12: ( ',' varInit )*
                    loop102:
                    do {
                        int alt102=2;
                        int LA102_0 = input.LA(1);

                        if ( (LA102_0==130) ) {
                            int LA102_2 = input.LA(2);

                            if ( (synpred183_pollen()) ) {
                                alt102=1;
                            }


                        }


                        switch (alt102) {
                    	case 1 :
                    	    // pollen.g:772:13: ',' varInit
                    	    {
                    	    char_literal445=(Token)match(input,130,FOLLOW_130_in_varDeclList4767); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_130.add(char_literal445);

                    	    pushFollow(FOLLOW_varInit_in_varDeclList4769);
                    	    varInit446=varInit();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_varInit.add(varInit446.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop102;
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

                    root_0 = (Object)adaptor.nil();
                    // 772:31: -> ( varInit )+
                    {
                        if ( !(stream_varInit.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_varInit.hasNext() ) {
                            adaptor.addChild(root_0, stream_varInit.nextTree());

                        }
                        stream_varInit.reset();

                    }

                    retval.tree = root_0;}
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
            if ( state.backtracking>0 ) { memoize(input, 112, varDeclList_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "varDeclList"

    public static class varInit_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "varInit"
    // pollen.g:774:1: varInit : IDENT ( ASSIGN expr )? ;
    public final pollenParser.varInit_return varInit() throws RecognitionException {
        pollenParser.varInit_return retval = new pollenParser.varInit_return();
        retval.start = input.LT(1);
        int varInit_StartIndex = input.index();
        Object root_0 = null;

        Token IDENT447=null;
        Token ASSIGN448=null;
        pollenParser.expr_return expr449 = null;


        Object IDENT447_tree=null;
        Object ASSIGN448_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 113) ) { return retval; }
            // pollen.g:776:2: ( IDENT ( ASSIGN expr )? )
            // pollen.g:776:4: IDENT ( ASSIGN expr )?
            {
            root_0 = (Object)adaptor.nil();

            IDENT447=(Token)match(input,IDENT,FOLLOW_IDENT_in_varInit4794); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENT447_tree = (Object)adaptor.create(IDENT447);
            root_0 = (Object)adaptor.becomeRoot(IDENT447_tree, root_0);
            }
            // pollen.g:776:11: ( ASSIGN expr )?
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( (LA104_0==ASSIGN) ) {
                alt104=1;
            }
            switch (alt104) {
                case 1 :
                    // pollen.g:776:12: ASSIGN expr
                    {
                    ASSIGN448=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_varInit4798); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_varInit4801);
                    expr449=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr449.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 113, varInit_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "varInit"

    public static class builtinType_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "builtinType"
    // pollen.g:779:1: builtinType : ( 'bool' | 'byte' | 'int8' | 'int16' | 'int32' | 'string' | 'uint8' | 'uint16' | 'uint32' );
    public final pollenParser.builtinType_return builtinType() throws RecognitionException {
        pollenParser.builtinType_return retval = new pollenParser.builtinType_return();
        retval.start = input.LT(1);
        int builtinType_StartIndex = input.index();
        Object root_0 = null;

        Token set450=null;

        Object set450_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 114) ) { return retval; }
            // pollen.g:780:5: ( 'bool' | 'byte' | 'int8' | 'int16' | 'int32' | 'string' | 'uint8' | 'uint16' | 'uint32' )
            // pollen.g:
            {
            root_0 = (Object)adaptor.nil();

            set450=(Token)input.LT(1);
            if ( (input.LA(1)>=191 && input.LA(1)<=199) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set450));
                state.errorRecovery=false;state.failed=false;
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
            if ( state.backtracking>0 ) { memoize(input, 114, builtinType_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "builtinType"

    public static class qualName_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "qualName"
    // pollen.g:790:1: qualName : IDENT ( '.' IDENT )* -> ^( QNAME ( IDENT )+ ) ;
    public final pollenParser.qualName_return qualName() throws RecognitionException {
        pollenParser.qualName_return retval = new pollenParser.qualName_return();
        retval.start = input.LT(1);
        int qualName_StartIndex = input.index();
        Object root_0 = null;

        Token IDENT451=null;
        Token char_literal452=null;
        Token IDENT453=null;

        Object IDENT451_tree=null;
        Object char_literal452_tree=null;
        Object IDENT453_tree=null;
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleTokenStream stream_168=new RewriteRuleTokenStream(adaptor,"token 168");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 115) ) { return retval; }
            // pollen.g:791:5: ( IDENT ( '.' IDENT )* -> ^( QNAME ( IDENT )+ ) )
            // pollen.g:791:9: IDENT ( '.' IDENT )*
            {
            IDENT451=(Token)match(input,IDENT,FOLLOW_IDENT_in_qualName4917); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENT.add(IDENT451);

            // pollen.g:792:5: ( '.' IDENT )*
            loop105:
            do {
                int alt105=2;
                int LA105_0 = input.LA(1);

                if ( (LA105_0==168) ) {
                    int LA105_2 = input.LA(2);

                    if ( (synpred193_pollen()) ) {
                        alt105=1;
                    }


                }


                switch (alt105) {
            	case 1 :
            	    // pollen.g:792:9: '.' IDENT
            	    {
            	    char_literal452=(Token)match(input,168,FOLLOW_168_in_qualName4927); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_168.add(char_literal452);

            	    IDENT453=(Token)match(input,IDENT,FOLLOW_IDENT_in_qualName4942); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_IDENT.add(IDENT453);


            	    }
            	    break;

            	default :
            	    break loop105;
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

            root_0 = (Object)adaptor.nil();
            // 794:10: -> ^( QNAME ( IDENT )+ )
            {
                // pollen.g:794:13: ^( QNAME ( IDENT )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(QNAME, "QNAME"), root_1);

                if ( !(stream_IDENT.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_IDENT.hasNext() ) {
                    adaptor.addChild(root_1, stream_IDENT.nextNode());

                }
                stream_IDENT.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
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
            if ( state.backtracking>0 ) { memoize(input, 115, qualName_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "qualName"

    public static class arrayLit_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "arrayLit"
    // pollen.g:796:1: arrayLit : '[' arrayLitList ']' -> ^( E_ARRLIT arrayLitList ) ;
    public final pollenParser.arrayLit_return arrayLit() throws RecognitionException {
        pollenParser.arrayLit_return retval = new pollenParser.arrayLit_return();
        retval.start = input.LT(1);
        int arrayLit_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal454=null;
        Token char_literal456=null;
        pollenParser.arrayLitList_return arrayLitList455 = null;


        Object char_literal454_tree=null;
        Object char_literal456_tree=null;
        RewriteRuleTokenStream stream_140=new RewriteRuleTokenStream(adaptor,"token 140");
        RewriteRuleTokenStream stream_141=new RewriteRuleTokenStream(adaptor,"token 141");
        RewriteRuleSubtreeStream stream_arrayLitList=new RewriteRuleSubtreeStream(adaptor,"rule arrayLitList");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 116) ) { return retval; }
            // pollen.g:797:2: ( '[' arrayLitList ']' -> ^( E_ARRLIT arrayLitList ) )
            // pollen.g:797:4: '[' arrayLitList ']'
            {
            char_literal454=(Token)match(input,140,FOLLOW_140_in_arrayLit4977); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_140.add(char_literal454);

            pushFollow(FOLLOW_arrayLitList_in_arrayLit4979);
            arrayLitList455=arrayLitList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_arrayLitList.add(arrayLitList455.getTree());
            char_literal456=(Token)match(input,141,FOLLOW_141_in_arrayLit4981); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_141.add(char_literal456);



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
            // 797:25: -> ^( E_ARRLIT arrayLitList )
            {
                // pollen.g:797:28: ^( E_ARRLIT arrayLitList )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(E_ARRLIT, "E_ARRLIT"), root_1);

                adaptor.addChild(root_1, stream_arrayLitList.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
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
            if ( state.backtracking>0 ) { memoize(input, 116, arrayLit_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "arrayLit"

    public static class arrayLitList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "arrayLitList"
    // pollen.g:799:1: arrayLitList : ( arrayLitElem ( ',' arrayLitElem )* -> ( arrayLitElem )+ | -> NIL );
    public final pollenParser.arrayLitList_return arrayLitList() throws RecognitionException {
        pollenParser.arrayLitList_return retval = new pollenParser.arrayLitList_return();
        retval.start = input.LT(1);
        int arrayLitList_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal458=null;
        pollenParser.arrayLitElem_return arrayLitElem457 = null;

        pollenParser.arrayLitElem_return arrayLitElem459 = null;


        Object char_literal458_tree=null;
        RewriteRuleTokenStream stream_130=new RewriteRuleTokenStream(adaptor,"token 130");
        RewriteRuleSubtreeStream stream_arrayLitElem=new RewriteRuleSubtreeStream(adaptor,"rule arrayLitElem");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 117) ) { return retval; }
            // pollen.g:800:2: ( arrayLitElem ( ',' arrayLitElem )* -> ( arrayLitElem )+ | -> NIL )
            int alt107=2;
            int LA107_0 = input.LA(1);

            if ( (LA107_0==IDENT||(LA107_0>=INT_LIT && LA107_0<=CHAR)||(LA107_0>=OCT_LIT && LA107_0<=HEX_LIT)||(LA107_0>=200 && LA107_0<=202)) ) {
                alt107=1;
            }
            else if ( (LA107_0==141) ) {
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
                    // pollen.g:800:4: arrayLitElem ( ',' arrayLitElem )*
                    {
                    pushFollow(FOLLOW_arrayLitElem_in_arrayLitList4999);
                    arrayLitElem457=arrayLitElem();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_arrayLitElem.add(arrayLitElem457.getTree());
                    // pollen.g:800:17: ( ',' arrayLitElem )*
                    loop106:
                    do {
                        int alt106=2;
                        int LA106_0 = input.LA(1);

                        if ( (LA106_0==130) ) {
                            alt106=1;
                        }


                        switch (alt106) {
                    	case 1 :
                    	    // pollen.g:800:18: ',' arrayLitElem
                    	    {
                    	    char_literal458=(Token)match(input,130,FOLLOW_130_in_arrayLitList5002); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_130.add(char_literal458);

                    	    pushFollow(FOLLOW_arrayLitElem_in_arrayLitList5004);
                    	    arrayLitElem459=arrayLitElem();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_arrayLitElem.add(arrayLitElem459.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop106;
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
                    // 800:37: -> ( arrayLitElem )+
                    {
                        if ( !(stream_arrayLitElem.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_arrayLitElem.hasNext() ) {
                            adaptor.addChild(root_0, stream_arrayLitElem.nextTree());

                        }
                        stream_arrayLitElem.reset();

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // pollen.g:801:4: 
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
                    // 801:4: -> NIL
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(NIL, "NIL"));

                    }

                    retval.tree = root_0;}
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
            if ( state.backtracking>0 ) { memoize(input, 117, arrayLitList_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "arrayLitList"

    public static class arrayLitElem_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "arrayLitElem"
    // pollen.g:803:1: arrayLitElem : ( primitiveLit | nullLit | namedConstant );
    public final pollenParser.arrayLitElem_return arrayLitElem() throws RecognitionException {
        pollenParser.arrayLitElem_return retval = new pollenParser.arrayLitElem_return();
        retval.start = input.LT(1);
        int arrayLitElem_StartIndex = input.index();
        Object root_0 = null;

        pollenParser.primitiveLit_return primitiveLit460 = null;

        pollenParser.nullLit_return nullLit461 = null;

        pollenParser.namedConstant_return namedConstant462 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 118) ) { return retval; }
            // pollen.g:804:2: ( primitiveLit | nullLit | namedConstant )
            int alt108=3;
            switch ( input.LA(1) ) {
            case INT_LIT:
            case STRING:
            case CHAR:
            case OCT_LIT:
            case REAL_LIT:
            case HEX_LIT:
            case 200:
            case 201:
                {
                alt108=1;
                }
                break;
            case 202:
                {
                alt108=2;
                }
                break;
            case IDENT:
                {
                alt108=3;
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
                    // pollen.g:804:4: primitiveLit
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_primitiveLit_in_arrayLitElem5028);
                    primitiveLit460=primitiveLit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveLit460.getTree());

                    }
                    break;
                case 2 :
                    // pollen.g:804:19: nullLit
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_nullLit_in_arrayLitElem5032);
                    nullLit461=nullLit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, nullLit461.getTree());

                    }
                    break;
                case 3 :
                    // pollen.g:804:29: namedConstant
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_namedConstant_in_arrayLitElem5036);
                    namedConstant462=namedConstant();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, namedConstant462.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 118, arrayLitElem_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "arrayLitElem"

    public static class namedConstant_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "namedConstant"
    // pollen.g:806:1: namedConstant : qualName ;
    public final pollenParser.namedConstant_return namedConstant() throws RecognitionException {
        pollenParser.namedConstant_return retval = new pollenParser.namedConstant_return();
        retval.start = input.LT(1);
        int namedConstant_StartIndex = input.index();
        Object root_0 = null;

        pollenParser.qualName_return qualName463 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 119) ) { return retval; }
            // pollen.g:807:2: ( qualName )
            // pollen.g:807:4: qualName
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_qualName_in_namedConstant5046);
            qualName463=qualName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, qualName463.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 119, namedConstant_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "namedConstant"

    public static class boolLit_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "boolLit"
    // pollen.g:809:1: boolLit : ( 'true' | 'false' );
    public final pollenParser.boolLit_return boolLit() throws RecognitionException {
        pollenParser.boolLit_return retval = new pollenParser.boolLit_return();
        retval.start = input.LT(1);
        int boolLit_StartIndex = input.index();
        Object root_0 = null;

        Token set464=null;

        Object set464_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 120) ) { return retval; }
            // pollen.g:810:2: ( 'true' | 'false' )
            // pollen.g:
            {
            root_0 = (Object)adaptor.nil();

            set464=(Token)input.LT(1);
            if ( (input.LA(1)>=200 && input.LA(1)<=201) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set464));
                state.errorRecovery=false;state.failed=false;
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
            if ( state.backtracking>0 ) { memoize(input, 120, boolLit_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "boolLit"

    public static class nullLit_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "nullLit"
    // pollen.g:812:1: nullLit : 'null' ;
    public final pollenParser.nullLit_return nullLit() throws RecognitionException {
        pollenParser.nullLit_return retval = new pollenParser.nullLit_return();
        retval.start = input.LT(1);
        int nullLit_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal465=null;

        Object string_literal465_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 121) ) { return retval; }
            // pollen.g:813:2: ( 'null' )
            // pollen.g:813:4: 'null'
            {
            root_0 = (Object)adaptor.nil();

            string_literal465=(Token)match(input,202,FOLLOW_202_in_nullLit5072); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal465_tree = (Object)adaptor.create(string_literal465);
            adaptor.addChild(root_0, string_literal465_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 121, nullLit_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "nullLit"

    public static class numLit_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "numLit"
    // pollen.g:815:1: numLit : ( INT_LIT -> ^( E_NUMLIT INT_LIT ) | OCT_LIT -> ^( E_NUMLIT OCT_LIT ) | REAL_LIT -> ^( E_NUMLIT REAL_LIT ) | HEX_LIT -> ^( E_NUMLIT HEX_LIT ) );
    public final pollenParser.numLit_return numLit() throws RecognitionException {
        pollenParser.numLit_return retval = new pollenParser.numLit_return();
        retval.start = input.LT(1);
        int numLit_StartIndex = input.index();
        Object root_0 = null;

        Token INT_LIT466=null;
        Token OCT_LIT467=null;
        Token REAL_LIT468=null;
        Token HEX_LIT469=null;

        Object INT_LIT466_tree=null;
        Object OCT_LIT467_tree=null;
        Object REAL_LIT468_tree=null;
        Object HEX_LIT469_tree=null;
        RewriteRuleTokenStream stream_REAL_LIT=new RewriteRuleTokenStream(adaptor,"token REAL_LIT");
        RewriteRuleTokenStream stream_HEX_LIT=new RewriteRuleTokenStream(adaptor,"token HEX_LIT");
        RewriteRuleTokenStream stream_INT_LIT=new RewriteRuleTokenStream(adaptor,"token INT_LIT");
        RewriteRuleTokenStream stream_OCT_LIT=new RewriteRuleTokenStream(adaptor,"token OCT_LIT");


        	nlFlags.clear();	

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 122) ) { return retval; }
            // pollen.g:819:2: ( INT_LIT -> ^( E_NUMLIT INT_LIT ) | OCT_LIT -> ^( E_NUMLIT OCT_LIT ) | REAL_LIT -> ^( E_NUMLIT REAL_LIT ) | HEX_LIT -> ^( E_NUMLIT HEX_LIT ) )
            int alt109=4;
            switch ( input.LA(1) ) {
            case INT_LIT:
                {
                alt109=1;
                }
                break;
            case OCT_LIT:
                {
                alt109=2;
                }
                break;
            case REAL_LIT:
                {
                alt109=3;
                }
                break;
            case HEX_LIT:
                {
                alt109=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 109, 0, input);

                throw nvae;
            }

            switch (alt109) {
                case 1 :
                    // pollen.g:819:4: INT_LIT
                    {
                    INT_LIT466=(Token)match(input,INT_LIT,FOLLOW_INT_LIT_in_numLit5087); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INT_LIT.add(INT_LIT466);

                    if ( state.backtracking==0 ) {
                      nlFlags.add(NumLitFlags.INT);
                    }


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

                    root_0 = (Object)adaptor.nil();
                    // 819:45: -> ^( E_NUMLIT INT_LIT )
                    {
                        // pollen.g:819:48: ^( E_NUMLIT INT_LIT )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(E_NUMLIT, "E_NUMLIT"), root_1);

                        adaptor.addChild(root_1, stream_INT_LIT.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // pollen.g:820:5: OCT_LIT
                    {
                    OCT_LIT467=(Token)match(input,OCT_LIT,FOLLOW_OCT_LIT_in_numLit5104); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OCT_LIT.add(OCT_LIT467);

                    if ( state.backtracking==0 ) {
                      nlFlags.add(NumLitFlags.OCT);
                    }


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

                    root_0 = (Object)adaptor.nil();
                    // 820:46: -> ^( E_NUMLIT OCT_LIT )
                    {
                        // pollen.g:820:49: ^( E_NUMLIT OCT_LIT )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(E_NUMLIT, "E_NUMLIT"), root_1);

                        adaptor.addChild(root_1, stream_OCT_LIT.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // pollen.g:821:5: REAL_LIT
                    {
                    REAL_LIT468=(Token)match(input,REAL_LIT,FOLLOW_REAL_LIT_in_numLit5121); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_REAL_LIT.add(REAL_LIT468);

                    if ( state.backtracking==0 ) {
                      nlFlags.add(NumLitFlags.REAL);
                    }


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

                    root_0 = (Object)adaptor.nil();
                    // 821:48: -> ^( E_NUMLIT REAL_LIT )
                    {
                        // pollen.g:821:51: ^( E_NUMLIT REAL_LIT )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(E_NUMLIT, "E_NUMLIT"), root_1);

                        adaptor.addChild(root_1, stream_REAL_LIT.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // pollen.g:822:5: HEX_LIT
                    {
                    HEX_LIT469=(Token)match(input,HEX_LIT,FOLLOW_HEX_LIT_in_numLit5138); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HEX_LIT.add(HEX_LIT469);

                    if ( state.backtracking==0 ) {
                      nlFlags.add(NumLitFlags.HEX);
                    }


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

                    root_0 = (Object)adaptor.nil();
                    // 822:47: -> ^( E_NUMLIT HEX_LIT )
                    {
                        // pollen.g:822:50: ^( E_NUMLIT HEX_LIT )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(E_NUMLIT, "E_NUMLIT"), root_1);

                        adaptor.addChild(root_1, stream_HEX_LIT.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
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
            if ( state.backtracking>0 ) { memoize(input, 122, numLit_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "numLit"

    public static class primitiveLit_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "primitiveLit"
    // pollen.g:824:1: primitiveLit : ( boolLit | numLit | STRING | CHAR );
    public final pollenParser.primitiveLit_return primitiveLit() throws RecognitionException {
        pollenParser.primitiveLit_return retval = new pollenParser.primitiveLit_return();
        retval.start = input.LT(1);
        int primitiveLit_StartIndex = input.index();
        Object root_0 = null;

        Token STRING472=null;
        Token CHAR473=null;
        pollenParser.boolLit_return boolLit470 = null;

        pollenParser.numLit_return numLit471 = null;


        Object STRING472_tree=null;
        Object CHAR473_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 123) ) { return retval; }
            // pollen.g:825:2: ( boolLit | numLit | STRING | CHAR )
            int alt110=4;
            switch ( input.LA(1) ) {
            case 200:
            case 201:
                {
                alt110=1;
                }
                break;
            case INT_LIT:
            case OCT_LIT:
            case REAL_LIT:
            case HEX_LIT:
                {
                alt110=2;
                }
                break;
            case STRING:
                {
                alt110=3;
                }
                break;
            case CHAR:
                {
                alt110=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 110, 0, input);

                throw nvae;
            }

            switch (alt110) {
                case 1 :
                    // pollen.g:825:4: boolLit
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_boolLit_in_primitiveLit5160);
                    boolLit470=boolLit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, boolLit470.getTree());

                    }
                    break;
                case 2 :
                    // pollen.g:826:4: numLit
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_numLit_in_primitiveLit5165);
                    numLit471=numLit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, numLit471.getTree());

                    }
                    break;
                case 3 :
                    // pollen.g:827:4: STRING
                    {
                    root_0 = (Object)adaptor.nil();

                    STRING472=(Token)match(input,STRING,FOLLOW_STRING_in_primitiveLit5170); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRING472_tree = (Object)adaptor.create(STRING472);
                    adaptor.addChild(root_0, STRING472_tree);
                    }

                    }
                    break;
                case 4 :
                    // pollen.g:828:4: CHAR
                    {
                    root_0 = (Object)adaptor.nil();

                    CHAR473=(Token)match(input,CHAR,FOLLOW_CHAR_in_primitiveLit5175); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CHAR473_tree = (Object)adaptor.create(CHAR473);
                    adaptor.addChild(root_0, CHAR473_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 123, primitiveLit_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "primitiveLit"

    public static class stmtInjection_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "stmtInjection"
    // pollen.g:830:1: stmtInjection : INJECT ( NL )* -> ^( INJECT_CODE INJECT ) ;
    public final pollenParser.stmtInjection_return stmtInjection() throws RecognitionException {
        pollenParser.stmtInjection_return retval = new pollenParser.stmtInjection_return();
        retval.start = input.LT(1);
        int stmtInjection_StartIndex = input.index();
        Object root_0 = null;

        Token INJECT474=null;
        Token NL475=null;

        Object INJECT474_tree=null;
        Object NL475_tree=null;
        RewriteRuleTokenStream stream_INJECT=new RewriteRuleTokenStream(adaptor,"token INJECT");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 124) ) { return retval; }
            // pollen.g:831:2: ( INJECT ( NL )* -> ^( INJECT_CODE INJECT ) )
            // pollen.g:831:4: INJECT ( NL )*
            {
            INJECT474=(Token)match(input,INJECT,FOLLOW_INJECT_in_stmtInjection5185); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_INJECT.add(INJECT474);

            // pollen.g:831:11: ( NL )*
            loop111:
            do {
                int alt111=2;
                int LA111_0 = input.LA(1);

                if ( (LA111_0==NL) ) {
                    int LA111_2 = input.LA(2);

                    if ( (synpred205_pollen()) ) {
                        alt111=1;
                    }


                }


                switch (alt111) {
            	case 1 :
            	    // pollen.g:0:0: NL
            	    {
            	    NL475=(Token)match(input,NL,FOLLOW_NL_in_stmtInjection5187); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_NL.add(NL475);


            	    }
            	    break;

            	default :
            	    break loop111;
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
            // 831:15: -> ^( INJECT_CODE INJECT )
            {
                // pollen.g:831:18: ^( INJECT_CODE INJECT )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(INJECT_CODE, "INJECT_CODE"), root_1);

                adaptor.addChild(root_1, stream_INJECT.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
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
            if ( state.backtracking>0 ) { memoize(input, 124, stmtInjection_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "stmtInjection"

    public static class injectionCode_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "injectionCode"
    // pollen.g:833:1: injectionCode : INJECT -> ^( INJECT_CODE INJECT ) ;
    public final pollenParser.injectionCode_return injectionCode() throws RecognitionException {
        pollenParser.injectionCode_return retval = new pollenParser.injectionCode_return();
        retval.start = input.LT(1);
        int injectionCode_StartIndex = input.index();
        Object root_0 = null;

        Token INJECT476=null;

        Object INJECT476_tree=null;
        RewriteRuleTokenStream stream_INJECT=new RewriteRuleTokenStream(adaptor,"token INJECT");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 125) ) { return retval; }
            // pollen.g:836:2: ( INJECT -> ^( INJECT_CODE INJECT ) )
            // pollen.g:836:4: INJECT
            {
            INJECT476=(Token)match(input,INJECT,FOLLOW_INJECT_in_injectionCode5208); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_INJECT.add(INJECT476);



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
            // 836:11: -> ^( INJECT_CODE INJECT )
            {
                // pollen.g:836:14: ^( INJECT_CODE INJECT )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(INJECT_CODE, "INJECT_CODE"), root_1);

                adaptor.addChild(root_1, stream_INJECT.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
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
            if ( state.backtracking>0 ) { memoize(input, 125, injectionCode_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "injectionCode"

    public static class injectionList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "injectionList"
    // pollen.g:838:1: injectionList : INJECT ( ( NL )+ INJECT )+ -> ^( INJECT_CODE ( INJECT )+ ) ;
    public final pollenParser.injectionList_return injectionList() throws RecognitionException {
        pollenParser.injectionList_return retval = new pollenParser.injectionList_return();
        retval.start = input.LT(1);
        int injectionList_StartIndex = input.index();
        Object root_0 = null;

        Token INJECT477=null;
        Token NL478=null;
        Token INJECT479=null;

        Object INJECT477_tree=null;
        Object NL478_tree=null;
        Object INJECT479_tree=null;
        RewriteRuleTokenStream stream_INJECT=new RewriteRuleTokenStream(adaptor,"token INJECT");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 126) ) { return retval; }
            // pollen.g:839:2: ( INJECT ( ( NL )+ INJECT )+ -> ^( INJECT_CODE ( INJECT )+ ) )
            // pollen.g:839:4: INJECT ( ( NL )+ INJECT )+
            {
            INJECT477=(Token)match(input,INJECT,FOLLOW_INJECT_in_injectionList5227); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_INJECT.add(INJECT477);

            // pollen.g:839:11: ( ( NL )+ INJECT )+
            int cnt113=0;
            loop113:
            do {
                int alt113=2;
                int LA113_0 = input.LA(1);

                if ( (LA113_0==NL) ) {
                    alt113=1;
                }


                switch (alt113) {
            	case 1 :
            	    // pollen.g:839:12: ( NL )+ INJECT
            	    {
            	    // pollen.g:839:12: ( NL )+
            	    int cnt112=0;
            	    loop112:
            	    do {
            	        int alt112=2;
            	        int LA112_0 = input.LA(1);

            	        if ( (LA112_0==NL) ) {
            	            alt112=1;
            	        }


            	        switch (alt112) {
            	    	case 1 :
            	    	    // pollen.g:0:0: NL
            	    	    {
            	    	    NL478=(Token)match(input,NL,FOLLOW_NL_in_injectionList5230); if (state.failed) return retval; 
            	    	    if ( state.backtracking==0 ) stream_NL.add(NL478);


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

            	    INJECT479=(Token)match(input,INJECT,FOLLOW_INJECT_in_injectionList5233); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_INJECT.add(INJECT479);


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
            // 839:25: -> ^( INJECT_CODE ( INJECT )+ )
            {
                // pollen.g:839:28: ^( INJECT_CODE ( INJECT )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(INJECT_CODE, "INJECT_CODE"), root_1);

                if ( !(stream_INJECT.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_INJECT.hasNext() ) {
                    adaptor.addChild(root_1, stream_INJECT.nextNode());

                }
                stream_INJECT.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
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
            if ( state.backtracking>0 ) { memoize(input, 126, injectionList_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "injectionList"

    public static class delim_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "delim"
    // pollen.g:841:1: delim : ( ( SEMI ) ( NL )* -> | ( NL )+ -> | ( ( NL )* '}' )=> ( NL )* ->);
    public final pollenParser.delim_return delim() throws RecognitionException {
        pollenParser.delim_return retval = new pollenParser.delim_return();
        retval.start = input.LT(1);
        int delim_StartIndex = input.index();
        Object root_0 = null;

        Token SEMI480=null;
        Token NL481=null;
        Token NL482=null;
        Token NL483=null;

        Object SEMI480_tree=null;
        Object NL481_tree=null;
        Object NL482_tree=null;
        Object NL483_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 127) ) { return retval; }
            // pollen.g:842:2: ( ( SEMI ) ( NL )* -> | ( NL )+ -> | ( ( NL )* '}' )=> ( NL )* ->)
            int alt117=3;
            alt117 = dfa117.predict(input);
            switch (alt117) {
                case 1 :
                    // pollen.g:842:4: ( SEMI ) ( NL )*
                    {
                    // pollen.g:842:4: ( SEMI )
                    // pollen.g:842:5: SEMI
                    {
                    SEMI480=(Token)match(input,SEMI,FOLLOW_SEMI_in_delim5255); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI480);


                    }

                    // pollen.g:842:11: ( NL )*
                    loop114:
                    do {
                        int alt114=2;
                        int LA114_0 = input.LA(1);

                        if ( (LA114_0==NL) ) {
                            int LA114_2 = input.LA(2);

                            if ( (synpred208_pollen()) ) {
                                alt114=1;
                            }


                        }


                        switch (alt114) {
                    	case 1 :
                    	    // pollen.g:842:12: NL
                    	    {
                    	    NL481=(Token)match(input,NL,FOLLOW_NL_in_delim5259); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_NL.add(NL481);


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

                    root_0 = (Object)adaptor.nil();
                    // 842:17: ->
                    {
                        root_0 = null;
                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // pollen.g:843:4: ( NL )+
                    {
                    // pollen.g:843:4: ( NL )+
                    int cnt115=0;
                    loop115:
                    do {
                        int alt115=2;
                        int LA115_0 = input.LA(1);

                        if ( (LA115_0==NL) ) {
                            int LA115_2 = input.LA(2);

                            if ( (synpred210_pollen()) ) {
                                alt115=1;
                            }


                        }


                        switch (alt115) {
                    	case 1 :
                    	    // pollen.g:843:5: NL
                    	    {
                    	    NL482=(Token)match(input,NL,FOLLOW_NL_in_delim5270); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_NL.add(NL482);


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt115 >= 1 ) break loop115;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(115, input);
                                throw eee;
                        }
                        cnt115++;
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
                    // 843:10: ->
                    {
                        root_0 = null;
                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // pollen.g:844:4: ( ( NL )* '}' )=> ( NL )*
                    {
                    // pollen.g:844:20: ( NL )*
                    loop116:
                    do {
                        int alt116=2;
                        int LA116_0 = input.LA(1);

                        if ( (LA116_0==NL) ) {
                            int LA116_1 = input.LA(2);

                            if ( (synpred214_pollen()) ) {
                                alt116=1;
                            }


                        }


                        switch (alt116) {
                    	case 1 :
                    	    // pollen.g:0:0: NL
                    	    {
                    	    NL483=(Token)match(input,NL,FOLLOW_NL_in_delim5292); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_NL.add(NL483);


                    	    }
                    	    break;

                    	default :
                    	    break loop116;
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
                    // 844:24: ->
                    {
                        root_0 = null;
                    }

                    retval.tree = root_0;}
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
            if ( state.backtracking>0 ) { memoize(input, 127, delim_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "delim"

    public static class delim_implicit_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "delim_implicit"
    // pollen.g:846:1: delim_implicit : ;
    public final pollenParser.delim_implicit_return delim_implicit() throws RecognitionException {
        pollenParser.delim_implicit_return retval = new pollenParser.delim_implicit_return();
        retval.start = input.LT(1);
        int delim_implicit_StartIndex = input.index();
        Object root_0 = null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 128) ) { return retval; }
            // pollen.g:847:2: ()
            // pollen.g:848:2: 
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
            if ( state.backtracking>0 ) { memoize(input, 128, delim_implicit_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "delim_implicit"

    // $ANTLR start synpred3_pollen
    public final void synpred3_pollen_fragment() throws RecognitionException {   
        // pollen.g:213:8: ( stmtInjection )
        // pollen.g:213:8: stmtInjection
        {
        pushFollow(FOLLOW_stmtInjection_in_synpred3_pollen757);
        stmtInjection();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred3_pollen

    // $ANTLR start synpred7_pollen
    public final void synpred7_pollen_fragment() throws RecognitionException {   
        // pollen.g:226:9: ( stmtExport )
        // pollen.g:226:9: stmtExport
        {
        pushFollow(FOLLOW_stmtExport_in_synpred7_pollen858);
        stmtExport();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred7_pollen

    // $ANTLR start synpred10_pollen
    public final void synpred10_pollen_fragment() throws RecognitionException {   
        // pollen.g:252:9: ( fcnDefinition )
        // pollen.g:252:9: fcnDefinition
        {
        pushFollow(FOLLOW_fcnDefinition_in_synpred10_pollen955);
        fcnDefinition();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred10_pollen

    // $ANTLR start synpred12_pollen
    public final void synpred12_pollen_fragment() throws RecognitionException {   
        // pollen.g:254:9: ( varDeclaration )
        // pollen.g:254:9: varDeclaration
        {
        pushFollow(FOLLOW_varDeclaration_in_synpred12_pollen976);
        varDeclaration();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred12_pollen

    // $ANTLR start synpred16_pollen
    public final void synpred16_pollen_fragment() throws RecognitionException {   
        // pollen.g:266:6: ( fcnDefinition )
        // pollen.g:266:6: fcnDefinition
        {
        pushFollow(FOLLOW_fcnDefinition_in_synpred16_pollen1078);
        fcnDefinition();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred16_pollen

    // $ANTLR start synpred17_pollen
    public final void synpred17_pollen_fragment() throws RecognitionException {   
        // pollen.g:267:8: ( varDeclaration )
        // pollen.g:267:8: varDeclaration
        {
        pushFollow(FOLLOW_varDeclaration_in_synpred17_pollen1087);
        varDeclaration();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred17_pollen

    // $ANTLR start synpred21_pollen
    public final void synpred21_pollen_fragment() throws RecognitionException {   
        // pollen.g:296:30: ( delim )
        // pollen.g:296:30: delim
        {
        pushFollow(FOLLOW_delim_in_synpred21_pollen1206);
        delim();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred21_pollen

    // $ANTLR start synpred22_pollen
    public final void synpred22_pollen_fragment() throws RecognitionException {   
        // pollen.g:296:4: ( IDENT ( ASSIGN INT_LIT ) ( delim )? )
        // pollen.g:296:4: IDENT ( ASSIGN INT_LIT ) ( delim )?
        {
        match(input,IDENT,FOLLOW_IDENT_in_synpred22_pollen1195); if (state.failed) return ;
        // pollen.g:296:11: ( ASSIGN INT_LIT )
        // pollen.g:296:12: ASSIGN INT_LIT
        {
        match(input,ASSIGN,FOLLOW_ASSIGN_in_synpred22_pollen1199); if (state.failed) return ;
        match(input,INT_LIT,FOLLOW_INT_LIT_in_synpred22_pollen1202); if (state.failed) return ;

        }

        // pollen.g:296:29: ( delim )?
        int alt118=2;
        int LA118_0 = input.LA(1);

        if ( (LA118_0==NL||LA118_0==SEMI) ) {
            alt118=1;
        }
        else if ( (LA118_0==EOF) ) {
            int LA118_3 = input.LA(2);

            if ( (synpred21_pollen()) ) {
                alt118=1;
            }
        }
        switch (alt118) {
            case 1 :
                // pollen.g:296:30: delim
                {
                pushFollow(FOLLOW_delim_in_synpred22_pollen1206);
                delim();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        }
    }
    // $ANTLR end synpred22_pollen

    // $ANTLR start synpred23_pollen
    public final void synpred23_pollen_fragment() throws RecognitionException {   
        // pollen.g:297:12: ( delim )
        // pollen.g:297:12: delim
        {
        pushFollow(FOLLOW_delim_in_synpred23_pollen1217);
        delim();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred23_pollen

    // $ANTLR start synpred31_pollen
    public final void synpred31_pollen_fragment() throws RecognitionException {   
        // pollen.g:324:7: ( fcnDefinitionHost )
        // pollen.g:324:7: fcnDefinitionHost
        {
        pushFollow(FOLLOW_fcnDefinitionHost_in_synpred31_pollen1383);
        fcnDefinitionHost();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred31_pollen

    // $ANTLR start synpred33_pollen
    public final void synpred33_pollen_fragment() throws RecognitionException {   
        // pollen.g:326:7: ( varDeclaration )
        // pollen.g:326:7: varDeclaration
        {
        pushFollow(FOLLOW_varDeclaration_in_synpred33_pollen1399);
        varDeclaration();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred33_pollen

    // $ANTLR start synpred42_pollen
    public final void synpred42_pollen_fragment() throws RecognitionException {   
        // pollen.g:364:7: ( '{' metaArgument ( ',' metaArgument )* '}' )
        // pollen.g:364:7: '{' metaArgument ( ',' metaArgument )* '}'
        {
        match(input,138,FOLLOW_138_in_synpred42_pollen1672); if (state.failed) return ;
        pushFollow(FOLLOW_metaArgument_in_synpred42_pollen1674);
        metaArgument();

        state._fsp--;
        if (state.failed) return ;
        // pollen.g:364:25: ( ',' metaArgument )*
        loop119:
        do {
            int alt119=2;
            int LA119_0 = input.LA(1);

            if ( (LA119_0==130) ) {
                alt119=1;
            }


            switch (alt119) {
        	case 1 :
        	    // pollen.g:364:26: ',' metaArgument
        	    {
        	    match(input,130,FOLLOW_130_in_synpred42_pollen1678); if (state.failed) return ;
        	    pushFollow(FOLLOW_metaArgument_in_synpred42_pollen1680);
        	    metaArgument();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop119;
            }
        } while (true);

        match(input,139,FOLLOW_139_in_synpred42_pollen1684); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred42_pollen

    // $ANTLR start synpred49_pollen
    public final void synpred49_pollen_fragment() throws RecognitionException {   
        // pollen.g:386:4: ( qualName metaArguments )
        // pollen.g:386:4: qualName metaArguments
        {
        pushFollow(FOLLOW_qualName_in_synpred49_pollen1803);
        qualName();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_metaArguments_in_synpred49_pollen1805);
        metaArguments();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred49_pollen

    // $ANTLR start synpred51_pollen
    public final void synpred51_pollen_fragment() throws RecognitionException {   
        // pollen.g:400:10: ( 'module' )
        // pollen.g:400:11: 'module'
        {
        match(input,128,FOLLOW_128_in_synpred51_pollen1870); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred51_pollen

    // $ANTLR start synpred52_pollen
    public final void synpred52_pollen_fragment() throws RecognitionException {   
        // pollen.g:401:8: ( 'class' )
        // pollen.g:401:9: 'class'
        {
        match(input,127,FOLLOW_127_in_synpred52_pollen1890); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred52_pollen

    // $ANTLR start synpred53_pollen
    public final void synpred53_pollen_fragment() throws RecognitionException {   
        // pollen.g:402:10: ( 'protocol' )
        // pollen.g:402:11: 'protocol'
        {
        match(input,131,FOLLOW_131_in_synpred53_pollen1908); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred53_pollen

    // $ANTLR start synpred54_pollen
    public final void synpred54_pollen_fragment() throws RecognitionException {   
        // pollen.g:403:10: ( 'composition' )
        // pollen.g:403:11: 'composition'
        {
        match(input,132,FOLLOW_132_in_synpred54_pollen1926); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred54_pollen

    // $ANTLR start synpred55_pollen
    public final void synpred55_pollen_fragment() throws RecognitionException {   
        // pollen.g:404:10: ( 'enum' )
        // pollen.g:404:11: 'enum'
        {
        match(input,129,FOLLOW_129_in_synpred55_pollen1944); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred55_pollen

    // $ANTLR start synpred57_pollen
    public final void synpred57_pollen_fragment() throws RecognitionException {   
        // pollen.g:416:23: ( NL )
        // pollen.g:416:23: NL
        {
        match(input,NL,FOLLOW_NL_in_synpred57_pollen2028); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred57_pollen

    // $ANTLR start synpred61_pollen
    public final void synpred61_pollen_fragment() throws RecognitionException {   
        // pollen.g:425:23: ( NL )
        // pollen.g:425:23: NL
        {
        match(input,NL,FOLLOW_NL_in_synpred61_pollen2095); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred61_pollen

    // $ANTLR start synpred79_pollen
    public final void synpred79_pollen_fragment() throws RecognitionException {   
        // pollen.g:452:10: ( ',' expr )
        // pollen.g:452:10: ',' expr
        {
        match(input,130,FOLLOW_130_in_synpred79_pollen2283); if (state.failed) return ;
        pushFollow(FOLLOW_expr_in_synpred79_pollen2285);
        expr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred79_pollen

    // $ANTLR start synpred80_pollen
    public final void synpred80_pollen_fragment() throws RecognitionException {   
        // pollen.g:452:4: ( expr ( ',' expr )* )
        // pollen.g:452:4: expr ( ',' expr )*
        {
        pushFollow(FOLLOW_expr_in_synpred80_pollen2280);
        expr();

        state._fsp--;
        if (state.failed) return ;
        // pollen.g:452:9: ( ',' expr )*
        loop120:
        do {
            int alt120=2;
            int LA120_0 = input.LA(1);

            if ( (LA120_0==130) ) {
                alt120=1;
            }


            switch (alt120) {
        	case 1 :
        	    // pollen.g:452:10: ',' expr
        	    {
        	    match(input,130,FOLLOW_130_in_synpred80_pollen2283); if (state.failed) return ;
        	    pushFollow(FOLLOW_expr_in_synpred80_pollen2285);
        	    expr();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop120;
            }
        } while (true);


        }
    }
    // $ANTLR end synpred80_pollen

    // $ANTLR start synpred81_pollen
    public final void synpred81_pollen_fragment() throws RecognitionException {   
        // pollen.g:456:4: ( exprLogicalOr '?' expr ':' expr )
        // pollen.g:456:4: exprLogicalOr '?' expr ':' expr
        {
        pushFollow(FOLLOW_exprLogicalOr_in_synpred81_pollen2309);
        exprLogicalOr();

        state._fsp--;
        if (state.failed) return ;
        match(input,153,FOLLOW_153_in_synpred81_pollen2311); if (state.failed) return ;
        pushFollow(FOLLOW_expr_in_synpred81_pollen2313);
        expr();

        state._fsp--;
        if (state.failed) return ;
        match(input,154,FOLLOW_154_in_synpred81_pollen2315); if (state.failed) return ;
        pushFollow(FOLLOW_expr_in_synpred81_pollen2317);
        expr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred81_pollen

    // $ANTLR start synpred82_pollen
    public final void synpred82_pollen_fragment() throws RecognitionException {   
        // pollen.g:460:20: ( '||' exprLogicalAnd )
        // pollen.g:460:20: '||' exprLogicalAnd
        {
        match(input,155,FOLLOW_155_in_synpred82_pollen2361); if (state.failed) return ;
        pushFollow(FOLLOW_exprLogicalAnd_in_synpred82_pollen2363);
        exprLogicalAnd();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred82_pollen

    // $ANTLR start synpred83_pollen
    public final void synpred83_pollen_fragment() throws RecognitionException {   
        // pollen.g:463:19: ( '&&' exprBitwiseOr )
        // pollen.g:463:19: '&&' exprBitwiseOr
        {
        match(input,156,FOLLOW_156_in_synpred83_pollen2378); if (state.failed) return ;
        pushFollow(FOLLOW_exprBitwiseOr_in_synpred83_pollen2380);
        exprBitwiseOr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred83_pollen

    // $ANTLR start synpred84_pollen
    public final void synpred84_pollen_fragment() throws RecognitionException {   
        // pollen.g:466:20: ( '|' exprBitwiseXor )
        // pollen.g:466:20: '|' exprBitwiseXor
        {
        match(input,157,FOLLOW_157_in_synpred84_pollen2395); if (state.failed) return ;
        pushFollow(FOLLOW_exprBitwiseXor_in_synpred84_pollen2397);
        exprBitwiseXor();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred84_pollen

    // $ANTLR start synpred85_pollen
    public final void synpred85_pollen_fragment() throws RecognitionException {   
        // pollen.g:469:20: ( '^' exprBitwiseAnd )
        // pollen.g:469:20: '^' exprBitwiseAnd
        {
        match(input,158,FOLLOW_158_in_synpred85_pollen2412); if (state.failed) return ;
        pushFollow(FOLLOW_exprBitwiseAnd_in_synpred85_pollen2414);
        exprBitwiseAnd();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred85_pollen

    // $ANTLR start synpred86_pollen
    public final void synpred86_pollen_fragment() throws RecognitionException {   
        // pollen.g:472:18: ( '&' exprEquality )
        // pollen.g:472:18: '&' exprEquality
        {
        match(input,159,FOLLOW_159_in_synpred86_pollen2429); if (state.failed) return ;
        pushFollow(FOLLOW_exprEquality_in_synpred86_pollen2431);
        exprEquality();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred86_pollen

    // $ANTLR start synpred87_pollen
    public final void synpred87_pollen_fragment() throws RecognitionException {   
        // pollen.g:475:21: ( equalityOp exprRelational )
        // pollen.g:475:21: equalityOp exprRelational
        {
        pushFollow(FOLLOW_equalityOp_in_synpred87_pollen2447);
        equalityOp();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_exprRelational_in_synpred87_pollen2449);
        exprRelational();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred87_pollen

    // $ANTLR start synpred88_pollen
    public final void synpred88_pollen_fragment() throws RecognitionException {   
        // pollen.g:478:17: ( relationalOp exprShift )
        // pollen.g:478:17: relationalOp exprShift
        {
        pushFollow(FOLLOW_relationalOp_in_synpred88_pollen2466);
        relationalOp();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_exprShift_in_synpred88_pollen2468);
        exprShift();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred88_pollen

    // $ANTLR start synpred89_pollen
    public final void synpred89_pollen_fragment() throws RecognitionException {   
        // pollen.g:481:17: ( shiftOp exprAddSub )
        // pollen.g:481:17: shiftOp exprAddSub
        {
        pushFollow(FOLLOW_shiftOp_in_synpred89_pollen2485);
        shiftOp();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_exprAddSub_in_synpred89_pollen2488);
        exprAddSub();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred89_pollen

    // $ANTLR start synpred90_pollen
    public final void synpred90_pollen_fragment() throws RecognitionException {   
        // pollen.g:484:17: ( addSubOp exprMultDiv )
        // pollen.g:484:17: addSubOp exprMultDiv
        {
        pushFollow(FOLLOW_addSubOp_in_synpred90_pollen2504);
        addSubOp();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_exprMultDiv_in_synpred90_pollen2506);
        exprMultDiv();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred90_pollen

    // $ANTLR start synpred91_pollen
    public final void synpred91_pollen_fragment() throws RecognitionException {   
        // pollen.g:487:15: ( multDivModOp exprUnary )
        // pollen.g:487:15: multDivModOp exprUnary
        {
        pushFollow(FOLLOW_multDivModOp_in_synpred91_pollen2521);
        multDivModOp();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_exprUnary_in_synpred91_pollen2523);
        exprUnary();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred91_pollen

    // $ANTLR start synpred100_pollen
    public final void synpred100_pollen_fragment() throws RecognitionException {   
        // pollen.g:498:21: ( ( '++' ) )
        // pollen.g:498:21: ( '++' )
        {
        // pollen.g:498:21: ( '++' )
        // pollen.g:498:22: '++'
        {
        match(input,162,FOLLOW_162_in_synpred100_pollen2589); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred100_pollen

    // $ANTLR start synpred101_pollen
    public final void synpred101_pollen_fragment() throws RecognitionException {   
        // pollen.g:498:30: ( ( '--' ) )
        // pollen.g:498:30: ( '--' )
        {
        // pollen.g:498:30: ( '--' )
        // pollen.g:498:31: '--'
        {
        match(input,163,FOLLOW_163_in_synpred101_pollen2595); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred101_pollen

    // $ANTLR start synpred112_pollen
    public final void synpred112_pollen_fragment() throws RecognitionException {   
        // pollen.g:555:4: ( typeName qualName )
        // pollen.g:555:4: typeName qualName
        {
        pushFollow(FOLLOW_typeName_in_synpred112_pollen2874);
        typeName();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_qualName_in_synpred112_pollen2876);
        qualName();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred112_pollen

    // $ANTLR start synpred113_pollen
    public final void synpred113_pollen_fragment() throws RecognitionException {   
        // pollen.g:557:4: ({...}? typeName )
        // pollen.g:557:4: {...}? typeName
        {
        if ( !((input.LT(1).getText().equals(ti.getTypeName()) )) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred113_pollen", "input.LT(1).getText().equals(ti.getTypeName()) ");
        }
        pushFollow(FOLLOW_typeName_in_synpred113_pollen2915);
        typeName();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred113_pollen

    // $ANTLR start synpred114_pollen
    public final void synpred114_pollen_fragment() throws RecognitionException {   
        // pollen.g:559:4: ( qualName )
        // pollen.g:559:4: qualName
        {
        pushFollow(FOLLOW_qualName_in_synpred114_pollen2945);
        qualName();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred114_pollen

    // $ANTLR start synpred116_pollen
    public final void synpred116_pollen_fragment() throws RecognitionException {   
        // pollen.g:561:4: ( '(' typeName ( ',' typeName )* ')' qualName )
        // pollen.g:561:5: '(' typeName ( ',' typeName )* ')' qualName
        {
        match(input,160,FOLLOW_160_in_synpred116_pollen2985); if (state.failed) return ;
        pushFollow(FOLLOW_typeName_in_synpred116_pollen2987);
        typeName();

        state._fsp--;
        if (state.failed) return ;
        // pollen.g:561:18: ( ',' typeName )*
        loop122:
        do {
            int alt122=2;
            int LA122_0 = input.LA(1);

            if ( (LA122_0==130) ) {
                alt122=1;
            }


            switch (alt122) {
        	case 1 :
        	    // pollen.g:561:19: ',' typeName
        	    {
        	    match(input,130,FOLLOW_130_in_synpred116_pollen2990); if (state.failed) return ;
        	    pushFollow(FOLLOW_typeName_in_synpred116_pollen2992);
        	    typeName();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop122;
            }
        } while (true);

        match(input,161,FOLLOW_161_in_synpred116_pollen2996); if (state.failed) return ;
        pushFollow(FOLLOW_qualName_in_synpred116_pollen2998);
        qualName();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred116_pollen

    // $ANTLR start synpred122_pollen
    public final void synpred122_pollen_fragment() throws RecognitionException {   
        // pollen.g:591:4: ( '@' IDENT fcnArgumentList fieldOrArrayAccess )
        // pollen.g:591:4: '@' IDENT fcnArgumentList fieldOrArrayAccess
        {
        match(input,167,FOLLOW_167_in_synpred122_pollen3201); if (state.failed) return ;
        match(input,IDENT,FOLLOW_IDENT_in_synpred122_pollen3204); if (state.failed) return ;
        pushFollow(FOLLOW_fcnArgumentList_in_synpred122_pollen3206);
        fcnArgumentList();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_fieldOrArrayAccess_in_synpred122_pollen3208);
        fieldOrArrayAccess();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred122_pollen

    // $ANTLR start synpred123_pollen
    public final void synpred123_pollen_fragment() throws RecognitionException {   
        // pollen.g:592:4: ( '@' IDENT fieldOrArrayAccess )
        // pollen.g:592:4: '@' IDENT fieldOrArrayAccess
        {
        match(input,167,FOLLOW_167_in_synpred123_pollen3214); if (state.failed) return ;
        match(input,IDENT,FOLLOW_IDENT_in_synpred123_pollen3217); if (state.failed) return ;
        pushFollow(FOLLOW_fieldOrArrayAccess_in_synpred123_pollen3219);
        fieldOrArrayAccess();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred123_pollen

    // $ANTLR start synpred124_pollen
    public final void synpred124_pollen_fragment() throws RecognitionException {   
        // pollen.g:593:4: ( '@' )
        // pollen.g:593:4: '@'
        {
        match(input,167,FOLLOW_167_in_synpred124_pollen3228); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred124_pollen

    // $ANTLR start synpred125_pollen
    public final void synpred125_pollen_fragment() throws RecognitionException {   
        // pollen.g:594:4: ( qualName fcnArgumentList fieldOrArrayAccess )
        // pollen.g:594:4: qualName fcnArgumentList fieldOrArrayAccess
        {
        pushFollow(FOLLOW_qualName_in_synpred125_pollen3235);
        qualName();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_fcnArgumentList_in_synpred125_pollen3237);
        fcnArgumentList();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_fieldOrArrayAccess_in_synpred125_pollen3239);
        fieldOrArrayAccess();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred125_pollen

    // $ANTLR start synpred127_pollen
    public final void synpred127_pollen_fragment() throws RecognitionException {   
        // pollen.g:599:20: ( arrayAccess )
        // pollen.g:599:20: arrayAccess
        {
        pushFollow(FOLLOW_arrayAccess_in_synpred127_pollen3278);
        arrayAccess();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred127_pollen

    // $ANTLR start synpred128_pollen
    public final void synpred128_pollen_fragment() throws RecognitionException {   
        // pollen.g:599:5: ( ( fieldAccess | arrayAccess )+ )
        // pollen.g:599:5: ( fieldAccess | arrayAccess )+
        {
        // pollen.g:599:5: ( fieldAccess | arrayAccess )+
        int cnt124=0;
        loop124:
        do {
            int alt124=3;
            int LA124_0 = input.LA(1);

            if ( (LA124_0==168) ) {
                alt124=1;
            }
            else if ( (LA124_0==140) ) {
                alt124=2;
            }


            switch (alt124) {
        	case 1 :
        	    // pollen.g:599:6: fieldAccess
        	    {
        	    pushFollow(FOLLOW_fieldAccess_in_synpred128_pollen3274);
        	    fieldAccess();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;
        	case 2 :
        	    // pollen.g:599:20: arrayAccess
        	    {
        	    pushFollow(FOLLOW_arrayAccess_in_synpred128_pollen3278);
        	    arrayAccess();

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
    }
    // $ANTLR end synpred128_pollen

    // $ANTLR start synpred129_pollen
    public final void synpred129_pollen_fragment() throws RecognitionException {   
        // pollen.g:603:15: ( fcnArgumentList )
        // pollen.g:603:15: fcnArgumentList
        {
        pushFollow(FOLLOW_fcnArgumentList_in_synpred129_pollen3302);
        fcnArgumentList();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred129_pollen

    // $ANTLR start synpred130_pollen
    public final void synpred130_pollen_fragment() throws RecognitionException {   
        // pollen.g:606:9: ( exprList )
        // pollen.g:606:9: exprList
        {
        pushFollow(FOLLOW_exprList_in_synpred130_pollen3329);
        exprList();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred130_pollen

    // $ANTLR start synpred133_pollen
    public final void synpred133_pollen_fragment() throws RecognitionException {   
        // pollen.g:614:5: ( NL )
        // pollen.g:614:5: NL
        {
        match(input,NL,FOLLOW_NL_in_synpred133_pollen3386); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred133_pollen

    // $ANTLR start synpred134_pollen
    public final void synpred134_pollen_fragment() throws RecognitionException {   
        // pollen.g:617:5: ( stmtAssign delim )
        // pollen.g:617:5: stmtAssign delim
        {
        pushFollow(FOLLOW_stmtAssign_in_synpred134_pollen3403);
        stmtAssign();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_delim_in_synpred134_pollen3405);
        delim();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred134_pollen

    // $ANTLR start synpred136_pollen
    public final void synpred136_pollen_fragment() throws RecognitionException {   
        // pollen.g:619:4: ( stmtBind )
        // pollen.g:619:4: stmtBind
        {
        pushFollow(FOLLOW_stmtBind_in_synpred136_pollen3417);
        stmtBind();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred136_pollen

    // $ANTLR start synpred148_pollen
    public final void synpred148_pollen_fragment() throws RecognitionException {   
        // pollen.g:631:4: ( varDeclaration )
        // pollen.g:631:4: varDeclaration
        {
        pushFollow(FOLLOW_varDeclaration_in_synpred148_pollen3482);
        varDeclaration();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred148_pollen

    // $ANTLR start synpred149_pollen
    public final void synpred149_pollen_fragment() throws RecognitionException {   
        // pollen.g:632:4: ( stmtInjection )
        // pollen.g:632:4: stmtInjection
        {
        pushFollow(FOLLOW_stmtInjection_in_synpred149_pollen3488);
        stmtInjection();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred149_pollen

    // $ANTLR start synpred150_pollen
    public final void synpred150_pollen_fragment() throws RecognitionException {   
        // pollen.g:636:4: ( varOrFcnOrArray ASSIGN expr )
        // pollen.g:636:4: varOrFcnOrArray ASSIGN expr
        {
        pushFollow(FOLLOW_varOrFcnOrArray_in_synpred150_pollen3505);
        varOrFcnOrArray();

        state._fsp--;
        if (state.failed) return ;
        match(input,ASSIGN,FOLLOW_ASSIGN_in_synpred150_pollen3507); if (state.failed) return ;
        pushFollow(FOLLOW_expr_in_synpred150_pollen3509);
        expr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred150_pollen

    // $ANTLR start synpred151_pollen
    public final void synpred151_pollen_fragment() throws RecognitionException {   
        // pollen.g:637:4: ( injectionCode ASSIGN expr )
        // pollen.g:637:4: injectionCode ASSIGN expr
        {
        pushFollow(FOLLOW_injectionCode_in_synpred151_pollen3526);
        injectionCode();

        state._fsp--;
        if (state.failed) return ;
        match(input,ASSIGN,FOLLOW_ASSIGN_in_synpred151_pollen3528); if (state.failed) return ;
        pushFollow(FOLLOW_expr_in_synpred151_pollen3530);
        expr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred151_pollen

    // $ANTLR start synpred152_pollen
    public final void synpred152_pollen_fragment() throws RecognitionException {   
        // pollen.g:638:4: ( varOrFcnOrArray assignOp expr )
        // pollen.g:638:4: varOrFcnOrArray assignOp expr
        {
        pushFollow(FOLLOW_varOrFcnOrArray_in_synpred152_pollen3552);
        varOrFcnOrArray();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_assignOp_in_synpred152_pollen3554);
        assignOp();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_expr_in_synpred152_pollen3556);
        expr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred152_pollen

    // $ANTLR start synpred157_pollen
    public final void synpred157_pollen_fragment() throws RecognitionException {   
        // pollen.g:657:4: ( 'return' ( '(' ) ( expr ( ',' expr )+ ) ( ')' ) delim )
        // pollen.g:657:4: 'return' ( '(' ) ( expr ( ',' expr )+ ) ( ')' ) delim
        {
        match(input,174,FOLLOW_174_in_synpred157_pollen3709); if (state.failed) return ;
        // pollen.g:657:13: ( '(' )
        // pollen.g:657:14: '('
        {
        match(input,160,FOLLOW_160_in_synpred157_pollen3712); if (state.failed) return ;

        }

        // pollen.g:657:19: ( expr ( ',' expr )+ )
        // pollen.g:657:20: expr ( ',' expr )+
        {
        pushFollow(FOLLOW_expr_in_synpred157_pollen3716);
        expr();

        state._fsp--;
        if (state.failed) return ;
        // pollen.g:657:25: ( ',' expr )+
        int cnt126=0;
        loop126:
        do {
            int alt126=2;
            int LA126_0 = input.LA(1);

            if ( (LA126_0==130) ) {
                alt126=1;
            }


            switch (alt126) {
        	case 1 :
        	    // pollen.g:657:26: ',' expr
        	    {
        	    match(input,130,FOLLOW_130_in_synpred157_pollen3719); if (state.failed) return ;
        	    pushFollow(FOLLOW_expr_in_synpred157_pollen3721);
        	    expr();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    if ( cnt126 >= 1 ) break loop126;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(126, input);
                    throw eee;
            }
            cnt126++;
        } while (true);


        }

        // pollen.g:657:38: ( ')' )
        // pollen.g:657:39: ')'
        {
        match(input,161,FOLLOW_161_in_synpred157_pollen3727); if (state.failed) return ;

        }

        pushFollow(FOLLOW_delim_in_synpred157_pollen3730);
        delim();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred157_pollen

    // $ANTLR start synpred160_pollen
    public final void synpred160_pollen_fragment() throws RecognitionException {   
        // pollen.g:679:9: ( typeName IDENT '=' expr )
        // pollen.g:679:9: typeName IDENT '=' expr
        {
        pushFollow(FOLLOW_typeName_in_synpred160_pollen3939);
        typeName();

        state._fsp--;
        if (state.failed) return ;
        match(input,IDENT,FOLLOW_IDENT_in_synpred160_pollen3941); if (state.failed) return ;
        match(input,ASSIGN,FOLLOW_ASSIGN_in_synpred160_pollen3943); if (state.failed) return ;
        pushFollow(FOLLOW_expr_in_synpred160_pollen3945);
        expr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred160_pollen

    // $ANTLR start synpred165_pollen
    public final void synpred165_pollen_fragment() throws RecognitionException {   
        // pollen.g:705:4: ( 'if' stmtIfBlock stmtsElif ( stmtElse )? )
        // pollen.g:705:4: 'if' stmtIfBlock stmtsElif ( stmtElse )?
        {
        match(input,185,FOLLOW_185_in_synpred165_pollen4210); if (state.failed) return ;
        pushFollow(FOLLOW_stmtIfBlock_in_synpred165_pollen4212);
        stmtIfBlock();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_stmtsElif_in_synpred165_pollen4214);
        stmtsElif();

        state._fsp--;
        if (state.failed) return ;
        // pollen.g:705:31: ( stmtElse )?
        int alt127=2;
        int LA127_0 = input.LA(1);

        if ( (LA127_0==187) ) {
            alt127=1;
        }
        switch (alt127) {
            case 1 :
                // pollen.g:0:0: stmtElse
                {
                pushFollow(FOLLOW_stmtElse_in_synpred165_pollen4216);
                stmtElse();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        }
    }
    // $ANTLR end synpred165_pollen

    // $ANTLR start synpred166_pollen
    public final void synpred166_pollen_fragment() throws RecognitionException {   
        // pollen.g:706:4: ( 'if' stmtIfBlock stmtElse )
        // pollen.g:706:4: 'if' stmtIfBlock stmtElse
        {
        match(input,185,FOLLOW_185_in_synpred166_pollen4235); if (state.failed) return ;
        pushFollow(FOLLOW_stmtIfBlock_in_synpred166_pollen4237);
        stmtIfBlock();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_stmtElse_in_synpred166_pollen4239);
        stmtElse();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred166_pollen

    // $ANTLR start synpred173_pollen
    public final void synpred173_pollen_fragment() throws RecognitionException {   
        // pollen.g:739:4: ( typeName IDENT ( ASSIGN expr )? ',' )
        // pollen.g:739:5: typeName IDENT ( ASSIGN expr )? ','
        {
        pushFollow(FOLLOW_typeName_in_synpred173_pollen4482);
        typeName();

        state._fsp--;
        if (state.failed) return ;
        match(input,IDENT,FOLLOW_IDENT_in_synpred173_pollen4484); if (state.failed) return ;
        // pollen.g:739:20: ( ASSIGN expr )?
        int alt128=2;
        int LA128_0 = input.LA(1);

        if ( (LA128_0==ASSIGN) ) {
            alt128=1;
        }
        switch (alt128) {
            case 1 :
                // pollen.g:739:21: ASSIGN expr
                {
                match(input,ASSIGN,FOLLOW_ASSIGN_in_synpred173_pollen4487); if (state.failed) return ;
                pushFollow(FOLLOW_expr_in_synpred173_pollen4489);
                expr();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }

        match(input,130,FOLLOW_130_in_synpred173_pollen4493); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred173_pollen

    // $ANTLR start synpred174_pollen
    public final void synpred174_pollen_fragment() throws RecognitionException {   
        // pollen.g:740:5: ( typeName IDENT '[' )
        // pollen.g:740:6: typeName IDENT '['
        {
        pushFollow(FOLLOW_typeName_in_synpred174_pollen4505);
        typeName();

        state._fsp--;
        if (state.failed) return ;
        match(input,IDENT,FOLLOW_IDENT_in_synpred174_pollen4507); if (state.failed) return ;
        match(input,140,FOLLOW_140_in_synpred174_pollen4509); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred174_pollen

    // $ANTLR start synpred175_pollen
    public final void synpred175_pollen_fragment() throws RecognitionException {   
        // pollen.g:741:5: ( typeName '(' )
        // pollen.g:741:6: typeName '('
        {
        pushFollow(FOLLOW_typeName_in_synpred175_pollen4522);
        typeName();

        state._fsp--;
        if (state.failed) return ;
        match(input,160,FOLLOW_160_in_synpred175_pollen4524); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred175_pollen

    // $ANTLR start synpred176_pollen
    public final void synpred176_pollen_fragment() throws RecognitionException {   
        // pollen.g:742:6: ( typeName varInit )
        // pollen.g:742:6: typeName varInit
        {
        pushFollow(FOLLOW_typeName_in_synpred176_pollen4538);
        typeName();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_varInit_in_synpred176_pollen4540);
        varInit();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred176_pollen

    // $ANTLR start synpred179_pollen
    public final void synpred179_pollen_fragment() throws RecognitionException {   
        // pollen.g:762:5: ( '[' varDim ']' )
        // pollen.g:762:5: '[' varDim ']'
        {
        match(input,140,FOLLOW_140_in_synpred179_pollen4686); if (state.failed) return ;
        pushFollow(FOLLOW_varDim_in_synpred179_pollen4688);
        varDim();

        state._fsp--;
        if (state.failed) return ;
        match(input,141,FOLLOW_141_in_synpred179_pollen4690); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred179_pollen

    // $ANTLR start synpred182_pollen
    public final void synpred182_pollen_fragment() throws RecognitionException {   
        // pollen.g:771:4: ( typeName varDeclList )
        // pollen.g:771:4: typeName varDeclList
        {
        pushFollow(FOLLOW_typeName_in_synpred182_pollen4757);
        typeName();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_varDeclList_in_synpred182_pollen4759);
        varDeclList();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred182_pollen

    // $ANTLR start synpred183_pollen
    public final void synpred183_pollen_fragment() throws RecognitionException {   
        // pollen.g:772:13: ( ',' varInit )
        // pollen.g:772:13: ',' varInit
        {
        match(input,130,FOLLOW_130_in_synpred183_pollen4767); if (state.failed) return ;
        pushFollow(FOLLOW_varInit_in_synpred183_pollen4769);
        varInit();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred183_pollen

    // $ANTLR start synpred193_pollen
    public final void synpred193_pollen_fragment() throws RecognitionException {   
        // pollen.g:792:9: ( '.' IDENT )
        // pollen.g:792:9: '.' IDENT
        {
        match(input,168,FOLLOW_168_in_synpred193_pollen4927); if (state.failed) return ;
        match(input,IDENT,FOLLOW_IDENT_in_synpred193_pollen4942); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred193_pollen

    // $ANTLR start synpred205_pollen
    public final void synpred205_pollen_fragment() throws RecognitionException {   
        // pollen.g:831:11: ( NL )
        // pollen.g:831:11: NL
        {
        match(input,NL,FOLLOW_NL_in_synpred205_pollen5187); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred205_pollen

    // $ANTLR start synpred208_pollen
    public final void synpred208_pollen_fragment() throws RecognitionException {   
        // pollen.g:842:12: ( NL )
        // pollen.g:842:12: NL
        {
        match(input,NL,FOLLOW_NL_in_synpred208_pollen5259); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred208_pollen

    // $ANTLR start synpred210_pollen
    public final void synpred210_pollen_fragment() throws RecognitionException {   
        // pollen.g:843:5: ( NL )
        // pollen.g:843:5: NL
        {
        match(input,NL,FOLLOW_NL_in_synpred210_pollen5270); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred210_pollen

    // $ANTLR start synpred211_pollen
    public final void synpred211_pollen_fragment() throws RecognitionException {   
        // pollen.g:843:4: ( ( NL )+ )
        // pollen.g:843:4: ( NL )+
        {
        // pollen.g:843:4: ( NL )+
        int cnt133=0;
        loop133:
        do {
            int alt133=2;
            int LA133_0 = input.LA(1);

            if ( (LA133_0==NL) ) {
                alt133=1;
            }


            switch (alt133) {
        	case 1 :
        	    // pollen.g:843:5: NL
        	    {
        	    match(input,NL,FOLLOW_NL_in_synpred211_pollen5270); if (state.failed) return ;

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
    // $ANTLR end synpred211_pollen

    // $ANTLR start synpred213_pollen
    public final void synpred213_pollen_fragment() throws RecognitionException {   
        // pollen.g:844:4: ( ( NL )* '}' )
        // pollen.g:844:5: ( NL )* '}'
        {
        // pollen.g:844:5: ( NL )*
        loop134:
        do {
            int alt134=2;
            int LA134_0 = input.LA(1);

            if ( (LA134_0==NL) ) {
                alt134=1;
            }


            switch (alt134) {
        	case 1 :
        	    // pollen.g:844:6: NL
        	    {
        	    match(input,NL,FOLLOW_NL_in_synpred213_pollen5282); if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop134;
            }
        } while (true);

        match(input,139,FOLLOW_139_in_synpred213_pollen5286); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred213_pollen

    // $ANTLR start synpred214_pollen
    public final void synpred214_pollen_fragment() throws RecognitionException {   
        // pollen.g:844:20: ( NL )
        // pollen.g:844:20: NL
        {
        match(input,NL,FOLLOW_NL_in_synpred214_pollen5292); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred214_pollen

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
    public final boolean synpred114_pollen() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred114_pollen_fragment(); // can never throw exception
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
    public final boolean synpred17_pollen() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred17_pollen_fragment(); // can never throw exception
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
    public final boolean synpred61_pollen() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred61_pollen_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred55_pollen() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred55_pollen_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred33_pollen() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred33_pollen_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred31_pollen() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred31_pollen_fragment(); // can never throw exception
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
    public final boolean synpred91_pollen() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred91_pollen_fragment(); // can never throw exception
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
    public final boolean synpred152_pollen() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred152_pollen_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred7_pollen() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_pollen_fragment(); // can never throw exception
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
    public final boolean synpred157_pollen() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred157_pollen_fragment(); // can never throw exception
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
    public final boolean synpred12_pollen() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred12_pollen_fragment(); // can never throw exception
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
    public final boolean synpred10_pollen() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred10_pollen_fragment(); // can never throw exception
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
    public final boolean synpred193_pollen() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred193_pollen_fragment(); // can never throw exception
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
    public final boolean synpred3_pollen() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_pollen_fragment(); // can never throw exception
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
    public final boolean synpred23_pollen() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred23_pollen_fragment(); // can never throw exception
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
    public final boolean synpred101_pollen() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred101_pollen_fragment(); // can never throw exception
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
    public final boolean synpred205_pollen() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred205_pollen_fragment(); // can never throw exception
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
    public final boolean synpred166_pollen() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred166_pollen_fragment(); // can never throw exception
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
    public final boolean synpred100_pollen() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred100_pollen_fragment(); // can never throw exception
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
    public final boolean synpred160_pollen() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred160_pollen_fragment(); // can never throw exception
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
    public final boolean synpred176_pollen() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred176_pollen_fragment(); // can never throw exception
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


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA3 dfa3 = new DFA3(this);
    protected DFA9 dfa9 = new DFA9(this);
    protected DFA10 dfa10 = new DFA10(this);
    protected DFA12 dfa12 = new DFA12(this);
    protected DFA13 dfa13 = new DFA13(this);
    protected DFA19 dfa19 = new DFA19(this);
    protected DFA22 dfa22 = new DFA22(this);
    protected DFA23 dfa23 = new DFA23(this);
    protected DFA25 dfa25 = new DFA25(this);
    protected DFA26 dfa26 = new DFA26(this);
    protected DFA60 dfa60 = new DFA60(this);
    protected DFA82 dfa82 = new DFA82(this);
    protected DFA117 dfa117 = new DFA117(this);
    static final String DFA2_eotS =
        "\13\uffff";
    static final String DFA2_eofS =
        "\1\3\12\uffff";
    static final String DFA2_minS =
        "\1\160\12\uffff";
    static final String DFA2_maxS =
        "\1\u0088\12\uffff";
    static final String DFA2_acceptS =
        "\1\uffff\1\1\1\uffff\1\2\7\uffff";
    static final String DFA2_specialS =
        "\13\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\3\16\uffff\3\3\1\uffff\2\3\2\1\1\uffff\1\3",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
    static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
    static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
    static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
    static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
    static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
    static final short[][] DFA2_transition;

    static {
        int numStates = DFA2_transitionS.length;
        DFA2_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
        }
    }

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = DFA2_eot;
            this.eof = DFA2_eof;
            this.min = DFA2_min;
            this.max = DFA2_max;
            this.accept = DFA2_accept;
            this.special = DFA2_special;
            this.transition = DFA2_transition;
        }
        public String getDescription() {
            return "212:5: ( importList )?";
        }
    }
    static final String DFA3_eotS =
        "\12\uffff";
    static final String DFA3_eofS =
        "\1\2\11\uffff";
    static final String DFA3_minS =
        "\1\160\1\0\10\uffff";
    static final String DFA3_maxS =
        "\1\u0088\1\0\10\uffff";
    static final String DFA3_acceptS =
        "\2\uffff\1\2\6\uffff\1\1";
    static final String DFA3_specialS =
        "\1\uffff\1\0\10\uffff}>";
    static final String[] DFA3_transitionS = {
            "\1\1\16\uffff\3\2\1\uffff\2\2\3\uffff\1\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
    static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
    static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
    static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
    static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
    static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
    static final short[][] DFA3_transition;

    static {
        int numStates = DFA3_transitionS.length;
        DFA3_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
        }
    }

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = DFA3_eot;
            this.eof = DFA3_eof;
            this.min = DFA3_min;
            this.max = DFA3_max;
            this.accept = DFA3_accept;
            this.special = DFA3_special;
            this.transition = DFA3_transition;
        }
        public String getDescription() {
            return "213:7: ( stmtInjection )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA3_1 = input.LA(1);

                         
                        int index3_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_pollen()) ) {s = 9;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index3_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 3, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA9_eotS =
        "\16\uffff";
    static final String DFA9_eofS =
        "\16\uffff";
    static final String DFA9_minS =
        "\1\125\15\uffff";
    static final String DFA9_maxS =
        "\1\u00c7\15\uffff";
    static final String DFA9_acceptS =
        "\1\uffff\1\2\1\uffff\1\1\12\uffff";
    static final String DFA9_specialS =
        "\16\uffff}>";
    static final String[] DFA9_transitionS = {
            "\1\1\1\3\31\uffff\1\3\16\uffff\1\3\1\uffff\1\3\11\uffff\1\1"+
            "\24\uffff\1\3\3\uffff\3\3\26\uffff\13\3",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
    static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
    static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
    static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
    static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
    static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
    static final short[][] DFA9_transition;

    static {
        int numStates = DFA9_transitionS.length;
        DFA9_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
        }
    }

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = DFA9_eot;
            this.eof = DFA9_eof;
            this.min = DFA9_min;
            this.max = DFA9_max;
            this.accept = DFA9_accept;
            this.special = DFA9_special;
            this.transition = DFA9_transition;
        }
        public String getDescription() {
            return "()* loopback of 248:13: ( classFeature )*";
        }
    }
    static final String DFA10_eotS =
        "\14\uffff";
    static final String DFA10_eofS =
        "\14\uffff";
    static final String DFA10_minS =
        "\1\126\1\uffff\3\0\7\uffff";
    static final String DFA10_maxS =
        "\1\u00c7\1\uffff\3\0\7\uffff";
    static final String DFA10_acceptS =
        "\1\uffff\1\1\4\uffff\1\2\1\3\2\uffff\1\4\1\5";
    static final String DFA10_specialS =
        "\2\uffff\1\0\1\1\1\2\7\uffff}>";
    static final String[] DFA10_transitionS = {
            "\1\4\31\uffff\1\13\16\uffff\1\12\1\uffff\1\6\36\uffff\1\1\3"+
            "\uffff\1\1\1\2\1\7\26\uffff\2\7\11\3",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
    static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
    static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
    static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
    static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
    static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
    static final short[][] DFA10_transition;

    static {
        int numStates = DFA10_transitionS.length;
        DFA10_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
        }
    }

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = DFA10_eot;
            this.eof = DFA10_eof;
            this.min = DFA10_min;
            this.max = DFA10_max;
            this.accept = DFA10_accept;
            this.special = DFA10_special;
            this.transition = DFA10_transition;
        }
        public String getDescription() {
            return "251:1: classFeature : ( fcnDefinition | enumDefinition | varDeclaration | classDefinition | stmtInjection );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA10_2 = input.LA(1);

                         
                        int index10_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_pollen()) ) {s = 1;}

                        else if ( (synpred12_pollen()) ) {s = 7;}

                         
                        input.seek(index10_2);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA10_3 = input.LA(1);

                         
                        int index10_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred10_pollen()||(synpred10_pollen()&&(input.LT(1).getText().equals(ti.getTypeName()) )))) ) {s = 1;}

                        else if ( (synpred12_pollen()) ) {s = 7;}

                         
                        input.seek(index10_3);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA10_4 = input.LA(1);

                         
                        int index10_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred10_pollen()||(synpred10_pollen()&&(input.LT(1).getText().equals(ti.getTypeName()) )))) ) {s = 1;}

                        else if ( (synpred12_pollen()) ) {s = 7;}

                         
                        input.seek(index10_4);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 10, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA12_eotS =
        "\16\uffff";
    static final String DFA12_eofS =
        "\16\uffff";
    static final String DFA12_minS =
        "\1\125\15\uffff";
    static final String DFA12_maxS =
        "\1\u00c7\15\uffff";
    static final String DFA12_acceptS =
        "\1\uffff\1\2\1\uffff\1\1\12\uffff";
    static final String DFA12_specialS =
        "\16\uffff}>";
    static final String[] DFA12_transitionS = {
            "\1\1\1\3\31\uffff\1\3\16\uffff\1\3\1\uffff\1\3\11\uffff\1\1"+
            "\24\uffff\1\3\3\uffff\3\3\26\uffff\13\3",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "()* loopback of 262:14: ( moduleFeature )*";
        }
    }
    static final String DFA13_eotS =
        "\14\uffff";
    static final String DFA13_eofS =
        "\14\uffff";
    static final String DFA13_minS =
        "\1\126\1\uffff\3\0\7\uffff";
    static final String DFA13_maxS =
        "\1\u00c7\1\uffff\3\0\7\uffff";
    static final String DFA13_acceptS =
        "\1\uffff\1\1\4\uffff\1\2\2\uffff\1\3\1\4\1\5";
    static final String DFA13_specialS =
        "\2\uffff\1\0\1\1\1\2\7\uffff}>";
    static final String[] DFA13_transitionS = {
            "\1\4\31\uffff\1\13\16\uffff\1\12\1\uffff\1\11\36\uffff\1\1\3"+
            "\uffff\1\1\1\2\1\6\26\uffff\2\6\11\3",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "265:1: moduleFeature : ( fcnDefinition | varDeclaration | enumDefinition | classDefinition | stmtInjection );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA13_2 = input.LA(1);

                         
                        int index13_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_pollen()) ) {s = 1;}

                        else if ( (synpred17_pollen()) ) {s = 6;}

                         
                        input.seek(index13_2);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA13_3 = input.LA(1);

                         
                        int index13_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred16_pollen()||(synpred16_pollen()&&(input.LT(1).getText().equals(ti.getTypeName()) )))) ) {s = 1;}

                        else if ( (synpred17_pollen()) ) {s = 6;}

                         
                        input.seek(index13_3);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA13_4 = input.LA(1);

                         
                        int index13_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred16_pollen()||(synpred16_pollen()&&(input.LT(1).getText().equals(ti.getTypeName()) )))) ) {s = 1;}

                        else if ( (synpred17_pollen()) ) {s = 6;}

                         
                        input.seek(index13_4);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 13, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA19_eotS =
        "\12\uffff";
    static final String DFA19_eofS =
        "\12\uffff";
    static final String DFA19_minS =
        "\1\125\11\uffff";
    static final String DFA19_maxS =
        "\1\u00c7\11\uffff";
    static final String DFA19_acceptS =
        "\1\uffff\1\2\1\uffff\1\1\6\uffff";
    static final String DFA19_specialS =
        "\12\uffff}>";
    static final String[] DFA19_transitionS = {
            "\1\1\1\3\31\uffff\1\3\20\uffff\1\3\11\uffff\1\1\24\uffff\1\3"+
            "\3\uffff\2\3\31\uffff\11\3",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA19_eot = DFA.unpackEncodedString(DFA19_eotS);
    static final short[] DFA19_eof = DFA.unpackEncodedString(DFA19_eofS);
    static final char[] DFA19_min = DFA.unpackEncodedStringToUnsignedChars(DFA19_minS);
    static final char[] DFA19_max = DFA.unpackEncodedStringToUnsignedChars(DFA19_maxS);
    static final short[] DFA19_accept = DFA.unpackEncodedString(DFA19_acceptS);
    static final short[] DFA19_special = DFA.unpackEncodedString(DFA19_specialS);
    static final short[][] DFA19_transition;

    static {
        int numStates = DFA19_transitionS.length;
        DFA19_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA19_transition[i] = DFA.unpackEncodedString(DFA19_transitionS[i]);
        }
    }

    class DFA19 extends DFA {

        public DFA19(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 19;
            this.eot = DFA19_eot;
            this.eof = DFA19_eof;
            this.min = DFA19_min;
            this.max = DFA19_max;
            this.accept = DFA19_accept;
            this.special = DFA19_special;
            this.transition = DFA19_transition;
        }
        public String getDescription() {
            return "()* loopback of 303:13: ( protocolFeature )*";
        }
    }
    static final String DFA22_eotS =
        "\16\uffff";
    static final String DFA22_eofS =
        "\16\uffff";
    static final String DFA22_minS =
        "\1\125\15\uffff";
    static final String DFA22_maxS =
        "\1\u00c7\15\uffff";
    static final String DFA22_acceptS =
        "\1\uffff\1\2\1\uffff\1\1\12\uffff";
    static final String DFA22_specialS =
        "\16\uffff}>";
    static final String[] DFA22_transitionS = {
            "\1\1\1\3\31\uffff\1\3\15\uffff\1\3\2\uffff\1\3\11\uffff\1\1"+
            "\24\uffff\1\3\3\uffff\3\3\26\uffff\13\3",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA22_eot = DFA.unpackEncodedString(DFA22_eotS);
    static final short[] DFA22_eof = DFA.unpackEncodedString(DFA22_eofS);
    static final char[] DFA22_min = DFA.unpackEncodedStringToUnsignedChars(DFA22_minS);
    static final char[] DFA22_max = DFA.unpackEncodedStringToUnsignedChars(DFA22_maxS);
    static final short[] DFA22_accept = DFA.unpackEncodedString(DFA22_acceptS);
    static final short[] DFA22_special = DFA.unpackEncodedString(DFA22_specialS);
    static final short[][] DFA22_transition;

    static {
        int numStates = DFA22_transitionS.length;
        DFA22_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA22_transition[i] = DFA.unpackEncodedString(DFA22_transitionS[i]);
        }
    }

    class DFA22 extends DFA {

        public DFA22(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 22;
            this.eot = DFA22_eot;
            this.eof = DFA22_eof;
            this.min = DFA22_min;
            this.max = DFA22_max;
            this.accept = DFA22_accept;
            this.special = DFA22_special;
            this.transition = DFA22_transition;
        }
        public String getDescription() {
            return "()* loopback of 319:13: ( compositionFeature )*";
        }
    }
    static final String DFA23_eotS =
        "\14\uffff";
    static final String DFA23_eofS =
        "\14\uffff";
    static final String DFA23_minS =
        "\1\126\2\uffff\3\0\6\uffff";
    static final String DFA23_maxS =
        "\1\u00c7\2\uffff\3\0\6\uffff";
    static final String DFA23_acceptS =
        "\1\uffff\1\1\1\2\4\uffff\1\3\1\4\2\uffff\1\5";
    static final String DFA23_specialS =
        "\3\uffff\1\0\1\1\1\2\6\uffff}>";
    static final String[] DFA23_transitionS = {
            "\1\5\31\uffff\1\13\15\uffff\1\1\2\uffff\1\7\36\uffff\1\2\3\uffff"+
            "\1\2\1\3\1\10\26\uffff\2\10\11\4",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA23_eot = DFA.unpackEncodedString(DFA23_eotS);
    static final short[] DFA23_eof = DFA.unpackEncodedString(DFA23_eofS);
    static final char[] DFA23_min = DFA.unpackEncodedStringToUnsignedChars(DFA23_minS);
    static final char[] DFA23_max = DFA.unpackEncodedStringToUnsignedChars(DFA23_maxS);
    static final short[] DFA23_accept = DFA.unpackEncodedString(DFA23_acceptS);
    static final short[] DFA23_special = DFA.unpackEncodedString(DFA23_specialS);
    static final short[][] DFA23_transition;

    static {
        int numStates = DFA23_transitionS.length;
        DFA23_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA23_transition[i] = DFA.unpackEncodedString(DFA23_transitionS[i]);
        }
    }

    class DFA23 extends DFA {

        public DFA23(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 23;
            this.eot = DFA23_eot;
            this.eof = DFA23_eof;
            this.min = DFA23_min;
            this.max = DFA23_max;
            this.accept = DFA23_accept;
            this.special = DFA23_special;
            this.transition = DFA23_transition;
        }
        public String getDescription() {
            return "322:1: compositionFeature : ( exportList | fcnDefinitionHost | enumDefinition | varDeclaration | stmtInjection );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA23_3 = input.LA(1);

                         
                        int index23_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred31_pollen()) ) {s = 2;}

                        else if ( (synpred33_pollen()) ) {s = 8;}

                         
                        input.seek(index23_3);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA23_4 = input.LA(1);

                         
                        int index23_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred31_pollen()||(synpred31_pollen()&&(input.LT(1).getText().equals(ti.getTypeName()) )))) ) {s = 2;}

                        else if ( (synpred33_pollen()) ) {s = 8;}

                         
                        input.seek(index23_4);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA23_5 = input.LA(1);

                         
                        int index23_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred31_pollen()||(synpred31_pollen()&&(input.LT(1).getText().equals(ti.getTypeName()) )))) ) {s = 2;}

                        else if ( (synpred33_pollen()) ) {s = 8;}

                         
                        input.seek(index23_5);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 23, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA25_eotS =
        "\17\uffff";
    static final String DFA25_eofS =
        "\1\2\16\uffff";
    static final String DFA25_minS =
        "\1\125\16\uffff";
    static final String DFA25_maxS =
        "\1\u008a\16\uffff";
    static final String DFA25_acceptS =
        "\1\uffff\1\1\1\2\14\uffff";
    static final String DFA25_specialS =
        "\17\uffff}>";
    static final String[] DFA25_transitionS = {
            "\1\2\26\uffff\1\2\3\uffff\1\2\16\uffff\3\2\1\uffff\6\2\1\uffff"+
            "\1\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA25_eot = DFA.unpackEncodedString(DFA25_eotS);
    static final short[] DFA25_eof = DFA.unpackEncodedString(DFA25_eofS);
    static final char[] DFA25_min = DFA.unpackEncodedStringToUnsignedChars(DFA25_minS);
    static final char[] DFA25_max = DFA.unpackEncodedStringToUnsignedChars(DFA25_maxS);
    static final short[] DFA25_accept = DFA.unpackEncodedString(DFA25_acceptS);
    static final short[] DFA25_special = DFA.unpackEncodedString(DFA25_specialS);
    static final short[][] DFA25_transition;

    static {
        int numStates = DFA25_transitionS.length;
        DFA25_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA25_transition[i] = DFA.unpackEncodedString(DFA25_transitionS[i]);
        }
    }

    class DFA25 extends DFA {

        public DFA25(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 25;
            this.eot = DFA25_eot;
            this.eof = DFA25_eof;
            this.min = DFA25_min;
            this.max = DFA25_max;
            this.accept = DFA25_accept;
            this.special = DFA25_special;
            this.transition = DFA25_transition;
        }
        public String getDescription() {
            return "331:27: ( metaArguments )?";
        }
    }
    static final String DFA26_eotS =
        "\16\uffff";
    static final String DFA26_eofS =
        "\1\2\15\uffff";
    static final String DFA26_minS =
        "\1\125\15\uffff";
    static final String DFA26_maxS =
        "\1\u0088\15\uffff";
    static final String DFA26_acceptS =
        "\1\uffff\1\1\1\2\13\uffff";
    static final String DFA26_specialS =
        "\16\uffff}>";
    static final String[] DFA26_transitionS = {
            "\1\2\26\uffff\1\2\3\uffff\1\2\16\uffff\3\2\1\uffff\4\2\1\1\1"+
            "\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA26_eot = DFA.unpackEncodedString(DFA26_eotS);
    static final short[] DFA26_eof = DFA.unpackEncodedString(DFA26_eofS);
    static final char[] DFA26_min = DFA.unpackEncodedStringToUnsignedChars(DFA26_minS);
    static final char[] DFA26_max = DFA.unpackEncodedStringToUnsignedChars(DFA26_maxS);
    static final short[] DFA26_accept = DFA.unpackEncodedString(DFA26_acceptS);
    static final short[] DFA26_special = DFA.unpackEncodedString(DFA26_specialS);
    static final short[][] DFA26_transition;

    static {
        int numStates = DFA26_transitionS.length;
        DFA26_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA26_transition[i] = DFA.unpackEncodedString(DFA26_transitionS[i]);
        }
    }

    class DFA26 extends DFA {

        public DFA26(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 26;
            this.eot = DFA26_eot;
            this.eof = DFA26_eof;
            this.min = DFA26_min;
            this.max = DFA26_max;
            this.accept = DFA26_accept;
            this.special = DFA26_special;
            this.transition = DFA26_transition;
        }
        public String getDescription() {
            return "332:10: ( importAs )?";
        }
    }
    static final String DFA60_eotS =
        "\13\uffff";
    static final String DFA60_eofS =
        "\13\uffff";
    static final String DFA60_minS =
        "\1\126\12\uffff";
    static final String DFA60_maxS =
        "\1\u00ca\12\uffff";
    static final String DFA60_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12";
    static final String DFA60_specialS =
        "\13\uffff}>";
    static final String[] DFA60_transitionS = {
            "\1\11\1\uffff\3\1\16\uffff\1\5\1\6\2\uffff\3\1\1\2\33\uffff"+
            "\1\4\10\uffff\1\10\12\uffff\1\7\1\uffff\2\12\2\uffff\2\11\40"+
            "\uffff\2\1\1\3",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA60_eot = DFA.unpackEncodedString(DFA60_eotS);
    static final short[] DFA60_eof = DFA.unpackEncodedString(DFA60_eofS);
    static final char[] DFA60_min = DFA.unpackEncodedStringToUnsignedChars(DFA60_minS);
    static final char[] DFA60_max = DFA.unpackEncodedStringToUnsignedChars(DFA60_maxS);
    static final short[] DFA60_accept = DFA.unpackEncodedString(DFA60_acceptS);
    static final short[] DFA60_special = DFA.unpackEncodedString(DFA60_specialS);
    static final short[][] DFA60_transition;

    static {
        int numStates = DFA60_transitionS.length;
        DFA60_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA60_transition[i] = DFA.unpackEncodedString(DFA60_transitionS[i]);
        }
    }

    class DFA60 extends DFA {

        public DFA60(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 60;
            this.eot = DFA60_eot;
            this.eof = DFA60_eof;
            this.min = DFA60_min;
            this.max = DFA60_max;
            this.accept = DFA60_accept;
            this.special = DFA60_special;
            this.transition = DFA60_transition;
        }
        public String getDescription() {
            return "489:1: exprUnary : ( primitiveLit | injectionCode | nullLit | arrayLit | LOG_NOT expr | BIT_NOT expr | '(' expr ')' | '-' expr | varOrFcnOrArray ( ( '++' ) | ( '--' ) )? | ( ( '++' ) | ( '--' ) ) varOrFcnOrArray );";
        }
    }
    static final String DFA82_eotS =
        "\26\uffff";
    static final String DFA82_eofS =
        "\26\uffff";
    static final String DFA82_minS =
        "\1\126\2\uffff\1\0\11\uffff\1\0\4\uffff\1\0\3\uffff";
    static final String DFA82_maxS =
        "\1\u00ca\2\uffff\1\0\11\uffff\1\0\4\uffff\1\0\3\uffff";
    static final String DFA82_acceptS =
        "\1\uffff\1\6\1\17\1\uffff\1\1\1\20\1\21\1\10\1\11\1\5\1\21\1\2\1"+
        "\14\1\uffff\1\3\1\16\1\12\1\13\1\uffff\1\15\1\4\1\7";
    static final String DFA82_specialS =
        "\3\uffff\1\0\11\uffff\1\1\4\uffff\1\2\3\uffff}>";
    static final String[] DFA82_transitionS = {
            "\1\22\1\uffff\3\12\16\uffff\2\12\2\uffff\3\12\1\3\33\uffff\1"+
            "\12\10\uffff\1\12\12\uffff\1\12\1\uffff\2\12\1\uffff\1\2\1\22"+
            "\1\15\1\uffff\1\13\1\24\3\uffff\1\11\1\1\1\25\1\10\1\7\1\uffff"+
            "\1\20\2\uffff\1\21\1\17\1\14\2\uffff\1\23\13\2\3\12",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            ""
    };

    static final short[] DFA82_eot = DFA.unpackEncodedString(DFA82_eotS);
    static final short[] DFA82_eof = DFA.unpackEncodedString(DFA82_eofS);
    static final char[] DFA82_min = DFA.unpackEncodedStringToUnsignedChars(DFA82_minS);
    static final char[] DFA82_max = DFA.unpackEncodedStringToUnsignedChars(DFA82_maxS);
    static final short[] DFA82_accept = DFA.unpackEncodedString(DFA82_acceptS);
    static final short[] DFA82_special = DFA.unpackEncodedString(DFA82_specialS);
    static final short[][] DFA82_transition;

    static {
        int numStates = DFA82_transitionS.length;
        DFA82_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA82_transition[i] = DFA.unpackEncodedString(DFA82_transitionS[i]);
        }
    }

    class DFA82 extends DFA {

        public DFA82(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 82;
            this.eot = DFA82_eot;
            this.eof = DFA82_eof;
            this.min = DFA82_min;
            this.max = DFA82_max;
            this.accept = DFA82_accept;
            this.special = DFA82_special;
            this.transition = DFA82_transition;
        }
        public String getDescription() {
            return "616:1: stmt : ( stmtAssign delim | stmtAssert | stmtBind | stmtPrint | stmtReturn | stmtBreak | stmtContinue | stmtForEach | stmtFor | stmtSwitch | stmtDoWhile | stmtIf | stmtProvided | stmtWhile | varDeclaration | stmtInjection | expr delim );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA82_3 = input.LA(1);

                         
                        int index82_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred134_pollen()) ) {s = 4;}

                        else if ( (synpred149_pollen()) ) {s = 5;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index82_3);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA82_13 = input.LA(1);

                         
                        int index82_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred134_pollen()) ) {s = 4;}

                        else if ( (synpred136_pollen()) ) {s = 14;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index82_13);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA82_18 = input.LA(1);

                         
                        int index82_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred134_pollen()) ) {s = 4;}

                        else if ( (synpred136_pollen()) ) {s = 14;}

                        else if ( (synpred148_pollen()) ) {s = 2;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index82_18);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 82, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA117_eotS =
        "\66\uffff";
    static final String DFA117_eofS =
        "\1\14\65\uffff";
    static final String DFA117_minS =
        "\1\125\1\uffff\1\0\63\uffff";
    static final String DFA117_maxS =
        "\1\u00ca\1\uffff\1\0\63\uffff";
    static final String DFA117_acceptS =
        "\1\uffff\1\1\1\uffff\62\3\1\2";
    static final String DFA117_specialS =
        "\1\0\1\uffff\1\1\63\uffff}>";
    static final String[] DFA117_transitionS = {
            "\1\2\1\22\1\uffff\1\50\1\54\1\55\16\uffff\1\60\1\61\1\uffff"+
            "\1\1\1\51\1\52\1\53\1\5\15\uffff\1\16\1\10\1\7\1\13\1\27\1\11"+
            "\1\12\1\4\1\3\1\uffff\1\6\2\uffff\1\15\1\57\10\uffff\1\62\12"+
            "\uffff\1\23\1\uffff\1\63\1\64\1\17\1\20\1\26\1\32\1\uffff\1"+
            "\33\1\34\3\uffff\1\35\1\36\1\37\1\41\1\40\1\uffff\1\42\1\30"+
            "\1\31\1\43\1\46\1\44\2\uffff\1\45\1\24\1\25\11\21\2\47\1\56",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA117_eot = DFA.unpackEncodedString(DFA117_eotS);
    static final short[] DFA117_eof = DFA.unpackEncodedString(DFA117_eofS);
    static final char[] DFA117_min = DFA.unpackEncodedStringToUnsignedChars(DFA117_minS);
    static final char[] DFA117_max = DFA.unpackEncodedStringToUnsignedChars(DFA117_maxS);
    static final short[] DFA117_accept = DFA.unpackEncodedString(DFA117_acceptS);
    static final short[] DFA117_special = DFA.unpackEncodedString(DFA117_specialS);
    static final short[][] DFA117_transition;

    static {
        int numStates = DFA117_transitionS.length;
        DFA117_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA117_transition[i] = DFA.unpackEncodedString(DFA117_transitionS[i]);
        }
    }

    class DFA117 extends DFA {

        public DFA117(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 117;
            this.eot = DFA117_eot;
            this.eof = DFA117_eof;
            this.min = DFA117_min;
            this.max = DFA117_max;
            this.accept = DFA117_accept;
            this.special = DFA117_special;
            this.transition = DFA117_transition;
        }
        public String getDescription() {
            return "841:1: delim : ( ( SEMI ) ( NL )* -> | ( NL )+ -> | ( ( NL )* '}' )=> ( NL )* ->);";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA117_0 = input.LA(1);

                         
                        int index117_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA117_0==SEMI) ) {s = 1;}

                        else if ( (LA117_0==NL) ) {s = 2;}

                        else if ( (LA117_0==134) && (synpred213_pollen())) {s = 3;}

                        else if ( (LA117_0==133) && (synpred213_pollen())) {s = 4;}

                        else if ( (LA117_0==INJECT) && (synpred213_pollen())) {s = 5;}

                        else if ( (LA117_0==136) && (synpred213_pollen())) {s = 6;}

                        else if ( (LA117_0==128) && (synpred213_pollen())) {s = 7;}

                        else if ( (LA117_0==127) && (synpred213_pollen())) {s = 8;}

                        else if ( (LA117_0==131) && (synpred213_pollen())) {s = 9;}

                        else if ( (LA117_0==132) && (synpred213_pollen())) {s = 10;}

                        else if ( (LA117_0==129) && (synpred213_pollen())) {s = 11;}

                        else if ( (LA117_0==EOF) && (synpred213_pollen())) {s = 12;}

                        else if ( (LA117_0==139) && (synpred213_pollen())) {s = 13;}

                        else if ( (LA117_0==126) && (synpred213_pollen())) {s = 14;}

                        else if ( (LA117_0==164) && (synpred213_pollen())) {s = 15;}

                        else if ( (LA117_0==165) && (synpred213_pollen())) {s = 16;}

                        else if ( ((LA117_0>=191 && LA117_0<=199)) && (synpred213_pollen())) {s = 17;}

                        else if ( (LA117_0==IDENT) && (synpred213_pollen())) {s = 18;}

                        else if ( (LA117_0==160) && (synpred213_pollen())) {s = 19;}

                        else if ( (LA117_0==189) && (synpred213_pollen())) {s = 20;}

                        else if ( (LA117_0==190) && (synpred213_pollen())) {s = 21;}

                        else if ( (LA117_0==166) && (synpred213_pollen())) {s = 22;}

                        else if ( (LA117_0==130) && (synpred213_pollen())) {s = 23;}

                        else if ( (LA117_0==181) && (synpred213_pollen())) {s = 24;}

                        else if ( (LA117_0==182) && (synpred213_pollen())) {s = 25;}

                        else if ( (LA117_0==167) && (synpred213_pollen())) {s = 26;}

                        else if ( (LA117_0==169) && (synpred213_pollen())) {s = 27;}

                        else if ( (LA117_0==170) && (synpred213_pollen())) {s = 28;}

                        else if ( (LA117_0==174) && (synpred213_pollen())) {s = 29;}

                        else if ( (LA117_0==175) && (synpred213_pollen())) {s = 30;}

                        else if ( (LA117_0==176) && (synpred213_pollen())) {s = 31;}

                        else if ( (LA117_0==178) && (synpred213_pollen())) {s = 32;}

                        else if ( (LA117_0==177) && (synpred213_pollen())) {s = 33;}

                        else if ( (LA117_0==180) && (synpred213_pollen())) {s = 34;}

                        else if ( (LA117_0==183) && (synpred213_pollen())) {s = 35;}

                        else if ( (LA117_0==185) && (synpred213_pollen())) {s = 36;}

                        else if ( (LA117_0==188) && (synpred213_pollen())) {s = 37;}

                        else if ( (LA117_0==184) && (synpred213_pollen())) {s = 38;}

                        else if ( ((LA117_0>=200 && LA117_0<=201)) && (synpred213_pollen())) {s = 39;}

                        else if ( (LA117_0==INT_LIT) && (synpred213_pollen())) {s = 40;}

                        else if ( (LA117_0==OCT_LIT) && (synpred213_pollen())) {s = 41;}

                        else if ( (LA117_0==REAL_LIT) && (synpred213_pollen())) {s = 42;}

                        else if ( (LA117_0==HEX_LIT) && (synpred213_pollen())) {s = 43;}

                        else if ( (LA117_0==STRING) && (synpred213_pollen())) {s = 44;}

                        else if ( (LA117_0==CHAR) && (synpred213_pollen())) {s = 45;}

                        else if ( (LA117_0==202) && (synpred213_pollen())) {s = 46;}

                        else if ( (LA117_0==140) && (synpred213_pollen())) {s = 47;}

                        else if ( (LA117_0==LOG_NOT) && (synpred213_pollen())) {s = 48;}

                        else if ( (LA117_0==BIT_NOT) && (synpred213_pollen())) {s = 49;}

                        else if ( (LA117_0==149) && (synpred213_pollen())) {s = 50;}

                        else if ( (LA117_0==162) && (synpred213_pollen())) {s = 51;}

                        else if ( (LA117_0==163) && (synpred213_pollen())) {s = 52;}

                         
                        input.seek(index117_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA117_2 = input.LA(1);

                         
                        int index117_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred211_pollen()) ) {s = 53;}

                        else if ( (synpred213_pollen()) ) {s = 52;}

                         
                        input.seek(index117_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 117, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_NL_in_unit709 = new BitSet(new long[]{0x0000000000000000L,0xA001000000200000L,0x000000000000017BL});
    public static final BitSet FOLLOW_unitPackage_in_unit713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtPackage_in_unitPackage739 = new BitSet(new long[]{0x0000000000000000L,0x8001000000000000L,0x000000000000017BL});
    public static final BitSet FOLLOW_importList_in_unitPackage746 = new BitSet(new long[]{0x0000000000000000L,0x8001000000000000L,0x000000000000011BL});
    public static final BitSet FOLLOW_stmtInjection_in_unitPackage757 = new BitSet(new long[]{0x0000000000000000L,0x8001000000000000L,0x000000000000011BL});
    public static final BitSet FOLLOW_unitTypeDefinition_in_unitPackage768 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_stmtInjection_in_unitPackage779 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_unitPackage789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_125_in_stmtPackage799 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_qualName_in_stmtPackage801 = new BitSet(new long[]{0x0000000000000000L,0x0000100000200000L});
    public static final BitSet FOLLOW_delim_in_stmtPackage803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_126_in_stmtExport835 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_qualName_in_stmtExport838 = new BitSet(new long[]{0x0000000000000000L,0x0000100000200000L});
    public static final BitSet FOLLOW_delim_in_stmtExport840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtExport_in_exportList858 = new BitSet(new long[]{0x0000000000000002L,0x4000000000000000L});
    public static final BitSet FOLLOW_127_in_classDefinition892 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_classDef_in_classDefinition894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_classDef913 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L,0x0000000000008400L});
    public static final BitSet FOLLOW_implementsClause_in_classDef924 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L,0x0000000000008400L});
    public static final BitSet FOLLOW_braceOpen_in_classDef931 = new BitSet(new long[]{0x0000000000000000L,0x8001000000600000L,0xE00000710000091BL,0x00000000000000FFL});
    public static final BitSet FOLLOW_classFeature_in_classDef934 = new BitSet(new long[]{0x0000000000000000L,0x8001000000600000L,0xE00000710000091BL,0x00000000000000FFL});
    public static final BitSet FOLLOW_braceClose_in_classDef938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fcnDefinition_in_classFeature955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumDefinition_in_classFeature966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDeclaration_in_classFeature976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classDefinition_in_classFeature986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtInjection_in_classFeature996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_128_in_moduleDefinition1013 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_IDENT_in_moduleDefinition1015 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L,0x0000000000008400L});
    public static final BitSet FOLLOW_implementsClause_in_moduleDefinition1030 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L,0x0000000000008400L});
    public static final BitSet FOLLOW_braceOpen_in_moduleDefinition1039 = new BitSet(new long[]{0x0000000000000000L,0x8001000000600000L,0xE00000710000091BL,0x00000000000000FFL});
    public static final BitSet FOLLOW_moduleFeature_in_moduleDefinition1042 = new BitSet(new long[]{0x0000000000000000L,0x8001000000600000L,0xE00000710000091BL,0x00000000000000FFL});
    public static final BitSet FOLLOW_braceClose_in_moduleDefinition1046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fcnDefinition_in_moduleFeature1078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDeclaration_in_moduleFeature1087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumDefinition_in_moduleFeature1094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classDefinition_in_moduleFeature1101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtInjection_in_moduleFeature1107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_129_in_enumDefinition1120 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_enumDef_in_enumDefinition1122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_enumDef1152 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L,0x0000000000008400L});
    public static final BitSet FOLLOW_braceOpen_in_enumDef1162 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_enumList_in_enumDef1164 = new BitSet(new long[]{0x0000000000000000L,0x8001000000600000L,0xE00000710000091BL,0x00000000000000FFL});
    public static final BitSet FOLLOW_braceClose_in_enumDef1166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumElement_in_enumList1177 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_130_in_enumList1180 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_enumElement_in_enumList1183 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_enumElement1195 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_ASSIGN_in_enumElement1199 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_INT_LIT_in_enumElement1202 = new BitSet(new long[]{0x0000000000000000L,0x0000100000200000L});
    public static final BitSet FOLLOW_delim_in_enumElement1206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_enumElement1213 = new BitSet(new long[]{0x0000000000000000L,0x0000100000200000L});
    public static final BitSet FOLLOW_delim_in_enumElement1217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_131_in_protocolDefinition1229 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_IDENT_in_protocolDefinition1231 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L,0x000000000000C400L});
    public static final BitSet FOLLOW_extendsClause_in_protocolDefinition1239 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L,0x0000000000008400L});
    public static final BitSet FOLLOW_braceOpen_in_protocolDefinition1245 = new BitSet(new long[]{0x0000000000000000L,0x8001000000600000L,0xE00000710000091BL,0x00000000000000FFL});
    public static final BitSet FOLLOW_protocolFeature_in_protocolDefinition1248 = new BitSet(new long[]{0x0000000000000000L,0x8001000000600000L,0xE00000710000091BL,0x00000000000000FFL});
    public static final BitSet FOLLOW_braceClose_in_protocolDefinition1252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumDefinition_in_protocolFeature1286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fcnDeclaration_in_protocolFeature1296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtInjection_in_protocolFeature1307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_132_in_compositionDefinition1320 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_IDENT_in_compositionDefinition1322 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L,0x000000000000C400L});
    public static final BitSet FOLLOW_extendsClause_in_compositionDefinition1330 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L,0x0000000000008400L});
    public static final BitSet FOLLOW_braceOpen_in_compositionDefinition1337 = new BitSet(new long[]{0x0000000000000000L,0xC001000000600000L,0xE00000710000091BL,0x00000000000000FFL});
    public static final BitSet FOLLOW_compositionFeature_in_compositionDefinition1340 = new BitSet(new long[]{0x0000000000000000L,0xC001000000600000L,0xE00000710000091BL,0x00000000000000FFL});
    public static final BitSet FOLLOW_braceClose_in_compositionDefinition1344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exportList_in_compositionFeature1374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fcnDefinitionHost_in_compositionFeature1383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumDefinition_in_compositionFeature1391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDeclaration_in_compositionFeature1399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtInjection_in_compositionFeature1406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_importFrom_in_stmtImport1423 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_133_in_stmtImport1434 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_qualName_in_stmtImport1436 = new BitSet(new long[]{0x0000000000000000L,0x0000100000200000L,0x0000000000000480L});
    public static final BitSet FOLLOW_metaArguments_in_stmtImport1439 = new BitSet(new long[]{0x0000000000000000L,0x0000100000200000L,0x0000000000000080L});
    public static final BitSet FOLLOW_importAs_in_stmtImport1452 = new BitSet(new long[]{0x0000000000000000L,0x0000100000200000L});
    public static final BitSet FOLLOW_delim_in_stmtImport1455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_134_in_importFrom1491 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_qualName_in_importFrom1494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_135_in_importAs1507 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_qualName_in_importAs1510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtImport_in_importList1525 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000060L});
    public static final BitSet FOLLOW_stmtImport_in_importList1528 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000060L});
    public static final BitSet FOLLOW_136_in_meta1549 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L,0x0000000000008400L});
    public static final BitSet FOLLOW_braceOpen_in_meta1558 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x8000000000000200L,0x00000000000000FFL});
    public static final BitSet FOLLOW_metaFormalParameters_in_meta1560 = new BitSet(new long[]{0x0000000000000000L,0x8001000000600000L,0xE00000710000091BL,0x00000000000000FFL});
    public static final BitSet FOLLOW_braceClose_in_meta1562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_metaFormalParameter_in_metaFormalParameters1587 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_130_in_metaFormalParameters1591 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x8000000000000200L,0x00000000000000FFL});
    public static final BitSet FOLLOW_metaFormalParameter_in_metaFormalParameters1593 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_metaFormalParameterType_in_metaFormalParameter1616 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_IDENT_in_metaFormalParameter1618 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});
    public static final BitSet FOLLOW_ASSIGN_in_metaFormalParameter1621 = new BitSet(new long[]{0x0000000000000000L,0x0000E00007400000L,0x8000000000000000L,0x00000000000003FFL});
    public static final BitSet FOLLOW_metaArgument_in_metaFormalParameter1623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_137_in_metaFormalParameterType1652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_builtinType_in_metaFormalParameterType1659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_138_in_metaArguments1672 = new BitSet(new long[]{0x0000000000000000L,0x0000E00007400000L,0x8000000000000000L,0x00000000000003FFL});
    public static final BitSet FOLLOW_metaArgument_in_metaArguments1674 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000804L});
    public static final BitSet FOLLOW_130_in_metaArguments1678 = new BitSet(new long[]{0x0000000000000000L,0x0000E00007400000L,0x8000000000000000L,0x00000000000003FFL});
    public static final BitSet FOLLOW_metaArgument_in_metaArguments1680 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000804L});
    public static final BitSet FOLLOW_139_in_metaArguments1684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_138_in_metaArguments1700 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_139_in_metaArguments1702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numLit_in_metaArgument1731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolLit_in_metaArgument1737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_metaArgument1743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_in_metaArgument1749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeNameScalar_in_metaArgument1754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeNameScalar_in_typeName1768 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_140_in_typeName1771 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_141_in_typeName1773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_builtinType_in_typeNameScalar1788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_userTypeName_in_typeNameScalar1793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qualName_in_userTypeName1803 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_metaArguments_in_userTypeName1805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qualName_in_userTypeName1820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_meta_in_unitTypeDefinition1853 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L,0x000000000000011BL});
    public static final BitSet FOLLOW_moduleDefinition_in_unitTypeDefinition1875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classDefinition_in_unitTypeDefinition1896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_protocolDefinition_in_unitTypeDefinition1913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compositionDefinition_in_unitTypeDefinition1931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumDefinition_in_unitTypeDefinition1949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_142_in_extendsClause1974 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_IDENT_in_extendsClause1977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_143_in_implementsClause1996 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_IDENT_in_implementsClause1999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NL_in_braceClose2019 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L,0x0000000000000800L});
    public static final BitSet FOLLOW_139_in_braceClose2024 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
    public static final BitSet FOLLOW_NL_in_braceClose2028 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
    public static final BitSet FOLLOW_NL_in_braceCloseAtEOF2052 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L,0x0000000000000800L});
    public static final BitSet FOLLOW_139_in_braceCloseAtEOF2057 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
    public static final BitSet FOLLOW_NL_in_braceCloseAtEOF2061 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
    public static final BitSet FOLLOW_NL_in_braceOpen2086 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L,0x0000000000000400L});
    public static final BitSet FOLLOW_138_in_braceOpen2091 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
    public static final BitSet FOLLOW_NL_in_braceOpen2095 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
    public static final BitSet FOLLOW_set_in_equalityOp0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_relationalOp0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_shiftOp0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_addSubOp0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_assignOp0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_multDivModOp0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LOG_NOT_in_logicalNotOp2258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BIT_NOT_in_bitwiseNotOp2269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_exprList2280 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_130_in_exprList2283 = new BitSet(new long[]{0x0000000000000000L,0x0001E60007400000L,0x000000CD00201000L,0x0000000000000700L});
    public static final BitSet FOLLOW_expr_in_exprList2285 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_exprLogicalOr_in_expr2309 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_153_in_expr2311 = new BitSet(new long[]{0x0000000000000000L,0x0001E60007400000L,0x000000CD00201000L,0x0000000000000700L});
    public static final BitSet FOLLOW_expr_in_expr2313 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_154_in_expr2315 = new BitSet(new long[]{0x0000000000000000L,0x0001E60007400000L,0x000000CD00201000L,0x0000000000000700L});
    public static final BitSet FOLLOW_expr_in_expr2317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exprLogicalOr_in_expr2334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exprLogicalAnd_in_exprLogicalOr2358 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_155_in_exprLogicalOr2361 = new BitSet(new long[]{0x0000000000000000L,0x0001E60007400000L,0x000000CD00201000L,0x0000000000000700L});
    public static final BitSet FOLLOW_exprLogicalAnd_in_exprLogicalOr2363 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_exprBitwiseOr_in_exprLogicalAnd2375 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_156_in_exprLogicalAnd2378 = new BitSet(new long[]{0x0000000000000000L,0x0001E60007400000L,0x000000CD00201000L,0x0000000000000700L});
    public static final BitSet FOLLOW_exprBitwiseOr_in_exprLogicalAnd2380 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_exprBitwiseXor_in_exprBitwiseOr2392 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_157_in_exprBitwiseOr2395 = new BitSet(new long[]{0x0000000000000000L,0x0001E60007400000L,0x000000CD00201000L,0x0000000000000700L});
    public static final BitSet FOLLOW_exprBitwiseXor_in_exprBitwiseOr2397 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_exprBitwiseAnd_in_exprBitwiseXor2409 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_158_in_exprBitwiseXor2412 = new BitSet(new long[]{0x0000000000000000L,0x0001E60007400000L,0x000000CD00201000L,0x0000000000000700L});
    public static final BitSet FOLLOW_exprBitwiseAnd_in_exprBitwiseXor2414 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_exprEquality_in_exprBitwiseAnd2426 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_159_in_exprBitwiseAnd2429 = new BitSet(new long[]{0x0000000000000000L,0x0001E60007400000L,0x000000CD00201000L,0x0000000000000700L});
    public static final BitSet FOLLOW_exprEquality_in_exprBitwiseAnd2431 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_exprRelational_in_exprEquality2443 = new BitSet(new long[]{0x0000000000000002L,0x0000000018000000L});
    public static final BitSet FOLLOW_equalityOp_in_exprEquality2447 = new BitSet(new long[]{0x0000000000000000L,0x0001E60007400000L,0x000000CD00201000L,0x0000000000000700L});
    public static final BitSet FOLLOW_exprRelational_in_exprEquality2449 = new BitSet(new long[]{0x0000000000000002L,0x0000000018000000L});
    public static final BitSet FOLLOW_exprShift_in_exprRelational2461 = new BitSet(new long[]{0x0000000000000002L,0x0000000060000000L,0x0000000000030000L});
    public static final BitSet FOLLOW_relationalOp_in_exprRelational2466 = new BitSet(new long[]{0x0000000000000000L,0x0001E60007400000L,0x000000CD00201000L,0x0000000000000700L});
    public static final BitSet FOLLOW_exprShift_in_exprRelational2468 = new BitSet(new long[]{0x0000000000000002L,0x0000000060000000L,0x0000000000030000L});
    public static final BitSet FOLLOW_exprAddSub_in_exprShift2481 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x00000000000C0000L});
    public static final BitSet FOLLOW_shiftOp_in_exprShift2485 = new BitSet(new long[]{0x0000000000000000L,0x0001E60007400000L,0x000000CD00201000L,0x0000000000000700L});
    public static final BitSet FOLLOW_exprAddSub_in_exprShift2488 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x00000000000C0000L});
    public static final BitSet FOLLOW_exprMultDiv_in_exprAddSub2501 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000300000L});
    public static final BitSet FOLLOW_addSubOp_in_exprAddSub2504 = new BitSet(new long[]{0x0000000000000000L,0x0001E60007400000L,0x000000CD00201000L,0x0000000000000700L});
    public static final BitSet FOLLOW_exprMultDiv_in_exprAddSub2506 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000300000L});
    public static final BitSet FOLLOW_exprUnary_in_exprMultDiv2518 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000001C00000L});
    public static final BitSet FOLLOW_multDivModOp_in_exprMultDiv2521 = new BitSet(new long[]{0x0000000000000000L,0x0001E60007400000L,0x000000CD00201000L,0x0000000000000700L});
    public static final BitSet FOLLOW_exprUnary_in_exprMultDiv2523 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000001C00000L});
    public static final BitSet FOLLOW_primitiveLit_in_exprUnary2535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_injectionCode_in_exprUnary2540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nullLit_in_exprUnary2545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayLit_in_exprUnary2550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LOG_NOT_in_exprUnary2555 = new BitSet(new long[]{0x0000000000000000L,0x0001E60007400000L,0x000000CD00201000L,0x0000000000000700L});
    public static final BitSet FOLLOW_expr_in_exprUnary2557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BIT_NOT_in_exprUnary2562 = new BitSet(new long[]{0x0000000000000000L,0x0001E60007400000L,0x000000CD00201000L,0x0000000000000700L});
    public static final BitSet FOLLOW_expr_in_exprUnary2564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_160_in_exprUnary2569 = new BitSet(new long[]{0x0000000000000000L,0x0001E60007400000L,0x000000CD00201000L,0x0000000000000700L});
    public static final BitSet FOLLOW_expr_in_exprUnary2571 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_161_in_exprUnary2573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_149_in_exprUnary2578 = new BitSet(new long[]{0x0000000000000000L,0x0001E60007400000L,0x000000CD00201000L,0x0000000000000700L});
    public static final BitSet FOLLOW_expr_in_exprUnary2580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varOrFcnOrArray_in_exprUnary2585 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000C00000000L});
    public static final BitSet FOLLOW_162_in_exprUnary2589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_163_in_exprUnary2595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_162_in_exprUnary2606 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L,0x000000C000000000L});
    public static final BitSet FOLLOW_163_in_exprUnary2612 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L,0x000000C000000000L});
    public static final BitSet FOLLOW_varOrFcnOrArray_in_exprUnary2616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_164_in_fcnDefinition2636 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L,0x8000003100000000L,0x00000000000000FFL});
    public static final BitSet FOLLOW_165_in_fcnDefinition2647 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L,0x8000003100000000L,0x00000000000000FFL});
    public static final BitSet FOLLOW_fcnType_fcnName_in_fcnDefinition2657 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_fcnFormalParameterList_in_fcnDefinition2659 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L,0x0000000000008400L});
    public static final BitSet FOLLOW_fcnBody_in_fcnDefinition2661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_164_in_fcnDefinitionHost2697 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L,0x8000003100000000L,0x00000000000000FFL});
    public static final BitSet FOLLOW_165_in_fcnDefinitionHost2702 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L,0x8000003100000000L,0x00000000000000FFL});
    public static final BitSet FOLLOW_fcnType_fcnName_in_fcnDefinitionHost2713 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_fcnFormalParameterList_in_fcnDefinitionHost2716 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L,0x0000000000008400L});
    public static final BitSet FOLLOW_fcnBody_in_fcnDefinitionHost2718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_164_in_fcnAttr2755 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_165_in_fcnAttr2766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_braceOpen_in_fcnBody2782 = new BitSet(new long[]{0x0000000000000000L,0x8001E60007600000L,0xF397C6FD0020191BL,0x00000000000007FFL});
    public static final BitSet FOLLOW_stmts_in_fcnBody2785 = new BitSet(new long[]{0x0000000000000000L,0x8001000000600000L,0xE00000710000091BL,0x00000000000000FFL});
    public static final BitSet FOLLOW_braceClose_in_fcnBody2789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_164_in_fcnDeclaration2821 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L,0x8000003100000000L,0x00000000000000FFL});
    public static final BitSet FOLLOW_165_in_fcnDeclaration2832 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L,0x8000003100000000L,0x00000000000000FFL});
    public static final BitSet FOLLOW_fcnType_fcnName_in_fcnDeclaration2842 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_fcnFormalParameterList_in_fcnDeclaration2845 = new BitSet(new long[]{0x0000000000000000L,0x0000100000200000L});
    public static final BitSet FOLLOW_delim_in_fcnDeclaration2848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeName_in_fcnType_fcnName2874 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_qualName_in_fcnType_fcnName2876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeName_in_fcnType_fcnName2915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qualName_in_fcnType_fcnName2945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fcnTypes_fcnName_in_fcnType_fcnName3003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_160_in_fcnTypes_fcnName3014 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L,0x8000000000000000L,0x00000000000000FFL});
    public static final BitSet FOLLOW_fcnTypes_in_fcnTypes_fcnName3016 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_161_in_fcnTypes_fcnName3018 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_qualName_in_fcnTypes_fcnName3020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeName_in_fcnTypes3041 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_130_in_fcnTypes3044 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L,0x8000000000000000L,0x00000000000000FFL});
    public static final BitSet FOLLOW_typeName_in_fcnTypes3046 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_160_in_fcnFormalParameterList3067 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L,0x8000000200000000L,0x00000000000000FFL});
    public static final BitSet FOLLOW_fcnFormalParameters_in_fcnFormalParameterList3069 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_161_in_fcnFormalParameterList3071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fcnFormalParameter_in_fcnFormalParameters3089 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_130_in_fcnFormalParameters3092 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L,0x8000000000000000L,0x00000000000000FFL});
    public static final BitSet FOLLOW_fcnFormalParameter_in_fcnFormalParameters3094 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_typeName_in_fcnFormalParameter3120 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_IDENT_in_fcnFormalParameter3122 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});
    public static final BitSet FOLLOW_ASSIGN_in_fcnFormalParameter3125 = new BitSet(new long[]{0x0000000000000000L,0x0000E00007400000L,0x0000000000000000L,0x0000000000000700L});
    public static final BitSet FOLLOW_arrayLitElem_in_fcnFormalParameter3128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_160_in_fcnArgumentList3141 = new BitSet(new long[]{0x0000000000000000L,0x0001E60007400000L,0x000000CD00201000L,0x0000000000000700L});
    public static final BitSet FOLLOW_fcnArguments_in_fcnArgumentList3143 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_161_in_fcnArgumentList3145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exprList_in_fcnArguments3163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_166_in_varOrFcnOrArray3176 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L,0x8000000000000000L,0x00000000000000FFL});
    public static final BitSet FOLLOW_typeName_in_varOrFcnOrArray3178 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_fcnArgumentList_in_varOrFcnOrArray3180 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000010000001000L});
    public static final BitSet FOLLOW_fieldOrArrayAccess_in_varOrFcnOrArray3182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_167_in_varOrFcnOrArray3201 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_IDENT_in_varOrFcnOrArray3204 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_fcnArgumentList_in_varOrFcnOrArray3206 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000010000001000L});
    public static final BitSet FOLLOW_fieldOrArrayAccess_in_varOrFcnOrArray3208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_167_in_varOrFcnOrArray3214 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_IDENT_in_varOrFcnOrArray3217 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000010000001000L});
    public static final BitSet FOLLOW_fieldOrArrayAccess_in_varOrFcnOrArray3219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_167_in_varOrFcnOrArray3228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qualName_in_varOrFcnOrArray3235 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_fcnArgumentList_in_varOrFcnOrArray3237 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000010000001000L});
    public static final BitSet FOLLOW_fieldOrArrayAccess_in_varOrFcnOrArray3239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qualName_in_varOrFcnOrArray3259 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000010000001000L});
    public static final BitSet FOLLOW_fieldOrArrayAccess_in_varOrFcnOrArray3261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fieldAccess_in_fieldOrArrayAccess3274 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000010000001000L});
    public static final BitSet FOLLOW_arrayAccess_in_fieldOrArrayAccess3278 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000010000001000L});
    public static final BitSet FOLLOW_168_in_fieldAccess3297 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_IDENT_in_fieldAccess3299 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_fcnArgumentList_in_fieldAccess3302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_140_in_arrayAccess3326 = new BitSet(new long[]{0x0000000000000000L,0x0001E60007400000L,0x000000CD00203000L,0x0000000000000700L});
    public static final BitSet FOLLOW_exprList_in_arrayAccess3329 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_141_in_arrayAccess3333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_braceOpen_in_stmtBlock3354 = new BitSet(new long[]{0x0000000000000000L,0x8001E60007600000L,0xF397C6FD0020191BL,0x00000000000007FFL});
    public static final BitSet FOLLOW_stmts_in_stmtBlock3356 = new BitSet(new long[]{0x0000000000000000L,0x8001000000600000L,0xE00000710000091BL,0x00000000000000FFL});
    public static final BitSet FOLLOW_braceClose_in_stmtBlock3358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmt_in_stmts3378 = new BitSet(new long[]{0x0000000000000002L,0x0001E60007400000L,0xF397C6ED00201000L,0x00000000000007FFL});
    public static final BitSet FOLLOW_NL_in_stmts3386 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
    public static final BitSet FOLLOW_stmtAssign_in_stmt3403 = new BitSet(new long[]{0x0000000000000000L,0x0000100000200000L});
    public static final BitSet FOLLOW_delim_in_stmt3405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtAssert_in_stmt3412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtBind_in_stmt3417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtPrint_in_stmt3422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtReturn_in_stmt3427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtBreak_in_stmt3432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtContinue_in_stmt3438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtForEach_in_stmt3444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtFor_in_stmt3450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtSwitch_in_stmt3455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtDoWhile_in_stmt3461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtIf_in_stmt3466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtProvided_in_stmt3471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtWhile_in_stmt3476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDeclaration_in_stmt3482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtInjection_in_stmt3488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_stmt3493 = new BitSet(new long[]{0x0000000000000000L,0x0000100000200000L});
    public static final BitSet FOLLOW_delim_in_stmt3495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varOrFcnOrArray_in_stmtAssign3505 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_ASSIGN_in_stmtAssign3507 = new BitSet(new long[]{0x0000000000000000L,0x0001E60007400000L,0x000000CD00201000L,0x0000000000000700L});
    public static final BitSet FOLLOW_expr_in_stmtAssign3509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_injectionCode_in_stmtAssign3526 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_ASSIGN_in_stmtAssign3528 = new BitSet(new long[]{0x0000000000000000L,0x0001E60007400000L,0x000000CD00201000L,0x0000000000000700L});
    public static final BitSet FOLLOW_expr_in_stmtAssign3530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varOrFcnOrArray_in_stmtAssign3552 = new BitSet(new long[]{0x0000000000000000L,0x000001FF80000000L});
    public static final BitSet FOLLOW_assignOp_in_stmtAssign3554 = new BitSet(new long[]{0x0000000000000000L,0x0001E60007400000L,0x000000CD00201000L,0x0000000000000700L});
    public static final BitSet FOLLOW_expr_in_stmtAssign3556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_injectionCode_in_stmtAssign3574 = new BitSet(new long[]{0x0000000000000000L,0x000001FF80000000L});
    public static final BitSet FOLLOW_assignOp_in_stmtAssign3576 = new BitSet(new long[]{0x0000000000000000L,0x0001E60007400000L,0x000000CD00201000L,0x0000000000000700L});
    public static final BitSet FOLLOW_expr_in_stmtAssign3578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_169_in_stmtAssert3604 = new BitSet(new long[]{0x0000000000000000L,0x0001F60007600000L,0x000000CD00201000L,0x0000000000000700L});
    public static final BitSet FOLLOW_exprList_in_stmtAssert3606 = new BitSet(new long[]{0x0000000000000000L,0x0000100000200000L});
    public static final BitSet FOLLOW_delim_in_stmtAssert3608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varOrFcnOrArray_in_stmtBind3626 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_BIND_in_stmtBind3628 = new BitSet(new long[]{0x0000000000000000L,0x0001E60007400000L,0x000000CD00201000L,0x0000000000000700L});
    public static final BitSet FOLLOW_expr_in_stmtBind3631 = new BitSet(new long[]{0x0000000000000000L,0x0000100000200000L});
    public static final BitSet FOLLOW_delim_in_stmtBind3634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_170_in_stmtPrint3656 = new BitSet(new long[]{0x0000000000000000L,0x0001E60007400000L,0x000038CD00201000L,0x0000000000000700L});
    public static final BitSet FOLLOW_stmtPrintTarget_in_stmtPrint3659 = new BitSet(new long[]{0x0000000000000000L,0x0001E60007400000L,0x000000CD00201000L,0x0000000000000700L});
    public static final BitSet FOLLOW_exprList_in_stmtPrint3663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_stmtPrintTarget3687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_174_in_stmtReturn3709 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_160_in_stmtReturn3712 = new BitSet(new long[]{0x0000000000000000L,0x0001E60007400000L,0x000000CD00201000L,0x0000000000000700L});
    public static final BitSet FOLLOW_expr_in_stmtReturn3716 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_130_in_stmtReturn3719 = new BitSet(new long[]{0x0000000000000000L,0x0001E60007400000L,0x000000CD00201000L,0x0000000000000700L});
    public static final BitSet FOLLOW_expr_in_stmtReturn3721 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000200000004L});
    public static final BitSet FOLLOW_161_in_stmtReturn3727 = new BitSet(new long[]{0x0000000000000000L,0x0000100000200000L});
    public static final BitSet FOLLOW_delim_in_stmtReturn3730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_174_in_stmtReturn3744 = new BitSet(new long[]{0x0000000000000000L,0x0001E60007400000L,0x000000CD00201000L,0x0000000000000700L});
    public static final BitSet FOLLOW_expr_in_stmtReturn3748 = new BitSet(new long[]{0x0000000000000000L,0x0000100000200000L});
    public static final BitSet FOLLOW_delim_in_stmtReturn3752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_175_in_stmtBreak3770 = new BitSet(new long[]{0x0000000000000000L,0x0000100000200000L});
    public static final BitSet FOLLOW_delim_in_stmtBreak3772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_176_in_stmtContinue3788 = new BitSet(new long[]{0x0000000000000000L,0x0000100000200000L});
    public static final BitSet FOLLOW_delim_in_stmtContinue3790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_177_in_stmtFor3811 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_160_in_stmtFor3813 = new BitSet(new long[]{0x0000000000000000L,0x0001100000400000L,0x800000C000000000L,0x00000000000000FFL});
    public static final BitSet FOLLOW_stmtForInit_in_stmtFor3815 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_SEMI_in_stmtFor3817 = new BitSet(new long[]{0x0000000000000000L,0x0001F60007400000L,0x000000CD00201000L,0x0000000000000700L});
    public static final BitSet FOLLOW_stmtForCond_in_stmtFor3819 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_SEMI_in_stmtFor3821 = new BitSet(new long[]{0x0000000000000000L,0x0001E60007400000L,0x000000CF00201000L,0x0000000000000700L});
    public static final BitSet FOLLOW_stmtForNext_in_stmtFor3823 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_161_in_stmtFor3825 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L,0x0000000000008400L});
    public static final BitSet FOLLOW_stmtBlock_in_stmtFor3827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_stmtForCond3895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeName_in_stmtForInit3939 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_IDENT_in_stmtForInit3941 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_ASSIGN_in_stmtForInit3943 = new BitSet(new long[]{0x0000000000000000L,0x0001E60007400000L,0x000000CD00201000L,0x0000000000000700L});
    public static final BitSet FOLLOW_expr_in_stmtForInit3945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtAssign_in_stmtForInit3982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_stmtForNext4025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_178_in_stmtForEach4038 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_160_in_stmtForEach4040 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_IDENT_in_stmtForEach4042 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_179_in_stmtForEach4044 = new BitSet(new long[]{0x0000000000000000L,0x0001E60007400000L,0x000000CD00201000L,0x0000000000000700L});
    public static final BitSet FOLLOW_expr_in_stmtForEach4046 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_161_in_stmtForEach4048 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L,0x0000000000008400L});
    public static final BitSet FOLLOW_stmtBlock_in_stmtForEach4050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_180_in_stmtSwitch4076 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_160_in_stmtSwitch4078 = new BitSet(new long[]{0x0000000000000000L,0x0001E60007400000L,0x000000CD00201000L,0x0000000000000700L});
    public static final BitSet FOLLOW_expr_in_stmtSwitch4080 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_161_in_stmtSwitch4082 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L,0x0000000000008400L});
    public static final BitSet FOLLOW_braceOpen_in_stmtSwitch4084 = new BitSet(new long[]{0x0000000000000000L,0x8001000000600000L,0xE06000710000091BL,0x00000000000000FFL});
    public static final BitSet FOLLOW_stmtsCase_in_stmtSwitch4086 = new BitSet(new long[]{0x0000000000000000L,0x8001000000600000L,0xE00000710000091BL,0x00000000000000FFL});
    public static final BitSet FOLLOW_braceClose_in_stmtSwitch4088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtCase_in_stmtsCase4112 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0060000000000000L});
    public static final BitSet FOLLOW_181_in_stmtCase4128 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_INT_LIT_in_stmtCase4131 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_154_in_stmtCase4134 = new BitSet(new long[]{0x0000000000000000L,0x0001E60007600000L,0xF397C6ED00201000L,0x00000000000007FFL});
    public static final BitSet FOLLOW_stmts_in_stmtCase4136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_182_in_stmtCase4151 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_154_in_stmtCase4153 = new BitSet(new long[]{0x0000000000000000L,0x0001E60007600000L,0xF397C6ED00201000L,0x00000000000007FFL});
    public static final BitSet FOLLOW_stmts_in_stmtCase4155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_183_in_stmtDoWhile4173 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L,0x0000000000008400L});
    public static final BitSet FOLLOW_stmtBlock_in_stmtDoWhile4175 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_184_in_stmtDoWhile4177 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_160_in_stmtDoWhile4179 = new BitSet(new long[]{0x0000000000000000L,0x0001E60007400000L,0x000000CD00201000L,0x0000000000000700L});
    public static final BitSet FOLLOW_expr_in_stmtDoWhile4181 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_161_in_stmtDoWhile4183 = new BitSet(new long[]{0x0000000000000000L,0x0000100000200000L});
    public static final BitSet FOLLOW_delim_in_stmtDoWhile4185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_185_in_stmtIf4210 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_stmtIfBlock_in_stmtIf4212 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_stmtsElif_in_stmtIf4214 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_stmtElse_in_stmtIf4216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_185_in_stmtIf4235 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_stmtIfBlock_in_stmtIf4237 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_stmtElse_in_stmtIf4239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_185_in_stmtIf4254 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_stmtIfBlock_in_stmtIf4256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_160_in_stmtIfBlock4274 = new BitSet(new long[]{0x0000000000000000L,0x0001E60007400000L,0x000000CD00201000L,0x0000000000000700L});
    public static final BitSet FOLLOW_expr_in_stmtIfBlock4276 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_161_in_stmtIfBlock4278 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L,0x0000000000008400L});
    public static final BitSet FOLLOW_stmtBlock_in_stmtIfBlock4280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtElif_in_stmtsElif4300 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_186_in_stmtElif4311 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_stmtIfBlock_in_stmtElif4313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_187_in_stmtElse4331 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L,0x0000000000008400L});
    public static final BitSet FOLLOW_stmtBlock_in_stmtElse4333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_188_in_stmtProvided4351 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_160_in_stmtProvided4353 = new BitSet(new long[]{0x0000000000000000L,0x0001E60007400000L,0x000000CD00201000L,0x0000000000000700L});
    public static final BitSet FOLLOW_expr_in_stmtProvided4355 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_161_in_stmtProvided4357 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L,0x0000000000008400L});
    public static final BitSet FOLLOW_stmtBlock_in_stmtProvided4359 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_stmtElse_in_stmtProvided4362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_184_in_stmtWhile4389 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_160_in_stmtWhile4391 = new BitSet(new long[]{0x0000000000000000L,0x0001E60007400000L,0x000000CD00201000L,0x0000000000000700L});
    public static final BitSet FOLLOW_expr_in_stmtWhile4393 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_161_in_stmtWhile4394 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L,0x0000000000008400L});
    public static final BitSet FOLLOW_stmtBlock_in_stmtWhile4396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varAttr_in_varDeclaration4418 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L,0xE000006000000000L,0x00000000000000FFL});
    public static final BitSet FOLLOW_varDecl_in_varDeclaration4420 = new BitSet(new long[]{0x0000000000000000L,0x0000100000200000L});
    public static final BitSet FOLLOW_delim_in_varDeclaration4422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_189_in_varAttr4447 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x6000002000000000L});
    public static final BitSet FOLLOW_190_in_varAttr4456 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x6000002000000000L});
    public static final BitSet FOLLOW_165_in_varAttr4466 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x6000002000000000L});
    public static final BitSet FOLLOW_varDeclList_in_varDecl4498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varArray_in_varDecl4514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varFcnRef_in_varDecl4530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeName_in_varDecl4538 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L,0x8000000000000000L,0x00000000000000FFL});
    public static final BitSet FOLLOW_varInit_in_varDecl4540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_166_in_varDecl4546 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L,0x8000000000000000L,0x00000000000000FFL});
    public static final BitSet FOLLOW_typeName_in_varDecl4548 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_IDENT_in_varDecl4550 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_fcnArgumentList_in_varDecl4552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeName_in_varFcnRef4576 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_fcnRefTypeList_in_varFcnRef4578 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_IDENT_in_varFcnRef4580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_160_in_fcnRefTypeList4605 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L,0x8000000200000000L,0x00000000000000FFL});
    public static final BitSet FOLLOW_fcnRefTypes_in_fcnRefTypeList4607 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_161_in_fcnRefTypeList4609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeName_in_fcnRefTypes4629 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_130_in_fcnRefTypes4632 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L,0x8000000000000000L,0x00000000000000FFL});
    public static final BitSet FOLLOW_typeName_in_fcnRefTypes4634 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_typeName_in_varArray4658 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_IDENT_in_varArray4660 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_varArraySpec_in_varArray4662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_140_in_varArraySpec4686 = new BitSet(new long[]{0x0000000000000000L,0x0000000001400000L,0x0000000000002000L});
    public static final BitSet FOLLOW_varDim_in_varArraySpec4688 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_141_in_varArraySpec4690 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_INT_LIT_in_varDim4711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_varDim4726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeName_in_varDeclList4757 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L,0x8000000000000000L,0x00000000000000FFL});
    public static final BitSet FOLLOW_varDeclList_in_varDeclList4759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varInit_in_varDeclList4764 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_130_in_varDeclList4767 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L,0x8000000000000000L,0x00000000000000FFL});
    public static final BitSet FOLLOW_varInit_in_varDeclList4769 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_varInit4794 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});
    public static final BitSet FOLLOW_ASSIGN_in_varInit4798 = new BitSet(new long[]{0x0000000000000000L,0x0001E60007400000L,0x000000CD00201000L,0x0000000000000700L});
    public static final BitSet FOLLOW_expr_in_varInit4801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_builtinType0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_qualName4917 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_168_in_qualName4927 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_IDENT_in_qualName4942 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_140_in_arrayLit4977 = new BitSet(new long[]{0x0000000000000000L,0x0000E00007400000L,0x0000000000002000L,0x0000000000000700L});
    public static final BitSet FOLLOW_arrayLitList_in_arrayLit4979 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_141_in_arrayLit4981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayLitElem_in_arrayLitList4999 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_130_in_arrayLitList5002 = new BitSet(new long[]{0x0000000000000000L,0x0000E00007400000L,0x0000000000000000L,0x0000000000000700L});
    public static final BitSet FOLLOW_arrayLitElem_in_arrayLitList5004 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_primitiveLit_in_arrayLitElem5028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nullLit_in_arrayLitElem5032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_namedConstant_in_arrayLitElem5036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qualName_in_namedConstant5046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_boolLit0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_202_in_nullLit5072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_LIT_in_numLit5087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OCT_LIT_in_numLit5104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REAL_LIT_in_numLit5121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HEX_LIT_in_numLit5138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolLit_in_primitiveLit5160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numLit_in_primitiveLit5165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_primitiveLit5170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_in_primitiveLit5175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INJECT_in_stmtInjection5185 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
    public static final BitSet FOLLOW_NL_in_stmtInjection5187 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
    public static final BitSet FOLLOW_INJECT_in_injectionCode5208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INJECT_in_injectionList5227 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_NL_in_injectionList5230 = new BitSet(new long[]{0x0000000000000000L,0x0001000000200000L});
    public static final BitSet FOLLOW_INJECT_in_injectionList5233 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
    public static final BitSet FOLLOW_SEMI_in_delim5255 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
    public static final BitSet FOLLOW_NL_in_delim5259 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
    public static final BitSet FOLLOW_NL_in_delim5270 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
    public static final BitSet FOLLOW_NL_in_delim5292 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
    public static final BitSet FOLLOW_stmtInjection_in_synpred3_pollen757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtExport_in_synpred7_pollen858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fcnDefinition_in_synpred10_pollen955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDeclaration_in_synpred12_pollen976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fcnDefinition_in_synpred16_pollen1078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDeclaration_in_synpred17_pollen1087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_delim_in_synpred21_pollen1206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_synpred22_pollen1195 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_ASSIGN_in_synpred22_pollen1199 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_INT_LIT_in_synpred22_pollen1202 = new BitSet(new long[]{0x0000000000000000L,0x0000100000200000L});
    public static final BitSet FOLLOW_delim_in_synpred22_pollen1206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_delim_in_synpred23_pollen1217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fcnDefinitionHost_in_synpred31_pollen1383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDeclaration_in_synpred33_pollen1399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_138_in_synpred42_pollen1672 = new BitSet(new long[]{0x0000000000000000L,0x0000E00007400000L,0x8000000000000000L,0x00000000000003FFL});
    public static final BitSet FOLLOW_metaArgument_in_synpred42_pollen1674 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000804L});
    public static final BitSet FOLLOW_130_in_synpred42_pollen1678 = new BitSet(new long[]{0x0000000000000000L,0x0000E00007400000L,0x8000000000000000L,0x00000000000003FFL});
    public static final BitSet FOLLOW_metaArgument_in_synpred42_pollen1680 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000804L});
    public static final BitSet FOLLOW_139_in_synpred42_pollen1684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qualName_in_synpred49_pollen1803 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_metaArguments_in_synpred49_pollen1805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_128_in_synpred51_pollen1870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_127_in_synpred52_pollen1890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_131_in_synpred53_pollen1908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_132_in_synpred54_pollen1926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_129_in_synpred55_pollen1944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NL_in_synpred57_pollen2028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NL_in_synpred61_pollen2095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_130_in_synpred79_pollen2283 = new BitSet(new long[]{0x0000000000000000L,0x0001E60007400000L,0x000000CD00201000L,0x0000000000000700L});
    public static final BitSet FOLLOW_expr_in_synpred79_pollen2285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_synpred80_pollen2280 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_130_in_synpred80_pollen2283 = new BitSet(new long[]{0x0000000000000000L,0x0001E60007400000L,0x000000CD00201000L,0x0000000000000700L});
    public static final BitSet FOLLOW_expr_in_synpred80_pollen2285 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_exprLogicalOr_in_synpred81_pollen2309 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_153_in_synpred81_pollen2311 = new BitSet(new long[]{0x0000000000000000L,0x0001E60007400000L,0x000000CD00201000L,0x0000000000000700L});
    public static final BitSet FOLLOW_expr_in_synpred81_pollen2313 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_154_in_synpred81_pollen2315 = new BitSet(new long[]{0x0000000000000000L,0x0001E60007400000L,0x000000CD00201000L,0x0000000000000700L});
    public static final BitSet FOLLOW_expr_in_synpred81_pollen2317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_155_in_synpred82_pollen2361 = new BitSet(new long[]{0x0000000000000000L,0x0001E60007400000L,0x000000CD00201000L,0x0000000000000700L});
    public static final BitSet FOLLOW_exprLogicalAnd_in_synpred82_pollen2363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_156_in_synpred83_pollen2378 = new BitSet(new long[]{0x0000000000000000L,0x0001E60007400000L,0x000000CD00201000L,0x0000000000000700L});
    public static final BitSet FOLLOW_exprBitwiseOr_in_synpred83_pollen2380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_157_in_synpred84_pollen2395 = new BitSet(new long[]{0x0000000000000000L,0x0001E60007400000L,0x000000CD00201000L,0x0000000000000700L});
    public static final BitSet FOLLOW_exprBitwiseXor_in_synpred84_pollen2397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_158_in_synpred85_pollen2412 = new BitSet(new long[]{0x0000000000000000L,0x0001E60007400000L,0x000000CD00201000L,0x0000000000000700L});
    public static final BitSet FOLLOW_exprBitwiseAnd_in_synpred85_pollen2414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_159_in_synpred86_pollen2429 = new BitSet(new long[]{0x0000000000000000L,0x0001E60007400000L,0x000000CD00201000L,0x0000000000000700L});
    public static final BitSet FOLLOW_exprEquality_in_synpred86_pollen2431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_equalityOp_in_synpred87_pollen2447 = new BitSet(new long[]{0x0000000000000000L,0x0001E60007400000L,0x000000CD00201000L,0x0000000000000700L});
    public static final BitSet FOLLOW_exprRelational_in_synpred87_pollen2449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relationalOp_in_synpred88_pollen2466 = new BitSet(new long[]{0x0000000000000000L,0x0001E60007400000L,0x000000CD00201000L,0x0000000000000700L});
    public static final BitSet FOLLOW_exprShift_in_synpred88_pollen2468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_shiftOp_in_synpred89_pollen2485 = new BitSet(new long[]{0x0000000000000000L,0x0001E60007400000L,0x000000CD00201000L,0x0000000000000700L});
    public static final BitSet FOLLOW_exprAddSub_in_synpred89_pollen2488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_addSubOp_in_synpred90_pollen2504 = new BitSet(new long[]{0x0000000000000000L,0x0001E60007400000L,0x000000CD00201000L,0x0000000000000700L});
    public static final BitSet FOLLOW_exprMultDiv_in_synpred90_pollen2506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multDivModOp_in_synpred91_pollen2521 = new BitSet(new long[]{0x0000000000000000L,0x0001E60007400000L,0x000000CD00201000L,0x0000000000000700L});
    public static final BitSet FOLLOW_exprUnary_in_synpred91_pollen2523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_162_in_synpred100_pollen2589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_163_in_synpred101_pollen2595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeName_in_synpred112_pollen2874 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_qualName_in_synpred112_pollen2876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeName_in_synpred113_pollen2915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qualName_in_synpred114_pollen2945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_160_in_synpred116_pollen2985 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L,0x8000000000000000L,0x00000000000000FFL});
    public static final BitSet FOLLOW_typeName_in_synpred116_pollen2987 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000200000004L});
    public static final BitSet FOLLOW_130_in_synpred116_pollen2990 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L,0x8000000000000000L,0x00000000000000FFL});
    public static final BitSet FOLLOW_typeName_in_synpred116_pollen2992 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000200000004L});
    public static final BitSet FOLLOW_161_in_synpred116_pollen2996 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_qualName_in_synpred116_pollen2998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_167_in_synpred122_pollen3201 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_IDENT_in_synpred122_pollen3204 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_fcnArgumentList_in_synpred122_pollen3206 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000010000001000L});
    public static final BitSet FOLLOW_fieldOrArrayAccess_in_synpred122_pollen3208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_167_in_synpred123_pollen3214 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_IDENT_in_synpred123_pollen3217 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000010000001000L});
    public static final BitSet FOLLOW_fieldOrArrayAccess_in_synpred123_pollen3219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_167_in_synpred124_pollen3228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qualName_in_synpred125_pollen3235 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_fcnArgumentList_in_synpred125_pollen3237 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000010000001000L});
    public static final BitSet FOLLOW_fieldOrArrayAccess_in_synpred125_pollen3239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayAccess_in_synpred127_pollen3278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fieldAccess_in_synpred128_pollen3274 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000010000001000L});
    public static final BitSet FOLLOW_arrayAccess_in_synpred128_pollen3278 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000010000001000L});
    public static final BitSet FOLLOW_fcnArgumentList_in_synpred129_pollen3302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exprList_in_synpred130_pollen3329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NL_in_synpred133_pollen3386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtAssign_in_synpred134_pollen3403 = new BitSet(new long[]{0x0000000000000000L,0x0000100000200000L});
    public static final BitSet FOLLOW_delim_in_synpred134_pollen3405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtBind_in_synpred136_pollen3417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDeclaration_in_synpred148_pollen3482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtInjection_in_synpred149_pollen3488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varOrFcnOrArray_in_synpred150_pollen3505 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_ASSIGN_in_synpred150_pollen3507 = new BitSet(new long[]{0x0000000000000000L,0x0001E60007400000L,0x000000CD00201000L,0x0000000000000700L});
    public static final BitSet FOLLOW_expr_in_synpred150_pollen3509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_injectionCode_in_synpred151_pollen3526 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_ASSIGN_in_synpred151_pollen3528 = new BitSet(new long[]{0x0000000000000000L,0x0001E60007400000L,0x000000CD00201000L,0x0000000000000700L});
    public static final BitSet FOLLOW_expr_in_synpred151_pollen3530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varOrFcnOrArray_in_synpred152_pollen3552 = new BitSet(new long[]{0x0000000000000000L,0x000001FF80000000L});
    public static final BitSet FOLLOW_assignOp_in_synpred152_pollen3554 = new BitSet(new long[]{0x0000000000000000L,0x0001E60007400000L,0x000000CD00201000L,0x0000000000000700L});
    public static final BitSet FOLLOW_expr_in_synpred152_pollen3556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_174_in_synpred157_pollen3709 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_160_in_synpred157_pollen3712 = new BitSet(new long[]{0x0000000000000000L,0x0001E60007400000L,0x000000CD00201000L,0x0000000000000700L});
    public static final BitSet FOLLOW_expr_in_synpred157_pollen3716 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_130_in_synpred157_pollen3719 = new BitSet(new long[]{0x0000000000000000L,0x0001E60007400000L,0x000000CD00201000L,0x0000000000000700L});
    public static final BitSet FOLLOW_expr_in_synpred157_pollen3721 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000200000004L});
    public static final BitSet FOLLOW_161_in_synpred157_pollen3727 = new BitSet(new long[]{0x0000000000000000L,0x0000100000200000L});
    public static final BitSet FOLLOW_delim_in_synpred157_pollen3730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeName_in_synpred160_pollen3939 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_IDENT_in_synpred160_pollen3941 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_ASSIGN_in_synpred160_pollen3943 = new BitSet(new long[]{0x0000000000000000L,0x0001E60007400000L,0x000000CD00201000L,0x0000000000000700L});
    public static final BitSet FOLLOW_expr_in_synpred160_pollen3945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_185_in_synpred165_pollen4210 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_stmtIfBlock_in_synpred165_pollen4212 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_stmtsElif_in_synpred165_pollen4214 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_stmtElse_in_synpred165_pollen4216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_185_in_synpred166_pollen4235 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_stmtIfBlock_in_synpred166_pollen4237 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_stmtElse_in_synpred166_pollen4239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeName_in_synpred173_pollen4482 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_IDENT_in_synpred173_pollen4484 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L,0x0000000000000004L});
    public static final BitSet FOLLOW_ASSIGN_in_synpred173_pollen4487 = new BitSet(new long[]{0x0000000000000000L,0x0001E60007400000L,0x000000CD00201000L,0x0000000000000700L});
    public static final BitSet FOLLOW_expr_in_synpred173_pollen4489 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_130_in_synpred173_pollen4493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeName_in_synpred174_pollen4505 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_IDENT_in_synpred174_pollen4507 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_140_in_synpred174_pollen4509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeName_in_synpred175_pollen4522 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_160_in_synpred175_pollen4524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeName_in_synpred176_pollen4538 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L,0x8000000000000000L,0x00000000000000FFL});
    public static final BitSet FOLLOW_varInit_in_synpred176_pollen4540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_140_in_synpred179_pollen4686 = new BitSet(new long[]{0x0000000000000000L,0x0000000001400000L,0x0000000000002000L});
    public static final BitSet FOLLOW_varDim_in_synpred179_pollen4688 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_141_in_synpred179_pollen4690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeName_in_synpred182_pollen4757 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L,0x8000000000000000L,0x00000000000000FFL});
    public static final BitSet FOLLOW_varDeclList_in_synpred182_pollen4759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_130_in_synpred183_pollen4767 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L,0x8000000000000000L,0x00000000000000FFL});
    public static final BitSet FOLLOW_varInit_in_synpred183_pollen4769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_168_in_synpred193_pollen4927 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_IDENT_in_synpred193_pollen4942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NL_in_synpred205_pollen5187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NL_in_synpred208_pollen5259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NL_in_synpred210_pollen5270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NL_in_synpred211_pollen5270 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
    public static final BitSet FOLLOW_NL_in_synpred213_pollen5282 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L,0x0000000000000800L});
    public static final BitSet FOLLOW_139_in_synpred213_pollen5286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NL_in_synpred214_pollen5292 = new BitSet(new long[]{0x0000000000000002L});

}