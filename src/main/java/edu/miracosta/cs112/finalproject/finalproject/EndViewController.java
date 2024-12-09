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
        URL imageViewURL = Application.class.getResource("/edu/miracosta/cs112/finalproject/finalproject/end_screen.png");
        if (imageViewURL != null) {
            endScreenImage.setImage(new Image(imageViewURL.toString()));
        }

        titleTextField.setText("Game Over: Bee Life of a " + bee.getType());

        String imageFilePath = "/edu/miracosta/cs112/finalproject/finalproject/" + bee.getType().toLowerCase() + "_end.png";
        URL beeImageURL = Application.class.getResource(imageFilePath);
        if (beeImageURL != null) {
            beeImageView.setImage(new Image(beeImageURL.toString()));
        }

        String deathReason = determineDeathReason(bee);
        summaryTextField.setText(
                "Final Moments: " + bee.getLastEventResult() + "\n" + deathReason
        );

        restartButton.setText("Restart Game");
    }

    private String determineDeathReason(Bee bee) {
        if (bee.getTimeAlive() >= 7) {
            return "The bee lived a long and fulfilling life, eventually passing away from old age.";
        }

        String lastEvent = bee.getLastEventResult();
        if (lastEvent.contains("Game over")) {
            switch (bee.getType().toLowerCase()) {
                case "worker":
                    if (lastEvent.contains("fly swatter")) return "The bee's curiosity led to an unfortunate encounter with a fly swatter.";
                    if (lastEvent.contains("stinger")) return "The bee heroically defended the hive, sacrificing its life by stinging a bear.";
                    if (lastEvent.contains("raindrop")) return "The bee was caught in a sudden rainstorm and couldn't survive.";
                    break;
                case "drone":
                    if (lastEvent.contains("treason")) return "The bee was publicly executed for attempting to steal nectar.";
                    if (lastEvent.contains("tricycle")) return "The bee's adventure outside the hive was cut short by an unexpected vehicle.";
                    if (lastEvent.contains("queen")) return "The bee was publicly executed for disrespecting the queen.";
                    break;
                case "queen":
                    if (lastEvent.contains("poisoned")) return "The queen was betrayed by her own servant.";
                    if (lastEvent.contains("revolt")) return "The queen lost the trust of her subjects and was overthrown.";
                    break;
            }
            return "The bee's journey came to an untimely end during a critical moment.";
        }

        return "The bee's journey came to an end, leaving behind a legacy in the hive.";
    }

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