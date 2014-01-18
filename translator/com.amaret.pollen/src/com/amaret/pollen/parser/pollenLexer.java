// $ANTLR 3.4 /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g 2014-01-17 16:10:14

    package com.amaret.pollen.parser;
    import java.util.EnumSet;
    import com.amaret.pollen.parser.Atom;
    

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class pollenLexer extends Lexer {
    public static final int EOF=-1;
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
    public static final int D_ENUM=21;
    public static final int D_ENUMVAL=22;
    public static final int D_FCN_CTOR=23;
    public static final int D_FCN_DCL=24;
    public static final int D_FCN_DEF=25;
    public static final int D_FCN_REF=26;
    public static final int D_FCN_TYP_NM=27;
    public static final int D_FIELD=28;
    public static final int D_FORMAL=29;
    public static final int D_INJ=30;
    public static final int D_INSTANCE=31;
    public static final int D_META=32;
    public static final int D_MODULE=33;
    public static final int D_PROTOCOL=34;
    public static final int D_VAR=35;
    public static final int E=36;
    public static final int EQ=37;
    public static final int EXPORT=38;
    public static final int E_ADDR=39;
    public static final int E_BINARY=40;
    public static final int E_CALL=41;
    public static final int E_CONST=42;
    public static final int E_EXPR=43;
    public static final int E_HASH=44;
    public static final int E_IDENT=45;
    public static final int E_INDEX=46;
    public static final int E_INJ=47;
    public static final int E_NEW=48;
    public static final int E_NUMLIT=49;
    public static final int E_PAREN=50;
    public static final int E_QUEST=51;
    public static final int E_SELF=52;
    public static final int E_TYP=53;
    public static final int E_UNARY=54;
    public static final int E_VEC=55;
    public static final int FCNBODY=56;
    public static final int GT=57;
    public static final int GT_EQ=58;
    public static final int H=59;
    public static final int HEX_LIT=60;
    public static final int HOST=61;
    public static final int I=62;
    public static final int IDENT=63;
    public static final int IJ_BEG=64;
    public static final int IJ_END=65;
    public static final int ILLEGAL_CHARACTER=66;
    public static final int IMPORT=67;
    public static final int INC=68;
    public static final int INJECT=69;
    public static final int INT_LIT=70;
    public static final int LIST=71;
    public static final int LOG_NOT=72;
    public static final int LSHFT_EQ=73;
    public static final int LT=74;
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
    public static final int PEG=87;
    public static final int PLUS=88;
    public static final int QNAME=89;
    public static final int REAL_LIT=90;
    public static final int RSHFT_EQ=91;
    public static final int SEMI=92;
    public static final int SL_COMMENT=93;
    public static final int STRING=94;
    public static final int SUB_EQ=95;
    public static final int S_ASSIGN=96;
    public static final int S_BIND=97;
    public static final int S_BLOCK=98;
    public static final int S_BREAK=99;
    public static final int S_CASE=100;
    public static final int S_CONTINUE=101;
    public static final int S_DECL=102;
    public static final int S_ELIF=103;
    public static final int S_EXPR=104;
    public static final int S_FOR=105;
    public static final int S_FOREACH=106;
    public static final int S_IF=107;
    public static final int S_INJ=108;
    public static final int S_PACKAGE=109;
    public static final int S_PEG=110;
    public static final int S_PRINT=111;
    public static final int S_PROVIDED=112;
    public static final int S_RETURN=113;
    public static final int S_SWITCH=114;
    public static final int S_WHILE=115;
    public static final int THIS=116;
    public static final int T_ARR=117;
    public static final int T_LST=118;
    public static final int T_STD=119;
    public static final int T_USR=120;
    public static final int UNIT=121;
    public static final int VOID=122;
    public static final int WS=123;

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



    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public pollenLexer() {} 
    public pollenLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public pollenLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "/Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g"; }

    // $ANTLR start "THIS"
    public final void mTHIS() throws RecognitionException {
        try {
            int _type = THIS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:65:6: ( 'this' )
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:65:8: 'this'
            {
            match("this"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "THIS"

    // $ANTLR start "T__124"
    public final void mT__124() throws RecognitionException {
        try {
            int _type = T__124;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:66:8: ( '%' )
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:66:10: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__124"

    // $ANTLR start "T__125"
    public final void mT__125() throws RecognitionException {
        try {
            int _type = T__125;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:67:8: ( '&&' )
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:67:10: '&&'
            {
            match("&&"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__125"

    // $ANTLR start "T__126"
    public final void mT__126() throws RecognitionException {
        try {
            int _type = T__126;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:68:8: ( '&' )
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:68:10: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__126"

    // $ANTLR start "T__127"
    public final void mT__127() throws RecognitionException {
        try {
            int _type = T__127;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:69:8: ( '(' )
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:69:10: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__127"

    // $ANTLR start "T__128"
    public final void mT__128() throws RecognitionException {
        try {
            int _type = T__128;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:70:8: ( ')' )
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:70:10: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__128"

    // $ANTLR start "T__129"
    public final void mT__129() throws RecognitionException {
        try {
            int _type = T__129;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:71:8: ( '*' )
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:71:10: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__129"

    // $ANTLR start "T__130"
    public final void mT__130() throws RecognitionException {
        try {
            int _type = T__130;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:72:8: ( ',' )
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:72:10: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__130"

    // $ANTLR start "T__131"
    public final void mT__131() throws RecognitionException {
        try {
            int _type = T__131;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:73:8: ( '.' )
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:73:10: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__131"

    // $ANTLR start "T__132"
    public final void mT__132() throws RecognitionException {
        try {
            int _type = T__132;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:74:8: ( '/' )
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:74:10: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__132"

    // $ANTLR start "T__133"
    public final void mT__133() throws RecognitionException {
        try {
            int _type = T__133;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:75:8: ( ':' )
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:75:10: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__133"

    // $ANTLR start "T__134"
    public final void mT__134() throws RecognitionException {
        try {
            int _type = T__134;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:76:8: ( '<<' )
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:76:10: '<<'
            {
            match("<<"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__134"

    // $ANTLR start "T__135"
    public final void mT__135() throws RecognitionException {
        try {
            int _type = T__135;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:77:8: ( '>>' )
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:77:10: '>>'
            {
            match(">>"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__135"

    // $ANTLR start "T__136"
    public final void mT__136() throws RecognitionException {
        try {
            int _type = T__136;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:78:8: ( '?' )
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:78:10: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__136"

    // $ANTLR start "T__137"
    public final void mT__137() throws RecognitionException {
        try {
            int _type = T__137;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:79:8: ( '@' )
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:79:10: '@'
            {
            match('@'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__137"

    // $ANTLR start "T__138"
    public final void mT__138() throws RecognitionException {
        try {
            int _type = T__138;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:80:8: ( '[' )
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:80:10: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__138"

    // $ANTLR start "T__139"
    public final void mT__139() throws RecognitionException {
        try {
            int _type = T__139;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:81:8: ( ']' )
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:81:10: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__139"

    // $ANTLR start "T__140"
    public final void mT__140() throws RecognitionException {
        try {
            int _type = T__140;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:82:8: ( '^' )
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:82:10: '^'
            {
            match('^'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__140"

    // $ANTLR start "T__141"
    public final void mT__141() throws RecognitionException {
        try {
            int _type = T__141;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:83:8: ( 'as' )
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:83:10: 'as'
            {
            match("as"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__141"

    // $ANTLR start "T__142"
    public final void mT__142() throws RecognitionException {
        try {
            int _type = T__142;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:84:8: ( 'bool' )
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:84:10: 'bool'
            {
            match("bool"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__142"

    // $ANTLR start "T__143"
    public final void mT__143() throws RecognitionException {
        try {
            int _type = T__143;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:85:8: ( 'break' )
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:85:10: 'break'
            {
            match("break"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__143"

    // $ANTLR start "T__144"
    public final void mT__144() throws RecognitionException {
        try {
            int _type = T__144;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:86:8: ( 'byte' )
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:86:10: 'byte'
            {
            match("byte"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__144"

    // $ANTLR start "T__145"
    public final void mT__145() throws RecognitionException {
        try {
            int _type = T__145;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:87:8: ( 'case' )
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:87:10: 'case'
            {
            match("case"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__145"

    // $ANTLR start "T__146"
    public final void mT__146() throws RecognitionException {
        try {
            int _type = T__146;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:88:8: ( 'class' )
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:88:10: 'class'
            {
            match("class"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__146"

    // $ANTLR start "T__147"
    public final void mT__147() throws RecognitionException {
        try {
            int _type = T__147;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:89:8: ( 'composition' )
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:89:10: 'composition'
            {
            match("composition"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__147"

    // $ANTLR start "T__148"
    public final void mT__148() throws RecognitionException {
        try {
            int _type = T__148;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:90:8: ( 'const' )
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:90:10: 'const'
            {
            match("const"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__148"

    // $ANTLR start "T__149"
    public final void mT__149() throws RecognitionException {
        try {
            int _type = T__149;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:91:8: ( 'continue' )
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:91:10: 'continue'
            {
            match("continue"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__149"

    // $ANTLR start "T__150"
    public final void mT__150() throws RecognitionException {
        try {
            int _type = T__150;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:92:8: ( 'default' )
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:92:10: 'default'
            {
            match("default"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__150"

    // $ANTLR start "T__151"
    public final void mT__151() throws RecognitionException {
        try {
            int _type = T__151;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:93:8: ( 'do' )
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:93:10: 'do'
            {
            match("do"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__151"

    // $ANTLR start "T__152"
    public final void mT__152() throws RecognitionException {
        try {
            int _type = T__152;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:94:8: ( 'elif' )
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:94:10: 'elif'
            {
            match("elif"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__152"

    // $ANTLR start "T__153"
    public final void mT__153() throws RecognitionException {
        try {
            int _type = T__153;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:95:8: ( 'else' )
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:95:10: 'else'
            {
            match("else"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__153"

    // $ANTLR start "T__154"
    public final void mT__154() throws RecognitionException {
        try {
            int _type = T__154;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:96:8: ( 'enum' )
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:96:10: 'enum'
            {
            match("enum"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__154"

    // $ANTLR start "T__155"
    public final void mT__155() throws RecognitionException {
        try {
            int _type = T__155;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:97:8: ( 'err' )
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:97:10: 'err'
            {
            match("err"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__155"

    // $ANTLR start "T__156"
    public final void mT__156() throws RecognitionException {
        try {
            int _type = T__156;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:98:8: ( 'export' )
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:98:10: 'export'
            {
            match("export"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__156"

    // $ANTLR start "T__157"
    public final void mT__157() throws RecognitionException {
        try {
            int _type = T__157;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:99:8: ( 'extends' )
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:99:10: 'extends'
            {
            match("extends"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__157"

    // $ANTLR start "T__158"
    public final void mT__158() throws RecognitionException {
        try {
            int _type = T__158;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:100:8: ( 'false' )
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:100:10: 'false'
            {
            match("false"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__158"

    // $ANTLR start "T__159"
    public final void mT__159() throws RecognitionException {
        try {
            int _type = T__159;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:101:8: ( 'for' )
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:101:10: 'for'
            {
            match("for"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__159"

    // $ANTLR start "T__160"
    public final void mT__160() throws RecognitionException {
        try {
            int _type = T__160;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:102:8: ( 'from' )
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:102:10: 'from'
            {
            match("from"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__160"

    // $ANTLR start "T__161"
    public final void mT__161() throws RecognitionException {
        try {
            int _type = T__161;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:103:8: ( 'host' )
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:103:10: 'host'
            {
            match("host"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__161"

    // $ANTLR start "T__162"
    public final void mT__162() throws RecognitionException {
        try {
            int _type = T__162;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:104:8: ( 'if' )
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:104:10: 'if'
            {
            match("if"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__162"

    // $ANTLR start "T__163"
    public final void mT__163() throws RecognitionException {
        try {
            int _type = T__163;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:105:8: ( 'implements' )
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:105:10: 'implements'
            {
            match("implements"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__163"

    // $ANTLR start "T__164"
    public final void mT__164() throws RecognitionException {
        try {
            int _type = T__164;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:106:8: ( 'import' )
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:106:10: 'import'
            {
            match("import"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__164"

    // $ANTLR start "T__165"
    public final void mT__165() throws RecognitionException {
        try {
            int _type = T__165;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:107:8: ( 'int16' )
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:107:10: 'int16'
            {
            match("int16"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__165"

    // $ANTLR start "T__166"
    public final void mT__166() throws RecognitionException {
        try {
            int _type = T__166;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:108:8: ( 'int32' )
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:108:10: 'int32'
            {
            match("int32"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__166"

    // $ANTLR start "T__167"
    public final void mT__167() throws RecognitionException {
        try {
            int _type = T__167;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:109:8: ( 'int8' )
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:109:10: 'int8'
            {
            match("int8"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__167"

    // $ANTLR start "T__168"
    public final void mT__168() throws RecognitionException {
        try {
            int _type = T__168;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:110:8: ( 'log' )
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:110:10: 'log'
            {
            match("log"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__168"

    // $ANTLR start "T__169"
    public final void mT__169() throws RecognitionException {
        try {
            int _type = T__169;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:111:8: ( 'meta' )
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:111:10: 'meta'
            {
            match("meta"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__169"

    // $ANTLR start "T__170"
    public final void mT__170() throws RecognitionException {
        try {
            int _type = T__170;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:112:8: ( 'module' )
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:112:10: 'module'
            {
            match("module"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__170"

    // $ANTLR start "T__171"
    public final void mT__171() throws RecognitionException {
        try {
            int _type = T__171;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:113:8: ( 'new' )
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:113:10: 'new'
            {
            match("new"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__171"

    // $ANTLR start "T__172"
    public final void mT__172() throws RecognitionException {
        try {
            int _type = T__172;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:114:8: ( 'null' )
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:114:10: 'null'
            {
            match("null"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__172"

    // $ANTLR start "T__173"
    public final void mT__173() throws RecognitionException {
        try {
            int _type = T__173;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:115:8: ( 'out' )
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:115:10: 'out'
            {
            match("out"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__173"

    // $ANTLR start "T__174"
    public final void mT__174() throws RecognitionException {
        try {
            int _type = T__174;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:116:8: ( 'package' )
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:116:10: 'package'
            {
            match("package"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__174"

    // $ANTLR start "T__175"
    public final void mT__175() throws RecognitionException {
        try {
            int _type = T__175;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:117:8: ( 'preset' )
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:117:10: 'preset'
            {
            match("preset"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__175"

    // $ANTLR start "T__176"
    public final void mT__176() throws RecognitionException {
        try {
            int _type = T__176;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:118:8: ( 'print' )
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:118:10: 'print'
            {
            match("print"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__176"

    // $ANTLR start "T__177"
    public final void mT__177() throws RecognitionException {
        try {
            int _type = T__177;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:119:8: ( 'protocol' )
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:119:10: 'protocol'
            {
            match("protocol"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__177"

    // $ANTLR start "T__178"
    public final void mT__178() throws RecognitionException {
        try {
            int _type = T__178;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:120:8: ( 'provided' )
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:120:10: 'provided'
            {
            match("provided"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__178"

    // $ANTLR start "T__179"
    public final void mT__179() throws RecognitionException {
        try {
            int _type = T__179;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:121:8: ( 'public' )
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:121:10: 'public'
            {
            match("public"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__179"

    // $ANTLR start "T__180"
    public final void mT__180() throws RecognitionException {
        try {
            int _type = T__180;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:122:8: ( 'return' )
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:122:10: 'return'
            {
            match("return"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__180"

    // $ANTLR start "T__181"
    public final void mT__181() throws RecognitionException {
        try {
            int _type = T__181;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:123:8: ( 'string' )
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:123:10: 'string'
            {
            match("string"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__181"

    // $ANTLR start "T__182"
    public final void mT__182() throws RecognitionException {
        try {
            int _type = T__182;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:124:8: ( 'switch' )
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:124:10: 'switch'
            {
            match("switch"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__182"

    // $ANTLR start "T__183"
    public final void mT__183() throws RecognitionException {
        try {
            int _type = T__183;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:125:8: ( 'true' )
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:125:10: 'true'
            {
            match("true"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__183"

    // $ANTLR start "T__184"
    public final void mT__184() throws RecognitionException {
        try {
            int _type = T__184;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:126:8: ( 'type' )
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:126:10: 'type'
            {
            match("type"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__184"

    // $ANTLR start "T__185"
    public final void mT__185() throws RecognitionException {
        try {
            int _type = T__185;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:127:8: ( 'uint16' )
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:127:10: 'uint16'
            {
            match("uint16"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__185"

    // $ANTLR start "T__186"
    public final void mT__186() throws RecognitionException {
        try {
            int _type = T__186;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:128:8: ( 'uint32' )
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:128:10: 'uint32'
            {
            match("uint32"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__186"

    // $ANTLR start "T__187"
    public final void mT__187() throws RecognitionException {
        try {
            int _type = T__187;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:129:8: ( 'uint8' )
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:129:10: 'uint8'
            {
            match("uint8"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__187"

    // $ANTLR start "T__188"
    public final void mT__188() throws RecognitionException {
        try {
            int _type = T__188;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:130:8: ( 'volatile' )
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:130:10: 'volatile'
            {
            match("volatile"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__188"

    // $ANTLR start "T__189"
    public final void mT__189() throws RecognitionException {
        try {
            int _type = T__189;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:131:8: ( 'while' )
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:131:10: 'while'
            {
            match("while"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__189"

    // $ANTLR start "T__190"
    public final void mT__190() throws RecognitionException {
        try {
            int _type = T__190;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:132:8: ( '{' )
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:132:10: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__190"

    // $ANTLR start "T__191"
    public final void mT__191() throws RecognitionException {
        try {
            int _type = T__191;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:133:8: ( '|' )
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:133:10: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__191"

    // $ANTLR start "T__192"
    public final void mT__192() throws RecognitionException {
        try {
            int _type = T__192;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:134:8: ( '||' )
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:134:10: '||'
            {
            match("||"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__192"

    // $ANTLR start "T__193"
    public final void mT__193() throws RecognitionException {
        try {
            int _type = T__193;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:135:8: ( '}' )
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:135:10: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__193"

    // $ANTLR start "IDENT"
    public final void mIDENT() throws RecognitionException {
        try {
            int _type = IDENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1953:5: ( I ( I | D )* )
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1953:9: I ( I | D )*
            {
            mI(); 


            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1953:11: ( I | D )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='$'||(LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:
            	    {
            	    if ( input.LA(1)=='$'||(input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


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
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IDENT"

    // $ANTLR start "HEX_LIT"
    public final void mHEX_LIT() throws RecognitionException {
        try {
            int _type = HEX_LIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1956:2: ( ( '0x' | '0X' ) ( H )+ ( LU )? )
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1956:4: ( '0x' | '0X' ) ( H )+ ( LU )?
            {
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1956:4: ( '0x' | '0X' )
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
                    // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1956:5: '0x'
                    {
                    match("0x"); 



                    }
                    break;
                case 2 :
                    // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1956:12: '0X'
                    {
                    match("0X"); 



                    }
                    break;

            }


            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1956:18: ( H )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0 >= '0' && LA3_0 <= '9')||(LA3_0 >= 'A' && LA3_0 <= 'F')||(LA3_0 >= 'a' && LA3_0 <= 'f')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


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


            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1956:23: ( LU )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='L'||LA4_0=='U'||LA4_0=='l'||LA4_0=='u') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1956:24: LU
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
        	// do for sure before leaving
        }
    }
    // $ANTLR end "HEX_LIT"

    // $ANTLR start "OCT_LIT"
    public final void mOCT_LIT() throws RecognitionException {
        try {
            int _type = OCT_LIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1959:2: ( '0' ( O )+ )
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1959:4: '0' ( O )+
            {
            match('0'); 

            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1959:8: ( O )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0 >= '0' && LA5_0 <= '7')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


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
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OCT_LIT"

    // $ANTLR start "REAL_LIT"
    public final void mREAL_LIT() throws RecognitionException {
        try {
            int _type = REAL_LIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1971:2: ( ( D )+ E ( 'l' | 'L' )? | ( D )+ '.' ( D )* ( E )? ( 'l' | 'L' )? )
            int alt12=2;
            alt12 = dfa12.predict(input);
            switch (alt12) {
                case 1 :
                    // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1971:4: ( D )+ E ( 'l' | 'L' )?
                    {
                    // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1971:4: ( D )+
                    int cnt6=0;
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( ((LA6_0 >= '0' && LA6_0 <= '9')) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt6 >= 1 ) break loop6;
                                EarlyExitException eee =
                                    new EarlyExitException(6, input);
                                throw eee;
                        }
                        cnt6++;
                    } while (true);


                    mE(); 


                    // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1971:9: ( 'l' | 'L' )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0=='L'||LA7_0=='l') ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:
                            {
                            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                                input.consume();
                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;
                            }


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1972:4: ( D )+ '.' ( D )* ( E )? ( 'l' | 'L' )?
                    {
                    // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1972:4: ( D )+
                    int cnt8=0;
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( ((LA8_0 >= '0' && LA8_0 <= '9')) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt8 >= 1 ) break loop8;
                                EarlyExitException eee =
                                    new EarlyExitException(8, input);
                                throw eee;
                        }
                        cnt8++;
                    } while (true);


                    match('.'); 

                    // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1972:11: ( D )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( ((LA9_0 >= '0' && LA9_0 <= '9')) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);


                    // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1972:14: ( E )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='E'||LA10_0=='e') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1972:15: E
                            {
                            mE(); 


                            }
                            break;

                    }


                    // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1972:19: ( 'l' | 'L' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='L'||LA11_0=='l') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:
                            {
                            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                                input.consume();
                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;
                            }


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
        	// do for sure before leaving
        }
    }
    // $ANTLR end "REAL_LIT"

    // $ANTLR start "INT_LIT"
    public final void mINT_LIT() throws RecognitionException {
        try {
            int _type = INT_LIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1975:2: ( ( D )+ ( LU )? )
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1975:4: ( D )+ ( LU )?
            {
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1975:4: ( D )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0 >= '0' && LA13_0 <= '9')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);


            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1975:7: ( LU )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='L'||LA14_0=='U'||LA14_0=='l'||LA14_0=='u') ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1975:8: LU
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
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INT_LIT"

    // $ANTLR start "CHAR"
    public final void mCHAR() throws RecognitionException {
        try {
            int _type = CHAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1978:5: ( '\\'' ( ( '\\\\' ~ '\\n' ) |~ ( '\\\\' | '\\'' | '\\n' ) ) '\\'' )
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1978:9: '\\'' ( ( '\\\\' ~ '\\n' ) |~ ( '\\\\' | '\\'' | '\\n' ) ) '\\''
            {
            match('\''); 

            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1978:14: ( ( '\\\\' ~ '\\n' ) |~ ( '\\\\' | '\\'' | '\\n' ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='\\') ) {
                alt15=1;
            }
            else if ( ((LA15_0 >= '\u0000' && LA15_0 <= '\t')||(LA15_0 >= '\u000B' && LA15_0 <= '&')||(LA15_0 >= '(' && LA15_0 <= '[')||(LA15_0 >= ']' && LA15_0 <= '\uFFFF')) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;

            }
            switch (alt15) {
                case 1 :
                    // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1978:15: ( '\\\\' ~ '\\n' )
                    {
                    // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1978:15: ( '\\\\' ~ '\\n' )
                    // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1978:16: '\\\\' ~ '\\n'
                    {
                    match('\\'); 

                    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\uFFFF') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }


                    }
                    break;
                case 2 :
                    // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1978:30: ~ ( '\\\\' | '\\'' | '\\n' )
                    {
                    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;

            }


            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CHAR"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1981:5: ( '\"' ( ( '\\\\' ~ '\\n' ) |~ ( '\\\\' | '\"' | '\\n' ) )* '\"' | '\\'' ( ( '\\\\' ~ '\\n' ) |~ ( '\\\\' | '\\'' | '\\n' ) )+ '\\'' )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0=='\"') ) {
                alt18=1;
            }
            else if ( (LA18_0=='\'') ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;

            }
            switch (alt18) {
                case 1 :
                    // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1981:9: '\"' ( ( '\\\\' ~ '\\n' ) |~ ( '\\\\' | '\"' | '\\n' ) )* '\"'
                    {
                    match('\"'); 

                    // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1981:13: ( ( '\\\\' ~ '\\n' ) |~ ( '\\\\' | '\"' | '\\n' ) )*
                    loop16:
                    do {
                        int alt16=3;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0=='\\') ) {
                            alt16=1;
                        }
                        else if ( ((LA16_0 >= '\u0000' && LA16_0 <= '\t')||(LA16_0 >= '\u000B' && LA16_0 <= '!')||(LA16_0 >= '#' && LA16_0 <= '[')||(LA16_0 >= ']' && LA16_0 <= '\uFFFF')) ) {
                            alt16=2;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1981:14: ( '\\\\' ~ '\\n' )
                    	    {
                    	    // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1981:14: ( '\\\\' ~ '\\n' )
                    	    // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1981:15: '\\\\' ~ '\\n'
                    	    {
                    	    match('\\'); 

                    	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\uFFFF') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1981:29: ~ ( '\\\\' | '\"' | '\\n' )
                    	    {
                    	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);


                    match('\"'); 

                    }
                    break;
                case 2 :
                    // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1982:9: '\\'' ( ( '\\\\' ~ '\\n' ) |~ ( '\\\\' | '\\'' | '\\n' ) )+ '\\''
                    {
                    match('\''); 

                    // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1982:14: ( ( '\\\\' ~ '\\n' ) |~ ( '\\\\' | '\\'' | '\\n' ) )+
                    int cnt17=0;
                    loop17:
                    do {
                        int alt17=3;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0=='\\') ) {
                            alt17=1;
                        }
                        else if ( ((LA17_0 >= '\u0000' && LA17_0 <= '\t')||(LA17_0 >= '\u000B' && LA17_0 <= '&')||(LA17_0 >= '(' && LA17_0 <= '[')||(LA17_0 >= ']' && LA17_0 <= '\uFFFF')) ) {
                            alt17=2;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1982:15: ( '\\\\' ~ '\\n' )
                    	    {
                    	    // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1982:15: ( '\\\\' ~ '\\n' )
                    	    // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1982:16: '\\\\' ~ '\\n'
                    	    {
                    	    match('\\'); 

                    	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\uFFFF') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1982:30: ~ ( '\\\\' | '\\'' | '\\n' )
                    	    {
                    	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt17 >= 1 ) break loop17;
                                EarlyExitException eee =
                                    new EarlyExitException(17, input);
                                throw eee;
                        }
                        cnt17++;
                    } while (true);


                    match('\''); 

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STRING"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1985:5: ( ( ' ' | '\\t' )* )
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1985:9: ( ' ' | '\\t' )*
            {
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1985:9: ( ' ' | '\\t' )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0=='\t'||LA19_0==' ') ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:
            	    {
            	    if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


             _channel=HIDDEN; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "SL_COMMENT"
    public final void mSL_COMMENT() throws RecognitionException {
        try {
            int _type = SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1988:5: ( '#' (~ ( '\\n' | '\\r' ) )* | '/' '/' (~ ( '\\n' | '\\r' ) )* | '---' (~ ( '\\n' | '\\r' ) )* )
            int alt23=3;
            switch ( input.LA(1) ) {
            case '#':
                {
                alt23=1;
                }
                break;
            case '/':
                {
                alt23=2;
                }
                break;
            case '-':
                {
                alt23=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;

            }

            switch (alt23) {
                case 1 :
                    // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1988:7: '#' (~ ( '\\n' | '\\r' ) )*
                    {
                    match('#'); 

                    // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1988:11: (~ ( '\\n' | '\\r' ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( ((LA20_0 >= '\u0000' && LA20_0 <= '\t')||(LA20_0 >= '\u000B' && LA20_0 <= '\f')||(LA20_0 >= '\u000E' && LA20_0 <= '\uFFFF')) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:
                    	    {
                    	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);


                     _channel=HIDDEN; 

                    }
                    break;
                case 2 :
                    // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1989:7: '/' '/' (~ ( '\\n' | '\\r' ) )*
                    {
                    match('/'); 

                    match('/'); 

                    // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1989:14: (~ ( '\\n' | '\\r' ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( ((LA21_0 >= '\u0000' && LA21_0 <= '\t')||(LA21_0 >= '\u000B' && LA21_0 <= '\f')||(LA21_0 >= '\u000E' && LA21_0 <= '\uFFFF')) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:
                    	    {
                    	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);


                     _channel=HIDDEN; 

                    }
                    break;
                case 3 :
                    // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1990:7: '---' (~ ( '\\n' | '\\r' ) )*
                    {
                    match("---"); 



                    // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1990:13: (~ ( '\\n' | '\\r' ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( ((LA22_0 >= '\u0000' && LA22_0 <= '\t')||(LA22_0 >= '\u000B' && LA22_0 <= '\f')||(LA22_0 >= '\u000E' && LA22_0 <= '\uFFFF')) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:
                    	    {
                    	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


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
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SL_COMMENT"

    // $ANTLR start "INJECT"
    public final void mINJECT() throws RecognitionException {
        try {
            int _type = INJECT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1994:2: ( IJ_BEG ( options {greedy=false; } : . )* IJ_END )
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1994:4: IJ_BEG ( options {greedy=false; } : . )* IJ_END
            {
            mIJ_BEG(); 


            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1994:11: ( options {greedy=false; } : . )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0=='}') ) {
                    int LA24_1 = input.LA(2);

                    if ( (LA24_1=='+') ) {
                        alt24=2;
                    }
                    else if ( ((LA24_1 >= '\u0000' && LA24_1 <= '*')||(LA24_1 >= ',' && LA24_1 <= '\uFFFF')) ) {
                        alt24=1;
                    }


                }
                else if ( ((LA24_0 >= '\u0000' && LA24_0 <= '|')||(LA24_0 >= '~' && LA24_0 <= '\uFFFF')) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1994:39: .
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
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INJECT"

    // $ANTLR start "ML_COMMENT"
    public final void mML_COMMENT() throws RecognitionException {
        try {
            int _type = ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1999:5: ( '----' ( '-' )* ( ' ' | '\\t' )* ( '\\n' | '\\r' ) ( options {greedy=false; } : . )* '---' ( '-' )* ( '\\n' | '\\r' )* | '!--' ( options {greedy=false; } : . )* '--!' ( '\\n' | '\\r' )* )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0=='-') ) {
                alt32=1;
            }
            else if ( (LA32_0=='!') ) {
                alt32=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;

            }
            switch (alt32) {
                case 1 :
                    // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1999:9: '----' ( '-' )* ( ' ' | '\\t' )* ( '\\n' | '\\r' ) ( options {greedy=false; } : . )* '---' ( '-' )* ( '\\n' | '\\r' )*
                    {
                    match("----"); 



                    // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1999:16: ( '-' )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0=='-') ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1999:17: '-'
                    	    {
                    	    match('-'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop25;
                        }
                    } while (true);


                    // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1999:23: ( ' ' | '\\t' )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0=='\t'||LA26_0==' ') ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:
                    	    {
                    	    if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop26;
                        }
                    } while (true);


                    if ( input.LA(1)=='\n'||input.LA(1)=='\r' ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1999:49: ( options {greedy=false; } : . )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0=='-') ) {
                            int LA27_1 = input.LA(2);

                            if ( (LA27_1=='-') ) {
                                int LA27_3 = input.LA(3);

                                if ( (LA27_3=='-') ) {
                                    alt27=2;
                                }
                                else if ( ((LA27_3 >= '\u0000' && LA27_3 <= ',')||(LA27_3 >= '.' && LA27_3 <= '\uFFFF')) ) {
                                    alt27=1;
                                }


                            }
                            else if ( ((LA27_1 >= '\u0000' && LA27_1 <= ',')||(LA27_1 >= '.' && LA27_1 <= '\uFFFF')) ) {
                                alt27=1;
                            }


                        }
                        else if ( ((LA27_0 >= '\u0000' && LA27_0 <= ',')||(LA27_0 >= '.' && LA27_0 <= '\uFFFF')) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1999:77: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop27;
                        }
                    } while (true);


                    match("---"); 



                    // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1999:88: ( '-' )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0=='-') ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1999:89: '-'
                    	    {
                    	    match('-'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop28;
                        }
                    } while (true);


                    // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1999:94: ( '\\n' | '\\r' )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0=='\n'||LA29_0=='\r') ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:
                    	    {
                    	    if ( input.LA(1)=='\n'||input.LA(1)=='\r' ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop29;
                        }
                    } while (true);


                     _channel=HIDDEN; 

                    }
                    break;
                case 2 :
                    // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:2000:7: '!--' ( options {greedy=false; } : . )* '--!' ( '\\n' | '\\r' )*
                    {
                    match("!--"); 



                    // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:2000:13: ( options {greedy=false; } : . )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0=='-') ) {
                            int LA30_1 = input.LA(2);

                            if ( (LA30_1=='-') ) {
                                int LA30_3 = input.LA(3);

                                if ( (LA30_3=='!') ) {
                                    alt30=2;
                                }
                                else if ( ((LA30_3 >= '\u0000' && LA30_3 <= ' ')||(LA30_3 >= '\"' && LA30_3 <= '\uFFFF')) ) {
                                    alt30=1;
                                }


                            }
                            else if ( ((LA30_1 >= '\u0000' && LA30_1 <= ',')||(LA30_1 >= '.' && LA30_1 <= '\uFFFF')) ) {
                                alt30=1;
                            }


                        }
                        else if ( ((LA30_0 >= '\u0000' && LA30_0 <= ',')||(LA30_0 >= '.' && LA30_0 <= '\uFFFF')) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:2000:41: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop30;
                        }
                    } while (true);


                    match("--!"); 



                    // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:2000:53: ( '\\n' | '\\r' )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0=='\n'||LA31_0=='\r') ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:
                    	    {
                    	    if ( input.LA(1)=='\n'||input.LA(1)=='\r' ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop31;
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
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ML_COMMENT"

    // $ANTLR start "SEMI"
    public final void mSEMI() throws RecognitionException {
        try {
            int _type = SEMI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:2004:5: ( ';' )
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:2004:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SEMI"

    // $ANTLR start "NL"
    public final void mNL() throws RecognitionException {
        try {
            int _type = NL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:2007:5: ( ( '\\r' )? ( '\\n' ) )
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:2007:9: ( '\\r' )? ( '\\n' )
            {
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:2007:9: ( '\\r' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0=='\r') ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:2007:10: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }


            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:2007:17: ( '\\n' )
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:2007:18: '\\n'
            {
            match('\n'); 

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NL"

    // $ANTLR start "ILLEGAL_CHARACTER"
    public final void mILLEGAL_CHARACTER() throws RecognitionException {
        try {
            int _type = ILLEGAL_CHARACTER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:2010:5: ( '\\u0080' .. '\\uFFFF' )
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:
            {
            if ( (input.LA(1) >= '\u0080' && input.LA(1) <= '\uFFFF') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ILLEGAL_CHARACTER"

    // $ANTLR start "I"
    public final void mI() throws RecognitionException {
        try {
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:2013:11: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '$' ) )
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:
            {
            if ( input.LA(1)=='$'||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "I"

    // $ANTLR start "D"
    public final void mD() throws RecognitionException {
        try {
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:2014:11: ( '0' .. '9' )
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:
            {
            if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "D"

    // $ANTLR start "O"
    public final void mO() throws RecognitionException {
        try {
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:2015:11: ( '0' .. '7' )
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:
            {
            if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "O"

    // $ANTLR start "H"
    public final void mH() throws RecognitionException {
        try {
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:2016:11: ( 'a' .. 'f' | 'A' .. 'F' | '0' .. '9' )
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:
            {
            if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "H"

    // $ANTLR start "E"
    public final void mE() throws RecognitionException {
        try {
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:2017:11: ( ( 'E' | 'e' ) ( PLUS | MINUS )? ( D )+ )
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:2017:20: ( 'E' | 'e' ) ( PLUS | MINUS )? ( D )+
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:2017:32: ( PLUS | MINUS )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0=='+'||LA34_0=='-') ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;

            }


            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:2017:48: ( D )+
            int cnt35=0;
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( ((LA35_0 >= '0' && LA35_0 <= '9')) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt35 >= 1 ) break loop35;
                        EarlyExitException eee =
                            new EarlyExitException(35, input);
                        throw eee;
                }
                cnt35++;
            } while (true);


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "E"

    // $ANTLR start "LU"
    public final void mLU() throws RecognitionException {
        try {
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:2018:12: ( 'LU' | 'Lu' | 'lU' | 'lu' | 'UL' | 'uL' | 'Ul' | 'ul' | 'l' | 'u' | 'L' | 'U' )
            int alt36=12;
            switch ( input.LA(1) ) {
            case 'L':
                {
                switch ( input.LA(2) ) {
                case 'U':
                    {
                    alt36=1;
                    }
                    break;
                case 'u':
                    {
                    alt36=2;
                    }
                    break;
                default:
                    alt36=11;
                }

                }
                break;
            case 'l':
                {
                switch ( input.LA(2) ) {
                case 'U':
                    {
                    alt36=3;
                    }
                    break;
                case 'u':
                    {
                    alt36=4;
                    }
                    break;
                default:
                    alt36=9;
                }

                }
                break;
            case 'U':
                {
                switch ( input.LA(2) ) {
                case 'L':
                    {
                    alt36=5;
                    }
                    break;
                case 'l':
                    {
                    alt36=7;
                    }
                    break;
                default:
                    alt36=12;
                }

                }
                break;
            case 'u':
                {
                switch ( input.LA(2) ) {
                case 'L':
                    {
                    alt36=6;
                    }
                    break;
                case 'l':
                    {
                    alt36=8;
                    }
                    break;
                default:
                    alt36=10;
                }

                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;

            }

            switch (alt36) {
                case 1 :
                    // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:2018:20: 'LU'
                    {
                    match("LU"); 



                    }
                    break;
                case 2 :
                    // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:2018:27: 'Lu'
                    {
                    match("Lu"); 



                    }
                    break;
                case 3 :
                    // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:2018:34: 'lU'
                    {
                    match("lU"); 



                    }
                    break;
                case 4 :
                    // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:2018:41: 'lu'
                    {
                    match("lu"); 



                    }
                    break;
                case 5 :
                    // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:2018:48: 'UL'
                    {
                    match("UL"); 



                    }
                    break;
                case 6 :
                    // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:2018:55: 'uL'
                    {
                    match("uL"); 



                    }
                    break;
                case 7 :
                    // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:2018:62: 'Ul'
                    {
                    match("Ul"); 



                    }
                    break;
                case 8 :
                    // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:2018:69: 'ul'
                    {
                    match("ul"); 



                    }
                    break;
                case 9 :
                    // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:2018:76: 'l'
                    {
                    match('l'); 

                    }
                    break;
                case 10 :
                    // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:2018:82: 'u'
                    {
                    match('u'); 

                    }
                    break;
                case 11 :
                    // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:2018:88: 'L'
                    {
                    match('L'); 

                    }
                    break;
                case 12 :
                    // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:2018:94: 'U'
                    {
                    match('U'); 

                    }
                    break;

            }

        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LU"

    // $ANTLR start "INC"
    public final void mINC() throws RecognitionException {
        try {
            int _type = INC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:2020:6: ( '++' )
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:2020:9: '++'
            {
            match("++"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INC"

    // $ANTLR start "PLUS"
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:2021:7: ( '+' )
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:2021:10: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PLUS"

    // $ANTLR start "DEC"
    public final void mDEC() throws RecognitionException {
        try {
            int _type = DEC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:2022:6: ( '--' )
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:2022:9: '--'
            {
            match("--"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DEC"

    // $ANTLR start "MINUS"
    public final void mMINUS() throws RecognitionException {
        try {
            int _type = MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:2023:8: ( ( '-' ) )
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:2023:11: ( '-' )
            {
            if ( input.LA(1)=='-' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MINUS"

    // $ANTLR start "ASSIGN"
    public final void mASSIGN() throws RecognitionException {
        try {
            int _type = ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:2024:8: ( '=' )
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:2024:10: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ASSIGN"

    // $ANTLR start "BIND"
    public final void mBIND() throws RecognitionException {
        try {
            int _type = BIND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:2025:8: ( ':=' )
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:2025:10: ':='
            {
            match(":="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BIND"

    // $ANTLR start "ADD_EQ"
    public final void mADD_EQ() throws RecognitionException {
        try {
            int _type = ADD_EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:2026:8: ( '+=' )
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:2026:10: '+='
            {
            match("+="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ADD_EQ"

    // $ANTLR start "SUB_EQ"
    public final void mSUB_EQ() throws RecognitionException {
        try {
            int _type = SUB_EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:2027:8: ( '-=' )
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:2027:10: '-='
            {
            match("-="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SUB_EQ"

    // $ANTLR start "MUL_EQ"
    public final void mMUL_EQ() throws RecognitionException {
        try {
            int _type = MUL_EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:2028:8: ( '*=' )
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:2028:10: '*='
            {
            match("*="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MUL_EQ"

    // $ANTLR start "DIV_EQ"
    public final void mDIV_EQ() throws RecognitionException {
        try {
            int _type = DIV_EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:2029:8: ( '\\\\=' )
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:2029:10: '\\\\='
            {
            match("\\="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DIV_EQ"

    // $ANTLR start "BITOR_EQ"
    public final void mBITOR_EQ() throws RecognitionException {
        try {
            int _type = BITOR_EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:2030:10: ( '|=' )
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:2030:12: '|='
            {
            match("|="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BITOR_EQ"

    // $ANTLR start "BITXOR_EQ"
    public final void mBITXOR_EQ() throws RecognitionException {
        try {
            int _type = BITXOR_EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:2031:11: ( '^=' )
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:2031:13: '^='
            {
            match("^="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BITXOR_EQ"

    // $ANTLR start "BITAND_EQ"
    public final void mBITAND_EQ() throws RecognitionException {
        try {
            int _type = BITAND_EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:2032:11: ( '&=' )
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:2032:13: '&='
            {
            match("&="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BITAND_EQ"

    // $ANTLR start "RSHFT_EQ"
    public final void mRSHFT_EQ() throws RecognitionException {
        try {
            int _type = RSHFT_EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:2033:10: ( '>>=' )
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:2033:12: '>>='
            {
            match(">>="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RSHFT_EQ"

    // $ANTLR start "LSHFT_EQ"
    public final void mLSHFT_EQ() throws RecognitionException {
        try {
            int _type = LSHFT_EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:2034:10: ( '<<=' )
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:2034:12: '<<='
            {
            match("<<="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LSHFT_EQ"

    // $ANTLR start "MOD_EQ"
    public final void mMOD_EQ() throws RecognitionException {
        try {
            int _type = MOD_EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:2035:8: ( '%=' )
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:2035:10: '%='
            {
            match("%="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MOD_EQ"

    // $ANTLR start "PEG"
    public final void mPEG() throws RecognitionException {
        try {
            int _type = PEG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:2036:6: ( '@=' )
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:2036:8: '@='
            {
            match("@="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PEG"

    // $ANTLR start "EQ"
    public final void mEQ() throws RecognitionException {
        try {
            int _type = EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:2037:5: ( '==' )
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:2037:7: '=='
            {
            match("=="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EQ"

    // $ANTLR start "NOT_EQ"
    public final void mNOT_EQ() throws RecognitionException {
        try {
            int _type = NOT_EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:2038:8: ( '!=' )
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:2038:10: '!='
            {
            match("!="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NOT_EQ"

    // $ANTLR start "LT_EQ"
    public final void mLT_EQ() throws RecognitionException {
        try {
            int _type = LT_EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:2039:8: ( '<=' )
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:2039:10: '<='
            {
            match("<="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LT_EQ"

    // $ANTLR start "GT_EQ"
    public final void mGT_EQ() throws RecognitionException {
        try {
            int _type = GT_EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:2040:7: ( '>=' )
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:2040:9: '>='
            {
            match(">="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GT_EQ"

    // $ANTLR start "LOG_NOT"
    public final void mLOG_NOT() throws RecognitionException {
        try {
            int _type = LOG_NOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:2041:9: ( '!' )
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:2041:11: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LOG_NOT"

    // $ANTLR start "BIT_NOT"
    public final void mBIT_NOT() throws RecognitionException {
        try {
            int _type = BIT_NOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:2042:9: ( '~' )
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:2042:11: '~'
            {
            match('~'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BIT_NOT"

    // $ANTLR start "GT"
    public final void mGT() throws RecognitionException {
        try {
            int _type = GT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:2043:5: ( '>' )
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:2043:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GT"

    // $ANTLR start "LT"
    public final void mLT() throws RecognitionException {
        try {
            int _type = LT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:2044:5: ( '<' )
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:2044:7: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LT"

    // $ANTLR start "IJ_BEG"
    public final void mIJ_BEG() throws RecognitionException {
        try {
            int _type = IJ_BEG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:2047:7: ( '+{' )
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:2047:10: '+{'
            {
            match("+{"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IJ_BEG"

    // $ANTLR start "IJ_END"
    public final void mIJ_END() throws RecognitionException {
        try {
            int _type = IJ_END;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:2048:7: ( '}+' )
            // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:2048:10: '}+'
            {
            match("}+"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IJ_END"

    public void mTokens() throws RecognitionException {
        // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1:8: ( THIS | T__124 | T__125 | T__126 | T__127 | T__128 | T__129 | T__130 | T__131 | T__132 | T__133 | T__134 | T__135 | T__136 | T__137 | T__138 | T__139 | T__140 | T__141 | T__142 | T__143 | T__144 | T__145 | T__146 | T__147 | T__148 | T__149 | T__150 | T__151 | T__152 | T__153 | T__154 | T__155 | T__156 | T__157 | T__158 | T__159 | T__160 | T__161 | T__162 | T__163 | T__164 | T__165 | T__166 | T__167 | T__168 | T__169 | T__170 | T__171 | T__172 | T__173 | T__174 | T__175 | T__176 | T__177 | T__178 | T__179 | T__180 | T__181 | T__182 | T__183 | T__184 | T__185 | T__186 | T__187 | T__188 | T__189 | T__190 | T__191 | T__192 | T__193 | IDENT | HEX_LIT | OCT_LIT | REAL_LIT | INT_LIT | CHAR | STRING | WS | SL_COMMENT | INJECT | ML_COMMENT | SEMI | NL | ILLEGAL_CHARACTER | INC | PLUS | DEC | MINUS | ASSIGN | BIND | ADD_EQ | SUB_EQ | MUL_EQ | DIV_EQ | BITOR_EQ | BITXOR_EQ | BITAND_EQ | RSHFT_EQ | LSHFT_EQ | MOD_EQ | PEG | EQ | NOT_EQ | LT_EQ | GT_EQ | LOG_NOT | BIT_NOT | GT | LT | IJ_BEG | IJ_END )
        int alt37=112;
        alt37 = dfa37.predict(input);
        switch (alt37) {
            case 1 :
                // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1:10: THIS
                {
                mTHIS(); 


                }
                break;
            case 2 :
                // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1:15: T__124
                {
                mT__124(); 


                }
                break;
            case 3 :
                // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1:22: T__125
                {
                mT__125(); 


                }
                break;
            case 4 :
                // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1:29: T__126
                {
                mT__126(); 


                }
                break;
            case 5 :
                // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1:36: T__127
                {
                mT__127(); 


                }
                break;
            case 6 :
                // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1:43: T__128
                {
                mT__128(); 


                }
                break;
            case 7 :
                // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1:50: T__129
                {
                mT__129(); 


                }
                break;
            case 8 :
                // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1:57: T__130
                {
                mT__130(); 


                }
                break;
            case 9 :
                // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1:64: T__131
                {
                mT__131(); 


                }
                break;
            case 10 :
                // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1:71: T__132
                {
                mT__132(); 


                }
                break;
            case 11 :
                // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1:78: T__133
                {
                mT__133(); 


                }
                break;
            case 12 :
                // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1:85: T__134
                {
                mT__134(); 


                }
                break;
            case 13 :
                // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1:92: T__135
                {
                mT__135(); 


                }
                break;
            case 14 :
                // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1:99: T__136
                {
                mT__136(); 


                }
                break;
            case 15 :
                // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1:106: T__137
                {
                mT__137(); 


                }
                break;
            case 16 :
                // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1:113: T__138
                {
                mT__138(); 


                }
                break;
            case 17 :
                // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1:120: T__139
                {
                mT__139(); 


                }
                break;
            case 18 :
                // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1:127: T__140
                {
                mT__140(); 


                }
                break;
            case 19 :
                // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1:134: T__141
                {
                mT__141(); 


                }
                break;
            case 20 :
                // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1:141: T__142
                {
                mT__142(); 


                }
                break;
            case 21 :
                // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1:148: T__143
                {
                mT__143(); 


                }
                break;
            case 22 :
                // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1:155: T__144
                {
                mT__144(); 


                }
                break;
            case 23 :
                // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1:162: T__145
                {
                mT__145(); 


                }
                break;
            case 24 :
                // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1:169: T__146
                {
                mT__146(); 


                }
                break;
            case 25 :
                // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1:176: T__147
                {
                mT__147(); 


                }
                break;
            case 26 :
                // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1:183: T__148
                {
                mT__148(); 


                }
                break;
            case 27 :
                // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1:190: T__149
                {
                mT__149(); 


                }
                break;
            case 28 :
                // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1:197: T__150
                {
                mT__150(); 


                }
                break;
            case 29 :
                // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1:204: T__151
                {
                mT__151(); 


                }
                break;
            case 30 :
                // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1:211: T__152
                {
                mT__152(); 


                }
                break;
            case 31 :
                // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1:218: T__153
                {
                mT__153(); 


                }
                break;
            case 32 :
                // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1:225: T__154
                {
                mT__154(); 


                }
                break;
            case 33 :
                // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1:232: T__155
                {
                mT__155(); 


                }
                break;
            case 34 :
                // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1:239: T__156
                {
                mT__156(); 


                }
                break;
            case 35 :
                // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1:246: T__157
                {
                mT__157(); 


                }
                break;
            case 36 :
                // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1:253: T__158
                {
                mT__158(); 


                }
                break;
            case 37 :
                // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1:260: T__159
                {
                mT__159(); 


                }
                break;
            case 38 :
                // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1:267: T__160
                {
                mT__160(); 


                }
                break;
            case 39 :
                // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1:274: T__161
                {
                mT__161(); 


                }
                break;
            case 40 :
                // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1:281: T__162
                {
                mT__162(); 


                }
                break;
            case 41 :
                // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1:288: T__163
                {
                mT__163(); 


                }
                break;
            case 42 :
                // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1:295: T__164
                {
                mT__164(); 


                }
                break;
            case 43 :
                // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1:302: T__165
                {
                mT__165(); 


                }
                break;
            case 44 :
                // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1:309: T__166
                {
                mT__166(); 


                }
                break;
            case 45 :
                // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1:316: T__167
                {
                mT__167(); 


                }
                break;
            case 46 :
                // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1:323: T__168
                {
                mT__168(); 


                }
                break;
            case 47 :
                // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1:330: T__169
                {
                mT__169(); 


                }
                break;
            case 48 :
                // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1:337: T__170
                {
                mT__170(); 


                }
                break;
            case 49 :
                // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1:344: T__171
                {
                mT__171(); 


                }
                break;
            case 50 :
                // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1:351: T__172
                {
                mT__172(); 


                }
                break;
            case 51 :
                // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1:358: T__173
                {
                mT__173(); 


                }
                break;
            case 52 :
                // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1:365: T__174
                {
                mT__174(); 


                }
                break;
            case 53 :
                // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1:372: T__175
                {
                mT__175(); 


                }
                break;
            case 54 :
                // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1:379: T__176
                {
                mT__176(); 


                }
                break;
            case 55 :
                // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1:386: T__177
                {
                mT__177(); 


                }
                break;
            case 56 :
                // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1:393: T__178
                {
                mT__178(); 


                }
                break;
            case 57 :
                // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1:400: T__179
                {
                mT__179(); 


                }
                break;
            case 58 :
                // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1:407: T__180
                {
                mT__180(); 


                }
                break;
            case 59 :
                // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1:414: T__181
                {
                mT__181(); 


                }
                break;
            case 60 :
                // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1:421: T__182
                {
                mT__182(); 


                }
                break;
            case 61 :
                // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1:428: T__183
                {
                mT__183(); 


                }
                break;
            case 62 :
                // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1:435: T__184
                {
                mT__184(); 


                }
                break;
            case 63 :
                // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1:442: T__185
                {
                mT__185(); 


                }
                break;
            case 64 :
                // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1:449: T__186
                {
                mT__186(); 


                }
                break;
            case 65 :
                // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1:456: T__187
                {
                mT__187(); 


                }
                break;
            case 66 :
                // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1:463: T__188
                {
                mT__188(); 


                }
                break;
            case 67 :
                // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1:470: T__189
                {
                mT__189(); 


                }
                break;
            case 68 :
                // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1:477: T__190
                {
                mT__190(); 


                }
                break;
            case 69 :
                // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1:484: T__191
                {
                mT__191(); 


                }
                break;
            case 70 :
                // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1:491: T__192
                {
                mT__192(); 


                }
                break;
            case 71 :
                // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1:498: T__193
                {
                mT__193(); 


                }
                break;
            case 72 :
                // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1:505: IDENT
                {
                mIDENT(); 


                }
                break;
            case 73 :
                // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1:511: HEX_LIT
                {
                mHEX_LIT(); 


                }
                break;
            case 74 :
                // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1:519: OCT_LIT
                {
                mOCT_LIT(); 


                }
                break;
            case 75 :
                // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1:527: REAL_LIT
                {
                mREAL_LIT(); 


                }
                break;
            case 76 :
                // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1:536: INT_LIT
                {
                mINT_LIT(); 


                }
                break;
            case 77 :
                // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1:544: CHAR
                {
                mCHAR(); 


                }
                break;
            case 78 :
                // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1:549: STRING
                {
                mSTRING(); 


                }
                break;
            case 79 :
                // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1:556: WS
                {
                mWS(); 


                }
                break;
            case 80 :
                // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1:559: SL_COMMENT
                {
                mSL_COMMENT(); 


                }
                break;
            case 81 :
                // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1:570: INJECT
                {
                mINJECT(); 


                }
                break;
            case 82 :
                // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1:577: ML_COMMENT
                {
                mML_COMMENT(); 


                }
                break;
            case 83 :
                // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1:588: SEMI
                {
                mSEMI(); 


                }
                break;
            case 84 :
                // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1:593: NL
                {
                mNL(); 


                }
                break;
            case 85 :
                // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1:596: ILLEGAL_CHARACTER
                {
                mILLEGAL_CHARACTER(); 


                }
                break;
            case 86 :
                // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1:614: INC
                {
                mINC(); 


                }
                break;
            case 87 :
                // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1:618: PLUS
                {
                mPLUS(); 


                }
                break;
            case 88 :
                // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1:623: DEC
                {
                mDEC(); 


                }
                break;
            case 89 :
                // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1:627: MINUS
                {
                mMINUS(); 


                }
                break;
            case 90 :
                // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1:633: ASSIGN
                {
                mASSIGN(); 


                }
                break;
            case 91 :
                // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1:640: BIND
                {
                mBIND(); 


                }
                break;
            case 92 :
                // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1:645: ADD_EQ
                {
                mADD_EQ(); 


                }
                break;
            case 93 :
                // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1:652: SUB_EQ
                {
                mSUB_EQ(); 


                }
                break;
            case 94 :
                // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1:659: MUL_EQ
                {
                mMUL_EQ(); 


                }
                break;
            case 95 :
                // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1:666: DIV_EQ
                {
                mDIV_EQ(); 


                }
                break;
            case 96 :
                // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1:673: BITOR_EQ
                {
                mBITOR_EQ(); 


                }
                break;
            case 97 :
                // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1:682: BITXOR_EQ
                {
                mBITXOR_EQ(); 


                }
                break;
            case 98 :
                // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1:692: BITAND_EQ
                {
                mBITAND_EQ(); 


                }
                break;
            case 99 :
                // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1:702: RSHFT_EQ
                {
                mRSHFT_EQ(); 


                }
                break;
            case 100 :
                // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1:711: LSHFT_EQ
                {
                mLSHFT_EQ(); 


                }
                break;
            case 101 :
                // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1:720: MOD_EQ
                {
                mMOD_EQ(); 


                }
                break;
            case 102 :
                // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1:727: PEG
                {
                mPEG(); 


                }
                break;
            case 103 :
                // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1:731: EQ
                {
                mEQ(); 


                }
                break;
            case 104 :
                // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1:734: NOT_EQ
                {
                mNOT_EQ(); 


                }
                break;
            case 105 :
                // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1:741: LT_EQ
                {
                mLT_EQ(); 


                }
                break;
            case 106 :
                // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1:747: GT_EQ
                {
                mGT_EQ(); 


                }
                break;
            case 107 :
                // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1:753: LOG_NOT
                {
                mLOG_NOT(); 


                }
                break;
            case 108 :
                // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1:761: BIT_NOT
                {
                mBIT_NOT(); 


                }
                break;
            case 109 :
                // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1:769: GT
                {
                mGT(); 


                }
                break;
            case 110 :
                // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1:772: LT
                {
                mLT(); 


                }
                break;
            case 111 :
                // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1:775: IJ_BEG
                {
                mIJ_BEG(); 


                }
                break;
            case 112 :
                // /Users/lentil/Documents/MegansStuff/Documents/Grammar_Sample/com.amaret.pollen/parser/pollen.g:1:782: IJ_END
                {
                mIJ_END(); 


                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    protected DFA37 dfa37 = new DFA37(this);
    static final String DFA12_eotS =
        "\4\uffff";
    static final String DFA12_eofS =
        "\4\uffff";
    static final String DFA12_minS =
        "\1\60\1\56\2\uffff";
    static final String DFA12_maxS =
        "\1\71\1\145\2\uffff";
    static final String DFA12_acceptS =
        "\2\uffff\1\1\1\2";
    static final String DFA12_specialS =
        "\4\uffff}>";
    static final String[] DFA12_transitionS = {
            "\12\1",
            "\1\3\1\uffff\12\1\13\uffff\1\2\37\uffff\1\2",
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
            return "1970:1: REAL_LIT : ( ( D )+ E ( 'l' | 'L' )? | ( D )+ '.' ( D )* ( E )? ( 'l' | 'L' )? );";
        }
    }
    static final String DFA37_eotS =
        "\1\54\1\47\1\73\1\76\2\uffff\1\100\2\uffff\1\101\1\103\1\106\1\111"+
        "\1\uffff\1\113\2\uffff\1\115\22\47\1\uffff\1\163\1\165\1\uffff\2"+
        "\171\4\uffff\1\176\1\u0082\1\u0085\3\uffff\1\u0087\2\uffff\3\47"+
        "\12\uffff\1\u008c\2\uffff\1\u008e\6\uffff\1\u008f\7\47\1\u0098\10"+
        "\47\1\u00a3\21\47\6\uffff\1\u00b7\4\uffff\1\u00bb\2\uffff\1\u00bc"+
        "\10\uffff\3\47\5\uffff\10\47\1\uffff\3\47\1\u00cd\3\47\1\u00d1\2"+
        "\47\1\uffff\2\47\1\u00d9\2\47\1\u00dc\1\47\1\u00de\13\47\3\uffff"+
        "\1\55\3\uffff\1\u00ed\1\u00ee\1\u00ef\1\u00f0\1\47\1\u00f2\1\u00f3"+
        "\5\47\1\u00f9\1\u00fa\1\u00fb\1\uffff\3\47\1\uffff\1\u00ff\1\u0100"+
        "\4\47\1\u0105\1\uffff\1\u0106\1\47\1\uffff\1\u0108\1\uffff\14\47"+
        "\1\uffff\1\55\4\uffff\1\u0119\2\uffff\1\u011a\1\47\1\u011c\2\47"+
        "\3\uffff\2\47\1\u0121\2\uffff\2\47\1\u0124\1\u0125\2\uffff\1\47"+
        "\1\uffff\2\47\1\u0129\10\47\1\u0132\1\47\1\u0134\2\55\2\uffff\1"+
        "\47\1\uffff\2\47\1\u0138\1\47\1\uffff\1\47\1\u013b\2\uffff\1\u013c"+
        "\1\47\1\u013e\1\uffff\2\47\1\u0141\1\u0142\1\u0143\1\u0144\1\u0145"+
        "\1\u0146\1\uffff\1\47\1\uffff\2\47\1\u014a\1\uffff\1\u014b\1\47"+
        "\2\uffff\1\u014d\1\uffff\2\47\6\uffff\2\47\1\u0152\2\uffff\1\47"+
        "\1\uffff\1\u0154\1\u0155\1\u0156\1\47\1\uffff\1\47\3\uffff\1\47"+
        "\1\u015a\1\u015b\2\uffff";
    static final String DFA37_eofS =
        "\u015c\uffff";
    static final String DFA37_minS =
        "\1\12\1\150\1\75\1\46\2\uffff\1\75\2\uffff\1\57\1\75\1\74\1\75\1"+
        "\uffff\1\75\2\uffff\1\75\1\163\1\157\1\141\1\145\1\154\1\141\1\157"+
        "\1\146\1\157\2\145\1\165\1\141\1\145\1\164\1\151\1\157\1\150\1\uffff"+
        "\1\75\1\53\1\uffff\2\56\1\0\3\uffff\1\55\1\53\1\55\3\uffff\1\75"+
        "\2\uffff\1\151\1\165\1\160\12\uffff\1\75\2\uffff\1\75\6\uffff\1"+
        "\44\1\157\1\145\1\164\1\163\1\141\1\155\1\146\1\44\1\151\1\165\1"+
        "\162\1\160\1\154\1\162\1\157\1\163\1\44\1\160\1\164\1\147\1\164"+
        "\1\144\1\167\1\154\1\164\1\143\1\145\1\142\1\164\1\162\1\151\1\156"+
        "\1\154\1\151\6\uffff\1\56\2\uffff\2\0\1\55\2\uffff\1\0\10\uffff"+
        "\1\163\2\145\5\uffff\1\154\1\141\2\145\1\163\1\160\1\163\1\141\1"+
        "\uffff\1\146\1\145\1\155\1\44\1\157\1\145\1\163\1\44\1\155\1\164"+
        "\1\uffff\1\154\1\61\1\44\1\141\1\165\1\44\1\154\1\44\1\153\1\163"+
        "\1\156\1\164\1\154\1\165\1\151\2\164\1\141\1\154\1\uffff\1\0\1\uffff"+
        "\1\55\3\uffff\4\44\1\153\2\44\1\163\1\157\1\164\1\151\1\165\3\44"+
        "\1\uffff\1\162\1\156\1\145\1\uffff\2\44\1\145\1\162\1\66\1\62\1"+
        "\44\1\uffff\1\44\1\154\1\uffff\1\44\1\uffff\1\141\1\145\1\164\1"+
        "\157\2\151\1\162\1\156\1\143\1\61\1\164\1\145\1\uffff\1\11\4\uffff"+
        "\1\44\2\uffff\1\44\1\163\1\44\1\156\1\154\3\uffff\1\164\1\144\1"+
        "\44\2\uffff\1\155\1\164\2\44\2\uffff\1\145\1\uffff\1\147\1\164\1"+
        "\44\1\143\1\144\1\143\1\156\1\147\1\150\1\66\1\62\1\44\1\151\1\44"+
        "\2\11\2\uffff\1\151\1\uffff\1\165\1\164\1\44\1\163\1\uffff\1\145"+
        "\1\44\2\uffff\1\44\1\145\1\44\1\uffff\1\157\1\145\6\44\1\uffff\1"+
        "\154\1\uffff\1\164\1\145\1\44\1\uffff\1\44\1\156\2\uffff\1\44\1"+
        "\uffff\1\154\1\144\6\uffff\1\145\1\151\1\44\2\uffff\1\164\1\uffff"+
        "\3\44\1\157\1\uffff\1\163\3\uffff\1\156\2\44\2\uffff";
    static final String DFA37_maxS =
        "\1\uffff\1\171\2\75\2\uffff\1\75\2\uffff\1\57\2\75\1\76\1\uffff"+
        "\1\75\2\uffff\1\75\1\163\1\171\2\157\1\170\1\162\1\157\1\156\2\157"+
        "\3\165\1\145\1\167\1\151\1\157\1\150\1\uffff\1\174\1\53\1\uffff"+
        "\1\170\1\145\1\uffff\3\uffff\1\75\1\173\1\75\3\uffff\1\75\2\uffff"+
        "\1\151\1\165\1\160\12\uffff\1\75\2\uffff\1\75\6\uffff\1\172\1\157"+
        "\1\145\1\164\1\163\1\141\1\156\1\146\1\172\1\163\1\165\1\162\1\164"+
        "\1\154\1\162\1\157\1\163\1\172\1\160\1\164\1\147\1\164\1\144\1\167"+
        "\1\154\1\164\1\143\1\157\1\142\1\164\1\162\1\151\1\156\1\154\1\151"+
        "\6\uffff\1\165\2\uffff\2\uffff\1\55\2\uffff\1\uffff\10\uffff\1\163"+
        "\2\145\5\uffff\1\154\1\141\2\145\1\163\1\160\1\164\1\141\1\uffff"+
        "\1\146\1\145\1\155\1\172\1\157\1\145\1\163\1\172\1\155\1\164\1\uffff"+
        "\1\157\1\70\1\172\1\141\1\165\1\172\1\154\1\172\1\153\1\163\1\156"+
        "\1\166\1\154\1\165\1\151\2\164\1\141\1\154\1\uffff\1\uffff\1\uffff"+
        "\1\55\3\uffff\4\172\1\153\2\172\1\163\1\157\1\164\1\151\1\165\3"+
        "\172\1\uffff\1\162\1\156\1\145\1\uffff\2\172\1\145\1\162\1\66\1"+
        "\62\1\172\1\uffff\1\172\1\154\1\uffff\1\172\1\uffff\1\141\1\145"+
        "\1\164\1\157\2\151\1\162\1\156\1\143\1\70\1\164\1\145\1\uffff\1"+
        "\55\4\uffff\1\172\2\uffff\1\172\1\163\1\172\1\156\1\154\3\uffff"+
        "\1\164\1\144\1\172\2\uffff\1\155\1\164\2\172\2\uffff\1\145\1\uffff"+
        "\1\147\1\164\1\172\1\143\1\144\1\143\1\156\1\147\1\150\1\66\1\62"+
        "\1\172\1\151\1\172\1\55\1\40\2\uffff\1\151\1\uffff\1\165\1\164\1"+
        "\172\1\163\1\uffff\1\145\1\172\2\uffff\1\172\1\145\1\172\1\uffff"+
        "\1\157\1\145\6\172\1\uffff\1\154\1\uffff\1\164\1\145\1\172\1\uffff"+
        "\1\172\1\156\2\uffff\1\172\1\uffff\1\154\1\144\6\uffff\1\145\1\151"+
        "\1\172\2\uffff\1\164\1\uffff\3\172\1\157\1\uffff\1\163\3\uffff\1"+
        "\156\2\172\2\uffff";
    static final String DFA37_acceptS =
        "\4\uffff\1\5\1\6\1\uffff\1\10\1\11\4\uffff\1\16\1\uffff\1\20\1\21"+
        "\23\uffff\1\104\2\uffff\1\110\3\uffff\1\116\1\117\1\120\3\uffff"+
        "\1\123\1\124\1\125\1\uffff\1\137\1\154\3\uffff\1\145\1\2\1\3\1\142"+
        "\1\4\1\136\1\7\1\12\1\133\1\13\1\uffff\1\151\1\156\1\uffff\1\152"+
        "\1\155\1\146\1\17\1\141\1\22\43\uffff\1\106\1\140\1\105\1\160\1"+
        "\107\1\111\1\uffff\1\113\1\114\3\uffff\1\135\1\131\1\uffff\1\126"+
        "\1\134\1\127\1\122\1\150\1\153\1\147\1\132\3\uffff\1\144\1\14\1"+
        "\143\1\15\1\23\10\uffff\1\35\12\uffff\1\50\23\uffff\1\112\1\uffff"+
        "\1\115\1\uffff\1\130\1\157\1\121\17\uffff\1\41\3\uffff\1\45\7\uffff"+
        "\1\56\2\uffff\1\61\1\uffff\1\63\14\uffff\1\115\1\uffff\1\1\1\75"+
        "\1\76\1\24\1\uffff\1\26\1\27\5\uffff\1\36\1\37\1\40\3\uffff\1\46"+
        "\1\47\4\uffff\1\55\1\57\1\uffff\1\62\20\uffff\1\25\1\30\1\uffff"+
        "\1\32\4\uffff\1\44\2\uffff\1\53\1\54\3\uffff\1\66\10\uffff\1\101"+
        "\1\uffff\1\103\3\uffff\1\42\2\uffff\1\52\1\60\1\uffff\1\65\2\uffff"+
        "\1\71\1\72\1\73\1\74\1\77\1\100\3\uffff\1\34\1\43\1\uffff\1\64\4"+
        "\uffff\1\33\1\uffff\1\67\1\70\1\102\3\uffff\1\51\1\31";
    static final String DFA37_specialS =
        "\52\uffff\1\2\117\uffff\1\1\1\3\3\uffff\1\0\70\uffff\1\4\u00a3\uffff}>";
    static final String[] DFA37_transitionS = {
            "\1\62\2\uffff\1\62\23\uffff\1\60\1\53\1\55\1\47\1\2\1\3\1\52"+
            "\1\4\1\5\1\6\1\57\1\7\1\56\1\10\1\11\1\50\11\51\1\12\1\61\1"+
            "\13\1\64\1\14\1\15\1\16\32\47\1\17\1\65\1\20\1\21\1\47\1\uffff"+
            "\1\22\1\23\1\24\1\25\1\26\1\27\1\47\1\30\1\31\2\47\1\32\1\33"+
            "\1\34\1\35\1\36\1\47\1\37\1\40\1\1\1\41\1\42\1\43\3\47\1\44"+
            "\1\45\1\46\1\66\1\uffff\uff80\63",
            "\1\67\11\uffff\1\70\6\uffff\1\71",
            "\1\72",
            "\1\74\26\uffff\1\75",
            "",
            "",
            "\1\77",
            "",
            "",
            "\1\55",
            "\1\102",
            "\1\104\1\105",
            "\1\110\1\107",
            "",
            "\1\112",
            "",
            "",
            "\1\114",
            "\1\116",
            "\1\117\2\uffff\1\120\6\uffff\1\121",
            "\1\122\12\uffff\1\123\2\uffff\1\124",
            "\1\125\11\uffff\1\126",
            "\1\127\1\uffff\1\130\3\uffff\1\131\5\uffff\1\132",
            "\1\133\15\uffff\1\134\2\uffff\1\135",
            "\1\136",
            "\1\137\6\uffff\1\140\1\141",
            "\1\142",
            "\1\143\11\uffff\1\144",
            "\1\145\17\uffff\1\146",
            "\1\147",
            "\1\150\20\uffff\1\151\2\uffff\1\152",
            "\1\153",
            "\1\154\2\uffff\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "",
            "\1\162\76\uffff\1\161",
            "\1\164",
            "",
            "\1\170\1\uffff\10\167\2\51\13\uffff\1\170\22\uffff\1\166\14"+
            "\uffff\1\170\22\uffff\1\166",
            "\1\170\1\uffff\12\51\13\uffff\1\170\37\uffff\1\170",
            "\12\173\1\uffff\34\173\1\uffff\64\173\1\172\uffa3\173",
            "",
            "",
            "",
            "\1\174\17\uffff\1\175",
            "\1\u0080\21\uffff\1\u0081\75\uffff\1\177",
            "\1\u0083\17\uffff\1\u0084",
            "",
            "",
            "",
            "\1\u0086",
            "",
            "",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
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
            "\1\u008b",
            "",
            "",
            "\1\u008d",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\47\13\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095\1\u0096",
            "\1\u0097",
            "\1\47\13\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "\1\u0099\11\uffff\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d\3\uffff\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\1\47\13\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad\3\uffff\1\u00ae\5\uffff\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\170\1\uffff\10\167\2\51\13\uffff\1\170\6\uffff\1\171\10"+
            "\uffff\1\171\17\uffff\1\170\6\uffff\1\171\10\uffff\1\171",
            "",
            "",
            "\12\u00b8\1\uffff\ufff5\u00b8",
            "\12\53\1\uffff\34\53\1\u00b9\uffd8\53",
            "\1\u00ba",
            "",
            "",
            "\0\u00bd",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00be",
            "\1\u00bf",
            "\1\u00c0",
            "",
            "",
            "",
            "",
            "",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "\1\u00c6",
            "\1\u00c7\1\u00c8",
            "\1\u00c9",
            "",
            "\1\u00ca",
            "\1\u00cb",
            "\1\u00cc",
            "\1\47\13\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "\1\u00ce",
            "\1\u00cf",
            "\1\u00d0",
            "\1\47\13\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "\1\u00d2",
            "\1\u00d3",
            "",
            "\1\u00d4\2\uffff\1\u00d5",
            "\1\u00d6\1\uffff\1\u00d7\4\uffff\1\u00d8",
            "\1\47\13\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "\1\u00da",
            "\1\u00db",
            "\1\47\13\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "\1\u00dd",
            "\1\47\13\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "\1\u00df",
            "\1\u00e0",
            "\1\u00e1",
            "\1\u00e2\1\uffff\1\u00e3",
            "\1\u00e4",
            "\1\u00e5",
            "\1\u00e6",
            "\1\u00e7",
            "\1\u00e8",
            "\1\u00e9",
            "\1\u00ea",
            "",
            "\12\53\1\uffff\34\53\1\u00b9\uffd8\53",
            "",
            "\1\u00ec",
            "",
            "",
            "",
            "\1\47\13\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "\1\47\13\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "\1\47\13\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "\1\47\13\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "\1\u00f1",
            "\1\47\13\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "\1\47\13\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "\1\u00f4",
            "\1\u00f5",
            "\1\u00f6",
            "\1\u00f7",
            "\1\u00f8",
            "\1\47\13\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "\1\47\13\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "\1\47\13\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "",
            "\1\u00fc",
            "\1\u00fd",
            "\1\u00fe",
            "",
            "\1\47\13\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "\1\47\13\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "\1\u0101",
            "\1\u0102",
            "\1\u0103",
            "\1\u0104",
            "\1\47\13\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "",
            "\1\47\13\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "\1\u0107",
            "",
            "\1\47\13\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "",
            "\1\u0109",
            "\1\u010a",
            "\1\u010b",
            "\1\u010c",
            "\1\u010d",
            "\1\u010e",
            "\1\u010f",
            "\1\u0110",
            "\1\u0111",
            "\1\u0112\1\uffff\1\u0113\4\uffff\1\u0114",
            "\1\u0115",
            "\1\u0116",
            "",
            "\1\u0118\1\u0083\2\uffff\1\u0083\22\uffff\1\u0118\14\uffff"+
            "\1\u0117",
            "",
            "",
            "",
            "",
            "\1\47\13\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "",
            "",
            "\1\47\13\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "\1\u011b",
            "\1\47\13\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "\1\u011d",
            "\1\u011e",
            "",
            "",
            "",
            "\1\u011f",
            "\1\u0120",
            "\1\47\13\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "",
            "",
            "\1\u0122",
            "\1\u0123",
            "\1\47\13\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "\1\47\13\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "",
            "",
            "\1\u0126",
            "",
            "\1\u0127",
            "\1\u0128",
            "\1\47\13\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "\1\u012a",
            "\1\u012b",
            "\1\u012c",
            "\1\u012d",
            "\1\u012e",
            "\1\u012f",
            "\1\u0130",
            "\1\u0131",
            "\1\47\13\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "\1\u0133",
            "\1\47\13\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "\1\u0118\1\u0083\2\uffff\1\u0083\22\uffff\1\u0118\14\uffff"+
            "\1\u0117",
            "\1\u0118\1\u0083\2\uffff\1\u0083\22\uffff\1\u0118",
            "",
            "",
            "\1\u0135",
            "",
            "\1\u0136",
            "\1\u0137",
            "\1\47\13\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "\1\u0139",
            "",
            "\1\u013a",
            "\1\47\13\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "",
            "",
            "\1\47\13\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "\1\u013d",
            "\1\47\13\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "",
            "\1\u013f",
            "\1\u0140",
            "\1\47\13\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "\1\47\13\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "\1\47\13\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "\1\47\13\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "\1\47\13\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "\1\47\13\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "",
            "\1\u0147",
            "",
            "\1\u0148",
            "\1\u0149",
            "\1\47\13\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "",
            "\1\47\13\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "\1\u014c",
            "",
            "",
            "\1\47\13\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "",
            "\1\u014e",
            "\1\u014f",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0150",
            "\1\u0151",
            "\1\47\13\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "",
            "",
            "\1\u0153",
            "",
            "\1\47\13\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "\1\47\13\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "\1\47\13\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "\1\u0157",
            "",
            "\1\u0158",
            "",
            "",
            "",
            "\1\u0159",
            "\1\47\13\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "\1\47\13\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "",
            ""
    };

    static final short[] DFA37_eot = DFA.unpackEncodedString(DFA37_eotS);
    static final short[] DFA37_eof = DFA.unpackEncodedString(DFA37_eofS);
    static final char[] DFA37_min = DFA.unpackEncodedStringToUnsignedChars(DFA37_minS);
    static final char[] DFA37_max = DFA.unpackEncodedStringToUnsignedChars(DFA37_maxS);
    static final short[] DFA37_accept = DFA.unpackEncodedString(DFA37_acceptS);
    static final short[] DFA37_special = DFA.unpackEncodedString(DFA37_specialS);
    static final short[][] DFA37_transition;

    static {
        int numStates = DFA37_transitionS.length;
        DFA37_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA37_transition[i] = DFA.unpackEncodedString(DFA37_transitionS[i]);
        }
    }

    class DFA37 extends DFA {

        public DFA37(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 37;
            this.eot = DFA37_eot;
            this.eof = DFA37_eof;
            this.min = DFA37_min;
            this.max = DFA37_max;
            this.accept = DFA37_accept;
            this.special = DFA37_special;
            this.transition = DFA37_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( THIS | T__124 | T__125 | T__126 | T__127 | T__128 | T__129 | T__130 | T__131 | T__132 | T__133 | T__134 | T__135 | T__136 | T__137 | T__138 | T__139 | T__140 | T__141 | T__142 | T__143 | T__144 | T__145 | T__146 | T__147 | T__148 | T__149 | T__150 | T__151 | T__152 | T__153 | T__154 | T__155 | T__156 | T__157 | T__158 | T__159 | T__160 | T__161 | T__162 | T__163 | T__164 | T__165 | T__166 | T__167 | T__168 | T__169 | T__170 | T__171 | T__172 | T__173 | T__174 | T__175 | T__176 | T__177 | T__178 | T__179 | T__180 | T__181 | T__182 | T__183 | T__184 | T__185 | T__186 | T__187 | T__188 | T__189 | T__190 | T__191 | T__192 | T__193 | IDENT | HEX_LIT | OCT_LIT | REAL_LIT | INT_LIT | CHAR | STRING | WS | SL_COMMENT | INJECT | ML_COMMENT | SEMI | NL | ILLEGAL_CHARACTER | INC | PLUS | DEC | MINUS | ASSIGN | BIND | ADD_EQ | SUB_EQ | MUL_EQ | DIV_EQ | BITOR_EQ | BITXOR_EQ | BITAND_EQ | RSHFT_EQ | LSHFT_EQ | MOD_EQ | PEG | EQ | NOT_EQ | LT_EQ | GT_EQ | LOG_NOT | BIT_NOT | GT | LT | IJ_BEG | IJ_END );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA37_127 = input.LA(1);

                        s = -1;
                        if ( ((LA37_127 >= '\u0000' && LA37_127 <= '\uFFFF')) ) {s = 189;}

                        else s = 188;

                        if ( s>=0 ) return s;
                        break;

                    case 1 : 
                        int LA37_122 = input.LA(1);

                        s = -1;
                        if ( ((LA37_122 >= '\u0000' && LA37_122 <= '\t')||(LA37_122 >= '\u000B' && LA37_122 <= '\uFFFF')) ) {s = 184;}

                        if ( s>=0 ) return s;
                        break;

                    case 2 : 
                        int LA37_42 = input.LA(1);

                        s = -1;
                        if ( (LA37_42=='\\') ) {s = 122;}

                        else if ( ((LA37_42 >= '\u0000' && LA37_42 <= '\t')||(LA37_42 >= '\u000B' && LA37_42 <= '&')||(LA37_42 >= '(' && LA37_42 <= '[')||(LA37_42 >= ']' && LA37_42 <= '\uFFFF')) ) {s = 123;}

                        if ( s>=0 ) return s;
                        break;

                    case 3 : 
                        int LA37_123 = input.LA(1);

                        s = -1;
                        if ( (LA37_123=='\'') ) {s = 185;}

                        else if ( ((LA37_123 >= '\u0000' && LA37_123 <= '\t')||(LA37_123 >= '\u000B' && LA37_123 <= '&')||(LA37_123 >= '(' && LA37_123 <= '\uFFFF')) ) {s = 43;}

                        if ( s>=0 ) return s;
                        break;

                    case 4 : 
                        int LA37_184 = input.LA(1);

                        s = -1;
                        if ( (LA37_184=='\'') ) {s = 185;}

                        else if ( ((LA37_184 >= '\u0000' && LA37_184 <= '\t')||(LA37_184 >= '\u000B' && LA37_184 <= '&')||(LA37_184 >= '(' && LA37_184 <= '\uFFFF')) ) {s = 43;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 37, _s, input);
            error(nvae);
            throw nvae;
        }

    }
 

}