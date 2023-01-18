package com.citibank.main.repository;

import java.util.ArrayList;
import java.util.List;

import com.citibank.main.domain.Customer;

public class CustomerRepository implements CustomerRepositoryInterface {
	private List<Customer> customersList = new ArrayList<>();

	@Override
	public boolean addNewCustomer(Customer customer) {
		return customersList.add(customer);		
	}

	@Override
	public Customer getCustomerbyCustomerId(int customerId) {
		for (Customer customer : customersList) {
			if (customer.getCustomerId() == customerId) {
				return customer;
			}
			break;				
		}			
		return null;
	}

	@Override
	public List<Customer> getAllCustomers() {
		for (Customer customer : customersList)
			return customersList;
		
		return null;
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
