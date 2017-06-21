package com.niit.kushal.multithreading;

public class ThreadYield extends Thread {

	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Child Thread");
			Thread.yield(); // Child thread always calls yield() and main thread will get the more chance to complete first!!
		}
	}
}
