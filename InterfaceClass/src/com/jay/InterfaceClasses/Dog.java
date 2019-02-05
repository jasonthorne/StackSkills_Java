package com.jay.InterfaceClasses;

public class Dog extends Canine implements Pet {

    //Pets abstract methods MUST be implimented
    @Override
    public void beFriendly() {

        System.out.println("Friendly Dog");
    }

    @Override
    public void play() {

        System.out.println("Dog is playing");

    }

}
