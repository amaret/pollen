package com.amaret.pollen.driver;

import java.io.File;
import java.io.FileInputStream;
import java.io.PrintStream;
import java.util.HashSet;
import java.util.Properties;
import java.util.Set;

import com.amaret.pollen.parser.ParseUnit.Property;

public class PropsLoader {

    public Properties apply(Properties props, String fileName, PrintStream errStream) {

        try {
            props.load(new FileInputStream(fileName));
        }
        catch (Exception e) {
            errStream.println(e.getMessage());
            return null;
        }
                
        
        String pollenPath = props.getProperty(Property.POLLEN_ROOT.name());
        if (pollenPath == null) {
            errStream.println("POLLEN_ROOT must be defined");
            return null;
        }
              
        return props;
    }
    

}
