package edu.miracosta.cs112.finalproject.finalproject;

import javafx.application.Platform;
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
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

import java.io.IOException;
import java.util.Objects;

public class MainViewController {
    @FXML
    public ImageView mainScreenImage;
    @FXML
    public Button speakerButton;
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
    private boolean eventHandled = true;

    @FXML
    public void setBee(Bee newBee){
        this.currentBee = newBee;
        beeInfoLeft.setText(newBee.toString());
        beeInfoRight.setText(newBee.stats());
        displayInitialEvent();
    }

    private void displayInitialEvent() {
        if (currentBee != null) {
            eventTextField.setText("Welcome to the hive! \nClick Yes to start working!");
        } else {
            eventTextField.setText("No bee selected.");
        }
        resultTextField.setText("");
        yesButton.setDisable(false);
        noButton.setDisable(true);
    }



    @FXML
    protected void yesButtonAction() {
        if (currentBee != null) {
            if (!eventHandled) {
                try {
                    String beeRole = currentBee.getRole().toLowerCase();
                    String result = actionsAndEvents.handleEvent(beeRole, true, currentEvent);

                    if (result != null && !result.isEmpty()) {
                        Platform.runLater(() -> {
                            if (resultTextField != null) {
                                resultTextField.setText(result);
                            }
                        });

                        if (result.contains("Game over")) {
                            navigateToEndView();
                        } else {
                            eventHandled = true;
                            noButton.setDisable(true);
                            eventTextField.setText("Press YES to continue.");
                        }
                    } else {
                        resultTextField.setText("No result generated.");
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    if (resultTextField != null) {
                        resultTextField.setText("Error handling event: " + e.getMessage());
                    }
                }
            } else {
                currentEvent = actionsAndEvents.generateEvent(currentBee.getRole().toLowerCase());
                if (currentEvent != null && !currentEvent.isEmpty()) {
                    eventTextField.setText(currentEvent);
                    resultTextField.setText("");
                    eventHandled = false;
                    noButton.setDisable(false);
                } else {
                    eventTextField.setText("Failed to generate an event. Try again.");
                }
            }
        }
    }

    @FXML
    protected void noButtonAction() {
        if (currentBee == null) {
            eventTextField.setText("No active event to handle!");
            return;
        }

        if (currentEvent == null || currentEvent.isEmpty()) {
            eventTextField.setText("No active event to handle!");
            return;
        }

        try {
            String beeRole = currentBee.getRole().toLowerCase();

            String result = actionsAndEvents.handleEvent(beeRole, false, currentEvent);

            if (result != null && !result.isEmpty()) {
                Platform.runLater(() -> {
                    if (resultTextField != null) {
                        resultTextField.setText(result);
                    }
                });

                if (result.contains("Game over")) {
                    navigateToEndView();
                } else {
                    eventHandled = true;
                    noButton.setDisable(true);
                    eventTextField.setText("Event handled. Press Yes for the next event.");
                }
            } else {
                resultTextField.setText("No result generated.");
            }
        } catch (Exception e) {
            e.printStackTrace();
            if (resultTextField != null) {
                resultTextField.setText("Error handling event: " + e.getMessage());
            }
        }
    }

    @FXML
    protected void speakerButtonAction(){
        String filePath = "/edu/miracosta/cs112/finalproject/finalproject/bee-flying.mp3";
        URL resourceUrl = getClass().getResource(filePath);
        if (resourceUrl != null) {
            Media media = new Media(resourceUrl.toExternalForm());
            MediaPlayer mediaPlayer = new MediaPlayer(media);
            mediaPlayer.play();
        } else {
            System.out.println("Media file not found: " + filePath);
        }
    }

    @FXML
    protected void initialize() {
        yesButton.setText("YES");
        noButton.setText("NO");
        displayInitialEvent();
        URL speakerURL = Application.class.getResource("/edu/miracosta/cs112/finalproject/finalproject/img_1.png");
        if (speakerURL != null) {
            speakerImageView.setImage(new Image(speakerURL.toString()));
        }
    }

    private String determineDeathReason(Bee bee) {
        if (bee.getTimeAlive() >= 7) {
            return "The bee lived a long and fulfilling life, eventually passing due to old age.";
        }
        if (bee.getLastEventResult().contains("Game over")) {
            return "The bee's journey came to an untimely end after making a poor decision during an event.";
        }
        return "The bee's journey came to an end, leaving behind a legacy in the hive.";
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