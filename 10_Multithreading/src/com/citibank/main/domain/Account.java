package com.citibank.main.domain;

public class Account {
	private double balance;
	
	public Account (double balance) {
		super();
		this.balance = balance;
	}
	public synchronized boolean withdraw(double amount) {
		if (balance!= 0) {
			System.out.println("Withdrawing" + " " + amount);
			balance -= amount;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			System.out.println("Withdrawn" + " " +amount);
			System.out.println("Balance : " + " " + balance);
			return true;
		}
		return	false;
	}

	public boolean deposit(double amount) {
		System.out.println("Depositing" + " " + amount);
		balance += amount;
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		System.out.println("Deposited" + " " + amount);
		System.out.println("Balance : " + " "+ balance);
		return true;
	}
	
}
