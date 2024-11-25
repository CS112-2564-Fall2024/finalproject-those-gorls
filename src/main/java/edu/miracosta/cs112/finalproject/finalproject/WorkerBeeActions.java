package edu.miracosta.cs112.finalproject.finalproject;

import javafx.scene.control.TextField;

public class WorkerBeeActions extends Bee{

    protected final String name = "Worker";
    protected final int sizeInCm = 1;
    protected final String gender = "Female";

    @Override
    public String toString(){
        return name + "\n" + sizeInCm + "\n" + gender;
    }

    @Override
    public int lifeSpan(){
        return 0;
    }
}
