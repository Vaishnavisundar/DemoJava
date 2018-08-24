package com.capgemini.oops.entity;

public class Employee {
	
	public int empId;
	String empName;
	float basicSalary;
	float hraAllowance;
	float empTax;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public float getBasicSalary() {
		return basicSalary;
	}
	public void setBasicSalary(float basicSalary) {
		this.basicSalary = basicSalary;
	}
	public float getHraAllowance() {
		return hraAllowance;
	}
	public void setHraAllowance(float hraAllowance) {
		this.hraAllowance = hraAllowance;
	}
	public float getEmpTax() {
		return empTax;
	}
	public void setEmpTax(float empTax) {
		this.empTax = empTax;
	}
	
/*	public Employee(int empId, String empName, float basicSalary,
			float hraAllowance, float empTax) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.basicSalary = basicSalary;
		this.hraAllowance = hraAllowance;
		this.empTax = empTax;
	}*/

	public void calculateSalary()
	{
		float hraAllowance=5000.000f;
		float empTax= basicSalary * 12 /100;
		float grossSalary= basicSalary+hraAllowance+empTax;
		System.out.println("Gross salary = " + grossSalary);
		
	}
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName
				+ ", basicSalary=" + basicSalary + ", hraAllowance="
				+ hraAllowance + ", empTax=" + empTax + "]";
	}
	
	
}
