package com.interthreadcommunication;

public class InterThread {

	private int number;
	private boolean isNumberReady;

	public synchronized void produceNumber(int num) {

		while (isNumberReady) {
			try {
				wait();
			} catch (InterruptedException e) {
				System.out.println("Error at Produce");
			}
		}

		number = num;
		isNumberReady = true;
		System.out.println(number+" Number has been produced" );
		notify();
	}

	public synchronized void consumeNumber() {
		while (!isNumberReady) {
			try {
				wait();
			} catch (InterruptedException e) {
				System.out.println("Error at consume");
			}
		}

		isNumberReady = false;
		System.out.println("Number consumed: " + number);
		notifyAll();
	}
}
