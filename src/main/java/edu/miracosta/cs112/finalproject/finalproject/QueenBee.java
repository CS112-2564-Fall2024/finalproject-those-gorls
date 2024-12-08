package edu.miracosta.cs112.finalproject.finalproject;

public class QueenBee extends Bee {

    public QueenBee() {
        super(Constants.QUEEN_NAME, Constants.QUEEN_SIZE, Constants.QUEEN_GENDER, "Queen", 0);
    }

    @Override
    public String toString(){
        return "Bee Role: " + getRole() + "\n Size: " + getSizeInCm() + " cm\n Gender: " + getGender();
    }

    @Override
    public int getLifeSpan() {
        return Constants.QUEEN_LIFESPAN;
    }
    @Override
    public String stats(){
        return "Life span: " + getLifeSpan() + " months\n Season: Spring";
    }
}
