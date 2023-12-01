package com.example.f23comp1011assignment_2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;

public class InfoViewController {
    @FXML
    private Label makeIdLabel;

    @FXML
    private Label makeNameLabel;

    @FXML
    private Label vehicleTypeIdLabel;

    @FXML
    private Label vehicleTypeNameLabel;
    @FXML
    private ImageView imgView1;
    @FXML
    private ImageView imgView;


    public void setCarInfo(Car car) {
        makeIdLabel.setText("Make ID: " + car.getMakeId());
        makeNameLabel.setText("Make Name: " + car.getMakeName());
        vehicleTypeIdLabel.setText("Vehicle Type ID: " + car.getVehicleTypeId());
        vehicleTypeNameLabel.setText("Vehicle Type Name: " + car.getVehicleTypeName());
        String imagePath = "Images/defult_img.jpeg";
        Image image = new Image(getClass().getResource(imagePath).toExternalForm());
        imgView.setImage(image);


    }



    @FXML
    void backAction(ActionEvent event)throws IOException {
        SceneChanger.changeScenes(event,"search-view.fxml");

    }
}

