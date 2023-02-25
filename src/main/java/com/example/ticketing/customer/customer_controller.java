package com.example.ticketing.customer;

import com.example.ticketing.backend.backend;
import com.example.ticketing.enums.counter_enum;
import com.example.ticketing.enums.status_enum;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.Sphere;
import javafx.util.Duration;

import java.time.LocalTime;

import static com.example.ticketing.backend.backend.*;

public class customer_controller {
    public int new_no = 1000;

    @FXML
    private Label lastnumber_no;
    @FXML
    private Label nowserving_no;

    @FXML
    private Label counter1_servingno;
    @FXML
    private Label counter2_servingno;
    @FXML
    private Label counter3_servingno;
    @FXML
    private Label counter4_servingno;

    @FXML
    private Sphere counter1_indicator;
    @FXML
    private Sphere counter2_indicator;
    @FXML
    private Sphere counter3_indicator;
    @FXML
    private Sphere counter4_indicator;

    @FXML
    protected void takeanumber_click() {
        new_no++;
        lastnumber_no.setText(Integer.toString(new_no));
        queue.enqueue(new_no);
    }

    public void initialize() {
        Timeline timeline = new Timeline(
                new KeyFrame(Duration.seconds(0.1), event -> {
                    nowserving_no.setText(String.valueOf(backend.serving_no));
                    if (current_counter == counter_enum.c1){
                        counter1_servingno.setText(String.valueOf(backend.serving_no));
                    }
                    if (current_counter == counter_enum.c2){
                        counter2_servingno.setText(String.valueOf(backend.serving_no));
                    }
                    if (current_counter == counter_enum.c3){
                        counter3_servingno.setText(String.valueOf(backend.serving_no));
                    }
                    if (current_counter == counter_enum.c4){
                        counter4_servingno.setText(String.valueOf(backend.serving_no));
                    }

                    PhongMaterial material_green = new PhongMaterial();
                    material_green.setDiffuseColor(Color.GREEN);
                    PhongMaterial material_gray = new PhongMaterial();
                    material_gray.setDiffuseColor(Color.GRAY);
                    PhongMaterial material_red = new PhongMaterial();
                    material_red.setDiffuseColor(Color.RED);

                    if (counter1_status == status_enum.free){
                        counter1_indicator.setMaterial(material_green);
                    } else if (counter1_status == status_enum.offline){
                        counter1_indicator.setMaterial(material_gray);
                    } else if (counter1_status == status_enum.engaged){
                        counter1_indicator.setMaterial(material_red);
                    }

                    if (counter2_status == status_enum.free){
                        counter2_indicator.setMaterial(material_green);
                    } else if (counter2_status == status_enum.offline){
                        counter2_indicator.setMaterial(material_gray);
                    } else if (counter2_status == status_enum.engaged){
                        counter2_indicator.setMaterial(material_red);
                    }

                    if (counter3_status == status_enum.free){
                        counter3_indicator.setMaterial(material_green);
                    } else if (counter3_status == status_enum.offline){
                        counter3_indicator.setMaterial(material_gray);
                    } else if (counter3_status == status_enum.engaged){
                        counter3_indicator.setMaterial(material_red);
                    }

                    if (counter4_status == status_enum.free){
                        counter4_indicator.setMaterial(material_green);
                    } else if (counter4_status == status_enum.offline){
                        counter4_indicator.setMaterial(material_gray);
                    } else if (counter4_status == status_enum.engaged){
                        counter4_indicator.setMaterial(material_red);
                    }
                })
        );
        timeline.setCycleCount(Animation.INDEFINITE);
        timeline.play();

    }

}