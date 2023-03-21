package com.detailedThreading;

public class ITCMain {

	
	public static void demo() {
		IMPData data = new IMPData();
		Runnable runnable = new SpellingChecker(data);
		Thread t1 = new Thread(runnable);

		Runnable runnable2 = new GrammerChecker(data);
		Thread t2 = new Thread(runnable2);

		t1.start();
		t2.start();

		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			System.out.println("Error 10101");
		}

		data.currentCount();
	}

	public static void main(String[] args) {
		System.out.println("Threading start");
		demo();

	}

}
