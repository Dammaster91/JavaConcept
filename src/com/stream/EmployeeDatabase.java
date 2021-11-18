package com.stream;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDatabase {

	public static List<Employee> getEmployee() {

		List<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee(1, "Sandeep", "IT", 50000));
		empList.add(new Employee(2, "Amit", "Com", 60000));
		empList.add(new Employee(3, "Sachin", "ENTC", 30000));
		empList.add(new Employee(4, "Kishor", "Mech", 90000));
		return empList;

	}

}
