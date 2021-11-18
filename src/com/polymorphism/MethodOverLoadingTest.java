package com.polymorphism;

public class MethodOverLoadingTest {

	public int sum(int i, int j) {
		System.out.println("Parent");
		return i + j;

	}

	public int sum(int i, int j, int k) {
		System.out.println("Parent");
		return i + j + k;

	}
	
	public int sum(int i, int j, int k,int l) {
		System.out.println("Parent");
		return i + j + k+l;

	}

	public static void main(String[] args) {

		MethodOverLoadingTest test = new MethodOverLoadingTest();
		System.out.println("Two Parameter Sum= " + test.sum(10, 20));

		System.out.println("Three Parameter Sum= " + test.sum(10, 20, 30));

	}

}
