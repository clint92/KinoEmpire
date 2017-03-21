package kino.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import kino.MainApp;

/**
 * @author samm0091
 * @version 21-03-2017.
 */
public class smallTheaterController {

    @FXML
    Button cancel;

    private MainApp mainApp;

    public void setMainApp(MainApp mainApp) {
        this.mainApp = mainApp;
    }

    public void onCancelClicked() {
        this.mainApp.showCreateReservationMenu();
    }
}
