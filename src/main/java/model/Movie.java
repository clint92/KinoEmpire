package model;

/**
 * Created by Ali on 14-03-2017.
 */
public class Movie {
    String movieGenre = "";
    String movieName = "";
    int movieAge;
    int movieId;
    int movieDate;
    int movieLength;

    public Movie(){

    }

    public Movie(String movieGenre, String movieName, int movieAge, int movieId, int movieDate, int movieLength) {
        this.movieGenre = movieGenre;
        this.movieName = movieName;
        this.movieAge = movieAge;
        this.movieId = movieId;
        this.movieDate = movieDate;
        this.movieLength = movieLength;
    }


    public String getMovieGenre() {
        return movieGenre;
    }

    public void setMovieGenre(String movieGenre) {
        this.movieGenre = movieGenre;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public int getMovieAge() {
        return movieAge;
    }

    public void setMovieAge(int movieAge) {
        this.movieAge = movieAge;
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public int getMovieDate() {
        return movieDate;
    }

    public void setMovieDate(int movieDate) {
        this.movieDate = movieDate;
    }

    public int getMovieLength() {
        return movieLength;
    }

    public void setMovieLength(int movieLength) {
        this.movieLength = movieLength;
    }

    @Override
    public String toString() {
        return "movieClass{" +
                "genre='" + movieGenre + '\'' + ", name='" + movieName + '\'' + ", age=" + movieAge +
                ", id=" + movieId + ", date=" + movieDate + ", length=" + movieLength + '}';
    }
}
