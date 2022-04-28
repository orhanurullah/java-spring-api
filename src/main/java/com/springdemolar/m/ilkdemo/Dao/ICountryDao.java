package com.springdemolar.m.ilkdemo.Dao;

import java.util.List;

import com.springdemolar.m.ilkdemo.entities.Country;

public interface ICountryDao {

	List<Country> getAll();
	void add(Country country);
	void delete(Country country);
	void update(Country country);
	Country getById(int id);
}
