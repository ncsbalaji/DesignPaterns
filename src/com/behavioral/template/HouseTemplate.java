package com.behavioral.template;

public abstract class HouseTemplate {
	
	public final void buildHouse(){
		buildFoundation();
		buildPillars();
		buildWalls();
		buildWindows();
		System.out.println("House is Built");
	}

	public void buildWindows(){
		System.out.println("Build Glass Windows");
	}
	
	public abstract void buildWalls();
	
	public abstract void buildPillars();
	
	public void buildFoundation(){
		System.out.println("Building foundation with cement, iron rods and sand");
	}
}
