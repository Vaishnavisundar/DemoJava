package com.capgemini.electricitybill.services;

import com.capgemini.electricitybill.dao.ElectricityDaoImpl;

public class ElectricityServiceImpl implements ElectricityService{

	private ElectricityDaoImpl serviceDao;
	
	public ElectricityServiceImpl(){
		serviceDao=new ElectricityDaoImpl();
	}
	
	
	@Override
	public long addAccount(String fName, String lName) {
		
		long meterNum=serviceDao.addAccount(fName,lName);
		return meterNum;
	}

}
