package com.company;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class Deletecontroller {
    Database db = new Database();
    @FXML
    private TextField inputid;
    @FXML
    private Button deletor;
    @FXML
    private Label announcement;
    @FXML
    private void deleteid(ActionEvent event){
        db.deletestock(Integer.parseInt(inputid.getText()));
        announcement.setText("Delete Successful");
    }
    @FXML
    public void Goback(ActionEvent event) throws IOException {
        Parent showwindow = FXMLLoader.load(getClass().getResource("Interface.fxml"));
        Scene showscene = new Scene(showwindow);

        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

        window.setScene(showscene);
        window.show();

    }

}
