package cc.arduino

import Duemilanove 

from Duemilanove.Board import Led
from Duemilanove.Board.Mcu import GlobalInterrupts
from Duemilanove.Board.Mcu import TimerMilli8BitTimer0 as TD

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