package com.niit.kushal.multithreading;

public class ThreadSynchronizedDemo {

	public static void main(String[] args) {
		
		Display d = new Display();
		ThreadSynchronized t1 = new ThreadSynchronized(d, "Dhoni");
		ThreadSynchronized t2 = new ThreadSynchronized(d, "Yuvraj");
		t1.start(); 
		t2.start();
	}

}
