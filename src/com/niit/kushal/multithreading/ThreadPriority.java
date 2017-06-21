package com.niit.kushal.multithreading;

public class ThreadPriority {

	public static void main(String[] args) {

		System.out.println(Thread.currentThread().getPriority()); // Displays the default main thread priority 5!!
		
		//Thread.currentThread().setPriority(17); // Gives Runtime Exception!!
		
		Thread.currentThread().setPriority(7); // Changing the main thread priority to 7!!
		
		MyThread t = new MyThread(); // Creating a child thread from the main thread!!
		
		System.out.println(t.getPriority()); // Getting the priority of the child thread which is created from main thread!!
			// Priority inherited from the parent thread!!
	}

}
