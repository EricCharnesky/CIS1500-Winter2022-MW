package com.example.helloworldfxintellij;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class HelloController {

    @FXML
    private Button button;
    @FXML
    private Label label;

    @FXML
    public void buttonClicked(ActionEvent actionEvent) {
        label.setText("Hello world!");
    }
}