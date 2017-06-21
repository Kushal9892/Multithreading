package com.niit.kushal.multithreading;

public class ThreadDemoRunnable {

	public static void main(String[] args) {
		MyRunnable mr = new MyRunnable();
		Thread t = new Thread(mr); // mr is the 'Target Runnnable'!! 
									/*  Without passing mr to the Thread constructor, the run() method of Thread class will be called
									 	which does not have any implementation So we call the run() method of our class */
		t.start(); // After this a new Thread is created!!
		for (int i=0; i<10; i++) {
			System.out.println("Main Thread");
		}

	}

}
