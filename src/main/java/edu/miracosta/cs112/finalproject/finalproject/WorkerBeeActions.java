package edu.miracosta.cs112.finalproject.finalproject;

public class WorkerBeeActions extends Bee {

    public WorkerBeeActions() {
        super(Constants.WORKER_NAME, Constants.WORKER_SIZE, Constants.WORKER_GENDER, "Worker", 0);
    }

    @Override
    public String toString() {
        return "Bee Role: Worker\nSize: " + getSizeInCm() + " cm\nGender: " + getGender();
    }

    @Override
    public int lifeSpan() {
        return Constants.WORKER_LIFESPAN;
    }
}

