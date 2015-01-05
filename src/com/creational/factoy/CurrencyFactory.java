package com.creational.factoy;

public class CurrencyFactory {

	public static Currency createCurrency(String country){
		
		if(country.equalsIgnoreCase("India")){
			return new Rupee();
		} else if(country.equalsIgnoreCase("Singapore")){
			return new SGDollar();
		} else if(country.equalsIgnoreCase("US")){
			return new USDollar();
		} 
		
		throw new IllegalArgumentException();
	}
}
