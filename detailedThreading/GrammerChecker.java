package com.detailedThreading;

public class GrammerChecker implements Runnable {
	private final IMPData data;

	public GrammerChecker(IMPData data) {
		this.data = data;
	}

	public void run() {
		for (int i = 0; i < 5000; i++) {
			data.increment();
		}
	}
}
