package com.citibank.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class ConnectionTest {

	public static void main(String[] args) {
		
		System.out.println("Main Start");
		Connection connection = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
//			DriverManager.registerDriver("com.mysql.cj.jdbc.Driver");
			System.out.println("1. Driver Loaded Successfully");
			
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/citibankdb", "root", "root");
//			Statement statement = connection.createStatement();
//			int insertRow = statement.executeUpdate("insert into customer_details(customer_id, name, address) values(1,Debayan,PUNE)");
//			
//			if (insertRow > 0)
//				System.out.println("Row Inserted");
//			else
//				System.out.println("Row Not Inserted");
//			
//			ResultSet resultSet = statement.executeQuery("select * from customer_details");
//			while(resultSet.next()) {
//				System.out.println(resultSet.getInt(1) + " " + resultSet.getString(2) + " " + resultSet.getString(3)); 
//			}
//			statement.close();
			String sql = "insert into customer_details(name,addresss) values(?,?)";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
//			preparedStatement.setString(1, "Paritosh");
//			preparedStatement.setString(2, "Delhi");
//			int rowCount = preparedStatement.executeUpdate();
//			if(rowCount > 0)
//				System.out.println("Row Inserted");
//			else
//				System.out.println("No Rows Inserted");
			System.out.println("-----------------------------");
			String getTable = "Select * from customer_details";
			ResultSet resultSet = preparedStatement.executeQuery(getTable);
			
			while(resultSet.next()) {
				System.out.println(resultSet.getInt(1) + " " + resultSet.getString(2) + " " + resultSet.getString(3));
			}
				
				
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("Database Driver Not Found");
			e.printStackTrace();
		}
		finally {
			try {
				
			connection.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		System.out.println("-----------------------------");
		System.out.println("Main End");

	}

}
