package com.abstractclass;

public class TestBank {
	public static void main(String args[]) {
		Bank b;
		b = new ICICI();
		System.out.println("Rate of Interest ICICI: " + b.getRateOfInterest() + " %");

		b = new HDFC();
		System.out.println("Rate of Interest HDFC : " + b.getRateOfInterest() + " %");
	}
}