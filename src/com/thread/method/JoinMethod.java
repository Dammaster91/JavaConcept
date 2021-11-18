package com.thread.method;

public class JoinMethod {

	public static void main(String[] args) throws InterruptedException {
		MyRunnable mr = new MyRunnable();
		Thread t = new Thread(mr);

		// MyThread t = new MyThread();
		t.start();
		//t.join();
		for (int i = 1; i <= 10; i++) {
			System.out.println("Main Thread " + i);
		}

	}

}
