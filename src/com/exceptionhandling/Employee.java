package com.exceptionhandling;

import java.util.ArrayList;
import java.util.List;

public class Employee {

	private int id;
	private String name;
	private int salary;

	// Static Method return All Employee
	public static List<Employee> getEmployee() {

		List<Employee> list = new ArrayList<Employee>();

		list.add(new Employee(1, "Sandeep", 20000));
		list.add(new Employee(2, "Amit", 30000));
		list.add(new Employee(3, "Sandesh", 20000));
		list.add(new Employee(4, "Amar", 30000));

		return list;

	}

	public Employee(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

}
