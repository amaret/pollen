package com.amaret.pollen.util;

import java.io.PrintStream;

public class Clock {
    
    static private boolean master = true;
    static public final Clock current = new Clock();
    
    private PrintStream out = System.out;
    private long t0 = 0;
    private long prev = 0;
    private boolean enabled = true;
    
    public Clock() {
        reset();
    }
    
    public void bindOutput(PrintStream out) {
        this.out = out;
    }
    
    public void disable() {
        enabled = false;
    }
    
    public void enable() {
        enabled = true;
    }
    
    public void print(String msg) {
        if (master && enabled) {
            long cur = System.currentTimeMillis();
            out.printf("    %s [%d]\n", msg, cur - prev);
            prev = cur;
        }
    }
    
    public void reset() {
        prev = t0 = System.currentTimeMillis();
    }
    
    public long total() {
        return System.currentTimeMillis() - t0;
    }
}
