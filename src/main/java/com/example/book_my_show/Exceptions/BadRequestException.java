package com.example.book_my_show.Exceptions;

public class BadRequestException extends RuntimeException {
    public BadRequestException(){
        super("Bad Request Exception");
    }
}
