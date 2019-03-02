package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Orientation;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        //give stage a title:
        primaryStage.setTitle("my title");

        //create a root (flowpane in this case):
        FlowPane flowPaneRoot = new FlowPane(Orientation.VERTICAL, 5, 5); //orientation (if you want its elements to be vertically or horizontally oriented), horiz gap, vert gap.

        //create scene (with a height and width - IMPORTANT!!) and give it the root:
        Scene scene = new Scene(flowPaneRoot, 400, 250);

        //add scene to stage:
        primaryStage.setScene(scene);

        //show the stage (and its child elements)
        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
