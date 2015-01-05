package com.creational.prototype;

import com.creational.prototype.PrototypeFactory.ModelType;

public class TestPrototypePattern {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try{
			
			String moviePrototype = PrototypeFactory.getInstance(ModelType.MOVIE).toString();
			System.out.println(moviePrototype);
			
			String albumPrototype = PrototypeFactory.getInstance(ModelType.ALBUM).toString();
			System.out.println(albumPrototype);
			
			String showPrototype = PrototypeFactory.getInstance(ModelType.SHOW).toString();
			System.out.println(showPrototype);
			
		} catch(CloneNotSupportedException exception){
			exception.printStackTrace();
		}
	}

}
