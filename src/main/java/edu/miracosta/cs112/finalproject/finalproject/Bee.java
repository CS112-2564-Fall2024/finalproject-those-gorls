package edu.miracosta.cs112.finalproject.finalproject;
public abstract class Bee {
    public String name;
    public int sizeInCm;
    public String gender;

    //Constructors
    public Bee(){

    }

    /**
     * full contructer gets all the imnputs and then sets them
     * @param name bee's name
     * @param size bee's size
     * @param gender bee's gender
     */
    public Bee(String name, int size, String gender){
    this.name = name;
    this.gender = gender;
    this.sizeInCm = size;
    }
    //Getters

    /**
     * this getter gets the bee's name
     * @return name
     */
    public String getName(){
        return name;
    }
    /**
     * this getter gets the bee's size
     * @return size
     */
    public int getSizeInCm() {
        return sizeInCm;
    }
    /**
     * this getter gets the bee's gender
     * @return gender
     */
    public String getGender() {
        return gender;
    }
    //Setters
    /**
     * this setter gets the bee's name and then sets it
     * @return sets the name
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * this setter gets the bee's size and then sets it
     * @return sets the size
     */
    public void setSizeInCm(int sizeInCm) {
        this.sizeInCm = sizeInCm;
    }
    /**
     * this setter gets the bee's gender and then sets it
     * @return sets the gender
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     *
     * @return
     */
    public abstract String toString();

    //other methods
    public abstract int lifeSpan();


}
