module com.example.pizzaordersapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.pizzaordersapp to javafx.fxml;
    exports com.example.pizzaordersapp;
}