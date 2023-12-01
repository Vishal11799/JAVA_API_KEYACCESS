package com.example.f23comp1011assignment_2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.List;

public class SearchViewController {

    @FXML
    private TextField searchTextField;

    @FXML
    private ListView<Car> carListView;

    @FXML
    private void initialize(){
        carListView.setVisible(false);

    }

    @FXML
    void searchButtonClicked(ActionEvent event) {
        String carName = searchTextField.getText();
        try {
            List<Car> carList = APIUtility.callAPI(carName);
            carListView.getItems().setAll(carList);
            carListView.setVisible(true);
        } catch (IOException | InterruptedException e) {
            showAlert("Error", "An error occurred during the API call.");
        }
    }

    @FXML
    void displayInfoButtonClicked(ActionEvent event) {
        Car selectedCar = carListView.getSelectionModel().getSelectedItem();
        if (selectedCar != null) {
            SceneChanger.changeScene("info-view.fxml", "Car Information", getStage(event), selectedCar);
        } else {
            showAlert("Error", "Please select a car from the list.");
        }
    }

    private Stage getStage(ActionEvent event) {
        return (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
    }

    private void showAlert(String title, String content) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(content);
        alert.showAndWait();
    }
}
