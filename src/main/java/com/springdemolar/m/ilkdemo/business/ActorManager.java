package com.springdemolar.m.ilkdemo.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springdemolar.m.ilkdemo.Dao.IActorDao;
import com.springdemolar.m.ilkdemo.entities.Actor;

@Service
public class ActorManager implements IActorService{

	private IActorDao actorDao;
	
	@Autowired
	public ActorManager(IActorDao actorDao) {
		super();
		this.actorDao = actorDao;
	}

	@Override
	@Transactional
	public List<Actor> getAll() {
		// TODO Auto-generated method stub
		return this.actorDao.getAll();
	}

	@Override
	@Transactional
	public void add(Actor actor) {
		// TODO Auto-generated method stub
		this.actorDao.add(actor);
	}

	@Override
	@Transactional
	public void update(Actor actor) {
		// TODO Auto-generated method stub
		this.actorDao.update(actor);
	}

	@Override
	@Transactional
	public void delete(Actor actor) {
		// TODO Auto-generated method stub
		this.actorDao.delete(actor);
	}

	@Override
	public Actor getById(int id) {
		// TODO Auto-generated method stub
		return this.actorDao.getById(id);
	}
	

}
