package com.structural.decorator;

public class LuxuryCar extends CarDecorator {

	public LuxuryCar(Car car) {
		super(car);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void assemble() {
		// TODO Auto-generated method stub
		car.assemble();
		System.out.println("Adding features of Luxury car");
	}
}
