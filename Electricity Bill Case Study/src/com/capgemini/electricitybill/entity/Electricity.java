package com.capgemini.electricitybill.entity;

import java.time.LocalDate;

public class Electricity {
	
	long meterNumber;
	String firstName;
	String lastName;
	long currentReading;
	long previousReading;
	long billNumber;
	float billCost;
	
	
	public float getBillCost() {
		return billCost;
	}

	public void setBillCost(float billCost) {
		this.billCost = billCost;
	}

	LocalDate date;
	

	
	public Electricity(long meterNumber, String firstName, String lastName, long currentReading, long previousReading,
			long billNumber, float billCost, LocalDate date) {
		super();
		this.meterNumber = meterNumber;
		this.firstName = firstName;
		this.lastName = lastName;
		this.currentReading = currentReading;
		this.previousReading = previousReading;
		this.billNumber = billNumber;
		this.billCost = billCost;
		this.date = date;
	}

	public Electricity() {
		super();
		this.meterNumber = 0000;
		this.firstName = "firstName";
		this.lastName = "lastName";
		this.currentReading = 0000;
		this.previousReading = 00000;
		this.billCost = 00000;
		this.billNumber = 00000;
		//this.date = date;
	}


	public long getMeterNumber() {
		return meterNumber;
	}

	public void setMeterNumber(long meterNumber) {
		this.meterNumber = meterNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public long getCurrentReading() {
		return currentReading;
	}

	public void setCurrentReading(long currentReading) {
		this.currentReading = currentReading;
	}

	public long getPreviousReading() {
		return previousReading;
	}

	public void setPreviousReading(long previousReading) {
		this.previousReading = previousReading;
	}

	public long getBillNumber() {
		return billNumber;
	}

	public void setBillNumber(long billNumber) {
		this.billNumber = billNumber;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Electricity [meterNumber=" + meterNumber + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", currentReading=" + currentReading + ", previousReading=" + previousReading + ", billNumber="
				+ billNumber + ", billCost=" + billCost + ", date=" + date + "]";
	}



	
	
	
	
	
	
	

}
