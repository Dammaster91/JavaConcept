package com.hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Tester {
	public static void main(String[] args) {
		char letter = 'b';
		int i = 0;
		switch (letter) {
		case 'a':
			i++;
			break;
		case 'b':
			i++;
		case 'c': // line 1
			i++;
		case 'e':
			i++;
			break;
		case 'f':
			i++;
			break;
		default:
			System.out.print(letter);
		}
		System.out.println(i);

		List<Integer> numbers = new ArrayList<>();
		for (int k = 1; k <= 10; k++) {
			numbers.add(k);
		}

		Optional<Integer> result = numbers.stream().filter(x -> x % 3 != 0).reduce((ii, j) -> ii + j);
		result.ifPresent(System.out::print); // line 1
	}
}