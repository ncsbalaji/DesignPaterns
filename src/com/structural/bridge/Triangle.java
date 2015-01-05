package com.structural.bridge;

public class Triangle extends Shape {

	public Triangle(Color color) {
		super(color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void applyColor() {
		// TODO Auto-generated method stub
		System.out.println("Triangle filled with color");
		color.applyColor();
	}

}
