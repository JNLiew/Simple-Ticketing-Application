package com.example.ticketing;

import com.example.ticketing.enums.counter_enum;
import com.example.ticketing.enums.status_enum;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    @Override
    public void start(Stage stage_customer) throws IOException {
        FXMLLoader fxmlLoader_customer = new FXMLLoader(Main.class.getResource("customerview.fxml"));
        Parent root_customer = fxmlLoader_customer.load();

        FXMLLoader fxmlLoader_counter = new FXMLLoader(Main.class.getResource("countermanagement.fxml"));
        Parent root_counter = fxmlLoader_counter.load();

        // Creating customer window
        Stage customer_window = new Stage();
        customer_window.setTitle("Customer View");
        customer_window.setScene(new Scene(root_customer, 600, 400));
        customer_window.show();

        // Creating counter window
        Stage counter_window = new Stage();
        counter_window.setTitle("Counter Management");
        counter_window.setScene(new Scene(root_counter, 600, 400));
        counter_window.show();
    }

    public static void main(String[] args) {
        launch();
    }
}