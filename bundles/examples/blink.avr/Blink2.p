package blink.avr

!------------------------------------------------------------------------------
 A module that blinks an led by repeatedly toggling a pin in a loop.

 The pin is brought in from a composition.  
 
 This module is specific to avr microcontrollers (i.e. arduino).
------------------------------------------------------------------------------!

from cc.arduino import ArduinoWithoutMeta as Arduino
from Arduino import TestPin

module Blink2 {

	pollen.reset() { 
    TestPin.clear()
	}
	
	pollen.run() {
		while (true) {
      TestPin.set()
      delaySome()
      TestPin.clear()
      delaySome()      
		}
	}
	
	delaySome() {
		for(uint32 i = 0; i < 100000; i++) {
      Arduino.cycle()
		}
	}
}