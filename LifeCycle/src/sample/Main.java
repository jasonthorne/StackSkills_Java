package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        primaryStage.setTitle("Life Cycle");//set stage title

        //Make root
        FlowPane root = new FlowPane(Orientation.VERTICAL, 5, 5); //'Vertical' stacks elements vertically
        root.setAlignment(Pos.CENTER); //align elements to the center of the FlowPane

        //create scene and pass it the root
        Scene scene = new Scene(root, 700, 400); //root, width, height

        //add scene to stage
        primaryStage.setScene(scene);

        //show stage
        primaryStage.show();;

    }


    public static void main(String[] args) {

        launch(args); //launches fx app
    }
}
