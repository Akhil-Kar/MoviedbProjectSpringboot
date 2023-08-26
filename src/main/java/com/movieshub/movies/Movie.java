package com.movieshub.movies;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;


import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Document(collection = "movies")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Movie {

    @Id
    private ObjectId id;
    private String imdbId;
    private String title;
    private String releaseData;
    private String trailerLink;
    private String poster;
    private List<String> genres; 
    private List<String> backdrops;

    @DocumentReference
    private List<Review> reviewIds;
}
