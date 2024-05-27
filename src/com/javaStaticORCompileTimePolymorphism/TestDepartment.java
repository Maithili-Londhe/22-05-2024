package com.javaStaticORCompileTimePolymorphism;

public class TestDepartment {

	public static void main(String[] args) {

		Department department1 = new Department();
		department1.getDetails();

		System.out.println();

		Department department2 = new Department();
		department2.getDetails(2233);

		System.out.println();

		Department department3 = new Department();
		department3.getDetails(4567, "Software Engineering");

	}

}
