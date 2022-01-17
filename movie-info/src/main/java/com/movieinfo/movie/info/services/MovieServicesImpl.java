package com.movieinfo.movie.info.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movieinfo.movie.info.dao.MovieDao;
import com.movieinfo.movie.info.entities.Movie;

@Service
public class MovieServicesImpl implements MovieServices {

	@Autowired
	private MovieDao movieDao;
	
	@Override
	public Movie addMovie(Movie m) {
		
		movieDao.save(m);
		return m;
	}

	@Override
	public Movie updateMovie(Movie m) {
		
		movieDao.save(m);
		return m;
	}

	@Override
	public String deleteMovie(int movieId) {
		
		movieDao.deleteById(movieId);
		return "Movie deleted succesfully";
	}

	@Override
	public List<Movie> getMovieByGenre(String genre) {
		
		List<Movie> l1 = movieDao.findAll();
		List<Movie> l2 = new ArrayList<>();
		for(Movie m : l1)
		{
			if(m.getGenre().equals(genre))
			{
				l2.add(m);
			}
		}
		return l2;
	}

	@Override
	public List<Movie> getAllMovies() {
		
		return movieDao.findAll();
	}

	@Override
	public List<String> getAllActorsIdOfAMovie(int movieId) {
		String arr[] = movieDao.getById(movieId).getActorList().split(",");
		List l1 = new ArrayList<>();
		
		for(String s : arr)
		{
			l1.add(s);
		}
		return l1;
		
	}

	
	
	
	

}
