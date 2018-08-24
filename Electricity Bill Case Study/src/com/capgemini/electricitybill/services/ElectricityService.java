package com.capgemini.electricitybill.services;

import java.util.List;

import com.capgemini.electricitybill.entity.Electricity;
import com.capgemini.electricitybill.exception.ElectricityException;

public interface ElectricityService {

 long addAccount(Electricity e) throws ElectricityException;
 
 public List<Electricity> displayDetails(Electricity e);

 Electricity createBill(Electricity e);

}
