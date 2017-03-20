import kino.dao.MovieDao;
import kino.model.Movie;

/**
 * Created by ronnilenvighansen on 20/03/2017.
 */
public class MovieTest {
    public static void main(String[] args) {
        MovieDao movieDao = new MovieDao();
        Movie movie = new Movie();
        movieDao.createMovie("hal", "hal", 1, 1, 1, 1);
        System.out.println(movieDao.getMovieById(1));
    }
}
