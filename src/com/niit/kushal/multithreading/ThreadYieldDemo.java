package com.niit.kushal.multithreading;

public class ThreadYieldDemo {

	public static void main(String[] args) {

		ThreadYield t = new ThreadYield();
		t.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread");
		}
	}
}
