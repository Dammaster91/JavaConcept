package com.interfaceexample;

interface Bike {

	void run(Object obj);

	default void wheel(int i) {
		System.out.println("Newly added default method Total wheel " +  i);
	}
	
	 static void brake(String str){
	    	System.out.println("Newly added static method brake Type "+ str );
	    }

}

class Hero implements Bike {
	public void run(Object obj) {
		System.out.println(obj.getClass().getSimpleName() + " running safely");
	}

}

class Honda implements Bike {
	public void run(Object obj) {
		System.out.println(obj.getClass().getSimpleName() + " running safely");
	}

}
