package pollen.protocols

------------------------------------------------------------------------------- 

Global Interrupts Protocol

------------------------------------------------------------------------------- 

protocol GlobalInterrupts {
    
  bool disable()        --- Disable global interrupts returning their present state ---
  
  enable()              --- Enable global interrupts. ---
  
  restore(bool state)   --- Restore global interrupts to the given state ---
  
}
