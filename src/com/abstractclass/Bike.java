package com.abstractclass;

public abstract class Bike {

	abstract void run(Object obj);

}

class Hero extends Bike {
	void run(Object obj) {
		System.out.println(obj.getClass().getSimpleName() + " running safely");
	}

}

class Honda extends Bike {
	void run(Object obj) {
		System.out.println(obj.getClass().getSimpleName() + " running safely");
	}

}
