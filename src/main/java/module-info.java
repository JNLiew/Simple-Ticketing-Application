module com.example.ticketing {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.example.ticketing to javafx.fxml;
    exports com.example.ticketing;
    exports com.example.ticketing.customer;
    opens com.example.ticketing.customer to javafx.fxml;

    exports com.example.ticketing.counter;
    opens com.example.ticketing.counter to javafx.fxml;

}