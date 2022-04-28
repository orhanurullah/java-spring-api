package com.springdemolar.m.ilkdemo.Dao;

import java.util.List;
import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.springdemolar.m.ilkdemo.entities.Actor;
@Repository
public class HibernateActorDao implements IActorDao{

	private EntityManager entityManager;
	
	@Autowired
	public HibernateActorDao(EntityManager entityManager) {
		super();
		this.entityManager = entityManager;
	}

	@Override
	@Transactional
	public List<Actor> getAll() {
		Session session = entityManager.unwrap(Session.class);
		List<Actor> actors = session.createQuery("from Actor", Actor.class).getResultList();
		return actors;
	}

	@Override
	@Transactional
	public void add(Actor actor) {
		Session session = entityManager.unwrap(Session.class);
		session.save(actor);
		
	}

	@Override
	@Transactional
	public void update(Actor actor) {
		Session session = entityManager.unwrap(Session.class);
		session.saveOrUpdate(actor);
	}

	@Override
	@Transactional
	public void delete(Actor actor) {
		Session session = entityManager.unwrap(Session.class);
		Actor act = session.get(Actor.class, actor.getId());
		session.delete(act);
	}

	@Override
	@Transactional
	public Actor getById(int id) {
		Session session = entityManager.unwrap(Session.class);
		Actor actor = session.get(Actor.class, id);
		return actor;
	}

}
