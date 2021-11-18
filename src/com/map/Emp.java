package com.map;

class Emp {

	private String name;
	private int salary;
	private int id;

	public Emp(int id, String n, int s) {
		this.id = id;
		this.name = n;
		this.salary = s;
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

	public String toString() {
		return "Id: " + this.id + " -- Name: " + this.name + " -- Salary: " + this.salary;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	@Override
	public int hashCode() {
		System.out.println("In hashcode");
		return this.getId();
	}

	@Override
	public boolean equals(Object obj) {
		Emp e = null;
		if (obj instanceof Emp) {
			e = (Emp) obj;
		}
		System.out.println("In equals");
		if (this.getId() == e.getId()) {
			return true;
		} else {
			return false;
		}

	}
}