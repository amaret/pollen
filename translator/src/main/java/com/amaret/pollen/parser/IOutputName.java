// Copyright Amaret, Inc 2011-2015
// See https://github.com/amaret/pollen/blob/master/LICENSE

/**
 * 
 */
package com.amaret.pollen.parser;

import java.util.EnumSet;

import com.amaret.pollen.translator.Generator;

/**
 * @author lentil
 * Return for an unqualified name for output
 *
 */
public interface IOutputName {

	String getOutputNameHost(Generator g, IScope sc, EnumSet<Flags> flags);
	String getOutputNameTarget(Generator g, IScope sc, EnumSet<Flags> flags);
}
