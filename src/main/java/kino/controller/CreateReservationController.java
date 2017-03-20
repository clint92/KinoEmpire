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
    @FXML
    ComboBox<String> personSeats;
    @FXML
    ComboBox<String> screeningDate;
    public MainApp mainApp;

    public CreateReservationController() {

    }

    public void showMovieList(Movie movie) {

    }
    public void setMainApp(MainApp mainApp) {
        this.mainApp = mainApp;

        movieList.setItems(mainApp.getMovieList());
    }
    public void initialize() {
        personSeats.getItems().removeAll(personSeats.getItems());
        personSeats.getItems().addAll("1", "2", "3", "4", "5", "6", "7", "8");
        screeningDate.getItems().addAll("21-03");
    }


}