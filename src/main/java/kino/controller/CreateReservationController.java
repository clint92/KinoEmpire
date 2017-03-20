package kino.controller;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import kino.MainApp;
import kino.model.Movie;

/**
 * @author samm0091
 * @version 17-03-2017.
 */
public class CreateReservationController {

    @FXML
    ComboBox<Movie> movieList;

    public MainApp mainApp;

    public CreateReservationController() {

    }

    public void showMovieList(Movie movie) {

    }
    public void setMainApp(MainApp mainApp) {
        this.mainApp = mainApp;

        movieList.setItems(mainApp.getMovieList());
    }

}