package kino.controller;

import kino.MainApp;

public class smallTheaterController {

    private MainApp mainApp;

    public void setMainApp(MainApp mainApp) {
        this.mainApp = mainApp;
    }

    public void onCancelClicked() {
        this.mainApp.showCreateReservationMenu();
    }
}
