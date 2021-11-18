package com.exceptionhandling;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class ResourceClose {

	public static void main(String[] args) throws IOException {

		PrintWriter printWriter = null;
		try {
			printWriter = new PrintWriter(new FileWriter("finally.txt"));
			List<Employee> empList = Employee.getEmployee();
			for (Employee emp : empList) {
				printWriter.println(emp.getId() + " " + emp.getName() + " " + emp.getSalary());
			}

			System.out.println("Message written to file successfuly!");
		} finally {
			printWriter.println("In Finaly Block");
			printWriter.close();
			printWriter.flush();
		}

	}

}

/*
 * Output:-
Message written to file successfuly!
Finally.txt:-

1 Sandeep 20000
2 Amit 30000
3 Sandesh 20000
4 Amar 30000
In Finaly Block

 */