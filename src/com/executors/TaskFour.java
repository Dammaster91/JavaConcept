package com.executors;

public class TaskFour implements Runnable {
	@Override
	public void run() {
		System.out.println("Executing Task Four");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}