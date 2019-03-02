package sample;

import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;


public class Main extends Application implements EventHandler {

    //controls
    private Button rotateButton; //MUST be JavaFX!
    private Button blurButton;
    private Button scaleButton;

    private Rotate rotate; //This is from 'javafx.scene.transform.Rotate;'!!

    private double angle;

    @Override
    public void start(Stage primaryStage) throws Exception{

        primaryStage.setTitle("Effects and Transformation");//set stage title

        //instantiate button objects:
        rotateButton = new Button("Rotate");
        blurButton = new Button("Blur off");
        scaleButton = new Button("Scale");

        //instantiate rotate object (which has all the methods required for rotating an element):
        rotate = new Rotate();

        //register our buttons so they know what to implement. 'this' (as in this class), which implements from 'EventHandler'. Making it's 'handle' method work.
        rotateButton.setOnAction(this);
        blurButton.setOnAction(this);
        scaleButton.setOnAction(this);

        //initiate angle value:
        angle = 0.0;

        //create label control:
        Label reflect = new Label("Reflection adds Visual Sparkle");

        //Make root
        FlowPane root = new FlowPane(15, 15);
        root.setAlignment(Pos.CENTER); //align elements to the center of the FlowPane

        //add controls to root:
        root.getChildren().addAll(rotateButton, blurButton, scaleButton, reflect);

        //create scene and pass it the root
        Scene scene = new Scene(root, 300, 120); //root, width, height

        //add scene to stage
        primaryStage.setScene(scene);

        //show stage
        primaryStage.show();

        //Setup transformation: +++++++++++++++++
        rotateButton.getTransforms().add(rotate); //add rotate obj to rotateButton's 'getTransforms()'.

    }


    public static void main(String[] args) {

        launch(args); //launches fx app
    }

    @Override
    public void handle(Event event) {

        if (event.getSource().equals(rotateButton)){ //was rotateButton clicked
            System.out.println("Rotate button clicked");

            angle += 15.0; //add 15 to angle's value
            rotate.setAngle(angle); //pass new angle value into rotate object's 'setAngle'
            rotate.setPivotX(rotateButton.getWidth() /2); //get the width of the button an / by 2 to find its center, and use that as the 'PivotX' pivot point
            rotate.setPivotY(rotateButton.getHeight() /2); //get the height of the button an / by 2 to find its center, and use that as the 'PivotY' pivot point
        }
        if (event.getSource().equals(blurButton)){ //was blurButton clicked
            System.out.println("Blur button clicked");
        }
        if (event.getSource().equals(scaleButton)){ //was scaleButton clicked
            System.out.println("Scale button clicked");
        }
    }
}