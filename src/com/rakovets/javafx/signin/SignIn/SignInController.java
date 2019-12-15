package com.rakovets.javafx.signin.SignIn;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class SignInController {

    String adminID = "admin";
    String adminPassword = "5678";

    @FXML
    public TextField status;

    @FXML
    public TextField login;

    @FXML
    public TextField password;

    public void onMouseClicked(Event event) {
        System.out.println("userId: " + login.textProperty().getValue() + " password: " + password.textProperty().getValue());
        if (login.textProperty().getValue().equals(adminID) && password.textProperty().getValue().equals(adminPassword)) {
            status.textProperty().setValue("Access successful");
        } else {
            status.textProperty().setValue("Permission denied");
        }
    }
}
