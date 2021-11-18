package com.interfaceexample;

public class TestBike {

	public static void main(String[] args) {
		Bike hero = new Hero();
		hero.run(hero);
		hero.wheel(8);
		Bike.brake("Desk");
		System.out.println("============");
		Bike honda = new Honda();
		honda.run(honda);
		hero.wheel(4);
		Bike.brake("Normal");
	}
}