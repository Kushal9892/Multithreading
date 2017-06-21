package com.niit.kushal.multithreading;

public class MyThread extends Thread {

	public void start() {
		//super.start(); // This is create a new thread and execute the run() method by invoking the start() method of Thread class!!
		System.out.println("Start Method");
	}
	
	@Override
	public void run() {
		System.out.println("Run Method");
	}
	
	public void run(int i) {
		System.out.println("Int Arg run method"); // Overloading of the run() method is possible
												//but the Thread class run() method always calls the no arg run() method!!
	}
}
