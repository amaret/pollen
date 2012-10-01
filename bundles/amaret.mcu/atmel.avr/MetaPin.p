package atmel.avr

-------------------------------------------------------------------------------
  Meta device driver implementing the Pin interface for general purpose input /
  output pins on atmega devices.
-------------------------------------------------------------------------------

meta {string ioPort, string dirPort, uint8 bit}

from pollen.protocols import Pin

module meta.name implements Pin {

	+{ #include <avr/io.h> }+
	
	public set() {
		+{ioPort}+ |= (1 << bit)
	}

	public clear() {
		+{ioPort}+ &= (1 << bit)
	}
	
	public toggle() {
		+{ioPort}+ ^= (1 << bit)
	}	
	
	public bool get() {
		return (+{ioPort}+ & (1 << bit)) ? true : false
	}
	
	public makeInput() {
		+{dirPort}+ &= ~(1 << bit)
	}
	
	public bool isInput() {
		return (+{dirPort}+ & (1 << bit)) ? false : true
	}
	
	public makeOutput() {
		+{dirPort}+ &= ~(1 << bit)
	}
	
	public bool isOutput() {
		return (+{dirPort}+ & (1 << bit)) ? true : false
	}	
}