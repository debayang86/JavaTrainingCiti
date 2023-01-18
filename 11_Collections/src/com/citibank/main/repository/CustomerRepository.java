package com.citibank.main.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.citibank.main.domain.Customer;
import com.citibank.main.factory.ConnectionFactory;

public class CustomerRepository implements CustomerRepositoryInterface {
	private List<Customer> customersList = new ArrayList<>();
	private Connection connection;
	private PreparedStatement preparedStatement;
	private ResultSet resultSet;
	private String sql;
	private int rowCount;
	private String driverName = "com.mysql.cj.jdbc.Driver";

	@Override
	public boolean addNewCustomer(Customer customer) {
		connection = new ConnectionFactory().getConnection();
		sql="insert customer_details(name,addresss) values(?,?)";
		try {
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, customer.getName());
			preparedStatement.setString(2, customer.getAddress());
			rowCount = preparedStatement.executeUpdate();
			if(rowCount > 0)
				return true;
		} catch(SQLException e) {
			System.out.println("Exception while executing query");
			System.out.println(e.getMessage());
			return false;
		}finally {
			try {
				connection.close();
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return customersList.add(customer);
	}

	@Override
	public Customer getCustomerbyCustomerId(int customerId) {
//		try {
//			Class.forName(driverName);
//			connection = new ConnectionFactory().getConnection();
//			sql = "select * from customer_details where customer_id =";
//			try {
//				preparedStatement = connection.prepareStatement(sql);
//				resultSet = preparedStatement.executeQuery();
//				while (resultSet.next()) {
//					int customerId = resultSet.getInt("customer_id");
//					String name = resultSet.getString("name");
//					String address = resultSet.getString("addresss");
//					Customer customer = new Customer(customerId, name, address);
//					customersList.add(customer);
//				}
//
//			} catch (SQLException e) {
//				System.out.println("Exception in query execution");
//				e.printStackTrace();
//			}
//
//		} catch (ClassNotFoundException e) {
//			System.out.println("Failed To Load Driver");
//			e.printStackTrace();
//		}
//		for (Customer customer : customersList) {
//			if (customer.getCustomerId() == customerId) {
//				return customer;
//			}
//			break;
//		}
		return null;
	}	

	@Override
	public List<Customer> getAllCustomers() {
		try {
			customersList.clear();
			Class.forName(driverName);
			connection = new ConnectionFactory().getConnection();
			sql = "select * from customer_details";
			try {
				preparedStatement = connection.prepareStatement(sql);
				resultSet = preparedStatement.executeQuery();
				while (resultSet.next()) {
					int customerId = resultSet.getInt("customer_id");
					String name = resultSet.getString("name");
					String address = resultSet.getString("addresss");
					Customer customer = new Customer(customerId, name, address);
					customersList.add(customer);
				}

			} catch (SQLException e) {
				System.out.println("Exception in query execution");
				e.printStackTrace();
			}

		} catch (ClassNotFoundException e) {
			System.out.println("Failed To Load Driver");
			e.printStackTrace();
		}

		return customersList;
	}

	@Override
	public boolean updateCustomerbyCustomerId(Customer customer) {
		boolean flag = false;
		for (Customer c : customersList) {
			if (c.getCustomerId() == customer.getCustomerId()) {
				c.setName(customer.getName());
				c.setAddress(customer.getAddress());
				System.out.println(customer);
				flag = true;
				break;
			}
		}
		return flag;
	}

	@Override
	public boolean deleteCustomerByCustomerId(int customerId) {
		for (Customer customer : customersList) {
			if (customer.getCustomerId() == customerId) {
				return customersList.remove(customer);
			}
		}
		return false;
	}


}
