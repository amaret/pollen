package cc.arduino

from atmel.atmega328 import Mcu
from atmel.atmega328 import PB5 as D13
from atmel.atmega328 import PB5 as TestPin

composition ArduinoWithoutMeta {

	export Mcu	
	export Mcu.cycle
		
	# Available Digital IO Lines
	export D13
	export TestPin

	host Arduino() {
		Mcu.setFrequency(16000000)
	}
}