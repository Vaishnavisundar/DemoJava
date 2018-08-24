package com.capgemini.ui;

import com.capgemini.oops.services.IPerson;
import com.capgemini.oops.services.ImplPermEmp;
import com.capgemini.oops.services.ImplTempEmp;

public class Test_Interface {
	public static void main(String[] args) {
		
		ImplPermEmp p1=new ImplPermEmp();
		p1.setEmpId(111);
	    p1.setBasicSal(2000);
	    System.out.println(p1);

		ImplTempEmp t1= new ImplTempEmp();
		t1.setEmpId(123);
		t1.setNoDays(200);
		t1.setSalPerday(3000);
		System.out.println(t1);
		
		IPerson refvar;
		
		refvar =p1;
		refvar.calc();
	
		refvar=t1;
		refvar.calc();
	}

}
