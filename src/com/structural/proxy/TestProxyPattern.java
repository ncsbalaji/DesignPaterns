package com.structural.proxy;

public class TestProxyPattern {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InternetAccess internetAccess = new ProxyInternetAccess("emp1", 4);
		internetAccess.grantInternetAccess();
	}

}
