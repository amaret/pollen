---
Try creating a pin from a meta module, then bind to protocol member
---

from pollen.hardware import Pin
from atmel.atmega328 import Mcu
from atmel.atmega328 import MetaPin{'PORTD', 'DDR0', 0} as PD0


module Blink5 {

  host Pin pin    # is host required?

  host Blink5() {
    @pin := PD0
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
		for(i = 0; i < 10000; i++) {
      Mcu.cycle()
		}
	}
	
}