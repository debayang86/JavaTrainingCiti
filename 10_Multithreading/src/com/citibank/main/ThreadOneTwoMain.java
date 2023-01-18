package com.citibank.main;

import com.citibank.main.domain.ThreadOne;
import com.citibank.main.domain.ThreadTwo;

public class ThreadOneTwoMain {

	public static void main(String[] args) {
		System.out.println("Main Start");
		System.out.println("Main is creating child ThreadOne");
		ThreadOne threadOne = new ThreadOne();
		threadOne.start();
		
		
		System.out.println("Main is creating child ThreadTwo");
		System.out.println("Main End");
		ThreadTwo threadTwo = new ThreadTwo();
		Thread thread = new Thread(threadTwo);
		thread.start();

	}

}
