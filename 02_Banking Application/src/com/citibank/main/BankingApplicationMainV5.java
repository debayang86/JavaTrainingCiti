package com.citibank.main;

import com.citibank.main.domain.Current;

public class BankingApplicationMainV5 {

	public static void main(String[] args) {

		Current current = new Current(98046, "Debayan", 10000, 50000, 50000);

		if (current.withdraw(5000)) {

			System.out.println("Balance : " + current.getBalance());
			System.out.println("Overdraft Limit : " + current.getOverdraftLimit());
		}
		
		
		if (current.withdraw(20000)) {
			
			System.out.println("Balance : " + current.getBalance());
			System.out.println("Overdraft Limit : " + current.getOverdraftLimit());
		}
		if(current.deposit(10000)) {

			System.out.println("Balance :: " + current.getBalance());
			
			System.out.println("Overdraft Limit :: " + current.getOverdraftLimit());
	
		}
	}

}
