package com.example.pizzaordersapp;

import javafx.scene.control.Alert;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    public static Connection getConnection() {
        try {
            final String url = "jdbc:mysql://localhost:3306/jdbc_pizza";
            final String username = "root";
            final String password = "";
            Class.forName("com.mysql.jdbc.Driver");

            Connection conn = DriverManager.getConnection(url, username, password);
            System.out.println("CONNECTED");
            return conn;

        } catch (Exception e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error connecting to database");
            alert.setContentText(e.toString());
            System.out.println(e);
        }
        return null;
    }

}