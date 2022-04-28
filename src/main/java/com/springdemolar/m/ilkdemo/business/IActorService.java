package com.springdemolar.m.ilkdemo.business;

import java.util.List;

import com.springdemolar.m.ilkdemo.entities.Actor;

public interface IActorService {

	List<Actor> getAll();
	void add(Actor actor);
	void update(Actor actor);
	void delete(Actor actor);
	Actor getById(int id);
}
