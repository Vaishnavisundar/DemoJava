package com.capgemini.ui;

import com.capgemini.oops.entity.Student;

public class Test_Student {
	
	public static void main(String[] args) {
		
		Student s1= new Student(101,"Vaishu",50,60,70);
		System.out.println(s1);
		s1.findTotal();
		
		Student s2= new Student(102,"Ravali",90,80,70);
		System.out.println(s2);
		s2.findTotal();
		
	}

}
