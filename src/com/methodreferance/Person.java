package com.methodreferance;

// Object need to be sorted.
class Person {
	private String name;
	private Integer age;

	// Constructor
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Integer getAge() {
		return age;
	}

	public String getName() {
		return name;
	}
}
