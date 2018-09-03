package com.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import com.model.Movie;

public class MainApp {

	public static void main(String[] args) {
		 ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		 Movie movie = (Movie) context.getBean(Movie.class);
		 movie.setMovieId("M001");
		 movie.setMovieName("The Firm");
		 movie.setMovieActor("Tom Cruise");
		 
		 movie.getMovieId();
		 movie.getMovieName();
		 movie.getMovieActor();
		
	}

}
