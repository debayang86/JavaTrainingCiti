package com.citibank.main;

import com.citibank.main.domain.ThreadOne;

public class ThreadOneMain {

	public static void main(String[] args) {
		System.out.println("Main Start");
		ThreadOne threadOne = new ThreadOne();
		
		final int threadSleep = 100;
		threadOne.start();
		threadOne.setPriority(9);
		long id = threadOne.getId();
		System.out.println(id);
		String threadName = threadOne.getName();
		System.out.println(threadName);
		
		for(int i=0; i< 1000; i++) {
			System.out.println("Main : " + i);
			try {
				threadOne.sleep(threadSleep);
			} catch (InterruptedException e) {
				System.out.println("ThreadOne is sleeping");
			}finally {
				if(threadOne.isAlive())
					threadOne.suspend();					
			}
		}
		System.out.println("Main End");
		
	}

}
