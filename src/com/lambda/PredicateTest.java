package com.lambda;

import java.util.function.*;

public class PredicateTest {
	int age;

	public static void main(String[] args) {
		PredicateTest p1 = new PredicateTest();
		p1.age = 6;
		check(p1, p -> p.age < 5);
	}

	private static void check(PredicateTest panda, Predicate<PredicateTest> pred) {
		String result = pred.test(panda) ? "match" : "not match";
		System.out.print(result);
	}
}