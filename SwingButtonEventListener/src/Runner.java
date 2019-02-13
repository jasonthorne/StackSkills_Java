import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Runner implements ActionListener{

    JLabel jLabel;

    public Runner() {

        //create a Jframe
        JFrame jFrame = new JFrame("My JFrame");

        //specify flow layout
        jFrame.setLayout(new FlowLayout());

        //give a size
        jFrame.setSize(400,200);

        //gracefully close
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Make buttons
        JButton upButton = new JButton("Up");
        JButton downButton = new JButton("Down");

        //make label
        jLabel = new JLabel("Press a button");

        /*
        //Add event listeners for buttons +++++++++++++++++++THIS FOR WHEN NOT IMPLEMENTING ACTIONLISTENER IN RUNNER CLASS (declared above. line 6)
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
        */

        //Add event listeners after implementing ActionListener (line 6)++++++++++++
        upButton.addActionListener(this); //this means 'this' current object (which IS-A ActionListener)
        downButton.addActionListener(this);


        //add elements to jFrame
        jFrame.add(jLabel);
        jFrame.add(upButton);
        jFrame.add(downButton);


        //Display jFrame
        jFrame.setVisible(true);

    }

    @Override //From 'ActionListener' which this class is implementing
    public void actionPerformed(ActionEvent e) { //Action event 'e' can access every event which happens

        if (e.getActionCommand().equals("Up")){ //'getActionCommand' returns the command string associated with its action
            System.out.println("Up was pressed");
            jLabel.setText("You pressed up!!");

        }else{
            System.out.println("Down button was pressed");
            jLabel.setText("You pressed Down!!");
        }
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
