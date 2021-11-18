package com.synchronization;

public class MyThread extends Thread {

	Display d;
	String name;

	MyThread(Display d, String n) {
		this.d = d;
		this.name = n;
	}

	public  void  run() {
		try {
		
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		d.wish(name);
	}

}
