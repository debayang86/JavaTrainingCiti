package com.citibank.main;

import com.citibank.main.domain.Account;

public class BankingApplicationMain {

	public static void main(String[] args) {
		//Object Creation
		Account account =new Account();
		
		account.setAccountNumber(10001);
		account.getAccountNumber();
		
		System.out.println("Main Start");
		
		account.deposit(2430.28);
		account.withdraw(431.78);
		
		System.out.println("Main End");
	}

}
