package com.citibank.main.domain;

import java.util.Objects;

public class Customer {
	private int customerId;
	private String name;
	private String address;

	public Customer() {

	}

	public Customer(int customerId, String name, String address) {
		super();
		this.customerId = customerId;
		this.name = name;
		this.address = address;
	}
	

	@Override
	public int hashCode() {
		System.out.println("In HashCode");
		return Objects.hash(address, customerId, name);
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("In Equals");
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		return Objects.equals(address, other.address) && customerId == other.customerId
				&& Objects.equals(name, other.name);
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Customer [CustomerId is : " + customerId + ", Name is : " + name + ", Address is : " + address + "]";
	}

}
