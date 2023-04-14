package feeproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Dbconnection {
	private static String dbUrl = "jdbc:mysql:// localhost:3306/";
    private static String dbUsername = "root";
    private static String dbPassword = "SYSTEM";
    private static String dbName = "feereport";
	public static void main(String[]args) {
		
		try {
			Connection conn=DriverManager.getConnection(dbUrl+ dbName, dbUsername, dbPassword);
			Statement stmt=conn.createStatement();
			String sql="insert into Accountant(name,password,email,contact) values('Vishnu','1234','aaa','123')";
    		stmt.executeUpdate(sql);
    		System.out.println("Entered successfully");
			
			
		}
		catch(Exception e) {
			System.out.println(e);
			
		}
		
	}

}
