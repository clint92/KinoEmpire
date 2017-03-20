package kino.controller;

import kino.MainApp;

/**
 * @author samm0091
 * @version 17-03-2017.
 */
public class ReservationMenuController {

    public MainApp mainApp;

    public ReservationMenuController() {

    }


    public void onCreateReservationClicked() {
        System.out.println("hej");
        mainApp.showCreateReservationMenu();

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
