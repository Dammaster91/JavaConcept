package com.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PersonTest {

	public static void main(String[] args) {

		List<Person> p = new ArrayList<Person>();

		p.add(new Person(1, "abc", "IT"));
		p.add(new Person(2, "def", "IT"));
		p.add(new Person(3, "abc", "IT"));
		p.add(new Person(4, "gef", "IT"));
		// stream.filter() to filter a List, and collect() to convert a stream
		// into a List and forEach to print data
		System.out.println("====Find by Name=======");
		p.stream().filter(c -> c.getName().equals("abc")).collect(Collectors.toList()).forEach(System.out::println);
		System.out.println("====Find by Age=======");
		List<Person> p1=p.stream().filter(c -> c.getAge() > 2).collect(Collectors.toList());
		p1.forEach(System.out::println);
		System.out.println("====Using condition=======");
		Person result1 = p.stream().filter(x -> "abc".equals(x.getName()) && x.getAge() == 4).findAny().orElse(null);
		System.out.println(result1);

		Person result2 = p.stream().filter(x -> "abc".equals(x.getName())).findAny().orElse(null);

		System.out.println(result2);

		System.out.println("=======filter list using name start with a and map age into list ==========");
		List<Integer> p3=p.stream().filter(c -> c.getName().startsWith("a")).map(c -> c.getAge()).collect(Collectors.toList());
		p3.forEach(System.out::println);
		System.out.println("=================");
		List<String> lines = Arrays.asList("spring", "node", ".net");

		List<String> result = lines.stream().filter(line -> !".net".equals(line)).collect(Collectors.toList());

		result.forEach(System.out::println);

		System.out.println("=======Even No==========");

		List<Integer> list = new ArrayList<Integer>();

		for (int i = 1; i < 10; i++) {
			list.add(i);
		}

		Stream<Integer> stream = list.stream();
		List<Integer> evenNumbersList = stream.filter(i -> i % 2 == 0).collect(Collectors.toList());
		System.out.print(evenNumbersList);

		System.out.println("\n======Collect Stream elements to an Array=========");
		Integer[] evenNumbersArr = list.stream().filter(i -> i % 2 == 0).toArray(Integer[]::new);
		System.out.print(evenNumbersArr.length);

		System.out.println("\n======Count No// count returnn type is long=========");
		long  evenNumbersArr1 =  list.stream().filter(i -> i % 2 == 0).count();
		System.out.print(evenNumbersArr1);


	}

}
