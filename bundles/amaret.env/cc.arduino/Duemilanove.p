package cc.arduino

from mcu.atmel.atmega328p import Mcu

# Rename mcu pins to names on board
from Mcu import PB4 as D12
from Mcu import PB5 as D13

from pollen.parts import Led{false} as Led

composition Duemilanove {

	export Mcu	
	export Led
		
	# Available Digital IO Lines
	export D12
	export D13		
		
	host Duemilanove() {
		Mcu.setSystemFrequency(16000000)
		Led.pin := D13 
	}
}