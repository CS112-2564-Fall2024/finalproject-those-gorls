package edu.miracosta.cs112.finalproject.finalproject;

public class QueenBee extends Bee {

    public QueenBee() {
        super(Constants.QUEEN_NAME, Constants.QUEEN_SIZE, Constants.QUEEN_GENDER, "queen", 0, Constants.QUEEN_COLOR, Constants.QUEEN_TASKS);
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
        return "Expected Life Span: " + getLifeSpan() + " days\n Primary color: " + getColor() + "\nUsual Tasks: " + getTasks();
    }
}
