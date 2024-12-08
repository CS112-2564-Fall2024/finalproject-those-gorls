package edu.miracosta.cs112.finalproject.finalproject;

public class DroneBeeActions extends Bee {

    public DroneBeeActions() {
        super(Constants.DRONE_NAME, Constants.DRONE_SIZE, Constants.DRONE_GENDER, "Drone", 0);
    }

    @Override
    public String toString() {
        return "Bee  Role: Drone Size: " + getSizeInCm() + " cm Gender: " + getGender();
    }

    @Override
    public int getLifeSpan() {
        return Constants.DRONE_LIFESPAN;
    }
    @Override
    public String stats(){
        return "Life span: " + getLifeSpan() + "\n Season: Spring";
    }
}

