package com.example.book_my_show.Providers;

import com.google.common.collect.ImmutableList;
import com.example.book_my_show.Exceptions.SeatTemporaryUnavailableException;
import com.example.book_my_show.Models.Seat;
import com.example.book_my_show.Models.SeatLock;
import com.example.book_my_show.Models.Show;
import lombok.NonNull;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InMemorySeatLockProvider implements SeatLockProvider {

    private final Integer lockTimeout;
    private  final Map<Show, Map<Seat, SeatLock>>locks;

    public InMemorySeatLockProvider(@NonNull final Integer lockTimeout) {
        this.lockTimeout = lockTimeout;
        this.locks = new HashMap<>();
    }

    @Override
    synchronized public void lockSeats(@NonNull final Show show, @NonNull final List<Seat> seats, @NonNull final String user) {
        for(Seat seat : seats){
            if(isSeatLocked(show, seat)){
                throw new SeatTemporaryUnavailableException();
            }
        }
        for(Seat seat : seats){
            lockSeat(show, seat, user, lockTimeout);
        }
    }
    private void lockSeat(final Show show, final Seat seat, final String user, final Integer timeOutInSeconds){
        if(!locks.containsKey(show)){
            locks.put(show, new HashMap<>());
        }
        final SeatLock lock = new SeatLock(seat, show, timeOutInSeconds, new Date(), user);
        locks.get(show).put(seat, lock);
    }
    @Override
    public void unlockSeats(@NonNull final Show show,@NonNull final List<Seat> seats,@NonNull final  String user) {
        for(Seat seat : seats){
            if(validateLock(show, seat, user)){
                unlockSeat(show, seat);
            }
        }
    }
    private void unlockSeat(final Show show, final Seat seat){
        if(!locks.containsKey(show)){
            return;
        }
        locks.get(show).remove(seat);
    }

    @Override
    public boolean validateLock(@NonNull final Show show,@NonNull final Seat seat,@NonNull final String user) {
        return isSeatLocked(show, seat) && locks.get(show).get(seat).getLockedBy().equals(user) ;
    }

    @Override
    public List<Seat> getLockedSeats(@NonNull final Show show) {
        if(!locks.containsKey(show)) return ImmutableList.of();

        return null;
    }
    private boolean isSeatLocked(final Show show, final Seat seat){
        return locks.containsKey(show) && locks.get(show).containsKey(seat) && !locks.get(show).get(seat).isLockExpired();
    }
}
