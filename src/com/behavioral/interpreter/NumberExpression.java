package com.behavioral.interpreter;

public class NumberExpression implements IExpression {

	int number;
	
	public NumberExpression(int i) {
		number = i;
	}
	
	public NumberExpression(String s) {
		number = Integer.parseInt(s);
	}

	
	@Override
	public int interpret() {
		// TODO Auto-generated method stub
		return number;
	}

}
