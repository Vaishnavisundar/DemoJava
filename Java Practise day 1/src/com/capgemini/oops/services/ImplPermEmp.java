package com.capgemini.oops.services;

public class ImplPermEmp implements IPerson{
	
	int empId;
	double basicSal;
	
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public double getBasicSal() {
		return basicSal;
	}

	public void setBasicSal(double basicSal) {
		this.basicSal = basicSal;
	}

	@Override
	public String toString() {
		return "ImplPermEmp [empId=" + empId + ", basicSal=" + basicSal
				+ ", getEmpId()=" + getEmpId() + ", getBasicSal()="
				+ getBasicSal() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

	@Override
	public void calc() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
}
