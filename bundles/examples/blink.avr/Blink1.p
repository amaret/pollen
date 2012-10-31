package blink.avr

!------------------------------------------------------------------------------
A module that spins in a loop toggling a pin which blinks an led. 

The pin driver is abstracted out into its own module coming from the 
mcu.avr.atmega328p package. 

This module is specific to avr microcontrollers (i.e. arduino).
------------------------------------------------------------------------------!

from atmel.atmega328 import PB5 as Pin

module Blink1 {

	pollen.reset() { 
    Pin.clear()
	}
	
	pollen.run() {
		while (true) {
      Pin.set()
      delaySome()
      Pin.clear()
      delaySome()      
		}
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