package edu.miracosta.cs112.finalproject.finalproject;

public class DroneBeeActions extends Bee{
    public DroneBeeActions() {
        super("Drone Bee", 2, "Male");
    }

    @Override
    public String toString() {
        return "Bee  Role: Drone\nSize: " + getSizeInCm() + " cm\nGender: " + getGender();
    }

    @Override
    public int lifeSpan() {
        return 30; //days
    }
}

