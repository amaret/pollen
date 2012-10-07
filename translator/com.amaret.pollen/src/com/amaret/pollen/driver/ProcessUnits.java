package com.amaret.pollen.driver;

import java.io.File;
import java.io.FilenameFilter;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Properties;

import com.amaret.pollen.parser.ParseUnit;
import com.amaret.pollen.parser.SymbolTable;
import com.amaret.pollen.parser.UnitNode;
import com.amaret.pollen.parser.ParseUnit.Property;
import com.amaret.pollen.translator.Generator;

public class ProcessUnits {
	private static String workingDir = new File(".").getAbsolutePath();
	private static String pollenRoot = "";
	
	public static String getWorkingDir() {
		return workingDir;
	}
	public static String getPollenRoot() {
		return pollenRoot;
	}

	public static void setWorkingDir(String workingDir) {
		ProcessUnits.workingDir = workingDir;
	}

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
		
		// TODO finalize pollenRoot when migration to 'real pollen' is complete		
		String bundleName = path.substring(path.lastIndexOf(File.separator)+1);
		if (pollenRoot.isEmpty()
				&& (bundleName.equals("pollen.core")					// OLD
					|| bundleName.equals("pollen.api")))		// NEW (I think)
			pollenRoot = path;
	

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
		        int k = p.lastIndexOf(File.separatorChar);
		        int j = p.lastIndexOf(File.separator, k-1);
		        j = j == -1 ? 0 : j +1;
		        String pname = p.substring(j, k);
		        if (!inputs.packages.containsKey(pname)) {
		        	// add the package of the pollen file 
		        	inputs.packages.put(pname, p.substring(0,k));
		        }
				continue;
			}			
			// else 'p' is a bundle
			inputs.packages.putAll(this.getPackages(p));
			

		}
		if (inputs.pollenFile.isEmpty() || inputs.packages.isEmpty()) {
			throw new Termination ("Invalid inputs: translator accepts one pollen file and a set of bundles");					
		}
		return inputs;
	}
	/**
	 * Parse the pollen file and all its dependencies (imports). 
	 * @param args
	 * @param props TODO
	 * @param outputStream
	 * @param errorStream
	 * @param infoStream
	 * @param symtab
	 * @return a HashMap of unit names and unit nodes.
	 * @throws Exception
	 */
	protected HashMap<String, UnitNode> parseUnit(
			String[] args,
			Properties props,
			PrintStream outputStream,
			PrintStream errorStream, 
			PrintStream infoStream, SymbolTable symtab) throws Exception {
		
		Inputs files = this.getInputs(args);

		ParseUnit.initParse(files.pollenFile, props, files.packages, outputStream, errorStream, infoStream, symtab);

		return ParseUnit.current().parseUnits();
	}
	protected int translateUnit(HashMap<String, UnitNode> unitMap) throws Exception {
		
		
		int rtn = ParseUnit.current().getErrorCount();
		if (rtn == 0) {
			UnitNode curUnit = ParseUnit.current().getCurrUnitNode();
			Generator g = new Generator();
			g.genUnits(curUnit, unitMap);
			
            if (ParseUnit.current().getErrorCount() > 0) {
                return 1;
            }
            
            g.genProg(curUnit);
            
            if (ParseUnit.current().getErrorCount() > 0) {
                return 1;
            }
            return 0;            
		}
		return 1;		
	}
	/**
	 * Entry to translator.
	 * @param args 
	 * @param outputStream
	 * @param errorStream
	 * @param infoStream
	 */
	public int processUnits(
			String[] args,
			PrintStream outputStream,
			PrintStream errorStream,
			PrintStream infoStream) throws Exception {

		SymbolTable symbolTable = new SymbolTable();

		HashMap<String, UnitNode> unitNodes;
		
        Properties props = new Properties();

        for (Property p : Property.values()) {
            String val = System.getenv(p.name());
            if (val == null) {
                System.err.println("pollen.ParseUnit: undefined environment variable: " + p.name());
                System.exit(1);
            }
            props.setProperty(p.name(), val);
            if (p.name().equals("POLLEN_ROOT"))
            	pollenRoot = val;
        }

        
        props = new PropsLoader().apply(props, pollenRoot + File.separator + "props", System.err);
        if (props == null) {
            System.exit(1);
        }

		unitNodes = this.parseUnit(args, props, outputStream, infoStream, errorStream, symbolTable);
		
		return this.translateUnit(unitNodes);



	}

}
