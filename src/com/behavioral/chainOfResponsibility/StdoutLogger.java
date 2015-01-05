package com.behavioral.chainOfResponsibility;

public class StdoutLogger extends Logger {
	
	public StdoutLogger(int mask) {
        this.mask = mask;
    }

	@Override
	protected void writeMessage(String msg) {
		// TODO Auto-generated method stub
		 System.out.println("Writing to stdout: " + msg);
	}

	
}
