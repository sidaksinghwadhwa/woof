package com.app.dao;

import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.transaction.annotation.Transactional;

import com.app.models.WoofCustomer;

@Named("woofDao")
public class WoofDaoImpl implements WoofDao  {
	
	@PersistenceContext
	EntityManager entityManager;
	
	@Transactional
	public void addNewUser(WoofCustomer customer)
	{
		entityManager.persist(customer);
		
	}

}
