//package com.hackerrank;
//
//import java.util.Arrays;
//import java.util.List;
//import java.util.stream.IntStream;
//
//public class StringClass {
//	public static void main(String[] args) {
//		String s[]={"Orange", "Apple", "Lemmon", "Raspberry"};
//		String s1[]={"Juice", "Pie", "Ice", "Tart"};
//		
//		final List<String> fruits =Arrays.asList(s);
//		final List<String> types = Arrays.asList(s1);
//		int stream =  (int) IntStream.range(0, Math.min(fruits.size(), types.size())).mapToObj((i) -> fruits.get(i) + " " + types.get(i));
//		stream.forEach(System.out::println);
//	}
//
//	
//
//}
