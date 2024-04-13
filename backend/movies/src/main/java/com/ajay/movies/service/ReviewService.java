package com.ajay.movies.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import com.ajay.movies.dto.MovieDto;
import com.ajay.movies.dto.ReviewDto;
import com.ajay.movies.repo.ReviewRepo;

@Service
public class ReviewService {
	
	@Autowired
	public ReviewRepo reviewRepo;
	
	@Autowired
	public MongoTemplate template;

	public ReviewDto createReview(String reviewBody, String imdbId) {
		ReviewDto dto=reviewRepo.insert(new ReviewDto(reviewBody));
		
		template.update(MovieDto.class)
			.matching(Criteria.where("imdbId").is(imdbId))
			.apply(new Update().push("reviewIds").value(dto.getId()))
			.first();
		
		return dto;
	}
}
