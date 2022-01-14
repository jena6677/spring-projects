package com.movieinfo.movie.info.services;

import java.util.List;

import com.movieinfo.movie.info.entities.Movie;

public interface MovieServices {

	public Movie addMovie(Movie m);
	public Movie updateMovie(Movie m);
	public String deleteMovie(int movieId);
	public List<Movie> getMovieByGenre(String genre);
	public List<Movie> getAllMovies();
}
