package com.javaStaticORCompileTimePolymorphism;

public class Employee
{
	
	private int employeeId;
	private String employeeName;
	private String employeeRole;
	private double employeeSalary;
	
	//Polymorphism applied on constructor
	//constructor overloading
	public Employee() 
	{
		// TODO Auto-generated constructor stub
		employeeId = 5050;
		employeeName = "Kumar";
		employeeRole = "SD";
		employeeSalary = 70987.67;
	}

	public Employee(int employeeId, String employeeName, String employeeRole, double employeeSalary) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeRole = employeeRole;
		this.employeeSalary = employeeSalary;
	}
	
	public void getDetails()
	{
		System.out.println(employeeId);
		System.out.println(employeeName);
		System.out.println(employeeRole);
		System.out.println(employeeSalary);
		
	}

}
