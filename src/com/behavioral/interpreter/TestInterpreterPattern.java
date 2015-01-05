package com.behavioral.interpreter;

import java.util.Stack;

public class TestInterpreterPattern {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String tokenString = "4 3 2 - 1 + *";
		Stack stack = new Stack();
		
		String[] tokenList = tokenString.split(" ");
		
		for (String s : tokenList) {
			if (isOperator(s)) {
				
				IExpression rightExpression = (IExpression) stack.pop();
				IExpression leftExpression = (IExpression) stack.pop();
				
				IExpression operator = getOperatorInstance(s, leftExpression,
						rightExpression);
				int result = operator.interpret();
				stack.push(new NumberExpression(result));
			} else {
				IExpression i = new NumberExpression(s);
				stack.push(i);
			}
			
			System.out.println("Result: "+((IExpression) stack.pop()).interpret());
		}
	}
	
	public static boolean isOperator(String operator){
		
		if(operator.equals("+") || operator.equals("-") || operator.equals("*")){
			return true;
		} else {
			return false;
		}
	}

	
	public static IExpression getOperatorInstance(String s, IExpression left,
			IExpression right) {
		
		if(s.equals("+")){
			return new PlusExpression(left, right);
		} else if (s.equals("-")){
			return new MinusExpression(left, right);
		} else if (s.equals("*")){
			return new MultiplyExpression(left, right);
		} else{
			return null;
		}
		
	}
	
}
