module com.example.f23comp1011assignment_2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.net.http;
    requires com.google.gson;


    opens com.example.f23comp1011assignment_2 to javafx.fxml, com.google.gson;
    exports com.example.f23comp1011assignment_2;
}