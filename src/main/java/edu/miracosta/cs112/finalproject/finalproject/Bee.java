package edu.miracosta.cs112.finalproject.finalproject;
public abstract class Bee {
    // Instance Variables
    public String name;
    public int sizeInCm;
    public String gender;
    public String role;
    public int timeAlive;
    private String lastEventResult;

    //Constructors
    //Default: sets the bee with no parameters
    public Bee(){
        this.name = "Unknown";
        this.sizeInCm = 0;
        this.gender = "Unknown";
        this.role = "Unknown";
        this.timeAlive = 0;
    }

    //Full: sets the bee with parameters
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
    public String getRole() {
        return role;
    }

    public int getTimeAlive() {
        return timeAlive;
    }

    public String getLastEventResult() {
        return lastEventResult;
    }

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
    public void setRole(String role) {
        this.role = role;
    }
    public void setTimeAlive(int timeAlive) {
        this.timeAlive = timeAlive;
    }
    public void setLastEventResult(String result) {
        this.lastEventResult = result;
    }

    // other methods
    public void incrementTimeAlive(){
        this.timeAlive++;
    }

    /**
     * method for type identification
     * @return the identity of the bee
     */
    public String getType() {
        return this.getClass().getSimpleName();
    }

    /**
     * puts together the toString of the type of
     * bee and the time they can live
     * @return the bee type and days time alive
     */
    public String toString() {
        return "Bee Type: " + getType() + ", Time Alive: " + timeAlive + " days";
    }

    /**
     * when the player dies it will return the
     * death status and the reason why they died
     * @return the result of last event
     */
    public String stats() {
        return "Last Event: " + (lastEventResult != null ? lastEventResult : "No events yet");
    }

    // abstract method

    /**
     *
     * @return
     */
    public abstract int getLifeSpan();


}
