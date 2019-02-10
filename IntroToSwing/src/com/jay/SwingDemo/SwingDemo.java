package com.jay.SwingDemo;

import javax.swing.*; //import all java 'swing' libraries from 'javax' package

public class SwingDemo {

    //class constructor (to be called in main)
    public SwingDemo(){

        //create new JFrame container object. Frame is part of a 'container class'
        JFrame jFrame = new JFrame("First Swing Application"); //passing in the title of the frame as string

        //Give the frame as size
        jFrame.setSize(270, 100); //width and height

        //Terminate the program when the user closes the application
        jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);

    }

    public static void main (String[] args){
        System.out.println("Yo");



    }
}


