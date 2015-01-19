package com.amaret.pollen.driver;

import com.amaret.pollen.parser.ParseUnit;

public class Driver {
	
	
	/**
	 * @param args - inputs (bundles and pollen files)
	 */
	public static void main(String[] args) {
		
		ProcessUnits pu = new ProcessUnits();
		int rtn = 0;
		
		try {
			ParseUnit.Times.startTime(ParseUnit.Time.POLLEN);
			rtn = pu.processUnits(args, System.out, System.err, System.out);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			if (ProcessUnits.isVerbose())
				e.printStackTrace(System.err);				
            System.exit(1);
		}
		System.exit(rtn);
		
	}

}
