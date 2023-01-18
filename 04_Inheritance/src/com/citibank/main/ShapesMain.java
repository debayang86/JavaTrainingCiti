package com.citibank.main;

import java.util.Scanner;

import com.citibank.main.domain.Circle;
import com.citibank.main.domain.Line;
import com.citibank.main.domain.Shapes;
import com.citibank.main.domain.Triangle;

public class ShapesMain extends Shapes{

	public static void main(String[] args) {
		int choice;
		Circle circle = new Circle(10);
		circle.draw();
		
//		Shapes shapes = new Circle();
//		shapes.draw();
//		
//		circle.print();
		
//		Shapes shapes = new Circle();
//		shapes.print;
		
//		Shapes shapes = new Circle();
//		shapes.convertShapes();;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("1. Circle 2. Triangle 3. Line");
		System.out.println("Enter Your Choice : ");
		
		choice = scanner.nextInt();
		
		Shapes shapes = getShape(choice);
		shapes.draw();
			
	
	}
	
	public static Shapes getShape(int choice) {
		if(choice == 1) {
			return new Circle();
		}
		if(choice == 2) {
			return new Triangle();
		}
		if(choice == 3) {
			return new Line();
		}
		return null;
	}

}
