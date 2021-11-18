package com.abstractclass;

abstract class Bank {
	abstract int getRateOfInterest();
}

class ICICI extends Bank {
	int getRateOfInterest() {
		return 5;
	}
}

class HDFC extends Bank {
	int getRateOfInterest() {
		return 6;
	}
}

