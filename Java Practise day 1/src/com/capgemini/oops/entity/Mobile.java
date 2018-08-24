package com.capgemini.oops.entity;

public class Mobile {

	int mobileNumber;
	String mobileOwnername;
	String mobileCompanyname;
	String mobileColour;
	int mobileId;
	
	
	
	public Mobile(int mobileNumber, String mobileOwnername, String mobileColour, int mobileId) {
		super();
		this.mobileNumber = mobileNumber;
		this.mobileOwnername = mobileOwnername;
		this.mobileCompanyname ="hghg";
		this.mobileColour = mobileColour;
		this.mobileId = mobileId;
	}
	
	public Mobile()
	{
		this.mobileNumber = 987654321;
		this.mobileOwnername = "Ravali";
		this.mobileCompanyname = "Samsung";
		this.mobileColour = "Red";
		this.mobileId = 456;
		
	}
	
	
	public int getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(int mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getMobileOwnername() {
		return mobileOwnername;
	}
	public void setMobileOwnername(String mobileOwnername) {
		this.mobileOwnername = mobileOwnername;
	}
	public String getMobileCompanyname() {
		return mobileCompanyname;
	}
	public void setMobileCompanyname(String mobileCompanyname) {
		this.mobileCompanyname = mobileCompanyname;
	}
	public String getMobileColour() {
		return mobileColour;
	}
	public void setMobileColour(String mobileColour) {
		this.mobileColour = mobileColour;
	}
	public int getMobileId() {
		return mobileId;
	}
	public void setMobileId(int mobileId) {
		this.mobileId = mobileId;
	}

	@Override
	public String toString() {
		return "Mobile [mobileNumber=" + mobileNumber + ", mobileOwnername="
				+ mobileOwnername + ", mobileCompanyname=" + mobileCompanyname
				+ ", mobileColour=" + mobileColour + ", mobileId=" + mobileId
				+ "]";
	}


	
	
	
	}
	
	
	
	

