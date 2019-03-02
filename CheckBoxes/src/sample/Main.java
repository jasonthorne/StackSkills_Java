package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Main extends Application {

    private Label titleLbl;//FX, NOT awt!!
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
        bananaCheckBox = new CheckBox("banana");
        mangoCheckBox = new CheckBox("mango");
        papayaCheckBox = new CheckBox("papaya");
        grapefruitCheckBox = new CheckBox("grapefruit");

        //create a root (flowPane in this case):
        FlowPane flowPaneRoot = new FlowPane(Orientation.VERTICAL, 5, 5); //orientation (if you want its elements to be vertically or horizontally oriented), horiz gap, vert gap.
        flowPaneRoot.setAlignment(Pos.CENTER); //center the flowPane elements

        //Add all controls(elements) to the root:
        flowPaneRoot.getChildren().add(titleLbl);
        flowPaneRoot.getChildren().addAll(bananaCheckBox, mangoCheckBox, papayaCheckBox, grapefruitCheckBox, responseLbl, selectedLbl); //adding lots of controls at once (ORDER MATTERS!!)

        //create scene (with a height and width - IMPORTANT!!) and give it the root:
        Scene scene = new Scene(flowPaneRoot, 400, 250);

        //add scene to stage:
        primaryStage.setScene(scene);

        //show the stage (and its child elements)
        primaryStage.show();

        showAll();

    }

    public void showAll(){

        fruits = "";
    }

    public static void main(String[] args) {
        launch(args); //launches FX app
    }
}
