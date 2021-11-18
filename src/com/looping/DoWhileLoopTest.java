package com.looping;

public class DoWhileLoopTest {

	public static void printTable(int n) {
		int i = 1;
		do {
			System.out.println(n + " * " + i + " = " + (n * i));
			i++;
		} while (i <= 10);
	}

	public static void main(String[] args) {
		printTable(2);

	}

}
