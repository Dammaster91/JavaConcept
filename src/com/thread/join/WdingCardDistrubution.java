package com.thread.join;

public class WdingCardDistrubution {

	public static void main(String[] args) throws InterruptedException {

		MyRunnable mr = new MyRunnable();
		Thread t = new Thread(mr);
		t.start();
		t.join();
		System.out.println("Card Printing ");

		System.out.println("Card DISTRUBUTION ");
	}

}
