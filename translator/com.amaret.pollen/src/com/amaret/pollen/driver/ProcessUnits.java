package com.amaret.pollen.driver;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FilenameFilter;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;

import antlr.CommonToken;

import com.amaret.pollen.parser.BaseNode;
import com.amaret.pollen.parser.ExprNode;
import com.amaret.pollen.parser.Flags;
import com.amaret.pollen.parser.ParseUnit;
import com.amaret.pollen.parser.ParseUnit.Property;
import com.amaret.pollen.parser.SymbolTable;
import com.amaret.pollen.parser.UnitNode;
import com.amaret.pollen.target.ITarget;
import com.amaret.pollen.translator.Generator;

public class ProcessUnits {
	private static String workingDir = "";
	private static String pollenRoot = "";
	private static String pollenTarget = "";
	private static String pollenBundles = "";
	private static String pollenEnv = "";
	private static String pollenEnvPkg = "";
	private static String pollenOutputDefault = ""; // if no -p get it from the bundles dir
	private static String pollenPrint = "";
	private static String pollenPrintPkg = "";
	private static String pollenPrintProxyModule = ""; // where it is
	private static String propsOption = "";
	private static String cFlags="";
	private static String mcu="";
	private static boolean pollenPrintBindSeen = false;
	private static boolean asserts = false;
	private static boolean warnings = false;
	private static boolean dashPoption = false;
	private static boolean verbose = false;
	private static boolean isCompatibilityMode = false;
	/**
	 * More information should be generated. E.g. stack traces.
	 * @return
	 */
	public static boolean isVerbose() {
		return verbose;
	}
	public static void setVerbose(boolean verbose) {
		ProcessUnits.verbose = verbose;
	}
	public static String getPropsOption() {
		return propsOption;
	}
	private static void setPropsOption(String propsFile) {
		ProcessUnits.propsOption = propsFile;
	}
	public static String getMcu() {
		return mcu;
	}
	private static void setMcu(String mcu) {
		ProcessUnits.mcu = mcu;
	}
	private enum CCompiler { NONE, LOCALHOST, AVR, EFM32, MSP430, ARM };
	static private EnumSet<CCompiler> cCompiler = EnumSet.of(CCompiler.NONE);
	static private final String TARGET_PREFIX = "pollen.target.gcc.";
	@SuppressWarnings("serial")
	private static HashMap<CCompiler, String > targets = new HashMap<CCompiler, String>(){{
        put(CCompiler.ARM, TARGET_PREFIX+"arm");
        put(CCompiler.AVR, TARGET_PREFIX+"avr");
        put(CCompiler.EFM32, TARGET_PREFIX+"efm32");
        put(CCompiler.MSP430, TARGET_PREFIX+"msp430");
        put(CCompiler.LOCALHOST, TARGET_PREFIX+"localhost");
        put(CCompiler.NONE, TARGET_PREFIX+"NOT_SUPPORTED");
    }};
	private static HashMap<CCompiler, String > tools_prefix = new HashMap<CCompiler, String>(){{
        put(CCompiler.ARM, "arm-none-eabi-");
        put(CCompiler.AVR, "avr-");
        put(CCompiler.EFM32, "arm-none-eabi-");
        put(CCompiler.MSP430, "msp430-");
        put(CCompiler.LOCALHOST, "");
        put(CCompiler.NONE, "NOT_SUPPORTED");
    }};

	public static boolean isDashPoption() {
		return dashPoption;
	}
	private static boolean isCompatibilityMode() {
		return isCompatibilityMode;
	}
	private static void setCompatibilityMode(boolean isCompatibilityMode) {
		ProcessUnits.isCompatibilityMode = isCompatibilityMode;
	}
	public static String getcFlags() {
		return cFlags;
	}
	private static void setcFlags(String cFlags) {
		ProcessUnits.cFlags = cFlags;
	}
	private static void setDashPoption(boolean dashPoption) {
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
	private static void setAsserts(boolean asserts) {
		ProcessUnits.asserts = asserts;
	}
	public static boolean isWarnings() {
		return warnings;
	}
	private static void setWarnings(boolean warnings) {
		ProcessUnits.warnings = warnings;
	}
	/**
	 * 
	 * @param cf an EnumSet containing the CCompiler flag to be checked.
	 * @return true if that compiler is the current target compiler
	 */
	public static boolean isTargetCompiler(EnumSet<CCompiler> cf) {
		if (cf.contains(CCompiler.ARM))
			return cCompiler.contains(CCompiler.ARM);
		if (cf.contains(CCompiler.AVR))
			return cCompiler.contains(CCompiler.AVR);
		if (cf.contains(CCompiler.LOCALHOST))
			return cCompiler.contains(CCompiler.LOCALHOST);
		if (cf.contains(CCompiler.MSP430))
			return cCompiler.contains(CCompiler.MSP430);
		if (cf.contains(CCompiler.EFM32))
			return cCompiler.contains(CCompiler.EFM32);
		return false;
	}

	private static void setTargetCompiler(CCompiler flag) {
		if (cCompiler.contains(CCompiler.NONE)) {
			cCompiler.remove(CCompiler.NONE);
			cCompiler.add(flag);
		}
		else if (cCompiler.contains(flag)) {
			return; // same option value, > once.
		}
		else {
			throw new Termination("multiple C compiler targets specified on the command line");
		}
	}

	private static String getPropsFileName(boolean isCompatibilityMode,
			Properties props) {
		String file = "";
		String f = getPropsOption();
		if (!f.isEmpty()) // specified on command line
			file = f;
		else {
			String target_props = "";
			if (cCompiler.contains(CCompiler.NONE))
				return null; // no props file
			else
				for (CCompiler c : cCompiler) {
					target_props = targets.get(c) + File.separator;
				}
			if (!isCompatibilityMode) {
				file = ProcessUnits.getPollenTarget() + File.separator
						+ target_props + "props";
			} else {
				file = props.getProperty(Property.POLLEN_ROOT.name())
						+ File.separator + target_props + "props";
			}
		}
		if (new File(file).exists())
			return file;
		else {
			throw new Termination("Invalid input: props file \'" + file
					+ "\' does not exist");
		}
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
	public static String getPollenTarget() {
		return pollenTarget;
	}
	private static void setPollenTarget(String pollenTarget) {
		ProcessUnits.pollenTarget = pollenTarget;
	}
	public static String getPollenBundles() {
		return pollenBundles;
	}
	private static void setPollenBundles(String pollenBundles) {
		ProcessUnits.pollenBundles = pollenBundles;
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
	private List<String> packageNames = new ArrayList<String>();
	/**
	 * 
	 * @param bundlePath - a absolute path for a bundle
	 * @return a HashMap of (package name, package path)
	 */
	private HashMap<String, String> getPackages(final String bundlePath) {
		
		String bundleName = bundlePath.substring(bundlePath.lastIndexOf(File.separator)+1);
		
		// later pollenRoot is set from the environment variable - this is irrelevant
//		if (pollenRoot.isEmpty()
//				&& (bundleName.equals("pollen-core") /* new */ || bundleName.equals("pollen.core") /* old */ ))	
//			pollenRoot = bundlePath;

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
				if (!packageNames.contains(pkgs[i]))
					packageNames.add(pkgs[i]);
				else {
					throw new Termination ("Invalid input: encountered package \'" + pkgs[i] + "\' in more than one bundle. Duplicate package names are illegal.");					
				}
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

		String pollenHelp = "USAGE: java -jar pollen.jar <options> <bundles> <pollen file>"; 
        pollenHelp += "\n\n" + " Input files can be in any order.";
        pollenHelp += "\n" + " For pollen file \"Test.p\" the C output name will be \"Test-prog.<suffix>\".";
        pollenHelp += "\n" + " Note that <suffix> can vary depending on the selected target.";
        pollenHelp += "\n" + " $POLLEN_TARGET is the root directory for target properties files.";
        pollenHelp += "\n" + " Bundles can be specified with \'@<bundle name>\' where '@' expands \n to the value of $POLLEN_BUNDLES.";
        pollenHelp += " Note that the translator requires that \n $POLLEN_TARGET be specified whereas $POLLEN_BUNDLES is optional.";
		pollenHelp += "\n" + "";
		pollenHelp += "\nOPTIONS:";
		pollenHelp += "\n" + "  -cFlags \"<flags>\"";
		pollenHelp += "\n" + "\tSpecifies additional flags to be passed to the target C compiler.";
		pollenHelp += "\n" + "\tThe default set of C compiler flags is specified in the properties";
		pollenHelp += "\n" + "\tfile for the target (found in the $POLLEN_TARGET directory).";
		pollenHelp += "\n" + "  -e <pollen path>";
		pollenHelp += "\n" + "\tSpecifies fully qualified path to a pollen module that will be";
		pollenHelp += "\n" + "\tsubstituted for \'pollen.environment\' in import statements.";
		pollenHelp += "\n" + "  -h\tThis help message.";
		pollenHelp += "\n" + "  -mcu\tSpecify mcu type.";
		pollenHelp += "\n" + "  -o <directory>";
		pollenHelp += "\n" + "\tSpecifies output directory for pollen output. \n\tFor \'<path>/dir/pollenfile\' the default is \'<path>/dir_out.\'";
		pollenHelp += "\n" + "  -p <pollen path>";
		pollenHelp += "\n" + "\tSpecifies fully qualified path to a pollen module that will";
		pollenHelp += "\n" + "\timplement the protocol \'PrintProtocol.p\'.";
		pollenHelp += "\n" + "  -props <pollen path>";
		pollenHelp += "\n" + "\tSpecifies fully qualified path to a properties file for a \n\ttarget hardware platform. Default properties files are";
		pollenHelp += "\n" + "\tfound under the directory specified by $POLLEN_TARGET.";
        pollenHelp += "\n" + "  -t <target platform and C compiler>";
        pollenHelp += "\n" + "\tThe translator will build the output using the compiler and";
        pollenHelp += "\n" + "\tplatform specified. A properties file for the platform must";
        pollenHelp += "\n" + "\tbe available either under $POLLEN_TARGET or at the location";
        pollenHelp += "\n" + "\tspecified by the '-props <path>' option. The available";
        pollenHelp += "\n" + "\tplatforms and their compilers are:";
        pollenHelp += "\n" + "\t    arm-none-eabi-gcc  gcc for arm";
        pollenHelp += "\n" + "\t    avr-gcc            gcc for avr";
        pollenHelp += "\n" + "\t    efm32-gcc          gcc for efm32";  
        pollenHelp += "\n" + "\t    localhost-gcc      gcc for localhost";
        //pollenHelp += "\n" + "\t    msp430-gcc         gcc for msp430"; in but undoc
        pollenHelp += "\n" + "\tIf no '-t' option is specified only C files are produced.";  
 		pollenHelp += "\n" + "  -v\tOutput translator version and exit.";
 		pollenHelp += "\n" + "  -verbose";
 		pollenHelp += "\n" + "  \tVerbose output.";
 		pollenHelp += "\n" + "  -w\tOutput warning messages. (Otherwise suppressed.)";

		return pollenHelp;    
	}
	private static String  v = "0.2.125";  // user release . internal rev . fix number
	public static String version() {
		return "pollen version " + v;		
	}
	/**
	 * If a pollen file supplied on the command line has .p suffix, strip it. 
	 * @param filename.p
	 * @return filename
	 */
	private String stripSuffix(String value) {
		if (value == null)
			return "";
		int suf = value.lastIndexOf(".p");
		if (suf != -1 && value.substring(suf).equals(".p")) {
			value = value.substring(0, value.lastIndexOf(".p"));
		}	
		return value;
	}

	/**
	 * @param args - bundles and pollen file, possible options
	 * @param errStream TODO
	 * @return a HashMap of packages <name, path>
	 * initialize working directory
	 */
	private Inputs getArgs(String[] args, PrintStream errStream) throws Exception {
		
		Inputs inputs = new Inputs();
		boolean setWorkingDir = false;
		String inputPath = "";
		String value = ""; 

		String p = "";
		for (int i=0; i < args.length; i++) {
			p = args[i];
			if (p.equals("-o")) {
				// output directory
				String odir = (args.length > (++i) ? args[i] : "");
				if (odir.isEmpty())	
					continue;
				odir = getPath(odir, p, errStream);	
				if (odir == null)
					continue;				
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
				value = (args.length > (++i) ? args[i] : "");
				if (value.isEmpty())	
					continue;
				value = getPath(value, p, errStream);	
				value = stripSuffix(value);
				if (!(new File(value + ".p")).exists())
					throw new Termination ("Invalid -e usage: must specifiy a fully qualified module for pollen.environment");
				pollenEnvPkg = this.putModule(inputs, value);
				pollenEnv = value.substring(value.lastIndexOf(File.separator)+1);
				continue;
			}
			
			if (p.equals("-props")) {
				value = (args.length > (++i) ? args[i] : "");
				if (value.isEmpty())	
					continue;
				value = getPath(value, p, errStream);	
				if (value == null)
					continue;
				if (!(new File(value)).exists())
					throw new Termination ("Invalid -props usage: could not find properties file \'" + value + "\'");	
				setPropsOption(value);
				continue;
			}

			if (p.equals("-p")) {
				value = (args.length > (++i) ? args[i] : "");
				if (value.isEmpty())	
					continue;
				value = getPath(value, p, errStream);	
				value = stripSuffix(value);
				if (!(new File(value + ".p")).exists())
					throw new Termination ("Invalid -p usage: must specifiy a fully qualified module for pollen.print");								
				pollenPrintPkg = this.putModule(inputs, value);
				setPollenPrint(value.substring(value.lastIndexOf(File.separator)+1));
				setDashPoption(true);
				continue;
			}
			if (p.equals("-cFlags")) {
				value = (args.length > (++i) ? args[i] : "");
				if (value.isEmpty())	
					continue;
				ProcessUnits.setcFlags(value);
				continue;
			}
			if (p.equals("-mcu")) {
				value = (args.length > (++i) ? args[i] : "");
				if (value.isEmpty())	
					continue;
				ProcessUnits.setMcu(value);
				continue;
			}
			if (p.equals("-verbose")) {
				value = (args.length > (++i) ? args[i] : "");
				if (value.isEmpty())	
					continue;
				ProcessUnits.setVerbose(true);
				continue;
			}
			if (p.equals("-t"))	{
				value = (args.length > (++i) ? args[i] : "");
				if (value.isEmpty())	
					continue;
				if (value.equals("avr-gcc"))	{
					ProcessUnits.setTargetCompiler(CCompiler.AVR);
				}
				else if (value.equals("msp430-gcc")) {
					ProcessUnits.setTargetCompiler(CCompiler.MSP430);
				}
				else if (value.equals("efm32-gcc"))	{
					ProcessUnits.setTargetCompiler(CCompiler.EFM32);
				}
				else if (value.equals("localhost-gcc"))	{
					ProcessUnits.setTargetCompiler(CCompiler.LOCALHOST);
				}
				else if (value.equals("arm-none-eabi-gcc"))	{
					ProcessUnits.setTargetCompiler(CCompiler.ARM);
				}
				else {
					throw new Termination ("Invalid translator option '-t " + value + "': no properties file for this target");				
				}
				continue;
			}
			if (p.equals("-gccAvr")) { 	// UNDOCUMENTED, in test scripts: runs gccavr					
				ProcessUnits.setTargetCompiler(CCompiler.AVR);
				continue;
			}
			if (p.equals("-gcc")) {	    // UNDOCUMENTED, in test scripts: runs gcc					 
				ProcessUnits.setTargetCompiler(CCompiler.LOCALHOST);
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
			if (p.matches("-\\S+")) {
				errStream.printf("Unknown option \'%s\'. Option skipped (use \'-h\' for list of options).\n", p);
				continue;
			}
			if (p.startsWith("@")) {
				if (getPollenBundles().isEmpty()) {
					errStream.printf("$POLLEN_BUNDLES is referenced but not initialized. Command line argument \'" + p + "\' skipped.\n");
					continue;
				}
				p = getPollenBundles() + File.separator + p.substring(1);	
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
					throw new Termination ("Invalid inputs: translator accepts one pollen file (and a set of bundles). More than one pollen file encountered.");					
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
	 * @param value
	 * @param option
	 * @param errStream
	 * @return the path fully qualified or null if this option should be skipped.
	 */
	protected String getPath(String value, String option, PrintStream errStream) {
		if (value.startsWith("@")) {
			if (getPollenBundles().isEmpty()) {
				errStream.printf("$POLLEN_BUNDLES is referenced but not initialized. Command line argument \'" + option + "\' skipped.\n");
				return null;
			}
			value = getPollenBundles() + File.separator + value.substring(1);	
		}
		if (isRelativePath(value))	
			value = System.getProperty("user.dir" + File.separator + value);
		return value;
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
			PrintStream infoStream, 
			SymbolTable symtab) throws Exception {
		
		
		if (args.length == 1 && args[0] != null && args[0].equals("-h")) {
			// don't require environment variable setup just for help message
			System.out.println(helpMessage());
			System.exit(0);
		}
		if (args.length == 1 && args[0] != null && args[0].equals("-v")) {
			// don't require environment variable setup just for version message
			System.out.println(version());
			System.exit(0);
		}

		setCompatibilityMode(setupEnvVars(props));
		Inputs files = this.getArgs(args, errorStream);
		       
		// set up the target properties after the args processed
		String propsFile = getPropsFileName(isCompatibilityMode(), props);
		if (propsFile != null) {
			props = new PropsLoader().apply(props, propsFile, System.err);
			if (props == null) {
				throw new Termination("Could not load properties file \'"
						+ propsFile + "\'");
			}
			for (CCompiler c : cCompiler) {
				if (!props.get(ITarget.P_TOOLPREFIX)
						.equals(tools_prefix.get(c))) {
					throw new Termination(
							"Invalid input: compiler specified in props file does not match compiler selected by translator option");
				}
			}
		}

		ParseUnit.initParse(files.pollenFile, props, files.packages, outputStream, errorStream, infoStream, symtab);

		return ParseUnit.current().parseUnits();
	}
	/**
	 * Default handling of print when no -p 
	 * @param po
	 */
	static private void setPollenOutputDefault(String po) {
		pollenOutputDefault = po;
	}
	/**
	 * Default handling of print when no -p 
	 * @return the default location according to environment variables.
	 * TODO this breaks if $POLLEN_BUNDLES is not specified because I 
	 * have no implementation of pollen.output/PrintProtocol.p for default bind.
	 * Gets error msg in ParseUnit.parseImports().
	 */
	static public String getPollenOutputDefault() {		
		return pollenOutputDefault;
	}
	/**
	 * Setup environment variables.
	 * POLLEN_TARGET must be specified. Required files are there (e.g. std.h).
	 * POLLEN_BUNDLES can be unspecified.
	 * 
	 * Handle old (POLLEN_ROOT) vs. new (POLLEN_TARGET) environment variables so test scripts work.
	 * If no POLLEN_TARGET and there is POLLEN_ROOT, POLLEN_ROOT is used to set POLLEN_TARGET.
	 * 
	 * if no POLLEN_BUNDLES specified assume the paths are fully specified on command line.
	 * 
	 * NOTE if $POLLEN_BUNDLES is unspecified, that can break default dcln of PrintProtocol (which is 
	 * generated for bind of print when -p is not supplied). Anything else? $POLLEN_BUNDLES is defined
	 * for the cloud compiler so it's acceptable for now. 
	 * 
	 * @param props
	 */
	protected boolean setupEnvVars(Properties props) {
		for (Property p : Property.values()) {
			String val = System.getenv(p.name());
			if (val != null) {
				props.setProperty(p.name(), val);
				if (p.name().equals(Property.POLLEN_TARGET.name()))
					setPollenTarget(val);
				if (p.name().equals(Property.POLLEN_BUNDLES.name())) {
					setPollenBundles(val);
					setPollenOutputDefault(val + File.separator + "pollen-core" + File.separator + "pollen.output");
				}
			}
		}

		// If no POLLEN_TARGET, POLLEN_ROOT is used to set POLLEN_TARGET.
		// This allows use of old tests scripts.
        if (props.getProperty(Property.POLLEN_TARGET.name()) == null
        		&& props.getProperty(Property.POLLEN_ROOT.name()) != null) {
        	
        	String f = props.getProperty(Property.POLLEN_ROOT.name())+ File.separator + "pollen.lang";
        	File file = new File(f);
        	if (file.exists()) {   // an old setup (compatibility mode, for test scripts).
        		props.setProperty(Property.POLLEN_TARGET.name(), props.getProperty(Property.POLLEN_ROOT.name())+ File.separator + "pollen.lang");
        		setPollenTarget(props.getProperty(Property.POLLEN_TARGET.name()));
        		setPollenOutputDefault(props.getProperty(Property.POLLEN_ROOT.name())+ File.separator + "pollen.output");
        		if (props.getProperty(Property.POLLEN_BUNDLES.name()) == null) {
        			props.setProperty(Property.POLLEN_BUNDLES.name(), props.getProperty(Property.POLLEN_ROOT.name()));
        			setPollenBundles(props.getProperty(Property.POLLEN_BUNDLES.name()));
        		}     
        		return true;
        	}
        	else {
        		System.err.println("pollen.ParseUnit: undefined environment variable: " + Property.POLLEN_TARGET.name());
        		System.exit(1);
        	}        	
        }
        // POLLEN_TARGET must be specified. 
        if (props.getProperty(Property.POLLEN_TARGET.name()) == null && props.getProperty(Property.POLLEN_ROOT.name()) == null) {
        	System.err.println("pollen.ParseUnit: undefined environment variable: " + Property.POLLEN_TARGET.name());
        	System.exit(1);
        }

        return false;
	}
	protected int translateUnit(HashMap<String, UnitNode> unitMap) throws Exception {
		
			UnitNode curUnit = ParseUnit.current().getCurrUnitNode();
			Generator g = new Generator();
			g.genUnits(curUnit, unitMap); // js and c body
            
            g.genProgFiles(curUnit); // prog.js, prog.c         
            g.genUnitHeaders(curUnit, unitMap); // last to initialize some host variables (e.g. array dimensions)
    		ParseUnit.Times.endTime(ParseUnit.Time.POLLEN);
            g.compile();
            
            PrintStream timesStream;
			try {
				timesStream = ParseUnit.current().getTimesStream();
	            timesStream.println(ParseUnit.Times.returnTimes());
	            timesStream.close();

			} catch (FileNotFoundException e) {
			}
           
            if (ParseUnit.getSeriousErrorCount() > 0) {
                return 1;
            }
            return 0;            	
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

		unitNodes = this.parseUnit(args, props, outputStream, errorStream, infoStream, symbolTable);
		
		return this.translateUnit(unitNodes);

	}

}
