package com.ajay.movies.dto;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Document(collection = "reviews")
@AllArgsConstructor
@NoArgsConstructor
public class ReviewDto {

	@Id
	private ObjectId id;
	
	private String body;
	
	public ReviewDto(String body) {
		this.body=body;
	}
}
