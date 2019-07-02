package com.company;


import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        try{

            Parent mainapp = FXMLLoader.load(getClass().getResource("Interface.fxml"));

            Scene scene = new Scene(mainapp);

            primaryStage.setScene(scene);

            primaryStage.setTitle("Store Stock Data");

            primaryStage.show();
        }catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
    public static void main(String[] args) {
        launch(args);
    }
}