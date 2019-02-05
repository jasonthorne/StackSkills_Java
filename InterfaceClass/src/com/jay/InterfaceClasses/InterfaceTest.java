package com.jay.InterfaceClasses;

public class InterfaceTest {

    public static void main(String[] args){



        Dog myDog = new Dog();
        myDog.setName("Jiff");

        System.out.println(myDog.getName());

        myDog.beFriendly();
        myDog.play();

    }

    /*
    Animal > Canine > Dog

     */

}
