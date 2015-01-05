package com.structural.facade;

import java.sql.Connection;

public class FacadeHelper {
	
	public static enum DBTypes{
		MySQL, Oracle
	}

	public static enum ReportTypes{
		Html, Pdf
	}
	
	public static void generateReport(DBTypes dbTypes, ReportTypes reportTypes, String tableName){
		
		Connection connection = null;
		
		switch (dbTypes) {
		case MySQL:
			
			connection = MySQLHelper.getMySqlConnection();
			MySQLHelper mySQLHelper = new MySQLHelper();
			
			switch (reportTypes) {
			
			case Html:
				mySQLHelper.generateMysqlHtmlReport(tableName, connection);
				break;

			case Pdf:
				mySQLHelper.generateMySqlPdfReport(tableName, connection);
				break;
			}
			
			break;

		case Oracle:
			
			connection = OracleHelper.getOracleDBConnection();
			OracleHelper oracleHelper = new OracleHelper();
			
			switch (reportTypes) {
			case Html:
				
				oracleHelper.generateOracleHtmlReport(tableName, connection);
				break;

			case Pdf:
				oracleHelper.generateOraclePdfReport(tableName, connection);
				break;
			}
			
			break;
		}
		
	}
}
