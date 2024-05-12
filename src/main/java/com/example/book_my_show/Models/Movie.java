package com.example.book_my_show.Models;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Builder
@Setter
public class Movie {
    private int id;
    private String name;
    private Genre genre;
    private int durationInMinutes;
    public Movie to(){
        return Movie.builder()
                .durationInMinutes(this.durationInMinutes)
                .name(this.name)
                .genre(this.genre)
                .build();
    }
}
