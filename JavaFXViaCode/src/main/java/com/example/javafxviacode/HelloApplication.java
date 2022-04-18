package com.example.javafxviacode;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {

    Label label;
    int buttonCount = 1;

    @Override
    public void start(Stage stage) throws IOException {
        VBox vbox = new VBox();
        Button button = new Button("Click me!");
        // button.setOnAction( new ButtonHandler());

        // anonymous inner class
//        button.setOnAction(new EventHandler<ActionEvent>() {
//            @Override
//            public void handle(ActionEvent actionEvent) {
//                label.setText("Hello world from anonymous inner class!");
//            }
//        });
//
        // lambda expression - WAT
        button.setOnAction( event -> vbox.getChildren().add( new Button("Button #" + buttonCount++)) );


        label = new Label();
        vbox.getChildren().add(button);
        vbox.getChildren().add(label);
        Scene scene = new Scene(vbox, 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

    // private inner class - can be used by more than 1 button
    class ButtonHandler implements EventHandler<ActionEvent>{

        @Override
        public void handle(ActionEvent event) {
            label.setText("Hello world from private inner class!");
        }
    }
}