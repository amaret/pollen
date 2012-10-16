package atmel.atmega328

-------------------------------------------------------------------------------
Mcu Composition for the ATmega328 Microcontroller
-------------------------------------------------------------------------------
from pollen.hardware import Mcu as McuProtocol

import Mcu

--- Create module instances for each digital i/o pin ---
# Port B
from atmel.atmega328 import MetaPin{'PORTB', 'DDRB', 0} as PB0
from atmel.atmega328 import MetaPin{'PORTB', 'DDRB', 1} as PB1
from atmel.atmega328 import MetaPin{'PORTB', 'DDRB', 2} as PB2
from atmel.atmega328 import MetaPin{'PORTB', 'DDRB', 3} as PB3
from atmel.atmega328 import MetaPin{'PORTB', 'DDRB', 4} as PB4
from atmel.atmega328 import MetaPin{'PORTB', 'DDRB', 5} as PB5
from atmel.atmega328 import MetaPin{'PORTB', 'DDRB', 6} as PB6
from atmel.atmega328 import MetaPin{'PORTB', 'DDRB', 7} as PB7

# Port C
from atmel.atmega328 import MetaPin{'PORTC', 'DDRC', 0} as PC0
from atmel.atmega328 import MetaPin{'PORTC', 'DDRC', 1} as PC1
from atmel.atmega328 import MetaPin{'PORTC', 'DDRC', 2} as PC2
from atmel.atmega328 import MetaPin{'PORTC', 'DDRC', 3} as PC3
from atmel.atmega328 import MetaPin{'PORTC', 'DDRC', 4} as PC4
from atmel.atmega328 import MetaPin{'PORTC', 'DDRC', 5} as PC5
from atmel.atmega328 import MetaPin{'PORTC', 'DDRC', 6} as PC6

# Port D
from atmel.atmega328 import MetaPin{'PORTD', 'DDRD', 0} as PD0
from atmel.atmega328 import MetaPin{'PORTD', 'DDRD', 1} as PD1
from atmel.atmega328 import MetaPin{'PORTD', 'DDRD', 2} as PD2
from atmel.atmega328 import MetaPin{'PORTD', 'DDRD', 3} as PD3
from atmel.atmega328 import MetaPin{'PORTD', 'DDRD', 4} as PD4
from atmel.atmega328 import MetaPin{'PORTD', 'DDRD', 5} as PD5
from atmel.atmega328 import MetaPin{'PORTD', 'DDRD', 6} as PD6
from atmel.atmega328 import MetaPin{'PORTD', 'DDRD', 7} as PD7


composition ATmega328 {       # implements McuProtocol 

  -----------------------------------------------------------------------------
    Main device modules
  -----------------------------------------------------------------------------
  export Mcu
  # export Mcu.reset
  # export Mcu.shutdown
  # export Mcu.wait
  # export Mcu.cycle
  # uint32 frequency
  # host uint32 frequency
  # frequency(uint32 hz)
  # host frequency(uint32 hz)

  -----------------------------------------------------------------------------
    General Purpose I/O Pins
  -----------------------------------------------------------------------------
  --- Port B ---
  export PB0
  export PB1
  export PB2
  export PB3
  export PB4
  export PB5
  export PB6
  export PB7

  -- Port C ---
  export PC0
  export PC1
  export PC2
  export PC3
  export PC4
  export PC5
  export PC6
  
  --- Port D ---
  export PD0
  export PD1
  export PD2
  export PD3
  export PD4
  export PD5
  export PD6
  export PD7

}


