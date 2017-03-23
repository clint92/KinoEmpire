package kino.controller;

import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.layout.GridPane;
import kino.MainApp;
import kino.model.TicketSale;

import java.util.ArrayList;
import java.util.List;

public class SmallTheaterController {

    private MainApp mainApp;

    @FXML
    private GridPane seatOverview;

    public SmallTheaterController() {

    }

    public void drawTheater(List<TicketSale> ticketSaleList) {

        List<TicketSale> list = new ArrayList(ticketSaleList);
        int seatCount = 1;
        System.out.println(list);
        int columns = 20, rows = 12;
        for (int i = 0; i < columns; ++i) {
            for (int j = 0; j < rows; ++j) {

                myButton rb = new myButton(seatCount);
                seatCount++;

                for (int k = 0; k < list.size(); k++) {
                    if (list.get(k).getSold() == 420) {
                        System.out.println("hej");
                        //rb.setDisable(true);
                    }
                }
                seatOverview.add(rb, i, j);

            }
        }
    }

    public class myButton extends RadioButton {

        int seatID;

        public myButton(int id) {
            this.seatID = id;
        }

        public void setSeatID(int id) {
            this.seatID = id;
        }
    }

    public void setMainApp(MainApp mainApp) {
        this.mainApp = mainApp;
    }
}
