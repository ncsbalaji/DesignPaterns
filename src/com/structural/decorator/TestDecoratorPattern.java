package com.structural.decorator;

public class TestDecoratorPattern {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car sportsCar = new SportsCar(new BasicCar());
		sportsCar.assemble();
		
		Car sportsLuxuryCar = new LuxuryCar(new SportsCar(new BasicCar()));
		sportsLuxuryCar.assemble();
	}

}
