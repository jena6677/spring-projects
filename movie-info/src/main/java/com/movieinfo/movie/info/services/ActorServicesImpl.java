package com.movieinfo.movie.info.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.movieinfo.movie.info.dao.ActorDao;
import com.movieinfo.movie.info.entities.Actor;

public class ActorServicesImpl implements ActorServices {

	
	@Autowired
	private ActorDao actorDao;
	
	@Override
	public Actor setActor(Actor actor) {
		actorDao.save(actor);
		return null;
	}

}
