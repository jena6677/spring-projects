package com.movieinfo.movie.info.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name="MovieInfo")
public class Movie {

	@Id
	private int movieId;
	private String movieName;
	private String genre;
	private int yearOfRelease;
	private String primaryLanguage;
	private String actorList;
	private int rating;
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
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
	public String getActorList() {
		return actorList;
	}
	public void setActorList(String actorList) {
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
	public Movie(int movieId, String movieName, String genre, int yearOfRelease, String primaryLanguage,
			String actorList, int rating) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.genre = genre;
		this.yearOfRelease = yearOfRelease;
		this.primaryLanguage = primaryLanguage;
		this.actorList = actorList;
		this.rating = rating;
	}
}
