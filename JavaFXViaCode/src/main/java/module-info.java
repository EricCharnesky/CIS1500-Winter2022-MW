module com.example.javafxviacode {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javafxviacode to javafx.fxml;
    exports com.example.javafxviacode;
}