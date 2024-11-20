package edu.miracosta.cs112.finalproject.finalproject;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class StartScreenController{

    @FXML
    private TextField titleTextField;
    @FXML
    protected void droneBeeChoice(){
        titleTextField.setText("Welcome to JavaFX Application!");
        DroneBeeActions drone = new DroneBeeActions();
    }
    @FXML
    protected void workerBeeChoice(){

    }
    @FXML
    protected void queenBeeChoice(){

    }

}
