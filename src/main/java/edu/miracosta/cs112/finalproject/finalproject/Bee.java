package edu.miracosta.cs112.finalproject.finalproject;
public abstract class Bee {
    public String name;
    public int sizeInCm;
    public String gender;

    //Constructors
    public Bee(){

    }

    public Bee(String name, int size, String gender){

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

    //toString
    public abstract String toString(String name, int sizeInCm, String gender);

    //other methods
    public abstract int lifeSpan();


}
