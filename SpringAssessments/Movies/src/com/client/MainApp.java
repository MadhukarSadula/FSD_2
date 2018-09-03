package com.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.Movie;

public class MainApp {

	public static void main(String[] args) {
		 ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
		 Movie movie = (Movie) context.getBean("movie");
		 movie.getMovieId();
		 movie.getMovieName();
		 movie.getMovieActor();
		
	}

}
