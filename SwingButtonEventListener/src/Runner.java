import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Runner {

    public Runner() {

        //create a Jframe
        JFrame jFrame = new JFrame("My JFrame");

        //specify flow layout
        jFrame.setLayout(new FlowLayout());

        //give a size
        jFrame.setSize(220,80);

        //gracefully close
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Make buttons
        JButton upButton = new JButton("Up");
        JButton downButton = new JButton("Down");

        //Add event listeners for buttons ++++++++++++++++++++
        upButton.addActionListener(new ActionListener() { //Passing in an anonymous new instance of an ActionListener object (NEEDED!)
            @Override
            public void actionPerformed(ActionEvent e) { //This is ActionListener's abstract method which needs overriding.

                System.out.println("'Up' was pressed");
            }
        });

        downButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("'Down' was pressed");
            }
        });



        //make label
        JLabel jLabel = new JLabel("My label");

        //add elements to jFrame
        jFrame.add(jLabel);
        jFrame.add(upButton);
        jFrame.add(downButton);


        //Display jFrame
        jFrame.setVisible(true);

    }


    public static void main(String[] args){
        System.out.println("yo");

        //create the frame on the event dispatching thread
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Runner();

            }
        });

    }


}
