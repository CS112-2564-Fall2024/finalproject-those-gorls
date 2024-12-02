package edu.miracosta.cs112.finalproject.finalproject;

import javafx.scene.control.TextField;

public class WorkerBeeActions extends Bee{

    protected final String NAME = "Worker";
    protected final int SIZEINCM = 1;
    protected final String GENDER = "Female";


    public WorkerBeeActions(){
        super.setName(NAME);
        super.setSizeInCm(SIZEINCM);
        super.setGender(GENDER);

    }

    @Override
    public String toString(){
        return "Worker\n Size: 1cm\n Gender: Female";
    }

    @Override
    public int lifeSpan(){
        return 0;
    }
}
