package com.citibank.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.citibank.main.domain.Customer;

public class CustomerMain {

	public static void main(String[] args) {
		Customer customer1 = new Customer(1, "DEBAYAN", "PUNE");
		Customer customer2 = new Customer(2, "VIVEK", "MUMBAI");
		Customer customer3 = new Customer(3, "PARITOSH", "DELHI");
		Customer customer4 = new Customer(4, "AMOL", "NASIK");
		Customer customer5 = new Customer(5, "KAPIL", "INDORE");

		List<Customer> customerList = new ArrayList<>();

		customerList.add(customer1);
		customerList.add(customer2);
		customerList.add(customer3);
		customerList.add(customer4);
		customerList.add(customer5);

		printAllCustomers(customerList);

		Scanner scanner = new Scanner(System.in);
//		int customerId;
//		System.out.println("Enter Customer Id : ");
//		customerId = scanner.nextInt();
//		printCustomerByCustomerId(customerList, customerId);
//		scanner.close();

		System.out.println("Enter Customer Id To Be Updated: ");
		int customerId = scanner.nextInt();

		scanner.nextLine();
		System.out.println("Enter New Name : ");
		String name = scanner.nextLine();

		System.out.println("Enter New Address : ");
		String address = scanner.nextLine();

		Customer updateableCustomer = new Customer(customerId, name, address);
		updateCustomerByCustomerId(customerList, updateableCustomer);
		printAllCustomers(customerList);
		scanner.close();
//		
//		System.out.println("Enter Customer Id : ");
//		int customerId = scanner.nextInt();
//		deleteCustomerByCustomerId(customerList, customerId);
//		printAllCustomers(customerList);

	}

	private static void deleteCustomerByCustomerId(List<Customer> customerList, int customerId) {
		boolean flag = false;
		System.out.println("Searching..");
		for (Customer customer : customerList) {
			if (customer.getCustomerId() == customerId) {
				System.out.println("Match Found!");
				System.out.println(customer + " is Being Deleted");
				customerList.remove(customer);
				flag = true;
				System.out.println("Customer Details Deleted From List");
				break;
			}
		}
		if (flag == false)
			System.out.println("No Customer Found For Given Customer ID");
	}
		

	private static void printCustomerByCustomerId(List<Customer> customerList, int customerId) {
		boolean flag = false;
		System.out.println("Searching..");
		for (Customer customer : customerList) {
			if (customer.getCustomerId() == customerId) {
					System.out.println(customer);
				flag = true;
				System.out.println("Customer Found");
				break;
			}
		}

		if (flag == false)
			System.out.println("No Customer Found For Given Customer ID");
	}

	private static void printAllCustomers(List<Customer> customerList) {
		System.out.println("All Customers");
		for (Customer customer : customerList) {
			System.out.println(customer);
		}
	}

	private static void updateCustomerByCustomerId(List<Customer> customerList, Customer customer) {
		boolean flag = false;
		System.out.println("Searching..");
		for (Customer c : customerList) {
			if (c.getCustomerId() == customer.getCustomerId()) {
				c.setName(customer.getName());
				c.setAddress(customer.getAddress());
				System.out.println(customer);
				flag = true;
				System.out.println("Customer Details Updated Successfully");
				break;
			}
		}
		if (flag == false) {
			System.out.println("No Customer Found For Given Customer ID");
			System.out.println("Do you Want To Add New Customer In List (Y/N): ");
			Scanner scanner = new Scanner(System.in);
			char choice = scanner.next().charAt(0);
			if (choice =='Y' || choice == 'y') {
				customerList.add(customer);
				flag = true;
				System.out.println("New Customer Added");
//				break;
			}
			scanner.close();
		}	
	}

}
