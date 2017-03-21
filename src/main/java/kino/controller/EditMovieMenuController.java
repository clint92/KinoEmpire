package kino.controller;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
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
    TableColumn movieColumn;

    private MainApp mainApp;

    public void setMainApp(MainApp mainApp) {
        this.mainApp = mainApp;

        movieTable.setItems(this.mainApp.getMovieList());
    }

    public void onAddClicked() {

    }

    public void onDeleteClicked() {

    }
}
