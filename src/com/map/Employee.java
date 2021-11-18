package com.map;

public class Employee {

	private String name;
	private String project;

	private double salary;

	public Employee(String name, String project, double salary) {
		super();
		this.name = name;
		this.project = project;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProject() {
		return project;
	}

	public void setProject(String project) {
		this.project = project;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", project=" + project + ", salary=" + salary + "]";
	}
	
	

}

