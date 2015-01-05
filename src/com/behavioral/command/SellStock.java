package com.behavioral.command;

public class SellStock implements Order {

	private Stock abcStock;

	public SellStock(Stock abcStock){
		this.abcStock = abcStock;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub

	}

}
