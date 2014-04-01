package com.amaret.pollen.driver;

import java.io.File;
import java.io.FilenameFilter;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Properties;

import antlr.CommonToken;

import com.amaret.pollen.parser.Flags;
import com.amaret.pollen.parser.ParseUnit;
import com.amaret.pollen.parser.ParseUnit.Property;
import com.amaret.pollen.parser.SymbolTable;
import com.amaret.pollen.parser.UnitNode;
import com.amaret.pollen.translator.Generator;

public class ProcessUnits {
	private static String workingDir = "";
	private static String pollenRoot = "";
	private static String pollenEnv = "";
	private static String pollenEnvPkg = "";
	private static String pollenPrint = "";
	private static String pollenPrintPkg = "";
	private static String pollenPrintProxyModule = ""; // where it is
	private static boolean pollenPrintBindSeen = false;
	private static boolean gccAvr = false;
	private static boolean asserts = false;
	private static boolean warnings = false;
	private static boolean dashPoption = false;
	
	public static boolean isDashPoption() {
		return dashPoption;
	}
	public static void setDashPoption(boolean dashPoption) {
		ProcessUnits.dashPoption = dashPoption;
	}
	/**
	 * 
	 * @return the <package.module> in which the print intrinsic is set.
	 */
	public static String getPollenPrintProxyModule() {
		return pollenPrintProxyModule;
	}
	/**
	 * This is the module in which the print intrinsic is initialized.
	 * Set in parser. 
	 * @param pollenPrintProxyModule
	 */
	public static void setPollenPrintProxyModule(String pollenPrintProxyModule) {
		ProcessUnits.pollenPrintProxyModule = pollenPrintProxyModule;
	}
	public static boolean isAsserts() {
		return asserts;
	}
	public static void setAsserts(boolean asserts) {
		ProcessUnits.asserts = asserts;
	}
	public static boolean isWarnings() {
		return warnings;
	}
	public static void setWarnings(boolean warnings) {
		ProcessUnits.warnings = warnings;
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
	public static void setPollenPrint(String pollenPrint) {
		ProcessUnits.pollenPrint = pollenPrint;
	}
	public static String getPollenPrint() {
		return pollenPrint;
	}
	public static boolean doImportPrintImpl() {
		if (pollenPrint.isEmpty())
			return false;
		boolean currFileIsPrintImpl = ParseUnit.current().getFileName()
				.equals(pollenPrint + ".p");
		if (isDashPoption() && ParseUnit.current().isParseToplevel() 
				&& !currFileIsPrintImpl)
			return true;
		return false;
	}
	public static boolean doImportPrintProtocol() {
		if (isDashPoption()) {
			if (ParseUnit.current().isParseToplevel())
				return true;
			return false;
		}
		// if not using -p, the bind can occur anywhere so we import it for all valid units.
//		boolean scopeOk = !(ParseUnit.current().getParseUnitFlags()
//				.contains(Flags.ENUM) || ParseUnit.current()
//				.getParseUnitFlags().contains(Flags.PROTOCOL));
		boolean currFileIsPrintProtocol = ParseUnit.current().getFileName()
				.equals(ParseUnit.INTRINSIC_PRINT_PROTOCOL + ".p");
		if (!currFileIsPrintProtocol)
			return true; 
		return false;
	}
	public static boolean isPollenPrintBindSeen() {
		return pollenPrintBindSeen;
	}
	public static void setPollenPrintBindSeen(boolean pollenPrintBindSeen) {
		ProcessUnits.pollenPrintBindSeen = pollenPrintBindSeen;
	}
	/**
	 * This is the intrinsic protocol member which will be used in the emitted print methods.
	 * Generate if '-p' specifies a print implementation.
	 * @return
	 */
	public static boolean doEmitPrintProxyViaDashP() {
		boolean scopeOk = ParseUnit.current().getParseUnitFlags().contains(Flags.MODULE);
		return (!pollenPrint.isEmpty() && isDashPoption() && scopeOk && ParseUnit.current().isParseToplevel());
	}
	/**
	 * This is the intrinsic protocol member which will be used in the emitted print methods.
	 * Generate if a binding 'printProtocol := <mod>' was seen.
	 * @return
	 */
	public static boolean doEmitPrintProxyViaBind() {
		boolean scopeOk = (ParseUnit.current().getParseUnitFlags().contains(Flags.MODULE)
				|| ParseUnit.current().getParseUnitFlags().contains(Flags.COMPOSITION) 
				|| ParseUnit.current().getParseUnitFlags().contains(Flags.CLASS))
				&& !ParseUnit.current().isUnitUnderConstructionNested();
		return (ProcessUnits.isPollenPrintBindSeen() && scopeOk);
	}
	public static String getPollenPrintPkg() {
		return pollenPrintPkg;
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
	 * @param bundlePath - a absolute path for a bundle
	 * @return a HashMap of (package name, package path)
	 */
	private HashMap<String, String> getPackages(final String bundlePath) {
		
		String bundleName = bundlePath.substring(bundlePath.lastIndexOf(File.separator)+1);
		if (pollenRoot.isEmpty()
				&& (bundleName.equals("pollen-core") /* new */ || bundleName.equals("pollen.core") /* old */ ))	
			pollenRoot = bundlePath;
	

		File bundle = new File(bundlePath);

		HashMap<String, String>	map = new HashMap<String, String>();	
		
		final FilenameFilter pollenFileFilter = new FilenameFilter() {
			public boolean accept(File pathname, String s) {
				// filter the case that we have <bundle>/<pollenfile> when <bundle>/<package>/<pollenfile> is required.
				if (s.endsWith(".p") && bundlePath.equals(pathname))
					return true;
				return false;
			}			
		};

		FilenameFilter filter = new FilenameFilter() {
			public boolean accept(File pathname, String s) {
				
				File f = new File(pathname.getAbsolutePath() + File.separator + s);
				if (f.isDirectory()) { 
					String[] pollenfiles = f.list(pollenFileFilter);
					if (pollenfiles.length > 0) {
						// a bundle contains a pollen file: should only contain packages
						throw new Termination ("Invalid inputs: bundle \'" + s + "\' contains pollen file(s). Bundles should only contain packages.");					
					}
					return true;
				}
				return false;
			}
		};
		String[] pkgs = bundle.list(filter);
		if (pkgs != null) {
			for (int i=0; i< pkgs.length; i++) {
				if (!map.containsKey(pkgs[i])) {
					map.put(pkgs[i], bundlePath + File.separator + pkgs[i]);	
				}
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

		String pollenHelp = "Usage: java -jar pollen.jar <options> <bundles> <pollen file> // input files can be in any order \nOptions include:";
		pollenHelp += "\n" + "  -o <directory>";
		pollenHelp += "\n" + "\tSpecifies output directory for pollen output. \n\tFor \'<path>/dir/pollenfile\' the default is \'<path>/dir_out.\'";
		pollenHelp += "\n" + "  -e <pollen path>";
		pollenHelp += "\n" + "\tSpecifies fully qualified path to a pollen module that will";
		pollenHelp += "\n" + "\tbe substituted for \'pollen.environment\' in import statements.";
		pollenHelp += "\n" + "  -p <pollen path>";
		pollenHelp += "\n" + "\tSpecifies fully qualified path to a pollen module that will";
		pollenHelp += "\n" + "\timplement the protocol \'PrintProtocol.p\'.";
		pollenHelp += "\n" + "  -h\tThis help message.";
		pollenHelp += "\n" + "  -w\tOutput warning messages. (Otherwise suppressed.)";

		return pollenHelp;    
	}
	private static String  v = "0.2.81";  // user release . internal rev . fix number
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
			if (p.equals("-p")) {
				String emod = (args.length > (++i) ? args[i] : "");
				if (emod.isEmpty())	
					continue;
				if (isRelativePath(emod))	
					emod = System.getProperty("user.dir" + File.separator + emod);
				if (!(new File(emod + ".p")).exists())
					throw new Termination ("Invalid -p usage: must specifiy a fully qualified module for pollen.print");								
				pollenPrintPkg = this.putModule(inputs, emod);
				setPollenPrint(emod.substring(emod.lastIndexOf(File.separator)+1));
				setDashPoption(true);
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
			if (p.equals("-w")) { 		// turns warnings on
				ProcessUnits.setWarnings(true);
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
		
		ParseUnit cur = ParseUnit.current();
		
		int rtn = ParseUnit.current().getCurrUnitNode().getErrorCount();
		if (rtn == 0) {
			UnitNode curUnit = ParseUnit.current().getCurrUnitNode();
			Generator g = new Generator();
			g.genUnits(curUnit, unitMap); // js and c body
			
            if (ParseUnit.current().getCurrUnitNode().getErrorCount() > 0) {
                return 1;
            }
            
            g.genProgFiles(curUnit); // prog.js, prog.c
            
            g.genUnitHeaders(curUnit, unitMap); // last to initialize some host variables (e.g. array dimensions)
            
            g.compile();
            
            if (ParseUnit.getSeriousErrorCount() > 0) {
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
