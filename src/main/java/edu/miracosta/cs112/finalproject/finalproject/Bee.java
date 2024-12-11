package edu.miracosta.cs112.finalproject.finalproject;
public abstract class Bee {
    // Instance Variables
    public String name;
    public int sizeInCm;
    public String gender;
    public String role;
    public int timeAlive;
    private int eventCount = 0;
    private String lastEventResult;
    private String color;
    private String tasks;

    //Constructors


    public boolean hasReachedLifespan() {
        return eventCount >= 7;
    }
    //Default: sets the bee with no parameters
    public Bee(){
        this.name = "Unknown";
        this.sizeInCm = 0;
        this.gender = "Unknown";
        this.role = "Unknown";
        this.timeAlive = 0;
    }

    //Full: sets the bee with parameters
    public Bee(String name, int size, String gender, String role, int timeAlive, String color, String tasks ) {
        this.name = name;
        this.sizeInCm = size;
        this.gender = gender;
        this.role = role;
        this.timeAlive = timeAlive;
        this.color = color;
        this.tasks = tasks;
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
    public String getColor() {return color;}
    public String getTasks() {return tasks;}

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
        incrementEventCount();
    }
    public void setColor(String color) { this.color = color; }
    public void setTasks(String tasks) { this.tasks = tasks; }

    //Other Methods

    /**
     * This counts the amounts of events that
     * have gone through after clicking 'yes'
     * to go to the next event and ends the
     * game after seven events
     */
    public void incrementEventCount() {
        eventCount++;
    }
    /**
     * method for type of
     * bee identification
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
     * This is the abstract method that all
     * the children classes must have
     * @return they all return a different lifespan
     * depending on the type of bee
     */
    public abstract int getLifeSpan();

    /**
     * This is the inner class for Bee
     * it has all the constants for
     * every Bee that inherits from bee class
     */
    public class Constants {
        public static final String DRONE_NAME = "Drone Bee";
        public static final int DRONE_SIZE = 2;
        public static final String DRONE_GENDER = "Male";
        public static final int DRONE_LIFESPAN = 30;
        public static final String DRONE_COLOR = "Yellow";
        public static final String DRONE_TASKS = "\n-Mate with queen \n-Die";

        public static final String WORKER_NAME = "Worker Bee";
        public static final int WORKER_SIZE = 1;
        public static final String WORKER_GENDER = "Female";
        public static final int WORKER_LIFESPAN = 60;
        public static final String WORKER_COLOR = "Yellow";
        public static final String WORKER_TASKS = "\n-Take care of queen \n-Collect nectar \n-Collect Pollen \n-Nurse larvae \n-Feed drones \n-Protect hive";

        public static final String QUEEN_NAME = "Queen Bee";
        public static final int QUEEN_SIZE = 3;
        public static final String QUEEN_GENDER = "Female";
        public static final int QUEEN_LIFESPAN = 1825; // Approx. 5 years
        public static final String QUEEN_COLOR = "Orangish-yellow";
        public static final String QUEEN_TASKS = "\n-Lay eggs \n-Watch over hive \n-Eat";
    }
}
