package com.structural.bridge;

public class TestBridgePattern {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape triangle = new Triangle(new GreenColor());
		triangle.applyColor();
		
		Shape pentagon = new Pentagon(new RedColor());
		pentagon.applyColor();
	}

}
