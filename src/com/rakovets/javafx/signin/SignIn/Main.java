package com.rakovets.javafx.signin.SignIn;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("view.fxml"));
        Scene scene = new Scene(root, 300, 250);
        primaryStage.setTitle("Sign In");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) { launch(args); }
}
