package com.jay.textfield;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextField implements ActionListener {

    JTextField jTextField;
    JButton reverseButton;
    JLabel promptLabel;
    JLabel contentLabel;


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
         jTextField = new JTextField(10); //'10' is colum width

        jTextField.setActionCommand("Text Field"); //?String allows us to see which action has been triggered

        //create a button
        reverseButton = new JButton("Reverse");

        //Add action listeners ++++++++++++++++++++++Both of these are now connected and ready to recieve actions
        jTextField.addActionListener(this); //Implemented ActionListener for this (so we can pass this object itself into 'addActionListener')
        reverseButton.addActionListener(this);

        //create labels
        promptLabel = new JLabel("Enter text:");
        contentLabel = new JLabel("");

        //ADD stuff to frame
        jFrame.add(promptLabel);
        jFrame.add(jTextField);
        jFrame.add(reverseButton);
        jFrame.add(contentLabel);


        //set frame to visible
        jFrame.setVisible(true);


    }

    @Override //Implimented method from ActionListener
    // ++++++++object 'e' contains all of the functions needed to control and see which action has currently happened
    public void actionPerformed(ActionEvent e) {

        if (e.getActionCommand().equals("Reverse")){ //If reverse button has been clicked

            //reverse the string logic
            String originalString = jTextField.getText(); //whatever was entered into textfield is stored
            String tempString = "";

            for (int i = originalString.length() -1; i >=0 ; i--) {

                tempString += originalString.charAt(i);

                contentLabel.setText(tempString);
            }


        }else{ //Then it was from "Text Field"

            contentLabel.setText("You pressed 'enter'. Text is: " + jTextField.getText());
        }

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
