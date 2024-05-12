package com.example.book_my_show.Models;

import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Builder
@Setter
public class Screen {
    private int id;
    private Theatre theatre;
    private List<Seat>seats;
    private List<Show>shows;
    private List<Movie>movies;

    public void addSeat(Seat seat){
        this.seats.add(seat);
    }
    public void addShow(Show show){
        this.shows.add(show);
    }
    public void addMovie(Movie movie){
        this.movies.add(movie);
    }
}
