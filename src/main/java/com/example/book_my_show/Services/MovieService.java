package com.example.book_my_show.Services;
import java.util.HashMap;
import java.util.Map;

import com.example.book_my_show.Models.Genre;
import com.example.book_my_show.Models.Movie;
import lombok.NonNull;

public class MovieService {
    private final Map<String, Movie>movies;
    public MovieService(){
        this.movies = new HashMap<>();
    }

    public Movie getMovie(@NonNull final String movieName){
        if(!movies.containsKey(movieName)){
            return movies.get(movieName);
        }
        return null;
    }
    public Movie createMovie(@NonNull final String movieName, @NonNull final Genre genre, @NonNull final int duration){
        Movie movie = new Movie();
        movie.setName(movieName);
        movie.setGenre(genre);
        movie.setDurationInMinutes(duration);
        movies.put(movieName, movie);
        return movie;
    }
}
