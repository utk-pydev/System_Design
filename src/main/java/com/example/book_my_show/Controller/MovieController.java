package com.example.book_my_show.Controller;

import com.example.book_my_show.Services.MovieService;

public class MovieController {
    final private MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }
    public String createMovie(){
        return "";
    }
}
