package atmel.avr.atmega328

-------------------------------------------------------------------------------

Device driver for global interrupts on the atmega328p.
  Note: Gcc specific module. Dependent on avr lib.

-------------------------------------------------------------------------------

from pollen.protocols import GlobalInterrupts as GI

module GlobalInterrupts implements GI {

  +{ #include <avr/io.h>
     #include <avr/interrupt.h> }+

  public uint16 disable() {
    uint16 key = +{SREG}+ & (1 << 7)
    +{cli()}+
    return key
  }

  public enable() {
    +{sei()}+
  }
    
  public restore(uint16 key) {
    if (key != 0) { 
      +{sei()}+
    }
    else {
      +{cli()}+
    }
  }    
}