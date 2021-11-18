package com.exceptionhandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CheckedExceptionTest {
	public static void main(String[] args) throws FileNotFoundException,IOException {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("d.txt"));
			String line = br.readLine();
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}

		}  finally {
			if (br != null)
				br.close();
		}
	}
}

/*
 * Output:-
 * 
 Exception in thread "main" java.io.FileNotFoundException: d.txt (The system cannot find the file specified)
at java.io.FileInputStream.open0(Native Method)
at java.io.FileInputStream.open(Unknown Source)
at java.io.FileInputStream.<init>(Unknown Source)
at java.io.FileInputStream.<init>(Unknown Source)
at java.io.FileReader.<init>(Unknown Source)
at com.exceptionhandling.CheckedExceptionTest.main(CheckedExceptionTest.java:12)
*/
