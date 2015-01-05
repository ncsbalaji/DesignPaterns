package com.behavioral.state;

public class TestStatePattern {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		State state1 = new TVOnState();
		State state2 = new TVOffState();
		
		Context context = new Context();
		
		context.setState(state1);
		context.doAction();
		
		context.setState(state2);
		context.doAction();
	}

}
