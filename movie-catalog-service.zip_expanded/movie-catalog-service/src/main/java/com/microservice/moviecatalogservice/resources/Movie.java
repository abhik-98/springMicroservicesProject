/**
 * Initial Commit: Movie Entity
 *
 */

package com.microservice.moviecatalogservice.resources;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

/**
 * @author abhishek
 *
 */

@Entity
public class Movie {
	
	@Id
	private Integer movieId;
	private String movieName;
	private Integer rating;
	
	public Movie() {
		super();
	}

	public Movie(Integer movieId, String movieName, Integer rating) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.rating = rating;
	}
	
	public Integer getMovieId() {
		return movieId;
	}
	public void setMovieId(Integer movieId) {
		this.movieId = movieId;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public Integer getRating() {
		return rating;
	}
	public void setRating(Integer rating) {
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "Movie [movieId=" + movieId + ", movieName=" + movieName + ", rating=" + rating + "]";
	}
	
	
	
}
