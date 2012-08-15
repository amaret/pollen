package com.amaret.pollen.driver;

import java.io.File;
import java.io.FilenameFilter;
import java.io.PrintStream;
import java.util.ArrayList;

import com.amaret.pollen.parser.ParseUnit;
import com.amaret.pollen.parser.SymbolTable;

public class ProcessUnits {
	private SymbolTable symbolTable;
	
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
	 * @param path - a absolute path for a package
	 * @return ArrayList of pollen files
	 */
	private ArrayList<String> getPollenFiles(String path) {
		
		File pkg = new File(path);
		FilenameFilter filter = new FilenameFilter() {
			public boolean accept(File pathname, String s) {				
				if (s.endsWith(".p"))
					return true;
				return false;
			}
		};
		String[] pfs = pkg.list(filter);
		if (pfs != null) {
			ArrayList<String> pollenFiles = new ArrayList<String>();
			for (int i=0; i< pfs.length; i++) {
				pollenFiles.add(path + File.separator + pfs[i]);				
			}	
			return pollenFiles;
		}		
		return new ArrayList<String>();
	}
 
	/**
	 * 
	 * @param path - a absolute path for a bundle
	 * @return ArrayList of packages
	 */
	private ArrayList<String> getPackages(String path) {
		
		File bundle = new File(path);
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
			ArrayList<String> packages = new ArrayList<String>();
			for (int i=0; i< pkgs.length; i++) {
				packages.add(path + File.separator + pkgs[i]);				
			}	
			return packages;
		}		
		return new ArrayList<String>();
	}
   	
	/**
	 * 
	 * @param args - bundles and pollen files
	 * @return list of fully qualified pollen file names
	 */
	public ArrayList<String> setupInputs(String[] args) throws Exception {
		
		String p = "";
		ArrayList<String> paths = new ArrayList<String>();
		for (int i=0; i < args.length; i++) {
			p = args[i];
			if (this.isRelativePath(p)) {
				p = System.getProperty("user.dir") + File.separator + p;
			}
			if (p.endsWith(".p")) { // pollen file
				paths.add(p);
				continue;
			}			
			// else 'p' is a bundle
			ArrayList<String> packages = this.getPackages(p);
			for (String pkg : packages) {
				ArrayList<String> pollenFiles = this.getPollenFiles(pkg);	
				for (String pf : pollenFiles) {
					paths.add(pf);
				}
			}						
		}
		if (paths.size() == 0) 
			throw new Exception("No valid input files");
		return paths;
	}
	protected void parseUnit(
			String inputPath,
			PrintStream outputStream,
            PrintStream errorStream,
            PrintStream infoStream, 
            SymbolTable symtab) throws Exception {
				
		ParseUnit.startUnit(inputPath, outputStream, errorStream, infoStream, symtab);
		ParseUnit.current().parseUnit();
		// for each file...
		// createAST
		// if errors = 0
		// doPass1(), etc.	
	}
	protected void translateUnit() {
		// walk the AST generating javascript, executing javascript and creating 'c' files
	}
	/**
	 * Entry to translator.
	 * @param files - absolute paths to pollen files
	 * @param outputStream
	 * @param errorStream
	 * @param infoStream
	 */
	public void processUnits(
			ArrayList<String> files,
			PrintStream outputStream,
            PrintStream errorStream,
            PrintStream infoStream) throws Exception {
		
		SymbolTable symbolTable = new SymbolTable();
		
		for (String input : files) {
			this.parseUnit(input, outputStream, infoStream, errorStream, symbolTable);
			// TODO 
			this.translateUnit();
			
		}
		
	}

}
