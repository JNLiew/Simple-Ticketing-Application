package com.example.ticketing.counter;

import com.example.ticketing.backend.backend;
import com.example.ticketing.enums.counter_enum;
import com.example.ticketing.enums.status_enum;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;

import static com.example.ticketing.backend.backend.queue;

public class counter_controller {
    Alert a = new Alert(Alert.AlertType.NONE);
    @FXML
    private Button counter1_offline;
    @FXML
    private Button counter1_compcurr;
    @FXML
    private Button counter1_callnext;
    @FXML
    private Button counter2_offline;
    @FXML
    private Button counter2_compcurr;
    @FXML
    private Button counter2_callnext;
    @FXML
    private Button counter3_offline;
    @FXML
    private Button counter3_compcurr;
    @FXML
    private Button counter3_callnext;
    @FXML
    private Button counter4_offline;
    @FXML
    private Button counter4_compcurr;
    @FXML
    private Button counter4_callnext;

    @FXML
    private Pane counter1_pane;

    // Counter 1
    @FXML
    protected void counter1_offline_btn() {
        if (backend.counter1_status == status_enum.offline){
            backend.counter1_status = status_enum.free;
            counter1_offline.setText("Go Offline");
            counter1_callnext.setVisible(true);
            counter1_compcurr.setVisible(true);
        } else {
            backend.counter1_status = status_enum.offline;
            counter1_offline.setText("Go Online");
            counter1_callnext.setVisible(false);
            counter1_compcurr.setVisible(false);
        }
    }

    @FXML
    protected void counter1_compcurr_btn() {
        backend.counter1_status = status_enum.free;
    }
    @FXML
    protected void counter1_callnext_btn() {
        backend.current_counter = counter_enum.c1;

        int temp = queue.dequeue();
        if (temp == -1){
            backend.counter1_status = status_enum.free;

            // set alert type
            a.setAlertType(Alert.AlertType.INFORMATION);
            a.setTitle("No tickets.");
            a.setHeaderText("Queue is Empty.");
            a.setContentText("No tickets waiting in the Queue.");

            // show the dialog
            a.show();
        } else {
            backend.serving_no = temp;
            backend.counter1_status = status_enum.engaged;
        }
    }


    // Counter 2
    @FXML
    protected void counter2_offline_btn() {
        if (backend.counter2_status == status_enum.offline){
            backend.counter2_status = status_enum.free;
            counter2_offline.setText("Go Offline");
            counter2_callnext.setVisible(true);
            counter2_compcurr.setVisible(true);
        } else {
            backend.counter2_status = status_enum.offline;
            counter2_offline.setText("Go Online");
            counter2_callnext.setVisible(false);
            counter2_compcurr.setVisible(false);
        }
    }

    @FXML
    protected void counter2_compcurr_btn() {
        backend.counter2_status = status_enum.free;
    }
    @FXML
    protected void counter2_callnext_btn() {
        backend.current_counter = counter_enum.c2;
        int temp = queue.dequeue();
        if (temp == -1){
            backend.counter2_status = status_enum.free;

            // set alert type
            a.setAlertType(Alert.AlertType.INFORMATION);
            a.setTitle("No tickets.");
            a.setHeaderText("Queue is Empty.");
            a.setContentText("No tickets waiting in the Queue.");

            // show the dialog
            a.show();
        } else {
            backend.serving_no = temp;
            backend.counter2_status = status_enum.engaged;
        }
    }

    // Counter 3
    @FXML
    protected void counter3_offline_btn() {
        if (backend.counter3_status == status_enum.offline){
            backend.counter3_status = status_enum.free;
            counter3_offline.setText("Go Offline");
            counter3_callnext.setVisible(true);
            counter3_compcurr.setVisible(true);
        } else {
            backend.counter3_status = status_enum.offline;
            counter3_offline.setText("Go Online");
            counter3_callnext.setVisible(false);
            counter3_compcurr.setVisible(false);
        }
    }

    @FXML
    protected void counter3_compcurr_btn() {
        backend.counter3_status = status_enum.free;
    }
    @FXML
    protected void counter3_callnext_btn() {
        backend.current_counter = counter_enum.c3;

        int temp = queue.dequeue();
        if (temp == -1){
            backend.counter3_status = status_enum.free;

            // set alert type
            a.setAlertType(Alert.AlertType.INFORMATION);
            a.setTitle("No tickets.");
            a.setHeaderText("Queue is Empty.");
            a.setContentText("No tickets waiting in the Queue.");

            // show the dialog
            a.show();
        } else {
            backend.serving_no = temp;
            backend.counter3_status = status_enum.engaged;
        }
    }

    // Counter 4
    @FXML
    protected void counter4_offline_btn() {
        if (backend.counter4_status == status_enum.offline){
            backend.counter4_status = status_enum.free;
            counter4_offline.setText("Go Offline");
            counter4_callnext.setVisible(true);
            counter4_compcurr.setVisible(true);
        } else {
            backend.counter4_status = status_enum.offline;
            counter4_offline.setText("Go Online");
            counter4_callnext.setVisible(false);
            counter4_compcurr.setVisible(false);
        }
    }

    @FXML
    protected void counter4_compcurr_btn() {
        backend.counter4_status = status_enum.free;
    }
    @FXML
    protected void counter4_callnext_btn() {
        backend.current_counter = counter_enum.c4;

        int temp = queue.dequeue();
        if (temp == -1){
            backend.counter4_status = status_enum.free;

            // set alert type
            a.setAlertType(Alert.AlertType.INFORMATION);
            a.setTitle("No tickets.");
            a.setHeaderText("Queue is Empty.");
            a.setContentText("No tickets waiting in the Queue.");

            // show the dialog
            a.show();
        } else {
            backend.serving_no = temp;
            backend.counter4_status = status_enum.engaged;
        }
    }
}
