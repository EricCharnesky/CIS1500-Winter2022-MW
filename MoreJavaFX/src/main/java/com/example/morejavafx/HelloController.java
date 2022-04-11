package com.example.morejavafx;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.util.ArrayList;

public class HelloController {

    @FXML
    private RadioButton smallCoffeeButton;
    @FXML
    private RadioButton mediumCoffeeButton;
    @FXML
    private RadioButton largeCoffeeButton;
    @FXML
    private ToggleGroup coffeeSize;
    @FXML
    private Label coffeeLabel;
    @FXML
    private ToggleGroup milk;
    @FXML
    private RadioButton noMilkButton;
    @FXML
    private RadioButton wholeMilkButton;
    @FXML
    private RadioButton soyMilkButton;
    @FXML
    private RadioButton noSugarButton;
    @FXML
    private RadioButton noSugarSugarButton;
    @FXML
    private ToggleGroup sugar;
    @FXML
    private RadioButton sugarButton;
    @FXML
    private Slider milkSlider;

    private ArrayList<Coffee> order;

    private Coffee coffee;
    @FXML
    private Button addToOrderButton;
    @FXML
    private Label orderLabel;

    // will fail!
    //public HelloController(){
    //    coffeeLabel.setText("Constructor");
    //}

    // essentially the constructor, but runs AFTER fxml stuff is setup
    public void initialize() {
        updateCoffeeLabel();
        order = new ArrayList<>();
    }

    @FXML
    public void coffeeSizeButtonClicked(ActionEvent actionEvent) {
        updateCoffeeLabel();
    }

    public void updateCoffeeLabel() {

        String size = "";
        if (smallCoffeeButton.isSelected()) {
            size = "small";
        } else if (mediumCoffeeButton.isSelected()) {
            size = "medium";
        } else if (largeCoffeeButton.isSelected()) {
            size = "large";
        }

        coffee = new Coffee(size, "");

        if (noMilkButton.isSelected()) {
            coffee.setNoMilk();
        } else if (wholeMilkButton.isSelected()) {
            coffee.setWholeMilk();
        } else if (soyMilkButton.isSelected()) {
            coffee.setSoyMilk();
        }

        coffee.setMilkQuantity((int) milkSlider.getValue());

        if (noSugarButton.isSelected()) {
            coffee.setNoSugar();
        } else if (sugarButton.isSelected()) {
            coffee.setSugar();
        } else if (noSugarSugarButton.isSelected()) {
            coffee.setNoSugarSugar();
        }

        coffeeLabel.setText(coffee.toString());
    }

    @FXML
    public void milkButtonClicked(ActionEvent actionEvent) {

        if ( noMilkButton.isSelected()){
            milkSlider.setValue(0);
            milkSlider.setDisable(true);
        } else{
            milkSlider.setDisable(false);
            if ( milkSlider.getValue() == 0 ){
                milkSlider.setValue(1);
            }
        }
        updateCoffeeLabel();
    }

    @FXML
    public void sugarButtonClicked(ActionEvent actionEvent) {
        updateCoffeeLabel();
    }

    @FXML
    public void milkSliderSlid(Event event) {
        if ( milkSlider.getValue() == 0 ){
            noMilkButton.setSelected(true);
        }
        updateCoffeeLabel();
    }

    @FXML
    public void addToOrderButtonClicked(ActionEvent actionEvent) {
        order.add(coffee);
        orderLabel.setText("Order:");
        for ( Coffee currentCoffee : order){
            orderLabel.setText(orderLabel.getText() + "\n" + currentCoffee.toString());
        }
    }
}