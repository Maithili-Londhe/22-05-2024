package com.javaStaticORCompileTimePolymorphism;

public class Department
{
	
	private int departmentId;
	private String departmentName;
	
	public Department()
	{
		departmentId = 2029;
		departmentName = "Development";
	}
	
	//method overloading
	public void getDetails()
	{
		System.out.println(departmentId);
		System.out.println(departmentName);
	}
	
	public void getDetails(int departmentId)
	{
		this.departmentId = departmentId;
		
		System.out.println(departmentId);
		System.out.println(departmentName);
	}
	
	public void getDetails(int departmentId, String departmentName)
	{
		this.departmentId = departmentId;
		this.departmentName = departmentName;
		
		System.out.println(departmentId);
		System.out.println(departmentName);
	}	

}
