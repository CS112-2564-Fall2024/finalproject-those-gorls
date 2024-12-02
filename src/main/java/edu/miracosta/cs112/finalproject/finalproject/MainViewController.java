package edu.miracosta.cs112.finalproject.finalproject;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MainViewController {
    @FXML
    private TextField eventTextField;
    @FXML
    public TextField beeInfoLeft;
    //Bee newBee;
//      <ImageView fx:id="mainScreenImage" fitHeight="329.0" fitWidth="519.0" layoutX="14.0" layoutY="14.0" pickOnBounds="true" preserveRatio="true" />
//      <ImageView fx:id="speakerImageView" fitHeight="68.0" fitWidth="71.0" layoutX="462.0" layoutY="272.0" pickOnBounds="true" preserveRatio="true" />
//      <Button fx:id="speakerButton" layoutX="462.0" layoutY="272.0" mnemonicParsing="false" onAction="#speakerButtonAction" opacity="0.01" prefHeight="68.0" prefWidth="71.0" text="Button" />
//      <TextField fx:id="eventTextField" alignment="CENTER" layoutX="14.0" layoutY="352.0" prefHeight="143.0" prefWidth="512.0" text="mainTextField" />
//      <Button fx:id="yesButton" layoutX="14.0" layoutY="510.0" mnemonicParsing="false" onAction="#yesButtonAction" prefHeight="68.0" prefWidth="230.0" text="yesButton" />
//      <Button fx:id="noButton" layoutX="303.0" layoutY="510.0" mnemonicParsing="false" onAction="#noButtonAction" prefHeight="68.0" prefWidth="230.0" text="noButton" />
//      <TextField fx:id="beeInfoLeft" alignment="TOP_LEFT" layoutX="14.0" layoutY="593.0" prefHeight="68.0" prefWidth="264.0" text="beeInfo" />
//      <TextField fx:id="beeInfoRight" alignment="TOP_LEFT" layoutX="303.0" layoutY="593.0" prefHeight="68.0" prefWidth="230.0" text="beeStats" />

    @FXML
    public void setBee(Bee newBee){
        beeInfoLeft.setText(newBee.toString());

    }


    @FXML
    protected void yesButtonAction() {
        eventTextField.setText("Welcome to JavaFX Application!");

    }

    @FXML
    protected void noButtonAction(){}


    @FXML
    protected void speakerButtonAction(){

    }

    @FXML
    protected void initialize(){
        eventTextField.setText("Congratulations on being born!!\n Click yes to start working");


    }
}