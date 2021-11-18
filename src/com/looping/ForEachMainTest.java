package com.looping;

import java.util.ArrayList;
import java.util.List;

import com.stream.Employee;

public class ForEachMainTest {
	public static List<Employee> getEmployee() {

		List<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee(1, "Sandeep", "IT", 50000));
		empList.add(new Employee(2, "Amit", "Com", 60000));
		empList.add(new Employee(3, "Sachin", "ENTC", 30000));
		empList.add(new Employee(4, "Kishor", "Mech", 90000));
		return empList;

	}

	public static void main(String[] args) {
		// An array of strings
		String[] str = { "First", "Second", "Third", "Fourth", "Fifth" };

		// iterating every element of str using for-each loop
		for (String s : str) {
			System.out.println(s);
		}
		System.out.println("=====Using Nested For Each=========");
		// Two Dimensional Array
		int[][] twoDArray = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 } };

		// iterating every element of twoDArray using for-each loop
		for (int[] oneDArray : twoDArray) {
			System.out.print("[");

			// iterating every element of oneDArray using for-each loop
			for (int i : oneDArray) {
				System.out.print(i + "\t");
			}
			System.out.println("]");
		}

		System.out.println("======Iterate Employee List Using foreach=====");
		System.out.println("Sr No\t" + " Name\t " + "Salary");
		for (Employee emp : ForEachMainTest.getEmployee()) {

			System.out.println(emp.getId() + "\t" + emp.getName() + "\t" + emp.getSalary());

		}
	}

}
