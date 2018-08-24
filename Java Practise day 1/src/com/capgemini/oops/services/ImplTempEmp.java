package com.capgemini.oops.services;

public class ImplTempEmp implements IPerson{
	
	int noDays;
	int salPerday;
	int empId;
	
	

	
	public int getNoDays() {
		return noDays;
	}




	public void setNoDays(int noDays) {
		this.noDays = noDays;
	}




	public int getSalPerday() {
		return salPerday;
	}




	public void setSalPerday(int salPerday) {
		this.salPerday = salPerday;
	}




	public int getEmpId() {
		return empId;
	}




	public void setEmpId(int empId) {
		this.empId = empId;
	}




	@Override
	public String toString() {
		return "ImplTempEmp [noDays=" + noDays + ", salPerday=" + salPerday
				+ ", empId=" + empId + ", getNoDays()=" + getNoDays()
				+ ", getSalPerday()=" + getSalPerday() + ", getEmpId()="
				+ getEmpId() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}




	@Override
	public void calc() {
		// TODO Auto-generated method stub
		
	}




	
	

}
