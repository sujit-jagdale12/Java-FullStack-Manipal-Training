package com.detailedThreading;

import java.util.Iterator;

public class SpellingChecker implements Runnable {
	 private final IMPData data;
	

	public SpellingChecker(IMPData data) {
		this.data = data;
	}

	public void run() {
		for (int i = 0; i < 5000; i++) {
				data.decrement();
		}
	}


	
}
