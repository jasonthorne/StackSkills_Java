package com.jay.textfield;

import javax.swing.*;
import java.awt.*;

public class TextField {

    //class constructor
    public TextField(){

        //create jFrame
        JFrame jFrame = new JFrame("Enter text");

        //set flow layout
        jFrame.setLayout(new FlowLayout());

        //give it a size
        jFrame.setSize(250,120);

        //gracefully shutdown (kill prog on x)
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //create textField
        JTextField jTextField = new JTextField(10); //'10' is colum width

        //ADD TEXTFIELD TO FRAME!!
        jFrame.add(jTextField);

        //set frame to visible
        jFrame.setVisible(true);


    }

    public static void main(String[] args){

        //create the frame on the event dispatching thread
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TextField(); //ccreate obj by calling constructor
            }
        });

    }
}
