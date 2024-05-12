package com.example.book_my_show.Services;

import com.example.book_my_show.Exceptions.NotFoundException;
import com.example.book_my_show.Models.Screen;
import com.example.book_my_show.Models.Seat;
import com.example.book_my_show.Models.Theatre;
import lombok.NonNull;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class TheatreService {
    private final Map<String, Theatre>theatres;
    private final Map<String, Screen>screens;
    private final Map<String, Seat>seats;

    public TheatreService(){
        this.theatres = new HashMap<>() ;
        this.screens = new HashMap<>();
        this.seats = new HashMap<>() ;
    }
    public Seat getSeat(@NonNull final String seatId){
        if(!seats.containsKey(seatId)){
            throw new NotFoundException();
        }
        return seats.get(seatId);
    }
    public Theatre getTheatre(@NonNull final String theatreId){
        if(!theatres.containsKey(theatreId)){
            throw new NotFoundException();
        }
        return theatres.get(theatreId);
    }
    public Screen getScreen(@NonNull final String screenId){
        if(!screens.containsKey(screenId)){
            throw new NotFoundException();
        }
        return  screens.get(screenId);
    }
    public Theatre createTheatre(@NonNull final String theatreName){
        String theatreId = UUID.randomUUID().toString();
        Theatre theatre = new Theatre();
        theatre.setName(theatreName);
        theatres.put(theatreId, theatre);
        return  theatre;
    }
    public Seat createSeatInScreen(@NonNull final Integer rowNo, @NonNull final Integer colNo, @NonNull final Integer seatNo, @NonNull final Screen screen){
        String seatId = UUID.randomUUID().toString();
        Seat seat = new Seat();
        seat.setId(seatId);
        seat.setRowNo(rowNo.intValue());
        seat.setColNo(colNo.intValue());
        screen.addSeat(seat);
        return  seat;
    }
}
