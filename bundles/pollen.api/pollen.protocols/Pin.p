package pollen.protocols

------------------------------------------------------------------------------- 

Protocol definition for a general purpose input / output pin (gpio).

-------------------------------------------------------------------------------

protocol Pin {

	set()									--- Set the pin high ---

	clear()								--- Set the pin low ---	
	
	toggle()							--- Toggle the state of the pin ---
	
	bool get()						--- Get the pin state ---

	bool input()					--- Check if pin is configured as an input ---
	
	bool output()					--- Check if pin is configured as an output ---
	
	input(bool enable)		--- Make pin an input ---
	
	output(bool enable)		--- Make pin an output --- 
	
}