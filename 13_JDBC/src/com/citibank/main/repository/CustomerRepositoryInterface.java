package com.citibank.main.repository;

import java.util.List;

import com.citibank.main.domain.Customer;

public interface CustomerRepositoryInterface {
	
	public boolean addNewCustomer(Customer customer); 
	public Customer getCustomerbyCustomerId(int customerId);
	public List<Customer> getAllCustomers();
	public boolean updateCustomerbyCustomerId(Customer customer);
	public boolean deleteCustomerByCustomerId(int customerId);

}
