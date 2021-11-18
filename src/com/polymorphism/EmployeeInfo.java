package com.polymorphism;

import java.util.List;

public class EmployeeInfo {

	private List<Employee> emp;

	private List<Address> addrs;
	private List<Department> dept;

	public List<Employee> getEmp() {
		return emp;
	}

	public void setEmp(List<Employee> emp) {
		this.emp = emp;
	}

	public List<Address> getAddrs() {
		return addrs;
	}

	public void setAddrs(List<Address> addrs) {
		this.addrs = addrs;
	}

	public List<Department> getDept() {
		return dept;
	}

	public void setDept(List<Department> dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "EmployeeInfo [emp=" + emp + ", addrs=" + addrs + ", dept=" + dept + "]";
	}

}
