package com.niit.kushal.multithreading;

public class ThreadInterruptDemo {

	public static void main(String[] args) {
		ThreadInterrupt t = new ThreadInterrupt();
		t.start();
		t.interrupt(); // This will give the output as 'End of main Thread', 'I am lazy thread' , 'I got interrupted'
		System.out.println("End of main");
	}
}
