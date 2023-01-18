package com.citibank.main;

import com.citibank.main.domain.GoodMorningGreeter;
import com.citibank.main.domain.Greeter;

public class GreeterMain {

	public static void main(String[] args) {
		Greeter greeter = new GoodMorningGreeter();
		greeter.greet();
		System.out.println("---------------------");
		
		Greeter goodEveningGreeter = new Greeter() {
			
			@Override
			public void greet() {
				System.out.println("Good Evening Java");
				
			}
		};
		goodEveningGreeter.greet();

		Object obj = goodEveningGreeter.getClass();
		System.out.println(obj);
		System.out.println("----------------------");
		
		Greeter greeter2 = () -> System.out.println("My Greetings");
		greeter2.greet();
		
		Runnable runnable = () -> System.out.println("We're In Thread");
		Thread thread = new Thread(runnable);
		thread.start();
		System.out.println("-----------------------");
		
		Thread thread2 = new Thread(
				() -> System.out.println("We're in Thread")
		);
		thread2.start();
		System.out.println("------------------------");
		
		new Thread(()-> System.out.println("We are in thread")).start();
		
		System.out.println("------------------------");
		
		new Thread(()-> {
			for (int i = 0; i< 10; i++) {
				try {
					Thread.sleep(1000);
					System.out.println("Thread is Running");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}).start();
	}
	
}

