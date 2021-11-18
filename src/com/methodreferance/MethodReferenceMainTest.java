package com.methodreferance;

public class MethodReferenceMainTest {
	public static int sum(int a, int b) {
		return a + b;
	}

	public static int sub(int a, int b) {
		return a - b;
	}

	public static int mul(int a, int b) {
		return a * b;
	}

	public int div(int a, int b) {
		return a / b;
	}

	public static void main(String[] args) {
		// Referring static method
		Calculator calSum = MethodReferenceMainTest::sum;
		// Calling interface method
		int sum = calSum.calculator(10, 20);
		System.out.println("Sum: " + sum);

		// ======Sub==========
		Calculator calSub = MethodReferenceMainTest::sub;
		int sub = calSub.calculator(100, 20);
		System.out.println("Sub: " + sub);

		// ======Mul==========
		Calculator calMul = MethodReferenceMainTest::mul;
		int mul = calMul.calculator(10, 20);
		System.out.println("Mul: " + mul);
		// ======Div==========
		MethodReferenceMainTest methodReference = new MethodReferenceMainTest();

		Calculator calDiv = methodReference::div;
		int div = calDiv.calculator(100, 20);
		System.out.println("Div: " + div);

	}
}