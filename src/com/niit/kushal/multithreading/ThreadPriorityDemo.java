package com.niit.kushal.multithreading;

public class ThreadPriorityDemo {

	public static void main(String[] args) {
		MyThread1 t = new MyThread1();
		
		t.setPriority(10); // Line 1 If we comment this line then both the main and child threads will have same priority 5!!
							// Hence exact output is not known!!
		t.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread " + i);
		}
	}
}

class MyThread1 extends Thread {
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Child Thread " + i);
		}
	}
}