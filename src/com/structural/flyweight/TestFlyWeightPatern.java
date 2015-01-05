package com.structural.flyweight;

public class TestFlyWeightPatern {

	public static final int ROWS = 10, COLS = 5;
	
	public static void main(String[] args) {
		/*Gazillion [][] matix = new Gazillion [ROWS][COLS];
		
		for(int i = 0; i< ROWS; i++){
			for(int j=0; j<COLS; j++){
				matix[i][j] = new Gazillion(COLS);
			}
		}
		
		for(int i = 0; i< ROWS; i++){
			for(int j=0; j<COLS; j++){
				matix[i][j].report();
			}
			System.out.println();
		}*/
		
		//with factory to reduce number of objects instantiated
		Factory factory = new Factory(ROWS);
		
		for(int i =0; i< ROWS ; i++){
			for(int j=0; j< COLS; j++){
				factory.getFlyWeight(i).report(j);
			}
			System.out.println();
		}
	}

}
