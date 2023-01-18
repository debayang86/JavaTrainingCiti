package com.citibank.main.domain;


public class AccountThread implements Runnable {
	private Account account;
	private double amount;
	private int transactionChoice;
	
	public AccountThread(Account account, int transactionChoice, double amount) {
		super();
		this.transactionChoice = transactionChoice;
		this.account = account;
		this.amount = amount;
	}


	@Override
	public void run() {
		if (transactionChoice == 1) 
			account.withdraw(amount);
		else
			account.deposit(amount);
	}

}
