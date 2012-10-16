package cc.arduino

-------------------------------------------------------------------------------
Arduino Uno Board Composition

This composition assembles an environment for the Arduino Uno hardware.
-------------------------------------------------------------------------------

from pollen.hardware import Environment

import Arduino 
import Lifecycle

composition Uno extends Arduino implements Environment {

	export Mcu
	export Mcu.wait
	export Mcu.cycle
	export pollen.reset

	host Uno() {
    # Arduino() 
    # How is the super constructor called? Like above? Is code prepended to this function? 
    # Does this function completely override that one? 
    
	}
}
