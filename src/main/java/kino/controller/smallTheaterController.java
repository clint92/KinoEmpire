package kino.controller;

import javafx.fxml.FXML;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import kino.MainApp;

public class SmallTheaterController {

    private MainApp mainApp;

    @FXML
    private Circle A1;
    @FXML
    private Circle A2;

    public SmallTheaterController() {

    }
    public void onA1Clicked() {
        A1.setFill(Color.GREEN);
    }

    public void setMainApp(MainApp mainApp) {
        this.mainApp = mainApp;
    }
}
