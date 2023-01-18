package com.citibank.main;

import java.util.Scanner;

import com.citibank.main.domain.Account;

public class BankingApplicationMainV2 {

	public static void main(String[] args) {
		
		System.out.println("Welcome to Citibank");
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter Account Number : ");
		int accountNumber = scanner.nextInt();
		
		System.out.print("Enter Name : ");
		String name = scanner.next();
		
		System.out.print("Enter Balance : ");
		double balance = scanner.nextDouble();
		
		Account account = new Account();
		
		account.setAccountNumber(accountNumber);
		
		account.setName(name);
		
		account.setBalance(balance);
		
		System.out.println("Your account is opened successfully");
		
		System.out.println("Account Number : " + account.getAccountNumber());
		
		System.out.println("Name : " + account.getName());
		
		System.out.println("Balance : " + account.getBalance());		
	
	}

}
