package com.example.book_my_show.Models;

import lombok.*;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Builder
@Setter
public class Show {
    private String id;
    private Movie movie;
    private Screen screen;
    private Date startTime;
    private Date endTime;
}
