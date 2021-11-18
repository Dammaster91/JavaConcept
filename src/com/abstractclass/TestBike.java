package com.abstractclass;

public class TestBike {

	public static void main(String[] args) {
		Bike hero = new Hero();
		hero.run(hero);
		Bike honda = new Honda();
		honda.run(honda);
	}
}