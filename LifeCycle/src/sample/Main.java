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

    //THE JAVA APPLICATION LIFECYCLE COMPRISES OF 3 MAIN FUNCTIONS:
    //init(), start() and then stop() (stop is called when the application exits)

    @Override
    public void start(Stage primaryStage) throws Exception{

        //Start+++++++++++++++++++++++++++++++++++++++++++++SECOND CALLED
        System.out.println("Start begins");

        primaryStage.setTitle("Life Cycle");//set stage title

        //Make root
        FlowPane root = new FlowPane(Orientation.VERTICAL, 5, 5); //'Vertical' stacks elements vertically
        root.setAlignment(Pos.CENTER); //align elements to the center of the FlowPane

        //create scene and pass it the root
        Scene scene = new Scene(root, 700, 400); //root, width, height

        //add scene to stage
        primaryStage.setScene(scene);

        //show stage
        primaryStage.show();

    }


    //init+++++++++++++++++++++++++++++++++++++++++++++FIRST CALLED
    @Override
    public void init()throws Exception{ //This comes from our parent class 'Application'
       super.init();
        System.out.println("Init begins");
    }

    //stop+++++++++++++++++++++++++++++++++++++++++++++THIRD CALLED
    @Override
    public void stop() throws Exception{ //This comes from our parent class 'Application'
        super.stop();
        System.out.println("Stop invoked");
    }

    public static void main(String[] args) {

        launch(args); //launches fx app
    }
}
