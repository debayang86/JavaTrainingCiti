package com.citibank.main.domain;

import java.util.Scanner;

public class MyClass {
	private double num1;
	private double num2;
	private double result;
	
	public void accept() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Num1 : ");
		num1 = scanner.nextDouble();
		System.out.println("Enter Num2 : ");
		num2 = scanner.nextDouble();
		
	}
	
	public void calculate() {
		System.out.println("Calculating Result");
		result = num1/num2;
	}
	
	public void display() {
		System.out.println("Result is : " + result);
	}

}
