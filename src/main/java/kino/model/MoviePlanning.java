package kino.model;

import kino.dao.MovieDao;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dave on 21/03/2017.
 */
public class MoviePlanning {



    public void setMovieAsActive() {


    }

    public void setMovieAsInactive() {


    }

    public ArrayList<Movie> getMoviesByActive(String req) {

        MovieDao movieDao = new MovieDao();

        List<Movie> listget = new ArrayList<>(movieDao.getAllMovies());

        ArrayList<Movie> listret = new ArrayList<>();

        if (req.equalsIgnoreCase("active")) {

            for (Movie movie : listget) {
                if (movie.getActive() == 1) {
                    listret.add(movie);
                }
            }
        }
        else if (req.equalsIgnoreCase("inactive")) {

            for (Movie movie : listget) {
                if (movie.getActive() == 0) {
                    listret.add(movie);
                }
            }
        }


        return listret;
    }


}


