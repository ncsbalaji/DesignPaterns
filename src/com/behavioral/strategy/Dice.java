package com.behavioral.strategy;

public class Dice {

	public int throwIt(){
		return (int)(Math.random()*6) +1;
	}
}
