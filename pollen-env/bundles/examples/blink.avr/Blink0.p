package blink.avr

!-----------------------------------------------------------------------------
  A module that spins in a loop toggling a pin which blinks an led. 

  The pin driver is specific to the ATmega328p mcu. (e.g. arduino)
------------------------------------------------------------------------------!

module Blink0 {

  +{ #include <avr/io.h> }+

  pollen.run() {  
    +{PORTB}+ &= ~(1 << 5)    # Clear the pin
    +{DDRB}+ |= (1 << 5)      # Make the pin an output
    
    while(true) {
      togglePin()
      delaySome()
    }
  }
  
  togglePin() {
    +{PORTB}+ ^= (1 << 5)
  }
  
  delaySome() {
    for(uint32 i = 0; i < 1000000; i++) {
      +{ asm("nop") }+              
    }
  }

}