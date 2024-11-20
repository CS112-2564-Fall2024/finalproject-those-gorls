package edu.miracosta.cs112.finalproject.finalproject;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MainViewController {
    @FXML
    private TextField eventTextField;


    @FXML
    protected void yesButtonAction() {
        eventTextField.setText("Welcome to JavaFX Application!");
    }

    @FXML
    protected void noButtonAction(){}


    @FXML
    protected void speakerButtonAction(){ }


}