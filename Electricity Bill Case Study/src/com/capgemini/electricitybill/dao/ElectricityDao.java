package com.capgemini.electricitybill.dao;

import java.util.List;

import com.capgemini.electricitybill.entity.Electricity;
import com.capgemini.electricitybill.exception.ElectricityException;

public interface ElectricityDao {

	long addAccount(Electricity e) throws ElectricityException;

	List<Electricity> displayDetails(Electricity e);

	Electricity createBill(Electricity e);
}
