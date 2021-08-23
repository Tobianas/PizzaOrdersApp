package com.example.pizzaordersapp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class DBSellectValues {


    public static ArrayList<PizzaClass> Test() {
        {
            ArrayList<PizzaClass> array = new ArrayList<>();
            Connection con;
            try {
                con = DBConnection.getConnection();
                PreparedStatement statement = con.prepareStatement("SELECT * from pizzas");
                ResultSet result = statement.executeQuery();

                while (result.next()) {
                   PizzaClass pizza =  new PizzaClass(result.getInt("id"),
                            result.getBoolean("redSauce"),
                            result.getBoolean("cheeseSauce"),
                            result.getBoolean("cheese"),
                            result.getBoolean("ham"),
                            result.getBoolean("mushroom"),
                            result.getInt("price"));
                   array.add(pizza);
                }

            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
            return array;
        }

    }


}
