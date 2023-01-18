package com.citibank.main;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import com.citibank.main.domain.Customer;
import com.citibank.main.domain.Customer;

public class CustomerMainV4 implements Comparable {
			public static void main(String[] args) {
				SortedSet<Customer> customerTree = new TreeSet();
				
				Customer customer1 = new Customer(1, "DEBAYAN", "PUNE");
				Customer customer2 = new Customer(2, "VIVEK", "MUMBAI");
				Customer customer3 = new Customer(3, "PARITOSH", "DELHI");
				Customer customer4 = new Customer(4, "AMOL", "NASIK");
				Customer customer5 = new Customer(5, "KAPIL", "INDORE");
				Customer customer6 = new Customer(5, "KAPIL", "INDORE");
				
				System.out.println("Adding First Customer " + customerTree.add(customer1));
				System.out.println("Adding Second Customer " + customerTree.add(customer2));
				System.out.println("Adding Third Customer "+ customerTree.add(customer3));
				System.out.println("Adding Fourth Customer " + customerTree.add(customer4));
				System.out.println("Adding Fifth Customer " + customerTree.add(customer5));

				System.out.println("Adding Sixth Customer " + customerTree.add(customer6));
				
				for(Customer customer: customerTree) {
					System.out.println(customer);
					
				}
			}

			@Override
			public int compareTo(Object o) {
				// TODO Auto-generated method stub
				return 0;
			}
}



