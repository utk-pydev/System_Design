package com.example.book_my_show.Exceptions;

public class SeatPermanentlyUnavailableException extends RuntimeException {
    public SeatPermanentlyUnavailableException(){
        super("Seat is permanently unavailable");
    }
}
