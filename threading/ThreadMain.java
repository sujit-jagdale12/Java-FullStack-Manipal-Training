package com.threading;

class ThreadOne extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("Thread first class");
		}
	}
}
class ThreadTwo implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("Thread second class");
		}
	}
	
}
class ThreadThree implements Runnable{
	
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("Thread third class");
		}
	}
	
}
public class ThreadMain {

	public static void threadRunner() {
		ThreadOne one=new ThreadOne();
		one.start();
		
		ThreadTwo two=new ThreadTwo();
		Thread thread=new Thread(two);
		thread.start();
		
		ThreadThree three=new ThreadThree();
		Thread thread1=new Thread(three);
		thread1.start();
	}
	public static void main(String[] args) {
		
		threadRunner();
	}
}
