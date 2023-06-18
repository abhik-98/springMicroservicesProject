/**
 * Initial Commit: Movie Repository 
 *
 */

package com.microservice.moviecatalogservice.resources;

import org.springframework.data.repository.CrudRepository;

/**
 * @author abhishek
 *
 */
public interface MovieRepository extends CrudRepository<Movie, Integer> {

}
