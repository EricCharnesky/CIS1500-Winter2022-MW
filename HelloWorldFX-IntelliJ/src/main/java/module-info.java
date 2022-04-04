module com.example.helloworldfxintellij {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.helloworldfxintellij to javafx.fxml;
    exports com.example.helloworldfxintellij;
}