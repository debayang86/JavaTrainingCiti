package com.citibank.main.domain;

public class Triangle extends Shapes {
	public Triangle() {
		System.out.println("Default constructor of Triangle");
	}
	@Override
	public void draw() {
		
		System.out.println("Drawing Triangle");
	}

}
