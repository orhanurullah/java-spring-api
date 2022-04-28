package com.springdemolar.m.ilkdemo.business;

import java.util.List;

import com.springdemolar.m.ilkdemo.entities.Country;

public interface ICountryService {

	List<Country> getAll();
	void add(Country country);
	void update(Country country);
	void delete(Country country);
	Country getById(int id);
}
