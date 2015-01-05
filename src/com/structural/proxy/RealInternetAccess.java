package com.structural.proxy;

public class RealInternetAccess implements InternetAccess {

	private String employee;
	
	public RealInternetAccess(String employee) {
		this.employee = employee;
	}
	
	@Override
	public void grantInternetAccess() {
		// TODO Auto-generated method stub
		System.out.println("Internet Access granted for employee: "+employee);
	}


}
