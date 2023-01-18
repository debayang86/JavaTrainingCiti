package com.citibank.main;

import java.util.Scanner;

import com.citibank.main.domain.Employee;

public class EmployeeMain {

	public static void main(String[] args) {
		
		Employee employee1 = new Employee(101, "Paritosh", 1000);
		Employee employee2 = new Employee(101, "Kapil", 1000);
		Employee employee3 = new Employee(101, "Debayan", 1000);
		Employee employee4 = new Employee(101, "Uday", 1000);
		Employee employee5 = new Employee(101, "Kaustubh", 1000);
		
		System.out.println(employee1.toString());
		System.out.println(employee2.toString());
		System.out.println(employee3.toString());
		System.out.println(employee4.toString());
		System.out.println(employee5.toString());
		
		Employee [] allEmployees = new Employee[5];
		Scanner scanner = new Scanner(System.in);
		
		int employeeId;
		String name;
		double salary;
		
		for (int i = 0; i < allEmployees.length; i++) {
			System.out.println("Enter EmployeeId : ");
			employeeId = scanner.nextInt();
			System.out.println("Enter Name : ");
			name = scanner.next();
			System.out.println("Enter Salary : ");
			salary = scanner.nextDouble();
			Employee employee = new Employee(employeeId, name, salary);
			allEmployees[i] = employee;
			System.out.println();
			
 		}
		System.out.println("All Employees");
		
		for (Employee employee : allEmployees) {
			System.out.println(employee);
		}
	}

}
