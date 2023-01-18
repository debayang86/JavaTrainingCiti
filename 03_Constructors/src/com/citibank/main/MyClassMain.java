package com.citibank.main;

import com.citibank.main.domain.MyClass;

public class MyClassMain {

	public static void main(String[] args) {
		System.out.println("Main Start");
		MyClass myClass = new MyClass(10);
		myClass.show();
//		System.out.println("-------------------");
//		new MyClass().show();
//		
//		System.out.println("-------------------");
//		new MyClass(10).show();
//		
//		System.out.println("-------------------");
//		new MyClass("Test").show();
		
		System.out.println("Main End");

	}

}
