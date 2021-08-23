package com.example.pizzaordersapp;


import java.util.ArrayList;

public class PizzaClass {
    private boolean redSauce, cheeseSauce, cheese, ham, mushroom;
    private int price,id;

    public PizzaClass(int id ,boolean redSauce, boolean cheeseSauce, boolean cheese, boolean ham, boolean mushroom, int price) {
        this.id = id;
        this.redSauce = redSauce;
        this.cheeseSauce = cheeseSauce;
        this.cheese = cheese;
        this.ham = ham;
        this.mushroom = mushroom;
        this.price = price;
    }

    public String onlySelectedToString() {
        return "id: " + id + ": " + (redSauce ? "Rajcinova omacka, ": "")+
                                    (cheeseSauce ? "Smotanova omacka, ": "")+
                                    (cheese ? "Syr, ": "")+
                                    (ham ? "Sunka, ": "")+
                                    (mushroom ? "Sampiony , ": "")+
                                    "Cena: "+price+ " €";

    }

    @Override
    public String toString() {
        return "PizzaClass{" +
                "id= " + id +
                "  redSauce=" + redSauce +
                ", cheeseSauce=" + cheeseSauce +
                ", cheese=" + cheese +
                ", ham=" + ham +
                ", mushroom=" + mushroom +
                ", price=" + price +
                '}';
    }


}
