package com.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsFilterAndMap {

	public static void main(String[] args) {

		List<Person> persons = new ArrayList<Person>();

		persons.add(new Person(1, "abc", "IT"));
		persons.add(new Person(2, "def", "com"));
		persons.add(new Person(3, "abc", "e&tc"));
		persons.add(new Person(4, "gef", "mech"));

		String name = persons.stream().filter(x -> "jack".equals(x.getName())).map(Person::getName).findAny()
				.orElse("1");

		System.out.println("name :- " + name);

		List<String> collect = persons.stream().map(Person::getName).collect(Collectors.toList());

		collect.forEach(System.out::println);

	}

}
