package com.creational.prototype;

public class Movie implements PrototypeCapable {
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public Movie clone() throws CloneNotSupportedException {
		System.out.println("cloning movie object ... ");
		return (Movie) super.clone();
	}
	
	@Override
	public String toString(){
		return "Movie";
	}

}
