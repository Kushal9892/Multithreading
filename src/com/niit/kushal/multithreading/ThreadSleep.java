package com.niit.kushal.multithreading;

public class ThreadSleep extends Thread {

	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println("I am a lazy thread: " + i);
		}
		System.out.println("I am entering into the sleeping state!");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			System.out.println("I got interrupted");
		}
	}
}
