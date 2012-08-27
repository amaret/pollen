// $ANTLR 3.1.3 Mar 17, 2009 19:23:44 pol.g 2012-08-23 21:50:53

    //package com.amaret.pollen.parser;
    import java.util.EnumSet;
    //import com.amaret.pollen.parser.Atom;
    

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class polLexer extends Lexer {
    public static final int S_IF=64;
    public static final int S_BREAK=56;
    public static final int T__159=159;
    public static final int T__158=158;
    public static final int D_FCN_TYP_NM=16;
    public static final int ADD_EQ=91;
    public static final int T__160=160;
    public static final int E_NUMLIT=38;
    public static final int S_IMPORT=65;
    public static final int T__167=167;
    public static final int T__168=168;
    public static final int EOF=-1;
    public static final int T__165=165;
    public static final int T__166=166;
    public static final int T__163=163;
    public static final int LSHFT_EQ=96;
    public static final int T__164=164;
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
    public static final int T__138=138;
    public static final int E=114;
    public static final int T__137=137;
    public static final int T__136=136;
    public static final int D_FCN_CTOR=12;
    public static final int O=113;
    public static final int LOG_NOT=101;
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
    public static final int QNAME=51;
    public static final int WS=115;
    public static final int T__129=129;
    public static final int S_BLOCK=55;
    public static final int SL_COMMENT=116;
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
    public static final int HOST=47;
    public static final int T__124=124;
    public static final int S_ASSIGN=53;
    public static final int T__123=123;
    public static final int D_COMPOSITION=8;
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
    public static final int ASSIGN=79;
    public static final int D_FORMAL=18;
    public static final int BIT_NOT=102;
    public static final int E_INDEX=36;
    public static final int D_MODULE=22;
    public static final int S_FOREACH=63;
    public static final int D_PROTOCOL=23;
    public static final int T__169=169;

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


    // delegates
    // delegators

    public polLexer() {;} 
    public polLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public polLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "pol.g"; }

    // $ANTLR start "T__121"
    public final void mT__121() throws RecognitionException {
        try {
            int _type = T__121;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // pol.g:38:8: ( 'package' )
            // pol.g:38:10: 'package'
            {
            match("package"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__121"

    // $ANTLR start "T__122"
    public final void mT__122() throws RecognitionException {
        try {
            int _type = T__122;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // pol.g:39:8: ( 'export' )
            // pol.g:39:10: 'export'
            {
            match("export"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__122"

    // $ANTLR start "T__123"
    public final void mT__123() throws RecognitionException {
        try {
            int _type = T__123;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // pol.g:40:8: ( 'class' )
            // pol.g:40:10: 'class'
            {
            match("class"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__123"

    // $ANTLR start "T__124"
    public final void mT__124() throws RecognitionException {
        try {
            int _type = T__124;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // pol.g:41:8: ( 'module' )
            // pol.g:41:10: 'module'
            {
            match("module"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__124"

    // $ANTLR start "T__125"
    public final void mT__125() throws RecognitionException {
        try {
            int _type = T__125;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // pol.g:42:8: ( 'enum' )
            // pol.g:42:10: 'enum'
            {
            match("enum"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__125"

    // $ANTLR start "T__126"
    public final void mT__126() throws RecognitionException {
        try {
            int _type = T__126;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // pol.g:43:8: ( ',' )
            // pol.g:43:10: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__126"

    // $ANTLR start "T__127"
    public final void mT__127() throws RecognitionException {
        try {
            int _type = T__127;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // pol.g:44:8: ( 'protocol' )
            // pol.g:44:10: 'protocol'
            {
            match("protocol"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__127"

    // $ANTLR start "T__128"
    public final void mT__128() throws RecognitionException {
        try {
            int _type = T__128;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // pol.g:45:8: ( 'composition' )
            // pol.g:45:10: 'composition'
            {
            match("composition"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__128"

    // $ANTLR start "T__129"
    public final void mT__129() throws RecognitionException {
        try {
            int _type = T__129;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // pol.g:46:8: ( 'import' )
            // pol.g:46:10: 'import'
            {
            match("import"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__129"

    // $ANTLR start "T__130"
    public final void mT__130() throws RecognitionException {
        try {
            int _type = T__130;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // pol.g:47:8: ( 'from' )
            // pol.g:47:10: 'from'
            {
            match("from"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__130"

    // $ANTLR start "T__131"
    public final void mT__131() throws RecognitionException {
        try {
            int _type = T__131;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // pol.g:48:8: ( 'as' )
            // pol.g:48:10: 'as'
            {
            match("as"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__131"

    // $ANTLR start "T__132"
    public final void mT__132() throws RecognitionException {
        try {
            int _type = T__132;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // pol.g:49:8: ( 'meta' )
            // pol.g:49:10: 'meta'
            {
            match("meta"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__132"

    // $ANTLR start "T__133"
    public final void mT__133() throws RecognitionException {
        try {
            int _type = T__133;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // pol.g:50:8: ( 'type' )
            // pol.g:50:10: 'type'
            {
            match("type"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__133"

    // $ANTLR start "T__134"
    public final void mT__134() throws RecognitionException {
        try {
            int _type = T__134;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // pol.g:51:8: ( '{' )
            // pol.g:51:10: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__134"

    // $ANTLR start "T__135"
    public final void mT__135() throws RecognitionException {
        try {
            int _type = T__135;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // pol.g:52:8: ( '}' )
            // pol.g:52:10: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__135"

    // $ANTLR start "T__136"
    public final void mT__136() throws RecognitionException {
        try {
            int _type = T__136;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // pol.g:53:8: ( 'extends' )
            // pol.g:53:10: 'extends'
            {
            match("extends"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__136"

    // $ANTLR start "T__137"
    public final void mT__137() throws RecognitionException {
        try {
            int _type = T__137;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // pol.g:54:8: ( 'implements' )
            // pol.g:54:10: 'implements'
            {
            match("implements"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__137"

    // $ANTLR start "T__138"
    public final void mT__138() throws RecognitionException {
        try {
            int _type = T__138;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // pol.g:55:8: ( '<' )
            // pol.g:55:10: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__138"

    // $ANTLR start "T__139"
    public final void mT__139() throws RecognitionException {
        try {
            int _type = T__139;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // pol.g:56:8: ( '>' )
            // pol.g:56:10: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__139"

    // $ANTLR start "T__140"
    public final void mT__140() throws RecognitionException {
        try {
            int _type = T__140;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // pol.g:57:8: ( '<<' )
            // pol.g:57:10: '<<'
            {
            match("<<"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__140"

    // $ANTLR start "T__141"
    public final void mT__141() throws RecognitionException {
        try {
            int _type = T__141;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // pol.g:58:8: ( '>>' )
            // pol.g:58:10: '>>'
            {
            match(">>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__141"

    // $ANTLR start "T__142"
    public final void mT__142() throws RecognitionException {
        try {
            int _type = T__142;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // pol.g:59:8: ( '*' )
            // pol.g:59:10: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__142"

    // $ANTLR start "T__143"
    public final void mT__143() throws RecognitionException {
        try {
            int _type = T__143;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // pol.g:60:8: ( '/' )
            // pol.g:60:10: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__143"

    // $ANTLR start "T__144"
    public final void mT__144() throws RecognitionException {
        try {
            int _type = T__144;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // pol.g:61:8: ( '%' )
            // pol.g:61:10: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__144"

    // $ANTLR start "T__145"
    public final void mT__145() throws RecognitionException {
        try {
            int _type = T__145;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // pol.g:62:8: ( '?' )
            // pol.g:62:10: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__145"

    // $ANTLR start "T__146"
    public final void mT__146() throws RecognitionException {
        try {
            int _type = T__146;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // pol.g:63:8: ( ':' )
            // pol.g:63:10: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__146"

    // $ANTLR start "T__147"
    public final void mT__147() throws RecognitionException {
        try {
            int _type = T__147;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // pol.g:64:8: ( '||' )
            // pol.g:64:10: '||'
            {
            match("||"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__147"

    // $ANTLR start "T__148"
    public final void mT__148() throws RecognitionException {
        try {
            int _type = T__148;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // pol.g:65:8: ( '&&' )
            // pol.g:65:10: '&&'
            {
            match("&&"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__148"

    // $ANTLR start "T__149"
    public final void mT__149() throws RecognitionException {
        try {
            int _type = T__149;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // pol.g:66:8: ( '|' )
            // pol.g:66:10: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__149"

    // $ANTLR start "T__150"
    public final void mT__150() throws RecognitionException {
        try {
            int _type = T__150;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // pol.g:67:8: ( '^' )
            // pol.g:67:10: '^'
            {
            match('^'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__150"

    // $ANTLR start "T__151"
    public final void mT__151() throws RecognitionException {
        try {
            int _type = T__151;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // pol.g:68:8: ( '&' )
            // pol.g:68:10: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__151"

    // $ANTLR start "T__152"
    public final void mT__152() throws RecognitionException {
        try {
            int _type = T__152;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // pol.g:69:8: ( 'new' )
            // pol.g:69:10: 'new'
            {
            match("new"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__152"

    // $ANTLR start "T__153"
    public final void mT__153() throws RecognitionException {
        try {
            int _type = T__153;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // pol.g:70:8: ( '(' )
            // pol.g:70:10: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__153"

    // $ANTLR start "T__154"
    public final void mT__154() throws RecognitionException {
        try {
            int _type = T__154;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // pol.g:71:8: ( ')' )
            // pol.g:71:10: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__154"

    // $ANTLR start "T__155"
    public final void mT__155() throws RecognitionException {
        try {
            int _type = T__155;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // pol.g:72:8: ( 'public' )
            // pol.g:72:10: 'public'
            {
            match("public"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__155"

    // $ANTLR start "T__156"
    public final void mT__156() throws RecognitionException {
        try {
            int _type = T__156;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // pol.g:73:8: ( 'host' )
            // pol.g:73:10: 'host'
            {
            match("host"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__156"

    // $ANTLR start "T__157"
    public final void mT__157() throws RecognitionException {
        try {
            int _type = T__157;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // pol.g:74:8: ( '@' )
            // pol.g:74:10: '@'
            {
            match('@'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__157"

    // $ANTLR start "T__158"
    public final void mT__158() throws RecognitionException {
        try {
            int _type = T__158;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // pol.g:75:8: ( '.' )
            // pol.g:75:10: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__158"

    // $ANTLR start "T__159"
    public final void mT__159() throws RecognitionException {
        try {
            int _type = T__159;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // pol.g:76:8: ( '[' )
            // pol.g:76:10: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__159"

    // $ANTLR start "T__160"
    public final void mT__160() throws RecognitionException {
        try {
            int _type = T__160;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // pol.g:77:8: ( ']' )
            // pol.g:77:10: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__160"

    // $ANTLR start "T__161"
    public final void mT__161() throws RecognitionException {
        try {
            int _type = T__161;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // pol.g:78:8: ( 'assert' )
            // pol.g:78:10: 'assert'
            {
            match("assert"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__161"

    // $ANTLR start "T__162"
    public final void mT__162() throws RecognitionException {
        try {
            int _type = T__162;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // pol.g:79:8: ( 'print' )
            // pol.g:79:10: 'print'
            {
            match("print"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__162"

    // $ANTLR start "T__163"
    public final void mT__163() throws RecognitionException {
        try {
            int _type = T__163;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // pol.g:80:8: ( 'log' )
            // pol.g:80:10: 'log'
            {
            match("log"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__163"

    // $ANTLR start "T__164"
    public final void mT__164() throws RecognitionException {
        try {
            int _type = T__164;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // pol.g:81:8: ( 'err' )
            // pol.g:81:10: 'err'
            {
            match("err"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__164"

    // $ANTLR start "T__165"
    public final void mT__165() throws RecognitionException {
        try {
            int _type = T__165;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // pol.g:82:8: ( 'out' )
            // pol.g:82:10: 'out'
            {
            match("out"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__165"

    // $ANTLR start "T__166"
    public final void mT__166() throws RecognitionException {
        try {
            int _type = T__166;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // pol.g:83:8: ( 'return' )
            // pol.g:83:10: 'return'
            {
            match("return"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__166"

    // $ANTLR start "T__167"
    public final void mT__167() throws RecognitionException {
        try {
            int _type = T__167;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // pol.g:84:8: ( 'break' )
            // pol.g:84:10: 'break'
            {
            match("break"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__167"

    // $ANTLR start "T__168"
    public final void mT__168() throws RecognitionException {
        try {
            int _type = T__168;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // pol.g:85:8: ( 'continue' )
            // pol.g:85:10: 'continue'
            {
            match("continue"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__168"

    // $ANTLR start "T__169"
    public final void mT__169() throws RecognitionException {
        try {
            int _type = T__169;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // pol.g:86:8: ( 'for' )
            // pol.g:86:10: 'for'
            {
            match("for"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__169"

    // $ANTLR start "T__170"
    public final void mT__170() throws RecognitionException {
        try {
            int _type = T__170;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // pol.g:87:8: ( 'foreach' )
            // pol.g:87:10: 'foreach'
            {
            match("foreach"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__170"

    // $ANTLR start "T__171"
    public final void mT__171() throws RecognitionException {
        try {
            int _type = T__171;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // pol.g:88:8: ( 'in' )
            // pol.g:88:10: 'in'
            {
            match("in"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__171"

    // $ANTLR start "T__172"
    public final void mT__172() throws RecognitionException {
        try {
            int _type = T__172;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // pol.g:89:8: ( 'switch' )
            // pol.g:89:10: 'switch'
            {
            match("switch"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__172"

    // $ANTLR start "T__173"
    public final void mT__173() throws RecognitionException {
        try {
            int _type = T__173;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // pol.g:90:8: ( 'default' )
            // pol.g:90:10: 'default'
            {
            match("default"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__173"

    // $ANTLR start "T__174"
    public final void mT__174() throws RecognitionException {
        try {
            int _type = T__174;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // pol.g:91:8: ( 'case' )
            // pol.g:91:10: 'case'
            {
            match("case"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__174"

    // $ANTLR start "T__175"
    public final void mT__175() throws RecognitionException {
        try {
            int _type = T__175;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // pol.g:92:8: ( 'do' )
            // pol.g:92:10: 'do'
            {
            match("do"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__175"

    // $ANTLR start "T__176"
    public final void mT__176() throws RecognitionException {
        try {
            int _type = T__176;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // pol.g:93:8: ( 'while' )
            // pol.g:93:10: 'while'
            {
            match("while"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__176"

    // $ANTLR start "T__177"
    public final void mT__177() throws RecognitionException {
        try {
            int _type = T__177;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // pol.g:94:8: ( 'if' )
            // pol.g:94:10: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__177"

    // $ANTLR start "T__178"
    public final void mT__178() throws RecognitionException {
        try {
            int _type = T__178;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // pol.g:95:8: ( 'elif' )
            // pol.g:95:10: 'elif'
            {
            match("elif"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__178"

    // $ANTLR start "T__179"
    public final void mT__179() throws RecognitionException {
        try {
            int _type = T__179;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // pol.g:96:8: ( 'else' )
            // pol.g:96:10: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__179"

    // $ANTLR start "T__180"
    public final void mT__180() throws RecognitionException {
        try {
            int _type = T__180;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // pol.g:97:8: ( 'provided' )
            // pol.g:97:10: 'provided'
            {
            match("provided"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__180"

    // $ANTLR start "T__181"
    public final void mT__181() throws RecognitionException {
        try {
            int _type = T__181;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // pol.g:98:8: ( 'const' )
            // pol.g:98:10: 'const'
            {
            match("const"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__181"

    // $ANTLR start "T__182"
    public final void mT__182() throws RecognitionException {
        try {
            int _type = T__182;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // pol.g:99:8: ( 'volatile' )
            // pol.g:99:10: 'volatile'
            {
            match("volatile"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__182"

    // $ANTLR start "T__183"
    public final void mT__183() throws RecognitionException {
        try {
            int _type = T__183;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // pol.g:100:8: ( 'bool' )
            // pol.g:100:10: 'bool'
            {
            match("bool"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__183"

    // $ANTLR start "T__184"
    public final void mT__184() throws RecognitionException {
        try {
            int _type = T__184;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // pol.g:101:8: ( 'byte' )
            // pol.g:101:10: 'byte'
            {
            match("byte"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__184"

    // $ANTLR start "T__185"
    public final void mT__185() throws RecognitionException {
        try {
            int _type = T__185;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // pol.g:102:8: ( 'int8' )
            // pol.g:102:10: 'int8'
            {
            match("int8"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__185"

    // $ANTLR start "T__186"
    public final void mT__186() throws RecognitionException {
        try {
            int _type = T__186;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // pol.g:103:8: ( 'int16' )
            // pol.g:103:10: 'int16'
            {
            match("int16"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__186"

    // $ANTLR start "T__187"
    public final void mT__187() throws RecognitionException {
        try {
            int _type = T__187;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // pol.g:104:8: ( 'int32' )
            // pol.g:104:10: 'int32'
            {
            match("int32"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__187"

    // $ANTLR start "T__188"
    public final void mT__188() throws RecognitionException {
        try {
            int _type = T__188;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // pol.g:105:8: ( 'string' )
            // pol.g:105:10: 'string'
            {
            match("string"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__188"

    // $ANTLR start "T__189"
    public final void mT__189() throws RecognitionException {
        try {
            int _type = T__189;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // pol.g:106:8: ( 'uint8' )
            // pol.g:106:10: 'uint8'
            {
            match("uint8"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__189"

    // $ANTLR start "T__190"
    public final void mT__190() throws RecognitionException {
        try {
            int _type = T__190;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // pol.g:107:8: ( 'uint16' )
            // pol.g:107:10: 'uint16'
            {
            match("uint16"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__190"

    // $ANTLR start "T__191"
    public final void mT__191() throws RecognitionException {
        try {
            int _type = T__191;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // pol.g:108:8: ( 'uint32' )
            // pol.g:108:10: 'uint32'
            {
            match("uint32"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__191"

    // $ANTLR start "T__192"
    public final void mT__192() throws RecognitionException {
        try {
            int _type = T__192;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // pol.g:109:8: ( 'true' )
            // pol.g:109:10: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__192"

    // $ANTLR start "T__193"
    public final void mT__193() throws RecognitionException {
        try {
            int _type = T__193;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // pol.g:110:8: ( 'false' )
            // pol.g:110:10: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__193"

    // $ANTLR start "T__194"
    public final void mT__194() throws RecognitionException {
        try {
            int _type = T__194;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // pol.g:111:8: ( 'null' )
            // pol.g:111:10: 'null'
            {
            match("null"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__194"

    // $ANTLR start "IDENT"
    public final void mIDENT() throws RecognitionException {
        try {
            int _type = IDENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // pol.g:919:5: ( I ( I | D )* )
            // pol.g:919:9: I ( I | D )*
            {
            mI(); 
            // pol.g:919:11: ( I | D )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='$'||(LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // pol.g:
            	    {
            	    if ( input.LA(1)=='$'||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IDENT"

    // $ANTLR start "HEX_LIT"
    public final void mHEX_LIT() throws RecognitionException {
        try {
            int _type = HEX_LIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // pol.g:922:2: ( ( '0x' | '0X' ) ( H )+ ( LU )? )
            // pol.g:922:4: ( '0x' | '0X' ) ( H )+ ( LU )?
            {
            // pol.g:922:4: ( '0x' | '0X' )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='0') ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1=='x') ) {
                    alt2=1;
                }
                else if ( (LA2_1=='X') ) {
                    alt2=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // pol.g:922:5: '0x'
                    {
                    match("0x"); 


                    }
                    break;
                case 2 :
                    // pol.g:922:12: '0X'
                    {
                    match("0X"); 


                    }
                    break;

            }

            // pol.g:922:18: ( H )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='F')||(LA3_0>='a' && LA3_0<='f')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // pol.g:922:19: H
            	    {
            	    mH(); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            // pol.g:922:23: ( LU )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='L'||LA4_0=='U'||LA4_0=='l'||LA4_0=='u') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // pol.g:922:24: LU
                    {
                    mLU(); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "HEX_LIT"

    // $ANTLR start "OCT_LIT"
    public final void mOCT_LIT() throws RecognitionException {
        try {
            int _type = OCT_LIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // pol.g:925:2: ( '0' ( O )+ )
            // pol.g:925:4: '0' ( O )+
            {
            match('0'); 
            // pol.g:925:8: ( O )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='7')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // pol.g:925:8: O
            	    {
            	    mO(); 

            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OCT_LIT"

    // $ANTLR start "REAL_LIT"
    public final void mREAL_LIT() throws RecognitionException {
        try {
            int _type = REAL_LIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // pol.g:928:2: ( ( MINUS )? ( D )+ E ( 'l' | 'L' )? | ( MINUS )? ( D )+ '.' ( D )* ( E )? ( 'l' | 'L' )? )
            int alt14=2;
            alt14 = dfa14.predict(input);
            switch (alt14) {
                case 1 :
                    // pol.g:928:4: ( MINUS )? ( D )+ E ( 'l' | 'L' )?
                    {
                    // pol.g:928:4: ( MINUS )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0=='-') ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // pol.g:928:5: MINUS
                            {
                            mMINUS(); 

                            }
                            break;

                    }

                    // pol.g:928:13: ( D )+
                    int cnt7=0;
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // pol.g:928:13: D
                    	    {
                    	    mD(); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt7 >= 1 ) break loop7;
                                EarlyExitException eee =
                                    new EarlyExitException(7, input);
                                throw eee;
                        }
                        cnt7++;
                    } while (true);

                    mE(); 
                    // pol.g:928:18: ( 'l' | 'L' )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0=='L'||LA8_0=='l') ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // pol.g:
                            {
                            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // pol.g:929:4: ( MINUS )? ( D )+ '.' ( D )* ( E )? ( 'l' | 'L' )?
                    {
                    // pol.g:929:4: ( MINUS )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='-') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // pol.g:929:5: MINUS
                            {
                            mMINUS(); 

                            }
                            break;

                    }

                    // pol.g:929:13: ( D )+
                    int cnt10=0;
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( ((LA10_0>='0' && LA10_0<='9')) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // pol.g:929:13: D
                    	    {
                    	    mD(); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt10 >= 1 ) break loop10;
                                EarlyExitException eee =
                                    new EarlyExitException(10, input);
                                throw eee;
                        }
                        cnt10++;
                    } while (true);

                    match('.'); 
                    // pol.g:929:20: ( D )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( ((LA11_0>='0' && LA11_0<='9')) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // pol.g:929:20: D
                    	    {
                    	    mD(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    // pol.g:929:23: ( E )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0=='E'||LA12_0=='e') ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // pol.g:929:24: E
                            {
                            mE(); 

                            }
                            break;

                    }

                    // pol.g:929:28: ( 'l' | 'L' )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0=='L'||LA13_0=='l') ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // pol.g:
                            {
                            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}


                            }
                            break;

                    }


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "REAL_LIT"

    // $ANTLR start "INT_LIT"
    public final void mINT_LIT() throws RecognitionException {
        try {
            int _type = INT_LIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // pol.g:932:2: ( ( MINUS )? ( D )+ ( LU )? )
            // pol.g:932:4: ( MINUS )? ( D )+ ( LU )?
            {
            // pol.g:932:4: ( MINUS )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='-') ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // pol.g:932:5: MINUS
                    {
                    mMINUS(); 

                    }
                    break;

            }

            // pol.g:932:13: ( D )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>='0' && LA16_0<='9')) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // pol.g:932:13: D
            	    {
            	    mD(); 

            	    }
            	    break;

            	default :
            	    if ( cnt16 >= 1 ) break loop16;
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
            } while (true);

            // pol.g:932:16: ( LU )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0=='L'||LA17_0=='U'||LA17_0=='l'||LA17_0=='u') ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // pol.g:932:17: LU
                    {
                    mLU(); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT_LIT"

    // $ANTLR start "CHAR"
    public final void mCHAR() throws RecognitionException {
        try {
            int _type = CHAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // pol.g:935:5: ( '\\'' ( ( '\\\\' ~ '\\n' ) | ~ ( '\\\\' | '\\'' | '\\n' ) )+ '\\'' )
            // pol.g:935:9: '\\'' ( ( '\\\\' ~ '\\n' ) | ~ ( '\\\\' | '\\'' | '\\n' ) )+ '\\''
            {
            match('\''); 
            // pol.g:935:14: ( ( '\\\\' ~ '\\n' ) | ~ ( '\\\\' | '\\'' | '\\n' ) )+
            int cnt18=0;
            loop18:
            do {
                int alt18=3;
                int LA18_0 = input.LA(1);

                if ( (LA18_0=='\\') ) {
                    alt18=1;
                }
                else if ( ((LA18_0>='\u0000' && LA18_0<='\t')||(LA18_0>='\u000B' && LA18_0<='&')||(LA18_0>='(' && LA18_0<='[')||(LA18_0>=']' && LA18_0<='\uFFFF')) ) {
                    alt18=2;
                }


                switch (alt18) {
            	case 1 :
            	    // pol.g:935:15: ( '\\\\' ~ '\\n' )
            	    {
            	    // pol.g:935:15: ( '\\\\' ~ '\\n' )
            	    // pol.g:935:16: '\\\\' ~ '\\n'
            	    {
            	    match('\\'); 
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }


            	    }
            	    break;
            	case 2 :
            	    // pol.g:935:30: ~ ( '\\\\' | '\\'' | '\\n' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt18 >= 1 ) break loop18;
                        EarlyExitException eee =
                            new EarlyExitException(18, input);
                        throw eee;
                }
                cnt18++;
            } while (true);

            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CHAR"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // pol.g:938:5: ( '\"' ( ( '\\\\' ~ '\\n' ) | ~ ( '\\\\' | '\"' | '\\n' ) )* '\"' )
            // pol.g:938:9: '\"' ( ( '\\\\' ~ '\\n' ) | ~ ( '\\\\' | '\"' | '\\n' ) )* '\"'
            {
            match('\"'); 
            // pol.g:938:13: ( ( '\\\\' ~ '\\n' ) | ~ ( '\\\\' | '\"' | '\\n' ) )*
            loop19:
            do {
                int alt19=3;
                int LA19_0 = input.LA(1);

                if ( (LA19_0=='\\') ) {
                    alt19=1;
                }
                else if ( ((LA19_0>='\u0000' && LA19_0<='\t')||(LA19_0>='\u000B' && LA19_0<='!')||(LA19_0>='#' && LA19_0<='[')||(LA19_0>=']' && LA19_0<='\uFFFF')) ) {
                    alt19=2;
                }


                switch (alt19) {
            	case 1 :
            	    // pol.g:938:14: ( '\\\\' ~ '\\n' )
            	    {
            	    // pol.g:938:14: ( '\\\\' ~ '\\n' )
            	    // pol.g:938:15: '\\\\' ~ '\\n'
            	    {
            	    match('\\'); 
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }


            	    }
            	    break;
            	case 2 :
            	    // pol.g:938:29: ~ ( '\\\\' | '\"' | '\\n' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STRING"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // pol.g:941:5: ( ( ' ' | '\\t' )* )
            // pol.g:941:9: ( ' ' | '\\t' )*
            {
            // pol.g:941:9: ( ' ' | '\\t' )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0=='\t'||LA20_0==' ') ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // pol.g:
            	    {
            	    if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             _channel=HIDDEN; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "SL_COMMENT"
    public final void mSL_COMMENT() throws RecognitionException {
        try {
            int _type = SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // pol.g:944:5: ( '#' (~ ( '\\n' | '\\r' ) )* | '/' '/' (~ ( '\\n' | '\\r' ) )* )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0=='#') ) {
                alt23=1;
            }
            else if ( (LA23_0=='/') ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // pol.g:944:7: '#' (~ ( '\\n' | '\\r' ) )*
                    {
                    match('#'); 
                    // pol.g:944:11: (~ ( '\\n' | '\\r' ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( ((LA21_0>='\u0000' && LA21_0<='\t')||(LA21_0>='\u000B' && LA21_0<='\f')||(LA21_0>='\u000E' && LA21_0<='\uFFFF')) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // pol.g:944:11: ~ ( '\\n' | '\\r' )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);

                     _channel=HIDDEN; 

                    }
                    break;
                case 2 :
                    // pol.g:945:7: '/' '/' (~ ( '\\n' | '\\r' ) )*
                    {
                    match('/'); 
                    match('/'); 
                    // pol.g:945:14: (~ ( '\\n' | '\\r' ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( ((LA22_0>='\u0000' && LA22_0<='\t')||(LA22_0>='\u000B' && LA22_0<='\f')||(LA22_0>='\u000E' && LA22_0<='\uFFFF')) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // pol.g:945:14: ~ ( '\\n' | '\\r' )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);

                     _channel=HIDDEN; 

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SL_COMMENT"

    // $ANTLR start "INJECT"
    public final void mINJECT() throws RecognitionException {
        try {
            int _type = INJECT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // pol.g:948:2: ( IJ_BEG ( options {greedy=false; } : . )* IJ_END )
            // pol.g:948:4: IJ_BEG ( options {greedy=false; } : . )* IJ_END
            {
            mIJ_BEG(); 
            // pol.g:948:11: ( options {greedy=false; } : . )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0=='}') ) {
                    int LA24_1 = input.LA(2);

                    if ( (LA24_1=='+') ) {
                        alt24=2;
                    }
                    else if ( ((LA24_1>='\u0000' && LA24_1<='*')||(LA24_1>=',' && LA24_1<='\uFFFF')) ) {
                        alt24=1;
                    }


                }
                else if ( ((LA24_0>='\u0000' && LA24_0<='|')||(LA24_0>='~' && LA24_0<='\uFFFF')) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // pol.g:948:39: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            mIJ_END(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INJECT"

    // $ANTLR start "ML_COMMENT"
    public final void mML_COMMENT() throws RecognitionException {
        try {
            int _type = ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // pol.g:952:5: ( '---' ( options {greedy=false; } : . )* '---' ( '\\n' | '\\r' )* )
            // pol.g:952:9: '---' ( options {greedy=false; } : . )* '---' ( '\\n' | '\\r' )*
            {
            match("---"); 

            // pol.g:952:15: ( options {greedy=false; } : . )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0=='-') ) {
                    int LA25_1 = input.LA(2);

                    if ( (LA25_1=='-') ) {
                        int LA25_3 = input.LA(3);

                        if ( (LA25_3=='-') ) {
                            alt25=2;
                        }
                        else if ( ((LA25_3>='\u0000' && LA25_3<=',')||(LA25_3>='.' && LA25_3<='\uFFFF')) ) {
                            alt25=1;
                        }


                    }
                    else if ( ((LA25_1>='\u0000' && LA25_1<=',')||(LA25_1>='.' && LA25_1<='\uFFFF')) ) {
                        alt25=1;
                    }


                }
                else if ( ((LA25_0>='\u0000' && LA25_0<=',')||(LA25_0>='.' && LA25_0<='\uFFFF')) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // pol.g:952:43: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            match("---"); 

            // pol.g:952:54: ( '\\n' | '\\r' )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0=='\n'||LA26_0=='\r') ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // pol.g:
            	    {
            	    if ( input.LA(1)=='\n'||input.LA(1)=='\r' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             _channel=HIDDEN; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ML_COMMENT"

    // $ANTLR start "SEMI"
    public final void mSEMI() throws RecognitionException {
        try {
            int _type = SEMI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // pol.g:955:5: ( ';' )
            // pol.g:955:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SEMI"

    // $ANTLR start "NL"
    public final void mNL() throws RecognitionException {
        try {
            int _type = NL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // pol.g:958:5: ( ( '\\r' )? ( '\\n' ) )
            // pol.g:958:9: ( '\\r' )? ( '\\n' )
            {
            // pol.g:958:9: ( '\\r' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0=='\r') ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // pol.g:958:10: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }

            // pol.g:958:17: ( '\\n' )
            // pol.g:958:18: '\\n'
            {
            match('\n'); 

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NL"

    // $ANTLR start "ILLEGAL_CHARACTER"
    public final void mILLEGAL_CHARACTER() throws RecognitionException {
        try {
            int _type = ILLEGAL_CHARACTER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // pol.g:961:5: ( '\\u0080' .. '\\uFFFF' )
            // pol.g:961:9: '\\u0080' .. '\\uFFFF'
            {
            matchRange('\u0080','\uFFFF'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ILLEGAL_CHARACTER"

    // $ANTLR start "I"
    public final void mI() throws RecognitionException {
        try {
            // pol.g:964:11: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '$' ) )
            // pol.g:964:19: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '$' )
            {
            if ( input.LA(1)=='$'||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "I"

    // $ANTLR start "D"
    public final void mD() throws RecognitionException {
        try {
            // pol.g:965:11: ( '0' .. '9' )
            // pol.g:965:20: '0' .. '9'
            {
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "D"

    // $ANTLR start "O"
    public final void mO() throws RecognitionException {
        try {
            // pol.g:966:11: ( '0' .. '7' )
            // pol.g:966:16: '0' .. '7'
            {
            matchRange('0','7'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "O"

    // $ANTLR start "H"
    public final void mH() throws RecognitionException {
        try {
            // pol.g:967:11: ( 'a' .. 'f' | 'A' .. 'F' | '0' .. '9' )
            // pol.g:
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "H"

    // $ANTLR start "E"
    public final void mE() throws RecognitionException {
        try {
            // pol.g:968:11: ( ( 'E' | 'e' ) ( PLUS | MINUS )? ( D )+ )
            // pol.g:968:20: ( 'E' | 'e' ) ( PLUS | MINUS )? ( D )+
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // pol.g:968:32: ( PLUS | MINUS )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0=='+'||LA28_0=='-') ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // pol.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }

            // pol.g:968:48: ( D )+
            int cnt29=0;
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( ((LA29_0>='0' && LA29_0<='9')) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // pol.g:968:49: D
            	    {
            	    mD(); 

            	    }
            	    break;

            	default :
            	    if ( cnt29 >= 1 ) break loop29;
                        EarlyExitException eee =
                            new EarlyExitException(29, input);
                        throw eee;
                }
                cnt29++;
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "E"

    // $ANTLR start "LU"
    public final void mLU() throws RecognitionException {
        try {
            // pol.g:969:12: ( 'LU' | 'Lu' | 'lU' | 'lu' | 'UL' | 'uL' | 'Ul' | 'ul' | 'l' | 'u' | 'L' | 'U' )
            int alt30=12;
            alt30 = dfa30.predict(input);
            switch (alt30) {
                case 1 :
                    // pol.g:969:20: 'LU'
                    {
                    match("LU"); 


                    }
                    break;
                case 2 :
                    // pol.g:969:27: 'Lu'
                    {
                    match("Lu"); 


                    }
                    break;
                case 3 :
                    // pol.g:969:34: 'lU'
                    {
                    match("lU"); 


                    }
                    break;
                case 4 :
                    // pol.g:969:41: 'lu'
                    {
                    match("lu"); 


                    }
                    break;
                case 5 :
                    // pol.g:969:48: 'UL'
                    {
                    match("UL"); 


                    }
                    break;
                case 6 :
                    // pol.g:969:55: 'uL'
                    {
                    match("uL"); 


                    }
                    break;
                case 7 :
                    // pol.g:969:62: 'Ul'
                    {
                    match("Ul"); 


                    }
                    break;
                case 8 :
                    // pol.g:969:69: 'ul'
                    {
                    match("ul"); 


                    }
                    break;
                case 9 :
                    // pol.g:969:76: 'l'
                    {
                    match('l'); 

                    }
                    break;
                case 10 :
                    // pol.g:969:82: 'u'
                    {
                    match('u'); 

                    }
                    break;
                case 11 :
                    // pol.g:969:88: 'L'
                    {
                    match('L'); 

                    }
                    break;
                case 12 :
                    // pol.g:969:94: 'U'
                    {
                    match('U'); 

                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end "LU"

    // $ANTLR start "IJ_BEG"
    public final void mIJ_BEG() throws RecognitionException {
        try {
            // pol.g:970:16: ( '+{' )
            // pol.g:970:19: '+{'
            {
            match("+{"); 


            }

        }
        finally {
        }
    }
    // $ANTLR end "IJ_BEG"

    // $ANTLR start "IJ_END"
    public final void mIJ_END() throws RecognitionException {
        try {
            // pol.g:971:16: ( '}+' )
            // pol.g:971:19: '}+'
            {
            match("}+"); 


            }

        }
        finally {
        }
    }
    // $ANTLR end "IJ_END"

    // $ANTLR start "INC"
    public final void mINC() throws RecognitionException {
        try {
            int _type = INC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // pol.g:974:6: ( '++' )
            // pol.g:974:8: '++'
            {
            match("++"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INC"

    // $ANTLR start "PLUS"
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // pol.g:975:7: ( '+' )
            // pol.g:975:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PLUS"

    // $ANTLR start "DEC"
    public final void mDEC() throws RecognitionException {
        try {
            int _type = DEC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // pol.g:976:6: ( '--' )
            // pol.g:976:8: '--'
            {
            match("--"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DEC"

    // $ANTLR start "MINUS"
    public final void mMINUS() throws RecognitionException {
        try {
            int _type = MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // pol.g:977:8: ( '-' )
            // pol.g:977:10: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MINUS"

    // $ANTLR start "ASSIGN"
    public final void mASSIGN() throws RecognitionException {
        try {
            int _type = ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // pol.g:978:8: ( '=' )
            // pol.g:978:10: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ASSIGN"

    // $ANTLR start "BIND"
    public final void mBIND() throws RecognitionException {
        try {
            int _type = BIND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // pol.g:979:8: ( ':=' )
            // pol.g:979:10: ':='
            {
            match(":="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BIND"

    // $ANTLR start "ADD_EQ"
    public final void mADD_EQ() throws RecognitionException {
        try {
            int _type = ADD_EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // pol.g:980:8: ( '+=' )
            // pol.g:980:10: '+='
            {
            match("+="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ADD_EQ"

    // $ANTLR start "SUB_EQ"
    public final void mSUB_EQ() throws RecognitionException {
        try {
            int _type = SUB_EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // pol.g:981:8: ( '-=' )
            // pol.g:981:10: '-='
            {
            match("-="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SUB_EQ"

    // $ANTLR start "MUL_EQ"
    public final void mMUL_EQ() throws RecognitionException {
        try {
            int _type = MUL_EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // pol.g:982:8: ( '*=' )
            // pol.g:982:10: '*='
            {
            match("*="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MUL_EQ"

    // $ANTLR start "DIV_EQ"
    public final void mDIV_EQ() throws RecognitionException {
        try {
            int _type = DIV_EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // pol.g:983:8: ( '\\\\=' )
            // pol.g:983:10: '\\\\='
            {
            match("\\="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DIV_EQ"

    // $ANTLR start "BITOR_EQ"
    public final void mBITOR_EQ() throws RecognitionException {
        try {
            int _type = BITOR_EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // pol.g:984:10: ( '|=' )
            // pol.g:984:12: '|='
            {
            match("|="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BITOR_EQ"

    // $ANTLR start "BITXOR_EQ"
    public final void mBITXOR_EQ() throws RecognitionException {
        try {
            int _type = BITXOR_EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // pol.g:985:10: ( '^=' )
            // pol.g:985:12: '^='
            {
            match("^="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BITXOR_EQ"

    // $ANTLR start "BITAND_EQ"
    public final void mBITAND_EQ() throws RecognitionException {
        try {
            int _type = BITAND_EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // pol.g:986:10: ( '&=' )
            // pol.g:986:12: '&='
            {
            match("&="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BITAND_EQ"

    // $ANTLR start "RSHFT_EQ"
    public final void mRSHFT_EQ() throws RecognitionException {
        try {
            int _type = RSHFT_EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // pol.g:987:10: ( '>>=' )
            // pol.g:987:12: '>>='
            {
            match(">>="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RSHFT_EQ"

    // $ANTLR start "LSHFT_EQ"
    public final void mLSHFT_EQ() throws RecognitionException {
        try {
            int _type = LSHFT_EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // pol.g:988:10: ( '<<=' )
            // pol.g:988:12: '<<='
            {
            match("<<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LSHFT_EQ"

    // $ANTLR start "MOD_EQ"
    public final void mMOD_EQ() throws RecognitionException {
        try {
            int _type = MOD_EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // pol.g:989:8: ( '%=' )
            // pol.g:989:10: '%='
            {
            match("%="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MOD_EQ"

    // $ANTLR start "EQ"
    public final void mEQ() throws RecognitionException {
        try {
            int _type = EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // pol.g:990:6: ( '==' )
            // pol.g:990:8: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EQ"

    // $ANTLR start "NOT_EQ"
    public final void mNOT_EQ() throws RecognitionException {
        try {
            int _type = NOT_EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // pol.g:991:8: ( '!=' )
            // pol.g:991:10: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NOT_EQ"

    // $ANTLR start "LT_EQ"
    public final void mLT_EQ() throws RecognitionException {
        try {
            int _type = LT_EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // pol.g:992:8: ( '<=' )
            // pol.g:992:10: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LT_EQ"

    // $ANTLR start "GT_EQ"
    public final void mGT_EQ() throws RecognitionException {
        try {
            int _type = GT_EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // pol.g:993:8: ( '>=' )
            // pol.g:993:10: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GT_EQ"

    // $ANTLR start "LOG_NOT"
    public final void mLOG_NOT() throws RecognitionException {
        try {
            int _type = LOG_NOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // pol.g:994:9: ( '!' )
            // pol.g:994:11: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LOG_NOT"

    // $ANTLR start "BIT_NOT"
    public final void mBIT_NOT() throws RecognitionException {
        try {
            int _type = BIT_NOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // pol.g:995:9: ( '~' )
            // pol.g:995:11: '~'
            {
            match('~'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BIT_NOT"

    public void mTokens() throws RecognitionException {
        // pol.g:1:8: ( T__121 | T__122 | T__123 | T__124 | T__125 | T__126 | T__127 | T__128 | T__129 | T__130 | T__131 | T__132 | T__133 | T__134 | T__135 | T__136 | T__137 | T__138 | T__139 | T__140 | T__141 | T__142 | T__143 | T__144 | T__145 | T__146 | T__147 | T__148 | T__149 | T__150 | T__151 | T__152 | T__153 | T__154 | T__155 | T__156 | T__157 | T__158 | T__159 | T__160 | T__161 | T__162 | T__163 | T__164 | T__165 | T__166 | T__167 | T__168 | T__169 | T__170 | T__171 | T__172 | T__173 | T__174 | T__175 | T__176 | T__177 | T__178 | T__179 | T__180 | T__181 | T__182 | T__183 | T__184 | T__185 | T__186 | T__187 | T__188 | T__189 | T__190 | T__191 | T__192 | T__193 | T__194 | IDENT | HEX_LIT | OCT_LIT | REAL_LIT | INT_LIT | CHAR | STRING | WS | SL_COMMENT | INJECT | ML_COMMENT | SEMI | NL | ILLEGAL_CHARACTER | INC | PLUS | DEC | MINUS | ASSIGN | BIND | ADD_EQ | SUB_EQ | MUL_EQ | DIV_EQ | BITOR_EQ | BITXOR_EQ | BITAND_EQ | RSHFT_EQ | LSHFT_EQ | MOD_EQ | EQ | NOT_EQ | LT_EQ | GT_EQ | LOG_NOT | BIT_NOT )
        int alt31=110;
        alt31 = dfa31.predict(input);
        switch (alt31) {
            case 1 :
                // pol.g:1:10: T__121
                {
                mT__121(); 

                }
                break;
            case 2 :
                // pol.g:1:17: T__122
                {
                mT__122(); 

                }
                break;
            case 3 :
                // pol.g:1:24: T__123
                {
                mT__123(); 

                }
                break;
            case 4 :
                // pol.g:1:31: T__124
                {
                mT__124(); 

                }
                break;
            case 5 :
                // pol.g:1:38: T__125
                {
                mT__125(); 

                }
                break;
            case 6 :
                // pol.g:1:45: T__126
                {
                mT__126(); 

                }
                break;
            case 7 :
                // pol.g:1:52: T__127
                {
                mT__127(); 

                }
                break;
            case 8 :
                // pol.g:1:59: T__128
                {
                mT__128(); 

                }
                break;
            case 9 :
                // pol.g:1:66: T__129
                {
                mT__129(); 

                }
                break;
            case 10 :
                // pol.g:1:73: T__130
                {
                mT__130(); 

                }
                break;
            case 11 :
                // pol.g:1:80: T__131
                {
                mT__131(); 

                }
                break;
            case 12 :
                // pol.g:1:87: T__132
                {
                mT__132(); 

                }
                break;
            case 13 :
                // pol.g:1:94: T__133
                {
                mT__133(); 

                }
                break;
            case 14 :
                // pol.g:1:101: T__134
                {
                mT__134(); 

                }
                break;
            case 15 :
                // pol.g:1:108: T__135
                {
                mT__135(); 

                }
                break;
            case 16 :
                // pol.g:1:115: T__136
                {
                mT__136(); 

                }
                break;
            case 17 :
                // pol.g:1:122: T__137
                {
                mT__137(); 

                }
                break;
            case 18 :
                // pol.g:1:129: T__138
                {
                mT__138(); 

                }
                break;
            case 19 :
                // pol.g:1:136: T__139
                {
                mT__139(); 

                }
                break;
            case 20 :
                // pol.g:1:143: T__140
                {
                mT__140(); 

                }
                break;
            case 21 :
                // pol.g:1:150: T__141
                {
                mT__141(); 

                }
                break;
            case 22 :
                // pol.g:1:157: T__142
                {
                mT__142(); 

                }
                break;
            case 23 :
                // pol.g:1:164: T__143
                {
                mT__143(); 

                }
                break;
            case 24 :
                // pol.g:1:171: T__144
                {
                mT__144(); 

                }
                break;
            case 25 :
                // pol.g:1:178: T__145
                {
                mT__145(); 

                }
                break;
            case 26 :
                // pol.g:1:185: T__146
                {
                mT__146(); 

                }
                break;
            case 27 :
                // pol.g:1:192: T__147
                {
                mT__147(); 

                }
                break;
            case 28 :
                // pol.g:1:199: T__148
                {
                mT__148(); 

                }
                break;
            case 29 :
                // pol.g:1:206: T__149
                {
                mT__149(); 

                }
                break;
            case 30 :
                // pol.g:1:213: T__150
                {
                mT__150(); 

                }
                break;
            case 31 :
                // pol.g:1:220: T__151
                {
                mT__151(); 

                }
                break;
            case 32 :
                // pol.g:1:227: T__152
                {
                mT__152(); 

                }
                break;
            case 33 :
                // pol.g:1:234: T__153
                {
                mT__153(); 

                }
                break;
            case 34 :
                // pol.g:1:241: T__154
                {
                mT__154(); 

                }
                break;
            case 35 :
                // pol.g:1:248: T__155
                {
                mT__155(); 

                }
                break;
            case 36 :
                // pol.g:1:255: T__156
                {
                mT__156(); 

                }
                break;
            case 37 :
                // pol.g:1:262: T__157
                {
                mT__157(); 

                }
                break;
            case 38 :
                // pol.g:1:269: T__158
                {
                mT__158(); 

                }
                break;
            case 39 :
                // pol.g:1:276: T__159
                {
                mT__159(); 

                }
                break;
            case 40 :
                // pol.g:1:283: T__160
                {
                mT__160(); 

                }
                break;
            case 41 :
                // pol.g:1:290: T__161
                {
                mT__161(); 

                }
                break;
            case 42 :
                // pol.g:1:297: T__162
                {
                mT__162(); 

                }
                break;
            case 43 :
                // pol.g:1:304: T__163
                {
                mT__163(); 

                }
                break;
            case 44 :
                // pol.g:1:311: T__164
                {
                mT__164(); 

                }
                break;
            case 45 :
                // pol.g:1:318: T__165
                {
                mT__165(); 

                }
                break;
            case 46 :
                // pol.g:1:325: T__166
                {
                mT__166(); 

                }
                break;
            case 47 :
                // pol.g:1:332: T__167
                {
                mT__167(); 

                }
                break;
            case 48 :
                // pol.g:1:339: T__168
                {
                mT__168(); 

                }
                break;
            case 49 :
                // pol.g:1:346: T__169
                {
                mT__169(); 

                }
                break;
            case 50 :
                // pol.g:1:353: T__170
                {
                mT__170(); 

                }
                break;
            case 51 :
                // pol.g:1:360: T__171
                {
                mT__171(); 

                }
                break;
            case 52 :
                // pol.g:1:367: T__172
                {
                mT__172(); 

                }
                break;
            case 53 :
                // pol.g:1:374: T__173
                {
                mT__173(); 

                }
                break;
            case 54 :
                // pol.g:1:381: T__174
                {
                mT__174(); 

                }
                break;
            case 55 :
                // pol.g:1:388: T__175
                {
                mT__175(); 

                }
                break;
            case 56 :
                // pol.g:1:395: T__176
                {
                mT__176(); 

                }
                break;
            case 57 :
                // pol.g:1:402: T__177
                {
                mT__177(); 

                }
                break;
            case 58 :
                // pol.g:1:409: T__178
                {
                mT__178(); 

                }
                break;
            case 59 :
                // pol.g:1:416: T__179
                {
                mT__179(); 

                }
                break;
            case 60 :
                // pol.g:1:423: T__180
                {
                mT__180(); 

                }
                break;
            case 61 :
                // pol.g:1:430: T__181
                {
                mT__181(); 

                }
                break;
            case 62 :
                // pol.g:1:437: T__182
                {
                mT__182(); 

                }
                break;
            case 63 :
                // pol.g:1:444: T__183
                {
                mT__183(); 

                }
                break;
            case 64 :
                // pol.g:1:451: T__184
                {
                mT__184(); 

                }
                break;
            case 65 :
                // pol.g:1:458: T__185
                {
                mT__185(); 

                }
                break;
            case 66 :
                // pol.g:1:465: T__186
                {
                mT__186(); 

                }
                break;
            case 67 :
                // pol.g:1:472: T__187
                {
                mT__187(); 

                }
                break;
            case 68 :
                // pol.g:1:479: T__188
                {
                mT__188(); 

                }
                break;
            case 69 :
                // pol.g:1:486: T__189
                {
                mT__189(); 

                }
                break;
            case 70 :
                // pol.g:1:493: T__190
                {
                mT__190(); 

                }
                break;
            case 71 :
                // pol.g:1:500: T__191
                {
                mT__191(); 

                }
                break;
            case 72 :
                // pol.g:1:507: T__192
                {
                mT__192(); 

                }
                break;
            case 73 :
                // pol.g:1:514: T__193
                {
                mT__193(); 

                }
                break;
            case 74 :
                // pol.g:1:521: T__194
                {
                mT__194(); 

                }
                break;
            case 75 :
                // pol.g:1:528: IDENT
                {
                mIDENT(); 

                }
                break;
            case 76 :
                // pol.g:1:534: HEX_LIT
                {
                mHEX_LIT(); 

                }
                break;
            case 77 :
                // pol.g:1:542: OCT_LIT
                {
                mOCT_LIT(); 

                }
                break;
            case 78 :
                // pol.g:1:550: REAL_LIT
                {
                mREAL_LIT(); 

                }
                break;
            case 79 :
                // pol.g:1:559: INT_LIT
                {
                mINT_LIT(); 

                }
                break;
            case 80 :
                // pol.g:1:567: CHAR
                {
                mCHAR(); 

                }
                break;
            case 81 :
                // pol.g:1:572: STRING
                {
                mSTRING(); 

                }
                break;
            case 82 :
                // pol.g:1:579: WS
                {
                mWS(); 

                }
                break;
            case 83 :
                // pol.g:1:582: SL_COMMENT
                {
                mSL_COMMENT(); 

                }
                break;
            case 84 :
                // pol.g:1:593: INJECT
                {
                mINJECT(); 

                }
                break;
            case 85 :
                // pol.g:1:600: ML_COMMENT
                {
                mML_COMMENT(); 

                }
                break;
            case 86 :
                // pol.g:1:611: SEMI
                {
                mSEMI(); 

                }
                break;
            case 87 :
                // pol.g:1:616: NL
                {
                mNL(); 

                }
                break;
            case 88 :
                // pol.g:1:619: ILLEGAL_CHARACTER
                {
                mILLEGAL_CHARACTER(); 

                }
                break;
            case 89 :
                // pol.g:1:637: INC
                {
                mINC(); 

                }
                break;
            case 90 :
                // pol.g:1:641: PLUS
                {
                mPLUS(); 

                }
                break;
            case 91 :
                // pol.g:1:646: DEC
                {
                mDEC(); 

                }
                break;
            case 92 :
                // pol.g:1:650: MINUS
                {
                mMINUS(); 

                }
                break;
            case 93 :
                // pol.g:1:656: ASSIGN
                {
                mASSIGN(); 

                }
                break;
            case 94 :
                // pol.g:1:663: BIND
                {
                mBIND(); 

                }
                break;
            case 95 :
                // pol.g:1:668: ADD_EQ
                {
                mADD_EQ(); 

                }
                break;
            case 96 :
                // pol.g:1:675: SUB_EQ
                {
                mSUB_EQ(); 

                }
                break;
            case 97 :
                // pol.g:1:682: MUL_EQ
                {
                mMUL_EQ(); 

                }
                break;
            case 98 :
                // pol.g:1:689: DIV_EQ
                {
                mDIV_EQ(); 

                }
                break;
            case 99 :
                // pol.g:1:696: BITOR_EQ
                {
                mBITOR_EQ(); 

                }
                break;
            case 100 :
                // pol.g:1:705: BITXOR_EQ
                {
                mBITXOR_EQ(); 

                }
                break;
            case 101 :
                // pol.g:1:715: BITAND_EQ
                {
                mBITAND_EQ(); 

                }
                break;
            case 102 :
                // pol.g:1:725: RSHFT_EQ
                {
                mRSHFT_EQ(); 

                }
                break;
            case 103 :
                // pol.g:1:734: LSHFT_EQ
                {
                mLSHFT_EQ(); 

                }
                break;
            case 104 :
                // pol.g:1:743: MOD_EQ
                {
                mMOD_EQ(); 

                }
                break;
            case 105 :
                // pol.g:1:750: EQ
                {
                mEQ(); 

                }
                break;
            case 106 :
                // pol.g:1:753: NOT_EQ
                {
                mNOT_EQ(); 

                }
                break;
            case 107 :
                // pol.g:1:760: LT_EQ
                {
                mLT_EQ(); 

                }
                break;
            case 108 :
                // pol.g:1:766: GT_EQ
                {
                mGT_EQ(); 

                }
                break;
            case 109 :
                // pol.g:1:772: LOG_NOT
                {
                mLOG_NOT(); 

                }
                break;
            case 110 :
                // pol.g:1:780: BIT_NOT
                {
                mBIT_NOT(); 

                }
                break;

        }

    }


    protected DFA14 dfa14 = new DFA14(this);
    protected DFA30 dfa30 = new DFA30(this);
    protected DFA31 dfa31 = new DFA31(this);
    static final String DFA14_eotS =
        "\5\uffff";
    static final String DFA14_eofS =
        "\5\uffff";
    static final String DFA14_minS =
        "\1\55\1\60\1\56\2\uffff";
    static final String DFA14_maxS =
        "\2\71\1\145\2\uffff";
    static final String DFA14_acceptS =
        "\3\uffff\1\1\1\2";
    static final String DFA14_specialS =
        "\5\uffff}>";
    static final String[] DFA14_transitionS = {
            "\1\1\2\uffff\12\2",
            "\12\2",
            "\1\4\1\uffff\12\2\13\uffff\1\3\37\uffff\1\3",
            "",
            ""
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "927:1: REAL_LIT : ( ( MINUS )? ( D )+ E ( 'l' | 'L' )? | ( MINUS )? ( D )+ '.' ( D )* ( E )? ( 'l' | 'L' )? );";
        }
    }
    static final String DFA30_eotS =
        "\1\uffff\1\7\1\12\1\15\1\20\14\uffff";
    static final String DFA30_eofS =
        "\21\uffff";
    static final String DFA30_minS =
        "\1\114\2\125\2\114\14\uffff";
    static final String DFA30_maxS =
        "\3\165\2\154\14\uffff";
    static final String DFA30_acceptS =
        "\5\uffff\1\1\1\2\1\13\1\3\1\4\1\11\1\5\1\7\1\14\1\6\1\10\1\12";
    static final String DFA30_specialS =
        "\21\uffff}>";
    static final String[] DFA30_transitionS = {
            "\1\1\10\uffff\1\3\26\uffff\1\2\10\uffff\1\4",
            "\1\5\37\uffff\1\6",
            "\1\10\37\uffff\1\11",
            "\1\13\37\uffff\1\14",
            "\1\16\37\uffff\1\17",
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

    static final short[] DFA30_eot = DFA.unpackEncodedString(DFA30_eotS);
    static final short[] DFA30_eof = DFA.unpackEncodedString(DFA30_eofS);
    static final char[] DFA30_min = DFA.unpackEncodedStringToUnsignedChars(DFA30_minS);
    static final char[] DFA30_max = DFA.unpackEncodedStringToUnsignedChars(DFA30_maxS);
    static final short[] DFA30_accept = DFA.unpackEncodedString(DFA30_acceptS);
    static final short[] DFA30_special = DFA.unpackEncodedString(DFA30_specialS);
    static final short[][] DFA30_transition;

    static {
        int numStates = DFA30_transitionS.length;
        DFA30_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA30_transition[i] = DFA.unpackEncodedString(DFA30_transitionS[i]);
        }
    }

    class DFA30 extends DFA {

        public DFA30(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 30;
            this.eot = DFA30_eot;
            this.eof = DFA30_eof;
            this.min = DFA30_min;
            this.max = DFA30_max;
            this.accept = DFA30_accept;
            this.special = DFA30_special;
            this.transition = DFA30_transition;
        }
        public String getDescription() {
            return "969:10: fragment LU : ( 'LU' | 'Lu' | 'lU' | 'lu' | 'UL' | 'uL' | 'Ul' | 'ul' | 'l' | 'u' | 'L' | 'U' );";
        }
    }
    static final String DFA31_eotS =
        "\1\55\4\47\1\uffff\4\47\2\uffff\1\116\1\121\1\123\1\124\1\126\1"+
        "\uffff\1\130\1\133\1\136\1\140\1\47\2\uffff\1\47\4\uffff\11\47\1"+
        "\uffff\1\162\1\167\1\162\4\uffff\1\173\3\uffff\1\175\1\uffff\1\177"+
        "\1\uffff\15\47\1\u0092\1\u0093\3\47\1\u0098\2\47\1\u009c\2\uffff"+
        "\1\u009e\21\uffff\14\47\1\u00ab\3\47\2\uffff\1\u00af\1\uffff\1\u00b1"+
        "\12\uffff\7\47\1\u00ba\12\47\2\uffff\1\47\1\u00cb\2\47\1\uffff\2"+
        "\47\4\uffff\1\u00d0\2\47\1\u00d3\1\u00d4\7\47\1\uffff\3\47\3\uffff"+
        "\7\47\1\u00e6\1\uffff\1\u00e7\1\u00e8\4\47\1\u00ed\1\47\1\u00ef"+
        "\2\47\1\u00f2\2\47\1\u00f5\1\47\1\uffff\2\47\1\u00f9\1\u00fa\1\uffff"+
        "\1\u00fb\1\u00fc\2\uffff\2\47\1\u00ff\1\u0100\11\47\1\u010c\3\47"+
        "\3\uffff\1\u0110\2\47\1\u0113\1\uffff\1\47\1\uffff\2\47\1\uffff"+
        "\1\u0117\1\u0118\1\uffff\1\47\1\u011a\1\47\4\uffff\1\47\1\u011d"+
        "\2\uffff\3\47\1\u0121\1\47\1\u0123\5\47\1\uffff\1\u0129\1\u012a"+
        "\1\47\1\uffff\2\47\1\uffff\1\u012e\1\u012f\1\47\2\uffff\1\47\1\uffff"+
        "\1\u0132\1\u0133\1\uffff\1\u0134\1\u0135\1\47\1\uffff\1\47\1\uffff"+
        "\1\u0138\1\u0139\1\u013a\2\47\2\uffff\1\u013d\2\47\2\uffff\1\47"+
        "\1\u0141\4\uffff\1\u0142\1\47\3\uffff\1\u0144\1\u0145\1\uffff\1"+
        "\47\1\u0147\1\47\2\uffff\1\u0149\2\uffff\1\47\1\uffff\1\47\1\uffff"+
        "\1\47\1\u014d\1\u014e\2\uffff";
    static final String DFA31_eofS =
        "\u014f\uffff";
    static final String DFA31_minS =
        "\1\12\1\141\1\154\1\141\1\145\1\uffff\1\146\1\141\1\163\1\162\2"+
        "\uffff\1\74\2\75\1\57\1\75\1\uffff\2\75\1\46\1\75\1\145\2\uffff"+
        "\1\157\4\uffff\1\157\1\165\1\145\1\157\1\164\1\145\1\150\1\157\1"+
        "\151\1\uffff\1\56\1\55\1\56\4\uffff\1\53\3\uffff\1\75\1\uffff\1"+
        "\75\1\uffff\1\143\1\151\1\142\1\160\1\165\1\162\1\151\1\141\1\155"+
        "\1\163\1\144\1\164\1\160\2\44\1\157\1\162\1\154\1\44\1\160\1\165"+
        "\1\75\2\uffff\1\75\21\uffff\1\167\1\154\1\163\1\147\2\164\1\145"+
        "\1\157\1\164\1\151\1\162\1\146\1\44\1\151\1\154\1\156\2\uffff\1"+
        "\56\1\uffff\1\55\12\uffff\1\153\1\164\1\156\1\154\1\157\1\145\1"+
        "\155\1\44\1\146\1\145\1\163\1\160\1\163\1\145\1\165\1\141\1\154"+
        "\1\61\2\uffff\1\155\1\44\1\163\1\145\1\uffff\2\145\4\uffff\1\44"+
        "\1\154\1\164\2\44\1\165\1\141\1\154\1\145\1\164\1\151\1\141\1\uffff"+
        "\1\154\1\141\1\164\3\uffff\1\141\1\157\1\151\1\164\1\151\1\162\1"+
        "\156\1\44\1\uffff\2\44\1\163\1\157\1\151\1\164\1\44\1\154\1\44\1"+
        "\162\1\145\1\44\1\66\1\62\1\44\1\141\1\uffff\1\145\1\162\2\44\1"+
        "\uffff\2\44\2\uffff\1\162\1\153\2\44\1\143\1\156\1\165\1\145\1\164"+
        "\1\61\1\147\1\143\1\144\1\44\1\143\1\164\1\144\3\uffff\1\44\1\163"+
        "\1\156\1\44\1\uffff\1\145\1\uffff\1\164\1\155\1\uffff\2\44\1\uffff"+
        "\1\143\1\44\1\164\4\uffff\1\156\1\44\2\uffff\1\150\1\147\1\154\1"+
        "\44\1\151\1\44\1\66\1\62\1\145\1\157\1\145\1\uffff\2\44\1\163\1"+
        "\uffff\1\151\1\165\1\uffff\2\44\1\145\2\uffff\1\150\1\uffff\2\44"+
        "\1\uffff\2\44\1\164\1\uffff\1\154\1\uffff\3\44\1\154\1\144\2\uffff"+
        "\1\44\1\164\1\145\2\uffff\1\156\1\44\4\uffff\1\44\1\145\3\uffff"+
        "\2\44\1\uffff\1\151\1\44\1\164\2\uffff\1\44\2\uffff\1\157\1\uffff"+
        "\1\163\1\uffff\1\156\2\44\2\uffff";
    static final String DFA31_maxS =
        "\1\uffff\1\165\1\170\2\157\1\uffff\1\156\1\162\1\163\1\171\2\uffff"+
        "\1\75\1\76\1\75\1\57\1\75\1\uffff\1\75\1\174\2\75\1\165\2\uffff"+
        "\1\157\4\uffff\1\157\1\165\1\145\1\171\1\167\1\157\1\150\1\157\1"+
        "\151\1\uffff\1\170\1\75\1\145\4\uffff\1\173\3\uffff\1\75\1\uffff"+
        "\1\75\1\uffff\1\143\1\157\1\142\1\164\1\165\1\162\1\163\1\141\1"+
        "\156\1\163\1\144\1\164\1\160\2\172\1\157\1\162\1\154\1\172\1\160"+
        "\1\165\1\75\2\uffff\1\75\21\uffff\1\167\1\154\1\163\1\147\2\164"+
        "\1\145\1\157\1\164\1\151\1\162\1\146\1\172\1\151\1\154\1\156\2\uffff"+
        "\1\165\1\uffff\1\55\12\uffff\1\153\1\166\1\156\1\154\1\157\1\145"+
        "\1\155\1\172\1\146\1\145\1\163\1\160\1\164\1\145\1\165\1\141\1\157"+
        "\1\70\2\uffff\1\155\1\172\1\163\1\145\1\uffff\2\145\4\uffff\1\172"+
        "\1\154\1\164\2\172\1\165\1\141\1\154\1\145\1\164\1\151\1\141\1\uffff"+
        "\1\154\1\141\1\164\3\uffff\1\141\1\157\1\151\1\164\1\151\1\162\1"+
        "\156\1\172\1\uffff\2\172\1\163\1\157\1\151\1\164\1\172\1\154\1\172"+
        "\1\162\1\145\1\172\1\66\1\62\1\172\1\141\1\uffff\1\145\1\162\2\172"+
        "\1\uffff\2\172\2\uffff\1\162\1\153\2\172\1\143\1\156\1\165\1\145"+
        "\1\164\1\70\1\147\1\143\1\144\1\172\1\143\1\164\1\144\3\uffff\1"+
        "\172\1\163\1\156\1\172\1\uffff\1\145\1\uffff\1\164\1\155\1\uffff"+
        "\2\172\1\uffff\1\143\1\172\1\164\4\uffff\1\156\1\172\2\uffff\1\150"+
        "\1\147\1\154\1\172\1\151\1\172\1\66\1\62\1\145\1\157\1\145\1\uffff"+
        "\2\172\1\163\1\uffff\1\151\1\165\1\uffff\2\172\1\145\2\uffff\1\150"+
        "\1\uffff\2\172\1\uffff\2\172\1\164\1\uffff\1\154\1\uffff\3\172\1"+
        "\154\1\144\2\uffff\1\172\1\164\1\145\2\uffff\1\156\1\172\4\uffff"+
        "\1\172\1\145\3\uffff\2\172\1\uffff\1\151\1\172\1\164\2\uffff\1\172"+
        "\2\uffff\1\157\1\uffff\1\163\1\uffff\1\156\2\172\2\uffff";
    static final String DFA31_acceptS =
        "\5\uffff\1\6\4\uffff\1\16\1\17\5\uffff\1\31\5\uffff\1\41\1\42\1"+
        "\uffff\1\45\1\46\1\47\1\50\11\uffff\1\113\3\uffff\1\120\1\121\1"+
        "\122\1\123\1\uffff\1\126\1\127\1\130\1\uffff\1\142\1\uffff\1\156"+
        "\26\uffff\1\153\1\22\1\uffff\1\154\1\23\1\141\1\26\1\27\1\150\1"+
        "\30\1\136\1\32\1\33\1\143\1\35\1\34\1\145\1\37\1\144\1\36\20\uffff"+
        "\1\114\1\117\1\uffff\1\116\1\uffff\1\140\1\134\1\124\1\131\1\137"+
        "\1\132\1\151\1\135\1\152\1\155\22\uffff\1\63\1\71\4\uffff\1\13\2"+
        "\uffff\1\147\1\24\1\146\1\25\14\uffff\1\67\3\uffff\1\115\1\125\1"+
        "\133\10\uffff\1\54\20\uffff\1\61\4\uffff\1\40\2\uffff\1\53\1\55"+
        "\21\uffff\1\5\1\72\1\73\4\uffff\1\66\1\uffff\1\14\2\uffff\1\101"+
        "\2\uffff\1\12\3\uffff\1\15\1\110\1\112\1\44\2\uffff\1\77\1\100\13"+
        "\uffff\1\52\3\uffff\1\3\2\uffff\1\75\3\uffff\1\102\1\103\1\uffff"+
        "\1\111\2\uffff\1\57\3\uffff\1\70\1\uffff\1\105\5\uffff\1\43\1\2"+
        "\3\uffff\1\4\1\11\2\uffff\1\51\1\56\1\64\1\104\2\uffff\1\106\1\107"+
        "\1\1\2\uffff\1\20\3\uffff\1\62\1\65\1\uffff\1\7\1\74\1\uffff\1\60"+
        "\1\uffff\1\76\3\uffff\1\21\1\10";
    static final String DFA31_specialS =
        "\u014f\uffff}>";
    static final String[] DFA31_transitionS = {
            "\1\61\2\uffff\1\61\23\uffff\1\65\1\54\1\56\1\47\1\20\1\24\1"+
            "\53\1\27\1\30\1\16\1\57\1\5\1\51\1\33\1\17\1\50\11\52\1\22\1"+
            "\60\1\14\1\63\1\15\1\21\1\32\32\47\1\34\1\64\1\35\1\25\1\47"+
            "\1\uffff\1\10\1\41\1\3\1\43\1\2\1\7\1\47\1\31\1\6\2\47\1\36"+
            "\1\4\1\26\1\37\1\1\1\47\1\40\1\42\1\11\1\46\1\45\1\44\3\47\1"+
            "\12\1\23\1\13\1\66\1\uffff\uff80\62",
            "\1\67\20\uffff\1\70\2\uffff\1\71",
            "\1\75\1\uffff\1\73\3\uffff\1\74\5\uffff\1\72",
            "\1\100\12\uffff\1\76\2\uffff\1\77",
            "\1\102\11\uffff\1\101",
            "",
            "\1\105\6\uffff\1\103\1\104",
            "\1\110\15\uffff\1\107\2\uffff\1\106",
            "\1\111",
            "\1\113\6\uffff\1\112",
            "",
            "",
            "\1\114\1\115",
            "\1\120\1\117",
            "\1\122",
            "\1\56",
            "\1\125",
            "",
            "\1\127",
            "\1\132\76\uffff\1\131",
            "\1\134\26\uffff\1\135",
            "\1\137",
            "\1\141\17\uffff\1\142",
            "",
            "",
            "\1\143",
            "",
            "",
            "",
            "",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\150\2\uffff\1\147\6\uffff\1\151",
            "\1\153\2\uffff\1\152",
            "\1\154\11\uffff\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "",
            "\1\164\1\uffff\10\163\2\52\13\uffff\1\164\22\uffff\1\161\14"+
            "\uffff\1\164\22\uffff\1\161",
            "\1\165\2\uffff\12\52\3\uffff\1\166",
            "\1\164\1\uffff\12\52\13\uffff\1\164\37\uffff\1\164",
            "",
            "",
            "",
            "",
            "\1\171\21\uffff\1\172\75\uffff\1\170",
            "",
            "",
            "",
            "\1\174",
            "",
            "\1\176",
            "",
            "\1\u0080",
            "\1\u0082\5\uffff\1\u0081",
            "\1\u0083",
            "\1\u0084\3\uffff\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088\11\uffff\1\u0089",
            "\1\u008a",
            "\1\u008b\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\47\13\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\23"+
            "\47\1\u0091\6\47",
            "\1\47\13\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\1\47\13\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\22"+
            "\47\1\u0097\7\47",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "",
            "",
            "\1\u009d",
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
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\1\47\13\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "",
            "",
            "\1\164\1\uffff\10\163\2\52\13\uffff\1\164\6\uffff\1\162\10"+
            "\uffff\1\162\17\uffff\1\164\6\uffff\1\162\10\uffff\1\162",
            "",
            "\1\u00b0",
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
            "\1\u00b2",
            "\1\u00b3\1\uffff\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "\1\47\13\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00c0\1\u00bf",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c5\2\uffff\1\u00c4",
            "\1\u00c7\1\uffff\1\u00c8\4\uffff\1\u00c6",
            "",
            "",
            "\1\u00c9",
            "\1\47\13\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\4\47"+
            "\1\u00ca\25\47",
            "\1\u00cc",
            "\1\u00cd",
            "",
            "\1\u00ce",
            "\1\u00cf",
            "",
            "",
            "",
            "",
            "\1\47\13\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "\1\u00d1",
            "\1\u00d2",
            "\1\47\13\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "\1\47\13\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "\1\u00d5",
            "\1\u00d6",
            "\1\u00d7",
            "\1\u00d8",
            "\1\u00d9",
            "\1\u00da",
            "\1\u00db",
            "",
            "\1\u00dc",
            "\1\u00dd",
            "\1\u00de",
            "",
            "",
            "",
            "\1\u00df",
            "\1\u00e0",
            "\1\u00e1",
            "\1\u00e2",
            "\1\u00e3",
            "\1\u00e4",
            "\1\u00e5",
            "\1\47\13\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "",
            "\1\47\13\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "\1\47\13\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "\1\u00e9",
            "\1\u00ea",
            "\1\u00eb",
            "\1\u00ec",
            "\1\47\13\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "\1\u00ee",
            "\1\47\13\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "\1\u00f0",
            "\1\u00f1",
            "\1\47\13\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "\1\u00f3",
            "\1\u00f4",
            "\1\47\13\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "\1\u00f6",
            "",
            "\1\u00f7",
            "\1\u00f8",
            "\1\47\13\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "\1\47\13\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "",
            "\1\47\13\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "\1\47\13\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "",
            "",
            "\1\u00fd",
            "\1\u00fe",
            "\1\47\13\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "\1\47\13\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "\1\u0101",
            "\1\u0102",
            "\1\u0103",
            "\1\u0104",
            "\1\u0105",
            "\1\u0107\1\uffff\1\u0108\4\uffff\1\u0106",
            "\1\u0109",
            "\1\u010a",
            "\1\u010b",
            "\1\47\13\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "\1\u010d",
            "\1\u010e",
            "\1\u010f",
            "",
            "",
            "",
            "\1\47\13\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "\1\u0111",
            "\1\u0112",
            "\1\47\13\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "",
            "\1\u0114",
            "",
            "\1\u0115",
            "\1\u0116",
            "",
            "\1\47\13\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "\1\47\13\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "",
            "\1\u0119",
            "\1\47\13\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "\1\u011b",
            "",
            "",
            "",
            "",
            "\1\u011c",
            "\1\47\13\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "",
            "",
            "\1\u011e",
            "\1\u011f",
            "\1\u0120",
            "\1\47\13\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "\1\u0122",
            "\1\47\13\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "\1\u0124",
            "\1\u0125",
            "\1\u0126",
            "\1\u0127",
            "\1\u0128",
            "",
            "\1\47\13\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "\1\47\13\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "\1\u012b",
            "",
            "\1\u012c",
            "\1\u012d",
            "",
            "\1\47\13\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "\1\47\13\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "\1\u0130",
            "",
            "",
            "\1\u0131",
            "",
            "\1\47\13\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "\1\47\13\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "",
            "\1\47\13\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "\1\47\13\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "\1\u0136",
            "",
            "\1\u0137",
            "",
            "\1\47\13\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "\1\47\13\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "\1\47\13\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "\1\u013b",
            "\1\u013c",
            "",
            "",
            "\1\47\13\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "\1\u013e",
            "\1\u013f",
            "",
            "",
            "\1\u0140",
            "\1\47\13\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "",
            "",
            "",
            "",
            "\1\47\13\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "\1\u0143",
            "",
            "",
            "",
            "\1\47\13\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "\1\47\13\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "",
            "\1\u0146",
            "\1\47\13\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "\1\u0148",
            "",
            "",
            "\1\47\13\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "",
            "",
            "\1\u014a",
            "",
            "\1\u014b",
            "",
            "\1\u014c",
            "\1\47\13\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "\1\47\13\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "",
            ""
    };

    static final short[] DFA31_eot = DFA.unpackEncodedString(DFA31_eotS);
    static final short[] DFA31_eof = DFA.unpackEncodedString(DFA31_eofS);
    static final char[] DFA31_min = DFA.unpackEncodedStringToUnsignedChars(DFA31_minS);
    static final char[] DFA31_max = DFA.unpackEncodedStringToUnsignedChars(DFA31_maxS);
    static final short[] DFA31_accept = DFA.unpackEncodedString(DFA31_acceptS);
    static final short[] DFA31_special = DFA.unpackEncodedString(DFA31_specialS);
    static final short[][] DFA31_transition;

    static {
        int numStates = DFA31_transitionS.length;
        DFA31_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA31_transition[i] = DFA.unpackEncodedString(DFA31_transitionS[i]);
        }
    }

    class DFA31 extends DFA {

        public DFA31(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 31;
            this.eot = DFA31_eot;
            this.eof = DFA31_eof;
            this.min = DFA31_min;
            this.max = DFA31_max;
            this.accept = DFA31_accept;
            this.special = DFA31_special;
            this.transition = DFA31_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__121 | T__122 | T__123 | T__124 | T__125 | T__126 | T__127 | T__128 | T__129 | T__130 | T__131 | T__132 | T__133 | T__134 | T__135 | T__136 | T__137 | T__138 | T__139 | T__140 | T__141 | T__142 | T__143 | T__144 | T__145 | T__146 | T__147 | T__148 | T__149 | T__150 | T__151 | T__152 | T__153 | T__154 | T__155 | T__156 | T__157 | T__158 | T__159 | T__160 | T__161 | T__162 | T__163 | T__164 | T__165 | T__166 | T__167 | T__168 | T__169 | T__170 | T__171 | T__172 | T__173 | T__174 | T__175 | T__176 | T__177 | T__178 | T__179 | T__180 | T__181 | T__182 | T__183 | T__184 | T__185 | T__186 | T__187 | T__188 | T__189 | T__190 | T__191 | T__192 | T__193 | T__194 | IDENT | HEX_LIT | OCT_LIT | REAL_LIT | INT_LIT | CHAR | STRING | WS | SL_COMMENT | INJECT | ML_COMMENT | SEMI | NL | ILLEGAL_CHARACTER | INC | PLUS | DEC | MINUS | ASSIGN | BIND | ADD_EQ | SUB_EQ | MUL_EQ | DIV_EQ | BITOR_EQ | BITXOR_EQ | BITAND_EQ | RSHFT_EQ | LSHFT_EQ | MOD_EQ | EQ | NOT_EQ | LT_EQ | GT_EQ | LOG_NOT | BIT_NOT );";
        }
    }
 

}