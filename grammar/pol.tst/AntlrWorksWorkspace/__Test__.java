import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.debug.DebugEventSocketProxy;


public class __Test__ {

    public static void main(String args[]) throws Exception {
        polLexer lex = new polLexer(new ANTLRFileStream("/home/lucidbee/Documents/Grammar_Sample/pol.tst/t.p", "UTF8"));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        polParser g = new polParser(tokens, 49100, null);
        try {
            g.unit();
        } catch (RecognitionException e) {
            e.printStackTrace();
        }
    }
}