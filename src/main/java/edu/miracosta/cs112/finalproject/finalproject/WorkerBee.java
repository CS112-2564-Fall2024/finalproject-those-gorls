package edu.miracosta.cs112.finalproject.finalproject;

public class WorkerBee extends Bee {

    public WorkerBee() {
        super(Constants.WORKER_NAME, Constants.WORKER_SIZE, Constants.WORKER_GENDER, "worker", 0, Constants.WORKER_COLOR, Constants.WORKER_TASKS);
    }

    @Override
    public String toString() {
        return "Bee Role: " + getRole() + "\n Size: " + getSizeInCm() + " cm\n Gender: " + getGender();
    }

    @Override
    public int getLifeSpan() {
        return Constants.WORKER_LIFESPAN;
    }
    @Override
    public String stats(){
        return "Expected Life Span: " + getLifeSpan() + " days\n Primary color: " + getColor() + "\nUsual Tasks: " + getTasks();
    }
}

