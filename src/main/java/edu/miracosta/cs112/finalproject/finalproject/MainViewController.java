package edu.miracosta.cs112.finalproject.finalproject;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import java.net.URL;
import java.net.URL;

public class MainViewController {
    @FXML
    private TextField eventTextField;
    @FXML
    public TextField beeInfoLeft;
    @FXML
    public TextField beeInfoRight;
//      <ImageView fx:id="mainScreenImage" fitHeight="329.0" fitWidth="519.0" layoutX="14.0" layoutY="14.0" pickOnBounds="true" preserveRatio="true" />
    @FXML
    ImageView speakerImageView;
    @FXML
    Button speakerButton;
//      <TextField fx:id="eventTextField" alignment="CENTER" layoutX="14.0" layoutY="352.0" prefHeight="143.0" prefWidth="512.0" text="mainTextField" />


    @FXML
    public void setBee(Bee newBee){
        beeInfoLeft.setText(newBee.toString());
        beeInfoRight.setText(newBee.stats());
    }


    @FXML
    protected void yesButtonAction() {
        eventTextField.setText("Welcome to JavaFX Application!");

    }

    @FXML
    protected void noButtonAction(){}


    @FXML
    protected void speakerButtonAction(){
//        Media sound = new Media("/edu/miracosta/cs112/finalproject/finalproject/beeSound.mp3");
//        MediaPlayer mediaPlayer = new MediaPlayer(sound);
//        mediaPlayer.play();
    }

    @FXML
    protected void initialize(){
        eventTextField.setText("Congratulations on being born!!\n Click yes to start working");
        URL imageViewURL = Application.class.getResource("/edu/miracosta/cs112/finalproject/finalproject/img_1.png");
        System.out.println("Image URL: " + imageViewURL);
        assert imageViewURL != null;
        speakerImageView.setImage(new Image(imageViewURL.toString()));


    }
}