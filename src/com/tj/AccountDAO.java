package com.tj;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AccountDAO {
	public static void main(String[] args) {
		
		try {
			String url = "jdbc:mysql://localhost:3306/mydb";
			Connection conn = DriverManager.getConnection(url, "root","Akanksha02@");
			System.out.println("Database Connected....");
			Statement stmt = conn.createStatement();
			//String sql = "INSERT INTO account VALUES (1000, 'pqr', 'xyz', 12300)";
	        // stmt.executeUpdate(sql);
	         System.out.println("Data Inserted!!!");
	         ResultSet resultSet = stmt.executeQuery("select * from account");
				while(resultSet.next()) {
					System.out.println(resultSet.getString("firstname"));
				}
		}catch(SQLException e) {
			e.printStackTrace();
		}

	}
}
