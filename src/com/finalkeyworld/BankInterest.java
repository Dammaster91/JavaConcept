package com.finalkeyworld;

public class BankInterest {

	final static int rateOfInterest = 8;
	static String BankName = "IDBI";

	final static int getRateOfInterest() {
		return rateOfInterest;

	}

	final static int getRateOfInterest(int i) {
		return i;

	}

	public static void main(String[] args) {

		System.out.println(BankName + " bank Rate of Interest is " + getRateOfInterest(16));
		// If we make BankName final then we can't reinitialized that field
		BankName = "SBI";
		System.out.println(BankName + " bank Rate of Interest is " + getRateOfInterest());

	}

}

/*
 * OutPut: 
  IDBI bank Rate of Interest is 16
  SBI bank Rate of Interest is 8
*/
