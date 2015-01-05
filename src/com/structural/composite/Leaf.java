package com.structural.composite;

public class Leaf implements Component {
	
	String name;

	public Leaf(String name) {
		this.name = name;
	}

	@Override
	public void sayHello() {
		// TODO Auto-generated method stub
		System.out.println(name + " leaf says hello");
	}

	@Override
	public void sayGoodbye() {
		// TODO Auto-generated method stub
		System.out.println(name + " leaf says goodbye");
	}

}
