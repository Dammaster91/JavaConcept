package com.synchronization;

public class SynchronizationDemo {

	public static void main(String[] args) {
		Display d = new Display();

		MyThread t1 = new MyThread(d, "Sandeep");
		MyThread t2 = new MyThread(d, "Amit");
		MyThread t3 = new MyThread(d, "Ami11t");
		t1.start();
		t2.start();
		t3.start();
	}

}
