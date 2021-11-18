package com.stream;

import java.util.List;
import java.util.stream.Collectors;

public class EmployeeTaxService {

	public static List<Employee> calculateTax(String type) {

		if (type.equalsIgnoreCase("Tax")) {
			return EmployeeDatabase.getEmployee().stream().filter(emp -> emp.getSalary() > 50000)
					.collect(Collectors.toList());
		} else {
			return EmployeeDatabase.getEmployee().stream().filter(emp -> emp.getSalary() <= 50000)
					.collect(Collectors.toList());
		}

	}

	public static void main(String[] args) {
		System.out.println("==Non Tax Payer====");
		System.out.println(EmployeeTaxService.calculateTax("non"));
		System.out.println("=====Tax Payer====");
		System.out.println(EmployeeTaxService.calculateTax("tax"));

	}

}
