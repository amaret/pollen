package com.amaret.pollen.translator;

import java.io.File;
import java.util.Set;

import com.amaret.pollen.driver.ProcessUnits;
import com.amaret.pollen.parser.ParseUnit;
import com.amaret.pollen.parser.UnitNode;

public class ProgJScript {

    private Generator gen;

    public ProgJScript(Generator gen) {
        this.gen = gen;
    }

    public void generateProgJS(Set<UnitNode> uses, UnitNode main) {
        
        gen.aux.setHost(true);

        genPrologue();
        includeUnits(uses);

        genEpilogue(main);
    }

    void includeUnits(Set<UnitNode> uses) {
        for (UnitNode unit : uses) {
            if (unit.isModule() || unit.isClass() || unit.isEnum() || unit.isComposition() || unit.isProtocol()) {
    	        boolean saveDbg = ParseUnit.isDebugMode();
    	        ParseUnit.setDebugMode(false);
    			if (ParseUnit.isDebugMode()) {	
    				System.out.println("\nincludeUnits() (javascript) for " + unit.getQualName());
    			}
    	        ParseUnit.setDebugMode(saveDbg);
                
				File file = ParseUnit.cacheFile(unit.getQualName(), ".js");
				if (file.exists())
					gen.getFmt().insert(file);
            }
        }
    }

    private void genEpilogue(UnitNode main) {
        gen.aux.genTitle("epilogue");
        gen.getFmt().print("$units['%1'].pollen$used = true;\n\n", main.getQualName());
        File file = new File(ProcessUnits.getPollenRoot() + "/pollen.lang/epilogue.js");
        gen.getFmt().insert(file);
    }

    private void genPrologue() {
        gen.aux.genTitle("prologue");
        File file = new File(ProcessUnits.getPollenRoot());
        file.mkdirs();
        file = new File(ProcessUnits.getPollenRoot() + "/pollen.lang/prologue.js");
        file.mkdirs();
        gen.getFmt().insert(file);
    }
    
}
