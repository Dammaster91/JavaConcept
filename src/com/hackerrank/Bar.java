package com.hackerrank;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Bar extends Foo {
	public void foo(Collection arg) {
		System.out.println("Hello world!");
	}

	public void foo(List arg) {
		System.out.println("Hola Mundo! ");
	}

	public static void main(String[] args) {
		Foo f1 = new Foo();
				Foo f2 = new Bar ();
				Bar b1= new Bar ();
				List<String> li = new ArrayList<> ();
				b1.foo(li);
	}
}
