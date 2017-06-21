package com.niit.kushal.multithreading;

public class ThreadDemo {

	public static void main(String[] args) {
		MyThread t = new MyThread();
		t.start(); // Main thread starts the child thread and the execution of both the threads happens simultaneously!!
					// The start() method overrides the run() method to begin the execution of the thread!!
					// t.run() instead of t.run() will not create a new thread and will be just like a normal method call!!
		System.out.println("Main Method");
	}
}
