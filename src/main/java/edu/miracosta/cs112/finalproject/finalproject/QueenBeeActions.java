package edu.miracosta.cs112.finalproject.finalproject;

public class QueenBeeActions extends Bee {

    public QueenBeeActions() {
        super(Constants.QUEEN_NAME, Constants.QUEEN_SIZE, Constants.QUEEN_GENDER, "Queen", 0);
    }

    @Override
    public String toString() {
        return "Bee Role: Queen\nSize: " + getSizeInCm() + " cm\nGender: " + getGender();
    }

    @Override
    public int lifeSpan() {
        return Constants.QUEEN_LIFESPAN;
    }
}

