package edu.miracosta.cs112.finalproject.finalproject;

import javafx.scene.control.TextField;

public class WorkerBeeActions extends Bee{
    public WorkerBeeActions(){
        super(Constants.WORKER_NAME, Constants.WORKER_SIZE, Constants.WORKER_GENDER);
    }

    @Override
    public String toString() {
        return "Bee Role: Worker\n Size: " + getSizeInCm() + " cm\n Gender: " + getGender();
    }

    @Override
    public int lifeSpan() {
        return Constants.WORKER_LIFESPAN;
    }
    @Override
    public String stats(){
        return "Life span: " + lifeSpan() + "\n Season: Spring";
    }
}
