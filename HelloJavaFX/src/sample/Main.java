package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


//++++++++++++++++++++++++++
//A JavaFX app has a 'Stage' (the main window). On top of that is a 'Scene', which contains root elements (such as a 'StackPane' or 'flowpane', which itself can contain another elements such as a 'Button').
//eg: Stage > Scene > Root (eg a FlowPane) > Element (eg a button)
//++++++++++++++++++++++++++

public class Main extends Application { //'Application' class gives the behaviours needed for the creation of an FX application

    private Label myLabel; //imported from 'FX' not awt!
    private TextField nameTextField; //imported from 'FX' not awt!

    @Override
    public void start(Stage primaryStage) throws Exception{

        //we have a stage being passed in above ('primaryStage')
        primaryStage.setTitle("I am a stage title!"); //set the stage title

        //Create a 'Button' control:
        Button myButton = new Button();///imported from 'FX' not awt!
        myButton.setText("Click me!");

        //give button an onAction event:
        myButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) { //'ActionEvent event' allows for the retrieval of all of the events of our action

                System.out.println("Button clicked!");
                String name = nameTextField.getText().trim(); //grab the text that was entered into the text field ('.trim' removes any unnecessary space characters).
                myLabel.setText(name); //change label text to what was typed in text field
                myButton.setText("I was clicked!");
            }
        });

        //instantiate label and TextField:
        myLabel = new Label();
        nameTextField = new TextField();

        //create label and textField text:
        myLabel.setText("This is a label");
        nameTextField.setPromptText("Enter Your Name"); //'setPromptText()' is text for prompting the user. (disappears after selection)

        //create a flowPane. This gives elements a flow layout.
        FlowPane flowPaneRoot = new FlowPane(10, 10); //passed horizontal and vertical gaps
        flowPaneRoot.setAlignment(Pos.CENTER); //set the alignment of the elements within the flowPane. '(Pos.CENTER)' centers these elements.

        //StackPane is a different type of root layout which stacks all elements on top of each other.
        //StackPane root = new StackPane();

        //add elements to the root:
        flowPaneRoot.getChildren().add(myButton); //add button
        flowPaneRoot.getChildren().add(myLabel);//add label
        flowPaneRoot.getChildren().add(nameTextField); //add text field prompt

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
