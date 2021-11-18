package com.hackerrank;

import java.io.*;

public class Tester1 {
	public static void main(String[] args) {
		try {
			doA();
			dob();
		} catch (IOException e) {
			System.out.print("c");
			return;
		} finally {
			System.out.print("d");
			System.out.print("i");
		}
	}

	private static void doA() {
		System.out.print("a");
		if (false) {
			throw new IndexOutOfBoundsException();
		}
	}

	private static void dob() throws FileNotFoundException {
		System.out.print("b");
		if (true) {
			throw new FileNotFoundException();
		}
	}
}