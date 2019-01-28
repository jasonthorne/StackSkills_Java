package com.company;

public class Bathtub {

    private int tubSize;
    //private Bathtub bathtub;
    private Bubble b; //Composition (HAS-A)

    //constructor which creates new (HAS-A) bubble object.
    public Bathtub(int size){
        this.tubSize = size;
        b = new Bubble();
        b.setColour("Blue");
        b.setRadius(23);
    }

    //getter for bubble object
    public String getBubbleColour(){
        return b.getColour();
    }

    public int getSize() {
        return tubSize;
    }

    public void setSize(int size) {
        this.tubSize = size;
    }
}
