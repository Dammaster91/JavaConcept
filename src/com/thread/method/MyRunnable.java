package com.thread.method;

public class MyRunnable implements Runnable{

	@Override
	public void run() {
		//System.out.println(Thread.currentThread().getPriority());
		for (int i = 1; i <= 10; i++) {
			Thread.yield();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Child Thread "+i);
		}
		
	}

}
