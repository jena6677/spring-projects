package com.movieinfo.movie.info.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name="MovieInfo")
public class Movie {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int movieId;
	private String movieName;
	private String genre;
	private int yearOfRelease;
	private String primaryLanguage;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "movie_Fkey", referencedColumnName = "movieId")
	private List<Actor> actorList;
	private int rating;
	
	public int getMovieId()
	{
		return this.movieId;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public int getYearOfRelease() {
		return yearOfRelease;
	}
	public void setYearOfRelease(int yearOfRelease) {
		this.yearOfRelease = yearOfRelease;
	}
	public String getPrimaryLanguage() {
		return primaryLanguage;
	}
	public void setPrimaryLanguage(String primaryLanguage) {
		this.primaryLanguage = primaryLanguage;
	}
	public List<Actor> getActorList() {
		return actorList;
	}
	public void setActorList(List<Actor> actorList) {
		this.actorList = actorList;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Movie [movieId=" + movieId + ", movieName=" + movieName + ", genre=" + genre + ", yearOfRelease="
				+ yearOfRelease + ", primaryLanguage=" + primaryLanguage + ", actorList=" + actorList + ", rating="
				+ rating + "]";
	}
	public Movie(String movieName, String genre, int yearOfRelease, String primaryLanguage,
			List<Actor> actorList, int rating) {
		super();
		this.movieName = movieName;
		this.genre = genre;
		this.yearOfRelease = yearOfRelease;
		this.primaryLanguage = primaryLanguage;
		this.actorList = actorList;
		this.rating = rating;
	}
}
