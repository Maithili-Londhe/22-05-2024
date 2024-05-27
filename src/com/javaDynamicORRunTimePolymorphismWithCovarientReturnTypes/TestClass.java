package com.javaDynamicORRunTimePolymorphismWithCovarientReturnTypes;

public class TestClass {

	public static void main(String[] args) {
		
		
		
		Department department = new Department(121, "SE");
		department.getDetails();
		
		System.out.println("-----------------------------------------------------------");
			
		Employee employee = new Employee(132, "Jayesh", "BA", 78393.32);
		employee.getDetails();
		
	}

}
