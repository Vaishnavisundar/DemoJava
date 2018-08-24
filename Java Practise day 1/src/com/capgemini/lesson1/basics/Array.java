package com.capgemini.lesson1.basics;

import java.util.Scanner;

public class Array {
public static void main(String[] args) {
	Scanner sc= new Scanner (System.in);
	
	int no, total=0;
	System.out.println("Enter the number of students");
	no=sc.nextInt();
	
	int[] m=new int[5];
	System.out.println("Enter marks");
	for(int i=0;i<no;i++)
	{
		m[i]=sc.nextInt();
	
	}
	
	System.out.println("Display the marks of all the " + no + " of students" );
	for(int i=0;i<no;i++)
	{
		
		System.out.println(m[i]);
	}
	
	System.out.println("Total of " + no + "of students");
	for(int i=0;i<no;i++)
	{
		total=total+m[i];
	}
	System.out.println("Total of " + no + "of students = " + total);
	sc.close();
	
	
}
}
