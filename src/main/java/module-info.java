module com.example.f23comp1011assignment_2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.f23comp1011assignment_2 to javafx.fxml;
    exports com.example.f23comp1011assignment_2;
}