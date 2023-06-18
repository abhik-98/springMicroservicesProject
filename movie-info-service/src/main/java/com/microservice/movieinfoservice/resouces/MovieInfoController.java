package com.microservice.movieinfoservice.resouces;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieInfoController {

	@RequestMapping("movies/{movieId}")
	public MovieInfo getmovieInfo(@PathVariable Integer movieId,String name) {
		return new MovieInfo(movieId, "Hulk");
	}
}
