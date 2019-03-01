package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


//++++++++++++++++++++++++++
//A JavaFX app has a 'Stage' (the main window). On top of that is a 'Scene', which contains root elements (such as a 'StackPane' or 'flowpane', which itself can contain another elements such as a 'Button').
//eg: Stage > Scene > FlowPane (a Root) > Button
//++++++++++++++++++++++++++

public class Main extends Application { //'Application' class gives the behaviours needed for the creation of an FX application

    private Label myLabel; //imported from 'FX' not awt!

    @Override
    public void start(Stage primaryStage) throws Exception{

        //we have a stage being passed above ('primaryStage')
        primaryStage.setTitle("I am a stage title!"); //set the stage title

        //Create a 'Button' control:
        Button myButton = new Button();//MUST be imported from 'javafx.scene.control.Button;' +++++++++++++++++IMPORTANT!
        myButton.setText("Click me!");

        //give button an onAction event:
        myButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) { //'ActionEvent event' allows for the retrieval of all of the events of our action

                System.out.println("Button clicked!");
                myLabel.setText("Button clicked :P");
            }
        });

        //instantiate labels:
        myLabel = new Label();


        //create labels text:
        myLabel.setText("This is a label");


        //create a flowPane. This gives elements a flow layout.
        FlowPane flowPaneRoot = new FlowPane(10, 10); //passed horizontal and vertical gaps
        flowPaneRoot.setAlignment(Pos.CENTER); //set the alignment of the elements within the flowPane. '(Pos.CENTER)' centers these elements.

        //StackPane is a different type of root layout which stacks all elements on top of each other.
        //StackPane root = new StackPane();

        //add elements to StackPane:
        flowPaneRoot.getChildren().add(myButton); //add button
        flowPaneRoot.getChildren().add(myLabel);//add label

        //create our scene, and add our Root to it:
        Scene scene = new Scene(flowPaneRoot, 250, 200); //needs to be passed a root (in this case a 'StackPane'). (root, width, height)

        //Add scene to stage:
        primaryStage.setScene(scene);

        //show the stage on our user interface:
        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args); //this launches the app!
    }
}
