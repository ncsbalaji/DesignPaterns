package com.creational;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Singleton object1 = Singleton.getSingleton();
		System.out.println(object1.hashCode());
		
		Singleton object2 = Singleton.getSingleton();
		System.out.println(object2.hashCode());
	}

}
