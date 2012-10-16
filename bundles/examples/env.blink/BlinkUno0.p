---
Toggle an Arduino Uno pin periodically, blinking an LED
---

from arduino.cc import Uno

module BlinkUno0 {

	pollen.reset() { 
    Uno.D13.clear()
    Uno.D13.makeOutput()
	}
	
	pollen.run() {

		while (true) {
      Uno.D13.toggle()
  		for(i = 0; i < 50; i++) { Uno.wait(10000) }
		}
	}
	
}