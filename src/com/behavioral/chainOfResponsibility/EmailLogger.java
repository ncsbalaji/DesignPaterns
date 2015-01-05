package com.behavioral.chainOfResponsibility;

public class EmailLogger extends Logger {

	 public EmailLogger(int mask) {
	        this.mask = mask;
	 }
	 
	@Override
	protected void writeMessage(String msg) {
		// TODO Auto-generated method stub
		System.out.println("Sending via e-mail: " + msg);
	}

}
