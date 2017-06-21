package com.niit.kushal.multithreading;

public class MyRunnable implements Runnable {

	// Defining a Thread!!
	// Run() method is the job of the Thread!!
	@Override
	public void run() {
		for (int i=0; i<10; i++) {
			System.out.println("Child Thread");
		}
		
	}

}
