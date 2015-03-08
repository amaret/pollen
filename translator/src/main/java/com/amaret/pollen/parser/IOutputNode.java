// Copyright Amaret, Inc 2011-2015
// See https://github.com/amaret/pollen/blob/master/LICENSE

/**
 * 
 */
package com.amaret.pollen.parser;

import com.amaret.pollen.translator.Generator;

/**
 * @author lentil
 * Format for output an expr or stmt.
 *
 */
public interface IOutputNode {
	void outputNodeHost(Generator g);
	void outputNodeTarget(Generator g);

}
