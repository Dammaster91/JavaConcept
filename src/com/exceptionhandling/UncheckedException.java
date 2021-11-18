package com.exceptionhandling;

public class UncheckedException {
	public static void main(String args[]) {
		String arr[] = { "Crunchify", "Google", "Yahoo", "Amazon", "eBay" };
		try {
			String myString = arr[7]; // This throws ArrayIndexOutOfBoundException
			System.out.println(myString);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundException appears here. Better handle it in code above :)" + e);
		}
	}
}

/*
 * Output:-  
 * ArrayIndexOutOfBoundException appears here. Better handle it in code above :)java.lang.ArrayIndexOutOfBoundsException: 7
 */
