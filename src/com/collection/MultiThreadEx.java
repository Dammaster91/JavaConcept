package com.collection;

import java.util.ArrayList;

public class MultiThreadEx extends Thread {
	// Declare ArrayList variable.
	ArrayList<Integer> list;

	// Create a one parameter constructor with parameter 'list' and type ArrayList.
	MultiThreadEx(ArrayList<Integer> list) {
		this.list = list;
	}

	@Override
	public void run() {
		System.out.println("Run method");
		for (int i = 0; i <= 6; i++) {
			// Adding elements in the list.
			list.add(i);
			try {
				// Call sleep() method to delay some time.
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		// Creates an ArrayList object with an initial capacity of 10.
		ArrayList<Integer> list = new ArrayList<Integer>();

		// Create multiple thread class objects m1, m2 and passes 'list' as a
		// parameter.
		MultiThreadEx m1 = new MultiThreadEx(list);
		MultiThreadEx m2 = new MultiThreadEx(list);

		// Call start() method to start thread using m1 and m2 reference variable.
		m1.start();
		m2.start();
		try {
			// Call join() method to complete the task of adding elements in the
			// ArrayList.
			m1.join();
			m2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		Integer sizelist = list.size();
		System.out.println("Size of list is " + sizelist);
		for (Integer i : list) {
			System.out.println("num - " + i);
		}
	}
}