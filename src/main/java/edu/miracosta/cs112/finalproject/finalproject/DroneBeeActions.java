package edu.miracosta.cs112.finalproject.finalproject;

public class DroneBeeActions extends Bee{
    public DroneBeeActions() {
        super(Constants.DRONE_NAME, Constants.DRONE_SIZE, Constants.DRONE_GENDER);    }

    @Override
    public String toString() {
        return "Bee  Role: Drone\nSize: " + getSizeInCm() + " cm\nGender: " + getGender();
    }

    @Override
    public int lifeSpan() {
        return Constants.DRONE_LIFESPAN;
    }
}

