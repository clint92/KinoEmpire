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
    @FXML
    private Circle A3;
    @FXML
    private Circle B1;
    @FXML
    private Circle C1;

    public SmallTheaterController() {

    }

    public void onA1Clicked() {
        A1.setFill(Color.GREEN);
        A1.setFill(Color.RED);
        A1.setFill(Color.BLUE);
    }
    public void onB1Clicked() {
        B1.setFill(Color.GREEN);
    }
    public void onC1Clicked() {
        C1.setFill(Color.GREEN);
    }

    public void setMainApp(MainApp mainApp) {
        this.mainApp = mainApp;
    }
}
