package com.structural.proxy;

public class ProxyInternetAccess implements InternetAccess {
	
	private String employeeName;
	private int role;
	private InternetAccess realInternetAccess;
	
	public ProxyInternetAccess(String employeeName, int role) {
		this.employeeName = employeeName;
		this.role = role;
	}

	@Override
	public void grantInternetAccess() {
		// TODO Auto-generated method stub
		if(role>5){
			realInternetAccess = new RealInternetAccess(employeeName);
			realInternetAccess.grantInternetAccess();
		}else{
			System.out.println("Internet access is only granted for above role 5 employees!!");
		}
	}

	
}
