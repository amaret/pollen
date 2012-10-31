package blink.avr

#-------------------------------------------------------------------------------
# A module that spins in a loop toggling a pin which blinks an led. 
#
# The pin driver is in the code and specific to AVR microcontrollers 
# (i.e. arduino)
#-------------------------------------------------------------------------------

module Blink0 {

	+{ #include <avr/io.h> }+

	pollen.run() {	

		+{DDRB}+ |= (1 << 5)   # Make the pin an output
    
		while(true) {
      togglePin()
			delaySome()
		}
		
  	+{PORTB}+ &= ~(1 << 5)
	}
	
	togglePin() {
	  +{PORTB}+ ^= (1 << 5)
	}
	
	setPin() { 
		+{PORTB}+ |= (1 << 5)
	}
	
	clearPin() {
		+{PORTB}+ &= ~(1 << 5)
	}

	delaySome() {
	  for(uint32 i = 0; i < 100000; i++) {
		  +{ asm("nop") }+
		  +{ asm("nop") }+
		  +{ asm("nop") }+
		  +{ asm("nop") }+
		  +{ asm("nop") }+
		  +{ asm("nop") }+
		  +{ asm("nop") }+
		  +{ asm("nop") }+
		  +{ asm("nop") }+
		  +{ asm("nop") }+
		  +{ asm("nop") }+
		  +{ asm("nop") }+		  		  		  
	  }
	}

}