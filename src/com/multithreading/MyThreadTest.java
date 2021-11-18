package com.multithreading;

public class MyThreadTest {

	public static void main(String[] args) {
		MyThread mt = new MyThread();
		mt.start();
		for (int i = 0; i < 5; i++) {
			System.out.println("Main thread started running..");
		}

	}

}
