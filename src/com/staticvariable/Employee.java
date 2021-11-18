package com.staticvariable;
public class Employee 
{ 
	// Declare instance variables. 
	private String name; 
	private int id; 
	// Declare a static variable companyName with data type String and assign value IBM which is common for all the objects. 
	static String companyName = "IBM"; 

	// Declare a two-parameter constructor with parameters named n and i. 
	public Employee(String n, int i) 
	{ 
		name = n; 
		id = i; 
	} 
	// Declare an instance method display and print the output on the console. 
	public void display() 
	{ 
		System.out.println("Name: "+name+ " " +"Id = "+id+ " " +"Company Name:"+ " " +companyName); 
	} 
	
	public static void staticDisplay() 
	{ 
		Employee e = new Employee("Sandeep", 1111);
		System.out.println("Name: "+e.name+ " " +"Id = "+e.id+ " " +"Company Name:"+ " " +companyName); 
	}
	public static void main(String[] args) 
	{ 
		// Create the first object of the class and pass the two arguments with type string and int. 
		Employee e = new Employee("Shubh", 123);

		// Call the display method using reference variable e. 
		e.display(); 
		// Similarly, create the second object of the class and pass the two arguments. 
		Employee e1 = new Employee("Deep", 321); 
		e1.display(); 
		
		// static method we can access without Object Reference
		staticDisplay();
	} 
}

/*
Output:-

Name: Shubh Id = 123 Company Name: IBM
Name: Deep Id = 321 Company Name: IBM
Name: Sandeep Id = 1111 Company Name: IBM
*/