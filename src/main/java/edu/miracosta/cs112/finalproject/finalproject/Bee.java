package edu.miracosta.cs112.finalproject.finalproject;
public abstract class Bee {
    public String name;
    public int sizeInCm;
    public String gender;

    //Constructors
    public Bee(){

    }

    public Bee(String name, int size, String gender){
        this.name = name;
        this.sizeInCm = size;
        this.gender = gender;
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
    public abstract String toString();

    //other methods
    public abstract int lifeSpan();
    public abstract String stats();


}
