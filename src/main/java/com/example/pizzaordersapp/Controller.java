package com.example.pizzaordersapp;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    ObservableList<PizzaClass> list = FXCollections.observableArrayList(DBSellectValues.Test());
    @FXML
    ListView<String> listView;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        try {
            for (int i = 0; i < list.size(); i++) {
                listView.getItems().add(list.get(i).onlySelectedToString());

            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
