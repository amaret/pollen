from pollen.environment import Led

module BlinkLooped2 {

	pollen.reset() { 
		pollen.environment.reset() 
	}
	
	pollen.run() {
		while (true) {
			Led.toggle()
			pollen.environment.wait(500000)
		}
	}
	
}