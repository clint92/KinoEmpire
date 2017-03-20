package kino.model;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;

import static java.util.concurrent.TimeUnit.*;

/**
 * Created by Martin H on 16-03-2017.
 */


public class Schedule {
    private String formatDateTime = dateTime();
    Theater theater;
    Movie movie;
    private final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(movie.getMovieLength()); // needs a int inside the parameter



    public Schedule() {
    }


    // if move is due at current time  -> playMovie();
    // method to compare currentTime and setTime on move schedule?
    public void checker() {
        //if movieDate is current date {playMovie}

    }

    public void playMovie() {

        final Runnable playMovie = new Runnable() {
            @Override
            public void run() {
                System.out.println(movie.getMovieName() + " is playing for, "+movie.getMovieLength()+ " minutes, in theater "+theater.getTheaterNumber());
            }
        };
        final ScheduledFuture<?> playMovieHandler =
                scheduler.scheduleAtFixedRate(playMovie,10,10, SECONDS);
        scheduler.schedule(new Runnable() {
            @Override
            public void run() {
                playMovieHandler.cancel(true); }
        }, movie.getMovieLength(),SECONDS); // needs to calculate the right format of movie.getLength min or sec.
    }

    // the current date,time
    private String dateTime() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-HH:mm:ss"); //yyyy
        return now.format(formatter);
    }
    // get current date,time
    public String getFormatDateTime() {
        return formatDateTime;
    }
    // get current date,time
    public void setFormatDateTime(String formatDateTime) {
        this.formatDateTime = formatDateTime;
    }
}
