package com.citibank.main.domain;

//Generalization

public abstract class Shapes {
	public Shapes() {
		System.out.println("Default Constructor of Shapes");
	}
	public Shapes(int size) {
		System.out.println("Parameterized Construction of Shapes");
		System.out.println("Size : " + size);
	}
	public abstract void draw();// {
//		System.out.println("Drawing Shapes");
//	}
	public void convertShapes() {
		System.out.println("Converting Shapes");
	}

}
