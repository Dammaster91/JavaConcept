package com.polymorphism;

public class MethodOveridingTest extends MethodOverLoadingTest {

	public int sum(int i, int j) {
		System.out.println("Child");
		return i + j;

	}

	public int sum(int i, int j, int k) {
		System.out.println("Child");
		return i + j + k;

	}

	public static void main(String[] args) {

		MethodOverLoadingTest test = new MethodOveridingTest();

		System.out.println("Two Parameter Sum= " + test.sum(10, 20));

		System.out.println("Three Parameter Sum= " + test.sum(10, 20, 30));
		System.out.println("Four Parameter Sum= " + test.sum(10, 20, 30, 40));

	}

}
