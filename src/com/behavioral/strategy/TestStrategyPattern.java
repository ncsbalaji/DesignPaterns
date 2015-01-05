package com.behavioral.strategy;

public class TestStrategyPattern {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		goodFortune();
	}
	
	public static void goodFortune(){
		
		int luckyNumber = new Dice().throwIt();
		FortuneCookies fortuneCookies;
		
		switch (luckyNumber) {
		 	
		case 2:
			fortuneCookies = new Two();
			break;
		
		case 5:
			fortuneCookies = new Five();
			break;
			
		default:
			fortuneCookies= new Null();
			break;
			
		}
		
		fortuneCookies.print();
		
	}

}
