package com.lambda;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Crow {

	public static void main(String[] args) {
		List<String> bunnies = new ArrayList<>();
		bunnies.add("long ear");
		bunnies.add("floppy");
		bunnies.add("hoppy");
		System.out.println(bunnies); // [long ear, floppy,hoppy]
		bunnies.removeIf(s -> s.charAt(0) == 'h');
		System.out.println(bunnies); // [long ear, floppy]

		bunnies.sort((b1, b2) -> b1.compareTo(b2));
		System.out.println(bunnies); // [floppy, long ear]

		// Iterate Map
		System.out.println("=======Iterate Map=====");
		Map<String, Integer> bunniesMap = new HashMap<>();
		bunniesMap.put("long ear", 3);
		bunniesMap.put("floppy", 8);
		bunniesMap.put("hoppy", 1);
		bunniesMap.forEach((k, v) -> System.out.println(k + " " + v));
	}
}
