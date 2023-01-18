package com.citibank.main.domain;

public class Current extends Account {
	private double overdraftLimit;
	private double remBalance;
	private double initialOverdraftBalance;

	public Current() {
		System.out.println("Default Constructor of Current");
	}

	public Current(int accountNumber, String name, double balance, double overdraftLimit){//, double intialOverdraftBalance) {
		super(accountNumber, name, balance);
		this.overdraftLimit = overdraftLimit;
		this.initialOverdraftBalance = overdraftLimit;
	}

	public double getOverdraftLimit() {
		return overdraftLimit;
	}

	public void setOverdraftLimit(double overdraftLimit) {
		this.overdraftLimit = overdraftLimit;
	}

	@Override
	public boolean withdraw(double amount) {

		if (amount > 0 && amount <= getBalance()) {

			setBalance(getBalance() - amount);
			return true;
		}

		if (amount > 0 && amount > getBalance()) {

			remBalance = getBalance();
			setBalance(getBalance() - getBalance());
			overdraftLimit -= (amount - remBalance);
			return true;
		}
		return false;
	}

	@Override
	public boolean deposit(double amount) {

		if (amount > 0) {
			if (initialOverdraftBalance > overdraftLimit) {
				if (amount < initialOverdraftBalance - overdraftLimit) {
					overdraftLimit += amount;
					return true;
				} else {
					amount -= initialOverdraftBalance - overdraftLimit;
					overdraftLimit = initialOverdraftBalance;
					setBalance(getBalance() + amount);
					return true;
				}
			} else {
				setBalance(getBalance() + amount);
				return true;
			}

		}
		return false;
	}
}