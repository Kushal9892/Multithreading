package com.niit.kushal.multithreading;

public class ThreadSleepDemo {

	public static void main(String[] args) {
		
		ThreadSleep t = new ThreadSleep();
		t.start();
		t.interrupt(); // Interrupt call waits until the child thread completes for loop 1000 times!
		System.out.println("End of Main Thread!!");

	}

}
