package com.company;

public class Main {

    public static void main(String[] args){
       // System.out.println("Sup world!");

        //Bathtub myTub = new Bathtub(13); //int needed for constructor

        //showing info from tub and bubble objects
       // System.out.println(myTub.getSize() + " " + myTub.getBubbleColour());

        Bathroom myBathroom = new Bathroom(500);

        System.out.println("Bathroom size: " + myBathroom.getBathroomSize() + "\nBathtub Size: " + myBathroom.getTubSize()
        + "\nBubble Colour: " + myBathroom.getBubbleColour());


    }
}
