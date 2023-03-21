package com.interthreadcommunication;

public class Consumer implements Runnable {

	private final InterThread interThread;

	public Consumer(InterThread interThread) {
		this.interThread = interThread;
	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			interThread.consumeNumber();
		}
	}
}
