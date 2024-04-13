package com.ajay.movies.repo;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ajay.movies.dto.MovieDto;

@Repository
public interface MovieRepo extends MongoRepository<MovieDto, ObjectId>{

	public MovieDto findMovieByImdbId(String imdbId);
}
