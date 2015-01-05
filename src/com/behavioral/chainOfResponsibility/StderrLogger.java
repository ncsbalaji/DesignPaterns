package com.behavioral.chainOfResponsibility;

public class StderrLogger extends Logger {

	public StderrLogger(int mask) {
        this.mask = mask;
    }
	
	@Override
	protected void writeMessage(String msg) {
		// TODO Auto-generated method stub
		 System.err.println("Sending to stderr: " + msg);
	}

}
