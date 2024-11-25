package edu.miracosta.cs112.finalproject.finalproject;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MainViewController {
    @FXML
    private TextField eventTextField;
    public TextField beeInfoleft;
    Bee newBee;


    @FXML
    public void setBee(Bee newBee){
        this.newBee = newBee;
        beeInfoleft.setText(newBee.toString());

    }


    @FXML
    protected void yesButtonAction() {
        eventTextField.setText("Welcome to JavaFX Application!");

    }

    @FXML
    protected void noButtonAction(){}


    @FXML
    protected void speakerButtonAction(){ }

    @FXML
    protected void initialize(){
        eventTextField.setText("Congratulations on being born!!\n Click yes to start working");


    }
}