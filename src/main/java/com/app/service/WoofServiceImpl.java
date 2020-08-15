package com.app.service;

import javax.inject.Inject;
import javax.inject.Named;

import com.app.dao.WoofDao;
import com.app.models.WoofCustomer;

@Named("woofService")
public class WoofServiceImpl implements WoofService {

	@Inject()
	WoofDao woofDao;
	
	public void addNewUser(WoofCustomer customer) {
		woofDao.addNewUser(customer);
		
	}

}
