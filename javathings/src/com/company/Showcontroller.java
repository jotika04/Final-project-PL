package com.company;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class Showcontroller implements Initializable {
    Database db = new Database();
    @FXML
    private TableView<Stocks> tableView;
    @FXML
    private TableColumn<Stocks,Integer> stockidcol;
    @FXML
    private TableColumn<Stocks,String> stocknamecol;
    @FXML
    private TableColumn<Stocks,Integer> stockqtycol;
    private ObservableList<Stocks> oblist = FXCollections.observableArrayList();

    @FXML
    public void Goback(ActionEvent event) throws IOException {
        Parent showwindow = FXMLLoader.load(getClass().getResource("Interface.fxml"));
        Scene showscene = new Scene(showwindow);

        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

        window.setScene(showscene);
        window.show();

    }


    @FXML
    public void Show(ActionEvent event) {
        oblist.clear();
        ArrayList<Stocks> result = db.getstock();
        for (int i = 0; i < result.size(); i++){
            oblist.add(result.get(i));
        }
        tableView.setItems(oblist);

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        //set column upp in the table
        stockidcol.setCellValueFactory(new PropertyValueFactory<Stocks,Integer>("id"));
        stocknamecol.setCellValueFactory(new PropertyValueFactory<Stocks,String>("name"));
        stockqtycol.setCellValueFactory(new PropertyValueFactory<Stocks,Integer>("qty"));

    }
}
