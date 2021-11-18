package com.thread.method;

public class YieldMethod {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(10);
		System.out.println(Thread.currentThread().getPriority());

		MyRunnable mr=new MyRunnable();
		Thread t=new Thread(mr);
		
		//MyThread t = new MyThread();
		t.start();

		/*for (int i = 1; i <= 10; i++) {
			System.out.println("Main Thread " + i);
		}*/

	}

}
