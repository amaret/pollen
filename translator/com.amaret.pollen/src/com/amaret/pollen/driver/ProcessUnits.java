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
	private static String workingDir = "";
	private static String pollenRoot = "";
	private static String pollenEnv = "";
	private static String pollenEnvPkg = "";
	private static boolean gccAvr = false;
	private static boolean asserts = false;
	
	public static boolean isAsserts() {
		return asserts;
	}
	public static void setAsserts(boolean asserts) {
		ProcessUnits.asserts = asserts;
	}
	public static boolean isGccAvr() {
		return gccAvr;
	}
	private static void setGccAvr(boolean gccAvr) {
		ProcessUnits.gccAvr = gccAvr;
	}
	public static String getPollenEnvPkg() {
		return pollenEnvPkg;
	}
	public static String getPollenEnv() {
		return pollenEnv;
	}
	public static String getWorkingDir() {
		if (workingDir.isEmpty())
			 workingDir = new File(".").getAbsolutePath();
		return workingDir;
	}
	public static String getPollenRoot() {
		return pollenRoot;
	}

	private static void setWorkingDir(String workingDir) {
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
	private String helpMessage() {

		String pollenHelp = "Usage: java -jar pollen.jar <options> <bundles> <pollen file>\nOptions include:";
		pollenHelp += "\n" + "  -o <directory>";
		pollenHelp += "\n" + "\tSpecifies output directory for pollen output. \n\tFor \'<path>/dir/pollenfile\' the default is \'<path>/dir_out.\'";
		pollenHelp += "\n" + "  -e <pollen path>";
		pollenHelp += "\n" + "\tSpecifies fully qualified path to a pollen module that will";
		pollenHelp += "\n" + "\tbe substituted for \'pollen.environment\' in import statements.";
		pollenHelp += "\n" + "  -h\tThis help message.";
		return pollenHelp;    
	}
	private static String  v = "0.2.31";  // user release . internal rev . fix number
	public static String version() {
		return "pollen version " + v;		
	}
	/**
	 * 
	 * @param args - bundles and pollen file, possible options
	 * @param errStream TODO
	 * @return a HashMap of packages <name, path>
	 * initialize working directory
	 */
	private Inputs getArgs(String[] args, PrintStream errStream) throws Exception {
		
		Inputs inputs = new Inputs();
		boolean setWorkingDir = false;
		String inputPath = "";

		String p = "";
		for (int i=0; i < args.length; i++) {
			p = args[i];
			if (p.equals("-o")) {
				// output directory
				String odir = (args.length > (++i) ? args[i] : "");
				if (odir.isEmpty())	
					continue;
				if (isRelativePath(odir))	
					odir = System.getProperty("user.dir" + File.separator + p);
				setWorkingDir = true;
				setWorkingDir(odir);
				continue;
			}
			if (p.equals("-h")) {
				System.out.println(this.helpMessage());
				System.exit(0); 
			}
			if (p.equals("-v")) {
				System.out.println(ProcessUnits.version());
				System.exit(0); 
			}
			if (p.equals("-e")) {
				String emod = (args.length > (++i) ? args[i] : "");
				if (emod.isEmpty())	
					continue;
				if (isRelativePath(emod))	
					emod = System.getProperty("user.dir" + File.separator + emod);
				if (!(new File(emod + ".p")).exists())
					throw new Termination ("Invalid -e usage: must specifiy a fully qualified module for pollen.environment");								
				pollenEnvPkg = this.putModule(inputs, emod);
				pollenEnv = emod.substring(emod.lastIndexOf(File.separator)+1);
				continue;
			}
			if (p.equals("-gccAvr")) { 	// UNDOCUMENTED, for testing: runs gccavr
				ProcessUnits.setGccAvr(true);
				continue;
			}
			if (p.equals("-a")) { 		// turns asserts on
				ProcessUnits.setAsserts(true);
				continue;
			}
			if (p.matches("-[A-z]+")) {
				errStream.printf("Unknown option \'%s\'. Option skipped (use \'-h\' for list of options).\n", p);
				continue;
			}

			if (this.isRelativePath(p)) {
				p = System.getProperty("user.dir") + File.separator + p;
			}
			// Is this arg the pollen file?
			String pollenFile = (p.endsWith(".p")) ? p : "";
			if (pollenFile.isEmpty()) {
				pollenFile = (new File(p + ".p")).exists() ? p + ".p" : "";
			}
			if (!pollenFile.isEmpty()) { // pollen file
				if (!inputs.pollenFile.isEmpty()) {
					throw new Termination ("Invalid inputs: translator accepts one pollen file and a set of bundles");					
				}				
				inputs.pollenFile = pollenFile;
				inputPath = pollenFile;
		        putModule(inputs, pollenFile);
				continue;
			}			
			// else 'p' is a bundle
			inputs.packages.putAll(this.getPackages(p));
			

		}
		if (!setWorkingDir && !inputPath.isEmpty()) { // initialize default working directory
			String wdir = inputPath.substring(0, inputPath.lastIndexOf(File.separator));
	        wdir = wdir.substring(0, wdir.lastIndexOf(File.separator));
	        wdir += '/' + ParseUnit.mkPackageName(inputPath) + "_out"; 
	        ProcessUnits.setWorkingDir(wdir);		
		}
		File dir = new File(getWorkingDir());
		dir.mkdirs();

		if (inputs.pollenFile.isEmpty() || inputs.packages.isEmpty()) {
			throw new Termination ("Invalid inputs: translator accepts one pollen file and a set of bundles");					
		}
		return inputs;
	}
	/**
	 * @param inputs
	 * @param fully qualified path of pollenFile
	 * @return package name
	 */
	private String putModule(Inputs inputs, String pollenFile) {
		int k = pollenFile.lastIndexOf(File.separatorChar);
		int j = pollenFile.lastIndexOf(File.separator, k-1);
		j = j == -1 ? 0 : j +1;
		String pkgName = pollenFile.substring(j, k);
		if (!inputs.packages.containsKey(pkgName)) {
			// add the package of the pollen file 
			inputs.packages.put(pkgName, pollenFile.substring(0,k));
		}
		return pkgName;
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
		
		Inputs files = this.getArgs(args, errorStream);

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
