package com.company;

public class Main {

    public static final int JERRY = 1;
    public static final int BOBBY = 2;
    public static final int LARRY = 3;

    //Enums = enumerations
    public enum Members {JERRY, BOBBY, LARRY} //created enum
    public static Members selectedPerson; //create 'selectedPerson' object from type 'Members', which is our enum


    public static void main(String[] args){

        selectedPerson = Members.BOBBY; //+++ selectedPerson can ONLY ever hold one of the enum values as its an object created from the 'Members' enum.


        if (selectedPerson.equals(Members.BOBBY)){
            System.out.println("Bobby!");
        }
        if (selectedPerson.equals(Members.JERRY)){
            System.out.println("Jerry!");
        }
    }
}

