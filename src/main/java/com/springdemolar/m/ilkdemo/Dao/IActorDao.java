package com.springdemolar.m.ilkdemo.Dao;

import java.util.List;

import com.springdemolar.m.ilkdemo.entities.Actor;

public interface IActorDao {
	
	List<Actor> getAll();
	void add(Actor actor);
	void update(Actor actor);
	void delete(Actor actor);
	Actor getById(int id);

}
