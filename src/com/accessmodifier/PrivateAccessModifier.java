package com.accessmodifier;

public class PrivateAccessModifier {

	public int sum(int i, int j) {
		return i + j;
	}

	protected int sub(int i, int j) {
		return i - j;
	}

	public  int div(int i, int j) {
		return i - j;
	}

	public void m1() {
		System.out.println("Private method in PrivateAccessModifier Class");
		
	}
	

}
