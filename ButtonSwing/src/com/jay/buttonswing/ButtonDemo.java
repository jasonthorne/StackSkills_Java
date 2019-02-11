package com.jay.buttonswing;

import javax.swing.*;
import java.awt.*;

public class ButtonDemo {

    JLabel myLabel; //outside of constructor so we always have access to it, inorder to change it's value later.

    //class constructor
    public ButtonDemo(){

        System.out.println("Dawg!");

        //Create a jFrame
        JFrame jFrame = new JFrame("Button");

        //Specify the flow layout (manages how things are layed out in the frame) +++++
        jFrame.setLayout(new FlowLayout()); //creating a new FlowLayout obj and passing it as param immediately upon construction

        //give size to frame
        jFrame.setSize(500, 200);

        //ensure safe shutdown
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //create a button
        JButton myButton = new JButton("Here be a button!");
        JButton myButton2 = new JButton("Here be another button!");

        //add button to jFrame
        jFrame.add(myButton);
        jFrame.add(myButton2);

        //create a label
        myLabel = new JLabel("Im a label!");

        //add lable
        jFrame.add(myLabel);

        //Show jFrame
        jFrame.setVisible(true);

    }

    public static void main(String[] args){
        System.out.println("yo");

        //create jFrame on the event dispatching thread
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ButtonDemo();
            }
        });
    }
}
