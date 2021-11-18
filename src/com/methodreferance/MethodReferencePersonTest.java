package com.methodreferance;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MethodReferencePersonTest {

	// A static method to
	// compare with name
	public static int compareByName(Person a, Person b) {
		return a.getName().compareTo(b.getName());
	}

	// A static method to
	// compare with age
	public static int compareByAge(Person a, Person b) {
		return a.getAge().compareTo(b.getAge());
	}

	// Main
	public static void main(String[] args) {
		// List of person
		List<Person> personList = new ArrayList<>();
		// Add Elements
		personList.add(new Person("vicky", 24));
		personList.add(new Person("poonam", 25));
		personList.add(new Person("sachin", 19));

		long l = personList.stream().count();
		System.out.println("PersonList Count: " + l);

		// Use static method reference to
		// sort array by name
		Collections.sort(personList, MethodReferencePersonTest::compareByName);
		System.out.println("Sort by name :");
		personList.stream().map(x -> x.getName() + " " + x.getAge()).forEach(System.out::println);

		// Use static method reference
		// to sort array by age
		Collections.sort(personList, MethodReferencePersonTest::compareByAge);
		System.out.println("Sort by age :");
		personList.stream().map(x -> x.getName() + " " + x.getAge()).forEach(System.out::println);

		System.out.println("using parallelStream");

		personList.parallelStream().filter(x -> x.getAge() >= 25).map(x -> x.getName() + " " + x.getAge())
				.forEach(System.out::println);
	}
}