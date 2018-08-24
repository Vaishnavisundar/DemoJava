package com.capgemini.ui;

import com.capgemini.oops.entity.Emp;
import com.capgemini.oops.entity.Person;

public class Test_Inheritance {
	public static void main(String[] args) {
		
		Person p1=new Person(111,"Vaishu");
		System.out.println(p1);
	    double d=p1.calc();
	    System.out.println(d);
	    
	    Emp e1 = new Emp(121,"ravali",3000);
	    System.out.println(e1);
	    double tsal=e1.calc();
	    System.out.println(tsal);
	    	    
	}
	

}
