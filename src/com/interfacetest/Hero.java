package com.interfacetest;

public class Hero extends Honda implements Bike {

	public static void main(String[] args) {

		Bike bike = new Hero();
		bike.run(bike);

		Honda h = new Hero();
		h.Cost(h,500);
	}

	@Override
	public void run(Object obj) {
		System.out.println(obj.getClass().getSimpleName() + " running safely");

	}

}
