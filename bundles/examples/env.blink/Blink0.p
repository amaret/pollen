---
Import a pin from the Arduino composition and toggle it periodically.
---

from arduino.cc import Arduino
from Arduino import D13 as Pin

module Blink0 {

	pollen.reset() { 
    Pin.clear()
    Pin.makeOutput()
	}
	
	pollen.run() {
		while (true) {
      Pin.toggle()
			delaySome()
		}
	}
	
	delaySome() {
		for(i = 0; i < 500; i++) {
      Arduino.wait(1000)    # a number larger than 65xyz should be a compile error!
		}
	}
	
}