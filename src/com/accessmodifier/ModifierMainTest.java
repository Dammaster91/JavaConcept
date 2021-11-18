package com.accessmodifier;

public class ModifierMainTest extends PrivateAccessModifier {
	static int mul(int i, int j) {
		return i * j;
	}

	private ModifierMainTest() {
		System.out.println("Private Constructor");
	}

	private void m1(int k) {
		System.out.println("Private Method in ModifierMainTest");
	}

	public static void main(String[] args) {

		ModifierMainTest protectedMainTest = new ModifierMainTest();
		int sub = protectedMainTest.sub(30, 10);
		System.out.println(sub);

		int sum = protectedMainTest.sum(10, 20);
		System.out.println(sum);

		int mul = mul(10, 20);
		System.out.println(mul);

		protectedMainTest.m1();
		protectedMainTest.m1(10);

	}

}
