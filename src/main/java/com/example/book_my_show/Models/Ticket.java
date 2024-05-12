package com.example.book_my_show.Models;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class Ticket {
    private int id;
    private Show show;
    private PaymentMethod paymentMethod;
    private Seat seat;
    private Screen screen;
}
