package com.behavioral.interpreter;

public class MultiplyExpression implements IExpression {

	IExpression leftExpression;
	IExpression rightExpresion;
	
	public MultiplyExpression(IExpression leftExpression,
			IExpression rightExpresion) {
		this.leftExpression = leftExpression;
		this.rightExpresion = rightExpresion;
	}
	
	@Override
	public int interpret() {
		// TODO Auto-generated method stub
		return leftExpression.interpret() * rightExpresion.interpret();
	}

}
