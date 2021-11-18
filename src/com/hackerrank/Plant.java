package com.hackerrank;

import java.util.ArrayList;
import java.util.List;

class Plant {
	private final String name;
	private final List<Integer> counts;

	public Plant(String name, List<Integer> counts) {
		this.name = name;
		this.counts = new ArrayList<>(counts);
	}

	public String getName() {
		return name;
	}

	public List<Integer> getCounts() {
		return new ArrayList<>(counts);
	}
}