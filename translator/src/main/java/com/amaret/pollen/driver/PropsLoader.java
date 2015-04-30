package com.amaret.pollen.driver;

import java.io.FileInputStream;
import java.io.PrintStream;
import java.util.Properties;

/**
 * @author lucidbee (Megan Adams)
 */

public class PropsLoader {

    public Properties apply(Properties props, String fileName, PrintStream errStream) {

        try {
            props.load(new FileInputStream(fileName));
        }
        catch (Exception e) {
            errStream.println(e.getMessage());
            return null;
        }
                              
        return props;
    }
    

}
