/**
 * Initial Commit: Movie Business Service 
 *
 */

package com.microservice.moviecatalogservice.resources;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author abhishek
 *
 */

@Service
public class MovieBusinessService {

	@Autowired
	private MovieRepository movieRepository;

	
	private ArrayList<Movie> movie = new ArrayList <Movie>(Arrays.asList( new
			Movie(12,"vroom",4), new Movie(13,"Jane tu ya jane na",5), new
			Movie(14,"Fast X",6)));


	public ArrayList<Movie> getMovieList() {
		//return movie;
		ArrayList <Movie> m = new ArrayList<Movie>();
		movieRepository.findAll().forEach(m::add);
		return m;
	}

	public Movie getMovie(Integer id) {
		return movie.stream().filter(m -> m.getMovieId().equals(id)).findAny().get();
		//return movieRepository.findById(id).get();
	}

	public void putMovie(Movie m) {
		//movie.add(m);
		movieRepository.save(m);
	}

	public void updateMovie(Integer id, Movie m) {
		for (int i = 0; i < movie.size(); i++) {
			if (movie.stream().anyMatch(mo -> mo.getMovieId().equals(id)))
				movie.set(i, m);
		}
		movieRepository.save(m);
	}

	public void deleteMovie(Integer id) {
		//movie.stream().filter(m -> m.getMovieId().equals(id)).map(m -> movie.remove(m));
		//movie.removeIf(m->m.getMovieId().equals(id));
		movieRepository.deleteById(id);
	}
}
