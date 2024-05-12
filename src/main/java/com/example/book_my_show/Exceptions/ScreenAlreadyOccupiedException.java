package com.example.book_my_show.Exceptions;

public class ScreenAlreadyOccupiedException extends RuntimeException {
    public ScreenAlreadyOccupiedException(){
        super("Screen is already occupied");
    }
}
