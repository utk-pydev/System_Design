package com.example.book_my_show.Services;

import com.example.book_my_show.Exceptions.NotFoundException;
import com.example.book_my_show.Exceptions.ScreenAlreadyOccupiedException;
import com.example.book_my_show.Models.Movie;
import com.example.book_my_show.Models.Screen;
import com.example.book_my_show.Models.Show;
import lombok.NonNull;

import java.util.*;

public class ShowService {

    private final Map<String, Show> shows;
    public ShowService() {
        this.shows = new HashMap<>();
    }

    public Show getShow(@NonNull final String showId){
        if(!shows.containsKey(showId)){
            throw new NotFoundException();
        }
        return shows.get(showId);
    }
    public Show createShow(@NonNull final Movie movie, @NonNull final Screen screen, @NonNull final Date startTime, @NonNull final Date endTime){
        if(!checkIfShowCreationAllowed(screen, startTime, endTime)){
            throw new ScreenAlreadyOccupiedException();
        }
        String showId = UUID.randomUUID().toString();
        final Show show = new Show(showId, movie, screen, startTime, endTime);
        this.shows.put(showId, show);
        return  show;
    }

    private List<Show>getShowsForScreen(final Screen screen){
        final List<Show>response = new ArrayList<>();
        for(Show show : shows.values()){
            if(show.getScreen().equals(screen)){
                response.add(show);
            }
        }
        return  response;
    }

    private boolean checkIfShowCreationAllowed(final Screen screen, final Date startTime, final Date durationInSeconds){
        return true;
    }
}
