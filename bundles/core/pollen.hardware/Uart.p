package pollen.hardware

------------------------------------------------------------------------------- 

Protocol definition for a Universal Asynchronous Receiver / Transceiver (UART)

-------------------------------------------------------------------------------

protocol Uart {

    --- target method to configure the uart at runtime ---
    configure (uint32 baudRate, uint8 dataBits, uint8 stopBits, uint8 parity)    

    --- host method to configure the uart at build time ---
    host configure (uint32 baudRate, uint8 dataBits, uint8 stopBits, uint8 parity)

    put (uint8 data)    --- write a byte of data to the uart ---
    
    uint8 get()         --- read a byte of data from the uart ---
      
    flush()             --- flush the uart's read and write buffers ---

    baud(uint32 kbps)   --- set the uart's baud rate at runtime ---

    uint32 baud()       --- get the uart's configured baud rate at runtime ---
    
}
