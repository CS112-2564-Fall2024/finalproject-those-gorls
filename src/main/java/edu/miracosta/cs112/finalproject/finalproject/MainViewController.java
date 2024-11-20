package edu.miracosta.cs112.finalproject.finalproject;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class MainViewController {
    @FXML
    private Label welcomeText;
    private

    @FXML
    protected void onYesButtonAction() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    protected void speakerButtonAction(){ }

}