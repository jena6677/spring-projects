package com.movieinfo.movie.info.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.movieinfo.movie.info.entities.Movie;

public interface MovieDao extends JpaRepository<Movie, Integer> {

}
