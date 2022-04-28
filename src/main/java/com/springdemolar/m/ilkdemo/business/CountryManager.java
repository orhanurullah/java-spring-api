package com.springdemolar.m.ilkdemo.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springdemolar.m.ilkdemo.Dao.ICountryDao;
import com.springdemolar.m.ilkdemo.entities.Country;

@Service
public class CountryManager implements ICountryService{

	private ICountryDao countryDao;
	
	@Autowired
	public CountryManager(ICountryDao countryDao) {
		super();
		this.countryDao = countryDao;
	}

	@Override
	@Transactional
	public List<Country> getAll() {
		// TODO Auto-generated method stub
		return this.countryDao.getAll();
	}

	@Override
	@Transactional
	public void add(Country country) {
		// TODO Auto-generated method stub
		this.countryDao.add(country);
	}

	@Override
	@Transactional
	public void update(Country country) {
		// TODO Auto-generated method stub
		this.countryDao.update(country);
	}

	@Override
	@Transactional
	public void delete(Country country) {
		// TODO Auto-generated method stub
		this.countryDao.delete(country);
	}

	@Override
	@Transactional
	public Country getById(int id) {
		// TODO Auto-generated method stub
		return this.countryDao.getById(id);
	}

}
