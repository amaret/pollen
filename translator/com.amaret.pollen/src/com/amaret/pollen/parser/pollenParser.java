// $ANTLR 3.4 /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g 2012-08-22 19:10:54

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ADD_EQ", "ASSIGN", "BIND", "BITAND_EQ", "BITOR_EQ", "BITXOR_EQ", "BIT_NOT", "CHAR", "D", "DEC", "DELIM", "DIV_EQ", "D_ARG", "D_ARR", "D_ARR_DIM", "D_CLASS", "D_COMPOSITION", "D_CONST", "D_ENUM", "D_ENUMVAL", "D_FCN_CTOR", "D_FCN_DCL", "D_FCN_DEF", "D_FCN_REF", "D_FCN_TYP_NM", "D_FIELD", "D_FORMAL", "D_INSTANCE", "D_META", "D_META_ARGS", "D_MODULE", "D_PROTOCOL", "D_PROTOCOL_MEM", "D_VAR", "E", "EQ", "EXPORT", "E_ADDR", "E_BINARY", "E_CALL", "E_COND", "E_CONST", "E_DEREF", "E_EXPR", "E_HASH", "E_IDENT", "E_INDEX", "E_INJECT", "E_NEW", "E_NUMLIT", "E_PAREN", "E_QUEST", "E_SELF", "E_UNARY", "E_VEC", "FCNBODY", "GT_EQ", "H", "HEX_LIT", "HOST", "I", "IDENT", "IJ_BEG", "IJ_END", "ILLEGAL_CHARACTER", "INC", "INJECT", "INT_LIT", "LIST", "LOG_NOT", "LSHFT_EQ", "LT_EQ", "LU", "MINUS", "ML_COMMENT", "MODULE", "MOD_EQ", "MUL_EQ", "NIL", "NL", "NOT_EQ", "O", "OCT_LIT", "PLUS", "QNAME", "REAL_LIT", "RSHFT_EQ", "SEMI", "SL_COMMENT", "STRING", "SUB_EQ", "S_ASSERT", "S_ASSIGN", "S_BIND", "S_BLOCK", "S_BREAK", "S_CASE", "S_CONTINUE", "S_DECL", "S_DEFAULT", "S_DO_WHILE", "S_ELIF", "S_ELSE", "S_FOR", "S_FOREACH", "S_IF", "S_IMPORT", "S_PACKAGE", "S_PRINT", "S_PROVIDED", "S_RETURN", "S_SWITCH", "S_WHILE", "T_ARR", "T_FCN", "T_STD", "T_USER_TYPE", "UNIT", "WS", "'%'", "'&&'", "'&'", "'('", "')'", "'*'", "','", "'.'", "'/'", "':'", "'<'", "'<<'", "'>'", "'>>'", "'?'", "'@'", "'['", "']'", "'^'", "'as'", "'assert'", "'bool'", "'break'", "'byte'", "'case'", "'class'", "'composition'", "'const'", "'continue'", "'default'", "'do'", "'elif'", "'else'", "'enum'", "'err'", "'export'", "'extends'", "'false'", "'for'", "'foreach'", "'from'", "'host'", "'if'", "'implements'", "'import'", "'in'", "'int16'", "'int32'", "'int8'", "'log'", "'meta'", "'module'", "'new'", "'null'", "'out'", "'package'", "'print'", "'protocol'", "'provided'", "'public'", "'return'", "'string'", "'switch'", "'true'", "'type'", "'uint16'", "'uint32'", "'uint8'", "'volatile'", "'while'", "'{'", "'|'", "'||'", "'}'"
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
    public static final int E_DEREF=46;
    public static final int E_EXPR=47;
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


    public pollenParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public pollenParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
        this.state.ruleMemo = new HashMap[347+1];
         

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
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:198:1: unit : ( NL )* unitPackage -> ^( UNIT unitPackage ) ;
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

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:199:5: ( ( NL )* unitPackage -> ^( UNIT unitPackage ) )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:199:9: ( NL )* unitPackage
            {
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:199:9: ( NL )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==NL) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:199:10: NL
            	    {
            	    NL1=(Atom)match(input,NL,FOLLOW_NL_in_unit677); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_NL.add(NL1);


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            pushFollow(FOLLOW_unitPackage_in_unit681);
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
            // 199:29: -> ^( UNIT unitPackage )
            {
                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:199:32: ^( UNIT unitPackage )
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
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:201:1: unitPackage : stmtPackage importList ( stmtInjection )? ( unitTypeDefinition )? ( stmtInjection )? EOF ;
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

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:202:2: ( stmtPackage importList ( stmtInjection )? ( unitTypeDefinition )? ( stmtInjection )? EOF )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:202:5: stmtPackage importList ( stmtInjection )? ( unitTypeDefinition )? ( stmtInjection )? EOF
            {
            root_0 = (BaseNode)adaptor.nil();


            pushFollow(FOLLOW_stmtPackage_in_unitPackage707);
            stmtPackage3=stmtPackage();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, stmtPackage3.getTree());

            pushFollow(FOLLOW_importList_in_unitPackage713);
            importList4=importList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, importList4.getTree());

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:204:7: ( stmtInjection )?
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
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:204:8: stmtInjection
                    {
                    pushFollow(FOLLOW_stmtInjection_in_unitPackage722);
                    stmtInjection5=stmtInjection();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmtInjection5.getTree());

                    }
                    break;

            }


            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:205:7: ( unitTypeDefinition )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0 >= 148 && LA3_0 <= 149)||LA3_0==156||(LA3_0 >= 173 && LA3_0 <= 174)||LA3_0==180) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:205:8: unitTypeDefinition
                    {
                    pushFollow(FOLLOW_unitTypeDefinition_in_unitPackage733);
                    unitTypeDefinition6=unitTypeDefinition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, unitTypeDefinition6.getTree());

                    }
                    break;

            }


            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:206:7: ( stmtInjection )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==INJECT) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:206:8: stmtInjection
                    {
                    pushFollow(FOLLOW_stmtInjection_in_unitPackage744);
                    stmtInjection7=stmtInjection();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmtInjection7.getTree());

                    }
                    break;

            }


            EOF8=(Atom)match(input,EOF,FOLLOW_EOF_in_unitPackage754); if (state.failed) return retval;
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
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:209:1: stmtPackage : ( 'package' qualName delim -> ^( S_PACKAGE qualName ) | -> ^( S_PACKAGE ) );
    public final pollenParser.stmtPackage_return stmtPackage() throws RecognitionException {
        pollenParser.stmtPackage_return retval = new pollenParser.stmtPackage_return();
        retval.start = input.LT(1);

        int stmtPackage_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom string_literal9=null;
        pollenParser.qualName_return qualName10 =null;

        pollenParser.delim_return delim11 =null;


        BaseNode string_literal9_tree=null;
        RewriteRuleTokenStream stream_178=new RewriteRuleTokenStream(adaptor,"token 178");
        RewriteRuleSubtreeStream stream_qualName=new RewriteRuleSubtreeStream(adaptor,"rule qualName");
        RewriteRuleSubtreeStream stream_delim=new RewriteRuleSubtreeStream(adaptor,"rule delim");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:210:2: ( 'package' qualName delim -> ^( S_PACKAGE qualName ) | -> ^( S_PACKAGE ) )
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
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:210:4: 'package' qualName delim
                    {
                    string_literal9=(Atom)match(input,178,FOLLOW_178_in_stmtPackage764); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_178.add(string_literal9);


                    pushFollow(FOLLOW_qualName_in_stmtPackage766);
                    qualName10=qualName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_qualName.add(qualName10.getTree());

                    pushFollow(FOLLOW_delim_in_stmtPackage768);
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
                    // 210:29: -> ^( S_PACKAGE qualName )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:210:32: ^( S_PACKAGE qualName )
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
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:211:4: 
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
                    // 211:4: -> ^( S_PACKAGE )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:211:7: ^( S_PACKAGE )
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
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:213:1: stmtExport : 'export' ^ qualName delim ;
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

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:214:5: ( 'export' ^ qualName delim )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:214:9: 'export' ^ qualName delim
            {
            root_0 = (BaseNode)adaptor.nil();


            string_literal12=(Atom)match(input,158,FOLLOW_158_in_stmtExport800); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal12_tree = 
            (BaseNode)adaptor.create(string_literal12)
            ;
            root_0 = (BaseNode)adaptor.becomeRoot(string_literal12_tree, root_0);
            }

            pushFollow(FOLLOW_qualName_in_stmtExport803);
            qualName13=qualName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, qualName13.getTree());

            pushFollow(FOLLOW_delim_in_stmtExport805);
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
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:216:1: exportList : ( stmtExport )+ -> ^( LIST[\"LIST\"] ( stmtExport )+ ) ;
    public final pollenParser.exportList_return exportList() throws RecognitionException {
        pollenParser.exportList_return retval = new pollenParser.exportList_return();
        retval.start = input.LT(1);

        int exportList_StartIndex = input.index();

        BaseNode root_0 = null;

        pollenParser.stmtExport_return stmtExport15 =null;


        RewriteRuleSubtreeStream stream_stmtExport=new RewriteRuleSubtreeStream(adaptor,"rule stmtExport");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:217:5: ( ( stmtExport )+ -> ^( LIST[\"LIST\"] ( stmtExport )+ ) )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:217:9: ( stmtExport )+
            {
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:217:9: ( stmtExport )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==158) ) {
                    int LA6_1 = input.LA(2);

                    if ( (synpred6_pollen()) ) {
                        alt6=1;
                    }


                }


                switch (alt6) {
            	case 1 :
            	    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:217:9: stmtExport
            	    {
            	    pushFollow(FOLLOW_stmtExport_in_exportList823);
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
            // 218:6: -> ^( LIST[\"LIST\"] ( stmtExport )+ )
            {
                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:218:9: ^( LIST[\"LIST\"] ( stmtExport )+ )
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
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:220:1: classDefinition : 'class' classDef -> ^( D_CLASS classDef ) ;
    public final pollenParser.classDefinition_return classDefinition() throws RecognitionException {
        pollenParser.classDefinition_return retval = new pollenParser.classDefinition_return();
        retval.start = input.LT(1);

        int classDefinition_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom string_literal16=null;
        pollenParser.classDef_return classDef17 =null;


        BaseNode string_literal16_tree=null;
        RewriteRuleTokenStream stream_148=new RewriteRuleTokenStream(adaptor,"token 148");
        RewriteRuleSubtreeStream stream_classDef=new RewriteRuleSubtreeStream(adaptor,"rule classDef");

        	if (tl.size() > 1) { // nested class
        	  ti = new TypeInfo();
        	  tl.add(ti);		
        	}	

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:233:2: ( 'class' classDef -> ^( D_CLASS classDef ) )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:233:5: 'class' classDef
            {
            string_literal16=(Atom)match(input,148,FOLLOW_148_in_classDefinition869); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_148.add(string_literal16);


            pushFollow(FOLLOW_classDef_in_classDefinition871);
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
            // 233:22: -> ^( D_CLASS classDef )
            {
                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:233:25: ^( D_CLASS classDef )
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
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:235:1: classDef : IDENT ^ ( implementsClause )? braceOpen ( classFeature )* braceClose ;
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

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:236:2: ( IDENT ^ ( implementsClause )? braceOpen ( classFeature )* braceClose )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:236:4: IDENT ^ ( implementsClause )? braceOpen ( classFeature )* braceClose
            {
            root_0 = (BaseNode)adaptor.nil();


            IDENT18=(Atom)match(input,IDENT,FOLLOW_IDENT_in_classDef890); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENT18_tree = 
            (BaseNode)adaptor.create(IDENT18)
            ;
            root_0 = (BaseNode)adaptor.becomeRoot(IDENT18_tree, root_0);
            }

            if ( state.backtracking==0 ) { ti.setTypeName((IDENT18!=null?IDENT18.getText():null)); ti.setUnitFlags(EnumSet.of(Flags.CLASS));}

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:238:3: ( implementsClause )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==166) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:238:4: implementsClause
                    {
                    pushFollow(FOLLOW_implementsClause_in_classDef901);
                    implementsClause19=implementsClause();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, implementsClause19.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_braceOpen_in_classDef908);
            braceOpen20=braceOpen();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, braceOpen20.getTree());

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:239:13: ( classFeature )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==IDENT||LA8_0==INJECT||LA8_0==126||LA8_0==144||LA8_0==146||LA8_0==148||LA8_0==150||LA8_0==156||LA8_0==164||(LA8_0 >= 169 && LA8_0 <= 171)||LA8_0==175||LA8_0==182||LA8_0==184||(LA8_0 >= 188 && LA8_0 <= 191)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:239:14: classFeature
            	    {
            	    pushFollow(FOLLOW_classFeature_in_classDef911);
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


            pushFollow(FOLLOW_braceClose_in_classDef915);
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
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:242:1: classFeature : ( fcnDefinition | enumDefinition | varDeclaration | classDefinition | stmtInjection );
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

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:243:5: ( fcnDefinition | enumDefinition | varDeclaration | classDefinition | stmtInjection )
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
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:243:9: fcnDefinition
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    pushFollow(FOLLOW_fcnDefinition_in_classFeature932);
                    fcnDefinition23=fcnDefinition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, fcnDefinition23.getTree());

                    }
                    break;
                case 2 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:244:9: enumDefinition
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    pushFollow(FOLLOW_enumDefinition_in_classFeature943);
                    enumDefinition24=enumDefinition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, enumDefinition24.getTree());

                    }
                    break;
                case 3 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:245:9: varDeclaration
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    pushFollow(FOLLOW_varDeclaration_in_classFeature953);
                    varDeclaration25=varDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDeclaration25.getTree());

                    }
                    break;
                case 4 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:246:9: classDefinition
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    pushFollow(FOLLOW_classDefinition_in_classFeature963);
                    classDefinition26=classDefinition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, classDefinition26.getTree());

                    }
                    break;
                case 5 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:247:9: stmtInjection
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    pushFollow(FOLLOW_stmtInjection_in_classFeature973);
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
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:249:1: moduleDefinition : 'module' IDENT ( implementsClause )? braceOpen ( moduleFeature )* braceClose -> ^( D_MODULE ^( IDENT ( implementsClause )? ( moduleFeature )* ) ) ;
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
        RewriteRuleTokenStream stream_174=new RewriteRuleTokenStream(adaptor,"token 174");
        RewriteRuleSubtreeStream stream_implementsClause=new RewriteRuleSubtreeStream(adaptor,"rule implementsClause");
        RewriteRuleSubtreeStream stream_moduleFeature=new RewriteRuleSubtreeStream(adaptor,"rule moduleFeature");
        RewriteRuleSubtreeStream stream_braceOpen=new RewriteRuleSubtreeStream(adaptor,"rule braceOpen");
        RewriteRuleSubtreeStream stream_braceClose=new RewriteRuleSubtreeStream(adaptor,"rule braceClose");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:250:2: ( 'module' IDENT ( implementsClause )? braceOpen ( moduleFeature )* braceClose -> ^( D_MODULE ^( IDENT ( implementsClause )? ( moduleFeature )* ) ) )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:250:7: 'module' IDENT ( implementsClause )? braceOpen ( moduleFeature )* braceClose
            {
            string_literal28=(Atom)match(input,174,FOLLOW_174_in_moduleDefinition990); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_174.add(string_literal28);


            IDENT29=(Atom)match(input,IDENT,FOLLOW_IDENT_in_moduleDefinition992); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENT.add(IDENT29);


            if ( state.backtracking==0 ) { ti.setTypeName((IDENT29!=null?IDENT29.getText():null)); ti.setUnitFlags(EnumSet.of(Flags.MODULE));}

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:252:4: ( implementsClause )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==166) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:252:5: implementsClause
                    {
                    pushFollow(FOLLOW_implementsClause_in_moduleDefinition1007);
                    implementsClause30=implementsClause();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_implementsClause.add(implementsClause30.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_braceOpen_in_moduleDefinition1016);
            braceOpen31=braceOpen();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_braceOpen.add(braceOpen31.getTree());

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:253:14: ( moduleFeature )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==IDENT||LA11_0==INJECT||LA11_0==126||LA11_0==144||LA11_0==146||LA11_0==148||LA11_0==150||LA11_0==156||LA11_0==164||(LA11_0 >= 169 && LA11_0 <= 171)||LA11_0==175||LA11_0==182||LA11_0==184||(LA11_0 >= 188 && LA11_0 <= 191)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:253:15: moduleFeature
            	    {
            	    pushFollow(FOLLOW_moduleFeature_in_moduleDefinition1019);
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


            pushFollow(FOLLOW_braceClose_in_moduleDefinition1023);
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
            // 254:4: -> ^( D_MODULE ^( IDENT ( implementsClause )? ( moduleFeature )* ) )
            {
                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:254:7: ^( D_MODULE ^( IDENT ( implementsClause )? ( moduleFeature )* ) )
                {
                BaseNode root_1 = (BaseNode)adaptor.nil();
                root_1 = (BaseNode)adaptor.becomeRoot(
                (BaseNode)adaptor.create(D_MODULE, "D_MODULE")
                , root_1);

                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:254:18: ^( IDENT ( implementsClause )? ( moduleFeature )* )
                {
                BaseNode root_2 = (BaseNode)adaptor.nil();
                root_2 = (BaseNode)adaptor.becomeRoot(
                stream_IDENT.nextNode()
                , root_2);

                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:254:26: ( implementsClause )?
                if ( stream_implementsClause.hasNext() ) {
                    adaptor.addChild(root_2, stream_implementsClause.nextTree());

                }
                stream_implementsClause.reset();

                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:254:44: ( moduleFeature )*
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
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:256:1: moduleFeature : ( fcnDefinition | varDeclaration | enumDefinition | classDefinition | stmtInjection );
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

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:257:2: ( fcnDefinition | varDeclaration | enumDefinition | classDefinition | stmtInjection )
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
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:257:6: fcnDefinition
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    pushFollow(FOLLOW_fcnDefinition_in_moduleFeature1055);
                    fcnDefinition34=fcnDefinition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, fcnDefinition34.getTree());

                    }
                    break;
                case 2 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:258:8: varDeclaration
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    pushFollow(FOLLOW_varDeclaration_in_moduleFeature1064);
                    varDeclaration35=varDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDeclaration35.getTree());

                    }
                    break;
                case 3 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:259:6: enumDefinition
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    pushFollow(FOLLOW_enumDefinition_in_moduleFeature1071);
                    enumDefinition36=enumDefinition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, enumDefinition36.getTree());

                    }
                    break;
                case 4 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:260:6: classDefinition
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    pushFollow(FOLLOW_classDefinition_in_moduleFeature1078);
                    classDefinition37=classDefinition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, classDefinition37.getTree());

                    }
                    break;
                case 5 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:261:5: stmtInjection
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    pushFollow(FOLLOW_stmtInjection_in_moduleFeature1084);
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
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:263:1: enumDefinition : 'enum' enumDef -> enumDef ;
    public final pollenParser.enumDefinition_return enumDefinition() throws RecognitionException {
        pollenParser.enumDefinition_return retval = new pollenParser.enumDefinition_return();
        retval.start = input.LT(1);

        int enumDefinition_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom string_literal39=null;
        pollenParser.enumDef_return enumDef40 =null;


        BaseNode string_literal39_tree=null;
        RewriteRuleTokenStream stream_156=new RewriteRuleTokenStream(adaptor,"token 156");
        RewriteRuleSubtreeStream stream_enumDef=new RewriteRuleSubtreeStream(adaptor,"rule enumDef");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:264:2: ( 'enum' enumDef -> enumDef )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:264:4: 'enum' enumDef
            {
            string_literal39=(Atom)match(input,156,FOLLOW_156_in_enumDefinition1097); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_156.add(string_literal39);


            pushFollow(FOLLOW_enumDef_in_enumDefinition1099);
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
            // 264:19: -> enumDef
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
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:266:1: enumDef : ( IDENT braceOpen enumList braceClose ) -> ^( D_ENUM[\"D_ENUM\", ti.getUnitFlags()] ^( IDENT enumList ) ) ;
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

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:279:2: ( ( IDENT braceOpen enumList braceClose ) -> ^( D_ENUM[\"D_ENUM\", ti.getUnitFlags()] ^( IDENT enumList ) ) )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:279:5: ( IDENT braceOpen enumList braceClose )
            {
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:279:5: ( IDENT braceOpen enumList braceClose )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:279:6: IDENT braceOpen enumList braceClose
            {
            IDENT41=(Atom)match(input,IDENT,FOLLOW_IDENT_in_enumDef1125); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENT.add(IDENT41);


            if ( state.backtracking==0 ) { ti.setTypeName((IDENT41!=null?IDENT41.getText():null)); ti.setUnitFlags(EnumSet.of(Flags.ENUM));}

            pushFollow(FOLLOW_braceOpen_in_enumDef1134);
            braceOpen42=braceOpen();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_braceOpen.add(braceOpen42.getTree());

            pushFollow(FOLLOW_enumList_in_enumDef1136);
            enumList43=enumList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_enumList.add(enumList43.getTree());

            pushFollow(FOLLOW_braceClose_in_enumDef1138);
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
            // 282:3: -> ^( D_ENUM[\"D_ENUM\", ti.getUnitFlags()] ^( IDENT enumList ) )
            {
                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:282:6: ^( D_ENUM[\"D_ENUM\", ti.getUnitFlags()] ^( IDENT enumList ) )
                {
                BaseNode root_1 = (BaseNode)adaptor.nil();
                root_1 = (BaseNode)adaptor.becomeRoot(
                new DeclNode.Enum(D_ENUM, "D_ENUM", ti.getUnitFlags())
                , root_1);

                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:282:59: ^( IDENT enumList )
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
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:284:1: enumList : enumElement ( ',' enumElement )* -> ^( LIST[\"LIST\"] ( enumElement )+ ) ;
    public final pollenParser.enumList_return enumList() throws RecognitionException {
        pollenParser.enumList_return retval = new pollenParser.enumList_return();
        retval.start = input.LT(1);

        int enumList_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom char_literal46=null;
        pollenParser.enumElement_return enumElement45 =null;

        pollenParser.enumElement_return enumElement47 =null;


        BaseNode char_literal46_tree=null;
        RewriteRuleTokenStream stream_129=new RewriteRuleTokenStream(adaptor,"token 129");
        RewriteRuleSubtreeStream stream_enumElement=new RewriteRuleSubtreeStream(adaptor,"rule enumElement");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:285:2: ( enumElement ( ',' enumElement )* -> ^( LIST[\"LIST\"] ( enumElement )+ ) )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:285:4: enumElement ( ',' enumElement )*
            {
            pushFollow(FOLLOW_enumElement_in_enumList1169);
            enumElement45=enumElement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_enumElement.add(enumElement45.getTree());

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:285:16: ( ',' enumElement )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==129) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:285:17: ',' enumElement
            	    {
            	    char_literal46=(Atom)match(input,129,FOLLOW_129_in_enumList1172); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_129.add(char_literal46);


            	    pushFollow(FOLLOW_enumElement_in_enumList1174);
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
            // 285:35: -> ^( LIST[\"LIST\"] ( enumElement )+ )
            {
                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:285:38: ^( LIST[\"LIST\"] ( enumElement )+ )
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
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:287:1: enumElement : ( IDENT ASSIGN INT_LIT ( delim )? -> ^( D_ENUMVAL[\"D_ENUMVAL\", ti.getUnitFlags()] ^( IDENT INT_LIT ) ) | IDENT ( delim )? -> ^( D_ENUMVAL IDENT ) );
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

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:288:2: ( IDENT ASSIGN INT_LIT ( delim )? -> ^( D_ENUMVAL[\"D_ENUMVAL\", ti.getUnitFlags()] ^( IDENT INT_LIT ) ) | IDENT ( delim )? -> ^( D_ENUMVAL IDENT ) )
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
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:288:4: IDENT ASSIGN INT_LIT ( delim )?
                    {
                    IDENT48=(Atom)match(input,IDENT,FOLLOW_IDENT_in_enumElement1199); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENT.add(IDENT48);


                    ASSIGN49=(Atom)match(input,ASSIGN,FOLLOW_ASSIGN_in_enumElement1201); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ASSIGN.add(ASSIGN49);


                    INT_LIT50=(Atom)match(input,INT_LIT,FOLLOW_INT_LIT_in_enumElement1203); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INT_LIT.add(INT_LIT50);


                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:288:25: ( delim )?
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
                        case 129:
                            {
                            int LA14_3 = input.LA(2);

                            if ( (synpred20_pollen()) ) {
                                alt14=1;
                            }
                            }
                            break;
                        case 196:
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
                            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:288:26: delim
                            {
                            pushFollow(FOLLOW_delim_in_enumElement1206);
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

                    root_0 = (BaseNode)adaptor.nil();
                    // 288:34: -> ^( D_ENUMVAL[\"D_ENUMVAL\", ti.getUnitFlags()] ^( IDENT INT_LIT ) )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:288:37: ^( D_ENUMVAL[\"D_ENUMVAL\", ti.getUnitFlags()] ^( IDENT INT_LIT ) )
                        {
                        BaseNode root_1 = (BaseNode)adaptor.nil();
                        root_1 = (BaseNode)adaptor.becomeRoot(
                        new DeclNode.EnumVal(D_ENUMVAL, "D_ENUMVAL", ti.getUnitFlags())
                        , root_1);

                        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:288:99: ^( IDENT INT_LIT )
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
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:289:4: IDENT ( delim )?
                    {
                    IDENT52=(Atom)match(input,IDENT,FOLLOW_IDENT_in_enumElement1231); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENT.add(IDENT52);


                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:289:10: ( delim )?
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
                        case 129:
                            {
                            int LA15_3 = input.LA(2);

                            if ( (synpred22_pollen()) ) {
                                alt15=1;
                            }
                            }
                            break;
                        case 196:
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
                            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:289:11: delim
                            {
                            pushFollow(FOLLOW_delim_in_enumElement1234);
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
                    // 289:19: -> ^( D_ENUMVAL IDENT )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:289:22: ^( D_ENUMVAL IDENT )
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
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:291:1: protocolDefinition : 'protocol' IDENT ( extendsClause )? braceOpen ( protocolFeature )* braceClose -> ^( D_PROTOCOL ^( IDENT ( extendsClause )? ( protocolFeature )* ) ) ;
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
        RewriteRuleTokenStream stream_180=new RewriteRuleTokenStream(adaptor,"token 180");
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleSubtreeStream stream_protocolFeature=new RewriteRuleSubtreeStream(adaptor,"rule protocolFeature");
        RewriteRuleSubtreeStream stream_extendsClause=new RewriteRuleSubtreeStream(adaptor,"rule extendsClause");
        RewriteRuleSubtreeStream stream_braceOpen=new RewriteRuleSubtreeStream(adaptor,"rule braceOpen");
        RewriteRuleSubtreeStream stream_braceClose=new RewriteRuleSubtreeStream(adaptor,"rule braceClose");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:292:2: ( 'protocol' IDENT ( extendsClause )? braceOpen ( protocolFeature )* braceClose -> ^( D_PROTOCOL ^( IDENT ( extendsClause )? ( protocolFeature )* ) ) )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:292:4: 'protocol' IDENT ( extendsClause )? braceOpen ( protocolFeature )* braceClose
            {
            string_literal54=(Atom)match(input,180,FOLLOW_180_in_protocolDefinition1254); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_180.add(string_literal54);


            IDENT55=(Atom)match(input,IDENT,FOLLOW_IDENT_in_protocolDefinition1256); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENT.add(IDENT55);


            if ( state.backtracking==0 ) { ti.setTypeName((IDENT55!=null?IDENT55.getText():null)); ti.setUnitFlags(EnumSet.of(Flags.PROTOCOL));}

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:294:3: ( extendsClause )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==159) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:294:3: extendsClause
                    {
                    pushFollow(FOLLOW_extendsClause_in_protocolDefinition1264);
                    extendsClause56=extendsClause();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_extendsClause.add(extendsClause56.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_braceOpen_in_protocolDefinition1270);
            braceOpen57=braceOpen();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_braceOpen.add(braceOpen57.getTree());

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:295:13: ( protocolFeature )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==IDENT||LA18_0==INJECT||LA18_0==126||LA18_0==144||LA18_0==146||LA18_0==156||LA18_0==164||(LA18_0 >= 169 && LA18_0 <= 171)||LA18_0==182||LA18_0==184||(LA18_0 >= 188 && LA18_0 <= 190)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:295:14: protocolFeature
            	    {
            	    pushFollow(FOLLOW_protocolFeature_in_protocolDefinition1273);
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


            pushFollow(FOLLOW_braceClose_in_protocolDefinition1277);
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
            // 296:3: -> ^( D_PROTOCOL ^( IDENT ( extendsClause )? ( protocolFeature )* ) )
            {
                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:296:6: ^( D_PROTOCOL ^( IDENT ( extendsClause )? ( protocolFeature )* ) )
                {
                BaseNode root_1 = (BaseNode)adaptor.nil();
                root_1 = (BaseNode)adaptor.becomeRoot(
                (BaseNode)adaptor.create(D_PROTOCOL, "D_PROTOCOL")
                , root_1);

                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:296:19: ^( IDENT ( extendsClause )? ( protocolFeature )* )
                {
                BaseNode root_2 = (BaseNode)adaptor.nil();
                root_2 = (BaseNode)adaptor.becomeRoot(
                stream_IDENT.nextNode()
                , root_2);

                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:296:27: ( extendsClause )?
                if ( stream_extendsClause.hasNext() ) {
                    adaptor.addChild(root_2, stream_extendsClause.nextTree());

                }
                stream_extendsClause.reset();

                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:296:42: ( protocolFeature )*
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
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:298:1: protocolFeature : ( enumDefinition | fcnDeclaration | stmtInjection );
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

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:299:5: ( enumDefinition | fcnDeclaration | stmtInjection )
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
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:299:9: enumDefinition
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    pushFollow(FOLLOW_enumDefinition_in_protocolFeature1311);
                    enumDefinition60=enumDefinition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, enumDefinition60.getTree());

                    }
                    break;
                case 2 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:300:9: fcnDeclaration
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    pushFollow(FOLLOW_fcnDeclaration_in_protocolFeature1321);
                    fcnDeclaration61=fcnDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, fcnDeclaration61.getTree());

                    }
                    break;
                case 3 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:301:9: stmtInjection
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    pushFollow(FOLLOW_stmtInjection_in_protocolFeature1332);
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
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:303:1: compositionDefinition : 'composition' IDENT ( extendsClause )? braceOpen ( compositionFeature )* braceClose -> ^( D_COMPOSITION[\"D_COMPOSITION\", ti.getUnitFlags()] IDENT ( extendsClause )? ( compositionFeature )* ) ;
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
        RewriteRuleTokenStream stream_149=new RewriteRuleTokenStream(adaptor,"token 149");
        RewriteRuleSubtreeStream stream_extendsClause=new RewriteRuleSubtreeStream(adaptor,"rule extendsClause");
        RewriteRuleSubtreeStream stream_compositionFeature=new RewriteRuleSubtreeStream(adaptor,"rule compositionFeature");
        RewriteRuleSubtreeStream stream_braceOpen=new RewriteRuleSubtreeStream(adaptor,"rule braceOpen");
        RewriteRuleSubtreeStream stream_braceClose=new RewriteRuleSubtreeStream(adaptor,"rule braceClose");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:304:2: ( 'composition' IDENT ( extendsClause )? braceOpen ( compositionFeature )* braceClose -> ^( D_COMPOSITION[\"D_COMPOSITION\", ti.getUnitFlags()] IDENT ( extendsClause )? ( compositionFeature )* ) )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:304:4: 'composition' IDENT ( extendsClause )? braceOpen ( compositionFeature )* braceClose
            {
            string_literal63=(Atom)match(input,149,FOLLOW_149_in_compositionDefinition1345); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_149.add(string_literal63);


            IDENT64=(Atom)match(input,IDENT,FOLLOW_IDENT_in_compositionDefinition1347); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENT.add(IDENT64);


            if ( state.backtracking==0 ) { ti.setTypeName((IDENT64!=null?IDENT64.getText():null)); 
            		  //DBG("IDENT64 " + (IDENT64!=null?IDENT64.getText():null)); 
            		  ti.setUnitFlags(EnumSet.of(Flags.COMPOSITION));
            		  //DBG(ti.getTypeName() + ", " + ti.getUnitFlags().toString());
            		}

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:310:3: ( extendsClause )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==159) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:310:3: extendsClause
                    {
                    pushFollow(FOLLOW_extendsClause_in_compositionDefinition1355);
                    extendsClause65=extendsClause();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_extendsClause.add(extendsClause65.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_braceOpen_in_compositionDefinition1362);
            braceOpen66=braceOpen();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_braceOpen.add(braceOpen66.getTree());

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:311:13: ( compositionFeature )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==IDENT||LA21_0==INJECT||LA21_0==126||LA21_0==144||LA21_0==146||LA21_0==150||LA21_0==156||LA21_0==158||LA21_0==164||(LA21_0 >= 169 && LA21_0 <= 171)||LA21_0==175||LA21_0==182||LA21_0==184||(LA21_0 >= 188 && LA21_0 <= 191)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:311:14: compositionFeature
            	    {
            	    pushFollow(FOLLOW_compositionFeature_in_compositionDefinition1365);
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


            pushFollow(FOLLOW_braceClose_in_compositionDefinition1369);
            braceClose68=braceClose();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_braceClose.add(braceClose68.getTree());

            // AST REWRITE
            // elements: extendsClause, compositionFeature, IDENT
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (BaseNode)adaptor.nil();
            // 312:4: -> ^( D_COMPOSITION[\"D_COMPOSITION\", ti.getUnitFlags()] IDENT ( extendsClause )? ( compositionFeature )* )
            {
                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:312:7: ^( D_COMPOSITION[\"D_COMPOSITION\", ti.getUnitFlags()] IDENT ( extendsClause )? ( compositionFeature )* )
                {
                BaseNode root_1 = (BaseNode)adaptor.nil();
                root_1 = (BaseNode)adaptor.becomeRoot(
                new DeclNode.UserTypeDef(D_COMPOSITION, "D_COMPOSITION", ti.getUnitFlags())
                , root_1);

                adaptor.addChild(root_1, 
                stream_IDENT.nextNode()
                );

                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:312:87: ( extendsClause )?
                if ( stream_extendsClause.hasNext() ) {
                    adaptor.addChild(root_1, stream_extendsClause.nextTree());

                }
                stream_extendsClause.reset();

                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:312:102: ( compositionFeature )*
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
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:314:1: compositionFeature : ( exportList | fcnDefinitionHost | enumDefinition | varDeclaration | stmtInjection );
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

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:315:3: ( exportList | fcnDefinitionHost | enumDefinition | varDeclaration | stmtInjection )
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
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:315:6: exportList
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    pushFollow(FOLLOW_exportList_in_compositionFeature1405);
                    exportList69=exportList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, exportList69.getTree());

                    }
                    break;
                case 2 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:316:7: fcnDefinitionHost
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    pushFollow(FOLLOW_fcnDefinitionHost_in_compositionFeature1413);
                    fcnDefinitionHost70=fcnDefinitionHost();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, fcnDefinitionHost70.getTree());

                    }
                    break;
                case 3 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:317:7: enumDefinition
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    pushFollow(FOLLOW_enumDefinition_in_compositionFeature1421);
                    enumDefinition71=enumDefinition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, enumDefinition71.getTree());

                    }
                    break;
                case 4 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:318:7: varDeclaration
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    pushFollow(FOLLOW_varDeclaration_in_compositionFeature1429);
                    varDeclaration72=varDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDeclaration72.getTree());

                    }
                    break;
                case 5 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:319:6: stmtInjection
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    pushFollow(FOLLOW_stmtInjection_in_compositionFeature1436);
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
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:321:1: stmtImport : ( importFrom 'import' qualName ( metaArguments )? ( importAs )? delim ) -> ^( S_IMPORT ( importFrom )? qualName ( importAs )? ( metaArguments )? ) ;
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
        RewriteRuleTokenStream stream_167=new RewriteRuleTokenStream(adaptor,"token 167");
        RewriteRuleSubtreeStream stream_importFrom=new RewriteRuleSubtreeStream(adaptor,"rule importFrom");
        RewriteRuleSubtreeStream stream_qualName=new RewriteRuleSubtreeStream(adaptor,"rule qualName");
        RewriteRuleSubtreeStream stream_importAs=new RewriteRuleSubtreeStream(adaptor,"rule importAs");
        RewriteRuleSubtreeStream stream_delim=new RewriteRuleSubtreeStream(adaptor,"rule delim");
        RewriteRuleSubtreeStream stream_metaArguments=new RewriteRuleSubtreeStream(adaptor,"rule metaArguments");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:322:5: ( ( importFrom 'import' qualName ( metaArguments )? ( importAs )? delim ) -> ^( S_IMPORT ( importFrom )? qualName ( importAs )? ( metaArguments )? ) )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:322:9: ( importFrom 'import' qualName ( metaArguments )? ( importAs )? delim )
            {
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:322:9: ( importFrom 'import' qualName ( metaArguments )? ( importAs )? delim )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:322:10: importFrom 'import' qualName ( metaArguments )? ( importAs )? delim
            {
            pushFollow(FOLLOW_importFrom_in_stmtImport1453);
            importFrom74=importFrom();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_importFrom.add(importFrom74.getTree());

            string_literal75=(Atom)match(input,167,FOLLOW_167_in_stmtImport1463); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_167.add(string_literal75);


            pushFollow(FOLLOW_qualName_in_stmtImport1465);
            qualName76=qualName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_qualName.add(qualName76.getTree());

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:323:27: ( metaArguments )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==193) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:323:28: metaArguments
                    {
                    pushFollow(FOLLOW_metaArguments_in_stmtImport1468);
                    metaArguments77=metaArguments();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_metaArguments.add(metaArguments77.getTree());

                    }
                    break;

            }


            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:324:10: ( importAs )?
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
                case 173:
                    {
                    int LA24_5 = input.LA(2);

                    if ( (synpred34_pollen()) ) {
                        alt24=1;
                    }
                    }
                    break;
                case 174:
                    {
                    int LA24_6 = input.LA(2);

                    if ( (synpred34_pollen()) ) {
                        alt24=1;
                    }
                    }
                    break;
                case 148:
                    {
                    int LA24_7 = input.LA(2);

                    if ( (synpred34_pollen()) ) {
                        alt24=1;
                    }
                    }
                    break;
                case 180:
                    {
                    int LA24_8 = input.LA(2);

                    if ( (synpred34_pollen()) ) {
                        alt24=1;
                    }
                    }
                    break;
                case 149:
                    {
                    int LA24_9 = input.LA(2);

                    if ( (synpred34_pollen()) ) {
                        alt24=1;
                    }
                    }
                    break;
                case 156:
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
                case 163:
                    {
                    int LA24_12 = input.LA(2);

                    if ( (synpred34_pollen()) ) {
                        alt24=1;
                    }
                    }
                    break;
                case 167:
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
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:324:10: importAs
                    {
                    pushFollow(FOLLOW_importAs_in_stmtImport1481);
                    importAs78=importAs();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_importAs.add(importAs78.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_delim_in_stmtImport1484);
            delim79=delim();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_delim.add(delim79.getTree());

            }


            // AST REWRITE
            // elements: importFrom, importAs, qualName, metaArguments
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (BaseNode)adaptor.nil();
            // 324:27: -> ^( S_IMPORT ( importFrom )? qualName ( importAs )? ( metaArguments )? )
            {
                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:324:30: ^( S_IMPORT ( importFrom )? qualName ( importAs )? ( metaArguments )? )
                {
                BaseNode root_1 = (BaseNode)adaptor.nil();
                root_1 = (BaseNode)adaptor.becomeRoot(
                (BaseNode)adaptor.create(S_IMPORT, "S_IMPORT")
                , root_1);

                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:324:41: ( importFrom )?
                if ( stream_importFrom.hasNext() ) {
                    adaptor.addChild(root_1, stream_importFrom.nextTree());

                }
                stream_importFrom.reset();

                adaptor.addChild(root_1, stream_qualName.nextTree());

                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:324:62: ( importAs )?
                if ( stream_importAs.hasNext() ) {
                    adaptor.addChild(root_1, stream_importAs.nextTree());

                }
                stream_importAs.reset();

                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:324:72: ( metaArguments )?
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
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:326:1: importFrom : ( 'from' qualName -> qualName | -> NIL );
    public final pollenParser.importFrom_return importFrom() throws RecognitionException {
        pollenParser.importFrom_return retval = new pollenParser.importFrom_return();
        retval.start = input.LT(1);

        int importFrom_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom string_literal80=null;
        pollenParser.qualName_return qualName81 =null;


        BaseNode string_literal80_tree=null;
        RewriteRuleTokenStream stream_163=new RewriteRuleTokenStream(adaptor,"token 163");
        RewriteRuleSubtreeStream stream_qualName=new RewriteRuleSubtreeStream(adaptor,"rule qualName");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:327:5: ( 'from' qualName -> qualName | -> NIL )
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
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:327:9: 'from' qualName
                    {
                    string_literal80=(Atom)match(input,163,FOLLOW_163_in_importFrom1520); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_163.add(string_literal80);


                    pushFollow(FOLLOW_qualName_in_importFrom1522);
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
                    // 328:8: -> NIL
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
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:330:1: importAs : ( 'as' qualName -> qualName | -> NIL );
    public final pollenParser.importAs_return importAs() throws RecognitionException {
        pollenParser.importAs_return retval = new pollenParser.importAs_return();
        retval.start = input.LT(1);

        int importAs_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom string_literal82=null;
        pollenParser.qualName_return qualName83 =null;


        BaseNode string_literal82_tree=null;
        RewriteRuleTokenStream stream_142=new RewriteRuleTokenStream(adaptor,"token 142");
        RewriteRuleSubtreeStream stream_qualName=new RewriteRuleSubtreeStream(adaptor,"rule qualName");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:331:2: ( 'as' qualName -> qualName | -> NIL )
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
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:331:4: 'as' qualName
                    {
                    string_literal82=(Atom)match(input,142,FOLLOW_142_in_importAs1550); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_142.add(string_literal82);


                    pushFollow(FOLLOW_qualName_in_importAs1552);
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
                    // 331:18: -> qualName
                    {
                        adaptor.addChild(root_0, stream_qualName.nextTree());

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:332:4: 
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
                    // 332:4: -> NIL
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
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:334:1: importList : ( stmtImport )* -> ^( LIST[\"LIST\"] ( stmtImport )* ) ;
    public final pollenParser.importList_return importList() throws RecognitionException {
        pollenParser.importList_return retval = new pollenParser.importList_return();
        retval.start = input.LT(1);

        int importList_StartIndex = input.index();

        BaseNode root_0 = null;

        pollenParser.stmtImport_return stmtImport84 =null;


        RewriteRuleSubtreeStream stream_stmtImport=new RewriteRuleSubtreeStream(adaptor,"rule stmtImport");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:335:5: ( ( stmtImport )* -> ^( LIST[\"LIST\"] ( stmtImport )* ) )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:335:9: ( stmtImport )*
            {
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:335:9: ( stmtImport )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==163||LA27_0==167) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:335:9: stmtImport
            	    {
            	    pushFollow(FOLLOW_stmtImport_in_importList1578);
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
            // 336:6: -> ^( LIST[\"LIST\"] ( stmtImport )* )
            {
                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:336:9: ^( LIST[\"LIST\"] ( stmtImport )* )
                {
                BaseNode root_1 = (BaseNode)adaptor.nil();
                root_1 = (BaseNode)adaptor.becomeRoot(
                new ListNode(LIST, "LIST")
                , root_1);

                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:336:34: ( stmtImport )*
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
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:338:1: meta : 'meta' ( braceOpen metaFormalParameters braceClose ) -> ^( D_META metaFormalParameters ) ;
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
        RewriteRuleTokenStream stream_173=new RewriteRuleTokenStream(adaptor,"token 173");
        RewriteRuleSubtreeStream stream_metaFormalParameters=new RewriteRuleSubtreeStream(adaptor,"rule metaFormalParameters");
        RewriteRuleSubtreeStream stream_braceOpen=new RewriteRuleSubtreeStream(adaptor,"rule braceOpen");
        RewriteRuleSubtreeStream stream_braceClose=new RewriteRuleSubtreeStream(adaptor,"rule braceClose");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:339:2: ( 'meta' ( braceOpen metaFormalParameters braceClose ) -> ^( D_META metaFormalParameters ) )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:339:4: 'meta' ( braceOpen metaFormalParameters braceClose )
            {
            string_literal85=(Atom)match(input,173,FOLLOW_173_in_meta1612); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_173.add(string_literal85);


            if ( state.backtracking==0 ) { ti.setUnitFlags(EnumSet.of(Flags.META));}

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:341:3: ( braceOpen metaFormalParameters braceClose )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:341:4: braceOpen metaFormalParameters braceClose
            {
            pushFollow(FOLLOW_braceOpen_in_meta1621);
            braceOpen86=braceOpen();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_braceOpen.add(braceOpen86.getTree());

            pushFollow(FOLLOW_metaFormalParameters_in_meta1623);
            metaFormalParameters87=metaFormalParameters();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_metaFormalParameters.add(metaFormalParameters87.getTree());

            pushFollow(FOLLOW_braceClose_in_meta1625);
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
            // 342:3: -> ^( D_META metaFormalParameters )
            {
                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:342:6: ^( D_META metaFormalParameters )
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
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:344:1: metaFormalParameters : metaFormalParameter ( ',' metaFormalParameter )* -> ( metaFormalParameter )+ ;
    public final pollenParser.metaFormalParameters_return metaFormalParameters() throws RecognitionException {
        pollenParser.metaFormalParameters_return retval = new pollenParser.metaFormalParameters_return();
        retval.start = input.LT(1);

        int metaFormalParameters_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom char_literal90=null;
        pollenParser.metaFormalParameter_return metaFormalParameter89 =null;

        pollenParser.metaFormalParameter_return metaFormalParameter91 =null;


        BaseNode char_literal90_tree=null;
        RewriteRuleTokenStream stream_129=new RewriteRuleTokenStream(adaptor,"token 129");
        RewriteRuleSubtreeStream stream_metaFormalParameter=new RewriteRuleSubtreeStream(adaptor,"rule metaFormalParameter");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:345:4: ( metaFormalParameter ( ',' metaFormalParameter )* -> ( metaFormalParameter )+ )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:345:8: metaFormalParameter ( ',' metaFormalParameter )*
            {
            pushFollow(FOLLOW_metaFormalParameter_in_metaFormalParameters1650);
            metaFormalParameter89=metaFormalParameter();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_metaFormalParameter.add(metaFormalParameter89.getTree());

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:345:29: ( ',' metaFormalParameter )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==129) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:345:30: ',' metaFormalParameter
            	    {
            	    char_literal90=(Atom)match(input,129,FOLLOW_129_in_metaFormalParameters1654); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_129.add(char_literal90);


            	    pushFollow(FOLLOW_metaFormalParameter_in_metaFormalParameters1656);
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
            // 345:56: -> ( metaFormalParameter )+
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
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:348:1: metaFormalParameter : metaFormalParameterType IDENT ( ASSIGN metaArgument )? -> ^( metaFormalParameterType ^( IDENT ( metaArgument )? ) ) ;
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

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:349:4: ( metaFormalParameterType IDENT ( ASSIGN metaArgument )? -> ^( metaFormalParameterType ^( IDENT ( metaArgument )? ) ) )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:349:4: metaFormalParameterType IDENT ( ASSIGN metaArgument )?
            {
            pushFollow(FOLLOW_metaFormalParameterType_in_metaFormalParameter1679);
            metaFormalParameterType92=metaFormalParameterType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_metaFormalParameterType.add(metaFormalParameterType92.getTree());

            IDENT93=(Atom)match(input,IDENT,FOLLOW_IDENT_in_metaFormalParameter1681); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENT.add(IDENT93);


            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:349:34: ( ASSIGN metaArgument )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==ASSIGN) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:349:35: ASSIGN metaArgument
                    {
                    ASSIGN94=(Atom)match(input,ASSIGN,FOLLOW_ASSIGN_in_metaFormalParameter1684); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ASSIGN.add(ASSIGN94);


                    pushFollow(FOLLOW_metaArgument_in_metaFormalParameter1686);
                    metaArgument95=metaArgument();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_metaArgument.add(metaArgument95.getTree());

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

            root_0 = (BaseNode)adaptor.nil();
            // 350:2: -> ^( metaFormalParameterType ^( IDENT ( metaArgument )? ) )
            {
                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:350:5: ^( metaFormalParameterType ^( IDENT ( metaArgument )? ) )
                {
                BaseNode root_1 = (BaseNode)adaptor.nil();
                root_1 = (BaseNode)adaptor.becomeRoot(stream_metaFormalParameterType.nextNode(), root_1);

                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:350:31: ^( IDENT ( metaArgument )? )
                {
                BaseNode root_2 = (BaseNode)adaptor.nil();
                root_2 = (BaseNode)adaptor.becomeRoot(
                stream_IDENT.nextNode()
                , root_2);

                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:350:39: ( metaArgument )?
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
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:353:1: metaFormalParameterType : ( 'type' | builtinType );
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

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:354:3: ( 'type' | builtinType )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==187) ) {
                alt30=1;
            }
            else if ( (LA30_0==144||LA30_0==146||(LA30_0 >= 169 && LA30_0 <= 171)||LA30_0==184||(LA30_0 >= 188 && LA30_0 <= 190)) ) {
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
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:354:5: 'type'
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    string_literal96=(Atom)match(input,187,FOLLOW_187_in_metaFormalParameterType1715); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal96_tree = 
                    (BaseNode)adaptor.create(string_literal96)
                    ;
                    adaptor.addChild(root_0, string_literal96_tree);
                    }

                    }
                    break;
                case 2 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:355:5: builtinType
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    pushFollow(FOLLOW_builtinType_in_metaFormalParameterType1722);
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
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:357:1: metaArguments : ( '{' metaArgument ( ',' metaArgument )* '}' -> ^( D_META_ARGS ( metaArgument )+ ) | '{' '}' -> ^( D_META_ARGS NIL ) );
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
        RewriteRuleTokenStream stream_196=new RewriteRuleTokenStream(adaptor,"token 196");
        RewriteRuleTokenStream stream_129=new RewriteRuleTokenStream(adaptor,"token 129");
        RewriteRuleTokenStream stream_193=new RewriteRuleTokenStream(adaptor,"token 193");
        RewriteRuleSubtreeStream stream_metaArgument=new RewriteRuleSubtreeStream(adaptor,"rule metaArgument");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:358:4: ( '{' metaArgument ( ',' metaArgument )* '}' -> ^( D_META_ARGS ( metaArgument )+ ) | '{' '}' -> ^( D_META_ARGS NIL ) )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==193) ) {
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
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:358:7: '{' metaArgument ( ',' metaArgument )* '}'
                    {
                    char_literal98=(Atom)match(input,193,FOLLOW_193_in_metaArguments1735); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_193.add(char_literal98);


                    pushFollow(FOLLOW_metaArgument_in_metaArguments1737);
                    metaArgument99=metaArgument();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_metaArgument.add(metaArgument99.getTree());

                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:358:25: ( ',' metaArgument )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==129) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:358:26: ',' metaArgument
                    	    {
                    	    char_literal100=(Atom)match(input,129,FOLLOW_129_in_metaArguments1741); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_129.add(char_literal100);


                    	    pushFollow(FOLLOW_metaArgument_in_metaArguments1743);
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


                    char_literal102=(Atom)match(input,196,FOLLOW_196_in_metaArguments1747); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_196.add(char_literal102);


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
                    // 358:49: -> ^( D_META_ARGS ( metaArgument )+ )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:358:52: ^( D_META_ARGS ( metaArgument )+ )
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
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:359:6: '{' '}'
                    {
                    char_literal103=(Atom)match(input,193,FOLLOW_193_in_metaArguments1763); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_193.add(char_literal103);


                    char_literal104=(Atom)match(input,196,FOLLOW_196_in_metaArguments1765); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_196.add(char_literal104);


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
                    // 359:19: -> ^( D_META_ARGS NIL )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:359:22: ^( D_META_ARGS NIL )
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
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:362:1: metaArgument : ( primitiveLit | typeNameScalar );
    public final pollenParser.metaArgument_return metaArgument() throws RecognitionException {
        pollenParser.metaArgument_return retval = new pollenParser.metaArgument_return();
        retval.start = input.LT(1);

        int metaArgument_StartIndex = input.index();

        BaseNode root_0 = null;

        pollenParser.primitiveLit_return primitiveLit105 =null;

        pollenParser.typeNameScalar_return typeNameScalar106 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:363:2: ( primitiveLit | typeNameScalar )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==CHAR||LA33_0==HEX_LIT||LA33_0==INT_LIT||LA33_0==OCT_LIT||LA33_0==REAL_LIT||LA33_0==STRING||LA33_0==160||LA33_0==176||LA33_0==186) ) {
                alt33=1;
            }
            else if ( (LA33_0==IDENT||LA33_0==144||LA33_0==146||(LA33_0 >= 169 && LA33_0 <= 171)||LA33_0==184||(LA33_0 >= 188 && LA33_0 <= 190)) ) {
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
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:363:4: primitiveLit
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    pushFollow(FOLLOW_primitiveLit_in_metaArgument1794);
                    primitiveLit105=primitiveLit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveLit105.getTree());

                    }
                    break;
                case 2 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:364:4: typeNameScalar
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    pushFollow(FOLLOW_typeNameScalar_in_metaArgument1800);
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
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:366:1: typeName : typeNameScalar ;
    public final pollenParser.typeName_return typeName() throws RecognitionException {
        pollenParser.typeName_return retval = new pollenParser.typeName_return();
        retval.start = input.LT(1);

        int typeName_StartIndex = input.index();

        BaseNode root_0 = null;

        pollenParser.typeNameScalar_return typeNameScalar107 =null;




        	//System.out.print("typeName: "); DBG_LT(); <DeclNode.Fcn>["D_FCN_DCL", atFlags]

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:370:2: ( typeNameScalar )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:370:4: typeNameScalar
            {
            root_0 = (BaseNode)adaptor.nil();


            pushFollow(FOLLOW_typeNameScalar_in_typeName1814);
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
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:372:1: typeNameScalar : ( builtinType | userTypeName );
    public final pollenParser.typeNameScalar_return typeNameScalar() throws RecognitionException {
        pollenParser.typeNameScalar_return retval = new pollenParser.typeNameScalar_return();
        retval.start = input.LT(1);

        int typeNameScalar_StartIndex = input.index();

        BaseNode root_0 = null;

        pollenParser.builtinType_return builtinType108 =null;

        pollenParser.userTypeName_return userTypeName109 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:373:2: ( builtinType | userTypeName )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==144||LA34_0==146||(LA34_0 >= 169 && LA34_0 <= 171)||LA34_0==184||(LA34_0 >= 188 && LA34_0 <= 190)) ) {
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
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:373:4: builtinType
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    pushFollow(FOLLOW_builtinType_in_typeNameScalar1827);
                    builtinType108=builtinType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, builtinType108.getTree());

                    }
                    break;
                case 2 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:374:4: userTypeName
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    pushFollow(FOLLOW_userTypeName_in_typeNameScalar1832);
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
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:376:1: userTypeName : ( qualName metaArguments -> ^( T_USER_TYPE[\"T_USER_TYPE\", atFlags] qualName metaArguments ) | qualName -> ^( T_USER_TYPE[\"T_USER_TYPE\", atFlags] qualName ) );
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

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:377:2: ( qualName metaArguments -> ^( T_USER_TYPE[\"T_USER_TYPE\", atFlags] qualName metaArguments ) | qualName -> ^( T_USER_TYPE[\"T_USER_TYPE\", atFlags] qualName ) )
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
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:377:4: qualName metaArguments
                    {
                    pushFollow(FOLLOW_qualName_in_userTypeName1842);
                    qualName110=qualName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_qualName.add(qualName110.getTree());

                    pushFollow(FOLLOW_metaArguments_in_userTypeName1844);
                    metaArguments111=metaArguments();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_metaArguments.add(metaArguments111.getTree());

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
                    // 377:27: -> ^( T_USER_TYPE[\"T_USER_TYPE\", atFlags] qualName metaArguments )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:377:30: ^( T_USER_TYPE[\"T_USER_TYPE\", atFlags] qualName metaArguments )
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
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:378:4: qualName
                    {
                    pushFollow(FOLLOW_qualName_in_userTypeName1865);
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
                    // 378:14: -> ^( T_USER_TYPE[\"T_USER_TYPE\", atFlags] qualName )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:378:17: ^( T_USER_TYPE[\"T_USER_TYPE\", atFlags] qualName )
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
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:381:1: unitTypeDefinition : ( meta )? ( ( 'module' )=> moduleDefinition | ( 'class' )=> classDefinition | ( 'protocol' )=> protocolDefinition | ( 'composition' )=> compositionDefinition | ( 'enum' )=> enumDefinition ) ;
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

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:390:4: ( ( meta )? ( ( 'module' )=> moduleDefinition | ( 'class' )=> classDefinition | ( 'protocol' )=> protocolDefinition | ( 'composition' )=> compositionDefinition | ( 'enum' )=> enumDefinition ) )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:390:8: ( meta )? ( ( 'module' )=> moduleDefinition | ( 'class' )=> classDefinition | ( 'protocol' )=> protocolDefinition | ( 'composition' )=> compositionDefinition | ( 'enum' )=> enumDefinition )
            {
            root_0 = (BaseNode)adaptor.nil();


            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:390:8: ( meta )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==173) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:390:9: meta
                    {
                    pushFollow(FOLLOW_meta_in_unitTypeDefinition1904);
                    meta113=meta();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, meta113.getTree());

                    }
                    break;

            }


            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:390:17: ( ( 'module' )=> moduleDefinition | ( 'class' )=> classDefinition | ( 'protocol' )=> protocolDefinition | ( 'composition' )=> compositionDefinition | ( 'enum' )=> enumDefinition )
            int alt37=5;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==174) && (synpred47_pollen())) {
                alt37=1;
            }
            else if ( (LA37_0==148) && (synpred48_pollen())) {
                alt37=2;
            }
            else if ( (LA37_0==180) && (synpred49_pollen())) {
                alt37=3;
            }
            else if ( (LA37_0==149) && (synpred50_pollen())) {
                alt37=4;
            }
            else if ( (LA37_0==156) && (synpred51_pollen())) {
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
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:391:10: ( 'module' )=> moduleDefinition
                    {
                    pushFollow(FOLLOW_moduleDefinition_in_unitTypeDefinition1926);
                    moduleDefinition114=moduleDefinition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, moduleDefinition114.getTree());

                    }
                    break;
                case 2 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:392:8: ( 'class' )=> classDefinition
                    {
                    pushFollow(FOLLOW_classDefinition_in_unitTypeDefinition1947);
                    classDefinition115=classDefinition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, classDefinition115.getTree());

                    }
                    break;
                case 3 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:393:10: ( 'protocol' )=> protocolDefinition
                    {
                    pushFollow(FOLLOW_protocolDefinition_in_unitTypeDefinition1964);
                    protocolDefinition116=protocolDefinition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, protocolDefinition116.getTree());

                    }
                    break;
                case 4 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:394:10: ( 'composition' )=> compositionDefinition
                    {
                    pushFollow(FOLLOW_compositionDefinition_in_unitTypeDefinition1982);
                    compositionDefinition117=compositionDefinition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, compositionDefinition117.getTree());

                    }
                    break;
                case 5 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:395:10: ( 'enum' )=> enumDefinition
                    {
                    pushFollow(FOLLOW_enumDefinition_in_unitTypeDefinition2000);
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
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:399:1: extendsClause : 'extends' ^ IDENT ;
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

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:400:5: ( 'extends' ^ IDENT )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:400:9: 'extends' ^ IDENT
            {
            root_0 = (BaseNode)adaptor.nil();


            string_literal119=(Atom)match(input,159,FOLLOW_159_in_extendsClause2025); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal119_tree = 
            (BaseNode)adaptor.create(string_literal119)
            ;
            root_0 = (BaseNode)adaptor.becomeRoot(string_literal119_tree, root_0);
            }

            IDENT120=(Atom)match(input,IDENT,FOLLOW_IDENT_in_extendsClause2028); if (state.failed) return retval;
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
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:403:1: implementsClause : 'implements' ^ IDENT ;
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

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:404:5: ( 'implements' ^ IDENT )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:404:9: 'implements' ^ IDENT
            {
            root_0 = (BaseNode)adaptor.nil();


            string_literal121=(Atom)match(input,166,FOLLOW_166_in_implementsClause2047); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal121_tree = 
            (BaseNode)adaptor.create(string_literal121)
            ;
            root_0 = (BaseNode)adaptor.becomeRoot(string_literal121_tree, root_0);
            }

            IDENT122=(Atom)match(input,IDENT,FOLLOW_IDENT_in_implementsClause2050); if (state.failed) return retval;
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
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:406:1: braceClose : ( NL !)* '}' ! ( NL !)* ;
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

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:407:5: ( ( NL !)* '}' ! ( NL !)* )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:407:10: ( NL !)* '}' ! ( NL !)*
            {
            root_0 = (BaseNode)adaptor.nil();


            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:407:10: ( NL !)*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==NL) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:407:11: NL !
            	    {
            	    NL123=(Atom)match(input,NL,FOLLOW_NL_in_braceClose2070); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);


            char_literal124=(Atom)match(input,196,FOLLOW_196_in_braceClose2075); if (state.failed) return retval;

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:407:22: ( NL !)*
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
            	    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:407:23: NL !
            	    {
            	    NL125=(Atom)match(input,NL,FOLLOW_NL_in_braceClose2079); if (state.failed) return retval;

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
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:409:1: braceCloseAtEOF : ( ( NL !)* ) '}' ! ( NL !)* ;
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

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:412:5: ( ( ( NL !)* ) '}' ! ( NL !)* )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:412:9: ( ( NL !)* ) '}' ! ( NL !)*
            {
            root_0 = (BaseNode)adaptor.nil();


            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:412:9: ( ( NL !)* )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:412:10: ( NL !)*
            {
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:412:12: ( NL !)*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==NL) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:412:12: NL !
            	    {
            	    NL126=(Atom)match(input,NL,FOLLOW_NL_in_braceCloseAtEOF2103); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);


            }


            char_literal127=(Atom)match(input,196,FOLLOW_196_in_braceCloseAtEOF2108); if (state.failed) return retval;

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:412:21: ( NL !)*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==NL) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:412:22: NL !
            	    {
            	    NL128=(Atom)match(input,NL,FOLLOW_NL_in_braceCloseAtEOF2112); if (state.failed) return retval;

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
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:415:1: braceOpen : ( NL !)* '{' ! ( NL !)* ;
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

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:416:5: ( ( NL !)* '{' ! ( NL !)* )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:416:10: ( NL !)* '{' ! ( NL !)*
            {
            root_0 = (BaseNode)adaptor.nil();


            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:416:10: ( NL !)*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==NL) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:416:11: NL !
            	    {
            	    NL129=(Atom)match(input,NL,FOLLOW_NL_in_braceOpen2137); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);


            char_literal130=(Atom)match(input,193,FOLLOW_193_in_braceOpen2142); if (state.failed) return retval;

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:416:22: ( NL !)*
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
            	    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:416:23: NL !
            	    {
            	    NL131=(Atom)match(input,NL,FOLLOW_NL_in_braceOpen2146); if (state.failed) return retval;

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
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:418:1: equalityOp : ( EQ | NOT_EQ );
    public final pollenParser.equalityOp_return equalityOp() throws RecognitionException {
        pollenParser.equalityOp_return retval = new pollenParser.equalityOp_return();
        retval.start = input.LT(1);

        int equalityOp_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom set132=null;

        BaseNode set132_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 38) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:419:2: ( EQ | NOT_EQ )
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
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:421:1: relationalOp : ( '<' | '>' | LT_EQ | GT_EQ );
    public final pollenParser.relationalOp_return relationalOp() throws RecognitionException {
        pollenParser.relationalOp_return retval = new pollenParser.relationalOp_return();
        retval.start = input.LT(1);

        int relationalOp_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom set133=null;

        BaseNode set133_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 39) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:422:2: ( '<' | '>' | LT_EQ | GT_EQ )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:
            {
            root_0 = (BaseNode)adaptor.nil();


            set133=(Atom)input.LT(1);

            if ( input.LA(1)==GT_EQ||input.LA(1)==LT_EQ||input.LA(1)==133||input.LA(1)==135 ) {
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
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:424:1: shiftOp : ( '<<' | '>>' );
    public final pollenParser.shiftOp_return shiftOp() throws RecognitionException {
        pollenParser.shiftOp_return retval = new pollenParser.shiftOp_return();
        retval.start = input.LT(1);

        int shiftOp_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom set134=null;

        BaseNode set134_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 40) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:425:2: ( '<<' | '>>' )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:
            {
            root_0 = (BaseNode)adaptor.nil();


            set134=(Atom)input.LT(1);

            if ( input.LA(1)==134||input.LA(1)==136 ) {
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
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:427:1: incDecOp : ( INC | DEC );
    public final pollenParser.incDecOp_return incDecOp() throws RecognitionException {
        pollenParser.incDecOp_return retval = new pollenParser.incDecOp_return();
        retval.start = input.LT(1);

        int incDecOp_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom set135=null;

        BaseNode set135_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 41) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:428:2: ( INC | DEC )
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
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:430:1: addSubOp : ( PLUS | MINUS );
    public final pollenParser.addSubOp_return addSubOp() throws RecognitionException {
        pollenParser.addSubOp_return retval = new pollenParser.addSubOp_return();
        retval.start = input.LT(1);

        int addSubOp_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom set136=null;

        BaseNode set136_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 42) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:431:2: ( PLUS | MINUS )
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
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:433:1: assignOp : ( ADD_EQ | SUB_EQ | MUL_EQ | DIV_EQ | MOD_EQ | LSHFT_EQ | RSHFT_EQ | BITAND_EQ | BITXOR_EQ | BITOR_EQ );
    public final pollenParser.assignOp_return assignOp() throws RecognitionException {
        pollenParser.assignOp_return retval = new pollenParser.assignOp_return();
        retval.start = input.LT(1);

        int assignOp_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom set137=null;

        BaseNode set137_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 43) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:434:2: ( ADD_EQ | SUB_EQ | MUL_EQ | DIV_EQ | MOD_EQ | LSHFT_EQ | RSHFT_EQ | BITAND_EQ | BITXOR_EQ | BITOR_EQ )
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
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:436:1: multDivModOp : ( '*' | '/' | '%' );
    public final pollenParser.multDivModOp_return multDivModOp() throws RecognitionException {
        pollenParser.multDivModOp_return retval = new pollenParser.multDivModOp_return();
        retval.start = input.LT(1);

        int multDivModOp_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom set138=null;

        BaseNode set138_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 44) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:437:2: ( '*' | '/' | '%' )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:
            {
            root_0 = (BaseNode)adaptor.nil();


            set138=(Atom)input.LT(1);

            if ( input.LA(1)==123||input.LA(1)==128||input.LA(1)==131 ) {
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
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:439:1: logicalNotOp : LOG_NOT ;
    public final pollenParser.logicalNotOp_return logicalNotOp() throws RecognitionException {
        pollenParser.logicalNotOp_return retval = new pollenParser.logicalNotOp_return();
        retval.start = input.LT(1);

        int logicalNotOp_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom LOG_NOT139=null;

        BaseNode LOG_NOT139_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 45) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:440:2: ( LOG_NOT )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:440:4: LOG_NOT
            {
            root_0 = (BaseNode)adaptor.nil();


            LOG_NOT139=(Atom)match(input,LOG_NOT,FOLLOW_LOG_NOT_in_logicalNotOp2323); if (state.failed) return retval;
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
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:442:1: bitwiseNotOp : BIT_NOT ;
    public final pollenParser.bitwiseNotOp_return bitwiseNotOp() throws RecognitionException {
        pollenParser.bitwiseNotOp_return retval = new pollenParser.bitwiseNotOp_return();
        retval.start = input.LT(1);

        int bitwiseNotOp_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom BIT_NOT140=null;

        BaseNode BIT_NOT140_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 46) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:443:2: ( BIT_NOT )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:443:4: BIT_NOT
            {
            root_0 = (BaseNode)adaptor.nil();


            BIT_NOT140=(Atom)match(input,BIT_NOT,FOLLOW_BIT_NOT_in_bitwiseNotOp2334); if (state.failed) return retval;
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
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:445:1: exprList : ( expr ( ',' expr )* -> ^( LIST[\"LIST\"] ( expr )+ ) | -> NIL );
    public final pollenParser.exprList_return exprList() throws RecognitionException {
        pollenParser.exprList_return retval = new pollenParser.exprList_return();
        retval.start = input.LT(1);

        int exprList_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom char_literal142=null;
        pollenParser.expr_return expr141 =null;

        pollenParser.expr_return expr143 =null;


        BaseNode char_literal142_tree=null;
        RewriteRuleTokenStream stream_129=new RewriteRuleTokenStream(adaptor,"token 129");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 47) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:446:2: ( expr ( ',' expr )* -> ^( LIST[\"LIST\"] ( expr )+ ) | -> NIL )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( ((LA45_0 >= BIT_NOT && LA45_0 <= CHAR)||LA45_0==DEC||LA45_0==HEX_LIT||LA45_0==IDENT||(LA45_0 >= INC && LA45_0 <= INT_LIT)||LA45_0==LOG_NOT||LA45_0==MINUS||LA45_0==OCT_LIT||LA45_0==REAL_LIT||LA45_0==STRING||LA45_0==126||(LA45_0 >= 138 && LA45_0 <= 139)||LA45_0==160||(LA45_0 >= 175 && LA45_0 <= 176)||LA45_0==186) ) {
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
            else if ( (LA45_0==NL||LA45_0==SEMI||LA45_0==127||LA45_0==129||LA45_0==140||(LA45_0 >= 143 && LA45_0 <= 153)||LA45_0==156||LA45_0==158||(LA45_0 >= 161 && LA45_0 <= 165)||LA45_0==167||(LA45_0 >= 169 && LA45_0 <= 171)||(LA45_0 >= 173 && LA45_0 <= 174)||(LA45_0 >= 179 && LA45_0 <= 185)||(LA45_0 >= 188 && LA45_0 <= 192)||LA45_0==196) ) {
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
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:446:4: expr ( ',' expr )*
                    {
                    pushFollow(FOLLOW_expr_in_exprList2345);
                    expr141=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr141.getTree());

                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:446:9: ( ',' expr )*
                    loop44:
                    do {
                        int alt44=2;
                        int LA44_0 = input.LA(1);

                        if ( (LA44_0==129) ) {
                            int LA44_1 = input.LA(2);

                            if ( (synpred76_pollen()) ) {
                                alt44=1;
                            }


                        }


                        switch (alt44) {
                    	case 1 :
                    	    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:446:10: ',' expr
                    	    {
                    	    char_literal142=(Atom)match(input,129,FOLLOW_129_in_exprList2348); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_129.add(char_literal142);


                    	    pushFollow(FOLLOW_expr_in_exprList2350);
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
                    // 447:3: -> ^( LIST[\"LIST\"] ( expr )+ )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:447:6: ^( LIST[\"LIST\"] ( expr )+ )
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
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:448:4: 
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
                    // 448:4: -> NIL
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
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:450:1: expr : ( exprLogicalOr '?' expr ':' expr -> ^( E_QUEST[\"E_QUEST\"] exprLogicalOr expr expr ) | exprLogicalOr );
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
        RewriteRuleTokenStream stream_132=new RewriteRuleTokenStream(adaptor,"token 132");
        RewriteRuleTokenStream stream_137=new RewriteRuleTokenStream(adaptor,"token 137");
        RewriteRuleSubtreeStream stream_exprLogicalOr=new RewriteRuleSubtreeStream(adaptor,"rule exprLogicalOr");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 48) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:451:2: ( exprLogicalOr '?' expr ':' expr -> ^( E_QUEST[\"E_QUEST\"] exprLogicalOr expr expr ) | exprLogicalOr )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( ((LA46_0 >= BIT_NOT && LA46_0 <= CHAR)||LA46_0==DEC||LA46_0==HEX_LIT||LA46_0==IDENT||(LA46_0 >= INC && LA46_0 <= INT_LIT)||LA46_0==LOG_NOT||LA46_0==MINUS||LA46_0==OCT_LIT||LA46_0==REAL_LIT||LA46_0==STRING||LA46_0==126||(LA46_0 >= 138 && LA46_0 <= 139)||LA46_0==160||(LA46_0 >= 175 && LA46_0 <= 176)||LA46_0==186) ) {
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
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:451:4: exprLogicalOr '?' expr ':' expr
                    {
                    pushFollow(FOLLOW_exprLogicalOr_in_expr2385);
                    exprLogicalOr144=exprLogicalOr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_exprLogicalOr.add(exprLogicalOr144.getTree());

                    char_literal145=(Atom)match(input,137,FOLLOW_137_in_expr2387); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_137.add(char_literal145);


                    pushFollow(FOLLOW_expr_in_expr2389);
                    expr146=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr146.getTree());

                    char_literal147=(Atom)match(input,132,FOLLOW_132_in_expr2391); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_132.add(char_literal147);


                    pushFollow(FOLLOW_expr_in_expr2393);
                    expr148=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr148.getTree());

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

                    root_0 = (BaseNode)adaptor.nil();
                    // 451:36: -> ^( E_QUEST[\"E_QUEST\"] exprLogicalOr expr expr )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:451:39: ^( E_QUEST[\"E_QUEST\"] exprLogicalOr expr expr )
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
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:452:4: exprLogicalOr
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    pushFollow(FOLLOW_exprLogicalOr_in_expr2416);
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
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:454:1: exprLogicalOr : ( exprLogicalAnd -> exprLogicalAnd ) ( '||' exprLogicalAnd -> ^( E_BINARY[\"E_BINARY\"] '||' $exprLogicalOr exprLogicalAnd ) )* ;
    public final pollenParser.exprLogicalOr_return exprLogicalOr() throws RecognitionException {
        pollenParser.exprLogicalOr_return retval = new pollenParser.exprLogicalOr_return();
        retval.start = input.LT(1);

        int exprLogicalOr_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom string_literal151=null;
        pollenParser.exprLogicalAnd_return exprLogicalAnd150 =null;

        pollenParser.exprLogicalAnd_return exprLogicalAnd152 =null;


        BaseNode string_literal151_tree=null;
        RewriteRuleTokenStream stream_195=new RewriteRuleTokenStream(adaptor,"token 195");
        RewriteRuleSubtreeStream stream_exprLogicalAnd=new RewriteRuleSubtreeStream(adaptor,"rule exprLogicalAnd");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 49) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:455:2: ( ( exprLogicalAnd -> exprLogicalAnd ) ( '||' exprLogicalAnd -> ^( E_BINARY[\"E_BINARY\"] '||' $exprLogicalOr exprLogicalAnd ) )* )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:455:4: ( exprLogicalAnd -> exprLogicalAnd ) ( '||' exprLogicalAnd -> ^( E_BINARY[\"E_BINARY\"] '||' $exprLogicalOr exprLogicalAnd ) )*
            {
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:455:4: ( exprLogicalAnd -> exprLogicalAnd )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:455:5: exprLogicalAnd
            {
            pushFollow(FOLLOW_exprLogicalAnd_in_exprLogicalOr2434);
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
            // 455:20: -> exprLogicalAnd
            {
                adaptor.addChild(root_0, stream_exprLogicalAnd.nextTree());

            }


            retval.tree = root_0;
            }

            }


            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:456:3: ( '||' exprLogicalAnd -> ^( E_BINARY[\"E_BINARY\"] '||' $exprLogicalOr exprLogicalAnd ) )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==195) ) {
                    int LA47_1 = input.LA(2);

                    if ( (synpred79_pollen()) ) {
                        alt47=1;
                    }


                }


                switch (alt47) {
            	case 1 :
            	    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:457:4: '||' exprLogicalAnd
            	    {
            	    string_literal151=(Atom)match(input,195,FOLLOW_195_in_exprLogicalOr2448); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_195.add(string_literal151);


            	    pushFollow(FOLLOW_exprLogicalAnd_in_exprLogicalOr2450);
            	    exprLogicalAnd152=exprLogicalAnd();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_exprLogicalAnd.add(exprLogicalAnd152.getTree());

            	    // AST REWRITE
            	    // elements: 195, exprLogicalOr, exprLogicalAnd
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    if ( state.backtracking==0 ) {

            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	    root_0 = (BaseNode)adaptor.nil();
            	    // 458:5: -> ^( E_BINARY[\"E_BINARY\"] '||' $exprLogicalOr exprLogicalAnd )
            	    {
            	        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:458:8: ^( E_BINARY[\"E_BINARY\"] '||' $exprLogicalOr exprLogicalAnd )
            	        {
            	        BaseNode root_1 = (BaseNode)adaptor.nil();
            	        root_1 = (BaseNode)adaptor.becomeRoot(
            	        new ExprNode.Binary(E_BINARY, "E_BINARY")
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
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:461:1: exprLogicalAnd : ( exprBitwiseOr -> exprBitwiseOr ) ( '&&' exprBitwiseOr -> ^( E_BINARY[\"E_BINARY\"] '&&' $exprLogicalAnd exprBitwiseOr ) )* ;
    public final pollenParser.exprLogicalAnd_return exprLogicalAnd() throws RecognitionException {
        pollenParser.exprLogicalAnd_return retval = new pollenParser.exprLogicalAnd_return();
        retval.start = input.LT(1);

        int exprLogicalAnd_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom string_literal154=null;
        pollenParser.exprBitwiseOr_return exprBitwiseOr153 =null;

        pollenParser.exprBitwiseOr_return exprBitwiseOr155 =null;


        BaseNode string_literal154_tree=null;
        RewriteRuleTokenStream stream_124=new RewriteRuleTokenStream(adaptor,"token 124");
        RewriteRuleSubtreeStream stream_exprBitwiseOr=new RewriteRuleSubtreeStream(adaptor,"rule exprBitwiseOr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 50) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:462:2: ( ( exprBitwiseOr -> exprBitwiseOr ) ( '&&' exprBitwiseOr -> ^( E_BINARY[\"E_BINARY\"] '&&' $exprLogicalAnd exprBitwiseOr ) )* )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:462:4: ( exprBitwiseOr -> exprBitwiseOr ) ( '&&' exprBitwiseOr -> ^( E_BINARY[\"E_BINARY\"] '&&' $exprLogicalAnd exprBitwiseOr ) )*
            {
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:462:4: ( exprBitwiseOr -> exprBitwiseOr )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:462:5: exprBitwiseOr
            {
            pushFollow(FOLLOW_exprBitwiseOr_in_exprLogicalAnd2489);
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
            // 462:19: -> exprBitwiseOr
            {
                adaptor.addChild(root_0, stream_exprBitwiseOr.nextTree());

            }


            retval.tree = root_0;
            }

            }


            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:463:2: ( '&&' exprBitwiseOr -> ^( E_BINARY[\"E_BINARY\"] '&&' $exprLogicalAnd exprBitwiseOr ) )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==124) ) {
                    int LA48_1 = input.LA(2);

                    if ( (synpred80_pollen()) ) {
                        alt48=1;
                    }


                }


                switch (alt48) {
            	case 1 :
            	    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:464:3: '&&' exprBitwiseOr
            	    {
            	    string_literal154=(Atom)match(input,124,FOLLOW_124_in_exprLogicalAnd2501); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_124.add(string_literal154);


            	    pushFollow(FOLLOW_exprBitwiseOr_in_exprLogicalAnd2503);
            	    exprBitwiseOr155=exprBitwiseOr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_exprBitwiseOr.add(exprBitwiseOr155.getTree());

            	    // AST REWRITE
            	    // elements: exprLogicalAnd, 124, exprBitwiseOr
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    if ( state.backtracking==0 ) {

            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	    root_0 = (BaseNode)adaptor.nil();
            	    // 465:4: -> ^( E_BINARY[\"E_BINARY\"] '&&' $exprLogicalAnd exprBitwiseOr )
            	    {
            	        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:465:7: ^( E_BINARY[\"E_BINARY\"] '&&' $exprLogicalAnd exprBitwiseOr )
            	        {
            	        BaseNode root_1 = (BaseNode)adaptor.nil();
            	        root_1 = (BaseNode)adaptor.becomeRoot(
            	        new ExprNode.Binary(E_BINARY, "E_BINARY")
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
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:468:1: exprBitwiseOr : ( exprBitwiseXor -> exprBitwiseXor ) ( '|' exprBitwiseXor -> ^( E_BINARY[\"E_BINARY\"] '|' $exprBitwiseOr exprBitwiseXor ) )* ;
    public final pollenParser.exprBitwiseOr_return exprBitwiseOr() throws RecognitionException {
        pollenParser.exprBitwiseOr_return retval = new pollenParser.exprBitwiseOr_return();
        retval.start = input.LT(1);

        int exprBitwiseOr_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom char_literal157=null;
        pollenParser.exprBitwiseXor_return exprBitwiseXor156 =null;

        pollenParser.exprBitwiseXor_return exprBitwiseXor158 =null;


        BaseNode char_literal157_tree=null;
        RewriteRuleTokenStream stream_194=new RewriteRuleTokenStream(adaptor,"token 194");
        RewriteRuleSubtreeStream stream_exprBitwiseXor=new RewriteRuleSubtreeStream(adaptor,"rule exprBitwiseXor");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 51) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:469:2: ( ( exprBitwiseXor -> exprBitwiseXor ) ( '|' exprBitwiseXor -> ^( E_BINARY[\"E_BINARY\"] '|' $exprBitwiseOr exprBitwiseXor ) )* )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:469:4: ( exprBitwiseXor -> exprBitwiseXor ) ( '|' exprBitwiseXor -> ^( E_BINARY[\"E_BINARY\"] '|' $exprBitwiseOr exprBitwiseXor ) )*
            {
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:469:4: ( exprBitwiseXor -> exprBitwiseXor )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:469:5: exprBitwiseXor
            {
            pushFollow(FOLLOW_exprBitwiseXor_in_exprBitwiseOr2540);
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
            // 469:20: -> exprBitwiseXor
            {
                adaptor.addChild(root_0, stream_exprBitwiseXor.nextTree());

            }


            retval.tree = root_0;
            }

            }


            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:470:2: ( '|' exprBitwiseXor -> ^( E_BINARY[\"E_BINARY\"] '|' $exprBitwiseOr exprBitwiseXor ) )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==194) ) {
                    int LA49_1 = input.LA(2);

                    if ( (synpred81_pollen()) ) {
                        alt49=1;
                    }


                }


                switch (alt49) {
            	case 1 :
            	    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:471:3: '|' exprBitwiseXor
            	    {
            	    char_literal157=(Atom)match(input,194,FOLLOW_194_in_exprBitwiseOr2552); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_194.add(char_literal157);


            	    pushFollow(FOLLOW_exprBitwiseXor_in_exprBitwiseOr2554);
            	    exprBitwiseXor158=exprBitwiseXor();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_exprBitwiseXor.add(exprBitwiseXor158.getTree());

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

            	    root_0 = (BaseNode)adaptor.nil();
            	    // 472:3: -> ^( E_BINARY[\"E_BINARY\"] '|' $exprBitwiseOr exprBitwiseXor )
            	    {
            	        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:472:6: ^( E_BINARY[\"E_BINARY\"] '|' $exprBitwiseOr exprBitwiseXor )
            	        {
            	        BaseNode root_1 = (BaseNode)adaptor.nil();
            	        root_1 = (BaseNode)adaptor.becomeRoot(
            	        new ExprNode.Binary(E_BINARY, "E_BINARY")
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
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:475:1: exprBitwiseXor : ( exprBitwiseAnd -> exprBitwiseAnd ) ( '^' exprBitwiseAnd -> ^( E_BINARY[\"E_BINARY\"] '^' $exprBitwiseXor exprBitwiseAnd ) )* ;
    public final pollenParser.exprBitwiseXor_return exprBitwiseXor() throws RecognitionException {
        pollenParser.exprBitwiseXor_return retval = new pollenParser.exprBitwiseXor_return();
        retval.start = input.LT(1);

        int exprBitwiseXor_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom char_literal160=null;
        pollenParser.exprBitwiseAnd_return exprBitwiseAnd159 =null;

        pollenParser.exprBitwiseAnd_return exprBitwiseAnd161 =null;


        BaseNode char_literal160_tree=null;
        RewriteRuleTokenStream stream_141=new RewriteRuleTokenStream(adaptor,"token 141");
        RewriteRuleSubtreeStream stream_exprBitwiseAnd=new RewriteRuleSubtreeStream(adaptor,"rule exprBitwiseAnd");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 52) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:476:2: ( ( exprBitwiseAnd -> exprBitwiseAnd ) ( '^' exprBitwiseAnd -> ^( E_BINARY[\"E_BINARY\"] '^' $exprBitwiseXor exprBitwiseAnd ) )* )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:476:4: ( exprBitwiseAnd -> exprBitwiseAnd ) ( '^' exprBitwiseAnd -> ^( E_BINARY[\"E_BINARY\"] '^' $exprBitwiseXor exprBitwiseAnd ) )*
            {
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:476:4: ( exprBitwiseAnd -> exprBitwiseAnd )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:476:5: exprBitwiseAnd
            {
            pushFollow(FOLLOW_exprBitwiseAnd_in_exprBitwiseXor2590);
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
            // 476:20: -> exprBitwiseAnd
            {
                adaptor.addChild(root_0, stream_exprBitwiseAnd.nextTree());

            }


            retval.tree = root_0;
            }

            }


            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:477:2: ( '^' exprBitwiseAnd -> ^( E_BINARY[\"E_BINARY\"] '^' $exprBitwiseXor exprBitwiseAnd ) )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==141) ) {
                    int LA50_1 = input.LA(2);

                    if ( (synpred82_pollen()) ) {
                        alt50=1;
                    }


                }


                switch (alt50) {
            	case 1 :
            	    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:478:3: '^' exprBitwiseAnd
            	    {
            	    char_literal160=(Atom)match(input,141,FOLLOW_141_in_exprBitwiseXor2602); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_141.add(char_literal160);


            	    pushFollow(FOLLOW_exprBitwiseAnd_in_exprBitwiseXor2604);
            	    exprBitwiseAnd161=exprBitwiseAnd();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_exprBitwiseAnd.add(exprBitwiseAnd161.getTree());

            	    // AST REWRITE
            	    // elements: exprBitwiseXor, 141, exprBitwiseAnd
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    if ( state.backtracking==0 ) {

            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	    root_0 = (BaseNode)adaptor.nil();
            	    // 479:3: -> ^( E_BINARY[\"E_BINARY\"] '^' $exprBitwiseXor exprBitwiseAnd )
            	    {
            	        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:479:6: ^( E_BINARY[\"E_BINARY\"] '^' $exprBitwiseXor exprBitwiseAnd )
            	        {
            	        BaseNode root_1 = (BaseNode)adaptor.nil();
            	        root_1 = (BaseNode)adaptor.becomeRoot(
            	        new ExprNode.Binary(E_BINARY, "E_BINARY")
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
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:482:1: exprBitwiseAnd : ( exprEquality -> exprEquality ) ( '&' exprEquality -> ^( E_BINARY[\"E_BINARY\"] '&' $exprBitwiseAnd exprEquality ) )* ;
    public final pollenParser.exprBitwiseAnd_return exprBitwiseAnd() throws RecognitionException {
        pollenParser.exprBitwiseAnd_return retval = new pollenParser.exprBitwiseAnd_return();
        retval.start = input.LT(1);

        int exprBitwiseAnd_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom char_literal163=null;
        pollenParser.exprEquality_return exprEquality162 =null;

        pollenParser.exprEquality_return exprEquality164 =null;


        BaseNode char_literal163_tree=null;
        RewriteRuleTokenStream stream_125=new RewriteRuleTokenStream(adaptor,"token 125");
        RewriteRuleSubtreeStream stream_exprEquality=new RewriteRuleSubtreeStream(adaptor,"rule exprEquality");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 53) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:483:2: ( ( exprEquality -> exprEquality ) ( '&' exprEquality -> ^( E_BINARY[\"E_BINARY\"] '&' $exprBitwiseAnd exprEquality ) )* )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:483:4: ( exprEquality -> exprEquality ) ( '&' exprEquality -> ^( E_BINARY[\"E_BINARY\"] '&' $exprBitwiseAnd exprEquality ) )*
            {
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:483:4: ( exprEquality -> exprEquality )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:483:5: exprEquality
            {
            pushFollow(FOLLOW_exprEquality_in_exprBitwiseAnd2640);
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
            // 483:18: -> exprEquality
            {
                adaptor.addChild(root_0, stream_exprEquality.nextTree());

            }


            retval.tree = root_0;
            }

            }


            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:484:2: ( '&' exprEquality -> ^( E_BINARY[\"E_BINARY\"] '&' $exprBitwiseAnd exprEquality ) )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==125) ) {
                    int LA51_1 = input.LA(2);

                    if ( (synpred83_pollen()) ) {
                        alt51=1;
                    }


                }


                switch (alt51) {
            	case 1 :
            	    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:485:3: '&' exprEquality
            	    {
            	    char_literal163=(Atom)match(input,125,FOLLOW_125_in_exprBitwiseAnd2652); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_125.add(char_literal163);


            	    pushFollow(FOLLOW_exprEquality_in_exprBitwiseAnd2654);
            	    exprEquality164=exprEquality();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_exprEquality.add(exprEquality164.getTree());

            	    // AST REWRITE
            	    // elements: exprBitwiseAnd, 125, exprEquality
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    if ( state.backtracking==0 ) {

            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	    root_0 = (BaseNode)adaptor.nil();
            	    // 486:3: -> ^( E_BINARY[\"E_BINARY\"] '&' $exprBitwiseAnd exprEquality )
            	    {
            	        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:486:6: ^( E_BINARY[\"E_BINARY\"] '&' $exprBitwiseAnd exprEquality )
            	        {
            	        BaseNode root_1 = (BaseNode)adaptor.nil();
            	        root_1 = (BaseNode)adaptor.becomeRoot(
            	        new ExprNode.Binary(E_BINARY, "E_BINARY")
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
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:489:1: exprEquality : ( exprRelational -> exprRelational ) ( equalityOp exprRelational -> ^( E_BINARY[\"E_BINARY\"] equalityOp $exprEquality exprRelational ) )* ;
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

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:490:2: ( ( exprRelational -> exprRelational ) ( equalityOp exprRelational -> ^( E_BINARY[\"E_BINARY\"] equalityOp $exprEquality exprRelational ) )* )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:490:4: ( exprRelational -> exprRelational ) ( equalityOp exprRelational -> ^( E_BINARY[\"E_BINARY\"] equalityOp $exprEquality exprRelational ) )*
            {
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:490:4: ( exprRelational -> exprRelational )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:490:5: exprRelational
            {
            pushFollow(FOLLOW_exprRelational_in_exprEquality2690);
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
            // 490:20: -> exprRelational
            {
                adaptor.addChild(root_0, stream_exprRelational.nextTree());

            }


            retval.tree = root_0;
            }

            }


            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:491:2: ( equalityOp exprRelational -> ^( E_BINARY[\"E_BINARY\"] equalityOp $exprEquality exprRelational ) )*
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
            	    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:492:3: equalityOp exprRelational
            	    {
            	    pushFollow(FOLLOW_equalityOp_in_exprEquality2703);
            	    equalityOp166=equalityOp();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_equalityOp.add(equalityOp166.getTree());

            	    pushFollow(FOLLOW_exprRelational_in_exprEquality2705);
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
            	    // 493:3: -> ^( E_BINARY[\"E_BINARY\"] equalityOp $exprEquality exprRelational )
            	    {
            	        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:493:6: ^( E_BINARY[\"E_BINARY\"] equalityOp $exprEquality exprRelational )
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
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:496:1: exprRelational : ( exprShift -> exprShift ) ( relationalOp exprShift -> ^( E_BINARY[\"E_BINARY\"] relationalOp $exprRelational exprShift ) )* ;
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

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:497:2: ( ( exprShift -> exprShift ) ( relationalOp exprShift -> ^( E_BINARY[\"E_BINARY\"] relationalOp $exprRelational exprShift ) )* )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:497:4: ( exprShift -> exprShift ) ( relationalOp exprShift -> ^( E_BINARY[\"E_BINARY\"] relationalOp $exprRelational exprShift ) )*
            {
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:497:4: ( exprShift -> exprShift )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:497:5: exprShift
            {
            pushFollow(FOLLOW_exprShift_in_exprRelational2741);
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
            // 497:15: -> exprShift
            {
                adaptor.addChild(root_0, stream_exprShift.nextTree());

            }


            retval.tree = root_0;
            }

            }


            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:498:2: ( relationalOp exprShift -> ^( E_BINARY[\"E_BINARY\"] relationalOp $exprRelational exprShift ) )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==GT_EQ||LA53_0==LT_EQ||LA53_0==133||LA53_0==135) ) {
                    int LA53_1 = input.LA(2);

                    if ( (synpred85_pollen()) ) {
                        alt53=1;
                    }


                }


                switch (alt53) {
            	case 1 :
            	    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:499:3: relationalOp exprShift
            	    {
            	    pushFollow(FOLLOW_relationalOp_in_exprRelational2754);
            	    relationalOp169=relationalOp();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_relationalOp.add(relationalOp169.getTree());

            	    pushFollow(FOLLOW_exprShift_in_exprRelational2756);
            	    exprShift170=exprShift();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_exprShift.add(exprShift170.getTree());

            	    // AST REWRITE
            	    // elements: relationalOp, exprShift, exprRelational
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    if ( state.backtracking==0 ) {

            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	    root_0 = (BaseNode)adaptor.nil();
            	    // 500:3: -> ^( E_BINARY[\"E_BINARY\"] relationalOp $exprRelational exprShift )
            	    {
            	        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:500:6: ^( E_BINARY[\"E_BINARY\"] relationalOp $exprRelational exprShift )
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
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:503:1: exprShift : ( exprAddSub -> exprAddSub ) ( shiftOp exprAddSub -> ^( E_BINARY[\"E_BINARY\"] shiftOp $exprShift exprAddSub ) )* ;
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

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:504:2: ( ( exprAddSub -> exprAddSub ) ( shiftOp exprAddSub -> ^( E_BINARY[\"E_BINARY\"] shiftOp $exprShift exprAddSub ) )* )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:504:4: ( exprAddSub -> exprAddSub ) ( shiftOp exprAddSub -> ^( E_BINARY[\"E_BINARY\"] shiftOp $exprShift exprAddSub ) )*
            {
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:504:4: ( exprAddSub -> exprAddSub )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:504:5: exprAddSub
            {
            pushFollow(FOLLOW_exprAddSub_in_exprShift2793);
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
            // 504:16: -> exprAddSub
            {
                adaptor.addChild(root_0, stream_exprAddSub.nextTree());

            }


            retval.tree = root_0;
            }

            }


            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:505:2: ( shiftOp exprAddSub -> ^( E_BINARY[\"E_BINARY\"] shiftOp $exprShift exprAddSub ) )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==134||LA54_0==136) ) {
                    int LA54_1 = input.LA(2);

                    if ( (synpred86_pollen()) ) {
                        alt54=1;
                    }


                }


                switch (alt54) {
            	case 1 :
            	    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:506:3: shiftOp exprAddSub
            	    {
            	    pushFollow(FOLLOW_shiftOp_in_exprShift2806);
            	    shiftOp172=shiftOp();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_shiftOp.add(shiftOp172.getTree());

            	    pushFollow(FOLLOW_exprAddSub_in_exprShift2809);
            	    exprAddSub173=exprAddSub();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_exprAddSub.add(exprAddSub173.getTree());

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

            	    root_0 = (BaseNode)adaptor.nil();
            	    // 507:3: -> ^( E_BINARY[\"E_BINARY\"] shiftOp $exprShift exprAddSub )
            	    {
            	        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:507:6: ^( E_BINARY[\"E_BINARY\"] shiftOp $exprShift exprAddSub )
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
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:510:1: exprAddSub : ( exprMultDiv -> exprMultDiv ) ( addSubOp exprMultDiv -> ^( E_BINARY[\"E_BINARY\"] addSubOp $exprAddSub exprMultDiv ) )* ;
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

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:511:2: ( ( exprMultDiv -> exprMultDiv ) ( addSubOp exprMultDiv -> ^( E_BINARY[\"E_BINARY\"] addSubOp $exprAddSub exprMultDiv ) )* )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:511:4: ( exprMultDiv -> exprMultDiv ) ( addSubOp exprMultDiv -> ^( E_BINARY[\"E_BINARY\"] addSubOp $exprAddSub exprMultDiv ) )*
            {
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:511:4: ( exprMultDiv -> exprMultDiv )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:511:5: exprMultDiv
            {
            pushFollow(FOLLOW_exprMultDiv_in_exprAddSub2846);
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
            // 511:17: -> exprMultDiv
            {
                adaptor.addChild(root_0, stream_exprMultDiv.nextTree());

            }


            retval.tree = root_0;
            }

            }


            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:512:2: ( addSubOp exprMultDiv -> ^( E_BINARY[\"E_BINARY\"] addSubOp $exprAddSub exprMultDiv ) )*
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
            	    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:513:3: addSubOp exprMultDiv
            	    {
            	    pushFollow(FOLLOW_addSubOp_in_exprAddSub2858);
            	    addSubOp175=addSubOp();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_addSubOp.add(addSubOp175.getTree());

            	    pushFollow(FOLLOW_exprMultDiv_in_exprAddSub2860);
            	    exprMultDiv176=exprMultDiv();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_exprMultDiv.add(exprMultDiv176.getTree());

            	    // AST REWRITE
            	    // elements: exprAddSub, exprMultDiv, addSubOp
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    if ( state.backtracking==0 ) {

            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	    root_0 = (BaseNode)adaptor.nil();
            	    // 514:3: -> ^( E_BINARY[\"E_BINARY\"] addSubOp $exprAddSub exprMultDiv )
            	    {
            	        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:514:6: ^( E_BINARY[\"E_BINARY\"] addSubOp $exprAddSub exprMultDiv )
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
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:517:1: exprMultDiv : ( exprUnary -> exprUnary ) ( multDivModOp exprUnary -> ^( E_BINARY[\"E_BINARY\"] multDivModOp $exprMultDiv exprUnary ) )* ;
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

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:518:2: ( ( exprUnary -> exprUnary ) ( multDivModOp exprUnary -> ^( E_BINARY[\"E_BINARY\"] multDivModOp $exprMultDiv exprUnary ) )* )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:518:4: ( exprUnary -> exprUnary ) ( multDivModOp exprUnary -> ^( E_BINARY[\"E_BINARY\"] multDivModOp $exprMultDiv exprUnary ) )*
            {
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:518:4: ( exprUnary -> exprUnary )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:518:5: exprUnary
            {
            pushFollow(FOLLOW_exprUnary_in_exprMultDiv2903);
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
            // 518:15: -> exprUnary
            {
                adaptor.addChild(root_0, stream_exprUnary.nextTree());

            }


            retval.tree = root_0;
            }

            }


            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:519:2: ( multDivModOp exprUnary -> ^( E_BINARY[\"E_BINARY\"] multDivModOp $exprMultDiv exprUnary ) )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==123||LA56_0==128||LA56_0==131) ) {
                    int LA56_1 = input.LA(2);

                    if ( (synpred88_pollen()) ) {
                        alt56=1;
                    }


                }


                switch (alt56) {
            	case 1 :
            	    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:520:3: multDivModOp exprUnary
            	    {
            	    pushFollow(FOLLOW_multDivModOp_in_exprMultDiv2915);
            	    multDivModOp178=multDivModOp();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_multDivModOp.add(multDivModOp178.getTree());

            	    pushFollow(FOLLOW_exprUnary_in_exprMultDiv2917);
            	    exprUnary179=exprUnary();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_exprUnary.add(exprUnary179.getTree());

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

            	    root_0 = (BaseNode)adaptor.nil();
            	    // 521:3: -> ^( E_BINARY[\"E_BINARY\"] multDivModOp $exprMultDiv exprUnary )
            	    {
            	        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:521:6: ^( E_BINARY[\"E_BINARY\"] multDivModOp $exprMultDiv exprUnary )
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
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:524:1: exprNew : 'new' typeName fcnArgumentList -> ^( E_NEW[\"E_NEW\"] typeName fcnArgumentList ) ;
    public final pollenParser.exprNew_return exprNew() throws RecognitionException {
        pollenParser.exprNew_return retval = new pollenParser.exprNew_return();
        retval.start = input.LT(1);

        int exprNew_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom string_literal180=null;
        pollenParser.typeName_return typeName181 =null;

        pollenParser.fcnArgumentList_return fcnArgumentList182 =null;


        BaseNode string_literal180_tree=null;
        RewriteRuleTokenStream stream_175=new RewriteRuleTokenStream(adaptor,"token 175");
        RewriteRuleSubtreeStream stream_typeName=new RewriteRuleSubtreeStream(adaptor,"rule typeName");
        RewriteRuleSubtreeStream stream_fcnArgumentList=new RewriteRuleSubtreeStream(adaptor,"rule fcnArgumentList");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 59) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:525:2: ( 'new' typeName fcnArgumentList -> ^( E_NEW[\"E_NEW\"] typeName fcnArgumentList ) )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:525:4: 'new' typeName fcnArgumentList
            {
            string_literal180=(Atom)match(input,175,FOLLOW_175_in_exprNew2952); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_175.add(string_literal180);


            pushFollow(FOLLOW_typeName_in_exprNew2954);
            typeName181=typeName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeName.add(typeName181.getTree());

            pushFollow(FOLLOW_fcnArgumentList_in_exprNew2956);
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
            // 525:35: -> ^( E_NEW[\"E_NEW\"] typeName fcnArgumentList )
            {
                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:525:38: ^( E_NEW[\"E_NEW\"] typeName fcnArgumentList )
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
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:527:1: exprUnary : ( primitiveLit | injectionCode | arrayLit -> ^( E_VEC[\"E_VEC\"] arrayLit ) | logicalNotOp expr -> ^( E_UNARY[\"E_UNARY\"] logicalNotOp expr ) | bitwiseNotOp expr -> ^( E_UNARY[\"E_UNARY\"] bitwiseNotOp expr ) | '(' expr ')' -> ^( E_PAREN expr ) | MINUS expr -> ^( E_UNARY[\"E_UNARY\"] MINUS expr ) | varOrFcnOrArray incDecOp -> ^( E_UNARY[\"E_UNARY\", true] varOrFcnOrArray incDecOp ) | varOrFcnOrArray | incDecOp varOrFcnOrArray -> ^( E_UNARY[\"E_UNARY\"] varOrFcnOrArray incDecOp ) | exprNew );
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

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:528:2: ( primitiveLit | injectionCode | arrayLit -> ^( E_VEC[\"E_VEC\"] arrayLit ) | logicalNotOp expr -> ^( E_UNARY[\"E_UNARY\"] logicalNotOp expr ) | bitwiseNotOp expr -> ^( E_UNARY[\"E_UNARY\"] bitwiseNotOp expr ) | '(' expr ')' -> ^( E_PAREN expr ) | MINUS expr -> ^( E_UNARY[\"E_UNARY\"] MINUS expr ) | varOrFcnOrArray incDecOp -> ^( E_UNARY[\"E_UNARY\", true] varOrFcnOrArray incDecOp ) | varOrFcnOrArray | incDecOp varOrFcnOrArray -> ^( E_UNARY[\"E_UNARY\"] varOrFcnOrArray incDecOp ) | exprNew )
            int alt57=11;
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
                alt57=1;
                }
                break;
            case INJECT:
                {
                alt57=2;
                }
                break;
            case 139:
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
            case 126:
                {
                alt57=6;
                }
                break;
            case MINUS:
                {
                alt57=7;
                }
                break;
            case 175:
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
            case 138:
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
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:528:4: primitiveLit
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    pushFollow(FOLLOW_primitiveLit_in_exprUnary2982);
                    primitiveLit183=primitiveLit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveLit183.getTree());

                    }
                    break;
                case 2 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:529:4: injectionCode
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    pushFollow(FOLLOW_injectionCode_in_exprUnary2987);
                    injectionCode184=injectionCode();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, injectionCode184.getTree());

                    }
                    break;
                case 3 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:530:4: arrayLit
                    {
                    pushFollow(FOLLOW_arrayLit_in_exprUnary2992);
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
                    // 530:18: -> ^( E_VEC[\"E_VEC\"] arrayLit )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:530:21: ^( E_VEC[\"E_VEC\"] arrayLit )
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
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:531:4: logicalNotOp expr
                    {
                    pushFollow(FOLLOW_logicalNotOp_in_exprUnary3016);
                    logicalNotOp186=logicalNotOp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_logicalNotOp.add(logicalNotOp186.getTree());

                    pushFollow(FOLLOW_expr_in_exprUnary3018);
                    expr187=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr187.getTree());

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

                    root_0 = (BaseNode)adaptor.nil();
                    // 531:25: -> ^( E_UNARY[\"E_UNARY\"] logicalNotOp expr )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:531:28: ^( E_UNARY[\"E_UNARY\"] logicalNotOp expr )
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
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:532:4: bitwiseNotOp expr
                    {
                    pushFollow(FOLLOW_bitwiseNotOp_in_exprUnary3042);
                    bitwiseNotOp188=bitwiseNotOp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_bitwiseNotOp.add(bitwiseNotOp188.getTree());

                    pushFollow(FOLLOW_expr_in_exprUnary3044);
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
                    // 532:25: -> ^( E_UNARY[\"E_UNARY\"] bitwiseNotOp expr )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:532:28: ^( E_UNARY[\"E_UNARY\"] bitwiseNotOp expr )
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
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:533:4: '(' expr ')'
                    {
                    char_literal190=(Atom)match(input,126,FOLLOW_126_in_exprUnary3068); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_126.add(char_literal190);


                    pushFollow(FOLLOW_expr_in_exprUnary3070);
                    expr191=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr191.getTree());

                    char_literal192=(Atom)match(input,127,FOLLOW_127_in_exprUnary3072); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_127.add(char_literal192);


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
                    // 533:20: -> ^( E_PAREN expr )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:533:23: ^( E_PAREN expr )
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
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:534:4: MINUS expr
                    {
                    MINUS193=(Atom)match(input,MINUS,FOLLOW_MINUS_in_exprUnary3088); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MINUS.add(MINUS193);


                    pushFollow(FOLLOW_expr_in_exprUnary3090);
                    expr194=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr194.getTree());

                    // AST REWRITE
                    // elements: expr, MINUS
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (BaseNode)adaptor.nil();
                    // 534:19: -> ^( E_UNARY[\"E_UNARY\"] MINUS expr )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:534:22: ^( E_UNARY[\"E_UNARY\"] MINUS expr )
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
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:535:4: varOrFcnOrArray incDecOp
                    {
                    pushFollow(FOLLOW_varOrFcnOrArray_in_exprUnary3115);
                    varOrFcnOrArray195=varOrFcnOrArray();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_varOrFcnOrArray.add(varOrFcnOrArray195.getTree());

                    pushFollow(FOLLOW_incDecOp_in_exprUnary3117);
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
                    // 535:29: -> ^( E_UNARY[\"E_UNARY\", true] varOrFcnOrArray incDecOp )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:535:32: ^( E_UNARY[\"E_UNARY\", true] varOrFcnOrArray incDecOp )
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
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:536:4: varOrFcnOrArray
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    pushFollow(FOLLOW_varOrFcnOrArray_in_exprUnary3138);
                    varOrFcnOrArray197=varOrFcnOrArray();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varOrFcnOrArray197.getTree());

                    }
                    break;
                case 10 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:537:4: incDecOp varOrFcnOrArray
                    {
                    pushFollow(FOLLOW_incDecOp_in_exprUnary3143);
                    incDecOp198=incDecOp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_incDecOp.add(incDecOp198.getTree());

                    pushFollow(FOLLOW_varOrFcnOrArray_in_exprUnary3145);
                    varOrFcnOrArray199=varOrFcnOrArray();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_varOrFcnOrArray.add(varOrFcnOrArray199.getTree());

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
                    // 537:29: -> ^( E_UNARY[\"E_UNARY\"] varOrFcnOrArray incDecOp )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:537:32: ^( E_UNARY[\"E_UNARY\"] varOrFcnOrArray incDecOp )
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
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:538:4: exprNew
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    pushFollow(FOLLOW_exprNew_in_exprUnary3166);
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
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:540:1: fcnDefinition : ( 'public' )? ( 'host' )? fcnType_fcnName fcnFormalParameterList fcnBody[$fcnFormalParameterList.tree] -> ^( D_FCN_DEF[\"D_FCN_DEF\", atFlags] fcnType_fcnName fcnFormalParameterList fcnBody ) ;
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
        RewriteRuleTokenStream stream_182=new RewriteRuleTokenStream(adaptor,"token 182");
        RewriteRuleTokenStream stream_164=new RewriteRuleTokenStream(adaptor,"token 164");
        RewriteRuleSubtreeStream stream_fcnFormalParameterList=new RewriteRuleSubtreeStream(adaptor,"rule fcnFormalParameterList");
        RewriteRuleSubtreeStream stream_fcnType_fcnName=new RewriteRuleSubtreeStream(adaptor,"rule fcnType_fcnName");
        RewriteRuleSubtreeStream stream_fcnBody=new RewriteRuleSubtreeStream(adaptor,"rule fcnBody");

        	atFlags.clear();			

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 61) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:547:2: ( ( 'public' )? ( 'host' )? fcnType_fcnName fcnFormalParameterList fcnBody[$fcnFormalParameterList.tree] -> ^( D_FCN_DEF[\"D_FCN_DEF\", atFlags] fcnType_fcnName fcnFormalParameterList fcnBody ) )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:547:4: ( 'public' )? ( 'host' )? fcnType_fcnName fcnFormalParameterList fcnBody[$fcnFormalParameterList.tree]
            {
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:547:4: ( 'public' )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==182) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:547:5: 'public'
                    {
                    string_literal201=(Atom)match(input,182,FOLLOW_182_in_fcnDefinition3186); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_182.add(string_literal201);


                    if ( state.backtracking==0 ) { atFlags.add(Flags.PUBLIC); }

                    }
                    break;

            }


            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:548:3: ( 'host' )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==164) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:548:4: 'host'
                    {
                    string_literal202=(Atom)match(input,164,FOLLOW_164_in_fcnDefinition3197); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_164.add(string_literal202);


                    if ( state.backtracking==0 ) { atFlags.add(Flags.HOST); }

                    }
                    break;

            }


            pushFollow(FOLLOW_fcnType_fcnName_in_fcnDefinition3207);
            fcnType_fcnName203=fcnType_fcnName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_fcnType_fcnName.add(fcnType_fcnName203.getTree());

            pushFollow(FOLLOW_fcnFormalParameterList_in_fcnDefinition3209);
            fcnFormalParameterList204=fcnFormalParameterList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_fcnFormalParameterList.add(fcnFormalParameterList204.getTree());

            pushFollow(FOLLOW_fcnBody_in_fcnDefinition3211);
            fcnBody205=fcnBody((fcnFormalParameterList204!=null?((BaseNode)fcnFormalParameterList204.tree):null));

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_fcnBody.add(fcnBody205.getTree());

            // AST REWRITE
            // elements: fcnType_fcnName, fcnBody, fcnFormalParameterList
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (BaseNode)adaptor.nil();
            // 550:3: -> ^( D_FCN_DEF[\"D_FCN_DEF\", atFlags] fcnType_fcnName fcnFormalParameterList fcnBody )
            {
                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:550:6: ^( D_FCN_DEF[\"D_FCN_DEF\", atFlags] fcnType_fcnName fcnFormalParameterList fcnBody )
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
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:552:1: fcnDefinitionHost : ( 'public' )? ( 'host' )? fcnType_fcnName fcnFormalParameterList fcnBody[$fcnFormalParameterList.tree] -> ^( D_FCN_DEF[\"D_FCN_DEF\", atFlags] fcnType_fcnName fcnFormalParameterList fcnBody ) ;
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
        RewriteRuleTokenStream stream_182=new RewriteRuleTokenStream(adaptor,"token 182");
        RewriteRuleTokenStream stream_164=new RewriteRuleTokenStream(adaptor,"token 164");
        RewriteRuleSubtreeStream stream_fcnFormalParameterList=new RewriteRuleSubtreeStream(adaptor,"rule fcnFormalParameterList");
        RewriteRuleSubtreeStream stream_fcnType_fcnName=new RewriteRuleSubtreeStream(adaptor,"rule fcnType_fcnName");
        RewriteRuleSubtreeStream stream_fcnBody=new RewriteRuleSubtreeStream(adaptor,"rule fcnBody");

        	atFlags.clear();			

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 62) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:560:2: ( ( 'public' )? ( 'host' )? fcnType_fcnName fcnFormalParameterList fcnBody[$fcnFormalParameterList.tree] -> ^( D_FCN_DEF[\"D_FCN_DEF\", atFlags] fcnType_fcnName fcnFormalParameterList fcnBody ) )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:560:4: ( 'public' )? ( 'host' )? fcnType_fcnName fcnFormalParameterList fcnBody[$fcnFormalParameterList.tree]
            {
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:560:4: ( 'public' )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==182) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:560:5: 'public'
                    {
                    string_literal206=(Atom)match(input,182,FOLLOW_182_in_fcnDefinitionHost3253); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_182.add(string_literal206);


                    }
                    break;

            }


            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:560:16: ( 'host' )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==164) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:560:17: 'host'
                    {
                    string_literal207=(Atom)match(input,164,FOLLOW_164_in_fcnDefinitionHost3258); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_164.add(string_literal207);


                    if ( state.backtracking==0 ) { atFlags.add(Flags.HOST); }

                    }
                    break;

            }


            pushFollow(FOLLOW_fcnType_fcnName_in_fcnDefinitionHost3269);
            fcnType_fcnName208=fcnType_fcnName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_fcnType_fcnName.add(fcnType_fcnName208.getTree());

            pushFollow(FOLLOW_fcnFormalParameterList_in_fcnDefinitionHost3272);
            fcnFormalParameterList209=fcnFormalParameterList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_fcnFormalParameterList.add(fcnFormalParameterList209.getTree());

            pushFollow(FOLLOW_fcnBody_in_fcnDefinitionHost3274);
            fcnBody210=fcnBody((fcnFormalParameterList209!=null?((BaseNode)fcnFormalParameterList209.tree):null));

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_fcnBody.add(fcnBody210.getTree());

            if ( state.backtracking==0 ) { 	atFlags.add(Flags.PUBLIC); /* enforce */ 	
            			if (!atFlags.contains(Flags.HOST))
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

            root_0 = (BaseNode)adaptor.nil();
            // 566:3: -> ^( D_FCN_DEF[\"D_FCN_DEF\", atFlags] fcnType_fcnName fcnFormalParameterList fcnBody )
            {
                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:566:6: ^( D_FCN_DEF[\"D_FCN_DEF\", atFlags] fcnType_fcnName fcnFormalParameterList fcnBody )
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
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:573:1: fcnAttr : ( 'public' )? ( 'host' )? ;
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

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:574:2: ( ( 'public' )? ( 'host' )? )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:574:4: ( 'public' )? ( 'host' )?
            {
            root_0 = (BaseNode)adaptor.nil();


            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:574:4: ( 'public' )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==182) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:574:5: 'public'
                    {
                    string_literal211=(Atom)match(input,182,FOLLOW_182_in_fcnAttr3318); if (state.failed) return retval;
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


            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:575:3: ( 'host' )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==164) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:575:4: 'host'
                    {
                    string_literal212=(Atom)match(input,164,FOLLOW_164_in_fcnAttr3329); if (state.failed) return retval;
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
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:577:1: fcnBody[CommonTree formals] : braceOpen ( stmts ) braceClose -> ^( FCNBODY[\"FCNBODY\"] stmts ) ;
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

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:578:3: ( braceOpen ( stmts ) braceClose -> ^( FCNBODY[\"FCNBODY\"] stmts ) )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:578:5: braceOpen ( stmts ) braceClose
            {
            pushFollow(FOLLOW_braceOpen_in_fcnBody3346);
            braceOpen213=braceOpen();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_braceOpen.add(braceOpen213.getTree());

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:578:15: ( stmts )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:578:16: stmts
            {
            pushFollow(FOLLOW_stmts_in_fcnBody3349);
            stmts214=stmts();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_stmts.add(stmts214.getTree());

            }


            pushFollow(FOLLOW_braceClose_in_fcnBody3353);
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
            // 578:36: -> ^( FCNBODY[\"FCNBODY\"] stmts )
            {
                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:578:39: ^( FCNBODY[\"FCNBODY\"] stmts )
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
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:580:1: fcnDeclaration : ( 'public' )? ( 'host' )? fcnType_fcnName ( fcnFormalParameterList ) delim -> ^( D_FCN_DCL[\"D_FCN_DCL\", atFlags] fcnType_fcnName fcnFormalParameterList ) ;
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
        RewriteRuleTokenStream stream_182=new RewriteRuleTokenStream(adaptor,"token 182");
        RewriteRuleTokenStream stream_164=new RewriteRuleTokenStream(adaptor,"token 164");
        RewriteRuleSubtreeStream stream_fcnFormalParameterList=new RewriteRuleSubtreeStream(adaptor,"rule fcnFormalParameterList");
        RewriteRuleSubtreeStream stream_fcnType_fcnName=new RewriteRuleSubtreeStream(adaptor,"rule fcnType_fcnName");
        RewriteRuleSubtreeStream stream_delim=new RewriteRuleSubtreeStream(adaptor,"rule delim");

        	atFlags.clear();			

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 65) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:587:4: ( ( 'public' )? ( 'host' )? fcnType_fcnName ( fcnFormalParameterList ) delim -> ^( D_FCN_DCL[\"D_FCN_DCL\", atFlags] fcnType_fcnName fcnFormalParameterList ) )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:587:6: ( 'public' )? ( 'host' )? fcnType_fcnName ( fcnFormalParameterList ) delim
            {
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:587:6: ( 'public' )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==182) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:587:7: 'public'
                    {
                    string_literal216=(Atom)match(input,182,FOLLOW_182_in_fcnDeclaration3392); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_182.add(string_literal216);


                    if ( state.backtracking==0 ) { atFlags.add(Flags.PUBLIC); }

                    }
                    break;

            }


            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:588:3: ( 'host' )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==164) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:588:4: 'host'
                    {
                    string_literal217=(Atom)match(input,164,FOLLOW_164_in_fcnDeclaration3403); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_164.add(string_literal217);


                    if ( state.backtracking==0 ) { atFlags.add(Flags.HOST); }

                    }
                    break;

            }


            pushFollow(FOLLOW_fcnType_fcnName_in_fcnDeclaration3413);
            fcnType_fcnName218=fcnType_fcnName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_fcnType_fcnName.add(fcnType_fcnName218.getTree());

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:589:19: ( fcnFormalParameterList )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:589:20: fcnFormalParameterList
            {
            pushFollow(FOLLOW_fcnFormalParameterList_in_fcnDeclaration3416);
            fcnFormalParameterList219=fcnFormalParameterList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_fcnFormalParameterList.add(fcnFormalParameterList219.getTree());

            }


            pushFollow(FOLLOW_delim_in_fcnDeclaration3419);
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
            // 590:4: -> ^( D_FCN_DCL[\"D_FCN_DCL\", atFlags] fcnType_fcnName fcnFormalParameterList )
            {
                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:590:7: ^( D_FCN_DCL[\"D_FCN_DCL\", atFlags] fcnType_fcnName fcnFormalParameterList )
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
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:592:1: fcnType_fcnName : ( typeName qualName -> ^( D_FCN_TYP_NM ^( LIST[\"LIST\"] typeName ) qualName ) |{...}? typeName -> ^( D_FCN_CTOR ^( LIST[\"LIST\"] typeName ) typeName ) | qualName -> ^( D_FCN_TYP_NM ^( LIST[\"LIST\"] ) qualName ) | ( '(' typeName ( ',' typeName )* ')' qualName )=> fcnTypes_fcnName );
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

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:595:2: ( typeName qualName -> ^( D_FCN_TYP_NM ^( LIST[\"LIST\"] typeName ) qualName ) |{...}? typeName -> ^( D_FCN_CTOR ^( LIST[\"LIST\"] typeName ) typeName ) | qualName -> ^( D_FCN_TYP_NM ^( LIST[\"LIST\"] ) qualName ) | ( '(' typeName ( ',' typeName )* ')' qualName )=> fcnTypes_fcnName )
            int alt66=4;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==144||LA66_0==146||(LA66_0 >= 169 && LA66_0 <= 171)||LA66_0==184||(LA66_0 >= 188 && LA66_0 <= 190)) ) {
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
            else if ( (LA66_0==126) && (synpred111_pollen())) {
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
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:595:4: typeName qualName
                    {
                    pushFollow(FOLLOW_typeName_in_fcnType_fcnName3452);
                    typeName221=typeName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeName.add(typeName221.getTree());

                    pushFollow(FOLLOW_qualName_in_fcnType_fcnName3454);
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
                    // 596:3: -> ^( D_FCN_TYP_NM ^( LIST[\"LIST\"] typeName ) qualName )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:596:6: ^( D_FCN_TYP_NM ^( LIST[\"LIST\"] typeName ) qualName )
                        {
                        BaseNode root_1 = (BaseNode)adaptor.nil();
                        root_1 = (BaseNode)adaptor.becomeRoot(
                        (BaseNode)adaptor.create(D_FCN_TYP_NM, "D_FCN_TYP_NM")
                        , root_1);

                        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:596:22: ^( LIST[\"LIST\"] typeName )
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
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:597:4: {...}? typeName
                    {
                    if ( !((input.LT(1).getText().equals(ti.getTypeName()) )) ) {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        throw new FailedPredicateException(input, "fcnType_fcnName", "input.LT(1).getText().equals(ti.getTypeName()) ");
                    }

                    pushFollow(FOLLOW_typeName_in_fcnType_fcnName3490);
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
                    // 598:3: -> ^( D_FCN_CTOR ^( LIST[\"LIST\"] typeName ) typeName )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:598:6: ^( D_FCN_CTOR ^( LIST[\"LIST\"] typeName ) typeName )
                        {
                        BaseNode root_1 = (BaseNode)adaptor.nil();
                        root_1 = (BaseNode)adaptor.becomeRoot(
                        (BaseNode)adaptor.create(D_FCN_CTOR, "D_FCN_CTOR")
                        , root_1);

                        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:598:19: ^( LIST[\"LIST\"] typeName )
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
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:599:4: qualName
                    {
                    pushFollow(FOLLOW_qualName_in_fcnType_fcnName3526);
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
                    // 600:3: -> ^( D_FCN_TYP_NM ^( LIST[\"LIST\"] ) qualName )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:600:6: ^( D_FCN_TYP_NM ^( LIST[\"LIST\"] ) qualName )
                        {
                        BaseNode root_1 = (BaseNode)adaptor.nil();
                        root_1 = (BaseNode)adaptor.becomeRoot(
                        (BaseNode)adaptor.create(D_FCN_TYP_NM, "D_FCN_TYP_NM")
                        , root_1);

                        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:600:21: ^( LIST[\"LIST\"] )
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
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:601:4: ( '(' typeName ( ',' typeName )* ')' qualName )=> fcnTypes_fcnName
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    pushFollow(FOLLOW_fcnTypes_fcnName_in_fcnType_fcnName3585);
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
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:603:1: fcnTypes_fcnName : '(' fcnTypes ')' qualName -> ^( D_FCN_TYP_NM fcnTypes qualName ) ;
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
        RewriteRuleTokenStream stream_126=new RewriteRuleTokenStream(adaptor,"token 126");
        RewriteRuleTokenStream stream_127=new RewriteRuleTokenStream(adaptor,"token 127");
        RewriteRuleSubtreeStream stream_fcnTypes=new RewriteRuleSubtreeStream(adaptor,"rule fcnTypes");
        RewriteRuleSubtreeStream stream_qualName=new RewriteRuleSubtreeStream(adaptor,"rule qualName");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 67) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:604:2: ( '(' fcnTypes ')' qualName -> ^( D_FCN_TYP_NM fcnTypes qualName ) )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:604:4: '(' fcnTypes ')' qualName
            {
            char_literal226=(Atom)match(input,126,FOLLOW_126_in_fcnTypes_fcnName3596); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_126.add(char_literal226);


            pushFollow(FOLLOW_fcnTypes_in_fcnTypes_fcnName3598);
            fcnTypes227=fcnTypes();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_fcnTypes.add(fcnTypes227.getTree());

            char_literal228=(Atom)match(input,127,FOLLOW_127_in_fcnTypes_fcnName3600); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_127.add(char_literal228);


            pushFollow(FOLLOW_qualName_in_fcnTypes_fcnName3602);
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
            // 604:30: -> ^( D_FCN_TYP_NM fcnTypes qualName )
            {
                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:604:33: ^( D_FCN_TYP_NM fcnTypes qualName )
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
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:606:1: fcnTypes : typeName ( ',' typeName )* -> ^( LIST[\"LIST\"] ( typeName )+ ) ;
    public final pollenParser.fcnTypes_return fcnTypes() throws RecognitionException {
        pollenParser.fcnTypes_return retval = new pollenParser.fcnTypes_return();
        retval.start = input.LT(1);

        int fcnTypes_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom char_literal231=null;
        pollenParser.typeName_return typeName230 =null;

        pollenParser.typeName_return typeName232 =null;


        BaseNode char_literal231_tree=null;
        RewriteRuleTokenStream stream_129=new RewriteRuleTokenStream(adaptor,"token 129");
        RewriteRuleSubtreeStream stream_typeName=new RewriteRuleSubtreeStream(adaptor,"rule typeName");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 68) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:607:2: ( typeName ( ',' typeName )* -> ^( LIST[\"LIST\"] ( typeName )+ ) )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:607:4: typeName ( ',' typeName )*
            {
            pushFollow(FOLLOW_typeName_in_fcnTypes3623);
            typeName230=typeName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeName.add(typeName230.getTree());

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:607:13: ( ',' typeName )*
            loop67:
            do {
                int alt67=2;
                int LA67_0 = input.LA(1);

                if ( (LA67_0==129) ) {
                    alt67=1;
                }


                switch (alt67) {
            	case 1 :
            	    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:607:14: ',' typeName
            	    {
            	    char_literal231=(Atom)match(input,129,FOLLOW_129_in_fcnTypes3626); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_129.add(char_literal231);


            	    pushFollow(FOLLOW_typeName_in_fcnTypes3628);
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
            // 607:29: -> ^( LIST[\"LIST\"] ( typeName )+ )
            {
                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:607:32: ^( LIST[\"LIST\"] ( typeName )+ )
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
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:609:1: fcnFormalParameterList : '(' fcnFormalParameters ')' -> fcnFormalParameters ;
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
        RewriteRuleTokenStream stream_126=new RewriteRuleTokenStream(adaptor,"token 126");
        RewriteRuleTokenStream stream_127=new RewriteRuleTokenStream(adaptor,"token 127");
        RewriteRuleSubtreeStream stream_fcnFormalParameters=new RewriteRuleSubtreeStream(adaptor,"rule fcnFormalParameters");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 69) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:610:2: ( '(' fcnFormalParameters ')' -> fcnFormalParameters )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:610:4: '(' fcnFormalParameters ')'
            {
            char_literal233=(Atom)match(input,126,FOLLOW_126_in_fcnFormalParameterList3653); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_126.add(char_literal233);


            pushFollow(FOLLOW_fcnFormalParameters_in_fcnFormalParameterList3655);
            fcnFormalParameters234=fcnFormalParameters();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_fcnFormalParameters.add(fcnFormalParameters234.getTree());

            char_literal235=(Atom)match(input,127,FOLLOW_127_in_fcnFormalParameterList3657); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_127.add(char_literal235);


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
            // 610:32: -> fcnFormalParameters
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
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:612:1: fcnFormalParameters : ( fcnFormalParameter ( ',' fcnFormalParameter )* -> ^( LIST[\"LIST\"] ( fcnFormalParameter )+ ) | -> ^( LIST[\"LIST\"] ) );
    public final pollenParser.fcnFormalParameters_return fcnFormalParameters() throws RecognitionException {
        pollenParser.fcnFormalParameters_return retval = new pollenParser.fcnFormalParameters_return();
        retval.start = input.LT(1);

        int fcnFormalParameters_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom char_literal237=null;
        pollenParser.fcnFormalParameter_return fcnFormalParameter236 =null;

        pollenParser.fcnFormalParameter_return fcnFormalParameter238 =null;


        BaseNode char_literal237_tree=null;
        RewriteRuleTokenStream stream_129=new RewriteRuleTokenStream(adaptor,"token 129");
        RewriteRuleSubtreeStream stream_fcnFormalParameter=new RewriteRuleSubtreeStream(adaptor,"rule fcnFormalParameter");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 70) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:613:2: ( fcnFormalParameter ( ',' fcnFormalParameter )* -> ^( LIST[\"LIST\"] ( fcnFormalParameter )+ ) | -> ^( LIST[\"LIST\"] ) )
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==IDENT||LA69_0==144||LA69_0==146||(LA69_0 >= 169 && LA69_0 <= 171)||LA69_0==184||(LA69_0 >= 188 && LA69_0 <= 190)) ) {
                alt69=1;
            }
            else if ( (LA69_0==127) ) {
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
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:613:4: fcnFormalParameter ( ',' fcnFormalParameter )*
                    {
                    pushFollow(FOLLOW_fcnFormalParameter_in_fcnFormalParameters3671);
                    fcnFormalParameter236=fcnFormalParameter();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_fcnFormalParameter.add(fcnFormalParameter236.getTree());

                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:613:23: ( ',' fcnFormalParameter )*
                    loop68:
                    do {
                        int alt68=2;
                        int LA68_0 = input.LA(1);

                        if ( (LA68_0==129) ) {
                            alt68=1;
                        }


                        switch (alt68) {
                    	case 1 :
                    	    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:613:24: ',' fcnFormalParameter
                    	    {
                    	    char_literal237=(Atom)match(input,129,FOLLOW_129_in_fcnFormalParameters3674); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_129.add(char_literal237);


                    	    pushFollow(FOLLOW_fcnFormalParameter_in_fcnFormalParameters3676);
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
                    // 614:3: -> ^( LIST[\"LIST\"] ( fcnFormalParameter )+ )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:614:6: ^( LIST[\"LIST\"] ( fcnFormalParameter )+ )
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
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:615:4: 
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
                    // 615:4: -> ^( LIST[\"LIST\"] )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:615:7: ^( LIST[\"LIST\"] )
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
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:617:1: fcnFormalParameter : typeName IDENT ( '=' expr )? -> ^( D_FORMAL[\"D_FORMAL\"] typeName ^( IDENT ( expr )? ) ) ;
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

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:618:2: ( typeName IDENT ( '=' expr )? -> ^( D_FORMAL[\"D_FORMAL\"] typeName ^( IDENT ( expr )? ) ) )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:618:6: typeName IDENT ( '=' expr )?
            {
            pushFollow(FOLLOW_typeName_in_fcnFormalParameter3719);
            typeName239=typeName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeName.add(typeName239.getTree());

            IDENT240=(Atom)match(input,IDENT,FOLLOW_IDENT_in_fcnFormalParameter3721); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENT.add(IDENT240);


            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:618:21: ( '=' expr )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==ASSIGN) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:618:23: '=' expr
                    {
                    char_literal241=(Atom)match(input,ASSIGN,FOLLOW_ASSIGN_in_fcnFormalParameter3725); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ASSIGN.add(char_literal241);


                    pushFollow(FOLLOW_expr_in_fcnFormalParameter3727);
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
            // 619:3: -> ^( D_FORMAL[\"D_FORMAL\"] typeName ^( IDENT ( expr )? ) )
            {
                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:619:6: ^( D_FORMAL[\"D_FORMAL\"] typeName ^( IDENT ( expr )? ) )
                {
                BaseNode root_1 = (BaseNode)adaptor.nil();
                root_1 = (BaseNode)adaptor.becomeRoot(
                new DeclNode.Formal(D_FORMAL, "D_FORMAL")
                , root_1);

                adaptor.addChild(root_1, stream_typeName.nextTree());

                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:619:55: ^( IDENT ( expr )? )
                {
                BaseNode root_2 = (BaseNode)adaptor.nil();
                root_2 = (BaseNode)adaptor.becomeRoot(
                stream_IDENT.nextNode()
                , root_2);

                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:619:63: ( expr )?
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
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:621:1: fcnArgumentList : '(' fcnArguments ')' -> fcnArguments ;
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
        RewriteRuleTokenStream stream_126=new RewriteRuleTokenStream(adaptor,"token 126");
        RewriteRuleTokenStream stream_127=new RewriteRuleTokenStream(adaptor,"token 127");
        RewriteRuleSubtreeStream stream_fcnArguments=new RewriteRuleSubtreeStream(adaptor,"rule fcnArguments");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 72) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:622:2: ( '(' fcnArguments ')' -> fcnArguments )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:622:4: '(' fcnArguments ')'
            {
            char_literal243=(Atom)match(input,126,FOLLOW_126_in_fcnArgumentList3764); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_126.add(char_literal243);


            pushFollow(FOLLOW_fcnArguments_in_fcnArgumentList3766);
            fcnArguments244=fcnArguments();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_fcnArguments.add(fcnArguments244.getTree());

            char_literal245=(Atom)match(input,127,FOLLOW_127_in_fcnArgumentList3768); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_127.add(char_literal245);


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
            // 622:25: -> fcnArguments
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
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:624:1: fcnArguments : exprList ;
    public final pollenParser.fcnArguments_return fcnArguments() throws RecognitionException {
        pollenParser.fcnArguments_return retval = new pollenParser.fcnArguments_return();
        retval.start = input.LT(1);

        int fcnArguments_StartIndex = input.index();

        BaseNode root_0 = null;

        pollenParser.exprList_return exprList246 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 73) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:625:2: ( exprList )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:625:4: exprList
            {
            root_0 = (BaseNode)adaptor.nil();


            pushFollow(FOLLOW_exprList_in_fcnArguments3783);
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
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:627:1: varOrFcnOrArray : ( 'new' typeName fcnArgumentList ( fieldOrArrayAccess )? -> ^( E_NEW[\"E_NEW\"] typeName fcnArgumentList ( fieldOrArrayAccess )? ) | '@' IDENT fcnArgumentList ( fieldOrArrayAccess )? -> ^( E_SELF[\"E_SELF\"] ^( E_CALL[\"E_CALL\"] IDENT fcnArgumentList ( fieldOrArrayAccess )? ) ) | '@' IDENT ( fieldOrArrayAccess )? -> ^( E_SELF[\"E_SELF\"] ^( E_IDENT[\"E_IDENT\"] IDENT ( fieldOrArrayAccess )? ) ) | '@' -> ^( E_SELF[\"E_SELF\"] ) | qualName fcnArgumentList ( fieldOrArrayAccess )? -> ^( E_CALL[\"E_CALL\"] qualName fcnArgumentList ( fieldOrArrayAccess )? ) | qualName ( fieldOrArrayAccess )? );
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
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleTokenStream stream_138=new RewriteRuleTokenStream(adaptor,"token 138");
        RewriteRuleTokenStream stream_175=new RewriteRuleTokenStream(adaptor,"token 175");
        RewriteRuleSubtreeStream stream_typeName=new RewriteRuleSubtreeStream(adaptor,"rule typeName");
        RewriteRuleSubtreeStream stream_fcnArgumentList=new RewriteRuleSubtreeStream(adaptor,"rule fcnArgumentList");
        RewriteRuleSubtreeStream stream_qualName=new RewriteRuleSubtreeStream(adaptor,"rule qualName");
        RewriteRuleSubtreeStream stream_fieldOrArrayAccess=new RewriteRuleSubtreeStream(adaptor,"rule fieldOrArrayAccess");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 74) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:628:2: ( 'new' typeName fcnArgumentList ( fieldOrArrayAccess )? -> ^( E_NEW[\"E_NEW\"] typeName fcnArgumentList ( fieldOrArrayAccess )? ) | '@' IDENT fcnArgumentList ( fieldOrArrayAccess )? -> ^( E_SELF[\"E_SELF\"] ^( E_CALL[\"E_CALL\"] IDENT fcnArgumentList ( fieldOrArrayAccess )? ) ) | '@' IDENT ( fieldOrArrayAccess )? -> ^( E_SELF[\"E_SELF\"] ^( E_IDENT[\"E_IDENT\"] IDENT ( fieldOrArrayAccess )? ) ) | '@' -> ^( E_SELF[\"E_SELF\"] ) | qualName fcnArgumentList ( fieldOrArrayAccess )? -> ^( E_CALL[\"E_CALL\"] qualName fcnArgumentList ( fieldOrArrayAccess )? ) | qualName ( fieldOrArrayAccess )? )
            int alt76=6;
            switch ( input.LA(1) ) {
            case 175:
                {
                alt76=1;
                }
                break;
            case 138:
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
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:628:4: 'new' typeName fcnArgumentList ( fieldOrArrayAccess )?
                    {
                    string_literal247=(Atom)match(input,175,FOLLOW_175_in_varOrFcnOrArray3793); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_175.add(string_literal247);


                    pushFollow(FOLLOW_typeName_in_varOrFcnOrArray3795);
                    typeName248=typeName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeName.add(typeName248.getTree());

                    pushFollow(FOLLOW_fcnArgumentList_in_varOrFcnOrArray3797);
                    fcnArgumentList249=fcnArgumentList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_fcnArgumentList.add(fcnArgumentList249.getTree());

                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:628:35: ( fieldOrArrayAccess )?
                    int alt71=2;
                    int LA71_0 = input.LA(1);

                    if ( (LA71_0==139) ) {
                        int LA71_1 = input.LA(2);

                        if ( (synpred116_pollen()) ) {
                            alt71=1;
                        }
                    }
                    else if ( (LA71_0==130) ) {
                        alt71=1;
                    }
                    switch (alt71) {
                        case 1 :
                            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:628:35: fieldOrArrayAccess
                            {
                            pushFollow(FOLLOW_fieldOrArrayAccess_in_varOrFcnOrArray3799);
                            fieldOrArrayAccess250=fieldOrArrayAccess();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_fieldOrArrayAccess.add(fieldOrArrayAccess250.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: typeName, fieldOrArrayAccess, fcnArgumentList
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (BaseNode)adaptor.nil();
                    // 629:3: -> ^( E_NEW[\"E_NEW\"] typeName fcnArgumentList ( fieldOrArrayAccess )? )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:629:6: ^( E_NEW[\"E_NEW\"] typeName fcnArgumentList ( fieldOrArrayAccess )? )
                        {
                        BaseNode root_1 = (BaseNode)adaptor.nil();
                        root_1 = (BaseNode)adaptor.becomeRoot(
                        new ExprNode.New(E_NEW, "E_NEW")
                        , root_1);

                        adaptor.addChild(root_1, stream_typeName.nextTree());

                        adaptor.addChild(root_1, stream_fcnArgumentList.nextTree());

                        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:629:62: ( fieldOrArrayAccess )?
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
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:630:4: '@' IDENT fcnArgumentList ( fieldOrArrayAccess )?
                    {
                    char_literal251=(Atom)match(input,138,FOLLOW_138_in_varOrFcnOrArray3826); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_138.add(char_literal251);


                    IDENT252=(Atom)match(input,IDENT,FOLLOW_IDENT_in_varOrFcnOrArray3828); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENT.add(IDENT252);


                    pushFollow(FOLLOW_fcnArgumentList_in_varOrFcnOrArray3830);
                    fcnArgumentList253=fcnArgumentList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_fcnArgumentList.add(fcnArgumentList253.getTree());

                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:630:30: ( fieldOrArrayAccess )?
                    int alt72=2;
                    int LA72_0 = input.LA(1);

                    if ( (LA72_0==139) ) {
                        int LA72_1 = input.LA(2);

                        if ( (synpred118_pollen()) ) {
                            alt72=1;
                        }
                    }
                    else if ( (LA72_0==130) ) {
                        alt72=1;
                    }
                    switch (alt72) {
                        case 1 :
                            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:630:30: fieldOrArrayAccess
                            {
                            pushFollow(FOLLOW_fieldOrArrayAccess_in_varOrFcnOrArray3832);
                            fieldOrArrayAccess254=fieldOrArrayAccess();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_fieldOrArrayAccess.add(fieldOrArrayAccess254.getTree());

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

                    root_0 = (BaseNode)adaptor.nil();
                    // 631:3: -> ^( E_SELF[\"E_SELF\"] ^( E_CALL[\"E_CALL\"] IDENT fcnArgumentList ( fieldOrArrayAccess )? ) )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:631:6: ^( E_SELF[\"E_SELF\"] ^( E_CALL[\"E_CALL\"] IDENT fcnArgumentList ( fieldOrArrayAccess )? ) )
                        {
                        BaseNode root_1 = (BaseNode)adaptor.nil();
                        root_1 = (BaseNode)adaptor.becomeRoot(
                        new ExprNode.Self(E_SELF, "E_SELF")
                        , root_1);

                        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:632:4: ^( E_CALL[\"E_CALL\"] IDENT fcnArgumentList ( fieldOrArrayAccess )? )
                        {
                        BaseNode root_2 = (BaseNode)adaptor.nil();
                        root_2 = (BaseNode)adaptor.becomeRoot(
                        new ExprNode.Call(E_CALL, "E_CALL")
                        , root_2);

                        adaptor.addChild(root_2, 
                        stream_IDENT.nextNode()
                        );

                        adaptor.addChild(root_2, stream_fcnArgumentList.nextTree());

                        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:632:60: ( fieldOrArrayAccess )?
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
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:633:4: '@' IDENT ( fieldOrArrayAccess )?
                    {
                    char_literal255=(Atom)match(input,138,FOLLOW_138_in_varOrFcnOrArray3874); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_138.add(char_literal255);


                    IDENT256=(Atom)match(input,IDENT,FOLLOW_IDENT_in_varOrFcnOrArray3876); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENT.add(IDENT256);


                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:633:14: ( fieldOrArrayAccess )?
                    int alt73=2;
                    int LA73_0 = input.LA(1);

                    if ( (LA73_0==139) ) {
                        int LA73_1 = input.LA(2);

                        if ( (synpred120_pollen()) ) {
                            alt73=1;
                        }
                    }
                    else if ( (LA73_0==130) ) {
                        alt73=1;
                    }
                    switch (alt73) {
                        case 1 :
                            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:633:14: fieldOrArrayAccess
                            {
                            pushFollow(FOLLOW_fieldOrArrayAccess_in_varOrFcnOrArray3878);
                            fieldOrArrayAccess257=fieldOrArrayAccess();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_fieldOrArrayAccess.add(fieldOrArrayAccess257.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: fieldOrArrayAccess, IDENT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (BaseNode)adaptor.nil();
                    // 634:3: -> ^( E_SELF[\"E_SELF\"] ^( E_IDENT[\"E_IDENT\"] IDENT ( fieldOrArrayAccess )? ) )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:634:6: ^( E_SELF[\"E_SELF\"] ^( E_IDENT[\"E_IDENT\"] IDENT ( fieldOrArrayAccess )? ) )
                        {
                        BaseNode root_1 = (BaseNode)adaptor.nil();
                        root_1 = (BaseNode)adaptor.becomeRoot(
                        new ExprNode.Self(E_SELF, "E_SELF")
                        , root_1);

                        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:634:40: ^( E_IDENT[\"E_IDENT\"] IDENT ( fieldOrArrayAccess )? )
                        {
                        BaseNode root_2 = (BaseNode)adaptor.nil();
                        root_2 = (BaseNode)adaptor.becomeRoot(
                        new ExprNode.Ident(E_IDENT, "E_IDENT")
                        , root_2);

                        adaptor.addChild(root_2, 
                        stream_IDENT.nextNode()
                        );

                        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:634:83: ( fieldOrArrayAccess )?
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
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:635:4: '@'
                    {
                    char_literal258=(Atom)match(input,138,FOLLOW_138_in_varOrFcnOrArray3917); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_138.add(char_literal258);


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
                    // 636:3: -> ^( E_SELF[\"E_SELF\"] )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:636:6: ^( E_SELF[\"E_SELF\"] )
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
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:637:4: qualName fcnArgumentList ( fieldOrArrayAccess )?
                    {
                    pushFollow(FOLLOW_qualName_in_varOrFcnOrArray3937);
                    qualName259=qualName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_qualName.add(qualName259.getTree());

                    pushFollow(FOLLOW_fcnArgumentList_in_varOrFcnOrArray3939);
                    fcnArgumentList260=fcnArgumentList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_fcnArgumentList.add(fcnArgumentList260.getTree());

                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:637:29: ( fieldOrArrayAccess )?
                    int alt74=2;
                    int LA74_0 = input.LA(1);

                    if ( (LA74_0==139) ) {
                        int LA74_1 = input.LA(2);

                        if ( (synpred123_pollen()) ) {
                            alt74=1;
                        }
                    }
                    else if ( (LA74_0==130) ) {
                        alt74=1;
                    }
                    switch (alt74) {
                        case 1 :
                            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:637:29: fieldOrArrayAccess
                            {
                            pushFollow(FOLLOW_fieldOrArrayAccess_in_varOrFcnOrArray3941);
                            fieldOrArrayAccess261=fieldOrArrayAccess();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_fieldOrArrayAccess.add(fieldOrArrayAccess261.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: fcnArgumentList, qualName, fieldOrArrayAccess
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (BaseNode)adaptor.nil();
                    // 638:3: -> ^( E_CALL[\"E_CALL\"] qualName fcnArgumentList ( fieldOrArrayAccess )? )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:638:6: ^( E_CALL[\"E_CALL\"] qualName fcnArgumentList ( fieldOrArrayAccess )? )
                        {
                        BaseNode root_1 = (BaseNode)adaptor.nil();
                        root_1 = (BaseNode)adaptor.becomeRoot(
                        new ExprNode.Call(E_CALL, "E_CALL")
                        , root_1);

                        adaptor.addChild(root_1, stream_qualName.nextTree());

                        adaptor.addChild(root_1, stream_fcnArgumentList.nextTree());

                        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:638:65: ( fieldOrArrayAccess )?
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
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:639:4: qualName ( fieldOrArrayAccess )?
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    pushFollow(FOLLOW_qualName_in_varOrFcnOrArray3969);
                    qualName262=qualName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, qualName262.getTree());

                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:639:13: ( fieldOrArrayAccess )?
                    int alt75=2;
                    int LA75_0 = input.LA(1);

                    if ( (LA75_0==139) ) {
                        int LA75_1 = input.LA(2);

                        if ( (synpred125_pollen()) ) {
                            alt75=1;
                        }
                    }
                    else if ( (LA75_0==130) ) {
                        alt75=1;
                    }
                    switch (alt75) {
                        case 1 :
                            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:639:13: fieldOrArrayAccess
                            {
                            pushFollow(FOLLOW_fieldOrArrayAccess_in_varOrFcnOrArray3971);
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
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:641:1: fieldOrArrayAccess : ( fieldAccess | arrayAccess )+ ;
    public final pollenParser.fieldOrArrayAccess_return fieldOrArrayAccess() throws RecognitionException {
        pollenParser.fieldOrArrayAccess_return retval = new pollenParser.fieldOrArrayAccess_return();
        retval.start = input.LT(1);

        int fieldOrArrayAccess_StartIndex = input.index();

        BaseNode root_0 = null;

        pollenParser.fieldAccess_return fieldAccess264 =null;

        pollenParser.arrayAccess_return arrayAccess265 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 75) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:642:2: ( ( fieldAccess | arrayAccess )+ )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:642:5: ( fieldAccess | arrayAccess )+
            {
            root_0 = (BaseNode)adaptor.nil();


            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:642:5: ( fieldAccess | arrayAccess )+
            int cnt77=0;
            loop77:
            do {
                int alt77=3;
                int LA77_0 = input.LA(1);

                if ( (LA77_0==130) ) {
                    alt77=1;
                }
                else if ( (LA77_0==139) ) {
                    int LA77_2 = input.LA(2);

                    if ( (synpred127_pollen()) ) {
                        alt77=2;
                    }


                }


                switch (alt77) {
            	case 1 :
            	    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:642:6: fieldAccess
            	    {
            	    pushFollow(FOLLOW_fieldAccess_in_fieldOrArrayAccess3985);
            	    fieldAccess264=fieldAccess();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, fieldAccess264.getTree());

            	    }
            	    break;
            	case 2 :
            	    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:642:20: arrayAccess
            	    {
            	    pushFollow(FOLLOW_arrayAccess_in_fieldOrArrayAccess3989);
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
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:644:1: fieldAccess : ( '.' IDENT fcnArgumentList -> ^( E_CALL[\"E_CALL\", true] IDENT fcnArgumentList ) | '.' IDENT -> ^( E_IDENT[\"E_IDENT\", true] IDENT ) );
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
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleTokenStream stream_130=new RewriteRuleTokenStream(adaptor,"token 130");
        RewriteRuleSubtreeStream stream_fcnArgumentList=new RewriteRuleSubtreeStream(adaptor,"rule fcnArgumentList");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 76) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:647:2: ( '.' IDENT fcnArgumentList -> ^( E_CALL[\"E_CALL\", true] IDENT fcnArgumentList ) | '.' IDENT -> ^( E_IDENT[\"E_IDENT\", true] IDENT ) )
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==130) ) {
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
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:647:4: '.' IDENT fcnArgumentList
                    {
                    char_literal266=(Atom)match(input,130,FOLLOW_130_in_fieldAccess4003); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_130.add(char_literal266);


                    IDENT267=(Atom)match(input,IDENT,FOLLOW_IDENT_in_fieldAccess4005); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENT.add(IDENT267);


                    pushFollow(FOLLOW_fcnArgumentList_in_fieldAccess4007);
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
                    // 647:30: -> ^( E_CALL[\"E_CALL\", true] IDENT fcnArgumentList )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:647:33: ^( E_CALL[\"E_CALL\", true] IDENT fcnArgumentList )
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
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:648:4: '.' IDENT
                    {
                    char_literal269=(Atom)match(input,130,FOLLOW_130_in_fieldAccess4029); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_130.add(char_literal269);


                    IDENT270=(Atom)match(input,IDENT,FOLLOW_IDENT_in_fieldAccess4031); if (state.failed) return retval; 
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
                    // 648:15: -> ^( E_IDENT[\"E_IDENT\", true] IDENT )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:648:18: ^( E_IDENT[\"E_IDENT\", true] IDENT )
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
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:650:1: arrayAccess : '[' ( exprList )? ']' -> ^( E_INDEX ( exprList )? ) ;
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
        RewriteRuleTokenStream stream_139=new RewriteRuleTokenStream(adaptor,"token 139");
        RewriteRuleTokenStream stream_140=new RewriteRuleTokenStream(adaptor,"token 140");
        RewriteRuleSubtreeStream stream_exprList=new RewriteRuleSubtreeStream(adaptor,"rule exprList");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 77) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:651:2: ( '[' ( exprList )? ']' -> ^( E_INDEX ( exprList )? ) )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:651:4: '[' ( exprList )? ']'
            {
            char_literal271=(Atom)match(input,139,FOLLOW_139_in_arrayAccess4056); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_139.add(char_literal271);


            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:651:8: ( exprList )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==140) ) {
                int LA79_1 = input.LA(2);

                if ( (synpred129_pollen()) ) {
                    alt79=1;
                }
            }
            else if ( ((LA79_0 >= BIT_NOT && LA79_0 <= CHAR)||LA79_0==DEC||LA79_0==HEX_LIT||LA79_0==IDENT||(LA79_0 >= INC && LA79_0 <= INT_LIT)||LA79_0==LOG_NOT||LA79_0==MINUS||LA79_0==NL||LA79_0==OCT_LIT||LA79_0==REAL_LIT||LA79_0==SEMI||LA79_0==STRING||(LA79_0 >= 126 && LA79_0 <= 127)||LA79_0==129||(LA79_0 >= 138 && LA79_0 <= 139)||(LA79_0 >= 143 && LA79_0 <= 153)||LA79_0==156||LA79_0==158||(LA79_0 >= 160 && LA79_0 <= 165)||LA79_0==167||(LA79_0 >= 169 && LA79_0 <= 171)||(LA79_0 >= 173 && LA79_0 <= 176)||(LA79_0 >= 179 && LA79_0 <= 186)||(LA79_0 >= 188 && LA79_0 <= 192)||LA79_0==196) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:651:9: exprList
                    {
                    pushFollow(FOLLOW_exprList_in_arrayAccess4059);
                    exprList272=exprList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_exprList.add(exprList272.getTree());

                    }
                    break;

            }


            char_literal273=(Atom)match(input,140,FOLLOW_140_in_arrayAccess4063); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_140.add(char_literal273);


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
            // 651:24: -> ^( E_INDEX ( exprList )? )
            {
                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:651:27: ^( E_INDEX ( exprList )? )
                {
                BaseNode root_1 = (BaseNode)adaptor.nil();
                root_1 = (BaseNode)adaptor.becomeRoot(
                (BaseNode)adaptor.create(E_INDEX, "E_INDEX")
                , root_1);

                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:651:37: ( exprList )?
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
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:654:1: stmtBlock : braceOpen stmts braceClose -> ^( S_BLOCK stmts ) ;
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

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:655:2: ( braceOpen stmts braceClose -> ^( S_BLOCK stmts ) )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:655:4: braceOpen stmts braceClose
            {
            pushFollow(FOLLOW_braceOpen_in_stmtBlock4084);
            braceOpen274=braceOpen();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_braceOpen.add(braceOpen274.getTree());

            pushFollow(FOLLOW_stmts_in_stmtBlock4086);
            stmts275=stmts();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_stmts.add(stmts275.getTree());

            pushFollow(FOLLOW_braceClose_in_stmtBlock4088);
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
            // 655:32: -> ^( S_BLOCK stmts )
            {
                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:655:35: ^( S_BLOCK stmts )
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
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:657:1: stmts : ( ( stmt )+ -> ^( LIST[\"LIST\"] ( stmt )+ ) | ( ( NL )* ) -> NIL );
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

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:658:2: ( ( stmt )+ -> ^( LIST[\"LIST\"] ( stmt )+ ) | ( ( NL )* ) -> NIL )
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( ((LA82_0 >= BIT_NOT && LA82_0 <= CHAR)||LA82_0==DEC||LA82_0==HEX_LIT||LA82_0==IDENT||(LA82_0 >= INC && LA82_0 <= INT_LIT)||LA82_0==LOG_NOT||LA82_0==MINUS||LA82_0==OCT_LIT||LA82_0==REAL_LIT||LA82_0==STRING||LA82_0==126||(LA82_0 >= 138 && LA82_0 <= 139)||(LA82_0 >= 143 && LA82_0 <= 146)||(LA82_0 >= 150 && LA82_0 <= 151)||LA82_0==153||(LA82_0 >= 160 && LA82_0 <= 162)||(LA82_0 >= 164 && LA82_0 <= 165)||(LA82_0 >= 169 && LA82_0 <= 171)||(LA82_0 >= 175 && LA82_0 <= 176)||LA82_0==179||LA82_0==181||(LA82_0 >= 183 && LA82_0 <= 186)||(LA82_0 >= 188 && LA82_0 <= 192)) ) {
                alt82=1;
            }
            else if ( (LA82_0==EOF||LA82_0==NL||LA82_0==147||LA82_0==152||LA82_0==196) ) {
                alt82=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 82, 0, input);

                throw nvae;

            }
            switch (alt82) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:658:4: ( stmt )+
                    {
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:658:4: ( stmt )+
                    int cnt80=0;
                    loop80:
                    do {
                        int alt80=2;
                        int LA80_0 = input.LA(1);

                        if ( ((LA80_0 >= BIT_NOT && LA80_0 <= CHAR)||LA80_0==DEC||LA80_0==HEX_LIT||LA80_0==IDENT||(LA80_0 >= INC && LA80_0 <= INT_LIT)||LA80_0==LOG_NOT||LA80_0==MINUS||LA80_0==OCT_LIT||LA80_0==REAL_LIT||LA80_0==STRING||LA80_0==126||(LA80_0 >= 138 && LA80_0 <= 139)||(LA80_0 >= 143 && LA80_0 <= 146)||(LA80_0 >= 150 && LA80_0 <= 151)||LA80_0==153||(LA80_0 >= 160 && LA80_0 <= 162)||(LA80_0 >= 164 && LA80_0 <= 165)||(LA80_0 >= 169 && LA80_0 <= 171)||(LA80_0 >= 175 && LA80_0 <= 176)||LA80_0==179||LA80_0==181||(LA80_0 >= 183 && LA80_0 <= 186)||(LA80_0 >= 188 && LA80_0 <= 192)) ) {
                            alt80=1;
                        }


                        switch (alt80) {
                    	case 1 :
                    	    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:658:5: stmt
                    	    {
                    	    pushFollow(FOLLOW_stmt_in_stmts4108);
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
                    // 658:12: -> ^( LIST[\"LIST\"] ( stmt )+ )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:658:15: ^( LIST[\"LIST\"] ( stmt )+ )
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
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:659:4: ( ( NL )* )
                    {
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:659:4: ( ( NL )* )
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:659:5: ( NL )*
                    {
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:659:5: ( NL )*
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
                    	    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:659:5: NL
                    	    {
                    	    NL278=(Atom)match(input,NL,FOLLOW_NL_in_stmts4130); if (state.failed) return retval; 
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
                    // 659:10: -> NIL
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
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:661:1: stmt : ( varDeclaration | stmtAssign delim | stmtAssert | stmtBind | stmtPrint | stmtReturn | stmtBreak | stmtContinue | stmtForEach | stmtFor | stmtSwitch | stmtDoWhile | stmtIf | stmtProvided | stmtWhile | stmtInjection | expr delim );
    public final pollenParser.stmt_return stmt() throws RecognitionException {
        pollenParser.stmt_return retval = new pollenParser.stmt_return();
        retval.start = input.LT(1);

        int stmt_StartIndex = input.index();

        BaseNode root_0 = null;

        pollenParser.varDeclaration_return varDeclaration279 =null;

        pollenParser.stmtAssign_return stmtAssign280 =null;

        pollenParser.delim_return delim281 =null;

        pollenParser.stmtAssert_return stmtAssert282 =null;

        pollenParser.stmtBind_return stmtBind283 =null;

        pollenParser.stmtPrint_return stmtPrint284 =null;

        pollenParser.stmtReturn_return stmtReturn285 =null;

        pollenParser.stmtBreak_return stmtBreak286 =null;

        pollenParser.stmtContinue_return stmtContinue287 =null;

        pollenParser.stmtForEach_return stmtForEach288 =null;

        pollenParser.stmtFor_return stmtFor289 =null;

        pollenParser.stmtSwitch_return stmtSwitch290 =null;

        pollenParser.stmtDoWhile_return stmtDoWhile291 =null;

        pollenParser.stmtIf_return stmtIf292 =null;

        pollenParser.stmtProvided_return stmtProvided293 =null;

        pollenParser.stmtWhile_return stmtWhile294 =null;

        pollenParser.stmtInjection_return stmtInjection295 =null;

        pollenParser.expr_return expr296 =null;

        pollenParser.delim_return delim297 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 80) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:662:2: ( varDeclaration | stmtAssign delim | stmtAssert | stmtBind | stmtPrint | stmtReturn | stmtBreak | stmtContinue | stmtForEach | stmtFor | stmtSwitch | stmtDoWhile | stmtIf | stmtProvided | stmtWhile | stmtInjection | expr delim )
            int alt83=17;
            switch ( input.LA(1) ) {
            case IDENT:
            case 175:
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
                alt83=1;
                }
                break;
            case 138:
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
            case 143:
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
            case 179:
                {
                alt83=5;
                }
                break;
            case 183:
                {
                alt83=6;
                }
                break;
            case 145:
                {
                alt83=7;
                }
                break;
            case 151:
                {
                alt83=8;
                }
                break;
            case 162:
                {
                alt83=9;
                }
                break;
            case 161:
                {
                alt83=10;
                }
                break;
            case 185:
                {
                alt83=11;
                }
                break;
            case 153:
                {
                alt83=12;
                }
                break;
            case 165:
                {
                alt83=13;
                }
                break;
            case 181:
                {
                alt83=14;
                }
                break;
            case 192:
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
            case 126:
            case 139:
            case 160:
            case 176:
            case 186:
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
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:662:5: varDeclaration
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    pushFollow(FOLLOW_varDeclaration_in_stmt4147);
                    varDeclaration279=varDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDeclaration279.getTree());

                    }
                    break;
                case 2 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:663:5: stmtAssign delim
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    pushFollow(FOLLOW_stmtAssign_in_stmt4154);
                    stmtAssign280=stmtAssign();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmtAssign280.getTree());

                    pushFollow(FOLLOW_delim_in_stmt4156);
                    delim281=delim();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, delim281.getTree());

                    }
                    break;
                case 3 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:664:4: stmtAssert
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    pushFollow(FOLLOW_stmtAssert_in_stmt4163);
                    stmtAssert282=stmtAssert();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmtAssert282.getTree());

                    }
                    break;
                case 4 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:665:4: stmtBind
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    pushFollow(FOLLOW_stmtBind_in_stmt4168);
                    stmtBind283=stmtBind();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmtBind283.getTree());

                    }
                    break;
                case 5 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:666:4: stmtPrint
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    pushFollow(FOLLOW_stmtPrint_in_stmt4173);
                    stmtPrint284=stmtPrint();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmtPrint284.getTree());

                    }
                    break;
                case 6 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:667:4: stmtReturn
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    pushFollow(FOLLOW_stmtReturn_in_stmt4178);
                    stmtReturn285=stmtReturn();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmtReturn285.getTree());

                    }
                    break;
                case 7 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:668:4: stmtBreak
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    pushFollow(FOLLOW_stmtBreak_in_stmt4183);
                    stmtBreak286=stmtBreak();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmtBreak286.getTree());

                    }
                    break;
                case 8 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:669:5: stmtContinue
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    pushFollow(FOLLOW_stmtContinue_in_stmt4189);
                    stmtContinue287=stmtContinue();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmtContinue287.getTree());

                    }
                    break;
                case 9 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:670:5: stmtForEach
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    pushFollow(FOLLOW_stmtForEach_in_stmt4195);
                    stmtForEach288=stmtForEach();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmtForEach288.getTree());

                    }
                    break;
                case 10 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:671:5: stmtFor
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    pushFollow(FOLLOW_stmtFor_in_stmt4201);
                    stmtFor289=stmtFor();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmtFor289.getTree());

                    }
                    break;
                case 11 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:672:4: stmtSwitch
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    pushFollow(FOLLOW_stmtSwitch_in_stmt4206);
                    stmtSwitch290=stmtSwitch();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmtSwitch290.getTree());

                    }
                    break;
                case 12 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:673:5: stmtDoWhile
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    pushFollow(FOLLOW_stmtDoWhile_in_stmt4212);
                    stmtDoWhile291=stmtDoWhile();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmtDoWhile291.getTree());

                    }
                    break;
                case 13 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:674:4: stmtIf
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    pushFollow(FOLLOW_stmtIf_in_stmt4217);
                    stmtIf292=stmtIf();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmtIf292.getTree());

                    }
                    break;
                case 14 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:675:4: stmtProvided
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    pushFollow(FOLLOW_stmtProvided_in_stmt4222);
                    stmtProvided293=stmtProvided();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmtProvided293.getTree());

                    }
                    break;
                case 15 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:676:4: stmtWhile
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    pushFollow(FOLLOW_stmtWhile_in_stmt4227);
                    stmtWhile294=stmtWhile();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmtWhile294.getTree());

                    }
                    break;
                case 16 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:677:4: stmtInjection
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    pushFollow(FOLLOW_stmtInjection_in_stmt4233);
                    stmtInjection295=stmtInjection();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmtInjection295.getTree());

                    }
                    break;
                case 17 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:678:4: expr delim
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    pushFollow(FOLLOW_expr_in_stmt4238);
                    expr296=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr296.getTree());

                    pushFollow(FOLLOW_delim_in_stmt4240);
                    delim297=delim();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, delim297.getTree());

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
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:680:1: stmtAssign : ( varOrFcnOrArray ASSIGN expr -> ^( S_ASSIGN ^( E_BINARY[\"E_BINARY\", true] ASSIGN varOrFcnOrArray expr ) ) | injectionCode ASSIGN expr -> ^( S_ASSIGN ^( E_BINARY[\"E_BINARY\", true] ASSIGN injectionCode expr ) ) | varOrFcnOrArray assignOp expr -> ^( S_ASSIGN ^( E_BINARY[\"E_BINARY\", true] assignOp varOrFcnOrArray expr ) ) | injectionCode assignOp expr -> ^( S_ASSIGN ^( E_BINARY[\"E_BINARY\", true] assignOp injectionCode expr ) ) );
    public final pollenParser.stmtAssign_return stmtAssign() throws RecognitionException {
        pollenParser.stmtAssign_return retval = new pollenParser.stmtAssign_return();
        retval.start = input.LT(1);

        int stmtAssign_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom ASSIGN299=null;
        Atom ASSIGN302=null;
        pollenParser.varOrFcnOrArray_return varOrFcnOrArray298 =null;

        pollenParser.expr_return expr300 =null;

        pollenParser.injectionCode_return injectionCode301 =null;

        pollenParser.expr_return expr303 =null;

        pollenParser.varOrFcnOrArray_return varOrFcnOrArray304 =null;

        pollenParser.assignOp_return assignOp305 =null;

        pollenParser.expr_return expr306 =null;

        pollenParser.injectionCode_return injectionCode307 =null;

        pollenParser.assignOp_return assignOp308 =null;

        pollenParser.expr_return expr309 =null;


        BaseNode ASSIGN299_tree=null;
        BaseNode ASSIGN302_tree=null;
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
        RewriteRuleSubtreeStream stream_assignOp=new RewriteRuleSubtreeStream(adaptor,"rule assignOp");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_injectionCode=new RewriteRuleSubtreeStream(adaptor,"rule injectionCode");
        RewriteRuleSubtreeStream stream_varOrFcnOrArray=new RewriteRuleSubtreeStream(adaptor,"rule varOrFcnOrArray");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 81) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:681:2: ( varOrFcnOrArray ASSIGN expr -> ^( S_ASSIGN ^( E_BINARY[\"E_BINARY\", true] ASSIGN varOrFcnOrArray expr ) ) | injectionCode ASSIGN expr -> ^( S_ASSIGN ^( E_BINARY[\"E_BINARY\", true] ASSIGN injectionCode expr ) ) | varOrFcnOrArray assignOp expr -> ^( S_ASSIGN ^( E_BINARY[\"E_BINARY\", true] assignOp varOrFcnOrArray expr ) ) | injectionCode assignOp expr -> ^( S_ASSIGN ^( E_BINARY[\"E_BINARY\", true] assignOp injectionCode expr ) ) )
            int alt84=4;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==IDENT||LA84_0==138||LA84_0==175) ) {
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
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:681:4: varOrFcnOrArray ASSIGN expr
                    {
                    pushFollow(FOLLOW_varOrFcnOrArray_in_stmtAssign4250);
                    varOrFcnOrArray298=varOrFcnOrArray();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_varOrFcnOrArray.add(varOrFcnOrArray298.getTree());

                    ASSIGN299=(Atom)match(input,ASSIGN,FOLLOW_ASSIGN_in_stmtAssign4252); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ASSIGN.add(ASSIGN299);


                    pushFollow(FOLLOW_expr_in_stmtAssign4254);
                    expr300=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr300.getTree());

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
                    // 682:3: -> ^( S_ASSIGN ^( E_BINARY[\"E_BINARY\", true] ASSIGN varOrFcnOrArray expr ) )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:682:6: ^( S_ASSIGN ^( E_BINARY[\"E_BINARY\", true] ASSIGN varOrFcnOrArray expr ) )
                        {
                        BaseNode root_1 = (BaseNode)adaptor.nil();
                        root_1 = (BaseNode)adaptor.becomeRoot(
                        (BaseNode)adaptor.create(S_ASSIGN, "S_ASSIGN")
                        , root_1);

                        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:682:17: ^( E_BINARY[\"E_BINARY\", true] ASSIGN varOrFcnOrArray expr )
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
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:683:4: injectionCode ASSIGN expr
                    {
                    pushFollow(FOLLOW_injectionCode_in_stmtAssign4284);
                    injectionCode301=injectionCode();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_injectionCode.add(injectionCode301.getTree());

                    ASSIGN302=(Atom)match(input,ASSIGN,FOLLOW_ASSIGN_in_stmtAssign4286); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ASSIGN.add(ASSIGN302);


                    pushFollow(FOLLOW_expr_in_stmtAssign4288);
                    expr303=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr303.getTree());

                    // AST REWRITE
                    // elements: ASSIGN, injectionCode, expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (BaseNode)adaptor.nil();
                    // 684:3: -> ^( S_ASSIGN ^( E_BINARY[\"E_BINARY\", true] ASSIGN injectionCode expr ) )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:684:6: ^( S_ASSIGN ^( E_BINARY[\"E_BINARY\", true] ASSIGN injectionCode expr ) )
                        {
                        BaseNode root_1 = (BaseNode)adaptor.nil();
                        root_1 = (BaseNode)adaptor.becomeRoot(
                        (BaseNode)adaptor.create(S_ASSIGN, "S_ASSIGN")
                        , root_1);

                        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:684:17: ^( E_BINARY[\"E_BINARY\", true] ASSIGN injectionCode expr )
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
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:685:4: varOrFcnOrArray assignOp expr
                    {
                    pushFollow(FOLLOW_varOrFcnOrArray_in_stmtAssign4319);
                    varOrFcnOrArray304=varOrFcnOrArray();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_varOrFcnOrArray.add(varOrFcnOrArray304.getTree());

                    pushFollow(FOLLOW_assignOp_in_stmtAssign4321);
                    assignOp305=assignOp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_assignOp.add(assignOp305.getTree());

                    pushFollow(FOLLOW_expr_in_stmtAssign4323);
                    expr306=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr306.getTree());

                    // AST REWRITE
                    // elements: expr, varOrFcnOrArray, assignOp
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (BaseNode)adaptor.nil();
                    // 686:3: -> ^( S_ASSIGN ^( E_BINARY[\"E_BINARY\", true] assignOp varOrFcnOrArray expr ) )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:686:6: ^( S_ASSIGN ^( E_BINARY[\"E_BINARY\", true] assignOp varOrFcnOrArray expr ) )
                        {
                        BaseNode root_1 = (BaseNode)adaptor.nil();
                        root_1 = (BaseNode)adaptor.becomeRoot(
                        (BaseNode)adaptor.create(S_ASSIGN, "S_ASSIGN")
                        , root_1);

                        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:686:17: ^( E_BINARY[\"E_BINARY\", true] assignOp varOrFcnOrArray expr )
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
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:687:4: injectionCode assignOp expr
                    {
                    pushFollow(FOLLOW_injectionCode_in_stmtAssign4354);
                    injectionCode307=injectionCode();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_injectionCode.add(injectionCode307.getTree());

                    pushFollow(FOLLOW_assignOp_in_stmtAssign4356);
                    assignOp308=assignOp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_assignOp.add(assignOp308.getTree());

                    pushFollow(FOLLOW_expr_in_stmtAssign4358);
                    expr309=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr309.getTree());

                    // AST REWRITE
                    // elements: expr, assignOp, injectionCode
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (BaseNode)adaptor.nil();
                    // 688:3: -> ^( S_ASSIGN ^( E_BINARY[\"E_BINARY\", true] assignOp injectionCode expr ) )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:688:6: ^( S_ASSIGN ^( E_BINARY[\"E_BINARY\", true] assignOp injectionCode expr ) )
                        {
                        BaseNode root_1 = (BaseNode)adaptor.nil();
                        root_1 = (BaseNode)adaptor.becomeRoot(
                        (BaseNode)adaptor.create(S_ASSIGN, "S_ASSIGN")
                        , root_1);

                        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:688:17: ^( E_BINARY[\"E_BINARY\", true] assignOp injectionCode expr )
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
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:690:1: stmtAssert : 'assert' exprList delim -> ^( S_ASSERT exprList ) ;
    public final pollenParser.stmtAssert_return stmtAssert() throws RecognitionException {
        pollenParser.stmtAssert_return retval = new pollenParser.stmtAssert_return();
        retval.start = input.LT(1);

        int stmtAssert_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom string_literal310=null;
        pollenParser.exprList_return exprList311 =null;

        pollenParser.delim_return delim312 =null;


        BaseNode string_literal310_tree=null;
        RewriteRuleTokenStream stream_143=new RewriteRuleTokenStream(adaptor,"token 143");
        RewriteRuleSubtreeStream stream_delim=new RewriteRuleSubtreeStream(adaptor,"rule delim");
        RewriteRuleSubtreeStream stream_exprList=new RewriteRuleSubtreeStream(adaptor,"rule exprList");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 82) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:691:2: ( 'assert' exprList delim -> ^( S_ASSERT exprList ) )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:691:4: 'assert' exprList delim
            {
            string_literal310=(Atom)match(input,143,FOLLOW_143_in_stmtAssert4393); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_143.add(string_literal310);


            pushFollow(FOLLOW_exprList_in_stmtAssert4395);
            exprList311=exprList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_exprList.add(exprList311.getTree());

            pushFollow(FOLLOW_delim_in_stmtAssert4397);
            delim312=delim();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_delim.add(delim312.getTree());

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
            // 691:28: -> ^( S_ASSERT exprList )
            {
                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:691:31: ^( S_ASSERT exprList )
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
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:693:1: stmtBind : varOrFcnOrArray BIND expr delim -> ^( S_BIND varOrFcnOrArray expr ) ;
    public final pollenParser.stmtBind_return stmtBind() throws RecognitionException {
        pollenParser.stmtBind_return retval = new pollenParser.stmtBind_return();
        retval.start = input.LT(1);

        int stmtBind_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom BIND314=null;
        pollenParser.varOrFcnOrArray_return varOrFcnOrArray313 =null;

        pollenParser.expr_return expr315 =null;

        pollenParser.delim_return delim316 =null;


        BaseNode BIND314_tree=null;
        RewriteRuleTokenStream stream_BIND=new RewriteRuleTokenStream(adaptor,"token BIND");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_varOrFcnOrArray=new RewriteRuleSubtreeStream(adaptor,"rule varOrFcnOrArray");
        RewriteRuleSubtreeStream stream_delim=new RewriteRuleSubtreeStream(adaptor,"rule delim");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 83) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:694:2: ( varOrFcnOrArray BIND expr delim -> ^( S_BIND varOrFcnOrArray expr ) )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:694:4: varOrFcnOrArray BIND expr delim
            {
            pushFollow(FOLLOW_varOrFcnOrArray_in_stmtBind4415);
            varOrFcnOrArray313=varOrFcnOrArray();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_varOrFcnOrArray.add(varOrFcnOrArray313.getTree());

            BIND314=(Atom)match(input,BIND,FOLLOW_BIND_in_stmtBind4417); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_BIND.add(BIND314);


            pushFollow(FOLLOW_expr_in_stmtBind4420);
            expr315=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr315.getTree());

            pushFollow(FOLLOW_delim_in_stmtBind4423);
            delim316=delim();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_delim.add(delim316.getTree());

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

            root_0 = (BaseNode)adaptor.nil();
            // 694:38: -> ^( S_BIND varOrFcnOrArray expr )
            {
                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:694:41: ^( S_BIND varOrFcnOrArray expr )
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
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:696:1: stmtPrint : 'print' ( stmtPrintTarget )? exprList -> ^( S_PRINT ( stmtPrintTarget )? exprList ) ;
    public final pollenParser.stmtPrint_return stmtPrint() throws RecognitionException {
        pollenParser.stmtPrint_return retval = new pollenParser.stmtPrint_return();
        retval.start = input.LT(1);

        int stmtPrint_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom string_literal317=null;
        pollenParser.stmtPrintTarget_return stmtPrintTarget318 =null;

        pollenParser.exprList_return exprList319 =null;


        BaseNode string_literal317_tree=null;
        RewriteRuleTokenStream stream_179=new RewriteRuleTokenStream(adaptor,"token 179");
        RewriteRuleSubtreeStream stream_stmtPrintTarget=new RewriteRuleSubtreeStream(adaptor,"rule stmtPrintTarget");
        RewriteRuleSubtreeStream stream_exprList=new RewriteRuleSubtreeStream(adaptor,"rule exprList");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 84) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:697:2: ( 'print' ( stmtPrintTarget )? exprList -> ^( S_PRINT ( stmtPrintTarget )? exprList ) )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:697:4: 'print' ( stmtPrintTarget )? exprList
            {
            string_literal317=(Atom)match(input,179,FOLLOW_179_in_stmtPrint4445); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_179.add(string_literal317);


            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:697:12: ( stmtPrintTarget )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==157||LA85_0==172||LA85_0==177) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:697:13: stmtPrintTarget
                    {
                    pushFollow(FOLLOW_stmtPrintTarget_in_stmtPrint4448);
                    stmtPrintTarget318=stmtPrintTarget();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_stmtPrintTarget.add(stmtPrintTarget318.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_exprList_in_stmtPrint4452);
            exprList319=exprList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_exprList.add(exprList319.getTree());

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
            // 698:3: -> ^( S_PRINT ( stmtPrintTarget )? exprList )
            {
                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:698:6: ^( S_PRINT ( stmtPrintTarget )? exprList )
                {
                BaseNode root_1 = (BaseNode)adaptor.nil();
                root_1 = (BaseNode)adaptor.becomeRoot(
                (BaseNode)adaptor.create(S_PRINT, "S_PRINT")
                , root_1);

                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:698:16: ( stmtPrintTarget )?
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
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:700:1: stmtPrintTarget : ( 'log' | 'err' | 'out' ) ;
    public final pollenParser.stmtPrintTarget_return stmtPrintTarget() throws RecognitionException {
        pollenParser.stmtPrintTarget_return retval = new pollenParser.stmtPrintTarget_return();
        retval.start = input.LT(1);

        int stmtPrintTarget_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom set320=null;

        BaseNode set320_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 85) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:701:2: ( ( 'log' | 'err' | 'out' ) )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:
            {
            root_0 = (BaseNode)adaptor.nil();


            set320=(Atom)input.LT(1);

            if ( input.LA(1)==157||input.LA(1)==172||input.LA(1)==177 ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (BaseNode)adaptor.create(set320)
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
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:703:1: stmtReturn : ( 'return' ( '(' ) ( expr ( ',' expr )+ ) ( ')' ) delim -> ^( S_RETURN ( expr )+ ) | 'return' ( expr ) delim -> ^( S_RETURN expr ) );
    public final pollenParser.stmtReturn_return stmtReturn() throws RecognitionException {
        pollenParser.stmtReturn_return retval = new pollenParser.stmtReturn_return();
        retval.start = input.LT(1);

        int stmtReturn_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom string_literal321=null;
        Atom char_literal322=null;
        Atom char_literal324=null;
        Atom char_literal326=null;
        Atom string_literal328=null;
        pollenParser.expr_return expr323 =null;

        pollenParser.expr_return expr325 =null;

        pollenParser.delim_return delim327 =null;

        pollenParser.expr_return expr329 =null;

        pollenParser.delim_return delim330 =null;


        BaseNode string_literal321_tree=null;
        BaseNode char_literal322_tree=null;
        BaseNode char_literal324_tree=null;
        BaseNode char_literal326_tree=null;
        BaseNode string_literal328_tree=null;
        RewriteRuleTokenStream stream_126=new RewriteRuleTokenStream(adaptor,"token 126");
        RewriteRuleTokenStream stream_127=new RewriteRuleTokenStream(adaptor,"token 127");
        RewriteRuleTokenStream stream_183=new RewriteRuleTokenStream(adaptor,"token 183");
        RewriteRuleTokenStream stream_129=new RewriteRuleTokenStream(adaptor,"token 129");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_delim=new RewriteRuleSubtreeStream(adaptor,"rule delim");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 86) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:706:2: ( 'return' ( '(' ) ( expr ( ',' expr )+ ) ( ')' ) delim -> ^( S_RETURN ( expr )+ ) | 'return' ( expr ) delim -> ^( S_RETURN expr ) )
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==183) ) {
                int LA87_1 = input.LA(2);

                if ( (synpred156_pollen()) ) {
                    alt87=1;
                }
                else if ( (true) ) {
                    alt87=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 87, 1, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 87, 0, input);

                throw nvae;

            }
            switch (alt87) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:706:4: 'return' ( '(' ) ( expr ( ',' expr )+ ) ( ')' ) delim
                    {
                    string_literal321=(Atom)match(input,183,FOLLOW_183_in_stmtReturn4498); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_183.add(string_literal321);


                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:706:13: ( '(' )
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:706:14: '('
                    {
                    char_literal322=(Atom)match(input,126,FOLLOW_126_in_stmtReturn4501); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_126.add(char_literal322);


                    }


                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:706:19: ( expr ( ',' expr )+ )
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:706:20: expr ( ',' expr )+
                    {
                    pushFollow(FOLLOW_expr_in_stmtReturn4505);
                    expr323=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr323.getTree());

                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:706:25: ( ',' expr )+
                    int cnt86=0;
                    loop86:
                    do {
                        int alt86=2;
                        int LA86_0 = input.LA(1);

                        if ( (LA86_0==129) ) {
                            alt86=1;
                        }


                        switch (alt86) {
                    	case 1 :
                    	    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:706:26: ',' expr
                    	    {
                    	    char_literal324=(Atom)match(input,129,FOLLOW_129_in_stmtReturn4508); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_129.add(char_literal324);


                    	    pushFollow(FOLLOW_expr_in_stmtReturn4510);
                    	    expr325=expr();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_expr.add(expr325.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt86 >= 1 ) break loop86;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(86, input);
                                throw eee;
                        }
                        cnt86++;
                    } while (true);


                    }


                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:706:38: ( ')' )
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:706:39: ')'
                    {
                    char_literal326=(Atom)match(input,127,FOLLOW_127_in_stmtReturn4516); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_127.add(char_literal326);


                    }


                    pushFollow(FOLLOW_delim_in_stmtReturn4519);
                    delim327=delim();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_delim.add(delim327.getTree());

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
                    // 706:50: -> ^( S_RETURN ( expr )+ )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:706:53: ^( S_RETURN ( expr )+ )
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
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:707:4: 'return' ( expr ) delim
                    {
                    string_literal328=(Atom)match(input,183,FOLLOW_183_in_stmtReturn4533); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_183.add(string_literal328);


                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:707:14: ( expr )
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:707:15: expr
                    {
                    pushFollow(FOLLOW_expr_in_stmtReturn4537);
                    expr329=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr329.getTree());

                    }


                    pushFollow(FOLLOW_delim_in_stmtReturn4541);
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

                    root_0 = (BaseNode)adaptor.nil();
                    // 707:28: -> ^( S_RETURN expr )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:707:31: ^( S_RETURN expr )
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
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:709:1: stmtBreak : 'break' delim -> ^( S_BREAK ) ;
    public final pollenParser.stmtBreak_return stmtBreak() throws RecognitionException {
        pollenParser.stmtBreak_return retval = new pollenParser.stmtBreak_return();
        retval.start = input.LT(1);

        int stmtBreak_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom string_literal331=null;
        pollenParser.delim_return delim332 =null;


        BaseNode string_literal331_tree=null;
        RewriteRuleTokenStream stream_145=new RewriteRuleTokenStream(adaptor,"token 145");
        RewriteRuleSubtreeStream stream_delim=new RewriteRuleSubtreeStream(adaptor,"rule delim");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 87) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:710:2: ( 'break' delim -> ^( S_BREAK ) )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:710:4: 'break' delim
            {
            string_literal331=(Atom)match(input,145,FOLLOW_145_in_stmtBreak4559); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_145.add(string_literal331);


            pushFollow(FOLLOW_delim_in_stmtBreak4561);
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
            // 710:18: -> ^( S_BREAK )
            {
                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:710:21: ^( S_BREAK )
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
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:712:1: stmtContinue : 'continue' delim -> ^( S_CONTINUE ) ;
    public final pollenParser.stmtContinue_return stmtContinue() throws RecognitionException {
        pollenParser.stmtContinue_return retval = new pollenParser.stmtContinue_return();
        retval.start = input.LT(1);

        int stmtContinue_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom string_literal333=null;
        pollenParser.delim_return delim334 =null;


        BaseNode string_literal333_tree=null;
        RewriteRuleTokenStream stream_151=new RewriteRuleTokenStream(adaptor,"token 151");
        RewriteRuleSubtreeStream stream_delim=new RewriteRuleSubtreeStream(adaptor,"rule delim");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 88) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:713:2: ( 'continue' delim -> ^( S_CONTINUE ) )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:713:4: 'continue' delim
            {
            string_literal333=(Atom)match(input,151,FOLLOW_151_in_stmtContinue4577); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_151.add(string_literal333);


            pushFollow(FOLLOW_delim_in_stmtContinue4579);
            delim334=delim();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_delim.add(delim334.getTree());

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
            // 713:21: -> ^( S_CONTINUE )
            {
                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:713:24: ^( S_CONTINUE )
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
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:715:1: stmtFor : 'for' '(' stmtForInit SEMI stmtForCond SEMI stmtForNext ')' stmtBlock -> ^( S_FOR stmtForInit stmtForCond stmtForNext stmtBlock ) ;
    public final pollenParser.stmtFor_return stmtFor() throws RecognitionException {
        pollenParser.stmtFor_return retval = new pollenParser.stmtFor_return();
        retval.start = input.LT(1);

        int stmtFor_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom string_literal335=null;
        Atom char_literal336=null;
        Atom SEMI338=null;
        Atom SEMI340=null;
        Atom char_literal342=null;
        pollenParser.stmtForInit_return stmtForInit337 =null;

        pollenParser.stmtForCond_return stmtForCond339 =null;

        pollenParser.stmtForNext_return stmtForNext341 =null;

        pollenParser.stmtBlock_return stmtBlock343 =null;


        BaseNode string_literal335_tree=null;
        BaseNode char_literal336_tree=null;
        BaseNode SEMI338_tree=null;
        BaseNode SEMI340_tree=null;
        BaseNode char_literal342_tree=null;
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

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:716:5: ( 'for' '(' stmtForInit SEMI stmtForCond SEMI stmtForNext ')' stmtBlock -> ^( S_FOR stmtForInit stmtForCond stmtForNext stmtBlock ) )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:716:9: 'for' '(' stmtForInit SEMI stmtForCond SEMI stmtForNext ')' stmtBlock
            {
            string_literal335=(Atom)match(input,161,FOLLOW_161_in_stmtFor4600); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_161.add(string_literal335);


            char_literal336=(Atom)match(input,126,FOLLOW_126_in_stmtFor4602); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_126.add(char_literal336);


            pushFollow(FOLLOW_stmtForInit_in_stmtFor4604);
            stmtForInit337=stmtForInit();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_stmtForInit.add(stmtForInit337.getTree());

            SEMI338=(Atom)match(input,SEMI,FOLLOW_SEMI_in_stmtFor4606); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SEMI.add(SEMI338);


            pushFollow(FOLLOW_stmtForCond_in_stmtFor4608);
            stmtForCond339=stmtForCond();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_stmtForCond.add(stmtForCond339.getTree());

            SEMI340=(Atom)match(input,SEMI,FOLLOW_SEMI_in_stmtFor4610); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SEMI.add(SEMI340);


            pushFollow(FOLLOW_stmtForNext_in_stmtFor4612);
            stmtForNext341=stmtForNext();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_stmtForNext.add(stmtForNext341.getTree());

            char_literal342=(Atom)match(input,127,FOLLOW_127_in_stmtFor4614); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_127.add(char_literal342);


            pushFollow(FOLLOW_stmtBlock_in_stmtFor4616);
            stmtBlock343=stmtBlock();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_stmtBlock.add(stmtBlock343.getTree());

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

            root_0 = (BaseNode)adaptor.nil();
            // 717:13: -> ^( S_FOR stmtForInit stmtForCond stmtForNext stmtBlock )
            {
                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:717:16: ^( S_FOR stmtForInit stmtForCond stmtForNext stmtBlock )
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
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:719:1: stmtForCond : ( -> NIL | expr );
    public final pollenParser.stmtForCond_return stmtForCond() throws RecognitionException {
        pollenParser.stmtForCond_return retval = new pollenParser.stmtForCond_return();
        retval.start = input.LT(1);

        int stmtForCond_StartIndex = input.index();

        BaseNode root_0 = null;

        pollenParser.expr_return expr344 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 90) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:720:5: ( -> NIL | expr )
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==SEMI) ) {
                alt88=1;
            }
            else if ( ((LA88_0 >= BIT_NOT && LA88_0 <= CHAR)||LA88_0==DEC||LA88_0==HEX_LIT||LA88_0==IDENT||(LA88_0 >= INC && LA88_0 <= INT_LIT)||LA88_0==LOG_NOT||LA88_0==MINUS||LA88_0==OCT_LIT||LA88_0==REAL_LIT||LA88_0==STRING||LA88_0==126||(LA88_0 >= 138 && LA88_0 <= 139)||LA88_0==160||(LA88_0 >= 175 && LA88_0 <= 176)||LA88_0==186) ) {
                alt88=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 88, 0, input);

                throw nvae;

            }
            switch (alt88) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:721:12: 
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
                    // 721:12: -> NIL
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
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:722:9: expr
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    pushFollow(FOLLOW_expr_in_stmtForCond4684);
                    expr344=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr344.getTree());

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
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:725:1: stmtForInit : ( -> NIL | typeName IDENT '=' expr -> ^( S_DECL ^( typeName IDENT expr ) ) | stmtAssign );
    public final pollenParser.stmtForInit_return stmtForInit() throws RecognitionException {
        pollenParser.stmtForInit_return retval = new pollenParser.stmtForInit_return();
        retval.start = input.LT(1);

        int stmtForInit_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom IDENT346=null;
        Atom char_literal347=null;
        pollenParser.typeName_return typeName345 =null;

        pollenParser.expr_return expr348 =null;

        pollenParser.stmtAssign_return stmtAssign349 =null;


        BaseNode IDENT346_tree=null;
        BaseNode char_literal347_tree=null;
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
        RewriteRuleSubtreeStream stream_typeName=new RewriteRuleSubtreeStream(adaptor,"rule typeName");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 91) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:726:5: ( -> NIL | typeName IDENT '=' expr -> ^( S_DECL ^( typeName IDENT expr ) ) | stmtAssign )
            int alt89=3;
            switch ( input.LA(1) ) {
            case SEMI:
                {
                alt89=1;
                }
                break;
            case IDENT:
                {
                int LA89_2 = input.LA(2);

                if ( (synpred159_pollen()) ) {
                    alt89=2;
                }
                else if ( (true) ) {
                    alt89=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 89, 2, input);

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
                alt89=2;
                }
                break;
            case INJECT:
            case 138:
            case 175:
                {
                alt89=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 89, 0, input);

                throw nvae;

            }

            switch (alt89) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:727:13: 
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
                    // 727:13: -> NIL
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
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:728:9: typeName IDENT '=' expr
                    {
                    pushFollow(FOLLOW_typeName_in_stmtForInit4728);
                    typeName345=typeName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeName.add(typeName345.getTree());

                    IDENT346=(Atom)match(input,IDENT,FOLLOW_IDENT_in_stmtForInit4730); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENT.add(IDENT346);


                    char_literal347=(Atom)match(input,ASSIGN,FOLLOW_ASSIGN_in_stmtForInit4732); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ASSIGN.add(char_literal347);


                    pushFollow(FOLLOW_expr_in_stmtForInit4734);
                    expr348=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr348.getTree());

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
                    // 729:13: -> ^( S_DECL ^( typeName IDENT expr ) )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:729:16: ^( S_DECL ^( typeName IDENT expr ) )
                        {
                        BaseNode root_1 = (BaseNode)adaptor.nil();
                        root_1 = (BaseNode)adaptor.becomeRoot(
                        (BaseNode)adaptor.create(S_DECL, "S_DECL")
                        , root_1);

                        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:729:25: ^( typeName IDENT expr )
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
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:730:9: stmtAssign
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    pushFollow(FOLLOW_stmtAssign_in_stmtForInit4771);
                    stmtAssign349=stmtAssign();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmtAssign349.getTree());

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
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:732:1: stmtForNext : ( -> NIL | expr );
    public final pollenParser.stmtForNext_return stmtForNext() throws RecognitionException {
        pollenParser.stmtForNext_return retval = new pollenParser.stmtForNext_return();
        retval.start = input.LT(1);

        int stmtForNext_StartIndex = input.index();

        BaseNode root_0 = null;

        pollenParser.expr_return expr350 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 92) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:733:5: ( -> NIL | expr )
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==127) ) {
                alt90=1;
            }
            else if ( ((LA90_0 >= BIT_NOT && LA90_0 <= CHAR)||LA90_0==DEC||LA90_0==HEX_LIT||LA90_0==IDENT||(LA90_0 >= INC && LA90_0 <= INT_LIT)||LA90_0==LOG_NOT||LA90_0==MINUS||LA90_0==OCT_LIT||LA90_0==REAL_LIT||LA90_0==STRING||LA90_0==126||(LA90_0 >= 138 && LA90_0 <= 139)||LA90_0==160||(LA90_0 >= 175 && LA90_0 <= 176)||LA90_0==186) ) {
                alt90=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 90, 0, input);

                throw nvae;

            }
            switch (alt90) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:734:13: 
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
                    // 734:13: -> NIL
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
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:735:9: expr
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    pushFollow(FOLLOW_expr_in_stmtForNext4814);
                    expr350=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr350.getTree());

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


    public static class stmtForEach_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stmtForEach"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:737:1: stmtForEach : 'foreach' '(' IDENT 'in' expr ')' stmtBlock -> ^( S_FOREACH IDENT ^( E_IDENT expr ) stmtBlock ) ;
    public final pollenParser.stmtForEach_return stmtForEach() throws RecognitionException {
        pollenParser.stmtForEach_return retval = new pollenParser.stmtForEach_return();
        retval.start = input.LT(1);

        int stmtForEach_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom string_literal351=null;
        Atom char_literal352=null;
        Atom IDENT353=null;
        Atom string_literal354=null;
        Atom char_literal356=null;
        pollenParser.expr_return expr355 =null;

        pollenParser.stmtBlock_return stmtBlock357 =null;


        BaseNode string_literal351_tree=null;
        BaseNode char_literal352_tree=null;
        BaseNode IDENT353_tree=null;
        BaseNode string_literal354_tree=null;
        BaseNode char_literal356_tree=null;
        RewriteRuleTokenStream stream_126=new RewriteRuleTokenStream(adaptor,"token 126");
        RewriteRuleTokenStream stream_162=new RewriteRuleTokenStream(adaptor,"token 162");
        RewriteRuleTokenStream stream_127=new RewriteRuleTokenStream(adaptor,"token 127");
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleTokenStream stream_168=new RewriteRuleTokenStream(adaptor,"token 168");
        RewriteRuleSubtreeStream stream_stmtBlock=new RewriteRuleSubtreeStream(adaptor,"rule stmtBlock");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 93) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:738:2: ( 'foreach' '(' IDENT 'in' expr ')' stmtBlock -> ^( S_FOREACH IDENT ^( E_IDENT expr ) stmtBlock ) )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:738:4: 'foreach' '(' IDENT 'in' expr ')' stmtBlock
            {
            string_literal351=(Atom)match(input,162,FOLLOW_162_in_stmtForEach4827); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_162.add(string_literal351);


            char_literal352=(Atom)match(input,126,FOLLOW_126_in_stmtForEach4829); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_126.add(char_literal352);


            IDENT353=(Atom)match(input,IDENT,FOLLOW_IDENT_in_stmtForEach4831); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENT.add(IDENT353);


            string_literal354=(Atom)match(input,168,FOLLOW_168_in_stmtForEach4833); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_168.add(string_literal354);


            pushFollow(FOLLOW_expr_in_stmtForEach4835);
            expr355=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr355.getTree());

            char_literal356=(Atom)match(input,127,FOLLOW_127_in_stmtForEach4837); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_127.add(char_literal356);


            pushFollow(FOLLOW_stmtBlock_in_stmtForEach4839);
            stmtBlock357=stmtBlock();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_stmtBlock.add(stmtBlock357.getTree());

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
            // 738:48: -> ^( S_FOREACH IDENT ^( E_IDENT expr ) stmtBlock )
            {
                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:738:51: ^( S_FOREACH IDENT ^( E_IDENT expr ) stmtBlock )
                {
                BaseNode root_1 = (BaseNode)adaptor.nil();
                root_1 = (BaseNode)adaptor.becomeRoot(
                (BaseNode)adaptor.create(S_FOREACH, "S_FOREACH")
                , root_1);

                adaptor.addChild(root_1, 
                stream_IDENT.nextNode()
                );

                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:738:69: ^( E_IDENT expr )
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
            if ( state.backtracking>0 ) { memoize(input, 93, stmtForEach_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "stmtForEach"


    public static class stmtSwitch_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stmtSwitch"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:740:1: stmtSwitch : 'switch' '(' expr ')' braceOpen stmtsCase braceClose -> ^( S_SWITCH ^( E_COND expr ) stmtsCase ) ;
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

        pollenParser.braceClose_return braceClose364 =null;


        BaseNode string_literal358_tree=null;
        BaseNode char_literal359_tree=null;
        BaseNode char_literal361_tree=null;
        RewriteRuleTokenStream stream_126=new RewriteRuleTokenStream(adaptor,"token 126");
        RewriteRuleTokenStream stream_127=new RewriteRuleTokenStream(adaptor,"token 127");
        RewriteRuleTokenStream stream_185=new RewriteRuleTokenStream(adaptor,"token 185");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_stmtsCase=new RewriteRuleSubtreeStream(adaptor,"rule stmtsCase");
        RewriteRuleSubtreeStream stream_braceOpen=new RewriteRuleSubtreeStream(adaptor,"rule braceOpen");
        RewriteRuleSubtreeStream stream_braceClose=new RewriteRuleSubtreeStream(adaptor,"rule braceClose");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 94) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:741:2: ( 'switch' '(' expr ')' braceOpen stmtsCase braceClose -> ^( S_SWITCH ^( E_COND expr ) stmtsCase ) )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:741:4: 'switch' '(' expr ')' braceOpen stmtsCase braceClose
            {
            string_literal358=(Atom)match(input,185,FOLLOW_185_in_stmtSwitch4865); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_185.add(string_literal358);


            char_literal359=(Atom)match(input,126,FOLLOW_126_in_stmtSwitch4867); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_126.add(char_literal359);


            pushFollow(FOLLOW_expr_in_stmtSwitch4869);
            expr360=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr360.getTree());

            char_literal361=(Atom)match(input,127,FOLLOW_127_in_stmtSwitch4871); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_127.add(char_literal361);


            pushFollow(FOLLOW_braceOpen_in_stmtSwitch4873);
            braceOpen362=braceOpen();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_braceOpen.add(braceOpen362.getTree());

            pushFollow(FOLLOW_stmtsCase_in_stmtSwitch4875);
            stmtsCase363=stmtsCase();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_stmtsCase.add(stmtsCase363.getTree());

            pushFollow(FOLLOW_braceClose_in_stmtSwitch4877);
            braceClose364=braceClose();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_braceClose.add(braceClose364.getTree());

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
            // 741:57: -> ^( S_SWITCH ^( E_COND expr ) stmtsCase )
            {
                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:741:60: ^( S_SWITCH ^( E_COND expr ) stmtsCase )
                {
                BaseNode root_1 = (BaseNode)adaptor.nil();
                root_1 = (BaseNode)adaptor.becomeRoot(
                (BaseNode)adaptor.create(S_SWITCH, "S_SWITCH")
                , root_1);

                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:741:71: ^( E_COND expr )
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
            if ( state.backtracking>0 ) { memoize(input, 94, stmtSwitch_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "stmtSwitch"


    public static class stmtsCase_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stmtsCase"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:743:1: stmtsCase : ( stmtCase )* -> ( stmtCase )+ ;
    public final pollenParser.stmtsCase_return stmtsCase() throws RecognitionException {
        pollenParser.stmtsCase_return retval = new pollenParser.stmtsCase_return();
        retval.start = input.LT(1);

        int stmtsCase_StartIndex = input.index();

        BaseNode root_0 = null;

        pollenParser.stmtCase_return stmtCase365 =null;


        RewriteRuleSubtreeStream stream_stmtCase=new RewriteRuleSubtreeStream(adaptor,"rule stmtCase");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 95) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:744:2: ( ( stmtCase )* -> ( stmtCase )+ )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:744:4: ( stmtCase )*
            {
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:744:4: ( stmtCase )*
            loop91:
            do {
                int alt91=2;
                int LA91_0 = input.LA(1);

                if ( (LA91_0==147||LA91_0==152) ) {
                    alt91=1;
                }


                switch (alt91) {
            	case 1 :
            	    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:744:4: stmtCase
            	    {
            	    pushFollow(FOLLOW_stmtCase_in_stmtsCase4901);
            	    stmtCase365=stmtCase();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_stmtCase.add(stmtCase365.getTree());

            	    }
            	    break;

            	default :
            	    break loop91;
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
            // 744:14: -> ( stmtCase )+
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
            if ( state.backtracking>0 ) { memoize(input, 95, stmtsCase_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "stmtsCase"


    public static class stmtCase_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stmtCase"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:746:1: stmtCase : ( 'case' ( INT_LIT ) ':' stmts -> ^( S_CASE INT_LIT stmts ) | 'default' ':' stmts -> ^( S_DEFAULT stmts ) );
    public final pollenParser.stmtCase_return stmtCase() throws RecognitionException {
        pollenParser.stmtCase_return retval = new pollenParser.stmtCase_return();
        retval.start = input.LT(1);

        int stmtCase_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom string_literal366=null;
        Atom INT_LIT367=null;
        Atom char_literal368=null;
        Atom string_literal370=null;
        Atom char_literal371=null;
        pollenParser.stmts_return stmts369 =null;

        pollenParser.stmts_return stmts372 =null;


        BaseNode string_literal366_tree=null;
        BaseNode INT_LIT367_tree=null;
        BaseNode char_literal368_tree=null;
        BaseNode string_literal370_tree=null;
        BaseNode char_literal371_tree=null;
        RewriteRuleTokenStream stream_152=new RewriteRuleTokenStream(adaptor,"token 152");
        RewriteRuleTokenStream stream_132=new RewriteRuleTokenStream(adaptor,"token 132");
        RewriteRuleTokenStream stream_147=new RewriteRuleTokenStream(adaptor,"token 147");
        RewriteRuleTokenStream stream_INT_LIT=new RewriteRuleTokenStream(adaptor,"token INT_LIT");
        RewriteRuleSubtreeStream stream_stmts=new RewriteRuleSubtreeStream(adaptor,"rule stmts");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 96) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:747:2: ( 'case' ( INT_LIT ) ':' stmts -> ^( S_CASE INT_LIT stmts ) | 'default' ':' stmts -> ^( S_DEFAULT stmts ) )
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==147) ) {
                alt92=1;
            }
            else if ( (LA92_0==152) ) {
                alt92=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 92, 0, input);

                throw nvae;

            }
            switch (alt92) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:747:4: 'case' ( INT_LIT ) ':' stmts
                    {
                    string_literal366=(Atom)match(input,147,FOLLOW_147_in_stmtCase4917); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_147.add(string_literal366);


                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:747:11: ( INT_LIT )
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:747:12: INT_LIT
                    {
                    INT_LIT367=(Atom)match(input,INT_LIT,FOLLOW_INT_LIT_in_stmtCase4920); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INT_LIT.add(INT_LIT367);


                    }


                    char_literal368=(Atom)match(input,132,FOLLOW_132_in_stmtCase4923); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_132.add(char_literal368);


                    pushFollow(FOLLOW_stmts_in_stmtCase4925);
                    stmts369=stmts();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_stmts.add(stmts369.getTree());

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
                    // 747:31: -> ^( S_CASE INT_LIT stmts )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:747:34: ^( S_CASE INT_LIT stmts )
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
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:748:4: 'default' ':' stmts
                    {
                    string_literal370=(Atom)match(input,152,FOLLOW_152_in_stmtCase4940); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_152.add(string_literal370);


                    char_literal371=(Atom)match(input,132,FOLLOW_132_in_stmtCase4942); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_132.add(char_literal371);


                    pushFollow(FOLLOW_stmts_in_stmtCase4944);
                    stmts372=stmts();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_stmts.add(stmts372.getTree());

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
                    // 748:24: -> ^( S_DEFAULT stmts )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:748:27: ^( S_DEFAULT stmts )
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
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:750:1: stmtDoWhile : 'do' stmtBlock 'while' '(' expr ')' delim -> ^( S_DO_WHILE stmtBlock ^( E_COND expr ) ) ;
    public final pollenParser.stmtDoWhile_return stmtDoWhile() throws RecognitionException {
        pollenParser.stmtDoWhile_return retval = new pollenParser.stmtDoWhile_return();
        retval.start = input.LT(1);

        int stmtDoWhile_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom string_literal373=null;
        Atom string_literal375=null;
        Atom char_literal376=null;
        Atom char_literal378=null;
        pollenParser.stmtBlock_return stmtBlock374 =null;

        pollenParser.expr_return expr377 =null;

        pollenParser.delim_return delim379 =null;


        BaseNode string_literal373_tree=null;
        BaseNode string_literal375_tree=null;
        BaseNode char_literal376_tree=null;
        BaseNode char_literal378_tree=null;
        RewriteRuleTokenStream stream_153=new RewriteRuleTokenStream(adaptor,"token 153");
        RewriteRuleTokenStream stream_126=new RewriteRuleTokenStream(adaptor,"token 126");
        RewriteRuleTokenStream stream_127=new RewriteRuleTokenStream(adaptor,"token 127");
        RewriteRuleTokenStream stream_192=new RewriteRuleTokenStream(adaptor,"token 192");
        RewriteRuleSubtreeStream stream_stmtBlock=new RewriteRuleSubtreeStream(adaptor,"rule stmtBlock");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_delim=new RewriteRuleSubtreeStream(adaptor,"rule delim");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 97) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:751:2: ( 'do' stmtBlock 'while' '(' expr ')' delim -> ^( S_DO_WHILE stmtBlock ^( E_COND expr ) ) )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:751:4: 'do' stmtBlock 'while' '(' expr ')' delim
            {
            string_literal373=(Atom)match(input,153,FOLLOW_153_in_stmtDoWhile4962); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_153.add(string_literal373);


            pushFollow(FOLLOW_stmtBlock_in_stmtDoWhile4964);
            stmtBlock374=stmtBlock();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_stmtBlock.add(stmtBlock374.getTree());

            string_literal375=(Atom)match(input,192,FOLLOW_192_in_stmtDoWhile4966); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_192.add(string_literal375);


            char_literal376=(Atom)match(input,126,FOLLOW_126_in_stmtDoWhile4968); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_126.add(char_literal376);


            pushFollow(FOLLOW_expr_in_stmtDoWhile4970);
            expr377=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr377.getTree());

            char_literal378=(Atom)match(input,127,FOLLOW_127_in_stmtDoWhile4972); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_127.add(char_literal378);


            pushFollow(FOLLOW_delim_in_stmtDoWhile4974);
            delim379=delim();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_delim.add(delim379.getTree());

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
            // 751:47: -> ^( S_DO_WHILE stmtBlock ^( E_COND expr ) )
            {
                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:751:50: ^( S_DO_WHILE stmtBlock ^( E_COND expr ) )
                {
                BaseNode root_1 = (BaseNode)adaptor.nil();
                root_1 = (BaseNode)adaptor.becomeRoot(
                (BaseNode)adaptor.create(S_DO_WHILE, "S_DO_WHILE")
                , root_1);

                adaptor.addChild(root_1, stream_stmtBlock.nextTree());

                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:751:73: ^( E_COND expr )
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
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:753:1: stmtIf : ( 'if' stmtIfBlock stmtsElif ( stmtElse )? -> ^( S_IF stmtIfBlock stmtsElif ( stmtElse )? ) | 'if' stmtIfBlock stmtElse -> ^( S_IF stmtIfBlock stmtElse ) | 'if' stmtIfBlock -> ^( S_IF stmtIfBlock ) );
    public final pollenParser.stmtIf_return stmtIf() throws RecognitionException {
        pollenParser.stmtIf_return retval = new pollenParser.stmtIf_return();
        retval.start = input.LT(1);

        int stmtIf_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom string_literal380=null;
        Atom string_literal384=null;
        Atom string_literal387=null;
        pollenParser.stmtIfBlock_return stmtIfBlock381 =null;

        pollenParser.stmtsElif_return stmtsElif382 =null;

        pollenParser.stmtElse_return stmtElse383 =null;

        pollenParser.stmtIfBlock_return stmtIfBlock385 =null;

        pollenParser.stmtElse_return stmtElse386 =null;

        pollenParser.stmtIfBlock_return stmtIfBlock388 =null;


        BaseNode string_literal380_tree=null;
        BaseNode string_literal384_tree=null;
        BaseNode string_literal387_tree=null;
        RewriteRuleTokenStream stream_165=new RewriteRuleTokenStream(adaptor,"token 165");
        RewriteRuleSubtreeStream stream_stmtsElif=new RewriteRuleSubtreeStream(adaptor,"rule stmtsElif");
        RewriteRuleSubtreeStream stream_stmtElse=new RewriteRuleSubtreeStream(adaptor,"rule stmtElse");
        RewriteRuleSubtreeStream stream_stmtIfBlock=new RewriteRuleSubtreeStream(adaptor,"rule stmtIfBlock");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 98) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:754:2: ( 'if' stmtIfBlock stmtsElif ( stmtElse )? -> ^( S_IF stmtIfBlock stmtsElif ( stmtElse )? ) | 'if' stmtIfBlock stmtElse -> ^( S_IF stmtIfBlock stmtElse ) | 'if' stmtIfBlock -> ^( S_IF stmtIfBlock ) )
            int alt94=3;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==165) ) {
                int LA94_1 = input.LA(2);

                if ( (synpred164_pollen()) ) {
                    alt94=1;
                }
                else if ( (synpred165_pollen()) ) {
                    alt94=2;
                }
                else if ( (true) ) {
                    alt94=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 94, 1, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 94, 0, input);

                throw nvae;

            }
            switch (alt94) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:754:4: 'if' stmtIfBlock stmtsElif ( stmtElse )?
                    {
                    string_literal380=(Atom)match(input,165,FOLLOW_165_in_stmtIf4999); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_165.add(string_literal380);


                    pushFollow(FOLLOW_stmtIfBlock_in_stmtIf5001);
                    stmtIfBlock381=stmtIfBlock();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_stmtIfBlock.add(stmtIfBlock381.getTree());

                    pushFollow(FOLLOW_stmtsElif_in_stmtIf5003);
                    stmtsElif382=stmtsElif();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_stmtsElif.add(stmtsElif382.getTree());

                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:754:31: ( stmtElse )?
                    int alt93=2;
                    int LA93_0 = input.LA(1);

                    if ( (LA93_0==155) ) {
                        alt93=1;
                    }
                    switch (alt93) {
                        case 1 :
                            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:754:31: stmtElse
                            {
                            pushFollow(FOLLOW_stmtElse_in_stmtIf5005);
                            stmtElse383=stmtElse();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_stmtElse.add(stmtElse383.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: stmtIfBlock, stmtsElif, stmtElse
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (BaseNode)adaptor.nil();
                    // 754:41: -> ^( S_IF stmtIfBlock stmtsElif ( stmtElse )? )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:754:44: ^( S_IF stmtIfBlock stmtsElif ( stmtElse )? )
                        {
                        BaseNode root_1 = (BaseNode)adaptor.nil();
                        root_1 = (BaseNode)adaptor.becomeRoot(
                        (BaseNode)adaptor.create(S_IF, "S_IF")
                        , root_1);

                        adaptor.addChild(root_1, stream_stmtIfBlock.nextTree());

                        adaptor.addChild(root_1, stream_stmtsElif.nextTree());

                        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:754:73: ( stmtElse )?
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
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:755:4: 'if' stmtIfBlock stmtElse
                    {
                    string_literal384=(Atom)match(input,165,FOLLOW_165_in_stmtIf5024); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_165.add(string_literal384);


                    pushFollow(FOLLOW_stmtIfBlock_in_stmtIf5026);
                    stmtIfBlock385=stmtIfBlock();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_stmtIfBlock.add(stmtIfBlock385.getTree());

                    pushFollow(FOLLOW_stmtElse_in_stmtIf5028);
                    stmtElse386=stmtElse();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_stmtElse.add(stmtElse386.getTree());

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

                    root_0 = (BaseNode)adaptor.nil();
                    // 755:30: -> ^( S_IF stmtIfBlock stmtElse )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:755:33: ^( S_IF stmtIfBlock stmtElse )
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
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:756:4: 'if' stmtIfBlock
                    {
                    string_literal387=(Atom)match(input,165,FOLLOW_165_in_stmtIf5043); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_165.add(string_literal387);


                    pushFollow(FOLLOW_stmtIfBlock_in_stmtIf5045);
                    stmtIfBlock388=stmtIfBlock();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_stmtIfBlock.add(stmtIfBlock388.getTree());

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
                    // 756:21: -> ^( S_IF stmtIfBlock )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:756:24: ^( S_IF stmtIfBlock )
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
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:758:1: stmtIfBlock : '(' expr ')' stmtBlock -> ^( E_COND expr ) stmtBlock ;
    public final pollenParser.stmtIfBlock_return stmtIfBlock() throws RecognitionException {
        pollenParser.stmtIfBlock_return retval = new pollenParser.stmtIfBlock_return();
        retval.start = input.LT(1);

        int stmtIfBlock_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom char_literal389=null;
        Atom char_literal391=null;
        pollenParser.expr_return expr390 =null;

        pollenParser.stmtBlock_return stmtBlock392 =null;


        BaseNode char_literal389_tree=null;
        BaseNode char_literal391_tree=null;
        RewriteRuleTokenStream stream_126=new RewriteRuleTokenStream(adaptor,"token 126");
        RewriteRuleTokenStream stream_127=new RewriteRuleTokenStream(adaptor,"token 127");
        RewriteRuleSubtreeStream stream_stmtBlock=new RewriteRuleSubtreeStream(adaptor,"rule stmtBlock");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 99) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:759:2: ( '(' expr ')' stmtBlock -> ^( E_COND expr ) stmtBlock )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:759:4: '(' expr ')' stmtBlock
            {
            char_literal389=(Atom)match(input,126,FOLLOW_126_in_stmtIfBlock5063); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_126.add(char_literal389);


            pushFollow(FOLLOW_expr_in_stmtIfBlock5065);
            expr390=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr390.getTree());

            char_literal391=(Atom)match(input,127,FOLLOW_127_in_stmtIfBlock5067); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_127.add(char_literal391);


            pushFollow(FOLLOW_stmtBlock_in_stmtIfBlock5069);
            stmtBlock392=stmtBlock();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_stmtBlock.add(stmtBlock392.getTree());

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
            // 759:27: -> ^( E_COND expr ) stmtBlock
            {
                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:759:30: ^( E_COND expr )
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
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:761:1: stmtsElif : ( stmtElif )+ ;
    public final pollenParser.stmtsElif_return stmtsElif() throws RecognitionException {
        pollenParser.stmtsElif_return retval = new pollenParser.stmtsElif_return();
        retval.start = input.LT(1);

        int stmtsElif_StartIndex = input.index();

        BaseNode root_0 = null;

        pollenParser.stmtElif_return stmtElif393 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 100) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:762:2: ( ( stmtElif )+ )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:762:4: ( stmtElif )+
            {
            root_0 = (BaseNode)adaptor.nil();


            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:762:4: ( stmtElif )+
            int cnt95=0;
            loop95:
            do {
                int alt95=2;
                int LA95_0 = input.LA(1);

                if ( (LA95_0==154) ) {
                    alt95=1;
                }


                switch (alt95) {
            	case 1 :
            	    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:762:4: stmtElif
            	    {
            	    pushFollow(FOLLOW_stmtElif_in_stmtsElif5089);
            	    stmtElif393=stmtElif();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmtElif393.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt95 >= 1 ) break loop95;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(95, input);
                        throw eee;
                }
                cnt95++;
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
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:764:1: stmtElif : 'elif' stmtIfBlock -> ^( S_ELIF stmtIfBlock ) ;
    public final pollenParser.stmtElif_return stmtElif() throws RecognitionException {
        pollenParser.stmtElif_return retval = new pollenParser.stmtElif_return();
        retval.start = input.LT(1);

        int stmtElif_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom string_literal394=null;
        pollenParser.stmtIfBlock_return stmtIfBlock395 =null;


        BaseNode string_literal394_tree=null;
        RewriteRuleTokenStream stream_154=new RewriteRuleTokenStream(adaptor,"token 154");
        RewriteRuleSubtreeStream stream_stmtIfBlock=new RewriteRuleSubtreeStream(adaptor,"rule stmtIfBlock");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 101) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:765:2: ( 'elif' stmtIfBlock -> ^( S_ELIF stmtIfBlock ) )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:765:4: 'elif' stmtIfBlock
            {
            string_literal394=(Atom)match(input,154,FOLLOW_154_in_stmtElif5100); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_154.add(string_literal394);


            pushFollow(FOLLOW_stmtIfBlock_in_stmtElif5102);
            stmtIfBlock395=stmtIfBlock();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_stmtIfBlock.add(stmtIfBlock395.getTree());

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
            // 765:23: -> ^( S_ELIF stmtIfBlock )
            {
                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:765:26: ^( S_ELIF stmtIfBlock )
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
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:767:1: stmtElse : 'else' stmtBlock -> ^( S_ELSE stmtBlock ) ;
    public final pollenParser.stmtElse_return stmtElse() throws RecognitionException {
        pollenParser.stmtElse_return retval = new pollenParser.stmtElse_return();
        retval.start = input.LT(1);

        int stmtElse_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom string_literal396=null;
        pollenParser.stmtBlock_return stmtBlock397 =null;


        BaseNode string_literal396_tree=null;
        RewriteRuleTokenStream stream_155=new RewriteRuleTokenStream(adaptor,"token 155");
        RewriteRuleSubtreeStream stream_stmtBlock=new RewriteRuleSubtreeStream(adaptor,"rule stmtBlock");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 102) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:768:2: ( 'else' stmtBlock -> ^( S_ELSE stmtBlock ) )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:768:4: 'else' stmtBlock
            {
            string_literal396=(Atom)match(input,155,FOLLOW_155_in_stmtElse5120); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_155.add(string_literal396);


            pushFollow(FOLLOW_stmtBlock_in_stmtElse5122);
            stmtBlock397=stmtBlock();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_stmtBlock.add(stmtBlock397.getTree());

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
            // 768:21: -> ^( S_ELSE stmtBlock )
            {
                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:768:24: ^( S_ELSE stmtBlock )
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
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:770:1: stmtProvided : 'provided' '(' expr ')' stmtBlock ( stmtElse )? -> ^( S_PROVIDED expr stmtBlock ( stmtElse )? ) ;
    public final pollenParser.stmtProvided_return stmtProvided() throws RecognitionException {
        pollenParser.stmtProvided_return retval = new pollenParser.stmtProvided_return();
        retval.start = input.LT(1);

        int stmtProvided_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom string_literal398=null;
        Atom char_literal399=null;
        Atom char_literal401=null;
        pollenParser.expr_return expr400 =null;

        pollenParser.stmtBlock_return stmtBlock402 =null;

        pollenParser.stmtElse_return stmtElse403 =null;


        BaseNode string_literal398_tree=null;
        BaseNode char_literal399_tree=null;
        BaseNode char_literal401_tree=null;
        RewriteRuleTokenStream stream_126=new RewriteRuleTokenStream(adaptor,"token 126");
        RewriteRuleTokenStream stream_127=new RewriteRuleTokenStream(adaptor,"token 127");
        RewriteRuleTokenStream stream_181=new RewriteRuleTokenStream(adaptor,"token 181");
        RewriteRuleSubtreeStream stream_stmtElse=new RewriteRuleSubtreeStream(adaptor,"rule stmtElse");
        RewriteRuleSubtreeStream stream_stmtBlock=new RewriteRuleSubtreeStream(adaptor,"rule stmtBlock");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 103) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:771:2: ( 'provided' '(' expr ')' stmtBlock ( stmtElse )? -> ^( S_PROVIDED expr stmtBlock ( stmtElse )? ) )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:771:4: 'provided' '(' expr ')' stmtBlock ( stmtElse )?
            {
            string_literal398=(Atom)match(input,181,FOLLOW_181_in_stmtProvided5140); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_181.add(string_literal398);


            char_literal399=(Atom)match(input,126,FOLLOW_126_in_stmtProvided5142); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_126.add(char_literal399);


            pushFollow(FOLLOW_expr_in_stmtProvided5144);
            expr400=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr400.getTree());

            char_literal401=(Atom)match(input,127,FOLLOW_127_in_stmtProvided5146); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_127.add(char_literal401);


            pushFollow(FOLLOW_stmtBlock_in_stmtProvided5148);
            stmtBlock402=stmtBlock();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_stmtBlock.add(stmtBlock402.getTree());

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:771:38: ( stmtElse )?
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==155) ) {
                alt96=1;
            }
            switch (alt96) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:771:39: stmtElse
                    {
                    pushFollow(FOLLOW_stmtElse_in_stmtProvided5151);
                    stmtElse403=stmtElse();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_stmtElse.add(stmtElse403.getTree());

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

            root_0 = (BaseNode)adaptor.nil();
            // 772:3: -> ^( S_PROVIDED expr stmtBlock ( stmtElse )? )
            {
                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:772:6: ^( S_PROVIDED expr stmtBlock ( stmtElse )? )
                {
                BaseNode root_1 = (BaseNode)adaptor.nil();
                root_1 = (BaseNode)adaptor.becomeRoot(
                (BaseNode)adaptor.create(S_PROVIDED, "S_PROVIDED")
                , root_1);

                adaptor.addChild(root_1, stream_expr.nextTree());

                adaptor.addChild(root_1, stream_stmtBlock.nextTree());

                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:772:34: ( stmtElse )?
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
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:774:1: stmtWhile : 'while' '(' expr ')' stmtBlock -> ^( S_WHILE stmtBlock ) ;
    public final pollenParser.stmtWhile_return stmtWhile() throws RecognitionException {
        pollenParser.stmtWhile_return retval = new pollenParser.stmtWhile_return();
        retval.start = input.LT(1);

        int stmtWhile_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom string_literal404=null;
        Atom char_literal405=null;
        Atom char_literal407=null;
        pollenParser.expr_return expr406 =null;

        pollenParser.stmtBlock_return stmtBlock408 =null;


        BaseNode string_literal404_tree=null;
        BaseNode char_literal405_tree=null;
        BaseNode char_literal407_tree=null;
        RewriteRuleTokenStream stream_126=new RewriteRuleTokenStream(adaptor,"token 126");
        RewriteRuleTokenStream stream_127=new RewriteRuleTokenStream(adaptor,"token 127");
        RewriteRuleTokenStream stream_192=new RewriteRuleTokenStream(adaptor,"token 192");
        RewriteRuleSubtreeStream stream_stmtBlock=new RewriteRuleSubtreeStream(adaptor,"rule stmtBlock");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 104) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:775:2: ( 'while' '(' expr ')' stmtBlock -> ^( S_WHILE stmtBlock ) )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:775:4: 'while' '(' expr ')' stmtBlock
            {
            string_literal404=(Atom)match(input,192,FOLLOW_192_in_stmtWhile5178); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_192.add(string_literal404);


            char_literal405=(Atom)match(input,126,FOLLOW_126_in_stmtWhile5180); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_126.add(char_literal405);


            pushFollow(FOLLOW_expr_in_stmtWhile5182);
            expr406=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr406.getTree());

            char_literal407=(Atom)match(input,127,FOLLOW_127_in_stmtWhile5183); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_127.add(char_literal407);


            pushFollow(FOLLOW_stmtBlock_in_stmtWhile5185);
            stmtBlock408=stmtBlock();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_stmtBlock.add(stmtBlock408.getTree());

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
            // 775:34: -> ^( S_WHILE stmtBlock )
            {
                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:775:37: ^( S_WHILE stmtBlock )
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
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:777:1: varDeclaration : varAttr varDecl delim -> varDecl ;
    public final pollenParser.varDeclaration_return varDeclaration() throws RecognitionException {
        pollenParser.varDeclaration_return retval = new pollenParser.varDeclaration_return();
        retval.start = input.LT(1);

        int varDeclaration_StartIndex = input.index();

        BaseNode root_0 = null;

        pollenParser.varAttr_return varAttr409 =null;

        pollenParser.varDecl_return varDecl410 =null;

        pollenParser.delim_return delim411 =null;


        RewriteRuleSubtreeStream stream_varAttr=new RewriteRuleSubtreeStream(adaptor,"rule varAttr");
        RewriteRuleSubtreeStream stream_varDecl=new RewriteRuleSubtreeStream(adaptor,"rule varDecl");
        RewriteRuleSubtreeStream stream_delim=new RewriteRuleSubtreeStream(adaptor,"rule delim");

        	atFlags.clear();			

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 105) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:784:4: ( varAttr varDecl delim -> varDecl )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:784:7: varAttr varDecl delim
            {
            pushFollow(FOLLOW_varAttr_in_varDeclaration5219);
            varAttr409=varAttr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_varAttr.add(varAttr409.getTree());

            pushFollow(FOLLOW_varDecl_in_varDeclaration5221);
            varDecl410=varDecl();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_varDecl.add(varDecl410.getTree());

            pushFollow(FOLLOW_delim_in_varDeclaration5223);
            delim411=delim();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_delim.add(delim411.getTree());

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
            // 784:29: -> varDecl
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
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:786:1: varAttr : ( 'const' | 'volatile' | 'host' )* ;
    public final pollenParser.varAttr_return varAttr() throws RecognitionException {
        pollenParser.varAttr_return retval = new pollenParser.varAttr_return();
        retval.start = input.LT(1);

        int varAttr_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom string_literal412=null;
        Atom string_literal413=null;
        Atom string_literal414=null;

        BaseNode string_literal412_tree=null;
        BaseNode string_literal413_tree=null;
        BaseNode string_literal414_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 106) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:788:2: ( ( 'const' | 'volatile' | 'host' )* )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:788:4: ( 'const' | 'volatile' | 'host' )*
            {
            root_0 = (BaseNode)adaptor.nil();


            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:788:4: ( 'const' | 'volatile' | 'host' )*
            loop97:
            do {
                int alt97=4;
                switch ( input.LA(1) ) {
                case 150:
                    {
                    alt97=1;
                    }
                    break;
                case 191:
                    {
                    alt97=2;
                    }
                    break;
                case 164:
                    {
                    alt97=3;
                    }
                    break;

                }

                switch (alt97) {
            	case 1 :
            	    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:788:7: 'const'
            	    {
            	    string_literal412=(Atom)match(input,150,FOLLOW_150_in_varAttr5244); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal412_tree = 
            	    (BaseNode)adaptor.create(string_literal412)
            	    ;
            	    adaptor.addChild(root_0, string_literal412_tree);
            	    }

            	    if ( state.backtracking==0 ) { atFlags.add(Flags.CONST); }

            	    }
            	    break;
            	case 2 :
            	    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:789:6: 'volatile'
            	    {
            	    string_literal413=(Atom)match(input,191,FOLLOW_191_in_varAttr5253); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal413_tree = 
            	    (BaseNode)adaptor.create(string_literal413)
            	    ;
            	    adaptor.addChild(root_0, string_literal413_tree);
            	    }

            	    if ( state.backtracking==0 ) { atFlags.add(Flags.VOLATILE); }

            	    }
            	    break;
            	case 3 :
            	    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:790:7: 'host'
            	    {
            	    string_literal414=(Atom)match(input,164,FOLLOW_164_in_varAttr5263); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal414_tree = 
            	    (BaseNode)adaptor.create(string_literal414)
            	    ;
            	    adaptor.addChild(root_0, string_literal414_tree);
            	    }

            	    if ( state.backtracking==0 ) { atFlags.add(Flags.HOST); }

            	    }
            	    break;

            	default :
            	    break loop97;
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
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:793:1: varDecl : ( ( typeName IDENT ( ASSIGN expr )? ',' )=> varDeclList | ( typeName IDENT '[' )=> varArray | ( typeName '(' )=> varFcnRef | ( typeName varInit )=> varDeclList | 'new' typeName IDENT fcnArgumentList -> ^( D_VAR[\"D_VAR\", atFlags] typeName ^( IDENT ^( E_EXPR ^( E_NEW[\"E_NEW\"] typeName fcnArgumentList ) ) ) ) );
    public final pollenParser.varDecl_return varDecl() throws RecognitionException {
        varDecl_stack.push(new varDecl_scope());
        pollenParser.varDecl_return retval = new pollenParser.varDecl_return();
        retval.start = input.LT(1);

        int varDecl_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom string_literal419=null;
        Atom IDENT421=null;
        pollenParser.varDeclList_return varDeclList415 =null;

        pollenParser.varArray_return varArray416 =null;

        pollenParser.varFcnRef_return varFcnRef417 =null;

        pollenParser.varDeclList_return varDeclList418 =null;

        pollenParser.typeName_return typeName420 =null;

        pollenParser.fcnArgumentList_return fcnArgumentList422 =null;


        BaseNode string_literal419_tree=null;
        BaseNode IDENT421_tree=null;
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleTokenStream stream_175=new RewriteRuleTokenStream(adaptor,"token 175");
        RewriteRuleSubtreeStream stream_typeName=new RewriteRuleSubtreeStream(adaptor,"rule typeName");
        RewriteRuleSubtreeStream stream_fcnArgumentList=new RewriteRuleSubtreeStream(adaptor,"rule fcnArgumentList");

        	((varDecl_scope)varDecl_stack.peek()).typ = null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 107) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:802:2: ( ( typeName IDENT ( ASSIGN expr )? ',' )=> varDeclList | ( typeName IDENT '[' )=> varArray | ( typeName '(' )=> varFcnRef | ( typeName varInit )=> varDeclList | 'new' typeName IDENT fcnArgumentList -> ^( D_VAR[\"D_VAR\", atFlags] typeName ^( IDENT ^( E_EXPR ^( E_NEW[\"E_NEW\"] typeName fcnArgumentList ) ) ) ) )
            int alt98=5;
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
                int LA98_1 = input.LA(2);

                if ( (synpred172_pollen()) ) {
                    alt98=1;
                }
                else if ( (synpred173_pollen()) ) {
                    alt98=2;
                }
                else if ( (synpred174_pollen()) ) {
                    alt98=3;
                }
                else if ( (synpred175_pollen()) ) {
                    alt98=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 98, 1, input);

                    throw nvae;

                }
                }
                break;
            case IDENT:
                {
                int LA98_2 = input.LA(2);

                if ( (synpred172_pollen()) ) {
                    alt98=1;
                }
                else if ( (synpred173_pollen()) ) {
                    alt98=2;
                }
                else if ( (synpred174_pollen()) ) {
                    alt98=3;
                }
                else if ( (synpred175_pollen()) ) {
                    alt98=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 98, 2, input);

                    throw nvae;

                }
                }
                break;
            case 175:
                {
                alt98=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 98, 0, input);

                throw nvae;

            }

            switch (alt98) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:802:4: ( typeName IDENT ( ASSIGN expr )? ',' )=> varDeclList
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    pushFollow(FOLLOW_varDeclList_in_varDecl5307);
                    varDeclList415=varDeclList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDeclList415.getTree());

                    }
                    break;
                case 2 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:803:5: ( typeName IDENT '[' )=> varArray
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    pushFollow(FOLLOW_varArray_in_varDecl5324);
                    varArray416=varArray();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varArray416.getTree());

                    }
                    break;
                case 3 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:804:5: ( typeName '(' )=> varFcnRef
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    pushFollow(FOLLOW_varFcnRef_in_varDecl5340);
                    varFcnRef417=varFcnRef();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varFcnRef417.getTree());

                    }
                    break;
                case 4 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:805:6: ( typeName varInit )=> varDeclList
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    pushFollow(FOLLOW_varDeclList_in_varDecl5356);
                    varDeclList418=varDeclList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDeclList418.getTree());

                    }
                    break;
                case 5 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:806:5: 'new' typeName IDENT fcnArgumentList
                    {
                    string_literal419=(Atom)match(input,175,FOLLOW_175_in_varDecl5362); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_175.add(string_literal419);


                    pushFollow(FOLLOW_typeName_in_varDecl5364);
                    typeName420=typeName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeName.add(typeName420.getTree());

                    IDENT421=(Atom)match(input,IDENT,FOLLOW_IDENT_in_varDecl5366); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENT.add(IDENT421);


                    pushFollow(FOLLOW_fcnArgumentList_in_varDecl5368);
                    fcnArgumentList422=fcnArgumentList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_fcnArgumentList.add(fcnArgumentList422.getTree());

                    if ( state.backtracking==0 ) { atFlags.add(Flags.NEW); }

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

                    root_0 = (BaseNode)adaptor.nil();
                    // 808:3: -> ^( D_VAR[\"D_VAR\", atFlags] typeName ^( IDENT ^( E_EXPR ^( E_NEW[\"E_NEW\"] typeName fcnArgumentList ) ) ) )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:808:6: ^( D_VAR[\"D_VAR\", atFlags] typeName ^( IDENT ^( E_EXPR ^( E_NEW[\"E_NEW\"] typeName fcnArgumentList ) ) ) )
                        {
                        BaseNode root_1 = (BaseNode)adaptor.nil();
                        root_1 = (BaseNode)adaptor.becomeRoot(
                        new DeclNode.Var(D_VAR, "D_VAR", atFlags)
                        , root_1);

                        adaptor.addChild(root_1, stream_typeName.nextTree());

                        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:809:6: ^( IDENT ^( E_EXPR ^( E_NEW[\"E_NEW\"] typeName fcnArgumentList ) ) )
                        {
                        BaseNode root_2 = (BaseNode)adaptor.nil();
                        root_2 = (BaseNode)adaptor.becomeRoot(
                        stream_IDENT.nextNode()
                        , root_2);

                        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:809:14: ^( E_EXPR ^( E_NEW[\"E_NEW\"] typeName fcnArgumentList ) )
                        {
                        BaseNode root_3 = (BaseNode)adaptor.nil();
                        root_3 = (BaseNode)adaptor.becomeRoot(
                        (BaseNode)adaptor.create(E_EXPR, "E_EXPR")
                        , root_3);

                        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:809:23: ^( E_NEW[\"E_NEW\"] typeName fcnArgumentList )
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
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:811:1: varFcnRef : typeName fcnRefTypeList IDENT -> ^( D_FCN_REF[\"D_FCN_REF\", atFlags] typeName fcnRefTypeList IDENT ) ;
    public final pollenParser.varFcnRef_return varFcnRef() throws RecognitionException {
        pollenParser.varFcnRef_return retval = new pollenParser.varFcnRef_return();
        retval.start = input.LT(1);

        int varFcnRef_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom IDENT425=null;
        pollenParser.typeName_return typeName423 =null;

        pollenParser.fcnRefTypeList_return fcnRefTypeList424 =null;


        BaseNode IDENT425_tree=null;
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleSubtreeStream stream_typeName=new RewriteRuleSubtreeStream(adaptor,"rule typeName");
        RewriteRuleSubtreeStream stream_fcnRefTypeList=new RewriteRuleSubtreeStream(adaptor,"rule fcnRefTypeList");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 108) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:812:2: ( typeName fcnRefTypeList IDENT -> ^( D_FCN_REF[\"D_FCN_REF\", atFlags] typeName fcnRefTypeList IDENT ) )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:812:4: typeName fcnRefTypeList IDENT
            {
            pushFollow(FOLLOW_typeName_in_varFcnRef5430);
            typeName423=typeName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeName.add(typeName423.getTree());

            pushFollow(FOLLOW_fcnRefTypeList_in_varFcnRef5432);
            fcnRefTypeList424=fcnRefTypeList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_fcnRefTypeList.add(fcnRefTypeList424.getTree());

            IDENT425=(Atom)match(input,IDENT,FOLLOW_IDENT_in_varFcnRef5434); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENT.add(IDENT425);


            // AST REWRITE
            // elements: IDENT, typeName, fcnRefTypeList
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (BaseNode)adaptor.nil();
            // 813:3: -> ^( D_FCN_REF[\"D_FCN_REF\", atFlags] typeName fcnRefTypeList IDENT )
            {
                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:813:6: ^( D_FCN_REF[\"D_FCN_REF\", atFlags] typeName fcnRefTypeList IDENT )
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
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:815:1: fcnRefTypeList : '(' fcnRefTypes ')' -> fcnRefTypes ;
    public final pollenParser.fcnRefTypeList_return fcnRefTypeList() throws RecognitionException {
        pollenParser.fcnRefTypeList_return retval = new pollenParser.fcnRefTypeList_return();
        retval.start = input.LT(1);

        int fcnRefTypeList_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom char_literal426=null;
        Atom char_literal428=null;
        pollenParser.fcnRefTypes_return fcnRefTypes427 =null;


        BaseNode char_literal426_tree=null;
        BaseNode char_literal428_tree=null;
        RewriteRuleTokenStream stream_126=new RewriteRuleTokenStream(adaptor,"token 126");
        RewriteRuleTokenStream stream_127=new RewriteRuleTokenStream(adaptor,"token 127");
        RewriteRuleSubtreeStream stream_fcnRefTypes=new RewriteRuleSubtreeStream(adaptor,"rule fcnRefTypes");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 109) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:816:2: ( '(' fcnRefTypes ')' -> fcnRefTypes )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:816:4: '(' fcnRefTypes ')'
            {
            char_literal426=(Atom)match(input,126,FOLLOW_126_in_fcnRefTypeList5466); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_126.add(char_literal426);


            pushFollow(FOLLOW_fcnRefTypes_in_fcnRefTypeList5468);
            fcnRefTypes427=fcnRefTypes();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_fcnRefTypes.add(fcnRefTypes427.getTree());

            char_literal428=(Atom)match(input,127,FOLLOW_127_in_fcnRefTypeList5470); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_127.add(char_literal428);


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
            // 816:24: -> fcnRefTypes
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
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:818:1: fcnRefTypes : ( typeName ( ',' typeName )* -> ^( LIST[\"LIST\"] ( typeName )+ ) | -> ^( LIST[\"LIST\"] ) );
    public final pollenParser.fcnRefTypes_return fcnRefTypes() throws RecognitionException {
        pollenParser.fcnRefTypes_return retval = new pollenParser.fcnRefTypes_return();
        retval.start = input.LT(1);

        int fcnRefTypes_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom char_literal430=null;
        pollenParser.typeName_return typeName429 =null;

        pollenParser.typeName_return typeName431 =null;


        BaseNode char_literal430_tree=null;
        RewriteRuleTokenStream stream_129=new RewriteRuleTokenStream(adaptor,"token 129");
        RewriteRuleSubtreeStream stream_typeName=new RewriteRuleSubtreeStream(adaptor,"rule typeName");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 110) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:819:2: ( typeName ( ',' typeName )* -> ^( LIST[\"LIST\"] ( typeName )+ ) | -> ^( LIST[\"LIST\"] ) )
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( (LA100_0==IDENT||LA100_0==144||LA100_0==146||(LA100_0 >= 169 && LA100_0 <= 171)||LA100_0==184||(LA100_0 >= 188 && LA100_0 <= 190)) ) {
                alt100=1;
            }
            else if ( (LA100_0==127) ) {
                alt100=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 100, 0, input);

                throw nvae;

            }
            switch (alt100) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:819:4: typeName ( ',' typeName )*
                    {
                    pushFollow(FOLLOW_typeName_in_fcnRefTypes5484);
                    typeName429=typeName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeName.add(typeName429.getTree());

                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:819:13: ( ',' typeName )*
                    loop99:
                    do {
                        int alt99=2;
                        int LA99_0 = input.LA(1);

                        if ( (LA99_0==129) ) {
                            alt99=1;
                        }


                        switch (alt99) {
                    	case 1 :
                    	    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:819:14: ',' typeName
                    	    {
                    	    char_literal430=(Atom)match(input,129,FOLLOW_129_in_fcnRefTypes5487); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_129.add(char_literal430);


                    	    pushFollow(FOLLOW_typeName_in_fcnRefTypes5489);
                    	    typeName431=typeName();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_typeName.add(typeName431.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop99;
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
                    // 820:3: -> ^( LIST[\"LIST\"] ( typeName )+ )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:820:6: ^( LIST[\"LIST\"] ( typeName )+ )
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
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:821:4: 
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
                    // 821:4: -> ^( LIST[\"LIST\"] )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:821:7: ^( LIST[\"LIST\"] )
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
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:823:1: varArray : typeName IDENT varArraySpec ( '=' initializer )? -> ^( D_ARR[\"D_Arr\", atFlags] typeName IDENT varArraySpec ( initializer )? ) ;
    public final pollenParser.varArray_return varArray() throws RecognitionException {
        pollenParser.varArray_return retval = new pollenParser.varArray_return();
        retval.start = input.LT(1);

        int varArray_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom IDENT433=null;
        Atom char_literal435=null;
        pollenParser.typeName_return typeName432 =null;

        pollenParser.varArraySpec_return varArraySpec434 =null;

        pollenParser.initializer_return initializer436 =null;


        BaseNode IDENT433_tree=null;
        BaseNode char_literal435_tree=null;
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
        RewriteRuleSubtreeStream stream_typeName=new RewriteRuleSubtreeStream(adaptor,"rule typeName");
        RewriteRuleSubtreeStream stream_varArraySpec=new RewriteRuleSubtreeStream(adaptor,"rule varArraySpec");
        RewriteRuleSubtreeStream stream_initializer=new RewriteRuleSubtreeStream(adaptor,"rule initializer");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 111) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:824:2: ( typeName IDENT varArraySpec ( '=' initializer )? -> ^( D_ARR[\"D_Arr\", atFlags] typeName IDENT varArraySpec ( initializer )? ) )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:824:4: typeName IDENT varArraySpec ( '=' initializer )?
            {
            pushFollow(FOLLOW_typeName_in_varArray5530);
            typeName432=typeName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeName.add(typeName432.getTree());

            IDENT433=(Atom)match(input,IDENT,FOLLOW_IDENT_in_varArray5532); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENT.add(IDENT433);


            pushFollow(FOLLOW_varArraySpec_in_varArray5534);
            varArraySpec434=varArraySpec();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_varArraySpec.add(varArraySpec434.getTree());

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:824:32: ( '=' initializer )?
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==ASSIGN) ) {
                alt101=1;
            }
            switch (alt101) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:824:33: '=' initializer
                    {
                    char_literal435=(Atom)match(input,ASSIGN,FOLLOW_ASSIGN_in_varArray5537); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ASSIGN.add(char_literal435);


                    pushFollow(FOLLOW_initializer_in_varArray5539);
                    initializer436=initializer();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_initializer.add(initializer436.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: varArraySpec, typeName, IDENT, initializer
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (BaseNode)adaptor.nil();
            // 825:2: -> ^( D_ARR[\"D_Arr\", atFlags] typeName IDENT varArraySpec ( initializer )? )
            {
                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:825:6: ^( D_ARR[\"D_Arr\", atFlags] typeName IDENT varArraySpec ( initializer )? )
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

                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:825:74: ( initializer )?
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
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:827:1: varArraySpec : ( '[' varDim ']' )+ -> ^( LIST[\"LIST\"] ( varDim )+ ) ;
    public final pollenParser.varArraySpec_return varArraySpec() throws RecognitionException {
        pollenParser.varArraySpec_return retval = new pollenParser.varArraySpec_return();
        retval.start = input.LT(1);

        int varArraySpec_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom char_literal437=null;
        Atom char_literal439=null;
        pollenParser.varDim_return varDim438 =null;


        BaseNode char_literal437_tree=null;
        BaseNode char_literal439_tree=null;
        RewriteRuleTokenStream stream_139=new RewriteRuleTokenStream(adaptor,"token 139");
        RewriteRuleTokenStream stream_140=new RewriteRuleTokenStream(adaptor,"token 140");
        RewriteRuleSubtreeStream stream_varDim=new RewriteRuleSubtreeStream(adaptor,"rule varDim");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 112) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:828:2: ( ( '[' varDim ']' )+ -> ^( LIST[\"LIST\"] ( varDim )+ ) )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:828:4: ( '[' varDim ']' )+
            {
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:828:4: ( '[' varDim ']' )+
            int cnt102=0;
            loop102:
            do {
                int alt102=2;
                int LA102_0 = input.LA(1);

                if ( (LA102_0==139) ) {
                    int LA102_1 = input.LA(2);

                    if ( (synpred179_pollen()) ) {
                        alt102=1;
                    }


                }


                switch (alt102) {
            	case 1 :
            	    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:828:5: '[' varDim ']'
            	    {
            	    char_literal437=(Atom)match(input,139,FOLLOW_139_in_varArraySpec5577); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_139.add(char_literal437);


            	    pushFollow(FOLLOW_varDim_in_varArraySpec5579);
            	    varDim438=varDim();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_varDim.add(varDim438.getTree());

            	    char_literal439=(Atom)match(input,140,FOLLOW_140_in_varArraySpec5581); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_140.add(char_literal439);


            	    }
            	    break;

            	default :
            	    if ( cnt102 >= 1 ) break loop102;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(102, input);
                        throw eee;
                }
                cnt102++;
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
            // 828:22: -> ^( LIST[\"LIST\"] ( varDim )+ )
            {
                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:828:27: ^( LIST[\"LIST\"] ( varDim )+ )
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
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:830:1: varDim : ( expr | -> NIL );
    public final pollenParser.varDim_return varDim() throws RecognitionException {
        pollenParser.varDim_return retval = new pollenParser.varDim_return();
        retval.start = input.LT(1);

        int varDim_StartIndex = input.index();

        BaseNode root_0 = null;

        pollenParser.expr_return expr440 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 113) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:831:2: ( expr | -> NIL )
            int alt103=2;
            int LA103_0 = input.LA(1);

            if ( ((LA103_0 >= BIT_NOT && LA103_0 <= CHAR)||LA103_0==DEC||LA103_0==HEX_LIT||LA103_0==IDENT||(LA103_0 >= INC && LA103_0 <= INT_LIT)||LA103_0==LOG_NOT||LA103_0==MINUS||LA103_0==OCT_LIT||LA103_0==REAL_LIT||LA103_0==STRING||LA103_0==126||(LA103_0 >= 138 && LA103_0 <= 139)||LA103_0==160||(LA103_0 >= 175 && LA103_0 <= 176)||LA103_0==186) ) {
                alt103=1;
            }
            else if ( (LA103_0==140) ) {
                alt103=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 103, 0, input);

                throw nvae;

            }
            switch (alt103) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:831:5: expr
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    pushFollow(FOLLOW_expr_in_varDim5609);
                    expr440=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr440.getTree());

                    }
                    break;
                case 2 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:832:4: 
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
                    // 832:4: -> NIL
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
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:834:1: initializer : ( expr | '{' initializer_list ( ',' )? '}' -> initializer_list );
    public final pollenParser.initializer_return initializer() throws RecognitionException {
        pollenParser.initializer_return retval = new pollenParser.initializer_return();
        retval.start = input.LT(1);

        int initializer_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom char_literal442=null;
        Atom char_literal444=null;
        Atom char_literal445=null;
        pollenParser.expr_return expr441 =null;

        pollenParser.initializer_list_return initializer_list443 =null;


        BaseNode char_literal442_tree=null;
        BaseNode char_literal444_tree=null;
        BaseNode char_literal445_tree=null;
        RewriteRuleTokenStream stream_196=new RewriteRuleTokenStream(adaptor,"token 196");
        RewriteRuleTokenStream stream_129=new RewriteRuleTokenStream(adaptor,"token 129");
        RewriteRuleTokenStream stream_193=new RewriteRuleTokenStream(adaptor,"token 193");
        RewriteRuleSubtreeStream stream_initializer_list=new RewriteRuleSubtreeStream(adaptor,"rule initializer_list");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 114) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:835:2: ( expr | '{' initializer_list ( ',' )? '}' -> initializer_list )
            int alt105=2;
            int LA105_0 = input.LA(1);

            if ( ((LA105_0 >= BIT_NOT && LA105_0 <= CHAR)||LA105_0==DEC||LA105_0==HEX_LIT||LA105_0==IDENT||(LA105_0 >= INC && LA105_0 <= INT_LIT)||LA105_0==LOG_NOT||LA105_0==MINUS||LA105_0==OCT_LIT||LA105_0==REAL_LIT||LA105_0==STRING||LA105_0==126||(LA105_0 >= 138 && LA105_0 <= 139)||LA105_0==160||(LA105_0 >= 175 && LA105_0 <= 176)||LA105_0==186) ) {
                alt105=1;
            }
            else if ( (LA105_0==193) ) {
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
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:835:4: expr
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    pushFollow(FOLLOW_expr_in_initializer5629);
                    expr441=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr441.getTree());

                    }
                    break;
                case 2 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:836:4: '{' initializer_list ( ',' )? '}'
                    {
                    char_literal442=(Atom)match(input,193,FOLLOW_193_in_initializer5635); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_193.add(char_literal442);


                    pushFollow(FOLLOW_initializer_list_in_initializer5637);
                    initializer_list443=initializer_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_initializer_list.add(initializer_list443.getTree());

                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:836:25: ( ',' )?
                    int alt104=2;
                    int LA104_0 = input.LA(1);

                    if ( (LA104_0==129) ) {
                        alt104=1;
                    }
                    switch (alt104) {
                        case 1 :
                            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:836:25: ','
                            {
                            char_literal444=(Atom)match(input,129,FOLLOW_129_in_initializer5639); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_129.add(char_literal444);


                            }
                            break;

                    }


                    char_literal445=(Atom)match(input,196,FOLLOW_196_in_initializer5642); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_196.add(char_literal445);


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
                    // 836:34: -> initializer_list
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
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:838:1: initializer_list : initializer ( ',' initializer )* -> ^( LIST[\"LIST\"] ( initializer )+ ) ;
    public final pollenParser.initializer_list_return initializer_list() throws RecognitionException {
        pollenParser.initializer_list_return retval = new pollenParser.initializer_list_return();
        retval.start = input.LT(1);

        int initializer_list_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom char_literal447=null;
        pollenParser.initializer_return initializer446 =null;

        pollenParser.initializer_return initializer448 =null;


        BaseNode char_literal447_tree=null;
        RewriteRuleTokenStream stream_129=new RewriteRuleTokenStream(adaptor,"token 129");
        RewriteRuleSubtreeStream stream_initializer=new RewriteRuleSubtreeStream(adaptor,"rule initializer");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 115) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:839:2: ( initializer ( ',' initializer )* -> ^( LIST[\"LIST\"] ( initializer )+ ) )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:839:4: initializer ( ',' initializer )*
            {
            pushFollow(FOLLOW_initializer_in_initializer_list5656);
            initializer446=initializer();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_initializer.add(initializer446.getTree());

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:839:16: ( ',' initializer )*
            loop106:
            do {
                int alt106=2;
                int LA106_0 = input.LA(1);

                if ( (LA106_0==129) ) {
                    int LA106_1 = input.LA(2);

                    if ( (synpred183_pollen()) ) {
                        alt106=1;
                    }


                }


                switch (alt106) {
            	case 1 :
            	    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:839:17: ',' initializer
            	    {
            	    char_literal447=(Atom)match(input,129,FOLLOW_129_in_initializer_list5659); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_129.add(char_literal447);


            	    pushFollow(FOLLOW_initializer_in_initializer_list5661);
            	    initializer448=initializer();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_initializer.add(initializer448.getTree());

            	    }
            	    break;

            	default :
            	    break loop106;
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
            // 839:35: -> ^( LIST[\"LIST\"] ( initializer )+ )
            {
                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:839:38: ^( LIST[\"LIST\"] ( initializer )+ )
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
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:841:1: varDeclList : ( typeName ! varDeclList | varInit ( ',' ! varInit )* );
    public final pollenParser.varDeclList_return varDeclList() throws RecognitionException {
        pollenParser.varDeclList_return retval = new pollenParser.varDeclList_return();
        retval.start = input.LT(1);

        int varDeclList_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom char_literal452=null;
        pollenParser.typeName_return typeName449 =null;

        pollenParser.varDeclList_return varDeclList450 =null;

        pollenParser.varInit_return varInit451 =null;

        pollenParser.varInit_return varInit453 =null;


        BaseNode char_literal452_tree=null;


        	assert ((varDecl_scope)varDecl_stack.peek()).typ != null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 116) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:845:2: ( typeName ! varDeclList | varInit ( ',' ! varInit )* )
            int alt108=2;
            int LA108_0 = input.LA(1);

            if ( (LA108_0==IDENT) ) {
                int LA108_1 = input.LA(2);

                if ( (synpred184_pollen()) ) {
                    alt108=1;
                }
                else if ( (true) ) {
                    alt108=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 108, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA108_0==144||LA108_0==146||(LA108_0 >= 169 && LA108_0 <= 171)||LA108_0==184||(LA108_0 >= 188 && LA108_0 <= 190)) ) {
                alt108=1;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 108, 0, input);

                throw nvae;

            }
            switch (alt108) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:845:4: typeName ! varDeclList
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    pushFollow(FOLLOW_typeName_in_varDeclList5693);
                    typeName449=typeName();

                    state._fsp--;
                    if (state.failed) return retval;

                    if ( state.backtracking==0 ) {((varDecl_scope)varDecl_stack.peek()).typ = (typeName449!=null?((BaseNode)typeName449.tree):null); }

                    pushFollow(FOLLOW_varDeclList_in_varDeclList5698);
                    varDeclList450=varDeclList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDeclList450.getTree());

                    }
                    break;
                case 2 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:846:4: varInit ( ',' ! varInit )*
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    pushFollow(FOLLOW_varInit_in_varDeclList5703);
                    varInit451=varInit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varInit451.getTree());

                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:846:12: ( ',' ! varInit )*
                    loop107:
                    do {
                        int alt107=2;
                        int LA107_0 = input.LA(1);

                        if ( (LA107_0==129) ) {
                            int LA107_1 = input.LA(2);

                            if ( (synpred185_pollen()) ) {
                                alt107=1;
                            }


                        }


                        switch (alt107) {
                    	case 1 :
                    	    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:846:13: ',' ! varInit
                    	    {
                    	    char_literal452=(Atom)match(input,129,FOLLOW_129_in_varDeclList5706); if (state.failed) return retval;

                    	    pushFollow(FOLLOW_varInit_in_varDeclList5709);
                    	    varInit453=varInit();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, varInit453.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop107;
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
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:848:1: varInit : IDENT ( ASSIGN expr )? -> ^( D_VAR[\"D_VAR\", atFlags] ^( IDENT ( expr )? ) ) ;
    public final pollenParser.varInit_return varInit() throws RecognitionException {
        pollenParser.varInit_return retval = new pollenParser.varInit_return();
        retval.start = input.LT(1);

        int varInit_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom IDENT454=null;
        Atom ASSIGN455=null;
        pollenParser.expr_return expr456 =null;


        BaseNode IDENT454_tree=null;
        BaseNode ASSIGN455_tree=null;
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 117) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:850:2: ( IDENT ( ASSIGN expr )? -> ^( D_VAR[\"D_VAR\", atFlags] ^( IDENT ( expr )? ) ) )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:850:4: IDENT ( ASSIGN expr )?
            {
            IDENT454=(Atom)match(input,IDENT,FOLLOW_IDENT_in_varInit5727); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENT.add(IDENT454);


            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:850:10: ( ASSIGN expr )?
            int alt109=2;
            int LA109_0 = input.LA(1);

            if ( (LA109_0==ASSIGN) ) {
                alt109=1;
            }
            switch (alt109) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:850:11: ASSIGN expr
                    {
                    ASSIGN455=(Atom)match(input,ASSIGN,FOLLOW_ASSIGN_in_varInit5730); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ASSIGN.add(ASSIGN455);


                    pushFollow(FOLLOW_expr_in_varInit5732);
                    expr456=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr456.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: IDENT, expr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (BaseNode)adaptor.nil();
            // 851:2: -> ^( D_VAR[\"D_VAR\", atFlags] ^( IDENT ( expr )? ) )
            {
                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:851:5: ^( D_VAR[\"D_VAR\", atFlags] ^( IDENT ( expr )? ) )
                {
                BaseNode root_1 = (BaseNode)adaptor.nil();
                root_1 = (BaseNode)adaptor.becomeRoot(
                new DeclNode.Var(D_VAR, "D_VAR", atFlags)
                , root_1);

                adaptor.addChild(root_1, ((varDecl_scope)varDecl_stack.peek()).typ);

                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:851:61: ^( IDENT ( expr )? )
                {
                BaseNode root_2 = (BaseNode)adaptor.nil();
                root_2 = (BaseNode)adaptor.becomeRoot(
                stream_IDENT.nextNode()
                , root_2);

                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:851:69: ( expr )?
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
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:854:1: builtinType : ( 'bool' | 'byte' | 'int8' | 'int16' | 'int32' | 'string' | 'uint8' | 'uint16' | 'uint32' );
    public final pollenParser.builtinType_return builtinType() throws RecognitionException {
        pollenParser.builtinType_return retval = new pollenParser.builtinType_return();
        retval.start = input.LT(1);

        int builtinType_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom set457=null;

        BaseNode set457_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 118) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:855:5: ( 'bool' | 'byte' | 'int8' | 'int16' | 'int32' | 'string' | 'uint8' | 'uint16' | 'uint32' )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:
            {
            root_0 = (BaseNode)adaptor.nil();


            set457=(Atom)input.LT(1);

            if ( input.LA(1)==144||input.LA(1)==146||(input.LA(1) >= 169 && input.LA(1) <= 171)||input.LA(1)==184||(input.LA(1) >= 188 && input.LA(1) <= 190) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (BaseNode)adaptor.create(set457)
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
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:865:1: qualName : IDENT ( qualNameList )? -> ^( E_IDENT[\"E_IDENT\"] IDENT ( qualNameList )? ) ;
    public final pollenParser.qualName_return qualName() throws RecognitionException {
        pollenParser.qualName_return retval = new pollenParser.qualName_return();
        retval.start = input.LT(1);

        int qualName_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom IDENT458=null;
        pollenParser.qualNameList_return qualNameList459 =null;


        BaseNode IDENT458_tree=null;
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleSubtreeStream stream_qualNameList=new RewriteRuleSubtreeStream(adaptor,"rule qualNameList");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 119) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:866:5: ( IDENT ( qualNameList )? -> ^( E_IDENT[\"E_IDENT\"] IDENT ( qualNameList )? ) )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:866:9: IDENT ( qualNameList )?
            {
            IDENT458=(Atom)match(input,IDENT,FOLLOW_IDENT_in_qualName5870); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENT.add(IDENT458);


            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:866:15: ( qualNameList )?
            int alt110=2;
            int LA110_0 = input.LA(1);

            if ( (LA110_0==130) ) {
                int LA110_1 = input.LA(2);

                if ( (synpred195_pollen()) ) {
                    alt110=1;
                }
            }
            switch (alt110) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:866:16: qualNameList
                    {
                    pushFollow(FOLLOW_qualNameList_in_qualName5873);
                    qualNameList459=qualNameList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_qualNameList.add(qualNameList459.getTree());

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
            // 866:31: -> ^( E_IDENT[\"E_IDENT\"] IDENT ( qualNameList )? )
            {
                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:866:34: ^( E_IDENT[\"E_IDENT\"] IDENT ( qualNameList )? )
                {
                BaseNode root_1 = (BaseNode)adaptor.nil();
                root_1 = (BaseNode)adaptor.becomeRoot(
                new ExprNode.Ident(E_IDENT, "E_IDENT")
                , root_1);

                adaptor.addChild(root_1, 
                stream_IDENT.nextNode()
                );

                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:866:79: ( qualNameList )?
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
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:869:1: qualNameList : ( '.' IDENT )+ -> ( ^( E_IDENT[\"E_IDENT\", true] IDENT ) )+ ;
    public final pollenParser.qualNameList_return qualNameList() throws RecognitionException {
        pollenParser.qualNameList_return retval = new pollenParser.qualNameList_return();
        retval.start = input.LT(1);

        int qualNameList_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom char_literal460=null;
        Atom IDENT461=null;

        BaseNode char_literal460_tree=null;
        BaseNode IDENT461_tree=null;
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleTokenStream stream_130=new RewriteRuleTokenStream(adaptor,"token 130");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 120) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:870:2: ( ( '.' IDENT )+ -> ( ^( E_IDENT[\"E_IDENT\", true] IDENT ) )+ )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:871:2: ( '.' IDENT )+
            {
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:871:2: ( '.' IDENT )+
            int cnt111=0;
            loop111:
            do {
                int alt111=2;
                int LA111_0 = input.LA(1);

                if ( (LA111_0==130) ) {
                    int LA111_1 = input.LA(2);

                    if ( (synpred196_pollen()) ) {
                        alt111=1;
                    }


                }


                switch (alt111) {
            	case 1 :
            	    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:871:6: '.' IDENT
            	    {
            	    char_literal460=(Atom)match(input,130,FOLLOW_130_in_qualNameList5913); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_130.add(char_literal460);


            	    IDENT461=(Atom)match(input,IDENT,FOLLOW_IDENT_in_qualNameList5928); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_IDENT.add(IDENT461);


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
            // 873:9: -> ( ^( E_IDENT[\"E_IDENT\", true] IDENT ) )+
            {
                if ( !(stream_IDENT.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_IDENT.hasNext() ) {
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:873:12: ^( E_IDENT[\"E_IDENT\", true] IDENT )
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
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:875:1: arrayLit : '[' arrayLitList ']' -> ^( LIST[\"LIST\"] arrayLitList ) ;
    public final pollenParser.arrayLit_return arrayLit() throws RecognitionException {
        pollenParser.arrayLit_return retval = new pollenParser.arrayLit_return();
        retval.start = input.LT(1);

        int arrayLit_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom char_literal462=null;
        Atom char_literal464=null;
        pollenParser.arrayLitList_return arrayLitList463 =null;


        BaseNode char_literal462_tree=null;
        BaseNode char_literal464_tree=null;
        RewriteRuleTokenStream stream_139=new RewriteRuleTokenStream(adaptor,"token 139");
        RewriteRuleTokenStream stream_140=new RewriteRuleTokenStream(adaptor,"token 140");
        RewriteRuleSubtreeStream stream_arrayLitList=new RewriteRuleSubtreeStream(adaptor,"rule arrayLitList");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 121) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:876:2: ( '[' arrayLitList ']' -> ^( LIST[\"LIST\"] arrayLitList ) )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:876:4: '[' arrayLitList ']'
            {
            char_literal462=(Atom)match(input,139,FOLLOW_139_in_arrayLit5968); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_139.add(char_literal462);


            pushFollow(FOLLOW_arrayLitList_in_arrayLit5970);
            arrayLitList463=arrayLitList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_arrayLitList.add(arrayLitList463.getTree());

            char_literal464=(Atom)match(input,140,FOLLOW_140_in_arrayLit5972); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_140.add(char_literal464);


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
            // 876:25: -> ^( LIST[\"LIST\"] arrayLitList )
            {
                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:876:28: ^( LIST[\"LIST\"] arrayLitList )
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
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:878:1: arrayLitList : ( arrayLitElem ( ',' arrayLitElem )* -> ( arrayLitElem )+ | -> NIL );
    public final pollenParser.arrayLitList_return arrayLitList() throws RecognitionException {
        pollenParser.arrayLitList_return retval = new pollenParser.arrayLitList_return();
        retval.start = input.LT(1);

        int arrayLitList_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom char_literal466=null;
        pollenParser.arrayLitElem_return arrayLitElem465 =null;

        pollenParser.arrayLitElem_return arrayLitElem467 =null;


        BaseNode char_literal466_tree=null;
        RewriteRuleTokenStream stream_129=new RewriteRuleTokenStream(adaptor,"token 129");
        RewriteRuleSubtreeStream stream_arrayLitElem=new RewriteRuleSubtreeStream(adaptor,"rule arrayLitElem");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 122) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:879:2: ( arrayLitElem ( ',' arrayLitElem )* -> ( arrayLitElem )+ | -> NIL )
            int alt113=2;
            int LA113_0 = input.LA(1);

            if ( (LA113_0==CHAR||LA113_0==HEX_LIT||LA113_0==IDENT||LA113_0==INT_LIT||LA113_0==OCT_LIT||LA113_0==REAL_LIT||LA113_0==STRING||LA113_0==160||LA113_0==176||LA113_0==186) ) {
                alt113=1;
            }
            else if ( (LA113_0==140) ) {
                alt113=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 113, 0, input);

                throw nvae;

            }
            switch (alt113) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:879:4: arrayLitElem ( ',' arrayLitElem )*
                    {
                    pushFollow(FOLLOW_arrayLitElem_in_arrayLitList5994);
                    arrayLitElem465=arrayLitElem();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_arrayLitElem.add(arrayLitElem465.getTree());

                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:879:17: ( ',' arrayLitElem )*
                    loop112:
                    do {
                        int alt112=2;
                        int LA112_0 = input.LA(1);

                        if ( (LA112_0==129) ) {
                            alt112=1;
                        }


                        switch (alt112) {
                    	case 1 :
                    	    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:879:18: ',' arrayLitElem
                    	    {
                    	    char_literal466=(Atom)match(input,129,FOLLOW_129_in_arrayLitList5997); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_129.add(char_literal466);


                    	    pushFollow(FOLLOW_arrayLitElem_in_arrayLitList5999);
                    	    arrayLitElem467=arrayLitElem();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_arrayLitElem.add(arrayLitElem467.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop112;
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
                    // 879:37: -> ( arrayLitElem )+
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
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:880:4: 
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
                    // 880:4: -> NIL
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
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:882:1: arrayLitElem : ( primitiveLit | namedConstant );
    public final pollenParser.arrayLitElem_return arrayLitElem() throws RecognitionException {
        pollenParser.arrayLitElem_return retval = new pollenParser.arrayLitElem_return();
        retval.start = input.LT(1);

        int arrayLitElem_StartIndex = input.index();

        BaseNode root_0 = null;

        pollenParser.primitiveLit_return primitiveLit468 =null;

        pollenParser.namedConstant_return namedConstant469 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 123) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:883:2: ( primitiveLit | namedConstant )
            int alt114=2;
            int LA114_0 = input.LA(1);

            if ( (LA114_0==CHAR||LA114_0==HEX_LIT||LA114_0==INT_LIT||LA114_0==OCT_LIT||LA114_0==REAL_LIT||LA114_0==STRING||LA114_0==160||LA114_0==176||LA114_0==186) ) {
                alt114=1;
            }
            else if ( (LA114_0==IDENT) ) {
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
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:883:4: primitiveLit
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    pushFollow(FOLLOW_primitiveLit_in_arrayLitElem6023);
                    primitiveLit468=primitiveLit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveLit468.getTree());

                    }
                    break;
                case 2 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:883:19: namedConstant
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    pushFollow(FOLLOW_namedConstant_in_arrayLitElem6027);
                    namedConstant469=namedConstant();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, namedConstant469.getTree());

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
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:885:1: namedConstant : qualName ;
    public final pollenParser.namedConstant_return namedConstant() throws RecognitionException {
        pollenParser.namedConstant_return retval = new pollenParser.namedConstant_return();
        retval.start = input.LT(1);

        int namedConstant_StartIndex = input.index();

        BaseNode root_0 = null;

        pollenParser.qualName_return qualName470 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 124) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:886:2: ( qualName )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:886:4: qualName
            {
            root_0 = (BaseNode)adaptor.nil();


            pushFollow(FOLLOW_qualName_in_namedConstant6037);
            qualName470=qualName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, qualName470.getTree());

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
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:888:1: boolLit : ( 'true' | 'false' ) ;
    public final pollenParser.boolLit_return boolLit() throws RecognitionException {
        pollenParser.boolLit_return retval = new pollenParser.boolLit_return();
        retval.start = input.LT(1);

        int boolLit_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom set471=null;

        BaseNode set471_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 125) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:889:2: ( ( 'true' | 'false' ) )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:889:4: ( 'true' | 'false' )
            {
            root_0 = (BaseNode)adaptor.nil();


            set471=(Atom)input.LT(1);

            if ( input.LA(1)==160||input.LA(1)==186 ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (BaseNode)adaptor.create(set471)
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
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:891:1: nullLit : 'null' ;
    public final pollenParser.nullLit_return nullLit() throws RecognitionException {
        pollenParser.nullLit_return retval = new pollenParser.nullLit_return();
        retval.start = input.LT(1);

        int nullLit_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom string_literal472=null;

        BaseNode string_literal472_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 126) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:892:2: ( 'null' )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:892:4: 'null'
            {
            root_0 = (BaseNode)adaptor.nil();


            string_literal472=(Atom)match(input,176,FOLLOW_176_in_nullLit6067); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal472_tree = 
            (BaseNode)adaptor.create(string_literal472)
            ;
            adaptor.addChild(root_0, string_literal472_tree);
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
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:894:1: numLit : ( INT_LIT | OCT_LIT | REAL_LIT | HEX_LIT );
    public final pollenParser.numLit_return numLit() throws RecognitionException {
        pollenParser.numLit_return retval = new pollenParser.numLit_return();
        retval.start = input.LT(1);

        int numLit_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom INT_LIT473=null;
        Atom OCT_LIT474=null;
        Atom REAL_LIT475=null;
        Atom HEX_LIT476=null;

        BaseNode INT_LIT473_tree=null;
        BaseNode OCT_LIT474_tree=null;
        BaseNode REAL_LIT475_tree=null;
        BaseNode HEX_LIT476_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 127) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:898:2: ( INT_LIT | OCT_LIT | REAL_LIT | HEX_LIT )
            int alt115=4;
            switch ( input.LA(1) ) {
            case INT_LIT:
                {
                alt115=1;
                }
                break;
            case OCT_LIT:
                {
                alt115=2;
                }
                break;
            case REAL_LIT:
                {
                alt115=3;
                }
                break;
            case HEX_LIT:
                {
                alt115=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 115, 0, input);

                throw nvae;

            }

            switch (alt115) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:898:4: INT_LIT
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    INT_LIT473=(Atom)match(input,INT_LIT,FOLLOW_INT_LIT_in_numLit6084); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INT_LIT473_tree = 
                    (BaseNode)adaptor.create(INT_LIT473)
                    ;
                    adaptor.addChild(root_0, INT_LIT473_tree);
                    }

                    if ( state.backtracking==0 ) {litFlags.add(LitFlags.INT);}

                    }
                    break;
                case 2 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:899:5: OCT_LIT
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    OCT_LIT474=(Atom)match(input,OCT_LIT,FOLLOW_OCT_LIT_in_numLit6093); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    OCT_LIT474_tree = 
                    (BaseNode)adaptor.create(OCT_LIT474)
                    ;
                    adaptor.addChild(root_0, OCT_LIT474_tree);
                    }

                    if ( state.backtracking==0 ) {litFlags.add(LitFlags.OCT);}

                    }
                    break;
                case 3 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:900:5: REAL_LIT
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    REAL_LIT475=(Atom)match(input,REAL_LIT,FOLLOW_REAL_LIT_in_numLit6102); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    REAL_LIT475_tree = 
                    (BaseNode)adaptor.create(REAL_LIT475)
                    ;
                    adaptor.addChild(root_0, REAL_LIT475_tree);
                    }

                    if ( state.backtracking==0 ) {litFlags.add(LitFlags.REAL);}

                    }
                    break;
                case 4 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:901:5: HEX_LIT
                    {
                    root_0 = (BaseNode)adaptor.nil();


                    HEX_LIT476=(Atom)match(input,HEX_LIT,FOLLOW_HEX_LIT_in_numLit6111); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    HEX_LIT476_tree = 
                    (BaseNode)adaptor.create(HEX_LIT476)
                    ;
                    adaptor.addChild(root_0, HEX_LIT476_tree);
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
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:904:1: primitiveLit : ( boolLit -> ^( E_CONST[\"E_CONST\", litFlags] boolLit ) | numLit -> ^( E_CONST[\"E_CONST\", litFlags] numLit ) | nullLit -> ^( E_CONST[\"E_CONST\", litFlags] nullLit ) | STRING -> ^( E_CONST[\"E_CONST\", litFlags] STRING ) | CHAR -> ^( E_CONST[\"E_CONST\", litFlags] CHAR ) );
    public final pollenParser.primitiveLit_return primitiveLit() throws RecognitionException {
        pollenParser.primitiveLit_return retval = new pollenParser.primitiveLit_return();
        retval.start = input.LT(1);

        int primitiveLit_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom STRING480=null;
        Atom CHAR481=null;
        pollenParser.boolLit_return boolLit477 =null;

        pollenParser.numLit_return numLit478 =null;

        pollenParser.nullLit_return nullLit479 =null;


        BaseNode STRING480_tree=null;
        BaseNode CHAR481_tree=null;
        RewriteRuleTokenStream stream_CHAR=new RewriteRuleTokenStream(adaptor,"token CHAR");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");
        RewriteRuleSubtreeStream stream_numLit=new RewriteRuleSubtreeStream(adaptor,"rule numLit");
        RewriteRuleSubtreeStream stream_nullLit=new RewriteRuleSubtreeStream(adaptor,"rule nullLit");
        RewriteRuleSubtreeStream stream_boolLit=new RewriteRuleSubtreeStream(adaptor,"rule boolLit");

        	litFlags.clear();	

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 128) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:911:2: ( boolLit -> ^( E_CONST[\"E_CONST\", litFlags] boolLit ) | numLit -> ^( E_CONST[\"E_CONST\", litFlags] numLit ) | nullLit -> ^( E_CONST[\"E_CONST\", litFlags] nullLit ) | STRING -> ^( E_CONST[\"E_CONST\", litFlags] STRING ) | CHAR -> ^( E_CONST[\"E_CONST\", litFlags] CHAR ) )
            int alt116=5;
            switch ( input.LA(1) ) {
            case 160:
            case 186:
                {
                alt116=1;
                }
                break;
            case HEX_LIT:
            case INT_LIT:
            case OCT_LIT:
            case REAL_LIT:
                {
                alt116=2;
                }
                break;
            case 176:
                {
                alt116=3;
                }
                break;
            case STRING:
                {
                alt116=4;
                }
                break;
            case CHAR:
                {
                alt116=5;
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
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:911:4: boolLit
                    {
                    pushFollow(FOLLOW_boolLit_in_primitiveLit6136);
                    boolLit477=boolLit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_boolLit.add(boolLit477.getTree());

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
                    // 911:12: -> ^( E_CONST[\"E_CONST\", litFlags] boolLit )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:911:15: ^( E_CONST[\"E_CONST\", litFlags] boolLit )
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
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:912:4: numLit
                    {
                    pushFollow(FOLLOW_numLit_in_primitiveLit6155);
                    numLit478=numLit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_numLit.add(numLit478.getTree());

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
                    // 912:12: -> ^( E_CONST[\"E_CONST\", litFlags] numLit )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:912:15: ^( E_CONST[\"E_CONST\", litFlags] numLit )
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
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:913:4: nullLit
                    {
                    pushFollow(FOLLOW_nullLit_in_primitiveLit6175);
                    nullLit479=nullLit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_nullLit.add(nullLit479.getTree());

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
                    // 913:12: -> ^( E_CONST[\"E_CONST\", litFlags] nullLit )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:913:15: ^( E_CONST[\"E_CONST\", litFlags] nullLit )
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
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:914:4: STRING
                    {
                    STRING480=(Atom)match(input,STRING,FOLLOW_STRING_in_primitiveLit6194); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_STRING.add(STRING480);


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
                    // 915:5: -> ^( E_CONST[\"E_CONST\", litFlags] STRING )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:915:8: ^( E_CONST[\"E_CONST\", litFlags] STRING )
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
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:916:4: CHAR
                    {
                    CHAR481=(Atom)match(input,CHAR,FOLLOW_CHAR_in_primitiveLit6222); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CHAR.add(CHAR481);


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
                    // 917:6: -> ^( E_CONST[\"E_CONST\", litFlags] CHAR )
                    {
                        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:917:9: ^( E_CONST[\"E_CONST\", litFlags] CHAR )
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
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:919:1: stmtInjection : c= INJECT ( NL )+ -> ^( E_INJECT[\"E_INJECT\"] INJECT ) ;
    public final pollenParser.stmtInjection_return stmtInjection() throws RecognitionException {
        pollenParser.stmtInjection_return retval = new pollenParser.stmtInjection_return();
        retval.start = input.LT(1);

        int stmtInjection_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom c=null;
        Atom NL482=null;

        BaseNode c_tree=null;
        BaseNode NL482_tree=null;
        RewriteRuleTokenStream stream_INJECT=new RewriteRuleTokenStream(adaptor,"token INJECT");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 129) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:920:2: (c= INJECT ( NL )+ -> ^( E_INJECT[\"E_INJECT\"] INJECT ) )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:920:4: c= INJECT ( NL )+
            {
            c=(Atom)match(input,INJECT,FOLLOW_INJECT_in_stmtInjection6257); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_INJECT.add(c);


            if ( state.backtracking==0 ) {           
                        c.setText(getInject(c.getText()));
                    }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:923:2: ( NL )+
            int cnt117=0;
            loop117:
            do {
                int alt117=2;
                int LA117_0 = input.LA(1);

                if ( (LA117_0==NL) ) {
                    int LA117_1 = input.LA(2);

                    if ( (synpred208_pollen()) ) {
                        alt117=1;
                    }


                }


                switch (alt117) {
            	case 1 :
            	    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:923:2: NL
            	    {
            	    NL482=(Atom)match(input,NL,FOLLOW_NL_in_stmtInjection6263); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_NL.add(NL482);


            	    }
            	    break;

            	default :
            	    if ( cnt117 >= 1 ) break loop117;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(117, input);
                        throw eee;
                }
                cnt117++;
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
            // 924:2: -> ^( E_INJECT[\"E_INJECT\"] INJECT )
            {
                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:924:5: ^( E_INJECT[\"E_INJECT\"] INJECT )
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
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:926:1: injectionCode : c= INJECT -> ^( E_INJECT[\"E_INJECT\"] INJECT ) ;
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

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:927:2: (c= INJECT -> ^( E_INJECT[\"E_INJECT\"] INJECT ) )
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:927:4: c= INJECT
            {
            c=(Atom)match(input,INJECT,FOLLOW_INJECT_in_injectionCode6292); if (state.failed) return retval; 
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
            // 930:2: -> ^( E_INJECT[\"E_INJECT\"] INJECT )
            {
                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:930:5: ^( E_INJECT[\"E_INJECT\"] INJECT )
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
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:932:1: delim : ( ( SEMI ) ( NL )* ->| ( NL )+ ->| ( ( NL )* '}' )=> ( NL )* ->);
    public final pollenParser.delim_return delim() throws RecognitionException {
        pollenParser.delim_return retval = new pollenParser.delim_return();
        retval.start = input.LT(1);

        int delim_StartIndex = input.index();

        BaseNode root_0 = null;

        Atom SEMI483=null;
        Atom NL484=null;
        Atom NL485=null;
        Atom NL486=null;

        BaseNode SEMI483_tree=null;
        BaseNode NL484_tree=null;
        BaseNode NL485_tree=null;
        BaseNode NL486_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 131) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:933:2: ( ( SEMI ) ( NL )* ->| ( NL )+ ->| ( ( NL )* '}' )=> ( NL )* ->)
            int alt121=3;
            int LA121_0 = input.LA(1);

            if ( (LA121_0==SEMI) ) {
                alt121=1;
            }
            else if ( (LA121_0==NL) ) {
                int LA121_2 = input.LA(2);

                if ( (synpred212_pollen()) ) {
                    alt121=2;
                }
                else if ( (synpred214_pollen()) ) {
                    alt121=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 121, 2, input);

                    throw nvae;

                }
            }
            else if ( (LA121_0==163) && (synpred214_pollen())) {
                alt121=3;
            }
            else if ( (LA121_0==167) && (synpred214_pollen())) {
                alt121=3;
            }
            else if ( (LA121_0==INJECT) && (synpred214_pollen())) {
                alt121=3;
            }
            else if ( (LA121_0==173) && (synpred214_pollen())) {
                alt121=3;
            }
            else if ( (LA121_0==174) && (synpred214_pollen())) {
                alt121=3;
            }
            else if ( (LA121_0==148) && (synpred214_pollen())) {
                alt121=3;
            }
            else if ( (LA121_0==180) && (synpred214_pollen())) {
                alt121=3;
            }
            else if ( (LA121_0==149) && (synpred214_pollen())) {
                alt121=3;
            }
            else if ( (LA121_0==156) && (synpred214_pollen())) {
                alt121=3;
            }
            else if ( (LA121_0==EOF) && (synpred214_pollen())) {
                alt121=3;
            }
            else if ( (LA121_0==196) && (synpred214_pollen())) {
                alt121=3;
            }
            else if ( (LA121_0==158) && (synpred214_pollen())) {
                alt121=3;
            }
            else if ( (LA121_0==182) && (synpred214_pollen())) {
                alt121=3;
            }
            else if ( (LA121_0==164) && (synpred214_pollen())) {
                alt121=3;
            }
            else if ( (LA121_0==144||LA121_0==146||(LA121_0 >= 169 && LA121_0 <= 171)||LA121_0==184||(LA121_0 >= 188 && LA121_0 <= 190)) && (synpred214_pollen())) {
                alt121=3;
            }
            else if ( (LA121_0==IDENT) && (synpred214_pollen())) {
                alt121=3;
            }
            else if ( (LA121_0==126) && (synpred214_pollen())) {
                alt121=3;
            }
            else if ( (LA121_0==150) && (synpred214_pollen())) {
                alt121=3;
            }
            else if ( (LA121_0==191) && (synpred214_pollen())) {
                alt121=3;
            }
            else if ( (LA121_0==175) && (synpred214_pollen())) {
                alt121=3;
            }
            else if ( (LA121_0==129) && (synpred214_pollen())) {
                alt121=3;
            }
            else if ( (LA121_0==147) && (synpred214_pollen())) {
                alt121=3;
            }
            else if ( (LA121_0==152) && (synpred214_pollen())) {
                alt121=3;
            }
            else if ( (LA121_0==138) && (synpred214_pollen())) {
                alt121=3;
            }
            else if ( (LA121_0==143) && (synpred214_pollen())) {
                alt121=3;
            }
            else if ( (LA121_0==179) && (synpred214_pollen())) {
                alt121=3;
            }
            else if ( (LA121_0==183) && (synpred214_pollen())) {
                alt121=3;
            }
            else if ( (LA121_0==145) && (synpred214_pollen())) {
                alt121=3;
            }
            else if ( (LA121_0==151) && (synpred214_pollen())) {
                alt121=3;
            }
            else if ( (LA121_0==162) && (synpred214_pollen())) {
                alt121=3;
            }
            else if ( (LA121_0==161) && (synpred214_pollen())) {
                alt121=3;
            }
            else if ( (LA121_0==185) && (synpred214_pollen())) {
                alt121=3;
            }
            else if ( (LA121_0==153) && (synpred214_pollen())) {
                alt121=3;
            }
            else if ( (LA121_0==165) && (synpred214_pollen())) {
                alt121=3;
            }
            else if ( (LA121_0==181) && (synpred214_pollen())) {
                alt121=3;
            }
            else if ( (LA121_0==192) && (synpred214_pollen())) {
                alt121=3;
            }
            else if ( (LA121_0==160||LA121_0==186) && (synpred214_pollen())) {
                alt121=3;
            }
            else if ( (LA121_0==INT_LIT) && (synpred214_pollen())) {
                alt121=3;
            }
            else if ( (LA121_0==OCT_LIT) && (synpred214_pollen())) {
                alt121=3;
            }
            else if ( (LA121_0==REAL_LIT) && (synpred214_pollen())) {
                alt121=3;
            }
            else if ( (LA121_0==HEX_LIT) && (synpred214_pollen())) {
                alt121=3;
            }
            else if ( (LA121_0==176) && (synpred214_pollen())) {
                alt121=3;
            }
            else if ( (LA121_0==STRING) && (synpred214_pollen())) {
                alt121=3;
            }
            else if ( (LA121_0==CHAR) && (synpred214_pollen())) {
                alt121=3;
            }
            else if ( (LA121_0==139) && (synpred214_pollen())) {
                alt121=3;
            }
            else if ( (LA121_0==LOG_NOT) && (synpred214_pollen())) {
                alt121=3;
            }
            else if ( (LA121_0==BIT_NOT) && (synpred214_pollen())) {
                alt121=3;
            }
            else if ( (LA121_0==MINUS) && (synpred214_pollen())) {
                alt121=3;
            }
            else if ( (LA121_0==DEC||LA121_0==INC) && (synpred214_pollen())) {
                alt121=3;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 121, 0, input);

                throw nvae;

            }
            switch (alt121) {
                case 1 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:933:4: ( SEMI ) ( NL )*
                    {
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:933:4: ( SEMI )
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:933:5: SEMI
                    {
                    SEMI483=(Atom)match(input,SEMI,FOLLOW_SEMI_in_delim6323); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI483);


                    }


                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:933:11: ( NL )*
                    loop118:
                    do {
                        int alt118=2;
                        int LA118_0 = input.LA(1);

                        if ( (LA118_0==NL) ) {
                            int LA118_1 = input.LA(2);

                            if ( (synpred209_pollen()) ) {
                                alt118=1;
                            }


                        }


                        switch (alt118) {
                    	case 1 :
                    	    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:933:12: NL
                    	    {
                    	    NL484=(Atom)match(input,NL,FOLLOW_NL_in_delim6327); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_NL.add(NL484);


                    	    }
                    	    break;

                    	default :
                    	    break loop118;
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
                    // 933:17: ->
                    {
                        root_0 = null;
                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:934:4: ( NL )+
                    {
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:934:4: ( NL )+
                    int cnt119=0;
                    loop119:
                    do {
                        int alt119=2;
                        int LA119_0 = input.LA(1);

                        if ( (LA119_0==NL) ) {
                            int LA119_1 = input.LA(2);

                            if ( (synpred211_pollen()) ) {
                                alt119=1;
                            }


                        }


                        switch (alt119) {
                    	case 1 :
                    	    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:934:5: NL
                    	    {
                    	    NL485=(Atom)match(input,NL,FOLLOW_NL_in_delim6338); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_NL.add(NL485);


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
                    // 934:10: ->
                    {
                        root_0 = null;
                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 3 :
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:935:4: ( ( NL )* '}' )=> ( NL )*
                    {
                    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:935:20: ( NL )*
                    loop120:
                    do {
                        int alt120=2;
                        int LA120_0 = input.LA(1);

                        if ( (LA120_0==NL) ) {
                            int LA120_1 = input.LA(2);

                            if ( (synpred215_pollen()) ) {
                                alt120=1;
                            }


                        }


                        switch (alt120) {
                    	case 1 :
                    	    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:935:20: NL
                    	    {
                    	    NL486=(Atom)match(input,NL,FOLLOW_NL_in_delim6360); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_NL.add(NL486);


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
                    // 935:24: ->
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


    public static class delim_implicit_return extends ParserRuleReturnScope {
        BaseNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "delim_implicit"
    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:937:1: delim_implicit :;
    public final pollenParser.delim_implicit_return delim_implicit() throws RecognitionException {
        pollenParser.delim_implicit_return retval = new pollenParser.delim_implicit_return();
        retval.start = input.LT(1);

        int delim_implicit_StartIndex = input.index();

        BaseNode root_0 = null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 132) ) { return retval; }

            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:938:2: ()
            // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:939:2: 
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
            if ( state.backtracking>0 ) { memoize(input, 132, delim_implicit_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "delim_implicit"

    // $ANTLR start synpred2_pollen
    public final void synpred2_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:204:8: ( stmtInjection )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:204:8: stmtInjection
        {
        pushFollow(FOLLOW_stmtInjection_in_synpred2_pollen722);
        stmtInjection();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred2_pollen

    // $ANTLR start synpred6_pollen
    public final void synpred6_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:217:9: ( stmtExport )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:217:9: stmtExport
        {
        pushFollow(FOLLOW_stmtExport_in_synpred6_pollen823);
        stmtExport();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred6_pollen

    // $ANTLR start synpred9_pollen
    public final void synpred9_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:243:9: ( fcnDefinition )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:243:9: fcnDefinition
        {
        pushFollow(FOLLOW_fcnDefinition_in_synpred9_pollen932);
        fcnDefinition();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred9_pollen

    // $ANTLR start synpred11_pollen
    public final void synpred11_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:245:9: ( varDeclaration )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:245:9: varDeclaration
        {
        pushFollow(FOLLOW_varDeclaration_in_synpred11_pollen953);
        varDeclaration();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred11_pollen

    // $ANTLR start synpred15_pollen
    public final void synpred15_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:257:6: ( fcnDefinition )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:257:6: fcnDefinition
        {
        pushFollow(FOLLOW_fcnDefinition_in_synpred15_pollen1055);
        fcnDefinition();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred15_pollen

    // $ANTLR start synpred16_pollen
    public final void synpred16_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:258:8: ( varDeclaration )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:258:8: varDeclaration
        {
        pushFollow(FOLLOW_varDeclaration_in_synpred16_pollen1064);
        varDeclaration();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred16_pollen

    // $ANTLR start synpred20_pollen
    public final void synpred20_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:288:26: ( delim )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:288:26: delim
        {
        pushFollow(FOLLOW_delim_in_synpred20_pollen1206);
        delim();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred20_pollen

    // $ANTLR start synpred21_pollen
    public final void synpred21_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:288:4: ( IDENT ASSIGN INT_LIT ( delim )? )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:288:4: IDENT ASSIGN INT_LIT ( delim )?
        {
        match(input,IDENT,FOLLOW_IDENT_in_synpred21_pollen1199); if (state.failed) return ;

        match(input,ASSIGN,FOLLOW_ASSIGN_in_synpred21_pollen1201); if (state.failed) return ;

        match(input,INT_LIT,FOLLOW_INT_LIT_in_synpred21_pollen1203); if (state.failed) return ;

        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:288:25: ( delim )?
        int alt122=2;
        int LA122_0 = input.LA(1);

        if ( (LA122_0==NL||LA122_0==SEMI) ) {
            alt122=1;
        }
        else if ( (LA122_0==EOF) ) {
            int LA122_3 = input.LA(2);

            if ( (synpred20_pollen()) ) {
                alt122=1;
            }
        }
        switch (alt122) {
            case 1 :
                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:288:26: delim
                {
                pushFollow(FOLLOW_delim_in_synpred21_pollen1206);
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
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:289:11: ( delim )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:289:11: delim
        {
        pushFollow(FOLLOW_delim_in_synpred22_pollen1234);
        delim();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred22_pollen

    // $ANTLR start synpred30_pollen
    public final void synpred30_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:316:7: ( fcnDefinitionHost )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:316:7: fcnDefinitionHost
        {
        pushFollow(FOLLOW_fcnDefinitionHost_in_synpred30_pollen1413);
        fcnDefinitionHost();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred30_pollen

    // $ANTLR start synpred32_pollen
    public final void synpred32_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:318:7: ( varDeclaration )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:318:7: varDeclaration
        {
        pushFollow(FOLLOW_varDeclaration_in_synpred32_pollen1429);
        varDeclaration();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred32_pollen

    // $ANTLR start synpred34_pollen
    public final void synpred34_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:324:10: ( importAs )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:324:10: importAs
        {
        pushFollow(FOLLOW_importAs_in_synpred34_pollen1481);
        importAs();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred34_pollen

    // $ANTLR start synpred42_pollen
    public final void synpred42_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:358:7: ( '{' metaArgument ( ',' metaArgument )* '}' )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:358:7: '{' metaArgument ( ',' metaArgument )* '}'
        {
        match(input,193,FOLLOW_193_in_synpred42_pollen1735); if (state.failed) return ;

        pushFollow(FOLLOW_metaArgument_in_synpred42_pollen1737);
        metaArgument();

        state._fsp--;
        if (state.failed) return ;

        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:358:25: ( ',' metaArgument )*
        loop123:
        do {
            int alt123=2;
            int LA123_0 = input.LA(1);

            if ( (LA123_0==129) ) {
                alt123=1;
            }


            switch (alt123) {
        	case 1 :
        	    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:358:26: ',' metaArgument
        	    {
        	    match(input,129,FOLLOW_129_in_synpred42_pollen1741); if (state.failed) return ;

        	    pushFollow(FOLLOW_metaArgument_in_synpred42_pollen1743);
        	    metaArgument();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop123;
            }
        } while (true);


        match(input,196,FOLLOW_196_in_synpred42_pollen1747); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred42_pollen

    // $ANTLR start synpred45_pollen
    public final void synpred45_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:377:4: ( qualName metaArguments )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:377:4: qualName metaArguments
        {
        pushFollow(FOLLOW_qualName_in_synpred45_pollen1842);
        qualName();

        state._fsp--;
        if (state.failed) return ;

        pushFollow(FOLLOW_metaArguments_in_synpred45_pollen1844);
        metaArguments();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred45_pollen

    // $ANTLR start synpred47_pollen
    public final void synpred47_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:391:10: ( 'module' )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:391:11: 'module'
        {
        match(input,174,FOLLOW_174_in_synpred47_pollen1921); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred47_pollen

    // $ANTLR start synpred48_pollen
    public final void synpred48_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:392:8: ( 'class' )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:392:9: 'class'
        {
        match(input,148,FOLLOW_148_in_synpred48_pollen1941); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred48_pollen

    // $ANTLR start synpred49_pollen
    public final void synpred49_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:393:10: ( 'protocol' )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:393:11: 'protocol'
        {
        match(input,180,FOLLOW_180_in_synpred49_pollen1959); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred49_pollen

    // $ANTLR start synpred50_pollen
    public final void synpred50_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:394:10: ( 'composition' )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:394:11: 'composition'
        {
        match(input,149,FOLLOW_149_in_synpred50_pollen1977); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred50_pollen

    // $ANTLR start synpred51_pollen
    public final void synpred51_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:395:10: ( 'enum' )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:395:11: 'enum'
        {
        match(input,156,FOLLOW_156_in_synpred51_pollen1995); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred51_pollen

    // $ANTLR start synpred53_pollen
    public final void synpred53_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:407:23: ( NL )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:407:23: NL
        {
        match(input,NL,FOLLOW_NL_in_synpred53_pollen2079); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred53_pollen

    // $ANTLR start synpred57_pollen
    public final void synpred57_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:416:23: ( NL )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:416:23: NL
        {
        match(input,NL,FOLLOW_NL_in_synpred57_pollen2146); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred57_pollen

    // $ANTLR start synpred76_pollen
    public final void synpred76_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:446:10: ( ',' expr )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:446:10: ',' expr
        {
        match(input,129,FOLLOW_129_in_synpred76_pollen2348); if (state.failed) return ;

        pushFollow(FOLLOW_expr_in_synpred76_pollen2350);
        expr();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred76_pollen

    // $ANTLR start synpred77_pollen
    public final void synpred77_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:446:4: ( expr ( ',' expr )* )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:446:4: expr ( ',' expr )*
        {
        pushFollow(FOLLOW_expr_in_synpred77_pollen2345);
        expr();

        state._fsp--;
        if (state.failed) return ;

        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:446:9: ( ',' expr )*
        loop124:
        do {
            int alt124=2;
            int LA124_0 = input.LA(1);

            if ( (LA124_0==129) ) {
                alt124=1;
            }


            switch (alt124) {
        	case 1 :
        	    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:446:10: ',' expr
        	    {
        	    match(input,129,FOLLOW_129_in_synpred77_pollen2348); if (state.failed) return ;

        	    pushFollow(FOLLOW_expr_in_synpred77_pollen2350);
        	    expr();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop124;
            }
        } while (true);


        }

    }
    // $ANTLR end synpred77_pollen

    // $ANTLR start synpred78_pollen
    public final void synpred78_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:451:4: ( exprLogicalOr '?' expr ':' expr )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:451:4: exprLogicalOr '?' expr ':' expr
        {
        pushFollow(FOLLOW_exprLogicalOr_in_synpred78_pollen2385);
        exprLogicalOr();

        state._fsp--;
        if (state.failed) return ;

        match(input,137,FOLLOW_137_in_synpred78_pollen2387); if (state.failed) return ;

        pushFollow(FOLLOW_expr_in_synpred78_pollen2389);
        expr();

        state._fsp--;
        if (state.failed) return ;

        match(input,132,FOLLOW_132_in_synpred78_pollen2391); if (state.failed) return ;

        pushFollow(FOLLOW_expr_in_synpred78_pollen2393);
        expr();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred78_pollen

    // $ANTLR start synpred79_pollen
    public final void synpred79_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:457:4: ( '||' exprLogicalAnd )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:457:4: '||' exprLogicalAnd
        {
        match(input,195,FOLLOW_195_in_synpred79_pollen2448); if (state.failed) return ;

        pushFollow(FOLLOW_exprLogicalAnd_in_synpred79_pollen2450);
        exprLogicalAnd();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred79_pollen

    // $ANTLR start synpred80_pollen
    public final void synpred80_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:464:3: ( '&&' exprBitwiseOr )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:464:3: '&&' exprBitwiseOr
        {
        match(input,124,FOLLOW_124_in_synpred80_pollen2501); if (state.failed) return ;

        pushFollow(FOLLOW_exprBitwiseOr_in_synpred80_pollen2503);
        exprBitwiseOr();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred80_pollen

    // $ANTLR start synpred81_pollen
    public final void synpred81_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:471:3: ( '|' exprBitwiseXor )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:471:3: '|' exprBitwiseXor
        {
        match(input,194,FOLLOW_194_in_synpred81_pollen2552); if (state.failed) return ;

        pushFollow(FOLLOW_exprBitwiseXor_in_synpred81_pollen2554);
        exprBitwiseXor();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred81_pollen

    // $ANTLR start synpred82_pollen
    public final void synpred82_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:478:3: ( '^' exprBitwiseAnd )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:478:3: '^' exprBitwiseAnd
        {
        match(input,141,FOLLOW_141_in_synpred82_pollen2602); if (state.failed) return ;

        pushFollow(FOLLOW_exprBitwiseAnd_in_synpred82_pollen2604);
        exprBitwiseAnd();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred82_pollen

    // $ANTLR start synpred83_pollen
    public final void synpred83_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:485:3: ( '&' exprEquality )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:485:3: '&' exprEquality
        {
        match(input,125,FOLLOW_125_in_synpred83_pollen2652); if (state.failed) return ;

        pushFollow(FOLLOW_exprEquality_in_synpred83_pollen2654);
        exprEquality();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred83_pollen

    // $ANTLR start synpred84_pollen
    public final void synpred84_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:492:3: ( equalityOp exprRelational )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:492:3: equalityOp exprRelational
        {
        pushFollow(FOLLOW_equalityOp_in_synpred84_pollen2703);
        equalityOp();

        state._fsp--;
        if (state.failed) return ;

        pushFollow(FOLLOW_exprRelational_in_synpred84_pollen2705);
        exprRelational();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred84_pollen

    // $ANTLR start synpred85_pollen
    public final void synpred85_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:499:3: ( relationalOp exprShift )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:499:3: relationalOp exprShift
        {
        pushFollow(FOLLOW_relationalOp_in_synpred85_pollen2754);
        relationalOp();

        state._fsp--;
        if (state.failed) return ;

        pushFollow(FOLLOW_exprShift_in_synpred85_pollen2756);
        exprShift();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred85_pollen

    // $ANTLR start synpred86_pollen
    public final void synpred86_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:506:3: ( shiftOp exprAddSub )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:506:3: shiftOp exprAddSub
        {
        pushFollow(FOLLOW_shiftOp_in_synpred86_pollen2806);
        shiftOp();

        state._fsp--;
        if (state.failed) return ;

        pushFollow(FOLLOW_exprAddSub_in_synpred86_pollen2809);
        exprAddSub();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred86_pollen

    // $ANTLR start synpred87_pollen
    public final void synpred87_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:513:3: ( addSubOp exprMultDiv )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:513:3: addSubOp exprMultDiv
        {
        pushFollow(FOLLOW_addSubOp_in_synpred87_pollen2858);
        addSubOp();

        state._fsp--;
        if (state.failed) return ;

        pushFollow(FOLLOW_exprMultDiv_in_synpred87_pollen2860);
        exprMultDiv();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred87_pollen

    // $ANTLR start synpred88_pollen
    public final void synpred88_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:520:3: ( multDivModOp exprUnary )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:520:3: multDivModOp exprUnary
        {
        pushFollow(FOLLOW_multDivModOp_in_synpred88_pollen2915);
        multDivModOp();

        state._fsp--;
        if (state.failed) return ;

        pushFollow(FOLLOW_exprUnary_in_synpred88_pollen2917);
        exprUnary();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred88_pollen

    // $ANTLR start synpred96_pollen
    public final void synpred96_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:535:4: ( varOrFcnOrArray incDecOp )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:535:4: varOrFcnOrArray incDecOp
        {
        pushFollow(FOLLOW_varOrFcnOrArray_in_synpred96_pollen3115);
        varOrFcnOrArray();

        state._fsp--;
        if (state.failed) return ;

        pushFollow(FOLLOW_incDecOp_in_synpred96_pollen3117);
        incDecOp();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred96_pollen

    // $ANTLR start synpred97_pollen
    public final void synpred97_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:536:4: ( varOrFcnOrArray )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:536:4: varOrFcnOrArray
        {
        pushFollow(FOLLOW_varOrFcnOrArray_in_synpred97_pollen3138);
        varOrFcnOrArray();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred97_pollen

    // $ANTLR start synpred107_pollen
    public final void synpred107_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:595:4: ( typeName qualName )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:595:4: typeName qualName
        {
        pushFollow(FOLLOW_typeName_in_synpred107_pollen3452);
        typeName();

        state._fsp--;
        if (state.failed) return ;

        pushFollow(FOLLOW_qualName_in_synpred107_pollen3454);
        qualName();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred107_pollen

    // $ANTLR start synpred108_pollen
    public final void synpred108_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:597:4: ({...}? typeName )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:597:4: {...}? typeName
        {
        if ( !((input.LT(1).getText().equals(ti.getTypeName()) )) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred108_pollen", "input.LT(1).getText().equals(ti.getTypeName()) ");
        }

        pushFollow(FOLLOW_typeName_in_synpred108_pollen3490);
        typeName();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred108_pollen

    // $ANTLR start synpred109_pollen
    public final void synpred109_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:599:4: ( qualName )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:599:4: qualName
        {
        pushFollow(FOLLOW_qualName_in_synpred109_pollen3526);
        qualName();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred109_pollen

    // $ANTLR start synpred111_pollen
    public final void synpred111_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:601:4: ( '(' typeName ( ',' typeName )* ')' qualName )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:601:5: '(' typeName ( ',' typeName )* ')' qualName
        {
        match(input,126,FOLLOW_126_in_synpred111_pollen3567); if (state.failed) return ;

        pushFollow(FOLLOW_typeName_in_synpred111_pollen3569);
        typeName();

        state._fsp--;
        if (state.failed) return ;

        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:601:18: ( ',' typeName )*
        loop125:
        do {
            int alt125=2;
            int LA125_0 = input.LA(1);

            if ( (LA125_0==129) ) {
                alt125=1;
            }


            switch (alt125) {
        	case 1 :
        	    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:601:19: ',' typeName
        	    {
        	    match(input,129,FOLLOW_129_in_synpred111_pollen3572); if (state.failed) return ;

        	    pushFollow(FOLLOW_typeName_in_synpred111_pollen3574);
        	    typeName();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop125;
            }
        } while (true);


        match(input,127,FOLLOW_127_in_synpred111_pollen3578); if (state.failed) return ;

        pushFollow(FOLLOW_qualName_in_synpred111_pollen3580);
        qualName();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred111_pollen

    // $ANTLR start synpred116_pollen
    public final void synpred116_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:628:35: ( fieldOrArrayAccess )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:628:35: fieldOrArrayAccess
        {
        pushFollow(FOLLOW_fieldOrArrayAccess_in_synpred116_pollen3799);
        fieldOrArrayAccess();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred116_pollen

    // $ANTLR start synpred118_pollen
    public final void synpred118_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:630:30: ( fieldOrArrayAccess )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:630:30: fieldOrArrayAccess
        {
        pushFollow(FOLLOW_fieldOrArrayAccess_in_synpred118_pollen3832);
        fieldOrArrayAccess();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred118_pollen

    // $ANTLR start synpred119_pollen
    public final void synpred119_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:630:4: ( '@' IDENT fcnArgumentList ( fieldOrArrayAccess )? )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:630:4: '@' IDENT fcnArgumentList ( fieldOrArrayAccess )?
        {
        match(input,138,FOLLOW_138_in_synpred119_pollen3826); if (state.failed) return ;

        match(input,IDENT,FOLLOW_IDENT_in_synpred119_pollen3828); if (state.failed) return ;

        pushFollow(FOLLOW_fcnArgumentList_in_synpred119_pollen3830);
        fcnArgumentList();

        state._fsp--;
        if (state.failed) return ;

        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:630:30: ( fieldOrArrayAccess )?
        int alt128=2;
        int LA128_0 = input.LA(1);

        if ( (LA128_0==130||LA128_0==139) ) {
            alt128=1;
        }
        switch (alt128) {
            case 1 :
                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:630:30: fieldOrArrayAccess
                {
                pushFollow(FOLLOW_fieldOrArrayAccess_in_synpred119_pollen3832);
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
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:633:14: ( fieldOrArrayAccess )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:633:14: fieldOrArrayAccess
        {
        pushFollow(FOLLOW_fieldOrArrayAccess_in_synpred120_pollen3878);
        fieldOrArrayAccess();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred120_pollen

    // $ANTLR start synpred121_pollen
    public final void synpred121_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:633:4: ( '@' IDENT ( fieldOrArrayAccess )? )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:633:4: '@' IDENT ( fieldOrArrayAccess )?
        {
        match(input,138,FOLLOW_138_in_synpred121_pollen3874); if (state.failed) return ;

        match(input,IDENT,FOLLOW_IDENT_in_synpred121_pollen3876); if (state.failed) return ;

        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:633:14: ( fieldOrArrayAccess )?
        int alt129=2;
        int LA129_0 = input.LA(1);

        if ( (LA129_0==130||LA129_0==139) ) {
            alt129=1;
        }
        switch (alt129) {
            case 1 :
                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:633:14: fieldOrArrayAccess
                {
                pushFollow(FOLLOW_fieldOrArrayAccess_in_synpred121_pollen3878);
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
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:635:4: ( '@' )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:635:4: '@'
        {
        match(input,138,FOLLOW_138_in_synpred122_pollen3917); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred122_pollen

    // $ANTLR start synpred123_pollen
    public final void synpred123_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:637:29: ( fieldOrArrayAccess )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:637:29: fieldOrArrayAccess
        {
        pushFollow(FOLLOW_fieldOrArrayAccess_in_synpred123_pollen3941);
        fieldOrArrayAccess();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred123_pollen

    // $ANTLR start synpred124_pollen
    public final void synpred124_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:637:4: ( qualName fcnArgumentList ( fieldOrArrayAccess )? )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:637:4: qualName fcnArgumentList ( fieldOrArrayAccess )?
        {
        pushFollow(FOLLOW_qualName_in_synpred124_pollen3937);
        qualName();

        state._fsp--;
        if (state.failed) return ;

        pushFollow(FOLLOW_fcnArgumentList_in_synpred124_pollen3939);
        fcnArgumentList();

        state._fsp--;
        if (state.failed) return ;

        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:637:29: ( fieldOrArrayAccess )?
        int alt130=2;
        int LA130_0 = input.LA(1);

        if ( (LA130_0==130||LA130_0==139) ) {
            alt130=1;
        }
        switch (alt130) {
            case 1 :
                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:637:29: fieldOrArrayAccess
                {
                pushFollow(FOLLOW_fieldOrArrayAccess_in_synpred124_pollen3941);
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
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:639:13: ( fieldOrArrayAccess )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:639:13: fieldOrArrayAccess
        {
        pushFollow(FOLLOW_fieldOrArrayAccess_in_synpred125_pollen3971);
        fieldOrArrayAccess();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred125_pollen

    // $ANTLR start synpred127_pollen
    public final void synpred127_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:642:20: ( arrayAccess )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:642:20: arrayAccess
        {
        pushFollow(FOLLOW_arrayAccess_in_synpred127_pollen3989);
        arrayAccess();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred127_pollen

    // $ANTLR start synpred128_pollen
    public final void synpred128_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:647:4: ( '.' IDENT fcnArgumentList )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:647:4: '.' IDENT fcnArgumentList
        {
        match(input,130,FOLLOW_130_in_synpred128_pollen4003); if (state.failed) return ;

        match(input,IDENT,FOLLOW_IDENT_in_synpred128_pollen4005); if (state.failed) return ;

        pushFollow(FOLLOW_fcnArgumentList_in_synpred128_pollen4007);
        fcnArgumentList();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred128_pollen

    // $ANTLR start synpred129_pollen
    public final void synpred129_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:651:9: ( exprList )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:651:9: exprList
        {
        pushFollow(FOLLOW_exprList_in_synpred129_pollen4059);
        exprList();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred129_pollen

    // $ANTLR start synpred132_pollen
    public final void synpred132_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:659:5: ( NL )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:659:5: NL
        {
        match(input,NL,FOLLOW_NL_in_synpred132_pollen4130); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred132_pollen

    // $ANTLR start synpred133_pollen
    public final void synpred133_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:662:5: ( varDeclaration )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:662:5: varDeclaration
        {
        pushFollow(FOLLOW_varDeclaration_in_synpred133_pollen4147);
        varDeclaration();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred133_pollen

    // $ANTLR start synpred134_pollen
    public final void synpred134_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:663:5: ( stmtAssign delim )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:663:5: stmtAssign delim
        {
        pushFollow(FOLLOW_stmtAssign_in_synpred134_pollen4154);
        stmtAssign();

        state._fsp--;
        if (state.failed) return ;

        pushFollow(FOLLOW_delim_in_synpred134_pollen4156);
        delim();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred134_pollen

    // $ANTLR start synpred136_pollen
    public final void synpred136_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:665:4: ( stmtBind )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:665:4: stmtBind
        {
        pushFollow(FOLLOW_stmtBind_in_synpred136_pollen4168);
        stmtBind();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred136_pollen

    // $ANTLR start synpred148_pollen
    public final void synpred148_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:677:4: ( stmtInjection )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:677:4: stmtInjection
        {
        pushFollow(FOLLOW_stmtInjection_in_synpred148_pollen4233);
        stmtInjection();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred148_pollen

    // $ANTLR start synpred149_pollen
    public final void synpred149_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:681:4: ( varOrFcnOrArray ASSIGN expr )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:681:4: varOrFcnOrArray ASSIGN expr
        {
        pushFollow(FOLLOW_varOrFcnOrArray_in_synpred149_pollen4250);
        varOrFcnOrArray();

        state._fsp--;
        if (state.failed) return ;

        match(input,ASSIGN,FOLLOW_ASSIGN_in_synpred149_pollen4252); if (state.failed) return ;

        pushFollow(FOLLOW_expr_in_synpred149_pollen4254);
        expr();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred149_pollen

    // $ANTLR start synpred150_pollen
    public final void synpred150_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:683:4: ( injectionCode ASSIGN expr )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:683:4: injectionCode ASSIGN expr
        {
        pushFollow(FOLLOW_injectionCode_in_synpred150_pollen4284);
        injectionCode();

        state._fsp--;
        if (state.failed) return ;

        match(input,ASSIGN,FOLLOW_ASSIGN_in_synpred150_pollen4286); if (state.failed) return ;

        pushFollow(FOLLOW_expr_in_synpred150_pollen4288);
        expr();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred150_pollen

    // $ANTLR start synpred151_pollen
    public final void synpred151_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:685:4: ( varOrFcnOrArray assignOp expr )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:685:4: varOrFcnOrArray assignOp expr
        {
        pushFollow(FOLLOW_varOrFcnOrArray_in_synpred151_pollen4319);
        varOrFcnOrArray();

        state._fsp--;
        if (state.failed) return ;

        pushFollow(FOLLOW_assignOp_in_synpred151_pollen4321);
        assignOp();

        state._fsp--;
        if (state.failed) return ;

        pushFollow(FOLLOW_expr_in_synpred151_pollen4323);
        expr();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred151_pollen

    // $ANTLR start synpred156_pollen
    public final void synpred156_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:706:4: ( 'return' ( '(' ) ( expr ( ',' expr )+ ) ( ')' ) delim )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:706:4: 'return' ( '(' ) ( expr ( ',' expr )+ ) ( ')' ) delim
        {
        match(input,183,FOLLOW_183_in_synpred156_pollen4498); if (state.failed) return ;

        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:706:13: ( '(' )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:706:14: '('
        {
        match(input,126,FOLLOW_126_in_synpred156_pollen4501); if (state.failed) return ;

        }


        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:706:19: ( expr ( ',' expr )+ )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:706:20: expr ( ',' expr )+
        {
        pushFollow(FOLLOW_expr_in_synpred156_pollen4505);
        expr();

        state._fsp--;
        if (state.failed) return ;

        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:706:25: ( ',' expr )+
        int cnt132=0;
        loop132:
        do {
            int alt132=2;
            int LA132_0 = input.LA(1);

            if ( (LA132_0==129) ) {
                alt132=1;
            }


            switch (alt132) {
        	case 1 :
        	    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:706:26: ',' expr
        	    {
        	    match(input,129,FOLLOW_129_in_synpred156_pollen4508); if (state.failed) return ;

        	    pushFollow(FOLLOW_expr_in_synpred156_pollen4510);
        	    expr();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    if ( cnt132 >= 1 ) break loop132;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(132, input);
                    throw eee;
            }
            cnt132++;
        } while (true);


        }


        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:706:38: ( ')' )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:706:39: ')'
        {
        match(input,127,FOLLOW_127_in_synpred156_pollen4516); if (state.failed) return ;

        }


        pushFollow(FOLLOW_delim_in_synpred156_pollen4519);
        delim();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred156_pollen

    // $ANTLR start synpred159_pollen
    public final void synpred159_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:728:9: ( typeName IDENT '=' expr )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:728:9: typeName IDENT '=' expr
        {
        pushFollow(FOLLOW_typeName_in_synpred159_pollen4728);
        typeName();

        state._fsp--;
        if (state.failed) return ;

        match(input,IDENT,FOLLOW_IDENT_in_synpred159_pollen4730); if (state.failed) return ;

        match(input,ASSIGN,FOLLOW_ASSIGN_in_synpred159_pollen4732); if (state.failed) return ;

        pushFollow(FOLLOW_expr_in_synpred159_pollen4734);
        expr();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred159_pollen

    // $ANTLR start synpred164_pollen
    public final void synpred164_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:754:4: ( 'if' stmtIfBlock stmtsElif ( stmtElse )? )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:754:4: 'if' stmtIfBlock stmtsElif ( stmtElse )?
        {
        match(input,165,FOLLOW_165_in_synpred164_pollen4999); if (state.failed) return ;

        pushFollow(FOLLOW_stmtIfBlock_in_synpred164_pollen5001);
        stmtIfBlock();

        state._fsp--;
        if (state.failed) return ;

        pushFollow(FOLLOW_stmtsElif_in_synpred164_pollen5003);
        stmtsElif();

        state._fsp--;
        if (state.failed) return ;

        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:754:31: ( stmtElse )?
        int alt133=2;
        int LA133_0 = input.LA(1);

        if ( (LA133_0==155) ) {
            alt133=1;
        }
        switch (alt133) {
            case 1 :
                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:754:31: stmtElse
                {
                pushFollow(FOLLOW_stmtElse_in_synpred164_pollen5005);
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
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:755:4: ( 'if' stmtIfBlock stmtElse )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:755:4: 'if' stmtIfBlock stmtElse
        {
        match(input,165,FOLLOW_165_in_synpred165_pollen5024); if (state.failed) return ;

        pushFollow(FOLLOW_stmtIfBlock_in_synpred165_pollen5026);
        stmtIfBlock();

        state._fsp--;
        if (state.failed) return ;

        pushFollow(FOLLOW_stmtElse_in_synpred165_pollen5028);
        stmtElse();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred165_pollen

    // $ANTLR start synpred172_pollen
    public final void synpred172_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:802:4: ( typeName IDENT ( ASSIGN expr )? ',' )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:802:5: typeName IDENT ( ASSIGN expr )? ','
        {
        pushFollow(FOLLOW_typeName_in_synpred172_pollen5291);
        typeName();

        state._fsp--;
        if (state.failed) return ;

        match(input,IDENT,FOLLOW_IDENT_in_synpred172_pollen5293); if (state.failed) return ;

        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:802:20: ( ASSIGN expr )?
        int alt134=2;
        int LA134_0 = input.LA(1);

        if ( (LA134_0==ASSIGN) ) {
            alt134=1;
        }
        switch (alt134) {
            case 1 :
                // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:802:21: ASSIGN expr
                {
                match(input,ASSIGN,FOLLOW_ASSIGN_in_synpred172_pollen5296); if (state.failed) return ;

                pushFollow(FOLLOW_expr_in_synpred172_pollen5298);
                expr();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        match(input,129,FOLLOW_129_in_synpred172_pollen5302); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred172_pollen

    // $ANTLR start synpred173_pollen
    public final void synpred173_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:803:5: ( typeName IDENT '[' )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:803:6: typeName IDENT '['
        {
        pushFollow(FOLLOW_typeName_in_synpred173_pollen5315);
        typeName();

        state._fsp--;
        if (state.failed) return ;

        match(input,IDENT,FOLLOW_IDENT_in_synpred173_pollen5317); if (state.failed) return ;

        match(input,139,FOLLOW_139_in_synpred173_pollen5319); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred173_pollen

    // $ANTLR start synpred174_pollen
    public final void synpred174_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:804:5: ( typeName '(' )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:804:6: typeName '('
        {
        pushFollow(FOLLOW_typeName_in_synpred174_pollen5332);
        typeName();

        state._fsp--;
        if (state.failed) return ;

        match(input,126,FOLLOW_126_in_synpred174_pollen5334); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred174_pollen

    // $ANTLR start synpred175_pollen
    public final void synpred175_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:805:6: ( typeName varInit )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:805:7: typeName varInit
        {
        pushFollow(FOLLOW_typeName_in_synpred175_pollen5349);
        typeName();

        state._fsp--;
        if (state.failed) return ;

        pushFollow(FOLLOW_varInit_in_synpred175_pollen5351);
        varInit();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred175_pollen

    // $ANTLR start synpred179_pollen
    public final void synpred179_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:828:5: ( '[' varDim ']' )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:828:5: '[' varDim ']'
        {
        match(input,139,FOLLOW_139_in_synpred179_pollen5577); if (state.failed) return ;

        pushFollow(FOLLOW_varDim_in_synpred179_pollen5579);
        varDim();

        state._fsp--;
        if (state.failed) return ;

        match(input,140,FOLLOW_140_in_synpred179_pollen5581); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred179_pollen

    // $ANTLR start synpred183_pollen
    public final void synpred183_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:839:17: ( ',' initializer )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:839:17: ',' initializer
        {
        match(input,129,FOLLOW_129_in_synpred183_pollen5659); if (state.failed) return ;

        pushFollow(FOLLOW_initializer_in_synpred183_pollen5661);
        initializer();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred183_pollen

    // $ANTLR start synpred184_pollen
    public final void synpred184_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:845:4: ( typeName varDeclList )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:845:4: typeName varDeclList
        {
        pushFollow(FOLLOW_typeName_in_synpred184_pollen5693);
        typeName();

        state._fsp--;
        if (state.failed) return ;

        pushFollow(FOLLOW_varDeclList_in_synpred184_pollen5698);
        varDeclList();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred184_pollen

    // $ANTLR start synpred185_pollen
    public final void synpred185_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:846:13: ( ',' varInit )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:846:13: ',' varInit
        {
        match(input,129,FOLLOW_129_in_synpred185_pollen5706); if (state.failed) return ;

        pushFollow(FOLLOW_varInit_in_synpred185_pollen5709);
        varInit();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred185_pollen

    // $ANTLR start synpred195_pollen
    public final void synpred195_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:866:16: ( qualNameList )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:866:16: qualNameList
        {
        pushFollow(FOLLOW_qualNameList_in_synpred195_pollen5873);
        qualNameList();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred195_pollen

    // $ANTLR start synpred196_pollen
    public final void synpred196_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:871:6: ( '.' IDENT )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:871:6: '.' IDENT
        {
        match(input,130,FOLLOW_130_in_synpred196_pollen5913); if (state.failed) return ;

        match(input,IDENT,FOLLOW_IDENT_in_synpred196_pollen5928); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred196_pollen

    // $ANTLR start synpred208_pollen
    public final void synpred208_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:923:2: ( NL )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:923:2: NL
        {
        match(input,NL,FOLLOW_NL_in_synpred208_pollen6263); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred208_pollen

    // $ANTLR start synpred209_pollen
    public final void synpred209_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:933:12: ( NL )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:933:12: NL
        {
        match(input,NL,FOLLOW_NL_in_synpred209_pollen6327); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred209_pollen

    // $ANTLR start synpred211_pollen
    public final void synpred211_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:934:5: ( NL )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:934:5: NL
        {
        match(input,NL,FOLLOW_NL_in_synpred211_pollen6338); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred211_pollen

    // $ANTLR start synpred212_pollen
    public final void synpred212_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:934:4: ( ( NL )+ )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:934:4: ( NL )+
        {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:934:4: ( NL )+
        int cnt138=0;
        loop138:
        do {
            int alt138=2;
            int LA138_0 = input.LA(1);

            if ( (LA138_0==NL) ) {
                alt138=1;
            }


            switch (alt138) {
        	case 1 :
        	    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:934:5: NL
        	    {
        	    match(input,NL,FOLLOW_NL_in_synpred212_pollen6338); if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    if ( cnt138 >= 1 ) break loop138;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(138, input);
                    throw eee;
            }
            cnt138++;
        } while (true);


        }

    }
    // $ANTLR end synpred212_pollen

    // $ANTLR start synpred214_pollen
    public final void synpred214_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:935:4: ( ( NL )* '}' )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:935:5: ( NL )* '}'
        {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:935:5: ( NL )*
        loop139:
        do {
            int alt139=2;
            int LA139_0 = input.LA(1);

            if ( (LA139_0==NL) ) {
                alt139=1;
            }


            switch (alt139) {
        	case 1 :
        	    // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:935:6: NL
        	    {
        	    match(input,NL,FOLLOW_NL_in_synpred214_pollen6350); if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop139;
            }
        } while (true);


        match(input,196,FOLLOW_196_in_synpred214_pollen6354); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred214_pollen

    // $ANTLR start synpred215_pollen
    public final void synpred215_pollen_fragment() throws RecognitionException {
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:935:20: ( NL )
        // /home/lucidbee/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:935:20: NL
        {
        match(input,NL,FOLLOW_NL_in_synpred215_pollen6360); if (state.failed) return ;

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


 

    public static final BitSet FOLLOW_NL_in_unit677 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080040L,0x0014608810300000L});
    public static final BitSet FOLLOW_unitPackage_in_unit681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtPackage_in_unitPackage707 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L,0x0010608810300000L});
    public static final BitSet FOLLOW_importList_in_unitPackage713 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L,0x0010600010300000L});
    public static final BitSet FOLLOW_stmtInjection_in_unitPackage722 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L,0x0010600010300000L});
    public static final BitSet FOLLOW_unitTypeDefinition_in_unitPackage733 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_stmtInjection_in_unitPackage744 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_unitPackage754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_178_in_stmtPackage764 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_qualName_in_stmtPackage766 = new BitSet(new long[]{0x0000000000000000L,0x0000000008080000L});
    public static final BitSet FOLLOW_delim_in_stmtPackage768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_158_in_stmtExport800 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_qualName_in_stmtExport803 = new BitSet(new long[]{0x0000000000000000L,0x0000000008080000L});
    public static final BitSet FOLLOW_delim_in_stmtExport805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtExport_in_exportList823 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_148_in_classDefinition869 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_classDef_in_classDefinition871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_classDef890 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L,0x0000004000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_implementsClause_in_classDef901 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_braceOpen_in_classDef908 = new BitSet(new long[]{0x0000000000000000L,0x4000000000080042L,0xF1408E1010550000L,0x0000000000000010L});
    public static final BitSet FOLLOW_classFeature_in_classDef911 = new BitSet(new long[]{0x0000000000000000L,0x4000000000080042L,0xF1408E1010550000L,0x0000000000000010L});
    public static final BitSet FOLLOW_braceClose_in_classDef915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fcnDefinition_in_classFeature932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumDefinition_in_classFeature943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDeclaration_in_classFeature953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classDefinition_in_classFeature963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtInjection_in_classFeature973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_174_in_moduleDefinition990 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_moduleDefinition992 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L,0x0000004000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_implementsClause_in_moduleDefinition1007 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_braceOpen_in_moduleDefinition1016 = new BitSet(new long[]{0x0000000000000000L,0x4000000000080042L,0xF1408E1010550000L,0x0000000000000010L});
    public static final BitSet FOLLOW_moduleFeature_in_moduleDefinition1019 = new BitSet(new long[]{0x0000000000000000L,0x4000000000080042L,0xF1408E1010550000L,0x0000000000000010L});
    public static final BitSet FOLLOW_braceClose_in_moduleDefinition1023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fcnDefinition_in_moduleFeature1055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDeclaration_in_moduleFeature1064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumDefinition_in_moduleFeature1071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classDefinition_in_moduleFeature1078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtInjection_in_moduleFeature1084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_156_in_enumDefinition1097 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_enumDef_in_enumDefinition1099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_enumDef1125 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_braceOpen_in_enumDef1134 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_enumList_in_enumDef1136 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_braceClose_in_enumDef1138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumElement_in_enumList1169 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_129_in_enumList1172 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_enumElement_in_enumList1174 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_enumElement1199 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ASSIGN_in_enumElement1201 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_INT_LIT_in_enumElement1203 = new BitSet(new long[]{0x0000000000000000L,0x0000000008080000L});
    public static final BitSet FOLLOW_delim_in_enumElement1206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_enumElement1231 = new BitSet(new long[]{0x0000000000000000L,0x0000000008080000L});
    public static final BitSet FOLLOW_delim_in_enumElement1234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_180_in_protocolDefinition1254 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_protocolDefinition1256 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L,0x0000000080000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_extendsClause_in_protocolDefinition1264 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_braceOpen_in_protocolDefinition1270 = new BitSet(new long[]{0x0000000000000000L,0x4000000000080042L,0x71400E1010050000L,0x0000000000000010L});
    public static final BitSet FOLLOW_protocolFeature_in_protocolDefinition1273 = new BitSet(new long[]{0x0000000000000000L,0x4000000000080042L,0x71400E1010050000L,0x0000000000000010L});
    public static final BitSet FOLLOW_braceClose_in_protocolDefinition1277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumDefinition_in_protocolFeature1311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fcnDeclaration_in_protocolFeature1321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtInjection_in_protocolFeature1332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_149_in_compositionDefinition1345 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_compositionDefinition1347 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L,0x0000000080000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_extendsClause_in_compositionDefinition1355 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_braceOpen_in_compositionDefinition1362 = new BitSet(new long[]{0x0000000000000000L,0x4000000000080042L,0xF1408E1050450000L,0x0000000000000010L});
    public static final BitSet FOLLOW_compositionFeature_in_compositionDefinition1365 = new BitSet(new long[]{0x0000000000000000L,0x4000000000080042L,0xF1408E1050450000L,0x0000000000000010L});
    public static final BitSet FOLLOW_braceClose_in_compositionDefinition1369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exportList_in_compositionFeature1405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fcnDefinitionHost_in_compositionFeature1413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumDefinition_in_compositionFeature1421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDeclaration_in_compositionFeature1429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtInjection_in_compositionFeature1436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_importFrom_in_stmtImport1453 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_167_in_stmtImport1463 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_qualName_in_stmtImport1465 = new BitSet(new long[]{0x0000000000000000L,0x0000000008080000L,0x0000000000004000L,0x0000000000000002L});
    public static final BitSet FOLLOW_metaArguments_in_stmtImport1468 = new BitSet(new long[]{0x0000000000000000L,0x0000000008080000L,0x0000000000004000L});
    public static final BitSet FOLLOW_importAs_in_stmtImport1481 = new BitSet(new long[]{0x0000000000000000L,0x0000000008080000L});
    public static final BitSet FOLLOW_delim_in_stmtImport1484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_163_in_importFrom1520 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_qualName_in_importFrom1522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_142_in_importAs1550 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_qualName_in_importAs1552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtImport_in_importList1578 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000008800000000L});
    public static final BitSet FOLLOW_173_in_meta1612 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_braceOpen_in_meta1621 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x79000E0000050000L});
    public static final BitSet FOLLOW_metaFormalParameters_in_meta1623 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_braceClose_in_meta1625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_metaFormalParameter_in_metaFormalParameters1650 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_129_in_metaFormalParameters1654 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x79000E0000050000L});
    public static final BitSet FOLLOW_metaFormalParameter_in_metaFormalParameters1656 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_metaFormalParameterType_in_metaFormalParameter1679 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_metaFormalParameter1681 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ASSIGN_in_metaFormalParameter1684 = new BitSet(new long[]{0x4000000000000800L,0x0000000022400082L,0x75010E0100050000L});
    public static final BitSet FOLLOW_metaArgument_in_metaFormalParameter1686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_187_in_metaFormalParameterType1715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_builtinType_in_metaFormalParameterType1722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_193_in_metaArguments1735 = new BitSet(new long[]{0x4000000000000800L,0x0000000022400082L,0x75010E0100050000L});
    public static final BitSet FOLLOW_metaArgument_in_metaArguments1737 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_129_in_metaArguments1741 = new BitSet(new long[]{0x4000000000000800L,0x0000000022400082L,0x75010E0100050000L});
    public static final BitSet FOLLOW_metaArgument_in_metaArguments1743 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_196_in_metaArguments1747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_193_in_metaArguments1763 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_196_in_metaArguments1765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitiveLit_in_metaArgument1794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeNameScalar_in_metaArgument1800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeNameScalar_in_typeName1814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_builtinType_in_typeNameScalar1827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_userTypeName_in_typeNameScalar1832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qualName_in_userTypeName1842 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_metaArguments_in_userTypeName1844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qualName_in_userTypeName1865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_meta_in_unitTypeDefinition1904 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0010400010300000L});
    public static final BitSet FOLLOW_moduleDefinition_in_unitTypeDefinition1926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classDefinition_in_unitTypeDefinition1947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_protocolDefinition_in_unitTypeDefinition1964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compositionDefinition_in_unitTypeDefinition1982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumDefinition_in_unitTypeDefinition2000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_159_in_extendsClause2025 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_extendsClause2028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_166_in_implementsClause2047 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_implementsClause2050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NL_in_braceClose2070 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_196_in_braceClose2075 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_NL_in_braceClose2079 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_NL_in_braceCloseAtEOF2103 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_196_in_braceCloseAtEOF2108 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_NL_in_braceCloseAtEOF2112 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_NL_in_braceOpen2137 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_193_in_braceOpen2142 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_NL_in_braceOpen2146 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_LOG_NOT_in_logicalNotOp2323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BIT_NOT_in_bitwiseNotOp2334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_exprList2345 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_129_in_exprList2348 = new BitSet(new long[]{0x4000000000002C00L,0x40000000224022E2L,0x0401800100000C00L});
    public static final BitSet FOLLOW_expr_in_exprList2350 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_exprLogicalOr_in_expr2385 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_137_in_expr2387 = new BitSet(new long[]{0x4000000000002C00L,0x40000000224022E2L,0x0401800100000C00L});
    public static final BitSet FOLLOW_expr_in_expr2389 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_132_in_expr2391 = new BitSet(new long[]{0x4000000000002C00L,0x40000000224022E2L,0x0401800100000C00L});
    public static final BitSet FOLLOW_expr_in_expr2393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exprLogicalOr_in_expr2416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exprLogicalAnd_in_exprLogicalOr2434 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_195_in_exprLogicalOr2448 = new BitSet(new long[]{0x4000000000002C00L,0x40000000224022E2L,0x0401800100000C00L});
    public static final BitSet FOLLOW_exprLogicalAnd_in_exprLogicalOr2450 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_exprBitwiseOr_in_exprLogicalAnd2489 = new BitSet(new long[]{0x0000000000000002L,0x1000000000000000L});
    public static final BitSet FOLLOW_124_in_exprLogicalAnd2501 = new BitSet(new long[]{0x4000000000002C00L,0x40000000224022E2L,0x0401800100000C00L});
    public static final BitSet FOLLOW_exprBitwiseOr_in_exprLogicalAnd2503 = new BitSet(new long[]{0x0000000000000002L,0x1000000000000000L});
    public static final BitSet FOLLOW_exprBitwiseXor_in_exprBitwiseOr2540 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_194_in_exprBitwiseOr2552 = new BitSet(new long[]{0x4000000000002C00L,0x40000000224022E2L,0x0401800100000C00L});
    public static final BitSet FOLLOW_exprBitwiseXor_in_exprBitwiseOr2554 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_exprBitwiseAnd_in_exprBitwiseXor2590 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_141_in_exprBitwiseXor2602 = new BitSet(new long[]{0x4000000000002C00L,0x40000000224022E2L,0x0401800100000C00L});
    public static final BitSet FOLLOW_exprBitwiseAnd_in_exprBitwiseXor2604 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_exprEquality_in_exprBitwiseAnd2640 = new BitSet(new long[]{0x0000000000000002L,0x2000000000000000L});
    public static final BitSet FOLLOW_125_in_exprBitwiseAnd2652 = new BitSet(new long[]{0x4000000000002C00L,0x40000000224022E2L,0x0401800100000C00L});
    public static final BitSet FOLLOW_exprEquality_in_exprBitwiseAnd2654 = new BitSet(new long[]{0x0000000000000002L,0x2000000000000000L});
    public static final BitSet FOLLOW_exprRelational_in_exprEquality2690 = new BitSet(new long[]{0x0000008000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_equalityOp_in_exprEquality2703 = new BitSet(new long[]{0x4000000000002C00L,0x40000000224022E2L,0x0401800100000C00L});
    public static final BitSet FOLLOW_exprRelational_in_exprEquality2705 = new BitSet(new long[]{0x0000008000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_exprShift_in_exprRelational2741 = new BitSet(new long[]{0x1000000000000002L,0x0000000000000800L,0x00000000000000A0L});
    public static final BitSet FOLLOW_relationalOp_in_exprRelational2754 = new BitSet(new long[]{0x4000000000002C00L,0x40000000224022E2L,0x0401800100000C00L});
    public static final BitSet FOLLOW_exprShift_in_exprRelational2756 = new BitSet(new long[]{0x1000000000000002L,0x0000000000000800L,0x00000000000000A0L});
    public static final BitSet FOLLOW_exprAddSub_in_exprShift2793 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000140L});
    public static final BitSet FOLLOW_shiftOp_in_exprShift2806 = new BitSet(new long[]{0x4000000000002C00L,0x40000000224022E2L,0x0401800100000C00L});
    public static final BitSet FOLLOW_exprAddSub_in_exprShift2809 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000140L});
    public static final BitSet FOLLOW_exprMultDiv_in_exprAddSub2846 = new BitSet(new long[]{0x0000000000000002L,0x0000000000802000L});
    public static final BitSet FOLLOW_addSubOp_in_exprAddSub2858 = new BitSet(new long[]{0x4000000000002C00L,0x40000000224022E2L,0x0401800100000C00L});
    public static final BitSet FOLLOW_exprMultDiv_in_exprAddSub2860 = new BitSet(new long[]{0x0000000000000002L,0x0000000000802000L});
    public static final BitSet FOLLOW_exprUnary_in_exprMultDiv2903 = new BitSet(new long[]{0x0000000000000002L,0x0800000000000000L,0x0000000000000009L});
    public static final BitSet FOLLOW_multDivModOp_in_exprMultDiv2915 = new BitSet(new long[]{0x4000000000002C00L,0x40000000224022E2L,0x0401800100000C00L});
    public static final BitSet FOLLOW_exprUnary_in_exprMultDiv2917 = new BitSet(new long[]{0x0000000000000002L,0x0800000000000000L,0x0000000000000009L});
    public static final BitSet FOLLOW_175_in_exprNew2952 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L,0x71000E0000050000L});
    public static final BitSet FOLLOW_typeName_in_exprNew2954 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_fcnArgumentList_in_exprNew2956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitiveLit_in_exprUnary2982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_injectionCode_in_exprUnary2987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayLit_in_exprUnary2992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicalNotOp_in_exprUnary3016 = new BitSet(new long[]{0x4000000000002C00L,0x40000000224022E2L,0x0401800100000C00L});
    public static final BitSet FOLLOW_expr_in_exprUnary3018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bitwiseNotOp_in_exprUnary3042 = new BitSet(new long[]{0x4000000000002C00L,0x40000000224022E2L,0x0401800100000C00L});
    public static final BitSet FOLLOW_expr_in_exprUnary3044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_126_in_exprUnary3068 = new BitSet(new long[]{0x4000000000002C00L,0x40000000224022E2L,0x0401800100000C00L});
    public static final BitSet FOLLOW_expr_in_exprUnary3070 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_127_in_exprUnary3072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_exprUnary3088 = new BitSet(new long[]{0x4000000000002C00L,0x40000000224022E2L,0x0401800100000C00L});
    public static final BitSet FOLLOW_expr_in_exprUnary3090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varOrFcnOrArray_in_exprUnary3115 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000020L});
    public static final BitSet FOLLOW_incDecOp_in_exprUnary3117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varOrFcnOrArray_in_exprUnary3138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_incDecOp_in_exprUnary3143 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L,0x0000800000000400L});
    public static final BitSet FOLLOW_varOrFcnOrArray_in_exprUnary3145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exprNew_in_exprUnary3166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_182_in_fcnDefinition3186 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000002L,0x71000E1000050000L});
    public static final BitSet FOLLOW_164_in_fcnDefinition3197 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000002L,0x71000E0000050000L});
    public static final BitSet FOLLOW_fcnType_fcnName_in_fcnDefinition3207 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_fcnFormalParameterList_in_fcnDefinition3209 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_fcnBody_in_fcnDefinition3211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_182_in_fcnDefinitionHost3253 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000002L,0x71000E1000050000L});
    public static final BitSet FOLLOW_164_in_fcnDefinitionHost3258 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000002L,0x71000E0000050000L});
    public static final BitSet FOLLOW_fcnType_fcnName_in_fcnDefinitionHost3269 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_fcnFormalParameterList_in_fcnDefinitionHost3272 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_fcnBody_in_fcnDefinitionHost3274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_182_in_fcnAttr3318 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_164_in_fcnAttr3329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_braceOpen_in_fcnBody3346 = new BitSet(new long[]{0x4000000000002C00L,0x40000000224822E2L,0xF7A98E3702C78C00L,0x0000000000000011L});
    public static final BitSet FOLLOW_stmts_in_fcnBody3349 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_braceClose_in_fcnBody3353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_182_in_fcnDeclaration3392 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000002L,0x71000E1000050000L});
    public static final BitSet FOLLOW_164_in_fcnDeclaration3403 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000002L,0x71000E0000050000L});
    public static final BitSet FOLLOW_fcnType_fcnName_in_fcnDeclaration3413 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_fcnFormalParameterList_in_fcnDeclaration3416 = new BitSet(new long[]{0x0000000000000000L,0x0000000008080000L});
    public static final BitSet FOLLOW_delim_in_fcnDeclaration3419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeName_in_fcnType_fcnName3452 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_qualName_in_fcnType_fcnName3454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeName_in_fcnType_fcnName3490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qualName_in_fcnType_fcnName3526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fcnTypes_fcnName_in_fcnType_fcnName3585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_126_in_fcnTypes_fcnName3596 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L,0x71000E0000050000L});
    public static final BitSet FOLLOW_fcnTypes_in_fcnTypes_fcnName3598 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_127_in_fcnTypes_fcnName3600 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_qualName_in_fcnTypes_fcnName3602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeName_in_fcnTypes3623 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_129_in_fcnTypes3626 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L,0x71000E0000050000L});
    public static final BitSet FOLLOW_typeName_in_fcnTypes3628 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_126_in_fcnFormalParameterList3653 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000002L,0x71000E0000050000L});
    public static final BitSet FOLLOW_fcnFormalParameters_in_fcnFormalParameterList3655 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_127_in_fcnFormalParameterList3657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fcnFormalParameter_in_fcnFormalParameters3671 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_129_in_fcnFormalParameters3674 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L,0x71000E0000050000L});
    public static final BitSet FOLLOW_fcnFormalParameter_in_fcnFormalParameters3676 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_typeName_in_fcnFormalParameter3719 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_fcnFormalParameter3721 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ASSIGN_in_fcnFormalParameter3725 = new BitSet(new long[]{0x4000000000002C00L,0x40000000224022E2L,0x0401800100000C00L});
    public static final BitSet FOLLOW_expr_in_fcnFormalParameter3727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_126_in_fcnArgumentList3764 = new BitSet(new long[]{0x4000000000002C00L,0x40000000224022E2L,0x0401800100000C00L});
    public static final BitSet FOLLOW_fcnArguments_in_fcnArgumentList3766 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_127_in_fcnArgumentList3768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exprList_in_fcnArguments3783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_175_in_varOrFcnOrArray3793 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L,0x71000E0000050000L});
    public static final BitSet FOLLOW_typeName_in_varOrFcnOrArray3795 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_fcnArgumentList_in_varOrFcnOrArray3797 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000804L});
    public static final BitSet FOLLOW_fieldOrArrayAccess_in_varOrFcnOrArray3799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_138_in_varOrFcnOrArray3826 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_varOrFcnOrArray3828 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_fcnArgumentList_in_varOrFcnOrArray3830 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000804L});
    public static final BitSet FOLLOW_fieldOrArrayAccess_in_varOrFcnOrArray3832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_138_in_varOrFcnOrArray3874 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_varOrFcnOrArray3876 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000804L});
    public static final BitSet FOLLOW_fieldOrArrayAccess_in_varOrFcnOrArray3878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_138_in_varOrFcnOrArray3917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qualName_in_varOrFcnOrArray3937 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_fcnArgumentList_in_varOrFcnOrArray3939 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000804L});
    public static final BitSet FOLLOW_fieldOrArrayAccess_in_varOrFcnOrArray3941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qualName_in_varOrFcnOrArray3969 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000804L});
    public static final BitSet FOLLOW_fieldOrArrayAccess_in_varOrFcnOrArray3971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fieldAccess_in_fieldOrArrayAccess3985 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000804L});
    public static final BitSet FOLLOW_arrayAccess_in_fieldOrArrayAccess3989 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000804L});
    public static final BitSet FOLLOW_130_in_fieldAccess4003 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_fieldAccess4005 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_fcnArgumentList_in_fieldAccess4007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_130_in_fieldAccess4029 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_fieldAccess4031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_139_in_arrayAccess4056 = new BitSet(new long[]{0x4000000000002C00L,0x40000000224022E2L,0x0401800100001C00L});
    public static final BitSet FOLLOW_exprList_in_arrayAccess4059 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_140_in_arrayAccess4063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_braceOpen_in_stmtBlock4084 = new BitSet(new long[]{0x4000000000002C00L,0x40000000224822E2L,0xF7A98E3702C78C00L,0x0000000000000011L});
    public static final BitSet FOLLOW_stmts_in_stmtBlock4086 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_braceClose_in_stmtBlock4088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmt_in_stmts4108 = new BitSet(new long[]{0x4000000000002C02L,0x40000000224022E2L,0xF7A98E3702C78C00L,0x0000000000000001L});
    public static final BitSet FOLLOW_NL_in_stmts4130 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_varDeclaration_in_stmt4147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtAssign_in_stmt4154 = new BitSet(new long[]{0x0000000000000000L,0x0000000008080000L});
    public static final BitSet FOLLOW_delim_in_stmt4156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtAssert_in_stmt4163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtBind_in_stmt4168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtPrint_in_stmt4173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtReturn_in_stmt4178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtBreak_in_stmt4183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtContinue_in_stmt4189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtForEach_in_stmt4195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtFor_in_stmt4201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtSwitch_in_stmt4206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtDoWhile_in_stmt4212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtIf_in_stmt4217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtProvided_in_stmt4222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtWhile_in_stmt4227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtInjection_in_stmt4233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_stmt4238 = new BitSet(new long[]{0x0000000000000000L,0x0000000008080000L});
    public static final BitSet FOLLOW_delim_in_stmt4240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varOrFcnOrArray_in_stmtAssign4250 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ASSIGN_in_stmtAssign4252 = new BitSet(new long[]{0x4000000000002C00L,0x40000000224022E2L,0x0401800100000C00L});
    public static final BitSet FOLLOW_expr_in_stmtAssign4254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_injectionCode_in_stmtAssign4284 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ASSIGN_in_stmtAssign4286 = new BitSet(new long[]{0x4000000000002C00L,0x40000000224022E2L,0x0401800100000C00L});
    public static final BitSet FOLLOW_expr_in_stmtAssign4288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varOrFcnOrArray_in_stmtAssign4319 = new BitSet(new long[]{0x0000000000008390L,0x0000000044030400L});
    public static final BitSet FOLLOW_assignOp_in_stmtAssign4321 = new BitSet(new long[]{0x4000000000002C00L,0x40000000224022E2L,0x0401800100000C00L});
    public static final BitSet FOLLOW_expr_in_stmtAssign4323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_injectionCode_in_stmtAssign4354 = new BitSet(new long[]{0x0000000000008390L,0x0000000044030400L});
    public static final BitSet FOLLOW_assignOp_in_stmtAssign4356 = new BitSet(new long[]{0x4000000000002C00L,0x40000000224022E2L,0x0401800100000C00L});
    public static final BitSet FOLLOW_expr_in_stmtAssign4358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_143_in_stmtAssert4393 = new BitSet(new long[]{0x4000000000002C00L,0x400000002A4822E2L,0x0401800100000C00L});
    public static final BitSet FOLLOW_exprList_in_stmtAssert4395 = new BitSet(new long[]{0x0000000000000000L,0x0000000008080000L});
    public static final BitSet FOLLOW_delim_in_stmtAssert4397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varOrFcnOrArray_in_stmtBind4415 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_BIND_in_stmtBind4417 = new BitSet(new long[]{0x4000000000002C00L,0x40000000224022E2L,0x0401800100000C00L});
    public static final BitSet FOLLOW_expr_in_stmtBind4420 = new BitSet(new long[]{0x0000000000000000L,0x0000000008080000L});
    public static final BitSet FOLLOW_delim_in_stmtBind4423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_179_in_stmtPrint4445 = new BitSet(new long[]{0x4000000000002C00L,0x40000000224022E2L,0x0403900120000C00L});
    public static final BitSet FOLLOW_stmtPrintTarget_in_stmtPrint4448 = new BitSet(new long[]{0x4000000000002C00L,0x40000000224022E2L,0x0401800100000C00L});
    public static final BitSet FOLLOW_exprList_in_stmtPrint4452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_183_in_stmtReturn4498 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_126_in_stmtReturn4501 = new BitSet(new long[]{0x4000000000002C00L,0x40000000224022E2L,0x0401800100000C00L});
    public static final BitSet FOLLOW_expr_in_stmtReturn4505 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_129_in_stmtReturn4508 = new BitSet(new long[]{0x4000000000002C00L,0x40000000224022E2L,0x0401800100000C00L});
    public static final BitSet FOLLOW_expr_in_stmtReturn4510 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_127_in_stmtReturn4516 = new BitSet(new long[]{0x0000000000000000L,0x0000000008080000L});
    public static final BitSet FOLLOW_delim_in_stmtReturn4519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_183_in_stmtReturn4533 = new BitSet(new long[]{0x4000000000002C00L,0x40000000224022E2L,0x0401800100000C00L});
    public static final BitSet FOLLOW_expr_in_stmtReturn4537 = new BitSet(new long[]{0x0000000000000000L,0x0000000008080000L});
    public static final BitSet FOLLOW_delim_in_stmtReturn4541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_145_in_stmtBreak4559 = new BitSet(new long[]{0x0000000000000000L,0x0000000008080000L});
    public static final BitSet FOLLOW_delim_in_stmtBreak4561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_151_in_stmtContinue4577 = new BitSet(new long[]{0x0000000000000000L,0x0000000008080000L});
    public static final BitSet FOLLOW_delim_in_stmtContinue4579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_161_in_stmtFor4600 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_126_in_stmtFor4602 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000042L,0x71008E0000050400L});
    public static final BitSet FOLLOW_stmtForInit_in_stmtFor4604 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_SEMI_in_stmtFor4606 = new BitSet(new long[]{0x4000000000002C00L,0x400000002A4022E2L,0x0401800100000C00L});
    public static final BitSet FOLLOW_stmtForCond_in_stmtFor4608 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_SEMI_in_stmtFor4610 = new BitSet(new long[]{0x4000000000002C00L,0xC0000000224022E2L,0x0401800100000C00L});
    public static final BitSet FOLLOW_stmtForNext_in_stmtFor4612 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_127_in_stmtFor4614 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_stmtBlock_in_stmtFor4616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_stmtForCond4684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeName_in_stmtForInit4728 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_stmtForInit4730 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ASSIGN_in_stmtForInit4732 = new BitSet(new long[]{0x4000000000002C00L,0x40000000224022E2L,0x0401800100000C00L});
    public static final BitSet FOLLOW_expr_in_stmtForInit4734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtAssign_in_stmtForInit4771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_stmtForNext4814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_162_in_stmtForEach4827 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_126_in_stmtForEach4829 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_stmtForEach4831 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_168_in_stmtForEach4833 = new BitSet(new long[]{0x4000000000002C00L,0x40000000224022E2L,0x0401800100000C00L});
    public static final BitSet FOLLOW_expr_in_stmtForEach4835 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_127_in_stmtForEach4837 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_stmtBlock_in_stmtForEach4839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_185_in_stmtSwitch4865 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_126_in_stmtSwitch4867 = new BitSet(new long[]{0x4000000000002C00L,0x40000000224022E2L,0x0401800100000C00L});
    public static final BitSet FOLLOW_expr_in_stmtSwitch4869 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_127_in_stmtSwitch4871 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_braceOpen_in_stmtSwitch4873 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L,0x0000000001080000L,0x0000000000000010L});
    public static final BitSet FOLLOW_stmtsCase_in_stmtSwitch4875 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_braceClose_in_stmtSwitch4877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtCase_in_stmtsCase4901 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000001080000L});
    public static final BitSet FOLLOW_147_in_stmtCase4917 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_INT_LIT_in_stmtCase4920 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_132_in_stmtCase4923 = new BitSet(new long[]{0x4000000000002C00L,0x40000000224822E2L,0xF7A98E3702C78C00L,0x0000000000000001L});
    public static final BitSet FOLLOW_stmts_in_stmtCase4925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_152_in_stmtCase4940 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_132_in_stmtCase4942 = new BitSet(new long[]{0x4000000000002C00L,0x40000000224822E2L,0xF7A98E3702C78C00L,0x0000000000000001L});
    public static final BitSet FOLLOW_stmts_in_stmtCase4944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_153_in_stmtDoWhile4962 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_stmtBlock_in_stmtDoWhile4964 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_192_in_stmtDoWhile4966 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_126_in_stmtDoWhile4968 = new BitSet(new long[]{0x4000000000002C00L,0x40000000224022E2L,0x0401800100000C00L});
    public static final BitSet FOLLOW_expr_in_stmtDoWhile4970 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_127_in_stmtDoWhile4972 = new BitSet(new long[]{0x0000000000000000L,0x0000000008080000L});
    public static final BitSet FOLLOW_delim_in_stmtDoWhile4974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_165_in_stmtIf4999 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_stmtIfBlock_in_stmtIf5001 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_stmtsElif_in_stmtIf5003 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_stmtElse_in_stmtIf5005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_165_in_stmtIf5024 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_stmtIfBlock_in_stmtIf5026 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_stmtElse_in_stmtIf5028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_165_in_stmtIf5043 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_stmtIfBlock_in_stmtIf5045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_126_in_stmtIfBlock5063 = new BitSet(new long[]{0x4000000000002C00L,0x40000000224022E2L,0x0401800100000C00L});
    public static final BitSet FOLLOW_expr_in_stmtIfBlock5065 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_127_in_stmtIfBlock5067 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_stmtBlock_in_stmtIfBlock5069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtElif_in_stmtsElif5089 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_154_in_stmtElif5100 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_stmtIfBlock_in_stmtElif5102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_155_in_stmtElse5120 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_stmtBlock_in_stmtElse5122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_181_in_stmtProvided5140 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_126_in_stmtProvided5142 = new BitSet(new long[]{0x4000000000002C00L,0x40000000224022E2L,0x0401800100000C00L});
    public static final BitSet FOLLOW_expr_in_stmtProvided5144 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_127_in_stmtProvided5146 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_stmtBlock_in_stmtProvided5148 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_stmtElse_in_stmtProvided5151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_192_in_stmtWhile5178 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_126_in_stmtWhile5180 = new BitSet(new long[]{0x4000000000002C00L,0x40000000224022E2L,0x0401800100000C00L});
    public static final BitSet FOLLOW_expr_in_stmtWhile5182 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_127_in_stmtWhile5183 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_stmtBlock_in_stmtWhile5185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varAttr_in_varDeclaration5219 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L,0x71008E0000050000L});
    public static final BitSet FOLLOW_varDecl_in_varDeclaration5221 = new BitSet(new long[]{0x0000000000000000L,0x0000000008080000L});
    public static final BitSet FOLLOW_delim_in_varDeclaration5223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_150_in_varAttr5244 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x8000001000400000L});
    public static final BitSet FOLLOW_191_in_varAttr5253 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x8000001000400000L});
    public static final BitSet FOLLOW_164_in_varAttr5263 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x8000001000400000L});
    public static final BitSet FOLLOW_varDeclList_in_varDecl5307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varArray_in_varDecl5324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varFcnRef_in_varDecl5340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDeclList_in_varDecl5356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_175_in_varDecl5362 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L,0x71000E0000050000L});
    public static final BitSet FOLLOW_typeName_in_varDecl5364 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_varDecl5366 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_fcnArgumentList_in_varDecl5368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeName_in_varFcnRef5430 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_fcnRefTypeList_in_varFcnRef5432 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_varFcnRef5434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_126_in_fcnRefTypeList5466 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000002L,0x71000E0000050000L});
    public static final BitSet FOLLOW_fcnRefTypes_in_fcnRefTypeList5468 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_127_in_fcnRefTypeList5470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeName_in_fcnRefTypes5484 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_129_in_fcnRefTypes5487 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L,0x71000E0000050000L});
    public static final BitSet FOLLOW_typeName_in_fcnRefTypes5489 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_typeName_in_varArray5530 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_varArray5532 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_varArraySpec_in_varArray5534 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ASSIGN_in_varArray5537 = new BitSet(new long[]{0x4000000000002C00L,0x40000000224022E2L,0x0401800100000C00L,0x0000000000000002L});
    public static final BitSet FOLLOW_initializer_in_varArray5539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_139_in_varArraySpec5577 = new BitSet(new long[]{0x4000000000002C00L,0x40000000224022E2L,0x0401800100001C00L});
    public static final BitSet FOLLOW_varDim_in_varArraySpec5579 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_140_in_varArraySpec5581 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_expr_in_varDim5609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_initializer5629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_193_in_initializer5635 = new BitSet(new long[]{0x4000000000002C00L,0x40000000224022E2L,0x0401800100000C00L,0x0000000000000002L});
    public static final BitSet FOLLOW_initializer_list_in_initializer5637 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_129_in_initializer5639 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_196_in_initializer5642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_initializer_in_initializer_list5656 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_129_in_initializer_list5659 = new BitSet(new long[]{0x4000000000002C00L,0x40000000224022E2L,0x0401800100000C00L,0x0000000000000002L});
    public static final BitSet FOLLOW_initializer_in_initializer_list5661 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_typeName_in_varDeclList5693 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L,0x71000E0000050000L});
    public static final BitSet FOLLOW_varDeclList_in_varDeclList5698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varInit_in_varDeclList5703 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_129_in_varDeclList5706 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_varInit_in_varDeclList5709 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_varInit5727 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ASSIGN_in_varInit5730 = new BitSet(new long[]{0x4000000000002C00L,0x40000000224022E2L,0x0401800100000C00L});
    public static final BitSet FOLLOW_expr_in_varInit5732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_qualName5870 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_qualNameList_in_qualName5873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_130_in_qualNameList5913 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_qualNameList5928 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_139_in_arrayLit5968 = new BitSet(new long[]{0x4000000000000800L,0x0000000022400082L,0x0401000100001000L});
    public static final BitSet FOLLOW_arrayLitList_in_arrayLit5970 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_140_in_arrayLit5972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayLitElem_in_arrayLitList5994 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_129_in_arrayLitList5997 = new BitSet(new long[]{0x4000000000000800L,0x0000000022400082L,0x0401000100000000L});
    public static final BitSet FOLLOW_arrayLitElem_in_arrayLitList5999 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_primitiveLit_in_arrayLitElem6023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_namedConstant_in_arrayLitElem6027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qualName_in_namedConstant6037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_boolLit6049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_176_in_nullLit6067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_LIT_in_numLit6084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OCT_LIT_in_numLit6093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REAL_LIT_in_numLit6102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HEX_LIT_in_numLit6111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolLit_in_primitiveLit6136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numLit_in_primitiveLit6155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nullLit_in_primitiveLit6175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_primitiveLit6194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_in_primitiveLit6222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INJECT_in_stmtInjection6257 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_NL_in_stmtInjection6263 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_INJECT_in_injectionCode6292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMI_in_delim6323 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_NL_in_delim6327 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_NL_in_delim6338 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_NL_in_delim6360 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_stmtInjection_in_synpred2_pollen722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtExport_in_synpred6_pollen823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fcnDefinition_in_synpred9_pollen932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDeclaration_in_synpred11_pollen953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fcnDefinition_in_synpred15_pollen1055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDeclaration_in_synpred16_pollen1064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_delim_in_synpred20_pollen1206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_synpred21_pollen1199 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ASSIGN_in_synpred21_pollen1201 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_INT_LIT_in_synpred21_pollen1203 = new BitSet(new long[]{0x0000000000000000L,0x0000000008080000L});
    public static final BitSet FOLLOW_delim_in_synpred21_pollen1206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_delim_in_synpred22_pollen1234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fcnDefinitionHost_in_synpred30_pollen1413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDeclaration_in_synpred32_pollen1429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_importAs_in_synpred34_pollen1481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_193_in_synpred42_pollen1735 = new BitSet(new long[]{0x4000000000000800L,0x0000000022400082L,0x75010E0100050000L});
    public static final BitSet FOLLOW_metaArgument_in_synpred42_pollen1737 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_129_in_synpred42_pollen1741 = new BitSet(new long[]{0x4000000000000800L,0x0000000022400082L,0x75010E0100050000L});
    public static final BitSet FOLLOW_metaArgument_in_synpred42_pollen1743 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_196_in_synpred42_pollen1747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qualName_in_synpred45_pollen1842 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_metaArguments_in_synpred45_pollen1844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_174_in_synpred47_pollen1921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_148_in_synpred48_pollen1941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_180_in_synpred49_pollen1959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_149_in_synpred50_pollen1977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_156_in_synpred51_pollen1995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NL_in_synpred53_pollen2079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NL_in_synpred57_pollen2146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_129_in_synpred76_pollen2348 = new BitSet(new long[]{0x4000000000002C00L,0x40000000224022E2L,0x0401800100000C00L});
    public static final BitSet FOLLOW_expr_in_synpred76_pollen2350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_synpred77_pollen2345 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_129_in_synpred77_pollen2348 = new BitSet(new long[]{0x4000000000002C00L,0x40000000224022E2L,0x0401800100000C00L});
    public static final BitSet FOLLOW_expr_in_synpred77_pollen2350 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_exprLogicalOr_in_synpred78_pollen2385 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_137_in_synpred78_pollen2387 = new BitSet(new long[]{0x4000000000002C00L,0x40000000224022E2L,0x0401800100000C00L});
    public static final BitSet FOLLOW_expr_in_synpred78_pollen2389 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_132_in_synpred78_pollen2391 = new BitSet(new long[]{0x4000000000002C00L,0x40000000224022E2L,0x0401800100000C00L});
    public static final BitSet FOLLOW_expr_in_synpred78_pollen2393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_195_in_synpred79_pollen2448 = new BitSet(new long[]{0x4000000000002C00L,0x40000000224022E2L,0x0401800100000C00L});
    public static final BitSet FOLLOW_exprLogicalAnd_in_synpred79_pollen2450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_124_in_synpred80_pollen2501 = new BitSet(new long[]{0x4000000000002C00L,0x40000000224022E2L,0x0401800100000C00L});
    public static final BitSet FOLLOW_exprBitwiseOr_in_synpred80_pollen2503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_194_in_synpred81_pollen2552 = new BitSet(new long[]{0x4000000000002C00L,0x40000000224022E2L,0x0401800100000C00L});
    public static final BitSet FOLLOW_exprBitwiseXor_in_synpred81_pollen2554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_141_in_synpred82_pollen2602 = new BitSet(new long[]{0x4000000000002C00L,0x40000000224022E2L,0x0401800100000C00L});
    public static final BitSet FOLLOW_exprBitwiseAnd_in_synpred82_pollen2604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_125_in_synpred83_pollen2652 = new BitSet(new long[]{0x4000000000002C00L,0x40000000224022E2L,0x0401800100000C00L});
    public static final BitSet FOLLOW_exprEquality_in_synpred83_pollen2654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_equalityOp_in_synpred84_pollen2703 = new BitSet(new long[]{0x4000000000002C00L,0x40000000224022E2L,0x0401800100000C00L});
    public static final BitSet FOLLOW_exprRelational_in_synpred84_pollen2705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relationalOp_in_synpred85_pollen2754 = new BitSet(new long[]{0x4000000000002C00L,0x40000000224022E2L,0x0401800100000C00L});
    public static final BitSet FOLLOW_exprShift_in_synpred85_pollen2756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_shiftOp_in_synpred86_pollen2806 = new BitSet(new long[]{0x4000000000002C00L,0x40000000224022E2L,0x0401800100000C00L});
    public static final BitSet FOLLOW_exprAddSub_in_synpred86_pollen2809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_addSubOp_in_synpred87_pollen2858 = new BitSet(new long[]{0x4000000000002C00L,0x40000000224022E2L,0x0401800100000C00L});
    public static final BitSet FOLLOW_exprMultDiv_in_synpred87_pollen2860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multDivModOp_in_synpred88_pollen2915 = new BitSet(new long[]{0x4000000000002C00L,0x40000000224022E2L,0x0401800100000C00L});
    public static final BitSet FOLLOW_exprUnary_in_synpred88_pollen2917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varOrFcnOrArray_in_synpred96_pollen3115 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000020L});
    public static final BitSet FOLLOW_incDecOp_in_synpred96_pollen3117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varOrFcnOrArray_in_synpred97_pollen3138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeName_in_synpred107_pollen3452 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_qualName_in_synpred107_pollen3454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeName_in_synpred108_pollen3490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qualName_in_synpred109_pollen3526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_126_in_synpred111_pollen3567 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L,0x71000E0000050000L});
    public static final BitSet FOLLOW_typeName_in_synpred111_pollen3569 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_129_in_synpred111_pollen3572 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L,0x71000E0000050000L});
    public static final BitSet FOLLOW_typeName_in_synpred111_pollen3574 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_127_in_synpred111_pollen3578 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_qualName_in_synpred111_pollen3580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fieldOrArrayAccess_in_synpred116_pollen3799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fieldOrArrayAccess_in_synpred118_pollen3832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_138_in_synpred119_pollen3826 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_synpred119_pollen3828 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_fcnArgumentList_in_synpred119_pollen3830 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000804L});
    public static final BitSet FOLLOW_fieldOrArrayAccess_in_synpred119_pollen3832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fieldOrArrayAccess_in_synpred120_pollen3878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_138_in_synpred121_pollen3874 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_synpred121_pollen3876 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000804L});
    public static final BitSet FOLLOW_fieldOrArrayAccess_in_synpred121_pollen3878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_138_in_synpred122_pollen3917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fieldOrArrayAccess_in_synpred123_pollen3941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qualName_in_synpred124_pollen3937 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_fcnArgumentList_in_synpred124_pollen3939 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000804L});
    public static final BitSet FOLLOW_fieldOrArrayAccess_in_synpred124_pollen3941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fieldOrArrayAccess_in_synpred125_pollen3971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayAccess_in_synpred127_pollen3989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_130_in_synpred128_pollen4003 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_synpred128_pollen4005 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_fcnArgumentList_in_synpred128_pollen4007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exprList_in_synpred129_pollen4059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NL_in_synpred132_pollen4130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDeclaration_in_synpred133_pollen4147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtAssign_in_synpred134_pollen4154 = new BitSet(new long[]{0x0000000000000000L,0x0000000008080000L});
    public static final BitSet FOLLOW_delim_in_synpred134_pollen4156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtBind_in_synpred136_pollen4168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmtInjection_in_synpred148_pollen4233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varOrFcnOrArray_in_synpred149_pollen4250 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ASSIGN_in_synpred149_pollen4252 = new BitSet(new long[]{0x4000000000002C00L,0x40000000224022E2L,0x0401800100000C00L});
    public static final BitSet FOLLOW_expr_in_synpred149_pollen4254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_injectionCode_in_synpred150_pollen4284 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ASSIGN_in_synpred150_pollen4286 = new BitSet(new long[]{0x4000000000002C00L,0x40000000224022E2L,0x0401800100000C00L});
    public static final BitSet FOLLOW_expr_in_synpred150_pollen4288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varOrFcnOrArray_in_synpred151_pollen4319 = new BitSet(new long[]{0x0000000000008390L,0x0000000044030400L});
    public static final BitSet FOLLOW_assignOp_in_synpred151_pollen4321 = new BitSet(new long[]{0x4000000000002C00L,0x40000000224022E2L,0x0401800100000C00L});
    public static final BitSet FOLLOW_expr_in_synpred151_pollen4323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_183_in_synpred156_pollen4498 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_126_in_synpred156_pollen4501 = new BitSet(new long[]{0x4000000000002C00L,0x40000000224022E2L,0x0401800100000C00L});
    public static final BitSet FOLLOW_expr_in_synpred156_pollen4505 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_129_in_synpred156_pollen4508 = new BitSet(new long[]{0x4000000000002C00L,0x40000000224022E2L,0x0401800100000C00L});
    public static final BitSet FOLLOW_expr_in_synpred156_pollen4510 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_127_in_synpred156_pollen4516 = new BitSet(new long[]{0x0000000000000000L,0x0000000008080000L});
    public static final BitSet FOLLOW_delim_in_synpred156_pollen4519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeName_in_synpred159_pollen4728 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_synpred159_pollen4730 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ASSIGN_in_synpred159_pollen4732 = new BitSet(new long[]{0x4000000000002C00L,0x40000000224022E2L,0x0401800100000C00L});
    public static final BitSet FOLLOW_expr_in_synpred159_pollen4734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_165_in_synpred164_pollen4999 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_stmtIfBlock_in_synpred164_pollen5001 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_stmtsElif_in_synpred164_pollen5003 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_stmtElse_in_synpred164_pollen5005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_165_in_synpred165_pollen5024 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_stmtIfBlock_in_synpred165_pollen5026 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_stmtElse_in_synpred165_pollen5028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeName_in_synpred172_pollen5291 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_synpred172_pollen5293 = new BitSet(new long[]{0x0000000000000020L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_ASSIGN_in_synpred172_pollen5296 = new BitSet(new long[]{0x4000000000002C00L,0x40000000224022E2L,0x0401800100000C00L});
    public static final BitSet FOLLOW_expr_in_synpred172_pollen5298 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_129_in_synpred172_pollen5302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeName_in_synpred173_pollen5315 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_synpred173_pollen5317 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_139_in_synpred173_pollen5319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeName_in_synpred174_pollen5332 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_126_in_synpred174_pollen5334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeName_in_synpred175_pollen5349 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_varInit_in_synpred175_pollen5351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_139_in_synpred179_pollen5577 = new BitSet(new long[]{0x4000000000002C00L,0x40000000224022E2L,0x0401800100001C00L});
    public static final BitSet FOLLOW_varDim_in_synpred179_pollen5579 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_140_in_synpred179_pollen5581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_129_in_synpred183_pollen5659 = new BitSet(new long[]{0x4000000000002C00L,0x40000000224022E2L,0x0401800100000C00L,0x0000000000000002L});
    public static final BitSet FOLLOW_initializer_in_synpred183_pollen5661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeName_in_synpred184_pollen5693 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L,0x71000E0000050000L});
    public static final BitSet FOLLOW_varDeclList_in_synpred184_pollen5698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_129_in_synpred185_pollen5706 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_varInit_in_synpred185_pollen5709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qualNameList_in_synpred195_pollen5873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_130_in_synpred196_pollen5913 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_synpred196_pollen5928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NL_in_synpred208_pollen6263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NL_in_synpred209_pollen6327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NL_in_synpred211_pollen6338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NL_in_synpred212_pollen6338 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_NL_in_synpred214_pollen6350 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_196_in_synpred214_pollen6354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NL_in_synpred215_pollen6360 = new BitSet(new long[]{0x0000000000000002L});

}