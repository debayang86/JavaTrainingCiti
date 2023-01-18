package com.citibank.main;

import java.util.List;

import com.citibank.main.domain.Customer;
import com.citibank.main.service.CustomerService;

public class CustomerMainV2 {

	public static void main(String[] args) {
		CustomerService customerService = new CustomerService();
		System.out.println("Adding Customers..");
		
		Customer customer1 = new Customer(1, "DEBAYAN", "PUNE");
		Customer customer2 = new Customer(2, "VIVEK", "MUMBAI");
		Customer customer3 = new Customer(3, "PARITOSH", "DELHI");
		Customer customer4 = new Customer(4, "AMOL", "NASIK");
		Customer customer5 = new Customer(5, "KAPIL", "INDORE");
		
		System.out.println("Adding First Customer " + customerService.addNewCustomer(customer1));
		System.out.println("Adding Second Customer " + customerService.addNewCustomer(customer2));
		System.out.println("Adding Third Customer "+ customerService.addNewCustomer(customer3));
		System.out.println("Adding Fourth Customer " + customerService.addNewCustomer(customer4));
		System.out.println("Adding Fifth Customer " + customerService.addNewCustomer(customer5));
		
		System.out.println("-------------------------");
		
		System.out.println("Retrieving All Customers from Database : ");
		List<Customer> CustomerList = customerService.getAllCustomers();
		for (Customer customer : CustomerList) {
			System.out.println(customer);
		}
		
		System.out.println("-------------------------");
		System.out.println("Retrieving Customer by Customer Id : ");
		System.out.println((customerService.getCustomerbyCustomerId(2)));
		
		System.out.println("-------------------------");
		System.out.println("Updating Customer : ");
		
		Customer customerUpdateable = new Customer(5, "KAPIL R", "SRINAGAR");
		boolean result = customerService.updateCustomerbyCustomerId(customerUpdateable);
		
		if(result)
			System.out.println("Customer Updated Successfully");
		else
			System.out.println("Customer Not Found");
		
		System.out.println("Retrieving All Customers from Database Post Updation : ");
		for (Customer customer : CustomerList) {
			System.out.println(customer);
		}

		System.out.println("-------------------------");
		System.out.println("Deleting Customer : ");
		boolean deleteResult = customerService.deleteCustomerByCustomerId(8);
		if (deleteResult)
			System.out.println("Customer Deleted Successfully");
		else
			System.out.println("Customer Not Found");
		
		System.out.println("Retrieving All Customers from Database Post Deletion : ");
		for (Customer customer : CustomerList) {
			System.out.println(customer);
		}
	}

}
