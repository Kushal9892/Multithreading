package com.niit.kushal.multithreading;

public class ThreadSynchronized extends Thread {

	Display d;
	String name;

	ThreadSynchronized(Display d, String name) {

		this.d = d;
		this.name = name;
	}
	
	public void run() {
		d.wish(name);
	}

}

class Display {
	
	/* If we are not declaring wish method as synchronized, then both the threads will be executed simultaneously 
	 * and hence we will get irregular output */
	
	/* if we declared wish method as synchronized, then at a time only one thread is allowed to executed wish method
	 * on the given display object and hence we will get regular output */
	
	public synchronized void wish(String name) {
		for (int i = 0; i < 10; i++) {
			System.out.print("Good Morning: ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
				System.out.println(name);
			
		}
	}
}