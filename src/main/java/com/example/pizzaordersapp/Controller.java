package com.example.pizzaordersapp;


import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;


import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.Timer;
import java.util.TimerTask;

public class Controller implements Initializable {

    ArrayList<PizzaClass> list = DBSellectValues.Test();
    @FXML
    ListView<String> listView;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
            for (int i = 0; i < list.size(); i++) {
                listView.getItems().add(list.get(i).onlySelectedToString());
                System.out.println(list);
            }
    }
}
