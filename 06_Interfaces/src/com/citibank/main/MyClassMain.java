package com.citibank.main;

import java.util.Scanner;

import com.citibank.main.domain.MyClass;
import com.citibank.main.domain.MyInterface;
import com.citibank.main.factory.MyFactory;

public class MyClassMain {

	public static void main(String[] args) {
		System.out.println("Main Start");
		
		MyClass myClass = new MyClass();
		myClass.show();
		
		System.out.println("-------------------------");
		
		System.out.println(MyInterface.message);
		System.out.println(MyClass.message);
		
		System.out.println("-------------------------");
		
		MyInterface myInterface = new MyClass();
		myInterface.show();
		
		System.out.println(myInterface.message);
		
		System.out.println("-------------------------");
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println(" 1. MyClass Object");
		System.out.println(" 2. Your Class Object");
		System.out.print("Enter Your Choice : ");
		int choice = scanner.nextInt();
		MyInterface myInterface1 = MyFactory.getObject(choice);
		
		if (myInterface != null) {
			myInterface1.show();
		}
		else
			System.out.println("Invalid Choice");
		System.out.println("Main End");	
	}

}
