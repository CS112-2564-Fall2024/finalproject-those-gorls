package edu.miracosta.cs112.finalproject.finalproject;

public class DroneBee extends Bee {

    public DroneBee() {
        super(Constants.DRONE_NAME, Constants.DRONE_SIZE, Constants.DRONE_GENDER, "Drone", 0);
    }

    @Override
    public String toString() {
        return "Bee  Role: "+ getRole() + "\nDrone Size: " + getSizeInCm() + " cm \nGender: " + getGender();
    }

    @Override
    public int getLifeSpan() {
        return Constants.DRONE_LIFESPAN;
    }
    @Override
    public String stats(){
        return "Life span: " + getLifeSpan() + " days\n Season: Spring";
    }
}

