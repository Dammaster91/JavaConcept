package com.interfaceexample;

interface Bank {
	int getRateOfInterest();
	
	default void location(String  loc) {
		System.out.println("Newly added default method Bank Location " +  loc);
	}
	
	static void time(String str){
    	System.out.println("Newly added static method Bank Time "+ str );
    }

}

class ICICI implements Bank {
	public int getRateOfInterest() {
		return 5;
	}
}

class HDFC implements Bank {
	public int getRateOfInterest() {
		return 6;
	}
}
