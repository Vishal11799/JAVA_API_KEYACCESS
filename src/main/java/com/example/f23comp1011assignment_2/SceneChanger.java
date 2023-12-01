package com.example.f23comp1011assignment_2;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class SceneChanger {

    public static void changeScenes(ActionEvent event, String fxmlFileName) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource(fxmlFileName));
        Scene scene = new Scene(fxmlLoader.load());

        //get the Stage from the ActionEvent
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();

        stage.setScene(scene);
        stage.show();
    }

    public static void changeScene(String fxmlFileName, String title, Stage currentStage, Car selectedCar) {
        try {
            FXMLLoader loader = new FXMLLoader(SceneChanger.class.getResource(fxmlFileName));
            Parent root = loader.load();

            if (selectedCar != null) {
                // If the controller needs access to the selected car, pass it here
                InfoViewController infoController = loader.getController();
                infoController.setCarInfo(selectedCar);
            }

            Scene scene = new Scene(root);
            currentStage.setScene(scene);
            currentStage.setTitle(title);
            currentStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
