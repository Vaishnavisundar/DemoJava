package com.capgemini.oops.entity;

public class Emp extends Person{
	
	double basicSal;

	public Emp(int id, String name, double basicSal) {
		super(id, name);
		this.basicSal = basicSal;
	}
		
	public double getBasicSal() {
		return basicSal;
	}

	public void setBasicSal(double basicSal) {
		this.basicSal = basicSal;
	}

	public double calc()
	{
		double pf;
		double TA=5000;
		pf=(basicSal*12)/100;
		double cost=pf+TA;
		System.out.println("\n The total amount = " + cost);
        return cost;
	}


	

}
