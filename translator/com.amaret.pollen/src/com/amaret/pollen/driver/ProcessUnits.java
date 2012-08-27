package com.amaret.pollen.driver;

import java.io.File;
import java.io.FilenameFilter;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;

import com.amaret.pollen.parser.ParseUnit;
import com.amaret.pollen.parser.SymbolTable;
import com.amaret.pollen.parser.UnitNode;

public class ProcessUnits {
	private SymbolTable symbolTable;

	String inputPath = "";

	@SuppressWarnings("serial")
	static public class Termination extends RuntimeException {
		public Termination(String msg) {
			super(msg);
		}
		public Termination() {
			super();
		}
	}

	/**
	 * 
	 * @param path
	 * @return true if relative path else false
	 */
	private boolean isRelativePath(String path) {
		boolean relativePath = false;

		if (File.separatorChar == '\\') { // windows
			relativePath = !path.matches(".*:\\\\.*");
		}
		else {
			relativePath = path.charAt(0) != File.separatorChar && path.charAt(0) != '.';
		}
		return relativePath;
	}
	/**
	 * 
	 * @param path - a absolute path for a bundle
	 * @return a HashMap of (package name, package path)
	 */
	private HashMap<String, String> getPackages(String path) {

		File bundle = new File(path);

		HashMap<String, String>	map = new HashMap<String, String>();					

		FilenameFilter filter = new FilenameFilter() {
			public boolean accept(File pathname, String s) {
				File f = new File(pathname.getAbsolutePath() + File.separator + s);
				if (f.isDirectory())
					return true;
				return false;
			}
		};
		String[] pkgs = bundle.list(filter);
		if (pkgs != null) {
			for (int i=0; i< pkgs.length; i++) {
				if (!map.containsKey(pkgs[i]))
					map.put(pkgs[i], path + File.separator + pkgs[i]);		
			}			
		}	
		return map;
	}
	/**
	 * Inputs: a pollen file and a HashMap of packages <name, path>
	 * @author lucidbee
	 *
	 */
	class Inputs {
		String pollenFile = "";
		HashMap<String, String> packages = new HashMap<String, String>();
	}
	/**
	 * 
	 * @param args - bundles and pollen file
	 * @return a HashMap of packages <name, path>
	 */
	private Inputs getInputs(String[] args) throws Exception {
		
		Inputs inputs = new Inputs();

		String p = "";
		for (int i=0; i < args.length; i++) {
			p = args[i];
			if (this.isRelativePath(p)) {
				p = System.getProperty("user.dir") + File.separator + p;
			}
			if (p.endsWith(".p")) { // pollen file
				if (!inputs.pollenFile.isEmpty()) {
					throw new Termination ("Invalid inputs: translator accepts one pollen file and a set of bundles");					
				}
				inputs.pollenFile = p;
				continue;
			}			
			// else 'p' is a bundle
			inputs.packages.putAll(this.getPackages(p));
			
	        int k = p.lastIndexOf('.');
	        int j = p.lastIndexOf(".", k-1);
	        j = j == -1 ? 0 : j +1;
	        String pname = p.substring(j, k);
	        if (!inputs.packages.containsKey(pname)) {
	        	// add the package of the pollen file 
	        	inputs.packages.put(pname, p.substring(0,k));
	        }
		}
		if (inputs.pollenFile.isEmpty() || inputs.packages.isEmpty()) {
			throw new Termination ("Invalid inputs: translator accepts one pollen file and a set of bundles");					
		}
		return inputs;
	}
	/**
	 * Parse the pollen file and all its dependencies (imports). 
	 * @param args
	 * @param outputStream
	 * @param errorStream
	 * @param infoStream
	 * @param symtab
	 * @return a HashMap of unit names and unit nodes.
	 * @throws Exception
	 */
	protected HashMap<String, UnitNode> parseUnit(
			String[] args,
			PrintStream outputStream,
			PrintStream errorStream,
			PrintStream infoStream, 
			SymbolTable symtab) throws Exception {
		
		Inputs files = this.getInputs(args);

		ParseUnit.initParse(files.pollenFile, files.packages, outputStream, errorStream, infoStream, symtab);

		return ParseUnit.current().parseUnits();
	}
	protected void translateUnit(HashMap<String, UnitNode> unitMap) {
		
		if (ParseUnit.current().getErrorCount() == 0) {
			UnitNode curUnit = ParseUnit.current().getCurrUnitNode();
			com.amaret.pollen.translator.Generator.genUnits(curUnit, unitMap);
		}
		
	}
	/**
	 * Entry to translator.
	 * @param args 
	 * @param outputStream
	 * @param errorStream
	 * @param infoStream
	 */
	public void processUnits(
			String[] args,
			PrintStream outputStream,
			PrintStream errorStream,
			PrintStream infoStream) throws Exception {

		SymbolTable symbolTable = new SymbolTable();

		HashMap<String, UnitNode> unitNodes;

		unitNodes = this.parseUnit(args, outputStream, infoStream, errorStream, symbolTable);
		
		this.translateUnit(unitNodes);



	}

}
