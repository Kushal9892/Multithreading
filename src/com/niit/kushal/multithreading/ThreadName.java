package com.niit.kushal.multithreading;

	class ThreadName {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName()); //Printing the default main thread name!!
		TestThread t = new TestThread(); // Creating the child thread!!
		System.out.println(t.getName()); // Printing the default child thread name!!
		Thread.currentThread().setName("Kushal Thread"); // Renaming the main thread!!
		System.out.println(Thread.currentThread().getName()); // Printing the customized name of the main thread!!
		// System.out.println(10/0); // Check the runtime exception for the main thread name!!
		t.start();
	}

}

class TestThread extends Thread {
	public void run() {
		System.out.println("Run method executed by: " + Thread.currentThread().getName());
	}
}
