package com.ajay.movies.repo;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ajay.movies.dto.ReviewDto;

@Repository
public interface ReviewRepo extends MongoRepository<ReviewDto, ObjectId>{

}
