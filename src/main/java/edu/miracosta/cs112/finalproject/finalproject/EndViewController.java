package edu.miracosta.cs112.finalproject.finalproject;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;

public class EndViewController {

    @FXML
    private ImageView beeImageView;
    @FXML
    private TextField beeInfoTextField;
    @FXML
    private Button restartButton;

    // Display bee stats when the game ends
    public void displayBeeStats(Bee bee) {
        // Display the bee's image (you can set the image file path based on the bee type)
        String imageFilePath = "images/" + bee.getType().toLowerCase() + ".png";  // Example path, adjust accordingly
        beeImageView.setImage(new Image(imageFilePath));

        // Display the bee's stats in a biography format
        beeInfoTextField.setText(bee.toString() + "\nTime Alive: " + bee.getTimeAlive() + " days");
    }

    @FXML
    private void restartGame() {
        // Restart the game, return to the start screen
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("start-view.fxml"));
            Parent root = loader.load();
            Stage stage = (Stage) restartButton.getScene().getWindow();
            Scene startScene = new Scene(root);
            stage.setScene(startScene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}