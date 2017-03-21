package kino.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import kino.MainApp;
import kino.model.Movie;
import kino.model.TicketSale;

public class CreateReservationController {

    @FXML
    ComboBox<Movie> movieList;
    @FXML
    ComboBox<String> screeningDate;
    @FXML
    TextField price;
    @FXML
    TextField phoneNumber;
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
        ticketSale.setSale_date(screeningDate.getSelectionModel().getSelectedItem());
        ticketSale.setPrice(Double.parseDouble(price.getText()));
        ticketSale.setPhone_number(Integer.parseInt(phoneNumber.getText()));
        System.out.println(ticketSale);
        this.mainApp.saveToDB(ticketSale);
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
        screeningDate.getItems().addAll("21-03");
        price.setText("420.0");
    }


}