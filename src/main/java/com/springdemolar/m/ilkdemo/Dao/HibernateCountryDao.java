package com.springdemolar.m.ilkdemo.Dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.springdemolar.m.ilkdemo.entities.Country;

@Repository
public class HibernateCountryDao implements ICountryDao{

	private EntityManager entityManager;
	
	@Autowired
	public HibernateCountryDao(EntityManager entityManager) {
		super();
		this.entityManager = entityManager;
	}

	@Override
	@Transactional
	public List<Country> getAll() {
		Session session = entityManager.unwrap(Session.class);
		List<Country> countries = session.createQuery("from Country", Country.class).getResultList();
		return countries;
	}

	@Override
	@Transactional
	public void add(Country country) {
		// TODO Auto-generated method stub
		Session session = entityManager.unwrap(Session.class);
		session.save(country);
	}

	@Override
	@Transactional
	public void delete(Country country) {
		// TODO Auto-generated method stub
		Session session = entityManager.unwrap(Session.class);
		Country countr = session.get(Country.class, country.getId());
		session.delete(countr);
	}

	@Override
	@Transactional
	public void update(Country country) {
		// TODO Auto-generated method stub
		Session session = entityManager.unwrap(Session.class);
		session.saveOrUpdate(country);
	}

	@Override
	public Country getById(int id) {
		Session session = entityManager.unwrap(Session.class);
		Country country = session.get(Country.class, id);
		return country;
	}

}
