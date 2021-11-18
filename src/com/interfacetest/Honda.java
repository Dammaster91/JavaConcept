package com.interfacetest;

public class Honda implements Bike {

	public static void main(String[] args) {

		Bike bike = new Honda();
		bike.run(bike);

	}

	@Override
	public void run(Object obj) {
		System.out.println(obj.getClass().getSimpleName() + " running safely");

	}

	public void Cost(Object obj, int i) {
		System.out.println(obj.getClass().getSimpleName() + " Cost is " + i);

	}

}
