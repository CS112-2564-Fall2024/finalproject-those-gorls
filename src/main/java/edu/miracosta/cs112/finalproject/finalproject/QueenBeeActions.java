package edu.miracosta.cs112.finalproject.finalproject;

public class QueenBeeActions extends Bee {

    public QueenBeeActions() {
        super(Constants.QUEEN_NAME, Constants.QUEEN_SIZE, Constants.QUEEN_GENDER, "Queen", 0);
    }

    @Override
    public String toString(){
        return "Bee Role: Queen\n Size: " + getSizeInCm() + " cm\n Gender: " + getGender();
    }

    @Override
    public int getlifeSpan() {
        return Constants.QUEEN_LIFESPAN;
    }
    @Override
    public String stats(){
        return "Life span: " + lifeSpan() + "\n Season: Spring";
    }



}
