package com.amaret.pollen.driver;

public class Driver {
	
	
	/**
	 * @param args - inputs (bundles and pollen files)
	 */
	public static void main(String[] args) {
		
		ProcessUnits pu = new ProcessUnits();
		
		try {
			
			pu.processUnits(pu.setupInputs(args), System.out, System.err, System.err);
			
		} catch (Exception e) {
			System.err.println("" + e);
            e.printStackTrace(System.err);
            System.exit(1);
		}
		
	}

}
