package com.company;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.SQLException;

public class Interfacecontroller {
    @FXML
    private Button ADD;
    @FXML
    private Button DELETE;
    @FXML
    private Button UPDATE;
    @FXML
    private Button Show_Data;
    public void ADDaction(ActionEvent event) throws IOException {
        Parent ADDwindow = FXMLLoader.load(getClass().getResource("Addinterface.fxml"));
        Scene ADDscene = new Scene(ADDwindow);

        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

        window.setScene(ADDscene);
        window.show();

    }
    public void DELETEaction(ActionEvent event) throws IOException {
        Parent DELETEwindow = FXMLLoader.load(getClass().getResource("Deleteinterface.fxml"));
        Scene deletescene = new Scene(DELETEwindow);

        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

        window.setScene(deletescene);
        window.show();

    }
    public void UPDATEaction(ActionEvent event) throws IOException {
        Parent updatewindow = FXMLLoader.load(getClass().getResource("Updateinterface.fxml"));
        Scene updatescene = new Scene(updatewindow);

        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

        window.setScene(updatescene);
        window.show();

    }
    public void SHOWaction(ActionEvent event) throws IOException {
        Parent showwindow = FXMLLoader.load(getClass().getResource("Showinterface.fxml"));
        Scene showscene = new Scene(showwindow);

        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

        window.setScene(showscene);
        window.show();

    }
}

/**
 * reference :https://www.youtube.com/watch?v=XCgcQTQCfJQ
 */