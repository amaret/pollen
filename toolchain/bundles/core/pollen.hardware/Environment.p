package pollen.hardware

------------------------------------------------------------------------------- 

Protocol definition for a hardware environment. This protocol is generally
implemented by a composition.

-------------------------------------------------------------------------------

protocol Environment {

  reset()                 --- Environment and application reset ---
  wait(uint16 us)         --- Spin the processor for a specified number of microseconds ---   
  cycle()                 --- Wait a single cpu cycle ---    
  # run()                 --- Run the event system ---  
  # post()                --- Post an event ---
  # postFromInterrupt()   --- Post an event from an interrupt ---
    
}