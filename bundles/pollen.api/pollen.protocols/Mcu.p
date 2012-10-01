package pollen.protocols

------------------------------------------------------------------------------- 

Protocol definition for basic microcontroller functionality.

-------------------------------------------------------------------------------

protocol Mcu {

  host uint32 frequency()       --- Get mcu frequency on host  --- 

  uint32 frequency()            --- Get mcu frequency on target  --- 

  host frequency(uint32 hz)     --- Set mcu frequency on host  --- 

  frequency(uint32 hz)          --- Set mcu frequency on target  --- 

  reset()			                  --- Mcu power up and reset actions --- 
  
  shutdown()		                --- Mcu shutdown actions ---
      
  wait(uint32 us)	              --- Microsecond delay ---
  
  nop()			                    --- Single cycle delay ---
    
}
