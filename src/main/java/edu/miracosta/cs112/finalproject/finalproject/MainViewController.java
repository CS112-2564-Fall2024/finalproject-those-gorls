package edu.miracosta.cs112.finalproject.finalproject;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import java.net.URL;
import javafx.stage.Stage;

import java.io.IOException;

public class MainViewController {
    @FXML
    private ImageView speakerImageView;
    @FXML
    private TextField resultTextField;
    @FXML
    private Button yesButton;
    @FXML
    private Button noButton;
    @FXML
    private TextField beeInfoRight;
    @FXML
    private TextField eventTextField;
    @FXML
    private TextField beeInfoLeft;

    private Bee currentBee;
    private final ActionsAndEvents actionsAndEvents = new ActionsAndEvents();
    private String currentEvent;
    private boolean eventHandled = false;

    @FXML
    public void setBee(Bee newBee){
        this.currentBee = newBee;
        beeInfoLeft.setText(newBee.toString());
        beeInfoRight.setText(newBee.stats());
    }

    private void displayInitialEvent() {
        if (currentBee != null) {
            eventTextField.setText("Welcome to the hive! \nClick Yes to start working!");
        } else {
            eventTextField.setText("No bee selected.");
        }
    }



    @FXML
    protected void yesButtonAction() {
        if (currentBee != null) {
            if (eventHandled) {
                noButton.setDisable(true);
                eventHandled = false;
                currentEvent = actionsAndEvents.generateEvent(currentBee.getType());
                if (currentEvent != null && !currentEvent.isEmpty()) {
                    eventTextField.setText(currentEvent);
                    resultTextField.setText("");
                } else {
                    eventTextField.setText("No event generated.");
                }
            } else {
                eventTextField.setText("Please handle the current event first.");
            }
        } else {
            eventTextField.setText("No bee selected!");
        }
    }

    @FXML
    protected void noButtonAction() {
        if (currentBee != null && currentEvent != null) {
            String result = actionsAndEvents.handleEvent(currentBee.getType(), false);
            resultTextField.setText(result);

            if (result.contains("Game over")) {
                navigateToEndView();
            } else {
                eventHandled = true;
                noButton.setDisable(true);
                resultTextField.setText("Press Yes to continue.");
            }
        } else {
            eventTextField.setText("No active event to handle!");
        }
    }

    @FXML
    protected void speakerButtonAction(){
//        Media sound = new Media("/edu/miracosta/cs112/finalproject/finalproject/beeSound.mp3");
//        MediaPlayer mediaPlayer = new MediaPlayer(sound);
//        mediaPlayer.play();
    }

    @FXML
    protected void initialize() {
        yesButton.setText("YES");
        noButton.setText("NO");
        eventTextField.setText("Congratulations on being born!!\n Click yes to start working");
        URL speakerURL = Application.class.getResource("/edu/miracosta/cs112/finalproject/finalproject/img_1.png");
        System.out.println("Image URL: " + speakerURL);
        assert speakerURL != null;
        speakerImageView.setImage(new Image(speakerURL.toString()));
    }

    private void navigateToEndView() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("end-view.fxml"));
            Parent root = loader.load();

            Stage stage = (Stage) yesButton.getScene().getWindow();
            Scene endScene = new Scene(root);
            stage.setScene(endScene);
            stage.show();

            EndViewController endController = loader.getController();
            endController.displayBeeStats(currentBee);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}