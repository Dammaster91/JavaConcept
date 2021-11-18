package com.hackerrank;

import java.util.function.Supplier;

public class Snippet {

//	f=void myLambda() {
//		int i = 25;
//		Supplier<Integer> foo = () -> i;
//		i++;
//		System.out.println(foo.get());
//	}

	public static void main(String[] args) {
		
		
			String line = new String("-"); 
			String anotherLine = line.concat("-"); 
			System.out.print(line == anotherLine);
				System.out.print(" ");
				System.out.print(line.length()); 

	}

}
