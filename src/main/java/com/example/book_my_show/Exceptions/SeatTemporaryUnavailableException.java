package com.example.book_my_show.Exceptions;

public class SeatTemporaryUnavailableException extends RuntimeException {
    public SeatTemporaryUnavailableException(){
        super("Seat Temporary Unavailable Exception");
    }
}
