package com.interthreadcommunication;

public class Main {

	public static void threadRunner() {
		InterThread thread=new InterThread();
		
		Runnable producer=new Producer(thread);
		Thread t1=new Thread(producer);
		
		Runnable consumer=new Consumer(thread);
		Thread t2=new Thread(consumer);
		
		t1.start();
		t2.start();
	}
	public static void main(String[] args) {
		threadRunner();
	}
}
