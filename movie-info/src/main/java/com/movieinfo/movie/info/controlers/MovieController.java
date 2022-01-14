package com.movieinfo.movie.info.controlers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.movieinfo.movie.info.entities.Movie;
import com.movieinfo.movie.info.services.MovieServices;

@RestController
public class MovieController {

	@Autowired
	private MovieServices movieServices;
	
	//adding a movie
	@PostMapping("/movie")
	public Movie addMovie(@RequestBody Movie m)
	{
		return this.movieServices.addMovie(m);
	}
	
	//update a movie details
	@PutMapping("/movie")
	public Movie updateMovie(@RequestBody Movie m)
	{
		return this.movieServices.updateMovie(m);
	}
	
	//delete a movie
	@DeleteMapping("/movies/{movieId}")
	public String deleteMovie(@PathVariable("movieId") int movieId)
	{
		return this.movieServices.deleteMovie(movieId);
	}
	
	//get movies by genre
	@GetMapping("/movies/{genre}")
	public List<Movie> getMovieByGenre(@PathVariable("genre") String genre)
	{
		return this.movieServices.getMovieByGenre(genre);
	}
	
	//get all movies
	@GetMapping("/movies")
	public List<Movie> getMovies()
	{
		return this.movieServices.getAllMovies();
	}
}
