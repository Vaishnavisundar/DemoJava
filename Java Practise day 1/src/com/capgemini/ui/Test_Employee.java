package com.capgemini.ui;

import java.util.Scanner;

import com.capgemini.oops.entity.Employee;

public class Test_Employee {

	public static void main(String[] args) {
		
		
		Employee e1 = new Employee();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("\n Enter the employee ID : ");
		e1.setEmpId(sc.nextInt());
		System.out.println("\n Enter Employee name   : ");
		e1.setEmpName(sc.next());
		System.out.println("\n Enter Basic salary    : ");
		e1.setBasicSalary(sc.nextInt());
		
		e1.calculateSalary();
		
		System.out.println(e1);
		
      		
		
	}
}
