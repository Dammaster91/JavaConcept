package com.interfaceexample;

public class TestBank {
	public static void main(String args[]) {
		Bank b;
		b = new ICICI();
		b.location("Pune");
		Bank.time("9 to 5");
		System.out.println("Rate of Interest ICICI: " + b.getRateOfInterest() + " %");
		System.out.println("=========");
		b = new HDFC();
		b.location("Mumbai");
		Bank.time("10 to 6");
		System.out.println("Rate of Interest HDFC : " + b.getRateOfInterest() + " %");
	}
}