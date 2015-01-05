package com.creational.pool;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCConnectionPool extends ObjectPool<Connection> {
	
	String dsn, user, password;
	
	

	public JDBCConnectionPool(String dsn, String user, String password) {
		super();
		
		try{
			Class.forName(dsn).newInstance();
		}catch (Exception exception) {
			// TODO: handle exception
			exception.printStackTrace();
		}
		
		this.dsn = dsn;
		this.user = user;
		this.password = password;
	}

	@Override
	protected Connection create() {
		// TODO Auto-generated method stub
		try{
			return DriverManager.getConnection(dsn, user, password);
		}catch (Exception exception) {
			// TODO: handle exception
			exception.printStackTrace();
			return null;
		}
		
	}

	@Override
	public boolean validate(Connection object) {
		// TODO Auto-generated method stub
		try{
			return (!object.isClosed());
		}catch (Exception exception) {
			// TODO: handle exception
			exception.printStackTrace();
			return false;
		}
	}

	@Override
	public void expire(Connection object) {
		// TODO Auto-generated method stub
		try{
			object.close();
			
		}catch (Exception exception) {
			// TODO: handle exception
			exception.printStackTrace();
		}
	}

}
