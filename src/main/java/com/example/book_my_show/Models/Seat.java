package com.example.book_my_show.Models;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Builder
@Setter
public class Seat {
    private String id;
    private Screen screen;
    private int rowNo;
    private int colNo;
}
