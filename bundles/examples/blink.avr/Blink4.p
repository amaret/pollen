---
Try creating a pin from a meta module
---

from atmel.atmega328 import Mcu
from atmel.atmega328 import MetaPin{'PORTD', 'DDR0', 0} as PD0


module Blink4 {

	pollen.reset() { 
    PD0.clear()
    PD0.makeOutput()    
	}
	
	pollen.run() {
		while (true) {
			PD0.toggle()
			delaySome()
		}
	}
	
	delaySome() {
		for(i = 0; i < 10000; i++) {
      Mcu.cycle()
		}
	}
	
}