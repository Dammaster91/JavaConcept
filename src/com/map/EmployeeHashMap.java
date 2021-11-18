package com.map;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeHashMap {
	public static void main(String[] args) {
		Map<String, Employee> map = new HashMap<String, Employee>();

		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee("Sandeep", "JAVA", 10000));
		list.add(new Employee("Sachin", "JAVA", 150000));
		list.add(new Employee("Amit", "JAVA", 5000));
		list.add(new Employee("Kiran", ".Net", 30000));
		list.add(new Employee("Shubham", ".Net", 20000));
		list.add(new Employee("Kuldip", ".Net", 60000));

		// Find Max Salary Project Wise and Add into Map
		System.out.println("===========Find Max salary Project========");
		for (Employee employee : list) {
			if (map.containsKey(employee.getProject())) {
				if (map.get(employee.getProject()).getSalary() < employee.getSalary()) {
					map.put(employee.getProject(), employee);
				}
			} else {
				map.put(employee.getProject(), employee);
			}
		}

		for (Map.Entry<String, Employee> entry : map.entrySet()) {
			System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue().getSalary());
		}

		System.out.println("===========Find Min salary Project=========");
		Map<String, Optional<Employee>> minSalMap = list.stream().collect(Collectors.groupingBy(Employee::getProject,
				Collectors.minBy(Comparator.comparingDouble(Employee::getSalary))));

		for (Map.Entry<String, Optional<Employee>> entry : minSalMap.entrySet()) {
			System.out.println("Key " + entry.getKey() + ", Value " + entry.getValue().get().getSalary());
		}

	}

}
