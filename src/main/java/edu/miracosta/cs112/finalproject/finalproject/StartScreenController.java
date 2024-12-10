package edu.miracosta.cs112.finalproject.finalproject;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class StartScreenController{

    @FXML
    private Label titleTextField;
    @FXML
    private Label intructiionsTextField;
    @FXML
    private Button droneBeeButton;
    @FXML
    private Button workerBeeButton;
    @FXML
    private Button queenBeeButton;
    @FXML
    private ImageView startScreenImage;


     @FXML
     protected void initialize(){
         titleTextField.setText("Welcome to: \nTo Bee Or Not To Bee!");
         intructiionsTextField.setText("Choose which role of bee you would like to bee beelow!");
         droneBeeButton.setText("Drone Bee");
         workerBeeButton.setText("Worker Bee");
         queenBeeButton.setText("Queen Bee");

         URL imageViewURL = Application.class.getResource("/edu/miracosta/cs112/finalproject/finalproject/startScreen.png");
         System.out.println("Image URL: " + imageViewURL);
         assert imageViewURL != null;
         startScreenImage.setImage(new Image(imageViewURL.toString()));

     }


    @FXML
    protected void droneBeeChoice() throws IOException {
         handleMainScreen(new DroneBee());

    }
    @FXML
    protected void workerBeeChoice() throws IOException {
        handleMainScreen(new WorkerBee());
    }
    @FXML
    protected void queenBeeChoice() throws IOException {
        handleMainScreen(new QueenBee());
    }

    @FXML
    protected void handleMainScreen(Bee newBee) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource("main-view.fxml"));
        Parent root = fxmlLoader.load();

        Stage stage = new Stage();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("To Bee Or Not To Bee");

        MainViewController mainController = fxmlLoader.getController();
        mainController.setBee(newBee);

        stage.show();

        ((Stage) droneBeeButton.getScene().getWindow()).close();
    }
}

