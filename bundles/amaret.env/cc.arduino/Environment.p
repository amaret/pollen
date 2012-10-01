package cc.arduino

import Duemilanove 
from pollen.time import Time
from pollen.events import Events

composition Environment extends Duemilanove {

	export GlobalInterrupts
	export Led
	export Mcu
	export Mcu.reset
	export Mcu.wait
	export Events.run
	export Events.post
	export Events.postFromInterrupt	
	
	host Environment() {
		Events.bindGlobalInterrupts(GlobalInterrupts)
		Time.bindGlobalInterrupts(GlobalInterrupts)
		Time.bindTimerDriver(TD)
	}
}