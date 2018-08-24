package com.capgemini.electricitybill.ui;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.capgemini.electricitybill.entity.Electricity;
import com.capgemini.electricitybill.exception.ElectricityException;
import com.capgemini.electricitybill.services.ElectricityService;
import com.capgemini.electricitybill.services.ElectricityServiceImpl;

public class User {

public static void main(String[] args) throws ElectricityException {

		Scanner sc=new Scanner(System.in);
		int choice;
		String ch;
		Electricity e=new Electricity();
		
		//Creating an object for ElectricityService interface
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
	    	     String fName=sc.next();
	    	     e.setFirstName(fName);
	    	     System.out.println("\n Last Name  : " ) ;
	    	     String lName=sc.next();
	    	     e.setLastName(lName);
	    	     long meterNum = service.addAccount(e);
	    	     System.out.println("\n The generated meter num : " +meterNum);
	    	     break;
	    	     
	     case 2 :
	    	      System.out.println("\n Enter the Meter number : ");
	    	      meterNum=sc.nextLong();
	    	      System.out.println("\n Enter the previous reading : " );
	    	      long previousReading=sc.nextLong();
	    	      e.setPreviousReading(previousReading);
	    	      System.out.println("\n Enter the current reading : " );
	    	      long currentReading=sc.nextLong();
	    	      e.setCurrentReading(currentReading);
	    	      Electricity eBill=service.createBill(e);
	    	      System.out.println("\n Generated Bill number = " +eBill.getBillNumber());
	    	      System.out.println("\n Bill cost             = " +eBill.getBillCost());
	    	      break;
	    	      
	    	      
 	    	     
	     case 3 :
	    	      List<Electricity> mylist=new ArrayList();
	    	      System.out.println("\n Enter Meter Number : " );
	    	      meterNum=sc.nextLong();
	    	      e.setMeterNumber(meterNum);
	    	      mylist=service.displayDetails(e);
	    	      System.out.println("\n The details are :  ");
	    	      System.out.println(mylist);
	    	      break;
	    	     
	     default : System.out.println("\n Invalid choice");break;
	    }
	    
	    System.out.println("\n Press y to continue");
	    ch=sc.next(); 
	}while(ch.equalsIgnoreCase("y"));
	
	}
}

