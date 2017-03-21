package kino.controller;

import kino.MainApp;

/**
 * @author samm0091
 * @version 17-03-2017.
 */
public class ReservationMenuController {

    private MainApp mainApp;

    public ReservationMenuController() {

    }


    public void onCreateReservationClicked() {
        mainApp.showCreateReservationMenu();

    }

    public void onEditMovieClicked() {
        mainApp.showEditMovieMenu();
    }

    public void onDeleteReservationClicked() {
    }

    public void onPayReservationClicked() {
    }

    public void onFindReservationClicked() {

    }

    public void setMainApp(MainApp mainApp) {
        this.mainApp = mainApp;
    }
}
