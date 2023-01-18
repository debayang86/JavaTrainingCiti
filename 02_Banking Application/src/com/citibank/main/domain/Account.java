package com.citibank.main.domain;

import java.lang.Math;

public abstract class Account {
	private int accountNumber;
	private String name;
	private double balance;
	
//	public void setAccountNumber(int accountNumber) {
//		this.accountNumber  = accountNumber;
//	}
//	
//	public int getAccountNumber() {
//		System.out.println("Account Number: " + accountNumber);
//		return accountNumber;
//	}
	public Account() {
		System.out.println("Default Constructor of Account");
	}
	
	public Account(int accountNumber, String name, double balance) {
		System.out.println("3 Parameterized Constructor of Account");;
		this.accountNumber=accountNumber;
		this.name=name;
		this.balance=balance;
	}
	
	public abstract boolean withdraw(double amount);// {
//		System.out.println("Withdraw() Called");
//		if (amount >0 && amount < balance) {
//			balance = balance - amount;
//			System.out.println("Withdrawn Amount : " + amount);
//			System.out.println("Current Amount : " + balance);
//		}
//		return true;
//	}
	
	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public abstract boolean deposit(double amount); //{
//		//withdraw();
//		System.out.println("Deposit()  Called");
//		if (amount > 0) {
//			balance = balance + amount;
//		System.out.println("Deposited Amount : " + amount);
//		System.out.println("Current Balance : " + balance);
//		}
//		return true;
//			
//	}

}
