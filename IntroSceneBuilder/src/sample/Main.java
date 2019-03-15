package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        //++++Parent root is calling the FXMlLoader class. invoking its 'load' method, and passsing in the resource file that we want to load into our view (sample.fxml).
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml")); //root is now our sample.fxml
        primaryStage.setTitle("Hello sexy");
        primaryStage.setScene(new Scene(root, 700, 400)); //instantiating  an anonymous new Scene object, pasing it the root, width & height. Then adding that scene to the stage.
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
