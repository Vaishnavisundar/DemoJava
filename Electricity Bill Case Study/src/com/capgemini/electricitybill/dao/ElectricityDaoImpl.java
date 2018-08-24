package com.capgemini.electricitybill.dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.capgemini.electricitybill.entity.Electricity;
import com.capgemini.electricitybill.exception.ElectricityException;
import com.capgemini.electricitybill.services.ElectricityService;

public class ElectricityDaoImpl implements ElectricityDao{

	List myList;{
		myList=new ArrayList();
	}
	Electricity e=new Electricity();
	long meterNum=111;
	long billNum=222;
	
	
	public long addAccount(Electricity e) throws ElectricityException {
		try {
			
			if(e==null) 
				{throw new Exception();}
			
		meterNum++;
		e.setMeterNumber(meterNum);
		myList.add(e);
		
		return meterNum;
		}
		catch(Exception e1) {
			throw new ElectricityException(" Some problem in the list",e1);
		}
	}

	@Override
	public List<Electricity> displayDetails(Electricity e) {
		
		return myList;
	}

	@Override
	public Electricity createBill(Electricity e) {
		
		long netReading,excessReading;
		float netCost=0;
		netReading=e.getCurrentReading()-e.getPreviousReading();
		System.out.println("\n Cost for first 100 units is 5 ruppee per unit after that each unit 6 ruppee and a minimum fixed cost of 100:");
		
		if(netReading<20) {
			netCost=100;
		}
		else if(netReading<100) {
		
			netCost=(netReading*5);
		}
		else {
			
			netCost=100*5;
			excessReading=netReading-100;
			netCost=netCost+(excessReading*6);
		}
		e.setBillCost(netCost);
		e.setDate(LocalDate.now());
		billNum++;
		e.setBillNumber(billNum);
		return e;
	}

}
