package com.creational;

public class Singleton {

	private static Singleton instance;
	
	private Singleton(){
		
	}
	
	public static synchronized Singleton getSingleton(){
		
		if(instance == null){
			instance = new Singleton();
		}
		
		return instance;
	}
	
	public void doSomething(){
		
	}

}
