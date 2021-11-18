package com.hackerrank;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class MD5Problem {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.println(getMD5(s));
		sc.close();
	}

	private static String getMD5(String s) {
		StringBuffer sb = new StringBuffer();
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			byte[] result = md.digest(s.getBytes());
			for (int i = 0; i < result.length; i++) {
				String hex = Integer.toHexString(0xff & result[i]);
				if (hex.length() == 1)
					sb.append('0');
				sb.append(hex);
			}
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return sb.toString();
	}
}