package blink.avr

-------------------------------------------------------------------------------
A module that spins in a loop toggling a pin that blinks an led. 

The pin driver is in the code and it is specific to AVR microcontrollers 
(i.e. arduino)
-------------------------------------------------------------------------------

module BlinkLooped0 {

	+{ #include <avr/io.h> }+

	pollen.run() {	

		while(true) {
			setPin()
			delaySome()
			clearPin()
			delaySome()			
		}
	}
	
	setPin() { 
		+{PORTD}+ |= (1 << 0)
	}
	
	clearPin() {
		+{PORTD}+ &= (1 << 0)
	}

	delaySome() {
		for(i = 0; i < 10000; i++) {
			+{ asm("nop") }+
		}
	}

}