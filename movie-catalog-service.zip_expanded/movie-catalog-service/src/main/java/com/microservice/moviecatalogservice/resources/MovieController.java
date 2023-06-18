package com.microservice.moviecatalogservice.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/catalog")
public class MovieController {
	
	@Autowired
	MovieBusinessService movieBusinessService;
	
	@Autowired
	RestTemplate req;
	
	//RestTemplate req = new RestTemplate();
		
	@RequestMapping("/{id}")
	@ResponseBody
	public List<Movie> getMovie(@PathVariable Integer id) {
		
		
		List <Rating> rating = new ArrayList<Rating>(Arrays.asList(
				new Rating("14",4),
				new Rating("13",5)));
		
	return	rating.stream().map(rate->{
			MovieInfo movieInfo = req.getForObject("http://localhost:8083/movies/"+id, MovieInfo.class);
			return new Movie(movieInfo.getMovieId(), movieInfo.getName(), rate.getRating());
		}).toList();
		
	//	return movieBusinessService.getMovie(id);
	}
}
