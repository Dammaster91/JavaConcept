package com.staticmethod;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.sql.rowset.spi.SyncFactory;

public class MethodOverloading {
	
	static{
		System.out.println("static block is invoked");
		}  
	
	// Static Method return All Employee
	public static List<Employee> getEmployee() {

		List<Employee> list = new ArrayList<Employee>();

		list.add(new Employee(1, "Sandeep", 20000, 1, 1));

		list.add(new Employee(2, "Amit", 30000, 2, 2));

		return list;

	}

	// Static Method which return All Address
	public static List<Address> getAddress() {

		List<Address> list = new ArrayList<Address>();

		list.add(new Address(1, "Pune"));

		list.add(new Address(2, "Satara"));

		return list;

	}

	// Static Method return All Department
	public static List<Department> getDepartment() {

		List<Department> list = new ArrayList<Department>();

		list.add(new Department(1, "Pune"));

		list.add(new Department(2, "Satara"));

		return list;

	}

	// Static Method
	// Single parameter return only Employee Details
	public static List<EmployeeInfo> getEmpInfo(List<Employee> emp) {
		List<EmployeeInfo> list = new ArrayList<>();
		EmployeeInfo info = new EmployeeInfo();
		info.setCountry(Employee.country);
		info.setEmp(emp);
		list.add(info);
		return list;

	}

	// Static Method
	// Method overloading with multiple parameter
	// Return Employee details along with address and depatment
	public static List<EmployeeInfo> getEmpInfo(List<Employee> empList, List<Department> deptList,
			List<Address> address) {
		List<EmployeeInfo> employeeInfoList = new ArrayList<>();
		EmployeeInfo info = new EmployeeInfo();

		List<Employee> matchEmpList = empList.stream().filter(e1 -> e1.getId() == 1).collect(Collectors.toList());

		info.setEmp(matchEmpList);
		info.setCountry(Employee.country);
		for (Employee employee : matchEmpList) {

			List<Department> matchDeptList = deptList.stream().filter(d1 -> d1.getDeptId() == employee.getDeptId())
					.collect(Collectors.toList());
			List<Address> matchaddress = address.stream().filter(a1 -> a1.getAddressId() == employee.getAddressId())
					.collect(Collectors.toList());
			info.setDept(matchDeptList);
			info.setAddrs(matchaddress);

		}
		employeeInfoList.add(info);
		return employeeInfoList;

	}

	public static void main(String[] args) {

		// Get only Employee Information
		List<EmployeeInfo> empInfo = getEmpInfo(getEmployee());
		for (EmployeeInfo employeeInfo : empInfo) {
			employeeInfo.getEmp().forEach(System.out::println);
			System.out.println(employeeInfo.getCountry());
		}
		// OutPut:-
		// Employee [id=1, name=Sandeep, salary=20000, deptId=1, addressId=1]
		// Employee [id=2, name=Amit, salary=30000, deptId=2, addressId=2]

		System.out.println("=========================");
		// Get Complete Employee Information
		List<EmployeeInfo> list = getEmpInfo(getEmployee(), getDepartment(), getAddress());
		for (EmployeeInfo employeeInfo : list) {
			employeeInfo.getEmp().forEach(System.out::println);
			employeeInfo.getAddrs().forEach(System.out::println);
			employeeInfo.getDept().forEach(System.out::println);
			System.out.println(employeeInfo.getCountry());
		}
		
		// OutPut:-
		//		Employee [id=1, name=Sandeep, salary=20000, deptId=1, addressId=1]
		//		Address [addressId=1, address=Pune]
		//		Department [deptId=1, deptName=Pune]

	}

}
