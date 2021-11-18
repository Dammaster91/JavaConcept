package com.thread.method;

public class MyThread extends Thread{
	
	public void run() {
		
		for (int i = 1; i <= 60; i++) {
			Thread.yield();
			System.out.println("Child Thread "+i);
		}
	}

}
