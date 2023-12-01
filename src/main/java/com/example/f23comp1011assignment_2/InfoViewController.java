package com.example.f23comp1011assignment_2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.IOException;

public class InfoViewController {
    @FXML
    private Label makeIdLabel;

    @FXML
    private Label makeNameLabel;

    @FXML
    private Label vehicleTypeIdLabel;

    @FXML
    private Label vehicleTypeNameLabel;

    public void setCarInfo(Car car) {
        makeIdLabel.setText("Make ID: " + car.getMakeId());
        makeNameLabel.setText("Make Name: " + car.getMakeName());
        vehicleTypeIdLabel.setText("Vehicle Type ID: " + car.getVehicleTypeId());
        vehicleTypeNameLabel.setText("Vehicle Type Name: " + car.getVehicleTypeName());

    }

    @FXML
    void backAction(ActionEvent event)throws IOException {
        SceneChanger.changeScenes(event,"search-view.fxml");

    }
}

