package edu.miracosta.cs112.finalproject.finalproject;
public abstract class Bee {
    public String name;
    public int sizeInCm;
    public String gender;
    public String role;
    public int timeAlive;

    //Constructors
    public Bee(){
        this.name = "Unknown";
        this.sizeInCm = 0;
        this.gender = "Unknown";
        this.role = "Unknown";
        this.timeAlive = 0;
    }

    public Bee(String name, int size, String gender, String role, int timeAlive){
        this.name = name;
        this.sizeInCm = size;
        this.gender = gender;
        this.role = role;
        this.timeAlive = timeAlive;
    }
    //Getters
    public String getName(){
        return name;
    }
    public int getSizeInCm() {
        return sizeInCm;
    }
    public String getGender() {
        return gender;
    }
    public String getRole() { return role; }
    public int getTimeAlive() { return timeAlive; }
    //Setters
    public void setName(String name) {
        this.name = name;
    }
    public void setSizeInCm(int sizeInCm) {
        this.sizeInCm = sizeInCm;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public void setRole(String role) { this.role = role; }
    public void setTimeAlive(int timeAlive) { this.timeAlive = timeAlive; }

    public void incrementTimeAlive(){
        this.timeAlive++;
    }

    // abstract methods
    public abstract String toString();
    public abstract int getLifeSpan();

    public abstract int getlifeSpan();

    public abstract String stats();

    // method for type identification
    public String getType() {
        return this.getClass().getSimpleName();
    }
}
