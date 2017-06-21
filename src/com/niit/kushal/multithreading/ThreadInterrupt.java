package com.niit.kushal.multithreading;

public class ThreadInterrupt extends Thread {

	public void run() {
		for (int i = 0; i < 1000; i++) {
			try {
				System.out.println("I am lazy thread "+i);
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				System.out.println("I am interrupted");
			}
		}

	}
}
