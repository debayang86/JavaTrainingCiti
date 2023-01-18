package com.citibank.main.domain;

public class Circle extends Shapes {
	public Circle() {
		System.out.println("Default Constructor of Circle");
	}
	public Circle(int size) {
		super(size);
		System.out.println("Parameterized Constructor of Circle");
		System.out.println("Size : " + size);
	}
	@Override
	public void draw() {
//		super.draw();
		System.out.println("Drawing Circle");
	//	super.draw();
	}
	
	public void print() {
		System.out.println("Printing of Shapes");
	}

}
