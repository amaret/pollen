package atmel.avr.atmega328

------------------------------------------------------------------------------- 

Basic mcu module for the atmel atmega328p.

-------------------------------------------------------------------------------

from pollen.protocols import Mcu

module Atmega328 implements Mcu {

  host uint32 freq

  public host uint32 frequency() { return @freq }

  public uint32 frequency() { return @freq }

  public host frequency(uint32 hz) { @freq = hz }

  public frequency(uint32 hz) { @freq = hz }

  public reset() {
  
  }

  public shutdown() {
  
  }
    
  public wait(uint32 us)	{
    --- figure out how many nops to wait for 1 us to elapse based on the mcu freq (guessed below) ---
    for (; us > 0; us--) {
      @nop()
		}
  }

  public nop() {
    +{ asm("nop") }+	  --- this nop is specific to the gcc compiler ---
  }

}