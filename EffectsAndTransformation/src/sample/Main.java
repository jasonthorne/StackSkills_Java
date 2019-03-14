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
import javafx.scene.effect.BoxBlur;
import javafx.scene.effect.Reflection;
import javafx.scene.layout.FlowPane;
import javafx.scene.transform.Rotate;
import javafx.scene.transform.Scale;
import javafx.stage.Stage;


public class Main extends Application implements EventHandler {

    //controls
    private Button rotateButton; //MUST be JavaFX!
    private Button blurButton;
    private Button scaleButton;
    private Rotate rotate; //This is from 'javafx.scene.transform.Rotate;'!!
    private double angle;
    private double blurVal;
    private BoxBlur blur; //MUST BE JavaFX!!
    private double scaleFactor;
    private Scale scale; //MUST BE JavaFX!!
    private Reflection reflection; //MUST BE JavaFX!!



    @Override
    public void start(Stage primaryStage) throws Exception{

        primaryStage.setTitle("Effects and Transformation");//set stage title

        //instantiate button objects:
        rotateButton = new Button("Rotate");
        blurButton = new Button("Blur off");
        scaleButton = new Button("Scale");

        //instantiate rotate object (which has all the methods required for rotating an element):
        rotate = new Rotate();

        //instantiate blur object (which has all the methods required for blurring an element):
        blur = new BoxBlur(1.0, 1.0, 1); //width, height, iterations

        //register our buttons so they know what to implement. 'this' (as in this class), which implements from 'EventHandler'. Making it's 'handle' method work.
        rotateButton.setOnAction(this);
        blurButton.setOnAction(this);
        scaleButton.setOnAction(this);

        //initialise angle value:
        angle = 0.0;

        //initialise blur val:
        blurVal = 1.0;

       //initialise scaleFactor:
        scaleFactor = 0.4;

        //instantiate scale obj:
        scale = new Scale(scaleFactor, scaleFactor);

        //instantiate reflection object:
        reflection = new Reflection();


        //create label control:
        Label reflectLbl = new Label("Reflection adds Visual Sparkle");

        //Make root
        FlowPane root = new FlowPane(15, 15);
        root.setAlignment(Pos.CENTER); //align elements to the center of the FlowPane

        //add controls to root:
        root.getChildren().addAll(rotateButton, blurButton, scaleButton, reflectLbl);

        //create scene and pass it the root
        Scene scene = new Scene(root, 300, 120); //root, width, height

        //add scene to stage
        primaryStage.setScene(scene);

        //show stage
        primaryStage.show();

        //Setup transformations: +++++++++++++++++
        rotateButton.getTransforms().add(rotate); //add rotate obj to rotateButton's 'getTransforms()'.
        scaleButton.getTransforms().add(scale); //adding scaling effect from 'scale' object to our scaleButton

        //set up reflection properties
        reflection.setTopOpacity(0.7);
        reflection.setBottomOpacity(0.3);

        //use our label and apply the reflection effect:
        reflectLbl.setEffect(reflection);

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

            //each time button is pressed, it's blur is changed

            if (blurVal == 10.0){ //if blurVal is at this much
                blurVal = 1.0; //THEN reset its val
                blurButton.setEffect(null); //and reset the button
                blurButton.setText("Blur Off");
            }else{ //If blur value is any other number than 10:

                blurVal++; //increment blurVal
                blurButton.setEffect(blur); //set the buttons effect to be that of the Blur object, which is 'BlurBox'
                blurButton.setText("Blur on"); //tell user that blur is on
            }

            //change the blurBox effect properties equal to the blurVal (determined by how much the user has clicked the blur button)
            blur.setWidth(blurVal);
            blur.setHeight(blurVal);
        }
        if (event.getSource().equals(scaleButton)){ //was scaleButton clicked
            System.out.println("Scale button clicked");

            //increment scale factor:
            scaleFactor += 0.1;

            //reset scalefactor if it goes beyond 2.0:
            if(scaleFactor > 2.0) scaleFactor = 0.4; //IF brackets not needed as single line

            //reset scale object X and Y values:
            scale.setX(scaleFactor);
            scale.setY(scaleFactor);

        }
    }
}