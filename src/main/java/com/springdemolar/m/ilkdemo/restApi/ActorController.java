package com.springdemolar.m.ilkdemo.restApi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springdemolar.m.ilkdemo.business.IActorService;
import com.springdemolar.m.ilkdemo.entities.Actor;

@RestController
@RequestMapping("/api")
public class ActorController {
	
	private IActorService actorService;

	@Autowired
	public ActorController(IActorService actorService) {
		super();
		this.actorService = actorService;
	}
	
	@GetMapping("/actors")
	public List<Actor> getAll(){
		return this.actorService.getAll();
	}
	@PostMapping("/add")
	public void add(@RequestBody Actor actor){
		 this.actorService.add(actor);
	}
	@PostMapping("/update")
	public void update(@RequestBody Actor actor){
		 this.actorService.update(actor);
	}
	@PostMapping("/delete")
	public void delete(@RequestBody Actor actor){
		 this.actorService.delete(actor);
	}
	@GetMapping("/actors/{id}")
	public Actor getById(@PathVariable int id){
		return this.actorService.getById(id);
	}
	
	
	
	

}
