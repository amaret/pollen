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

    public void generate(Set<UnitNode> uses, UnitNode main) {
        
        gen.aux.setHost(true);

        genPrologue();
        includeUnits(uses);

        genEpilogue(main);
    }

    void includeUnits(Set<UnitNode> uses) {
        for (UnitNode unit : uses) {
            if (unit.isModule() || unit.isClass() || unit.isEnum()) {
            	if (ParseUnit.isDebugMode())
            		System.out.println("   INCLUDE .js for " + unit.getQualName());
                ParseUnit.current();
				File file = ParseUnit.cacheFile(unit.getQualName(), ".js");
				if (file.exists())
					gen.fmt.insert(file);
            }
        }
    }

    private void genEpilogue(UnitNode main) {
        gen.aux.genTitle("EPILOGUE");
        gen.fmt.print("$units['%1'].pollen$used = true;\n\n", main.getQualName());
        File file = new File(ProcessUnits.getPollenRoot() + "/pollen.lang/epilogue.js");
        gen.fmt.insert(file);
    }

    private void genPrologue() {
        gen.aux.genTitle("PROLOGUE");
        File file = new File(ProcessUnits.getPollenRoot());
        file.mkdirs();
        file = new File(ProcessUnits.getPollenRoot() + "/pollen.lang/prologue.js");
        file.mkdirs();
        gen.fmt.insert(file);
    }
    
}
