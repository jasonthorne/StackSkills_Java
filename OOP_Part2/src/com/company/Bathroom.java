package com.company;

public class Bathroom {

    private int size;

    private Bathtub myBathtub; //declare Bathtub object as private member var (creating HAS-A)

    //constructor which creates Bathtub object
    public Bathroom(int size) {
        this.size = size;
        myBathtub = new Bathtub(100); //instantiate bathtub object during Bathroom object creation
    }

    public int getTubSize(){
        return myBathtub.getSize();
    }

    public int getBathroomSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    //getter for bubble object
    public String getBubbleColour(){
        return myBathtub.getBubbleColour();
    }
}
