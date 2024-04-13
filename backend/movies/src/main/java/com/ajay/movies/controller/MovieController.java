package com.ajay.movies.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ajay.movies.dto.MovieDto;
import com.ajay.movies.service.MovieService;

@RestController
@RequestMapping("/api/movies")
public class MovieController {

	@Autowired
	private MovieService movieService;
	
//	@GetMapping("/getAllMovies")
//	public String getAllMovies() {
//		return "All movies";
//	}
	
	@GetMapping("/getAllMovies")
	public ResponseEntity<List<MovieDto>> getAllMovies(){
		return new ResponseEntity<List<MovieDto>>(movieService.getAllMovies(), HttpStatus.OK);
	}
	
	@GetMapping("/{imdbId}")
	public ResponseEntity<MovieDto> findMovieByImdbId(@PathVariable String imdbId){
		return new ResponseEntity<MovieDto>(movieService.findMovieByImdbID(imdbId), HttpStatus.OK);
	}
}
