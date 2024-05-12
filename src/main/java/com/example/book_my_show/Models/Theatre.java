package com.example.book_my_show.Models;

import lombok.*;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Theatre {
    private int id;
    private String name;
    private List<Screen>screens;
}
