package kino.dao;
import kino.model.Movie;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import kino.utility.SQLConnection;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ronnilenvighansen on 17/03/2017.
 */
public class MovieDao implements MovieDaoInterface {
    private Connection connection;
    public MovieDao(){
        connection = SQLConnection.getConnection();
    }
    public void createMovie(String movieGenre, String movieName, int movieAge, String movieStartDate,
                            String movieEndDate, int movieLength, int active){
        try{
            PreparedStatement prepstat = connection.prepareStatement(
                    "INSERT INTO movie(movieGenre, movieName, movieAge, movieStartDate, movieEndDate, movieLength, active) VALUES (?,?,?,?,?,?,?)");
            prepstat.setString(1, movieGenre);
            prepstat.setString(2, movieName);
            prepstat.setInt(3, movieAge);
            prepstat.setString(4, movieStartDate);
            prepstat.setString(5, movieEndDate);
            prepstat.setInt(6, movieLength);
            prepstat.setInt(7, active);
            prepstat.executeUpdate();
        }
        catch(SQLException ex){
            ex.printStackTrace();
        }
    }
    public void deleteMovie(int movieId){
        try {
            PreparedStatement prepstat = connection.prepareStatement("DELETE FROM movie WHERE movieId = ?");
            prepstat.setInt(1, movieId);
            prepstat.executeUpdate();
        }
        catch(SQLException ex){
            ex.printStackTrace();
        }
    }

    public void updateMovie(Movie movie){
        try {
            PreparedStatement prepstat = connection.prepareStatement(("UPDATE movie SET movieGenre = ?, movieName = ?, movieAge" +
                    " = ?, movieStartDate = ?, movieEndDate = ?, movieLength = ?, active = ?"));
            prepstat.setString(1, movie.getMovieGenre());
            prepstat.setString(2, movie.getMovieName());
            prepstat.setInt(3, movie.getMovieAge());
            prepstat.setString(4, movie.getMovieStartDate());
            prepstat.setString(5, movie.getMovieEndDate());
            prepstat.setInt(6, movie.getMovieLength());
            prepstat.setInt(7, movie.getActive());
            prepstat.executeUpdate();
        }
        catch(SQLException ex){
            ex.printStackTrace();
        }
    }

    public Movie getMovieById(int movieId) {
        Movie movie = new Movie();
        try {
            PreparedStatement prepstat = connection.prepareStatement("SELECT * FROM movie WHERE movieId = ?");
            prepstat.executeUpdate();
            //prepStat.setInt(1, movieId);
            //ResultSet resultset = prepStat.executeQuery();

            // Uses a resultset of data retrieved from database and puts it into an Product object
            /*if (resultset.next()) {
                movie.setMovieGenre(resultset.getString("movieGenre"));
                movie.setMovieName(resultset.getString("movieName"));
                movie.setMovieAge(resultset.getInt("movieAge"));
                movie.setMovieDate(resultset.getInt("movieDate"));
                movie.setMovieLength(resultset.getInt("movieLength"));
            }*/
        }
        catch (SQLException e){
            e.printStackTrace();
        }
        catch (NullPointerException e){
            e.printStackTrace();
        }
        return movie;
    }

    public List<Movie> getAllMovies() {
        List<Movie> movieList = new ArrayList<Movie>();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultset = statement.executeQuery("SELECT * FROM movie");
            int count = 0;
            // Loops through all entries in the database table and uses resultsets of data retrieved from database and puts it into an Product object
            while (resultset.next()) {
                Movie movie = new Movie();
                if (resultset.next()) {
                    movie.setMovieGenre(resultset.getString("movieGenre"));
                    movie.setMovieName(resultset.getString("movieName"));
                    movie.setMovieAge(resultset.getInt("movieAge"));
                    movie.setMovieStartDate(resultset.getString("movieStartDate"));
                    movie.setMovieEndDate(resultset.getString("movieEndDate"));
                    movie.setMovieLength(resultset.getInt("movieLength"));
                    movie.setActive(resultset.getInt("active"));
                }
            }
        }
        catch (SQLException e){
            e.printStackTrace();
        }
        catch (NullPointerException e){
            e.printStackTrace();
        }
        return movieList;
    }
}
