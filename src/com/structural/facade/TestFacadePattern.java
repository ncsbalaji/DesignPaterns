package com.structural.facade;

import java.sql.Connection;

public class TestFacadePattern {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String tableName = "Employee";
		
		//generating MySQl html and pdf with out using facade pattern
		Connection connection = MySQLHelper.getMySqlConnection();
		MySQLHelper mySQLHelper = new MySQLHelper();
		mySQLHelper.generateMysqlHtmlReport(tableName, connection);
		mySQLHelper.generateMySqlPdfReport(tableName, connection);
		
		//generating MySQl html and pdf using facade pattern
		FacadeHelper.generateReport(FacadeHelper.DBTypes.MySQL, FacadeHelper.ReportTypes.Html, tableName);
		FacadeHelper.generateReport(FacadeHelper.DBTypes.MySQL, FacadeHelper.ReportTypes.Pdf, tableName);
	}

}
