package edu.miracosta.cs112.finalproject.finalproject;

public class WorkerBeeActions extends Bee {

    public WorkerBeeActions() {
        super(Constants.WORKER_NAME, Constants.WORKER_SIZE, Constants.WORKER_GENDER, "Worker", 0);
    }

    @Override
    public String toString() {
        return "Bee Role: Worker\n Size: " + getSizeInCm() + " cm\n Gender: " + getGender();
    }

    @Override
    public int getLifeSpan() {
        return Constants.WORKER_LIFESPAN;
    }
    @Override
    public String stats(){
        return "Life span: " + getLifeSpan() + "\n Season: Spring";
    }
}

