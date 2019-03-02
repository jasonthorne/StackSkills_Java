package sample;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;



public class Main extends Application implements EventHandler { //Implementing 'EventHandler' inorder to use its 'Events'

    private Label titleLbl;//FX, NOT awt!! (and for rest below)
    private Label responseLbl;
    private Label selectedLbl;

    private CheckBox bananaCheckBox;
    private CheckBox mangoCheckBox;
    private CheckBox papayaCheckBox;
    private CheckBox grapefruitCheckBox;

    private String fruits;

    @Override
    public void start(Stage primaryStage) throws Exception{

        //give stage a title:
        primaryStage.setTitle("Favourite Fruit");

        //instantiate the labels AND set their text:
        titleLbl = new Label("What fruits do you like?");
        responseLbl = new Label("");
        selectedLbl = new Label("");

        //instantiate the checkboxes:
        bananaCheckBox = new CheckBox("Banana");
        mangoCheckBox = new CheckBox("Mango");
        papayaCheckBox = new CheckBox("Papaya");
        grapefruitCheckBox = new CheckBox("Grapefruit");

        //create a root (flowPane in this case):
        FlowPane flowPaneRoot = new FlowPane(Orientation.VERTICAL, 5, 5); //orientation (if you want its elements to be vertically or horizontally oriented), horiz gap, vert gap.
        flowPaneRoot.setAlignment(Pos.CENTER); //center the flowPane elements

        //Add all controls(elements) to the root:
        flowPaneRoot.getChildren().add(titleLbl);
        flowPaneRoot.getChildren().addAll(bananaCheckBox, mangoCheckBox, papayaCheckBox, grapefruitCheckBox, responseLbl, selectedLbl); //adding lots of controls at once (ORDER MATTERS!!)

        //+++++++++++++++++++++USING THESE AS 'EVENTHANDLER' IMPLEMENTED CLASS 'HANDLE' IS NOT WORKING!! +++++++++++++++++++++++++++++++++++++++++
        //Link to source:
        //http://www.java2s.com/Tutorials/Java/JavaFX/0440__JavaFX_Checkbox.htm

        //attach eventListeners to our checkboxes:
        bananaCheckBox.selectedProperty().addListener(new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {

                if (bananaCheckBox.isSelected()){ //if checkbox has been selected (had a tick added to it)
                    responseLbl.setText("Banana Selected");
                }else responseLbl.setText("Banana Cleared!"); //else, the tick has been removed

                showAll(); //call method to show all selected fruits
            }
        });

        mangoCheckBox.selectedProperty().addListener(new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {

                if (mangoCheckBox.isSelected()){ //if checkbox has been selected (had a tick added to it)
                    responseLbl.setText("Mango Selected");
                }else responseLbl.setText("Mango Cleared!"); //else, the tick has been removed

                showAll(); //call method to show all selected fruits
            }
        });

        papayaCheckBox.selectedProperty().addListener(new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {

                if (papayaCheckBox.isSelected()){ //if checkbox has been selected (had a tick added to it)
                    responseLbl.setText("Papaya Selected");
                }else responseLbl.setText("Papaya Cleared!"); //else, the tick has been removed

                showAll(); //call method to show all selected fruits
            }
        });

        grapefruitCheckBox.selectedProperty().addListener(new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {

                if (grapefruitCheckBox.isSelected()){ //if checkbox has been selected (had a tick added to it)
                    responseLbl.setText("Grapefruit Selected");
                }else responseLbl.setText("Grapefruit Cleared!"); //else, the tick has been removed

                showAll(); //call method to show all selected fruits
            }
        });

        //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++


        //create scene (with a height and width - IMPORTANT!!) and give it the root:
        Scene scene = new Scene(flowPaneRoot, 400, 250);

        //add scene to stage:
        primaryStage.setScene(scene);

        //show the stage (and its child elements)
        primaryStage.show();

        showAll(); //call method to show all selected fruits (none initially in this case)

    }

    public void showAll(){

        fruits = ""; //string to hold all fruits

        if(bananaCheckBox.isSelected()) fruits += " Banana"; //brackets not needed as only one line used
        if(mangoCheckBox.isSelected()) fruits += " Mango";
        if(papayaCheckBox.isSelected()) fruits += " Papaya";
        if(grapefruitCheckBox.isSelected()) fruits += " Grapefruit";

        selectedLbl.setText("Fruits selected: " + fruits);
    }

    public static void main(String[] args) {
        launch(args); //launches FX app
    }

    @Override
    public void handle(Event event) {
        System.out.println("hullo!??");
        Object fruitChecked = event.getSource(); //'fruitChecked' is made from the source of the object that's been clicked. (eg 'bananaCheckBox')

    }

    /*@Override
    //allows us to check which checkboxes have been selected.
    public void handle(Event event) { //'Event' object has all of the info about the item that's been selected. (a checkbox in this case)

        //Object means a generic object type
        Object fruitChecked = event.getSource(); //'fruitChecked' is made from the source of the object that's been clicked. (eg 'bananaCheckBox')

        if(bananaCheckBox.equals(fruitChecked)){ //if banana checkbox was clicked by user
            if (bananaCheckBox.isSelected()){ //if checkbox has been selected (had a tick added to it)
                responseLbl.setText("Banana Selected");
            }else responseLbl.setText("Banana Cleared!"); //else, the tick has been removed
        }

    }*/
}
