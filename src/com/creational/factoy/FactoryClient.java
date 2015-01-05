package com.creational.factoy;

public class FactoryClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Currency currency = CurrencyFactory.createCurrency("india");
		System.out.println(currency.getSymbol());
		
		currency = CurrencyFactory.createCurrency("singapore");
		System.out.println(currency.getSymbol());
		
		currency = CurrencyFactory.createCurrency("us");
		System.out.println(currency.getSymbol());
		
	}

}
