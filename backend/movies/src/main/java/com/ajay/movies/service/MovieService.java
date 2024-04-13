package com.ajay.movies.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ajay.movies.dto.MovieDto;
import com.ajay.movies.repo.MovieRepo;

@Service
public class MovieService {

	@Autowired
	private MovieRepo movieRepo;
	
	public List<MovieDto> getAllMovies(){
		return movieRepo.findAll();
	}
	
	public MovieDto findMovieByImdbID(String imdbId) {
		
		return movieRepo.findMovieByImdbId(imdbId);
	}
	
	
}
