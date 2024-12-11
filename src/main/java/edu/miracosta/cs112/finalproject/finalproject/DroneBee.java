package edu.miracosta.cs112.finalproject.finalproject;

public class DroneBee extends Bee {

    public DroneBee() {
        super(Constants.DRONE_NAME, Constants.DRONE_SIZE, Constants.DRONE_GENDER, "drone", 0, Constants.DRONE_COLOR, Constants.DRONE_TASKS);
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
        return "Expected Life Span: " + getLifeSpan() + " days\n Primary color: " + getColor() + "\nUsual Tasks: " + getTasks();
    }
}

