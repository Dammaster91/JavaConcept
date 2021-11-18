package com.functional;

public class TestMain {

	public static void main(String[] args) {
		SquareRoot squareRoot = (int n) -> (Math.sqrt(n));
		System.out.println("squareRoot of No" + squareRoot.findSquareRoot(10));

		// =========Design Calculator using Functional Interface======

		Calculator sum = (int a, int b) -> (a + b);
		System.out.println("Sum of two no :" + sum.calculator(10, 20));

		Calculator sub = (int a, int b) -> (a - b);
		System.out.println("Sub of two no: " + sub.calculator(100, 20));

		Calculator mul = (int a, int b) -> (a * b);
		System.out.println("Mul of two no: " + mul.calculator(10, 20));

		Calculator div = (int a, int b) -> (a / b);
		System.out.println("Div of two no: " + div.calculator(10, 20));
	}

}
