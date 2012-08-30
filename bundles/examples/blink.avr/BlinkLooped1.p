package blink.avr

-------------------------------------------------------------------------------
A module that spins in a loop toggling a pin that blinks an led. 

The pin driver is abstracted out into its own module coming from the 
mcu.avr.atmega328p package. 

This module is specific to avr microcontrollers (i.e. arduino).
-------------------------------------------------------------------------------

from pollen.environment import Led

module BlinkLooped1 {

	pollen.reset() { 
		pollen.environment.reset() 
	}
	
	pollen.run() {
		while (true) {
			Led.toggle()
			pollen.environment.wait(500000)
		}
	}
	
}