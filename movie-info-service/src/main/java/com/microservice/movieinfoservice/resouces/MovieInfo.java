package com.microservice.movieinfoservice.resouces;

public class MovieInfo {
	private Integer movieId;
	private String name;
		
	public MovieInfo() {
		super();
	}
	public MovieInfo(Integer movieId, String name) {
		super();
		this.movieId = movieId;
		this.name = name;
	}
	public Integer getMovieId() {
		return movieId;
	}
	public void setMovieId(Integer movieId) {
		this.movieId = movieId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "MovieInfo [movieId=" + movieId + ", name=" + name + "]";
	}
	
	
}
