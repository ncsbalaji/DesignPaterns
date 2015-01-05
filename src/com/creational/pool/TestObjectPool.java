package com.creational.pool;

import java.sql.Connection;

public class TestObjectPool {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JDBCConnectionPool jdbcConnectionPool = new JDBCConnectionPool("10.2.3.4", "Chaten", "password");
		
		Connection connection = jdbcConnectionPool.checkOut();
		
		jdbcConnectionPool.checkIn(connection);
	}
	

}
