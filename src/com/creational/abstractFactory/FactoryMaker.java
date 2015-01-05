package com.creational.abstractFactory;

public class FactoryMaker {
	
	public static AbstractFactory getFactory(String choice){
		
		if(choice.equalsIgnoreCase("one")){
			return new ConcreteFactory1();
		} else {
			return new ConcreteFactory2();
		}
	}

}
