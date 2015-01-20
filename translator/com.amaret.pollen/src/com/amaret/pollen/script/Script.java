package com.amaret.pollen.script;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.JavaScriptException;
import org.mozilla.javascript.Scriptable;

import com.amaret.pollen.driver.ProcessUnits;
import com.amaret.pollen.parser.ParseUnit;

public class Script {

    static public Object execute(String prog, String result, String fileName) throws Exception {

        Context cx = Context.enter();
        cx.setOptimizationLevel(-1);
        Scriptable scope = cx.initStandardObjects();
        //ParseUnit.setDebugMode(false);
        if (ParseUnit.isDebugMode())
        	System.out.println("\n\nSCRIPT source: " + prog  + "\n\nfilename: " + fileName);
        
        try {
            cx.evaluateString(scope, prog, fileName, 1, null);
        }
        catch (Exception jse) {
        	if (ProcessUnits.isVerbose()) {
        		jse.printStackTrace();
        		ParseUnit.current().reportFailure("JavaScript termination: " + jse.getMessage());           		
        	}
        	ParseUnit.current().reportFailure(jse, "Termination due to errors encountered.");
            return null;
        }
        if (ParseUnit.isDebugMode())
        	System.out.println("\n\n SCRIPT result: " + result + "\n\nfilename: " + fileName);
        //ParseUnit.setDebugMode(false);


        return Value.toVal(scope.get(result, scope));
    }
    
}
