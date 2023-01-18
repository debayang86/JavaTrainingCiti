package com.citibank.main;

public class JarDemoMain {

	public static void main(String[] args) {

		System.out.println("Java Program Is Getting Executed");
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("i = " + i);

		}

	}

}
