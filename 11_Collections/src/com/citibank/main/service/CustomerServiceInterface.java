package com.citibank.main.service;

import java.util.List;

import com.citibank.main.domain.Customer;

public interface CustomerServiceInterface {
	
	public boolean addNewCustomer(Customer customer); 
	public Customer getCustomerbyCustomerId(int customerId);
	public List<Customer> getAllCustomers();
	public boolean updateCustomerbyCustomerId(Customer customer);
	public boolean deleteCustomerByCustomerId(int customerId);


}
