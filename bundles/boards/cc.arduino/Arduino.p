package cc.arduino

from atmel.atmega328 import ATmega328 as Mcu

--- Rename mcu pins to names on board ---
from Mcu import PD0 as D0
from Mcu import PD1 as D1
from Mcu import PD2 as D2
from Mcu import PD3 as D3
from Mcu import PD4 as D4
from Mcu import PD5 as D5
from Mcu import PD6 as D6
from Mcu import PD7 as D7
from Mcu import PB0 as D8
from Mcu import PB1 as D9
from Mcu import PB2 as D10
from Mcu import PB3 as D11
from Mcu import PB4 as D12
from Mcu import PB5 as D13

composition Arduino {

	export Mcu
	export Mcu.cycle
	export Mcu.wait
	
	# Can I do this and save the renaming above? 
	# export Mcu.PD0 as PD0
	
	--- Digital Input Output Lines --
	export D0
	export D1
	export D2
	export D3			
	export D4
	export D5
	export D6
	export D7
	export D8
	export D9
	export D10
	export D11
	export D12
	export D13
			
  host Arduino() {
		Mcu.frequency(16000000)
	}
	
}