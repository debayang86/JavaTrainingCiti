package com.citibank.main.domain;

public class MyClass {
	public int num1 = 10; 
	public static int num2 = 10;
//	final int max = 500;
	
	static {
		System.out.println("Static Block of MyClass");
	}
	
	{
		System.out.println("Non Static Block of MyClass");
	}
	public MyClass() {
		final int max;
		System.out.println("Default Constructor");
	}
	
	public void display() {
		System.out.println("Num1 : " + num1 );
		System.out.println("Num2 : " + num2);
		
		num1 += 10;
		num2 += 10;
		
//		max += 10;
		
		System.out.println("Num1 Now : " + num1);
		System.out.println("Num2 Now : " + num2);
	
	}

}
