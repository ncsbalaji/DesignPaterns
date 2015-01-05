package com.structural.flyweight;

public class Factory {
	
	private Gazillion[] pool;
	
	public Factory (int maxRows) {
		pool = new Gazillion[maxRows];
	}
	
	public Gazillion getFlyWeight(int row){
		
		if(pool[row]==null){
			pool[row] = new Gazillion(row);
		}
		
		return pool[row];
	}

}
