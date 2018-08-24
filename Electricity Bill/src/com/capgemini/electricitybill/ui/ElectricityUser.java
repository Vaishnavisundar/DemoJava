package com.capgemini.electricitybill.ui;

import java.util.Scanner;

import com.capgemini.electricitybill.entity.Electricity;
import com.capgemini.electricitybill.services.ElectricityService;
import com.capgemini.electricitybill.services.ElectricityServiceImpl;

public class ElectricityUser {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Electricity e=new Electricity();
		int choice;
		String ch;
		
		ElectricityService service;{
			service=new ElectricityServiceImpl();
		}
		
		do {
			System.out.println("\n Enter the billing details : ");
		    System.out.println("\n 1 : Adding new account : " );
		    System.out.println("\n 2 : Create bill        : " );
		    System.out.println("\n 3 : Display            : " );
		    choice=sc.nextInt();
		    
		    switch(choice) {
		    
		    case 1 : 
		    	     System.out.println("\n First Name : " ) ;
		    	     String fName=e.getFirstName();
		    	     System.out.println("\n Last Name  : " ) ;
		    	     String lName=e.getLastName();
		    	     long meterNum = service.addAccount(fName,lName);
		    	     System.out.println("\n The generated meter num : " +meterNum);
		    	     break;
		    }
		    
		    System.out.println("\n Press y to continue");
		    ch=sc.next(); 
		}while(ch.equalsIgnoreCase("y"));
		
		
		
	}
	
}
