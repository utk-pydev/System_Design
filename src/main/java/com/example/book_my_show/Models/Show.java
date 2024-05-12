package com.example.book_my_show.Models;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Builder
@Setter
public class Show {
    private int id;
    private Movie movie;
    private Screen screen;
    private int startTime;
    private int endTime;
}
