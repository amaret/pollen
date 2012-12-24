What should the dispatcher be like? 

An Event Factory? 

Should all event types register with the central event system? 
  - Use a host instantation function to register in array in dispatcher?
  

Event 

Events.on
Events.post


Timer.start(time, event, repeat)


Event has payload, gets passed along with event

from pollen.environment import Events
from pollen.environment import TimerMilli

module Blink {

  Event blinkEvent
  
  host Blink() {
    blinkEvent = Event(blink)
  }

  pollen.run() {
    e = Event(blink)
    e = Event()
    e.setHandler(blink)
    
    TimerMilli.start(e, 250)
    pollen.environment.run()
  }
  
  blink() {
    Led.toggle();
  }
}