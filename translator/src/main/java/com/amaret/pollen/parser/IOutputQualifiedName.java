/**
 * 
 */
package com.amaret.pollen.parser;

import java.util.EnumSet;

import com.amaret.pollen.translator.Generator;

/**
 * @author lucidbee (Megan Adams)
 * Return for output a qualified name
 *
 */
public interface IOutputQualifiedName {

	
	/**
	 * @param generator
	 * @param n       
	 * @param is
	 * @param flags isThisPtr, isPostExpr, etc
	 * @return qualified name as String
	 */
	String getOutputQNameHost(Generator generator, ISymbolNode n, IScope is,
			EnumSet<Flags> flags);
	/**
	 * @param generator
	 * @param n
	 * @param is
	 * @param flags isThisPtr, isPostExpr, etc
	 * @return qualified name as String
	 */
	String getOutputQNameTarget(Generator generator, ISymbolNode n,
			IScope is, EnumSet<Flags> flags);
}
