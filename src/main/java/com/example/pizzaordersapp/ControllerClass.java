package com.example.pizzaordersapp;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.Timer;
import java.util.TimerTask;

public class ControllerClass implements Initializable {

    @FXML
    ListView<String> listView = new ListView<>();
    ObservableList<PizzaClass> list = FXCollections.observableArrayList(DBSellectValues.getValues());

    public void update()
    {
        listView.getItems().clear();
        list.clear();
        list = FXCollections.observableArrayList(DBSellectValues.getValues());

            for (int i = 0; i < list.size(); i++) {
                listView.getItems().add(list.get(i).onlySelectedToString());
            }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Timer t = new Timer();
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                update();
                System.out.println("update");
            }
        };
        t.scheduleAtFixedRate(task,0,1000);
    }


}


