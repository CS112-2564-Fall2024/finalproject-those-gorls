package edu.miracosta.cs112.finalproject.finalproject;

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
import java.net.URL;

public class EndViewController {

    @FXML
    private ImageView endScreenImage;
    @FXML
    private TextField titleTextField;
    @FXML
    private TextField summaryTextField;
    @FXML
    private Button restartButton;
    @FXML
    private ImageView beeImageView;

    public void displayBeeStats(Bee bee) {
        URL imageViewURL = Application.class.getResource("/edu/miracosta/cs112/finalproject/finalproject/img.png");
        if (imageViewURL != null) {
            endScreenImage.setImage(new Image(imageViewURL.toString()));
        }

        titleTextField.setText("Game Over: Bee Life of a " + bee.getType());

        String imageFilePath = "/edu/miracosta/cs112/finalproject/finalproject/" + bee.getType().toLowerCase() + ".png";
        URL beeImageURL = Application.class.getResource(imageFilePath);
        if (beeImageURL != null) {
            beeImageView.setImage(new Image(beeImageURL.toString()));
        }

        summaryTextField.setText(
                "Final Moments: " + bee.getLastEventResult() + MainViewController.determineDeathReason
        );

        restartButton.setText("Restart Game");
    }

//    private String determineDeathReason(Bee bee) {
//        String deathReason = bee.getLastEventResult();
//        if (deathReason == null || deathReason.isEmpty()) {
//            deathReason = "The cause of death is unknown.";
//        }
//        if (bee.getTimeAlive() >= 7) {
//            deathReason = "The bee lived a long and fulfilling life, eventually passing away from old age.";
//        }
//
//        return deathReason;
//    }

    @FXML
    private void restartGame() {
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