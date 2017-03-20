package kino.controller;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


/**
 * Created by clint on 20-03-2017.
 */
public class loginController {

    @FXML
    TextField username;
    @FXML
    TextField password;

    public void loginOK (ActionEvent event)
    {
        System.out.println("welcome");
    }

    public void cancel(ActionEvent event)
    {
        Stage loginstage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        loginstage.close();
    }

}
