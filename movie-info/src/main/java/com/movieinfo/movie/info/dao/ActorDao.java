package com.movieinfo.movie.info.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.movieinfo.movie.info.entities.Actor;

public interface ActorDao extends JpaRepository<Actor, Integer>{

}
