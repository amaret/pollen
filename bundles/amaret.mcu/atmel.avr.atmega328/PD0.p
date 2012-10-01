package atmel.avr.atmega328p

-------------------------------------------------------------------------------
Device driver for general purpose input/output pin PD0 on the atmega328p micro.
-------------------------------------------------------------------------------

from pollen.protocols import Pin

module PD0 implements Pin {

	+{ #include <avr/io.h> }+
	
	public set() {
		+{PORTD}+ |= (1 << 0)
	}

	public clear() {
		+{PORTD}+ &= (1 << 0)
	}
	
	public toggle() {
		+{PORTD}+ ^= (1 << 0)
	}	
	
	public bool get() {
		return (+{PORTD}+ & (1 << 0)) ? true : false
	}
	
	public makeInput() {
		+{DDR0}+ &= ~(1 << 0)
	}
	
	public bool isInput() {
		return (+{DDRD}+ & (1 << 0)) ? false : true
	}
	
	public makeOutput() {
		+{DDRD}+ &= ~(1 << 0)
	}
	
	public bool isOutput() {
		return (+{DDRD}+ & (1 << 0)) ? true : false
	}	
}