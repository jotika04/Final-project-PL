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

public class Updatecontroller {
    Database db = new Database();
    @FXML
    private TextField inputid;
    @FXML
    private TextField inputname;
    @FXML
    private TextField inputqty;
    @FXML
    private Button nameupdater;
    @FXML
    private Button qtyupdater;
    @FXML
    private Label announcement;
    @FXML
    private void updatename(ActionEvent event){
        db.updatestockname(inputname.getText(),
                Integer.parseInt(inputid.getText()));
        announcement.setText("Name Update Successfull");
    }
    @FXML
    private void  updateqty(ActionEvent event){
        db.updatestockQTY(Integer.parseInt(inputid.getText()),
                Integer.parseInt(inputqty.getText()));
        announcement.setText("Quantity Update Successfull");
    }
    public void Goback(ActionEvent event) throws IOException {
        Parent showwindow = FXMLLoader.load(getClass().getResource("Interface.fxml"));
        Scene showscene = new Scene(showwindow);

        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

        window.setScene(showscene);
        window.show();

    }
}
