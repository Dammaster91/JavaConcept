package com.switchstatement;

public class SwitchStatement {

	private static void switchOnStrings(String size) {
		switch (size) {

		case "S": {
			System.out.println("size is small");
			break;
		}
		case "M": {
			System.out.println("size is medium");
			break;
		}
		case "L": {
			System.out.println("size is large");
			break;
		}
		case "XL": {
			System.out.println("size is X-large");
			break;
		}

		default: {
			System.out.println("size is not S,M,L or XL: " + size);
		}
		}
	}

	private static void switchOnEnum(Size size) {
		switch (size) {

		case SMALL: {
			System.out.println("size is small");
			break;
		}
		case MEDIUM: {
			System.out.println("size is medium");
			break;
		}
		case LARGE: {
			System.out.println("size is large");
			break;
		}
		case X_LARGE: {
			System.out.println("size is X-large");
			break;
		}

		default: {
			System.out.println("size is not S,M,L or XL: " + size);
		}

		}
	}

	private static void switchOnIntegers(byte size) {
		switch (size) {

		case 0: {
			System.out.println("size is small");
			break;
		}
		case 1: {
			System.out.println("size is medium");
			break;
		}
		case 2: {
			System.out.println("size is large");
			break;
		}
		case 3: {
			System.out.println("size is X-large");
			break;
		}

		default: {
			System.out.println("size is not S,M,L or XL: " + size);
		}
		}
	}

	private static void switchOnIntegers(short size) {
		switch (size) {

		case 0: {
			System.out.println("size is small");
			break;
		}
		case 1: {
			System.out.println("size is medium");
			break;
		}
		case 2: {
			System.out.println("size is large");
			break;
		}
		case 3: {
			System.out.println("size is X-large");
			break;
		}

		default: {
			System.out.println("size is not S,M,L or XL: " + size);
		}
		}
	}

	private static void switchOnIntegers(int size) {
		switch (size) {

		case 0: {
			System.out.println("size is small");
			break;
		}
		case 1: {
			System.out.println("size is medium");
			break;
		}
		case 2: {
			System.out.println("size is large");
			break;
		}
		case 3: {
			System.out.println("size is X-large");
			break;
		}

		default: {
			System.out.println("size is not S,M,L or XL: " + size);
		}
		}
	}

	private static void switchOnChars(char size) {
		switch (size) {

		case 'S': {
			System.out.println("size is small");
			break;
		}
		case 'M': {
			System.out.println("size is medium");
			break;
		}
		case 'L': {
			System.out.println("size is large");
			break;
		}
		case 'X': {
			System.out.println("size is X-large");
			break;
		}

		default: {
			System.out.println("size is not S,M,L or XL: " + size);
		}
		}
	}

	public static void main(String[] args) {
		short s = 1;
		byte b = 2;
		switchOnStrings("S");
		switchOnChars('S');
		switchOnIntegers(s);
		switchOnIntegers(1);
		switchOnIntegers(b);
		switchOnEnum(Size.LARGE);

	}

}
