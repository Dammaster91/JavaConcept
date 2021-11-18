package com.multithreading;

public class MyRunnableTest {

	public static void main(String[] args) {
		MyRunnable mr = new MyRunnable();
		new Thread(mr).start();
		for (int i = 0; i < 5; i++) {
			System.out.println("My Runnable Main thread started running..");
		}

	}

}
