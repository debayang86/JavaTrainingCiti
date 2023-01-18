package com.citibank.main;

import java.util.Scanner;

import com.citibank.main.domain.Account;
//import com.citibank.main.domain.Account;
import com.citibank.main.domain.Savings;

public class BankingApplicationMainV4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Savings savings;

		int accountNumber;
		String name;
		String continueChoice;
		double balance;
		char option;
		double amount;
		boolean isSalary;

		System.out.println("Enter Account Number : ");
		accountNumber = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter Name : ");
		name = scanner.nextLine();
		System.out.println("Enter Balance : ");
		balance = scanner.nextDouble();
		System.out.println("Do you Want to Open Salary Account (true/false) : ");
		isSalary = scanner.nextBoolean();

//		Account account = new Account();
		savings = new Savings(accountNumber, name, balance, isSalary);

		System.out.println("Account Opened Successfully");
		System.out.println("Account Number : " + savings.getAccountNumber());
		System.out.println("Name : " + savings.getName());
		System.out.println("Balance : " + savings.getBalance());

		do {
			showTransactionMenu(scanner, savings);
			System.out.print("Do you want to Continue ? ");
			continueChoice = scanner.next();

		} while (continueChoice.equalsIgnoreCase("yes") || continueChoice.equalsIgnoreCase("y"));
		System.out.println("Thank You!!");

	}

	private static void showTransactionMenu(Scanner scanner, Account account) {
		char option;
		double amount;
		System.out.println("Transaction Menu");
		System.out.println("----------------");
		System.out.println("Press 1 For Deposit");
		System.out.println("Press 2 For Withdraw");
		System.out.println("Press 3 For Check Balance");
		System.out.println("Press 4 For Exit");
		System.out.print("Enter Your Choice : ");
		option = scanner.next().charAt(0);

		switch (option) {
		case '1':
			System.out.print("Enter Amount To Deposit : ");
			amount = scanner.nextDouble();
			if (account.deposit(amount))
				System.out.println("Deposit Successful!!");
			else
				System.out.println("Deposit Failed!!");
		case '2':
			System.out.print("Enter Amount To Withdraw : ");
			amount = scanner.nextDouble();
			if (account.withdraw(amount))
				System.out.println("Withdrawal Successful!!");
			else
				System.out.println("Withdrawal Failed!!");
			break;
		case '3':
			System.out.println("Balance : " + account.getBalance());
			break;
		case '4':
			System.exit(0);
			break;
		default:
			System.out.println("Invalid Choice");
			break;
		}
	}
}
