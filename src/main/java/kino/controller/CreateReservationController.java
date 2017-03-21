package kino.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import kino.MainApp;
import kino.model.Movie;
import kino.model.TicketSale;

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
    @FXML
    Button chooseSeatsButton;
    @FXML
    Button cancelButton;
    @FXML
    Button createTicket;
    private MainApp mainApp;

    public CreateReservationController() {
    }

    public void onCreateTicket() {
        TicketSale ticketSale = new TicketSale();
        ticketSale.setMovie_name(movieList.getSelectionModel().getSelectedItem().getMovieName());
        System.out.println(ticketSale);
    }

    public void onCancelButtonClicked() {
        this.mainApp.showReservationMenu();
    }


    public void onChooseSeatsClicked() {
        this.mainApp.showSeatsSmallTheater();
    }

    public void setMainApp(MainApp mainApp) {
        this.mainApp = mainApp;

        movieList.setItems(mainApp.getMovieList());
    }

    // will be executed when fxml file is loaded
    public void initialize() {
        personSeats.getItems().removeAll(personSeats.getItems());
        personSeats.getItems().addAll("1", "2", "3", "4", "5", "6", "7", "8");
        screeningDate.getItems().addAll("21-03");
    }


}