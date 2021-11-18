package com.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class TestSearchMain {
	public static void main(String[] args) {

		// list of animals
		List<Animal> animals = new ArrayList<Animal>();
		animals.add(new Animal("fish", false, true));
		animals.add(new Animal("kangaroo", true, false));
		animals.add(new Animal("rabbit", true, false));
		animals.add(new Animal("turtle", false, true));
		// pass class that does check
		System.out.println("=======Without Lambda Expression");
		print(animals, new CheckIfHopper());
		print(animals, new CheckIfSwim());
		System.out.println("=======With Lambda Expression");
		// With Lambda Expression we can avoid 2 Class Creation
		print(animals, b -> b.canHop());
		print(animals, a -> a.canSwim());

		// With Predicate
		System.out.println("=======Using PreDefined Functional Interface Predicate======");
		printWithPredicate(animals, b -> b.canHop());
		printWithPredicate(animals, a -> a.canSwim());

		System.out.println("======Using Consumer=====");
		Consumer<String> consumer = x -> System.out.println(x);
		printConsumer(consumer, "Hello World");

		System.out.println("======Using Supplier=====");
		Supplier<Integer> number = () -> new Random(5).nextInt();
		System.out.println(returnNumber(number));
	}

	private static int returnNumber(Supplier<Integer> supplier) {
		return supplier.get();
	}

	private static void printConsumer(Consumer<String> consumer, String string) {
		consumer.accept(string);

	}

	private static void print(List<Animal> animals, CheckTrait checker) {
		for (Animal animal : animals) {
			// the general check
			if (checker.test(animal))
				System.out.print(animal + " ");
		}
		System.out.println();
	}

	// Using Predicate
	private static void printWithPredicate(List<Animal> animals, Predicate<Animal> checker) {
		for (Animal animal : animals) {
			if (checker.test(animal))
				System.out.print(animal + " ");
		}
		System.out.println();
	}

}
