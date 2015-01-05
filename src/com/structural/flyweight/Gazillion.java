package com.structural.flyweight;

public class Gazillion {
	
	private static int num = 0;
	private int row; //, col;
	
	public Gazillion(int maxPerRow){
		row = maxPerRow;//num / maxPerRow;
		//col = num % maxPerRow;
		num ++;
		
		System.out.println("constr");
	}
	
	public void report(int j){
		
		System.out.print(" "+row + j);//col);
	}

}
