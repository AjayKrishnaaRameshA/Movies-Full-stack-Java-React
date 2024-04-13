package com.ajay.movies.dto;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.annotation.Collation;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "MoviesAPI")
public class MovieDto {

	@Id
	private ObjectId id;
	
	private String imdbId;
	
	private String title;
	
	private String releaseDate;
	
	private String trailerLink;
	
	private String poster;
	
	private List<String> genres;
	
	private List<String> backdrops;
	
	@DocumentReference
	private List<ReviewDto> reviewIds; 
	
	
	
	
}
