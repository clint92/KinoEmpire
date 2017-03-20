package dao;
import model.Movie;

import java.util.List;

/**
 * Created by ronnilenvighansen on 17/03/2017.
 */
public interface MovieDaoInterface {
    public void createMovie(String movieGenre, String movieName, int movieAge, int movieId, String moviePassword, int movieDate, int movieLength);
    public void deleteMovie(int movieId);
    public void updateMovie(Movie movie);
    public Movie getMovieById(int movieId);
    public List<Movie> getAllMovies();

}
