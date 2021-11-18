package com.thread.join;
public class MyRunnable implements Runnable{

	@Override
	public void run() {
		//System.out.println(Thread.currentThread().getPriority());
			//Thread.yield();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Venu Fixing ");
		}
		
}
