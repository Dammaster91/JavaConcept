package com.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ListIteratorExample {
	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		list.add("Ravi");
		list.add("Vijay");
		list.add("Ravi");
		list.add("Ajay");

		System.out.println("Traversing list through List Iterator:");
		System.out.println("== hasPrevious Here, element iterates in reverse order========");
		ListIterator<String> list1 = list.listIterator(list.size());
		while (list1.hasPrevious()) {
			String str = list1.previous();
			System.out.println(str);
		}
		System.out.println("== hasNext Here, element iterates in normal order=====");
		while (list1.hasNext()) {
			String str = list1.next();
			System.out.println(str);
		}

		System.out.println("==Next Indexr==");
		int index1 = list1.nextIndex();
		System.out.println("Position of Next Element: " + index1);

		System.out.println("==Next Indexr==");
		int index2 = list1.previousIndex();
		System.out.println("Position of Previous Element: " + index2);

		System.out.println("Traversing list through for loop:");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		System.out.println("Traversing list through forEach() method:");
		// The forEach() method is a new feature, introduced in Java 8.
		list.forEach(a -> { // Here, we are using lambda expression
			System.out.println(a);
		});

		System.out.println("Traversing list through forEachRemaining() method:");
		Iterator<String> itr = list.iterator();
		itr.forEachRemaining(a -> // Here, we are using lambda expression
		{
			System.out.println(a);
		});

	}
}
