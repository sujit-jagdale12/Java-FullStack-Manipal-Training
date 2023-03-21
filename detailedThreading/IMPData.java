package com.detailedThreading;

public class IMPData {

	private final Object lock = new Object();
	private int count;

	public synchronized void increment() {
//		synchronized (lock) {
			count++;
//		}
	}

	public synchronized void decrement() {
			count--;
	}
	
	public void currentCount() {
		System.out.println("Count: "+count);
	}
}
