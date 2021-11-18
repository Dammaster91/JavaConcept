package com.exceptionhandling;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class TryWithResources {
	public static void main(String args[]) {
		// Using try-with-resources
		try (PrintWriter printWriter = new PrintWriter(new FileWriter("EmployeeDetails.txt"))) {
			List<Employee> empList = Employee.getEmployee();
			for (Employee emp : empList) {
				printWriter.println(emp.getId() + " " + emp.getName() + " " + emp.getSalary());
			}

			System.out.println("Message written to file successfuly! ");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
}


/*
 *Output: 
 * Message written to file successfuly!
 * 
EmployeeDetails.txt:-  

1 Sandeep 20000
2 Amit 30000
3 Sandesh 20000
4 Amar 30000

 * 
 * */
