package com.citibank.main.domain;

public class Line extends Shapes {
	public Line() {
		
		System.out.println("Default Constructor of Line");
	}
	public Line(int size) {
		System.out.println("Parameterized Construction of Line");
		System.out.println("Size : " + size);
	}
	@Override
	public void draw() {
		
		System.out.println("Drawing Line");
	}

}
