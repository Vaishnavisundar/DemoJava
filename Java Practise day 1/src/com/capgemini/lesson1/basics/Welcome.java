package com.capgemini.lesson1.basics;

import java.util.Scanner;

public class Welcome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String firstName; 
		System.out.println("Enter the first name ");
		firstName=sc.next();
		System.out.println("The first name is " + firstName);
		
		float cost;
		System.out.println("Enter the cost ");
		cost=sc.nextFloat();
		System.out.println("The cost is "+ cost);
		
		int numOne,numTwo,result;
		System.out.println("Enter the value of numOne ");
		numOne=sc.nextInt();
	    System.out.println("Enter the value of numTwo ");
		numTwo=sc.nextInt();
		result=numOne+numTwo;
		System.out.println("Addition of " + numOne +" and" + numTwo + " is" + result);
		sc.close();
	}
}
