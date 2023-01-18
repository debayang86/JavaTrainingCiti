package com.citibank.main.domain;

public class Savings extends Account {
	private boolean isSalary;

	public Savings() {
		System.out.println("Daefault constructor of Savings");
	}

	public Savings(int accountNumber, String name, double balance, boolean isSalary) {
		super(accountNumber, name, balance);
		System.out.println("4 Parameter constructor of Savings");
		this.isSalary = isSalary;
	}

	public boolean isSalary() {
		return isSalary;
	}

	public void setSalary(boolean isSalary) {
		this.isSalary = isSalary;
	}

	@Override
	public boolean withdraw(double amount) {
		if (amount > 0 && amount <= getBalance()) {
			if (isSalary && amount <= getBalance()) {
				setBalance(getBalance() - amount);
				return true;
			}
			if (isSalary == false && getBalance() - amount >= 1500)
				setBalance(getBalance() - amount);
			return true;
		}
		return false;
	}

	public boolean deposit(double amount) {
		if (amount > 0) {
			setBalance(getBalance() + amount);
			return true;
		}
		return false;

	}

}
