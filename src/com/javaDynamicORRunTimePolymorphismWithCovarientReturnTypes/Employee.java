package com.javaDynamicORRunTimePolymorphismWithCovarientReturnTypes;

public class Employee extends Department
{

	private int employeeId;
	private String employeeName;
	private String employeeRole;
	private double employeeSalary;

	public Employee(int employeeId, String employeeName, String employeeRole, double employeeSalary) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeRole = employeeRole;
		this.employeeSalary = employeeSalary;
	}

	//overrides com.javaDynamicORRunTimePolymorphism.Department.getDetails()

	@Override
	public Employee getDetails()
	{
		System.out.println(employeeId);
		System.out.println(employeeName);
		System.out.println(employeeRole);
		System.out.println(employeeSalary);

		return null;
		
	}

}
