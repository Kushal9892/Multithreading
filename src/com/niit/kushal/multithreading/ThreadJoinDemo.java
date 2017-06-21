package com.niit.kushal.multithreading;

public class ThreadJoinDemo {

	public static void main(String[] args) throws InterruptedException {
		ThreadJoin t = new ThreadJoin();
		t.start();
		//t.join(); // Will wait until the completion of the Child Thread!!
		t.join(10000); // The parent thread will wait for 10 secs and then execute!!
		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread");
		}

	}

}
