package com.capgemini.ui;

import com.capgemini.oops.entity.Mobile;

public class Test_Mobile {
	
	public static void main(String[] args) {
	
 
/*    m1.setMobileNumber(123456789);
    m1.setMobileColour("black");
    m1.setMobileCompanyname("Moto");
    m1.setMobileId(123);
    m1.setMobileOwnername("Vaishu");*/
    
    Mobile m1=new Mobile();
    Mobile m2 =new Mobile(123,"Ravali","blue",45);
    
    System.out.println(m1);
    System.out.println(m2);
    
    
    

}
}