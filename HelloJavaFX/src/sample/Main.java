package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;




//++++++++++++++++++++++++++
//A JavaFX app has a 'Stage' (the main window). On top of that is a 'Scene', which contains root elements (such as a 'StackPane', which itself can contain another elements such as a 'Button').
//eg: Stage > Scene > Root (eg a StackPane) > Button

public class Main extends Application { //'Application' class gives the behaviours needed for the creation of an FX application

    @Override
    public void start(Stage primaryStage) throws Exception{

        //we have a stage being passed above ('primaryStage')
        primaryStage.setTitle("I am a stage title!"); //set the stage title

        Button myButton = new Button();//MUST be imported from 'javafx.scene.control.Button;' +++++++++++++++++IMPORTANT!
        myButton.setText("Click me!");

        //give button an onAction event:
        myButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) { //'ActionEvent event' allows for the retrieval of all of the events of our action

                System.out.println("Button clicked!");
            }
        });

        //create stackPane:
        StackPane root = new StackPane();

        //add Button to StackPane:
        root.getChildren().add(myButton);

        //create our scene, and add our Root to it:
        Scene scene = new Scene(root, 250, 200); //needs to be passed a root (in this case a 'StackPane'). (root, width, height)

        //Add scene to stage:
        primaryStage.setScene(scene);

        //show the stage on our user interface:
        primaryStage.show();


    }


    public static void main(String[] args) {
        launch(args); //this launches the app!
    }
}
