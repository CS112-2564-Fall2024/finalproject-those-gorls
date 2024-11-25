package edu.miracosta.cs112.finalproject.finalproject;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class StartScreenController{

    @FXML
    private TextField titleTextField;
    @FXML
    private TextField intructiionsTextField;
    @FXML
    private Button droneBeeButton;
    @FXML
    private Button workerBeeButton;
    @FXML
    private Button queenBeeButton;

     @FXML
     protected void initialize(){
         titleTextField.setText("Welcome to: To Bee Or Not To Bee!");
         intructiionsTextField.setText("    Choose which role of bee you would like to bee beelow!");
         droneBeeButton.setText("Drone Bee");
         workerBeeButton.setText("Worker Bee");
         queenBeeButton.setText("Queen Bee");

     }

    @FXML
    protected void droneBeeChoice() throws IOException {
         handleMainScreen(new DroneBeeActions());

    }
    @FXML
    protected void workerBeeChoice() throws IOException {
        handleMainScreen(new WorkerBeeActions());
    }
    @FXML
    protected void queenBeeChoice() throws IOException {
        handleMainScreen(new QueenBeeActions());
    }

    @FXML
    protected void handleMainScreen(Bee newBee) throws IOException {
         Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource("main-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setScene(scene);
        stage.setTitle("To Bee Or Not To Bee");
        MainViewController mainController = fxmlLoader.getController();
        mainController.setBee(newBee);
        stage.show();

    }
}
