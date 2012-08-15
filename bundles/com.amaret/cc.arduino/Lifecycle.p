package cc.arduino

-------------------------------------------------------------------------------
Arduino Lifecycle Module

This module defines the general application lifecycle.
-------------------------------------------------------------------------------

import pollen.environment

module Lifecycle {

	-----------------------------------------------------------------------------
		Pollen.reset is called by the application startup process immediately 
		after a processor reset or power up. 
	-----------------------------------------------------------------------------
	pollen.reset() {
		pollen.enviornment.reset()
	}
	
	-----------------------------------------------------------------------------
		Pollen.ready is called after all modules used by an application have had 
		their constructors called.
	-----------------------------------------------------------------------------
	pollen.ready() {
	
	}
	
	-----------------------------------------------------------------------------
		Pollen.shutdown is called to terminate application functionality. An 
		application-specific exit code can be specified.
	-----------------------------------------------------------------------------
	pollen.shutdown(uint8 code) {

	}
	
	-----------------------------------------------------------------------------
		Pollen.hibernate is called to put the processor into a specific sleep 
		level.
	-----------------------------------------------------------------------------
	pollen.hibernate(uint8 level) {

	}
	
	-----------------------------------------------------------------------------
		Pollen.wake is called when the processor is awoken from sleep. 
	-----------------------------------------------------------------------------
	pollen.wake() {

	}

}