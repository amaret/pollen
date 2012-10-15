package com.amaret.pollen.driver;

public class Driver {
	
	
	/**
	 * @param args - inputs (bundles and pollen files)
	 */
	public static void main(String[] args) {
		
		ProcessUnits pu = new ProcessUnits();
		int rtn = 0;
		
		try {
			
			rtn = pu.processUnits(args, System.out, System.err, System.err);
			
		} catch (Exception e) {
			System.err.println("" + e);
            e.printStackTrace(System.err);
            System.exit(1);
		}
		System.exit(rtn);
		
	}

}
