package com.citibank.main;

import java.util.Scanner;

import com.citibank.main.domain.Account;
import com.citibank.main.domain.AccountThread;

public class AccountThreadMain {

	public static void main(String[] args) {
		int option;
		double amount;
		Account account = new Account(50000.00);
		Scanner scanner = new Scanner(System.in);

		System.out.println("Transaction Menu");
		System.out.println("1. Withdraw");
		System.out.println("2. Deposit");
		System.out.println("Enter Your Choice (1/2)): ");

		option = scanner.nextInt();
		if (option == 1) {
			System.out.println("Amount to Withdraw : ");
			amount = scanner.nextDouble();
			AccountThread accountThread = new AccountThread(account, option, amount);
			Thread withdrawThread = new Thread(accountThread);
			withdrawThread.setPriority(8);
			withdrawThread.start();
			try {
				withdrawThread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Transaction Completed");
		}

		if (option == 2) {
			System.out.println("Amount to Deposit : ");
			amount = scanner.nextDouble();
			AccountThread accountThread1 = new AccountThread(account, option, amount);
			Thread depositThread = new Thread(accountThread1);
			depositThread.start();
		}
	}

}
