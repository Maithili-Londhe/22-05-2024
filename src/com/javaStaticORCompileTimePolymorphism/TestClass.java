package com.javaStaticORCompileTimePolymorphism;

public class TestClass {

	public static void main(String[] args) {
		
		Employee employee1 = new Employee();
		employee1.getDetails();
		
		System.out.println();
		
		Employee employee2 = new Employee();
		employee2.getDetails();
		
		System.out.println("-----------------------------------------------------------");
		
		
		Employee employee11 = new Employee(121, "Ajay", "SE", 67383.34);
		employee11.getDetails();
		
		System.out.println();
		
		Employee employee12 = new Employee(132, "Jayesh", "BA", 78393.32);
		employee12.getDetails();
		
	}

}
