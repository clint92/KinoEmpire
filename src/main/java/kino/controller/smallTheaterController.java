package kino.controller;

import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.layout.GridPane;
import kino.MainApp;

public class SmallTheaterController {

    private MainApp mainApp;

    @FXML
    private GridPane seatOverview;

    public SmallTheaterController() {

    }

    public void draw() {

        int columns = 20, rows = 12, horizontal = 20, vertical = 20;
        RadioButton rb = null;
        for (int i = 0; i < columns; ++i) {//Iterate through columns
            for (int j = 0; j < rows; ++j) {//Iterate through rows

                rb = new RadioButton();

                seatOverview.add(rb, i, j);
                //Add Rectangle to board

            }
        }
    }

    public void setMainApp(MainApp mainApp) {
        this.mainApp = mainApp;
    }
}
