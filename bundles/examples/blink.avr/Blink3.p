package blink.avr

-------------------------------------------------------------------------------
A module that spins in a loop toggling a pin which blinks an led. 

The module pin is a protocol member and is bound to the pin which is brought in
from a composition.

This module is specific to avr microcontrollers (i.e. arduino).
-------------------------------------------------------------------------------

from pollen.hardware import Pin
from cc.arduino import ArduinoWithoutMeta as Arduino
from Arduino import TestPin

module Blink3 {

	host Pin pin		# protocol member
	
	host Blink3() {
		@pin := TestPin
	}

	pollen.reset() { 
    @pin.clear()
	}
	
	pollen.run() {
		while (true) {
      @pin.set()
      delaySome()
      @pin.clear()
      delaySome()      
		}
	}
	
	delaySome() {
		for(i = 0; i < 10000; i++) {
      Arduino.cycle()
		}
	}
}