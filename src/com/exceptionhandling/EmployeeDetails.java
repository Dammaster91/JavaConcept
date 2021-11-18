package com.exceptionhandling;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author 10690498
 *
 */
public class EmployeeDetails {


	/**
	 * @param List<Employee> 
	 * @return 
	 */
	public static List<Employee> getEmployeeByName(List<Employee> emp,String str) {
		List<Employee> empByName = null;
		try {
			empByName = emp.stream().filter(e -> e.getName().startsWith(str)).collect(Collectors.toList());

			if (empByName.isEmpty()) {

				throw new EmployeeNotFoundException("Employee Details Not Found");
			}
		} catch (EmployeeNotFoundException e) {
			e.printStackTrace();
		}

		return empByName;

	}

	public static void main(String[] args) {
		List<Employee> empByName = getEmployeeByName(Employee.getEmployee(),"S");
		empByName.forEach(emp -> System.out.println(emp.getId() + " " + emp.getName() + " " + emp.getSalary()));
		System.out.println("Normal Termination");
	}

}

/*
Output:-

 ========If Found=======
1 Sandeep 20000
3 Sandesh 20000
Normal Termination

=====If not Found=======
	
	com.exceptionhandling.EmployeeNotFoundException: Employee Details Not Found
	at com.exceptionhandling.EmployeeDetails.getEmployeeByName(EmployeeDetails.java:24)
	at com.exceptionhandling.EmployeeDetails.main(EmployeeDetails.java:35)
	
    Normal Termination
*/