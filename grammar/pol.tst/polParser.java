// $ANTLR 3.1.3 Mar 17, 2009 19:23:44 pol.g 2012-08-23 21:50:51

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

public class polParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "D_ARG", "D_ARR", "D_ARR_DIM", "D_CLASS", "D_COMPOSITION", "D_CONST", "D_ENUM", "D_ENUMVAL", "D_FCN_CTOR", "D_FCN_DCL", "D_FCN_DEF", "D_FCN_REF", "D_FCN_TYP_NM", "D_FIELD", "D_FORMAL", "D_INSTANCE", "D_META", "D_META_ARGS", "D_MODULE", "D_PROTOCOL", "D_PROTOCOL_MEM", "D_VAR", "DELIM", "E_ADDR", "E_BINARY", "E_CALL", "E_COND", "E_CONST", "E_EXPR", "E_FIELD", "E_HASH", "E_IDENT", "E_INDEX", "E_INJECT", "E_NUMLIT", "E_NEW", "E_PAREN", "E_QUEST", "E_SELF", "E_UNARY", "E_VEC", "EXPORT", "FCNBODY", "HOST", "LIST", "MODULE", "NIL", "QNAME", "S_ASSERT", "S_ASSIGN", "S_BIND", "S_BLOCK", "S_BREAK", "S_CASE", "S_CONTINUE", "S_DECL", "S_DO_WHILE", "S_ELIF", "S_FOR", "S_FOREACH", "S_IF", "S_IMPORT", "S_PACKAGE", "S_PRINT", "S_PROVIDED", "S_RETURN", "S_SWITCH", "S_WHILE", "T_ARR", "T_FCN", "T_USER_TYPE", "T_STD", "UNIT", "NL", "IDENT", "ASSIGN", "INT_LIT", "STRING", "CHAR", "EQ", "NOT_EQ", "LT_EQ", "GT_EQ", "INC", "DEC", "PLUS", "MINUS", "ADD_EQ", "SUB_EQ", "MUL_EQ", "DIV_EQ", "MOD_EQ", "LSHFT_EQ", "RSHFT_EQ", "BITAND_EQ", "BITXOR_EQ", "BITOR_EQ", "LOG_NOT", "BIT_NOT", "BIND", "SEMI", "OCT_LIT", "REAL_LIT", "HEX_LIT", "INJECT", "I", "D", "H", "LU", "O", "E", "WS", "SL_COMMENT", "IJ_BEG", "IJ_END", "ML_COMMENT", "ILLEGAL_CHARACTER", "'package'", "'export'", "'class'", "'module'", "'enum'", "','", "'protocol'", "'composition'", "'import'", "'from'", "'as'", "'meta'", "'type'", "'{'", "'}'", "'extends'", "'implements'", "'<'", "'>'", "'<<'", "'>>'", "'*'", "'/'", "'%'", "'?'", "':'", "'||'", "'&&'", "'|'", "'^'", "'&'", "'new'", "'('", "')'", "'public'", "'host'", "'@'", "'.'", "'['", "']'", "'assert'", "'print'", "'log'", "'err'", "'out'", "'return'", "'break'", "'continue'", "'for'", "'foreach'", "'in'", "'switch'", "'default'", "'case'", "'do'", "'while'", "'if'", "'elif'", "'else'", "'provided'", "'const'", "'volatile'", "'bool'", "'byte'", "'int8'", "'int16'", "'int32'", "'string'", "'uint8'", "'uint16'", "'uint32'", "'true'", "'false'", "'null'"
    };
    public static final int S_IF=64;
    public static final int S_BREAK=56;
    public static final int T__159=159;
    public static final int D_FCN_TYP_NM=16;
    public static final int T__158=158;
    public static final int ADD_EQ=91;
    public static final int T__160=160;
    public static final int E_NUMLIT=38;
    public static final int T__167=167;
    public static final int S_IMPORT=65;
    public static final int T__168=168;
    public static final int EOF=-1;
    public static final int T__165=165;
    public static final int T__166=166;
    public static final int T__163=163;
    public static final int T__164=164;
    public static final int LSHFT_EQ=96;
    public static final int T__161=161;
    public static final int T__162=162;
    public static final int INC=87;
    public static final int T__148=148;
    public static final int T__147=147;
    public static final int T__149=149;
    public static final int BITAND_EQ=98;
    public static final int BIND=103;
    public static final int E_CONST=31;
    public static final int S_PRINT=67;
    public static final int E_UNARY=43;
    public static final int EXPORT=45;
    public static final int EQ=83;
    public static final int T__154=154;
    public static final int T__155=155;
    public static final int T__156=156;
    public static final int T__157=157;
    public static final int T__150=150;
    public static final int E_HASH=34;
    public static final int T__151=151;
    public static final int T__152=152;
    public static final int T__153=153;
    public static final int T__139=139;
    public static final int D=110;
    public static final int E=114;
    public static final int T__138=138;
    public static final int T__137=137;
    public static final int T__136=136;
    public static final int D_FCN_CTOR=12;
    public static final int LOG_NOT=101;
    public static final int O=113;
    public static final int H=111;
    public static final int I=109;
    public static final int MUL_EQ=93;
    public static final int T_USER_TYPE=74;
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
    public static final int WS=115;
    public static final int QNAME=51;
    public static final int T__129=129;
    public static final int SL_COMMENT=116;
    public static final int S_BLOCK=55;
    public static final int T__130=130;
    public static final int T__131=131;
    public static final int T__132=132;
    public static final int T__133=133;
    public static final int T__134=134;
    public static final int T__135=135;
    public static final int ILLEGAL_CHARACTER=120;
    public static final int T_ARR=72;
    public static final int RSHFT_EQ=97;
    public static final int S_ASSERT=52;
    public static final int T__124=124;
    public static final int HOST=47;
    public static final int D_COMPOSITION=8;
    public static final int T__123=123;
    public static final int S_ASSIGN=53;
    public static final int T__122=122;
    public static final int T__121=121;
    public static final int IJ_END=118;
    public static final int S_DECL=59;
    public static final int IJ_BEG=117;
    public static final int D_ARR=5;
    public static final int E_QUEST=41;
    public static final int D_META_ARGS=21;
    public static final int D_FIELD=17;
    public static final int D_FCN_REF=15;
    public static final int IDENT=78;
    public static final int PLUS=89;
    public static final int E_SELF=42;
    public static final int GT_EQ=86;
    public static final int D_CLASS=7;
    public static final int E_ADDR=27;
    public static final int T_FCN=73;
    public static final int S_PROVIDED=68;
    public static final int E_EXPR=32;
    public static final int E_IDENT=35;
    public static final int BITOR_EQ=100;
    public static final int MINUS=90;
    public static final int MODULE=49;
    public static final int SEMI=104;
    public static final int D_ARG=4;
    public static final int NOT_EQ=84;
    public static final int S_RETURN=69;
    public static final int E_INJECT=37;
    public static final int E_VEC=44;
    public static final int S_PACKAGE=66;
    public static final int INJECT=108;
    public static final int E_NEW=39;
    public static final int E_BINARY=28;
    public static final int STRING=81;
    public static final int S_WHILE=71;
    public static final int LU=112;
    public static final int INT_LIT=80;
    public static final int E_FIELD=33;
    public static final int S_CONTINUE=58;
    public static final int CHAR=82;
    public static final int OCT_LIT=105;
    public static final int S_SWITCH=70;
    public static final int DIV_EQ=94;
    public static final int NL=77;
    public static final int E_COND=30;
    public static final int S_BIND=54;
    public static final int S_FOR=62;
    public static final int D_ENUM=10;
    public static final int LIST=48;
    public static final int S_DO_WHILE=60;
    public static final int UNIT=76;
    public static final int BITXOR_EQ=99;
    public static final int D_ARR_DIM=6;
    public static final int NIL=50;
    public static final int T_STD=75;
    public static final int D_VAR=25;
    public static final int LT_EQ=85;
    public static final int REAL_LIT=106;
    public static final int MOD_EQ=95;
    public static final int DEC=88;
    public static final int HEX_LIT=107;
    public static final int E_PAREN=40;
    public static final int DELIM=26;
    public static final int ML_COMMENT=119;
    public static final int D_FCN_DEF=14;
    public static final int T__194=194;
    public static final int T__193=193;
    public static final int T__192=192;
    public static final int D_INSTANCE=19;
    public static final int T__191=191;
    public static final int T__190=190;
    public static final int D_META=20;
    public static final int D_CONST=9;
    public static final int T__184=184;
    public static final int T__183=183;
    public static final int T__186=186;
    public static final int T__185=185;
    public static final int T__188=188;
    public static final int SUB_EQ=92;
    public static final int T__187=187;
    public static final int T__189=189;
    public static final int T__180=180;
    public static final int FCNBODY=46;
    public static final int D_ENUMVAL=11;
    public static final int T__182=182;
    public static final int T__181=181;
    public static final int E_CALL=29;
    public static final int D_FCN_DCL=13;
    public static final int S_ELIF=61;
    public static final int T__175=175;
    public static final int S_CASE=57;
    public static final int T__174=174;
    public static final int T__173=173;
    public static final int T__172=172;
    public static final int T__179=179;
    public static final int D_PROTOCOL_MEM=24;
    public static final int T__178=178;
    public static final int T__177=177;
    public static final int T__176=176;
    public static final int T__171=171;
    public static final int T__170=170;
    public static final int D_FORMAL=18;
    public static final int ASSIGN=79;
    public static final int BIT_NOT=102;
    public static final int E_INDEX=36;
    public static final int D_MODULE=22;
    public static final int S_FOREACH=63;
    public static final int D_PROTOCOL=23;
    public static final int T__169=169;

    // delegates
    // delegators


        public polParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public polParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
            this.state.ruleMemo = new HashMap[354+1];
             
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return polParser.tokenNames; }
    public String getGrammarFileName() { return "pol.g"; }



    	protected enum UnitFlags {
            MODULE, CLASS, COMPOSITION, PROTOCOL, ENUM, META
        }
        protected enum LitFlags {
                    HEX, INT, OCT, REAL, BOOL, NULL, STR, CHR, NUM  // FLOAT, UNSIGN, LONG needed?
        }
        EnumSet<LitFlags> litFlags = EnumSet.noneOf(LitFlags.class);
        
        protected enum AttrFlags {
            HOST, PUBLIC, VOLATILE, CONST, NEW, PROTOCOL_MEMBER
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
    // pol.g:184:1: unit : ( NL )* unitPackage -> ^( UNIT unitPackage ) ;
    public final polParser.unit_return unit() throws RecognitionException {
        polParser.unit_return retval = new polParser.unit_return();
        retval.start = input.LT(1);
        int unit_StartIndex = input.index();
        Object root_0 = null;

        Token NL1=null;
        polParser.unitPackage_return unitPackage2 = null;


        Object NL1_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_unitPackage=new RewriteRuleSubtreeStream(adaptor,"rule unitPackage");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return retval; }
            // pol.g:185:5: ( ( NL )* unitPackage -> ^( UNIT unitPackage ) )
            // pol.g:185:9: ( NL )* unitPackage
            {
            // pol.g:185:9: ( NL )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==NL) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // pol.g:185:10: NL
            	    {
            	    NL1=(Token)match(input,NL,FOLLOW_NL_in_unit653); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_NL.add(NL1);


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            pushFollow(FOLLOW_unitPackage_in_unit657);
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
            // 185:29: -> ^( UNIT unitPackage )
            {
                // pol.g:185:32: ^( UNIT unitPackage )
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
    // pol.g:187:1: unitPackage : stmtPackage importList ( stmtInjection )? ( unitTypeDefinition )? ( stmtInjection )? EOF ;
    public final polParser.unitPackage_return unitPackage() throws RecognitionException {
        polParser.unitPackage_return retval = new polParser.unitPackage_return();
        retval.start = input.LT(1);
        int unitPackage_StartIndex = input.index();
        Object root_0 = null;

        Token EOF8=null;
        polParser.stmtPackage_return stmtPackage3 = null;

        polParser.importList_return importList4 = null;

        polParser.stmtInjection_return stmtInjection5 = null;

        polParser.unitTypeDefinition_return unitTypeDefinition6 = null;

        polParser.stmtInjection_return stmtInjection7 = null;


        Object EOF8_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return retval; }
            // pol.g:188:2: ( stmtPackage importList ( stmtInjection )? ( unitTypeDefinition )? ( stmtInjection )? EOF )
            // pol.g:188:5: stmtPackage importList ( stmtInjection )? ( unitTypeDefinition )? ( stmtInjection )? EOF
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_stmtPackage_in_unitPackage683);
            stmtPackage3=stmtPackage();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, stmtPackage3.getTree());
            pushFollow(FOLLOW_importList_in_unitPackage689);
            importList4=importList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, importList4.getTree());
            // pol.g:190:7: ( stmtInjection )?
            int alt2=2;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // pol.g:190:8: stmtInjection
                    {
                    pushFollow(FOLLOW_stmtInjection_in_unitPackage698);
                    stmtInjection5=stmtInjection();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmtInjection5.getTree());

                    }
                    break;

            }

            // pol.g:191:7: ( unitTypeDefinition )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=123 && LA3_0<=125)||(LA3_0>=127 && LA3_0<=128)||LA3_0==132) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // pol.g:191:8: unitTypeDefinition
                    {
                    pushFollow(FOLLOW_unitTypeDefinition_in_unitPackage709);
                    unitTypeDefinition6=unitTypeDefinition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, unitTypeDefinition6.getTree());

                    }
                    break;

            }

            // pol.g:192:7: ( stmtInjection )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==INJECT) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // pol.g:192:8: stmtInjection
                    {
                    pushFollow(FOLLOW_stmtInjection_in_unitPackage720);
                    stmtInjection7=stmtInjection();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmtInjection7.getTree());

                    }
                    break;

            }

            EOF8=(Token)match(input,EOF,FOLLOW_EOF_in_unitPackage730); if (state.failed) return retval;
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
    // pol.g:195:1: stmtPackage : ( 'package' qualName delim -> ^( S_PACKAGE qualName ) | -> ^( S_PACKAGE ) );
    public final polParser.stmtPackage_return stmtPackage() throws RecognitionException {
        polParser.stmtPackage_return retval = new polParser.stmtPackage_return();
        retval.start = input.LT(1);
        int stmtPackage_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal9=null;
        polParser.qualName_return qualName10 = null;

        polParser.delim_return delim11 = null;


        Object string_literal9_tree=null;
        RewriteRuleTokenStream stream_121=new RewriteRuleTokenStream(adaptor,"token 121");
        RewriteRuleSubtreeStream stream_qualName=new RewriteRuleSubtreeStream(adaptor,"rule qualName");
        RewriteRuleSubtreeStream stream_delim=new RewriteRuleSubtreeStream(adaptor,"rule delim");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return retval; }
            // pol.g:196:2: ( 'package' qualName delim -> ^( S_PACKAGE qualName ) | -> ^( S_PACKAGE ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==121) ) {
                alt5=1;
            }
            else if ( (LA5_0==EOF||LA5_0==INJECT||(LA5_0>=123 && LA5_0<=125)||(LA5_0>=127 && LA5_0<=130)||LA5_0==132) ) {
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
                    // pol.g:196:4: 'package' qualName delim
                    {
                    string_literal9=(Token)match(input,121,FOLLOW_121_in_stmtPackage740); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_121.add(string_literal9);

                    pushFollow(FOLLOW_qualName_in_stmtPackage742);
                    qualName10=qualName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_qualName.add(qualName10.getTree());
                    pushFollow(FOLLOW_delim_in_stmtPackage744);
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
                    // 196:29: -> ^( S_PACKAGE qualName )
                    {
                        // pol.g:196:32: ^( S_PACKAGE qualName )
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
                    // pol.g:197:4: 
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
                    // 197:4: -> ^( S_PACKAGE )
                    {
                        // pol.g:197:7: ^( S_PACKAGE )
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
    // pol.g:199:1: stmtExport : 'export' qualName delim ;
    public final polParser.stmtExport_return stmtExport() throws RecognitionException {
        polParser.stmtExport_return retval = new polParser.stmtExport_return();
        retval.start = input.LT(1);
        int stmtExport_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal12=null;
        polParser.qualName_return qualName13 = null;

        polParser.delim_return delim14 = null;


        Object string_literal12_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return retval; }
            // pol.g:200:5: ( 'export' qualName delim )
            // pol.g:200:9: 'export' qualName delim
            {
            root_0 = (Object)adaptor.nil();

            string_literal12=(Token)match(input,122,FOLLOW_122_in_stmtExport776); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal12_tree = (Object)adaptor.create(string_literal12);
            root_0 = (Object)adaptor.becomeRoot(string_literal12_tree, root_0);
            }
            pushFollow(FOLLOW_qualName_in_stmtExport779);
            qualName13=qualName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, qualName13.getTree());
            pushFollow(FOLLOW_delim_in_stmtExport781);
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
    // pol.g:202:1: exportList : ( stmtExport )+ -> ^( LIST ( stmtExport )+ ) ;
    public final polParser.exportList_return exportList() throws RecognitionException {
        polParser.exportList_return retval = new polParser.exportList_return();
        retval.start = input.LT(1);
        int exportList_StartIndex = input.index();
        Object root_0 = null;

        polParser.stmtExport_return stmtExport15 = null;


        RewriteRuleSubtreeStream stream_stmtExport=new RewriteRuleSubtreeStream(adaptor,"rule stmtExport");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return retval; }
            // pol.g:203:5: ( ( stmtExport )+ -> ^( LIST ( stmtExport )+ ) )
            // pol.g:203:9: ( stmtExport )+
            {
            // pol.g:203:9: ( stmtExport )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==122) ) {
                    int LA6_1 = input.LA(2);

                    if ( (synpred6_pol()) ) {
                        alt6=1;
                    }


                }


                switch (alt6) {
            	case 1 :
            	    // pol.g:0:0: stmtExport
            	    {
            	    pushFollow(FOLLOW_stmtExport_in_exportList799);
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
            // 203:22: -> ^( LIST ( stmtExport )+ )
            {
                // pol.g:203:25: ^( LIST ( stmtExport )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LIST, "LIST"), root_1);

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
    // pol.g:205:1: classDefinition : 'class' classDef -> ^( D_CLASS classDef ) ;
    public final polParser.classDefinition_return classDefinition() throws RecognitionException {
        polParser.classDefinition_return retval = new polParser.classDefinition_return();
        retval.start = input.LT(1);
        int classDefinition_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal16=null;
        polParser.classDef_return classDef17 = null;


        Object string_literal16_tree=null;
        RewriteRuleTokenStream stream_123=new RewriteRuleTokenStream(adaptor,"token 123");
        RewriteRuleSubtreeStream stream_classDef=new RewriteRuleSubtreeStream(adaptor,"rule classDef");

        	if (tl.size() > 1) { // nested class
        	  ti = new TypeInfo();
        	  tl.add(ti);		
        	}	

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return retval; }
            // pol.g:218:2: ( 'class' classDef -> ^( D_CLASS classDef ) )
            // pol.g:218:5: 'class' classDef
            {
            string_literal16=(Token)match(input,123,FOLLOW_123_in_classDefinition835); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_123.add(string_literal16);

            pushFollow(FOLLOW_classDef_in_classDefinition837);
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
            // 218:22: -> ^( D_CLASS classDef )
            {
                // pol.g:218:25: ^( D_CLASS classDef )
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
    // pol.g:220:1: classDef : IDENT ( implementsClause )? braceOpen ( classFeature )* braceClose ;
    public final polParser.classDef_return classDef() throws RecognitionException {
        polParser.classDef_return retval = new polParser.classDef_return();
        retval.start = input.LT(1);
        int classDef_StartIndex = input.index();
        Object root_0 = null;

        Token IDENT18=null;
        polParser.implementsClause_return implementsClause19 = null;

        polParser.braceOpen_return braceOpen20 = null;

        polParser.classFeature_return classFeature21 = null;

        polParser.braceClose_return braceClose22 = null;


        Object IDENT18_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return retval; }
            // pol.g:221:2: ( IDENT ( implementsClause )? braceOpen ( classFeature )* braceClose )
            // pol.g:221:4: IDENT ( implementsClause )? braceOpen ( classFeature )* braceClose
            {
            root_0 = (Object)adaptor.nil();

            IDENT18=(Token)match(input,IDENT,FOLLOW_IDENT_in_classDef856); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENT18_tree = (Object)adaptor.create(IDENT18);
            root_0 = (Object)adaptor.becomeRoot(IDENT18_tree, root_0);
            }
            if ( state.backtracking==0 ) {
               ti.setTypeName((IDENT18!=null?IDENT18.getText():null)); ti.setUnitFlags(EnumSet.of(UnitFlags.CLASS));
            }
            // pol.g:223:3: ( implementsClause )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==137) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // pol.g:223:4: implementsClause
                    {
                    pushFollow(FOLLOW_implementsClause_in_classDef867);
                    implementsClause19=implementsClause();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, implementsClause19.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_braceOpen_in_classDef874);
            braceOpen20=braceOpen();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, braceOpen20.getTree());
            // pol.g:224:13: ( classFeature )*
            loop8:
            do {
                int alt8=2;
                alt8 = dfa8.predict(input);
                switch (alt8) {
            	case 1 :
            	    // pol.g:224:14: classFeature
            	    {
            	    pushFollow(FOLLOW_classFeature_in_classDef877);
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

            pushFollow(FOLLOW_braceClose_in_classDef881);
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
    // pol.g:227:1: classFeature : ( fcnDefinition | enumDefinition | varDeclaration | classDefinition | stmtInjection );
    public final polParser.classFeature_return classFeature() throws RecognitionException {
        polParser.classFeature_return retval = new polParser.classFeature_return();
        retval.start = input.LT(1);
        int classFeature_StartIndex = input.index();
        Object root_0 = null;

        polParser.fcnDefinition_return fcnDefinition23 = null;

        polParser.enumDefinition_return enumDefinition24 = null;

        polParser.varDeclaration_return varDeclaration25 = null;

        polParser.classDefinition_return classDefinition26 = null;

        polParser.stmtInjection_return stmtInjection27 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return retval; }
            // pol.g:228:5: ( fcnDefinition | enumDefinition | varDeclaration | classDefinition | stmtInjection )
            int alt9=5;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // pol.g:228:9: fcnDefinition
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_fcnDefinition_in_classFeature898);
                    fcnDefinition23=fcnDefinition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, fcnDefinition23.getTree());

                    }
                    break;
                case 2 :
                    // pol.g:229:9: enumDefinition
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_enumDefinition_in_classFeature909);
                    enumDefinition24=enumDefinition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, enumDefinition24.getTree());

                    }
                    break;
                case 3 :
                    // pol.g:230:9: varDeclaration
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_varDeclaration_in_classFeature919);
                    varDeclaration25=varDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDeclaration25.getTree());

                    }
                    break;
                case 4 :
                    // pol.g:231:9: classDefinition
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_classDefinition_in_classFeature929);
                    classDefinition26=classDefinition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, classDefinition26.getTree());

                    }
                    break;
                case 5 :
                    // pol.g:232:9: stmtInjection
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_stmtInjection_in_classFeature939);
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
    // pol.g:234:1: moduleDefinition : 'module' IDENT ( implementsClause )? braceOpen ( moduleFeature )* braceClose -> ^( D_MODULE ^( IDENT ( implementsClause )? ( moduleFeature )* ) ) ;
    public final polParser.moduleDefinition_return moduleDefinition() throws RecognitionException {
        polParser.moduleDefinition_return retval = new polParser.moduleDefinition_return();
        retval.start = input.LT(1);
        int moduleDefinition_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal28=null;
        Token IDENT29=null;
        polParser.implementsClause_return implementsClause30 = null;

        polParser.braceOpen_return braceOpen31 = null;

        polParser.moduleFeature_return moduleFeature32 = null;

        polParser.braceClose_return braceClose33 = null;


        Object string_literal28_tree=null;
        Object IDENT29_tree=null;
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleTokenStream stream_124=new RewriteRuleTokenStream(adaptor,"token 124");
        RewriteRuleSubtreeStream stream_implementsClause=new RewriteRuleSubtreeStream(adaptor,"rule implementsClause");
        RewriteRuleSubtreeStream stream_moduleFeature=new RewriteRuleSubtreeStream(adaptor,"rule moduleFeature");
        RewriteRuleSubtreeStream stream_braceOpen=new RewriteRuleSubtreeStream(adaptor,"rule braceOpen");
        RewriteRuleSubtreeStream stream_braceClose=new RewriteRuleSubtreeStream(adaptor,"rule braceClose");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return retval; }
            // pol.g:235:2: ( 'module' IDENT ( implementsClause )? braceOpen ( moduleFeature )* braceClose -> ^( D_MODULE ^( IDENT ( implementsClause )? ( moduleFeature )* ) ) )
            // pol.g:235:7: 'module' IDENT ( implementsClause )? braceOpen ( moduleFeature )* braceClose
            {
            string_literal28=(Token)match(input,124,FOLLOW_124_in_moduleDefinition956); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_124.add(string_literal28);

            IDENT29=(Token)match(input,IDENT,FOLLOW_IDENT_in_moduleDefinition958); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENT.add(IDENT29);

            if ( state.backtracking==0 ) {
               ti.setTypeName((IDENT29!=null?IDENT29.getText():null)); ti.setUnitFlags(EnumSet.of(UnitFlags.MODULE));
            }
            // pol.g:237:4: ( implementsClause )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==137) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // pol.g:237:5: implementsClause
                    {
                    pushFollow(FOLLOW_implementsClause_in_moduleDefinition973);
                    implementsClause30=implementsClause();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_implementsClause.add(implementsClause30.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_braceOpen_in_moduleDefinition982);
            braceOpen31=braceOpen();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_braceOpen.add(braceOpen31.getTree());
            // pol.g:238:14: ( moduleFeature )*
            loop11:
            do {
                int alt11=2;
                alt11 = dfa11.predict(input);
                switch (alt11) {
            	case 1 :
            	    // pol.g:238:15: moduleFeature
            	    {
            	    pushFollow(FOLLOW_moduleFeature_in_moduleDefinition985);
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

            pushFollow(FOLLOW_braceClose_in_moduleDefinition989);
            braceClose33=braceClose();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_braceClose.add(braceClose33.getTree());


            // AST REWRITE
            // elements: implementsClause, IDENT, moduleFeature
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 239:4: -> ^( D_MODULE ^( IDENT ( implementsClause )? ( moduleFeature )* ) )
            {
                // pol.g:239:7: ^( D_MODULE ^( IDENT ( implementsClause )? ( moduleFeature )* ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(D_MODULE, "D_MODULE"), root_1);

                // pol.g:239:18: ^( IDENT ( implementsClause )? ( moduleFeature )* )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(stream_IDENT.nextNode(), root_2);

                // pol.g:239:26: ( implementsClause )?
                if ( stream_implementsClause.hasNext() ) {
                    adaptor.addChild(root_2, stream_implementsClause.nextTree());

                }
                stream_implementsClause.reset();
                // pol.g:239:44: ( moduleFeature )*
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
    // pol.g:241:1: moduleFeature : ( fcnDefinition | varDeclaration | enumDefinition | classDefinition | stmtInjection );
    public final polParser.moduleFeature_return moduleFeature() throws RecognitionException {
        polParser.moduleFeature_return retval = new polParser.moduleFeature_return();
        retval.start = input.LT(1);
        int moduleFeature_StartIndex = input.index();
        Object root_0 = null;

        polParser.fcnDefinition_return fcnDefinition34 = null;

        polParser.varDeclaration_return varDeclaration35 = null;

        polParser.enumDefinition_return enumDefinition36 = null;

        polParser.classDefinition_return classDefinition37 = null;

        polParser.stmtInjection_return stmtInjection38 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return retval; }
            // pol.g:242:2: ( fcnDefinition | varDeclaration | enumDefinition | classDefinition | stmtInjection )
            int alt12=5;
            alt12 = dfa12.predict(input);
            switch (alt12) {
                case 1 :
                    // pol.g:242:6: fcnDefinition
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_fcnDefinition_in_moduleFeature1021);
                    fcnDefinition34=fcnDefinition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, fcnDefinition34.getTree());

                    }
                    break;
                case 2 :
                    // pol.g:243:8: varDeclaration
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_varDeclaration_in_moduleFeature1030);
                    varDeclaration35=varDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDeclaration35.getTree());

                    }
                    break;
                case 3 :
                    // pol.g:244:6: enumDefinition
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_enumDefinition_in_moduleFeature1037);
                    enumDefinition36=enumDefinition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, enumDefinition36.getTree());

                    }
                    break;
                case 4 :
                    // pol.g:245:6: classDefinition
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_classDefinition_in_moduleFeature1044);
                    classDefinition37=classDefinition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, classDefinition37.getTree());

                    }
                    break;
                case 5 :
                    // pol.g:246:5: stmtInjection
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_stmtInjection_in_moduleFeature1050);
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
    // pol.g:248:1: enumDefinition : 'enum' enumDef -> enumDef ;
    public final polParser.enumDefinition_return enumDefinition() throws RecognitionException {
        polParser.enumDefinition_return retval = new polParser.enumDefinition_return();
        retval.start = input.LT(1);
        int enumDefinition_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal39=null;
        polParser.enumDef_return enumDef40 = null;


        Object string_literal39_tree=null;
        RewriteRuleTokenStream stream_125=new RewriteRuleTokenStream(adaptor,"token 125");
        RewriteRuleSubtreeStream stream_enumDef=new RewriteRuleSubtreeStream(adaptor,"rule enumDef");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return retval; }
            // pol.g:249:2: ( 'enum' enumDef -> enumDef )
            // pol.g:249:4: 'enum' enumDef
            {
            string_literal39=(Token)match(input,125,FOLLOW_125_in_enumDefinition1063); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_125.add(string_literal39);

            pushFollow(FOLLOW_enumDef_in_enumDefinition1065);
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
            // 249:19: -> enumDef
            {
                adaptor.addChild(root_0, stream_enumDef.nextTree());

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
    // pol.g:251:1: enumDef : ( IDENT braceOpen enumList braceClose ) -> ^( D_ENUM ^( IDENT enumList ) ) ;
    public final polParser.enumDef_return enumDef() throws RecognitionException {
        polParser.enumDef_return retval = new polParser.enumDef_return();
        retval.start = input.LT(1);
        int enumDef_StartIndex = input.index();
        Object root_0 = null;

        Token IDENT41=null;
        polParser.braceOpen_return braceOpen42 = null;

        polParser.enumList_return enumList43 = null;

        polParser.braceClose_return braceClose44 = null;


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
            // pol.g:264:2: ( ( IDENT braceOpen enumList braceClose ) -> ^( D_ENUM ^( IDENT enumList ) ) )
            // pol.g:264:5: ( IDENT braceOpen enumList braceClose )
            {
            // pol.g:264:5: ( IDENT braceOpen enumList braceClose )
            // pol.g:264:6: IDENT braceOpen enumList braceClose
            {
            IDENT41=(Token)match(input,IDENT,FOLLOW_IDENT_in_enumDef1092); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENT.add(IDENT41);

            if ( state.backtracking==0 ) {
               ti.setTypeName((IDENT41!=null?IDENT41.getText():null)); ti.setUnitFlags(EnumSet.of(UnitFlags.ENUM));
            }
            pushFollow(FOLLOW_braceOpen_in_enumDef1100);
            braceOpen42=braceOpen();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_braceOpen.add(braceOpen42.getTree());
            pushFollow(FOLLOW_enumList_in_enumDef1102);
            enumList43=enumList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_enumList.add(enumList43.getTree());
            pushFollow(FOLLOW_braceClose_in_enumDef1104);
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

            root_0 = (Object)adaptor.nil();
            // 267:3: -> ^( D_ENUM ^( IDENT enumList ) )
            {
                // pol.g:267:6: ^( D_ENUM ^( IDENT enumList ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(D_ENUM, "D_ENUM"), root_1);

                // pol.g:267:15: ^( IDENT enumList )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(stream_IDENT.nextNode(), root_2);

                adaptor.addChild(root_2, stream_enumList.nextTree());

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
    // pol.g:269:1: enumList : enumElement ( ',' enumElement )* -> ^( LIST ( enumElement )+ ) ;
    public final polParser.enumList_return enumList() throws RecognitionException {
        polParser.enumList_return retval = new polParser.enumList_return();
        retval.start = input.LT(1);
        int enumList_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal46=null;
        polParser.enumElement_return enumElement45 = null;

        polParser.enumElement_return enumElement47 = null;


        Object char_literal46_tree=null;
        RewriteRuleTokenStream stream_126=new RewriteRuleTokenStream(adaptor,"token 126");
        RewriteRuleSubtreeStream stream_enumElement=new RewriteRuleSubtreeStream(adaptor,"rule enumElement");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return retval; }
            // pol.g:270:2: ( enumElement ( ',' enumElement )* -> ^( LIST ( enumElement )+ ) )
            // pol.g:270:4: enumElement ( ',' enumElement )*
            {
            pushFollow(FOLLOW_enumElement_in_enumList1129);
            enumElement45=enumElement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_enumElement.add(enumElement45.getTree());
            // pol.g:270:16: ( ',' enumElement )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==126) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // pol.g:270:17: ',' enumElement
            	    {
            	    char_literal46=(Token)match(input,126,FOLLOW_126_in_enumList1132); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_126.add(char_literal46);

            	    pushFollow(FOLLOW_enumElement_in_enumList1134);
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
            // 270:35: -> ^( LIST ( enumElement )+ )
            {
                // pol.g:270:38: ^( LIST ( enumElement )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LIST, "LIST"), root_1);

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
    // pol.g:272:1: enumElement : ( IDENT ASSIGN INT_LIT ( delim )? -> ^( D_ENUMVAL ^( IDENT INT_LIT ) ) | IDENT ( delim )? -> ^( D_ENUMVAL IDENT ) );
    public final polParser.enumElement_return enumElement() throws RecognitionException {
        polParser.enumElement_return retval = new polParser.enumElement_return();
        retval.start = input.LT(1);
        int enumElement_StartIndex = input.index();
        Object root_0 = null;

        Token IDENT48=null;
        Token ASSIGN49=null;
        Token INT_LIT50=null;
        Token IDENT52=null;
        polParser.delim_return delim51 = null;

        polParser.delim_return delim53 = null;


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
            // pol.g:273:2: ( IDENT ASSIGN INT_LIT ( delim )? -> ^( D_ENUMVAL ^( IDENT INT_LIT ) ) | IDENT ( delim )? -> ^( D_ENUMVAL IDENT ) )
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
                    // pol.g:273:4: IDENT ASSIGN INT_LIT ( delim )?
                    {
                    IDENT48=(Token)match(input,IDENT,FOLLOW_IDENT_in_enumElement1155); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENT.add(IDENT48);

                    ASSIGN49=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_enumElement1157); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ASSIGN.add(ASSIGN49);

                    INT_LIT50=(Token)match(input,INT_LIT,FOLLOW_INT_LIT_in_enumElement1159); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INT_LIT.add(INT_LIT50);

                    // pol.g:273:25: ( delim )?
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
                        case 126:
                            {
                            int LA14_3 = input.LA(2);

                            if ( (synpred20_pol()) ) {
                                alt14=1;
                            }
                            }
                            break;
                        case 135:
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
                            // pol.g:273:26: delim
                            {
                            pushFollow(FOLLOW_delim_in_enumElement1162);
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

                    root_0 = (Object)adaptor.nil();
                    // 273:34: -> ^( D_ENUMVAL ^( IDENT INT_LIT ) )
                    {
                        // pol.g:273:37: ^( D_ENUMVAL ^( IDENT INT_LIT ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(D_ENUMVAL, "D_ENUMVAL"), root_1);

                        // pol.g:273:49: ^( IDENT INT_LIT )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_IDENT.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_INT_LIT.nextNode());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // pol.g:274:4: IDENT ( delim )?
                    {
                    IDENT52=(Token)match(input,IDENT,FOLLOW_IDENT_in_enumElement1181); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENT.add(IDENT52);

                    // pol.g:274:10: ( delim )?
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
                        case 126:
                            {
                            int LA15_3 = input.LA(2);

                            if ( (synpred22_pol()) ) {
                                alt15=1;
                            }
                            }
                            break;
                        case 135:
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
                            // pol.g:274:11: delim
                            {
                            pushFollow(FOLLOW_delim_in_enumElement1184);
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
                    // 274:19: -> ^( D_ENUMVAL IDENT )
                    {
                        // pol.g:274:22: ^( D_ENUMVAL IDENT )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(D_ENUMVAL, "D_ENUMVAL"), root_1);

                        adaptor.addChild(root_1, stream_IDENT.nextNode());

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
    // pol.g:276:1: protocolDefinition : 'protocol' IDENT ( extendsClause )? braceOpen ( protocolFeature )* braceClose -> ^( D_PROTOCOL ^( IDENT ( extendsClause )? ( protocolFeature )* ) ) ;
    public final polParser.protocolDefinition_return protocolDefinition() throws RecognitionException {
        polParser.protocolDefinition_return retval = new polParser.protocolDefinition_return();
        retval.start = input.LT(1);
        int protocolDefinition_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal54=null;
        Token IDENT55=null;
        polParser.extendsClause_return extendsClause56 = null;

        polParser.braceOpen_return braceOpen57 = null;

        polParser.protocolFeature_return protocolFeature58 = null;

        polParser.braceClose_return braceClose59 = null;


        Object string_literal54_tree=null;
        Object IDENT55_tree=null;
        RewriteRuleTokenStream stream_127=new RewriteRuleTokenStream(adaptor,"token 127");
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleSubtreeStream stream_protocolFeature=new RewriteRuleSubtreeStream(adaptor,"rule protocolFeature");
        RewriteRuleSubtreeStream stream_extendsClause=new RewriteRuleSubtreeStream(adaptor,"rule extendsClause");
        RewriteRuleSubtreeStream stream_braceOpen=new RewriteRuleSubtreeStream(adaptor,"rule braceOpen");
        RewriteRuleSubtreeStream stream_braceClose=new RewriteRuleSubtreeStream(adaptor,"rule braceClose");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return retval; }
            // pol.g:277:2: ( 'protocol' IDENT ( extendsClause )? braceOpen ( protocolFeature )* braceClose -> ^( D_PROTOCOL ^( IDENT ( extendsClause )? ( protocolFeature )* ) ) )
            // pol.g:277:4: 'protocol' IDENT ( extendsClause )? braceOpen ( protocolFeature )* braceClose
            {
            string_literal54=(Token)match(input,127,FOLLOW_127_in_protocolDefinition1204); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_127.add(string_literal54);

            IDENT55=(Token)match(input,IDENT,FOLLOW_IDENT_in_protocolDefinition1206); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENT.add(IDENT55);

            if ( state.backtracking==0 ) {
               ti.setTypeName((IDENT55!=null?IDENT55.getText():null)); ti.setUnitFlags(EnumSet.of(UnitFlags.PROTOCOL));
            }
            // pol.g:279:3: ( extendsClause )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==136) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // pol.g:0:0: extendsClause
                    {
                    pushFollow(FOLLOW_extendsClause_in_protocolDefinition1214);
                    extendsClause56=extendsClause();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_extendsClause.add(extendsClause56.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_braceOpen_in_protocolDefinition1220);
            braceOpen57=braceOpen();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_braceOpen.add(braceOpen57.getTree());
            // pol.g:280:13: ( protocolFeature )*
            loop18:
            do {
                int alt18=2;
                alt18 = dfa18.predict(input);
                switch (alt18) {
            	case 1 :
            	    // pol.g:280:14: protocolFeature
            	    {
            	    pushFollow(FOLLOW_protocolFeature_in_protocolDefinition1223);
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

            pushFollow(FOLLOW_braceClose_in_protocolDefinition1227);
            braceClose59=braceClose();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_braceClose.add(braceClose59.getTree());


            // AST REWRITE
            // elements: IDENT, extendsClause, protocolFeature
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 281:3: -> ^( D_PROTOCOL ^( IDENT ( extendsClause )? ( protocolFeature )* ) )
            {
                // pol.g:281:6: ^( D_PROTOCOL ^( IDENT ( extendsClause )? ( protocolFeature )* ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(D_PROTOCOL, "D_PROTOCOL"), root_1);

                // pol.g:281:19: ^( IDENT ( extendsClause )? ( protocolFeature )* )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(stream_IDENT.nextNode(), root_2);

                // pol.g:281:27: ( extendsClause )?
                if ( stream_extendsClause.hasNext() ) {
                    adaptor.addChild(root_2, stream_extendsClause.nextTree());

                }
                stream_extendsClause.reset();
                // pol.g:281:42: ( protocolFeature )*
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
    // pol.g:283:1: protocolFeature : ( enumDefinition | fcnDeclaration | stmtInjection );
    public final polParser.protocolFeature_return protocolFeature() throws RecognitionException {
        polParser.protocolFeature_return retval = new polParser.protocolFeature_return();
        retval.start = input.LT(1);
        int protocolFeature_StartIndex = input.index();
        Object root_0 = null;

        polParser.enumDefinition_return enumDefinition60 = null;

        polParser.fcnDeclaration_return fcnDeclaration61 = null;

        polParser.stmtInjection_return stmtInjection62 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return retval; }
            // pol.g:284:5: ( enumDefinition | fcnDeclaration | stmtInjection )
            int alt19=3;
            switch ( input.LA(1) ) {
            case 125:
                {
                alt19=1;
                }
                break;
            case IDENT:
            case 153:
            case 155:
            case 156:
            case 183:
            case 184:
            case 185:
            case 186:
            case 187:
            case 188:
            case 189:
            case 190:
            case 191:
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
                    // pol.g:284:9: enumDefinition
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_enumDefinition_in_protocolFeature1261);
                    enumDefinition60=enumDefinition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, enumDefinition60.getTree());

                    }
                    break;
                case 2 :
                    // pol.g:285:9: fcnDeclaration
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_fcnDeclaration_in_protocolFeature1271);
                    fcnDeclaration61=fcnDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, fcnDeclaration61.getTree());

                    }
                    break;
                case 3 :
                    // pol.g:286:9: stmtInjection
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_stmtInjection_in_protocolFeature1282);
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
    // pol.g:288:1: compositionDefinition : 'composition' IDENT ( extendsClause )? braceOpen ( compositionFeature )* braceClose -> ^( D_COMPOSITION IDENT ( extendsClause )? ( compositionFeature )* ) ;
    public final polParser.compositionDefinition_return compositionDefinition() throws RecognitionException {
        polParser.compositionDefinition_return retval = new polParser.compositionDefinition_return();
        retval.start = input.LT(1);
        int compositionDefinition_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal63=null;
        Token IDENT64=null;
        polParser.extendsClause_return extendsClause65 = null;

        polParser.braceOpen_return braceOpen66 = null;

        polParser.compositionFeature_return compositionFeature67 = null;

        polParser.braceClose_return braceClose68 = null;


        Object string_literal63_tree=null;
        Object IDENT64_tree=null;
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleTokenStream stream_128=new RewriteRuleTokenStream(adaptor,"token 128");
        RewriteRuleSubtreeStream stream_extendsClause=new RewriteRuleSubtreeStream(adaptor,"rule extendsClause");
        RewriteRuleSubtreeStream stream_compositionFeature=new RewriteRuleSubtreeStream(adaptor,"rule compositionFeature");
        RewriteRuleSubtreeStream stream_braceOpen=new RewriteRuleSubtreeStream(adaptor,"rule braceOpen");
        RewriteRuleSubtreeStream stream_braceClose=new RewriteRuleSubtreeStream(adaptor,"rule braceClose");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return retval; }
            // pol.g:289:2: ( 'composition' IDENT ( extendsClause )? braceOpen ( compositionFeature )* braceClose -> ^( D_COMPOSITION IDENT ( extendsClause )? ( compositionFeature )* ) )
            // pol.g:289:4: 'composition' IDENT ( extendsClause )? braceOpen ( compositionFeature )* braceClose
            {
            string_literal63=(Token)match(input,128,FOLLOW_128_in_compositionDefinition1295); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_128.add(string_literal63);

            IDENT64=(Token)match(input,IDENT,FOLLOW_IDENT_in_compositionDefinition1297); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENT.add(IDENT64);

            if ( state.backtracking==0 ) {
               ti.setTypeName((IDENT64!=null?IDENT64.getText():null)); 
              		  //DBG("IDENT64 " + (IDENT64!=null?IDENT64.getText():null));
              		  ti.setUnitFlags(EnumSet.of(UnitFlags.COMPOSITION));
              		  //DBG(ti.getTypeName() + ", " + ti.getUnitFlags().toString());
              		
            }
            // pol.g:295:3: ( extendsClause )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==136) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // pol.g:0:0: extendsClause
                    {
                    pushFollow(FOLLOW_extendsClause_in_compositionDefinition1305);
                    extendsClause65=extendsClause();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_extendsClause.add(extendsClause65.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_braceOpen_in_compositionDefinition1312);
            braceOpen66=braceOpen();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_braceOpen.add(braceOpen66.getTree());
            // pol.g:296:13: ( compositionFeature )*
            loop21:
            do {
                int alt21=2;
                alt21 = dfa21.predict(input);
                switch (alt21) {
            	case 1 :
            	    // pol.g:296:14: compositionFeature
            	    {
            	    pushFollow(FOLLOW_compositionFeature_in_compositionDefinition1315);
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

            pushFollow(FOLLOW_braceClose_in_compositionDefinition1319);
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

            root_0 = (Object)adaptor.nil();
            // 297:4: -> ^( D_COMPOSITION IDENT ( extendsClause )? ( compositionFeature )* )
            {
                // pol.g:297:7: ^( D_COMPOSITION IDENT ( extendsClause )? ( compositionFeature )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(D_COMPOSITION, "D_COMPOSITION"), root_1);

                adaptor.addChild(root_1, stream_IDENT.nextNode());
                // pol.g:297:29: ( extendsClause )?
                if ( stream_extendsClause.hasNext() ) {
                    adaptor.addChild(root_1, stream_extendsClause.nextTree());

                }
                stream_extendsClause.reset();
                // pol.g:297:44: ( compositionFeature )*
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
    // pol.g:299:1: compositionFeature : ( exportList | fcnDefinitionHost | enumDefinition | varDeclaration | stmtInjection );
    public final polParser.compositionFeature_return compositionFeature() throws RecognitionException {
        polParser.compositionFeature_return retval = new polParser.compositionFeature_return();
        retval.start = input.LT(1);
        int compositionFeature_StartIndex = input.index();
        Object root_0 = null;

        polParser.exportList_return exportList69 = null;

        polParser.fcnDefinitionHost_return fcnDefinitionHost70 = null;

        polParser.enumDefinition_return enumDefinition71 = null;

        polParser.varDeclaration_return varDeclaration72 = null;

        polParser.stmtInjection_return stmtInjection73 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return retval; }
            // pol.g:300:3: ( exportList | fcnDefinitionHost | enumDefinition | varDeclaration | stmtInjection )
            int alt22=5;
            alt22 = dfa22.predict(input);
            switch (alt22) {
                case 1 :
                    // pol.g:300:6: exportList
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_exportList_in_compositionFeature1349);
                    exportList69=exportList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, exportList69.getTree());

                    }
                    break;
                case 2 :
                    // pol.g:301:7: fcnDefinitionHost
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_fcnDefinitionHost_in_compositionFeature1358);
                    fcnDefinitionHost70=fcnDefinitionHost();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, fcnDefinitionHost70.getTree());

                    }
                    break;
                case 3 :
                    // pol.g:302:7: enumDefinition
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_enumDefinition_in_compositionFeature1366);
                    enumDefinition71=enumDefinition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, enumDefinition71.getTree());

                    }
                    break;
                case 4 :
                    // pol.g:303:7: varDeclaration
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_varDeclaration_in_compositionFeature1374);
                    varDeclaration72=varDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDeclaration72.getTree());

                    }
                    break;
                case 5 :
                    // pol.g:304:6: stmtInjection
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_stmtInjection_in_compositionFeature1381);
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
    // pol.g:306:1: stmtImport : ( importFrom 'import' qualName ( metaArguments )? ( importAs )? delim ) -> ^( S_IMPORT ( importFrom )? qualName ( importAs )? ( metaArguments )? ) ;
    public final polParser.stmtImport_return stmtImport() throws RecognitionException {
        polParser.stmtImport_return retval = new polParser.stmtImport_return();
        retval.start = input.LT(1);
        int stmtImport_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal75=null;
        polParser.importFrom_return importFrom74 = null;

        polParser.qualName_return qualName76 = null;

        polParser.metaArguments_return metaArguments77 = null;

        polParser.importAs_return importAs78 = null;

        polParser.delim_return delim79 = null;


        Object string_literal75_tree=null;
        RewriteRuleTokenStream stream_129=new RewriteRuleTokenStream(adaptor,"token 129");
        RewriteRuleSubtreeStream stream_importFrom=new RewriteRuleSubtreeStream(adaptor,"rule importFrom");
        RewriteRuleSubtreeStream stream_qualName=new RewriteRuleSubtreeStream(adaptor,"rule qualName");
        RewriteRuleSubtreeStream stream_importAs=new RewriteRuleSubtreeStream(adaptor,"rule importAs");
        RewriteRuleSubtreeStream stream_delim=new RewriteRuleSubtreeStream(adaptor,"rule delim");
        RewriteRuleSubtreeStream stream_metaArguments=new RewriteRuleSubtreeStream(adaptor,"rule metaArguments");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return retval; }
            // pol.g:307:5: ( ( importFrom 'import' qualName ( metaArguments )? ( importAs )? delim ) -> ^( S_IMPORT ( importFrom )? qualName ( importAs )? ( metaArguments )? ) )
            // pol.g:307:9: ( importFrom 'import' qualName ( metaArguments )? ( importAs )? delim )
            {
            // pol.g:307:9: ( importFrom 'import' qualName ( metaArguments )? ( importAs )? delim )
            // pol.g:307:10: importFrom 'import' qualName ( metaArguments )? ( importAs )? delim
            {
            pushFollow(FOLLOW_importFrom_in_stmtImport1398);
            importFrom74=importFrom();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_importFrom.add(importFrom74.getTree());
            string_literal75=(Token)match(input,129,FOLLOW_129_in_stmtImport1408); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_129.add(string_literal75);

            pushFollow(FOLLOW_qualName_in_stmtImport1410);
            qualName76=qualName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_qualName.add(qualName76.getTree());
            // pol.g:308:27: ( metaArguments )?
            int alt23=2;
            alt23 = dfa23.predict(input);
            switch (alt23) {
                case 1 :
                    // pol.g:308:28: metaArguments
                    {
                    pushFollow(FOLLOW_metaArguments_in_stmtImport1413);
                    metaArguments77=metaArguments();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_metaArguments.add(metaArguments77.getTree());

                    }
                    break;

            }

            // pol.g:309:10: ( importAs )?
            int alt24=2;
            alt24 = dfa24.predict(input);
            switch (alt24) {
                case 1 :
                    // pol.g:0:0: importAs
                    {
                    pushFollow(FOLLOW_importAs_in_stmtImport1426);
                    importAs78=importAs();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_importAs.add(importAs78.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_delim_in_stmtImport1429);
            delim79=delim();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_delim.add(delim79.getTree());

            }



            // AST REWRITE
            // elements: qualName, importAs, importFrom, metaArguments
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 309:27: -> ^( S_IMPORT ( importFrom )? qualName ( importAs )? ( metaArguments )? )
            {
                // pol.g:309:30: ^( S_IMPORT ( importFrom )? qualName ( importAs )? ( metaArguments )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(S_IMPORT, "S_IMPORT"), root_1);

                // pol.g:309:41: ( importFrom )?
                if ( stream_importFrom.hasNext() ) {
                    adaptor.addChild(root_1, stream_importFrom.nextTree());

                }
                stream_importFrom.reset();
                adaptor.addChild(root_1, stream_qualName.nextTree());
                // pol.g:309:62: ( importAs )?
                if ( stream_importAs.hasNext() ) {
                    adaptor.addChild(root_1, stream_importAs.nextTree());

                }
                stream_importAs.reset();
                // pol.g:309:72: ( metaArguments )?
                if ( stream_metaArguments.hasNext() ) {
                    adaptor.addChild(root_1, stream_metaArguments.nextTree());

                }
                stream_metaArguments.reset();

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
    // pol.g:311:1: importFrom : ( 'from' qualName -> qualName | -> NIL );
    public final polParser.importFrom_return importFrom() throws RecognitionException {
        polParser.importFrom_return retval = new polParser.importFrom_return();
        retval.start = input.LT(1);
        int importFrom_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal80=null;
        polParser.qualName_return qualName81 = null;


        Object string_literal80_tree=null;
        RewriteRuleTokenStream stream_130=new RewriteRuleTokenStream(adaptor,"token 130");
        RewriteRuleSubtreeStream stream_qualName=new RewriteRuleSubtreeStream(adaptor,"rule qualName");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return retval; }
            // pol.g:312:5: ( 'from' qualName -> qualName | -> NIL )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==130) ) {
                alt25=1;
            }
            else if ( (LA25_0==129) ) {
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
                    // pol.g:312:9: 'from' qualName
                    {
                    string_literal80=(Token)match(input,130,FOLLOW_130_in_importFrom1465); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_130.add(string_literal80);

                    pushFollow(FOLLOW_qualName_in_importFrom1467);
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
                    // 312:25: -> qualName
                    {
                        adaptor.addChild(root_0, stream_qualName.nextTree());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // pol.g:313:8: 
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
                    // 313:8: -> NIL
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
    // pol.g:315:1: importAs : ( 'as' qualName -> qualName | -> NIL );
    public final polParser.importAs_return importAs() throws RecognitionException {
        polParser.importAs_return retval = new polParser.importAs_return();
        retval.start = input.LT(1);
        int importAs_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal82=null;
        polParser.qualName_return qualName83 = null;


        Object string_literal82_tree=null;
        RewriteRuleTokenStream stream_131=new RewriteRuleTokenStream(adaptor,"token 131");
        RewriteRuleSubtreeStream stream_qualName=new RewriteRuleSubtreeStream(adaptor,"rule qualName");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return retval; }
            // pol.g:316:2: ( 'as' qualName -> qualName | -> NIL )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==131) ) {
                alt26=1;
            }
            else if ( (LA26_0==EOF||(LA26_0>=NL && LA26_0<=IDENT)||(LA26_0>=INT_LIT && LA26_0<=CHAR)||(LA26_0>=INC && LA26_0<=DEC)||LA26_0==MINUS||(LA26_0>=LOG_NOT && LA26_0<=BIT_NOT)||(LA26_0>=SEMI && LA26_0<=INJECT)||(LA26_0>=122 && LA26_0<=130)||LA26_0==132||(LA26_0>=134 && LA26_0<=135)||(LA26_0>=152 && LA26_0<=153)||(LA26_0>=155 && LA26_0<=157)||LA26_0==159||(LA26_0>=161 && LA26_0<=162)||(LA26_0>=166 && LA26_0<=170)||(LA26_0>=172 && LA26_0<=177)||(LA26_0>=180 && LA26_0<=194)) ) {
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
                    // pol.g:316:4: 'as' qualName
                    {
                    string_literal82=(Token)match(input,131,FOLLOW_131_in_importAs1495); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_131.add(string_literal82);

                    pushFollow(FOLLOW_qualName_in_importAs1497);
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
                    // 316:18: -> qualName
                    {
                        adaptor.addChild(root_0, stream_qualName.nextTree());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // pol.g:317:4: 
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
                    // 317:4: -> NIL
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
    // pol.g:319:1: importList : ( stmtImport ( stmtImport )* -> ^( LIST ( stmtImport )+ ) | -> ^( LIST ) );
    public final polParser.importList_return importList() throws RecognitionException {
        polParser.importList_return retval = new polParser.importList_return();
        retval.start = input.LT(1);
        int importList_StartIndex = input.index();
        Object root_0 = null;

        polParser.stmtImport_return stmtImport84 = null;

        polParser.stmtImport_return stmtImport85 = null;


        RewriteRuleSubtreeStream stream_stmtImport=new RewriteRuleSubtreeStream(adaptor,"rule stmtImport");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return retval; }
            // pol.g:320:5: ( stmtImport ( stmtImport )* -> ^( LIST ( stmtImport )+ ) | -> ^( LIST ) )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0>=129 && LA28_0<=130)) ) {
                alt28=1;
            }
            else if ( (LA28_0==EOF||LA28_0==INJECT||(LA28_0>=123 && LA28_0<=125)||(LA28_0>=127 && LA28_0<=128)||LA28_0==132) ) {
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
                    // pol.g:320:9: stmtImport ( stmtImport )*
                    {
                    pushFollow(FOLLOW_stmtImport_in_importList1523);
                    stmtImport84=stmtImport();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_stmtImport.add(stmtImport84.getTree());
                    // pol.g:320:20: ( stmtImport )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( ((LA27_0>=129 && LA27_0<=130)) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // pol.g:320:21: stmtImport
                    	    {
                    	    pushFollow(FOLLOW_stmtImport_in_importList1526);
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
                    // 320:34: -> ^( LIST ( stmtImport )+ )
                    {
                        // pol.g:320:37: ^( LIST ( stmtImport )+ )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LIST, "LIST"), root_1);

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

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // pol.g:321:8: 
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
                    // 321:8: -> ^( LIST )
                    {
                        // pol.g:321:11: ^( LIST )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LIST, "LIST"), root_1);

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
    // pol.g:324:1: meta : 'meta' ( braceOpen metaFormalParameters braceClose ) -> ^( D_META metaFormalParameters ) ;
    public final polParser.meta_return meta() throws RecognitionException {
        polParser.meta_return retval = new polParser.meta_return();
        retval.start = input.LT(1);
        int meta_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal86=null;
        polParser.braceOpen_return braceOpen87 = null;

        polParser.metaFormalParameters_return metaFormalParameters88 = null;

        polParser.braceClose_return braceClose89 = null;


        Object string_literal86_tree=null;
        RewriteRuleTokenStream stream_132=new RewriteRuleTokenStream(adaptor,"token 132");
        RewriteRuleSubtreeStream stream_metaFormalParameters=new RewriteRuleSubtreeStream(adaptor,"rule metaFormalParameters");
        RewriteRuleSubtreeStream stream_braceOpen=new RewriteRuleSubtreeStream(adaptor,"rule braceOpen");
        RewriteRuleSubtreeStream stream_braceClose=new RewriteRuleSubtreeStream(adaptor,"rule braceClose");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return retval; }
            // pol.g:325:2: ( 'meta' ( braceOpen metaFormalParameters braceClose ) -> ^( D_META metaFormalParameters ) )
            // pol.g:325:4: 'meta' ( braceOpen metaFormalParameters braceClose )
            {
            string_literal86=(Token)match(input,132,FOLLOW_132_in_meta1564); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_132.add(string_literal86);

            if ( state.backtracking==0 ) {
               ti.setUnitFlags(EnumSet.of(UnitFlags.META));
            }
            // pol.g:327:3: ( braceOpen metaFormalParameters braceClose )
            // pol.g:327:4: braceOpen metaFormalParameters braceClose
            {
            pushFollow(FOLLOW_braceOpen_in_meta1573);
            braceOpen87=braceOpen();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_braceOpen.add(braceOpen87.getTree());
            pushFollow(FOLLOW_metaFormalParameters_in_meta1575);
            metaFormalParameters88=metaFormalParameters();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_metaFormalParameters.add(metaFormalParameters88.getTree());
            pushFollow(FOLLOW_braceClose_in_meta1577);
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
            // 328:3: -> ^( D_META metaFormalParameters )
            {
                // pol.g:328:6: ^( D_META metaFormalParameters )
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
    // pol.g:330:1: metaFormalParameters : metaFormalParameter ( ',' metaFormalParameter )* -> ( metaFormalParameter )+ ;
    public final polParser.metaFormalParameters_return metaFormalParameters() throws RecognitionException {
        polParser.metaFormalParameters_return retval = new polParser.metaFormalParameters_return();
        retval.start = input.LT(1);
        int metaFormalParameters_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal91=null;
        polParser.metaFormalParameter_return metaFormalParameter90 = null;

        polParser.metaFormalParameter_return metaFormalParameter92 = null;


        Object char_literal91_tree=null;
        RewriteRuleTokenStream stream_126=new RewriteRuleTokenStream(adaptor,"token 126");
        RewriteRuleSubtreeStream stream_metaFormalParameter=new RewriteRuleSubtreeStream(adaptor,"rule metaFormalParameter");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return retval; }
            // pol.g:331:4: ( metaFormalParameter ( ',' metaFormalParameter )* -> ( metaFormalParameter )+ )
            // pol.g:331:8: metaFormalParameter ( ',' metaFormalParameter )*
            {
            pushFollow(FOLLOW_metaFormalParameter_in_metaFormalParameters1602);
            metaFormalParameter90=metaFormalParameter();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_metaFormalParameter.add(metaFormalParameter90.getTree());
            // pol.g:331:29: ( ',' metaFormalParameter )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==126) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // pol.g:331:30: ',' metaFormalParameter
            	    {
            	    char_literal91=(Token)match(input,126,FOLLOW_126_in_metaFormalParameters1606); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_126.add(char_literal91);

            	    pushFollow(FOLLOW_metaFormalParameter_in_metaFormalParameters1608);
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
            // 331:56: -> ( metaFormalParameter )+
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
    // pol.g:334:1: metaFormalParameter : metaFormalParameterType IDENT ( ASSIGN metaArgument )? -> ^( metaFormalParameterType ^( IDENT ( metaArgument )? ) ) ;
    public final polParser.metaFormalParameter_return metaFormalParameter() throws RecognitionException {
        polParser.metaFormalParameter_return retval = new polParser.metaFormalParameter_return();
        retval.start = input.LT(1);
        int metaFormalParameter_StartIndex = input.index();
        Object root_0 = null;

        Token IDENT94=null;
        Token ASSIGN95=null;
        polParser.metaFormalParameterType_return metaFormalParameterType93 = null;

        polParser.metaArgument_return metaArgument96 = null;


        Object IDENT94_tree=null;
        Object ASSIGN95_tree=null;
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
        RewriteRuleSubtreeStream stream_metaArgument=new RewriteRuleSubtreeStream(adaptor,"rule metaArgument");
        RewriteRuleSubtreeStream stream_metaFormalParameterType=new RewriteRuleSubtreeStream(adaptor,"rule metaFormalParameterType");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return retval; }
            // pol.g:335:1: ( metaFormalParameterType IDENT ( ASSIGN metaArgument )? -> ^( metaFormalParameterType ^( IDENT ( metaArgument )? ) ) )
            // pol.g:335:4: metaFormalParameterType IDENT ( ASSIGN metaArgument )?
            {
            pushFollow(FOLLOW_metaFormalParameterType_in_metaFormalParameter1631);
            metaFormalParameterType93=metaFormalParameterType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_metaFormalParameterType.add(metaFormalParameterType93.getTree());
            IDENT94=(Token)match(input,IDENT,FOLLOW_IDENT_in_metaFormalParameter1633); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENT.add(IDENT94);

            // pol.g:335:34: ( ASSIGN metaArgument )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==ASSIGN) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // pol.g:335:35: ASSIGN metaArgument
                    {
                    ASSIGN95=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_metaFormalParameter1636); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ASSIGN.add(ASSIGN95);

                    pushFollow(FOLLOW_metaArgument_in_metaFormalParameter1638);
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
            // 336:2: -> ^( metaFormalParameterType ^( IDENT ( metaArgument )? ) )
            {
                // pol.g:336:5: ^( metaFormalParameterType ^( IDENT ( metaArgument )? ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_metaFormalParameterType.nextNode(), root_1);

                // pol.g:336:31: ^( IDENT ( metaArgument )? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(stream_IDENT.nextNode(), root_2);

                // pol.g:336:39: ( metaArgument )?
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
    // pol.g:339:1: metaFormalParameterType : ( 'type' | builtinType );
    public final polParser.metaFormalParameterType_return metaFormalParameterType() throws RecognitionException {
        polParser.metaFormalParameterType_return retval = new polParser.metaFormalParameterType_return();
        retval.start = input.LT(1);
        int metaFormalParameterType_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal97=null;
        polParser.builtinType_return builtinType98 = null;


        Object string_literal97_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return retval; }
            // pol.g:340:3: ( 'type' | builtinType )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==133) ) {
                alt31=1;
            }
            else if ( ((LA31_0>=183 && LA31_0<=191)) ) {
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
                    // pol.g:340:5: 'type'
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal97=(Token)match(input,133,FOLLOW_133_in_metaFormalParameterType1667); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal97_tree = (Object)adaptor.create(string_literal97);
                    adaptor.addChild(root_0, string_literal97_tree);
                    }

                    }
                    break;
                case 2 :
                    // pol.g:341:5: builtinType
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_builtinType_in_metaFormalParameterType1674);
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
    // pol.g:343:1: metaArguments : ( '{' metaArgument ( ',' metaArgument )* '}' -> ^( D_META_ARGS ( metaArgument )+ ) | '{' '}' -> ^( D_META_ARGS NIL ) );
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
        polParser.metaArgument_return metaArgument100 = null;

        polParser.metaArgument_return metaArgument102 = null;


        Object char_literal99_tree=null;
        Object char_literal101_tree=null;
        Object char_literal103_tree=null;
        Object char_literal104_tree=null;
        Object char_literal105_tree=null;
        RewriteRuleTokenStream stream_134=new RewriteRuleTokenStream(adaptor,"token 134");
        RewriteRuleTokenStream stream_126=new RewriteRuleTokenStream(adaptor,"token 126");
        RewriteRuleTokenStream stream_135=new RewriteRuleTokenStream(adaptor,"token 135");
        RewriteRuleSubtreeStream stream_metaArgument=new RewriteRuleSubtreeStream(adaptor,"rule metaArgument");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return retval; }
            // pol.g:344:4: ( '{' metaArgument ( ',' metaArgument )* '}' -> ^( D_META_ARGS ( metaArgument )+ ) | '{' '}' -> ^( D_META_ARGS NIL ) )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==134) ) {
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
                    // pol.g:344:7: '{' metaArgument ( ',' metaArgument )* '}'
                    {
                    char_literal99=(Token)match(input,134,FOLLOW_134_in_metaArguments1687); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_134.add(char_literal99);

                    pushFollow(FOLLOW_metaArgument_in_metaArguments1689);
                    metaArgument100=metaArgument();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_metaArgument.add(metaArgument100.getTree());
                    // pol.g:344:25: ( ',' metaArgument )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==126) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // pol.g:344:26: ',' metaArgument
                    	    {
                    	    char_literal101=(Token)match(input,126,FOLLOW_126_in_metaArguments1693); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_126.add(char_literal101);

                    	    pushFollow(FOLLOW_metaArgument_in_metaArguments1695);
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

                    char_literal103=(Token)match(input,135,FOLLOW_135_in_metaArguments1699); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_135.add(char_literal103);



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
                    // 344:49: -> ^( D_META_ARGS ( metaArgument )+ )
                    {
                        // pol.g:344:52: ^( D_META_ARGS ( metaArgument )+ )
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
                    // pol.g:345:6: '{' '}'
                    {
                    char_literal104=(Token)match(input,134,FOLLOW_134_in_metaArguments1715); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_134.add(char_literal104);

                    char_literal105=(Token)match(input,135,FOLLOW_135_in_metaArguments1717); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_135.add(char_literal105);



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
                    // 345:19: -> ^( D_META_ARGS NIL )
                    {
                        // pol.g:345:22: ^( D_META_ARGS NIL )
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
    // pol.g:348:1: metaArgument : ( numLit | boolLit | STRING | CHAR | typeNameScalar );
    public final polParser.metaArgument_return metaArgument() throws RecognitionException {
        polParser.metaArgument_return retval = new polParser.metaArgument_return();
        retval.start = input.LT(1);
        int metaArgument_StartIndex = input.index();
        Object root_0 = null;

        Token STRING108=null;
        Token CHAR109=null;
        polParser.numLit_return numLit106 = null;

        polParser.boolLit_return boolLit107 = null;

        polParser.typeNameScalar_return typeNameScalar110 = null;


        Object STRING108_tree=null;
        Object CHAR109_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return retval; }
            // pol.g:349:2: ( numLit | boolLit | STRING | CHAR | typeNameScalar )
            int alt34=5;
            switch ( input.LA(1) ) {
            case INT_LIT:
            case OCT_LIT:
            case REAL_LIT:
            case HEX_LIT:
                {
                alt34=1;
                }
                break;
            case 192:
            case 193:
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
            case 183:
            case 184:
            case 185:
            case 186:
            case 187:
            case 188:
            case 189:
            case 190:
            case 191:
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
                    // pol.g:349:4: numLit
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_numLit_in_metaArgument1746);
                    numLit106=numLit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, numLit106.getTree());

                    }
                    break;
                case 2 :
                    // pol.g:350:4: boolLit
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_boolLit_in_metaArgument1752);
                    boolLit107=boolLit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, boolLit107.getTree());

                    }
                    break;
                case 3 :
                    // pol.g:351:5: STRING
                    {
                    root_0 = (Object)adaptor.nil();

                    STRING108=(Token)match(input,STRING,FOLLOW_STRING_in_metaArgument1758); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRING108_tree = (Object)adaptor.create(STRING108);
                    adaptor.addChild(root_0, STRING108_tree);
                    }

                    }
                    break;
                case 4 :
                    // pol.g:352:5: CHAR
                    {
                    root_0 = (Object)adaptor.nil();

                    CHAR109=(Token)match(input,CHAR,FOLLOW_CHAR_in_metaArgument1764); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CHAR109_tree = (Object)adaptor.create(CHAR109);
                    adaptor.addChild(root_0, CHAR109_tree);
                    }

                    }
                    break;
                case 5 :
                    // pol.g:353:4: typeNameScalar
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_typeNameScalar_in_metaArgument1769);
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
    // pol.g:355:1: typeName : typeNameScalar ;
    public final polParser.typeName_return typeName() throws RecognitionException {
        polParser.typeName_return retval = new polParser.typeName_return();
        retval.start = input.LT(1);
        int typeName_StartIndex = input.index();
        Object root_0 = null;

        polParser.typeNameScalar_return typeNameScalar111 = null;




        	//System.out.print("typeName: "); DBG_LT();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return retval; }
            // pol.g:359:2: ( typeNameScalar )
            // pol.g:359:4: typeNameScalar
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_typeNameScalar_in_typeName1783);
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
    // pol.g:361:1: typeNameScalar : ( builtinType | userTypeName );
    public final polParser.typeNameScalar_return typeNameScalar() throws RecognitionException {
        polParser.typeNameScalar_return retval = new polParser.typeNameScalar_return();
        retval.start = input.LT(1);
        int typeNameScalar_StartIndex = input.index();
        Object root_0 = null;

        polParser.builtinType_return builtinType112 = null;

        polParser.userTypeName_return userTypeName113 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return retval; }
            // pol.g:362:2: ( builtinType | userTypeName )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( ((LA35_0>=183 && LA35_0<=191)) ) {
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
                    // pol.g:362:4: builtinType
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_builtinType_in_typeNameScalar1797);
                    builtinType112=builtinType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, builtinType112.getTree());

                    }
                    break;
                case 2 :
                    // pol.g:363:4: userTypeName
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_userTypeName_in_typeNameScalar1802);
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
    // pol.g:365:1: userTypeName : ( qualName metaArguments -> ^( T_USER_TYPE qualName metaArguments ) | qualName -> ^( T_USER_TYPE qualName ) );
    public final polParser.userTypeName_return userTypeName() throws RecognitionException {
        polParser.userTypeName_return retval = new polParser.userTypeName_return();
        retval.start = input.LT(1);
        int userTypeName_StartIndex = input.index();
        Object root_0 = null;

        polParser.qualName_return qualName114 = null;

        polParser.metaArguments_return metaArguments115 = null;

        polParser.qualName_return qualName116 = null;


        RewriteRuleSubtreeStream stream_qualName=new RewriteRuleSubtreeStream(adaptor,"rule qualName");
        RewriteRuleSubtreeStream stream_metaArguments=new RewriteRuleSubtreeStream(adaptor,"rule metaArguments");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return retval; }
            // pol.g:366:2: ( qualName metaArguments -> ^( T_USER_TYPE qualName metaArguments ) | qualName -> ^( T_USER_TYPE qualName ) )
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
                    // pol.g:366:4: qualName metaArguments
                    {
                    pushFollow(FOLLOW_qualName_in_userTypeName1812);
                    qualName114=qualName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_qualName.add(qualName114.getTree());
                    pushFollow(FOLLOW_metaArguments_in_userTypeName1814);
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
                    // 366:27: -> ^( T_USER_TYPE qualName metaArguments )
                    {
                        // pol.g:366:30: ^( T_USER_TYPE qualName metaArguments )
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
                    // pol.g:367:4: qualName
                    {
                    pushFollow(FOLLOW_qualName_in_userTypeName1829);
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
                    // 367:14: -> ^( T_USER_TYPE qualName )
                    {
                        // pol.g:367:17: ^( T_USER_TYPE qualName )
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
    // pol.g:370:1: unitTypeDefinition : ( meta )? ( ( 'module' )=> moduleDefinition | ( 'class' )=> classDefinition | ( 'protocol' )=> protocolDefinition | ( 'composition' )=> compositionDefinition | ( 'enum' )=> enumDefinition ) ;
    public final polParser.unitTypeDefinition_return unitTypeDefinition() throws RecognitionException {
        polParser.unitTypeDefinition_return retval = new polParser.unitTypeDefinition_return();
        retval.start = input.LT(1);
        int unitTypeDefinition_StartIndex = input.index();
        Object root_0 = null;

        polParser.meta_return meta117 = null;

        polParser.moduleDefinition_return moduleDefinition118 = null;

        polParser.classDefinition_return classDefinition119 = null;

        polParser.protocolDefinition_return protocolDefinition120 = null;

        polParser.compositionDefinition_return compositionDefinition121 = null;

        polParser.enumDefinition_return enumDefinition122 = null;




        		ti = new TypeInfo();
        		tl.add(ti);		

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return retval; }
            // pol.g:379:4: ( ( meta )? ( ( 'module' )=> moduleDefinition | ( 'class' )=> classDefinition | ( 'protocol' )=> protocolDefinition | ( 'composition' )=> compositionDefinition | ( 'enum' )=> enumDefinition ) )
            // pol.g:379:8: ( meta )? ( ( 'module' )=> moduleDefinition | ( 'class' )=> classDefinition | ( 'protocol' )=> protocolDefinition | ( 'composition' )=> compositionDefinition | ( 'enum' )=> enumDefinition )
            {
            root_0 = (Object)adaptor.nil();

            // pol.g:379:8: ( meta )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==132) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // pol.g:379:9: meta
                    {
                    pushFollow(FOLLOW_meta_in_unitTypeDefinition1862);
                    meta117=meta();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, meta117.getTree());

                    }
                    break;

            }

            // pol.g:379:17: ( ( 'module' )=> moduleDefinition | ( 'class' )=> classDefinition | ( 'protocol' )=> protocolDefinition | ( 'composition' )=> compositionDefinition | ( 'enum' )=> enumDefinition )
            int alt38=5;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==124) && (synpred51_pol())) {
                alt38=1;
            }
            else if ( (LA38_0==123) && (synpred52_pol())) {
                alt38=2;
            }
            else if ( (LA38_0==127) && (synpred53_pol())) {
                alt38=3;
            }
            else if ( (LA38_0==128) && (synpred54_pol())) {
                alt38=4;
            }
            else if ( (LA38_0==125) && (synpred55_pol())) {
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
                    // pol.g:380:10: ( 'module' )=> moduleDefinition
                    {
                    pushFollow(FOLLOW_moduleDefinition_in_unitTypeDefinition1884);
                    moduleDefinition118=moduleDefinition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, moduleDefinition118.getTree());

                    }
                    break;
                case 2 :
                    // pol.g:381:8: ( 'class' )=> classDefinition
                    {
                    pushFollow(FOLLOW_classDefinition_in_unitTypeDefinition1905);
                    classDefinition119=classDefinition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, classDefinition119.getTree());

                    }
                    break;
                case 3 :
                    // pol.g:382:10: ( 'protocol' )=> protocolDefinition
                    {
                    pushFollow(FOLLOW_protocolDefinition_in_unitTypeDefinition1922);
                    protocolDefinition120=protocolDefinition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, protocolDefinition120.getTree());

                    }
                    break;
                case 4 :
                    // pol.g:383:10: ( 'composition' )=> compositionDefinition
                    {
                    pushFollow(FOLLOW_compositionDefinition_in_unitTypeDefinition1940);
                    compositionDefinition121=compositionDefinition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, compositionDefinition121.getTree());

                    }
                    break;
                case 5 :
                    // pol.g:384:10: ( 'enum' )=> enumDefinition
                    {
                    pushFollow(FOLLOW_enumDefinition_in_unitTypeDefinition1958);
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
    // pol.g:388:1: extendsClause : 'extends' IDENT ;
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
            // pol.g:389:5: ( 'extends' IDENT )
            // pol.g:389:9: 'extends' IDENT
            {
            root_0 = (Object)adaptor.nil();

            string_literal123=(Token)match(input,136,FOLLOW_136_in_extendsClause1983); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal123_tree = (Object)adaptor.create(string_literal123);
            root_0 = (Object)adaptor.becomeRoot(string_literal123_tree, root_0);
            }
            IDENT124=(Token)match(input,IDENT,FOLLOW_IDENT_in_extendsClause1986); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENT124_tree = (Object)adaptor.create(IDENT124);
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
    // pol.g:392:1: implementsClause : 'implements' IDENT ;
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
            // pol.g:393:5: ( 'implements' IDENT )
            // pol.g:393:9: 'implements' IDENT
            {
            root_0 = (Object)adaptor.nil();

            string_literal125=(Token)match(input,137,FOLLOW_137_in_implementsClause2005); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal125_tree = (Object)adaptor.create(string_literal125);
            root_0 = (Object)adaptor.becomeRoot(string_literal125_tree, root_0);
            }
            IDENT126=(Token)match(input,IDENT,FOLLOW_IDENT_in_implementsClause2008); if (state.failed) return retval;
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
    // pol.g:395:1: braceClose : ( NL )* '}' ( NL )* ;
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
            // pol.g:396:5: ( ( NL )* '}' ( NL )* )
            // pol.g:396:10: ( NL )* '}' ( NL )*
            {
            root_0 = (Object)adaptor.nil();

            // pol.g:396:10: ( NL )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==NL) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // pol.g:396:11: NL
            	    {
            	    NL127=(Token)match(input,NL,FOLLOW_NL_in_braceClose2028); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

            char_literal128=(Token)match(input,135,FOLLOW_135_in_braceClose2033); if (state.failed) return retval;
            // pol.g:396:22: ( NL )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==NL) ) {
                    int LA40_2 = input.LA(2);

                    if ( (synpred57_pol()) ) {
                        alt40=1;
                    }


                }


                switch (alt40) {
            	case 1 :
            	    // pol.g:396:23: NL
            	    {
            	    NL129=(Token)match(input,NL,FOLLOW_NL_in_braceClose2037); if (state.failed) return retval;

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
    // pol.g:398:1: braceCloseAtEOF : ( ( NL )* ) '}' ( NL )* ;
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
            // pol.g:401:5: ( ( ( NL )* ) '}' ( NL )* )
            // pol.g:401:9: ( ( NL )* ) '}' ( NL )*
            {
            root_0 = (Object)adaptor.nil();

            // pol.g:401:9: ( ( NL )* )
            // pol.g:401:10: ( NL )*
            {
            // pol.g:401:12: ( NL )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==NL) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // pol.g:0:0: NL
            	    {
            	    NL130=(Token)match(input,NL,FOLLOW_NL_in_braceCloseAtEOF2061); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);


            }

            char_literal131=(Token)match(input,135,FOLLOW_135_in_braceCloseAtEOF2066); if (state.failed) return retval;
            // pol.g:401:21: ( NL )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==NL) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // pol.g:401:22: NL
            	    {
            	    NL132=(Token)match(input,NL,FOLLOW_NL_in_braceCloseAtEOF2070); if (state.failed) return retval;

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
    // pol.g:404:1: braceOpen : ( NL )* '{' ( NL )* ;
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
            // pol.g:405:5: ( ( NL )* '{' ( NL )* )
            // pol.g:405:10: ( NL )* '{' ( NL )*
            {
            root_0 = (Object)adaptor.nil();

            // pol.g:405:10: ( NL )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==NL) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // pol.g:405:11: NL
            	    {
            	    NL133=(Token)match(input,NL,FOLLOW_NL_in_braceOpen2095); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);

            char_literal134=(Token)match(input,134,FOLLOW_134_in_braceOpen2100); if (state.failed) return retval;
            // pol.g:405:22: ( NL )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==NL) ) {
                    int LA44_2 = input.LA(2);

                    if ( (synpred61_pol()) ) {
                        alt44=1;
                    }


                }


                switch (alt44) {
            	case 1 :
            	    // pol.g:405:23: NL
            	    {
            	    NL135=(Token)match(input,NL,FOLLOW_NL_in_braceOpen2104); if (state.failed) return retval;

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
    // pol.g:407:1: equalityOp : ( EQ | NOT_EQ );
    public final polParser.equalityOp_return equalityOp() throws RecognitionException {
        polParser.equalityOp_return retval = new polParser.equalityOp_return();
        retval.start = input.LT(1);
        int equalityOp_StartIndex = input.index();
        Object root_0 = null;

        Token set136=null;

        Object set136_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 38) ) { return retval; }
            // pol.g:408:2: ( EQ | NOT_EQ )
            // pol.g:
            {
            root_0 = (Object)adaptor.nil();

            set136=(Token)input.LT(1);
            if ( (input.LA(1)>=EQ && input.LA(1)<=NOT_EQ) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set136));
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
    // pol.g:410:1: relationalOp : ( '<' | '>' | LT_EQ | GT_EQ );
    public final polParser.relationalOp_return relationalOp() throws RecognitionException {
        polParser.relationalOp_return retval = new polParser.relationalOp_return();
        retval.start = input.LT(1);
        int relationalOp_StartIndex = input.index();
        Object root_0 = null;

        Token set137=null;

        Object set137_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 39) ) { return retval; }
            // pol.g:411:2: ( '<' | '>' | LT_EQ | GT_EQ )
            // pol.g:
            {
            root_0 = (Object)adaptor.nil();

            set137=(Token)input.LT(1);
            if ( (input.LA(1)>=LT_EQ && input.LA(1)<=GT_EQ)||(input.LA(1)>=138 && input.LA(1)<=139) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set137));
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
    // pol.g:413:1: shiftOp : ( '<<' | '>>' );
    public final polParser.shiftOp_return shiftOp() throws RecognitionException {
        polParser.shiftOp_return retval = new polParser.shiftOp_return();
        retval.start = input.LT(1);
        int shiftOp_StartIndex = input.index();
        Object root_0 = null;

        Token set138=null;

        Object set138_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 40) ) { return retval; }
            // pol.g:414:2: ( '<<' | '>>' )
            // pol.g:
            {
            root_0 = (Object)adaptor.nil();

            set138=(Token)input.LT(1);
            if ( (input.LA(1)>=140 && input.LA(1)<=141) ) {
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
    // pol.g:416:1: incDecOp : ( INC | DEC );
    public final polParser.incDecOp_return incDecOp() throws RecognitionException {
        polParser.incDecOp_return retval = new polParser.incDecOp_return();
        retval.start = input.LT(1);
        int incDecOp_StartIndex = input.index();
        Object root_0 = null;

        Token set139=null;

        Object set139_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 41) ) { return retval; }
            // pol.g:417:2: ( INC | DEC )
            // pol.g:
            {
            root_0 = (Object)adaptor.nil();

            set139=(Token)input.LT(1);
            if ( (input.LA(1)>=INC && input.LA(1)<=DEC) ) {
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
    // pol.g:419:1: addSubOp : ( PLUS | MINUS );
    public final polParser.addSubOp_return addSubOp() throws RecognitionException {
        polParser.addSubOp_return retval = new polParser.addSubOp_return();
        retval.start = input.LT(1);
        int addSubOp_StartIndex = input.index();
        Object root_0 = null;

        Token set140=null;

        Object set140_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 42) ) { return retval; }
            // pol.g:420:2: ( PLUS | MINUS )
            // pol.g:
            {
            root_0 = (Object)adaptor.nil();

            set140=(Token)input.LT(1);
            if ( (input.LA(1)>=PLUS && input.LA(1)<=MINUS) ) {
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
    // pol.g:422:1: assignOp : ( ADD_EQ | SUB_EQ | MUL_EQ | DIV_EQ | MOD_EQ | LSHFT_EQ | RSHFT_EQ | BITAND_EQ | BITXOR_EQ | BITOR_EQ );
    public final polParser.assignOp_return assignOp() throws RecognitionException {
        polParser.assignOp_return retval = new polParser.assignOp_return();
        retval.start = input.LT(1);
        int assignOp_StartIndex = input.index();
        Object root_0 = null;

        Token set141=null;

        Object set141_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 43) ) { return retval; }
            // pol.g:423:2: ( ADD_EQ | SUB_EQ | MUL_EQ | DIV_EQ | MOD_EQ | LSHFT_EQ | RSHFT_EQ | BITAND_EQ | BITXOR_EQ | BITOR_EQ )
            // pol.g:
            {
            root_0 = (Object)adaptor.nil();

            set141=(Token)input.LT(1);
            if ( (input.LA(1)>=ADD_EQ && input.LA(1)<=BITOR_EQ) ) {
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
    // pol.g:425:1: multDivModOp : ( '*' | '/' | '%' );
    public final polParser.multDivModOp_return multDivModOp() throws RecognitionException {
        polParser.multDivModOp_return retval = new polParser.multDivModOp_return();
        retval.start = input.LT(1);
        int multDivModOp_StartIndex = input.index();
        Object root_0 = null;

        Token set142=null;

        Object set142_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 44) ) { return retval; }
            // pol.g:426:2: ( '*' | '/' | '%' )
            // pol.g:
            {
            root_0 = (Object)adaptor.nil();

            set142=(Token)input.LT(1);
            if ( (input.LA(1)>=142 && input.LA(1)<=144) ) {
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
    // pol.g:428:1: logicalNotOp : LOG_NOT ;
    public final polParser.logicalNotOp_return logicalNotOp() throws RecognitionException {
        polParser.logicalNotOp_return retval = new polParser.logicalNotOp_return();
        retval.start = input.LT(1);
        int logicalNotOp_StartIndex = input.index();
        Object root_0 = null;

        Token LOG_NOT143=null;

        Object LOG_NOT143_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 45) ) { return retval; }
            // pol.g:429:2: ( LOG_NOT )
            // pol.g:429:4: LOG_NOT
            {
            root_0 = (Object)adaptor.nil();

            LOG_NOT143=(Token)match(input,LOG_NOT,FOLLOW_LOG_NOT_in_logicalNotOp2281); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            LOG_NOT143_tree = (Object)adaptor.create(LOG_NOT143);
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
    // pol.g:431:1: bitwiseNotOp : BIT_NOT ;
    public final polParser.bitwiseNotOp_return bitwiseNotOp() throws RecognitionException {
        polParser.bitwiseNotOp_return retval = new polParser.bitwiseNotOp_return();
        retval.start = input.LT(1);
        int bitwiseNotOp_StartIndex = input.index();
        Object root_0 = null;

        Token BIT_NOT144=null;

        Object BIT_NOT144_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 46) ) { return retval; }
            // pol.g:432:2: ( BIT_NOT )
            // pol.g:432:4: BIT_NOT
            {
            root_0 = (Object)adaptor.nil();

            BIT_NOT144=(Token)match(input,BIT_NOT,FOLLOW_BIT_NOT_in_bitwiseNotOp2292); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            BIT_NOT144_tree = (Object)adaptor.create(BIT_NOT144);
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
    // pol.g:434:1: exprList : ( expr ( ',' expr )* -> ^( LIST ( expr )+ ) | -> NIL );
    public final polParser.exprList_return exprList() throws RecognitionException {
        polParser.exprList_return retval = new polParser.exprList_return();
        retval.start = input.LT(1);
        int exprList_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal146=null;
        polParser.expr_return expr145 = null;

        polParser.expr_return expr147 = null;


        Object char_literal146_tree=null;
        RewriteRuleTokenStream stream_126=new RewriteRuleTokenStream(adaptor,"token 126");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 47) ) { return retval; }
            // pol.g:435:2: ( expr ( ',' expr )* -> ^( LIST ( expr )+ ) | -> NIL )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==IDENT||(LA46_0>=INT_LIT && LA46_0<=CHAR)||(LA46_0>=INC && LA46_0<=DEC)||LA46_0==MINUS||(LA46_0>=LOG_NOT && LA46_0<=BIT_NOT)||(LA46_0>=OCT_LIT && LA46_0<=INJECT)||(LA46_0>=152 && LA46_0<=153)||LA46_0==157||LA46_0==159||(LA46_0>=192 && LA46_0<=194)) ) {
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
            else if ( (LA46_0==NL||LA46_0==SEMI||(LA46_0>=122 && LA46_0<=130)||LA46_0==132||(LA46_0>=134 && LA46_0<=135)||(LA46_0>=154 && LA46_0<=156)||(LA46_0>=160 && LA46_0<=162)||(LA46_0>=166 && LA46_0<=170)||(LA46_0>=172 && LA46_0<=177)||(LA46_0>=180 && LA46_0<=191)) ) {
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
                    // pol.g:435:4: expr ( ',' expr )*
                    {
                    pushFollow(FOLLOW_expr_in_exprList2303);
                    expr145=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr145.getTree());
                    // pol.g:435:9: ( ',' expr )*
                    loop45:
                    do {
                        int alt45=2;
                        int LA45_0 = input.LA(1);

                        if ( (LA45_0==126) ) {
                            int LA45_1 = input.LA(2);

                            if ( (synpred80_pol()) ) {
                                alt45=1;
                            }


                        }


                        switch (alt45) {
                    	case 1 :
                    	    // pol.g:435:10: ',' expr
                    	    {
                    	    char_literal146=(Token)match(input,126,FOLLOW_126_in_exprList2306); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_126.add(char_literal146);

                    	    pushFollow(FOLLOW_expr_in_exprList2308);
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
                    // 436:3: -> ^( LIST ( expr )+ )
                    {
                        // pol.g:436:6: ^( LIST ( expr )+ )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LIST, "LIST"), root_1);

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
                    // pol.g:437:4: 
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
                    // 437:4: -> NIL
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
    // pol.g:439:1: expr : ( exprLogicalOr '?' expr ':' expr -> ^( E_QUEST exprLogicalOr expr expr ) | exprLogicalOr );
    public final polParser.expr_return expr() throws RecognitionException {
        polParser.expr_return retval = new polParser.expr_return();
        retval.start = input.LT(1);
        int expr_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal149=null;
        Token char_literal151=null;
        polParser.exprLogicalOr_return exprLogicalOr148 = null;

        polParser.expr_return expr150 = null;

        polParser.expr_return expr152 = null;

        polParser.exprLogicalOr_return exprLogicalOr153 = null;


        Object char_literal149_tree=null;
        Object char_literal151_tree=null;
        RewriteRuleTokenStream stream_145=new RewriteRuleTokenStream(adaptor,"token 145");
        RewriteRuleTokenStream stream_146=new RewriteRuleTokenStream(adaptor,"token 146");
        RewriteRuleSubtreeStream stream_exprLogicalOr=new RewriteRuleSubtreeStream(adaptor,"rule exprLogicalOr");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 48) ) { return retval; }
            // pol.g:440:2: ( exprLogicalOr '?' expr ':' expr -> ^( E_QUEST exprLogicalOr expr expr ) | exprLogicalOr )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==IDENT||(LA47_0>=INT_LIT && LA47_0<=CHAR)||(LA47_0>=INC && LA47_0<=DEC)||LA47_0==MINUS||(LA47_0>=LOG_NOT && LA47_0<=BIT_NOT)||(LA47_0>=OCT_LIT && LA47_0<=INJECT)||(LA47_0>=152 && LA47_0<=153)||LA47_0==157||LA47_0==159||(LA47_0>=192 && LA47_0<=194)) ) {
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
                    // pol.g:440:4: exprLogicalOr '?' expr ':' expr
                    {
                    pushFollow(FOLLOW_exprLogicalOr_in_expr2339);
                    exprLogicalOr148=exprLogicalOr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_exprLogicalOr.add(exprLogicalOr148.getTree());
                    char_literal149=(Token)match(input,145,FOLLOW_145_in_expr2341); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_145.add(char_literal149);

                    pushFollow(FOLLOW_expr_in_expr2343);
                    expr150=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr150.getTree());
                    char_literal151=(Token)match(input,146,FOLLOW_146_in_expr2345); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_146.add(char_literal151);

                    pushFollow(FOLLOW_expr_in_expr2347);
                    expr152=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr152.getTree());


                    // AST REWRITE
                    // elements: expr, expr, exprLogicalOr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 440:36: -> ^( E_QUEST exprLogicalOr expr expr )
                    {
                        // pol.g:440:39: ^( E_QUEST exprLogicalOr expr expr )
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
                    // pol.g:441:4: exprLogicalOr
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_exprLogicalOr_in_expr2364);
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
    // pol.g:443:1: exprLogicalOr : ( exprLogicalAnd -> exprLogicalAnd ) ( '||' exprLogicalAnd -> ^( E_BINARY '||' $exprLogicalOr exprLogicalAnd ) )* ;
    public final polParser.exprLogicalOr_return exprLogicalOr() throws RecognitionException {
        polParser.exprLogicalOr_return retval = new polParser.exprLogicalOr_return();
        retval.start = input.LT(1);
        int exprLogicalOr_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal155=null;
        polParser.exprLogicalAnd_return exprLogicalAnd154 = null;

        polParser.exprLogicalAnd_return exprLogicalAnd156 = null;


        Object string_literal155_tree=null;
        RewriteRuleTokenStream stream_147=new RewriteRuleTokenStream(adaptor,"token 147");
        RewriteRuleSubtreeStream stream_exprLogicalAnd=new RewriteRuleSubtreeStream(adaptor,"rule exprLogicalAnd");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 49) ) { return retval; }
            // pol.g:444:2: ( ( exprLogicalAnd -> exprLogicalAnd ) ( '||' exprLogicalAnd -> ^( E_BINARY '||' $exprLogicalOr exprLogicalAnd ) )* )
            // pol.g:444:4: ( exprLogicalAnd -> exprLogicalAnd ) ( '||' exprLogicalAnd -> ^( E_BINARY '||' $exprLogicalOr exprLogicalAnd ) )*
            {
            // pol.g:444:4: ( exprLogicalAnd -> exprLogicalAnd )
            // pol.g:444:5: exprLogicalAnd
            {
            pushFollow(FOLLOW_exprLogicalAnd_in_exprLogicalOr2382);
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
            // 444:20: -> exprLogicalAnd
            {
                adaptor.addChild(root_0, stream_exprLogicalAnd.nextTree());

            }

            retval.tree = root_0;}
            }

            // pol.g:445:3: ( '||' exprLogicalAnd -> ^( E_BINARY '||' $exprLogicalOr exprLogicalAnd ) )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==147) ) {
                    int LA48_1 = input.LA(2);

                    if ( (synpred83_pol()) ) {
                        alt48=1;
                    }


                }


                switch (alt48) {
            	case 1 :
            	    // pol.g:446:4: '||' exprLogicalAnd
            	    {
            	    string_literal155=(Token)match(input,147,FOLLOW_147_in_exprLogicalOr2396); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_147.add(string_literal155);

            	    pushFollow(FOLLOW_exprLogicalAnd_in_exprLogicalOr2398);
            	    exprLogicalAnd156=exprLogicalAnd();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_exprLogicalAnd.add(exprLogicalAnd156.getTree());


            	    // AST REWRITE
            	    // elements: exprLogicalAnd, 147, exprLogicalOr
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    if ( state.backtracking==0 ) {
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 447:5: -> ^( E_BINARY '||' $exprLogicalOr exprLogicalAnd )
            	    {
            	        // pol.g:447:8: ^( E_BINARY '||' $exprLogicalOr exprLogicalAnd )
            	        {
            	        Object root_1 = (Object)adaptor.nil();
            	        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(E_BINARY, "E_BINARY"), root_1);

            	        adaptor.addChild(root_1, stream_147.nextNode());
            	        adaptor.addChild(root_1, stream_retval.nextTree());
            	        adaptor.addChild(root_1, stream_exprLogicalAnd.nextTree());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }

            	    retval.tree = root_0;}
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
    // pol.g:450:1: exprLogicalAnd : ( exprBitwiseOr -> exprBitwiseOr ) ( '&&' exprBitwiseOr -> ^( E_BINARY '&&' $exprLogicalAnd exprBitwiseOr ) )* ;
    public final polParser.exprLogicalAnd_return exprLogicalAnd() throws RecognitionException {
        polParser.exprLogicalAnd_return retval = new polParser.exprLogicalAnd_return();
        retval.start = input.LT(1);
        int exprLogicalAnd_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal158=null;
        polParser.exprBitwiseOr_return exprBitwiseOr157 = null;

        polParser.exprBitwiseOr_return exprBitwiseOr159 = null;


        Object string_literal158_tree=null;
        RewriteRuleTokenStream stream_148=new RewriteRuleTokenStream(adaptor,"token 148");
        RewriteRuleSubtreeStream stream_exprBitwiseOr=new RewriteRuleSubtreeStream(adaptor,"rule exprBitwiseOr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 50) ) { return retval; }
            // pol.g:451:2: ( ( exprBitwiseOr -> exprBitwiseOr ) ( '&&' exprBitwiseOr -> ^( E_BINARY '&&' $exprLogicalAnd exprBitwiseOr ) )* )
            // pol.g:451:4: ( exprBitwiseOr -> exprBitwiseOr ) ( '&&' exprBitwiseOr -> ^( E_BINARY '&&' $exprLogicalAnd exprBitwiseOr ) )*
            {
            // pol.g:451:4: ( exprBitwiseOr -> exprBitwiseOr )
            // pol.g:451:5: exprBitwiseOr
            {
            pushFollow(FOLLOW_exprBitwiseOr_in_exprLogicalAnd2431);
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
            // 451:19: -> exprBitwiseOr
            {
                adaptor.addChild(root_0, stream_exprBitwiseOr.nextTree());

            }

            retval.tree = root_0;}
            }

            // pol.g:452:2: ( '&&' exprBitwiseOr -> ^( E_BINARY '&&' $exprLogicalAnd exprBitwiseOr ) )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==148) ) {
                    int LA49_1 = input.LA(2);

                    if ( (synpred84_pol()) ) {
                        alt49=1;
                    }


                }


                switch (alt49) {
            	case 1 :
            	    // pol.g:453:3: '&&' exprBitwiseOr
            	    {
            	    string_literal158=(Token)match(input,148,FOLLOW_148_in_exprLogicalAnd2443); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_148.add(string_literal158);

            	    pushFollow(FOLLOW_exprBitwiseOr_in_exprLogicalAnd2445);
            	    exprBitwiseOr159=exprBitwiseOr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_exprBitwiseOr.add(exprBitwiseOr159.getTree());


            	    // AST REWRITE
            	    // elements: exprLogicalAnd, exprBitwiseOr, 148
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    if ( state.backtracking==0 ) {
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 454:4: -> ^( E_BINARY '&&' $exprLogicalAnd exprBitwiseOr )
            	    {
            	        // pol.g:454:7: ^( E_BINARY '&&' $exprLogicalAnd exprBitwiseOr )
            	        {
            	        Object root_1 = (Object)adaptor.nil();
            	        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(E_BINARY, "E_BINARY"), root_1);

            	        adaptor.addChild(root_1, stream_148.nextNode());
            	        adaptor.addChild(root_1, stream_retval.nextTree());
            	        adaptor.addChild(root_1, stream_exprBitwiseOr.nextTree());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }

            	    retval.tree = root_0;}
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
    // pol.g:457:1: exprBitwiseOr : ( exprBitwiseXor -> exprBitwiseXor ) ( '|' exprBitwiseXor -> ^( E_BINARY '|' $exprBitwiseOr exprBitwiseXor ) )* ;
    public final polParser.exprBitwiseOr_return exprBitwiseOr() throws RecognitionException {
        polParser.exprBitwiseOr_return retval = new polParser.exprBitwiseOr_return();
        retval.start = input.LT(1);
        int exprBitwiseOr_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal161=null;
        polParser.exprBitwiseXor_return exprBitwiseXor160 = null;

        polParser.exprBitwiseXor_return exprBitwiseXor162 = null;


        Object char_literal161_tree=null;
        RewriteRuleTokenStream stream_149=new RewriteRuleTokenStream(adaptor,"token 149");
        RewriteRuleSubtreeStream stream_exprBitwiseXor=new RewriteRuleSubtreeStream(adaptor,"rule exprBitwiseXor");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 51) ) { return retval; }
            // pol.g:458:2: ( ( exprBitwiseXor -> exprBitwiseXor ) ( '|' exprBitwiseXor -> ^( E_BINARY '|' $exprBitwiseOr exprBitwiseXor ) )* )
            // pol.g:458:4: ( exprBitwiseXor -> exprBitwiseXor ) ( '|' exprBitwiseXor -> ^( E_BINARY '|' $exprBitwiseOr exprBitwiseXor ) )*
            {
            // pol.g:458:4: ( exprBitwiseXor -> exprBitwiseXor )
            // pol.g:458:5: exprBitwiseXor
            {
            pushFollow(FOLLOW_exprBitwiseXor_in_exprBitwiseOr2476);
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
            // 458:20: -> exprBitwiseXor
            {
                adaptor.addChild(root_0, stream_exprBitwiseXor.nextTree());

            }

            retval.tree = root_0;}
            }

            // pol.g:459:2: ( '|' exprBitwiseXor -> ^( E_BINARY '|' $exprBitwiseOr exprBitwiseXor ) )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==149) ) {
                    int LA50_2 = input.LA(2);

                    if ( (synpred85_pol()) ) {
                        alt50=1;
                    }


                }


                switch (alt50) {
            	case 1 :
            	    // pol.g:460:3: '|' exprBitwiseXor
            	    {
            	    char_literal161=(Token)match(input,149,FOLLOW_149_in_exprBitwiseOr2488); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_149.add(char_literal161);

            	    pushFollow(FOLLOW_exprBitwiseXor_in_exprBitwiseOr2490);
            	    exprBitwiseXor162=exprBitwiseXor();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_exprBitwiseXor.add(exprBitwiseXor162.getTree());


            	    // AST REWRITE
            	    // elements: exprBitwiseXor, 149, exprBitwiseOr
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    if ( state.backtracking==0 ) {
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 461:3: -> ^( E_BINARY '|' $exprBitwiseOr exprBitwiseXor )
            	    {
            	        // pol.g:461:6: ^( E_BINARY '|' $exprBitwiseOr exprBitwiseXor )
            	        {
            	        Object root_1 = (Object)adaptor.nil();
            	        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(E_BINARY, "E_BINARY"), root_1);

            	        adaptor.addChild(root_1, stream_149.nextNode());
            	        adaptor.addChild(root_1, stream_retval.nextTree());
            	        adaptor.addChild(root_1, stream_exprBitwiseXor.nextTree());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }

            	    retval.tree = root_0;}
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
    // pol.g:464:1: exprBitwiseXor : ( exprBitwiseAnd -> exprBitwiseAnd ) ( '^' exprBitwiseAnd -> ^( E_BINARY '^' $exprBitwiseXor exprBitwiseAnd ) )* ;
    public final polParser.exprBitwiseXor_return exprBitwiseXor() throws RecognitionException {
        polParser.exprBitwiseXor_return retval = new polParser.exprBitwiseXor_return();
        retval.start = input.LT(1);
        int exprBitwiseXor_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal164=null;
        polParser.exprBitwiseAnd_return exprBitwiseAnd163 = null;

        polParser.exprBitwiseAnd_return exprBitwiseAnd165 = null;


        Object char_literal164_tree=null;
        RewriteRuleTokenStream stream_150=new RewriteRuleTokenStream(adaptor,"token 150");
        RewriteRuleSubtreeStream stream_exprBitwiseAnd=new RewriteRuleSubtreeStream(adaptor,"rule exprBitwiseAnd");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 52) ) { return retval; }
            // pol.g:465:2: ( ( exprBitwiseAnd -> exprBitwiseAnd ) ( '^' exprBitwiseAnd -> ^( E_BINARY '^' $exprBitwiseXor exprBitwiseAnd ) )* )
            // pol.g:465:4: ( exprBitwiseAnd -> exprBitwiseAnd ) ( '^' exprBitwiseAnd -> ^( E_BINARY '^' $exprBitwiseXor exprBitwiseAnd ) )*
            {
            // pol.g:465:4: ( exprBitwiseAnd -> exprBitwiseAnd )
            // pol.g:465:5: exprBitwiseAnd
            {
            pushFollow(FOLLOW_exprBitwiseAnd_in_exprBitwiseXor2520);
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
            // 465:20: -> exprBitwiseAnd
            {
                adaptor.addChild(root_0, stream_exprBitwiseAnd.nextTree());

            }

            retval.tree = root_0;}
            }

            // pol.g:466:2: ( '^' exprBitwiseAnd -> ^( E_BINARY '^' $exprBitwiseXor exprBitwiseAnd ) )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==150) ) {
                    int LA51_2 = input.LA(2);

                    if ( (synpred86_pol()) ) {
                        alt51=1;
                    }


                }


                switch (alt51) {
            	case 1 :
            	    // pol.g:467:3: '^' exprBitwiseAnd
            	    {
            	    char_literal164=(Token)match(input,150,FOLLOW_150_in_exprBitwiseXor2532); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_150.add(char_literal164);

            	    pushFollow(FOLLOW_exprBitwiseAnd_in_exprBitwiseXor2534);
            	    exprBitwiseAnd165=exprBitwiseAnd();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_exprBitwiseAnd.add(exprBitwiseAnd165.getTree());


            	    // AST REWRITE
            	    // elements: 150, exprBitwiseXor, exprBitwiseAnd
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    if ( state.backtracking==0 ) {
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 468:3: -> ^( E_BINARY '^' $exprBitwiseXor exprBitwiseAnd )
            	    {
            	        // pol.g:468:6: ^( E_BINARY '^' $exprBitwiseXor exprBitwiseAnd )
            	        {
            	        Object root_1 = (Object)adaptor.nil();
            	        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(E_BINARY, "E_BINARY"), root_1);

            	        adaptor.addChild(root_1, stream_150.nextNode());
            	        adaptor.addChild(root_1, stream_retval.nextTree());
            	        adaptor.addChild(root_1, stream_exprBitwiseAnd.nextTree());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }

            	    retval.tree = root_0;}
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
    // pol.g:471:1: exprBitwiseAnd : ( exprEquality -> exprEquality ) ( '&' exprEquality -> ^( E_BINARY '&' $exprBitwiseAnd exprEquality ) )* ;
    public final polParser.exprBitwiseAnd_return exprBitwiseAnd() throws RecognitionException {
        polParser.exprBitwiseAnd_return retval = new polParser.exprBitwiseAnd_return();
        retval.start = input.LT(1);
        int exprBitwiseAnd_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal167=null;
        polParser.exprEquality_return exprEquality166 = null;

        polParser.exprEquality_return exprEquality168 = null;


        Object char_literal167_tree=null;
        RewriteRuleTokenStream stream_151=new RewriteRuleTokenStream(adaptor,"token 151");
        RewriteRuleSubtreeStream stream_exprEquality=new RewriteRuleSubtreeStream(adaptor,"rule exprEquality");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 53) ) { return retval; }
            // pol.g:472:2: ( ( exprEquality -> exprEquality ) ( '&' exprEquality -> ^( E_BINARY '&' $exprBitwiseAnd exprEquality ) )* )
            // pol.g:472:4: ( exprEquality -> exprEquality ) ( '&' exprEquality -> ^( E_BINARY '&' $exprBitwiseAnd exprEquality ) )*
            {
            // pol.g:472:4: ( exprEquality -> exprEquality )
            // pol.g:472:5: exprEquality
            {
            pushFollow(FOLLOW_exprEquality_in_exprBitwiseAnd2564);
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
            // 472:18: -> exprEquality
            {
                adaptor.addChild(root_0, stream_exprEquality.nextTree());

            }

            retval.tree = root_0;}
            }

            // pol.g:473:2: ( '&' exprEquality -> ^( E_BINARY '&' $exprBitwiseAnd exprEquality ) )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==151) ) {
                    int LA52_2 = input.LA(2);

                    if ( (synpred87_pol()) ) {
                        alt52=1;
                    }


                }


                switch (alt52) {
            	case 1 :
            	    // pol.g:474:3: '&' exprEquality
            	    {
            	    char_literal167=(Token)match(input,151,FOLLOW_151_in_exprBitwiseAnd2576); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_151.add(char_literal167);

            	    pushFollow(FOLLOW_exprEquality_in_exprBitwiseAnd2578);
            	    exprEquality168=exprEquality();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_exprEquality.add(exprEquality168.getTree());


            	    // AST REWRITE
            	    // elements: exprBitwiseAnd, exprEquality, 151
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    if ( state.backtracking==0 ) {
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 475:3: -> ^( E_BINARY '&' $exprBitwiseAnd exprEquality )
            	    {
            	        // pol.g:475:6: ^( E_BINARY '&' $exprBitwiseAnd exprEquality )
            	        {
            	        Object root_1 = (Object)adaptor.nil();
            	        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(E_BINARY, "E_BINARY"), root_1);

            	        adaptor.addChild(root_1, stream_151.nextNode());
            	        adaptor.addChild(root_1, stream_retval.nextTree());
            	        adaptor.addChild(root_1, stream_exprEquality.nextTree());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }

            	    retval.tree = root_0;}
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
    // pol.g:478:1: exprEquality : ( exprRelational -> exprRelational ) ( equalityOp exprRelational -> ^( E_BINARY equalityOp $exprEquality exprRelational ) )* ;
    public final polParser.exprEquality_return exprEquality() throws RecognitionException {
        polParser.exprEquality_return retval = new polParser.exprEquality_return();
        retval.start = input.LT(1);
        int exprEquality_StartIndex = input.index();
        Object root_0 = null;

        polParser.exprRelational_return exprRelational169 = null;

        polParser.equalityOp_return equalityOp170 = null;

        polParser.exprRelational_return exprRelational171 = null;


        RewriteRuleSubtreeStream stream_equalityOp=new RewriteRuleSubtreeStream(adaptor,"rule equalityOp");
        RewriteRuleSubtreeStream stream_exprRelational=new RewriteRuleSubtreeStream(adaptor,"rule exprRelational");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 54) ) { return retval; }
            // pol.g:479:2: ( ( exprRelational -> exprRelational ) ( equalityOp exprRelational -> ^( E_BINARY equalityOp $exprEquality exprRelational ) )* )
            // pol.g:479:4: ( exprRelational -> exprRelational ) ( equalityOp exprRelational -> ^( E_BINARY equalityOp $exprEquality exprRelational ) )*
            {
            // pol.g:479:4: ( exprRelational -> exprRelational )
            // pol.g:479:5: exprRelational
            {
            pushFollow(FOLLOW_exprRelational_in_exprEquality2608);
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
            // 479:20: -> exprRelational
            {
                adaptor.addChild(root_0, stream_exprRelational.nextTree());

            }

            retval.tree = root_0;}
            }

            // pol.g:480:2: ( equalityOp exprRelational -> ^( E_BINARY equalityOp $exprEquality exprRelational ) )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( ((LA53_0>=EQ && LA53_0<=NOT_EQ)) ) {
                    int LA53_1 = input.LA(2);

                    if ( (synpred88_pol()) ) {
                        alt53=1;
                    }


                }


                switch (alt53) {
            	case 1 :
            	    // pol.g:481:3: equalityOp exprRelational
            	    {
            	    pushFollow(FOLLOW_equalityOp_in_exprEquality2621);
            	    equalityOp170=equalityOp();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_equalityOp.add(equalityOp170.getTree());
            	    pushFollow(FOLLOW_exprRelational_in_exprEquality2623);
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
            	    // 482:3: -> ^( E_BINARY equalityOp $exprEquality exprRelational )
            	    {
            	        // pol.g:482:6: ^( E_BINARY equalityOp $exprEquality exprRelational )
            	        {
            	        Object root_1 = (Object)adaptor.nil();
            	        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(E_BINARY, "E_BINARY"), root_1);

            	        adaptor.addChild(root_1, stream_equalityOp.nextTree());
            	        adaptor.addChild(root_1, stream_retval.nextTree());
            	        adaptor.addChild(root_1, stream_exprRelational.nextTree());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }

            	    retval.tree = root_0;}
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
    // pol.g:485:1: exprRelational : ( exprShift -> exprShift ) ( relationalOp exprShift -> ^( E_BINARY relationalOp $exprRelational exprShift ) )* ;
    public final polParser.exprRelational_return exprRelational() throws RecognitionException {
        polParser.exprRelational_return retval = new polParser.exprRelational_return();
        retval.start = input.LT(1);
        int exprRelational_StartIndex = input.index();
        Object root_0 = null;

        polParser.exprShift_return exprShift172 = null;

        polParser.relationalOp_return relationalOp173 = null;

        polParser.exprShift_return exprShift174 = null;


        RewriteRuleSubtreeStream stream_relationalOp=new RewriteRuleSubtreeStream(adaptor,"rule relationalOp");
        RewriteRuleSubtreeStream stream_exprShift=new RewriteRuleSubtreeStream(adaptor,"rule exprShift");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 55) ) { return retval; }
            // pol.g:486:2: ( ( exprShift -> exprShift ) ( relationalOp exprShift -> ^( E_BINARY relationalOp $exprRelational exprShift ) )* )
            // pol.g:486:4: ( exprShift -> exprShift ) ( relationalOp exprShift -> ^( E_BINARY relationalOp $exprRelational exprShift ) )*
            {
            // pol.g:486:4: ( exprShift -> exprShift )
            // pol.g:486:5: exprShift
            {
            pushFollow(FOLLOW_exprShift_in_exprRelational2653);
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
            // 486:15: -> exprShift
            {
                adaptor.addChild(root_0, stream_exprShift.nextTree());

            }

            retval.tree = root_0;}
            }

            // pol.g:487:2: ( relationalOp exprShift -> ^( E_BINARY relationalOp $exprRelational exprShift ) )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( ((LA54_0>=LT_EQ && LA54_0<=GT_EQ)||(LA54_0>=138 && LA54_0<=139)) ) {
                    int LA54_2 = input.LA(2);

                    if ( (synpred89_pol()) ) {
                        alt54=1;
                    }


                }


                switch (alt54) {
            	case 1 :
            	    // pol.g:488:3: relationalOp exprShift
            	    {
            	    pushFollow(FOLLOW_relationalOp_in_exprRelational2666);
            	    relationalOp173=relationalOp();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_relationalOp.add(relationalOp173.getTree());
            	    pushFollow(FOLLOW_exprShift_in_exprRelational2668);
            	    exprShift174=exprShift();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_exprShift.add(exprShift174.getTree());


            	    // AST REWRITE
            	    // elements: exprRelational, relationalOp, exprShift
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    if ( state.backtracking==0 ) {
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 489:3: -> ^( E_BINARY relationalOp $exprRelational exprShift )
            	    {
            	        // pol.g:489:6: ^( E_BINARY relationalOp $exprRelational exprShift )
            	        {
            	        Object root_1 = (Object)adaptor.nil();
            	        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(E_BINARY, "E_BINARY"), root_1);

            	        adaptor.addChild(root_1, stream_relationalOp.nextTree());
            	        adaptor.addChild(root_1, stream_retval.nextTree());
            	        adaptor.addChild(root_1, stream_exprShift.nextTree());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }

            	    retval.tree = root_0;}
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
    // pol.g:492:1: exprShift : ( exprAddSub -> exprAddSub ) ( shiftOp exprAddSub -> ^( E_BINARY shiftOp $exprShift exprAddSub ) )* ;
    public final polParser.exprShift_return exprShift() throws RecognitionException {
        polParser.exprShift_return retval = new polParser.exprShift_return();
        retval.start = input.LT(1);
        int exprShift_StartIndex = input.index();
        Object root_0 = null;

        polParser.exprAddSub_return exprAddSub175 = null;

        polParser.shiftOp_return shiftOp176 = null;

        polParser.exprAddSub_return exprAddSub177 = null;


        RewriteRuleSubtreeStream stream_shiftOp=new RewriteRuleSubtreeStream(adaptor,"rule shiftOp");
        RewriteRuleSubtreeStream stream_exprAddSub=new RewriteRuleSubtreeStream(adaptor,"rule exprAddSub");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 56) ) { return retval; }
            // pol.g:493:2: ( ( exprAddSub -> exprAddSub ) ( shiftOp exprAddSub -> ^( E_BINARY shiftOp $exprShift exprAddSub ) )* )
            // pol.g:493:4: ( exprAddSub -> exprAddSub ) ( shiftOp exprAddSub -> ^( E_BINARY shiftOp $exprShift exprAddSub ) )*
            {
            // pol.g:493:4: ( exprAddSub -> exprAddSub )
            // pol.g:493:5: exprAddSub
            {
            pushFollow(FOLLOW_exprAddSub_in_exprShift2699);
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
            // 493:16: -> exprAddSub
            {
                adaptor.addChild(root_0, stream_exprAddSub.nextTree());

            }

            retval.tree = root_0;}
            }

            // pol.g:494:2: ( shiftOp exprAddSub -> ^( E_BINARY shiftOp $exprShift exprAddSub ) )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( ((LA55_0>=140 && LA55_0<=141)) ) {
                    int LA55_2 = input.LA(2);

                    if ( (synpred90_pol()) ) {
                        alt55=1;
                    }


                }


                switch (alt55) {
            	case 1 :
            	    // pol.g:495:3: shiftOp exprAddSub
            	    {
            	    pushFollow(FOLLOW_shiftOp_in_exprShift2712);
            	    shiftOp176=shiftOp();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_shiftOp.add(shiftOp176.getTree());
            	    pushFollow(FOLLOW_exprAddSub_in_exprShift2715);
            	    exprAddSub177=exprAddSub();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_exprAddSub.add(exprAddSub177.getTree());


            	    // AST REWRITE
            	    // elements: exprAddSub, shiftOp, exprShift
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    if ( state.backtracking==0 ) {
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 496:3: -> ^( E_BINARY shiftOp $exprShift exprAddSub )
            	    {
            	        // pol.g:496:6: ^( E_BINARY shiftOp $exprShift exprAddSub )
            	        {
            	        Object root_1 = (Object)adaptor.nil();
            	        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(E_BINARY, "E_BINARY"), root_1);

            	        adaptor.addChild(root_1, stream_shiftOp.nextTree());
            	        adaptor.addChild(root_1, stream_retval.nextTree());
            	        adaptor.addChild(root_1, stream_exprAddSub.nextTree());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }

            	    retval.tree = root_0;}
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
    // pol.g:499:1: exprAddSub : ( exprMultDiv -> exprMultDiv ) ( addSubOp exprMultDiv -> ^( E_BINARY addSubOp $exprAddSub exprMultDiv ) )* ;
    public final polParser.exprAddSub_return exprAddSub() throws RecognitionException {
        polParser.exprAddSub_return retval = new polParser.exprAddSub_return();
        retval.start = input.LT(1);
        int exprAddSub_StartIndex = input.index();
        Object root_0 = null;

        polParser.exprMultDiv_return exprMultDiv178 = null;

        polParser.addSubOp_return addSubOp179 = null;

        polParser.exprMultDiv_return exprMultDiv180 = null;


        RewriteRuleSubtreeStream stream_addSubOp=new RewriteRuleSubtreeStream(adaptor,"rule addSubOp");
        RewriteRuleSubtreeStream stream_exprMultDiv=new RewriteRuleSubtreeStream(adaptor,"rule exprMultDiv");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 57) ) { return retval; }
            // pol.g:500:2: ( ( exprMultDiv -> exprMultDiv ) ( addSubOp exprMultDiv -> ^( E_BINARY addSubOp $exprAddSub exprMultDiv ) )* )
            // pol.g:500:4: ( exprMultDiv -> exprMultDiv ) ( addSubOp exprMultDiv -> ^( E_BINARY addSubOp $exprAddSub exprMultDiv ) )*
            {
            // pol.g:500:4: ( exprMultDiv -> exprMultDiv )
            // pol.g:500:5: exprMultDiv
            {
            pushFollow(FOLLOW_exprMultDiv_in_exprAddSub2746);
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
            // 500:17: -> exprMultDiv
            {
                adaptor.addChild(root_0, stream_exprMultDiv.nextTree());

            }

            retval.tree = root_0;}
            }

            // pol.g:501:2: ( addSubOp exprMultDiv -> ^( E_BINARY addSubOp $exprAddSub exprMultDiv ) )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( ((LA56_0>=PLUS && LA56_0<=MINUS)) ) {
                    int LA56_2 = input.LA(2);

                    if ( (synpred91_pol()) ) {
                        alt56=1;
                    }


                }


                switch (alt56) {
            	case 1 :
            	    // pol.g:502:3: addSubOp exprMultDiv
            	    {
            	    pushFollow(FOLLOW_addSubOp_in_exprAddSub2758);
            	    addSubOp179=addSubOp();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_addSubOp.add(addSubOp179.getTree());
            	    pushFollow(FOLLOW_exprMultDiv_in_exprAddSub2760);
            	    exprMultDiv180=exprMultDiv();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_exprMultDiv.add(exprMultDiv180.getTree());


            	    // AST REWRITE
            	    // elements: addSubOp, exprAddSub, exprMultDiv
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    if ( state.backtracking==0 ) {
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 503:3: -> ^( E_BINARY addSubOp $exprAddSub exprMultDiv )
            	    {
            	        // pol.g:503:6: ^( E_BINARY addSubOp $exprAddSub exprMultDiv )
            	        {
            	        Object root_1 = (Object)adaptor.nil();
            	        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(E_BINARY, "E_BINARY"), root_1);

            	        adaptor.addChild(root_1, stream_addSubOp.nextTree());
            	        adaptor.addChild(root_1, stream_retval.nextTree());
            	        adaptor.addChild(root_1, stream_exprMultDiv.nextTree());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }

            	    retval.tree = root_0;}
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
    // pol.g:506:1: exprMultDiv : ( exprUnary -> exprUnary ) ( multDivModOp exprUnary -> ^( E_BINARY multDivModOp $exprMultDiv exprUnary ) )* ;
    public final polParser.exprMultDiv_return exprMultDiv() throws RecognitionException {
        polParser.exprMultDiv_return retval = new polParser.exprMultDiv_return();
        retval.start = input.LT(1);
        int exprMultDiv_StartIndex = input.index();
        Object root_0 = null;

        polParser.exprUnary_return exprUnary181 = null;

        polParser.multDivModOp_return multDivModOp182 = null;

        polParser.exprUnary_return exprUnary183 = null;


        RewriteRuleSubtreeStream stream_multDivModOp=new RewriteRuleSubtreeStream(adaptor,"rule multDivModOp");
        RewriteRuleSubtreeStream stream_exprUnary=new RewriteRuleSubtreeStream(adaptor,"rule exprUnary");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 58) ) { return retval; }
            // pol.g:507:2: ( ( exprUnary -> exprUnary ) ( multDivModOp exprUnary -> ^( E_BINARY multDivModOp $exprMultDiv exprUnary ) )* )
            // pol.g:507:4: ( exprUnary -> exprUnary ) ( multDivModOp exprUnary -> ^( E_BINARY multDivModOp $exprMultDiv exprUnary ) )*
            {
            // pol.g:507:4: ( exprUnary -> exprUnary )
            // pol.g:507:5: exprUnary
            {
            pushFollow(FOLLOW_exprUnary_in_exprMultDiv2793);
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
            // 507:15: -> exprUnary
            {
                adaptor.addChild(root_0, stream_exprUnary.nextTree());

            }

            retval.tree = root_0;}
            }

            // pol.g:508:2: ( multDivModOp exprUnary -> ^( E_BINARY multDivModOp $exprMultDiv exprUnary ) )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( ((LA57_0>=142 && LA57_0<=144)) ) {
                    int LA57_2 = input.LA(2);

                    if ( (synpred92_pol()) ) {
                        alt57=1;
                    }


                }


                switch (alt57) {
            	case 1 :
            	    // pol.g:509:3: multDivModOp exprUnary
            	    {
            	    pushFollow(FOLLOW_multDivModOp_in_exprMultDiv2805);
            	    multDivModOp182=multDivModOp();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_multDivModOp.add(multDivModOp182.getTree());
            	    pushFollow(FOLLOW_exprUnary_in_exprMultDiv2807);
            	    exprUnary183=exprUnary();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_exprUnary.add(exprUnary183.getTree());


            	    // AST REWRITE
            	    // elements: exprMultDiv, multDivModOp, exprUnary
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    if ( state.backtracking==0 ) {
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 510:3: -> ^( E_BINARY multDivModOp $exprMultDiv exprUnary )
            	    {
            	        // pol.g:510:6: ^( E_BINARY multDivModOp $exprMultDiv exprUnary )
            	        {
            	        Object root_1 = (Object)adaptor.nil();
            	        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(E_BINARY, "E_BINARY"), root_1);

            	        adaptor.addChild(root_1, stream_multDivModOp.nextTree());
            	        adaptor.addChild(root_1, stream_retval.nextTree());
            	        adaptor.addChild(root_1, stream_exprUnary.nextTree());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }

            	    retval.tree = root_0;}
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
    // pol.g:513:1: exprNew : 'new' typeName fcnArgumentList -> ^( E_NEW typeName fcnArgumentList ) ;
    public final polParser.exprNew_return exprNew() throws RecognitionException {
        polParser.exprNew_return retval = new polParser.exprNew_return();
        retval.start = input.LT(1);
        int exprNew_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal184=null;
        polParser.typeName_return typeName185 = null;

        polParser.fcnArgumentList_return fcnArgumentList186 = null;


        Object string_literal184_tree=null;
        RewriteRuleTokenStream stream_152=new RewriteRuleTokenStream(adaptor,"token 152");
        RewriteRuleSubtreeStream stream_typeName=new RewriteRuleSubtreeStream(adaptor,"rule typeName");
        RewriteRuleSubtreeStream stream_fcnArgumentList=new RewriteRuleSubtreeStream(adaptor,"rule fcnArgumentList");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 59) ) { return retval; }
            // pol.g:514:2: ( 'new' typeName fcnArgumentList -> ^( E_NEW typeName fcnArgumentList ) )
            // pol.g:514:4: 'new' typeName fcnArgumentList
            {
            string_literal184=(Token)match(input,152,FOLLOW_152_in_exprNew2836); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_152.add(string_literal184);

            pushFollow(FOLLOW_typeName_in_exprNew2838);
            typeName185=typeName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeName.add(typeName185.getTree());
            pushFollow(FOLLOW_fcnArgumentList_in_exprNew2840);
            fcnArgumentList186=fcnArgumentList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_fcnArgumentList.add(fcnArgumentList186.getTree());


            // AST REWRITE
            // elements: typeName, fcnArgumentList
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 514:35: -> ^( E_NEW typeName fcnArgumentList )
            {
                // pol.g:514:38: ^( E_NEW typeName fcnArgumentList )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(E_NEW, "E_NEW"), root_1);

                adaptor.addChild(root_1, stream_typeName.nextTree());
                adaptor.addChild(root_1, stream_fcnArgumentList.nextTree());

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
    // pol.g:516:1: exprUnary : ( primitiveLit | injectionCode | arrayLit -> ^( E_VEC arrayLit ) | logicalNotOp expr -> ^( E_UNARY logicalNotOp expr ) | bitwiseNotOp expr -> ^( E_UNARY bitwiseNotOp expr ) | '(' expr ')' -> ^( E_PAREN expr ) | MINUS expr -> ^( E_UNARY MINUS expr ) | varOrFcnOrArray incDecOp -> ^( E_UNARY varOrFcnOrArray incDecOp ) | varOrFcnOrArray | incDecOp varOrFcnOrArray -> ^( E_UNARY varOrFcnOrArray incDecOp ) | exprNew );
    public final polParser.exprUnary_return exprUnary() throws RecognitionException {
        polParser.exprUnary_return retval = new polParser.exprUnary_return();
        retval.start = input.LT(1);
        int exprUnary_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal194=null;
        Token char_literal196=null;
        Token MINUS197=null;
        polParser.primitiveLit_return primitiveLit187 = null;

        polParser.injectionCode_return injectionCode188 = null;

        polParser.arrayLit_return arrayLit189 = null;

        polParser.logicalNotOp_return logicalNotOp190 = null;

        polParser.expr_return expr191 = null;

        polParser.bitwiseNotOp_return bitwiseNotOp192 = null;

        polParser.expr_return expr193 = null;

        polParser.expr_return expr195 = null;

        polParser.expr_return expr198 = null;

        polParser.varOrFcnOrArray_return varOrFcnOrArray199 = null;

        polParser.incDecOp_return incDecOp200 = null;

        polParser.varOrFcnOrArray_return varOrFcnOrArray201 = null;

        polParser.incDecOp_return incDecOp202 = null;

        polParser.varOrFcnOrArray_return varOrFcnOrArray203 = null;

        polParser.exprNew_return exprNew204 = null;


        Object char_literal194_tree=null;
        Object char_literal196_tree=null;
        Object MINUS197_tree=null;
        RewriteRuleTokenStream stream_153=new RewriteRuleTokenStream(adaptor,"token 153");
        RewriteRuleTokenStream stream_MINUS=new RewriteRuleTokenStream(adaptor,"token MINUS");
        RewriteRuleTokenStream stream_154=new RewriteRuleTokenStream(adaptor,"token 154");
        RewriteRuleSubtreeStream stream_arrayLit=new RewriteRuleSubtreeStream(adaptor,"rule arrayLit");
        RewriteRuleSubtreeStream stream_incDecOp=new RewriteRuleSubtreeStream(adaptor,"rule incDecOp");
        RewriteRuleSubtreeStream stream_logicalNotOp=new RewriteRuleSubtreeStream(adaptor,"rule logicalNotOp");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_varOrFcnOrArray=new RewriteRuleSubtreeStream(adaptor,"rule varOrFcnOrArray");
        RewriteRuleSubtreeStream stream_bitwiseNotOp=new RewriteRuleSubtreeStream(adaptor,"rule bitwiseNotOp");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 60) ) { return retval; }
            // pol.g:517:2: ( primitiveLit | injectionCode | arrayLit -> ^( E_VEC arrayLit ) | logicalNotOp expr -> ^( E_UNARY logicalNotOp expr ) | bitwiseNotOp expr -> ^( E_UNARY bitwiseNotOp expr ) | '(' expr ')' -> ^( E_PAREN expr ) | MINUS expr -> ^( E_UNARY MINUS expr ) | varOrFcnOrArray incDecOp -> ^( E_UNARY varOrFcnOrArray incDecOp ) | varOrFcnOrArray | incDecOp varOrFcnOrArray -> ^( E_UNARY varOrFcnOrArray incDecOp ) | exprNew )
            int alt58=11;
            alt58 = dfa58.predict(input);
            switch (alt58) {
                case 1 :
                    // pol.g:517:4: primitiveLit
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_primitiveLit_in_exprUnary2860);
                    primitiveLit187=primitiveLit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveLit187.getTree());

                    }
                    break;
                case 2 :
                    // pol.g:518:4: injectionCode
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_injectionCode_in_exprUnary2865);
                    injectionCode188=injectionCode();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, injectionCode188.getTree());

                    }
                    break;
                case 3 :
                    // pol.g:519:4: arrayLit
                    {
                    pushFollow(FOLLOW_arrayLit_in_exprUnary2870);
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
                    // 519:18: -> ^( E_VEC arrayLit )
                    {
                        // pol.g:519:21: ^( E_VEC arrayLit )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(E_VEC, "E_VEC"), root_1);

                        adaptor.addChild(root_1, stream_arrayLit.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // pol.g:520:4: logicalNotOp expr
                    {
                    pushFollow(FOLLOW_logicalNotOp_in_exprUnary2888);
                    logicalNotOp190=logicalNotOp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_logicalNotOp.add(logicalNotOp190.getTree());
                    pushFollow(FOLLOW_expr_in_exprUnary2890);
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
                    // 520:25: -> ^( E_UNARY logicalNotOp expr )
                    {
                        // pol.g:520:28: ^( E_UNARY logicalNotOp expr )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(E_UNARY, "E_UNARY"), root_1);

                        adaptor.addChild(root_1, stream_logicalNotOp.nextTree());
                        adaptor.addChild(root_1, stream_expr.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // pol.g:521:4: bitwiseNotOp expr
                    {
                    pushFollow(FOLLOW_bitwiseNotOp_in_exprUnary2908);
                    bitwiseNotOp192=bitwiseNotOp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_bitwiseNotOp.add(bitwiseNotOp192.getTree());
                    pushFollow(FOLLOW_expr_in_exprUnary2910);
                    expr193=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr193.getTree());


                    // AST REWRITE
                    // elements: expr, bitwiseNotOp
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 521:25: -> ^( E_UNARY bitwiseNotOp expr )
                    {
                        // pol.g:521:28: ^( E_UNARY bitwiseNotOp expr )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(E_UNARY, "E_UNARY"), root_1);

                        adaptor.addChild(root_1, stream_bitwiseNotOp.nextTree());
                        adaptor.addChild(root_1, stream_expr.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 6 :
                    // pol.g:522:4: '(' expr ')'
                    {
                    char_literal194=(Token)match(input,153,FOLLOW_153_in_exprUnary2928); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_153.add(char_literal194);

                    pushFollow(FOLLOW_expr_in_exprUnary2930);
                    expr195=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr195.getTree());
                    char_literal196=(Token)match(input,154,FOLLOW_154_in_exprUnary2932); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_154.add(char_literal196);



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
                    // 522:20: -> ^( E_PAREN expr )
                    {
                        // pol.g:522:23: ^( E_PAREN expr )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(E_PAREN, "E_PAREN"), root_1);

                        adaptor.addChild(root_1, stream_expr.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 7 :
                    // pol.g:523:4: MINUS expr
                    {
                    MINUS197=(Token)match(input,MINUS,FOLLOW_MINUS_in_exprUnary2948); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MINUS.add(MINUS197);

                    pushFollow(FOLLOW_expr_in_exprUnary2950);
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
                    // 523:19: -> ^( E_UNARY MINUS expr )
                    {
                        // pol.g:523:22: ^( E_UNARY MINUS expr )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(E_UNARY, "E_UNARY"), root_1);

                        adaptor.addChild(root_1, stream_MINUS.nextNode());
                        adaptor.addChild(root_1, stream_expr.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 8 :
                    // pol.g:524:4: varOrFcnOrArray incDecOp
                    {
                    pushFollow(FOLLOW_varOrFcnOrArray_in_exprUnary2969);
                    varOrFcnOrArray199=varOrFcnOrArray();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_varOrFcnOrArray.add(varOrFcnOrArray199.getTree());
                    pushFollow(FOLLOW_incDecOp_in_exprUnary2971);
                    incDecOp200=incDecOp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_incDecOp.add(incDecOp200.getTree());


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

                    root_0 = (Object)adaptor.nil();
                    // 524:29: -> ^( E_UNARY varOrFcnOrArray incDecOp )
                    {
                        // pol.g:524:32: ^( E_UNARY varOrFcnOrArray incDecOp )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(E_UNARY, "E_UNARY"), root_1);

                        adaptor.addChild(root_1, stream_varOrFcnOrArray.nextTree());
                        adaptor.addChild(root_1, stream_incDecOp.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 9 :
                    // pol.g:525:4: varOrFcnOrArray
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_varOrFcnOrArray_in_exprUnary2986);
                    varOrFcnOrArray201=varOrFcnOrArray();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varOrFcnOrArray201.getTree());

                    }
                    break;
                case 10 :
                    // pol.g:526:4: incDecOp varOrFcnOrArray
                    {
                    pushFollow(FOLLOW_incDecOp_in_exprUnary2991);
                    incDecOp202=incDecOp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_incDecOp.add(incDecOp202.getTree());
                    pushFollow(FOLLOW_varOrFcnOrArray_in_exprUnary2993);
                    varOrFcnOrArray203=varOrFcnOrArray();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_varOrFcnOrArray.add(varOrFcnOrArray203.getTree());


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

                    root_0 = (Object)adaptor.nil();
                    // 526:29: -> ^( E_UNARY varOrFcnOrArray incDecOp )
                    {
                        // pol.g:526:32: ^( E_UNARY varOrFcnOrArray incDecOp )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(E_UNARY, "E_UNARY"), root_1);

                        adaptor.addChild(root_1, stream_varOrFcnOrArray.nextTree());
                        adaptor.addChild(root_1, stream_incDecOp.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 11 :
                    // pol.g:527:4: exprNew
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_exprNew_in_exprUnary3008);
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
    // pol.g:529:1: fcnDefinition : ( 'public' )? ( 'host' )? fcnType_fcnName fcnFormalParameterList fcnBody -> ^( D_FCN_DEF fcnType_fcnName fcnFormalParameterList fcnBody ) ;
    public final polParser.fcnDefinition_return fcnDefinition() throws RecognitionException {
        polParser.fcnDefinition_return retval = new polParser.fcnDefinition_return();
        retval.start = input.LT(1);
        int fcnDefinition_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal205=null;
        Token string_literal206=null;
        polParser.fcnType_fcnName_return fcnType_fcnName207 = null;

        polParser.fcnFormalParameterList_return fcnFormalParameterList208 = null;

        polParser.fcnBody_return fcnBody209 = null;


        Object string_literal205_tree=null;
        Object string_literal206_tree=null;
        RewriteRuleTokenStream stream_156=new RewriteRuleTokenStream(adaptor,"token 156");
        RewriteRuleTokenStream stream_155=new RewriteRuleTokenStream(adaptor,"token 155");
        RewriteRuleSubtreeStream stream_fcnFormalParameterList=new RewriteRuleSubtreeStream(adaptor,"rule fcnFormalParameterList");
        RewriteRuleSubtreeStream stream_fcnType_fcnName=new RewriteRuleSubtreeStream(adaptor,"rule fcnType_fcnName");
        RewriteRuleSubtreeStream stream_fcnBody=new RewriteRuleSubtreeStream(adaptor,"rule fcnBody");

        	atFlags.clear();			

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 61) ) { return retval; }
            // pol.g:536:2: ( ( 'public' )? ( 'host' )? fcnType_fcnName fcnFormalParameterList fcnBody -> ^( D_FCN_DEF fcnType_fcnName fcnFormalParameterList fcnBody ) )
            // pol.g:536:4: ( 'public' )? ( 'host' )? fcnType_fcnName fcnFormalParameterList fcnBody
            {
            // pol.g:536:4: ( 'public' )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==155) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // pol.g:536:5: 'public'
                    {
                    string_literal205=(Token)match(input,155,FOLLOW_155_in_fcnDefinition3028); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_155.add(string_literal205);

                    if ( state.backtracking==0 ) {
                       atFlags.add(AttrFlags.PUBLIC); 
                    }

                    }
                    break;

            }

            // pol.g:537:3: ( 'host' )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==156) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // pol.g:537:4: 'host'
                    {
                    string_literal206=(Token)match(input,156,FOLLOW_156_in_fcnDefinition3039); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_156.add(string_literal206);

                    if ( state.backtracking==0 ) {
                       atFlags.add(AttrFlags.HOST); 
                    }

                    }
                    break;

            }

            pushFollow(FOLLOW_fcnType_fcnName_in_fcnDefinition3049);
            fcnType_fcnName207=fcnType_fcnName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_fcnType_fcnName.add(fcnType_fcnName207.getTree());
            pushFollow(FOLLOW_fcnFormalParameterList_in_fcnDefinition3051);
            fcnFormalParameterList208=fcnFormalParameterList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_fcnFormalParameterList.add(fcnFormalParameterList208.getTree());
            pushFollow(FOLLOW_fcnBody_in_fcnDefinition3053);
            fcnBody209=fcnBody();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_fcnBody.add(fcnBody209.getTree());


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
            // 539:3: -> ^( D_FCN_DEF fcnType_fcnName fcnFormalParameterList fcnBody )
            {
                // pol.g:539:6: ^( D_FCN_DEF fcnType_fcnName fcnFormalParameterList fcnBody )
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
    // pol.g:541:1: fcnDefinitionHost : ( 'public' )? ( 'host' )? fcnType_fcnName fcnFormalParameterList fcnBody -> ^( D_FCN_DEF fcnType_fcnName fcnFormalParameterList fcnBody ) ;
    public final polParser.fcnDefinitionHost_return fcnDefinitionHost() throws RecognitionException {
        polParser.fcnDefinitionHost_return retval = new polParser.fcnDefinitionHost_return();
        retval.start = input.LT(1);
        int fcnDefinitionHost_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal210=null;
        Token string_literal211=null;
        polParser.fcnType_fcnName_return fcnType_fcnName212 = null;

        polParser.fcnFormalParameterList_return fcnFormalParameterList213 = null;

        polParser.fcnBody_return fcnBody214 = null;


        Object string_literal210_tree=null;
        Object string_literal211_tree=null;
        RewriteRuleTokenStream stream_156=new RewriteRuleTokenStream(adaptor,"token 156");
        RewriteRuleTokenStream stream_155=new RewriteRuleTokenStream(adaptor,"token 155");
        RewriteRuleSubtreeStream stream_fcnFormalParameterList=new RewriteRuleSubtreeStream(adaptor,"rule fcnFormalParameterList");
        RewriteRuleSubtreeStream stream_fcnType_fcnName=new RewriteRuleSubtreeStream(adaptor,"rule fcnType_fcnName");
        RewriteRuleSubtreeStream stream_fcnBody=new RewriteRuleSubtreeStream(adaptor,"rule fcnBody");

        	atFlags.clear();			

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 62) ) { return retval; }
            // pol.g:549:2: ( ( 'public' )? ( 'host' )? fcnType_fcnName fcnFormalParameterList fcnBody -> ^( D_FCN_DEF fcnType_fcnName fcnFormalParameterList fcnBody ) )
            // pol.g:549:4: ( 'public' )? ( 'host' )? fcnType_fcnName fcnFormalParameterList fcnBody
            {
            // pol.g:549:4: ( 'public' )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==155) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // pol.g:549:5: 'public'
                    {
                    string_literal210=(Token)match(input,155,FOLLOW_155_in_fcnDefinitionHost3089); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_155.add(string_literal210);


                    }
                    break;

            }

            // pol.g:549:16: ( 'host' )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==156) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // pol.g:549:17: 'host'
                    {
                    string_literal211=(Token)match(input,156,FOLLOW_156_in_fcnDefinitionHost3094); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_156.add(string_literal211);

                    if ( state.backtracking==0 ) {
                       atFlags.add(AttrFlags.HOST); 
                    }

                    }
                    break;

            }

            pushFollow(FOLLOW_fcnType_fcnName_in_fcnDefinitionHost3105);
            fcnType_fcnName212=fcnType_fcnName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_fcnType_fcnName.add(fcnType_fcnName212.getTree());
            pushFollow(FOLLOW_fcnFormalParameterList_in_fcnDefinitionHost3108);
            fcnFormalParameterList213=fcnFormalParameterList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_fcnFormalParameterList.add(fcnFormalParameterList213.getTree());
            pushFollow(FOLLOW_fcnBody_in_fcnDefinitionHost3110);
            fcnBody214=fcnBody();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_fcnBody.add(fcnBody214.getTree());
            if ( state.backtracking==0 ) {
               	atFlags.add(AttrFlags.PUBLIC); /* enforce */ 	
              			if (!atFlags.contains(AttrFlags.HOST))
                     		throw new PollenException("Composition features must be one of host functions, export statements, or enum definitions.", input);
              		
            }


            // AST REWRITE
            // elements: fcnFormalParameterList, fcnBody, fcnType_fcnName
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 555:3: -> ^( D_FCN_DEF fcnType_fcnName fcnFormalParameterList fcnBody )
            {
                // pol.g:555:6: ^( D_FCN_DEF fcnType_fcnName fcnFormalParameterList fcnBody )
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
    // pol.g:562:1: fcnAttr : ( 'public' )? ( 'host' )? ;
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
            // pol.g:563:2: ( ( 'public' )? ( 'host' )? )
            // pol.g:563:4: ( 'public' )? ( 'host' )?
            {
            root_0 = (Object)adaptor.nil();

            // pol.g:563:4: ( 'public' )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==155) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // pol.g:563:5: 'public'
                    {
                    string_literal215=(Token)match(input,155,FOLLOW_155_in_fcnAttr3147); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal215_tree = (Object)adaptor.create(string_literal215);
                    adaptor.addChild(root_0, string_literal215_tree);
                    }
                    if ( state.backtracking==0 ) {
                       atFlags.add(AttrFlags.PUBLIC); 
                    }

                    }
                    break;

            }

            // pol.g:564:3: ( 'host' )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==156) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // pol.g:564:4: 'host'
                    {
                    string_literal216=(Token)match(input,156,FOLLOW_156_in_fcnAttr3158); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal216_tree = (Object)adaptor.create(string_literal216);
                    adaptor.addChild(root_0, string_literal216_tree);
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
    // pol.g:566:1: fcnBody : braceOpen ( stmts ) braceClose -> ^( FCNBODY stmts ) ;
    public final polParser.fcnBody_return fcnBody() throws RecognitionException {
        polParser.fcnBody_return retval = new polParser.fcnBody_return();
        retval.start = input.LT(1);
        int fcnBody_StartIndex = input.index();
        Object root_0 = null;

        polParser.braceOpen_return braceOpen217 = null;

        polParser.stmts_return stmts218 = null;

        polParser.braceClose_return braceClose219 = null;


        RewriteRuleSubtreeStream stream_stmts=new RewriteRuleSubtreeStream(adaptor,"rule stmts");
        RewriteRuleSubtreeStream stream_braceOpen=new RewriteRuleSubtreeStream(adaptor,"rule braceOpen");
        RewriteRuleSubtreeStream stream_braceClose=new RewriteRuleSubtreeStream(adaptor,"rule braceClose");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 64) ) { return retval; }
            // pol.g:567:3: ( braceOpen ( stmts ) braceClose -> ^( FCNBODY stmts ) )
            // pol.g:567:5: braceOpen ( stmts ) braceClose
            {
            pushFollow(FOLLOW_braceOpen_in_fcnBody3174);
            braceOpen217=braceOpen();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_braceOpen.add(braceOpen217.getTree());
            // pol.g:567:15: ( stmts )
            // pol.g:567:16: stmts
            {
            pushFollow(FOLLOW_stmts_in_fcnBody3177);
            stmts218=stmts();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_stmts.add(stmts218.getTree());

            }

            pushFollow(FOLLOW_braceClose_in_fcnBody3181);
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
            // 567:36: -> ^( FCNBODY stmts )
            {
                // pol.g:567:39: ^( FCNBODY stmts )
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
    // pol.g:569:1: fcnDeclaration : ( 'public' )? ( 'host' )? fcnType_fcnName ( fcnFormalParameterList ) delim -> ^( D_FCN_DCL fcnType_fcnName fcnFormalParameterList ) ;
    public final polParser.fcnDeclaration_return fcnDeclaration() throws RecognitionException {
        polParser.fcnDeclaration_return retval = new polParser.fcnDeclaration_return();
        retval.start = input.LT(1);
        int fcnDeclaration_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal220=null;
        Token string_literal221=null;
        polParser.fcnType_fcnName_return fcnType_fcnName222 = null;

        polParser.fcnFormalParameterList_return fcnFormalParameterList223 = null;

        polParser.delim_return delim224 = null;


        Object string_literal220_tree=null;
        Object string_literal221_tree=null;
        RewriteRuleTokenStream stream_156=new RewriteRuleTokenStream(adaptor,"token 156");
        RewriteRuleTokenStream stream_155=new RewriteRuleTokenStream(adaptor,"token 155");
        RewriteRuleSubtreeStream stream_fcnFormalParameterList=new RewriteRuleSubtreeStream(adaptor,"rule fcnFormalParameterList");
        RewriteRuleSubtreeStream stream_fcnType_fcnName=new RewriteRuleSubtreeStream(adaptor,"rule fcnType_fcnName");
        RewriteRuleSubtreeStream stream_delim=new RewriteRuleSubtreeStream(adaptor,"rule delim");

        	atFlags.clear();			

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 65) ) { return retval; }
            // pol.g:576:4: ( ( 'public' )? ( 'host' )? fcnType_fcnName ( fcnFormalParameterList ) delim -> ^( D_FCN_DCL fcnType_fcnName fcnFormalParameterList ) )
            // pol.g:576:6: ( 'public' )? ( 'host' )? fcnType_fcnName ( fcnFormalParameterList ) delim
            {
            // pol.g:576:6: ( 'public' )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==155) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // pol.g:576:7: 'public'
                    {
                    string_literal220=(Token)match(input,155,FOLLOW_155_in_fcnDeclaration3213); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_155.add(string_literal220);

                    if ( state.backtracking==0 ) {
                       atFlags.add(AttrFlags.PUBLIC); 
                    }

                    }
                    break;

            }

            // pol.g:577:3: ( 'host' )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==156) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // pol.g:577:4: 'host'
                    {
                    string_literal221=(Token)match(input,156,FOLLOW_156_in_fcnDeclaration3224); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_156.add(string_literal221);

                    if ( state.backtracking==0 ) {
                       atFlags.add(AttrFlags.HOST); 
                    }

                    }
                    break;

            }

            pushFollow(FOLLOW_fcnType_fcnName_in_fcnDeclaration3234);
            fcnType_fcnName222=fcnType_fcnName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_fcnType_fcnName.add(fcnType_fcnName222.getTree());
            // pol.g:578:19: ( fcnFormalParameterList )
            // pol.g:578:20: fcnFormalParameterList
            {
            pushFollow(FOLLOW_fcnFormalParameterList_in_fcnDeclaration3237);
            fcnFormalParameterList223=fcnFormalParameterList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_fcnFormalParameterList.add(fcnFormalParameterList223.getTree());

            }

            pushFollow(FOLLOW_delim_in_fcnDeclaration3240);
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
            // 579:4: -> ^( D_FCN_DCL fcnType_fcnName fcnFormalParameterList )
            {
                // pol.g:579:7: ^( D_FCN_DCL fcnType_fcnName fcnFormalParameterList )
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
    // pol.g:581:1: fcnType_fcnName : ( typeName qualName -> ^( D_FCN_TYP_NM ^( LIST typeName ) qualName ) | {...}?t= typeName -> ^( D_FCN_CTOR ^( LIST $t) typeName ) | qualName -> ^( D_FCN_TYP_NM ^( LIST ) qualName ) | ( '(' typeName ( ',' typeName )* ')' qualName )=> fcnTypes_fcnName );
    public final polParser.fcnType_fcnName_return fcnType_fcnName() throws RecognitionException {
        polParser.fcnType_fcnName_return retval = new polParser.fcnType_fcnName_return();
        retval.start = input.LT(1);
        int fcnType_fcnName_StartIndex = input.index();
        Object root_0 = null;

        polParser.typeName_return t = null;

        polParser.typeName_return typeName225 = null;

        polParser.qualName_return qualName226 = null;

        polParser.qualName_return qualName227 = null;

        polParser.fcnTypes_fcnName_return fcnTypes_fcnName228 = null;


        RewriteRuleSubtreeStream stream_typeName=new RewriteRuleSubtreeStream(adaptor,"rule typeName");
        RewriteRuleSubtreeStream stream_qualName=new RewriteRuleSubtreeStream(adaptor,"rule qualName");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 66) ) { return retval; }
            // pol.g:584:2: ( typeName qualName -> ^( D_FCN_TYP_NM ^( LIST typeName ) qualName ) | {...}?t= typeName -> ^( D_FCN_CTOR ^( LIST $t) typeName ) | qualName -> ^( D_FCN_TYP_NM ^( LIST ) qualName ) | ( '(' typeName ( ',' typeName )* ')' qualName )=> fcnTypes_fcnName )
            int alt67=4;
            int LA67_0 = input.LA(1);

            if ( ((LA67_0>=183 && LA67_0<=191)) ) {
                int LA67_1 = input.LA(2);

                if ( (synpred111_pol()) ) {
                    alt67=1;
                }
                else if ( ((synpred112_pol()&&(input.LT(1).getText().equals(ti.getTypeName()) ))) ) {
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
                else if ( ((synpred112_pol()&&(input.LT(1).getText().equals(ti.getTypeName()) ))) ) {
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
            else if ( (LA67_0==153) && (synpred115_pol())) {
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
                    // pol.g:584:4: typeName qualName
                    {
                    pushFollow(FOLLOW_typeName_in_fcnType_fcnName3267);
                    typeName225=typeName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeName.add(typeName225.getTree());
                    pushFollow(FOLLOW_qualName_in_fcnType_fcnName3269);
                    qualName226=qualName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_qualName.add(qualName226.getTree());


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

                    root_0 = (Object)adaptor.nil();
                    // 585:3: -> ^( D_FCN_TYP_NM ^( LIST typeName ) qualName )
                    {
                        // pol.g:585:6: ^( D_FCN_TYP_NM ^( LIST typeName ) qualName )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(D_FCN_TYP_NM, "D_FCN_TYP_NM"), root_1);

                        // pol.g:585:22: ^( LIST typeName )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(LIST, "LIST"), root_2);

                        adaptor.addChild(root_2, stream_typeName.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        adaptor.addChild(root_1, stream_qualName.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // pol.g:586:4: {...}?t= typeName
                    {
                    if ( !((input.LT(1).getText().equals(ti.getTypeName()) )) ) {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        throw new FailedPredicateException(input, "fcnType_fcnName", "input.LT(1).getText().equals(ti.getTypeName()) ");
                    }
                    pushFollow(FOLLOW_typeName_in_fcnType_fcnName3303);
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
                    // 587:3: -> ^( D_FCN_CTOR ^( LIST $t) typeName )
                    {
                        // pol.g:587:6: ^( D_FCN_CTOR ^( LIST $t) typeName )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(D_FCN_CTOR, "D_FCN_CTOR"), root_1);

                        // pol.g:587:19: ^( LIST $t)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(LIST, "LIST"), root_2);

                        adaptor.addChild(root_2, stream_t.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        adaptor.addChild(root_1, stream_typeName.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // pol.g:588:4: qualName
                    {
                    pushFollow(FOLLOW_qualName_in_fcnType_fcnName3336);
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
                    // 589:3: -> ^( D_FCN_TYP_NM ^( LIST ) qualName )
                    {
                        // pol.g:589:6: ^( D_FCN_TYP_NM ^( LIST ) qualName )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(D_FCN_TYP_NM, "D_FCN_TYP_NM"), root_1);

                        // pol.g:589:21: ^( LIST )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(LIST, "LIST"), root_2);

                        adaptor.addChild(root_1, root_2);
                        }
                        adaptor.addChild(root_1, stream_qualName.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // pol.g:590:4: ( '(' typeName ( ',' typeName )* ')' qualName )=> fcnTypes_fcnName
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_fcnTypes_fcnName_in_fcnType_fcnName3391);
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
    // pol.g:592:1: fcnTypes_fcnName : '(' fcnTypes ')' qualName -> ^( D_FCN_TYP_NM fcnTypes qualName ) ;
    public final polParser.fcnTypes_fcnName_return fcnTypes_fcnName() throws RecognitionException {
        polParser.fcnTypes_fcnName_return retval = new polParser.fcnTypes_fcnName_return();
        retval.start = input.LT(1);
        int fcnTypes_fcnName_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal229=null;
        Token char_literal231=null;
        polParser.fcnTypes_return fcnTypes230 = null;

        polParser.qualName_return qualName232 = null;


        Object char_literal229_tree=null;
        Object char_literal231_tree=null;
        RewriteRuleTokenStream stream_153=new RewriteRuleTokenStream(adaptor,"token 153");
        RewriteRuleTokenStream stream_154=new RewriteRuleTokenStream(adaptor,"token 154");
        RewriteRuleSubtreeStream stream_fcnTypes=new RewriteRuleSubtreeStream(adaptor,"rule fcnTypes");
        RewriteRuleSubtreeStream stream_qualName=new RewriteRuleSubtreeStream(adaptor,"rule qualName");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 67) ) { return retval; }
            // pol.g:593:2: ( '(' fcnTypes ')' qualName -> ^( D_FCN_TYP_NM fcnTypes qualName ) )
            // pol.g:593:4: '(' fcnTypes ')' qualName
            {
            char_literal229=(Token)match(input,153,FOLLOW_153_in_fcnTypes_fcnName3402); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_153.add(char_literal229);

            pushFollow(FOLLOW_fcnTypes_in_fcnTypes_fcnName3404);
            fcnTypes230=fcnTypes();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_fcnTypes.add(fcnTypes230.getTree());
            char_literal231=(Token)match(input,154,FOLLOW_154_in_fcnTypes_fcnName3406); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_154.add(char_literal231);

            pushFollow(FOLLOW_qualName_in_fcnTypes_fcnName3408);
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
            // 593:30: -> ^( D_FCN_TYP_NM fcnTypes qualName )
            {
                // pol.g:593:33: ^( D_FCN_TYP_NM fcnTypes qualName )
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
    // pol.g:595:1: fcnTypes : typeName ( ',' typeName )* -> ^( LIST ( typeName )+ ) ;
    public final polParser.fcnTypes_return fcnTypes() throws RecognitionException {
        polParser.fcnTypes_return retval = new polParser.fcnTypes_return();
        retval.start = input.LT(1);
        int fcnTypes_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal234=null;
        polParser.typeName_return typeName233 = null;

        polParser.typeName_return typeName235 = null;


        Object char_literal234_tree=null;
        RewriteRuleTokenStream stream_126=new RewriteRuleTokenStream(adaptor,"token 126");
        RewriteRuleSubtreeStream stream_typeName=new RewriteRuleSubtreeStream(adaptor,"rule typeName");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 68) ) { return retval; }
            // pol.g:596:2: ( typeName ( ',' typeName )* -> ^( LIST ( typeName )+ ) )
            // pol.g:596:4: typeName ( ',' typeName )*
            {
            pushFollow(FOLLOW_typeName_in_fcnTypes3429);
            typeName233=typeName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeName.add(typeName233.getTree());
            // pol.g:596:13: ( ',' typeName )*
            loop68:
            do {
                int alt68=2;
                int LA68_0 = input.LA(1);

                if ( (LA68_0==126) ) {
                    alt68=1;
                }


                switch (alt68) {
            	case 1 :
            	    // pol.g:596:14: ',' typeName
            	    {
            	    char_literal234=(Token)match(input,126,FOLLOW_126_in_fcnTypes3432); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_126.add(char_literal234);

            	    pushFollow(FOLLOW_typeName_in_fcnTypes3434);
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
            // 596:29: -> ^( LIST ( typeName )+ )
            {
                // pol.g:596:32: ^( LIST ( typeName )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LIST, "LIST"), root_1);

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
    // pol.g:598:1: fcnFormalParameterList : '(' fcnFormalParameters ')' -> fcnFormalParameters ;
    public final polParser.fcnFormalParameterList_return fcnFormalParameterList() throws RecognitionException {
        polParser.fcnFormalParameterList_return retval = new polParser.fcnFormalParameterList_return();
        retval.start = input.LT(1);
        int fcnFormalParameterList_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal236=null;
        Token char_literal238=null;
        polParser.fcnFormalParameters_return fcnFormalParameters237 = null;


        Object char_literal236_tree=null;
        Object char_literal238_tree=null;
        RewriteRuleTokenStream stream_153=new RewriteRuleTokenStream(adaptor,"token 153");
        RewriteRuleTokenStream stream_154=new RewriteRuleTokenStream(adaptor,"token 154");
        RewriteRuleSubtreeStream stream_fcnFormalParameters=new RewriteRuleSubtreeStream(adaptor,"rule fcnFormalParameters");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 69) ) { return retval; }
            // pol.g:599:2: ( '(' fcnFormalParameters ')' -> fcnFormalParameters )
            // pol.g:599:4: '(' fcnFormalParameters ')'
            {
            char_literal236=(Token)match(input,153,FOLLOW_153_in_fcnFormalParameterList3455); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_153.add(char_literal236);

            pushFollow(FOLLOW_fcnFormalParameters_in_fcnFormalParameterList3457);
            fcnFormalParameters237=fcnFormalParameters();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_fcnFormalParameters.add(fcnFormalParameters237.getTree());
            char_literal238=(Token)match(input,154,FOLLOW_154_in_fcnFormalParameterList3459); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_154.add(char_literal238);



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
            // 599:32: -> fcnFormalParameters
            {
                adaptor.addChild(root_0, stream_fcnFormalParameters.nextTree());

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
    // pol.g:601:1: fcnFormalParameters : ( fcnFormalParameter ( ',' fcnFormalParameter )* -> ^( LIST ( fcnFormalParameter )+ ) | -> ^( LIST ) );
    public final polParser.fcnFormalParameters_return fcnFormalParameters() throws RecognitionException {
        polParser.fcnFormalParameters_return retval = new polParser.fcnFormalParameters_return();
        retval.start = input.LT(1);
        int fcnFormalParameters_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal240=null;
        polParser.fcnFormalParameter_return fcnFormalParameter239 = null;

        polParser.fcnFormalParameter_return fcnFormalParameter241 = null;


        Object char_literal240_tree=null;
        RewriteRuleTokenStream stream_126=new RewriteRuleTokenStream(adaptor,"token 126");
        RewriteRuleSubtreeStream stream_fcnFormalParameter=new RewriteRuleSubtreeStream(adaptor,"rule fcnFormalParameter");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 70) ) { return retval; }
            // pol.g:602:2: ( fcnFormalParameter ( ',' fcnFormalParameter )* -> ^( LIST ( fcnFormalParameter )+ ) | -> ^( LIST ) )
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==IDENT||(LA70_0>=183 && LA70_0<=191)) ) {
                alt70=1;
            }
            else if ( (LA70_0==154) ) {
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
                    // pol.g:602:4: fcnFormalParameter ( ',' fcnFormalParameter )*
                    {
                    pushFollow(FOLLOW_fcnFormalParameter_in_fcnFormalParameters3473);
                    fcnFormalParameter239=fcnFormalParameter();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_fcnFormalParameter.add(fcnFormalParameter239.getTree());
                    // pol.g:602:23: ( ',' fcnFormalParameter )*
                    loop69:
                    do {
                        int alt69=2;
                        int LA69_0 = input.LA(1);

                        if ( (LA69_0==126) ) {
                            alt69=1;
                        }


                        switch (alt69) {
                    	case 1 :
                    	    // pol.g:602:24: ',' fcnFormalParameter
                    	    {
                    	    char_literal240=(Token)match(input,126,FOLLOW_126_in_fcnFormalParameters3476); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_126.add(char_literal240);

                    	    pushFollow(FOLLOW_fcnFormalParameter_in_fcnFormalParameters3478);
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
                    // 603:3: -> ^( LIST ( fcnFormalParameter )+ )
                    {
                        // pol.g:603:6: ^( LIST ( fcnFormalParameter )+ )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LIST, "LIST"), root_1);

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

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // pol.g:604:4: 
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
                    // 604:4: -> ^( LIST )
                    {
                        // pol.g:604:7: ^( LIST )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LIST, "LIST"), root_1);

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
    // pol.g:606:1: fcnFormalParameter : typeName IDENT ( '=' expr )? -> ^( D_FORMAL typeName ^( IDENT ( expr )? ) ) ;
    public final polParser.fcnFormalParameter_return fcnFormalParameter() throws RecognitionException {
        polParser.fcnFormalParameter_return retval = new polParser.fcnFormalParameter_return();
        retval.start = input.LT(1);
        int fcnFormalParameter_StartIndex = input.index();
        Object root_0 = null;

        Token IDENT243=null;
        Token char_literal244=null;
        polParser.typeName_return typeName242 = null;

        polParser.expr_return expr245 = null;


        Object IDENT243_tree=null;
        Object char_literal244_tree=null;
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
        RewriteRuleSubtreeStream stream_typeName=new RewriteRuleSubtreeStream(adaptor,"rule typeName");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 71) ) { return retval; }
            // pol.g:607:2: ( typeName IDENT ( '=' expr )? -> ^( D_FORMAL typeName ^( IDENT ( expr )? ) ) )
            // pol.g:607:6: typeName IDENT ( '=' expr )?
            {
            pushFollow(FOLLOW_typeName_in_fcnFormalParameter3513);
            typeName242=typeName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeName.add(typeName242.getTree());
            IDENT243=(Token)match(input,IDENT,FOLLOW_IDENT_in_fcnFormalParameter3515); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENT.add(IDENT243);

            // pol.g:607:21: ( '=' expr )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==ASSIGN) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // pol.g:607:23: '=' expr
                    {
                    char_literal244=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_fcnFormalParameter3519); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ASSIGN.add(char_literal244);

                    pushFollow(FOLLOW_expr_in_fcnFormalParameter3521);
                    expr245=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr245.getTree());

                    }
                    break;

            }



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
            // 608:3: -> ^( D_FORMAL typeName ^( IDENT ( expr )? ) )
            {
                // pol.g:608:6: ^( D_FORMAL typeName ^( IDENT ( expr )? ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(D_FORMAL, "D_FORMAL"), root_1);

                adaptor.addChild(root_1, stream_typeName.nextTree());
                // pol.g:608:26: ^( IDENT ( expr )? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(stream_IDENT.nextNode(), root_2);

                // pol.g:608:34: ( expr )?
                if ( stream_expr.hasNext() ) {
                    adaptor.addChild(root_2, stream_expr.nextTree());

                }
                stream_expr.reset();

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
    // pol.g:610:1: fcnArgumentList : '(' fcnArguments ')' -> fcnArguments ;
    public final polParser.fcnArgumentList_return fcnArgumentList() throws RecognitionException {
        polParser.fcnArgumentList_return retval = new polParser.fcnArgumentList_return();
        retval.start = input.LT(1);
        int fcnArgumentList_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal246=null;
        Token char_literal248=null;
        polParser.fcnArguments_return fcnArguments247 = null;


        Object char_literal246_tree=null;
        Object char_literal248_tree=null;
        RewriteRuleTokenStream stream_153=new RewriteRuleTokenStream(adaptor,"token 153");
        RewriteRuleTokenStream stream_154=new RewriteRuleTokenStream(adaptor,"token 154");
        RewriteRuleSubtreeStream stream_fcnArguments=new RewriteRuleSubtreeStream(adaptor,"rule fcnArguments");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 72) ) { return retval; }
            // pol.g:611:2: ( '(' fcnArguments ')' -> fcnArguments )
            // pol.g:611:4: '(' fcnArguments ')'
            {
            char_literal246=(Token)match(input,153,FOLLOW_153_in_fcnArgumentList3552); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_153.add(char_literal246);

            pushFollow(FOLLOW_fcnArguments_in_fcnArgumentList3554);
            fcnArguments247=fcnArguments();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_fcnArguments.add(fcnArguments247.getTree());
            char_literal248=(Token)match(input,154,FOLLOW_154_in_fcnArgumentList3556); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_154.add(char_literal248);



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
            // 611:25: -> fcnArguments
            {
                adaptor.addChild(root_0, stream_fcnArguments.nextTree());

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
    // pol.g:613:1: fcnArguments : exprList ;
    public final polParser.fcnArguments_return fcnArguments() throws RecognitionException {
        polParser.fcnArguments_return retval = new polParser.fcnArguments_return();
        retval.start = input.LT(1);
        int fcnArguments_StartIndex = input.index();
        Object root_0 = null;

        polParser.exprList_return exprList249 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 73) ) { return retval; }
            // pol.g:614:2: ( exprList )
            // pol.g:614:4: exprList
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_exprList_in_fcnArguments3570);
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
    // pol.g:616:1: varOrFcnOrArray : ( 'new' typeName fcnArgumentList ( fieldOrArrayAccess )? -> ^( E_NEW typeName fcnArgumentList ( fieldOrArrayAccess )? ) | '@' IDENT fcnArgumentList ( fieldOrArrayAccess )? -> ^( E_SELF ^( E_CALL IDENT fcnArgumentList ( fieldOrArrayAccess )? ) ) | '@' IDENT ( fieldOrArrayAccess )? -> ^( E_SELF IDENT ( fieldOrArrayAccess )? ) | '@' -> ^( E_SELF ) | qualName fcnArgumentList ( fieldOrArrayAccess )? -> ^( E_CALL qualName fcnArgumentList ( fieldOrArrayAccess )? ) | qualName ( fieldOrArrayAccess )? );
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
        polParser.typeName_return typeName251 = null;

        polParser.fcnArgumentList_return fcnArgumentList252 = null;

        polParser.fieldOrArrayAccess_return fieldOrArrayAccess253 = null;

        polParser.fcnArgumentList_return fcnArgumentList256 = null;

        polParser.fieldOrArrayAccess_return fieldOrArrayAccess257 = null;

        polParser.fieldOrArrayAccess_return fieldOrArrayAccess260 = null;

        polParser.qualName_return qualName262 = null;

        polParser.fcnArgumentList_return fcnArgumentList263 = null;

        polParser.fieldOrArrayAccess_return fieldOrArrayAccess264 = null;

        polParser.qualName_return qualName265 = null;

        polParser.fieldOrArrayAccess_return fieldOrArrayAccess266 = null;


        Object string_literal250_tree=null;
        Object char_literal254_tree=null;
        Object IDENT255_tree=null;
        Object char_literal258_tree=null;
        Object IDENT259_tree=null;
        Object char_literal261_tree=null;
        RewriteRuleTokenStream stream_152=new RewriteRuleTokenStream(adaptor,"token 152");
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleTokenStream stream_157=new RewriteRuleTokenStream(adaptor,"token 157");
        RewriteRuleSubtreeStream stream_typeName=new RewriteRuleSubtreeStream(adaptor,"rule typeName");
        RewriteRuleSubtreeStream stream_fcnArgumentList=new RewriteRuleSubtreeStream(adaptor,"rule fcnArgumentList");
        RewriteRuleSubtreeStream stream_qualName=new RewriteRuleSubtreeStream(adaptor,"rule qualName");
        RewriteRuleSubtreeStream stream_fieldOrArrayAccess=new RewriteRuleSubtreeStream(adaptor,"rule fieldOrArrayAccess");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 74) ) { return retval; }
            // pol.g:617:2: ( 'new' typeName fcnArgumentList ( fieldOrArrayAccess )? -> ^( E_NEW typeName fcnArgumentList ( fieldOrArrayAccess )? ) | '@' IDENT fcnArgumentList ( fieldOrArrayAccess )? -> ^( E_SELF ^( E_CALL IDENT fcnArgumentList ( fieldOrArrayAccess )? ) ) | '@' IDENT ( fieldOrArrayAccess )? -> ^( E_SELF IDENT ( fieldOrArrayAccess )? ) | '@' -> ^( E_SELF ) | qualName fcnArgumentList ( fieldOrArrayAccess )? -> ^( E_CALL qualName fcnArgumentList ( fieldOrArrayAccess )? ) | qualName ( fieldOrArrayAccess )? )
            int alt77=6;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                int LA77_1 = input.LA(2);

                if ( (synpred128_pol()) ) {
                    alt77=5;
                }
                else if ( (true) ) {
                    alt77=6;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 77, 1, input);

                    throw nvae;
                }
                }
                break;
            case 152:
                {
                alt77=1;
                }
                break;
            case 157:
                {
                int LA77_5 = input.LA(2);

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
                        new NoViableAltException("", 77, 5, input);

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
                    // pol.g:617:10: 'new' typeName fcnArgumentList ( fieldOrArrayAccess )?
                    {
                    string_literal250=(Token)match(input,152,FOLLOW_152_in_varOrFcnOrArray3586); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_152.add(string_literal250);

                    pushFollow(FOLLOW_typeName_in_varOrFcnOrArray3588);
                    typeName251=typeName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeName.add(typeName251.getTree());
                    pushFollow(FOLLOW_fcnArgumentList_in_varOrFcnOrArray3590);
                    fcnArgumentList252=fcnArgumentList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_fcnArgumentList.add(fcnArgumentList252.getTree());
                    // pol.g:617:41: ( fieldOrArrayAccess )?
                    int alt72=2;
                    int LA72_0 = input.LA(1);

                    if ( (LA72_0==158) ) {
                        alt72=1;
                    }
                    else if ( (LA72_0==159) ) {
                        int LA72_3 = input.LA(2);

                        if ( (synpred120_pol()) ) {
                            alt72=1;
                        }
                    }
                    switch (alt72) {
                        case 1 :
                            // pol.g:0:0: fieldOrArrayAccess
                            {
                            pushFollow(FOLLOW_fieldOrArrayAccess_in_varOrFcnOrArray3592);
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
                    // 618:17: -> ^( E_NEW typeName fcnArgumentList ( fieldOrArrayAccess )? )
                    {
                        // pol.g:618:20: ^( E_NEW typeName fcnArgumentList ( fieldOrArrayAccess )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(E_NEW, "E_NEW"), root_1);

                        adaptor.addChild(root_1, stream_typeName.nextTree());
                        adaptor.addChild(root_1, stream_fcnArgumentList.nextTree());
                        // pol.g:618:53: ( fieldOrArrayAccess )?
                        if ( stream_fieldOrArrayAccess.hasNext() ) {
                            adaptor.addChild(root_1, stream_fieldOrArrayAccess.nextTree());

                        }
                        stream_fieldOrArrayAccess.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // pol.g:619:10: '@' IDENT fcnArgumentList ( fieldOrArrayAccess )?
                    {
                    char_literal254=(Token)match(input,157,FOLLOW_157_in_varOrFcnOrArray3633); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_157.add(char_literal254);

                    IDENT255=(Token)match(input,IDENT,FOLLOW_IDENT_in_varOrFcnOrArray3635); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENT.add(IDENT255);

                    pushFollow(FOLLOW_fcnArgumentList_in_varOrFcnOrArray3637);
                    fcnArgumentList256=fcnArgumentList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_fcnArgumentList.add(fcnArgumentList256.getTree());
                    // pol.g:619:36: ( fieldOrArrayAccess )?
                    int alt73=2;
                    int LA73_0 = input.LA(1);

                    if ( (LA73_0==158) ) {
                        alt73=1;
                    }
                    else if ( (LA73_0==159) ) {
                        int LA73_3 = input.LA(2);

                        if ( (synpred122_pol()) ) {
                            alt73=1;
                        }
                    }
                    switch (alt73) {
                        case 1 :
                            // pol.g:0:0: fieldOrArrayAccess
                            {
                            pushFollow(FOLLOW_fieldOrArrayAccess_in_varOrFcnOrArray3639);
                            fieldOrArrayAccess257=fieldOrArrayAccess();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_fieldOrArrayAccess.add(fieldOrArrayAccess257.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: IDENT, fcnArgumentList, fieldOrArrayAccess
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 620:17: -> ^( E_SELF ^( E_CALL IDENT fcnArgumentList ( fieldOrArrayAccess )? ) )
                    {
                        // pol.g:620:20: ^( E_SELF ^( E_CALL IDENT fcnArgumentList ( fieldOrArrayAccess )? ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(E_SELF, "E_SELF"), root_1);

                        // pol.g:621:25: ^( E_CALL IDENT fcnArgumentList ( fieldOrArrayAccess )? )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(E_CALL, "E_CALL"), root_2);

                        adaptor.addChild(root_2, stream_IDENT.nextNode());
                        adaptor.addChild(root_2, stream_fcnArgumentList.nextTree());
                        // pol.g:621:56: ( fieldOrArrayAccess )?
                        if ( stream_fieldOrArrayAccess.hasNext() ) {
                            adaptor.addChild(root_2, stream_fieldOrArrayAccess.nextTree());

                        }
                        stream_fieldOrArrayAccess.reset();

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // pol.g:622:10: '@' IDENT ( fieldOrArrayAccess )?
                    {
                    char_literal258=(Token)match(input,157,FOLLOW_157_in_varOrFcnOrArray3708); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_157.add(char_literal258);

                    IDENT259=(Token)match(input,IDENT,FOLLOW_IDENT_in_varOrFcnOrArray3714); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENT.add(IDENT259);

                    // pol.g:622:24: ( fieldOrArrayAccess )?
                    int alt74=2;
                    int LA74_0 = input.LA(1);

                    if ( (LA74_0==159) ) {
                        int LA74_2 = input.LA(2);

                        if ( (synpred124_pol()) ) {
                            alt74=1;
                        }
                    }
                    else if ( (LA74_0==158) ) {
                        alt74=1;
                    }
                    switch (alt74) {
                        case 1 :
                            // pol.g:0:0: fieldOrArrayAccess
                            {
                            pushFollow(FOLLOW_fieldOrArrayAccess_in_varOrFcnOrArray3716);
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
                    // 623:17: -> ^( E_SELF IDENT ( fieldOrArrayAccess )? )
                    {
                        // pol.g:623:20: ^( E_SELF IDENT ( fieldOrArrayAccess )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(E_SELF, "E_SELF"), root_1);

                        adaptor.addChild(root_1, stream_IDENT.nextNode());
                        // pol.g:623:35: ( fieldOrArrayAccess )?
                        if ( stream_fieldOrArrayAccess.hasNext() ) {
                            adaptor.addChild(root_1, stream_fieldOrArrayAccess.nextTree());

                        }
                        stream_fieldOrArrayAccess.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // pol.g:624:10: '@'
                    {
                    char_literal261=(Token)match(input,157,FOLLOW_157_in_varOrFcnOrArray3764); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_157.add(char_literal261);



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
                    // 625:17: -> ^( E_SELF )
                    {
                        // pol.g:625:20: ^( E_SELF )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(E_SELF, "E_SELF"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // pol.g:626:10: qualName fcnArgumentList ( fieldOrArrayAccess )?
                    {
                    pushFollow(FOLLOW_qualName_in_varOrFcnOrArray3797);
                    qualName262=qualName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_qualName.add(qualName262.getTree());
                    pushFollow(FOLLOW_fcnArgumentList_in_varOrFcnOrArray3799);
                    fcnArgumentList263=fcnArgumentList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_fcnArgumentList.add(fcnArgumentList263.getTree());
                    // pol.g:626:35: ( fieldOrArrayAccess )?
                    int alt75=2;
                    int LA75_0 = input.LA(1);

                    if ( (LA75_0==159) ) {
                        int LA75_2 = input.LA(2);

                        if ( (synpred127_pol()) ) {
                            alt75=1;
                        }
                    }
                    else if ( (LA75_0==158) ) {
                        alt75=1;
                    }
                    switch (alt75) {
                        case 1 :
                            // pol.g:0:0: fieldOrArrayAccess
                            {
                            pushFollow(FOLLOW_fieldOrArrayAccess_in_varOrFcnOrArray3801);
                            fieldOrArrayAccess264=fieldOrArrayAccess();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_fieldOrArrayAccess.add(fieldOrArrayAccess264.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: fcnArgumentList, fieldOrArrayAccess, qualName
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 627:17: -> ^( E_CALL qualName fcnArgumentList ( fieldOrArrayAccess )? )
                    {
                        // pol.g:627:20: ^( E_CALL qualName fcnArgumentList ( fieldOrArrayAccess )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(E_CALL, "E_CALL"), root_1);

                        adaptor.addChild(root_1, stream_qualName.nextTree());
                        adaptor.addChild(root_1, stream_fcnArgumentList.nextTree());
                        // pol.g:627:54: ( fieldOrArrayAccess )?
                        if ( stream_fieldOrArrayAccess.hasNext() ) {
                            adaptor.addChild(root_1, stream_fieldOrArrayAccess.nextTree());

                        }
                        stream_fieldOrArrayAccess.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 6 :
                    // pol.g:628:10: qualName ( fieldOrArrayAccess )?
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_qualName_in_varOrFcnOrArray3842);
                    qualName265=qualName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, qualName265.getTree());
                    // pol.g:628:19: ( fieldOrArrayAccess )?
                    int alt76=2;
                    int LA76_0 = input.LA(1);

                    if ( (LA76_0==158) ) {
                        alt76=1;
                    }
                    else if ( (LA76_0==159) ) {
                        int LA76_3 = input.LA(2);

                        if ( (synpred129_pol()) ) {
                            alt76=1;
                        }
                    }
                    switch (alt76) {
                        case 1 :
                            // pol.g:0:0: fieldOrArrayAccess
                            {
                            pushFollow(FOLLOW_fieldOrArrayAccess_in_varOrFcnOrArray3844);
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
    // pol.g:631:1: fieldOrArrayAccess : ( fieldAccess | arrayAccess )+ ;
    public final polParser.fieldOrArrayAccess_return fieldOrArrayAccess() throws RecognitionException {
        polParser.fieldOrArrayAccess_return retval = new polParser.fieldOrArrayAccess_return();
        retval.start = input.LT(1);
        int fieldOrArrayAccess_StartIndex = input.index();
        Object root_0 = null;

        polParser.fieldAccess_return fieldAccess267 = null;

        polParser.arrayAccess_return arrayAccess268 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 75) ) { return retval; }
            // pol.g:632:2: ( ( fieldAccess | arrayAccess )+ )
            // pol.g:632:5: ( fieldAccess | arrayAccess )+
            {
            root_0 = (Object)adaptor.nil();

            // pol.g:632:5: ( fieldAccess | arrayAccess )+
            int cnt78=0;
            loop78:
            do {
                int alt78=3;
                int LA78_0 = input.LA(1);

                if ( (LA78_0==159) ) {
                    int LA78_1 = input.LA(2);

                    if ( (synpred131_pol()) ) {
                        alt78=2;
                    }


                }
                else if ( (LA78_0==158) ) {
                    alt78=1;
                }


                switch (alt78) {
            	case 1 :
            	    // pol.g:632:6: fieldAccess
            	    {
            	    pushFollow(FOLLOW_fieldAccess_in_fieldOrArrayAccess3858);
            	    fieldAccess267=fieldAccess();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, fieldAccess267.getTree());

            	    }
            	    break;
            	case 2 :
            	    // pol.g:632:20: arrayAccess
            	    {
            	    pushFollow(FOLLOW_arrayAccess_in_fieldOrArrayAccess3862);
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
    // pol.g:634:1: fieldAccess : ( '.' IDENT fcnArgumentList -> ^( E_CALL IDENT fcnArgumentList ) | '.' IDENT -> ^( E_IDENT IDENT ) );
    public final polParser.fieldAccess_return fieldAccess() throws RecognitionException {
        polParser.fieldAccess_return retval = new polParser.fieldAccess_return();
        retval.start = input.LT(1);
        int fieldAccess_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal269=null;
        Token IDENT270=null;
        Token char_literal272=null;
        Token IDENT273=null;
        polParser.fcnArgumentList_return fcnArgumentList271 = null;


        Object char_literal269_tree=null;
        Object IDENT270_tree=null;
        Object char_literal272_tree=null;
        Object IDENT273_tree=null;
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleTokenStream stream_158=new RewriteRuleTokenStream(adaptor,"token 158");
        RewriteRuleSubtreeStream stream_fcnArgumentList=new RewriteRuleSubtreeStream(adaptor,"rule fcnArgumentList");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 76) ) { return retval; }
            // pol.g:637:4: ( '.' IDENT fcnArgumentList -> ^( E_CALL IDENT fcnArgumentList ) | '.' IDENT -> ^( E_IDENT IDENT ) )
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==158) ) {
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
                    // pol.g:637:12: '.' IDENT fcnArgumentList
                    {
                    char_literal269=(Token)match(input,158,FOLLOW_158_in_fieldAccess3884); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_158.add(char_literal269);

                    IDENT270=(Token)match(input,IDENT,FOLLOW_IDENT_in_fieldAccess3890); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENT.add(IDENT270);

                    pushFollow(FOLLOW_fcnArgumentList_in_fieldAccess3892);
                    fcnArgumentList271=fcnArgumentList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_fcnArgumentList.add(fcnArgumentList271.getTree());


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
                    // 637:44: -> ^( E_CALL IDENT fcnArgumentList )
                    {
                        // pol.g:637:47: ^( E_CALL IDENT fcnArgumentList )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(E_CALL, "E_CALL"), root_1);

                        adaptor.addChild(root_1, stream_IDENT.nextNode());
                        adaptor.addChild(root_1, stream_fcnArgumentList.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // pol.g:638:12: '.' IDENT
                    {
                    char_literal272=(Token)match(input,158,FOLLOW_158_in_fieldAccess3918); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_158.add(char_literal272);

                    IDENT273=(Token)match(input,IDENT,FOLLOW_IDENT_in_fieldAccess3924); if (state.failed) return retval; 
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
                    // 638:28: -> ^( E_IDENT IDENT )
                    {
                        // pol.g:638:31: ^( E_IDENT IDENT )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(E_IDENT, "E_IDENT"), root_1);

                        adaptor.addChild(root_1, stream_IDENT.nextNode());

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
    // pol.g:640:1: arrayAccess : '[' ( exprList )? ']' -> ^( E_INDEX ( exprList )? ) ;
    public final polParser.arrayAccess_return arrayAccess() throws RecognitionException {
        polParser.arrayAccess_return retval = new polParser.arrayAccess_return();
        retval.start = input.LT(1);
        int arrayAccess_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal274=null;
        Token char_literal276=null;
        polParser.exprList_return exprList275 = null;


        Object char_literal274_tree=null;
        Object char_literal276_tree=null;
        RewriteRuleTokenStream stream_160=new RewriteRuleTokenStream(adaptor,"token 160");
        RewriteRuleTokenStream stream_159=new RewriteRuleTokenStream(adaptor,"token 159");
        RewriteRuleSubtreeStream stream_exprList=new RewriteRuleSubtreeStream(adaptor,"rule exprList");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 77) ) { return retval; }
            // pol.g:641:2: ( '[' ( exprList )? ']' -> ^( E_INDEX ( exprList )? ) )
            // pol.g:641:4: '[' ( exprList )? ']'
            {
            char_literal274=(Token)match(input,159,FOLLOW_159_in_arrayAccess3945); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_159.add(char_literal274);

            // pol.g:641:8: ( exprList )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( ((LA80_0>=NL && LA80_0<=IDENT)||(LA80_0>=INT_LIT && LA80_0<=CHAR)||(LA80_0>=INC && LA80_0<=DEC)||LA80_0==MINUS||(LA80_0>=LOG_NOT && LA80_0<=BIT_NOT)||(LA80_0>=SEMI && LA80_0<=INJECT)||(LA80_0>=122 && LA80_0<=130)||LA80_0==132||(LA80_0>=134 && LA80_0<=135)||(LA80_0>=152 && LA80_0<=157)||LA80_0==159||(LA80_0>=161 && LA80_0<=162)||(LA80_0>=166 && LA80_0<=170)||(LA80_0>=172 && LA80_0<=177)||(LA80_0>=180 && LA80_0<=194)) ) {
                alt80=1;
            }
            else if ( (LA80_0==160) ) {
                int LA80_2 = input.LA(2);

                if ( (synpred133_pol()) ) {
                    alt80=1;
                }
            }
            switch (alt80) {
                case 1 :
                    // pol.g:641:9: exprList
                    {
                    pushFollow(FOLLOW_exprList_in_arrayAccess3948);
                    exprList275=exprList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_exprList.add(exprList275.getTree());

                    }
                    break;

            }

            char_literal276=(Token)match(input,160,FOLLOW_160_in_arrayAccess3952); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_160.add(char_literal276);



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
            // 641:24: -> ^( E_INDEX ( exprList )? )
            {
                // pol.g:641:27: ^( E_INDEX ( exprList )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(E_INDEX, "E_INDEX"), root_1);

                // pol.g:641:37: ( exprList )?
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
    // pol.g:643:1: stmtBlock : braceOpen stmts braceClose -> ^( S_BLOCK stmts ) ;
    public final polParser.stmtBlock_return stmtBlock() throws RecognitionException {
        polParser.stmtBlock_return retval = new polParser.stmtBlock_return();
        retval.start = input.LT(1);
        int stmtBlock_StartIndex = input.index();
        Object root_0 = null;

        polParser.braceOpen_return braceOpen277 = null;

        polParser.stmts_return stmts278 = null;

        polParser.braceClose_return braceClose279 = null;


        RewriteRuleSubtreeStream stream_stmts=new RewriteRuleSubtreeStream(adaptor,"rule stmts");
        RewriteRuleSubtreeStream stream_braceOpen=new RewriteRuleSubtreeStream(adaptor,"rule braceOpen");
        RewriteRuleSubtreeStream stream_braceClose=new RewriteRuleSubtreeStream(adaptor,"rule braceClose");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 78) ) { return retval; }
            // pol.g:645:2: ( braceOpen stmts braceClose -> ^( S_BLOCK stmts ) )
            // pol.g:645:4: braceOpen stmts braceClose
            {
            pushFollow(FOLLOW_braceOpen_in_stmtBlock3973);
            braceOpen277=braceOpen();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_braceOpen.add(braceOpen277.getTree());
            pushFollow(FOLLOW_stmts_in_stmtBlock3975);
            stmts278=stmts();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_stmts.add(stmts278.getTree());
            pushFollow(FOLLOW_braceClose_in_stmtBlock3977);
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
            // 645:32: -> ^( S_BLOCK stmts )
            {
                // pol.g:645:35: ^( S_BLOCK stmts )
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
    // pol.g:647:1: stmts : ( ( stmt )+ -> ^( LIST ( stmt )+ ) | ( ( NL )* ) -> LIST );
    public final polParser.stmts_return stmts() throws RecognitionException {
        polParser.stmts_return retval = new polParser.stmts_return();
        retval.start = input.LT(1);
        int stmts_StartIndex = input.index();
        Object root_0 = null;

        Token NL281=null;
        polParser.stmt_return stmt280 = null;


        Object NL281_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_stmt=new RewriteRuleSubtreeStream(adaptor,"rule stmt");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 79) ) { return retval; }
            // pol.g:648:2: ( ( stmt )+ -> ^( LIST ( stmt )+ ) | ( ( NL )* ) -> LIST )
            int alt83=2;
            switch ( input.LA(1) ) {
            case IDENT:
            case INT_LIT:
            case STRING:
            case CHAR:
            case INC:
            case DEC:
            case MINUS:
            case LOG_NOT:
            case BIT_NOT:
            case OCT_LIT:
            case REAL_LIT:
            case HEX_LIT:
            case INJECT:
            case 134:
            case 152:
            case 153:
            case 156:
            case 157:
            case 159:
            case 161:
            case 162:
            case 166:
            case 167:
            case 168:
            case 169:
            case 170:
            case 172:
            case 175:
            case 176:
            case 177:
            case 180:
            case 181:
            case 182:
            case 183:
            case 184:
            case 185:
            case 186:
            case 187:
            case 188:
            case 189:
            case 190:
            case 191:
            case 192:
            case 193:
            case 194:
                {
                alt83=1;
                }
                break;
            case NL:
                {
                int LA83_2 = input.LA(2);

                if ( (synpred135_pol()) ) {
                    alt83=1;
                }
                else if ( (true) ) {
                    alt83=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 83, 2, input);

                    throw nvae;
                }
                }
                break;
            case 135:
            case 173:
            case 174:
                {
                alt83=2;
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
                    // pol.g:648:4: ( stmt )+
                    {
                    // pol.g:648:4: ( stmt )+
                    int cnt81=0;
                    loop81:
                    do {
                        int alt81=2;
                        int LA81_0 = input.LA(1);

                        if ( (LA81_0==IDENT||(LA81_0>=INT_LIT && LA81_0<=CHAR)||(LA81_0>=INC && LA81_0<=DEC)||LA81_0==MINUS||(LA81_0>=LOG_NOT && LA81_0<=BIT_NOT)||(LA81_0>=OCT_LIT && LA81_0<=INJECT)||LA81_0==134||(LA81_0>=152 && LA81_0<=153)||(LA81_0>=156 && LA81_0<=157)||LA81_0==159||(LA81_0>=161 && LA81_0<=162)||(LA81_0>=166 && LA81_0<=170)||LA81_0==172||(LA81_0>=175 && LA81_0<=177)||(LA81_0>=180 && LA81_0<=194)) ) {
                            alt81=1;
                        }
                        else if ( (LA81_0==NL) ) {
                            int LA81_2 = input.LA(2);

                            if ( (synpred134_pol()) ) {
                                alt81=1;
                            }


                        }


                        switch (alt81) {
                    	case 1 :
                    	    // pol.g:648:5: stmt
                    	    {
                    	    pushFollow(FOLLOW_stmt_in_stmts3997);
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
                    // 648:13: -> ^( LIST ( stmt )+ )
                    {
                        // pol.g:648:16: ^( LIST ( stmt )+ )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LIST, "LIST"), root_1);

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

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // pol.g:649:4: ( ( NL )* )
                    {
                    // pol.g:649:4: ( ( NL )* )
                    // pol.g:649:5: ( NL )*
                    {
                    // pol.g:649:5: ( NL )*
                    loop82:
                    do {
                        int alt82=2;
                        int LA82_0 = input.LA(1);

                        if ( (LA82_0==NL) ) {
                            int LA82_2 = input.LA(2);

                            if ( (synpred136_pol()) ) {
                                alt82=1;
                            }


                        }


                        switch (alt82) {
                    	case 1 :
                    	    // pol.g:0:0: NL
                    	    {
                    	    NL281=(Token)match(input,NL,FOLLOW_NL_in_stmts4015); if (state.failed) return retval; 
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
                    // 649:10: -> LIST
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(LIST, "LIST"));

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
    // pol.g:651:1: stmt : ( varDeclaration | stmtAssign | stmtAssert | stmtBind | stmtBlock | stmtPrint | stmtReturn | stmtBreak | stmtContinue | stmtForEach | stmtFor | stmtSwitch | stmtDoWhile | stmtIf | stmtProvided | stmtWhile | stmtInjection | expr delim );
    public final polParser.stmt_return stmt() throws RecognitionException {
        polParser.stmt_return retval = new polParser.stmt_return();
        retval.start = input.LT(1);
        int stmt_StartIndex = input.index();
        Object root_0 = null;

        polParser.varDeclaration_return varDeclaration282 = null;

        polParser.stmtAssign_return stmtAssign283 = null;

        polParser.stmtAssert_return stmtAssert284 = null;

        polParser.stmtBind_return stmtBind285 = null;

        polParser.stmtBlock_return stmtBlock286 = null;

        polParser.stmtPrint_return stmtPrint287 = null;

        polParser.stmtReturn_return stmtReturn288 = null;

        polParser.stmtBreak_return stmtBreak289 = null;

        polParser.stmtContinue_return stmtContinue290 = null;

        polParser.stmtForEach_return stmtForEach291 = null;

        polParser.stmtFor_return stmtFor292 = null;

        polParser.stmtSwitch_return stmtSwitch293 = null;

        polParser.stmtDoWhile_return stmtDoWhile294 = null;

        polParser.stmtIf_return stmtIf295 = null;

        polParser.stmtProvided_return stmtProvided296 = null;

        polParser.stmtWhile_return stmtWhile297 = null;

        polParser.stmtInjection_return stmtInjection298 = null;

        polParser.expr_return expr299 = null;

        polParser.delim_return delim300 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 80) ) { return retval; }
            // pol.g:652:2: ( varDeclaration | stmtAssign | stmtAssert | stmtBind | stmtBlock | stmtPrint | stmtReturn | stmtBreak | stmtContinue | stmtForEach | stmtFor | stmtSwitch | stmtDoWhile | stmtIf | stmtProvided | stmtWhile | stmtInjection | expr delim )
            int alt84=18;
            alt84 = dfa84.predict(input);
            switch (alt84) {
                case 1 :
                    // pol.g:652:5: varDeclaration
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_varDeclaration_in_stmt4032);
                    varDeclaration282=varDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDeclaration282.getTree());

                    }
                    break;
                case 2 :
                    // pol.g:653:4: stmtAssign
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_stmtAssign_in_stmt4038);
                    stmtAssign283=stmtAssign();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmtAssign283.getTree());

                    }
                    break;
                case 3 :
                    // pol.g:654:4: stmtAssert
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_stmtAssert_in_stmt4043);
                    stmtAssert284=stmtAssert();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmtAssert284.getTree());

                    }
                    break;
                case 4 :
                    // pol.g:655:4: stmtBind
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_stmtBind_in_stmt4048);
                    stmtBind285=stmtBind();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmtBind285.getTree());

                    }
                    break;
                case 5 :
                    // pol.g:656:5: stmtBlock
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_stmtBlock_in_stmt4054);
                    stmtBlock286=stmtBlock();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmtBlock286.getTree());

                    }
                    break;
                case 6 :
                    // pol.g:657:4: stmtPrint
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_stmtPrint_in_stmt4059);
                    stmtPrint287=stmtPrint();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmtPrint287.getTree());

                    }
                    break;
                case 7 :
                    // pol.g:658:4: stmtReturn
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_stmtReturn_in_stmt4064);
                    stmtReturn288=stmtReturn();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmtReturn288.getTree());

                    }
                    break;
                case 8 :
                    // pol.g:659:4: stmtBreak
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_stmtBreak_in_stmt4069);
                    stmtBreak289=stmtBreak();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmtBreak289.getTree());

                    }
                    break;
                case 9 :
                    // pol.g:660:5: stmtContinue
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_stmtContinue_in_stmt4075);
                    stmtContinue290=stmtContinue();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmtContinue290.getTree());

                    }
                    break;
                case 10 :
                    // pol.g:661:5: stmtForEach
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_stmtForEach_in_stmt4081);
                    stmtForEach291=stmtForEach();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmtForEach291.getTree());

                    }
                    break;
                case 11 :
                    // pol.g:662:5: stmtFor
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_stmtFor_in_stmt4087);
                    stmtFor292=stmtFor();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmtFor292.getTree());

                    }
                    break;
                case 12 :
                    // pol.g:663:4: stmtSwitch
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_stmtSwitch_in_stmt4092);
                    stmtSwitch293=stmtSwitch();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmtSwitch293.getTree());

                    }
                    break;
                case 13 :
                    // pol.g:664:5: stmtDoWhile
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_stmtDoWhile_in_stmt4098);
                    stmtDoWhile294=stmtDoWhile();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmtDoWhile294.getTree());

                    }
                    break;
                case 14 :
                    // pol.g:665:4: stmtIf
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_stmtIf_in_stmt4103);
                    stmtIf295=stmtIf();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmtIf295.getTree());

                    }
                    break;
                case 15 :
                    // pol.g:666:4: stmtProvided
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_stmtProvided_in_stmt4108);
                    stmtProvided296=stmtProvided();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmtProvided296.getTree());

                    }
                    break;
                case 16 :
                    // pol.g:667:4: stmtWhile
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_stmtWhile_in_stmt4113);
                    stmtWhile297=stmtWhile();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmtWhile297.getTree());

                    }
                    break;
                case 17 :
                    // pol.g:668:4: stmtInjection
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_stmtInjection_in_stmt4119);
                    stmtInjection298=stmtInjection();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmtInjection298.getTree());

                    }
                    break;
                case 18 :
                    // pol.g:669:4: expr delim
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_expr_in_stmt4124);
                    expr299=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr299.getTree());
                    pushFollow(FOLLOW_delim_in_stmt4126);
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
    // pol.g:671:1: stmtAssign : ( varOrFcnOrArray ASSIGN expr delim -> ^( S_ASSIGN ^( E_BINARY ASSIGN varOrFcnOrArray expr ) ) | injectionCode ASSIGN expr delim -> ^( S_ASSIGN ^( E_BINARY ASSIGN injectionCode expr ) ) | varOrFcnOrArray assignOp expr delim -> ^( S_ASSIGN ^( E_BINARY assignOp varOrFcnOrArray expr ) ) | injectionCode assignOp expr delim -> ^( S_ASSIGN ^( E_BINARY assignOp injectionCode expr ) ) );
    public final polParser.stmtAssign_return stmtAssign() throws RecognitionException {
        polParser.stmtAssign_return retval = new polParser.stmtAssign_return();
        retval.start = input.LT(1);
        int stmtAssign_StartIndex = input.index();
        Object root_0 = null;

        Token ASSIGN302=null;
        Token ASSIGN306=null;
        polParser.varOrFcnOrArray_return varOrFcnOrArray301 = null;

        polParser.expr_return expr303 = null;

        polParser.delim_return delim304 = null;

        polParser.injectionCode_return injectionCode305 = null;

        polParser.expr_return expr307 = null;

        polParser.delim_return delim308 = null;

        polParser.varOrFcnOrArray_return varOrFcnOrArray309 = null;

        polParser.assignOp_return assignOp310 = null;

        polParser.expr_return expr311 = null;

        polParser.delim_return delim312 = null;

        polParser.injectionCode_return injectionCode313 = null;

        polParser.assignOp_return assignOp314 = null;

        polParser.expr_return expr315 = null;

        polParser.delim_return delim316 = null;


        Object ASSIGN302_tree=null;
        Object ASSIGN306_tree=null;
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
        RewriteRuleSubtreeStream stream_assignOp=new RewriteRuleSubtreeStream(adaptor,"rule assignOp");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_injectionCode=new RewriteRuleSubtreeStream(adaptor,"rule injectionCode");
        RewriteRuleSubtreeStream stream_varOrFcnOrArray=new RewriteRuleSubtreeStream(adaptor,"rule varOrFcnOrArray");
        RewriteRuleSubtreeStream stream_delim=new RewriteRuleSubtreeStream(adaptor,"rule delim");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 81) ) { return retval; }
            // pol.g:672:2: ( varOrFcnOrArray ASSIGN expr delim -> ^( S_ASSIGN ^( E_BINARY ASSIGN varOrFcnOrArray expr ) ) | injectionCode ASSIGN expr delim -> ^( S_ASSIGN ^( E_BINARY ASSIGN injectionCode expr ) ) | varOrFcnOrArray assignOp expr delim -> ^( S_ASSIGN ^( E_BINARY assignOp varOrFcnOrArray expr ) ) | injectionCode assignOp expr delim -> ^( S_ASSIGN ^( E_BINARY assignOp injectionCode expr ) ) )
            int alt85=4;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==IDENT||LA85_0==152||LA85_0==157) ) {
                int LA85_1 = input.LA(2);

                if ( (synpred154_pol()) ) {
                    alt85=1;
                }
                else if ( (synpred156_pol()) ) {
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

                if ( (synpred155_pol()) ) {
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
                    // pol.g:672:4: varOrFcnOrArray ASSIGN expr delim
                    {
                    pushFollow(FOLLOW_varOrFcnOrArray_in_stmtAssign4136);
                    varOrFcnOrArray301=varOrFcnOrArray();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_varOrFcnOrArray.add(varOrFcnOrArray301.getTree());
                    ASSIGN302=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_stmtAssign4138); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ASSIGN.add(ASSIGN302);

                    pushFollow(FOLLOW_expr_in_stmtAssign4140);
                    expr303=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr303.getTree());
                    pushFollow(FOLLOW_delim_in_stmtAssign4142);
                    delim304=delim();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_delim.add(delim304.getTree());


                    // AST REWRITE
                    // elements: ASSIGN, varOrFcnOrArray, expr
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
                        // pol.g:673:6: ^( S_ASSIGN ^( E_BINARY ASSIGN varOrFcnOrArray expr ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(S_ASSIGN, "S_ASSIGN"), root_1);

                        // pol.g:673:17: ^( E_BINARY ASSIGN varOrFcnOrArray expr )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(E_BINARY, "E_BINARY"), root_2);

                        adaptor.addChild(root_2, stream_ASSIGN.nextNode());
                        adaptor.addChild(root_2, stream_varOrFcnOrArray.nextTree());
                        adaptor.addChild(root_2, stream_expr.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // pol.g:674:4: injectionCode ASSIGN expr delim
                    {
                    pushFollow(FOLLOW_injectionCode_in_stmtAssign4165);
                    injectionCode305=injectionCode();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_injectionCode.add(injectionCode305.getTree());
                    ASSIGN306=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_stmtAssign4167); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ASSIGN.add(ASSIGN306);

                    pushFollow(FOLLOW_expr_in_stmtAssign4169);
                    expr307=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr307.getTree());
                    pushFollow(FOLLOW_delim_in_stmtAssign4171);
                    delim308=delim();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_delim.add(delim308.getTree());


                    // AST REWRITE
                    // elements: injectionCode, ASSIGN, expr
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
                        // pol.g:675:6: ^( S_ASSIGN ^( E_BINARY ASSIGN injectionCode expr ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(S_ASSIGN, "S_ASSIGN"), root_1);

                        // pol.g:675:17: ^( E_BINARY ASSIGN injectionCode expr )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(E_BINARY, "E_BINARY"), root_2);

                        adaptor.addChild(root_2, stream_ASSIGN.nextNode());
                        adaptor.addChild(root_2, stream_injectionCode.nextTree());
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
                    // pol.g:676:4: varOrFcnOrArray assignOp expr delim
                    {
                    pushFollow(FOLLOW_varOrFcnOrArray_in_stmtAssign4194);
                    varOrFcnOrArray309=varOrFcnOrArray();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_varOrFcnOrArray.add(varOrFcnOrArray309.getTree());
                    pushFollow(FOLLOW_assignOp_in_stmtAssign4196);
                    assignOp310=assignOp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_assignOp.add(assignOp310.getTree());
                    pushFollow(FOLLOW_expr_in_stmtAssign4198);
                    expr311=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr311.getTree());
                    pushFollow(FOLLOW_delim_in_stmtAssign4201);
                    delim312=delim();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_delim.add(delim312.getTree());


                    // AST REWRITE
                    // elements: expr, assignOp, varOrFcnOrArray
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
                        // pol.g:677:6: ^( S_ASSIGN ^( E_BINARY assignOp varOrFcnOrArray expr ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(S_ASSIGN, "S_ASSIGN"), root_1);

                        // pol.g:677:17: ^( E_BINARY assignOp varOrFcnOrArray expr )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(E_BINARY, "E_BINARY"), root_2);

                        adaptor.addChild(root_2, stream_assignOp.nextTree());
                        adaptor.addChild(root_2, stream_varOrFcnOrArray.nextTree());
                        adaptor.addChild(root_2, stream_expr.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // pol.g:678:4: injectionCode assignOp expr delim
                    {
                    pushFollow(FOLLOW_injectionCode_in_stmtAssign4224);
                    injectionCode313=injectionCode();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_injectionCode.add(injectionCode313.getTree());
                    pushFollow(FOLLOW_assignOp_in_stmtAssign4226);
                    assignOp314=assignOp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_assignOp.add(assignOp314.getTree());
                    pushFollow(FOLLOW_expr_in_stmtAssign4228);
                    expr315=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr315.getTree());
                    pushFollow(FOLLOW_delim_in_stmtAssign4230);
                    delim316=delim();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_delim.add(delim316.getTree());


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

                    root_0 = (Object)adaptor.nil();
                    // 679:3: -> ^( S_ASSIGN ^( E_BINARY assignOp injectionCode expr ) )
                    {
                        // pol.g:679:6: ^( S_ASSIGN ^( E_BINARY assignOp injectionCode expr ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(S_ASSIGN, "S_ASSIGN"), root_1);

                        // pol.g:679:17: ^( E_BINARY assignOp injectionCode expr )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(E_BINARY, "E_BINARY"), root_2);

                        adaptor.addChild(root_2, stream_assignOp.nextTree());
                        adaptor.addChild(root_2, stream_injectionCode.nextTree());
                        adaptor.addChild(root_2, stream_expr.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

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
    // pol.g:681:1: stmtAssert : 'assert' exprList delim -> ^( S_ASSERT exprList ) ;
    public final polParser.stmtAssert_return stmtAssert() throws RecognitionException {
        polParser.stmtAssert_return retval = new polParser.stmtAssert_return();
        retval.start = input.LT(1);
        int stmtAssert_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal317=null;
        polParser.exprList_return exprList318 = null;

        polParser.delim_return delim319 = null;


        Object string_literal317_tree=null;
        RewriteRuleTokenStream stream_161=new RewriteRuleTokenStream(adaptor,"token 161");
        RewriteRuleSubtreeStream stream_delim=new RewriteRuleSubtreeStream(adaptor,"rule delim");
        RewriteRuleSubtreeStream stream_exprList=new RewriteRuleSubtreeStream(adaptor,"rule exprList");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 82) ) { return retval; }
            // pol.g:682:2: ( 'assert' exprList delim -> ^( S_ASSERT exprList ) )
            // pol.g:682:4: 'assert' exprList delim
            {
            string_literal317=(Token)match(input,161,FOLLOW_161_in_stmtAssert4258); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_161.add(string_literal317);

            pushFollow(FOLLOW_exprList_in_stmtAssert4260);
            exprList318=exprList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_exprList.add(exprList318.getTree());
            pushFollow(FOLLOW_delim_in_stmtAssert4262);
            delim319=delim();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_delim.add(delim319.getTree());


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
                // pol.g:682:31: ^( S_ASSERT exprList )
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
    // pol.g:684:1: stmtBind : varOrFcnOrArray BIND expr delim -> ^( S_BIND varOrFcnOrArray expr ) ;
    public final polParser.stmtBind_return stmtBind() throws RecognitionException {
        polParser.stmtBind_return retval = new polParser.stmtBind_return();
        retval.start = input.LT(1);
        int stmtBind_StartIndex = input.index();
        Object root_0 = null;

        Token BIND321=null;
        polParser.varOrFcnOrArray_return varOrFcnOrArray320 = null;

        polParser.expr_return expr322 = null;

        polParser.delim_return delim323 = null;


        Object BIND321_tree=null;
        RewriteRuleTokenStream stream_BIND=new RewriteRuleTokenStream(adaptor,"token BIND");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_varOrFcnOrArray=new RewriteRuleSubtreeStream(adaptor,"rule varOrFcnOrArray");
        RewriteRuleSubtreeStream stream_delim=new RewriteRuleSubtreeStream(adaptor,"rule delim");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 83) ) { return retval; }
            // pol.g:685:2: ( varOrFcnOrArray BIND expr delim -> ^( S_BIND varOrFcnOrArray expr ) )
            // pol.g:685:4: varOrFcnOrArray BIND expr delim
            {
            pushFollow(FOLLOW_varOrFcnOrArray_in_stmtBind4280);
            varOrFcnOrArray320=varOrFcnOrArray();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_varOrFcnOrArray.add(varOrFcnOrArray320.getTree());
            BIND321=(Token)match(input,BIND,FOLLOW_BIND_in_stmtBind4282); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_BIND.add(BIND321);

            pushFollow(FOLLOW_expr_in_stmtBind4285);
            expr322=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr322.getTree());
            pushFollow(FOLLOW_delim_in_stmtBind4288);
            delim323=delim();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_delim.add(delim323.getTree());


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
                // pol.g:685:41: ^( S_BIND varOrFcnOrArray expr )
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
    // pol.g:687:1: stmtPrint : 'print' ( stmtPrintTarget )? exprList -> ^( S_PRINT ( stmtPrintTarget )? exprList ) ;
    public final polParser.stmtPrint_return stmtPrint() throws RecognitionException {
        polParser.stmtPrint_return retval = new polParser.stmtPrint_return();
        retval.start = input.LT(1);
        int stmtPrint_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal324=null;
        polParser.stmtPrintTarget_return stmtPrintTarget325 = null;

        polParser.exprList_return exprList326 = null;


        Object string_literal324_tree=null;
        RewriteRuleTokenStream stream_162=new RewriteRuleTokenStream(adaptor,"token 162");
        RewriteRuleSubtreeStream stream_stmtPrintTarget=new RewriteRuleSubtreeStream(adaptor,"rule stmtPrintTarget");
        RewriteRuleSubtreeStream stream_exprList=new RewriteRuleSubtreeStream(adaptor,"rule exprList");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 84) ) { return retval; }
            // pol.g:688:2: ( 'print' ( stmtPrintTarget )? exprList -> ^( S_PRINT ( stmtPrintTarget )? exprList ) )
            // pol.g:688:4: 'print' ( stmtPrintTarget )? exprList
            {
            string_literal324=(Token)match(input,162,FOLLOW_162_in_stmtPrint4310); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_162.add(string_literal324);

            // pol.g:688:12: ( stmtPrintTarget )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( ((LA86_0>=163 && LA86_0<=165)) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // pol.g:688:13: stmtPrintTarget
                    {
                    pushFollow(FOLLOW_stmtPrintTarget_in_stmtPrint4313);
                    stmtPrintTarget325=stmtPrintTarget();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_stmtPrintTarget.add(stmtPrintTarget325.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_exprList_in_stmtPrint4317);
            exprList326=exprList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_exprList.add(exprList326.getTree());


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
                // pol.g:689:6: ^( S_PRINT ( stmtPrintTarget )? exprList )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(S_PRINT, "S_PRINT"), root_1);

                // pol.g:689:16: ( stmtPrintTarget )?
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
    // pol.g:691:1: stmtPrintTarget : ( 'log' | 'err' | 'out' ) ;
    public final polParser.stmtPrintTarget_return stmtPrintTarget() throws RecognitionException {
        polParser.stmtPrintTarget_return retval = new polParser.stmtPrintTarget_return();
        retval.start = input.LT(1);
        int stmtPrintTarget_StartIndex = input.index();
        Object root_0 = null;

        Token set327=null;

        Object set327_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 85) ) { return retval; }
            // pol.g:692:2: ( ( 'log' | 'err' | 'out' ) )
            // pol.g:692:4: ( 'log' | 'err' | 'out' )
            {
            root_0 = (Object)adaptor.nil();

            set327=(Token)input.LT(1);
            if ( (input.LA(1)>=163 && input.LA(1)<=165) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set327));
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
    // pol.g:694:1: stmtReturn : ( 'return' ( '(' ) ( expr ( ',' expr )+ ) ( ')' ) delim -> ^( S_RETURN ( expr )+ ) | 'return' ( expr ) delim -> ^( S_RETURN expr ) );
    public final polParser.stmtReturn_return stmtReturn() throws RecognitionException {
        polParser.stmtReturn_return retval = new polParser.stmtReturn_return();
        retval.start = input.LT(1);
        int stmtReturn_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal328=null;
        Token char_literal329=null;
        Token char_literal331=null;
        Token char_literal333=null;
        Token string_literal335=null;
        polParser.expr_return expr330 = null;

        polParser.expr_return expr332 = null;

        polParser.delim_return delim334 = null;

        polParser.expr_return expr336 = null;

        polParser.delim_return delim337 = null;


        Object string_literal328_tree=null;
        Object char_literal329_tree=null;
        Object char_literal331_tree=null;
        Object char_literal333_tree=null;
        Object string_literal335_tree=null;
        RewriteRuleTokenStream stream_126=new RewriteRuleTokenStream(adaptor,"token 126");
        RewriteRuleTokenStream stream_153=new RewriteRuleTokenStream(adaptor,"token 153");
        RewriteRuleTokenStream stream_166=new RewriteRuleTokenStream(adaptor,"token 166");
        RewriteRuleTokenStream stream_154=new RewriteRuleTokenStream(adaptor,"token 154");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_delim=new RewriteRuleSubtreeStream(adaptor,"rule delim");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 86) ) { return retval; }
            // pol.g:697:2: ( 'return' ( '(' ) ( expr ( ',' expr )+ ) ( ')' ) delim -> ^( S_RETURN ( expr )+ ) | 'return' ( expr ) delim -> ^( S_RETURN expr ) )
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==166) ) {
                int LA88_1 = input.LA(2);

                if ( (synpred161_pol()) ) {
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
                    // pol.g:697:4: 'return' ( '(' ) ( expr ( ',' expr )+ ) ( ')' ) delim
                    {
                    string_literal328=(Token)match(input,166,FOLLOW_166_in_stmtReturn4363); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_166.add(string_literal328);

                    // pol.g:697:13: ( '(' )
                    // pol.g:697:14: '('
                    {
                    char_literal329=(Token)match(input,153,FOLLOW_153_in_stmtReturn4366); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_153.add(char_literal329);


                    }

                    // pol.g:697:19: ( expr ( ',' expr )+ )
                    // pol.g:697:20: expr ( ',' expr )+
                    {
                    pushFollow(FOLLOW_expr_in_stmtReturn4370);
                    expr330=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr330.getTree());
                    // pol.g:697:25: ( ',' expr )+
                    int cnt87=0;
                    loop87:
                    do {
                        int alt87=2;
                        int LA87_0 = input.LA(1);

                        if ( (LA87_0==126) ) {
                            alt87=1;
                        }


                        switch (alt87) {
                    	case 1 :
                    	    // pol.g:697:26: ',' expr
                    	    {
                    	    char_literal331=(Token)match(input,126,FOLLOW_126_in_stmtReturn4373); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_126.add(char_literal331);

                    	    pushFollow(FOLLOW_expr_in_stmtReturn4375);
                    	    expr332=expr();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_expr.add(expr332.getTree());

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

                    // pol.g:697:38: ( ')' )
                    // pol.g:697:39: ')'
                    {
                    char_literal333=(Token)match(input,154,FOLLOW_154_in_stmtReturn4381); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_154.add(char_literal333);


                    }

                    pushFollow(FOLLOW_delim_in_stmtReturn4384);
                    delim334=delim();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_delim.add(delim334.getTree());


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
                        // pol.g:697:53: ^( S_RETURN ( expr )+ )
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
                    // pol.g:698:4: 'return' ( expr ) delim
                    {
                    string_literal335=(Token)match(input,166,FOLLOW_166_in_stmtReturn4398); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_166.add(string_literal335);

                    // pol.g:698:14: ( expr )
                    // pol.g:698:15: expr
                    {
                    pushFollow(FOLLOW_expr_in_stmtReturn4402);
                    expr336=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr336.getTree());

                    }

                    pushFollow(FOLLOW_delim_in_stmtReturn4406);
                    delim337=delim();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_delim.add(delim337.getTree());


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
                        // pol.g:698:31: ^( S_RETURN expr )
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
    // pol.g:700:1: stmtBreak : 'break' delim -> ^( S_BREAK ) ;
    public final polParser.stmtBreak_return stmtBreak() throws RecognitionException {
        polParser.stmtBreak_return retval = new polParser.stmtBreak_return();
        retval.start = input.LT(1);
        int stmtBreak_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal338=null;
        polParser.delim_return delim339 = null;


        Object string_literal338_tree=null;
        RewriteRuleTokenStream stream_167=new RewriteRuleTokenStream(adaptor,"token 167");
        RewriteRuleSubtreeStream stream_delim=new RewriteRuleSubtreeStream(adaptor,"rule delim");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 87) ) { return retval; }
            // pol.g:701:2: ( 'break' delim -> ^( S_BREAK ) )
            // pol.g:701:4: 'break' delim
            {
            string_literal338=(Token)match(input,167,FOLLOW_167_in_stmtBreak4424); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_167.add(string_literal338);

            pushFollow(FOLLOW_delim_in_stmtBreak4426);
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

            root_0 = (Object)adaptor.nil();
            // 701:18: -> ^( S_BREAK )
            {
                // pol.g:701:21: ^( S_BREAK )
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
    // pol.g:703:1: stmtContinue : 'continue' delim -> ^( S_CONTINUE ) ;
    public final polParser.stmtContinue_return stmtContinue() throws RecognitionException {
        polParser.stmtContinue_return retval = new polParser.stmtContinue_return();
        retval.start = input.LT(1);
        int stmtContinue_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal340=null;
        polParser.delim_return delim341 = null;


        Object string_literal340_tree=null;
        RewriteRuleTokenStream stream_168=new RewriteRuleTokenStream(adaptor,"token 168");
        RewriteRuleSubtreeStream stream_delim=new RewriteRuleSubtreeStream(adaptor,"rule delim");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 88) ) { return retval; }
            // pol.g:704:2: ( 'continue' delim -> ^( S_CONTINUE ) )
            // pol.g:704:4: 'continue' delim
            {
            string_literal340=(Token)match(input,168,FOLLOW_168_in_stmtContinue4442); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_168.add(string_literal340);

            pushFollow(FOLLOW_delim_in_stmtContinue4444);
            delim341=delim();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_delim.add(delim341.getTree());


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
                // pol.g:704:24: ^( S_CONTINUE )
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
    // pol.g:706:1: stmtFor : 'for' '(' stmtForInit stmtForCond stmtForNext ')' stmtBlock -> ^( S_FOR stmtForInit stmtForCond stmtForNext stmtBlock ) ;
    public final polParser.stmtFor_return stmtFor() throws RecognitionException {
        polParser.stmtFor_return retval = new polParser.stmtFor_return();
        retval.start = input.LT(1);
        int stmtFor_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal342=null;
        Token char_literal343=null;
        Token char_literal347=null;
        polParser.stmtForInit_return stmtForInit344 = null;

        polParser.stmtForCond_return stmtForCond345 = null;

        polParser.stmtForNext_return stmtForNext346 = null;

        polParser.stmtBlock_return stmtBlock348 = null;


        Object string_literal342_tree=null;
        Object char_literal343_tree=null;
        Object char_literal347_tree=null;
        RewriteRuleTokenStream stream_153=new RewriteRuleTokenStream(adaptor,"token 153");
        RewriteRuleTokenStream stream_169=new RewriteRuleTokenStream(adaptor,"token 169");
        RewriteRuleTokenStream stream_154=new RewriteRuleTokenStream(adaptor,"token 154");
        RewriteRuleSubtreeStream stream_stmtForCond=new RewriteRuleSubtreeStream(adaptor,"rule stmtForCond");
        RewriteRuleSubtreeStream stream_stmtForInit=new RewriteRuleSubtreeStream(adaptor,"rule stmtForInit");
        RewriteRuleSubtreeStream stream_stmtBlock=new RewriteRuleSubtreeStream(adaptor,"rule stmtBlock");
        RewriteRuleSubtreeStream stream_stmtForNext=new RewriteRuleSubtreeStream(adaptor,"rule stmtForNext");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 89) ) { return retval; }
            // pol.g:707:5: ( 'for' '(' stmtForInit stmtForCond stmtForNext ')' stmtBlock -> ^( S_FOR stmtForInit stmtForCond stmtForNext stmtBlock ) )
            // pol.g:707:9: 'for' '(' stmtForInit stmtForCond stmtForNext ')' stmtBlock
            {
            string_literal342=(Token)match(input,169,FOLLOW_169_in_stmtFor4465); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_169.add(string_literal342);

            char_literal343=(Token)match(input,153,FOLLOW_153_in_stmtFor4467); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_153.add(char_literal343);

            pushFollow(FOLLOW_stmtForInit_in_stmtFor4469);
            stmtForInit344=stmtForInit();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_stmtForInit.add(stmtForInit344.getTree());
            pushFollow(FOLLOW_stmtForCond_in_stmtFor4471);
            stmtForCond345=stmtForCond();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_stmtForCond.add(stmtForCond345.getTree());
            pushFollow(FOLLOW_stmtForNext_in_stmtFor4473);
            stmtForNext346=stmtForNext();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_stmtForNext.add(stmtForNext346.getTree());
            char_literal347=(Token)match(input,154,FOLLOW_154_in_stmtFor4475); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_154.add(char_literal347);

            pushFollow(FOLLOW_stmtBlock_in_stmtFor4477);
            stmtBlock348=stmtBlock();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_stmtBlock.add(stmtBlock348.getTree());


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
            // 708:13: -> ^( S_FOR stmtForInit stmtForCond stmtForNext stmtBlock )
            {
                // pol.g:708:16: ^( S_FOR stmtForInit stmtForCond stmtForNext stmtBlock )
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
    // pol.g:710:1: stmtForCond : ( SEMI -> NIL | expr SEMI -> expr );
    public final polParser.stmtForCond_return stmtForCond() throws RecognitionException {
        polParser.stmtForCond_return retval = new polParser.stmtForCond_return();
        retval.start = input.LT(1);
        int stmtForCond_StartIndex = input.index();
        Object root_0 = null;

        Token SEMI349=null;
        Token SEMI351=null;
        polParser.expr_return expr350 = null;


        Object SEMI349_tree=null;
        Object SEMI351_tree=null;
        RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 90) ) { return retval; }
            // pol.g:711:5: ( SEMI -> NIL | expr SEMI -> expr )
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==SEMI) ) {
                alt89=1;
            }
            else if ( (LA89_0==IDENT||(LA89_0>=INT_LIT && LA89_0<=CHAR)||(LA89_0>=INC && LA89_0<=DEC)||LA89_0==MINUS||(LA89_0>=LOG_NOT && LA89_0<=BIT_NOT)||(LA89_0>=OCT_LIT && LA89_0<=INJECT)||(LA89_0>=152 && LA89_0<=153)||LA89_0==157||LA89_0==159||(LA89_0>=192 && LA89_0<=194)) ) {
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
                    // pol.g:711:9: SEMI
                    {
                    SEMI349=(Token)match(input,SEMI,FOLLOW_SEMI_in_stmtForCond4521); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI349);



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
                        adaptor.addChild(root_0, (Object)adaptor.create(NIL, "NIL"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // pol.g:713:9: expr SEMI
                    {
                    pushFollow(FOLLOW_expr_in_stmtForCond4546);
                    expr350=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr350.getTree());
                    SEMI351=(Token)match(input,SEMI,FOLLOW_SEMI_in_stmtForCond4548); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI351);



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
                    // 713:19: -> expr
                    {
                        adaptor.addChild(root_0, stream_expr.nextTree());

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
    // pol.g:716:1: stmtForInit : ( SEMI -> NIL | typeName IDENT '=' expr SEMI -> ^( S_DECL ^( typeName IDENT expr ) ) | stmtAssign );
    public final polParser.stmtForInit_return stmtForInit() throws RecognitionException {
        polParser.stmtForInit_return retval = new polParser.stmtForInit_return();
        retval.start = input.LT(1);
        int stmtForInit_StartIndex = input.index();
        Object root_0 = null;

        Token SEMI352=null;
        Token IDENT354=null;
        Token char_literal355=null;
        Token SEMI357=null;
        polParser.typeName_return typeName353 = null;

        polParser.expr_return expr356 = null;

        polParser.stmtAssign_return stmtAssign358 = null;


        Object SEMI352_tree=null;
        Object IDENT354_tree=null;
        Object char_literal355_tree=null;
        Object SEMI357_tree=null;
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
        RewriteRuleSubtreeStream stream_typeName=new RewriteRuleSubtreeStream(adaptor,"rule typeName");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 91) ) { return retval; }
            // pol.g:717:5: ( SEMI -> NIL | typeName IDENT '=' expr SEMI -> ^( S_DECL ^( typeName IDENT expr ) ) | stmtAssign )
            int alt90=3;
            switch ( input.LA(1) ) {
            case SEMI:
                {
                alt90=1;
                }
                break;
            case 183:
            case 184:
            case 185:
            case 186:
            case 187:
            case 188:
            case 189:
            case 190:
            case 191:
                {
                alt90=2;
                }
                break;
            case INJECT:
            case 152:
            case 157:
                {
                alt90=3;
                }
                break;
            case IDENT:
                {
                int LA90_4 = input.LA(2);

                if ( (synpred164_pol()) ) {
                    alt90=2;
                }
                else if ( (true) ) {
                    alt90=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 90, 4, input);

                    throw nvae;
                }
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
                    // pol.g:717:9: SEMI
                    {
                    SEMI352=(Token)match(input,SEMI,FOLLOW_SEMI_in_stmtForInit4571); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI352);



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
                        adaptor.addChild(root_0, (Object)adaptor.create(NIL, "NIL"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // pol.g:719:9: typeName IDENT '=' expr SEMI
                    {
                    pushFollow(FOLLOW_typeName_in_stmtForInit4597);
                    typeName353=typeName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeName.add(typeName353.getTree());
                    IDENT354=(Token)match(input,IDENT,FOLLOW_IDENT_in_stmtForInit4599); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENT.add(IDENT354);

                    char_literal355=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_stmtForInit4601); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ASSIGN.add(char_literal355);

                    pushFollow(FOLLOW_expr_in_stmtForInit4603);
                    expr356=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr356.getTree());
                    SEMI357=(Token)match(input,SEMI,FOLLOW_SEMI_in_stmtForInit4605); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI357);



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

                    root_0 = (Object)adaptor.nil();
                    // 720:13: -> ^( S_DECL ^( typeName IDENT expr ) )
                    {
                        // pol.g:720:16: ^( S_DECL ^( typeName IDENT expr ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(S_DECL, "S_DECL"), root_1);

                        // pol.g:720:25: ^( typeName IDENT expr )
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
                    // pol.g:721:9: stmtAssign
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_stmtAssign_in_stmtForInit4642);
                    stmtAssign358=stmtAssign();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmtAssign358.getTree());

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
    // pol.g:723:1: stmtForNext : ( -> NIL | expr );
    public final polParser.stmtForNext_return stmtForNext() throws RecognitionException {
        polParser.stmtForNext_return retval = new polParser.stmtForNext_return();
        retval.start = input.LT(1);
        int stmtForNext_StartIndex = input.index();
        Object root_0 = null;

        polParser.expr_return expr359 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 92) ) { return retval; }
            // pol.g:724:5: ( -> NIL | expr )
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==154) ) {
                alt91=1;
            }
            else if ( (LA91_0==IDENT||(LA91_0>=INT_LIT && LA91_0<=CHAR)||(LA91_0>=INC && LA91_0<=DEC)||LA91_0==MINUS||(LA91_0>=LOG_NOT && LA91_0<=BIT_NOT)||(LA91_0>=OCT_LIT && LA91_0<=INJECT)||(LA91_0>=152 && LA91_0<=153)||LA91_0==157||LA91_0==159||(LA91_0>=192 && LA91_0<=194)) ) {
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
                    // pol.g:725:13: 
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
                        adaptor.addChild(root_0, (Object)adaptor.create(NIL, "NIL"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // pol.g:726:9: expr
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_expr_in_stmtForNext4686);
                    expr359=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr359.getTree());

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
    // pol.g:728:1: stmtForEach : 'foreach' '(' IDENT 'in' expr ')' stmtBlock -> ^( S_FOREACH IDENT ^( E_IDENT expr ) stmtBlock ) ;
    public final polParser.stmtForEach_return stmtForEach() throws RecognitionException {
        polParser.stmtForEach_return retval = new polParser.stmtForEach_return();
        retval.start = input.LT(1);
        int stmtForEach_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal360=null;
        Token char_literal361=null;
        Token IDENT362=null;
        Token string_literal363=null;
        Token char_literal365=null;
        polParser.expr_return expr364 = null;

        polParser.stmtBlock_return stmtBlock366 = null;


        Object string_literal360_tree=null;
        Object char_literal361_tree=null;
        Object IDENT362_tree=null;
        Object string_literal363_tree=null;
        Object char_literal365_tree=null;
        RewriteRuleTokenStream stream_170=new RewriteRuleTokenStream(adaptor,"token 170");
        RewriteRuleTokenStream stream_171=new RewriteRuleTokenStream(adaptor,"token 171");
        RewriteRuleTokenStream stream_153=new RewriteRuleTokenStream(adaptor,"token 153");
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleTokenStream stream_154=new RewriteRuleTokenStream(adaptor,"token 154");
        RewriteRuleSubtreeStream stream_stmtBlock=new RewriteRuleSubtreeStream(adaptor,"rule stmtBlock");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 93) ) { return retval; }
            // pol.g:729:2: ( 'foreach' '(' IDENT 'in' expr ')' stmtBlock -> ^( S_FOREACH IDENT ^( E_IDENT expr ) stmtBlock ) )
            // pol.g:729:4: 'foreach' '(' IDENT 'in' expr ')' stmtBlock
            {
            string_literal360=(Token)match(input,170,FOLLOW_170_in_stmtForEach4699); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_170.add(string_literal360);

            char_literal361=(Token)match(input,153,FOLLOW_153_in_stmtForEach4701); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_153.add(char_literal361);

            IDENT362=(Token)match(input,IDENT,FOLLOW_IDENT_in_stmtForEach4703); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENT.add(IDENT362);

            string_literal363=(Token)match(input,171,FOLLOW_171_in_stmtForEach4705); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_171.add(string_literal363);

            pushFollow(FOLLOW_expr_in_stmtForEach4707);
            expr364=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr364.getTree());
            char_literal365=(Token)match(input,154,FOLLOW_154_in_stmtForEach4709); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_154.add(char_literal365);

            pushFollow(FOLLOW_stmtBlock_in_stmtForEach4711);
            stmtBlock366=stmtBlock();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_stmtBlock.add(stmtBlock366.getTree());


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

            root_0 = (Object)adaptor.nil();
            // 729:48: -> ^( S_FOREACH IDENT ^( E_IDENT expr ) stmtBlock )
            {
                // pol.g:729:51: ^( S_FOREACH IDENT ^( E_IDENT expr ) stmtBlock )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(S_FOREACH, "S_FOREACH"), root_1);

                adaptor.addChild(root_1, stream_IDENT.nextNode());
                // pol.g:729:69: ^( E_IDENT expr )
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
    // pol.g:731:1: stmtSwitch : 'switch' '(' expr ')' braceOpen stmtsCase ( stmtDefault )? braceClose -> ^( S_SWITCH expr stmtsCase ( stmtDefault )? ) ;
    public final polParser.stmtSwitch_return stmtSwitch() throws RecognitionException {
        polParser.stmtSwitch_return retval = new polParser.stmtSwitch_return();
        retval.start = input.LT(1);
        int stmtSwitch_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal367=null;
        Token char_literal368=null;
        Token char_literal370=null;
        polParser.expr_return expr369 = null;

        polParser.braceOpen_return braceOpen371 = null;

        polParser.stmtsCase_return stmtsCase372 = null;

        polParser.stmtDefault_return stmtDefault373 = null;

        polParser.braceClose_return braceClose374 = null;


        Object string_literal367_tree=null;
        Object char_literal368_tree=null;
        Object char_literal370_tree=null;
        RewriteRuleTokenStream stream_153=new RewriteRuleTokenStream(adaptor,"token 153");
        RewriteRuleTokenStream stream_172=new RewriteRuleTokenStream(adaptor,"token 172");
        RewriteRuleTokenStream stream_154=new RewriteRuleTokenStream(adaptor,"token 154");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_stmtsCase=new RewriteRuleSubtreeStream(adaptor,"rule stmtsCase");
        RewriteRuleSubtreeStream stream_stmtDefault=new RewriteRuleSubtreeStream(adaptor,"rule stmtDefault");
        RewriteRuleSubtreeStream stream_braceOpen=new RewriteRuleSubtreeStream(adaptor,"rule braceOpen");
        RewriteRuleSubtreeStream stream_braceClose=new RewriteRuleSubtreeStream(adaptor,"rule braceClose");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 94) ) { return retval; }
            // pol.g:732:2: ( 'switch' '(' expr ')' braceOpen stmtsCase ( stmtDefault )? braceClose -> ^( S_SWITCH expr stmtsCase ( stmtDefault )? ) )
            // pol.g:732:4: 'switch' '(' expr ')' braceOpen stmtsCase ( stmtDefault )? braceClose
            {
            string_literal367=(Token)match(input,172,FOLLOW_172_in_stmtSwitch4737); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_172.add(string_literal367);

            char_literal368=(Token)match(input,153,FOLLOW_153_in_stmtSwitch4739); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_153.add(char_literal368);

            pushFollow(FOLLOW_expr_in_stmtSwitch4741);
            expr369=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr369.getTree());
            char_literal370=(Token)match(input,154,FOLLOW_154_in_stmtSwitch4743); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_154.add(char_literal370);

            pushFollow(FOLLOW_braceOpen_in_stmtSwitch4745);
            braceOpen371=braceOpen();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_braceOpen.add(braceOpen371.getTree());
            pushFollow(FOLLOW_stmtsCase_in_stmtSwitch4747);
            stmtsCase372=stmtsCase();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_stmtsCase.add(stmtsCase372.getTree());
            // pol.g:732:46: ( stmtDefault )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==173) ) {
                alt92=1;
            }
            switch (alt92) {
                case 1 :
                    // pol.g:0:0: stmtDefault
                    {
                    pushFollow(FOLLOW_stmtDefault_in_stmtSwitch4749);
                    stmtDefault373=stmtDefault();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_stmtDefault.add(stmtDefault373.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_braceClose_in_stmtSwitch4752);
            braceClose374=braceClose();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_braceClose.add(braceClose374.getTree());


            // AST REWRITE
            // elements: stmtsCase, stmtDefault, expr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 732:70: -> ^( S_SWITCH expr stmtsCase ( stmtDefault )? )
            {
                // pol.g:732:73: ^( S_SWITCH expr stmtsCase ( stmtDefault )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(S_SWITCH, "S_SWITCH"), root_1);

                adaptor.addChild(root_1, stream_expr.nextTree());
                adaptor.addChild(root_1, stream_stmtsCase.nextTree());
                // pol.g:732:100: ( stmtDefault )?
                if ( stream_stmtDefault.hasNext() ) {
                    adaptor.addChild(root_1, stream_stmtDefault.nextTree());

                }
                stream_stmtDefault.reset();

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
    // pol.g:734:1: stmtsCase : ( stmtCase )* -> ^( LIST ( stmtCase )* ) ;
    public final polParser.stmtsCase_return stmtsCase() throws RecognitionException {
        polParser.stmtsCase_return retval = new polParser.stmtsCase_return();
        retval.start = input.LT(1);
        int stmtsCase_StartIndex = input.index();
        Object root_0 = null;

        polParser.stmtCase_return stmtCase375 = null;


        RewriteRuleSubtreeStream stream_stmtCase=new RewriteRuleSubtreeStream(adaptor,"rule stmtCase");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 95) ) { return retval; }
            // pol.g:735:2: ( ( stmtCase )* -> ^( LIST ( stmtCase )* ) )
            // pol.g:735:4: ( stmtCase )*
            {
            // pol.g:735:4: ( stmtCase )*
            loop93:
            do {
                int alt93=2;
                int LA93_0 = input.LA(1);

                if ( (LA93_0==174) ) {
                    alt93=1;
                }


                switch (alt93) {
            	case 1 :
            	    // pol.g:0:0: stmtCase
            	    {
            	    pushFollow(FOLLOW_stmtCase_in_stmtsCase4776);
            	    stmtCase375=stmtCase();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_stmtCase.add(stmtCase375.getTree());

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

            root_0 = (Object)adaptor.nil();
            // 735:14: -> ^( LIST ( stmtCase )* )
            {
                // pol.g:735:17: ^( LIST ( stmtCase )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LIST, "LIST"), root_1);

                // pol.g:735:24: ( stmtCase )*
                while ( stream_stmtCase.hasNext() ) {
                    adaptor.addChild(root_1, stream_stmtCase.nextTree());

                }
                stream_stmtCase.reset();

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
            if ( state.backtracking>0 ) { memoize(input, 95, stmtsCase_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "stmtsCase"

    public static class stmtDefault_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "stmtDefault"
    // pol.g:737:1: stmtDefault : 'default' ':' ( NL )* stmts -> ^( S_CASE stmts ) ;
    public final polParser.stmtDefault_return stmtDefault() throws RecognitionException {
        polParser.stmtDefault_return retval = new polParser.stmtDefault_return();
        retval.start = input.LT(1);
        int stmtDefault_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal376=null;
        Token char_literal377=null;
        Token NL378=null;
        polParser.stmts_return stmts379 = null;


        Object string_literal376_tree=null;
        Object char_literal377_tree=null;
        Object NL378_tree=null;
        RewriteRuleTokenStream stream_146=new RewriteRuleTokenStream(adaptor,"token 146");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_173=new RewriteRuleTokenStream(adaptor,"token 173");
        RewriteRuleSubtreeStream stream_stmts=new RewriteRuleSubtreeStream(adaptor,"rule stmts");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 96) ) { return retval; }
            // pol.g:738:2: ( 'default' ':' ( NL )* stmts -> ^( S_CASE stmts ) )
            // pol.g:738:4: 'default' ':' ( NL )* stmts
            {
            string_literal376=(Token)match(input,173,FOLLOW_173_in_stmtDefault4796); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_173.add(string_literal376);

            char_literal377=(Token)match(input,146,FOLLOW_146_in_stmtDefault4798); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_146.add(char_literal377);

            // pol.g:738:18: ( NL )*
            loop94:
            do {
                int alt94=2;
                int LA94_0 = input.LA(1);

                if ( (LA94_0==NL) ) {
                    int LA94_1 = input.LA(2);

                    if ( (synpred168_pol()) ) {
                        alt94=1;
                    }


                }


                switch (alt94) {
            	case 1 :
            	    // pol.g:0:0: NL
            	    {
            	    NL378=(Token)match(input,NL,FOLLOW_NL_in_stmtDefault4800); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_NL.add(NL378);


            	    }
            	    break;

            	default :
            	    break loop94;
                }
            } while (true);

            pushFollow(FOLLOW_stmts_in_stmtDefault4803);
            stmts379=stmts();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_stmts.add(stmts379.getTree());


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
            // 738:28: -> ^( S_CASE stmts )
            {
                // pol.g:738:31: ^( S_CASE stmts )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(S_CASE, "S_CASE"), root_1);

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
            if ( state.backtracking>0 ) { memoize(input, 96, stmtDefault_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "stmtDefault"

    public static class stmtCase_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "stmtCase"
    // pol.g:740:1: stmtCase : 'case' ( INT_LIT ) ':' ( NL )* stmts -> ^( S_CASE stmts INT_LIT ) ;
    public final polParser.stmtCase_return stmtCase() throws RecognitionException {
        polParser.stmtCase_return retval = new polParser.stmtCase_return();
        retval.start = input.LT(1);
        int stmtCase_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal380=null;
        Token INT_LIT381=null;
        Token char_literal382=null;
        Token NL383=null;
        polParser.stmts_return stmts384 = null;


        Object string_literal380_tree=null;
        Object INT_LIT381_tree=null;
        Object char_literal382_tree=null;
        Object NL383_tree=null;
        RewriteRuleTokenStream stream_146=new RewriteRuleTokenStream(adaptor,"token 146");
        RewriteRuleTokenStream stream_174=new RewriteRuleTokenStream(adaptor,"token 174");
        RewriteRuleTokenStream stream_INT_LIT=new RewriteRuleTokenStream(adaptor,"token INT_LIT");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_stmts=new RewriteRuleSubtreeStream(adaptor,"rule stmts");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 97) ) { return retval; }
            // pol.g:741:2: ( 'case' ( INT_LIT ) ':' ( NL )* stmts -> ^( S_CASE stmts INT_LIT ) )
            // pol.g:741:4: 'case' ( INT_LIT ) ':' ( NL )* stmts
            {
            string_literal380=(Token)match(input,174,FOLLOW_174_in_stmtCase4821); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_174.add(string_literal380);

            // pol.g:741:11: ( INT_LIT )
            // pol.g:741:12: INT_LIT
            {
            INT_LIT381=(Token)match(input,INT_LIT,FOLLOW_INT_LIT_in_stmtCase4824); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_INT_LIT.add(INT_LIT381);


            }

            char_literal382=(Token)match(input,146,FOLLOW_146_in_stmtCase4827); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_146.add(char_literal382);

            // pol.g:741:25: ( NL )*
            loop95:
            do {
                int alt95=2;
                int LA95_0 = input.LA(1);

                if ( (LA95_0==NL) ) {
                    int LA95_2 = input.LA(2);

                    if ( (synpred169_pol()) ) {
                        alt95=1;
                    }


                }


                switch (alt95) {
            	case 1 :
            	    // pol.g:0:0: NL
            	    {
            	    NL383=(Token)match(input,NL,FOLLOW_NL_in_stmtCase4829); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_NL.add(NL383);


            	    }
            	    break;

            	default :
            	    break loop95;
                }
            } while (true);

            pushFollow(FOLLOW_stmts_in_stmtCase4832);
            stmts384=stmts();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_stmts.add(stmts384.getTree());


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
            // 741:35: -> ^( S_CASE stmts INT_LIT )
            {
                // pol.g:741:38: ^( S_CASE stmts INT_LIT )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(S_CASE, "S_CASE"), root_1);

                adaptor.addChild(root_1, stream_stmts.nextTree());
                adaptor.addChild(root_1, stream_INT_LIT.nextNode());

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
            if ( state.backtracking>0 ) { memoize(input, 97, stmtCase_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "stmtCase"

    public static class stmtDoWhile_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "stmtDoWhile"
    // pol.g:743:1: stmtDoWhile : 'do' stmtBlock 'while' '(' expr ')' delim -> ^( S_WHILE expr stmtBlock ) ;
    public final polParser.stmtDoWhile_return stmtDoWhile() throws RecognitionException {
        polParser.stmtDoWhile_return retval = new polParser.stmtDoWhile_return();
        retval.start = input.LT(1);
        int stmtDoWhile_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal385=null;
        Token string_literal387=null;
        Token char_literal388=null;
        Token char_literal390=null;
        polParser.stmtBlock_return stmtBlock386 = null;

        polParser.expr_return expr389 = null;

        polParser.delim_return delim391 = null;


        Object string_literal385_tree=null;
        Object string_literal387_tree=null;
        Object char_literal388_tree=null;
        Object char_literal390_tree=null;
        RewriteRuleTokenStream stream_153=new RewriteRuleTokenStream(adaptor,"token 153");
        RewriteRuleTokenStream stream_175=new RewriteRuleTokenStream(adaptor,"token 175");
        RewriteRuleTokenStream stream_176=new RewriteRuleTokenStream(adaptor,"token 176");
        RewriteRuleTokenStream stream_154=new RewriteRuleTokenStream(adaptor,"token 154");
        RewriteRuleSubtreeStream stream_stmtBlock=new RewriteRuleSubtreeStream(adaptor,"rule stmtBlock");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_delim=new RewriteRuleSubtreeStream(adaptor,"rule delim");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 98) ) { return retval; }
            // pol.g:744:2: ( 'do' stmtBlock 'while' '(' expr ')' delim -> ^( S_WHILE expr stmtBlock ) )
            // pol.g:744:4: 'do' stmtBlock 'while' '(' expr ')' delim
            {
            string_literal385=(Token)match(input,175,FOLLOW_175_in_stmtDoWhile4852); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_175.add(string_literal385);

            pushFollow(FOLLOW_stmtBlock_in_stmtDoWhile4854);
            stmtBlock386=stmtBlock();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_stmtBlock.add(stmtBlock386.getTree());
            string_literal387=(Token)match(input,176,FOLLOW_176_in_stmtDoWhile4856); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_176.add(string_literal387);

            char_literal388=(Token)match(input,153,FOLLOW_153_in_stmtDoWhile4858); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_153.add(char_literal388);

            pushFollow(FOLLOW_expr_in_stmtDoWhile4860);
            expr389=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr389.getTree());
            char_literal390=(Token)match(input,154,FOLLOW_154_in_stmtDoWhile4862); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_154.add(char_literal390);

            pushFollow(FOLLOW_delim_in_stmtDoWhile4864);
            delim391=delim();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_delim.add(delim391.getTree());


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
            // 744:47: -> ^( S_WHILE expr stmtBlock )
            {
                // pol.g:744:50: ^( S_WHILE expr stmtBlock )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(S_WHILE, "S_WHILE"), root_1);

                adaptor.addChild(root_1, stream_expr.nextTree());
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
            if ( state.backtracking>0 ) { memoize(input, 98, stmtDoWhile_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "stmtDoWhile"

    public static class stmtIf_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "stmtIf"
    // pol.g:746:1: stmtIf : 'if' stmtIfBlock stmtsElif ( stmtElse )? -> ^( S_IF stmtIfBlock stmtsElif ( stmtElse )? ) ;
    public final polParser.stmtIf_return stmtIf() throws RecognitionException {
        polParser.stmtIf_return retval = new polParser.stmtIf_return();
        retval.start = input.LT(1);
        int stmtIf_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal392=null;
        polParser.stmtIfBlock_return stmtIfBlock393 = null;

        polParser.stmtsElif_return stmtsElif394 = null;

        polParser.stmtElse_return stmtElse395 = null;


        Object string_literal392_tree=null;
        RewriteRuleTokenStream stream_177=new RewriteRuleTokenStream(adaptor,"token 177");
        RewriteRuleSubtreeStream stream_stmtsElif=new RewriteRuleSubtreeStream(adaptor,"rule stmtsElif");
        RewriteRuleSubtreeStream stream_stmtElse=new RewriteRuleSubtreeStream(adaptor,"rule stmtElse");
        RewriteRuleSubtreeStream stream_stmtIfBlock=new RewriteRuleSubtreeStream(adaptor,"rule stmtIfBlock");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 99) ) { return retval; }
            // pol.g:747:2: ( 'if' stmtIfBlock stmtsElif ( stmtElse )? -> ^( S_IF stmtIfBlock stmtsElif ( stmtElse )? ) )
            // pol.g:747:4: 'if' stmtIfBlock stmtsElif ( stmtElse )?
            {
            string_literal392=(Token)match(input,177,FOLLOW_177_in_stmtIf4885); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_177.add(string_literal392);

            pushFollow(FOLLOW_stmtIfBlock_in_stmtIf4887);
            stmtIfBlock393=stmtIfBlock();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_stmtIfBlock.add(stmtIfBlock393.getTree());
            pushFollow(FOLLOW_stmtsElif_in_stmtIf4889);
            stmtsElif394=stmtsElif();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_stmtsElif.add(stmtsElif394.getTree());
            // pol.g:747:31: ( stmtElse )?
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==179) ) {
                alt96=1;
            }
            switch (alt96) {
                case 1 :
                    // pol.g:0:0: stmtElse
                    {
                    pushFollow(FOLLOW_stmtElse_in_stmtIf4891);
                    stmtElse395=stmtElse();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_stmtElse.add(stmtElse395.getTree());

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
            // 747:41: -> ^( S_IF stmtIfBlock stmtsElif ( stmtElse )? )
            {
                // pol.g:747:44: ^( S_IF stmtIfBlock stmtsElif ( stmtElse )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(S_IF, "S_IF"), root_1);

                adaptor.addChild(root_1, stream_stmtIfBlock.nextTree());
                adaptor.addChild(root_1, stream_stmtsElif.nextTree());
                // pol.g:747:73: ( stmtElse )?
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
            if ( state.backtracking>0 ) { memoize(input, 99, stmtIf_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "stmtIf"

    public static class stmtIfBlock_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "stmtIfBlock"
    // pol.g:749:1: stmtIfBlock : '(' expr ')' stmtBlock -> expr stmtBlock ;
    public final polParser.stmtIfBlock_return stmtIfBlock() throws RecognitionException {
        polParser.stmtIfBlock_return retval = new polParser.stmtIfBlock_return();
        retval.start = input.LT(1);
        int stmtIfBlock_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal396=null;
        Token char_literal398=null;
        polParser.expr_return expr397 = null;

        polParser.stmtBlock_return stmtBlock399 = null;


        Object char_literal396_tree=null;
        Object char_literal398_tree=null;
        RewriteRuleTokenStream stream_153=new RewriteRuleTokenStream(adaptor,"token 153");
        RewriteRuleTokenStream stream_154=new RewriteRuleTokenStream(adaptor,"token 154");
        RewriteRuleSubtreeStream stream_stmtBlock=new RewriteRuleSubtreeStream(adaptor,"rule stmtBlock");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 100) ) { return retval; }
            // pol.g:750:2: ( '(' expr ')' stmtBlock -> expr stmtBlock )
            // pol.g:750:4: '(' expr ')' stmtBlock
            {
            char_literal396=(Token)match(input,153,FOLLOW_153_in_stmtIfBlock4915); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_153.add(char_literal396);

            pushFollow(FOLLOW_expr_in_stmtIfBlock4917);
            expr397=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr397.getTree());
            char_literal398=(Token)match(input,154,FOLLOW_154_in_stmtIfBlock4919); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_154.add(char_literal398);

            pushFollow(FOLLOW_stmtBlock_in_stmtIfBlock4921);
            stmtBlock399=stmtBlock();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_stmtBlock.add(stmtBlock399.getTree());


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
            // 750:27: -> expr stmtBlock
            {
                adaptor.addChild(root_0, stream_expr.nextTree());
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
            if ( state.backtracking>0 ) { memoize(input, 100, stmtIfBlock_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "stmtIfBlock"

    public static class stmtsElif_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "stmtsElif"
    // pol.g:752:1: stmtsElif : ( stmtElif )* -> ^( LIST ( stmtElif )* ) ;
    public final polParser.stmtsElif_return stmtsElif() throws RecognitionException {
        polParser.stmtsElif_return retval = new polParser.stmtsElif_return();
        retval.start = input.LT(1);
        int stmtsElif_StartIndex = input.index();
        Object root_0 = null;

        polParser.stmtElif_return stmtElif400 = null;


        RewriteRuleSubtreeStream stream_stmtElif=new RewriteRuleSubtreeStream(adaptor,"rule stmtElif");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 101) ) { return retval; }
            // pol.g:753:2: ( ( stmtElif )* -> ^( LIST ( stmtElif )* ) )
            // pol.g:753:4: ( stmtElif )*
            {
            // pol.g:753:4: ( stmtElif )*
            loop97:
            do {
                int alt97=2;
                int LA97_0 = input.LA(1);

                if ( (LA97_0==178) ) {
                    alt97=1;
                }


                switch (alt97) {
            	case 1 :
            	    // pol.g:0:0: stmtElif
            	    {
            	    pushFollow(FOLLOW_stmtElif_in_stmtsElif4937);
            	    stmtElif400=stmtElif();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_stmtElif.add(stmtElif400.getTree());

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

            root_0 = (Object)adaptor.nil();
            // 753:14: -> ^( LIST ( stmtElif )* )
            {
                // pol.g:753:17: ^( LIST ( stmtElif )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LIST, "LIST"), root_1);

                // pol.g:753:24: ( stmtElif )*
                while ( stream_stmtElif.hasNext() ) {
                    adaptor.addChild(root_1, stream_stmtElif.nextTree());

                }
                stream_stmtElif.reset();

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
            if ( state.backtracking>0 ) { memoize(input, 101, stmtsElif_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "stmtsElif"

    public static class stmtElif_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "stmtElif"
    // pol.g:755:1: stmtElif : 'elif' stmtIfBlock -> ^( S_ELIF stmtIfBlock ) ;
    public final polParser.stmtElif_return stmtElif() throws RecognitionException {
        polParser.stmtElif_return retval = new polParser.stmtElif_return();
        retval.start = input.LT(1);
        int stmtElif_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal401=null;
        polParser.stmtIfBlock_return stmtIfBlock402 = null;


        Object string_literal401_tree=null;
        RewriteRuleTokenStream stream_178=new RewriteRuleTokenStream(adaptor,"token 178");
        RewriteRuleSubtreeStream stream_stmtIfBlock=new RewriteRuleSubtreeStream(adaptor,"rule stmtIfBlock");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 102) ) { return retval; }
            // pol.g:756:2: ( 'elif' stmtIfBlock -> ^( S_ELIF stmtIfBlock ) )
            // pol.g:756:4: 'elif' stmtIfBlock
            {
            string_literal401=(Token)match(input,178,FOLLOW_178_in_stmtElif4957); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_178.add(string_literal401);

            pushFollow(FOLLOW_stmtIfBlock_in_stmtElif4959);
            stmtIfBlock402=stmtIfBlock();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_stmtIfBlock.add(stmtIfBlock402.getTree());


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
                // pol.g:756:26: ^( S_ELIF stmtIfBlock )
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
            if ( state.backtracking>0 ) { memoize(input, 102, stmtElif_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "stmtElif"

    public static class stmtElse_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "stmtElse"
    // pol.g:758:1: stmtElse : 'else' stmtBlock -> stmtBlock ;
    public final polParser.stmtElse_return stmtElse() throws RecognitionException {
        polParser.stmtElse_return retval = new polParser.stmtElse_return();
        retval.start = input.LT(1);
        int stmtElse_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal403=null;
        polParser.stmtBlock_return stmtBlock404 = null;


        Object string_literal403_tree=null;
        RewriteRuleTokenStream stream_179=new RewriteRuleTokenStream(adaptor,"token 179");
        RewriteRuleSubtreeStream stream_stmtBlock=new RewriteRuleSubtreeStream(adaptor,"rule stmtBlock");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 103) ) { return retval; }
            // pol.g:759:2: ( 'else' stmtBlock -> stmtBlock )
            // pol.g:759:4: 'else' stmtBlock
            {
            string_literal403=(Token)match(input,179,FOLLOW_179_in_stmtElse4977); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_179.add(string_literal403);

            pushFollow(FOLLOW_stmtBlock_in_stmtElse4979);
            stmtBlock404=stmtBlock();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_stmtBlock.add(stmtBlock404.getTree());


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
            // 759:21: -> stmtBlock
            {
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
            if ( state.backtracking>0 ) { memoize(input, 103, stmtElse_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "stmtElse"

    public static class stmtProvided_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "stmtProvided"
    // pol.g:761:1: stmtProvided : 'provided' '(' expr ')' stmtBlock ( stmtElse )? -> ^( S_PROVIDED expr stmtBlock ( stmtElse )? ) ;
    public final polParser.stmtProvided_return stmtProvided() throws RecognitionException {
        polParser.stmtProvided_return retval = new polParser.stmtProvided_return();
        retval.start = input.LT(1);
        int stmtProvided_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal405=null;
        Token char_literal406=null;
        Token char_literal408=null;
        polParser.expr_return expr407 = null;

        polParser.stmtBlock_return stmtBlock409 = null;

        polParser.stmtElse_return stmtElse410 = null;


        Object string_literal405_tree=null;
        Object char_literal406_tree=null;
        Object char_literal408_tree=null;
        RewriteRuleTokenStream stream_153=new RewriteRuleTokenStream(adaptor,"token 153");
        RewriteRuleTokenStream stream_180=new RewriteRuleTokenStream(adaptor,"token 180");
        RewriteRuleTokenStream stream_154=new RewriteRuleTokenStream(adaptor,"token 154");
        RewriteRuleSubtreeStream stream_stmtElse=new RewriteRuleSubtreeStream(adaptor,"rule stmtElse");
        RewriteRuleSubtreeStream stream_stmtBlock=new RewriteRuleSubtreeStream(adaptor,"rule stmtBlock");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 104) ) { return retval; }
            // pol.g:762:2: ( 'provided' '(' expr ')' stmtBlock ( stmtElse )? -> ^( S_PROVIDED expr stmtBlock ( stmtElse )? ) )
            // pol.g:762:4: 'provided' '(' expr ')' stmtBlock ( stmtElse )?
            {
            string_literal405=(Token)match(input,180,FOLLOW_180_in_stmtProvided4993); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_180.add(string_literal405);

            char_literal406=(Token)match(input,153,FOLLOW_153_in_stmtProvided4995); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_153.add(char_literal406);

            pushFollow(FOLLOW_expr_in_stmtProvided4997);
            expr407=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr407.getTree());
            char_literal408=(Token)match(input,154,FOLLOW_154_in_stmtProvided4999); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_154.add(char_literal408);

            pushFollow(FOLLOW_stmtBlock_in_stmtProvided5001);
            stmtBlock409=stmtBlock();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_stmtBlock.add(stmtBlock409.getTree());
            // pol.g:762:38: ( stmtElse )?
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==179) ) {
                alt98=1;
            }
            switch (alt98) {
                case 1 :
                    // pol.g:762:39: stmtElse
                    {
                    pushFollow(FOLLOW_stmtElse_in_stmtProvided5004);
                    stmtElse410=stmtElse();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_stmtElse.add(stmtElse410.getTree());

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
            // 763:3: -> ^( S_PROVIDED expr stmtBlock ( stmtElse )? )
            {
                // pol.g:763:6: ^( S_PROVIDED expr stmtBlock ( stmtElse )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(S_PROVIDED, "S_PROVIDED"), root_1);

                adaptor.addChild(root_1, stream_expr.nextTree());
                adaptor.addChild(root_1, stream_stmtBlock.nextTree());
                // pol.g:763:34: ( stmtElse )?
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
            if ( state.backtracking>0 ) { memoize(input, 104, stmtProvided_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "stmtProvided"

    public static class stmtWhile_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "stmtWhile"
    // pol.g:765:1: stmtWhile : 'while' '(' expr ')' stmtBlock -> ^( S_WHILE expr stmtBlock ) ;
    public final polParser.stmtWhile_return stmtWhile() throws RecognitionException {
        polParser.stmtWhile_return retval = new polParser.stmtWhile_return();
        retval.start = input.LT(1);
        int stmtWhile_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal411=null;
        Token char_literal412=null;
        Token char_literal414=null;
        polParser.expr_return expr413 = null;

        polParser.stmtBlock_return stmtBlock415 = null;


        Object string_literal411_tree=null;
        Object char_literal412_tree=null;
        Object char_literal414_tree=null;
        RewriteRuleTokenStream stream_153=new RewriteRuleTokenStream(adaptor,"token 153");
        RewriteRuleTokenStream stream_176=new RewriteRuleTokenStream(adaptor,"token 176");
        RewriteRuleTokenStream stream_154=new RewriteRuleTokenStream(adaptor,"token 154");
        RewriteRuleSubtreeStream stream_stmtBlock=new RewriteRuleSubtreeStream(adaptor,"rule stmtBlock");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 105) ) { return retval; }
            // pol.g:766:2: ( 'while' '(' expr ')' stmtBlock -> ^( S_WHILE expr stmtBlock ) )
            // pol.g:766:4: 'while' '(' expr ')' stmtBlock
            {
            string_literal411=(Token)match(input,176,FOLLOW_176_in_stmtWhile5031); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_176.add(string_literal411);

            char_literal412=(Token)match(input,153,FOLLOW_153_in_stmtWhile5033); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_153.add(char_literal412);

            pushFollow(FOLLOW_expr_in_stmtWhile5035);
            expr413=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr413.getTree());
            char_literal414=(Token)match(input,154,FOLLOW_154_in_stmtWhile5036); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_154.add(char_literal414);

            pushFollow(FOLLOW_stmtBlock_in_stmtWhile5038);
            stmtBlock415=stmtBlock();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_stmtBlock.add(stmtBlock415.getTree());


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
            // 766:34: -> ^( S_WHILE expr stmtBlock )
            {
                // pol.g:766:37: ^( S_WHILE expr stmtBlock )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(S_WHILE, "S_WHILE"), root_1);

                adaptor.addChild(root_1, stream_expr.nextTree());
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
            if ( state.backtracking>0 ) { memoize(input, 105, stmtWhile_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "stmtWhile"

    public static class varDeclaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "varDeclaration"
    // pol.g:768:1: varDeclaration : varAttr varDecl delim -> varDecl ;
    public final polParser.varDeclaration_return varDeclaration() throws RecognitionException {
        polParser.varDeclaration_return retval = new polParser.varDeclaration_return();
        retval.start = input.LT(1);
        int varDeclaration_StartIndex = input.index();
        Object root_0 = null;

        polParser.varAttr_return varAttr416 = null;

        polParser.varDecl_return varDecl417 = null;

        polParser.delim_return delim418 = null;


        RewriteRuleSubtreeStream stream_varAttr=new RewriteRuleSubtreeStream(adaptor,"rule varAttr");
        RewriteRuleSubtreeStream stream_varDecl=new RewriteRuleSubtreeStream(adaptor,"rule varDecl");
        RewriteRuleSubtreeStream stream_delim=new RewriteRuleSubtreeStream(adaptor,"rule delim");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 106) ) { return retval; }
            // pol.g:769:4: ( varAttr varDecl delim -> varDecl )
            // pol.g:769:7: varAttr varDecl delim
            {
            pushFollow(FOLLOW_varAttr_in_varDeclaration5065);
            varAttr416=varAttr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_varAttr.add(varAttr416.getTree());
            pushFollow(FOLLOW_varDecl_in_varDeclaration5067);
            varDecl417=varDecl();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_varDecl.add(varDecl417.getTree());
            pushFollow(FOLLOW_delim_in_varDeclaration5069);
            delim418=delim();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_delim.add(delim418.getTree());


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
            if ( state.backtracking>0 ) { memoize(input, 106, varDeclaration_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "varDeclaration"

    public static class varAttr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "varAttr"
    // pol.g:771:1: varAttr : ( 'const' | 'volatile' | 'host' )* ;
    public final polParser.varAttr_return varAttr() throws RecognitionException {
        polParser.varAttr_return retval = new polParser.varAttr_return();
        retval.start = input.LT(1);
        int varAttr_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal419=null;
        Token string_literal420=null;
        Token string_literal421=null;

        Object string_literal419_tree=null;
        Object string_literal420_tree=null;
        Object string_literal421_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 107) ) { return retval; }
            // pol.g:772:2: ( ( 'const' | 'volatile' | 'host' )* )
            // pol.g:772:4: ( 'const' | 'volatile' | 'host' )*
            {
            root_0 = (Object)adaptor.nil();

            // pol.g:772:4: ( 'const' | 'volatile' | 'host' )*
            loop99:
            do {
                int alt99=4;
                switch ( input.LA(1) ) {
                case 181:
                    {
                    alt99=1;
                    }
                    break;
                case 182:
                    {
                    alt99=2;
                    }
                    break;
                case 156:
                    {
                    alt99=3;
                    }
                    break;

                }

                switch (alt99) {
            	case 1 :
            	    // pol.g:772:7: 'const'
            	    {
            	    string_literal419=(Token)match(input,181,FOLLOW_181_in_varAttr5088); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal419_tree = (Object)adaptor.create(string_literal419);
            	    adaptor.addChild(root_0, string_literal419_tree);
            	    }
            	    if ( state.backtracking==0 ) {
            	       atFlags.add(AttrFlags.CONST); 
            	    }

            	    }
            	    break;
            	case 2 :
            	    // pol.g:773:6: 'volatile'
            	    {
            	    string_literal420=(Token)match(input,182,FOLLOW_182_in_varAttr5097); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal420_tree = (Object)adaptor.create(string_literal420);
            	    adaptor.addChild(root_0, string_literal420_tree);
            	    }
            	    if ( state.backtracking==0 ) {
            	       atFlags.add(AttrFlags.VOLATILE); 
            	    }

            	    }
            	    break;
            	case 3 :
            	    // pol.g:774:7: 'host'
            	    {
            	    string_literal421=(Token)match(input,156,FOLLOW_156_in_varAttr5107); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal421_tree = (Object)adaptor.create(string_literal421);
            	    adaptor.addChild(root_0, string_literal421_tree);
            	    }
            	    if ( state.backtracking==0 ) {
            	       atFlags.add(AttrFlags.HOST); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop99;
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
            if ( state.backtracking>0 ) { memoize(input, 107, varAttr_StartIndex); }
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
    // pol.g:777:1: varDecl : ( ( typeName IDENT ( ( ASSIGN | BIND ) expr )? ',' )=> varDeclList | ( typeName IDENT '[' )=> varArray | ( typeName '(' )=> varFcnRef | ( typeName varInit )=> varDeclList | 'new' typeName IDENT fcnArgumentList -> ^( D_VAR typeName ^( IDENT ^( E_EXPR ^( E_NEW typeName fcnArgumentList ) ) ) ) );
    public final polParser.varDecl_return varDecl() throws RecognitionException {
        varDecl_stack.push(new varDecl_scope());
        polParser.varDecl_return retval = new polParser.varDecl_return();
        retval.start = input.LT(1);
        int varDecl_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal426=null;
        Token IDENT428=null;
        polParser.varDeclList_return varDeclList422 = null;

        polParser.varArray_return varArray423 = null;

        polParser.varFcnRef_return varFcnRef424 = null;

        polParser.varDeclList_return varDeclList425 = null;

        polParser.typeName_return typeName427 = null;

        polParser.fcnArgumentList_return fcnArgumentList429 = null;


        Object string_literal426_tree=null;
        Object IDENT428_tree=null;
        RewriteRuleTokenStream stream_152=new RewriteRuleTokenStream(adaptor,"token 152");
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleSubtreeStream stream_typeName=new RewriteRuleSubtreeStream(adaptor,"rule typeName");
        RewriteRuleSubtreeStream stream_fcnArgumentList=new RewriteRuleSubtreeStream(adaptor,"rule fcnArgumentList");

        	((varDecl_scope)varDecl_stack.peek()).typ = null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 108) ) { return retval; }
            // pol.g:786:2: ( ( typeName IDENT ( ( ASSIGN | BIND ) expr )? ',' )=> varDeclList | ( typeName IDENT '[' )=> varArray | ( typeName '(' )=> varFcnRef | ( typeName varInit )=> varDeclList | 'new' typeName IDENT fcnArgumentList -> ^( D_VAR typeName ^( IDENT ^( E_EXPR ^( E_NEW typeName fcnArgumentList ) ) ) ) )
            int alt100=5;
            switch ( input.LA(1) ) {
            case 183:
            case 184:
            case 185:
            case 186:
            case 187:
            case 188:
            case 189:
            case 190:
            case 191:
                {
                int LA100_1 = input.LA(2);

                if ( (synpred178_pol()) ) {
                    alt100=1;
                }
                else if ( (synpred179_pol()) ) {
                    alt100=2;
                }
                else if ( (synpred180_pol()) ) {
                    alt100=3;
                }
                else if ( (synpred181_pol()) ) {
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

                if ( (synpred178_pol()) ) {
                    alt100=1;
                }
                else if ( (synpred179_pol()) ) {
                    alt100=2;
                }
                else if ( (synpred180_pol()) ) {
                    alt100=3;
                }
                else if ( (synpred181_pol()) ) {
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
            case 152:
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
                    // pol.g:786:4: ( typeName IDENT ( ( ASSIGN | BIND ) expr )? ',' )=> varDeclList
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_varDeclList_in_varDecl5157);
                    varDeclList422=varDeclList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDeclList422.getTree());

                    }
                    break;
                case 2 :
                    // pol.g:787:5: ( typeName IDENT '[' )=> varArray
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_varArray_in_varDecl5174);
                    varArray423=varArray();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varArray423.getTree());

                    }
                    break;
                case 3 :
                    // pol.g:788:5: ( typeName '(' )=> varFcnRef
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_varFcnRef_in_varDecl5190);
                    varFcnRef424=varFcnRef();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varFcnRef424.getTree());

                    }
                    break;
                case 4 :
                    // pol.g:789:6: ( typeName varInit )=> varDeclList
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_varDeclList_in_varDecl5206);
                    varDeclList425=varDeclList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDeclList425.getTree());

                    }
                    break;
                case 5 :
                    // pol.g:790:5: 'new' typeName IDENT fcnArgumentList
                    {
                    string_literal426=(Token)match(input,152,FOLLOW_152_in_varDecl5212); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_152.add(string_literal426);

                    pushFollow(FOLLOW_typeName_in_varDecl5214);
                    typeName427=typeName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeName.add(typeName427.getTree());
                    IDENT428=(Token)match(input,IDENT,FOLLOW_IDENT_in_varDecl5216); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENT.add(IDENT428);

                    pushFollow(FOLLOW_fcnArgumentList_in_varDecl5218);
                    fcnArgumentList429=fcnArgumentList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_fcnArgumentList.add(fcnArgumentList429.getTree());


                    // AST REWRITE
                    // elements: IDENT, typeName, typeName, fcnArgumentList
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
                        // pol.g:791:6: ^( D_VAR typeName ^( IDENT ^( E_EXPR ^( E_NEW typeName fcnArgumentList ) ) ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(D_VAR, "D_VAR"), root_1);

                        adaptor.addChild(root_1, stream_typeName.nextTree());
                        // pol.g:792:6: ^( IDENT ^( E_EXPR ^( E_NEW typeName fcnArgumentList ) ) )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_IDENT.nextNode(), root_2);

                        // pol.g:792:14: ^( E_EXPR ^( E_NEW typeName fcnArgumentList ) )
                        {
                        Object root_3 = (Object)adaptor.nil();
                        root_3 = (Object)adaptor.becomeRoot((Object)adaptor.create(E_EXPR, "E_EXPR"), root_3);

                        // pol.g:792:23: ^( E_NEW typeName fcnArgumentList )
                        {
                        Object root_4 = (Object)adaptor.nil();
                        root_4 = (Object)adaptor.becomeRoot((Object)adaptor.create(E_NEW, "E_NEW"), root_4);

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
            if ( state.backtracking>0 ) { memoize(input, 108, varDecl_StartIndex); }
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
    // pol.g:794:1: varFcnRef : typeName fcnRefTypeList IDENT -> ^( D_FCN_REF typeName fcnRefTypeList IDENT ) ;
    public final polParser.varFcnRef_return varFcnRef() throws RecognitionException {
        polParser.varFcnRef_return retval = new polParser.varFcnRef_return();
        retval.start = input.LT(1);
        int varFcnRef_StartIndex = input.index();
        Object root_0 = null;

        Token IDENT432=null;
        polParser.typeName_return typeName430 = null;

        polParser.fcnRefTypeList_return fcnRefTypeList431 = null;


        Object IDENT432_tree=null;
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleSubtreeStream stream_typeName=new RewriteRuleSubtreeStream(adaptor,"rule typeName");
        RewriteRuleSubtreeStream stream_fcnRefTypeList=new RewriteRuleSubtreeStream(adaptor,"rule fcnRefTypeList");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 109) ) { return retval; }
            // pol.g:795:2: ( typeName fcnRefTypeList IDENT -> ^( D_FCN_REF typeName fcnRefTypeList IDENT ) )
            // pol.g:795:4: typeName fcnRefTypeList IDENT
            {
            pushFollow(FOLLOW_typeName_in_varFcnRef5262);
            typeName430=typeName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeName.add(typeName430.getTree());
            pushFollow(FOLLOW_fcnRefTypeList_in_varFcnRef5264);
            fcnRefTypeList431=fcnRefTypeList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_fcnRefTypeList.add(fcnRefTypeList431.getTree());
            IDENT432=(Token)match(input,IDENT,FOLLOW_IDENT_in_varFcnRef5266); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENT.add(IDENT432);



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
                // pol.g:796:6: ^( D_FCN_REF typeName fcnRefTypeList IDENT )
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
            if ( state.backtracking>0 ) { memoize(input, 109, varFcnRef_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "varFcnRef"

    public static class fcnRefTypeList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "fcnRefTypeList"
    // pol.g:798:1: fcnRefTypeList : '(' fcnRefTypes ')' -> fcnRefTypes ;
    public final polParser.fcnRefTypeList_return fcnRefTypeList() throws RecognitionException {
        polParser.fcnRefTypeList_return retval = new polParser.fcnRefTypeList_return();
        retval.start = input.LT(1);
        int fcnRefTypeList_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal433=null;
        Token char_literal435=null;
        polParser.fcnRefTypes_return fcnRefTypes434 = null;


        Object char_literal433_tree=null;
        Object char_literal435_tree=null;
        RewriteRuleTokenStream stream_153=new RewriteRuleTokenStream(adaptor,"token 153");
        RewriteRuleTokenStream stream_154=new RewriteRuleTokenStream(adaptor,"token 154");
        RewriteRuleSubtreeStream stream_fcnRefTypes=new RewriteRuleSubtreeStream(adaptor,"rule fcnRefTypes");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 110) ) { return retval; }
            // pol.g:799:2: ( '(' fcnRefTypes ')' -> fcnRefTypes )
            // pol.g:799:4: '(' fcnRefTypes ')'
            {
            char_literal433=(Token)match(input,153,FOLLOW_153_in_fcnRefTypeList5291); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_153.add(char_literal433);

            pushFollow(FOLLOW_fcnRefTypes_in_fcnRefTypeList5293);
            fcnRefTypes434=fcnRefTypes();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_fcnRefTypes.add(fcnRefTypes434.getTree());
            char_literal435=(Token)match(input,154,FOLLOW_154_in_fcnRefTypeList5295); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_154.add(char_literal435);



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
            if ( state.backtracking>0 ) { memoize(input, 110, fcnRefTypeList_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "fcnRefTypeList"

    public static class fcnRefTypes_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "fcnRefTypes"
    // pol.g:801:1: fcnRefTypes : ( typeName ( ',' typeName )* -> ^( LIST ( typeName )+ ) | -> ^( LIST ) );
    public final polParser.fcnRefTypes_return fcnRefTypes() throws RecognitionException {
        polParser.fcnRefTypes_return retval = new polParser.fcnRefTypes_return();
        retval.start = input.LT(1);
        int fcnRefTypes_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal437=null;
        polParser.typeName_return typeName436 = null;

        polParser.typeName_return typeName438 = null;


        Object char_literal437_tree=null;
        RewriteRuleTokenStream stream_126=new RewriteRuleTokenStream(adaptor,"token 126");
        RewriteRuleSubtreeStream stream_typeName=new RewriteRuleSubtreeStream(adaptor,"rule typeName");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 111) ) { return retval; }
            // pol.g:802:2: ( typeName ( ',' typeName )* -> ^( LIST ( typeName )+ ) | -> ^( LIST ) )
            int alt102=2;
            int LA102_0 = input.LA(1);

            if ( (LA102_0==IDENT||(LA102_0>=183 && LA102_0<=191)) ) {
                alt102=1;
            }
            else if ( (LA102_0==154) ) {
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
                    // pol.g:802:4: typeName ( ',' typeName )*
                    {
                    pushFollow(FOLLOW_typeName_in_fcnRefTypes5309);
                    typeName436=typeName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeName.add(typeName436.getTree());
                    // pol.g:802:13: ( ',' typeName )*
                    loop101:
                    do {
                        int alt101=2;
                        int LA101_0 = input.LA(1);

                        if ( (LA101_0==126) ) {
                            alt101=1;
                        }


                        switch (alt101) {
                    	case 1 :
                    	    // pol.g:802:14: ',' typeName
                    	    {
                    	    char_literal437=(Token)match(input,126,FOLLOW_126_in_fcnRefTypes5312); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_126.add(char_literal437);

                    	    pushFollow(FOLLOW_typeName_in_fcnRefTypes5314);
                    	    typeName438=typeName();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_typeName.add(typeName438.getTree());

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

                    root_0 = (Object)adaptor.nil();
                    // 803:3: -> ^( LIST ( typeName )+ )
                    {
                        // pol.g:803:6: ^( LIST ( typeName )+ )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LIST, "LIST"), root_1);

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
                    break;
                case 2 :
                    // pol.g:804:4: 
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
                        // pol.g:804:7: ^( LIST )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LIST, "LIST"), root_1);

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
            if ( state.backtracking>0 ) { memoize(input, 111, fcnRefTypes_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "fcnRefTypes"

    public static class varArray_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "varArray"
    // pol.g:806:1: varArray : typeName IDENT varArraySpec ( '=' initializer )? -> ^( D_ARR typeName IDENT varArraySpec ( initializer )? ) ;
    public final polParser.varArray_return varArray() throws RecognitionException {
        polParser.varArray_return retval = new polParser.varArray_return();
        retval.start = input.LT(1);
        int varArray_StartIndex = input.index();
        Object root_0 = null;

        Token IDENT440=null;
        Token char_literal442=null;
        polParser.typeName_return typeName439 = null;

        polParser.varArraySpec_return varArraySpec441 = null;

        polParser.initializer_return initializer443 = null;


        Object IDENT440_tree=null;
        Object char_literal442_tree=null;
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
        RewriteRuleSubtreeStream stream_typeName=new RewriteRuleSubtreeStream(adaptor,"rule typeName");
        RewriteRuleSubtreeStream stream_varArraySpec=new RewriteRuleSubtreeStream(adaptor,"rule varArraySpec");
        RewriteRuleSubtreeStream stream_initializer=new RewriteRuleSubtreeStream(adaptor,"rule initializer");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 112) ) { return retval; }
            // pol.g:807:2: ( typeName IDENT varArraySpec ( '=' initializer )? -> ^( D_ARR typeName IDENT varArraySpec ( initializer )? ) )
            // pol.g:807:4: typeName IDENT varArraySpec ( '=' initializer )?
            {
            pushFollow(FOLLOW_typeName_in_varArray5347);
            typeName439=typeName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeName.add(typeName439.getTree());
            IDENT440=(Token)match(input,IDENT,FOLLOW_IDENT_in_varArray5349); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENT.add(IDENT440);

            pushFollow(FOLLOW_varArraySpec_in_varArray5351);
            varArraySpec441=varArraySpec();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_varArraySpec.add(varArraySpec441.getTree());
            // pol.g:807:32: ( '=' initializer )?
            int alt103=2;
            int LA103_0 = input.LA(1);

            if ( (LA103_0==ASSIGN) ) {
                alt103=1;
            }
            switch (alt103) {
                case 1 :
                    // pol.g:807:33: '=' initializer
                    {
                    char_literal442=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_varArray5354); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ASSIGN.add(char_literal442);

                    pushFollow(FOLLOW_initializer_in_varArray5356);
                    initializer443=initializer();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_initializer.add(initializer443.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: varArraySpec, initializer, IDENT, typeName
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
                // pol.g:808:6: ^( D_ARR typeName IDENT varArraySpec ( initializer )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(D_ARR, "D_ARR"), root_1);

                adaptor.addChild(root_1, stream_typeName.nextTree());
                adaptor.addChild(root_1, stream_IDENT.nextNode());
                adaptor.addChild(root_1, stream_varArraySpec.nextTree());
                // pol.g:808:42: ( initializer )?
                if ( stream_initializer.hasNext() ) {
                    adaptor.addChild(root_1, stream_initializer.nextTree());

                }
                stream_initializer.reset();

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
            if ( state.backtracking>0 ) { memoize(input, 112, varArray_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "varArray"

    public static class varArraySpec_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "varArraySpec"
    // pol.g:810:1: varArraySpec : ( '[' varDim ']' )+ -> ^( LIST ( varDim )+ ) ;
    public final polParser.varArraySpec_return varArraySpec() throws RecognitionException {
        polParser.varArraySpec_return retval = new polParser.varArraySpec_return();
        retval.start = input.LT(1);
        int varArraySpec_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal444=null;
        Token char_literal446=null;
        polParser.varDim_return varDim445 = null;


        Object char_literal444_tree=null;
        Object char_literal446_tree=null;
        RewriteRuleTokenStream stream_160=new RewriteRuleTokenStream(adaptor,"token 160");
        RewriteRuleTokenStream stream_159=new RewriteRuleTokenStream(adaptor,"token 159");
        RewriteRuleSubtreeStream stream_varDim=new RewriteRuleSubtreeStream(adaptor,"rule varDim");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 113) ) { return retval; }
            // pol.g:811:2: ( ( '[' varDim ']' )+ -> ^( LIST ( varDim )+ ) )
            // pol.g:811:4: ( '[' varDim ']' )+
            {
            // pol.g:811:4: ( '[' varDim ']' )+
            int cnt104=0;
            loop104:
            do {
                int alt104=2;
                int LA104_0 = input.LA(1);

                if ( (LA104_0==159) ) {
                    int LA104_2 = input.LA(2);

                    if ( (synpred185_pol()) ) {
                        alt104=1;
                    }


                }


                switch (alt104) {
            	case 1 :
            	    // pol.g:811:5: '[' varDim ']'
            	    {
            	    char_literal444=(Token)match(input,159,FOLLOW_159_in_varArraySpec5387); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_159.add(char_literal444);

            	    pushFollow(FOLLOW_varDim_in_varArraySpec5389);
            	    varDim445=varDim();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_varDim.add(varDim445.getTree());
            	    char_literal446=(Token)match(input,160,FOLLOW_160_in_varArraySpec5391); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_160.add(char_literal446);


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

            root_0 = (Object)adaptor.nil();
            // 811:22: -> ^( LIST ( varDim )+ )
            {
                // pol.g:811:27: ^( LIST ( varDim )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LIST, "LIST"), root_1);

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
            if ( state.backtracking>0 ) { memoize(input, 113, varArraySpec_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "varArraySpec"

    public static class varDim_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "varDim"
    // pol.g:813:1: varDim : ( expr | -> NIL );
    public final polParser.varDim_return varDim() throws RecognitionException {
        polParser.varDim_return retval = new polParser.varDim_return();
        retval.start = input.LT(1);
        int varDim_StartIndex = input.index();
        Object root_0 = null;

        polParser.expr_return expr447 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 114) ) { return retval; }
            // pol.g:814:2: ( expr | -> NIL )
            int alt105=2;
            int LA105_0 = input.LA(1);

            if ( (LA105_0==IDENT||(LA105_0>=INT_LIT && LA105_0<=CHAR)||(LA105_0>=INC && LA105_0<=DEC)||LA105_0==MINUS||(LA105_0>=LOG_NOT && LA105_0<=BIT_NOT)||(LA105_0>=OCT_LIT && LA105_0<=INJECT)||(LA105_0>=152 && LA105_0<=153)||LA105_0==157||LA105_0==159||(LA105_0>=192 && LA105_0<=194)) ) {
                alt105=1;
            }
            else if ( (LA105_0==160) ) {
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
                    // pol.g:814:5: expr
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_expr_in_varDim5415);
                    expr447=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr447.getTree());

                    }
                    break;
                case 2 :
                    // pol.g:815:4: 
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
            if ( state.backtracking>0 ) { memoize(input, 114, varDim_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "varDim"

    public static class initializer_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "initializer"
    // pol.g:817:1: initializer : ( expr | '{' initializer_list ( ',' )? '}' -> initializer_list );
    public final polParser.initializer_return initializer() throws RecognitionException {
        polParser.initializer_return retval = new polParser.initializer_return();
        retval.start = input.LT(1);
        int initializer_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal449=null;
        Token char_literal451=null;
        Token char_literal452=null;
        polParser.expr_return expr448 = null;

        polParser.initializer_list_return initializer_list450 = null;


        Object char_literal449_tree=null;
        Object char_literal451_tree=null;
        Object char_literal452_tree=null;
        RewriteRuleTokenStream stream_134=new RewriteRuleTokenStream(adaptor,"token 134");
        RewriteRuleTokenStream stream_126=new RewriteRuleTokenStream(adaptor,"token 126");
        RewriteRuleTokenStream stream_135=new RewriteRuleTokenStream(adaptor,"token 135");
        RewriteRuleSubtreeStream stream_initializer_list=new RewriteRuleSubtreeStream(adaptor,"rule initializer_list");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 115) ) { return retval; }
            // pol.g:818:2: ( expr | '{' initializer_list ( ',' )? '}' -> initializer_list )
            int alt107=2;
            int LA107_0 = input.LA(1);

            if ( (LA107_0==IDENT||(LA107_0>=INT_LIT && LA107_0<=CHAR)||(LA107_0>=INC && LA107_0<=DEC)||LA107_0==MINUS||(LA107_0>=LOG_NOT && LA107_0<=BIT_NOT)||(LA107_0>=OCT_LIT && LA107_0<=INJECT)||(LA107_0>=152 && LA107_0<=153)||LA107_0==157||LA107_0==159||(LA107_0>=192 && LA107_0<=194)) ) {
                alt107=1;
            }
            else if ( (LA107_0==134) ) {
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
                    // pol.g:818:4: expr
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_expr_in_initializer5435);
                    expr448=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr448.getTree());

                    }
                    break;
                case 2 :
                    // pol.g:819:4: '{' initializer_list ( ',' )? '}'
                    {
                    char_literal449=(Token)match(input,134,FOLLOW_134_in_initializer5441); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_134.add(char_literal449);

                    pushFollow(FOLLOW_initializer_list_in_initializer5443);
                    initializer_list450=initializer_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_initializer_list.add(initializer_list450.getTree());
                    // pol.g:819:25: ( ',' )?
                    int alt106=2;
                    int LA106_0 = input.LA(1);

                    if ( (LA106_0==126) ) {
                        alt106=1;
                    }
                    switch (alt106) {
                        case 1 :
                            // pol.g:0:0: ','
                            {
                            char_literal451=(Token)match(input,126,FOLLOW_126_in_initializer5445); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_126.add(char_literal451);


                            }
                            break;

                    }

                    char_literal452=(Token)match(input,135,FOLLOW_135_in_initializer5448); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_135.add(char_literal452);



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
            if ( state.backtracking>0 ) { memoize(input, 115, initializer_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "initializer"

    public static class initializer_list_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "initializer_list"
    // pol.g:821:1: initializer_list : initializer ( ',' initializer )* -> ^( LIST ( initializer )+ ) ;
    public final polParser.initializer_list_return initializer_list() throws RecognitionException {
        polParser.initializer_list_return retval = new polParser.initializer_list_return();
        retval.start = input.LT(1);
        int initializer_list_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal454=null;
        polParser.initializer_return initializer453 = null;

        polParser.initializer_return initializer455 = null;


        Object char_literal454_tree=null;
        RewriteRuleTokenStream stream_126=new RewriteRuleTokenStream(adaptor,"token 126");
        RewriteRuleSubtreeStream stream_initializer=new RewriteRuleSubtreeStream(adaptor,"rule initializer");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 116) ) { return retval; }
            // pol.g:822:2: ( initializer ( ',' initializer )* -> ^( LIST ( initializer )+ ) )
            // pol.g:822:4: initializer ( ',' initializer )*
            {
            pushFollow(FOLLOW_initializer_in_initializer_list5462);
            initializer453=initializer();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_initializer.add(initializer453.getTree());
            // pol.g:822:16: ( ',' initializer )*
            loop108:
            do {
                int alt108=2;
                int LA108_0 = input.LA(1);

                if ( (LA108_0==126) ) {
                    int LA108_1 = input.LA(2);

                    if ( (synpred189_pol()) ) {
                        alt108=1;
                    }


                }


                switch (alt108) {
            	case 1 :
            	    // pol.g:822:17: ',' initializer
            	    {
            	    char_literal454=(Token)match(input,126,FOLLOW_126_in_initializer_list5465); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_126.add(char_literal454);

            	    pushFollow(FOLLOW_initializer_in_initializer_list5467);
            	    initializer455=initializer();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_initializer.add(initializer455.getTree());

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

            root_0 = (Object)adaptor.nil();
            // 822:35: -> ^( LIST ( initializer )+ )
            {
                // pol.g:822:38: ^( LIST ( initializer )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LIST, "LIST"), root_1);

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
            if ( state.backtracking>0 ) { memoize(input, 116, initializer_list_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "initializer_list"

    public static class varDeclList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "varDeclList"
    // pol.g:825:1: varDeclList : ( typeName varDeclList | varInit ( ',' varInit )* );
    public final polParser.varDeclList_return varDeclList() throws RecognitionException {
        polParser.varDeclList_return retval = new polParser.varDeclList_return();
        retval.start = input.LT(1);
        int varDeclList_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal459=null;
        polParser.typeName_return typeName456 = null;

        polParser.varDeclList_return varDeclList457 = null;

        polParser.varInit_return varInit458 = null;

        polParser.varInit_return varInit460 = null;


        Object char_literal459_tree=null;


        	assert ((varDecl_scope)varDecl_stack.peek()).typ != null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 117) ) { return retval; }
            // pol.g:829:2: ( typeName varDeclList | varInit ( ',' varInit )* )
            int alt110=2;
            int LA110_0 = input.LA(1);

            if ( ((LA110_0>=183 && LA110_0<=191)) ) {
                alt110=1;
            }
            else if ( (LA110_0==IDENT) ) {
                int LA110_2 = input.LA(2);

                if ( (synpred190_pol()) ) {
                    alt110=1;
                }
                else if ( (true) ) {
                    alt110=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 110, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 110, 0, input);

                throw nvae;
            }
            switch (alt110) {
                case 1 :
                    // pol.g:829:4: typeName varDeclList
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_typeName_in_varDeclList5496);
                    typeName456=typeName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                      ((varDecl_scope)varDecl_stack.peek()).typ = (typeName456!=null?((Object)typeName456.tree):null); 
                    }
                    pushFollow(FOLLOW_varDeclList_in_varDeclList5501);
                    varDeclList457=varDeclList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDeclList457.getTree());

                    }
                    break;
                case 2 :
                    // pol.g:830:4: varInit ( ',' varInit )*
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_varInit_in_varDeclList5506);
                    varInit458=varInit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varInit458.getTree());
                    // pol.g:830:12: ( ',' varInit )*
                    loop109:
                    do {
                        int alt109=2;
                        int LA109_0 = input.LA(1);

                        if ( (LA109_0==126) ) {
                            int LA109_2 = input.LA(2);

                            if ( (synpred191_pol()) ) {
                                alt109=1;
                            }


                        }


                        switch (alt109) {
                    	case 1 :
                    	    // pol.g:830:13: ',' varInit
                    	    {
                    	    char_literal459=(Token)match(input,126,FOLLOW_126_in_varDeclList5509); if (state.failed) return retval;
                    	    pushFollow(FOLLOW_varInit_in_varDeclList5512);
                    	    varInit460=varInit();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, varInit460.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 117, varDeclList_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "varDeclList"

    public static class varInit_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "varInit"
    // pol.g:832:1: varInit : ( IDENT BIND expr -> ^( D_VAR ^( IDENT ( expr )? ) ) | IDENT ( ASSIGN expr )? -> ^( D_VAR ^( IDENT ( expr )? ) ) );
    public final polParser.varInit_return varInit() throws RecognitionException {
        polParser.varInit_return retval = new polParser.varInit_return();
        retval.start = input.LT(1);
        int varInit_StartIndex = input.index();
        Object root_0 = null;

        Token IDENT461=null;
        Token BIND462=null;
        Token IDENT464=null;
        Token ASSIGN465=null;
        polParser.expr_return expr463 = null;

        polParser.expr_return expr466 = null;


        Object IDENT461_tree=null;
        Object BIND462_tree=null;
        Object IDENT464_tree=null;
        Object ASSIGN465_tree=null;
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleTokenStream stream_BIND=new RewriteRuleTokenStream(adaptor,"token BIND");
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 118) ) { return retval; }
            // pol.g:834:2: ( IDENT BIND expr -> ^( D_VAR ^( IDENT ( expr )? ) ) | IDENT ( ASSIGN expr )? -> ^( D_VAR ^( IDENT ( expr )? ) ) )
            int alt112=2;
            int LA112_0 = input.LA(1);

            if ( (LA112_0==IDENT) ) {
                int LA112_1 = input.LA(2);

                if ( (synpred192_pol()) ) {
                    alt112=1;
                }
                else if ( (true) ) {
                    alt112=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 112, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 112, 0, input);

                throw nvae;
            }
            switch (alt112) {
                case 1 :
                    // pol.g:834:4: IDENT BIND expr
                    {
                    IDENT461=(Token)match(input,IDENT,FOLLOW_IDENT_in_varInit5530); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENT.add(IDENT461);

                    BIND462=(Token)match(input,BIND,FOLLOW_BIND_in_varInit5532); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_BIND.add(BIND462);

                    pushFollow(FOLLOW_expr_in_varInit5534);
                    expr463=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr463.getTree());
                    if ( state.backtracking==0 ) {
                       atFlags.add(AttrFlags.PROTOCOL_MEMBER); 
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
                        // pol.g:835:6: ^( D_VAR ^( IDENT ( expr )? ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(D_VAR, "D_VAR"), root_1);

                        adaptor.addChild(root_1, ((varDecl_scope)varDecl_stack.peek()).typ);
                        // pol.g:835:30: ^( IDENT ( expr )? )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_IDENT.nextNode(), root_2);

                        // pol.g:835:38: ( expr )?
                        if ( stream_expr.hasNext() ) {
                            adaptor.addChild(root_2, stream_expr.nextTree());

                        }
                        stream_expr.reset();

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // pol.g:836:4: IDENT ( ASSIGN expr )?
                    {
                    IDENT464=(Token)match(input,IDENT,FOLLOW_IDENT_in_varInit5559); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENT.add(IDENT464);

                    // pol.g:836:10: ( ASSIGN expr )?
                    int alt111=2;
                    int LA111_0 = input.LA(1);

                    if ( (LA111_0==ASSIGN) ) {
                        alt111=1;
                    }
                    switch (alt111) {
                        case 1 :
                            // pol.g:836:11: ASSIGN expr
                            {
                            ASSIGN465=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_varInit5562); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_ASSIGN.add(ASSIGN465);

                            pushFollow(FOLLOW_expr_in_varInit5564);
                            expr466=expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expr.add(expr466.getTree());

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
                    // 837:3: -> ^( D_VAR ^( IDENT ( expr )? ) )
                    {
                        // pol.g:837:6: ^( D_VAR ^( IDENT ( expr )? ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(D_VAR, "D_VAR"), root_1);

                        adaptor.addChild(root_1, ((varDecl_scope)varDecl_stack.peek()).typ);
                        // pol.g:837:30: ^( IDENT ( expr )? )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_IDENT.nextNode(), root_2);

                        // pol.g:837:38: ( expr )?
                        if ( stream_expr.hasNext() ) {
                            adaptor.addChild(root_2, stream_expr.nextTree());

                        }
                        stream_expr.reset();

                        adaptor.addChild(root_1, root_2);
                        }

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
            if ( state.backtracking>0 ) { memoize(input, 118, varInit_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "varInit"

    public static class builtinType_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "builtinType"
    // pol.g:839:1: builtinType : ( 'bool' | 'byte' | 'int8' | 'int16' | 'int32' | 'string' | 'uint8' | 'uint16' | 'uint32' );
    public final polParser.builtinType_return builtinType() throws RecognitionException {
        polParser.builtinType_return retval = new polParser.builtinType_return();
        retval.start = input.LT(1);
        int builtinType_StartIndex = input.index();
        Object root_0 = null;

        Token set467=null;

        Object set467_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 119) ) { return retval; }
            // pol.g:840:5: ( 'bool' | 'byte' | 'int8' | 'int16' | 'int32' | 'string' | 'uint8' | 'uint16' | 'uint32' )
            // pol.g:
            {
            root_0 = (Object)adaptor.nil();

            set467=(Token)input.LT(1);
            if ( (input.LA(1)>=183 && input.LA(1)<=191) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set467));
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
            if ( state.backtracking>0 ) { memoize(input, 119, builtinType_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "builtinType"

    public static class qualName_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "qualName"
    // pol.g:851:1: qualName : IDENT ( qualNameList )? -> ^( E_IDENT IDENT ( qualNameList )? ) ;
    public final polParser.qualName_return qualName() throws RecognitionException {
        polParser.qualName_return retval = new polParser.qualName_return();
        retval.start = input.LT(1);
        int qualName_StartIndex = input.index();
        Object root_0 = null;

        Token IDENT468=null;
        polParser.qualNameList_return qualNameList469 = null;


        Object IDENT468_tree=null;
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleSubtreeStream stream_qualNameList=new RewriteRuleSubtreeStream(adaptor,"rule qualNameList");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 120) ) { return retval; }
            // pol.g:852:5: ( IDENT ( qualNameList )? -> ^( E_IDENT IDENT ( qualNameList )? ) )
            // pol.g:852:9: IDENT ( qualNameList )?
            {
            IDENT468=(Token)match(input,IDENT,FOLLOW_IDENT_in_qualName5701); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENT.add(IDENT468);

            // pol.g:852:15: ( qualNameList )?
            int alt113=2;
            int LA113_0 = input.LA(1);

            if ( (LA113_0==158) ) {
                int LA113_2 = input.LA(2);

                if ( (synpred202_pol()) ) {
                    alt113=1;
                }
            }
            switch (alt113) {
                case 1 :
                    // pol.g:852:16: qualNameList
                    {
                    pushFollow(FOLLOW_qualNameList_in_qualName5704);
                    qualNameList469=qualNameList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_qualNameList.add(qualNameList469.getTree());

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

            root_0 = (Object)adaptor.nil();
            // 852:31: -> ^( E_IDENT IDENT ( qualNameList )? )
            {
                // pol.g:852:34: ^( E_IDENT IDENT ( qualNameList )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(E_IDENT, "E_IDENT"), root_1);

                adaptor.addChild(root_1, stream_IDENT.nextNode());
                // pol.g:852:51: ( qualNameList )?
                if ( stream_qualNameList.hasNext() ) {
                    adaptor.addChild(root_1, stream_qualNameList.nextTree());

                }
                stream_qualNameList.reset();

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
            if ( state.backtracking>0 ) { memoize(input, 120, qualName_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "qualName"

    public static class qualNameList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "qualNameList"
    // pol.g:854:1: qualNameList : ( '.' IDENT )+ -> ( ^( E_IDENT IDENT ) )+ ;
    public final polParser.qualNameList_return qualNameList() throws RecognitionException {
        polParser.qualNameList_return retval = new polParser.qualNameList_return();
        retval.start = input.LT(1);
        int qualNameList_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal470=null;
        Token IDENT471=null;

        Object char_literal470_tree=null;
        Object IDENT471_tree=null;
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleTokenStream stream_158=new RewriteRuleTokenStream(adaptor,"token 158");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 121) ) { return retval; }
            // pol.g:855:2: ( ( '.' IDENT )+ -> ( ^( E_IDENT IDENT ) )+ )
            // pol.g:856:2: ( '.' IDENT )+
            {
            // pol.g:856:2: ( '.' IDENT )+
            int cnt114=0;
            loop114:
            do {
                int alt114=2;
                int LA114_0 = input.LA(1);

                if ( (LA114_0==158) ) {
                    int LA114_1 = input.LA(2);

                    if ( (synpred203_pol()) ) {
                        alt114=1;
                    }


                }


                switch (alt114) {
            	case 1 :
            	    // pol.g:856:6: '.' IDENT
            	    {
            	    char_literal470=(Token)match(input,158,FOLLOW_158_in_qualNameList5736); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_158.add(char_literal470);

            	    IDENT471=(Token)match(input,IDENT,FOLLOW_IDENT_in_qualNameList5751); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_IDENT.add(IDENT471);


            	    }
            	    break;

            	default :
            	    if ( cnt114 >= 1 ) break loop114;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(114, input);
                        throw eee;
                }
                cnt114++;
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
            // 858:9: -> ( ^( E_IDENT IDENT ) )+
            {
                if ( !(stream_IDENT.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_IDENT.hasNext() ) {
                    // pol.g:858:12: ^( E_IDENT IDENT )
                    {
                    Object root_1 = (Object)adaptor.nil();
                    root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(E_IDENT, "E_IDENT"), root_1);

                    adaptor.addChild(root_1, stream_IDENT.nextNode());

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_IDENT.reset();

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
            if ( state.backtracking>0 ) { memoize(input, 121, qualNameList_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "qualNameList"

    public static class arrayLit_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "arrayLit"
    // pol.g:860:1: arrayLit : '[' arrayLitList ']' -> ^( LIST arrayLitList ) ;
    public final polParser.arrayLit_return arrayLit() throws RecognitionException {
        polParser.arrayLit_return retval = new polParser.arrayLit_return();
        retval.start = input.LT(1);
        int arrayLit_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal472=null;
        Token char_literal474=null;
        polParser.arrayLitList_return arrayLitList473 = null;


        Object char_literal472_tree=null;
        Object char_literal474_tree=null;
        RewriteRuleTokenStream stream_160=new RewriteRuleTokenStream(adaptor,"token 160");
        RewriteRuleTokenStream stream_159=new RewriteRuleTokenStream(adaptor,"token 159");
        RewriteRuleSubtreeStream stream_arrayLitList=new RewriteRuleSubtreeStream(adaptor,"rule arrayLitList");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 122) ) { return retval; }
            // pol.g:861:2: ( '[' arrayLitList ']' -> ^( LIST arrayLitList ) )
            // pol.g:861:4: '[' arrayLitList ']'
            {
            char_literal472=(Token)match(input,159,FOLLOW_159_in_arrayLit5780); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_159.add(char_literal472);

            pushFollow(FOLLOW_arrayLitList_in_arrayLit5782);
            arrayLitList473=arrayLitList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_arrayLitList.add(arrayLitList473.getTree());
            char_literal474=(Token)match(input,160,FOLLOW_160_in_arrayLit5784); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_160.add(char_literal474);



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
            // 861:25: -> ^( LIST arrayLitList )
            {
                // pol.g:861:28: ^( LIST arrayLitList )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LIST, "LIST"), root_1);

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
            if ( state.backtracking>0 ) { memoize(input, 122, arrayLit_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "arrayLit"

    public static class arrayLitList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "arrayLitList"
    // pol.g:863:1: arrayLitList : ( arrayLitElem ( ',' arrayLitElem )* -> ( arrayLitElem )+ | -> NIL );
    public final polParser.arrayLitList_return arrayLitList() throws RecognitionException {
        polParser.arrayLitList_return retval = new polParser.arrayLitList_return();
        retval.start = input.LT(1);
        int arrayLitList_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal476=null;
        polParser.arrayLitElem_return arrayLitElem475 = null;

        polParser.arrayLitElem_return arrayLitElem477 = null;


        Object char_literal476_tree=null;
        RewriteRuleTokenStream stream_126=new RewriteRuleTokenStream(adaptor,"token 126");
        RewriteRuleSubtreeStream stream_arrayLitElem=new RewriteRuleSubtreeStream(adaptor,"rule arrayLitElem");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 123) ) { return retval; }
            // pol.g:864:2: ( arrayLitElem ( ',' arrayLitElem )* -> ( arrayLitElem )+ | -> NIL )
            int alt116=2;
            int LA116_0 = input.LA(1);

            if ( (LA116_0==IDENT||(LA116_0>=INT_LIT && LA116_0<=CHAR)||(LA116_0>=OCT_LIT && LA116_0<=HEX_LIT)||(LA116_0>=192 && LA116_0<=194)) ) {
                alt116=1;
            }
            else if ( (LA116_0==160) ) {
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
                    // pol.g:864:4: arrayLitElem ( ',' arrayLitElem )*
                    {
                    pushFollow(FOLLOW_arrayLitElem_in_arrayLitList5802);
                    arrayLitElem475=arrayLitElem();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_arrayLitElem.add(arrayLitElem475.getTree());
                    // pol.g:864:17: ( ',' arrayLitElem )*
                    loop115:
                    do {
                        int alt115=2;
                        int LA115_0 = input.LA(1);

                        if ( (LA115_0==126) ) {
                            alt115=1;
                        }


                        switch (alt115) {
                    	case 1 :
                    	    // pol.g:864:18: ',' arrayLitElem
                    	    {
                    	    char_literal476=(Token)match(input,126,FOLLOW_126_in_arrayLitList5805); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_126.add(char_literal476);

                    	    pushFollow(FOLLOW_arrayLitElem_in_arrayLitList5807);
                    	    arrayLitElem477=arrayLitElem();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_arrayLitElem.add(arrayLitElem477.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop115;
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
                    // 864:37: -> ( arrayLitElem )+
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
                    // pol.g:865:4: 
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
                    // 865:4: -> NIL
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
            if ( state.backtracking>0 ) { memoize(input, 123, arrayLitList_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "arrayLitList"

    public static class arrayLitElem_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "arrayLitElem"
    // pol.g:867:1: arrayLitElem : ( primitiveLit | namedConstant );
    public final polParser.arrayLitElem_return arrayLitElem() throws RecognitionException {
        polParser.arrayLitElem_return retval = new polParser.arrayLitElem_return();
        retval.start = input.LT(1);
        int arrayLitElem_StartIndex = input.index();
        Object root_0 = null;

        polParser.primitiveLit_return primitiveLit478 = null;

        polParser.namedConstant_return namedConstant479 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 124) ) { return retval; }
            // pol.g:868:2: ( primitiveLit | namedConstant )
            int alt117=2;
            int LA117_0 = input.LA(1);

            if ( ((LA117_0>=INT_LIT && LA117_0<=CHAR)||(LA117_0>=OCT_LIT && LA117_0<=HEX_LIT)||(LA117_0>=192 && LA117_0<=194)) ) {
                alt117=1;
            }
            else if ( (LA117_0==IDENT) ) {
                alt117=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 117, 0, input);

                throw nvae;
            }
            switch (alt117) {
                case 1 :
                    // pol.g:868:4: primitiveLit
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_primitiveLit_in_arrayLitElem5831);
                    primitiveLit478=primitiveLit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveLit478.getTree());

                    }
                    break;
                case 2 :
                    // pol.g:868:19: namedConstant
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_namedConstant_in_arrayLitElem5835);
                    namedConstant479=namedConstant();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, namedConstant479.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 124, arrayLitElem_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "arrayLitElem"

    public static class namedConstant_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "namedConstant"
    // pol.g:870:1: namedConstant : qualName ;
    public final polParser.namedConstant_return namedConstant() throws RecognitionException {
        polParser.namedConstant_return retval = new polParser.namedConstant_return();
        retval.start = input.LT(1);
        int namedConstant_StartIndex = input.index();
        Object root_0 = null;

        polParser.qualName_return qualName480 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 125) ) { return retval; }
            // pol.g:871:2: ( qualName )
            // pol.g:871:4: qualName
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_qualName_in_namedConstant5845);
            qualName480=qualName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, qualName480.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 125, namedConstant_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "namedConstant"

    public static class boolLit_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "boolLit"
    // pol.g:873:1: boolLit : ( 'true' | 'false' ) ;
    public final polParser.boolLit_return boolLit() throws RecognitionException {
        polParser.boolLit_return retval = new polParser.boolLit_return();
        retval.start = input.LT(1);
        int boolLit_StartIndex = input.index();
        Object root_0 = null;

        Token set481=null;

        Object set481_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 126) ) { return retval; }
            // pol.g:874:9: ( ( 'true' | 'false' ) )
            // pol.g:874:11: ( 'true' | 'false' )
            {
            root_0 = (Object)adaptor.nil();

            set481=(Token)input.LT(1);
            if ( (input.LA(1)>=192 && input.LA(1)<=193) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set481));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

            if ( state.backtracking==0 ) {
               litFlags.add(LitFlags.BOOL);
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
            if ( state.backtracking>0 ) { memoize(input, 126, boolLit_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "boolLit"

    public static class nullLit_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "nullLit"
    // pol.g:876:1: nullLit : 'null' ;
    public final polParser.nullLit_return nullLit() throws RecognitionException {
        polParser.nullLit_return retval = new polParser.nullLit_return();
        retval.start = input.LT(1);
        int nullLit_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal482=null;

        Object string_literal482_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 127) ) { return retval; }
            // pol.g:877:9: ( 'null' )
            // pol.g:877:13: 'null'
            {
            root_0 = (Object)adaptor.nil();

            string_literal482=(Token)match(input,194,FOLLOW_194_in_nullLit5898); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal482_tree = (Object)adaptor.create(string_literal482);
            adaptor.addChild(root_0, string_literal482_tree);
            }
            if ( state.backtracking==0 ) {
              litFlags.add(LitFlags.NULL);
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
            if ( state.backtracking>0 ) { memoize(input, 127, nullLit_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "nullLit"

    public static class numLit_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "numLit"
    // pol.g:879:1: numLit : ( INT_LIT | OCT_LIT | REAL_LIT | HEX_LIT );
    public final polParser.numLit_return numLit() throws RecognitionException {
        polParser.numLit_return retval = new polParser.numLit_return();
        retval.start = input.LT(1);
        int numLit_StartIndex = input.index();
        Object root_0 = null;

        Token INT_LIT483=null;
        Token OCT_LIT484=null;
        Token REAL_LIT485=null;
        Token HEX_LIT486=null;

        Object INT_LIT483_tree=null;
        Object OCT_LIT484_tree=null;
        Object REAL_LIT485_tree=null;
        Object HEX_LIT486_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 128) ) { return retval; }
            // pol.g:883:9: ( INT_LIT | OCT_LIT | REAL_LIT | HEX_LIT )
            int alt118=4;
            switch ( input.LA(1) ) {
            case INT_LIT:
                {
                alt118=1;
                }
                break;
            case OCT_LIT:
                {
                alt118=2;
                }
                break;
            case REAL_LIT:
                {
                alt118=3;
                }
                break;
            case HEX_LIT:
                {
                alt118=4;
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
                    // pol.g:883:17: INT_LIT
                    {
                    root_0 = (Object)adaptor.nil();

                    INT_LIT483=(Token)match(input,INT_LIT,FOLLOW_INT_LIT_in_numLit5935); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INT_LIT483_tree = (Object)adaptor.create(INT_LIT483);
                    adaptor.addChild(root_0, INT_LIT483_tree);
                    }
                    if ( state.backtracking==0 ) {
                      litFlags.add(LitFlags.INT);
                    }

                    }
                    break;
                case 2 :
                    // pol.g:884:17: OCT_LIT
                    {
                    root_0 = (Object)adaptor.nil();

                    OCT_LIT484=(Token)match(input,OCT_LIT,FOLLOW_OCT_LIT_in_numLit5958); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    OCT_LIT484_tree = (Object)adaptor.create(OCT_LIT484);
                    adaptor.addChild(root_0, OCT_LIT484_tree);
                    }
                    if ( state.backtracking==0 ) {
                      litFlags.add(LitFlags.OCT);
                    }

                    }
                    break;
                case 3 :
                    // pol.g:885:17: REAL_LIT
                    {
                    root_0 = (Object)adaptor.nil();

                    REAL_LIT485=(Token)match(input,REAL_LIT,FOLLOW_REAL_LIT_in_numLit5981); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    REAL_LIT485_tree = (Object)adaptor.create(REAL_LIT485);
                    adaptor.addChild(root_0, REAL_LIT485_tree);
                    }
                    if ( state.backtracking==0 ) {
                      litFlags.add(LitFlags.REAL);
                    }

                    }
                    break;
                case 4 :
                    // pol.g:886:17: HEX_LIT
                    {
                    root_0 = (Object)adaptor.nil();

                    HEX_LIT486=(Token)match(input,HEX_LIT,FOLLOW_HEX_LIT_in_numLit6002); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    HEX_LIT486_tree = (Object)adaptor.create(HEX_LIT486);
                    adaptor.addChild(root_0, HEX_LIT486_tree);
                    }
                    if ( state.backtracking==0 ) {
                      litFlags.add(LitFlags.HEX);
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

                      litFlags.add(LitFlags.NUM);

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 128, numLit_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "numLit"

    public static class primitiveLit_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "primitiveLit"
    // pol.g:889:1: primitiveLit : ( boolLit -> ^( E_CONST boolLit ) | numLit -> ^( E_CONST numLit ) | nullLit -> ^( E_CONST nullLit ) | STRING -> ^( E_CONST STRING ) | CHAR -> ^( E_CONST CHAR ) );
    public final polParser.primitiveLit_return primitiveLit() throws RecognitionException {
        polParser.primitiveLit_return retval = new polParser.primitiveLit_return();
        retval.start = input.LT(1);
        int primitiveLit_StartIndex = input.index();
        Object root_0 = null;

        Token STRING490=null;
        Token CHAR491=null;
        polParser.boolLit_return boolLit487 = null;

        polParser.numLit_return numLit488 = null;

        polParser.nullLit_return nullLit489 = null;


        Object STRING490_tree=null;
        Object CHAR491_tree=null;
        RewriteRuleTokenStream stream_CHAR=new RewriteRuleTokenStream(adaptor,"token CHAR");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");
        RewriteRuleSubtreeStream stream_numLit=new RewriteRuleSubtreeStream(adaptor,"rule numLit");
        RewriteRuleSubtreeStream stream_nullLit=new RewriteRuleSubtreeStream(adaptor,"rule nullLit");
        RewriteRuleSubtreeStream stream_boolLit=new RewriteRuleSubtreeStream(adaptor,"rule boolLit");

                litFlags.clear();       

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 129) ) { return retval; }
            // pol.g:896:9: ( boolLit -> ^( E_CONST boolLit ) | numLit -> ^( E_CONST numLit ) | nullLit -> ^( E_CONST nullLit ) | STRING -> ^( E_CONST STRING ) | CHAR -> ^( E_CONST CHAR ) )
            int alt119=5;
            switch ( input.LA(1) ) {
            case 192:
            case 193:
                {
                alt119=1;
                }
                break;
            case INT_LIT:
            case OCT_LIT:
            case REAL_LIT:
            case HEX_LIT:
                {
                alt119=2;
                }
                break;
            case 194:
                {
                alt119=3;
                }
                break;
            case STRING:
                {
                alt119=4;
                }
                break;
            case CHAR:
                {
                alt119=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 119, 0, input);

                throw nvae;
            }

            switch (alt119) {
                case 1 :
                    // pol.g:896:17: boolLit
                    {
                    pushFollow(FOLLOW_boolLit_in_primitiveLit6048);
                    boolLit487=boolLit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_boolLit.add(boolLit487.getTree());


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
                    // 896:25: -> ^( E_CONST boolLit )
                    {
                        // pol.g:896:28: ^( E_CONST boolLit )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(E_CONST, "E_CONST"), root_1);

                        adaptor.addChild(root_1, stream_boolLit.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // pol.g:897:17: numLit
                    {
                    pushFollow(FOLLOW_numLit_in_primitiveLit6074);
                    numLit488=numLit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_numLit.add(numLit488.getTree());


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
                    // 897:25: -> ^( E_CONST numLit )
                    {
                        // pol.g:897:28: ^( E_CONST numLit )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(E_CONST, "E_CONST"), root_1);

                        adaptor.addChild(root_1, stream_numLit.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // pol.g:898:17: nullLit
                    {
                    pushFollow(FOLLOW_nullLit_in_primitiveLit6101);
                    nullLit489=nullLit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_nullLit.add(nullLit489.getTree());


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
                    // 898:25: -> ^( E_CONST nullLit )
                    {
                        // pol.g:898:28: ^( E_CONST nullLit )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(E_CONST, "E_CONST"), root_1);

                        adaptor.addChild(root_1, stream_nullLit.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // pol.g:899:17: STRING
                    {
                    STRING490=(Token)match(input,STRING,FOLLOW_STRING_in_primitiveLit6127); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_STRING.add(STRING490);

                    if ( state.backtracking==0 ) {
                      litFlags.add(LitFlags.STR);
                    }


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
                    // 900:12: -> ^( E_CONST STRING )
                    {
                        // pol.g:900:15: ^( E_CONST STRING )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(E_CONST, "E_CONST"), root_1);

                        adaptor.addChild(root_1, stream_STRING.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // pol.g:901:17: CHAR
                    {
                    CHAR491=(Token)match(input,CHAR,FOLLOW_CHAR_in_primitiveLit6169); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CHAR.add(CHAR491);

                    if ( state.backtracking==0 ) {
                      litFlags.add(LitFlags.CHR);
                    }


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
                    // 902:13: -> ^( E_CONST CHAR )
                    {
                        // pol.g:902:16: ^( E_CONST CHAR )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(E_CONST, "E_CONST"), root_1);

                        adaptor.addChild(root_1, stream_CHAR.nextNode());

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
            if ( state.backtracking>0 ) { memoize(input, 129, primitiveLit_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "primitiveLit"

    public static class stmtInjection_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "stmtInjection"
    // pol.g:904:1: stmtInjection : INJECT ( NL )* -> ^( E_INJECT INJECT ) ;
    public final polParser.stmtInjection_return stmtInjection() throws RecognitionException {
        polParser.stmtInjection_return retval = new polParser.stmtInjection_return();
        retval.start = input.LT(1);
        int stmtInjection_StartIndex = input.index();
        Object root_0 = null;

        Token INJECT492=null;
        Token NL493=null;

        Object INJECT492_tree=null;
        Object NL493_tree=null;
        RewriteRuleTokenStream stream_INJECT=new RewriteRuleTokenStream(adaptor,"token INJECT");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 130) ) { return retval; }
            // pol.g:905:2: ( INJECT ( NL )* -> ^( E_INJECT INJECT ) )
            // pol.g:905:4: INJECT ( NL )*
            {
            INJECT492=(Token)match(input,INJECT,FOLLOW_INJECT_in_stmtInjection6210); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_INJECT.add(INJECT492);

            // pol.g:905:11: ( NL )*
            loop120:
            do {
                int alt120=2;
                int LA120_0 = input.LA(1);

                if ( (LA120_0==NL) ) {
                    int LA120_2 = input.LA(2);

                    if ( (synpred215_pol()) ) {
                        alt120=1;
                    }


                }


                switch (alt120) {
            	case 1 :
            	    // pol.g:0:0: NL
            	    {
            	    NL493=(Token)match(input,NL,FOLLOW_NL_in_stmtInjection6212); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_NL.add(NL493);


            	    }
            	    break;

            	default :
            	    break loop120;
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
            // 905:15: -> ^( E_INJECT INJECT )
            {
                // pol.g:905:18: ^( E_INJECT INJECT )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(E_INJECT, "E_INJECT"), root_1);

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
            if ( state.backtracking>0 ) { memoize(input, 130, stmtInjection_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "stmtInjection"

    public static class injectionCode_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "injectionCode"
    // pol.g:907:1: injectionCode : INJECT -> ^( E_INJECT INJECT ) ;
    public final polParser.injectionCode_return injectionCode() throws RecognitionException {
        polParser.injectionCode_return retval = new polParser.injectionCode_return();
        retval.start = input.LT(1);
        int injectionCode_StartIndex = input.index();
        Object root_0 = null;

        Token INJECT494=null;

        Object INJECT494_tree=null;
        RewriteRuleTokenStream stream_INJECT=new RewriteRuleTokenStream(adaptor,"token INJECT");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 131) ) { return retval; }
            // pol.g:908:2: ( INJECT -> ^( E_INJECT INJECT ) )
            // pol.g:908:4: INJECT
            {
            INJECT494=(Token)match(input,INJECT,FOLLOW_INJECT_in_injectionCode6231); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_INJECT.add(INJECT494);



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
            // 908:11: -> ^( E_INJECT INJECT )
            {
                // pol.g:908:14: ^( E_INJECT INJECT )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(E_INJECT, "E_INJECT"), root_1);

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
            if ( state.backtracking>0 ) { memoize(input, 131, injectionCode_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "injectionCode"

    public static class delim_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "delim"
    // pol.g:910:1: delim : ( ( SEMI ) ( NL )* -> | ( NL )+ -> | ( ( NL )* '}' )=> ( NL )* ->);
    public final polParser.delim_return delim() throws RecognitionException {
        polParser.delim_return retval = new polParser.delim_return();
        retval.start = input.LT(1);
        int delim_StartIndex = input.index();
        Object root_0 = null;

        Token SEMI495=null;
        Token NL496=null;
        Token NL497=null;
        Token NL498=null;

        Object SEMI495_tree=null;
        Object NL496_tree=null;
        Object NL497_tree=null;
        Object NL498_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 132) ) { return retval; }
            // pol.g:911:2: ( ( SEMI ) ( NL )* -> | ( NL )+ -> | ( ( NL )* '}' )=> ( NL )* ->)
            int alt124=3;
            alt124 = dfa124.predict(input);
            switch (alt124) {
                case 1 :
                    // pol.g:911:4: ( SEMI ) ( NL )*
                    {
                    // pol.g:911:4: ( SEMI )
                    // pol.g:911:5: SEMI
                    {
                    SEMI495=(Token)match(input,SEMI,FOLLOW_SEMI_in_delim6251); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI495);


                    }

                    // pol.g:911:11: ( NL )*
                    loop121:
                    do {
                        int alt121=2;
                        int LA121_0 = input.LA(1);

                        if ( (LA121_0==NL) ) {
                            int LA121_2 = input.LA(2);

                            if ( (synpred216_pol()) ) {
                                alt121=1;
                            }


                        }


                        switch (alt121) {
                    	case 1 :
                    	    // pol.g:911:12: NL
                    	    {
                    	    NL496=(Token)match(input,NL,FOLLOW_NL_in_delim6255); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_NL.add(NL496);


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
                    // 911:17: ->
                    {
                        root_0 = null;
                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // pol.g:912:4: ( NL )+
                    {
                    // pol.g:912:4: ( NL )+
                    int cnt122=0;
                    loop122:
                    do {
                        int alt122=2;
                        int LA122_0 = input.LA(1);

                        if ( (LA122_0==NL) ) {
                            int LA122_1 = input.LA(2);

                            if ( (synpred218_pol()) ) {
                                alt122=1;
                            }


                        }


                        switch (alt122) {
                    	case 1 :
                    	    // pol.g:912:5: NL
                    	    {
                    	    NL497=(Token)match(input,NL,FOLLOW_NL_in_delim6266); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_NL.add(NL497);


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt122 >= 1 ) break loop122;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(122, input);
                                throw eee;
                        }
                        cnt122++;
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
                    // 912:10: ->
                    {
                        root_0 = null;
                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // pol.g:914:4: ( ( NL )* '}' )=> ( NL )*
                    {
                    // pol.g:914:20: ( NL )*
                    loop123:
                    do {
                        int alt123=2;
                        int LA123_0 = input.LA(1);

                        if ( (LA123_0==NL) ) {
                            int LA123_2 = input.LA(2);

                            if ( (synpred222_pol()) ) {
                                alt123=1;
                            }


                        }


                        switch (alt123) {
                    	case 1 :
                    	    // pol.g:0:0: NL
                    	    {
                    	    NL498=(Token)match(input,NL,FOLLOW_NL_in_delim6290); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_NL.add(NL498);


                    	    }
                    	    break;

                    	default :
                    	    break loop123;
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
                    // 914:24: ->
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
            if ( state.backtracking>0 ) { memoize(input, 132, delim_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "delim"

    // $ANTLR start synpred2_pol
    public final void synpred2_pol_fragment() throws RecognitionException {   
        // pol.g:190:8: ( stmtInjection )
        // pol.g:190:8: stmtInjection
        {
        pushFollow(FOLLOW_stmtInjection_in_synpred2_pol698);
        stmtInjection();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_pol

    // $ANTLR start synpred6_pol
    public final void synpred6_pol_fragment() throws RecognitionException {   
        // pol.g:203:9: ( stmtExport )
        // pol.g:203:9: stmtExport
        {
        pushFollow(FOLLOW_stmtExport_in_synpred6_pol799);
        stmtExport();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred6_pol

    // $ANTLR start synpred9_pol
    public final void synpred9_pol_fragment() throws RecognitionException {   
        // pol.g:228:9: ( fcnDefinition )
        // pol.g:228:9: fcnDefinition
        {
        pushFollow(FOLLOW_fcnDefinition_in_synpred9_pol898);
        fcnDefinition();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred9_pol

    // $ANTLR start synpred11_pol
    public final void synpred11_pol_fragment() throws RecognitionException {   
        // pol.g:230:9: ( varDeclaration )
        // pol.g:230:9: varDeclaration
        {
        pushFollow(FOLLOW_varDeclaration_in_synpred11_pol919);
        varDeclaration();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred11_pol

    // $ANTLR start synpred15_pol
    public final void synpred15_pol_fragment() throws RecognitionException {   
        // pol.g:242:6: ( fcnDefinition )
        // pol.g:242:6: fcnDefinition
        {
        pushFollow(FOLLOW_fcnDefinition_in_synpred15_pol1021);
        fcnDefinition();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred15_pol

    // $ANTLR start synpred16_pol
    public final void synpred16_pol_fragment() throws RecognitionException {   
        // pol.g:243:8: ( varDeclaration )
        // pol.g:243:8: varDeclaration
        {
        pushFollow(FOLLOW_varDeclaration_in_synpred16_pol1030);
        varDeclaration();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred16_pol

    // $ANTLR start synpred20_pol
    public final void synpred20_pol_fragment() throws RecognitionException {   
        // pol.g:273:26: ( delim )
        // pol.g:273:26: delim
        {
        pushFollow(FOLLOW_delim_in_synpred20_pol1162);
        delim();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred20_pol

    // $ANTLR start synpred21_pol
    public final void synpred21_pol_fragment() throws RecognitionException {   
        // pol.g:273:4: ( IDENT ASSIGN INT_LIT ( delim )? )
        // pol.g:273:4: IDENT ASSIGN INT_LIT ( delim )?
        {
        match(input,IDENT,FOLLOW_IDENT_in_synpred21_pol1155); if (state.failed) return ;
        match(input,ASSIGN,FOLLOW_ASSIGN_in_synpred21_pol1157); if (state.failed) return ;
        match(input,INT_LIT,FOLLOW_INT_LIT_in_synpred21_pol1159); if (state.failed) return ;
        // pol.g:273:25: ( delim )?
        int alt125=2;
        int LA125_0 = input.LA(1);

        if ( (LA125_0==NL||LA125_0==SEMI) ) {
            alt125=1;
        }
        else if ( (LA125_0==EOF) ) {
            int LA125_3 = input.LA(2);

            if ( (synpred20_pol()) ) {
                alt125=1;
            }
        }
        switch (alt125) {
            case 1 :
                // pol.g:273:26: delim
                {
                pushFollow(FOLLOW_delim_in_synpred21_pol1162);
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
        // pol.g:274:11: ( delim )
        // pol.g:274:11: delim
        {
        pushFollow(FOLLOW_delim_in_synpred22_pol1184);
        delim();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred22_pol

    // $ANTLR start synpred30_pol
    public final void synpred30_pol_fragment() throws RecognitionException {   
        // pol.g:301:7: ( fcnDefinitionHost )
        // pol.g:301:7: fcnDefinitionHost
        {
        pushFollow(FOLLOW_fcnDefinitionHost_in_synpred30_pol1358);
        fcnDefinitionHost();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred30_pol

    // $ANTLR start synpred32_pol
    public final void synpred32_pol_fragment() throws RecognitionException {   
        // pol.g:303:7: ( varDeclaration )
        // pol.g:303:7: varDeclaration
        {
        pushFollow(FOLLOW_varDeclaration_in_synpred32_pol1374);
        varDeclaration();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred32_pol

    // $ANTLR start synpred34_pol
    public final void synpred34_pol_fragment() throws RecognitionException {   
        // pol.g:309:10: ( importAs )
        // pol.g:309:10: importAs
        {
        pushFollow(FOLLOW_importAs_in_synpred34_pol1426);
        importAs();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred34_pol

    // $ANTLR start synpred43_pol
    public final void synpred43_pol_fragment() throws RecognitionException {   
        // pol.g:344:7: ( '{' metaArgument ( ',' metaArgument )* '}' )
        // pol.g:344:7: '{' metaArgument ( ',' metaArgument )* '}'
        {
        match(input,134,FOLLOW_134_in_synpred43_pol1687); if (state.failed) return ;
        pushFollow(FOLLOW_metaArgument_in_synpred43_pol1689);
        metaArgument();

        state._fsp--;
        if (state.failed) return ;
        // pol.g:344:25: ( ',' metaArgument )*
        loop127:
        do {
            int alt127=2;
            int LA127_0 = input.LA(1);

            if ( (LA127_0==126) ) {
                alt127=1;
            }


            switch (alt127) {
        	case 1 :
        	    // pol.g:344:26: ',' metaArgument
        	    {
        	    match(input,126,FOLLOW_126_in_synpred43_pol1693); if (state.failed) return ;
        	    pushFollow(FOLLOW_metaArgument_in_synpred43_pol1695);
        	    metaArgument();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop127;
            }
        } while (true);

        match(input,135,FOLLOW_135_in_synpred43_pol1699); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred43_pol

    // $ANTLR start synpred49_pol
    public final void synpred49_pol_fragment() throws RecognitionException {   
        // pol.g:366:4: ( qualName metaArguments )
        // pol.g:366:4: qualName metaArguments
        {
        pushFollow(FOLLOW_qualName_in_synpred49_pol1812);
        qualName();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_metaArguments_in_synpred49_pol1814);
        metaArguments();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred49_pol

    // $ANTLR start synpred51_pol
    public final void synpred51_pol_fragment() throws RecognitionException {   
        // pol.g:380:10: ( 'module' )
        // pol.g:380:11: 'module'
        {
        match(input,124,FOLLOW_124_in_synpred51_pol1879); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred51_pol

    // $ANTLR start synpred52_pol
    public final void synpred52_pol_fragment() throws RecognitionException {   
        // pol.g:381:8: ( 'class' )
        // pol.g:381:9: 'class'
        {
        match(input,123,FOLLOW_123_in_synpred52_pol1899); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred52_pol

    // $ANTLR start synpred53_pol
    public final void synpred53_pol_fragment() throws RecognitionException {   
        // pol.g:382:10: ( 'protocol' )
        // pol.g:382:11: 'protocol'
        {
        match(input,127,FOLLOW_127_in_synpred53_pol1917); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred53_pol

    // $ANTLR start synpred54_pol
    public final void synpred54_pol_fragment() throws RecognitionException {   
        // pol.g:383:10: ( 'composition' )
        // pol.g:383:11: 'composition'
        {
        match(input,128,FOLLOW_128_in_synpred54_pol1935); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred54_pol

    // $ANTLR start synpred55_pol
    public final void synpred55_pol_fragment() throws RecognitionException {   
        // pol.g:384:10: ( 'enum' )
        // pol.g:384:11: 'enum'
        {
        match(input,125,FOLLOW_125_in_synpred55_pol1953); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred55_pol

    // $ANTLR start synpred57_pol
    public final void synpred57_pol_fragment() throws RecognitionException {   
        // pol.g:396:23: ( NL )
        // pol.g:396:23: NL
        {
        match(input,NL,FOLLOW_NL_in_synpred57_pol2037); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred57_pol

    // $ANTLR start synpred61_pol
    public final void synpred61_pol_fragment() throws RecognitionException {   
        // pol.g:405:23: ( NL )
        // pol.g:405:23: NL
        {
        match(input,NL,FOLLOW_NL_in_synpred61_pol2104); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred61_pol

    // $ANTLR start synpred80_pol
    public final void synpred80_pol_fragment() throws RecognitionException {   
        // pol.g:435:10: ( ',' expr )
        // pol.g:435:10: ',' expr
        {
        match(input,126,FOLLOW_126_in_synpred80_pol2306); if (state.failed) return ;
        pushFollow(FOLLOW_expr_in_synpred80_pol2308);
        expr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred80_pol

    // $ANTLR start synpred81_pol
    public final void synpred81_pol_fragment() throws RecognitionException {   
        // pol.g:435:4: ( expr ( ',' expr )* )
        // pol.g:435:4: expr ( ',' expr )*
        {
        pushFollow(FOLLOW_expr_in_synpred81_pol2303);
        expr();

        state._fsp--;
        if (state.failed) return ;
        // pol.g:435:9: ( ',' expr )*
        loop128:
        do {
            int alt128=2;
            int LA128_0 = input.LA(1);

            if ( (LA128_0==126) ) {
                alt128=1;
            }


            switch (alt128) {
        	case 1 :
        	    // pol.g:435:10: ',' expr
        	    {
        	    match(input,126,FOLLOW_126_in_synpred81_pol2306); if (state.failed) return ;
        	    pushFollow(FOLLOW_expr_in_synpred81_pol2308);
        	    expr();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop128;
            }
        } while (true);


        }
    }
    // $ANTLR end synpred81_pol

    // $ANTLR start synpred82_pol
    public final void synpred82_pol_fragment() throws RecognitionException {   
        // pol.g:440:4: ( exprLogicalOr '?' expr ':' expr )
        // pol.g:440:4: exprLogicalOr '?' expr ':' expr
        {
        pushFollow(FOLLOW_exprLogicalOr_in_synpred82_pol2339);
        exprLogicalOr();

        state._fsp--;
        if (state.failed) return ;
        match(input,145,FOLLOW_145_in_synpred82_pol2341); if (state.failed) return ;
        pushFollow(FOLLOW_expr_in_synpred82_pol2343);
        expr();

        state._fsp--;
        if (state.failed) return ;
        match(input,146,FOLLOW_146_in_synpred82_pol2345); if (state.failed) return ;
        pushFollow(FOLLOW_expr_in_synpred82_pol2347);
        expr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred82_pol

    // $ANTLR start synpred83_pol
    public final void synpred83_pol_fragment() throws RecognitionException {   
        // pol.g:446:4: ( '||' exprLogicalAnd )
        // pol.g:446:4: '||' exprLogicalAnd
        {
        match(input,147,FOLLOW_147_in_synpred83_pol2396); if (state.failed) return ;
        pushFollow(FOLLOW_exprLogicalAnd_in_synpred83_pol2398);
        exprLogicalAnd();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred83_pol

    // $ANTLR start synpred84_pol
    public final void synpred84_pol_fragment() throws RecognitionException {   
        // pol.g:453:3: ( '&&' exprBitwiseOr )
        // pol.g:453:3: '&&' exprBitwiseOr
        {
        match(input,148,FOLLOW_148_in_synpred84_pol2443); if (state.failed) return ;
        pushFollow(FOLLOW_exprBitwiseOr_in_synpred84_pol2445);
        exprBitwiseOr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred84_pol

    // $ANTLR start synpred85_pol
    public final void synpred85_pol_fragment() throws RecognitionException {   
        // pol.g:460:3: ( '|' exprBitwiseXor )
        // pol.g:460:3: '|' exprBitwiseXor
        {
        match(input,149,FOLLOW_149_in_synpred85_pol2488); if (state.failed) return ;
        pushFollow(FOLLOW_exprBitwiseXor_in_synpred85_pol2490);
        exprBitwiseXor();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred85_pol

    // $ANTLR start synpred86_pol
    public final void synpred86_pol_fragment() throws RecognitionException {   
        // pol.g:467:3: ( '^' exprBitwiseAnd )
        // pol.g:467:3: '^' exprBitwiseAnd
        {
        match(input,150,FOLLOW_150_in_synpred86_pol2532); if (state.failed) return ;
        pushFollow(FOLLOW_exprBitwiseAnd_in_synpred86_pol2534);
        exprBitwiseAnd();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred86_pol

    // $ANTLR start synpred87_pol
    public final void synpred87_pol_fragment() throws RecognitionException {   
        // pol.g:474:3: ( '&' exprEquality )
        // pol.g:474:3: '&' exprEquality
        {
        match(input,151,FOLLOW_151_in_synpred87_pol2576); if (state.failed) return ;
        pushFollow(FOLLOW_exprEquality_in_synpred87_pol2578);
        exprEquality();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred87_pol

    // $ANTLR start synpred88_pol
    public final void synpred88_pol_fragment() throws RecognitionException {   
        // pol.g:481:3: ( equalityOp exprRelational )
        // pol.g:481:3: equalityOp exprRelational
        {
        pushFollow(FOLLOW_equalityOp_in_synpred88_pol2621);
        equalityOp();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_exprRelational_in_synpred88_pol2623);
        exprRelational();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred88_pol

    // $ANTLR start synpred89_pol
    public final void synpred89_pol_fragment() throws RecognitionException {   
        // pol.g:488:3: ( relationalOp exprShift )
        // pol.g:488:3: relationalOp exprShift
        {
        pushFollow(FOLLOW_relationalOp_in_synpred89_pol2666);
        relationalOp();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_exprShift_in_synpred89_pol2668);
        exprShift();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred89_pol

    // $ANTLR start synpred90_pol
    public final void synpred90_pol_fragment() throws RecognitionException {   
        // pol.g:495:3: ( shiftOp exprAddSub )
        // pol.g:495:3: shiftOp exprAddSub
        {
        pushFollow(FOLLOW_shiftOp_in_synpred90_pol2712);
        shiftOp();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_exprAddSub_in_synpred90_pol2715);
        exprAddSub();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred90_pol

    // $ANTLR start synpred91_pol
    public final void synpred91_pol_fragment() throws RecognitionException {   
        // pol.g:502:3: ( addSubOp exprMultDiv )
        // pol.g:502:3: addSubOp exprMultDiv
        {
        pushFollow(FOLLOW_addSubOp_in_synpred91_pol2758);
        addSubOp();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_exprMultDiv_in_synpred91_pol2760);
        exprMultDiv();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred91_pol

    // $ANTLR start synpred92_pol
    public final void synpred92_pol_fragment() throws RecognitionException {   
        // pol.g:509:3: ( multDivModOp exprUnary )
        // pol.g:509:3: multDivModOp exprUnary
        {
        pushFollow(FOLLOW_multDivModOp_in_synpred92_pol2805);
        multDivModOp();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_exprUnary_in_synpred92_pol2807);
        exprUnary();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred92_pol

    // $ANTLR start synpred100_pol
    public final void synpred100_pol_fragment() throws RecognitionException {   
        // pol.g:524:4: ( varOrFcnOrArray incDecOp )
        // pol.g:524:4: varOrFcnOrArray incDecOp
        {
        pushFollow(FOLLOW_varOrFcnOrArray_in_synpred100_pol2969);
        varOrFcnOrArray();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_incDecOp_in_synpred100_pol2971);
        incDecOp();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred100_pol

    // $ANTLR start synpred101_pol
    public final void synpred101_pol_fragment() throws RecognitionException {   
        // pol.g:525:4: ( varOrFcnOrArray )
        // pol.g:525:4: varOrFcnOrArray
        {
        pushFollow(FOLLOW_varOrFcnOrArray_in_synpred101_pol2986);
        varOrFcnOrArray();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred101_pol

    // $ANTLR start synpred111_pol
    public final void synpred111_pol_fragment() throws RecognitionException {   
        // pol.g:584:4: ( typeName qualName )
        // pol.g:584:4: typeName qualName
        {
        pushFollow(FOLLOW_typeName_in_synpred111_pol3267);
        typeName();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_qualName_in_synpred111_pol3269);
        qualName();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred111_pol

    // $ANTLR start synpred112_pol
    public final void synpred112_pol_fragment() throws RecognitionException {   
        polParser.typeName_return t = null;


        // pol.g:586:4: ({...}?t= typeName )
        // pol.g:586:4: {...}?t= typeName
        {
        if ( !((input.LT(1).getText().equals(ti.getTypeName()) )) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred112_pol", "input.LT(1).getText().equals(ti.getTypeName()) ");
        }
        pushFollow(FOLLOW_typeName_in_synpred112_pol3303);
        t=typeName();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred112_pol

    // $ANTLR start synpred113_pol
    public final void synpred113_pol_fragment() throws RecognitionException {   
        // pol.g:588:4: ( qualName )
        // pol.g:588:4: qualName
        {
        pushFollow(FOLLOW_qualName_in_synpred113_pol3336);
        qualName();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred113_pol

    // $ANTLR start synpred115_pol
    public final void synpred115_pol_fragment() throws RecognitionException {   
        // pol.g:590:4: ( '(' typeName ( ',' typeName )* ')' qualName )
        // pol.g:590:5: '(' typeName ( ',' typeName )* ')' qualName
        {
        match(input,153,FOLLOW_153_in_synpred115_pol3373); if (state.failed) return ;
        pushFollow(FOLLOW_typeName_in_synpred115_pol3375);
        typeName();

        state._fsp--;
        if (state.failed) return ;
        // pol.g:590:18: ( ',' typeName )*
        loop129:
        do {
            int alt129=2;
            int LA129_0 = input.LA(1);

            if ( (LA129_0==126) ) {
                alt129=1;
            }


            switch (alt129) {
        	case 1 :
        	    // pol.g:590:19: ',' typeName
        	    {
        	    match(input,126,FOLLOW_126_in_synpred115_pol3378); if (state.failed) return ;
        	    pushFollow(FOLLOW_typeName_in_synpred115_pol3380);
        	    typeName();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop129;
            }
        } while (true);

        match(input,154,FOLLOW_154_in_synpred115_pol3384); if (state.failed) return ;
        pushFollow(FOLLOW_qualName_in_synpred115_pol3386);
        qualName();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred115_pol

    // $ANTLR start synpred120_pol
    public final void synpred120_pol_fragment() throws RecognitionException {   
        // pol.g:617:41: ( fieldOrArrayAccess )
        // pol.g:617:41: fieldOrArrayAccess
        {
        pushFollow(FOLLOW_fieldOrArrayAccess_in_synpred120_pol3592);
        fieldOrArrayAccess();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred120_pol

    // $ANTLR start synpred122_pol
    public final void synpred122_pol_fragment() throws RecognitionException {   
        // pol.g:619:36: ( fieldOrArrayAccess )
        // pol.g:619:36: fieldOrArrayAccess
        {
        pushFollow(FOLLOW_fieldOrArrayAccess_in_synpred122_pol3639);
        fieldOrArrayAccess();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred122_pol

    // $ANTLR start synpred123_pol
    public final void synpred123_pol_fragment() throws RecognitionException {   
        // pol.g:619:10: ( '@' IDENT fcnArgumentList ( fieldOrArrayAccess )? )
        // pol.g:619:10: '@' IDENT fcnArgumentList ( fieldOrArrayAccess )?
        {
        match(input,157,FOLLOW_157_in_synpred123_pol3633); if (state.failed) return ;
        match(input,IDENT,FOLLOW_IDENT_in_synpred123_pol3635); if (state.failed) return ;
        pushFollow(FOLLOW_fcnArgumentList_in_synpred123_pol3637);
        fcnArgumentList();

        state._fsp--;
        if (state.failed) return ;
        // pol.g:619:36: ( fieldOrArrayAccess )?
        int alt132=2;
        int LA132_0 = input.LA(1);

        if ( ((LA132_0>=158 && LA132_0<=159)) ) {
            alt132=1;
        }
        switch (alt132) {
            case 1 :
                // pol.g:0:0: fieldOrArrayAccess
                {
                pushFollow(FOLLOW_fieldOrArrayAccess_in_synpred123_pol3639);
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
        // pol.g:622:24: ( fieldOrArrayAccess )
        // pol.g:622:24: fieldOrArrayAccess
        {
        pushFollow(FOLLOW_fieldOrArrayAccess_in_synpred124_pol3716);
        fieldOrArrayAccess();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred124_pol

    // $ANTLR start synpred125_pol
    public final void synpred125_pol_fragment() throws RecognitionException {   
        // pol.g:622:10: ( '@' IDENT ( fieldOrArrayAccess )? )
        // pol.g:622:10: '@' IDENT ( fieldOrArrayAccess )?
        {
        match(input,157,FOLLOW_157_in_synpred125_pol3708); if (state.failed) return ;
        match(input,IDENT,FOLLOW_IDENT_in_synpred125_pol3714); if (state.failed) return ;
        // pol.g:622:24: ( fieldOrArrayAccess )?
        int alt133=2;
        int LA133_0 = input.LA(1);

        if ( ((LA133_0>=158 && LA133_0<=159)) ) {
            alt133=1;
        }
        switch (alt133) {
            case 1 :
                // pol.g:0:0: fieldOrArrayAccess
                {
                pushFollow(FOLLOW_fieldOrArrayAccess_in_synpred125_pol3716);
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
        // pol.g:624:10: ( '@' )
        // pol.g:624:10: '@'
        {
        match(input,157,FOLLOW_157_in_synpred126_pol3764); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred126_pol

    // $ANTLR start synpred127_pol
    public final void synpred127_pol_fragment() throws RecognitionException {   
        // pol.g:626:35: ( fieldOrArrayAccess )
        // pol.g:626:35: fieldOrArrayAccess
        {
        pushFollow(FOLLOW_fieldOrArrayAccess_in_synpred127_pol3801);
        fieldOrArrayAccess();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred127_pol

    // $ANTLR start synpred128_pol
    public final void synpred128_pol_fragment() throws RecognitionException {   
        // pol.g:626:10: ( qualName fcnArgumentList ( fieldOrArrayAccess )? )
        // pol.g:626:10: qualName fcnArgumentList ( fieldOrArrayAccess )?
        {
        pushFollow(FOLLOW_qualName_in_synpred128_pol3797);
        qualName();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_fcnArgumentList_in_synpred128_pol3799);
        fcnArgumentList();

        state._fsp--;
        if (state.failed) return ;
        // pol.g:626:35: ( fieldOrArrayAccess )?
        int alt134=2;
        int LA134_0 = input.LA(1);

        if ( ((LA134_0>=158 && LA134_0<=159)) ) {
            alt134=1;
        }
        switch (alt134) {
            case 1 :
                // pol.g:0:0: fieldOrArrayAccess
                {
                pushFollow(FOLLOW_fieldOrArrayAccess_in_synpred128_pol3801);
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
        // pol.g:628:19: ( fieldOrArrayAccess )
        // pol.g:628:19: fieldOrArrayAccess
        {
        pushFollow(FOLLOW_fieldOrArrayAccess_in_synpred129_pol3844);
        fieldOrArrayAccess();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred129_pol

    // $ANTLR start synpred131_pol
    public final void synpred131_pol_fragment() throws RecognitionException {   
        // pol.g:632:20: ( arrayAccess )
        // pol.g:632:20: arrayAccess
        {
        pushFollow(FOLLOW_arrayAccess_in_synpred131_pol3862);
        arrayAccess();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred131_pol

    // $ANTLR start synpred132_pol
    public final void synpred132_pol_fragment() throws RecognitionException {   
        // pol.g:637:12: ( '.' IDENT fcnArgumentList )
        // pol.g:637:12: '.' IDENT fcnArgumentList
        {
        match(input,158,FOLLOW_158_in_synpred132_pol3884); if (state.failed) return ;
        match(input,IDENT,FOLLOW_IDENT_in_synpred132_pol3890); if (state.failed) return ;
        pushFollow(FOLLOW_fcnArgumentList_in_synpred132_pol3892);
        fcnArgumentList();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred132_pol

    // $ANTLR start synpred133_pol
    public final void synpred133_pol_fragment() throws RecognitionException {   
        // pol.g:641:9: ( exprList )
        // pol.g:641:9: exprList
        {
        pushFollow(FOLLOW_exprList_in_synpred133_pol3948);
        exprList();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred133_pol

    // $ANTLR start synpred134_pol
    public final void synpred134_pol_fragment() throws RecognitionException {   
        // pol.g:648:5: ( stmt )
        // pol.g:648:5: stmt
        {
        pushFollow(FOLLOW_stmt_in_synpred134_pol3997);
        stmt();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred134_pol

    // $ANTLR start synpred135_pol
    public final void synpred135_pol_fragment() throws RecognitionException {   
        // pol.g:648:4: ( ( stmt )+ )
        // pol.g:648:4: ( stmt )+
        {
        // pol.g:648:4: ( stmt )+
        int cnt135=0;
        loop135:
        do {
            int alt135=2;
            int LA135_0 = input.LA(1);

            if ( ((LA135_0>=NL && LA135_0<=IDENT)||(LA135_0>=INT_LIT && LA135_0<=CHAR)||(LA135_0>=INC && LA135_0<=DEC)||LA135_0==MINUS||(LA135_0>=LOG_NOT && LA135_0<=BIT_NOT)||(LA135_0>=OCT_LIT && LA135_0<=INJECT)||LA135_0==134||(LA135_0>=152 && LA135_0<=153)||(LA135_0>=156 && LA135_0<=157)||LA135_0==159||(LA135_0>=161 && LA135_0<=162)||(LA135_0>=166 && LA135_0<=170)||LA135_0==172||(LA135_0>=175 && LA135_0<=177)||(LA135_0>=180 && LA135_0<=194)) ) {
                alt135=1;
            }


            switch (alt135) {
        	case 1 :
        	    // pol.g:648:5: stmt
        	    {
        	    pushFollow(FOLLOW_stmt_in_synpred135_pol3997);
        	    stmt();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    if ( cnt135 >= 1 ) break loop135;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(135, input);
                    throw eee;
            }
            cnt135++;
        } while (true);


        }
    }
    // $ANTLR end synpred135_pol

    // $ANTLR start synpred136_pol
    public final void synpred136_pol_fragment() throws RecognitionException {   
        // pol.g:649:5: ( NL )
        // pol.g:649:5: NL
        {
        match(input,NL,FOLLOW_NL_in_synpred136_pol4015); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred136_pol

    // $ANTLR start synpred137_pol
    public final void synpred137_pol_fragment() throws RecognitionException {   
        // pol.g:652:5: ( varDeclaration )
        // pol.g:652:5: varDeclaration
        {
        pushFollow(FOLLOW_varDeclaration_in_synpred137_pol4032);
        varDeclaration();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred137_pol

    // $ANTLR start synpred138_pol
    public final void synpred138_pol_fragment() throws RecognitionException {   
        // pol.g:653:4: ( stmtAssign )
        // pol.g:653:4: stmtAssign
        {
        pushFollow(FOLLOW_stmtAssign_in_synpred138_pol4038);
        stmtAssign();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred138_pol

    // $ANTLR start synpred140_pol
    public final void synpred140_pol_fragment() throws RecognitionException {   
        // pol.g:655:4: ( stmtBind )
        // pol.g:655:4: stmtBind
        {
        pushFollow(FOLLOW_stmtBind_in_synpred140_pol4048);
        stmtBind();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred140_pol

    // $ANTLR start synpred153_pol
    public final void synpred153_pol_fragment() throws RecognitionException {   
        // pol.g:668:4: ( stmtInjection )
        // pol.g:668:4: stmtInjection
        {
        pushFollow(FOLLOW_stmtInjection_in_synpred153_pol4119);
        stmtInjection();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred153_pol

    // $ANTLR start synpred154_pol
    public final void synpred154_pol_fragment() throws RecognitionException {   
        // pol.g:672:4: ( varOrFcnOrArray ASSIGN expr delim )
        // pol.g:672:4: varOrFcnOrArray ASSIGN expr delim
        {
        pushFollow(FOLLOW_varOrFcnOrArray_in_synpred154_pol4136);
        varOrFcnOrArray();

        state._fsp--;
        if (state.failed) return ;
        match(input,ASSIGN,FOLLOW_ASSIGN_in_synpred154_pol4138); if (state.failed) return ;
        pushFollow(FOLLOW_expr_in_synpred154_pol4140);
        expr();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_delim_in_synpred154_pol4142);
        delim();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred154_pol

    // $ANTLR start synpred155_pol
    public final void synpred155_pol_fragment() throws RecognitionException {   
        // pol.g:674:4: ( injectionCode ASSIGN expr delim )
        // pol.g:674:4: injectionCode ASSIGN expr delim
        {
        pushFollow(FOLLOW_injectionCode_in_synpred155_pol4165);
        injectionCode();

        state._fsp--;
        if (state.failed) return ;
        match(input,ASSIGN,FOLLOW_ASSIGN_in_synpred155_pol4167); if (state.failed) return ;
        pushFollow(FOLLOW_expr_in_synpred155_pol4169);
        expr();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_delim_in_synpred155_pol4171);
        delim();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred155_pol

    // $ANTLR start synpred156_pol
    public final void synpred156_pol_fragment() throws RecognitionException {   
        // pol.g:676:4: ( varOrFcnOrArray assignOp expr delim )
        // pol.g:676:4: varOrFcnOrArray assignOp expr delim
        {
        pushFollow(FOLLOW_varOrFcnOrArray_in_synpred156_pol4194);
        varOrFcnOrArray();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_assignOp_in_synpred156_pol4196);
        assignOp();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_expr_in_synpred156_pol4198);
        expr();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_delim_in_synpred156_pol4201);
        delim();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred156_pol

    // $ANTLR start synpred161_pol
    public final void synpred161_pol_fragment() throws RecognitionException {   
        // pol.g:697:4: ( 'return' ( '(' ) ( expr ( ',' expr )+ ) ( ')' ) delim )
        // pol.g:697:4: 'return' ( '(' ) ( expr ( ',' expr )+ ) ( ')' ) delim
        {
        match(input,166,FOLLOW_166_in_synpred161_pol4363); if (state.failed) return ;
        // pol.g:697:13: ( '(' )
        // pol.g:697:14: '('
        {
        match(input,153,FOLLOW_153_in_synpred161_pol4366); if (state.failed) return ;

        }

        // pol.g:697:19: ( expr ( ',' expr )+ )
        // pol.g:697:20: expr ( ',' expr )+
        {
        pushFollow(FOLLOW_expr_in_synpred161_pol4370);
        expr();

        state._fsp--;
        if (state.failed) return ;
        // pol.g:697:25: ( ',' expr )+
        int cnt136=0;
        loop136:
        do {
            int alt136=2;
            int LA136_0 = input.LA(1);

            if ( (LA136_0==126) ) {
                alt136=1;
            }


            switch (alt136) {
        	case 1 :
        	    // pol.g:697:26: ',' expr
        	    {
        	    match(input,126,FOLLOW_126_in_synpred161_pol4373); if (state.failed) return ;
        	    pushFollow(FOLLOW_expr_in_synpred161_pol4375);
        	    expr();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    if ( cnt136 >= 1 ) break loop136;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(136, input);
                    throw eee;
            }
            cnt136++;
        } while (true);


        }

        // pol.g:697:38: ( ')' )
        // pol.g:697:39: ')'
        {
        match(input,154,FOLLOW_154_in_synpred161_pol4381); if (state.failed) return ;

        }

        pushFollow(FOLLOW_delim_in_synpred161_pol4384);
        delim();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred161_pol

    // $ANTLR start synpred164_pol
    public final void synpred164_pol_fragment() throws RecognitionException {   
        // pol.g:719:9: ( typeName IDENT '=' expr SEMI )
        // pol.g:719:9: typeName IDENT '=' expr SEMI
        {
        pushFollow(FOLLOW_typeName_in_synpred164_pol4597);
        typeName();

        state._fsp--;
        if (state.failed) return ;
        match(input,IDENT,FOLLOW_IDENT_in_synpred164_pol4599); if (state.failed) return ;
        match(input,ASSIGN,FOLLOW_ASSIGN_in_synpred164_pol4601); if (state.failed) return ;
        pushFollow(FOLLOW_expr_in_synpred164_pol4603);
        expr();

        state._fsp--;
        if (state.failed) return ;
        match(input,SEMI,FOLLOW_SEMI_in_synpred164_pol4605); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred164_pol

    // $ANTLR start synpred168_pol
    public final void synpred168_pol_fragment() throws RecognitionException {   
        // pol.g:738:18: ( NL )
        // pol.g:738:18: NL
        {
        match(input,NL,FOLLOW_NL_in_synpred168_pol4800); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred168_pol

    // $ANTLR start synpred169_pol
    public final void synpred169_pol_fragment() throws RecognitionException {   
        // pol.g:741:25: ( NL )
        // pol.g:741:25: NL
        {
        match(input,NL,FOLLOW_NL_in_synpred169_pol4829); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred169_pol

    // $ANTLR start synpred178_pol
    public final void synpred178_pol_fragment() throws RecognitionException {   
        // pol.g:786:4: ( typeName IDENT ( ( ASSIGN | BIND ) expr )? ',' )
        // pol.g:786:5: typeName IDENT ( ( ASSIGN | BIND ) expr )? ','
        {
        pushFollow(FOLLOW_typeName_in_synpred178_pol5135);
        typeName();

        state._fsp--;
        if (state.failed) return ;
        match(input,IDENT,FOLLOW_IDENT_in_synpred178_pol5137); if (state.failed) return ;
        // pol.g:786:20: ( ( ASSIGN | BIND ) expr )?
        int alt137=2;
        int LA137_0 = input.LA(1);

        if ( (LA137_0==ASSIGN||LA137_0==BIND) ) {
            alt137=1;
        }
        switch (alt137) {
            case 1 :
                // pol.g:786:21: ( ASSIGN | BIND ) expr
                {
                if ( input.LA(1)==ASSIGN||input.LA(1)==BIND ) {
                    input.consume();
                    state.errorRecovery=false;state.failed=false;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    MismatchedSetException mse = new MismatchedSetException(null,input);
                    throw mse;
                }

                pushFollow(FOLLOW_expr_in_synpred178_pol5148);
                expr();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }

        match(input,126,FOLLOW_126_in_synpred178_pol5152); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred178_pol

    // $ANTLR start synpred179_pol
    public final void synpred179_pol_fragment() throws RecognitionException {   
        // pol.g:787:5: ( typeName IDENT '[' )
        // pol.g:787:6: typeName IDENT '['
        {
        pushFollow(FOLLOW_typeName_in_synpred179_pol5165);
        typeName();

        state._fsp--;
        if (state.failed) return ;
        match(input,IDENT,FOLLOW_IDENT_in_synpred179_pol5167); if (state.failed) return ;
        match(input,159,FOLLOW_159_in_synpred179_pol5169); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred179_pol

    // $ANTLR start synpred180_pol
    public final void synpred180_pol_fragment() throws RecognitionException {   
        // pol.g:788:5: ( typeName '(' )
        // pol.g:788:6: typeName '('
        {
        pushFollow(FOLLOW_typeName_in_synpred180_pol5182);
        typeName();

        state._fsp--;
        if (state.failed) return ;
        match(input,153,FOLLOW_153_in_synpred180_pol5184); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred180_pol

    // $ANTLR start synpred181_pol
    public final void synpred181_pol_fragment() throws RecognitionException {   
        // pol.g:789:6: ( typeName varInit )
        // pol.g:789:7: typeName varInit
        {
        pushFollow(FOLLOW_typeName_in_synpred181_pol5199);
        typeName();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_varInit_in_synpred181_pol5201);
        varInit();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred181_pol

    // $ANTLR start synpred185_pol
    public final void synpred185_pol_fragment() throws RecognitionException {   
        // pol.g:811:5: ( '[' varDim ']' )
        // pol.g:811:5: '[' varDim ']'
        {
        match(input,159,FOLLOW_159_in_synpred185_pol5387); if (state.failed) return ;
        pushFollow(FOLLOW_varDim_in_synpred185_pol5389);
        varDim();

        state._fsp--;
        if (state.failed) return ;
        match(input,160,FOLLOW_160_in_synpred185_pol5391); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred185_pol

    // $ANTLR start synpred189_pol
    public final void synpred189_pol_fragment() throws RecognitionException {   
        // pol.g:822:17: ( ',' initializer )
        // pol.g:822:17: ',' initializer
        {
        match(input,126,FOLLOW_126_in_synpred189_pol5465); if (state.failed) return ;
        pushFollow(FOLLOW_initializer_in_synpred189_pol5467);
        initializer();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred189_pol

    // $ANTLR start synpred190_pol
    public final void synpred190_pol_fragment() throws RecognitionException {   
        // pol.g:829:4: ( typeName varDeclList )
        // pol.g:829:4: typeName varDeclList
        {
        pushFollow(FOLLOW_typeName_in_synpred190_pol5496);
        typeName();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_varDeclList_in_synpred190_pol5501);
        varDeclList();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred190_pol

    // $ANTLR start synpred191_pol
    public final void synpred191_pol_fragment() throws RecognitionException {   
        // pol.g:830:13: ( ',' varInit )
        // pol.g:830:13: ',' varInit
        {
        match(input,126,FOLLOW_126_in_synpred191_pol5509); if (state.failed) return ;
        pushFollow(FOLLOW_varInit_in_synpred191_pol5512);
        varInit();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred191_pol

    // $ANTLR start synpred192_pol
    public final void synpred192_pol_fragment() throws RecognitionException {   
        // pol.g:834:4: ( IDENT BIND expr )
        // pol.g:834:4: IDENT BIND expr
        {
        match(input,IDENT,FOLLOW_IDENT_in_synpred192_pol5530); if (state.failed) return ;
        match(input,BIND,FOLLOW_BIND_in_synpred192_pol5532); if (state.failed) return ;
        pushFollow(FOLLOW_expr_in_synpred192_pol5534);
        expr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred192_pol

    // $ANTLR start synpred202_pol
    public final void synpred202_pol_fragment() throws RecognitionException {   
        // pol.g:852:16: ( qualNameList )
        // pol.g:852:16: qualNameList
        {
        pushFollow(FOLLOW_qualNameList_in_synpred202_pol5704);
        qualNameList();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred202_pol

    // $ANTLR start synpred203_pol
    public final void synpred203_pol_fragment() throws RecognitionException {   
        // pol.g:856:6: ( '.' IDENT )
        // pol.g:856:6: '.' IDENT
        {
        match(input,158,FOLLOW_158_in_synpred203_pol5736); if (state.failed) return ;
        match(input,IDENT,FOLLOW_IDENT_in_synpred203_pol5751); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred203_pol

    // $ANTLR start synpred215_pol
    public final void synpred215_pol_fragment() throws RecognitionException {   
        // pol.g:905:11: ( NL )
        // pol.g:905:11: NL
        {
        match(input,NL,FOLLOW_NL_in_synpred215_pol6212); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred215_pol

    // $ANTLR start synpred216_pol
    public final void synpred216_pol_fragment() throws RecognitionException {   
        // pol.g:911:12: ( NL )
        // pol.g:911:12: NL
        {
        match(input,NL,FOLLOW_NL_in_synpred216_pol6255); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred216_pol

    // $ANTLR start synpred217_pol
    public final void synpred217_pol_fragment() throws RecognitionException {   
        // pol.g:911:4: ( ( SEMI ) ( NL )* )
        // pol.g:911:4: ( SEMI ) ( NL )*
        {
        // pol.g:911:4: ( SEMI )
        // pol.g:911:5: SEMI
        {
        match(input,SEMI,FOLLOW_SEMI_in_synpred217_pol6251); if (state.failed) return ;

        }

        // pol.g:911:11: ( NL )*
        loop140:
        do {
            int alt140=2;
            int LA140_0 = input.LA(1);

            if ( (LA140_0==NL) ) {
                alt140=1;
            }


            switch (alt140) {
        	case 1 :
        	    // pol.g:911:12: NL
        	    {
        	    match(input,NL,FOLLOW_NL_in_synpred217_pol6255); if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop140;
            }
        } while (true);


        }
    }
    // $ANTLR end synpred217_pol

    // $ANTLR start synpred218_pol
    public final void synpred218_pol_fragment() throws RecognitionException {   
        // pol.g:912:5: ( NL )
        // pol.g:912:5: NL
        {
        match(input,NL,FOLLOW_NL_in_synpred218_pol6266); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred218_pol

    // $ANTLR start synpred219_pol
    public final void synpred219_pol_fragment() throws RecognitionException {   
        // pol.g:912:4: ( ( NL )+ )
        // pol.g:912:4: ( NL )+
        {
        // pol.g:912:4: ( NL )+
        int cnt141=0;
        loop141:
        do {
            int alt141=2;
            int LA141_0 = input.LA(1);

            if ( (LA141_0==NL) ) {
                alt141=1;
            }


            switch (alt141) {
        	case 1 :
        	    // pol.g:912:5: NL
        	    {
        	    match(input,NL,FOLLOW_NL_in_synpred219_pol6266); if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    if ( cnt141 >= 1 ) break loop141;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(141, input);
                    throw eee;
            }
            cnt141++;
        } while (true);


        }
    }
    // $ANTLR end synpred219_pol

    // $ANTLR start synpred221_pol
    public final void synpred221_pol_fragment() throws RecognitionException {   
        // pol.g:914:4: ( ( NL )* '}' )
        // pol.g:914:5: ( NL )* '}'
        {
        // pol.g:914:5: ( NL )*
        loop142:
        do {
            int alt142=2;
            int LA142_0 = input.LA(1);

            if ( (LA142_0==NL) ) {
                alt142=1;
            }


            switch (alt142) {
        	case 1 :
        	    // pol.g:914:6: NL
        	    {
        	    match(input,NL,FOLLOW_NL_in_synpred221_pol6280); if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop142;
            }
        } while (true);

        match(input,135,FOLLOW_135_in_synpred221_pol6284); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred221_pol

    // $ANTLR start synpred222_pol
    public final void synpred222_pol_fragment() throws RecognitionException {   
        // pol.g:914:20: ( NL )
        // pol.g:914:20: NL
        {
        match(input,NL,FOLLOW_NL_in_synpred222_pol6290); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred222_pol

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
    public final boolean synpred134_pol() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred134_pol_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred217_pol() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred217_pol_fragment(); // can never throw exception
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
    public final boolean synpred161_pol() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred161_pol_fragment(); // can never throw exception
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
    public final boolean synpred180_pol() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred180_pol_fragment(); // can never throw exception
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
    public final boolean synpred203_pol() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred203_pol_fragment(); // can never throw exception
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
    public final boolean synpred156_pol() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred156_pol_fragment(); // can never throw exception
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
    public final boolean synpred190_pol() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred190_pol_fragment(); // can never throw exception
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
    public final boolean synpred185_pol() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred185_pol_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred221_pol() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred221_pol_fragment(); // can never throw exception
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
    public final boolean synpred192_pol() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred192_pol_fragment(); // can never throw exception
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
    public final boolean synpred181_pol() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred181_pol_fragment(); // can never throw exception
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
    public final boolean synpred222_pol() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred222_pol_fragment(); // can never throw exception
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
    public final boolean synpred135_pol() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred135_pol_fragment(); // can never throw exception
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
    public final boolean synpred164_pol() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred164_pol_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred202_pol() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred202_pol_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred191_pol() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred191_pol_fragment(); // can never throw exception
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


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA8 dfa8 = new DFA8(this);
    protected DFA9 dfa9 = new DFA9(this);
    protected DFA11 dfa11 = new DFA11(this);
    protected DFA12 dfa12 = new DFA12(this);
    protected DFA18 dfa18 = new DFA18(this);
    protected DFA21 dfa21 = new DFA21(this);
    protected DFA22 dfa22 = new DFA22(this);
    protected DFA23 dfa23 = new DFA23(this);
    protected DFA24 dfa24 = new DFA24(this);
    protected DFA58 dfa58 = new DFA58(this);
    protected DFA84 dfa84 = new DFA84(this);
    protected DFA124 dfa124 = new DFA124(this);
    static final String DFA2_eotS =
        "\12\uffff";
    static final String DFA2_eofS =
        "\1\2\11\uffff";
    static final String DFA2_minS =
        "\1\154\1\0\10\uffff";
    static final String DFA2_maxS =
        "\1\u0084\1\0\10\uffff";
    static final String DFA2_acceptS =
        "\2\uffff\1\2\6\uffff\1\1";
    static final String DFA2_specialS =
        "\1\uffff\1\0\10\uffff}>";
    static final String[] DFA2_transitionS = {
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
            return "190:7: ( stmtInjection )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA2_1 = input.LA(1);

                         
                        int index2_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_pol()) ) {s = 9;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index2_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 2, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA8_eotS =
        "\16\uffff";
    static final String DFA8_eofS =
        "\16\uffff";
    static final String DFA8_minS =
        "\1\115\15\uffff";
    static final String DFA8_maxS =
        "\1\u00bf\15\uffff";
    static final String DFA8_acceptS =
        "\1\uffff\1\2\1\uffff\1\1\12\uffff";
    static final String DFA8_specialS =
        "\16\uffff}>";
    static final String[] DFA8_transitionS = {
            "\1\1\1\3\35\uffff\1\3\16\uffff\1\3\1\uffff\1\3\11\uffff\1\1"+
            "\20\uffff\2\3\1\uffff\2\3\30\uffff\13\3",
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

    static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
    static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
    static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
    static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
    static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
    static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
    static final short[][] DFA8_transition;

    static {
        int numStates = DFA8_transitionS.length;
        DFA8_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
        }
    }

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = DFA8_eot;
            this.eof = DFA8_eof;
            this.min = DFA8_min;
            this.max = DFA8_max;
            this.accept = DFA8_accept;
            this.special = DFA8_special;
            this.transition = DFA8_transition;
        }
        public String getDescription() {
            return "()* loopback of 224:13: ( classFeature )*";
        }
    }
    static final String DFA9_eotS =
        "\14\uffff";
    static final String DFA9_eofS =
        "\14\uffff";
    static final String DFA9_minS =
        "\1\116\1\uffff\3\0\7\uffff";
    static final String DFA9_maxS =
        "\1\u00bf\1\uffff\3\0\7\uffff";
    static final String DFA9_acceptS =
        "\1\uffff\1\1\4\uffff\1\2\1\3\2\uffff\1\4\1\5";
    static final String DFA9_specialS =
        "\2\uffff\1\0\1\1\1\2\7\uffff}>";
    static final String[] DFA9_transitionS = {
            "\1\4\35\uffff\1\13\16\uffff\1\12\1\uffff\1\6\32\uffff\1\7\1"+
            "\1\1\uffff\1\1\1\2\30\uffff\2\7\11\3",
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
            return "227:1: classFeature : ( fcnDefinition | enumDefinition | varDeclaration | classDefinition | stmtInjection );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA9_2 = input.LA(1);

                         
                        int index9_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_pol()) ) {s = 1;}

                        else if ( (synpred11_pol()) ) {s = 7;}

                         
                        input.seek(index9_2);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA9_3 = input.LA(1);

                         
                        int index9_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (((synpred9_pol()&&(input.LT(1).getText().equals(ti.getTypeName()) ))||synpred9_pol())) ) {s = 1;}

                        else if ( (synpred11_pol()) ) {s = 7;}

                         
                        input.seek(index9_3);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA9_4 = input.LA(1);

                         
                        int index9_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (((synpred9_pol()&&(input.LT(1).getText().equals(ti.getTypeName()) ))||synpred9_pol())) ) {s = 1;}

                        else if ( (synpred11_pol()) ) {s = 7;}

                         
                        input.seek(index9_4);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 9, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA11_eotS =
        "\16\uffff";
    static final String DFA11_eofS =
        "\16\uffff";
    static final String DFA11_minS =
        "\1\115\15\uffff";
    static final String DFA11_maxS =
        "\1\u00bf\15\uffff";
    static final String DFA11_acceptS =
        "\1\uffff\1\2\1\uffff\1\1\12\uffff";
    static final String DFA11_specialS =
        "\16\uffff}>";
    static final String[] DFA11_transitionS = {
            "\1\1\1\3\35\uffff\1\3\16\uffff\1\3\1\uffff\1\3\11\uffff\1\1"+
            "\20\uffff\2\3\1\uffff\2\3\30\uffff\13\3",
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

    static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
    static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
    static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
    static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
    static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
    static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
    static final short[][] DFA11_transition;

    static {
        int numStates = DFA11_transitionS.length;
        DFA11_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
        }
    }

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = DFA11_eot;
            this.eof = DFA11_eof;
            this.min = DFA11_min;
            this.max = DFA11_max;
            this.accept = DFA11_accept;
            this.special = DFA11_special;
            this.transition = DFA11_transition;
        }
        public String getDescription() {
            return "()* loopback of 238:14: ( moduleFeature )*";
        }
    }
    static final String DFA12_eotS =
        "\14\uffff";
    static final String DFA12_eofS =
        "\14\uffff";
    static final String DFA12_minS =
        "\1\116\1\uffff\3\0\7\uffff";
    static final String DFA12_maxS =
        "\1\u00bf\1\uffff\3\0\7\uffff";
    static final String DFA12_acceptS =
        "\1\uffff\1\1\4\uffff\1\2\2\uffff\1\3\1\4\1\5";
    static final String DFA12_specialS =
        "\2\uffff\1\0\1\1\1\2\7\uffff}>";
    static final String[] DFA12_transitionS = {
            "\1\4\35\uffff\1\13\16\uffff\1\12\1\uffff\1\11\32\uffff\1\6\1"+
            "\1\1\uffff\1\1\1\2\30\uffff\2\6\11\3",
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
            return "241:1: moduleFeature : ( fcnDefinition | varDeclaration | enumDefinition | classDefinition | stmtInjection );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_2 = input.LA(1);

                         
                        int index12_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred15_pol()) ) {s = 1;}

                        else if ( (synpred16_pol()) ) {s = 6;}

                         
                        input.seek(index12_2);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_3 = input.LA(1);

                         
                        int index12_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (((synpred15_pol()&&(input.LT(1).getText().equals(ti.getTypeName()) ))||synpred15_pol())) ) {s = 1;}

                        else if ( (synpred16_pol()) ) {s = 6;}

                         
                        input.seek(index12_3);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_4 = input.LA(1);

                         
                        int index12_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (((synpred15_pol()&&(input.LT(1).getText().equals(ti.getTypeName()) ))||synpred15_pol())) ) {s = 1;}

                        else if ( (synpred16_pol()) ) {s = 6;}

                         
                        input.seek(index12_4);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA18_eotS =
        "\12\uffff";
    static final String DFA18_eofS =
        "\12\uffff";
    static final String DFA18_minS =
        "\1\115\11\uffff";
    static final String DFA18_maxS =
        "\1\u00bf\11\uffff";
    static final String DFA18_acceptS =
        "\1\uffff\1\2\1\uffff\1\1\6\uffff";
    static final String DFA18_specialS =
        "\12\uffff}>";
    static final String[] DFA18_transitionS = {
            "\1\1\1\3\35\uffff\1\3\20\uffff\1\3\11\uffff\1\1\21\uffff\1\3"+
            "\1\uffff\2\3\32\uffff\11\3",
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

    static final short[] DFA18_eot = DFA.unpackEncodedString(DFA18_eotS);
    static final short[] DFA18_eof = DFA.unpackEncodedString(DFA18_eofS);
    static final char[] DFA18_min = DFA.unpackEncodedStringToUnsignedChars(DFA18_minS);
    static final char[] DFA18_max = DFA.unpackEncodedStringToUnsignedChars(DFA18_maxS);
    static final short[] DFA18_accept = DFA.unpackEncodedString(DFA18_acceptS);
    static final short[] DFA18_special = DFA.unpackEncodedString(DFA18_specialS);
    static final short[][] DFA18_transition;

    static {
        int numStates = DFA18_transitionS.length;
        DFA18_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA18_transition[i] = DFA.unpackEncodedString(DFA18_transitionS[i]);
        }
    }

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = DFA18_eot;
            this.eof = DFA18_eof;
            this.min = DFA18_min;
            this.max = DFA18_max;
            this.accept = DFA18_accept;
            this.special = DFA18_special;
            this.transition = DFA18_transition;
        }
        public String getDescription() {
            return "()* loopback of 280:13: ( protocolFeature )*";
        }
    }
    static final String DFA21_eotS =
        "\16\uffff";
    static final String DFA21_eofS =
        "\16\uffff";
    static final String DFA21_minS =
        "\1\115\15\uffff";
    static final String DFA21_maxS =
        "\1\u00bf\15\uffff";
    static final String DFA21_acceptS =
        "\1\uffff\1\2\1\uffff\1\1\12\uffff";
    static final String DFA21_specialS =
        "\16\uffff}>";
    static final String[] DFA21_transitionS = {
            "\1\1\1\3\35\uffff\1\3\15\uffff\1\3\2\uffff\1\3\11\uffff\1\1"+
            "\20\uffff\2\3\1\uffff\2\3\30\uffff\13\3",
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

    static final short[] DFA21_eot = DFA.unpackEncodedString(DFA21_eotS);
    static final short[] DFA21_eof = DFA.unpackEncodedString(DFA21_eofS);
    static final char[] DFA21_min = DFA.unpackEncodedStringToUnsignedChars(DFA21_minS);
    static final char[] DFA21_max = DFA.unpackEncodedStringToUnsignedChars(DFA21_maxS);
    static final short[] DFA21_accept = DFA.unpackEncodedString(DFA21_acceptS);
    static final short[] DFA21_special = DFA.unpackEncodedString(DFA21_specialS);
    static final short[][] DFA21_transition;

    static {
        int numStates = DFA21_transitionS.length;
        DFA21_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA21_transition[i] = DFA.unpackEncodedString(DFA21_transitionS[i]);
        }
    }

    class DFA21 extends DFA {

        public DFA21(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 21;
            this.eot = DFA21_eot;
            this.eof = DFA21_eof;
            this.min = DFA21_min;
            this.max = DFA21_max;
            this.accept = DFA21_accept;
            this.special = DFA21_special;
            this.transition = DFA21_transition;
        }
        public String getDescription() {
            return "()* loopback of 296:13: ( compositionFeature )*";
        }
    }
    static final String DFA22_eotS =
        "\14\uffff";
    static final String DFA22_eofS =
        "\14\uffff";
    static final String DFA22_minS =
        "\1\116\2\uffff\3\0\6\uffff";
    static final String DFA22_maxS =
        "\1\u00bf\2\uffff\3\0\6\uffff";
    static final String DFA22_acceptS =
        "\1\uffff\1\1\1\2\4\uffff\1\3\1\4\2\uffff\1\5";
    static final String DFA22_specialS =
        "\3\uffff\1\0\1\1\1\2\6\uffff}>";
    static final String[] DFA22_transitionS = {
            "\1\5\35\uffff\1\13\15\uffff\1\1\2\uffff\1\7\32\uffff\1\10\1"+
            "\2\1\uffff\1\2\1\3\30\uffff\2\10\11\4",
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
            return "299:1: compositionFeature : ( exportList | fcnDefinitionHost | enumDefinition | varDeclaration | stmtInjection );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA22_3 = input.LA(1);

                         
                        int index22_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred30_pol()) ) {s = 2;}

                        else if ( (synpred32_pol()) ) {s = 8;}

                         
                        input.seek(index22_3);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA22_4 = input.LA(1);

                         
                        int index22_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (((synpred30_pol()&&(input.LT(1).getText().equals(ti.getTypeName()) ))||synpred30_pol())) ) {s = 2;}

                        else if ( (synpred32_pol()) ) {s = 8;}

                         
                        input.seek(index22_4);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA22_5 = input.LA(1);

                         
                        int index22_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (((synpred30_pol()&&(input.LT(1).getText().equals(ti.getTypeName()) ))||synpred30_pol())) ) {s = 2;}

                        else if ( (synpred32_pol()) ) {s = 8;}

                         
                        input.seek(index22_5);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 22, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA23_eotS =
        "\17\uffff";
    static final String DFA23_eofS =
        "\1\2\16\uffff";
    static final String DFA23_minS =
        "\1\115\16\uffff";
    static final String DFA23_maxS =
        "\1\u0086\16\uffff";
    static final String DFA23_acceptS =
        "\1\uffff\1\1\1\2\14\uffff";
    static final String DFA23_specialS =
        "\17\uffff}>";
    static final String[] DFA23_transitionS = {
            "\1\2\32\uffff\1\2\3\uffff\1\2\16\uffff\3\2\1\uffff\6\2\1\uffff"+
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
            return "308:27: ( metaArguments )?";
        }
    }
    static final String DFA24_eotS =
        "\17\uffff";
    static final String DFA24_eofS =
        "\1\15\16\uffff";
    static final String DFA24_minS =
        "\1\115\1\uffff\14\0\1\uffff";
    static final String DFA24_maxS =
        "\1\u0084\1\uffff\14\0\1\uffff";
    static final String DFA24_acceptS =
        "\1\uffff\1\1\14\uffff\1\2";
    static final String DFA24_specialS =
        "\2\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\uffff}>";
    static final String[] DFA24_transitionS = {
            "\1\3\32\uffff\1\2\3\uffff\1\6\16\uffff\1\11\1\10\1\14\1\uffff"+
            "\1\12\1\13\1\5\1\4\1\1\1\7",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            ""
    };

    static final short[] DFA24_eot = DFA.unpackEncodedString(DFA24_eotS);
    static final short[] DFA24_eof = DFA.unpackEncodedString(DFA24_eofS);
    static final char[] DFA24_min = DFA.unpackEncodedStringToUnsignedChars(DFA24_minS);
    static final char[] DFA24_max = DFA.unpackEncodedStringToUnsignedChars(DFA24_maxS);
    static final short[] DFA24_accept = DFA.unpackEncodedString(DFA24_acceptS);
    static final short[] DFA24_special = DFA.unpackEncodedString(DFA24_specialS);
    static final short[][] DFA24_transition;

    static {
        int numStates = DFA24_transitionS.length;
        DFA24_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA24_transition[i] = DFA.unpackEncodedString(DFA24_transitionS[i]);
        }
    }

    class DFA24 extends DFA {

        public DFA24(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 24;
            this.eot = DFA24_eot;
            this.eof = DFA24_eof;
            this.min = DFA24_min;
            this.max = DFA24_max;
            this.accept = DFA24_accept;
            this.special = DFA24_special;
            this.transition = DFA24_transition;
        }
        public String getDescription() {
            return "309:10: ( importAs )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA24_2 = input.LA(1);

                         
                        int index24_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred34_pol()) ) {s = 1;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index24_2);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA24_3 = input.LA(1);

                         
                        int index24_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred34_pol()) ) {s = 1;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index24_3);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA24_4 = input.LA(1);

                         
                        int index24_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred34_pol()) ) {s = 1;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index24_4);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA24_5 = input.LA(1);

                         
                        int index24_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred34_pol()) ) {s = 1;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index24_5);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA24_6 = input.LA(1);

                         
                        int index24_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred34_pol()) ) {s = 1;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index24_6);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA24_7 = input.LA(1);

                         
                        int index24_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred34_pol()) ) {s = 1;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index24_7);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA24_8 = input.LA(1);

                         
                        int index24_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred34_pol()) ) {s = 1;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index24_8);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA24_9 = input.LA(1);

                         
                        int index24_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred34_pol()) ) {s = 1;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index24_9);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA24_10 = input.LA(1);

                         
                        int index24_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred34_pol()) ) {s = 1;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index24_10);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA24_11 = input.LA(1);

                         
                        int index24_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred34_pol()) ) {s = 1;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index24_11);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA24_12 = input.LA(1);

                         
                        int index24_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred34_pol()) ) {s = 1;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index24_12);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA24_13 = input.LA(1);

                         
                        int index24_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred34_pol()) ) {s = 1;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index24_13);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 24, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA58_eotS =
        "\16\uffff";
    static final String DFA58_eofS =
        "\16\uffff";
    static final String DFA58_minS =
        "\1\116\1\0\2\uffff\1\0\11\uffff";
    static final String DFA58_maxS =
        "\1\u00c2\1\0\2\uffff\1\0\11\uffff";
    static final String DFA58_acceptS =
        "\2\uffff\1\10\1\11\1\uffff\1\13\1\1\1\12\1\5\1\4\1\6\1\2\1\3\1\7";
    static final String DFA58_specialS =
        "\1\uffff\1\0\2\uffff\1\1\11\uffff}>";
    static final String[] DFA58_transitionS = {
            "\1\1\1\uffff\3\6\4\uffff\2\7\1\uffff\1\15\12\uffff\1\11\1\10"+
            "\2\uffff\3\6\1\13\53\uffff\1\4\1\12\3\uffff\1\1\1\uffff\1\14"+
            "\40\uffff\3\6",
            "\1\uffff",
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
            ""
    };

    static final short[] DFA58_eot = DFA.unpackEncodedString(DFA58_eotS);
    static final short[] DFA58_eof = DFA.unpackEncodedString(DFA58_eofS);
    static final char[] DFA58_min = DFA.unpackEncodedStringToUnsignedChars(DFA58_minS);
    static final char[] DFA58_max = DFA.unpackEncodedStringToUnsignedChars(DFA58_maxS);
    static final short[] DFA58_accept = DFA.unpackEncodedString(DFA58_acceptS);
    static final short[] DFA58_special = DFA.unpackEncodedString(DFA58_specialS);
    static final short[][] DFA58_transition;

    static {
        int numStates = DFA58_transitionS.length;
        DFA58_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA58_transition[i] = DFA.unpackEncodedString(DFA58_transitionS[i]);
        }
    }

    class DFA58 extends DFA {

        public DFA58(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 58;
            this.eot = DFA58_eot;
            this.eof = DFA58_eof;
            this.min = DFA58_min;
            this.max = DFA58_max;
            this.accept = DFA58_accept;
            this.special = DFA58_special;
            this.transition = DFA58_transition;
        }
        public String getDescription() {
            return "516:1: exprUnary : ( primitiveLit | injectionCode | arrayLit -> ^( E_VEC arrayLit ) | logicalNotOp expr -> ^( E_UNARY logicalNotOp expr ) | bitwiseNotOp expr -> ^( E_UNARY bitwiseNotOp expr ) | '(' expr ')' -> ^( E_PAREN expr ) | MINUS expr -> ^( E_UNARY MINUS expr ) | varOrFcnOrArray incDecOp -> ^( E_UNARY varOrFcnOrArray incDecOp ) | varOrFcnOrArray | incDecOp varOrFcnOrArray -> ^( E_UNARY varOrFcnOrArray incDecOp ) | exprNew );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA58_1 = input.LA(1);

                         
                        int index58_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_pol()) ) {s = 2;}

                        else if ( (synpred101_pol()) ) {s = 3;}

                         
                        input.seek(index58_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA58_4 = input.LA(1);

                         
                        int index58_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_pol()) ) {s = 2;}

                        else if ( (synpred101_pol()) ) {s = 3;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index58_4);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 58, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA84_eotS =
        "\26\uffff";
    static final String DFA84_eofS =
        "\26\uffff";
    static final String DFA84_minS =
        "\1\115\7\uffff\1\0\10\uffff\2\0\3\uffff";
    static final String DFA84_maxS =
        "\1\u00c2\7\uffff\1\0\10\uffff\2\0\3\uffff";
    static final String DFA84_acceptS =
        "\1\uffff\1\20\1\1\1\7\1\16\1\17\1\22\1\14\1\uffff\1\2\1\4\1\15\1"+
        "\11\1\5\1\12\1\6\1\10\2\uffff\1\21\1\13\1\3";
    static final String DFA84_specialS =
        "\10\uffff\1\0\10\uffff\1\1\1\2\3\uffff}>";
    static final String[] DFA84_transitionS = {
            "\1\15\1\10\1\uffff\3\6\4\uffff\2\6\1\uffff\1\6\12\uffff\2\6"+
            "\2\uffff\3\6\1\22\31\uffff\1\15\21\uffff\1\10\1\6\2\uffff\1"+
            "\2\1\21\1\uffff\1\6\1\uffff\1\25\1\17\3\uffff\1\3\1\20\1\14"+
            "\1\24\1\16\1\uffff\1\7\2\uffff\1\13\1\1\1\4\2\uffff\1\5\13\2"+
            "\3\6",
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
            "",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            ""
    };

    static final short[] DFA84_eot = DFA.unpackEncodedString(DFA84_eotS);
    static final short[] DFA84_eof = DFA.unpackEncodedString(DFA84_eofS);
    static final char[] DFA84_min = DFA.unpackEncodedStringToUnsignedChars(DFA84_minS);
    static final char[] DFA84_max = DFA.unpackEncodedStringToUnsignedChars(DFA84_maxS);
    static final short[] DFA84_accept = DFA.unpackEncodedString(DFA84_acceptS);
    static final short[] DFA84_special = DFA.unpackEncodedString(DFA84_specialS);
    static final short[][] DFA84_transition;

    static {
        int numStates = DFA84_transitionS.length;
        DFA84_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA84_transition[i] = DFA.unpackEncodedString(DFA84_transitionS[i]);
        }
    }

    class DFA84 extends DFA {

        public DFA84(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 84;
            this.eot = DFA84_eot;
            this.eof = DFA84_eof;
            this.min = DFA84_min;
            this.max = DFA84_max;
            this.accept = DFA84_accept;
            this.special = DFA84_special;
            this.transition = DFA84_transition;
        }
        public String getDescription() {
            return "651:1: stmt : ( varDeclaration | stmtAssign | stmtAssert | stmtBind | stmtBlock | stmtPrint | stmtReturn | stmtBreak | stmtContinue | stmtForEach | stmtFor | stmtSwitch | stmtDoWhile | stmtIf | stmtProvided | stmtWhile | stmtInjection | expr delim );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA84_8 = input.LA(1);

                         
                        int index84_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred137_pol()) ) {s = 2;}

                        else if ( (synpred138_pol()) ) {s = 9;}

                        else if ( (synpred140_pol()) ) {s = 10;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index84_8);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA84_17 = input.LA(1);

                         
                        int index84_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred138_pol()) ) {s = 9;}

                        else if ( (synpred140_pol()) ) {s = 10;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index84_17);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA84_18 = input.LA(1);

                         
                        int index84_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred138_pol()) ) {s = 9;}

                        else if ( (synpred153_pol()) ) {s = 19;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index84_18);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 84, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA124_eotS =
        "\67\uffff";
    static final String DFA124_eofS =
        "\1\14\66\uffff";
    static final String DFA124_minS =
        "\1\115\2\0\64\uffff";
    static final String DFA124_maxS =
        "\1\u00c2\2\0\64\uffff";
    static final String DFA124_acceptS =
        "\3\uffff\62\3\1\1\1\2";
    static final String DFA124_specialS =
        "\1\0\1\1\1\2\64\uffff}>";
    static final String[] DFA124_transitionS = {
            "\1\2\1\22\1\uffff\1\51\1\56\1\57\4\uffff\2\64\1\uffff\1\63\12"+
            "\uffff\1\61\1\62\1\uffff\1\1\1\52\1\53\1\54\1\5\15\uffff\1\16"+
            "\1\10\1\7\1\13\1\27\1\11\1\12\1\4\1\3\1\uffff\1\6\1\uffff\1"+
            "\34\1\15\20\uffff\1\26\1\23\1\uffff\1\17\1\20\1\32\1\uffff\1"+
            "\60\1\uffff\1\33\1\35\3\uffff\1\36\1\37\1\40\1\42\1\41\1\uffff"+
            "\1\43\1\30\1\31\1\44\1\47\1\45\2\uffff\1\46\1\24\1\25\11\21"+
            "\2\50\1\55",
            "\1\uffff",
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
            "",
            ""
    };

    static final short[] DFA124_eot = DFA.unpackEncodedString(DFA124_eotS);
    static final short[] DFA124_eof = DFA.unpackEncodedString(DFA124_eofS);
    static final char[] DFA124_min = DFA.unpackEncodedStringToUnsignedChars(DFA124_minS);
    static final char[] DFA124_max = DFA.unpackEncodedStringToUnsignedChars(DFA124_maxS);
    static final short[] DFA124_accept = DFA.unpackEncodedString(DFA124_acceptS);
    static final short[] DFA124_special = DFA.unpackEncodedString(DFA124_specialS);
    static final short[][] DFA124_transition;

    static {
        int numStates = DFA124_transitionS.length;
        DFA124_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA124_transition[i] = DFA.unpackEncodedString(DFA124_transitionS[i]);
        }
    }

    class DFA124 extends DFA {

        public DFA124(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 124;
            this.eot = DFA124_eot;
            this.eof = DFA124_eof;
            this.min = DFA124_min;
            this.max = DFA124_max;
            this.accept = DFA124_accept;
            this.special = DFA124_special;
            this.transition = DFA124_transition;
        }
        public String getDescription() {
            return "910:1: delim : ( ( SEMI ) ( NL )* -> | ( NL )+ -> | ( ( NL )* '}' )=> ( NL )* ->);";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA124_0 = input.LA(1);

                         
                        int index124_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA124_0==SEMI) ) {s = 1;}

                        else if ( (LA124_0==NL) ) {s = 2;}

                        else if ( (LA124_0==130) && (synpred221_pol())) {s = 3;}

                        else if ( (LA124_0==129) && (synpred221_pol())) {s = 4;}

                        else if ( (LA124_0==INJECT) && (synpred221_pol())) {s = 5;}

                        else if ( (LA124_0==132) && (synpred221_pol())) {s = 6;}

                        else if ( (LA124_0==124) && (synpred221_pol())) {s = 7;}

                        else if ( (LA124_0==123) && (synpred221_pol())) {s = 8;}

                        else if ( (LA124_0==127) && (synpred221_pol())) {s = 9;}

                        else if ( (LA124_0==128) && (synpred221_pol())) {s = 10;}

                        else if ( (LA124_0==125) && (synpred221_pol())) {s = 11;}

                        else if ( (LA124_0==EOF) && (synpred221_pol())) {s = 12;}

                        else if ( (LA124_0==135) && (synpred221_pol())) {s = 13;}

                        else if ( (LA124_0==122) && (synpred221_pol())) {s = 14;}

                        else if ( (LA124_0==155) && (synpred221_pol())) {s = 15;}

                        else if ( (LA124_0==156) && (synpred221_pol())) {s = 16;}

                        else if ( ((LA124_0>=183 && LA124_0<=191)) && (synpred221_pol())) {s = 17;}

                        else if ( (LA124_0==IDENT) && (synpred221_pol())) {s = 18;}

                        else if ( (LA124_0==153) && (synpred221_pol())) {s = 19;}

                        else if ( (LA124_0==181) && (synpred221_pol())) {s = 20;}

                        else if ( (LA124_0==182) && (synpred221_pol())) {s = 21;}

                        else if ( (LA124_0==152) && (synpred221_pol())) {s = 22;}

                        else if ( (LA124_0==126) && (synpred221_pol())) {s = 23;}

                        else if ( (LA124_0==173) && (synpred221_pol())) {s = 24;}

                        else if ( (LA124_0==174) && (synpred221_pol())) {s = 25;}

                        else if ( (LA124_0==157) && (synpred221_pol())) {s = 26;}

                        else if ( (LA124_0==161) && (synpred221_pol())) {s = 27;}

                        else if ( (LA124_0==134) && (synpred221_pol())) {s = 28;}

                        else if ( (LA124_0==162) && (synpred221_pol())) {s = 29;}

                        else if ( (LA124_0==166) && (synpred221_pol())) {s = 30;}

                        else if ( (LA124_0==167) && (synpred221_pol())) {s = 31;}

                        else if ( (LA124_0==168) && (synpred221_pol())) {s = 32;}

                        else if ( (LA124_0==170) && (synpred221_pol())) {s = 33;}

                        else if ( (LA124_0==169) && (synpred221_pol())) {s = 34;}

                        else if ( (LA124_0==172) && (synpred221_pol())) {s = 35;}

                        else if ( (LA124_0==175) && (synpred221_pol())) {s = 36;}

                        else if ( (LA124_0==177) && (synpred221_pol())) {s = 37;}

                        else if ( (LA124_0==180) && (synpred221_pol())) {s = 38;}

                        else if ( (LA124_0==176) && (synpred221_pol())) {s = 39;}

                        else if ( ((LA124_0>=192 && LA124_0<=193)) && (synpred221_pol())) {s = 40;}

                        else if ( (LA124_0==INT_LIT) && (synpred221_pol())) {s = 41;}

                        else if ( (LA124_0==OCT_LIT) && (synpred221_pol())) {s = 42;}

                        else if ( (LA124_0==REAL_LIT) && (synpred221_pol())) {s = 43;}

                        else if ( (LA124_0==HEX_LIT) && (synpred221_pol())) {s = 44;}

                        else if ( (LA124_0==194) && (synpred221_pol())) {s = 45;}

                        else if ( (LA124_0==STRING) && (synpred221_pol())) {s = 46;}

                        else if ( (LA124_0==CHAR) && (synpred221_pol())) {s = 47;}

                        else if ( (LA124_0==159) && (synpred221_pol())) {s = 48;}

                        else if ( (LA124_0==LOG_NOT) && (synpred221_pol())) {s = 49;}

                        else if ( (LA124_0==BIT_NOT) && (synpred221_pol())) {s = 50;}

                        else if ( (LA124_0==MINUS) && (synpred221_pol())) {s = 51;}

                        else if ( ((LA124_0>=INC && LA124_0<=DEC)) && (synpred221_pol())) {s = 52;}

                         
                        input.seek(index124_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA124_1 = input.LA(1);

                         
                        int index124_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred217_pol()) ) {s = 53;}

                        else if ( (synpred221_pol()) ) {s = 52;}

                         
                        input.seek(index124_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA124_2 = input.LA(1);

                         
                        int index124_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred219_pol()) ) {s = 54;}

                        else if ( (synpred221_pol()) ) {s = 52;}

                         
                        input.seek(index124_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 124, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_NL_in_unit653 = new BitSet(new long[]{0x0000000000000000L,0xBA00100000002000L,0x0000000000000017L});
    public static final BitSet FOLLOW_unitPackage_in_unit657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtPackage_in_unitPackage683 = new BitSet(new long[]{0x0000000000000000L,0xB800100000000000L,0x0000000000000017L});
    public static final BitSet FOLLOW_importList_in_unitPackage689 = new BitSet(new long[]{0x0000000000000000L,0xB800100000000000L,0x0000000000000011L});
    public static final BitSet FOLLOW_stmtInjection_in_unitPackage698 = new BitSet(new long[]{0x0000000000000000L,0xB800100000000000L,0x0000000000000011L});
    public static final BitSet FOLLOW_unitTypeDefinition_in_unitPackage709 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_stmtInjection_in_unitPackage720 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_unitPackage730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_121_in_stmtPackage740 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_qualName_in_stmtPackage742 = new BitSet(new long[]{0x0000000000000000L,0x0000010000002000L});
    public static final BitSet FOLLOW_delim_in_stmtPackage744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_122_in_stmtExport776 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_qualName_in_stmtExport779 = new BitSet(new long[]{0x0000000000000000L,0x0000010000002000L});
    public static final BitSet FOLLOW_delim_in_stmtExport781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtExport_in_exportList799 = new BitSet(new long[]{0x0000000000000002L,0x0400000000000000L});
    public static final BitSet FOLLOW_123_in_classDefinition835 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_classDef_in_classDefinition837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_classDef856 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L,0x0000000000000240L});
    public static final BitSet FOLLOW_implementsClause_in_classDef867 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L,0x0000000000000240L});
    public static final BitSet FOLLOW_braceOpen_in_classDef874 = new BitSet(new long[]{0x0000000000000000L,0xB800100000006000L,0xFFE000001B000091L});
    public static final BitSet FOLLOW_classFeature_in_classDef877 = new BitSet(new long[]{0x0000000000000000L,0xB800100000006000L,0xFFE000001B000091L});
    public static final BitSet FOLLOW_braceClose_in_classDef881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fcnDefinition_in_classFeature898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumDefinition_in_classFeature909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDeclaration_in_classFeature919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classDefinition_in_classFeature929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtInjection_in_classFeature939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_124_in_moduleDefinition956 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_IDENT_in_moduleDefinition958 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L,0x0000000000000240L});
    public static final BitSet FOLLOW_implementsClause_in_moduleDefinition973 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L,0x0000000000000240L});
    public static final BitSet FOLLOW_braceOpen_in_moduleDefinition982 = new BitSet(new long[]{0x0000000000000000L,0xB800100000006000L,0xFFE000001B000091L});
    public static final BitSet FOLLOW_moduleFeature_in_moduleDefinition985 = new BitSet(new long[]{0x0000000000000000L,0xB800100000006000L,0xFFE000001B000091L});
    public static final BitSet FOLLOW_braceClose_in_moduleDefinition989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fcnDefinition_in_moduleFeature1021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDeclaration_in_moduleFeature1030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumDefinition_in_moduleFeature1037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classDefinition_in_moduleFeature1044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtInjection_in_moduleFeature1050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_125_in_enumDefinition1063 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_enumDef_in_enumDefinition1065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_enumDef1092 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L,0x0000000000000240L});
    public static final BitSet FOLLOW_braceOpen_in_enumDef1100 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_enumList_in_enumDef1102 = new BitSet(new long[]{0x0000000000000000L,0xB800100000006000L,0xFFE000001B000091L});
    public static final BitSet FOLLOW_braceClose_in_enumDef1104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumElement_in_enumList1129 = new BitSet(new long[]{0x0000000000000002L,0x4000000000000000L});
    public static final BitSet FOLLOW_126_in_enumList1132 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_enumElement_in_enumList1134 = new BitSet(new long[]{0x0000000000000002L,0x4000000000000000L});
    public static final BitSet FOLLOW_IDENT_in_enumElement1155 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_ASSIGN_in_enumElement1157 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_INT_LIT_in_enumElement1159 = new BitSet(new long[]{0x0000000000000000L,0x0000010000002000L});
    public static final BitSet FOLLOW_delim_in_enumElement1162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_enumElement1181 = new BitSet(new long[]{0x0000000000000000L,0x0000010000002000L});
    public static final BitSet FOLLOW_delim_in_enumElement1184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_127_in_protocolDefinition1204 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_IDENT_in_protocolDefinition1206 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L,0x0000000000000340L});
    public static final BitSet FOLLOW_extendsClause_in_protocolDefinition1214 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L,0x0000000000000240L});
    public static final BitSet FOLLOW_braceOpen_in_protocolDefinition1220 = new BitSet(new long[]{0x0000000000000000L,0xB800100000006000L,0xFFE000001B000091L});
    public static final BitSet FOLLOW_protocolFeature_in_protocolDefinition1223 = new BitSet(new long[]{0x0000000000000000L,0xB800100000006000L,0xFFE000001B000091L});
    public static final BitSet FOLLOW_braceClose_in_protocolDefinition1227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumDefinition_in_protocolFeature1261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fcnDeclaration_in_protocolFeature1271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtInjection_in_protocolFeature1282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_128_in_compositionDefinition1295 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_IDENT_in_compositionDefinition1297 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L,0x0000000000000340L});
    public static final BitSet FOLLOW_extendsClause_in_compositionDefinition1305 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L,0x0000000000000240L});
    public static final BitSet FOLLOW_braceOpen_in_compositionDefinition1312 = new BitSet(new long[]{0x0000000000000000L,0xBC00100000006000L,0xFFE000001B000091L});
    public static final BitSet FOLLOW_compositionFeature_in_compositionDefinition1315 = new BitSet(new long[]{0x0000000000000000L,0xBC00100000006000L,0xFFE000001B000091L});
    public static final BitSet FOLLOW_braceClose_in_compositionDefinition1319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exportList_in_compositionFeature1349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fcnDefinitionHost_in_compositionFeature1358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumDefinition_in_compositionFeature1366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDeclaration_in_compositionFeature1374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtInjection_in_compositionFeature1381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_importFrom_in_stmtImport1398 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_129_in_stmtImport1408 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_qualName_in_stmtImport1410 = new BitSet(new long[]{0x0000000000000000L,0x0000010000002000L,0x0000000000000048L});
    public static final BitSet FOLLOW_metaArguments_in_stmtImport1413 = new BitSet(new long[]{0x0000000000000000L,0x0000010000002000L,0x0000000000000008L});
    public static final BitSet FOLLOW_importAs_in_stmtImport1426 = new BitSet(new long[]{0x0000000000000000L,0x0000010000002000L});
    public static final BitSet FOLLOW_delim_in_stmtImport1429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_130_in_importFrom1465 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_qualName_in_importFrom1467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_131_in_importAs1495 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_qualName_in_importAs1497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtImport_in_importList1523 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000006L});
    public static final BitSet FOLLOW_stmtImport_in_importList1526 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000006L});
    public static final BitSet FOLLOW_132_in_meta1564 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L,0x0000000000000240L});
    public static final BitSet FOLLOW_braceOpen_in_meta1573 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0xFF80000000000020L});
    public static final BitSet FOLLOW_metaFormalParameters_in_meta1575 = new BitSet(new long[]{0x0000000000000000L,0xB800100000006000L,0xFFE000001B000091L});
    public static final BitSet FOLLOW_braceClose_in_meta1577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_metaFormalParameter_in_metaFormalParameters1602 = new BitSet(new long[]{0x0000000000000002L,0x4000000000000000L});
    public static final BitSet FOLLOW_126_in_metaFormalParameters1606 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0xFF80000000000020L});
    public static final BitSet FOLLOW_metaFormalParameter_in_metaFormalParameters1608 = new BitSet(new long[]{0x0000000000000002L,0x4000000000000000L});
    public static final BitSet FOLLOW_metaFormalParameterType_in_metaFormalParameter1631 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_IDENT_in_metaFormalParameter1633 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});
    public static final BitSet FOLLOW_ASSIGN_in_metaFormalParameter1636 = new BitSet(new long[]{0x0000000000000000L,0x00000E0000074000L,0xFF80000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_metaArgument_in_metaFormalParameter1638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_133_in_metaFormalParameterType1667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_builtinType_in_metaFormalParameterType1674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_134_in_metaArguments1687 = new BitSet(new long[]{0x0000000000000000L,0x00000E0000074000L,0xFF80000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_metaArgument_in_metaArguments1689 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_126_in_metaArguments1693 = new BitSet(new long[]{0x0000000000000000L,0x00000E0000074000L,0xFF80000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_metaArgument_in_metaArguments1695 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_135_in_metaArguments1699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_134_in_metaArguments1715 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_135_in_metaArguments1717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numLit_in_metaArgument1746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolLit_in_metaArgument1752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_metaArgument1758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_in_metaArgument1764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeNameScalar_in_metaArgument1769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeNameScalar_in_typeName1783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_builtinType_in_typeNameScalar1797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_userTypeName_in_typeNameScalar1802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qualName_in_userTypeName1812 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_metaArguments_in_userTypeName1814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qualName_in_userTypeName1829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_meta_in_unitTypeDefinition1862 = new BitSet(new long[]{0x0000000000000000L,0xB800000000000000L,0x0000000000000011L});
    public static final BitSet FOLLOW_moduleDefinition_in_unitTypeDefinition1884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classDefinition_in_unitTypeDefinition1905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_protocolDefinition_in_unitTypeDefinition1922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compositionDefinition_in_unitTypeDefinition1940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumDefinition_in_unitTypeDefinition1958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_136_in_extendsClause1983 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_IDENT_in_extendsClause1986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_137_in_implementsClause2005 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_IDENT_in_implementsClause2008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NL_in_braceClose2028 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L,0x0000000000000080L});
    public static final BitSet FOLLOW_135_in_braceClose2033 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_NL_in_braceClose2037 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_NL_in_braceCloseAtEOF2061 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L,0x0000000000000080L});
    public static final BitSet FOLLOW_135_in_braceCloseAtEOF2066 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_NL_in_braceCloseAtEOF2070 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_NL_in_braceOpen2095 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L,0x0000000000000040L});
    public static final BitSet FOLLOW_134_in_braceOpen2100 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_NL_in_braceOpen2104 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_set_in_equalityOp0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_relationalOp0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_shiftOp0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_incDecOp0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_addSubOp0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_assignOp0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_multDivModOp0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LOG_NOT_in_logicalNotOp2281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BIT_NOT_in_bitwiseNotOp2292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_exprList2303 = new BitSet(new long[]{0x0000000000000002L,0x4000000000000000L});
    public static final BitSet FOLLOW_126_in_exprList2306 = new BitSet(new long[]{0x0000000000000000L,0x00001E6005874000L,0x00000000A3000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_expr_in_exprList2308 = new BitSet(new long[]{0x0000000000000002L,0x4000000000000000L});
    public static final BitSet FOLLOW_exprLogicalOr_in_expr2339 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_145_in_expr2341 = new BitSet(new long[]{0x0000000000000000L,0x00001E6005874000L,0x00000000A3000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_expr_in_expr2343 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_146_in_expr2345 = new BitSet(new long[]{0x0000000000000000L,0x00001E6005874000L,0x00000000A3000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_expr_in_expr2347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exprLogicalOr_in_expr2364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exprLogicalAnd_in_exprLogicalOr2382 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_147_in_exprLogicalOr2396 = new BitSet(new long[]{0x0000000000000000L,0x00001E6005874000L,0x00000000A3000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_exprLogicalAnd_in_exprLogicalOr2398 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_exprBitwiseOr_in_exprLogicalAnd2431 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_148_in_exprLogicalAnd2443 = new BitSet(new long[]{0x0000000000000000L,0x00001E6005874000L,0x00000000A3000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_exprBitwiseOr_in_exprLogicalAnd2445 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_exprBitwiseXor_in_exprBitwiseOr2476 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_149_in_exprBitwiseOr2488 = new BitSet(new long[]{0x0000000000000000L,0x00001E6005874000L,0x00000000A3000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_exprBitwiseXor_in_exprBitwiseOr2490 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_exprBitwiseAnd_in_exprBitwiseXor2520 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_150_in_exprBitwiseXor2532 = new BitSet(new long[]{0x0000000000000000L,0x00001E6005874000L,0x00000000A3000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_exprBitwiseAnd_in_exprBitwiseXor2534 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_exprEquality_in_exprBitwiseAnd2564 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_151_in_exprBitwiseAnd2576 = new BitSet(new long[]{0x0000000000000000L,0x00001E6005874000L,0x00000000A3000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_exprEquality_in_exprBitwiseAnd2578 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_exprRelational_in_exprEquality2608 = new BitSet(new long[]{0x0000000000000002L,0x0000000000180000L});
    public static final BitSet FOLLOW_equalityOp_in_exprEquality2621 = new BitSet(new long[]{0x0000000000000000L,0x00001E6005874000L,0x00000000A3000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_exprRelational_in_exprEquality2623 = new BitSet(new long[]{0x0000000000000002L,0x0000000000180000L});
    public static final BitSet FOLLOW_exprShift_in_exprRelational2653 = new BitSet(new long[]{0x0000000000000002L,0x0000000000600000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_relationalOp_in_exprRelational2666 = new BitSet(new long[]{0x0000000000000000L,0x00001E6005874000L,0x00000000A3000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_exprShift_in_exprRelational2668 = new BitSet(new long[]{0x0000000000000002L,0x0000000000600000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_exprAddSub_in_exprShift2699 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000003000L});
    public static final BitSet FOLLOW_shiftOp_in_exprShift2712 = new BitSet(new long[]{0x0000000000000000L,0x00001E6005874000L,0x00000000A3000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_exprAddSub_in_exprShift2715 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000003000L});
    public static final BitSet FOLLOW_exprMultDiv_in_exprAddSub2746 = new BitSet(new long[]{0x0000000000000002L,0x0000000006000000L});
    public static final BitSet FOLLOW_addSubOp_in_exprAddSub2758 = new BitSet(new long[]{0x0000000000000000L,0x00001E6005874000L,0x00000000A3000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_exprMultDiv_in_exprAddSub2760 = new BitSet(new long[]{0x0000000000000002L,0x0000000006000000L});
    public static final BitSet FOLLOW_exprUnary_in_exprMultDiv2793 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x000000000001C000L});
    public static final BitSet FOLLOW_multDivModOp_in_exprMultDiv2805 = new BitSet(new long[]{0x0000000000000000L,0x00001E6005874000L,0x00000000A3000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_exprUnary_in_exprMultDiv2807 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x000000000001C000L});
    public static final BitSet FOLLOW_152_in_exprNew2836 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L,0xFF80000000000000L});
    public static final BitSet FOLLOW_typeName_in_exprNew2838 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_fcnArgumentList_in_exprNew2840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitiveLit_in_exprUnary2860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_injectionCode_in_exprUnary2865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayLit_in_exprUnary2870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicalNotOp_in_exprUnary2888 = new BitSet(new long[]{0x0000000000000000L,0x00001E6005874000L,0x00000000A3000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_expr_in_exprUnary2890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bitwiseNotOp_in_exprUnary2908 = new BitSet(new long[]{0x0000000000000000L,0x00001E6005874000L,0x00000000A3000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_expr_in_exprUnary2910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_153_in_exprUnary2928 = new BitSet(new long[]{0x0000000000000000L,0x00001E6005874000L,0x00000000A3000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_expr_in_exprUnary2930 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_154_in_exprUnary2932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_exprUnary2948 = new BitSet(new long[]{0x0000000000000000L,0x00001E6005874000L,0x00000000A3000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_expr_in_exprUnary2950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varOrFcnOrArray_in_exprUnary2969 = new BitSet(new long[]{0x0000000000000000L,0x0000000001800000L});
    public static final BitSet FOLLOW_incDecOp_in_exprUnary2971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varOrFcnOrArray_in_exprUnary2986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_incDecOp_in_exprUnary2991 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L,0x0000000021000000L});
    public static final BitSet FOLLOW_varOrFcnOrArray_in_exprUnary2993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exprNew_in_exprUnary3008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_155_in_fcnDefinition3028 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L,0xFF8000001A000000L});
    public static final BitSet FOLLOW_156_in_fcnDefinition3039 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L,0xFF8000001A000000L});
    public static final BitSet FOLLOW_fcnType_fcnName_in_fcnDefinition3049 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_fcnFormalParameterList_in_fcnDefinition3051 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L,0x0000000000000240L});
    public static final BitSet FOLLOW_fcnBody_in_fcnDefinition3053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_155_in_fcnDefinitionHost3089 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L,0xFF8000001A000000L});
    public static final BitSet FOLLOW_156_in_fcnDefinitionHost3094 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L,0xFF8000001A000000L});
    public static final BitSet FOLLOW_fcnType_fcnName_in_fcnDefinitionHost3105 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_fcnFormalParameterList_in_fcnDefinitionHost3108 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L,0x0000000000000240L});
    public static final BitSet FOLLOW_fcnBody_in_fcnDefinitionHost3110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_155_in_fcnAttr3147 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_156_in_fcnAttr3158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_braceOpen_in_fcnBody3174 = new BitSet(new long[]{0x0000000000000000L,0xB8001E6005876000L,0xFFF397C6BB0002D1L,0x0000000000000007L});
    public static final BitSet FOLLOW_stmts_in_fcnBody3177 = new BitSet(new long[]{0x0000000000000000L,0xB800100000006000L,0xFFE000001B000091L});
    public static final BitSet FOLLOW_braceClose_in_fcnBody3181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_155_in_fcnDeclaration3213 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L,0xFF8000001A000000L});
    public static final BitSet FOLLOW_156_in_fcnDeclaration3224 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L,0xFF8000001A000000L});
    public static final BitSet FOLLOW_fcnType_fcnName_in_fcnDeclaration3234 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_fcnFormalParameterList_in_fcnDeclaration3237 = new BitSet(new long[]{0x0000000000000000L,0x0000010000002000L});
    public static final BitSet FOLLOW_delim_in_fcnDeclaration3240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeName_in_fcnType_fcnName3267 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_qualName_in_fcnType_fcnName3269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeName_in_fcnType_fcnName3303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qualName_in_fcnType_fcnName3336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fcnTypes_fcnName_in_fcnType_fcnName3391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_153_in_fcnTypes_fcnName3402 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L,0xFF80000000000000L});
    public static final BitSet FOLLOW_fcnTypes_in_fcnTypes_fcnName3404 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_154_in_fcnTypes_fcnName3406 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_qualName_in_fcnTypes_fcnName3408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeName_in_fcnTypes3429 = new BitSet(new long[]{0x0000000000000002L,0x4000000000000000L});
    public static final BitSet FOLLOW_126_in_fcnTypes3432 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L,0xFF80000000000000L});
    public static final BitSet FOLLOW_typeName_in_fcnTypes3434 = new BitSet(new long[]{0x0000000000000002L,0x4000000000000000L});
    public static final BitSet FOLLOW_153_in_fcnFormalParameterList3455 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L,0xFF80000004000000L});
    public static final BitSet FOLLOW_fcnFormalParameters_in_fcnFormalParameterList3457 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_154_in_fcnFormalParameterList3459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fcnFormalParameter_in_fcnFormalParameters3473 = new BitSet(new long[]{0x0000000000000002L,0x4000000000000000L});
    public static final BitSet FOLLOW_126_in_fcnFormalParameters3476 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L,0xFF80000000000000L});
    public static final BitSet FOLLOW_fcnFormalParameter_in_fcnFormalParameters3478 = new BitSet(new long[]{0x0000000000000002L,0x4000000000000000L});
    public static final BitSet FOLLOW_typeName_in_fcnFormalParameter3513 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_IDENT_in_fcnFormalParameter3515 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});
    public static final BitSet FOLLOW_ASSIGN_in_fcnFormalParameter3519 = new BitSet(new long[]{0x0000000000000000L,0x00001E6005874000L,0x00000000A3000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_expr_in_fcnFormalParameter3521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_153_in_fcnArgumentList3552 = new BitSet(new long[]{0x0000000000000000L,0x00001E6005874000L,0x00000000A3000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_fcnArguments_in_fcnArgumentList3554 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_154_in_fcnArgumentList3556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exprList_in_fcnArguments3570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_152_in_varOrFcnOrArray3586 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L,0xFF80000000000000L});
    public static final BitSet FOLLOW_typeName_in_varOrFcnOrArray3588 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_fcnArgumentList_in_varOrFcnOrArray3590 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x00000000C0000000L});
    public static final BitSet FOLLOW_fieldOrArrayAccess_in_varOrFcnOrArray3592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_157_in_varOrFcnOrArray3633 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_IDENT_in_varOrFcnOrArray3635 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_fcnArgumentList_in_varOrFcnOrArray3637 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x00000000C0000000L});
    public static final BitSet FOLLOW_fieldOrArrayAccess_in_varOrFcnOrArray3639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_157_in_varOrFcnOrArray3708 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_IDENT_in_varOrFcnOrArray3714 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x00000000C0000000L});
    public static final BitSet FOLLOW_fieldOrArrayAccess_in_varOrFcnOrArray3716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_157_in_varOrFcnOrArray3764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qualName_in_varOrFcnOrArray3797 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_fcnArgumentList_in_varOrFcnOrArray3799 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x00000000C0000000L});
    public static final BitSet FOLLOW_fieldOrArrayAccess_in_varOrFcnOrArray3801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qualName_in_varOrFcnOrArray3842 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x00000000C0000000L});
    public static final BitSet FOLLOW_fieldOrArrayAccess_in_varOrFcnOrArray3844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fieldAccess_in_fieldOrArrayAccess3858 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x00000000C0000000L});
    public static final BitSet FOLLOW_arrayAccess_in_fieldOrArrayAccess3862 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x00000000C0000000L});
    public static final BitSet FOLLOW_158_in_fieldAccess3884 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_IDENT_in_fieldAccess3890 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_fcnArgumentList_in_fieldAccess3892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_158_in_fieldAccess3918 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_IDENT_in_fieldAccess3924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_159_in_arrayAccess3945 = new BitSet(new long[]{0x0000000000000000L,0x00001E6005874000L,0x00000001A3000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_exprList_in_arrayAccess3948 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_160_in_arrayAccess3952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_braceOpen_in_stmtBlock3973 = new BitSet(new long[]{0x0000000000000000L,0xB8001E6005876000L,0xFFF397C6BB0002D1L,0x0000000000000007L});
    public static final BitSet FOLLOW_stmts_in_stmtBlock3975 = new BitSet(new long[]{0x0000000000000000L,0xB800100000006000L,0xFFE000001B000091L});
    public static final BitSet FOLLOW_braceClose_in_stmtBlock3977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmt_in_stmts3997 = new BitSet(new long[]{0x0000000000000002L,0x00001E6005876000L,0xFFF397C6B3000240L,0x0000000000000007L});
    public static final BitSet FOLLOW_NL_in_stmts4015 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_varDeclaration_in_stmt4032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtAssign_in_stmt4038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtAssert_in_stmt4043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtBind_in_stmt4048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtBlock_in_stmt4054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtPrint_in_stmt4059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtReturn_in_stmt4064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtBreak_in_stmt4069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtContinue_in_stmt4075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtForEach_in_stmt4081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtFor_in_stmt4087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtSwitch_in_stmt4092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtDoWhile_in_stmt4098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtIf_in_stmt4103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtProvided_in_stmt4108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtWhile_in_stmt4113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtInjection_in_stmt4119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_stmt4124 = new BitSet(new long[]{0x0000000000000000L,0x0000010000002000L});
    public static final BitSet FOLLOW_delim_in_stmt4126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varOrFcnOrArray_in_stmtAssign4136 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_ASSIGN_in_stmtAssign4138 = new BitSet(new long[]{0x0000000000000000L,0x00001E6005874000L,0x00000000A3000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_expr_in_stmtAssign4140 = new BitSet(new long[]{0x0000000000000000L,0x0000010000002000L});
    public static final BitSet FOLLOW_delim_in_stmtAssign4142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_injectionCode_in_stmtAssign4165 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_ASSIGN_in_stmtAssign4167 = new BitSet(new long[]{0x0000000000000000L,0x00001E6005874000L,0x00000000A3000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_expr_in_stmtAssign4169 = new BitSet(new long[]{0x0000000000000000L,0x0000010000002000L});
    public static final BitSet FOLLOW_delim_in_stmtAssign4171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varOrFcnOrArray_in_stmtAssign4194 = new BitSet(new long[]{0x0000000000000000L,0x0000001FF8000000L});
    public static final BitSet FOLLOW_assignOp_in_stmtAssign4196 = new BitSet(new long[]{0x0000000000000000L,0x00001E6005874000L,0x00000000A3000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_expr_in_stmtAssign4198 = new BitSet(new long[]{0x0000000000000000L,0x0000010000002000L});
    public static final BitSet FOLLOW_delim_in_stmtAssign4201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_injectionCode_in_stmtAssign4224 = new BitSet(new long[]{0x0000000000000000L,0x0000001FF8000000L});
    public static final BitSet FOLLOW_assignOp_in_stmtAssign4226 = new BitSet(new long[]{0x0000000000000000L,0x00001E6005874000L,0x00000000A3000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_expr_in_stmtAssign4228 = new BitSet(new long[]{0x0000000000000000L,0x0000010000002000L});
    public static final BitSet FOLLOW_delim_in_stmtAssign4230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_161_in_stmtAssert4258 = new BitSet(new long[]{0x0000000000000000L,0x00001F6005876000L,0x00000000A3000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_exprList_in_stmtAssert4260 = new BitSet(new long[]{0x0000000000000000L,0x0000010000002000L});
    public static final BitSet FOLLOW_delim_in_stmtAssert4262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varOrFcnOrArray_in_stmtBind4280 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_BIND_in_stmtBind4282 = new BitSet(new long[]{0x0000000000000000L,0x00001E6005874000L,0x00000000A3000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_expr_in_stmtBind4285 = new BitSet(new long[]{0x0000000000000000L,0x0000010000002000L});
    public static final BitSet FOLLOW_delim_in_stmtBind4288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_162_in_stmtPrint4310 = new BitSet(new long[]{0x0000000000000000L,0x00001E6005874000L,0x00000038A3000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_stmtPrintTarget_in_stmtPrint4313 = new BitSet(new long[]{0x0000000000000000L,0x00001E6005874000L,0x00000000A3000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_exprList_in_stmtPrint4317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_stmtPrintTarget4341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_166_in_stmtReturn4363 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_153_in_stmtReturn4366 = new BitSet(new long[]{0x0000000000000000L,0x00001E6005874000L,0x00000000A3000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_expr_in_stmtReturn4370 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_126_in_stmtReturn4373 = new BitSet(new long[]{0x0000000000000000L,0x00001E6005874000L,0x00000000A3000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_expr_in_stmtReturn4375 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_154_in_stmtReturn4381 = new BitSet(new long[]{0x0000000000000000L,0x0000010000002000L});
    public static final BitSet FOLLOW_delim_in_stmtReturn4384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_166_in_stmtReturn4398 = new BitSet(new long[]{0x0000000000000000L,0x00001E6005874000L,0x00000000A3000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_expr_in_stmtReturn4402 = new BitSet(new long[]{0x0000000000000000L,0x0000010000002000L});
    public static final BitSet FOLLOW_delim_in_stmtReturn4406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_167_in_stmtBreak4424 = new BitSet(new long[]{0x0000000000000000L,0x0000010000002000L});
    public static final BitSet FOLLOW_delim_in_stmtBreak4426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_168_in_stmtContinue4442 = new BitSet(new long[]{0x0000000000000000L,0x0000010000002000L});
    public static final BitSet FOLLOW_delim_in_stmtContinue4444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_169_in_stmtFor4465 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_153_in_stmtFor4467 = new BitSet(new long[]{0x0000000000000000L,0x0000110000004000L,0xFF80000021000000L});
    public static final BitSet FOLLOW_stmtForInit_in_stmtFor4469 = new BitSet(new long[]{0x0000000000000000L,0x00001F6005874000L,0x00000000A3000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_stmtForCond_in_stmtFor4471 = new BitSet(new long[]{0x0000000000000000L,0x00001E6005874000L,0x00000000A7000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_stmtForNext_in_stmtFor4473 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_154_in_stmtFor4475 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L,0x0000000000000240L});
    public static final BitSet FOLLOW_stmtBlock_in_stmtFor4477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMI_in_stmtForCond4521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_stmtForCond4546 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_SEMI_in_stmtForCond4548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMI_in_stmtForInit4571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeName_in_stmtForInit4597 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_IDENT_in_stmtForInit4599 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_ASSIGN_in_stmtForInit4601 = new BitSet(new long[]{0x0000000000000000L,0x00001E6005874000L,0x00000000A3000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_expr_in_stmtForInit4603 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_SEMI_in_stmtForInit4605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtAssign_in_stmtForInit4642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_stmtForNext4686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_170_in_stmtForEach4699 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_153_in_stmtForEach4701 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_IDENT_in_stmtForEach4703 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_171_in_stmtForEach4705 = new BitSet(new long[]{0x0000000000000000L,0x00001E6005874000L,0x00000000A3000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_expr_in_stmtForEach4707 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_154_in_stmtForEach4709 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L,0x0000000000000240L});
    public static final BitSet FOLLOW_stmtBlock_in_stmtForEach4711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_172_in_stmtSwitch4737 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_153_in_stmtSwitch4739 = new BitSet(new long[]{0x0000000000000000L,0x00001E6005874000L,0x00000000A3000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_expr_in_stmtSwitch4741 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_154_in_stmtSwitch4743 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L,0x0000000000000240L});
    public static final BitSet FOLLOW_braceOpen_in_stmtSwitch4745 = new BitSet(new long[]{0x0000000000000000L,0xB800100000006000L,0xFFE060001B000091L});
    public static final BitSet FOLLOW_stmtsCase_in_stmtSwitch4747 = new BitSet(new long[]{0x0000000000000000L,0xB800100000006000L,0xFFE020001B000091L});
    public static final BitSet FOLLOW_stmtDefault_in_stmtSwitch4749 = new BitSet(new long[]{0x0000000000000000L,0xB800100000006000L,0xFFE000001B000091L});
    public static final BitSet FOLLOW_braceClose_in_stmtSwitch4752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtCase_in_stmtsCase4776 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_173_in_stmtDefault4796 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_146_in_stmtDefault4798 = new BitSet(new long[]{0x0000000000000000L,0x00001E6005876000L,0xFFF397C6B3000240L,0x0000000000000007L});
    public static final BitSet FOLLOW_NL_in_stmtDefault4800 = new BitSet(new long[]{0x0000000000000000L,0x00001E6005876000L,0xFFF397C6B3000240L,0x0000000000000007L});
    public static final BitSet FOLLOW_stmts_in_stmtDefault4803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_174_in_stmtCase4821 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_INT_LIT_in_stmtCase4824 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_146_in_stmtCase4827 = new BitSet(new long[]{0x0000000000000000L,0x00001E6005876000L,0xFFF397C6B3000240L,0x0000000000000007L});
    public static final BitSet FOLLOW_NL_in_stmtCase4829 = new BitSet(new long[]{0x0000000000000000L,0x00001E6005876000L,0xFFF397C6B3000240L,0x0000000000000007L});
    public static final BitSet FOLLOW_stmts_in_stmtCase4832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_175_in_stmtDoWhile4852 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L,0x0000000000000240L});
    public static final BitSet FOLLOW_stmtBlock_in_stmtDoWhile4854 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_176_in_stmtDoWhile4856 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_153_in_stmtDoWhile4858 = new BitSet(new long[]{0x0000000000000000L,0x00001E6005874000L,0x00000000A3000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_expr_in_stmtDoWhile4860 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_154_in_stmtDoWhile4862 = new BitSet(new long[]{0x0000000000000000L,0x0000010000002000L});
    public static final BitSet FOLLOW_delim_in_stmtDoWhile4864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_177_in_stmtIf4885 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_stmtIfBlock_in_stmtIf4887 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000C000000000000L});
    public static final BitSet FOLLOW_stmtsElif_in_stmtIf4889 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_stmtElse_in_stmtIf4891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_153_in_stmtIfBlock4915 = new BitSet(new long[]{0x0000000000000000L,0x00001E6005874000L,0x00000000A3000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_expr_in_stmtIfBlock4917 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_154_in_stmtIfBlock4919 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L,0x0000000000000240L});
    public static final BitSet FOLLOW_stmtBlock_in_stmtIfBlock4921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtElif_in_stmtsElif4937 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_178_in_stmtElif4957 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_stmtIfBlock_in_stmtElif4959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_179_in_stmtElse4977 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L,0x0000000000000240L});
    public static final BitSet FOLLOW_stmtBlock_in_stmtElse4979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_180_in_stmtProvided4993 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_153_in_stmtProvided4995 = new BitSet(new long[]{0x0000000000000000L,0x00001E6005874000L,0x00000000A3000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_expr_in_stmtProvided4997 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_154_in_stmtProvided4999 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L,0x0000000000000240L});
    public static final BitSet FOLLOW_stmtBlock_in_stmtProvided5001 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_stmtElse_in_stmtProvided5004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_176_in_stmtWhile5031 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_153_in_stmtWhile5033 = new BitSet(new long[]{0x0000000000000000L,0x00001E6005874000L,0x00000000A3000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_expr_in_stmtWhile5035 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_154_in_stmtWhile5036 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L,0x0000000000000240L});
    public static final BitSet FOLLOW_stmtBlock_in_stmtWhile5038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varAttr_in_varDeclaration5065 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L,0xFFE0000011000000L});
    public static final BitSet FOLLOW_varDecl_in_varDeclaration5067 = new BitSet(new long[]{0x0000000000000000L,0x0000010000002000L});
    public static final BitSet FOLLOW_delim_in_varDeclaration5069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_181_in_varAttr5088 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0060000010000000L});
    public static final BitSet FOLLOW_182_in_varAttr5097 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0060000010000000L});
    public static final BitSet FOLLOW_156_in_varAttr5107 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0060000010000000L});
    public static final BitSet FOLLOW_varDeclList_in_varDecl5157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varArray_in_varDecl5174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varFcnRef_in_varDecl5190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDeclList_in_varDecl5206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_152_in_varDecl5212 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L,0xFF80000000000000L});
    public static final BitSet FOLLOW_typeName_in_varDecl5214 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_IDENT_in_varDecl5216 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_fcnArgumentList_in_varDecl5218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeName_in_varFcnRef5262 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_fcnRefTypeList_in_varFcnRef5264 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_IDENT_in_varFcnRef5266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_153_in_fcnRefTypeList5291 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L,0xFF80000004000000L});
    public static final BitSet FOLLOW_fcnRefTypes_in_fcnRefTypeList5293 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_154_in_fcnRefTypeList5295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeName_in_fcnRefTypes5309 = new BitSet(new long[]{0x0000000000000002L,0x4000000000000000L});
    public static final BitSet FOLLOW_126_in_fcnRefTypes5312 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L,0xFF80000000000000L});
    public static final BitSet FOLLOW_typeName_in_fcnRefTypes5314 = new BitSet(new long[]{0x0000000000000002L,0x4000000000000000L});
    public static final BitSet FOLLOW_typeName_in_varArray5347 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_IDENT_in_varArray5349 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_varArraySpec_in_varArray5351 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});
    public static final BitSet FOLLOW_ASSIGN_in_varArray5354 = new BitSet(new long[]{0x0000000000000000L,0x00001E6005874000L,0x00000000A3000040L,0x0000000000000007L});
    public static final BitSet FOLLOW_initializer_in_varArray5356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_159_in_varArraySpec5387 = new BitSet(new long[]{0x0000000000000000L,0x00001E6005874000L,0x00000001A3000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_varDim_in_varArraySpec5389 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_160_in_varArraySpec5391 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_expr_in_varDim5415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_initializer5435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_134_in_initializer5441 = new BitSet(new long[]{0x0000000000000000L,0x00001E6005874000L,0x00000000A3000040L,0x0000000000000007L});
    public static final BitSet FOLLOW_initializer_list_in_initializer5443 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_126_in_initializer5445 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_135_in_initializer5448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_initializer_in_initializer_list5462 = new BitSet(new long[]{0x0000000000000002L,0x4000000000000000L});
    public static final BitSet FOLLOW_126_in_initializer_list5465 = new BitSet(new long[]{0x0000000000000000L,0x00001E6005874000L,0x00000000A3000040L,0x0000000000000007L});
    public static final BitSet FOLLOW_initializer_in_initializer_list5467 = new BitSet(new long[]{0x0000000000000002L,0x4000000000000000L});
    public static final BitSet FOLLOW_typeName_in_varDeclList5496 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L,0xFF80000000000000L});
    public static final BitSet FOLLOW_varDeclList_in_varDeclList5501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varInit_in_varDeclList5506 = new BitSet(new long[]{0x0000000000000002L,0x4000000000000000L});
    public static final BitSet FOLLOW_126_in_varDeclList5509 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L,0xFF80000000000000L});
    public static final BitSet FOLLOW_varInit_in_varDeclList5512 = new BitSet(new long[]{0x0000000000000002L,0x4000000000000000L});
    public static final BitSet FOLLOW_IDENT_in_varInit5530 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_BIND_in_varInit5532 = new BitSet(new long[]{0x0000000000000000L,0x00001E6005874000L,0x00000000A3000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_expr_in_varInit5534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_varInit5559 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});
    public static final BitSet FOLLOW_ASSIGN_in_varInit5562 = new BitSet(new long[]{0x0000000000000000L,0x00001E6005874000L,0x00000000A3000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_expr_in_varInit5564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_builtinType0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_qualName5701 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_qualNameList_in_qualName5704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_158_in_qualNameList5736 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_IDENT_in_qualNameList5751 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_159_in_arrayLit5780 = new BitSet(new long[]{0x0000000000000000L,0x00000E0000074000L,0x0000000100000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_arrayLitList_in_arrayLit5782 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_160_in_arrayLit5784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayLitElem_in_arrayLitList5802 = new BitSet(new long[]{0x0000000000000002L,0x4000000000000000L});
    public static final BitSet FOLLOW_126_in_arrayLitList5805 = new BitSet(new long[]{0x0000000000000000L,0x00000E0000074000L,0x0000000000000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_arrayLitElem_in_arrayLitList5807 = new BitSet(new long[]{0x0000000000000002L,0x4000000000000000L});
    public static final BitSet FOLLOW_primitiveLit_in_arrayLitElem5831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_namedConstant_in_arrayLitElem5835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qualName_in_namedConstant5845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_boolLit5864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_194_in_nullLit5898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_LIT_in_numLit5935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OCT_LIT_in_numLit5958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REAL_LIT_in_numLit5981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HEX_LIT_in_numLit6002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolLit_in_primitiveLit6048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numLit_in_primitiveLit6074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nullLit_in_primitiveLit6101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_primitiveLit6127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_in_primitiveLit6169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INJECT_in_stmtInjection6210 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_NL_in_stmtInjection6212 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_INJECT_in_injectionCode6231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMI_in_delim6251 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_NL_in_delim6255 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_NL_in_delim6266 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_NL_in_delim6290 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_stmtInjection_in_synpred2_pol698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtExport_in_synpred6_pol799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fcnDefinition_in_synpred9_pol898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDeclaration_in_synpred11_pol919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fcnDefinition_in_synpred15_pol1021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDeclaration_in_synpred16_pol1030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_delim_in_synpred20_pol1162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_synpred21_pol1155 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_ASSIGN_in_synpred21_pol1157 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_INT_LIT_in_synpred21_pol1159 = new BitSet(new long[]{0x0000000000000000L,0x0000010000002000L});
    public static final BitSet FOLLOW_delim_in_synpred21_pol1162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_delim_in_synpred22_pol1184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fcnDefinitionHost_in_synpred30_pol1358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDeclaration_in_synpred32_pol1374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_importAs_in_synpred34_pol1426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_134_in_synpred43_pol1687 = new BitSet(new long[]{0x0000000000000000L,0x00000E0000074000L,0xFF80000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_metaArgument_in_synpred43_pol1689 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_126_in_synpred43_pol1693 = new BitSet(new long[]{0x0000000000000000L,0x00000E0000074000L,0xFF80000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_metaArgument_in_synpred43_pol1695 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_135_in_synpred43_pol1699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qualName_in_synpred49_pol1812 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_metaArguments_in_synpred49_pol1814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_124_in_synpred51_pol1879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_123_in_synpred52_pol1899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_127_in_synpred53_pol1917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_128_in_synpred54_pol1935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_125_in_synpred55_pol1953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NL_in_synpred57_pol2037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NL_in_synpred61_pol2104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_126_in_synpred80_pol2306 = new BitSet(new long[]{0x0000000000000000L,0x00001E6005874000L,0x00000000A3000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_expr_in_synpred80_pol2308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_synpred81_pol2303 = new BitSet(new long[]{0x0000000000000002L,0x4000000000000000L});
    public static final BitSet FOLLOW_126_in_synpred81_pol2306 = new BitSet(new long[]{0x0000000000000000L,0x00001E6005874000L,0x00000000A3000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_expr_in_synpred81_pol2308 = new BitSet(new long[]{0x0000000000000002L,0x4000000000000000L});
    public static final BitSet FOLLOW_exprLogicalOr_in_synpred82_pol2339 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_145_in_synpred82_pol2341 = new BitSet(new long[]{0x0000000000000000L,0x00001E6005874000L,0x00000000A3000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_expr_in_synpred82_pol2343 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_146_in_synpred82_pol2345 = new BitSet(new long[]{0x0000000000000000L,0x00001E6005874000L,0x00000000A3000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_expr_in_synpred82_pol2347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_147_in_synpred83_pol2396 = new BitSet(new long[]{0x0000000000000000L,0x00001E6005874000L,0x00000000A3000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_exprLogicalAnd_in_synpred83_pol2398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_148_in_synpred84_pol2443 = new BitSet(new long[]{0x0000000000000000L,0x00001E6005874000L,0x00000000A3000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_exprBitwiseOr_in_synpred84_pol2445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_149_in_synpred85_pol2488 = new BitSet(new long[]{0x0000000000000000L,0x00001E6005874000L,0x00000000A3000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_exprBitwiseXor_in_synpred85_pol2490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_150_in_synpred86_pol2532 = new BitSet(new long[]{0x0000000000000000L,0x00001E6005874000L,0x00000000A3000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_exprBitwiseAnd_in_synpred86_pol2534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_151_in_synpred87_pol2576 = new BitSet(new long[]{0x0000000000000000L,0x00001E6005874000L,0x00000000A3000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_exprEquality_in_synpred87_pol2578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_equalityOp_in_synpred88_pol2621 = new BitSet(new long[]{0x0000000000000000L,0x00001E6005874000L,0x00000000A3000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_exprRelational_in_synpred88_pol2623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relationalOp_in_synpred89_pol2666 = new BitSet(new long[]{0x0000000000000000L,0x00001E6005874000L,0x00000000A3000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_exprShift_in_synpred89_pol2668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_shiftOp_in_synpred90_pol2712 = new BitSet(new long[]{0x0000000000000000L,0x00001E6005874000L,0x00000000A3000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_exprAddSub_in_synpred90_pol2715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_addSubOp_in_synpred91_pol2758 = new BitSet(new long[]{0x0000000000000000L,0x00001E6005874000L,0x00000000A3000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_exprMultDiv_in_synpred91_pol2760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multDivModOp_in_synpred92_pol2805 = new BitSet(new long[]{0x0000000000000000L,0x00001E6005874000L,0x00000000A3000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_exprUnary_in_synpred92_pol2807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varOrFcnOrArray_in_synpred100_pol2969 = new BitSet(new long[]{0x0000000000000000L,0x0000000001800000L});
    public static final BitSet FOLLOW_incDecOp_in_synpred100_pol2971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varOrFcnOrArray_in_synpred101_pol2986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeName_in_synpred111_pol3267 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_qualName_in_synpred111_pol3269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeName_in_synpred112_pol3303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qualName_in_synpred113_pol3336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_153_in_synpred115_pol3373 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L,0xFF80000000000000L});
    public static final BitSet FOLLOW_typeName_in_synpred115_pol3375 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_126_in_synpred115_pol3378 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L,0xFF80000000000000L});
    public static final BitSet FOLLOW_typeName_in_synpred115_pol3380 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_154_in_synpred115_pol3384 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_qualName_in_synpred115_pol3386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fieldOrArrayAccess_in_synpred120_pol3592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fieldOrArrayAccess_in_synpred122_pol3639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_157_in_synpred123_pol3633 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_IDENT_in_synpred123_pol3635 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_fcnArgumentList_in_synpred123_pol3637 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x00000000C0000000L});
    public static final BitSet FOLLOW_fieldOrArrayAccess_in_synpred123_pol3639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fieldOrArrayAccess_in_synpred124_pol3716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_157_in_synpred125_pol3708 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_IDENT_in_synpred125_pol3714 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x00000000C0000000L});
    public static final BitSet FOLLOW_fieldOrArrayAccess_in_synpred125_pol3716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_157_in_synpred126_pol3764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fieldOrArrayAccess_in_synpred127_pol3801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qualName_in_synpred128_pol3797 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_fcnArgumentList_in_synpred128_pol3799 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x00000000C0000000L});
    public static final BitSet FOLLOW_fieldOrArrayAccess_in_synpred128_pol3801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fieldOrArrayAccess_in_synpred129_pol3844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayAccess_in_synpred131_pol3862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_158_in_synpred132_pol3884 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_IDENT_in_synpred132_pol3890 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_fcnArgumentList_in_synpred132_pol3892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exprList_in_synpred133_pol3948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmt_in_synpred134_pol3997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmt_in_synpred135_pol3997 = new BitSet(new long[]{0x0000000000000002L,0x00001E6005876000L,0xFFF397C6B3000240L,0x0000000000000007L});
    public static final BitSet FOLLOW_NL_in_synpred136_pol4015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDeclaration_in_synpred137_pol4032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtAssign_in_synpred138_pol4038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtBind_in_synpred140_pol4048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtInjection_in_synpred153_pol4119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varOrFcnOrArray_in_synpred154_pol4136 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_ASSIGN_in_synpred154_pol4138 = new BitSet(new long[]{0x0000000000000000L,0x00001E6005874000L,0x00000000A3000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_expr_in_synpred154_pol4140 = new BitSet(new long[]{0x0000000000000000L,0x0000010000002000L});
    public static final BitSet FOLLOW_delim_in_synpred154_pol4142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_injectionCode_in_synpred155_pol4165 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_ASSIGN_in_synpred155_pol4167 = new BitSet(new long[]{0x0000000000000000L,0x00001E6005874000L,0x00000000A3000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_expr_in_synpred155_pol4169 = new BitSet(new long[]{0x0000000000000000L,0x0000010000002000L});
    public static final BitSet FOLLOW_delim_in_synpred155_pol4171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varOrFcnOrArray_in_synpred156_pol4194 = new BitSet(new long[]{0x0000000000000000L,0x0000001FF8000000L});
    public static final BitSet FOLLOW_assignOp_in_synpred156_pol4196 = new BitSet(new long[]{0x0000000000000000L,0x00001E6005874000L,0x00000000A3000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_expr_in_synpred156_pol4198 = new BitSet(new long[]{0x0000000000000000L,0x0000010000002000L});
    public static final BitSet FOLLOW_delim_in_synpred156_pol4201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_166_in_synpred161_pol4363 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_153_in_synpred161_pol4366 = new BitSet(new long[]{0x0000000000000000L,0x00001E6005874000L,0x00000000A3000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_expr_in_synpred161_pol4370 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_126_in_synpred161_pol4373 = new BitSet(new long[]{0x0000000000000000L,0x00001E6005874000L,0x00000000A3000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_expr_in_synpred161_pol4375 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_154_in_synpred161_pol4381 = new BitSet(new long[]{0x0000000000000000L,0x0000010000002000L});
    public static final BitSet FOLLOW_delim_in_synpred161_pol4384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeName_in_synpred164_pol4597 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_IDENT_in_synpred164_pol4599 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_ASSIGN_in_synpred164_pol4601 = new BitSet(new long[]{0x0000000000000000L,0x00001E6005874000L,0x00000000A3000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_expr_in_synpred164_pol4603 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_SEMI_in_synpred164_pol4605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NL_in_synpred168_pol4800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NL_in_synpred169_pol4829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeName_in_synpred178_pol5135 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_IDENT_in_synpred178_pol5137 = new BitSet(new long[]{0x0000000000000000L,0x4000008000008000L});
    public static final BitSet FOLLOW_set_in_synpred178_pol5140 = new BitSet(new long[]{0x0000000000000000L,0x00001E6005874000L,0x00000000A3000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_expr_in_synpred178_pol5148 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_126_in_synpred178_pol5152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeName_in_synpred179_pol5165 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_IDENT_in_synpred179_pol5167 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_159_in_synpred179_pol5169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeName_in_synpred180_pol5182 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_153_in_synpred180_pol5184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeName_in_synpred181_pol5199 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L,0xFF80000000000000L});
    public static final BitSet FOLLOW_varInit_in_synpred181_pol5201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_159_in_synpred185_pol5387 = new BitSet(new long[]{0x0000000000000000L,0x00001E6005874000L,0x00000001A3000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_varDim_in_synpred185_pol5389 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_160_in_synpred185_pol5391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_126_in_synpred189_pol5465 = new BitSet(new long[]{0x0000000000000000L,0x00001E6005874000L,0x00000000A3000040L,0x0000000000000007L});
    public static final BitSet FOLLOW_initializer_in_synpred189_pol5467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeName_in_synpred190_pol5496 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L,0xFF80000000000000L});
    public static final BitSet FOLLOW_varDeclList_in_synpred190_pol5501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_126_in_synpred191_pol5509 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L,0xFF80000000000000L});
    public static final BitSet FOLLOW_varInit_in_synpred191_pol5512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_synpred192_pol5530 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_BIND_in_synpred192_pol5532 = new BitSet(new long[]{0x0000000000000000L,0x00001E6005874000L,0x00000000A3000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_expr_in_synpred192_pol5534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qualNameList_in_synpred202_pol5704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_158_in_synpred203_pol5736 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_IDENT_in_synpred203_pol5751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NL_in_synpred215_pol6212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NL_in_synpred216_pol6255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMI_in_synpred217_pol6251 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_NL_in_synpred217_pol6255 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_NL_in_synpred218_pol6266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NL_in_synpred219_pol6266 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_NL_in_synpred221_pol6280 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L,0x0000000000000080L});
    public static final BitSet FOLLOW_135_in_synpred221_pol6284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NL_in_synpred222_pol6290 = new BitSet(new long[]{0x0000000000000002L});

}