// Copyright Amaret, Inc 2011-2015
// See https://github.com/amaret/pollen/blob/master/LICENSE

package com.amaret.pollen.driver;

import java.io.FileInputStream;
import java.io.PrintStream;
import java.util.Properties;

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
