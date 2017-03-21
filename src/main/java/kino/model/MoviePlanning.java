package kino.model;

import kino.dao.MovieDao;

import java.util.ArrayList;

/**
 * Created by Dave on 21/03/2017.
 */
public class MoviePlanning {

    private MovieDao movieDao;

    public void setMovieAsActive() {


    }

    public void setMovieAsInactive() {


    }

    public void getActiveMovies() {


    }

    public void getInactiveMovies() {

        ArrayList<Movie> listget = new ArrayList<>(movieDao.getAllMovies());

        ArrayList<Movie> listret = new ArrayList<>();

        while (!listget.isEmpty()) {


        }
    }


}


