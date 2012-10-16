---
  Test out binding a protocol member to a pin that came from a composition.
---

from arduino.cc import Arduino
from Arduino import D13

module Blink0 {

  host Pin pin

  host Blink0() {
    pin := D13
  }

	pollen.reset() { 
    pin.clear()
    pin.makeOutput()
	}
	
	pollen.run() {
		while (true) {
      pin.toggle()
			delaySome()
		}
	}
	
	delaySome() {
		for(i = 0; i < 500; i++) {
      Arduino.wait(1000)
		}
	}
	
}