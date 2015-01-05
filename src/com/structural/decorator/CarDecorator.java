package com.structural.decorator;

public class CarDecorator implements Car {
	
	protected Car car;
	
	public CarDecorator(Car car) {
		this.car = car;
	}

	@Override
	public void assemble() {
		// TODO Auto-generated method stub
		this.car.assemble();
	}

}
