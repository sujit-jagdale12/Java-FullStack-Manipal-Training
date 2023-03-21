package com.interthreadcommunication;

public class Producer implements Runnable{

	private final InterThread interThread;
	
	public Producer(InterThread interThread) {
		this.interThread=interThread;
	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			interThread.produceNumber(i);
		}
	}
	
	
}
