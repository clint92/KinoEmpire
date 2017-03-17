package dao;
import model.Movie;
/**
 * Created by ronnilenvighansen on 17/03/2017.
 */
public interface MovieDaoInterface {
    public void createMovie(String genre, String name, int age, int id, String password, int date, int length);
    public void deleteMovie(int ID);
}
