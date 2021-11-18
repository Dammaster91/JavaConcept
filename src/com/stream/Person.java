package com.stream;

public class Person {

	private int age;
	private String name;
	private String dept;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public Person(int age, String name, String dept) {
		super();
		this.age = age;
		this.name = name;
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + ", dept=" + dept + "]";
	}

}
