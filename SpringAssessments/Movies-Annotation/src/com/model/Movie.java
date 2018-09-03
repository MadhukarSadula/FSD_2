package com.model;

import org.springframework.stereotype.Component;

@Component
public class Movie {
	
	private String movieId;
	
	private String movieName;
	
	private String movieActor;
	
	public void getMovieId() {
		System.out.println("Movie Id :"+movieId);
	}

	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}

	public void getMovieName() {
		System.out.println("Movie Name :"+movieName);
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public void getMovieActor() {
		System.out.println("Movie Actor :"+movieActor);
	}

	public void setMovieActor(String movieActor) {
		this.movieActor = movieActor;
	}


	

}
