package cc.arduino

import Duemilanove 
<<<<<<< HEAD:bundles/amaret.env/cc.arduino/Environment.p
=======

>>>>>>> 645dff89092af1ed104bc44b9e41d731eefc6911:bundles/com.amaret/cc.arduino/Environment.p
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
