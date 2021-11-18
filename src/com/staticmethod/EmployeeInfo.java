package com.staticmethod;

import java.util.List;

public class EmployeeInfo {

	private List<Employee> emp;

	private List<Address> addrs;
	private List<Department> dept;
	
	private String country;

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

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "EmployeeInfo [emp=" + emp + ", addrs=" + addrs + ", dept=" + dept + ", country=" + country + "]";
	}

	

}
