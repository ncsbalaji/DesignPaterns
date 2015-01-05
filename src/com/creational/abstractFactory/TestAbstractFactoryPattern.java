package com.creational.abstractFactory;

public class TestAbstractFactoryPattern {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractFactory factory = FactoryMaker.getFactory("one");
		AbstractProductA productA = factory.createProductA();
		
		factory = FactoryMaker.getFactory("two");
		productA = factory.createProductA();
		
	}

}
