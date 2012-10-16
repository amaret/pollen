package blink.avr

-------------------------------------------------------------------------------
A module that blinks an led by repeatedly toggling a pin in a loop.

The pin is brought in from a composition.  

This module is specific to avr microcontrollers (i.e. arduino).
-------------------------------------------------------------------------------

from cc.arduino import ArduinoWithoutMeta as Arduino
from Arduino import TestPin as Pin

module Blink2 {

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
		for(i = 0; i < 10000; i++) {
      Arduino.cycle()
		}
	}
}