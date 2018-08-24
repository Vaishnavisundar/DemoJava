package com.capgemini.lesson1.basics;

public class Test_Employee {

	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		
		e1.setEmployeeId(1001);
		e1.setEmployeeFirstname("Vaishu");
		e1.setEmployeeLastname("Sundar");
		e1.setEmployeeSalary(10000);
		
		System.out.println(e1.toString());
		
		e2.setEmployeeId(1002);
		e2.setEmployeeFirstname("Ravali");
		e2.setEmployeeLastname("Ravichandran");
		e2.setEmployeeSalary(2000);
		
		System.out.println(e2.toString());

	}

}
