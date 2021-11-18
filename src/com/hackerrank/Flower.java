package com.hackerrank;

import java.util.*;

public class Flower {
	private final String name;
	private final List<Integer> counts;

	public Flower(String name, List<Integer> counts) {
		this.name = name;
		this.counts = new ArrayList<>(counts);
	}

	public final String getName() {
		return name;
	}

	public final List<Integer> getCounts() {
		return new ArrayList<>(counts);
	}
}