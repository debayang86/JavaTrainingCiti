package com.citibank.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.citibank.main.domain.Customer;
import com.citibank.main.service.CustomerService;

public class CustomerJDBCMain {

	public static void main(String[] args) {
		System.out.println("Main Starts");
		Scanner scanner = new Scanner(System.in);
		List<Customer> customersList = new ArrayList();
		CustomerService customerService = new CustomerService();
		System.out.println("--------------------------------");
		customersList = customerService.getAllCustomers();
		for (Customer customer : customersList) {
			System.out.println(customer);
		}
		System.out.println("--------------------------------");
		
//		int customerId = scanner.nextInt();
//		Customer customer = customerService.getCustomerbyCustomerId(customerId);
//		if(customer!= null) {
//			System.out.println(customer);
//		}else {
//			System.out.println("No Customer Found For Given Id");
//		}
		System.out.println("Enter Customer Id to Add : ");
		int customerId = scanner.nextInt();
		System.out.println("Enter Customer Name to Add : ");
		String name = scanner.next();
		System.out.println("Enter Customer Address to Add : ");
		String address = scanner.next();
		
		Customer customer = new Customer(customerId, name, address);
		boolean customerAdded = customerService.addNewCustomer(customer);
		if (customerAdded) {
			customersList = customerService.getAllCustomers();
			for (Customer customer1 : customersList) {
				System.out.println(customer1);
			}
		}
		System.out.println("--------------------------------");
		
		
		System.out.println("Main Ends");
	}

}
