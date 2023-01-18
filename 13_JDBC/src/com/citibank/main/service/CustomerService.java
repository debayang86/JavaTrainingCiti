package com.citibank.main.service;

import java.util.List;

import com.citibank.main.domain.Customer;
import com.citibank.main.repository.CustomerRepository;
import com.citibank.main.repository.CustomerRepositoryInterface;

public class CustomerService implements CustomerRepositoryInterface {
	private CustomerRepository customerRepository = new CustomerRepository();

	@Override
	public boolean addNewCustomer(Customer customer) {
		
		return customerRepository.addNewCustomer(customer);
	}

	@Override
	public Customer getCustomerbyCustomerId(int customerId) {
		
		return customerRepository.getCustomerbyCustomerId(customerId);
	}

	@Override
	public List<Customer> getAllCustomers() {
		return customerRepository.getAllCustomers();
	}

	@Override
	public boolean updateCustomerbyCustomerId(Customer customer) {
		return customerRepository.updateCustomerbyCustomerId(customer);
	}

	@Override
	public boolean deleteCustomerByCustomerId(int customerId) {
		return customerRepository.deleteCustomerByCustomerId(customerId);
	}

}
