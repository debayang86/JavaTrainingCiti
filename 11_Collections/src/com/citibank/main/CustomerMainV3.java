package com.citibank.main;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

import com.citibank.main.domain.Customer;

public class CustomerMainV3 {

	public static void main(String[] args) {
		Set<Customer> customerSet = new HashSet();
		
		Customer customer1 = new Customer(1, "DEBAYAN", "PUNE");
		Customer customer2 = new Customer(2, "VIVEK", "MUMBAI");
		Customer customer3 = new Customer(3, "PARITOSH", "DELHI");
		Customer customer4 = new Customer(4, "AMOL", "NASIK");
		Customer customer5 = new Customer(5, "KAPIL", "INDORE");
		Customer customer6 = new Customer(5, "KAPIL", "INDORE");
		
		System.out.println("First Customer : "+ customer1.hashCode());
		System.out.println("Adding First Customer " + customerSet.add(customer1));
		System.out.println("Adding Second Customer " + customerSet.add(customer2));
		System.out.println("Adding Third Customer "+ customerSet.add(customer3));
		System.out.println("Adding Fourth Customer " + customerSet.add(customer4));
		System.out.println("Fifth Customer : "+ customer5.hashCode());
		System.out.println("Adding Fifth Customer " + customerSet.add(customer5));
		System.out.println("Sixth Customer : "+ customer6.hashCode());
		System.out.println("Adding Sixth Customer " + customerSet.add(customer6));
		
		for(Customer customer: customerSet) {
			System.out.println(customer);
			
		}
	}

}
