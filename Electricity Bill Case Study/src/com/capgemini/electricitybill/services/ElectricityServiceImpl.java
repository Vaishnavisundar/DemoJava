package com.capgemini.electricitybill.services;

import java.util.List;

import com.capgemini.electricitybill.dao.ElectricityDao;
import com.capgemini.electricitybill.dao.ElectricityDaoImpl;
import com.capgemini.electricitybill.entity.Electricity;
import com.capgemini.electricitybill.exception.ElectricityException;

public class ElectricityServiceImpl implements ElectricityService{

	private ElectricityDao serviceDao=new ElectricityDaoImpl();
	
/*	public void ElectricityServiceImpl() {
		serviceDao=new ElectricityDaoImpl();
	}*/
		
	@Override
	public long addAccount(Electricity e) throws ElectricityException {
		
		long meterNum=serviceDao.addAccount(e);
		return meterNum;
	}

	@Override
	public List<Electricity> displayDetails(Electricity e) {
		
		List mylist=serviceDao.displayDetails(e);
		return mylist;
	}
	
	@Override
	public Electricity createBill(Electricity e) {
		
		Electricity eBill=serviceDao.createBill(e);
		return eBill;

	}
}
