package com.jay.SwingDemo;

import javax.swing.*; //import all java 'swing' libraries from 'javax' package

public class SwingDemo {

    //class constructor (to be called in main)
    public SwingDemo(){

        //create new JFrame container object, and give it a title. Frame is part of a 'container class'
        JFrame jFrame = new JFrame("First Swing Application"); //passing in the title of the frame as string

        //Give the frame as size
        jFrame.setSize(270, 100); //width and height

        //Terminate the program when the user closes the application
        jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);

        //Create a JLabel
        JLabel jLabel = new JLabel("Here be a jLabel!");

        //add JLabel to JFrame
        jFrame.add(jLabel);

        //Show the frame
        jFrame.setVisible(true);

    }

    public static void main (String[] args){
        System.out.println("Yo");

        //create the frame on the event dispatching thread
        //'.invokeLater' ensures that there's no conflict between this and other running processes VERY IMPORTANT!!!
        SwingUtilities.invokeLater(new Runnable() { //enstatiating a new 'Runnable' class which is anonymous. IE runs immediately, no need to create, extantiate and THEN run it.
            @Override
            public void run() {

                new SwingDemo(); //instantiating swing demo class and directly calling its constructor
            }
        });





    }
}


