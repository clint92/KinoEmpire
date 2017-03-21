package kino.controller;

import javafx.beans.property.SimpleStringProperty;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import kino.MainApp;
import kino.model.Movie;

/**
 * @author samm0091
 * @version 21-03-2017.
 */
public class EditMovieMenuController {

    @FXML
    TableView<Movie> movieTable;
    @FXML
    TableColumn<Movie, String> movieColumn;
    @FXML
    TextField movieName;
    @FXML
    TextField movieGenre;

    private MainApp mainApp;

    public EditMovieMenuController() {

    }

    @FXML
    private void initialize() {
        // Initialize the movie table with the movieColumn
        // containing movie name
        movieColumn.setCellValueFactory(cellData ->
                new SimpleStringProperty(cellData.getValue().getMovieName()));
    }

    public void setMainApp(MainApp mainApp) {
        this.mainApp = mainApp;

        movieTable.setItems(this.mainApp.getMovieList());
    }

    public void onAddClicked() {
        Movie movie = new Movie(movieName.getText(), movieGenre.getText());
        this.mainApp.getMovieList().add(movie);

        //call method from main to store movie in DB
        this.mainApp.saveMovieToDB(movie);
    }

    public void onDeleteClicked() {

    }
}
